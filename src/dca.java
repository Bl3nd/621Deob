/* dca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dca extends kca
{
    static kg P = eda.a((byte) 121);
    static int Q;
    static sa R;
    static int S;
    static int[] T = { 3500, 200 };
    static int U;
    static cv V;
    
    public static void a(boolean bool) {
	R = null;
	T = null;
	V = null;
	if (bool != true)
	    T = null;
	P = null;
    }
    
    static final int b(boolean bool) {
	U++;
	if (ew.k == 0) {
	    fba.m.a(new po("jaclib"), (byte) 121);
	    if (fba.m.a((int) 91).a((int) 54) != 100)
		return 1;
	    if (!((po) fba.m.a((int) 91)).b((byte) 25))
		po.c.b();
	    ew.k = 1;
	}
	if (ew.k == 1) {
	    taa.l = fba.b((int) -111);
	    fba.i.a(new kv(qu.a), (byte) -84);
	    fba.n.a(new po("jaggl"), (byte) 125);
	    fba.o.a(new po("jagdx"), (byte) 124);
	    fba.p.a(new po("jagmisc"), (byte) -51);
	    fba.q.a(new po("sw3d"), (byte) 113);
	    fba.r.a(new po("hw3d"), (byte) -18);
	    fba.s.a(new kv(Class_nd.p), (byte) -99);
	    fba.t.a(new kv(ia.s), (byte) 121);
	    fba.u.a(new kv(fu.b), (byte) -38);
	    fba.v.a(new kv(id.j), (byte) -92);
	    fba.w.a(new kv(od.sb), (byte) -18);
	    fba.x.a(new kv(nk.g), (byte) 124);
	    fba.y.a(new kv(sh.i), (byte) -122);
	    fba.z.a(new kv(kq.W), (byte) -108);
	    fba.A.a(new kv(vq.l), (byte) -123);
	    fba.B.a(new kv(pga.g), (byte) -45);
	    fba.C.a(new kv(tn.k), (byte) 118);
	    fba.D.a(new kv(ufa.b), (byte) -12);
	    fba.E.a(new kv(Login.i), (byte) 121);
	    fba.F.a(new kv(Animable.pl), (byte) -86);
	    fba.G.a(new rr(nda.c, "huffman"), (byte) 120);
	    fba.H.a(new kv(ui.c), (byte) 115);
	    fba.I.a(new kv(Class_nd.n), (byte) 119);
	    fba.J.a(new kv(cs.i), (byte) -60);
	    fba.K.a(new n(cf.l, "details"), (byte) -123);
	    for (int i = 0; taa.l.length > i; i++) {
		if (taa.l[i].a((int) 91) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    fba[] var_fbas = taa.l;
	    for (int i_0_ = 0; var_fbas.length > i_0_; i_0_++) {
		fba var_fba = var_fbas[i_0_];
		int i_1_ = var_fba.a((byte) 119);
		int i_2_ = var_fba.a((int) 91).a((int) -106);
		i += i_1_ * i_2_ / 100;
	    }
	    vv.l = i;
	    ew.k = 2;
	}
	if (taa.l == null)
	    return 100;
	int i = 0;
	int i_3_ = 0;
	boolean bool_4_ = true;
	fba[] var_fbas = taa.l;
	for (int i_5_ = 0; i_5_ < var_fbas.length; i_5_++) {
	    fba var_fba = var_fbas[i_5_];
	    int i_6_ = var_fba.a((byte) 114);
	    int i_7_ = var_fba.a((int) 91).a((int) -124);
	    i += i_6_;
	    if (i_7_ < 100)
		bool_4_ = false;
	    i_3_ += i_6_ * i_7_ / 100;
	}
	if (bool_4_) {
	    if (!((po) fba.p.a((int) 91)).b((byte) 25))
		po.c.a((byte) -116);
	    taa.l = null;
	}
	i -= vv.l;
	i_3_ -= vv.l;
	if (bool != false)
	    return -90;
	int i_8_ = i > 0 ? 100 * i_3_ / i : 100;
	if (!bool_4_ && i_8_ > 99)
	    i_8_ = 99;
	return i_8_;
    }
}
