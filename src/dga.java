/* dga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

import jaggl.OpenGL;

final class dga extends Class_i
{
    static int m;
    int[][][] n;
    static int o;
    short[][] p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w = 0;
    static int x;
    private int y;
    private int z;
    private int A;
    static int B;
    static int C;
    int D;
    private int[][][] E;
    qj F;
    static pl G;
    static int H;
    int[][][] I;
    static int J;
    static int K;
    static int L;
    private int[][][] M;
    static int N;
    private int[][][] O;
    static int P;
    private Class_ae Q = new Class_ae();
    private int R;
    static int S;
    private ci[][][] T;
    private iu U;
    int[][][] V;
    static int W;
    private byte[][] X;
    private gv Y;
    private float[][] Z;
    private int ab;
    gv bb;
    private ci[] cb;
    gv db;
    private float[][] eb;
    gv fb;
    private int gb;
    private float[][] hb;
    private byte[][] ib;
    private il jb;
    private nl kb;
    
    final void a(gga var_gga, int[] is) {
	m++;
	Q.b(new cga(((dga) this).F, this, var_gga, is), (byte) 93);
    }
    
    final void BA() {
	if (ab <= 0)
	    U = null;
	else {
	    byte[][] is
		= new byte[((Class_i) this).k + 1][((Class_i) this).j + 1];
	    for (int i = 1; i < ((Class_i) this).k; i++) {
		for (int i_0_ = 1; ((Class_i) this).j > i_0_; i_0_++)
		    is[i][i_0_] = (byte) ((ib[i - 1][i_0_] >> 2)
					  + ((ib[i + 1][i_0_] >> 3)
					     + (ib[i][i_0_ - 1] >> 2))
					  + (ib[i][i_0_ + 1] >> 3)
					  + (ib[i][i_0_] >> 1));
	    }
	    cb = new ci[jb.a((byte) -26)];
	    jb.a(cb, (byte) -53);
	    for (int i = 0; i < cb.length; i++)
		cb[i].a((byte) -56, ab);
	    int i = 24;
	    if (O != null)
		i += 4;
	    if ((0x7 & ((dga) this).D) != 0)
		i += 12;
	    jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer
		= ((qj) ((dga) this).F).ne.a(ab * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    ci[] var_cis = new ci[ab];
	    int i_1_ = ko.a((byte) 114, ab / 4);
	    if (i_1_ < 1)
		i_1_ = 1;
	    il var_il = new il(i_1_);
	    ci[] var_cis_2_ = new ci[gb];
	    for (int i_3_ = 0; ((Class_i) this).k > i_3_; i_3_++) {
		for (int i_4_ = 0; i_4_ < ((Class_i) this).j; i_4_++) {
		    if (((dga) this).I[i_3_][i_4_] != null) {
			ci[] var_cis_5_ = T[i_3_][i_4_];
			int[] is_6_ = ((dga) this).n[i_3_][i_4_];
			int[] is_7_ = ((dga) this).V[i_3_][i_4_];
			int[] is_8_ = E[i_3_][i_4_];
			int[] is_9_ = ((dga) this).I[i_3_][i_4_];
			int[] is_10_ = M != null ? M[i_3_][i_4_] : null;
			if (is_8_ == null)
			    is_8_ = is_9_;
			int[] is_11_ = O == null ? null : O[i_3_][i_4_];
			float f = hb[i_3_][i_4_];
			float f_12_ = Z[i_3_][i_4_];
			float f_13_ = eb[i_3_][i_4_];
			float f_14_ = hb[i_3_][i_4_ + 1];
			float f_15_ = Z[i_3_][i_4_ + 1];
			float f_16_ = eb[i_3_][i_4_ + 1];
			float f_17_ = hb[i_3_ + 1][i_4_ + 1];
			float f_18_ = Z[i_3_ + 1][i_4_ + 1];
			float f_19_ = eb[i_3_ + 1][i_4_ + 1];
			float f_20_ = hb[i_3_ + 1][i_4_];
			float f_21_ = Z[i_3_ + 1][i_4_];
			float f_22_ = eb[i_3_ + 1][i_4_];
			int i_23_ = 0xff & is[i_3_][i_4_];
			int i_24_ = 0xff & is[i_3_][i_4_ + 1];
			int i_25_ = is[i_3_ + 1][i_4_ + 1] & 0xff;
			int i_26_ = is[i_3_ + 1][i_4_] & 0xff;
			int i_27_ = 0;
		    while_25_:
			for (int i_28_ = 0; i_28_ < is_9_.length; i_28_++) {
			    ci var_ci = var_cis_5_[i_28_];
			    for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
				if (var_cis_2_[i_29_] == var_ci)
				    continue while_25_;
			    }
			    var_cis_2_[i_27_++] = var_ci;
			}
			short[] is_30_
			    = (((dga) this).p[((Class_i) this).k * i_4_ + i_3_]
			       = new short[is_9_.length]);
			for (int i_31_ = 0; is_9_.length > i_31_; i_31_++) {
			    int i_32_
				= (i_3_ << ((Class_i) this).g) + is_6_[i_31_];
			    int i_33_
				= (i_4_ << ((Class_i) this).g) + is_7_[i_31_];
			    int i_34_ = i_32_ >> z;
			    int i_35_ = i_33_ >> z;
			    int i_36_ = is_9_[i_31_];
			    int i_37_ = is_8_[i_31_];
			    int i_38_ = is_10_ == null ? 0 : is_10_[i_31_];
			    long l
				= ((long) (i_34_ << 16)
				   | ((long) i_37_ << 48 | (long) i_36_ << 32)
				   | (long) i_35_);
			    int i_39_ = is_6_[i_31_];
			    int i_40_ = is_7_[i_31_];
			    int i_41_ = 74;
			    int i_42_ = 0;
			    float f_43_;
			    float f_44_;
			    float f_45_;
			    if (i_39_ == 0 && i_40_ == 0) {
				f_45_ = f_13_;
				f_43_ = f_12_;
				i_41_ -= i_23_;
				f_44_ = f;
			    } else if (i_39_ != 0
				       || ((Class_i) this).b != i_40_) {
				if (i_39_ != ((Class_i) this).b
				    || ((Class_i) this).b != i_40_) {
				    if (((Class_i) this).b != i_39_
					|| i_40_ != 0) {
					float f_46_
					    = ((float) i_39_
					       / (float) ((Class_i) this).b);
					float f_47_
					    = ((float) i_40_
					       / (float) ((Class_i) this).b);
					float f_48_ = f + (f_20_ - f) * f_46_;
					float f_49_
					    = f_12_ + (f_21_ - f_12_) * f_46_;
					float f_50_
					    = (f_22_ - f_13_) * f_46_ + f_13_;
					float f_51_
					    = f_14_ + (f_17_ - f_14_) * f_46_;
					float f_52_
					    = f_46_ * (f_18_ - f_15_) + f_15_;
					f_43_
					    = f_49_ + (f_52_ - f_49_) * f_47_;
					f_44_
					    = f_47_ * (f_51_ - f_48_) + f_48_;
					float f_53_
					    = f_16_ + f_46_ * (f_19_ - f_16_);
					f_45_
					    = f_50_ + (f_53_ - f_50_) * f_47_;
					int i_54_ = ((i_39_ * (i_26_ - i_23_)
						      >> ((Class_i) this).g)
						     + i_23_);
					int i_55_
					    = i_24_ + ((i_25_ - i_24_) * i_39_
						       >> ((Class_i) this).g);
					i_41_
					    -= ((i_55_ - i_54_) * i_40_
						>> ((Class_i) this).g) + i_54_;
				    } else {
					f_44_ = f_20_;
					f_45_ = f_22_;
					f_43_ = f_21_;
					i_41_ -= i_26_;
				    }
				} else {
				    f_44_ = f_17_;
				    f_43_ = f_18_;
				    i_41_ -= i_25_;
				    f_45_ = f_19_;
				}
			    } else {
				f_43_ = f_15_;
				f_45_ = f_16_;
				i_41_ -= i_24_;
				f_44_ = f_14_;
			    }
			    float f_56_ = 1.0F;
			    if ((i_36_ ^ 0xffffffff) != 0) {
				int i_57_ = (i_36_ & 0x7f) * i_41_ >> 7;
				if (i_57_ < 2)
				    i_57_ = 2;
				else if (i_57_ > 126)
				    i_57_ = 126;
				i_42_ = ji.j[i_36_ & 0xff80 | i_57_];
				if ((0x7 & ((dga) this).D) == 0) {
				    f_56_
					= (f_44_ * ((qj) ((dga) this).F).Ng[0]
					   + (f_43_
					      * ((qj) ((dga) this).F).Ng[1])
					   + (f_45_
					      * ((qj) ((dga) this).F).Ng[2]));
				    f_56_
					= (f_56_ * (!(f_56_ > 0.0F)
						    ? ((qj) ((dga) this).F).If
						    : ((qj) ((dga) this).F).lf)
					   + ((qj) ((dga) this).F).Xf);
				}
			    }
			    Node class_d = null;
			    if ((i_32_ & y - 1) == 0 && (i_33_ & y - 1) == 0)
				class_d = var_il.a(-32748, l);
			    int i_58_;
			    if (class_d == null) {
				int i_59_;
				if (i_36_ == i_37_)
				    i_59_ = i_42_;
				else {
				    int i_60_ = (0x7f & i_37_) * i_41_ >> 7;
				    if (i_60_ >= 2) {
					if (i_60_ > 126)
					    i_60_ = 126;
				    } else
					i_60_ = 2;
				    i_59_ = ji.j[i_37_ & 0xff80 | i_60_];
				    if ((0x7 & ((dga) this).D) == 0) {
					float f_61_
					    = ((((qj) ((dga) this).F).Ng[2]
						* f_45_)
					       + (f_43_ * ((qj) (((dga) this)
								 .F)).Ng[1]
						  + (f_44_
						     * (((qj) ((dga) this).F)
							.Ng[0]))));
					f_61_
					    = (((qj) ((dga) this).F).Xf
					       + (f_56_
						  * (f_56_ > 0.0F
						     ? ((qj) ((dga) this).F).lf
						     : (((qj) ((dga) this).F)
							.If))));
					int i_62_ = i_59_ >> 16 & 0xff;
					int i_63_ = 0xff & i_59_ >> 8;
					int i_64_ = i_59_ & 0xff;
					i_62_ *= f_61_;
					i_63_ *= f_61_;
					if (i_62_ >= 0) {
					    if (i_62_ > 255)
						i_62_ = 255;
					} else
					    i_62_ = 0;
					i_64_ *= f_61_;
					if (i_63_ >= 0) {
					    if (i_63_ > 255)
						i_63_ = 255;
					} else
					    i_63_ = 0;
					if (i_64_ < 0)
					    i_64_ = 0;
					else if (i_64_ > 255)
					    i_64_ = 255;
					i_59_ = i_64_ | (i_62_ << 16
							 | i_63_ << 8);
				    }
				}
				if (!((qj) ((dga) this).F).ig) {
				    stream.b((float) i_32_);
				    stream.b((float) (i_38_
						      + this.a(i_33_, i_32_,
							       true)));
				    stream.b((float) i_33_);
				    stream.d((byte) (i_59_ >> 16));
				    stream.d((byte) (i_59_ >> 8));
				    stream.d((byte) i_59_);
				    stream.d(-1);
				    stream.b((float) i_32_);
				    stream.b((float) i_33_);
				    if (O != null)
					stream.b((float) (is_11_ == null ? 0
							  : (is_11_[i_31_]
							     - 1)));
				    if ((0x7 & ((dga) this).D) != 0) {
					stream.b(f_44_);
					stream.b(f_43_);
					stream.b(f_45_);
				    }
				} else {
				    stream.a((float) i_32_);
				    stream.a((float) (i_38_
						      + this.a(i_33_, i_32_,
							       true)));
				    stream.a((float) i_33_);
				    stream.d((byte) (i_59_ >> 16));
				    stream.d((byte) (i_59_ >> 8));
				    stream.d((byte) i_59_);
				    stream.d(-1);
				    stream.a((float) i_32_);
				    stream.a((float) i_33_);
				    if (O != null)
					stream.a((float) (is_11_ == null ? 0
							  : (is_11_[i_31_]
							     - 1)));
				    if ((0x7 & ((dga) this).D) != 0) {
					stream.a(f_44_);
					stream.a(f_43_);
					stream.a(f_45_);
				    }
				}
				i_58_ = R++;
				is_30_[i_31_] = (short) i_58_;
				if ((i_36_ ^ 0xffffffff) != 0)
				    var_cis[i_58_] = var_cis_5_[i_31_];
				var_il.a(new lk(is_30_[i_31_]), (byte) -88, l);
			    } else {
				is_30_[i_31_] = ((lk) (lk) class_d).n;
				i_58_ = 0xffff & is_30_[i_31_];
				if ((i_36_ ^ 0xffffffff) != 0
				    && (((Node) var_cis[i_58_]).nodeID
					> ((Node) var_cis_5_[i_31_]).nodeID))
				    var_cis[i_58_] = var_cis_5_[i_31_];
			    }
			    for (int i_65_ = 0; i_27_ > i_65_; i_65_++)
				var_cis_2_[i_65_].a(i_41_, i_58_, (byte) -80,
						    i_42_, f_56_);
			    A++;
			}
		    }
		}
	    }
	    for (int i_66_ = 0; R > i_66_; i_66_++) {
		ci var_ci = var_cis[i_66_];
		if (var_ci != null)
		    var_ci.c((byte) 6, i_66_);
	    }
	    for (int i_67_ = 0; i_67_ < ((Class_i) this).k; i_67_++) {
		for (int i_68_ = 0; ((Class_i) this).j > i_68_; i_68_++) {
		    short[] is_69_
			= ((dga) this).p[i_67_ + i_68_ * ((Class_i) this).k];
		    if (is_69_ != null) {
			int i_70_ = 0;
			int i_71_ = 0;
			while (i_71_ < is_69_.length) {
			    int i_72_ = is_69_[i_71_++] & 0xffff;
			    int i_73_ = is_69_[i_71_++] & 0xffff;
			    int i_74_ = 0xffff & is_69_[i_71_++];
			    ci var_ci = var_cis[i_72_];
			    ci var_ci_75_ = var_cis[i_73_];
			    ci var_ci_76_ = var_cis[i_74_];
			    ci var_ci_77_ = null;
			    if (var_ci != null) {
				var_ci_77_ = var_ci;
				var_ci.a(i_67_, i_70_, false, i_68_);
			    }
			    if (var_ci_75_ != null) {
				var_ci_75_.a(i_67_, i_70_, false, i_68_);
				if (var_ci_77_ == null
				    || (((Node) var_ci_77_).nodeID
					> ((Node) var_ci_75_).nodeID))
				    var_ci_77_ = var_ci_75_;
			    }
			    if (var_ci_76_ != null) {
				var_ci_76_.a(i_67_, i_70_, false, i_68_);
				if (var_ci_77_ == null
				    || (((Node) var_ci_77_).nodeID
					> ((Node) var_ci_76_).nodeID))
				    var_ci_77_ = var_ci_76_;
			    }
			    if (var_ci_77_ != null) {
				if (var_ci != null)
				    var_ci_77_.c((byte) 6, i_72_);
				if (var_ci_75_ != null)
				    var_ci_77_.c((byte) 6, i_73_);
				if (var_ci_76_ != null)
				    var_ci_77_.c((byte) 6, i_74_);
				var_ci_77_.a(i_67_, i_70_, false, i_68_);
			    }
			    i_70_++;
			}
		    }
		}
	    }
	    stream.c();
	    kb = ((dga) this).F.a(i, false, stream.b(), nativeheapbuffer, 3);
	    ((dga) this).bb = new gv(kb, 5126, 3, 0);
	    Y = new gv(kb, 5121, 4, 12);
	    int i_78_;
	    if (O != null) {
		i_78_ = 28;
		((dga) this).fb = new gv(kb, 5126, 3, 16);
	    } else {
		((dga) this).fb = new gv(kb, 5126, 2, 16);
		i_78_ = 24;
	    }
	    if ((((dga) this).D & 0x7) != 0)
		((dga) this).db = new gv(kb, 5126, 3, i_78_);
	    long[] ls = new long[cb.length];
	    for (int i_79_ = 0; i_79_ < cb.length; i_79_++) {
		ci var_ci = cb[i_79_];
		ls[i_79_] = ((Node) var_ci).nodeID;
		var_ci.b((byte) -33, R);
	    }
	    sc.a(ls, 0, cb);
	    if (U != null)
		U.a(74);
	}
	N++;
	E = null;
	((dga) this).I = null;
	O = null;
	T = null;
	jb = null;
	ib = null;
	M = null;
	hb = Z = eb = null;
	((dga) this).n = ((dga) this).V = null;
    }
    
    final void DA(ha var_ha, int i, int i_80_, int i_81_, int i_82_,
		  boolean bool) {
	r++;
	if (U != null && var_ha != null) {
	    int i_83_ = (i - (i_80_ * ((qj) ((dga) this).F).Eg >> 8)
			 >> ((qj) ((dga) this).F).le);
	    int i_84_ = (i_81_ - (i_80_ * ((qj) ((dga) this).F).Fg >> 8)
			 >> ((qj) ((dga) this).F).le);
	    U.b(var_ha, i_84_, i_83_, -1);
	}
    }
    
    final void a(int i, int i_85_, int i_86_, boolean[][] bools, boolean bool,
		 int i_87_) {
	u++;
	a(i_86_, bool, bools, i_87_, i_85_, (byte) 87, i);
    }
    
    final void a(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_,
		 int i_93_, boolean[][] bools) {
	K++;
	if (ab > 0) {
	    ((dga) this).F.B(-13);
	    ((dga) this).F.a(false, (byte) -121);
	    ((dga) this).F.a((byte) 127, false);
	    ((dga) this).F.a((int) -91, false);
	    ((dga) this).F.a(false, (int) 117);
	    ((dga) this).F.b((byte) 89, (int) 0);
	    ((dga) this).F.b((int) -2, (byte) -48);
	    ((dga) this).F.a((rg) null, -2);
	    gfa.z[13] = 1.0F - (((float) (2 * i_88_)
				 + (float) (i_89_ * i_93_) / 128.0F)
				/ (float) ((qj) ((dga) this).F).ib);
	    gfa.z[8] = 0.0F;
	    gfa.z[0]
		= (float) i_89_ / ((float) ((qj) ((dga) this).F).od
				   * ((float) ((Class_i) this).b * 128.0F));
	    gfa.z[5]
		= (float) i_89_ / ((float) ((qj) ((dga) this).F).ib
				   * (128.0F * (float) ((Class_i) this).b));
	    gfa.z[2] = 0.0F;
	    gfa.z[4] = 0.0F;
	    gfa.z[12] = -(((float) -(2 * i) + (float) (i_90_ * i_89_) / 128.0F)
			  / (float) ((qj) ((dga) this).F).od) - 1.0F;
	    gfa.z[15] = 1.0F;
	    gfa.z[11] = 0.0F;
	    gfa.z[7] = 0.0F;
	    gfa.z[10] = 0.0F;
	    gfa.z[1] = 0.0F;
	    gfa.z[14] = 0.0F;
	    gfa.z[6] = 0.0F;
	    gfa.z[3] = 0.0F;
	    gfa.z[9] = 0.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(gfa.z, 0);
	    gfa.z[4] = 0.0F;
	    gfa.z[10] = 0.0F;
	    gfa.z[6] = 1.0F;
	    gfa.z[1] = 0.0F;
	    gfa.z[11] = 0.0F;
	    gfa.z[2] = 0.0F;
	    gfa.z[9] = 1.0F;
	    gfa.z[5] = 0.0F;
	    gfa.z[7] = 0.0F;
	    gfa.z[3] = 0.0F;
	    gfa.z[12] = 0.0F;
	    gfa.z[14] = 0.0F;
	    gfa.z[8] = 0.0F;
	    gfa.z[0] = 1.0F;
	    gfa.z[15] = 1.0F;
	    gfa.z[13] = 0.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(gfa.z, 0);
	    if ((((dga) this).D & 0x7) != 0) {
		((dga) this).F.a((byte) 105, true);
		((dga) this).F.o(13211);
	    } else
		((dga) this).F.a((byte) 101, false);
	    ((dga) this).F.a(((dga) this).bb, (byte) 91, Y, ((dga) this).fb,
			     ((dga) this).db);
	    if (A * 2 <= ((BytesParser) ((qj) ((dga) this).F).Zf).bytes.length)
		((BytesParser) ((qj) ((dga) this).F).Zf).pos = 0;
	    else
		((qj) ((dga) this).F).Zf = new fw(2 * A);
	    int i_94_ = 0;
	    fw var_fw = ((qj) ((dga) this).F).Zf;
	    if (!((qj) ((dga) this).F).ig) {
		for (int i_95_ = i_91_; i_95_ < i_93_; i_95_++) {
		    int i_96_ = i_90_ + ((Class_i) this).k * i_95_;
		    for (int i_97_ = i_90_; i_92_ > i_97_; i_97_++) {
			if (bools[i_97_ - i_90_][i_95_ - i_91_]) {
			    short[] is = ((dga) this).p[i_96_];
			    if (is != null) {
				for (int i_98_ = 0; i_98_ < is.length;
				     i_98_++) {
				    var_fw.writeShortReversed2(0xffff & is[i_98_], (byte) 0);
				    i_94_++;
				}
			    }
			}
			i_96_++;
		    }
		}
	    } else {
		for (int i_99_ = i_91_; i_93_ > i_99_; i_99_++) {
		    int i_100_ = i_99_ * ((Class_i) this).k + i_90_;
		    for (int i_101_ = i_90_; i_101_ < i_92_; i_101_++) {
			if (bools[i_101_ - i_90_][i_99_ - i_91_]) {
			    short[] is = ((dga) this).p[i_100_];
			    if (is != null) {
				for (int i_102_ = 0; i_102_ < is.length;
				     i_102_++) {
				    i_94_++;
				    var_fw.writeShort(0xffff & is[i_102_], 13469);
				}
			    }
			}
			i_100_++;
		    }
		}
	    }
	    if (i_94_ > 0) {
		wk var_wk = new wk(((dga) this).F, 5123, ((BytesParser) var_fw).bytes,
				   ((BytesParser) var_fw).pos);
		((dga) this).F.a(i_94_, 0, 4, var_wk, 255);
	    }
	}
    }
    
    final void a(int i, int i_103_, int i_104_, boolean[][] bools,
		 boolean bool) {
	a(i_104_, bool, bools, -1, i_103_, (byte) 124, i);
	H++;
    }
    
    static final boolean b(int i, int i_105_, int i_106_) {
	int i_107_ = 72 % ((i - 19) / 59);
	o++;
	if ((0x34 & i_105_) == 0)
	    return false;
	return true;
    }
    
    private final void a(int i, boolean bool, boolean[][] bools, int i_108_,
			 int i_109_, byte i_110_, int i_111_) {
	int i_112_ = 107 % ((-10 - i_110_) / 43);
	if (cb != null) {
	    int i_113_ = i + i + 1;
	    i_113_ *= i_113_;
	    if (i_113_ > ((qj) ((dga) this).F).ih.length)
		((qj) ((dga) this).F).ih = new int[i_113_];
	    if (((BytesParser) ((qj) ((dga) this).F).Zf).bytes.length < 2 * A)
		((qj) ((dga) this).F).Zf = new fw(A * 2);
	    int i_114_ = i_111_ - i;
	    int i_115_ = i_114_;
	    if (i_114_ < 0)
		i_114_ = 0;
	    int i_116_ = i_109_ - i;
	    int i_117_ = i_116_;
	    if (i_116_ < 0)
		i_116_ = 0;
	    int i_118_ = i + i_111_;
	    if (i_118_ > ((Class_i) this).k - 1)
		i_118_ = ((Class_i) this).k - 1;
	    int i_119_ = i + i_109_;
	    if (((Class_i) this).j - 1 < i_119_)
		i_119_ = ((Class_i) this).j - 1;
	    int i_120_ = 0;
	    int[] is = ((qj) ((dga) this).F).ih;
	    for (int i_121_ = i_114_; i_121_ <= i_118_; i_121_++) {
		boolean[] bools_122_ = bools[i_121_ - i_115_];
		for (int i_123_ = i_116_; i_123_ <= i_119_; i_123_++) {
		    if (bools_122_[i_123_ - i_117_])
			is[i_120_++] = ((Class_i) this).k * i_123_ + i_121_;
		}
	    }
	    if (i_108_ == -1)
		((dga) this).F.u(-98);
	    else {
		((dga) this).F.a((byte) 95, (float) i_108_);
		((dga) this).F.j(379);
	    }
	    ((dga) this).F.a((byte) 110, (((dga) this).D & 0x7) != 0);
	    for (int i_124_ = 0; cb.length > i_124_; i_124_++)
		cb[i_124_].a(i_120_, 0, is);
	    if (!Q.b(true)) {
		int i_125_ = ((qj) ((dga) this).F).nf;
		int i_126_ = ((qj) ((dga) this).F).bf;
		((dga) this).F.pa(0, i_126_, ((qj) ((dga) this).F).cf);
		((dga) this).F.a((byte) 117, false);
		((dga) this).F.a(false, (int) -102);
		((dga) this).F.b((byte) 74, 128);
		((dga) this).F.b((int) -2, (byte) -93);
		((dga) this).F.a(((qj) ((dga) this).F).Yf, -2);
		((dga) this).F.a(8448, -465309136, 7681);
		((dga) this).F.b(0, 770, 768, 34166);
		((dga) this).F.a(34167, 770, 0, true);
		for (Node class_d = Q.a((int) 125); class_d != null;
		     class_d = Q.b((byte) 80)) {
		    cga var_cga = (cga) class_d;
		    var_cga.a(114, bools, i_111_, i, i_109_);
		}
		((dga) this).F.b(0, 768, 768, 5890);
		((dga) this).F.a(5890, 770, 0, true);
		((dga) this).F.a((rg) null, -2);
		((dga) this).F.pa(i_125_, i_126_, ((qj) ((dga) this).F).cf);
	    }
	    if (U != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((dga) this).F.a(((dga) this).bb, (byte) 27, null,
				 ((dga) this).fb, null);
		U.a(i_111_, i_109_, bools, true, bool, i);
		OpenGL.glPopMatrix();
	    }
	}
	S++;
    }
    
    final boolean a(ha var_ha, int i, int i_127_, int i_128_, int i_129_,
		    boolean bool) {
	W++;
	if (U == null || var_ha == null)
	    return false;
	int i_130_ = (i - (i_127_ * ((qj) ((dga) this).F).Eg >> 8)
		      >> ((qj) ((dga) this).F).le);
	int i_131_ = (i_128_ - (i_127_ * ((qj) ((dga) this).F).Fg >> 8)
		      >> ((qj) ((dga) this).F).le);
	return U.a(var_ha, i_131_, i_130_, -11578);
    }
    
    static final Class_cb a(int i, byte[] is, lm var_lm, byte i_132_) {
	L++;
	long l = OpenGL.glCreateShaderObjectARB(i);
	int i_133_ = -86 / ((i_132_ - 32) / 53);
	OpenGL.glShaderSourceRawARB(l, is);
	OpenGL.glCompileShaderARB(l);
	OpenGL.glGetObjectParameterivARB(l, 35713, kc.a, 0);
	if (kc.a[0] == 0) {
	    if (kc.a[0] == 0)
		System.out.println("Shader compile failed:");
	    OpenGL.glGetObjectParameterivARB(l, 35716, kc.a, 1);
	    if (kc.a[1] > 1) {
		byte[] is_134_ = new byte[kc.a[1]];
		OpenGL.glGetInfoLogARB(l, kc.a[1], kc.a, 0, is_134_, 0);
		System.out.println(new String(is_134_));
	    }
	    if (kc.a[0] == 0) {
		OpenGL.glDeleteObjectARB(l);
		return null;
	    }
	}
	return new Class_cb(var_lm, l, i);
    }
    
    final void E(ha var_ha, int i, int i_135_, int i_136_, int i_137_,
		 boolean bool) {
	q++;
	if (U != null && var_ha != null) {
	    int i_138_ = (i - (i_135_ * ((qj) ((dga) this).F).Eg >> 8)
			  >> ((qj) ((dga) this).F).le);
	    int i_139_ = (i_136_ - (i_135_ * ((qj) ((dga) this).F).Fg >> 8)
			  >> ((qj) ((dga) this).F).le);
	    U.a(i_138_, var_ha, true, i_139_);
	}
    }
    
    final ha v(int i, int i_140_, ha var_ha) {
	x++;
	if ((X[i][i_140_] & 0x1) == 0)
	    return null;
	int i_141_ = ((Class_i) this).b >> ((qj) ((dga) this).F).le;
	vg var_vg = (vg) var_ha;
	vg var_vg_142_;
	if (var_vg == null || !var_vg.b(i_141_, 93, i_141_))
	    var_vg_142_ = new vg(((dga) this).F, i_141_, i_141_);
	else {
	    var_vg_142_ = var_vg;
	    var_vg_142_.i(-24051);
	}
	var_vg_142_.a(0, 0, i_141_, true, i_141_);
	a(i_140_, i, 0, var_vg_142_);
	return var_vg_142_;
    }
    
    final void O(int i, int i_143_, int[] is, int[] is_144_, int[] is_145_,
		 int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_,
		 int[] is_150_, int i_151_, int i_152_, int i_153_,
		 boolean bool) {
	if (is_146_ != null && O == null)
	    O = new int[((Class_i) this).k][((Class_i) this).j][];
	if (is_144_ != null && M == null)
	    M = new int[((Class_i) this).k][((Class_i) this).j][];
	s++;
	((dga) this).n[i][i_143_] = is;
	((dga) this).V[i][i_143_] = is_145_;
	((dga) this).I[i][i_143_] = is_147_;
	E[i][i_143_] = is_148_;
	if (O != null)
	    O[i][i_143_] = is_146_;
	if (M != null)
	    M[i][i_143_] = is_144_;
	ci[] var_cis = T[i][i_143_] = new ci[is_147_.length];
	for (int i_154_ = 0; i_154_ < is_147_.length; i_154_++) {
	    long l = ((long) is_149_[i_154_]
		      | ((long) (is_150_[i_154_] << 14)
			 | ((long) i_153_ << 48 | (long) i_152_ << 42
			    | (long) i_151_ << 28)));
	    Node class_d;
	    for (class_d = jb.a(-32748, l); class_d != null;
		 class_d = jb.c((byte) 109)) {
		ci var_ci = (ci) class_d;
		if (((ci) var_ci).D == is_149_[i_154_]
		    && ((ci) var_ci).s == (float) is_150_[i_154_]
		    && ((ci) var_ci).C == i_151_ && ((ci) var_ci).E == i_152_
		    && ((ci) var_ci).y == i_153_)
		    break;
	    }
	    if (class_d != null)
		var_cis[i_154_] = (ci) class_d;
	    else {
		var_cis[i_154_]
		    = new ci(this, is_149_[i_154_], is_150_[i_154_], i_151_,
			     i_152_, i_153_);
		jb.a(var_cis[i_154_], (byte) -87, l);
	    }
	}
	if (bool)
	    X[i][i_143_] = (byte) hba.bitwiseArg1ORArg2(X[i][i_143_], 1);
	if (is_147_.length > gb)
	    gb = is_147_.length;
	ab += is_147_.length;
    }
    
    final void a(int i, int i_155_, int[] is, int[] is_156_, int[] is_157_,
		 int[] is_158_, int[] is_159_, int[] is_160_, int[] is_161_,
		 int[] is_162_, int[] is_163_, int[] is_164_, int[] is_165_,
		 int i_166_, int i_167_, int i_168_, boolean bool) {
	J++;
	int i_169_ = is_162_.length;
	int[] is_170_ = new int[3 * i_169_];
	int[] is_171_ = new int[3 * i_169_];
	int[] is_172_ = new int[3 * i_169_];
	int[] is_173_ = new int[i_169_ * 3];
	int[] is_174_ = new int[i_169_ * 3];
	int[] is_175_ = new int[i_169_ * 3];
	int[] is_176_ = is_156_ != null ? new int[3 * i_169_] : null;
	int[] is_177_ = is_158_ == null ? null : new int[3 * i_169_];
	int i_178_ = 0;
	for (int i_179_ = 0; i_169_ > i_179_; i_179_++) {
	    int i_180_ = is_159_[i_179_];
	    int i_181_ = is_160_[i_179_];
	    int i_182_ = is_161_[i_179_];
	    is_170_[i_178_] = is[i_180_];
	    is_171_[i_178_] = is_157_[i_180_];
	    is_172_[i_178_] = is_162_[i_179_];
	    is_174_[i_178_] = is_164_[i_179_];
	    is_175_[i_178_] = is_165_[i_179_];
	    is_173_[i_178_]
		= is_163_ != null ? is_163_[i_179_] : is_162_[i_179_];
	    if (is_156_ != null)
		is_176_[i_178_] = is_156_[i_180_];
	    if (is_158_ != null)
		is_177_[i_178_] = is_158_[i_180_];
	    i_178_++;
	    is_170_[i_178_] = is[i_181_];
	    is_171_[i_178_] = is_157_[i_181_];
	    is_172_[i_178_] = is_162_[i_179_];
	    is_174_[i_178_] = is_164_[i_179_];
	    is_175_[i_178_] = is_165_[i_179_];
	    is_173_[i_178_]
		= is_163_ == null ? is_162_[i_179_] : is_163_[i_179_];
	    if (is_156_ != null)
		is_176_[i_178_] = is_156_[i_181_];
	    if (is_158_ != null)
		is_177_[i_178_] = is_158_[i_181_];
	    i_178_++;
	    is_170_[i_178_] = is[i_182_];
	    is_171_[i_178_] = is_157_[i_182_];
	    is_172_[i_178_] = is_162_[i_179_];
	    is_174_[i_178_] = is_164_[i_179_];
	    is_175_[i_178_] = is_165_[i_179_];
	    is_173_[i_178_]
		= is_163_ == null ? is_162_[i_179_] : is_163_[i_179_];
	    if (is_156_ != null)
		is_176_[i_178_] = is_156_[i_182_];
	    if (is_158_ != null)
		is_177_[i_178_] = is_158_[i_182_];
	    i_178_++;
	}
	O(i, i_155_, is_170_, is_176_, is_171_, is_177_, is_172_, is_173_,
	  is_174_, is_175_, i_166_, i_167_, i_168_, bool);
    }
    
    private final void a(int i, int i_183_, int i_184_, vg var_vg) {
	C++;
	int[] is = ((dga) this).n[i_183_][i];
	int[] is_185_ = ((dga) this).V[i_183_][i];
	int i_186_ = is.length;
	if (i_186_ > ((qj) ((dga) this).F).jh.length) {
	    ((qj) ((dga) this).F).hh = new int[i_186_];
	    ((qj) ((dga) this).F).jh = new int[i_186_];
	}
	int[] is_187_ = ((qj) ((dga) this).F).jh;
	int[] is_188_ = ((qj) ((dga) this).F).hh;
	for (int i_189_ = 0; i_186_ > i_189_; i_189_++) {
	    is_187_[i_189_] = is[i_189_] >> ((qj) ((dga) this).F).le;
	    is_188_[i_189_] = is_185_[i_189_] >> ((qj) ((dga) this).F).le;
	}
	int i_190_ = i_184_;
	while (i_190_ < i_186_) {
	    int i_191_ = is_187_[i_190_];
	    int i_192_ = is_188_[i_190_++];
	    int i_193_ = is_187_[i_190_];
	    int i_194_ = is_188_[i_190_++];
	    int i_195_ = is_187_[i_190_];
	    int i_196_ = is_188_[i_190_++];
	    if (((i_191_ - i_193_) * (i_194_ - i_196_)
		 - (i_194_ - i_192_) * (i_195_ - i_193_))
		> 0)
		var_vg.a(i_196_, i_191_, i_195_, i_193_, i_192_, 112, i_194_);
	}
    }
    
    dga(qj var_qj, int i, int i_197_, int i_198_, int i_199_, int[][] is,
	int[][] is_200_, int i_201_) {
	super(i_198_, i_199_, i_201_, is);
	z = ((Class_i) this).g - 2;
	((dga) this).F = var_qj;
	M = new int[i_198_][i_199_][];
	T = new ci[i_198_][i_199_][];
	((dga) this).V = new int[i_198_][i_199_][];
	Z = new float[((Class_i) this).k + 1][((Class_i) this).j + 1];
	((dga) this).n = new int[i_198_][i_199_][];
	hb = new float[((Class_i) this).k + 1][((Class_i) this).j + 1];
	((dga) this).D = i_197_;
	y = 1 << z;
	((dga) this).I = new int[i_198_][i_199_][];
	((dga) this).p = new short[i_199_ * i_198_][];
	eb = new float[((Class_i) this).k + 1][((Class_i) this).j + 1];
	ib = new byte[i_198_ + 1][i_199_ + 1];
	X = new byte[i_198_][i_199_];
	E = new int[i_198_][i_199_][];
	for (int i_202_ = 1; i_202_ < ((Class_i) this).j; i_202_++) {
	    for (int i_203_ = 1; i_203_ < ((Class_i) this).k; i_203_++) {
		int i_204_ = (is_200_[i_203_ + 1][i_202_]
			      - is_200_[i_203_ - 1][i_202_]);
		int i_205_ = (is_200_[i_203_][i_202_ + 1]
			      - is_200_[i_203_][i_202_ - 1]);
		float f
		    = (float) (1.0
			       / Math.sqrt((double) (4 * i_201_ * i_201_
						     + (i_204_ * i_204_
							+ i_205_ * i_205_))));
		hb[i_203_][i_202_] = (float) i_204_ * f;
		Z[i_203_][i_202_] = f * (float) (2 * -i_201_);
		eb[i_203_][i_202_] = (float) i_205_ * f;
	    }
	}
	jb = new il(128);
	if ((((dga) this).D & 0x10) != 0)
	    U = new iu(((dga) this).F, this);
    }
    
    final void a(int i, int i_206_) {
	t++;
    }
    
    public static void b(int i) {
	if (i != 1135849320)
	    G = null;
	G = null;
    }
    
    final void a(int i, int i_207_, int i_208_) {
	if (i_208_ > (0xff & ib[i][i_207_]))
	    ib[i][i_207_] = (byte) i_208_;
	v++;
    }
}
