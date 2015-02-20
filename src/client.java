/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

import jagex3.jagmisc.jagmisc;

public final class client extends bga {
	
	private static final long serialVersionUID = -5816648416709288733L;
	
	static int B;
	static int X;
	static int Y;
	static int Z;
	static int ab;
	static int bb;
	static int cb;
	static int db;
	static int eb;
	static int fb;
	static baa gb = new baa(1, 2, 2, 0);
	static int hb;
	static int ib;
	static float jb;
	static int kb;
	static int lb;
	static int mb;
	static int nb;
	static String[] ob;
	static int pb;
	static int qb;
	/* synthetic */static Class client;
	public static boolean sb;

	public static final void a() {
		for (int i = 0; i < Class_hc.e; i++) {
			int[] buf = gi.k[i];
			for (int index = 0; index < bw.v; index++) {
				buf[index] = 0;
			}
		}
	}

	private void h(/*int i*/) {
		hb++;
		/*if (height > -32) {
			gb = null;
		}*/
		if (hm.h != 14) {
			pm.currentTimedTicks++;
			if (pm.currentTimedTicks % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				uda.seed = (600 * gregoriancalendar.get(11) + 10 * gregoriancalendar.get(12) + gregoriancalendar.get(13) / 6);
				Class_wb.random.setSeed((long) uda.seed);
			}
			if (pm.currentTimedTicks % 50 == 0) {
				qh.s = ka.b;
				ka.b = 0;
				jv.r = ga.J;
				ga.J = 0;
			}
			b(true);
			if (cd.y != null) {
				cd.y.b(-18366);
			}
			saa.b(0);
			uc.c.a((byte) 32);
			Class_md.e.c(false);
			if (lg.r != null) {
				lg.r.a((int) us.a(91));
			}
			rv.b(false);
			ar.Q = 0;
			Class_pb.i = 0;
			for (au au = uc.c.d((byte) -102); au != null; au = uc.c.d((byte) -111)) {
				int j = au.b(-15194);
				if (j != 2 && j != 3) {
					if (j == 0 && ar.Q < 75) {
						je.g[ar.Q] = au;
						ar.Q++;
					}
				} else {
					char c = au.a(true);
					if (!gd.a(18403) || c != '`' && c != '\u00a7' && c != '\u00b2') {
						if (Class_pb.i < 128) {
							wca.c[Class_pb.i] = au;
							Class_pb.i++;
						}
					} else if (!rh.c(-8908)) {
                        mv.a(true);
                    } else {
                        cda.a(-4);
                    }
				}
			}
			fm.b = 0;
			for (ew ew = Class_md.e.a(true); ew != null; ew = Class_md.e.a(true)) {
				int j = ew.b(false);
				if ((~j) != 0) {
					if (j != 6) {
						if (tl.a(j, 540800)) {
							qt.F.b(ew, (byte) 93);
							if (qt.F.b(-101) > 10) {
                                qt.F.a(true);
                            }
						}
					} else {
                        fm.b += ew.c(122);
                    }
				} else {
                    eda.i.b(ew, (byte) 93);
                }
			}
			if (rh.c(-8908)) {
                mda.a(true);
            }
			if (dn.a(34, hm.h)) {
				jf.e(-1);
				te.a(true);
			} else if (ml.a((byte) 22, hm.h)) {
                qw.b(4);
            }
			if (gs.b(hm.h, 0) && !ml.a((byte) 22, hm.h)) {
				k(94);
				faa.a(124);
                System.out.println("First login call");
				Login.processLogin(108);
			} else if (pga.a(-66, hm.h) && !ml.a((byte) 22, hm.h)) {
				k(109);
                System.out.println("Second login call");
				Login.processLogin(26);
			} else if (hm.h != 12) {
				if (!bc.a(hm.h, (byte) -62) || ml.a((byte) 22, hm.h)) {
					if (hm.h == 13) {
                        System.out.println("Third login call");
						Login.processLogin(-100);
						if (br.l != -3 && br.l != 2 && br.l != 15) {
                            System.out.println("Logout");
                            la.logout((byte) 45, false);
                        }
					}
				} else {
                    pda.f(8);
                }
			} else {
                System.out.println("fourth login call");
                Login.processLogin(73);
            }
			eca.a((byte) -4, lg.r);
			qt.F.a(true);
		}
	}

	public final synchronized void c(byte b) {
		X++;
		if (vj.applet != null && ru.canvas == null && !nda.signlink.e) {
			try {
				Class class_ = vj.applet.getClass();
				Field canvas = class_.getDeclaredField("canvas");
				ru.canvas = (Canvas) canvas.get(vj.applet);
				canvas.set(vj.applet, null);
				if (ru.canvas != null) {
                    return;
                }
			} catch (Exception exception) {
				/* empty */
			}
		}
		super.c((byte) 44);
		if (b <= 20) {
            nullContainer(-10);
        }
	}

