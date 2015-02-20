/* daa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class daa extends Class_i
{
    static int m;
    static int var_n;
    static int o;
    static int p;
    int[][][] q;
    private float r = 3.4028235E38F;
    private Class_ae s;
    private int t;
    static int u;
    static int v;
    private tea w;
    static int x;
    private int[][][] y;
    private byte[][] z;
    int[][][] A;
    static int B;
    static int C;
    en D;
    static int E;
    static int F;
    private int G;
    static int H;
    static GameInPacket incomingPacket25 = new GameInPacket(25, 7);
    static int J;
    private int K;
    static int L;
    static int M;
    int N;
    short[][] O;
    private bl[][][] P;
    static int Q;
    int[][][] R;
    static int S;
    private int[][][] T;
    private float U = -3.4028235E38F;
    private int V;
    static int W;
    private int[][][] X;
    static baa Y = new baa(8, 0, 4, 1);
    static int Z;
    static ah ab;
    private nba bb;
    static int cb = 0;
    private nba db;
    private int eb;
    private float[][] fb;
    private int gb;
    private float[][] hb;
    private byte[][] ib;
    mq jb;
    private bl[] kb;
    private il lb;
    private float[][] mb;
    
    private final void a(int i, int i_0_, boolean bool, int i_1_, int i_2_,
			 boolean[][] bools, int i_3_) {
	E++;
	if (i != 0)
	    DA(null, -99, -24, -115, -67, false);
	if (kb != null) {
	    int i_4_ = i_3_ + i_3_ + 1;
	    i_4_ *= i_4_;
	    if (uba.s.length < i_4_)
		uba.s = new int[i_4_];
	    int i_5_ = i_1_ - i_3_;
	    int i_6_ = i_5_;
	    if (i_5_ < 0)
		i_5_ = 0;
	    int i_7_ = i_0_ - i_3_;
	    int i_8_ = i_7_;
	    if (i_7_ < 0)
		i_7_ = 0;
	    int i_9_ = i_1_ + i_3_;
	    if (i_9_ > ((Class_i) this).k - 1)
		i_9_ = ((Class_i) this).k - 1;
	    int i_10_ = i_0_ + i_3_;
	    qca.J = 0;
	    if (i_10_ > ((Class_i) this).j - 1)
		i_10_ = ((Class_i) this).j - 1;
	    for (int i_11_ = i_5_; i_9_ >= i_11_; i_11_++) {
		boolean[] bools_12_ = bools[i_11_ - i_6_];
		for (int i_13_ = i_7_; i_13_ <= i_10_; i_13_++) {
		    if (bools_12_[i_13_ - i_8_])
			uba.s[qca.J++] = i_13_ * ((Class_i) this).k + i_11_;
		}
	    }
	    if (i_2_ == -1)
		((daa) this).D.J(8);
	    else {
		((daa) this).D.a((float) i_2_, (byte) -50);
		((daa) this).D.N(128);
	    }
	    ((daa) this).D.i((byte) 54);
	    ((daa) this).D.a((((daa) this).N & 0x7) != 0, (int) 121);
	    ((daa) this).D.a(0, -1, false, false);
	    ((daa) this).D.a((byte) -16, bb, 0);
	    for (int i_14_ = 0; kb.length > i_14_; i_14_++)
		kb[i_14_].a(uba.s, 1602853160, qca.J);
	    mga var_mga = ((daa) this).D.Y(i + 12083);
	    var_mga.NA(0, -1, 0);
	    ((daa) this).D.T(-93);
	    if (!s.b(true)) {
		int i_15_ = ((en) ((daa) this).D).lf;
		int i_16_ = ((en) ((daa) this).D).Gf;
		((daa) this).D.pa(0, i_16_, ((en) ((daa) this).D).qf);
		((daa) this).D.a(false, i ^ 0x73);
		((daa) this).D.c(false, (byte) -25);
		((daa) this).D.a((byte) 28, 128);
		((daa) this).D.a(0, -2, false, false);
		((daa) this).D.a(((en) ((daa) this).D).fe, 0);
		((daa) this).D.a(Class_rf.e, true, ku.k);
		((daa) this).D.a(0, 1, ik.o);
		((daa) this).D.a(0, eda.h, -18836);
		for (Node class_d = s.a((int) 87); class_d != null;
		     class_d = s.b((byte) 82)) {
		    qca var_qca = (qca) class_d;
		    var_qca.a(i_0_, i_3_, bools, i_1_, -119);
		}
		((daa) this).D.a(0, 1, mca.l);
		((daa) this).D.a(0, mca.l, -18836);
		((daa) this).D.a((hfa) null, i);
		((daa) this).D.pa(i_15_, i_16_, ((en) ((daa) this).D).qf);
	    }
	    if (w != null) {
		((daa) this).D.a((byte) -16, bb, 0);
		((daa) this).D.a((byte) -16, db, 1);
		((daa) this).D.a(true, ((daa) this).jb);
		w.a(bool, i_3_, i_1_, i_0_, bools, false);
	    }
	}
    }
    
    final void a(int i, int i_17_) {
	x++;
    }
    
    final void a(int i, int i_18_, int i_19_, boolean[][] bools, boolean bool,
		 int i_20_) {
	H++;
	a(0, i_18_, bool, i, i_20_, bools, i_19_);
    }
    
    final boolean a(ha var_ha, int i, int i_21_, int i_22_, int i_23_,
		    boolean bool) {
	W++;
	if (w == null || var_ha == null)
	    return false;
	int i_24_ = (i - (i_21_ * ((en) ((daa) this).D).jf >> 8)
		     >> ((en) ((daa) this).D).ae);
	int i_25_ = (i_22_ - (((en) ((daa) this).D).Pe * i_21_ >> 8)
		     >> ((en) ((daa) this).D).ae);
	return w.a(var_ha, (byte) -85, i_25_, i_24_);
    }
    
    final void a(int i, int i_26_, int[] is, int[] is_27_, int[] is_28_,
		 int[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_,
		 int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_,
		 int i_37_, int i_38_, int i_39_, boolean bool) {
	S++;
	int i_40_ = is_33_.length;
	int[] is_41_ = new int[3 * i_40_];
	int[] is_42_ = new int[3 * i_40_];
	int[] is_43_ = new int[i_40_ * 3];
	int[] is_44_ = new int[3 * i_40_];
	int[] is_45_ = new int[3 * i_40_];
	int[] is_46_ = new int[3 * i_40_];
	int[] is_47_ = is_27_ != null ? new int[i_40_ * 3] : null;
	int[] is_48_ = is_29_ == null ? null : new int[3 * i_40_];
	int i_49_ = 0;
	for (int i_50_ = 0; i_50_ < i_40_; i_50_++) {
	    int i_51_ = is_30_[i_50_];
	    int i_52_ = is_31_[i_50_];
	    int i_53_ = is_32_[i_50_];
	    is_41_[i_49_] = is[i_51_];
	    is_42_[i_49_] = is_28_[i_51_];
	    is_43_[i_49_] = is_33_[i_50_];
	    is_45_[i_49_] = is_35_[i_50_];
	    is_46_[i_49_] = is_36_[i_50_];
	    is_44_[i_49_] = is_34_ != null ? is_34_[i_50_] : is_33_[i_50_];
	    if (is_27_ != null)
		is_47_[i_49_] = is_27_[i_51_];
	    if (is_29_ != null)
		is_48_[i_49_] = is_29_[i_51_];
	    i_49_++;
	    is_41_[i_49_] = is[i_52_];
	    is_42_[i_49_] = is_28_[i_52_];
	    is_43_[i_49_] = is_33_[i_50_];
	    is_45_[i_49_] = is_35_[i_50_];
	    is_46_[i_49_] = is_36_[i_50_];
	    is_44_[i_49_] = is_34_ == null ? is_33_[i_50_] : is_34_[i_50_];
	    if (is_27_ != null)
		is_47_[i_49_] = is_27_[i_52_];
	    if (is_29_ != null)
		is_48_[i_49_] = is_29_[i_52_];
	    i_49_++;
	    is_41_[i_49_] = is[i_53_];
	    is_42_[i_49_] = is_28_[i_53_];
	    is_43_[i_49_] = is_33_[i_50_];
	    is_45_[i_49_] = is_35_[i_50_];
	    is_46_[i_49_] = is_36_[i_50_];
	    is_44_[i_49_] = is_34_ != null ? is_34_[i_50_] : is_33_[i_50_];
	    if (is_27_ != null)
		is_47_[i_49_] = is_27_[i_53_];
	    if (is_29_ != null)
		is_48_[i_49_] = is_29_[i_53_];
	    i_49_++;
	}
	O(i, i_26_, is_41_, is_47_, is_42_, is_48_, is_43_, is_44_, is_45_,
	  is_46_, i_37_, i_38_, i_39_, bool);
    }
    
    private final void a(int i, ok var_ok, int i_54_, int i_55_) {
	v++;
	int[] is = ((daa) this).A[i_54_][i];
	int[] is_56_ = ((daa) this).q[i_54_][i];
	int i_57_ = 114 / ((i_55_ + 88) / 37);
	int i_58_ = is.length;
	if (i_58_ > ft.v.length) {
	    ft.v = new int[i_58_];
	    mv.h = new int[i_58_];
	}
	for (int i_59_ = 0; i_58_ > i_59_; i_59_++) {
	    ft.v[i_59_] = is[i_59_] >> ((en) ((daa) this).D).ae;
	    mv.h[i_59_] = is_56_[i_59_] >> ((en) ((daa) this).D).ae;
	}
	int i_60_ = 0;
	while (i_58_ > i_60_) {
	    int i_61_ = ft.v[i_60_];
	    int i_62_ = mv.h[i_60_++];
	    int i_63_ = ft.v[i_60_];
	    int i_64_ = mv.h[i_60_++];
	    int i_65_ = ft.v[i_60_];
	    int i_66_ = mv.h[i_60_++];
	    if ((i_64_ - i_66_) * (i_61_ - i_63_) - (i_65_ - i_63_) * (i_64_
								       - i_62_)
		> 0)
		var_ok.a(i_65_, -3417, i_62_, i_66_, i_61_, i_63_, i_64_);
	}
    }
    
    final void BA() {
	if (eb > 0) {
	    byte[][] is
		= new byte[((Class_i) this).k + 1][((Class_i) this).j + 1];
	    for (int i = 1; ((Class_i) this).k > i; i++) {
		for (int i_67_ = 1; ((Class_i) this).j > i_67_; i_67_++)
		    is[i][i_67_] = (byte) ((ib[i][i_67_ + 1] >> 3)
					   + ((ib[i - 1][i_67_] >> 2)
					      + (ib[i + 1][i_67_] >> 3)
					      + (ib[i][i_67_ - 1] >> 2))
					   + (ib[i][i_67_] >> 1));
	    }
	    bl[] var_bls = new bl[lb.a((byte) -26)];
	    lb.a(var_bls, (byte) -84);
	    for (int i = 0; i < var_bls.length; i++)
		var_bls[i].b(eb, 4);
	    int i = 20;
	    if (X != null)
		i += 4;
	    if ((0x7 & ((daa) this).N) != 0)
		i += 12;
	    jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer
		= ((en) ((daa) this).D).F.a(4 * eb, false);
	    jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_68_
		= ((en) ((daa) this).D).F.a(i * eb, false);
	    Stream stream = new Stream(nativeheapbuffer_68_);
	    Stream stream_69_ = new Stream(nativeheapbuffer);
	    bl[] var_bls_70_ = new bl[eb];
	    int i_71_ = ko.a((byte) 114, eb / 4);
	    if (i_71_ < 1)
		i_71_ = 1;
	    il var_il = new il(i_71_);
	    bl[] var_bls_72_ = new bl[gb];
	    for (int i_73_ = 0; ((Class_i) this).k > i_73_; i_73_++) {
		for (int i_74_ = 0; i_74_ < ((Class_i) this).j; i_74_++) {
		    if (((daa) this).R[i_73_][i_74_] != null) {
			bl[] var_bls_75_ = P[i_73_][i_74_];
			int[] is_76_ = ((daa) this).A[i_73_][i_74_];
			int[] is_77_ = ((daa) this).q[i_73_][i_74_];
			int[] is_78_ = y[i_73_][i_74_];
			int[] is_79_ = ((daa) this).R[i_73_][i_74_];
			int[] is_80_ = T != null ? T[i_73_][i_74_] : null;
			if (is_78_ == null)
			    is_78_ = is_79_;
			int[] is_81_ = X == null ? null : X[i_73_][i_74_];
			float f = mb[i_73_][i_74_];
			float f_82_ = hb[i_73_][i_74_];
			float f_83_ = fb[i_73_][i_74_];
			float f_84_ = mb[i_73_][i_74_ + 1];
			float f_85_ = hb[i_73_][i_74_ + 1];
			float f_86_ = fb[i_73_][i_74_ + 1];
			float f_87_ = mb[i_73_ + 1][i_74_ + 1];
			float f_88_ = hb[i_73_ + 1][i_74_ + 1];
			float f_89_ = fb[i_73_ + 1][i_74_ + 1];
			float f_90_ = mb[i_73_ + 1][i_74_];
			float f_91_ = hb[i_73_ + 1][i_74_];
			float f_92_ = fb[i_73_ + 1][i_74_];
			int i_93_ = is[i_73_][i_74_] & 0xff;
			int i_94_ = is[i_73_][i_74_ + 1] & 0xff;
			int i_95_ = 0xff & is[i_73_ + 1][i_74_ + 1];
			int i_96_ = is[i_73_ + 1][i_74_] & 0xff;
			int i_97_ = 0;
		    while_23_:
			for (int i_98_ = 0; is_79_.length > i_98_; i_98_++) {
			    bl var_bl = var_bls_75_[i_98_];
			    for (int i_99_ = 0; i_99_ < i_97_; i_99_++) {
				if (var_bl == var_bls_72_[i_99_])
				    continue while_23_;
			    }
			    var_bls_72_[i_97_++] = var_bl;
			}
			short[] is_100_
			    = (((daa) this).O[(i_73_
					       + i_74_ * ((Class_i) this).k)]
			       = new short[is_79_.length]);
			for (int i_101_ = 0; i_101_ < is_79_.length;
			     i_101_++) {
			    int i_102_ = ((i_73_ << ((Class_i) this).g)
					  + is_76_[i_101_]);
			    int i_103_ = ((i_74_ << ((Class_i) this).g)
					  + is_77_[i_101_]);
			    int i_104_ = i_102_ >> G;
			    int i_105_ = i_103_ >> G;
			    int i_106_ = is_79_[i_101_];
			    int i_107_ = is_78_[i_101_];
			    int i_108_ = is_80_ != null ? is_80_[i_101_] : 0;
			    long l
				= (long) i_105_ | ((long) (i_104_ << 16)
						   | ((long) i_107_ << 48
						      | (long) i_106_ << 32));
			    int i_109_ = is_76_[i_101_];
			    int i_110_ = is_77_[i_101_];
			    int i_111_ = 74;
			    int i_112_ = 0;
			    float f_113_ = 1.0F;
			    float f_114_;
			    float f_115_;
			    float f_116_;
			    if (i_109_ != 0 || i_110_ != 0) {
				if (i_109_ == 0
				    && ((Class_i) this).b == i_110_) {
				    i_111_ -= i_94_;
				    f_114_ = f_85_;
				    f_116_ = f_84_;
				    f_115_ = f_86_;
				} else if (i_109_ != ((Class_i) this).b
					   || i_110_ != ((Class_i) this).b) {
				    if (((Class_i) this).b != i_109_
					|| i_110_ != 0) {
					float f_117_
					    = ((float) i_109_
					       / (float) ((Class_i) this).b);
					float f_118_
					    = ((float) i_110_
					       / (float) ((Class_i) this).b);
					float f_119_
					    = f + (f_90_ - f) * f_117_;
					float f_120_
					    = f_117_ * (f_91_ - f_82_) + f_82_;
					float f_121_
					    = f_83_ + f_117_ * (f_92_ - f_83_);
					float f_122_
					    = f_84_ + (f_87_ - f_84_) * f_117_;
					float f_123_
					    = f_85_ + (f_88_ - f_85_) * f_117_;
					float f_124_
					    = f_117_ * (f_89_ - f_86_) + f_86_;
					f_114_ = f_120_ + f_118_ * (f_123_
								    - f_120_);
					f_116_ = ((f_122_ - f_119_) * f_118_
						  + f_119_);
					f_115_ = ((f_124_ - f_121_) * f_118_
						  + f_121_);
					int i_125_
					    = i_93_ + (i_109_ * (i_96_ - i_93_)
						       >> ((Class_i) this).g);
					int i_126_
					    = i_94_ + ((i_95_ - i_94_) * i_109_
						       >> ((Class_i) this).g);
					i_111_ -= (((i_126_ - i_125_) * i_110_
						    >> ((Class_i) this).g)
						   + i_125_);
				    } else {
					f_116_ = f_90_;
					i_111_ -= i_96_;
					f_115_ = f_92_;
					f_114_ = f_91_;
				    }
				} else {
				    f_116_ = f_87_;
				    f_115_ = f_89_;
				    i_111_ -= i_95_;
				    f_114_ = f_88_;
				}
			    } else {
				f_114_ = f_82_;
				f_115_ = f_83_;
				f_116_ = f;
				i_111_ -= i_93_;
			    }
			    if (i_106_ != -1) {
				int i_127_ = (0x7f & i_106_) * i_111_ >> 7;
				if (i_127_ < 2)
				    i_127_ = 2;
				else if (i_127_ > 126)
				    i_127_ = 126;
				if ((0x7 & ((daa) this).N) == 0) {
				    f_113_
					= (((en) ((daa) this).D).Of[2] * f_115_
					   + ((((en) ((daa) this).D).Of[0]
					       * f_116_)
					      + (((en) ((daa) this).D).Of[1]
						 * f_114_)));
				    f_113_ = ((f_113_
					       * (!(f_113_ > 0.0F)
						  ? ((en) ((daa) this).D).mf
						  : ((en) ((daa) this).D).Xe))
					      + ((en) ((daa) this).D).Nf);
				}
				i_112_ = ji.j[i_106_ & 0xff80 | i_127_];
			    }
			    Node class_d = null;
			    if ((i_102_ & V - 1) == 0 && (i_103_ & V - 1) == 0)
				class_d = var_il.a(-32748, l);
			    int i_128_;
			    if (class_d != null) {
				is_100_[i_101_] = ((lk) (lk) class_d).n;
				i_128_ = is_100_[i_101_] & 0xffff;
				if (i_106_ != -1
				    && (((Node) var_bls_75_[i_101_]).nodeID
					< ((Node) var_bls_70_[i_128_]).nodeID))
				    var_bls_70_[i_128_] = var_bls_75_[i_101_];
			    } else {
				int i_129_;
				if (i_106_ != i_107_) {
				    int i_130_ = (0x7f & i_107_) * i_111_ >> 7;
				    if (i_130_ < 2)
					i_130_ = 2;
				    else if (i_130_ > 126)
					i_130_ = 126;
				    i_129_ = ji.j[i_107_ & 0xff80 | i_130_];
				    if ((0x7 & ((daa) this).N) == 0) {
					float f_131_
					    = ((((en) ((daa) this).D).Of[1]
						* f_114_)
					       + (((en) ((daa) this).D).Of[0]
						  * f_116_)
					       + (((en) ((daa) this).D).Of[2]
						  * f_115_));
					f_131_ = (((f_113_ > 0.0F
						    ? ((en) ((daa) this).D).Xe
						    : ((en) ((daa) this).D).mf)
						   * f_113_)
						  + ((en) ((daa) this).D).Nf);
					int i_132_ = 0xff & i_129_ >> 16;
					int i_133_ = i_129_ >> 8 & 0xff;
					i_132_ *= f_131_;
					int i_134_ = 0xff & i_129_;
					i_133_ *= f_131_;
					if (i_132_ >= 0) {
					    if (i_132_ > 255)
						i_132_ = 255;
					} else
					    i_132_ = 0;
					i_134_ *= f_131_;
					if (i_133_ >= 0) {
					    if (i_133_ > 255)
						i_133_ = 255;
					} else
					    i_133_ = 0;
					if (i_134_ < 0)
					    i_134_ = 0;
					else if (i_134_ > 255)
					    i_134_ = 255;
					i_129_ = (i_132_ << 16 | i_133_ << 8
						  | i_134_);
				    }
				} else
				    i_129_ = i_112_;
				if (!Stream.a()) {
				    stream.b((float) i_102_);
				    stream.b((float) (this.a(i_103_, i_102_,
							     true)
						      + i_108_));
				    stream.b((float) i_103_);
				    stream.b((float) i_102_);
				    stream.b((float) i_103_);
				    if (X != null)
					stream.b((float) (is_81_ == null ? 0
							  : (is_81_[i_101_]
							     - 1)));
				    if ((((daa) this).N & 0x7) != 0) {
					stream.b(f_116_);
					stream.b(f_114_);
					stream.b(f_115_);
				    }
				} else {
				    stream.a((float) i_102_);
				    stream.a((float) (i_108_
						      + this.a(i_103_, i_102_,
							       true)));
				    stream.a((float) i_103_);
				    stream.a((float) i_102_);
				    stream.a((float) i_103_);
				    if (X != null)
					stream.a((float) (is_81_ == null ? 0
							  : (is_81_[i_101_]
							     - 1)));
				    if ((0x7 & ((daa) this).N) != 0) {
					stream.a(f_116_);
					stream.a(f_114_);
					stream.a(f_115_);
				    }
				}
				if (((en) ((daa) this).D).If == 0)
				    stream_69_.f(i_129_ | ~0xffffff);
				else
				    stream_69_.a(i_129_ | ~0xffffff);
				i_128_ = t++;
				is_100_[i_101_] = (short) i_128_;
				if ((i_106_ ^ 0xffffffff) != 0)
				    var_bls_70_[i_128_] = var_bls_75_[i_101_];
				var_il.a(new lk(is_100_[i_101_]), (byte) -82,
					 l);
			    }
			    for (int i_135_ = 0; i_97_ > i_135_; i_135_++)
				var_bls_72_[i_135_].a(i_112_, i_111_,
						      (byte) -110, f_113_,
						      i_128_);
			    K++;
			}
		    }
		}
	    }
	    for (int i_136_ = 0; t > i_136_; i_136_++) {
		bl var_bl = var_bls_70_[i_136_];
		if (var_bl != null)
		    var_bl.a((int) -118, i_136_);
	    }
	    for (int i_137_ = 0; i_137_ < ((Class_i) this).k; i_137_++) {
		for (int i_138_ = 0; ((Class_i) this).j > i_138_; i_138_++) {
		    short[] is_139_
			= ((daa) this).O[i_137_ + i_138_ * ((Class_i) this).k];
		    if (is_139_ != null) {
			int i_140_ = 0;
			int i_141_ = 0;
			while (i_141_ < is_139_.length) {
			    int i_142_ = 0xffff & is_139_[i_141_++];
			    int i_143_ = is_139_[i_141_++] & 0xffff;
			    int i_144_ = 0xffff & is_139_[i_141_++];
			    bl var_bl = var_bls_70_[i_142_];
			    bl var_bl_145_ = var_bls_70_[i_143_];
			    bl var_bl_146_ = var_bls_70_[i_144_];
			    bl var_bl_147_ = null;
			    if (var_bl != null) {
				var_bl_147_ = var_bl;
				var_bl.a(i_140_, i_138_, i_137_, true);
			    }
			    if (var_bl_145_ != null) {
				var_bl_145_.a(i_140_, i_138_, i_137_, true);
				if (var_bl_147_ == null
				    || (((Node) var_bl_145_).nodeID
					< ((Node) var_bl_147_).nodeID))
				    var_bl_147_ = var_bl_145_;
			    }
			    if (var_bl_146_ != null) {
				var_bl_146_.a(i_140_, i_138_, i_137_, true);
				if (var_bl_147_ == null
				    || (((Node) var_bl_147_).nodeID
					> ((Node) var_bl_146_).nodeID))
				    var_bl_147_ = var_bl_146_;
			    }
			    if (var_bl_147_ != null) {
				if (var_bl != null)
				    var_bl_147_.a((int) -127, i_142_);
				if (var_bl_145_ != null)
				    var_bl_147_.a((int) 72, i_143_);
				if (var_bl_146_ != null)
				    var_bl_147_.a((int) -120, i_144_);
				var_bl_147_.a(i_140_, i_138_, i_137_, true);
			    }
			    i_140_++;
			}
		    }
		}
	    }
	    stream.c();
	    stream_69_.c();
	    db = ((daa) this).D.a(false, false);
	    db.a(nativeheapbuffer, 4, 4 * t, (byte) 76);
	    bb = ((daa) this).D.a(false, false);
	    bb.a(nativeheapbuffer_68_, i, t * i, (byte) 79);
	    if ((0x7 & ((daa) this).N) == 0) {
		if (X == null)
		    ((daa) this).jb
			= ((daa) this).D.a((new eda[]
					    { new eda(new jv[] { jv.e, jv.n }),
					      new eda(jv.l) }),
					   true);
		else
		    ((daa) this).jb
			= ((daa) this).D.a((new eda[]
					    { new eda(new jv[] { jv.e, jv.n,
								 jv.m }),
					      new eda(jv.l) }),
					   true);
	    } else if (X != null)
		((daa) this).jb
		    = ((daa) this).D.a((new eda[]
					{ new eda(new jv[] { jv.e, jv.n, jv.m,
							     jv.k }),
					  new eda(jv.l) }),
				       true);
	    else
		((daa) this).jb
		    = ((daa) this).D.a(new eda[] { new eda(new jv[] { jv.e,
								      jv.n,
								      jv.k }),
						   new eda(jv.l) },
				       true);
	    int i_148_ = 0;
	    for (int i_149_ = 0; var_bls.length > i_149_; i_149_++) {
		if (((bl) var_bls[i_149_]).z > 0)
		    var_bls[i_148_++] = var_bls[i_149_];
	    }
	    kb = new bl[i_148_];
	    long[] ls = new long[i_148_];
	    for (int i_150_ = 0; i_150_ < i_148_; i_150_++) {
		bl var_bl = var_bls[i_150_];
		ls[i_150_] = ((Node) var_bl).nodeID;
		kb[i_150_] = var_bl;
		var_bl.a((byte) 22, t);
	    }
	    sc.a(ls, 0, kb);
	    if (w != null)
		w.a(128);
	} else
	    w = null;
	p++;
	lb = null;
	P = null;
	((daa) this).R = null;
	X = null;
	T = null;
	mb = hb = fb = null;
	((daa) this).A = ((daa) this).q = null;
	y = null;
	ib = null;
    }
    
    final void DA(ha var_ha, int i, int i_151_, int i_152_, int i_153_,
		  boolean bool) {
	F++;
	if (w != null && var_ha != null) {
	    int i_154_ = (i - (((en) ((daa) this).D).jf * i_151_ >> 8)
			  >> ((en) ((daa) this).D).ae);
	    int i_155_ = (i_152_ - (i_151_ * ((en) ((daa) this).D).Pe >> 8)
			  >> ((en) ((daa) this).D).ae);
	    w.b(var_ha, (byte) -123, i_155_, i_154_);
	}
    }
    
    final void a(int i, int i_156_, int i_157_, int i_158_, int i_159_,
		 int i_160_, int i_161_, boolean[][] bools) {
	u++;
	if (eb > 0) {
	    hh var_hh = ((daa) this).D.c((int) 48, K);
	    int i_162_ = 0;
	    int i_163_ = 32767;
	    int i_164_ = -32768;
	    for (int i_165_ = 0; i_165_ < 4; i_165_++) {
		i_162_ = 0;
		Buffer buffer = var_hh.a((byte) -88, true);
		if (buffer != null) {
		    Stream stream = ((daa) this).D.a(buffer, 116);
		    if (!Stream.a()) {
			for (int i_166_ = i_159_; i_161_ > i_166_; i_166_++) {
			    int i_167_ = ((Class_i) this).k * i_166_ + i_158_;
			    for (int i_168_ = i_158_; i_160_ > i_168_;
				 i_168_++) {
				if (bools[i_168_ - i_158_][i_166_ - i_159_]) {
				    short[] is = ((daa) this).O[i_167_];
				    if (is != null) {
					for (int i_169_ = 0;
					     i_169_ < is.length; i_169_++) {
					    int i_170_ = is[i_169_] & 0xffff;
					    if (i_163_ > i_170_)
						i_163_ = i_170_;
					    if (i_164_ < i_170_)
						i_164_ = i_170_;
					    i_162_++;
					    stream.e(i_170_);
					}
				    }
				}
				i_167_++;
			    }
			}
		    } else {
			for (int i_171_ = i_159_; i_171_ < i_161_; i_171_++) {
			    int i_172_ = ((Class_i) this).k * i_171_ + i_158_;
			    for (int i_173_ = i_158_; i_160_ > i_173_;
				 i_173_++) {
				if (bools[i_173_ - i_158_][i_171_ - i_159_]) {
				    short[] is = ((daa) this).O[i_172_];
				    if (is != null) {
					for (int i_174_ = 0;
					     is.length > i_174_; i_174_++) {
					    int i_175_ = is[i_174_] & 0xffff;
					    stream.c(i_175_);
					    i_162_++;
					    if (i_164_ < i_175_)
						i_164_ = i_175_;
					    if (i_163_ > i_175_)
						i_163_ = i_175_;
					}
				    }
				}
				i_172_++;
			    }
			}
		    }
		    stream.c();
		    if (var_hh.b((byte) 37))
			break;
		}
	    }
	    if (i_162_ > 0) {
		((daa) this).D.a((byte) 84);
		((daa) this).D.d(false, (int) -103);
		((daa) this).D.a(false, (int) 106);
		((daa) this).D.a((byte) 125, false);
		((daa) this).D.c(false, (byte) -25);
		((daa) this).D.a((byte) 28, (int) 0);
		((daa) this).D.a(0, -2, false, false);
		((daa) this).D.a((hfa) null, 0);
		mga var_mga = ((daa) this).D.Y(12083);
		float[] fs = ((daa) this).D.C(0);
		fs[15] = 1.0F;
		fs[0] = (float) i_157_ / ((float) ((en) ((daa) this).D).R
					  * ((float) ((Class_i) this).b
					     * 128.0F));
		fs[8] = 0.0F;
		fs[1] = 0.0F;
		fs[14] = -r / (U - r);
		fs[7] = 0.0F;
		fs[3] = 0.0F;
		fs[6] = 0.0F;
		fs[12]
		    = -(((float) (i_158_ * i_157_) / 128.0F - (float) (i * 2))
			/ (float) ((en) ((daa) this).D).R) - 1.0F;
		fs[9] = 0.0F;
		fs[5] = (float) i_157_ / ((float) ((Class_i) this).b * 128.0F
					  * (float) ((en) ((daa) this).D).sb);
		fs[2] = 0.0F;
		fs[10] = 1.0F / (U - r);
		fs[11] = 0.0F;
		fs[4] = 0.0F;
		fs[13] = -(((float) (i_156_ * 2)
			    + (float) (i_157_ * i_161_) / 128.0F)
			   / (float) ((en) ((daa) this).D).sb) + 1.0F;
		var_mga.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F,
			  false);
		((daa) this).D.w((int) 0);
		((daa) this).D.T(120);
		if ((0x7 & ((daa) this).N) != 0) {
		    ((daa) this).D.a(true, (int) 89);
		    ((daa) this).D.i(false);
		} else
		    ((daa) this).D.a(false, (int) 114);
		((daa) this).D.d(false, (byte) -69);
		((daa) this).D.a((byte) -16, bb, 0);
		((daa) this).D.a((byte) -16, db, 1);
		((daa) this).D.a(true, ((daa) this).jb);
		((daa) this).D.a(i_164_ + 1 - i_163_, mo.E, 0, 12896,
				 i_162_ / 3, i_163_, var_hh);
		((daa) this).D.d(true, (byte) -66);
	    }
	}
    }
    
    final void a(int i, int i_176_, int i_177_, boolean[][] bools,
		 boolean bool) {
	L++;
	a(0, i_176_, bool, i, -1, bools, i_177_);
    }
    
    final void a(gga var_gga, int[] is) {
	M++;
	s.b(new qca(((daa) this).D, this, var_gga, is), (byte) 93);
    }
    
    final ha v(int i, int i_178_, ha var_ha) {
	J++;
	if ((z[i][i_178_] & 0x1) == 0)
	    return null;
	int i_179_ = ((Class_i) this).b >> ((en) ((daa) this).D).ae;
	ok var_ok = (ok) var_ha;
	ok var_ok_180_;
	if (var_ok == null || !var_ok.a(i_179_, -52, i_179_))
	    var_ok_180_ = new ok(((daa) this).D, i_179_, i_179_);
	else {
	    var_ok_180_ = var_ok;
	    var_ok_180_.i(75);
	}
	var_ok_180_.a(i_179_, 0, 1831282672, 0, i_179_);
	a(i_178_, var_ok_180_, i, -125);
	return var_ok_180_;
    }
    
    daa(en var_en, int i, int i_181_, int i_182_, int i_183_, int[][] is,
	int[][] is_184_, int i_185_) {
	super(i_182_, i_183_, i_185_, is);
	s = new Class_ae();
	((daa) this).D = var_en;
	G = ((Class_i) this).g - 2;
	((daa) this).q = new int[i_182_][i_183_][];
	((daa) this).N = i_181_;
	V = 1 << G;
	P = new bl[i_182_][i_183_][];
	z = new byte[i_182_][i_183_];
	ib = new byte[i_182_ + 1][i_183_ + 1];
	((daa) this).O = new short[i_182_ * i_183_][];
	hb = new float[((Class_i) this).k + 1][((Class_i) this).j + 1];
	y = new int[i_182_][i_183_][];
	fb = new float[((Class_i) this).k + 1][((Class_i) this).j + 1];
	mb = new float[((Class_i) this).k + 1][((Class_i) this).j + 1];
	T = new int[i_182_][i_183_][];
	((daa) this).R = new int[i_182_][i_183_][];
	((daa) this).A = new int[i_182_][i_183_][];
	for (int i_186_ = 0; i_186_ <= ((Class_i) this).j; i_186_++) {
	    for (int i_187_ = 0; ((Class_i) this).k >= i_187_; i_187_++) {
		int i_188_ = ((Class_i) this).f[i_187_][i_186_];
		if (r > (float) i_188_)
		    r = (float) i_188_;
		if (U < (float) i_188_)
		    U = (float) i_188_;
		if (i_187_ > 0 && i_186_ > 0 && i_187_ < ((Class_i) this).k
		    && i_186_ < ((Class_i) this).j) {
		    int i_189_ = (is_184_[i_187_ + 1][i_186_]
				  - is_184_[i_187_ - 1][i_186_]);
		    int i_190_ = (is_184_[i_187_][i_186_ + 1]
				  - is_184_[i_187_][i_186_ - 1]);
		    float f
			= (float) (1.0
				   / Math.sqrt((double) (i_190_ * i_190_
							 + (i_185_ * (i_185_
								      * 4)
							    + (i_189_
							       * i_189_)))));
		    mb[i_187_][i_186_] = f * (float) i_189_;
		    hb[i_187_][i_186_] = f * (float) (2 * -i_185_);
		    fb[i_187_][i_186_] = f * (float) i_190_;
		}
	    }
	}
	U++;
	r--;
	lb = new il(128);
	if ((0x10 & ((daa) this).N) != 0)
	    w = new tea(((daa) this).D, this);
    }
    
    public static void b(int i) {
	if (i != 1)
	    Y = null;
	ab = null;
	incomingPacket25 = null;
	Y = null;
    }
    
    final void E(ha var_ha, int i, int i_191_, int i_192_, int i_193_,
		 boolean bool) {
	B++;
	if (w != null && var_ha != null) {
	    int i_194_ = (i - (((en) ((daa) this).D).jf * i_191_ >> 8)
			  >> ((en) ((daa) this).D).ae);
	    int i_195_ = (i_192_ - (((en) ((daa) this).D).Pe * i_191_ >> 8)
			  >> ((en) ((daa) this).D).ae);
	    w.a(false, i_194_, var_ha, i_195_);
	}
    }
    
    static final void a(Interface var_kp, Class_r class_r, int i, int i_196_,
			int i_197_) {
	Q++;
	ua var_ua = var_kp.a((byte) 125, class_r);
	if (var_ua != null) {
	    class_r.da(i_196_, i_197_, ((Interface) var_kp).minHScroll + i_196_,
		       i_197_ + ((Interface) var_kp).minVScroll);
	    int i_198_ = 68 % ((77 - i) / 47);
	    if (qaa.T == 2 || qaa.T == 5 || tl.e == null)
		class_r.FA(-16777216, var_ua, i_196_, i_197_);
	    else {
		int i_199_;
		int i_200_;
		int i_201_;
		int i_202_;
		if (ll.x == 4) {
		    i_200_ = 0x3fff & (int) -qw.n;
		    i_199_ = 4096;
		    i_201_ = fu.a;
		    i_202_ = qg.j;
		} else {
		    i_199_ = -(vd.N * 16) + 4096;
		    i_200_ = 0x3fff & pt.b + (int) -qw.n;
		    i_201_ = ((Animable) up.thisPlayer).locX;
		    i_202_ = ((Animable) up.thisPlayer).locY;
		}
		int i_203_ = -((Class_hc.e - 104) * 2) + 48 + i_201_ / 128;
		int i_204_
		    = -(2 * bw.v) + 208 + (-(i_202_ / 128) + 48) + 4 * bw.v;
		tl.e.a((float) ((Interface) var_kp).minHScroll / 2.0F + (float) i_196_,
		       (float) i_197_ + (float) ((Interface) var_kp).minVScroll / 2.0F,
		       (float) i_203_, (float) i_204_, i_199_, i_200_ << 2,
		       var_ua, i_196_, i_197_);
		for (GameInPacketHandler var_hda = (GameInPacketHandler) ok.x.a((int) 110); var_hda != null;
		     var_hda = (GameInPacketHandler) ok.x.b((byte) 25)) {
		    int i_205_ = ((GameInPacketHandler) var_hda).k;
		    int i_206_
			= ((0xffff641 & ((rn) ofa.I).f[i_205_]) >> 14) - bfa.thisPlayersRegionX;
		    int i_207_ = (((rn) ofa.I).f[i_205_] & 0x3fff) - BytesParser.thisPlayersRegionY;
		    int i_208_ = 4 * i_206_ + 2 - i_201_ / 128;
		    int i_209_ = 4 * i_207_ + 2 - i_202_ / 128;
		    GameText.a(-95, i_197_, var_ua, i_209_, var_kp, i_208_,
			 ((rn) ofa.I).b[i_205_], i_196_, class_r);
		}
		for (int i_210_ = 0; on.j > i_210_; i_210_++) {
		    int i_211_ = 4 * tm.x[i_210_] + 2 - i_201_ / 128;
		    int i_212_ = 4 * vg.E[i_210_] + 2 - i_202_ / 128;
		    ObjectDef var_bda = ul.k.getObjectDef((byte) 50, uh.d[i_210_]);
		    if (((ObjectDef) var_bda).xb != null) {
			var_bda = var_bda.a(cp.e, -1643);
			if (var_bda == null || ((ObjectDef) var_bda).R == -1)
			    continue;
		    }
		    GameText.a(-99, i_197_, var_ua, i_212_, var_kp, i_211_,
			 ((ObjectDef) var_bda).R, i_196_, class_r);
		}
		for (sba var_sba = (sba) jt.a.b((byte) 124); var_sba != null;
		     var_sba = (sba) jt.a.b(12561)) {
		    int i_213_ = (int) (0x3L & ((Node) var_sba).nodeID >> 28);
		    if (i_213_ == dg.Cb) {
			int i_214_
			    = (int) (((Node) var_sba).nodeID & 0x3fffL) - bfa.thisPlayersRegionX;
			int i_215_
			    = ((int) (0x3fffL & ((Node) var_sba).nodeID >> 14)
			       - BytesParser.thisPlayersRegionY);
			int i_216_ = i_214_ * 4 - i_201_ / 128 + 2;
			int i_217_ = 4 * i_215_ - i_202_ / 128 + 2;
			Class_kb.a(i_197_, i_217_, i_216_, var_kp, lh.k[0],
				   i_196_, (byte) -71, var_ua);
		    }
		}
		for (int i_218_ = 0; ps.npcCount > i_218_; i_218_++) {
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[i_218_]);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			if (class_ac.m(109)
			    && ((Animable) class_ac).height == ((Animable) up.thisPlayer).height) {
			    NPCDef var_du = ((NPC) class_ac).npcDef;
			    if (var_du != null && ((NPCDef) var_du).L != null)
				var_du = var_du.a(-4261, cp.e);
			    if (var_du != null && ((NPCDef) var_du).ob
				&& ((NPCDef) var_du).m) {
				int i_219_
				    = ((Animable) class_ac).locX / 128 - i_201_ / 128;
				int i_220_
				    = ((Animable) class_ac).locY / 128 - i_202_ / 128;
				if (((NPCDef) var_du).z == -1)
				    Class_kb.a(i_197_, i_220_, i_219_, var_kp,
					       lh.k[1], i_196_, (byte) 85,
					       var_ua);
				else
				    GameText.a(-17, i_197_, var_ua, i_220_, var_kp,
					 i_219_, ((NPCDef) var_du).z, i_196_,
					 class_r);
			    }
			}
		    }
		}
		int i_221_ = oca.inScreenPlayers;
		int[] is = vd.inScreenPlayerIDs;
		for (int i_222_ = 0; i_221_ > i_222_; i_222_++) {
		    Player var_qi = Class_fc.playersInScreen[is[i_222_]];
		    if (var_qi != null && var_qi.l(97) && var_qi != up.thisPlayer
			&& ((Animable) up.thisPlayer).height == ((Animable) var_qi).height) {
			int i_223_ = ((Animable) var_qi).locX / 128 - i_201_ / 128;
			int i_224_ = ((Animable) var_qi).locY / 128 - i_202_ / 128;
			boolean bool = false;
			for (int i_225_ = 0; rba.l > i_225_; i_225_++) {
			    if (((Player) var_qi).displayName.equals(lfa.f[i_225_])
				&& dt.Jb[i_225_] != 0) {
				bool = true;
				break;
			    }
			}
			boolean bool_226_ = false;
			for (int i_227_ = 0; i_227_ < wj.clanChatPlayerCount; i_227_++) {
			    if (((Player) var_qi).displayName
				    .equals(((iaa) n.j[i_227_]).h)) {
				bool_226_ = true;
				break;
			    }
			}
			boolean bool_228_ = false;
			if (((Player) up.thisPlayer).Gd != 0 && ((Player) var_qi).Gd != 0
			    && ((Player) var_qi).Gd == ((Player) up.thisPlayer).Gd)
			    bool_228_ = true;
			if (!((Player) var_qi).cd) {
			    if (!bool) {
				if (bool_226_)
				    Class_kb.a(i_197_, i_224_, i_223_, var_kp,
					       lh.k[5], i_196_, (byte) -95,
					       var_ua);
				else if (bool_228_)
				    Class_kb.a(i_197_, i_224_, i_223_, var_kp,
					       lh.k[4], i_196_, (byte) -128,
					       var_ua);
				else
				    Class_kb.a(i_197_, i_224_, i_223_, var_kp,
					       lh.k[2], i_196_, (byte) 106,
					       var_ua);
			    } else
				Class_kb.a(i_197_, i_224_, i_223_, var_kp,
					   lh.k[3], i_196_, (byte) 89, var_ua);
			} else
			    Class_kb.a(i_197_, i_224_, i_223_, var_kp, lh.k[6],
				       i_196_, (byte) -90, var_ua);
		    }
		}
		on[] var_ons = Class_fb.j;
		for (int i_229_ = 0; i_229_ < var_ons.length; i_229_++) {
		    on var_on = var_ons[i_229_];
		    if (var_on != null && ((on) var_on).a != 0
			&& pm.currentTimedTicks % 20 < 10) {
			if (((on) var_on).a == 1) {
			    NPCNode var_mi
				= (NPCNode) uo.a.a(-32748, (long) ((on) var_on).e);
			    if (var_mi != null) {
				NPC class_ac = ((NPCNode) var_mi).l;
				int i_230_
				    = ((Animable) class_ac).locX / 128 - i_201_ / 128;
				int i_231_
				    = ((Animable) class_ac).locY / 128 - i_202_ / 128;
				pt.a(i_230_, var_kp, ((on) var_on).b,
				     (byte) -113, i_196_, var_ua, i_231_,
				     360000L, i_197_);
			    }
			}
			if (((on) var_on).a == 2) {
			    int i_232_ = ((on) var_on).n / 128 - i_201_ / 128;
			    int i_233_ = ((on) var_on).i / 128 - i_202_ / 128;
			    long l = (long) (((on) var_on).f << 7);
			    l *= l;
			    pt.a(i_232_, var_kp, ((on) var_on).b, (byte) -113,
				 i_196_, var_ua, i_233_, l, i_197_);
			}
			if (((on) var_on).a == 10 && ((on) var_on).e >= 0
			    && Class_fc.playersInScreen.length > ((on) var_on).e) {
			    Player var_qi = Class_fc.playersInScreen[((on) var_on).e];
			    if (var_qi != null) {
				int i_234_
				    = ((Animable) var_qi).locX / 128 - i_201_ / 128;
				int i_235_
				    = ((Animable) var_qi).locY / 128 - i_202_ / 128;
				pt.a(i_234_, var_kp, ((on) var_on).b,
				     (byte) -113, i_196_, var_ua, i_235_,
				     360000L, i_197_);
			    }
			}
		    }
		}
		if (ll.x != 4) {
		    if (bca.c != 0) {
			int i_236_ = (-(i_201_ / 128) + 2
				      + (4 * bca.c + (2 * up.thisPlayer.i(-1) - 2)));
			int i_237_ = 4 * uaa.h + 2 * up.thisPlayer.i(-1) - i_202_ / 128;
			Class_kb.a(i_197_, i_237_, i_236_, var_kp,
				   qfa.a[po.d ? 1 : 0], i_196_, (byte) 108,
				   var_ua);
		    }
		    class_r.f(-1, i_196_ + ((Interface) var_kp).minHScroll / 2 - 1,
			      i_197_ + ((Interface) var_kp).minVScroll / 2 - 1, 1, 3, 3);
		}
	    }
	}
    }
    
    final void O(int i, int i_238_, int[] is, int[] is_239_, int[] is_240_,
		 int[] is_241_, int[] is_242_, int[] is_243_, int[] is_244_,
		 int[] is_245_, int i_246_, int i_247_, int i_248_,
		 boolean bool) {
	m++;
	if (is_241_ != null && X == null)
	    X = new int[((Class_i) this).k][((Class_i) this).j][];
	if (is_239_ != null && T == null)
	    T = new int[((Class_i) this).k][((Class_i) this).j][];
	((daa) this).A[i][i_238_] = is;
	((daa) this).q[i][i_238_] = is_240_;
	((daa) this).R[i][i_238_] = is_242_;
	y[i][i_238_] = is_243_;
	if (X != null)
	    X[i][i_238_] = is_241_;
	if (T != null)
	    T[i][i_238_] = is_239_;
	bl[] var_bls = P[i][i_238_] = new bl[is_242_.length];
	for (int i_249_ = 0; is_242_.length > i_249_; i_249_++) {
	    long l
		= ((long) i_246_ << 28
		   | ((long) i_247_ << 42 | (long) i_248_ << 48)
		   | (long) (is_245_[i_249_] << 14) | (long) is_244_[i_249_]);
	    Node class_d;
	    for (class_d = lb.a(-32748, l); class_d != null;
		 class_d = lb.c((byte) 103)) {
		bl var_bl = (bl) class_d;
		if (((bl) var_bl).n == is_244_[i_249_]
		    && (float) is_245_[i_249_] == ((bl) var_bl).F
		    && ((bl) var_bl).A == i_246_ && i_247_ == ((bl) var_bl).D
		    && ((bl) var_bl).t == i_248_)
		    break;
	    }
	    if (class_d != null)
		var_bls[i_249_] = (bl) class_d;
	    else {
		var_bls[i_249_]
		    = new bl(this, is_244_[i_249_], is_245_[i_249_], i_246_,
			     i_247_, i_248_);
		lb.a(var_bls[i_249_], (byte) -78, l);
	    }
	}
	if (bool)
	    z[i][i_238_] = (byte) hba.bitwiseArg1ORArg2(z[i][i_238_], 1);
	if (gb < is_242_.length)
	    gb = is_242_.length;
	eb += is_242_.length;
    }
    
    final void a(int i, int i_250_, int i_251_) {
	if ((ib[i][i_250_] & 0xff) < i_251_)
	    ib[i][i_250_] = (byte) i_251_;
	C++;
    }
}
