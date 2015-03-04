/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class ja extends da
{
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static BigInteger u = new BigInteger("10001", 16);
    static int v;
    private int w;
    private qg[] x;
    static int y;
    private int[][] z;
    private short[] A;
    private uf B;
    static int C;
    static int D;
    static int E;
    static int F;
    static int G;
    static int H;
    private int I;
    private short[] J;
    static int K;
    private int[] M;
    private float[] N;
    private int O;
    private gm P;
    private gm Q;
    static int R;
    static int S;
    private short[] T;
    private oh[] U;
    private short[] V;
    static int W;
    private int X;
    static int Y;
    private int[] Z;
    private boolean ab = false;
    private short[] bb;
    private int[][] cb;
    private mfa[] db;
    static int eb;
    private short[] fb;
    private short[] gb;
    private short[] hb;
    private int ib;
    static int jb;
    static int kb;
    static int lb;
    static int mb;
    private short nb;
    static int ob;
    private int pb;
    private byte[] qb;
    private short[] rb;
    private int sb;
    static int tb;
    static int ub;
    private boolean vb = false;
    static int wb;
    private int[] xb;
    private gm yb;
    static int zb;
    private int[][] Ab;
    private hi[] Bb;
    static int Cb;
    private int Db;
    static int Eb;
    private int Fb;
    static int Gb;
    static int Hb;
    private int[] Ib;
    private int Jb;
    private float[] Kb;
    static int Lb;
    static int Mb;
    private en Nb;
    static int Ob;
    private int Pb;
    private short Qb;
    static int Rb;
    static int Sb;
    static int Tb;
    static int Ub;
    static int Vb;
    private int Wb;
    static int Xb;
    static int Yb;
    static int Zb;
    static int ac;
    private short[] bc;
    static int cc;
    static int dc;
    static int ec;
    private gm fc;
    static int gc;
    static int hc;
    static int ic;
    private int[] jc;
    private short[] kc;
    private int[] lc;
    static int mc;
    static int nc;
    private int oc;
    private int pc;
    static int qc;
    private byte[] rc;
    private short[] sc;
    private int[] tc;
    private int uc;
    private int vc;
    static int wc;
    static int xc;
    static int yc;
    private boolean zc;
    static int Ac;
    static int Bc;
    static int Cc;
    static int Dc;
    static int Ec;
    private short[] Fc;
    private boolean Gc;
    static int Hc;
    static int Ic;
    private fs Jc;
    
    final int J() {
	if (!ab)
	    e(false);
	Eb++;
	return vc;
    }
    
    final void a(Class_q class_q, pba var_pba, int i, int i_0_) {
	p++;
	if (pb != 0) {
	    mga var_mga = ((en) Nb).Td;
	    mga var_mga_1_ = (mga) class_q;
	    if (!ab)
		e(false);
	    dt.Db = (((mga) var_mga).E
		     + (((mga) var_mga).I * ((mga) var_mga_1_).E
			+ (((mga) var_mga_1_).A * ((mga) var_mga).H
			   + ((mga) var_mga_1_).p * ((mga) var_mga).fb)));
	    ws.H = (((mga) var_mga).fb * ((mga) var_mga_1_).T
		    + ((mga) var_mga_1_).q * ((mga) var_mga).H
		    + ((mga) var_mga).I * ((mga) var_mga_1_).fb);
	    float f = ws.H * (float) vc + dt.Db;
	    float f_2_ = (float) Jb * ws.H + dt.Db;
	    float f_3_;
	    float f_4_;
	    if (!(f_2_ < f)) {
		f_4_ = (float) -Fb + f;
		f_3_ = (float) Fb + f_2_;
	    } else {
		f_3_ = (float) Fb + f;
		f_4_ = f_2_ - (float) Fb;
	    }
	    if (!(f_4_ >= ((en) Nb).Cf) && !((float) ((en) Nb).Af >= f_3_)) {
		wl.f = (((mga) var_mga).M * ((mga) var_mga_1_).q
			+ ((mga) var_mga).q * ((mga) var_mga_1_).T
			+ ((mga) var_mga).gb * ((mga) var_mga_1_).fb);
		eca.w = (((mga) var_mga_1_).E * ((mga) var_mga).gb
			 + (((mga) var_mga_1_).p * ((mga) var_mga).q
			    + ((mga) var_mga).M * ((mga) var_mga_1_).A)
			 + ((mga) var_mga).A);
		float f_5_ = (float) vc * wl.f + eca.w;
		float f_6_ = eca.w + (float) Jb * wl.f;
		float f_7_;
		float f_8_;
		if (f_5_ > f_6_) {
		    f_8_ = (float) ((en) Nb).Zd * ((float) -Fb + f_6_);
		    f_7_ = (float) ((en) Nb).Zd * (f_5_ + (float) Fb);
		} else {
		    f_7_ = (float) ((en) Nb).Zd * ((float) Fb + f_6_);
		    f_8_ = ((float) -Fb + f_5_) * (float) ((en) Nb).Zd;
		}
		if (!(((en) Nb).Ee <= f_8_ / (float) i)
		    && !(((en) Nb).Ye >= f_7_ / (float) i)) {
		    Class_eb.s
			= (((mga) var_mga_1_).fb * ((mga) var_mga).F
			   + (((mga) var_mga_1_).T * ((mga) var_mga).T
			      + ((mga) var_mga_1_).q * ((mga) var_mga).cb));
		    io.R = (((mga) var_mga).p
			    + (((mga) var_mga_1_).p * ((mga) var_mga).T
			       + ((mga) var_mga_1_).A * ((mga) var_mga).cb
			       + ((mga) var_mga).F * ((mga) var_mga_1_).E));
		    float f_9_ = io.R + (float) vc * Class_eb.s;
		    float f_10_ = io.R + Class_eb.s * (float) Jb;
		    float f_11_;
		    float f_12_;
		    if (!(f_9_ > f_10_)) {
			f_11_ = (float) ((en) Nb).ef * (f_9_ - (float) Fb);
			f_12_ = ((float) Fb + f_10_) * (float) ((en) Nb).ef;
		    } else {
			f_11_ = (float) ((en) Nb).ef * (f_10_ - (float) Fb);
			f_12_ = ((float) Fb + f_9_) * (float) ((en) Nb).ef;
		    }
		    if (!(f_11_ / (float) i >= ((en) Nb).le)
			&& !(((en) Nb).Ne >= f_12_ / (float) i)) {
			if (var_pba != null || U != null) {
			    sg.c
				= (((mga) var_mga).gb * ((mga) var_mga_1_).H
				   + (((mga) var_mga).q * ((mga) var_mga_1_).cb
				      + (((mga) var_mga_1_).M
					 * ((mga) var_mga).M)));
			    rd.n = (((mga) var_mga_1_).H * ((mga) var_mga).I
				    + ((((mga) var_mga).fb
					* ((mga) var_mga_1_).cb)
				       + (((mga) var_mga_1_).M
					  * ((mga) var_mga).H)));
			    client.aFloat
				= (((mga) var_mga).gb * ((mga) var_mga_1_).I
				   + (((mga) var_mga).M * ((mga) var_mga_1_).gb
				      + (((mga) var_mga_1_).F
					 * ((mga) var_mga).q)));
			    OutputStreamSub.d = (((mga) var_mga_1_).I * ((mga) var_mga).F
				    + ((((mga) var_mga).cb
					* ((mga) var_mga_1_).gb)
				       + (((mga) var_mga_1_).F
					  * ((mga) var_mga).T)));
			    on.o
				= (((mga) var_mga_1_).cb * ((mga) var_mga).T
				   + ((mga) var_mga_1_).M * ((mga) var_mga).cb
				   + ((mga) var_mga).F * ((mga) var_mga_1_).H);
			    qj.Yc
				= (((mga) var_mga).I * ((mga) var_mga_1_).I
				   + (((mga) var_mga_1_).gb * ((mga) var_mga).H
				      + (((mga) var_mga).fb
					 * ((mga) var_mga_1_).F)));
			}
			if (var_pba != null) {
			    int i_13_ = pc + I >> 1;
			    int i_14_ = sb + Pb >> 1;
			    int i_15_ = (int) (eca.w + (float) i_13_ * sg.c
					       + (float) vc * wl.f
					       + client.aFloat * (float) i_14_);
			    int i_16_ = (int) (Class_eb.s * (float) vc
					       + (io.R + on.o * (float) i_13_)
					       + (float) i_14_ * OutputStreamSub.d);
			    int i_17_ = (int) ((float) vc * ws.H
					       + ((float) i_13_ * rd.n + dt.Db)
					       + qj.Yc * (float) i_14_);
			    int i_18_ = (int) (client.aFloat * (float) i_14_
					       + (sg.c * (float) i_13_ + eca.w
						  + (float) Jb * wl.f));
			    int i_19_ = (int) ((float) Jb * Class_eb.s
					       + (io.R + on.o * (float) i_13_)
					       + OutputStreamSub.d * (float) i_14_);
			    ((pba) var_pba).i
				= ((en) Nb).ze + i_19_ * ((en) Nb).ef / i;
			    int i_20_ = (int) ((float) Jb * ws.H
					       + (rd.n * (float) i_13_ + dt.Db)
					       + qj.Yc * (float) i_14_);
			    ((pba) var_pba).k
				= i_15_ * ((en) Nb).Zd / i + ((en) Nb).Ff;
			    ((pba) var_pba).l
				= ((en) Nb).Zd * i_18_ / i + ((en) Nb).Ff;
			    ((pba) var_pba).g
				= ((en) Nb).ze + i_16_ * ((en) Nb).ef / i;
			    if (i_17_ >= ((en) Nb).Af
				|| ((en) Nb).Af <= i_20_) {
				((pba) var_pba).h = true;
				((pba) var_pba).j
				    = ((Fb + i_15_) * ((en) Nb).Zd / i
				       - ((pba) var_pba).k + ((en) Nb).Ff);
			    }
			}
			Nb.a((float) i, (byte) -110);
			Nb.N(128);
			Nb.a(-16926, var_mga_1_);
			e(29892);
			f(true);
		    }
		}
	    }
	}
    }
    
    final int na() {
	Vb++;
	return nb;
    }
    
    final void a(byte i) {
	if (P != null)
	    P.a((int) 55);
	dc++;
	if (yb != null)
	    yb.a((int) 55);
	if (Q != null)
	    Q.a(i ^ 0x15);
	if (fc != null)
	    fc.a((int) 55);
	if (i != 34)
	    H();
	if (Jc != null)
	    Jc.b(23331);
    }
    
    final void B(int i, int[] is, int i_21_, int i_22_, int i_23_,
		 boolean bool, int i_24_, int[] is_25_) {
	Gb++;
	int i_26_ = is.length;
	if (i == 0) {
	    i_21_ <<= 4;
	    i_22_ <<= 4;
	    i_23_ <<= 4;
	    Class_j.k = 0;
	    cs.h = 0;
	    qd.t = 0;
	    int i_27_ = 0;
	    for (int i_28_ = 0; i_26_ > i_28_; i_28_++) {
		int i_29_ = is[i_28_];
		if (Ab.length > i_29_) {
		    int[] is_30_ = Ab[i_29_];
		    for (int i_31_ = 0; i_31_ < is_30_.length; i_31_++) {
			int i_32_ = is_30_[i_31_];
			if (kc == null || (i_24_ & kc[i_32_]) != 0) {
			    cs.h += Z[i_32_];
			    Class_j.k += jc[i_32_];
			    i_27_++;
			    qd.t += Ib[i_32_];
			}
		    }
		}
	    }
	    if (i_27_ <= 0) {
		Class_j.k = i_22_;
		cs.h = i_21_;
		qd.t = i_23_;
	    } else {
		qd.t = qd.t / i_27_ + i_23_;
		cs.h = cs.h / i_27_ + i_21_;
		Class_j.k = Class_j.k / i_27_ + i_22_;
		Class_q.e = true;
	    }
	} else if (i == 1) {
	    if (is_25_ != null) {
		int i_33_ = ((is_25_[1] * i_22_ + 8192 + i_21_ * is_25_[0]
			      + is_25_[2] * i_23_)
			     >> 14);
		int i_34_ = ((i_21_ * is_25_[3] + is_25_[4] * i_22_
			      - (-(is_25_[5] * i_23_) - 8192))
			     >> 14);
		int i_35_ = ((is_25_[8] * i_23_ + 8192 + i_22_ * is_25_[7]
			      + is_25_[6] * i_21_)
			     >> 14);
		i_23_ = i_35_;
		i_22_ = i_34_;
		i_21_ = i_33_;
	    }
	    i_21_ <<= 4;
	    i_22_ <<= 4;
	    i_23_ <<= 4;
	    for (int i_36_ = 0; i_26_ > i_36_; i_36_++) {
		int i_37_ = is[i_36_];
		if (Ab.length > i_37_) {
		    int[] is_38_ = Ab[i_37_];
		    for (int i_39_ = 0; is_38_.length > i_39_; i_39_++) {
			int i_40_ = is_38_[i_39_];
			if (kc == null || (i_24_ & kc[i_40_]) != 0) {
			    Z[i_40_] += i_21_;
			    jc[i_40_] += i_22_;
			    Ib[i_40_] += i_23_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_25_ == null) {
		for (int i_41_ = 0; i_26_ > i_41_; i_41_++) {
		    int i_42_ = is[i_41_];
		    if (Ab.length > i_42_) {
			int[] is_43_ = Ab[i_42_];
			for (int i_44_ = 0; i_44_ < is_43_.length; i_44_++) {
			    int i_45_ = is_43_[i_44_];
			    if (kc == null || (kc[i_45_] & i_24_) != 0) {
				Z[i_45_] -= cs.h;
				jc[i_45_] -= Class_j.k;
				Ib[i_45_] -= qd.t;
				if (i_23_ != 0) {
				    int i_46_ = GameInPacket.ints1[i_23_];
				    int i_47_ = GameInPacket.ints2[i_23_];
				    int i_48_ = ((jc[i_45_] * i_46_
						  + Z[i_45_] * i_47_ + 16383)
						 >> 14);
				    jc[i_45_]
					= (jc[i_45_] * i_47_ - i_46_ * Z[i_45_]
					   + 16383) >> 14;
				    Z[i_45_] = i_48_;
				}
				if (i_21_ != 0) {
				    int i_49_ = GameInPacket.ints1[i_21_];
				    int i_50_ = GameInPacket.ints2[i_21_];
				    int i_51_
					= ((i_50_ * jc[i_45_]
					    + (-(Ib[i_45_] * i_49_) + 16383))
					   >> 14);
				    Ib[i_45_]
					= (i_49_ * jc[i_45_]
					   + Ib[i_45_] * i_50_ + 16383) >> 14;
				    jc[i_45_] = i_51_;
				}
				if (i_22_ != 0) {
				    int i_52_ = GameInPacket.ints1[i_22_];
				    int i_53_ = GameInPacket.ints2[i_22_];
				    int i_54_ = ((Ib[i_45_] * i_52_ + 16383
						  + i_53_ * Z[i_45_])
						 >> 14);
				    Ib[i_45_] = (i_53_ * Ib[i_45_] + 16383
						 - i_52_ * Z[i_45_]) >> 14;
				    Z[i_45_] = i_54_;
				}
				Z[i_45_] += cs.h;
				jc[i_45_] += Class_j.k;
				Ib[i_45_] += qd.t;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_55_ = 0; i_26_ > i_55_; i_55_++) {
			int i_56_ = is[i_55_];
			if (Ab.length > i_56_) {
			    int[] is_57_ = Ab[i_56_];
			    for (int i_58_ = 0; is_57_.length > i_58_;
				 i_58_++) {
				int i_59_ = is_57_[i_58_];
				if (kc == null || (i_24_ & kc[i_59_]) != 0) {
				    int i_60_ = M[i_59_];
				    int i_61_ = M[i_59_ + 1];
				    for (int i_62_ = i_60_; i_61_ > i_62_;
					 i_62_++) {
					int i_63_ = rb[i_62_] - 1;
					if ((i_63_ ^ 0xffffffff) == 0)
					    break;
					if (i_23_ != 0) {
					    int i_64_ = GameInPacket.ints1[i_23_];
					    int i_65_ = GameInPacket.ints2[i_23_];
					    int i_66_ = ((i_64_ * V[i_63_]
							  + fb[i_63_] * i_65_
							  + 16383)
							 >> 14);
					    V[i_63_]
						= (short) ((i_65_ * V[i_63_]
							    + 16383
							    - (i_64_
							       * fb[i_63_]))
							   >> 14);
					    fb[i_63_] = (short) i_66_;
					}
					if (i_21_ != 0) {
					    int i_67_ = GameInPacket.ints1[i_21_];
					    int i_68_ = GameInPacket.ints2[i_21_];
					    int i_69_
						= ((V[i_63_] * i_68_
						    - J[i_63_] * i_67_ + 16383)
						   >> 14);
					    J[i_63_]
						= (short) ((i_68_ * J[i_63_]
							    + 16383
							    + i_67_ * V[i_63_])
							   >> 14);
					    V[i_63_] = (short) i_69_;
					}
					if (i_22_ != 0) {
					    int i_70_ = GameInPacket.ints1[i_22_];
					    int i_71_ = GameInPacket.ints2[i_22_];
					    int i_72_
						= ((fb[i_63_] * i_71_
						    + i_70_ * J[i_63_] + 16383)
						   >> 14);
					    J[i_63_]
						= (short) ((J[i_63_] * i_71_
							    - i_70_ * fb[i_63_]
							    + 16383)
							   >> 14);
					    fb[i_63_] = (short) i_72_;
					}
				    }
				}
			    }
			}
		    }
		    f(55);
		}
	    } else {
		int i_73_ = is_25_[9] << 4;
		int i_74_ = is_25_[10] << 4;
		int i_75_ = is_25_[11] << 4;
		int i_76_ = is_25_[12] << 4;
		int i_77_ = is_25_[13] << 4;
		int i_78_ = is_25_[14] << 4;
		if (Class_q.e) {
		    int i_79_ = ((qd.t * is_25_[6] + is_25_[0] * cs.h
				  + is_25_[3] * Class_j.k + 8192)
				 >> 14);
		    int i_80_ = is_25_[4] * Class_j.k + (cs.h * is_25_[1]
							 - (-(is_25_[7] * qd.t)
							    - 8192)) >> 14;
		    i_80_ += i_77_;
		    i_79_ += i_76_;
		    int i_81_ = ((is_25_[2] * cs.h + Class_j.k * is_25_[5]
				  + is_25_[8] * qd.t + 8192)
				 >> 14);
		    cs.h = i_79_;
		    Class_j.k = i_80_;
		    i_81_ += i_78_;
		    Class_q.e = false;
		    qd.t = i_81_;
		}
		int[] is_82_ = new int[9];
		int i_83_ = GameInPacket.ints2[i_21_];
		int i_84_ = GameInPacket.ints1[i_21_];
		int i_85_ = GameInPacket.ints2[i_22_];
		int i_86_ = GameInPacket.ints1[i_22_];
		int i_87_ = GameInPacket.ints2[i_23_];
		int i_88_ = GameInPacket.ints1[i_23_];
		int i_89_ = i_87_ * i_84_ + 8192 >> 14;
		int i_90_ = i_88_ * i_84_ + 8192 >> 14;
		is_82_[4] = i_87_ * i_83_ + 8192 >> 14;
		is_82_[6] = i_85_ * i_90_ + 8192 + i_87_ * -i_86_ >> 14;
		is_82_[5] = -i_84_;
		is_82_[2] = i_83_ * i_86_ + 8192 >> 14;
		is_82_[0] = i_90_ * i_86_ + (i_87_ * i_85_ + 8192) >> 14;
		is_82_[8] = i_85_ * i_83_ + 8192 >> 14;
		is_82_[3] = i_88_ * i_83_ + 8192 >> 14;
		is_82_[7] = i_88_ * i_86_ + i_89_ * i_85_ + 8192 >> 14;
		is_82_[1] = i_88_ * -i_85_ + 8192 + i_86_ * i_89_ >> 14;
		int i_91_ = ((-cs.h * is_82_[0] + is_82_[1] * -Class_j.k + 8192
			      + is_82_[2] * -qd.t)
			     >> 14);
		int i_92_
		    = (-cs.h * is_82_[3] - (-(-qd.t * is_82_[5])
					    - -Class_j.k * is_82_[4] - 8192)
		       >> 14);
		int i_93_ = ((is_82_[7] * -Class_j.k + is_82_[6] * -cs.h
			      - (-(is_82_[8] * -qd.t) - 8192))
			     >> 14);
		int i_94_ = i_91_ + cs.h;
		int i_95_ = i_92_ + Class_j.k;
		int i_96_ = qd.t + i_93_;
		int[] is_97_ = new int[9];
		for (int i_98_ = 0; i_98_ < 3; i_98_++) {
		    for (int i_99_ = 0; i_99_ < 3; i_99_++) {
			int i_100_ = 0;
			for (int i_101_ = 0; i_101_ < 3; i_101_++)
			    i_100_ += (is_82_[i_98_ * 3 + i_101_]
				       * is_25_[i_99_ * 3 + i_101_]);
			is_97_[3 * i_98_ + i_99_] = i_100_ + 8192 >> 14;
		    }
		}
		int i_102_ = (i_77_ * is_82_[1] + (is_82_[0] * i_76_
						   + i_78_ * is_82_[2]) + 8192
			      >> 14);
		int i_103_
		    = (is_82_[5] * i_78_ + (i_77_ * is_82_[4]
					    + (is_82_[3] * i_76_ + 8192))
		       >> 14);
		i_102_ += i_94_;
		i_103_ += i_95_;
		int i_104_ = (is_82_[7] * i_77_ + (i_76_ * is_82_[6]
						   + i_78_ * is_82_[8]) + 8192
			      >> 14);
		i_104_ += i_96_;
		int[] is_105_ = new int[9];
		for (int i_106_ = 0; i_106_ < 3; i_106_++) {
		    for (int i_107_ = 0; i_107_ < 3; i_107_++) {
			int i_108_ = 0;
			for (int i_109_ = 0; i_109_ < 3; i_109_++)
			    i_108_ += (is_97_[i_107_ + i_109_ * 3]
				       * is_25_[i_109_ + 3 * i_106_]);
			is_105_[i_107_ + i_106_ * 3] = i_108_ + 8192 >> 14;
		    }
		}
		int i_110_ = ((i_104_ * is_25_[2] + i_103_ * is_25_[1]
			       + is_25_[0] * i_102_ + 8192)
			      >> 14);
		int i_111_ = ((i_103_ * is_25_[4] + 8192 + is_25_[3] * i_102_
			       + is_25_[5] * i_104_)
			      >> 14);
		i_110_ += i_73_;
		i_111_ += i_74_;
		int i_112_ = ((i_102_ * is_25_[6] + 8192 + is_25_[7] * i_103_
			       + i_104_ * is_25_[8])
			      >> 14);
		i_112_ += i_75_;
		for (int i_113_ = 0; i_26_ > i_113_; i_113_++) {
		    int i_114_ = is[i_113_];
		    if (Ab.length > i_114_) {
			int[] is_115_ = Ab[i_114_];
			for (int i_116_ = 0; i_116_ < is_115_.length;
			     i_116_++) {
			    int i_117_ = is_115_[i_116_];
			    if (kc == null || (i_24_ & kc[i_117_]) != 0) {
				int i_118_
				    = ((is_105_[2] * Ib[i_117_]
					+ Z[i_117_] * is_105_[0]
					+ jc[i_117_] * is_105_[1] + 8192)
				       >> 14);
				int i_119_
				    = ((Z[i_117_] * is_105_[3]
					+ is_105_[4] * jc[i_117_]
					+ Ib[i_117_] * is_105_[5] + 8192)
				       >> 14);
				i_119_ += i_111_;
				int i_120_ = ((is_105_[6] * Z[i_117_]
					       - (-(is_105_[8] * Ib[i_117_])
						  - jc[i_117_] * is_105_[7])
					       + 8192)
					      >> 14);
				i_118_ += i_110_;
				i_120_ += i_112_;
				Z[i_117_] = i_118_;
				jc[i_117_] = i_119_;
				Ib[i_117_] = i_120_;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_25_ == null) {
		for (int i_121_ = 0; i_26_ > i_121_; i_121_++) {
		    int i_122_ = is[i_121_];
		    if (i_122_ < Ab.length) {
			int[] is_123_ = Ab[i_122_];
			for (int i_124_ = 0; is_123_.length > i_124_;
			     i_124_++) {
			    int i_125_ = is_123_[i_124_];
			    if (kc == null || (kc[i_125_] & i_24_) != 0) {
				Z[i_125_] -= cs.h;
				jc[i_125_] -= Class_j.k;
				Ib[i_125_] -= qd.t;
				Z[i_125_] = i_21_ * Z[i_125_] >> 7;
				jc[i_125_] = i_22_ * jc[i_125_] >> 7;
				Ib[i_125_] = i_23_ * Ib[i_125_] >> 7;
				Z[i_125_] += cs.h;
				jc[i_125_] += Class_j.k;
				Ib[i_125_] += qd.t;
			    }
			}
		    }
		}
	    } else {
		int i_126_ = is_25_[9] << 4;
		int i_127_ = is_25_[10] << 4;
		int i_128_ = is_25_[11] << 4;
		int i_129_ = is_25_[12] << 4;
		int i_130_ = is_25_[13] << 4;
		int i_131_ = is_25_[14] << 4;
		if (Class_q.e) {
		    int i_132_ = ((cs.h * is_25_[0] + Class_j.k * is_25_[3]
				   - (-(is_25_[6] * qd.t) - 8192))
				  >> 14);
		    int i_133_ = ((is_25_[7] * qd.t + 8192
				   + Class_j.k * is_25_[4] + cs.h * is_25_[1])
				  >> 14);
		    int i_134_
			= (cs.h * is_25_[2] + (Class_j.k * is_25_[5]
					       + qd.t * is_25_[8]) + 8192
			   >> 14);
		    i_133_ += i_130_;
		    i_132_ += i_129_;
		    i_134_ += i_131_;
		    cs.h = i_132_;
		    Class_j.k = i_133_;
		    qd.t = i_134_;
		    Class_q.e = false;
		}
		int i_135_ = i_21_ << 15 >> 7;
		int i_136_ = i_22_ << 15 >> 7;
		int i_137_ = i_23_ << 15 >> 7;
		int i_138_ = -cs.h * i_135_ + 8192 >> 14;
		int i_139_ = -Class_j.k * i_136_ + 8192 >> 14;
		int i_140_ = -qd.t * i_137_ + 8192 >> 14;
		int i_141_ = i_138_ + cs.h;
		int i_142_ = i_139_ + Class_j.k;
		int i_143_ = i_140_ + qd.t;
		int[] is_144_ = new int[9];
		is_144_[0] = is_25_[0] * i_135_ + 8192 >> 14;
		is_144_[1] = i_135_ * is_25_[3] + 8192 >> 14;
		is_144_[2] = is_25_[6] * i_135_ + 8192 >> 14;
		is_144_[6] = is_25_[2] * i_137_ + 8192 >> 14;
		is_144_[4] = i_136_ * is_25_[4] + 8192 >> 14;
		is_144_[3] = is_25_[1] * i_136_ + 8192 >> 14;
		is_144_[5] = is_25_[7] * i_136_ + 8192 >> 14;
		is_144_[8] = i_137_ * is_25_[8] + 8192 >> 14;
		is_144_[7] = i_137_ * is_25_[5] + 8192 >> 14;
		int i_145_ = i_129_ * i_135_ + 8192 >> 14;
		int i_146_ = i_136_ * i_130_ + 8192 >> 14;
		int i_147_ = i_131_ * i_137_ + 8192 >> 14;
		i_146_ += i_142_;
		i_145_ += i_141_;
		i_147_ += i_143_;
		int[] is_148_ = new int[9];
		for (int i_149_ = 0; i_149_ < 3; i_149_++) {
		    for (int i_150_ = 0; i_150_ < 3; i_150_++) {
			int i_151_ = 0;
			for (int i_152_ = 0; i_152_ < 3; i_152_++)
			    i_151_ += (is_144_[3 * i_152_ + i_150_]
				       * is_25_[i_149_ * 3 + i_152_]);
			is_148_[3 * i_149_ + i_150_] = i_151_ + 8192 >> 14;
		    }
		}
		int i_153_ = ((i_145_ * is_25_[0] + is_25_[1] * i_146_ + 8192
			       + is_25_[2] * i_147_)
			      >> 14);
		int i_154_
		    = ((i_145_ * is_25_[3]
			- (-(i_146_ * is_25_[4]) - is_25_[5] * i_147_) + 8192)
		       >> 14);
		i_154_ += i_127_;
		int i_155_ = ((is_25_[8] * i_147_ + i_145_ * is_25_[6]
			       - (-(is_25_[7] * i_146_) - 8192))
			      >> 14);
		i_153_ += i_126_;
		i_155_ += i_128_;
		for (int i_156_ = 0; i_156_ < i_26_; i_156_++) {
		    int i_157_ = is[i_156_];
		    if (Ab.length > i_157_) {
			int[] is_158_ = Ab[i_157_];
			for (int i_159_ = 0; is_158_.length > i_159_;
			     i_159_++) {
			    int i_160_ = is_158_[i_159_];
			    if (kc == null || (i_24_ & kc[i_160_]) != 0) {
				int i_161_ = ((is_148_[0] * Z[i_160_]
					       + (is_148_[1] * jc[i_160_]
						  - (-(is_148_[2] * Ib[i_160_])
						     - 8192)))
					      >> 14);
				int i_162_
				    = ((is_148_[3] * Z[i_160_]
					+ jc[i_160_] * is_148_[4]
					- (-(Ib[i_160_] * is_148_[5]) - 8192))
				       >> 14);
				i_162_ += i_154_;
				int i_163_ = ((jc[i_160_] * is_148_[7]
					       + is_148_[6] * Z[i_160_] + 8192
					       + Ib[i_160_] * is_148_[8])
					      >> 14);
				i_161_ += i_153_;
				Z[i_160_] = i_161_;
				i_163_ += i_155_;
				jc[i_160_] = i_162_;
				Ib[i_160_] = i_163_;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (cb != null) {
		boolean bool_164_ = false;
		for (int i_165_ = 0; i_165_ < i_26_; i_165_++) {
		    int i_166_ = is[i_165_];
		    if (cb.length > i_166_) {
			int[] is_167_ = cb[i_166_];
			for (int i_168_ = 0; i_168_ < is_167_.length;
			     i_168_++) {
			    int i_169_ = is_167_[i_168_];
			    if (gb == null || (gb[i_169_] & i_24_) != 0) {
				int i_170_ = 8 * i_21_ + (qb[i_169_] & 0xff);
				if (i_170_ < 0)
				    i_170_ = 0;
				else if (i_170_ > 255)
				    i_170_ = 255;
				qb[i_169_] = (byte) i_170_;
			    }
			}
			bool_164_ = bool_164_ | is_167_.length > 0;
		    }
		}
		if (bool_164_) {
		    if (U != null) {
			for (int i_171_ = 0; Wb > i_171_; i_171_++) {
			    oh var_oh = U[i_171_];
			    mfa var_mfa = db[i_171_];
			    ((mfa) var_mfa).l
				= (0xffffff & ((mfa) var_mfa).l
				   | (-(0xff & qb[((oh) var_oh).e]) + 255
				      << 24));
			}
		    }
		    b(false);
		}
	    }
	} else if (i == 7) {
	    if (cb != null) {
		boolean bool_172_ = false;
		for (int i_173_ = 0; i_173_ < i_26_; i_173_++) {
		    int i_174_ = is[i_173_];
		    if (i_174_ < cb.length) {
			int[] is_175_ = cb[i_174_];
			for (int i_176_ = 0; i_176_ < is_175_.length;
			     i_176_++) {
			    int i_177_ = is_175_[i_176_];
			    if (gb == null || (gb[i_177_] & i_24_) != 0) {
				int i_178_ = 0xffff & Fc[i_177_];
				int i_179_ = 0x3f & i_178_ >> 10;
				int i_180_ = 0x7 & i_178_ >> 7;
				int i_181_ = 0x7f & i_178_;
				i_179_ = 0x3f & i_21_ + i_179_;
				i_180_ += i_22_ / 4;
				if (i_180_ < 0)
				    i_180_ = 0;
				else if (i_180_ > 7)
				    i_180_ = 7;
				i_181_ += i_23_;
				if (i_181_ >= 0) {
				    if (i_181_ > 127)
					i_181_ = 127;
				} else
				    i_181_ = 0;
				Fc[i_177_] = (short) hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_179_ << 10,
								 i_180_ << 7),
							   i_181_);
			    }
			}
			bool_172_ = bool_172_ | is_175_.length > 0;
		    }
		}
		if (bool_172_) {
		    if (U != null) {
			for (int i_182_ = 0; i_182_ < Wb; i_182_++) {
			    oh var_oh = U[i_182_];
			    mfa var_mfa = db[i_182_];
			    ((mfa) var_mfa).l
				= (~0xffffff & ((mfa) var_mfa).l
				   | (0xffffff
				      & ji.j[Fc[((oh) var_oh).e] & 0xffff]));
			}
		    }
		    b(false);
		}
	    }
	} else if (i == 8) {
	    if (z != null) {
		for (int i_183_ = 0; i_183_ < i_26_; i_183_++) {
		    int i_184_ = is[i_183_];
		    if (i_184_ < z.length) {
			int[] is_185_ = z[i_184_];
			for (int i_186_ = 0; i_186_ < is_185_.length;
			     i_186_++) {
			    mfa var_mfa = db[is_185_[i_186_]];
			    ((mfa) var_mfa).e += i_22_;
			    ((mfa) var_mfa).h += i_21_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (z != null) {
		for (int i_187_ = 0; i_187_ < i_26_; i_187_++) {
		    int i_188_ = is[i_187_];
		    if (z.length > i_188_) {
			int[] is_189_ = z[i_188_];
			for (int i_190_ = 0; is_189_.length > i_190_;
			     i_190_++) {
			    mfa var_mfa = db[is_189_[i_190_]];
			    ((mfa) var_mfa).n = i_21_ * ((mfa) var_mfa).n >> 7;
			    ((mfa) var_mfa).d = ((mfa) var_mfa).d * i_22_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9 && z != null) {
	    for (int i_191_ = 0; i_26_ > i_191_; i_191_++) {
		int i_192_ = is[i_191_];
		if (z.length > i_192_) {
		    int[] is_193_ = z[i_192_];
		    for (int i_194_ = 0; i_194_ < is_193_.length; i_194_++) {
			mfa var_mfa = db[is_193_[i_194_]];
			((mfa) var_mfa).m = 0x3fff & i_21_ + ((mfa) var_mfa).m;
		    }
		}
	    }
	}
    }
    
    private final void b(int i) {
	F++;
	if (Gc) {
	    Gc = false;
	    if (i < -51) {
		if (Bb == null && x == null && U == null) {
		    if (Z != null && !vd.b(ib, oc, -67)) {
			if (P != null && !P.a((byte) -61))
			    Gc = true;
			else {
			    if (!ab)
				e(false);
			    Z = null;
			}
		    }
		    if (jc != null && !gn.a(false, ib, oc)) {
			if (P != null && !P.a((byte) 21))
			    Gc = true;
			else {
			    if (!ab)
				e(false);
			    jc = null;
			}
		    }
		    if (Ib != null && !Class_j.a((byte) -55, ib, oc)) {
			if (P == null || P.a((byte) 1)) {
			    if (!ab)
				e(false);
			    Ib = null;
			} else
			    Gc = true;
		    }
		}
		if (rb != null && Z == null && jc == null && Ib == null) {
		    rb = null;
		    M = null;
		}
		if (rc != null && !Commands.a(false, oc, ib)) {
		    if ((0x37 & oc) != 0 ? fc == null || fc.a((byte) -40)
			: Q == null || Q.a((byte) 123)) {
			fb = V = J = null;
			rc = null;
		    } else
			Gc = true;
		}
		if (Fc != null && !Class_fd.a(-29773, ib, oc)) {
		    if (Q == null || Q.a((byte) 120))
			Fc = null;
		    else
			Gc = true;
		}
		if (qb != null && !sj.a(ib, 85, oc)) {
		    if (Q == null || Q.a((byte) -14))
			qb = null;
		    else
			Gc = true;
		}
		if (Kb != null && !Class_kb.a(-998559250, ib, oc)) {
		    if (yb != null && !yb.a((byte) 123))
			Gc = true;
		    else
			Kb = N = null;
		}
		if (bc != null && !baa.a(ib, 107, oc)) {
		    if (Q != null && !Q.a((byte) 127))
			Gc = true;
		    else
			bc = null;
		}
		if (bb != null && !GraphicsCard.a(ib, 25728, oc)) {
		    if ((Jc == null || Jc.a(61))
			&& (Q == null || Q.a((byte) -90)))
			bb = T = sc = null;
		    else
			Gc = true;
		}
		if (A != null) {
		    if (P == null || P.a((byte) 122))
			A = null;
		    else
			Gc = true;
		}
		if (hb != null) {
		    if (Q == null || Q.a((byte) -81))
			hb = null;
		    else
			Gc = true;
		}
		if (cb != null && !gd.a(64, oc, ib)) {
		    gb = null;
		    cb = null;
		}
		if (Ab != null && !in.a(oc, false, ib)) {
		    kc = null;
		    Ab = null;
		}
		if (z != null && !lt.a(ib, 1024, oc))
		    z = null;
		if (xb != null && (0x800 & ib) == 0 && (0x40000 & ib) == 0) {
		    tc = null;
		    lc = null;
		    xb = null;
		}
	    }
	}
    }
    
    final int RA() {
	if (!ab)
	    e(false);
	Xb++;
	return w;
    }
    
    static final void c(int i) {
	lb++;
	lm.Kh.ra(1.1523438F * (0.1F * (float) ((jb) cs.g).db + 0.7F));
	lm.Kh.VA(iea.h, 0.69921875F, 1.2F, -200.0F, (float) i, -200.0F);
	lm.Kh.pa(sea.b, -1, 0);
	lm.Kh.a(da.a);
    }
    
    final int za() {
	hc++;
	if (!ab)
	    e(false);
	return Pb;
    }
    
    private final boolean d(int i) {
	yc++;
	if (((fs) Jc).a)
	    return true;
	if (((fs) Jc).e == null)
	    ((fs) Jc).e = Nb.b(zc, (int) 16);
	hh var_hh = ((fs) Jc).e;
	if (i < 73)
	    return true;
	var_hh.a(27209, 6 * O);
	Buffer buffer = var_hh.a((byte) -88, true);
	if (buffer != null) {
	    Stream stream = Nb.a(buffer, 110);
	    if (!Stream.a()) {
		for (int i_195_ = 0; i_195_ < O; i_195_++) {
		    stream.e(bb[i_195_]);
		    stream.e(T[i_195_]);
		    stream.e(sc[i_195_]);
		}
	    } else {
		for (int i_196_ = 0; O > i_196_; i_196_++) {
		    stream.c(bb[i_196_]);
		    stream.c(T[i_196_]);
		    stream.c(sc[i_196_]);
		}
	    }
	    stream.c();
	    if (var_hh.b((byte) 62)) {
		((fs) Jc).c = var_hh;
		Gc = true;
		((fs) Jc).a = true;
		return true;
	    }
	}
	return false;
    }
    
    private final void b(boolean bool) {
	if (bool != false)
	    za();
	Yb++;
	if (Q != null)
	    ((gm) Q).a = false;
    }
    
    final int K() {
	Cb++;
	if (!ab)
	    e(false);
	return Fb;
    }
    
    private final short a(int i, int i_197_, float f, long l, eg var_eg,
			  int i_198_, int i_199_, float f_200_, int i_201_,
			  int i_202_, int i_203_) {
	jb++;
	if (i_201_ != -5073)
	    b((int) 34);
	int i_204_ = M[i_199_];
	int i_205_ = M[i_199_ + 1];
	int i_206_ = 0;
	for (int i_207_ = i_204_; i_207_ < i_205_; i_207_++) {
	    short i_208_ = rb[i_207_];
	    if (i_208_ == 0) {
		i_206_ = i_207_;
		break;
	    }
	    if (l == sd.j[i_207_])
		return (short) (i_208_ - 1);
	}
	rb[i_206_] = (short) (pb + 1);
	sd.j[i_206_] = l;
	hb[pb] = (short) i_202_;
	A[pb] = (short) i_199_;
	fb[pb] = (short) i;
	V[pb] = (short) i_198_;
	J[pb] = (short) i_203_;
	rc[pb] = (byte) i_197_;
	Kb[pb] = f;
	N[pb] = f_200_;
	return (short) pb++;
    }
    
    final int H() {
	zb++;
	if (!ab)
	    e(false);
	return Jb;
    }
    
    final void R(int i, int i_209_, int i_210_) {
	Ac++;
	for (int i_211_ = 0; Db > i_211_; i_211_++) {
	    if (i != 128)
		Z[i_211_] = i * Z[i_211_] >> 7;
	    if (i_209_ != 128)
		jc[i_211_] = i_209_ * jc[i_211_] >> 7;
	    if (i_210_ != 128)
		Ib[i_211_] = Ib[i_211_] * i_210_ >> 7;
	}
	b((byte) 112);
	ab = false;
    }
    
    final void L() {
	Lb++;
	for (int i = 0; X > i; i++) {
	    Z[i] = Z[i] + 7 >> 4;
	    jc[i] = jc[i] + 7 >> 4;
	    Ib[i] = Ib[i] + 7 >> 4;
	}
	b((byte) 112);
	ab = false;
    }
    
    private final void b(byte i) {
	if (P != null)
	    ((gm) P).a = false;
	if (i != 112)
	    Jb = 107;
	ic++;
    }
    
    final boolean a(int i, int i_212_, Class_q class_q, boolean bool) {
	mc++;
	return a(-1, i_212_, bool, class_q, i, -103);
    }
    
    private final boolean c(boolean bool) {
	Sb++;
	boolean bool_213_ = !((gm) Q).a;
	boolean bool_214_ = (0x37 & oc) != 0 && !((gm) fc).a;
	boolean bool_215_ = !((gm) P).a;
	boolean bool_216_ = !((gm) yb).a;
	if (!bool_215_ && !bool_213_ && !bool_214_ && !bool_216_)
	    return true;
	if (bool != false)
	    d(-65);
	boolean bool_217_ = true;
	if (bool_215_) {
	    if (((gm) P).b == null)
		((gm) P).b = Nb.a(false, zc);
	    nba var_nba = ((gm) P).b;
	    var_nba.a(-58, 12, pb * 12);
	    Buffer buffer = var_nba.a(true, 32726);
	    if (buffer != null) {
		((en) Nb).Rb.copyPositions(Z, jc, Ib, A, 0, 12, pb,
					   buffer.getAddress());
		if (var_nba.a(105)) {
		    ((gm) P).g = var_nba;
		    ((gm) P).a = true;
		} else
		    bool_217_ = false;
	    } else
		bool_217_ = false;
	}
	if (bool_213_) {
	    if (((gm) Q).b == null)
		((gm) Q).b = Nb.a(bool, zc);
	    nba var_nba = ((gm) Q).b;
	    var_nba.a(-110, 4, 4 * pb);
	    Buffer buffer = var_nba.a(true, 32726);
	    if (buffer == null)
		bool_217_ = false;
	    else {
		if ((0x37 & oc) == 0) {
		    short[] is;
		    short[] is_218_;
		    byte[] is_219_;
		    short[] is_220_;
		    if (B != null) {
			is_220_ = ((uf) B).f;
			is = ((uf) B).b;
			is_218_ = ((uf) B).d;
			is_219_ = ((uf) B).c;
		    } else {
			is = fb;
			is_218_ = J;
			is_219_ = rc;
			is_220_ = V;
		    }
		    ((en) Nb).Rb.copyLighting(Fc, qb, bc, is, is_220_, is_218_,
					      is_219_, Qb, nb, hb, 0, 4, pb,
					      buffer.getAddress());
		} else
		    ((en) Nb).Rb.copyColours(Fc, qb, bc, Qb, hb, 0, 4, pb,
					     buffer.getAddress());
		if (var_nba.a(47)) {
		    ((gm) Q).g = var_nba;
		    ((gm) Q).a = true;
		} else
		    bool_217_ = false;
	    }
	}
	if (bool_214_) {
	    if (((gm) fc).b == null)
		((gm) fc).b = Nb.a(bool, zc);
	    nba var_nba = ((gm) fc).b;
	    var_nba.a(-86, 12, pb * 12);
	    Buffer buffer = var_nba.a(true, 32726);
	    if (buffer != null) {
		short[] is;
		byte[] is_221_;
		short[] is_222_;
		short[] is_223_;
		if (B != null) {
		    is_222_ = ((uf) B).b;
		    is_221_ = ((uf) B).c;
		    is = ((uf) B).f;
		    is_223_ = ((uf) B).d;
		} else {
		    is = V;
		    is_221_ = rc;
		    is_222_ = fb;
		    is_223_ = J;
		}
		((en) Nb).Rb.copyNormals(is_222_, is, is_223_, is_221_,
					 3.0F / (float) nb,
					 3.0F / (float) (nb / 2 + nb), 0, 12,
					 pb, buffer.getAddress());
		if (!var_nba.a(93))
		    bool_217_ = false;
		else {
		    ((gm) fc).g = var_nba;
		    ((gm) fc).a = true;
		}
	    } else
		bool_217_ = false;
	}
	if (bool_216_) {
	    if (((gm) yb).b == null)
		((gm) yb).b = Nb.a(false, zc);
	    nba var_nba = ((gm) yb).b;
	    var_nba.a(-78, 8, 8 * pb);
	    Buffer buffer = var_nba.a(true, 32726);
	    if (buffer == null)
		bool_217_ = false;
	    else {
		((en) Nb).Rb.copyTexCoords(Kb, N, 0, 8, pb,
					   buffer.getAddress());
		if (!var_nba.a(52))
		    bool_217_ = false;
		else {
		    ((gm) yb).g = var_nba;
		    ((gm) yb).a = true;
		}
	    }
	}
	return bool_217_;
    }
    
    final void a(Class_q class_q, pba var_pba, int i) {
	Bc++;
	if (pb != 0) {
	    mga var_mga = ((en) Nb).Td;
	    if (!ab)
		e(false);
	    mga var_mga_224_ = (mga) class_q;
	    ws.H = (((mga) var_mga_224_).fb * ((mga) var_mga).I
		    + (((mga) var_mga).H * ((mga) var_mga_224_).q
		       + ((mga) var_mga).fb * ((mga) var_mga_224_).T));
	    dt.Db = (((mga) var_mga).E
		     + (((mga) var_mga_224_).p * ((mga) var_mga).fb
			+ ((mga) var_mga).H * ((mga) var_mga_224_).A
			+ ((mga) var_mga).I * ((mga) var_mga_224_).E));
	    float f = dt.Db + (float) vc * ws.H;
	    float f_225_ = ws.H * (float) Jb + dt.Db;
	    float f_226_;
	    float f_227_;
	    if (f > f_225_) {
		f_227_ = f + (float) Fb;
		f_226_ = (float) -Fb + f_225_;
	    } else {
		f_226_ = (float) -Fb + f;
		f_227_ = f_225_ + (float) Fb;
	    }
	    if (!(f_226_ >= ((en) Nb).De)
		&& !(f_227_ <= (float) ((en) Nb).Af)) {
		eca.w = (((mga) var_mga).A
			 + (((mga) var_mga_224_).E * ((mga) var_mga).gb
			    + (((mga) var_mga_224_).p * ((mga) var_mga).q
			       + ((mga) var_mga).M * ((mga) var_mga_224_).A)));
		wl.f = (((mga) var_mga).gb * ((mga) var_mga_224_).fb
			+ (((mga) var_mga_224_).q * ((mga) var_mga).M
			   + ((mga) var_mga_224_).T * ((mga) var_mga).q));
		float f_228_ = eca.w + wl.f * (float) vc;
		float f_229_ = eca.w + wl.f * (float) Jb;
		float f_230_;
		float f_231_;
		if (f_229_ < f_228_) {
		    f_230_ = ((float) Fb + f_228_) * (float) ((en) Nb).Zd;
		    f_231_ = (float) ((en) Nb).Zd * (f_229_ - (float) Fb);
		} else {
		    f_230_ = ((float) Fb + f_229_) * (float) ((en) Nb).Zd;
		    f_231_ = ((float) -Fb + f_228_) * (float) ((en) Nb).Zd;
		}
		if (!(f_231_ / f_227_ >= ((en) Nb).Ee)
		    && !(f_230_ / f_227_ <= ((en) Nb).Ye)) {
		    io.R = (((mga) var_mga_224_).A * ((mga) var_mga).cb
			    + ((mga) var_mga).T * ((mga) var_mga_224_).p
			    + ((mga) var_mga).F * ((mga) var_mga_224_).E
			    + ((mga) var_mga).p);
		    Class_eb.s
			= (((mga) var_mga).T * ((mga) var_mga_224_).T
			   + ((mga) var_mga_224_).q * ((mga) var_mga).cb
			   + ((mga) var_mga).F * ((mga) var_mga_224_).fb);
		    float f_232_ = io.R + (float) vc * Class_eb.s;
		    float f_233_ = io.R + Class_eb.s * (float) Jb;
		    float f_234_;
		    float f_235_;
		    if (!(f_232_ > f_233_)) {
			f_235_ = ((float) -Fb + f_232_) * (float) ((en) Nb).ef;
			f_234_ = (f_233_ + (float) Fb) * (float) ((en) Nb).ef;
		    } else {
			f_234_ = (float) ((en) Nb).ef * (f_232_ + (float) Fb);
			f_235_ = (float) ((en) Nb).ef * (f_233_ - (float) Fb);
		    }
		    if (!(f_235_ / f_227_ >= ((en) Nb).le)
			&& !(((en) Nb).Ne >= f_234_ / f_227_)) {
			if (var_pba != null || U != null) {
			    qj.Yc = (((mga) var_mga).I * ((mga) var_mga_224_).I
				     + ((((mga) var_mga_224_).F
					 * ((mga) var_mga).fb)
					+ (((mga) var_mga_224_).gb
					   * ((mga) var_mga).H)));
			    OutputStreamSub.d = (((mga) var_mga_224_).F * ((mga) var_mga).T
				    + (((mga) var_mga_224_).gb
				       * ((mga) var_mga).cb)
				    + (((mga) var_mga).F
				       * ((mga) var_mga_224_).I));
			    rd.n = (((mga) var_mga).H * ((mga) var_mga_224_).M
				    + (((mga) var_mga_224_).cb
				       * ((mga) var_mga).fb)
				    + (((mga) var_mga).I
				       * ((mga) var_mga_224_).H));
			    sg.c = (((mga) var_mga_224_).M * ((mga) var_mga).M
				    + (((mga) var_mga).q
				       * ((mga) var_mga_224_).cb)
				    + (((mga) var_mga_224_).H
				       * ((mga) var_mga).gb));
			    on.o = (((mga) var_mga).cb * ((mga) var_mga_224_).M
				    + (((mga) var_mga_224_).cb
				       * ((mga) var_mga).T)
				    + (((mga) var_mga).F
				       * ((mga) var_mga_224_).H));
			    client.aFloat
				= (((mga) var_mga_224_).I * ((mga) var_mga).gb
				   + ((((mga) var_mga).M
				       * ((mga) var_mga_224_).gb)
				      + (((mga) var_mga).q
					 * ((mga) var_mga_224_).F)));
			}
			if (var_pba != null) {
			    boolean bool = false;
			    boolean bool_236_ = true;
			    int i_237_ = pc + I >> 1;
			    int i_238_ = Pb + sb >> 1;
			    int i_239_ = (int) (client.aFloat * (float) i_238_
						+ (wl.f * (float) vc
						   + ((float) i_237_ * sg.c
						      + eca.w)));
			    int i_240_
				= (int) ((float) vc * Class_eb.s
					 + ((float) i_237_ * on.o + io.R)
					 + (float) i_238_ * OutputStreamSub.d);
			    int i_241_
				= (int) ((float) vc * ws.H
					 + ((float) i_237_ * rd.n + dt.Db)
					 + (float) i_238_ * qj.Yc);
			    if (i_241_ < ((en) Nb).Af)
				bool = true;
			    else {
				((pba) var_pba).k
				    = (((en) Nb).Zd * i_239_ / i_241_
				       + ((en) Nb).Ff);
				((pba) var_pba).g
				    = (((en) Nb).ze
				       + i_240_ * ((en) Nb).ef / i_241_);
			    }
			    int i_242_ = (int) (sg.c * (float) i_237_ + eca.w
						+ (float) Jb * wl.f
						+ (float) i_238_ * client.aFloat);
			    int i_243_ = (int) (io.R + (float) i_237_ * on.o
						+ Class_eb.s * (float) Jb
						+ (float) i_238_ * OutputStreamSub.d);
			    int i_244_
				= (int) ((float) Jb * ws.H
					 + (dt.Db + rd.n * (float) i_237_)
					 + qj.Yc * (float) i_238_);
			    if (((en) Nb).Af <= i_244_) {
				((pba) var_pba).i
				    = (i_243_ * ((en) Nb).ef / i_244_
				       + ((en) Nb).ze);
				((pba) var_pba).l
				    = (((en) Nb).Zd * i_242_ / i_244_
				       + ((en) Nb).Ff);
			    } else
				bool = true;
			    if (bool) {
				if (i_241_ >= ((en) Nb).Af
				    || ((en) Nb).Af <= i_244_) {
				    if (i_241_ < ((en) Nb).Af) {
					int i_245_
					    = ((i_244_ - ((en) Nb).Af << 16)
					       / (i_244_ - i_241_));
					int i_246_
					    = (i_242_
					       + ((i_242_ - i_239_) * i_245_
						  >> 16));
					((pba) var_pba).k
					    = (i_246_ * ((en) Nb).Zd
					       / ((en) Nb).Af) + ((en) Nb).Ff;
					int i_247_
					    = (i_243_
					       + ((i_243_ - i_240_) * i_245_
						  >> 16));
					((pba) var_pba).g
					    = (i_247_ * ((en) Nb).ef
					       / ((en) Nb).Af) + ((en) Nb).ze;
				    } else if (i_244_ < ((en) Nb).Af) {
					int i_248_
					    = ((i_241_ - ((en) Nb).Af << 16)
					       / (i_241_ - i_244_));
					int i_249_
					    = ((i_248_ * (i_239_ - i_242_)
						>> 16)
					       + i_239_);
					((pba) var_pba).k
					    = (((en) Nb).Zd * i_249_
					       / ((en) Nb).Af) + ((en) Nb).Ff;
					int i_250_
					    = (((i_240_ - i_243_) * i_248_
						>> 16)
					       + i_240_);
					((pba) var_pba).g
					    = (i_250_ * ((en) Nb).ef
					       / ((en) Nb).Af) + ((en) Nb).ze;
				    }
				} else
				    bool_236_ = false;
			    }
			    if (bool_236_) {
				((pba) var_pba).h = true;
				if (i_244_ >= i_241_)
				    ((pba) var_pba).j
					= (((Fb + i_242_) * ((en) Nb).Zd
					    / i_244_)
					   - ((pba) var_pba).l + ((en) Nb).Ff);
				else
				    ((pba) var_pba).j
					= (((en) Nb).Ff
					   + ((Fb + i_239_) * ((en) Nb).Zd
					      / i_241_)
					   - ((pba) var_pba).k);
			    }
			}
			Nb.J(8);
			Nb.a(-16926, var_mga_224_);
			e(29892);
			f(true);
		    }
		}
	    }
	}
    }
    
    final void a() {
	wc++;
	if (pb > 0 && O > 0) {
	    c(false);
	    d(124);
	    b((int) -116);
	}
    }
    
    final boolean b() {
	K++;
	if (bc == null)
	    return true;
	for (int i = 0; i < bc.length; i++) {
	    if ((bc[i] ^ 0xffffffff) != 0 && !((Class_r) Nb).j.a(false, bc[i]))
		return false;
	}
	return true;
    }
    
    final void a(int i, int[] is, int i_251_, int i_252_, int i_253_,
		 int i_254_, boolean bool) {
	S++;
	int i_255_ = is.length;
	if (i == 0) {
	    i_251_ <<= 4;
	    i_253_ <<= 4;
	    i_252_ <<= 4;
	    cs.h = 0;
	    int i_256_ = 0;
	    qd.t = 0;
	    Class_j.k = 0;
	    for (int i_257_ = 0; i_257_ < i_255_; i_257_++) {
		int i_258_ = is[i_257_];
		if (Ab.length > i_258_) {
		    int[] is_259_ = Ab[i_258_];
		    for (int i_260_ = 0; i_260_ < is_259_.length; i_260_++) {
			int i_261_ = is_259_[i_260_];
			cs.h += Z[i_261_];
			Class_j.k += jc[i_261_];
			qd.t += Ib[i_261_];
			i_256_++;
		    }
		}
	    }
	    if (i_256_ > 0) {
		cs.h = cs.h / i_256_ + i_251_;
		qd.t = i_253_ + qd.t / i_256_;
		Class_j.k = i_252_ + Class_j.k / i_256_;
	    } else {
		cs.h = i_251_;
		Class_j.k = i_252_;
		qd.t = i_253_;
	    }
	} else if (i == 1) {
	    i_251_ <<= 4;
	    i_253_ <<= 4;
	    i_252_ <<= 4;
	    for (int i_262_ = 0; i_255_ > i_262_; i_262_++) {
		int i_263_ = is[i_262_];
		if (i_263_ < Ab.length) {
		    int[] is_264_ = Ab[i_263_];
		    for (int i_265_ = 0; i_265_ < is_264_.length; i_265_++) {
			int i_266_ = is_264_[i_265_];
			Z[i_266_] += i_251_;
			jc[i_266_] += i_252_;
			Ib[i_266_] += i_253_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_267_ = 0; i_255_ > i_267_; i_267_++) {
		int i_268_ = is[i_267_];
		if (Ab.length > i_268_) {
		    int[] is_269_ = Ab[i_268_];
		    if ((0x1 & i_254_) == 0) {
			for (int i_270_ = 0; is_269_.length > i_270_;
			     i_270_++) {
			    int i_271_ = is_269_[i_270_];
			    Z[i_271_] -= cs.h;
			    jc[i_271_] -= Class_j.k;
			    Ib[i_271_] -= qd.t;
			    if (i_253_ != 0) {
				int i_272_ = GameInPacket.ints1[i_253_];
				int i_273_ = GameInPacket.ints2[i_253_];
				int i_274_
				    = i_273_ * Z[i_271_] + (jc[i_271_] * i_272_
							    + 16383) >> 14;
				jc[i_271_] = (i_273_ * jc[i_271_] + 16383
					      - i_272_ * Z[i_271_]) >> 14;
				Z[i_271_] = i_274_;
			    }
			    if (i_251_ != 0) {
				int i_275_ = GameInPacket.ints1[i_251_];
				int i_276_ = GameInPacket.ints2[i_251_];
				int i_277_ = ((jc[i_271_] * i_276_
					       - i_275_ * Ib[i_271_] + 16383)
					      >> 14);
				Ib[i_271_] = (jc[i_271_] * i_275_ + 16383
					      + i_276_ * Ib[i_271_]) >> 14;
				jc[i_271_] = i_277_;
			    }
			    if (i_252_ != 0) {
				int i_278_ = GameInPacket.ints1[i_252_];
				int i_279_ = GameInPacket.ints2[i_252_];
				int i_280_ = ((Z[i_271_] * i_279_
					       + Ib[i_271_] * i_278_ + 16383)
					      >> 14);
				Ib[i_271_] = (i_279_ * Ib[i_271_] + 16383
					      - Z[i_271_] * i_278_) >> 14;
				Z[i_271_] = i_280_;
			    }
			    Z[i_271_] += cs.h;
			    jc[i_271_] += Class_j.k;
			    Ib[i_271_] += qd.t;
			}
		    } else {
			for (int i_281_ = 0; is_269_.length > i_281_;
			     i_281_++) {
			    int i_282_ = is_269_[i_281_];
			    Z[i_282_] -= cs.h;
			    jc[i_282_] -= Class_j.k;
			    Ib[i_282_] -= qd.t;
			    if (i_251_ != 0) {
				int i_283_ = GameInPacket.ints1[i_251_];
				int i_284_ = GameInPacket.ints2[i_251_];
				int i_285_ = ((i_284_ * jc[i_282_]
					       - i_283_ * Ib[i_282_] + 16383)
					      >> 14);
				Ib[i_282_]
				    = i_283_ * jc[i_282_] - (-(i_284_
							       * Ib[i_282_])
							     - 16383) >> 14;
				jc[i_282_] = i_285_;
			    }
			    if (i_253_ != 0) {
				int i_286_ = GameInPacket.ints1[i_253_];
				int i_287_ = GameInPacket.ints2[i_253_];
				int i_288_ = ((Z[i_282_] * i_287_
					       + jc[i_282_] * i_286_ + 16383)
					      >> 14);
				jc[i_282_] = (-(i_286_ * Z[i_282_]) + 16383
					      + jc[i_282_] * i_287_) >> 14;
				Z[i_282_] = i_288_;
			    }
			    if (i_252_ != 0) {
				int i_289_ = GameInPacket.ints1[i_252_];
				int i_290_ = GameInPacket.ints2[i_252_];
				int i_291_ = ((Ib[i_282_] * i_289_ + 16383
					       + i_290_ * Z[i_282_])
					      >> 14);
				Ib[i_282_]
				    = (Ib[i_282_] * i_290_ - Z[i_282_] * i_289_
				       + 16383) >> 14;
				Z[i_282_] = i_291_;
			    }
			    Z[i_282_] += cs.h;
			    jc[i_282_] += Class_j.k;
			    Ib[i_282_] += qd.t;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_292_ = 0; i_292_ < i_255_; i_292_++) {
		    int i_293_ = is[i_292_];
		    if (Ab.length > i_293_) {
			int[] is_294_ = Ab[i_293_];
			for (int i_295_ = 0; is_294_.length > i_295_;
			     i_295_++) {
			    int i_296_ = is_294_[i_295_];
			    int i_297_ = M[i_296_];
			    int i_298_ = M[i_296_ + 1];
			    for (int i_299_ = i_297_; i_298_ > i_299_;
				 i_299_++) {
				int i_300_ = rb[i_299_] - 1;
				if (i_300_ == -1)
				    break;
				if (i_253_ != 0) {
				    int i_301_ = GameInPacket.ints1[i_253_];
				    int i_302_ = GameInPacket.ints2[i_253_];
				    int i_303_
					= ((fb[i_300_] * i_302_
					    + (V[i_300_] * i_301_ + 16383))
					   >> 14);
				    V[i_300_] = (short) ((i_302_ * V[i_300_]
							  - i_301_ * fb[i_300_]
							  + 16383)
							 >> 14);
				    fb[i_300_] = (short) i_303_;
				}
				if (i_251_ != 0) {
				    int i_304_ = GameInPacket.ints1[i_251_];
				    int i_305_ = GameInPacket.ints2[i_251_];
				    int i_306_
					= ((i_305_ * V[i_300_]
					    - J[i_300_] * i_304_ + 16383)
					   >> 14);
				    J[i_300_] = (short) ((V[i_300_] * i_304_
							  + i_305_ * J[i_300_]
							  + 16383)
							 >> 14);
				    V[i_300_] = (short) i_306_;
				}
				if (i_252_ != 0) {
				    int i_307_ = GameInPacket.ints1[i_252_];
				    int i_308_ = GameInPacket.ints2[i_252_];
				    int i_309_
					= ((fb[i_300_] * i_308_
					    + J[i_300_] * i_307_ + 16383)
					   >> 14);
				    J[i_300_] = (short) ((J[i_300_] * i_308_
							  - fb[i_300_] * i_307_
							  + 16383)
							 >> 14);
				    fb[i_300_] = (short) i_309_;
				}
			    }
			}
		    }
		}
		f(55);
	    }
	} else if (i == 3) {
	    for (int i_310_ = 0; i_310_ < i_255_; i_310_++) {
		int i_311_ = is[i_310_];
		if (i_311_ < Ab.length) {
		    int[] is_312_ = Ab[i_311_];
		    for (int i_313_ = 0; is_312_.length > i_313_; i_313_++) {
			int i_314_ = is_312_[i_313_];
			Z[i_314_] -= cs.h;
			jc[i_314_] -= Class_j.k;
			Ib[i_314_] -= qd.t;
			Z[i_314_] = Z[i_314_] * i_251_ >> 7;
			jc[i_314_] = jc[i_314_] * i_252_ >> 7;
			Ib[i_314_] = Ib[i_314_] * i_253_ >> 7;
			Z[i_314_] += cs.h;
			jc[i_314_] += Class_j.k;
			Ib[i_314_] += qd.t;
		    }
		}
	    }
	} else if (i == 5) {
	    if (cb != null) {
		boolean bool_315_ = false;
		for (int i_316_ = 0; i_316_ < i_255_; i_316_++) {
		    int i_317_ = is[i_316_];
		    if (cb.length > i_317_) {
			int[] is_318_ = cb[i_317_];
			for (int i_319_ = 0; is_318_.length > i_319_;
			     i_319_++) {
			    int i_320_ = is_318_[i_319_];
			    int i_321_ = (0xff & qb[i_320_]) + i_251_ * 8;
			    if (i_321_ >= 0) {
				if (i_321_ > 255)
				    i_321_ = 255;
			    } else
				i_321_ = 0;
			    qb[i_320_] = (byte) i_321_;
			}
			bool_315_ = bool_315_ | is_318_.length > 0;
		    }
		}
		if (bool_315_) {
		    if (U != null) {
			for (int i_322_ = 0; Wb > i_322_; i_322_++) {
			    oh var_oh = U[i_322_];
			    mfa var_mfa = db[i_322_];
			    ((mfa) var_mfa).l
				= (0xffffff & ((mfa) var_mfa).l
				   | (-(0xff & qb[((oh) var_oh).e]) + 255
				      << 24));
			}
		    }
		    b(false);
		}
	    }
	} else if (i == 7) {
	    if (cb != null) {
		boolean bool_323_ = false;
		for (int i_324_ = 0; i_255_ > i_324_; i_324_++) {
		    int i_325_ = is[i_324_];
		    if (cb.length > i_325_) {
			int[] is_326_ = cb[i_325_];
			for (int i_327_ = 0; i_327_ < is_326_.length;
			     i_327_++) {
			    int i_328_ = is_326_[i_327_];
			    int i_329_ = Fc[i_328_] & 0xffff;
			    int i_330_ = (i_329_ & 0xfc47) >> 10;
			    int i_331_ = 0x7 & i_329_ >> 7;
			    i_331_ += i_252_ / 4;
			    i_330_ = i_251_ + i_330_ & 0x3f;
			    int i_332_ = 0x7f & i_329_;
			    i_332_ += i_253_;
			    if (i_331_ < 0)
				i_331_ = 0;
			    else if (i_331_ > 7)
				i_331_ = 7;
			    if (i_332_ < 0)
				i_332_ = 0;
			    else if (i_332_ > 127)
				i_332_ = 127;
			    Fc[i_328_] = (short) hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_331_ << 7,
							     i_330_ << 10),
						       i_332_);
			}
			bool_323_ = bool_323_ | is_326_.length > 0;
		    }
		}
		if (bool_323_) {
		    if (U != null) {
			for (int i_333_ = 0; Wb > i_333_; i_333_++) {
			    oh var_oh = U[i_333_];
			    mfa var_mfa = db[i_333_];
			    ((mfa) var_mfa).l
				= (ji.j[0xffff & Fc[((oh) var_oh).e]]
				   & 0xffffff) | ~0xffffff & ((mfa) var_mfa).l;
			}
		    }
		    b(false);
		}
	    }
	} else if (i == 8) {
	    if (z != null) {
		for (int i_334_ = 0; i_334_ < i_255_; i_334_++) {
		    int i_335_ = is[i_334_];
		    if (i_335_ < z.length) {
			int[] is_336_ = z[i_335_];
			for (int i_337_ = 0; i_337_ < is_336_.length;
			     i_337_++) {
			    mfa var_mfa = db[is_336_[i_337_]];
			    ((mfa) var_mfa).e += i_252_;
			    ((mfa) var_mfa).h += i_251_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (z != null) {
		for (int i_338_ = 0; i_338_ < i_255_; i_338_++) {
		    int i_339_ = is[i_338_];
		    if (z.length > i_339_) {
			int[] is_340_ = z[i_339_];
			for (int i_341_ = 0; is_340_.length > i_341_;
			     i_341_++) {
			    mfa var_mfa = db[is_340_[i_341_]];
			    ((mfa) var_mfa).n
				= i_251_ * ((mfa) var_mfa).n >> 7;
			    ((mfa) var_mfa).d
				= ((mfa) var_mfa).d * i_252_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9 && z != null) {
	    for (int i_342_ = 0; i_342_ < i_255_; i_342_++) {
		int i_343_ = is[i_342_];
		if (z.length > i_343_) {
		    int[] is_344_ = z[i_343_];
		    for (int i_345_ = 0; i_345_ < is_344_.length; i_345_++) {
			mfa var_mfa = db[is_344_[i_345_]];
			((mfa) var_mfa).m
			    = 0x3fff & i_251_ + ((mfa) var_mfa).m;
		    }
		}
	    }
	}
    }
    
    final int l() {
	E++;
	if (!ab)
	    e(false);
	return pc;
    }
    
    final void d() {
	xc++;
    }
    
    private final void a(ok var_ok, byte i) {
	if (pb > cv.y.length) {
	    kw.C = new int[pb];
	    cv.y = new int[pb];
	}
	G++;
	for (int i_346_ = 0; i_346_ < Db; i_346_++) {
	    int i_347_ = ((Z[i_346_] - (jc[i_346_] * ((en) Nb).jf >> 8)
			   >> ((en) Nb).ae)
			  - ((ok) var_ok).y);
	    int i_348_ = ((Ib[i_346_] - (((en) Nb).Pe * jc[i_346_] >> 8)
			   >> ((en) Nb).ae)
			  - ((ok) var_ok).B);
	    int i_349_ = M[i_346_];
	    int i_350_ = M[i_346_ + 1];
	    for (int i_351_ = i_349_; i_351_ < i_350_; i_351_++) {
		int i_352_ = rb[i_351_] - 1;
		if (i_352_ == -1)
		    break;
		cv.y[i_352_] = i_347_;
		kw.C[i_352_] = i_348_;
	    }
	}
	for (int i_353_ = 0; i_353_ < O; i_353_++) {
	    if (qb == null || qb[i_353_] <= 128) {
		short i_354_ = bb[i_353_];
		short i_355_ = T[i_353_];
		short i_356_ = sc[i_353_];
		int i_357_ = cv.y[i_354_];
		int i_358_ = cv.y[i_355_];
		int i_359_ = cv.y[i_356_];
		int i_360_ = kw.C[i_354_];
		int i_361_ = kw.C[i_355_];
		int i_362_ = kw.C[i_356_];
		if (((i_357_ - i_358_) * (i_361_ - i_362_)
		     - (i_361_ - i_360_) * (i_359_ - i_358_))
		    > 0)
		    var_ok.a(i_359_, -3417, i_360_, i_362_, i_357_, i_358_,
			     i_361_);
	    }
	}
	if (i <= 41)
	    Bb = null;
    }
    
    private final void d(boolean bool) {
	if (Jc != null)
	    ((fs) Jc).a = false;
	if (bool != false)
	    b((byte) 113);
	Hb++;
    }
    
    private final void e(boolean bool) {
	Zb++;
	int i = 32767;
	int i_363_ = 32767;
	int i_364_ = 32767;
	int i_365_ = -32768;
	int i_366_ = -32768;
	if (bool != false)
	    w = 20;
	int i_367_ = -32768;
	int i_368_ = 0;
	int i_369_ = 0;
	for (int i_370_ = 0; i_370_ < Db; i_370_++) {
	    int i_371_ = Z[i_370_];
	    int i_372_ = jc[i_370_];
	    int i_373_ = Ib[i_370_];
	    if (i_366_ < i_372_)
		i_366_ = i_372_;
	    if (i_363_ > i_372_)
		i_363_ = i_372_;
	    if (i_371_ < i)
		i = i_371_;
	    if (i_371_ > i_365_)
		i_365_ = i_371_;
	    if (i_364_ > i_373_)
		i_364_ = i_373_;
	    if (i_367_ < i_373_)
		i_367_ = i_373_;
	    int i_374_ = i_371_ * i_371_ + i_373_ * i_373_;
	    if (i_368_ < i_374_)
		i_368_ = i_374_;
	    i_374_ = i_372_ * i_372_ + (i_371_ * i_371_ + i_373_ * i_373_);
	    if (i_369_ < i_374_)
		i_369_ = i_374_;
	}
	Jb = i_366_;
	I = i;
	pc = i_365_;
	sb = i_364_;
	vc = i_363_;
	Pb = i_367_;
	Fb = (int) (Math.sqrt((double) i_368_) + 0.99);
	w = (int) (Math.sqrt((double) i_369_) + 0.99);
	ab = true;
    }
    
    final void MA(int i) {
	ub++;
	int i_375_ = GameInPacket.ints1[i];
	int i_376_ = GameInPacket.ints2[i];
	for (int i_377_ = 0; i_377_ < Db; i_377_++) {
	    int i_378_ = jc[i_377_] * i_376_ - i_375_ * Ib[i_377_] >> 14;
	    Ib[i_377_] = jc[i_377_] * i_375_ + i_376_ * Ib[i_377_] >> 14;
	    jc[i_377_] = i_378_;
	}
	b((byte) 112);
	ab = false;
    }
    
    final boolean a(int i, int i_379_, Class_q class_q, boolean bool,
		    int i_380_) {
	y++;
	return a(i_380_, i_379_, bool, class_q, i, -118);
    }
    
    final void a(da var_da, int i, int i_381_, int i_382_, boolean bool) {
	Rb++;
	ja var_ja_383_ = (ja) var_da;
	if (uc != 0 && var_ja_383_.uc != 0) {
	    int i_384_ = var_ja_383_.Db;
	    int[] is = var_ja_383_.Z;
	    int[] is_385_ = var_ja_383_.jc;
	    int[] is_386_ = var_ja_383_.Ib;
	    short[] is_387_ = var_ja_383_.fb;
	    short[] is_388_ = var_ja_383_.V;
	    short[] is_389_ = var_ja_383_.J;
	    byte[] is_390_ = var_ja_383_.rc;
	    short[] is_391_;
	    short[] is_392_;
	    short[] is_393_;
	    byte[] is_394_;
	    if (B == null) {
		is_394_ = null;
		is_392_ = null;
		is_391_ = null;
		is_393_ = null;
	    } else {
		is_391_ = ((uf) B).b;
		is_392_ = ((uf) B).d;
		is_393_ = ((uf) B).f;
		is_394_ = ((uf) B).c;
	    }
	    byte[] is_395_;
	    short[] is_396_;
	    short[] is_397_;
	    short[] is_398_;
	    if (var_ja_383_.B == null) {
		is_396_ = null;
		is_395_ = null;
		is_397_ = null;
		is_398_ = null;
	    } else {
		is_395_ = ((uf) var_ja_383_.B).c;
		is_396_ = ((uf) var_ja_383_.B).f;
		is_397_ = ((uf) var_ja_383_.B).b;
		is_398_ = ((uf) var_ja_383_.B).d;
	    }
	    int[] is_399_ = var_ja_383_.M;
	    short[] is_400_ = var_ja_383_.rb;
	    if (!var_ja_383_.ab)
		var_ja_383_.e(false);
	    int i_401_ = var_ja_383_.vc;
	    int i_402_ = var_ja_383_.Jb;
	    int i_403_ = var_ja_383_.I;
	    int i_404_ = var_ja_383_.pc;
	    int i_405_ = var_ja_383_.sb;
	    int i_406_ = var_ja_383_.Pb;
	    for (int i_407_ = 0; Db > i_407_; i_407_++) {
		int i_408_ = jc[i_407_] - i_381_;
		if (i_401_ <= i_408_ && i_402_ >= i_408_) {
		    int i_409_ = Z[i_407_] - i;
		    if (i_409_ >= i_403_ && i_404_ >= i_409_) {
			int i_410_ = Ib[i_407_] - i_382_;
			if (i_410_ >= i_405_ && i_406_ >= i_410_) {
			    int i_411_ = -1;
			    int i_412_ = M[i_407_];
			    int i_413_ = M[i_407_ + 1];
			    for (int i_414_ = i_412_; i_413_ > i_414_;
				 i_414_++) {
				i_411_ = rb[i_414_] - 1;
				if (i_411_ == -1 || rc[i_411_] != 0)
				    break;
			    }
			    if ((i_411_ ^ 0xffffffff) != 0) {
				for (int i_415_ = 0; i_384_ > i_415_;
				     i_415_++) {
				    if (is[i_415_] == i_409_
					&& is_386_[i_415_] == i_410_
					&& is_385_[i_415_] == i_408_) {
					i_412_ = is_399_[i_415_];
					i_413_ = is_399_[i_415_ + 1];
					int i_416_ = -1;
					for (int i_417_ = i_412_;
					     i_413_ > i_417_; i_417_++) {
					    i_416_ = is_400_[i_417_] - 1;
					    if ((i_416_ ^ 0xffffffff) == 0
						|| is_390_[i_416_] != 0)
						break;
					}
					if ((i_416_ ^ 0xffffffff) != 0) {
					    if (is_391_ == null) {
						B = new uf();
						is_391_ = ((uf) B).b
						    = mca.a(0, fb);
						is_393_ = ((uf) B).f
						    = mca.a(0, V);
						is_392_ = ((uf) B).d
						    = mca.a(0, J);
						is_394_ = ((uf) B).c
						    = InputStreamSub_1.a(true, rc);
					    }
					    if (is_397_ == null) {
						uf var_uf
						    = var_ja_383_.B = new uf();
						is_397_ = ((uf) var_uf).b
						    = mca.a(0, is_387_);
						is_396_ = ((uf) var_uf).f
						    = mca.a(0, is_388_);
						is_398_ = ((uf) var_uf).d
						    = mca.a(0, is_389_);
						is_395_ = ((uf) var_uf).c
						    = InputStreamSub_1.a(true, is_390_);
					    }
					    short i_418_ = fb[i_411_];
					    short i_419_ = V[i_411_];
					    short i_420_ = J[i_411_];
					    byte i_421_ = rc[i_411_];
					    i_413_ = is_399_[i_415_ + 1];
					    i_412_ = is_399_[i_415_];
					    for (int i_422_ = i_412_;
						 i_422_ < i_413_; i_422_++) {
						int i_423_
						    = is_400_[i_422_] - 1;
						if ((i_423_ ^ 0xffffffff) == 0)
						    break;
						if (is_395_[i_423_] != 0) {
						    is_397_[i_423_] += i_418_;
						    is_396_[i_423_] += i_419_;
						    is_398_[i_423_] += i_420_;
						    is_395_[i_423_] += i_421_;
						}
					    }
					    i_412_ = M[i_407_];
					    i_419_ = is_388_[i_416_];
					    i_413_ = M[i_407_ + 1];
					    i_421_ = is_390_[i_416_];
					    i_418_ = is_387_[i_416_];
					    i_420_ = is_389_[i_416_];
					    for (int i_424_ = i_412_;
						 i_413_ > i_424_; i_424_++) {
						int i_425_ = rb[i_424_] - 1;
						if ((i_425_ ^ 0xffffffff) == 0)
						    break;
						if (is_394_[i_425_] != 0) {
						    is_391_[i_425_] += i_418_;
						    is_393_[i_425_] += i_419_;
						    is_392_[i_425_] += i_420_;
						    is_394_[i_425_] += i_421_;
						}
					    }
					    var_ja_383_.f(55);
					    f(55);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final da a(ja var_ja_426_, ja var_ja_427_, boolean bool, int i,
		       int i_428_, boolean bool_429_) {
	var_ja_426_.nb = nb;
	var_ja_426_.Db = Db;
	H++;
	if ((0x100 & i) == 0)
	    var_ja_426_.vb = vb;
	else
	    var_ja_426_.vb = true;
	var_ja_426_.X = X;
	var_ja_426_.oc = oc;
	var_ja_426_.uc = uc;
	var_ja_426_.O = O;
	var_ja_426_.pb = pb;
	var_ja_426_.Qb = Qb;
	var_ja_426_.Wb = Wb;
	if (i_428_ < 107)
	    Db = -52;
	var_ja_426_.ib = i;
	boolean bool_430_ = wg.a(oc, i, false);
	boolean bool_431_ = ew.a(i, 1, oc);
	boolean bool_432_ = tfa.a((byte) 87, oc, i);
	boolean bool_433_ = bool_431_ | bool_430_ | bool_432_;
	if (!bool_433_) {
	    var_ja_426_.jc = jc;
	    var_ja_426_.Z = Z;
	    var_ja_426_.Ib = Ib;
	} else {
	    if (!bool_430_)
		var_ja_426_.Z = Z;
	    else if (var_ja_427_.Z != null && X <= var_ja_427_.Z.length)
		var_ja_426_.Z = var_ja_427_.Z;
	    else
		var_ja_426_.Z = var_ja_427_.Z = new int[X];
	    if (bool_431_) {
		if (var_ja_427_.jc == null || X > var_ja_427_.jc.length)
		    var_ja_426_.jc = var_ja_427_.jc = new int[X];
		else
		    var_ja_426_.jc = var_ja_427_.jc;
	    } else
		var_ja_426_.jc = jc;
	    if (!bool_432_)
		var_ja_426_.Ib = Ib;
	    else if (var_ja_427_.Ib != null && X <= var_ja_427_.Ib.length)
		var_ja_426_.Ib = var_ja_427_.Ib;
	    else
		var_ja_426_.Ib = var_ja_427_.Ib = new int[X];
	    for (int i_434_ = 0; i_434_ < X; i_434_++) {
		if (bool_430_)
		    var_ja_426_.Z[i_434_] = Z[i_434_];
		if (bool_431_)
		    var_ja_426_.jc[i_434_] = jc[i_434_];
		if (bool_432_)
		    var_ja_426_.Ib[i_434_] = Ib[i_434_];
	    }
	}
	if (oe.a(68, i, oc)) {
	    var_ja_426_.P = var_ja_427_.P;
	    ((gm) var_ja_426_.P).a = ((gm) P).a;
	    ((gm) var_ja_426_.P).g = ((gm) P).g;
	    ((gm) var_ja_426_.P).h = true;
	} else if (!Class_ob.a(oc, (byte) 92, i))
	    var_ja_426_.P = null;
	else
	    var_ja_426_.P = P;
	if (kl.a((byte) 46, oc, i)) {
	    if (var_ja_427_.Fc == null || uc > var_ja_427_.Fc.length)
		var_ja_426_.Fc = var_ja_427_.Fc = new short[uc];
	    else
		var_ja_426_.Fc = var_ja_427_.Fc;
	    for (int i_435_ = 0; i_435_ < uc; i_435_++)
		var_ja_426_.Fc[i_435_] = Fc[i_435_];
	} else
	    var_ja_426_.Fc = Fc;
	if (!WorldSub.a(i, oc))
	    var_ja_426_.qb = qb;
	else {
	    if (var_ja_427_.qb != null && uc <= var_ja_427_.qb.length)
		var_ja_426_.qb = var_ja_427_.qb;
	    else
		var_ja_426_.qb = var_ja_427_.qb = new byte[uc];
	    for (int i_436_ = 0; i_436_ < uc; i_436_++)
		var_ja_426_.qb[i_436_] = qb[i_436_];
	}
	if (!jv.a(3, i, oc)) {
	    if (!sda.a((byte) 77, oc, i))
		var_ja_426_.Q = null;
	    else
		var_ja_426_.Q = Q;
	} else {
	    var_ja_426_.Q = var_ja_427_.Q;
	    ((gm) var_ja_426_.Q).a = ((gm) Q).a;
	    ((gm) var_ja_426_.Q).g = ((gm) Q).g;
	    ((gm) var_ja_426_.Q).h = true;
	}
	if (cj.a(oc, -545, i)) {
	    if (var_ja_427_.fb != null && pb <= var_ja_427_.fb.length) {
		var_ja_426_.fb = var_ja_427_.fb;
		var_ja_426_.J = var_ja_427_.J;
		var_ja_426_.V = var_ja_427_.V;
	    } else {
		int i_437_ = pb;
		var_ja_426_.V = var_ja_427_.V = new short[i_437_];
		var_ja_426_.fb = var_ja_427_.fb = new short[i_437_];
		var_ja_426_.J = var_ja_427_.J = new short[i_437_];
	    }
	    if (B == null) {
		var_ja_426_.B = null;
		for (int i_438_ = 0; pb > i_438_; i_438_++) {
		    var_ja_426_.fb[i_438_] = fb[i_438_];
		    var_ja_426_.V[i_438_] = V[i_438_];
		    var_ja_426_.J[i_438_] = J[i_438_];
		}
	    } else {
		if (var_ja_427_.B == null)
		    var_ja_427_.B = new uf();
		uf var_uf = var_ja_426_.B = var_ja_427_.B;
		if (((uf) var_uf).b == null || ((uf) var_uf).b.length < pb) {
		    int i_439_ = pb;
		    ((uf) var_uf).d = new short[i_439_];
		    ((uf) var_uf).f = new short[i_439_];
		    ((uf) var_uf).c = new byte[i_439_];
		    ((uf) var_uf).b = new short[i_439_];
		}
		for (int i_440_ = 0; i_440_ < pb; i_440_++) {
		    var_ja_426_.fb[i_440_] = fb[i_440_];
		    var_ja_426_.V[i_440_] = V[i_440_];
		    var_ja_426_.J[i_440_] = J[i_440_];
		    ((uf) var_uf).b[i_440_] = ((uf) B).b[i_440_];
		    ((uf) var_uf).f[i_440_] = ((uf) B).f[i_440_];
		    ((uf) var_uf).d[i_440_] = ((uf) B).d[i_440_];
		    ((uf) var_uf).c[i_440_] = ((uf) B).c[i_440_];
		}
	    }
	    var_ja_426_.rc = rc;
	} else {
	    var_ja_426_.J = J;
	    var_ja_426_.rc = rc;
	    var_ja_426_.fb = fb;
	    var_ja_426_.B = B;
	    var_ja_426_.V = V;
	}
	if (!bk.a(oc, i, -128)) {
	    if (!gm.a(i, 0, oc))
		var_ja_426_.fc = null;
	    else
		var_ja_426_.fc = fc;
	} else {
	    var_ja_426_.fc = var_ja_427_.fc;
	    ((gm) var_ja_426_.fc).h = true;
	    ((gm) var_ja_426_.fc).g = ((gm) fc).g;
	    ((gm) var_ja_426_.fc).a = ((gm) fc).a;
	}
	if (client.a(/*(byte) 60,*/ oc, i)) {
	    if (var_ja_427_.Kb == null || uc > var_ja_427_.Kb.length) {
		int i_441_ = pb;
		var_ja_426_.N = var_ja_427_.N = new float[i_441_];
		var_ja_426_.Kb = var_ja_427_.Kb = new float[i_441_];
	    } else {
		var_ja_426_.Kb = var_ja_427_.Kb;
		var_ja_426_.N = var_ja_427_.N;
	    }
	    for (int i_442_ = 0; pb > i_442_; i_442_++) {
		var_ja_426_.Kb[i_442_] = Kb[i_442_];
		var_ja_426_.N[i_442_] = N[i_442_];
	    }
	} else {
	    var_ja_426_.Kb = Kb;
	    var_ja_426_.N = N;
	}
	if (kq.a(oc, i, true)) {
	    var_ja_426_.yb = var_ja_427_.yb;
	    ((gm) var_ja_426_.yb).a = ((gm) yb).a;
	    ((gm) var_ja_426_.yb).h = true;
	    ((gm) var_ja_426_.yb).g = ((gm) yb).g;
	} else if (!Class_jc.a(oc, i, -108))
	    var_ja_426_.yb = null;
	else
	    var_ja_426_.yb = yb;
	if (!Class_hb.a(i, (byte) -93, oc)) {
	    var_ja_426_.sc = sc;
	    var_ja_426_.bb = bb;
	    var_ja_426_.T = T;
	} else {
	    if (var_ja_427_.bb != null && var_ja_427_.bb.length >= uc) {
		var_ja_426_.T = var_ja_427_.T;
		var_ja_426_.bb = var_ja_427_.bb;
		var_ja_426_.sc = var_ja_427_.sc;
	    } else {
		int i_443_ = uc;
		var_ja_426_.sc = var_ja_427_.sc = new short[i_443_];
		var_ja_426_.T = var_ja_427_.T = new short[i_443_];
		var_ja_426_.bb = var_ja_427_.bb = new short[i_443_];
	    }
	    for (int i_444_ = 0; i_444_ < uc; i_444_++) {
		var_ja_426_.bb[i_444_] = bb[i_444_];
		var_ja_426_.T[i_444_] = T[i_444_];
		var_ja_426_.sc[i_444_] = sc[i_444_];
	    }
	}
	if (oga.b(128, i, oc)) {
	    var_ja_426_.Jc = var_ja_427_.Jc;
	    ((fs) var_ja_426_.Jc).c = ((fs) Jc).c;
	    ((fs) var_ja_426_.Jc).f = true;
	    ((fs) var_ja_426_.Jc).a = ((fs) Jc).a;
	} else if (!sm.a(i, 0, oc))
	    var_ja_426_.Jc = null;
	else
	    var_ja_426_.Jc = Jc;
	if (Class_kf.a((byte) 71, oc, i)) {
	    if (var_ja_427_.bc == null || var_ja_427_.bc.length < uc) {
		int i_445_ = uc;
		var_ja_426_.bc = var_ja_427_.bc = new short[i_445_];
	    } else
		var_ja_426_.bc = var_ja_427_.bc;
	    for (int i_446_ = 0; uc > i_446_; i_446_++)
		var_ja_426_.bc[i_446_] = bc[i_446_];
	} else
	    var_ja_426_.bc = bc;
	if (to.a(i, oc, (byte) -36)) {
	    if (var_ja_427_.db == null || var_ja_427_.db.length < Wb) {
		int i_447_ = Wb;
		var_ja_426_.db = var_ja_427_.db = new mfa[i_447_];
		for (int i_448_ = 0; Wb > i_448_; i_448_++)
		    var_ja_426_.db[i_448_] = db[i_448_].a(45);
	    } else {
		var_ja_426_.db = var_ja_427_.db;
		for (int i_449_ = 0; Wb > i_449_; i_449_++)
		    var_ja_426_.db[i_449_].a(db[i_449_], 255);
	    }
	} else
	    var_ja_426_.db = db;
	var_ja_426_.z = z;
	var_ja_426_.rb = rb;
	var_ja_426_.lc = lc;
	var_ja_426_.cb = cb;
	var_ja_426_.A = A;
	if (ab) {
	    var_ja_426_.Pb = Pb;
	    var_ja_426_.ab = true;
	    var_ja_426_.I = I;
	    var_ja_426_.w = w;
	    var_ja_426_.pc = pc;
	    var_ja_426_.Jb = Jb;
	    var_ja_426_.Fb = Fb;
	    var_ja_426_.vc = vc;
	    var_ja_426_.sb = sb;
	} else
	    var_ja_426_.ab = false;
	var_ja_426_.hb = hb;
	var_ja_426_.tc = tc;
	var_ja_426_.M = M;
	var_ja_426_.gb = gb;
	var_ja_426_.Bb = Bb;
	var_ja_426_.Ab = Ab;
	var_ja_426_.U = U;
	var_ja_426_.x = x;
	var_ja_426_.kc = kc;
	var_ja_426_.xb = xb;
	return var_ja_426_;
    }
    
    private final void e(int i) {
	W++;
	if (i != 29892)
	    S(null);
	if (O != 0) {
	    if (c(false) && d(123)) {
		Nb.a((byte) -16, ((gm) P).g, 0);
		Nb.a((byte) -16, ((gm) Q).g, 1);
		Nb.a((byte) -16, ((gm) yb).g, 2);
		boolean bool;
		if ((oc & 0x37) != 0) {
		    bool = true;
		    Nb.a(true, i - 29818);
		    Nb.a((byte) -16, ((gm) fc).g, 3);
		    Nb.a(true, ((en) Nb).ig);
		} else {
		    Nb.a(false, (int) 123);
		    bool = false;
		    Nb.a(true, ((en) Nb).Wf);
		}
		for (int i_450_ = 0; lc.length > i_450_; i_450_++) {
		    int i_451_ = xb[i_450_];
		    int i_452_ = xb[i_450_ + 1];
		    int i_453_ = bc[i_451_] & 0xffff;
		    if (i_453_ == 65535)
			i_453_ = -1;
		    Nb.a(0, i_453_, bool, true);
		    Nb.a(tc[i_450_], mo.E, 3 * i_451_, 12896, i_452_ - i_451_,
			 lc[i_450_], ((fs) Jc).c);
		}
	    }
	    b((int) -94);
	}
    }
    
    ja(en var_en, eg var_eg, int i, int i_454_, int i_455_, int i_456_) {
	this(var_en, i, i_456_, true, false);
	fa var_fa = ((Class_r) var_en).j;
	int[] is = new int[((eg) var_eg).G];
	M = new int[((eg) var_eg).l + 1];
	for (int i_457_ = 0; i_457_ < ((eg) var_eg).G; i_457_++) {
	    if ((((eg) var_eg).U == null || ((eg) var_eg).U[i_457_] != 2)
		&& (((eg) var_eg).B == null || ((eg) var_eg).B[i_457_] == -1
		    || !((vca) var_fa.a(0xffff & ((eg) var_eg).B[i_457_],
					(byte) 86)).x)) {
		is[uc++] = i_457_;
		M[((eg) var_eg).O[i_457_]]++;
		M[((eg) var_eg).v[i_457_]]++;
		M[((eg) var_eg).a[i_457_]]++;
	    }
	}
	O = uc;
	long[] ls = new long[uc];
	boolean bool = (0x100 & ib) != 0;
    while_59_:
	for (int i_458_ = 0; i_458_ < uc; i_458_++) {
	    int i_459_ = is[i_458_];
	    vca var_vca = null;
	    int i_460_ = 0;
	    int i_461_ = 0;
	    int i_462_ = 0;
	    int i_463_ = 0;
	    if (((eg) var_eg).N != null) {
		for (int i_464_ = 0; ((eg) var_eg).N.length > i_464_;
		     i_464_++) {
		    lw var_lw = ((eg) var_eg).N[i_464_];
		    if (i_459_ == ((lw) var_lw).c) {
			cj var_cj = kg.a(((lw) var_lw).g, -102);
			if (((cj) var_cj).d) {
			    ls[i_458_] = 9223372036854775807L;
			    O--;
			    continue while_59_;
			}
		    }
		}
	    }
	    int i_465_ = -1;
	    if (((eg) var_eg).B != null) {
		i_465_ = ((eg) var_eg).B[i_459_];
		if (i_465_ != -1) {
		    var_vca = var_fa.a(i_465_ & 0xffff, (byte) 86);
		    i_462_ = ((vca) var_vca).i;
		    i_463_ = ((vca) var_vca).w;
		}
	    }
	    boolean bool_466_
		= (((eg) var_eg).m != null && ((eg) var_eg).m[i_459_] != 0
		   || (var_vca != null
		       && !((vca) var_vca).e | ((vca) var_vca).s));
	    if ((bool || bool_466_) && ((eg) var_eg).w != null)
		i_460_ += ((eg) var_eg).w[i_459_] << 17;
	    if (bool_466_)
		i_460_ += 65536;
	    i_460_ += 0xff00 & i_462_ << 8;
	    i_460_ += i_463_ & 0xff;
	    i_461_ += i_465_ << 16 & ~0xffff;
	    i_461_ += 0xffff & i_458_;
	    ls[i_458_] = ((long) i_460_ << 32) + (long) i_461_;
	    vb |= bool_466_;
	}
	qk.a((byte) 59, ls, is);
	X = ((eg) var_eg).z;
	jc = ((eg) var_eg).W;
	Db = ((eg) var_eg).l;
	kc = ((eg) var_eg).f;
	Ib = ((eg) var_eg).R;
	Z = ((eg) var_eg).o;
	Class_fc[] class_fcs = new Class_fc[Db];
	Bb = ((eg) var_eg).q;
	x = ((eg) var_eg).i;
	if (((eg) var_eg).N != null) {
	    Wb = ((eg) var_eg).N.length;
	    db = new mfa[Wb];
	    U = new oh[Wb];
	    for (int i_467_ = 0; Wb > i_467_; i_467_++) {
		lw var_lw = ((eg) var_eg).N[i_467_];
		cj var_cj = kg.a(((lw) var_lw).g, -124);
		int i_468_ = -1;
		for (int i_469_ = 0; uc > i_469_; i_469_++) {
		    if (is[i_469_] == ((lw) var_lw).c) {
			i_468_ = i_469_;
			break;
		    }
		}
		if ((i_468_ ^ 0xffffffff) == 0)
		    throw new RuntimeException();
		int i_470_
		    = (0xffffff
		       & ji.j[((eg) var_eg).Z[((lw) var_lw).c] & 0xffff]);
		i_470_ = i_470_ | (-(((eg) var_eg).m == null ? (int) 0
				     : ((eg) var_eg).m[((lw) var_lw).c]) + 255
				   << 24);
		U[i_467_]
		    = new oh(i_468_, ((eg) var_eg).O[((lw) var_lw).c],
			     ((eg) var_eg).v[((lw) var_lw).c],
			     ((eg) var_eg).a[((lw) var_lw).c], ((cj) var_cj).g,
			     ((cj) var_cj).var_n, ((cj) var_cj).i, ((cj) var_cj).f,
			     ((cj) var_cj).m, ((cj) var_cj).d, ((cj) var_cj).b,
			     ((lw) var_lw).a);
		db[i_467_] = new mfa(i_470_);
	    }
	}
	int i_471_ = uc * 3;
	N = new float[i_471_];
	Kb = new float[i_471_];
	bb = new short[uc];
	T = new short[uc];
	Fc = new short[uc];
	nb = (short) i_455_;
	sc = new short[uc];
	if (((eg) var_eg).C != null)
	    gb = new short[uc];
	Qb = (short) i_454_;
	rb = new short[i_471_];
	bc = new short[uc];
	hb = new short[i_471_];
	rc = new byte[i_471_];
	A = new short[i_471_];
	fb = new short[i_471_];
	V = new short[i_471_];
	sd.j = new long[i_471_];
	J = new short[i_471_];
	qb = new byte[uc];
	int i_472_ = 0;
	for (int i_473_ = 0; ((eg) var_eg).l > i_473_; i_473_++) {
	    int i_474_ = M[i_473_];
	    M[i_473_] = i_472_;
	    i_472_ += i_474_;
	    class_fcs[i_473_] = new Class_fc();
	}
	M[((eg) var_eg).l] = i_472_;
	int[] is_475_ = null;
	int[] is_476_ = null;
	int[] is_477_ = null;
	float[][] fs = null;
	if (((eg) var_eg).e != null) {
	    int i_478_ = ((eg) var_eg).L;
	    int[] is_479_ = new int[i_478_];
	    int[] is_480_ = new int[i_478_];
	    int[] is_481_ = new int[i_478_];
	    int[] is_482_ = new int[i_478_];
	    int[] is_483_ = new int[i_478_];
	    int[] is_484_ = new int[i_478_];
	    for (int i_485_ = 0; i_478_ > i_485_; i_485_++) {
		is_479_[i_485_] = 2147483647;
		is_480_[i_485_] = -2147483647;
		is_481_[i_485_] = 2147483647;
		is_482_[i_485_] = -2147483647;
		is_483_[i_485_] = 2147483647;
		is_484_[i_485_] = -2147483647;
	    }
	    fs = new float[i_478_][];
	    for (int i_486_ = 0; uc > i_486_; i_486_++) {
		int i_487_ = is[i_486_];
		if ((((eg) var_eg).e[i_487_] ^ 0xffffffff) != 0) {
		    int i_488_ = 0xff & ((eg) var_eg).e[i_487_];
		    for (int i_489_ = 0; i_489_ < 3; i_489_++) {
			short i_490_;
			if (i_489_ != 0) {
			    if (i_489_ == 1)
				i_490_ = ((eg) var_eg).v[i_487_];
			    else
				i_490_ = ((eg) var_eg).a[i_487_];
			} else
			    i_490_ = ((eg) var_eg).O[i_487_];
			int i_491_ = ((eg) var_eg).o[i_490_];
			int i_492_ = ((eg) var_eg).W[i_490_];
			int i_493_ = ((eg) var_eg).R[i_490_];
			if (i_491_ < is_479_[i_488_])
			    is_479_[i_488_] = i_491_;
			if (i_491_ > is_480_[i_488_])
			    is_480_[i_488_] = i_491_;
			if (i_492_ < is_481_[i_488_])
			    is_481_[i_488_] = i_492_;
			if (is_482_[i_488_] < i_492_)
			    is_482_[i_488_] = i_492_;
			if (i_493_ < is_483_[i_488_])
			    is_483_[i_488_] = i_493_;
			if (i_493_ > is_484_[i_488_])
			    is_484_[i_488_] = i_493_;
		    }
		}
	    }
	    is_476_ = new int[i_478_];
	    is_475_ = new int[i_478_];
	    is_477_ = new int[i_478_];
	    for (int i_494_ = 0; i_478_ > i_494_; i_494_++) {
		byte i_495_ = ((eg) var_eg).F[i_494_];
		if (i_495_ > 0) {
		    is_475_[i_494_] = (is_479_[i_494_] + is_480_[i_494_]) / 2;
		    is_476_[i_494_] = (is_481_[i_494_] + is_482_[i_494_]) / 2;
		    is_477_[i_494_] = (is_484_[i_494_] + is_483_[i_494_]) / 2;
		    float f;
		    float f_496_;
		    float f_497_;
		    if (i_495_ == 1) {
			int i_498_ = ((eg) var_eg).S[i_494_];
			f = 64.0F / (float) ((eg) var_eg).j[i_494_];
			if (i_498_ != 0) {
			    if (i_498_ <= 0) {
				f_497_ = 1.0F;
				f_496_ = (float) -i_498_ / 1024.0F;
			    } else {
				f_497_ = (float) i_498_ / 1024.0F;
				f_496_ = 1.0F;
			    }
			} else {
			    f_497_ = 1.0F;
			    f_496_ = 1.0F;
			}
		    } else if (i_495_ != 2) {
			f = (float) ((eg) var_eg).j[i_494_] / 1024.0F;
			f_496_ = (float) ((eg) var_eg).S[i_494_] / 1024.0F;
			f_497_ = (float) ((eg) var_eg).D[i_494_] / 1024.0F;
		    } else {
			f = 64.0F / (float) ((eg) var_eg).j[i_494_];
			f_496_ = 64.0F / (float) ((eg) var_eg).S[i_494_];
			f_497_ = 64.0F / (float) ((eg) var_eg).D[i_494_];
		    }
		    fs[i_494_]
			= gi.a(f, f_497_, uca.a(((eg) var_eg).Y[i_494_], 255),
			       f_496_, (byte) -79, ((eg) var_eg).h[i_494_],
			       ((eg) var_eg).x[i_494_],
			       ((eg) var_eg).p[i_494_]);
		}
	    }
	}
	ho[] var_hos = new ho[((eg) var_eg).G];
	for (int i_499_ = 0; ((eg) var_eg).G > i_499_; i_499_++) {
	    short i_500_ = ((eg) var_eg).O[i_499_];
	    short i_501_ = ((eg) var_eg).v[i_499_];
	    short i_502_ = ((eg) var_eg).a[i_499_];
	    int i_503_ = Z[i_501_] - Z[i_500_];
	    int i_504_ = jc[i_501_] - jc[i_500_];
	    int i_505_ = Ib[i_501_] - Ib[i_500_];
	    int i_506_ = Z[i_502_] - Z[i_500_];
	    int i_507_ = jc[i_502_] - jc[i_500_];
	    int i_508_ = Ib[i_502_] - Ib[i_500_];
	    int i_509_ = i_508_ * i_504_ - i_507_ * i_505_;
	    int i_510_ = i_505_ * i_506_ - i_508_ * i_503_;
	    int i_511_;
	    for (i_511_ = i_507_ * i_503_ - i_506_ * i_504_;
		 (i_509_ > 8192 || i_510_ > 8192 || i_511_ > 8192
		  || i_509_ < -8192 || i_510_ < -8192 || i_511_ < -8192);
		 i_511_ >>= 1) {
		i_510_ >>= 1;
		i_509_ >>= 1;
	    }
	    int i_512_ = (int) Math.sqrt((double) (i_511_ * i_511_
						   + (i_510_ * i_510_
						      + i_509_ * i_509_)));
	    if (i_512_ <= 0)
		i_512_ = 1;
	    i_509_ = i_509_ * 256 / i_512_;
	    i_510_ = i_510_ * 256 / i_512_;
	    i_511_ = i_511_ * 256 / i_512_;
	    byte i_513_
		= ((eg) var_eg).U != null ? ((eg) var_eg).U[i_499_] : (byte) 0;
	    if (i_513_ != 0) {
		if (i_513_ == 1) {
		    ho var_ho = var_hos[i_499_] = new ho();
		    ((ho) var_ho).g = i_511_;
		    ((ho) var_ho).d = i_509_;
		    ((ho) var_ho).b = i_510_;
		}
	    } else {
		Class_fc class_fc = class_fcs[i_500_];
		((Class_fc) class_fc).c += i_509_;
		((Class_fc) class_fc).g += i_510_;
		((Class_fc) class_fc).b += i_511_;
		((Class_fc) class_fc).e++;
		class_fc = class_fcs[i_501_];
		((Class_fc) class_fc).g += i_510_;
		((Class_fc) class_fc).e++;
		((Class_fc) class_fc).c += i_509_;
		((Class_fc) class_fc).b += i_511_;
		class_fc = class_fcs[i_502_];
		((Class_fc) class_fc).b += i_511_;
		((Class_fc) class_fc).c += i_509_;
		((Class_fc) class_fc).e++;
		((Class_fc) class_fc).g += i_510_;
	    }
	}
	for (int i_514_ = 0; i_514_ < uc; i_514_++) {
	    int i_515_ = is[i_514_];
	    int i_516_ = 0xffff & ((eg) var_eg).Z[i_515_];
	    short i_517_;
	    if (((eg) var_eg).B == null)
		i_517_ = (short) -1;
	    else
		i_517_ = ((eg) var_eg).B[i_515_];
	    int i_518_;
	    if (((eg) var_eg).e != null)
		i_518_ = ((eg) var_eg).e[i_515_];
	    else
		i_518_ = -1;
	    int i_519_;
	    if (((eg) var_eg).m != null)
		i_519_ = ((eg) var_eg).m[i_515_] & 0xff;
	    else
		i_519_ = 0;
	    float f = 0.0F;
	    float f_520_ = 0.0F;
	    float f_521_ = 0.0F;
	    float f_522_ = 0.0F;
	    float f_523_ = 0.0F;
	    float f_524_ = 0.0F;
	    int i_525_ = 0;
	    int i_526_ = 0;
	    int i_527_ = 0;
	    if (i_517_ != -1) {
		if (i_518_ != -1) {
		    i_518_ &= 0xff;
		    byte i_528_ = ((eg) var_eg).F[i_518_];
		    if (i_528_ != 0) {
			short i_529_ = ((eg) var_eg).O[i_515_];
			short i_530_ = ((eg) var_eg).v[i_515_];
			short i_531_ = ((eg) var_eg).a[i_515_];
			int i_532_ = is_475_[i_518_];
			int i_533_ = is_476_[i_518_];
			int i_534_ = is_477_[i_518_];
			float[] fs_535_ = fs[i_518_];
			byte i_536_ = ((eg) var_eg).y[i_518_];
			float f_537_
			    = (float) ((eg) var_eg).V[i_518_] / 256.0F;
			if (i_528_ != 1) {
			    if (i_528_ != 2) {
				if (i_528_ == 3) {
				    km.a(i_536_, fs_535_, (byte) -38, f_537_,
					 i_533_, i_532_,
					 ((eg) var_eg).R[i_529_],
					 ((eg) var_eg).o[i_529_],
					 ((eg) var_eg).W[i_529_], i_534_);
				    f = lg.A;
				    f_520_ = gs.y;
				    km.a(i_536_, fs_535_, (byte) -66, f_537_,
					 i_533_, i_532_,
					 ((eg) var_eg).R[i_530_],
					 ((eg) var_eg).o[i_530_],
					 ((eg) var_eg).W[i_530_], i_534_);
				    f_521_ = lg.A;
				    f_522_ = gs.y;
				    km.a(i_536_, fs_535_, (byte) -78, f_537_,
					 i_533_, i_532_,
					 ((eg) var_eg).R[i_531_],
					 ((eg) var_eg).o[i_531_],
					 ((eg) var_eg).W[i_531_], i_534_);
				    f_523_ = lg.A;
				    f_524_ = gs.y;
				    if ((i_536_ & 0x1) != 0) {
					if (!(f_524_ - f_520_ > 0.5F)) {
					    if (f_520_ - f_524_ > 0.5F) {
						f_524_++;
						i_526_ = 2;
					    }
					} else {
					    i_526_ = 1;
					    f_524_--;
					}
					if (!(f_522_ - f_520_ > 0.5F)) {
					    if (f_520_ - f_522_ > 0.5F) {
						i_525_ = 2;
						f_522_++;
					    }
					} else {
					    f_522_--;
					    i_525_ = 1;
					}
				    } else {
					if (f_521_ - f > 0.5F) {
					    i_525_ = 1;
					    f_521_--;
					} else if (f - f_521_ > 0.5F) {
					    i_525_ = 2;
					    f_521_++;
					}
					if (f_523_ - f > 0.5F) {
					    f_523_--;
					    i_526_ = 1;
					} else if (f - f_523_ > 0.5F) {
					    i_526_ = 2;
					    f_523_++;
					}
				    }
				}
			    } else {
				float f_538_
				    = (float) ((eg) var_eg).k[i_518_] / 256.0F;
				float f_539_
				    = (float) ((eg) var_eg).d[i_518_] / 256.0F;
				int i_540_ = (((eg) var_eg).o[i_530_]
					      - ((eg) var_eg).o[i_529_]);
				int i_541_ = (((eg) var_eg).W[i_530_]
					      - ((eg) var_eg).W[i_529_]);
				int i_542_ = (((eg) var_eg).R[i_530_]
					      - ((eg) var_eg).R[i_529_]);
				int i_543_ = (((eg) var_eg).o[i_531_]
					      - ((eg) var_eg).o[i_529_]);
				int i_544_ = (((eg) var_eg).W[i_531_]
					      - ((eg) var_eg).W[i_529_]);
				int i_545_ = (((eg) var_eg).R[i_531_]
					      - ((eg) var_eg).R[i_529_]);
				int i_546_ = i_541_ * i_545_ - i_542_ * i_544_;
				int i_547_ = i_542_ * i_543_ - i_540_ * i_545_;
				int i_548_ = i_540_ * i_544_ - i_543_ * i_541_;
				float f_549_
				    = 64.0F / (float) ((eg) var_eg).S[i_518_];
				float f_550_
				    = 64.0F / (float) ((eg) var_eg).j[i_518_];
				float f_551_
				    = 64.0F / (float) ((eg) var_eg).D[i_518_];
				float f_552_
				    = ((fs_535_[2] * (float) i_548_
					+ ((float) i_547_ * fs_535_[1]
					   + fs_535_[0] * (float) i_546_))
				       / f_549_);
				float f_553_
				    = (((float) i_548_ * fs_535_[5]
					+ ((float) i_547_ * fs_535_[4]
					   + (float) i_546_ * fs_535_[3]))
				       / f_550_);
				float f_554_
				    = (((float) i_548_ * fs_535_[8]
					+ (fs_535_[6] * (float) i_546_
					   + (float) i_547_ * fs_535_[7]))
				       / f_551_);
				i_527_
				    = ao.a(f_553_, f_554_, f_552_);
				pj.a(f_537_, i_534_, f_539_, i_533_, i_527_,
				     i_536_, ((eg) var_eg).W[i_529_], 8431,
				     fs_535_, i_532_, ((eg) var_eg).o[i_529_],
				     ((eg) var_eg).R[i_529_], f_538_);
				f_520_ = ega.m;
				f = Class_wb.m;
				pj.a(f_537_, i_534_, f_539_, i_533_, i_527_,
				     i_536_, ((eg) var_eg).W[i_530_], 8431,
				     fs_535_, i_532_, ((eg) var_eg).o[i_530_],
				     ((eg) var_eg).R[i_530_], f_538_);
				f_521_ = Class_wb.m;
				f_522_ = ega.m;
				pj.a(f_537_, i_534_, f_539_, i_533_, i_527_,
				     i_536_, ((eg) var_eg).W[i_531_], 8431,
				     fs_535_, i_532_, ((eg) var_eg).o[i_531_],
				     ((eg) var_eg).R[i_531_], f_538_);
				f_524_ = ega.m;
				f_523_ = Class_wb.m;
			    }
			} else {
			    float f_555_
				= (float) ((eg) var_eg).D[i_518_] / 1024.0F;
			    vu.a(((eg) var_eg).W[i_529_], i_536_, i_532_,
				 f_537_, ((eg) var_eg).R[i_529_], f_555_,
				 ((eg) var_eg).o[i_529_], i_534_, fs_535_,
				 i_533_, 4);
			    f = lt.b;
			    f_520_ = fm.c;
			    vu.a(((eg) var_eg).W[i_530_], i_536_, i_532_,
				 f_537_, ((eg) var_eg).R[i_530_], f_555_,
				 ((eg) var_eg).o[i_530_], i_534_, fs_535_,
				 i_533_, 4);
			    f_521_ = lt.b;
			    f_522_ = fm.c;
			    vu.a(((eg) var_eg).W[i_531_], i_536_, i_532_,
				 f_537_, ((eg) var_eg).R[i_531_], f_555_,
				 ((eg) var_eg).o[i_531_], i_534_, fs_535_,
				 i_533_, 4);
			    f_523_ = lt.b;
			    f_524_ = fm.c;
			    float f_556_ = f_555_ / 2.0F;
			    if ((0x1 & i_536_) != 0) {
				if (f_524_ - f_520_ > f_556_) {
				    f_524_ -= f_555_;
				    i_526_ = 1;
				} else if (f_520_ - f_524_ > f_556_) {
				    f_524_ += f_555_;
				    i_526_ = 2;
				}
				if (f_556_ < f_522_ - f_520_) {
				    f_522_ -= f_555_;
				    i_525_ = 1;
				} else if (f_556_ < f_520_ - f_522_) {
				    f_522_ += f_555_;
				    i_525_ = 2;
				}
			    } else {
				if (!(f_523_ - f > f_556_)) {
				    if (f_556_ < f - f_523_) {
					i_526_ = 2;
					f_523_ += f_555_;
				    }
				} else {
				    f_523_ -= f_555_;
				    i_526_ = 1;
				}
				if (f_556_ < f_521_ - f) {
				    f_521_ -= f_555_;
				    i_525_ = 1;
				} else if (f_556_ < f - f_521_) {
				    f_521_ += f_555_;
				    i_525_ = 2;
				}
			    }
			}
		    } else {
			short i_557_ = ((eg) var_eg).O[i_515_];
			short i_558_ = ((eg) var_eg).v[i_515_];
			short i_559_ = ((eg) var_eg).a[i_515_];
			short i_560_ = ((eg) var_eg).p[i_518_];
			short i_561_ = ((eg) var_eg).h[i_518_];
			short i_562_ = ((eg) var_eg).x[i_518_];
			float f_563_ = (float) ((eg) var_eg).o[i_560_];
			float f_564_ = (float) ((eg) var_eg).W[i_560_];
			float f_565_ = (float) ((eg) var_eg).R[i_560_];
			float f_566_
			    = (float) ((eg) var_eg).o[i_561_] - f_563_;
			float f_567_
			    = (float) ((eg) var_eg).W[i_561_] - f_564_;
			float f_568_
			    = (float) ((eg) var_eg).R[i_561_] - f_565_;
			float f_569_
			    = (float) ((eg) var_eg).o[i_562_] - f_563_;
			float f_570_
			    = (float) ((eg) var_eg).W[i_562_] - f_564_;
			float f_571_
			    = (float) ((eg) var_eg).R[i_562_] - f_565_;
			float f_572_
			    = (float) ((eg) var_eg).o[i_557_] - f_563_;
			float f_573_
			    = (float) ((eg) var_eg).W[i_557_] - f_564_;
			float f_574_
			    = (float) ((eg) var_eg).R[i_557_] - f_565_;
			float f_575_
			    = (float) ((eg) var_eg).o[i_558_] - f_563_;
			float f_576_
			    = (float) ((eg) var_eg).W[i_558_] - f_564_;
			float f_577_
			    = (float) ((eg) var_eg).R[i_558_] - f_565_;
			float f_578_
			    = (float) ((eg) var_eg).o[i_559_] - f_563_;
			float f_579_
			    = (float) ((eg) var_eg).W[i_559_] - f_564_;
			float f_580_
			    = (float) ((eg) var_eg).R[i_559_] - f_565_;
			float f_581_ = f_567_ * f_571_ - f_570_ * f_568_;
			float f_582_ = f_569_ * f_568_ - f_571_ * f_566_;
			float f_583_ = f_566_ * f_570_ - f_567_ * f_569_;
			float f_584_ = f_570_ * f_583_ - f_571_ * f_582_;
			float f_585_ = f_581_ * f_571_ - f_569_ * f_583_;
			float f_586_ = f_582_ * f_569_ - f_581_ * f_570_;
			float f_587_
			    = 1.0F / (f_568_ * f_586_
				      + (f_585_ * f_567_ + f_566_ * f_584_));
			f_521_ = f_587_ * (f_584_ * f_575_ + f_585_ * f_576_
					   + f_577_ * f_586_);
			f_523_ = (f_584_ * f_578_ + f_585_ * f_579_
				  + f_580_ * f_586_) * f_587_;
			f = (f_585_ * f_573_ + f_584_ * f_572_
			     + f_574_ * f_586_) * f_587_;
			f_586_ = f_582_ * f_566_ - f_567_ * f_581_;
			f_584_ = f_567_ * f_583_ - f_582_ * f_568_;
			f_585_ = f_581_ * f_568_ - f_583_ * f_566_;
			f_587_
			    = 1.0F / (f_571_ * f_586_
				      + (f_570_ * f_585_ + f_584_ * f_569_));
			f_524_ = (f_585_ * f_579_ + f_584_ * f_578_
				  + f_586_ * f_580_) * f_587_;
			f_520_
			    = (f_586_ * f_574_
			       + (f_572_ * f_584_ + f_585_ * f_573_)) * f_587_;
			f_522_
			    = f_587_ * (f_586_ * f_577_
					+ (f_584_ * f_575_ + f_585_ * f_576_));
		    }
		} else {
		    f_522_ = 1.0F;
		    f_521_ = 1.0F;
		    f_524_ = 0.0F;
		    i_526_ = 2;
		    i_525_ = 1;
		    f_520_ = 1.0F;
		    f_523_ = 0.0F;
		    f = 0.0F;
		}
	    }
	    byte i_588_;
	    if (((eg) var_eg).U != null)
		i_588_ = ((eg) var_eg).U[i_515_];
	    else
		i_588_ = (byte) 0;
	    if (i_588_ == 0) {
		long l = ((long) (i_518_ << 2)
			  + ((long) i_519_ + ((long) (i_516_ << 8)
					      + (long) (i_527_ << 24))
			     << 32));
		short i_589_ = ((eg) var_eg).O[i_515_];
		short i_590_ = ((eg) var_eg).v[i_515_];
		short i_591_ = ((eg) var_eg).a[i_515_];
		Class_fc class_fc = class_fcs[i_589_];
		bb[i_514_]
		    = a(((Class_fc) class_fc).c, ((Class_fc) class_fc).e, f, l,
			var_eg, ((Class_fc) class_fc).g, i_589_, f_520_, -5073,
			i_514_, ((Class_fc) class_fc).b);
		class_fc = class_fcs[i_590_];
		T[i_514_] = a(((Class_fc) class_fc).c, ((Class_fc) class_fc).e,
			      f_521_, l + (long) i_525_, var_eg,
			      ((Class_fc) class_fc).g, i_590_, f_522_, -5073,
			      i_514_, ((Class_fc) class_fc).b);
		class_fc = class_fcs[i_591_];
		sc[i_514_]
		    = a(((Class_fc) class_fc).c, ((Class_fc) class_fc).e,
			f_523_, l + (long) i_526_, var_eg,
			((Class_fc) class_fc).g, i_591_, f_524_, -5073, i_514_,
			((Class_fc) class_fc).b);
	    } else if (i_588_ == 1) {
		ho var_ho = var_hos[i_515_];
		long l = ((long) ((((ho) var_ho).b + 256 << 12)
				  + ((i_518_ << 2)
				     + ((((ho) var_ho).d > 0 ? 1024 : 2048)
					+ (((ho) var_ho).g + 256 << 22))))
			  + ((long) (i_527_ << 24) - (-(long) (i_516_ << 8)
						      - (long) i_519_)
			     << 32));
		bb[i_514_] = a(((ho) var_ho).d, 0, f, l, var_eg,
			       ((ho) var_ho).b, ((eg) var_eg).O[i_515_],
			       f_520_, -5073, i_514_, ((ho) var_ho).g);
		T[i_514_] = a(((ho) var_ho).d, 0, f_521_, l + (long) i_525_,
			      var_eg, ((ho) var_ho).b, ((eg) var_eg).v[i_515_],
			      f_522_, -5073, i_514_, ((ho) var_ho).g);
		sc[i_514_]
		    = a(((ho) var_ho).d, 0, f_523_, (long) i_526_ + l, var_eg,
			((ho) var_ho).b, ((eg) var_eg).a[i_515_], f_524_,
			-5073, i_514_, ((ho) var_ho).g);
	    }
	    if (((eg) var_eg).B == null)
		bc[i_514_] = (short) -1;
	    else
		bc[i_514_] = ((eg) var_eg).B[i_515_];
	    if (((eg) var_eg).m != null)
		qb[i_514_] = ((eg) var_eg).m[i_515_];
	    if (((eg) var_eg).C != null)
		gb[i_514_] = ((eg) var_eg).C[i_515_];
	    Fc[i_514_] = ((eg) var_eg).Z[i_515_];
	}
	if (O > 0) {
	    int i_592_ = 1;
	    short i_593_ = bc[0];
	    for (int i_594_ = 0; O > i_594_; i_594_++) {
		short i_595_ = bc[i_594_];
		if (i_593_ != i_595_) {
		    i_593_ = i_595_;
		    i_592_++;
		}
	    }
	    tc = new int[i_592_];
	    xb = new int[i_592_ + 1];
	    lc = new int[i_592_];
	    xb[0] = 0;
	    int i_596_ = pb;
	    i_592_ = 0;
	    int i_597_ = 0;
	    i_593_ = bc[0];
	    for (int i_598_ = 0; i_598_ < O; i_598_++) {
		short i_599_ = bc[i_598_];
		if (i_599_ != i_593_) {
		    lc[i_592_] = i_596_;
		    tc[i_592_] = i_597_ + 1 - i_596_;
		    xb[++i_592_] = i_598_;
		    i_596_ = pb;
		    i_593_ = i_599_;
		    i_597_ = 0;
		}
		int i_600_ = bb[i_598_];
		if (i_597_ < i_600_)
		    i_597_ = i_600_;
		if (i_596_ > i_600_)
		    i_596_ = i_600_;
		i_600_ = T[i_598_];
		if (i_596_ > i_600_)
		    i_596_ = i_600_;
		if (i_600_ > i_597_)
		    i_597_ = i_600_;
		i_600_ = sc[i_598_];
		if (i_600_ > i_597_)
		    i_597_ = i_600_;
		if (i_596_ > i_600_)
		    i_596_ = i_600_;
	    }
	    lc[i_592_] = i_596_;
	    tc[i_592_] = i_597_ - i_596_ + 1;
	    xb[++i_592_] = O;
	}
	sd.j = null;
	A = gi.a(126, A, pb);
	hb = gi.a(91, hb, pb);
	fb = gi.a(107, fb, pb);
	V = gi.a(95, V, pb);
	J = gi.a(98, J, pb);
	rc = di.a((byte) -85, pb, rc);
	Kb = Class_is.a((byte) -85, pb, Kb);
	N = Class_is.a((byte) -119, pb, N);
	if (((eg) var_eg).Q != null && in.a(oc, false, i))
	    Ab = var_eg.a(false, 117);
	if (((eg) var_eg).N != null && lt.a(i, 1024, oc))
	    z = var_eg.b((int) 106);
	if (((eg) var_eg).s != null && gd.a(63, oc, i)) {
	    int i_601_ = 0;
	    int[] is_602_ = new int[256];
	    for (int i_603_ = 0; uc > i_603_; i_603_++) {
		int i_604_ = ((eg) var_eg).s[is[i_603_]];
		if (i_604_ >= 0) {
		    is_602_[i_604_]++;
		    if (i_601_ < i_604_)
			i_601_ = i_604_;
		}
	    }
	    cb = new int[i_601_ + 1][];
	    for (int i_605_ = 0; i_601_ >= i_605_; i_605_++) {
		cb[i_605_] = new int[is_602_[i_605_]];
		is_602_[i_605_] = 0;
	    }
	    for (int i_606_ = 0; i_606_ < uc; i_606_++) {
		int i_607_ = ((eg) var_eg).s[is[i_606_]];
		if (i_607_ >= 0)
		    cb[i_607_][is_602_[i_607_]++] = i_606_;
	    }
	}
    }
    
    final da a(byte i, int i_608_, boolean bool) {
	tb++;
	ja var_ja_609_;
	ja var_ja_610_;
	if (i == 1) {
	    var_ja_609_ = ((en) Nb).gg;
	    var_ja_610_ = ((en) Nb).dg;
	} else if (i == 2) {
	    var_ja_609_ = ((en) Nb).fg;
	    var_ja_610_ = ((en) Nb).og;
	} else if (i != 3) {
	    if (i != 4) {
		if (i == 5) {
		    var_ja_609_ = ((en) Nb).Zf;
		    var_ja_610_ = ((en) Nb).ng;
		} else
		    var_ja_609_ = var_ja_610_ = new ja(Nb, 0, 0, true, false);
	    } else {
		var_ja_610_ = ((en) Nb).Xf;
		var_ja_609_ = ((en) Nb).ag;
	    }
	} else {
	    var_ja_609_ = ((en) Nb).jg;
	    var_ja_610_ = ((en) Nb).lg;
	}
	return a(var_ja_609_, var_ja_610_, bool, i_608_, 122, i != 0);
    }
    
    final void ba(int i, int i_611_, Class_i class_i, Class_i class_i_612_,
		  int i_613_, int i_614_, int i_615_) {
	Ob++;
	if (!ab)
	    e(false);
	int i_616_ = I + i_613_;
	int i_617_ = pc + i_613_;
	int i_618_ = sb + i_615_;
	int i_619_ = Pb + i_615_;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_616_ >= 0
		&& (((Class_i) class_i).b + i_617_ >> ((Class_i) class_i).g
		    < ((Class_i) class_i).k)
		&& i_618_ >= 0
		&& (i_619_ + ((Class_i) class_i).b >> ((Class_i) class_i).g
		    < ((Class_i) class_i).j))) {
	    if (i != 4 && i != 5) {
		i_616_ >>= ((Class_i) class_i).g;
		i_617_ = (((Class_i) class_i).b - 1 + i_617_
			  >> ((Class_i) class_i).g);
		i_618_ >>= ((Class_i) class_i).g;
		i_619_ = (i_619_ - 1 + ((Class_i) class_i).b
			  >> ((Class_i) class_i).g);
		if (i_614_ == class_i.a(i_618_, (byte) 51, i_616_)
		    && i_614_ == class_i.a(i_618_, (byte) 51, i_617_)
		    && class_i.a(i_619_, (byte) 51, i_616_) == i_614_
		    && class_i.a(i_619_, (byte) 51, i_617_) == i_614_)
		    return;
	    } else if (class_i_612_ == null
		       || (i_616_ < 0
			   || (((Class_i) class_i_612_).k
			       <= (((Class_i) class_i_612_).b + i_617_
				   >> ((Class_i) class_i_612_).g))
			   || i_618_ < 0
			   || ((i_619_ + ((Class_i) class_i_612_).b
				>> ((Class_i) class_i_612_).g)
			       >= ((Class_i) class_i_612_).j)))
		return;
	    if (i != 1) {
		if (i != 2) {
		    if (i == 3) {
			int i_620_ = 4 * (i_611_ & 0xff);
			int i_621_ = ((0xff4b & i_611_) >> 8) * 4;
			int i_622_ = 0x3fc0 & i_611_ >> 16 << 6;
			int i_623_ = (i_611_ >> 24 & 0xff) << 6;
			if (i_613_ - (i_620_ >> 1) < 0
			    || (((Class_i) class_i).k << ((Class_i) class_i).g
				<= ((i_620_ >> 1) + i_613_
				    + ((Class_i) class_i).b))
			    || i_615_ - (i_621_ >> 1) < 0
			    || (((Class_i) class_i).b + ((i_621_ >> 1)
							 + i_615_)
				>= (((Class_i) class_i).j
				    << ((Class_i) class_i).g)))
			    return;
			this.a(i_621_, class_i, i_613_, i_622_, 0, i_620_,
			       i_614_, i_623_, i_615_);
		    } else if (i != 4) {
			if (i == 5) {
			    int i_624_ = Jb - vc;
			    for (int i_625_ = 0; i_625_ < Db; i_625_++) {
				int i_626_ = i_613_ + Z[i_625_];
				int i_627_ = Ib[i_625_] + i_615_;
				int i_628_ = class_i.a(i_627_, i_626_, true);
				int i_629_
				    = class_i_612_.a(i_627_, i_626_, true);
				int i_630_ = i_628_ - i_611_ - i_629_;
				jc[i_625_]
				    = -i_614_ - (-i_628_
						 - (i_630_ * ((jc[i_625_] << 8)
							      / i_624_)
						    >> 8));
			    }
			}
		    } else {
			int i_631_ = Jb - vc;
			for (int i_632_ = 0; Db > i_632_; i_632_++)
			    jc[i_632_]
				= (jc[i_632_]
				   + class_i_612_.a(i_615_ + Ib[i_632_],
						    i_613_ + Z[i_632_], true)
				   - i_614_ + i_631_);
		    }
		} else {
		    int i_633_ = vc;
		    if (i_633_ == 0)
			return;
		    for (int i_634_ = 0; Db > i_634_; i_634_++) {
			int i_635_ = (jc[i_634_] << 16) / i_633_;
			if (i_611_ > i_635_)
			    jc[i_634_]
				= (jc[i_634_]
				   + ((i_611_ - i_635_)
				      * (class_i.a(i_615_ + Ib[i_634_],
						   i_613_ + Z[i_634_], true)
					 - i_614_)
				      / i_611_));
		    }
		}
	    } else {
		for (int i_636_ = 0; i_636_ < Db; i_636_++)
		    jc[i_636_] = jc[i_636_] + class_i.a(Ib[i_636_] + i_615_,
							Z[i_636_] + i_613_,
							true) - i_614_;
	    }
	    b((byte) 112);
	    ab = false;
	}
    }
    
    final qg[] f() {
	Y++;
	return x;
    }
    
    final void d(short i, short i_637_) {
	kb++;
	for (int i_638_ = 0; i_638_ < uc; i_638_++) {
	    if (Fc[i_638_] == i)
		Fc[i_638_] = i_637_;
	}
	if (U != null) {
	    for (int i_639_ = 0; i_639_ < Wb; i_639_++) {
		oh var_oh = U[i_639_];
		mfa var_mfa = db[i_639_];
		((mfa) var_mfa).l
		    = (ji.j[0xffff & Fc[((oh) var_oh).e]] & 0xffffff
		       | ((mfa) var_mfa).l & ~0xffffff);
	    }
	}
	b(false);
    }
    
    final boolean F() {
	t++;
	if (Ab == null)
	    return false;
	for (int i = 0; X > i; i++) {
	    Z[i] <<= 4;
	    jc[i] <<= 4;
	    Ib[i] <<= 4;
	}
	qd.t = 0;
	Class_j.k = 0;
	cs.h = 0;
	return true;
    }
    
    final int PA() {
	q++;
	return ib;
    }
    
    final int OA() {
	if (!ab)
	    e(false);
	cc++;
	return sb;
    }
    
    final void M(int i) {
	D++;
	int i_640_ = GameInPacket.ints1[i];
	int i_641_ = GameInPacket.ints2[i];
	for (int i_642_ = 0; i_642_ < Db; i_642_++) {
	    int i_643_ = i_640_ * Ib[i_642_] + Z[i_642_] * i_641_ >> 14;
	    Ib[i_642_] = Ib[i_642_] * i_641_ - i_640_ * Z[i_642_] >> 14;
	    Z[i_642_] = i_643_;
	}
	b((byte) 112);
	ab = false;
    }
    
    final hi[] c() {
	Dc++;
	return Bb;
    }
    
    final void a(int i, int i_644_, int i_645_, int i_646_) {
	R++;
	for (int i_647_ = 0; uc > i_647_; i_647_++) {
	    int i_648_ = Fc[i_647_] & 0xffff;
	    int i_649_ = (0xfce7 & i_648_) >> 10;
	    int i_650_ = (i_648_ & 0x3f2) >> 7;
	    if (i != -1)
		i_649_ = (i_646_ * (i - i_649_) >> 7) + i_649_;
	    int i_651_ = i_648_ & 0x7f;
	    if ((i_644_ ^ 0xffffffff) != 0)
		i_650_ += i_646_ * (i_644_ - i_650_) >> 7;
	    if (i_645_ != -1)
		i_651_ += i_646_ * (i_645_ - i_651_) >> 7;
	    Fc[i_647_]
		= (short) hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_649_ << 10, i_650_ << 7), i_651_);
	}
	if (U != null) {
	    for (int i_652_ = 0; i_652_ < Wb; i_652_++) {
		oh var_oh = U[i_652_];
		mfa var_mfa = db[i_652_];
		((mfa) var_mfa).l
		    = (((mfa) var_mfa).l & ~0xffffff
		       | 0xffffff & ji.j[0xffff & Fc[((oh) var_oh).e]]);
	    }
	}
	b(false);
    }
    
    final void oa(int i, int i_653_, int i_654_) {
	qc++;
	for (int i_655_ = 0; Db > i_655_; i_655_++) {
	    if (i != 0)
		Z[i_655_] += i;
	    if (i_653_ != 0)
		jc[i_655_] += i_653_;
	    if (i_654_ != 0)
		Ib[i_655_] += i_654_;
	}
	b((byte) 112);
	ab = false;
    }
    
    private final void f(boolean bool) {
	if (U != null) {
	    Nb.ZA(false);
	    Nb.a(false, (int) 119);
	    Nb.a(1, 1, ik.o);
	    Nb.a(1, ik.o, -18836);
	    for (int i = 0; i < Wb; i++) {
		oh var_oh = U[i];
		mfa var_mfa = db[i];
		if (!((oh) var_oh).j || !Nb.bloom()) {
		    float f = 0.3333333F * (float) (Z[((oh) var_oh).b]
						    + (Z[((oh) var_oh).i]
						       + Z[((oh) var_oh).l]));
		    float f_656_
			= 0.3333333F * (float) (jc[((oh) var_oh).l]
						+ (jc[((oh) var_oh).b]
						   + jc[((oh) var_oh).i]));
		    float f_657_ = ((float) (Ib[((oh) var_oh).b]
					     + (Ib[((oh) var_oh).i]
						+ Ib[((oh) var_oh).l]))
				    * 0.3333333F);
		    float f_658_ = (sg.c * f + wl.f * f_656_
				    + f_657_ * client.aFloat + eca.w);
		    float f_659_ = io.R + (f_657_ * OutputStreamSub.d
					   + (Class_eb.s * f_656_ + f * on.o));
		    float f_660_ = dt.Db + (f_657_ * qj.Yc
					    + (ws.H * f_656_ + f * rd.n));
		    mga var_mga = Nb.Y(12083);
		    var_mga.a(((mfa) var_mfa).n * ((oh) var_oh).g >> 7,
			      (float) ((mfa) var_mfa).e + f_659_, (byte) 100,
			      (float) -((oh) var_oh).q + f_660_,
			      f_658_ + (float) ((mfa) var_mfa).h,
			      ((mfa) var_mfa).d * ((oh) var_oh).p >> 7,
			      ((mfa) var_mfa).m);
		    var_mga.a((byte) -6, ((en) Nb).Ud);
		    Nb.T(118);
		    int i_661_ = ((mfa) var_mfa).l;
		    Nb.a(0, ((oh) var_oh).m, false, false);
		    Nb.a((byte) 28, (int) ((oh) var_oh).d);
		    Nb.c((byte) 48, i_661_);
		    Nb.y(9);
		}
	    }
	    Nb.a(1, bu.u, -18836);
	    Nb.a(1, 1, bu.u);
	    Nb.ZA(true);
	}
	Ic++;
	if (bool != true)
	    a((byte) 121, -70, true);
    }
    
    final void FA() {
	for (int i = 0; Db > i; i++)
	    Ib[i] = -Ib[i];
	r++;
	for (int i = 0; pb > i; i++)
	    J[i] = (short) -J[i];
	for (int i = 0; i < uc; i++) {
	    short i_662_ = bb[i];
	    bb[i] = sc[i];
	    sc[i] = i_662_;
	}
	b((byte) 112);
	f(55);
	d(false);
	ab = false;
    }
    
    final void DA(short i, short i_663_) {
	Ub++;
	fa var_fa = ((Class_r) Nb).j;
	for (int i_664_ = 0; uc > i_664_; i_664_++) {
	    if (i == bc[i_664_])
		bc[i_664_] = i_663_;
	}
	byte i_665_ = 0;
	byte i_666_ = 0;
	if (i != -1) {
	    vca var_vca = var_fa.a(i & 0xffff, (byte) 86);
	    i_665_ = ((vca) var_vca).q;
	    i_666_ = ((vca) var_vca).f;
	}
	byte i_667_ = 0;
	byte i_668_ = 0;
	if (i_663_ != -1) {
	    vca var_vca = var_fa.a(i_663_ & 0xffff, (byte) 86);
	    i_667_ = ((vca) var_vca).q;
	    i_668_ = ((vca) var_vca).f;
	}
	if (i_666_ != i_668_ | i_665_ != i_667_) {
	    if (U != null) {
		for (int i_669_ = 0; i_669_ < Wb; i_669_++) {
		    oh var_oh = U[i_669_];
		    mfa var_mfa = db[i_669_];
		    ((mfa) var_mfa).l
			= (ji.j[Fc[((oh) var_oh).e] & 0xffff] & 0xffffff
			   | ~0xffffff & ((mfa) var_mfa).l);
		}
	    }
	    b(false);
	}
    }
    
    final void ga(int i) {
	nb = (short) i;
	C++;
	b((byte) 112);
	f(55);
    }
    
    private final boolean a(int i, int i_670_, int i_671_, int i_672_,
			    int i_673_, int i_674_, int i_675_, int i_676_,
			    int i_677_) {
	ec++;
	if (i_672_ < 113)
	    ga(104);
	if (i_673_ < i_675_ && i > i_673_ && i_670_ > i_673_)
	    return false;
	if (i_673_ > i_675_ && i < i_673_ && i_670_ < i_673_)
	    return false;
	if (i_676_ < i_677_ && i_674_ > i_676_ && i_671_ > i_676_)
	    return false;
	if (i_676_ > i_677_ && i_676_ > i_674_ && i_671_ < i_676_)
	    return false;
	return true;
    }
    
    final void SA(int i) {
	if (P != null)
	    ((gm) P).h = oe.a(68, i, oc);
	Ec++;
	if (yb != null)
	    ((gm) yb).h = kq.a(oc, i, true);
	if (Q != null)
	    ((gm) Q).h = jv.a(3, i, oc);
	if (fc != null)
	    ((gm) fc).h = bk.a(oc, i, -127);
	ib = i;
	Gc = true;
	if (B != null && (0x10000 & ib) == 0) {
	    rc = ((uf) B).c;
	    fb = ((uf) B).b;
	    V = ((uf) B).f;
	    J = ((uf) B).d;
	    B = null;
	}
	b((int) -94);
    }
    
    private final void f(int i) {
	if ((i & oc) != 0) {
	    if (fc != null)
		((gm) fc).a = false;
	} else if (Q != null)
	    ((gm) Q).a = false;
	ob++;
    }
    
    private final boolean a(int i, int i_678_, boolean bool, Class_q class_q,
			    int i_679_, int i_680_) {
	wb++;
	mga var_mga = (mga) class_q;
	mga var_mga_681_ = ((en) Nb).Td;
	float f = (((mga) var_mga_681_).A
		   + (((mga) var_mga_681_).M * ((mga) var_mga).A
		      + ((mga) var_mga).p * ((mga) var_mga_681_).q
		      + ((mga) var_mga_681_).gb * ((mga) var_mga).E));
	float f_682_ = (((mga) var_mga).A * ((mga) var_mga_681_).cb
			+ ((mga) var_mga).p * ((mga) var_mga_681_).T
			+ ((mga) var_mga_681_).F * ((mga) var_mga).E
			+ ((mga) var_mga_681_).p);
	ws.H = (((mga) var_mga_681_).I * ((mga) var_mga).fb
		+ (((mga) var_mga_681_).fb * ((mga) var_mga).T
		   + ((mga) var_mga).q * ((mga) var_mga_681_).H));
	float f_683_ = (((mga) var_mga).E * ((mga) var_mga_681_).I
			+ (((mga) var_mga).p * ((mga) var_mga_681_).fb
			   + ((mga) var_mga).A * ((mga) var_mga_681_).H)
			+ ((mga) var_mga_681_).E);
	client.aFloat = (((mga) var_mga).gb * ((mga) var_mga_681_).M
		     + ((mga) var_mga).F * ((mga) var_mga_681_).q
		     + ((mga) var_mga_681_).gb * ((mga) var_mga).I);
	sg.c = (((mga) var_mga_681_).M * ((mga) var_mga).M
		+ ((mga) var_mga).cb * ((mga) var_mga_681_).q
		+ ((mga) var_mga_681_).gb * ((mga) var_mga).H);
	on.o = (((mga) var_mga).H * ((mga) var_mga_681_).F
		+ (((mga) var_mga).M * ((mga) var_mga_681_).cb
		   + ((mga) var_mga_681_).T * ((mga) var_mga).cb));
	OutputStreamSub.d = (((mga) var_mga_681_).cb * ((mga) var_mga).gb
		+ ((mga) var_mga_681_).T * ((mga) var_mga).F
		+ ((mga) var_mga).I * ((mga) var_mga_681_).F);
	rd.n = (((mga) var_mga_681_).I * ((mga) var_mga).H
		+ (((mga) var_mga).cb * ((mga) var_mga_681_).fb
		   + ((mga) var_mga_681_).H * ((mga) var_mga).M));
	Class_eb.s = (((mga) var_mga).fb * ((mga) var_mga_681_).F
		      + (((mga) var_mga_681_).cb * ((mga) var_mga).q
			 + ((mga) var_mga_681_).T * ((mga) var_mga).T));
	wl.f = (((mga) var_mga).fb * ((mga) var_mga_681_).gb
		+ (((mga) var_mga_681_).q * ((mga) var_mga).T
		   + ((mga) var_mga_681_).M * ((mga) var_mga).q));
	qj.Yc = (((mga) var_mga).I * ((mga) var_mga_681_).I
		 + (((mga) var_mga).gb * ((mga) var_mga_681_).H
		    + ((mga) var_mga).F * ((mga) var_mga_681_).fb));
	boolean bool_684_ = false;
	float f_685_ = 3.4028235E38F;
	float f_686_ = -3.4028235E38F;
	float f_687_ = 3.4028235E38F;
	float f_688_ = -3.4028235E38F;
	int i_689_ = ((en) Nb).Zd;
	int i_690_ = ((en) Nb).ef;
	if (!ab)
	    e(false);
	Class_kd.l[0] = I;
	gl.P[0] = vc;
	tn.b[0] = sb;
	Class_kd.l[1] = pc;
	gl.P[1] = vc;
	Class_kd.l[2] = I;
	tn.b[1] = sb;
	gl.P[2] = Jb;
	tn.b[2] = sb;
	Class_kd.l[3] = pc;
	gl.P[3] = Jb;
	tn.b[3] = sb;
	Class_kd.l[4] = I;
	gl.P[4] = vc;
	tn.b[4] = Pb;
	Class_kd.l[5] = pc;
	gl.P[5] = vc;
	tn.b[5] = Pb;
	Class_kd.l[6] = I;
	gl.P[6] = Jb;
	Class_kd.l[7] = pc;
	tn.b[6] = Pb;
	gl.P[7] = Jb;
	tn.b[7] = Pb;
	int i_691_ = 0;
	if (i_680_ > -88)
	    sb = -71;
	for (/**/; i_691_ < 8; i_691_++) {
	    float f_692_ = (float) Class_kd.l[i_691_];
	    float f_693_ = (float) gl.P[i_691_];
	    float f_694_ = (float) tn.b[i_691_];
	    float f_695_
		= f_683_ + (f_692_ * rd.n + ws.H * f_693_ + qj.Yc * f_694_);
	    float f_696_
		= f + (f_694_ * client.aFloat + (wl.f * f_693_ + sg.c * f_692_));
	    float f_697_
		= Class_eb.s * f_693_ + on.o * f_692_ + OutputStreamSub.d * f_694_ + f_682_;
	    if (f_695_ >= (float) ((en) Nb).Af) {
		if (i > 0)
		    f_695_ = (float) i;
		float f_698_
		    = (float) ((en) Nb).Ff + (float) i_689_ * f_696_ / f_695_;
		float f_699_
		    = (float) ((en) Nb).ze + (float) i_690_ * f_697_ / f_695_;
		if (f_698_ < f_685_)
		    f_685_ = f_698_;
		if (f_686_ < f_698_)
		    f_686_ = f_698_;
		if (f_699_ > f_688_)
		    f_688_ = f_699_;
		if (f_687_ > f_699_)
		    f_687_ = f_699_;
		bool_684_ = true;
	    }
	}
	if (bool_684_ && f_685_ < (float) i_679_ && (float) i_679_ < f_686_
	    && f_687_ < (float) i_678_ && (float) i_678_ < f_688_) {
	    if (bool)
		return true;
	    if (cv.y.length < pb) {
		kw.C = new int[pb];
		cv.y = new int[pb];
	    }
	    for (int i_700_ = 0; Db > i_700_; i_700_++) {
		float f_701_ = (float) Ib[i_700_];
		float f_702_ = (float) jc[i_700_];
		float f_703_ = (float) Z[i_700_];
		float f_704_ = f_683_ + (f_701_ * qj.Yc
					 + (ws.H * f_702_ + f_703_ * rd.n));
		float f_705_
		    = f_703_ * sg.c + wl.f * f_702_ + client.aFloat * f_701_ + f;
		float f_706_ = (f_703_ * on.o + f_702_ * Class_eb.s
				+ f_701_ * OutputStreamSub.d + f_682_);
		if (!(f_704_ >= (float) ((en) Nb).Af)) {
		    int i_707_ = M[i_700_];
		    int i_708_ = M[i_700_ + 1];
		    for (int i_709_ = i_707_; i_708_ > i_709_; i_709_++) {
			int i_710_ = rb[i_709_] - 1;
			if ((i_710_ ^ 0xffffffff) == 0)
			    break;
			cv.y[rb[i_709_] - 1] = -999999;
		    }
		} else {
		    if (i > 0)
			f_704_ = (float) i;
		    int i_711_ = (int) ((float) ((en) Nb).Ff
					+ (float) i_689_ * f_705_ / f_704_);
		    int i_712_ = (int) ((float) ((en) Nb).ze
					+ f_706_ * (float) i_690_ / f_704_);
		    int i_713_ = M[i_700_];
		    int i_714_ = M[i_700_ + 1];
		    for (int i_715_ = i_713_; i_714_ > i_715_; i_715_++) {
			int i_716_ = rb[i_715_] - 1;
			if ((i_716_ ^ 0xffffffff) == 0)
			    break;
			cv.y[i_716_] = i_711_;
			kw.C[i_716_] = i_712_;
		    }
		}
	    }
	    for (int i_717_ = 0; uc > i_717_; i_717_++) {
		if (cv.y[bb[i_717_]] != -999999 && cv.y[T[i_717_]] != -999999
		    && cv.y[sc[i_717_]] != -999999
		    && a(kw.C[T[i_717_]], kw.C[sc[i_717_]], cv.y[sc[i_717_]],
			 117, i_678_, cv.y[T[i_717_]], kw.C[bb[i_717_]],
			 i_679_, cv.y[bb[i_717_]]))
		    return true;
	    }
	}
	return false;
    }
    
    final void W(int i) {
	mb++;
	int i_718_ = GameInPacket.ints1[i];
	int i_719_ = GameInPacket.ints2[i];
	for (int i_720_ = 0; i_720_ < Db; i_720_++) {
	    int i_721_ = jc[i_720_] * i_718_ + Z[i_720_] * i_719_ >> 14;
	    jc[i_720_] = i_719_ * jc[i_720_] - Z[i_720_] * i_718_ >> 14;
	    Z[i_720_] = i_721_;
	}
	b((byte) 112);
	ab = false;
    }
    
    final void e() {
	Hc++;
    }
    
    final int KA() {
	if (!ab)
	    e(false);
	v++;
	return I;
    }
    
    final void a(Class_q class_q) {
	ac++;
	mga var_mga = (mga) class_q;
	if (Bb != null) {
	    for (int i = 0; i < Bb.length; i++) {
		hi var_hi = Bb[i];
		hi var_hi_722_ = var_hi;
		if (((hi) var_hi).f != null)
		    var_hi_722_ = ((hi) var_hi).f;
		((hi) var_hi_722_).j
		    = (int) (((mga) var_mga).A
			     + (((float) Ib[((hi) var_hi).d]
				 * ((mga) var_mga).gb)
				+ ((((mga) var_mga).q
				    * (float) jc[((hi) var_hi).d])
				   + ((float) Z[((hi) var_hi).d]
				      * ((mga) var_mga).M))));
		((hi) var_hi_722_).a
		    = (int) (((mga) var_mga).p
			     + ((float) Ib[((hi) var_hi).d] * ((mga) var_mga).F
				+ ((((mga) var_mga).T
				    * (float) jc[((hi) var_hi).d])
				   + ((float) Z[((hi) var_hi).d]
				      * ((mga) var_mga).cb))));
		((hi) var_hi_722_).l
		    = (int) (((mga) var_mga).E
			     + ((float) Ib[((hi) var_hi).d] * ((mga) var_mga).I
				+ (((float) Z[((hi) var_hi).d]
				    * ((mga) var_mga).H)
				   + (((mga) var_mga).fb
				      * (float) jc[((hi) var_hi).d]))));
		((hi) var_hi_722_).b
		    = (int) ((float) jc[((hi) var_hi).g] * ((mga) var_mga).q
			     + ((mga) var_mga).M * (float) Z[((hi) var_hi).g]
			     + (float) Ib[((hi) var_hi).g] * ((mga) var_mga).gb
			     + ((mga) var_mga).A);
		((hi) var_hi_722_).c
		    = (int) ((float) Ib[((hi) var_hi).g] * ((mga) var_mga).F
			     + (((mga) var_mga).cb * (float) Z[((hi) var_hi).g]
				+ (((mga) var_mga).T
				   * (float) jc[((hi) var_hi).g]))
			     + ((mga) var_mga).p);
		((hi) var_hi_722_).m
		    = (int) (((mga) var_mga).fb * (float) jc[((hi) var_hi).g]
			     + ((mga) var_mga).H * (float) Z[((hi) var_hi).g]
			     + ((mga) var_mga).I * (float) Ib[((hi) var_hi).g]
			     + ((mga) var_mga).E);
		((hi) var_hi_722_).t
		    = (int) (((mga) var_mga).M * (float) Z[((hi) var_hi).e]
			     + ((mga) var_mga).q * (float) jc[((hi) var_hi).e]
			     + (float) Ib[((hi) var_hi).e] * ((mga) var_mga).gb
			     + ((mga) var_mga).A);
		((hi) var_hi_722_).o
		    = (int) (((mga) var_mga).p
			     + ((float) jc[((hi) var_hi).e] * ((mga) var_mga).T
				+ ((float) Z[((hi) var_hi).e]
				   * ((mga) var_mga).cb)
				+ (((mga) var_mga).F
				   * (float) Ib[((hi) var_hi).e])));
		((hi) var_hi_722_).n
		    = (int) (((mga) var_mga).E
			     + ((float) Ib[((hi) var_hi).e] * ((mga) var_mga).I
				+ ((((mga) var_mga).H
				    * (float) Z[((hi) var_hi).e])
				   + (((mga) var_mga).fb
				      * (float) jc[((hi) var_hi).e]))));
	    }
	}
	if (x != null) {
	    for (int i = 0; i < x.length; i++) {
		qg var_qg = x[i];
		qg var_qg_723_ = var_qg;
		if (((qg) var_qg).n != null)
		    var_qg_723_ = ((qg) var_qg).n;
		if (((qg) var_qg).p != null)
		    ((qg) var_qg).p.M(var_mga);
		else
		    ((qg) var_qg).p = var_mga.a();
		((qg) var_qg_723_).m
		    = (int) ((float) Z[((qg) var_qg).b] * ((mga) var_mga).M
			     + (float) jc[((qg) var_qg).b] * ((mga) var_mga).q
			     + ((mga) var_mga).gb * (float) Ib[((qg) var_qg).b]
			     + ((mga) var_mga).A);
		((qg) var_qg_723_).f
		    = (int) ((float) Ib[((qg) var_qg).b] * ((mga) var_mga).F
			     + (((mga) var_mga).cb * (float) Z[((qg) var_qg).b]
				+ ((float) jc[((qg) var_qg).b]
				   * ((mga) var_mga).T))
			     + ((mga) var_mga).p);
		((qg) var_qg_723_).l
		    = (int) ((float) Ib[((qg) var_qg).b] * ((mga) var_mga).I
			     + ((float) Z[((qg) var_qg).b] * ((mga) var_mga).H
				+ ((float) jc[((qg) var_qg).b]
				   * ((mga) var_mga).fb))
			     + ((mga) var_mga).E);
	    }
	}
    }
    
    public static void c(byte i) {
	if (i <= 98)
	    u = null;
	u = null;
    }
    
    final void WA(int i, int i_724_, int i_725_, int i_726_) {
	Mb++;
	if (i == 0) {
	    Class_j.k = 0;
	    cs.h = 0;
	    int i_727_ = 0;
	    qd.t = 0;
	    for (int i_728_ = 0; Db > i_728_; i_728_++) {
		cs.h += Z[i_728_];
		Class_j.k += jc[i_728_];
		qd.t += Ib[i_728_];
		i_727_++;
	    }
	    if (i_727_ <= 0) {
		qd.t = i_726_;
		Class_j.k = i_725_;
		cs.h = i_724_;
	    } else {
		qd.t = i_726_ + qd.t / i_727_;
		cs.h = i_724_ + cs.h / i_727_;
		Class_j.k = Class_j.k / i_727_ + i_725_;
	    }
	} else if (i == 1) {
	    for (int i_729_ = 0; Db > i_729_; i_729_++) {
		Z[i_729_] += i_724_;
		jc[i_729_] += i_725_;
		Ib[i_729_] += i_726_;
	    }
	} else if (i == 2) {
	    for (int i_730_ = 0; Db > i_730_; i_730_++) {
		Z[i_730_] -= cs.h;
		jc[i_730_] -= Class_j.k;
		Ib[i_730_] -= qd.t;
		if (i_726_ != 0) {
		    int i_731_ = GameInPacket.ints1[i_726_];
		    int i_732_ = GameInPacket.ints2[i_726_];
		    int i_733_ = (jc[i_730_] * i_731_ - (-(Z[i_730_] * i_732_)
							 - 16383)
				  >> 14);
		    jc[i_730_]
			= (jc[i_730_] * i_732_ + 16383 - i_731_ * Z[i_730_]
			   >> 14);
		    Z[i_730_] = i_733_;
		}
		if (i_724_ != 0) {
		    int i_734_ = GameInPacket.ints1[i_724_];
		    int i_735_ = GameInPacket.ints2[i_724_];
		    int i_736_
			= (i_735_ * jc[i_730_] + 16383 - Ib[i_730_] * i_734_
			   >> 14);
		    Ib[i_730_]
			= (jc[i_730_] * i_734_ + i_735_ * Ib[i_730_] + 16383
			   >> 14);
		    jc[i_730_] = i_736_;
		}
		if (i_725_ != 0) {
		    int i_737_ = GameInPacket.ints1[i_725_];
		    int i_738_ = GameInPacket.ints2[i_725_];
		    int i_739_
			= (Ib[i_730_] * i_737_ + (i_738_ * Z[i_730_] + 16383)
			   >> 14);
		    Ib[i_730_]
			= (i_738_ * Ib[i_730_] + 16383 - Z[i_730_] * i_737_
			   >> 14);
		    Z[i_730_] = i_739_;
		}
		Z[i_730_] += cs.h;
		jc[i_730_] += Class_j.k;
		Ib[i_730_] += qd.t;
	    }
	} else if (i == 3) {
	    for (int i_740_ = 0; i_740_ < Db; i_740_++) {
		Z[i_740_] -= cs.h;
		jc[i_740_] -= Class_j.k;
		Ib[i_740_] -= qd.t;
		Z[i_740_] = Z[i_740_] * i_724_ / 128;
		jc[i_740_] = i_725_ * jc[i_740_] / 128;
		Ib[i_740_] = Ib[i_740_] * i_726_ / 128;
		Z[i_740_] += cs.h;
		jc[i_740_] += Class_j.k;
		Ib[i_740_] += qd.t;
	    }
	} else if (i == 5) {
	    for (int i_741_ = 0; uc > i_741_; i_741_++) {
		int i_742_ = (0xff & qb[i_741_]) + 8 * i_724_;
		if (i_742_ >= 0) {
		    if (i_742_ > 255)
			i_742_ = 255;
		} else
		    i_742_ = 0;
		qb[i_741_] = (byte) i_742_;
	    }
	    if (U != null) {
		for (int i_743_ = 0; i_743_ < Wb; i_743_++) {
		    oh var_oh = U[i_743_];
		    mfa var_mfa = db[i_743_];
		    ((mfa) var_mfa).l
			= (255 - (qb[((oh) var_oh).e] & 0xff) << 24
			   | ((mfa) var_mfa).l & 0xffffff);
		}
	    }
	    b(false);
	} else if (i == 7) {
	    for (int i_744_ = 0; i_744_ < uc; i_744_++) {
		int i_745_ = Fc[i_744_] & 0xffff;
		int i_746_ = (i_745_ & 0xff88) >> 10;
		int i_747_ = i_745_ >> 7 & 0x7;
		i_746_ = 0x3f & i_746_ + i_724_;
		int i_748_ = i_745_ & 0x7f;
		i_747_ += i_725_ / 4;
		if (i_747_ >= 0) {
		    if (i_747_ > 7)
			i_747_ = 7;
		} else
		    i_747_ = 0;
		i_748_ += i_726_;
		if (i_748_ < 0)
		    i_748_ = 0;
		else if (i_748_ > 127)
		    i_748_ = 127;
		Fc[i_744_]
		    = (short) hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_746_ << 10, i_747_ << 7), i_748_);
	    }
	    if (U != null) {
		for (int i_749_ = 0; i_749_ < Wb; i_749_++) {
		    oh var_oh = U[i_749_];
		    mfa var_mfa = db[i_749_];
		    ((mfa) var_mfa).l
			= (~0xffffff & ((mfa) var_mfa).l
			   | ji.j[Fc[((oh) var_oh).e] & 0xffff] & 0xffffff);
		}
	    }
	    b(false);
	} else if (i == 8) {
	    for (int i_750_ = 0; i_750_ < Wb; i_750_++) {
		mfa var_mfa = db[i_750_];
		((mfa) var_mfa).h += i_724_;
		((mfa) var_mfa).e += i_725_;
	    }
	} else if (i == 10) {
	    for (int i_751_ = 0; Wb > i_751_; i_751_++) {
		mfa var_mfa = db[i_751_];
		((mfa) var_mfa).n = ((mfa) var_mfa).n * i_724_ >> 7;
		((mfa) var_mfa).d = ((mfa) var_mfa).d * i_725_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_752_ = 0; i_752_ < Wb; i_752_++) {
		mfa var_mfa = db[i_752_];
		((mfa) var_mfa).m = ((mfa) var_mfa).m + i_724_ & 0x3fff;
	    }
	}
    }
    
    final int TA() {
	Tb++;
	return Qb;
    }
    
    final boolean LA() {
	s++;
	return vb;
    }
    
    final ha S(ha var_ha) {
	eb++;
	if (pb == 0)
	    return null;
	if (!ab)
	    e(false);
	int i;
	int i_753_;
	if (((en) Nb).jf <= 0) {
	    i = I - (((en) Nb).jf * vc >> 8) >> ((en) Nb).ae;
	    i_753_ = pc - (Jb * ((en) Nb).jf >> 8) >> ((en) Nb).ae;
	} else {
	    i = I - (Jb * ((en) Nb).jf >> 8) >> ((en) Nb).ae;
	    i_753_ = pc - (vc * ((en) Nb).jf >> 8) >> ((en) Nb).ae;
	}
	int i_754_;
	int i_755_;
	if (((en) Nb).Pe <= 0) {
	    i_754_ = sb - (((en) Nb).Pe * vc >> 8) >> ((en) Nb).ae;
	    i_755_ = Pb - (((en) Nb).Pe * Jb >> 8) >> ((en) Nb).ae;
	} else {
	    i_754_ = sb - (((en) Nb).Pe * Jb >> 8) >> ((en) Nb).ae;
	    i_755_ = Pb - (vc * ((en) Nb).Pe >> 8) >> ((en) Nb).ae;
	}
	int i_756_ = i_753_ - i + 1;
	int i_757_ = i_755_ - i_754_ + 1;
	ok var_ok = (ok) var_ha;
	ok var_ok_758_;
	if (var_ok == null || !var_ok.a(i_756_, -104, i_757_))
	    var_ok_758_ = new ok(Nb, i_756_, i_757_);
	else {
	    var_ok_758_ = var_ok;
	    var_ok_758_.i(38);
	}
	var_ok_758_.a(i_755_, i_754_, 1831282672, i, i_753_);
	a(var_ok_758_, (byte) 45);
	return var_ok_758_;
    }
    
    final void T(int i) {
	Qb = (short) i;
	gc++;
	b(false);
    }
    
    final void fa(int i) {
	nc++;
	int i_759_ = GameInPacket.ints1[i];
	int i_760_ = GameInPacket.ints2[i];
	for (int i_761_ = 0; Db > i_761_; i_761_++) {
	    int i_762_ = i_760_ * Z[i_761_] + i_759_ * Ib[i_761_] >> 14;
	    Ib[i_761_] = Ib[i_761_] * i_760_ - Z[i_761_] * i_759_ >> 14;
	    Z[i_761_] = i_762_;
	}
	for (int i_763_ = 0; i_763_ < pb; i_763_++) {
	    int i_764_ = i_759_ * J[i_763_] + fb[i_763_] * i_760_ >> 14;
	    J[i_763_]
		= (short) (i_760_ * J[i_763_] - fb[i_763_] * i_759_ >> 14);
	    fb[i_763_] = (short) i_764_;
	}
	b((byte) 112);
	f(55);
	ab = false;
    }
    
    ja(en var_en, int i, int i_765_, boolean bool, boolean bool_766_) {
	X = 0;
	Db = 0;
	pb = 0;
	zc = false;
	uc = 0;
	O = 0;
	Gc = true;
	ib = i;
	oc = i_765_;
	zc = bool_766_;
	Nb = var_en;
	if (bool || Class_ob.a(oc, (byte) 92, ib))
	    P = new gm(oe.a(68, ib, oc));
	if (bool || Class_jc.a(oc, ib, -95))
	    yb = new gm(kq.a(oc, ib, true));
	if (bool || sda.a((byte) 114, oc, ib))
	    Q = new gm(jv.a(3, ib, oc));
	if (bool || gm.a(ib, 0, oc))
	    fc = new gm(bk.a(oc, ib, -128));
	if (bool || sm.a(ib, 0, oc))
	    Jc = new fs(oga.b(128, ib, oc));
    }
}
