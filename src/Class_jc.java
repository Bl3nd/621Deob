/* Class_jc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_jc extends ev implements vda
{
    static int C;
    static int D;
    static int E;
    static int F;
    static GameOutPacket G = new GameOutPacket(43, 3);
    da H;
    private ha I;
    private boolean J;
    static int K;
    static int L;
    static int M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static Class_ec S;
    static int T;
    static int U;
    private boolean V;
    static int W;
    static int X;
    static int Y;
    static int Z;
    static int ab;
    private byte bb;
    static int cb;
    static int db;
    private short eb;
    static int fb;
    private boolean gb;
    static int hb;
    static boolean ib = false;
    private boolean jb;
    static int kb;
    static int[][][] lb;
    private sd mb;
    private byte nb;
    
    public final void a(boolean bool) {
	if (((Class_jc) this).H != null)
	    ((Class_jc) this).H.a();
	if (bool != false)
	    bb = (byte) 92;
	C++;
    }
    
    final boolean h(byte i) {
	F++;
	if (i > -26)
	    i((byte) 6);
	return gb;
    }
    
    public final boolean a(int i) {
	O++;
	if (i != 3755)
	    ((Class_jc) this).H = null;
	return V;
    }
    
    public final int c(byte i) {
	int i_0_ = -60 / ((12 - i) / 48);
	L++;
	return nb;
    }
    
    final void b(boolean bool, Class_r class_r) {
	X++;
	if (bool != false)
	    bb = (byte) 21;
    }
    
    final int g(int i) {
	int i_1_ = -80 % ((-43 - i) / 59);
	N++;
	if (((Class_jc) this).H != null)
	    return ((Class_jc) this).H.J();
	return 0;
    }
    
    final void a(boolean bool, int i, byte i_2_, Class_r class_r, Animable var_lo,
		 int i_3_, int i_4_) {
	int i_5_ = 93 / ((-50 - i_2_) / 55);
	kb++;
	if (!(var_lo instanceof Class_jc)) {
	    if (var_lo instanceof Class_mb) {
		Class_mb class_mb = (Class_mb) var_lo;
		if (((Class_jc) this).H != null
		    && ((Class_mb) class_mb).T != null)
		    ((Class_jc) this).H.a(((Class_mb) class_mb).T, i, i_3_,
					  i_4_, bool);
	    }
	} else {
	    Class_jc class_jc_6_ = (Class_jc) var_lo;
	    if (((Class_jc) this).H != null
		&& ((Class_jc) class_jc_6_).H != null)
		((Class_jc) this).H.a(((Class_jc) class_jc_6_).H, i, i_3_,
				      i_4_, bool);
	}
    }
    
    public final int a(byte i) {
	if (i != 42)
	    c((int) -97);
	U++;
	return bb;
    }
    
    static final boolean i(byte i) {
	T++;
	if (GameInPacket.l) {
	    try {
		rp.a(true, "showVideoAd", vj.applet);
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	int i_7_ = 122 % ((65 - i) / 55);
	return false;
    }
    
    private final kj a(byte i, int i_8_, Class_r class_r, boolean bool) {
	if (i != -34)
	    return null;
	E++;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 114, eb & 0xffff);
	Class_i class_i;
	Class_i class_i_9_;
	if (!jb) {
	    if (((Animable) this).h >= 3)
		class_i_9_ = null;
	    else
		class_i_9_ = vr.b[((Animable) this).h + 1];
	    class_i = vr.b[((Animable) this).h];
	} else {
	    class_i = wr.D[((Animable) this).h];
	    class_i_9_ = vr.b[0];
	}
	return var_bda.a(i_8_, class_r, ((Animable) this).j, class_i, ((Animable) this).locX,
			 -129, class_i_9_, ((Animable) this).locY, bool, bb, nb);
    }
    
    public static void b(boolean bool) {
	if (bool != true)
	    ib = false;
	lb = null;
	S = null;
	G = null;
    }
    
    public final void a(byte i, Class_r class_r) {
	hb++;
	Object object = null;
	ha var_ha;
	if (I != null || !V) {
	    var_ha = I;
	    I = null;
	} else {
	    kj var_kj = a((byte) -34, 262144, class_r, true);
	    var_ha = var_kj != null ? ((kj) var_kj).e : null;
	}
	int i_10_ = -33 / ((-19 - i) / 34);
	if (var_ha != null)
	    ck.a(var_ha, ((Animable) this).h, ((Animable) this).locX, ((Animable) this).locY, null);
    }
    
    final sd a(Class_r class_r, int i) {
	D++;
	if (mb == null)
	    mb = th.a(-24294, ((Animable) this).j, a(class_r, 0, (byte) -117),
		      ((Animable) this).locY, ((Animable) this).locX);
	if (i != -1660704056)
	    return null;
	return mb;
    }
    
    final boolean e(byte i) {
	Z++;
	if (i != 23)
	    gb = false;
	if (((Class_jc) this).H != null)
	    return ((Class_jc) this).H.LA();
	return false;
    }
    
    Class_jc(Class_r class_r, ObjectDef var_bda, int i, int i_11_, int i_12_,
	     int i_13_, int i_14_, boolean bool, int i_15_, int i_16_,
	     boolean bool_17_) {
	super(i_12_, i_13_, i_14_, i, i_11_, FileOnDisk.a(i_16_, i_15_, (byte) -127));
	((Animable) this).locY = i_14_;
	nb = (byte) i_16_;
	gb = bool_17_;
	((Animable) this).locX = i_12_;
	bb = (byte) i_15_;
	J = ((ObjectDef) var_bda).jb != 0 && !bool;
	jb = bool;
	eb = (short) ((ObjectDef) var_bda).objectID;
	V = (class_r.n() && ((ObjectDef) var_bda).hb && !jb
	     && cs.g.b(on.performance, -112) != 0);
	int i_18_ = 2048;
	if (gb)
	    i_18_ |= 0x10000;
	kj var_kj = a((byte) -34, i_18_, class_r, V);
	if (var_kj != null) {
	    I = ((kj) var_kj).e;
	    ((Class_jc) this).H = ((kj) var_kj).d;
	    if (gb)
		((Class_jc) this).H
		    = ((Class_jc) this).H.a((byte) 0, i_18_, false);
	}
    }
    
    final void d(int i) {
	gb = false;
	if (i != -1)
	    gb = false;
	fb++;
	if (((Class_jc) this).H != null)
	    ((Class_jc) this).H.SA(~0x10000 & ((Class_jc) this).H.PA());
    }
    
    static final boolean a(int i, int i_19_, int i_20_) {
	ab++;
	if (i_20_ > -62)
	    G = null;
	if ((i_19_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    final og a(boolean bool, Class_r class_r) {
	M++;
	if (((Class_jc) this).H == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	if (bool != false)
	    db = 57;
	og var_og = null;
	if (J)
	    var_og = lf.a(true, 1);
	if (!ml.k)
	    ((Class_jc) this).H
		.a(class_q, var_og == null ? null : ((og) var_og).g[0], 0);
	else
	    ((Class_jc) this).H.a(class_q,
				  var_og != null ? ((og) var_og).g[0] : null,
				  Class_pd.r, 0);
	return var_og;
    }
    
    final boolean g(byte i) {
	Y++;
	if (i <= 114)
	    bb = (byte) 50;
	return true;
    }
    
    private final da a(Class_r class_r, int i, byte i_21_) {
	if (i_21_ != -117)
	    J = false;
	K++;
	if (((Class_jc) this).H != null
	    && class_r.b(((Class_jc) this).H.PA(), i) == 0)
	    return ((Class_jc) this).H;
	kj var_kj = a((byte) -34, i, class_r, false);
	if (var_kj != null)
	    return ((kj) var_kj).d;
	return null;
    }
    
    public final int b(byte i) {
	if (i <= 126)
	    bb = (byte) 117;
	P++;
	return 0xffff & eb;
    }
    
    final boolean a(int i, int i_22_, Class_r class_r, int i_23_) {
	R++;
	if (i_23_ != 9678)
	    a(-1, -126, -124);
	da var_da = a(class_r, 131072, (byte) -117);
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    if (!ml.k)
		return var_da.a(i, i_22_, class_q, false);
	    return var_da.a(i, i_22_, class_q, false, Class_pd.r);
	}
	return false;
    }
    
    final int c(int i) {
	Q++;
	if (i != -22496)
	    ib = false;
	if (((Class_jc) this).H == null)
	    return 0;
	return ((Class_jc) this).H.RA();
    }
    
    public final void b(byte i, Class_r class_r) {
	cb++;
	Object object = null;
	ha var_ha;
	if (I == null && V) {
	    kj var_kj = a((byte) -34, 262144, class_r, true);
	    var_ha = var_kj != null ? ((kj) var_kj).e : null;
	} else {
	    var_ha = I;
	    I = null;
	}
	if (var_ha != null)
	    oga.a(var_ha, ((Animable) this).h, ((Animable) this).locX, ((Animable) this).locY, null);
	if (i != -114)
	    a((Class_r) null, -127);
    }
    
    static final boolean a(int i, int i_24_) {
	W++;
	if (i != -30497)
	    a(-35, 56);
	if (i_24_ == 1 || i_24_ == 7)
	    return false;
	return true;
    }
    
    static {
	S = new Class_ec(1);
	lb = new int[2][][];
    }
}
