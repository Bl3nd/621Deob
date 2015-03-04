/* hn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hn
{
    static int a;
    static int y_;
    static GameOutPacket outgoingPacket32 = new GameOutPacket(32, -1);
    static int d;
    static int e;
    static nw f;
    static int g = 0;
    
    public static void a(int i) {
	f = null;
	if (i > -56)
	    b(93);
	outgoingPacket32 = null;
    }
    
    static final boolean a(hv var_hv, int i, int i_0_) {
	d++;
	qga.i.a(((hv) var_hv).m[i], ((hv) var_hv).a[i], ((hv) var_hv).e[i],
		qd.w);
	int i_1_ = qd.w[2];
	if (i_1_ < 50)
	    return false;
	((hv) var_hv).i[i] = (short) (Class_cb.f * qd.w[i_0_] / i_1_ + iq.j);
	((hv) var_hv).l[i] = (short) (bt.p * qd.w[1] / i_1_ + dr.f);
	((hv) var_hv).c[i] = (short) i_1_;
	return true;
    }
    
    static final void b(int i) {
	e++;
	if (!cs.g.e(on.performance, 101) && qca.E != vo.clientHeight)
	    kga.a(11, i ^ 0x20b, false, wj.q, Class_kf.y);
	else {
	    if (i != 11)
		a(null, -49, -113);
	    bea.a(lg.r, i + 99);
	    if (rq.K != vo.clientHeight)
		kl.b(-106);
	}
    }
    
    static final void a(int i, int i_2_, ql var_ql, int i_3_, int i_4_,
			int i_5_) {
	a++;
	if (((ql) var_ql).p != -1 || ((ql) var_ql).E != null) {
	    int i_6_ = i_2_;
	    if (((ql) var_ql)._x >= i_3_) {
		if (((ql) var_ql).xLoc > i_3_)
		    i_6_ += ((ql) var_ql).xLoc - i_3_;
	    } else
		i_6_ += i_3_ - ((ql) var_ql)._x;
	    int i_7_ = ((jb) cs.g).Y * ((ql) var_ql).J >> 8;
	    if (((ql) var_ql)._y < i_4_)
		i_6_ += i_4_ - ((ql) var_ql)._y;
	    else if (((ql) var_ql).yLoc > i_4_)
		i_6_ += ((ql) var_ql).yLoc - i_4_;
	    if (((ql) var_ql).t == 0 || i_6_ - 256 > ((ql) var_ql).t
		|| ((jb) cs.g).Y == 0 || i_5_ != ((ql) var_ql).G) {
		if (((ql) var_ql).K != null) {
		    ej.r.a(((ql) var_ql).K);
		    ((ql) var_ql).n = null;
		    ((ql) var_ql).r = null;
		    ((ql) var_ql).K = null;
		}
		if (((ql) var_ql).w != null) {
		    ej.r.a(((ql) var_ql).w);
		    ((ql) var_ql).w = null;
		    ((ql) var_ql).I = null;
		    ((ql) var_ql).L = null;
		}
	    } else {
		i_6_ -= 256;
		if (i_6_ < 0)
		    i_6_ = 0;
		int i_8_ = i_7_ * (((ql) var_ql).t - i_6_) / ((ql) var_ql).t;
		if (((ql) var_ql).K != null)
		    ((ql) var_ql).K.j(i_8_);
		else if (((ql) var_ql).p >= 0) {
		    if (!((ql) var_ql).x) {
			uea var_uea = uea.a(jt.e, ((ql) var_ql).p, 0);
			if (var_uea != null) {
			    oaa var_oaa = var_uea.c().a(kfa.o);
			    hw var_hw = hw.a(var_oaa, 100, i_8_);
			    var_hw.l(-1);
			    ej.r.b(var_hw);
			    ((ql) var_ql).K = var_hw;
			}
		    } else {
			if (((ql) var_ql).r == null)
			    ((ql) var_ql).r = go.a(sr.S, ((ql) var_ql).p);
			if (((ql) var_ql).r != null) {
			    if (((ql) var_ql).n == null)
				((ql) var_ql).n
				    = ((ql) var_ql).r.a(new int[] { 22050 });
			    if (((ql) var_ql).n != null) {
				hw var_hw = hw.a(((ql) var_ql).n, 100, i_8_);
				var_hw.l(-1);
				ej.r.b(var_hw);
				((ql) var_ql).K = var_hw;
			    }
			}
		    }
		}
		if (((ql) var_ql).w != null) {
		    ((ql) var_ql).w.j(i_8_);
		    if (!((ql) var_ql).w.isNextNode(116)) {
			((ql) var_ql).I = null;
			((ql) var_ql).w = null;
			((ql) var_ql).L = null;
		    }
		} else if (((ql) var_ql).E != null
			   && (((ql) var_ql).D -= i) <= 0) {
		    if (((ql) var_ql).k) {
			if (((ql) var_ql).I == null) {
			    int i_9_ = (int) ((double) ((ql) var_ql).E.length
					      * Math.random());
			    ((ql) var_ql).I
				= go.a(sr.S, ((ql) var_ql).E[i_9_]);
			}
			if (((ql) var_ql).I != null) {
			    if (((ql) var_ql).L == null)
				((ql) var_ql).L
				    = ((ql) var_ql).I.a(new int[] { 22050 });
			    if (((ql) var_ql).L != null) {
				hw var_hw = hw.a(((ql) var_ql).L, 100, i_8_);
				var_hw.l(0);
				ej.r.b(var_hw);
				((ql) var_ql).D
				    = ((int) ((double) (((ql) var_ql).l
							- ((ql) var_ql).o)
					      * Math.random())
				       + ((ql) var_ql).o);
				((ql) var_ql).w = var_hw;
			    }
			}
		    } else {
			int i_10_ = (int) (Math.random()
					   * (double) ((ql) var_ql).E.length);
			uea var_uea = uea.a(jt.e, ((ql) var_ql).E[i_10_], 0);
			if (var_uea != null) {
			    oaa var_oaa = var_uea.c().a(kfa.o);
			    hw var_hw = hw.a(var_oaa, 100, i_8_);
			    var_hw.l(0);
			    ej.r.b(var_hw);
			    ((ql) var_ql).w = var_hw;
			    ((ql) var_ql).D
				= (((ql) var_ql).o
				   + (int) (Math.random()
					    * (double) (((ql) var_ql).l
							- ((ql) var_ql).o)));
			}
		    }
		}
	    }
	}
    }
    
    static {
	f = new nw();
    }
}