	public final void nullContainer(int i) {
		cb++;
		nullLoader();
		qe.a(-26);
		sf.a(true);
		qba.a(false);
		GameText.b(i + 19);
		ou.b((byte) -123);
		of.b(true);
		mr.a((byte) 127);
		fba.c(i - 30);
		uda.a(87);
		cd.a(i + 9933);
		pp.b(-126);
		Node.d(i ^ ~0x1bfb);
		je.a((byte) 69);
		il.a(120);
		bc.a(0);
		wl.a(-19211);
		pk.a((byte) 91);
		Class_rf.a((byte) 127);
		Class_q.a(-121);
		Class_r.e(i - 33);
		dg.b((byte) 5);
		on.a((byte) -107);
		Class_ae.a((byte) 122);
		Connection.nullLoader(0);
		th.b((byte) 96);
		jm.c(242);
		pda.e(i ^ ~0xfc6);
		pl.d(0);
		cv.b(i - 5746);
		lf.a(i - 27);
		tb.b((byte) 126);
		wca.a((byte) 116);
		qn.c((byte) 6);
		Class_md.a(false);
		cp.b(486539008);
		sm.a(1403);
		br.a(-1);
		ek.a(i ^ 0x1e);
		aw.a(75);
		sj.c(29);
		Class_lb.b((byte) -45);
		ItemDefLoader.f(-11);
		dp.a((byte) -68);
		ih.a((byte) -120);
		hu.a((byte) 12);
		nk.a(i ^ 0x1);
		bea.a(i ^ ~0x76);
		av.a(i ^ 0x6a);
		Class_hc.a(false);
		pt.a((byte) -109);
		re.a((byte) 62);
		Class_ad.c(16);
		or.a((byte) -106);
		sh.a(4664);
		fm.b(14828);
		ISAAC.c(-128);
		LoginStream.y(28554);
		GameInPacket.nullLoader();
		maa.a(125);
		wd.a((byte) 20);
		gl.b(i ^ ~0xe);
		rn.a(0);
		tw.a(0);
		fca.e(i - 13228);
		Interface.b(-1);
		ro.a(0);
		Player.c(false);
		tda.a(false);
		iaa.a(-26323);
		GrandExchangeItem.b(7);
		BytesParser.resetMaxLevels((byte) -114);
		tba.a(105);
		vf.a(i ^ ~0x46);
		fh.a((byte) 108);
		fn.a(-117);
		NPC.l(i + 18955);
		sp.b((byte) 77);
		ps.a(i + 32644);
		ee.a(19714);
		Class_b.a((byte) 66);
		Interactable.nullLoader((byte) 112);
		um.b(-116);
		Class_wb.a(false);
		us.b(-28376);
		WorldSub.e(6750);
		gf.a(112);
		World.a((byte) -79);
		sea.a(0);
		mba.a(false);
		dh.a((byte) 94);
		nf.a(11216);
		fk.a(true);
		PlayerDef.a(0);
		wa.a(0);
		dr.a((byte) -89);
		an.a((byte) 19);
		da.a(-1);
		vr.a((byte) -119);
		Class_mc.a(i ^ ~0x64);
		jt.a((byte) 71);
		sg.a(i ^ 0x11f);
		ObjectDef.a(62);
		eg.a((byte) 80);
		kj.a((byte) -74);
		Class_i.a((byte) 113);
		NPCDef.b(-104);
		la.a(3);
		uo.a((byte) 50);
		ua.a(i ^ 0x54);
		Class_e.a(false);
		sa.a((byte) 109);
		ir.a(95);
		gga.c(i ^ 0x7b);
		pg.a((byte) 57);
		dt.b((byte) 63);
		ah.a((byte) -91);
		ui.a(124);
		vt.a(false);
		fg.a(-24012);
		nda.a((byte) 70);
		lda.a((byte) 83);
		cj.a((byte) 123);
		tp.a((byte) 87);
		bn.a((byte) -47);
		cc.b(true);
		efa.a((byte) -42);
		kc.a(2);
		vea.a(true);
		uh.a(56);
		hm.b(22050);
		di.a((byte) -83);
		cw.b(-97);
		iga.a(81);
		kca.e();
		jba.a((byte) 34);
		hn.a(i - 134);
		dq.a((byte) -43);
		pj.a((byte) -71);
		cba.a((byte) -17);
		tu.a(-29159);
		dv.a((byte) 97);
		rc.a(0);
		Animable.nullLoader(32064);
		og.a(-118);
		sd.b(-8862);
		Class_kd.a(-11808);
		tq.e();
		cg.a(i - 1419);
		pga.a(-26723);
		ds.a(i - 27749);
		qm.a(126);
		ur.b((byte) 127);
		dca.a(true);
		ClientScriptHandler.nullLoader();
		cea.a((byte) 28);
		ufa.b(0);
		Class_vb.a(17391);
		oj.c();
		SpecialOutPacket.a(0);
		tj.a(-1743);
		oe.a(95);
		ClientScript.nullLoader();
		qfa.a((byte) 89);
		it.a(false);
		ft.c((byte) -93);
		oga.a(0);
		qd.b(-18);
		dda.a(i + 25829);
		dfa.j((byte) -72);
		wr.a(0);
		lca.h(35);
		ida.a(false);
		ha.a(i - 29);
		raa.b();
		hi.a((byte) -103);
		qg.a(i - 29);
		lw.a((byte) -32);
		jj.a(18354);
		gw.a();
		GameOutPacket.nullLoader(27598);
		Class_ag.a(0);
		aaa.a(-91);
		iv.a(-124);
		dea.a(i ^ 0x401f);
		hg.a(i ^ ~0x4b);
		bg.a(-109);
		ql.b(103);
		go.a();
		GPIPlayer.nullLoader(true);
		Class_nd.a(2650);
		ng.b(i - 29);
		gda.a(4833);
		Class_qb.a((byte) 17);
		hga.a((byte) 74);
		wi.a(0);
		vu.a(false);
		ru.a(i ^ ~0x18);
		tv.a(2);
		dba.a(i ^ 0xffffe0);
		df.a((byte) 89);
		bh.b((byte) 127);
		ce.a(false);
		vj.a(0);
		aj.a(i ^ ~0x6c0b);
		lh.a((byte) -67);
		hq.a(125);
		sc.a(-16044);
		uca.a(3);
		vh.a((byte) -112);
		faa.a((byte) 64);
		sca.a(-108);
		ej.a(i - 31);
		bi.b((byte) 122);
		od.a(0);
		sba.a((byte) -123);
		kr.b(6407);
		uj.a(-74);
		baa.a((byte) 120);
		pw.a(i ^ 0x50);
		to.a(23460);
		ip.a(true);
		Class_ug.b(true);
		rea.a((byte) 66);
		jfa.j(i ^ 0x1e);
		qaa.j(-80);
		hea.a(1);
		pfa.a((byte) 113);
		ia.c((byte) 118);
		nh.a(65536);
		ol.b(8);
		aea.e(i ^ ~0xf4);
		tl.a((byte) 116);
		mk.a(false);
		tm.b(67);
		js.a((byte) 62);
		jq.a((byte) -115);
		kk.b(-117);
		qga.b(i ^ 0x6c);
		bw.a(false);
		nn.c(i ^ ~0x1f);
		Class_is.b((byte) -115);
		ka.b((byte) -120);
		hp.b((byte) 121);
		ss.b(-1);
		qt.b((byte) -94);
		hv.a(i - 31);
		kea.a(0);
		ii.a(true);
		qc.a((byte) -109);
		dm.a(false);
		dc.a(false);
		wj.b(-69);
		id.a((byte) 70);
		ko.b((byte) 78);
		eea.a();
		li.c((byte) 124);
		Class_ue.b(0);
		fi.a((byte) 109);
		as.c((byte) -126);
		fr.a((byte) -110);
		vd.j(265391564);
		Class_ub.k((byte) 123);
		Class_mb.i((byte) -27);
		Class_jc.b(true);
		ifa.a(true);
		kga.i((byte) 111);
		GameInPacketHandler.a(false);
		aa.a(i - 31);
		he.d(15223);
		sw.a(-1);
		Login.nullLoader(-5);
		nr.b(-1);
		si.d();
		ul.a(-1335466206);
		wn.a();
		jaa.a();
		Class_kb.a(16383);
		mu.a(125);
		be.e();
		er.a((byte) -42);
		mca.nullLoader(0);
		po.b(20285);
		kv.b(9179);
		rr.b(-2526);
		n.b(i ^ i);
		cs.a(true);
		qs.b(-126);
		rba.b(14793);
		al.c(2);
		ll.c((byte) -83);
		lp.c(100);
		te.e(-99);
		vs.e(2);
		lr.a(false);
		naa.c((byte) -73);
		ega.a(2048);
		em.a(5);
		gp.a();
		gfa.d((byte) 80);
		hba.a(i ^ ~0x60);
		kl.a((byte) 58);
		lg.a(-20968);
		mm.a((byte) -113);
		fp.a((byte) 7);
		gr.a(12531);
		wu.a(i - 3158);
		mp.c((byte) -100);
		td.b(i + 2147483616);
		oca.a(-5518);
		at.i(27843);
		kg.b((byte) -128);
		qu.a(false);
		vc.a(80);
		Class_jg.a(false);
		io.i(-28916);
		gca.a(-90);
		rd.a((byte) 115);
		lfa.a((byte) 123);
		taa.a((byte) -91);
		kfa.a((byte) -19);
		dk.a((byte) -16);
		bf.b((byte) -40);
		su.a(-1);
		Class_db.c(3790);
		pm.c((byte) -96);
		bm.a(-23124);
		ar.e(i - 31);
		vaa.d(15426);
		gv.a(-12191);
		fw.A(i ^ 0x3d80);
		en.i(0);
		jv.a(true);
		bt.a(i ^ 0x49fd);
		bd.a(110);
		mga.e(-3);
		sfa.a(-101);
		ki.a(90);
		nw.a(i ^ ~0x56);
		cl.a((byte) 61);
		Class_j.a(i ^ 0x1f);
		tfa.a(-98);
		mq.a(i ^ 0x1f);
		ja.c((byte) 117);
		baa.a((byte) 119);
		rca.b(0);
		eda.a(120);
		lt.a((byte) -69);
		lm.x((byte) 88);
		caa.f(-108);
		om.a();
		wh.c((byte) -58);
		dd.c((byte) 55);
		ck.i(0);
		oea.c((byte) -105);
		ofa.a(true);
		ea.i(26);
		kq.i(-49);
		Class_u.i(1);
		sr.i(-5300);
		Class_pf.i(-120);
		Class_ic.i(0);
		uq.a(false);
		pc.j(i - 142);
		Class_k.i(-119);
		op.a(true);
		gh.i(1393315076);
		gu.a(false);
		cm.a(false);
		hk.nullLoader(-82);
		ada.i(0);
		Class_rb.c((byte) 16);
		ffa.c((byte) -42);
		Class_lc.c((byte) 107);
		ge.i(0);
		wg.i(95);
		ut.c((byte) -49);
		ow.c((byte) -121);
		vn.d((byte) -23);
		sv.i(-1024);
		nt.a((byte) 119);
		jca.a();
		rw.o();
		nu.b(i - 4826);
		mh.a(0);
		ff.a((byte) 110);
		Class_fd.a((byte) 106);
		oba.j(i + 88);
		ba.a(1000);
		iu.b(1);
		wk.c(1);
		dga.b(1135849320);
		laa.a(true);
		gba.d(-1);
		pca.i(17519);
		qh.k(1);
		uc.c((byte) -120);
		un.e((byte) -20);
		ik.b(13834);
		rda.b(-90);
		vg.a(false);
		ns.a(-40);
		fj.d((byte) 120);
		hj.a((byte) -106);
		Class_fb.c(1);
		Class_ef.j(0);
		rh.a(false);
		Class_eb.c(i - 31);
		nq.d(-106);
		pv.c(127);
		bu.d(-110);
		in.d(30987);
		wf.b(true);
		lu.d((byte) -109);
		jr.d(i ^ 0x201d);
		gs.d(3317);
		jga.d((byte) 126);
		eo.b(i + 5464);
		vv.d((byte) -74);
		gi.d((byte) 3);
		de.a(i ^ 0x7d47);
		qea.a((byte) 125);
		mv.a((byte) 121);
		Class_ob.b(0);
		oh.a(i - 158);
		mfa.b(28163);
		ok.b((byte) -117);
		ji.a((byte) 126);
		vq.b(115);
		fo.a(1);
		ao.a((byte) -114);
		daa.b(i - 30);
		bl.a(-108);
		tea.a(false);
		rv.b((byte) -1);
		vo.b(true);
		ti.f(118);
		oi.f(i + 5);
		jn.f(i + 92);
		kw.f(6);
		Class_g.d((byte) -9);
		im.d((byte) -122);
		kba.d(0);
		Class_ab.a(-11521);
		uk.a(120);
		tg.g(3317);
		fu.d(-865);
		eq.a((byte) -80);
		mw.d((byte) -20);
		ml.a((byte) -92);
		ht.g(-103);
		pr.b(false);
		dl.a(32165);
		ku.b(-1);
		os.a(false);
		nfa.a(0);
		kaa.a((byte) 68);
		vk.b(-1);
		mg.a(true);
		nj.b(0);
		lk.a(1201566057);
		cga.a(1);
		ln.a(true);
		qca.a(false);
		Class_cb.a(i + 65504);
		rk.a((byte) 43);
		ud.b((byte) 68);
		ew.b(54);
		bq.a(i - 12451);
		uu.a(i ^ 0x65);
		na.a(-252896726);
		pi.b(i ^ 0xe0);
		bfa.b((byte) 29);
		wq.a((byte) -104);
		cf.a(-102);
		me.i(4);
		mo.a((byte) 114);
		ak.b((byte) -127);
		gea.d(0);
		tn.a(i - 142);
		cca.a(i - 12933);
		hs.a(false);
		jk.a(i - 15);
		pu.a(true);
		sk.b((byte) 99);
		tf.a(-111);
		eh.a((byte) -112);
		iq.b(false);
		ke.e((byte) 127);
		ws.e(i - 128);
		gm.a(false);
		ho.a((byte) 9);
		Class_fc.a((byte) 122);
		uf.a(99);
		Class_pb.a((byte) -70);
		uba.a(i ^ ~0x443c);
		mj.a(-9);
		Class_pd.b((byte) -78);
		gn.e((byte) 40);
		up.d((byte) 104);
		if (bga.I)
			sb = true;
	}

	public static final void main(String[] strings) {
		B++;
		try {
			if (strings.length != 6) {
				dn.a(-2747, "Argument count");
			}
			kfa.world = new World();
			kfa.world.worldID = Integer.parseInt(strings[0]);
			cf.world = new World();
			cf.world.worldID = Integer.parseInt(strings[1]);
			Class_eb.world = new World();
			Class_eb.world.worldID = Integer.parseInt(strings[2]);
			hs.modeWhere = vea.a;
			if (!strings[3].equals("live")) {
				if (strings[3].equals("rc")) {
					gv.modeWhat = GameOutPacket.wl;
				} else if (!strings[3].equals("wip")) {
					dn.a(-2747, "modewhat");
				} else {
					gv.modeWhat = wd.b;
				}
			} else {
				gv.modeWhat = ft.s;
			}
			cba.languageID = lda.a(2, strings[4]);
			if ((cba.languageID ^ 0xffffffff) == 0) {
				if (!strings[4].equals("english")) {
					if (!strings[4].equals("german")) {
						dn.a(-2747, "language");
					} else {
						cba.languageID = 1;
					}
				} else {
					cba.languageID = 0;
				}
			}
			GameInPacket.l = false;
			dm.d = false;
			if (!strings[5].equals("game0")) {
				if (strings[5].equals("game1")) {
					me.q = Class_pf.O;
				} else {
					dn.a(-2747, "game");
				}
			} else { 
				me.q = wa.t;
			}
			ea.thisCountry = 0;
			Class_rf.f = false;
			Class_gb.h = ll.t = true;
			ak.userFlow = 0L;
			cd.worldFlags = 0;
			br.additionalInfo = null;
			ce.bb = false;
			ow.settings = "";
			jr.colourId = me.q.h;
			hl.affId = 0;
			uo.ssKey = null;
			client client = new client();
			po.c = client;
			client.a(true, 768, 621, false, 1024, gv.modeWhat.a((byte) -114) + 32, 35, me.q.g);
			ws.J.setLocation(40, 40);
		} catch (Exception exception) {
			cea.a(null, -2, exception);
		}
	}

