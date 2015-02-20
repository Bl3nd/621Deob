/* oga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class oga
{
    static short[] a;
    static int b;
    static int c;
    static int d;
    
    public oga() {
	/* empty */
    }
    
    static final void a(int i, int i_0_, int i_1_) {
	boolean bool = (ol.p[0][i_0_][i_1_] != null
			&& ((vf) ol.p[0][i_0_][i_1_]).e != null);
	for (int i_2_ = i; i_2_ >= 0; i_2_--) {
	    if (ol.p[i_2_][i_0_][i_1_] == null) {
		vf var_vf = ol.p[i_2_][i_0_][i_1_] = new vf(i_2_);
		if (bool)
		    ((vf) var_vf).j++;
	    }
	}
    }
    
    static final boolean b(int i, int i_3_, int i_4_) {
	if (i != 128)
	    a = null;
	b++;
	return Class_hb.a(i_3_, (byte) -93, i_4_) & sm.a(i_3_, i - 128, i_4_);
    }
    
    abstract long a(boolean bool);
    
    static final void a(int i, int i_5_) {
	c++;
	qba var_qba = ofa.a(10, i, (byte) 109);
	if (i_5_ < 103)
	    a = null;
	var_qba.i(0);
    }
    
    static final void a(ha var_ha, int i, int i_6_, int i_7_,
			boolean[] bools) {
	if (Class_q.b != wr.D) {
	    int i_8_ = vr.b[i].a(i_7_, i_6_, true);
	    for (int i_9_ = 0; i_9_ <= i; i_9_++) {
		if (bools == null || bools[i_9_]) {
		    Class_i class_i = vr.b[i_9_];
		    if (class_i != null)
			class_i.DA(var_ha, i_6_,
				   i_8_ - class_i.a(i_7_, i_6_, true), i_7_, 0,
				   false);
		}
	    }
	}
    }
    
    public static void a(int i) {
	if (i != 0)
	    a = null;
	a = null;
    }
    
    static final void a(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_, int i_16_, int i_17_,
			int i_18_) {
	if (i_15_ != 0)
	    a(null, 120, 103, -29, null);
	d++;
	if (i_18_ == i_12_ && i_10_ == i && i_11_ == i_14_ && i_17_ == i_16_)
	    ww.a(i_16_, i, i_13_, 9761, i_11_, i_18_);
	else {
	    int i_19_ = i_18_;
	    int i_20_ = i;
	    int i_21_ = 3 * i_18_;
	    int i_22_ = 3 * i;
	    int i_23_ = i_12_ * 3;
	    int i_24_ = i_10_ * 3;
	    int i_25_ = 3 * i_14_;
	    int i_26_ = 3 * i_17_;
	    int i_27_ = i_23_ - i_25_ + (i_11_ - i_18_);
	    int i_28_ = i_24_ + i_16_ - (i_26_ + i);
	    int i_29_ = i_25_ - i_23_ - i_23_ + i_21_;
	    int i_30_ = i_26_ - i_24_ + i_22_ - i_24_;
	    int i_31_ = i_23_ - i_21_;
	    int i_32_ = i_24_ - i_22_;
	    for (int i_33_ = 128; i_33_ <= 4096; i_33_ += 128) {
		int i_34_ = i_33_ * i_33_ >> 12;
		int i_35_ = i_34_ * i_33_ >> 12;
		int i_36_ = i_35_ * i_27_;
		int i_37_ = i_28_ * i_35_;
		int i_38_ = i_34_ * i_29_;
		int i_39_ = i_34_ * i_30_;
		int i_40_ = i_31_ * i_33_;
		int i_41_ = i_32_ * i_33_;
		int i_42_ = i_18_ + (i_40_ + (i_38_ + i_36_) >> 12);
		int i_43_ = i + (i_41_ + (i_37_ + i_39_) >> 12);
		ww.a(i_43_, i_20_, i_13_, i_15_ ^ 0x2621, i_42_, i_19_);
		i_20_ = i_43_;
		i_19_ = i_42_;
	    }
	}
    }
}
