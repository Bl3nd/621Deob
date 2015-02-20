/* li - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class li extends sp
{
    static int x;
    private Object y;
    static int z;
    static int A;
    static int B;
    static int C;
    static int D;
    static int[] E = new int[32];
    
    final Object i(int i) {
	if (i != -1)
	    return null;
	C++;
	return y;
    }
    
    static final wl a(int modeWhat, byte i_0_) {
	A++;
	wl[] var_wls = PlayerDef.b(20565);
	if (i_0_ != -98)
	    a(-9, (int) -49);
	for (int i_1_ = 0; var_wls.length > i_1_; i_1_++) {
	    wl var_wl = var_wls[i_1_];
	    if (((wl) var_wl).c == modeWhat)
		return var_wl;
	}
	return null;
    }
    
    public static void c(byte i) {
	E = null;
	if (i != 124)
	    c((byte) -60);
    }
    
    static final int a(int i, int i_2_, int i_3_, int i_4_, int i_5_,
		       byte i_6_, int i_7_) {
	i_3_ &= 0x3;
	if ((i_4_ & 0x1) == 1) {
	    int i_8_ = i_5_;
	    i_5_ = i_7_;
	    i_7_ = i_8_;
	}
	B++;
	if (i_3_ == 0)
	    return i_2_;
	if (i_3_ == 1)
	    return -i_5_ + 1 + (-i + 7);
	if (i_6_ != -102)
	    z = 94;
	if (i_3_ == 2)
	    return -i_2_ - (i_7_ - 1) + 7;
	return i;
    }
    
    final boolean a(int i) {
	if (i >= -50)
	    return true;
	D++;
	return false;
    }
    
    static final void a(int i, int i_9_) {
	x++;
	if (i_9_ != (i ^ 0xffffffff) && pu.p[i]) {
	    Class_fc.a.b(16, i);
	    aa.o[i] = null;
	    mv.b[i] = null;
	    pu.p[i] = false;
	}
    }
    
    static final void a() {
	if (ws.I != null) {
	    for (int i = 0; i < ws.I.length; i++) {
		for (int i_10_ = 0; i_10_ < sv.T; i_10_++) {
		    for (int i_11_ = 0; i_11_ < nf.H; i_11_++) {
			if (ws.I[i][i_10_][i_11_] != null)
			    ws.I[i][i_10_][i_11_].a(false);
			ws.I[i][i_10_][i_11_] = null;
		    }
		}
	    }
	}
	ws.I = null;
	vr.b = null;
	if (fg.e != null) {
	    for (int i = 0; i < fg.e.length; i++) {
		for (int i_12_ = 0; i_12_ < sv.T; i_12_++) {
		    for (int i_13_ = 0; i_13_ < nf.H; i_13_++) {
			if (fg.e[i][i_12_][i_13_] != null)
			    fg.e[i][i_12_][i_13_].a(false);
			fg.e[i][i_12_][i_13_] = null;
		    }
		}
	    }
	}
	fg.e = null;
	wr.D = null;
	ol.p = null;
	Class_q.b = null;
	vd.O = null;
	kl.i = null;
	qea.d = null;
	kga.mb = null;
	wca.d((byte) 71);
	if (sw.a != null) {
	    for (int i = 0; i < aa.n; i++)
		sw.a[i] = null;
	    aa.n = 0;
	}
	if (aaa.k != null) {
	    for (int i = 0; i < baa.l[0]; i++)
		aaa.k[0][i] = null;
	    for (int i = 0; i < baa.l[1]; i++)
		aaa.k[1][i] = null;
	    baa.l = new int[2];
	}
	if (lm.Nh != null) {
	    for (int i = 0; i < fg.a[0]; i++)
		lm.Nh[0][i] = null;
	    for (int i = 0; i < fg.a[1]; i++)
		lm.Nh[1][i] = null;
	    fg.a = new int[2];
	}
	if (cca.d != null) {
	    for (int i = 0; i < cc.f[0]; i++)
		cca.d[0][i] = null;
	    for (int i = 0; i < cc.f[1]; i++)
		cca.d[1][i] = null;
	    cc.f = new int[2];
	}
	if (ht.F != null) {
	    for (int i = 0; i < ht.F.length; i++)
		ht.F[i] = null;
	    ii.d = 0;
	}
	if (uq.H != null) {
	    for (int i = 0; i < uq.H.length; i++)
		uq.H[i] = null;
	    Class_u.Q = 0;
	}
	if (Class_j.l != null) {
	    for (int i = 0; i < qn.k; i++)
		Class_j.l[i] = null;
	    for (int i = 0; i < dfa.G; i++) {
		for (int i_14_ = 0; i_14_ < sv.T; i_14_++) {
		    for (int i_15_ = 0; i_15_ < nf.H; i_15_++)
			tba.n[i][i_14_][i_15_] = 0L;
		}
	    }
	    qn.k = 0;
	}
	bfa.a((byte) -103);
	oea.fb.b(128);
	qh.q = null;
	of.b = null;
	uo.c = null;
	if (vk.i != null) {
	    oea.a();
	    nda.k.g(1);
	    nda.k.f(0);
	}
	if (ff.p != null)
	    ff.p = null;
	nda.k = null;
    }
    
    li(Object object, int i) {
	super(i);
	y = object;
    }
}
