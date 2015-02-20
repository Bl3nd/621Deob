/* aga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aga
{
    int a;
    int b;
    byte[] c;
    int d;
    int e;
    byte[] f;
    int g;
    int h;
    int[] i;
    
    final void a() {
	byte[] is = ((aga) this).c;
	if (((aga) this).f == null) {
	    for (int i = ((aga) this).d - 1; i >= 0; i--) {
		int i_0_ = i * ((aga) this).b;
		for (int i_1_ = (i + 1) * ((aga) this).b; i_0_ < i_1_;
		     i_0_++) {
		    i_1_--;
		    byte i_2_ = is[i_0_];
		    is[i_0_] = is[i_1_];
		    is[i_1_] = i_2_;
		}
	    }
	} else {
	    byte[] is_3_ = ((aga) this).f;
	    for (int i = ((aga) this).d - 1; i >= 0; i--) {
		int i_4_ = i * ((aga) this).b;
		for (int i_5_ = (i + 1) * ((aga) this).b; i_4_ < i_5_;
		     i_4_++) {
		    i_5_--;
		    byte i_6_ = is[i_4_];
		    is[i_4_] = is[i_5_];
		    is[i_5_] = i_6_;
		    i_6_ = is_3_[i_4_];
		    is_3_[i_4_] = is_3_[i_5_];
		    is_3_[i_5_] = i_6_;
		}
	    }
	}
	int i = ((aga) this).e;
	((aga) this).e = ((aga) this).a;
	((aga) this).a = i;
    }
    
    static final aga a(pl var_pl, int i, int i_7_) {
	byte[] is = var_pl.b(i_7_, 45, i);
	if (is == null)
	    return null;
	return a(is)[0];
    }
    
    static final aga[] a(pl var_pl, int i) {
	byte[] is = var_pl.a((int) 95, i);
	if (is == null)
	    return null;
	return a(is);
    }
    
    final void b() {
	int i = c();
	int i_8_ = d();
	if (((aga) this).b != i || ((aga) this).d != i_8_) {
	    byte[] is = new byte[i * i_8_];
	    if (((aga) this).f != null) {
		byte[] is_9_ = new byte[i * i_8_];
		for (int i_10_ = 0; i_10_ < ((aga) this).d; i_10_++) {
		    int i_11_ = i_10_ * ((aga) this).b;
		    int i_12_ = (i_10_ + ((aga) this).g) * i + ((aga) this).e;
		    for (int i_13_ = 0; i_13_ < ((aga) this).b; i_13_++) {
			is[i_12_] = ((aga) this).c[i_11_];
			is_9_[i_12_++] = ((aga) this).f[i_11_++];
		    }
		}
		((aga) this).f = is_9_;
	    } else {
		for (int i_14_ = 0; i_14_ < ((aga) this).d; i_14_++) {
		    int i_15_ = i_14_ * ((aga) this).b;
		    int i_16_ = (i_14_ + ((aga) this).g) * i + ((aga) this).e;
		    for (int i_17_ = 0; i_17_ < ((aga) this).b; i_17_++)
			is[i_16_++] = ((aga) this).c[i_15_++];
		}
	    }
	    ((aga) this).e = ((aga) this).a = ((aga) this).g
		= ((aga) this).h = 0;
	    ((aga) this).b = i;
	    ((aga) this).d = i_8_;
	    ((aga) this).c = is;
	}
    }
    
    final int c() {
	return ((aga) this).b + ((aga) this).e + ((aga) this).a;
    }
    
    private static final aga[] a(byte[] is) {
	BytesParser var_es = new BytesParser(is);
	((BytesParser) var_es).pos = is.length - 2;
	int i = var_es.readShort(13111);
	aga[] var_agas = new aga[i];
	for (int i_18_ = 0; i_18_ < i; i_18_++)
	    var_agas[i_18_] = new aga();
	((BytesParser) var_es).pos = is.length - 7 - i * 8;
	int i_19_ = var_es.readShort(13111);
	int i_20_ = var_es.readShort(13111);
	int i_21_ = (var_es.readUnsignedByte(-9268) & 0xff) + 1;
	for (int i_22_ = 0; i_22_ < i; i_22_++)
	    ((aga) var_agas[i_22_]).e = var_es.readShort(13111);
	for (int i_23_ = 0; i_23_ < i; i_23_++)
	    ((aga) var_agas[i_23_]).g = var_es.readShort(13111);
	for (int i_24_ = 0; i_24_ < i; i_24_++)
	    ((aga) var_agas[i_24_]).b = var_es.readShort(13111);
	for (int i_25_ = 0; i_25_ < i; i_25_++)
	    ((aga) var_agas[i_25_]).d = var_es.readShort(13111);
	for (int i_26_ = 0; i_26_ < i; i_26_++) {
	    aga var_aga = var_agas[i_26_];
	    ((aga) var_aga).a = i_19_ - ((aga) var_aga).b - ((aga) var_aga).e;
	    ((aga) var_aga).h = i_20_ - ((aga) var_aga).d - ((aga) var_aga).g;
	}
	((BytesParser) var_es).pos = is.length - 7 - i * 8 - (i_21_ - 1) * 3;
	int[] is_27_ = new int[i_21_];
	for (int i_28_ = 1; i_28_ < i_21_; i_28_++) {
	    is_27_[i_28_] = var_es.readTribyte(-1);
	    if (is_27_[i_28_] == 0)
		is_27_[i_28_] = 1;
	}
	for (int i_29_ = 0; i_29_ < i; i_29_++)
	    ((aga) var_agas[i_29_]).i = is_27_;
	((BytesParser) var_es).pos = 0;
	for (int i_30_ = 0; i_30_ < i; i_30_++) {
	    aga var_aga = var_agas[i_30_];
	    int i_31_ = ((aga) var_aga).b * ((aga) var_aga).d;
	    ((aga) var_aga).c = new byte[i_31_];
	    int i_32_ = var_es.readUnsignedByte(-9268);
	    if ((i_32_ & 0x2) == 0) {
		if ((i_32_ & 0x1) == 0) {
		    for (int i_33_ = 0; i_33_ < i_31_; i_33_++)
			((aga) var_aga).c[i_33_] = var_es.readByte(-20933);
		} else {
		    for (int i_34_ = 0; i_34_ < ((aga) var_aga).b; i_34_++) {
			for (int i_35_ = 0; i_35_ < ((aga) var_aga).d; i_35_++)
			    ((aga) var_aga).c[(i_34_
					       + i_35_ * ((aga) var_aga).b)]
				= var_es.readByte(-20933);
		    }
		}
	    } else {
		boolean bool = false;
		((aga) var_aga).f = new byte[i_31_];
		if ((i_32_ & 0x1) == 0) {
		    for (int i_36_ = 0; i_36_ < i_31_; i_36_++)
			((aga) var_aga).c[i_36_] = var_es.readByte(-20933);
		    for (int i_37_ = 0; i_37_ < i_31_; i_37_++) {
			byte i_38_
			    = ((aga) var_aga).f[i_37_] = var_es.readByte(-20933);
			bool = bool | i_38_ != -1;
		    }
		} else {
		    for (int i_39_ = 0; i_39_ < ((aga) var_aga).b; i_39_++) {
			for (int i_40_ = 0; i_40_ < ((aga) var_aga).d; i_40_++)
			    ((aga) var_aga).c[(i_39_
					       + i_40_ * ((aga) var_aga).b)]
				= var_es.readByte(-20933);
		    }
		    for (int i_41_ = 0; i_41_ < ((aga) var_aga).b; i_41_++) {
			for (int i_42_ = 0; i_42_ < ((aga) var_aga).d;
			     i_42_++) {
			    byte i_43_
				= (((aga) var_aga).f
				       [i_41_ + i_42_ * ((aga) var_aga).b]
				   = var_es.readByte(-20933));
			    bool = bool | i_43_ != -1;
			}
		    }
		}
		if (!bool)
		    ((aga) var_aga).f = null;
	    }
	}
	return var_agas;
    }
    
    final int d() {
	return ((aga) this).d + ((aga) this).g + ((aga) this).h;
    }
    
    static final aga b(pl var_pl, int i) {
	byte[] is = var_pl.a((int) 102, i);
	if (is == null)
	    return null;
	return a(is)[0];
    }
    
    static final aga[] b(pl var_pl, int i, int i_44_) {
	byte[] is = var_pl.b(i_44_, 66, i);
	if (is == null)
	    return null;
	return a(is);
    }
    
    final void a(int i) {
	int i_45_ = -1;
	if (((aga) this).i.length < 255) {
	    for (int i_46_ = 0; i_46_ < ((aga) this).i.length; i_46_++) {
		if (((aga) this).i[i_46_] == i) {
		    i_45_ = i_46_;
		    break;
		}
	    }
	    if (i_45_ == -1) {
		i_45_ = ((aga) this).i.length;
		int[] is = new int[((aga) this).i.length + 1];
		co.a(((aga) this).i, 0, is, 0, ((aga) this).i.length);
		((aga) this).i = is;
		is[i_45_] = i;
	    }
	} else {
	    int i_47_ = 2147483647;
	    int i_48_ = i >> 16 & 0xff;
	    int i_49_ = i >> 8 & 0xff;
	    int i_50_ = i & 0xff;
	    for (int i_51_ = 0; i_51_ < ((aga) this).i.length; i_51_++) {
		int i_52_ = ((aga) this).i[i_51_];
		int i_53_ = i_52_ >> 16 & 0xff;
		int i_54_ = i_52_ >> 8 & 0xff;
		int i_55_ = i_52_ & 0xff;
		int i_56_ = i_48_ - i_53_;
		if (i_56_ < 0)
		    i_56_ = -i_56_;
		int i_57_ = i_49_ - i_54_;
		if (i_57_ < 0)
		    i_57_ = -i_57_;
		int i_58_ = i_50_ - i_55_;
		if (i_58_ < 0)
		    i_58_ = -i_58_;
		int i_59_ = i_56_ + i_57_ + i_58_;
		if (i_59_ < i_47_) {
		    i_47_ = i_59_;
		    i_45_ = i_51_;
		}
	    }
	}
	int i_60_ = 0;
	byte[] is = new byte[((aga) this).b * ((aga) this).d];
	for (int i_61_ = 0; i_61_ < ((aga) this).d; i_61_++) {
	    for (int i_62_ = 0; i_62_ < ((aga) this).b; i_62_++) {
		int i_63_ = ((aga) this).c[i_60_] & 0xff;
		if (((aga) this).i[i_63_] == 0) {
		    if (i_62_ > 0
			&& (((aga) this).i[((aga) this).c[i_60_ - 1] & 0xff]
			    != 0))
			i_63_ = i_45_;
		    else if (i_61_ > 0
			     && (((aga) this).i
				 [(((aga) this).c[i_60_ - ((aga) this).b]
				   & 0xff)]) != 0)
			i_63_ = i_45_;
		    else if (i_62_ < ((aga) this).b - 1
			     && (((aga) this).i
				 [((aga) this).c[i_60_ + 1] & 0xff]) != 0)
			i_63_ = i_45_;
		    else if (i_61_ < ((aga) this).d - 1
			     && (((aga) this).i
				 [(((aga) this).c[i_60_ + ((aga) this).b]
				   & 0xff)]) != 0)
			i_63_ = i_45_;
		}
		is[i_60_++] = (byte) i_63_;
	    }
	}
	((aga) this).c = is;
    }
    
    final void e() {
	byte[] is = new byte[((aga) this).b * ((aga) this).d];
	int i = 0;
	if (((aga) this).f == null) {
	    for (int i_64_ = 0; i_64_ < ((aga) this).b; i_64_++) {
		for (int i_65_ = ((aga) this).d - 1; i_65_ >= 0; i_65_--)
		    is[i++] = ((aga) this).c[i_64_ + i_65_ * ((aga) this).b];
	    }
	    ((aga) this).c = is;
	} else {
	    byte[] is_66_ = new byte[((aga) this).b * ((aga) this).d];
	    for (int i_67_ = 0; i_67_ < ((aga) this).b; i_67_++) {
		for (int i_68_ = ((aga) this).d - 1; i_68_ >= 0; i_68_--) {
		    is[i] = ((aga) this).c[i_67_ + i_68_ * ((aga) this).b];
		    is_66_[i++]
			= ((aga) this).f[i_67_ + i_68_ * ((aga) this).b];
		}
	    }
	    ((aga) this).c = is;
	    ((aga) this).f = is_66_;
	}
	int i_69_ = ((aga) this).g;
	((aga) this).g = ((aga) this).e;
	((aga) this).e = ((aga) this).h;
	((aga) this).h = ((aga) this).a;
	((aga) this).a = ((aga) this).g;
	i_69_ = ((aga) this).d;
	((aga) this).d = ((aga) this).b;
	((aga) this).b = i_69_;
    }
    
    final int[] f() {
	int i = c();
	int[] is = new int[i * d()];
	if (((aga) this).f != null) {
	    for (int i_70_ = 0; i_70_ < ((aga) this).d; i_70_++) {
		int i_71_ = i_70_ * ((aga) this).b;
		int i_72_ = ((aga) this).e + (i_70_ + ((aga) this).g) * i;
		for (int i_73_ = 0; i_73_ < ((aga) this).b; i_73_++) {
		    is[i_72_++]
			= (((aga) this).f[i_71_] << 24
			   | ((aga) this).i[((aga) this).c[i_71_] & 0xff]);
		    i_71_++;
		}
	    }
	} else {
	    for (int i_74_ = 0; i_74_ < ((aga) this).d; i_74_++) {
		int i_75_ = i_74_ * ((aga) this).b;
		int i_76_ = ((aga) this).e + (i_74_ + ((aga) this).g) * i;
		for (int i_77_ = 0; i_77_ < ((aga) this).b; i_77_++) {
		    int i_78_ = ((aga) this).i[((aga) this).c[i_75_++] & 0xff];
		    if (i_78_ != 0)
			is[i_76_++] = ~0xffffff | i_78_;
		    else
			is[i_76_++] = 0;
		}
	    }
	}
	return is;
    }
    
    final void g() {
	byte[] is = ((aga) this).c;
	if (((aga) this).f == null) {
	    for (int i = (((aga) this).d >> 1) - 1; i >= 0; i--) {
		int i_79_ = i * ((aga) this).b;
		int i_80_ = (((aga) this).d - i - 1) * ((aga) this).b;
		for (int i_81_ = -((aga) this).b; i_81_ < 0; i_81_++) {
		    byte i_82_ = is[i_79_];
		    is[i_79_] = is[i_80_];
		    is[i_80_] = i_82_;
		    i_79_++;
		    i_80_++;
		}
	    }
	} else {
	    byte[] is_83_ = ((aga) this).f;
	    for (int i = (((aga) this).d >> 1) - 1; i >= 0; i--) {
		int i_84_ = i * ((aga) this).b;
		int i_85_ = (((aga) this).d - i - 1) * ((aga) this).b;
		for (int i_86_ = -((aga) this).b; i_86_ < 0; i_86_++) {
		    byte i_87_ = is[i_84_];
		    is[i_84_] = is[i_85_];
		    is[i_85_] = i_87_;
		    i_87_ = is_83_[i_84_];
		    is_83_[i_84_] = is_83_[i_85_];
		    is_83_[i_85_] = i_87_;
		    i_84_++;
		    i_85_++;
		}
	    }
	}
	int i = ((aga) this).g;
	((aga) this).g = ((aga) this).h;
	((aga) this).h = i;
    }
    
    final void b(int i) {
	int i_88_ = c();
	int i_89_ = d();
	if (((aga) this).b != i_88_ || ((aga) this).d != i_89_) {
	    int i_90_ = i;
	    if (i_90_ > ((aga) this).e)
		i_90_ = ((aga) this).e;
	    int i_91_ = i;
	    if (i_91_ + ((aga) this).e + ((aga) this).b > i_88_)
		i_91_ = i_88_ - ((aga) this).e - ((aga) this).b;
	    int i_92_ = i;
	    if (i_92_ > ((aga) this).g)
		i_92_ = ((aga) this).g;
	    int i_93_ = i;
	    if (i_93_ + ((aga) this).g + ((aga) this).d > i_89_)
		i_93_ = i_89_ - ((aga) this).g - ((aga) this).d;
	    int i_94_ = ((aga) this).b + i_90_ + i_91_;
	    int i_95_ = ((aga) this).d + i_92_ + i_93_;
	    byte[] is = new byte[i_94_ * i_95_];
	    if (((aga) this).f == null) {
		for (int i_96_ = 0; i_96_ < ((aga) this).d; i_96_++) {
		    int i_97_ = i_96_ * ((aga) this).b;
		    int i_98_ = (i_96_ + i_92_) * i_94_ + i_90_;
		    for (int i_99_ = 0; i_99_ < ((aga) this).b; i_99_++)
			is[i_98_++] = ((aga) this).c[i_97_++];
		}
	    } else {
		byte[] is_100_ = new byte[i_94_ * i_95_];
		for (int i_101_ = 0; i_101_ < ((aga) this).d; i_101_++) {
		    int i_102_ = i_101_ * ((aga) this).b;
		    int i_103_ = (i_101_ + i_92_) * i_94_ + i_90_;
		    for (int i_104_ = 0; i_104_ < ((aga) this).b; i_104_++) {
			is_100_[i_103_] = ((aga) this).f[i_102_];
			is[i_103_++] = ((aga) this).c[i_102_++];
		    }
		}
		((aga) this).f = is_100_;
	    }
	    ((aga) this).e -= i_90_;
	    ((aga) this).g -= i_92_;
	    ((aga) this).a -= i_91_;
	    ((aga) this).h -= i_93_;
	    ((aga) this).b = i_94_;
	    ((aga) this).d = i_95_;
	    ((aga) this).c = is;
	}
    }
    
    final void c(int i) {
	int i_105_ = -1;
	if (((aga) this).i.length < 255) {
	    for (int i_106_ = 0; i_106_ < ((aga) this).i.length; i_106_++) {
		if (((aga) this).i[i_106_] == i) {
		    i_105_ = i_106_;
		    break;
		}
	    }
	    if (i_105_ == -1) {
		i_105_ = ((aga) this).i.length;
		int[] is = new int[((aga) this).i.length + 1];
		co.a(((aga) this).i, 0, is, 0, ((aga) this).i.length);
		((aga) this).i = is;
		is[i_105_] = i;
	    }
	} else {
	    int i_107_ = 2147483647;
	    int i_108_ = i >> 16 & 0xff;
	    int i_109_ = i >> 8 & 0xff;
	    int i_110_ = i & 0xff;
	    for (int i_111_ = 0; i_111_ < ((aga) this).i.length; i_111_++) {
		int i_112_ = ((aga) this).i[i_111_];
		int i_113_ = i_112_ >> 16 & 0xff;
		int i_114_ = i_112_ >> 8 & 0xff;
		int i_115_ = i_112_ & 0xff;
		int i_116_ = i_108_ - i_113_;
		if (i_116_ < 0)
		    i_116_ = -i_116_;
		int i_117_ = i_109_ - i_114_;
		if (i_117_ < 0)
		    i_117_ = -i_117_;
		int i_118_ = i_110_ - i_115_;
		if (i_118_ < 0)
		    i_118_ = -i_118_;
		int i_119_ = i_116_ + i_117_ + i_118_;
		if (i_119_ < i_107_) {
		    i_107_ = i_119_;
		    i_105_ = i_111_;
		}
	    }
	}
	for (int i_120_ = ((aga) this).d - 1; i_120_ > 0; i_120_--) {
	    int i_121_ = i_120_ * ((aga) this).b;
	    for (int i_122_ = ((aga) this).b - 1; i_122_ > 0; i_122_--) {
		if (((aga) this).i[((aga) this).c[i_122_ + i_121_] & 0xff] == 0
		    && (((aga) this).i
			[(((aga) this).c[i_122_ + i_121_ - 1 - ((aga) this).b]
			  & 0xff)]) != 0)
		    ((aga) this).c[i_122_ + i_121_] = (byte) i_105_;
	    }
	}
    }
    
    public aga() {
	/* empty */
    }
}
