/* np - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class np extends la
{
    private nga B;
    private int[] C;
    private byte[][] D;
    private int[] E;
    private int[] F;
    private int[] G;
    
    private final void a(byte[] is, int[] is_0_, int i, int i_1_, int i_2_,
			 int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
			 int i_8_, int i_9_, ua var_ua, int i_10_, int i_11_) {
	nu var_nu = (nu) var_ua;
	int[] is_12_ = ((nu) var_nu).g;
	int[] is_13_ = ((nu) var_nu).k;
	int i_14_ = i_7_ - ((nga) B).Y;
	int i_15_ = i_8_;
	if (i_11_ > i_15_) {
	    i_15_ = i_11_;
	    i_2_ += (i_11_ - i_8_) * ((nga) B).C;
	    i_1_ += (i_11_ - i_8_) * i_9_;
	}
	int i_16_ = (i_11_ + is_12_.length < i_8_ + i_4_
		     ? i_11_ + is_12_.length : i_8_ + i_4_);
	int i_17_ = i >>> 24;
	int i_18_ = 255 - i_17_;
	for (int i_19_ = i_15_; i_19_ < i_16_; i_19_++) {
	    int i_20_ = is_12_[i_19_ - i_11_] + i_10_;
	    int i_21_ = is_13_[i_19_ - i_11_];
	    int i_22_ = i_3_;
	    if (i_14_ > i_20_) {
		int i_23_ = i_14_ - i_20_;
		if (i_23_ >= i_21_) {
		    i_1_ += i_3_ + i_6_;
		    i_2_ += i_3_ + i_5_;
		    continue;
		}
		i_21_ -= i_23_;
	    } else {
		int i_24_ = i_20_ - i_14_;
		if (i_24_ >= i_3_) {
		    i_1_ += i_3_ + i_6_;
		    i_2_ += i_3_ + i_5_;
		    continue;
		}
		i_1_ += i_24_;
		i_22_ -= i_24_;
		i_2_ += i_24_;
	    }
	    int i_25_ = 0;
	    if (i_22_ < i_21_)
		i_21_ = i_22_;
	    else
		i_25_ = i_22_ - i_21_;
	    for (int i_26_ = -i_21_; i_26_ < 0; i_26_++) {
		if (is[i_1_++] != 0) {
		    int i_27_ = ((((i & 0xff00ff) * i_17_ & ~0xff00ff)
				  + ((i & 0xff00) * i_17_ & 0xff0000))
				 >> 8);
		    int i_28_ = is_0_[i_2_];
		    is_0_[i_2_++] = ((((i_28_ & 0xff00ff) * i_18_ & ~0xff00ff)
				      + ((i_28_ & 0xff00) * i_18_ & 0xff0000))
				     >> 8) + i_27_;
		} else
		    i_2_++;
	    }
	    i_1_ += i_25_ + i_6_;
	    i_2_ += i_25_ + i_5_;
	}
    }
    
    private final void a(byte[] is, int[] is_29_, int i, int i_30_, int i_31_,
			 int i_32_, int i_33_, int i_34_, int i_35_) {
	int i_36_ = i >>> 24;
	int i_37_ = 255 - i_36_;
	for (int i_38_ = -i_33_; i_38_ < 0; i_38_++) {
	    for (int i_39_ = -i_32_; i_39_ < 0; i_39_++) {
		if (is[i_30_++] != 0) {
		    int i_40_ = ((((i & 0xff00ff) * i_36_ & ~0xff00ff)
				  + ((i & 0xff00) * i_36_ & 0xff0000))
				 >> 8);
		    int i_41_ = is_29_[i_31_];
		    is_29_[i_31_++]
			= ((((i_41_ & 0xff00ff) * i_37_ & ~0xff00ff)
			    + ((i_41_ & 0xff00) * i_37_ & 0xff0000))
			   >> 8) + i_40_;
		} else
		    i_31_++;
	    }
	    i_31_ += i_34_;
	    i_30_ += i_35_;
	}
    }
    
    private final void b(byte[] is, int[] is_42_, int i, int i_43_, int i_44_,
			 int i_45_, int i_46_, int i_47_, int i_48_) {
	int i_49_ = -(i_45_ >> 2);
	i_45_ = -(i_45_ & 0x3);
	for (int i_50_ = -i_46_; i_50_ < 0; i_50_++) {
	    for (int i_51_ = i_49_; i_51_ < 0; i_51_++) {
		if (is[i_43_++] != 0)
		    is_42_[i_44_++] = i;
		else
		    i_44_++;
		if (is[i_43_++] != 0)
		    is_42_[i_44_++] = i;
		else
		    i_44_++;
		if (is[i_43_++] != 0)
		    is_42_[i_44_++] = i;
		else
		    i_44_++;
		if (is[i_43_++] != 0)
		    is_42_[i_44_++] = i;
		else
		    i_44_++;
	    }
	    for (int i_52_ = i_45_; i_52_ < 0; i_52_++) {
		if (is[i_43_++] != 0)
		    is_42_[i_44_++] = i;
		else
		    i_44_++;
	    }
	    i_44_ += i_47_;
	    i_43_ += i_48_;
	}
    }
    
    final void OA(char c, int i, int i_53_, int i_54_, boolean bool) {
	i += E[c];
	i_53_ += G[c];
	int i_55_ = F[c];
	int i_56_ = C[c];
	int i_57_ = ((nga) B).C;
	int i_58_ = i + i_53_ * i_57_;
	int i_59_ = i_57_ - i_55_;
	int i_60_ = 0;
	int i_61_ = 0;
	if (i_53_ < ((nga) B).u) {
	    int i_62_ = ((nga) B).u - i_53_;
	    i_56_ -= i_62_;
	    i_53_ = ((nga) B).u;
	    i_61_ += i_62_ * i_55_;
	    i_58_ += i_62_ * i_57_;
	}
	if (i_53_ + i_56_ > ((nga) B).cb)
	    i_56_ -= i_53_ + i_56_ - ((nga) B).cb;
	if (i < ((nga) B).Y) {
	    int i_63_ = ((nga) B).Y - i;
	    i_55_ -= i_63_;
	    i = ((nga) B).Y;
	    i_61_ += i_63_;
	    i_58_ += i_63_;
	    i_60_ += i_63_;
	    i_59_ += i_63_;
	}
	if (i + i_55_ > ((nga) B).B) {
	    int i_64_ = i + i_55_ - ((nga) B).B;
	    i_55_ -= i_64_;
	    i_60_ += i_64_;
	    i_59_ += i_64_;
	}
	if (i_55_ > 0 && i_56_ > 0) {
	    if ((i_54_ & ~0xffffff) == -16777216)
		b(D[c], ((nga) B).H, i_54_, i_61_, i_58_, i_55_, i_56_, i_59_,
		  i_60_);
	    else if ((i_54_ & ~0xffffff) != 0)
		a(D[c], ((nga) B).H, i_54_, i_61_, i_58_, i_55_, i_56_, i_59_,
		  i_60_);
	}
    }
    
    np(nga var_nga, sa var_sa, aga[] var_agas, int[] is, int[] is_65_) {
	super(var_nga, var_sa);
	B = var_nga;
	F = is;
	C = is_65_;
	D = new byte[var_agas.length][];
	G = new int[var_agas.length];
	E = new int[var_agas.length];
	for (int i = 0; i < var_agas.length; i++) {
	    D[i] = ((aga) var_agas[i]).c;
	    G[i] = ((aga) var_agas[i]).g;
	    E[i] = ((aga) var_agas[i]).e;
	}
    }
    
    final void a(char c, int i, int i_66_, int i_67_, boolean bool, ua var_ua,
		 int i_68_, int i_69_) {
	if (var_ua == null)
	    OA(c, i, i_66_, i_67_, bool);
	else {
	    i += E[c];
	    i_66_ += G[c];
	    int i_70_ = F[c];
	    int i_71_ = C[c];
	    int i_72_ = ((nga) B).C;
	    int i_73_ = i + i_66_ * i_72_;
	    int i_74_ = i_72_ - i_70_;
	    int i_75_ = 0;
	    int i_76_ = 0;
	    if (i_66_ < ((nga) B).u) {
		int i_77_ = ((nga) B).u - i_66_;
		i_71_ -= i_77_;
		i_66_ = ((nga) B).u;
		i_76_ += i_77_ * i_70_;
		i_73_ += i_77_ * i_72_;
	    }
	    if (i_66_ + i_71_ > ((nga) B).cb)
		i_71_ -= i_66_ + i_71_ - ((nga) B).cb;
	    if (i < ((nga) B).Y) {
		int i_78_ = ((nga) B).Y - i;
		i_70_ -= i_78_;
		i = ((nga) B).Y;
		i_76_ += i_78_;
		i_73_ += i_78_;
		i_75_ += i_78_;
		i_74_ += i_78_;
	    }
	    if (i + i_70_ > ((nga) B).B) {
		int i_79_ = i + i_70_ - ((nga) B).B;
		i_70_ -= i_79_;
		i_75_ += i_79_;
		i_74_ += i_79_;
	    }
	    if (i_70_ > 0 && i_71_ > 0) {
		if ((i_67_ & ~0xffffff) == -16777216)
		    b(D[c], ((nga) B).H, i_67_, i_76_, i_73_, i_70_, i_71_,
		      i_74_, i_75_, i, i_66_, F[c], var_ua, i_68_, i_69_);
		else
		    a(D[c], ((nga) B).H, i_67_, i_76_, i_73_, i_70_, i_71_,
		      i_74_, i_75_, i, i_66_, F[c], var_ua, i_68_, i_69_);
	    }
	}
    }
    
    private final void b(byte[] is, int[] is_80_, int i, int i_81_, int i_82_,
			 int i_83_, int i_84_, int i_85_, int i_86_, int i_87_,
			 int i_88_, int i_89_, ua var_ua, int i_90_,
			 int i_91_) {
	nu var_nu = (nu) var_ua;
	int[] is_92_ = ((nu) var_nu).g;
	int[] is_93_ = ((nu) var_nu).k;
	int i_94_ = i_88_;
	if (i_91_ > i_94_) {
	    i_94_ = i_91_;
	    i_82_ += (i_91_ - i_88_) * ((nga) B).C;
	    i_81_ += (i_91_ - i_88_) * i_89_;
	}
	int i_95_ = (i_91_ + is_92_.length < i_88_ + i_84_
		     ? i_91_ + is_92_.length : i_88_ + i_84_);
	for (int i_96_ = i_94_; i_96_ < i_95_; i_96_++) {
	    int i_97_ = i_90_ + is_92_[i_96_ - i_91_];
	    int i_98_ = is_93_[i_96_ - i_91_];
	    int i_99_ = i_83_;
	    if (i_87_ > i_97_) {
		int i_100_ = i_87_ - i_97_;
		if (i_100_ >= i_98_) {
		    i_81_ += i_83_ + i_86_;
		    i_82_ += i_83_ + i_85_;
		    continue;
		}
		i_98_ -= i_100_;
	    } else {
		int i_101_ = i_97_ - i_87_;
		if (i_101_ >= i_83_) {
		    i_81_ += i_83_ + i_86_;
		    i_82_ += i_83_ + i_85_;
		    continue;
		}
		i_81_ += i_101_;
		i_99_ -= i_101_;
		i_82_ += i_101_;
	    }
	    int i_102_ = 0;
	    if (i_99_ < i_98_)
		i_98_ = i_99_;
	    else
		i_102_ = i_99_ - i_98_;
	    for (int i_103_ = 0; i_103_ < i_98_; i_103_++) {
		if (is[i_81_++] != 0)
		    is_80_[i_82_++] = i;
		else
		    i_82_++;
	    }
	    i_81_ += i_102_ + i_86_;
	    i_82_ += i_102_ + i_85_;
	}
    }
}
