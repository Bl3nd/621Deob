/* tk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tk extends la
{
    private byte[][] B;
    private int[] C;
    private int[] D;
    private int[] E;
    private int[] F;
    private nga G;
    
    final void OA(char c, int i, int i_0_, int i_1_, boolean bool) {
	i += E[c];
	i_0_ += C[c];
	int i_2_ = F[c];
	int i_3_ = D[c];
	int i_4_ = ((nga) G).C;
	int i_5_ = i + i_0_ * i_4_;
	int i_6_ = i_4_ - i_2_;
	int i_7_ = 0;
	int i_8_ = 0;
	if (i_0_ < ((nga) G).u) {
	    int i_9_ = ((nga) G).u - i_0_;
	    i_3_ -= i_9_;
	    i_0_ = ((nga) G).u;
	    i_8_ += i_9_ * i_2_;
	    i_5_ += i_9_ * i_4_;
	}
	if (i_0_ + i_3_ > ((nga) G).cb)
	    i_3_ -= i_0_ + i_3_ - ((nga) G).cb;
	if (i < ((nga) G).Y) {
	    int i_10_ = ((nga) G).Y - i;
	    i_2_ -= i_10_;
	    i = ((nga) G).Y;
	    i_8_ += i_10_;
	    i_5_ += i_10_;
	    i_7_ += i_10_;
	    i_6_ += i_10_;
	}
	if (i + i_2_ > ((nga) G).B) {
	    int i_11_ = i + i_2_ - ((nga) G).B;
	    i_2_ -= i_11_;
	    i_7_ += i_11_;
	    i_6_ += i_11_;
	}
	if (i_2_ > 0 && i_3_ > 0)
	    a(B[c], ((nga) G).H, i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
    }
    
    private final void a(byte[] is, int[] is_12_, int i, int i_13_, int i_14_,
			 int i_15_, int i_16_, int i_17_, int i_18_) {
	for (int i_19_ = -i_16_; i_19_ < 0; i_19_++) {
	    for (int i_20_ = -i_15_; i_20_ < 0; i_20_++) {
		int i_21_ = is[i_13_++] & 0xff;
		if (i_21_ != 0) {
		    int i_22_ = ((((i & 0xff00ff) * i_21_ & ~0xff00ff)
				  + ((i & 0xff00) * i_21_ & 0xff0000))
				 >> 8);
		    i_21_ = 256 - i_21_;
		    int i_23_ = is_12_[i_14_];
		    is_12_[i_14_++]
			= ((((i_23_ & 0xff00ff) * i_21_ & ~0xff00ff)
			    + ((i_23_ & 0xff00) * i_21_ & 0xff0000))
			   >> 8) + i_22_;
		} else
		    i_14_++;
	    }
	    i_14_ += i_17_;
	    i_13_ += i_18_;
	}
    }
    
    private final void a(byte[] is, int[] is_24_, int i, int i_25_, int i_26_,
			 int i_27_, int i_28_, int i_29_, int i_30_, int i_31_,
			 int i_32_, int i_33_, ua var_ua, int i_34_,
			 int i_35_) {
	nu var_nu = (nu) var_ua;
	int[] is_36_ = ((nu) var_nu).g;
	int[] is_37_ = ((nu) var_nu).k;
	int i_38_ = i_31_ - ((nga) G).Y;
	int i_39_ = i_32_;
	if (i_35_ > i_39_) {
	    i_39_ = i_35_;
	    i_26_ += (i_35_ - i_32_) * ((nga) G).C;
	    i_25_ += (i_35_ - i_32_) * i_33_;
	}
	int i_40_ = (i_35_ + is_36_.length < i_32_ + i_28_
		     ? i_35_ + is_36_.length : i_32_ + i_28_);
	for (int i_41_ = i_39_; i_41_ < i_40_; i_41_++) {
	    int i_42_ = is_36_[i_41_ - i_35_] + i_34_;
	    int i_43_ = is_37_[i_41_ - i_35_];
	    int i_44_ = i_27_;
	    if (i_38_ > i_42_) {
		int i_45_ = i_38_ - i_42_;
		if (i_45_ >= i_43_) {
		    i_25_ += i_27_ + i_30_;
		    i_26_ += i_27_ + i_29_;
		    continue;
		}
		i_43_ -= i_45_;
	    } else {
		int i_46_ = i_42_ - i_38_;
		if (i_46_ >= i_27_) {
		    i_25_ += i_27_ + i_30_;
		    i_26_ += i_27_ + i_29_;
		    continue;
		}
		i_25_ += i_46_;
		i_44_ -= i_46_;
		i_26_ += i_46_;
	    }
	    int i_47_ = 0;
	    if (i_44_ < i_43_)
		i_43_ = i_44_;
	    else
		i_47_ = i_44_ - i_43_;
	    for (int i_48_ = -i_43_; i_48_ < 0; i_48_++) {
		int i_49_ = is[i_25_++] & 0xff;
		if (i_49_ != 0) {
		    int i_50_ = ((((i & 0xff00ff) * i_49_ & ~0xff00ff)
				  + ((i & 0xff00) * i_49_ & 0xff0000))
				 >> 8);
		    i_49_ = 256 - i_49_;
		    int i_51_ = is_24_[i_26_];
		    is_24_[i_26_++]
			= ((((i_51_ & 0xff00ff) * i_49_ & ~0xff00ff)
			    + ((i_51_ & 0xff00) * i_49_ & 0xff0000))
			   >> 8) + i_50_;
		} else
		    i_26_++;
	    }
	    i_25_ += i_47_ + i_30_;
	    i_26_ += i_47_ + i_29_;
	}
    }
    
    tk(nga var_nga, sa var_sa, aga[] var_agas, int[] is, int[] is_52_) {
	super(var_nga, var_sa);
	G = var_nga;
	G = var_nga;
	F = is;
	D = is_52_;
	B = new byte[var_agas.length][];
	C = new int[var_agas.length];
	E = new int[var_agas.length];
	for (int i = 0; i < var_agas.length; i++) {
	    aga var_aga = var_agas[i];
	    if (((aga) var_aga).f != null)
		B[i] = ((aga) var_aga).f;
	    else {
		byte[] is_53_ = ((aga) var_aga).c;
		byte[] is_54_ = B[i] = new byte[is_53_.length];
		for (int i_55_ = 0; i_55_ < is_53_.length; i_55_++)
		    is_54_[i_55_] = (byte) (is_53_[i_55_] == 0 ? 0 : -1);
	    }
	    C[i] = ((aga) var_aga).g;
	    E[i] = ((aga) var_aga).e;
	}
    }
    
    final void a(char c, int i, int i_56_, int i_57_, boolean bool, ua var_ua,
		 int i_58_, int i_59_) {
	if (var_ua == null)
	    OA(c, i, i_56_, i_57_, bool);
	else {
	    i += E[c];
	    i_56_ += C[c];
	    int i_60_ = F[c];
	    int i_61_ = D[c];
	    int i_62_ = ((nga) G).C;
	    int i_63_ = i + i_56_ * i_62_;
	    int i_64_ = i_62_ - i_60_;
	    int i_65_ = 0;
	    int i_66_ = 0;
	    if (i_56_ < ((nga) G).u) {
		int i_67_ = ((nga) G).u - i_56_;
		i_61_ -= i_67_;
		i_56_ = ((nga) G).u;
		i_66_ += i_67_ * i_60_;
		i_63_ += i_67_ * i_62_;
	    }
	    if (i_56_ + i_61_ > ((nga) G).cb)
		i_61_ -= i_56_ + i_61_ - ((nga) G).cb;
	    if (i < ((nga) G).Y) {
		int i_68_ = ((nga) G).Y - i;
		i_60_ -= i_68_;
		i = ((nga) G).Y;
		i_66_ += i_68_;
		i_63_ += i_68_;
		i_65_ += i_68_;
		i_64_ += i_68_;
	    }
	    if (i + i_60_ > ((nga) G).B) {
		int i_69_ = i + i_60_ - ((nga) G).B;
		i_60_ -= i_69_;
		i_65_ += i_69_;
		i_64_ += i_69_;
	    }
	    if (i_60_ > 0 && i_61_ > 0)
		a(B[c], ((nga) G).H, i_57_, i_66_, i_63_, i_60_, i_61_, i_64_,
		  i_65_, i, i_56_, F[c], var_ua, i_58_, i_59_);
	}
    }
}
