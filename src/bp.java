/* bp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bp extends qp
{
    int[] H;
    
    final void a(int[] is, int[] is_0_, int i, int i_1_) {
	int[] is_2_ = ((nga) ((qp) this).b).H;
	if (qp.h == 0) {
	    if (qp.n == 0) {
		int i_3_ = qp.F;
		while (i_3_ < 0) {
		    int i_4_ = i_3_ + i_1_;
		    if (i_4_ >= 0) {
			if (i_4_ >= is.length)
			    break;
			int i_5_ = qp.v;
			int i_6_ = qp.B;
			int i_7_ = qp.z;
			int i_8_ = qp.y;
			if (i_6_ >= 0 && i_7_ >= 0
			    && i_6_ - (((qp) this).k << 12) < 0
			    && i_7_ - (((qp) this).o << 12) < 0) {
			    int i_9_ = is[i_4_] - i;
			    int i_10_ = -is_0_[i_4_];
			    int i_11_ = i_9_ - (i_5_ - qp.v);
			    if (i_11_ > 0) {
				i_5_ += i_11_;
				i_8_ += i_11_;
				i_6_ += qp.h * i_11_;
				i_7_ += qp.n * i_11_;
			    } else
				i_10_ -= i_11_;
			    if (i_8_ < i_10_)
				i_8_ = i_10_;
			    for (/**/; i_8_ < 0; i_8_++) {
				int i_12_ = (((bp) this).H
					     [((i_7_ >> 12) * ((qp) this).k
					       + (i_6_ >> 12))]);
				int i_13_ = i_12_ >>> 24;
				int i_14_ = 256 - i_13_;
				int i_15_ = is_2_[i_5_];
				is_2_[i_5_++]
				    = ((((i_12_ & 0xff00ff) * i_13_
					 + (i_15_ & 0xff00ff) * i_14_)
					& ~0xff00ff)
				       + (((i_12_ & 0xff00) * i_13_
					   + (i_15_ & 0xff00) * i_14_)
					  & 0xff0000)) >> 8;
			    }
			}
		    }
		    i_3_++;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_16_ = qp.F;
		while (i_16_ < 0) {
		    int i_17_ = i_16_ + i_1_;
		    if (i_17_ >= 0) {
			if (i_17_ >= is.length)
			    break;
			int i_18_ = qp.v;
			int i_19_ = qp.B;
			int i_20_ = qp.z + qp.c;
			int i_21_ = qp.y;
			if (i_19_ >= 0 && i_19_ - (((qp) this).k << 12) < 0) {
			    int i_22_;
			    if ((i_22_ = i_20_ - (((qp) this).o << 12)) >= 0) {
				i_22_ = (qp.n - i_22_) / qp.n;
				i_21_ += i_22_;
				i_20_ += qp.n * i_22_;
				i_18_ += i_22_;
			    }
			    if ((i_22_ = (i_20_ - qp.n) / qp.n) > i_21_)
				i_21_ = i_22_;
			    int i_23_ = is[i_17_] - i;
			    int i_24_ = -is_0_[i_17_];
			    int i_25_ = i_23_ - (i_18_ - qp.v);
			    if (i_25_ > 0) {
				i_18_ += i_25_;
				i_21_ += i_25_;
				i_19_ += qp.h * i_25_;
				i_20_ += qp.n * i_25_;
			    } else
				i_24_ -= i_25_;
			    if (i_21_ < i_24_)
				i_21_ = i_24_;
			    for (/**/; i_21_ < 0; i_21_++) {
				int i_26_ = (((bp) this).H
					     [((i_20_ >> 12) * ((qp) this).k
					       + (i_19_ >> 12))]);
				int i_27_ = i_26_ >>> 24;
				int i_28_ = 256 - i_27_;
				int i_29_ = is_2_[i_18_];
				is_2_[i_18_++]
				    = ((((i_26_ & 0xff00ff) * i_27_
					 + (i_29_ & 0xff00ff) * i_28_)
					& ~0xff00ff)
				       + (((i_26_ & 0xff00) * i_27_
					   + (i_29_ & 0xff00) * i_28_)
					  & 0xff0000)) >> 8;
				i_20_ += qp.n;
			    }
			}
		    }
		    i_16_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    } else {
		int i_30_ = qp.F;
		while (i_30_ < 0) {
		    int i_31_ = i_30_ + i_1_;
		    if (i_31_ >= 0) {
			if (i_31_ >= is.length)
			    break;
			int i_32_ = qp.v;
			int i_33_ = qp.B;
			int i_34_ = qp.z + qp.c;
			int i_35_ = qp.y;
			if (i_33_ >= 0 && i_33_ - (((qp) this).k << 12) < 0) {
			    if (i_34_ < 0) {
				int i_36_ = (qp.n - 1 - i_34_) / qp.n;
				i_35_ += i_36_;
				i_34_ += qp.n * i_36_;
				i_32_ += i_36_;
			    }
			    int i_37_;
			    if ((i_37_ = (i_34_ + 1 - (((qp) this).o << 12)
					  - qp.n) / qp.n)
				> i_35_)
				i_35_ = i_37_;
			    int i_38_ = is[i_31_] - i;
			    int i_39_ = -is_0_[i_31_];
			    int i_40_ = i_38_ - (i_32_ - qp.v);
			    if (i_40_ > 0) {
				i_32_ += i_40_;
				i_35_ += i_40_;
				i_33_ += qp.h * i_40_;
				i_34_ += qp.n * i_40_;
			    } else
				i_39_ -= i_40_;
			    if (i_35_ < i_39_)
				i_35_ = i_39_;
			    for (/**/; i_35_ < 0; i_35_++) {
				int i_41_ = (((bp) this).H
					     [((i_34_ >> 12) * ((qp) this).k
					       + (i_33_ >> 12))]);
				int i_42_ = i_41_ >>> 24;
				int i_43_ = 256 - i_42_;
				int i_44_ = is_2_[i_32_];
				is_2_[i_32_++]
				    = ((((i_41_ & 0xff00ff) * i_42_
					 + (i_44_ & 0xff00ff) * i_43_)
					& ~0xff00ff)
				       + (((i_41_ & 0xff00) * i_42_
					   + (i_44_ & 0xff00) * i_43_)
					  & 0xff0000)) >> 8;
				i_34_ += qp.n;
			    }
			}
		    }
		    i_30_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.h < 0) {
	    if (qp.n == 0) {
		int i_45_ = qp.F;
		while (i_45_ < 0) {
		    int i_46_ = i_45_ + i_1_;
		    if (i_46_ >= 0) {
			if (i_46_ >= is.length)
			    break;
			int i_47_ = qp.v;
			int i_48_ = qp.B + qp.a;
			int i_49_ = qp.z;
			int i_50_ = qp.y;
			if (i_49_ >= 0 && i_49_ - (((qp) this).o << 12) < 0) {
			    int i_51_;
			    if ((i_51_ = i_48_ - (((qp) this).k << 12)) >= 0) {
				i_51_ = (qp.h - i_51_) / qp.h;
				i_50_ += i_51_;
				i_48_ += qp.h * i_51_;
				i_47_ += i_51_;
			    }
			    if ((i_51_ = (i_48_ - qp.h) / qp.h) > i_50_)
				i_50_ = i_51_;
			    int i_52_ = is[i_46_] - i;
			    int i_53_ = -is_0_[i_46_];
			    int i_54_ = i_52_ - (i_47_ - qp.v);
			    if (i_54_ > 0) {
				i_47_ += i_54_;
				i_50_ += i_54_;
				i_48_ += qp.h * i_54_;
				i_49_ += qp.n * i_54_;
			    } else
				i_53_ -= i_54_;
			    if (i_50_ < i_53_)
				i_50_ = i_53_;
			    for (/**/; i_50_ < 0; i_50_++) {
				int i_55_ = (((bp) this).H
					     [((i_49_ >> 12) * ((qp) this).k
					       + (i_48_ >> 12))]);
				int i_56_ = i_55_ >>> 24;
				int i_57_ = 256 - i_56_;
				int i_58_ = is_2_[i_47_];
				is_2_[i_47_++]
				    = ((((i_55_ & 0xff00ff) * i_56_
					 + (i_58_ & 0xff00ff) * i_57_)
					& ~0xff00ff)
				       + (((i_55_ & 0xff00) * i_56_
					   + (i_58_ & 0xff00) * i_57_)
					  & 0xff0000)) >> 8;
				i_48_ += qp.h;
			    }
			}
		    }
		    i_45_++;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_59_ = qp.F;
		while (i_59_ < 0) {
		    int i_60_ = i_59_ + i_1_;
		    if (i_60_ >= 0) {
			if (i_60_ >= is.length)
			    break;
			int i_61_ = qp.v;
			int i_62_ = qp.B + qp.a;
			int i_63_ = qp.z + qp.c;
			int i_64_ = qp.y;
			int i_65_;
			if ((i_65_ = i_62_ - (((qp) this).k << 12)) >= 0) {
			    i_65_ = (qp.h - i_65_) / qp.h;
			    i_64_ += i_65_;
			    i_62_ += qp.h * i_65_;
			    i_63_ += qp.n * i_65_;
			    i_61_ += i_65_;
			}
			if ((i_65_ = (i_62_ - qp.h) / qp.h) > i_64_)
			    i_64_ = i_65_;
			if ((i_65_ = i_63_ - (((qp) this).o << 12)) >= 0) {
			    i_65_ = (qp.n - i_65_) / qp.n;
			    i_64_ += i_65_;
			    i_62_ += qp.h * i_65_;
			    i_63_ += qp.n * i_65_;
			    i_61_ += i_65_;
			}
			if ((i_65_ = (i_63_ - qp.n) / qp.n) > i_64_)
			    i_64_ = i_65_;
			int i_66_ = is[i_60_] - i;
			int i_67_ = -is_0_[i_60_];
			int i_68_ = i_66_ - (i_61_ - qp.v);
			if (i_68_ > 0) {
			    i_61_ += i_68_;
			    i_64_ += i_68_;
			    i_62_ += qp.h * i_68_;
			    i_63_ += qp.n * i_68_;
			} else
			    i_67_ -= i_68_;
			if (i_64_ < i_67_)
			    i_64_ = i_67_;
			for (/**/; i_64_ < 0; i_64_++) {
			    int i_69_
				= (((bp) this).H
				   [(i_63_ >> 12) * ((qp) this).k + (i_62_
								     >> 12)]);
			    int i_70_ = i_69_ >>> 24;
			    int i_71_ = 256 - i_70_;
			    int i_72_ = is_2_[i_61_];
			    is_2_[i_61_++] = ((((i_69_ & 0xff00ff) * i_70_
						+ (i_72_ & 0xff00ff) * i_71_)
					       & ~0xff00ff)
					      + (((i_69_ & 0xff00) * i_70_
						  + (i_72_ & 0xff00) * i_71_)
						 & 0xff0000)) >> 8;
			    i_62_ += qp.h;
			    i_63_ += qp.n;
			}
		    }
		    i_59_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else {
		int i_73_ = qp.F;
		while (i_73_ < 0) {
		    int i_74_ = i_73_ + i_1_;
		    if (i_74_ >= 0) {
			if (i_74_ >= is.length)
			    break;
			int i_75_ = qp.v;
			int i_76_ = qp.B + qp.a;
			int i_77_ = qp.z + qp.c;
			int i_78_ = qp.y;
			int i_79_;
			if ((i_79_ = i_76_ - (((qp) this).k << 12)) >= 0) {
			    i_79_ = (qp.h - i_79_) / qp.h;
			    i_78_ += i_79_;
			    i_76_ += qp.h * i_79_;
			    i_77_ += qp.n * i_79_;
			    i_75_ += i_79_;
			}
			if ((i_79_ = (i_76_ - qp.h) / qp.h) > i_78_)
			    i_78_ = i_79_;
			if (i_77_ < 0) {
			    i_79_ = (qp.n - 1 - i_77_) / qp.n;
			    i_78_ += i_79_;
			    i_76_ += qp.h * i_79_;
			    i_77_ += qp.n * i_79_;
			    i_75_ += i_79_;
			}
			if ((i_79_ = (i_77_ + 1 - (((qp) this).o << 12)
				      - qp.n) / qp.n)
			    > i_78_)
			    i_78_ = i_79_;
			int i_80_ = is[i_74_] - i;
			int i_81_ = -is_0_[i_74_];
			int i_82_ = i_80_ - (i_75_ - qp.v);
			if (i_82_ > 0) {
			    i_75_ += i_82_;
			    i_78_ += i_82_;
			    i_76_ += qp.h * i_82_;
			    i_77_ += qp.n * i_82_;
			} else
			    i_81_ -= i_82_;
			if (i_78_ < i_81_)
			    i_78_ = i_81_;
			for (/**/; i_78_ < 0; i_78_++) {
			    int i_83_
				= (((bp) this).H
				   [(i_77_ >> 12) * ((qp) this).k + (i_76_
								     >> 12)]);
			    int i_84_ = i_83_ >>> 24;
			    int i_85_ = 256 - i_84_;
			    int i_86_ = is_2_[i_75_];
			    is_2_[i_75_++] = ((((i_83_ & 0xff00ff) * i_84_
						+ (i_86_ & 0xff00ff) * i_85_)
					       & ~0xff00ff)
					      + (((i_83_ & 0xff00) * i_84_
						  + (i_86_ & 0xff00) * i_85_)
						 & 0xff0000)) >> 8;
			    i_76_ += qp.h;
			    i_77_ += qp.n;
			}
		    }
		    i_73_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.n == 0) {
	    int i_87_ = qp.F;
	    while (i_87_ < 0) {
		int i_88_ = i_87_ + i_1_;
		if (i_88_ >= 0) {
		    if (i_88_ >= is.length)
			break;
		    int i_89_ = qp.v;
		    int i_90_ = qp.B + qp.a;
		    int i_91_ = qp.z;
		    int i_92_ = qp.y;
		    if (i_91_ >= 0 && i_91_ - (((qp) this).o << 12) < 0) {
			if (i_90_ < 0) {
			    int i_93_ = (qp.h - 1 - i_90_) / qp.h;
			    i_92_ += i_93_;
			    i_90_ += qp.h * i_93_;
			    i_89_ += i_93_;
			}
			int i_94_;
			if ((i_94_ = (i_90_ + 1 - (((qp) this).k << 12)
				      - qp.h) / qp.h)
			    > i_92_)
			    i_92_ = i_94_;
			int i_95_ = is[i_88_] - i;
			int i_96_ = -is_0_[i_88_];
			int i_97_ = i_95_ - (i_89_ - qp.v);
			if (i_97_ > 0) {
			    i_89_ += i_97_;
			    i_92_ += i_97_;
			    i_90_ += qp.h * i_97_;
			    i_91_ += qp.n * i_97_;
			} else
			    i_96_ -= i_97_;
			if (i_92_ < i_96_)
			    i_92_ = i_96_;
			for (/**/; i_92_ < 0; i_92_++) {
			    int i_98_
				= (((bp) this).H
				   [(i_91_ >> 12) * ((qp) this).k + (i_90_
								     >> 12)]);
			    int i_99_ = i_98_ >>> 24;
			    int i_100_ = 256 - i_99_;
			    int i_101_ = is_2_[i_89_];
			    is_2_[i_89_++] = ((((i_98_ & 0xff00ff) * i_99_
						+ (i_101_ & 0xff00ff) * i_100_)
					       & ~0xff00ff)
					      + (((i_98_ & 0xff00) * i_99_
						  + (i_101_ & 0xff00) * i_100_)
						 & 0xff0000)) >> 8;
			    i_90_ += qp.h;
			}
		    }
		}
		i_87_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else if (qp.n < 0) {
	    int i_102_ = qp.F;
	    while (i_102_ < 0) {
		int i_103_ = i_102_ + i_1_;
		if (i_103_ >= 0) {
		    if (i_103_ >= is.length)
			break;
		    int i_104_ = qp.v;
		    int i_105_ = qp.B + qp.a;
		    int i_106_ = qp.z + qp.c;
		    int i_107_ = qp.y;
		    if (i_105_ < 0) {
			int i_108_ = (qp.h - 1 - i_105_) / qp.h;
			i_107_ += i_108_;
			i_105_ += qp.h * i_108_;
			i_106_ += qp.n * i_108_;
			i_104_ += i_108_;
		    }
		    int i_109_;
		    if ((i_109_
			 = (i_105_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
			> i_107_)
			i_107_ = i_109_;
		    if ((i_109_ = i_106_ - (((qp) this).o << 12)) >= 0) {
			i_109_ = (qp.n - i_109_) / qp.n;
			i_107_ += i_109_;
			i_105_ += qp.h * i_109_;
			i_106_ += qp.n * i_109_;
			i_104_ += i_109_;
		    }
		    if ((i_109_ = (i_106_ - qp.n) / qp.n) > i_107_)
			i_107_ = i_109_;
		    int i_110_ = is[i_103_] - i;
		    int i_111_ = -is_0_[i_103_];
		    int i_112_ = i_110_ - (i_104_ - qp.v);
		    if (i_112_ > 0) {
			i_104_ += i_112_;
			i_107_ += i_112_;
			i_105_ += qp.h * i_112_;
			i_106_ += qp.n * i_112_;
		    } else
			i_111_ -= i_112_;
		    if (i_107_ < i_111_)
			i_107_ = i_111_;
		    for (/**/; i_107_ < 0; i_107_++) {
			int i_113_
			    = (((bp) this).H
			       [(i_106_ >> 12) * ((qp) this).k + (i_105_
								  >> 12)]);
			int i_114_ = i_113_ >>> 24;
			int i_115_ = 256 - i_114_;
			int i_116_ = is_2_[i_104_];
			is_2_[i_104_++] = ((((i_113_ & 0xff00ff) * i_114_
					     + (i_116_ & 0xff00ff) * i_115_)
					    & ~0xff00ff)
					   + (((i_113_ & 0xff00) * i_114_
					       + (i_116_ & 0xff00) * i_115_)
					      & 0xff0000)) >> 8;
			i_105_ += qp.h;
			i_106_ += qp.n;
		    }
		}
		i_102_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else {
	    int i_117_ = qp.F;
	    while (i_117_ < 0) {
		int i_118_ = i_117_ + i_1_;
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
		    if (i_121_ < 0) {
			i_124_ = (qp.n - 1 - i_121_) / qp.n;
			i_122_ += i_124_;
			i_120_ += qp.h * i_124_;
			i_121_ += qp.n * i_124_;
			i_119_ += i_124_;
		    }
		    if ((i_124_
			 = (i_121_ + 1 - (((qp) this).o << 12) - qp.n) / qp.n)
			> i_122_)
			i_122_ = i_124_;
		    int i_125_ = is[i_118_] - i;
		    int i_126_ = -is_0_[i_118_];
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
			    = (((bp) this).H
			       [(i_121_ >> 12) * ((qp) this).k + (i_120_
								  >> 12)]);
			int i_129_ = i_128_ >>> 24;
			int i_130_ = 256 - i_129_;
			int i_131_ = is_2_[i_119_];
			is_2_[i_119_++] = ((((i_128_ & 0xff00ff) * i_129_
					     + (i_131_ & 0xff00ff) * i_130_)
					    & ~0xff00ff)
					   + (((i_128_ & 0xff00) * i_129_
					       + (i_131_ & 0xff00) * i_130_)
					      & 0xff0000)) >> 8;
			i_120_ += qp.h;
			i_121_ += qp.n;
		    }
		}
		i_117_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	}
    }
    
    final void da(int i, int i_132_, int i_133_, int i_134_, int i_135_,
		  int i_136_) {
	int[] is = ((nga) ((qp) this).b).H;
	for (int i_137_ = 0; i_137_ < i_134_; i_137_++) {
	    int i_138_ = (i_132_ + i_137_) * i_133_ + i;
	    int i_139_ = (i_136_ + i_137_) * i_133_ + i_135_;
	    for (int i_140_ = 0; i_140_ < i_133_; i_140_++)
		((bp) this).H[i_138_ + i_140_]
		    = is[i_139_ + i_140_] & 0xffffff;
	}
    }
    
    final void b(int i, int i_141_) {
	int[] is = ((nga) ((qp) this).b).H;
	if (qp.h == 0) {
	    if (qp.n == 0) {
		int i_142_ = qp.F;
		while (i_142_ < 0) {
		    int i_143_ = qp.v;
		    int i_144_ = qp.B;
		    int i_145_ = qp.z;
		    int i_146_ = qp.y;
		    if (i_144_ >= 0 && i_145_ >= 0
			&& i_144_ - (((qp) this).k << 12) < 0
			&& i_145_ - (((qp) this).o << 12) < 0) {
			for (/**/; i_146_ < 0; i_146_++) {
			    int i_147_ = ((i_145_ >> 12) * ((qp) this).k
					  + (i_144_ >> 12));
			    int i_148_ = i_143_++;
			    int[] is_149_ = is;
			    int i_150_ = i;
			    int i_151_ = i_141_;
			    if (i_151_ == 0) {
				if (i_150_ == 1)
				    is_149_[i_148_] = ((bp) this).H[i_147_];
				else if (i_150_ == 0) {
				    int i_152_ = ((bp) this).H[i_147_++];
				    int i_153_ = ((i_152_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_154_
					= (i_152_ & 0xff00) * qp.g & 0xff0000;
				    int i_155_
					= (i_152_ & 0xff) * qp.A & 0xff00;
				    is_149_[i_148_]
					= (i_153_ | i_154_ | i_155_) >>> 8;
				} else if (i_150_ == 3) {
				    int i_156_ = ((bp) this).H[i_147_++];
				    int i_157_ = qp.w;
				    int i_158_ = i_156_ + i_157_;
				    int i_159_ = ((i_156_ & 0xff00ff)
						  + (i_157_ & 0xff00ff));
				    int i_160_
					= ((i_159_ & 0x1000100)
					   + (i_158_ - i_159_ & 0x10000));
				    is_149_[i_148_]
					= i_158_ - i_160_ | i_160_ - (i_160_
								      >>> 8);
				} else if (i_150_ == 2) {
				    int i_161_ = ((bp) this).H[i_147_];
				    int i_162_ = ((i_161_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_163_
					= (i_161_ & 0xff00) * qp.D & 0xff0000;
				    is_149_[i_148_]
					= ((i_162_ | i_163_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_151_ == 1) {
				if (i_150_ == 1) {
				    int i_164_ = ((bp) this).H[i_147_];
				    int i_165_ = i_164_ >>> 24;
				    int i_166_ = 256 - i_165_;
				    int i_167_ = is_149_[i_148_];
				    is_149_[i_148_]
					= ((((i_164_ & 0xff00ff) * i_165_
					     + (i_167_ & 0xff00ff) * i_166_)
					    & ~0xff00ff)
					   + (((i_164_ & 0xff00) * i_165_
					       + (i_167_ & 0xff00) * i_166_)
					      & 0xff0000)) >> 8;
				} else if (i_150_ == 0) {
				    int i_168_ = ((bp) this).H[i_147_];
				    int i_169_ = (i_168_ >>> 24) * qp.D >> 8;
				    int i_170_ = 256 - i_169_;
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_171_ = is_149_[i_148_];
					is_149_[i_148_]
					    = ((((i_168_ & 0xff00ff) * i_169_
						 + ((i_171_ & 0xff00ff)
						    * i_170_))
						& ~0xff00ff)
					       + (((i_168_ & 0xff00) * i_169_
						   + ((i_171_ & 0xff00)
						      * i_170_))
						  & 0xff0000)) >> 8;
				    } else if (i_169_ != 255) {
					int i_172_
					    = ((i_168_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_173_ = ((i_168_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_174_
					    = (i_168_ & 0xff) * qp.A & 0xff00;
					i_168_
					    = (i_172_ | i_173_ | i_174_) >>> 8;
					int i_175_ = is_149_[i_148_];
					is_149_[i_148_]
					    = ((((i_168_ & 0xff00ff) * i_169_
						 + ((i_175_ & 0xff00ff)
						    * i_170_))
						& ~0xff00ff)
					       + (((i_168_ & 0xff00) * i_169_
						   + ((i_175_ & 0xff00)
						      * i_170_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_176_
					    = ((i_168_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_177_ = ((i_168_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_178_
					    = (i_168_ & 0xff) * qp.A & 0xff00;
					is_149_[i_148_]
					    = (i_176_ | i_177_ | i_178_) >>> 8;
				    }
				} else if (i_150_ == 3) {
				    int i_179_ = ((bp) this).H[i_147_];
				    int i_180_ = qp.w;
				    int i_181_ = i_179_ + i_180_;
				    int i_182_ = ((i_179_ & 0xff00ff)
						  + (i_180_ & 0xff00ff));
				    int i_183_
					= ((i_182_ & 0x1000100)
					   + (i_181_ - i_182_ & 0x10000));
				    i_183_
					= i_181_ - i_183_ | i_183_ - (i_183_
								      >>> 8);
				    int i_184_ = (i_179_ >>> 24) * qp.D >> 8;
				    int i_185_ = 256 - i_184_;
				    if (i_184_ != 255) {
					i_179_ = i_183_;
					i_183_ = is_149_[i_148_];
					i_183_
					    = ((((i_179_ & 0xff00ff) * i_184_
						 + ((i_183_ & 0xff00ff)
						    * i_185_))
						& ~0xff00ff)
					       + (((i_179_ & 0xff00) * i_184_
						   + ((i_183_ & 0xff00)
						      * i_185_))
						  & 0xff0000)) >> 8;
				    }
				    is_149_[i_148_] = i_183_;
				} else if (i_150_ == 2) {
				    int i_186_ = ((bp) this).H[i_147_];
				    int i_187_ = i_186_ >>> 24;
				    int i_188_ = 256 - i_187_;
				    int i_189_ = ((i_186_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_190_
					= (i_186_ & 0xff00) * qp.D & 0xff0000;
				    i_186_ = ((i_189_ | i_190_) >>> 8) + qp.j;
				    int i_191_ = is_149_[i_148_];
				    is_149_[i_148_]
					= ((((i_186_ & 0xff00ff) * i_187_
					     + (i_191_ & 0xff00ff) * i_188_)
					    & ~0xff00ff)
					   + (((i_186_ & 0xff00) * i_187_
					       + (i_191_ & 0xff00) * i_188_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_151_ == 2) {
				if (i_150_ == 1) {
				    int i_192_ = ((bp) this).H[i_147_];
				    int i_193_ = is_149_[i_148_];
				    int i_194_ = i_192_ + i_193_;
				    int i_195_ = ((i_192_ & 0xff00ff)
						  + (i_193_ & 0xff00ff));
				    i_193_ = ((i_195_ & 0x1000100)
					      + (i_194_ - i_195_ & 0x10000));
				    is_149_[i_148_]
					= i_194_ - i_193_ | i_193_ - (i_193_
								      >>> 8);
				} else if (i_150_ == 0) {
				    int i_196_ = ((bp) this).H[i_147_];
				    int i_197_ = ((i_196_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_198_
					= (i_196_ & 0xff00) * qp.g & 0xff0000;
				    int i_199_
					= (i_196_ & 0xff) * qp.A & 0xff00;
				    i_196_ = (i_197_ | i_198_ | i_199_) >>> 8;
				    int i_200_ = is_149_[i_148_];
				    int i_201_ = i_196_ + i_200_;
				    int i_202_ = ((i_196_ & 0xff00ff)
						  + (i_200_ & 0xff00ff));
				    i_200_ = ((i_202_ & 0x1000100)
					      + (i_201_ - i_202_ & 0x10000));
				    is_149_[i_148_]
					= i_201_ - i_200_ | i_200_ - (i_200_
								      >>> 8);
				} else if (i_150_ == 3) {
				    int i_203_ = ((bp) this).H[i_147_];
				    int i_204_ = qp.w;
				    int i_205_ = i_203_ + i_204_;
				    int i_206_ = ((i_203_ & 0xff00ff)
						  + (i_204_ & 0xff00ff));
				    int i_207_
					= ((i_206_ & 0x1000100)
					   + (i_205_ - i_206_ & 0x10000));
				    i_203_
					= i_205_ - i_207_ | i_207_ - (i_207_
								      >>> 8);
				    i_207_ = is_149_[i_148_];
				    i_205_ = i_203_ + i_207_;
				    i_206_
					= (i_203_ & 0xff00ff) + (i_207_
								 & 0xff00ff);
				    i_207_ = ((i_206_ & 0x1000100)
					      + (i_205_ - i_206_ & 0x10000));
				    is_149_[i_148_]
					= i_205_ - i_207_ | i_207_ - (i_207_
								      >>> 8);
				} else if (i_150_ == 2) {
				    int i_208_ = ((bp) this).H[i_147_];
				    int i_209_ = ((i_208_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_210_
					= (i_208_ & 0xff00) * qp.D & 0xff0000;
				    i_208_ = ((i_209_ | i_210_) >>> 8) + qp.j;
				    int i_211_ = is_149_[i_148_];
				    int i_212_ = i_208_ + i_211_;
				    int i_213_ = ((i_208_ & 0xff00ff)
						  + (i_211_ & 0xff00ff));
				    i_211_ = ((i_213_ & 0x1000100)
					      + (i_212_ - i_213_ & 0x10000));
				    is_149_[i_148_]
					= i_212_ - i_211_ | i_211_ - (i_211_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			}
		    }
		    i_142_++;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_214_ = qp.F;
		while (i_214_ < 0) {
		    int i_215_ = qp.v;
		    int i_216_ = qp.B;
		    int i_217_ = qp.z + qp.c;
		    int i_218_ = qp.y;
		    if (i_216_ >= 0 && i_216_ - (((qp) this).k << 12) < 0) {
			int i_219_;
			if ((i_219_ = i_217_ - (((qp) this).o << 12)) >= 0) {
			    i_219_ = (qp.n - i_219_) / qp.n;
			    i_218_ += i_219_;
			    i_217_ += qp.n * i_219_;
			    i_215_ += i_219_;
			}
			if ((i_219_ = (i_217_ - qp.n) / qp.n) > i_218_)
			    i_218_ = i_219_;
			for (/**/; i_218_ < 0; i_218_++) {
			    int i_220_ = ((i_217_ >> 12) * ((qp) this).k
					  + (i_216_ >> 12));
			    int i_221_ = i_215_++;
			    int[] is_222_ = is;
			    int i_223_ = i;
			    int i_224_ = i_141_;
			    if (i_224_ == 0) {
				if (i_223_ == 1)
				    is_222_[i_221_] = ((bp) this).H[i_220_];
				else if (i_223_ == 0) {
				    int i_225_ = ((bp) this).H[i_220_++];
				    int i_226_ = ((i_225_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_227_
					= (i_225_ & 0xff00) * qp.g & 0xff0000;
				    int i_228_
					= (i_225_ & 0xff) * qp.A & 0xff00;
				    is_222_[i_221_]
					= (i_226_ | i_227_ | i_228_) >>> 8;
				} else if (i_223_ == 3) {
				    int i_229_ = ((bp) this).H[i_220_++];
				    int i_230_ = qp.w;
				    int i_231_ = i_229_ + i_230_;
				    int i_232_ = ((i_229_ & 0xff00ff)
						  + (i_230_ & 0xff00ff));
				    int i_233_
					= ((i_232_ & 0x1000100)
					   + (i_231_ - i_232_ & 0x10000));
				    is_222_[i_221_]
					= i_231_ - i_233_ | i_233_ - (i_233_
								      >>> 8);
				} else if (i_223_ == 2) {
				    int i_234_ = ((bp) this).H[i_220_];
				    int i_235_ = ((i_234_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_236_
					= (i_234_ & 0xff00) * qp.D & 0xff0000;
				    is_222_[i_221_]
					= ((i_235_ | i_236_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_224_ == 1) {
				if (i_223_ == 1) {
				    int i_237_ = ((bp) this).H[i_220_];
				    int i_238_ = i_237_ >>> 24;
				    int i_239_ = 256 - i_238_;
				    int i_240_ = is_222_[i_221_];
				    is_222_[i_221_]
					= ((((i_237_ & 0xff00ff) * i_238_
					     + (i_240_ & 0xff00ff) * i_239_)
					    & ~0xff00ff)
					   + (((i_237_ & 0xff00) * i_238_
					       + (i_240_ & 0xff00) * i_239_)
					      & 0xff0000)) >> 8;
				} else if (i_223_ == 0) {
				    int i_241_ = ((bp) this).H[i_220_];
				    int i_242_ = (i_241_ >>> 24) * qp.D >> 8;
				    int i_243_ = 256 - i_242_;
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_244_ = is_222_[i_221_];
					is_222_[i_221_]
					    = ((((i_241_ & 0xff00ff) * i_242_
						 + ((i_244_ & 0xff00ff)
						    * i_243_))
						& ~0xff00ff)
					       + (((i_241_ & 0xff00) * i_242_
						   + ((i_244_ & 0xff00)
						      * i_243_))
						  & 0xff0000)) >> 8;
				    } else if (i_242_ != 255) {
					int i_245_
					    = ((i_241_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_246_ = ((i_241_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_247_
					    = (i_241_ & 0xff) * qp.A & 0xff00;
					i_241_
					    = (i_245_ | i_246_ | i_247_) >>> 8;
					int i_248_ = is_222_[i_221_];
					is_222_[i_221_]
					    = ((((i_241_ & 0xff00ff) * i_242_
						 + ((i_248_ & 0xff00ff)
						    * i_243_))
						& ~0xff00ff)
					       + (((i_241_ & 0xff00) * i_242_
						   + ((i_248_ & 0xff00)
						      * i_243_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_249_
					    = ((i_241_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_250_ = ((i_241_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_251_
					    = (i_241_ & 0xff) * qp.A & 0xff00;
					is_222_[i_221_]
					    = (i_249_ | i_250_ | i_251_) >>> 8;
				    }
				} else if (i_223_ == 3) {
				    int i_252_ = ((bp) this).H[i_220_];
				    int i_253_ = qp.w;
				    int i_254_ = i_252_ + i_253_;
				    int i_255_ = ((i_252_ & 0xff00ff)
						  + (i_253_ & 0xff00ff));
				    int i_256_
					= ((i_255_ & 0x1000100)
					   + (i_254_ - i_255_ & 0x10000));
				    i_256_
					= i_254_ - i_256_ | i_256_ - (i_256_
								      >>> 8);
				    int i_257_ = (i_252_ >>> 24) * qp.D >> 8;
				    int i_258_ = 256 - i_257_;
				    if (i_257_ != 255) {
					i_252_ = i_256_;
					i_256_ = is_222_[i_221_];
					i_256_
					    = ((((i_252_ & 0xff00ff) * i_257_
						 + ((i_256_ & 0xff00ff)
						    * i_258_))
						& ~0xff00ff)
					       + (((i_252_ & 0xff00) * i_257_
						   + ((i_256_ & 0xff00)
						      * i_258_))
						  & 0xff0000)) >> 8;
				    }
				    is_222_[i_221_] = i_256_;
				} else if (i_223_ == 2) {
				    int i_259_ = ((bp) this).H[i_220_];
				    int i_260_ = i_259_ >>> 24;
				    int i_261_ = 256 - i_260_;
				    int i_262_ = ((i_259_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_263_
					= (i_259_ & 0xff00) * qp.D & 0xff0000;
				    i_259_ = ((i_262_ | i_263_) >>> 8) + qp.j;
				    int i_264_ = is_222_[i_221_];
				    is_222_[i_221_]
					= ((((i_259_ & 0xff00ff) * i_260_
					     + (i_264_ & 0xff00ff) * i_261_)
					    & ~0xff00ff)
					   + (((i_259_ & 0xff00) * i_260_
					       + (i_264_ & 0xff00) * i_261_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_224_ == 2) {
				if (i_223_ == 1) {
				    int i_265_ = ((bp) this).H[i_220_];
				    int i_266_ = is_222_[i_221_];
				    int i_267_ = i_265_ + i_266_;
				    int i_268_ = ((i_265_ & 0xff00ff)
						  + (i_266_ & 0xff00ff));
				    i_266_ = ((i_268_ & 0x1000100)
					      + (i_267_ - i_268_ & 0x10000));
				    is_222_[i_221_]
					= i_267_ - i_266_ | i_266_ - (i_266_
								      >>> 8);
				} else if (i_223_ == 0) {
				    int i_269_ = ((bp) this).H[i_220_];
				    int i_270_ = ((i_269_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_271_
					= (i_269_ & 0xff00) * qp.g & 0xff0000;
				    int i_272_
					= (i_269_ & 0xff) * qp.A & 0xff00;
				    i_269_ = (i_270_ | i_271_ | i_272_) >>> 8;
				    int i_273_ = is_222_[i_221_];
				    int i_274_ = i_269_ + i_273_;
				    int i_275_ = ((i_269_ & 0xff00ff)
						  + (i_273_ & 0xff00ff));
				    i_273_ = ((i_275_ & 0x1000100)
					      + (i_274_ - i_275_ & 0x10000));
				    is_222_[i_221_]
					= i_274_ - i_273_ | i_273_ - (i_273_
								      >>> 8);
				} else if (i_223_ == 3) {
				    int i_276_ = ((bp) this).H[i_220_];
				    int i_277_ = qp.w;
				    int i_278_ = i_276_ + i_277_;
				    int i_279_ = ((i_276_ & 0xff00ff)
						  + (i_277_ & 0xff00ff));
				    int i_280_
					= ((i_279_ & 0x1000100)
					   + (i_278_ - i_279_ & 0x10000));
				    i_276_
					= i_278_ - i_280_ | i_280_ - (i_280_
								      >>> 8);
				    i_280_ = is_222_[i_221_];
				    i_278_ = i_276_ + i_280_;
				    i_279_
					= (i_276_ & 0xff00ff) + (i_280_
								 & 0xff00ff);
				    i_280_ = ((i_279_ & 0x1000100)
					      + (i_278_ - i_279_ & 0x10000));
				    is_222_[i_221_]
					= i_278_ - i_280_ | i_280_ - (i_280_
								      >>> 8);
				} else if (i_223_ == 2) {
				    int i_281_ = ((bp) this).H[i_220_];
				    int i_282_ = ((i_281_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_283_
					= (i_281_ & 0xff00) * qp.D & 0xff0000;
				    i_281_ = ((i_282_ | i_283_) >>> 8) + qp.j;
				    int i_284_ = is_222_[i_221_];
				    int i_285_ = i_281_ + i_284_;
				    int i_286_ = ((i_281_ & 0xff00ff)
						  + (i_284_ & 0xff00ff));
				    i_284_ = ((i_286_ & 0x1000100)
					      + (i_285_ - i_286_ & 0x10000));
				    is_222_[i_221_]
					= i_285_ - i_284_ | i_284_ - (i_284_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			    i_217_ += qp.n;
			}
		    }
		    i_214_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    } else {
		int i_287_ = qp.F;
		while (i_287_ < 0) {
		    int i_288_ = qp.v;
		    int i_289_ = qp.B;
		    int i_290_ = qp.z + qp.c;
		    int i_291_ = qp.y;
		    if (i_289_ >= 0 && i_289_ - (((qp) this).k << 12) < 0) {
			if (i_290_ < 0) {
			    int i_292_ = (qp.n - 1 - i_290_) / qp.n;
			    i_291_ += i_292_;
			    i_290_ += qp.n * i_292_;
			    i_288_ += i_292_;
			}
			int i_293_;
			if ((i_293_ = (i_290_ + 1 - (((qp) this).o << 12)
				       - qp.n) / qp.n)
			    > i_291_)
			    i_291_ = i_293_;
			for (/**/; i_291_ < 0; i_291_++) {
			    int i_294_ = ((i_290_ >> 12) * ((qp) this).k
					  + (i_289_ >> 12));
			    int i_295_ = i_288_++;
			    int[] is_296_ = is;
			    int i_297_ = i;
			    int i_298_ = i_141_;
			    if (i_298_ == 0) {
				if (i_297_ == 1)
				    is_296_[i_295_] = ((bp) this).H[i_294_];
				else if (i_297_ == 0) {
				    int i_299_ = ((bp) this).H[i_294_++];
				    int i_300_ = ((i_299_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_301_
					= (i_299_ & 0xff00) * qp.g & 0xff0000;
				    int i_302_
					= (i_299_ & 0xff) * qp.A & 0xff00;
				    is_296_[i_295_]
					= (i_300_ | i_301_ | i_302_) >>> 8;
				} else if (i_297_ == 3) {
				    int i_303_ = ((bp) this).H[i_294_++];
				    int i_304_ = qp.w;
				    int i_305_ = i_303_ + i_304_;
				    int i_306_ = ((i_303_ & 0xff00ff)
						  + (i_304_ & 0xff00ff));
				    int i_307_
					= ((i_306_ & 0x1000100)
					   + (i_305_ - i_306_ & 0x10000));
				    is_296_[i_295_]
					= i_305_ - i_307_ | i_307_ - (i_307_
								      >>> 8);
				} else if (i_297_ == 2) {
				    int i_308_ = ((bp) this).H[i_294_];
				    int i_309_ = ((i_308_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_310_
					= (i_308_ & 0xff00) * qp.D & 0xff0000;
				    is_296_[i_295_]
					= ((i_309_ | i_310_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_298_ == 1) {
				if (i_297_ == 1) {
				    int i_311_ = ((bp) this).H[i_294_];
				    int i_312_ = i_311_ >>> 24;
				    int i_313_ = 256 - i_312_;
				    int i_314_ = is_296_[i_295_];
				    is_296_[i_295_]
					= ((((i_311_ & 0xff00ff) * i_312_
					     + (i_314_ & 0xff00ff) * i_313_)
					    & ~0xff00ff)
					   + (((i_311_ & 0xff00) * i_312_
					       + (i_314_ & 0xff00) * i_313_)
					      & 0xff0000)) >> 8;
				} else if (i_297_ == 0) {
				    int i_315_ = ((bp) this).H[i_294_];
				    int i_316_ = (i_315_ >>> 24) * qp.D >> 8;
				    int i_317_ = 256 - i_316_;
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_318_ = is_296_[i_295_];
					is_296_[i_295_]
					    = ((((i_315_ & 0xff00ff) * i_316_
						 + ((i_318_ & 0xff00ff)
						    * i_317_))
						& ~0xff00ff)
					       + (((i_315_ & 0xff00) * i_316_
						   + ((i_318_ & 0xff00)
						      * i_317_))
						  & 0xff0000)) >> 8;
				    } else if (i_316_ != 255) {
					int i_319_
					    = ((i_315_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_320_ = ((i_315_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_321_
					    = (i_315_ & 0xff) * qp.A & 0xff00;
					i_315_
					    = (i_319_ | i_320_ | i_321_) >>> 8;
					int i_322_ = is_296_[i_295_];
					is_296_[i_295_]
					    = ((((i_315_ & 0xff00ff) * i_316_
						 + ((i_322_ & 0xff00ff)
						    * i_317_))
						& ~0xff00ff)
					       + (((i_315_ & 0xff00) * i_316_
						   + ((i_322_ & 0xff00)
						      * i_317_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_323_
					    = ((i_315_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_324_ = ((i_315_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_325_
					    = (i_315_ & 0xff) * qp.A & 0xff00;
					is_296_[i_295_]
					    = (i_323_ | i_324_ | i_325_) >>> 8;
				    }
				} else if (i_297_ == 3) {
				    int i_326_ = ((bp) this).H[i_294_];
				    int i_327_ = qp.w;
				    int i_328_ = i_326_ + i_327_;
				    int i_329_ = ((i_326_ & 0xff00ff)
						  + (i_327_ & 0xff00ff));
				    int i_330_
					= ((i_329_ & 0x1000100)
					   + (i_328_ - i_329_ & 0x10000));
				    i_330_
					= i_328_ - i_330_ | i_330_ - (i_330_
								      >>> 8);
				    int i_331_ = (i_326_ >>> 24) * qp.D >> 8;
				    int i_332_ = 256 - i_331_;
				    if (i_331_ != 255) {
					i_326_ = i_330_;
					i_330_ = is_296_[i_295_];
					i_330_
					    = ((((i_326_ & 0xff00ff) * i_331_
						 + ((i_330_ & 0xff00ff)
						    * i_332_))
						& ~0xff00ff)
					       + (((i_326_ & 0xff00) * i_331_
						   + ((i_330_ & 0xff00)
						      * i_332_))
						  & 0xff0000)) >> 8;
				    }
				    is_296_[i_295_] = i_330_;
				} else if (i_297_ == 2) {
				    int i_333_ = ((bp) this).H[i_294_];
				    int i_334_ = i_333_ >>> 24;
				    int i_335_ = 256 - i_334_;
				    int i_336_ = ((i_333_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_337_
					= (i_333_ & 0xff00) * qp.D & 0xff0000;
				    i_333_ = ((i_336_ | i_337_) >>> 8) + qp.j;
				    int i_338_ = is_296_[i_295_];
				    is_296_[i_295_]
					= ((((i_333_ & 0xff00ff) * i_334_
					     + (i_338_ & 0xff00ff) * i_335_)
					    & ~0xff00ff)
					   + (((i_333_ & 0xff00) * i_334_
					       + (i_338_ & 0xff00) * i_335_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_298_ == 2) {
				if (i_297_ == 1) {
				    int i_339_ = ((bp) this).H[i_294_];
				    int i_340_ = is_296_[i_295_];
				    int i_341_ = i_339_ + i_340_;
				    int i_342_ = ((i_339_ & 0xff00ff)
						  + (i_340_ & 0xff00ff));
				    i_340_ = ((i_342_ & 0x1000100)
					      + (i_341_ - i_342_ & 0x10000));
				    is_296_[i_295_]
					= i_341_ - i_340_ | i_340_ - (i_340_
								      >>> 8);
				} else if (i_297_ == 0) {
				    int i_343_ = ((bp) this).H[i_294_];
				    int i_344_ = ((i_343_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_345_
					= (i_343_ & 0xff00) * qp.g & 0xff0000;
				    int i_346_
					= (i_343_ & 0xff) * qp.A & 0xff00;
				    i_343_ = (i_344_ | i_345_ | i_346_) >>> 8;
				    int i_347_ = is_296_[i_295_];
				    int i_348_ = i_343_ + i_347_;
				    int i_349_ = ((i_343_ & 0xff00ff)
						  + (i_347_ & 0xff00ff));
				    i_347_ = ((i_349_ & 0x1000100)
					      + (i_348_ - i_349_ & 0x10000));
				    is_296_[i_295_]
					= i_348_ - i_347_ | i_347_ - (i_347_
								      >>> 8);
				} else if (i_297_ == 3) {
				    int i_350_ = ((bp) this).H[i_294_];
				    int i_351_ = qp.w;
				    int i_352_ = i_350_ + i_351_;
				    int i_353_ = ((i_350_ & 0xff00ff)
						  + (i_351_ & 0xff00ff));
				    int i_354_
					= ((i_353_ & 0x1000100)
					   + (i_352_ - i_353_ & 0x10000));
				    i_350_
					= i_352_ - i_354_ | i_354_ - (i_354_
								      >>> 8);
				    i_354_ = is_296_[i_295_];
				    i_352_ = i_350_ + i_354_;
				    i_353_
					= (i_350_ & 0xff00ff) + (i_354_
								 & 0xff00ff);
				    i_354_ = ((i_353_ & 0x1000100)
					      + (i_352_ - i_353_ & 0x10000));
				    is_296_[i_295_]
					= i_352_ - i_354_ | i_354_ - (i_354_
								      >>> 8);
				} else if (i_297_ == 2) {
				    int i_355_ = ((bp) this).H[i_294_];
				    int i_356_ = ((i_355_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_357_
					= (i_355_ & 0xff00) * qp.D & 0xff0000;
				    i_355_ = ((i_356_ | i_357_) >>> 8) + qp.j;
				    int i_358_ = is_296_[i_295_];
				    int i_359_ = i_355_ + i_358_;
				    int i_360_ = ((i_355_ & 0xff00ff)
						  + (i_358_ & 0xff00ff));
				    i_358_ = ((i_360_ & 0x1000100)
					      + (i_359_ - i_360_ & 0x10000));
				    is_296_[i_295_]
					= i_359_ - i_358_ | i_358_ - (i_358_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			    i_290_ += qp.n;
			}
		    }
		    i_287_++;
		    qp.B += qp.m;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.h < 0) {
	    if (qp.n == 0) {
		int i_361_ = qp.F;
		while (i_361_ < 0) {
		    int i_362_ = qp.v;
		    int i_363_ = qp.B + qp.a;
		    int i_364_ = qp.z;
		    int i_365_ = qp.y;
		    if (i_364_ >= 0 && i_364_ - (((qp) this).o << 12) < 0) {
			int i_366_;
			if ((i_366_ = i_363_ - (((qp) this).k << 12)) >= 0) {
			    i_366_ = (qp.h - i_366_) / qp.h;
			    i_365_ += i_366_;
			    i_363_ += qp.h * i_366_;
			    i_362_ += i_366_;
			}
			if ((i_366_ = (i_363_ - qp.h) / qp.h) > i_365_)
			    i_365_ = i_366_;
			for (/**/; i_365_ < 0; i_365_++) {
			    int i_367_ = ((i_364_ >> 12) * ((qp) this).k
					  + (i_363_ >> 12));
			    int i_368_ = i_362_++;
			    int[] is_369_ = is;
			    int i_370_ = i;
			    int i_371_ = i_141_;
			    if (i_371_ == 0) {
				if (i_370_ == 1)
				    is_369_[i_368_] = ((bp) this).H[i_367_];
				else if (i_370_ == 0) {
				    int i_372_ = ((bp) this).H[i_367_++];
				    int i_373_ = ((i_372_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_374_
					= (i_372_ & 0xff00) * qp.g & 0xff0000;
				    int i_375_
					= (i_372_ & 0xff) * qp.A & 0xff00;
				    is_369_[i_368_]
					= (i_373_ | i_374_ | i_375_) >>> 8;
				} else if (i_370_ == 3) {
				    int i_376_ = ((bp) this).H[i_367_++];
				    int i_377_ = qp.w;
				    int i_378_ = i_376_ + i_377_;
				    int i_379_ = ((i_376_ & 0xff00ff)
						  + (i_377_ & 0xff00ff));
				    int i_380_
					= ((i_379_ & 0x1000100)
					   + (i_378_ - i_379_ & 0x10000));
				    is_369_[i_368_]
					= i_378_ - i_380_ | i_380_ - (i_380_
								      >>> 8);
				} else if (i_370_ == 2) {
				    int i_381_ = ((bp) this).H[i_367_];
				    int i_382_ = ((i_381_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_383_
					= (i_381_ & 0xff00) * qp.D & 0xff0000;
				    is_369_[i_368_]
					= ((i_382_ | i_383_) >>> 8) + qp.j;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_371_ == 1) {
				if (i_370_ == 1) {
				    int i_384_ = ((bp) this).H[i_367_];
				    int i_385_ = i_384_ >>> 24;
				    int i_386_ = 256 - i_385_;
				    int i_387_ = is_369_[i_368_];
				    is_369_[i_368_]
					= ((((i_384_ & 0xff00ff) * i_385_
					     + (i_387_ & 0xff00ff) * i_386_)
					    & ~0xff00ff)
					   + (((i_384_ & 0xff00) * i_385_
					       + (i_387_ & 0xff00) * i_386_)
					      & 0xff0000)) >> 8;
				} else if (i_370_ == 0) {
				    int i_388_ = ((bp) this).H[i_367_];
				    int i_389_ = (i_388_ >>> 24) * qp.D >> 8;
				    int i_390_ = 256 - i_389_;
				    if ((qp.w & 0xffffff) == 16777215) {
					int i_391_ = is_369_[i_368_];
					is_369_[i_368_]
					    = ((((i_388_ & 0xff00ff) * i_389_
						 + ((i_391_ & 0xff00ff)
						    * i_390_))
						& ~0xff00ff)
					       + (((i_388_ & 0xff00) * i_389_
						   + ((i_391_ & 0xff00)
						      * i_390_))
						  & 0xff0000)) >> 8;
				    } else if (i_389_ != 255) {
					int i_392_
					    = ((i_388_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_393_ = ((i_388_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_394_
					    = (i_388_ & 0xff) * qp.A & 0xff00;
					i_388_
					    = (i_392_ | i_393_ | i_394_) >>> 8;
					int i_395_ = is_369_[i_368_];
					is_369_[i_368_]
					    = ((((i_388_ & 0xff00ff) * i_389_
						 + ((i_395_ & 0xff00ff)
						    * i_390_))
						& ~0xff00ff)
					       + (((i_388_ & 0xff00) * i_389_
						   + ((i_395_ & 0xff00)
						      * i_390_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_396_
					    = ((i_388_ & 0xff0000) * qp.l
					       & ~0xffffff);
					int i_397_ = ((i_388_ & 0xff00) * qp.g
						      & 0xff0000);
					int i_398_
					    = (i_388_ & 0xff) * qp.A & 0xff00;
					is_369_[i_368_]
					    = (i_396_ | i_397_ | i_398_) >>> 8;
				    }
				} else if (i_370_ == 3) {
				    int i_399_ = ((bp) this).H[i_367_];
				    int i_400_ = qp.w;
				    int i_401_ = i_399_ + i_400_;
				    int i_402_ = ((i_399_ & 0xff00ff)
						  + (i_400_ & 0xff00ff));
				    int i_403_
					= ((i_402_ & 0x1000100)
					   + (i_401_ - i_402_ & 0x10000));
				    i_403_
					= i_401_ - i_403_ | i_403_ - (i_403_
								      >>> 8);
				    int i_404_ = (i_399_ >>> 24) * qp.D >> 8;
				    int i_405_ = 256 - i_404_;
				    if (i_404_ != 255) {
					i_399_ = i_403_;
					i_403_ = is_369_[i_368_];
					i_403_
					    = ((((i_399_ & 0xff00ff) * i_404_
						 + ((i_403_ & 0xff00ff)
						    * i_405_))
						& ~0xff00ff)
					       + (((i_399_ & 0xff00) * i_404_
						   + ((i_403_ & 0xff00)
						      * i_405_))
						  & 0xff0000)) >> 8;
				    }
				    is_369_[i_368_] = i_403_;
				} else if (i_370_ == 2) {
				    int i_406_ = ((bp) this).H[i_367_];
				    int i_407_ = i_406_ >>> 24;
				    int i_408_ = 256 - i_407_;
				    int i_409_ = ((i_406_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_410_
					= (i_406_ & 0xff00) * qp.D & 0xff0000;
				    i_406_ = ((i_409_ | i_410_) >>> 8) + qp.j;
				    int i_411_ = is_369_[i_368_];
				    is_369_[i_368_]
					= ((((i_406_ & 0xff00ff) * i_407_
					     + (i_411_ & 0xff00ff) * i_408_)
					    & ~0xff00ff)
					   + (((i_406_ & 0xff00) * i_407_
					       + (i_411_ & 0xff00) * i_408_)
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (i_371_ == 2) {
				if (i_370_ == 1) {
				    int i_412_ = ((bp) this).H[i_367_];
				    int i_413_ = is_369_[i_368_];
				    int i_414_ = i_412_ + i_413_;
				    int i_415_ = ((i_412_ & 0xff00ff)
						  + (i_413_ & 0xff00ff));
				    i_413_ = ((i_415_ & 0x1000100)
					      + (i_414_ - i_415_ & 0x10000));
				    is_369_[i_368_]
					= i_414_ - i_413_ | i_413_ - (i_413_
								      >>> 8);
				} else if (i_370_ == 0) {
				    int i_416_ = ((bp) this).H[i_367_];
				    int i_417_ = ((i_416_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_418_
					= (i_416_ & 0xff00) * qp.g & 0xff0000;
				    int i_419_
					= (i_416_ & 0xff) * qp.A & 0xff00;
				    i_416_ = (i_417_ | i_418_ | i_419_) >>> 8;
				    int i_420_ = is_369_[i_368_];
				    int i_421_ = i_416_ + i_420_;
				    int i_422_ = ((i_416_ & 0xff00ff)
						  + (i_420_ & 0xff00ff));
				    i_420_ = ((i_422_ & 0x1000100)
					      + (i_421_ - i_422_ & 0x10000));
				    is_369_[i_368_]
					= i_421_ - i_420_ | i_420_ - (i_420_
								      >>> 8);
				} else if (i_370_ == 3) {
				    int i_423_ = ((bp) this).H[i_367_];
				    int i_424_ = qp.w;
				    int i_425_ = i_423_ + i_424_;
				    int i_426_ = ((i_423_ & 0xff00ff)
						  + (i_424_ & 0xff00ff));
				    int i_427_
					= ((i_426_ & 0x1000100)
					   + (i_425_ - i_426_ & 0x10000));
				    i_423_
					= i_425_ - i_427_ | i_427_ - (i_427_
								      >>> 8);
				    i_427_ = is_369_[i_368_];
				    i_425_ = i_423_ + i_427_;
				    i_426_
					= (i_423_ & 0xff00ff) + (i_427_
								 & 0xff00ff);
				    i_427_ = ((i_426_ & 0x1000100)
					      + (i_425_ - i_426_ & 0x10000));
				    is_369_[i_368_]
					= i_425_ - i_427_ | i_427_ - (i_427_
								      >>> 8);
				} else if (i_370_ == 2) {
				    int i_428_ = ((bp) this).H[i_367_];
				    int i_429_ = ((i_428_ & 0xff00ff) * qp.D
						  & ~0xff00ff);
				    int i_430_
					= (i_428_ & 0xff00) * qp.D & 0xff0000;
				    i_428_ = ((i_429_ | i_430_) >>> 8) + qp.j;
				    int i_431_ = is_369_[i_368_];
				    int i_432_ = i_428_ + i_431_;
				    int i_433_ = ((i_428_ & 0xff00ff)
						  + (i_431_ & 0xff00ff));
				    i_431_ = ((i_433_ & 0x1000100)
					      + (i_432_ - i_433_ & 0x10000));
				    is_369_[i_368_]
					= i_432_ - i_431_ | i_431_ - (i_431_
								      >>> 8);
				}
			    } else
				throw new IllegalArgumentException();
			    i_363_ += qp.h;
			}
		    }
		    i_361_++;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else if (qp.n < 0) {
		int i_434_ = qp.F;
		while (i_434_ < 0) {
		    int i_435_ = qp.v;
		    int i_436_ = qp.B + qp.a;
		    int i_437_ = qp.z + qp.c;
		    int i_438_ = qp.y;
		    int i_439_;
		    if ((i_439_ = i_436_ - (((qp) this).k << 12)) >= 0) {
			i_439_ = (qp.h - i_439_) / qp.h;
			i_438_ += i_439_;
			i_436_ += qp.h * i_439_;
			i_437_ += qp.n * i_439_;
			i_435_ += i_439_;
		    }
		    if ((i_439_ = (i_436_ - qp.h) / qp.h) > i_438_)
			i_438_ = i_439_;
		    if ((i_439_ = i_437_ - (((qp) this).o << 12)) >= 0) {
			i_439_ = (qp.n - i_439_) / qp.n;
			i_438_ += i_439_;
			i_436_ += qp.h * i_439_;
			i_437_ += qp.n * i_439_;
			i_435_ += i_439_;
		    }
		    if ((i_439_ = (i_437_ - qp.n) / qp.n) > i_438_)
			i_438_ = i_439_;
		    for (/**/; i_438_ < 0; i_438_++) {
			int i_440_
			    = (i_437_ >> 12) * ((qp) this).k + (i_436_ >> 12);
			int i_441_ = i_435_++;
			int[] is_442_ = is;
			int i_443_ = i;
			int i_444_ = i_141_;
			if (i_444_ == 0) {
			    if (i_443_ == 1)
				is_442_[i_441_] = ((bp) this).H[i_440_];
			    else if (i_443_ == 0) {
				int i_445_ = ((bp) this).H[i_440_++];
				int i_446_
				    = (i_445_ & 0xff0000) * qp.l & ~0xffffff;
				int i_447_
				    = (i_445_ & 0xff00) * qp.g & 0xff0000;
				int i_448_ = (i_445_ & 0xff) * qp.A & 0xff00;
				is_442_[i_441_]
				    = (i_446_ | i_447_ | i_448_) >>> 8;
			    } else if (i_443_ == 3) {
				int i_449_ = ((bp) this).H[i_440_++];
				int i_450_ = qp.w;
				int i_451_ = i_449_ + i_450_;
				int i_452_ = ((i_449_ & 0xff00ff)
					      + (i_450_ & 0xff00ff));
				int i_453_ = ((i_452_ & 0x1000100)
					      + (i_451_ - i_452_ & 0x10000));
				is_442_[i_441_]
				    = i_451_ - i_453_ | i_453_ - (i_453_
								  >>> 8);
			    } else if (i_443_ == 2) {
				int i_454_ = ((bp) this).H[i_440_];
				int i_455_
				    = (i_454_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_456_
				    = (i_454_ & 0xff00) * qp.D & 0xff0000;
				is_442_[i_441_]
				    = ((i_455_ | i_456_) >>> 8) + qp.j;
			    } else
				throw new IllegalArgumentException();
			} else if (i_444_ == 1) {
			    if (i_443_ == 1) {
				int i_457_ = ((bp) this).H[i_440_];
				int i_458_ = i_457_ >>> 24;
				int i_459_ = 256 - i_458_;
				int i_460_ = is_442_[i_441_];
				is_442_[i_441_]
				    = ((((i_457_ & 0xff00ff) * i_458_
					 + (i_460_ & 0xff00ff) * i_459_)
					& ~0xff00ff)
				       + (((i_457_ & 0xff00) * i_458_
					   + (i_460_ & 0xff00) * i_459_)
					  & 0xff0000)) >> 8;
			    } else if (i_443_ == 0) {
				int i_461_ = ((bp) this).H[i_440_];
				int i_462_ = (i_461_ >>> 24) * qp.D >> 8;
				int i_463_ = 256 - i_462_;
				if ((qp.w & 0xffffff) == 16777215) {
				    int i_464_ = is_442_[i_441_];
				    is_442_[i_441_]
					= ((((i_461_ & 0xff00ff) * i_462_
					     + (i_464_ & 0xff00ff) * i_463_)
					    & ~0xff00ff)
					   + (((i_461_ & 0xff00) * i_462_
					       + (i_464_ & 0xff00) * i_463_)
					      & 0xff0000)) >> 8;
				} else if (i_462_ != 255) {
				    int i_465_ = ((i_461_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_466_
					= (i_461_ & 0xff00) * qp.g & 0xff0000;
				    int i_467_
					= (i_461_ & 0xff) * qp.A & 0xff00;
				    i_461_ = (i_465_ | i_466_ | i_467_) >>> 8;
				    int i_468_ = is_442_[i_441_];
				    is_442_[i_441_]
					= ((((i_461_ & 0xff00ff) * i_462_
					     + (i_468_ & 0xff00ff) * i_463_)
					    & ~0xff00ff)
					   + (((i_461_ & 0xff00) * i_462_
					       + (i_468_ & 0xff00) * i_463_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_469_ = ((i_461_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_470_
					= (i_461_ & 0xff00) * qp.g & 0xff0000;
				    int i_471_
					= (i_461_ & 0xff) * qp.A & 0xff00;
				    is_442_[i_441_]
					= (i_469_ | i_470_ | i_471_) >>> 8;
				}
			    } else if (i_443_ == 3) {
				int i_472_ = ((bp) this).H[i_440_];
				int i_473_ = qp.w;
				int i_474_ = i_472_ + i_473_;
				int i_475_ = ((i_472_ & 0xff00ff)
					      + (i_473_ & 0xff00ff));
				int i_476_ = ((i_475_ & 0x1000100)
					      + (i_474_ - i_475_ & 0x10000));
				i_476_ = i_474_ - i_476_ | i_476_ - (i_476_
								     >>> 8);
				int i_477_ = (i_472_ >>> 24) * qp.D >> 8;
				int i_478_ = 256 - i_477_;
				if (i_477_ != 255) {
				    i_472_ = i_476_;
				    i_476_ = is_442_[i_441_];
				    i_476_ = ((((i_472_ & 0xff00ff) * i_477_
						+ (i_476_ & 0xff00ff) * i_478_)
					       & ~0xff00ff)
					      + (((i_472_ & 0xff00) * i_477_
						  + (i_476_ & 0xff00) * i_478_)
						 & 0xff0000)) >> 8;
				}
				is_442_[i_441_] = i_476_;
			    } else if (i_443_ == 2) {
				int i_479_ = ((bp) this).H[i_440_];
				int i_480_ = i_479_ >>> 24;
				int i_481_ = 256 - i_480_;
				int i_482_
				    = (i_479_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_483_
				    = (i_479_ & 0xff00) * qp.D & 0xff0000;
				i_479_ = ((i_482_ | i_483_) >>> 8) + qp.j;
				int i_484_ = is_442_[i_441_];
				is_442_[i_441_]
				    = ((((i_479_ & 0xff00ff) * i_480_
					 + (i_484_ & 0xff00ff) * i_481_)
					& ~0xff00ff)
				       + (((i_479_ & 0xff00) * i_480_
					   + (i_484_ & 0xff00) * i_481_)
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (i_444_ == 2) {
			    if (i_443_ == 1) {
				int i_485_ = ((bp) this).H[i_440_];
				int i_486_ = is_442_[i_441_];
				int i_487_ = i_485_ + i_486_;
				int i_488_ = ((i_485_ & 0xff00ff)
					      + (i_486_ & 0xff00ff));
				i_486_
				    = (i_488_ & 0x1000100) + (i_487_ - i_488_
							      & 0x10000);
				is_442_[i_441_]
				    = i_487_ - i_486_ | i_486_ - (i_486_
								  >>> 8);
			    } else if (i_443_ == 0) {
				int i_489_ = ((bp) this).H[i_440_];
				int i_490_
				    = (i_489_ & 0xff0000) * qp.l & ~0xffffff;
				int i_491_
				    = (i_489_ & 0xff00) * qp.g & 0xff0000;
				int i_492_ = (i_489_ & 0xff) * qp.A & 0xff00;
				i_489_ = (i_490_ | i_491_ | i_492_) >>> 8;
				int i_493_ = is_442_[i_441_];
				int i_494_ = i_489_ + i_493_;
				int i_495_ = ((i_489_ & 0xff00ff)
					      + (i_493_ & 0xff00ff));
				i_493_
				    = (i_495_ & 0x1000100) + (i_494_ - i_495_
							      & 0x10000);
				is_442_[i_441_]
				    = i_494_ - i_493_ | i_493_ - (i_493_
								  >>> 8);
			    } else if (i_443_ == 3) {
				int i_496_ = ((bp) this).H[i_440_];
				int i_497_ = qp.w;
				int i_498_ = i_496_ + i_497_;
				int i_499_ = ((i_496_ & 0xff00ff)
					      + (i_497_ & 0xff00ff));
				int i_500_ = ((i_499_ & 0x1000100)
					      + (i_498_ - i_499_ & 0x10000));
				i_496_ = i_498_ - i_500_ | i_500_ - (i_500_
								     >>> 8);
				i_500_ = is_442_[i_441_];
				i_498_ = i_496_ + i_500_;
				i_499_ = (i_496_ & 0xff00ff) + (i_500_
								& 0xff00ff);
				i_500_
				    = (i_499_ & 0x1000100) + (i_498_ - i_499_
							      & 0x10000);
				is_442_[i_441_]
				    = i_498_ - i_500_ | i_500_ - (i_500_
								  >>> 8);
			    } else if (i_443_ == 2) {
				int i_501_ = ((bp) this).H[i_440_];
				int i_502_
				    = (i_501_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_503_
				    = (i_501_ & 0xff00) * qp.D & 0xff0000;
				i_501_ = ((i_502_ | i_503_) >>> 8) + qp.j;
				int i_504_ = is_442_[i_441_];
				int i_505_ = i_501_ + i_504_;
				int i_506_ = ((i_501_ & 0xff00ff)
					      + (i_504_ & 0xff00ff));
				i_504_
				    = (i_506_ & 0x1000100) + (i_505_ - i_506_
							      & 0x10000);
				is_442_[i_441_]
				    = i_505_ - i_504_ | i_504_ - (i_504_
								  >>> 8);
			    }
			} else
			    throw new IllegalArgumentException();
			i_436_ += qp.h;
			i_437_ += qp.n;
		    }
		    i_434_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    } else {
		int i_507_ = qp.F;
		while (i_507_ < 0) {
		    int i_508_ = qp.v;
		    int i_509_ = qp.B + qp.a;
		    int i_510_ = qp.z + qp.c;
		    int i_511_ = qp.y;
		    int i_512_;
		    if ((i_512_ = i_509_ - (((qp) this).k << 12)) >= 0) {
			i_512_ = (qp.h - i_512_) / qp.h;
			i_511_ += i_512_;
			i_509_ += qp.h * i_512_;
			i_510_ += qp.n * i_512_;
			i_508_ += i_512_;
		    }
		    if ((i_512_ = (i_509_ - qp.h) / qp.h) > i_511_)
			i_511_ = i_512_;
		    if (i_510_ < 0) {
			i_512_ = (qp.n - 1 - i_510_) / qp.n;
			i_511_ += i_512_;
			i_509_ += qp.h * i_512_;
			i_510_ += qp.n * i_512_;
			i_508_ += i_512_;
		    }
		    if ((i_512_
			 = (i_510_ + 1 - (((qp) this).o << 12) - qp.n) / qp.n)
			> i_511_)
			i_511_ = i_512_;
		    for (/**/; i_511_ < 0; i_511_++) {
			int i_513_
			    = (i_510_ >> 12) * ((qp) this).k + (i_509_ >> 12);
			int i_514_ = i_508_++;
			int[] is_515_ = is;
			int i_516_ = i;
			int i_517_ = i_141_;
			if (i_517_ == 0) {
			    if (i_516_ == 1)
				is_515_[i_514_] = ((bp) this).H[i_513_];
			    else if (i_516_ == 0) {
				int i_518_ = ((bp) this).H[i_513_++];
				int i_519_
				    = (i_518_ & 0xff0000) * qp.l & ~0xffffff;
				int i_520_
				    = (i_518_ & 0xff00) * qp.g & 0xff0000;
				int i_521_ = (i_518_ & 0xff) * qp.A & 0xff00;
				is_515_[i_514_]
				    = (i_519_ | i_520_ | i_521_) >>> 8;
			    } else if (i_516_ == 3) {
				int i_522_ = ((bp) this).H[i_513_++];
				int i_523_ = qp.w;
				int i_524_ = i_522_ + i_523_;
				int i_525_ = ((i_522_ & 0xff00ff)
					      + (i_523_ & 0xff00ff));
				int i_526_ = ((i_525_ & 0x1000100)
					      + (i_524_ - i_525_ & 0x10000));
				is_515_[i_514_]
				    = i_524_ - i_526_ | i_526_ - (i_526_
								  >>> 8);
			    } else if (i_516_ == 2) {
				int i_527_ = ((bp) this).H[i_513_];
				int i_528_
				    = (i_527_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_529_
				    = (i_527_ & 0xff00) * qp.D & 0xff0000;
				is_515_[i_514_]
				    = ((i_528_ | i_529_) >>> 8) + qp.j;
			    } else
				throw new IllegalArgumentException();
			} else if (i_517_ == 1) {
			    if (i_516_ == 1) {
				int i_530_ = ((bp) this).H[i_513_];
				int i_531_ = i_530_ >>> 24;
				int i_532_ = 256 - i_531_;
				int i_533_ = is_515_[i_514_];
				is_515_[i_514_]
				    = ((((i_530_ & 0xff00ff) * i_531_
					 + (i_533_ & 0xff00ff) * i_532_)
					& ~0xff00ff)
				       + (((i_530_ & 0xff00) * i_531_
					   + (i_533_ & 0xff00) * i_532_)
					  & 0xff0000)) >> 8;
			    } else if (i_516_ == 0) {
				int i_534_ = ((bp) this).H[i_513_];
				int i_535_ = (i_534_ >>> 24) * qp.D >> 8;
				int i_536_ = 256 - i_535_;
				if ((qp.w & 0xffffff) == 16777215) {
				    int i_537_ = is_515_[i_514_];
				    is_515_[i_514_]
					= ((((i_534_ & 0xff00ff) * i_535_
					     + (i_537_ & 0xff00ff) * i_536_)
					    & ~0xff00ff)
					   + (((i_534_ & 0xff00) * i_535_
					       + (i_537_ & 0xff00) * i_536_)
					      & 0xff0000)) >> 8;
				} else if (i_535_ != 255) {
				    int i_538_ = ((i_534_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_539_
					= (i_534_ & 0xff00) * qp.g & 0xff0000;
				    int i_540_
					= (i_534_ & 0xff) * qp.A & 0xff00;
				    i_534_ = (i_538_ | i_539_ | i_540_) >>> 8;
				    int i_541_ = is_515_[i_514_];
				    is_515_[i_514_]
					= ((((i_534_ & 0xff00ff) * i_535_
					     + (i_541_ & 0xff00ff) * i_536_)
					    & ~0xff00ff)
					   + (((i_534_ & 0xff00) * i_535_
					       + (i_541_ & 0xff00) * i_536_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_542_ = ((i_534_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_543_
					= (i_534_ & 0xff00) * qp.g & 0xff0000;
				    int i_544_
					= (i_534_ & 0xff) * qp.A & 0xff00;
				    is_515_[i_514_]
					= (i_542_ | i_543_ | i_544_) >>> 8;
				}
			    } else if (i_516_ == 3) {
				int i_545_ = ((bp) this).H[i_513_];
				int i_546_ = qp.w;
				int i_547_ = i_545_ + i_546_;
				int i_548_ = ((i_545_ & 0xff00ff)
					      + (i_546_ & 0xff00ff));
				int i_549_ = ((i_548_ & 0x1000100)
					      + (i_547_ - i_548_ & 0x10000));
				i_549_ = i_547_ - i_549_ | i_549_ - (i_549_
								     >>> 8);
				int i_550_ = (i_545_ >>> 24) * qp.D >> 8;
				int i_551_ = 256 - i_550_;
				if (i_550_ != 255) {
				    i_545_ = i_549_;
				    i_549_ = is_515_[i_514_];
				    i_549_ = ((((i_545_ & 0xff00ff) * i_550_
						+ (i_549_ & 0xff00ff) * i_551_)
					       & ~0xff00ff)
					      + (((i_545_ & 0xff00) * i_550_
						  + (i_549_ & 0xff00) * i_551_)
						 & 0xff0000)) >> 8;
				}
				is_515_[i_514_] = i_549_;
			    } else if (i_516_ == 2) {
				int i_552_ = ((bp) this).H[i_513_];
				int i_553_ = i_552_ >>> 24;
				int i_554_ = 256 - i_553_;
				int i_555_
				    = (i_552_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_556_
				    = (i_552_ & 0xff00) * qp.D & 0xff0000;
				i_552_ = ((i_555_ | i_556_) >>> 8) + qp.j;
				int i_557_ = is_515_[i_514_];
				is_515_[i_514_]
				    = ((((i_552_ & 0xff00ff) * i_553_
					 + (i_557_ & 0xff00ff) * i_554_)
					& ~0xff00ff)
				       + (((i_552_ & 0xff00) * i_553_
					   + (i_557_ & 0xff00) * i_554_)
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (i_517_ == 2) {
			    if (i_516_ == 1) {
				int i_558_ = ((bp) this).H[i_513_];
				int i_559_ = is_515_[i_514_];
				int i_560_ = i_558_ + i_559_;
				int i_561_ = ((i_558_ & 0xff00ff)
					      + (i_559_ & 0xff00ff));
				i_559_
				    = (i_561_ & 0x1000100) + (i_560_ - i_561_
							      & 0x10000);
				is_515_[i_514_]
				    = i_560_ - i_559_ | i_559_ - (i_559_
								  >>> 8);
			    } else if (i_516_ == 0) {
				int i_562_ = ((bp) this).H[i_513_];
				int i_563_
				    = (i_562_ & 0xff0000) * qp.l & ~0xffffff;
				int i_564_
				    = (i_562_ & 0xff00) * qp.g & 0xff0000;
				int i_565_ = (i_562_ & 0xff) * qp.A & 0xff00;
				i_562_ = (i_563_ | i_564_ | i_565_) >>> 8;
				int i_566_ = is_515_[i_514_];
				int i_567_ = i_562_ + i_566_;
				int i_568_ = ((i_562_ & 0xff00ff)
					      + (i_566_ & 0xff00ff));
				i_566_
				    = (i_568_ & 0x1000100) + (i_567_ - i_568_
							      & 0x10000);
				is_515_[i_514_]
				    = i_567_ - i_566_ | i_566_ - (i_566_
								  >>> 8);
			    } else if (i_516_ == 3) {
				int i_569_ = ((bp) this).H[i_513_];
				int i_570_ = qp.w;
				int i_571_ = i_569_ + i_570_;
				int i_572_ = ((i_569_ & 0xff00ff)
					      + (i_570_ & 0xff00ff));
				int i_573_ = ((i_572_ & 0x1000100)
					      + (i_571_ - i_572_ & 0x10000));
				i_569_ = i_571_ - i_573_ | i_573_ - (i_573_
								     >>> 8);
				i_573_ = is_515_[i_514_];
				i_571_ = i_569_ + i_573_;
				i_572_ = (i_569_ & 0xff00ff) + (i_573_
								& 0xff00ff);
				i_573_
				    = (i_572_ & 0x1000100) + (i_571_ - i_572_
							      & 0x10000);
				is_515_[i_514_]
				    = i_571_ - i_573_ | i_573_ - (i_573_
								  >>> 8);
			    } else if (i_516_ == 2) {
				int i_574_ = ((bp) this).H[i_513_];
				int i_575_
				    = (i_574_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_576_
				    = (i_574_ & 0xff00) * qp.D & 0xff0000;
				i_574_ = ((i_575_ | i_576_) >>> 8) + qp.j;
				int i_577_ = is_515_[i_514_];
				int i_578_ = i_574_ + i_577_;
				int i_579_ = ((i_574_ & 0xff00ff)
					      + (i_577_ & 0xff00ff));
				i_577_
				    = (i_579_ & 0x1000100) + (i_578_ - i_579_
							      & 0x10000);
				is_515_[i_514_]
				    = i_578_ - i_577_ | i_577_ - (i_577_
								  >>> 8);
			    }
			} else
			    throw new IllegalArgumentException();
			i_509_ += qp.h;
			i_510_ += qp.n;
		    }
		    i_507_++;
		    qp.B += qp.m;
		    qp.z += qp.G;
		    qp.v += qp.u;
		}
	    }
	} else if (qp.n == 0) {
	    int i_580_ = qp.F;
	    while (i_580_ < 0) {
		int i_581_ = qp.v;
		int i_582_ = qp.B + qp.a;
		int i_583_ = qp.z;
		int i_584_ = qp.y;
		if (i_583_ >= 0 && i_583_ - (((qp) this).o << 12) < 0) {
		    if (i_582_ < 0) {
			int i_585_ = (qp.h - 1 - i_582_) / qp.h;
			i_584_ += i_585_;
			i_582_ += qp.h * i_585_;
			i_581_ += i_585_;
		    }
		    int i_586_;
		    if ((i_586_
			 = (i_582_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
			> i_584_)
			i_584_ = i_586_;
		    for (/**/; i_584_ < 0; i_584_++) {
			int i_587_
			    = (i_583_ >> 12) * ((qp) this).k + (i_582_ >> 12);
			int i_588_ = i_581_++;
			int[] is_589_ = is;
			int i_590_ = i;
			int i_591_ = i_141_;
			if (i_591_ == 0) {
			    if (i_590_ == 1)
				is_589_[i_588_] = ((bp) this).H[i_587_];
			    else if (i_590_ == 0) {
				int i_592_ = ((bp) this).H[i_587_++];
				int i_593_
				    = (i_592_ & 0xff0000) * qp.l & ~0xffffff;
				int i_594_
				    = (i_592_ & 0xff00) * qp.g & 0xff0000;
				int i_595_ = (i_592_ & 0xff) * qp.A & 0xff00;
				is_589_[i_588_]
				    = (i_593_ | i_594_ | i_595_) >>> 8;
			    } else if (i_590_ == 3) {
				int i_596_ = ((bp) this).H[i_587_++];
				int i_597_ = qp.w;
				int i_598_ = i_596_ + i_597_;
				int i_599_ = ((i_596_ & 0xff00ff)
					      + (i_597_ & 0xff00ff));
				int i_600_ = ((i_599_ & 0x1000100)
					      + (i_598_ - i_599_ & 0x10000));
				is_589_[i_588_]
				    = i_598_ - i_600_ | i_600_ - (i_600_
								  >>> 8);
			    } else if (i_590_ == 2) {
				int i_601_ = ((bp) this).H[i_587_];
				int i_602_
				    = (i_601_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_603_
				    = (i_601_ & 0xff00) * qp.D & 0xff0000;
				is_589_[i_588_]
				    = ((i_602_ | i_603_) >>> 8) + qp.j;
			    } else
				throw new IllegalArgumentException();
			} else if (i_591_ == 1) {
			    if (i_590_ == 1) {
				int i_604_ = ((bp) this).H[i_587_];
				int i_605_ = i_604_ >>> 24;
				int i_606_ = 256 - i_605_;
				int i_607_ = is_589_[i_588_];
				is_589_[i_588_]
				    = ((((i_604_ & 0xff00ff) * i_605_
					 + (i_607_ & 0xff00ff) * i_606_)
					& ~0xff00ff)
				       + (((i_604_ & 0xff00) * i_605_
					   + (i_607_ & 0xff00) * i_606_)
					  & 0xff0000)) >> 8;
			    } else if (i_590_ == 0) {
				int i_608_ = ((bp) this).H[i_587_];
				int i_609_ = (i_608_ >>> 24) * qp.D >> 8;
				int i_610_ = 256 - i_609_;
				if ((qp.w & 0xffffff) == 16777215) {
				    int i_611_ = is_589_[i_588_];
				    is_589_[i_588_]
					= ((((i_608_ & 0xff00ff) * i_609_
					     + (i_611_ & 0xff00ff) * i_610_)
					    & ~0xff00ff)
					   + (((i_608_ & 0xff00) * i_609_
					       + (i_611_ & 0xff00) * i_610_)
					      & 0xff0000)) >> 8;
				} else if (i_609_ != 255) {
				    int i_612_ = ((i_608_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_613_
					= (i_608_ & 0xff00) * qp.g & 0xff0000;
				    int i_614_
					= (i_608_ & 0xff) * qp.A & 0xff00;
				    i_608_ = (i_612_ | i_613_ | i_614_) >>> 8;
				    int i_615_ = is_589_[i_588_];
				    is_589_[i_588_]
					= ((((i_608_ & 0xff00ff) * i_609_
					     + (i_615_ & 0xff00ff) * i_610_)
					    & ~0xff00ff)
					   + (((i_608_ & 0xff00) * i_609_
					       + (i_615_ & 0xff00) * i_610_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_616_ = ((i_608_ & 0xff0000) * qp.l
						  & ~0xffffff);
				    int i_617_
					= (i_608_ & 0xff00) * qp.g & 0xff0000;
				    int i_618_
					= (i_608_ & 0xff) * qp.A & 0xff00;
				    is_589_[i_588_]
					= (i_616_ | i_617_ | i_618_) >>> 8;
				}
			    } else if (i_590_ == 3) {
				int i_619_ = ((bp) this).H[i_587_];
				int i_620_ = qp.w;
				int i_621_ = i_619_ + i_620_;
				int i_622_ = ((i_619_ & 0xff00ff)
					      + (i_620_ & 0xff00ff));
				int i_623_ = ((i_622_ & 0x1000100)
					      + (i_621_ - i_622_ & 0x10000));
				i_623_ = i_621_ - i_623_ | i_623_ - (i_623_
								     >>> 8);
				int i_624_ = (i_619_ >>> 24) * qp.D >> 8;
				int i_625_ = 256 - i_624_;
				if (i_624_ != 255) {
				    i_619_ = i_623_;
				    i_623_ = is_589_[i_588_];
				    i_623_ = ((((i_619_ & 0xff00ff) * i_624_
						+ (i_623_ & 0xff00ff) * i_625_)
					       & ~0xff00ff)
					      + (((i_619_ & 0xff00) * i_624_
						  + (i_623_ & 0xff00) * i_625_)
						 & 0xff0000)) >> 8;
				}
				is_589_[i_588_] = i_623_;
			    } else if (i_590_ == 2) {
				int i_626_ = ((bp) this).H[i_587_];
				int i_627_ = i_626_ >>> 24;
				int i_628_ = 256 - i_627_;
				int i_629_
				    = (i_626_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_630_
				    = (i_626_ & 0xff00) * qp.D & 0xff0000;
				i_626_ = ((i_629_ | i_630_) >>> 8) + qp.j;
				int i_631_ = is_589_[i_588_];
				is_589_[i_588_]
				    = ((((i_626_ & 0xff00ff) * i_627_
					 + (i_631_ & 0xff00ff) * i_628_)
					& ~0xff00ff)
				       + (((i_626_ & 0xff00) * i_627_
					   + (i_631_ & 0xff00) * i_628_)
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (i_591_ == 2) {
			    if (i_590_ == 1) {
				int i_632_ = ((bp) this).H[i_587_];
				int i_633_ = is_589_[i_588_];
				int i_634_ = i_632_ + i_633_;
				int i_635_ = ((i_632_ & 0xff00ff)
					      + (i_633_ & 0xff00ff));
				i_633_
				    = (i_635_ & 0x1000100) + (i_634_ - i_635_
							      & 0x10000);
				is_589_[i_588_]
				    = i_634_ - i_633_ | i_633_ - (i_633_
								  >>> 8);
			    } else if (i_590_ == 0) {
				int i_636_ = ((bp) this).H[i_587_];
				int i_637_
				    = (i_636_ & 0xff0000) * qp.l & ~0xffffff;
				int i_638_
				    = (i_636_ & 0xff00) * qp.g & 0xff0000;
				int i_639_ = (i_636_ & 0xff) * qp.A & 0xff00;
				i_636_ = (i_637_ | i_638_ | i_639_) >>> 8;
				int i_640_ = is_589_[i_588_];
				int i_641_ = i_636_ + i_640_;
				int i_642_ = ((i_636_ & 0xff00ff)
					      + (i_640_ & 0xff00ff));
				i_640_
				    = (i_642_ & 0x1000100) + (i_641_ - i_642_
							      & 0x10000);
				is_589_[i_588_]
				    = i_641_ - i_640_ | i_640_ - (i_640_
								  >>> 8);
			    } else if (i_590_ == 3) {
				int i_643_ = ((bp) this).H[i_587_];
				int i_644_ = qp.w;
				int i_645_ = i_643_ + i_644_;
				int i_646_ = ((i_643_ & 0xff00ff)
					      + (i_644_ & 0xff00ff));
				int i_647_ = ((i_646_ & 0x1000100)
					      + (i_645_ - i_646_ & 0x10000));
				i_643_ = i_645_ - i_647_ | i_647_ - (i_647_
								     >>> 8);
				i_647_ = is_589_[i_588_];
				i_645_ = i_643_ + i_647_;
				i_646_ = (i_643_ & 0xff00ff) + (i_647_
								& 0xff00ff);
				i_647_
				    = (i_646_ & 0x1000100) + (i_645_ - i_646_
							      & 0x10000);
				is_589_[i_588_]
				    = i_645_ - i_647_ | i_647_ - (i_647_
								  >>> 8);
			    } else if (i_590_ == 2) {
				int i_648_ = ((bp) this).H[i_587_];
				int i_649_
				    = (i_648_ & 0xff00ff) * qp.D & ~0xff00ff;
				int i_650_
				    = (i_648_ & 0xff00) * qp.D & 0xff0000;
				i_648_ = ((i_649_ | i_650_) >>> 8) + qp.j;
				int i_651_ = is_589_[i_588_];
				int i_652_ = i_648_ + i_651_;
				int i_653_ = ((i_648_ & 0xff00ff)
					      + (i_651_ & 0xff00ff));
				i_651_
				    = (i_653_ & 0x1000100) + (i_652_ - i_653_
							      & 0x10000);
				is_589_[i_588_]
				    = i_652_ - i_651_ | i_651_ - (i_651_
								  >>> 8);
			    }
			} else
			    throw new IllegalArgumentException();
			i_582_ += qp.h;
		    }
		}
		i_580_++;
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else if (qp.n < 0) {
	    for (int i_654_ = qp.F; i_654_ < 0; i_654_++) {
		int i_655_ = qp.v;
		int i_656_ = qp.B + qp.a;
		int i_657_ = qp.z + qp.c;
		int i_658_ = qp.y;
		if (i_656_ < 0) {
		    int i_659_ = (qp.h - 1 - i_656_) / qp.h;
		    i_658_ += i_659_;
		    i_656_ += qp.h * i_659_;
		    i_657_ += qp.n * i_659_;
		    i_655_ += i_659_;
		}
		int i_660_;
		if ((i_660_
		     = (i_656_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
		    > i_658_)
		    i_658_ = i_660_;
		if ((i_660_ = i_657_ - (((qp) this).o << 12)) >= 0) {
		    i_660_ = (qp.n - i_660_) / qp.n;
		    i_658_ += i_660_;
		    i_656_ += qp.h * i_660_;
		    i_657_ += qp.n * i_660_;
		    i_655_ += i_660_;
		}
		if ((i_660_ = (i_657_ - qp.n) / qp.n) > i_658_)
		    i_658_ = i_660_;
		for (/**/; i_658_ < 0; i_658_++) {
		    int i_661_
			= (i_657_ >> 12) * ((qp) this).k + (i_656_ >> 12);
		    int i_662_ = i_655_++;
		    int[] is_663_ = is;
		    int i_664_ = i;
		    int i_665_ = i_141_;
		    if (i_665_ == 0) {
			if (i_664_ == 1)
			    is_663_[i_662_] = ((bp) this).H[i_661_];
			else if (i_664_ == 0) {
			    int i_666_ = ((bp) this).H[i_661_++];
			    int i_667_
				= (i_666_ & 0xff0000) * qp.l & ~0xffffff;
			    int i_668_ = (i_666_ & 0xff00) * qp.g & 0xff0000;
			    int i_669_ = (i_666_ & 0xff) * qp.A & 0xff00;
			    is_663_[i_662_] = (i_667_ | i_668_ | i_669_) >>> 8;
			} else if (i_664_ == 3) {
			    int i_670_ = ((bp) this).H[i_661_++];
			    int i_671_ = qp.w;
			    int i_672_ = i_670_ + i_671_;
			    int i_673_
				= (i_670_ & 0xff00ff) + (i_671_ & 0xff00ff);
			    int i_674_ = ((i_673_ & 0x1000100)
					  + (i_672_ - i_673_ & 0x10000));
			    is_663_[i_662_]
				= i_672_ - i_674_ | i_674_ - (i_674_ >>> 8);
			} else if (i_664_ == 2) {
			    int i_675_ = ((bp) this).H[i_661_];
			    int i_676_
				= (i_675_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_677_ = (i_675_ & 0xff00) * qp.D & 0xff0000;
			    is_663_[i_662_] = ((i_676_ | i_677_) >>> 8) + qp.j;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_665_ == 1) {
			if (i_664_ == 1) {
			    int i_678_ = ((bp) this).H[i_661_];
			    int i_679_ = i_678_ >>> 24;
			    int i_680_ = 256 - i_679_;
			    int i_681_ = is_663_[i_662_];
			    is_663_[i_662_]
				= ((((i_678_ & 0xff00ff) * i_679_
				     + (i_681_ & 0xff00ff) * i_680_)
				    & ~0xff00ff)
				   + (((i_678_ & 0xff00) * i_679_
				       + (i_681_ & 0xff00) * i_680_)
				      & 0xff0000)) >> 8;
			} else if (i_664_ == 0) {
			    int i_682_ = ((bp) this).H[i_661_];
			    int i_683_ = (i_682_ >>> 24) * qp.D >> 8;
			    int i_684_ = 256 - i_683_;
			    if ((qp.w & 0xffffff) == 16777215) {
				int i_685_ = is_663_[i_662_];
				is_663_[i_662_]
				    = ((((i_682_ & 0xff00ff) * i_683_
					 + (i_685_ & 0xff00ff) * i_684_)
					& ~0xff00ff)
				       + (((i_682_ & 0xff00) * i_683_
					   + (i_685_ & 0xff00) * i_684_)
					  & 0xff0000)) >> 8;
			    } else if (i_683_ != 255) {
				int i_686_
				    = (i_682_ & 0xff0000) * qp.l & ~0xffffff;
				int i_687_
				    = (i_682_ & 0xff00) * qp.g & 0xff0000;
				int i_688_ = (i_682_ & 0xff) * qp.A & 0xff00;
				i_682_ = (i_686_ | i_687_ | i_688_) >>> 8;
				int i_689_ = is_663_[i_662_];
				is_663_[i_662_]
				    = ((((i_682_ & 0xff00ff) * i_683_
					 + (i_689_ & 0xff00ff) * i_684_)
					& ~0xff00ff)
				       + (((i_682_ & 0xff00) * i_683_
					   + (i_689_ & 0xff00) * i_684_)
					  & 0xff0000)) >> 8;
			    } else {
				int i_690_
				    = (i_682_ & 0xff0000) * qp.l & ~0xffffff;
				int i_691_
				    = (i_682_ & 0xff00) * qp.g & 0xff0000;
				int i_692_ = (i_682_ & 0xff) * qp.A & 0xff00;
				is_663_[i_662_]
				    = (i_690_ | i_691_ | i_692_) >>> 8;
			    }
			} else if (i_664_ == 3) {
			    int i_693_ = ((bp) this).H[i_661_];
			    int i_694_ = qp.w;
			    int i_695_ = i_693_ + i_694_;
			    int i_696_
				= (i_693_ & 0xff00ff) + (i_694_ & 0xff00ff);
			    int i_697_ = ((i_696_ & 0x1000100)
					  + (i_695_ - i_696_ & 0x10000));
			    i_697_ = i_695_ - i_697_ | i_697_ - (i_697_ >>> 8);
			    int i_698_ = (i_693_ >>> 24) * qp.D >> 8;
			    int i_699_ = 256 - i_698_;
			    if (i_698_ != 255) {
				i_693_ = i_697_;
				i_697_ = is_663_[i_662_];
				i_697_ = ((((i_693_ & 0xff00ff) * i_698_
					    + (i_697_ & 0xff00ff) * i_699_)
					   & ~0xff00ff)
					  + (((i_693_ & 0xff00) * i_698_
					      + (i_697_ & 0xff00) * i_699_)
					     & 0xff0000)) >> 8;
			    }
			    is_663_[i_662_] = i_697_;
			} else if (i_664_ == 2) {
			    int i_700_ = ((bp) this).H[i_661_];
			    int i_701_ = i_700_ >>> 24;
			    int i_702_ = 256 - i_701_;
			    int i_703_
				= (i_700_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_704_ = (i_700_ & 0xff00) * qp.D & 0xff0000;
			    i_700_ = ((i_703_ | i_704_) >>> 8) + qp.j;
			    int i_705_ = is_663_[i_662_];
			    is_663_[i_662_]
				= ((((i_700_ & 0xff00ff) * i_701_
				     + (i_705_ & 0xff00ff) * i_702_)
				    & ~0xff00ff)
				   + (((i_700_ & 0xff00) * i_701_
				       + (i_705_ & 0xff00) * i_702_)
				      & 0xff0000)) >> 8;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_665_ == 2) {
			if (i_664_ == 1) {
			    int i_706_ = ((bp) this).H[i_661_];
			    int i_707_ = is_663_[i_662_];
			    int i_708_ = i_706_ + i_707_;
			    int i_709_
				= (i_706_ & 0xff00ff) + (i_707_ & 0xff00ff);
			    i_707_ = (i_709_ & 0x1000100) + (i_708_ - i_709_
							     & 0x10000);
			    is_663_[i_662_]
				= i_708_ - i_707_ | i_707_ - (i_707_ >>> 8);
			} else if (i_664_ == 0) {
			    int i_710_ = ((bp) this).H[i_661_];
			    int i_711_
				= (i_710_ & 0xff0000) * qp.l & ~0xffffff;
			    int i_712_ = (i_710_ & 0xff00) * qp.g & 0xff0000;
			    int i_713_ = (i_710_ & 0xff) * qp.A & 0xff00;
			    i_710_ = (i_711_ | i_712_ | i_713_) >>> 8;
			    int i_714_ = is_663_[i_662_];
			    int i_715_ = i_710_ + i_714_;
			    int i_716_
				= (i_710_ & 0xff00ff) + (i_714_ & 0xff00ff);
			    i_714_ = (i_716_ & 0x1000100) + (i_715_ - i_716_
							     & 0x10000);
			    is_663_[i_662_]
				= i_715_ - i_714_ | i_714_ - (i_714_ >>> 8);
			} else if (i_664_ == 3) {
			    int i_717_ = ((bp) this).H[i_661_];
			    int i_718_ = qp.w;
			    int i_719_ = i_717_ + i_718_;
			    int i_720_
				= (i_717_ & 0xff00ff) + (i_718_ & 0xff00ff);
			    int i_721_ = ((i_720_ & 0x1000100)
					  + (i_719_ - i_720_ & 0x10000));
			    i_717_ = i_719_ - i_721_ | i_721_ - (i_721_ >>> 8);
			    i_721_ = is_663_[i_662_];
			    i_719_ = i_717_ + i_721_;
			    i_720_ = (i_717_ & 0xff00ff) + (i_721_ & 0xff00ff);
			    i_721_ = (i_720_ & 0x1000100) + (i_719_ - i_720_
							     & 0x10000);
			    is_663_[i_662_]
				= i_719_ - i_721_ | i_721_ - (i_721_ >>> 8);
			} else if (i_664_ == 2) {
			    int i_722_ = ((bp) this).H[i_661_];
			    int i_723_
				= (i_722_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_724_ = (i_722_ & 0xff00) * qp.D & 0xff0000;
			    i_722_ = ((i_723_ | i_724_) >>> 8) + qp.j;
			    int i_725_ = is_663_[i_662_];
			    int i_726_ = i_722_ + i_725_;
			    int i_727_
				= (i_722_ & 0xff00ff) + (i_725_ & 0xff00ff);
			    i_725_ = (i_727_ & 0x1000100) + (i_726_ - i_727_
							     & 0x10000);
			    is_663_[i_662_]
				= i_726_ - i_725_ | i_725_ - (i_725_ >>> 8);
			}
		    } else
			throw new IllegalArgumentException();
		    i_656_ += qp.h;
		    i_657_ += qp.n;
		}
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	} else {
	    for (int i_728_ = qp.F; i_728_ < 0; i_728_++) {
		int i_729_ = qp.v;
		int i_730_ = qp.B + qp.a;
		int i_731_ = qp.z + qp.c;
		int i_732_ = qp.y;
		if (i_730_ < 0) {
		    int i_733_ = (qp.h - 1 - i_730_) / qp.h;
		    i_732_ += i_733_;
		    i_730_ += qp.h * i_733_;
		    i_731_ += qp.n * i_733_;
		    i_729_ += i_733_;
		}
		int i_734_;
		if ((i_734_
		     = (i_730_ + 1 - (((qp) this).k << 12) - qp.h) / qp.h)
		    > i_732_)
		    i_732_ = i_734_;
		if (i_731_ < 0) {
		    i_734_ = (qp.n - 1 - i_731_) / qp.n;
		    i_732_ += i_734_;
		    i_730_ += qp.h * i_734_;
		    i_731_ += qp.n * i_734_;
		    i_729_ += i_734_;
		}
		if ((i_734_
		     = (i_731_ + 1 - (((qp) this).o << 12) - qp.n) / qp.n)
		    > i_732_)
		    i_732_ = i_734_;
		for (/**/; i_732_ < 0; i_732_++) {
		    int i_735_
			= (i_731_ >> 12) * ((qp) this).k + (i_730_ >> 12);
		    int i_736_ = i_729_++;
		    int[] is_737_ = is;
		    int i_738_ = i;
		    int i_739_ = i_141_;
		    if (i_739_ == 0) {
			if (i_738_ == 1)
			    is_737_[i_736_] = ((bp) this).H[i_735_];
			else if (i_738_ == 0) {
			    int i_740_ = ((bp) this).H[i_735_++];
			    int i_741_
				= (i_740_ & 0xff0000) * qp.l & ~0xffffff;
			    int i_742_ = (i_740_ & 0xff00) * qp.g & 0xff0000;
			    int i_743_ = (i_740_ & 0xff) * qp.A & 0xff00;
			    is_737_[i_736_] = (i_741_ | i_742_ | i_743_) >>> 8;
			} else if (i_738_ == 3) {
			    int i_744_ = ((bp) this).H[i_735_++];
			    int i_745_ = qp.w;
			    int i_746_ = i_744_ + i_745_;
			    int i_747_
				= (i_744_ & 0xff00ff) + (i_745_ & 0xff00ff);
			    int i_748_ = ((i_747_ & 0x1000100)
					  + (i_746_ - i_747_ & 0x10000));
			    is_737_[i_736_]
				= i_746_ - i_748_ | i_748_ - (i_748_ >>> 8);
			} else if (i_738_ == 2) {
			    int i_749_ = ((bp) this).H[i_735_];
			    int i_750_
				= (i_749_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_751_ = (i_749_ & 0xff00) * qp.D & 0xff0000;
			    is_737_[i_736_] = ((i_750_ | i_751_) >>> 8) + qp.j;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_739_ == 1) {
			if (i_738_ == 1) {
			    int i_752_ = ((bp) this).H[i_735_];
			    int i_753_ = i_752_ >>> 24;
			    int i_754_ = 256 - i_753_;
			    int i_755_ = is_737_[i_736_];
			    is_737_[i_736_]
				= ((((i_752_ & 0xff00ff) * i_753_
				     + (i_755_ & 0xff00ff) * i_754_)
				    & ~0xff00ff)
				   + (((i_752_ & 0xff00) * i_753_
				       + (i_755_ & 0xff00) * i_754_)
				      & 0xff0000)) >> 8;
			} else if (i_738_ == 0) {
			    int i_756_ = ((bp) this).H[i_735_];
			    int i_757_ = (i_756_ >>> 24) * qp.D >> 8;
			    int i_758_ = 256 - i_757_;
			    if ((qp.w & 0xffffff) == 16777215) {
				int i_759_ = is_737_[i_736_];
				is_737_[i_736_]
				    = ((((i_756_ & 0xff00ff) * i_757_
					 + (i_759_ & 0xff00ff) * i_758_)
					& ~0xff00ff)
				       + (((i_756_ & 0xff00) * i_757_
					   + (i_759_ & 0xff00) * i_758_)
					  & 0xff0000)) >> 8;
			    } else if (i_757_ != 255) {
				int i_760_
				    = (i_756_ & 0xff0000) * qp.l & ~0xffffff;
				int i_761_
				    = (i_756_ & 0xff00) * qp.g & 0xff0000;
				int i_762_ = (i_756_ & 0xff) * qp.A & 0xff00;
				i_756_ = (i_760_ | i_761_ | i_762_) >>> 8;
				int i_763_ = is_737_[i_736_];
				is_737_[i_736_]
				    = ((((i_756_ & 0xff00ff) * i_757_
					 + (i_763_ & 0xff00ff) * i_758_)
					& ~0xff00ff)
				       + (((i_756_ & 0xff00) * i_757_
					   + (i_763_ & 0xff00) * i_758_)
					  & 0xff0000)) >> 8;
			    } else {
				int i_764_
				    = (i_756_ & 0xff0000) * qp.l & ~0xffffff;
				int i_765_
				    = (i_756_ & 0xff00) * qp.g & 0xff0000;
				int i_766_ = (i_756_ & 0xff) * qp.A & 0xff00;
				is_737_[i_736_]
				    = (i_764_ | i_765_ | i_766_) >>> 8;
			    }
			} else if (i_738_ == 3) {
			    int i_767_ = ((bp) this).H[i_735_];
			    int i_768_ = qp.w;
			    int i_769_ = i_767_ + i_768_;
			    int i_770_
				= (i_767_ & 0xff00ff) + (i_768_ & 0xff00ff);
			    int i_771_ = ((i_770_ & 0x1000100)
					  + (i_769_ - i_770_ & 0x10000));
			    i_771_ = i_769_ - i_771_ | i_771_ - (i_771_ >>> 8);
			    int i_772_ = (i_767_ >>> 24) * qp.D >> 8;
			    int i_773_ = 256 - i_772_;
			    if (i_772_ != 255) {
				i_767_ = i_771_;
				i_771_ = is_737_[i_736_];
				i_771_ = ((((i_767_ & 0xff00ff) * i_772_
					    + (i_771_ & 0xff00ff) * i_773_)
					   & ~0xff00ff)
					  + (((i_767_ & 0xff00) * i_772_
					      + (i_771_ & 0xff00) * i_773_)
					     & 0xff0000)) >> 8;
			    }
			    is_737_[i_736_] = i_771_;
			} else if (i_738_ == 2) {
			    int i_774_ = ((bp) this).H[i_735_];
			    int i_775_ = i_774_ >>> 24;
			    int i_776_ = 256 - i_775_;
			    int i_777_
				= (i_774_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_778_ = (i_774_ & 0xff00) * qp.D & 0xff0000;
			    i_774_ = ((i_777_ | i_778_) >>> 8) + qp.j;
			    int i_779_ = is_737_[i_736_];
			    is_737_[i_736_]
				= ((((i_774_ & 0xff00ff) * i_775_
				     + (i_779_ & 0xff00ff) * i_776_)
				    & ~0xff00ff)
				   + (((i_774_ & 0xff00) * i_775_
				       + (i_779_ & 0xff00) * i_776_)
				      & 0xff0000)) >> 8;
			} else
			    throw new IllegalArgumentException();
		    } else if (i_739_ == 2) {
			if (i_738_ == 1) {
			    int i_780_ = ((bp) this).H[i_735_];
			    int i_781_ = is_737_[i_736_];
			    int i_782_ = i_780_ + i_781_;
			    int i_783_
				= (i_780_ & 0xff00ff) + (i_781_ & 0xff00ff);
			    i_781_ = (i_783_ & 0x1000100) + (i_782_ - i_783_
							     & 0x10000);
			    is_737_[i_736_]
				= i_782_ - i_781_ | i_781_ - (i_781_ >>> 8);
			} else if (i_738_ == 0) {
			    int i_784_ = ((bp) this).H[i_735_];
			    int i_785_
				= (i_784_ & 0xff0000) * qp.l & ~0xffffff;
			    int i_786_ = (i_784_ & 0xff00) * qp.g & 0xff0000;
			    int i_787_ = (i_784_ & 0xff) * qp.A & 0xff00;
			    i_784_ = (i_785_ | i_786_ | i_787_) >>> 8;
			    int i_788_ = is_737_[i_736_];
			    int i_789_ = i_784_ + i_788_;
			    int i_790_
				= (i_784_ & 0xff00ff) + (i_788_ & 0xff00ff);
			    i_788_ = (i_790_ & 0x1000100) + (i_789_ - i_790_
							     & 0x10000);
			    is_737_[i_736_]
				= i_789_ - i_788_ | i_788_ - (i_788_ >>> 8);
			} else if (i_738_ == 3) {
			    int i_791_ = ((bp) this).H[i_735_];
			    int i_792_ = qp.w;
			    int i_793_ = i_791_ + i_792_;
			    int i_794_
				= (i_791_ & 0xff00ff) + (i_792_ & 0xff00ff);
			    int i_795_ = ((i_794_ & 0x1000100)
					  + (i_793_ - i_794_ & 0x10000));
			    i_791_ = i_793_ - i_795_ | i_795_ - (i_795_ >>> 8);
			    i_795_ = is_737_[i_736_];
			    i_793_ = i_791_ + i_795_;
			    i_794_ = (i_791_ & 0xff00ff) + (i_795_ & 0xff00ff);
			    i_795_ = (i_794_ & 0x1000100) + (i_793_ - i_794_
							     & 0x10000);
			    is_737_[i_736_]
				= i_793_ - i_795_ | i_795_ - (i_795_ >>> 8);
			} else if (i_738_ == 2) {
			    int i_796_ = ((bp) this).H[i_735_];
			    int i_797_
				= (i_796_ & 0xff00ff) * qp.D & ~0xff00ff;
			    int i_798_ = (i_796_ & 0xff00) * qp.D & 0xff0000;
			    i_796_ = ((i_797_ | i_798_) >>> 8) + qp.j;
			    int i_799_ = is_737_[i_736_];
			    int i_800_ = i_796_ + i_799_;
			    int i_801_
				= (i_796_ & 0xff00ff) + (i_799_ & 0xff00ff);
			    i_799_ = (i_801_ & 0x1000100) + (i_800_ - i_801_
							     & 0x10000);
			    is_737_[i_736_]
				= i_800_ - i_799_ | i_799_ - (i_799_ >>> 8);
			}
		    } else
			throw new IllegalArgumentException();
		    i_730_ += qp.h;
		    i_731_ += qp.n;
		}
		qp.B += qp.m;
		qp.z += qp.G;
		qp.v += qp.u;
	    }
	}
    }
    
    bp(nga var_nga, int i, int i_802_) {
	super(var_nga, i, i_802_);
	((bp) this).H = new int[i * i_802_];
    }
    
    bp(nga var_nga, int[] is, int i, int i_803_, int i_804_, int i_805_) {
	super(var_nga, i_804_, i_805_);
	((bp) this).H = new int[i_804_ * i_805_];
	i_803_ -= ((qp) this).k;
	int i_806_ = 0;
	for (int i_807_ = 0; i_807_ < i_805_; i_807_++) {
	    for (int i_808_ = 0; i_808_ < i_804_; i_808_++)
		((bp) this).H[i_806_++] = is[i++];
	    i += i_803_;
	}
    }
    
    final void a(int i, int i_809_, ua var_ua, int i_810_, int i_811_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	i += ((qp) this).E;
	i_809_ += ((qp) this).f;
	int i_812_ = 0;
	int i_813_ = ((nga) ((qp) this).b).C;
	int i_814_ = ((qp) this).k;
	int i_815_ = ((qp) this).o;
	int i_816_ = i_813_ - i_814_;
	int i_817_ = 0;
	int i_818_ = i + i_809_ * i_813_;
	if (i_809_ < ((nga) ((qp) this).b).u) {
	    int i_819_ = ((nga) ((qp) this).b).u - i_809_;
	    i_815_ -= i_819_;
	    i_809_ = ((nga) ((qp) this).b).u;
	    i_812_ += i_819_ * i_814_;
	    i_818_ += i_819_ * i_813_;
	}
	if (i_809_ + i_815_ > ((nga) ((qp) this).b).cb)
	    i_815_ -= i_809_ + i_815_ - ((nga) ((qp) this).b).cb;
	if (i < ((nga) ((qp) this).b).Y) {
	    int i_820_ = ((nga) ((qp) this).b).Y - i;
	    i_814_ -= i_820_;
	    i = ((nga) ((qp) this).b).Y;
	    i_812_ += i_820_;
	    i_818_ += i_820_;
	    i_817_ += i_820_;
	    i_816_ += i_820_;
	}
	if (i + i_814_ > ((nga) ((qp) this).b).B) {
	    int i_821_ = i + i_814_ - ((nga) ((qp) this).b).B;
	    i_814_ -= i_821_;
	    i_817_ += i_821_;
	    i_816_ += i_821_;
	}
	if (i_814_ > 0 && i_815_ > 0) {
	    nu var_nu = (nu) var_ua;
	    int[] is = ((nu) var_nu).g;
	    int[] is_822_ = ((nu) var_nu).k;
	    int[] is_823_ = ((nga) ((qp) this).b).H;
	    int i_824_ = i_809_;
	    if (i_811_ > i_824_) {
		i_824_ = i_811_;
		i_818_ += (i_811_ - i_809_) * i_813_;
		i_812_ += (i_811_ - i_809_) * ((qp) this).k;
	    }
	    int i_825_ = (i_811_ + is.length < i_809_ + i_815_
			  ? i_811_ + is.length : i_809_ + i_815_);
	    for (int i_826_ = i_824_; i_826_ < i_825_; i_826_++) {
		int i_827_ = is[i_826_ - i_811_] + i_810_;
		int i_828_ = is_822_[i_826_ - i_811_];
		int i_829_ = i_814_;
		if (i > i_827_) {
		    int i_830_ = i - i_827_;
		    if (i_830_ >= i_828_) {
			i_812_ += i_814_ + i_817_;
			i_818_ += i_814_ + i_816_;
			continue;
		    }
		    i_828_ -= i_830_;
		} else {
		    int i_831_ = i_827_ - i;
		    if (i_831_ >= i_814_) {
			i_812_ += i_814_ + i_817_;
			i_818_ += i_814_ + i_816_;
			continue;
		    }
		    i_812_ += i_831_;
		    i_829_ -= i_831_;
		    i_818_ += i_831_;
		}
		int i_832_ = 0;
		if (i_829_ < i_828_)
		    i_828_ = i_829_;
		else
		    i_832_ = i_829_ - i_828_;
		for (int i_833_ = -i_828_; i_833_ < 0; i_833_++) {
		    int i_834_ = ((bp) this).H[i_812_++];
		    int i_835_ = i_834_ >>> 24;
		    int i_836_ = 256 - i_835_;
		    int i_837_ = is_823_[i_818_];
		    is_823_[i_818_++] = ((((i_834_ & 0xff00ff) * i_835_
					   + (i_837_ & 0xff00ff) * i_836_)
					  & ~0xff00ff)
					 + (((i_834_ & 0xff00) * i_835_
					     + (i_837_ & 0xff00) * i_836_)
					    & 0xff0000)) >> 8;
		}
		i_812_ += i_832_ + i_817_;
		i_818_ += i_832_ + i_816_;
	    }
	}
    }
    
    final void a(int i, int i_838_, int i_839_, int i_840_, int i_841_,
		 int i_842_, int i_843_, int i_844_, int i_845_) {
	if (i_840_ > 0 && i_841_ > 0) {
	    i_839_ <<= 8;
	    int i_846_ = 0;
	    int i_847_ = 0;
	    int i_848_ = ((qp) this).E + ((qp) this).k + ((qp) this).q;
	    int i_849_ = ((qp) this).f + ((qp) this).o + ((qp) this).C;
	    int i_850_ = (i_848_ << 16) / i_840_;
	    int i_851_ = (i_849_ << 16) / i_841_;
	    if (((qp) this).E > 0) {
		int i_852_ = ((((qp) this).E << 16) + i_850_ - 1) / i_850_;
		i += i_852_;
		i_846_ += i_852_ * i_850_ - (((qp) this).E << 16);
	    }
	    if (((qp) this).f > 0) {
		int i_853_ = ((((qp) this).f << 16) + i_851_ - 1) / i_851_;
		i_838_ += i_853_;
		i_847_ += i_853_ * i_851_ - (((qp) this).f << 16);
	    }
	    if (((qp) this).k < i_848_)
		i_840_
		    = ((((qp) this).k << 16) - i_846_ + i_850_ - 1) / i_850_;
	    if (((qp) this).o < i_849_)
		i_841_
		    = ((((qp) this).o << 16) - i_847_ + i_851_ - 1) / i_851_;
	    int i_854_ = i + i_838_ * ((nga) ((qp) this).b).C;
	    int i_855_ = ((nga) ((qp) this).b).C - i_840_;
	    if (i_838_ + i_841_ > ((nga) ((qp) this).b).cb)
		i_841_ -= i_838_ + i_841_ - ((nga) ((qp) this).b).cb;
	    if (i_838_ < ((nga) ((qp) this).b).u) {
		int i_856_ = ((nga) ((qp) this).b).u - i_838_;
		i_841_ -= i_856_;
		i_854_ += i_856_ * ((nga) ((qp) this).b).C;
		i_847_ += i_851_ * i_856_;
	    }
	    if (i + i_840_ > ((nga) ((qp) this).b).B) {
		int i_857_ = i + i_840_ - ((nga) ((qp) this).b).B;
		i_840_ -= i_857_;
		i_855_ += i_857_;
	    }
	    if (i < ((nga) ((qp) this).b).Y) {
		int i_858_ = ((nga) ((qp) this).b).Y - i;
		i_840_ -= i_858_;
		i_854_ += i_858_;
		i_846_ += i_850_ * i_858_;
		i_855_ += i_858_;
	    }
	    int[] is = ((nga) ((qp) this).b).U;
	    int[] is_859_ = ((nga) ((qp) this).b).H;
	    if (i_844_ == 0) {
		if (i_842_ == 1) {
		    int i_860_ = i_846_;
		    for (int i_861_ = -i_841_; i_861_ < 0; i_861_++) {
			int i_862_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_863_ = -i_840_; i_863_ < 0; i_863_++) {
			    if (i_839_ < is[i_854_])
				is_859_[i_854_]
				    = ((bp) this).H[(i_846_ >> 16) + i_862_];
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_860_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 0) {
		    int i_864_ = (i_843_ & 0xff0000) >> 16;
		    int i_865_ = (i_843_ & 0xff00) >> 8;
		    int i_866_ = i_843_ & 0xff;
		    int i_867_ = i_846_;
		    for (int i_868_ = -i_841_; i_868_ < 0; i_868_++) {
			int i_869_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_870_ = -i_840_; i_870_ < 0; i_870_++) {
			    if (i_839_ < is[i_854_]) {
				int i_871_
				    = ((bp) this).H[(i_846_ >> 16) + i_869_];
				int i_872_
				    = (i_871_ & 0xff0000) * i_864_ & ~0xffffff;
				int i_873_
				    = (i_871_ & 0xff00) * i_865_ & 0xff0000;
				int i_874_ = (i_871_ & 0xff) * i_866_ & 0xff00;
				is_859_[i_854_]
				    = (i_872_ | i_873_ | i_874_) >>> 8;
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_867_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 3) {
		    int i_875_ = i_846_;
		    for (int i_876_ = -i_841_; i_876_ < 0; i_876_++) {
			int i_877_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_878_ = -i_840_; i_878_ < 0; i_878_++) {
			    if (i_839_ < is[i_854_]) {
				int i_879_
				    = ((bp) this).H[(i_846_ >> 16) + i_877_];
				int i_880_ = i_879_ + i_843_;
				int i_881_ = ((i_879_ & 0xff00ff)
					      + (i_843_ & 0xff00ff));
				int i_882_ = ((i_881_ & 0x1000100)
					      + (i_880_ - i_881_ & 0x10000));
				is_859_[i_854_]
				    = i_880_ - i_882_ | i_882_ - (i_882_
								  >>> 8);
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_875_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 2) {
		    int i_883_ = i_843_ >>> 24;
		    int i_884_ = 256 - i_883_;
		    int i_885_ = (i_843_ & 0xff00ff) * i_884_ & ~0xff00ff;
		    int i_886_ = (i_843_ & 0xff00) * i_884_ & 0xff0000;
		    i_843_ = (i_885_ | i_886_) >>> 8;
		    int i_887_ = i_846_;
		    for (int i_888_ = -i_841_; i_888_ < 0; i_888_++) {
			int i_889_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_890_ = -i_840_; i_890_ < 0; i_890_++) {
			    if (i_839_ < is[i_854_]) {
				int i_891_
				    = ((bp) this).H[(i_846_ >> 16) + i_889_];
				i_885_
				    = (i_891_ & 0xff00ff) * i_883_ & ~0xff00ff;
				i_886_ = (i_891_ & 0xff00) * i_883_ & 0xff0000;
				is_859_[i_854_]
				    = ((i_885_ | i_886_) >>> 8) + i_843_;
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_887_;
			i_854_ += i_855_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_844_ == 1) {
		if (i_842_ == 1) {
		    int i_892_ = i_846_;
		    for (int i_893_ = -i_841_; i_893_ < 0; i_893_++) {
			int i_894_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_895_ = -i_840_; i_895_ < 0; i_895_++) {
			    if (i_839_ < is[i_854_]) {
				int i_896_
				    = ((bp) this).H[(i_846_ >> 16) + i_894_];
				int i_897_ = i_896_ >>> 24;
				int i_898_ = 256 - i_897_;
				int i_899_ = is_859_[i_854_];
				is_859_[i_854_]
				    = (((((i_896_ & 0xff00ff) * i_897_
					  + (i_899_ & 0xff00ff) * i_898_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_896_ & ~0xff00ff) >>> 8)
					    * i_897_)
					   + (((i_899_ & ~0xff00ff) >>> 8)
					      * i_898_))
					  & ~0xff00ff));
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_892_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 0) {
		    int i_900_ = i_846_;
		    if ((i_843_ & 0xffffff) == 16777215) {
			for (int i_901_ = -i_841_; i_901_ < 0; i_901_++) {
			    int i_902_ = (i_847_ >> 16) * ((qp) this).k;
			    for (int i_903_ = -i_840_; i_903_ < 0; i_903_++) {
				if (i_839_ < is[i_854_]) {
				    int i_904_ = (((bp) this).H
						  [(i_846_ >> 16) + i_902_]);
				    int i_905_
					= ((i_904_ >>> 24) * (i_843_ >>> 24)
					   >> 8);
				    int i_906_ = 256 - i_905_;
				    int i_907_ = is_859_[i_854_];
				    is_859_[i_854_]
					= ((((i_904_ & 0xff00ff) * i_905_
					     + (i_907_ & 0xff00ff) * i_906_)
					    & ~0xff00ff)
					   + (((i_904_ & 0xff00) * i_905_
					       + (i_907_ & 0xff00) * i_906_)
					      & 0xff0000)) >> 8;
				}
				i_846_ += i_850_;
				i_854_++;
			    }
			    i_847_ += i_851_;
			    i_846_ = i_900_;
			    i_854_ += i_855_;
			}
		    } else {
			int i_908_ = (i_843_ & 0xff0000) >> 16;
			int i_909_ = (i_843_ & 0xff00) >> 8;
			int i_910_ = i_843_ & 0xff;
			for (int i_911_ = -i_841_; i_911_ < 0; i_911_++) {
			    int i_912_ = (i_847_ >> 16) * ((qp) this).k;
			    for (int i_913_ = -i_840_; i_913_ < 0; i_913_++) {
				if (i_839_ < is[i_854_]) {
				    int i_914_ = (((bp) this).H
						  [(i_846_ >> 16) + i_912_]);
				    int i_915_
					= ((i_914_ >>> 24) * (i_843_ >>> 24)
					   >> 8);
				    int i_916_ = 256 - i_915_;
				    if (i_915_ != 255) {
					int i_917_
					    = ((i_914_ & 0xff0000) * i_908_
					       & ~0xffffff);
					int i_918_
					    = ((i_914_ & 0xff00) * i_909_
					       & 0xff0000);
					int i_919_ = ((i_914_ & 0xff) * i_910_
						      & 0xff00);
					i_914_
					    = (i_917_ | i_918_ | i_919_) >>> 8;
					int i_920_ = is_859_[i_854_];
					is_859_[i_854_]
					    = ((((i_914_ & 0xff00ff) * i_915_
						 + ((i_920_ & 0xff00ff)
						    * i_916_))
						& ~0xff00ff)
					       + (((i_914_ & 0xff00) * i_915_
						   + ((i_920_ & 0xff00)
						      * i_916_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_921_
					    = ((i_914_ & 0xff0000) * i_908_
					       & ~0xffffff);
					int i_922_
					    = ((i_914_ & 0xff00) * i_909_
					       & 0xff0000);
					int i_923_ = ((i_914_ & 0xff) * i_910_
						      & 0xff00);
					is_859_[i_854_]
					    = (i_921_ | i_922_ | i_923_) >>> 8;
				    }
				}
				i_846_ += i_850_;
				i_854_++;
			    }
			    i_847_ += i_851_;
			    i_846_ = i_900_;
			    i_854_ += i_855_;
			}
			return;
		    }
		    return;
		}
		if (i_842_ == 3) {
		    int i_924_ = i_846_;
		    for (int i_925_ = -i_841_; i_925_ < 0; i_925_++) {
			int i_926_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_927_ = -i_840_; i_927_ < 0; i_927_++) {
			    if (i_839_ < is[i_854_]) {
				int i_928_
				    = ((bp) this).H[(i_846_ >> 16) + i_926_];
				int i_929_ = i_928_ + i_843_;
				int i_930_ = ((i_928_ & 0xff00ff)
					      + (i_843_ & 0xff00ff));
				int i_931_ = ((i_930_ & 0x1000100)
					      + (i_929_ - i_930_ & 0x10000));
				i_931_ = i_929_ - i_931_ | i_931_ - (i_931_
								     >>> 8);
				int i_932_
				    = (i_931_ >>> 24) * (i_843_ >>> 24) >> 8;
				int i_933_ = 256 - i_932_;
				if (i_932_ != 255) {
				    i_928_ = i_931_;
				    i_931_ = is_859_[i_854_];
				    i_931_ = ((((i_928_ & 0xff00ff) * i_932_
						+ (i_931_ & 0xff00ff) * i_933_)
					       & ~0xff00ff)
					      + (((i_928_ & 0xff00) * i_932_
						  + (i_931_ & 0xff00) * i_933_)
						 & 0xff0000)) >> 8;
				}
				is_859_[i_854_] = i_931_;
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_924_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 2) {
		    int i_934_ = i_843_ >>> 24;
		    int i_935_ = 256 - i_934_;
		    int i_936_ = (i_843_ & 0xff00ff) * i_935_ & ~0xff00ff;
		    int i_937_ = (i_843_ & 0xff00) * i_935_ & 0xff0000;
		    i_843_ = (i_936_ | i_937_) >>> 8;
		    int i_938_ = i_846_;
		    for (int i_939_ = -i_841_; i_939_ < 0; i_939_++) {
			int i_940_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_941_ = -i_840_; i_941_ < 0; i_941_++) {
			    if (i_839_ < is[i_854_]) {
				int i_942_
				    = ((bp) this).H[(i_846_ >> 16) + i_940_];
				int i_943_ = i_942_ >>> 24;
				int i_944_ = 256 - i_943_;
				i_936_
				    = (i_942_ & 0xff00ff) * i_934_ & ~0xff00ff;
				i_937_ = (i_942_ & 0xff00) * i_934_ & 0xff0000;
				i_942_ = ((i_936_ | i_937_) >>> 8) + i_843_;
				int i_945_ = is_859_[i_854_];
				is_859_[i_854_]
				    = ((((i_942_ & 0xff00ff) * i_943_
					 + (i_945_ & 0xff00ff) * i_944_)
					& ~0xff00ff)
				       + (((i_942_ & 0xff00) * i_943_
					   + (i_945_ & 0xff00) * i_944_)
					  & 0xff0000)) >> 8;
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_938_;
			i_854_ += i_855_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_844_ == 2) {
		if (i_842_ == 1) {
		    int i_946_ = i_846_;
		    for (int i_947_ = -i_841_; i_947_ < 0; i_947_++) {
			int i_948_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_949_ = -i_840_; i_949_ < 0; i_949_++) {
			    if (i_839_ < is[i_854_]) {
				int i_950_
				    = ((bp) this).H[(i_846_ >> 16) + i_948_];
				if (i_950_ != 0) {
				    int i_951_ = is_859_[i_854_];
				    int i_952_ = i_950_ + i_951_;
				    int i_953_ = ((i_950_ & 0xff00ff)
						  + (i_951_ & 0xff00ff));
				    i_951_ = ((i_953_ & 0x1000100)
					      + (i_952_ - i_953_ & 0x10000));
				    is_859_[i_854_]
					= i_952_ - i_951_ | i_951_ - (i_951_
								      >>> 8);
				}
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_946_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 0) {
		    int i_954_ = i_846_;
		    int i_955_ = (i_843_ & 0xff0000) >> 16;
		    int i_956_ = (i_843_ & 0xff00) >> 8;
		    int i_957_ = i_843_ & 0xff;
		    for (int i_958_ = -i_841_; i_958_ < 0; i_958_++) {
			int i_959_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_960_ = -i_840_; i_960_ < 0; i_960_++) {
			    if (i_839_ < is[i_854_]) {
				int i_961_
				    = ((bp) this).H[(i_846_ >> 16) + i_959_];
				if (i_961_ != 0) {
				    int i_962_ = ((i_961_ & 0xff0000) * i_955_
						  & ~0xffffff);
				    int i_963_ = ((i_961_ & 0xff00) * i_956_
						  & 0xff0000);
				    int i_964_
					= (i_961_ & 0xff) * i_957_ & 0xff00;
				    i_961_ = (i_962_ | i_963_ | i_964_) >>> 8;
				    int i_965_ = is_859_[i_854_];
				    int i_966_ = i_961_ + i_965_;
				    int i_967_ = ((i_961_ & 0xff00ff)
						  + (i_965_ & 0xff00ff));
				    i_965_ = ((i_967_ & 0x1000100)
					      + (i_966_ - i_967_ & 0x10000));
				    is_859_[i_854_]
					= i_966_ - i_965_ | i_965_ - (i_965_
								      >>> 8);
				}
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_954_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 3) {
		    int i_968_ = i_846_;
		    for (int i_969_ = -i_841_; i_969_ < 0; i_969_++) {
			int i_970_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_971_ = -i_840_; i_971_ < 0; i_971_++) {
			    if (i_839_ < is[i_854_]) {
				int i_972_
				    = ((bp) this).H[(i_846_ >> 16) + i_970_];
				int i_973_ = i_972_ + i_843_;
				int i_974_ = ((i_972_ & 0xff00ff)
					      + (i_843_ & 0xff00ff));
				int i_975_ = ((i_974_ & 0x1000100)
					      + (i_973_ - i_974_ & 0x10000));
				i_972_ = i_973_ - i_975_ | i_975_ - (i_975_
								     >>> 8);
				i_975_ = is_859_[i_854_];
				i_973_ = i_972_ + i_975_;
				i_974_ = (i_972_ & 0xff00ff) + (i_975_
								& 0xff00ff);
				i_975_
				    = (i_974_ & 0x1000100) + (i_973_ - i_974_
							      & 0x10000);
				is_859_[i_854_]
				    = i_973_ - i_975_ | i_975_ - (i_975_
								  >>> 8);
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_968_;
			i_854_ += i_855_;
		    }
		    return;
		}
		if (i_842_ == 2) {
		    int i_976_ = i_843_ >>> 24;
		    int i_977_ = 256 - i_976_;
		    int i_978_ = (i_843_ & 0xff00ff) * i_977_ & ~0xff00ff;
		    int i_979_ = (i_843_ & 0xff00) * i_977_ & 0xff0000;
		    i_843_ = (i_978_ | i_979_) >>> 8;
		    int i_980_ = i_846_;
		    for (int i_981_ = -i_841_; i_981_ < 0; i_981_++) {
			int i_982_ = (i_847_ >> 16) * ((qp) this).k;
			for (int i_983_ = -i_840_; i_983_ < 0; i_983_++) {
			    if (i_839_ < is[i_854_]) {
				int i_984_
				    = ((bp) this).H[(i_846_ >> 16) + i_982_];
				if (i_984_ != 0) {
				    i_978_ = ((i_984_ & 0xff00ff) * i_976_
					      & ~0xff00ff);
				    i_979_ = ((i_984_ & 0xff00) * i_976_
					      & 0xff0000);
				    i_984_
					= ((i_978_ | i_979_) >>> 8) + i_843_;
				    int i_985_ = is_859_[i_854_];
				    int i_986_ = i_984_ + i_985_;
				    int i_987_ = ((i_984_ & 0xff00ff)
						  + (i_985_ & 0xff00ff));
				    i_985_ = ((i_987_ & 0x1000100)
					      + (i_986_ - i_987_ & 0x10000));
				    is_859_[i_854_]
					= i_986_ - i_985_ | i_985_ - (i_985_
								      >>> 8);
				}
			    }
			    i_846_ += i_850_;
			    i_854_++;
			}
			i_847_ += i_851_;
			i_846_ = i_980_;
			i_854_ += i_855_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    bp(nga var_nga, int[] is, int i, int i_988_) {
	super(var_nga, i, i_988_);
	((bp) this).H = is;
    }
    
    final void V(int i, int i_989_, int i_990_, int i_991_, int i_992_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	int i_993_ = ((nga) ((qp) this).b).C;
	i += ((qp) this).E;
	i_989_ += ((qp) this).f;
	int i_994_ = i_989_ * i_993_ + i;
	int i_995_ = 0;
	int i_996_ = ((qp) this).o;
	int i_997_ = ((qp) this).k;
	int i_998_ = i_993_ - i_997_;
	int i_999_ = 0;
	if (i_989_ < ((nga) ((qp) this).b).u) {
	    int i_1000_ = ((nga) ((qp) this).b).u - i_989_;
	    i_996_ -= i_1000_;
	    i_989_ = ((nga) ((qp) this).b).u;
	    i_995_ += i_1000_ * i_997_;
	    i_994_ += i_1000_ * i_993_;
	}
	if (i_989_ + i_996_ > ((nga) ((qp) this).b).cb)
	    i_996_ -= i_989_ + i_996_ - ((nga) ((qp) this).b).cb;
	if (i < ((nga) ((qp) this).b).Y) {
	    int i_1001_ = ((nga) ((qp) this).b).Y - i;
	    i_997_ -= i_1001_;
	    i = ((nga) ((qp) this).b).Y;
	    i_995_ += i_1001_;
	    i_994_ += i_1001_;
	    i_999_ += i_1001_;
	    i_998_ += i_1001_;
	}
	if (i + i_997_ > ((nga) ((qp) this).b).B) {
	    int i_1002_ = i + i_997_ - ((nga) ((qp) this).b).B;
	    i_997_ -= i_1002_;
	    i_999_ += i_1002_;
	    i_998_ += i_1002_;
	}
	if (i_997_ > 0 && i_996_ > 0) {
	    int[] is = ((nga) ((qp) this).b).H;
	    if (i_992_ == 0) {
		if (i_990_ == 1) {
		    for (int i_1003_ = -i_996_; i_1003_ < 0; i_1003_++) {
			int i_1004_ = i_994_ + i_997_ - 3;
			while (i_994_ < i_1004_) {
			    is[i_994_++] = ((bp) this).H[i_995_++];
			    is[i_994_++] = ((bp) this).H[i_995_++];
			    is[i_994_++] = ((bp) this).H[i_995_++];
			    is[i_994_++] = ((bp) this).H[i_995_++];
			}
			i_1004_ += 3;
			while (i_994_ < i_1004_)
			    is[i_994_++] = ((bp) this).H[i_995_++];
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 0) {
		    int i_1005_ = (i_991_ & 0xff0000) >> 16;
		    int i_1006_ = (i_991_ & 0xff00) >> 8;
		    int i_1007_ = i_991_ & 0xff;
		    for (int i_1008_ = -i_996_; i_1008_ < 0; i_1008_++) {
			for (int i_1009_ = -i_997_; i_1009_ < 0; i_1009_++) {
			    int i_1010_ = ((bp) this).H[i_995_++];
			    int i_1011_
				= (i_1010_ & 0xff0000) * i_1005_ & ~0xffffff;
			    int i_1012_
				= (i_1010_ & 0xff00) * i_1006_ & 0xff0000;
			    int i_1013_ = (i_1010_ & 0xff) * i_1007_ & 0xff00;
			    is[i_994_++] = (i_1011_ | i_1012_ | i_1013_) >>> 8;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 3) {
		    for (int i_1014_ = -i_996_; i_1014_ < 0; i_1014_++) {
			for (int i_1015_ = -i_997_; i_1015_ < 0; i_1015_++) {
			    int i_1016_ = ((bp) this).H[i_995_++];
			    int i_1017_ = i_1016_ + i_991_;
			    int i_1018_
				= (i_1016_ & 0xff00ff) + (i_991_ & 0xff00ff);
			    int i_1019_ = ((i_1018_ & 0x1000100)
					   + (i_1017_ - i_1018_ & 0x10000));
			    is[i_994_++]
				= i_1017_ - i_1019_ | i_1019_ - (i_1019_
								 >>> 8);
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 2) {
		    int i_1020_ = i_991_ >>> 24;
		    int i_1021_ = 256 - i_1020_;
		    int i_1022_ = (i_991_ & 0xff00ff) * i_1021_ & ~0xff00ff;
		    int i_1023_ = (i_991_ & 0xff00) * i_1021_ & 0xff0000;
		    i_991_ = (i_1022_ | i_1023_) >>> 8;
		    for (int i_1024_ = -i_996_; i_1024_ < 0; i_1024_++) {
			for (int i_1025_ = -i_997_; i_1025_ < 0; i_1025_++) {
			    int i_1026_ = ((bp) this).H[i_995_++];
			    i_1022_
				= (i_1026_ & 0xff00ff) * i_1020_ & ~0xff00ff;
			    i_1023_ = (i_1026_ & 0xff00) * i_1020_ & 0xff0000;
			    is[i_994_++]
				= ((i_1022_ | i_1023_) >>> 8) + i_991_;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_992_ == 1) {
		if (i_990_ == 1) {
		    for (int i_1027_ = -i_996_; i_1027_ < 0; i_1027_++) {
			for (int i_1028_ = -i_997_; i_1028_ < 0; i_1028_++) {
			    int i_1029_ = ((bp) this).H[i_995_++];
			    int i_1030_ = i_1029_ >>> 24;
			    int i_1031_ = 256 - i_1030_;
			    int i_1032_ = is[i_994_];
			    is[i_994_++]
				= (((((i_1029_ & 0xff00ff) * i_1030_
				      + (i_1032_ & 0xff00ff) * i_1031_)
				     & ~0xff00ff)
				    >> 8)
				   + ((((i_1029_ & ~0xff00ff) >>> 8) * i_1030_
				       + (((i_1032_ & ~0xff00ff) >>> 8)
					  * i_1031_))
				      & ~0xff00ff));
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 0) {
		    if ((i_991_ & 0xffffff) == 16777215) {
			for (int i_1033_ = -i_996_; i_1033_ < 0; i_1033_++) {
			    for (int i_1034_ = -i_997_; i_1034_ < 0;
				 i_1034_++) {
				int i_1035_ = ((bp) this).H[i_995_++];
				int i_1036_
				    = (i_1035_ >>> 24) * (i_991_ >>> 24) >> 8;
				int i_1037_ = 256 - i_1036_;
				int i_1038_ = is[i_994_];
				is[i_994_++]
				    = ((((i_1035_ & 0xff00ff) * i_1036_
					 + (i_1038_ & 0xff00ff) * i_1037_)
					& ~0xff00ff)
				       + (((i_1035_ & 0xff00) * i_1036_
					   + (i_1038_ & 0xff00) * i_1037_)
					  & 0xff0000)) >> 8;
			    }
			    i_994_ += i_998_;
			    i_995_ += i_999_;
			}
		    } else {
			int i_1039_ = (i_991_ & 0xff0000) >> 16;
			int i_1040_ = (i_991_ & 0xff00) >> 8;
			int i_1041_ = i_991_ & 0xff;
			for (int i_1042_ = -i_996_; i_1042_ < 0; i_1042_++) {
			    for (int i_1043_ = -i_997_; i_1043_ < 0;
				 i_1043_++) {
				int i_1044_ = ((bp) this).H[i_995_++];
				int i_1045_
				    = (i_1044_ >>> 24) * (i_991_ >>> 24) >> 8;
				int i_1046_ = 256 - i_1045_;
				if (i_1045_ != 255) {
				    int i_1047_
					= ((i_1044_ & 0xff0000) * i_1039_
					   & ~0xffffff);
				    int i_1048_ = ((i_1044_ & 0xff00) * i_1040_
						   & 0xff0000);
				    int i_1049_
					= (i_1044_ & 0xff) * i_1041_ & 0xff00;
				    i_1044_
					= (i_1047_ | i_1048_ | i_1049_) >>> 8;
				    int i_1050_ = is[i_994_];
				    is[i_994_++]
					= ((((i_1044_ & 0xff00ff) * i_1045_
					     + (i_1050_ & 0xff00ff) * i_1046_)
					    & ~0xff00ff)
					   + (((i_1044_ & 0xff00) * i_1045_
					       + (i_1050_ & 0xff00) * i_1046_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_1051_
					= ((i_1044_ & 0xff0000) * i_1039_
					   & ~0xffffff);
				    int i_1052_ = ((i_1044_ & 0xff00) * i_1040_
						   & 0xff0000);
				    int i_1053_
					= (i_1044_ & 0xff) * i_1041_ & 0xff00;
				    is[i_994_++]
					= (i_1051_ | i_1052_ | i_1053_) >>> 8;
				}
			    }
			    i_994_ += i_998_;
			    i_995_ += i_999_;
			}
			return;
		    }
		    return;
		}
		if (i_990_ == 3) {
		    for (int i_1054_ = -i_996_; i_1054_ < 0; i_1054_++) {
			for (int i_1055_ = -i_997_; i_1055_ < 0; i_1055_++) {
			    int i_1056_ = ((bp) this).H[i_995_++];
			    int i_1057_ = i_1056_ + i_991_;
			    int i_1058_
				= (i_1056_ & 0xff00ff) + (i_991_ & 0xff00ff);
			    int i_1059_ = ((i_1058_ & 0x1000100)
					   + (i_1057_ - i_1058_ & 0x10000));
			    i_1059_ = i_1057_ - i_1059_ | i_1059_ - (i_1059_
								     >>> 8);
			    int i_1060_
				= (i_1059_ >>> 24) * (i_991_ >>> 24) >> 8;
			    int i_1061_ = 256 - i_1060_;
			    if (i_1060_ != 255) {
				i_1056_ = i_1059_;
				i_1059_ = is[i_994_];
				i_1059_ = ((((i_1056_ & 0xff00ff) * i_1060_
					     + (i_1059_ & 0xff00ff) * i_1061_)
					    & ~0xff00ff)
					   + (((i_1056_ & 0xff00) * i_1060_
					       + (i_1059_ & 0xff00) * i_1061_)
					      & 0xff0000)) >> 8;
			    }
			    is[i_994_++] = i_1059_;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 2) {
		    int i_1062_ = i_991_ >>> 24;
		    int i_1063_ = 256 - i_1062_;
		    int i_1064_ = (i_991_ & 0xff00ff) * i_1063_ & ~0xff00ff;
		    int i_1065_ = (i_991_ & 0xff00) * i_1063_ & 0xff0000;
		    i_991_ = (i_1064_ | i_1065_) >>> 8;
		    for (int i_1066_ = -i_996_; i_1066_ < 0; i_1066_++) {
			for (int i_1067_ = -i_997_; i_1067_ < 0; i_1067_++) {
			    int i_1068_ = ((bp) this).H[i_995_++];
			    int i_1069_ = i_1068_ >>> 24;
			    int i_1070_ = 256 - i_1069_;
			    i_1064_
				= (i_1068_ & 0xff00ff) * i_1062_ & ~0xff00ff;
			    i_1065_ = (i_1068_ & 0xff00) * i_1062_ & 0xff0000;
			    i_1068_ = ((i_1064_ | i_1065_) >>> 8) + i_991_;
			    int i_1071_ = is[i_994_];
			    is[i_994_++] = ((((i_1068_ & 0xff00ff) * i_1069_
					      + (i_1071_ & 0xff00ff) * i_1070_)
					     & ~0xff00ff)
					    + (((i_1068_ & 0xff00) * i_1069_
						+ (i_1071_ & 0xff00) * i_1070_)
					       & 0xff0000)) >> 8;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_992_ == 2) {
		if (i_990_ == 1) {
		    for (int i_1072_ = -i_996_; i_1072_ < 0; i_1072_++) {
			for (int i_1073_ = -i_997_; i_1073_ < 0; i_1073_++) {
			    int i_1074_ = ((bp) this).H[i_995_++];
			    if (i_1074_ != 0) {
				int i_1075_ = is[i_994_];
				int i_1076_ = i_1074_ + i_1075_;
				int i_1077_ = ((i_1074_ & 0xff00ff)
					       + (i_1075_ & 0xff00ff));
				i_1075_ = ((i_1077_ & 0x1000100)
					   + (i_1076_ - i_1077_ & 0x10000));
				is[i_994_++]
				    = i_1076_ - i_1075_ | i_1075_ - (i_1075_
								     >>> 8);
			    } else
				i_994_++;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 0) {
		    int i_1078_ = (i_991_ & 0xff0000) >> 16;
		    int i_1079_ = (i_991_ & 0xff00) >> 8;
		    int i_1080_ = i_991_ & 0xff;
		    for (int i_1081_ = -i_996_; i_1081_ < 0; i_1081_++) {
			for (int i_1082_ = -i_997_; i_1082_ < 0; i_1082_++) {
			    int i_1083_ = ((bp) this).H[i_995_++];
			    if (i_1083_ != 0) {
				int i_1084_ = ((i_1083_ & 0xff0000) * i_1078_
					       & ~0xffffff);
				int i_1085_
				    = (i_1083_ & 0xff00) * i_1079_ & 0xff0000;
				int i_1086_
				    = (i_1083_ & 0xff) * i_1080_ & 0xff00;
				i_1083_ = (i_1084_ | i_1085_ | i_1086_) >>> 8;
				int i_1087_ = is[i_994_];
				int i_1088_ = i_1083_ + i_1087_;
				int i_1089_ = ((i_1083_ & 0xff00ff)
					       + (i_1087_ & 0xff00ff));
				i_1087_ = ((i_1089_ & 0x1000100)
					   + (i_1088_ - i_1089_ & 0x10000));
				is[i_994_++]
				    = i_1088_ - i_1087_ | i_1087_ - (i_1087_
								     >>> 8);
			    } else
				i_994_++;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 3) {
		    for (int i_1090_ = -i_996_; i_1090_ < 0; i_1090_++) {
			for (int i_1091_ = -i_997_; i_1091_ < 0; i_1091_++) {
			    int i_1092_ = ((bp) this).H[i_995_++];
			    int i_1093_ = i_1092_ + i_991_;
			    int i_1094_
				= (i_1092_ & 0xff00ff) + (i_991_ & 0xff00ff);
			    int i_1095_ = ((i_1094_ & 0x1000100)
					   + (i_1093_ - i_1094_ & 0x10000));
			    i_1092_ = i_1093_ - i_1095_ | i_1095_ - (i_1095_
								     >>> 8);
			    i_1095_ = is[i_994_];
			    i_1093_ = i_1092_ + i_1095_;
			    i_1094_
				= (i_1092_ & 0xff00ff) + (i_1095_ & 0xff00ff);
			    i_1095_
				= (i_1094_ & 0x1000100) + (i_1093_ - i_1094_
							   & 0x10000);
			    is[i_994_++]
				= i_1093_ - i_1095_ | i_1095_ - (i_1095_
								 >>> 8);
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		if (i_990_ == 2) {
		    int i_1096_ = i_991_ >>> 24;
		    int i_1097_ = 256 - i_1096_;
		    int i_1098_ = (i_991_ & 0xff00ff) * i_1097_ & ~0xff00ff;
		    int i_1099_ = (i_991_ & 0xff00) * i_1097_ & 0xff0000;
		    i_991_ = (i_1098_ | i_1099_) >>> 8;
		    for (int i_1100_ = -i_996_; i_1100_ < 0; i_1100_++) {
			for (int i_1101_ = -i_997_; i_1101_ < 0; i_1101_++) {
			    int i_1102_ = ((bp) this).H[i_995_++];
			    if (i_1102_ != 0) {
				i_1098_ = ((i_1102_ & 0xff00ff) * i_1096_
					   & ~0xff00ff);
				i_1099_
				    = (i_1102_ & 0xff00) * i_1096_ & 0xff0000;
				i_1102_ = ((i_1098_ | i_1099_) >>> 8) + i_991_;
				int i_1103_ = is[i_994_];
				int i_1104_ = i_1102_ + i_1103_;
				int i_1105_ = ((i_1102_ & 0xff00ff)
					       + (i_1103_ & 0xff00ff));
				i_1103_ = ((i_1105_ & 0x1000100)
					   + (i_1104_ - i_1105_ & 0x10000));
				is[i_994_++]
				    = i_1104_ - i_1103_ | i_1103_ - (i_1103_
								     >>> 8);
			    } else
				i_994_++;
			}
			i_994_ += i_998_;
			i_995_ += i_999_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void YA(int i, int i_1106_, int i_1107_, int i_1108_, int i_1109_,
		  int i_1110_, int i_1111_, int i_1112_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	if (i_1107_ > 0 && i_1108_ > 0) {
	    int i_1113_ = 0;
	    int i_1114_ = 0;
	    int i_1115_ = ((nga) ((qp) this).b).C;
	    int i_1116_ = ((qp) this).E + ((qp) this).k + ((qp) this).q;
	    int i_1117_ = ((qp) this).f + ((qp) this).o + ((qp) this).C;
	    int i_1118_ = (i_1116_ << 16) / i_1107_;
	    int i_1119_ = (i_1117_ << 16) / i_1108_;
	    if (((qp) this).E > 0) {
		int i_1120_ = ((((qp) this).E << 16) + i_1118_ - 1) / i_1118_;
		i += i_1120_;
		i_1113_ += i_1120_ * i_1118_ - (((qp) this).E << 16);
	    }
	    if (((qp) this).f > 0) {
		int i_1121_ = ((((qp) this).f << 16) + i_1119_ - 1) / i_1119_;
		i_1106_ += i_1121_;
		i_1114_ += i_1121_ * i_1119_ - (((qp) this).f << 16);
	    }
	    if (((qp) this).k < i_1116_)
		i_1107_ = (((((qp) this).k << 16) - i_1113_ + i_1118_ - 1)
			   / i_1118_);
	    if (((qp) this).o < i_1117_)
		i_1108_ = (((((qp) this).o << 16) - i_1114_ + i_1119_ - 1)
			   / i_1119_);
	    int i_1122_ = i + i_1106_ * i_1115_;
	    int i_1123_ = i_1115_ - i_1107_;
	    if (i_1106_ + i_1108_ > ((nga) ((qp) this).b).cb)
		i_1108_ -= i_1106_ + i_1108_ - ((nga) ((qp) this).b).cb;
	    if (i_1106_ < ((nga) ((qp) this).b).u) {
		int i_1124_ = ((nga) ((qp) this).b).u - i_1106_;
		i_1108_ -= i_1124_;
		i_1122_ += i_1124_ * i_1115_;
		i_1114_ += i_1119_ * i_1124_;
	    }
	    if (i + i_1107_ > ((nga) ((qp) this).b).B) {
		int i_1125_ = i + i_1107_ - ((nga) ((qp) this).b).B;
		i_1107_ -= i_1125_;
		i_1123_ += i_1125_;
	    }
	    if (i < ((nga) ((qp) this).b).Y) {
		int i_1126_ = ((nga) ((qp) this).b).Y - i;
		i_1107_ -= i_1126_;
		i_1122_ += i_1126_;
		i_1113_ += i_1118_ * i_1126_;
		i_1123_ += i_1126_;
	    }
	    int[] is = ((nga) ((qp) this).b).H;
	    if (i_1111_ == 0) {
		if (i_1109_ == 1) {
		    int i_1127_ = i_1113_;
		    for (int i_1128_ = -i_1108_; i_1128_ < 0; i_1128_++) {
			int i_1129_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1130_ = -i_1107_; i_1130_ < 0; i_1130_++) {
			    is[i_1122_++]
				= ((bp) this).H[(i_1113_ >> 16) + i_1129_];
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1127_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 0) {
		    int i_1131_ = (i_1110_ & 0xff0000) >> 16;
		    int i_1132_ = (i_1110_ & 0xff00) >> 8;
		    int i_1133_ = i_1110_ & 0xff;
		    int i_1134_ = i_1113_;
		    for (int i_1135_ = -i_1108_; i_1135_ < 0; i_1135_++) {
			int i_1136_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1137_ = -i_1107_; i_1137_ < 0; i_1137_++) {
			    int i_1138_
				= ((bp) this).H[(i_1113_ >> 16) + i_1136_];
			    int i_1139_
				= (i_1138_ & 0xff0000) * i_1131_ & ~0xffffff;
			    int i_1140_
				= (i_1138_ & 0xff00) * i_1132_ & 0xff0000;
			    int i_1141_ = (i_1138_ & 0xff) * i_1133_ & 0xff00;
			    is[i_1122_++]
				= (i_1139_ | i_1140_ | i_1141_) >>> 8;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1134_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 3) {
		    int i_1142_ = i_1113_;
		    for (int i_1143_ = -i_1108_; i_1143_ < 0; i_1143_++) {
			int i_1144_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1145_ = -i_1107_; i_1145_ < 0; i_1145_++) {
			    int i_1146_
				= ((bp) this).H[(i_1113_ >> 16) + i_1144_];
			    int i_1147_ = i_1146_ + i_1110_;
			    int i_1148_
				= (i_1146_ & 0xff00ff) + (i_1110_ & 0xff00ff);
			    int i_1149_ = ((i_1148_ & 0x1000100)
					   + (i_1147_ - i_1148_ & 0x10000));
			    is[i_1122_++]
				= i_1147_ - i_1149_ | i_1149_ - (i_1149_
								 >>> 8);
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1142_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 2) {
		    int i_1150_ = i_1110_ >>> 24;
		    int i_1151_ = 256 - i_1150_;
		    int i_1152_ = (i_1110_ & 0xff00ff) * i_1151_ & ~0xff00ff;
		    int i_1153_ = (i_1110_ & 0xff00) * i_1151_ & 0xff0000;
		    i_1110_ = (i_1152_ | i_1153_) >>> 8;
		    int i_1154_ = i_1113_;
		    for (int i_1155_ = -i_1108_; i_1155_ < 0; i_1155_++) {
			int i_1156_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1157_ = -i_1107_; i_1157_ < 0; i_1157_++) {
			    int i_1158_
				= ((bp) this).H[(i_1113_ >> 16) + i_1156_];
			    i_1152_
				= (i_1158_ & 0xff00ff) * i_1150_ & ~0xff00ff;
			    i_1153_ = (i_1158_ & 0xff00) * i_1150_ & 0xff0000;
			    is[i_1122_++]
				= ((i_1152_ | i_1153_) >>> 8) + i_1110_;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1154_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_1111_ == 1) {
		if (i_1109_ == 1) {
		    int i_1159_ = i_1113_;
		    for (int i_1160_ = -i_1108_; i_1160_ < 0; i_1160_++) {
			int i_1161_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1162_ = -i_1107_; i_1162_ < 0; i_1162_++) {
			    int i_1163_
				= ((bp) this).H[(i_1113_ >> 16) + i_1161_];
			    int i_1164_ = i_1163_ >>> 24;
			    int i_1165_ = 256 - i_1164_;
			    int i_1166_ = is[i_1122_];
			    is[i_1122_++]
				= (((((i_1163_ & 0xff00ff) * i_1164_
				      + (i_1166_ & 0xff00ff) * i_1165_)
				     & ~0xff00ff)
				    >> 8)
				   + ((((i_1163_ & ~0xff00ff) >>> 8) * i_1164_
				       + (((i_1166_ & ~0xff00ff) >>> 8)
					  * i_1165_))
				      & ~0xff00ff));
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1159_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 0) {
		    int i_1167_ = i_1113_;
		    if ((i_1110_ & 0xffffff) == 16777215) {
			for (int i_1168_ = -i_1108_; i_1168_ < 0; i_1168_++) {
			    int i_1169_ = (i_1114_ >> 16) * ((qp) this).k;
			    for (int i_1170_ = -i_1107_; i_1170_ < 0;
				 i_1170_++) {
				int i_1171_
				    = ((bp) this).H[(i_1113_ >> 16) + i_1169_];
				int i_1172_
				    = (i_1171_ >>> 24) * (i_1110_ >>> 24) >> 8;
				int i_1173_ = 256 - i_1172_;
				int i_1174_ = is[i_1122_];
				is[i_1122_++]
				    = ((((i_1171_ & 0xff00ff) * i_1172_
					 + (i_1174_ & 0xff00ff) * i_1173_)
					& ~0xff00ff)
				       + (((i_1171_ & 0xff00) * i_1172_
					   + (i_1174_ & 0xff00) * i_1173_)
					  & 0xff0000)) >> 8;
				i_1113_ += i_1118_;
			    }
			    i_1114_ += i_1119_;
			    i_1113_ = i_1167_;
			    i_1122_ += i_1123_;
			}
		    } else {
			int i_1175_ = (i_1110_ & 0xff0000) >> 16;
			int i_1176_ = (i_1110_ & 0xff00) >> 8;
			int i_1177_ = i_1110_ & 0xff;
			for (int i_1178_ = -i_1108_; i_1178_ < 0; i_1178_++) {
			    int i_1179_ = (i_1114_ >> 16) * ((qp) this).k;
			    for (int i_1180_ = -i_1107_; i_1180_ < 0;
				 i_1180_++) {
				int i_1181_
				    = ((bp) this).H[(i_1113_ >> 16) + i_1179_];
				int i_1182_
				    = (i_1181_ >>> 24) * (i_1110_ >>> 24) >> 8;
				int i_1183_ = 256 - i_1182_;
				if (i_1182_ != 255) {
				    int i_1184_
					= ((i_1181_ & 0xff0000) * i_1175_
					   & ~0xffffff);
				    int i_1185_ = ((i_1181_ & 0xff00) * i_1176_
						   & 0xff0000);
				    int i_1186_
					= (i_1181_ & 0xff) * i_1177_ & 0xff00;
				    i_1181_
					= (i_1184_ | i_1185_ | i_1186_) >>> 8;
				    int i_1187_ = is[i_1122_];
				    is[i_1122_++]
					= ((((i_1181_ & 0xff00ff) * i_1182_
					     + (i_1187_ & 0xff00ff) * i_1183_)
					    & ~0xff00ff)
					   + (((i_1181_ & 0xff00) * i_1182_
					       + (i_1187_ & 0xff00) * i_1183_)
					      & 0xff0000)) >> 8;
				} else {
				    int i_1188_
					= ((i_1181_ & 0xff0000) * i_1175_
					   & ~0xffffff);
				    int i_1189_ = ((i_1181_ & 0xff00) * i_1176_
						   & 0xff0000);
				    int i_1190_
					= (i_1181_ & 0xff) * i_1177_ & 0xff00;
				    is[i_1122_++]
					= (i_1188_ | i_1189_ | i_1190_) >>> 8;
				}
				i_1113_ += i_1118_;
			    }
			    i_1114_ += i_1119_;
			    i_1113_ = i_1167_;
			    i_1122_ += i_1123_;
			}
			return;
		    }
		    return;
		}
		if (i_1109_ == 3) {
		    int i_1191_ = i_1113_;
		    for (int i_1192_ = -i_1108_; i_1192_ < 0; i_1192_++) {
			int i_1193_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1194_ = -i_1107_; i_1194_ < 0; i_1194_++) {
			    int i_1195_
				= ((bp) this).H[(i_1113_ >> 16) + i_1193_];
			    int i_1196_ = i_1195_ + i_1110_;
			    int i_1197_
				= (i_1195_ & 0xff00ff) + (i_1110_ & 0xff00ff);
			    int i_1198_ = ((i_1197_ & 0x1000100)
					   + (i_1196_ - i_1197_ & 0x10000));
			    i_1198_ = i_1196_ - i_1198_ | i_1198_ - (i_1198_
								     >>> 8);
			    int i_1199_
				= (i_1198_ >>> 24) * (i_1110_ >>> 24) >> 8;
			    int i_1200_ = 256 - i_1199_;
			    if (i_1199_ != 255) {
				i_1195_ = i_1198_;
				i_1198_ = is[i_1122_];
				i_1198_ = ((((i_1195_ & 0xff00ff) * i_1199_
					     + (i_1198_ & 0xff00ff) * i_1200_)
					    & ~0xff00ff)
					   + (((i_1195_ & 0xff00) * i_1199_
					       + (i_1198_ & 0xff00) * i_1200_)
					      & 0xff0000)) >> 8;
			    }
			    is[i_1122_++] = i_1198_;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1191_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 2) {
		    int i_1201_ = i_1110_ >>> 24;
		    int i_1202_ = 256 - i_1201_;
		    int i_1203_ = (i_1110_ & 0xff00ff) * i_1202_ & ~0xff00ff;
		    int i_1204_ = (i_1110_ & 0xff00) * i_1202_ & 0xff0000;
		    i_1110_ = (i_1203_ | i_1204_) >>> 8;
		    int i_1205_ = i_1113_;
		    for (int i_1206_ = -i_1108_; i_1206_ < 0; i_1206_++) {
			int i_1207_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1208_ = -i_1107_; i_1208_ < 0; i_1208_++) {
			    int i_1209_
				= ((bp) this).H[(i_1113_ >> 16) + i_1207_];
			    int i_1210_ = i_1209_ >>> 24;
			    int i_1211_ = 256 - i_1210_;
			    i_1203_
				= (i_1209_ & 0xff00ff) * i_1201_ & ~0xff00ff;
			    i_1204_ = (i_1209_ & 0xff00) * i_1201_ & 0xff0000;
			    i_1209_ = ((i_1203_ | i_1204_) >>> 8) + i_1110_;
			    int i_1212_ = is[i_1122_];
			    is[i_1122_++]
				= ((((i_1209_ & 0xff00ff) * i_1210_
				     + (i_1212_ & 0xff00ff) * i_1211_)
				    & ~0xff00ff)
				   + (((i_1209_ & 0xff00) * i_1210_
				       + (i_1212_ & 0xff00) * i_1211_)
				      & 0xff0000)) >> 8;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1205_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (i_1111_ == 2) {
		if (i_1109_ == 1) {
		    int i_1213_ = i_1113_;
		    for (int i_1214_ = -i_1108_; i_1214_ < 0; i_1214_++) {
			int i_1215_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1216_ = -i_1107_; i_1216_ < 0; i_1216_++) {
			    int i_1217_
				= ((bp) this).H[(i_1113_ >> 16) + i_1215_];
			    if (i_1217_ != 0) {
				int i_1218_ = is[i_1122_];
				int i_1219_ = i_1217_ + i_1218_;
				int i_1220_ = ((i_1217_ & 0xff00ff)
					       + (i_1218_ & 0xff00ff));
				i_1218_ = ((i_1220_ & 0x1000100)
					   + (i_1219_ - i_1220_ & 0x10000));
				is[i_1122_++]
				    = i_1219_ - i_1218_ | i_1218_ - (i_1218_
								     >>> 8);
			    } else
				i_1122_++;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1213_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 0) {
		    int i_1221_ = i_1113_;
		    int i_1222_ = (i_1110_ & 0xff0000) >> 16;
		    int i_1223_ = (i_1110_ & 0xff00) >> 8;
		    int i_1224_ = i_1110_ & 0xff;
		    for (int i_1225_ = -i_1108_; i_1225_ < 0; i_1225_++) {
			int i_1226_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1227_ = -i_1107_; i_1227_ < 0; i_1227_++) {
			    int i_1228_
				= ((bp) this).H[(i_1113_ >> 16) + i_1226_];
			    if (i_1228_ != 0) {
				int i_1229_ = ((i_1228_ & 0xff0000) * i_1222_
					       & ~0xffffff);
				int i_1230_
				    = (i_1228_ & 0xff00) * i_1223_ & 0xff0000;
				int i_1231_
				    = (i_1228_ & 0xff) * i_1224_ & 0xff00;
				i_1228_ = (i_1229_ | i_1230_ | i_1231_) >>> 8;
				int i_1232_ = is[i_1122_];
				int i_1233_ = i_1228_ + i_1232_;
				int i_1234_ = ((i_1228_ & 0xff00ff)
					       + (i_1232_ & 0xff00ff));
				i_1232_ = ((i_1234_ & 0x1000100)
					   + (i_1233_ - i_1234_ & 0x10000));
				is[i_1122_++]
				    = i_1233_ - i_1232_ | i_1232_ - (i_1232_
								     >>> 8);
			    } else
				i_1122_++;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1221_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 3) {
		    int i_1235_ = i_1113_;
		    for (int i_1236_ = -i_1108_; i_1236_ < 0; i_1236_++) {
			int i_1237_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1238_ = -i_1107_; i_1238_ < 0; i_1238_++) {
			    int i_1239_
				= ((bp) this).H[(i_1113_ >> 16) + i_1237_];
			    int i_1240_ = i_1239_ + i_1110_;
			    int i_1241_
				= (i_1239_ & 0xff00ff) + (i_1110_ & 0xff00ff);
			    int i_1242_ = ((i_1241_ & 0x1000100)
					   + (i_1240_ - i_1241_ & 0x10000));
			    i_1239_ = i_1240_ - i_1242_ | i_1242_ - (i_1242_
								     >>> 8);
			    i_1242_ = is[i_1122_];
			    i_1240_ = i_1239_ + i_1242_;
			    i_1241_
				= (i_1239_ & 0xff00ff) + (i_1242_ & 0xff00ff);
			    i_1242_
				= (i_1241_ & 0x1000100) + (i_1240_ - i_1241_
							   & 0x10000);
			    is[i_1122_++]
				= i_1240_ - i_1242_ | i_1242_ - (i_1242_
								 >>> 8);
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1235_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		if (i_1109_ == 2) {
		    int i_1243_ = i_1110_ >>> 24;
		    int i_1244_ = 256 - i_1243_;
		    int i_1245_ = (i_1110_ & 0xff00ff) * i_1244_ & ~0xff00ff;
		    int i_1246_ = (i_1110_ & 0xff00) * i_1244_ & 0xff0000;
		    i_1110_ = (i_1245_ | i_1246_) >>> 8;
		    int i_1247_ = i_1113_;
		    for (int i_1248_ = -i_1108_; i_1248_ < 0; i_1248_++) {
			int i_1249_ = (i_1114_ >> 16) * ((qp) this).k;
			for (int i_1250_ = -i_1107_; i_1250_ < 0; i_1250_++) {
			    int i_1251_
				= ((bp) this).H[(i_1113_ >> 16) + i_1249_];
			    if (i_1251_ != 0) {
				i_1245_ = ((i_1251_ & 0xff00ff) * i_1243_
					   & ~0xff00ff);
				i_1246_
				    = (i_1251_ & 0xff00) * i_1243_ & 0xff0000;
				i_1251_
				    = ((i_1245_ | i_1246_) >>> 8) + i_1110_;
				int i_1252_ = is[i_1122_];
				int i_1253_ = i_1251_ + i_1252_;
				int i_1254_ = ((i_1251_ & 0xff00ff)
					       + (i_1252_ & 0xff00ff));
				i_1252_ = ((i_1254_ & 0x1000100)
					   + (i_1253_ - i_1254_ & 0x10000));
				is[i_1122_++]
				    = i_1253_ - i_1252_ | i_1252_ - (i_1252_
								     >>> 8);
			    } else
				i_1122_++;
			    i_1113_ += i_1118_;
			}
			i_1114_ += i_1119_;
			i_1113_ = i_1247_;
			i_1122_ += i_1123_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void xa(int i, int i_1255_, int i_1256_) {
	if (i_1256_ == 0) {
	    int[] is = ((nga) ((qp) this).b).H;
	    for (int i_1257_ = 0; i_1257_ < ((qp) this).o; i_1257_++) {
		int i_1258_ = i_1257_ * ((qp) this).k;
		int i_1259_
		    = (i_1255_ + i_1257_) * ((nga) ((qp) this).b).C + i;
		for (int i_1260_ = 0; i_1260_ < ((qp) this).k; i_1260_++)
		    ((bp) this).H[i_1258_ + i_1260_]
			= (((bp) this).H[i_1258_ + i_1260_] & 0xffffff
			   | is[i_1259_ + i_1260_] << 8 & ~0xffffff);
	    }
	} else if (i_1256_ == 1) {
	    int[] is = ((nga) ((qp) this).b).H;
	    for (int i_1261_ = 0; i_1261_ < ((qp) this).o; i_1261_++) {
		int i_1262_ = i_1261_ * ((qp) this).k;
		int i_1263_
		    = (i_1255_ + i_1261_) * ((nga) ((qp) this).b).C + i;
		for (int i_1264_ = 0; i_1264_ < ((qp) this).k; i_1264_++)
		    ((bp) this).H[i_1262_ + i_1264_]
			= (((bp) this).H[i_1262_ + i_1264_] & 0xffffff
			   | is[i_1263_ + i_1264_] << 16 & ~0xffffff);
	    }
	} else if (i_1256_ == 2) {
	    int[] is = ((nga) ((qp) this).b).H;
	    for (int i_1265_ = 0; i_1265_ < ((qp) this).o; i_1265_++) {
		int i_1266_ = i_1265_ * ((qp) this).k;
		int i_1267_
		    = (i_1255_ + i_1265_) * ((nga) ((qp) this).b).C + i;
		for (int i_1268_ = 0; i_1268_ < ((qp) this).k; i_1268_++)
		    ((bp) this).H[i_1266_ + i_1268_]
			= (((bp) this).H[i_1266_ + i_1268_] & 0xffffff
			   | is[i_1267_ + i_1268_] << 24 & ~0xffffff);
	    }
	} else if (i_1256_ == 3) {
	    int[] is = ((nga) ((qp) this).b).H;
	    for (int i_1269_ = 0; i_1269_ < ((qp) this).o; i_1269_++) {
		int i_1270_ = i_1269_ * ((qp) this).k;
		int i_1271_
		    = (i_1255_ + i_1269_) * ((nga) ((qp) this).b).C + i;
		for (int i_1272_ = 0; i_1272_ < ((qp) this).k; i_1272_++)
		    ((bp) this).H[i_1270_ + i_1272_]
			= (((bp) this).H[i_1270_ + i_1272_] & 0xffffff
			   | (is[i_1271_ + i_1272_] != 0 ? -16777216 : 0));
	    }
	}
    }
}
