/* gl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gl extends cd
{
    static int E;
    static int F;
    static int G;
    static int H;
    static int I;
    static int J;
    static int K;
    int L = 99;
    static int M;
    static byte[][] N = new byte[50][];
    static il O;
    static int[] P = new int[8];
    static fh Q;
    /*synthetic*/ static Class R;
    
    final void a(int i, boolean bool, Class_r class_r, int i_0_, byte[] is,
		 wd[] var_wds) {
	K++;
	BytesParser var_es = new BytesParser(is);
	int i_1_ = -1;
	if (bool != true)
	    a(1, null, -100, null, 8, -77, null, 21, 121, -111, 22);
	for (;;) {
	    int i_2_ = var_es.i((byte) -16);
	    if (i_2_ == 0)
		break;
	    i_1_ += i_2_;
	    int i_3_ = 0;
	    for (;;) {
		int i_4_ = var_es.readSmart2(-13829);
		if (i_4_ == 0)
		    break;
		i_3_ += i_4_ - 1;
		int i_5_ = 0x3f & i_3_;
		int i_6_ = i_3_ >> 6 & 0x3f;
		int i_7_ = i_3_ >> 12;
		int i_8_ = var_es.readUnsignedByte(-9268);
		int i_9_ = i_8_ >> 2;
		int i_10_ = 0x3 & i_8_;
		int i_11_ = i + i_6_;
		int i_12_ = i_0_ + i_5_;
		if (i_11_ > 0 && i_12_ > 0 && ((cd) this).q - 1 > i_11_
		    && ((cd) this).C - 1 > i_12_) {
		    wd var_wd = null;
		    if (!((cd) this).b) {
			int i_13_ = i_7_;
			if ((tu.b[1][i_11_][i_12_] & 0x2) == 2)
			    i_13_--;
			if (i_13_ >= 0)
			    var_wd = var_wds[i_13_];
		    }
		    a(i_10_, var_wd, i_9_, class_r, -1, i_7_, -12, i_1_, i_12_,
		      i_7_, i_11_);
		}
	    }
	}
    }
    
    final void a(int i, wd var_wd, int i_14_, int i_15_, int i_16_, int i_17_,
		 Class_r class_r) {
	I++;
	vda var_vda = null;
	if (i_16_ == 0)
	    var_vda = (vda) Class_nb.a(i_15_, i, i_17_);
	if (i_16_ == 1)
	    var_vda = (vda) ej.a(i_15_, i, i_17_);
	if (i_16_ == 2)
	    var_vda
		= (vda) ik.a(i_15_, i, i_17_, R != null ? R : (R = a("vda")));
	if (i_16_ == 3)
	    var_vda = (vda) lr.a(i_15_, i, i_17_);
	if (i_14_ != 99)
	    Q = null;
	if (var_vda != null) {
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 81, var_vda.b((byte) 127));
	    int i_18_ = var_vda.a((byte) 42);
	    int i_19_ = var_vda.c((byte) 91);
	    if (var_bda.a((byte) 126))
		su.a(i_17_, i_15_, i, true, var_bda);
	    if (var_vda.a(3755))
		var_vda.b((byte) -114, class_r);
	    if (i_16_ != 0) {
		do {
		    if (i_16_ != 1) {
			if (i_16_ != 2) {
			    if (i_16_ == 3) {
				mm.a(i_15_, i, i_17_);
				if (((ObjectDef) var_bda).ab == 1)
				    var_wd.a(i, (int) 116, i_17_);
			    }
			} else {
			    ItemDef.a(i_15_, i, i_17_,
				 R != null ? R : (R = a("vda")));
			    if (((ObjectDef) var_bda).ab == 0
				|| ((ObjectDef) var_bda).A + i >= ((cd) this).q
				|| ((ObjectDef) var_bda).A + i_17_ >= ((cd) this).C
				|| ((ObjectDef) var_bda).J + i >= ((cd) this).q
				|| i_17_ + ((ObjectDef) var_bda).J >= ((cd) this).C)
				break;
			    var_wd.a(-99, ((ObjectDef) var_bda).J, i_19_,
				     ((ObjectDef) var_bda).A, ((ObjectDef) var_bda).qb, i,
				     !((ObjectDef) var_bda).y, i_17_);
			}
			break;
		    }
		    kv.a(i_15_, i, i_17_);
		} while (false);
	    } else {
		bg.a(i_15_, i, i_17_);
		if (((ObjectDef) var_bda).ab != 0)
		    var_wd.b(!((ObjectDef) var_bda).y, i_18_, i_17_, -125, i,
			     ((ObjectDef) var_bda).qb, i_19_);
		if (((ObjectDef) var_bda).vb == 1) {
		    if (i_19_ != 0) {
			if (i_19_ == 1)
			    bq.a(i_17_ + 1, i, 2, i_15_, (byte) 41);
			else if (i_19_ != 2) {
			    if (i_19_ == 3)
				bq.a(i_17_, i, 2, i_15_, (byte) 41);
			} else
			    bq.a(i_17_, i + 1, 1, i_15_, (byte) 41);
		    } else
			bq.a(i_17_, i, 1, i_15_, (byte) 41);
		}
	    }
	}
    }
    
    public static void b(int i) {
	int i_20_ = -82 / ((i - 50) / 61);
	Q = null;
	O = null;
	P = null;
	N = null;
    }
    
    final void a(boolean bool, byte i, Class_r class_r) {
	Class_j.a();
	M++;
	if (!bool) {
	    if (((cd) this).s > 1) {
		for (int i_21_ = 0; i_21_ < ((cd) this).q; i_21_++) {
		    for (int i_22_ = 0; i_22_ < ((cd) this).C; i_22_++) {
			if ((tu.b[1][i_21_][i_22_] & 0x2) == 2)
			    ht.a(i_21_, i_22_);
		    }
		}
	    }
	    for (int i_23_ = 0; i_23_ < ((cd) this).s; i_23_++) {
		for (int i_24_ = 0; i_24_ <= ((cd) this).C; i_24_++) {
		    for (int i_25_ = 0; i_25_ <= ((cd) this).q; i_25_++) {
			if ((0x4 & ((cd) this).v[i_23_][i_25_][i_24_]) != 0) {
			    int i_26_ = i_25_;
			    int i_27_ = i_25_;
			    int i_28_ = i_24_;
			    int i_29_ = i_24_;
			    for (/**/;
				 (i_28_ > 0
				  && (((cd) this).v[i_23_][i_25_][i_28_ - 1]
				      & 0x4) != 0);
				 i_28_--) {
				if (i_29_ - i_28_ >= 10)
				    break;
			    }
			    for (/**/;
				 (i_29_ < ((cd) this).C
				  && (((cd) this).v[i_23_][i_25_][i_29_ + 1]
				      & 0x4) != 0);
				 i_29_++) {
				if (i_29_ - i_28_ >= 10)
				    break;
			    }
			while_46_:
			    for (/**/; i_26_ > 0; i_26_--) {
				if (i_27_ - i_26_ >= 10)
				    break;
				for (int i_30_ = i_28_; i_30_ <= i_29_;
				     i_30_++) {
				    if ((((cd) this).v[i_23_][i_26_ - 1][i_30_]
					 & 0x4)
					== 0)
					break while_46_;
				}
			    }
			while_47_:
			    for (/**/;
				 ((cd) this).q > i_27_ && i_27_ - i_26_ < 10;
				 i_27_++) {
				for (int i_31_ = i_28_; i_29_ >= i_31_;
				     i_31_++) {
				    if ((0x4 & (((cd) this).v[i_23_][i_27_ + 1]
						[i_31_]))
					== 0)
					break while_47_;
				}
			    }
			    if ((i_27_ + 1 - i_26_) * (i_29_ + (-i_28_ + 1))
				>= 4) {
				int i_32_ = ((cd) this).i[i_23_][i_26_][i_28_];
				vm.a(i_26_ << 9, i_23_, 4, (i_29_ << 9) + 512,
				     i_28_ << 9, i + 14512, (i_27_ << 9) + 512,
				     i_32_, i_32_);
				for (int i_33_ = i_26_; i_33_ <= i_27_;
				     i_33_++) {
				    for (int i_34_ = i_28_; i_34_ <= i_29_;
					 i_34_++)
					((cd) this).v[i_23_][i_33_][i_34_]
					    = (byte) uca.a((((cd) this).v
							    [i_23_][i_33_]
							    [i_34_]),
							   -5);
				}
			    }
			}
		    }
		}
	    }
	    qn.b((byte) -126);
	}
	((cd) this).v = null;
	if (i != 45)
	    b(72);
    }
    
    final void a(Class_r class_r, int i, BytesParser var_es, int[] is, int i_35_,
		 int i_36_) {
	E++;
	if (!((cd) this).b) {
	    if (i_35_ != 6714)
		a(null, 24, null, null, 110, 5);
	    boolean bool = false;
	    Class_mc class_mc = null;
	    if (is != null)
		is[0] = -1;
	    while (((BytesParser) var_es).bytes.length > ((BytesParser) var_es).pos) {
		int i_37_ = var_es.readUnsignedByte(i_35_ - 15982);
		if (i_37_ == 0)
		    class_mc = new Class_mc(var_es);
		else if (i_37_ == 1) {
		    int i_38_ = var_es.readUnsignedByte(-9268);
		    if (i_38_ > 0) {
			for (int i_39_ = 0; i_38_ > i_39_; i_39_++) {
			    qd var_qd = new qd(class_r, var_es, 2);
			    if (((qd) var_qd).l == 31) {
				df var_df = lr.k.a(true, var_es.readShort(13111));
				var_qd.a(((df) var_df).e, ((df) var_df).d,
					 ((df) var_df).g, 10236,
					 ((df) var_df).a);
			    }
			    if (class_r.c() > 0) {
				gga var_gga = ((qd) var_qd).m;
				int i_40_ = var_gga.a(true) + (i_36_ << 9);
				int i_41_ = var_gga.b((byte) 119) + (i << 9);
				int i_42_ = i_40_ >> 9;
				int i_43_ = i_41_ >> 9;
				if (i_42_ >= 0 && i_43_ >= 0
				    && ((cd) this).q > i_42_
				    && i_43_ < ((cd) this).C) {
				    var_gga.a(i_40_, i_41_, (byte) -23,
					      ((((cd) this).i[((qd) var_qd).o]
						[i_42_][i_43_])
					       - var_gga.i(-51)));
				    pt.a(var_qd);
				}
			    }
			}
		    }
		} else if (i_37_ != 2) {
		    if (i_37_ == 128) {
			if (is == null)
			    ((BytesParser) var_es).pos += 10;
			else {
			    is[0] = var_es.readShort(13111);
			    is[1] = var_es.readShort2(mv.a(i_35_, 6682));
			    is[2] = var_es.readShort2(mv.a(i_35_, 6779));
			    is[3] = var_es.readShort2(i_35_ - 6629);
			    is[4] = var_es.readShort(13111);
			}
		    } else {
			if (i_37_ != 129)
			    throw new IllegalStateException("");
			if (((cd) this).w == null)
			    ((cd) this).w = new byte[4][][];
			for (int i_44_ = 0; i_44_ < 4; i_44_++) {
			    byte i_45_ = var_es.readByte(-20933);
			    if (i_45_ == 0 && ((cd) this).w[i_44_] != null) {
				int i_46_ = i_36_;
				int i_47_ = i_36_ + 64;
				int i_48_ = i;
				if (i_46_ >= 0) {
				    if (i_46_ >= ((cd) this).q)
					i_46_ = ((cd) this).q;
				} else
				    i_46_ = 0;
				if (i_48_ < 0)
				    i_48_ = 0;
				else if (i_48_ >= ((cd) this).C)
				    i_48_ = ((cd) this).C;
				if (i_47_ < 0)
				    i_47_ = 0;
				else if (((cd) this).q <= i_47_)
				    i_47_ = ((cd) this).q;
				int i_49_ = i + 64;
				if (i_49_ >= 0) {
				    if (((cd) this).C <= i_49_)
					i_49_ = ((cd) this).C;
				} else
				    i_49_ = 0;
				for (/**/; i_46_ < i_47_; i_46_++) {
				    for (/**/; i_48_ < i_49_; i_48_++)
					((cd) this).w[i_44_][i_46_][i_48_]
					    = (byte) 0;
				}
			    } else if (i_45_ == 1) {
				if (((cd) this).w[i_44_] == null)
				    ((cd) this).w[i_44_]
					= (new byte[((cd) this).q + 1]
					   [((cd) this).C + 1]);
				for (int i_50_ = 0; i_50_ < 64; i_50_ += 4) {
				    for (int i_51_ = 0; i_51_ < 64;
					 i_51_ += 4) {
					byte i_52_ = var_es.readByte(-20933);
					for (int i_53_ = i_36_ + i_50_;
					     i_53_ < i_36_ + i_50_ + 4;
					     i_53_++) {
					    for (int i_54_ = i_51_ + i;
						 i + 4 + i_51_ > i_54_;
						 i_54_++) {
						if (i_53_ >= 0
						    && i_53_ < ((cd) this).q
						    && i_54_ >= 0
						    && ((cd) this).C > i_54_)
						    ((cd) this).w[i_44_]
							[i_53_][i_54_]
							= i_52_;
					    }
					}
				    }
				}
			    } else if (i_45_ == 2) {
				if (((cd) this).w[i_44_] == null)
				    ((cd) this).w[i_44_]
					= (new byte[((cd) this).q + 1]
					   [((cd) this).C + 1]);
				if (i_44_ > 0) {
				    int i_55_ = i_36_;
				    int i_56_ = i_36_ + 64;
				    int i_57_ = i;
				    if (i_56_ < 0)
					i_56_ = 0;
				    else if (((cd) this).q <= i_56_)
					i_56_ = ((cd) this).q;
				    if (i_55_ < 0)
					i_55_ = 0;
				    else if (((cd) this).q <= i_55_)
					i_55_ = ((cd) this).q;
				    if (i_57_ < 0)
					i_57_ = 0;
				    else if (((cd) this).C <= i_57_)
					i_57_ = ((cd) this).C;
				    int i_58_ = i + 64;
				    if (i_58_ >= 0) {
					if (((cd) this).C <= i_58_)
					    i_58_ = ((cd) this).C;
				    } else
					i_58_ = 0;
				    for (/**/; i_56_ > i_55_; i_55_++) {
					for (/**/; i_57_ < i_58_; i_57_++)
					    ((cd) this).w[i_44_][i_55_][i_57_]
						= (((cd) this).w[i_44_ - 1]
						   [i_55_][i_57_]);
				    }
				}
			    }
			}
			bool = true;
		    }
		} else {
		    if (class_mc == null)
			class_mc = new Class_mc();
		    class_mc.a(i_35_ ^ 0x1a32, var_es);
		}
	    }
	    if (class_mc != null) {
		for (int i_59_ = 0; i_59_ < 8; i_59_++) {
		    for (int i_60_ = 0; i_60_ < 8; i_60_++) {
			int i_61_ = i_59_ + (i_36_ >> 3);
			int i_62_ = i_60_ + (i >> 3);
			if (i_61_ >= 0 && i_61_ < ((cd) this).q >> 3
			    && i_62_ >= 0 && i_62_ < ((cd) this).C >> 3)
			    fr.a(i_61_, (byte) 94, i_62_, class_mc);
		    }
		}
	    }
	    if (!bool && ((cd) this).w != null) {
		for (int i_63_ = 0; i_63_ < 4; i_63_++) {
		    if (((cd) this).w[i_63_] != null) {
			for (int i_64_ = 0; i_64_ < 16; i_64_++) {
			    for (int i_65_ = 0; i_65_ < 16; i_65_++) {
				int i_66_ = i_64_ + (i_36_ >> 2);
				int i_67_ = i_65_ + (i >> 2);
				if (i_66_ >= 0 && i_66_ < 26 && i_67_ >= 0
				    && i_67_ < 26)
				    ((cd) this).w[i_63_][i_66_][i_67_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void a(int i, Class_r class_r, int i_68_, wd[] var_wds, int i_69_,
		 int i_70_, byte[] is, int i_71_, int i_72_, int i_73_,
		 int i_74_) {
	if (i_68_ == 0) {
	    J++;
	    BytesParser var_es = new BytesParser(is);
	    int i_75_ = -1;
	    for (;;) {
		int i_76_ = var_es.i((byte) -16);
		if (i_76_ == 0)
		    break;
		i_75_ += i_76_;
		int i_77_ = 0;
		for (;;) {
		    int i_78_ = var_es.readSmart2(-13829);
		    if (i_78_ == 0)
			break;
		    i_77_ += i_78_ - 1;
		    int i_79_ = i_77_ & 0x3f;
		    int i_80_ = i_77_ >> 6 & 0x3f;
		    int i_81_ = i_77_ >> 12;
		    int i_82_ = var_es.readUnsignedByte(-9268);
		    int i_83_ = i_82_ >> 2;
		    int i_84_ = i_82_ & 0x3;
		    if (i_69_ == i_81_ && i_80_ >= i_70_ && i_80_ < i_70_ + 8
			&& i_79_ >= i_74_ && i_74_ + 8 > i_79_) {
			ObjectDef var_bda = ul.k.getObjectDef((byte) 118, i_75_);
			int i_85_
			    = (ObjectDef.a(1, i_73_, ((ObjectDef) var_bda).J, 0x7 & i_79_,
				     0x7 & i_80_, ((ObjectDef) var_bda).A, i_84_)
			       + i_71_);
			int i_86_
			    = i_72_ + li.a(i_80_ & 0x7, i_79_ & 0x7, i_73_,
					   i_84_, ((ObjectDef) var_bda).A,
					   (byte) -102, ((ObjectDef) var_bda).J);
			if (i_85_ > 0 && i_86_ > 0 && i_85_ < ((cd) this).q - 1
			    && i_86_ < ((cd) this).C - 1) {
			    wd var_wd = null;
			    if (!((cd) this).b) {
				int i_87_ = i;
				if ((tu.b[1][i_85_][i_86_] & 0x2) == 2)
				    i_87_--;
				if (i_87_ >= 0)
				    var_wd = var_wds[i_87_];
			    }
			    a(i_84_ + i_73_ & 0x3, var_wd, i_83_, class_r, -1,
			      i, i_68_ - 12, i_75_, i_86_, i, i_85_);
			}
		    }
		}
	    }
	}
    }
    
    gl(int i, int i_88_, int i_89_, boolean bool) {
	super(i, i_88_, i_89_, bool, Class_eb.p, Class_ef.G);
    }
    
    static final void a(boolean bool, byte i) {
	G++;
	if (gca.l.length() != 0) {
	    ia.a(4, "--> " + gca.l);
	    bj.applyClientCommand(0, bool, gca.l, false);
	    Entity.tc = 0;
	    qda.z = 0;
	    gca.l = "";
	    if (i > -27)
		P = null;
	}
    }
    
    final void a(int[] is, Class_r class_r, int i, boolean bool, int i_90_,
		 int i_91_, int i_92_, int i_93_, int i_94_, int i_95_,
		 BytesParser var_es) {
	F++;
	if (!((cd) this).b) {
	    boolean bool_96_ = false;
	    if (bool != true)
		a(null, null, 16, true, 100, 26, 44, -81, 25, 94, null);
	    Class_mc class_mc = null;
	    if (is != null)
		is[0] = -1;
	    int i_97_ = (0x7 & i_92_) * 8;
	    int i_98_ = (i & 0x7) * 8;
	    while (((BytesParser) var_es).bytes.length > ((BytesParser) var_es).pos) {
		int i_99_ = var_es.readUnsignedByte(-9268);
		if (i_99_ == 0)
		    class_mc = new Class_mc(var_es);
		else if (i_99_ != 1) {
		    if (i_99_ == 2) {
			if (class_mc == null)
			    class_mc = new Class_mc();
			class_mc.a(8, var_es);
		    } else if (i_99_ != 128) {
			if (i_99_ != 129)
			    throw new IllegalStateException("");
			if (((cd) this).w == null)
			    ((cd) this).w = new byte[4][][];
			for (int i_100_ = 0; i_100_ < 4; i_100_++) {
			    byte i_101_ = var_es.readByte(-20933);
			    if (i_101_ != 0 || ((cd) this).w[i_95_] == null) {
				if (i_101_ == 1) {
				    if (((cd) this).w[i_95_] == null)
					((cd) this).w[i_95_]
					    = (new byte[((cd) this).q + 1]
					       [((cd) this).C + 1]);
				    for (int i_102_ = 0; i_102_ < 64;
					 i_102_ += 4) {
					for (int i_103_ = 0; i_103_ < 64;
					     i_103_ += 4) {
					    byte i_104_ = var_es.readByte(-20933);
					    if (i_100_ <= i_94_) {
						for (int i_105_ = i_102_;
						     i_102_ + 4 > i_105_;
						     i_105_++) {
						    for (int i_106_ = i_103_;
							 i_103_ + 4 > i_106_;
							 i_106_++) {
							if (i_97_ <= i_105_
							    && (i_97_ + 8
								> i_105_)
							    && i_98_ <= i_106_
							    && (i_98_ + 8
								> i_98_)) {
							    int i_107_
								= (i_91_
								   + (saa.a
								      ((i_106_
									& 0x7),
								       i_90_,
								       69,
								       (0x7
									& i_105_))));
							    int i_108_
								= (i_93_
								   + (uc.a
								      ((0x7
									& i_105_),
								       i_90_,
								       -112,
								       (i_106_
									& 0x7))));
							    if (i_107_ >= 0
								&& (((cd)
								     this).q
								    > i_107_)
								&& i_108_ >= 0
								&& (((cd)
								     this).C
								    > i_108_))
								((cd) this)
								    .w[i_95_]
								    [i_107_]
								    [i_108_]
								    = i_104_;
							}
						    }
						}
					    }
					}
				    }
				}
			    } else if (i_100_ <= i_94_) {
				int i_109_ = i_91_;
				int i_110_ = i_91_ + 7;
				int i_111_ = i_93_;
				int i_112_ = i_93_ + 7;
				if (i_110_ < 0)
				    i_110_ = 0;
				else if (((cd) this).q <= i_110_)
				    i_110_ = ((cd) this).q;
				if (i_111_ >= 0) {
				    if (((cd) this).C <= i_111_)
					i_111_ = ((cd) this).C;
				} else
				    i_111_ = 0;
				if (i_109_ >= 0) {
				    if (((cd) this).q <= i_109_)
					i_109_ = ((cd) this).q;
				} else
				    i_109_ = 0;
				if (i_112_ < 0)
				    i_112_ = 0;
				else if (i_112_ >= ((cd) this).C)
				    i_112_ = ((cd) this).C;
				for (/**/; i_110_ > i_109_; i_109_++) {
				    for (/**/; i_112_ > i_111_; i_111_++)
					((cd) this).w[i_95_][i_109_][i_111_]
					    = (byte) 0;
				}
			    }
			}
		    } else if (is != null) {
			is[0] = var_es.readShort(13111);
			is[1] = var_es.readShort2(39);
			is[2] = var_es.readShort2(31);
			is[3] = var_es.readShort2(92);
			is[4] = var_es.readShort(13111);
		    } else
			((BytesParser) var_es).pos += 10;
		} else {
		    int i_113_ = var_es.readUnsignedByte(-9268);
		    if (i_113_ > 0) {
			for (int i_114_ = 0; i_113_ > i_114_; i_114_++) {
			    qd var_qd = new qd(class_r, var_es, 2);
			    if (((qd) var_qd).l == 31) {
				df var_df = lr.k.a(true, var_es.readShort(13111));
				var_qd.a(((df) var_df).e, ((df) var_df).d,
					 ((df) var_df).g, 10236,
					 ((df) var_df).a);
			    }
			    if (class_r.c() > 0) {
				gga var_gga = ((qd) var_qd).m;
				int i_115_ = var_gga.a(true) >> 9;
				int i_116_ = var_gga.b((byte) 119) >> 9;
				if (((qd) var_qd).o == i_94_ && i_97_ <= i_115_
				    && i_115_ < i_97_ + 8 && i_98_ <= i_116_
				    && i_98_ + 8 > i_116_) {
				    int i_117_
					= ((i_91_ << 9)
					   + Class_g.b((var_gga.b((byte) 119)
							& 0xfff),
						       0xfff & var_gga.a(bool),
						       i_90_, 102));
				    int i_118_
					= (n.a((byte) -117,
						     (var_gga.b((byte) 119)
						      & 0xfff),
						     i_90_,
						     0xfff & var_gga.a(bool))
					   + (i_93_ << 9));
				    i_115_ = i_117_ >> 9;
				    i_116_ = i_118_ >> 9;
				    if (i_115_ >= 0 && i_116_ >= 0
					&& ((cd) this).q > i_115_
					&& i_116_ < ((cd) this).C) {
					var_gga.a(i_117_, i_118_, (byte) -99,
						  ((((cd) this).i[i_94_]
						    [i_115_][i_116_])
						   - var_gga.i(-111)));
					pt.a(var_qd);
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class_mc != null)
		fr.a(i_91_ >> 3, (byte) -81, i_93_ >> 3, class_mc);
	    if (!bool_96_ && ((cd) this).w != null
		&& ((cd) this).w[i_95_] != null) {
		int i_119_ = i_91_ + 7;
		int i_120_ = i_93_ + 7;
		for (int i_121_ = i_91_; i_119_ > i_121_; i_121_++) {
		    for (int i_122_ = i_93_; i_122_ < i_120_; i_122_++)
			((cd) this).w[i_95_][i_121_][i_122_] = (byte) 0;
		}
	    }
	}
    }
    
    final void a(int i, wd var_wd, int i_123_, Class_r class_r, int i_124_,
		 int i_125_, int i_126_, int i_127_, int i_128_, int i_129_,
		 int i_130_) {
	H++;
	if (cs.g.e(on.performance, 123)
	    || hk.a(i_125_, qca.E, i_130_, (byte) 108, i_128_)) {
	    if (((gl) this).L > i_129_)
		((gl) this).L = i_129_;
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 77, i_127_);
	    if (!class_r.g() || !((jb) cs.g).k || !((ObjectDef) var_bda).K) {
		if (i_126_ != -12)
		    P = null;
		int i_131_;
		int i_132_;
		if (i == 1 || i == 3) {
		    i_131_ = ((ObjectDef) var_bda).A;
		    i_132_ = ((ObjectDef) var_bda).J;
		} else {
		    i_131_ = ((ObjectDef) var_bda).J;
		    i_132_ = ((ObjectDef) var_bda).A;
		}
		int i_133_;
		int i_134_;
		if (i_130_ + i_132_ > ((cd) this).q) {
		    i_134_ = i_130_ + 1;
		    i_133_ = i_130_;
		} else {
		    i_133_ = (i_132_ >> 1) + i_130_;
		    i_134_ = (i_132_ + 1 >> 1) + i_130_;
		}
		int i_135_;
		int i_136_;
		if (((cd) this).C >= i_128_ + i_131_) {
		    i_136_ = (i_131_ >> 1) + i_128_;
		    i_135_ = (i_131_ + 1 >> 1) + i_128_;
		} else {
		    i_135_ = i_128_ + 1;
		    i_136_ = i_128_;
		}
		Class_i class_i = Class_q.b[i_125_];
		int i_137_ = ((class_i.a(i_136_, (byte) 51, i_133_)
			       + class_i.a(i_136_, (byte) 51, i_134_)
			       - (-class_i.a(i_135_, (byte) 51, i_133_)
				  - class_i.a(i_135_, (byte) 51, i_134_)))
			      >> 2);
		int i_138_ = (i_130_ << 9) + (i_132_ << 8);
		int i_139_ = (i_128_ << 9) + (i_131_ << 8);
		boolean bool = ok.C && !((cd) this).b && ((ObjectDef) var_bda).ib;
		if (var_bda.a((byte) 121))
		    kg.a(-121, null, var_bda, i, null, i_130_, i_128_, i_129_);
		boolean bool_140_
		    = ((i_124_ ^ 0xffffffff) == 0
		       && (((ObjectDef) var_bda).zb ^ 0xffffffff) == 0
		       && ((ObjectDef) var_bda).pb == null
		       && ((ObjectDef) var_bda).xb == null && !((ObjectDef) var_bda).B);
		if (!im.p
		    || ((!dea.a(i_123_, -4) || ((ObjectDef) var_bda).vb == 1)
			&& (!ld.a(2429, i_123_) || ((ObjectDef) var_bda).vb != 0))) {
		    if (i_123_ == 22) {
			if (((jb) cs.g).ab || ((ObjectDef) var_bda).jb != 0
			    || ((ObjectDef) var_bda).ab == 1 || ((ObjectDef) var_bda).D) {
			    dfa var_dfa;
			    if (bool_140_) {
				Class_ub class_ub
				    = new Class_ub(class_r, var_bda, i_129_,
						   i_125_, i_138_, i_137_,
						   i_139_, ((cd) this).b, i,
						   bool);
				var_dfa = class_ub;
				if (class_ub.a(3755))
				    class_ub.a((byte) 66, class_r);
			    } else
				var_dfa
				    = new qaa(class_r, var_bda, i_129_, i_125_,
					      i_138_, i_137_, i_139_,
					      ((cd) this).b, i, i_124_);
			    at.a(i_129_, i_130_, i_128_, var_dfa);
			    if (((ObjectDef) var_bda).ab == 1 && var_wd != null)
				var_wd.a(i_128_, (byte) -3, i_130_);
			}
		    } else if (i_123_ == 10 || i_123_ == 11) {
			Class_mb class_mb = null;
			int i_141_;
			qda var_qda;
			if (bool_140_) {
			    Class_mb class_mb_142_
				= new Class_mb(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_130_,
					       i_132_ + i_130_ - 1, i_128_,
					       i_128_ + i_131_ - 1, i_123_, i,
					       bool);
			    class_mb = class_mb_142_;
			    i_141_ = class_mb_142_.i((int) 67);
			    var_qda = class_mb_142_;
			} else {
			    i_141_ = 15;
			    var_qda
				= new lq(class_r, var_bda, i_129_, i_125_,
					 i_138_, i_137_, i_139_, ((cd) this).b,
					 i_130_, i_132_ + (i_130_ - 1), i_128_,
					 i_131_ + i_128_ - 1, i_123_, i,
					 i_124_);
			}
			if (to.a(var_qda, false)) {
			    if (class_mb != null && class_mb.a(i_126_ + 3767))
				class_mb.a((byte) 46, class_r);
			    if (((ObjectDef) var_bda).cb && ok.C) {
				if (i_141_ > 30)
				    i_141_ = 30;
				for (int i_143_ = 0; i_143_ <= i_132_;
				     i_143_++) {
				    for (int i_144_ = 0; i_144_ <= i_131_;
					 i_144_++)
					class_i.a(i_143_ + i_130_,
						  i_144_ + i_128_, i_141_);
				}
			    }
			}
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(i_132_, ((ObjectDef) var_bda).qb, i_131_,
				     (byte) 100, i_130_, !((ObjectDef) var_bda).y,
				     i_128_);
		    } else if (i_123_ >= 12 && i_123_ <= 17
			       || i_123_ >= 18 && i_123_ <= 21) {
			qda var_qda;
			if (!bool_140_)
			    var_qda
				= new lq(class_r, var_bda, i_129_, i_125_,
					 i_138_, i_137_, i_139_, ((cd) this).b,
					 i_130_, i_132_ + (i_130_ - 1), i_128_,
					 i_131_ - 1 + i_128_, i_123_, i,
					 i_124_);
			else {
			    Class_mb class_mb
				= new Class_mb(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_130_,
					       i_130_ - (-i_132_ + 1), i_128_,
					       i_128_ + (i_131_ - 1), i_123_,
					       i, bool);
			    var_qda = class_mb;
			    if (class_mb.a(3755))
				class_mb.a((byte) -95, class_r);
			}
			to.a(var_qda, false);
			if (ok.C && !((cd) this).b && i_123_ >= 12
			    && i_123_ <= 17 && i_123_ != 13 && i_129_ > 0
			    && ((ObjectDef) var_bda).vb != 0)
			    ((cd) this).v[i_129_][i_130_][i_128_]
				= (byte) hba.bitwiseArg1ORArg2((((cd) this).v[i_129_][i_130_]
						[i_128_]),
					       4);
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(i_132_, ((ObjectDef) var_bda).qb, i_131_,
				     (byte) 100, i_130_, !((ObjectDef) var_bda).y,
				     i_128_);
		    } else if (i_123_ == 0) {
			int i_145_ = ((ObjectDef) var_bda).vb;
			if (sj.d && (((ObjectDef) var_bda).vb ^ 0xffffffff) == 0)
			    i_145_ = 1;
			ev var_ev;
			if (bool_140_) {
			    Class_jc class_jc
				= new Class_jc(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_123_, i, bool);
			    var_ev = class_jc;
			    if (class_jc.a(3755))
				class_jc.a((byte) 117, class_r);
			} else
			    var_ev = new Class_ug(class_r, var_bda, i_129_,
						  i_125_, i_138_, i_137_,
						  i_139_, ((cd) this).b,
						  i_123_, i, i_124_);
			ej.a(i_129_, i_130_, i_128_, var_ev, null);
			if (i != 0) {
			    if (i == 1) {
				if (ok.C && ((ObjectDef) var_bda).cb) {
				    class_i.a(i_130_, i_128_ + 1, 50);
				    class_i.a(i_130_ + 1, i_128_ + 1, 50);
				}
				if (i_145_ == 1 && !((cd) this).b)
				    Login.a(3, 2, ((ObjectDef) var_bda).ob, i_128_ + 1,
					 i_130_, i_129_, -((ObjectDef) var_bda).E);
			    } else if (i == 2) {
				if (ok.C && ((ObjectDef) var_bda).cb) {
				    class_i.a(i_130_ + 1, i_128_, 50);
				    class_i.a(i_130_ + 1, i_128_ + 1, 50);
				}
				if (i_145_ == 1 && !((cd) this).b)
				    Login.a(3, 1, ((ObjectDef) var_bda).ob, i_128_,
					 i_130_ + 1, i_129_,
					 -((ObjectDef) var_bda).E);
			    } else if (i == 3) {
				if (ok.C && ((ObjectDef) var_bda).cb) {
				    class_i.a(i_130_, i_128_, 50);
				    class_i.a(i_130_ + 1, i_128_, 50);
				}
				if (i_145_ == 1 && !((cd) this).b)
				    Login.a(i_126_ ^ ~0x8, 2, ((ObjectDef) var_bda).ob,
					 i_128_, i_130_, i_129_,
					 ((ObjectDef) var_bda).E);
			    }
			} else {
			    if (ok.C && ((ObjectDef) var_bda).cb) {
				class_i.a(i_130_, i_128_, 50);
				class_i.a(i_130_, i_128_ + 1, 50);
			    }
			    if (i_145_ == 1 && !((cd) this).b)
				Login.a(3, 1, ((ObjectDef) var_bda).ob, i_128_, i_130_,
				     i_129_, ((ObjectDef) var_bda).E);
			}
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(((ObjectDef) var_bda).qb, i_123_, 64, i_128_,
				     i_130_, !((ObjectDef) var_bda).y, i);
			if (((ObjectDef) var_bda).ub != 64)
			    fn.a(i_129_, i_130_, i_128_, ((ObjectDef) var_bda).ub);
		    } else if (i_123_ == 1) {
			ev var_ev;
			if (!bool_140_)
			    var_ev = new Class_ug(class_r, var_bda, i_129_,
						  i_125_, i_138_, i_137_,
						  i_139_, ((cd) this).b,
						  i_123_, i, i_124_);
			else {
			    Class_jc class_jc
				= new Class_jc(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_123_, i, bool);
			    var_ev = class_jc;
			    if (class_jc.a(3755))
				class_jc.a((byte) 58, class_r);
			}
			ej.a(i_129_, i_130_, i_128_, var_ev, null);
			if (((ObjectDef) var_bda).cb && ok.C) {
			    if (i != 0) {
				if (i == 1)
				    class_i.a(i_130_ + 1, i_128_ + 1, 50);
				else if (i == 2)
				    class_i.a(i_130_ + 1, i_128_, 50);
				else if (i == 3)
				    class_i.a(i_130_, i_128_, 50);
			    } else
				class_i.a(i_130_, i_128_ + 1, 50);
			}
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(((ObjectDef) var_bda).qb, i_123_, 84, i_128_,
				     i_130_, !((ObjectDef) var_bda).y, i);
		    } else if (i_123_ == 2) {
			int i_146_ = 0x3 & i + 1;
			ev var_ev;
			ev var_ev_147_;
			if (bool_140_) {
			    Class_jc class_jc
				= new Class_jc(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_123_, i + 4,
					       bool);
			    Class_jc class_jc_148_
				= new Class_jc(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_123_, i_146_,
					       bool);
			    if (class_jc.a(3755))
				class_jc.a((byte) 118, class_r);
			    var_ev_147_ = class_jc_148_;
			    if (class_jc_148_.a(3755))
				class_jc_148_.a((byte) -87, class_r);
			    var_ev = class_jc;
			} else {
			    var_ev = new Class_ug(class_r, var_bda, i_129_,
						  i_125_, i_138_, i_137_,
						  i_139_, ((cd) this).b,
						  i_123_, i + 4, i_124_);
			    var_ev_147_
				= new Class_ug(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_123_, i_146_,
					       i_124_);
			}
			ej.a(i_129_, i_130_, i_128_, var_ev, var_ev_147_);
			if ((((ObjectDef) var_bda).vb == 1
			     || sj.d && (((ObjectDef) var_bda).vb ^ 0xffffffff) == 0)
			    && !((cd) this).b) {
			    if (i == 0) {
				Login.a(i_126_ ^ ~0x8, 1, ((ObjectDef) var_bda).ob,
				     i_128_, i_130_, i_129_,
				     ((ObjectDef) var_bda).E);
				Login.a(3, 2, ((ObjectDef) var_bda).ob, i_128_ + 1,
				     i_130_, i_129_, ((ObjectDef) var_bda).E);
			    } else if (i == 1) {
				Login.a(i_126_ + 15, 1, ((ObjectDef) var_bda).ob,
				     i_128_, i_130_ + 1, i_129_,
				     ((ObjectDef) var_bda).E);
				Login.a(i_126_ ^ ~0x8, 2, ((ObjectDef) var_bda).ob,
				     i_128_ + 1, i_130_, i_129_,
				     ((ObjectDef) var_bda).E);
			    } else if (i != 2) {
				if (i == 3) {
				    Login.a(3, 1, ((ObjectDef) var_bda).ob, i_128_,
					 i_130_, i_129_, ((ObjectDef) var_bda).E);
				    Login.a(i_126_ + 15, 2, ((ObjectDef) var_bda).ob,
					 i_128_, i_130_, i_129_,
					 ((ObjectDef) var_bda).E);
				}
			    } else {
				Login.a(i_126_ ^ ~0x8, 1, ((ObjectDef) var_bda).ob,
				     i_128_, i_130_ + 1, i_129_,
				     ((ObjectDef) var_bda).E);
				Login.a(3, 2, ((ObjectDef) var_bda).ob, i_128_, i_130_,
				     i_129_, ((ObjectDef) var_bda).E);
			    }
			}
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(((ObjectDef) var_bda).qb, i_123_, 43, i_128_,
				     i_130_, !((ObjectDef) var_bda).y, i);
			if (((ObjectDef) var_bda).ub != 64)
			    fn.a(i_129_, i_130_, i_128_, ((ObjectDef) var_bda).ub);
		    } else if (i_123_ == 3) {
			ev var_ev;
			if (!bool_140_)
			    var_ev = new Class_ug(class_r, var_bda, i_129_,
						  i_125_, i_138_, i_137_,
						  i_139_, ((cd) this).b,
						  i_123_, i, i_124_);
			else {
			    Class_jc class_jc
				= new Class_jc(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_123_, i, bool);
			    var_ev = class_jc;
			    if (class_jc.a(3755))
				class_jc.a((byte) 80, class_r);
			}
			ej.a(i_129_, i_130_, i_128_, var_ev, null);
			if (((ObjectDef) var_bda).cb && ok.C) {
			    if (i != 0) {
				if (i != 1) {
				    if (i != 2) {
					if (i == 3)
					    class_i.a(i_130_, i_128_, 50);
				    } else
					class_i.a(i_130_ + 1, i_128_, 50);
				} else
				    class_i.a(i_130_ + 1, i_128_ + 1, 50);
			    } else
				class_i.a(i_130_, i_128_ + 1, 50);
			}
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(((ObjectDef) var_bda).qb, i_123_, 83, i_128_,
				     i_130_, !((ObjectDef) var_bda).y, i);
		    } else if (i_123_ == 9) {
			qda var_qda;
			if (bool_140_) {
			    Class_mb class_mb
				= new Class_mb(class_r, var_bda, i_129_,
					       i_125_, i_138_, i_137_, i_139_,
					       ((cd) this).b, i_130_, i_130_,
					       i_128_, i_128_, i_123_, i,
					       bool);
			    if (class_mb.a(3755))
				class_mb.a((byte) 113, class_r);
			    var_qda = class_mb;
			} else
			    var_qda
				= new lq(class_r, var_bda, i_129_, i_125_,
					 i_138_, i_137_, i_139_, ((cd) this).b,
					 i_130_, i_130_ - (-i_132_ + 1),
					 i_128_, i_128_ + i_131_ - 1, i_123_,
					 i, i_124_);
			to.a(var_qda, false);
			if (((ObjectDef) var_bda).ab != 0 && var_wd != null)
			    var_wd.a(i_132_, ((ObjectDef) var_bda).qb, i_131_,
				     (byte) 100, i_130_, !((ObjectDef) var_bda).y,
				     i_128_);
			if (((ObjectDef) var_bda).ub != 64)
			    fn.a(i_129_, i_130_, i_128_, ((ObjectDef) var_bda).ub);
		    } else if (i_123_ == 4) {
			lca var_lca;
			if (!bool_140_)
			    var_lca = new jfa(class_r, var_bda, i_129_, i_125_,
					      i_138_, i_137_, i_139_,
					      ((cd) this).b, 0, 0, i_123_, i,
					      i_124_);
			else {
			    kga var_kga
				= new kga(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, 0, 0, i_123_, i);
			    var_lca = var_kga;
			    if (var_kga.a(3755))
				var_kga.a((byte) 56, class_r);
			}
			di.a(i_129_, i_130_, i_128_, var_lca, null);
		    } else if (i_123_ == 5) {
			int i_149_ = 65;
			vda var_vda = (vda) Class_nb.a(i_129_, i_130_, i_128_);
			if (var_vda != null)
			    i_149_
				= ((ObjectDef) ul.k.getObjectDef((byte) 69,
						var_vda.b((byte) 127))).ub + 1;
			lca var_lca;
			if (!bool_140_)
			    var_lca = new jfa(class_r, var_bda, i_129_, i_125_,
					      i_138_, i_137_, i_139_,
					      ((cd) this).b, i_149_ * jga.p[i],
					      sea.a[i] * i_149_, i_123_, i,
					      i_124_);
			else {
			    kga var_kga
				= new kga(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, i_149_ * jga.p[i],
					  i_149_ * sea.a[i], i_123_, i);
			    var_lca = var_kga;
			    if (var_kga.a(i_126_ + 3767))
				var_kga.a((byte) 31, class_r);
			}
			di.a(i_129_, i_130_, i_128_, var_lca, null);
		    } else if (i_123_ == 6) {
			int i_150_ = 33;
			vda var_vda = (vda) Class_nb.a(i_129_, i_130_, i_128_);
			if (var_vda != null)
			    i_150_ = (((ObjectDef) ul.k.getObjectDef((byte) 28,
						    var_vda.b((byte) 127))).ub
				      / 2) + 1;
			lca var_lca;
			if (!bool_140_)
			    var_lca = new jfa(class_r, var_bda, i_129_, i_125_,
					      i_138_, i_137_, i_139_,
					      ((cd) this).b, sca.m[i] * i_150_,
					      dq.c[i] * i_150_, i_123_, i + 4,
					      i_124_);
			else {
			    kga var_kga
				= new kga(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, jga.p[i] * i_150_,
					  i_150_ * sea.a[i], i_123_, i + 4);
			    if (var_kga.a(3755))
				var_kga.a((byte) 108, class_r);
			    var_lca = var_kga;
			}
			di.a(i_129_, i_130_, i_128_, var_lca, null);
		    } else if (i_123_ == 7) {
			int i_151_ = 0x3 & i + 2;
			lca var_lca;
			if (bool_140_) {
			    kga var_kga = new kga(class_r, var_bda, i_129_,
						  i_125_, i_138_, i_137_,
						  i_139_, ((cd) this).b, 0, 0,
						  i_123_, i_151_ + 4);
			    if (var_kga.a(3755))
				var_kga.a((byte) 27, class_r);
			    var_lca = var_kga;
			} else
			    var_lca = new jfa(class_r, var_bda, i_129_, i_125_,
					      i_138_, i_137_, i_139_,
					      ((cd) this).b, 0, 0, i_123_,
					      i_151_ + 4, i_124_);
			di.a(i_129_, i_130_, i_128_, var_lca, null);
		    } else if (i_123_ == 8) {
			int i_152_ = i + 2 & 0x3;
			int i_153_ = 33;
			vda var_vda = (vda) Class_nb.a(i_129_, i_130_, i_128_);
			if (var_vda != null)
			    i_153_ = (((ObjectDef) ul.k.getObjectDef((byte) 45,
						    var_vda.b((byte) 127))).ub
				      / 2) + 1;
			lca var_lca;
			lca var_lca_154_;
			if (!bool_140_) {
			    jfa var_jfa
				= new jfa(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, sca.m[i] * i_153_,
					  i_153_ * dq.c[i], i_123_, i + 4,
					  i_124_);
			    jfa var_jfa_155_
				= new jfa(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, 0, 0, i_123_,
					  i_152_ + 4, i_124_);
			    var_lca_154_ = var_jfa;
			    var_lca = var_jfa_155_;
			} else {
			    kga var_kga
				= new kga(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, i_153_ * sca.m[i],
					  i_153_ * dq.c[i], i_123_, i + 4);
			    kga var_kga_156_
				= new kga(class_r, var_bda, i_129_, i_125_,
					  i_138_, i_137_, i_139_,
					  ((cd) this).b, 0, 0, i_123_,
					  i_152_ + 4);
			    if (var_kga.a(i_126_ ^ ~0xea0))
				var_kga.a((byte) -105, class_r);
			    var_lca = var_kga_156_;
			    var_lca_154_ = var_kga;
			    if (var_kga_156_.a(3755))
				var_kga_156_.a((byte) -101, class_r);
			}
			di.a(i_129_, i_130_, i_128_, var_lca_154_, var_lca);
		    }
		}
	    }
	}
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	O = new il(16);
	Q = new fh(14, 7);
    }
}
