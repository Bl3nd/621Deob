/* mh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mh
{
    byte a;
    static int b;
    boolean c;
    short d;
    int e;
    byte f;
    short g;
    int h;
    static int i;
    static GameInPacket incomingPacket13 = new GameInPacket(13, -1);
    static int k;
    short l;
    static int m;
    
    static final byte[][][] a(boolean bool, int i) {
	b++;
	byte[][][] is = new byte[8][4][];
	int i_0_ = i;
	int i_1_ = i;
	byte[] is_2_ = new byte[i_1_ * i_0_];
	int i_3_ = 0;
	for (int i_4_ = 0; i_1_ > i_4_; i_4_++) {
	    for (int i_5_ = 0; i_5_ < i_0_; i_5_++) {
		if (i_5_ <= i_4_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][0] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_6_ = i_1_ - 1; i_6_ >= 0; i_6_--) {
	    for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
		if (i_6_ >= i_7_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_8_ = 0; i_1_ > i_8_; i_8_++) {
	    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
		if (i_8_ <= i_9_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][2] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_10_ = i_1_ - 1; i_10_ >= 0; i_10_--) {
	    for (int i_11_ = 0; i_0_ > i_11_; i_11_++) {
		if (i_10_ <= i_11_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][3] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_12_ = i_1_ - 1; i_12_ >= 0; i_12_--) {
	    for (int i_13_ = 0; i_0_ > i_13_; i_13_++) {
		if (i_13_ <= i_12_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][0] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_0_ * i_1_];
	for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
	    for (int i_15_ = 0; i_15_ < i_0_; i_15_++) {
		if (i_3_ < 0 || i_3_ >= is_2_.length)
		    i_3_++;
		else {
		    if (i_14_ << 1 <= i_15_)
			is_2_[i_3_] = (byte) -1;
		    i_3_++;
		}
	    }
	}
	is[1][1] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_0_ * i_1_];
	for (int i_16_ = 0; i_16_ < i_1_; i_16_++) {
	    for (int i_17_ = i_0_ - 1; i_17_ >= 0; i_17_--) {
		if (i_17_ <= i_16_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][2] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_0_ * i_1_];
	for (int i_18_ = i_1_ - 1; i_18_ >= 0; i_18_--) {
	    for (int i_19_ = i_0_ - 1; i_19_ >= 0; i_19_--) {
		if (i_19_ >= i_18_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_20_ = i_1_ - 1; i_20_ >= 0; i_20_--) {
	    for (int i_21_ = i_0_ - 1; i_21_ >= 0; i_21_--) {
		if (i_20_ >> 1 >= i_21_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
	    for (int i_23_ = 0; i_23_ < i_0_; i_23_++) {
		if (i_23_ >= i_22_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	if (bool != false)
	    return null;
	for (int i_24_ = 0; i_1_ > i_24_; i_24_++) {
	    for (int i_25_ = 0; i_0_ > i_25_; i_25_++) {
		if (i_24_ >> 1 >= i_25_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][2] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_26_ = 0; i_1_ > i_26_; i_26_++) {
	    for (int i_27_ = i_0_ - 1; i_27_ >= 0; i_27_--) {
		if (i_27_ >= i_26_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][3] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_28_ = i_1_ - 1; i_28_ >= 0; i_28_--) {
	    for (int i_29_ = 0; i_0_ > i_29_; i_29_++) {
		if (i_29_ >= i_28_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][0] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_30_ = 0; i_30_ < i_1_; i_30_++) {
	    for (int i_31_ = 0; i_31_ < i_0_; i_31_++) {
		if (i_30_ << 1 >= i_31_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][1] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_32_ = 0; i_1_ > i_32_; i_32_++) {
	    for (int i_33_ = i_0_ - 1; i_33_ >= 0; i_33_--) {
		if (i_32_ >> 1 <= i_33_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][2] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_34_ = i_1_ - 1; i_34_ >= 0; i_34_--) {
	    for (int i_35_ = i_0_ - 1; i_35_ >= 0; i_35_--) {
		if (i_34_ << 1 >= i_35_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_36_ = i_1_ - 1; i_36_ >= 0; i_36_--) {
	    for (int i_37_ = i_0_ - 1; i_37_ >= 0; i_37_--) {
		if (i_36_ >> 1 <= i_37_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
	    for (int i_39_ = 0; i_0_ > i_39_; i_39_++) {
		if (i_38_ << 1 >= i_39_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_40_ = 0; i_40_ < i_1_; i_40_++) {
	    for (int i_41_ = 0; i_0_ > i_41_; i_41_++) {
		if (i_40_ >> 1 <= i_41_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][2] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_42_ = 0; i_1_ > i_42_; i_42_++) {
	    for (int i_43_ = i_0_ - 1; i_43_ >= 0; i_43_--) {
		if (i_42_ << 1 >= i_43_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_44_ = 0; i_1_ > i_44_; i_44_++) {
	    for (int i_45_ = 0; i_45_ < i_0_; i_45_++) {
		if (i_45_ <= i_0_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_46_ = 0; i_1_ > i_46_; i_46_++) {
	    for (int i_47_ = 0; i_47_ < i_0_; i_47_++) {
		if (i_46_ <= i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_48_ = 0; i_48_ < i_1_; i_48_++) {
	    for (int i_49_ = 0; i_49_ < i_0_; i_49_++) {
		if (i_49_ >= i_0_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_50_ = 0; i_1_ > i_50_; i_50_++) {
	    for (int i_51_ = 0; i_0_ > i_51_; i_51_++) {
		if (i_1_ / 2 <= i_50_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_52_ = 0; i_1_ > i_52_; i_52_++) {
	    for (int i_53_ = 0; i_53_ < i_0_; i_53_++) {
		if (i_53_ <= i_52_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_54_ = i_1_ - 1; i_54_ >= 0; i_54_--) {
	    for (int i_55_ = 0; i_0_ > i_55_; i_55_++) {
		if (i_54_ - i_1_ / 2 >= i_55_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][1] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_0_ * i_1_];
	for (int i_56_ = i_1_ - 1; i_56_ >= 0; i_56_--) {
	    for (int i_57_ = i_0_ - 1; i_57_ >= 0; i_57_--) {
		if (i_57_ <= i_56_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_58_ = 0; i_1_ > i_58_; i_58_++) {
	    for (int i_59_ = i_0_ - 1; i_59_ >= 0; i_59_--) {
		if (i_58_ - i_1_ / 2 >= i_59_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][3] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_60_ = 0; i_60_ < i_1_; i_60_++) {
	    for (int i_61_ = 0; i_0_ > i_61_; i_61_++) {
		if (i_60_ - i_1_ / 2 <= i_61_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][0] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_0_ * i_1_];
	for (int i_62_ = i_1_ - 1; i_62_ >= 0; i_62_--) {
	    for (int i_63_ = 0; i_63_ < i_0_; i_63_++) {
		if (i_62_ - i_1_ / 2 <= i_63_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][1] = is_2_;
	i_3_ = 0;
	is_2_ = new byte[i_1_ * i_0_];
	for (int i_64_ = i_1_ - 1; i_64_ >= 0; i_64_--) {
	    for (int i_65_ = i_0_ - 1; i_65_ >= 0; i_65_--) {
		if (i_64_ - i_1_ / 2 <= i_65_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_66_ = 0; i_1_ > i_66_; i_66_++) {
	    for (int i_67_ = i_0_ - 1; i_67_ >= 0; i_67_--) {
		if (i_67_ >= i_66_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][3] = is_2_;
	return is;
    }
    
    public static void a(int i) {
	if (i != 0)
	    a(false, -43);
	incomingPacket13 = null;
    }
    
    static final void a(boolean bool, boolean bool_68_) {
	if (bool_68_ == false) {
	    i++;
	    if (bool) {
		if (Class_vb.u != -1)
		    li.a(Class_vb.u, (int) 0);
		for (tt var_tt = (tt) ida.l.b((byte) 124); var_tt != null;
		     var_tt = (tt) ida.l.b(12561)) {
		    if (!var_tt.g(123)) {
			var_tt = (tt) ida.l.b((byte) 124);
			if (var_tt == null)
			    break;
		    }
		    vm.a(false, true, false, var_tt);
		}
		Class_vb.u = -1;
		ida.l = new il(8);
		lh.a((int) 1);
		Class_vb.u = maa.g;
		cv.a(false, (byte) 123);
		fda.a(0);
		ClientScriptHandler.a(Class_vb.u);
	    }
	    Class_ub.U = true;
	}
    }
    
    mh(int i, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_,
       int i_75_, int i_76_, boolean bool, int i_77_) {
	((mh) this).d = (short) i_73_;
	((mh) this).c = bool;
	((mh) this).e = i_77_;
	((mh) this).a = (byte) i_75_;
	((mh) this).l = (short) i_74_;
	((mh) this).h = i;
	((mh) this).f = (byte) i_76_;
	((mh) this).g = (short) i_72_;
    }
}
