/* bn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bn
{
    static int a;
    static int b;
    static int[] c = new int[50];
    static int d;
    static int e;
    static int f;
    static int[] g = new int[3];
    
    static final void a(Class_r class_r, int i) {
	bq.e = ao.a(true, od.smallFont, class_r, 0);
	b++;
	Class_rb.O = nj.a((byte) 91, class_r, od.smallFont);
	pm.v = ao.a(true, iq.plainFont, class_r, i ^ i);
	Class_nd.o = nj.a((byte) 121, class_r, iq.plainFont);
	pv.j = ao.a(true, la.boldFont, class_r, i + 27346);
	dca.R = nj.a((byte) 120, class_r, la.boldFont);
    }
    
    public static void a(byte i) {
	c = null;
	g = null;
	if (i != -47)
	    a(72, -72, 71, 113, -101, -52, 79);
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
	f++;
	int i_6_ = oca.inScreenPlayers;
	int[] is = vd.inScreenPlayerIDs;
	ui.f = 0;
	if (i_3_ != -140)
	    a(null, -68);
	for (int i_7_ = 0; ps.npcCount + i_6_ > i_7_; i_7_++) {
	    NPCDef var_du = null;
	    Entity var_ni;
	    if (i_6_ > i_7_)
		var_ni = Class_fc.playersInScreen[is[i_7_]];
	    else {
		var_ni
		    = ((NPCNode) (NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[i_7_ - i_6_])).npc;
		var_du = ((NPC) (NPC) var_ni).npcDef;
		if (((NPCDef) var_du).L != null) {
		    var_du = var_du.a(-4261, cp.e);
		    if (var_du == null)
			continue;
		}
	    }
	    if (((Entity) var_ni).Kb >= 0
		&& (((Entity) var_ni).Wb == sh.j
		    || ((Animable) var_ni).height == ((Animable) up.thisPlayer).height)) {
		bfa.a(var_ni.j(i_3_ + 17706), var_ni, i, i_2_ >> 1, i_3_ + 144,
		      i_5_ >> 1, i_4_);
		if (lt.h[0] >= 0) {
		    if (((Entity) var_ni).cb != null
			&& (i_7_ >= i_6_ || Class_fd.t == 0 || Class_fd.t == 3
			    || Class_fd.t == 1 && wea.a(((Player) (Player) var_ni).displayName, -116))
			&& ui.f < cl.b) {
			cl.m[ui.f] = dca.R.a((byte) 99, ((Entity) var_ni).cb) / 2;
			cl.a[ui.f] = lt.h[0];
			cl.i[ui.f] = lt.h[1];
			cl.e[ui.f] = ((Entity) var_ni).jb;
			cl.h[ui.f] = ((Entity) var_ni).vc;
			cl.p[ui.f] = ((Entity) var_ni).Q;
			cl.c[ui.f] = ((Entity) var_ni).cb;
			ui.f++;
		    }
		    int i_8_ = i_0_ + lt.h[1];
		    if (!((Entity) var_ni).gb && pm.currentTimedTicks < ((Entity) var_ni).hitRemovalTime) {
			int i_9_ = -1;
			int i_10_ = 1;
			if (i_6_ > i_7_) {
			    Player var_qi = Class_fc.playersInScreen[is[i_7_]];
			    i_9_ = ((cg) var_ni.k(32195)).f;
			    if (((Player) var_qi).cd)
				i_10_ = 2;
			} else {
			    i_9_ = ((NPCDef) var_du).yb;
			    if ((i_9_ ^ 0xffffffff) == 0)
				i_9_ = ((cg) var_ni.k(32195)).f;
			}
			f[] var_fs = hu.c;
			if (i_9_ != -1) {
			    f[] var_fs_11_
				= (f[]) mga.o.get((long) i_9_, (byte) 100);
			    if (var_fs_11_ == null) {
				aga[] var_agas = aga.b(sm.a, i_9_, 0);
				if (var_agas != null) {
				    var_fs_11_ = new f[var_agas.length];
				    for (int i_12_ = 0;
					 i_12_ < var_agas.length; i_12_++)
					var_fs_11_[i_12_]
					    = lg.r.a(var_agas[i_12_], true);
				    mga.o.put((long) i_9_, var_fs_11_,
					    i_3_ ^ ~0x8a);
				}
			    }
			    if (var_fs_11_ != null && var_fs_11_.length >= 2)
				var_fs = var_fs_11_;
			}
			if (var_fs.length <= i_10_)
			    i_10_ = 1;
			f var_f = var_fs[0];
			f var_f_13_ = var_fs[i_10_];
			i_8_ -= Math.max(((sa) dca.R).b, var_f.u());
			int i_14_ = i_1_ - (-lt.h[0] + (var_f.E() >> 1));
			int i_15_ = var_f.E() * ((Entity) var_ni).hitBarScale / 255;
			if (((Entity) var_ni).hitBarScale > 0 && i_15_ < 2)
			    i_15_ = 2;
			var_f.a(i_14_, i_8_);
			lg.r.V(i_14_, i_8_, i_15_ + i_14_, i_8_ + var_f.u());
			var_f_13_.a(i_14_, i_8_);
			lg.r.da(i_1_, i_0_, i_5_ + i_1_, i_2_ + i_0_);
		    } else
			i_8_ -= Math.max(((sa) dca.R).b, hu.c[0].u());
		    i_8_ -= 2;
		    if (!((Entity) var_ni).gb) {
			if (pm.currentTimedTicks < ((Entity) var_ni).Y) {
			    f var_f = fp.j[((Entity) var_ni).kb ? 2 : 0];
			    f var_f_16_ = fp.j[((Entity) var_ni).kb ? 3 : 1];
			    int i_17_ = -1;
			    if (!(var_ni instanceof NPC))
				i_17_ = ((cg) var_ni.k(32195)).Q;
			    else {
				i_17_ = ((NPCDef) var_du).E;
				if ((i_17_ ^ 0xffffffff) == 0)
				    i_17_ = ((cg) var_ni.k(32195)).Q;
			    }
			    if (i_17_ != -1) {
				f[] var_fs
				    = (f[]) gba.t.get((long) i_17_, (byte) 100);
				if (var_fs == null) {
				    aga[] var_agas = aga.b(sm.a, i_17_, 0);
				    if (var_agas != null) {
					var_fs = new f[var_agas.length];
					for (int i_18_ = 0;
					     var_agas.length > i_18_; i_18_++)
					    var_fs[i_18_]
						= lg.r.a(var_agas[i_18_],
							 true);
					gba.t.put((long) i_17_, var_fs, 1);
				    }
				}
				if (var_fs != null && var_fs.length == 4) {
				    var_f = var_fs[((Entity) var_ni).kb ? 2 : 0];
				    var_f_16_
					= var_fs[((Entity) var_ni).kb ? 3 : 1];
				}
			    }
			    int i_19_ = ((Entity) var_ni).Y - pm.currentTimedTicks;
			    int i_20_;
			    if (i_19_ <= ((Entity) var_ni).dc)
				i_20_ = var_f.E();
			    else {
				i_19_ -= ((Entity) var_ni).dc;
				int i_21_ = (((Entity) var_ni).fb != 0
					     ? ((((Entity) var_ni).ac - i_19_)
						/ ((Entity) var_ni).fb
						* ((Entity) var_ni).fb)
					     : 0);
				i_20_ = i_21_ * var_f.E() / ((Entity) var_ni).ac;
			    }
			    int i_22_ = var_f.u();
			    i_8_ -= i_22_;
			    int i_23_ = i_1_ + (lt.h[0] - (var_f.E() >> 1));
			    var_f.a(i_23_, i_8_);
			    lg.r.V(i_23_, i_8_, i_23_ + i_20_, i_22_ + i_8_);
			    var_f_16_.a(i_23_, i_8_);
			    lg.r.da(i_1_, i_0_, i_1_ + i_5_, i_0_ + i_2_);
			    i_8_ -= 2;
			}
			if (i_7_ < i_6_) {
			    Player var_qi = (Player) var_ni;
			    if ((((Player) var_qi).Hd ^ 0xffffffff) != 0) {
				i_8_ -= 25;
				od.ob[((Player) var_qi).Hd]
				    .a(lt.h[0] + (i_1_ - 12), i_8_);
				i_8_ -= 2;
			    }
			    if ((((Player) var_qi).vd ^ 0xffffffff) != 0) {
				i_8_ -= 25;
				ak.e[((Player) var_qi).vd].a(lt.h[0] + i_1_ - 12,
							 i_8_);
				i_8_ -= 2;
			    }
			} else if (((NPCDef) var_du).bb >= 0
				   && ((NPCDef) var_du).bb < ak.e.length) {
			    f var_f = ak.e[((NPCDef) var_du).bb];
			    i_8_ -= 25;
			    var_f.a(i_1_ + lt.h[0] - (var_f.E() >> 1), i_8_);
			    i_8_ -= 2;
			}
		    }
		    if (!(var_ni instanceof Player)) {
			int i_24_ = 0;
			on[] var_ons = Class_fb.j;
			for (int i_25_ = 0; var_ons.length > i_25_; i_25_++) {
			    on var_on = var_ons[i_25_];
			    if (var_on != null && ((on) var_on).a == 1
				&& ((on) var_on).e == gfa.npcIndices[i_7_ - i_6_]) {
				f var_f = vq.h[((on) var_on).b];
				if (i_24_ < var_f.u())
				    i_24_ = var_f.u();
				if (pm.currentTimedTicks % 20 < 10)
				    var_f.a(i_1_ - 12 + lt.h[0],
					    i_8_ - var_f.u());
			    }
			}
			if (i_24_ > 0)
			    i_8_ -= i_24_ + 2;
		    } else if (i_7_ >= 0) {
			int i_26_ = 0;
			on[] var_ons = Class_fb.j;
			for (int i_27_ = 0; var_ons.length > i_27_; i_27_++) {
			    on var_on = var_ons[i_27_];
			    if (var_on != null && ((on) var_on).a == 10
				&& is[i_7_] == ((on) var_on).e) {
				f var_f = vq.h[((on) var_on).b];
				if (var_f.u() > i_26_)
				    i_26_ = var_f.u();
				var_f.a(lt.h[0] + i_1_ - 12, i_8_ - var_f.u());
			    }
			}
			if (i_26_ > 0)
			    i_8_ -= i_26_ + 2;
		    }
		    for (int i_28_ = 0; i_28_ < 4; i_28_++) {
			if (pm.currentTimedTicks < ((Entity) var_ni).counters[i_28_]) {
			    int i_29_ = var_ni.j(17566) / 2;
			    bfa.a(i_29_, var_ni, i, i_2_ >> 1, 4, i_5_ >> 1,
				  i_4_);
			    if (lt.h[0] > -1) {
				int i_30_ = io.V[((Entity) var_ni).hitTypes[i_28_]].E();
				if (i_28_ == 1)
				    lt.h[1] -= 20;
				if (i_28_ == 2) {
				    lt.h[0] -= i_30_ - 9;
				    lt.h[1] -= 10;
				}
				if (i_28_ == 3) {
				    lt.h[0] += i_30_ - 9;
				    lt.h[1] -= 10;
				}
				io.V[((Entity) var_ni).hitTypes[i_28_]].a
				    (i_1_ + lt.h[0] - (i_30_ >> 1),
				     lt.h[1] + (i_0_ - 12));
				bq.e.a(-1, i_3_ ^ 0x6, i_1_ + lt.h[0] - 1, 0,
				       lt.h[1] + i_0_ + 3,
				       Integer
					   .toString(((Entity) var_ni).hitDamages[i_28_]));
			    }
			}
		    }
		}
	    }
	}
	for (int i_31_ = 0; i_31_ < Player.Sd; i_31_++) {
	    int i_32_ = qea.e[i_31_];
	    Entity var_ni;
	    if (i_32_ < 2048)
		var_ni = Class_fc.playersInScreen[i_32_];
	    else
		var_ni = ((NPCNode) (NPCNode) uo.a.a(-32748, (long) (i_32_ - 2048))).npc;
	    int i_33_ = mm.B[i_31_];
	    Entity var_ni_34_;
	    if (i_33_ < 2048)
		var_ni_34_ = Class_fc.playersInScreen[i_33_];
	    else
		var_ni_34_
		    = ((NPCNode) (NPCNode) uo.a.a(-32748, (long) (i_33_ - 2048))).npc;
	    fi.a(var_ni, 1071156814, i_4_, --((Entity) var_ni).jc, var_ni_34_,
		 i_0_, i_1_, i_5_, i, i_2_);
	}
	int i_35_ = ((sa) dca.R).n + (((sa) dca.R).b + 2);
	for (int i_36_ = 0; i_36_ < ui.f; i_36_++) {
	    int i_37_ = cl.a[i_36_];
	    int i_38_ = cl.i[i_36_];
	    int i_39_ = cl.m[i_36_];
	    boolean bool = true;
	    while (bool) {
		bool = false;
		for (int i_40_ = 0; i_36_ > i_40_; i_40_++) {
		    if (i_38_ + 2 > cl.i[i_40_] - i_35_
			&& cl.i[i_40_] + 2 > i_38_ - i_35_
			&& i_37_ - i_39_ < cl.a[i_40_] + cl.m[i_40_]
			&& i_37_ + i_39_ > cl.a[i_40_] - cl.m[i_40_]
			&& cl.i[i_40_] - i_35_ < i_38_) {
			bool = true;
			i_38_ = cl.i[i_40_] - i_35_;
		    }
		}
	    }
	    cl.i[i_36_] = i_38_;
	    String string = cl.c[i_36_];
	    if (jb.D != 0)
		pv.j.a(-256, -142, i_37_ + i_1_, -16777216, i_38_ + i_0_,
		       string);
	    else {
		int i_41_ = 16776960;
		if (cl.e[i_36_] < 6)
		    i_41_ = ki.a[cl.e[i_36_]];
		if (cl.e[i_36_] == 6)
		    i_41_ = sh.j % 20 < 10 ? 16711680 : 16776960;
		if (cl.e[i_36_] == 7)
		    i_41_ = sh.j % 20 >= 10 ? 65535 : 255;
		if (cl.e[i_36_] == 8)
		    i_41_ = sh.j % 20 < 10 ? 45056 : 8454016;
		if (cl.e[i_36_] == 9) {
		    int i_42_ = -cl.p[i_36_] + 150;
		    if (i_42_ >= 50) {
			if (i_42_ < 100)
			    i_41_ = -(327680 * i_42_) + 33160960;
			else if (i_42_ < 150)
			    i_41_ = (i_42_ - 100) * 5 + 65280;
		    } else
			i_41_ = i_42_ * 1280 + 16711680;
		}
		if (cl.e[i_36_] == 10) {
		    int i_43_ = -cl.p[i_36_] + 150;
		    if (i_43_ < 50)
			i_41_ = 16711680 + 5 * i_43_;
		    else if (i_43_ >= 100) {
			if (i_43_ < 150)
			    i_41_
				= (i_43_ - 100) * 327680 + (255 - 5 * (i_43_
								       - 100));
		    } else
			i_41_ = -((i_43_ - 50) * 327680) + 16711935;
		}
		if (cl.e[i_36_] == 11) {
		    int i_44_ = 150 - cl.p[i_36_];
		    if (i_44_ >= 50) {
			if (i_44_ >= 100) {
			    if (i_44_ < 150)
				i_41_ = -((i_44_ - 100) * 327680) + 16777215;
			} else
			    i_41_ = (i_44_ - 50) * 327685 + 65280;
		    } else
			i_41_ = 16777215 - 327685 * i_44_;
		}
		int i_45_ = ~0xffffff | i_41_;
		if (cl.h[i_36_] == 0)
		    pv.j.a(i_45_, -142, i_1_ + i_37_, -16777216, i_38_ + i_0_,
			   string);
		if (cl.h[i_36_] == 1)
		    pv.j.a(i_37_ + i_1_, i_0_ + i_38_, -16777216, sh.j, i_45_,
			   i_3_ + 15382, string);
		if (cl.h[i_36_] == 2)
		    pv.j.a(i_38_ + i_0_, -16777216, i_45_, string,
			   i_1_ + i_37_, sh.j, (byte) -106);
		if (cl.h[i_36_] == 3)
		    pv.j.a((byte) 93, sh.j, string, i_0_ + i_38_, -16777216,
			   i_45_, -cl.p[i_36_] + 150, i_37_ + i_1_);
		if (cl.h[i_36_] == 4) {
		    int i_46_ = ((-cl.p[i_36_] + 150)
				 * (dca.R.a((byte) 99, string) + 100) / 150);
		    lg.r.V(i_1_ + i_37_ - 50, i_0_, i_37_ + (i_1_ + 50),
			   i_2_ + i_0_);
		    pv.j.a(i_45_, true, i_37_ + i_1_ - (i_46_ - 50), string,
			   -16777216, i_38_ + i_0_);
		    lg.r.da(i_1_, i_0_, i_1_ + i_5_, i_2_ + i_0_);
		}
		if (cl.h[i_36_] == 5) {
		    int i_47_ = 150 - cl.p[i_36_];
		    int i_48_ = 0;
		    if (i_47_ >= 25) {
			if (i_47_ > 125)
			    i_48_ = i_47_ - 125;
		    } else
			i_48_ = i_47_ - 25;
		    int i_49_ = ((sa) dca.R).b + ((sa) dca.R).n;
		    lg.r.V(i_1_, i_0_ - i_49_ + (i_38_ - 1), i_5_ + i_1_,
			   i_38_ + (i_0_ + 5));
		    pv.j.a(i_45_, -142, i_37_ + i_1_, -16777216,
			   i_38_ + (i_0_ + i_48_), string);
		    lg.r.da(i_1_, i_0_, i_5_ + i_1_, i_2_ + i_0_);
		}
	    }
	}
    }
    
    static final void a(int i) {
	a++;
	synchronized (hv.p) {
	    if (i < 110)
		g = null;
	    hv.p.a(18385);
	}
    }
    
    static final void a(int i, int i_50_, int i_51_, int i_52_, byte i_53_,
			int i_54_, int i_55_, Interface[] var_kps, int i_56_,
			int i_57_) {
	e++;
	lg.r.da(i_51_, i, i_54_, i_50_);
	if (i_53_ != -4)
	    a(31, -71, -93, -8, -21, -82, 43);
	for (int i_58_ = 0; i_58_ < var_kps.length; i_58_++) {
	    Interface var_kp = var_kps[i_58_];
	    if (var_kp != null
		&& (((Interface) var_kp).parentID == i_57_
		    || i_57_ == -1412584499 && var_kp == kr.a)) {
		int i_59_;
		if (i_55_ == -1) {
		    ng.s[rba.m].setBounds(i_52_ + ((Interface) var_kp).locX,
					  ((Interface) var_kp).locY + i_56_,
					  ((Interface) var_kp).minHScroll, ((Interface) var_kp).minVScroll);
		    i_59_ = rba.m++;
		} else
		    i_59_ = i_55_;
		((Interface) var_kp).Xb = i_59_;
		((Interface) var_kp).Ac = pm.currentTimedTicks;
		if (!client.isHidden(var_kp)) {
		    if (((Interface) var_kp).v != 0)
			os.a(var_kp, 108);
		    int i_60_ = ((Interface) var_kp).locX + i_52_;
		    int i_61_ = ((Interface) var_kp).locY + i_56_;
		    int i_62_ = ((Interface) var_kp).mb;
		    if (lba.qa_op_test && (((nm) client.c(var_kp)).l != 0
				  || ((Interface) var_kp).type == 0) && i_62_ > 127)
			i_62_ = 127;
		    if (var_kp == kr.a) {
			if (i_57_ != -1412584499
			    && (((Interface) var_kp).od == nk.a
				|| ((Interface) var_kp).od == ao.k)) {
			    jga.s = i_52_;
			    WorldSub.interfaces = var_kps;
			    qf.h = i_56_;
			    continue;
			}
			if (fj.z && wd.f) {
			    int i_63_ = Class_md.e.d(2000);
			    int i_64_ = Class_md.e.b((int) 95);
			    i_63_ -= pea.c;
			    i_64_ -= mm.q;
			    if (pv.x_ > i_63_)
				i_63_ = pv.x_;
			    if (ur.y_ > i_64_)
				i_64_ = ur.y_;
			    if (i_63_ + ((Interface) var_kp).minHScroll
				> ((Interface) rca.e).minHScroll + pv.x_)
				i_63_ = (pv.x_ - ((Interface) var_kp).minHScroll
					 + ((Interface) rca.e).minHScroll);
			    i_60_ = i_63_;
			    if (((Interface) rca.e).minVScroll + ur.y_
				< i_64_ + ((Interface) var_kp).minVScroll)
				i_64_
				    = ((Interface) rca.e).minVScroll + ur.y_ - ((Interface) var_kp).minVScroll;
			    i_61_ = i_64_;
			}
			if (ao.k == ((Interface) var_kp).od)
			    i_62_ = 128;
		    }
		    int i_65_;
		    int i_66_;
		    int i_67_;
		    int i_68_;
		    if (((Interface) var_kp).type != 2) {
			int i_69_ = i_60_ + ((Interface) var_kp).minHScroll;
			int i_70_ = ((Interface) var_kp).minVScroll + i_61_;
			if (((Interface) var_kp).type == 9) {
			    i_70_++;
			    i_69_++;
			}
			i_68_ = i_60_ > i_51_ ? i_60_ : i_51_;
			i_65_ = i_61_ > i ? i_61_ : i;
			i_67_ = i_54_ <= i_69_ ? i_54_ : i_69_;
			i_66_ = i_50_ > i_70_ ? i_70_ : i_50_;
		    } else {
			i_65_ = i;
			i_66_ = i_50_;
			i_67_ = i_54_;
			i_68_ = i_51_;
		    }
		    if (i_67_ > i_68_ && i_66_ > i_65_) {
			if (((Interface) var_kp).v != 0) {
			    if (((Interface) var_kp).v == lp.f
				|| sm.i == ((Interface) var_kp).v) {
				ri.a(false, sm.i == ((Interface) var_kp).v, i_61_,
				     ((Interface) var_kp).minHScroll, i_60_, ((Interface) var_kp).minVScroll);
				la.q[i_59_] = true;
				lg.r.da(i_51_, i, i_54_, i_50_);
				continue;
			    }
			    if (((Interface) var_kp).v == tm.o) {
				if (var_kp.a((byte) 125, lg.r) != null) {
				    naa.d((byte) 76);
				    daa.a(var_kp, lg.r, 125, i_60_, i_61_);
				    cj.c[i_59_] = true;
				    lg.r.da(i_51_, i, i_54_, i_50_);
				}
				continue;
			    }
			    if (ge.U == ((Interface) var_kp).v) {
				if (var_kp.a((byte) 125, lg.r) != null) {
				    cga.a(i_53_ ^ ~0x3ffc, var_kp, i_60_,
					  i_61_);
				    cj.c[i_59_] = true;
				    lg.r.da(i_51_, i, i_54_, i_50_);
				}
				continue;
			    }
			    if (((Interface) var_kp).v == Class_jg.O) {
				sm.a(i_61_, lg.r, i_60_, (byte) -34,
				     ((Interface) var_kp).minVScroll, ((Interface) var_kp).minHScroll, on.c);
				la.q[i_59_] = true;
				lg.r.da(i_51_, i, i_54_, i_50_);
				continue;
			    }
			    if (sfa.c == ((Interface) var_kp).v) {
				Class_lc.a(-116, i_60_, ((Interface) var_kp).minVScroll,
					   ((Interface) var_kp).minHScroll, i_61_, lg.r);
				la.q[i_59_] = true;
				lg.r.da(i_51_, i, i_54_, i_50_);
				continue;
			    }
			    if (((Interface) var_kp).v == cfa.a) {
				if (sl.fpsOn || ht.showProfiling) {
				    int i_71_ = ((Interface) var_kp).minHScroll + i_60_;
				    int i_72_ = i_61_ + 15;
				    if (sl.fpsOn) {
					int i_73_ = -256;
					if (fu.fps < 20)
					    i_73_ = -65536;
					pm.v.a(i_71_, i_72_, "Fps:" + fu.fps,
					       i_73_, -1, -87);
					i_72_ += 15;
					Runtime runtime = Runtime.getRuntime();
					int i_74_
					    = (int) ((runtime.totalMemory()
						      - runtime.freeMemory())
						     / 1024L);
					int i_75_ = -256;
					if (i_74_ > 98304) {
					    i_75_ = -65536;
					    if (ce.forced64mb) {
						ffa.gcContainer(4096);
						for (int i_76_ = 0; i_76_ < 10;
						     i_76_++)
						    System.gc();
						i_74_
						    = (int) (((runtime
								   .totalMemory
							       ())
							      - (runtime
								     .freeMemory
								 ()))
							     / 1024L);
						if (i_74_ > 65536)
						    cba.a
							(4, false,
							 "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
					    }
					}
					pm.v.a(i_71_, i_72_,
					       "Mem:" + i_74_ + "loginStream", i_75_, -1,
					       -56);
					i_72_ += 15;
					pm.v.a(i_71_, i_72_,
					       ("In:" + jv.r + "B/s Out:"
						+ qh.s + "B/s"),
					       -256, -1, -101);
					i_72_ += 15;
					int i_77_ = lg.r.b() / 1024;
					pm.v.a(i_71_, i_72_,
					       "Offheap:" + i_77_ + "loginStream",
					       i_77_ > 65536 ? -65536 : -256,
					       -1, -83);
					i_72_ += 15;
					int i_78_ = 0;
					int i_79_ = 0;
					int i_80_ = 0;
					for (int i_81_ = 0; i_81_ < 35;
					     i_81_++) {
					    if (GPIPlayer.pdas[i_81_] != null) {
						i_78_ += GPIPlayer.pdas[i_81_].b(false);
						i_79_ += GPIPlayer.pdas[i_81_].c(-14311);
						i_80_ += GPIPlayer.pdas[i_81_].a(true);
					    }
					}
					int i_82_ = 100 * i_80_ / i_78_;
					int i_83_ = i_79_ * 10000 / i_78_;
					String string
					    = ("Cache:"
					       + bfa.a(0, 7110, (long) i_83_,
						       true, 2)
					       + "% (" + i_82_ + "%)");
					bq.e.a(i_71_, i_72_, string, -256, -1,
					       i_53_ - 104);
					i_72_ += 12;
				    }
				    if (daa.cb > 0)
					bq.e.a(i_71_, i_72_,
					       ("Particles: " + lt.a + " / "
						+ daa.cb),
					       -256, -1, -126);
				    i_72_ += 12;
				    if (ht.showProfiling) {
					bq.e.a(i_71_, i_72_,
					       ("Polys: " + lg.r.DA()
						+ " Models: " + lg.r.T()),
					       -256, -1, i_53_ ^ 0x31);
					i_72_ += 12;
					bq.e.a(i_71_, i_72_,
					       ("Ls: " + tp.b + " La: " + bfa.A
						+ " NPC: " + gd.f + " Pl: "
						+ ml.j),
					       -256, -1, i_53_ - 73);
					dd.renderProfile(0);
					i_72_ += 12;
				    }
				    la.q[i_59_] = true;
				}
				continue;
			    }
			}
			if (((Interface) var_kp).type == 0) {
			    if (en.Sc == ((Interface) var_kp).v && lg.r.bloom())
				lg.r.a(i_60_, i_61_, ((Interface) var_kp).minHScroll,
				       ((Interface) var_kp).minVScroll);
			    a(i_65_, i_66_, i_68_, i_60_ - ((Interface) var_kp).hScroll,
			      (byte) -4, i_67_, i_59_, var_kps,
			      i_61_ - ((Interface) var_kp).vScroll, ((Interface) var_kp).interfaceID);
			    if (((Interface) var_kp).children != null)
				a(i_65_, i_66_, i_68_,
				  i_60_ - ((Interface) var_kp).hScroll, (byte) -4, i_67_,
				  i_59_, ((Interface) var_kp).children,
				  i_61_ - ((Interface) var_kp).vScroll, ((Interface) var_kp).interfaceID);
			    tt var_tt = (tt) ida.l.a(-32748,
						     (long) ((Interface) var_kp).interfaceID);
			    if (var_tt != null)
				or.a(i_61_, (byte) -23, i_66_, i_59_, i_67_,
				     ((tt) var_tt).l, i_68_, i_65_, i_60_);
			    if (en.Sc == ((Interface) var_kp).v && lg.r.bloom())
				lg.r.j();
			    lg.r.da(i_51_, i, i_54_, i_50_);
			}
			if (sr.T[i_59_] || lt.rectValue > 1) {
			    if (((Interface) var_kp).type == 3) {
				if (i_62_ == 0) {
				    if (!((Interface) var_kp).c)
					lg.r.c(i_60_, i_61_, ((Interface) var_kp).minHScroll,
					       ((Interface) var_kp).minVScroll,
					       ((Interface) var_kp).textColor, 0);
				    else
					lg.r.J(i_60_, i_61_, ((Interface) var_kp).minHScroll,
					       ((Interface) var_kp).minVScroll,
					       ((Interface) var_kp).textColor, 0);
				} else if (((Interface) var_kp).c)
				    lg.r.J(i_60_, i_61_, ((Interface) var_kp).minHScroll,
					   ((Interface) var_kp).minVScroll,
					   (255 - (0xff & i_62_) << 24
					    | 0xffffff & ((Interface) var_kp).textColor),
					   1);
				else
				    lg.r.c(i_60_, i_61_, ((Interface) var_kp).minHScroll,
					   ((Interface) var_kp).minVScroll,
					   (-(0xff & i_62_) + 255 << 24
					    | 0xffffff & ((Interface) var_kp).textColor),
					   1);
			    } else if (((Interface) var_kp).type == 4) {
				la var_la = var_kp.b(lg.r, i_53_ - 7226);
				if (var_la == null) {
				    if (fo.r)
					tn.a(var_kp, 1023);
				} else {
				    int i_84_ = ((Interface) var_kp).textColor;
				    String string = ((Interface) var_kp).text;
				    if ((((Interface) var_kp).itemID ^ 0xffffffff) != 0) {
					ItemDef var_uv
					    = laa.itemDefLoader.d(12388, ((Interface) var_kp).itemID);
					string = ((ItemDef) var_uv).itemName;
					if (string == null)
					    string = "null";
					if ((((ItemDef) var_uv).stackable == 1
					     || ((Interface) var_kp).itemStackSize != 1)
					    && ((Interface) var_kp).itemStackSize != -1)
					    string
						= ("<col=ff9040>" + string
						   + "</col> x"
						   + mga.a(true,
							   ((Interface) var_kp).itemStackSize));
				    }
				    if (rd.D == var_kp) {
					string = GameText.pleaseWaitText.getString(cba.languageID);
					i_84_ = ((Interface) var_kp).textColor;
				    }
				    if (ji.clipComponents)
					lg.r.V(i_60_, i_61_,
					       i_60_ + ((Interface) var_kp).minHScroll,
					       ((Interface) var_kp).minVScroll + i_61_);
				    var_la.a((((Interface) var_kp).isInventoryInterface
					      ? -(0xff & i_62_) + 255 << 24
					      : -1),
					     null, string, i_61_,
					     (-(i_62_ & 0xff) + 255 << 24
					      | i_84_),
					     true, null, 0, ((Interface) var_kp).Db,
					     i_60_, ((Interface) var_kp).minHScroll, sp.s, 0,
					     ((Interface) var_kp).r, ((Interface) var_kp).Z,
					     ((Interface) var_kp).minVScroll,
					     ((Interface) var_kp).Fb);
				    if (ji.clipComponents)
					lg.r.da(i_51_, i, i_54_, i_50_);
				}
			    } else if (((Interface) var_kp).type == 5) {
				if (((Interface) var_kp).yc < 0) {
				    f var_f;
				    if (((Interface) var_kp).itemID == -1)
					var_f = var_kp.a(lg.r, i_53_ - 42);
				    else {
					PlayerDef var_kn = (((Interface) var_kp).ib
						     ? ((Player) up.thisPlayer).playerDef : null);
					var_f
					    = laa.itemDefLoader.a((((Interface) var_kp).shadowColor
						       | ~0xffffff),
						      ((Interface) var_kp).itemID, var_kn,
						      lg.r, ((Interface) var_kp).itemStackSize,
						      ((Interface) var_kp).borderThickness, 124,
						      ((Interface) var_kp).Rc);
				    }
				    if (var_f == null) {
					if (fo.r)
					    tn.a(var_kp, i_53_ + 1027);
				    } else {
					int i_85_ = var_f.A();
					int i_86_ = var_f.ca();
					int i_87_
					    = (-(0xff & i_62_) + 255 << 24
					       | (((Interface) var_kp).textColor == 0
						  ? 16777215
						  : (((Interface) var_kp).textColor
						     & 0xffffff)));
					if (!((Interface) var_kp).jd) {
					    if (((Interface) var_kp).textColor != 0
						|| i_62_ != 0) {
						if (((Interface) var_kp).db == 0) {
						    if ((i_85_
							 == ((Interface) var_kp).minHScroll)
							&& (((Interface) var_kp).minVScroll
							    == i_86_))
							var_f.V(i_60_, i_61_,
								0, i_87_, 1);
						    else
							var_f.a(i_60_, i_61_,
								(((Interface) var_kp)
								 .minHScroll),
								(((Interface) var_kp)
								 .minVScroll),
								0, i_87_, 1);
						} else
						    var_f.a
							(((float) i_60_
							  + ((float) (((Interface)
								       var_kp)
								      .minHScroll)
							     / 2.0F)),
							 ((float) i_61_
							  + ((float) ((Interface)
								      var_kp).minVScroll
							     / 2.0F)),
							 (((Interface) var_kp).minHScroll
							  * 4096 / i_85_),
							 ((Interface) var_kp).db, 0,
							 i_87_, 1);
					    } else if (((Interface) var_kp).db != 0)
						var_f.a(((float) i_60_
							 + ((float) ((Interface)
								     var_kp).minHScroll
							    / 2.0F)),
							((float) (((Interface) var_kp)
								  .minVScroll) / 2.0F
							 + (float) i_61_),
							(4096
							 * ((Interface) var_kp).minHScroll
							 / i_85_),
							((Interface) var_kp).db);
					    else if (i_85_ != ((Interface) var_kp).minHScroll
						     || (((Interface) var_kp).minVScroll
							 != i_86_))
						var_f.a(i_60_, i_61_,
							((Interface) var_kp).minHScroll,
							((Interface) var_kp).minVScroll);
					    else
						var_f.a(i_60_, i_61_);
					} else {
					    lg.r.V(i_60_, i_61_,
						   ((Interface) var_kp).minHScroll + i_60_,
						   ((Interface) var_kp).minVScroll + i_61_);
					    if (((Interface) var_kp).db == 0) {
						if (((Interface) var_kp).textColor == 0
						    && i_62_ == 0)
						    var_f.b(i_60_, i_61_,
							    ((Interface) var_kp).minHScroll,
							    ((Interface) var_kp).minVScroll);
						else
						    var_f.DA(i_60_, i_61_,
							     ((Interface) var_kp).minHScroll,
							     ((Interface) var_kp).minVScroll,
							     0, i_87_, 1);
					    } else {
						int i_88_
						    = ((-1
							- (-i_85_
							   - ((Interface) var_kp).minHScroll))
						       / i_85_);
						int i_89_ = ((((Interface) var_kp).minVScroll
							      + i_86_ - 1)
							     / i_86_);
						for (int i_90_ = 0;
						     i_88_ > i_90_; i_90_++) {
						    for (int i_91_ = 0;
							 i_89_ > i_91_;
							 i_91_++) {
							if (((Interface) var_kp).textColor
							    == 0)
							    var_f.a
								((((float) i_85_
								   / 2.0F)
								  + (float) (i_90_ * i_85_
									     + i_60_)),
								 (((float) i_86_
								   / 2.0F)
								  + (float) (i_61_
									     + i_91_ * i_86_)),
								 4096,
								 (((Interface) var_kp)
								  .db));
							else
							    var_f.a
								(((float) (i_60_
									   + i_90_ * i_85_)
								  + ((float) i_85_
								     / 2.0F)),
								 ((float) (i_61_
									   + i_86_ * i_91_)
								  + ((float) i_86_
								     / 2.0F)),
								 4096,
								 (((Interface) var_kp)
								  .db),
								 0, i_87_, 1);
						    }
						}
					    }
					    lg.r.da(i_51_, i, i_54_, i_50_);
					}
				    }
				} else
				    var_kp.a(hi.u, ps.a, (byte) 106).a
					(0, i_60_, i_61_, ((Interface) var_kp).minVScroll,
					 (byte) -100, ((Interface) var_kp).Zb << 3,
					 ((Interface) var_kp).minHScroll, 0,
					 ((Interface) var_kp).gc << 3, lg.r);
			    } else if (((Interface) var_kp).type == 6) {
				ja.c(-240);
				da var_da = null;
				int i_92_ = 0;
				if ((((Interface) var_kp).itemID ^ 0xffffffff) != 0) {
				    ItemDef var_uv
					= laa.itemDefLoader.d(12388, ((Interface) var_kp).itemID);
				    if (var_uv != null) {
					var_uv
					    = var_uv.a(((Interface) var_kp).itemStackSize, -2);
					dr var_dr
					    = (((((Interface) var_kp).V ^ 0xffffffff)
						== 0)
					       ? null
					       : Class_ef.J
						     .c(64, ((Interface) var_kp).V));
					PlayerDef var_kn = (((Interface) var_kp).ib
						     ? ((Player) up.thisPlayer).playerDef : null);
					var_da
					    = var_uv.a(((Interface) var_kp).R, lg.r,
						       2048, var_dr,
						       ((Interface) var_kp).s, var_kn,
						       1, ((Interface) var_kp).rc,
						       16777215);
					if (var_da != null)
					    i_92_ = -var_da.J() >> 1;
					else
					    tn.a(var_kp, i_53_ + 1027);
				    }
				} else if (((Interface) var_kp).modelType == 5) {
				    int i_93_ = ((Interface) var_kp).modelID;
				    if (i_93_ >= 0 && i_93_ < 2048) {
					Player var_qi = Class_fc.playersInScreen[i_93_];
					dr var_dr
					    = (((Interface) var_kp).V != -1
					       ? Class_ef.J.c(64,
							      ((Interface) var_kp).V)
					       : null);
					if (var_qi != null
					    && (ih.n == i_93_
						|| (hl.a(((Player) var_qi).displayName,
							 false)
						    == ((Interface) var_kp).U)))
					    var_da = (((Player) var_qi).playerDef.a
						      (Class_ae.n, Class_ef.J,
						       2048, laa.itemDefLoader, var_dr,
						       jm.p, null, cp.e,
						       ((Interface) var_kp).R, -1,
						       null, ((Interface) var_kp).s,
						       ((Interface) var_kp).rc, 0,
						       hs.f, lg.r, 0, true,
						       (byte) 125));
				    }
				} else if (((Interface) var_kp).modelType != 8
					   && ((Interface) var_kp).modelType != 9) {
				    if (((Interface) var_kp).V != -1) {
					dr var_dr
					    = Class_ef.J.c(i_53_ + 68,
							   ((Interface) var_kp).V);
					var_da
					    = var_kp.a(lg.r, cp.e,
						       ((Interface) var_kp).R, hs.f,
						       laa.itemDefLoader, -108, Class_ae.n,
						       var_dr, ((Player) up.thisPlayer).playerDef,
						       ((Interface) var_kp).rc, 2048,
						       jm.p, ((Interface) var_kp).s,
						       Class_ef.J);
					if (var_da == null && fo.r)
					    tn.a(var_kp, i_53_ ^ ~0x3fc);
				    } else {
					var_da = var_kp.a(lg.r, cp.e, 0, hs.f,
							  laa.itemDefLoader, i_53_ ^ 0x72,
							  Class_ae.n, null,
							  ((Player) up.thisPlayer).playerDef, -1,
							  2048, jm.p, -1,
							  Class_ef.J);
					if (var_da == null && fo.r)
					    tn.a(var_kp, i_53_ + 1027);
				    }
				} else {
				    hg var_hg = el.a(false, (byte) 53,
						     ((Interface) var_kp).modelID);
				    dr var_dr
					= (((Interface) var_kp).V == -1 ? null
					   : Class_ef.J.c(i_53_ + 68,
							  ((Interface) var_kp).V));
				    if (var_hg != null) {
					PlayerDef var_kn = (!((Interface) var_kp).ib ? null
						     : ((Player) up.thisPlayer).playerDef);
					var_da
					    = var_hg.a(-1, ((Interface) var_kp).rc,
						       2048, ((Interface) var_kp).R,
						       ((Interface) var_kp).modelType == 9,
						       lg.r, var_kn,
						       ((Interface) var_kp).s,
						       ((Interface) var_kp).U,
						       var_dr);
				    }
				}
				if (var_da != null) {
				    int i_94_;
				    if (((Interface) var_kp).n > 0)
					i_94_ = ((((Interface) var_kp).minHScroll << 9)
						 / ((Interface) var_kp).n);
				    else
					i_94_ = 512;
				    int i_95_;
				    if (((Interface) var_kp).dc > 0)
					i_95_ = ((((Interface) var_kp).minVScroll << 9)
						 / ((Interface) var_kp).dc);
				    else
					i_95_ = 512;
				    int i_96_ = i_60_ + ((Interface) var_kp).minHScroll / 2;
				    int i_97_ = ((Interface) var_kp).minVScroll / 2 + i_61_;
				    if (!((Interface) var_kp).C) {
					i_96_ += i_94_ * ((Interface) var_kp).vb >> 9;
					i_97_ += i_95_ * ((Interface) var_kp).H >> 9;
				    }
				    tg.G.Y();
				    lg.r.a(tg.G);
				    lg.r.la(i_96_, i_97_, i_94_, i_95_);
				    lg.r.ya();
				    if (((Interface) var_kp).ad)
					lg.r.ZA(false);
				    if (((Interface) var_kp).C) {
					br.n.oa(((Interface) var_kp).modelRotationX);
					br.n.ZA(((Interface) var_kp).modelRotationY);
					br.n.AA(((Interface) var_kp).modelRotationZ);
					br.n.U(((Interface) var_kp).vb,
					       ((Interface) var_kp).H,
					       ((Interface) var_kp).O);
				    } else {
					int i_98_
					    = (((((Interface) var_kp).modelZoom << 2)
						* GameInPacket.ints1[((Interface) var_kp).modelRotationX << 3])
					       >> 14);
					int i_99_
					    = ((GameInPacket.ints2[((Interface) var_kp).modelRotationX << 3]
						* (((Interface) var_kp).modelZoom << 2))
					       >> 14);
					br.n.J(-((Interface) var_kp).modelRotationZ << 3);
					br.n.ZA(((Interface) var_kp).modelRotationY << 3);
					br.n.U(((Interface) var_kp).Ec << 2,
					       i_92_ + (i_98_
							+ (((Interface) var_kp).wc
							   << 2)),
					       i_99_ + (((Interface) var_kp).wc
							<< 2));
					br.n.w(((Interface) var_kp).modelRotationX << 3);
				    }
				    var_kp.a((byte) 55, var_da, br.n, lg.r,
					     pm.currentTimedTicks);
				    if (ji.clipComponents)
					lg.r.V(i_60_, i_61_,
					       ((Interface) var_kp).minHScroll + i_60_,
					       i_61_ + ((Interface) var_kp).minVScroll);
				    if (!((Interface) var_kp).C) {
					if (!((Interface) var_kp).w) {
					    var_da.a(br.n, null, 1);
					    if (((Interface) var_kp).Qc != null)
						lg.r.a(((Interface) var_kp).Qc.a());
					} else
					    var_da.a(br.n, null,
						     ((Interface) var_kp).modelZoom << 2, 1);
				    } else if (((Interface) var_kp).w)
					var_da.a(br.n, null, ((Interface) var_kp).modelZoom,
						 1);
				    else {
					var_da.a(br.n, null, 1);
					if (((Interface) var_kp).Qc != null)
					    lg.r.a(((Interface) var_kp).Qc.a());
				    }
				    if (ji.clipComponents)
					lg.r.da(i_51_, i, i_54_, i_50_);
				    if (((Interface) var_kp).ad)
					lg.r.ZA(true);
				}
			    } else if (((Interface) var_kp).type == 9) {
				int i_100_;
				int i_101_;
				int i_102_;
				int i_103_;
				if (((Interface) var_kp).oc) {
				    i_100_ = i_61_;
				    i_103_ = ((Interface) var_kp).minHScroll + i_60_;
				    i_101_ = i_60_;
				    i_102_ = i_61_ + ((Interface) var_kp).minVScroll;
				} else {
				    i_100_ = ((Interface) var_kp).minVScroll + i_61_;
				    i_101_ = i_60_;
				    i_102_ = i_61_;
				    i_103_ = ((Interface) var_kp).minHScroll + i_60_;
				}
				if (((Interface) var_kp).X == 1)
				    lg.r.a(i_101_, i_102_, i_103_, i_100_,
					   ((Interface) var_kp).textColor, 0);
				else
				    lg.r.a(i_101_, i_102_, i_103_, i_100_,
					   ((Interface) var_kp).textColor, ((Interface) var_kp).X,
					   0);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void a(fn var_fn, int i, int i_104_, int i_105_, int i_106_) {
	d++;
	long l = (long) (i_104_ << 14 | i << 28 | i_106_);
	sba var_sba = (sba) jt.a.a(-32748, l);
	if (var_sba == null) {
	    var_sba = new sba();
	    jt.a.a(var_sba, (byte) -92, l);
	    ((sba) var_sba).o.b(var_fn, (byte) 93);
	} else if (i_105_ == -16777216) {
	    ItemDef var_uv = laa.itemDefLoader.d(12388, ((fn) var_fn).o);
	    int i_107_ = ((ItemDef) var_uv).value;
	    if (((ItemDef) var_uv).stackable == 1)
		i_107_ *= ((fn) var_fn).n + 1;
	    for (fn var_fn_108_ = (fn) ((sba) var_sba).o.a((int) 105);
		 var_fn_108_ != null;
		 var_fn_108_ = (fn) ((sba) var_sba).o.b((byte) 124)) {
		var_uv = laa.itemDefLoader.d(12388, ((fn) var_fn_108_).o);
		int i_109_ = ((ItemDef) var_uv).value;
		if (((ItemDef) var_uv).stackable == 1)
		    i_109_ *= ((fn) var_fn_108_).n + 1;
		if (i_109_ < i_107_) {
		    Class_pb.a(var_fn, var_fn_108_, i_105_ + 16777220);
		    return;
		}
	    }
	    ((sba) var_sba).o.b(var_fn, (byte) 93);
	}
    }
}
