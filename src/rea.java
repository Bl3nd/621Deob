/* rea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rea
{
    private int a;
    private byte b;
    private int c;
    static int d;
    private int e;
    private dr f;
    static int g;
    private boolean[] h;
    private int i = 0;
    static int j;
    private boolean k;
    private da l;
    private int m;
    static int var_n;
    private int o;
    static int p;
    private boolean q = false;
    static int r;
    private ha s;
    private int t;
    static int u;
    private int v = -1;
    int w;
    private boolean x;
    int y;
    static int z;
    private int A;
    static int B;
    static int C;
    static int[] D = new int[8];
    static int E;
    static int F;
    private int G;
    private int H;
    static int I;
    private byte J;
    tq K;
    int L;
    
    final void a(byte i, Class_r class_r) {
	a(true, e, class_r, true, true, c, 262144);
	if (i < 87)
	    b((int) 114);
	B++;
    }
    
    public static void a(byte i) {
	if (i == 66)
	    D = null;
    }
    
    private final void a(byte i, int i_0_) {
	r++;
	int i_1_ = i_0_;
	boolean bool = false;
	if ((i_1_ ^ 0xffffffff) == 0) {
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 108, ((rea) this).y);
	    ObjectDef var_bda_2_ = var_bda;
	    if (((ObjectDef) var_bda).xb != null)
		var_bda = var_bda.a(cp.e, -1643);
	    if (var_bda == null)
		return;
	    if (var_bda == var_bda_2_)
		var_bda_2_ = null;
	    if (((ObjectDef) var_bda).pb == null) {
		if (((ObjectDef) var_bda).zb == -1) {
		    if (var_bda_2_ != null && ((ObjectDef) var_bda_2_).pb != null) {
			if (f != null && var_bda_2_.a(false, ((dr) f).c))
			    return;
			i_1_ = var_bda_2_.b((int) -1);
			if (((ObjectDef) var_bda_2_).objectID != a)
			    bool = ((ObjectDef) var_bda_2_).bb;
		    } else if (var_bda_2_ != null
			       && ((ObjectDef) var_bda_2_).zb != -1
			       && a != ((ObjectDef) var_bda_2_).objectID) {
			i_1_ = ((ObjectDef) var_bda_2_).zb;
			bool = ((ObjectDef) var_bda_2_).bb;
		    }
		} else if (a != ((ObjectDef) var_bda).objectID) {
		    bool = ((ObjectDef) var_bda).bb;
		    i_1_ = ((ObjectDef) var_bda).zb;
		}
	    } else {
		if (f != null && var_bda.a(false, ((dr) f).c))
		    return;
		i_1_ = var_bda.b((int) -1);
		if (((ObjectDef) var_bda).objectID != a)
		    bool = ((ObjectDef) var_bda).bb;
	    }
	}
	if (i_1_ == -1)
	    f = null;
	else {
	    l = null;
	    if (f != null && i_1_ == ((dr) f).c) {
		if (((dr) f).g == 0)
		    return;
	    } else
		f = Class_ef.J.c(64, i_1_);
	    if (((dr) f).p == null)
		f = null;
	    else {
		if (bool) {
		    m = (int) ((double) ((dr) f).p.length * Math.random());
		    A = 1 + (int) ((double) ((dr) f).B[m] * Math.random());
		} else {
		    m = 0;
		    A = 1;
		}
		G = m + 1;
		if (i > 55) {
		    if (G < 0 || ((dr) f).p.length <= G)
			G = -1;
		    o = pm.currentTimedTicks - A;
		}
	    }
	}
    }
    
    final void a(int i, Class_r class_r) {
	if (s != null) {
	    oga.a(s, J, e, c, h);
	    s = null;
	    h = null;
	}
	d++;
	if (i != 2)
	    a((int) 47, (Class_r) null);
    }
    
    final void a(int i, int i_3_) {
	j++;
	x = true;
	if (i_3_ != 2911)
	    o = -86;
	a((byte) 79, i);
    }
    
    private final void a(int i, int i_4_, int i_5_) {
	g++;
	if (i == 0) {
	    int i_6_;
	while_199_:
	    for (;;) {
		if (f == null) {
		    if (x)
			return;
		    a((byte) 122, -1);
		    if (f == null)
			return;
		}
		i_6_ = pm.currentTimedTicks - o;
		if (i_6_ > 100 && ((dr) f).y > 0) {
		    int i_7_;
		    for (i_7_ = ((dr) f).p.length - ((dr) f).y;
			 i_7_ > m && i_6_ > ((dr) f).B[m]; m++)
			i_6_ -= ((dr) f).B[m];
		    if (m >= i_7_) {
			int i_8_ = 0;
			for (int i_9_ = i_7_; i_9_ < ((dr) f).p.length; i_9_++)
			    i_8_ += ((dr) f).B[i_9_];
			i_6_ %= i_8_;
		    }
		    G = m + 1;
		    if (G >= ((dr) f).p.length) {
			G -= ((dr) f).y;
			if (G < 0 || G >= ((dr) f).p.length)
			    G = -1;
		    }
		}
		for (;;) {
		    if (((dr) f).B[m] >= i_6_)
			break while_199_;
		    qga.a(b, f, i_5_, i_4_, i ^ 0x78, m, false);
		    i_6_ -= ((dr) f).B[m];
		    m++;
		    if (((dr) f).p.length <= m) {
			m -= ((dr) f).y;
			if (m < 0 || m >= ((dr) f).p.length) {
			    f = null;
			    break;
			}
		    }
		    G = m + 1;
		    if (G >= ((dr) f).p.length) {
			G -= ((dr) f).y;
			if (G < 0 || G >= ((dr) f).p.length)
			    G = -1;
		    }
		}
	    }
	    o = pm.currentTimedTicks - i_6_;
	    A = i_6_;
	}
    }
    
    protected final void finalize() {
	if (((rea) this).K != null)
	    ((rea) this).K.f();
	u++;
    }
    
    final boolean a(int i) {
	I++;
	if (i != 0)
	    return true;
	return k;
    }
    
    static final void a(int i, Class_r class_r, int i_10_, hv var_hv) {
	z++;
	if (op.X != null && ((hv) var_hv).n >= i) {
	    for (int i_11_ = 0; i_11_ < op.X.length; i_11_++) {
		if (op.X[i_11_] != -1000000
		    && (op.X[i_11_] >= ((hv) var_hv).a[0]
			|| op.X[i_11_] >= ((hv) var_hv).a[1]
			|| ((hv) var_hv).a[2] <= op.X[i_11_]
			|| ((hv) var_hv).a[3] <= op.X[i_11_])
		    && (jm.e[i_11_] >= ((hv) var_hv).m[0]
			|| ((hv) var_hv).m[1] <= jm.e[i_11_]
			|| ((hv) var_hv).m[2] <= jm.e[i_11_]
			|| ((hv) var_hv).m[3] <= jm.e[i_11_])
		    && (re.f[i_11_] <= ((hv) var_hv).m[0]
			|| ((hv) var_hv).m[1] >= re.f[i_11_]
			|| re.f[i_11_] <= ((hv) var_hv).m[2]
			|| ((hv) var_hv).m[3] >= re.f[i_11_])
		    && (th.k[i_11_] >= ((hv) var_hv).e[0]
			|| ((hv) var_hv).e[1] <= th.k[i_11_]
			|| th.k[i_11_] >= ((hv) var_hv).e[2]
			|| ((hv) var_hv).e[3] <= th.k[i_11_])
		    && (mj.j[i_11_] <= ((hv) var_hv).e[0]
			|| ((hv) var_hv).e[1] >= mj.j[i_11_]
			|| mj.j[i_11_] <= ((hv) var_hv).e[2]
			|| ((hv) var_hv).e[3] >= mj.j[i_11_]))
		    return;
	    }
	}
	if (((hv) var_hv).h == 1) {
	    int i_12_ = ((hv) var_hv).j + FileOnDisk.k - n.e;
	    if (i_12_ >= 0 && i_12_ <= FileOnDisk.k + FileOnDisk.k) {
		int i_13_ = ((hv) var_hv).b - (fm.i - FileOnDisk.k);
		if (i_13_ >= 0) {
		    if (i_13_ > FileOnDisk.k + FileOnDisk.k)
			return;
		} else
		    i_13_ = 0;
		int i_14_ = FileOnDisk.k - fm.i + ((hv) var_hv).g;
		if (FileOnDisk.k + FileOnDisk.k >= i_14_) {
		    if (i_14_ < 0)
			return;
		} else
		    i_14_ = FileOnDisk.k + FileOnDisk.k;
		boolean bool = false;
		while (i_13_ <= i_14_) {
		    if (vd.O[i_12_][i_13_++]) {
			bool = true;
			break;
		    }
		}
		if (bool) {
		    float f = (float) (dl.d - ((hv) var_hv).m[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!((float) sl.j > f) && hn.a(var_hv, 0, 0)
			&& hn.a(var_hv, 1, 0) && hn.a(var_hv, 2, 0)
			&& hn.a(var_hv, 3, 0))
			jr.w[bfa.D++] = var_hv;
		}
	    }
	} else if (i_10_ == 0) {
	    if (((hv) var_hv).h == 2) {
		int i_15_ = FileOnDisk.k + (((hv) var_hv).b - fm.i);
		if (i_15_ >= 0 && i_15_ <= FileOnDisk.k + FileOnDisk.k) {
		    int i_16_ = FileOnDisk.k - n.e + ((hv) var_hv).j;
		    if (i_16_ < 0)
			i_16_ = 0;
		    else if (FileOnDisk.k + FileOnDisk.k < i_16_)
			return;
		    int i_17_ = FileOnDisk.k + (((hv) var_hv).o - n.e);
		    if (i_17_ <= FileOnDisk.k + FileOnDisk.k) {
			if (i_17_ < 0)
			    return;
		    } else
			i_17_ = FileOnDisk.k + FileOnDisk.k;
		    boolean bool = false;
		    while (i_16_ <= i_17_) {
			if (vd.O[i_16_++][i_15_]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			float f = (float) (sw.g - ((hv) var_hv).e[0]);
			if (f < 0.0F)
			    f *= -1.0F;
			if (!(f < (float) sl.j) && hn.a(var_hv, 0, 0)
			    && hn.a(var_hv, 1, 0) && hn.a(var_hv, 2, 0)
			    && hn.a(var_hv, 3, i_10_))
			    jr.w[bfa.D++] = var_hv;
		    }
		}
	    } else if (((hv) var_hv).h == 16 || ((hv) var_hv).h == 8) {
		int i_18_ = FileOnDisk.k - n.e + ((hv) var_hv).j;
		if (i_18_ >= 0 && i_18_ <= FileOnDisk.k + FileOnDisk.k) {
		    int i_19_ = FileOnDisk.k - fm.i + ((hv) var_hv).b;
		    if (i_19_ >= 0 && FileOnDisk.k + FileOnDisk.k >= i_19_
			&& vd.O[i_18_][i_19_]) {
			float f = (float) (dl.d - ((hv) var_hv).m[0]);
			if (f < 0.0F)
			    f *= -1.0F;
			float f_20_ = (float) (sw.g - ((hv) var_hv).e[0]);
			if (f_20_ < 0.0F)
			    f_20_ *= -1.0F;
			if ((!((float) sl.j > f) || !(f_20_ < (float) sl.j))
			    && hn.a(var_hv, 0, 0) && hn.a(var_hv, 1, 0)
			    && hn.a(var_hv, 2, 0) && hn.a(var_hv, 3, 0))
			    jr.w[bfa.D++] = var_hv;
		    }
		}
	    } else if (((hv) var_hv).h == 4) {
		float f = (float) (((hv) var_hv).a[0] - ItemDef.a);
		if (!((float) mh.k >= f)) {
		    int i_21_ = FileOnDisk.k + (((hv) var_hv).b - fm.i);
		    if (i_21_ >= 0) {
			if (FileOnDisk.k + FileOnDisk.k < i_21_)
			    return;
		    } else
			i_21_ = 0;
		    int i_22_ = FileOnDisk.k - fm.i + ((hv) var_hv).g;
		    if (FileOnDisk.k + FileOnDisk.k >= i_22_) {
			if (i_22_ < 0)
			    return;
		    } else
			i_22_ = FileOnDisk.k + FileOnDisk.k;
		    int i_23_ = FileOnDisk.k + ((hv) var_hv).j - n.e;
		    if (i_23_ >= 0) {
			if (i_23_ > FileOnDisk.k + FileOnDisk.k)
			    return;
		    } else
			i_23_ = 0;
		    int i_24_ = ((hv) var_hv).o - n.e + FileOnDisk.k;
		    if (FileOnDisk.k + FileOnDisk.k >= i_24_) {
			if (i_24_ < 0)
			    return;
		    } else
			i_24_ = FileOnDisk.k + FileOnDisk.k;
		    boolean bool = false;
		while_200_:
		    for (int i_25_ = i_23_; i_25_ <= i_24_; i_25_++) {
			for (int i_26_ = i_21_; i_22_ >= i_26_; i_26_++) {
			    if (vd.O[i_25_][i_26_]) {
				bool = true;
				break while_200_;
			    }
			}
		    }
		    if (bool && hn.a(var_hv, 0, i_10_)
			&& hn.a(var_hv, 1, i_10_) && hn.a(var_hv, 2, i_10_)
			&& hn.a(var_hv, 3, i_10_))
			jr.w[bfa.D++] = var_hv;
		}
	    }
	}
    }
    
    final int b(int i) {
	p++;
	if (i != 28110)
	    return -61;
	return t;
    }
    
    final void a(da var_da, int i, Class_r class_r, int i_27_, boolean bool,
		 int i_28_, int i_29_, int i_30_, Class_q class_q) {
	var_n++;
	hi[] var_his = var_da.c();
	qg[] var_qgs = var_da.f();
	if ((((rea) this).K == null || ((tq) ((rea) this).K).k)
	    && (var_his != null || var_qgs != null)) {
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 120, ((rea) this).y);
	    if (((ObjectDef) var_bda).xb != null)
		var_bda = var_bda.a(cp.e, -1643);
	    if (var_bda != null)
		((rea) this).K = tq.a(pm.currentTimedTicks, true);
	}
	if (((rea) this).K != null) {
	    var_da.a(class_q);
	    if (!bool)
		((rea) this).K.a((long) pm.currentTimedTicks);
	    else
		((rea) this).K.a(class_r, (long) pm.currentTimedTicks, var_his, var_qgs,
				 false);
	    ((rea) this).K.a(b, i, i_28_, i_29_, i_27_);
	}
	int i_31_ = -13 % ((-71 - i_30_) / 44);
    }
    
    final da a(boolean bool, int i, Class_r class_r, boolean bool_32_,
	       boolean bool_33_, int i_34_, int i_35_) {
	E++;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 94, ((rea) this).y);
	if (((ObjectDef) var_bda).xb != null)
	    var_bda = var_bda.a(cp.e, -1643);
	if (var_bda == null) {
	    a((int) 2, class_r);
	    H = -1;
	    v = -1;
	    a = -1;
	    return null;
	}
	if (!x && a != ((ObjectDef) var_bda).objectID) {
	    l = null;
	    a((byte) 112, -1);
	}
	a(0, i_34_, i);
	if (bool_32_) {
	    bool_32_ = bool_32_ & (k & cs.g.b(on.performance, -108) != 0);
	    bool_32_
		= bool_32_ & (H != ((ObjectDef) var_bda).objectID
			      || (f != null && cs.g.b(on.performance, -128) >= 2
				  && (m != v
				      || (((dr) f).C || vm.r) && G != m)));
	}
	if (bool != true)
	    C = -12;
	if (bool_33_ && !bool_32_) {
	    a = ((ObjectDef) var_bda).objectID;
	    return null;
	}
	if (bool_32_) {
	    oga.a(s, J, e, c, h);
	    H = -1;
	    v = -1;
	}
	Class_i class_i = Class_q.b[J];
	Class_i class_i_36_;
	if (q)
	    class_i_36_ = vr.b[0];
	else
	    class_i_36_ = J < 3 ? Class_q.b[J + 1] : null;
	da var_da = null;
	if (f != null) {
	    if (bool_32_)
		i_35_ |= 0x40000;
	    var_da = var_bda.a(e,
			       (((rea) this).w != 11 ? ((rea) this).L
				: ((rea) this).L + 4),
			       class_i, A, class_i_36_, f, G, class_r,
			       class_i.a(c, e, true), c, m, 4, i_35_,
			       ((rea) this).w != 11 ? ((rea) this).w : 10);
	    if (var_da == null) {
		t = 0;
		s = null;
		this.i = 0;
		h = null;
	    } else {
		if (bool_32_) {
		    if (h == null)
			h = new boolean[4];
		    s = var_da.S(s);
		    ck.a(s, J, i, i_34_, h);
		    v = m;
		    H = ((ObjectDef) var_bda).objectID;
		}
		this.i = var_da.J();
		t = var_da.RA();
	    }
	    l = null;
	} else if (l == null || (l.PA() & i_35_) != i_35_
		   || a != ((ObjectDef) var_bda).objectID) {
	    if (l != null)
		i_35_ |= l.PA();
	    kj var_kj = var_bda.a(i_35_, class_r, class_i.a(c, e, true),
				  class_i, e, -129, class_i_36_, c, bool_32_,
				  ((rea) this).w == 11 ? 10 : ((rea) this).w,
				  (((rea) this).w != 11 ? ((rea) this).L
				   : ((rea) this).L + 4));
	    if (var_kj == null) {
		l = null;
		s = null;
		t = 0;
		this.i = 0;
		h = null;
	    } else {
		l = var_da = ((kj) var_kj).d;
		if (bool_32_) {
		    h = null;
		    s = ((kj) var_kj).e;
		    ck.a(s, J, i, i_34_, null);
		    H = ((ObjectDef) var_bda).objectID;
		    v = -1;
		}
		this.i = var_da.J();
		t = var_da.RA();
	    }
	} else
	    var_da = l;
	a = ((ObjectDef) var_bda).objectID;
	e = i;
	c = i_34_;
	return var_da;
    }
    
    final int b(byte i) {
	F++;
	if (i != -99)
	    e = -88;
	return this.i;
    }
    
    rea(Class_r class_r, ObjectDef var_bda, int i, int i_37_, int i_38_, int i_39_,
	int i_40_, int i_41_, boolean bool, int i_42_) {
	a = -1;
	x = false;
	t = 0;
	H = -1;
	c = i_41_;
	J = (byte) i_39_;
	b = (byte) i_38_;
	q = bool;
	e = i_40_;
	((rea) this).L = i_37_;
	((rea) this).y = ((ObjectDef) var_bda).objectID;
	((rea) this).w = i;
	k = class_r.n() && ((ObjectDef) var_bda).hb && !q;
	if (i_42_ != -1)
	    x = true;
	a((byte) 105, i_42_);
    }
    
    static {
	C = 0;
    }
}
