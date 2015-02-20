/* ega - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ega
{
    static int a;
    private boolean b = false;
    static int c;
    static GPIPlayer[] gpiPlayers = new GPIPlayer[2048];
    static int e;
    private int f;
    static int g;
    private String[] h = new String[0];
    static int i;
    private int j = -1;
    static int[][][] k;
    static int l;
    static float m;
    static int n;
    
    private final void a(String string, byte i, int i_0_) {
	if (i == 99) {
	    a++;
	    if (i_0_ > j)
		j = i_0_;
	    if (h.length <= i_0_)
		a(i_0_, (byte) -124);
	    h[i_0_] = string;
	}
    }
    
    private final int a(int i, int i_1_) {
	e++;
	int i_2_ = h.length;
	while (i_2_ <= i_1_) {
	    if (b) {
		if (i_2_ == 0)
		    i_2_ = 1;
		else
		    i_2_ *= f;
	    } else
		i_2_ += f;
	}
	if (i != 1460)
	    f = -9;
	return i_2_;
    }
    
    public static void a(int i) {
	k = null;
	if (i != 2048)
	    gpiPlayers = null;
	gpiPlayers = null;
    }
    
    public final String toString() {
	n++;
	StringBuffer stringbuffer = new StringBuffer();
	stringbuffer.append("[");
	for (int i = 0; i < j; i++) {
	    if (i != 0)
		stringbuffer.append(", ");
	    stringbuffer.append(h[i]);
	}
	stringbuffer.append("]");
	return stringbuffer.toString();
    }
    
    private final void a(int i, byte i_3_) {
	g++;
	if (i_3_ == -124) {
	    String[] strings = new String[a(1460, i)];
	    co.a(h, 0, strings, 0, h.length);
	    h = strings;
	}
    }
    
    static final void a(int i, Interface var_kp, int i_4_, int i_5_) {
	l++;
	if (var_kp != null) {
	    if (((Interface) var_kp).jb != null) {
		ClientScript var_mea = new ClientScript();
		((ClientScript) var_mea).objects = ((Interface) var_kp).jb;
		((ClientScript) var_mea).interface_ = var_kp;
		ClientScriptHandler.activateClientScript(var_mea);
	    }
	    th.i = ((Interface) var_kp).itemID;
	    Class_jc.db = i_4_;
	    uk.d = ((Interface) var_kp).tb;
	    nu.h = i_5_;
	    ba.c = true;
	    qda.G = ((Interface) var_kp).itemIndex;
	    da.e = ((Interface) var_kp).cc;
	    if (i == 0) {
		tm.t = ((Interface) var_kp).interfaceID;
		tn.a(var_kp, 1023);
	    }
	}
    }
    
    final void a(String string, int i) {
	c++;
	a(string, (byte) 99, i + j);
    }
    
    final String[] b(int i) {
	ega.i++;
	String[] strings = new String[j + 1];
	co.a(h, 0, strings, 0, j + 1);
	if (i != 26598)
	    a(-99, null, 81, 17);
	return strings;
    }
    
    ega(int i, boolean bool) {
	b = bool;
	f = i;
    }
}