	public static void b() {
		int inScreenPlayers = oca.inScreenPlayers;
		int[] inScreenPlayerIDs = vd.inScreenPlayerIDs;
		boolean bool = cs.g.q == 1 && inScreenPlayers > 200 || cs.g.q == 0 && inScreenPlayers > 50;
		for (int i = 0; i < inScreenPlayers; i++) {
			Player player = Class_fc.playersInScreen[inScreenPlayerIDs[i]];
			if (!player.l(-28)) {
                player.Kb = -1;
            } else {
				player.h(0);
				if (player.B < 0 || player.x < 0 || player.I >= Class_hc.e || player.y >= bw.v) {
                    player.Kb = -1;
                } else {
					player.Ld = player.V && bool;
					if (player == up.thisPlayer) {
                        player.Kb = 2147483647;
                    } else {
						int j = 0;
						if (!player.gb) {
                            j++;
                        }
						if (player.hitRemovalTime > pm.currentTimedTicks) {
                            j += 2;
                        }
						j += 5 - player.i(-1) << 2;
						if (player.cd) {
                            j += 512;
                        } else {
							if (vs.r == 0) {
                                j += 32;
                            } else {
                                j += 128;
                            }
							j += 256;
						}
						player.Kb = j + 1;
					}
				}
			}
		}
		for (int i = 0; i < ps.npcCount; i++) {
			NPC npc = ((NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[i])).l;
			if (!npc.m(-117) || !npc.npcDef.a((byte) -33, cp.e)) {
                npc.Kb = -1;
            } else {
				npc.h(0);
				if (npc.B < 0 || npc.x < 0 || npc.I >= Class_hc.e || npc.y >= bw.v) {
                    npc.Kb = -1;
                } else {
					int j = 0;
					if (!npc.gb) {
                        j++;
                    }
					if (npc.hitRemovalTime > pm.currentTimedTicks) {
                        j += 2;
                    }
					j += 5 - npc.i(-1) << 2;
					if (vs.r == 0) {
						if (npc.npcDef.ub) {
                            j += 64;
                        } else {
                            j += 128;
                        }
					} else if (vs.r == 1) {
						if (npc.npcDef.ub) {
                            j += 32;
                        } else {
                            j += 64;
                        }
					}
					if (npc.npcDef.q) {
                        j += 1024;
                    } else if (!npc.npcDef.N) {
                        j += 256;
                    }
					npc.Kb = j + 1;
				}
			}
		}
		for (int i = 0; i < Class_fb.j.length; i++) {
			on on = Class_fb.j[i];
			if (on != null) {
				if (on.a == 1) {
					NPCNode npcNode = (NPCNode) uo.a.a(-32748, (long) on.e);
					if (npcNode != null) {
						NPC npc = npcNode.l;
						if (npc.Kb >= 0) {
                            npc.Kb += 2048;
                        }
					}
				} else if (on.a == 10) {
					Player player = Class_fc.playersInScreen[on.e];
					if (player != null && player != up.thisPlayer && player.Kb >= 0) {
                        player.Kb += 2048;
                    }
				}
			}
		}
	}

	public static void i(int height) {
		int inScreenPlayers = oca.inScreenPlayers;
		int[] inScreenPlayerIDs = vd.inScreenPlayerIDs;
		int count = qm.f ? inScreenPlayers : inScreenPlayers + ps.npcCount;
		for (int index = 0; index < count; index++) {
			Entity entity;
			if (index < inScreenPlayers) {
                entity = Class_fc.playersInScreen[inScreenPlayerIDs[index]];
            } else {
                entity = ((NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[index - inScreenPlayers])).l;
            }
			if (entity.height == height) {
				entity.jc = 0;
				if (entity.Kb < 0) {
                    entity.gb = false;
                } else {
					int i = entity.i(-1);
					if ((i & 0x1) == 0) {
						if ((entity.locX & 0x1ff) != 0 || (entity.locY & 0x1ff) != 0) {
							entity.gb = false;
							continue;
						}
					} else if ((entity.locX & 0x1ff) != 256 || (entity.locY & 0x1ff) != 256) {
						entity.gb = false;
						continue;
					}
					if (i == 1) {
						int regionX = entity.locX >> 9;
						int regionY = entity.locY >> 9;
						if (entity.Kb != gi.k[regionX][regionY]) {
							entity.gb = true;
							continue;
						}
						if (GameInPacket.c[regionX][regionY] > 1) {
							GameInPacket.c[regionX][regionY]--;
							entity.gb = true;
							continue;
						}
					} else {
						int j = (i - 1) * 256 + 252;
						int x_ = entity.locX - j >> 9;
						int y_ = entity.locY - j >> 9;
						int x_1 = entity.locX + j >> 9;
						int y_1 = entity.locY + j >> 9;
						if (!Class_nb.a(x_1, x_, y_, entity.Kb, y_1, (byte) -88)) {
							for (int x = x_; x <= x_1; x++) {
								for (int y = y_; y <= y_1; y++) {
									if (entity.Kb == gi.k[x][y]) {
                                        GameInPacket.c[x][y]--;
                                    }
								}
							}
							entity.gb = true;
							continue;
						}
					}
					entity.gb = false;
					entity.j = Class_u.b(entity.locX, entity.height, -20214, entity.locY);
					to.a(entity, true);
				}
			}
		}
	}

	public static Interface a(Interface interface_) {
		int i = c(interface_).b(false);
		if (i == 0) {
            return null;
        }
		for (int index = 0; index < i; index++) {
			interface_ = efa.a(-1018745488, interface_.parentID);
			if (interface_ == null) {
                return null;
            }
		}
		return interface_;
	}

