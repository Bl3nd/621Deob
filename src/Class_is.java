/* Class_is - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class Class_is implements Runnable
{
    static int a;
    private Thread b;
    static int c;
    static int d;
    private cfa[] e;
    private volatile boolean f;
    static int g;
    static int h;
    static boolean i = false;
    static float[] j;
    static GameInPacket updateNPCInPacket;
    private vfa l;
    static int m;
    static int n;
    
    final cfa a(int i, int i_0_) {
	if (i_0_ != -1)
	    a(-108, -33);
	c++;
	if (e == null || i < 0 || e.length <= i)
	    return null;
	return e[i];
    }
    
    static final float[] a(byte i, int i_1_, float[] fs) {
	g++;
	float[] fs_2_ = new float[i_1_];
	co.a(fs, 0, fs_2_, 0, i_1_);
	if (i > -49)
	    updateNPCInPacket = null;
	return fs_2_;
    }
    
    public final void run() {
	d++;
	try {
	    BufferedReader bufferedreader
		= new BufferedReader(new InputStreamReader((DataInputStream)
							   l.hostName));
	    String string = bufferedreader.readLine();
	    ega var_ega = vn.c((byte) 65);
	    for (/**/; string != null; string = bufferedreader.readLine())
		var_ega.a(string, 1);
	    String[] strings = var_ega.b(26598);
	    if (strings.length % 3 != 0)
		return;
	    e = new cfa[strings.length / 3];
	    for (int i = 0; i < strings.length; i += 3)
		e[i / 3] = new cfa(strings[i], strings[i + 1], strings[i + 2]);
	} catch (java.io.IOException ioexception) {
	    /* empty */
	}
	f = true;
    }
    
    final boolean a(byte i) {
	if (i != 116)
	    updateNPCInPacket = null;
	a++;
	if (f)
	    return true;
	if (l == null) {
	    try {
		int i_3_ = hs.modeWhere == oba.pk ? 80 : ((World) kfa.world).worldID + 7000;
		l = nda.signlink.a(new URL("http://" + ((World) kfa.world).lobbyAddress + ":" + i_3_
				    + "/news.ws?game=" + ((Class_rf) me.q).h),
			    4851);
	    } catch (java.net.MalformedURLException malformedurlexception) {
		return true;
	    }
	}
	if (l == null || l.f == 2)
	    return true;
	if (l.f != 1)
	    return false;
	if (b == null) {
	    b = new Thread(this);
	    b.start();
	}
	return f;
    }
    
    public Class_is() {
	/* empty */
    }
    
    public static void b(byte i) {
	j = null;
	if (i > -77)
	    b((byte) -12);
	updateNPCInPacket = null;
    }
    
    static {
	h = 0;
	j = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };
	updateNPCInPacket = new GameInPacket(76, -2);
	n = 0;
    }
}
