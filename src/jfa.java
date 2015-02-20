/* jfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jfa extends lca implements vda
{
    static int[] H = new int[8];
    static int I;
    static int J;
    static int K;
    private boolean L = false;
    static int M;
    static int N;
    static int O;
    rea P;
    static int Q;
    static int R;
    static int S;
    static int T;
    static int U;
    static int V;
    static int W;
    static int X;
    private boolean Y;
    static int Z;
    static int ab;
    private sd bb;
    static int cb;
    
    public final boolean a(int i) {
	if (i != 3755)
	    return true;
	J++;
	return ((jfa) this).P.a(i - 3755);
    }
    
    final sd a(Class_r class_r, int i) {
	R++;
	if (i != -1660704056)
	    e((byte) 98);
	return bb;
    }
    
    static final void i(int i) {
	U++;
	if (i == -1) {
	    if (kea.i != null) {
		kea.i.h(1);
		kea.i = null;
		Class_k.K = null;
	    }
	}
    }
    
    public final int a(byte i) {
	S++;
	if (i != 42)
	    H = null;
	return ((rea) ((jfa) this).P).w;
    }
    
    public final void a(boolean bool) {
	if (bool == false)
	    K++;
    }
    
    jfa(Class_r class_r, ObjectDef var_bda, int i, int i_0_, int i_1_, int i_2_,
	int i_3_, boolean bool, int i_4_, int i_5_, int i_6_, int i_7_,
	int i_8_) {
	super(i_1_, i_2_, i_3_, i, i_0_, i_4_, i_5_);
	((jfa) this).P = new rea(class_r, var_bda, i_6_, i_7_, ((Animable) this).height,
				 i_0_, i_1_, i_3_, bool, i_8_);
	Y = ((ObjectDef) var_bda).jb != 0 && !bool;
    }
    
    final og a(boolean bool, Class_r class_r) {
	M++;
	da var_da = ((jfa) this).P.a(!bool, ((Animable) this).locX, class_r, true, bool,
				     ((Animable) this).locY, 2048);
	if (var_da == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((lca) this).E + ((Animable) this).locX, ((Animable) this).j,
		   ((Animable) this).locY + ((lca) this).x);
	og var_og = null;
	if (Y)
	    var_og = lf.a(!bool, 1);
	int i = ((Animable) this).locX >> 9;
	int i_9_ = ((Animable) this).locY >> 9;
	((jfa) this).P.a(var_da, i, class_r, i_9_, true, i, i_9_, -118,
			 class_q);
	if (ml.k)
	    var_da.a(class_q, var_og != null ? ((og) var_og).g[0] : null,
		     Class_pd.r, 0);
	else
	    var_da.a(class_q, var_og == null ? null : ((og) var_og).g[0], 0);
	if (((rea) ((jfa) this).P).K != null) {
	    ir var_ir = ((rea) ((jfa) this).P).K.g();
	    if (ml.k)
		class_r.a(var_ir, Class_pd.r);
	    else
		class_r.a(var_ir);
	}
	L = var_da.LA() || ((rea) ((jfa) this).P).K != null;
	if (bb != null)
	    SpecialOutPacket.a(var_da, ((Animable) this).locX, bb, ((Animable) this).j, ((Animable) this).locY,
		 26219);
	else
	    bb = th.a(-24294, ((Animable) this).j, var_da, ((Animable) this).locY,
		      ((Animable) this).locX);
	return var_og;
    }
    
    final void b(boolean bool, Class_r class_r) {
	X++;
	da var_da = ((jfa) this).P.a(!bool, ((Animable) this).locX, class_r, true, bool,
				     ((Animable) this).locY, 262144);
	if (var_da != null) {
	    int i = ((Animable) this).locX >> 9;
	    int i_10_ = ((Animable) this).locY >> 9;
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    ((jfa) this).P.a(var_da, i, class_r, i_10_, false, i, i_10_, -122,
			     class_q);
	}
    }
    
    static final boolean a(int i, wd var_wd, int i_11_, int i_12_, int i_13_,
			   int i_14_, int i_15_, int i_16_, int i_17_,
			   byte i_18_, int i_19_) {
	O++;
	int i_20_ = i_14_;
	int i_21_ = i_19_;
	int i_22_ = 64;
	int i_23_ = 64;
	int i_24_ = i_14_ - i_22_;
	int i_25_ = i_19_ - i_23_;
	if (i_18_ > -109)
	    j(104);
	it.J[i_22_][i_23_] = 99;
	ps.b[i_22_][i_23_] = 0;
	int i_26_ = 0;
	Class_ad.l[i_26_] = i_20_;
	int i_27_ = 0;
	jn.I[i_26_++] = i_21_;
	int[][] is = ((wd) var_wd).e;
	while (i_26_ != i_27_) {
	    i_20_ = Class_ad.l[i_27_];
	    i_21_ = jn.I[i_27_];
	    i_23_ = i_21_ - i_25_;
	    int i_28_ = i_20_ - ((wd) var_wd).w;
	    int i_29_ = i_21_ - ((wd) var_wd).o;
	    i_27_ = i_27_ + 1 & 0xfff;
	    i_22_ = i_20_ - i_24_;
	    int i_30_ = i_16_;
	while_63_:
	    do {
	    while_62_:
		do {
		while_61_:
		    do {
		    while_60_:
			do {
			    do {
				if (i_30_ != -4) {
				    if (i_30_ != -3) {
					if (i_30_ != -2) {
					    if ((i_30_ ^ 0xffffffff) != 0) {
						if (i_30_ == 0 || i_30_ == 1
						    || i_30_ == 2 || i_30_ == 3
						    || i_30_ == 9)
						    break while_61_;
						break while_62_;
					    }
					} else
					    break;
					break while_60_;
				    }
				} else {
				    if (i_20_ == i_15_ && i_17_ == i_21_) {
					bd.l = i_20_;
					je.m = i_21_;
					return true;
				    }
				    break while_63_;
				}
				if (eaa.a(i_20_, false, 1, i_21_, i_11_, i_15_,
					  i_17_, 1, i)) {
				    bd.l = i_20_;
				    je.m = i_21_;
				    return true;
				}
				break while_63_;
			    } while (false);
			    if (var_wd.a(i_11_, 1, (byte) 101, i_17_, i_13_,
					 i_15_, i, i_21_, i_20_, 1)) {
				je.m = i_21_;
				bd.l = i_20_;
				return true;
			    }
			    break while_63_;
			} while (false);
			if (var_wd.a(-1, i_11_, i_15_, i_21_, i_17_, i, i_20_,
				     i_13_, 1)) {
			    je.m = i_21_;
			    bd.l = i_20_;
			    return true;
			}
			break while_63_;
		    } while (false);
		    if (var_wd.b(i_20_, i_21_, 1, 67108864, i_17_, i_12_,
				 i_16_, i_15_)) {
			je.m = i_21_;
			bd.l = i_20_;
			return true;
		    }
		    break while_63_;
		} while (false);
		if (var_wd.a(1, -111, i_16_, i_17_, i_12_, i_21_, i_20_,
			     i_15_)) {
		    je.m = i_21_;
		    bd.l = i_20_;
		    return true;
		}
	    } while (false);
	    i_30_ = ps.b[i_22_][i_23_] + 1;
	    if (i_22_ > 0 && it.J[i_22_ - 1][i_23_] == 0
		&& (is[i_28_ - 1][i_29_] & 0x42240000) == 0) {
		Class_ad.l[i_26_] = i_20_ - 1;
		jn.I[i_26_] = i_21_;
		i_26_ = i_26_ + 1 & 0xfff;
		it.J[i_22_ - 1][i_23_] = 2;
		ps.b[i_22_ - 1][i_23_] = i_30_;
	    }
	    if (i_22_ < 127 && it.J[i_22_ + 1][i_23_] == 0
		&& (is[i_28_ + 1][i_29_] & 0x60240000) == 0) {
		Class_ad.l[i_26_] = i_20_ + 1;
		jn.I[i_26_] = i_21_;
		it.J[i_22_ + 1][i_23_] = 8;
		i_26_ = i_26_ + 1 & 0xfff;
		ps.b[i_22_ + 1][i_23_] = i_30_;
	    }
	    if (i_23_ > 0 && it.J[i_22_][i_23_ - 1] == 0
		&& (0x40a40000 & is[i_28_][i_29_ - 1]) == 0) {
		Class_ad.l[i_26_] = i_20_;
		jn.I[i_26_] = i_21_ - 1;
		it.J[i_22_][i_23_ - 1] = 1;
		i_26_ = 0xfff & i_26_ + 1;
		ps.b[i_22_][i_23_ - 1] = i_30_;
	    }
	    if (i_23_ < 127 && it.J[i_22_][i_23_ + 1] == 0
		&& (is[i_28_][i_29_ + 1] & 0x48240000) == 0) {
		Class_ad.l[i_26_] = i_20_;
		jn.I[i_26_] = i_21_ + 1;
		i_26_ = i_26_ + 1 & 0xfff;
		it.J[i_22_][i_23_ + 1] = 4;
		ps.b[i_22_][i_23_ + 1] = i_30_;
	    }
	    if (i_22_ > 0 && i_23_ > 0 && it.J[i_22_ - 1][i_23_ - 1] == 0
		&& (is[i_28_ - 1][i_29_ - 1] & 0x43a40000) == 0
		&& (0x42240000 & is[i_28_ - 1][i_29_]) == 0
		&& (0x40a40000 & is[i_28_][i_29_ - 1]) == 0) {
		Class_ad.l[i_26_] = i_20_ - 1;
		jn.I[i_26_] = i_21_ - 1;
		it.J[i_22_ - 1][i_23_ - 1] = 3;
		i_26_ = 0xfff & i_26_ + 1;
		ps.b[i_22_ - 1][i_23_ - 1] = i_30_;
	    }
	    if (i_22_ < 127 && i_23_ > 0 && it.J[i_22_ + 1][i_23_ - 1] == 0
		&& (is[i_28_ + 1][i_29_ - 1] & 0x60e40000) == 0
		&& (is[i_28_ + 1][i_29_] & 0x60240000) == 0
		&& (0x40a40000 & is[i_28_][i_29_ - 1]) == 0) {
		Class_ad.l[i_26_] = i_20_ + 1;
		jn.I[i_26_] = i_21_ - 1;
		it.J[i_22_ + 1][i_23_ - 1] = 9;
		i_26_ = 0xfff & i_26_ + 1;
		ps.b[i_22_ + 1][i_23_ - 1] = i_30_;
	    }
	    if (i_22_ > 0 && i_23_ < 127 && it.J[i_22_ - 1][i_23_ + 1] == 0
		&& (0x4e240000 & is[i_28_ - 1][i_29_ + 1]) == 0
		&& (0x42240000 & is[i_28_ - 1][i_29_]) == 0
		&& (is[i_28_][i_29_ + 1] & 0x48240000) == 0) {
		Class_ad.l[i_26_] = i_20_ - 1;
		jn.I[i_26_] = i_21_ + 1;
		it.J[i_22_ - 1][i_23_ + 1] = 6;
		i_26_ = i_26_ + 1 & 0xfff;
		ps.b[i_22_ - 1][i_23_ + 1] = i_30_;
	    }
	    if (i_22_ < 127 && i_23_ < 127 && it.J[i_22_ + 1][i_23_ + 1] == 0
		&& (0x78240000 & is[i_28_ + 1][i_29_ + 1]) == 0
		&& (0x60240000 & is[i_28_ + 1][i_29_]) == 0
		&& (is[i_28_][i_29_ + 1] & 0x48240000) == 0) {
		Class_ad.l[i_26_] = i_20_ + 1;
		jn.I[i_26_] = i_21_ + 1;
		i_26_ = 0xfff & i_26_ + 1;
		it.J[i_22_ + 1][i_23_ + 1] = 12;
		ps.b[i_22_ + 1][i_23_ + 1] = i_30_;
	    }
	}
	je.m = i_21_;
	bd.l = i_20_;
	return false;
    }
    
    final int c(int i) {
	if (i != -22496)
	    bb = null;
	N++;
	return ((jfa) this).P.b(i + 50606);
    }
    
    public final int b(byte i) {
	if (i < 126)
	    j(58);
	V++;
	return ((rea) ((jfa) this).P).y;
    }
    
    final boolean a(int i, int i_31_, Class_r class_r, int i_32_) {
	if (i_32_ != 9678)
	    Y = true;
	I++;
	da var_da = ((jfa) this).P.a(true, ((Animable) this).locX, class_r, false,
				     false, ((Animable) this).locY, 131072);
	if (var_da == null)
	    return false;
	Class_q class_q = class_r.p();
	class_q.NA(((lca) this).E + ((Animable) this).locX, ((Animable) this).j,
		   ((Animable) this).locY + ((lca) this).x);
	if (ml.k)
	    return var_da.a(i, i_31_, class_q, false, Class_pd.r);
	return var_da.a(i, i_31_, class_q, false);
    }
    
    final boolean g(byte i) {
	Q++;
	if (i < 114)
	    H = null;
	return false;
    }
    
    public final void a(byte i, Class_r class_r) {
	int i_33_ = -78 / ((i + 19) / 34);
	ab++;
	((jfa) this).P.a((byte) 88, class_r);
    }
    
    final boolean e(byte i) {
	if (i != 23)
	    i(-6);
	Z++;
	return L;
    }
    
    public final void b(byte i, Class_r class_r) {
	if (i == -114) {
	    ((jfa) this).P.a((int) 2, class_r);
	    W++;
	}
    }
    
    public static void j(int i) {
	H = null;
	if (i != 1)
	    i(-48);
    }
    
    public final int c(byte i) {
	int i_34_ = 110 % ((12 - i) / 48);
	T++;
	return ((rea) ((jfa) this).P).L;
    }
    
    final int g(int i) {
	int i_35_ = 110 % ((-43 - i) / 59);
	cb++;
	return ((jfa) this).P.b((byte) -99);
    }
}
