/* fi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fi
{
    static int a;
    static int[] b = { 8, 11, 4, 6, 9, 7, 10, 0 };
    static int c;
    static int d;
    static int e;
    static int f;
    
    static final boolean a(int i, int i_0_, int i_1_) {
	a++;
	if (i != 512)
	    a((int) 7);
	if ((i_1_ & 0x400) == 0)
	    return false;
	return true;
    }
    
    public static void a(byte i) {
	b = null;
	if (i < 20)
	    a((byte) -104);
    }
    
    static final void a(Entity var_ni, int i, int i_2_, int i_3_, Entity var_ni_4_,
			int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
	f++;
	int i_10_ = var_ni_4_.a((byte) -7);
	if (i != 1071156814)
	    b = null;
	if (i_10_ != -1) {
	    Object object = null;
	    f var_f = (f) br.k.get((long) i_10_, (byte) 100);
	    if (var_f == null) {
		aga[] var_agas = aga.b(sm.a, i_10_, 0);
		if (var_agas == null)
		    return;
		var_f = lg.r.a(var_agas[0], true);
		br.k.put((long) i_10_, var_f, 1);
	    }
	    pfa.a(0, ((Animable) var_ni).locY, var_ni.i(-1) * 256, i - 1071156936, i_2_,
		  i_7_ >> 1, ((Animable) var_ni).height, i_8_, i_9_ >> 1,
		  ((Animable) var_ni).locX);
	    int i_11_ = i_6_ + lt.h[0] - 18;
	    i_11_ += 18 * (i_3_ / 4);
	    int i_12_ = i_5_ + (lt.h[1] - 16) - 54;
	    i_12_ += i_3_ % 4 * 18;
	    var_f.a(i_11_, i_12_);
	    if (var_ni == var_ni_4_)
		lg.r.b(18, i_12_ - 1, 18, i_11_ - 1, 20822, -256);
	    ej var_ej = gea.a(i - 1071156814);
	    ((ej) var_ej).g = i_11_ + 16;
	    ((ej) var_ej).n = i_11_;
	    ((ej) var_ej).k = var_ni_4_;
	    ((ej) var_ej).m = i_12_ + 16;
	    ((ej) var_ej).h = i_12_;
	    NPCDef.g.a(var_ej, 98);
	}
    }
    
    static final void a(fh var_fh, byte i) {
	e++;
	if (var_fh == sr.K) {
	    int i_13_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_14_ = (i_13_ & 0x7) + it.v;
	    int i_15_ = BytesParser.thisPlayersRegionY + i_14_;
	    int i_16_ = (0x7 & i_13_ >> 4) + sl.k;
	    int i_17_ = i_16_ + bfa.thisPlayersRegionX;
	    int i_18_ = faa.loginStream.readShort(13111);
	    int i_19_ = faa.loginStream.readShortReversed((byte) 109);
	    boolean bool = (i_16_ >= 0 && i_14_ >= 0 && Class_hc.e > i_16_
			    && i_14_ < bw.v);
	    if (bool || at.a(vn.J, (byte) -107)) {
		bn.a(new fn(i_18_, i_19_), wd.z, i_15_, -16777216, i_17_);
		if (bool)
		    br.a(1736, i_14_, wd.z, i_16_);
	    }
	} else if (var_fh == bh.z) {
	    int i_20_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_21_ = sl.k + (0x7 & i_20_ >> 4);
	    int i_22_ = (i_20_ & 0x7) + it.v;
	    int i_23_ = faa.loginStream.readShort(13111);
	    if (i_23_ == 65535)
		i_23_ = -1;
	    int i_24_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_25_ = i_24_ >> 4 & 0xf;
	    int i_26_ = 0x7 & i_24_;
	    int i_27_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_28_ = faa.loginStream.readUnsignedByte(-9268);
	    if (i_21_ >= 0 && i_22_ >= 0 && Class_hc.e > i_21_
		&& i_22_ < bw.v) {
		int i_29_ = i_25_ + 1;
		if (i_21_ - i_29_ <= ((Entity) up.thisPlayer).regionLocalX[0]
		    && ((Entity) up.thisPlayer).regionLocalX[0] <= i_21_ + i_29_
		    && ((Entity) up.thisPlayer).regionLocalY[0] >= i_22_ - i_29_
		    && ((Entity) up.thisPlayer).regionLocalY[0] <= i_22_ + i_29_)
		    uc.a(i_23_, -1, false, i_28_, i_26_, i_27_,
			 ((i_22_ << 8) + ((i_21_ << 16) + (wd.z << 24))
			  + i_25_));
	    }
	} else if (te.B == var_fh) {
	    faa.loginStream.readUnsignedByte(-9268);
	    int i_30_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_31_ = sl.k + ((0x75 & i_30_) >> 4);
	    int i_32_ = it.v + (i_30_ & 0x7);
	    int i_33_ = faa.loginStream.readShort(13111);
	    int i_34_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_35_ = faa.loginStream.readTribyte(-1);
	    String string = faa.loginStream.readString((byte) 122);
	    ga.a(4, i_32_, i_34_, i_33_, wd.z, i_35_, string, i_31_);
	} else if (hv.s == var_fh) {
	    int i_36_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_37_ = sl.k * 2 + (0xf & i_36_ >> 4);
	    int i_38_ = it.v * 2 + (0xf & i_36_);
	    int i_39_ = faa.loginStream.readUnsignedByte(-9268);
	    boolean bool = (0x1 & i_39_) != 0;
	    int i_40_ = i_39_ >> 1;
	    int i_41_ = i_37_ + faa.loginStream.readByte(-20933);
	    int i_42_ = i_38_ + faa.loginStream.readByte(-20933);
	    int i_43_ = faa.loginStream.readShort2(57);
	    int i_44_ = faa.loginStream.readShort2(19);
	    int i_45_ = faa.loginStream.readShort(13111);
	    int i_46_ = faa.loginStream.readByte(-20933);
	    int i_47_ = 4 * faa.loginStream.readUnsignedByte(-9268);
	    int i_48_ = faa.loginStream.readShort(13111);
	    int i_49_ = faa.loginStream.readShort(13111);
	    int i_50_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_51_ = faa.loginStream.readShort(13111);
	    if (i_50_ == 255)
		i_50_ = -1;
	    if (i_37_ >= 0 && i_38_ >= 0 && 2 * Class_hc.e > i_37_
		&& i_38_ < Class_hc.e * 2 && i_41_ >= 0 && i_42_ >= 0
		&& bw.v * 2 > i_41_ && i_42_ < 2 * bw.v && i_45_ != 65535) {
		i_46_ <<= 2;
		i_42_ *= 256;
		i_47_ <<= 2;
		i_38_ *= 256;
		i_37_ = 256 * i_37_;
		i_41_ *= 256;
		i_51_ <<= 2;
		if (i_43_ != 0) {
		    Entity var_ni = null;
		    if (i_43_ < 0) {
			int i_52_ = -i_43_ - 1;
			if (ih.n != i_52_)
			    var_ni = Class_fc.playersInScreen[i_52_];
			else
			    var_ni = up.thisPlayer;
		    } else {
			int i_53_ = i_43_ - 1;
			NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_53_);
			if (var_mi != null)
			    var_ni = ((NPCNode) var_mi).l;
		    }
		    if (var_ni != null) {
			cg var_cg = var_ni.k(32195);
			if (((cg) var_cg).y != null
			    && ((cg) var_cg).y[i_40_] != null) {
			    int i_54_ = ((cg) var_cg).y[i_40_][0];
			    int i_55_ = ((cg) var_cg).y[i_40_][2];
			    int i_56_ = ((Entity) var_ni).class_kd.getOrientation((byte) 67);
			    int i_57_ = GameInPacket.h[i_56_];
			    int i_58_ = GameInPacket.i[i_56_];
			    int i_59_ = i_54_ * i_58_ + i_57_ * i_55_ >> 14;
			    i_55_ = i_55_ * i_58_ - i_57_ * i_54_ >> 14;
			    i_54_ = i_59_;
			    i_37_ += i_54_;
			    i_38_ += i_55_;
			    i_46_ -= ((cg) var_cg).y[i_40_][1];
			}
		    }
		}
		bi var_bi = new bi(i_45_, wd.z, wd.z, i_37_, i_38_, i_46_,
				   pm.currentTimedTicks + i_48_, i_49_ + pm.currentTimedTicks, i_50_, i_51_,
				   i_44_, i_47_, bool);
		var_bi.a(i_42_, i_41_, 0, i_48_ + pm.currentTimedTicks,
			 Class_u.b(i_41_, wd.z, -20214, i_42_) - i_47_);
		iq.g.b(new ri(var_bi), (byte) 93);
	    }
	} else if (var_fh == pk.c) {
	    int i_60_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_61_ = sl.k * 2 + ((0xf9 & i_60_) >> 4);
	    int i_62_ = it.v * 2 + (0xf & i_60_);
	    boolean bool = faa.loginStream.readUnsignedByte(-9268) != 0;
	    int i_63_ = i_61_ + faa.loginStream.readByte(-20933);
	    int i_64_ = i_62_ + faa.loginStream.readByte(-20933);
	    int i_65_ = faa.loginStream.readShort2(44);
	    int i_66_ = faa.loginStream.readShort(13111);
	    int i_67_ = faa.loginStream.readUnsignedByte(-9268) * 4;
	    int i_68_ = faa.loginStream.readUnsignedByte(-9268) * 4;
	    int i_69_ = faa.loginStream.readShort(13111);
	    int i_70_ = faa.loginStream.readShort(13111);
	    int i_71_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_72_ = faa.loginStream.readShort(13111);
	    if (i_71_ == 255)
		i_71_ = -1;
	    if (i_61_ >= 0 && i_62_ >= 0 && 2 * Class_hc.e > i_61_
		&& i_62_ < Class_hc.e * 2 && i_63_ >= 0 && i_64_ >= 0
		&& bw.v * 2 > i_63_ && 2 * bw.v > i_64_ && i_66_ != 65535) {
		i_68_ <<= 2;
		i_67_ <<= 2;
		i_61_ = 256 * i_61_;
		i_72_ <<= 2;
		i_62_ *= 256;
		i_63_ = 256 * i_63_;
		i_64_ *= 256;
		bi var_bi = new bi(i_66_, wd.z, wd.z, i_61_, i_62_, i_67_,
				   i_69_ + pm.currentTimedTicks, pm.currentTimedTicks + i_70_, i_71_, i_72_,
				   i_65_, i_68_, bool);
		var_bi.a(i_64_, i_63_, 0, pm.currentTimedTicks + i_69_,
			 Class_u.b(i_63_, wd.z, -20214, i_64_) - i_68_);
		iq.g.b(new ri(var_bi), (byte) 93);
	    }
	} else if (var_fh == gv.e) {
	    int i_73_ = faa.loginStream.readUnsignedNegativeBytePlus128(255);
	    int i_74_ = i_73_ >> 2;
	    int i_75_ = i_73_ & 0x3;
	    int i_76_ = nr.d[i_74_];
	    int i_77_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_78_ = ((0x76 & i_77_) >> 4) + sl.k;
	    int i_79_ = (i_77_ & 0x7) + it.v;
	    int i_80_ = faa.loginStream.readShort(13111);
	    if (i_80_ == 65535)
		i_80_ = -1;
	    wj.a(-1, i_74_, i_80_, i_76_, wd.z, i_79_, i_75_, i_78_);
	} else if (var_fh == im.n) {
	    int i_81_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_82_ = (i_81_ >> 4 & 0x7) + sl.k;
	    int i_83_ = (i_81_ & 0x7) + it.v;
	    int i_84_ = faa.loginStream.readShort(13111);
	    if (i_84_ == 65535)
		i_84_ = -1;
	    int i_85_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_86_ = (0xfe & i_85_) >> 4;
	    int i_87_ = i_85_ & 0x7;
	    int i_88_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_89_ = faa.loginStream.readUnsignedByte(-9268);
	    if (i_82_ >= 0 && i_83_ >= 0 && Class_hc.e > i_82_
		&& bw.v > i_83_) {
		int i_90_ = i_86_ + 1;
		if (((Entity) up.thisPlayer).regionLocalX[0] >= i_82_ - i_90_
		    && ((Entity) up.thisPlayer).regionLocalX[0] <= i_82_ + i_90_
		    && ((Entity) up.thisPlayer).regionLocalY[0] >= i_83_ - i_90_
		    && i_90_ + i_83_ >= ((Entity) up.thisPlayer).regionLocalY[0])
		    wr.a(i_88_, i_84_,
			 i_86_ + (i_82_ << 16) + ((wd.z << 24) + (i_83_ << 8)),
			 i_87_, i_89_, true);
	    }
	} else if (ln.e == var_fh) {
	    int i_91_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_92_ = it.v + (0x7 & i_91_);
	    int i_93_ = BytesParser.thisPlayersRegionY + i_92_;
	    int i_94_ = sl.k + (i_91_ >> 4 & 0x7);
	    int i_95_ = i_94_ + bfa.thisPlayersRegionX;
	    int i_96_ = faa.loginStream.readShort(13111);
	    int i_97_ = faa.loginStream.readShort(13111);
	    int i_98_ = faa.loginStream.readShort(13111);
	    if (jt.a != null) {
		sba var_sba
		    = (sba) jt.a.a(-32748,
				   (long) (i_93_ << 14 | wd.z << 28 | i_95_));
		if (var_sba != null) {
		    for (fn var_fn = (fn) ((sba) var_sba).o.a((int) 121);
			 var_fn != null;
			 var_fn = (fn) ((sba) var_sba).o.b((byte) 72)) {
			if ((i_96_ & 0x7fff) == ((fn) var_fn).o
			    && i_97_ == ((fn) var_fn).n) {
			    var_fn.unlink(-20);
			    ((fn) var_fn).n = i_98_;
			    bn.a(var_fn, wd.z, i_93_, -16777216, i_95_);
			    break;
			}
		    }
		    if (i_94_ >= 0 && i_92_ >= 0 && Class_hc.e > i_94_
			&& i_92_ < bw.v)
			br.a(1736, i_92_, wd.z, i_94_);
		}
	    }
	} else if (var_fh == sca.k) {
	    int i_99_ = faa.loginStream.readShort(13111);
	    int i_100_ = faa.loginStream.readUnsignedByte(-9268);
	    int i_101_ = (0x7 & i_100_) + it.v;
	    int i_102_ = i_101_ + BytesParser.thisPlayersRegionY;
	    int i_103_ = sl.k + ((i_100_ & 0x7d) >> 4);
	    int i_104_ = bfa.thisPlayersRegionX + i_103_;
	    sba var_sba
		= (sba) jt.a.a(-32748,
			       (long) (wd.z << 28 | i_102_ << 14 | i_104_));
	    if (var_sba != null) {
		for (fn var_fn = (fn) ((sba) var_sba).o.a((int) 119);
		     var_fn != null;
		     var_fn = (fn) ((sba) var_sba).o.b((byte) 67)) {
		    if ((0x7fff & i_99_) == ((fn) var_fn).o) {
			var_fn.unlink(-30);
			break;
		    }
		}
		if (((sba) var_sba).o.b(true))
		    var_sba.unlink(-84);
		if (i_103_ >= 0 && i_101_ >= 0 && Class_hc.e > i_103_
		    && i_101_ < bw.v)
		    br.a(1736, i_101_, wd.z, i_103_);
	    }
	} else if (dv.a == var_fh) {
	    int i_105_ = faa.loginStream.readShort(13111);
	    int i_106_ = faa.loginStream.readUnsignedByte(-9268);
	    ul.k.getObjectDef((byte) 47, i_105_).a(-49, i_106_);
	} else if (i > 12) {
	    if (var_fh == cd.m) {
		int i_107_ = faa.loginStream.readUnsignedNegativeBytePlus128(255);
		int i_108_ = i_107_ >> 2;
		int i_109_ = i_107_ & 0x3;
		int i_110_ = nr.d[i_108_];
		int i_111_ = faa.loginStream.readUnsignedNegativeBytePlus128(255);
		int i_112_ = ((0x79 & i_111_) >> 4) + sl.k;
		int i_113_ = it.v + (i_111_ & 0x7);
		if (at.a(vn.J, (byte) -108)
		    || (i_112_ >= 0 && i_113_ >= 0 && i_112_ < Class_hc.e
			&& bw.v > i_113_))
		    lk.a(-1, 0, wd.z, i_109_, i_108_, -1, -1, i_113_, i_112_,
			 i_110_);
	    } else if (var_fh == gl.Q) {
		int i_114_ = faa.loginStream.readUnsignedByte(-9268);
		int i_115_ = sl.k + (0x7 & i_114_ >> 4);
		int i_116_ = it.v + (i_114_ & 0x7);
		int i_117_ = faa.loginStream.readShort(13111);
		int i_118_ = faa.loginStream.readUnsignedByte(-9268);
		int i_119_ = faa.loginStream.readShort(13111);
		int i_120_ = faa.loginStream.readUnsignedByte(-9268);
		if (i_115_ >= 0 && i_116_ >= 0 && Class_hc.e > i_115_
		    && i_116_ < bw.v) {
		    int i_121_ = 512 * i_115_ + 256;
		    int i_122_ = i_116_ * 512 + 256;
		    int i_123_ = wd.z;
		    if (i_123_ < 3 && ItemDef.b(i_116_, i_115_, 5706))
			i_123_++;
		    od var_od
			= new od(i_117_, i_119_, pm.currentTimedTicks, wd.z, i_123_, i_121_,
				 (Class_u.b(i_121_, wd.z, -20214, i_122_)
				  - i_118_),
				 i_122_, i_115_, i_115_, i_116_, i_116_,
				 i_120_);
		    rv.o.b(new ud(var_od), (byte) 93);
		}
	    } else if (os.j == var_fh) {
		int i_124_ = faa.loginStream.readShortSecondByteMinus128((byte) -80);
		int i_125_ = faa.loginStream.readUnsignedNegativeByte((byte) -18);
		int i_126_ = (i_125_ & 0x7) + it.v;
		int i_127_ = i_126_ + BytesParser.thisPlayersRegionY;
		int i_128_ = (i_125_ >> 4 & 0x7) + sl.k;
		int i_129_ = bfa.thisPlayersRegionX + i_128_;
		int i_130_ = faa.loginStream.readShortSecondByteMinus128((byte) -80);
		int i_131_ = faa.loginStream.readShortReversed((byte) 120);
		if (ih.n != i_131_) {
		    boolean bool = (i_128_ >= 0 && i_126_ >= 0
				    && i_128_ < Class_hc.e && i_126_ < bw.v);
		    if (bool || at.a(vn.J, (byte) -86)) {
			bn.a(new fn(i_124_, i_130_), wd.z, i_127_, -16777216,
			     i_129_);
			if (bool)
			    br.a(1736, i_126_, wd.z, i_128_);
		    }
		}
	    } else if (pca.s == var_fh) {
		int i_132_ = faa.loginStream.readUnsignedByte(-9268);
		boolean bool = (i_132_ & 0x80) != 0;
		int i_133_ = (i_132_ >> 3 & 0x7) + sl.k;
		int i_134_ = it.v + (0x7 & i_132_);
		int i_135_ = i_133_ + faa.loginStream.readByte(-20933);
		int i_136_ = i_134_ + faa.loginStream.readByte(-20933);
		int i_137_ = faa.loginStream.readShort2(116);
		int i_138_ = faa.loginStream.readShort(13111);
		int i_139_ = faa.loginStream.readUnsignedByte(-9268) * 4;
		int i_140_ = 4 * faa.loginStream.readUnsignedByte(-9268);
		int i_141_ = faa.loginStream.readShort(13111);
		int i_142_ = faa.loginStream.readShort(13111);
		int i_143_ = faa.loginStream.readUnsignedByte(-9268);
		if (i_143_ == 255)
		    i_143_ = -1;
		int i_144_ = faa.loginStream.readShort(13111);
		if (i_133_ >= 0 && i_134_ >= 0 && Class_hc.e > i_133_
		    && i_134_ < bw.v && i_135_ >= 0 && i_136_ >= 0
		    && i_135_ < Class_hc.e && i_136_ < bw.v
		    && i_138_ != 65535) {
		    i_133_ = i_133_ * 512 + 256;
		    i_144_ <<= 2;
		    i_134_ = 512 * i_134_ + 256;
		    i_135_ = i_135_ * 512 + 256;
		    i_140_ <<= 2;
		    i_139_ <<= 2;
		    i_136_ = i_136_ * 512 + 256;
		    bi var_bi = new bi(i_138_, wd.z, wd.z, i_133_, i_134_,
				       i_139_, pm.currentTimedTicks + i_141_, pm.currentTimedTicks + i_142_,
				       i_143_, i_144_, i_137_, i_140_, bool);
		    var_bi.a(i_136_, i_135_, 0, i_141_ + pm.currentTimedTicks,
			     Class_u.b(i_135_, wd.z, -20214, i_136_) - i_140_);
		    iq.g.b(new ri(var_bi), (byte) 93);
		}
	    } else if (Class_nd.k == var_fh) {
		int i_145_ = faa.loginStream.readUnsignedByteMinus128(-90);
		int i_146_ = i_145_ >> 2;
		int i_147_ = i_145_ & 0x3;
		int i_148_ = nr.d[i_146_];
		int i_149_ = faa.loginStream.readUnsignedByte(-9268);
		int i_150_ = sl.k + ((i_149_ & 0x76) >> 4);
		int i_151_ = (i_149_ & 0x7) + it.v;
		int i_152_ = faa.loginStream.readShort(13111);
		if (at.a(vn.J, (byte) -122)
		    || (i_150_ >= 0 && i_151_ >= 0 && i_150_ < Class_hc.e
			&& i_151_ < bw.v))
		    lk.a(-1, 0, wd.z, i_147_, i_146_, -1, i_152_, i_151_,
			 i_150_, i_148_);
	    } else {
		cea.a("T3 - " + var_fh, -2, null);
		la.logout((byte) -101, false);
	    }
	}
    }
    
    static final void a(int i, boolean bool, String string, int i_153_,
			int i_154_) {
	d++;
	ip.a(i_153_, 339, null, bool, i, false, string);
	if (i_154_ != 1986811992)
	    a((byte) 37);
    }
    
    static final void a(int i) {
	c++;
	if (mg.t != -1 && pi.n != -1) {
	    int i_155_ = gn.I + (aj.d * (rv.A - gn.I) >> 16);
	    aj.d += i_155_;
	    if (aj.d >= 65535) {
		if (gk.b)
		    uaa.d = false;
		else
		    uaa.d = true;
		aj.d = 65535;
		gk.b = true;
	    } else {
		gk.b = false;
		uaa.d = false;
	    }
	    if (i != -1202242076)
		a((int) 79);
	    float f = (float) aj.d / 65535.0F;
	    float[] fs = new float[3];
	    int i_156_ = rn.c * 2;
	    for (int i_157_ = 0; i_157_ < 3; i_157_++) {
		int i_158_ = Class_jc.lb[mg.t][i_156_][i_157_] * 3;
		int i_159_ = 3 * Class_jc.lb[mg.t][i_156_ + 1][i_157_];
		int i_160_ = ((Class_jc.lb[mg.t][i_156_ + 2][i_157_]
			       + Class_jc.lb[mg.t][i_156_ + 2][i_157_]
			       - Class_jc.lb[mg.t][i_156_ + 3][i_157_])
			      * 3);
		int i_161_ = Class_jc.lb[mg.t][i_156_][i_157_];
		int i_162_ = i_159_ - i_158_;
		int i_163_ = i_158_ - (i_159_ * 2 - i_160_);
		int i_164_ = (Class_jc.lb[mg.t][i_156_ + 2][i_157_]
			      + (i_159_ - i_160_) - i_161_);
		fs[i_157_] = (float) i_161_ + f * (f * ((float) i_163_
							+ (float) i_164_ * f)
						   + (float) i_162_);
	    }
	    us.e = (int) fs[1] * -1;
	    dg.gb = (int) fs[0] - bfa.thisPlayersRegionX * 512;
	    ada.N = (int) fs[2] - BytesParser.thisPlayersRegionY * 512;
	    float[] fs_165_ = new float[3];
	    int i_166_ = 2 * Class_kf.I;
	    for (int i_167_ = 0; i_167_ < 3; i_167_++) {
		int i_168_ = Class_jc.lb[pi.n][i_166_][i_167_] * 3;
		int i_169_ = 3 * Class_jc.lb[pi.n][i_166_ + 1][i_167_];
		int i_170_ = 3 * (Class_jc.lb[pi.n][i_166_ + 2][i_167_]
				  - (Class_jc.lb[pi.n][i_166_ + 3][i_167_]
				     - Class_jc.lb[pi.n][i_166_ + 2][i_167_]));
		int i_171_ = Class_jc.lb[pi.n][i_166_][i_167_];
		int i_172_ = i_169_ - i_168_;
		int i_173_ = i_168_ - i_169_ * 2 + i_170_;
		int i_174_ = i_169_ + (Class_jc.lb[pi.n][i_166_ + 2][i_167_]
				       - i_170_ - i_171_);
		fs_165_[i_167_]
		    = (f * ((float) i_172_
			    + ((float) i_173_ + f * (float) i_174_) * f)
		       + (float) i_171_);
	    }
	    float f_175_ = fs_165_[0] - fs[0];
	    float f_176_ = (fs_165_[1] - fs[1]) * -1.0F;
	    float f_177_ = fs_165_[2] - fs[2];
	    double d = Math.sqrt((double) (f_175_ * f_175_ + f_177_ * f_177_));
	    mba.e = (int) (Math.atan2((double) f_176_, d)
			   * 2607.5945876176133) & 0x3fff;
	    gn.G = (int) (-Math.atan2((double) f_175_, (double) f_177_)
			  * 2607.5945876176133) & 0x3fff;
	    GPIPlayer.e = (Class_jc.lb[mg.t][i_156_][3]
		    + ((Class_jc.lb[mg.t][i_156_ + 2][3]
			- Class_jc.lb[mg.t][i_156_][3]) * aj.d
		       >> 16));
	}
    }
}
