/* kca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class kca
{
    static aw a;
    private static jf b;
    static eaa c;
    private static cp d;
    static sj e;
    static ek f;
    private static il g = new il(16);
    static haa h;
    static pl i;
    static int j;
    static int k;
    static int l = (int) (Math.random() * 11.0) - 5;
    static float m;
    static Class_ae n;
    static float o;
    private static byte[] p = new byte[1];
    private static short[] q = new short[1];
    static rn r;
    static byte[][][] s;
    static int t;
    private static byte[] u;
    private static int[] v;
    private static fca[][][] w;
    static int x;
    static int y;
    static int z;
    private static byte[] A;
    static int B;
    private static byte[] C;
    static int D;
    static int E;
    static int F;
    private static short[] G;
    private static il H;
    private static byte[] I;
    static int J;
    private static short[] K;
    static int L;
    static int M;
    static int N;
    private static byte[] O;
    
    static final void a(fa var_fa, int i, int i_0_) {
	for (int i_1_ = 0; i_1_ < ((cp) d).d; i_1_++)
	    v[i_1_ + 1] = a(var_fa, i_1_, i, i_0_);
    }
    
    private static final Class_ae a(Class_r class_r, int i, int i_2_, int i_3_,
				    int i_4_) {
	for (Class_vb class_vb = (Class_vb) n.a((int) 103); class_vb != null;
	     class_vb = (Class_vb) n.b((byte) 59))
	    a(class_r, class_vb, i, i_2_, i_3_, i_4_);
	return n;
    }
    
    static final eaa a(int i) {
	return (eaa) g.a(-32748, (long) i);
    }
    
    private static final int a(fa var_fa, int i, int i_5_, int i_6_) {
	ng var_ng = d.a(i, (byte) 19);
	if (var_ng == null)
	    return 0;
	int i_7_ = ((ng) var_ng).q;
	if (i_7_ >= 0 && ((vca) var_fa.a(i_7_, (byte) 86)).u)
	    i_7_ = -1;
	int i_8_;
	if (((ng) var_ng).j >= 0) {
	    int i_9_ = ((ng) var_ng).j;
	    int i_10_ = (i_9_ & 0x7f) + i_6_;
	    if (i_10_ < 0)
		i_10_ = 0;
	    else if (i_10_ > 127)
		i_10_ = 127;
	    int i_11_ = (i_9_ + i_5_ & 0xfc00) + (i_9_ & 0x380) + i_10_;
	    i_8_ = (~0xffffff
		    | vq.m[pg.a(0, tf.a(96, i_11_, (byte) -10)) & 0xffff]);
	} else if (i_7_ >= 0)
	    i_8_
		= (~0xffffff
		   | vq.m[pg.a(0, tf.a(96, ((vca) var_fa.a(i_7_, (byte) 86)).v,
				       (byte) -10)) & 0xffff]);
	else if (((ng) var_ng).d == -1)
	    i_8_ = 0;
	else {
	    int i_12_ = ((ng) var_ng).d;
	    int i_13_ = (i_12_ & 0x7f) + i_6_;
	    if (i_13_ < 0)
		i_13_ = 0;
	    else if (i_13_ > 127)
		i_13_ = 127;
	    int i_14_ = (i_12_ + i_5_ & 0xfc00) + (i_12_ & 0x380) + i_13_;
	    i_8_ = (~0xffffff
		    | vq.m[pg.a(0, tf.a(96, i_14_, (byte) -10)) & 0xffff]);
	}
	return i_8_;
    }
    
    static final void a(Class_r class_r, int i, int i_15_) {
	BytesParser var_es = new BytesParser(kca.i.a(90, ((eaa) c).I, "area"));
	int i_16_ = var_es.readUnsignedByte(-9268);
	int[] is = new int[i_16_];
	for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
	    is[i_17_] = var_es.readUnsignedByte(-9268);
	int i_18_ = var_es.readUnsignedByte(-9268);
	int[] is_19_ = new int[i_18_];
	for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
	    is_19_[i_20_] = var_es.readUnsignedByte(-9268);
	while (((BytesParser) var_es).pos < ((BytesParser) var_es).bytes.length) {
	    if (var_es.readUnsignedByte(-9268) == 0) {
		int i_21_ = var_es.readUnsignedByte(-9268);
		int i_22_ = var_es.readUnsignedByte(-9268);
		for (int i_23_ = 0; i_23_ < 64; i_23_++) {
		    for (int i_24_ = 0; i_24_ < 64; i_24_++) {
			int i_25_ = i_21_ * 64 + i_23_ - F;
			int i_26_ = i_22_ * 64 + i_24_ - E;
			a(class_r, var_es, i_21_, i_22_, i_25_, i_26_, is,
			  is_19_);
		    }
		}
	    } else {
		int i_27_ = var_es.readUnsignedByte(-9268);
		int i_28_ = var_es.readUnsignedByte(-9268);
		int i_29_ = var_es.readUnsignedByte(-9268);
		int i_30_ = var_es.readUnsignedByte(-9268);
		for (int i_31_ = 0; i_31_ < 8; i_31_++) {
		    for (int i_32_ = 0; i_32_ < 8; i_32_++) {
			int i_33_ = i_27_ * 64 + i_29_ * 8 + i_31_ - F;
			int i_34_ = i_28_ * 64 + i_30_ * 8 + i_32_ - E;
			a(class_r, var_es, i_27_, i_28_, i_33_, i_34_, is,
			  is_19_);
		    }
		}
	    }
	}
	Object object = null;
	u = new byte[z * N];
	G = new short[z * N];
	for (int i_35_ = 0; i_35_ < 3; i_35_++) {
	    byte[] is_36_ = new byte[z * N];
	    for (int i_37_ = 0; i_37_ < w[i_35_].length; i_37_++) {
		for (int i_38_ = 0; i_38_ < w[i_35_][0].length; i_38_++) {
		    fca var_fca = w[i_35_][i_37_][i_38_];
		    if (var_fca != null) {
			for (we var_we = (we) var_fca.b((byte) 112);
			     var_we != null;
			     var_we = (we) var_fca.a((byte) -106))
			    is_36_[(i_37_ * 64 + ((we) var_we).j
				    + (i_38_ * 64 + ((we) var_we).l) * z)]
				= (byte) ((we) var_we).h;
		    }
		}
	    }
	    a(is_36_, u, G, i, i_15_);
	    for (int i_39_ = 0; i_39_ < w[i_35_].length; i_39_++) {
		for (int i_40_ = 0; i_40_ < w[i_35_][0].length; i_40_++) {
		    fca var_fca = w[i_35_][i_39_][i_40_];
		    if (var_fca != null) {
			for (we var_we = (we) var_fca.b((byte) 72);
			     var_we != null;
			     var_we = (we) var_fca.a((byte) -106)) {
			    int i_41_ = (i_39_ * 64 + ((we) var_we).j
					 + (i_40_ * 64 + ((we) var_we).l) * z);
			    ((we) var_we).h
				= (u[i_41_] & 0xff) << 16 | G[i_41_] & 0xffff;
			    if (((we) var_we).h != 0)
				((we) var_we).h |= ~0xffffff;
			}
		    }
		}
	    }
	}
	a(A, u, G, i, i_15_);
	A = null;
	c();
    }
    
    static final void a(Class_r class_r) {
	int i = t - M;
	int i_42_ = D - L;
	int i_43_ = (x - B << 16) / i;
	int i_44_ = (J - y << 16) / i_42_;
	b(class_r, i_43_, i_44_, 0, 0);
    }
    
    static final void a() {
	A = null;
	u = null;
	G = null;
	I = null;
	O = null;
	K = null;
	C = null;
	H = null;
	w = null;
	v = null;
    }
    
    private static final void a(Class_r class_r, Class_vb class_vb, int i,
				int i_45_, int i_46_, int i_47_) {
	((Class_vb) class_vb).p
	    = B + (i_46_ + i * (((Class_vb) class_vb).m - M) >> 16);
	((Class_vb) class_vb).k
	    = J - (i_47_ + i_45_ * (((Class_vb) class_vb).n - L) >> 16);
    }
    
    static final je a(int i, int i_48_) {
	je var_je = new je();
	for (eaa var_eaa = (eaa) g.b((byte) 124); var_eaa != null;
	     var_eaa = (eaa) g.b(12561)) {
	    if (((eaa) var_eaa).x && var_eaa.a(13543, i_48_, i))
		var_je.a((int) 75, var_eaa);
	}
	return var_je;
    }
    
    private static final void b(Class_r class_r, int i, int i_49_, int i_50_,
				int i_51_) {
	int i_52_ = t - M;
	int i_53_ = D - L;
	if (t < z)
	    i_52_++;
	if (D < N)
	    i_53_++;
	for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
	    int i_55_ = (i_50_ + i * i_54_ >> 16) + B;
	    int i_56_ = (i_50_ + i * (i_54_ + 1) >> 16) + B;
	    int i_57_ = i_56_ - i_55_;
	    if (i_57_ > 0) {
		int i_58_ = M + i_54_;
		if (i_58_ < 0 || i_58_ >= z) {
		    for (int i_59_ = 0; i_59_ < i_53_; i_59_++) {
			int i_60_ = J - (i_51_ + i_49_ * (i_59_ + 1) >> 16);
			int i_61_ = J - (i_51_ + i_49_ * i_59_ >> 16);
			int i_62_ = i_61_ - i_60_;
			int i_63_;
			if (((eaa) c).v != -1)
			    i_63_ = ~0xffffff | ((eaa) c).v;
			else if ((i_54_ + M & 0x4) != (i_59_ + D & 0x4))
			    i_63_ = -11840664;
			else
			    i_63_ = v[((cp) d).l + 1];
			if (i_63_ == 0)
			    i_63_ = -16777216;
			class_r.J(i_55_, i_60_, i_57_, i_62_, i_63_, 0);
		    }
		} else {
		    for (int i_64_ = 0; i_64_ < i_53_; i_64_++) {
			int i_65_ = J - (i_51_ + i_49_ * (i_64_ + 1) >> 16);
			int i_66_ = J - (i_51_ + i_49_ * i_64_ >> 16);
			int i_67_ = i_66_ - i_65_;
			if (i_67_ > 0) {
			    int i_68_ = i_64_ + L;
			    int i_69_ = i_58_ + i_68_ * z;
			    int i_70_ = 0;
			    int i_71_ = 0;
			    int i_72_ = 0;
			    if (i_68_ >= 0 && i_68_ < N) {
				i_70_ = ((u[i_69_] & 0xff) << 16
					 | G[i_69_] & 0xffff);
				if (i_70_ != 0)
				    i_70_ |= ~0xffffff;
				i_71_ = I[i_69_] & 0xff;
				i_72_ = K[i_69_] & 0xffff;
			    }
			    if (i_70_ == 0 && i_71_ == 0 && i_72_ == 0) {
				if (((eaa) c).v != -1)
				    i_70_ = ~0xffffff | ((eaa) c).v;
				else if ((i_54_ + M & 0x4)
					 != (i_64_ + D & 0x4))
				    i_70_ = -11840664;
				else
				    i_70_ = v[((cp) d).l + 1];
				if (i_70_ == 0)
				    i_70_ = -16777216;
				class_r.J(i_55_, i_65_, i_57_, i_67_, i_70_,
					  0);
			    } else if (i_72_ > 0) {
				if (i_72_ == 65535) {
				    so var_so
					= (so) H.a(-32748, (long) (i_58_ << 16
								   | i_68_));
				    if (var_so != null)
					a(class_r, i_55_, i_65_, i_57_, i_67_,
					  i_70_, i_71_, O[i_69_],
					  ((so) var_so).l, ((so) var_so).k,
					  true);
				} else {
				    q[0] = (short) (i_72_ - 1);
				    p[0] = C[i_69_];
				    a(class_r, i_55_, i_65_, i_57_, i_67_,
				      i_70_, i_71_, O[i_69_], q, p, true);
				}
			    } else
				a(class_r, i_55_, i_65_, i_57_, i_67_, i_70_,
				  i_71_, O[i_69_], null, null, true);
			}
		    }
		}
	    }
	}
	for (int i_73_ = -16; i_73_ < i_52_ + 16; i_73_++) {
	    int i_74_ = (i_50_ + i * i_73_ >> 16) + B;
	    int i_75_ = (i_50_ + i * (i_73_ + 1) >> 16) + B;
	    int i_76_ = i_75_ - i_74_;
	    if (i_76_ > 0) {
		int i_77_ = i_73_ + M;
		if (i_77_ >= 0 && i_77_ < z) {
		    for (int i_78_ = -16; i_78_ < i_53_ + 16; i_78_++) {
			int i_79_ = J - (i_51_ + i_49_ * (i_78_ + 1) >> 16);
			int i_80_ = J - (i_51_ + i_49_ * i_78_ >> 16);
			int i_81_ = i_80_ - i_79_;
			if (i_81_ > 0) {
			    int i_82_ = i_78_ + L;
			    if (i_82_ >= 0 && i_82_ < N) {
				int i_83_ = K[i_77_ + i_82_ * z] & 0xffff;
				if (i_83_ > 0) {
				    if (i_83_ == 65535) {
					so var_so
					    = ((so)
					       H.a(-32748, (long) (i_77_ << 16
								   | i_82_)));
					if (var_so != null)
					    a(class_r, i_74_, i_79_, i_76_,
					      i_81_, ((so) var_so).l,
					      ((so) var_so).k);
				    } else {
					q[0] = (short) (i_83_ - 1);
					p[0] = C[i_77_ + i_82_ * z];
					a(class_r, i_74_, i_79_, i_76_, i_81_,
					  q, p);
				    }
				} else
				    a(class_r, i_74_, i_79_, i_76_, i_81_,
				      null, null);
			    }
			}
		    }
		}
	    }
	}
	int i_84_ = M >> 6;
	int i_85_ = L >> 6;
	if (i_84_ < 0)
	    i_84_ = 0;
	if (i_85_ < 0)
	    i_85_ = 0;
	int i_86_ = t >> 6;
	int i_87_ = D >> 6;
	if (i_86_ >= w[0].length)
	    i_86_ = w[0].length - 1;
	if (i_87_ >= w[0][0].length)
	    i_87_ = w[0][0].length - 1;
	for (int i_88_ = 0; i_88_ < 3; i_88_++) {
	    for (int i_89_ = i_84_; i_89_ <= i_86_; i_89_++) {
		for (int i_90_ = i_85_; i_90_ <= i_87_; i_90_++) {
		    fca var_fca = w[i_88_][i_89_][i_90_];
		    if (var_fca != null) {
			int i_91_ = (i_89_ + (F >> 6)) * 64;
			int i_92_ = (i_90_ + (E >> 6)) * 64;
			for (we var_we = (we) var_fca.b((byte) 105);
			     var_we != null;
			     var_we = (we) var_fca.a((byte) -106)) {
			    int i_93_ = i_91_ + ((we) var_we).j - F - M;
			    int i_94_ = i_92_ + ((we) var_we).l - E - L;
			    int i_95_ = (i_50_ + i * i_93_ >> 16) + B;
			    int i_96_ = (i_50_ + i * (i_93_ + 1) >> 16) + B;
			    int i_97_
				= J - (i_51_ + i_49_ * (i_94_ + 1) >> 16);
			    int i_98_ = J - (i_51_ + i_49_ * i_94_ >> 16);
			    a(class_r, i_95_, i_97_, i_96_ - i_95_,
			      i_98_ - i_97_, ((we) var_we).h,
			      ((we) var_we).m & 0xff, ((we) var_we).k,
			      ((we) var_we).g, ((we) var_we).i, false);
			}
		    }
		}
	    }
	    for (int i_99_ = i_84_; i_99_ <= i_86_; i_99_++) {
		for (int i_100_ = i_85_; i_100_ <= i_87_; i_100_++) {
		    fca var_fca = w[i_88_][i_99_][i_100_];
		    if (var_fca != null) {
			int i_101_ = (i_99_ + (F >> 6)) * 64;
			int i_102_ = (i_100_ + (E >> 6)) * 64;
			for (we var_we = (we) var_fca.b((byte) 71);
			     var_we != null;
			     var_we = (we) var_fca.a((byte) -106)) {
			    int i_103_ = i_101_ + ((we) var_we).j - F - M;
			    int i_104_ = i_102_ + ((we) var_we).l - E - L;
			    int i_105_ = (i_50_ + i * i_103_ >> 16) + B;
			    int i_106_ = (i_50_ + i * (i_103_ + 1) >> 16) + B;
			    int i_107_
				= J - (i_51_ + i_49_ * (i_104_ + 1) >> 16);
			    int i_108_ = J - (i_51_ + i_49_ * i_104_ >> 16);
			    a(class_r, i_105_, i_107_, i_106_ - i_105_,
			      i_108_ - i_107_, ((we) var_we).g,
			      ((we) var_we).i);
			}
		    }
		}
	    }
	}
    }
    
    private static final void a(Class_r class_r, int i, int i_109_, int i_110_,
				int i_111_, int i_112_, int i_113_, int i_114_,
				short[] is, byte[] is_115_, boolean bool) {
	if (bool || i_112_ != 0 || i_113_ > 0) {
	    if (i_113_ == 0)
		class_r.J(i, i_109_, i_110_, i_111_, i_112_, 0);
	    else {
		int i_116_ = i_114_ & 0x3f;
		if (i_116_ == 0 || i_110_ <= 1 || i_111_ <= 1) {
		    int i_117_ = v[i_113_];
		    if (bool || i_117_ != 0)
			class_r.J(i, i_109_, i_110_, i_111_, i_117_, 0);
		} else {
		    int i_118_ = bool ? 0 : 1;
		    op.a(i, i_109_, i_111_, i_114_ >> 6 & 0x3, v[i_113_],
			 i_118_, i_110_, class_r, i_112_, j, s, i_116_, 41);
		}
	    }
	}
	if (is != null) {
	    int i_119_;
	    if (i_110_ == 1)
		i_119_ = i;
	    else
		i_119_ = i + i_110_ - 1;
	    int i_120_;
	    if (i_111_ == 1)
		i_120_ = i_109_;
	    else
		i_120_ = i_109_ + i_111_ - 1;
	    for (int i_121_ = 0; i_121_ < is.length; i_121_++) {
		int i_122_ = is_115_[i_121_] & 0x3f;
		if (i_122_ == 0 || i_122_ == 2 || i_122_ == 3 || i_122_ == 9) {
		    ObjectDef var_bda = f.getObjectDef((byte) 33, is[i_121_] & 0xffff);
		    if (((ObjectDef) var_bda).u == -1) {
			int i_123_ = -3355444;
			if (((ObjectDef) var_bda).jb == 1)
			    i_123_ = -3407872;
			int i_124_ = is_115_[i_121_] >> 6 & 0x3;
			if (i_122_ == 0) {
			    if (i_124_ == 0)
				class_r.m(i, i_109_, i_111_, i_123_, 0);
			    else if (i_124_ == 1)
				class_r.XA(i, i_109_, i_110_, i_123_, 0);
			    else if (i_124_ == 2)
				class_r.m(i_119_, i_109_, i_111_, i_123_, 0);
			    else
				class_r.XA(i, i_120_, i_110_, i_123_, 0);
			} else if (i_122_ == 2) {
			    if (i_124_ == 0) {
				class_r.m(i, i_109_, i_111_, -1, 0);
				class_r.XA(i, i_109_, i_110_, i_123_, 0);
			    } else if (i_124_ == 1) {
				class_r.m(i_119_, i_109_, i_111_, -1, 0);
				class_r.XA(i, i_109_, i_110_, i_123_, 0);
			    } else if (i_124_ == 2) {
				class_r.m(i_119_, i_109_, i_111_, -1, 0);
				class_r.XA(i, i_120_, i_110_, i_123_, 0);
			    } else {
				class_r.m(i, i_109_, i_111_, -1, 0);
				class_r.XA(i, i_120_, i_110_, i_123_, 0);
			    }
			} else if (i_122_ == 3) {
			    if (i_124_ == 0)
				class_r.XA(i, i_109_, 1, i_123_, 0);
			    else if (i_124_ == 1)
				class_r.XA(i_119_, i_109_, 1, i_123_, 0);
			    else if (i_124_ == 2)
				class_r.XA(i_119_, i_120_, 1, i_123_, 0);
			    else
				class_r.XA(i, i_120_, 1, i_123_, 0);
			} else if (i_122_ == 9) {
			    if (i_124_ == 0 || i_124_ == 2) {
				for (int i_125_ = 0; i_125_ < i_111_; i_125_++)
				    class_r.XA(i + i_125_, i_120_ - i_125_, 1,
					       i_123_, 0);
			    } else {
				for (int i_126_ = 0; i_126_ < i_111_; i_126_++)
				    class_r.XA(i + i_126_, i_109_ + i_126_, 1,
					       i_123_, 0);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void a(pl var_pl, cp var_cp, jf var_jf, ek var_ek, aw var_aw,
			sj var_sj, haa var_haa) {
	kca.i = var_pl;
	d = var_cp;
	b = var_jf;
	f = var_ek;
	a = var_aw;
	e = var_sj;
	h = var_haa;
	g.a(true);
	int i = kca.i.a("details", (int) -85);
	int[] is = kca.i.c(i, -118);
	if (is != null) {
	    for (int i_127_ = 0; i_127_ < is.length; i_127_++) {
		eaa var_eaa = ek.a(kca.i, i, (byte) -96, is[i_127_]);
		g.a(var_eaa, (byte) -70, (long) ((eaa) var_eaa).t);
	    }
	}
	gda.a(true, false, (byte) 88);
    }
    
    static final void b() {
	int[] is = new int[3];
	for (int i = 0; i < ((rn) r).a; i++) {
	    boolean bool
		= c.a(((rn) r).f[i] >> 14 & 0x3fff, ((rn) r).f[i] & 0x3fff, is,
		      255, ((rn) r).f[i] >> 28 & 0x3);
	    if (bool) {
		Class_vb class_vb = new Class_vb(((rn) r).b[i]);
		((Class_vb) class_vb).m = is[1] - F;
		((Class_vb) class_vb).n = is[2] - E;
		n.b(class_vb, (byte) 93);
	    }
	}
    }
    
    static final void b(int i) {
	c = (eaa) g.a(-32748, (long) i);
    }
    
    private static final void a(Class_r class_r, BytesParser var_es, int i, int i_128_,
				int i_129_, int i_130_, int[] is,
				int[] is_131_) {
	int i_132_ = var_es.readUnsignedByte(-9268);
	if ((i_132_ & 0x1) == 0) {
	    boolean bool = (i_132_ & 0x2) == 0;
	    int i_133_ = i_132_ >> 2 & 0x3f;
	    if (i_133_ != 62) {
		if (i_133_ == 63)
		    i_133_ = var_es.readUnsignedByte(-9268);
		else if (bool)
		    i_133_ = is[i_133_];
		else
		    i_133_ = is_131_[i_133_];
		if (bool) {
		    A[i_129_ + i_130_ * z] = (byte) i_133_;
		    I[i_129_ + i_130_ * z] = (byte) 0;
		} else {
		    I[i_129_ + i_130_ * z] = (byte) i_133_;
		    O[i_129_ + i_130_ * z] = (byte) 0;
		    A[i_129_ + i_130_ * z] = var_es.readByte(-20933);
		}
	    }
	} else {
	    int i_134_ = (i_132_ >> 1 & 0x3) + 1;
	    boolean bool = (i_132_ & 0x8) != 0;
	    boolean bool_135_ = (i_132_ & 0x10) != 0;
	    for (int i_136_ = 0; i_136_ < i_134_; i_136_++) {
		int i_137_ = var_es.readUnsignedByte(-9268);
		int i_138_ = 0;
		int i_139_ = 0;
		if (bool) {
		    i_138_ = var_es.readUnsignedByte(-9268);
		    i_139_ = var_es.readUnsignedByte(-9268);
		}
		int i_140_ = 0;
		if (bool_135_)
		    i_140_ = var_es.readUnsignedByte(-9268);
		if (i_136_ == 0) {
		    A[i_129_ + i_130_ * z] = (byte) i_137_;
		    I[i_129_ + i_130_ * z] = (byte) i_138_;
		    O[i_129_ + i_130_ * z] = (byte) i_139_;
		    if (i_140_ == 1) {
			K[i_129_ + i_130_ * z] = (short) (var_es.readShort(13111) + 1);
			C[i_129_ + i_130_ * z] = var_es.readByte(-20933);
		    } else if (i_140_ > 1) {
			K[i_129_ + i_130_ * z] = (short) -1;
			short[] is_141_ = new short[i_140_];
			byte[] is_142_ = new byte[i_140_];
			for (int i_143_ = 0; i_143_ < i_140_; i_143_++) {
			    is_141_[i_143_] = (short) var_es.readShort(13111);
			    is_142_[i_143_] = var_es.readByte(-20933);
			}
			H.a(new so(is_141_, is_142_), (byte) -37,
			    (long) (i_129_ << 16 | i_130_));
		    }
		} else {
		    short[] is_144_ = null;
		    byte[] is_145_ = null;
		    if (i_140_ > 0) {
			is_144_ = new short[i_140_];
			is_145_ = new byte[i_140_];
			for (int i_146_ = 0; i_146_ < i_140_; i_146_++) {
			    is_144_[i_146_] = (short) var_es.readShort(13111);
			    is_145_[i_146_] = var_es.readByte(-20933);
			}
		    }
		    if (w[i_136_ - 1][i - (F >> 6)][i_128_ - (E >> 6)] == null)
			w[i_136_ - 1][i - (F >> 6)][i_128_ - (E >> 6)]
			    = new fca();
		    we var_we = new we(i_129_ & 0x3f, i_130_ & 0x3f, i_137_,
				       i_138_, i_139_, is_144_, is_145_);
		    w[i_136_ - 1][i - (F >> 6)][i_128_ - (E >> 6)].a(var_we,
								     105);
		}
	    }
	}
    }
    
    private static final void a(byte[] is, byte[] is_147_, short[] is_148_,
				int i, int i_149_) {
	int[] is_150_ = new int[N];
	int[] is_151_ = new int[N];
	int[] is_152_ = new int[N];
	int[] is_153_ = new int[N];
	int[] is_154_ = new int[N];
	for (int i_155_ = -5; i_155_ < z; i_155_++) {
	    int i_156_ = i_155_ + 5;
	    int i_157_ = i_155_ - 5;
	    for (int i_158_ = 0; i_158_ < N; i_158_++) {
		if (i_156_ < z) {
		    int i_159_ = is[i_156_ + i_158_ * z] & 0xff;
		    if (i_159_ > 0) {
			gda var_gda = b.b(false, i_159_ - 1);
			is_150_[i_158_] += ((gda) var_gda).c;
			is_151_[i_158_] += ((gda) var_gda).k;
			is_152_[i_158_] += ((gda) var_gda).i;
			is_153_[i_158_] += ((gda) var_gda).g;
			is_154_[i_158_]++;
		    }
		}
		if (i_157_ >= 0) {
		    int i_160_ = is[i_157_ + i_158_ * z] & 0xff;
		    if (i_160_ > 0) {
			gda var_gda = b.b(false, i_160_ - 1);
			is_150_[i_158_] -= ((gda) var_gda).c;
			is_151_[i_158_] -= ((gda) var_gda).k;
			is_152_[i_158_] -= ((gda) var_gda).i;
			is_153_[i_158_] -= ((gda) var_gda).g;
			is_154_[i_158_]--;
		    }
		}
	    }
	    if (i_155_ >= 0) {
		int i_161_ = 0;
		int i_162_ = 0;
		int i_163_ = 0;
		int i_164_ = 0;
		int i_165_ = 0;
		for (int i_166_ = -5; i_166_ < N; i_166_++) {
		    int i_167_ = i_166_ + 5;
		    if (i_167_ < N) {
			i_161_ += is_150_[i_167_];
			i_162_ += is_151_[i_167_];
			i_163_ += is_152_[i_167_];
			i_164_ += is_153_[i_167_];
			i_165_ += is_154_[i_167_];
		    }
		    int i_168_ = i_166_ - 5;
		    if (i_168_ >= 0) {
			i_161_ -= is_150_[i_168_];
			i_162_ -= is_151_[i_168_];
			i_163_ -= is_152_[i_168_];
			i_164_ -= is_153_[i_168_];
			i_165_ -= is_154_[i_168_];
		    }
		    if (i_166_ >= 0 && i_165_ > 0) {
			if ((is[i_155_ + i_166_ * z] & 0xff) == 0) {
			    int i_169_ = i_155_ + i_166_ * z;
			    is_147_[i_169_] = (byte) 0;
			    is_148_[i_169_] = (short) 0;
			} else {
			    int i_170_
				= (i_164_ == 0 ? 0
				   : nc.a(217, i_161_ * 256 / i_164_,
					  i_163_ / i_165_, i_162_ / i_165_));
			    int i_171_ = (i_170_ & 0x7f) + i_149_;
			    if (i_171_ < 0)
				i_171_ = 0;
			    else if (i_171_ > 127)
				i_171_ = 127;
			    int i_172_ = ((i_170_ + i & 0xfc00)
					  + (i_170_ & 0x380) + i_171_);
			    int i_173_ = i_155_ + i_166_ * z;
			    int i_174_
				= (vq.m
				   [pg.a(0, de.a(96, 125, i_172_)) & 0xffff]);
			    is_147_[i_173_] = (byte) (i_174_ >> 16 & 0xff);
			    is_148_[i_173_] = (short) (i_174_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static final Class_ae b(Class_r class_r) {
	int i = t - M;
	int i_175_ = D - L;
	int i_176_ = (x - B << 16) / i;
	int i_177_ = (J - y << 16) / i_175_;
	return a(class_r, i_176_, i_177_, 0, 0);
    }
    
    private static final void a(Class_r class_r, int i, int i_178_, int i_179_,
				int i_180_, short[] is, byte[] is_181_) {
	if (is != null) {
	    for (int i_182_ = 0; i_182_ < is.length; i_182_++) {
		ObjectDef var_bda = f.getObjectDef((byte) 38, is[i_182_] & 0xffff);
		int i_183_ = ((ObjectDef) var_bda).u;
		if (i_183_ != -1) {
		    wi var_wi = e.a(i_183_, (byte) 60);
		    f var_f = var_wi.a((((ObjectDef) var_bda).db ? ((ObjectDef) var_bda).C
					: false),
				       class_r,
				       (((ObjectDef) var_bda).U
					? is_181_[i_182_] >> 6 & 0x3 : 0),
				       -72);
		    if (var_f != null) {
			int i_184_ = i_179_ * var_f.A() >> 2;
			int i_185_ = i_180_ * var_f.ca() >> 2;
			if (((wi) var_wi).g) {
			    int i_186_ = ((ObjectDef) var_bda).A;
			    int i_187_ = ((ObjectDef) var_bda).J;
			    if ((is_181_[i_182_] >> 6 & 0x1) == 1) {
				int i_188_ = i_186_;
				i_186_ = i_187_;
				i_187_ = i_188_;
			    }
			    i_184_ = i_186_ * i_179_;
			    i_185_ = i_187_ * i_180_;
			}
			if (i_184_ != 0 && i_185_ != 0) {
			    if (((wi) var_wi).d != 0)
				var_f.a(i, i_178_ - i_185_ + i_180_, i_184_,
					i_185_, 0, ~0xffffff | ((wi) var_wi).d,
					1);
			    else
				var_f.a(i, i_178_ - i_185_ + i_180_, i_184_,
					i_185_);
			}
		    }
		}
	    }
	}
    }
    
    private static final void c() {
	for (int i = 0; i < z; i++) {
	    for (int i_189_ = 0; i_189_ < N; i_189_++) {
		int i_190_ = K[i + i_189_ * z] & 0xffff;
		if (i_190_ != 0) {
		    if (i_190_ == 65535) {
			so var_so
			    = (so) H.a(-32748, (long) (i << 16 | i_189_));
			if (var_so != null) {
			    for (int i_191_ = 0;
				 i_191_ < ((so) var_so).l.length; i_191_++) {
				ObjectDef var_bda
				    = f.getObjectDef((byte) 109,
					  ((so) var_so).l[i_191_] & 0xffff);
				int i_192_ = ((ObjectDef) var_bda).R;
				if (((ObjectDef) var_bda).xb != null) {
				    var_bda = var_bda.a(h, -1643);
				    if (var_bda != null)
					i_192_ = ((ObjectDef) var_bda).R;
				}
				if (i_192_ != -1) {
				    Class_vb class_vb = new Class_vb(i_192_);
				    ((Class_vb) class_vb).m = i;
				    ((Class_vb) class_vb).n = i_189_;
				    n.b(class_vb, (byte) 93);
				}
			    }
			}
		    } else {
			ObjectDef var_bda = f.getObjectDef((byte) 124, i_190_ - 1);
			int i_193_ = ((ObjectDef) var_bda).R;
			if (((ObjectDef) var_bda).xb != null) {
			    var_bda = var_bda.a(h, -1643);
			    if (var_bda != null)
				i_193_ = ((ObjectDef) var_bda).R;
			}
			if (i_193_ != -1) {
			    Class_vb class_vb = new Class_vb(i_193_);
			    ((Class_vb) class_vb).m = i;
			    ((Class_vb) class_vb).n = i_189_;
			    n.b(class_vb, (byte) 93);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_194_ = 0; i_194_ < w[0].length; i_194_++) {
		for (int i_195_ = 0; i_195_ < w[0][0].length; i_195_++) {
		    fca var_fca = w[i][i_194_][i_195_];
		    if (var_fca != null) {
			for (we var_we = (we) var_fca.b((byte) 76);
			     var_we != null;
			     var_we = (we) var_fca.a((byte) -106)) {
			    if (((we) var_we).g != null) {
				for (int i_196_ = 0;
				     i_196_ < ((we) var_we).g.length;
				     i_196_++) {
				    ObjectDef var_bda = f.getObjectDef((byte) 84,
						      (((we) var_we).g[i_196_]
						       & 0xffff));
				    int i_197_ = ((ObjectDef) var_bda).R;
				    if (((ObjectDef) var_bda).xb != null) {
					var_bda = var_bda.a(h, -1643);
					if (var_bda != null)
					    i_197_ = ((ObjectDef) var_bda).R;
				    }
				    if (i_197_ != -1) {
					Class_vb class_vb
					    = new Class_vb(i_197_);
					((Class_vb) class_vb).m
					    = ((i_194_ + (F >> 6)) * 64
					       + ((we) var_we).j - F);
					((Class_vb) class_vb).n
					    = ((i_195_ + (E >> 6)) * 64
					       + ((we) var_we).l - E);
					n.b(class_vb, (byte) 93);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void a(int i, int i_198_, int i_199_, int i_200_, int i_201_,
			int i_202_, int i_203_, int i_204_) {
	M = i - F;
	D = i_198_ - E;
	t = i_199_ - F;
	L = i_200_ - E;
	B = i_201_;
	y = i_202_;
	x = i_203_;
	J = i_204_;
    }
    
    static final void d() {
	A = new byte[z * N];
	I = new byte[z * N];
	O = new byte[z * N];
	K = new short[z * N];
	C = new byte[z * N];
	H = new il(1024);
	w = new fca[3][z >> 6][N >> 6];
	v = new int[((cp) d).d + 1];
    }
    
    public static void e() {
	d = null;
	b = null;
	f = null;
	a = null;
	e = null;
	h = null;
	c = null;
	i = null;
	g = null;
	s = null;
	q = null;
	p = null;
	r = null;
	n = null;
	v = null;
	A = null;
	u = null;
	G = null;
	I = null;
	O = null;
	K = null;
	C = null;
	H = null;
	w = null;
    }
    
    static final eaa b(int i, int i_205_) {
	for (eaa var_eaa = (eaa) g.b((byte) 124); var_eaa != null;
	     var_eaa = (eaa) g.b(12561)) {
	    if (((eaa) var_eaa).x && var_eaa.a(13543, i_205_, i))
		return var_eaa;
	}
	return null;
    }
    
    static {
	k = (int) (Math.random() * 17.0) - 8;
	n = new Class_ae();
    }
}
