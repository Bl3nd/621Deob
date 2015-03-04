/* ud - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ud extends pp
{
    static int[] s = new int[14];
    static int t;
    static int u;
    od v;
    
    static final it a(qfa var_qfa, int i, int i_0_, int i_1_) {
	u++;
	if (i_1_ != -6162)
	    a();
	int i_2_ = i_0_ << 10 | ((qfa) var_qfa).f;
	it var_it = (it) nfa.a.a((byte) 119, (long) i_2_ << 16);
	if (var_it != null)
	    return var_it;
	byte[] is = Class_nd.n.a((int) 113, Class_nd.n.a((byte) -126, i_2_));
	if (is != null) {
	    if (is.length <= 1)
		return null;
	    var_it = naa.a(is, -63);
	    ((it) var_it).D = var_qfa;
	    nfa.a.a(var_it, false, (long) i_2_ << 16);
	    return var_it;
	}
	i_2_ = ((qfa) var_qfa).f | i + 65536 << 10;
	var_it = (it) nfa.a.a((byte) 93, (long) i_2_ << 16);
	if (var_it != null)
	    return var_it;
	is = Class_nd.n.a(i_1_ ^ ~0x186b, Class_nd.n.a((byte) -126, i_2_));
	if (is != null) {
	    if (is.length <= 1)
		return null;
	    var_it = naa.a(is, -15);
	    ((it) var_it).D = var_qfa;
	    nfa.a.a(var_it, false, (long) i_2_ << 16);
	    return var_it;
	}
	i_2_ = 0x3fffc00 | ((qfa) var_qfa).f;
	var_it = (it) nfa.a.a((byte) 83, (long) i_2_ << 16);
	if (var_it != null)
	    return var_it;
	is = Class_nd.n.a(i_1_ ^ ~0x1871, Class_nd.n.a((byte) -126, i_2_));
	if (is != null) {
	    if (is.length <= 1)
		return null;
	    var_it = naa.a(is, -102);
	    ((it) var_it).D = var_qfa;
	    nfa.a.a(var_it, false, (long) i_2_ << 16);
	    return var_it;
	}
	return null;
    }
    
    static final void a() {
	int i = 10;
	int i_3_ = 30;
	if (us.c != null) {
	    nda.k.oa(GameInPacketHandler.var_n);
	    for (int i_4_ = 0; i_4_ < tg.M.length; i_4_++)
		nda.k.a(tg.M[i_4_] + fm.f[i_4_], (byte) 4, -256,
			GameInPacketHandler.var_n[3] - GameInPacketHandler.var_n[1], GameInPacketHandler.var_n[1]);
	    for (int i_5_ = 0; i_5_ < bfa.D; i_5_++) {
		hv var_hv = jr.w[i_5_];
		nda.k.MA(((hv) var_hv).m[0], ((hv) var_hv).a[0],
			 ((hv) var_hv).e[0], eq.N);
		nda.k.MA(((hv) var_hv).m[1], ((hv) var_hv).a[1],
			 ((hv) var_hv).e[1], cm.N);
		nda.k.MA(((hv) var_hv).m[2], ((hv) var_hv).a[2],
			 ((hv) var_hv).e[2], or.h);
		nda.k.MA(((hv) var_hv).m[3], ((hv) var_hv).a[3],
			 ((hv) var_hv).e[3], bn.g);
		if (eq.N[2] != -1 && cm.N[2] != -1 && or.h[2] != -1
		    && bn.g[2] != -1) {
		    int i_6_ = -65536;
		    if (((hv) var_hv).h == 4)
			i_6_ = -16776961;
		    nda.k.e(1, eq.N[1], i_6_, cm.N[1], eq.N[0], cm.N[0]);
		    nda.k.e(1, cm.N[1], i_6_, or.h[1], cm.N[0], or.h[0]);
		    nda.k.e(1, or.h[1], i_6_, bn.g[1], or.h[0], bn.g[0]);
		    nda.k.e(1, bn.g[1], i_6_, eq.N[1], bn.g[0], eq.N[0]);
		    nda.k.e(1, eq.N[1], i_6_, or.h[1], eq.N[0], or.h[0]);
		}
	    }
	    us.c.a(-256, true, i,
		   ("Static Opaque: OW: " + baa.l[0] + "/" + of.d[0] + " UW: "
		    + baa.l[1] + "/" + of.d[1]),
		   -16777216, i_3_);
	    us.c.a(-256, true, i,
		   ("Static Trans: OW: " + fg.a[0] + "/" + nq.n[0] + " UW: "
		    + fg.a[1] + "/" + nq.n[1]),
		   -16777216, i_3_ + 15);
	    us.c.a(-256, true, i,
		   ("Static Anim: OW: " + cc.f[0] + "/" + dca.T[0] + " UW: "
		    + cc.f[1] + "/" + dca.T[1]),
		   -16777216, i_3_ + 30);
	    us.c.a(-256, true, i, "Dynamic: " + Node_Sub.n + "/" + 5000, -16777216,
		   i_3_ + 45);
	    us.c.a(-256, true, i,
		   "Total Opaque Onscreen: " + ii.d + "/" + 10000, -16777216,
		   i_3_ + 60);
	    us.c.a(-256, true, i,
		   "Total Trans Onscreen: " + Class_u.Q + "/" + 5000,
		   -16777216, i_3_ + 75);
	    us.c.a(-256, true, i,
		   "Occluders: " + (cda.b + vu.j) + " Active: " + bfa.D,
		   -16777216, i_3_ + 90);
	    us.c.a(-256, true, i,
		   ("Occluded: Ground:" + Class_j.j + " Walls: " + mu.g
		    + " CPs: " + ld.c + " Pixels: " + io.X),
		   -16777216, i_3_ + 105);
	    us.c.a(-256, true, i,
		   "Occlude Calc Took: " + kga.nb / 1000L + "us", -16777216,
		   i_3_ + 120);
	    if (kaa.p != null) {
		for (int i_7_ = 0; i_7_ < kaa.p.length; i_7_++) {
		    float f = (float) kaa.p[i_7_];
		    f /= 4194304.0F;
		    if (f > 1.0F)
			f = 1.0F;
		    f *= 255.0F;
		    f = 255.0F - f;
		    int i_8_ = (int) f;
		    kaa.p[i_7_] = i_8_ | i_8_ << 8 | i_8_ << 16 | ~0xffffff;
		}
		f var_f = nda.k.a(kaa.p, 0, dn.c, dn.c, taa.c);
		var_f.V(i, 170, 1, 0, 0);
	    }
	}
    }
    
    public static void b(byte i) {
	s = null;
	if (i <= 64)
	    s = null;
    }
    
    static final void a(tba var_tba, byte i) {
	t++;
	if (i != -36)
	    b((byte) 127);
	SpecialOutPacket.d.b(var_tba, (byte) 93);
	((tba) var_tba).m = ((BytesParser) ((tba) var_tba).loginStream).pos;
	((BytesParser) ((tba) var_tba).loginStream).pos = 0;
	qt.y += ((tba) var_tba).m;
    }
    
    ud(od var_od) {
	((ud) this).v = var_od;
    }
}
