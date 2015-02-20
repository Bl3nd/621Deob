/* hm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hm
{
    private pl a;
    private pl b;
    private Class_is c;
    static short d = 32767;
    static int e;
    static int f;
    static int g;
    static int h = 0;
    static GameOutPacket i = new GameOutPacket(75, 0);
    static int j;
    
    final ica a(byte i, oc var_oc) {
	g++;
	if (var_oc == null)
	    return null;
	wea var_wea = var_oc.a(93);
	if (Connection.wea == var_wea)
	    return new cs((tl) var_oc);
	if (jr.m == var_wea)
	    return new qs(a(0), (js) var_oc);
	if (dh.c == var_wea)
	    return new rba(b, (qga) var_oc);
	if (var_wea == oba.J)
	    return new al(b, (jq) var_oc);
	if (dk.P == var_wea)
	    return new ll(b, a, (kk) var_oc);
	if (un.B == var_wea)
	    return new te(b, a, (bw) var_oc);
	if (var_wea == nj.j)
	    return new vs(b, a, (tm) var_oc);
	if (var_wea == Class_gb.c)
	    return new lr(b, a, (nn) var_oc);
	if (gh.H == var_wea)
	    return new fq(b, (mk) var_oc);
	int i_0_ = -93 / ((39 - i) / 46);
	if (ha.s == var_wea)
	    return new naa(b, a, (aea) var_oc);
	return null;
    }
    
    static final void a(boolean bool) {
	j++;
	Class_rf.a((int) -46);
	pi.a(2, ((jb) cs.g).s, 22050, 36);
	daa.ab = Class_nb.a(12869, nda.signlink, 22050, ru.canvas, 0);
	daa.ab.a(Connection.dt, (byte) 88);
	pt.g = Class_nb.a(12869, nda.signlink, 2048, ru.canvas, 1);
	if (bool != true)
	    i = null;
	pt.g.a(ej.r, (byte) 88);
    }
    
    hm(pl var_pl, pl var_pl_1_) {
	b = var_pl;
	a = var_pl_1_;
    }
    
    static final void a(byte i, int i_2_, int i_3_) {
	f++;
	if (i == 2) {
	    qba var_qba = ofa.a(13, i_2_, (byte) 116);
	    var_qba.c((byte) 11);
	    ((qba) var_qba).v = i_3_;
	}
    }
    
    private final Class_is a(int i) {
	if (c == null)
	    c = new Class_is();
	e++;
	if (i != 0)
	    return null;
	return c;
    }
    
    public static void b(int i) {
	if (i != 22050)
	    b(-49);
	hm.i = null;
    }
}
