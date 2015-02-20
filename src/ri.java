/* ri - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ri extends pp
{
    bi s;
    static int t;
    static int u = -1;
    static int v;
    
    static final void a(boolean bool, boolean bool_0_, int i, int i_1_,
			int i_2_, int i_3_) {
	t++;
	if (ol.p == null)
	    lg.r.f(-16777216, i_2_, i, 1, i_3_, i_1_);
	else if (((Animable) up.thisPlayer).locX < 0 || ((Animable) up.thisPlayer).locX >= Class_hc.e * 512
		 || ((Animable) up.thisPlayer).locY < 0 || ((Animable) up.thisPlayer).locY >= bw.v * 512)
	    lg.r.f(-16777216, i_2_, i, 1, i_3_, i_1_);
	else {
	    sh.j++;
	    if (up.thisPlayer != null
		&& ((Animable) up.thisPlayer).locX - 256 * (up.thisPlayer.i(-1) - 1) >> 9 == bca.c
		&& ((Animable) up.thisPlayer).locY - (up.thisPlayer.i(-1) - 1) * 256 >> 9 == uaa.h) {
		bca.c = -1;
		uaa.h = -1;
		ho.a(!bool);
	    }
	    sda.d(255);
	    if (!bool_0_)
		ao.b(-81);
	    hk.c((byte) 64);
	    lu.a(i_3_, i_2_, -16777216, i, i_1_, true);
	    i_3_ = vq.k;
	    if (bool != false)
		u = -62;
	    i = faa.e;
	    i_2_ = da.b;
	    i_1_ = qea.b;
	    if (ll.x == 1) {
		int i_4_ = (int) pm.F;
		if (dk.y >> 8 > i_4_)
		    i_4_ = dk.y >> 8;
		if (Class_ug.W[4] && me.m[4] + 128 > i_4_)
		    i_4_ = me.m[4] + 128;
		int i_5_ = (int) qw.n + sca.j & 0x3fff;
		faa.a(600 + 3 * (i_4_ >> 3) << 2, Class_k.N, i_4_, vaa.L, i_5_,
		      99, i_3_,
		      (Class_u.b(((Animable) up.thisPlayer).locX, vo.clientHeight, -20214, ((Animable) up.thisPlayer).locY)
		       - 200));
	    } else if (ll.x == 4) {
		int i_6_ = (int) pm.F;
		if (dk.y >> 8 > i_6_)
		    i_6_ = dk.y >> 8;
		if (Class_ug.W[4] && i_6_ < me.m[4] + 128)
		    i_6_ = me.m[4] + 128;
		int i_7_ = (int) qw.n & 0x3fff;
		faa.a((i_6_ >> 3) * 3 + 600 << 2, Class_k.N, i_6_, vaa.L, i_7_,
		      46, i_3_, Class_u.b(fu.a, vo.clientHeight, -20214, qg.j) - 200);
	    } else if (ll.x == 5)
		aj.a(i_3_, 16383);
	    int i_8_ = dg.gb;
	    int i_9_ = us.e;
	    int i_10_ = ada.N;
	    int i_11_ = mba.e;
	    int i_12_ = gn.G;
	    for (int i_13_ = 0; i_13_ < 5; i_13_++) {
		if (Class_ug.W[i_13_]) {
		    int i_14_
			= (int) ((double) -rn.e[i_13_]
				 + Math.random() * (double) (rn.e[i_13_] * 2
							     + 1)
				 + (Math.sin((double) ul.A[i_13_] / 100.0
					     * (double) gu.J[i_13_])
				    * (double) me.m[i_13_]));
		    if (i_13_ == 1)
			us.e += i_14_ << 2;
		    if (i_13_ == 3)
			gn.G = 0x3fff & i_14_ + gn.G;
		    if (i_13_ == 4) {
			mba.e += i_14_;
			if (mba.e < 1024)
			    mba.e = 1024;
			else if (mba.e > 3072)
			    mba.e = 3072;
		    }
		    if (i_13_ == 2)
			ada.N += i_14_ << 2;
		    if (i_13_ == 0)
			dg.gb += i_14_ << 2;
		}
	    }
	    if (dg.gb < 0)
		dg.gb = 0;
	    if ((sv.T << 9) - 1 < dg.gb)
		dg.gb = (sv.T << 9) - 1;
	    if (ada.N < 0)
		ada.N = 0;
	    if (ada.N > (nf.H << 9) - 1)
		ada.N = (nf.H << 9) - 1;
	    cs.b(87);
	    wh.d((byte) -114);
	    lg.r.da(i_2_, i, i_2_ + i_1_, i + i_3_);
	    lg.r.ya();
	    int i_15_ = uf.g;
	    if (Connection.tw == null)
		lg.r.ja(i_15_);
	    else
		Connection.tw.a(i_15_, i_2_, i, i_3_, (byte) -94, gn.G, i_1_,
			fr.A << 3, mba.e, lg.r);
	    naa.d((byte) 76);
	    tg.G.na(dg.gb, us.e, ada.N, 0x3fff & -mba.e, -gn.G & 0x3fff,
		    0x3fff & -GPIPlayer.e);
	    lg.r.a(tg.G);
	    lg.r.la(i_1_ / 2 + i_2_, i_3_ / 2 + i, fw.Eb << 1, fw.Eb << 1);
	    ss.a(i_1_ / 2 + i_2_, fw.Eb << 1, fw.Eb << 1, i + i_3_ / 2,
		 (byte) 50);
	    Class_g.a(dg.gb, -mba.e & 0x3fff, 8, us.e, ada.N, 0x3fff & -GPIPlayer.e,
		      -gn.G & 0x3fff);
	    byte i_16_ = cs.g.f(-111, on.performance) != 2 ? (byte) 1 : (byte) sh.j;
	    rm.a(pm.currentTimedTicks, dg.gb, us.e, ada.N, Interactable.e, of.e, Class_md.a, hp.I, gn.O,
		 mba.c, ((Animable) up.thisPlayer).height + 1, i_16_, ((Animable) up.thisPlayer).locX >> 9,
		 ((Animable) up.thisPlayer).locY >> 9, !((jb) cs.g).y, true);
	    naa.d((byte) 76);
	    if (hm.h == 10) {
		vs.a(i, i_1_, i_3_, 256, i_2_, 256, (byte) 20);
		bn.a(256, i, i_2_, i_3_, -140, 256, i_1_);
		to.a(i_3_, i_1_, 256, -14564, 256, i, i_2_);
		caa.a(i_1_, -86, i, i_3_, i_2_);
	    }
	    ld.a();
	    gn.G = i_12_;
	    us.e = i_9_;
	    ada.N = i_10_;
	    dg.gb = i_8_;
	    mba.e = i_11_;
	    if (hv.f && bl.I.g(54) == 0)
		hv.f = false;
	    if (hv.f) {
		lg.r.f(-16777216, i_2_, i, 1, i_3_, i_1_);
		Class_rf.a(true, lg.r, false, Class_nd.o, pm.v,
			   GameText.loadingPleaseWait.getString((byte) -82, cba.languageID));
	    }
	}
    }
    
    static final void a(int i, int i_17_) {
	nh.j = 1000000000L / (long) i;
	v++;
	if (i_17_ > -29)
	    u = -85;
    }
    
    ri(bi var_bi) {
	((ri) this).s = var_bi;
    }
}
