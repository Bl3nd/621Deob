/* da - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class da
{
    static jt a;
    static int b = 0;
    static int c;
    static tq[] d;
    static int e = -1;
    boolean f = false;
    static int g;
    static int h;
    static int i;
    static int[] j = new int[4];
    static int k;
    static int var_l;
    static int m;
    static int n;
    static int o;
    
    abstract void oa(int i, int i_0_, int i_1_);
    
    abstract void B(int i, int[] is, int i_2_, int i_3_, int i_4_,
		    boolean bool, int i_5_, int[] is_6_);
    
    abstract void W(int i);
    
    abstract void fa(int i);
    
    final void a(int i, Class_i class_i, int i_7_, int i_8_, int i_9_,
		 int i_10_, int i_11_, int i_12_, int i_13_) {
	n++;
	boolean bool = false;
	boolean bool_14_ = false;
	int i_15_ = i_9_;
	int i_16_ = -i_10_ / 2;
	int i_17_ = -i / 2;
	int i_18_ = class_i.a(i_17_ + i_13_, i_16_ + i_7_, true);
	int i_19_ = i_10_ / 2;
	int i_20_ = -i / 2;
	int i_21_ = class_i.a(i_20_ + i_13_, i_7_ + i_19_, true);
	int i_22_ = -i_10_ / 2;
	int i_23_ = i / 2;
	int i_24_ = class_i.a(i_23_ + i_13_, i_22_ + i_7_, true);
	int i_25_ = i_10_ / 2;
	int i_26_ = i / 2;
	int i_27_ = class_i.a(i_13_ + i_26_, i_7_ + i_25_, true);
	int i_28_ = i_18_ < i_21_ ? i_18_ : i_21_;
	int i_29_ = i_24_ < i_27_ ? i_24_ : i_27_;
	int i_30_ = i_21_ >= i_27_ ? i_27_ : i_21_;
	int i_31_ = i_18_ < i_24_ ? i_18_ : i_24_;
	if (i != 0) {
	    int i_32_ = 0x3fff & (int) (Math.atan2((double) (i_28_ - i_29_),
						   (double) i)
					* 2607.5945876176133);
	    if (i_32_ != 0) {
		if (i_8_ != 0) {
		    if (i_32_ <= 8192) {
			if (i_32_ > i_8_)
			    i_32_ = i_8_;
		    } else {
			int i_33_ = 16384 - i_8_;
			if (i_33_ > i_32_)
			    i_32_ = i_33_;
		    }
		}
		MA(i_32_);
	    }
	}
	if (i_10_ != 0) {
	    int i_34_ = ((int) (2607.5945876176133
				* Math.atan2((double) (i_31_ - i_30_),
					     (double) i_10_))
			 & 0x3fff);
	    if (i_34_ != 0) {
		if (i_12_ != 0) {
		    if (i_34_ > 8192) {
			int i_35_ = -i_12_ + 16384;
			if (i_34_ < i_35_)
			    i_34_ = i_35_;
		    } else if (i_34_ > i_12_)
			i_34_ = i_12_;
		}
		W(i_34_);
	    }
	}
	i_15_ = i_27_ + i_18_;
	if (i_15_ > i_21_ + i_24_)
	    i_15_ = i_24_ + i_21_;
	i_15_ = (i_15_ >> 1) - i_11_;
	if (i_15_ != 0)
	    oa(0, i_15_, 0);
    }
    
    abstract void DA(short i, short i_36_);
    
    abstract boolean a(int i, int i_37_, Class_q class_q, boolean bool);
    
    abstract int K();
    
    abstract void WA(int i, int i_38_, int i_39_, int i_40_);
    
    public static void a(int i) {
	j = null;
	d = null;
	if (i != -1)
	    a(true);
	a = null;
    }
    
    abstract void ga(int i);
    
    private final void a(boolean bool, gw var_gw, int i, gw var_gw_41_,
			 int i_42_, int i_43_, jj var_jj, int[] is, int i_44_,
			 boolean bool_45_, boolean[] bools, int i_46_) {
	h++;
	if (var_gw_41_ == null || i_44_ == 0) {
	    for (int i_47_ = 0; ((gw) var_gw).c > i_47_; i_47_++) {
		short i_48_ = ((gw) var_gw).k[i_47_];
		if (bools == null || !bools[i_48_] == !bool
		    || ((jj) var_jj).k[i_48_] == 0) {
		    short i_49_ = ((gw) var_gw).o[i_47_];
		    if (i_49_ != -1)
			a(0, is, 0, ((jj) var_jj).q[i_49_] & i_43_, 0,
			  bool_45_, ((jj) var_jj).s[i_49_], 2, i, 0);
		    a(((gw) var_gw).l[i_47_], is, ((gw) var_gw).f[i_47_],
		      i_43_ & ((jj) var_jj).q[i_48_], ((gw) var_gw).p[i_47_],
		      bool_45_, ((jj) var_jj).s[i_48_], 2, i,
		      ((jj) var_jj).k[i_48_]);
		}
	    }
	} else {
	    int i_50_ = 0;
	    int i_51_ = 0;
	    if (i_46_ != -8193)
		a = null;
	    for (int i_52_ = 0; ((jj) var_jj).n > i_52_; i_52_++) {
		boolean bool_53_ = false;
		if (i_50_ < ((gw) var_gw).c && ((gw) var_gw).k[i_50_] == i_52_)
		    bool_53_ = true;
		boolean bool_54_ = false;
		if (((gw) var_gw_41_).c > i_51_
		    && ((gw) var_gw_41_).k[i_51_] == i_52_)
		    bool_54_ = true;
		if (bool_53_ || bool_54_) {
		    if (bools != null && bool != bools[i_52_]
			&& ((jj) var_jj).k[i_52_] != 0) {
			if (bool_53_)
			    i_50_++;
			if (bool_54_)
			    i_51_++;
		    } else {
			int i_55_ = 0;
			int i_56_ = ((jj) var_jj).k[i_52_];
			if (i_56_ == 3 || i_56_ == 10)
			    i_55_ = 128;
			int i_57_;
			int i_58_;
			byte i_59_;
			short i_60_;
			int i_61_;
			if (bool_53_) {
			    i_58_ = ((gw) var_gw).l[i_50_];
			    i_57_ = ((gw) var_gw).f[i_50_];
			    i_59_ = ((gw) var_gw).g[i_50_];
			    i_61_ = ((gw) var_gw).p[i_50_];
			    i_60_ = ((gw) var_gw).o[i_50_];
			    i_50_++;
			} else {
			    i_57_ = i_55_;
			    i_58_ = i_55_;
			    i_59_ = (byte) 0;
			    i_60_ = (short) -1;
			    i_61_ = i_55_;
			}
			int i_62_;
			byte i_63_;
			short i_64_;
			int i_65_;
			int i_66_;
			if (bool_54_) {
			    i_63_ = ((gw) var_gw_41_).g[i_51_];
			    i_64_ = ((gw) var_gw_41_).o[i_51_];
			    i_65_ = ((gw) var_gw_41_).l[i_51_];
			    i_66_ = ((gw) var_gw_41_).f[i_51_];
			    i_62_ = ((gw) var_gw_41_).p[i_51_];
			    i_51_++;
			} else {
			    i_62_ = i_55_;
			    i_63_ = (byte) 0;
			    i_64_ = (short) -1;
			    i_65_ = i_55_;
			    i_66_ = i_55_;
			}
			if (i_60_ == -1) {
			    if ((i_64_ ^ 0xffffffff) != 0)
				a(0, is, 0, i_43_ & ((jj) var_jj).q[i_64_], 0,
				  bool_45_, ((jj) var_jj).s[i_64_], 2, i, 0);
			} else
			    a(0, is, 0, ((jj) var_jj).q[i_60_] & i_43_, 0,
			      bool_45_, ((jj) var_jj).s[i_60_], 2, i, 0);
			int i_67_;
			int i_68_;
			int i_69_;
			if ((i_59_ & 0x2) != 0 || (0x1 & i_63_) != 0) {
			    i_69_ = i_61_;
			    i_67_ = i_57_;
			    i_68_ = i_58_;
			} else if (i_56_ == 2) {
			    int i_70_ = 0x3fff & i_66_ - i_57_;
			    int i_71_ = 0x3fff & i_65_ - i_58_;
			    if (i_71_ >= 8192)
				i_71_ -= 16384;
			    if (i_70_ >= 8192)
				i_70_ -= 16384;
			    int i_72_ = 0x3fff & i_62_ - i_61_;
			    i_67_ = i_57_ + i_70_ * i_44_ / i_42_ & 0x3fff;
			    i_68_ = 0x3fff & i_44_ * i_71_ / i_42_ + i_58_;
			    if (i_72_ >= 8192)
				i_72_ -= 16384;
			    i_69_ = i_61_ + i_72_ * i_44_ / i_42_ & 0x3fff;
			} else if (i_56_ == 9) {
			    int i_73_ = i_66_ - i_57_ & 0x3fff;
			    if (i_73_ >= 8192)
				i_73_ -= 16384;
			    i_67_ = 0x3fff & i_57_ + i_73_ * i_44_ / i_42_;
			    i_68_ = i_69_ = 0;
			} else if (i_56_ == 7) {
			    int i_74_ = 0x3f & i_66_ - i_57_;
			    if (i_74_ >= 32)
				i_74_ -= 64;
			    i_68_ = i_58_ + i_44_ * (i_65_ - i_58_) / i_42_;
			    i_69_ = (i_62_ - i_61_) * i_44_ / i_42_ + i_61_;
			    i_67_ = 0x3f & i_44_ * i_74_ / i_42_ + i_57_;
			} else {
			    i_67_ = (i_66_ - i_57_) * i_44_ / i_42_ + i_57_;
			    i_69_ = i_61_ + i_44_ * (i_62_ - i_61_) / i_42_;
			    i_68_ = (i_65_ - i_58_) * i_44_ / i_42_ + i_58_;
			}
			a(i_68_, is, i_67_, ((jj) var_jj).q[i_52_] & i_43_,
			  i_69_, bool_45_, ((jj) var_jj).s[i_52_], 2, i,
			  i_56_);
		    }
		}
	    }
	}
    }
    
    final void a(wa var_wa, int i, int i_75_) {
	o++;
	if ((i ^ 0xffffffff) != 0) {
	    e();
	    if (!F())
		d();
	    else {
		gw var_gw = ((wa) var_wa).z[i];
		jj var_jj = ((gw) var_gw).e;
		if (i_75_ == 19093) {
		    for (int i_76_ = 0; i_76_ < ((gw) var_gw).c; i_76_++) {
			short i_77_ = ((gw) var_gw).k[i_76_];
			if (((jj) var_jj).o[i_77_]) {
			    if ((((gw) var_gw).o[i_76_] ^ 0xffffffff) != 0)
				WA(0, 0, 0, 0);
			    WA(((jj) var_jj).k[i_77_], ((gw) var_gw).f[i_76_],
			       ((gw) var_gw).l[i_76_], ((gw) var_gw).p[i_76_]);
			}
		    }
		    L();
		    d();
		}
	    }
	}
    }
    
    abstract ha S(ha var_ha);
    
    abstract void ba(int i, int i_78_, Class_i class_i, Class_i class_i_79_,
		     int i_80_, int i_81_, int i_82_);
    
    abstract void T(int i);
    
    abstract int PA();
    
    abstract void a(int i, int[] is, int i_83_, int i_84_, int i_85_,
		    int i_86_, boolean bool);
    
    abstract void a();
    
    abstract boolean a(int i, int i_87_, Class_q class_q, boolean bool,
		       int i_88_);
    
    abstract void R(int i, int i_89_, int i_90_);
    
    abstract void a(int i, int i_91_, int i_92_, int i_93_);
    
    abstract boolean b();
    
    abstract hi[] c();
    
    abstract void MA(int i);
    
    abstract void L();
    
    abstract int TA();
    
    abstract da a(byte i, int i_94_, boolean bool);
    
    abstract int RA();
    
    abstract int za();
    
    abstract int na();
    
    abstract void a(Class_q class_q);
    
    abstract void a(da var_da_95_, int i, int i_96_, int i_97_, boolean bool);
    
    abstract int OA();
    
    static final void a(boolean bool) {
	g++;
	if (vea.a != hs.modeWhere) {
	    if (bool != false)
		a(false);
	    try {
		rp.a(true, "tbrefresh", po.c);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    abstract void d();
    
    abstract void FA();
    
    abstract int H();
    
    abstract void a(Class_q class_q, pba var_pba, int i, int i_98_);
    
    abstract void e();
    
    abstract boolean LA();
    
    abstract void d(short i, short i_99_);
    
    abstract boolean F();
    
    abstract void a(Class_q class_q, pba var_pba, int i);
    
    final void a(boolean bool, byte i, wa var_wa, int i_100_, int i_101_,
		 wa var_wa_102_, int i_103_, int i_104_, int i_105_) {
	k++;
	if ((i_101_ ^ 0xffffffff) != 0) {
	    e();
	    if (!F())
		d();
	    else {
		gw var_gw = ((wa) var_wa).z[i_101_];
		if (i == -11) {
		    jj var_jj = ((gw) var_gw).e;
		    gw var_gw_106_ = null;
		    if (var_wa_102_ != null) {
			var_gw_106_ = ((wa) var_wa_102_).z[i_100_];
			if (((gw) var_gw_106_).e != var_jj)
			    var_gw_106_ = null;
		    }
		    a(false, var_gw, i_104_, var_gw_106_, i_105_, 65535,
		      var_jj, null, i_103_, bool, null, -8193);
		    L();
		    d();
		}
	    }
	}
    }
    
    final void a(byte i, wa var_wa, int i_107_, int i_108_, int i_109_,
		 int[] is, int i_110_, int i_111_, boolean bool, int i_112_,
		 wa var_wa_113_) {
	var_l++;
	if ((i_109_ ^ 0xffffffff) != 0) {
	    e();
	    if (!F())
		d();
	    else {
		gw var_gw = ((wa) var_wa_113_).z[i_109_];
		jj var_jj = ((gw) var_gw).e;
		gw var_gw_114_ = null;
		if (var_wa != null) {
		    var_gw_114_ = ((wa) var_wa).z[i_111_];
		    if (((gw) var_gw_114_).e != var_jj)
			var_gw_114_ = null;
		}
		int i_115_ = -35 % ((-44 - i) / 60);
		a(false, var_gw, i_108_, var_gw_114_, i_112_, i_110_, var_jj,
		  is, i_107_, bool, null, -8193);
		L();
		d();
	    }
	}
    }
    
    abstract int l();
    
    abstract void M(int i);
    
    abstract int J();
    
    abstract void SA(int i);
    
    abstract qg[] f();
    
    static final void a(Interface var_kp, byte i, Interface var_kp_116_) {
	rba.f++;
	m++;
	if (i != -65)
	    d = null;
	tba var_tba = jga.sendGameOutPacket(cw.b, pca.isaac, (byte) -127);
	((tba) var_tba).loginStream.writeInt(((Interface) var_kp_116_).interfaceID, (int) -127);
	((tba) var_tba).loginStream.writeShortReversed(i + 185, ((Interface) var_kp_116_).itemIndex);
	((tba) var_tba).loginStream.writeShortReversed(106, ((Interface) var_kp).itemID);
	((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, ((Interface) var_kp).itemIndex);
	((tba) var_tba).loginStream.writeShort(((Interface) var_kp_116_).itemID, i ^ ~0x34dd);
	((tba) var_tba).loginStream.writeIntReversed(13412, ((Interface) var_kp).interfaceID);
	ud.a(var_tba, (byte) -36);
    }
    
    final void a(wa var_wa, int i, wa var_wa_117_, int i_118_, int i_119_,
		 wa var_wa_120_, int i_121_, boolean[] bools, int i_122_,
		 int i_123_, boolean bool, int i_124_, wa var_wa_125_,
		 int i_126_, int i_127_) {
	if (i_126_ > -23)
	    ba(-96, 120, null, null, -128, 30, -52);
	c++;
	if ((i ^ 0xffffffff) != 0) {
	    if (bools == null || (i_124_ ^ 0xffffffff) == 0)
		a(bool, (byte) -11, var_wa_125_, i_119_, i, var_wa, i_118_, 0,
		  i_123_);
	    else {
		e();
		if (!F())
		    d();
		else {
		    gw var_gw = ((wa) var_wa_125_).z[i];
		    jj var_jj = ((gw) var_gw).e;
		    gw var_gw_128_ = null;
		    if (var_wa != null) {
			var_gw_128_ = ((wa) var_wa).z[i_119_];
			if (((gw) var_gw_128_).e != var_jj)
			    var_gw_128_ = null;
		    }
		    a(false, var_gw, 0, var_gw_128_, i_123_, 65535, var_jj,
		      null, i_118_, bool, bools, -8193);
		    gw var_gw_129_ = ((wa) var_wa_120_).z[i_124_];
		    gw var_gw_130_ = null;
		    if (var_wa_117_ != null) {
			var_gw_130_ = ((wa) var_wa_117_).z[i_127_];
			if (((gw) var_gw_130_).e != var_jj)
			    var_gw_130_ = null;
		    }
		    a(0, new int[0], 0, 0, 0, 0, bool);
		    a(true, var_gw_129_, 0, var_gw_130_, i_121_, 65535,
		      ((gw) var_gw_129_).e, null, i_122_, bool, bools, -8193);
		    L();
		    d();
		}
	    }
	}
    }
    
    abstract int KA();
    
    private final void a(int i, int[] is, int i_131_, int i_132_, int i_133_,
			 boolean bool, int[] is_134_, int i_135_, int i_136_,
			 int i_137_) {
	da.i++;
	if (i_136_ != 1) {
	    if (i_136_ != 2) {
		if (i_136_ == 3) {
		    if (i_137_ != 0 && i_137_ != 1) {
			if (i_137_ == 3) {
			    int i_138_ = i_131_;
			    i_131_ = i_133_;
			    i_133_ = i_138_;
			} else if (i_137_ == 2) {
			    int i_139_ = i_131_;
			    i_131_ = 0x3fff & i_133_;
			    i_133_ = -i_139_ & 0x3fff;
			}
		    } else {
			int i_140_ = i_131_;
			i_131_ = -i_133_;
			i_133_ = i_140_;
		    }
		}
	    } else if (i_137_ == 0 || i_137_ == 1) {
		i_131_ = -i_131_;
		i_133_ = -i_133_;
	    } else if (i_137_ == 2) {
		i_133_ = -i_133_ & 0x3fff;
		i_131_ = -i_131_ & 0x3fff;
	    }
	} else if (i_137_ == 0 || i_137_ == 1) {
	    int i_141_ = -i_131_;
	    i_131_ = i_133_;
	    i_133_ = i_141_;
	} else if (i_137_ != 3) {
	    if (i_137_ == 2) {
		int i_142_ = i_131_;
		i_131_ = -i_133_ & 0x3fff;
		i_133_ = 0x3fff & i_142_;
	    }
	} else {
	    int i_143_ = i_131_;
	    i_131_ = i_133_;
	    i_133_ = i_143_;
	}
	if (i_132_ != 65535)
	    B(i_137_, is_134_, i_131_, i, i_133_, bool, i_132_, is);
	else
	    a(i_137_, is_134_, i_131_, i, i_133_, i_136_, bool);
	if (i_135_ != 2)
	    j = null;
    }
    
    public da() {
	/* empty */
    }
}
