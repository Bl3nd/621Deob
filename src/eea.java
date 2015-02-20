/* eea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eea
{
    private static ig a = new ig();
    
    private static final int a(int i, ig var_ig) {
	for (;;) {
	    if (((ig) var_ig).a >= i) {
		int i_0_
		    = ((ig) var_ig).I >> ((ig) var_ig).a - i & (1 << i) - 1;
		((ig) var_ig).a -= i;
		return i_0_;
	    }
	    ((ig) var_ig).I = (((ig) var_ig).I << 8
			       | ((ig) var_ig).u[((ig) var_ig).t] & 0xff);
	    ((ig) var_ig).a += 8;
	    ((ig) var_ig).t++;
	    ((ig) var_ig).D++;
	}
    }
    
    private static final void a(ig var_ig) {
	boolean bool = false;
	boolean bool_1_ = false;
	boolean bool_2_ = false;
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	int i = 0;
	int[] is = null;
	int[] is_18_ = null;
	int[] is_19_ = null;
	((ig) var_ig).d = 1;
	if (ISAAC.h == null)
	    ISAAC.h = new int[((ig) var_ig).d * 100000];
	boolean bool_20_ = true;
	while (bool_20_) {
	    byte i_21_ = e(var_ig);
	    if (i_21_ == 23)
		break;
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = e(var_ig);
	    i_21_ = b(var_ig);
	    ((ig) var_ig).m = 0;
	    int i_22_ = e(var_ig);
	    ((ig) var_ig).m = ((ig) var_ig).m << 8 | i_22_ & 0xff;
	    i_22_ = e(var_ig);
	    ((ig) var_ig).m = ((ig) var_ig).m << 8 | i_22_ & 0xff;
	    i_22_ = e(var_ig);
	    ((ig) var_ig).m = ((ig) var_ig).m << 8 | i_22_ & 0xff;
	    for (int i_23_ = 0; i_23_ < 16; i_23_++) {
		i_21_ = b(var_ig);
		if (i_21_ == 1)
		    ((ig) var_ig).H[i_23_] = true;
		else
		    ((ig) var_ig).H[i_23_] = false;
	    }
	    for (int i_24_ = 0; i_24_ < 256; i_24_++)
		((ig) var_ig).C[i_24_] = false;
	    for (int i_25_ = 0; i_25_ < 16; i_25_++) {
		if (((ig) var_ig).H[i_25_]) {
		    for (int i_26_ = 0; i_26_ < 16; i_26_++) {
			i_21_ = b(var_ig);
			if (i_21_ == 1)
			    ((ig) var_ig).C[i_25_ * 16 + i_26_] = true;
		    }
		}
	    }
	    c(var_ig);
	    int i_27_ = ((ig) var_ig).s + 2;
	    int i_28_ = a(3, var_ig);
	    int i_29_ = a(15, var_ig);
	    for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
		int i_31_ = 0;
		for (;;) {
		    i_21_ = b(var_ig);
		    if (i_21_ == 0)
			break;
		    i_31_++;
		}
		((ig) var_ig).j[i_30_] = (byte) i_31_;
	    }
	    byte[] is_32_ = new byte[6];
	    for (byte i_33_ = 0; i_33_ < i_28_; i_33_++)
		is_32_[i_33_] = i_33_;
	    for (int i_34_ = 0; i_34_ < i_29_; i_34_++) {
		byte i_35_ = ((ig) var_ig).j[i_34_];
		byte i_36_ = is_32_[i_35_];
		for (/**/; i_35_ > 0; i_35_--)
		    is_32_[i_35_] = is_32_[i_35_ - 1];
		is_32_[0] = i_36_;
		((ig) var_ig).k[i_34_] = i_36_;
	    }
	    for (int i_37_ = 0; i_37_ < i_28_; i_37_++) {
		int i_38_ = a(5, var_ig);
		for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
		    for (;;) {
			i_21_ = b(var_ig);
			if (i_21_ == 0)
			    break;
			i_21_ = b(var_ig);
			if (i_21_ == 0)
			    i_38_++;
			else
			    i_38_--;
		    }
		    ((ig) var_ig).A[i_37_][i_39_] = (byte) i_38_;
		}
	    }
	    for (int i_40_ = 0; i_40_ < i_28_; i_40_++) {
		int i_41_ = 32;
		byte i_42_ = 0;
		for (int i_43_ = 0; i_43_ < i_27_; i_43_++) {
		    if (((ig) var_ig).A[i_40_][i_43_] > i_42_)
			i_42_ = ((ig) var_ig).A[i_40_][i_43_];
		    if (((ig) var_ig).A[i_40_][i_43_] < i_41_)
			i_41_ = ((ig) var_ig).A[i_40_][i_43_];
		}
		a(((ig) var_ig).F[i_40_], ((ig) var_ig).h[i_40_],
		  ((ig) var_ig).l[i_40_], ((ig) var_ig).A[i_40_], i_41_, i_42_,
		  i_27_);
		((ig) var_ig).f[i_40_] = i_41_;
	    }
	    int i_44_ = ((ig) var_ig).s + 1;
	    int i_45_ = -1;
	    int i_46_ = 0;
	    for (int i_47_ = 0; i_47_ <= 255; i_47_++)
		((ig) var_ig).p[i_47_] = 0;
	    int i_48_ = 4095;
	    for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
		for (int i_50_ = 15; i_50_ >= 0; i_50_--) {
		    ((ig) var_ig).c[i_48_] = (byte) (i_49_ * 16 + i_50_);
		    i_48_--;
		}
		((ig) var_ig).y[i_49_] = i_48_ + 1;
	    }
	    int i_51_ = 0;
	    if (i_46_ == 0) {
		i_45_++;
		i_46_ = 50;
		byte i_52_ = ((ig) var_ig).k[i_45_];
		i = ((ig) var_ig).f[i_52_];
		is = ((ig) var_ig).F[i_52_];
		is_19_ = ((ig) var_ig).l[i_52_];
		is_18_ = ((ig) var_ig).h[i_52_];
	    }
	    i_46_--;
	    int i_53_ = i;
	    int i_54_;
	    int i_55_;
	    for (i_55_ = a(i_53_, var_ig); i_55_ > is[i_53_];
		 i_55_ = i_55_ << 1 | i_54_) {
		i_53_++;
		i_54_ = b(var_ig);
	    }
	    int i_56_ = is_19_[i_55_ - is_18_[i_53_]];
	    while (i_56_ != i_44_) {
		if (i_56_ == 0 || i_56_ == 1) {
		    int i_57_ = -1;
		    int i_58_ = 1;
		    do {
			if (i_56_ == 0)
			    i_57_ += i_58_;
			else if (i_56_ == 1)
			    i_57_ += 2 * i_58_;
			i_58_ *= 2;
			if (i_46_ == 0) {
			    i_45_++;
			    i_46_ = 50;
			    byte i_59_ = ((ig) var_ig).k[i_45_];
			    i = ((ig) var_ig).f[i_59_];
			    is = ((ig) var_ig).F[i_59_];
			    is_19_ = ((ig) var_ig).l[i_59_];
			    is_18_ = ((ig) var_ig).h[i_59_];
			}
			i_46_--;
			i_53_ = i;
			for (i_55_ = a(i_53_, var_ig); i_55_ > is[i_53_];
			     i_55_ = i_55_ << 1 | i_54_) {
			    i_53_++;
			    i_54_ = b(var_ig);
			}
			i_56_ = is_19_[i_55_ - is_18_[i_53_]];
		    } while (i_56_ == 0 || i_56_ == 1);
		    i_57_++;
		    i_22_ = (((ig) var_ig).z
			     [((ig) var_ig).c[((ig) var_ig).y[0]] & 0xff]);
		    ((ig) var_ig).p[i_22_ & 0xff] += i_57_;
		    for (/**/; i_57_ > 0; i_57_--) {
			ISAAC.h[i_51_] = i_22_ & 0xff;
			i_51_++;
		    }
		} else {
		    int i_60_ = i_56_ - 1;
		    if (i_60_ < 16) {
			int i_61_ = ((ig) var_ig).y[0];
			i_21_ = ((ig) var_ig).c[i_61_ + i_60_];
			for (/**/; i_60_ > 3; i_60_ -= 4) {
			    int i_62_ = i_61_ + i_60_;
			    ((ig) var_ig).c[i_62_]
				= ((ig) var_ig).c[i_62_ - 1];
			    ((ig) var_ig).c[i_62_ - 1]
				= ((ig) var_ig).c[i_62_ - 2];
			    ((ig) var_ig).c[i_62_ - 2]
				= ((ig) var_ig).c[i_62_ - 3];
			    ((ig) var_ig).c[i_62_ - 3]
				= ((ig) var_ig).c[i_62_ - 4];
			}
			for (/**/; i_60_ > 0; i_60_--)
			    ((ig) var_ig).c[i_61_ + i_60_]
				= ((ig) var_ig).c[i_61_ + i_60_ - 1];
			((ig) var_ig).c[i_61_] = i_21_;
		    } else {
			int i_63_ = i_60_ / 16;
			int i_64_ = i_60_ % 16;
			int i_65_ = ((ig) var_ig).y[i_63_] + i_64_;
			i_21_ = ((ig) var_ig).c[i_65_];
			for (/**/; i_65_ > ((ig) var_ig).y[i_63_]; i_65_--)
			    ((ig) var_ig).c[i_65_]
				= ((ig) var_ig).c[i_65_ - 1];
			((ig) var_ig).y[i_63_]++;
			for (/**/; i_63_ > 0; i_63_--) {
			    ((ig) var_ig).y[i_63_]--;
			    ((ig) var_ig).c[((ig) var_ig).y[i_63_]]
				= (((ig) var_ig).c
				   [((ig) var_ig).y[i_63_ - 1] + 16 - 1]);
			}
			((ig) var_ig).y[0]--;
			((ig) var_ig).c[((ig) var_ig).y[0]] = i_21_;
			if (((ig) var_ig).y[0] == 0) {
			    int i_66_ = 4095;
			    for (int i_67_ = 15; i_67_ >= 0; i_67_--) {
				for (int i_68_ = 15; i_68_ >= 0; i_68_--) {
				    ((ig) var_ig).c[i_66_]
					= (((ig) var_ig).c
					   [((ig) var_ig).y[i_67_] + i_68_]);
				    i_66_--;
				}
				((ig) var_ig).y[i_67_] = i_66_ + 1;
			    }
			}
		    }
		    ((ig) var_ig).p[((ig) var_ig).z[i_21_ & 0xff] & 0xff]++;
		    ISAAC.h[i_51_] = ((ig) var_ig).z[i_21_ & 0xff] & 0xff;
		    i_51_++;
		    if (i_46_ == 0) {
			i_45_++;
			i_46_ = 50;
			byte i_69_ = ((ig) var_ig).k[i_45_];
			i = ((ig) var_ig).f[i_69_];
			is = ((ig) var_ig).F[i_69_];
			is_19_ = ((ig) var_ig).l[i_69_];
			is_18_ = ((ig) var_ig).h[i_69_];
		    }
		    i_46_--;
		    i_53_ = i;
		    for (i_55_ = a(i_53_, var_ig); i_55_ > is[i_53_];
			 i_55_ = i_55_ << 1 | i_54_) {
			i_53_++;
			i_54_ = b(var_ig);
		    }
		    i_56_ = is_19_[i_55_ - is_18_[i_53_]];
		}
	    }
	    ((ig) var_ig).r = 0;
	    ((ig) var_ig).o = (byte) 0;
	    ((ig) var_ig).v[0] = 0;
	    for (int i_70_ = 1; i_70_ <= 256; i_70_++)
		((ig) var_ig).v[i_70_] = ((ig) var_ig).p[i_70_ - 1];
	    for (int i_71_ = 1; i_71_ <= 256; i_71_++)
		((ig) var_ig).v[i_71_] += ((ig) var_ig).v[i_71_ - 1];
	    for (int i_72_ = 0; i_72_ < i_51_; i_72_++) {
		i_22_ = (byte) (ISAAC.h[i_72_] & 0xff);
		ISAAC.h[((ig) var_ig).v[i_22_ & 0xff]] |= i_72_ << 8;
		((ig) var_ig).v[i_22_ & 0xff]++;
	    }
	    ((ig) var_ig).w = ISAAC.h[((ig) var_ig).m] >> 8;
	    ((ig) var_ig).x = 0;
	    ((ig) var_ig).w = ISAAC.h[((ig) var_ig).w];
	    ((ig) var_ig).i = (byte) (((ig) var_ig).w & 0xff);
	    ((ig) var_ig).w >>= 8;
	    ((ig) var_ig).x++;
	    ((ig) var_ig).E = i_51_;
	    d(var_ig);
	    if (((ig) var_ig).x == ((ig) var_ig).E + 1 && ((ig) var_ig).r == 0)
		bool_20_ = true;
	    else
		bool_20_ = false;
	}
    }
    
    private static final byte b(ig var_ig) {
	return (byte) a(1, var_ig);
    }
    
    private static final void a(int[] is, int[] is_73_, int[] is_74_,
				byte[] is_75_, int i, int i_76_, int i_77_) {
	int i_78_ = 0;
	for (int i_79_ = i; i_79_ <= i_76_; i_79_++) {
	    for (int i_80_ = 0; i_80_ < i_77_; i_80_++) {
		if (is_75_[i_80_] == i_79_) {
		    is_74_[i_78_] = i_80_;
		    i_78_++;
		}
	    }
	}
	for (int i_81_ = 0; i_81_ < 23; i_81_++)
	    is_73_[i_81_] = 0;
	for (int i_82_ = 0; i_82_ < i_77_; i_82_++)
	    is_73_[is_75_[i_82_] + 1]++;
	for (int i_83_ = 1; i_83_ < 23; i_83_++)
	    is_73_[i_83_] += is_73_[i_83_ - 1];
	for (int i_84_ = 0; i_84_ < 23; i_84_++)
	    is[i_84_] = 0;
	int i_85_ = 0;
	for (int i_86_ = i; i_86_ <= i_76_; i_86_++) {
	    i_85_ += is_73_[i_86_ + 1] - is_73_[i_86_];
	    is[i_86_] = i_85_ - 1;
	    i_85_ <<= 1;
	}
	for (int i_87_ = i + 1; i_87_ <= i_76_; i_87_++)
	    is_73_[i_87_] = (is[i_87_ - 1] + 1 << 1) - is_73_[i_87_];
    }
    
    private static final void c(ig var_ig) {
	((ig) var_ig).s = 0;
	for (int i = 0; i < 256; i++) {
	    if (((ig) var_ig).C[i]) {
		((ig) var_ig).z[((ig) var_ig).s] = (byte) i;
		((ig) var_ig).s++;
	    }
	}
    }
    
    public static void a() {
	a = null;
    }
    
    private static final void d(ig var_ig) {
	byte i = ((ig) var_ig).o;
	int i_88_ = ((ig) var_ig).r;
	int i_89_ = ((ig) var_ig).x;
	int i_90_ = ((ig) var_ig).i;
	int[] is = ISAAC.h;
	int i_91_ = ((ig) var_ig).w;
	byte[] is_92_ = ((ig) var_ig).n;
	int i_93_ = ((ig) var_ig).q;
	int i_94_ = ((ig) var_ig).g;
	int i_95_ = i_94_;
	int i_96_ = ((ig) var_ig).E + 1;
    while_35_:
	for (;;) {
	    if (i_88_ > 0) {
		for (;;) {
		    if (i_94_ == 0)
			break while_35_;
		    if (i_88_ == 1)
			break;
		    is_92_[i_93_] = i;
		    i_88_--;
		    i_93_++;
		    i_94_--;
		}
		if (i_94_ == 0) {
		    i_88_ = 1;
		    break;
		}
		is_92_[i_93_] = i;
		i_93_++;
		i_94_--;
	    }
	    for (;;) {
		if (i_89_ == i_96_) {
		    i_88_ = 0;
		    break while_35_;
		}
		i = (byte) i_90_;
		i_91_ = is[i_91_];
		int i_97_ = (byte) i_91_;
		i_91_ >>= 8;
		i_89_++;
		if (i_97_ != i_90_) {
		    i_90_ = i_97_;
		    if (i_94_ == 0) {
			i_88_ = 1;
			break while_35_;
		    }
		    is_92_[i_93_] = i;
		    i_93_++;
		    i_94_--;
		} else {
		    if (i_89_ != i_96_)
			break;
		    if (i_94_ == 0) {
			i_88_ = 1;
			break while_35_;
		    }
		    is_92_[i_93_] = i;
		    i_93_++;
		    i_94_--;
		}
	    }
	    i_88_ = 2;
	    i_91_ = is[i_91_];
	    int i_98_ = (byte) i_91_;
	    i_91_ >>= 8;
	    if (++i_89_ != i_96_) {
		if (i_98_ != i_90_)
		    i_90_ = i_98_;
		else {
		    i_88_ = 3;
		    i_91_ = is[i_91_];
		    i_98_ = (byte) i_91_;
		    i_91_ >>= 8;
		    if (++i_89_ != i_96_) {
			if (i_98_ != i_90_)
			    i_90_ = i_98_;
			else {
			    i_91_ = is[i_91_];
			    i_98_ = (byte) i_91_;
			    i_91_ >>= 8;
			    i_89_++;
			    i_88_ = (i_98_ & 0xff) + 4;
			    i_91_ = is[i_91_];
			    i_90_ = (byte) i_91_;
			    i_91_ >>= 8;
			    i_89_++;
			}
		    }
		}
	    }
	}
	int i_99_ = ((ig) var_ig).G;
	((ig) var_ig).G += i_95_ - i_94_;
	((ig) var_ig).o = i;
	((ig) var_ig).r = i_88_;
	((ig) var_ig).x = i_89_;
	((ig) var_ig).i = i_90_;
	ISAAC.h = is;
	((ig) var_ig).w = i_91_;
	((ig) var_ig).n = is_92_;
	((ig) var_ig).q = i_93_;
	((ig) var_ig).g = i_94_;
    }
    
    static final int a(byte[] is, int i, byte[] is_100_, int i_101_,
		       int i_102_) {
	synchronized (a) {
	    ((ig) a).u = is_100_;
	    ((ig) a).t = i_102_;
	    ((ig) a).n = is;
	    ((ig) a).q = 0;
	    ((ig) a).g = i;
	    ((ig) a).a = 0;
	    ((ig) a).I = 0;
	    ((ig) a).D = 0;
	    ((ig) a).G = 0;
	    a(a);
	    i -= ((ig) a).g;
	    ((ig) a).u = null;
	    ((ig) a).n = null;
	    return i;
	}
    }
    
    private static final byte e(ig var_ig) {
	return (byte) a(8, var_ig);
    }
}