	@SuppressWarnings("RedundantIfStatement")
    public static void a(Interface[] interfaces, int i, int j, int k, int i1, int j1, int k1, int i2, int j2, int k2) {
        for (Interface interface_ : interfaces) {
            if (interface_ != null && interface_.parentID == i) {
                int x = interface_.locX + k1;
                int y = interface_.locY + i2;
                int i3;
                int j3;
                int k3;
                int i4;
                if (interface_.type == 2) {
                    i3 = j;
                    j3 = k;
                    k3 = i1;
                    i4 = j1;
                } else {
                    int xScroll = x + interface_.minHScroll;
                    int yScroll = y + interface_.minVScroll;
                    if (interface_.type == 9) {
                        xScroll++;
                        yScroll++;
                    }
                    i3 = x > j ? x : j;
                    j3 = y > k ? y : k;
                    k3 = xScroll < i1 ? xScroll : i1;
                    i4 = yScroll < j1 ? yScroll : j1;
                }
                if (interface_.type != 0 && !interface_.Kb && c(interface_).l == 0 && interface_ != rca.e && interface_.v != tm.o
                        && interface_.v != ll.r) {
                    if (i3 < k3 && j3 < i4) {
                        te.a(18259, interface_);
                    }
                } else if (!isHidden(interface_)) {
                    if (interface_ == kr.a && ee.a(74, kr.a) != null) {
                        bm.h = true;
                        hga.x = x;
                        il.y = y;
                    }
                    if (interface_.Ic || i3 < k3 && j3 < i4) {
                        if (interface_.vc && j2 >= i3 && k2 >= j3 && j2 < k3 && k2 < i4) {
                            for (ClientScript clientScript = (ClientScript) to.b.a(93); clientScript != null;
                                 clientScript = (ClientScript) to.b.b((byte) 113)) {
                                if (clientScript.s) {
                                    clientScript.unlink(-101);
                                    clientScript.interface_.ic = false;
                                }
                            }
                            if (ada.H == 0) {
                                kr.a = null;
                                rca.e = null;
                            }
                            bg.e = 0;
                            of.f = false;
                            gd.e = false;
                            if (!gea.n) {
                                uk.a((byte) 91);
                            }
                        }
                        boolean bool;
                        if (Class_md.e.d(2000) >= i3 && Class_md.e.b(99) >= j3 && Class_md.e.d(2000) < k3 && Class_md.e.b(104) < i4) {
                            bool = true;
                        } else {
                            bool = false;
                        }
                        if (!ba.c && bool) {
                            if (interface_.Mc >= 0) {
                                da.e = interface_.Mc;
                            } else if (interface_.vc) {
                                da.e = -1;
                            }
                        }
                        if (!gea.n && j2 >= i3 && k2 >= j3 && j2 < k3 && k2 < i4) {
                            sm.a(interface_, -16452, j2 - x, k2 - y);
                        }
                        boolean bool1 = false;
                        if (Class_md.e.f(-30249) && bool) {
                            bool1 = true;
                        }
                        boolean bool2 = false;
                        ew ew = (ew) qt.F.a(109);
                        if (ew != null && ew.b(false) == 0 && ew.a(9) >= i3 && ew.a(true) >= j3 && ew.a(9) < k3 && ew.a(true) < i4) {
                            bool2 = true;
                        }
                        if (interface_.ub != null && !rh.c(-8908)) {
                            for (int index = 0; index < interface_.ub.length; index++) {
                                if (!uc.c.a((byte) -68, (int) interface_.ub[index])) {
                                    if (interface_.m != null) {
                                        interface_.m[index] = 0;
                                    }
                                } else if (interface_.m == null || pm.currentTimedTicks >= interface_.m[index]) {
                                    byte b = interface_.Nc[index];
                                    if (b == 0 || (((b & 0x8) == 0 || (!uc.c.a((byte) -68, 86) && !uc.c.a((byte) -68, 82)
                                            && !uc.c.a((byte) -68, 81))) && ((b & 0x2) == 0 || uc.c.a((byte) -68, 86))
                                            && ((b & 0x1) == 0 || uc.c.a((byte) -68, 82)) && ((b & 0x4) == 0 || uc.c.a((byte) -68, 81)))) {
                                        if (index < 10) {
                                            cda.a(-1, 18365, index + 1, "", interface_.interfaceID);
                                        } else if (index == 10) {
                                            vo.c((byte) 31);
                                            nm nm = c(interface_);
                                            ega.a(0, interface_, nm.a(-1035661311), nm.q);
                                            Class_kd.b = tg.a(interface_, (byte) -111);
                                            if (Class_kd.b == null) {
                                                Class_kd.b = "Null";
                                            }
                                            Class_ag.k = (interface_.itemName + "<col=ffffff>");
                                        }
                                        int k4 = interface_.tc[index];
                                        if (interface_.m == null) {
                                            interface_.m = (new int[interface_.ub.length]);
                                        }
                                        if (k4 != 0) {
                                            interface_.m[index] = pm.currentTimedTicks + k4;
                                        } else {
                                            interface_.m[index] = 2147483647;
                                        }
                                    }
                                }
                            }
                        }
                        if (bool2) {
                            wf.a(ew.a(9) - x, (byte) -102, interface_, ew.a(true) - y);
                        }
                        if (kr.a != null && kr.a != interface_ && bool && c(interface_).b(-122)) {
                            bw.u = interface_;
                        }
                        if (interface_ == rca.e) {
                            wd.f = true;
                            pv.x_ = x;
                            ur.y_ = y;
                        }
                        if (interface_.Kb || interface_.v != 0) {
                            if (bool && fm.b != 0 && interface_.T != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.s = true;
                                clientScript.interface_ = interface_;
                                clientScript.p = fm.b;
                                clientScript.objects = interface_.T;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (kr.a != null || gea.n || interface_.v != Class_jg.O && bg.e > 0) {
                                bool2 = false;
                                bool1 = false;
                                bool = false;
                            }
                            if (interface_.v != 0) {
                                if (interface_.v == lp.f || interface_.v == sm.i) {
                                    tj.h = interface_;
                                    if (Connection.tw != null) {
                                        Connection.tw.a((byte) -113, interface_.minVScroll, lg.r);
                                    }
                                    if (interface_.v == lp.f) {
                                        if (!gea.n && j2 >= i3 && k2 >= j3 && j2 < k3 && k2 < i4) {
                                            maa.a(j2, lg.r, (byte) -39, k2);
                                            for (ej ej = (ej) NPCDef.g.b((byte) 97); ej != null; ej = ((ej) NPCDef.g.a((byte) -106))) {
                                                if (j2 >= ej.n && j2 < ej.g && k2 >= ej.h && (k2 < ej.m)) {
                                                    uk.a((byte) 91);
                                                    rc.a(ej.k, false);
                                                }
                                            }
                                        }
                                        eh.a(y, x, interface_, 17274);
                                        continue;
                                    }
                                }
                                if (interface_.v == tm.o) {
                                    if (interface_.a((byte) 125, lg.r) != null && (qaa.T == 0 || qaa.T == 3) && !gea.n && j2 >= i3
                                            && k2 >= j3 && j2 < k3 && k2 < i4) {
                                        int x_ = j2 - x;
                                        int y_ = k2 - y;
                                        int i5 = interface_.pc[y_];
                                        if (x_ >= i5 && x_ <= i5 + (interface_.Jc[y_])) {
                                            x_ -= interface_.minHScroll / 2;
                                            y_ -= interface_.minVScroll / 2;
                                            int j5;
                                            if (ll.x == 4) {
                                                j5 = (int) qw.n & 0x3fff;
                                            } else {
                                                j5 = ((int) qw.n + pt.b & 0x3fff);
                                            }
                                            int k5 = GameInPacket.h[j5];
                                            int i7 = GameInPacket.i[j5];
                                            if (ll.x != 4) {
                                                k5 = (k5 * (vd.N + 256) >> 8);
                                                i7 = (i7 * (vd.N + 256) >> 8);
                                            }
                                            int j7 = ((y_ * k5 + x_ * i7) >> 14);
                                            int k7 = ((y_ * i7 - x_ * k5) >> 14);
                                            int i8;
                                            int j8;
                                            if (ll.x == 4) {
                                                i8 = (fu.a >> 9) + (j7 >> 2);
                                                j8 = (qg.j >> 9) - (k7 >> 2);
                                            } else {
                                                int k8 = (up.thisPlayer.i(-1) - 1) * 256;
                                                i8 = (up.thisPlayer.locX - k8 >> 9) + (j7 >> 2);
                                                j8 = (up.thisPlayer.locY - k8 >> 9) - (k7 >> 2);
                                            }
                                            if (ba.c && (Class_jc.db & 0x40) != 0) {
                                                Interface interface_1 = ida.a(tm.t, qda.G, (byte) 110);
                                                if (interface_1 != null) {
                                                    lea.setClickMenuOption(i8, false, j8, interface_.itemID, true, uk.d, 30, 1L, " ->", 30, Class_kd.b);
                                                } else {
                                                    vo.c((byte) 31);
                                                }
                                            } else {
                                                if (me.q == Class_pf.O) {
                                                    lea.setClickMenuOption(i8, false, j8, -1, true, -1, -56, 1L, "", 21,
                                                            GameText.faceHereText.getString((byte) -64, cba.languageID));
                                                }
                                                lea.setClickMenuOption(i8, false, j8, -1, true, it.K, 126, 1L, "", 10, lw.e);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (interface_.v == Class_jg.O) {
                                    nr.b = interface_;
                                    if (bool) {
                                        of.f = true;
                                    }
                                    if (bool2) {
                                        int k5 = (int) ((double) (ew.a(9) - x - (interface_.minHScroll) / 2) * 2.0 / (double) kca.m);
                                        int i6 = (int) -((double) (ew.a(true) - y - (interface_.minVScroll / 2)) * 2.0 / (double) kca.m);
                                        int j6 = ut.I + k5 + kca.F;
                                        int k6 = cv.d + i6 + kca.E;
                                        eaa eaa = naa.e((byte) 103);
                                        if (eaa != null) {
                                            int[] buf = new int[3];
                                            eaa.a(k6, j6, buf, (byte) -127);
                                            if (buf != null) {
                                                if (uc.c.a((byte) -68, 82) && hv.thisPlayersRights > 0) {
                                                    mca.teleport(1024908230, buf[0], buf[2], buf[1]);
                                                    continue;
                                                }
                                                gd.e = true;
                                                cp.height = buf[0];
                                                dv.x = buf[1];
                                                op.y_ = buf[2];
                                            }
                                            bg.e = 1;
                                            sv.S = false;
                                            pea.c = Class_md.e.d(2000);
                                            mm.q = Class_md.e.b(114);
                                        }
                                    } else if (bool1 && bg.e > 0) {
                                        if (bg.e == 1 && (pea.c != Class_md.e.d(2000) || mm.q != Class_md.e.b(92))) {
                                            fu.c = ut.I;
                                            LoginStream.Rb = cv.d;
                                            bg.e = 2;
                                        }
                                        if (bg.e == 2) {
                                            sv.S = true;
                                            kj.a((fu.c + (int) ((double) (pea.c - (Class_md.e.d(2000))) * 2.0 / (double) kca.o)), (byte) -122);
                                            ia.a((LoginStream.Rb - (int) ((double) (mm.q - (Class_md.e.b(113))) * 2.0 / (double) kca.o)), -1);
                                        }
                                    } else {
                                        if (bg.e > 0 && !sv.S) {
                                            if ((ik.r == 1 || pl.c(false)) && mu.j > 2) {
                                                kga.b(pea.c, 106, mm.q);
                                            } else if (gs.e(0)) {
                                                kga.b(pea.c, 124, mm.q);
                                            }
                                        }
                                        bg.e = 0;
                                    }
                                    continue;
                                }
                                if (interface_.v == sfa.c) {
                                    if (bool1) {
                                        nu.a(interface_.minVScroll, 1, Class_md.e.d(2000) - x, Class_md.e.b(99) - y, interface_.minHScroll);
                                    }
                                    continue;
                                }
                                if (interface_.v == ll.r) {
                                    wg.a((byte) 125, interface_, x, y);
                                    continue;
                                }
                            }
                            if (!interface_.Ub && bool2) {
                                interface_.Ub = true;
                                if (interface_.Pb != null) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.s = true;
                                    clientScript.interface_ = interface_;
                                    clientScript.q = ew.a(9) - x;
                                    clientScript.p = ew.a(true) - y;
                                    clientScript.objects = interface_.Pb;
                                    to.b.b(clientScript, (byte) 93);
                                }
                            }
                            if (interface_.Ub && bool1 && interface_.Pc != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.s = true;
                                clientScript.interface_ = interface_;
                                clientScript.q = Class_md.e.d(2000) - x;
                                clientScript.p = Class_md.e.b(117) - y;
                                clientScript.objects = interface_.Pc;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (interface_.Ub && !bool1) {
                                interface_.Ub = false;
                                if (interface_.cb != null) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.s = true;
                                    clientScript.interface_ = interface_;
                                    clientScript.q = Class_md.e.d(2000) - x;
                                    clientScript.p = Class_md.e.b(116) - y;
                                    clientScript.objects = interface_.cb;
                                    caa.C.b(clientScript, (byte) 93);
                                }
                            }
                            if (bool1 && interface_.Sb != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.s = true;
                                clientScript.interface_ = interface_;
                                clientScript.q = Class_md.e.d(2000) - x;
                                clientScript.p = Class_md.e.b(114) - y;
                                clientScript.objects = interface_.Sb;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (!interface_.ic && bool) {
                                interface_.ic = true;
                                if (interface_.e != null) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.s = true;
                                    clientScript.interface_ = interface_;
                                    clientScript.q = Class_md.e.d(2000) - x;
                                    clientScript.p = Class_md.e.b(112) - y;
                                    clientScript.objects = interface_.e;
                                    to.b.b(clientScript, (byte) 93);
                                }
                            }
                            if (interface_.ic && bool && interface_.wb != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.s = true;
                                clientScript.interface_ = interface_;
                                clientScript.q = Class_md.e.d(2000) - x;
                                clientScript.p = Class_md.e.b(125) - y;
                                clientScript.objects = interface_.wb;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (interface_.ic && !bool) {
                                interface_.ic = false;
                                if (interface_.Bb != null) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.s = true;
                                    clientScript.interface_ = interface_;
                                    clientScript.q = Class_md.e.d(2000) - x;
                                    clientScript.p = Class_md.e.b(102) - y;
                                    clientScript.objects = interface_.Bb;
                                    caa.C.b(clientScript, (byte) 93);
                                }
                            }
                            if (interface_.Q != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.Q;
                                Class_b.c.b(clientScript, (byte) 93);
                            }
                            if (interface_.k != null && hg.p > interface_.Y) {
                                if (interface_.lc == null || hg.p - interface_.Y > 32) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.interface_ = interface_;
                                    clientScript.objects = interface_.k;
                                    to.b.b(clientScript, (byte) 93);
                                } else {
                                    while_14_:
                                    for (int k5 = interface_.Y; k5 < hg.p; k5++) {
                                        int i6 = li.E[k5 & 0x1f];
                                        for (int index = 0; index < interface_.lc.length; index++) {
                                            if (interface_.lc[index] == i6) {
                                                ClientScript clientScript = new ClientScript();
                                                clientScript.interface_ = interface_;
                                                clientScript.objects = interface_.k;
                                                to.b.b(clientScript, (byte) 93);
                                                break while_14_;
                                            }
                                        }
                                    }
                                }
                                interface_.Y = hg.p;
                            }
                            if (interface_.S != null && qn.j > interface_.Jb) {
                                if (interface_.pb == null || qn.j - interface_.Jb > 32) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.interface_ = interface_;
                                    clientScript.objects = interface_.S;
                                    to.b.b(clientScript, (byte) 93);
                                } else {
                                    while_15_:
                                    for (int k4 = interface_.Jb; k4 < qn.j; k4++) {
                                        int i5 = kv.c[k4 & 0x1f];
                                        for (int index = 0; index < interface_.pb.length; index++) {
                                            if (interface_.pb[index] == i5) {
                                                ClientScript clientScript = new ClientScript();
                                                clientScript.interface_ = interface_;
                                                clientScript.objects = interface_.S;
                                                to.b.b(clientScript, (byte) 93);
                                                break while_15_;
                                            }
                                        }
                                    }
                                }
                                interface_.Jb = qn.j;
                            }
                            if (interface_.Zc != null && hn.g > interface_.yb) {
                                if (interface_.q == null || hn.g - interface_.yb > 32) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.interface_ = interface_;
                                    clientScript.objects = interface_.Zc;
                                    to.b.b(clientScript, (byte) 93);
                                } else {
                                    while_16_:
                                    for (int k4 = interface_.yb; k4 < hn.g; k4++) {
                                        int i5 = ul.v[k4 & 0x1f];
                                        for (int index = 0; index < interface_.q.length; index++) {
                                            if (interface_.q[index] == i5) {
                                                ClientScript clientScript = new ClientScript();
                                                clientScript.interface_ = interface_;
                                                clientScript.objects = interface_.Zc;
                                                to.b.b(clientScript, (byte) 93);
                                                break while_16_;
                                            }
                                        }
                                    }
                                }
                                interface_.yb = hn.g;
                            }
                            if (interface_.Cc != null && ou.e > interface_.j) {
                                if (interface_.P == null || ou.e - interface_.j > 32) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.interface_ = interface_;
                                    clientScript.objects = interface_.Cc;
                                    to.b.b(clientScript, (byte) 93);
                                } else {
                                    while_17_:
                                    for (int k4 = interface_.j; k4 < ou.e; k4++) {
                                        int i5 = ida.n[k4 & 0x1f];
                                        for (int index = 0; index < interface_.P.length; index++) {
                                            if (interface_.P[index] == i5) {
                                                ClientScript clientScript = new ClientScript();
                                                clientScript.interface_ = interface_;
                                                clientScript.objects = interface_.Cc;
                                                to.b.b(clientScript, (byte) 93);
                                                break while_17_;
                                            }
                                        }
                                    }
                                }
                                interface_.j = ou.e;
                            }
                            if (interface_.ec != null && hea.c > interface_.Cb) {
                                if (interface_.qc == null || hea.c - interface_.Cb > 32) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.interface_ = interface_;
                                    clientScript.objects = interface_.ec;
                                    to.b.b(clientScript, (byte) 93);
                                } else {
                                    while_18_:
                                    for (int k4 = interface_.Cb; k4 < hea.c; k4++) {
                                        int i5 = ISAAC.o[k4 & 0x1f];
                                        for (int index = 0; index < interface_.qc.length; index++) {
                                            if (interface_.qc[index] == i5) {
                                                ClientScript clientScript = new ClientScript();
                                                clientScript.interface_ = interface_;
                                                clientScript.objects = interface_.ec;
                                                to.b.b(clientScript, (byte) 93);
                                                break while_18_;
                                            }
                                        }
                                    }
                                }
                                interface_.Cb = hea.c;
                            }
                            if (aea.G > interface_.kd && interface_.I != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.I;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (rda.h > interface_.kd && interface_.J != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.J;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (qt.I > interface_.kd && interface_.hb != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.hb;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (ip.M > interface_.kd && interface_.sc != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.sc;
                                to.b.b(clientScript, (byte) 93);
                            }
                            if (tda.i > interface_.kd && interface_.Mb != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.Mb;
                                to.b.b(clientScript, (byte) 93);
                            }
                            interface_.kd = tb.u;
                            if (interface_.cd != null) {
                                for (int index = 0; index < Class_pb.i; index++) {
                                    ClientScript clientScript = new ClientScript();
                                    clientScript.interface_ = interface_;
                                    clientScript.x = wca.c[index].a((byte) -87);
                                    clientScript.o = wca.c[index].a(true);
                                    clientScript.objects = interface_.cd;
                                    to.b.b(clientScript, (byte) 93);
                                }
                            }
                            if (uaa.d && interface_.F != null) {
                                ClientScript clientScript = new ClientScript();
                                clientScript.interface_ = interface_;
                                clientScript.objects = interface_.F;
                                to.b.b(clientScript, (byte) 93);
                            }
                        }
                        if (interface_.type == 5 && interface_.yc != -1) {
                            interface_.a(hi.u, ps.a, (byte) 93).a((byte) -113, interface_.minVScroll, lg.r);
                        }
                        te.a(18259, interface_);
                        if (interface_.type == 0) {
                            a(interfaces, interface_.interfaceID, i3, j3, k3, i4, x - interface_.hScroll, y - interface_.vScroll, j2, k2);
                            if (interface_.children != null) {
                                a(interface_.children, interface_.interfaceID, i3, j3, k3, i4, x - interface_.hScroll, y - interface_.vScroll, j2, k2);
                            }
                            tt tt = (tt) ida.l.a(-32748, (long) interface_.interfaceID);
                            if (tt != null) {
                                if (me.q == wa.t && tt.k == 0 && !gea.n && bool && !lba.Q) {
                                    uk.a((byte) 91);
                                }
                                Player.a((byte) -102, x, j2, i3, k3, j3, tt.l, y, k2, i4);
                            }
                        }
                    }
                }
            }
        }
	}

    /**
     * Connection before login process begins.
     */
	private void connectionProtocol(/*int i*/) {
		eb++;
		if (Class_b.d < bl.I.E) {
			gm.world.a(0);
			Login.g = (50 * bl.I.E - 50) * 5;
			if (Login.g > 3000) {
                Login.g = 3000;
            }
			if (bl.I.E >= 2 && bl.I.D == 6) {
				this.a("js5connect_outofdate", -1);
				hm.h = 14;
				return;
			}
			if (bl.I.E >= 4 && (~bl.I.D) == 0) {
				this.a("js5crc", -1);
				hm.h = 14;
				return;
			}
			if (bl.I.E >= 4 && dn.a(i + 104, hm.h)) {
				if (bl.I.D == 7 || bl.I.D == 9) {
                    this.a("js5connect_full", -1);
                } else if (bl.I.D <= 0) {
                    this.a("js5io", -1);
                } else if (Class_jg.Q == null) {
                    this.a("js5connect", -1);
                } else {
                    this.a("js5proxy_" + Class_jg.Q.trim(), -1);
                }
				hm.h = 14;
				return;
			}
		}
		Class_b.d = bl.I.E;
		if (Login.g > 0) {
            Login.g--;
        } else {
			try {
				if (dba.c == 0) {
                    System.out.println("[Client] 0");
					Connection.vfa_ = gm.world.a(nda.signlink);
					dba.c++;
				}
				if (dba.c == 1) {
					if (Connection.vfa_.f == 2) {
						if (Connection.vfa_.hostName != null) {
                            Class_jg.Q = (String) Connection.vfa_.hostName;
                        }
						a((byte) 125, 1000);
						return;
					}
					if (Connection.vfa_.f == 1) {
                        dba.c++;
                    }
				}
				if (dba.c == 2) {
                    /**
                     * This is the first things sent between the client and server.
                     *
                     * Opcode 15
                     * Revision
                     */
					pt.f = new Connection((Socket) Connection.vfa_.hostName, nda.signlink);
					BytesParser bytesParser = new BytesParser(5);
                    System.out.println("[Client]");
					bytesParser.writeByte(hea.specialOutPacket15.packetID, (byte) -115);
					bytesParser.writeInt(621, -97);
					pt.f.a(5, 0, (byte) -93, bytesParser.bytes);
					dba.c++;
					ClientScript.z = us.a(127);
				}
				if (dba.c == 3) {
                    System.out.println("[Client] 3");
					if (!dn.a(125, hm.h) && pt.f.availableSkips(-22874) <= 0) {
                        System.out.println("inside if");
						if (us.a(103) - ClientScript.z > 30000L) {
                            System.out.println("1i23p");
							a((byte) 125, 1001);
							return;
						}
					} else {
                        System.out.println("inside else");
						int read = pt.f.read(12410);
                        System.out.println("..." + read);
						if (read != 0) {
							a((byte) 125, read);
							return;
						}
						dba.c++;
					}
				}
				if (dba.c == 4) {
                    System.out.println("[Client] 4");
					boolean bool = dn.a(96, hm.h) || gs.b(hm.h, 0) || pga.a(-66, hm.h);
					fba[] fbas = fba.b(-119);
					BytesParser bytesParser = new BytesParser(4 * fbas.length);
					pt.f.a(0, bytesParser.bytes, bytesParser.bytes.length, i + 14227);
					for (int index = 0; index < fbas.length; index++) {
                        fbas[index].a(bytesParser.readInt(107), i ^ 0x7c);
                    }
					bl.I.a(i ^ ~0x67, !bool, pt.f);
					dba.c = 0;
					pt.f = null;
					Connection.vfa_ = null;
				}
			} catch (java.io.IOException ioexception) {
				a((byte) 123, 1002);
			}
			/*if (i != -11) {
                jb = -0.5348778F;
            }*/
		}
	}

	public static int[][] a(int dummy, int i, int j, int k, int i1, /*byte isHidden,*/ boolean bool, int j1, float f) {
		db++;
		int[][] ints = new int[i][j1];
		vd vd = new vd();
		vd.J = (int) (f * 4096.0F);
		vd.W = bool;
		vd.H = j;
		vd.Q = i1;
		vd.M = k;
		vd.b(124);
		/*if (isHidden != 70) {
            ob = null;
        }*/
		im.a(i, (byte) -30, j1);
		for (int index = 0; index < i; index++) {
            vd.a(index, (byte) 31, ints[index]);
        }
		return ints;
	}

	public static boolean isHidden(Interface interface_) {
		if (lba.Q) {
			if (c(interface_).l != 0) {
                return false;
            }
			if (interface_.type == 0) {
                return false;
            }
		}
		return interface_.hidden;
	}

	private void b(boolean bool) {
		pb++;
		if (!bool) {
            ob = null;
        }
		boolean bool1 = bl.I.a(-98);
		if (!bool1) {
            connectionProtocol();
        }
	}

	public static void c() {
		int inScreenPlayers = oca.inScreenPlayers;
		int[] inScreenPlayerIDs = vd.inScreenPlayerIDs;
		int count = qm.f ? inScreenPlayers : inScreenPlayers + ps.npcCount;
		for (int index = 0; index < count; index++) {
			Entity entity;
			if (index < inScreenPlayers) {
                entity = Class_fc.playersInScreen[inScreenPlayerIDs[index]];
            } else {
                entity = ((NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[index - inScreenPlayers])).l;
            }
			if (entity.Kb >= 0) {
				int mask = entity.i(-1);
				if ((mask & 0x1) == 0) {
					if ((entity.locX & 0x1ff) == 0 && (entity.locY & 0x1ff) == 0) {
                        continue;
                    }
				} else if ((entity.locX & 0x1ff) == 256 && (entity.locY & 0x1ff) == 256) {
                    continue;
                }
				entity.j = Class_u.b(entity.locX, entity.height, -20214, entity.locY);
				to.a(entity, true);
			}
		}
	}

	public final void g(int i) {
		if (ce.bb) {
            qm.heapSize = 64;
        }
		ab++;
		Frame frame = new Frame("Jagex");
		frame.pack();
		frame.dispose();
		ig.a((byte) -112);
		kl.j = new th(nda.signlink);
		bl.I = new uaa();
		mm.a(new int[] { 1000, 100 }, true, new int[] { 20, 260 });
		if (hs.modeWhere != oba.K) {
            hk.R = new byte[50][];
        }
		cs.g = new dg(nda.signlink);
		if (hs.modeWhere == oba.K) {
            kfa.world.lobbyAddress = this.getCodeBase().getHost();
        } else if (sm.a(1, hs.modeWhere)) {
			kfa.world.lobbyAddress = this.getCodeBase().getHost();
			kfa.world.firstPort = kfa.world.worldID + 40000;
			cf.world.firstPort = cf.world.worldID + 40000;
			kfa.world.secondPort = 50000 + kfa.world.worldID;
			Class_eb.world.firstPort = Class_eb.world.worldID + 40000;
			cf.world.secondPort = 50000 + cf.world.worldID;
			Class_eb.world.secondPort = 50000 + Class_eb.world.worldID;
		} else if (vea.a == hs.modeWhere) {
			kfa.world.lobbyAddress = "127.0.0.1";
			cf.world.lobbyAddress = "127.0.0.1";
			Class_eb.world.lobbyAddress = "127.0.0.1";
			kfa.world.firstPort = kfa.world.worldID + 40000;
			cf.world.firstPort = 40000 + cf.world.worldID;
			Class_eb.world.firstPort = Class_eb.world.worldID + 40000;
			kfa.world.secondPort = 50000 + kfa.world.worldID;
			cf.world.secondPort = cf.world.worldID + 50000;
			Class_eb.world.secondPort = Class_eb.world.worldID + 50000;
		}
		lf.n = Class_pd.s = qn.l = ua.d = new short[256];
		if (wa.t == me.q) {
            Class_g.D = false;
        }
		if (me.q != Class_pf.O) {
			ck.K = iaa.f;
			lp.p = uda.h;
		} else {
			lp.p = Class_gb.f;
			vh.a = true;
			iea.h = 16777215;
			ck.K = nfa.d;
			sea.b = 0;
		}
		gm.world = kfa.world;
		try {
			sg.d = po.c.getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		uc.c = ItemDef.a(ru.canvas, i ^ 0x1f5);
		Class_md.e = qca.a(ru.canvas, 6611, true);
		try {
			if (i != 511) {
                return;
            }
			if (nda.signlink.fileOnDisk1 != null) {
				or.f = new cv(nda.signlink.fileOnDisk1, 5200, 0);
				for (int index = 0; index < 35; index++) {
                    Connection.cvs[index] = new cv(nda.signlink.filesOnDisk[index], 6000, 0);
                }
				fr.x = new cv(nda.signlink.fileOnDisk, 6000, 0);
				Class_jg.N = new lf(255, or.f, fr.x, 500000);
				dca.V = new cv(nda.signlink.fileOnDisk_, 24, 0);
				nda.signlink.fileOnDisk1 = null;
				nda.signlink.filesOnDisk = null;
				nda.signlink.fileOnDisk = null;
				nda.signlink.fileOnDisk_ = null;
			}
		} catch (java.io.IOException ioexception) {
			fr.x = null;
			Class_jg.N = null;
			dca.V = null;
			or.f = null;
		}
		if (oba.K != hs.modeWhere) {
            sl.l = true;
        }
		if (wa.t == me.q) {
            uh.b = GameText.rsIsLoading_PleaseWait.getString((byte) 101, cba.languageID);
        } else if (Class_pf.O == me.q) {
            uh.b = GameText.sdIsLoading_PleaseWait.getString((byte) 114, cba.languageID);
        }
	}

	public final void init() {
		kb++;
		if (this.a(-140)) {
			kfa.world = new World();
			kfa.world.worldID = Integer.parseInt(this.getParameter("worldid"));
			cf.world = new World();
			cf.world.worldID = Integer.parseInt(this.getParameter("lobbyid"));
			cf.world.lobbyAddress = this.getParameter("lobbyaddress");
			Class_eb.world = new World();
			Class_eb.world.worldID = Integer.parseInt(this.getParameter("demoid"));
			Class_eb.world.lobbyAddress = this.getParameter("demoaddress");
			hs.modeWhere = sf.a((byte) -54, Integer.parseInt(this.getParameter("modewhere")));
			if (hs.modeWhere != vea.a) {
				if (!sm.a(1, hs.modeWhere) && oba.K != hs.modeWhere) {
					hs.modeWhere = oba.K;
				}
			} else {
				hs.modeWhere = Class_g.modeWhere;
			}
			gv.modeWhat = li.a(Integer.parseInt(this.getParameter("modewhat")), (byte) -98);
			if (wd.b != gv.modeWhat && gv.modeWhat != GameOutPacket.wl && ft.s != gv.modeWhat) {
				gv.modeWhat = ft.s;
			}
			try {
				cba.languageID = Integer.parseInt(this.getParameter("lang"));
			} catch (Exception exception) {
				cba.languageID = 0;
			}
			String objectTag = this.getParameter("objecttag");
			if (objectTag == null || !objectTag.equals("1")) {
				dm.d = false;
			} else {
				dm.d = true;
			}
			String js = this.getParameter("js");
			if (js == null || !js.equals("1")) {
				GameInPacket.l = false;
			} else {
				GameInPacket.l = true;
			}
			String advert = this.getParameter("advert");
			if (advert != null && advert.equals("1")) {
				wu.g = true;
			} else {
				wu.g = false;
			}
			String game = this.getParameter("game");
			if (game != null) {
				if (game.equals("0")) {
					me.q = wa.t;
				} else if (game.equals("1")) {
					me.q = Class_pf.O;
				}
			}
			try {
				hl.affId = Integer.parseInt(this.getParameter("affid"));
			} catch (Exception exception) {
				hl.affId = 0;
			}
			bt.quitURL = this.getParameter("quiturl");
			ow.settings = this.getParameter("settings");
			if (ow.settings == null) {
				ow.settings = "";
			}
			String country = this.getParameter("country");
			if (country != null) {
				try {
					ea.thisCountry = Integer.parseInt(country);
				} catch (Exception exception) {
					ea.thisCountry = 0;
				}
			}
			jr.colourId = Integer.parseInt(this.getParameter("colourid"));
			if (jr.colourId < 0 || os.i.length <= jr.colourId) {
				jr.colourId = 0;
			}
			if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
				Class_gb.h = ll.t = true;
			}
			String fromBilling = this.getParameter("frombilling");
			if (fromBilling != null && fromBilling.equals("true")) {
				Class_rf.f = true;
			}
			uo.ssKey = this.getParameter("sskey");
			if (uo.ssKey != null && uo.ssKey.length() < 2) {
				uo.ssKey = null;
			}
			String force = this.getParameter("force64mb");
			if (force != null && force.equals("true")) {
				ce.bb = true;
			}
			String worldFlags = this.getParameter("worldflags");
			if (worldFlags != null) {
				try {
					cd.worldFlags = Integer.parseInt(worldFlags);
				} catch (Exception exception) {
					/* empty */
				}
			}
			String userFlow = this.getParameter("userFlow");
			if (userFlow != null) {
				try {
					ak.userFlow = Long.parseLong(userFlow);
				} catch (NumberFormatException numberformatexception) {
					/* empty */
				}
			}
			br.additionalInfo = this.getParameter("additionalInfo");
			if (br.additionalInfo != null && br.additionalInfo.length() > 50) {
				br.additionalInfo = null;
			}
			po.c = this;
			if (wa.t != me.q) {
				if (Class_pf.O == me.q) {
					Class_vb.r = 480;
					baa.d = 640;
				}
			} else {
				Class_vb.r = 503;
				baa.d = 765;
			}
			this.a(gv.modeWhat.a((byte) -114) + 32, (byte) -21, me.q.g, 621, baa.d, 35, Class_vb.r);
		}
	}

	public final void f(/*int i*/) {
		if (dv.d) {
            cc.a(false);
        }
		qb++;
		wo.b(21074);
		if (lg.r != null) {
            lg.r.h(1);
        }
		if (em.a != null) {
			iga.a(em.a, nda.signlink, false);
			em.a = null;
		}
		if (ce.y != null) {
			ce.y.d(0);
			ce.y = null;
		}
		Class_rf.a(114);
		bl.I.a((byte) 76);
		kl.j.a((byte) -112);
		if (Class_ag.i != null) {
			Class_ag.i.a(false);
			Class_ag.i = null;
		}
		try {
			or.f.b((byte) 101);
			for (int index = 0; index < 35; index++) {
                Connection.cvs[index].b((byte) 101);
            }
			fr.x.b((byte) 101);
			if (i != -36) {
                ob = null;
            }
			dca.V.b((byte) 101);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public final void d(int i) {
		if (i == 82) {
			fb++;
			if (on.performance == 2) {
				try {
					l(-101);
				} catch (Throwable throwable) {
					cea.a((throwable.getMessage() + " (Recovered) " + d((byte) -30)), -2, throwable);
					ur.a(0, true);
				}
			} else {
                l(-101);
            }
		}
	}

	private void a(byte b, int read) {
		pt.f = null;
		bl.I.E++;
		if (b > 121) {
			bl.I.D = read;
			dba.c = 0;
			Connection.vfa_ = null;
			nb++;
		}
	}

	private void k(int i) {
		if (hm.h == 7 && hk.loginStage == 0) {
			if (dj.b > 1) {
				tda.i = tb.u;
				dj.b--;
			}
			if (!gea.n) {
                uk.a((byte) 91);
            }
			for (int j = 0; j < 100; j++) {
				if (!fh.a(true)) {
                    break;
                }
			}
		}
		if (i <= 21) {
            jb = -1.7173753F;
        }
		mb++;
		nq.x++;
		eh.a(-1, -1, null, 17274);
		wg.a((byte) 61, null, -1, -1);
		dc.a((byte) 98);
		tb.u++;
		for (int j = 0; j < ObjectDef.Ib; j++) {
			NPC npc = ii.npcNodes[j].l;
			if (npc != null) {
				byte b1 = npc.npcDef.y;
				if ((0x1 & b1) != 0) {
					int k = npc.i(-1);
					if ((b1 & 0x2) != 0 && npc.Nc == 0 && 1000.0 * Math.random() < 10.0) {
						int x = (int) Math.round(10.0 * Math.random() - 5.0);
						int y = (int) Math.round(10.0 * Math.random() - 5.0);
						if (x != 0 || y != 0) {
							int localX = x + npc.regionLocalX[0];
							int localY = y + npc.regionLocalY[0];
							if (localX >= 0) {
								if (Class_hc.e - k - 1 < localX) {
                                    localX = Class_hc.e + (-k - 1);
                                }
							} else {
                                localX = 0;
                            }
							if (localY < 0) {
                                localY = 0;
                            } else if (bw.v - 1 - k < localY) {
                                localY = bw.v - k - 1;
                            }
							int i1 = dr.a(bn.c, k, npc.regionLocalX[0], 0, localY, true, k, su.a[npc.height], npc.regionLocalY[0],
									localX, true, k, kq.S, -1, 0);
							if (i1 > 0) {
								if (i1 > 9) {
                                    i1 = 9;
                                }
								for (int j1 = 0; j1 < i1; j1++) {
									((Entity) npc).regionLocalX[j1] = kq.S[i1 - 1 - j1];
									((Entity) npc).regionLocalY[j1] = bn.c[i1 - j1 - 1];
									((Entity) npc).moveTypes[j1] = (byte) 1;
								}
								npc.Nc = i1;
							}
						}
					}
					vt.a(true, npc, (byte) 78);
					int i1 = mw.a((byte) 118, npc);
					ff.a(i1, pg.f, npc, -26563, ej.s);
					mq.a(-6855, npc, pg.f);
					vt.a(npc, (byte) 112);
				}
			}
		}
		if (hk.loginStage == 0 && Class_eb.q == 0) {
			if (ll.x == 2) {
                hg.a(true);
            } else {
                fi.a(-1202242076);
            }
			if (dg.gb >> 9 < 14 || Class_hc.e - 14 <= dg.gb >> 9 || ada.N >> 9 < 14 || bw.v - 14 <= ada.N >> 9) {
                tc.i(-16777216);
            }
		}
		for (;;) {
			ClientScript clientScript = (ClientScript) Class_b.c.a(true);
			if (clientScript == null) {
                break;
            }
			Interface interface_ = clientScript.interface_;
			if (interface_.itemIndex >= 0) {
				Interface interface_1 = efa.a(-1018745488, interface_.parentID);
				if (interface_1 == null || interface_1.children == null || interface_1.children.length <= interface_.itemIndex
						|| interface_ != interface_1.children[interface_.itemIndex]) {
                    continue;
                }
			}
			ClientScriptHandler.activateClientScript(clientScript);
		}
		for (;;) {
			ClientScript clientScript = (ClientScript) caa.C.a(true);
			if (clientScript == null) {
                break;
            }
			Interface interface_ = clientScript.interface_;
			if (interface_.itemIndex >= 0) {
				Interface interface_1 = efa.a(-1018745488, interface_.parentID);
				if (interface_1 == null || interface_1.children == null || interface_1.children.length <= interface_.itemIndex
						|| interface_ != interface_1.children[interface_.itemIndex]) {
                    continue;
                }
			}
			ClientScriptHandler.activateClientScript(clientScript);
		}
		for (;;) {
			ClientScript clientScript = (ClientScript) to.b.a(true);
			if (clientScript == null) {
                break;
            }
			Interface interface_ = clientScript.interface_;
			if (interface_.itemIndex >= 0) {
				Interface interface_1 = efa.a(-1018745488, interface_.parentID);
				if (interface_1 == null || interface_1.children == null || interface_.itemIndex >= interface_1.children.length
						|| interface_ != interface_1.children[interface_.itemIndex]) {
                    continue;
                }
			}
			ClientScriptHandler.activateClientScript(clientScript);
		}
		if (kr.a != null) {
            qc.a(7129);
        }
		if (pm.currentTimedTicks % 1500 == 0) {
            da.a(false);
        }
		if (hm.h == 7 && hk.loginStage == 0) {
            NPCDef.a(true);
        }
		cba.a(96);
		if (dv.d && us.a(116) - 60000L > hs.n) {
            cc.a(false);
        }
		for (rk rk = (rk) mw.v.b((byte) 126); rk != null; rk = (rk) mw.v.a((byte) -106)) {
			if (us.a(100) / 1000L - 5L > (long) rk.p) {
				if (rk.n > 0) {
                    oba.a("", rk.playerName + GameText._hasLoggedIn.getString((byte) 77, cba.languageID), 5, -1, "", 0, "");
                }
				if (rk.n == 0) {
                    oba.a("", rk.playerName + GameText._hasLoggedOut.getString((byte) 124, cba.languageID), 5, -1, "", 0, "");
                }
				rk.b(2);
			}
		}
		do {
			if (hm.h == 7 && hk.loginStage == 0) {
				if (ce.y == null) {
                    la.logout((byte) -20, false);
                } else {
					nc.n++;
					if (nc.n > 50) {
						jq.k++;
						tba tba = jga.sendGameOutPacket(lw.outgoingPacket24, pca.isaac, (byte) -111);
						ud.a(tba, (byte) -36);
					}
					try {
						uu.a((byte) 79);
					} catch (java.io.IOException ioexception) {
						la.logout((byte) 17, false);
						break;
					}
					break;
				}
				break;
			}
		} while (false);
	}

	private void l(int i) {
		Y++;
		if (hm.h != 14) {
			long l = ei.a(-27622) / 1000000L - pm.x;
			pm.x = ei.a(i - 27521) / 1000000L;
			boolean bool = cga.a((byte) 43);
			if (bool && Class_jc.ib && daa.ab != null) {
                daa.ab.c(2000);
            }
			if (lba.b(-18705, hm.h)) {
				if (cga.v != 0L && us.a(i + 206) > cga.v) {
                    kea.a(false, (byte) 126, cs.g.W, cs.g.F, ia.g(15));
                } else if (!lg.r.f() && vv.o) {
                    wu.c(4);
                }
			}
			if (em.a == null) {
				java.awt.Container container;
				if (ws.J != null) {
                    container = ws.J;
                } else if (vj.applet != null) {
                    container = vj.applet;
                } else {
                    container = tg.D;
                }
				int width = container.getSize().width;
				int height = container.getSize().height;
				if (container == ws.J) {
					Insets insets = ws.J.getInsets();
					width -= insets.left + insets.right;
					height -= insets.bottom + insets.top;
				}
				if (width != rda.width || height != Class_jg.height || up.I) {
					if (lg.r != null && !lg.r.B()) {
						rda.width = width;
						Class_jg.height = height;
					} else {
                        ig.a((byte) -63);
                    }
					cga.v = us.a(99) + 500L;
					up.I = false;
				}
			}
			if (i != -101) {
                d(-54);
            }
			if (em.a != null && !tw.r && lba.b(-18705, hm.h)) {
                kea.a(false, (byte) 126, -1, -1, cs.g.w);
            }
			boolean bool1 = false;
			if (sea.d) {
				bool1 = true;
				sea.d = false;
			}
			if (bool1) {
                ro.b(i ^ ~0x64);
            }
			if (lg.r != null && lg.r.f() || ia.g(103) != 1) {
                fda.a(i ^ ~0x64);
            }
			if (dn.a(42, hm.h)) {
                bca.a(true, bool1);
            } else if (!ws.a(5, hm.h)) {
				if (!Class_k.b(hm.h, i ^ ~0x5)) {
					if (ml.a((byte) 22, hm.h)) {
						if (em.e != 1) {
							if (em.e != 2) {
                                Class_rf.a(true, lg.r, true, Class_nd.o, pm.v, GameText.loadingPleaseWait.getString((byte) 88, cba.languageID));
                            } else {
								if (it.L < pp.q) {
                                    it.L = pp.q;
                                }
								int j = (it.L - pp.q) * 50 / it.L + 50;
								Class_rf.a(true, lg.r, true, Class_nd.o, pm.v, (GameText.loadingPleaseWait.getString((byte) -42, cba.languageID)
												+ "<br>(" + j + "%)"));
							}
						} else {
							if (dga.w > tw.q) {
                                tw.q = dga.w;
                            }
							int j = 50 * (tw.q - dga.w) / tw.q;
							Class_rf.a(true, lg.r, true, Class_nd.o, pm.v, (GameText.loadingPleaseWait.getString((byte) 87, cba.languageID)
											+ "<br>(" + j + "%)"));
						}
					} else if (hm.h != 10) {
						if (hm.h == 13)
							Class_rf.a(true, lg.r, false, Class_nd.o, pm.v, (GameText.connectionLostText.getString((byte) 125, cba.languageID) + "<br>"
                                    + GameText.pleaseWait_attemptingToReestablish.getString((byte) 75, cba.languageID)));
					} else {
                        lda.a(11493, l);
                    }
				} else {
                    sda.b(121);
                }
			} else {
                sda.b(117);
            }
			if (lt.g == 3) {
				for (int index = 0; index < rba.m; index++) {
					Rectangle rectangle = ng.s[index];
					if (sr.T[index]) {
                        lg.r.f(-1996553985, rectangle.x, rectangle.y, 1, rectangle.height, rectangle.width);
                    } else if (cj.c[index]) {
                        lg.r.f(-1996554240, rectangle.x, rectangle.y, 1, rectangle.height, rectangle.width);
                    }
				}
			}
			if (rh.c(-8908)) {
                cl.a(i ^ 0x1b, lg.r);
            }
			if (!nda.signlink.e || !lba.b(-18705, hm.h) || lt.g != 0 || ia.g(-118) != 1 || bool1) {
				if (!dn.a(i + 176, hm.h)) {
					for (int index = 0; rba.m > index; index++) {
                        cj.c[index] = false;
                    }
					try {
						lg.r.u();
					} catch (uo uo) {
						cea.a((uo.getMessage() + " (Recovered) " + d((byte) -30)), -2, uo);
						ur.a(0, true);
					}
				}
			} else {
				int j = 0;
				for (int index = 0; rba.m > index; index++) {
					if (cj.c[index]) {
						cj.c[index] = false;
						nq.v[j++] = ng.s[index];
					}
				}
				try {
					lg.r.a(nq.v, j);
				} catch (uo var_uo) {
					/* empty */
				}
			}
			if (cs.g.x == 0) {
                Connection.a(-28448, 15L);
            } else if (cs.g.x != 1) {
				if (cs.g.x == 2) {
                    Connection.a(i - 28347, 5L);
                } else if (cs.g.x == 3) {
                    Connection.a(-28448, 2L);
                }
			} else {
                Connection.a(-28448, 10L);
            }
			if (qn.i) {
                id.a(98);
            }
			if (cs.g.A && hm.h == 3 && (~Class_vb.u) != 0) {
				cs.g.A = false;
				cs.g.a(nda.signlink, (byte) 113);
			}
		}
	}

	public static void d() {
		Player.Sd = 0;
		for (int i = 0; i < ps.npcCount; i++) {
			NPC npc = ((NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[i])).l;
			if (npc.gb && npc.a((byte) -7) != -1) {
				int j = (npc.i(-1) - 1) * 256 + 252;
				int x = npc.locX - j >> 9;
				int y = npc.locY - j >> 9;
				Entity entity = oi.a(x, npc.height, y, (byte) 23);
				if (entity != null) {
					int k = entity.lb;
					if (entity instanceof NPC) {
                        k += 2048;
                    }
					if (entity.jc == 0 && entity.a((byte) -7) != -1) {
						qea.e[Player.Sd] = k;
						mm.B[Player.Sd] = k;
						Player.Sd++;
						entity.jc++;
					}
					qea.e[Player.Sd] = k;
					mm.B[Player.Sd] = npc.lb + 2048;
					Player.Sd++;
					entity.jc++;
				}
			}
		}
		wm.a(0, qea.e, (byte) 8, Player.Sd - 1, mm.B);
	}

    /**
     *
     * @param i
     * @param dummy Had to keep until another client method 'a' is refactored.
     * @return i >>> 7
     */
	public static int a(int i, byte dummy) {
		lb++;
		int i_128_ = -69 / ((39 - dummy) / 63);
		return i >>> 7;
	}

    /**
     *
     * @param dummy Had to keep when deleted weird errors started popping up.
     * @return
     */
	public final String d(byte dummy) {
		Z++;
		String string = null;
		try {
			string = ("[1)" + bfa.thisPlayersRegionX + "," + BytesParser.thisPlayersRegionY + "," + Class_hc.e + "," + bw.v + "|");
			if (up.thisPlayer != null) {
                string += ("2)" + vo.clientHeight + "," + (bfa.thisPlayersRegionX + up.thisPlayer.regionLocalX[0]) + ","
                        + (BytesParser.thisPlayersRegionY + up.thisPlayer.regionLocalY[0]) + "|");
            }
			string += ("3)" + on.performance + "|4)" + cs.g.Z + "|5)" + ia.g(36) + "|6)" + ff.width + "," + eh.height + "|");
			if (dummy != -30) {
                gb = null;
            }
			string += "7)" + cs.g.a(-65, on.performance) + "|";
			string += "8)" + cs.g.b(on.performance, -110) + "|";
			string += "9)" + cs.g.L + "|";
			string += "10)" + cs.g.k + "|";
			string += "11)" + cs.g.cb + "|";
			string += "12)" + cs.g.e(on.performance, 92) + "|";
			string += "13)" + qm.heapSize + "|";
			string += "14)" + hm.h;
			try {
				string += "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				if (on.performance == 2) {
					Class classLoader = Class.forName("java.lang.ClassLoader");
					Field nativeLibraries = classLoader.getDeclaredField("nativeLibraries");
					Class accessibleObject = Class.forName("java.lang.reflect.AccessibleObject");
					Method setAccessible = accessibleObject.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					setAccessible.invoke(nativeLibraries, Boolean.TRUE);
					Vector vector = (Vector) nativeLibraries.get((client != null ? client : (client = getClassByName("client"))).getClassLoader());
					for (int index = 0; index < vector.size(); index++) {
						try {
							Object object = vector.elementAt(index);
							Field name = object.getClass().getDeclaredField("name");
							setAccessible.invoke(name, Boolean.TRUE);
							try {
								String dll_File = (String) name.get(object);
								if (dll_File != null && (dll_File.indexOf("sw3d.dll") ^ 0xffffffff) != 0) {
									Field handle = object.getClass().getDeclaredField("handle");
									setAccessible.invoke(handle, (new Object[]{Boolean.TRUE}));
									string += ("|16)" + (Long.toHexString(handle.getLong(object))));
									setAccessible.invoke(handle, (new Object[]{Boolean.FALSE}));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							setAccessible.invoke(name, Boolean.FALSE);
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			string += "]";
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	public final void e(/*int i*/) {
		ib++;
		if (on.performance == 2) {
			try {
				h();
			} catch (Throwable throwable) {
				cea.a(throwable.getMessage() + " (Recovered) " + d((byte) -30), -2, throwable);
				ur.a(0, true);
			}
		} else {
            h();
        }
	}

    /**
     *
     * @param unused Kept since another client method 'a' needs refactored.
     * @param unused1 "                                                    "
     * @return
     */
	public static boolean a(/*byte i,*/ int unused, int unused1) {
		/*if (i < 51)
			return false;*/
		bb++;
		return false;
	}

	public static void m(int height) {
		int inScreenPlayers = oca.inScreenPlayers;
		int[] inScreenPlayerIDs = vd.inScreenPlayerIDs;
		for (int index = 0; index < inScreenPlayers + ps.npcCount; index++) {
			Entity entity;
			if (index < inScreenPlayers) {
                entity = Class_fc.playersInScreen[inScreenPlayerIDs[index]];
            } else {
                entity = ((NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[index - inScreenPlayers])).l;
            }
			if (entity.height == height && entity.Kb >= 0) {
				int i = entity.i(-1);
				if ((i & 0x1) == 0) {
					if ((entity.locX & 0x1ff) != 0 || (entity.locY & 0x1ff) != 0) {
                        continue;
                    }
				} else if ((entity.locX & 0x1ff) != 256 || (entity.locY & 0x1ff) != 256) {
                    continue;
                }
				if (i == 1) {
					int regionX = entity.locX >> 9;
					int regionY = entity.locY >> 9;
					if (entity.Kb > gi.k[regionX][regionY]) {
						gi.k[regionX][regionY] = entity.Kb;
						GameInPacket.c[regionX][regionY] = 1;
					} else if (entity.Kb == gi.k[regionX][regionY]) {
                        GameInPacket.c[regionX][regionY]++;
                    }
				} else {
					int j = (i - 1) * 256 + 60;
					int x_ = entity.locX - j >> 9;
					int y_ = entity.locY - j >> 9;
					int x_1 = entity.locX + j >> 9;
					int y_1 = entity.locY + j >> 9;
					for (int x = x_; x <= x_1; x++) {
						for (int y = y_; y <= y_1; y++) {
							if (entity.Kb > gi.k[x][y]) {
								gi.k[x][y] = entity.Kb;
								GameInPacket.c[x][y] = 1;
							} else if (entity.Kb == gi.k[x][y])
								GameInPacket.c[x][y]++;
						}
					}
				}
			}
		}
	}

	public static nm c(Interface interface_) {
		nm nm = (nm) aea.E.a(-32748, (((long) interface_.interfaceID << 32) + (long) interface_.itemIndex));
		if (nm != null) {
            return nm;
        }
		return interface_.qd;
	}

	public static void nullLoader(/*byte i*/) {
		gb = null;
		ob = null;
		/*if (i != -9)
			gb = null;*/
	}

	private /* synthetic */static Class getClassByName(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
