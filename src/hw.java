/* hw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hw extends pn
{
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private boolean B;
    private int C;
    private int D;
    
    private static final int a
	(int i, byte[] is, int[] is_0_, int i_1_, int i_2_, int i_3_, int i_4_,
	 int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, hw var_hw) {
	i_1_ >>= 8;
	i_9_ >>= 8;
	i_3_ <<= 2;
	i_4_ <<= 2;
	i_5_ <<= 2;
	i_6_ <<= 2;
	if ((i_7_ = i_2_ + i_9_ - i_1_) > i_8_)
	    i_7_ = i_8_;
	var_hw.o += var_hw.s * (i_7_ - i_2_);
	i_2_ <<= 1;
	i_7_ <<= 1;
	i_7_ -= 6;
	while (i_2_ < i_7_) {
	    i = is[i_1_++];
	    is_0_[i_2_++] += i * i_3_;
	    i_3_ += i_5_;
	    is_0_[i_2_++] += i * i_4_;
	    i_4_ += i_6_;
	    i = is[i_1_++];
	    is_0_[i_2_++] += i * i_3_;
	    i_3_ += i_5_;
	    is_0_[i_2_++] += i * i_4_;
	    i_4_ += i_6_;
	    i = is[i_1_++];
	    is_0_[i_2_++] += i * i_3_;
	    i_3_ += i_5_;
	    is_0_[i_2_++] += i * i_4_;
	    i_4_ += i_6_;
	    i = is[i_1_++];
	    is_0_[i_2_++] += i * i_3_;
	    i_3_ += i_5_;
	    is_0_[i_2_++] += i * i_4_;
	    i_4_ += i_6_;
	}
	i_7_ += 6;
	while (i_2_ < i_7_) {
	    i = is[i_1_++];
	    is_0_[i_2_++] += i * i_3_;
	    i_3_ += i_5_;
	    is_0_[i_2_++] += i * i_4_;
	    i_4_ += i_6_;
	}
	var_hw.z = i_3_ >> 2;
	var_hw.u = i_4_ >> 2;
	var_hw.x = i_1_ << 8;
	return i_2_ >> 1;
    }
    
    private static final int a(int i, int i_10_, byte[] is, int[] is_11_,
			       int i_12_, int i_13_, int i_14_, int i_15_,
			       int i_16_, int i_17_, int i_18_, int i_19_,
			       int i_20_, hw var_hw, int i_21_, int i_22_) {
	var_hw.o -= var_hw.s * i_13_;
	if (i_21_ == 0
	    || (i_18_ = i_13_ + (i_20_ + 256 - i_12_ + i_21_) / i_21_) > i_19_)
	    i_18_ = i_19_;
	i_13_ <<= 1;
	i_18_ <<= 1;
	while (i_13_ < i_18_) {
	    i_10_ = i_12_ >> 8;
	    i = is[i_10_ - 1];
	    i = (i << 8) + (is[i_10_] - i) * (i_12_ & 0xff);
	    is_11_[i_13_++] += i * i_14_ >> 6;
	    i_14_ += i_16_;
	    is_11_[i_13_++] += i * i_15_ >> 6;
	    i_15_ += i_17_;
	    i_12_ += i_21_;
	}
	if (i_21_ == 0
	    || ((i_18_ = (i_13_ >> 1) + (i_20_ - i_12_ + i_21_) / i_21_)
		> i_19_))
	    i_18_ = i_19_;
	i_18_ <<= 1;
	i_10_ = i_22_;
	while (i_13_ < i_18_) {
	    i = (i_10_ << 8) + (is[i_12_ >> 8] - i_10_) * (i_12_ & 0xff);
	    is_11_[i_13_++] += i * i_14_ >> 6;
	    i_14_ += i_16_;
	    is_11_[i_13_++] += i * i_15_ >> 6;
	    i_15_ += i_17_;
	    i_12_ += i_21_;
	}
	i_13_ >>= 1;
	var_hw.o += var_hw.s * i_13_;
	var_hw.z = i_14_;
	var_hw.u = i_15_;
	var_hw.x = i_12_;
	return i_13_;
    }
    
    private static final int a(int i, int i_23_, byte[] is, int[] is_24_,
			       int i_25_, int i_26_, int i_27_, int i_28_,
			       int i_29_, int i_30_, hw var_hw, int i_31_,
			       int i_32_) {
	if (i_31_ == 0
	    || (i_28_ = i_26_ + (i_30_ + 256 - i_25_ + i_31_) / i_31_) > i_29_)
	    i_28_ = i_29_;
	while (i_26_ < i_28_) {
	    i_23_ = i_25_ >> 8;
	    i = is[i_23_ - 1];
	    is_24_[i_26_++]
		+= ((i << 8) + (is[i_23_] - i) * (i_25_ & 0xff)) * i_27_ >> 6;
	    i_25_ += i_31_;
	}
	if (i_31_ == 0
	    || (i_28_ = i_26_ + (i_30_ - i_25_ + i_31_) / i_31_) > i_29_)
	    i_28_ = i_29_;
	i = i_32_;
	i_23_ = i_31_;
	while (i_26_ < i_28_) {
	    is_24_[i_26_++]
		+= (((i << 8) + (is[i_25_ >> 8] - i) * (i_25_ & 0xff)) * i_27_
		    >> 6);
	    i_25_ += i_23_;
	}
	var_hw.x = i_25_;
	return i_26_;
    }
    
    private static final int a(byte[] is, int[] is_33_, int i, int i_34_,
			       int i_35_, int i_36_, int i_37_, int i_38_,
			       int i_39_, hw var_hw) {
	i >>= 8;
	i_39_ >>= 8;
	i_35_ <<= 2;
	i_36_ <<= 2;
	if ((i_37_ = i_34_ + i_39_ - i) > i_38_)
	    i_37_ = i_38_;
	var_hw.z += var_hw.v * (i_37_ - i_34_);
	var_hw.u += var_hw.w * (i_37_ - i_34_);
	i_37_ -= 3;
	while (i_34_ < i_37_) {
	    is_33_[i_34_++] += is[i++] * i_35_;
	    i_35_ += i_36_;
	    is_33_[i_34_++] += is[i++] * i_35_;
	    i_35_ += i_36_;
	    is_33_[i_34_++] += is[i++] * i_35_;
	    i_35_ += i_36_;
	    is_33_[i_34_++] += is[i++] * i_35_;
	    i_35_ += i_36_;
	}
	i_37_ += 3;
	while (i_34_ < i_37_) {
	    is_33_[i_34_++] += is[i++] * i_35_;
	    i_35_ += i_36_;
	}
	var_hw.o = i_35_ >> 2;
	var_hw.x = i << 8;
	return i_34_;
    }
    
    private static final int a(int i, int i_40_, byte[] is, int[] is_41_,
			       int i_42_, int i_43_, int i_44_, int i_45_,
			       int i_46_, int i_47_, int i_48_, hw var_hw,
			       int i_49_, int i_50_) {
	if (i_49_ == 0
	    || (i_46_ = i_43_ + (i_48_ - i_42_ + i_49_ - 257) / i_49_) > i_47_)
	    i_46_ = i_47_;
	i_43_ <<= 1;
	i_46_ <<= 1;
	while (i_43_ < i_46_) {
	    i_40_ = i_42_ >> 8;
	    i = is[i_40_];
	    i = (i << 8) + (is[i_40_ + 1] - i) * (i_42_ & 0xff);
	    is_41_[i_43_++] += i * i_44_ >> 6;
	    is_41_[i_43_++] += i * i_45_ >> 6;
	    i_42_ += i_49_;
	}
	if (i_49_ == 0
	    || ((i_46_ = (i_43_ >> 1) + (i_48_ - i_42_ + i_49_ - 1) / i_49_)
		> i_47_))
	    i_46_ = i_47_;
	i_46_ <<= 1;
	i_40_ = i_50_;
	while (i_43_ < i_46_) {
	    i = is[i_42_ >> 8];
	    i = (i << 8) + (i_40_ - i) * (i_42_ & 0xff);
	    is_41_[i_43_++] += i * i_44_ >> 6;
	    is_41_[i_43_++] += i * i_45_ >> 6;
	    i_42_ += i_49_;
	}
	var_hw.x = i_42_;
	return i_43_ >> 1;
    }
    
    final synchronized void a(int i, int i_51_, int i_52_) {
	if (i == 0)
	    d(i_51_, i_52_);
	else {
	    int i_53_ = b(i_51_, i_52_);
	    int i_54_ = c(i_51_, i_52_);
	    if (z == i_53_ && u == i_54_)
		t = 0;
	    else {
		int i_55_ = i_51_ - o;
		if (o - i_51_ > i_55_)
		    i_55_ = o - i_51_;
		if (i_53_ - z > i_55_)
		    i_55_ = i_53_ - z;
		if (z - i_53_ > i_55_)
		    i_55_ = z - i_53_;
		if (i_54_ - u > i_55_)
		    i_55_ = i_54_ - u;
		if (u - i_54_ > i_55_)
		    i_55_ = u - i_54_;
		if (i > i_55_)
		    i = i_55_;
		t = i;
		y = i_51_;
		C = i_52_;
		s = (i_51_ - o) / i;
		v = (i_53_ - z) / i;
		w = (i_54_ - u) / i;
	    }
	}
    }
    
    static final hw a(oaa var_oaa, int i, int i_56_) {
	if (((oaa) var_oaa).l == null || ((oaa) var_oaa).l.length == 0)
	    return null;
	return new hw(var_oaa,
		      (int) ((long) ((oaa) var_oaa).n * 256L * (long) i
			     / (long) (100 * gba.G)),
		      i_56_ << 6);
    }
    
    final pn b() {
	return null;
    }
    
    private static final int b(int i, int i_57_, byte[] is, int[] is_58_,
			       int i_59_, int i_60_, int i_61_, int i_62_,
			       int i_63_, int i_64_, int i_65_, int i_66_,
			       int i_67_, hw var_hw, int i_68_, int i_69_) {
	var_hw.o -= var_hw.s * i_60_;
	if (i_68_ == 0
	    || (i_65_ = i_60_ + (i_67_ - i_59_ + i_68_ - 257) / i_68_) > i_66_)
	    i_65_ = i_66_;
	i_60_ <<= 1;
	i_65_ <<= 1;
	while (i_60_ < i_65_) {
	    i_57_ = i_59_ >> 8;
	    i = is[i_57_];
	    i = (i << 8) + (is[i_57_ + 1] - i) * (i_59_ & 0xff);
	    is_58_[i_60_++] += i * i_61_ >> 6;
	    i_61_ += i_63_;
	    is_58_[i_60_++] += i * i_62_ >> 6;
	    i_62_ += i_64_;
	    i_59_ += i_68_;
	}
	if (i_68_ == 0
	    || ((i_65_ = (i_60_ >> 1) + (i_67_ - i_59_ + i_68_ - 1) / i_68_)
		> i_66_))
	    i_65_ = i_66_;
	i_65_ <<= 1;
	i_57_ = i_69_;
	while (i_60_ < i_65_) {
	    i = is[i_59_ >> 8];
	    i = (i << 8) + (i_57_ - i) * (i_59_ & 0xff);
	    is_58_[i_60_++] += i * i_61_ >> 6;
	    i_61_ += i_63_;
	    is_58_[i_60_++] += i * i_62_ >> 6;
	    i_62_ += i_64_;
	    i_59_ += i_68_;
	}
	i_60_ >>= 1;
	var_hw.o += var_hw.s * i_60_;
	var_hw.z = i_61_;
	var_hw.u = i_62_;
	var_hw.x = i_59_;
	return i_60_;
    }
    
    final synchronized void a(int i, int i_70_) {
	a(i, i_70_, e());
    }
    
    final synchronized int e() {
	if (C < 0)
	    return -1;
	return C;
    }
    
    private static final int b(int i, int i_71_, byte[] is, int[] is_72_,
			       int i_73_, int i_74_, int i_75_, int i_76_,
			       int i_77_, int i_78_, hw var_hw, int i_79_,
			       int i_80_) {
	if (i_79_ == 0
	    || (i_76_ = i_74_ + (i_78_ - i_73_ + i_79_ - 257) / i_79_) > i_77_)
	    i_76_ = i_77_;
	while (i_74_ < i_76_) {
	    i_71_ = i_73_ >> 8;
	    i = is[i_71_];
	    is_72_[i_74_++]
		+= (((i << 8) + (is[i_71_ + 1] - i) * (i_73_ & 0xff)) * i_75_
		    >> 6);
	    i_73_ += i_79_;
	}
	if (i_79_ == 0
	    || (i_76_ = i_74_ + (i_78_ - i_73_ + i_79_ - 1) / i_79_) > i_77_)
	    i_76_ = i_77_;
	i_71_ = i_80_;
	while (i_74_ < i_76_) {
	    i = is[i_73_ >> 8];
	    is_72_[i_74_++]
		+= ((i << 8) + (i_71_ - i) * (i_73_ & 0xff)) * i_75_ >> 6;
	    i_73_ += i_79_;
	}
	var_hw.x = i_73_;
	return i_74_;
    }
    
    final boolean f() {
	if (x >= 0 && x < ((oaa) (oaa) ((pn) this).n).l.length << 8)
	    return false;
	return true;
    }
    
    private final synchronized void b(int i) {
	d(i, e());
    }
    
    private static final int b(int i, int i_81_) {
	if (i_81_ < 0)
	    return i;
	return (int) (((double) i
		       * Math.sqrt((double) (16384 - i_81_) * 1.220703125E-4))
		      + 0.5);
    }
    
    private static final int a(byte[] is, int[] is_82_, int i, int i_83_,
			       int i_84_, int i_85_, int i_86_, int i_87_,
			       hw var_hw) {
	i >>= 8;
	i_87_ >>= 8;
	i_84_ <<= 2;
	if ((i_85_ = i_83_ + i_87_ - i) > i_86_)
	    i_85_ = i_86_;
	i_85_ -= 3;
	while (i_83_ < i_85_) {
	    is_82_[i_83_++] += is[i++] * i_84_;
	    is_82_[i_83_++] += is[i++] * i_84_;
	    is_82_[i_83_++] += is[i++] * i_84_;
	    is_82_[i_83_++] += is[i++] * i_84_;
	}
	i_85_ += 3;
	while (i_83_ < i_85_)
	    is_82_[i_83_++] += is[i++] * i_84_;
	var_hw.x = i << 8;
	return i_83_;
    }
    
    final synchronized int g() {
	if (p < 0)
	    return -p;
	return p;
    }
    
    final synchronized void c(int i) {
	if (p < 0)
	    p = -i;
	else
	    p = i;
    }
    
    private final int a(int[] is, int i, int i_88_, int i_89_, int i_90_) {
	while (t > 0) {
	    int i_91_ = i + t;
	    if (i_91_ > i_89_)
		i_91_ = i_89_;
	    t += i;
	    if (p == -256 && (x & 0xff) == 0) {
		if (wq.p)
		    i = b(0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, v,
			  w, 0, i_91_, i_88_, this);
		else
		    i = b(((oaa) (oaa) ((pn) this).n).l, is, x, i, o, s, 0,
			  i_91_, i_88_, this);
	    } else if (wq.p)
		i = a(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, v,
		      w, 0, i_91_, i_88_, this, p, i_90_);
	    else
		i = d(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, o, s, 0,
		      i_91_, i_88_, this, p, i_90_);
	    t -= i;
	    if (t != 0)
		return i;
	    if (j())
		return i_89_;
	}
	if (p == -256 && (x & 0xff) == 0) {
	    if (wq.p)
		return b(0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, 0,
			 i_89_, i_88_, this);
	    return b(((oaa) (oaa) ((pn) this).n).l, is, x, i, o, 0, i_89_,
		     i_88_, this);
	}
	if (wq.p)
	    return c(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, 0,
		     i_89_, i_88_, this, p, i_90_);
	return a(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, o, 0, i_89_,
		 i_88_, this, p, i_90_);
    }
    
    final synchronized void a(boolean bool) {
	p = (p ^ p >> 31) + (p >>> 31);
	if (bool)
	    p = -p;
    }
    
    private final void h() {
	if (t != 0) {
	    if (y == -2147483648)
		y = 0;
	    t = 0;
	    k();
	}
    }
    
    final synchronized void i(int i) {
	int i_92_ = ((oaa) (oaa) ((pn) this).n).l.length << 8;
	if (i < -1)
	    i = -1;
	if (i > i_92_)
	    i = i_92_;
	x = i;
    }
    
    final synchronized int i() {
	if (y == -2147483648)
	    return 0;
	return y;
    }
    
    private final int b(int[] is, int i, int i_93_, int i_94_, int i_95_) {
	while (t > 0) {
	    int i_96_ = i + t;
	    if (i_96_ > i_94_)
		i_96_ = i_94_;
	    t += i;
	    if (p == 256 && (x & 0xff) == 0) {
		if (wq.p)
		    i = a(0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, v,
			  w, 0, i_96_, i_93_, this);
		else
		    i = a(((oaa) (oaa) ((pn) this).n).l, is, x, i, o, s, 0,
			  i_96_, i_93_, this);
	    } else if (wq.p)
		i = b(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, v,
		      w, 0, i_96_, i_93_, this, p, i_95_);
	    else
		i = b(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, o, s, 0,
		      i_96_, i_93_, this, p, i_95_);
	    t -= i;
	    if (t != 0)
		return i;
	    if (j())
		return i_94_;
	}
	if (p == 256 && (x & 0xff) == 0) {
	    if (wq.p)
		return a(0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, 0,
			 i_94_, i_93_, this);
	    return a(((oaa) (oaa) ((pn) this).n).l, is, x, i, o, 0, i_94_,
		     i_93_, this);
	}
	if (wq.p)
	    return a(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, z, u, 0,
		     i_94_, i_93_, this, p, i_95_);
	return b(0, 0, ((oaa) (oaa) ((pn) this).n).l, is, x, i, o, 0, i_94_,
		 i_93_, this, p, i_95_);
    }
    
    private final boolean j() {
	int i = y;
	int i_97_;
	int i_98_;
	if (i == -2147483648)
	    i = i_97_ = i_98_ = 0;
	else {
	    i_97_ = b(i, C);
	    i_98_ = c(i, C);
	}
	if (o != i || z != i_97_ || u != i_98_) {
	    if (o < i) {
		s = 1;
		t = i - o;
	    } else if (o > i) {
		s = -1;
		t = o - i;
	    } else
		s = 0;
	    if (z < i_97_) {
		v = 1;
		if (t == 0 || t > i_97_ - z)
		    t = i_97_ - z;
	    } else if (z > i_97_) {
		v = -1;
		if (t == 0 || t > z - i_97_)
		    t = z - i_97_;
	    } else
		v = 0;
	    if (u < i_98_) {
		w = 1;
		if (t == 0 || t > i_98_ - u)
		    t = i_98_ - u;
	    } else if (u > i_98_) {
		w = -1;
		if (t == 0 || t > u - i_98_)
		    t = u - i_98_;
	    } else
		w = 0;
	    return false;
	}
	if (y == -2147483648) {
	    y = 0;
	    o = z = u = 0;
	    this.unlink(-41);
	    return true;
	}
	k();
	return false;
    }
    
    private static final int c(int i, int i_99_) {
	if (i_99_ < 0)
	    return -i;
	return (int) ((double) i * Math.sqrt((double) i_99_ * 1.220703125E-4)
		      + 0.5);
    }
    
    final synchronized void j(int i) {
	d(i << 6, e());
    }
    
    private static final int b(int i, byte[] is, int[] is_100_, int i_101_,
			       int i_102_, int i_103_, int i_104_, int i_105_,
			       int i_106_, int i_107_, int i_108_, int i_109_,
			       hw var_hw) {
	i_101_ >>= 8;
	i_109_ >>= 8;
	i_103_ <<= 2;
	i_104_ <<= 2;
	i_105_ <<= 2;
	i_106_ <<= 2;
	if ((i_107_ = i_102_ + i_101_ - (i_109_ - 1)) > i_108_)
	    i_107_ = i_108_;
	var_hw.o += var_hw.s * (i_107_ - i_102_);
	i_102_ <<= 1;
	i_107_ <<= 1;
	i_107_ -= 6;
	while (i_102_ < i_107_) {
	    i = is[i_101_--];
	    is_100_[i_102_++] += i * i_103_;
	    i_103_ += i_105_;
	    is_100_[i_102_++] += i * i_104_;
	    i_104_ += i_106_;
	    i = is[i_101_--];
	    is_100_[i_102_++] += i * i_103_;
	    i_103_ += i_105_;
	    is_100_[i_102_++] += i * i_104_;
	    i_104_ += i_106_;
	    i = is[i_101_--];
	    is_100_[i_102_++] += i * i_103_;
	    i_103_ += i_105_;
	    is_100_[i_102_++] += i * i_104_;
	    i_104_ += i_106_;
	    i = is[i_101_--];
	    is_100_[i_102_++] += i * i_103_;
	    i_103_ += i_105_;
	    is_100_[i_102_++] += i * i_104_;
	    i_104_ += i_106_;
	}
	i_107_ += 6;
	while (i_102_ < i_107_) {
	    i = is[i_101_--];
	    is_100_[i_102_++] += i * i_103_;
	    i_103_ += i_105_;
	    is_100_[i_102_++] += i * i_104_;
	    i_104_ += i_106_;
	}
	var_hw.z = i_103_ >> 2;
	var_hw.u = i_104_ >> 2;
	var_hw.x = i_101_ << 8;
	return i_102_ >> 1;
    }
    
    private static final int b(byte[] is, int[] is_110_, int i, int i_111_,
			       int i_112_, int i_113_, int i_114_, int i_115_,
			       hw var_hw) {
	i >>= 8;
	i_115_ >>= 8;
	i_112_ <<= 2;
	if ((i_113_ = i_111_ + i - (i_115_ - 1)) > i_114_)
	    i_113_ = i_114_;
	i_113_ -= 3;
	while (i_111_ < i_113_) {
	    is_110_[i_111_++] += is[i--] * i_112_;
	    is_110_[i_111_++] += is[i--] * i_112_;
	    is_110_[i_111_++] += is[i--] * i_112_;
	    is_110_[i_111_++] += is[i--] * i_112_;
	}
	i_113_ += 3;
	while (i_111_ < i_113_)
	    is_110_[i_111_++] += is[i--] * i_112_;
	var_hw.x = i << 8;
	return i_111_;
    }
    
    final pn a() {
	return null;
    }
    
    final synchronized void b(int[] is, int i, int i_116_) {
	if (y == 0 && t == 0)
	    a(i_116_);
	else {
	    oaa var_oaa = (oaa) ((pn) this).n;
	    int i_117_ = r << 8;
	    int i_118_ = D << 8;
	    int i_119_ = ((oaa) var_oaa).l.length << 8;
	    int i_120_ = i_118_ - i_117_;
	    if (i_120_ <= 0)
		q = 0;
	    int i_121_ = i;
	    i_116_ += i;
	    if (x < 0) {
		if (p > 0)
		    x = 0;
		else {
		    h();
		    this.unlink(-94);
		    return;
		}
	    }
	    if (x >= i_119_) {
		if (p < 0)
		    x = i_119_ - 1;
		else {
		    h();
		    this.unlink(-32);
		    return;
		}
	    }
	    if (q < 0) {
		if (B) {
		    if (p < 0) {
			i_121_ = a(is, i_121_, i_117_, i_116_,
				   ((oaa) var_oaa).l[r]);
			if (x >= i_117_)
			    return;
			x = i_117_ + i_117_ - 1 - x;
			p = -p;
		    }
		    for (;;) {
			i_121_ = b(is, i_121_, i_118_, i_116_,
				   ((oaa) var_oaa).l[D - 1]);
			if (x < i_118_)
			    break;
			x = i_118_ + i_118_ - 1 - x;
			p = -p;
			i_121_ = a(is, i_121_, i_117_, i_116_,
				   ((oaa) var_oaa).l[r]);
			if (x >= i_117_)
			    break;
			x = i_117_ + i_117_ - 1 - x;
			p = -p;
		    }
		} else if (p < 0) {
		    for (;;) {
			i_121_ = a(is, i_121_, i_117_, i_116_,
				   ((oaa) var_oaa).l[D - 1]);
			if (x >= i_117_)
			    break;
			x = i_118_ - 1 - (i_118_ - 1 - x) % i_120_;
		    }
		} else {
		    for (;;) {
			i_121_ = b(is, i_121_, i_118_, i_116_,
				   ((oaa) var_oaa).l[r]);
			if (x < i_118_)
			    break;
			x = i_117_ + (x - i_117_) % i_120_;
		    }
		}
	    } else {
		do {
		    if (q > 0) {
			if (B) {
			    if (p < 0) {
				i_121_ = a(is, i_121_, i_117_, i_116_,
					   ((oaa) var_oaa).l[r]);
				if (x >= i_117_)
				    return;
				x = i_117_ + i_117_ - 1 - x;
				p = -p;
				if (--q == 0)
				    break;
			    }
			    do {
				i_121_ = b(is, i_121_, i_118_, i_116_,
					   ((oaa) var_oaa).l[D - 1]);
				if (x < i_118_)
				    return;
				x = i_118_ + i_118_ - 1 - x;
				p = -p;
				if (--q == 0)
				    break;
				i_121_ = a(is, i_121_, i_117_, i_116_,
					   ((oaa) var_oaa).l[r]);
				if (x >= i_117_)
				    return;
				x = i_117_ + i_117_ - 1 - x;
				p = -p;
			    } while (--q != 0);
			} else if (p < 0) {
			    for (;;) {
				i_121_ = a(is, i_121_, i_117_, i_116_,
					   ((oaa) var_oaa).l[D - 1]);
				if (x >= i_117_)
				    return;
				int i_122_ = (i_118_ - 1 - x) / i_120_;
				if (i_122_ >= q) {
				    x += i_120_ * q;
				    q = 0;
				    break;
				}
				x += i_120_ * i_122_;
				q -= i_122_;
			    }
			} else {
			    for (;;) {
				i_121_ = b(is, i_121_, i_118_, i_116_,
					   ((oaa) var_oaa).l[r]);
				if (x < i_118_)
				    return;
				int i_123_ = (x - i_117_) / i_120_;
				if (i_123_ >= q) {
				    x -= i_120_ * q;
				    q = 0;
				    break;
				}
				x -= i_120_ * i_123_;
				q -= i_123_;
			    }
			}
		    }
		} while (false);
		if (p < 0) {
		    a(is, i_121_, 0, i_116_, 0);
		    if (x < 0) {
			x = -1;
			h();
			this.unlink(-70);
		    }
		} else {
		    b(is, i_121_, i_119_, i_116_, 0);
		    if (x >= i_119_) {
			x = i_119_;
			h();
			this.unlink(-67);
		    }
		}
	    }
	}
    }
    
    final int d() {
	if (y == 0 && t == 0)
	    return 0;
	return 1;
    }
    
    final int c() {
	int i = o * 3 >> 6;
	i = (i ^ i >> 31) + (i >>> 31);
	if (q == 0)
	    i -= i * x / (((oaa) (oaa) ((pn) this).n).l.length << 8);
	else if (q >= 0)
	    i -= i * r / ((oaa) (oaa) ((pn) this).n).l.length;
	if (i > 255)
	    return 255;
	return i;
    }
    
    final synchronized void a(int i) {
	if (t > 0) {
	    if (i >= t) {
		if (y == -2147483648) {
		    y = 0;
		    o = z = u = 0;
		    this.unlink(-92);
		    i = t;
		}
		t = 0;
		k();
	    } else {
		o += s * i;
		z += v * i;
		u += w * i;
		t -= i;
	    }
	}
	oaa var_oaa = (oaa) ((pn) this).n;
	int i_124_ = r << 8;
	int i_125_ = D << 8;
	int i_126_ = ((oaa) var_oaa).l.length << 8;
	int i_127_ = i_125_ - i_124_;
	if (i_127_ <= 0)
	    q = 0;
	if (x < 0) {
	    if (p > 0)
		x = 0;
	    else {
		h();
		this.unlink(-61);
		return;
	    }
	}
	if (x >= i_126_) {
	    if (p < 0)
		x = i_126_ - 1;
	    else {
		h();
		this.unlink(-79);
		return;
	    }
	}
	x += p * i;
	if (q < 0) {
	    if (B) {
		if (p < 0) {
		    if (x >= i_124_)
			return;
		    x = i_124_ + i_124_ - 1 - x;
		    p = -p;
		}
		while (x >= i_125_) {
		    x = i_125_ + i_125_ - 1 - x;
		    p = -p;
		    if (x >= i_124_)
			break;
		    x = i_124_ + i_124_ - 1 - x;
		    p = -p;
		}
	    } else if (p < 0) {
		if (x < i_124_)
		    x = i_125_ - 1 - (i_125_ - 1 - x) % i_127_;
	    } else if (x >= i_125_)
		x = i_124_ + (x - i_124_) % i_127_;
	} else {
	    do {
		if (q > 0) {
		    if (B) {
			if (p < 0) {
			    if (x >= i_124_)
				return;
			    x = i_124_ + i_124_ - 1 - x;
			    p = -p;
			    if (--q == 0)
				break;
			}
			do {
			    if (x < i_125_)
				return;
			    x = i_125_ + i_125_ - 1 - x;
			    p = -p;
			    if (--q == 0)
				break;
			    if (x >= i_124_)
				return;
			    x = i_124_ + i_124_ - 1 - x;
			    p = -p;
			} while (--q != 0);
		    } else if (p < 0) {
			if (x >= i_124_)
			    return;
			int i_128_ = (i_125_ - 1 - x) / i_127_;
			if (i_128_ >= q) {
			    x += i_127_ * q;
			    q = 0;
			} else {
			    x += i_127_ * i_128_;
			    q -= i_128_;
			    return;
			}
		    } else {
			if (x < i_125_)
			    return;
			int i_129_ = (x - i_124_) / i_127_;
			if (i_129_ >= q) {
			    x -= i_127_ * q;
			    q = 0;
			} else {
			    x -= i_127_ * i_129_;
			    q -= i_129_;
			    return;
			}
		    }
		}
	    } while (false);
	    if (p < 0) {
		if (x < 0) {
		    x = -1;
		    h();
		    this.unlink(-22);
		}
	    } else if (x >= i_126_) {
		x = i_126_;
		h();
		this.unlink(-106);
	    }
	}
    }
    
    private static final int b(byte[] is, int[] is_130_, int i, int i_131_,
			       int i_132_, int i_133_, int i_134_, int i_135_,
			       int i_136_, hw var_hw) {
	i >>= 8;
	i_136_ >>= 8;
	i_132_ <<= 2;
	i_133_ <<= 2;
	if ((i_134_ = i_131_ + i - (i_136_ - 1)) > i_135_)
	    i_134_ = i_135_;
	var_hw.z += var_hw.v * (i_134_ - i_131_);
	var_hw.u += var_hw.w * (i_134_ - i_131_);
	i_134_ -= 3;
	while (i_131_ < i_134_) {
	    is_130_[i_131_++] += is[i--] * i_132_;
	    i_132_ += i_133_;
	    is_130_[i_131_++] += is[i--] * i_132_;
	    i_132_ += i_133_;
	    is_130_[i_131_++] += is[i--] * i_132_;
	    i_132_ += i_133_;
	    is_130_[i_131_++] += is[i--] * i_132_;
	    i_132_ += i_133_;
	}
	i_134_ += 3;
	while (i_131_ < i_134_) {
	    is_130_[i_131_++] += is[i--] * i_132_;
	    i_132_ += i_133_;
	}
	var_hw.o = i_132_ >> 2;
	var_hw.x = i << 8;
	return i_131_;
    }
    
    private static final int b(int i, int i_137_, byte[] is, int[] is_138_,
			       int i_139_, int i_140_, int i_141_, int i_142_,
			       int i_143_, int i_144_, int i_145_, hw var_hw,
			       int i_146_, int i_147_) {
	var_hw.z -= var_hw.v * i_140_;
	var_hw.u -= var_hw.w * i_140_;
	if (i_146_ == 0
	    || ((i_143_ = i_140_ + (i_145_ - i_139_ + i_146_ - 257) / i_146_)
		> i_144_))
	    i_143_ = i_144_;
	while (i_140_ < i_143_) {
	    i_137_ = i_139_ >> 8;
	    i = is[i_137_];
	    is_138_[i_140_++]
		+= (((i << 8) + (is[i_137_ + 1] - i) * (i_139_ & 0xff))
		    * i_141_) >> 6;
	    i_141_ += i_142_;
	    i_139_ += i_146_;
	}
	if (i_146_ == 0
	    || ((i_143_ = i_140_ + (i_145_ - i_139_ + i_146_ - 1) / i_146_)
		> i_144_))
	    i_143_ = i_144_;
	i_137_ = i_147_;
	while (i_140_ < i_143_) {
	    i = is[i_139_ >> 8];
	    is_138_[i_140_++]
		+= ((i << 8) + (i_137_ - i) * (i_139_ & 0xff)) * i_141_ >> 6;
	    i_141_ += i_142_;
	    i_139_ += i_146_;
	}
	var_hw.z += var_hw.v * i_140_;
	var_hw.u += var_hw.w * i_140_;
	var_hw.o = i_141_;
	var_hw.x = i_139_;
	return i_140_;
    }
    
    private static final int a(int i, byte[] is, int[] is_148_, int i_149_,
			       int i_150_, int i_151_, int i_152_, int i_153_,
			       int i_154_, int i_155_, hw var_hw) {
	i_149_ >>= 8;
	i_155_ >>= 8;
	i_151_ <<= 2;
	i_152_ <<= 2;
	if ((i_153_ = i_150_ + i_155_ - i_149_) > i_154_)
	    i_153_ = i_154_;
	i_150_ <<= 1;
	i_153_ <<= 1;
	i_153_ -= 6;
	while (i_150_ < i_153_) {
	    i = is[i_149_++];
	    is_148_[i_150_++] += i * i_151_;
	    is_148_[i_150_++] += i * i_152_;
	    i = is[i_149_++];
	    is_148_[i_150_++] += i * i_151_;
	    is_148_[i_150_++] += i * i_152_;
	    i = is[i_149_++];
	    is_148_[i_150_++] += i * i_151_;
	    is_148_[i_150_++] += i * i_152_;
	    i = is[i_149_++];
	    is_148_[i_150_++] += i * i_151_;
	    is_148_[i_150_++] += i * i_152_;
	}
	i_153_ += 6;
	while (i_150_ < i_153_) {
	    i = is[i_149_++];
	    is_148_[i_150_++] += i * i_151_;
	    is_148_[i_150_++] += i * i_152_;
	}
	var_hw.x = i_149_ << 8;
	return i_150_ >> 1;
    }
    
    static final hw a(oaa var_oaa, int i, int i_156_, int i_157_) {
	if (((oaa) var_oaa).l == null || ((oaa) var_oaa).l.length == 0)
	    return null;
	return new hw(var_oaa, i, i_156_, i_157_);
    }
    
    final synchronized void k(int i) {
	if (i == 0) {
	    b(0);
	    this.unlink(-74);
	} else if (z == 0 && u == 0) {
	    t = 0;
	    y = 0;
	    o = 0;
	    this.unlink(-63);
	} else {
	    int i_158_ = -o;
	    if (o > i_158_)
		i_158_ = o;
	    if (-z > i_158_)
		i_158_ = -z;
	    if (z > i_158_)
		i_158_ = z;
	    if (-u > i_158_)
		i_158_ = -u;
	    if (u > i_158_)
		i_158_ = u;
	    if (i > i_158_)
		i = i_158_;
	    t = i;
	    y = -2147483648;
	    s = -o / i;
	    v = -z / i;
	    w = -u / i;
	}
    }
    
    private final void k() {
	o = y;
	z = b(y, C);
	u = c(y, C);
    }
    
    private static final int c(int i, int i_159_, byte[] is, int[] is_160_,
			       int i_161_, int i_162_, int i_163_, int i_164_,
			       int i_165_, int i_166_, int i_167_, hw var_hw,
			       int i_168_, int i_169_) {
	if (i_168_ == 0
	    || ((i_165_ = i_162_ + (i_167_ + 256 - i_161_ + i_168_) / i_168_)
		> i_166_))
	    i_165_ = i_166_;
	i_162_ <<= 1;
	i_165_ <<= 1;
	while (i_162_ < i_165_) {
	    i_159_ = i_161_ >> 8;
	    i = is[i_159_ - 1];
	    i = (i << 8) + (is[i_159_] - i) * (i_161_ & 0xff);
	    is_160_[i_162_++] += i * i_163_ >> 6;
	    is_160_[i_162_++] += i * i_164_ >> 6;
	    i_161_ += i_168_;
	}
	if (i_168_ == 0
	    || ((i_165_ = (i_162_ >> 1) + (i_167_ - i_161_ + i_168_) / i_168_)
		> i_166_))
	    i_165_ = i_166_;
	i_165_ <<= 1;
	i_159_ = i_169_;
	while (i_162_ < i_165_) {
	    i = (i_159_ << 8) + (is[i_161_ >> 8] - i_159_) * (i_161_ & 0xff);
	    is_160_[i_162_++] += i * i_163_ >> 6;
	    is_160_[i_162_++] += i * i_164_ >> 6;
	    i_161_ += i_168_;
	}
	var_hw.x = i_161_;
	return i_162_ >> 1;
    }
    
    private static final int b(int i, byte[] is, int[] is_170_, int i_171_,
			       int i_172_, int i_173_, int i_174_, int i_175_,
			       int i_176_, int i_177_, hw var_hw) {
	i_171_ >>= 8;
	i_177_ >>= 8;
	i_173_ <<= 2;
	i_174_ <<= 2;
	if ((i_175_ = i_172_ + i_171_ - (i_177_ - 1)) > i_176_)
	    i_175_ = i_176_;
	i_172_ <<= 1;
	i_175_ <<= 1;
	i_175_ -= 6;
	while (i_172_ < i_175_) {
	    i = is[i_171_--];
	    is_170_[i_172_++] += i * i_173_;
	    is_170_[i_172_++] += i * i_174_;
	    i = is[i_171_--];
	    is_170_[i_172_++] += i * i_173_;
	    is_170_[i_172_++] += i * i_174_;
	    i = is[i_171_--];
	    is_170_[i_172_++] += i * i_173_;
	    is_170_[i_172_++] += i * i_174_;
	    i = is[i_171_--];
	    is_170_[i_172_++] += i * i_173_;
	    is_170_[i_172_++] += i * i_174_;
	}
	i_175_ += 6;
	while (i_172_ < i_175_) {
	    i = is[i_171_--];
	    is_170_[i_172_++] += i * i_173_;
	    is_170_[i_172_++] += i * i_174_;
	}
	var_hw.x = i_171_ << 8;
	return i_172_ >> 1;
    }
    
    final synchronized void l(int i) {
	q = i;
    }
    
    private static final int d(int i, int i_178_, byte[] is, int[] is_179_,
			       int i_180_, int i_181_, int i_182_, int i_183_,
			       int i_184_, int i_185_, int i_186_, hw var_hw,
			       int i_187_, int i_188_) {
	var_hw.z -= var_hw.v * i_181_;
	var_hw.u -= var_hw.w * i_181_;
	if (i_187_ == 0
	    || ((i_184_ = i_181_ + (i_186_ + 256 - i_180_ + i_187_) / i_187_)
		> i_185_))
	    i_184_ = i_185_;
	while (i_181_ < i_184_) {
	    i_178_ = i_180_ >> 8;
	    i = is[i_178_ - 1];
	    is_179_[i_181_++]
		+= (((i << 8) + (is[i_178_] - i) * (i_180_ & 0xff)) * i_182_
		    >> 6);
	    i_182_ += i_183_;
	    i_180_ += i_187_;
	}
	if (i_187_ == 0
	    || ((i_184_ = i_181_ + (i_186_ - i_180_ + i_187_) / i_187_)
		> i_185_))
	    i_184_ = i_185_;
	i = i_188_;
	i_178_ = i_187_;
	while (i_181_ < i_184_) {
	    is_179_[i_181_++]
		+= (((i << 8) + (is[i_180_ >> 8] - i) * (i_180_ & 0xff))
		    * i_182_) >> 6;
	    i_182_ += i_183_;
	    i_180_ += i_178_;
	}
	var_hw.z += var_hw.v * i_181_;
	var_hw.u += var_hw.w * i_181_;
	var_hw.o = i_182_;
	var_hw.x = i_180_;
	return i_181_;
    }
    
    final boolean l() {
	if (t == 0)
	    return false;
	return true;
    }
    
    private hw(oaa var_oaa, int i, int i_189_) {
	((pn) this).n = var_oaa;
	r = ((oaa) var_oaa).m;
	D = ((oaa) var_oaa).o;
	B = ((oaa) var_oaa).p;
	p = i;
	y = i_189_;
	C = 8192;
	x = 0;
	k();
    }
    
    private hw(oaa var_oaa, int i, int i_190_, int i_191_) {
	((pn) this).n = var_oaa;
	r = ((oaa) var_oaa).m;
	D = ((oaa) var_oaa).o;
	B = ((oaa) var_oaa).p;
	p = i;
	y = i_190_;
	C = i_191_;
	x = 0;
	k();
    }
    
    private final synchronized void d(int i, int i_192_) {
	y = i;
	C = i_192_;
	t = 0;
	k();
    }
}
