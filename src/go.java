/* go - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class go extends Node
{
    private static int k;
    private byte[][] l;
    private static byte[] m;
    private static int[] n;
    private int o;
    private boolean p;
    private static vba[] q;
    private int r;
    private static boolean[] s;
    private static jaa[] t;
    private static int[] u;
    private int v;
    static se[] w;
    private static cr[] x;
    private int y;
    private int z;
    private static float[] A;
    private int B;
    private static int[] C;
    private static int D;
    private static int E;
    private boolean F;
    private static float[] G;
    private static float[] H;
    private static float[] I;
    private static float[] J;
    private static int K;
    private static float[] L;
    private float[] M;
    private static boolean N = false;
    private int O;
    private int P;
    private static float[] Q;
    private byte[] S;
    
    static final float a(int i) {
	int i_0_ = i & 0x1fffff;
	int i_1_ = i & ~0x7fffffff;
	int i_2_ = (i & 0x7fe00000) >> 21;
	if (i_1_ != 0)
	    i_0_ = -i_0_;
	return (float) ((double) i_0_ * Math.pow(2.0, (double) (i_2_ - 788)));
    }
    
    static final go a(pl var_pl, int i) {
	if (!a(var_pl)) {
	    var_pl.g(1912, i);
	    return null;
	}
	byte[] is = var_pl.a((int) 97, i);
	if (is == null)
	    return null;
	return new go(is);
    }
    
    private static final void a(byte[] is, int i) {
	m = is;
	k = i;
	K = 0;
    }
    
    final oaa a(int[] is) {
	if (is != null && is[0] <= 0)
	    return null;
	if (S == null) {
	    B = 0;
	    M = new float[E];
	    S = new byte[r];
	    O = 0;
	    P = 0;
	}
	for (/**/; P < l.length; P++) {
	    if (is != null && is[0] <= 0)
		return null;
	    float[] fs = b(P);
	    if (fs != null) {
		int i = O;
		int i_3_ = fs.length;
		if (i_3_ > r - i)
		    i_3_ = r - i;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		    int i_5_ = (int) (fs[i_4_] * 128.0F + 128.0F);
		    if ((i_5_ & ~0xff) != 0)
			i_5_ = (i_5_ ^ 0xffffffff) >> 31;
		    S[i++] = (byte) (i_5_ - 128);
		}
		if (is != null)
		    is[0] -= i - O;
		O = i;
	    }
	}
	M = null;
	byte[] is_6_ = S;
	S = null;
	return new oaa(y, is_6_, z, o, p);
    }
    
    public static void a() {
	m = null;
	w = null;
	t = null;
	x = null;
	q = null;
	s = null;
	C = null;
	I = null;
	L = null;
	G = null;
	Q = null;
	J = null;
	A = null;
	H = null;
	u = null;
	n = null;
    }
    
    private static final void a(byte[] is) {
	a(is, 0);
	D = 1 << c(4);
	E = 1 << c(4);
	I = new float[E];
	for (int i = 0; i < 2; i++) {
	    int i_7_ = i != 0 ? E : D;
	    int i_8_ = i_7_ >> 1;
	    int i_9_ = i_7_ >> 2;
	    int i_10_ = i_7_ >> 3;
	    float[] fs = new float[i_8_];
	    for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
		fs[2 * i_11_]
		    = (float) Math.cos((double) (4 * i_11_) * 3.141592653589793
				       / (double) i_7_);
		fs[2 * i_11_ + 1]
		    = -(float) Math.sin((double) (4 * i_11_)
					* 3.141592653589793 / (double) i_7_);
	    }
	    float[] fs_12_ = new float[i_8_];
	    for (int i_13_ = 0; i_13_ < i_9_; i_13_++) {
		fs_12_[2 * i_13_] = (float) Math.cos((double) (2 * i_13_ + 1)
						     * 3.141592653589793
						     / (double) (2 * i_7_));
		fs_12_[2 * i_13_ + 1]
		    = (float) Math.sin((double) (2 * i_13_ + 1)
				       * 3.141592653589793
				       / (double) (2 * i_7_));
	    }
	    float[] fs_14_ = new float[i_9_];
	    for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
		fs_14_[2 * i_15_]
		    = (float) Math.cos((double) (4 * i_15_ + 2)
				       * 3.141592653589793 / (double) i_7_);
		fs_14_[2 * i_15_ + 1]
		    = -(float) Math.sin((double) (4 * i_15_ + 2)
					* 3.141592653589793 / (double) i_7_);
	    }
	    int[] is_16_ = new int[i_10_];
	    int i_17_ = it.a(-24420, i_10_ - 1);
	    for (int i_18_ = 0; i_18_ < i_10_; i_18_++)
		is_16_[i_18_] = faa.a(i_18_, i_17_, true);
	    if (i != 0) {
		J = fs;
		A = fs_12_;
		H = fs_14_;
		n = is_16_;
	    } else {
		L = fs;
		G = fs_12_;
		Q = fs_14_;
		u = is_16_;
	    }
	}
	int i = c(8) + 1;
	w = new se[i];
	for (int i_19_ = 0; i_19_ < i; i_19_++)
	    w[i_19_] = new se();
	int i_20_ = c(6) + 1;
	for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
	    c(16);
	int i_22_ = c(6) + 1;
	t = new jaa[i_22_];
	for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
	    t[i_23_] = new jaa();
	int i_24_ = c(6) + 1;
	x = new cr[i_24_];
	for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
	    x[i_25_] = new cr();
	int i_26_ = c(6) + 1;
	q = new vba[i_26_];
	for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
	    q[i_27_] = new vba();
	int i_28_ = c(6) + 1;
	s = new boolean[i_28_];
	C = new int[i_28_];
	for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
	    s[i_29_] = b() != 0;
	    c(16);
	    c(16);
	    C[i_29_] = c(8);
	}
    }
    
    private final float[] b(int i) {
	a(l[i], 0);
	b();
	int i_30_ = c(it.a(-24420, C.length - 1));
	boolean bool = s[i_30_];
	int i_31_ = bool ? E : D;
	boolean bool_32_ = false;
	boolean bool_33_ = false;
	if (bool) {
	    bool_32_ = b() != 0;
	    bool_33_ = b() != 0;
	}
	int i_34_ = i_31_ >> 1;
	int i_35_;
	int i_36_;
	int i_37_;
	if (bool && !bool_32_) {
	    i_35_ = (i_31_ >> 2) - (D >> 2);
	    i_36_ = (i_31_ >> 2) + (D >> 2);
	    i_37_ = D >> 1;
	} else {
	    i_35_ = 0;
	    i_36_ = i_34_;
	    i_37_ = i_31_ >> 1;
	}
	int i_38_;
	int i_39_;
	int i_40_;
	if (bool && !bool_33_) {
	    i_38_ = i_31_ - (i_31_ >> 2) - (D >> 2);
	    i_39_ = i_31_ - (i_31_ >> 2) + (D >> 2);
	    i_40_ = D >> 1;
	} else {
	    i_38_ = i_34_;
	    i_39_ = i_31_;
	    i_40_ = i_31_ >> 1;
	}
	vba var_vba = q[C[i_30_]];
	int i_41_ = ((vba) var_vba).c;
	int i_42_ = ((vba) var_vba).d[i_41_];
	boolean bool_43_ = !t[i_42_].b();
	boolean bool_44_ = bool_43_;
	for (int i_45_ = 0; i_45_ < ((vba) var_vba).a; i_45_++) {
	    cr var_cr = x[((vba) var_vba).b[i_45_]];
	    float[] fs = I;
	    var_cr.a(fs, i_31_ >> 1, bool_44_);
	}
	if (!bool_43_) {
	    int i_46_ = ((vba) var_vba).c;
	    int i_47_ = ((vba) var_vba).d[i_46_];
	    t[i_47_].a(I, i_31_ >> 1);
	}
	if (bool_43_) {
	    for (int i_48_ = i_31_ >> 1; i_48_ < i_31_; i_48_++)
		I[i_48_] = 0.0F;
	} else {
	    int i_49_ = i_31_ >> 1;
	    int i_50_ = i_31_ >> 2;
	    int i_51_ = i_31_ >> 3;
	    float[] fs = I;
	    for (int i_52_ = 0; i_52_ < i_49_; i_52_++)
		fs[i_52_] *= 0.5F;
	    for (int i_53_ = i_49_; i_53_ < i_31_; i_53_++)
		fs[i_53_] = -fs[i_31_ - i_53_ - 1];
	    float[] fs_54_ = bool ? J : L;
	    float[] fs_55_ = bool ? A : G;
	    float[] fs_56_ = bool ? H : Q;
	    int[] is = bool ? n : u;
	    for (int i_57_ = 0; i_57_ < i_50_; i_57_++) {
		float f = fs[4 * i_57_] - fs[i_31_ - 4 * i_57_ - 1];
		float f_58_ = fs[4 * i_57_ + 2] - fs[i_31_ - 4 * i_57_ - 3];
		float f_59_ = fs_54_[2 * i_57_];
		float f_60_ = fs_54_[2 * i_57_ + 1];
		fs[i_31_ - 4 * i_57_ - 1] = f * f_59_ - f_58_ * f_60_;
		fs[i_31_ - 4 * i_57_ - 3] = f * f_60_ + f_58_ * f_59_;
	    }
	    for (int i_61_ = 0; i_61_ < i_51_; i_61_++) {
		float f = fs[i_49_ + 3 + 4 * i_61_];
		float f_62_ = fs[i_49_ + 1 + 4 * i_61_];
		float f_63_ = fs[4 * i_61_ + 3];
		float f_64_ = fs[4 * i_61_ + 1];
		fs[i_49_ + 3 + 4 * i_61_] = f + f_63_;
		fs[i_49_ + 1 + 4 * i_61_] = f_62_ + f_64_;
		float f_65_ = fs_54_[i_49_ - 4 - 4 * i_61_];
		float f_66_ = fs_54_[i_49_ - 3 - 4 * i_61_];
		fs[4 * i_61_ + 3]
		    = (f - f_63_) * f_65_ - (f_62_ - f_64_) * f_66_;
		fs[4 * i_61_ + 1]
		    = (f_62_ - f_64_) * f_65_ + (f - f_63_) * f_66_;
	    }
	    int i_67_ = it.a(-24420, i_31_ - 1);
	    for (int i_68_ = 0; i_68_ < i_67_ - 3; i_68_++) {
		int i_69_ = i_31_ >> i_68_ + 2;
		int i_70_ = 8 << i_68_;
		for (int i_71_ = 0; i_71_ < 2 << i_68_; i_71_++) {
		    int i_72_ = i_31_ - i_69_ * 2 * i_71_;
		    int i_73_ = i_31_ - i_69_ * (2 * i_71_ + 1);
		    for (int i_74_ = 0; i_74_ < i_31_ >> i_68_ + 4; i_74_++) {
			int i_75_ = 4 * i_74_;
			float f = fs[i_72_ - 1 - i_75_];
			float f_76_ = fs[i_72_ - 3 - i_75_];
			float f_77_ = fs[i_73_ - 1 - i_75_];
			float f_78_ = fs[i_73_ - 3 - i_75_];
			fs[i_72_ - 1 - i_75_] = f + f_77_;
			fs[i_72_ - 3 - i_75_] = f_76_ + f_78_;
			float f_79_ = fs_54_[i_74_ * i_70_];
			float f_80_ = fs_54_[i_74_ * i_70_ + 1];
			fs[i_73_ - 1 - i_75_]
			    = (f - f_77_) * f_79_ - (f_76_ - f_78_) * f_80_;
			fs[i_73_ - 3 - i_75_]
			    = (f_76_ - f_78_) * f_79_ + (f - f_77_) * f_80_;
		    }
		}
	    }
	    for (int i_81_ = 1; i_81_ < i_51_ - 1; i_81_++) {
		int i_82_ = is[i_81_];
		if (i_81_ < i_82_) {
		    int i_83_ = 8 * i_81_;
		    int i_84_ = 8 * i_82_;
		    float f = fs[i_83_ + 1];
		    fs[i_83_ + 1] = fs[i_84_ + 1];
		    fs[i_84_ + 1] = f;
		    f = fs[i_83_ + 3];
		    fs[i_83_ + 3] = fs[i_84_ + 3];
		    fs[i_84_ + 3] = f;
		    f = fs[i_83_ + 5];
		    fs[i_83_ + 5] = fs[i_84_ + 5];
		    fs[i_84_ + 5] = f;
		    f = fs[i_83_ + 7];
		    fs[i_83_ + 7] = fs[i_84_ + 7];
		    fs[i_84_ + 7] = f;
		}
	    }
	    for (int i_85_ = 0; i_85_ < i_49_; i_85_++)
		fs[i_85_] = fs[2 * i_85_ + 1];
	    for (int i_86_ = 0; i_86_ < i_51_; i_86_++) {
		fs[i_31_ - 1 - 2 * i_86_] = fs[4 * i_86_];
		fs[i_31_ - 2 - 2 * i_86_] = fs[4 * i_86_ + 1];
		fs[i_31_ - i_50_ - 1 - 2 * i_86_] = fs[4 * i_86_ + 2];
		fs[i_31_ - i_50_ - 2 - 2 * i_86_] = fs[4 * i_86_ + 3];
	    }
	    for (int i_87_ = 0; i_87_ < i_51_; i_87_++) {
		float f = fs_56_[2 * i_87_];
		float f_88_ = fs_56_[2 * i_87_ + 1];
		float f_89_ = fs[i_49_ + 2 * i_87_];
		float f_90_ = fs[i_49_ + 2 * i_87_ + 1];
		float f_91_ = fs[i_31_ - 2 - 2 * i_87_];
		float f_92_ = fs[i_31_ - 1 - 2 * i_87_];
		float f_93_ = f_88_ * (f_89_ - f_91_) + f * (f_90_ + f_92_);
		fs[i_49_ + 2 * i_87_] = (f_89_ + f_91_ + f_93_) * 0.5F;
		fs[i_31_ - 2 - 2 * i_87_] = (f_89_ + f_91_ - f_93_) * 0.5F;
		f_93_ = f_88_ * (f_90_ + f_92_) - f * (f_89_ - f_91_);
		fs[i_49_ + 2 * i_87_ + 1] = (f_90_ - f_92_ + f_93_) * 0.5F;
		fs[i_31_ - 1 - 2 * i_87_] = (f_92_ - f_90_ + f_93_) * 0.5F;
	    }
	    for (int i_94_ = 0; i_94_ < i_50_; i_94_++) {
		fs[i_94_]
		    = (fs[2 * i_94_ + i_49_] * fs_55_[2 * i_94_]
		       + fs[2 * i_94_ + 1 + i_49_] * fs_55_[2 * i_94_ + 1]);
		fs[i_49_ - 1 - i_94_]
		    = (fs[2 * i_94_ + i_49_] * fs_55_[2 * i_94_ + 1]
		       - fs[2 * i_94_ + 1 + i_49_] * fs_55_[2 * i_94_]);
	    }
	    for (int i_95_ = 0; i_95_ < i_50_; i_95_++)
		fs[i_31_ - i_50_ + i_95_] = -fs[i_95_];
	    for (int i_96_ = 0; i_96_ < i_50_; i_96_++)
		fs[i_96_] = fs[i_50_ + i_96_];
	    for (int i_97_ = 0; i_97_ < i_50_; i_97_++)
		fs[i_50_ + i_97_] = -fs[i_50_ - i_97_ - 1];
	    for (int i_98_ = 0; i_98_ < i_50_; i_98_++)
		fs[i_49_ + i_98_] = fs[i_31_ - i_98_ - 1];
	    for (int i_99_ = i_35_; i_99_ < i_36_; i_99_++) {
		float f = (float) Math.sin(((double) (i_99_ - i_35_) + 0.5)
					   / (double) i_37_ * 0.5
					   * 3.141592653589793);
		I[i_99_] *= (float) Math.sin(1.5707963267948966 * (double) f
					     * (double) f);
	    }
	    for (int i_100_ = i_38_; i_100_ < i_39_; i_100_++) {
		float f = (float) Math.sin((((double) (i_100_ - i_38_) + 0.5)
					    / (double) i_40_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		I[i_100_] *= (float) Math.sin(1.5707963267948966 * (double) f
					      * (double) f);
	    }
	}
	float[] fs = null;
	if (B > 0) {
	    int i_101_ = B + i_31_ >> 2;
	    fs = new float[i_101_];
	    if (!F) {
		for (int i_102_ = 0; i_102_ < v; i_102_++) {
		    int i_103_ = (B >> 1) + i_102_;
		    fs[i_102_] += M[i_103_];
		}
	    }
	    if (!bool_43_) {
		for (int i_104_ = i_35_; i_104_ < i_31_ >> 1; i_104_++) {
		    int i_105_ = fs.length - (i_31_ >> 1) + i_104_;
		    fs[i_105_] += I[i_104_];
		}
	    }
	}
	float[] fs_106_ = M;
	M = I;
	I = fs_106_;
	B = i_31_;
	v = i_39_ - (i_31_ >> 1);
	F = bool_43_;
	return fs;
    }
    
    private final void b(byte[] is) {
	BytesParser var_es = new BytesParser(is);
	y = var_es.readInt(62);
	r = var_es.readInt(95);
	z = var_es.readInt(105);
	o = var_es.readInt(115);
	if (o < 0) {
	    o = o ^ 0xffffffff;
	    p = true;
	}
	int i = var_es.readInt(64);
	l = new byte[i][];
	for (int i_107_ = 0; i_107_ < i; i_107_++) {
	    int i_108_ = 0;
	    int i_109_;
	    do {
		i_109_ = var_es.readUnsignedByte(-9268);
		i_108_ += i_109_;
	    } while (i_109_ >= 255);
	    byte[] is_110_ = new byte[i_108_];
	    var_es.readBytes(is_110_, true, i_108_, 0);
	    l[i_107_] = is_110_;
	}
    }
    
    static final go a(pl var_pl, int i, int i_111_) {
	if (!a(var_pl)) {
	    var_pl.a(i_111_, (byte) 107, i);
	    return null;
	}
	byte[] is = var_pl.b(i_111_, -115, i);
	if (is == null)
	    return null;
	return new go(is);
    }
    
    static final int c(int i) {
	int i_112_ = 0;
	int i_113_ = 0;
	int i_114_;
	for (/**/; i >= 8 - K; i -= i_114_) {
	    i_114_ = 8 - K;
	    int i_115_ = (1 << i_114_) - 1;
	    i_112_ += (m[k] >> K & i_115_) << i_113_;
	    K = 0;
	    k++;
	    i_113_ += i_114_;
	}
	if (i > 0) {
	    i_114_ = (1 << i) - 1;
	    i_112_ += (m[k] >> K & i_114_) << i_113_;
	    K += i;
	}
	return i_112_;
    }
    
    static final int b() {
	int i = m[k] >> K & 0x1;
	K++;
	k += K >> 3;
	K &= 0x7;
	return i;
    }
    
    private static final boolean a(pl var_pl) {
	if (!N) {
	    byte[] is = var_pl.b(0, -124, 0);
	    if (is == null)
		return false;
	    a(is);
	    N = true;
	}
	return true;
    }
    
    private go(byte[] is) {
	b(is);
    }
}
