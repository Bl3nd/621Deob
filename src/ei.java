/* ei - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ei
{
    static int a;
    static int b;
    static int c;
    static float d;
    static long e = 0L;
    static int f;
    
    static final long a(int i) {
	if (i != -27622)
	    e = -75L;
	c++;
	return aea.F.b(26262);
    }
    
    static final void a(NPC class_ac, byte i) {
	a++;
	if (i > -107)
	    a((NPC) null, (byte) 32);
	for (ql var_ql = (ql) bea.h.a((int) 118); var_ql != null;
	     var_ql = (ql) bea.h.b((byte) 92)) {
	    if (((ql) var_ql).H == class_ac) {
		if (((ql) var_ql).K != null) {
		    ej.r.a(((ql) var_ql).K);
		    ((ql) var_ql).K = null;
		}
		var_ql.unlink(-105);
		break;
	    }
	}
    }
    
    static final void a(int i, int i_0_) {
	f++;
	if (i != hm.h) {
	    if (i == 13) {
		if (uo.ssKey == null)
		    ui.a(Interface.password, op.username, -104, pda.y);
		else
		    lca.a(pda.y, 0);
	    }
	    if (i != 13 && wj.l != null) {
		wj.l.d(0);
		wj.l = null;
	    }
	    if (i == 3)
		GrandExchangeItem.a(117, Class_vb.u != nh.k);
	    if (i == 7)
		mh.a(maa.g != Class_vb.u, false);
	    if (i != 5) {
		if (i == 6) {
		    if (uo.ssKey != null)
			lca.a(pda.y, 0);
		    else
			ui.a(Interface.password, op.username, 75, pda.y);
		} else if (i == 9) {
		    if (uo.ssKey != null)
			lca.a(pda.y, 0);
		    else
			ui.a(Interface.password, op.username, -104, pda.y);
		} else if (i == 12) {
		    if (uo.ssKey != null)
			tba.b((byte) -82);
		    else
			eg.a(70, Interface.password, op.username);
		}
	    } else if (uo.ssKey == null)
		eg.a(22, Interface.password, op.username);
	    else
		tba.b((byte) -99);
	    if (ml.a((byte) 22, hm.h)) {
		((pl) fu.b).y = 2;
		((pl) od.sb).y = 2;
		((pl) id.j).y = 2;
		((pl) nk.g).y = 2;
		((pl) sh.i).y = 2;
		((pl) kq.W).y = 2;
		((pl) vq.l).y = 2;
	    }
	    if (ml.a((byte) 22, i)) {
		it.L = 1;
		pp.q = 0;
		dga.w = 0;
		em.e = 0;
		tw.q = 1;
		lba.b(96, true);
		((pl) fu.b).y = 1;
		((pl) od.sb).y = 1;
		((pl) id.j).y = 1;
		((pl) nk.g).y = 1;
		((pl) sh.i).y = 1;
		((pl) kq.W).y = 1;
		((pl) vq.l).y = 1;
	    }
	    if (i == 11 || i == 3)
		da.a(false);
	    int i_1_ = -113 % ((i_0_ + 65) / 37);
	    boolean bool = i == 2 || gs.b(i, 0) || pga.a(-66, i);
	    boolean bool_2_ = hm.h == 2 || gs.b(hm.h, 0) || pga.a(-66, hm.h);
	    if (!bool_2_ != !bool) {
		if (bool) {
		    ws.G = cga.E;
		    if (((jb) cs.g).V != 0)
			jv.a(mq.a, cga.E, 15, 0, 2, false, ((jb) cs.g).V);
		    else
			mg.b(-124, 2);
		    bl.I.a(127, false);
		} else {
		    mg.b(-93, 2);
		    bl.I.a(127, true);
		}
	    }
	    if (ml.a((byte) 22, i) || i == 13)
		lg.r.s();
	    hm.h = i;
	}
    }
}
