/* Class_ub - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ub extends dfa implements vda
{
    static int C;
    static int H;
    static int J;
    static int K;
    static int L;
    static float[] M = new float[4];
    static int N;
    static int O;
    private sd P;
    static int Q;
    private short R;
    private byte S;
    static int T;
    static boolean U = false;
    static int[] V = new int[256];
    static jl W;
    static int X;
    private ha Y;
    static int Z;
    static int ab;
    private da bb;
    static int cb;
    static int db;
    private boolean eb;
    static int fb;
    private boolean gb;
    private boolean hb;
    static int ib;
    static int jb;
    static int kb;
    static int lb;
    static int mb;
    static int nb;
    private boolean ob;
    
    public final int b(byte i) {
	N++;
	if (i <= 126)
	    V = null;
	return R & 0xffff;
    }
    
    public final void a(boolean bool) {
	if (bool != false)
	    U = false;
	if (bb != null)
	    bb.a();
	H++;
    }
    
    Class_ub(Class_r class_r, ObjectDef var_bda, int i, int i_0_, int i_1_, int i_2_,
	     int i_3_, boolean bool, int i_4_, boolean bool_5_) {
	super(i_1_, i_2_, i_3_, i, i_0_, ((ObjectDef) var_bda).j);
	S = (byte) i_4_;
	R = (short) ((ObjectDef) var_bda).objectID;
	hb = bool;
	gb = ((ObjectDef) var_bda).jb != 0 && !bool;
	ob = bool_5_;
	((Animable) this).locX = i_1_;
	((Animable) this).locY = i_3_;
	eb = (class_r.n() && ((ObjectDef) var_bda).hb && !hb
	      && cs.g.b(on.performance, -117) != 0);
	int i_6_ = 2048;
	if (ob)
	    i_6_ |= 0x10000;
	kj var_kj = a(i_6_, true, eb, class_r);
	if (var_kj != null) {
	    Y = ((kj) var_kj).e;
	    bb = ((kj) var_kj).d;
	    if (ob)
		bb = bb.a((byte) 0, i_6_, false);
	}
    }
    
    private final kj a(int i, boolean bool, boolean bool_7_, Class_r class_r) {
	nb++;
	if (bool != true)
	    R = (short) 73;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 75, R & 0xffff);
	Class_i class_i;
	Class_i class_i_8_;
	if (hb) {
	    class_i_8_ = vr.b[0];
	    class_i = wr.D[((Animable) this).h];
	} else {
	    class_i = vr.b[((Animable) this).h];
	    if (((Animable) this).h < 3)
		class_i_8_ = vr.b[((Animable) this).h + 1];
	    else
		class_i_8_ = null;
	}
	return var_bda.a(i, class_r, ((Animable) this).j, class_i, ((Animable) this).locX,
			 -129, class_i_8_, ((Animable) this).locY, bool_7_, 22, S);
    }
    
    final int g(int i) {
	int i_9_ = 39 % ((-43 - i) / 59);
	cb++;
	if (bb != null)
	    return bb.J();
	return 0;
    }
    
    final int c(int i) {
	Q++;
	if (i != -22496)
	    Y = null;
	if (bb != null)
	    return bb.RA();
	return 0;
    }
    
    final boolean h(byte i) {
	mb++;
	if (i >= -26)
	    h((byte) -61);
	return ob;
    }
    
    final boolean a(int i, int i_10_, Class_r class_r, int i_11_) {
	if (i_11_ != 9678)
	    M = null;
	C++;
	da var_da = a(131072, true, class_r);
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    if (!ml.k)
		return var_da.a(i, i_10_, class_q, false);
	    return var_da.a(i, i_10_, class_q, false, Class_pd.r);
	}
	return false;
    }
    
    final void a(boolean bool, int i, byte i_12_, Class_r class_r, Animable var_lo,
		 int i_13_, int i_14_) {
	if (var_lo instanceof Class_ub) {
	    Class_ub class_ub_15_ = (Class_ub) var_lo;
	    if (bb != null && class_ub_15_.bb != null)
		bb.a(class_ub_15_.bb, i, i_13_, i_14_, bool);
	}
	int i_16_ = -106 % ((i_12_ + 50) / 55);
	jb++;
    }
    
    final sd a(Class_r class_r, int i) {
	if (P == null)
	    P = th.a(-24294, ((Animable) this).j, a(0, true, class_r), ((Animable) this).locY,
		     ((Animable) this).locX);
	if (i != -1660704056)
	    b(false, null);
	fb++;
	return P;
    }
    
    final void d(int i) {
	ib++;
	if (i == -1) {
	    ob = false;
	    if (bb != null)
		bb.SA(bb.PA() & ~0x10000);
	}
    }
    
    final og a(boolean bool, Class_r class_r) {
	lb++;
	if (bb == null)
	    return null;
	if (bool != false)
	    d((int) 25);
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	og var_og = null;
	if (gb)
	    var_og = lf.a(!bool, 1);
	if (ml.k)
	    bb.a(class_q, var_og == null ? null : ((og) var_og).g[0],
		 Class_pd.r, 0);
	else
	    bb.a(class_q, var_og == null ? null : ((og) var_og).g[0], 0);
	return var_og;
    }
    
    public static void k(byte i) {
	V = null;
	if (i <= 54)
	    V = null;
	W = null;
	M = null;
    }
    
    public final int a(byte i) {
	if (i != 42)
	    hb = false;
	K++;
	return 22;
    }
    
    private final da a(int i, boolean bool, Class_r class_r) {
	if (bool != true)
	    gb = true;
	O++;
	if (bb != null && class_r.b(bb.PA(), i) == 0)
	    return bb;
	kj var_kj = a(i, bool, false, class_r);
	if (var_kj != null)
	    return ((kj) var_kj).d;
	return null;
    }
    
    public final int c(byte i) {
	X++;
	int i_17_ = 32 / ((12 - i) / 48);
	return S;
    }
    
    final boolean g(byte i) {
	if (i <= 114)
	    S = (byte) 41;
	J++;
	return true;
    }
    
    public final boolean a(int i) {
	kb++;
	if (i != 3755)
	    return false;
	return eb;
    }
    
    final boolean e(byte i) {
	if (i != 23)
	    bb = null;
	db++;
	if (bb == null)
	    return false;
	return bb.LA();
    }
    
    final void b(boolean bool, Class_r class_r) {
	L++;
	if (bool != false)
	    a(false);
    }
    
    public final void b(byte i, Class_r class_r) {
	ab++;
	if (i != -114)
	    P = null;
	Object object = null;
	ha var_ha;
	if (Y != null || !eb) {
	    var_ha = Y;
	    Y = null;
	} else {
	    kj var_kj = a(262144, true, true, class_r);
	    var_ha = var_kj == null ? null : ((kj) var_kj).e;
	}
	if (var_ha != null)
	    oga.a(var_ha, ((Animable) this).h, ((Animable) this).locX, ((Animable) this).locY, null);
    }
    
    public final void a(byte i, Class_r class_r) {
	int i_18_ = 112 % ((i + 19) / 34);
	T++;
	Object object = null;
	ha var_ha;
	if (Y != null || !eb) {
	    var_ha = Y;
	    Y = null;
	} else {
	    kj var_kj = a(262144, true, true, class_r);
	    var_ha = var_kj == null ? null : ((kj) var_kj).e;
	}
	if (var_ha != null)
	    ck.a(var_ha, ((Animable) this).h, ((Animable) this).locX, ((Animable) this).locY, null);
    }
    
    static final void a(boolean bool, int i, int i_19_, int i_20_,
			boolean bool_21_, int i_22_, int i_23_) {
	ru.v = i_23_;
	Z++;
	pca.D = i;
	if (bool != false)
	    a(false, 127, -94, 30, false, 54, 34);
	uc.d = i_22_;
	Class_md.i = i_19_;
	vs.D = i_20_;
	if (bool_21_ && vs.D >= 100) {
	    dg.gb = 512 * pca.D + 256;
	    ada.N = uc.d * 512 + 256;
	    us.e = Class_u.b(dg.gb, vo.clientHeight, -20214, ada.N) - ru.v;
	}
	ja.Cc = dj.o = -1;
	ll.x = 2;
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_24_ = i;
	    for (int i_25_ = 0; i_25_ < 8; i_25_++) {
		if ((0x1 & i_24_) == 1)
		    i_24_ = ~0x12477cdf ^ i_24_ >>> 1;
		else
		    i_24_ >>>= 1;
	    }
	    V[i] = i_24_;
	}
    }
}
