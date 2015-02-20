/* cl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class cl
{
    static int[] a;
    static int b = 50;
    static String[] c;
    static int d;
    static int[] e;
    static int f;
    static int g;
    static int[] h;
    static int[] i;
    static int j;
    static int k;
    en l;
    static int[] m;
    static int var_n;
    static int o;
    static int[] p;
    static int q;
    static int r;
    static int[][][] s;
    
    abstract void a(boolean bool, boolean bool_0_);
    
    abstract boolean a(int i);
    
    public static void a(byte i) {
	h = null;
	c = null;
	e = null;
	p = null;
	a = null;
	if (i != 61)
	    a((byte) 16);
	s = null;
	m = null;
	cl.i = null;
    }
    
    abstract void a(int i, boolean bool);
    
    void b(byte i) {
	if (i <= -114)
	    j++;
    }
    
    void a(boolean bool) {
	if (bool != false)
	    e = null;
	q++;
    }
    
    void b(int i) {
	if (i == 26185)
	    r++;
    }
    
    abstract void a(int i, int i_1_, hfa var_hfa);
    
    cl(en var_en) {
	((cl) this).l = var_en;
    }
    
    void c(int i) {
	f++;
	int i_2_ = -100 / ((54 - i) / 37);
    }
    
    static final void a(int i, Class_r class_r) {
	g++;
	class_r.da(0, 0, ff.width, 350);
	class_r.J(0, 0, ff.width, 350, 0x332277 | dg.zb << 24, 1);
	int i_3_ = 66 / ((i + 62) / 62);
	int i_4_ = 350 / uj.L;
	if (wi.l > 0) {
	    int i_5_ = 346 - (uj.L + 4);
	    int i_6_ = i_4_ * i_5_ / (i_4_ + wi.l - 1);
	    int i_7_ = 4;
	    if (wi.l > 1)
		i_7_ += (i_5_ - i_6_) * (wi.l - 1 - cp.c) / (wi.l - 1);
	    class_r.J(ff.width - 16, i_7_, 12, i_6_, dg.zb << 24 | 0x332277, 2);
	    for (int i_8_ = cp.c; cp.c + i_4_ > i_8_ && i_8_ < wi.l; i_8_++) {
		String[] strings = vq.a(-82, Node.b[i_8_], '\010');
		int i_9_ = (ff.width - 24) / strings.length;
		for (int i_10_ = 0; i_10_ < strings.length; i_10_++) {
		    int i_11_ = 8 + i_9_ * i_10_;
		    class_r.da(i_11_, 0, i_9_ + (i_11_ - 8), 350);
		    pm.v.a(-1, true, i_11_, mo.a(strings[i_10_], false),
			   -16777216,
			   (-el.e - 2 - uj.L * (i_8_ - cp.c)
			    + (-((sa) Class_nd.o).n + 350)));
		}
	    }
	}
	bq.e.a(ff.width - 25, 330, "Build: 621", -1, -16777216, -69);
	class_r.da(0, 0, ff.width, 350);
	class_r.b(-el.e + 350, (byte) 11, 0, ff.width, -1);
	pv.j.a(-1, true, 10, "--> " + mo.a(gca.l, false), -16777216,
	       350 - ((sa) dca.R).n - 1);
	if (tw.r) {
	    int i_12_ = -1;
	    if (pm.currentTimedTicks % 30 > 15)
		i_12_ = 16777215;
	    class_r.a(10 + dca.R.a((byte) 99,
				   ("--> "
				    + mo.a(gca.l, false).substring(0, qda.z))),
		      (byte) 4, i_12_, 12, -((sa) dca.R).n - 11 + 350);
	}
    }
    
    void c(byte i) {
	if (i >= -35)
	    b((int) -83);
	o++;
    }
    
    abstract void a(int i, int i_13_, byte i_14_);
    
    abstract void d(int i);
    
    static final void a(int i, boolean bool, String string) {
	var_n++;
	fi.a(i, bool, string, -1, 1986811992);
    }
    
    void e(int i) {
	k++;
	if (i != -16573)
	    a(false, true);
    }
    
    static {
	a = new int[b];
	e = new int[b];
	i = new int[b];
	m = new int[b];
	h = new int[b];
	c = new String[b];
	p = new int[b];
	d = it.a(-24420, 1600);
    }
}
