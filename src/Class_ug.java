/* Class_ug - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ug extends ev implements vda
{
    private boolean C = false;
    private sd D;
    static int E;
    static int F;
    static int G;
    static lea H = new lea();
    static int I;
    private boolean J;
    static int K;
    static int L;
    rea N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    static int T;
    static int U;
    static int V;
    static boolean[] W = new boolean[5];
    static int X;
    static int Y = 0;
    static int Z;
    static int ab;
    static int bb;
    
    final og a(boolean bool, Class_r class_r) {
	Q++;
	da var_da = ((Class_ug) this).N.a(!bool, ((Animable) this).locX, class_r, true,
					  bool, ((Animable) this).locY, 2048);
	if (var_da == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	og var_og = null;
	if (J)
	    var_og = lf.a(true, 1);
	int i = ((Animable) this).locX >> 9;
	int i_0_ = ((Animable) this).locY >> 9;
	((Class_ug) this).N.a(var_da, i, class_r, i_0_, true, i, i_0_, -118,
			      class_q);
	if (!ml.k)
	    var_da.a(class_q, var_og != null ? ((og) var_og).g[0] : null, 0);
	else
	    var_da.a(class_q, var_og != null ? ((og) var_og).g[0] : null,
		     Class_pd.r, 0);
	if (((rea) ((Class_ug) this).N).K != null) {
	    ir var_ir = ((rea) ((Class_ug) this).N).K.g();
	    if (!ml.k)
		class_r.a(var_ir);
	    else
		class_r.a(var_ir, Class_pd.r);
	}
	C = var_da.LA() || ((rea) ((Class_ug) this).N).K != null;
	if (D == null)
	    D = th.a(-24294, ((Animable) this).j, var_da, ((Animable) this).locY,
		     ((Animable) this).locX);
	else
	    SpecialOutPacket.a(var_da, ((Animable) this).locX, D, ((Animable) this).j, ((Animable) this).locY,
		 26219);
	return var_og;
    }
    
    final void b(boolean bool, Class_r class_r) {
	O++;
	da var_da = ((Class_ug) this).N.a(true, ((Animable) this).locX, class_r, true,
					  true, ((Animable) this).locY, 262144);
	if (var_da != null) {
	    int i = ((Animable) this).locX >> 9;
	    int i_1_ = ((Animable) this).locY >> 9;
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    ((Class_ug) this).N.a(var_da, i, class_r, i_1_, false, i, i_1_,
				  -120, class_q);
	}
	if (bool != false)
	    J = false;
    }
    
    final int c(int i) {
	R++;
	if (i != -22496)
	    return -126;
	return ((Class_ug) this).N.b(i + 50606);
    }
    
    static boolean a(boolean bool, boolean bool_2_) {
	return bool | bool_2_;
    }
    
    final sd a(Class_r class_r, int i) {
	if (i != -1660704056)
	    h((byte) 119);
	V++;
	return D;
    }
    
    final boolean h(byte i) {
	E++;
	if (i > -26)
	    return true;
	return false;
    }
    
    public final int b(byte i) {
	if (i <= 126)
	    a((byte) 30);
	F++;
	return ((rea) ((Class_ug) this).N).y;
    }
    
    public final void a(byte i, Class_r class_r) {
	int i_3_ = -118 / ((i + 19) / 34);
	((Class_ug) this).N.a((byte) 88, class_r);
	K++;
    }
    
    public final void a(boolean bool) {
	G++;
	if (bool != false)
	    g((byte) 26);
    }
    
    public static void b(boolean bool) {
	W = null;
	H = null;
	if (bool != true)
	    Y = 23;
    }
    
    public final void b(byte i, Class_r class_r) {
	if (i != -114)
	    H = null;
	P++;
	((Class_ug) this).N.a((int) 2, class_r);
    }
    
    final boolean e(byte i) {
	I++;
	if (i != 23)
	    return true;
	return C;
    }
    
    final void a(boolean bool, int i, byte i_4_, Class_r class_r, Animable var_lo,
		 int i_5_, int i_6_) {
	int i_7_ = -101 % ((i_4_ + 50) / 55);
	bb++;
	throw new IllegalStateException();
    }
    
    Class_ug(Class_r class_r, ObjectDef var_bda, int i, int i_8_, int i_9_,
	     int i_10_, int i_11_, boolean bool, int i_12_, int i_13_,
	     int i_14_) {
	super(i_9_, i_10_, i_11_, i, i_8_, tfa.a(i_12_, (byte) 120, i_13_));
	((Class_ug) this).N
	    = new rea(class_r, var_bda, i_12_, i_13_, ((Animable) this).height, i_8_,
		      ((Animable) this).locX, ((Animable) this).locY, bool, i_14_);
	J = ((ObjectDef) var_bda).jb != 0 && !bool;
    }
    
    public final int c(byte i) {
	int i_15_ = 21 / ((12 - i) / 48);
	U++;
	return ((rea) ((Class_ug) this).N).L;
    }
    
    public final boolean a(int i) {
	ab++;
	if (i != 3755)
	    c((int) 7);
	return ((Class_ug) this).N.a((int) 0);
    }
    
    final void d(int i) {
	if (i != -1)
	    W = null;
	T++;
	throw new IllegalStateException();
    }
    
    public final int a(byte i) {
	X++;
	if (i != 42)
	    return -99;
	return ((rea) ((Class_ug) this).N).w;
    }
    
    final int g(int i) {
	int i_16_ = 55 / ((i + 43) / 59);
	Z++;
	return ((Class_ug) this).N.b((byte) -99);
    }
    
    final boolean a(int i, int i_17_, Class_r class_r, int i_18_) {
	L++;
	da var_da = ((Class_ug) this).N.a(true, ((Animable) this).locX, class_r, false,
					  false, ((Animable) this).locY, 131072);
	if (var_da == null)
	    return false;
	if (i_18_ != 9678)
	    return false;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	if (ml.k)
	    return var_da.a(i, i_17_, class_q, false, Class_pd.r);
	return var_da.a(i, i_17_, class_q, false);
    }
    
    final boolean g(byte i) {
	S++;
	if (i < 114)
	    J = true;
	return false;
    }
}
