/* rs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rs extends la
{
    private int[] B;
    private nga C;
    private int[] D;
    private int[] E;
    private byte[][] F;
    private int[] G;
    private int[] H;
    
    private final void a(byte[] is, int[] is_0_, int i, int i_1_, int i_2_,
			 int i_3_, int i_4_, int i_5_, int i_6_) {
	int i_7_ = -(i_3_ >> 2);
	i_3_ = -(i_3_ & 0x3);
	for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
	    for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
		if (is[i_1_++] != 0)
		    is_0_[i_2_++] = i;
		else
		    i_2_++;
		if (is[i_1_++] != 0)
		    is_0_[i_2_++] = i;
		else
		    i_2_++;
		if (is[i_1_++] != 0)
		    is_0_[i_2_++] = i;
		else
		    i_2_++;
		if (is[i_1_++] != 0)
		    is_0_[i_2_++] = i;
		else
		    i_2_++;
	    }
	    for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
		if (is[i_1_++] != 0)
		    is_0_[i_2_++] = i;
		else
		    i_2_++;
	    }
	    i_2_ += i_5_;
	    i_1_ += i_6_;
	}
    }
    
    final void OA(char c, int i, int i_11_, int i_12_, boolean bool) {
	i += D[c];
	i_11_ += H[c];
	int i_13_ = E[c];
	int i_14_ = B[c];
	int i_15_ = ((nga) C).C;
	int i_16_ = i + i_11_ * i_15_;
	int i_17_ = i_15_ - i_13_;
	int i_18_ = 0;
	int i_19_ = 0;
	if (i_11_ < ((nga) C).u) {
	    int i_20_ = ((nga) C).u - i_11_;
	    i_14_ -= i_20_;
	    i_11_ = ((nga) C).u;
	    i_19_ += i_20_ * i_13_;
	    i_16_ += i_20_ * i_15_;
	}
	if (i_11_ + i_14_ > ((nga) C).cb)
	    i_14_ -= i_11_ + i_14_ - ((nga) C).cb;
	if (i < ((nga) C).Y) {
	    int i_21_ = ((nga) C).Y - i;
	    i_13_ -= i_21_;
	    i = ((nga) C).Y;
	    i_19_ += i_21_;
	    i_16_ += i_21_;
	    i_18_ += i_21_;
	    i_17_ += i_21_;
	}
	if (i + i_13_ > ((nga) C).B) {
	    int i_22_ = i + i_13_ - ((nga) C).B;
	    i_13_ -= i_22_;
	    i_18_ += i_22_;
	    i_17_ += i_22_;
	}
	if (i_13_ > 0 && i_14_ > 0) {
	    if (bool)
		a(F[c], ((nga) C).H, i_12_, i_19_, i_16_, i_13_, i_14_, i_17_,
		  i_18_);
	    else
		a(F[c], ((nga) C).H, G, i_19_, i_16_, i_13_, i_14_, i_17_,
		  i_18_);
	}
    }
    
    rs(nga var_nga, sa var_sa, aga[] var_agas, int[] is, int[] is_23_) {
	super(var_nga, var_sa);
	C = var_nga;
	C = var_nga;
	E = is;
	B = is_23_;
	F = new byte[var_agas.length][];
	H = new int[var_agas.length];
	D = new int[var_agas.length];
	for (int i = 0; i < var_agas.length; i++) {
	    F[i] = ((aga) var_agas[i]).c;
	    H[i] = ((aga) var_agas[i]).g;
	    D[i] = ((aga) var_agas[i]).e;
	}
	G = ((aga) var_agas[0]).i;
    }
    
    private final void a(byte[] is, int[] is_24_, int[] is_25_, int i,
			 int i_26_, int i_27_, int i_28_, int i_29_, int i_30_,
			 int i_31_, int i_32_, int i_33_, int i_34_, ua var_ua,
			 int i_35_, int i_36_) {
	nu var_nu = (nu) var_ua;
	int[] is_37_ = ((nu) var_nu).g;
	int[] is_38_ = ((nu) var_nu).k;
	int i_39_ = i_32_ - ((nga) C).Y;
	int i_40_ = i_33_;
	if (i_36_ > i_40_) {
	    i_40_ = i_36_;
	    i_27_ += (i_36_ - i_33_) * ((nga) C).C;
	    i_26_ += (i_36_ - i_33_) * i_34_;
	}
	int i_41_ = (i_36_ + is_37_.length < i_33_ + i_29_
		     ? i_36_ + is_37_.length : i_33_ + i_29_);
	boolean bool = false;
	for (int i_42_ = i_40_; i_42_ < i_41_; i_42_++) {
	    int i_43_ = is_37_[i_42_ - i_36_] + i_35_;
	    int i_44_ = is_38_[i_42_ - i_36_];
	    int i_45_ = i_28_;
	    if (i_39_ > i_43_) {
		int i_46_ = i_39_ - i_43_;
		if (i_46_ >= i_44_) {
		    i_26_ += i_28_ + i_31_;
		    i_27_ += i_28_ + i_30_;
		    continue;
		}
		i_44_ -= i_46_;
	    } else {
		int i_47_ = i_43_ - i_39_;
		if (i_47_ >= i_28_) {
		    i_26_ += i_28_ + i_31_;
		    i_27_ += i_28_ + i_30_;
		    continue;
		}
		i_26_ += i_47_;
		i_45_ -= i_47_;
		i_27_ += i_47_;
	    }
	    int i_48_ = 0;
	    if (i_45_ < i_44_)
		i_44_ = i_45_;
	    else
		i_48_ = i_45_ - i_44_;
	    for (int i_49_ = -i_44_; i_49_ < 0; i_49_++) {
		int i_50_;
		if ((i_50_ = is[i_26_++]) != 0)
		    is_24_[i_27_++] = is_25_[i_50_ & 0xff];
		else
		    i_27_++;
	    }
	    i_26_ += i_48_ + i_31_;
	    i_27_ += i_48_ + i_30_;
	}
    }
    
    private final void a(byte[] is, int[] is_51_, int i, int i_52_, int i_53_,
			 int i_54_, int i_55_, int i_56_, int i_57_, int i_58_,
			 int i_59_, int i_60_, ua var_ua, int i_61_,
			 int i_62_) {
	nu var_nu = (nu) var_ua;
	int[] is_63_ = ((nu) var_nu).g;
	int[] is_64_ = ((nu) var_nu).k;
	int i_65_ = i_58_ - ((nga) C).Y;
	int i_66_ = i_59_;
	if (i_62_ > i_66_) {
	    i_66_ = i_62_;
	    i_53_ += (i_62_ - i_59_) * ((nga) C).C;
	    i_52_ += (i_62_ - i_59_) * i_60_;
	}
	int i_67_ = (i_62_ + is_63_.length < i_59_ + i_55_
		     ? i_62_ + is_63_.length : i_59_ + i_55_);
	for (int i_68_ = i_66_; i_68_ < i_67_; i_68_++) {
	    int i_69_ = is_63_[i_68_ - i_62_] + i_61_;
	    int i_70_ = is_64_[i_68_ - i_62_];
	    int i_71_ = i_54_;
	    if (i_65_ > i_69_) {
		int i_72_ = i_65_ - i_69_;
		if (i_72_ >= i_70_) {
		    i_52_ += i_54_ + i_57_;
		    i_53_ += i_54_ + i_56_;
		    continue;
		}
		i_70_ -= i_72_;
	    } else {
		int i_73_ = i_69_ - i_65_;
		if (i_73_ >= i_54_) {
		    i_52_ += i_54_ + i_57_;
		    i_53_ += i_54_ + i_56_;
		    continue;
		}
		i_52_ += i_73_;
		i_71_ -= i_73_;
		i_53_ += i_73_;
	    }
	    int i_74_ = 0;
	    if (i_71_ < i_70_)
		i_70_ = i_71_;
	    else
		i_74_ = i_71_ - i_70_;
	    for (int i_75_ = -i_70_; i_75_ < 0; i_75_++) {
		if (is[i_52_++] != 0)
		    is_51_[i_53_++] = i;
		else
		    i_53_++;
	    }
	    i_52_ += i_74_ + i_52_;
	    i_53_ += i_74_ + i_56_;
	}
    }
    
    final void a(char c, int i, int i_76_, int i_77_, boolean bool, ua var_ua,
		 int i_78_, int i_79_) {
	if (var_ua == null)
	    OA(c, i, i_76_, i_77_, bool);
	else {
	    i += D[c];
	    i_76_ += H[c];
	    int i_80_ = E[c];
	    int i_81_ = B[c];
	    int i_82_ = ((nga) C).C;
	    int i_83_ = i + i_76_ * i_82_;
	    int i_84_ = i_82_ - i_80_;
	    int i_85_ = 0;
	    int i_86_ = 0;
	    if (i_76_ < ((nga) C).u) {
		int i_87_ = ((nga) C).u - i_76_;
		i_81_ -= i_87_;
		i_76_ = ((nga) C).u;
		i_86_ += i_87_ * i_80_;
		i_83_ += i_87_ * i_82_;
	    }
	    if (i_76_ + i_81_ > ((nga) C).cb)
		i_81_ -= i_76_ + i_81_ - ((nga) C).cb;
	    if (i < ((nga) C).Y) {
		int i_88_ = ((nga) C).Y - i;
		i_80_ -= i_88_;
		i = ((nga) C).Y;
		i_86_ += i_88_;
		i_83_ += i_88_;
		i_85_ += i_88_;
		i_84_ += i_88_;
	    }
	    if (i + i_80_ > ((nga) C).B) {
		int i_89_ = i + i_80_ - ((nga) C).B;
		i_80_ -= i_89_;
		i_85_ += i_89_;
		i_84_ += i_89_;
	    }
	    if (i_80_ > 0 && i_81_ > 0) {
		if (bool)
		    a(F[c], ((nga) C).H, i_77_, i_86_, i_83_, i_80_, i_81_,
		      i_84_, i_85_, i, i_76_, E[c], var_ua, i_78_, i_79_);
		else
		    a(F[c], ((nga) C).H, G, i_77_, i_86_, i_83_, i_80_, i_81_,
		      i_84_, i_85_, i, i_76_, E[c], var_ua, i_78_, i_79_);
	    }
	}
    }
    
    private final void a(byte[] is, int[] is_90_, int[] is_91_, int i,
			 int i_92_, int i_93_, int i_94_, int i_95_,
			 int i_96_) {
	int i_97_ = -(i_93_ >> 2);
	i_93_ = -(i_93_ & 0x3);
	boolean bool = false;
	for (int i_98_ = -i_94_; i_98_ < 0; i_98_++) {
	    for (int i_99_ = i_97_; i_99_ < 0; i_99_++) {
		int i_100_;
		if ((i_100_ = is[i++]) != 0)
		    is_90_[i_92_++] = is_91_[i_100_ & 0xff];
		else
		    i_92_++;
		if ((i_100_ = is[i++]) != 0)
		    is_90_[i_92_++] = is_91_[i_100_ & 0xff];
		else
		    i_92_++;
		if ((i_100_ = is[i++]) != 0)
		    is_90_[i_92_++] = is_91_[i_100_ & 0xff];
		else
		    i_92_++;
		if ((i_100_ = is[i++]) != 0)
		    is_90_[i_92_++] = is_91_[i_100_ & 0xff];
		else
		    i_92_++;
	    }
	    for (int i_101_ = i_93_; i_101_ < 0; i_101_++) {
		int i_102_;
		if ((i_102_ = is[i++]) != 0)
		    is_90_[i_92_++] = is_91_[i_102_ & 0xff];
		else
		    i_92_++;
	    }
	    i_92_ += i_95_;
	    i += i_96_;
	}
    }
}
