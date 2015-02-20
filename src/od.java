/* od - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class od extends qda
{
    static int K;
    static int L;
    static int M;
    static int N;
    private dr O;
    private int P = 0;
    static int Q;
    static int R;
    static GameOutPacket S = new GameOutPacket(65, -1);
    static int T;
    static int U;
    static int V;
    static int W;
    static int X;
    static int Y;
    private int Z = 0;
    static GameInPacket ab = new GameInPacket(84, 11);
    private int bb;
    private int cb = 0;
    private boolean db;
    static int eb;
    static int fb;
    private tq gb;
    private int hb = -1;
    int ib;
    static int jb;
    static int kb;
    static int lb;
    private int mb = 0;
    private int nb = 0;
    static f[] ob;
    static int pb;
    static int qb;
    boolean rb = false;
    static pl sb;
    static int smallFont;
    
    final int g(int i) {
	int i_0_ = 98 / ((-43 - i) / 59);
	kb++;
	return cb;
    }
    
    final void a(int i, int i_1_) {
	T++;
	if (!((od) this).rb) {
	    Z += i_1_;
	    if (i != 0)
		sb = null;
	    while (((dr) O).B[P] < Z) {
		Z -= ((dr) O).B[P];
		P++;
		if (((dr) O).p.length <= P) {
		    ((od) this).rb = true;
		    break;
		}
	    }
	    if (!((od) this).rb)
		qga.a(((Animable) this).height, O, ((Animable) this).locX, ((Animable) this).locY, 83, P,
		      false);
	}
    }
    
    final void a(boolean bool, int i, byte i_2_, Class_r class_r, Animable var_lo,
		 int i_3_, int i_4_) {
	R++;
	int i_5_ = -55 % ((i_2_ + 50) / 55);
	throw new IllegalStateException();
    }
    
    protected final void finalize() {
	N++;
	if (gb != null)
	    gb.f();
    }
    
    final boolean h(byte i) {
	lb++;
	if (i >= -26)
	    return true;
	return false;
    }
    
    final int c(int i) {
	jb++;
	if (i != -22496)
	    h((byte) 47);
	return nb;
    }
    
    final void a(boolean bool) {
	if (bool != true)
	    ab = null;
	if (gb != null)
	    gb.f();
	M++;
    }
    
    private final da a(int i, int i_6_, int i_7_, Class_r class_r) {
	Q++;
	iv var_iv = Class_ic.H.a((byte) 12, i);
	Class_i class_i = vr.b[((Animable) this).height];
	Class_i class_i_8_
	    = ((Animable) this).h >= 3 ? null : vr.b[((Animable) this).h + 1];
	if (i_7_ != 22209)
	    e((byte) -63);
	if (((od) this).rb)
	    return var_iv.a(((Animable) this).locX, i_6_, -1, ((Animable) this).j, (byte) 0,
			    class_i, -1, true, class_i_8_, 0, class_r,
			    Class_ef.J, ((Animable) this).locY);
	return var_iv.a(((Animable) this).locX, i_6_, hb, ((Animable) this).j, (byte) 0,
			class_i, P, true, class_i_8_, Z, class_r, Class_ef.J,
			((Animable) this).locY);
    }
    
    final boolean e(byte i) {
	K++;
	if (i != 23)
	    return true;
	return db;
    }
    
    public static void a(int i) {
	ob = null;
	S = null;
	if (i == 0) {
	    ab = null;
	    sb = null;
	}
    }
    
    final boolean g(byte i) {
	X++;
	if (i < 114)
	    a((Class_q) null, null, (byte) -25, null);
	return false;
    }
    
    final og a(boolean bool, Class_r class_r) {
	V++;
	da var_da = a(bb, (mb != 0 ? 5 : 0) | 0x800, 22209, class_r);
	if (var_da == null)
	    return null;
	if (bool != false)
	    finalize();
	if (mb != 0)
	    var_da.M(mb * 2048);
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	a(class_q, var_da, (byte) 94, class_r);
	if (!ml.k)
	    var_da.a(class_q, null, 0);
	else
	    var_da.a(class_q, null, Class_pd.r, 0);
	if (gb != null) {
	    ir var_ir = gb.g();
	    if (!ml.k)
		class_r.a(var_ir);
	    else
		class_r.a(var_ir, Class_pd.r);
	}
	db = var_da.LA();
	cb = var_da.J();
	nb = var_da.RA();
	return null;
    }
    
    final void d(int i) {
	if (i != -1)
	    a((Class_q) null, null, (byte) -18, null);
	W++;
	throw new IllegalStateException();
    }
    
    final boolean a(int i, int i_9_, Class_r class_r, int i_10_) {
	Y++;
	if (i_10_ != 9678)
	    a(true, -110, (byte) -2, null, null, 27, 34);
	return false;
    }
    
    final sd a(Class_r class_r, int i) {
	eb++;
	if (i != -1660704056)
	    h((byte) 5);
	return null;
    }
    
    od(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_,
       int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
	super(i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_,
	      false, (byte) 0);
	db = false;
	mb = i_22_;
	((od) this).ib = i_11_ + i_12_;
	bb = i;
	iv var_iv = Class_ic.H.a((byte) 12, bb);
	int i_23_ = ((iv) var_iv).w;
	if (i_23_ == -1)
	    ((od) this).rb = true;
	else {
	    O = Class_ef.J.c(64, i_23_);
	    ((od) this).rb = false;
	}
	if (i_12_ == ((od) this).ib)
	    qga.a(((Animable) this).height, O, ((Animable) this).locX, ((Animable) this).locY, 65, P,
		  false);
    }
    
    private final void a(Class_q class_q, da var_da, byte i, Class_r class_r) {
	var_da.a(class_q);
	fb++;
	hi[] var_his = var_da.c();
	int i_24_ = -105 % ((17 - i) / 43);
	qg[] var_qgs = var_da.f();
	if ((gb == null || ((tq) gb).k)
	    && (var_his != null || var_qgs != null))
	    gb = tq.a(pm.currentTimedTicks, true);
	if (gb != null) {
	    gb.a(class_r, (long) pm.currentTimedTicks, var_his, var_qgs, false);
	    gb.a(((Animable) this).height, ((qda) this).B, ((qda) this).I, ((qda) this).x,
		 ((qda) this).y);
	}
    }
    
    final void b(boolean bool, Class_r class_r) {
	L++;
	if (bool != false)
	    a((Class_r) null, 30);
	da var_da = a(bb, 0, 22209, class_r);
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    a(class_q, var_da, (byte) 91, class_r);
	}
    }
}
