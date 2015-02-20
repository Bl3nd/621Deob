/* Class_ef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ef extends gga
{
    static int A;
    static long B;
    static int C;
    static int D;
    static long E = 0L;
    static GameInPacket F = new GameInPacket(87, 6);
    static jf G;
    static int[] I = new int[1000];
    static hl J;
    static int K;
    static int[] L = { 2047, 16383, 65535 };
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_) {
	A++;
	int i_7_ = 0;
	int i_8_ = i_2_;
	int i_9_ = 0;
	int i_10_ = i_0_ - i_4_;
	int i_11_ = i_2_ - i_4_;
	int i_12_ = i_0_ * i_0_;
	int i_13_ = i_2_ * i_2_;
	int i_14_ = i_10_ * i_10_;
	int i_15_ = i_11_ * i_11_;
	int i_16_ = i_13_ << 1;
	int i_17_ = i_12_ << 1;
	int i_18_ = i_15_ << 1;
	int i_19_ = i_14_ << 1;
	int i_20_ = i_2_ << 1;
	int i_21_ = i_11_ << 1;
	int i_22_ = i_16_ + i_12_ * (1 - i_20_);
	int i_23_ = i_13_ - i_17_ * (i_20_ - 1);
	int i_24_ = -123 % ((-8 - i_3_) / 38);
	int i_25_ = (-i_21_ + 1) * i_14_ + i_18_;
	int i_26_ = i_15_ - i_19_ * (i_21_ - 1);
	int i_27_ = i_12_ << 2;
	int i_28_ = i_13_ << 2;
	int i_29_ = i_14_ << 2;
	int i_30_ = i_15_ << 2;
	int i_31_ = 3 * i_16_;
	int i_32_ = (i_20_ - 3) * i_17_;
	int i_33_ = 3 * i_18_;
	int i_34_ = i_19_ * (i_21_ - 3);
	int i_35_ = i_28_;
	int i_36_ = (i_2_ - 1) * i_27_;
	int i_37_ = i_30_;
	int i_38_ = (i_11_ - 1) * i_29_;
	int[] is = wh.O[i_5_];
	kg.a(i - i_0_, is, i_1_, i - i_10_, -107);
	kg.a(i - i_10_, is, i_6_, i + i_10_, -128);
	kg.a(i + i_10_, is, i_1_, i + i_0_, 65);
	while (i_8_ > 0) {
	    boolean bool = i_8_ <= i_11_;
	    if (bool) {
		if (i_25_ < 0) {
		    while (i_25_ < 0) {
			i_26_ += i_37_;
			i_25_ += i_33_;
			i_37_ += i_30_;
			i_9_++;
			i_33_ += i_30_;
		    }
		}
		if (i_26_ < 0) {
		    i_25_ += i_33_;
		    i_26_ += i_37_;
		    i_37_ += i_30_;
		    i_9_++;
		    i_33_ += i_30_;
		}
		i_26_ -= i_34_;
		i_25_ -= i_38_;
		i_34_ -= i_29_;
		i_38_ -= i_29_;
	    }
	    if (i_22_ < 0) {
		while (i_22_ < 0) {
		    i_22_ += i_31_;
		    i_23_ += i_35_;
		    i_35_ += i_28_;
		    i_31_ += i_28_;
		    i_7_++;
		}
	    }
	    if (i_23_ < 0) {
		i_22_ += i_31_;
		i_23_ += i_35_;
		i_31_ += i_28_;
		i_35_ += i_28_;
		i_7_++;
	    }
	    i_23_ -= i_32_;
	    i_22_ -= i_36_;
	    i_8_--;
	    i_36_ -= i_27_;
	    i_32_ -= i_27_;
	    int i_39_ = i_5_ - i_8_;
	    int i_40_ = i_5_ + i_8_;
	    int i_41_ = i_7_ + i;
	    int i_42_ = i - i_7_;
	    if (bool) {
		int i_43_ = i_9_ + i;
		int i_44_ = i - i_9_;
		kg.a(i_42_, wh.O[i_39_], i_1_, i_44_, 47);
		kg.a(i_44_, wh.O[i_39_], i_6_, i_43_, 119);
		kg.a(i_43_, wh.O[i_39_], i_1_, i_41_, -113);
		kg.a(i_42_, wh.O[i_40_], i_1_, i_44_, 20);
		kg.a(i_44_, wh.O[i_40_], i_6_, i_43_, 39);
		kg.a(i_43_, wh.O[i_40_], i_1_, i_41_, -116);
	    } else {
		kg.a(i_42_, wh.O[i_39_], i_1_, i_41_, 62);
		kg.a(i_42_, wh.O[i_40_], i_1_, i_41_, 102);
	    }
	}
    }
    
    final void a(int i, int i_45_, byte i_46_, int i_47_) {
	((gga) this).z = i;
	((gga) this).n = i_47_;
	D++;
	if (i_46_ <= -18)
	    ((gga) this).o = i_45_;
    }
    
    public static void j(int i) {
	I = null;
	J = null;
	if (i != 0)
	    a(77, 57, 55, -115, 106, -18, -3, 44);
	L = null;
	F = null;
	G = null;
    }
    
    final void a(int i, float f) {
	K++;
	((gga) this).r = f;
	if (i != 0)
	    F = null;
    }
    
    Class_ef(int i, int i_48_, int i_49_, int i_50_, int i_51_, float f) {
	super(i, i_48_, i_49_, i_50_, i_51_, f);
    }
    
    static final void k(int i) {
	int i_52_ = 0;
	if (i < 26)
	    G = null;
	for (/**/; i_52_ < Class_qb.i.length; i_52_++) {
	    for (int i_53_ = 0; Class_qb.i[i_52_].length > i_53_; i_53_++)
		Class_qb.i[i_52_][i_53_] = th.d;
	}
	C++;
    }
}
