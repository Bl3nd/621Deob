/* sp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class sp extends pp
{
    static f[] s;
    static int[] t = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    static int[][] u
	= { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 },
	    { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 },
	    { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 },
	    { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    int v;
    static int w;
    
    public static void b(byte i) {
	int i_0_ = 39 % ((i + 30) / 37);
	s = null;
	t = null;
	u = null;
    }
    
    static final void a(boolean bool, byte[][][] is, int i, byte i_1_) {
	int i_2_ = bool ? 1 : 0;
	ii.d = 0;
	Class_u.Q = 0;
	dca.S++;
	for (int i_3_ = 0; i_3_ < baa.l[i_2_]; i_3_++) {
	    if (!cj.a(aaa.animables[i_2_][i_3_], bool, is, i, i_1_)) {
		qg.a(aaa.animables[i_2_][i_3_]);
		if (((Animable) aaa.animables[i_2_][i_3_]).g != -1)
		    ht.F[ii.d++] = aaa.animables[i_2_][i_3_];
	    }
	}
	for (int i_4_ = 0; i_4_ < fg.a[i_2_]; i_4_++) {
	    if (!cj.a(lm.Nh[i_2_][i_4_], bool, is, i, i_1_)) {
		qg.a(lm.Nh[i_2_][i_4_]);
		if (((Animable) lm.Nh[i_2_][i_4_]).g != -1)
		    uq.H[Class_u.Q++] = lm.Nh[i_2_][i_4_];
	    }
	}
	for (int i_5_ = 0; i_5_ < cc.f[i_2_]; i_5_++) {
	    if (!cj.a(InputStreamSub_1.d[i_2_][i_5_], bool, is, i, i_1_)) {
		if (InputStreamSub_1.d[i_2_][i_5_].e((byte) 23)) {
		    qg.a(InputStreamSub_1.d[i_2_][i_5_]);
		    if (((Animable) InputStreamSub_1.d[i_2_][i_5_]).g != -1)
			uq.H[Class_u.Q++] = InputStreamSub_1.d[i_2_][i_5_];
		} else {
		    qg.a(InputStreamSub_1.d[i_2_][i_5_]);
		    if (((Animable) InputStreamSub_1.d[i_2_][i_5_]).g != -1)
			ht.F[ii.d++] = InputStreamSub_1.d[i_2_][i_5_];
		}
	    }
	}
	if (!bool) {
	    for (int i_6_ = 0; i_6_ < Node_Sub.n; i_6_++) {
		if (!cj.a(sw.a[i_6_], bool, is, i, i_1_)) {
		    qg.a(sw.a[i_6_]);
		    if (((Animable) sw.a[i_6_]).g != -1) {
			if (sw.a[i_6_].e((byte) 23))
			    uq.H[Class_u.Q++] = sw.a[i_6_];
			else
			    ht.F[ii.d++] = sw.a[i_6_];
		    }
		}
	    }
	}
	if (ii.d > 0) {
	    Class_vb.a(ht.F, 0, ii.d - 1);
	    for (int i_7_ = 0; i_7_ < ii.d; i_7_++)
		eca.a(ht.F[i_7_], true);
	}
	if (ih.m)
	    nda.k.a(0, null);
	for (int i_8_ = uaa.c; i_8_ < dfa.G; i_8_++) {
	    if (i_8_ >= i && is != null) {
		int i_9_ = vd.O.length;
		if (fp.q + vd.O.length > sv.T)
		    i_9_ -= fp.q + vd.O.length - sv.T;
		int i_10_ = vd.O[0].length;
		if (dp.n + vd.O[0].length > nf.H)
		    i_10_ -= dp.n + vd.O[0].length - nf.H;
		boolean[][] bools = kl.i;
		if (ISAAC.e) {
		    if (kw.B)
			bools = qea.d[i_8_];
		    for (int i_11_ = jl.g; i_11_ < i_9_; i_11_++) {
			int i_12_ = i_11_ + fp.q - jl.g;
			for (int i_13_ = vn.O; i_13_ < i_10_; i_13_++) {
			    bools[i_11_][i_13_] = false;
			    if (vd.O[i_11_][i_13_]) {
				int i_14_ = i_13_ + dp.n - vn.O;
				for (int i_15_ = i_8_; i_15_ >= 0; i_15_--) {
				    if (ol.p[i_15_][i_12_][i_14_] != null
					&& (((vf) ol.p[i_15_][i_12_][i_14_]).j
					    == i_8_)) {
					if (i_15_ >= i && (is[i_15_][i_12_]
							   [i_14_]) == i_1_
					    || vk.a(i_8_, i_12_, -1, i_14_))
					    bools[i_11_][i_13_] = false;
					else
					    bools[i_11_][i_13_] = true;
					break;
				    }
				}
			    }
			}
		    }
		}
		if (kw.B) {
		    Class_q.b[i_8_].a(0, 0, 0, null, false);
		    for (int i_16_ = 0; i_16_ < qd.v; i_16_++)
			ff.p[i_16_].a((byte) -32, new wu(i_8_ + 1));
		} else if (lq.L)
		    Class_q.b[i_8_].a(n.e, fm.i, FileOnDisk.k, kl.i, false,
				      um.e);
		else
		    Class_q.b[i_8_].a(n.e, fm.i, FileOnDisk.k, kl.i, false);
	    } else {
		int i_17_ = vd.O.length;
		if (fp.q + vd.O.length > sv.T)
		    i_17_ -= fp.q + vd.O.length - sv.T;
		int i_18_ = vd.O[0].length;
		if (dp.n + vd.O[0].length > nf.H)
		    i_18_ -= dp.n + vd.O[0].length - nf.H;
		boolean[][] bools = kl.i;
		if (ISAAC.e) {
		    if (kw.B)
			bools = qea.d[i_8_];
		    for (int i_19_ = jl.g; i_19_ < i_17_; i_19_++) {
			int i_20_ = i_19_ + fp.q - jl.g;
			for (int i_21_ = vn.O; i_21_ < i_18_; i_21_++) {
			    if (vd.O[i_19_][i_21_]
				&& !vk.a(i_8_, i_20_, -1, i_21_ + dp.n - vn.O))
				bools[i_19_][i_21_] = true;
			    else
				bools[i_19_][i_21_] = false;
			}
		    }
		}
		if (kw.B) {
		    Class_q.b[i_8_].a(0, 0, 0, null, false);
		    for (int i_22_ = 0; i_22_ < qd.v; i_22_++)
			ff.p[i_22_].a((byte) -32, new wu(i_8_ + 1));
		} else if (lq.L)
		    Class_q.b[i_8_].a(n.e, fm.i, FileOnDisk.k, kl.i, true, um.e);
		else
		    Class_q.b[i_8_].a(n.e, fm.i, FileOnDisk.k, kl.i, true);
	    }
	}
	if (Class_u.Q > 0) {
	    oi.a(uq.H, 0, Class_u.Q - 1);
	    for (int i_23_ = 0; i_23_ < Class_u.Q; i_23_++)
		eca.a(uq.H[i_23_], true);
	}
    }
    
    abstract boolean a(int i);
    
    abstract Object i(int i);
    
    sp(int i) {
	((sp) this).v = i;
    }
}
