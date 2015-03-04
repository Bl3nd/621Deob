/* qaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qaa extends dfa implements vda
{
    static int C;
    rea H;
    static int J;
    static int K;
    static int L;
    private sd M;
    static int N;
    static boolean O = false;
    static int P;
    static int Q;
    static int R;
    static int S;
    static int T = 0;
    static GameInPacket incomingPacket52;
    static int W;
    static int X;
    static int Y;
    static int Z;
    static int ab;
    static int bb;
    static int cb;
    static int db;
    private boolean eb;
    static int fb;
    static int gb = 0;
    private boolean hb = false;
    static int ib;
    static int jb;
    static int kb;
    
    final sd a(Class_r class_r, int i) {
	N++;
	if (i != -1660704056)
	    a(false, null);
	return M;
    }
    
    public final void a(byte i, Class_r class_r) {
	((qaa) this).H.a((byte) 107, class_r);
	int i_0_ = 53 / ((i + 19) / 34);
	jb++;
    }
    
    public final void a(boolean bool) {
	cb++;
	if (bool != false)
	    Q = 30;
    }
    
    public static void j(int i) {
	if (i > -79)
	    incomingPacket52 = null;
	incomingPacket52 = null;
    }
    
    static final void b(int i, int i_1_) {
	synchronized (hv.p) {
	    hv.p.a(true, i);
	    int i_2_ = 95 / ((-14 - i_1_) / 59);
	}
	J++;
    }
    
    final boolean g(byte i) {
	if (i < 114)
	    return false;
	X++;
	return false;
    }
    
    final void throwIllegalStateException(boolean bool, int i, byte i_3_, Class_r class_r, Animable var_lo,
                                          int i_4_, int i_5_) {
	R++;
	int i_6_ = -89 % ((-50 - i_3_) / 55);
	throw new IllegalStateException();
    }
    
    qaa(Class_r class_r, ObjectDef var_bda, int i, int i_7_, int i_8_, int i_9_,
	int i_10_, boolean bool, int i_11_, int i_12_) {
	super(i_8_, i_9_, i_10_, i, i_7_, ((ObjectDef) var_bda).j);
	((qaa) this).H = new rea(class_r, var_bda, 22, i_11_, i, i_7_, i_8_,
				 i_10_, bool, i_12_);
	eb = ((ObjectDef) var_bda).jb != 0 && !bool;
    }
    
    public final boolean a(int i) {
	if (i != 3755)
	    return false;
	fb++;
	return ((qaa) this).H.a((int) 0);
    }
    
    final void b(boolean bool, Class_r class_r) {
	C++;
	da var_da = ((qaa) this).H.a(true, ((Animable) this).locX, class_r, true, true,
				     ((Animable) this).locY, 262144);
	if (var_da != null) {
	    int i = ((Animable) this).locX >> 9;
	    int i_13_ = ((Animable) this).locY >> 9;
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    ((qaa) this).H.a(var_da, i, class_r, i_13_, false, i, i_13_, 87,
			     class_q);
	}
	if (bool != false)
	    e((byte) 37);
    }
    
    public final int b(byte i) {
	ib++;
	if (i <= 126)
	    return 119;
	return ((rea) ((qaa) this).H).y;
    }
    
    final void sendIllegalStateException(int i) {
	W++;
	if (i == -1)
	    throw new IllegalStateException();
    }
    
    final int g(int i) {
	int i_14_ = -47 % ((-43 - i) / 59);
	db++;
	return ((qaa) this).H.b((byte) -99);
    }
    
    public final int c(byte i) {
	int i_15_ = -42 / ((12 - i) / 48);
	ab++;
	return ((rea) ((qaa) this).H).L;
    }
    
    final boolean h(byte i) {
	P++;
	if (i > -26)
	    return true;
	return false;
    }
    
    static final boolean a(char c, int i) {
	kb++;
	if (i != 20454)
	    j((int) -37);
	if (c < '0' || c > '9')
	    return false;
	return true;
    }
    
    final int c(int i) {
	L++;
	if (i != -22496)
	    a((Class_r) null, -118);
	return ((qaa) this).H.b(28110);
    }
    
    final boolean a(int i, int i_16_, Class_r class_r, int i_17_) {
	if (i_17_ != 9678)
	    a((int) 97);
	K++;
	da var_da = ((qaa) this).H.a(true, ((Animable) this).locX, class_r, false,
				     false, ((Animable) this).locY, 131072);
	if (var_da == null)
	    return false;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	if (!ml.k)
	    return var_da.a(i, i_16_, class_q, false);
	return var_da.a(i, i_16_, class_q, false, Class_pd.r);
    }
    
    public final int a(byte i) {
	S++;
	if (i != 42)
	    return -6;
	return ((rea) ((qaa) this).H).w;
    }
    
    public final void b(byte i, Class_r class_r) {
	((qaa) this).H.a(i + 116, class_r);
	Y++;
	if (i != -114)
	    h((byte) 54);
    }
    
    final og a(boolean bool, Class_r class_r) {
	Z++;
	da var_da = ((qaa) this).H.a(!bool, ((Animable) this).locX, class_r, true, bool,
				     ((Animable) this).locY, 2048);
	if (var_da == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	og var_og = null;
	if (eb)
	    var_og = lf.a(true, 1);
	int i = ((Animable) this).locX >> 9;
	int i_18_ = ((Animable) this).locY >> 9;
	((qaa) this).H.a(var_da, i, class_r, i_18_, true, i, i_18_, 106,
			 class_q);
	if (ml.k)
	    var_da.a(class_q, var_og == null ? null : ((og) var_og).g[0],
		     Class_pd.r, 0);
	else
	    var_da.a(class_q, var_og == null ? null : ((og) var_og).g[0], 0);
	if (((rea) ((qaa) this).H).K != null) {
	    ir var_ir = ((rea) ((qaa) this).H).K.g();
	    if (!ml.k)
		class_r.a(var_ir);
	    else
		class_r.a(var_ir, Class_pd.r);
	}
	hb = var_da.LA() || ((rea) ((qaa) this).H).K != null;
	if (M == null)
	    M = th.a(-24294, ((Animable) this).j, var_da, ((Animable) this).locY,
		     ((Animable) this).locX);
	else
	    SpecialOutPacket.a(var_da, ((Animable) this).locX, M, ((Animable) this).j, ((Animable) this).locY,
		 26219);
	return var_og;
    }
    
    final boolean e(byte i) {
	if (i != 23)
	    M = null;
	bb++;
	return hb;
    }
    
    static {
	incomingPacket52 = new GameInPacket(52, 1);
    }
}
