/* ij - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class ij extends qc
{
    private ProxySelector f = ProxySelector.getDefault();
    static Class g;
    static Class h;
    
    private final Socket httpProxyConnect
	(String string, int i, String string_0_) throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_0_)
	    outputstream.write(("CONNECT " + ((ij) this).b + ":"
				+ ((ij) this).d + " HTTP/1.0\n\n")
				   .getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(("CONNECT " + ((ij) this).b + ":"
				+ ((ij) this).d + " HTTP/1.0\n" + string_0_
				+ "\n\n")
				   .getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_1_ = bufferedreader.readLine();
	if (null != string_1_) {
	    if (string_1_.startsWith("HTTP/1.0 200")
		|| string_1_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_1_.startsWith("HTTP/1.0 407")
		|| string_1_.startsWith("HTTP/1.1 407")) {
		int i_2_ = 0;
		string_1_ = bufferedreader.readLine();
		String string_3_ = "proxy-authenticate: ";
		for (/**/; string_1_ != null && 50 > i_2_; i_2_++) {
		    if (string_1_.toLowerCase().startsWith(string_3_)) {
			string_1_
			    = string_1_.substring(string_3_.length()).trim();
			int i_4_ = string_1_.indexOf(' ');
			if ((i_4_ ^ 0xffffffff) != 0)
			    string_1_ = string_1_.substring(0, i_4_);
			throw new dm(string_1_);
		    }
		    string_1_ = bufferedreader.readLine();
		}
		throw new dm("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    final Socket b(int i) throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (i >= -116)
	    return null;
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_5_ = ((ij) this).d == 443;
	List list;
	List list_6_;
	try {
	    list = f.select(new URI((!bool_5_ ? "http" : "https") + "://"
				    + ((ij) this).b));
	    list_6_ = f.select(new URI((bool_5_ ? "http" : "https") + "://"
				       + ((ij) this).b));
	} catch (URISyntaxException urisyntaxexception) {
	    return this.a(false);
	}
	list.addAll(list_6_);
	Object[] objects = list.toArray();
	dm var_dm = null;
	Object[] objects_7_ = objects;
	for (int i_8_ = 0; objects_7_.length > i_8_; i_8_++) {
	    Object object = objects_7_[i_8_];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_9_ = a((byte) -11, proxy);
		if (null == socket_9_)
		    continue;
		socket = socket_9_;
	    } catch (dm var_dm_10_) {
		var_dm = var_dm_10_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (var_dm != null)
	    throw var_dm;
	return this.a(false);
    }
    
    private final Socket a(byte i, Proxy proxy) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return this.a(false);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	int i_11_ = -73 % ((-62 - i) / 48);
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() != Proxy.Type.HTTP) {
	    if (proxy.type() == Proxy.Type.SOCKS) {
		Socket socket = new Socket(proxy);
		socket.connect(new InetSocketAddress(((ij) this).b,
						     ((ij) this).d));
		return socket;
	    }
	} else {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method = (var_class.getDeclaredMethod
				 ("getProxyAuth",
				  (new Class[]
				   { g == null ? g = a("java.lang.String") : g,
				     Integer.TYPE })));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (object != null) {
		    Method method_12_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_12_.setAccessible(true);
		    if (((Boolean) method_12_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_13_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_13_.setAccessible(true);
			Method method_14_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				(new Class[]
				 { h == null ? h = a("java.net.URL") : h,
				   (g == null ? g = a("java.lang.String")
				    : g) })));
			method_14_.setAccessible(true);
			String string_15_
			    = ((String)
			       method_13_.invoke(object, new Object[0]));
			String string_16_
			    = ((String)
			       method_14_.invoke(object,
						 (new Object[]
						  { new URL("https://"
							    + ((ij) this).b
							    + "/"),
						    "https" })));
			string = string_15_ + ": " + string_16_;
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return httpProxyConnect(inetsocketaddress.getHostName(),
				    inetsocketaddress.getPort(), string);
	}
	return null;
    }
    
    static Class a(String string) {
		Class var_class;
		try {
		    var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
		    //throw new NoClassDefFoundError().initCause(classnotfoundexception);
			classnotfoundexception.printStackTrace();
			return null;
		}
		return var_class;
    }
}
