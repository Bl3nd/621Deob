/* lr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lr implements ica
{
    static int a;
    private pl b;
    static int c;
    static int d;
    private la e;
    static GameInPacket incomingPacket111 = new GameInPacket(111, 6);
    private nn g;
    private pl h;
    static float i;
    static int j = 0;
    static br k;
    static GameOutPacket outgoingPacket66 = new GameOutPacket(66, -1);
    
    public final void a(boolean bool, int i) {
	if (i != 6621)
	    a(false);
	if (bool) {
	    int i_0_ = ((nn) g).p.a(baa.d, ((nn) g).g, 2) + ((nn) g).o;
	    int i_1_ = ((nn) g).h.a(Class_vb.r, ((nn) g).n, -90) + ((nn) g).j;
	    e.a(((nn) g).k, ((nn) g).a, null, ((nn) g).g, ((nn) g).e,
		((nn) g).c, ((nn) g).f, i - 6705, ((nn) g).l, ((nn) g).n, null,
		null, 0, 0, i_1_, i_0_);
	}
	c++;
    }
    
    public static void a(boolean bool) {
	k = null;
	incomingPacket111 = null;
	if (bool == false)
	    outgoingPacket66 = null;
    }
    
    public final boolean a(byte i) {
	if (i != 82)
	    a(true, 41);
	d++;
	boolean bool = true;
	if (!b.g(1912, ((nn) g).b))
	    bool = false;
	if (!h.g(1912, ((nn) g).b))
	    bool = false;
	return bool;
    }
    
    public final void a(int i) {
	if (i >= -41)
	    a((int) 113);
	a++;
	sa var_sa = GameOutPacket.a(h, ((nn) g).b);
	e = lg.r.a(var_sa, aga.a(b, ((nn) g).b), true);
    }
    
    static final dfa a(int i, int i_2_, int i_3_) {
	vf var_vf = ol.p[i][i_2_][i_3_];
	if (var_vf == null || ((vf) var_vf).m == null)
	    return null;
	return ((vf) var_vf).m;
    }
    
    lr(pl var_pl, pl var_pl_4_, nn var_nn) {
	h = var_pl_4_;
	b = var_pl;
	g = var_nn;
    }
}
