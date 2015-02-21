/* Class_mb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_mb extends qda implements vda
{
    static int K;
    static int L;
    static int M;
    static int N;
    private ha O;
    static int P;
    static int Q;
    private boolean R;
    private byte S;
    da T;
    private sd U;
    static GameOutPacket V = new GameOutPacket(8, 15);
    static int W;
    static int X;
    static hv[] Y;
    private byte Z;
    static int ab;
    private boolean bb;
    private short cb;
    static int db;
    static int eb;
    static int fb;
    static int gb;
    static int hb;
    static int ib;
    static int jb;
    static int kb;
    static int lb;
    static int mb;
    static int nb;
    static int ob;
    private boolean pb;
    static int qb;
    private boolean rb;
    static int sb;
    static int tb;
    
    final int i(int i) {
	if (i < 15)
	    e((byte) 72);
	hb++;
	if (((Class_mb) this).T == null)
	    return 15;
	return ((Class_mb) this).T.K() / 4;
    }
    
    static final int j(int i) {
	ab++;
	if (i != -3)
	    return -5;
	if (kr.a == null) {
	    if (!gea.n && mu.j > 0) {
		if (vh.a && uc.c.a((byte) -68, (int) 81) && mu.j > 2)
		    return (((bfa) (bfa)
			     ((Node) ((Node) ((Class_ae) oba.I).o).next).next)
			    .s);
		return ((bfa) (bfa) ((Node) ((Class_ae) oba.I).o).next).s;
	    }
	    int i_0_ = Class_md.e.d(i ^ ~0x7d2);
	    int i_1_ = Class_md.e.b((int) 104);
	    int i_2_ = mr.a;
	    int i_3_ = hn.b;
	    int i_4_ = aw.l;
	    if (i_0_ > i_2_ && i_0_ < i_4_ + i_2_) {
		int i_5_ = -1;
		for (int i_6_ = 0; i_6_ < mu.j; i_6_++) {
		    if (!lq.hb) {
			int i_7_ = i_3_ + 31 + 16 * (mu.j - 1 - i_6_);
			if (i_7_ - 13 < i_1_ && i_7_ + 3 >= i_1_)
			    i_5_ = i_6_;
		    } else {
			int i_8_ = 16 * (mu.j - 1 - i_6_) + i_3_ + 33;
			if (i_1_ > i_8_ - 13 && i_1_ <= i_8_ + 3)
			    i_5_ = i_6_;
		    }
		}
		if (i_5_ != -1) {
		    int i_9_ = 0;
		    sq var_sq = new sq(oba.I);
		    for (bfa var_bfa = (bfa) var_sq.b(-96); var_bfa != null;
			 var_bfa = (bfa) var_sq.a(i - 15837)) {
			if (i_5_ == i_9_++)
			    return ((bfa) var_bfa).s;
		    }
		}
	    }
	}
	return -1;
    }
    
    final boolean a(int i, int i_10_, Class_r class_r, int i_11_) {
	if (i_11_ != 9678)
	    return false;
	db++;
	da var_da = a(21915, 131072, class_r);
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    if (ml.k)
		return var_da.a(i, i_10_, class_q, false, Class_pd.r);
	    return var_da.a(i, i_10_, class_q, false);
	}
	return false;
    }
    
    public final void a(byte i, Class_r class_r) {
	X++;
	int i_12_ = 29 % ((i + 19) / 34);
	Object object = null;
	ha var_ha;
	if (O != null || !R) {
	    var_ha = O;
	    O = null;
	} else {
	    kj var_kj = a(43, 262144, true, class_r);
	    var_ha = var_kj == null ? null : ((kj) var_kj).e;
	}
	if (var_ha != null)
	    ck.a(var_ha, ((Animable) this).h, ((Animable) this).locX, ((Animable) this).locY, null);
    }
    
    static final void a(int i, int i_13_, boolean bool, int i_14_, int i_15_) {
	qb++;
	if (i == 4 && gf.a((byte) 108, i_14_))
	    sca.a(i_15_, i_13_, aa.o[i_14_], -1, bool, i ^ ~0x7e);
    }
    
    final boolean h(byte i) {
	L++;
	if (i >= -26)
	    V = null;
	return bb;
    }
    
    final int g(int i) {
	int i_16_ = -39 % ((-43 - i) / 59);
	eb++;
	if (((Class_mb) this).T == null)
	    return 0;
	return ((Class_mb) this).T.J();
    }
    
    public final void b(byte i, Class_r class_r) {
	M++;
	Object object = null;
	ha var_ha;
	if (O != null || !R) {
	    var_ha = O;
	    O = null;
	} else {
	    kj var_kj = a(i + 209, 262144, true, class_r);
	    var_ha = var_kj == null ? null : ((kj) var_kj).e;
	}
	if (var_ha != null)
	    oga.a(var_ha, ((Animable) this).h, ((Animable) this).locX, ((Animable) this).locY, null);
	if (i != -114)
	    c((byte) 30);
    }
    
    final void b(boolean bool, Class_r class_r) {
	nb++;
	if (bool != false)
	    U = null;
    }
    
    private final da a(int i, int i_17_, Class_r class_r) {
	Q++;
	if (((Class_mb) this).T != null
	    && class_r.b(((Class_mb) this).T.PA(), i_17_) == 0)
	    return ((Class_mb) this).T;
	if (i != 21915)
	    return null;
	kj var_kj = a(119, i_17_, false, class_r);
	if (var_kj != null)
	    return ((kj) var_kj).d;
	return null;
    }
    
    final void a(boolean bool, int i, byte i_18_, Class_r class_r, Animable var_lo,
		 int i_19_, int i_20_) {
	kb++;
	int i_21_ = -58 / ((-50 - i_18_) / 55);
	if (var_lo instanceof Class_jc) {
	    Class_jc class_jc = (Class_jc) var_lo;
	    if (((Class_mb) this).T != null && ((Class_jc) class_jc).H != null)
		((Class_mb) this).T.a(((Class_jc) class_jc).H, i, i_19_, i_20_,
				      bool);
	} else if (var_lo instanceof Class_mb) {
	    Class_mb class_mb_22_ = (Class_mb) var_lo;
	    if (((Class_mb) this).T != null
		&& ((Class_mb) class_mb_22_).T != null)
		((Class_mb) this).T.a(((Class_mb) class_mb_22_).T, i, i_19_,
				      i_20_, bool);
	}
    }
    
    public final int b(byte i) {
	if (i < 126)
	    return 4;
	K++;
	return 0xffff & cb;
    }
    
    public final int c(byte i) {
	gb++;
	int i_23_ = 54 / ((i - 12) / 48);
	return S;
    }
    
    final sd a(Class_r class_r, int i) {
	if (i != -1660704056)
	    Y = null;
	if (U == null)
	    U = th.a(-24294, ((Animable) this).j, a(21915, 0, class_r),
		     ((Animable) this).locY, ((Animable) this).locX);
	P++;
	return U;
    }
    
    final void sendIllegalStateException(int i) {
	N++;
	bb = false;
	if (i != -1)
	    a((Class_r) null, -29);
	if (((Class_mb) this).T != null)
	    ((Class_mb) this).T.SA(~0x10000 & ((Class_mb) this).T.PA());
    }
    
    public final int a(byte i) {
	if (i != 42)
	    a((int) 55, -23, null);
	lb++;
	return Z;
    }
    
    final og a(boolean bool, Class_r class_r) {
	jb++;
	if (((Class_mb) this).T == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	og var_og = null;
	if (rb)
	    var_og = lf.a(true, 1);
	if (bool != false)
	    O = null;
	if (ml.k)
	    ((Class_mb) this).T.a(class_q,
				  var_og == null ? null : ((og) var_og).g[0],
				  Class_pd.r, 0);
	else
	    ((Class_mb) this).T
		.a(class_q, var_og != null ? ((og) var_og).g[0] : null, 0);
	return var_og;
    }
    
    final int c(int i) {
	ib++;
	if (i != -22496)
	    b((byte) -127);
	if (((Class_mb) this).T != null)
	    return ((Class_mb) this).T.RA();
	return 0;
    }
    
    final boolean g(byte i) {
	W++;
	if (i < 114)
	    ((Class_mb) this).T = null;
	return true;
    }
    
    public final boolean a(int i) {
	if (i != 3755)
	    S = (byte) -104;
	fb++;
	return R;
    }
    
    private final kj a(int i, int i_24_, boolean bool, Class_r class_r) {
	sb++;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 92, cb & 0xffff);
	if (i <= 34)
	    Y = null;
	Class_i class_i;
	Class_i class_i_25_;
	if (!pb) {
	    class_i = vr.b[((Animable) this).h];
	    if (((Animable) this).h >= 3)
		class_i_25_ = null;
	    else
		class_i_25_ = vr.b[((Animable) this).h + 1];
	} else {
	    class_i = wr.D[((Animable) this).h];
	    class_i_25_ = vr.b[0];
	}
	return var_bda.a(i_24_, class_r, ((Animable) this).j, class_i, ((Animable) this).locX,
			 -129, class_i_25_, ((Animable) this).locY, bool,
			 Z != 11 ? Z : 10, Z == 11 ? (int) (4 + S) : S);
    }
    
    public static void i(byte i) {
	if (i != -27)
	    Y = null;
	V = null;
	Y = null;
    }
    
    public final void a(boolean bool) {
	if (bool != false)
	    g((int) 23);
	if (((Class_mb) this).T != null)
	    ((Class_mb) this).T.a();
	tb++;
    }
    
    final boolean e(byte i) {
	if (i != 23)
	    return true;
	ob++;
	if (((Class_mb) this).T != null)
	    return ((Class_mb) this).T.LA();
	return false;
    }
    
    static final void a(BytesParser var_es, boolean bool, int i) {
	if (dca.V != null) {
	    try {
		dca.V.seek(13755, 0L);
		dca.V.a(((BytesParser) var_es).bytes, i, 24, 27895);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (bool != true)
	    a(null, false, -107);
	mb++;
    }
    
    Class_mb(Class_r class_r, ObjectDef var_bda, int i, int i_26_, int i_27_,
	     int i_28_, int i_29_, boolean bool, int i_30_, int i_31_,
	     int i_32_, int i_33_, int i_34_, int i_35_, boolean bool_36_) {
	super(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, i_33_,
	      ((ObjectDef) var_bda).i == 1, ka.a(i_34_, i_35_, 99));
	((Animable) this).h = (byte) i_26_;
	Z = (byte) i_34_;
	pb = bool;
	rb = ((ObjectDef) var_bda).jb != 0 && !bool;
	bb = bool_36_;
	S = (byte) i_35_;
	cb = (short) ((ObjectDef) var_bda).objectID;
	R = (class_r.n() && ((ObjectDef) var_bda).hb && !pb
	     && cs.g.b(on.performance, -122) != 0);
	int i_37_ = 2048;
	if (bb)
	    i_37_ |= 0x10000;
	kj var_kj = a(72, i_37_, R, class_r);
	if (var_kj != null) {
	    O = ((kj) var_kj).e;
	    ((Class_mb) this).T = ((kj) var_kj).d;
	    if (bb)
		((Class_mb) this).T
		    = ((Class_mb) this).T.a((byte) 0, i_37_, false);
	}
    }
}
