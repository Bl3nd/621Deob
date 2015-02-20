/* wca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wca
{
    static int a;
    static int b;
    static au[] c;
    static int d = 0;
    private pl e;
    static int f;
    static int g;
    static int h;
    static int i;
    private tb j = new tb(64);
    
    public static void a(byte i) {
	if (i != 116)
	    a((byte) -26);
	c = null;
    }
    
    final cg a(int i, byte i_0_) {
	g++;
	if (i_0_ < 51)
	    return null;
	cg var_cg;
	synchronized (j) {
	    var_cg = (cg) j.get((long) i, (byte) 100);
	}
	if (var_cg != null)
	    return var_cg;
	byte[] is;
	synchronized (e) {
	    is = e.b(i, 31, 32);
	}
	var_cg = new cg();
	if (is != null)
	    var_cg.a(new BytesParser(is), 126);
	synchronized (j) {
	    j.put((long) i, var_cg, 1);
	}
	return var_cg;
    }
    
    static final void b(byte i) {
	int i_1_ = 30 / ((i - 43) / 49);
	qd.p.a(true);
	b++;
	kaa.n.c(1252027233);
	eq.C.c(1252027233);
    }
    
    final void c(byte i) {
	synchronized (j) {
	    j.a(18385);
	}
	a++;
	if (i < 38)
	    b((byte) -56);
    }
    
    static final void d(byte i) {
	if (ui.n != null) {
	    for (int i_2_ = 0; i_2_ < cda.b; i_2_++)
		ui.n[i_2_] = null;
	    ui.n = null;
	}
	h++;
	if (i < 16)
	    b((byte) -5);
	if (Class_ob.p != null) {
	    for (int i_3_ = 0; vu.j > i_3_; i_3_++)
		Class_ob.p[i_3_] = null;
	    Class_ob.p = null;
	}
	if (Class_mb.Y != null) {
	    for (int i_4_ = 0; sr.R > i_4_; i_4_++)
		Class_mb.Y[i_4_] = null;
	    Class_mb.Y = null;
	}
	jr.w = null;
	kaa.p = null;
	dn.c = taa.c = -1;
	ega.k = null;
    }
    
    final void b(int i, byte i_5_) {
	synchronized (j) {
	    j.a(true, i);
	}
	wca.i++;
	if (i_5_ != 57)
	    e = null;
    }
    
    final void a(int i) {
	f++;
	synchronized (j) {
	    j.c((byte) 97);
	}
	if (i != 32)
	    d = 21;
    }
    
    wca(Class_rf class_rf, int i, pl var_pl) {
	e = var_pl;
	e.a(32, true);
    }
    
    static {
	c = new au[128];
    }
}
