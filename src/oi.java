/* oi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class oi extends cl
{
    static int t;
    static int u;
    static float[] v = new float[16384];
    private oq[] w;
    static float[] x = new float[16384];
    private boolean y;
    static int z;
    static int A;
    static int B;
    static int C;
    static int D;
    private boolean E = false;
    static int F;
    
    static final Entity a(int i, int i_0_, int i_1_, byte i_2_) {
	C++;
	vf var_vf = ol.p[i_0_][i][i_1_];
	if (var_vf == null)
	    return null;
	Entity var_ni = null;
	if (i_2_ != 23)
	    return null;
	int i_3_ = -1;
	for (ida var_ida = ((vf) var_vf).f; var_ida != null;
	     var_ida = ((ida) var_ida).d) {
	    qda var_qda = ((ida) var_ida).a;
	    if (var_qda instanceof Entity) {
		Entity var_ni_4_ = (Entity) var_qda;
		int i_5_ = 256 * (var_ni_4_.i(-1) - 1) + 252;
		int i_6_ = ((Animable) var_ni_4_).locX - i_5_ >> 9;
		int i_7_ = ((Animable) var_ni_4_).locY - i_5_ >> 9;
		int i_8_ = i_5_ + ((Animable) var_ni_4_).locX >> 9;
		int i_9_ = ((Animable) var_ni_4_).locY + i_5_ >> 9;
		if (i >= i_6_ && i_1_ >= i_7_ && i <= i_8_ && i_9_ >= i_1_) {
		    int i_10_ = (i_9_ + 1 - i_1_) * (i_8_ + 1 - i);
		    if (i_10_ > i_3_) {
			i_3_ = i_10_;
			var_ni = var_ni_4_;
		    }
		}
	    }
	}
	return var_ni;
    }
    
    public static void f(int i) {
	v = null;
	x = null;
	if (i != 36)
	    a(-31, -36, -7, (byte) 111);
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    a(-13, -75, (byte) -107);
	D++;
	return true;
    }
    
    static final int a(int i, int i_11_) {
	if (qh.q != null)
	    return qh.q[i][i_11_] & 0xff;
	return 0;
    }
    
    static final void a(Animable[] var_los, int i, int i_12_) {
	if (i < i_12_) {
	    int i_13_ = (i + i_12_) / 2;
	    int i_14_ = i;
	    Animable var_lo = var_los[i_13_];
	    var_los[i_13_] = var_los[i_12_];
	    var_los[i_12_] = var_lo;
	    int i_15_ = ((Animable) var_lo).g;
	    for (int i_16_ = i; i_16_ < i_12_; i_16_++) {
		if (((Animable) var_los[i_16_]).g > i_15_ + (i_16_ & 0x1)) {
		    Animable var_lo_17_ = var_los[i_16_];
		    var_los[i_16_] = var_los[i_14_];
		    var_los[i_14_++] = var_lo_17_;
		}
	    }
	    var_los[i_12_] = var_los[i_14_];
	    var_los[i_14_] = var_lo;
	    a(var_los, i, i_14_ - 1);
	    a(var_los, i_14_ + 1, i_12_);
	}
    }
    
    final void a(int i, boolean bool) {
	F++;
	int i_18_ = -79 % ((52 - i) / 36);
	if (w == null || !bool)
	    ((cl) this).l.a(0, eda.h, -18836);
	else {
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.a(tj.i, 124);
	    mga var_mga = ((cl) this).l.E(111);
	    var_mga.oa(1024);
	    ((cl) this).l.a(125, ck.J);
	    if (y) {
		((cl) this).l.a(hn.f, true, ku.k);
		((cl) this).l.a(false, mca.l, 0, true, (byte) 62);
		((cl) this).l.a(0, eda.h, -18836);
	    } else {
		((cl) this).l.a(ku.k, true, Class_rf.e);
		((cl) this).l.a(0, 1, bu.u);
		((cl) this).l.e(0, 2);
		((cl) this).l.a(hn.f, true, ku.k);
		((cl) this).l.a(0, 1, bu.u);
		((cl) this).l.a(false, bu.u, 1, true, (byte) 35);
		((cl) this).l.a(0, eda.h, -18836);
		((cl) this).l.a(((en) ((cl) this).l).fe, 0);
	    }
	    ((cl) this).l.e(0, 0);
	    E = true;
	}
    }
    
    final void a(boolean bool, boolean bool_19_) {
	A++;
	if (bool == true)
	    ((cl) this).l.a(Class_rf.e, bool, ku.k);
    }
    
    final void a(int i, int i_20_, hfa var_hfa) {
	((cl) this).l.a(var_hfa, 0);
	z++;
	((cl) this).l.f(i, 0);
	if (i_20_ <= 47)
	    d(-15);
    }
    
    final void d(int i) {
	u++;
	if (i == -19092) {
	    if (E) {
		((cl) this).l.e(i ^ ~0x4a93, 1);
		((cl) this).l.a((hfa) null, 0);
		((cl) this).l.a(aaa.s, 9);
		((cl) this).l.j((byte) -70);
		if (y) {
		    ((cl) this).l.a(Class_rf.e, true, Class_rf.e);
		    ((cl) this).l.a(0, 1, mca.l);
		    ((cl) this).l.a(0, mca.l, -18836);
		} else {
		    ((cl) this).l.a(Class_rf.e, true, Class_rf.e);
		    ((cl) this).l.a(0, 1, mca.l);
		    ((cl) this).l.e(0, 2);
		    ((cl) this).l.a(Class_rf.e, true, Class_rf.e);
		    ((cl) this).l.a(0, 1, mca.l);
		    ((cl) this).l.a(1, 1, bu.u);
		    ((cl) this).l.a(0, mca.l, -18836);
		    ((cl) this).l.a((hfa) null, 0);
		}
		((cl) this).l.e(0, 0);
		E = false;
	    } else
		((cl) this).l.a(0, mca.l, i + 256);
	    ((cl) this).l.a(Class_rf.e, true, Class_rf.e);
	}
    }
    
    final void a(int i, int i_21_, byte i_22_) {
	if (E) {
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.a(w[i - 1], 0);
	    ((cl) this).l.e(i_22_ ^ 0x41, 0);
	}
	t++;
	if (i_22_ != 65)
	    a(-128, 117, (hfa) null);
    }
    
    oi(en var_en) {
	super(var_en);
	if (((en) var_en).ge) {
	    y = ((en) var_en).ff < 3;
	    int i = y ? 48 : 127;
	    int[][] is = new int[6][4096];
	    int[][] is_23_ = new int[6][4096];
	    int[][] is_24_ = new int[6][4096];
	    int i_25_ = 0;
	    for (int i_26_ = 0; i_26_ < 64; i_26_++) {
		for (int i_27_ = 0; i_27_ < 64; i_27_++) {
		    float f = 2.0F * (float) i_26_ / 64.0F - 1.0F;
		    float f_28_ = (float) i_27_ * 2.0F / 64.0F - 1.0F;
		    float f_29_
			= (float) (1.0
				   / Math.sqrt((double) (f * f + (f_28_ * f_28_
								  + 1.0F))));
		    f_28_ *= f_29_;
		    f *= f_29_;
		    for (int i_30_ = 0; i_30_ < 6; i_30_++) {
			float f_31_;
			if (i_30_ == 0)
			    f_31_ = -f_28_;
			else if (i_30_ != 1) {
			    if (i_30_ == 2)
				f_31_ = f;
			    else if (i_30_ == 3)
				f_31_ = -f;
			    else if (i_30_ != 4)
				f_31_ = -f_29_;
			    else
				f_31_ = f_29_;
			} else
			    f_31_ = f_28_;
			int i_32_;
			int i_33_;
			int i_34_;
			if (f_31_ > 0.0F) {
			    i_32_ = (int) (Math.pow((double) f_31_, 96.0)
					   * (double) i);
			    i_33_ = (int) ((double) i
					   * Math.pow((double) f_31_, 36.0));
			    i_34_ = (int) ((double) i
					   * Math.pow((double) f_31_, 12.0));
			} else
			    i_32_ = i_33_ = i_34_ = 0;
			is_23_[i_30_][i_25_] = i_32_ << 24;
			is_24_[i_30_][i_25_] = i_33_ << 24;
			is[i_30_][i_25_] = i_34_ << 24;
		    }
		    i_25_++;
		}
	    }
	    w = new oq[3];
	    w[0] = ((cl) this).l.a(false, true, 64, is_23_);
	    w[1] = ((cl) this).l.a(false, true, 64, is_24_);
	    w[2] = ((cl) this).l.a(false, true, 64, is);
	}
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    x[i] = (float) Math.sin(d * (double) i);
	    v[i] = (float) Math.cos(d * (double) i);
	}
    }
}
