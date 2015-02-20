/* wa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wa extends pp
{
    static int s;
    static Class_rf t = new Class_rf("runescape", 0);
    static int u;
    static int v;
    static int w;
    private int x;
    private byte[][] y;
    gw[] z;
    static int B;
    static tb C = new tb(8);
    static GameInPacket incomingPacket8 = new GameInPacket(8, 2);
    
    final boolean a(int i, byte i_0_) {
	B++;
	if (i_0_ > -1)
	    a((int) -32, (byte) -117);
	return ((gw) ((wa) this).z[i]).a;
    }
    
    static final oe a(BytesParser var_es, byte i) {
	w++;
	oe var_oe = new oe();
	if (i >= -41)
	    return null;
	((oe) var_oe).a = var_es.readShort(13111);
	((oe) var_oe).d = ul.s.a(((oe) var_oe).a, (byte) 45);
	return var_oe;
    }
    
    final boolean a(int i, int i_1_) {
	u++;
	if (i_1_ != 0)
	    C = null;
	return ((gw) ((wa) this).z[i]).n;
    }
    
    final boolean a(byte i, int i_2_) {
	if (i != -101)
	    x = 69;
	v++;
	return ((gw) ((wa) this).z[i_2_]).h;
    }
    
    final boolean a(boolean bool) {
	s++;
	if (((wa) this).z != null)
	    return true;
	if (y == null) {
	    synchronized (eda.j) {
		if (!eda.j.a(!bool, x))
		    return false;
		int[] is = eda.j.c(x, -125);
		y = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    y[i] = eda.j.b(is[i], -104, x);
	    }
	}
	boolean bool_3_ = true;
	for (int i = 0; i < y.length; i++) {
	    byte[] is = y[i];
	    BytesParser var_es = new BytesParser(is);
	    ((BytesParser) var_es).pos = 1;
	    int i_4_ = var_es.readShort(13111);
	    synchronized (qe.e) {
		bool_3_ &= qe.e.g(1912, i_4_);
	    }
	}
	if (!bool_3_)
	    return false;
	Class_ae class_ae = new Class_ae();
	int[] is;
	synchronized (eda.j) {
	    int i = eda.j.a(x, bool);
	    ((wa) this).z = new gw[i];
	    is = eda.j.c(x, -116);
	}
	for (int i = 0; is.length > i; i++) {
	    byte[] is_5_ = y[i];
	    BytesParser var_es = new BytesParser(is_5_);
	    ((BytesParser) var_es).pos = 1;
	    int i_6_ = var_es.readShort(13111);
	    jj var_jj = null;
	    for (jj var_jj_7_ = (jj) class_ae.a((int) 125); var_jj_7_ != null;
		 var_jj_7_ = (jj) class_ae.b((byte) 21)) {
		if (((jj) var_jj_7_).p == i_6_) {
		    var_jj = var_jj_7_;
		    break;
		}
	    }
	    if (var_jj == null) {
		synchronized (qe.e) {
		    var_jj = new jj(i_6_, qe.e.a((int) 106, i_6_));
		}
		class_ae.b(var_jj, (byte) 93);
	    }
	    ((wa) this).z[is[i]] = new gw(is_5_, var_jj);
	}
	y = null;
	return true;
    }
    
    wa(int i) {
	x = i;
    }
    
    public static void a(int i) {
	if (i != 0)
	    a((int) 42);
	incomingPacket8 = null;
	C = null;
	t = null;
    }
}
