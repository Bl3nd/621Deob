/* wfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class TransparentSprite extends qp
{
    int[] H;
    
    TransparentSprite(nga var_nga, int[] is, int i, int i_0_) {
	super(var_nga, i, i_0_);
	((TransparentSprite) this).H = is;
    }
    
    final void da(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
	int[] is = ((nga) ((qp) this).b).H;
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    int i_7_ = (i_1_ + i_6_) * ((qp) this).k + i;
	    int i_8_ = (i_5_ + i_6_) * ((nga) ((qp) this).b).C + i_4_;
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++)
		((TransparentSprite) this).H[i_7_ + i_9_] = is[i_8_ + i_9_];
	}
    }
    
    final void a(int i, int i_10_, ua var_ua, int i_11_, int i_12_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	i += ((qp) this).E;
	i_10_ += ((qp) this).f;
	int i_13_ = 0;
	int i_14_ = ((nga) ((qp) this).b).C;
	int i_15_ = ((qp) this).k;
	int i_16_ = ((qp) this).o;
	int i_17_ = i_14_ - i_15_;
	int i_18_ = 0;
	int i_19_ = i + i_10_ * i_14_;
	if (i_10_ < ((nga) ((qp) this).b).u) {
	    int i_20_ = ((nga) ((qp) this).b).u - i_10_;
	    i_16_ -= i_20_;
	    i_10_ = ((nga) ((qp) this).b).u;
	    i_13_ += i_20_ * i_15_;
	    i_19_ += i_20_ * i_14_;
	}
	if (i_10_ + i_16_ > ((nga) ((qp) this).b).cb)
	    i_16_ -= i_10_ + i_16_ - ((nga) ((qp) this).b).cb;
	if (i < ((nga) ((qp) this).b).Y) {
	    int i_21_ = ((nga) ((qp) this).b).Y - i;
	    i_15_ -= i_21_;
	    i = ((nga) ((qp) this).b).Y;
	    i_13_ += i_21_;
	    i_19_ += i_21_;
	    i_18_ += i_21_;
	    i_17_ += i_21_;
	}
	if (i + i_15_ > ((nga) ((qp) this).b).B) {
	    int i_22_ = i + i_15_ - ((nga) ((qp) this).b).B;
	    i_15_ -= i_22_;
	    i_18_ += i_22_;
	    i_17_ += i_22_;
	}
	if (i_15_ > 0 && i_16_ > 0) {
	    nu var_nu = (nu) var_ua;
	    int[] is = ((nu) var_nu).g;
	    int[] is_23_ = ((nu) var_nu).k;
	    int[] is_24_ = ((nga) ((qp) this).b).H;
	    int i_25_ = i_10_;
	    if (i_12_ > i_25_) {
		i_25_ = i_12_;
		i_19_ += (i_12_ - i_10_) * i_14_;
		i_13_ += (i_12_ - i_10_) * ((qp) this).k;
	    }
	    int i_26_ = (i_12_ + is.length < i_10_ + i_16_ ? i_12_ + is.length
			 : i_10_ + i_16_);
	    for (int i_27_ = i_25_; i_27_ < i_26_; i_27_++) {
		int i_28_ = is[i_27_ - i_12_] + i_11_;
		int i_29_ = is_23_[i_27_ - i_12_];
		int i_30_ = i_15_;
		if (i > i_28_) {
		    int i_31_ = i - i_28_;
		    if (i_31_ >= i_29_) {
			i_13_ += i_15_ + i_18_;
			i_19_ += i_15_ + i_17_;
			continue;
		    }
		    i_29_ -= i_31_;
		} else {
		    int i_32_ = i_28_ - i;
		    if (i_32_ >= i_15_) {
			i_13_ += i_15_ + i_18_;
			i_19_ += i_15_ + i_17_;
			continue;
		    }
		    i_13_ += i_32_;
		    i_30_ -= i_32_;
		    i_19_ += i_32_;
		}
		int i_33_ = 0;
		if (i_30_ < i_29_)
		    i_29_ = i_30_;
		else
		    i_33_ = i_30_ - i_29_;
		for (int i_34_ = -i_29_; i_34_ < 0; i_34_++) {
		    int i_35_ = ((TransparentSprite) this).H[i_13_++];
		    if (i_35_ != 0)
			is_24_[i_19_++] = i_35_;
		    else
			i_19_++;
		}
		i_13_ += i_33_ + i_18_;
		i_19_ += i_33_ + i_17_;
	    }
	}
    }
    
    final void a(int[] is, int[] is_36_, int i, int i_37_) {
	int[] is_38_ = ((nga) ((qp) this).b).H;
	if (qp.h == 0) {
	    if (qp.n == 0) {
		int i_39_ = qp.F;
		while (i_39_ < 0) {
		    int i_40_ = i_39_ + i_37_;
		    if (i_40_ >= 0) {
			if (i_40_ >= is.length)
			    break;
			int i_41_ = qp.v;
			int i_42_ = qp.B;
			int i_43_ = qp.z;
			int i_44_ = qp.y;
			if (i_42_ >= 0 && i_43_ >= 0
			    && i_42_ - (((qp) this).k << 12) < 0
			    && i_43_ - (((qp) this).o << 12) < 0) {
			    int i_45_ = is[i_40_] - i;
			    int i_46_ = -is_36_[i_40_];
			    int i_47_ = i_45_ - (i_41_ - qp.v);
			    if (i_47_ > 0) {
				i_41_ += i_47_;
				i_44_ += i_47_;
				i_42_ += qp.h * i_47_;
				i_43_ += qp.n * i_47_;
			    } else
				i_46_ -= i_47_;
			    if (i_44_ < i_46_)
				i_44_ = i_46_;
			    for (/**/; i_44_ < 0; i_44_++) {
				int i_48_ = (((TransparentSprite) this).H
					     [((i_43_ >> 12) * ((qp) this).k
					       + (i_42_ >> 12))]);
				if (i_48_ != 0)
				    is_38_[i_41_++] = i_48_;
				else
				    i_41_++;
			    }
			}
		    }
		    i_39_++;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_49_ = qp.F;
		while (i_49_ < 0) {
		    int i_50_ = i_49_ + i_37_;
		    if (i_50_ >= 0) {
			if (i_50_ >= is.length)
			    break;
			int i_51_ = qp.v;
			int i_52_ = qp.B;
			int i_53_ = qp.z + qp.c;
			int i_54_ = qp.y;
			if (i_52_ >= 0 && i_52_ - (((qp) this).k << 12) < 0) {
			    int i_55_;
			    if ((i_55_ = i_53_ - (((qp) this).o << 12)) >= 0) {
				i_55_ = (qp.n - i_55_) / qp.n;
				i_54_ += i_55_;
				i_53_ += qp.n * i_55_;
				i_51_ += i_55_;
			    }
			    if ((i_55_ = (i_53_ - qp.n) / qp.n) > i_54_)
				i_54_ = i_55_;
			    int i_56_ = is[i_50_] - i;
			    int i_57_ = -is_36_[i_50_];
			    int i_58_ = i_56_ - (i_51_ - qp.v);
			    if (i_58_ > 0) {
				i_51_ += i_58_;
				i_54_ += i_58_;
				i_52_ += qp.h * i_58_;
				i_53_ += qp.n * i_58_;
			    } else
				i_57_ -= i_58_;
			    if (i_54_ < i_57_)
				i_54_ = i_57_;
			    for (/**/; i_54_ < 0; i_54_++) {
				int i_59_ = (((TransparentSprite) this).H
					     [((i_53_ >> 12) * ((qp) this).k
					       + (i_52_ >> 12))]);
				if (i_59_ != 0)
				    is_38_[i_51_++] = i_59_;
				else
				    i_51_++;
				i_53_ += qp.n;
			    }
			}
		    }
		    i_49_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    } else {
		int i_60_ = qp.F;
		while (i_60_ < 0) {
		    int i_61_ = i_60_ + i_37_;
		    if (i_61_ >= 0) {
			if (i_61_ >= is.length)
			    break;
			int i_62_ = qp.v;
			int i_63_ = qp.B;
			int i_64_ = qp.z + qp.c;
			int i_65_ = qp.y;
			if (i_63_ >= 0 && i_63_ - (((qp) this).k << 12) < 0) {
			    if (i_64_ < 0) {
				int i_66_ = (qp.n - 1 - i_64_) / qp.n;
				i_65_ += i_66_;
				i_64_ += qp.n * i_66_;
				i_62_ += i_66_;
			    }
			    int i_67_;
			    if ((i_67_ = (i_64_ + 1 - (((qp) this).o << 12)
					  - qp.n) / qp.n)
				> i_65_)
				i_65_ = i_67_;
			    int i_68_ = is[i_61_] - i;
			    int i_69_ = -is_36_[i_61_];
			    int i_70_ = i_68_ - (i_62_ - qp.v);
			    if (i_70_ > 0) {
				i_62_ += i_70_;
				i_65_ += i_70_;
				i_63_ += qp.h * i_70_;
				i_64_ += qp.n * i_70_;
			    } else
				i_69_ -= i_70_;
			    if (i_65_ < i_69_)
				i_65_ = i_69_;
			    for (/**/; i_65_ < 0; i_65_++) {
				int i_71_ = (((TransparentSprite) this).H
					     [((i_64_ >> 12) * ((qp) this).k
					       + (i_63_ >> 12))]);
				if (i_71_ != 0)
				    is_38_[i_62_++] = i_71_;
				else
				    i_62_++;
				i_64_ += qp.n;
			    }
			}
		    }
		    i_60_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.h < 0) {
	    if (qp.n == 0) {
		int i_72_ = qp.F;
		while (i_72_ < 0) {
		    int i_73_ = i_72_ + i_37_;
		    if (i_73_ >= 0) {
			if (i_73_ >= is.length)
			    break;
			int i_74_ = qp.v;
			int i_75_ = qp.B + qp.a;
			int i_76_ = qp.z;
			int i_77_ = qp.y;
			if (i_76_ >= 0 && i_76_ - (((qp) this).o << 12) < 0) {
			    int i_78_;
			    if ((i_78_ = i_75_ - (((qp) this).k << 12)) >= 0) {
				i_78_ = (qp.h - i_78_) / qp.h;
				i_77_ += i_78_;
				i_75_ += qp.h * i_78_;
				i_74_ += i_78_;
			    }
			    if ((i_78_ = (i_75_ - qp.h) / qp.h) > i_77_)
				i_77_ = i_78_;
			    int i_79_ = is[i_73_] - i;
			    int i_80_ = -is_36_[i_73_];
			    int i_81_ = i_79_ - (i_74_ - qp.v);
			    if (i_81_ > 0) {
				i_74_ += i_81_;
				i_77_ += i_81_;
				i_75_ += qp.h * i_81_;
				i_76_ += qp.n * i_81_;
			    } else
				i_80_ -= i_81_;
			    if (i_77_ < i_80_)
				i_77_ = i_80_;
			    for (/**/; i_77_ < 0; i_77_++) {
				int i_82_ = (((TransparentSprite) this).H
					     [((i_76_ >> 12) * ((qp) this).k
					       + (i_75_ >> 12))]);
				if (i_82_ != 0)
				    is_38_[i_74_++] = i_82_;
				else
				    i_74_++;
				i_75_ += qp.h;
			    }
			}
		    }
		    i_72_++;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_83_ = qp.F;
		while (i_83_ < 0) {
		    int i_84_ = i_83_ + i_37_;
		    if (i_84_ >= 0) {
			if (i_84_ >= is.length)
			    break;
			int i_85_ = qp.v;
			int i_86_ = qp.B + qp.a;
			int i_87_ = qp.z + qp.c;
			int i_88_ = qp.y;
			int i_89_;
			if ((i_89_ = i_86_ - (((qp) this).k << 12)) >= 0) {
			    i_89_ = (qp.h - i_89_) / qp.h;
			    i_88_ += i_89_;
			    i_86_ += qp.h * i_89_;
			    i_87_ += qp.n * i_89_;
			    i_85_ += i_89_;
			}
			if ((i_89_ = (i_86_ - qp.h) / qp.h) > i_88_)
			    i_88_ = i_89_;
			if ((i_89_ = i_87_ - (((qp) this).o << 12)) >= 0) {
			    i_89_ = (qp.n - i_89_) / qp.n;
			    i_88_ += i_89_;
			    i_86_ += qp.h * i_89_;
			    i_87_ += qp.n * i_89_;
			    i_85_ += i_89_;
			}
			if ((i_89_ = (i_87_ - qp.n) / qp.n) > i_88_)
			    i_88_ = i_89_;
			int i_90_ = is[i_84_] - i;
			int i_91_ = -is_36_[i_84_];
			int i_92_ = i_90_ - (i_85_ - qp.v);
			if (i_92_ > 0) {
			    i_85_ += i_92_;
			    i_88_ += i_92_;
			    i_86_ += qp.h * i_92_;
			    i_87_ += qp.n * i_92_;
			} else
			    i_91_ -= i_92_;
			if (i_88_ < i_91_)
			    i_88_ = i_91_;
			for (/**/; i_88_ < 0; i_88_++) {
			    int i_93_
				= (((TransparentSprite) this).H
				   [(i_87_ >> 12) * ((qp) this).k + (i_86_
								     >> 12)]);
			    if (i_93_ != 0)
				is_38_[i_85_++] = i_93_;
			    else
				i_85_++;
			    i_86_ += qp.h;
			    i_87_ += qp.n;
			}
		    }
		    i_83_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else {
		int i_94_ = qp.F;
		while (i_94_ < 0) {
		    int i_95_ = i_94_ + i_37_;
		    if (i_95_ >= 0) {
			if (i_95_ >= is.length)
			    break;
			int i_96_ = qp.v;
			int i_97_ = qp.B + qp.a;
			int i_98_ = qp.z + qp.c;
			int i_99_ = qp.y;
			int i_100_;
			if ((i_100_ = i_97_ - (((qp) this).k << 12)) >= 0) {
			    i_100_ = (qp.h - i_100_) / qp.h;
			    i_99_ += i_100_;
			    i_97_ += qp.h * i_100_;
			    i_98_ += qp.n * i_100_;
			    i_96_ += i_100_;
			}
			if ((i_100_ = (i_97_ - qp.h) / qp.h) > i_99_)
			    i_99_ = i_100_;
			if (i_98_ < 0) {
			    i_100_ = (qp.n - 1 - i_98_) / qp.n;
			    i_99_ += i_100_;
			    i_97_ += qp.h * i_100_;
			    i_98_ += qp.n * i_100_;
			    i_96_ += i_100_;
			}
			if ((i_100_ = (i_98_ + 1 - (((qp) this).o << 12)
				       - qp.n) / qp.n)
			    > i_99_)
			    i_99_ = i_100_;
			int i_101_ = is[i_95_] - i;
			int i_102_ = -is_36_[i_95_];
			int i_103_ = i_101_ - (i_96_ - qp.v);
			if (i_103_ > 0) {
			    i_96_ += i_103_;
			    i_99_ += i_103_;
			    i_97_ += qp.h * i_103_;
			    i_98_ += qp.n * i_103_;
			} else
			    i_102_ -= i_103_;
			if (i_99_ < i_102_)
			    i_99_ = i_102_;
			for (/**/; i_99_ < 0; i_99_++) {
			    int i_104_
				= (((TransparentSprite) this).H
				   [(i_98_ >> 12) * ((qp) this).k + (i_97_
								     >> 12)]);
			    if (i_104_ != 0)
				is_38_[i_96_++] = i_104_;
			    else
				i_96_++;
			    i_97_ += qp.h;
			    i_98_ += qp.n;
			}
		    }
		    i_94_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.n == 0) {
	    int i_105_ = qp.F;
	    while (i_105_ < 0) {
		int i_106_ = i_105_ + i_37_;
		if (i_106_ >= 0) {
		    if (i_106_ >= is.length)
			break;
		    int i_107_ = qp.v;
		    int i_108_ = qp.B + qp.a;
		    int i_109_ = qp.z;
		    int i_110_ = qp.y;
		    if (i_109_ >= 0 && i_109_ - (((qp) this).o << 12) < 0) {
			if (i_108_ < 0) {
			    int i_111_ = (qp.h - 1 - i_108_) / qp.h;
			    i_110_ += i_111_;
			    i_108_ += qp.h * i_111_;
			    i_107_ += i_111_;
			}
			int i_112_;
			if ((i_112_ = (i_108_ + 1 - (((qp) this).k << 12)
				       - qp.h) / qp.h)
			    > i_110_)
			    i_110_ = i_112_;
			int i_113_ = is[i_106_] - i;
			int i_114_ = -is_36_[i_106_];
			int i_115_ = i_113_ - (i_107_ - qp.v);
			if (i_115_ > 0) {
			    i_107_ += i_115_;
			    i_110_ += i_115_;
			    i_108_ += qp.h * i_115_;
			    i_109_ += qp.n * i_115_;
			} else
			    i_114_ -= i_115_;
			if (i_110_ < i_114_)
			    i_110_ = i_114_;
			for (/**/; i_110_ < 0; i_110_++) {
			    int i_116_
				= (((TransparentSprite) this).H
				   [(i_109_ >> 12) * ((qp) this).k + (i_108_
								      >> 12)]);
			    if (i_116_ != 0)
				is_38_[i_107_++] = i_116_;
			    else
				i_107_++;
			    i_108_ += qp.h;
			}
		    }
		}
		i_105_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else if (qp.n < 0) {
	    int i_117_ = qp.F;
	    while (i_117_ < 0) {
		int i_118_ = i_117_ + i_37_;
		if (i_118_ >= 0) {
		    if (i_118_ >= is.length)
			break;
		    int i_119_ = qp.v;
		    int i_120_ = qp.B + qp.a;
		    int i_121_ = qp.z + qp.c;
		    int i_122_ = qp.y;
		    if (i_120_ < 0) {
			int i_123_ = (qp.h - 1 - i_120_) / qp.h;
			i_122_ += i_123_;
			i_120_ += qp.h * i_123_;
			i_121_ += qp.n * i_123_;
			i_119_ += i_123_;
		    }
		    int i_124_;
		    if ((i_124_
			 = (i_120_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
			> i_122_)
			i_122_ = i_124_;
		    if ((i_124_ = i_121_ - (((qp) this).o << 12)) >= 0) {
			i_124_ = (qp.n - i_124_) / qp.n;
			i_122_ += i_124_;
			i_120_ += qp.h * i_124_;
			i_121_ += qp.n * i_124_;
			i_119_ += i_124_;
		    }
		    if ((i_124_ = (i_121_ - qp.n) / qp.n) > i_122_)
			i_122_ = i_124_;
		    int i_125_ = is[i_118_] - i;
		    int i_126_ = -is_36_[i_118_];
		    int i_127_ = i_125_ - (i_119_ - qp.v);
		    if (i_127_ > 0) {
			i_119_ += i_127_;
			i_122_ += i_127_;
			i_120_ += qp.h * i_127_;
			i_121_ += qp.n * i_127_;
		    } else
			i_126_ -= i_127_;
		    if (i_122_ < i_126_)
			i_122_ = i_126_;
		    for (/**/; i_122_ < 0; i_122_++) {
			int i_128_
			    = (((TransparentSprite) this).H
			       [(i_121_ >> 12) * ((qp) this).k + (i_120_
								  >> 12)]);
			if (i_128_ != 0)
			    is_38_[i_119_++] = i_128_;
			else
			    i_119_++;
			i_120_ += qp.h;
			i_121_ += qp.n;
		    }
		}
		i_117_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else {
	    int i_129_ = qp.F;
	    while (i_129_ < 0) {
		int i_130_ = i_129_ + i_37_;
		if (i_130_ >= 0) {
		    if (i_130_ >= is.length)
			break;
		    int i_131_ = qp.v;
		    int i_132_ = qp.B + qp.a;
		    int i_133_ = qp.z + qp.c;
		    int i_134_ = qp.y;
		    if (i_132_ < 0) {
			int i_135_ = (qp.h - 1 - i_132_) / qp.h;
			i_134_ += i_135_;
			i_132_ += qp.h * i_135_;
			i_133_ += qp.n * i_135_;
			i_131_ += i_135_;
		    }
		    int i_136_;
		    if ((i_136_
			 = (i_132_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
			> i_134_)
			i_134_ = i_136_;
		    if (i_133_ < 0) {
			i_136_ = (qp.n - 1 - i_133_) / qp.n;
			i_134_ += i_136_;
			i_132_ += qp.h * i_136_;
			i_133_ += qp.n * i_136_;
			i_131_ += i_136_;
		    }
		    if ((i_136_
			 = (i_133_ + 1 - (((qp) this).o << 12) - qp.n) / qp.n)
			> i_134_)
			i_134_ = i_136_;
		    int i_137_ = is[i_130_] - i;
		    int i_138_ = -is_36_[i_130_];
		    int i_139_ = i_137_ - (i_131_ - qp.v);
		    if (i_139_ > 0) {
			i_131_ += i_139_;
			i_134_ += i_139_;
			i_132_ += qp.h * i_139_;
			i_133_ += qp.n * i_139_;
		    } else
			i_138_ -= i_139_;
		    if (i_134_ < i_138_)
			i_134_ = i_138_;
		    for (/**/; i_134_ < 0; i_134_++) {
			int i_140_
			    = (((TransparentSprite) this).H
			       [(i_133_ >> 12) * ((qp) this).k + (i_132_
								  >> 12)]);
			if (i_140_ != 0)
			    is_38_[i_131_++] = i_140_;
			else
			    i_131_++;
			i_132_ += qp.h;
			i_133_ += qp.n;
		    }
		}
		i_129_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	}
    }
    
    final void V(int i, int i_141_, int i_142_, int i_143_, int i_144_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	int i_145_ = ((nga) ((qp) this).b).C;
	i += ((qp) this).E;
	i_141_ += ((qp) this).f;
	int i_146_ = i_141_ * i_145_ + i;
	int i_147_ = 0;
	int i_148_ = ((qp) this).o;
	int i_149_ = ((qp) this).k;
	int i_150_ = i_145_ - i_149_;
	int i_151_ = 0;
	if (i_141_ < ((nga) ((qp) this).b).u) {
	    int i_152_ = ((nga) ((qp) this).b).u - i_141_;
	    i_148_ -= i_152_;
	    i_141_ = ((nga) ((qp) this).b).u;
	    i_147_ += i_152_ * i_149_;
	    i_146_ += i_152_ * i_145_;
	}
	if (i_141_ + i_148_ > ((nga) ((qp) this).b).cb)
	    i_148_ -= i_141_ + i_148_ - ((nga) ((qp) this).b).cb;
	if (i < ((nga) ((qp) this).b).Y) {
	    int i_153_ = ((nga) ((qp) this).b).Y - i;
	    i_149_ -= i_153_;
	    i = ((nga) ((qp) this).b).Y;
	    i_147_ += i_153_;
	    i_146_ += i_153_;
	    i_151_ += i_153_;
	    i_150_ += i_153_;
	}
	if (i + i_149_ > ((nga) ((qp) this).b).B) {
	    int i_154_ = i + i_149_ - ((nga) ((qp) this).b).B;
	    i_149_ -= i_154_;
	    i_151_ += i_154_;
	    i_150_ += i_154_;
	}
	if (i_149_ > 0 && i_148_ > 0) {
	    int[] is = ((nga) ((qp) this).b).H;
	    if (i_144_ == 0) {
		if (i_142_ == 1) {
		    for (int i_155_ = -i_148_; i_155_ < 0; i_155_++) {
			int i_156_ = i_146_ + i_149_ - 3;
			while (i_146_ < i_156_) {
			    is[i_146_++] = ((TransparentSprite) this).H[i_147_++];
			    is[i_146_++] = ((TransparentSprite) this).H[i_147_++];
			    is[i_146_++] = ((TransparentSprite) this).H[i_147_++];
			    is[i_146_++] = ((TransparentSprite) this).H[i_147_++];
			}
			i_156_ += 3;
			while (i_146_ < i_156_)
			    is[i_146_++] = ((TransparentSprite) this).H[i_147_++];
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 0) {
		    int i_157_ = (i_143_ & 0xff0000) >> 16;
		    int i_158_ = (i_143_ & 0xff00) >> 8;
		    int i_159_ = i_143_ & 0xff;
		    for (int i_160_ = -i_148_; i_160_ < 0; i_160_++) {
			for (int i_161_ = -i_149_; i_161_ < 0; i_161_++) {
			    int i_162_ = ((TransparentSprite) this).H[i_147_++];
			    int i_163_
				= (i_162_ & 0xff0000) * i_157_ & ~0xffffff;
			    int i_164_ = (i_162_ & 0xff00) * i_158_ & 0xff0000;
			    int i_165_ = (i_162_ & 0xff) * i_159_ & 0xff00;
			    is[i_146_++] = (i_163_ | i_164_ | i_165_) >>> 8;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 3) {
		    for (int i_166_ = -i_148_; i_166_ < 0; i_166_++) {
			for (int i_167_ = -i_149_; i_167_ < 0; i_167_++) {
			    int i_168_ = ((TransparentSprite) this).H[i_147_++];
			    int i_169_ = i_168_ + i_143_;
			    int i_170_
				= (i_168_ & 0xff00ff) + (i_143_ & 0xff00ff);
			    int i_171_ = ((i_170_ & 0x1000100)
					  + (i_169_ - i_170_ & 0x10000));
			    is[i_146_++]
				= i_169_ - i_171_ | i_171_ - (i_171_ >>> 8);
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 2) {
		    int i_172_ = i_143_ >>> 24;
		    int i_173_ = 256 - i_172_;
		    int i_174_ = (i_143_ & 0xff00ff) * i_173_ & ~0xff00ff;
		    int i_175_ = (i_143_ & 0xff00) * i_173_ & 0xff0000;
		    i_143_ = (i_174_ | i_175_) >>> 8;
		    for (int i_176_ = -i_148_; i_176_ < 0; i_176_++) {
			for (int i_177_ = -i_149_; i_177_ < 0; i_177_++) {
			    int i_178_ = ((TransparentSprite) this).H[i_147_++];
			    i_174_ = (i_178_ & 0xff00ff) * i_172_ & ~0xff00ff;
			    i_175_ = (i_178_ & 0xff00) * i_172_ & 0xff0000;
			    is[i_146_++] = ((i_174_ | i_175_) >>> 8) + i_143_;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_144_ == 1) {
		if (i_142_ == 1) {
		    for (int i_179_ = -i_148_; i_179_ < 0; i_179_++) {
			int i_180_ = i_146_ + i_149_ - 3;
			while (i_146_ < i_180_) {
			    int i_181_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_181_ != 0)
				is[i_146_++] = i_181_;
			    else
				i_146_++;
			    i_181_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_181_ != 0)
				is[i_146_++] = i_181_;
			    else
				i_146_++;
			    i_181_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_181_ != 0)
				is[i_146_++] = i_181_;
			    else
				i_146_++;
			    i_181_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_181_ != 0)
				is[i_146_++] = i_181_;
			    else
				i_146_++;
			}
			i_180_ += 3;
			while (i_146_ < i_180_) {
			    int i_182_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_182_ != 0)
				is[i_146_++] = i_182_;
			    else
				i_146_++;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 0) {
		    if ((i_143_ & 0xffffff) == 16777215) {
			int i_183_ = i_143_ >>> 24;
			int i_184_ = 256 - i_183_;
			for (int i_185_ = -i_148_; i_185_ < 0; i_185_++) {
			    for (int i_186_ = -i_149_; i_186_ < 0; i_186_++) {
				int i_187_ = ((TransparentSprite) this).H[i_147_++];
				if (i_187_ != 0) {
				    int i_188_ = is[i_146_];
				    is[i_146_++]
					= ((((i_187_ & 0xff00ff) * i_183_
					     + (i_188_ & 0xff00ff) * i_184_)
					    & ~0xff00ff)
					   + (((i_187_ & 0xff00) * i_183_
					       + (i_188_ & 0xff00) * i_184_)
					      & 0xff0000)) >> 8;
				} else
				    i_146_++;
			    }
			    i_146_ += i_150_;
			    i_147_ += i_151_;
			}
		    } else {
			int i_189_ = (i_143_ & 0xff0000) >> 16;
			int i_190_ = (i_143_ & 0xff00) >> 8;
			int i_191_ = i_143_ & 0xff;
			int i_192_ = i_143_ >>> 24;
			int i_193_ = 256 - i_192_;
			for (int i_194_ = -i_148_; i_194_ < 0; i_194_++) {
			    for (int i_195_ = -i_149_; i_195_ < 0; i_195_++) {
				int i_196_ = ((TransparentSprite) this).H[i_147_++];
				if (i_196_ != 0) {
				    if (i_192_ != 255) {
					int i_197_
					    = ((i_196_ & 0xff0000) * i_189_
					       & ~0xffffff);
					int i_198_
					    = ((i_196_ & 0xff00) * i_190_
					       & 0xff0000);
					int i_199_ = ((i_196_ & 0xff) * i_191_
						      & 0xff00);
					i_196_
					    = (i_197_ | i_198_ | i_199_) >>> 8;
					int i_200_ = is[i_146_];
					is[i_146_++]
					    = ((((i_196_ & 0xff00ff) * i_192_
						 + ((i_200_ & 0xff00ff)
						    * i_193_))
						& ~0xff00ff)
					       + (((i_196_ & 0xff00) * i_192_
						   + ((i_200_ & 0xff00)
						      * i_193_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_201_
					    = ((i_196_ & 0xff0000) * i_189_
					       & ~0xffffff);
					int i_202_
					    = ((i_196_ & 0xff00) * i_190_
					       & 0xff0000);
					int i_203_ = ((i_196_ & 0xff) * i_191_
						      & 0xff00);
					is[i_146_++]
					    = (i_201_ | i_202_ | i_203_) >>> 8;
				    }
				} else
				    i_146_++;
			    }
			    i_146_ += i_150_;
			    i_147_ += i_151_;
			}
			return;
		    }
		    return;
		}
		if (i_142_ == 3) {
		    int i_204_ = i_143_ >>> 24;
		    int i_205_ = 256 - i_204_;
		    for (int i_206_ = -i_148_; i_206_ < 0; i_206_++) {
			for (int i_207_ = -i_149_; i_207_ < 0; i_207_++) {
			    int i_208_ = ((TransparentSprite) this).H[i_147_++];
			    int i_209_ = i_208_ + i_143_;
			    int i_210_
				= (i_208_ & 0xff00ff) + (i_143_ & 0xff00ff);
			    int i_211_ = ((i_210_ & 0x1000100)
					  + (i_209_ - i_210_ & 0x10000));
			    i_211_ = i_209_ - i_211_ | i_211_ - (i_211_ >>> 8);
			    if (i_208_ == 0 && i_204_ != 255) {
				i_208_ = i_211_;
				i_211_ = is[i_146_];
				i_211_ = ((((i_208_ & 0xff00ff) * i_204_
					    + (i_211_ & 0xff00ff) * i_205_)
					   & ~0xff00ff)
					  + (((i_208_ & 0xff00) * i_204_
					      + (i_211_ & 0xff00) * i_205_)
					     & 0xff0000)) >> 8;
			    }
			    is[i_146_++] = i_211_;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 2) {
		    int i_212_ = i_143_ >>> 24;
		    int i_213_ = 256 - i_212_;
		    int i_214_ = (i_143_ & 0xff00ff) * i_213_ & ~0xff00ff;
		    int i_215_ = (i_143_ & 0xff00) * i_213_ & 0xff0000;
		    i_143_ = (i_214_ | i_215_) >>> 8;
		    for (int i_216_ = -i_148_; i_216_ < 0; i_216_++) {
			for (int i_217_ = -i_149_; i_217_ < 0; i_217_++) {
			    int i_218_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_218_ != 0) {
				i_214_
				    = (i_218_ & 0xff00ff) * i_212_ & ~0xff00ff;
				i_215_ = (i_218_ & 0xff00) * i_212_ & 0xff0000;
				is[i_146_++]
				    = ((i_214_ | i_215_) >>> 8) + i_143_;
			    } else
				i_146_++;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_144_ == 2) {
		if (i_142_ == 1) {
		    for (int i_219_ = -i_148_; i_219_ < 0; i_219_++) {
			for (int i_220_ = -i_149_; i_220_ < 0; i_220_++) {
			    int i_221_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_221_ != 0) {
				int i_222_ = is[i_146_];
				int i_223_ = i_221_ + i_222_;
				int i_224_ = ((i_221_ & 0xff00ff)
					      + (i_222_ & 0xff00ff));
				i_222_
				    = (i_224_ & 0x1000100) + (i_223_ - i_224_
							      & 0x10000);
				is[i_146_++]
				    = i_223_ - i_222_ | i_222_ - (i_222_
								  >>> 8);
			    } else
				i_146_++;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 0) {
		    int i_225_ = (i_143_ & 0xff0000) >> 16;
		    int i_226_ = (i_143_ & 0xff00) >> 8;
		    int i_227_ = i_143_ & 0xff;
		    for (int i_228_ = -i_148_; i_228_ < 0; i_228_++) {
			for (int i_229_ = -i_149_; i_229_ < 0; i_229_++) {
			    int i_230_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_230_ != 0) {
				int i_231_
				    = (i_230_ & 0xff0000) * i_225_ & ~0xffffff;
				int i_232_
				    = (i_230_ & 0xff00) * i_226_ & 0xff0000;
				int i_233_ = (i_230_ & 0xff) * i_227_ & 0xff00;
				i_230_ = (i_231_ | i_232_ | i_233_) >>> 8;
				int i_234_ = is[i_146_];
				int i_235_ = i_230_ + i_234_;
				int i_236_ = ((i_230_ & 0xff00ff)
					      + (i_234_ & 0xff00ff));
				i_234_
				    = (i_236_ & 0x1000100) + (i_235_ - i_236_
							      & 0x10000);
				is[i_146_++]
				    = i_235_ - i_234_ | i_234_ - (i_234_
								  >>> 8);
			    } else
				i_146_++;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 3) {
		    for (int i_237_ = -i_148_; i_237_ < 0; i_237_++) {
			for (int i_238_ = -i_149_; i_238_ < 0; i_238_++) {
			    int i_239_ = ((TransparentSprite) this).H[i_147_++];
			    int i_240_ = i_239_ + i_143_;
			    int i_241_
				= (i_239_ & 0xff00ff) + (i_143_ & 0xff00ff);
			    int i_242_ = ((i_241_ & 0x1000100)
					  + (i_240_ - i_241_ & 0x10000));
			    i_239_ = i_240_ - i_242_ | i_242_ - (i_242_ >>> 8);
			    i_242_ = is[i_146_];
			    i_240_ = i_239_ + i_242_;
			    i_241_ = (i_239_ & 0xff00ff) + (i_242_ & 0xff00ff);
			    i_242_ = (i_241_ & 0x1000100) + (i_240_ - i_241_
							     & 0x10000);
			    is[i_146_++]
				= i_240_ - i_242_ | i_242_ - (i_242_ >>> 8);
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		if (i_142_ == 2) {
		    int i_243_ = i_143_ >>> 24;
		    int i_244_ = 256 - i_243_;
		    int i_245_ = (i_143_ & 0xff00ff) * i_244_ & ~0xff00ff;
		    int i_246_ = (i_143_ & 0xff00) * i_244_ & 0xff0000;
		    i_143_ = (i_245_ | i_246_) >>> 8;
		    for (int i_247_ = -i_148_; i_247_ < 0; i_247_++) {
			for (int i_248_ = -i_149_; i_248_ < 0; i_248_++) {
			    int i_249_ = ((TransparentSprite) this).H[i_147_++];
			    if (i_249_ != 0) {
				i_245_
				    = (i_249_ & 0xff00ff) * i_243_ & ~0xff00ff;
				i_246_ = (i_249_ & 0xff00) * i_243_ & 0xff0000;
				i_249_ = ((i_245_ | i_246_) >>> 8) + i_143_;
				int i_250_ = is[i_146_];
				int i_251_ = i_249_ + i_250_;
				int i_252_ = ((i_249_ & 0xff00ff)
					      + (i_250_ & 0xff00ff));
				i_250_
				    = (i_252_ & 0x1000100) + (i_251_ - i_252_
							      & 0x10000);
				is[i_146_++]
				    = i_251_ - i_250_ | i_250_ - (i_250_
								  >>> 8);
			    } else
				i_146_++;
			}
			i_146_ += i_150_;
			i_147_ += i_151_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void YA(int i, int i_253_, int i_254_, int i_255_, int i_256_,
		  int i_257_, int i_258_, int i_259_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	if (i_254_ > 0 && i_255_ > 0) {
	    int i_260_ = 0;
	    int i_261_ = 0;
	    int i_262_ = ((nga) ((qp) this).b).C;
	    int i_263_ = ((qp) this).E + ((qp) this).k + ((qp) this).q;
	    int i_264_ = ((qp) this).f + ((qp) this).o + ((qp) this).C;
	    int i_265_ = (i_263_ << 16) / i_254_;
	    int i_266_ = (i_264_ << 16) / i_255_;
	    if (((qp) this).E > 0) {
		int i_267_ = ((((qp) this).E << 16) + i_265_ - 1) / i_265_;
		i += i_267_;
		i_260_ += i_267_ * i_265_ - (((qp) this).E << 16);
	    }
	    if (((qp) this).f > 0) {
		int i_268_ = ((((qp) this).f << 16) + i_266_ - 1) / i_266_;
		i_253_ += i_268_;
		i_261_ += i_268_ * i_266_ - (((qp) this).f << 16);
	    }
	    if (((qp) this).k < i_263_)
		i_254_
		    = ((((qp) this).k << 16) - i_260_ + i_265_ - 1) / i_265_;
	    if (((qp) this).o < i_264_)
		i_255_
		    = ((((qp) this).o << 16) - i_261_ + i_266_ - 1) / i_266_;
	    int i_269_ = i + i_253_ * i_262_;
	    int i_270_ = i_262_ - i_254_;
	    if (i_253_ + i_255_ > ((nga) ((qp) this).b).cb)
		i_255_ -= i_253_ + i_255_ - ((nga) ((qp) this).b).cb;
	    if (i_253_ < ((nga) ((qp) this).b).u) {
		int i_271_ = ((nga) ((qp) this).b).u - i_253_;
		i_255_ -= i_271_;
		i_269_ += i_271_ * i_262_;
		i_261_ += i_266_ * i_271_;
	    }
	    if (i + i_254_ > ((nga) ((qp) this).b).B) {
		int i_272_ = i + i_254_ - ((nga) ((qp) this).b).B;
		i_254_ -= i_272_;
		i_270_ += i_272_;
	    }
	    if (i < ((nga) ((qp) this).b).Y) {
		int i_273_ = ((nga) ((qp) this).b).Y - i;
		i_254_ -= i_273_;
		i_269_ += i_273_;
		i_260_ += i_265_ * i_273_;
		i_270_ += i_273_;
	    }
	    int[] is = ((nga) ((qp) this).b).H;
	    if (i_258_ == 0) {
		if (i_256_ == 1) {
		    int i_274_ = i_260_;
		    for (int i_275_ = -i_255_; i_275_ < 0; i_275_++) {
			int i_276_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_277_ = -i_254_; i_277_ < 0; i_277_++) {
			    is[i_269_++]
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_276_];
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_274_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 0) {
		    int i_278_ = (i_257_ & 0xff0000) >> 16;
		    int i_279_ = (i_257_ & 0xff00) >> 8;
		    int i_280_ = i_257_ & 0xff;
		    int i_281_ = i_260_;
		    for (int i_282_ = -i_255_; i_282_ < 0; i_282_++) {
			int i_283_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_284_ = -i_254_; i_284_ < 0; i_284_++) {
			    int i_285_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_283_];
			    int i_286_
				= (i_285_ & 0xff0000) * i_278_ & ~0xffffff;
			    int i_287_ = (i_285_ & 0xff00) * i_279_ & 0xff0000;
			    int i_288_ = (i_285_ & 0xff) * i_280_ & 0xff00;
			    is[i_269_++] = (i_286_ | i_287_ | i_288_) >>> 8;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_281_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 3) {
		    int i_289_ = i_260_;
		    for (int i_290_ = -i_255_; i_290_ < 0; i_290_++) {
			int i_291_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_292_ = -i_254_; i_292_ < 0; i_292_++) {
			    int i_293_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_291_];
			    int i_294_ = i_293_ + i_257_;
			    int i_295_
				= (i_293_ & 0xff00ff) + (i_257_ & 0xff00ff);
			    int i_296_ = ((i_295_ & 0x1000100)
					  + (i_294_ - i_295_ & 0x10000));
			    is[i_269_++]
				= i_294_ - i_296_ | i_296_ - (i_296_ >>> 8);
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_289_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 2) {
		    int i_297_ = i_257_ >>> 24;
		    int i_298_ = 256 - i_297_;
		    int i_299_ = (i_257_ & 0xff00ff) * i_298_ & ~0xff00ff;
		    int i_300_ = (i_257_ & 0xff00) * i_298_ & 0xff0000;
		    i_257_ = (i_299_ | i_300_) >>> 8;
		    int i_301_ = i_260_;
		    for (int i_302_ = -i_255_; i_302_ < 0; i_302_++) {
			int i_303_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_304_ = -i_254_; i_304_ < 0; i_304_++) {
			    int i_305_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_303_];
			    i_299_ = (i_305_ & 0xff00ff) * i_297_ & ~0xff00ff;
			    i_300_ = (i_305_ & 0xff00) * i_297_ & 0xff0000;
			    is[i_269_++] = ((i_299_ | i_300_) >>> 8) + i_257_;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_301_;
			i_269_ += i_270_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_258_ == 1) {
		if (i_256_ == 1) {
		    int i_306_ = i_260_;
		    for (int i_307_ = -i_255_; i_307_ < 0; i_307_++) {
			int i_308_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_309_ = -i_254_; i_309_ < 0; i_309_++) {
			    int i_310_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_308_];
			    if (i_310_ != 0)
				is[i_269_++] = i_310_;
			    else
				i_269_++;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_306_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 0) {
		    int i_311_ = i_260_;
		    if ((i_257_ & 0xffffff) == 16777215) {
			int i_312_ = i_257_ >>> 24;
			int i_313_ = 256 - i_312_;
			for (int i_314_ = -i_255_; i_314_ < 0; i_314_++) {
			    int i_315_ = (i_261_ >> 16) * ((qp) this).k;
			    for (int i_316_ = -i_254_; i_316_ < 0; i_316_++) {
				int i_317_
				    = ((TransparentSprite) this).H[(i_260_ >> 16) + i_315_];
				if (i_317_ != 0) {
				    int i_318_ = is[i_269_];
				    is[i_269_++]
					= ((((i_317_ & 0xff00ff) * i_312_
					     + (i_318_ & 0xff00ff) * i_313_)
					    & ~0xff00ff)
					   + (((i_317_ & 0xff00) * i_312_
					       + (i_318_ & 0xff00) * i_313_)
					      & 0xff0000)) >> 8;
				} else
				    i_269_++;
				i_260_ += i_265_;
			    }
			    i_261_ += i_266_;
			    i_260_ = i_311_;
			    i_269_ += i_270_;
			}
		    } else {
			int i_319_ = (i_257_ & 0xff0000) >> 16;
			int i_320_ = (i_257_ & 0xff00) >> 8;
			int i_321_ = i_257_ & 0xff;
			int i_322_ = i_257_ >>> 24;
			int i_323_ = 256 - i_322_;
			for (int i_324_ = -i_255_; i_324_ < 0; i_324_++) {
			    int i_325_ = (i_261_ >> 16) * ((qp) this).k;
			    for (int i_326_ = -i_254_; i_326_ < 0; i_326_++) {
				int i_327_
				    = ((TransparentSprite) this).H[(i_260_ >> 16) + i_325_];
				if (i_327_ != 0) {
				    if (i_322_ != 255) {
					int i_328_
					    = ((i_327_ & 0xff0000) * i_319_
					       & ~0xffffff);
					int i_329_
					    = ((i_327_ & 0xff00) * i_320_
					       & 0xff0000);
					int i_330_ = ((i_327_ & 0xff) * i_321_
						      & 0xff00);
					i_327_
					    = (i_328_ | i_329_ | i_330_) >>> 8;
					int i_331_ = is[i_269_];
					is[i_269_++]
					    = ((((i_327_ & 0xff00ff) * i_322_
						 + ((i_331_ & 0xff00ff)
						    * i_323_))
						& ~0xff00ff)
					       + (((i_327_ & 0xff00) * i_322_
						   + ((i_331_ & 0xff00)
						      * i_323_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_332_
					    = ((i_327_ & 0xff0000) * i_319_
					       & ~0xffffff);
					int i_333_
					    = ((i_327_ & 0xff00) * i_320_
					       & 0xff0000);
					int i_334_ = ((i_327_ & 0xff) * i_321_
						      & 0xff00);
					is[i_269_++]
					    = (i_332_ | i_333_ | i_334_) >>> 8;
				    }
				} else
				    i_269_++;
				i_260_ += i_265_;
			    }
			    i_261_ += i_266_;
			    i_260_ = i_311_;
			    i_269_ += i_270_;
			}
			return;
		    }
		    return;
		}
		if (i_256_ == 3) {
		    int i_335_ = i_260_;
		    int i_336_ = i_257_ >>> 24;
		    int i_337_ = 256 - i_336_;
		    for (int i_338_ = -i_255_; i_338_ < 0; i_338_++) {
			int i_339_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_340_ = -i_254_; i_340_ < 0; i_340_++) {
			    int i_341_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_339_];
			    int i_342_ = i_341_ + i_257_;
			    int i_343_
				= (i_341_ & 0xff00ff) + (i_257_ & 0xff00ff);
			    int i_344_ = ((i_343_ & 0x1000100)
					  + (i_342_ - i_343_ & 0x10000));
			    i_344_ = i_342_ - i_344_ | i_344_ - (i_344_ >>> 8);
			    if (i_341_ == 0 && i_336_ != 255) {
				i_341_ = i_344_;
				i_344_ = is[i_269_];
				i_344_ = ((((i_341_ & 0xff00ff) * i_336_
					    + (i_344_ & 0xff00ff) * i_337_)
					   & ~0xff00ff)
					  + (((i_341_ & 0xff00) * i_336_
					      + (i_344_ & 0xff00) * i_337_)
					     & 0xff0000)) >> 8;
			    }
			    is[i_269_++] = i_344_;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_335_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 2) {
		    int i_345_ = i_257_ >>> 24;
		    int i_346_ = 256 - i_345_;
		    int i_347_ = (i_257_ & 0xff00ff) * i_346_ & ~0xff00ff;
		    int i_348_ = (i_257_ & 0xff00) * i_346_ & 0xff0000;
		    i_257_ = (i_347_ | i_348_) >>> 8;
		    int i_349_ = i_260_;
		    for (int i_350_ = -i_255_; i_350_ < 0; i_350_++) {
			int i_351_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_352_ = -i_254_; i_352_ < 0; i_352_++) {
			    int i_353_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_351_];
			    if (i_353_ != 0) {
				i_347_
				    = (i_353_ & 0xff00ff) * i_345_ & ~0xff00ff;
				i_348_ = (i_353_ & 0xff00) * i_345_ & 0xff0000;
				is[i_269_++]
				    = ((i_347_ | i_348_) >>> 8) + i_257_;
			    } else
				i_269_++;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_349_;
			i_269_ += i_270_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_258_ == 2) {
		if (i_256_ == 1) {
		    int i_354_ = i_260_;
		    for (int i_355_ = -i_255_; i_355_ < 0; i_355_++) {
			int i_356_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_357_ = -i_254_; i_357_ < 0; i_357_++) {
			    int i_358_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_356_];
			    if (i_358_ != 0) {
				int i_359_ = is[i_269_];
				int i_360_ = i_358_ + i_359_;
				int i_361_ = ((i_358_ & 0xff00ff)
					      + (i_359_ & 0xff00ff));
				i_359_
				    = (i_361_ & 0x1000100) + (i_360_ - i_361_
							      & 0x10000);
				is[i_269_++]
				    = i_360_ - i_359_ | i_359_ - (i_359_
								  >>> 8);
			    } else
				i_269_++;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_354_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 0) {
		    int i_362_ = i_260_;
		    int i_363_ = (i_257_ & 0xff0000) >> 16;
		    int i_364_ = (i_257_ & 0xff00) >> 8;
		    int i_365_ = i_257_ & 0xff;
		    for (int i_366_ = -i_255_; i_366_ < 0; i_366_++) {
			int i_367_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_368_ = -i_254_; i_368_ < 0; i_368_++) {
			    int i_369_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_367_];
			    if (i_369_ != 0) {
				int i_370_
				    = (i_369_ & 0xff0000) * i_363_ & ~0xffffff;
				int i_371_
				    = (i_369_ & 0xff00) * i_364_ & 0xff0000;
				int i_372_ = (i_369_ & 0xff) * i_365_ & 0xff00;
				i_369_ = (i_370_ | i_371_ | i_372_) >>> 8;
				int i_373_ = is[i_269_];
				int i_374_ = i_369_ + i_373_;
				int i_375_ = ((i_369_ & 0xff00ff)
					      + (i_373_ & 0xff00ff));
				i_373_
				    = (i_375_ & 0x1000100) + (i_374_ - i_375_
							      & 0x10000);
				is[i_269_++]
				    = i_374_ - i_373_ | i_373_ - (i_373_
								  >>> 8);
			    } else
				i_269_++;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_362_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 3) {
		    int i_376_ = i_260_;
		    for (int i_377_ = -i_255_; i_377_ < 0; i_377_++) {
			int i_378_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_379_ = -i_254_; i_379_ < 0; i_379_++) {
			    int i_380_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_378_];
			    int i_381_ = i_380_ + i_257_;
			    int i_382_
				= (i_380_ & 0xff00ff) + (i_257_ & 0xff00ff);
			    int i_383_ = ((i_382_ & 0x1000100)
					  + (i_381_ - i_382_ & 0x10000));
			    i_380_ = i_381_ - i_383_ | i_383_ - (i_383_ >>> 8);
			    i_383_ = is[i_269_];
			    i_381_ = i_380_ + i_383_;
			    i_382_ = (i_380_ & 0xff00ff) + (i_383_ & 0xff00ff);
			    i_383_ = (i_382_ & 0x1000100) + (i_381_ - i_382_
							     & 0x10000);
			    is[i_269_++]
				= i_381_ - i_383_ | i_383_ - (i_383_ >>> 8);
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_376_;
			i_269_ += i_270_;
		    }
		    return;
		}
		if (i_256_ == 2) {
		    int i_384_ = i_257_ >>> 24;
		    int i_385_ = 256 - i_384_;
		    int i_386_ = (i_257_ & 0xff00ff) * i_385_ & ~0xff00ff;
		    int i_387_ = (i_257_ & 0xff00) * i_385_ & 0xff0000;
		    i_257_ = (i_386_ | i_387_) >>> 8;
		    int i_388_ = i_260_;
		    for (int i_389_ = -i_255_; i_389_ < 0; i_389_++) {
			int i_390_ = (i_261_ >> 16) * ((qp) this).k;
			for (int i_391_ = -i_254_; i_391_ < 0; i_391_++) {
			    int i_392_
				= ((TransparentSprite) this).H[(i_260_ >> 16) + i_390_];
			    if (i_392_ != 0) {
				i_386_
				    = (i_392_ & 0xff00ff) * i_384_ & ~0xff00ff;
				i_387_ = (i_392_ & 0xff00) * i_384_ & 0xff0000;
				i_392_ = ((i_386_ | i_387_) >>> 8) + i_257_;
				int i_393_ = is[i_269_];
				int i_394_ = i_392_ + i_393_;
				int i_395_ = ((i_392_ & 0xff00ff)
					      + (i_393_ & 0xff00ff));
				i_393_
				    = (i_395_ & 0x1000100) + (i_394_ - i_395_
							      & 0x10000);
				is[i_269_++]
				    = i_394_ - i_393_ | i_393_ - (i_393_
								  >>> 8);
			    } else
				i_269_++;
			    i_260_ += i_265_;
			}
			i_261_ += i_266_;
			i_260_ = i_388_;
			i_269_ += i_270_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    TransparentSprite(nga var_nga, int i, int i_396_) {
	super(var_nga, i, i_396_);
	((TransparentSprite) this).H = new int[i * i_396_];
    }
    
    final void xa(int i, int i_397_, int i_398_) {
	throw new IllegalStateException
		  ("Can'applet capture alpha into nullLoader java_sprite_24");
    }
    
    TransparentSprite(nga var_nga, int[] is, int i, int i_399_, int i_400_, int i_401_) {
	super(var_nga, i_400_, i_401_);
	((TransparentSprite) this).H = new int[i_400_ * i_401_];
	i_399_ -= ((qp) this).k;
	int i_402_ = 0;
	for (int i_403_ = 0; i_403_ < i_401_; i_403_++) {
	    for (int i_404_ = 0; i_404_ < i_400_; i_404_++) {
		int i_405_ = is[i++];
		if (i_405_ >>> 24 == 255)
		    ((TransparentSprite) this).H[i_402_++]
			= (i_405_ & 0xffffff) == 0 ? -16777215 : i_405_;
		else
		    ((TransparentSprite) this).H[i_402_++] = 0;
	    }
	    i += i_399_;
	}
    }
    
    final void b(int i, int i_406_) {
	int[] is = ((nga) ((qp) this).b).H;
	if (qp.h == 0) {
	    if (qp.n == 0) {
		int i_407_ = qp.F;
		while (i_407_ < 0) {
		    int i_408_ = qp.v;
		    int i_409_ = qp.B;
		    int i_410_ = qp.z;
		    int i_411_ = qp.y;
		    if (i_409_ >= 0 && i_410_ >= 0
			&& i_409_ - (((qp) this).k << 12) < 0
			&& i_410_ - (((qp) this).o << 12) < 0) {
			for (/**/; i_411_ < 0; i_411_++) {
			    int i_412_ = ((i_410_ >> 12) * ((qp) this).k
					  + (i_409_ >> 12));
			    int i_413_ = i_408_++;
			    int[] is_414_ = is;
			    int i_415_ = i;
			    int i_416_ = i_406_;
			    if (i_416_ == 0) {
				if (i_415_ == 1)
				    is_414_[i_413_] = ((TransparentSprite) this).H[i_412_];
				else if (i_415_ == 0) {
				    int i_417_ = ((TransparentSprite) this).H[i_412_++];
				    int i_418_ = ((i_417_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_419_
					= (i_417_ & 0xff00) * qp.g & 0xff0000;
				    int i_420_
					= (i_417_ & 0xff) * qp.A & 0xff00;
				    is_414_[i_413_]
					= (i_418_ | i_419_ | i_420_) >>> 8;
				} else if (i_415_ == 3) {
				    int i_421_ = ((TransparentSprite) this).H[i_412_++];
				    int i_422_ = qp.w;
				    int i_423_ = i_421_ + i_422_;
				    int i_424_ = ((i_421_ & 0xff00ff)
						  + (i_422_ & 0xff00ff));
				    int i_425_
					= ((i_424_ & 0x1000100)
					   + (i_423_ - i_424_ & 0x10000));
				    is_414_[i_413_]
					= i_423_ - i_425_ | i_425_ - (i_425_
								      >>> 8);
				} else if (i_415_ == 2) {
				    int i_426_ = ((TransparentSprite) this).H[i_412_];
				    int i_427_ = ((i_426_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_428_
					= (i_426_ & 0xff00) * qp.D & 0xff0000;
				    is_414_[i_413_]
					= ((i_427_ | i_428_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_416_ == 1) {
				if (i_415_ == 1) {
				    int i_429_ = ((TransparentSprite) this).H[i_412_];
				    if (i_429_ != 0)
					is_414_[i_413_] = i_429_;
				} else if (i_415_ == 0) {
				    int i_430_ = ((TransparentSprite) this).H[i_412_];
				    if (i_430_ != 0) {
					if ((qp.w & 0xffffff) == 16777215) {
					    int i_431_ = qp.w >>> 24;
					    int i_432_ = 256 - i_431_;
					    int i_433_ = is_414_[i_413_];
					    is_414_[i_413_]
						= (((((i_430_ & 0xff00ff)
						      * i_431_)
						     + ((i_433_ & 0xff00ff)
							* i_432_))
						    & ~0xff00ff)
						   + ((((i_430_ & 0xff00)
							* i_431_)
						       + ((i_433_ & 0xff00)
							  * i_432_))
						      & 0xff0000)) >> 8;
					} else if (qp.D != 255) {
					    int i_434_
						= ((i_430_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_435_
						= ((i_430_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_436_
						= ((i_430_ & 0xff) * qp.A
						   & 0xff00);
					    i_430_ = (i_434_ | i_435_
						      | i_436_) >>> 8;
					    int i_437_ = is_414_[i_413_];
					    is_414_[i_413_]
						= ((((i_430_ & 0xff00ff) * qp.D
						     + ((i_437_ & 0xff00ff)
							* qp.s))
						    & ~0xff00ff)
						   + (((i_430_ & 0xff00) * qp.D
						       + ((i_437_ & 0xff00)
							  * qp.s))
						      & 0xff0000)) >> 8;
					} else {
					    int i_438_
						= ((i_430_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_439_
						= ((i_430_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_440_
						= ((i_430_ & 0xff) * qp.A
						   & 0xff00);
					    is_414_[i_413_] = (i_438_ | i_439_
							       | i_440_) >>> 8;
					}
				    }
				} else if (i_415_ == 3) {
				    int i_441_ = ((TransparentSprite) this).H[i_412_];
				    int i_442_ = qp.w;
				    int i_443_ = i_441_ + i_442_;
				    int i_444_ = ((i_441_ & 0xff00ff)
						  + (i_442_ & 0xff00ff));
				    int i_445_
					= ((i_444_ & 0x1000100)
					   + (i_443_ - i_444_ & 0x10000));
				    i_445_
					= i_443_ - i_445_ | i_445_ - (i_445_
								      >>> 8);
				    if (i_441_ == 0 && qp.D != 255) {
					i_441_ = i_445_;
					i_445_ = is_414_[i_413_];
					i_445_
					    = ((((i_441_ & 0xff00ff) * qp.D
						 + (i_445_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_441_ & 0xff00) * qp.D
						   + (i_445_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    }
				    is_414_[i_413_] = i_445_;
				} else if (i_415_ == 2) {
				    int i_446_ = ((TransparentSprite) this).H[i_412_];
				    if (i_446_ != 0) {
					int i_447_
					    = ((i_446_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_448_ = ((i_446_ & 0xff00) * qp.D
						      & 0xff0000);
					is_414_[i_413_++]
					    = ((i_447_ | i_448_) >>> 8) + qp.j;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_416_ == 2) {
				if (i_415_ == 1) {
				    int i_449_ = ((TransparentSprite) this).H[i_412_];
				    if (i_449_ != 0) {
					int i_450_ = is_414_[i_413_];
					int i_451_ = i_449_ + i_450_;
					int i_452_ = ((i_449_ & 0xff00ff)
						      + (i_450_ & 0xff00ff));
					i_450_
					    = ((i_452_ & 0x1000100)
					       + (i_451_ - i_452_ & 0x10000));
					is_414_[i_413_]
					    = (i_451_ - i_450_
					       | i_450_ - (i_450_ >>> 8));
				    }
				} else if (i_415_ == 0) {
				    int i_453_ = ((TransparentSprite) this).H[i_412_];
				    if (i_453_ != 0) {
					int i_454_
					    = ((i_453_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_455_ = ((i_453_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_456_
					    = (i_453_ & 0xff) * qp.A & 0xff00;
					i_453_
					    = (i_454_ | i_455_ | i_456_) >>> 8;
					int i_457_ = is_414_[i_413_];
					int i_458_ = i_453_ + i_457_;
					int i_459_ = ((i_453_ & 0xff00ff)
						      + (i_457_ & 0xff00ff));
					i_457_
					    = ((i_459_ & 0x1000100)
					       + (i_458_ - i_459_ & 0x10000));
					is_414_[i_413_]
					    = (i_458_ - i_457_
					       | i_457_ - (i_457_ >>> 8));
				    }
				} else if (i_415_ == 3) {
				    int i_460_ = ((TransparentSprite) this).H[i_412_];
				    int i_461_ = qp.w;
				    int i_462_ = i_460_ + i_461_;
				    int i_463_ = ((i_460_ & 0xff00ff)
						  + (i_461_ & 0xff00ff));
				    int i_464_
					= ((i_463_ & 0x1000100)
					   + (i_462_ - i_463_ & 0x10000));
				    i_460_
					= i_462_ - i_464_ | i_464_ - (i_464_
								      >>> 8);
				    i_464_ = is_414_[i_413_];
				    i_462_ = i_460_ + i_464_;
				    i_463_
					= (i_460_ & 0xff00ff) + (i_464_
								 & 0xff00ff);
				    i_464_ = ((i_463_ & 0x1000100)
					      + (i_462_ - i_463_ & 0x10000));
				    is_414_[i_413_]
					= i_462_ - i_464_ | i_464_ - (i_464_
								      >>> 8);
				} else if (i_415_ == 2) {
				    int i_465_ = ((TransparentSprite) this).H[i_412_];
				    if (i_465_ != 0) {
					int i_466_
					    = ((i_465_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_467_ = ((i_465_ & 0xff00) * qp.D
						      & 0xff0000);
					i_465_
					    = ((i_466_ | i_467_) >>> 8) + qp.j;
					int i_468_ = is_414_[i_413_];
					int i_469_ = i_465_ + i_468_;
					int i_470_ = ((i_465_ & 0xff00ff)
						      + (i_468_ & 0xff00ff));
					i_468_
					    = ((i_470_ & 0x1000100)
					       + (i_469_ - i_470_ & 0x10000));
					is_414_[i_413_]
					    = (i_469_ - i_468_
					       | i_468_ - (i_468_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			}
		    }
		    i_407_++;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_471_ = qp.F;
		while (i_471_ < 0) {
		    int i_472_ = qp.v;
		    int i_473_ = qp.B;
		    int i_474_ = qp.z + qp.c;
		    int i_475_ = qp.y;
		    if (i_473_ >= 0 && i_473_ - (((qp) this).k << 12) < 0) {
			int i_476_;
			if ((i_476_ = i_474_ - (((qp) this).o << 12)) >= 0) {
			    i_476_ = (qp.n - i_476_) / qp.n;
			    i_475_ += i_476_;
			    i_474_ += qp.n * i_476_;
			    i_472_ += i_476_;
			}
			if ((i_476_ = (i_474_ - qp.n) / qp.n) > i_475_)
			    i_475_ = i_476_;
			for (/**/; i_475_ < 0; i_475_++) {
			    int i_477_ = ((i_474_ >> 12) * ((qp) this).k
					  + (i_473_ >> 12));
			    int i_478_ = i_472_++;
			    int[] is_479_ = is;
			    int i_480_ = i;
			    int i_481_ = i_406_;
			    if (i_481_ == 0) {
				if (i_480_ == 1)
				    is_479_[i_478_] = ((TransparentSprite) this).H[i_477_];
				else if (i_480_ == 0) {
				    int i_482_ = ((TransparentSprite) this).H[i_477_++];
				    int i_483_ = ((i_482_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_484_
					= (i_482_ & 0xff00) * qp.g & 0xff0000;
				    int i_485_
					= (i_482_ & 0xff) * qp.A & 0xff00;
				    is_479_[i_478_]
					= (i_483_ | i_484_ | i_485_) >>> 8;
				} else if (i_480_ == 3) {
				    int i_486_ = ((TransparentSprite) this).H[i_477_++];
				    int i_487_ = qp.w;
				    int i_488_ = i_486_ + i_487_;
				    int i_489_ = ((i_486_ & 0xff00ff)
						  + (i_487_ & 0xff00ff));
				    int i_490_
					= ((i_489_ & 0x1000100)
					   + (i_488_ - i_489_ & 0x10000));
				    is_479_[i_478_]
					= i_488_ - i_490_ | i_490_ - (i_490_
								      >>> 8);
				} else if (i_480_ == 2) {
				    int i_491_ = ((TransparentSprite) this).H[i_477_];
				    int i_492_ = ((i_491_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_493_
					= (i_491_ & 0xff00) * qp.D & 0xff0000;
				    is_479_[i_478_]
					= ((i_492_ | i_493_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_481_ == 1) {
				if (i_480_ == 1) {
				    int i_494_ = ((TransparentSprite) this).H[i_477_];
				    if (i_494_ != 0)
					is_479_[i_478_] = i_494_;
				} else if (i_480_ == 0) {
				    int i_495_ = ((TransparentSprite) this).H[i_477_];
				    if (i_495_ != 0) {
					if ((qp.w & 0xffffff) == 16777215) {
					    int i_496_ = qp.w >>> 24;
					    int i_497_ = 256 - i_496_;
					    int i_498_ = is_479_[i_478_];
					    is_479_[i_478_]
						= (((((i_495_ & 0xff00ff)
						      * i_496_)
						     + ((i_498_ & 0xff00ff)
							* i_497_))
						    & ~0xff00ff)
						   + ((((i_495_ & 0xff00)
							* i_496_)
						       + ((i_498_ & 0xff00)
							  * i_497_))
						      & 0xff0000)) >> 8;
					} else if (qp.D != 255) {
					    int i_499_
						= ((i_495_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_500_
						= ((i_495_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_501_
						= ((i_495_ & 0xff) * qp.A
						   & 0xff00);
					    i_495_ = (i_499_ | i_500_
						      | i_501_) >>> 8;
					    int i_502_ = is_479_[i_478_];
					    is_479_[i_478_]
						= ((((i_495_ & 0xff00ff) * qp.D
						     + ((i_502_ & 0xff00ff)
							* qp.s))
						    & ~0xff00ff)
						   + (((i_495_ & 0xff00) * qp.D
						       + ((i_502_ & 0xff00)
							  * qp.s))
						      & 0xff0000)) >> 8;
					} else {
					    int i_503_
						= ((i_495_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_504_
						= ((i_495_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_505_
						= ((i_495_ & 0xff) * qp.A
						   & 0xff00);
					    is_479_[i_478_] = (i_503_ | i_504_
							       | i_505_) >>> 8;
					}
				    }
				} else if (i_480_ == 3) {
				    int i_506_ = ((TransparentSprite) this).H[i_477_];
				    int i_507_ = qp.w;
				    int i_508_ = i_506_ + i_507_;
				    int i_509_ = ((i_506_ & 0xff00ff)
						  + (i_507_ & 0xff00ff));
				    int i_510_
					= ((i_509_ & 0x1000100)
					   + (i_508_ - i_509_ & 0x10000));
				    i_510_
					= i_508_ - i_510_ | i_510_ - (i_510_
								      >>> 8);
				    if (i_506_ == 0 && qp.D != 255) {
					i_506_ = i_510_;
					i_510_ = is_479_[i_478_];
					i_510_
					    = ((((i_506_ & 0xff00ff) * qp.D
						 + (i_510_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_506_ & 0xff00) * qp.D
						   + (i_510_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    }
				    is_479_[i_478_] = i_510_;
				} else if (i_480_ == 2) {
				    int i_511_ = ((TransparentSprite) this).H[i_477_];
				    if (i_511_ != 0) {
					int i_512_
					    = ((i_511_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_513_ = ((i_511_ & 0xff00) * qp.D
						      & 0xff0000);
					is_479_[i_478_++]
					    = ((i_512_ | i_513_) >>> 8) + qp.j;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_481_ == 2) {
				if (i_480_ == 1) {
				    int i_514_ = ((TransparentSprite) this).H[i_477_];
				    if (i_514_ != 0) {
					int i_515_ = is_479_[i_478_];
					int i_516_ = i_514_ + i_515_;
					int i_517_ = ((i_514_ & 0xff00ff)
						      + (i_515_ & 0xff00ff));
					i_515_
					    = ((i_517_ & 0x1000100)
					       + (i_516_ - i_517_ & 0x10000));
					is_479_[i_478_]
					    = (i_516_ - i_515_
					       | i_515_ - (i_515_ >>> 8));
				    }
				} else if (i_480_ == 0) {
				    int i_518_ = ((TransparentSprite) this).H[i_477_];
				    if (i_518_ != 0) {
					int i_519_
					    = ((i_518_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_520_ = ((i_518_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_521_
					    = (i_518_ & 0xff) * qp.A & 0xff00;
					i_518_
					    = (i_519_ | i_520_ | i_521_) >>> 8;
					int i_522_ = is_479_[i_478_];
					int i_523_ = i_518_ + i_522_;
					int i_524_ = ((i_518_ & 0xff00ff)
						      + (i_522_ & 0xff00ff));
					i_522_
					    = ((i_524_ & 0x1000100)
					       + (i_523_ - i_524_ & 0x10000));
					is_479_[i_478_]
					    = (i_523_ - i_522_
					       | i_522_ - (i_522_ >>> 8));
				    }
				} else if (i_480_ == 3) {
				    int i_525_ = ((TransparentSprite) this).H[i_477_];
				    int i_526_ = qp.w;
				    int i_527_ = i_525_ + i_526_;
				    int i_528_ = ((i_525_ & 0xff00ff)
						  + (i_526_ & 0xff00ff));
				    int i_529_
					= ((i_528_ & 0x1000100)
					   + (i_527_ - i_528_ & 0x10000));
				    i_525_
					= i_527_ - i_529_ | i_529_ - (i_529_
								      >>> 8);
				    i_529_ = is_479_[i_478_];
				    i_527_ = i_525_ + i_529_;
				    i_528_
					= (i_525_ & 0xff00ff) + (i_529_
								 & 0xff00ff);
				    i_529_ = ((i_528_ & 0x1000100)
					      + (i_527_ - i_528_ & 0x10000));
				    is_479_[i_478_]
					= i_527_ - i_529_ | i_529_ - (i_529_
								      >>> 8);
				} else if (i_480_ == 2) {
				    int i_530_ = ((TransparentSprite) this).H[i_477_];
				    if (i_530_ != 0) {
					int i_531_
					    = ((i_530_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_532_ = ((i_530_ & 0xff00) * qp.D
						      & 0xff0000);
					i_530_
					    = ((i_531_ | i_532_) >>> 8) + qp.j;
					int i_533_ = is_479_[i_478_];
					int i_534_ = i_530_ + i_533_;
					int i_535_ = ((i_530_ & 0xff00ff)
						      + (i_533_ & 0xff00ff));
					i_533_
					    = ((i_535_ & 0x1000100)
					       + (i_534_ - i_535_ & 0x10000));
					is_479_[i_478_]
					    = (i_534_ - i_533_
					       | i_533_ - (i_533_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_474_ += qp.n;
			}
		    }
		    i_471_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    } else {
		int i_536_ = qp.F;
		while (i_536_ < 0) {
		    int i_537_ = qp.v;
		    int i_538_ = qp.B;
		    int i_539_ = qp.z + qp.c;
		    int i_540_ = qp.y;
		    if (i_538_ >= 0 && i_538_ - (((qp) this).k << 12) < 0) {
			if (i_539_ < 0) {
			    int i_541_ = (qp.n - 1 - i_539_) / qp.n;
			    i_540_ += i_541_;
			    i_539_ += qp.n * i_541_;
			    i_537_ += i_541_;
			}
			int i_542_;
			if ((i_542_ = (i_539_ + 1 - (((qp) this).o << 12)
				       - qp.n) / qp.n)
			    > i_540_)
			    i_540_ = i_542_;
			for (/**/; i_540_ < 0; i_540_++) {
			    int i_543_ = ((i_539_ >> 12) * ((qp) this).k
					  + (i_538_ >> 12));
			    int i_544_ = i_537_++;
			    int[] is_545_ = is;
			    int i_546_ = i;
			    int i_547_ = i_406_;
			    if (i_547_ == 0) {
				if (i_546_ == 1)
				    is_545_[i_544_] = ((TransparentSprite) this).H[i_543_];
				else if (i_546_ == 0) {
				    int i_548_ = ((TransparentSprite) this).H[i_543_++];
				    int i_549_ = ((i_548_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_550_
					= (i_548_ & 0xff00) * qp.g & 0xff0000;
				    int i_551_
					= (i_548_ & 0xff) * qp.A & 0xff00;
				    is_545_[i_544_]
					= (i_549_ | i_550_ | i_551_) >>> 8;
				} else if (i_546_ == 3) {
				    int i_552_ = ((TransparentSprite) this).H[i_543_++];
				    int i_553_ = qp.w;
				    int i_554_ = i_552_ + i_553_;
				    int i_555_ = ((i_552_ & 0xff00ff)
						  + (i_553_ & 0xff00ff));
				    int i_556_
					= ((i_555_ & 0x1000100)
					   + (i_554_ - i_555_ & 0x10000));
				    is_545_[i_544_]
					= i_554_ - i_556_ | i_556_ - (i_556_
								      >>> 8);
				} else if (i_546_ == 2) {
				    int i_557_ = ((TransparentSprite) this).H[i_543_];
				    int i_558_ = ((i_557_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_559_
					= (i_557_ & 0xff00) * qp.D & 0xff0000;
				    is_545_[i_544_]
					= ((i_558_ | i_559_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_547_ == 1) {
				if (i_546_ == 1) {
				    int i_560_ = ((TransparentSprite) this).H[i_543_];
				    if (i_560_ != 0)
					is_545_[i_544_] = i_560_;
				} else if (i_546_ == 0) {
				    int i_561_ = ((TransparentSprite) this).H[i_543_];
				    if (i_561_ != 0) {
					if ((qp.w & 0xffffff) == 16777215) {
					    int i_562_ = qp.w >>> 24;
					    int i_563_ = 256 - i_562_;
					    int i_564_ = is_545_[i_544_];
					    is_545_[i_544_]
						= (((((i_561_ & 0xff00ff)
						      * i_562_)
						     + ((i_564_ & 0xff00ff)
							* i_563_))
						    & ~0xff00ff)
						   + ((((i_561_ & 0xff00)
							* i_562_)
						       + ((i_564_ & 0xff00)
							  * i_563_))
						      & 0xff0000)) >> 8;
					} else if (qp.D != 255) {
					    int i_565_
						= ((i_561_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_566_
						= ((i_561_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_567_
						= ((i_561_ & 0xff) * qp.A
						   & 0xff00);
					    i_561_ = (i_565_ | i_566_
						      | i_567_) >>> 8;
					    int i_568_ = is_545_[i_544_];
					    is_545_[i_544_]
						= ((((i_561_ & 0xff00ff) * qp.D
						     + ((i_568_ & 0xff00ff)
							* qp.s))
						    & ~0xff00ff)
						   + (((i_561_ & 0xff00) * qp.D
						       + ((i_568_ & 0xff00)
							  * qp.s))
						      & 0xff0000)) >> 8;
					} else {
					    int i_569_
						= ((i_561_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_570_
						= ((i_561_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_571_
						= ((i_561_ & 0xff) * qp.A
						   & 0xff00);
					    is_545_[i_544_] = (i_569_ | i_570_
							       | i_571_) >>> 8;
					}
				    }
				} else if (i_546_ == 3) {
				    int i_572_ = ((TransparentSprite) this).H[i_543_];
				    int i_573_ = qp.w;
				    int i_574_ = i_572_ + i_573_;
				    int i_575_ = ((i_572_ & 0xff00ff)
						  + (i_573_ & 0xff00ff));
				    int i_576_
					= ((i_575_ & 0x1000100)
					   + (i_574_ - i_575_ & 0x10000));
				    i_576_
					= i_574_ - i_576_ | i_576_ - (i_576_
								      >>> 8);
				    if (i_572_ == 0 && qp.D != 255) {
					i_572_ = i_576_;
					i_576_ = is_545_[i_544_];
					i_576_
					    = ((((i_572_ & 0xff00ff) * qp.D
						 + (i_576_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_572_ & 0xff00) * qp.D
						   + (i_576_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    }
				    is_545_[i_544_] = i_576_;
				} else if (i_546_ == 2) {
				    int i_577_ = ((TransparentSprite) this).H[i_543_];
				    if (i_577_ != 0) {
					int i_578_
					    = ((i_577_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_579_ = ((i_577_ & 0xff00) * qp.D
						      & 0xff0000);
					is_545_[i_544_++]
					    = ((i_578_ | i_579_) >>> 8) + qp.j;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_547_ == 2) {
				if (i_546_ == 1) {
				    int i_580_ = ((TransparentSprite) this).H[i_543_];
				    if (i_580_ != 0) {
					int i_581_ = is_545_[i_544_];
					int i_582_ = i_580_ + i_581_;
					int i_583_ = ((i_580_ & 0xff00ff)
						      + (i_581_ & 0xff00ff));
					i_581_
					    = ((i_583_ & 0x1000100)
					       + (i_582_ - i_583_ & 0x10000));
					is_545_[i_544_]
					    = (i_582_ - i_581_
					       | i_581_ - (i_581_ >>> 8));
				    }
				} else if (i_546_ == 0) {
				    int i_584_ = ((TransparentSprite) this).H[i_543_];
				    if (i_584_ != 0) {
					int i_585_
					    = ((i_584_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_586_ = ((i_584_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_587_
					    = (i_584_ & 0xff) * qp.A & 0xff00;
					i_584_
					    = (i_585_ | i_586_ | i_587_) >>> 8;
					int i_588_ = is_545_[i_544_];
					int i_589_ = i_584_ + i_588_;
					int i_590_ = ((i_584_ & 0xff00ff)
						      + (i_588_ & 0xff00ff));
					i_588_
					    = ((i_590_ & 0x1000100)
					       + (i_589_ - i_590_ & 0x10000));
					is_545_[i_544_]
					    = (i_589_ - i_588_
					       | i_588_ - (i_588_ >>> 8));
				    }
				} else if (i_546_ == 3) {
				    int i_591_ = ((TransparentSprite) this).H[i_543_];
				    int i_592_ = qp.w;
				    int i_593_ = i_591_ + i_592_;
				    int i_594_ = ((i_591_ & 0xff00ff)
						  + (i_592_ & 0xff00ff));
				    int i_595_
					= ((i_594_ & 0x1000100)
					   + (i_593_ - i_594_ & 0x10000));
				    i_591_
					= i_593_ - i_595_ | i_595_ - (i_595_
								      >>> 8);
				    i_595_ = is_545_[i_544_];
				    i_593_ = i_591_ + i_595_;
				    i_594_
					= (i_591_ & 0xff00ff) + (i_595_
								 & 0xff00ff);
				    i_595_ = ((i_594_ & 0x1000100)
					      + (i_593_ - i_594_ & 0x10000));
				    is_545_[i_544_]
					= i_593_ - i_595_ | i_595_ - (i_595_
								      >>> 8);
				} else if (i_546_ == 2) {
				    int i_596_ = ((TransparentSprite) this).H[i_543_];
				    if (i_596_ != 0) {
					int i_597_
					    = ((i_596_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_598_ = ((i_596_ & 0xff00) * qp.D
						      & 0xff0000);
					i_596_
					    = ((i_597_ | i_598_) >>> 8) + qp.j;
					int i_599_ = is_545_[i_544_];
					int i_600_ = i_596_ + i_599_;
					int i_601_ = ((i_596_ & 0xff00ff)
						      + (i_599_ & 0xff00ff));
					i_599_
					    = ((i_601_ & 0x1000100)
					       + (i_600_ - i_601_ & 0x10000));
					is_545_[i_544_]
					    = (i_600_ - i_599_
					       | i_599_ - (i_599_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_539_ += qp.n;
			}
		    }
		    i_536_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.h < 0) {
	    if (qp.n == 0) {
		int i_602_ = qp.F;
		while (i_602_ < 0) {
		    int i_603_ = qp.v;
		    int i_604_ = qp.B + qp.a;
		    int i_605_ = qp.z;
		    int i_606_ = qp.y;
		    if (i_605_ >= 0 && i_605_ - (((qp) this).o << 12) < 0) {
			int i_607_;
			if ((i_607_ = i_604_ - (((qp) this).k << 12)) >= 0) {
			    i_607_ = (qp.h - i_607_) / qp.h;
			    i_606_ += i_607_;
			    i_604_ += qp.h * i_607_;
			    i_603_ += i_607_;
			}
			if ((i_607_ = (i_604_ - qp.h) / qp.h) > i_606_)
			    i_606_ = i_607_;
			for (/**/; i_606_ < 0; i_606_++) {
			    int i_608_ = ((i_605_ >> 12) * ((qp) this).k
					  + (i_604_ >> 12));
			    int i_609_ = i_603_++;
			    int[] is_610_ = is;
			    int i_611_ = i;
			    int i_612_ = i_406_;
			    if (i_612_ == 0) {
				if (i_611_ == 1)
				    is_610_[i_609_] = ((TransparentSprite) this).H[i_608_];
				else if (i_611_ == 0) {
				    int i_613_ = ((TransparentSprite) this).H[i_608_++];
				    int i_614_ = ((i_613_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_615_
					= (i_613_ & 0xff00) * qp.g & 0xff0000;
				    int i_616_
					= (i_613_ & 0xff) * qp.A & 0xff00;
				    is_610_[i_609_]
					= (i_614_ | i_615_ | i_616_) >>> 8;
				} else if (i_611_ == 3) {
				    int i_617_ = ((TransparentSprite) this).H[i_608_++];
				    int i_618_ = qp.w;
				    int i_619_ = i_617_ + i_618_;
				    int i_620_ = ((i_617_ & 0xff00ff)
						  + (i_618_ & 0xff00ff));
				    int i_621_
					= ((i_620_ & 0x1000100)
					   + (i_619_ - i_620_ & 0x10000));
				    is_610_[i_609_]
					= i_619_ - i_621_ | i_621_ - (i_621_
								      >>> 8);
				} else if (i_611_ == 2) {
				    int i_622_ = ((TransparentSprite) this).H[i_608_];
				    int i_623_ = ((i_622_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_624_
					= (i_622_ & 0xff00) * qp.D & 0xff0000;
				    is_610_[i_609_]
					= ((i_623_ | i_624_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_612_ == 1) {
				if (i_611_ == 1) {
				    int i_625_ = ((TransparentSprite) this).H[i_608_];
				    if (i_625_ != 0)
					is_610_[i_609_] = i_625_;
				} else if (i_611_ == 0) {
				    int i_626_ = ((TransparentSprite) this).H[i_608_];
				    if (i_626_ != 0) {
					if ((qp.w & 0xffffff) == 16777215) {
					    int i_627_ = qp.w >>> 24;
					    int i_628_ = 256 - i_627_;
					    int i_629_ = is_610_[i_609_];
					    is_610_[i_609_]
						= (((((i_626_ & 0xff00ff)
						      * i_627_)
						     + ((i_629_ & 0xff00ff)
							* i_628_))
						    & ~0xff00ff)
						   + ((((i_626_ & 0xff00)
							* i_627_)
						       + ((i_629_ & 0xff00)
							  * i_628_))
						      & 0xff0000)) >> 8;
					} else if (qp.D != 255) {
					    int i_630_
						= ((i_626_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_631_
						= ((i_626_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_632_
						= ((i_626_ & 0xff) * qp.A
						   & 0xff00);
					    i_626_ = (i_630_ | i_631_
						      | i_632_) >>> 8;
					    int i_633_ = is_610_[i_609_];
					    is_610_[i_609_]
						= ((((i_626_ & 0xff00ff) * qp.D
						     + ((i_633_ & 0xff00ff)
							* qp.s))
						    & ~0xff00ff)
						   + (((i_626_ & 0xff00) * qp.D
						       + ((i_633_ & 0xff00)
							  * qp.s))
						      & 0xff0000)) >> 8;
					} else {
					    int i_634_
						= ((i_626_ & 0xff0000) * qp.l
						   & ~0xffffff);
					    int i_635_
						= ((i_626_ & 0xff00) * qp.g
						   & 0xff0000);
					    int i_636_
						= ((i_626_ & 0xff) * qp.A
						   & 0xff00);
					    is_610_[i_609_] = (i_634_ | i_635_
							       | i_636_) >>> 8;
					}
				    }
				} else if (i_611_ == 3) {
				    int i_637_ = ((TransparentSprite) this).H[i_608_];
				    int i_638_ = qp.w;
				    int i_639_ = i_637_ + i_638_;
				    int i_640_ = ((i_637_ & 0xff00ff)
						  + (i_638_ & 0xff00ff));
				    int i_641_
					= ((i_640_ & 0x1000100)
					   + (i_639_ - i_640_ & 0x10000));
				    i_641_
					= i_639_ - i_641_ | i_641_ - (i_641_
								      >>> 8);
				    if (i_637_ == 0 && qp.D != 255) {
					i_637_ = i_641_;
					i_641_ = is_610_[i_609_];
					i_641_
					    = ((((i_637_ & 0xff00ff) * qp.D
						 + (i_641_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_637_ & 0xff00) * qp.D
						   + (i_641_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    }
				    is_610_[i_609_] = i_641_;
				} else if (i_611_ == 2) {
				    int i_642_ = ((TransparentSprite) this).H[i_608_];
				    if (i_642_ != 0) {
					int i_643_
					    = ((i_642_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_644_ = ((i_642_ & 0xff00) * qp.D
						      & 0xff0000);
					is_610_[i_609_++]
					    = ((i_643_ | i_644_) >>> 8) + qp.j;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_612_ == 2) {
				if (i_611_ == 1) {
				    int i_645_ = ((TransparentSprite) this).H[i_608_];
				    if (i_645_ != 0) {
					int i_646_ = is_610_[i_609_];
					int i_647_ = i_645_ + i_646_;
					int i_648_ = ((i_645_ & 0xff00ff)
						      + (i_646_ & 0xff00ff));
					i_646_
					    = ((i_648_ & 0x1000100)
					       + (i_647_ - i_648_ & 0x10000));
					is_610_[i_609_]
					    = (i_647_ - i_646_
					       | i_646_ - (i_646_ >>> 8));
				    }
				} else if (i_611_ == 0) {
				    int i_649_ = ((TransparentSprite) this).H[i_608_];
				    if (i_649_ != 0) {
					int i_650_
					    = ((i_649_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_651_ = ((i_649_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_652_
					    = (i_649_ & 0xff) * qp.A & 0xff00;
					i_649_
					    = (i_650_ | i_651_ | i_652_) >>> 8;
					int i_653_ = is_610_[i_609_];
					int i_654_ = i_649_ + i_653_;
					int i_655_ = ((i_649_ & 0xff00ff)
						      + (i_653_ & 0xff00ff));
					i_653_
					    = ((i_655_ & 0x1000100)
					       + (i_654_ - i_655_ & 0x10000));
					is_610_[i_609_]
					    = (i_654_ - i_653_
					       | i_653_ - (i_653_ >>> 8));
				    }
				} else if (i_611_ == 3) {
				    int i_656_ = ((TransparentSprite) this).H[i_608_];
				    int i_657_ = qp.w;
				    int i_658_ = i_656_ + i_657_;
				    int i_659_ = ((i_656_ & 0xff00ff)
						  + (i_657_ & 0xff00ff));
				    int i_660_
					= ((i_659_ & 0x1000100)
					   + (i_658_ - i_659_ & 0x10000));
				    i_656_
					= i_658_ - i_660_ | i_660_ - (i_660_
								      >>> 8);
				    i_660_ = is_610_[i_609_];
				    i_658_ = i_656_ + i_660_;
				    i_659_
					= (i_656_ & 0xff00ff) + (i_660_
								 & 0xff00ff);
				    i_660_ = ((i_659_ & 0x1000100)
					      + (i_658_ - i_659_ & 0x10000));
				    is_610_[i_609_]
					= i_658_ - i_660_ | i_660_ - (i_660_
								      >>> 8);
				} else if (i_611_ == 2) {
				    int i_661_ = ((TransparentSprite) this).H[i_608_];
				    if (i_661_ != 0) {
					int i_662_
					    = ((i_661_ & 0xff00ff) * qp.D
					       & ~0xff00ff);
					int i_663_ = ((i_661_ & 0xff00) * qp.D
						      & 0xff0000);
					i_661_
					    = ((i_662_ | i_663_) >>> 8) + qp.j;
					int i_664_ = is_610_[i_609_];
					int i_665_ = i_661_ + i_664_;
					int i_666_ = ((i_661_ & 0xff00ff)
						      + (i_664_ & 0xff00ff));
					i_664_
					    = ((i_666_ & 0x1000100)
					       + (i_665_ - i_666_ & 0x10000));
					is_610_[i_609_]
					    = (i_665_ - i_664_
					       | i_664_ - (i_664_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_604_ += qp.h;
			}
		    }
		    i_602_++;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_667_ = qp.F;
		while (i_667_ < 0) {
		    int i_668_ = qp.v;
		    int i_669_ = qp.B + qp.a;
		    int i_670_ = qp.z + qp.c;
		    int i_671_ = qp.y;
		    int i_672_;
		    if ((i_672_ = i_669_ - (((qp) this).k << 12)) >= 0) {
			i_672_ = (qp.h - i_672_) / qp.h;
			i_671_ += i_672_;
			i_669_ += qp.h * i_672_;
			i_670_ += qp.n * i_672_;
			i_668_ += i_672_;
		    }
		    if ((i_672_ = (i_669_ - qp.h) / qp.h) > i_671_)
			i_671_ = i_672_;
		    if ((i_672_ = i_670_ - (((qp) this).o << 12)) >= 0) {
			i_672_ = (qp.n - i_672_) / qp.n;
			i_671_ += i_672_;
			i_669_ += qp.h * i_672_;
			i_670_ += qp.n * i_672_;
			i_668_ += i_672_;
		    }
		    if ((i_672_ = (i_670_ - qp.n) / qp.n) > i_671_)
			i_671_ = i_672_;
		    for (/**/; i_671_ < 0; i_671_++) {
			int i_673_
			    = (i_670_ >> 12) * ((qp) this).k + (i_669_ >> 12);
			int i_674_ = i_668_++;
			int[] is_675_ = is;
			int i_676_ = i;
			int i_677_ = i_406_;
			if (i_677_ == 0) {
			    if (i_676_ == 1)
				is_675_[i_674_] = ((TransparentSprite) this).H[i_673_];
			    else if (i_676_ == 0) {
				int i_678_ = ((TransparentSprite) this).H[i_673_++];
				int i_679_
				    = (i_678_ & 0xff0000) * qp.l & ~0xffffff;
				int i_680_
				    = (i_678_ & 0xff00) * qp.g & 0xff0000;
				int i_681_ = (i_678_ & 0xff) * qp.A & 0xff00;
				is_675_[i_674_]
				    = (i_679_ | i_680_ | i_681_) >>> 8;
			    } else if (i_676_ == 3) {
				int i_682_ = ((TransparentSprite) this).H[i_673_++];
				int i_683_ = qp.w;
				int i_684_ = i_682_ + i_683_;
				int i_685_ = ((i_682_ & 0xff00ff)
					      + (i_683_ & 0xff00ff));
				int i_686_ = ((i_685_ & 0x1000100)
					      + (i_684_ - i_685_ & 0x10000));
				is_675_[i_674_]
				    = i_684_ - i_686_ | i_686_ - (i_686_
								  >>> 8);
			    } else if (i_676_ == 2) {
				int i_687_ = ((TransparentSprite) this).H[i_673_];
				int i_688_
				    = (i_687_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_689_
				    = (i_687_ & 0xff00) * qp.D & 0xff0000;
				is_675_[i_674_]
				    = ((i_688_ | i_689_) >>> 8) + qp.j;
			    } else
				throw new IllegalArgumentException();
			} else if (i_677_ == 1) {
			    if (i_676_ == 1) {
				int i_690_ = ((TransparentSprite) this).H[i_673_];
				if (i_690_ != 0)
				    is_675_[i_674_] = i_690_;
			    } else if (i_676_ == 0) {
				int i_691_ = ((TransparentSprite) this).H[i_673_];
				if (i_691_ != 0) {
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_692_ = qp.w >>> 24;
					int i_693_ = 256 - i_692_;
					int i_694_ = is_675_[i_674_];
					is_675_[i_674_]
					    = ((((i_691_ & 0xff00ff) * i_692_
						 + ((i_694_ & 0xff00ff)
						    * i_693_))
						& ~0xff00ff)
					       + (((i_691_ & 0xff00) * i_692_
						   + ((i_694_ & 0xff00)
						      * i_693_))
						  & 0xff0000)) >> 8;
				    } else if (qp.D != 255) {
					int i_695_
					    = ((i_691_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_696_ = ((i_691_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_697_
					    = (i_691_ & 0xff) * qp.A & 0xff00;
					i_691_
					    = (i_695_ | i_696_ | i_697_) >>> 8;
					int i_698_ = is_675_[i_674_];
					is_675_[i_674_]
					    = ((((i_691_ & 0xff00ff) * qp.D
						 + (i_698_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_691_ & 0xff00) * qp.D
						   + (i_698_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    } else {
					int i_699_
					    = ((i_691_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_700_ = ((i_691_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_701_
					    = (i_691_ & 0xff) * qp.A & 0xff00;
					is_675_[i_674_]
					    = (i_699_ | i_700_ | i_701_) >>> 8;
				    }
				}
			    } else if (i_676_ == 3) {
				int i_702_ = ((TransparentSprite) this).H[i_673_];
				int i_703_ = qp.w;
				int i_704_ = i_702_ + i_703_;
				int i_705_ = ((i_702_ & 0xff00ff)
					      + (i_703_ & 0xff00ff));
				int i_706_ = ((i_705_ & 0x1000100)
					      + (i_704_ - i_705_ & 0x10000));
				i_706_ = i_704_ - i_706_ | i_706_ - (i_706_
								     >>> 8);
				if (i_702_ == 0 && qp.D != 255) {
				    i_702_ = i_706_;
				    i_706_ = is_675_[i_674_];
				    i_706_ = ((((i_702_ & 0xff00ff) * qp.D
						+ (i_706_ & 0xff00ff) * qp.s)
					       & ~0xff00ff)
					      + (((i_702_ & 0xff00) * qp.D
						  + (i_706_ & 0xff00) * qp.s)
						 & 0xff0000)) >> 8;
				}
				is_675_[i_674_] = i_706_;
			    } else if (i_676_ == 2) {
				int i_707_ = ((TransparentSprite) this).H[i_673_];
				if (i_707_ != 0) {
				    int i_708_ = ((i_707_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_709_
					= (i_707_ & 0xff00) * qp.D & 0xff0000;
				    is_675_[i_674_++]
					= ((i_708_ | i_709_) >>> 8) + qp.j;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_677_ == 2) {
			    if (i_676_ == 1) {
				int i_710_ = ((TransparentSprite) this).H[i_673_];
				if (i_710_ != 0) {
				    int i_711_ = is_675_[i_674_];
				    int i_712_ = i_710_ + i_711_;
				    int i_713_ = ((i_710_ & 0xff00ff)
						  + (i_711_ & 0xff00ff));
				    i_711_ = ((i_713_ & 0x1000100)
					      + (i_712_ - i_713_ & 0x10000));
				    is_675_[i_674_]
					= i_712_ - i_711_ | i_711_ - (i_711_
								      >>> 8);
				}
			    } else if (i_676_ == 0) {
				int i_714_ = ((TransparentSprite) this).H[i_673_];
				if (i_714_ != 0) {
				    int i_715_ = ((i_714_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_716_
					= (i_714_ & 0xff00) * qp.g & 0xff0000;
				    int i_717_
					= (i_714_ & 0xff) * qp.A & 0xff00;
				    i_714_ = (i_715_ | i_716_ | i_717_) >>> 8;
				    int i_718_ = is_675_[i_674_];
				    int i_719_ = i_714_ + i_718_;
				    int i_720_ = ((i_714_ & 0xff00ff)
						  + (i_718_ & 0xff00ff));
				    i_718_ = ((i_720_ & 0x1000100)
					      + (i_719_ - i_720_ & 0x10000));
				    is_675_[i_674_]
					= i_719_ - i_718_ | i_718_ - (i_718_
								      >>> 8);
				}
			    } else if (i_676_ == 3) {
				int i_721_ = ((TransparentSprite) this).H[i_673_];
				int i_722_ = qp.w;
				int i_723_ = i_721_ + i_722_;
				int i_724_ = ((i_721_ & 0xff00ff)
					      + (i_722_ & 0xff00ff));
				int i_725_ = ((i_724_ & 0x1000100)
					      + (i_723_ - i_724_ & 0x10000));
				i_721_ = i_723_ - i_725_ | i_725_ - (i_725_
								     >>> 8);
				i_725_ = is_675_[i_674_];
				i_723_ = i_721_ + i_725_;
				i_724_ = (i_721_ & 0xff00ff) + (i_725_
								& 0xff00ff);
				i_725_
				    = (i_724_ & 0x1000100) + (i_723_ - i_724_
							      & 0x10000);
				is_675_[i_674_]
				    = i_723_ - i_725_ | i_725_ - (i_725_
								  >>> 8);
			    } else if (i_676_ == 2) {
				int i_726_ = ((TransparentSprite) this).H[i_673_];
				if (i_726_ != 0) {
				    int i_727_ = ((i_726_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_728_
					= (i_726_ & 0xff00) * qp.D & 0xff0000;
				    i_726_ = ((i_727_ | i_728_) >>> 8) + qp.j;
				    int i_729_ = is_675_[i_674_];
				    int i_730_ = i_726_ + i_729_;
				    int i_731_ = ((i_726_ & 0xff00ff)
						  + (i_729_ & 0xff00ff));
				    i_729_ = ((i_731_ & 0x1000100)
					      + (i_730_ - i_731_ & 0x10000));
				    is_675_[i_674_]
					= i_730_ - i_729_ | i_729_ - (i_729_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_669_ += qp.h;
			i_670_ += qp.n;
		    }
		    i_667_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else {
		int i_732_ = qp.F;
		while (i_732_ < 0) {
		    int i_733_ = qp.v;
		    int i_734_ = qp.B + qp.a;
		    int i_735_ = qp.z + qp.c;
		    int i_736_ = qp.y;
		    int i_737_;
		    if ((i_737_ = i_734_ - (((qp) this).k << 12)) >= 0) {
			i_737_ = (qp.h - i_737_) / qp.h;
			i_736_ += i_737_;
			i_734_ += qp.h * i_737_;
			i_735_ += qp.n * i_737_;
			i_733_ += i_737_;
		    }
		    if ((i_737_ = (i_734_ - qp.h) / qp.h) > i_736_)
			i_736_ = i_737_;
		    if (i_735_ < 0) {
			i_737_ = (qp.n - 1 - i_735_) / qp.n;
			i_736_ += i_737_;
			i_734_ += qp.h * i_737_;
			i_735_ += qp.n * i_737_;
			i_733_ += i_737_;
		    }
		    if ((i_737_
			 = (i_735_ + 1 - (((qp) this).o << 12) - qp.n) / qp.n)
			> i_736_)
			i_736_ = i_737_;
		    for (/**/; i_736_ < 0; i_736_++) {
			int i_738_
			    = (i_735_ >> 12) * ((qp) this).k + (i_734_ >> 12);
			int i_739_ = i_733_++;
			int[] is_740_ = is;
			int i_741_ = i;
			int i_742_ = i_406_;
			if (i_742_ == 0) {
			    if (i_741_ == 1)
				is_740_[i_739_] = ((TransparentSprite) this).H[i_738_];
			    else if (i_741_ == 0) {
				int i_743_ = ((TransparentSprite) this).H[i_738_++];
				int i_744_
				    = (i_743_ & 0xff0000) * qp.l & ~0xffffff;
				int i_745_
				    = (i_743_ & 0xff00) * qp.g & 0xff0000;
				int i_746_ = (i_743_ & 0xff) * qp.A & 0xff00;
				is_740_[i_739_]
				    = (i_744_ | i_745_ | i_746_) >>> 8;
			    } else if (i_741_ == 3) {
				int i_747_ = ((TransparentSprite) this).H[i_738_++];
				int i_748_ = qp.w;
				int i_749_ = i_747_ + i_748_;
				int i_750_ = ((i_747_ & 0xff00ff)
					      + (i_748_ & 0xff00ff));
				int i_751_ = ((i_750_ & 0x1000100)
					      + (i_749_ - i_750_ & 0x10000));
				is_740_[i_739_]
				    = i_749_ - i_751_ | i_751_ - (i_751_
								  >>> 8);
			    } else if (i_741_ == 2) {
				int i_752_ = ((TransparentSprite) this).H[i_738_];
				int i_753_
				    = (i_752_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_754_
				    = (i_752_ & 0xff00) * qp.D & 0xff0000;
				is_740_[i_739_]
				    = ((i_753_ | i_754_) >>> 8) + qp.j;
			    } else
				throw new IllegalArgumentException();
			} else if (i_742_ == 1) {
			    if (i_741_ == 1) {
				int i_755_ = ((TransparentSprite) this).H[i_738_];
				if (i_755_ != 0)
				    is_740_[i_739_] = i_755_;
			    } else if (i_741_ == 0) {
				int i_756_ = ((TransparentSprite) this).H[i_738_];
				if (i_756_ != 0) {
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_757_ = qp.w >>> 24;
					int i_758_ = 256 - i_757_;
					int i_759_ = is_740_[i_739_];
					is_740_[i_739_]
					    = ((((i_756_ & 0xff00ff) * i_757_
						 + ((i_759_ & 0xff00ff)
						    * i_758_))
						& ~0xff00ff)
					       + (((i_756_ & 0xff00) * i_757_
						   + ((i_759_ & 0xff00)
						      * i_758_))
						  & 0xff0000)) >> 8;
				    } else if (qp.D != 255) {
					int i_760_
					    = ((i_756_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_761_ = ((i_756_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_762_
					    = (i_756_ & 0xff) * qp.A & 0xff00;
					i_756_
					    = (i_760_ | i_761_ | i_762_) >>> 8;
					int i_763_ = is_740_[i_739_];
					is_740_[i_739_]
					    = ((((i_756_ & 0xff00ff) * qp.D
						 + (i_763_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_756_ & 0xff00) * qp.D
						   + (i_763_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    } else {
					int i_764_
					    = ((i_756_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_765_ = ((i_756_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_766_
					    = (i_756_ & 0xff) * qp.A & 0xff00;
					is_740_[i_739_]
					    = (i_764_ | i_765_ | i_766_) >>> 8;
				    }
				}
			    } else if (i_741_ == 3) {
				int i_767_ = ((TransparentSprite) this).H[i_738_];
				int i_768_ = qp.w;
				int i_769_ = i_767_ + i_768_;
				int i_770_ = ((i_767_ & 0xff00ff)
					      + (i_768_ & 0xff00ff));
				int i_771_ = ((i_770_ & 0x1000100)
					      + (i_769_ - i_770_ & 0x10000));
				i_771_ = i_769_ - i_771_ | i_771_ - (i_771_
								     >>> 8);
				if (i_767_ == 0 && qp.D != 255) {
				    i_767_ = i_771_;
				    i_771_ = is_740_[i_739_];
				    i_771_ = ((((i_767_ & 0xff00ff) * qp.D
						+ (i_771_ & 0xff00ff) * qp.s)
					       & ~0xff00ff)
					      + (((i_767_ & 0xff00) * qp.D
						  + (i_771_ & 0xff00) * qp.s)
						 & 0xff0000)) >> 8;
				}
				is_740_[i_739_] = i_771_;
			    } else if (i_741_ == 2) {
				int i_772_ = ((TransparentSprite) this).H[i_738_];
				if (i_772_ != 0) {
				    int i_773_ = ((i_772_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_774_
					= (i_772_ & 0xff00) * qp.D & 0xff0000;
				    is_740_[i_739_++]
					= ((i_773_ | i_774_) >>> 8) + qp.j;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_742_ == 2) {
			    if (i_741_ == 1) {
				int i_775_ = ((TransparentSprite) this).H[i_738_];
				if (i_775_ != 0) {
				    int i_776_ = is_740_[i_739_];
				    int i_777_ = i_775_ + i_776_;
				    int i_778_ = ((i_775_ & 0xff00ff)
						  + (i_776_ & 0xff00ff));
				    i_776_ = ((i_778_ & 0x1000100)
					      + (i_777_ - i_778_ & 0x10000));
				    is_740_[i_739_]
					= i_777_ - i_776_ | i_776_ - (i_776_
								      >>> 8);
				}
			    } else if (i_741_ == 0) {
				int i_779_ = ((TransparentSprite) this).H[i_738_];
				if (i_779_ != 0) {
				    int i_780_ = ((i_779_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_781_
					= (i_779_ & 0xff00) * qp.g & 0xff0000;
				    int i_782_
					= (i_779_ & 0xff) * qp.A & 0xff00;
				    i_779_ = (i_780_ | i_781_ | i_782_) >>> 8;
				    int i_783_ = is_740_[i_739_];
				    int i_784_ = i_779_ + i_783_;
				    int i_785_ = ((i_779_ & 0xff00ff)
						  + (i_783_ & 0xff00ff));
				    i_783_ = ((i_785_ & 0x1000100)
					      + (i_784_ - i_785_ & 0x10000));
				    is_740_[i_739_]
					= i_784_ - i_783_ | i_783_ - (i_783_
								      >>> 8);
				}
			    } else if (i_741_ == 3) {
				int i_786_ = ((TransparentSprite) this).H[i_738_];
				int i_787_ = qp.w;
				int i_788_ = i_786_ + i_787_;
				int i_789_ = ((i_786_ & 0xff00ff)
					      + (i_787_ & 0xff00ff));
				int i_790_ = ((i_789_ & 0x1000100)
					      + (i_788_ - i_789_ & 0x10000));
				i_786_ = i_788_ - i_790_ | i_790_ - (i_790_
								     >>> 8);
				i_790_ = is_740_[i_739_];
				i_788_ = i_786_ + i_790_;
				i_789_ = (i_786_ & 0xff00ff) + (i_790_
								& 0xff00ff);
				i_790_
				    = (i_789_ & 0x1000100) + (i_788_ - i_789_
							      & 0x10000);
				is_740_[i_739_]
				    = i_788_ - i_790_ | i_790_ - (i_790_
								  >>> 8);
			    } else if (i_741_ == 2) {
				int i_791_ = ((TransparentSprite) this).H[i_738_];
				if (i_791_ != 0) {
				    int i_792_ = ((i_791_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_793_
					= (i_791_ & 0xff00) * qp.D & 0xff0000;
				    i_791_ = ((i_792_ | i_793_) >>> 8) + qp.j;
				    int i_794_ = is_740_[i_739_];
				    int i_795_ = i_791_ + i_794_;
				    int i_796_ = ((i_791_ & 0xff00ff)
						  + (i_794_ & 0xff00ff));
				    i_794_ = ((i_796_ & 0x1000100)
					      + (i_795_ - i_796_ & 0x10000));
				    is_740_[i_739_]
					= i_795_ - i_794_ | i_794_ - (i_794_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_734_ += qp.h;
			i_735_ += qp.n;
		    }
		    i_732_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.n == 0) {
	    int i_797_ = qp.F;
	    while (i_797_ < 0) {
		int i_798_ = qp.v;
		int i_799_ = qp.B + qp.a;
		int i_800_ = qp.z;
		int i_801_ = qp.y;
		if (i_800_ >= 0 && i_800_ - (((qp) this).o << 12) < 0) {
		    if (i_799_ < 0) {
			int i_802_ = (qp.h - 1 - i_799_) / qp.h;
			i_801_ += i_802_;
			i_799_ += qp.h * i_802_;
			i_798_ += i_802_;
		    }
		    int i_803_;
		    if ((i_803_
			 = (i_799_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
			> i_801_)
			i_801_ = i_803_;
		    for (/**/; i_801_ < 0; i_801_++) {
			int i_804_
			    = (i_800_ >> 12) * ((qp) this).k + (i_799_ >> 12);
			int i_805_ = i_798_++;
			int[] is_806_ = is;
			int i_807_ = i;
			int i_808_ = i_406_;
			if (i_808_ == 0) {
			    if (i_807_ == 1)
				is_806_[i_805_] = ((TransparentSprite) this).H[i_804_];
			    else if (i_807_ == 0) {
				int i_809_ = ((TransparentSprite) this).H[i_804_++];
				int i_810_
				    = (i_809_ & 0xff0000) * qp.l & ~0xffffff;
				int i_811_
				    = (i_809_ & 0xff00) * qp.g & 0xff0000;
				int i_812_ = (i_809_ & 0xff) * qp.A & 0xff00;
				is_806_[i_805_]
				    = (i_810_ | i_811_ | i_812_) >>> 8;
			    } else if (i_807_ == 3) {
				int i_813_ = ((TransparentSprite) this).H[i_804_++];
				int i_814_ = qp.w;
				int i_815_ = i_813_ + i_814_;
				int i_816_ = ((i_813_ & 0xff00ff)
					      + (i_814_ & 0xff00ff));
				int i_817_ = ((i_816_ & 0x1000100)
					      + (i_815_ - i_816_ & 0x10000));
				is_806_[i_805_]
				    = i_815_ - i_817_ | i_817_ - (i_817_
								  >>> 8);
			    } else if (i_807_ == 2) {
				int i_818_ = ((TransparentSprite) this).H[i_804_];
				int i_819_
				    = (i_818_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_820_
				    = (i_818_ & 0xff00) * qp.D & 0xff0000;
				is_806_[i_805_]
				    = ((i_819_ | i_820_) >>> 8) + qp.j;
			    } else
				throw new IllegalArgumentException();
			} else if (i_808_ == 1) {
			    if (i_807_ == 1) {
				int i_821_ = ((TransparentSprite) this).H[i_804_];
				if (i_821_ != 0)
				    is_806_[i_805_] = i_821_;
			    } else if (i_807_ == 0) {
				int i_822_ = ((TransparentSprite) this).H[i_804_];
				if (i_822_ != 0) {
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_823_ = qp.w >>> 24;
					int i_824_ = 256 - i_823_;
					int i_825_ = is_806_[i_805_];
					is_806_[i_805_]
					    = ((((i_822_ & 0xff00ff) * i_823_
						 + ((i_825_ & 0xff00ff)
						    * i_824_))
						& ~0xff00ff)
					       + (((i_822_ & 0xff00) * i_823_
						   + ((i_825_ & 0xff00)
						      * i_824_))
						  & 0xff0000)) >> 8;
				    } else if (qp.D != 255) {
					int i_826_
					    = ((i_822_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_827_ = ((i_822_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_828_
					    = (i_822_ & 0xff) * qp.A & 0xff00;
					i_822_
					    = (i_826_ | i_827_ | i_828_) >>> 8;
					int i_829_ = is_806_[i_805_];
					is_806_[i_805_]
					    = ((((i_822_ & 0xff00ff) * qp.D
						 + (i_829_ & 0xff00ff) * qp.s)
						& ~0xff00ff)
					       + (((i_822_ & 0xff00) * qp.D
						   + (i_829_ & 0xff00) * qp.s)
						  & 0xff0000)) >> 8;
				    } else {
					int i_830_
					    = ((i_822_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_831_ = ((i_822_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_832_
					    = (i_822_ & 0xff) * qp.A & 0xff00;
					is_806_[i_805_]
					    = (i_830_ | i_831_ | i_832_) >>> 8;
				    }
				}
			    } else if (i_807_ == 3) {
				int i_833_ = ((TransparentSprite) this).H[i_804_];
				int i_834_ = qp.w;
				int i_835_ = i_833_ + i_834_;
				int i_836_ = ((i_833_ & 0xff00ff)
					      + (i_834_ & 0xff00ff));
				int i_837_ = ((i_836_ & 0x1000100)
					      + (i_835_ - i_836_ & 0x10000));
				i_837_ = i_835_ - i_837_ | i_837_ - (i_837_
								     >>> 8);
				if (i_833_ == 0 && qp.D != 255) {
				    i_833_ = i_837_;
				    i_837_ = is_806_[i_805_];
				    i_837_ = ((((i_833_ & 0xff00ff) * qp.D
						+ (i_837_ & 0xff00ff) * qp.s)
					       & ~0xff00ff)
					      + (((i_833_ & 0xff00) * qp.D
						  + (i_837_ & 0xff00) * qp.s)
						 & 0xff0000)) >> 8;
				}
				is_806_[i_805_] = i_837_;
			    } else if (i_807_ == 2) {
				int i_838_ = ((TransparentSprite) this).H[i_804_];
				if (i_838_ != 0) {
				    int i_839_ = ((i_838_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_840_
					= (i_838_ & 0xff00) * qp.D & 0xff0000;
				    is_806_[i_805_++]
					= ((i_839_ | i_840_) >>> 8) + qp.j;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_808_ == 2) {
			    if (i_807_ == 1) {
				int i_841_ = ((TransparentSprite) this).H[i_804_];
				if (i_841_ != 0) {
				    int i_842_ = is_806_[i_805_];
				    int i_843_ = i_841_ + i_842_;
				    int i_844_ = ((i_841_ & 0xff00ff)
						  + (i_842_ & 0xff00ff));
				    i_842_ = ((i_844_ & 0x1000100)
					      + (i_843_ - i_844_ & 0x10000));
				    is_806_[i_805_]
					= i_843_ - i_842_ | i_842_ - (i_842_
								      >>> 8);
				}
			    } else if (i_807_ == 0) {
				int i_845_ = ((TransparentSprite) this).H[i_804_];
				if (i_845_ != 0) {
				    int i_846_ = ((i_845_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_847_
					= (i_845_ & 0xff00) * qp.g & 0xff0000;
				    int i_848_
					= (i_845_ & 0xff) * qp.A & 0xff00;
				    i_845_ = (i_846_ | i_847_ | i_848_) >>> 8;
				    int i_849_ = is_806_[i_805_];
				    int i_850_ = i_845_ + i_849_;
				    int i_851_ = ((i_845_ & 0xff00ff)
						  + (i_849_ & 0xff00ff));
				    i_849_ = ((i_851_ & 0x1000100)
					      + (i_850_ - i_851_ & 0x10000));
				    is_806_[i_805_]
					= i_850_ - i_849_ | i_849_ - (i_849_
								      >>> 8);
				}
			    } else if (i_807_ == 3) {
				int i_852_ = ((TransparentSprite) this).H[i_804_];
				int i_853_ = qp.w;
				int i_854_ = i_852_ + i_853_;
				int i_855_ = ((i_852_ & 0xff00ff)
					      + (i_853_ & 0xff00ff));
				int i_856_ = ((i_855_ & 0x1000100)
					      + (i_854_ - i_855_ & 0x10000));
				i_852_ = i_854_ - i_856_ | i_856_ - (i_856_
								     >>> 8);
				i_856_ = is_806_[i_805_];
				i_854_ = i_852_ + i_856_;
				i_855_ = (i_852_ & 0xff00ff) + (i_856_
								& 0xff00ff);
				i_856_
				    = (i_855_ & 0x1000100) + (i_854_ - i_855_
							      & 0x10000);
				is_806_[i_805_]
				    = i_854_ - i_856_ | i_856_ - (i_856_
								  >>> 8);
			    } else if (i_807_ == 2) {
				int i_857_ = ((TransparentSprite) this).H[i_804_];
				if (i_857_ != 0) {
				    int i_858_ = ((i_857_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_859_
					= (i_857_ & 0xff00) * qp.D & 0xff0000;
				    i_857_ = ((i_858_ | i_859_) >>> 8) + qp.j;
				    int i_860_ = is_806_[i_805_];
				    int i_861_ = i_857_ + i_860_;
				    int i_862_ = ((i_857_ & 0xff00ff)
						  + (i_860_ & 0xff00ff));
				    i_860_ = ((i_862_ & 0x1000100)
					      + (i_861_ - i_862_ & 0x10000));
				    is_806_[i_805_]
					= i_861_ - i_860_ | i_860_ - (i_860_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_799_ += qp.h;
		    }
		}
		i_797_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else if (qp.n < 0) {
	    for (int i_863_ = qp.F; i_863_ < 0; i_863_++) {
		int i_864_ = qp.v;
		int i_865_ = qp.B + qp.a;
		int i_866_ = qp.z + qp.c;
		int i_867_ = qp.y;
		if (i_865_ < 0) {
		    int i_868_ = (qp.h - 1 - i_865_) / qp.h;
		    i_867_ += i_868_;
		    i_865_ += qp.h * i_868_;
		    i_866_ += qp.n * i_868_;
		    i_864_ += i_868_;
		}
		int i_869_;
		if ((i_869_
		     = (i_865_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
		    > i_867_)
		    i_867_ = i_869_;
		if ((i_869_ = i_866_ - (((qp) this).o << 12)) >= 0) {
		    i_869_ = (qp.n - i_869_) / qp.n;
		    i_867_ += i_869_;
		    i_865_ += qp.h * i_869_;
		    i_866_ += qp.n * i_869_;
		    i_864_ += i_869_;
		}
		if ((i_869_ = (i_866_ - qp.n) / qp.n) > i_867_)
		    i_867_ = i_869_;
		for (/**/; i_867_ < 0; i_867_++) {
		    int i_870_
			= (i_866_ >> 12) * ((qp) this).k + (i_865_ >> 12);
		    int i_871_ = i_864_++;
		    int[] is_872_ = is;
		    int i_873_ = i;
		    int i_874_ = i_406_;
		    if (i_874_ == 0) {
			if (i_873_ == 1)
			    is_872_[i_871_] = ((TransparentSprite) this).H[i_870_];
			else if (i_873_ == 0) {
			    int i_875_ = ((TransparentSprite) this).H[i_870_++];
			    int i_876_
				= (i_875_ & 0xff0000) * qp.l & ~0xffffff;
			    int i_877_ = (i_875_ & 0xff00) * qp.g & 0xff0000;
			    int i_878_ = (i_875_ & 0xff) * qp.A & 0xff00;
			    is_872_[i_871_] = (i_876_ | i_877_ | i_878_) >>> 8;
			} else if (i_873_ == 3) {
			    int i_879_ = ((TransparentSprite) this).H[i_870_++];
			    int i_880_ = qp.w;
			    int i_881_ = i_879_ + i_880_;
			    int i_882_
				= (i_879_ & 0xff00ff) + (i_880_ & 0xff00ff);
			    int i_883_ = ((i_882_ & 0x1000100)
					  + (i_881_ - i_882_ & 0x10000));
			    is_872_[i_871_]
				= i_881_ - i_883_ | i_883_ - (i_883_ >>> 8);
			} else if (i_873_ == 2) {
			    int i_884_ = ((TransparentSprite) this).H[i_870_];
			    int i_885_
				= (i_884_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_886_ = (i_884_ & 0xff00) * qp.D & 0xff0000;
			    is_872_[i_871_] = ((i_885_ | i_886_) >>> 8) + qp.j;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_874_ == 1) {
			if (i_873_ == 1) {
			    int i_887_ = ((TransparentSprite) this).H[i_870_];
			    if (i_887_ != 0)
				is_872_[i_871_] = i_887_;
			} else if (i_873_ == 0) {
			    int i_888_ = ((TransparentSprite) this).H[i_870_];
			    if (i_888_ != 0) {
				if ((qp.w & 0xffffff) == 16777215) {
				    int i_889_ = qp.w >>> 24;
				    int i_890_ = 256 - i_889_;
				    int i_891_ = is_872_[i_871_];
				    is_872_[i_871_]
					= ((((i_888_ & 0xff00ff) * i_889_
					     + (i_891_ & 0xff00ff) * i_890_)
					    & ~0xff00ff)
					   + (((i_888_ & 0xff00) * i_889_
					       + (i_891_ & 0xff00) * i_890_)
					      & 0xff0000)) >> 8;
				} else if (qp.D != 255) {
				    int i_892_ = ((i_888_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_893_
					= (i_888_ & 0xff00) * qp.g & 0xff0000;
				    int i_894_
					= (i_888_ & 0xff) * qp.A & 0xff00;
				    i_888_ = (i_892_ | i_893_ | i_894_) >>> 8;
				    int i_895_ = is_872_[i_871_];
				    is_872_[i_871_]
					= ((((i_888_ & 0xff00ff) * qp.D
					     + (i_895_ & 0xff00ff) * qp.s)
					    & ~0xff00ff)
					   + (((i_888_ & 0xff00) * qp.D
					       + (i_895_ & 0xff00) * qp.s)
					      & 0xff0000)) >> 8;
				} else {
				    int i_896_ = ((i_888_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_897_
					= (i_888_ & 0xff00) * qp.g & 0xff0000;
				    int i_898_
					= (i_888_ & 0xff) * qp.A & 0xff00;
				    is_872_[i_871_]
					= (i_896_ | i_897_ | i_898_) >>> 8;
				}
			    }
			} else if (i_873_ == 3) {
			    int i_899_ = ((TransparentSprite) this).H[i_870_];
			    int i_900_ = qp.w;
			    int i_901_ = i_899_ + i_900_;
			    int i_902_
				= (i_899_ & 0xff00ff) + (i_900_ & 0xff00ff);
			    int i_903_ = ((i_902_ & 0x1000100)
					  + (i_901_ - i_902_ & 0x10000));
			    i_903_ = i_901_ - i_903_ | i_903_ - (i_903_ >>> 8);
			    if (i_899_ == 0 && qp.D != 255) {
				i_899_ = i_903_;
				i_903_ = is_872_[i_871_];
				i_903_ = ((((i_899_ & 0xff00ff) * qp.D
					    + (i_903_ & 0xff00ff) * qp.s)
					   & ~0xff00ff)
					  + (((i_899_ & 0xff00) * qp.D
					      + (i_903_ & 0xff00) * qp.s)
					     & 0xff0000)) >> 8;
			    }
			    is_872_[i_871_] = i_903_;
			} else if (i_873_ == 2) {
			    int i_904_ = ((TransparentSprite) this).H[i_870_];
			    if (i_904_ != 0) {
				int i_905_
				    = (i_904_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_906_
				    = (i_904_ & 0xff00) * qp.D & 0xff0000;
				is_872_[i_871_++]
				    = ((i_905_ | i_906_) >>> 8) + qp.j;
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (i_874_ == 2) {
			if (i_873_ == 1) {
			    int i_907_ = ((TransparentSprite) this).H[i_870_];
			    if (i_907_ != 0) {
				int i_908_ = is_872_[i_871_];
				int i_909_ = i_907_ + i_908_;
				int i_910_ = ((i_907_ & 0xff00ff)
					      + (i_908_ & 0xff00ff));
				i_908_
				    = (i_910_ & 0x1000100) + (i_909_ - i_910_
							      & 0x10000);
				is_872_[i_871_]
				    = i_909_ - i_908_ | i_908_ - (i_908_
								  >>> 8);
			    }
			} else if (i_873_ == 0) {
			    int i_911_ = ((TransparentSprite) this).H[i_870_];
			    if (i_911_ != 0) {
				int i_912_
				    = (i_911_ & 0xff0000) * qp.l & ~0xffffff;
				int i_913_
				    = (i_911_ & 0xff00) * qp.g & 0xff0000;
				int i_914_ = (i_911_ & 0xff) * qp.A & 0xff00;
				i_911_ = (i_912_ | i_913_ | i_914_) >>> 8;
				int i_915_ = is_872_[i_871_];
				int i_916_ = i_911_ + i_915_;
				int i_917_ = ((i_911_ & 0xff00ff)
					      + (i_915_ & 0xff00ff));
				i_915_
				    = (i_917_ & 0x1000100) + (i_916_ - i_917_
							      & 0x10000);
				is_872_[i_871_]
				    = i_916_ - i_915_ | i_915_ - (i_915_
								  >>> 8);
			    }
			} else if (i_873_ == 3) {
			    int i_918_ = ((TransparentSprite) this).H[i_870_];
			    int i_919_ = qp.w;
			    int i_920_ = i_918_ + i_919_;
			    int i_921_
				= (i_918_ & 0xff00ff) + (i_919_ & 0xff00ff);
			    int i_922_ = ((i_921_ & 0x1000100)
					  + (i_920_ - i_921_ & 0x10000));
			    i_918_ = i_920_ - i_922_ | i_922_ - (i_922_ >>> 8);
			    i_922_ = is_872_[i_871_];
			    i_920_ = i_918_ + i_922_;
			    i_921_ = (i_918_ & 0xff00ff) + (i_922_ & 0xff00ff);
			    i_922_ = (i_921_ & 0x1000100) + (i_920_ - i_921_
							     & 0x10000);
			    is_872_[i_871_]
				= i_920_ - i_922_ | i_922_ - (i_922_ >>> 8);
			} else if (i_873_ == 2) {
			    int i_923_ = ((TransparentSprite) this).H[i_870_];
			    if (i_923_ != 0) {
				int i_924_
				    = (i_923_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_925_
				    = (i_923_ & 0xff00) * qp.D & 0xff0000;
				i_923_ = ((i_924_ | i_925_) >>> 8) + qp.j;
				int i_926_ = is_872_[i_871_];
				int i_927_ = i_923_ + i_926_;
				int i_928_ = ((i_923_ & 0xff00ff)
					      + (i_926_ & 0xff00ff));
				i_926_
				    = (i_928_ & 0x1000100) + (i_927_ - i_928_
							      & 0x10000);
				is_872_[i_871_]
				    = i_927_ - i_926_ | i_926_ - (i_926_
								  >>> 8);
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    i_865_ += qp.h;
		    i_866_ += qp.n;
		}
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else {
	    for (int i_929_ = qp.F; i_929_ < 0; i_929_++) {
		int i_930_ = qp.v;
		int i_931_ = qp.B + qp.a;
		int i_932_ = qp.z + qp.c;
		int i_933_ = qp.y;
		if (i_931_ < 0) {
		    int i_934_ = (qp.h - 1 - i_931_) / qp.h;
		    i_933_ += i_934_;
		    i_931_ += qp.h * i_934_;
		    i_932_ += qp.n * i_934_;
		    i_930_ += i_934_;
		}
		int i_935_;
		if ((i_935_
		     = (i_931_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
		    > i_933_)
		    i_933_ = i_935_;
		if (i_932_ < 0) {
		    i_935_ = (qp.n - 1 - i_932_) / qp.n;
		    i_933_ += i_935_;
		    i_931_ += qp.h * i_935_;
		    i_932_ += qp.n * i_935_;
		    i_930_ += i_935_;
		}
		if ((i_935_
		     = (i_932_ + 1 - (((qp) this).o << 12) - qp.n) / qp.n)
		    > i_933_)
		    i_933_ = i_935_;
		for (/**/; i_933_ < 0; i_933_++) {
		    int i_936_
			= (i_932_ >> 12) * ((qp) this).k + (i_931_ >> 12);
		    int i_937_ = i_930_++;
		    int[] is_938_ = is;
		    int i_939_ = i;
		    int i_940_ = i_406_;
		    if (i_940_ == 0) {
			if (i_939_ == 1)
			    is_938_[i_937_] = ((TransparentSprite) this).H[i_936_];
			else if (i_939_ == 0) {
			    int i_941_ = ((TransparentSprite) this).H[i_936_++];
			    int i_942_
				= (i_941_ & 0xff0000) * qp.l & ~0xffffff;
			    int i_943_ = (i_941_ & 0xff00) * qp.g & 0xff0000;
			    int i_944_ = (i_941_ & 0xff) * qp.A & 0xff00;
			    is_938_[i_937_] = (i_942_ | i_943_ | i_944_) >>> 8;
			} else if (i_939_ == 3) {
			    int i_945_ = ((TransparentSprite) this).H[i_936_++];
			    int i_946_ = qp.w;
			    int i_947_ = i_945_ + i_946_;
			    int i_948_
				= (i_945_ & 0xff00ff) + (i_946_ & 0xff00ff);
			    int i_949_ = ((i_948_ & 0x1000100)
					  + (i_947_ - i_948_ & 0x10000));
			    is_938_[i_937_]
				= i_947_ - i_949_ | i_949_ - (i_949_ >>> 8);
			} else if (i_939_ == 2) {
			    int i_950_ = ((TransparentSprite) this).H[i_936_];
			    int i_951_
				= (i_950_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_952_ = (i_950_ & 0xff00) * qp.D & 0xff0000;
			    is_938_[i_937_] = ((i_951_ | i_952_) >>> 8) + qp.j;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_940_ == 1) {
			if (i_939_ == 1) {
			    int i_953_ = ((TransparentSprite) this).H[i_936_];
			    if (i_953_ != 0)
				is_938_[i_937_] = i_953_;
			} else if (i_939_ == 0) {
			    int i_954_ = ((TransparentSprite) this).H[i_936_];
			    if (i_954_ != 0) {
				if ((qp.w & 0xffffff) == 16777215) {
				    int i_955_ = qp.w >>> 24;
				    int i_956_ = 256 - i_955_;
				    int i_957_ = is_938_[i_937_];
				    is_938_[i_937_]
					= ((((i_954_ & 0xff00ff) * i_955_
					     + (i_957_ & 0xff00ff) * i_956_)
					    & ~0xff00ff)
					   + (((i_954_ & 0xff00) * i_955_
					       + (i_957_ & 0xff00) * i_956_)
					      & 0xff0000)) >> 8;
				} else if (qp.D != 255) {
				    int i_958_ = ((i_954_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_959_
					= (i_954_ & 0xff00) * qp.g & 0xff0000;
				    int i_960_
					= (i_954_ & 0xff) * qp.A & 0xff00;
				    i_954_ = (i_958_ | i_959_ | i_960_) >>> 8;
				    int i_961_ = is_938_[i_937_];
				    is_938_[i_937_]
					= ((((i_954_ & 0xff00ff) * qp.D
					     + (i_961_ & 0xff00ff) * qp.s)
					    & ~0xff00ff)
					   + (((i_954_ & 0xff00) * qp.D
					       + (i_961_ & 0xff00) * qp.s)
					      & 0xff0000)) >> 8;
				} else {
				    int i_962_ = ((i_954_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_963_
					= (i_954_ & 0xff00) * qp.g & 0xff0000;
				    int i_964_
					= (i_954_ & 0xff) * qp.A & 0xff00;
				    is_938_[i_937_]
					= (i_962_ | i_963_ | i_964_) >>> 8;
				}
			    }
			} else if (i_939_ == 3) {
			    int i_965_ = ((TransparentSprite) this).H[i_936_];
			    int i_966_ = qp.w;
			    int i_967_ = i_965_ + i_966_;
			    int i_968_
				= (i_965_ & 0xff00ff) + (i_966_ & 0xff00ff);
			    int i_969_ = ((i_968_ & 0x1000100)
					  + (i_967_ - i_968_ & 0x10000));
			    i_969_ = i_967_ - i_969_ | i_969_ - (i_969_ >>> 8);
			    if (i_965_ == 0 && qp.D != 255) {
				i_965_ = i_969_;
				i_969_ = is_938_[i_937_];
				i_969_ = ((((i_965_ & 0xff00ff) * qp.D
					    + (i_969_ & 0xff00ff) * qp.s)
					   & ~0xff00ff)
					  + (((i_965_ & 0xff00) * qp.D
					      + (i_969_ & 0xff00) * qp.s)
					     & 0xff0000)) >> 8;
			    }
			    is_938_[i_937_] = i_969_;
			} else if (i_939_ == 2) {
			    int i_970_ = ((TransparentSprite) this).H[i_936_];
			    if (i_970_ != 0) {
				int i_971_
				    = (i_970_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_972_
				    = (i_970_ & 0xff00) * qp.D & 0xff0000;
				is_938_[i_937_++]
				    = ((i_971_ | i_972_) >>> 8) + qp.j;
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (i_940_ == 2) {
			if (i_939_ == 1) {
			    int i_973_ = ((TransparentSprite) this).H[i_936_];
			    if (i_973_ != 0) {
				int i_974_ = is_938_[i_937_];
				int i_975_ = i_973_ + i_974_;
				int i_976_ = ((i_973_ & 0xff00ff)
					      + (i_974_ & 0xff00ff));
				i_974_
				    = (i_976_ & 0x1000100) + (i_975_ - i_976_
							      & 0x10000);
				is_938_[i_937_]
				    = i_975_ - i_974_ | i_974_ - (i_974_
								  >>> 8);
			    }
			} else if (i_939_ == 0) {
			    int i_977_ = ((TransparentSprite) this).H[i_936_];
			    if (i_977_ != 0) {
				int i_978_
				    = (i_977_ & 0xff0000) * qp.l & ~0xffffff;
				int i_979_
				    = (i_977_ & 0xff00) * qp.g & 0xff0000;
				int i_980_ = (i_977_ & 0xff) * qp.A & 0xff00;
				i_977_ = (i_978_ | i_979_ | i_980_) >>> 8;
				int i_981_ = is_938_[i_937_];
				int i_982_ = i_977_ + i_981_;
				int i_983_ = ((i_977_ & 0xff00ff)
					      + (i_981_ & 0xff00ff));
				i_981_
				    = (i_983_ & 0x1000100) + (i_982_ - i_983_
							      & 0x10000);
				is_938_[i_937_]
				    = i_982_ - i_981_ | i_981_ - (i_981_
								  >>> 8);
			    }
			} else if (i_939_ == 3) {
			    int i_984_ = ((TransparentSprite) this).H[i_936_];
			    int i_985_ = qp.w;
			    int i_986_ = i_984_ + i_985_;
			    int i_987_
				= (i_984_ & 0xff00ff) + (i_985_ & 0xff00ff);
			    int i_988_ = ((i_987_ & 0x1000100)
					  + (i_986_ - i_987_ & 0x10000));
			    i_984_ = i_986_ - i_988_ | i_988_ - (i_988_ >>> 8);
			    i_988_ = is_938_[i_937_];
			    i_986_ = i_984_ + i_988_;
			    i_987_ = (i_984_ & 0xff00ff) + (i_988_ & 0xff00ff);
			    i_988_ = (i_987_ & 0x1000100) + (i_986_ - i_987_
							     & 0x10000);
			    is_938_[i_937_]
				= i_986_ - i_988_ | i_988_ - (i_988_ >>> 8);
			} else if (i_939_ == 2) {
			    int i_989_ = ((TransparentSprite) this).H[i_936_];
			    if (i_989_ != 0) {
				int i_990_
				    = (i_989_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_991_
				    = (i_989_ & 0xff00) * qp.D & 0xff0000;
				i_989_ = ((i_990_ | i_991_) >>> 8) + qp.j;
				int i_992_ = is_938_[i_937_];
				int i_993_ = i_989_ + i_992_;
				int i_994_ = ((i_989_ & 0xff00ff)
					      + (i_992_ & 0xff00ff));
				i_992_
				    = (i_994_ & 0x1000100) + (i_993_ - i_994_
							      & 0x10000);
				is_938_[i_937_]
				    = i_993_ - i_992_ | i_992_ - (i_992_
								  >>> 8);
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    i_931_ += qp.h;
		    i_932_ += qp.n;
		}
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	}
    }
    
    final void a(int i, int i_995_, int i_996_, int i_997_, int i_998_,
		 int i_999_, int i_1000_, int i_1001_, int i_1002_) {
	if (i_997_ > 0 && i_998_ > 0) {
	    i_996_ <<= 8;
	    int i_1003_ = 0;
	    int i_1004_ = 0;
	    int i_1005_ = ((qp) this).E + ((qp) this).k + ((qp) this).q;
	    int i_1006_ = ((qp) this).f + ((qp) this).o + ((qp) this).C;
	    int i_1007_ = (i_1005_ << 16) / i_997_;
	    int i_1008_ = (i_1006_ << 16) / i_998_;
	    if (((qp) this).E > 0) {
		int i_1009_ = ((((qp) this).E << 16) + i_1007_ - 1) / i_1007_;
		i += i_1009_;
		i_1003_ += i_1009_ * i_1007_ - (((qp) this).E << 16);
	    }
	    if (((qp) this).f > 0) {
		int i_1010_ = ((((qp) this).f << 16) + i_1008_ - 1) / i_1008_;
		i_995_ += i_1010_;
		i_1004_ += i_1010_ * i_1008_ - (((qp) this).f << 16);
	    }
	    if (((qp) this).k < i_1005_)
		i_997_ = (((((qp) this).k << 16) - i_1003_ + i_1007_ - 1)
			  / i_1007_);
	    if (((qp) this).o < i_1006_)
		i_998_ = (((((qp) this).o << 16) - i_1004_ + i_1008_ - 1)
			  / i_1008_);
	    int i_1011_ = i + i_995_ * ((nga) ((qp) this).b).C;
	    int i_1012_ = ((nga) ((qp) this).b).C - i_997_;
	    if (i_995_ + i_998_ > ((nga) ((qp) this).b).cb)
		i_998_ -= i_995_ + i_998_ - ((nga) ((qp) this).b).cb;
	    if (i_995_ < ((nga) ((qp) this).b).u) {
		int i_1013_ = ((nga) ((qp) this).b).u - i_995_;
		i_998_ -= i_1013_;
		i_1011_ += i_1013_ * ((nga) ((qp) this).b).C;
		i_1004_ += i_1008_ * i_1013_;
	    }
	    if (i + i_997_ > ((nga) ((qp) this).b).B) {
		int i_1014_ = i + i_997_ - ((nga) ((qp) this).b).B;
		i_997_ -= i_1014_;
		i_1012_ += i_1014_;
	    }
	    if (i < ((nga) ((qp) this).b).Y) {
		int i_1015_ = ((nga) ((qp) this).b).Y - i;
		i_997_ -= i_1015_;
		i_1011_ += i_1015_;
		i_1003_ += i_1007_ * i_1015_;
		i_1012_ += i_1015_;
	    }
	    int[] is = ((nga) ((qp) this).b).U;
	    int[] is_1016_ = ((nga) ((qp) this).b).H;
	    if (i_1001_ == 0) {
		if (i_999_ == 1) {
		    int i_1017_ = i_1003_;
		    for (int i_1018_ = -i_998_; i_1018_ < 0; i_1018_++) {
			int i_1019_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1020_ = -i_997_; i_1020_ < 0; i_1020_++) {
			    if (i_996_ < is[i_1011_])
				is_1016_[i_1011_]
				    = (((TransparentSprite) this).H
				       [(i_1003_ >> 16) + i_1019_]);
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1017_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 0) {
		    int i_1021_ = (i_1000_ & 0xff0000) >> 16;
		    int i_1022_ = (i_1000_ & 0xff00) >> 8;
		    int i_1023_ = i_1000_ & 0xff;
		    int i_1024_ = i_1003_;
		    for (int i_1025_ = -i_998_; i_1025_ < 0; i_1025_++) {
			int i_1026_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1027_ = -i_997_; i_1027_ < 0; i_1027_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1028_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1026_]);
				int i_1029_ = ((i_1028_ & 0xff0000) * i_1021_
					       & ~0xffffff);
				int i_1030_
				    = (i_1028_ & 0xff00) * i_1022_ & 0xff0000;
				int i_1031_
				    = (i_1028_ & 0xff) * i_1023_ & 0xff00;
				is_1016_[i_1011_]
				    = (i_1029_ | i_1030_ | i_1031_) >>> 8;
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1024_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 3) {
		    int i_1032_ = i_1003_;
		    for (int i_1033_ = -i_998_; i_1033_ < 0; i_1033_++) {
			int i_1034_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1035_ = -i_997_; i_1035_ < 0; i_1035_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1036_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1034_]);
				int i_1037_ = i_1036_ + i_1000_;
				int i_1038_ = ((i_1036_ & 0xff00ff)
					       + (i_1000_ & 0xff00ff));
				int i_1039_
				    = ((i_1038_ & 0x1000100)
				       + (i_1037_ - i_1038_ & 0x10000));
				is_1016_[i_1011_]
				    = i_1037_ - i_1039_ | i_1039_ - (i_1039_
								     >>> 8);
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1032_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 2) {
		    int i_1040_ = i_1000_ >>> 24;
		    int i_1041_ = 256 - i_1040_;
		    int i_1042_ = (i_1000_ & 0xff00ff) * i_1041_ & ~0xff00ff;
		    int i_1043_ = (i_1000_ & 0xff00) * i_1041_ & 0xff0000;
		    i_1000_ = (i_1042_ | i_1043_) >>> 8;
		    int i_1044_ = i_1003_;
		    for (int i_1045_ = -i_998_; i_1045_ < 0; i_1045_++) {
			int i_1046_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1047_ = -i_997_; i_1047_ < 0; i_1047_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1048_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1046_]);
				i_1042_ = ((i_1048_ & 0xff00ff) * i_1040_
					   & ~0xff00ff);
				i_1043_
				    = (i_1048_ & 0xff00) * i_1040_ & 0xff0000;
				is_1016_[i_1011_]
				    = ((i_1042_ | i_1043_) >>> 8) + i_1000_;
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1044_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_1001_ == 1) {
		if (i_999_ == 1) {
		    int i_1049_ = i_1003_;
		    for (int i_1050_ = -i_998_; i_1050_ < 0; i_1050_++) {
			int i_1051_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1052_ = -i_997_; i_1052_ < 0; i_1052_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1053_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1051_]);
				if (i_1053_ != 0)
				    is_1016_[i_1011_] = i_1053_;
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1049_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 0) {
		    int i_1054_ = i_1003_;
		    if ((i_1000_ & 0xffffff) == 16777215) {
			int i_1055_ = i_1000_ >>> 24;
			int i_1056_ = 256 - i_1055_;
			for (int i_1057_ = -i_998_; i_1057_ < 0; i_1057_++) {
			    int i_1058_ = (i_1004_ >> 16) * ((qp) this).k;
			    for (int i_1059_ = -i_997_; i_1059_ < 0;
				 i_1059_++) {
				if (i_996_ < is[i_1011_]) {
				    int i_1060_
					= (((TransparentSprite) this).H
					   [(i_1003_ >> 16) + i_1058_]);
				    if (i_1060_ != 0) {
					int i_1061_ = is_1016_[i_1011_];
					is_1016_[i_1011_]
					    = ((((i_1060_ & 0xff00ff) * i_1055_
						 + ((i_1061_ & 0xff00ff)
						    * i_1056_))
						& ~0xff00ff)
					       + (((i_1060_ & 0xff00) * i_1055_
						   + ((i_1061_ & 0xff00)
						      * i_1056_))
						  & 0xff0000)) >> 8;
				    }
				}
				i_1003_ += i_1007_;
				i_1011_++;
			    }
			    i_1004_ += i_1008_;
			    i_1003_ = i_1054_;
			    i_1011_ += i_1012_;
			}
		    } else {
			int i_1062_ = (i_1000_ & 0xff0000) >> 16;
			int i_1063_ = (i_1000_ & 0xff00) >> 8;
			int i_1064_ = i_1000_ & 0xff;
			int i_1065_ = i_1000_ >>> 24;
			int i_1066_ = 256 - i_1065_;
			for (int i_1067_ = -i_998_; i_1067_ < 0; i_1067_++) {
			    int i_1068_ = (i_1004_ >> 16) * ((qp) this).k;
			    for (int i_1069_ = -i_997_; i_1069_ < 0;
				 i_1069_++) {
				if (i_996_ < is[i_1011_]) {
				    int i_1070_
					= (((TransparentSprite) this).H
					   [(i_1003_ >> 16) + i_1068_]);
				    if (i_1070_ != 0) {
					if (i_1065_ != 255) {
					    int i_1071_
						= (((i_1070_ & 0xff0000)
						    * i_1062_)
						   & ~0xffffff);
					    int i_1072_
						= ((i_1070_ & 0xff00) * i_1063_
						   & 0xff0000);
					    int i_1073_
						= ((i_1070_ & 0xff) * i_1064_
						   & 0xff00);
					    i_1070_ = (i_1071_ | i_1072_
						       | i_1073_) >>> 8;
					    int i_1074_ = is_1016_[i_1011_];
					    is_1016_[i_1011_]
						= (((((i_1070_ & 0xff00ff)
						      * i_1065_)
						     + ((i_1074_ & 0xff00ff)
							* i_1066_))
						    & ~0xff00ff)
						   + ((((i_1070_ & 0xff00)
							* i_1065_)
						       + ((i_1074_ & 0xff00)
							  * i_1066_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1075_
						= (((i_1070_ & 0xff0000)
						    * i_1062_)
						   & ~0xffffff);
					    int i_1076_
						= ((i_1070_ & 0xff00) * i_1063_
						   & 0xff0000);
					    int i_1077_
						= ((i_1070_ & 0xff) * i_1064_
						   & 0xff00);
					    is_1016_[i_1011_]
						= (i_1075_ | i_1076_
						   | i_1077_) >>> 8;
					}
				    }
				}
				i_1003_ += i_1007_;
				i_1011_++;
			    }
			    i_1004_ += i_1008_;
			    i_1003_ = i_1054_;
			    i_1011_ += i_1012_;
			}
			return;
		    }
		    return;
		}
		if (i_999_ == 3) {
		    int i_1078_ = i_1003_;
		    int i_1079_ = i_1000_ >>> 24;
		    int i_1080_ = 256 - i_1079_;
		    for (int i_1081_ = -i_998_; i_1081_ < 0; i_1081_++) {
			int i_1082_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1083_ = -i_997_; i_1083_ < 0; i_1083_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1084_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1082_]);
				int i_1085_ = i_1084_ + i_1000_;
				int i_1086_ = ((i_1084_ & 0xff00ff)
					       + (i_1000_ & 0xff00ff));
				int i_1087_
				    = ((i_1086_ & 0x1000100)
				       + (i_1085_ - i_1086_ & 0x10000));
				i_1087_
				    = i_1085_ - i_1087_ | i_1087_ - (i_1087_
								     >>> 8);
				if (i_1084_ == 0 && i_1079_ != 255) {
				    i_1084_ = i_1087_;
				    i_1087_ = is_1016_[i_1011_];
				    i_1087_
					= ((((i_1084_ & 0xff00ff) * i_1079_
					     + (i_1087_ & 0xff00ff) * i_1080_)
					    & ~0xff00ff)
					   + (((i_1084_ & 0xff00) * i_1079_
					       + (i_1087_ & 0xff00) * i_1080_)
					      & 0xff0000)) >> 8;
				}
				is_1016_[i_1011_] = i_1087_;
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1078_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 2) {
		    int i_1088_ = i_1000_ >>> 24;
		    int i_1089_ = 256 - i_1088_;
		    int i_1090_ = (i_1000_ & 0xff00ff) * i_1089_ & ~0xff00ff;
		    int i_1091_ = (i_1000_ & 0xff00) * i_1089_ & 0xff0000;
		    i_1000_ = (i_1090_ | i_1091_) >>> 8;
		    int i_1092_ = i_1003_;
		    for (int i_1093_ = -i_998_; i_1093_ < 0; i_1093_++) {
			int i_1094_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1095_ = -i_997_; i_1095_ < 0; i_1095_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1096_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1094_]);
				if (i_1096_ != 0) {
				    i_1090_ = ((i_1096_ & 0xff00ff) * i_1088_
					       & ~0xff00ff);
				    i_1091_ = ((i_1096_ & 0xff00) * i_1088_
					       & 0xff0000);
				    is_1016_[i_1011_] = ((i_1090_ | i_1091_)
							 >>> 8) + i_1000_;
				}
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1092_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_1001_ == 2) {
		if (i_999_ == 1) {
		    int i_1097_ = i_1003_;
		    for (int i_1098_ = -i_998_; i_1098_ < 0; i_1098_++) {
			int i_1099_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1100_ = -i_997_; i_1100_ < 0; i_1100_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1101_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1099_]);
				if (i_1101_ != 0) {
				    int i_1102_ = is_1016_[i_1011_];
				    int i_1103_ = i_1101_ + i_1102_;
				    int i_1104_ = ((i_1101_ & 0xff00ff)
						   + (i_1102_ & 0xff00ff));
				    i_1102_
					= ((i_1104_ & 0x1000100)
					   + (i_1103_ - i_1104_ & 0x10000));
				    is_1016_[i_1011_]
					= (i_1103_ - i_1102_
					   | i_1102_ - (i_1102_ >>> 8));
				}
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1097_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 0) {
		    int i_1105_ = i_1003_;
		    int i_1106_ = (i_1000_ & 0xff0000) >> 16;
		    int i_1107_ = (i_1000_ & 0xff00) >> 8;
		    int i_1108_ = i_1000_ & 0xff;
		    for (int i_1109_ = -i_998_; i_1109_ < 0; i_1109_++) {
			int i_1110_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1111_ = -i_997_; i_1111_ < 0; i_1111_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1112_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1110_]);
				if (i_1112_ != 0) {
				    int i_1113_
					= ((i_1112_ & 0xff0000) * i_1106_
					   & ~0xffffff);
				    int i_1114_ = ((i_1112_ & 0xff00) * i_1107_
						   & 0xff0000);
				    int i_1115_
					= (i_1112_ & 0xff) * i_1108_ & 0xff00;
				    i_1112_
					= (i_1113_ | i_1114_ | i_1115_) >>> 8;
				    int i_1116_ = is_1016_[i_1011_];
				    int i_1117_ = i_1112_ + i_1116_;
				    int i_1118_ = ((i_1112_ & 0xff00ff)
						   + (i_1116_ & 0xff00ff));
				    i_1116_
					= ((i_1118_ & 0x1000100)
					   + (i_1117_ - i_1118_ & 0x10000));
				    is_1016_[i_1011_]
					= (i_1117_ - i_1116_
					   | i_1116_ - (i_1116_ >>> 8));
				}
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1105_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 3) {
		    int i_1119_ = i_1003_;
		    for (int i_1120_ = -i_998_; i_1120_ < 0; i_1120_++) {
			int i_1121_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1122_ = -i_997_; i_1122_ < 0; i_1122_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1123_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1121_]);
				int i_1124_ = i_1123_ + i_1000_;
				int i_1125_ = ((i_1123_ & 0xff00ff)
					       + (i_1000_ & 0xff00ff));
				int i_1126_
				    = ((i_1125_ & 0x1000100)
				       + (i_1124_ - i_1125_ & 0x10000));
				i_1123_
				    = i_1124_ - i_1126_ | i_1126_ - (i_1126_
								     >>> 8);
				i_1126_ = is_1016_[i_1011_];
				i_1124_ = i_1123_ + i_1126_;
				i_1125_ = (i_1123_ & 0xff00ff) + (i_1126_
								  & 0xff00ff);
				i_1126_ = ((i_1125_ & 0x1000100)
					   + (i_1124_ - i_1125_ & 0x10000));
				is_1016_[i_1011_]
				    = i_1124_ - i_1126_ | i_1126_ - (i_1126_
								     >>> 8);
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1119_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		if (i_999_ == 2) {
		    int i_1127_ = i_1000_ >>> 24;
		    int i_1128_ = 256 - i_1127_;
		    int i_1129_ = (i_1000_ & 0xff00ff) * i_1128_ & ~0xff00ff;
		    int i_1130_ = (i_1000_ & 0xff00) * i_1128_ & 0xff0000;
		    i_1000_ = (i_1129_ | i_1130_) >>> 8;
		    int i_1131_ = i_1003_;
		    for (int i_1132_ = -i_998_; i_1132_ < 0; i_1132_++) {
			int i_1133_ = (i_1004_ >> 16) * ((qp) this).k;
			for (int i_1134_ = -i_997_; i_1134_ < 0; i_1134_++) {
			    if (i_996_ < is[i_1011_]) {
				int i_1135_ = (((TransparentSprite) this).H
					       [(i_1003_ >> 16) + i_1133_]);
				if (i_1135_ != 0) {
				    i_1129_ = ((i_1135_ & 0xff00ff) * i_1127_
					       & ~0xff00ff);
				    i_1130_ = ((i_1135_ & 0xff00) * i_1127_
					       & 0xff0000);
				    i_1135_ = (((i_1129_ | i_1130_) >>> 8)
					       + i_1000_);
				    int i_1136_ = is_1016_[i_1011_];
				    int i_1137_ = i_1135_ + i_1136_;
				    int i_1138_ = ((i_1135_ & 0xff00ff)
						   + (i_1136_ & 0xff00ff));
				    i_1136_
					= ((i_1138_ & 0x1000100)
					   + (i_1137_ - i_1138_ & 0x10000));
				    is_1016_[i_1011_]
					= (i_1137_ - i_1136_
					   | i_1136_ - (i_1136_ >>> 8));
				}
			    }
			    i_1003_ += i_1007_;
			    i_1011_++;
			}
			i_1004_ += i_1008_;
			i_1003_ = i_1131_;
			i_1011_ += i_1012_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
}
