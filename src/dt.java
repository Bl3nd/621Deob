/* dt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dt extends pn
{
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    private il v;
    private Class_hb[][] w = new Class_hb[16][128];
    static int x;
    private int[] y;
    static int z;
    static int A;
    static int B;
    private si C;
    static int D;
    private Class_hb[][] E;
    static int F;
    private int[] G;
    static int H;
    private int[] I;
    static int J;
    int[] K;
    static int L;
    static int M;
    private int[] N;
    int[] O;
    static int P;
    static int Q;
    static int R;
    static int S;
    static int T;
    static int U;
    static int V;
    private int[] W;
    static int X;
    static int Y;
    static int Z;
    static int ab;
    private int[] bb;
    private int[] cb;
    static int db;
    static int eb;
    static int fb;
    private int[] gb = new int[16];
    static int hb;
    static int ib;
    int[] jb;
    static int kb;
    static int lb;
    static int mb;
    static int nb;
    static int ob;
    private int[] pb;
    private int qb;
    static int rb;
    private int[] sb;
    static int tb;
    static int ub;
    static int vb;
    private int[] wb;
    static int xb;
    private int[] yb;
    static Class_ec zb = new Class_ec(1);
    private int[] Ab;
    private int Bb;
    static boolean[][] Cb;
    static float Db;
    private eba Eb;
    private long Fb;
    private int Gb;
    private int Hb;
    private long Ib;
    static int[] Jb = new int[200];
    private boolean Kb;
    private int Lb;
    private boolean Mb;
    private vw Nb;
    
    private final void a(int i, int i_0_, int i_1_) {
	if (i > -46)
	    a((byte) 25, (int) -54);
	if (W[i_0_] != i_1_) {
	    W[i_0_] = i_1_;
	    for (int i_2_ = 0; i_2_ < 128; i_2_++)
		E[i_0_][i_2_] = null;
	}
	V++;
    }
    
    final synchronized void b(int[] is, int i, int i_3_) {
	if (C.c()) {
	    int i_4_ = qb * ((si) C).c / gba.samplesPerSec;
	    do {
		long l = (long) i_4_ * (long) i_3_ + Fb;
		if (Ib - l >= 0L) {
		    Fb = l;
		    break;
		}
		int i_5_
		    = (int) (((long) i_4_ - 1L + (Ib - Fb)) / (long) i_4_);
		Fb += (long) i_5_ * (long) i_4_;
		Eb.b(is, i, i_5_);
		i_3_ -= i_5_;
		i += i_5_;
		c((byte) 71);
	    } while (C.c());
	}
	hb++;
	Eb.b(is, i, i_3_);
    }
    
    final synchronized pn a() {
	x++;
	return Eb;
    }
    
    final synchronized void b(int i, int i_6_, int i_7_) {
	lb++;
	if (i_7_ != 18959)
	    Hb = 11;
	a(i, (byte) -75, i_6_);
    }
    
    final synchronized void a(long l, vw var_vw, int i, boolean bool,
			      boolean bool_8_) {
	a(bool_8_, -1024, bool, var_vw);
	db++;
	a(l * (long) ((si) C).c, 127);
	if (i >= -96)
	    a((int) -24, (int) -81);
    }
    
    private final void a(int i, int i_9_) {
	q++;
	for (Class_hb class_hb = (Class_hb) ((eba) Eb).w.a((int) 110);
	     class_hb != null;
	     class_hb = (Class_hb) ((eba) Eb).w.b((byte) 97)) {
	    if ((i_9_ < 0 || ((Class_hb) class_hb).m == i_9_)
		&& ((Class_hb) class_hb).E < 0) {
		w[((Class_hb) class_hb).m][((Class_hb) class_hb).A] = null;
		((Class_hb) class_hb).E = 0;
	    }
	}
	if (i != 0)
	    C = null;
    }
    
    final synchronized void a(int i) {
	Y++;
	if (C.c()) {
	    int i_10_ = ((si) C).c * qb / gba.samplesPerSec;
	    do {
		long l = Fb + (long) i * (long) i_10_;
		if (Ib - l >= 0L) {
		    Fb = l;
		    break;
		}
		int i_11_
		    = (int) ((Ib - Fb - (-(long) i_10_ + 1L)) / (long) i_10_);
		Fb += (long) i_11_ * (long) i_10_;
		Eb.a(i_11_);
		i -= i_11_;
		c((byte) 73);
	    } while (C.c());
	}
	Eb.a(i);
    }
    
    final synchronized void b(int i, int i_12_) {
	Bb = i_12_;
	L++;
	if (i > -13)
	    d((byte) 82);
    }
    
    final synchronized void a(byte i) {
	p++;
	for (ul var_ul = (ul) v.b((byte) 124); var_ul != null;
	     var_ul = (ul) v.b(12561))
	    var_ul.unlink(-65);
	int i_13_ = 47 / ((i - 40) / 61);
    }
    
    final synchronized void b(int i) {
	ub++;
	if (i == 32)
	    b(16, true);
    }
    
    final synchronized void a(vw var_vw, boolean bool, int i) {
	if (i != 4096)
	    a(103, (int) -128, -31);
	a(true, -1024, bool, var_vw);
	M++;
    }
    
    final boolean a(byte i, Class_hb class_hb) {
	if (i != 84)
	    return false;
	kb++;
	if (((Class_hb) class_hb).H == null) {
	    if (((Class_hb) class_hb).E >= 0) {
		class_hb.unlink(i - 205);
		if (((Class_hb) class_hb).k > 0
		    && (E[((Class_hb) class_hb).m][((Class_hb) class_hb).k]
			== class_hb))
		    E[((Class_hb) class_hb).m][((Class_hb) class_hb).k] = null;
	    }
	    return true;
	}
	return false;
    }
    
    private final int a(int i, Class_hb class_hb) {
	ib++;
	int i_14_
	    = (((Class_hb) class_hb).C
	       + (((Class_hb) class_hb).F * ((Class_hb) class_hb).z >> 12));
	i_14_ += ((bb[((Class_hb) class_hb).m] - 8192)
		  * N[((Class_hb) class_hb).m]) >> 12;
	mu var_mu = ((Class_hb) class_hb).G;
	if (((mu) var_mu).b > 0
	    && (((mu) var_mu).c > 0 || Ab[((Class_hb) class_hb).m] > 0)) {
	    int i_15_ = ((mu) var_mu).c << 2;
	    int i_16_ = ((mu) var_mu).d << 1;
	    if (((Class_hb) class_hb).y < i_16_)
		i_15_ = i_15_ * ((Class_hb) class_hb).y / i_16_;
	    i_15_ += Ab[((Class_hb) class_hb).m] >> 7;
	    double d = Math.sin((double) (((Class_hb) class_hb).t & 0x1ff)
				* 0.01227184630308513);
	    i_14_ += (int) (d * (double) i_15_);
	}
	if (i != 908882434)
	    return -118;
	int i_17_
	    = (int) (((double) (((oaa) ((Class_hb) class_hb).q).n * 256)
		      * Math.pow(2.0, (double) i_14_ * 3.255208333333333E-4)
		      / (double) gba.samplesPerSec)
		     + 0.5);
	if (i_17_ >= 1)
	    return i_17_;
	return 1;
    }
    
    private final void a(boolean bool, int i, int i_18_) {
	J++;
	if (bool != false)
	    c((int) -84);
    }
    
    private final void a(int i, int i_19_, int i_20_, int i_21_) {
	H++;
	Class_hb class_hb = w[i_21_][i];
	if (class_hb != null) {
	    w[i_21_][i] = null;
	    if ((0x2 & ((dt) this).O[i_21_] ^ 0xffffffff) == i_20_)
		((Class_hb) class_hb).E = 0;
	    else {
		for (Class_hb class_hb_22_
			 = (Class_hb) ((eba) Eb).w.a((int) 119);
		     class_hb_22_ != null;
		     class_hb_22_ = (Class_hb) ((eba) Eb).w.b((byte) 56)) {
		    if (((Class_hb) class_hb).m == ((Class_hb) class_hb_22_).m
			&& ((Class_hb) class_hb_22_).E < 0
			&& class_hb_22_ != class_hb) {
			((Class_hb) class_hb).E = 0;
			break;
		    }
		}
	    }
	}
    }
    
    final boolean a(int[] is, Class_hb class_hb, int i, int i_23_, int i_24_) {
	D++;
	((Class_hb) class_hb).p = gba.samplesPerSec / 100;
	if (((Class_hb) class_hb).E >= 0 && (((Class_hb) class_hb).H == null
					     || ((Class_hb) class_hb).H.f())) {
	    class_hb.a((byte) -104);
	    class_hb.unlink(-125);
	    if (((Class_hb) class_hb).k > 0
		&& (E[((Class_hb) class_hb).m][((Class_hb) class_hb).k]
		    == class_hb))
		E[((Class_hb) class_hb).m][((Class_hb) class_hb).k] = null;
	    return true;
	}
	int i_25_ = ((Class_hb) class_hb).F;
	if (i_25_ > 0) {
	    i_25_ -= (int) (Math.pow(2.0, ((double) y[((Class_hb) class_hb).m]
					   * 4.921259842519685E-4)) * 16.0
			    + 0.5);
	    if (i_25_ < 0)
		i_25_ = 0;
	    ((Class_hb) class_hb).F = i_25_;
	}
	((Class_hb) class_hb).H.c(a(908882434, class_hb));
	mu var_mu = ((Class_hb) class_hb).G;
	boolean bool = false;
	((Class_hb) class_hb).t += ((mu) var_mu).b;
	((Class_hb) class_hb).y++;
	double d
	    = ((double) ((((Class_hb) class_hb).z * ((Class_hb) class_hb).F
			  >> 12)
			 + (((Class_hb) class_hb).A - 60 << 8))
	       * 5.086263020833333E-6);
	if (((mu) var_mu).a > 0) {
	    if (((mu) var_mu).k <= 0)
		((Class_hb) class_hb).n += 128;
	    else
		((Class_hb) class_hb).n
		    += (int) (128.0 * Math.pow(2.0,
					       d * (double) ((mu) var_mu).k)
			      + 0.5);
	    if (((Class_hb) class_hb).n * ((mu) var_mu).a >= 819200)
		bool = true;
	}
	if (((mu) var_mu).l != null) {
	    if (((mu) var_mu).f <= 0)
		((Class_hb) class_hb).l += 128;
	    else
		((Class_hb) class_hb).l
		    += (int) ((Math.pow(2.0, (double) ((mu) var_mu).f * d)
			       * 128.0)
			      + 0.5);
	    for (/**/; (((Class_hb) class_hb).w < ((mu) var_mu).l.length - 2
			&& (((Class_hb) class_hb).l
			    > (((mu) var_mu).l[((Class_hb) class_hb).w + 2]
			       & 0xff) << 8)); ((Class_hb) class_hb).w += 2) {
		/* empty */
	    }
	    if (((mu) var_mu).l.length - 2 == ((Class_hb) class_hb).w
		&& ((mu) var_mu).l[((Class_hb) class_hb).w + 1] == 0)
		bool = true;
	}
	if (((Class_hb) class_hb).E >= 0 && ((mu) var_mu).h != null
	    && (((dt) this).O[((Class_hb) class_hb).m] & 0x1) == 0
	    && (((Class_hb) class_hb).k < 0
		|| (E[((Class_hb) class_hb).m][((Class_hb) class_hb).k]
		    != class_hb))) {
	    if (((mu) var_mu).i > 0)
		((Class_hb) class_hb).E
		    += (int) ((Math.pow(2.0, (double) ((mu) var_mu).i * d)
			       * 128.0)
			      + 0.5);
	    else
		((Class_hb) class_hb).E += 128;
	    for (/**/;
		 (((mu) var_mu).h.length - 2 > ((Class_hb) class_hb).r
		  && ((((mu) var_mu).h[((Class_hb) class_hb).r + 2] & 0xff)
		      << 8) < ((Class_hb) class_hb).E);
		 ((Class_hb) class_hb).r += 2) {
		/* empty */
	    }
	    if (((mu) var_mu).h.length - 2 == ((Class_hb) class_hb).r)
		bool = true;
	}
	if (bool) {
	    ((Class_hb) class_hb).H.k(((Class_hb) class_hb).p);
	    if (is == null)
		((Class_hb) class_hb).H.a(i_23_);
	    else
		((Class_hb) class_hb).H.b(is, i, i_23_);
	    if (((Class_hb) class_hb).H.l())
		((eba) Eb).B.b(((Class_hb) class_hb).H);
	    class_hb.a((byte) -104);
	    if (((Class_hb) class_hb).E >= 0) {
		class_hb.unlink(-118);
		if (((Class_hb) class_hb).k > 0
		    && class_hb == (E[((Class_hb) class_hb).m]
				    [((Class_hb) class_hb).k]))
		    E[((Class_hb) class_hb).m][((Class_hb) class_hb).k] = null;
	    }
	    return true;
	}
	if (i_24_ != -1908521944)
	    Kb = true;
	((Class_hb) class_hb).H.a(((Class_hb) class_hb).p,
				  b(i_24_ + 1908521942, class_hb),
				  a(class_hb, (byte) -67));
	return false;
    }
    
    public static void b(byte i) {
	Jb = null;
	zb = null;
	Cb = null;
	int i_26_ = -36 / ((i + 70) / 46);
    }
    
    private final synchronized void a(int i, int i_27_, boolean bool) {
	if (i >= 0)
	    G[i] = i_27_;
	else {
	    for (int i_28_ = 0; i_28_ < 16; i_28_++)
		G[i_28_] = i_27_;
	}
	R++;
	if (bool != true)
	    b(52, 43, 73, -69);
    }
    
    private final void c(int i, int i_29_) {
	if ((((dt) this).O[i] & 0x4) != i_29_) {
	    for (Class_hb class_hb = (Class_hb) ((eba) Eb).w.a((int) 93);
		 class_hb != null;
		 class_hb = (Class_hb) ((eba) Eb).w.b((byte) 91)) {
		if (i == ((Class_hb) class_hb).m)
		    ((Class_hb) class_hb).u = 0;
	    }
	}
	U++;
    }
    
    private final void a(byte i, int i_30_) {
	t++;
	int i_31_ = i_30_ & 0xf0;
	if (i_31_ == 128) {
	    int i_32_ = i_30_ & 0xf;
	    int i_33_ = (0x7fe9 & i_30_) >> 8;
	    int i_34_ = 0x7f & i_30_ >> 16;
	    a(i_33_, i_34_, -1, i_32_);
	} else if (i_31_ == 144) {
	    int i_35_ = 0xf & i_30_;
	    int i_36_ = (i_30_ & 0x7fbe) >> 8;
	    int i_37_ = i_30_ >> 16 & 0x7f;
	    if (i_37_ > 0)
		b(i_37_, i_36_, i_35_, -15982);
	    else
		a(i_36_, 64, -1, i_35_);
	} else if (i_31_ == 160) {
	    int i_38_ = i_30_ & 0xf;
	    int i_39_ = i_30_ >> 8 & 0x7f;
	    int i_40_ = (i_30_ & 0x7fa9a3) >> 16;
	    a(i_38_, i_39_, false, i_40_);
	} else if (i_31_ == 176) {
	    int i_41_ = 0xf & i_30_;
	    int i_42_ = (0x7f7c & i_30_) >> 8;
	    int i_43_ = i_30_ >> 16 & 0x7f;
	    if (i_42_ == 0)
		gb[i_41_] = (i_43_ << 14) + uca.a(-2080769, gb[i_41_]);
	    if (i_42_ == 32)
		gb[i_41_] = (i_43_ << 7) + uca.a(gb[i_41_], -16257);
	    if (i_42_ == 1)
		Ab[i_41_] = (i_43_ << 7) + uca.a(-16257, Ab[i_41_]);
	    if (i_42_ == 33)
		Ab[i_41_] = uca.a(Ab[i_41_], -128) + i_43_;
	    if (i_42_ == 5)
		y[i_41_] = uca.a(y[i_41_], -16257) + (i_43_ << 7);
	    if (i_42_ == 37)
		y[i_41_] = uca.a(-128, y[i_41_]) + i_43_;
	    if (i_42_ == 7)
		cb[i_41_] = uca.a(cb[i_41_], -16257) + (i_43_ << 7);
	    if (i_42_ == 39)
		cb[i_41_] = uca.a(cb[i_41_], -128) + i_43_;
	    if (i_42_ == 10)
		pb[i_41_] = uca.a(-16257, pb[i_41_]) + (i_43_ << 7);
	    if (i_42_ == 42)
		pb[i_41_] = i_43_ + uca.a(pb[i_41_], -128);
	    if (i_42_ == 11)
		I[i_41_] = uca.a(I[i_41_], -16257) + (i_43_ << 7);
	    if (i_42_ == 43)
		I[i_41_] = uca.a(-128, I[i_41_]) + i_43_;
	    if (i_42_ == 64) {
		if (i_43_ < 64)
		    ((dt) this).O[i_41_] = uca.a(((dt) this).O[i_41_], -2);
		else
		    ((dt) this).O[i_41_] = hba.bitwiseArg1ORArg2(((dt) this).O[i_41_], 1);
	    }
	    if (i_42_ == 65) {
		if (i_43_ >= 64)
		    ((dt) this).O[i_41_] = hba.bitwiseArg1ORArg2(((dt) this).O[i_41_], 2);
		else {
		    a(i_41_, (byte) -112);
		    ((dt) this).O[i_41_] = uca.a(((dt) this).O[i_41_], -3);
		}
	    }
	    if (i_42_ == 99)
		sb[i_41_] = (i_43_ << 7) + uca.a(sb[i_41_], 127);
	    if (i_42_ == 98)
		sb[i_41_] = uca.a(16256, sb[i_41_]) + i_43_;
	    if (i_42_ == 101)
		sb[i_41_] = uca.a(127, sb[i_41_]) + (16384 + (i_43_ << 7));
	    if (i_42_ == 100)
		sb[i_41_] = uca.a(sb[i_41_], 16256) + (i_43_ + 16384);
	    if (i_42_ == 120)
		e(i_41_, i ^ 0x48);
	    if (i_42_ == 121)
		d(i_41_, i + 171);
	    if (i_42_ == 123)
		a((int) 0, i_41_);
	    if (i_42_ == 6) {
		int i_44_ = sb[i_41_];
		if (i_44_ == 16384)
		    N[i_41_] = uca.a(N[i_41_], -16257) + (i_43_ << 7);
	    }
	    if (i_42_ == 38) {
		int i_45_ = sb[i_41_];
		if (i_45_ == 16384)
		    N[i_41_] = uca.a(N[i_41_], -128) + i_43_;
	    }
	    if (i_42_ == 16)
		((dt) this).jb[i_41_]
		    = (i_43_ << 7) + uca.a(-16257, ((dt) this).jb[i_41_]);
	    if (i_42_ == 48)
		((dt) this).jb[i_41_]
		    = i_43_ + uca.a(((dt) this).jb[i_41_], -128);
	    if (i_42_ == 81) {
		if (i_43_ >= 64)
		    ((dt) this).O[i_41_] = hba.bitwiseArg1ORArg2(((dt) this).O[i_41_], 4);
		else {
		    c(i_41_, 0);
		    ((dt) this).O[i_41_] = uca.a(((dt) this).O[i_41_], -5);
		}
	    }
	    if (i_42_ == 17)
		c((~0x3f80 & yb[i_41_]) + (i_43_ << 7), i_41_, -124);
	    if (i_42_ == 49)
		c(i_43_ + (~0x7f & yb[i_41_]), i_41_, -124);
	} else {
	    if (i != -55)
		d();
	    if (i_31_ == 192) {
		int i_46_ = 0xf & i_30_;
		int i_47_ = 0x7f & i_30_ >> 8;
		a(-126, i_46_, i_47_ + gb[i_46_]);
	    } else if (i_31_ == 208) {
		int i_48_ = i_30_ & 0xf;
		int i_49_ = (0x7f25 & i_30_) >> 8;
		a(false, i_49_, i_48_);
	    } else if (i_31_ == 224) {
		int i_50_ = 0xf & i_30_;
		int i_51_ = (0x3f80 & i_30_ >> 9) + (i_30_ >> 8 & 0x7f);
		b(false, i_51_, i_50_);
	    } else {
		i_31_ = 0xff & i_30_;
		if (i_31_ == 255)
		    a(115, true);
	    }
	}
    }
    
    private final void a(int i, boolean bool) {
	s++;
	if (i < 62)
	    nb = -6;
	if (!bool)
	    a((int) 0, (int) -1);
	else
	    e(-1, -114);
	d(-1, 124);
	for (int i_52_ = 0; i_52_ < 16; i_52_++)
	    W[i_52_] = wb[i_52_];
	for (int i_53_ = 0; i_53_ < 16; i_53_++)
	    gb[i_53_] = uca.a(-128, wb[i_53_]);
    }
    
    private final int b(int i, Class_hb class_hb) {
	r++;
	if (G[((Class_hb) class_hb).m] == 0)
	    return 0;
	mu var_mu = ((Class_hb) class_hb).G;
	int i_54_
	    = (I[((Class_hb) class_hb).m] * cb[((Class_hb) class_hb).m] + 4096
	       >> 13);
	i_54_ = i_54_ * i_54_ + 16384 >> 15;
	i_54_ = i_54_ * ((Class_hb) class_hb).D + 16384 >> 15;
	i_54_ = i_54_ * Bb + 128 >> 8;
	i_54_ = i_54_ * G[((Class_hb) class_hb).m] + 128 >> 8;
	if (((mu) var_mu).a > 0)
	    i_54_ = (int) ((Math.pow(0.5,
				     ((double) ((mu) var_mu).a
				      * (1.953125E-5
					 * (double) ((Class_hb) class_hb).n)))
			    * (double) i_54_)
			   + 0.5);
	if (((mu) var_mu).l != null) {
	    int i_55_ = ((Class_hb) class_hb).l;
	    int i_56_ = ((mu) var_mu).l[((Class_hb) class_hb).w + 1];
	    if (((Class_hb) class_hb).w < ((mu) var_mu).l.length - 2) {
		int i_57_
		    = (((mu) var_mu).l[((Class_hb) class_hb).w] & 0xff) << 8;
		int i_58_ = (((mu) var_mu).l[((Class_hb) class_hb).w + 2] << 8
			     & 0xff00);
		i_56_ += ((i_55_ - i_57_)
			  * (((mu) var_mu).l[((Class_hb) class_hb).w + 3]
			     - i_56_)
			  / (i_58_ - i_57_));
	    }
	    i_54_ = i_56_ * i_54_ + 32 >> 6;
	}
	if (((Class_hb) class_hb).E > 0 && ((mu) var_mu).h != null) {
	    int i_59_ = ((Class_hb) class_hb).E;
	    int i_60_ = ((mu) var_mu).h[((Class_hb) class_hb).r + 1];
	    if (((mu) var_mu).h.length - 2 > ((Class_hb) class_hb).r) {
		int i_61_
		    = (0xff & ((mu) var_mu).h[((Class_hb) class_hb).r]) << 8;
		int i_62_
		    = ((((mu) var_mu).h[((Class_hb) class_hb).r + 2] & 0xff)
		       << 8);
		i_60_ += ((i_59_ - i_61_)
			  * (((mu) var_mu).h[((Class_hb) class_hb).r + 3]
			     - i_60_)
			  / (i_62_ - i_61_));
	    }
	    i_54_ = i_54_ * i_60_ + 32 >> 6;
	}
	if (i != -2)
	    a(-36, (int) -35, 101);
	return i_54_;
    }
    
    static final void a(byte i, pl var_pl) {
	on.g = var_pl;
	fb++;
	int i_63_ = 76 / ((i + 67) / 35);
    }
    
    private final synchronized void a(boolean bool, int i, boolean bool_64_,
				      vw var_vw) {
	T++;
	b(16, bool);
	C.a(((vw) var_vw).k);
	Kb = bool_64_;
	Fb = 0L;
	int i_65_ = C.a();
	if (i != -1024)
	    b(null, 63, -52);
	for (int i_66_ = 0; i_65_ > i_66_; i_66_++) {
	    C.a(i_66_);
	    C.b(i_66_);
	    C.c(i_66_);
	}
	Gb = C.b();
	Hb = ((si) C).d[Gb];
	Ib = C.f(Hb);
    }
    
    private final void c(byte i) {
	A++;
	if (i <= 19)
	    a((byte) -17, (int) 109);
	int i_67_ = Gb;
	int i_68_ = Hb;
	long l = Ib;
	if (Nb != null && Lb == i_68_) {
	    a(Mb, -1024, Kb, Nb);
	    c((byte) 96);
	} else {
	    while (i_68_ == Hb) {
		while (i_68_ == ((si) C).d[i_67_]) {
		    C.a(i_67_);
		    int i_69_ = C.e(i_67_);
		    if (i_69_ == 1) {
			C.g();
			C.c(i_67_);
			if (C.e()) {
			    if (Nb != null) {
				a(Nb, Kb, 4096);
				c((byte) 91);
				return;
			    }
			    if (Kb && i_68_ != 0)
				C.a(l);
			    else {
				a(121, true);
				C.f();
				return;
			    }
			}
			break;
		    }
		    if ((i_69_ & 0x80) != 0)
			a((byte) -55, i_69_);
		    C.b(i_67_);
		    C.c(i_67_);
		}
		i_67_ = C.b();
		i_68_ = ((si) C).d[i_67_];
		l = C.f(i_68_);
	    }
	    Hb = i_68_;
	    Ib = l;
	    Gb = i_67_;
	    if (Nb != null && i_68_ > Lb) {
		Gb = -1;
		Hb = Lb;
		Ib = C.f(Hb);
	    }
	}
    }
    
    private final void a(int i, byte i_70_, int i_71_) {
	vb++;
	wb[i] = i_71_;
	if (i_70_ != -75)
	    a(95, (Class_hb) null, true);
	gb[i] = uca.a(i_71_, -128);
	a(-79, i, i_71_);
    }
    
    final synchronized pn b() {
	eb++;
	return null;
    }
    
    final void a(int i, Class_hb class_hb, boolean bool) {
	B++;
	int i_72_ = ((oaa) ((Class_hb) class_hb).q).l.length;
	int i_73_;
	if (!bool || !((oaa) ((Class_hb) class_hb).q).p)
	    i_73_ = (int) (((long) i_72_
			    * (long) ((dt) this).jb[((Class_hb) class_hb).m])
			   >> 6);
	else {
	    int i_74_ = i_72_ + (i_72_ - ((oaa) ((Class_hb) class_hb).q).m);
	    i_72_ <<= 8;
	    i_73_ = (int) (((long) i_74_
			    * (long) ((dt) this).jb[((Class_hb) class_hb).m])
			   >> 6);
	    if (i_72_ <= i_73_) {
		i_73_ = i_72_ - 1 - (i_73_ - i_72_);
		((Class_hb) class_hb).H.a(true);
	    }
	}
	((Class_hb) class_hb).H.i(i_73_);
	if (i != 8)
	    ((dt) this).jb = null;
    }
    
    private final int a(Class_hb class_hb, byte i) {
	xb++;
	if (i != -67)
	    qb = -17;
	int i_75_ = pb[((Class_hb) class_hb).m];
	if (i_75_ < 8192)
	    return ((Class_hb) class_hb).B * i_75_ + 32 >> 6;
	return 16384 - ((-i_75_ + 16384) * (128 - ((Class_hb) class_hb).B) + 32
			>> 6);
    }
    
    final synchronized boolean a(pl var_pl, vw var_vw, byte i, int i_76_,
				 pj var_pj) {
	var_vw.a();
	F++;
	boolean bool = true;
	int i_77_ = -102 / ((i + 76) / 47);
	int[] is = null;
	if (i_76_ > 0)
	    is = new int[] { i_76_ };
	for (Class_kb class_kb = (Class_kb) ((vw) var_vw).l.b((byte) 124);
	     class_kb != null;
	     class_kb = (Class_kb) ((vw) var_vw).l.b(12561)) {
	    int i_78_ = (int) ((Node) class_kb).nodeID;
	    ul var_ul = (ul) v.a(-32748, (long) i_78_);
	    if (var_ul == null) {
		var_ul = tm.a(false, i_78_, var_pl);
		if (var_ul == null) {
		    bool = false;
		    continue;
		}
		v.a(var_ul, (byte) -127, (long) i_78_);
	    }
	    if (!var_ul.a(is, var_pj, ((Class_kb) class_kb).n, 5150))
		bool = false;
	}
	if (bool)
	    var_vw.b();
	return bool;
    }
    
    private final void a(int i, byte i_79_) {
	ob++;
	if (i_79_ < -103) {
	    if ((((dt) this).O[i] & 0x2) != 0) {
		for (Class_hb class_hb = (Class_hb) ((eba) Eb).w.a((int) 86);
		     class_hb != null;
		     class_hb = (Class_hb) ((eba) Eb).w.b((byte) 83)) {
		    if (((Class_hb) class_hb).m == i
			&& w[i][((Class_hb) class_hb).A] == null
			&& ((Class_hb) class_hb).E < 0)
			((Class_hb) class_hb).E = 0;
		}
	    }
	}
    }
    
    private final void c(int i, int i_80_, int i_81_) {
	if (i_81_ != -124)
	    Cb = null;
	yb[i_80_] = i;
	o++;
	((dt) this).K[i_80_]
	    = (int) (2097152.0 * Math.pow(2.0, (double) i * 5.4931640625E-4)
		     + 0.5);
    }
    
    private final void d(int i, int i_82_) {
	Z++;
	if (i < 0) {
	    for (i = 0; i < 16; i++)
		d(i, 114);
	} else {
	    cb[i] = 12800;
	    pb[i] = 8192;
	    if (i_82_ <= 111)
		qb = -106;
	    I[i] = 16383;
	    bb[i] = 8192;
	    Ab[i] = 0;
	    y[i] = 8192;
	    a(i, (byte) -109);
	    c(i, 0);
	    ((dt) this).O[i] = 0;
	    sb[i] = 32767;
	    N[i] = 256;
	    ((dt) this).jb[i] = 0;
	    c(8192, i, -124);
	}
    }
    
    private final synchronized void b(int i, boolean bool) {
	X++;
	C.f();
	if (i != 16)
	    c((byte) -126);
	Nb = null;
	a(124, bool);
    }
    
    private final void b(int i, int i_83_, int i_84_, int i_85_) {
	ab++;
	a(i_83_, 64, -1, i_84_);
	if ((0x2 & ((dt) this).O[i_84_]) != 0) {
	    for (Class_hb class_hb = (Class_hb) ((eba) Eb).w.c(false);
		 class_hb != null; class_hb = (Class_hb) ((eba) Eb).w.c(16)) {
		if (((Class_hb) class_hb).m == i_84_
		    && ((Class_hb) class_hb).E < 0) {
		    w[i_84_][((Class_hb) class_hb).A] = null;
		    w[i_84_][i_83_] = class_hb;
		    int i_86_
			= (((Class_hb) class_hb).C
			   + (((Class_hb) class_hb).z * ((Class_hb) class_hb).F
			      >> 12));
		    ((Class_hb) class_hb).C
			+= i_83_ - ((Class_hb) class_hb).A << 8;
		    ((Class_hb) class_hb).z = i_86_ - ((Class_hb) class_hb).C;
		    ((Class_hb) class_hb).F = 4096;
		    ((Class_hb) class_hb).A = i_83_;
		    return;
		}
	    }
	}
	ul var_ul = (ul) v.a(-32748, (long) W[i_84_]);
	if (var_ul != null) {
	    oaa var_oaa = ((ul) var_ul).y[i_83_];
	    if (var_oaa != null) {
		Class_hb class_hb = new Class_hb();
		((Class_hb) class_hb).m = i_84_;
		((Class_hb) class_hb).q = var_oaa;
		((Class_hb) class_hb).o = var_ul;
		((Class_hb) class_hb).G = ((ul) var_ul).C[i_83_];
		if (i_85_ != -15982)
		    a((Class_hb) null, (byte) 121);
		((Class_hb) class_hb).k = ((ul) var_ul).o[i_83_];
		((Class_hb) class_hb).A = i_83_;
		((Class_hb) class_hb).D
		    = (i * (i * ((ul) var_ul).n * ((ul) var_ul).B[i_83_])
		       + 1024) >> 11;
		((Class_hb) class_hb).B = 0xff & ((ul) var_ul).x[i_83_];
		((Class_hb) class_hb).C
		    = (i_83_ << 8) - (0x7fff & ((ul) var_ul).u[i_83_]);
		((Class_hb) class_hb).n = 0;
		((Class_hb) class_hb).E = -1;
		((Class_hb) class_hb).r = 0;
		((Class_hb) class_hb).w = 0;
		((Class_hb) class_hb).l = 0;
		if (((dt) this).jb[i_84_] == 0)
		    ((Class_hb) class_hb).H
			= hw.a(var_oaa, a(908882434, class_hb),
			       b(-2, class_hb), a(class_hb, (byte) -67));
		else {
		    ((Class_hb) class_hb).H
			= hw.a(var_oaa, a(908882434, class_hb), 0,
			       a(class_hb, (byte) -67));
		    a(i_85_ + 15990, class_hb, ((ul) var_ul).u[i_83_] < 0);
		}
		if (((ul) var_ul).u[i_83_] < 0)
		    ((Class_hb) class_hb).H.l(-1);
		if (((Class_hb) class_hb).k >= 0) {
		    Class_hb class_hb_87_ = E[i_84_][((Class_hb) class_hb).k];
		    if (class_hb_87_ != null
			&& ((Class_hb) class_hb_87_).E < 0) {
			w[i_84_][((Class_hb) class_hb_87_).A] = null;
			((Class_hb) class_hb_87_).E = 0;
		    }
		    E[i_84_][((Class_hb) class_hb).k] = class_hb;
		}
		((eba) Eb).w.b(class_hb, (byte) 93);
		w[i_84_][i_83_] = class_hb;
	    }
	}
    }
    
    final synchronized boolean a(boolean bool) {
	z++;
	if (bool != false)
	    a((byte) 82, (pl) null);
	return C.c();
    }
    
    private final void a(long l, int i) {
	tb++;
	if (i >= 126) {
	    while (Ib <= l) {
		int i_88_ = Gb;
		int i_89_ = Hb;
		long l_90_ = Ib;
		while (i_89_ == Hb) {
		    while (i_89_ == ((si) C).d[i_88_]) {
			C.a(i_88_);
			int i_91_ = C.e(i_88_);
			if (i_91_ == 1) {
			    C.g();
			    C.c(i_88_);
			    if (C.e()) {
				if (Kb && i_89_ != 0)
				    C.a(l_90_);
				else {
				    a(96, true);
				    C.f();
				    return;
				}
			    }
			    break;
			}
			if ((i_91_ & 0x80) != 0 && (i_91_ & 0xf0) != 144)
			    a((byte) -55, i_91_);
			C.b(i_88_);
			C.c(i_88_);
		    }
		    Fb = l_90_;
		    i_88_ = C.b();
		    i_89_ = ((si) C).d[i_88_];
		    l_90_ = C.f(i_89_);
		}
		Hb = i_89_;
		Ib = l_90_;
		Gb = i_88_;
	    }
	}
    }
    
    final int c(int i) {
	if (i > -105)
	    d((byte) 89);
	u++;
	return Bb;
    }
    
    private final void e(int i, int i_92_) {
	Q++;
	for (Class_hb class_hb = (Class_hb) ((eba) Eb).w.a((int) 89);
	     class_hb != null;
	     class_hb = (Class_hb) ((eba) Eb).w.b((byte) 52)) {
	    if (i < 0 || i == ((Class_hb) class_hb).m) {
		if (((Class_hb) class_hb).H != null) {
		    ((Class_hb) class_hb).H.k(gba.samplesPerSec / 100);
		    if (((Class_hb) class_hb).H.l())
			((eba) Eb).B.b(((Class_hb) class_hb).H);
		    class_hb.a((byte) -104);
		}
		if (((Class_hb) class_hb).E < 0)
		    w[((Class_hb) class_hb).m][((Class_hb) class_hb).A] = null;
		class_hb.unlink(-93);
	    }
	}
	if (i_92_ > -84)
	    wb = null;
    }
    
    private final void b(boolean bool, int i, int i_93_) {
	if (bool != false)
	    b((byte) -97);
	bb[i_93_] = i;
	mb++;
    }
    
    final synchronized void d(byte i) {
	for (ul var_ul = (ul) v.b((byte) 124); var_ul != null;
	     var_ul = (ul) v.b(12561))
	    var_ul.b(91);
	P++;
	if (i > -17)
	    Nb = null;
    }
    
    private final void a(int i, int i_94_, boolean bool, int i_95_) {
	rb++;
	if (bool != false)
	    Cb = null;
    }
    
    final synchronized int d() {
	S++;
	return 0;
    }
    
    public dt() {
	((dt) this).O = new int[16];
	((dt) this).jb = new int[16];
	cb = new int[16];
	((dt) this).K = new int[16];
	qb = 1000000;
	W = new int[16];
	I = new int[16];
	G = new int[16];
	bb = new int[16];
	wb = new int[16];
	yb = new int[16];
	pb = new int[16];
	y = new int[16];
	E = new Class_hb[16][128];
	Bb = 256;
	sb = new int[16];
	N = new int[16];
	Ab = new int[16];
	C = new si();
	Eb = new eba(this);
	v = new il(128);
	a(-1, 256, true);
	a(93, true);
    }
    
    static {
	Cb = (new boolean[][]
	      { new boolean[4], new boolean[4], { false, false, true, false },
		{ false, false, true, false }, { false, false, true, false },
		{ false, false, true, false }, { true, false, true, false },
		{ true, false, false, true }, { true, false, false, true },
		new boolean[4], new boolean[4], new boolean[4],
		new boolean[4] });
    }
}
