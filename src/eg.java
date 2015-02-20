/* eg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eg
{
    short[] a;
    static int b;
    byte c;
    int[] d;
    byte[] e;
    short[] f;
    static int g;
    short[] h;
    qg[] i;
    int[] j;
    int[] k;
    int l = 0;
    byte[] m;
    static int n;
    int[] o;
    short[] p;
    hi[] q;
    static int r;
    int[] s;
    static int t;
    static int u;
    short[] v;
    byte[] w;
    short[] x;
    byte[] y;
    int z;
    static int A;
    short[] B;
    short[] C;
    int[] D;
    static int E;
    byte[] F;
    int G;
    static int H;
    static int I;
    static int J;
    static int K;
    int L;
    static int M;
    lw[] N;
    short[] O;
    static int P;
    int[] Q;
    int[] R;
    int[] S;
    static mv T = new mv();
    byte[] U;
    int[] V;
    int[] W;
    static int X;
    byte[] Y;
    short[] Z;
    static int ab;
    int bb;
    
    final void a(int i, byte i_0_, int i_1_, int i_2_) {
	if (i_0_ < 86)
	    ((eg) this).G = -96;
	X++;
	for (int i_3_ = 0; i_3_ < ((eg) this).z; i_3_++) {
	    ((eg) this).o[i_3_] += i_1_;
	    ((eg) this).W[i_3_] += i_2_;
	    ((eg) this).R[i_3_] += i;
	}
    }
    
    final int a(int i, int i_4_, int i_5_, int i_6_) {
	b++;
	if (i_6_ != -21519)
	    ((eg) this).N = null;
	for (int i_7_ = 0; i_7_ < ((eg) this).z; i_7_++) {
	    if (i == ((eg) this).o[i_7_] && ((eg) this).W[i_7_] == i_5_
		&& ((eg) this).R[i_7_] == i_4_)
		return i_7_;
	}
	((eg) this).o[((eg) this).z] = i;
	((eg) this).W[((eg) this).z] = i_5_;
	((eg) this).R[((eg) this).z] = i_4_;
	((eg) this).l = ((eg) this).z + 1;
	return ((eg) this).z++;
    }
    
    final byte a(short i, byte i_8_, short i_9_, short i_10_, short i_11_,
		 int i_12_, byte i_13_, short i_14_, short i_15_, byte i_16_) {
	I++;
	if (((eg) this).L >= 255)
	    throw new IllegalStateException();
	((eg) this).F[((eg) this).L] = (byte) 3;
	((eg) this).p[((eg) this).L] = i_10_;
	((eg) this).h[((eg) this).L] = i_11_;
	if (i_12_ != 0)
	    a(true, 112);
	((eg) this).x[((eg) this).L] = i_14_;
	((eg) this).S[((eg) this).L] = i_15_;
	((eg) this).j[((eg) this).L] = i;
	((eg) this).D[((eg) this).L] = i_9_;
	((eg) this).Y[((eg) this).L] = i_8_;
	((eg) this).y[((eg) this).L] = i_13_;
	((eg) this).V[((eg) this).L] = i_16_;
	return (byte) ((eg) this).L++;
    }
    
    private final void a(byte[] is, int i) {
	n++;
	BytesParser var_es = new BytesParser(is);
	BytesParser var_es_17_ = new BytesParser(is);
	BytesParser var_es_18_ = new BytesParser(is);
	BytesParser var_es_19_ = new BytesParser(is);
	BytesParser var_es_20_ = new BytesParser(is);
	BytesParser var_es_21_ = new BytesParser(is);
	BytesParser var_es_22_ = new BytesParser(is);
	((BytesParser) var_es).pos = is.length - 23;
	((eg) this).z = var_es.readShort(13111);
	((eg) this).G = var_es.readShort(13111);
	((eg) this).L = var_es.readUnsignedByte(-9268);
	int i_23_ = var_es.readUnsignedByte(-9268);
	boolean bool = (i_23_ & 0x1) == 1;
	boolean bool_24_ = (0x2 & i_23_) == 2;
	boolean bool_25_ = (0x4 & i_23_) == 4;
	boolean bool_26_ = (0x8 & i_23_) == 8;
	if (bool_26_) {
	    ((BytesParser) var_es).pos -= 7;
	    ((eg) this).bb = var_es.readUnsignedByte(-9268);
	    ((BytesParser) var_es).pos += 6;
	}
	int i_27_ = var_es.readUnsignedByte(-9268);
	int i_28_ = var_es.readUnsignedByte(-9268);
	int i_29_ = var_es.readUnsignedByte(-9268);
	int i_30_ = var_es.readUnsignedByte(-9268);
	int i_31_ = var_es.readUnsignedByte(-9268);
	int i_32_ = var_es.readShort(i + 6911);
	int i_33_ = var_es.readShort(13111);
	int i_34_ = var_es.readShort(13111);
	int i_35_ = var_es.readShort(13111);
	int i_36_ = var_es.readShort(13111);
	int i_37_ = 0;
	int i_38_ = 0;
	int i_39_ = 0;
	if (((eg) this).L > 0) {
	    ((BytesParser) var_es).pos = 0;
	    ((eg) this).F = new byte[((eg) this).L];
	    for (int i_40_ = 0; i_40_ < ((eg) this).L; i_40_++) {
		byte i_41_ = ((eg) this).F[i_40_] = var_es.readByte(-20933);
		if (i_41_ == 2)
		    i_39_++;
		if (i_41_ >= 1 && i_41_ <= 3)
		    i_38_++;
		if (i_41_ == 0)
		    i_37_++;
	    }
	}
	int i_42_ = ((eg) this).L;
	int i_43_ = i_42_;
	i_42_ += ((eg) this).z;
	int i_44_ = i_42_;
	if (bool)
	    i_42_ += ((eg) this).G;
	int i_45_ = i_42_;
	i_42_ += ((eg) this).G;
	int i_46_ = i_42_;
	if (i_27_ == 255)
	    i_42_ += ((eg) this).G;
	int i_47_ = i_42_;
	if (i_29_ == 1)
	    i_42_ += ((eg) this).G;
	int i_48_ = i_42_;
	if (i_31_ == 1)
	    i_42_ += ((eg) this).z;
	int i_49_ = i_42_;
	if (i_28_ == 1)
	    i_42_ += ((eg) this).G;
	int i_50_ = i_42_;
	i_42_ += i_35_;
	int i_51_ = i_42_;
	if (i_30_ == 1)
	    i_42_ += ((eg) this).G * 2;
	int i_52_ = i_42_;
	i_42_ += i_36_;
	int i_53_ = i_42_;
	i_42_ += 2 * ((eg) this).G;
	int i_54_ = i_42_;
	i_42_ += i_32_;
	int i_55_ = i_42_;
	i_42_ += i_33_;
	int i_56_ = i_42_;
	i_42_ += i_34_;
	int i_57_ = i_42_;
	i_42_ += i_37_ * 6;
	int i_58_ = i_42_;
	i_42_ += i_38_ * 6;
	int i_59_ = 6;
	if (((eg) this).bb != 14) {
	    if (((eg) this).bb >= 15)
		i_59_ = 9;
	} else
	    i_59_ = 7;
	int i_60_ = i_42_;
	i_42_ += i_59_ * i_38_;
	int i_61_ = i_42_;
	i_42_ += i_38_;
	int i_62_ = i_42_;
	i_42_ += i_38_;
	int i_63_ = i_42_;
	i_42_ += i_38_ + i_39_ * 2;
	if (bool)
	    ((eg) this).U = new byte[((eg) this).G];
	((BytesParser) var_es).pos = i_43_;
	if (i_29_ == 1)
	    ((eg) this).s = new int[((eg) this).G];
	if (i_28_ == 1)
	    ((eg) this).m = new byte[((eg) this).G];
	if (((eg) this).L > 0) {
	    if (i_38_ > 0) {
		((eg) this).Y = new byte[i_38_];
		((eg) this).y = new byte[i_38_];
		((eg) this).S = new int[i_38_];
		((eg) this).V = new int[i_38_];
		((eg) this).j = new int[i_38_];
		((eg) this).D = new int[i_38_];
	    }
	    ((eg) this).h = new short[((eg) this).L];
	    if (i_39_ > 0) {
		((eg) this).d = new int[i_39_];
		((eg) this).k = new int[i_39_];
	    }
	    ((eg) this).p = new short[((eg) this).L];
	    ((eg) this).x = new short[((eg) this).L];
	}
	int i_64_ = i_42_;
	if (i_30_ == 1)
	    ((eg) this).B = new short[((eg) this).G];
	((eg) this).O = new short[((eg) this).G];
	((eg) this).o = new int[((eg) this).z];
	if (i != 6200)
	    ((eg) this).B = null;
	((eg) this).R = new int[((eg) this).z];
	if (i_31_ == 1)
	    ((eg) this).Q = new int[((eg) this).z];
	((eg) this).Z = new short[((eg) this).G];
	((eg) this).v = new short[((eg) this).G];
	if (i_27_ == 255)
	    ((eg) this).w = new byte[((eg) this).G];
	else
	    ((eg) this).c = (byte) i_27_;
	((eg) this).a = new short[((eg) this).G];
	((eg) this).W = new int[((eg) this).z];
	if (i_30_ == 1 && ((eg) this).L > 0)
	    ((eg) this).e = new byte[((eg) this).G];
	((BytesParser) var_es_17_).pos = i_54_;
	((BytesParser) var_es_18_).pos = i_55_;
	((BytesParser) var_es_19_).pos = i_56_;
	((BytesParser) var_es_20_).pos = i_48_;
	int i_65_ = 0;
	int i_66_ = 0;
	int i_67_ = 0;
	for (int i_68_ = 0; i_68_ < ((eg) this).z; i_68_++) {
	    int i_69_ = var_es.readUnsignedByte(i ^ ~0x3c0b);
	    int i_70_ = 0;
	    if ((i_69_ & 0x1) != 0)
		i_70_ = var_es_17_.readSmart(-9561);
	    int i_71_ = 0;
	    if ((0x2 & i_69_) != 0)
		i_71_ = var_es_18_.readSmart(-9561);
	    int i_72_ = 0;
	    if ((0x4 & i_69_) != 0)
		i_72_ = var_es_19_.readSmart(-9561);
	    ((eg) this).o[i_68_] = i_70_ + i_65_;
	    ((eg) this).W[i_68_] = i_71_ + i_66_;
	    ((eg) this).R[i_68_] = i_67_ + i_72_;
	    i_66_ = ((eg) this).W[i_68_];
	    i_65_ = ((eg) this).o[i_68_];
	    i_67_ = ((eg) this).R[i_68_];
	    if (i_31_ == 1)
		((eg) this).Q[i_68_] = var_es_20_.readUnsignedByte(-9268);
	}
	((BytesParser) var_es).pos = i_53_;
	((BytesParser) var_es_17_).pos = i_44_;
	((BytesParser) var_es_18_).pos = i_46_;
	((BytesParser) var_es_19_).pos = i_49_;
	((BytesParser) var_es_20_).pos = i_47_;
	((BytesParser) var_es_21_).pos = i_51_;
	((BytesParser) var_es_22_).pos = i_52_;
	for (int i_73_ = 0; ((eg) this).G > i_73_; i_73_++) {
	    ((eg) this).Z[i_73_] = (short) var_es.readShort(13111);
	    if (bool)
		((eg) this).U[i_73_] = var_es_17_.readByte(-20933);
	    if (i_27_ == 255)
		((eg) this).w[i_73_] = var_es_18_.readByte(-20933);
	    if (i_28_ == 1)
		((eg) this).m[i_73_] = var_es_19_.readByte(-20933);
	    if (i_29_ == 1)
		((eg) this).s[i_73_] = var_es_20_.readUnsignedByte(-9268);
	    if (i_30_ == 1)
		((eg) this).B[i_73_] = (short) (var_es_21_.readShort(13111) - 1);
	    if (((eg) this).e != null) {
		if ((((eg) this).B[i_73_] ^ 0xffffffff) == 0)
		    ((eg) this).e[i_73_] = (byte) -1;
		else
		    ((eg) this).e[i_73_] = (byte) (var_es_22_.readUnsignedByte(-9268) - 1);
	    }
	}
	((eg) this).l = -1;
	((BytesParser) var_es).pos = i_50_;
	((BytesParser) var_es_17_).pos = i_45_;
	short i_74_ = 0;
	short i_75_ = 0;
	short i_76_ = 0;
	int i_77_ = 0;
	for (int i_78_ = 0; ((eg) this).G > i_78_; i_78_++) {
	    int i_79_ = var_es_17_.readUnsignedByte(-9268);
	    if (i_79_ == 1) {
		i_74_ = (short) (i_77_ + var_es.readSmart(-9561));
		i_77_ = i_74_;
		i_75_ = (short) (i_77_ + var_es.readSmart(-9561));
		i_77_ = i_75_;
		i_76_ = (short) (var_es.readSmart(i ^ ~0x3d60) + i_77_);
		((eg) this).O[i_78_] = i_74_;
		i_77_ = i_76_;
		((eg) this).v[i_78_] = i_75_;
		((eg) this).a[i_78_] = i_76_;
		if (i_74_ > ((eg) this).l)
		    ((eg) this).l = i_74_;
		if (((eg) this).l < i_75_)
		    ((eg) this).l = i_75_;
		if (((eg) this).l < i_76_)
		    ((eg) this).l = i_76_;
	    }
	    if (i_79_ == 2) {
		i_75_ = i_76_;
		i_76_ = (short) (var_es.readSmart(-9561) + i_77_);
		i_77_ = i_76_;
		((eg) this).O[i_78_] = i_74_;
		((eg) this).v[i_78_] = i_75_;
		((eg) this).a[i_78_] = i_76_;
		if (i_76_ > ((eg) this).l)
		    ((eg) this).l = i_76_;
	    }
	    if (i_79_ == 3) {
		i_74_ = i_76_;
		i_76_ = (short) (i_77_ + var_es.readSmart(-9561));
		((eg) this).O[i_78_] = i_74_;
		i_77_ = i_76_;
		((eg) this).v[i_78_] = i_75_;
		((eg) this).a[i_78_] = i_76_;
		if (((eg) this).l < i_76_)
		    ((eg) this).l = i_76_;
	    }
	    if (i_79_ == 4) {
		short i_80_ = i_74_;
		i_74_ = i_75_;
		i_75_ = i_80_;
		i_76_ = (short) (var_es.readSmart(-9561) + i_77_);
		((eg) this).O[i_78_] = i_74_;
		i_77_ = i_76_;
		((eg) this).v[i_78_] = i_75_;
		((eg) this).a[i_78_] = i_76_;
		if (i_76_ > ((eg) this).l)
		    ((eg) this).l = i_76_;
	    }
	}
	((BytesParser) var_es).pos = i_57_;
	((eg) this).l++;
	((BytesParser) var_es_17_).pos = i_58_;
	((BytesParser) var_es_18_).pos = i_60_;
	((BytesParser) var_es_19_).pos = i_61_;
	((BytesParser) var_es_20_).pos = i_62_;
	((BytesParser) var_es_21_).pos = i_63_;
	for (int i_81_ = 0; ((eg) this).L > i_81_; i_81_++) {
	    int i_82_ = ((eg) this).F[i_81_] & 0xff;
	    if (i_82_ == 0) {
		((eg) this).p[i_81_] = (short) var_es.readShort(i + 6911);
		((eg) this).h[i_81_] = (short) var_es.readShort(13111);
		((eg) this).x[i_81_] = (short) var_es.readShort(13111);
	    }
	    if (i_82_ == 1) {
		((eg) this).p[i_81_] = (short) var_es_17_.readShort(13111);
		((eg) this).h[i_81_] = (short) var_es_17_.readShort(mv.a(i, 11023));
		((eg) this).x[i_81_] = (short) var_es_17_.readShort(13111);
		if (((eg) this).bb < 15) {
		    ((eg) this).S[i_81_] = var_es_18_.readShort(13111);
		    if (((eg) this).bb >= 14)
			((eg) this).j[i_81_] = var_es_18_.readTribyte(-1);
		    else
			((eg) this).j[i_81_] = var_es_18_.readShort(13111);
		    ((eg) this).D[i_81_] = var_es_18_.readShort(13111);
		} else {
		    ((eg) this).S[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).j[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).D[i_81_] = var_es_18_.readTribyte(mv.a(i, -6201));
		}
		((eg) this).Y[i_81_] = var_es_19_.readByte(-20933);
		((eg) this).y[i_81_] = var_es_20_.readByte(-20933);
		((eg) this).V[i_81_] = var_es_21_.readByte(-20933);
	    }
	    if (i_82_ == 2) {
		((eg) this).p[i_81_] = (short) var_es_17_.readShort(13111);
		((eg) this).h[i_81_] = (short) var_es_17_.readShort(13111);
		((eg) this).x[i_81_] = (short) var_es_17_.readShort(13111);
		if (((eg) this).bb >= 15) {
		    ((eg) this).S[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).j[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).D[i_81_] = var_es_18_.readTribyte(-1);
		} else {
		    ((eg) this).S[i_81_] = var_es_18_.readShort(13111);
		    if (((eg) this).bb < 14)
			((eg) this).j[i_81_] = var_es_18_.readShort(13111);
		    else
			((eg) this).j[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).D[i_81_] = var_es_18_.readShort(13111);
		}
		((eg) this).Y[i_81_] = var_es_19_.readByte(-20933);
		((eg) this).y[i_81_] = var_es_20_.readByte(-20933);
		((eg) this).V[i_81_] = var_es_21_.readByte(-20933);
		((eg) this).k[i_81_] = var_es_21_.readByte(-20933);
		((eg) this).d[i_81_] = var_es_21_.readByte(-20933);
	    }
	    if (i_82_ == 3) {
		((eg) this).p[i_81_] = (short) var_es_17_.readShort(mv.a(i, 11023));
		((eg) this).h[i_81_] = (short) var_es_17_.readShort(i + 6911);
		((eg) this).x[i_81_] = (short) var_es_17_.readShort(13111);
		if (((eg) this).bb < 15) {
		    ((eg) this).S[i_81_] = var_es_18_.readShort(13111);
		    if (((eg) this).bb < 14)
			((eg) this).j[i_81_] = var_es_18_.readShort(13111);
		    else
			((eg) this).j[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).D[i_81_] = var_es_18_.readShort(13111);
		} else {
		    ((eg) this).S[i_81_] = var_es_18_.readTribyte(i - 6201);
		    ((eg) this).j[i_81_] = var_es_18_.readTribyte(-1);
		    ((eg) this).D[i_81_] = var_es_18_.readTribyte(mv.a(i, -6201));
		}
		((eg) this).Y[i_81_] = var_es_19_.readByte(mv.a(i, -18941));
		((eg) this).y[i_81_] = var_es_20_.readByte(-20933);
		((eg) this).V[i_81_] = var_es_21_.readByte(-20933);
	    }
	}
	((BytesParser) var_es).pos = i_64_;
	if (bool_24_) {
	    int i_83_ = var_es.readUnsignedByte(-9268);
	    if (i_83_ > 0) {
		((eg) this).q = new hi[i_83_];
		for (int i_84_ = 0; i_83_ > i_84_; i_84_++) {
		    int i_85_ = var_es.readShort(13111);
		    int i_86_ = var_es.readShort(13111);
		    byte i_87_;
		    if (i_27_ == 255)
			i_87_ = ((eg) this).w[i_86_];
		    else
			i_87_ = (byte) i_27_;
		    ((eg) this).q[i_84_] = new hi(i_85_, ((eg) this).O[i_86_],
						  ((eg) this).v[i_86_],
						  ((eg) this).a[i_86_], i_87_);
		}
	    }
	    int i_88_ = var_es.readUnsignedByte(-9268);
	    if (i_88_ > 0) {
		((eg) this).i = new qg[i_88_];
		for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
		    int i_90_ = var_es.readShort(13111);
		    int i_91_ = var_es.readShort(13111);
		    ((eg) this).i[i_89_] = new qg(i_90_, i_91_);
		}
	    }
	}
	if (bool_25_) {
	    int i_92_ = var_es.readUnsignedByte(-9268);
	    if (i_92_ > 0) {
		((eg) this).N = new lw[i_92_];
		for (int i_93_ = 0; i_92_ > i_93_; i_93_++) {
		    int i_94_ = var_es.readShort(i + 6911);
		    int i_95_ = var_es.readShort(i + 6911);
		    int i_96_ = var_es.readUnsignedByte(-9268);
		    byte i_97_ = var_es.readByte(-20933);
		    ((eg) this).N[i_93_] = new lw(i_94_, i_95_, i_96_, i_97_);
		}
	    }
	}
    }
    
    private final int a(int i, eg var_eg_98_, int i_99_, short i_100_) {
	K++;
	int i_101_ = ((eg) var_eg_98_).o[i];
	int i_102_ = ((eg) var_eg_98_).W[i];
	int i_103_ = ((eg) var_eg_98_).R[i];
	for (int i_104_ = i_99_; ((eg) this).z > i_104_; i_104_++) {
	    if (i_101_ == ((eg) this).o[i_104_]
		&& ((eg) this).W[i_104_] == i_102_
		&& ((eg) this).R[i_104_] == i_103_) {
		((eg) this).f[i_104_]
		    = (short) hba.bitwiseArg1ORArg2(((eg) this).f[i_104_], i_100_);
		return i_104_;
	    }
	}
	((eg) this).o[((eg) this).z] = i_101_;
	((eg) this).W[((eg) this).z] = i_102_;
	((eg) this).R[((eg) this).z] = i_103_;
	((eg) this).f[((eg) this).z] = i_100_;
	((eg) this).Q[((eg) this).z]
	    = ((eg) var_eg_98_).Q == null ? -1 : ((eg) var_eg_98_).Q[i];
	return ((eg) this).z++;
    }
    
    final int[][] a(boolean bool, int i) {
	M++;
	int[] is = new int[256];
	int i_105_ = 0;
	int i_106_ = !bool ? ((eg) this).l : ((eg) this).z;
	int i_107_ = -4 % ((i - 7) / 62);
	for (int i_108_ = 0; i_108_ < i_106_; i_108_++) {
	    int i_109_ = ((eg) this).Q[i_108_];
	    if (i_109_ >= 0) {
		is[i_109_]++;
		if (i_105_ < i_109_)
		    i_105_ = i_109_;
	    }
	}
	int[][] is_110_ = new int[i_105_ + 1][];
	for (int i_111_ = 0; i_111_ <= i_105_; i_111_++) {
	    is_110_[i_111_] = new int[is[i_111_]];
	    is[i_111_] = 0;
	}
	for (int i_112_ = 0; i_106_ > i_112_; i_112_++) {
	    int i_113_ = ((eg) this).Q[i_112_];
	    if (i_113_ >= 0)
		is_110_[i_113_][is[i_113_]++] = i_112_;
	}
	return is_110_;
    }
    
    final void a(short i, int i_114_, short i_115_) {
	E++;
	if (((eg) this).B != null) {
	    for (int i_116_ = 0; i_116_ < ((eg) this).G; i_116_++) {
		if (((eg) this).B[i_116_] == i)
		    ((eg) this).B[i_116_] = i_115_;
	    }
	    int i_117_ = -43 % ((i_114_ - 35) / 63);
	}
    }
    
    final int a(int i, short i_118_, byte i_119_, byte i_120_, int i_121_,
		int i_122_, short i_123_, int i_124_, byte i_125_) {
	ab++;
	((eg) this).O[((eg) this).G] = (short) i_124_;
	((eg) this).v[((eg) this).G] = (short) i_121_;
	if (i_122_ != 0)
	    return 10;
	((eg) this).a[((eg) this).G] = (short) i;
	((eg) this).U[((eg) this).G] = i_125_;
	((eg) this).e[((eg) this).G] = i_119_;
	((eg) this).Z[((eg) this).G] = i_118_;
	((eg) this).m[((eg) this).G] = i_120_;
	((eg) this).B[((eg) this).G] = i_123_;
	return ((eg) this).G++;
    }
    
    public static void a(byte i) {
	T = null;
	if (i != 80)
	    T = null;
    }
    
    static final void a(int i) {
	if (i == 0) {
	    g++;
	    nfa.a.b((byte) 69);
	}
    }
    
    final void b(int i, int i_126_, int i_127_, int i_128_) {
	u++;
	if (i_127_ != 0) {
	    int i_129_ = GameInPacket.h[i_127_];
	    int i_130_ = GameInPacket.i[i_127_];
	    for (int i_131_ = 0; i_131_ < ((eg) this).z; i_131_++) {
		int i_132_ = ((i_130_ * ((eg) this).o[i_131_]
			       + ((eg) this).W[i_131_] * i_129_)
			      >> 14);
		((eg) this).W[i_131_]
		    = (((eg) this).W[i_131_] * i_130_
		       - ((eg) this).o[i_131_] * i_129_) >> 14;
		((eg) this).o[i_131_] = i_132_;
	    }
	}
	if (i != 0) {
	    int i_133_ = GameInPacket.h[i];
	    int i_134_ = GameInPacket.i[i];
	    for (int i_135_ = 0; i_135_ < ((eg) this).z; i_135_++) {
		int i_136_ = ((i_134_ * ((eg) this).W[i_135_]
			       - ((eg) this).R[i_135_] * i_133_)
			      >> 14);
		((eg) this).R[i_135_]
		    = (((eg) this).W[i_135_] * i_133_
		       + ((eg) this).R[i_135_] * i_134_) >> 14;
		((eg) this).W[i_135_] = i_136_;
	    }
	}
	if (i_128_ != 0) {
	    int i_137_ = GameInPacket.h[i_128_];
	    int i_138_ = GameInPacket.i[i_128_];
	    for (int i_139_ = 0; i_139_ < ((eg) this).z; i_139_++) {
		int i_140_ = ((i_137_ * ((eg) this).R[i_139_]
			       + ((eg) this).o[i_139_] * i_138_)
			      >> 14);
		((eg) this).R[i_139_]
		    = (i_138_ * ((eg) this).R[i_139_]
		       - ((eg) this).o[i_139_] * i_137_) >> 14;
		((eg) this).o[i_139_] = i_140_;
	    }
	}
	if (i_126_ != 19068)
	    a(41, (byte) -93, -36, 1);
    }
    
    final void a(byte i, int i_141_) {
	r++;
	for (int i_142_ = 0; ((eg) this).z > i_142_; i_142_++) {
	    ((eg) this).o[i_142_] <<= i_141_;
	    ((eg) this).W[i_142_] <<= i_141_;
	    ((eg) this).R[i_142_] <<= i_141_;
	}
	if (i != -107)
	    ((eg) this).C = null;
	if (((eg) this).L > 0 && ((eg) this).S != null) {
	    for (int i_143_ = 0; ((eg) this).S.length > i_143_; i_143_++) {
		((eg) this).S[i_143_] <<= i_141_;
		((eg) this).j[i_143_] <<= i_141_;
		if (((eg) this).F[i_143_] != 1)
		    ((eg) this).D[i_143_] <<= i_141_;
	    }
	}
    }
    
    private final void a(byte[] is, byte i) {
	J++;
	boolean bool = false;
	boolean bool_144_ = false;
	BytesParser var_es = new BytesParser(is);
	BytesParser var_es_145_ = new BytesParser(is);
	BytesParser var_es_146_ = new BytesParser(is);
	BytesParser var_es_147_ = new BytesParser(is);
	BytesParser var_es_148_ = new BytesParser(is);
	((BytesParser) var_es).pos = is.length - 18;
	((eg) this).z = var_es.readShort(13111);
	((eg) this).G = var_es.readShort(13111);
	((eg) this).L = var_es.readUnsignedByte(-9268);
	int i_149_ = var_es.readUnsignedByte(-9268);
	int i_150_ = var_es.readUnsignedByte(-9268);
	int i_151_ = var_es.readUnsignedByte(-9268);
	int i_152_ = var_es.readUnsignedByte(-9268);
	int i_153_ = var_es.readUnsignedByte(-9268);
	int i_154_ = var_es.readShort(13111);
	int i_155_ = var_es.readShort(13111);
	int i_156_ = var_es.readShort(13111);
	int i_157_ = var_es.readShort(13111);
	int i_158_ = 0;
	int i_159_ = i_158_;
	i_158_ += ((eg) this).z;
	int i_160_ = i_158_;
	if (i > -19)
	    ((eg) this).bb = -105;
	i_158_ += ((eg) this).G;
	int i_161_ = i_158_;
	if (i_150_ == 255)
	    i_158_ += ((eg) this).G;
	int i_162_ = i_158_;
	if (i_152_ == 1)
	    i_158_ += ((eg) this).G;
	int i_163_ = i_158_;
	if (i_149_ == 1)
	    i_158_ += ((eg) this).G;
	int i_164_ = i_158_;
	if (i_153_ == 1)
	    i_158_ += ((eg) this).z;
	int i_165_ = i_158_;
	if (i_151_ == 1)
	    i_158_ += ((eg) this).G;
	int i_166_ = i_158_;
	i_158_ += i_157_;
	int i_167_ = i_158_;
	i_158_ += 2 * ((eg) this).G;
	int i_168_ = i_158_;
	i_158_ += ((eg) this).L * 6;
	int i_169_ = i_158_;
	i_158_ += i_154_;
	int i_170_ = i_158_;
	i_158_ += i_155_;
	int i_171_ = i_158_;
	if (i_150_ != 255)
	    ((eg) this).c = (byte) i_150_;
	else
	    ((eg) this).w = new byte[((eg) this).G];
	((BytesParser) var_es).pos = i_159_;
	if (((eg) this).L > 0) {
	    ((eg) this).F = new byte[((eg) this).L];
	    ((eg) this).x = new short[((eg) this).L];
	    ((eg) this).h = new short[((eg) this).L];
	    ((eg) this).p = new short[((eg) this).L];
	}
	if (i_149_ == 1) {
	    ((eg) this).B = new short[((eg) this).G];
	    ((eg) this).e = new byte[((eg) this).G];
	    ((eg) this).U = new byte[((eg) this).G];
	}
	if (i_152_ == 1)
	    ((eg) this).s = new int[((eg) this).G];
	((eg) this).R = new int[((eg) this).z];
	i_158_ += i_156_;
	if (i_151_ == 1)
	    ((eg) this).m = new byte[((eg) this).G];
	((eg) this).a = new short[((eg) this).G];
	((eg) this).O = new short[((eg) this).G];
	((eg) this).v = new short[((eg) this).G];
	((eg) this).o = new int[((eg) this).z];
	((eg) this).Z = new short[((eg) this).G];
	if (i_153_ == 1)
	    ((eg) this).Q = new int[((eg) this).z];
	((eg) this).W = new int[((eg) this).z];
	((BytesParser) var_es_145_).pos = i_169_;
	((BytesParser) var_es_146_).pos = i_170_;
	((BytesParser) var_es_147_).pos = i_171_;
	((BytesParser) var_es_148_).pos = i_164_;
	int i_172_ = 0;
	int i_173_ = 0;
	int i_174_ = 0;
	for (int i_175_ = 0; ((eg) this).z > i_175_; i_175_++) {
	    int i_176_ = var_es.readUnsignedByte(-9268);
	    int i_177_ = 0;
	    if ((0x1 & i_176_) != 0)
		i_177_ = var_es_145_.readSmart(-9561);
	    int i_178_ = 0;
	    if ((0x2 & i_176_) != 0)
		i_178_ = var_es_146_.readSmart(-9561);
	    int i_179_ = 0;
	    if ((i_176_ & 0x4) != 0)
		i_179_ = var_es_147_.readSmart(-9561);
	    ((eg) this).o[i_175_] = i_172_ + i_177_;
	    ((eg) this).W[i_175_] = i_178_ + i_173_;
	    ((eg) this).R[i_175_] = i_174_ + i_179_;
	    i_172_ = ((eg) this).o[i_175_];
	    i_173_ = ((eg) this).W[i_175_];
	    i_174_ = ((eg) this).R[i_175_];
	    if (i_153_ == 1)
		((eg) this).Q[i_175_] = var_es_148_.readUnsignedByte(-9268);
	}
	((BytesParser) var_es).pos = i_167_;
	((BytesParser) var_es_145_).pos = i_163_;
	((BytesParser) var_es_146_).pos = i_161_;
	((BytesParser) var_es_147_).pos = i_165_;
	((BytesParser) var_es_148_).pos = i_162_;
	for (int i_180_ = 0; i_180_ < ((eg) this).G; i_180_++) {
	    ((eg) this).Z[i_180_] = (short) var_es.readShort(13111);
	    if (i_149_ == 1) {
		int i_181_ = var_es_145_.readUnsignedByte(-9268);
		if ((i_181_ & 0x1) == 1) {
		    ((eg) this).U[i_180_] = (byte) 1;
		    bool = true;
		} else
		    ((eg) this).U[i_180_] = (byte) 0;
		if ((i_181_ & 0x2) != 2) {
		    ((eg) this).e[i_180_] = (byte) -1;
		    ((eg) this).B[i_180_] = (short) -1;
		} else {
		    ((eg) this).e[i_180_] = (byte) (i_181_ >> 2);
		    ((eg) this).B[i_180_] = ((eg) this).Z[i_180_];
		    ((eg) this).Z[i_180_] = (short) 127;
		    if ((((eg) this).B[i_180_] ^ 0xffffffff) != 0)
			bool_144_ = true;
		}
	    }
	    if (i_150_ == 255)
		((eg) this).w[i_180_] = var_es_146_.readByte(-20933);
	    if (i_151_ == 1)
		((eg) this).m[i_180_] = var_es_147_.readByte(-20933);
	    if (i_152_ == 1)
		((eg) this).s[i_180_] = var_es_148_.readUnsignedByte(-9268);
	}
	((BytesParser) var_es).pos = i_166_;
	((eg) this).l = -1;
	((BytesParser) var_es_145_).pos = i_160_;
	short i_182_ = 0;
	short i_183_ = 0;
	short i_184_ = 0;
	int i_185_ = 0;
	for (int i_186_ = 0; i_186_ < ((eg) this).G; i_186_++) {
	    int i_187_ = var_es_145_.readUnsignedByte(-9268);
	    if (i_187_ == 1) {
		i_182_ = (short) (i_185_ + var_es.readSmart(-9561));
		i_185_ = i_182_;
		i_183_ = (short) (i_185_ + var_es.readSmart(-9561));
		i_185_ = i_183_;
		i_184_ = (short) (i_185_ + var_es.readSmart(-9561));
		i_185_ = i_184_;
		((eg) this).O[i_186_] = i_182_;
		((eg) this).v[i_186_] = i_183_;
		((eg) this).a[i_186_] = i_184_;
		if (i_182_ > ((eg) this).l)
		    ((eg) this).l = i_182_;
		if (i_183_ > ((eg) this).l)
		    ((eg) this).l = i_183_;
		if (((eg) this).l < i_184_)
		    ((eg) this).l = i_184_;
	    }
	    if (i_187_ == 2) {
		i_183_ = i_184_;
		i_184_ = (short) (var_es.readSmart(-9561) + i_185_);
		((eg) this).O[i_186_] = i_182_;
		i_185_ = i_184_;
		((eg) this).v[i_186_] = i_183_;
		((eg) this).a[i_186_] = i_184_;
		if (((eg) this).l < i_184_)
		    ((eg) this).l = i_184_;
	    }
	    if (i_187_ == 3) {
		i_182_ = i_184_;
		i_184_ = (short) (i_185_ + var_es.readSmart(-9561));
		((eg) this).O[i_186_] = i_182_;
		i_185_ = i_184_;
		((eg) this).v[i_186_] = i_183_;
		((eg) this).a[i_186_] = i_184_;
		if (i_184_ > ((eg) this).l)
		    ((eg) this).l = i_184_;
	    }
	    if (i_187_ == 4) {
		short i_188_ = i_182_;
		i_182_ = i_183_;
		i_184_ = (short) (i_185_ + var_es.readSmart(-9561));
		i_183_ = i_188_;
		i_185_ = i_184_;
		((eg) this).O[i_186_] = i_182_;
		((eg) this).v[i_186_] = i_183_;
		((eg) this).a[i_186_] = i_184_;
		if (((eg) this).l < i_184_)
		    ((eg) this).l = i_184_;
	    }
	}
	((eg) this).l++;
	((BytesParser) var_es).pos = i_168_;
	for (int i_189_ = 0; ((eg) this).L > i_189_; i_189_++) {
	    ((eg) this).F[i_189_] = (byte) 0;
	    ((eg) this).p[i_189_] = (short) var_es.readShort(13111);
	    ((eg) this).h[i_189_] = (short) var_es.readShort(13111);
	    ((eg) this).x[i_189_] = (short) var_es.readShort(13111);
	}
	if (((eg) this).e != null) {
	    boolean bool_190_ = false;
	    for (int i_191_ = 0; ((eg) this).G > i_191_; i_191_++) {
		int i_192_ = 0xff & ((eg) this).e[i_191_];
		if (i_192_ != 255) {
		    if (((0xffff & ((eg) this).p[i_192_])
			 != ((eg) this).O[i_191_])
			|| ((((eg) this).h[i_192_] & 0xffff)
			    != ((eg) this).v[i_191_])
			|| ((eg) this).a[i_191_] != (0xffff
						     & ((eg) this).x[i_192_]))
			bool_190_ = true;
		    else
			((eg) this).e[i_191_] = (byte) -1;
		}
	    }
	    if (!bool_190_)
		((eg) this).e = null;
	}
	if (!bool)
	    ((eg) this).U = null;
	if (!bool_144_)
	    ((eg) this).B = null;
    }
    
    final int[][] b(byte i) {
	P++;
	int[] is = new int[256];
	int i_193_ = 0;
	for (int i_194_ = 0; ((eg) this).G > i_194_; i_194_++) {
	    int i_195_ = ((eg) this).s[i_194_];
	    if (i_195_ >= 0) {
		if (i_195_ > i_193_)
		    i_193_ = i_195_;
		is[i_195_]++;
	    }
	}
	int[][] is_196_ = new int[i_193_ + 1][];
	for (int i_197_ = 0; i_193_ >= i_197_; i_197_++) {
	    is_196_[i_197_] = new int[is[i_197_]];
	    is[i_197_] = 0;
	}
	if (i != 24)
	    b(-115, 81, 37, 71);
	for (int i_198_ = 0; i_198_ < ((eg) this).G; i_198_++) {
	    int i_199_ = ((eg) this).s[i_198_];
	    if (i_199_ >= 0)
		is_196_[i_199_][is[i_199_]++] = i_198_;
	}
	return is_196_;
    }
    
    static final void a(int i, String string, String string_200_) {
	jl.s = 1;
	if (i >= 5) {
	    H++;
	    pda.y = -1;
	    dq.a(false, string, -95, string_200_);
	}
    }
    
    final void a(short i, byte i_201_, short i_202_) {
	int i_203_ = 0;
	int i_204_ = -6 % ((-5 - i_201_) / 40);
	for (/**/; i_203_ < ((eg) this).G; i_203_++) {
	    if (i == ((eg) this).Z[i_203_])
		((eg) this).Z[i_203_] = i_202_;
	}
	A++;
    }
    
    final int[][] b(int i) {
	int i_205_ = -121 / ((37 - i) / 48);
	t++;
	int[] is = new int[256];
	int i_206_ = 0;
	for (int i_207_ = 0; ((eg) this).N.length > i_207_; i_207_++) {
	    int i_208_ = ((lw) ((eg) this).N[i_207_]).h;
	    if (i_208_ >= 0) {
		if (i_208_ > i_206_)
		    i_206_ = i_208_;
		is[i_208_]++;
	    }
	}
	int[][] is_209_ = new int[i_206_ + 1][];
	for (int i_210_ = 0; i_210_ <= i_206_; i_210_++) {
	    is_209_[i_210_] = new int[is[i_210_]];
	    is[i_210_] = 0;
	}
	for (int i_211_ = 0; i_211_ < ((eg) this).N.length; i_211_++) {
	    int i_212_ = ((lw) ((eg) this).N[i_211_]).h;
	    if (i_212_ >= 0)
		is_209_[i_212_][is[i_212_]++] = i_211_;
	}
	return is_209_;
    }
    
    public eg() {
	((eg) this).c = (byte) 0;
	((eg) this).L = 0;
	((eg) this).z = 0;
	((eg) this).G = 0;
	((eg) this).bb = 12;
    }
    
    eg(byte[] is) {
	((eg) this).c = (byte) 0;
	((eg) this).L = 0;
	((eg) this).z = 0;
	((eg) this).G = 0;
	((eg) this).bb = 12;
	if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
	    a(is, 6200);
	else
	    a(is, (byte) -119);
    }
    
    eg(int i, int i_213_, int i_214_) {
	((eg) this).c = (byte) 0;
	((eg) this).L = 0;
	((eg) this).z = 0;
	((eg) this).G = 0;
	((eg) this).bb = 12;
	((eg) this).O = new short[i_213_];
	((eg) this).w = new byte[i_213_];
	((eg) this).W = new int[i];
	((eg) this).Z = new short[i_213_];
	((eg) this).m = new byte[i_213_];
	if (i_214_ > 0) {
	    ((eg) this).F = new byte[i_214_];
	    ((eg) this).p = new short[i_214_];
	    ((eg) this).x = new short[i_214_];
	    ((eg) this).D = new int[i_214_];
	    ((eg) this).h = new short[i_214_];
	    ((eg) this).j = new int[i_214_];
	    ((eg) this).S = new int[i_214_];
	    ((eg) this).V = new int[i_214_];
	    ((eg) this).k = new int[i_214_];
	    ((eg) this).Y = new byte[i_214_];
	    ((eg) this).d = new int[i_214_];
	    ((eg) this).y = new byte[i_214_];
	}
	((eg) this).v = new short[i_213_];
	((eg) this).e = new byte[i_213_];
	((eg) this).a = new short[i_213_];
	((eg) this).Q = new int[i];
	((eg) this).R = new int[i];
	((eg) this).U = new byte[i_213_];
	((eg) this).s = new int[i_213_];
	((eg) this).o = new int[i];
	((eg) this).B = new short[i_213_];
    }
    
    eg(eg[] var_egs, int i) {
	((eg) this).c = (byte) 0;
	((eg) this).L = 0;
	((eg) this).z = 0;
	((eg) this).G = 0;
	((eg) this).bb = 12;
	((eg) this).L = 0;
	((eg) this).G = 0;
	((eg) this).z = 0;
	int i_215_ = 0;
	int i_216_ = 0;
	int i_217_ = 0;
	boolean bool = false;
	boolean bool_218_ = false;
	boolean bool_219_ = false;
	boolean bool_220_ = false;
	boolean bool_221_ = false;
	((eg) this).c = (byte) -1;
	boolean bool_222_ = false;
	for (int i_223_ = 0; i_223_ < i; i_223_++) {
	    eg var_eg_224_ = var_egs[i_223_];
	    if (var_eg_224_ != null) {
		((eg) this).G += ((eg) var_eg_224_).G;
		((eg) this).L += ((eg) var_eg_224_).L;
		((eg) this).z += ((eg) var_eg_224_).z;
		if (((eg) var_eg_224_).i != null)
		    i_216_ += ((eg) var_eg_224_).i.length;
		bool = bool | ((eg) var_eg_224_).U != null;
		if (((eg) var_eg_224_).N != null)
		    i_217_ += ((eg) var_eg_224_).N.length;
		if (((eg) var_eg_224_).q != null)
		    i_215_ += ((eg) var_eg_224_).q.length;
		bool_220_ = bool_220_ | ((eg) var_eg_224_).e != null;
		bool_221_ = bool_221_ | ((eg) var_eg_224_).B != null;
		bool_219_ = bool_219_ | ((eg) var_eg_224_).m != null;
		if (((eg) var_eg_224_).w == null) {
		    if ((((eg) this).c ^ 0xffffffff) == 0)
			((eg) this).c = ((eg) var_eg_224_).c;
		    if (((eg) var_eg_224_).c != ((eg) this).c)
			bool_218_ = true;
		} else
		    bool_218_ = true;
		bool_222_ = bool_222_ | ((eg) var_eg_224_).s != null;
	    }
	}
	if (i_217_ > 0)
	    ((eg) this).N = new lw[i_217_];
	if (bool_219_)
	    ((eg) this).m = new byte[((eg) this).G];
	((eg) this).Q = new int[((eg) this).z];
	((eg) this).o = new int[((eg) this).z];
	if (bool_220_)
	    ((eg) this).e = new byte[((eg) this).G];
	if (((eg) this).L > 0) {
	    ((eg) this).j = new int[((eg) this).L];
	    ((eg) this).F = new byte[((eg) this).L];
	    ((eg) this).V = new int[((eg) this).L];
	    ((eg) this).S = new int[((eg) this).L];
	    ((eg) this).d = new int[((eg) this).L];
	    ((eg) this).Y = new byte[((eg) this).L];
	    ((eg) this).h = new short[((eg) this).L];
	    ((eg) this).p = new short[((eg) this).L];
	    ((eg) this).k = new int[((eg) this).L];
	    ((eg) this).D = new int[((eg) this).L];
	    ((eg) this).y = new byte[((eg) this).L];
	    ((eg) this).x = new short[((eg) this).L];
	}
	if (i_215_ > 0)
	    ((eg) this).q = new hi[i_215_];
	((eg) this).Z = new short[((eg) this).G];
	((eg) this).f = new short[((eg) this).z];
	if (i_216_ > 0)
	    ((eg) this).i = new qg[i_216_];
	((eg) this).C = new short[((eg) this).G];
	((eg) this).W = new int[((eg) this).z];
	if (bool_222_)
	    ((eg) this).s = new int[((eg) this).G];
	((eg) this).R = new int[((eg) this).z];
	if (bool)
	    ((eg) this).U = new byte[((eg) this).G];
	((eg) this).O = new short[((eg) this).G];
	if (bool_221_)
	    ((eg) this).B = new short[((eg) this).G];
	((eg) this).v = new short[((eg) this).G];
	if (bool_218_)
	    ((eg) this).w = new byte[((eg) this).G];
	((eg) this).a = new short[((eg) this).G];
	i_216_ = 0;
	((eg) this).z = 0;
	((eg) this).L = 0;
	i_217_ = 0;
	((eg) this).G = 0;
	i_215_ = 0;
	for (int i_225_ = 0; i_225_ < i; i_225_++) {
	    short i_226_ = (short) (1 << i_225_);
	    eg var_eg_227_ = var_egs[i_225_];
	    if (var_eg_227_ != null) {
		if (((eg) var_eg_227_).N != null) {
		    for (int i_228_ = 0; ((eg) var_eg_227_).N.length > i_228_;
			 i_228_++) {
			lw var_lw = ((eg) var_eg_227_).N[i_228_];
			((eg) this).N[i_217_++]
			    = var_lw.a(0, ((eg) this).G + ((lw) var_lw).c);
		    }
		}
		for (int i_229_ = 0; i_229_ < ((eg) var_eg_227_).G; i_229_++) {
		    if (bool && ((eg) var_eg_227_).U != null)
			((eg) this).U[((eg) this).G]
			    = ((eg) var_eg_227_).U[i_229_];
		    if (bool_218_) {
			if (((eg) var_eg_227_).w == null)
			    ((eg) this).w[((eg) this).G]
				= ((eg) var_eg_227_).c;
			else
			    ((eg) this).w[((eg) this).G]
				= ((eg) var_eg_227_).w[i_229_];
		    }
		    if (bool_219_ && ((eg) var_eg_227_).m != null)
			((eg) this).m[((eg) this).G]
			    = ((eg) var_eg_227_).m[i_229_];
		    if (bool_221_) {
			if (((eg) var_eg_227_).B != null)
			    ((eg) this).B[((eg) this).G]
				= ((eg) var_eg_227_).B[i_229_];
			else
			    ((eg) this).B[((eg) this).G] = (short) -1;
		    }
		    if (bool_222_) {
			if (((eg) var_eg_227_).s != null)
			    ((eg) this).s[((eg) this).G]
				= ((eg) var_eg_227_).s[i_229_];
			else
			    ((eg) this).s[((eg) this).G] = -1;
		    }
		    ((eg) this).O[((eg) this).G]
			= (short) a(((eg) var_eg_227_).O[i_229_], var_eg_227_,
				    0, i_226_);
		    ((eg) this).v[((eg) this).G]
			= (short) a(((eg) var_eg_227_).v[i_229_], var_eg_227_,
				    0, i_226_);
		    ((eg) this).a[((eg) this).G]
			= (short) a(((eg) var_eg_227_).a[i_229_], var_eg_227_,
				    0, i_226_);
		    ((eg) this).C[((eg) this).G] = i_226_;
		    ((eg) this).Z[((eg) this).G]
			= ((eg) var_eg_227_).Z[i_229_];
		    ((eg) this).G++;
		}
		if (((eg) var_eg_227_).q != null) {
		    for (int i_230_ = 0; ((eg) var_eg_227_).q.length > i_230_;
			 i_230_++) {
			int i_231_ = a(((hi) ((eg) var_eg_227_).q[i_230_]).d,
				       var_eg_227_, 0, i_226_);
			int i_232_ = a(((hi) ((eg) var_eg_227_).q[i_230_]).g,
				       var_eg_227_, 0, i_226_);
			int i_233_ = a(((hi) ((eg) var_eg_227_).q[i_230_]).e,
				       var_eg_227_, 0, i_226_);
			((eg) this).q[i_215_]
			    = ((eg) var_eg_227_).q[i_230_]
				  .a(i_232_, i_231_, i_233_, (byte) 11);
			i_215_++;
		    }
		}
		if (((eg) var_eg_227_).i != null) {
		    for (int i_234_ = 0; ((eg) var_eg_227_).i.length > i_234_;
			 i_234_++) {
			int i_235_ = a(((qg) ((eg) var_eg_227_).i[i_234_]).b,
				       var_eg_227_, 0, i_226_);
			((eg) this).i[i_216_]
			    = ((eg) var_eg_227_).i[i_234_].a(i_235_,
							     (byte) 79);
			i_216_++;
		    }
		}
	    }
	}
	((eg) this).l = ((eg) this).z;
	int i_236_ = 0;
	for (int i_237_ = 0; i > i_237_; i_237_++) {
	    short i_238_ = (short) (1 << i_237_);
	    eg var_eg_239_ = var_egs[i_237_];
	    if (var_eg_239_ != null) {
		for (int i_240_ = 0; i_240_ < ((eg) var_eg_239_).G; i_240_++) {
		    if (bool_220_)
			((eg) this).e[i_236_++]
			    = (byte) ((((eg) var_eg_239_).e == null
				       || (((eg) var_eg_239_).e[i_240_]
					   ^ 0xffffffff) == 0)
				      ? -1
				      : (((eg) this).L
					 + ((eg) var_eg_239_).e[i_240_]));
		}
		for (int i_241_ = 0; i_241_ < ((eg) var_eg_239_).L; i_241_++) {
		    byte i_242_ = (((eg) this).F[((eg) this).L]
				   = ((eg) var_eg_239_).F[i_241_]);
		    if (i_242_ == 0) {
			((eg) this).p[((eg) this).L]
			    = (short) a(((eg) var_eg_239_).p[i_241_],
					var_eg_239_, 0, i_238_);
			((eg) this).h[((eg) this).L]
			    = (short) a(((eg) var_eg_239_).h[i_241_],
					var_eg_239_, 0, i_238_);
			((eg) this).x[((eg) this).L]
			    = (short) a(((eg) var_eg_239_).x[i_241_],
					var_eg_239_, 0, i_238_);
		    }
		    if (i_242_ >= 1 && i_242_ <= 3) {
			((eg) this).p[((eg) this).L]
			    = ((eg) var_eg_239_).p[i_241_];
			((eg) this).h[((eg) this).L]
			    = ((eg) var_eg_239_).h[i_241_];
			((eg) this).x[((eg) this).L]
			    = ((eg) var_eg_239_).x[i_241_];
			((eg) this).S[((eg) this).L]
			    = ((eg) var_eg_239_).S[i_241_];
			((eg) this).j[((eg) this).L]
			    = ((eg) var_eg_239_).j[i_241_];
			((eg) this).D[((eg) this).L]
			    = ((eg) var_eg_239_).D[i_241_];
			((eg) this).Y[((eg) this).L]
			    = ((eg) var_eg_239_).Y[i_241_];
			((eg) this).y[((eg) this).L]
			    = ((eg) var_eg_239_).y[i_241_];
			((eg) this).V[((eg) this).L]
			    = ((eg) var_eg_239_).V[i_241_];
		    }
		    if (i_242_ == 2) {
			((eg) this).k[((eg) this).L]
			    = ((eg) var_eg_239_).k[i_241_];
			((eg) this).d[((eg) this).L]
			    = ((eg) var_eg_239_).d[i_241_];
		    }
		    ((eg) this).L++;
		}
	    }
	}
    }
}
