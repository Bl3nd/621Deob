/* ik - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

final class ik {
    static int a;
    int b;
    byte c;
    static int d;
    short e;
    short f;
    int g;
    int h;
    static int i;
    boolean j;
    int k;
    static int l;
    short m;
    static GameOutPacket n = new GameOutPacket(28, -1);
    static Class_gb o = new Class_gb();
    int p;
    static float q;
    static int r = 0;
    static int s;
    static int t;

    static final boolean a(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        a++;
        if (!il.occlude)
            return false;
        if (io.X < 100)
            return false;
        if (!vk.a(i_0_, i_2_, -1, i_1_))
            return false;
        if (i_3_ <= 1)
            b(-59);
        int i_4_ = i_2_ << Class_fb.a;
        int i_5_ = i_1_ << Class_fb.a;
        if (dd.a(false, bea.o, i, i_5_,
                Class_q.b[i_0_].a(i_1_, (byte) 51, i_2_), i_4_, bea.o)) {
            ld.c++;
            return true;
        }
        return false;
    }

    static final int a(int i) {
        if (!((jb) cs.g).A) {
            for (int i_6_ = 0; i_6_ < Class_pb.i; i_6_++) {
                if (wca.c[i_6_].a(true) == 's' || wca.c[i_6_].a(true) == 'S') {
                    ((jb) cs.g).A = true;
                    break;
                }
            }
        }
        ik.l++;
        if (nw.a == lda.f) {
            Runtime runtime = Runtime.getRuntime();
            int i_7_ = (int) ((runtime.totalMemory() - runtime.freeMemory())
                    / 1024L);
            long l = us.getCurrentTime(90);
            if (dq.d == 0L)
                dq.d = l;
            if (i_7_ > 16384 && l - dq.d < 5000L) {
                if (l - Class_ue.c > 1000L) {
                    System.gc();
                    Class_ue.c = l;
                }
                return 0;
            }
        }
        if (nw.a == lda.p) {
            if (cd.y == null)
                cd.y = new jm(bl.uaa, kl.j, ja.u, IncomingPackets.k);
            if (!cd.y.a(-17427))
                return 0;
            oh.a(0, false, null);
            vt.c = !vn.j(0);
            caa.G = hq.a(false, 1, 1000000, vt.c ? 34 : 32);
            ek.l = hq.a(false, 1, 1000000, 33);
            cs.i = hq.a(false, 1, 1000000, 13);
        }
        if (nw.a == lda.q) {
            ek.l.c(28528);
            int i_8_ = GPIPlayer.pdas[33].c((byte) 89);
            i_8_ = i_8_ + GPIPlayer.pdas[vt.c ? 34 : 32].c((byte) 92);
            i_8_ += GPIPlayer.pdas[13].c((byte) 103);
            i_8_ += ek.l.a(false);
            if (i_8_ != 400)
                return i_8_ / 4;
            cda.d = caa.G.a((int) 6);
            qk.w = ek.l.a((int) 6);
            ClientScript.getFonts(caa.G);
            int i_9_ = ((jb) cs.g).z;
            lf.l = new cw(me.q, cba.languageID, ek.l);
            int[] is = lf.l.a((byte) -27, i_9_);
            hm var_hm = new hm(caa.G, cs.i);
            if (is.length > 0) {
                kg.j = new aca[is.length];
                for (int i_10_ = 0; kg.j.length > i_10_; i_10_++)
                    kg.j[i_10_] = new ol(lf.l.a((int) 89, is[i_10_]), var_hm);
            }
        }
        if (lda.r == nw.a)
            kr.a(cs.i, 126, Node.getFonts(-118), caa.G);
        if (lda.s == nw.a) {
            int i_11_ = hba.a((byte) -120);
            int i_12_ = GameText.a();
            if (i_11_ < i_12_)
                return i_11_ * 100 / i_12_;
        }
        if (nw.a == lda.t) {
            if (kg.j != null && kg.j.length > 0) {
                if (kg.j[0].b((byte) 118) < 100)
                    return 0;
                if (kg.j.length > 1 && lf.l.a((byte) -86)
                        && kg.j[1].b((byte) 113) < 100)
                    return 0;
            }
            ISAAC.a(8, lg.r);
            bn.a(lg.r, -27346);
            ei.a(1, 38);
        }
        if (lda.u == nw.a) {
            for (int i_13_ = 0; i_13_ < 4; i_13_++)
                su.a[i_13_] = cq.a(bw.v, Class_hc.e, (byte) -121);
        }
        if (nw.a == lda.v) {
            sm.a = hq.a(false, 1, 1000000, 8);
            GameOutPacket.pl = hq.a(false, 1, 1000000, 0);
            ada.pl = hq.a(false, 1, 1000000, 1);
            fu.b = hq.a(false, 1, 1000000, 2);
            ui.c = hq.a(false, 1, 1000000, 3);
            jt.e = hq.a(false, 1, 1000000, 4);
            ua.c = hq.a(true, 1, 1000000, 5);
            mq.pl = hq.a(true, 1, 1000000, 6);
            av.pl1 = hq.a(false, 1, 1000000, 7);
            ns.u = hq.a(false, 1, 1000000, 9);
            nda.c = hq.a(false, 1, 1000000, 10);
            ml.i = hq.a(false, 1, 1000000, 11);
            Class_nd.n = hq.a(false, 1, 1000000, 12);
            sr.S = hq.a(false, 1, 1000000, 14);
            ii.b = hq.a(false, 1, 1000000, 15);
            id.j = hq.a(false, 1, 1000000, 16);
            od.sb = hq.a(false, 1, 1000000, 17);
            nk.g = hq.a(false, 1, 1000000, 18);
            sh.i = hq.a(false, 1, 1000000, 19);
            kq.W = hq.a(false, 1, 1000000, 20);
            vq.l = hq.a(false, 1, 1000000, 21);
            pga.g = hq.a(false, 1, 1000000, 22);
            cf.l = hq.a(true, 1, 1000000, 23);
            tn.k = hq.a(false, 1, 1000000, 24);
            ufa.b = hq.a(false, 1, 1000000, 25);
            ia.s = hq.a(true, 1, 1000000, 26);
            Login.pl = hq.a(false, 1, 1000000, 27);
            qu.a = hq.a(true, 1, 1000000, 28);
            Animable.pl = hq.a(false, 1, 1000000, 29);
            wq.m = hq.a(true, 1, 1000000, 30);
            Class_nd.p = hq.a(true, 1, 1000000, 31);
        }
        if (nw.a == lda.w) {
            int i_14_ = 0;
            for (int i_15_ = 0; i_15_ < 35; i_15_++) {
                if (GPIPlayer.pdas[i_15_] != null)
                    i_14_ += GPIPlayer.pdas[i_15_].c((byte) 97) * gh.M[i_15_] / 100;
            }
            if (i_14_ != 100) {
                if (uj.F < 0)
                    uj.F = i_14_;
                return 100 * (i_14_ - uj.F) / (-uj.F + 100);
            }
            it.a(sm.a, -21243);
            kr.a(cs.i, 101, Node.getFonts(-89), sm.a);
        }
        if (lda.x == nw.a) {
            bq.a((byte) -120);
            ei.a(2, 104);
        }
        if (nw.a == lda.y)
            bu.a(nda.signlink, wq.m, -3550);
        if (nw.a == lda.z) {
            int i_16_ = dca.b(false);
            if (i_16_ < 100)
                return i_16_;
            Class_kf.a((byte) -107, qu.a.a((int) 109, 1));
            rg.a(qu.a.a((int) 117, 3), true);
        }
        if (nw.a == lda.A) {
            if ((ao.h ^ 0xffffffff) != 0 && !av.pl1.a(0, (byte) 109, ao.h))
                return 99;
            on.c = new cc(ia.s, ns.u, sm.a);
            jba.b = new dp(me.q, cba.languageID, fu.b);
            hs.f = new wca(me.q, cba.languageID, fu.b);
            fu.e = new qn(me.q, cba.languageID, fu.b, sm.a);
            tv.e = new Class_md(me.q, cba.languageID, od.sb);
            Class_eb.p = new cp(me.q, cba.languageID, fu.b);
            Class_ef.G = new jf(me.q, cba.languageID, fu.b);
            Class_ae.n = new PlayerUpdateLocation(me.q, cba.languageID, fu.b, av.pl1);
            vd.L = new sm(me.q, cba.languageID, fu.b);
            lr.k = new br(me.q, cba.languageID, fu.b);
            ul.k = new ek(me.q, cba.languageID, true, id.j, av.pl1);
            hq.a = new aw(me.q, cba.languageID, fu.b, sm.a);
            gda.d = new sj(me.q, cba.languageID, fu.b, sm.a);
            jm.p = new Class_lb(me.q, cba.languageID, true, nk.g, av.pl1);
            laa.itemDefLoader = new ItemDefLoader(me.q, cba.languageID, true, jba.b, sh.i, av.pl1);
            GameInPacket.d = new ih(me.q, cba.languageID, fu.b);
            Class_ef.J = new hl(me.q, cba.languageID, kq.W, GameOutPacket.pl, ada.pl);
            hi.u = new hu(me.q, cba.languageID, fu.b);
            ps.a = new nk(me.q, cba.languageID, fu.b);
            Class_ic.H = new bea(me.q, cba.languageID, vq.l, av.pl1);
            aw.m = new av(me.q, cba.languageID, fu.b);
            hu.l = new Class_hc(me.q, cba.languageID, fu.b);
            gh.R = new pt(me.q, cba.languageID, fu.b);
            bw.t = new re(me.q, cba.languageID, pga.g);
            fj.t = new Class_ad(me.q, cba.languageID, fu.b);
            ce.a(cs.i, ui.c, sm.a, av.pl1, (byte) -108);
            dt.a((byte) 30, Animable.pl);
            mj.l = new or(cba.languageID, tn.k, ufa.b);
            ul.s = new sh(cba.languageID, tn.k, ufa.b, new di());
            SpecialOutPacket.b((byte) 123);
            ul.k.a(1, !cs.g.e(on.performance, 118));
            cp.e = new dj();
            bca.showTextures((byte) 56);
            ss.a(Login.pl, (byte) 57);
            wl.a(av.pl1, on.c, -27984);
            efa var_efa = new efa(nda.c.a(62, "huffman", ""));
            uaa.a(false, var_efa);
            try {
                jagmisc.init();
            } catch (Throwable throwable) {
        /* empty */
            }
            aea.bc = in.c(15902);
        }
        if (nw.a == lda.D) {
            int i_17_ = bl.a(sm.a, 65280) + rca.a(true, (byte) -15);
            int i_18_ = dp.b(-124) + GameText.a();
            if (i_17_ < i_18_)
                return i_17_ * 100 / i_18_;
        }
        int i_19_ = 32 / ((46 - i) / 51);
        if (lda.E == nw.a)
            kca.a(cf.l, Class_eb.p, Class_ef.G, ul.k, hq.a, gda.d, cp.e);
        if (lda.F == nw.a) {
            client.strings = new String[((Class_hc) hu.l).d];
            rr.h = new int[((pt) gh.R).i];
            jm.i = new boolean[((pt) gh.R).i];
            for (int i_20_ = 0; ((pt) gh.R).i > i_20_; i_20_++) {
                if (((iga) gh.R.a((byte) -128, i_20_)).h == 0) {
                    jm.i[i_20_] = true;
                    iv.t++;
                }
                rr.h[i_20_] = -1;
            }
            Class_k.c((byte) -109);
            nh.k = ui.c.a("loginscreen", (int) 104);
            maa.g = ui.c.a("lobbyscreen", (int) 100);
            ua.c.a(false, true, (byte) 101);
            mq.pl.a(true, true, (byte) 72);
            sm.a.a(true, true, (byte) 83);
            cs.i.a(true, true, (byte) 126);
            nda.c.a(true, true, (byte) 50);
            ui.c.a(true, true, (byte) 79);
            qn.i = true;
            ((pl) fu.b).y = 2;
            ((pl) od.sb).y = 2;
            ((pl) id.j).y = 2;
            ((pl) nk.g).y = 2;
            ((pl) sh.i).y = 2;
            ((pl) kq.W).y = 2;
            ((pl) vq.l).y = 2;
        }
        if (lda.G == nw.a) {
            if (!gf.a((byte) 80, nh.k))
                return 0;
            for (int i_21_ = 0; Node_Sub.o[nh.k].length > i_21_; i_21_++) {
                Interface var_kp = Node_Sub.o[nh.k][i_21_];
                if (((Interface) var_kp).type == 5 && ((Interface) var_kp).textureID != -1)
                    var_kp.a(lg.r, -91);
            }
        }
        if (lda.H == nw.a) {
            for (int i_22_ = 0; Node_Sub.o[nh.k].length > i_22_; i_22_++) {
                Interface var_kp = Node_Sub.o[nh.k][i_22_];
                if (((Interface) var_kp).type == 5
                        && (((Interface) var_kp).textureID ^ 0xffffffff) != 0
                        && var_kp.a(lg.r, -116) == null && fo.r)
                    return 0;
            }
        }
        if (lda.I == nw.a)
            GrandExchangeItem.a(52, true);
        if (nw.a == lda.J) {
            Class_ub.W.b(24551);
            try {
                rh.o.join();
            } catch (InterruptedException interruptedexception) {
                return 0;
            }
            caa.G = null;
            Class_ub.W = null;
            rh.o = null;
            ek.l = null;
            kg.j = null;
            lf.l = null;
            ht.f(0);
            no.x = ((jb) cs.g).A;
            ((jb) cs.g).A = true;
            cs.g.a(nda.signlink, (byte) 57);
            if (no.x)
                ur.setTKVersion(0, true);
            else
                ur.setTKVersion(((jb) cs.g).tkVersion, true);
            kea.setWM(false, (byte) 126, -1, -1, ((jb) cs.g).w);
            ISAAC.a(8, lg.r);
            bn.a(lg.r, -27346);
            um.a(sm.a, lg.r, 0);
            iea.a(true, sp.s);
        }
        return fw.z(20666);
    }

    public static void b(int i) {
        n = null;
        if (i != 13834)
            enableBloom(85, false);
        o = null;
    }

    public static boolean enableBloom(int i, boolean enable) {
        d++;
        boolean bloom = lg.r.bloom();
        int i_24_ = -50 % ((39 - i) / 48);
        if (!bloom != !enable) {
            if (!enable) {
                lg.r.a();
            } else if (!lg.r.i()) {
                enable = false;
            }
            if (enable != !bloom) {
                return false;
            }
            cs.g.cb = enable;
            cs.g.a(nda.signlink, (byte) 78);
            return true;
        }
        return true;
    }

    static final qda a(int i, int i_25_, int i_26_, Class var_class) {
        vf var_vf = ol.p[i][i_25_][i_26_];
        if (var_vf == null)
            return null;
        for (ida var_ida = ((vf) var_vf).f; var_ida != null;
             var_ida = ((ida) var_ida).d) {
            qda var_qda = ((ida) var_ida).a;
            if (var_class.isAssignableFrom(var_qda.getClass())
                    && ((qda) var_qda).B == i_25_ && ((qda) var_qda).x == i_26_)
                return var_qda;
        }
        return null;
    }

    static final int a(boolean bool, boolean bool_27_, int i, int i_28_,
                       boolean bool_29_) {
        ik.i++;
        hg var_hg = el.a(bool, (byte) 68, i_28_);
        if (bool_29_ != true)
            return 86;
        if (var_hg == null)
            return 0;
        int i_30_ = 0;
        for (int i_31_ = 0; ((hg) var_hg).itemIDs.length > i_31_; i_31_++) {
            if (((hg) var_hg).itemIDs[i_31_] >= 0
                    && ((hg) var_hg).itemIDs[i_31_] < ((ItemDefLoader) laa.itemDefLoader).g) {
                ItemDef var_uv = laa.itemDefLoader.d(12388, ((hg) var_hg).itemIDs[i_31_]);
                int i_32_ = var_uv.a(i, ((vu) jba.b.a((byte) 6, i)).h, -82);
                if (bool_27_)
                    i_30_ += i_32_ * ((hg) var_hg).amounts[i_31_];
                else
                    i_30_ += i_32_;
            }
        }
        return i_30_;
    }

    ik(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_,
       int i_39_, int i_40_, boolean bool, boolean bool_41_, int i_42_) {
        ((ik) this).g = i_34_;
        ((ik) this).c = (byte) i_40_;
        ((ik) this).f = (short) i_37_;
        ((ik) this).b = i;
        ((ik) this).h = i_42_;
        ((ik) this).m = (short) i_36_;
        ((ik) this).e = (short) i_38_;
        ((ik) this).k = i_33_;
        ((ik) this).p = i_35_;
        ((ik) this).j = bool_41_;
    }
}
