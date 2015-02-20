/* cd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class cd
{
    static int worldFlags = 0;
    boolean b;
    private int[] c;
    private byte[][][] d;
    static int e;
    static int f;
    static int g;
    private byte[][][] h;
    int[][][] i;
    private byte[][][] j;
    private cp k;
    private byte[][][] l;
    static fh m = new fh(11, 2);
    static int var_n;
    static int o;
    private int[] p
	= { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
    int q;
    static int r;
    int s;
    static int t;
    private jf u;
    byte[][][] v;
    byte[][][] w;
    static int x;
    static jm y;
    static int z;
    static float A;
    static int B;
    int C;
    static int D;
    
    final void a(byte i, int i_0_, int[][] is) {
	B++;
	int[][] is_1_ = ((cd) this).i[i_0_];
	if (i >= -56)
	    a(-64, -80, -42, -36, false, 104);
	for (int i_2_ = 0; i_2_ < ((cd) this).q + 1; i_2_++) {
	    for (int i_3_ = 0; ((cd) this).C + 1 > i_3_; i_3_++)
		is_1_[i_2_][i_3_] += is[i_2_][i_3_];
	}
    }
    
    final void a(int i, int i_4_, int i_5_, int i_6_, BytesParser var_es, int i_7_,
		 wd[] var_wds) {
	if (!((cd) this).b) {
	    for (int i_8_ = 0; i_8_ < 4; i_8_++) {
		wd var_wd = var_wds[i_8_];
		for (int i_9_ = 0; i_9_ < 64; i_9_++) {
		    for (int i_10_ = 0; i_10_ < 64; i_10_++) {
			int i_11_ = i_9_ + i_4_;
			int i_12_ = i_10_ + i;
			if (i_11_ >= 0 && i_11_ < ((cd) this).q && i_12_ >= 0
			    && ((cd) this).C > i_12_)
			    var_wd.b(i_12_, (byte) -121, i_11_);
		    }
		}
	    }
	}
	e++;
	int i_13_ = i_5_ + i_4_;
	int i_14_ = i + i_7_;
	int i_15_ = 37 % ((62 - i_6_) / 47);
	for (int i_16_ = 0; ((cd) this).s > i_16_; i_16_++) {
	    for (int i_17_ = 0; i_17_ < 64; i_17_++) {
		for (int i_18_ = 0; i_18_ < 64; i_18_++)
		    a(0, 0, i_4_ + i_17_, i_18_ + i_14_, false, i + i_18_, 0,
		      i_17_ + i_13_, i_16_, var_es, (byte) 27);
	    }
	}
    }
    
    private final void a(int i, int i_19_, int i_20_, int i_21_, boolean bool,
			 int i_22_, int i_23_, int i_24_, int i_25_, BytesParser var_es,
			 byte i_26_) {
	if (i_26_ == 27) {
	    x++;
	    if (i_19_ == 1)
		i_23_ = 1;
	    else if (i_19_ != 2) {
		if (i_19_ == 3)
		    i = 1;
	    } else {
		i_23_ = 1;
		i = 1;
	    }
	    if (i_20_ >= 0 && ((cd) this).q > i_20_ && i_22_ >= 0
		&& i_22_ < ((cd) this).C) {
		if (!((cd) this).b && !bool)
		    tu.b[i_25_][i_20_][i_22_] = (byte) 0;
		for (;;) {
		    int i_27_ = var_es.readUnsignedByte(-9268);
		    if (i_27_ == 0) {
			if (!((cd) this).b) {
			    if (i_25_ != 0)
				((cd) this).i[i_25_][i + i_20_][i_22_ + i_23_]
				    = (((cd) this).i[i_25_ - 1][i + i_20_]
				       [i_22_ + i_23_]) - 960;
			    else
				((cd) this).i[0][i + i_20_][i_23_ + i_22_]
				    = 8 * -fr.a(i_21_ + 556238, i_24_ + 932731,
						45365) << 2;
			} else {
			    ((cd) this).i[0][i + i_20_][i_23_ + i_22_] = 0;
			    break;
			}
			break;
		    }
		    if (i_27_ == 1) {
			int i_28_ = var_es.readUnsignedByte(-9268);
			if (!((cd) this).b) {
			    if (i_28_ == 1)
				i_28_ = 0;
			    if (i_25_ != 0)
				((cd) this).i[i_25_][i_20_ + i][i_22_ + i_23_]
				    = (((cd) this).i[i_25_ - 1][i_20_ + i]
				       [i_23_ + i_22_]) - (i_28_ * 8 << 2);
			    else
				((cd) this).i[0][i + i_20_][i_22_ + i_23_]
				    = -i_28_ * 8 << 2;
			} else {
			    ((cd) this).i[0][i + i_20_][i_23_ + i_22_]
				= 8 * i_28_ << 2;
			    break;
			}
			break;
		    }
		    if (i_27_ <= 49) {
			if (bool)
			    var_es.readUnsignedByte(-9268);
			else {
			    j[i_25_][i_20_][i_22_] = var_es.readByte(-20933);
			    h[i_25_][i_20_][i_22_] = (byte) ((i_27_ - 2) / 4);
			    d[i_25_][i_20_][i_22_]
				= (byte) uca.a(i_19_ - 2 + i_27_, 3);
			}
		    } else if (i_27_ <= 81) {
			if (!((cd) this).b && !bool)
			    tu.b[i_25_][i_20_][i_22_] = (byte) (i_27_ - 49);
		    } else if (!bool)
			l[i_25_][i_20_][i_22_] = (byte) (i_27_ - 81);
		}
	    } else {
		for (;;) {
		    int i_29_ = var_es.readUnsignedByte(i_26_ ^ ~0x2428);
		    if (i_29_ == 0)
			break;
		    if (i_29_ == 1) {
			var_es.readUnsignedByte(i_26_ ^ ~0x2428);
			break;
		    }
		    if (i_29_ <= 49)
			var_es.readUnsignedByte(-9268);
		}
	    }
	}
    }
    
    final void a(int i, int i_30_, byte i_31_, int i_32_, int i_33_) {
	z++;
	int i_34_ = 0;
	if (i_31_ != 89)
	    ((cd) this).b = true;
	for (/**/; i_34_ < ((cd) this).s; i_34_++)
	    a(i_30_, i, i_32_, i_33_, true, i_34_);
    }
    
    final void a(int[][][] is, wd[] var_wds, Class_r class_r, byte i) {
	D++;
	if (!((cd) this).b) {
	    for (int i_35_ = 0; i_35_ < 4; i_35_++) {
		for (int i_36_ = 0; ((cd) this).q > i_36_; i_36_++) {
		    for (int i_37_ = 0; i_37_ < ((cd) this).C; i_37_++) {
			if ((tu.b[i_35_][i_36_][i_37_] & 0x1) != 0) {
			    int i_38_ = i_35_;
			    if ((tu.b[1][i_36_][i_37_] & 0x2) != 0)
				i_38_--;
			    if (i_38_ >= 0)
				var_wds[i_38_].a((byte) 116, i_37_, i_36_);
			}
		    }
		}
	    }
	}
	for (int i_39_ = 0; i_39_ < ((cd) this).s; i_39_++) {
	    int i_40_ = 0;
	    int i_41_ = 0;
	    if (!((cd) this).b) {
		if (qaa.O)
		    i_41_ |= 0x8;
		if (iv.y)
		    i_40_ |= 0x2;
		if (Interface.pd != 0) {
		    i_40_ |= 0x1;
		    if (av.j | i_39_ == 0)
			i_41_ |= 0x10;
		}
	    }
	    if (iv.y)
		i_41_ |= 0x7;
	    if (!pea.d)
		i_41_ |= 0x20;
	    int[][] is_42_ = (is != null && is.length > i_39_ ? is[i_39_]
			      : ((cd) this).i[i_39_]);
	    Class_jg.a(i_39_,
		 class_r.a(((cd) this).q, ((cd) this).C, ((cd) this).i[i_39_],
			   is_42_, 512, i_40_, i_41_));
	}
	if (i != 20)
	    j = null;
    }
    
    final void a(int i, wd[] var_wds, BytesParser var_es, int i_43_, int i_44_,
		 int i_45_, int i_46_, int i_47_, boolean bool, int i_48_) {
	t++;
	int i_49_ = 8 * (i_45_ & 0x7);
	if (!((cd) this).b) {
	    wd var_wd = var_wds[i];
	    for (int i_50_ = 0; i_50_ < 8; i_50_++) {
		for (int i_51_ = 0; i_51_ < 8; i_51_++) {
		    int i_52_
			= saa.a(i_51_ & 0x7, i_43_, 66, 0x7 & i_50_) + i_47_;
		    int i_53_
			= i_46_ + uc.a(i_50_ & 0x7, i_43_, -101, i_51_ & 0x7);
		    if (i_52_ > 0 && ((cd) this).q - 1 > i_52_ && i_53_ > 0
			&& ((cd) this).C - 1 > i_53_)
			var_wd.b(i_53_, (byte) -117, i_52_);
		}
	    }
	}
	int i_54_ = 8 * (i_48_ & 0x7);
	int i_55_ = (i_45_ & ~0x7) << 3;
	if (bool != true)
	    a(104, (byte) -98, null, null, null, null, null);
	int i_56_ = (i_48_ & ~0x7) << 3;
	int i_57_ = 0;
	int i_58_ = 0;
	if (i_43_ == 1)
	    i_58_ = 1;
	else if (i_43_ != 2) {
	    if (i_43_ == 3)
		i_57_ = 1;
	} else {
	    i_57_ = 1;
	    i_58_ = 1;
	}
	for (int i_59_ = 0; ((cd) this).s > i_59_; i_59_++) {
	    for (int i_60_ = 0; i_60_ < 64; i_60_++) {
		for (int i_61_ = 0; i_61_ < 64; i_61_++) {
		    if (i_44_ == i_59_ && i_60_ >= i_49_ && i_49_ + 8 >= i_60_
			&& i_54_ <= i_61_ && i_54_ + 8 >= i_61_) {
			int i_62_;
			int i_63_;
			if (i_49_ + 8 != i_60_ && i_61_ != i_54_ + 8) {
			    i_63_ = saa.a(i_61_ & 0x7, i_43_, -69,
					  i_60_ & 0x7) + i_47_;
			    i_62_ = i_46_ + uc.a(i_60_ & 0x7, i_43_, -104,
						 i_61_ & 0x7);
			    a(i_57_, i_43_, i_63_, i_56_ + i_61_, false, i_62_,
			      i_58_, i_55_ + i_60_, i, var_es, (byte) 27);
			} else {
			    if (i_43_ == 0) {
				i_62_ = i_61_ - (i_54_ - i_46_);
				i_63_ = i_47_ - i_49_ + i_60_;
			    } else if (i_43_ != 1) {
				if (i_43_ == 2) {
				    i_63_ = i_47_ + 8 + (-i_60_ + i_49_);
				    i_62_ = i_46_ + i_54_ - i_61_ + 8;
				} else {
				    i_62_ = i_60_ - i_49_ + i_46_;
				    i_63_ = i_47_ + 8 + (i_54_ - i_61_);
				}
			    } else {
				i_63_ = i_61_ - i_54_ + i_47_;
				i_62_ = i_49_ - (i_60_ - (i_46_ + 8));
			    }
			    a(0, 0, i_63_, i_61_ + i_56_, true, i_62_, 0,
			      i_60_ + i_55_, i, var_es, (byte) 27);
			}
			if (i_60_ == 63 || i_61_ == 63) {
			    int i_64_ = 1;
			    if (i_60_ == 63 && i_61_ == 63)
				i_64_ = 3;
			    for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
				int i_66_ = i_60_;
				int i_67_ = i_61_;
				if (i_65_ == 0) {
				    i_66_ = i_60_ != 63 ? i_60_ : 64;
				    i_67_ = i_61_ == 63 ? 64 : i_61_;
				} else if (i_65_ != 1) {
				    if (i_65_ == 2)
					i_67_ = 64;
				} else
				    i_66_ = 64;
				int i_68_;
				int i_69_;
				if (i_43_ == 0) {
				    i_69_ = i_66_ - i_49_ + i_47_;
				    i_68_ = i_46_ + i_67_ - i_54_;
				} else if (i_43_ != 1) {
				    if (i_43_ == 2) {
					i_68_ = i_46_ + (i_54_ - i_67_) + 8;
					i_69_ = i_49_ - i_66_ + i_47_ + 8;
				    } else {
					i_68_ = i_66_ + (i_46_ - i_49_);
					i_69_ = i_54_ + i_47_ + 8 - i_67_;
				    }
				} else {
				    i_69_ = i_67_ - i_54_ + i_47_;
				    i_68_ = i_49_ + i_46_ - i_66_ + 8;
				}
				if (i_69_ >= 0 && i_69_ < ((cd) this).q
				    && i_68_ >= 0 && ((cd) this).C > i_68_)
				    ((cd) this).i[i][i_69_][i_68_]
					= (((cd) this).i[i][i_63_ + i_57_]
					   [i_62_ + i_58_]);
			    }
			}
		    } else
			a(0, 0, -1, 0, false, -1, 0, 0, 0, var_es, (byte) 27);
		}
	    }
	}
    }
    
    private final void a(int i, int i_70_, gda var_gda, Class_r class_r,
			 byte[][] is, byte[][] is_71_, int i_72_,
			 byte[][] is_73_, ng var_ng, int i_74_, int i_75_,
			 int i_76_, int i_77_, boolean[] bools) {
	g++;
	boolean[] bools_78_
	    = var_ng != null && ((ng) var_ng).r ? uj.J[i_70_] : dt.Cb[i_70_];
	if (i > 0) {
	    if (i_72_ > 0) {
		int i_79_ = 0xff & is[i_72_ - 1][i - 1];
		if (i_79_ > 0) {
		    ng var_ng_80_ = k.a(i_79_ - 1, (byte) 19);
		    if (((ng) var_ng_80_).d != -1 && ((ng) var_ng_80_).r) {
			byte i_81_ = is_73_[i_72_ - 1][i - 1];
			int i_82_ = 0x7 & is_71_[i_72_ - 1][i - 1] * 2 + 4;
			int i_83_ = hga.a(class_r, var_ng_80_, 125);
			if (Class_lc.X[i_81_][i_82_]) {
			    bi.V[0] = ((ng) var_ng_80_).d;
			    sk.u[0] = i_83_;
			    bh.C[0] = ((ng) var_ng_80_).q;
			    bf.R[0] = ((ng) var_ng_80_).c;
			    mk.f[0] = ((ng) var_ng_80_).g;
			    Class_lb.h[0] = 256;
			}
		    }
		}
	    }
	    if (i_74_ - 1 > i_72_) {
		int i_84_ = 0xff & is[i_72_ + 1][i - 1];
		if (i_84_ > 0) {
		    ng var_ng_85_ = k.a(i_84_ - 1, (byte) 19);
		    if ((((ng) var_ng_85_).d ^ 0xffffffff) != 0
			&& ((ng) var_ng_85_).r) {
			byte i_86_ = is_73_[i_72_ + 1][i - 1];
			int i_87_ = is_71_[i_72_ + 1][i - 1] * 2 + 6 & 0x7;
			int i_88_ = hga.a(class_r, var_ng_85_, 127);
			if (Class_lc.X[i_86_][i_87_]) {
			    bi.V[2] = ((ng) var_ng_85_).d;
			    sk.u[2] = i_88_;
			    bh.C[2] = ((ng) var_ng_85_).q;
			    bf.R[2] = ((ng) var_ng_85_).c;
			    mk.f[2] = ((ng) var_ng_85_).g;
			    Class_lb.h[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_77_ - 1 > i) {
	    if (i_72_ > 0) {
		int i_89_ = 0xff & is[i_72_ - 1][i + 1];
		if (i_89_ > 0) {
		    ng var_ng_90_ = k.a(i_89_ - 1, (byte) 19);
		    if ((((ng) var_ng_90_).d ^ 0xffffffff) != 0
			&& ((ng) var_ng_90_).r) {
			byte i_91_ = is_73_[i_72_ - 1][i + 1];
			int i_92_ = 2 * is_71_[i_72_ - 1][i + 1] + 2 & 0x7;
			int i_93_ = hga.a(class_r, var_ng_90_, 127);
			if (Class_lc.X[i_91_][i_92_]) {
			    bi.V[6] = ((ng) var_ng_90_).d;
			    sk.u[6] = i_93_;
			    bh.C[6] = ((ng) var_ng_90_).q;
			    bf.R[6] = ((ng) var_ng_90_).c;
			    mk.f[6] = ((ng) var_ng_90_).g;
			    Class_lb.h[6] = 64;
			}
		    }
		}
	    }
	    if (i_74_ - 1 > i_72_) {
		int i_94_ = is[i_72_ + 1][i + 1] & 0xff;
		if (i_94_ > 0) {
		    ng var_ng_95_ = k.a(i_94_ - 1, (byte) 19);
		    if (((ng) var_ng_95_).d != -1 && ((ng) var_ng_95_).r) {
			byte i_96_ = is_73_[i_72_ + 1][i + 1];
			int i_97_ = is_71_[i_72_ + 1][i + 1] * 2 & 0x7;
			int i_98_ = hga.a(class_r, var_ng_95_, i_75_ - 11632);
			if (Class_lc.X[i_96_][i_97_]) {
			    bi.V[4] = ((ng) var_ng_95_).d;
			    sk.u[4] = i_98_;
			    bh.C[4] = ((ng) var_ng_95_).q;
			    bf.R[4] = ((ng) var_ng_95_).c;
			    mk.f[4] = ((ng) var_ng_95_).g;
			    Class_lb.h[4] = 128;
			}
		    }
		}
	    }
	}
	if (i > 0) {
	    int i_99_ = 0xff & is[i_72_][i - 1];
	    if (i_99_ > 0) {
		ng var_ng_100_ = k.a(i_99_ - 1, (byte) 19);
		if ((((ng) var_ng_100_).d ^ 0xffffffff) != 0) {
		    byte i_101_ = is_73_[i_72_][i - 1];
		    int i_102_ = is_71_[i_72_][i - 1];
		    if (!((ng) var_ng_100_).r) {
			if (!bools_78_[0x3 & i_76_])
			    bools[0] = dt.Cb[i_101_][uca.a(3, i_102_ + 2)];
		    } else {
			int i_103_ = 2;
			int i_104_ = 2 * i_102_ + 4;
			int i_105_ = hga.a(class_r, var_ng_100_, 121);
			for (int i_106_ = 0; i_106_ < 3; i_106_++) {
			    i_103_ &= 0x7;
			    i_104_ = 0x7 & i_104_;
			    if (Class_lc.X[i_101_][i_104_]
				&& ((ng) var_ng_100_).g >= mk.f[i_103_]) {
				bi.V[i_103_] = ((ng) var_ng_100_).d;
				sk.u[i_103_] = i_105_;
				bh.C[i_103_] = ((ng) var_ng_100_).q;
				bf.R[i_103_] = ((ng) var_ng_100_).c;
				if (((ng) var_ng_100_).g != mk.f[i_103_])
				    Class_lb.h[i_103_] = 32;
				else
				    Class_lb.h[i_103_]
					= hba.bitwiseArg1ORArg2(Class_lb.h[i_103_], 32);
				mk.f[i_103_] = ((ng) var_ng_100_).g;
			    }
			    i_104_++;
			    i_103_--;
			}
			if (!bools_78_[i_76_ & 0x3])
			    bools[0] = uj.J[i_101_][uca.a(i_102_ + 2, 3)];
		    }
		}
	    }
	}
	if (i < i_77_ - 1) {
	    int i_107_ = 0xff & is[i_72_][i + 1];
	    if (i_107_ > 0) {
		ng var_ng_108_ = k.a(i_107_ - 1, (byte) 19);
		if (((ng) var_ng_108_).d != -1) {
		    byte i_109_ = is_73_[i_72_][i + 1];
		    int i_110_ = is_71_[i_72_][i + 1];
		    if (!((ng) var_ng_108_).r) {
			if (!bools_78_[0x3 & i_76_ + 2])
			    bools[2] = dt.Cb[i_109_][uca.a(3, i_110_)];
		    } else {
			int i_111_ = 4;
			int i_112_ = i_110_ * 2 + 2;
			int i_113_ = hga.a(class_r, var_ng_108_, 125);
			for (int i_114_ = 0; i_114_ < 3; i_114_++) {
			    i_112_ &= 0x7;
			    i_111_ &= 0x7;
			    if (Class_lc.X[i_109_][i_112_]
				&& ((ng) var_ng_108_).g >= mk.f[i_111_]) {
				bi.V[i_111_] = ((ng) var_ng_108_).d;
				sk.u[i_111_] = i_113_;
				bh.C[i_111_] = ((ng) var_ng_108_).q;
				bf.R[i_111_] = ((ng) var_ng_108_).c;
				if (mk.f[i_111_] != ((ng) var_ng_108_).g)
				    Class_lb.h[i_111_] = 16;
				else
				    Class_lb.h[i_111_]
					= hba.bitwiseArg1ORArg2(Class_lb.h[i_111_], 16);
				mk.f[i_111_] = ((ng) var_ng_108_).g;
			    }
			    i_111_++;
			    i_112_--;
			}
			if (!bools_78_[0x3 & 2 + i_76_])
			    bools[2] = uj.J[i_109_][uca.a(3, --i_110_)];
		    }
		}
	    }
	}
	if (i_72_ > 0) {
	    int i_115_ = 0xff & is[i_72_ - 1][i];
	    if (i_115_ > 0) {
		ng var_ng_116_ = k.a(i_115_ - 1, (byte) 19);
		if (((ng) var_ng_116_).d != -1) {
		    byte i_117_ = is_73_[i_72_ - 1][i];
		    int i_118_ = is_71_[i_72_ - 1][i];
		    if (!((ng) var_ng_116_).r) {
			if (!bools_78_[0x3 & i_76_ + 3])
			    bools[3] = dt.Cb[i_117_][uca.a(1 + i_118_, 3)];
		    } else {
			int i_119_ = 6;
			int i_120_ = i_118_ * 2 + 4;
			int i_121_ = hga.a(class_r, var_ng_116_, 124);
			for (int i_122_ = 0; i_122_ < 3; i_122_++) {
			    i_120_ = 0x7 & i_120_;
			    i_119_ = 0x7 & i_119_;
			    if (Class_lc.X[i_117_][i_120_]
				&& mk.f[i_119_] <= ((ng) var_ng_116_).g) {
				bi.V[i_119_] = ((ng) var_ng_116_).d;
				sk.u[i_119_] = i_121_;
				bh.C[i_119_] = ((ng) var_ng_116_).q;
				bf.R[i_119_] = ((ng) var_ng_116_).c;
				if (((ng) var_ng_116_).g == mk.f[i_119_])
				    Class_lb.h[i_119_]
					= hba.bitwiseArg1ORArg2(Class_lb.h[i_119_], 8);
				else
				    Class_lb.h[i_119_] = 8;
				mk.f[i_119_] = ((ng) var_ng_116_).g;
			    }
			    i_119_++;
			    i_120_--;
			}
			if (!bools_78_[0x3 & 3 + i_76_])
			    bools[3] = uj.J[i_117_][uca.a(i_118_ + 1, 3)];
		    }
		}
	    }
	}
	if (i_75_ != 11756)
	    a(112, 30, -96, -96, false, 60);
	if (i_72_ < i_74_ - 1) {
	    int i_123_ = 0xff & is[i_72_ + 1][i];
	    if (i_123_ > 0) {
		ng var_ng_124_ = k.a(i_123_ - 1, (byte) 19);
		if (((ng) var_ng_124_).d != -1) {
		    byte i_125_ = is_73_[i_72_ + 1][i];
		    int i_126_ = is_71_[i_72_ + 1][i];
		    if (!((ng) var_ng_124_).r) {
			if (!bools_78_[0x3 & 1 + i_76_])
			    bools[1] = dt.Cb[i_125_][uca.a(i_126_ + 3, 3)];
		    } else {
			int i_127_ = 4;
			int i_128_ = 2 * i_126_ + 6;
			int i_129_
			    = hga.a(class_r, var_ng_124_, i_75_ ^ 0x2d9b);
			for (int i_130_ = 0; i_130_ < 3; i_130_++) {
			    i_128_ &= 0x7;
			    i_127_ &= 0x7;
			    if (Class_lc.X[i_125_][i_128_]
				&& mk.f[i_127_] <= ((ng) var_ng_124_).g) {
				bi.V[i_127_] = ((ng) var_ng_124_).d;
				sk.u[i_127_] = i_129_;
				bh.C[i_127_] = ((ng) var_ng_124_).q;
				bf.R[i_127_] = ((ng) var_ng_124_).c;
				if (((ng) var_ng_124_).g != mk.f[i_127_])
				    Class_lb.h[i_127_] = 4;
				else
				    Class_lb.h[i_127_]
					= hba.bitwiseArg1ORArg2(Class_lb.h[i_127_], 4);
				mk.f[i_127_] = ((ng) var_ng_124_).g;
			    }
			    i_128_++;
			    i_127_--;
			}
			if (!bools_78_[0x3 & 1 + i_76_])
			    bools[1] = uj.J[i_125_][uca.a(i_126_ + 3, 3)];
		    }
		}
	    }
	}
	if (var_ng != null) {
	    int i_131_ = hga.a(class_r, var_ng, 127);
	    if (((ng) var_ng).r) {
		for (int i_132_ = 0; i_132_ < 8; i_132_++) {
		    int i_133_ = i_132_ - i_76_ * 2 & 0x7;
		    if (Class_lc.X[i_70_][i_132_]
			&& mk.f[i_133_] <= ((ng) var_ng).g) {
			bi.V[i_133_] = ((ng) var_ng).d;
			sk.u[i_133_] = i_131_;
			bh.C[i_133_] = ((ng) var_ng).q;
			bf.R[i_133_] = ((ng) var_ng).c;
			if (((ng) var_ng).g == mk.f[i_133_])
			    Class_lb.h[i_133_] = hba.bitwiseArg1ORArg2(Class_lb.h[i_133_], 2);
			else
			    Class_lb.h[i_133_] = 2;
			mk.f[i_133_] = ((ng) var_ng).g;
		    }
		}
	    }
	}
    }
    
    private final void a(Class_r class_r, Class_i class_i,
			 Class_i class_i_134_, boolean bool, int[][] is, int i,
			 Class_i class_i_135_) {
	if (bool != true)
	    ((cd) this).v = null;
	for (int i_136_ = 0; i_136_ < ((cd) this).q; i_136_++) {
	    for (int i_137_ = 0; ((cd) this).C > i_137_; i_137_++) {
		if (or.e == -1 || hk.a(i, or.e, i_136_, (byte) 108, i_137_)) {
		    byte i_138_ = h[i][i_136_][i_137_];
		    byte i_139_ = d[i][i_136_][i_137_];
		    int i_140_ = 0xff & j[i][i_136_][i_137_];
		    int i_141_ = l[i][i_136_][i_137_] & 0xff;
		    ng var_ng
			= i_140_ != 0 ? k.a(i_140_ - 1, (byte) 19) : null;
		    gda var_gda = i_141_ != 0 ? u.b(false, i_141_ - 1) : null;
		    int i_142_ = 0;
		    int i_143_ = 0;
		    if (i_138_ != 0) {
			i_143_ = var_ng == null ? 0 : Class_ab.a[i_138_];
			i_142_ = var_gda != null ? bm.j[i_138_] : 0;
		    } else if (var_ng != null)
			i_143_ = Class_ab.a[i_138_];
		    else if (var_gda != null)
			i_142_ = Class_ab.a[i_138_];
		    int i_144_ = i_142_ + i_143_;
		    int i_145_ = 0;
		    if (i_144_ != 0) {
			int i_146_;
			if (ha.v)
			    i_146_ = var_ng != null ? ((ng) var_ng).q : -1;
			else
			    i_146_ = -1;
			int[] is_147_ = new int[i_144_];
			int[] is_148_ = new int[i_144_];
			int[] is_149_ = new int[i_144_];
			int[] is_150_ = new int[i_144_];
			boolean bool_151_ = false;
			if (var_ng == null
			    || (((ng) var_ng).d == -1
				&& (((ng) var_ng).j ^ 0xffffffff) == 0
				&& i_146_ == -1)) {
			    for (int i_152_ = 0; i_143_ > i_152_; i_152_++) {
				is_147_[i_145_] = -1;
				i_145_++;
			    }
			} else {
			    for (int i_153_ = 0; i_153_ < i_143_; i_153_++) {
				is_149_[i_145_] = i_146_;
				is_150_[i_145_] = ((ng) var_ng).c;
				if (((ng) var_ng).d != -1)
				    is_147_[i_145_] = ((ng) var_ng).d;
				else
				    is_147_[i_145_] = -1;
				if ((((ng) var_ng).j ^ 0xffffffff) != 0) {
				    is_148_[i_145_] = ((ng) var_ng).j;
				    bool_151_ = true;
				} else
				    is_148_[i_145_] = -1;
				i_145_++;
			    }
			    if (!((cd) this).b && i == 0)
				al.a(i_136_, i_137_, ((ng) var_ng).n,
				     ((ng) var_ng).m * 8, ((ng) var_ng).a);
			}
			if (!bool_151_)
			    is_148_ = null;
			if (var_gda != null) {
			    int i_154_ = ((gda) var_gda).m;
			    if (ha.v)
				i_154_ = -1;
			    for (int i_155_ = 0; i_142_ > i_155_; i_155_++) {
				is_149_[i_145_] = i_154_;
				is_150_[i_145_] = ((gda) var_gda).o;
				is_147_[i_145_] = is[i_136_][i_137_];
				if (is_148_ != null)
				    is_148_[i_145_] = -1;
				i_145_++;
			    }
			} else {
			    for (int i_156_ = 0; i_156_ < i_142_; i_156_++) {
				is_147_[i_145_] = -1;
				i_145_++;
			    }
			}
			int i_157_ = p.length;
			int[] is_158_ = new int[i_157_];
			int[] is_159_ = new int[i_157_];
			int[] is_160_
			    = class_i == null ? null : new int[i_157_];
			int[] is_161_
			    = (class_i != null || class_i_135_ != null
			       ? new int[i_157_] : null);
			for (int i_162_ = 0; i_162_ < i_157_; i_162_++) {
			    int i_163_ = p[i_162_];
			    int i_164_ = c[i_162_];
			    if (i_139_ != 0) {
				if (i_139_ == 1) {
				    is_158_[i_162_] = i_164_;
				    int i_165_ = i_163_;
				    is_159_[i_162_] = 512 - i_165_;
				} else if (i_139_ != 2) {
				    if (i_139_ == 3) {
					int i_166_ = i_163_;
					is_158_[i_162_] = -i_164_ + 512;
					is_159_[i_162_] = i_166_;
				    }
				} else {
				    is_158_[i_162_] = 512 - i_163_;
				    is_159_[i_162_] = 512 - i_164_;
				}
			    } else {
				is_158_[i_162_] = i_163_;
				is_159_[i_162_] = i_164_;
			    }
			    if (is_160_ != null
				&& Class_lc.X[i_138_][i_162_]) {
				int i_167_ = i_163_ + (i_136_ << 9);
				int i_168_ = i_163_ + (i_137_ << 9);
				is_160_[i_162_]
				    = (class_i.a(i_168_, i_167_, bool)
				       - class_i_134_.a(i_168_, i_167_, true));
			    }
			    if (is_161_ != null) {
				if (class_i == null
				    || Class_lc.X[i_138_][i_162_]) {
				    if (class_i_135_ != null
					&& !ClientScript.m[i_138_][i_162_]) {
					int i_169_ = (i_136_ << 9) + i_163_;
					int i_170_ = (i_137_ << 9) + i_163_;
					is_161_[i_162_]
					    = (class_i_135_.a(i_170_, i_169_,
							      true)
					       - class_i_134_.a(i_170_, i_169_,
								true));
				    }
				} else {
				    int i_171_ = (i_136_ << 9) + i_163_;
				    int i_172_ = (i_137_ << 9) + i_163_;
				    is_161_[i_162_]
					= (class_i_134_.a(i_172_, i_171_, true)
					   - class_i.a(i_172_, i_171_, true));
				}
			    }
			}
			int i_173_ = class_i_134_.a(i_137_, (byte) 51, i_136_);
			int i_174_
			    = class_i_134_.a(i_137_, (byte) 51, i_136_ + 1);
			int i_175_ = class_i_134_.a(i_137_ + 1, (byte) 51,
						    i_136_ + 1);
			int i_176_
			    = class_i_134_.a(i_137_ + 1, (byte) 51, i_136_);
			boolean bool_177_ = ItemDef.b(i_137_, i_136_, 5706);
			if (bool_177_ && i > 1 || !bool_177_ && i > 0) {
			    boolean bool_178_ = true;
			    if (var_gda == null || ((gda) var_gda).f) {
				if (i_141_ == 0 && i_138_ != 0)
				    bool_178_ = false;
				else if (i_140_ > 0 && var_ng != null
					 && !((ng) var_ng).p)
				    bool_178_ = false;
			    } else
				bool_178_ = false;
			    if (bool_178_ && i_173_ == i_174_
				&& i_173_ == i_175_ && i_173_ == i_176_)
				((cd) this).v[i][i_136_][i_137_]
				    = (byte) hba.bitwiseArg1ORArg2((((cd) this).v[i][i_136_]
						    [i_137_]),
						   4);
			}
			int i_179_ = 0;
			int i_180_ = 0;
			int i_181_ = 0;
			if (((cd) this).b) {
			    i_179_ = IncomingPackets.a(i_136_, i_137_);
			    i_180_ = Class_lc.b(i_136_, i_137_);
			    i_181_ = oi.a(i_136_, i_137_);
			}
			class_i_134_.a(i_136_, i_137_, is_158_, is_160_,
				       is_159_, is_161_, uu.b[i_138_],
				       Class_qb.h[i_138_], vk.h[i_138_],
				       is_147_, is_148_, is_149_, is_150_,
				       i_179_, i_180_, i_181_, false);
			oga.a(i, i_136_, i_137_);
		    }
		}
	    }
	}
	var_n++;
    }
    
    private final void a(int i, byte i_182_, Class_i class_i, Class_r class_r,
			 int[][] is, Class_i class_i_183_,
			 Class_i class_i_184_) {
	r++;
	byte[][] is_185_ = h[i];
	byte[][] is_186_ = d[i];
	byte[][] is_187_ = l[i];
	if (i_182_ != -121)
	    a(104, 126, null, null, null, null, 47, null, null, 89, 16, 100,
	      85, null);
	byte[][] is_188_ = j[i];
	for (int i_189_ = 0; i_189_ < ((cd) this).q; i_189_++) {
	    int i_190_ = ((cd) this).q - 1 <= i_189_ ? i_189_ : i_189_ + 1;
	    for (int i_191_ = 0; ((cd) this).C > i_191_; i_191_++) {
		int i_192_ = ((cd) this).C - 1 <= i_191_ ? i_191_ : i_191_ + 1;
		if ((or.e ^ 0xffffffff) == 0
		    || hk.a(i, or.e, i_189_, (byte) 108, i_191_)) {
		    boolean bool = false;
		    boolean bool_193_ = false;
		    boolean[] bools = new boolean[4];
		    byte i_194_ = is_185_[i_189_][i_191_];
		    int i_195_ = is_186_[i_189_][i_191_];
		    int i_196_ = 0xff & is_188_[i_189_][i_191_];
		    int i_197_ = is_187_[i_189_][i_191_] & 0xff;
		    int i_198_ = is_187_[i_189_][i_192_] & 0xff;
		    int i_199_ = 0xff & is_187_[i_190_][i_192_];
		    int i_200_ = 0xff & is_187_[i_190_][i_191_];
		    if (i_196_ != 0 || i_197_ != 0) {
			ng var_ng
			    = i_196_ != 0 ? k.a(i_196_ - 1, (byte) 19) : null;
			gda var_gda
			    = i_197_ != 0 ? u.b(false, i_197_ - 1) : null;
			if (i_194_ == 0 && var_ng == null)
			    i_194_ = (byte) 12;
			ng var_ng_201_ = var_ng;
			if (var_ng != null) {
			    if ((((ng) var_ng).d ^ 0xffffffff) == 0
				&& (((ng) var_ng).j ^ 0xffffffff) == 0) {
				var_ng_201_ = var_ng;
				var_ng = null;
			    } else if (var_gda != null && i_194_ != 0)
				bool_193_ = ((ng) var_ng).r;
			}
			if ((i_194_ == 0 || i_194_ == 12) && i_189_ > 0
			    && i_191_ > 0 && ((cd) this).q > i_189_
			    && i_191_ < ((cd) this).C) {
			    int i_202_ = 0;
			    int i_203_ = 0;
			    int i_204_ = 0;
			    i_203_ = (i_203_
				      - (is_187_[i_190_][i_191_ - 1] != i_197_
					 ? 1 : 1));
			    i_204_
				= i_204_ + (is_187_[i_190_][i_192_] == i_197_
					    ? 1 : -1);
			    int i_205_ = 0;
			    i_202_ = i_202_ - (i_197_ != (is_187_[i_189_ - 1]
							  [i_191_ - 1])
					       ? 1 : 1);
			    if (i_197_ == is_187_[i_189_][i_191_ - 1]) {
				i_202_++;
				i_203_++;
			    } else {
				i_202_--;
				i_203_--;
			    }
			    i_205_ = (i_205_
				      + (is_187_[i_189_ - 1][i_192_] == i_197_
					 ? 1 : -1));
			    if (i_197_ == is_187_[i_190_][i_191_]) {
				i_204_++;
				i_203_++;
			    } else {
				i_204_--;
				i_203_--;
			    }
			    if (i_197_ != is_187_[i_189_][i_192_]) {
				i_205_--;
				i_204_--;
			    } else {
				i_204_++;
				i_205_++;
			    }
			    if (is_187_[i_189_ - 1][i_191_] != i_197_) {
				i_202_--;
				i_205_--;
			    } else {
				i_205_++;
				i_202_++;
			    }
			    int i_206_ = i_202_ - i_204_;
			    if (i_206_ < 0)
				i_206_ = -i_206_;
			    int i_207_ = i_203_ - i_205_;
			    if (i_207_ < 0)
				i_207_ = -i_207_;
			    if (i_207_ == i_206_) {
				i_206_
				    = (class_i.a(i_191_, (byte) 51, i_189_)
				       - class_i.a(i_192_, (byte) 51, i_190_));
				if (i_206_ < 0)
				    i_206_ = -i_206_;
				i_207_
				    = (class_i.a(i_191_, (byte) 51, i_190_)
				       - class_i.a(i_192_, (byte) 51, i_189_));
				if (i_207_ < 0)
				    i_207_ = -i_207_;
			    }
			    i_195_ = i_207_ <= i_206_ ? 0 : 1;
			}
			for (int i_208_ = 0; i_208_ < 13; i_208_++) {
			    mk.f[i_208_] = -1;
			    Class_lb.h[i_208_] = 1;
			}
			boolean[] bools_209_
			    = (var_ng != null && ((ng) var_ng).r ? uj.J[i_194_]
			       : dt.Cb[i_194_]);
			a(i_191_, i_194_, var_gda, class_r, is_188_, is_186_,
			  i_189_, is_185_, var_ng, ((cd) this).q,
			  i_182_ ^ ~0x2d94, i_195_, ((cd) this).C, bools);
			boolean bool_210_
			    = (var_ng != null
			       && ((ng) var_ng).j != ((ng) var_ng).d);
			if (!bool_210_) {
			    for (int i_211_ = 0; i_211_ < 8; i_211_++) {
				if (mk.f[i_211_] >= 0
				    && bi.V[i_211_] != sk.u[i_211_]) {
				    bool_210_ = true;
				    break;
				}
			    }
			}
			if (!bools_209_[i_195_ + 1 & 0x3])
			    bools[1] = Class_ug.a(bools[1],
						  uca.a(Class_lb.h[4],
							Class_lb.h[2]) == 0);
			if (!bools_209_[i_195_ + 3 & 0x3])
			    bools[3] = Class_ug.a(bools[3],
						  uca.a(Class_lb.h[0],
							Class_lb.h[6]) == 0);
			if (!bools_209_[0x3 & i_195_])
			    bools[0] = Class_ug.a(bools[0],
						  uca.a(Class_lb.h[0],
							Class_lb.h[2]) == 0);
			if (!bools_209_[0x3 & i_195_ + 2])
			    bools[2] = Class_ug.a(bools[2],
						  uca.a(Class_lb.h[6],
							Class_lb.h[4]) == 0);
			if (!bool_193_ && (i_194_ == 0 || i_194_ == 12)) {
			    if (!bools[0] || bools[1] || bools[2]
				|| !bools[3]) {
				if (!bools[0] || !bools[1] || bools[2]
				    || bools[3]) {
				    if (bools[0] || !bools[1] || !bools[2]
					|| bools[3]) {
					if (!bools[0] && !bools[1] && bools[2]
					    && bools[3]) {
					    bools[2] = bools[3] = false;
					    i_195_ = 1;
					    i_194_ = (i_194_ == 0 ? (byte) 13
						      : (byte) 14);
					}
				    } else {
					bools[1] = bools[2] = false;
					i_195_ = 2;
					i_194_ = (i_194_ == 0 ? (byte) 13
						  : (byte) 14);
				    }
				} else {
				    i_195_ = 3;
				    i_194_
					= i_194_ != 0 ? (byte) 14 : (byte) 13;
				    bools[0] = bools[1] = false;
				}
			    } else {
				i_194_ = i_194_ == 0 ? (byte) 13 : (byte) 14;
				bools[0] = bools[3] = false;
				i_195_ = 0;
			    }
			}
			boolean bool_212_
			    = (!bool_193_ && !bools[0] && !bools[2]
			       && !bools[1] && !bools[3]);
			int[] is_213_ = null;
			int i_214_;
			int[] is_215_;
			int[] is_216_;
			int i_217_;
			int[] is_218_;
			if (bool_212_) {
			    is_216_ = Class_qb.h[i_194_];
			    i_217_ = var_gda == null ? 0 : bm.j[i_194_];
			    is_218_ = uu.b[i_194_];
			    is_215_ = vk.h[i_194_];
			    i_214_ = var_ng == null ? 0 : Class_ab.a[i_194_];
			} else if (bool_193_) {
			    i_214_ = var_ng == null ? 0 : lh.l[i_194_];
			    is_215_ = Class_wb.k[i_194_];
			    is_216_ = Class_lc.eb[i_194_];
			    is_213_ = pc.K[i_194_];
			    i_217_ = var_gda != null ? em.d[i_194_] : 0;
			    is_218_ = pl.E[i_194_];
			} else {
			    i_214_ = var_ng == null ? 0 : jn.y[i_194_];
			    is_213_ = ka.d[i_194_];
			    is_218_ = sp.u[i_194_];
			    is_216_ = vc.a[i_194_];
			    i_217_ = var_gda == null ? 0 : pda.j[i_194_];
			    is_215_ = ew.o[i_194_];
			}
			int i_219_ = i_214_ + i_217_;
			if (i_219_ <= 0)
			    oga.a(i, i_189_, i_191_);
			else {
			    if (bools[0])
				i_219_++;
			    if (bools[2])
				i_219_++;
			    if (bools[1])
				i_219_++;
			    if (bools[3])
				i_219_++;
			    int i_220_ = 0;
			    int i_221_ = 0;
			    int i_222_ = i_219_ * 3;
			    int[] is_223_ = bool_210_ ? new int[i_222_] : null;
			    int[] is_224_ = new int[i_222_];
			    int[] is_225_ = new int[i_222_];
			    int[] is_226_ = new int[i_222_];
			    int[] is_227_ = new int[i_222_];
			    int[] is_228_ = new int[i_222_];
			    int[] is_229_ = (class_i_184_ == null ? null
					     : new int[i_222_]);
			    int[] is_230_
				= (class_i_184_ != null || class_i_183_ != null
				   ? new int[i_222_] : null);
			    int i_231_ = -1;
			    int i_232_ = -1;
			    int i_233_ = 256;
			    if (var_ng != null) {
				i_233_ = ((ng) var_ng).c;
				i_232_ = ((ng) var_ng).q;
				i_231_ = ((ng) var_ng).d;
				int i_234_ = hga.a(class_r, var_ng, 119);
				for (int i_235_ = 0; i_214_ > i_235_;
				     i_235_++) {
				    boolean bool_236_ = false;
				    int i_237_;
				    if (bools[-i_195_ & 0x3]
					&& is_213_[0] == i_220_) {
					eq.K[0] = is_218_[i_220_];
					eq.K[1] = 1;
					eq.K[2] = is_215_[i_220_];
					eq.K[3] = 1;
					eq.K[4] = is_216_[i_220_];
					eq.K[5] = is_215_[i_220_];
					i_237_ = 6;
				    } else if (!bools[-i_195_ + 2 & 0x3]
					       || i_220_ != is_213_[2]) {
					if (!bools[-i_195_ + 1 & 0x3]
					    || i_220_ != is_213_[1]) {
					    if (bools[-i_195_ + 3 & 0x3]
						&& i_220_ == is_213_[3]) {
						eq.K[0] = is_218_[i_220_];
						eq.K[1] = 7;
						eq.K[2] = is_215_[i_220_];
						eq.K[3] = 7;
						eq.K[4] = is_216_[i_220_];
						eq.K[5] = is_215_[i_220_];
						i_237_ = 6;
					    } else {
						eq.K[0] = is_218_[i_220_];
						eq.K[1] = is_216_[i_220_];
						i_237_ = 3;
						eq.K[2] = is_215_[i_220_];
					    }
					} else {
					    eq.K[0] = is_218_[i_220_];
					    eq.K[1] = 3;
					    eq.K[2] = is_215_[i_220_];
					    eq.K[3] = 3;
					    eq.K[4] = is_216_[i_220_];
					    i_237_ = 6;
					    eq.K[5] = is_215_[i_220_];
					}
				    } else {
					eq.K[0] = is_218_[i_220_];
					eq.K[1] = 5;
					eq.K[2] = is_215_[i_220_];
					eq.K[3] = 5;
					eq.K[4] = is_216_[i_220_];
					i_237_ = 6;
					eq.K[5] = is_215_[i_220_];
				    }
				    i_220_++;
				    for (int i_238_ = 0; i_237_ > i_238_;
					 i_238_++) {
					int i_239_ = eq.K[i_238_];
					int i_240_ = 0x7 & i_239_ - 2 * i_195_;
					int i_241_ = p[i_239_];
					int i_242_ = c[i_239_];
					int i_243_;
					int i_244_;
					if (i_195_ != 1) {
					    if (i_195_ != 2) {
						if (i_195_ == 3) {
						    i_244_ = 512 - i_242_;
						    i_243_ = i_241_;
						} else {
						    i_244_ = i_241_;
						    i_243_ = i_242_;
						}
					    } else {
						i_244_ = 512 - i_241_;
						i_243_ = -i_242_ + 512;
					    }
					} else {
					    i_243_ = -i_241_ + 512;
					    i_244_ = i_242_;
					}
					is_224_[i_221_] = i_244_;
					is_225_[i_221_] = i_243_;
					if (is_229_ != null
					    && Class_lc.X[i_194_][i_239_]) {
					    int i_245_
						= (i_189_ << 9) + i_244_;
					    int i_246_
						= (i_191_ << 9) + i_243_;
					    is_229_[i_221_]
						= (class_i_184_.a(i_246_,
								  i_245_, true)
						   - class_i.a(i_246_, i_245_,
							       true));
					}
					if (is_230_ != null) {
					    if (class_i_184_ == null
						|| (Class_lc.X[i_194_]
						    [i_239_])) {
						if (class_i_183_ != null
						    && !(ClientScript.m[i_194_]
							 [i_239_])) {
						    int i_247_
							= (i_244_
							   + (i_189_ << 9));
						    int i_248_
							= (i_243_
							   + (i_191_ << 9));
						    is_230_[i_221_]
							= ((class_i_183_.a
							    (i_248_, i_247_,
							     true))
							   - class_i.a(i_248_,
								       i_247_,
								       true));
						}
					    } else {
						int i_249_
						    = (i_189_ << 9) + i_244_;
						int i_250_
						    = (i_191_ << 9) + i_243_;
						is_230_[i_221_]
						    = (class_i.a(i_250_,
								 i_249_, true)
						       - class_i_184_.a(i_250_,
									i_249_,
									true));
					    }
					}
					if (i_239_ >= 8
					    || (mk.f[i_240_]
						<= ((ng) var_ng).g)) {
					    if (is_223_ != null)
						is_223_[i_221_] = i_234_;
					    is_227_[i_221_] = ((ng) var_ng).q;
					    is_228_[i_221_] = ((ng) var_ng).c;
					    is_226_[i_221_] = i_231_;
					} else {
					    if (is_223_ != null)
						is_223_[i_221_] = sk.u[i_240_];
					    is_228_[i_221_] = bf.R[i_240_];
					    is_227_[i_221_] = bh.C[i_240_];
					    is_226_[i_221_] = bi.V[i_240_];
					}
					i_221_++;
				    }
				}
				if (!((cd) this).b && i == 0)
				    al.a(i_189_, i_191_, ((ng) var_ng).n,
					 ((ng) var_ng).m * 8, ((ng) var_ng).a);
				if (i_194_ != 12 && ((ng) var_ng).d != -1
				    && ((ng) var_ng).f)
				    bool = true;
			    } else if (bool_212_)
				i_220_ += Class_ab.a[i_194_];
			    else if (bool_193_)
				i_220_ += lh.l[i_194_];
			    else
				i_220_ += jn.y[i_194_];
			    if (var_gda != null) {
				if (i_198_ == 0)
				    i_198_ = i_197_;
				if (i_200_ == 0)
				    i_200_ = i_197_;
				if (i_199_ == 0)
				    i_199_ = i_197_;
				gda var_gda_251_ = u.b(false, i_197_ - 1);
				gda var_gda_252_ = u.b(false, i_198_ - 1);
				gda var_gda_253_ = u.b(false, i_199_ - 1);
				gda var_gda_254_ = u.b(false, i_200_ - 1);
				for (int i_255_ = 0; i_217_ > i_255_;
				     i_255_++) {
				    boolean bool_256_ = false;
				    int i_257_;
				    if (!bools[-i_195_ & 0x3]
					|| is_213_[0] != i_220_) {
					if (bools[-i_195_ + 2 & 0x3]
					    && is_213_[2] == i_220_) {
					    eq.K[0] = is_218_[i_220_];
					    eq.K[1] = 5;
					    eq.K[2] = is_215_[i_220_];
					    eq.K[3] = 5;
					    eq.K[4] = is_216_[i_220_];
					    i_257_ = 6;
					    eq.K[5] = is_215_[i_220_];
					} else if (bools[-i_195_ + 1 & 0x3]
						   && is_213_[1] == i_220_) {
					    eq.K[0] = is_218_[i_220_];
					    eq.K[1] = 3;
					    eq.K[2] = is_215_[i_220_];
					    eq.K[3] = 3;
					    eq.K[4] = is_216_[i_220_];
					    eq.K[5] = is_215_[i_220_];
					    i_257_ = 6;
					} else if (bools[0x3 & -i_195_ + 3]
						   && i_220_ == is_213_[3]) {
					    eq.K[0] = is_218_[i_220_];
					    eq.K[1] = 7;
					    eq.K[2] = is_215_[i_220_];
					    eq.K[3] = 7;
					    eq.K[4] = is_216_[i_220_];
					    eq.K[5] = is_215_[i_220_];
					    i_257_ = 6;
					} else {
					    eq.K[0] = is_218_[i_220_];
					    eq.K[1] = is_216_[i_220_];
					    i_257_ = 3;
					    eq.K[2] = is_215_[i_220_];
					}
				    } else {
					eq.K[0] = is_218_[i_220_];
					eq.K[1] = 1;
					eq.K[2] = is_215_[i_220_];
					eq.K[3] = 1;
					eq.K[4] = is_216_[i_220_];
					i_257_ = 6;
					eq.K[5] = is_215_[i_220_];
				    }
				    for (int i_258_ = 0; i_257_ > i_258_;
					 i_258_++) {
					int i_259_ = eq.K[i_258_];
					int i_260_ = 0x7 & i_259_ - i_195_ * 2;
					int i_261_ = p[i_259_];
					int i_262_ = c[i_259_];
					int i_263_;
					int i_264_;
					if (i_195_ == 1) {
					    i_263_ = i_262_;
					    i_264_ = 512 - i_261_;
					} else if (i_195_ != 2) {
					    if (i_195_ != 3) {
						i_263_ = i_261_;
						i_264_ = i_262_;
					    } else {
						i_264_ = i_261_;
						i_263_ = -i_262_ + 512;
					    }
					} else {
					    i_263_ = 512 - i_261_;
					    i_264_ = 512 - i_262_;
					}
					is_224_[i_221_] = i_263_;
					is_225_[i_221_] = i_264_;
					if (is_229_ != null
					    && Class_lc.X[i_194_][i_259_]) {
					    int i_265_
						= i_263_ + (i_189_ << 9);
					    int i_266_
						= (i_191_ << 9) + i_264_;
					    is_229_[i_221_]
						= (class_i_184_.a(i_266_,
								  i_265_, true)
						   - class_i.a(i_266_, i_265_,
							       true));
					}
					if (is_230_ != null) {
					    if (class_i_184_ != null
						&& !(Class_lc.X[i_194_]
						     [i_259_])) {
						int i_267_
						    = (i_189_ << 9) + i_263_;
						int i_268_
						    = i_264_ + (i_191_ << 9);
						is_230_[i_221_]
						    = (class_i.a(i_268_,
								 i_267_, true)
						       - class_i_184_.a(i_268_,
									i_267_,
									true));
					    } else if (class_i_183_ != null
						       && !(ClientScript.m[i_194_]
							    [i_259_])) {
						int i_269_
						    = (i_189_ << 9) + i_263_;
						int i_270_
						    = i_264_ + (i_191_ << 9);
						is_230_[i_221_]
						    = (class_i_183_.a(i_270_,
								      i_269_,
								      true)
						       - class_i.a(i_270_,
								   i_269_,
								   true));
					    }
					}
					if (i_259_ >= 8 || mk.f[i_260_] < 0) {
					    if (!bool_193_
						|| !(Class_lc.X[i_194_]
						     [i_259_])) {
						if (i_263_ == 0
						    && i_264_ == 0) {
						    is_226_[i_221_]
							= is[i_189_][i_191_];
						    is_227_[i_221_]
							= (((gda) var_gda_251_)
							   .m);
						    is_228_[i_221_]
							= (((gda) var_gda_251_)
							   .o);
						} else if (i_263_ == 0
							   && i_264_ == 512) {
						    is_226_[i_221_]
							= is[i_189_][i_192_];
						    is_227_[i_221_]
							= (((gda) var_gda_252_)
							   .m);
						    is_228_[i_221_]
							= (((gda) var_gda_252_)
							   .o);
						} else if (i_263_ == 512
							   && i_264_ == 512) {
						    is_226_[i_221_]
							= is[i_190_][i_192_];
						    is_227_[i_221_]
							= (((gda) var_gda_253_)
							   .m);
						    is_228_[i_221_]
							= (((gda) var_gda_253_)
							   .o);
						} else if (i_263_ == 512
							   && i_264_ == 0) {
						    is_226_[i_221_]
							= is[i_190_][i_191_];
						    is_227_[i_221_]
							= (((gda) var_gda_254_)
							   .m);
						    is_228_[i_221_]
							= (((gda) var_gda_254_)
							   .o);
						} else {
						    if (i_263_ < 256) {
							if (i_264_ >= 256) {
							    is_227_[i_221_]
								= (((gda)
								    var_gda_252_)
								   .m);
							    is_228_[i_221_]
								= (((gda)
								    var_gda_252_)
								   .o);
							} else {
							    is_227_[i_221_]
								= (((gda)
								    var_gda_251_)
								   .m);
							    is_228_[i_221_]
								= (((gda)
								    var_gda_251_)
								   .o);
							}
						    } else if (i_264_ < 256) {
							is_227_[i_221_]
							    = ((gda)
							       var_gda_254_).m;
							is_228_[i_221_]
							    = ((gda)
							       var_gda_254_).o;
						    } else {
							is_227_[i_221_]
							    = ((gda)
							       var_gda_253_).m;
							is_228_[i_221_]
							    = ((gda)
							       var_gda_253_).o;
						    }
						    int i_271_
							= (vf.a
							   (is[i_189_][i_191_],
							    is[i_190_][i_191_],
							    i_263_ << 7 >> 9,
							    (byte) 99));
						    int i_272_
							= (vf.a
							   (is[i_189_][i_192_],
							    is[i_190_][i_192_],
							    i_263_ << 7 >> 9,
							    (byte) 99));
						    is_226_[i_221_]
							= vf.a(i_271_, i_272_,
							       (i_264_ << 7
								>> 9),
							       (byte) 99);
						}
					    } else {
						is_227_[i_221_] = i_232_;
						is_228_[i_221_] = i_233_;
						is_226_[i_221_] = i_231_;
					    }
					    if (is_223_ != null)
						is_223_[i_221_]
						    = is_226_[i_221_];
					} else {
					    if (is_223_ != null)
						is_223_[i_221_] = sk.u[i_260_];
					    is_228_[i_221_] = bf.R[i_260_];
					    is_227_[i_221_] = bh.C[i_260_];
					    is_226_[i_221_] = bi.V[i_260_];
					}
					i_221_++;
				    }
				    i_220_++;
				}
				if (i_194_ != 0 && ((gda) var_gda).b)
				    bool = true;
			    }
			    int i_273_ = class_i.a(i_191_, (byte) 51, i_189_);
			    int i_274_ = class_i.a(i_191_, (byte) 51, i_190_);
			    int i_275_ = class_i.a(i_192_, (byte) 51, i_190_);
			    int i_276_ = class_i.a(i_192_, (byte) 51, i_189_);
			    boolean bool_277_ = ItemDef.b(i_191_, i_189_, 5706);
			    if (bool_277_ && i > 1 || !bool_277_ && i > 0) {
				boolean bool_278_ = true;
				if (var_gda != null && !((gda) var_gda).f)
				    bool_278_ = false;
				else if (i_197_ == 0 && i_194_ != 0)
				    bool_278_ = false;
				else if (i_196_ > 0 && var_ng_201_ != null
					 && !((ng) var_ng_201_).p)
				    bool_278_ = false;
				if (bool_278_ && i_273_ == i_274_
				    && i_275_ == i_273_ && i_276_ == i_273_)
				    ((cd) this).v[i][i_189_][i_191_]
					= (byte) hba.bitwiseArg1ORArg2((((cd) this).v[i]
							[i_189_][i_191_]),
						       4);
			    }
			    int i_279_ = 0;
			    int i_280_ = 0;
			    int i_281_ = 0;
			    if (((cd) this).b) {
				i_279_ = IncomingPackets.a(i_189_, i_191_);
				i_280_ = Class_lc.b(i_189_, i_191_);
				i_281_ = oi.a(i_189_, i_191_);
			    }
			    class_i.O(i_189_, i_191_, is_224_, is_229_,
				      is_225_, is_230_, is_226_, is_223_,
				      is_227_, is_228_, i_279_, i_280_, i_281_,
				      bool);
			    oga.a(i, i_189_, i_191_);
			}
		    }
		}
	    }
	}
    }
    
    private final void a(int i, int i_282_, int i_283_, int i_284_,
			 boolean bool, int i_285_) {
	if (bool != true)
	    a(null, null, null, (byte) 51);
	for (int i_286_ = i_282_; i_282_ + i_284_ > i_286_; i_286_++) {
	    for (int i_287_ = i_283_; i_287_ < i + i_283_; i_287_++) {
		if (i_287_ >= 0 && i_287_ < ((cd) this).q && i_286_ >= 0
		    && i_286_ < ((cd) this).C)
		    ((cd) this).i[i_285_][i_287_][i_286_]
			= (i_285_ > 0
			   ? ((cd) this).i[i_285_ - 1][i_287_][i_286_] - 960
			   : 0);
	    }
	}
	f++;
	if (i_283_ > 0 && i_283_ < ((cd) this).q) {
	    for (int i_288_ = i_282_ + 1; i_284_ + i_282_ > i_288_; i_288_++) {
		if (i_288_ >= 0 && ((cd) this).C > i_288_)
		    ((cd) this).i[i_285_][i_283_][i_288_]
			= ((cd) this).i[i_285_][i_283_ - 1][i_288_];
	    }
	}
	if (i_282_ > 0 && i_282_ < ((cd) this).C) {
	    for (int i_289_ = i_283_ + 1; i_289_ < i_283_ + i; i_289_++) {
		if (i_289_ >= 0 && i_289_ < ((cd) this).q)
		    ((cd) this).i[i_285_][i_289_][i_282_]
			= ((cd) this).i[i_285_][i_289_][i_282_ - 1];
	    }
	}
	if (i_283_ >= 0 && i_282_ >= 0 && ((cd) this).q > i_283_
	    && ((cd) this).C > i_282_) {
	    if (i_285_ != 0) {
		if (i_283_ > 0
		    && (((cd) this).i[i_285_][i_283_ - 1][i_282_]
			!= ((cd) this).i[i_285_ - 1][i_283_ - 1][i_282_]))
		    ((cd) this).i[i_285_][i_283_][i_282_]
			= ((cd) this).i[i_285_][i_283_ - 1][i_282_];
		else if (i_282_ <= 0
			 || (((cd) this).i[i_285_][i_283_][i_282_ - 1]
			     == (((cd) this).i[i_285_ - 1][i_283_]
				 [i_282_ - 1]))) {
		    if (i_283_ > 0 && i_282_ > 0
			&& (((cd) this).i[i_285_][i_283_ - 1][i_282_ - 1]
			    != (((cd) this).i[i_285_ - 1][i_283_ - 1]
				[i_282_ - 1])))
			((cd) this).i[i_285_][i_283_][i_282_]
			    = ((cd) this).i[i_285_][i_283_ - 1][i_282_ - 1];
		} else
		    ((cd) this).i[i_285_][i_283_][i_282_]
			= ((cd) this).i[i_285_][i_283_][i_282_ - 1];
	    } else if (i_283_ > 0
		       && ((cd) this).i[i_285_][i_283_ - 1][i_282_] != 0)
		((cd) this).i[i_285_][i_283_][i_282_]
		    = ((cd) this).i[i_285_][i_283_ - 1][i_282_];
	    else if (i_282_ <= 0
		     || ((cd) this).i[i_285_][i_283_][i_282_ - 1] == 0) {
		if (i_283_ > 0 && i_282_ > 0
		    && ((cd) this).i[i_285_][i_283_ - 1][i_282_ - 1] != 0)
		    ((cd) this).i[i_285_][i_283_][i_282_]
			= ((cd) this).i[i_285_][i_283_ - 1][i_282_ - 1];
	    } else
		((cd) this).i[i_285_][i_283_][i_282_]
		    = ((cd) this).i[i_285_][i_283_][i_282_ - 1];
	}
    }
    
    public static void a(int i) {
	y = null;
	if (i != 9964)
	    a(80);
	m = null;
    }
    
    final void a(Class_i class_i, Class_i class_i_290_, int i,
		 Class_r class_r) {
	o++;
	int[][] is = new int[((cd) this).q][((cd) this).C];
	if (rk.t == null || rk.t.length != ((cd) this).C) {
	    vu.b = new int[((cd) this).C];
	    rk.t = new int[((cd) this).C];
	    kaa.m = new int[((cd) this).C];
	    dr.x = new int[((cd) this).C];
	    jba.d = new int[((cd) this).C];
	}
	int i_291_ = 86 % ((i - 52) / 48);
	for (int i_292_ = 0; ((cd) this).s > i_292_; i_292_++) {
	    for (int i_293_ = 0; i_293_ < ((cd) this).C; i_293_++) {
		rk.t[i_293_] = 0;
		jba.d[i_293_] = 0;
		kaa.m[i_293_] = 0;
		dr.x[i_293_] = 0;
		vu.b[i_293_] = 0;
	    }
	    for (int i_294_ = -5; ((cd) this).q > i_294_; i_294_++) {
		for (int i_295_ = 0; i_295_ < ((cd) this).C; i_295_++) {
		    int i_296_ = i_294_ + 5;
		    if (i_296_ < ((cd) this).q) {
			int i_297_ = 0xff & l[i_292_][i_296_][i_295_];
			if (i_297_ > 0) {
			    gda var_gda = u.b(false, i_297_ - 1);
			    rk.t[i_295_] += ((gda) var_gda).c;
			    jba.d[i_295_] += ((gda) var_gda).k;
			    kaa.m[i_295_] += ((gda) var_gda).i;
			    dr.x[i_295_] += ((gda) var_gda).g;
			    vu.b[i_295_]++;
			}
		    }
		    int i_298_ = i_294_ - 5;
		    if (i_298_ >= 0) {
			int i_299_ = l[i_292_][i_298_][i_295_] & 0xff;
			if (i_299_ > 0) {
			    gda var_gda = u.b(false, i_299_ - 1);
			    rk.t[i_295_] -= ((gda) var_gda).c;
			    jba.d[i_295_] -= ((gda) var_gda).k;
			    kaa.m[i_295_] -= ((gda) var_gda).i;
			    dr.x[i_295_] -= ((gda) var_gda).g;
			    vu.b[i_295_]--;
			}
		    }
		}
		if (i_294_ >= 0) {
		    int i_300_ = 0;
		    int i_301_ = 0;
		    int i_302_ = 0;
		    int i_303_ = 0;
		    int i_304_ = 0;
		    for (int i_305_ = -5; ((cd) this).C > i_305_; i_305_++) {
			int i_306_ = i_305_ + 5;
			if (((cd) this).C > i_306_) {
			    i_302_ += kaa.m[i_306_];
			    i_303_ += dr.x[i_306_];
			    i_304_ += vu.b[i_306_];
			    i_300_ += rk.t[i_306_];
			    i_301_ += jba.d[i_306_];
			}
			int i_307_ = i_305_ - 5;
			if (i_307_ >= 0) {
			    i_302_ -= kaa.m[i_307_];
			    i_303_ -= dr.x[i_307_];
			    i_300_ -= rk.t[i_307_];
			    i_304_ -= vu.b[i_307_];
			    i_301_ -= jba.d[i_307_];
			}
			if (i_305_ >= 0 && i_303_ > 0 && i_304_ > 0)
			    is[i_294_][i_305_]
				= nc.a(217, 256 * i_300_ / i_303_,
				       i_302_ / i_304_, i_301_ / i_304_);
		    }
		}
	    }
	    if (!dh.d)
		a(class_r, i_292_ != 0 ? null : class_i_290_,
		  Class_q.b[i_292_], true, is, i_292_,
		  i_292_ != 0 ? null : class_i);
	    else
		a(i_292_, (byte) -121, Class_q.b[i_292_], class_r, is,
		  i_292_ != 0 ? null : class_i,
		  i_292_ != 0 ? null : class_i_290_);
	    l[i_292_] = null;
	    j[i_292_] = null;
	    h[i_292_] = null;
	    d[i_292_] = null;
	}
	if (!((cd) this).b) {
	    if (Interface.pd != 0)
		mv.a();
	    if (iv.y)
		Class_ab.a();
	}
	for (int i_308_ = 0; ((cd) this).s > i_308_; i_308_++)
	    Class_q.b[i_308_].BA();
    }
    
    cd(int i, int i_309_, int i_310_, boolean bool, cp var_cp, jf var_jf) {
	c = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128,
			256 };
	k = var_cp;
	((cd) this).b = bool;
	((cd) this).q = i_309_;
	((cd) this).s = i;
	u = var_jf;
	((cd) this).C = i_310_;
	j = new byte[((cd) this).s][((cd) this).q][((cd) this).C];
	d = new byte[((cd) this).s][((cd) this).q][((cd) this).C];
	l = new byte[((cd) this).s][((cd) this).q][((cd) this).C];
	((cd) this).v
	    = new byte[((cd) this).s][((cd) this).q + 1][((cd) this).C + 1];
	h = new byte[((cd) this).s][((cd) this).q][((cd) this).C];
	((cd) this).i
	    = new int[((cd) this).s][((cd) this).q + 1][((cd) this).C + 1];
    }
}
