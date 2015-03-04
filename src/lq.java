/* lq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lq extends qda implements vda
{
    static int K;
    static boolean L = false;
    private sd M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    static int T;
    static int applyPlayerAnimations;
    static int V;
    static int W;
    rea X;
    static int Y;
    private boolean Z;
    static int ab;
    static int bb;
    static int cb;
    static int db;
    static int eb;
    static int fb;
    static int gb;
    static boolean hb = false;
    static int ib;
    private boolean jb = false;
    
    public final boolean a(int i) {
	if (i != 3755)
	    return false;
	O++;
	return ((lq) this).X.a((int) 0);
    }
    
    public final int b(byte i) {
	if (i < 126)
	    a((int) -94);
	T++;
	return ((rea) ((lq) this).X).y;
    }
    
    final void sendIllegalStateException(int i) {
	if (i == -1) {
	    fb++;
	    throw new IllegalStateException();
	}
    }
    
    final void b(boolean bool, Class_r class_r) {
	if (bool != false)
	    Z = true;
	Y++;
	da var_da = ((lq) this).X.a(true, ((Animable) this).locX, class_r, true, true,
				    ((Animable) this).locY, 262144);
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    ((lq) this).X.a(var_da, ((qda) this).B, class_r, ((qda) this).y,
			    false, ((qda) this).I, ((qda) this).x, 24,
			    class_q);
	}
    }
    
    final boolean g(byte i) {
	W++;
	if (i <= 114)
	    throwIllegalStateException(true, 18, (byte) 120, null, null, 124, 76);
	return false;
    }
    
    static final void applyPlayerAnimation(int delay, int[] animIDs, int dummy, Player p) {
		applyPlayerAnimations++;
		if (((Entity) p).Ab != null) {
		    boolean bool = true;
		    for (int loopID = 0; ((Entity) p).Ab.length > loopID; loopID++) {
				if (((Entity) p).Ab[loopID] != animIDs[loopID]) {
				    bool = false;
				    break;
				}
		    }
		    if (bool && (((Entity) p).yb ^ 0xffffffff) != 0) {
				dr var_dr = Class_ef.J.c(64, ((Entity) p).yb);
				int i_2_ = ((dr) var_dr).g;
				if (i_2_ == 1) {
				    ((Entity) p).Hb = 0;
				    ((Entity) p).oc = delay;
				    ((Entity) p).ic = 0;
				    ((Entity) p).yc = 0;
				    ((Entity) p).W = 1;
				    qga.a(((Animable) p).height, var_dr, ((Animable) p).locX, ((Animable) p).locY, 114, ((Entity) p).yc, p == up.thisPlayer);
				}
				if (i_2_ == 2)
				    ((Entity) p).Hb = 0;
		    }
		}
		boolean bool = true;
		if (dummy > -81)
		    i((byte) -70);
		for (int loopID = 0; animIDs.length > loopID; loopID++) {
		    if (animIDs[loopID] != -1)
		    	bool = false;
		    if (((Entity) p).Ab == null || (((Entity) p).Ab[loopID] ^ 0xffffffff) == 0 || (((dr) Class_ef.J.c(64, animIDs[loopID])).t >= ((dr) Class_ef.J.c(64, ((Entity) p).Ab[loopID])).t)) {
				((Entity) p).Ab = animIDs;
				((Entity) p).oc = delay;
				break;
		    }
		}
		if (bool) {
		    ((Entity) p).oc = delay;
		    ((Entity) p).Ab = animIDs;
		}
    }
    
    lq(Class_r class_r, ObjectDef var_bda, int i, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		super(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, ((ObjectDef) var_bda).i == 1, lw.a((byte) -74, i_13_, i_12_));
		((lq) this).X = new rea(class_r, var_bda, i_12_, i_13_, ((Animable) this).height, i_4_, i_5_, i_7_, bool, i_14_);
		Z = ((ObjectDef) var_bda).jb != 0 && !bool;
    }
    
    public final void a(byte i, Class_r class_r) {
	Q++;
	int i_15_ = 14 / ((i + 19) / 34);
	((lq) this).X.a((byte) 99, class_r);
    }
    
    final int g(int i) {
	bb++;
	int i_16_ = 84 % ((-43 - i) / 59);
	return ((lq) this).X.b((byte) -99);
    }
    
    final int c(int i) {
	V++;
	if (i != -22496)
	    return 115;
	return ((lq) this).X.b(28110);
    }
    
    final og a(boolean bool, Class_r class_r) {
	S++;
	da var_da = ((lq) this).X.a(true, ((Animable) this).locX, class_r, true, bool,
				    ((Animable) this).locY, 2048);
	if (var_da == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	og var_og = null;
	if (Z)
	    var_og = lf.a(true, 1);
	((lq) this).X.a(var_da, ((qda) this).B, class_r, ((qda) this).y, true,
			((qda) this).I, ((qda) this).x, 25, class_q);
	if (!ml.k)
	    var_da.a(class_q, var_og == null ? null : ((og) var_og).g[0], 0);
	else
	    var_da.a(class_q, var_og != null ? ((og) var_og).g[0] : null,
		     Class_pd.r, 0);
	if (((rea) ((lq) this).X).K != null) {
	    ir var_ir = ((rea) ((lq) this).X).K.g();
	    if (!ml.k)
		class_r.a(var_ir);
	    else
		class_r.a(var_ir, Class_pd.r);
	}
	jb = var_da.LA() || ((rea) ((lq) this).X).K != null;
	if (M == null)
	    M = th.a(-24294, ((Animable) this).j, var_da, ((Animable) this).locY,
		     ((Animable) this).locX);
	else
	    SpecialOutPacket.a(var_da, ((Animable) this).locX, M, ((Animable) this).j, ((Animable) this).locY,
		 26219);
	return var_og;
    }
    
    public final int a(byte i) {
	gb++;
	if (i != 42)
	    return -57;
	return ((rea) ((lq) this).X).w;
    }
    
    final boolean a(int i, int i_17_, Class_r class_r, int i_18_) {
	cb++;
	da var_da = ((lq) this).X.a(true, ((Animable) this).locX, class_r, false, false,
				    ((Animable) this).locY, 131072);
	if (var_da == null)
	    return false;
	Class_q class_q = class_r.p();
	if (i_18_ != 9678)
	    return false;
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	if (ml.k)
	    return var_da.a(i, i_17_, class_q, false, Class_pd.r);
	return var_da.a(i, i_17_, class_q, false);
    }
    
    static final void i(byte i) {
	int i_19_ = -60 % ((i + 24) / 32);
	if (kg.j != null) {
	    aca[] var_acas = kg.j;
	    for (int i_20_ = 0; i_20_ < var_acas.length; i_20_++) {
		aca var_aca = var_acas[i_20_];
		var_aca.a((int) 127);
	    }
	}
	R++;
    }
    
    final void throwIllegalStateException(boolean bool, int i, byte i_21_, Class_r class_r, Animable var_lo,
                                          int i_22_, int i_23_) {
	eb++;
	int i_24_ = -47 % ((-50 - i_21_) / 55);
	throw new IllegalStateException();
    }
    
    public final int c(byte i) {
	P++;
	int i_25_ = -17 % ((i - 12) / 48);
	return ((rea) ((lq) this).X).L;
    }
    
    final boolean h(byte i) {
	ab++;
	if (i >= -26)
	    L = false;
	return false;
    }
    
    public final void b(byte i, Class_r class_r) {
	if (i == -114) {
	    ((lq) this).X.a((int) 2, class_r);
	    db++;
	}
    }
    
    public final void a(boolean bool) {
	if (bool != false)
	    c((int) -17);
	K++;
    }
    
    final sd a(Class_r class_r, int i) {
	ib++;
	if (i != -1660704056)
	    i((byte) -21);
	return M;
    }
    
    final boolean e(byte i) {
	N++;
	if (i != 23)
	    return true;
	return jb;
    }
}
