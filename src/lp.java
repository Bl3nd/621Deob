/* lp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class lp implements ica
{
    static int a;
    static int b;
    static int c;
    iea d;
    pl e;
    static int f = 1337;
    static int g;
    private la h;
    static int i;
    private long j;
    static baa k = new baa(11, 0, 1, 2);
    private pl l;
    static int m;
    static int[] n;
    private int o;
    static short[][] p;
    static int q;
    
    static final void b(int i) {
	for (int i_0_ = 0; i_0_ < 5; i_0_++)
	    Class_ug.W[i_0_] = false;
	b++;
	js.n = dg.gb;
	li.z = 0;
	ja.Cc = dj.o = -1;
	mg.t = -1;
	rk.s = ada.N;
	tea.l = gn.G;
	dr.v = us.e;
	hp.z = 0;
	lca.w = mba.e;
	ll.x = i;
	Class_b.f = pm.currentTimedTicks;
	pi.n = -1;
    }
    
    public static void c(int i) {
	if (i != 100)
	    n = null;
	n = null;
	k = null;
	p = null;
    }
    
    public boolean a(byte i) {
	q++;
	if (i != 82)
	    a(true, 46);
	boolean bool = true;
	if (!((lp) this).e.g(1912, ((iea) ((lp) this).d).b))
	    bool = false;
	if (!l.g(1912, ((iea) ((lp) this).d).b))
	    bool = false;
	return bool;
    }
    
    static final void a(int[][] is, int i) {
	if (i != 100)
	    f = -10;
	g++;
	wh.O = is;
    }
    
    public void a(int i) {
	if (i <= -41) {
	    c++;
	    sa var_sa = GameOutPacket.a(l, ((iea) ((lp) this).d).b, (byte) 32);
	    h = lg.r.a(var_sa, aga.a(((lp) this).e, ((iea) ((lp) this).d).b),
		       true);
	}
    }
    
    abstract void a(int i, int i_1_, boolean bool, int i_2_);
    
    abstract void b(int i, int i_3_, boolean bool, int i_4_);
    
    static final void d(int i) {
	if (vh.d == null || ok.H == null) {
	    vh.d = new int[256];
	    ok.H = new int[256];
	    for (int i_5_ = 0; i_5_ < 256; i_5_++) {
		double d = 6.283185307179586 * ((double) i_5_ / 255.0);
		vh.d[i_5_] = (int) (4096.0 * Math.sin(d));
		ok.H[i_5_] = (int) (4096.0 * Math.cos(d));
	    }
	}
	m++;
	if (i != 0)
	    n = null;
    }
    
    public final void a(boolean bool, int i) {
	lp.i++;
	int i_6_ = (((iea) ((lp) this).d).m.a(baa.d, ((iea) ((lp) this).d).i,
					      i - 6619)
		    + ((iea) ((lp) this).d).k);
	int i_7_ = (((iea) ((lp) this).d).j.a(Class_vb.r,
					      ((iea) ((lp) this).d).e, -122)
		    + ((iea) ((lp) this).d).d);
	a(116, i_6_, bool, i_7_);
	if (i != 6621)
	    p = null;
	b(2, i_7_, bool, i_6_);
	String string = Class_ub.W.d((byte) 86);
	if (us.a(i - 6518) - j > 10000L)
	    string += " (" + Class_ub.W.c((byte) 127).c((byte) -109) + ")";
	h.a(((iea) ((lp) this).d).f, -142, i_6_ + ((iea) ((lp) this).d).i / 2,
	    -1,
	    ((iea) ((lp) this).d).g + ((iea) ((lp) this).d).e / 2 + i_7_ + 4,
	    string);
    }
    
    final int b(byte i) {
	a++;
	if (i != -8)
	    a(false, -49);
	int i_8_ = Class_ub.W.e((byte) -29);
	int i_9_ = 100 * i_8_;
	if (i_8_ == o && i_8_ != 0) {
	    int i_10_ = Class_ub.W.c(-23213);
	    if (i_8_ < i_10_) {
		long l = j - Class_ub.W.b((byte) -25);
		if (l > 0L) {
		    long l_11_
			= 10000L * l / (long) i_8_ * (long) (i_10_ - i_8_);
		    long l_12_ = 10000L * (us.a(i + 111) - j);
		    if (l_11_ <= l_12_)
			i_9_ = i_10_ * 100;
		    else
			i_9_ = (int) ((long) (100 * i_8_)
				      + (l_12_ * ((long) (i_10_ - i_8_) * 100L)
					 / l_11_));
		}
	    }
	} else {
	    o = i_8_;
	    j = us.a(100);
	}
	return i_9_;
    }
    
    lp(pl var_pl, pl var_pl_13_, iea var_iea) {
	((lp) this).d = var_iea;
	l = var_pl_13_;
	((lp) this).e = var_pl;
    }
}
