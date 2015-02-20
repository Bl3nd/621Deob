/* mda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

final class mda extends mca
{
    static int H;
    static int I;
    static int J;
    static int K;
    static int L;
    private int M = 6;
    static int N;
    static int O;
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_1_ = j;
	do {
	    if (i_1_ != 0) {
		if (i_1_ != 1)
		    break;
	    } else {
		M = bytesParser.readUnsignedByte(-9268);
		break;
	    }
	    ((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	} while (false);
	if (i == 1)
	    K++;
    }
    
    final int[] a(int i, int j) {
	O++;
	int[] is = ((mca) this).s.a(j, true);
	int i_3_ = -67 % ((i - 81) / 36);
    while_93_:
	do {
	    if (((oca) ((mca) this).s).o) {
		int[] is_4_ = this.a(j, false, 0);
		int[] is_5_ = this.a(j, false, 1);
		int i_6_ = M;
	    while_92_:
		do {
		while_91_:
		    do {
		    while_90_:
			do {
			while_89_:
			    do {
			    while_88_:
				do {
				while_87_:
				    do {
				    while_86_:
					do {
					while_85_:
					    do {
					    while_84_:
						do {
						    do {
							if (i_6_ != 1) {
							    if (i_6_ != 2) {
								if (i_6_
								    != 3) {
								    if (i_6_
									!= 4) {
									if (i_6_
									    != 5) {
									    if (i_6_ != 6) {
										if (i_6_ != 7) {
										    if (i_6_ != 8) {
											if (i_6_ != 9) {
											    if (i_6_ != 10) {
												if (i_6_ != 11) {
												    if (i_6_ != 12)
													break while_93_;
												} else
												    break while_91_;
												break while_92_;
											    }
											} else
											    break while_89_;
											break while_90_;
										    }
										} else
										    break while_87_;
										break while_88_;
									    }
									} else
									    break while_85_;
									break while_86_;
								    }
								} else
								    break;
								break while_84_;
							    }
							} else {
							    for (i_6_ = 0;
								 fr.v > i_6_;
								 i_6_++)
								is[i_6_]
								    = ((is_4_
									[i_6_])
								       + (is_5_
									  [i_6_]));
							    break while_93_;
							}
							for (i_6_ = 0;
							     fr.v > i_6_;
							     i_6_++)
							    is[i_6_]
								= (is_4_[i_6_]
								   - (is_5_
								      [i_6_]));
							break while_93_;
						    } while (false);
						    for (i_6_ = 0; i_6_ < fr.v;
							 i_6_++)
							is[i_6_]
							    = ((is_5_[i_6_]
								* is_4_[i_6_])
							       >> 12);
						    break while_93_;
						} while (false);
						for (i_6_ = 0; fr.v > i_6_;
						     i_6_++) {
						    int i_7_ = is_5_[i_6_];
						    is[i_6_]
							= (i_7_ == 0 ? 4096
							   : (is_4_[i_6_]
							      << 12) / i_7_);
						}
						break while_93_;
					    } while (false);
					    for (i_6_ = 0; i_6_ < fr.v; i_6_++)
						is[i_6_]
						    = -(((-is_5_[i_6_] + 4096)
							 * (4096
							    - is_4_[i_6_]))
							>> 12) + 4096;
					    break while_93_;
					} while (false);
					for (i_6_ = 0; i_6_ < fr.v; i_6_++) {
					    int i_8_ = is_5_[i_6_];
					    is[i_6_]
						= (i_8_ < 2048
						   ? i_8_ * is_4_[i_6_] >> 11
						   : 4096 - (((-i_8_ + 4096)
							      * (-is_4_[i_6_]
								 + 4096))
							     >> 11));
					}
					break while_93_;
				    } while (false);
				    for (i_6_ = 0; i_6_ < fr.v; i_6_++) {
					int i_9_ = is_4_[i_6_];
					is[i_6_]
					    = (i_9_ != 4096
					       ? (is_5_[i_6_] << 12) / (4096
									- i_9_)
					       : 4096);
				    }
				    break while_93_;
				} while (false);
				for (i_6_ = 0; i_6_ < fr.v; i_6_++) {
				    int i_10_ = is_4_[i_6_];
				    is[i_6_] = (i_10_ == 0 ? 0
						: -((-is_5_[i_6_] + 4096 << 12)
						    / i_10_) + 4096);
				}
				break while_93_;
			    } while (false);
			    for (i_6_ = 0; fr.v > i_6_; i_6_++) {
				int i_11_ = is_4_[i_6_];
				int i_12_ = is_5_[i_6_];
				is[i_6_] = i_12_ > i_11_ ? i_11_ : i_12_;
			    }
			    break while_93_;
			} while (false);
			for (i_6_ = 0; i_6_ < fr.v; i_6_++) {
			    int i_13_ = is_5_[i_6_];
			    int i_14_ = is_4_[i_6_];
			    is[i_6_] = i_13_ < i_14_ ? i_14_ : i_13_;
			}
			break while_93_;
		    } while (false);
		    for (i_6_ = 0; fr.v > i_6_; i_6_++) {
			int i_15_ = is_4_[i_6_];
			int i_16_ = is_5_[i_6_];
			is[i_6_]
			    = i_16_ < i_15_ ? i_15_ - i_16_ : i_16_ - i_15_;
		    }
		    break while_93_;
		} while (false);
		for (i_6_ = 0; fr.v > i_6_; i_6_++) {
		    int i_17_ = is_4_[i_6_];
		    int i_18_ = is_5_[i_6_];
		    is[i_6_] = i_17_ - (i_17_ * i_18_ >> 11) + i_18_;
		}
	    }
	} while (false);
	return is;
    }
    
    static final void a(boolean bool) {
	if (dg.zb < 102)
	    dg.zb += 6;
	L++;
	if (Class_cb.g != -1 && naa.L < us.a(126)) {
	    for (int i = Class_cb.g; kaa.o.length > i; i++) {
		if (!kaa.o[i].startsWith("pause")) {
		    gca.l = kaa.o[i];
		    gl.a(false, (byte) -38);
		} else {
		    int i_19_ = 5;
		    try {
			i_19_ = Integer.parseInt(kaa.o[i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    ia.a(4, "Pausing for " + i_19_ + " seconds...");
		    Class_cb.g = i + 1;
		    naa.L = us.a(120) + (long) (1000 * i_19_);
		    return;
		}
	    }
	    Class_cb.g = -1;
	}
	if (fm.b != 0) {
	    cp.c -= 5 * fm.b;
	    if (cp.c >= wi.l)
		cp.c = wi.l - 1;
	    if (cp.c < 0)
		cp.c = 0;
	    fm.b = 0;
	}
	if (bool == true) {
	    for (int i = 0; i < Class_pb.i; i++) {
		au var_au = wca.c[i];
		int i_20_ = var_au.a((byte) -93);
		char c = var_au.a(true);
		int i_21_ = var_au.c(22858);
		if (i_20_ == 84)
		    gl.a(false, (byte) -114);
		if (i_20_ != 80) {
		    if (i_20_ == 66 && (i_21_ & 0x4) != 0) {
			if (sg.d != null) {
			    String string = "";
			    for (int i_22_ = Node.b.length - 1; i_22_ >= 0;
				 i_22_--) {
				if (Node.b[i_22_] != null
				    && Node.b[i_22_].length() > 0)
				    string += Node.b[i_22_] + '\n';
			    }
			    sg.d.setContents(new StringSelection(string),
					     null);
			}
		    } else if (i_20_ != 67 || (0x4 & i_21_) == 0) {
			if (i_20_ == 85 && qda.z > 0) {
			    gca.l = (gca.l.substring(0, qda.z - 1)
				     + gca.l.substring(qda.z));
			    qda.z--;
			} else if (i_20_ == 101 && qda.z < gca.l.length())
			    gca.l = (gca.l.substring(0, qda.z)
				     + gca.l.substring(qda.z + 1));
			else if (i_20_ == 96 && qda.z > 0)
			    qda.z--;
			else if (i_20_ == 97 && qda.z < gca.l.length())
			    qda.z++;
			else if (i_20_ == 102)
			    qda.z = 0;
			else if (i_20_ == 103)
			    qda.z = gca.l.length();
			else if (i_20_ == 104 && Entity.tc < Node.b.length) {
			    Entity.tc++;
			    rh.b((int) -1);
			    qda.z = gca.l.length();
			} else if (i_20_ == 105 && Entity.tc > 0) {
			    Entity.tc--;
			    rh.b((int) -1);
			    qda.z = gca.l.length();
			} else if (nq.a(-118, c) || c == ':' || c == ','
				   || c == ' ' || c == '_' || c == '-'
				   || c == '+' || c == '[' || c == ']') {
			    gca.l
				= (gca.l.substring(0, qda.z) + wca.c[i].a(true)
				   + gca.l.substring(qda.z));
			    qda.z++;
			}
		    } else if (sg.d != null) {
			Transferable transferable = sg.d.getContents(null);
			if (transferable != null) {
			    try {
				String string
				    = (String) (transferable.getTransferData
						(DataFlavor.stringFlavor));
				if (string != null) {
				    String[] strings
					= vq.a(-122, string, '\n');
				    if (strings.length > 1) {
					for (int i_23_ = 0;
					     i_23_ < strings.length; i_23_++) {
					    if (strings[i_23_]
						    .startsWith("pause")) {
						int i_24_ = 5;
						try {
						    i_24_ = (Integer.parseInt
							     (strings
								  [i_23_]
								  .substring
							      (6)));
						} catch (Exception exception) {
						    /* empty */
						}
						ia.a(4, ("Pausing for " + i_24_
							 + " seconds..."));
						kaa.o = strings;
						Class_cb.g = i_23_ + 1;
						naa.L = (us.a(97)
							 + (long) (i_24_
								   * 1000));
						return;
					    }
					    gca.l = strings[i_23_];
					    gl.a(false, (byte) -31);
					}
				    } else
					gca.l += (String) string;
				}
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		} else
		    gl.a(true, (byte) -123);
	    }
	    Class_pb.i = 0;
	    ar.Q = 0;
	    fda.a(0);
	}
    }
    
    final int[][] a(int i, boolean bool) {
	if (bool != true)
	    a(-12, 21);
	I++;
	int[][] is = ((mca) this).B.a(i, -111);
    while_103_:
	do {
	    if (((td) ((mca) this).B).p) {
		int[][] is_25_ = this.a(0, i, 0);
		int[][] is_26_ = this.a(1, i, 0);
		int[] is_27_ = is[0];
		int[] is_28_ = is[1];
		int[] is_29_ = is[2];
		int[] is_30_ = is_25_[0];
		int[] is_31_ = is_25_[1];
		int[] is_32_ = is_25_[2];
		int[] is_33_ = is_26_[0];
		int[] is_34_ = is_26_[1];
		int[] is_35_ = is_26_[2];
		int i_36_ = M;
	    while_102_:
		do {
		while_101_:
		    do {
		    while_100_:
			do {
			while_99_:
			    do {
			    while_98_:
				do {
				while_97_:
				    do {
				    while_96_:
					do {
					while_95_:
					    do {
					    while_94_:
						do {
						    do {
							if (i_36_ != 1) {
							    if (i_36_ != 2) {
								if (i_36_
								    != 3) {
								    if (i_36_
									!= 4) {
									if (i_36_
									    != 5) {
									    if (i_36_ != 6) {
										if (i_36_ != 7) {
										    if (i_36_ != 8) {
											if (i_36_ != 9) {
											    if (i_36_ != 10) {
												if (i_36_ != 11) {
												    if (i_36_ != 12)
													break while_103_;
												} else
												    break while_101_;
												break while_102_;
											    }
											} else
											    break while_99_;
											break while_100_;
										    }
										} else
										    break while_97_;
										break while_98_;
									    }
									} else
									    break while_95_;
									break while_96_;
								    }
								} else
								    break;
								break while_94_;
							    }
							} else {
							    for (i_36_ = 0;
								 fr.v > i_36_;
								 i_36_++) {
								is_27_[i_36_]
								    = ((is_30_
									[i_36_])
								       + (is_33_
									  [i_36_]));
								is_28_[i_36_]
								    = ((is_34_
									[i_36_])
								       + (is_31_
									  [i_36_]));
								is_29_[i_36_]
								    = ((is_35_
									[i_36_])
								       + (is_32_
									  [i_36_]));
							    }
							    break while_103_;
							}
							for (i_36_ = 0;
							     i_36_ < fr.v;
							     i_36_++) {
							    is_27_[i_36_]
								= ((is_30_
								    [i_36_])
								   - (is_33_
								      [i_36_]));
							    is_28_[i_36_]
								= ((is_31_
								    [i_36_])
								   - (is_34_
								      [i_36_]));
							    is_29_[i_36_]
								= ((is_32_
								    [i_36_])
								   - (is_35_
								      [i_36_]));
							}
							break while_103_;
						    } while (false);
						    for (i_36_ = 0;
							 fr.v > i_36_;
							 i_36_++) {
							is_27_[i_36_]
							    = ((is_30_[i_36_]
								* (is_33_
								   [i_36_]))
							       >> 12);
							is_28_[i_36_]
							    = ((is_34_[i_36_]
								* (is_31_
								   [i_36_]))
							       >> 12);
							is_29_[i_36_]
							    = ((is_32_[i_36_]
								* (is_35_
								   [i_36_]))
							       >> 12);
						    }
						    break while_103_;
						} while (false);
						for (i_36_ = 0; i_36_ < fr.v;
						     i_36_++) {
						    int i_37_ = is_35_[i_36_];
						    int i_38_ = is_34_[i_36_];
						    int i_39_ = is_33_[i_36_];
						    is_27_[i_36_]
							= (i_39_ == 0 ? 4096
							   : (is_30_[i_36_]
							      << 12) / i_39_);
						    is_28_[i_36_]
							= (i_38_ == 0 ? 4096
							   : (is_31_[i_36_]
							      << 12) / i_38_);
						    is_29_[i_36_]
							= (i_37_ == 0 ? 4096
							   : (is_32_[i_36_]
							      << 12) / i_37_);
						}
						break while_103_;
					    } while (false);
					    for (i_36_ = 0; i_36_ < fr.v;
						 i_36_++) {
						is_27_[i_36_]
						    = -(((-is_30_[i_36_]
							  + 4096)
							 * (4096
							    - is_33_[i_36_]))
							>> 12) + 4096;
						is_28_[i_36_]
						    = (4096
						       - (((-is_34_[i_36_]
							    + 4096)
							   * (-is_31_[i_36_]
							      + 4096))
							  >> 12));
						is_29_[i_36_]
						    = -(((-is_35_[i_36_]
							  + 4096)
							 * (4096
							    - is_32_[i_36_]))
							>> 12) + 4096;
					    }
					    break while_103_;
					} while (false);
					for (i_36_ = 0; i_36_ < fr.v;
					     i_36_++) {
					    int i_40_ = is_33_[i_36_];
					    int i_41_ = is_35_[i_36_];
					    int i_42_ = is_34_[i_36_];
					    is_27_[i_36_]
						= (i_40_ >= 2048
						   ? -(((4096 - i_40_)
							* (-is_30_[i_36_]
							   + 4096))
						       >> 11) + 4096
						   : (i_40_ * is_30_[i_36_]
						      >> 11));
					    is_28_[i_36_]
						= (i_42_ >= 2048
						   ? -(((4096 - i_42_)
							* (4096
							   - is_31_[i_36_]))
						       >> 11) + 4096
						   : (i_42_ * is_31_[i_36_]
						      >> 11));
					    is_29_[i_36_]
						= (i_41_ < 2048
						   ? (is_32_[i_36_] * i_41_
						      >> 11)
						   : -(((-i_41_ + 4096)
							* (4096
							   - is_32_[i_36_]))
						       >> 11) + 4096);
					}
					break while_103_;
				    } while (false);
				    for (i_36_ = 0; i_36_ < fr.v; i_36_++) {
					int i_43_ = is_31_[i_36_];
					int i_44_ = is_32_[i_36_];
					int i_45_ = is_30_[i_36_];
					is_27_[i_36_]
					    = (i_45_ != 4096
					       ? ((is_33_[i_36_] << 12)
						  / (-i_45_ + 4096))
					       : 4096);
					is_28_[i_36_]
					    = (i_43_ == 4096 ? 4096
					       : ((is_34_[i_36_] << 12)
						  / (-i_43_ + 4096)));
					is_29_[i_36_]
					    = (i_44_ == 4096 ? 4096
					       : ((is_35_[i_36_] << 12)
						  / (-i_44_ + 4096)));
				    }
				    break while_103_;
				} while (false);
				for (i_36_ = 0; i_36_ < fr.v; i_36_++) {
				    int i_46_ = is_32_[i_36_];
				    int i_47_ = is_30_[i_36_];
				    int i_48_ = is_31_[i_36_];
				    is_27_[i_36_]
					= i_47_ != 0 ? -((-is_33_[i_36_] + 4096
							  << 12)
							 / i_47_) + 4096 : 0;
				    is_28_[i_36_]
					= i_48_ != 0 ? -((4096 - is_34_[i_36_]
							  << 12)
							 / i_48_) + 4096 : 0;
				    is_29_[i_36_]
					= (i_46_ == 0 ? 0
					   : -((-is_35_[i_36_] + 4096 << 12)
					       / i_46_) + 4096);
				}
				break while_103_;
			    } while (false);
			    for (i_36_ = 0; i_36_ < fr.v; i_36_++) {
				int i_49_ = is_30_[i_36_];
				int i_50_ = is_35_[i_36_];
				int i_51_ = is_33_[i_36_];
				int i_52_ = is_34_[i_36_];
				int i_53_ = is_31_[i_36_];
				int i_54_ = is_32_[i_36_];
				is_27_[i_36_] = i_51_ > i_49_ ? i_49_ : i_51_;
				is_28_[i_36_] = i_52_ <= i_53_ ? i_52_ : i_53_;
				is_29_[i_36_] = i_50_ <= i_54_ ? i_50_ : i_54_;
			    }
			    break while_103_;
			} while (false);
			for (i_36_ = 0; i_36_ < fr.v; i_36_++) {
			    int i_55_ = is_35_[i_36_];
			    int i_56_ = is_33_[i_36_];
			    int i_57_ = is_31_[i_36_];
			    int i_58_ = is_32_[i_36_];
			    int i_59_ = is_30_[i_36_];
			    int i_60_ = is_34_[i_36_];
			    is_27_[i_36_] = i_56_ >= i_59_ ? i_56_ : i_59_;
			    is_28_[i_36_] = i_57_ <= i_60_ ? i_60_ : i_57_;
			    is_29_[i_36_] = i_55_ < i_58_ ? i_58_ : i_55_;
			}
			break while_103_;
		    } while (false);
		    for (i_36_ = 0; fr.v > i_36_; i_36_++) {
			int i_61_ = is_34_[i_36_];
			int i_62_ = is_32_[i_36_];
			int i_63_ = is_33_[i_36_];
			int i_64_ = is_35_[i_36_];
			int i_65_ = is_31_[i_36_];
			int i_66_ = is_30_[i_36_];
			is_27_[i_36_]
			    = i_63_ < i_66_ ? i_66_ - i_63_ : i_63_ - i_66_;
			is_28_[i_36_]
			    = i_65_ > i_61_ ? i_65_ - i_61_ : i_61_ - i_65_;
			is_29_[i_36_]
			    = i_62_ <= i_64_ ? i_64_ - i_62_ : i_62_ - i_64_;
		    }
		    break while_103_;
		} while (false);
		for (i_36_ = 0; i_36_ < fr.v; i_36_++) {
		    int i_67_ = is_34_[i_36_];
		    int i_68_ = is_35_[i_36_];
		    int i_69_ = is_32_[i_36_];
		    int i_70_ = is_31_[i_36_];
		    int i_71_ = is_30_[i_36_];
		    int i_72_ = is_33_[i_36_];
		    is_27_[i_36_] = i_71_ + i_72_ - (i_71_ * i_72_ >> 11);
		    is_28_[i_36_] = i_70_ - (-i_67_ + (i_70_ * i_67_ >> 11));
		    is_29_[i_36_] = i_69_ - (i_68_ * i_69_ >> 11) + i_68_;
		}
	    }
	} while (false);
	return is;
    }
    
    public mda() {
	super(2, false);
    }
    
    static final void a(int i, float f, float f_73_, float f_74_, byte[] is,
			Class_ab class_ab, float f_75_, int i_76_, int i_77_,
			int i_78_, int i_79_, float f_80_, int i_81_,
			int i_82_) {
	N++;
	int i_83_ = i_77_ * i_76_;
	float[] fs = new float[i_83_];
	for (int i_84_ = i_81_; i_84_ < i_78_; i_84_++) {
	    class_ab.a(f / (float) i_76_, i_82_, i_76_, 7,
		       f_75_ / (float) i_77_, fs, 0, i_77_,
		       f_73_ / (float) i_79_, i_79_, f_80_ * 127.0F);
	    int i_85_ = i;
	    f *= 2.0F;
	    for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
		is[i_85_] += fs[i_86_];
		i_85_++;
	    }
	    f_73_ *= 2.0F;
	    f_75_ *= 2.0F;
	    f_80_ *= f_74_;
	}
	int i_87_ = i;
	for (int i_88_ = 0; i_88_ < i_83_; i_88_++) {
	    is[i_87_] = (byte) (is[i_87_] + 127);
	    i_87_++;
	}
    }
    
    static final void a(byte i, int i_89_, int i_90_, int i_91_, int i_92_) {
	if (i <= 9)
	    a((byte) -9, 23, -116, -32, 102);
	if (Class_md.h <= i_89_ && i_89_ <= Class_db.o) {
	    i_91_ = sl.a(i_91_, 4095, vaa.xb, jga.v);
	    i_90_ = sl.a(i_90_, 4095, vaa.xb, jga.v);
	    ng.a(i_89_, i_90_, (byte) -80, i_92_, i_91_);
	}
	J++;
    }
}
