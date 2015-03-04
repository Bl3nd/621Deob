/* rw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rw extends da
{
    private int p;
    private byte[] q;
    private short r;
    private rw s;
    private rd t;
    private rw u;
    private byte[] v;
    private int[] w;
    private int[] x;
    private rw y;
    private boolean z;
    private int[] A;
    private jea B;
    private short[] C;
    private int D;
    private int[] E;
    private short F;
    private rw G;
    private qg[] H;
    private nga I;
    private int[] J;
    private int[] K;
    static int L;
    private short M;
    private short[] N;
    private ve[] O;
    private rw P;
    private int Q;
    private int[][] R;
    private int[] S;
    private short[] T;
    private boolean U;
    private short[] V;
    private ve[] W;
    private int[] X;
    private short Y;
    private short Z;
    private boolean ab = false;
    private rw bb;
    private short cb;
    private int[][] db;
    private mh[] eb;
    private static int fb;
    private int[] gb;
    private byte[] hb;
    private boolean ib;
    static int jb = 4096;
    private short[] kb;
    private int[] lb;
    private int[] mb;
    private int[] nb;
    private rw ob;
    private int[] pb;
    private int[] qb;
    private short rb;
    private ff[] sb;
    private int tb = 0;
    private rw ub;
    private boolean vb;
    private short[] wb;
    private boolean xb;
    private int[] yb;
    private int zb;
    private int[] Ab;
    private int Bb;
    private rw Cb;
    private int[] Db;
    private int[] Eb;
    private int Fb;
    private int[] Gb;
    private int[] Hb;
    private int[] Ib;
    private jw[] Jb;
    private lfa Kb;
    private short[] Lb;
    private int[] Mb;
    private lfa Nb;
    private hi[] Ob;
    private int Pb;
    private short Qb;
    private int Rb;
    private int Sb;
    private int[][] Tb;
    private int[] Ub;
    private int Vb;
    private int[] Wb;
    private rw Xb;
    private static int[] Yb;
    private int Zb;
    private int[] ac;
    private int[] bc;
    private byte[] cc;
    
    final int za() {
	if (!xb)
	    t();
	return r;
    }
    
    private final da a(rw var_rw_0_, rw var_rw_1_, int i, boolean bool,
		       boolean bool_2_) {
	var_rw_0_.xb = xb;
	if (xb) {
	    var_rw_0_.Z = Z;
	    var_rw_0_.F = F;
	    var_rw_0_.r = r;
	    var_rw_0_.rb = rb;
	    var_rw_0_.Qb = Qb;
	    var_rw_0_.Y = Y;
	    var_rw_0_.cb = cb;
	    var_rw_0_.M = M;
	}
	var_rw_0_.p = p;
	var_rw_0_.zb = zb;
	var_rw_0_.Zb = Zb;
	var_rw_0_.tb = tb;
	var_rw_0_.D = D;
	var_rw_0_.Sb = Sb;
	if ((i & 0x100) != 0)
	    var_rw_0_.vb = true;
	else
	    var_rw_0_.vb = vb;
	boolean bool_3_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_4_ = bool_3_ || (i & 0x1) != 0;
	boolean bool_5_ = bool_3_ || (i & 0x2) != 0;
	boolean bool_6_ = bool_3_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_4_ || bool_5_ || bool_6_) {
	    if (bool_4_) {
		if (var_rw_1_.A == null || var_rw_1_.A.length < Zb)
		    var_rw_0_.A = var_rw_1_.A = new int[Zb];
		else
		    var_rw_0_.A = var_rw_1_.A;
		for (int i_7_ = 0; i_7_ < Zb; i_7_++)
		    var_rw_0_.A[i_7_] = A[i_7_];
	    } else
		var_rw_0_.A = A;
	    if (bool_5_) {
		if (var_rw_1_.qb == null || var_rw_1_.qb.length < Zb)
		    var_rw_0_.qb = var_rw_1_.qb = new int[Zb];
		else
		    var_rw_0_.qb = var_rw_1_.qb;
		for (int i_8_ = 0; i_8_ < Zb; i_8_++)
		    var_rw_0_.qb[i_8_] = qb[i_8_];
	    } else
		var_rw_0_.qb = qb;
	    if (bool_6_) {
		if (var_rw_1_.E == null || var_rw_1_.E.length < Zb)
		    var_rw_0_.E = var_rw_1_.E = new int[Zb];
		else
		    var_rw_0_.E = var_rw_1_.E;
		for (int i_9_ = 0; i_9_ < Zb; i_9_++)
		    var_rw_0_.E[i_9_] = E[i_9_];
	    } else
		var_rw_0_.E = E;
	} else {
	    var_rw_0_.A = A;
	    var_rw_0_.qb = qb;
	    var_rw_0_.E = E;
	}
	if ((i & 0x84080) != 0) {
	    if (var_rw_1_.wb == null || var_rw_1_.wb.length < D) {
		int i_10_ = D;
		var_rw_0_.wb = var_rw_1_.wb = new short[i_10_];
	    } else
		var_rw_0_.wb = var_rw_1_.wb;
	    for (int i_11_ = 0; i_11_ < D; i_11_++)
		var_rw_0_.wb[i_11_] = wb[i_11_];
	} else
	    var_rw_0_.wb = wb;
	if ((i & 0x97018) != 0) {
	    var_rw_0_.Pb = 0;
	    var_rw_0_.nb = var_rw_0_.yb = var_rw_0_.Ab = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_2_)
		c(false);
	    if (nb != null) {
		if (var_rw_1_.nb == null || var_rw_1_.nb.length < D) {
		    int i_12_ = D;
		    var_rw_0_.nb = var_rw_1_.nb = new int[i_12_];
		    var_rw_0_.yb = var_rw_1_.yb = new int[i_12_];
		    var_rw_0_.Ab = var_rw_1_.Ab = new int[i_12_];
		} else {
		    var_rw_0_.nb = var_rw_1_.nb;
		    var_rw_0_.yb = var_rw_1_.yb;
		    var_rw_0_.Ab = var_rw_1_.Ab;
		}
		for (int i_13_ = 0; i_13_ < D; i_13_++) {
		    var_rw_0_.nb[i_13_] = nb[i_13_];
		    var_rw_0_.yb[i_13_] = yb[i_13_];
		    var_rw_0_.Ab[i_13_] = Ab[i_13_];
		}
	    }
	    var_rw_0_.Pb = Pb;
	} else {
	    if (bool_2_)
		c(false);
	    var_rw_0_.nb = nb;
	    var_rw_0_.yb = yb;
	    var_rw_0_.Ab = Ab;
	    var_rw_0_.Pb = Pb;
	}
	if ((i & 0x100) != 0) {
	    if (var_rw_1_.cc == null || var_rw_1_.cc.length < D) {
		int i_14_ = D;
		var_rw_0_.cc = var_rw_1_.cc = new byte[i_14_];
	    } else
		var_rw_0_.cc = var_rw_1_.cc;
	    if (cc != null) {
		for (int i_15_ = 0; i_15_ < D; i_15_++)
		    var_rw_0_.cc[i_15_] = cc[i_15_];
	    } else {
		for (int i_16_ = 0; i_16_ < D; i_16_++)
		    var_rw_0_.cc[i_16_] = (byte) 0;
	    }
	} else
	    var_rw_0_.cc = cc;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (var_rw_1_.W == null || var_rw_1_.W.length < tb) {
		int i_17_ = tb;
		var_rw_0_.W = var_rw_1_.W = new ve[i_17_];
	    } else
		var_rw_0_.W = var_rw_1_.W;
	    if (W != null) {
		for (int i_18_ = 0; i_18_ < tb; i_18_++)
		    var_rw_0_.W[i_18_] = new ve(W[i_18_]);
	    } else
		var_rw_0_.W = null;
	    if (Jb != null) {
		if (var_rw_1_.Jb == null || var_rw_1_.Jb.length < D) {
		    int i_19_ = D;
		    var_rw_0_.Jb = var_rw_1_.Jb = new jw[i_19_];
		} else
		    var_rw_0_.Jb = var_rw_1_.Jb;
		for (int i_20_ = 0; i_20_ < D; i_20_++)
		    var_rw_0_.Jb[i_20_]
			= Jb[i_20_] != null ? new jw(Jb[i_20_]) : null;
	    } else
		var_rw_0_.Jb = null;
	} else {
	    if (bool_2_)
		r();
	    var_rw_0_.W = W;
	    var_rw_0_.Jb = Jb;
	}
	if ((i & 0x8000) != 0) {
	    if (C == null)
		var_rw_0_.C = null;
	    else {
		if (var_rw_1_.C == null || var_rw_1_.C.length < D) {
		    int i_21_ = D;
		    var_rw_0_.C = var_rw_1_.C = new short[i_21_];
		} else
		    var_rw_0_.C = var_rw_1_.C;
		for (int i_22_ = 0; i_22_ < D; i_22_++)
		    var_rw_0_.C[i_22_] = C[i_22_];
	    }
	} else
	    var_rw_0_.C = C;
	if ((i & 0x10000) != 0) {
	    if (q == null)
		var_rw_0_.q = null;
	    else {
		if (var_rw_1_.q == null || var_rw_1_.q.length < D) {
		    int i_23_ = bool ? D + 100 : D;
		    var_rw_0_.q = var_rw_1_.q = new byte[i_23_];
		} else
		    var_rw_0_.q = var_rw_1_.q;
		for (int i_24_ = 0; i_24_ < D; i_24_++)
		    var_rw_0_.q[i_24_] = q[i_24_];
	    }
	} else
	    var_rw_0_.q = q;
	if ((i & 0x580) != 0) {
	    if (var_rw_1_.sb == null || var_rw_1_.sb.length < Sb) {
		int i_25_ = Sb;
		var_rw_0_.sb = var_rw_1_.sb = new ff[i_25_];
		for (int i_26_ = 0; i_26_ < Sb; i_26_++)
		    var_rw_0_.sb[i_26_] = sb[i_26_].a(false);
	    } else {
		var_rw_0_.sb = var_rw_1_.sb;
		for (int i_27_ = 0; i_27_ < Sb; i_27_++)
		    var_rw_0_.sb[i_27_].a(97, sb[i_27_]);
	    }
	} else
	    var_rw_0_.sb = sb;
	var_rw_0_.R = R;
	var_rw_0_.db = db;
	var_rw_0_.Tb = Tb;
	var_rw_0_.V = V;
	var_rw_0_.Lb = Lb;
	var_rw_0_.hb = hb;
	var_rw_0_.v = v;
	var_rw_0_.Rb = Rb;
	var_rw_0_.Mb = Mb;
	var_rw_0_.mb = mb;
	var_rw_0_.pb = pb;
	var_rw_0_.T = T;
	var_rw_0_.N = N;
	var_rw_0_.kb = kb;
	var_rw_0_.Ob = Ob;
	var_rw_0_.H = H;
	var_rw_0_.eb = eb;
	var_rw_0_.Vb = i;
	return var_rw_0_;
    }
    
    final void d(short i, short i_28_) {
	for (int i_29_ = 0; i_29_ < D; i_29_++) {
	    if (wb[i_29_] == i)
		wb[i_29_] = i_28_;
	}
	if (eb != null) {
	    for (int i_30_ = 0; i_30_ < Sb; i_30_++) {
		mh var_mh = eb[i_30_];
		ff var_ff = sb[i_30_];
		((ff) var_ff).j
		    = (((ff) var_ff).j & ~0xffffff
		       | (vq.m[pg.a(0, wb[((mh) var_mh).h]) & 0xffff]
			  & 0xffffff));
	    }
	}
	if (Pb == 2)
	    Pb = 1;
    }
    
    private final void b(int i) {
	int i_31_ = T[i];
	int i_32_ = N[i];
	int i_33_ = kb[i];
	if (cc == null)
	    ((jea) B).q = 0;
	else
	    ((jea) B).q = cc[i] & 0xff;
	if (C == null || C[i] == -1) {
	    if (Ab[i] == -1)
		B.a(Wb[i_31_], Wb[i_32_], Wb[i_33_], X[i_31_], X[i_32_],
		    X[i_33_], Ib[i_31_], Ib[i_32_], Ib[i_33_],
		    vq.m[nb[i] & 0xffff]);
	    else
		B.a(Wb[i_31_], Wb[i_32_], Wb[i_33_], X[i_31_], X[i_32_],
		    X[i_33_], Ib[i_31_], Ib[i_32_], Ib[i_33_], nb[i] & 0xffff,
		    yb[i] & 0xffff, Ab[i] & 0xffff);
	} else {
	    int i_34_;
	    int i_35_;
	    int i_36_;
	    if (hb != null && hb[i] != -1) {
		int i_37_ = hb[i] & 0xff;
		i_34_ = Mb[i_37_];
		i_35_ = mb[i_37_];
		i_36_ = pb[i_37_];
	    } else {
		i_34_ = i_31_;
		i_35_ = i_32_;
		i_36_ = i_33_;
	    }
	    if (Ab[i] == -1)
		B.a(Wb[i_31_], Wb[i_32_], Wb[i_33_], X[i_31_], X[i_32_],
		    X[i_33_], Ib[i_31_], Ib[i_32_], Ib[i_33_], nb[i], nb[i],
		    nb[i], x[i_34_], x[i_35_], x[i_36_], K[i_34_], K[i_35_],
		    K[i_36_], S[i_34_], S[i_35_], S[i_36_], C[i]);
	    else
		B.a(Wb[i_31_], Wb[i_32_], Wb[i_33_], X[i_31_], X[i_32_],
		    X[i_33_], Ib[i_31_], Ib[i_32_], Ib[i_33_], nb[i], yb[i],
		    Ab[i], x[i_34_], x[i_35_], x[i_36_], K[i_34_], K[i_35_],
		    K[i_36_], S[i_34_], S[i_35_], S[i_36_], C[i]);
	}
    }
    
    final void ga(int i) {
	if ((Vb & 0x2000) != 8192)
	    throw new IllegalStateException();
	zb = i;
	Pb = 0;
    }
    
    private final void g() {
	synchronized (this) {
	    for (int i = 0; i < Zb; i++) {
		int i_38_ = A[i];
		A[i] = E[i];
		E[i] = -i_38_;
	    }
	    k();
	}
    }
    
    private final void h() {
	for (int i = 0; i < D; i++) {
	    short i_39_ = C != null ? C[i] : (short) -1;
	    if (i_39_ == -1) {
		int i_40_ = wb[i] & 0xffff;
		int i_41_ = (i_40_ & 0x7f) * p >> 7;
		short i_42_ = pg.a(0, i_40_ & ~0x7f | i_41_);
		if (Ab[i] == -1) {
		    int i_43_ = nb[i] & ~0x1ffff;
		    nb[i] = i_43_ | lfa.a(-93, i_43_ >> 17, i_42_);
		} else if (Ab[i] != -2) {
		    int i_44_ = nb[i] & ~0x1ffff;
		    nb[i] = i_44_ | lfa.a(-97, i_44_ >> 17, i_42_);
		    i_44_ = yb[i] & ~0x1ffff;
		    yb[i] = i_44_ | lfa.a(-98, i_44_ >> 17, i_42_);
		    i_44_ = Ab[i] & ~0x1ffff;
		    Ab[i] = i_44_ | lfa.a(-95, i_44_ >> 17, i_42_);
		}
	    }
	}
	Pb = 2;
    }
    
    final int l() {
	if (!xb)
	    t();
	return Z;
    }
    
    private final void b(Class_q class_q, pba var_pba, int i, int i_45_) {
	if (tb >= 1) {
	    t = (rd) class_q;
	    rd var_rd = ((nga) I).bb;
	    if (!xb)
		t();
	    boolean bool = false;
	    if (((rd) t).z == 16384.0F && ((rd) t).m == 0.0F
		&& ((rd) t).s == 0.0F && ((rd) t).i == 0.0F
		&& ((rd) t).k == 16384.0F && ((rd) t).w == 0.0F
		&& ((rd) t).q == 0.0F && ((rd) t).M == 0.0F
		&& ((rd) t).C == 16384.0F)
		bool = true;
	    float f = (((rd) var_rd).B + ((rd) var_rd).q * ((rd) t).v
		       + ((rd) var_rd).M * ((rd) t).o
		       + ((rd) var_rd).C * ((rd) t).B);
	    float f_46_
		= bool ? ((rd) var_rd).M : (((rd) var_rd).q * ((rd) t).m
					    + ((rd) var_rd).M * ((rd) t).k
					    + ((rd) var_rd).C * ((rd) t).M);
	    int i_47_ = (int) (f + (float) Qb * f_46_);
	    int i_48_ = (int) (f + (float) F * f_46_);
	    int i_49_;
	    int i_50_;
	    if (i_47_ > i_48_) {
		i_49_ = i_48_ - cb;
		i_50_ = i_47_ + cb;
	    } else {
		i_49_ = i_47_ - cb;
		i_50_ = i_48_ + cb;
	    }
	    if (i_49_ < ((nga) I).W && i_50_ > ((nga) I).M) {
		float f_51_ = (((rd) var_rd).v + ((rd) var_rd).z * ((rd) t).v
			       + ((rd) var_rd).m * ((rd) t).o
			       + ((rd) var_rd).s * ((rd) t).B);
		float f_52_ = (bool ? ((rd) var_rd).m
			       : (((rd) var_rd).z * ((rd) t).m
				  + ((rd) var_rd).m * ((rd) t).k
				  + ((rd) var_rd).s * ((rd) t).M));
		int i_53_ = (int) (f_51_ + (float) Qb * f_52_);
		int i_54_ = (int) (f_51_ + (float) F * f_52_);
		int i_55_;
		int i_56_;
		if (i_53_ > i_54_) {
		    i_55_ = (i_54_ - cb) * ((nga) I).L;
		    i_56_ = (i_53_ + cb) * ((nga) I).L;
		} else {
		    i_55_ = (i_53_ - cb) * ((nga) I).L;
		    i_56_ = (i_54_ + cb) * ((nga) I).L;
		}
		if (i == -1) {
		    if (i_55_ / i_50_ >= ((nga) I).E
			|| i_56_ / i_50_ <= ((nga) I).v)
			return;
		} else if (i_55_ / i >= ((nga) I).E
			   || i_56_ / i <= ((nga) I).v)
		    return;
		float f_57_ = (((rd) var_rd).o + ((rd) var_rd).i * ((rd) t).v
			       + ((rd) var_rd).k * ((rd) t).o
			       + ((rd) var_rd).w * ((rd) t).B);
		float f_58_ = (bool ? ((rd) var_rd).k
			       : (((rd) var_rd).i * ((rd) t).m
				  + ((rd) var_rd).k * ((rd) t).k
				  + ((rd) var_rd).w * ((rd) t).M));
		int i_59_ = (int) (f_57_ + (float) Qb * f_58_);
		int i_60_ = (int) (f_57_ + (float) F * f_58_);
		int i_61_;
		int i_62_;
		if (i_59_ > i_60_) {
		    i_61_ = (i_60_ - cb) * ((nga) I).O;
		    i_62_ = (i_59_ + cb) * ((nga) I).O;
		} else {
		    i_61_ = (i_59_ - cb) * ((nga) I).O;
		    i_62_ = (i_60_ + cb) * ((nga) I).O;
		}
		if (i == -1) {
		    if (i_61_ / i_50_ >= ((nga) I).P
			|| i_62_ / i_50_ <= ((nga) I).ab)
			return;
		} else if (i_61_ / i >= ((nga) I).P
			   || i_62_ / i <= ((nga) I).ab)
		    return;
		float f_63_;
		float f_64_;
		float f_65_;
		float f_66_;
		float f_67_;
		float f_68_;
		if (bool) {
		    f_63_ = ((rd) var_rd).z;
		    f_64_ = ((rd) var_rd).i;
		    f_65_ = ((rd) var_rd).q;
		    f_66_ = ((rd) var_rd).s;
		    f_67_ = ((rd) var_rd).w;
		    f_68_ = ((rd) var_rd).C;
		} else {
		    f_63_ = (((rd) var_rd).z * ((rd) t).z
			     + ((rd) var_rd).m * ((rd) t).i
			     + ((rd) var_rd).s * ((rd) t).q);
		    f_64_ = (((rd) var_rd).i * ((rd) t).z
			     + ((rd) var_rd).k * ((rd) t).i
			     + ((rd) var_rd).w * ((rd) t).q);
		    f_65_ = (((rd) var_rd).q * ((rd) t).z
			     + ((rd) var_rd).M * ((rd) t).i
			     + ((rd) var_rd).C * ((rd) t).q);
		    f_66_ = (((rd) var_rd).z * ((rd) t).s
			     + ((rd) var_rd).m * ((rd) t).w
			     + ((rd) var_rd).s * ((rd) t).C);
		    f_67_ = (((rd) var_rd).i * ((rd) t).s
			     + ((rd) var_rd).k * ((rd) t).w
			     + ((rd) var_rd).w * ((rd) t).C);
		    f_68_ = (((rd) var_rd).q * ((rd) t).s
			     + ((rd) var_rd).M * ((rd) t).w
			     + ((rd) var_rd).C * ((rd) t).C);
		}
		if (((nga) I).V > 1) {
		    synchronized (this) {
			while (U) {
			    try {
				this.wait();
			    } catch (InterruptedException interruptedexception) {
				/* empty */
			    }
			}
			U = true;
		    }
		}
		b(Thread.currentThread());
		if ((i_45_ & 0x2) != 0)
		    B.a(true);
		else
		    B.a(false);
		boolean bool_69_ = false;
		boolean bool_70_ = i_49_ <= ((nga) I).M;
		boolean bool_71_
		    = bool_70_ || Rb > 0 || Ob != null || H != null;
		((lfa) Nb).bb = ((jea) B).b;
		((lfa) Nb).z = ((jea) B).i;
		((lfa) Nb).D = ((jea) B).l;
		int i_72_ = ((nga) I).L;
		int i_73_ = ((nga) I).O;
		int i_74_ = ((nga) I).M;
		if (i == -1) {
		    for (int i_75_ = 0; i_75_ < Zb; i_75_++) {
			int i_76_ = A[i_75_];
			int i_77_ = qb[i_75_];
			int i_78_ = E[i_75_];
			float f_79_ = (f_51_ + f_63_ * (float) i_76_
				       + f_52_ * (float) i_77_
				       + f_66_ * (float) i_78_);
			float f_80_ = (f_57_ + f_64_ * (float) i_76_
				       + f_58_ * (float) i_77_
				       + f_67_ * (float) i_78_);
			float f_81_ = (f + f_65_ * (float) i_76_
				       + f_46_ * (float) i_77_
				       + f_68_ * (float) i_78_);
			Ib[i_75_] = (int) f_81_;
			if (f_81_ >= (float) i_74_) {
			    X[i_75_]
				= ((lfa) Nb).z + (int) (f_79_ * (float) i_72_
							/ f_81_);
			    Wb[i_75_]
				= ((lfa) Nb).D + (int) (f_80_ * (float) i_73_
							/ f_81_);
			} else {
			    X[i_75_] = -5000;
			    bool_69_ = true;
			}
			if (bool_71_) {
			    x[i_75_] = (int) f_79_;
			    K[i_75_] = (int) f_80_;
			    S[i_75_] = (int) f_81_;
			}
			if (((lfa) Nb).m)
			    Db[i_75_]
				= (int) (((rd) t).o
					 + (((rd) t).i * (float) i_76_
					    + ((rd) t).k * (float) i_77_
					    + ((rd) t).w * (float) i_78_));
		    }
		    if (eb != null) {
			for (int i_82_ = 0; i_82_ < Sb; i_82_++) {
			    mh var_mh = eb[i_82_];
			    ff var_ff = sb[i_82_];
			    short i_83_ = T[((mh) var_mh).h];
			    short i_84_ = N[((mh) var_mh).h];
			    short i_85_ = kb[((mh) var_mh).h];
			    int i_86_ = (A[i_83_] + A[i_84_] + A[i_85_]) / 3;
			    int i_87_
				= (qb[i_83_] + qb[i_84_] + qb[i_85_]) / 3;
			    int i_88_ = (E[i_83_] + E[i_84_] + E[i_85_]) / 3;
			    float f_89_ = ((float) ((ff) var_ff).d
					   + (f_51_ + f_63_ * (float) i_86_
					      + f_52_ * (float) i_87_
					      + f_66_ * (float) i_88_));
			    float f_90_ = ((float) ((ff) var_ff).m
					   + (f_57_ + f_64_ * (float) i_86_
					      + f_58_ * (float) i_87_
					      + f_67_ * (float) i_88_));
			    float f_91_ = (f + f_65_ * (float) i_86_
					   + f_46_ * (float) i_87_
					   + f_68_ * (float) i_88_);
			    if (f_91_ > (float) ((nga) I).M) {
				((ff) var_ff).c
				    = ((nga) I).X + (int) (f_89_
							   * (float) i_72_
							   / f_91_);
				((ff) var_ff).n
				    = ((nga) I).y + (int) (f_90_
							   * (float) i_73_
							   / f_91_);
				((ff) var_ff).o
				    = (int) f_91_ - ((mh) var_mh).e;
				((ff) var_ff).k
				    = (int) ((float) (((ff) var_ff).a
						      * ((mh) var_mh).g
						      * i_72_)
					     / (f_91_ * 128.0F));
				((ff) var_ff).t
				    = (int) ((float) (((ff) var_ff).f
						      * ((mh) var_mh).d
						      * i_73_)
					     / (f_91_ * 128.0F));
			    } else
				((ff) var_ff).k = ((ff) var_ff).t = 0;
			}
		    }
		} else {
		    for (int i_92_ = 0; i_92_ < Zb; i_92_++) {
			int i_93_ = A[i_92_];
			int i_94_ = qb[i_92_];
			int i_95_ = E[i_92_];
			float f_96_ = (f_51_ + f_63_ * (float) i_93_
				       + f_52_ * (float) i_94_
				       + f_66_ * (float) i_95_);
			float f_97_ = (f_57_ + f_64_ * (float) i_93_
				       + f_58_ * (float) i_94_
				       + f_67_ * (float) i_95_);
			float f_98_ = (f + f_65_ * (float) i_93_
				       + f_46_ * (float) i_94_
				       + f_68_ * (float) i_95_);
			Ib[i_92_] = (int) f_98_;
			X[i_92_] = ((lfa) Nb).z + (int) (f_96_ * (float) i_72_
							 / (float) i);
			Wb[i_92_] = ((lfa) Nb).D + (int) (f_97_ * (float) i_73_
							  / (float) i);
			if (bool_71_) {
			    x[i_92_] = (int) f_96_;
			    K[i_92_] = (int) f_97_;
			    S[i_92_] = i;
			}
			if (((lfa) Nb).m)
			    Db[i_92_]
				= (int) (((rd) t).o
					 + (((rd) t).i * (float) i_93_
					    + ((rd) t).k * (float) i_94_
					    + ((rd) t).w * (float) i_95_));
		    }
		    if (eb != null) {
			for (int i_99_ = 0; i_99_ < Sb; i_99_++) {
			    mh var_mh = eb[i_99_];
			    ff var_ff = sb[i_99_];
			    short i_100_ = T[((mh) var_mh).h];
			    short i_101_ = N[((mh) var_mh).h];
			    short i_102_ = kb[((mh) var_mh).h];
			    int i_103_
				= (A[i_100_] + A[i_101_] + A[i_102_]) / 3;
			    int i_104_
				= (qb[i_100_] + qb[i_101_] + qb[i_102_]) / 3;
			    int i_105_
				= (E[i_100_] + E[i_101_] + E[i_102_]) / 3;
			    float f_106_ = (f_51_ + f_63_ * (float) i_103_
					    + f_52_ * (float) i_104_
					    + f_66_ * (float) i_105_);
			    float f_107_ = (f_57_ + f_64_ * (float) i_103_
					    + f_58_ * (float) i_104_
					    + f_67_ * (float) i_105_);
			    float f_108_ = (f + f_65_ * (float) i_103_
					    + f_46_ * (float) i_104_
					    + f_68_ * (float) i_105_);
			    ((ff) var_ff).c
				= ((nga) I).X + (int) (f_106_ * (float) i_72_
						       / (float) i);
			    ((ff) var_ff).n
				= ((nga) I).y + (int) (f_107_ * (float) i_73_
						       / (float) i);
			    ((ff) var_ff).o = i - ((mh) var_mh).e;
			    ((ff) var_ff).k
				= (((ff) var_ff).a * ((mh) var_mh).g * i_72_
				   / (i << 7));
			    ((ff) var_ff).t
				= (((ff) var_ff).f * ((mh) var_mh).d * i_73_
				   / (i << 7));
			}
		    }
		}
		if (var_pba != null) {
		    boolean bool_109_ = false;
		    boolean bool_110_ = true;
		    int i_111_ = rb + Z >> 1;
		    int i_112_ = Y + r >> 1;
		    int i_113_ = i_111_;
		    short i_114_ = Qb;
		    int i_115_ = i_112_;
		    float f_116_
			= (f_51_ + f_63_ * (float) i_113_
			   + f_52_ * (float) i_114_ + f_66_ * (float) i_115_);
		    float f_117_
			= (f_57_ + f_64_ * (float) i_113_
			   + f_58_ * (float) i_114_ + f_67_ * (float) i_115_);
		    float f_118_
			= (f + f_65_ * (float) i_113_ + f_46_ * (float) i_114_
			   + f_68_ * (float) i_115_);
		    if (f_118_ >= (float) i_74_) {
			int i_119_ = (int) f_118_;
			if (i != -1)
			    i_119_ = i;
			((pba) var_pba).k
			    = ((nga) I).X + (int) (f_116_ * (float) i_72_
						   / (float) i_119_);
			((pba) var_pba).g
			    = ((nga) I).y + (int) (f_117_ * (float) i_73_
						   / (float) i_119_);
		    } else
			bool_109_ = true;
		    i_113_ = i_111_;
		    i_114_ = F;
		    i_115_ = i_112_;
		    float f_120_
			= (f_51_ + f_63_ * (float) i_113_
			   + f_52_ * (float) i_114_ + f_66_ * (float) i_115_);
		    float f_121_
			= (f_57_ + f_64_ * (float) i_113_
			   + f_58_ * (float) i_114_ + f_67_ * (float) i_115_);
		    float f_122_
			= (f + f_65_ * (float) i_113_ + f_46_ * (float) i_114_
			   + f_68_ * (float) i_115_);
		    if (f_122_ >= (float) i_74_) {
			int i_123_ = (int) f_122_;
			if (i != -1)
			    i_123_ = i;
			((pba) var_pba).l
			    = ((nga) I).X + (int) (f_120_ * (float) i_72_
						   / (float) i_123_);
			((pba) var_pba).i
			    = ((nga) I).y + (int) (f_121_ * (float) i_73_
						   / (float) i_123_);
		    } else
			bool_109_ = true;
		    if (bool_109_) {
			if (f_118_ < (float) i_74_ && f_122_ < (float) i_74_)
			    bool_110_ = false;
			else if (f_118_ < (float) i_74_) {
			    float f_124_ = ((f_122_ - (float) ((nga) I).M)
					    / (f_122_ - f_118_));
			    int i_125_
				= (int) (f_120_ + (f_120_ - f_116_) * f_124_);
			    int i_126_
				= (int) (f_121_ + (f_121_ - f_117_) * f_124_);
			    int i_127_ = i_74_;
			    if (i != -1)
				i_127_ = i;
			    ((pba) var_pba).k
				= ((nga) I).X + i_125_ * i_72_ / i_127_;
			    ((pba) var_pba).g
				= ((nga) I).y + i_126_ * i_73_ / i_127_;
			} else if (f_122_ < (float) i_74_) {
			    float f_128_
				= (f_118_ - (float) i_74_) / (f_118_ - f_122_);
			    int i_129_
				= (int) (f_116_ + (f_116_ - f_120_) * f_128_);
			    int i_130_
				= (int) (f_117_ + (f_117_ - f_121_) * f_128_);
			    int i_131_ = i_74_;
			    if (i != -1)
				i_131_ = i;
			    ((pba) var_pba).k
				= ((nga) I).X + i_129_ * i_72_ / i_131_;
			    ((pba) var_pba).g
				= ((nga) I).y + i_130_ * i_73_ / i_131_;
			}
		    }
		    if (bool_110_) {
			if (f_118_ > f_122_) {
			    int i_132_ = (int) f_118_;
			    if (i != -1)
				i_132_ = i;
			    ((pba) var_pba).j
				= (((nga) I).X
				   + (int) ((f_116_ + (float) cb)
					    * (float) i_72_ / (float) i_132_)
				   - ((pba) var_pba).k);
			} else {
			    int i_133_ = (int) f_122_;
			    if (i != -1)
				i_133_ = i;
			    ((pba) var_pba).j
				= (((nga) I).X
				   + (int) ((f_120_ + (float) cb)
					    * (float) i_72_ / (float) i_133_)
				   - ((pba) var_pba).l);
			}
			((pba) var_pba).h = true;
		    }
		}
		c(true);
		((jea) B).c = (i_45_ & 0x1) == 0;
		((jea) B).k = false;
		try {
		    a(bool_69_,
		      ((lfa) Nb).j && i_50_ > ((lfa) Nb).a || ((lfa) Nb).m,
		      i_49_, i_50_ - i_49_);
		} catch (Exception exception) {
		    /* empty */
		}
		if (eb != null) {
		    for (int i_134_ = 0; i_134_ < D; i_134_++)
			Eb[i_134_] = -1;
		}
		B = null;
		if (((nga) I).V > 1) {
		    synchronized (this) {
			U = false;
			this.notifyAll();
		    }
		}
	    }
	}
    }
    
    private final void i() {
	synchronized (this) {
	    for (int i = 0; i < Zb; i++) {
		A[i] = -A[i];
		E[i] = -E[i];
	    }
	    k();
	}
    }
    
    final void e() {
	if (((nga) I).V > 1) {
	    synchronized (this) {
		while (((da) this).f) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		((da) this).f = true;
	    }
	}
    }
    
    final int H() {
	if (!xb)
	    t();
	return F;
    }
    
    final int RA() {
	if (!xb)
	    t();
	return M;
    }
    
    final void DA(short i, short i_135_) {
	if (C != null) {
	    for (int i_136_ = 0; i_136_ < D; i_136_++) {
		if (C[i_136_] == i)
		    C[i_136_] = i_135_;
	    }
	}
    }
    
    final qg[] f() {
	return H;
    }
    
    private final void j() {
	synchronized (this) {
	    for (int i = 0; i < tb; i++) {
		int i_137_ = E[i];
		E[i] = A[i];
		A[i] = -i_137_;
		if (W[i] != null) {
		    i_137_ = ((ve) W[i]).c;
		    ((ve) W[i]).c = ((ve) W[i]).a;
		    ((ve) W[i]).a = -i_137_;
		}
	    }
	    if (Jb != null) {
		for (int i = 0; i < D; i++) {
		    if (Jb[i] != null) {
			int i_138_ = ((jw) Jb[i]).b;
			((jw) Jb[i]).b = ((jw) Jb[i]).c;
			((jw) Jb[i]).c = -i_138_;
		    }
		}
	    }
	    for (int i = tb; i < Zb; i++) {
		int i_139_ = E[i];
		E[i] = A[i];
		A[i] = -i_139_;
	    }
	    Pb = 0;
	    xb = false;
	}
    }
    
    private final boolean c(int i) {
	if (Eb == null)
	    return false;
	if (Eb[i] == -1)
	    return false;
	return true;
    }
    
    final void WA(int i, int i_140_, int i_141_, int i_142_) {
	if (i == 0) {
	    int i_143_ = 0;
	    Bb = 0;
	    Q = 0;
	    Fb = 0;
	    for (int i_144_ = 0; i_144_ < Zb; i_144_++) {
		Bb += A[i_144_];
		Q += qb[i_144_];
		Fb += E[i_144_];
		i_143_++;
	    }
	    if (i_143_ > 0) {
		Bb = Bb / i_143_ + i_140_;
		Q = Q / i_143_ + i_141_;
		Fb = Fb / i_143_ + i_142_;
	    } else {
		Bb = i_140_;
		Q = i_141_;
		Fb = i_142_;
	    }
	} else if (i == 1) {
	    for (int i_145_ = 0; i_145_ < Zb; i_145_++) {
		A[i_145_] += i_140_;
		qb[i_145_] += i_141_;
		E[i_145_] += i_142_;
	    }
	} else if (i == 2) {
	    for (int i_146_ = 0; i_146_ < Zb; i_146_++) {
		A[i_146_] -= Bb;
		qb[i_146_] -= Q;
		E[i_146_] -= Fb;
		if (i_142_ != 0) {
		    int i_147_ = GameInPacket.ints1[i_142_];
		    int i_148_ = GameInPacket.ints2[i_142_];
		    int i_149_
			= (qb[i_146_] * i_147_ + A[i_146_] * i_148_ + 16383
			   >> 14);
		    qb[i_146_]
			= (qb[i_146_] * i_148_ - A[i_146_] * i_147_ + 16383
			   >> 14);
		    A[i_146_] = i_149_;
		}
		if (i_140_ != 0) {
		    int i_150_ = GameInPacket.ints1[i_140_];
		    int i_151_ = GameInPacket.ints2[i_140_];
		    int i_152_
			= (qb[i_146_] * i_151_ - E[i_146_] * i_150_ + 16383
			   >> 14);
		    E[i_146_]
			= (qb[i_146_] * i_150_ + E[i_146_] * i_151_ + 16383
			   >> 14);
		    qb[i_146_] = i_152_;
		}
		if (i_141_ != 0) {
		    int i_153_ = GameInPacket.ints1[i_141_];
		    int i_154_ = GameInPacket.ints2[i_141_];
		    int i_155_
			= (E[i_146_] * i_153_ + A[i_146_] * i_154_ + 16383
			   >> 14);
		    E[i_146_]
			= (E[i_146_] * i_154_ - A[i_146_] * i_153_ + 16383
			   >> 14);
		    A[i_146_] = i_155_;
		}
		A[i_146_] += Bb;
		qb[i_146_] += Q;
		E[i_146_] += Fb;
	    }
	} else if (i == 3) {
	    for (int i_156_ = 0; i_156_ < Zb; i_156_++) {
		A[i_156_] -= Bb;
		qb[i_156_] -= Q;
		E[i_156_] -= Fb;
		A[i_156_] = A[i_156_] * i_140_ / 128;
		qb[i_156_] = qb[i_156_] * i_141_ / 128;
		E[i_156_] = E[i_156_] * i_142_ / 128;
		A[i_156_] += Bb;
		qb[i_156_] += Q;
		E[i_156_] += Fb;
	    }
	} else if (i == 5) {
	    for (int i_157_ = 0; i_157_ < D; i_157_++) {
		int i_158_ = (cc[i_157_] & 0xff) + i_140_ * 8;
		if (i_158_ < 0)
		    i_158_ = 0;
		else if (i_158_ > 255)
		    i_158_ = 255;
		cc[i_157_] = (byte) i_158_;
	    }
	    if (eb != null) {
		for (int i_159_ = 0; i_159_ < Sb; i_159_++) {
		    mh var_mh = eb[i_159_];
		    ff var_ff = sb[i_159_];
		    ((ff) var_ff).j
			= (((ff) var_ff).j & 0xffffff
			   | 255 - (cc[((mh) var_mh).h] & 0xff) << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_160_ = 0; i_160_ < D; i_160_++) {
		int i_161_ = wb[i_160_] & 0xffff;
		int i_162_ = i_161_ >> 10 & 0x3f;
		int i_163_ = i_161_ >> 7 & 0x7;
		int i_164_ = i_161_ & 0x7f;
		i_162_ = i_162_ + i_140_ & 0x3f;
		i_163_ += i_141_;
		if (i_163_ < 0)
		    i_163_ = 0;
		else if (i_163_ > 7)
		    i_163_ = 7;
		i_164_ += i_142_;
		if (i_164_ < 0)
		    i_164_ = 0;
		else if (i_164_ > 127)
		    i_164_ = 127;
		wb[i_160_] = (short) (i_162_ << 10 | i_163_ << 7 | i_164_);
	    }
	    z = true;
	    if (eb != null) {
		for (int i_165_ = 0; i_165_ < Sb; i_165_++) {
		    mh var_mh = eb[i_165_];
		    ff var_ff = sb[i_165_];
		    ((ff) var_ff).j
			= (((ff) var_ff).j & ~0xffffff
			   | (vq.m[pg.a(0, wb[((mh) var_mh).h] & 0xffff)]
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_166_ = 0; i_166_ < Sb; i_166_++) {
		ff var_ff = sb[i_166_];
		((ff) var_ff).d += i_140_;
		((ff) var_ff).m += i_141_;
	    }
	} else if (i == 10) {
	    for (int i_167_ = 0; i_167_ < Sb; i_167_++) {
		ff var_ff = sb[i_167_];
		((ff) var_ff).a = ((ff) var_ff).a * i_140_ >> 7;
		((ff) var_ff).f = ((ff) var_ff).f * i_141_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_168_ = 0; i_168_ < Sb; i_168_++) {
		ff var_ff = sb[i_168_];
		((ff) var_ff).e = ((ff) var_ff).e + i_140_ & 0x3fff;
	    }
	}
    }
    
    final void oa(int i, int i_169_, int i_170_) {
	if (i != 0 && (Vb & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_169_ != 0 && (Vb & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_170_ != 0 && (Vb & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_171_ = 0; i_171_ < Zb; i_171_++) {
		A[i_171_] += i;
		qb[i_171_] += i_169_;
		E[i_171_] += i_170_;
	    }
	}
    }
    
    final da a(byte i, int i_172_, boolean bool) {
	a(Thread.currentThread());
	rw var_rw_173_;
	rw var_rw_174_;
	if (i == 1) {
	    var_rw_173_ = Xb;
	    var_rw_174_ = ub;
	} else if (i == 2) {
	    var_rw_173_ = G;
	    var_rw_174_ = ob;
	} else if (i == 3) {
	    var_rw_173_ = Cb;
	    var_rw_174_ = bb;
	} else if (i == 4) {
	    var_rw_173_ = u;
	    var_rw_174_ = s;
	} else if (i == 5) {
	    var_rw_173_ = P;
	    var_rw_174_ = y;
	} else
	    var_rw_174_ = var_rw_173_ = new rw(I);
	return a(var_rw_174_, var_rw_173_, i_172_, i != 0, bool);
    }
    
    private final void k() {
	W = null;
	O = null;
	Jb = null;
	xb = false;
    }
    
    private final void a(Thread thread) {
	lfa var_lfa = I.a(thread);
	if (var_lfa != Kb) {
	    Kb = var_lfa;
	    ub = ((lfa) Kb).G;
	    ob = ((lfa) Kb).Z;
	    bb = ((lfa) Kb).E;
	    s = ((lfa) Kb).X;
	    y = ((lfa) Kb).R;
	    Xb = ((lfa) Kb).C;
	    G = ((lfa) Kb).K;
	    Cb = ((lfa) Kb).y;
	    u = ((lfa) Kb).F;
	    P = ((lfa) Kb).V;
	}
    }
    
    private final void m() {
	synchronized (this) {
	    for (int i = 0; i < tb; i++) {
		A[i] = -A[i];
		E[i] = -E[i];
		if (W[i] != null) {
		    ((ve) W[i]).a = -((ve) W[i]).a;
		    ((ve) W[i]).c = -((ve) W[i]).c;
		}
	    }
	    if (Jb != null) {
		for (int i = 0; i < D; i++) {
		    if (Jb[i] != null) {
			((jw) Jb[i]).c = -((jw) Jb[i]).c;
			((jw) Jb[i]).b = -((jw) Jb[i]).b;
		    }
		}
	    }
	    for (int i = tb; i < Zb; i++) {
		A[i] = -A[i];
		E[i] = -E[i];
	    }
	    Pb = 0;
	    xb = false;
	}
    }
    
    final void W(int i) {
	if ((Vb & 0x3) != 3)
	    throw new IllegalStateException();
	int i_175_ = GameInPacket.ints1[i];
	int i_176_ = GameInPacket.ints2[i];
	synchronized (this) {
	    for (int i_177_ = 0; i_177_ < Zb; i_177_++) {
		int i_178_ = qb[i_177_] * i_175_ + A[i_177_] * i_176_ >> 14;
		qb[i_177_] = qb[i_177_] * i_176_ - A[i_177_] * i_175_ >> 14;
		A[i_177_] = i_178_;
	    }
	    k();
	}
    }
    
    private final void a(boolean bool, boolean bool_179_, int i, int i_180_) {
	if (eb != null) {
	    for (int i_181_ = 0; i_181_ < Sb; i_181_++) {
		mh var_mh = eb[i_181_];
		Eb[((mh) var_mh).h] = i_181_;
	    }
	}
	if (vb || Eb != null) {
	    for (int i_182_ = 0; i_182_ < D; i_182_++) {
		if (!d(i_182_) && !c(i_182_))
		    a(i_182_, bool, bool_179_);
	    }
	    if (v == null) {
		for (int i_183_ = 0; i_183_ < D; i_183_++) {
		    if (d(i_183_) || c(i_183_))
			a(i_183_, bool, bool_179_);
		}
	    } else {
		for (int i_184_ = 0; i_184_ < 12; i_184_++) {
		    for (int i_185_ = 0; i_185_ < D; i_185_++) {
			if (v[i_185_] == i_184_ && (d(i_185_) || c(i_185_)))
			    a(i_185_, bool, bool_179_);
		    }
		}
	    }
	} else {
	    for (int i_186_ = 0; i_186_ < D; i_186_++)
		a(i_186_, bool, bool_179_);
	}
    }
    
    final void a(Class_q class_q, pba var_pba, int i) {
	b(class_q, var_pba, -1, i);
    }
    
    private final boolean d(int i) {
	if (cc == null)
	    return false;
	if (cc[i] == 0)
	    return false;
	return true;
    }
    
    private final void n() {
	synchronized (this) {
	    for (int i = 0; i < Zb; i++) {
		int i_187_ = E[i];
		E[i] = A[i];
		A[i] = -i_187_;
	    }
	    k();
	}
    }
    
    final void a(Class_q class_q) {
	rd var_rd = (rd) class_q;
	if (Ob != null) {
	    for (int i = 0; i < Ob.length; i++) {
		hi var_hi = Ob[i];
		hi var_hi_188_ = var_hi;
		if (((hi) var_hi).f != null)
		    var_hi_188_ = ((hi) var_hi).f;
		((hi) var_hi_188_).j
		    = (int) (((rd) var_rd).v
			     + (((rd) var_rd).z * (float) A[((hi) var_hi).d]
				+ ((rd) var_rd).m * (float) qb[((hi) var_hi).d]
				+ (((rd) var_rd).s
				   * (float) E[((hi) var_hi).d])));
		((hi) var_hi_188_).a
		    = (int) (((rd) var_rd).o
			     + (((rd) var_rd).i * (float) A[((hi) var_hi).d]
				+ ((rd) var_rd).k * (float) qb[((hi) var_hi).d]
				+ (((rd) var_rd).w
				   * (float) E[((hi) var_hi).d])));
		((hi) var_hi_188_).l
		    = (int) (((rd) var_rd).B
			     + (((rd) var_rd).q * (float) A[((hi) var_hi).d]
				+ ((rd) var_rd).M * (float) qb[((hi) var_hi).d]
				+ (((rd) var_rd).C
				   * (float) E[((hi) var_hi).d])));
		((hi) var_hi_188_).b
		    = (int) (((rd) var_rd).v
			     + (((rd) var_rd).z * (float) A[((hi) var_hi).g]
				+ ((rd) var_rd).m * (float) qb[((hi) var_hi).g]
				+ (((rd) var_rd).s
				   * (float) E[((hi) var_hi).g])));
		((hi) var_hi_188_).c
		    = (int) (((rd) var_rd).o
			     + (((rd) var_rd).i * (float) A[((hi) var_hi).g]
				+ ((rd) var_rd).k * (float) qb[((hi) var_hi).g]
				+ (((rd) var_rd).w
				   * (float) E[((hi) var_hi).g])));
		((hi) var_hi_188_).m
		    = (int) (((rd) var_rd).B
			     + (((rd) var_rd).q * (float) A[((hi) var_hi).g]
				+ ((rd) var_rd).M * (float) qb[((hi) var_hi).g]
				+ (((rd) var_rd).C
				   * (float) E[((hi) var_hi).g])));
		((hi) var_hi_188_).t
		    = (int) (((rd) var_rd).v
			     + (((rd) var_rd).z * (float) A[((hi) var_hi).e]
				+ ((rd) var_rd).m * (float) qb[((hi) var_hi).e]
				+ (((rd) var_rd).s
				   * (float) E[((hi) var_hi).e])));
		((hi) var_hi_188_).o
		    = (int) (((rd) var_rd).o
			     + (((rd) var_rd).i * (float) A[((hi) var_hi).e]
				+ ((rd) var_rd).k * (float) qb[((hi) var_hi).e]
				+ (((rd) var_rd).w
				   * (float) E[((hi) var_hi).e])));
		((hi) var_hi_188_).n
		    = (int) (((rd) var_rd).B
			     + (((rd) var_rd).q * (float) A[((hi) var_hi).e]
				+ ((rd) var_rd).M * (float) qb[((hi) var_hi).e]
				+ (((rd) var_rd).C
				   * (float) E[((hi) var_hi).e])));
	    }
	}
	if (H != null) {
	    for (int i = 0; i < H.length; i++) {
		qg var_qg = H[i];
		qg var_qg_189_ = var_qg;
		if (((qg) var_qg).n != null)
		    var_qg_189_ = ((qg) var_qg).n;
		if (((qg) var_qg).p != null)
		    ((qg) var_qg).p.M(var_rd);
		else
		    ((qg) var_qg).p = var_rd.a();
		((qg) var_qg_189_).m
		    = (int) (((rd) var_rd).v
			     + (((rd) var_rd).z * (float) A[((qg) var_qg).b]
				+ ((rd) var_rd).m * (float) qb[((qg) var_qg).b]
				+ (((rd) var_rd).s
				   * (float) E[((qg) var_qg).b])));
		((qg) var_qg_189_).f
		    = (int) (((rd) var_rd).o
			     + (((rd) var_rd).i * (float) A[((qg) var_qg).b]
				+ ((rd) var_rd).k * (float) qb[((qg) var_qg).b]
				+ (((rd) var_rd).w
				   * (float) E[((qg) var_qg).b])));
		((qg) var_qg_189_).l
		    = (int) (((rd) var_rd).B
			     + (((rd) var_rd).q * (float) A[((qg) var_qg).b]
				+ ((rd) var_rd).M * (float) qb[((qg) var_qg).b]
				+ (((rd) var_rd).C
				   * (float) E[((qg) var_qg).b])));
	    }
	}
    }
    
    final void B(int i, int[] is, int i_190_, int i_191_, int i_192_,
		 boolean bool, int i_193_, int[] is_194_) {
	int i_195_ = is.length;
	if (i == 0) {
	    i_190_ <<= 4;
	    i_191_ <<= 4;
	    i_192_ <<= 4;
	    if (!ib) {
		for (int i_196_ = 0; i_196_ < Zb; i_196_++) {
		    A[i_196_] <<= 4;
		    qb[i_196_] <<= 4;
		    E[i_196_] <<= 4;
		}
		ib = true;
	    }
	    int i_197_ = 0;
	    Bb = 0;
	    Q = 0;
	    Fb = 0;
	    for (int i_198_ = 0; i_198_ < i_195_; i_198_++) {
		int i_199_ = is[i_198_];
		if (i_199_ < R.length) {
		    int[] is_200_ = R[i_199_];
		    for (int i_201_ = 0; i_201_ < is_200_.length; i_201_++) {
			int i_202_ = is_200_[i_201_];
			if (V == null || (i_193_ & V[i_202_]) != 0) {
			    Bb += A[i_202_];
			    Q += qb[i_202_];
			    Fb += E[i_202_];
			    i_197_++;
			}
		    }
		}
	    }
	    if (i_197_ > 0) {
		Bb = Bb / i_197_ + i_190_;
		Q = Q / i_197_ + i_191_;
		Fb = Fb / i_197_ + i_192_;
		ab = true;
	    } else {
		Bb = i_190_;
		Q = i_191_;
		Fb = i_192_;
	    }
	} else if (i == 1) {
	    if (is_194_ != null) {
		int i_203_ = ((is_194_[0] * i_190_ + is_194_[1] * i_191_
			       + is_194_[2] * i_192_ + 8192)
			      >> 14);
		int i_204_ = ((is_194_[3] * i_190_ + is_194_[4] * i_191_
			       + is_194_[5] * i_192_ + 8192)
			      >> 14);
		int i_205_ = ((is_194_[6] * i_190_ + is_194_[7] * i_191_
			       + is_194_[8] * i_192_ + 8192)
			      >> 14);
		i_190_ = i_203_;
		i_191_ = i_204_;
		i_192_ = i_205_;
	    }
	    i_190_ <<= 4;
	    i_191_ <<= 4;
	    i_192_ <<= 4;
	    if (!ib) {
		for (int i_206_ = 0; i_206_ < Zb; i_206_++) {
		    A[i_206_] <<= 4;
		    qb[i_206_] <<= 4;
		    E[i_206_] <<= 4;
		}
		ib = true;
	    }
	    for (int i_207_ = 0; i_207_ < i_195_; i_207_++) {
		int i_208_ = is[i_207_];
		if (i_208_ < R.length) {
		    int[] is_209_ = R[i_208_];
		    for (int i_210_ = 0; i_210_ < is_209_.length; i_210_++) {
			int i_211_ = is_209_[i_210_];
			if (V == null || (i_193_ & V[i_211_]) != 0) {
			    A[i_211_] += i_190_;
			    qb[i_211_] += i_191_;
			    E[i_211_] += i_192_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_194_ != null) {
		if (!ib) {
		    for (int i_212_ = 0; i_212_ < Zb; i_212_++) {
			A[i_212_] <<= 4;
			qb[i_212_] <<= 4;
			E[i_212_] <<= 4;
		    }
		    ib = true;
		}
		int i_213_ = is_194_[9] << 4;
		int i_214_ = is_194_[10] << 4;
		int i_215_ = is_194_[11] << 4;
		int i_216_ = is_194_[12] << 4;
		int i_217_ = is_194_[13] << 4;
		int i_218_ = is_194_[14] << 4;
		if (ab) {
		    int i_219_ = ((is_194_[0] * Bb + is_194_[3] * Q
				   + is_194_[6] * Fb + 8192)
				  >> 14);
		    int i_220_ = ((is_194_[1] * Bb + is_194_[4] * Q
				   + is_194_[7] * Fb + 8192)
				  >> 14);
		    int i_221_ = ((is_194_[2] * Bb + is_194_[5] * Q
				   + is_194_[8] * Fb + 8192)
				  >> 14);
		    i_219_ += i_216_;
		    i_220_ += i_217_;
		    i_221_ += i_218_;
		    Bb = i_219_;
		    Q = i_220_;
		    Fb = i_221_;
		    ab = false;
		}
		int[] is_222_ = new int[9];
		int i_223_ = GameInPacket.ints2[i_190_];
		int i_224_ = GameInPacket.ints1[i_190_];
		int i_225_ = GameInPacket.ints2[i_191_];
		int i_226_ = GameInPacket.ints1[i_191_];
		int i_227_ = GameInPacket.ints2[i_192_];
		int i_228_ = GameInPacket.ints1[i_192_];
		int i_229_ = i_224_ * i_227_ + 8192 >> 14;
		int i_230_ = i_224_ * i_228_ + 8192 >> 14;
		is_222_[0] = i_225_ * i_227_ + i_226_ * i_230_ + 8192 >> 14;
		is_222_[1] = -i_225_ * i_228_ + i_226_ * i_229_ + 8192 >> 14;
		is_222_[2] = i_226_ * i_223_ + 8192 >> 14;
		is_222_[3] = i_223_ * i_228_ + 8192 >> 14;
		is_222_[4] = i_223_ * i_227_ + 8192 >> 14;
		is_222_[5] = -i_224_;
		is_222_[6] = -i_226_ * i_227_ + i_225_ * i_230_ + 8192 >> 14;
		is_222_[7] = i_226_ * i_228_ + i_225_ * i_229_ + 8192 >> 14;
		is_222_[8] = i_225_ * i_223_ + 8192 >> 14;
		int i_231_ = ((is_222_[0] * -Bb + is_222_[1] * -Q
			       + is_222_[2] * -Fb + 8192)
			      >> 14);
		int i_232_ = ((is_222_[3] * -Bb + is_222_[4] * -Q
			       + is_222_[5] * -Fb + 8192)
			      >> 14);
		int i_233_ = ((is_222_[6] * -Bb + is_222_[7] * -Q
			       + is_222_[8] * -Fb + 8192)
			      >> 14);
		int i_234_ = i_231_ + Bb;
		int i_235_ = i_232_ + Q;
		int i_236_ = i_233_ + Fb;
		int[] is_237_ = new int[9];
		for (int i_238_ = 0; i_238_ < 3; i_238_++) {
		    for (int i_239_ = 0; i_239_ < 3; i_239_++) {
			int i_240_ = 0;
			for (int i_241_ = 0; i_241_ < 3; i_241_++)
			    i_240_ += (is_222_[i_238_ * 3 + i_241_]
				       * is_194_[i_239_ * 3 + i_241_]);
			is_237_[i_238_ * 3 + i_239_] = i_240_ + 8192 >> 14;
		    }
		}
		int i_242_ = ((is_222_[0] * i_216_ + is_222_[1] * i_217_
			       + is_222_[2] * i_218_ + 8192)
			      >> 14);
		int i_243_ = ((is_222_[3] * i_216_ + is_222_[4] * i_217_
			       + is_222_[5] * i_218_ + 8192)
			      >> 14);
		int i_244_ = ((is_222_[6] * i_216_ + is_222_[7] * i_217_
			       + is_222_[8] * i_218_ + 8192)
			      >> 14);
		i_242_ += i_234_;
		i_243_ += i_235_;
		i_244_ += i_236_;
		int[] is_245_ = new int[9];
		for (int i_246_ = 0; i_246_ < 3; i_246_++) {
		    for (int i_247_ = 0; i_247_ < 3; i_247_++) {
			int i_248_ = 0;
			for (int i_249_ = 0; i_249_ < 3; i_249_++)
			    i_248_ += (is_194_[i_246_ * 3 + i_249_]
				       * is_237_[i_247_ + i_249_ * 3]);
			is_245_[i_246_ * 3 + i_247_] = i_248_ + 8192 >> 14;
		    }
		}
		int i_250_ = ((is_194_[0] * i_242_ + is_194_[1] * i_243_
			       + is_194_[2] * i_244_ + 8192)
			      >> 14);
		int i_251_ = ((is_194_[3] * i_242_ + is_194_[4] * i_243_
			       + is_194_[5] * i_244_ + 8192)
			      >> 14);
		int i_252_ = ((is_194_[6] * i_242_ + is_194_[7] * i_243_
			       + is_194_[8] * i_244_ + 8192)
			      >> 14);
		i_250_ += i_213_;
		i_251_ += i_214_;
		i_252_ += i_215_;
		for (int i_253_ = 0; i_253_ < i_195_; i_253_++) {
		    int i_254_ = is[i_253_];
		    if (i_254_ < R.length) {
			int[] is_255_ = R[i_254_];
			for (int i_256_ = 0; i_256_ < is_255_.length;
			     i_256_++) {
			    int i_257_ = is_255_[i_256_];
			    if (V == null || (i_193_ & V[i_257_]) != 0) {
				int i_258_ = ((is_245_[0] * A[i_257_]
					       + is_245_[1] * qb[i_257_]
					       + is_245_[2] * E[i_257_] + 8192)
					      >> 14);
				int i_259_ = ((is_245_[3] * A[i_257_]
					       + is_245_[4] * qb[i_257_]
					       + is_245_[5] * E[i_257_] + 8192)
					      >> 14);
				int i_260_ = ((is_245_[6] * A[i_257_]
					       + is_245_[7] * qb[i_257_]
					       + is_245_[8] * E[i_257_] + 8192)
					      >> 14);
				i_258_ += i_250_;
				i_259_ += i_251_;
				i_260_ += i_252_;
				A[i_257_] = i_258_;
				qb[i_257_] = i_259_;
				E[i_257_] = i_260_;
			    }
			}
		    }
		}
	    } else {
		for (int i_261_ = 0; i_261_ < i_195_; i_261_++) {
		    int i_262_ = is[i_261_];
		    if (i_262_ < R.length) {
			int[] is_263_ = R[i_262_];
			for (int i_264_ = 0; i_264_ < is_263_.length;
			     i_264_++) {
			    int i_265_ = is_263_[i_264_];
			    if (V == null || (i_193_ & V[i_265_]) != 0) {
				A[i_265_] -= Bb;
				qb[i_265_] -= Q;
				E[i_265_] -= Fb;
				if (i_192_ != 0) {
				    int i_266_ = GameInPacket.ints1[i_192_];
				    int i_267_ = GameInPacket.ints2[i_192_];
				    int i_268_
					= ((qb[i_265_] * i_266_
					    + A[i_265_] * i_267_ + 16383)
					   >> 14);
				    qb[i_265_]
					= (qb[i_265_] * i_267_
					   - A[i_265_] * i_266_ + 16383) >> 14;
				    A[i_265_] = i_268_;
				}
				if (i_190_ != 0) {
				    int i_269_ = GameInPacket.ints1[i_190_];
				    int i_270_ = GameInPacket.ints2[i_190_];
				    int i_271_
					= ((qb[i_265_] * i_270_
					    - E[i_265_] * i_269_ + 16383)
					   >> 14);
				    E[i_265_]
					= (qb[i_265_] * i_269_
					   + E[i_265_] * i_270_ + 16383) >> 14;
				    qb[i_265_] = i_271_;
				}
				if (i_191_ != 0) {
				    int i_272_ = GameInPacket.ints1[i_191_];
				    int i_273_ = GameInPacket.ints2[i_191_];
				    int i_274_
					= ((E[i_265_] * i_272_
					    + A[i_265_] * i_273_ + 16383)
					   >> 14);
				    E[i_265_]
					= (E[i_265_] * i_273_
					   - A[i_265_] * i_272_ + 16383) >> 14;
				    A[i_265_] = i_274_;
				}
				A[i_265_] += Bb;
				qb[i_265_] += Q;
				E[i_265_] += Fb;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_194_ != null) {
		if (!ib) {
		    for (int i_275_ = 0; i_275_ < Zb; i_275_++) {
			A[i_275_] <<= 4;
			qb[i_275_] <<= 4;
			E[i_275_] <<= 4;
		    }
		    ib = true;
		}
		int i_276_ = is_194_[9] << 4;
		int i_277_ = is_194_[10] << 4;
		int i_278_ = is_194_[11] << 4;
		int i_279_ = is_194_[12] << 4;
		int i_280_ = is_194_[13] << 4;
		int i_281_ = is_194_[14] << 4;
		if (ab) {
		    int i_282_ = ((is_194_[0] * Bb + is_194_[3] * Q
				   + is_194_[6] * Fb + 8192)
				  >> 14);
		    int i_283_ = ((is_194_[1] * Bb + is_194_[4] * Q
				   + is_194_[7] * Fb + 8192)
				  >> 14);
		    int i_284_ = ((is_194_[2] * Bb + is_194_[5] * Q
				   + is_194_[8] * Fb + 8192)
				  >> 14);
		    i_282_ += i_279_;
		    i_283_ += i_280_;
		    i_284_ += i_281_;
		    Bb = i_282_;
		    Q = i_283_;
		    Fb = i_284_;
		    ab = false;
		}
		int i_285_ = i_190_ << 15 >> 7;
		int i_286_ = i_191_ << 15 >> 7;
		int i_287_ = i_192_ << 15 >> 7;
		int i_288_ = i_285_ * -Bb + 8192 >> 14;
		int i_289_ = i_286_ * -Q + 8192 >> 14;
		int i_290_ = i_287_ * -Fb + 8192 >> 14;
		int i_291_ = i_288_ + Bb;
		int i_292_ = i_289_ + Q;
		int i_293_ = i_290_ + Fb;
		int[] is_294_ = new int[9];
		is_294_[0] = i_285_ * is_194_[0] + 8192 >> 14;
		is_294_[1] = i_285_ * is_194_[3] + 8192 >> 14;
		is_294_[2] = i_285_ * is_194_[6] + 8192 >> 14;
		is_294_[3] = i_286_ * is_194_[1] + 8192 >> 14;
		is_294_[4] = i_286_ * is_194_[4] + 8192 >> 14;
		is_294_[5] = i_286_ * is_194_[7] + 8192 >> 14;
		is_294_[6] = i_287_ * is_194_[2] + 8192 >> 14;
		is_294_[7] = i_287_ * is_194_[5] + 8192 >> 14;
		is_294_[8] = i_287_ * is_194_[8] + 8192 >> 14;
		int i_295_ = i_285_ * i_279_ + 8192 >> 14;
		int i_296_ = i_286_ * i_280_ + 8192 >> 14;
		int i_297_ = i_287_ * i_281_ + 8192 >> 14;
		i_295_ += i_291_;
		i_296_ += i_292_;
		i_297_ += i_293_;
		int[] is_298_ = new int[9];
		for (int i_299_ = 0; i_299_ < 3; i_299_++) {
		    for (int i_300_ = 0; i_300_ < 3; i_300_++) {
			int i_301_ = 0;
			for (int i_302_ = 0; i_302_ < 3; i_302_++)
			    i_301_ += (is_194_[i_299_ * 3 + i_302_]
				       * is_294_[i_300_ + i_302_ * 3]);
			is_298_[i_299_ * 3 + i_300_] = i_301_ + 8192 >> 14;
		    }
		}
		int i_303_ = ((is_194_[0] * i_295_ + is_194_[1] * i_296_
			       + is_194_[2] * i_297_ + 8192)
			      >> 14);
		int i_304_ = ((is_194_[3] * i_295_ + is_194_[4] * i_296_
			       + is_194_[5] * i_297_ + 8192)
			      >> 14);
		int i_305_ = ((is_194_[6] * i_295_ + is_194_[7] * i_296_
			       + is_194_[8] * i_297_ + 8192)
			      >> 14);
		i_303_ += i_276_;
		i_304_ += i_277_;
		i_305_ += i_278_;
		for (int i_306_ = 0; i_306_ < i_195_; i_306_++) {
		    int i_307_ = is[i_306_];
		    if (i_307_ < R.length) {
			int[] is_308_ = R[i_307_];
			for (int i_309_ = 0; i_309_ < is_308_.length;
			     i_309_++) {
			    int i_310_ = is_308_[i_309_];
			    if (V == null || (i_193_ & V[i_310_]) != 0) {
				int i_311_ = ((is_298_[0] * A[i_310_]
					       + is_298_[1] * qb[i_310_]
					       + is_298_[2] * E[i_310_] + 8192)
					      >> 14);
				int i_312_ = ((is_298_[3] * A[i_310_]
					       + is_298_[4] * qb[i_310_]
					       + is_298_[5] * E[i_310_] + 8192)
					      >> 14);
				int i_313_ = ((is_298_[6] * A[i_310_]
					       + is_298_[7] * qb[i_310_]
					       + is_298_[8] * E[i_310_] + 8192)
					      >> 14);
				i_311_ += i_303_;
				i_312_ += i_304_;
				i_313_ += i_305_;
				A[i_310_] = i_311_;
				qb[i_310_] = i_312_;
				E[i_310_] = i_313_;
			    }
			}
		    }
		}
	    } else {
		for (int i_314_ = 0; i_314_ < i_195_; i_314_++) {
		    int i_315_ = is[i_314_];
		    if (i_315_ < R.length) {
			int[] is_316_ = R[i_315_];
			for (int i_317_ = 0; i_317_ < is_316_.length;
			     i_317_++) {
			    int i_318_ = is_316_[i_317_];
			    if (V == null || (i_193_ & V[i_318_]) != 0) {
				A[i_318_] -= Bb;
				qb[i_318_] -= Q;
				E[i_318_] -= Fb;
				A[i_318_] = A[i_318_] * i_190_ / 128;
				qb[i_318_] = qb[i_318_] * i_191_ / 128;
				E[i_318_] = E[i_318_] * i_192_ / 128;
				A[i_318_] += Bb;
				qb[i_318_] += Q;
				E[i_318_] += Fb;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (db != null && cc != null) {
		for (int i_319_ = 0; i_319_ < i_195_; i_319_++) {
		    int i_320_ = is[i_319_];
		    if (i_320_ < db.length) {
			int[] is_321_ = db[i_320_];
			for (int i_322_ = 0; i_322_ < is_321_.length;
			     i_322_++) {
			    int i_323_ = is_321_[i_322_];
			    if (Lb == null || (i_193_ & Lb[i_323_]) != 0) {
				int i_324_ = (cc[i_323_] & 0xff) + i_190_ * 8;
				if (i_324_ < 0)
				    i_324_ = 0;
				else if (i_324_ > 255)
				    i_324_ = 255;
				cc[i_323_] = (byte) i_324_;
			    }
			}
		    }
		}
		if (eb != null) {
		    for (int i_325_ = 0; i_325_ < Sb; i_325_++) {
			mh var_mh = eb[i_325_];
			ff var_ff = sb[i_325_];
			((ff) var_ff).j
			    = (((ff) var_ff).j & 0xffffff
			       | 255 - (cc[((mh) var_mh).h] & 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (db != null) {
		for (int i_326_ = 0; i_326_ < i_195_; i_326_++) {
		    int i_327_ = is[i_326_];
		    if (i_327_ < db.length) {
			int[] is_328_ = db[i_327_];
			for (int i_329_ = 0; i_329_ < is_328_.length;
			     i_329_++) {
			    int i_330_ = is_328_[i_329_];
			    if (Lb == null || (i_193_ & Lb[i_330_]) != 0) {
				int i_331_ = wb[i_330_] & 0xffff;
				int i_332_ = i_331_ >> 10 & 0x3f;
				int i_333_ = i_331_ >> 7 & 0x7;
				int i_334_ = i_331_ & 0x7f;
				i_332_ = i_332_ + i_190_ & 0x3f;
				i_333_ += i_191_;
				if (i_333_ < 0)
				    i_333_ = 0;
				else if (i_333_ > 7)
				    i_333_ = 7;
				i_334_ += i_192_;
				if (i_334_ < 0)
				    i_334_ = 0;
				else if (i_334_ > 127)
				    i_334_ = 127;
				wb[i_330_] = (short) (i_332_ << 10
						      | i_333_ << 7 | i_334_);
			    }
			}
			z = true;
		    }
		}
		if (eb != null) {
		    for (int i_335_ = 0; i_335_ < Sb; i_335_++) {
			mh var_mh = eb[i_335_];
			ff var_ff = sb[i_335_];
			((ff) var_ff).j
			    = (((ff) var_ff).j & ~0xffffff
			       | (vq.m[pg.a(0, wb[((mh) var_mh).h] & 0xffff)]
				  & 0xffffff));
		    }
		}
	    }
	} else if (i == 8) {
	    if (Tb != null) {
		for (int i_336_ = 0; i_336_ < i_195_; i_336_++) {
		    int i_337_ = is[i_336_];
		    if (i_337_ < Tb.length) {
			int[] is_338_ = Tb[i_337_];
			for (int i_339_ = 0; i_339_ < is_338_.length;
			     i_339_++) {
			    ff var_ff = sb[is_338_[i_339_]];
			    ((ff) var_ff).d += i_190_;
			    ((ff) var_ff).m += i_191_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (Tb != null) {
		for (int i_340_ = 0; i_340_ < i_195_; i_340_++) {
		    int i_341_ = is[i_340_];
		    if (i_341_ < Tb.length) {
			int[] is_342_ = Tb[i_341_];
			for (int i_343_ = 0; i_343_ < is_342_.length;
			     i_343_++) {
			    ff var_ff = sb[is_342_[i_343_]];
			    ((ff) var_ff).a = ((ff) var_ff).a * i_190_ >> 7;
			    ((ff) var_ff).f = ((ff) var_ff).f * i_191_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9 && Tb != null) {
	    for (int i_344_ = 0; i_344_ < i_195_; i_344_++) {
		int i_345_ = is[i_344_];
		if (i_345_ < Tb.length) {
		    int[] is_346_ = Tb[i_345_];
		    for (int i_347_ = 0; i_347_ < is_346_.length; i_347_++) {
			ff var_ff = sb[is_346_[i_347_]];
			((ff) var_ff).e = ((ff) var_ff).e + i_190_ & 0x3fff;
		    }
		}
	    }
	}
    }
    
    final void M(int i) {
	if ((Vb & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    g();
	else if (i == 8192)
	    i();
	else if (i == 12288)
	    n();
	else {
	    int i_348_ = GameInPacket.ints1[i];
	    int i_349_ = GameInPacket.ints2[i];
	    synchronized (this) {
		for (int i_350_ = 0; i_350_ < Zb; i_350_++) {
		    int i_351_ = E[i_350_] * i_348_ + A[i_350_] * i_349_ >> 14;
		    E[i_350_] = E[i_350_] * i_349_ - A[i_350_] * i_348_ >> 14;
		    A[i_350_] = i_351_;
		}
		k();
	    }
	}
    }
    
    final void fa(int i) {
	if ((Vb & 0xd) != 13)
	    throw new IllegalStateException();
	if (W != null) {
	    if (i == 4096)
		p();
	    else if (i == 8192)
		m();
	    else if (i == 12288)
		j();
	    else {
		int i_352_ = GameInPacket.ints1[i];
		int i_353_ = GameInPacket.ints2[i];
		synchronized (this) {
		    for (int i_354_ = 0; i_354_ < tb; i_354_++) {
			int i_355_
			    = E[i_354_] * i_352_ + A[i_354_] * i_353_ >> 14;
			E[i_354_]
			    = E[i_354_] * i_353_ - A[i_354_] * i_352_ >> 14;
			A[i_354_] = i_355_;
			if (W[i_354_] != null) {
			    i_355_ = (((ve) W[i_354_]).c * i_352_
				      + ((ve) W[i_354_]).a * i_353_) >> 14;
			    ((ve) W[i_354_]).c
				= (((ve) W[i_354_]).c * i_353_
				   - ((ve) W[i_354_]).a * i_352_) >> 14;
			    ((ve) W[i_354_]).a = i_355_;
			}
		    }
		    if (Jb != null) {
			for (int i_356_ = 0; i_356_ < D; i_356_++) {
			    if (Jb[i_356_] != null) {
				int i_357_ = ((((jw) Jb[i_356_]).b * i_352_
					       + ((jw) Jb[i_356_]).c * i_353_)
					      >> 14);
				((jw) Jb[i_356_]).b
				    = (((jw) Jb[i_356_]).b * i_353_
				       - ((jw) Jb[i_356_]).c * i_352_) >> 14;
				((jw) Jb[i_356_]).c = i_357_;
			    }
			}
		    }
		    for (int i_358_ = tb; i_358_ < Zb; i_358_++) {
			int i_359_
			    = E[i_358_] * i_352_ + A[i_358_] * i_353_ >> 14;
			E[i_358_]
			    = E[i_358_] * i_353_ - A[i_358_] * i_352_ >> 14;
			A[i_358_] = i_359_;
		    }
		    Pb = 0;
		    xb = false;
		}
	    }
	} else
	    M(i);
    }
    
    public static void o() {
	Yb = null;
    }
    
    final void a(da var_da, int i, int i_360_, int i_361_, boolean bool) {
	rw var_rw_362_ = (rw) var_da;
	if ((Vb & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((var_rw_362_.Vb & 0x10000) != 65536)
	    throw new IllegalStateException("");
	b(Thread.currentThread());
	t();
	r();
	var_rw_362_.t();
	var_rw_362_.r();
	fb++;
	int i_363_ = 0;
	int[] is = var_rw_362_.A;
	int i_364_ = var_rw_362_.tb;
	for (int i_365_ = 0; i_365_ < tb; i_365_++) {
	    ve var_ve = W[i_365_];
	    if (((ve) var_ve).b != 0) {
		int i_366_ = qb[i_365_] - i_360_;
		if (i_366_ >= var_rw_362_.Qb && i_366_ <= var_rw_362_.F) {
		    int i_367_ = A[i_365_] - i;
		    if (i_367_ >= var_rw_362_.rb && i_367_ <= var_rw_362_.Z) {
			int i_368_ = E[i_365_] - i_361_;
			if (i_368_ >= var_rw_362_.Y
			    && i_368_ <= var_rw_362_.r) {
			    for (int i_369_ = 0; i_369_ < i_364_; i_369_++) {
				ve var_ve_370_ = var_rw_362_.W[i_369_];
				if (i_367_ == is[i_369_]
				    && i_368_ == var_rw_362_.E[i_369_]
				    && i_366_ == var_rw_362_.qb[i_369_]
				    && ((ve) var_ve_370_).b != 0) {
				    if (O == null)
					O = new ve[tb];
				    if (var_rw_362_.O == null)
					var_rw_362_.O = new ve[i_364_];
				    ve var_ve_371_ = O[i_365_];
				    if (var_ve_371_ == null)
					var_ve_371_ = O[i_365_]
					    = new ve(var_ve);
				    ve var_ve_372_ = var_rw_362_.O[i_369_];
				    if (var_ve_372_ == null)
					var_ve_372_ = var_rw_362_.O[i_369_]
					    = new ve(var_ve_370_);
				    ((ve) var_ve_371_).a
					+= ((ve) var_ve_370_).a;
				    ((ve) var_ve_371_).d
					+= ((ve) var_ve_370_).d;
				    ((ve) var_ve_371_).c
					+= ((ve) var_ve_370_).c;
				    ((ve) var_ve_371_).b
					+= ((ve) var_ve_370_).b;
				    ((ve) var_ve_372_).a += ((ve) var_ve).a;
				    ((ve) var_ve_372_).d += ((ve) var_ve).d;
				    ((ve) var_ve_372_).c += ((ve) var_ve).c;
				    ((ve) var_ve_372_).b += ((ve) var_ve).b;
				    i_363_++;
				    w[i_365_] = fb;
				    Hb[i_369_] = fb;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_363_ >= 3 && bool) {
	    for (int i_373_ = 0; i_373_ < D; i_373_++) {
		if (w[T[i_373_]] == fb && w[N[i_373_]] == fb
		    && w[kb[i_373_]] == fb) {
		    if (q == null)
			q = new byte[D];
		    q[i_373_] = (byte) 2;
		}
	    }
	    for (int i_374_ = 0; i_374_ < var_rw_362_.D; i_374_++) {
		if (Hb[var_rw_362_.T[i_374_]] == fb
		    && Hb[var_rw_362_.N[i_374_]] == fb
		    && Hb[var_rw_362_.kb[i_374_]] == fb) {
		    if (var_rw_362_.q == null)
			var_rw_362_.q = new byte[var_rw_362_.D];
		    var_rw_362_.q[i_374_] = (byte) 2;
		}
	    }
	}
    }
    
    final void a() {
	/* empty */
    }
    
    final int K() {
	if (!xb)
	    t();
	return cb;
    }
    
    final hi[] c() {
	return Ob;
    }
    
    private final void a(int i, boolean bool, boolean bool_375_) {
	if (Ab[i] != -2) {
	    short i_376_ = T[i];
	    short i_377_ = N[i];
	    short i_378_ = kb[i];
	    int i_379_ = X[i_376_];
	    int i_380_ = X[i_377_];
	    int i_381_ = X[i_378_];
	    if (bool
		&& (i_379_ == -5000 || i_380_ == -5000 || i_381_ == -5000)) {
		int i_382_ = x[i_376_];
		int i_383_ = x[i_377_];
		int i_384_ = x[i_378_];
		int i_385_ = K[i_376_];
		int i_386_ = K[i_377_];
		int i_387_ = K[i_378_];
		int i_388_ = S[i_376_];
		int i_389_ = S[i_377_];
		int i_390_ = S[i_378_];
		i_382_ -= i_383_;
		i_384_ -= i_383_;
		i_385_ -= i_386_;
		i_387_ -= i_386_;
		i_388_ -= i_389_;
		i_390_ -= i_389_;
		int i_391_ = i_385_ * i_390_ - i_388_ * i_387_;
		int i_392_ = i_388_ * i_384_ - i_382_ * i_390_;
		int i_393_ = i_382_ * i_387_ - i_385_ * i_384_;
		if (i_383_ * i_391_ + i_386_ * i_392_ + i_389_ * i_393_ > 0)
		    f(i);
	    } else if (Eb[i] != -1
		       || (((i_379_ - i_380_) * (Wb[i_378_] - Wb[i_377_])
			    - (Wb[i_376_] - Wb[i_377_]) * (i_381_ - i_380_))
			   > 0)) {
		if (i_379_ < 0 || i_380_ < 0 || i_381_ < 0
		    || i_379_ > ((lfa) Nb).bb || i_380_ > ((lfa) Nb).bb
		    || i_381_ > ((lfa) Nb).bb)
		    ((jea) B).o = true;
		else
		    ((jea) B).o = false;
		if (bool_375_) {
		    int i_394_ = Eb[i];
		    if (i_394_ == -1 || !((mh) eb[i_394_]).c)
			g(i);
		} else {
		    int i_395_ = Eb[i];
		    if (i_395_ != -1) {
			mh var_mh = eb[i_395_];
			ff var_ff = sb[i_395_];
			if (!((mh) var_mh).c)
			    b(i);
			I.b(((ff) var_ff).c, ((ff) var_ff).n, ((ff) var_ff).o,
			    ((ff) var_ff).k, ((ff) var_ff).t, ((ff) var_ff).e,
			    ((mh) var_mh).l & 0xffff, ((ff) var_ff).j,
			    ((mh) var_mh).a, ((mh) var_mh).f);
		    } else
			b(i);
		}
	    }
	}
    }
    
    private final boolean b(int i, int i_396_, Class_q class_q, boolean bool,
			    int i_397_) {
	t = (rd) class_q;
	rd var_rd = ((nga) I).bb;
	float f = ((rd) var_rd).v + (((rd) var_rd).z * ((rd) t).v
				     + ((rd) var_rd).m * ((rd) t).o
				     + ((rd) var_rd).s * ((rd) t).B);
	float f_398_ = ((rd) var_rd).o + (((rd) var_rd).i * ((rd) t).v
					  + ((rd) var_rd).k * ((rd) t).o
					  + ((rd) var_rd).w * ((rd) t).B);
	float f_399_ = ((rd) var_rd).B + (((rd) var_rd).q * ((rd) t).v
					  + ((rd) var_rd).M * ((rd) t).o
					  + ((rd) var_rd).C * ((rd) t).B);
	float f_400_
	    = (((rd) var_rd).z * ((rd) t).z + ((rd) var_rd).m * ((rd) t).i
	       + ((rd) var_rd).s * ((rd) t).q);
	float f_401_
	    = (((rd) var_rd).z * ((rd) t).m + ((rd) var_rd).m * ((rd) t).k
	       + ((rd) var_rd).s * ((rd) t).M);
	float f_402_
	    = (((rd) var_rd).z * ((rd) t).s + ((rd) var_rd).m * ((rd) t).w
	       + ((rd) var_rd).s * ((rd) t).C);
	float f_403_
	    = (((rd) var_rd).i * ((rd) t).z + ((rd) var_rd).k * ((rd) t).i
	       + ((rd) var_rd).w * ((rd) t).q);
	float f_404_
	    = (((rd) var_rd).i * ((rd) t).m + ((rd) var_rd).k * ((rd) t).k
	       + ((rd) var_rd).w * ((rd) t).M);
	float f_405_
	    = (((rd) var_rd).i * ((rd) t).s + ((rd) var_rd).k * ((rd) t).w
	       + ((rd) var_rd).w * ((rd) t).C);
	float f_406_
	    = (((rd) var_rd).q * ((rd) t).z + ((rd) var_rd).M * ((rd) t).i
	       + ((rd) var_rd).C * ((rd) t).q);
	float f_407_
	    = (((rd) var_rd).q * ((rd) t).m + ((rd) var_rd).M * ((rd) t).k
	       + ((rd) var_rd).C * ((rd) t).M);
	float f_408_
	    = (((rd) var_rd).q * ((rd) t).s + ((rd) var_rd).M * ((rd) t).w
	       + ((rd) var_rd).C * ((rd) t).C);
	boolean bool_409_ = false;
	int i_410_ = ((nga) I).X;
	int i_411_ = ((nga) I).y;
	int i_412_ = ((nga) I).L;
	int i_413_ = ((nga) I).O;
	int i_414_ = 2147483647;
	int i_415_ = -2147483648;
	int i_416_ = 2147483647;
	int i_417_ = -2147483648;
	b(Thread.currentThread());
	if (!xb)
	    t();
	J[0] = rb;
	Gb[0] = Qb;
	lb[0] = Y;
	J[1] = Z;
	Gb[1] = Qb;
	lb[1] = Y;
	J[2] = rb;
	Gb[2] = F;
	lb[2] = Y;
	J[3] = Z;
	Gb[3] = F;
	lb[3] = Y;
	J[4] = rb;
	Gb[4] = Qb;
	lb[4] = r;
	J[5] = Z;
	Gb[5] = Qb;
	lb[5] = r;
	J[6] = rb;
	Gb[6] = F;
	lb[6] = r;
	J[7] = Z;
	Gb[7] = F;
	lb[7] = r;
	for (int i_418_ = 0; i_418_ < 8; i_418_++) {
	    int i_419_ = J[i_418_];
	    int i_420_ = Gb[i_418_];
	    int i_421_ = lb[i_418_];
	    float f_422_
		= f + (f_400_ * (float) i_419_ + f_401_ * (float) i_420_
		       + f_402_ * (float) i_421_);
	    float f_423_
		= f_398_ + (f_403_ * (float) i_419_ + f_404_ * (float) i_420_
			    + f_405_ * (float) i_421_);
	    float f_424_
		= f_399_ + (f_406_ * (float) i_419_ + f_407_ * (float) i_420_
			    + f_408_ * (float) i_421_);
	    if (f_424_ >= (float) ((nga) I).M) {
		if (i_397_ > 0)
		    f_424_ = (float) i_397_;
		int i_425_ = i_410_ + (int) (f_422_ * (float) i_412_ / f_424_);
		int i_426_ = i_411_ + (int) (f_423_ * (float) i_413_ / f_424_);
		if (i_425_ < i_414_)
		    i_414_ = i_425_;
		if (i_425_ > i_415_)
		    i_415_ = i_425_;
		if (i_426_ < i_416_)
		    i_416_ = i_426_;
		if (i_426_ > i_417_)
		    i_417_ = i_426_;
		bool_409_ = true;
	    }
	}
	if (bool_409_ && i > i_414_ && i < i_415_ && i_396_ > i_416_
	    && i_396_ < i_417_) {
	    if (bool)
		return true;
	    for (int i_427_ = 0; i_427_ < Zb; i_427_++) {
		int i_428_ = A[i_427_];
		int i_429_ = qb[i_427_];
		int i_430_ = E[i_427_];
		float f_431_
		    = f + (f_400_ * (float) i_428_ + f_401_ * (float) i_429_
			   + f_402_ * (float) i_430_);
		float f_432_ = f_398_ + (f_403_ * (float) i_428_
					 + f_404_ * (float) i_429_
					 + f_405_ * (float) i_430_);
		float f_433_ = f_399_ + (f_406_ * (float) i_428_
					 + f_407_ * (float) i_429_
					 + f_408_ * (float) i_430_);
		if (f_433_ >= (float) ((nga) I).M) {
		    if (i_397_ > 0)
			f_433_ = (float) i_397_;
		    X[i_427_]
			= i_410_ + (int) (f_431_ * (float) i_412_ / f_433_);
		    Wb[i_427_]
			= i_411_ + (int) (f_432_ * (float) i_413_ / f_433_);
		} else
		    X[i_427_] = -999999;
	    }
	    for (int i_434_ = 0; i_434_ < D; i_434_++) {
		if (X[T[i_434_]] != -999999 && X[N[i_434_]] != -999999
		    && X[kb[i_434_]] != -999999
		    && a(i, i_396_, Wb[T[i_434_]], Wb[N[i_434_]],
			 Wb[kb[i_434_]], X[T[i_434_]], X[N[i_434_]],
			 X[kb[i_434_]]))
		    return true;
	    }
	}
	return false;
    }
    
    final void T(int i) {
	if ((Vb & 0x1000) != 4096)
	    throw new IllegalStateException();
	p = i;
	Pb = 0;
    }
    
    final void a(int i, int[] is, int i_435_, int i_436_, int i_437_,
		 int i_438_, boolean bool) {
	int i_439_ = is.length;
	if (i == 0) {
	    i_435_ <<= 4;
	    i_436_ <<= 4;
	    i_437_ <<= 4;
	    if (!ib) {
		for (int i_440_ = 0; i_440_ < Zb; i_440_++) {
		    A[i_440_] <<= 4;
		    qb[i_440_] <<= 4;
		    E[i_440_] <<= 4;
		}
		ib = true;
	    }
	    int i_441_ = 0;
	    Bb = 0;
	    Q = 0;
	    Fb = 0;
	    for (int i_442_ = 0; i_442_ < i_439_; i_442_++) {
		int i_443_ = is[i_442_];
		if (i_443_ < R.length) {
		    int[] is_444_ = R[i_443_];
		    for (int i_445_ = 0; i_445_ < is_444_.length; i_445_++) {
			int i_446_ = is_444_[i_445_];
			Bb += A[i_446_];
			Q += qb[i_446_];
			Fb += E[i_446_];
			i_441_++;
		    }
		}
	    }
	    if (i_441_ > 0) {
		Bb = Bb / i_441_ + i_435_;
		Q = Q / i_441_ + i_436_;
		Fb = Fb / i_441_ + i_437_;
	    } else {
		Bb = i_435_;
		Q = i_436_;
		Fb = i_437_;
	    }
	} else if (i == 1) {
	    i_435_ <<= 4;
	    i_436_ <<= 4;
	    i_437_ <<= 4;
	    if (!ib) {
		for (int i_447_ = 0; i_447_ < Zb; i_447_++) {
		    A[i_447_] <<= 4;
		    qb[i_447_] <<= 4;
		    E[i_447_] <<= 4;
		}
		ib = true;
	    }
	    for (int i_448_ = 0; i_448_ < i_439_; i_448_++) {
		int i_449_ = is[i_448_];
		if (i_449_ < R.length) {
		    int[] is_450_ = R[i_449_];
		    for (int i_451_ = 0; i_451_ < is_450_.length; i_451_++) {
			int i_452_ = is_450_[i_451_];
			A[i_452_] += i_435_;
			qb[i_452_] += i_436_;
			E[i_452_] += i_437_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_453_ = 0; i_453_ < i_439_; i_453_++) {
		int i_454_ = is[i_453_];
		if (i_454_ < R.length) {
		    int[] is_455_ = R[i_454_];
		    if ((i_438_ & 0x1) == 0) {
			for (int i_456_ = 0; i_456_ < is_455_.length;
			     i_456_++) {
			    int i_457_ = is_455_[i_456_];
			    A[i_457_] -= Bb;
			    qb[i_457_] -= Q;
			    E[i_457_] -= Fb;
			    if (i_437_ != 0) {
				int i_458_ = GameInPacket.ints1[i_437_];
				int i_459_ = GameInPacket.ints2[i_437_];
				int i_460_ = ((qb[i_457_] * i_458_
					       + A[i_457_] * i_459_ + 16383)
					      >> 14);
				qb[i_457_]
				    = (qb[i_457_] * i_459_ - A[i_457_] * i_458_
				       + 16383) >> 14;
				A[i_457_] = i_460_;
			    }
			    if (i_435_ != 0) {
				int i_461_ = GameInPacket.ints1[i_435_];
				int i_462_ = GameInPacket.ints2[i_435_];
				int i_463_ = ((qb[i_457_] * i_462_
					       - E[i_457_] * i_461_ + 16383)
					      >> 14);
				E[i_457_]
				    = (qb[i_457_] * i_461_ + E[i_457_] * i_462_
				       + 16383) >> 14;
				qb[i_457_] = i_463_;
			    }
			    if (i_436_ != 0) {
				int i_464_ = GameInPacket.ints1[i_436_];
				int i_465_ = GameInPacket.ints2[i_436_];
				int i_466_ = ((E[i_457_] * i_464_
					       + A[i_457_] * i_465_ + 16383)
					      >> 14);
				E[i_457_]
				    = (E[i_457_] * i_465_ - A[i_457_] * i_464_
				       + 16383) >> 14;
				A[i_457_] = i_466_;
			    }
			    A[i_457_] += Bb;
			    qb[i_457_] += Q;
			    E[i_457_] += Fb;
			}
		    } else {
			for (int i_467_ = 0; i_467_ < is_455_.length;
			     i_467_++) {
			    int i_468_ = is_455_[i_467_];
			    A[i_468_] -= Bb;
			    qb[i_468_] -= Q;
			    E[i_468_] -= Fb;
			    if (i_435_ != 0) {
				int i_469_ = GameInPacket.ints1[i_435_];
				int i_470_ = GameInPacket.ints2[i_435_];
				int i_471_ = ((qb[i_468_] * i_470_
					       - E[i_468_] * i_469_ + 16383)
					      >> 14);
				E[i_468_]
				    = (qb[i_468_] * i_469_ + E[i_468_] * i_470_
				       + 16383) >> 14;
				qb[i_468_] = i_471_;
			    }
			    if (i_437_ != 0) {
				int i_472_ = GameInPacket.ints1[i_437_];
				int i_473_ = GameInPacket.ints2[i_437_];
				int i_474_ = ((qb[i_468_] * i_472_
					       + A[i_468_] * i_473_ + 16383)
					      >> 14);
				qb[i_468_]
				    = (qb[i_468_] * i_473_ - A[i_468_] * i_472_
				       + 16383) >> 14;
				A[i_468_] = i_474_;
			    }
			    if (i_436_ != 0) {
				int i_475_ = GameInPacket.ints1[i_436_];
				int i_476_ = GameInPacket.ints2[i_436_];
				int i_477_ = ((E[i_468_] * i_475_
					       + A[i_468_] * i_476_ + 16383)
					      >> 14);
				E[i_468_]
				    = (E[i_468_] * i_476_ - A[i_468_] * i_475_
				       + 16383) >> 14;
				A[i_468_] = i_477_;
			    }
			    A[i_468_] += Bb;
			    qb[i_468_] += Q;
			    E[i_468_] += Fb;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_478_ = 0; i_478_ < i_439_; i_478_++) {
		int i_479_ = is[i_478_];
		if (i_479_ < R.length) {
		    int[] is_480_ = R[i_479_];
		    for (int i_481_ = 0; i_481_ < is_480_.length; i_481_++) {
			int i_482_ = is_480_[i_481_];
			A[i_482_] -= Bb;
			qb[i_482_] -= Q;
			E[i_482_] -= Fb;
			A[i_482_] = A[i_482_] * i_435_ / 128;
			qb[i_482_] = qb[i_482_] * i_436_ / 128;
			E[i_482_] = E[i_482_] * i_437_ / 128;
			A[i_482_] += Bb;
			qb[i_482_] += Q;
			E[i_482_] += Fb;
		    }
		}
	    }
	} else if (i == 5) {
	    if (db != null && cc != null) {
		for (int i_483_ = 0; i_483_ < i_439_; i_483_++) {
		    int i_484_ = is[i_483_];
		    if (i_484_ < db.length) {
			int[] is_485_ = db[i_484_];
			for (int i_486_ = 0; i_486_ < is_485_.length;
			     i_486_++) {
			    int i_487_ = is_485_[i_486_];
			    int i_488_ = (cc[i_487_] & 0xff) + i_435_ * 8;
			    if (i_488_ < 0)
				i_488_ = 0;
			    else if (i_488_ > 255)
				i_488_ = 255;
			    cc[i_487_] = (byte) i_488_;
			}
		    }
		}
		if (eb != null) {
		    for (int i_489_ = 0; i_489_ < Sb; i_489_++) {
			mh var_mh = eb[i_489_];
			ff var_ff = sb[i_489_];
			((ff) var_ff).j
			    = (((ff) var_ff).j & 0xffffff
			       | 255 - (cc[((mh) var_mh).h] & 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (db != null) {
		for (int i_490_ = 0; i_490_ < i_439_; i_490_++) {
		    int i_491_ = is[i_490_];
		    if (i_491_ < db.length) {
			int[] is_492_ = db[i_491_];
			for (int i_493_ = 0; i_493_ < is_492_.length;
			     i_493_++) {
			    int i_494_ = is_492_[i_493_];
			    int i_495_ = wb[i_494_] & 0xffff;
			    int i_496_ = i_495_ >> 10 & 0x3f;
			    int i_497_ = i_495_ >> 7 & 0x7;
			    int i_498_ = i_495_ & 0x7f;
			    i_496_ = i_496_ + i_435_ & 0x3f;
			    i_497_ += i_436_;
			    if (i_497_ < 0)
				i_497_ = 0;
			    else if (i_497_ > 7)
				i_497_ = 7;
			    i_498_ += i_437_;
			    if (i_498_ < 0)
				i_498_ = 0;
			    else if (i_498_ > 127)
				i_498_ = 127;
			    wb[i_494_] = (short) (i_496_ << 10 | i_497_ << 7
						  | i_498_);
			}
			z = true;
		    }
		}
		if (eb != null) {
		    for (int i_499_ = 0; i_499_ < Sb; i_499_++) {
			mh var_mh = eb[i_499_];
			ff var_ff = sb[i_499_];
			((ff) var_ff).j
			    = (((ff) var_ff).j & ~0xffffff
			       | vq.m[(pg.a(0, wb[((mh) var_mh).h] & 0xffff)
				       & 0xffff)] & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (Tb != null) {
		for (int i_500_ = 0; i_500_ < i_439_; i_500_++) {
		    int i_501_ = is[i_500_];
		    if (i_501_ < Tb.length) {
			int[] is_502_ = Tb[i_501_];
			for (int i_503_ = 0; i_503_ < is_502_.length;
			     i_503_++) {
			    ff var_ff = sb[is_502_[i_503_]];
			    ((ff) var_ff).d += i_435_;
			    ((ff) var_ff).m += i_436_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (Tb != null) {
		for (int i_504_ = 0; i_504_ < i_439_; i_504_++) {
		    int i_505_ = is[i_504_];
		    if (i_505_ < Tb.length) {
			int[] is_506_ = Tb[i_505_];
			for (int i_507_ = 0; i_507_ < is_506_.length;
			     i_507_++) {
			    ff var_ff = sb[is_506_[i_507_]];
			    ((ff) var_ff).a = ((ff) var_ff).a * i_435_ >> 7;
			    ((ff) var_ff).f = ((ff) var_ff).f * i_436_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9 && Tb != null) {
	    for (int i_508_ = 0; i_508_ < i_439_; i_508_++) {
		int i_509_ = is[i_508_];
		if (i_509_ < Tb.length) {
		    int[] is_510_ = Tb[i_509_];
		    for (int i_511_ = 0; i_511_ < is_510_.length; i_511_++) {
			ff var_ff = sb[is_510_[i_511_]];
			((ff) var_ff).e = ((ff) var_ff).e + i_435_ & 0x3fff;
		    }
		}
	    }
	}
    }
    
    private final void b(Thread thread) {
	lfa var_lfa = I.a(thread);
	B = ((lfa) var_lfa).Q;
	if (var_lfa != Nb) {
	    Nb = var_lfa;
	    Db = ((lfa) Nb).J;
	    x = ((lfa) Nb).N;
	    K = ((lfa) Nb).H;
	    S = ((lfa) Nb).I;
	    X = ((lfa) Nb).W;
	    Wb = ((lfa) Nb).cb;
	    Ib = ((lfa) Nb).v;
	    J = ((lfa) Nb).ab;
	    Gb = ((lfa) Nb).M;
	    lb = ((lfa) Nb).w;
	    ac = ((lfa) Nb).L;
	    gb = ((lfa) Nb).A;
	    bc = ((lfa) Nb).x;
	    Ub = ((lfa) Nb).P;
	    w = ((lfa) Nb).Y;
	    Hb = ((lfa) Nb).O;
	    Eb = ((lfa) Nb).T;
	}
    }
    
    final int OA() {
	if (!xb)
	    t();
	return Y;
    }
    
    private final int e(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    final boolean b() {
	if (C == null)
	    return true;
	for (int i = 0; i < C.length; i++) {
	    if (C[i] != -1 && !I.n(C[i]))
		return false;
	}
	return true;
    }
    
    private final void p() {
	synchronized (this) {
	    for (int i = 0; i < tb; i++) {
		int i_512_ = A[i];
		A[i] = E[i];
		E[i] = -i_512_;
		if (W[i] != null) {
		    i_512_ = ((ve) W[i]).a;
		    ((ve) W[i]).a = ((ve) W[i]).c;
		    ((ve) W[i]).c = -i_512_;
		}
	    }
	    if (Jb != null) {
		for (int i = 0; i < D; i++) {
		    if (Jb[i] != null) {
			int i_513_ = ((jw) Jb[i]).c;
			((jw) Jb[i]).c = ((jw) Jb[i]).b;
			((jw) Jb[i]).b = -i_513_;
		    }
		}
	    }
	    for (int i = tb; i < Zb; i++) {
		int i_514_ = A[i];
		A[i] = E[i];
		E[i] = -i_514_;
	    }
	    Pb = 0;
	    xb = false;
	}
    }
    
    final boolean a(int i, int i_515_, Class_q class_q, boolean bool,
		    int i_516_) {
	return b(i, i_515_, class_q, bool, i_516_);
    }
    
    final void d() {
	if (((nga) I).V > 1) {
	    synchronized (this) {
		((da) this).f = false;
		this.notifyAll();
	    }
	}
    }
    
    final boolean LA() {
	return vb;
    }
    
    private final void q() {
	W = new ve[tb];
	for (int i = 0; i < tb; i++)
	    W[i] = new ve();
	for (int i = 0; i < D; i++) {
	    short i_517_ = T[i];
	    short i_518_ = N[i];
	    short i_519_ = kb[i];
	    int i_520_ = A[i_518_] - A[i_517_];
	    int i_521_ = qb[i_518_] - qb[i_517_];
	    int i_522_ = E[i_518_] - E[i_517_];
	    int i_523_ = A[i_519_] - A[i_517_];
	    int i_524_ = qb[i_519_] - qb[i_517_];
	    int i_525_ = E[i_519_] - E[i_517_];
	    int i_526_ = i_521_ * i_525_ - i_524_ * i_522_;
	    int i_527_ = i_522_ * i_523_ - i_525_ * i_520_;
	    int i_528_;
	    for (i_528_ = i_520_ * i_524_ - i_523_ * i_521_;
		 (i_526_ > 8192 || i_527_ > 8192 || i_528_ > 8192
		  || i_526_ < -8192 || i_527_ < -8192 || i_528_ < -8192);
		 i_528_ >>= 1) {
		i_526_ >>= 1;
		i_527_ >>= 1;
	    }
	    int i_529_
		= (int) Math.sqrt((double) (i_526_ * i_526_ + i_527_ * i_527_
					    + i_528_ * i_528_));
	    if (i_529_ <= 0)
		i_529_ = 1;
	    i_526_ = i_526_ * 256 / i_529_;
	    i_527_ = i_527_ * 256 / i_529_;
	    i_528_ = i_528_ * 256 / i_529_;
	    byte i_530_;
	    if (q == null)
		i_530_ = (byte) 0;
	    else
		i_530_ = q[i];
	    if (i_530_ == 0) {
		ve var_ve = W[i_517_];
		((ve) var_ve).a += i_526_;
		((ve) var_ve).d += i_527_;
		((ve) var_ve).c += i_528_;
		((ve) var_ve).b++;
		var_ve = W[i_518_];
		((ve) var_ve).a += i_526_;
		((ve) var_ve).d += i_527_;
		((ve) var_ve).c += i_528_;
		((ve) var_ve).b++;
		var_ve = W[i_519_];
		((ve) var_ve).a += i_526_;
		((ve) var_ve).d += i_527_;
		((ve) var_ve).c += i_528_;
		((ve) var_ve).b++;
	    } else if (i_530_ == 1) {
		if (Jb == null)
		    Jb = new jw[D];
		jw var_jw = Jb[i] = new jw();
		((jw) var_jw).c = i_526_;
		((jw) var_jw).a = i_527_;
		((jw) var_jw).b = i_528_;
	    }
	}
    }
    
    final boolean F() {
	if (R == null)
	    return false;
	Bb = 0;
	Q = 0;
	Fb = 0;
	return true;
    }
    
    private final void r() {
	if (Pb == 0 && W == null) {
	    if (((nga) I).V > 1) {
		synchronized (this) {
		    q();
		}
	    } else
		q();
	}
    }
    
    final boolean a(int i, int i_531_, Class_q class_q, boolean bool) {
	return b(i, i_531_, class_q, bool, -1);
    }
    
    private final void s() {
	if (Pb == 0)
	    c(false);
	else if (((nga) I).V > 1) {
	    synchronized (this) {
		h();
	    }
	} else
	    h();
    }
    
    final void R(int i, int i_532_, int i_533_) {
	if (i != 128 && (Vb & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_532_ != 128 && (Vb & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_533_ != 128 && (Vb & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_534_ = 0; i_534_ < Zb; i_534_++) {
		A[i_534_] = A[i_534_] * i >> 7;
		qb[i_534_] = qb[i_534_] * i_532_ >> 7;
		E[i_534_] = E[i_534_] * i_533_ >> 7;
	    }
	    xb = false;
	}
    }
    
    final void ba(int i, int i_535_, Class_i class_i, Class_i class_i_536_,
		  int i_537_, int i_538_, int i_539_) {
	if (i == 3) {
	    if ((Vb & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((Vb & 0x2) != 2)
	    throw new IllegalStateException();
	if (!xb)
	    t();
	int i_540_ = i_537_ + rb;
	int i_541_ = i_537_ + Z;
	int i_542_ = i_539_ + Y;
	int i_543_ = i_539_ + r;
	if (i == 4
	    || (i_540_ >= 0
		&& (i_541_ + ((Class_i) class_i).b >> ((Class_i) class_i).g
		    < ((Class_i) class_i).k)
		&& i_542_ >= 0
		&& (i_543_ + ((Class_i) class_i).b >> ((Class_i) class_i).g
		    < ((Class_i) class_i).j))) {
	    int[][] is = ((Class_i) (eu) class_i).f;
	    int[][] is_544_ = null;
	    if (class_i_536_ != null)
		is_544_ = ((Class_i) (eu) class_i_536_).f;
	    if (i == 4 || i == 5) {
		if (class_i_536_ == null
		    || (i_540_ < 0
			|| ((i_541_ + ((Class_i) class_i_536_).b
			     >> ((Class_i) class_i_536_).g)
			    >= ((Class_i) class_i_536_).k)
			|| i_542_ < 0
			|| ((i_543_ + ((Class_i) class_i_536_).b
			     >> ((Class_i) class_i_536_).g)
			    >= ((Class_i) class_i_536_).j)))
		    return;
	    } else {
		i_540_ >>= ((Class_i) class_i).g;
		i_541_ = (i_541_ + (((Class_i) class_i).b - 1)
			  >> ((Class_i) class_i).g);
		i_542_ >>= ((Class_i) class_i).g;
		i_543_ = (i_543_ + (((Class_i) class_i).b - 1)
			  >> ((Class_i) class_i).g);
		if (is[i_540_][i_542_] == i_538_
		    && is[i_541_][i_542_] == i_538_
		    && is[i_540_][i_543_] == i_538_
		    && is[i_541_][i_543_] == i_538_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_545_ = ((Class_i) class_i).b - 1;
		    for (int i_546_ = 0; i_546_ < tb; i_546_++) {
			int i_547_ = A[i_546_] + i_537_;
			int i_548_ = E[i_546_] + i_539_;
			int i_549_ = i_547_ & i_545_;
			int i_550_ = i_548_ & i_545_;
			int i_551_ = i_547_ >> ((Class_i) class_i).g;
			int i_552_ = i_548_ >> ((Class_i) class_i).g;
			int i_553_
			    = ((is[i_551_][i_552_] * (((Class_i) class_i).b
						      - i_549_)
				+ is[i_551_ + 1][i_552_] * i_549_)
			       >> ((Class_i) class_i).g);
			int i_554_
			    = ((is[i_551_][i_552_ + 1] * (((Class_i) class_i).b
							  - i_549_)
				+ is[i_551_ + 1][i_552_ + 1] * i_549_)
			       >> ((Class_i) class_i).g);
			int i_555_ = (i_553_ * (((Class_i) class_i).b
						- i_550_) + i_554_ * i_550_
				      >> ((Class_i) class_i).g);
			qb[i_546_] = qb[i_546_] + i_555_ - i_538_;
		    }
		    for (int i_556_ = tb; i_556_ < Zb; i_556_++) {
			int i_557_ = A[i_556_] + i_537_;
			int i_558_ = E[i_556_] + i_539_;
			int i_559_ = i_557_ & i_545_;
			int i_560_ = i_558_ & i_545_;
			int i_561_ = i_557_ >> ((Class_i) class_i).g;
			int i_562_ = i_558_ >> ((Class_i) class_i).g;
			if (i_561_ >= 0 && i_561_ < is.length - 1
			    && i_562_ >= 0 && i_562_ < is[0].length - 1) {
			    int i_563_
				= ((is[i_561_][i_562_] * (((Class_i) class_i).b
							  - i_559_)
				    + is[i_561_ + 1][i_562_] * i_559_)
				   >> ((Class_i) class_i).g);
			    int i_564_
				= (((is[i_561_][i_562_ + 1]
				     * (((Class_i) class_i).b - i_559_))
				    + is[i_561_ + 1][i_562_ + 1] * i_559_)
				   >> ((Class_i) class_i).g);
			    int i_565_ = (i_563_ * (((Class_i) class_i).b
						    - i_560_) + i_564_ * i_560_
					  >> ((Class_i) class_i).g);
			    qb[i_556_] = qb[i_556_] + i_565_ - i_538_;
			}
		    }
		} else if (i == 2) {
		    int i_566_ = ((Class_i) class_i).b - 1;
		    for (int i_567_ = 0; i_567_ < tb; i_567_++) {
			int i_568_ = (qb[i_567_] << 16) / Qb;
			if (i_568_ < i_535_) {
			    int i_569_ = A[i_567_] + i_537_;
			    int i_570_ = E[i_567_] + i_539_;
			    int i_571_ = i_569_ & i_566_;
			    int i_572_ = i_570_ & i_566_;
			    int i_573_ = i_569_ >> ((Class_i) class_i).g;
			    int i_574_ = i_570_ >> ((Class_i) class_i).g;
			    int i_575_
				= ((is[i_573_][i_574_] * (((Class_i) class_i).b
							  - i_571_)
				    + is[i_573_ + 1][i_574_] * i_571_)
				   >> ((Class_i) class_i).g);
			    int i_576_
				= (((is[i_573_][i_574_ + 1]
				     * (((Class_i) class_i).b - i_571_))
				    + is[i_573_ + 1][i_574_ + 1] * i_571_)
				   >> ((Class_i) class_i).g);
			    int i_577_ = (i_575_ * (((Class_i) class_i).b
						    - i_572_) + i_576_ * i_572_
					  >> ((Class_i) class_i).g);
			    qb[i_567_]
				= qb[i_567_] + ((i_577_ - i_538_)
						* (i_535_ - i_568_) / i_535_);
			} else
			    qb[i_567_] = qb[i_567_];
		    }
		    for (int i_578_ = tb; i_578_ < Zb; i_578_++) {
			int i_579_ = (qb[i_578_] << 16) / Qb;
			if (i_579_ < i_535_) {
			    int i_580_ = A[i_578_] + i_537_;
			    int i_581_ = E[i_578_] + i_539_;
			    int i_582_ = i_580_ & i_566_;
			    int i_583_ = i_581_ & i_566_;
			    int i_584_ = i_580_ >> ((Class_i) class_i).g;
			    int i_585_ = i_581_ >> ((Class_i) class_i).g;
			    if (i_584_ >= 0
				&& i_584_ < ((Class_i) class_i).k - 1
				&& i_585_ >= 0
				&& i_585_ < ((Class_i) class_i).j - 1) {
				int i_586_
				    = (((is[i_584_][i_585_]
					 * (((Class_i) class_i).b - i_582_))
					+ is[i_584_ + 1][i_585_] * i_582_)
				       >> ((Class_i) class_i).g);
				int i_587_
				    = (((is[i_584_][i_585_ + 1]
					 * (((Class_i) class_i).b - i_582_))
					+ is[i_584_ + 1][i_585_ + 1] * i_582_)
				       >> ((Class_i) class_i).g);
				int i_588_
				    = (i_586_ * (((Class_i) class_i).b
						 - i_583_) + i_587_ * i_583_
				       >> ((Class_i) class_i).g);
				qb[i_578_] = qb[i_578_] + ((i_588_ - i_538_)
							   * (i_535_ - i_579_)
							   / i_535_);
			    }
			} else
			    qb[i_578_] = qb[i_578_];
		    }
		} else if (i == 3) {
		    int i_589_ = (i_535_ & 0xff) * 4;
		    int i_590_ = (i_535_ >> 8 & 0xff) * 4;
		    int i_591_ = (i_535_ >> 16 & 0xff) << 6;
		    int i_592_ = (i_535_ >> 24 & 0xff) << 6;
		    if (i_537_ - (i_589_ >> 1) < 0
			|| (i_537_ + (i_589_ >> 1) + ((Class_i) class_i).b
			    >= ((Class_i) class_i).k << ((Class_i) class_i).g)
			|| i_539_ - (i_590_ >> 1) < 0
			|| (i_539_ + (i_590_ >> 1) + ((Class_i) class_i).b
			    >= ((Class_i) class_i).j << ((Class_i) class_i).g))
			return;
		    this.a(i_590_, class_i, i_537_, i_591_, 0, i_589_, i_538_,
			   i_592_, i_539_);
		} else if (i == 4) {
		    int i_593_ = ((Class_i) class_i_536_).b - 1;
		    int i_594_ = F - Qb;
		    for (int i_595_ = 0; i_595_ < tb; i_595_++) {
			int i_596_ = A[i_595_] + i_537_;
			int i_597_ = E[i_595_] + i_539_;
			int i_598_ = i_596_ & i_593_;
			int i_599_ = i_597_ & i_593_;
			int i_600_ = i_596_ >> ((Class_i) class_i_536_).g;
			int i_601_ = i_597_ >> ((Class_i) class_i_536_).g;
			int i_602_
			    = (((is_544_[i_600_][i_601_]
				 * (((Class_i) class_i_536_).b - i_598_))
				+ is_544_[i_600_ + 1][i_601_] * i_598_)
			       >> ((Class_i) class_i_536_).g);
			int i_603_
			    = (((is_544_[i_600_][i_601_ + 1]
				 * (((Class_i) class_i_536_).b - i_598_))
				+ is_544_[i_600_ + 1][i_601_ + 1] * i_598_)
			       >> ((Class_i) class_i_536_).g);
			int i_604_ = (i_602_ * (((Class_i) class_i_536_).b
						- i_599_) + i_603_ * i_599_
				      >> ((Class_i) class_i_536_).g);
			qb[i_595_] = qb[i_595_] + (i_604_ - i_538_) + i_594_;
		    }
		    for (int i_605_ = tb; i_605_ < Zb; i_605_++) {
			int i_606_ = A[i_605_] + i_537_;
			int i_607_ = E[i_605_] + i_539_;
			int i_608_ = i_606_ & i_593_;
			int i_609_ = i_607_ & i_593_;
			int i_610_ = i_606_ >> ((Class_i) class_i_536_).g;
			int i_611_ = i_607_ >> ((Class_i) class_i_536_).g;
			if (i_610_ >= 0
			    && i_610_ < ((Class_i) class_i_536_).k - 1
			    && i_611_ >= 0
			    && i_611_ < ((Class_i) class_i_536_).j - 1) {
			    int i_612_
				= (((is_544_[i_610_][i_611_]
				     * (((Class_i) class_i_536_).b - i_608_))
				    + is_544_[i_610_ + 1][i_611_] * i_608_)
				   >> ((Class_i) class_i_536_).g);
			    int i_613_
				= (((is_544_[i_610_][i_611_ + 1]
				     * (((Class_i) class_i_536_).b - i_608_))
				    + is_544_[i_610_ + 1][i_611_ + 1] * i_608_)
				   >> ((Class_i) class_i_536_).g);
			    int i_614_ = (i_612_ * (((Class_i) class_i_536_).b
						    - i_609_) + i_613_ * i_609_
					  >> ((Class_i) class_i_536_).g);
			    qb[i_605_]
				= qb[i_605_] + (i_614_ - i_538_) + i_594_;
			}
		    }
		} else if (i == 5) {
		    int i_615_ = ((Class_i) class_i_536_).b - 1;
		    int i_616_ = F - Qb;
		    for (int i_617_ = 0; i_617_ < tb; i_617_++) {
			int i_618_ = A[i_617_] + i_537_;
			int i_619_ = E[i_617_] + i_539_;
			int i_620_ = i_618_ & i_615_;
			int i_621_ = i_619_ & i_615_;
			int i_622_ = i_618_ >> ((Class_i) class_i).g;
			int i_623_ = i_619_ >> ((Class_i) class_i).g;
			int i_624_
			    = ((is[i_622_][i_623_] * (((Class_i) class_i).b
						      - i_620_)
				+ is[i_622_ + 1][i_623_] * i_620_)
			       >> ((Class_i) class_i).g);
			int i_625_
			    = ((is[i_622_][i_623_ + 1] * (((Class_i) class_i).b
							  - i_620_)
				+ is[i_622_ + 1][i_623_ + 1] * i_620_)
			       >> ((Class_i) class_i).g);
			int i_626_ = (i_624_ * (((Class_i) class_i).b
						- i_621_) + i_625_ * i_621_
				      >> ((Class_i) class_i).g);
			i_624_ = (((is_544_[i_622_][i_623_]
				    * (((Class_i) class_i_536_).b - i_620_))
				   + is_544_[i_622_ + 1][i_623_] * i_620_)
				  >> ((Class_i) class_i_536_).g);
			i_625_ = (((is_544_[i_622_][i_623_ + 1]
				    * (((Class_i) class_i_536_).b - i_620_))
				   + is_544_[i_622_ + 1][i_623_ + 1] * i_620_)
				  >> ((Class_i) class_i_536_).g);
			int i_627_ = (i_624_ * (((Class_i) class_i_536_).b
						- i_621_) + i_625_ * i_621_
				      >> ((Class_i) class_i_536_).g);
			int i_628_ = i_626_ - i_627_ - i_535_;
			qb[i_617_] = ((qb[i_617_] << 8) / i_616_ * i_628_
				      >> 8) - (i_538_ - i_626_);
		    }
		    for (int i_629_ = tb; i_629_ < Zb; i_629_++) {
			int i_630_ = A[i_629_] + i_537_;
			int i_631_ = E[i_629_] + i_539_;
			int i_632_ = i_630_ & i_615_;
			int i_633_ = i_631_ & i_615_;
			int i_634_ = i_630_ >> ((Class_i) class_i).g;
			int i_635_ = i_631_ >> ((Class_i) class_i).g;
			if (i_634_ >= 0 && i_634_ < ((Class_i) class_i).k - 1
			    && i_634_ < ((Class_i) class_i_536_).k - 1
			    && i_635_ >= 0
			    && i_635_ < ((Class_i) class_i).j - 1
			    && i_635_ < ((Class_i) class_i_536_).j - 1) {
			    int i_636_
				= ((is[i_634_][i_635_] * (((Class_i) class_i).b
							  - i_632_)
				    + is[i_634_ + 1][i_635_] * i_632_)
				   >> ((Class_i) class_i).g);
			    int i_637_
				= (((is[i_634_][i_635_ + 1]
				     * (((Class_i) class_i).b - i_632_))
				    + is[i_634_ + 1][i_635_ + 1] * i_632_)
				   >> ((Class_i) class_i).g);
			    int i_638_ = (i_636_ * (((Class_i) class_i).b
						    - i_633_) + i_637_ * i_633_
					  >> ((Class_i) class_i).g);
			    i_636_
				= (((is_544_[i_634_][i_635_]
				     * (((Class_i) class_i_536_).b - i_632_))
				    + is_544_[i_634_ + 1][i_635_] * i_632_)
				   >> ((Class_i) class_i_536_).g);
			    i_637_
				= (((is_544_[i_634_][i_635_ + 1]
				     * (((Class_i) class_i_536_).b - i_632_))
				    + is_544_[i_634_ + 1][i_635_ + 1] * i_632_)
				   >> ((Class_i) class_i_536_).g);
			    int i_639_ = (i_636_ * (((Class_i) class_i_536_).b
						    - i_633_) + i_637_ * i_633_
					  >> ((Class_i) class_i_536_).g);
			    int i_640_ = i_638_ - i_639_ - i_535_;
			    qb[i_629_] = ((qb[i_629_] << 8) / i_616_ * i_640_
					  >> 8) - (i_538_ - i_638_);
			}
		    }
		}
		xb = false;
	    }
	}
    }
    
    private final void t() {
	if (!xb) {
	    int i = 0;
	    int i_641_ = 0;
	    int i_642_ = 32767;
	    int i_643_ = 32767;
	    int i_644_ = 32767;
	    int i_645_ = -32768;
	    int i_646_ = -32768;
	    int i_647_ = -32768;
	    for (int i_648_ = 0; i_648_ < tb; i_648_++) {
		int i_649_ = A[i_648_];
		int i_650_ = qb[i_648_];
		int i_651_ = E[i_648_];
		if (i_649_ < i_642_)
		    i_642_ = i_649_;
		if (i_649_ > i_645_)
		    i_645_ = i_649_;
		if (i_650_ < i_643_)
		    i_643_ = i_650_;
		if (i_650_ > i_646_)
		    i_646_ = i_650_;
		if (i_651_ < i_644_)
		    i_644_ = i_651_;
		if (i_651_ > i_647_)
		    i_647_ = i_651_;
		int i_652_ = i_649_ * i_649_ + i_651_ * i_651_;
		if (i_652_ > i)
		    i = i_652_;
		i_652_ += i_650_ * i_650_;
		if (i_652_ > i_641_)
		    i_641_ = i_652_;
	    }
	    rb = (short) i_642_;
	    Z = (short) i_645_;
	    Qb = (short) i_643_;
	    F = (short) i_646_;
	    Y = (short) i_644_;
	    r = (short) i_647_;
	    cb = (short) (int) (Math.sqrt((double) i) + 0.99);
	    M = (short) (int) (Math.sqrt((double) i_641_) + 0.99);
	    xb = true;
	}
    }
    
    final void L() {
	if (ib) {
	    for (int i = 0; i < Zb; i++) {
		A[i] = A[i] + 7 >> 4;
		qb[i] = qb[i] + 7 >> 4;
		E[i] = E[i] + 7 >> 4;
	    }
	    ib = false;
	}
	if (z) {
	    s();
	    z = false;
	}
	xb = false;
    }
    
    private final void f(int i) {
	int i_653_ = 0;
	int i_654_ = ((nga) I).M;
	int i_655_ = T[i];
	int i_656_ = N[i];
	int i_657_ = kb[i];
	int i_658_ = S[i_655_];
	int i_659_ = S[i_656_];
	int i_660_ = S[i_657_];
	if (cc == null)
	    ((jea) B).q = 0;
	else
	    ((jea) B).q = cc[i] & 0xff;
	if (i_658_ >= i_654_) {
	    ac[i_653_] = X[i_655_];
	    gb[i_653_] = Wb[i_655_];
	    bc[i_653_] = Ib[i_655_];
	    Ub[i_653_++] = nb[i] & 0xffff;
	} else {
	    int i_661_ = x[i_655_];
	    int i_662_ = K[i_655_];
	    int i_663_ = nb[i] & 0xffff;
	    if (i_660_ >= i_654_) {
		int i_664_ = (i_654_ - i_658_) * Yb[i_660_ - i_658_];
		ac[i_653_]
		    = ((lfa) Nb).z + (i_661_ + ((x[i_657_] - i_661_) * i_664_
						>> 16)) * ((nga) I).L / i_654_;
		gb[i_653_]
		    = ((lfa) Nb).D + (i_662_ + ((K[i_657_] - i_662_) * i_664_
						>> 16)) * ((nga) I).O / i_654_;
		bc[i_653_] = i_654_;
		Ub[i_653_++]
		    = i_663_ + (((Ab[i] & 0xffff) - i_663_) * i_664_ >> 16);
	    }
	    if (i_659_ >= i_654_) {
		int i_665_ = (i_654_ - i_658_) * Yb[i_659_ - i_658_];
		ac[i_653_]
		    = ((lfa) Nb).z + (i_661_ + ((x[i_656_] - i_661_) * i_665_
						>> 16)) * ((nga) I).L / i_654_;
		gb[i_653_]
		    = ((lfa) Nb).D + (i_662_ + ((K[i_656_] - i_662_) * i_665_
						>> 16)) * ((nga) I).O / i_654_;
		bc[i_653_] = i_654_;
		Ub[i_653_++]
		    = i_663_ + (((yb[i] & 0xffff) - i_663_) * i_665_ >> 16);
	    }
	}
	if (i_659_ >= i_654_) {
	    ac[i_653_] = X[i_656_];
	    gb[i_653_] = Wb[i_656_];
	    bc[i_653_] = Ib[i_656_];
	    Ub[i_653_++] = yb[i] & 0xffff;
	} else {
	    int i_666_ = x[i_656_];
	    int i_667_ = K[i_656_];
	    int i_668_ = yb[i] & 0xffff;
	    if (i_658_ >= i_654_) {
		int i_669_ = (i_654_ - i_659_) * Yb[i_658_ - i_659_];
		ac[i_653_]
		    = ((lfa) Nb).z + (i_666_ + ((x[i_655_] - i_666_) * i_669_
						>> 16)) * ((nga) I).L / i_654_;
		gb[i_653_]
		    = ((lfa) Nb).D + (i_667_ + ((K[i_655_] - i_667_) * i_669_
						>> 16)) * ((nga) I).O / i_654_;
		bc[i_653_] = i_654_;
		Ub[i_653_++]
		    = i_668_ + (((nb[i] & 0xffff) - i_668_) * i_669_ >> 16);
	    }
	    if (i_660_ >= i_654_) {
		int i_670_ = (i_654_ - i_659_) * Yb[i_660_ - i_659_];
		ac[i_653_]
		    = ((lfa) Nb).z + (i_666_ + ((x[i_657_] - i_666_) * i_670_
						>> 16)) * ((nga) I).L / i_654_;
		gb[i_653_]
		    = ((lfa) Nb).D + (i_667_ + ((K[i_657_] - i_667_) * i_670_
						>> 16)) * ((nga) I).O / i_654_;
		bc[i_653_] = i_654_;
		Ub[i_653_++]
		    = i_668_ + (((Ab[i] & 0xffff) - i_668_) * i_670_ >> 16);
	    }
	}
	if (i_660_ >= i_654_) {
	    ac[i_653_] = X[i_657_];
	    gb[i_653_] = Wb[i_657_];
	    bc[i_653_] = Ib[i_657_];
	    Ub[i_653_++] = Ab[i] & 0xffff;
	} else {
	    int i_671_ = x[i_657_];
	    int i_672_ = K[i_657_];
	    int i_673_ = Ab[i] & 0xffff;
	    if (i_659_ >= i_654_) {
		int i_674_ = (i_654_ - i_660_) * Yb[i_659_ - i_660_];
		ac[i_653_]
		    = ((lfa) Nb).z + (i_671_ + ((x[i_656_] - i_671_) * i_674_
						>> 16)) * ((nga) I).L / i_654_;
		gb[i_653_]
		    = ((lfa) Nb).D + (i_672_ + ((K[i_656_] - i_672_) * i_674_
						>> 16)) * ((nga) I).O / i_654_;
		bc[i_653_] = i_654_;
		Ub[i_653_++]
		    = i_673_ + (((yb[i] & 0xffff) - i_673_) * i_674_ >> 16);
	    }
	    if (i_658_ >= i_654_) {
		int i_675_ = (i_654_ - i_660_) * Yb[i_658_ - i_660_];
		ac[i_653_]
		    = ((lfa) Nb).z + (i_671_ + ((x[i_655_] - i_671_) * i_675_
						>> 16)) * ((nga) I).L / i_654_;
		gb[i_653_]
		    = ((lfa) Nb).D + (i_672_ + ((K[i_655_] - i_672_) * i_675_
						>> 16)) * ((nga) I).O / i_654_;
		bc[i_653_] = i_654_;
		Ub[i_653_++]
		    = i_673_ + (((nb[i] & 0xffff) - i_673_) * i_675_ >> 16);
	    }
	}
	int i_676_ = ac[0];
	int i_677_ = ac[1];
	int i_678_ = ac[2];
	int i_679_ = gb[0];
	int i_680_ = gb[1];
	int i_681_ = gb[2];
	i_658_ = bc[0];
	i_659_ = bc[1];
	i_660_ = bc[2];
	((jea) B).o = false;
	if (i_653_ == 3) {
	    if (i_676_ < 0 || i_677_ < 0 || i_678_ < 0
		|| i_676_ > ((lfa) Nb).bb || i_677_ > ((lfa) Nb).bb
		|| i_678_ > ((lfa) Nb).bb)
		((jea) B).o = true;
	    if (C == null || C[i] == -1) {
		if (Ab[i] == -1)
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, vq.m[nb[i] & 0xffff]);
		else
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, Ub[0], Ub[1], Ub[2]);
	    } else {
		int i_682_;
		int i_683_;
		int i_684_;
		if (hb != null && hb[i] != -1) {
		    int i_685_ = hb[i] & 0xff;
		    i_682_ = Mb[i_685_];
		    i_683_ = mb[i_685_];
		    i_684_ = pb[i_685_];
		} else {
		    i_682_ = i_655_;
		    i_683_ = i_656_;
		    i_684_ = i_657_;
		}
		if (Ab[i] == -1)
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, nb[i], nb[i], nb[i], x[i_682_],
			x[i_683_], x[i_684_], K[i_682_], K[i_683_], K[i_684_],
			S[i_682_], S[i_683_], S[i_684_], C[i]);
		else
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, Ub[0], Ub[1], Ub[2], x[i_682_],
			x[i_683_], x[i_684_], K[i_682_], K[i_683_], K[i_684_],
			S[i_682_], S[i_683_], S[i_684_], C[i]);
	    }
	}
	if (i_653_ == 4) {
	    if (i_676_ < 0 || i_677_ < 0 || i_678_ < 0
		|| i_676_ > ((lfa) Nb).bb || i_677_ > ((lfa) Nb).bb
		|| i_678_ > ((lfa) Nb).bb || ac[3] < 0
		|| ac[3] > ((lfa) Nb).bb)
		((jea) B).o = true;
	    if (C == null || C[i] == -1) {
		if (Ab[i] == -1) {
		    int i_686_ = vq.m[nb[i] & 0xffff];
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, i_686_);
		    B.a(i_679_, i_681_, gb[3], i_676_, i_678_, ac[3], i_658_,
			i_659_, bc[3], i_686_);
		} else {
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, Ub[0], Ub[1], Ub[2]);
		    B.a(i_679_, i_681_, gb[3], i_676_, i_678_, ac[3], i_658_,
			i_659_, bc[3], Ub[0], Ub[2], Ub[3]);
		}
	    } else {
		int i_687_;
		int i_688_;
		int i_689_;
		if (hb != null && hb[i] != -1) {
		    int i_690_ = hb[i] & 0xff;
		    i_687_ = Mb[i_690_];
		    i_688_ = mb[i_690_];
		    i_689_ = pb[i_690_];
		} else {
		    i_687_ = i_655_;
		    i_688_ = i_656_;
		    i_689_ = i_657_;
		}
		short i_691_ = C[i];
		if (Ab[i] == -1) {
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, nb[i], nb[i], nb[i], x[i_687_],
			x[i_688_], x[i_689_], K[i_687_], K[i_688_], K[i_689_],
			S[i_687_], S[i_688_], S[i_689_], i_691_);
		    B.a(i_679_, i_681_, gb[3], i_676_, i_678_, ac[3], i_658_,
			i_659_, bc[3], nb[i], nb[i], nb[i], x[i_687_],
			x[i_688_], x[i_689_], K[i_687_], K[i_688_], K[i_689_],
			S[i_687_], S[i_688_], S[i_689_], i_691_);
		} else {
		    B.a(i_679_, i_680_, i_681_, i_676_, i_677_, i_678_, i_658_,
			i_659_, i_660_, Ub[0], Ub[1], Ub[2], x[i_687_],
			x[i_688_], x[i_689_], K[i_687_], K[i_688_], K[i_689_],
			S[i_687_], S[i_688_], S[i_689_], i_691_);
		    B.a(i_679_, i_681_, gb[3], i_676_, i_678_, ac[3], i_658_,
			i_659_, bc[3], Ub[0], Ub[2], Ub[3], x[i_687_],
			x[i_688_], x[i_689_], K[i_687_], K[i_688_], K[i_689_],
			S[i_687_], S[i_688_], S[i_689_], i_691_);
		}
	    }
	}
    }
    
    final void a(Class_q class_q, pba var_pba, int i, int i_692_) {
	b(class_q, var_pba, i, i_692_);
    }
    
    final ha S(ha var_ha) {
	return null;
    }
    
    private final boolean a(int i, int i_693_, int i_694_, int i_695_,
			    int i_696_, int i_697_, int i_698_, int i_699_) {
	if (i_693_ < i_694_ && i_693_ < i_695_ && i_693_ < i_696_)
	    return false;
	if (i_693_ > i_694_ && i_693_ > i_695_ && i_693_ > i_696_)
	    return false;
	if (i < i_697_ && i < i_698_ && i < i_699_)
	    return false;
	if (i > i_697_ && i > i_698_ && i > i_699_)
	    return false;
	return true;
    }
    
    final int na() {
	return zb;
    }
    
    final void a(int i, int i_700_, int i_701_, int i_702_) {
	if ((Vb & 0x80000) != 524288)
	    throw new IllegalStateException("FMT");
	for (int i_703_ = 0; i_703_ < D; i_703_++) {
	    int i_704_ = wb[i_703_] & 0xffff;
	    int i_705_ = i_704_ >> 10 & 0x3f;
	    int i_706_ = i_704_ >> 7 & 0x7;
	    int i_707_ = i_704_ & 0x7f;
	    if (i != -1)
		i_705_ += (i - i_705_) * i_702_ >> 7;
	    if (i_700_ != -1)
		i_706_ += (i_700_ - i_706_) * i_702_ >> 7;
	    if (i_701_ != -1)
		i_707_ += (i_701_ - i_707_) * i_702_ >> 7;
	    wb[i_703_] = (short) (i_705_ << 10 | i_706_ << 7 | i_707_);
	}
	if (eb != null) {
	    for (int i_708_ = 0; i_708_ < Sb; i_708_++) {
		mh var_mh = eb[i_708_];
		ff var_ff = sb[i_708_];
		((ff) var_ff).j
		    = (((ff) var_ff).j & ~0xffffff
		       | (vq.m[pg.a(0, wb[((mh) var_mh).h] & 0xffff)]
			  & 0xffffff));
	    }
	}
	if (Pb == 2)
	    Pb = 1;
    }
    
    final int TA() {
	return p;
    }
    
    final int J() {
	if (!xb)
	    t();
	return Qb;
    }
    
    final int KA() {
	if (!xb)
	    t();
	return rb;
    }
    
    private final void b(boolean bool) {
	if (Pb == 1)
	    s();
	else if (Pb == 2) {
	    if ((Vb & 0x97098) == 0)
		wb = null;
	    if (bool)
		q = null;
	} else {
	    r();
	    int i = ((nga) I).x;
	    int i_709_ = ((nga) I).w;
	    int i_710_ = ((nga) I).G;
	    int i_711_ = ((nga) I).A >> 8;
	    int i_712_ = ((nga) I).R * 768 / zb;
	    int i_713_ = ((nga) I).Q * 768 / zb;
	    if (nb == null) {
		nb = new int[D];
		yb = new int[D];
		Ab = new int[D];
	    }
	    for (int i_714_ = 0; i_714_ < D; i_714_++) {
		byte i_715_;
		if (q == null)
		    i_715_ = (byte) 0;
		else
		    i_715_ = q[i_714_];
		byte i_716_;
		if (cc == null)
		    i_716_ = (byte) 0;
		else
		    i_716_ = cc[i_714_];
		short i_717_;
		if (C == null)
		    i_717_ = (short) -1;
		else
		    i_717_ = C[i_714_];
		if (i_716_ == -2)
		    i_715_ = (byte) 3;
		if (i_716_ == -1)
		    i_715_ = (byte) 2;
		if (i_717_ == -1) {
		    if (i_715_ == 0) {
			int i_718_ = wb[i_714_] & 0xffff;
			int i_719_ = (i_718_ & 0x7f) * p >> 7;
			short i_720_ = pg.a(0, i_718_ & ~0x7f | i_719_);
			ve var_ve;
			if (O != null && O[T[i_714_]] != null)
			    var_ve = O[T[i_714_]];
			else
			    var_ve = W[T[i_714_]];
			int i_721_
			    = ((i * ((ve) var_ve).a + i_709_ * ((ve) var_ve).d
				+ i_710_ * ((ve) var_ve).c) / ((ve) var_ve).b
			       >> 16);
			int i_722_ = i_721_ > 256 ? i_712_ : i_713_;
			int i_723_ = (i_711_ >> 1) + (i_722_ * i_721_ >> 17);
			nb[i_714_] = i_723_ << 17 | lfa.a(37, i_723_, i_720_);
			if (O != null && O[N[i_714_]] != null)
			    var_ve = O[N[i_714_]];
			else
			    var_ve = W[N[i_714_]];
			i_721_
			    = ((i * ((ve) var_ve).a + i_709_ * ((ve) var_ve).d
				+ i_710_ * ((ve) var_ve).c) / ((ve) var_ve).b
			       >> 16);
			i_722_ = i_721_ > 256 ? i_712_ : i_713_;
			i_723_ = (i_711_ >> 1) + (i_722_ * i_721_ >> 17);
			yb[i_714_] = i_723_ << 17 | lfa.a(92, i_723_, i_720_);
			if (O != null && O[kb[i_714_]] != null)
			    var_ve = O[kb[i_714_]];
			else
			    var_ve = W[kb[i_714_]];
			i_721_
			    = ((i * ((ve) var_ve).a + i_709_ * ((ve) var_ve).d
				+ i_710_ * ((ve) var_ve).c) / ((ve) var_ve).b
			       >> 16);
			i_722_ = i_721_ > 256 ? i_712_ : i_713_;
			i_723_ = (i_711_ >> 1) + (i_722_ * i_721_ >> 17);
			Ab[i_714_] = i_723_ << 17 | lfa.a(-91, i_723_, i_720_);
		    } else if (i_715_ == 1) {
			int i_724_ = wb[i_714_] & 0xffff;
			int i_725_ = (i_724_ & 0x7f) * p >> 7;
			short i_726_ = pg.a(0, i_724_ & ~0x7f | i_725_);
			jw var_jw = Jb[i_714_];
			int i_727_
			    = ((i * ((jw) var_jw).c + i_709_ * ((jw) var_jw).a
				+ i_710_ * ((jw) var_jw).b)
			       >> 16);
			int i_728_ = i_727_ > 256 ? i_712_ : i_713_;
			int i_729_ = (i_711_ >> 1) + (i_728_ * i_727_ >> 17);
			nb[i_714_] = i_729_ << 17 | lfa.a(-94, i_729_, i_726_);
			Ab[i_714_] = -1;
		    } else if (i_715_ == 3) {
			nb[i_714_] = 128;
			Ab[i_714_] = -1;
		    } else
			Ab[i_714_] = -2;
		} else if (i_715_ == 0) {
		    ve var_ve;
		    if (O != null && O[T[i_714_]] != null)
			var_ve = O[T[i_714_]];
		    else
			var_ve = W[T[i_714_]];
		    int i_730_
			= ((i * ((ve) var_ve).a + i_709_ * ((ve) var_ve).d
			    + i_710_ * ((ve) var_ve).c) / ((ve) var_ve).b
			   >> 16);
		    int i_731_ = i_730_ > 256 ? i_712_ : i_713_;
		    int i_732_ = (i_711_ >> 2) + (i_731_ * i_730_ >> 18);
		    nb[i_714_] = e(i_732_);
		    if (O != null && O[N[i_714_]] != null)
			var_ve = O[N[i_714_]];
		    else
			var_ve = W[N[i_714_]];
		    i_730_
			= (i * ((ve) var_ve).a + i_709_ * ((ve) var_ve).d
			   + i_710_ * ((ve) var_ve).c) / ((ve) var_ve).b >> 16;
		    i_731_ = i_730_ > 256 ? i_712_ : i_713_;
		    i_732_ = (i_711_ >> 2) + (i_731_ * i_730_ >> 18);
		    yb[i_714_] = e(i_732_);
		    if (O != null && O[kb[i_714_]] != null)
			var_ve = O[kb[i_714_]];
		    else
			var_ve = W[kb[i_714_]];
		    i_730_
			= (i * ((ve) var_ve).a + i_709_ * ((ve) var_ve).d
			   + i_710_ * ((ve) var_ve).c) / ((ve) var_ve).b >> 16;
		    i_731_ = i_730_ > 256 ? i_712_ : i_713_;
		    i_732_ = (i_711_ >> 2) + (i_731_ * i_730_ >> 18);
		    Ab[i_714_] = e(i_732_);
		} else if (i_715_ == 1) {
		    jw var_jw = Jb[i_714_];
		    int i_733_
			= ((i * ((jw) var_jw).c + i_709_ * ((jw) var_jw).a
			    + i_710_ * ((jw) var_jw).b)
			   >> 16);
		    int i_734_ = i_733_ > 256 ? i_712_ : i_713_;
		    int i_735_ = (i_711_ >> 2) + (i_734_ * i_733_ >> 18);
		    nb[i_714_] = e(i_735_);
		    Ab[i_714_] = -1;
		} else
		    Ab[i_714_] = -2;
	    }
	    W = null;
	    O = null;
	    Jb = null;
	    if ((Vb & 0x97098) == 0)
		wb = null;
	    if (bool)
		q = null;
	    Pb = 2;
	}
    }
    
    private final void g(int i) {
	if (!((lfa) Nb).m) {
	    int i_736_ = T[i];
	    int i_737_ = N[i];
	    int i_738_ = kb[i];
	    int i_739_ = Ib[i_736_] - ((lfa) Nb).a;
	    if (i_739_ > 255)
		i_739_ = 255;
	    else if (i_739_ < 0)
		i_739_ = 0;
	    int i_740_ = Ib[i_737_] - ((lfa) Nb).a;
	    if (i_740_ > 255)
		i_740_ = 255;
	    else if (i_740_ < 0)
		i_740_ = 0;
	    int i_741_ = Ib[i_738_] - ((lfa) Nb).a;
	    if (i_741_ > 255)
		i_741_ = 255;
	    else if (i_741_ < 0)
		i_741_ = 0;
	    int i_742_ = i_739_ + i_740_ + i_741_;
	    if (i_742_ != 765) {
		if (i_742_ == 0)
		    b(i);
		else {
		    if (cc == null)
			((jea) B).q = 0;
		    else
			((jea) B).q = cc[i] & 0xff;
		    if (C == null || C[i] == -1) {
			if (Ab[i] == -1)
			    B.b(Wb[i_736_], Wb[i_737_], Wb[i_738_], X[i_736_],
				X[i_737_], X[i_738_], Ib[i_736_], Ib[i_737_],
				Ib[i_738_],
				pr.a((byte) 27, i_739_ << 24 | ((lfa) Nb).s,
				     vq.m[nb[i] & 0xffff]),
				pr.a((byte) -121, i_740_ << 24 | ((lfa) Nb).s,
				     vq.m[nb[i] & 0xffff]),
				pr.a((byte) 9, i_741_ << 24 | ((lfa) Nb).s,
				     vq.m[nb[i] & 0xffff]));
			else
			    B.b(Wb[i_736_], Wb[i_737_], Wb[i_738_], X[i_736_],
				X[i_737_], X[i_738_], Ib[i_736_], Ib[i_737_],
				Ib[i_738_],
				pr.a((byte) 60, i_739_ << 24 | ((lfa) Nb).s,
				     vq.m[nb[i] & 0xffff]),
				pr.a((byte) -128, i_740_ << 24 | ((lfa) Nb).s,
				     vq.m[yb[i] & 0xffff]),
				pr.a((byte) 30, i_741_ << 24 | ((lfa) Nb).s,
				     vq.m[Ab[i] & 0xffff]));
		    } else {
			int i_743_;
			int i_744_;
			int i_745_;
			if (hb != null && hb[i] != -1) {
			    int i_746_ = hb[i] & 0xff;
			    i_743_ = Mb[i_746_];
			    i_744_ = mb[i_746_];
			    i_745_ = pb[i_746_];
			} else {
			    i_743_ = i_736_;
			    i_744_ = i_737_;
			    i_745_ = i_738_;
			}
			if (Ab[i] == -1)
			    B.a(Wb[i_736_], Wb[i_737_], Wb[i_738_], X[i_736_],
				X[i_737_], X[i_738_], Ib[i_736_], Ib[i_737_],
				Ib[i_738_], ((lfa) Nb).s, i_739_, i_740_,
				i_741_, nb[i], nb[i], nb[i], x[i_743_],
				x[i_744_], x[i_745_], K[i_743_], K[i_744_],
				K[i_745_], S[i_743_], S[i_744_], S[i_745_],
				C[i]);
			else
			    B.a(Wb[i_736_], Wb[i_737_], Wb[i_738_], X[i_736_],
				X[i_737_], X[i_738_], Ib[i_736_], Ib[i_737_],
				Ib[i_738_], ((lfa) Nb).s, i_739_, i_740_,
				i_741_, nb[i], yb[i], Ab[i], x[i_743_],
				x[i_744_], x[i_745_], K[i_743_], K[i_744_],
				K[i_745_], S[i_743_], S[i_744_], S[i_745_],
				C[i]);
		    }
		}
	    }
	} else {
	    int i_747_ = T[i];
	    int i_748_ = N[i];
	    int i_749_ = kb[i];
	    int i_750_ = 0;
	    int i_751_ = 0;
	    int i_752_ = 0;
	    if (Db[i_747_] > ((lfa) Nb).n)
		i_750_ = 255;
	    else if (Db[i_747_] > ((lfa) Nb).g)
		i_750_ = (((lfa) Nb).g - Db[i_747_]) * 255 / (((lfa) Nb).g
							      - ((lfa) Nb).n);
	    if (Db[i_748_] > ((lfa) Nb).n)
		i_751_ = 255;
	    else if (Db[i_748_] > ((lfa) Nb).g)
		i_751_ = (((lfa) Nb).g - Db[i_748_]) * 255 / (((lfa) Nb).g
							      - ((lfa) Nb).n);
	    if (Db[i_749_] > ((lfa) Nb).n)
		i_752_ = 255;
	    else if (Db[i_749_] > ((lfa) Nb).g)
		i_752_ = (((lfa) Nb).g - Db[i_749_]) * 255 / (((lfa) Nb).g
							      - ((lfa) Nb).n);
	    if (cc == null)
		((jea) B).q = 0;
	    else
		((jea) B).q = cc[i] & 0xff;
	    if (C == null || C[i] == -1) {
		if (Ab[i] == -1)
		    B.b(Wb[i_747_], Wb[i_748_], Wb[i_749_], X[i_747_],
			X[i_748_], X[i_749_], Ib[i_747_], Ib[i_748_],
			Ib[i_749_],
			pr.a((byte) -107, i_750_ << 24 | ((lfa) Nb).s,
			     vq.m[nb[i] & 0xffff]),
			pr.a((byte) -116, i_751_ << 24 | ((lfa) Nb).s,
			     vq.m[nb[i] & 0xffff]),
			pr.a((byte) -110, i_752_ << 24 | ((lfa) Nb).s,
			     vq.m[nb[i] & 0xffff]));
		else
		    B.b(Wb[i_747_], Wb[i_748_], Wb[i_749_], X[i_747_],
			X[i_748_], X[i_749_], Ib[i_747_], Ib[i_748_],
			Ib[i_749_],
			pr.a((byte) 10, i_750_ << 24 | ((lfa) Nb).s,
			     vq.m[nb[i] & 0xffff]),
			pr.a((byte) -104, i_751_ << 24 | ((lfa) Nb).s,
			     vq.m[yb[i] & 0xffff]),
			pr.a((byte) 28, i_752_ << 24 | ((lfa) Nb).s,
			     vq.m[Ab[i] & 0xffff]));
	    } else {
		int i_753_;
		int i_754_;
		int i_755_;
		if (hb != null && hb[i] != -1) {
		    int i_756_ = hb[i] & 0xff;
		    i_753_ = Mb[i_756_];
		    i_754_ = mb[i_756_];
		    i_755_ = pb[i_756_];
		} else {
		    i_753_ = i_747_;
		    i_754_ = i_748_;
		    i_755_ = i_749_;
		}
		if (Ab[i] == -1)
		    B.a(Wb[i_747_], Wb[i_748_], Wb[i_749_], X[i_747_],
			X[i_748_], X[i_749_], Ib[i_747_], Ib[i_748_],
			Ib[i_749_], ((lfa) Nb).s, i_750_, i_751_, i_752_,
			nb[i], nb[i], nb[i], x[i_753_], x[i_754_], x[i_755_],
			K[i_753_], K[i_754_], K[i_755_], S[i_753_], S[i_754_],
			S[i_755_], C[i]);
		else
		    B.a(Wb[i_747_], Wb[i_748_], Wb[i_749_], X[i_747_],
			X[i_748_], X[i_749_], Ib[i_747_], Ib[i_748_],
			Ib[i_749_], ((lfa) Nb).s, i_750_, i_751_, i_752_,
			nb[i], yb[i], Ab[i], x[i_753_], x[i_754_], x[i_755_],
			K[i_753_], K[i_754_], K[i_755_], S[i_753_], S[i_754_],
			S[i_755_], C[i]);
	    }
	}
    }
    
    final void SA(int i) {
	if (((nga) I).V > 1) {
	    synchronized (this) {
		if ((Vb & 0x10000) == 65536 && (i & 0x10000) == 0)
		    c(true);
		Vb = i;
	    }
	} else {
	    if ((Vb & 0x10000) == 65536 && (i & 0x10000) == 0)
		c(true);
	    Vb = i;
	}
    }
    
    final void MA(int i) {
	if ((Vb & 0x6) != 6)
	    throw new IllegalStateException();
	int i_757_ = GameInPacket.ints1[i];
	int i_758_ = GameInPacket.ints2[i];
	synchronized (this) {
	    for (int i_759_ = 0; i_759_ < Zb; i_759_++) {
		int i_760_ = qb[i_759_] * i_758_ - E[i_759_] * i_757_ >> 14;
		E[i_759_] = qb[i_759_] * i_757_ + E[i_759_] * i_758_ >> 14;
		qb[i_759_] = i_760_;
	    }
	    k();
	}
    }
    
    private final void c(boolean bool) {
	if (((nga) I).V > 1) {
	    synchronized (this) {
		b(bool);
	    }
	} else
	    b(bool);
    }
    
    final int PA() {
	return Vb;
    }
    
    final void FA() {
	if ((Vb & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < Zb; i++)
		E[i] = -E[i];
	    if (W != null) {
		for (int i = 0; i < tb; i++) {
		    if (W[i] != null)
			((ve) W[i]).c = -((ve) W[i]).c;
		}
	    }
	    if (O != null) {
		for (int i = 0; i < tb; i++) {
		    if (O[i] != null)
			((ve) O[i]).c = -((ve) O[i]).c;
		}
	    }
	    if (Jb != null) {
		for (int i = 0; i < D; i++) {
		    if (Jb[i] != null)
			((jw) Jb[i]).b = -((jw) Jb[i]).b;
		}
	    }
	    short[] is = T;
	    T = kb;
	    kb = is;
	    xb = false;
	    Pb = 0;
	}
    }
    
    rw(nga var_nga) {
	ib = false;
	vb = false;
	D = 0;
	Rb = 0;
	Pb = 0;
	xb = false;
	U = false;
	Zb = 0;
	I = var_nga;
    }
    
    rw(nga var_nga, eg var_eg, int i, int i_761_, int i_762_, int i_763_) {
	ib = false;
	vb = false;
	D = 0;
	Rb = 0;
	Pb = 0;
	xb = false;
	U = false;
	Zb = 0;
	I = var_nga;
	Vb = i;
	p = i_761_;
	zb = i_762_;
	Zb = ((eg) var_eg).z;
	tb = ((eg) var_eg).l;
	A = ((eg) var_eg).o;
	qb = ((eg) var_eg).W;
	E = ((eg) var_eg).R;
	D = ((eg) var_eg).G;
	T = ((eg) var_eg).O;
	N = ((eg) var_eg).v;
	kb = ((eg) var_eg).a;
	v = ((eg) var_eg).w;
	wb = ((eg) var_eg).Z;
	cc = ((eg) var_eg).m;
	Lb = ((eg) var_eg).C;
	q = ((eg) var_eg).U;
	Ob = ((eg) var_eg).q;
	H = ((eg) var_eg).i;
	V = ((eg) var_eg).f;
	vb = ((eg) var_eg).m != null;
	if (((eg) var_eg).N != null) {
	    Sb = ((eg) var_eg).N.length;
	    eb = new mh[Sb];
	    sb = new ff[Sb];
	    for (int i_764_ = 0; i_764_ < ((eg) var_eg).N.length; i_764_++) {
		lw var_lw = ((eg) var_eg).N[i_764_];
		cj var_cj = kg.a(((lw) var_lw).g, -101);
		int i_765_ = (vq.m[((eg) var_eg).Z[((lw) var_lw).c] & 0xffff]
			      & 0xffffff);
		i_765_
		    = i_765_ | 255 - (((eg) var_eg).m != null
				      ? ((eg) var_eg).m[((lw) var_lw).c] & 0xff
				      : 0) << 24;
		eb[i_764_]
		    = new mh(((lw) var_lw).c, ((eg) var_eg).O[((lw) var_lw).c],
			     ((eg) var_eg).v[((lw) var_lw).c],
			     ((eg) var_eg).a[((lw) var_lw).c], ((cj) var_cj).g,
			     ((cj) var_cj).var_n, ((cj) var_cj).i, ((cj) var_cj).f,
			     ((cj) var_cj).m, ((cj) var_cj).d,
			     ((lw) var_lw).a);
		sb[i_764_] = new ff(i_765_);
	    }
	}
	if (((eg) var_eg).Q != null && (Vb & 0x20) != 0)
	    R = var_eg.a(true, 83);
	if (((eg) var_eg).s != null && (Vb & 0x180) != 0)
	    db = var_eg.b((byte) 24);
	if (((eg) var_eg).N != null && (Vb & 0x400) != 0)
	    Tb = var_eg.b((int) -29);
	if (((eg) var_eg).B != null) {
	    C = new short[D];
	    boolean bool = false;
	    for (int i_766_ = 0; i_766_ < D; i_766_++) {
		short i_767_ = ((eg) var_eg).B[i_766_];
		if (i_767_ != -1) {
		    vca var_vca = ((Class_r) I).j.a(i_767_, (byte) 86);
		    if (!((vca) var_vca).u) {
			C[i_766_] = i_767_;
			bool = true;
			if (!((vca) var_vca).e)
			    vb = true;
		    } else
			C[i_766_] = (short) -1;
		} else
		    C[i_766_] = (short) -1;
	    }
	    if (!bool)
		C = null;
	} else
	    C = null;
	if (C != null && ((eg) var_eg).L > 0 && ((eg) var_eg).e != null) {
	    int[] is = new int[((eg) var_eg).L];
	    for (int i_768_ = 0; i_768_ < D; i_768_++) {
		if (((eg) var_eg).e[i_768_] != -1)
		    is[((eg) var_eg).e[i_768_] & 0xff]++;
	    }
	    Rb = 0;
	    for (int i_769_ = 0; i_769_ < ((eg) var_eg).L; i_769_++) {
		if (is[i_769_] > 0 && ((eg) var_eg).F[i_769_] == 0)
		    Rb++;
	    }
	    Mb = new int[Rb];
	    mb = new int[Rb];
	    pb = new int[Rb];
	    int i_770_ = 0;
	    for (int i_771_ = 0; i_771_ < ((eg) var_eg).L; i_771_++) {
		if (is[i_771_] > 0 && ((eg) var_eg).F[i_771_] == 0) {
		    Mb[i_770_] = ((eg) var_eg).p[i_771_] & 0xffff;
		    mb[i_770_] = ((eg) var_eg).h[i_771_] & 0xffff;
		    pb[i_770_] = ((eg) var_eg).x[i_771_] & 0xffff;
		    is[i_771_] = i_770_++;
		} else
		    is[i_771_] = -1;
	    }
	    hb = new byte[D];
	    for (int i_772_ = 0; i_772_ < D; i_772_++) {
		if (((eg) var_eg).e[i_772_] != -1) {
		    hb[i_772_] = (byte) is[((eg) var_eg).e[i_772_] & 0xff];
		    if (hb[i_772_] == -1 && C != null)
			C[i_772_] = (short) -1;
		} else
		    hb[i_772_] = (byte) -1;
	    }
	}
    }
    
    static {
	fb = 0;
	L = 4096;
	Yb = new int[4096];
	for (int i = 1; i < 4096; i++)
	    Yb[i] = 65536 / i;
    }
}
