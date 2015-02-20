/* Class_rb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_rb extends mca
{
    static int H;
    static int[] I = new int[3];
    private int J = 0;
    static int K;
    private int L = 4096;
    static int M;
    static int N;
    static sa O;
    static int P;
    
    public Class_rb() {
	super(1, true);
    }
    
    static final byte[] a(int i, int i_0_, float f, int i_1_, float f_2_,
			  float f_3_, float f_4_, int i_5_, int i_6_,
			  Class_ab class_ab, float f_7_) {
	P++;
	byte[] is = new byte[i_1_ * (i_6_ * i_5_)];
	sr.a(f, i_0_, is, f_3_, class_ab, f_7_, f_4_, f_2_, i_6_, i_5_, 1, i,
	     i_1_);
	return is;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	H++;
	int i_9_ = j;
	do {
	    if (i_9_ != 0) {
		if (i_9_ != 1)
		    break;
	    } else {
		J = bytesParser.readShort(13111);
		break;
	    }
	    L = bytesParser.readShort(13111);
	} while (false);
	if (i != 1)
	    O = null;
    }
    
    static final boolean b(int i, byte i_10_, int i_11_) {
	if (i_10_ < 82)
	    I = null;
	K++;
	if ((i_11_ & 0x180) == 0)
	    return false;
	return true;
    }
    
    public static void c(byte i) {
	I = null;
	int i_12_ = -42 % ((i - 78) / 36);
	O = null;
    }
    
    static final boolean a(boolean bool, int i, int i_13_, byte i_14_,
			   int i_15_, vf[][][] var_vfs) {
	M++;
	byte i_16_ = !bool ? (byte) (sh.j & 0xff) : (byte) 1;
	if (i_16_ == Interactable.e[vo.clientHeight][i_15_][i_13_])
	    return false;
	if ((tu.b[vo.clientHeight][i_15_][i_13_] & 0x4) == 0)
	    return false;
	if (i_14_ < 65)
	    a(-29, -15, -0.8449425F, 71, -1.6469798F, 1.3943362F, -0.67159706F,
	      28, 1, null, -0.03662885F);
	int i_17_ = 0;
	rd.K[i_17_] = i_15_;
	int i_18_ = 0;
	gh.Q[i_17_++] = i_13_;
	Interactable.e[vo.clientHeight][i_15_][i_13_] = i_16_;
	while (i_17_ != i_18_) {
	    int i_19_ = rd.K[i_18_] & 0xffff;
	    int i_20_ = rd.K[i_18_] >> 16 & 0xff;
	    int i_21_ = rd.K[i_18_] >> 24 & 0xff;
	    int i_22_ = 0xffff & gh.Q[i_18_];
	    int i_23_ = (0xffcf3e & gh.Q[i_18_]) >> 16;
	    i_18_ = 0xfff & i_18_ + 1;
	    boolean bool_24_ = false;
	    if ((0x4 & tu.b[vo.clientHeight][i_19_][i_22_]) == 0)
		bool_24_ = true;
	    boolean bool_25_ = false;
	while_198_:
	    for (int i_26_ = vo.clientHeight + 1; i_26_ <= 3; i_26_++) {
		if ((tu.b[i_26_][i_19_][i_22_] & 0x8) == 0) {
		    if (bool_24_ && var_vfs[i_26_][i_19_][i_22_] != null) {
			if (((vf) var_vfs[i_26_][i_19_][i_22_]).l != null) {
			    int i_27_ = iaa.a(i_20_, -27579);
			    if (i_27_ == ((ev) ((vf) (var_vfs[i_26_][i_19_]
						      [i_22_])).l).A
				|| ((((vf) var_vfs[i_26_][i_19_][i_22_]).h
				     != null)
				    && (((ev)
					 ((vf) var_vfs[i_26_][i_19_][i_22_]).h)
					.A) == i_27_))
				continue;
			    if (i_21_ != 0) {
				int i_28_ = iaa.a(i_21_, -27579);
				if (i_28_ == ((ev) ((vf) (var_vfs[i_26_][i_19_]
							  [i_22_])).l).A
				    || ((((vf) var_vfs[i_26_][i_19_][i_22_]).h
					 != null)
					&& (i_28_
					    == ((ev) (((vf) (var_vfs[i_26_]
							     [i_19_][i_22_]))
						      .h)).A)))
				    continue;
			    }
			    if (i_23_ != 0) {
				int i_29_ = iaa.a(i_23_, -27579);
				if (i_29_ == ((ev) ((vf) (var_vfs[i_26_][i_19_]
							  [i_22_])).l).A
				    || ((((vf) var_vfs[i_26_][i_19_][i_22_]).h
					 != null)
					&& (i_29_
					    == ((ev) (((vf) (var_vfs[i_26_]
							     [i_19_][i_22_]))
						      .h)).A)))
				    continue;
			    }
			}
			vf var_vf = var_vfs[i_26_][i_19_][i_22_];
			if (((vf) var_vf).f != null) {
			    for (ida var_ida = ((vf) var_vf).f;
				 var_ida != null;
				 var_ida = ((ida) var_ida).d) {
				qda var_qda = ((ida) var_ida).a;
				if (var_qda instanceof vda) {
				    vda var_vda = (vda) var_qda;
				    int i_30_ = var_vda.a((byte) 42);
				    int i_31_ = var_vda.c((byte) -75);
				    if (i_30_ == 21)
					i_30_ = 19;
				    int i_32_ = i_31_ << 6 | i_30_;
				    if (i_20_ == i_32_
					|| i_21_ != 0 && i_21_ == i_32_
					|| i_23_ != 0 && i_23_ == i_32_)
					continue while_198_;
				}
			    }
			}
		    }
		    vf var_vf = var_vfs[i_26_][i_19_][i_22_];
		    if (var_vf != null && ((vf) var_vf).f != null) {
			for (ida var_ida = ((vf) var_vf).f; var_ida != null;
			     var_ida = ((ida) var_ida).d) {
			    qda var_qda = ((ida) var_ida).a;
			    if (((qda) var_qda).B != ((qda) var_qda).I
				|| ((qda) var_qda).y != ((qda) var_qda).x) {
				for (int i_33_ = ((qda) var_qda).B;
				     i_33_ <= ((qda) var_qda).I; i_33_++) {
				    for (int i_34_ = ((qda) var_qda).x;
					 i_34_ <= ((qda) var_qda).y; i_34_++)
					Interactable.e[i_26_][i_33_][i_34_] = i_16_;
				}
			    }
			}
		    }
		    Interactable.e[i_26_][i_19_][i_22_] = i_16_;
		    bool_25_ = true;
		}
	    }
	    if (bool_25_) {
		int i_35_ = Class_q.b[vo.clientHeight + 1].a(i_22_, (byte) 51, i_19_);
		if (i_35_ > of.e[i])
		    of.e[i] = i_35_;
		int i_36_ = i_19_ << 9;
		if (Class_md.a[i] <= i_36_) {
		    if (i_36_ > hp.I[i])
			hp.I[i] = i_36_;
		} else
		    Class_md.a[i] = i_36_;
		int i_37_ = i_22_ << 9;
		if (mba.c[i] <= i_37_) {
		    if (gn.O[i] < i_37_)
			gn.O[i] = i_37_;
		} else
		    mba.c[i] = i_37_;
	    }
	    if (!bool_24_) {
		if (i_19_ >= 1 && i_16_ != Interactable.e[vo.clientHeight][i_19_ - 1][i_22_]) {
		    rd.K[i_17_] = hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_19_ - 1, 1179648), -754974720);
		    gh.Q[i_17_] = hba.bitwiseArg1ORArg2(1245184, i_22_);
		    Interactable.e[vo.clientHeight][i_19_ - 1][i_22_] = i_16_;
		    i_17_ = 0xfff & i_17_ + 1;
		}
		if (++i_22_ < bw.v) {
		    if (i_19_ - 1 >= 0
			&& i_16_ != Interactable.e[vo.clientHeight][i_19_ - 1][i_22_]
			&& (0x4 & tu.b[vo.clientHeight][i_19_][i_22_]) == 0
			&& (0x4 & tu.b[vo.clientHeight][i_19_ - 1][i_22_ - 1]) == 0) {
			rd.K[i_17_]
			    = hba.bitwiseArg1ORArg2(1375731712, hba.bitwiseArg1ORArg2(1179648, i_19_ - 1));
			gh.Q[i_17_] = hba.bitwiseArg1ORArg2(1245184, i_22_);
			Interactable.e[vo.clientHeight][i_19_ - 1][i_22_] = i_16_;
			i_17_ = i_17_ + 1 & 0xfff;
		    }
		    if (i_16_ != Interactable.e[vo.clientHeight][i_19_][i_22_]) {
			rd.K[i_17_] = hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_19_, 5373952), 318767104);
			gh.Q[i_17_] = hba.bitwiseArg1ORArg2(5439488, i_22_);
			i_17_ = 0xfff & i_17_ + 1;
			Interactable.e[vo.clientHeight][i_19_][i_22_] = i_16_;
		    }
		    if (i_19_ + 1 < Class_hc.e
			&& Interactable.e[vo.clientHeight][i_19_ + 1][i_22_] != i_16_
			&& (0x4 & tu.b[vo.clientHeight][i_19_][i_22_]) == 0
			&& (0x4 & tu.b[vo.clientHeight][i_19_ + 1][i_22_ - 1]) == 0) {
			rd.K[i_17_]
			    = hba.bitwiseArg1ORArg2(-1845493760, hba.bitwiseArg1ORArg2(5373952, i_19_ + 1));
			gh.Q[i_17_] = hba.bitwiseArg1ORArg2(i_22_, 5439488);
			i_17_ = 0xfff & i_17_ + 1;
			Interactable.e[vo.clientHeight][i_19_ + 1][i_22_] = i_16_;
		    }
		}
		i_22_--;
		if (i_19_ + 1 < Class_hc.e
		    && Interactable.e[vo.clientHeight][i_19_ + 1][i_22_] != i_16_) {
		    rd.K[i_17_] = hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_19_ + 1, 9568256), 1392508928);
		    gh.Q[i_17_] = hba.bitwiseArg1ORArg2(i_22_, 9633792);
		    Interactable.e[vo.clientHeight][i_19_ + 1][i_22_] = i_16_;
		    i_17_ = 0xfff & i_17_ + 1;
		}
		if (--i_22_ >= 0) {
		    if (i_19_ - 1 >= 0
			&& i_16_ != Interactable.e[vo.clientHeight][i_19_ - 1][i_22_]
			&& (0x4 & tu.b[vo.clientHeight][i_19_][i_22_]) == 0
			&& (tu.b[vo.clientHeight][i_19_ - 1][i_22_ + 1] & 0x4) == 0) {
			rd.K[i_17_]
			    = hba.bitwiseArg1ORArg2(301989888, hba.bitwiseArg1ORArg2(i_19_ - 1, 13762560));
			gh.Q[i_17_] = hba.bitwiseArg1ORArg2(i_22_, 13828096);
			i_17_ = 0xfff & i_17_ + 1;
			Interactable.e[vo.clientHeight][i_19_ - 1][i_22_] = i_16_;
		    }
		    if (Interactable.e[vo.clientHeight][i_19_][i_22_] != i_16_) {
			rd.K[i_17_]
			    = hba.bitwiseArg1ORArg2(-1828716544, hba.bitwiseArg1ORArg2(i_19_, 13762560));
			gh.Q[i_17_] = hba.bitwiseArg1ORArg2(i_22_, 13828096);
			i_17_ = 0xfff & i_17_ + 1;
			Interactable.e[vo.clientHeight][i_19_][i_22_] = i_16_;
		    }
		    if (Class_hc.e > i_19_ + 1
			&& Interactable.e[vo.clientHeight][i_19_ + 1][i_22_] != i_16_
			&& (tu.b[vo.clientHeight][i_19_][i_22_] & 0x4) == 0
			&& (tu.b[vo.clientHeight][i_19_ + 1][i_22_ + 1] & 0x4) == 0) {
			rd.K[i_17_]
			    = hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_19_ + 1, 9568256), -771751936);
			gh.Q[i_17_] = hba.bitwiseArg1ORArg2(i_22_, 9633792);
			Interactable.e[vo.clientHeight][i_19_ + 1][i_22_] = i_16_;
			i_17_ = 0xfff & i_17_ + 1;
		    }
		}
	    }
	}
	if (of.e[i] != -1000000) {
	    of.e[i] += 40;
	    Class_md.a[i] -= 512;
	    hp.I[i] += 512;
	    gn.O[i] += 512;
	    mba.c[i] -= 512;
	}
	return true;
    }
    
    final int[] a(int i, int j) {
	N++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int[] is_39_ = this.a(j, false, 0);
	    for (int i_40_ = 0; i_40_ < fr.v; i_40_++) {
		int i_41_ = is_39_[i_40_];
		is[i_40_] = J > i_41_ || L < i_41_ ? 0 : 4096;
	    }
	}
	int i_42_ = 96 / ((81 - i) / 36);
	return is;
    }
}
