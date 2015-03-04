/* ej - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ej extends Interactable
{
    int g;
    int h;
    static int i;
    static int j;
    Entity k;
    static baa l = new baa(15, 0, 1, 0);
    int m;
    int n;
    static GameOutPacket o = new GameOutPacket(0, 7);
    static int p;
    static bfa q;
    static ch r;
    static int s;
    
    static final void a(og var_og, int i) {
	((og) var_og).j = null;
	j++;
	int i_0_ = ((og) var_og).g.length;
	for (int i_1_ = i; i_1_ < i_0_; i_1_++)
	    ((pba) ((og) var_og).g[i_1_]).h = false;
	synchronized (tw.l) {
	    if (tw.l.length > i_0_ && World.k[i_0_] < 200) {
		tw.l[i_0_].a(var_og, i + 125);
		World.k[i_0_]++;
	    }
	}
    }
    
    static final void a(int i, int i_2_, int i_3_, ev var_ev, ev var_ev_4_) {
	vf var_vf = lh.a(i, i_2_, i_3_);
	if (var_vf != null) {
	    ((vf) var_vf).l = var_ev;
	    ((vf) var_vf).h = var_ev_4_;
	    int i_5_ = Class_q.b == wr.D ? 1 : 0;
	    if (var_ev.g((byte) 120)) {
		if (var_ev.e((byte) 23))
		    lm.Nh[i_5_][fg.a[i_5_]++] = var_ev;
		else
		    aaa.animables[i_5_][baa.l[i_5_]++] = var_ev;
	    } else
		InputStreamSub_1.d[i_5_][cc.f[i_5_]++] = var_ev;
	    if (var_ev_4_ != null) {
		if (var_ev_4_.g((byte) 124)) {
		    if (var_ev_4_.e((byte) 23))
			lm.Nh[i_5_][fg.a[i_5_]++] = var_ev_4_;
		    else
			aaa.animables[i_5_][baa.l[i_5_]++] = var_ev_4_;
		} else
		    InputStreamSub_1.d[i_5_][cc.f[i_5_]++] = var_ev_4_;
	    }
	}
    }
    
    public static void a(int i) {
	if (i != 0)
	    a(101, 40, 20, null, null);
	r = null;
	l = null;
	q = null;
	o = null;
    }
    
    static final jq a(byte i, BytesParser var_es) {
	p++;
	qga var_qga = nda.a(var_es, -66);
	int i_6_ = var_es.readTribyte2((byte) -67);
	int i_7_ = -84 % ((36 - i) / 35);
	return new jq(((qga) var_qga).c, ((qga) var_qga).b, ((qga) var_qga).e,
		      ((qga) var_qga).h, ((qga) var_qga).g, i_6_);
    }
    
    static final lca a(int i, int i_8_, int i_9_) {
	vf var_vf = ol.p[i][i_8_][i_9_];
	if (var_vf == null)
	    return null;
	return ((vf) var_vf).d;
    }
}
