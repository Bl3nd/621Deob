/* bj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import jagex3.jagmisc.jagmisc;

final class bj
{
    static int a;
    static float b;
    int c;
    private qj d;
    static int e;
    static int f;
    static int g;
    
    protected final void finalize() throws Throwable {
	d.a(((bj) this).c, (byte) 109);
	a++;
	super.finalize();
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
	ua.a(true, i_2_);
	e++;
	int i_6_ = 0;
	int i_7_ = i_2_ - i_4_;
	if (i_7_ < 0)
	    i_7_ = 0;
	int i_8_ = i_2_;
	int i_9_ = -i_2_;
	int i_10_ = i_7_;
	int i_11_ = -i_7_;
	int i_12_ = -1;
	if (Class_md.h <= i_0_ && Class_db.o >= i_0_) {
	    int[] is = wh.O[i_0_];
	    int i_13_ = sl.a(i_1_ - i_2_, i ^ ~0x51b2, vaa.xb, jga.v);
	    int i_14_ = sl.a(i_2_ + i_1_, 4095, vaa.xb, jga.v);
	    int i_15_ = sl.a(i_1_ - i_7_, 4095, vaa.xb, jga.v);
	    int i_16_ = sl.a(i_7_ + i_1_, 4095, vaa.xb, jga.v);
	    kg.a(i_13_, is, i_3_, i_15_, 38);
	    kg.a(i_15_, is, i_5_, i_16_, -104);
	    kg.a(i_16_, is, i_3_, i_14_, -125);
	}
	int i_17_ = -1;
	while (i_8_ > i_6_) {
	    i_12_ += 2;
	    i_17_ += 2;
	    i_9_ += i_12_;
	    i_11_ += i_17_;
	    if (i_11_ >= 0 && i_10_ >= 1) {
		i_10_--;
		i_11_ -= i_10_ << 1;
		cc.i[i_10_] = i_6_;
	    }
	    i_6_++;
	    if (i_9_ >= 0) {
		i_8_--;
		i_9_ -= i_8_ << 1;
		int i_18_ = i_0_ - i_8_;
		int i_19_ = i_0_ + i_8_;
		if (Class_md.h <= i_19_ && Class_db.o >= i_18_) {
		    if (i_7_ <= i_8_) {
			int i_20_
			    = sl.a(i_6_ + i_1_, i ^ ~0x51b2, vaa.xb, jga.v);
			int i_21_ = sl.a(i_1_ - i_6_, 4095, vaa.xb, jga.v);
			if (Class_db.o >= i_19_)
			    kg.a(i_21_, wh.O[i_19_], i_3_, i_20_, 13);
			if (i_18_ >= Class_md.h)
			    kg.a(i_21_, wh.O[i_18_], i_3_, i_20_, -106);
		    } else {
			int i_22_ = cc.i[i_8_];
			int i_23_ = sl.a(i_6_ + i_1_, 4095, vaa.xb, jga.v);
			int i_24_
			    = sl.a(i_1_ - i_6_, i ^ ~0x51b2, vaa.xb, jga.v);
			int i_25_ = sl.a(i_22_ + i_1_, 4095, vaa.xb, jga.v);
			int i_26_ = sl.a(i_1_ - i_22_, 4095, vaa.xb, jga.v);
			if (Class_db.o >= i_19_) {
			    int[] is = wh.O[i_19_];
			    kg.a(i_24_, is, i_3_, i_26_, 122);
			    kg.a(i_26_, is, i_5_, i_25_, i ^ 0x5e35);
			    kg.a(i_25_, is, i_3_, i_23_, -116);
			}
			if (i_18_ >= Class_md.h) {
			    int[] is = wh.O[i_18_];
			    kg.a(i_24_, is, i_3_, i_26_, i + 24034);
			    kg.a(i_26_, is, i_5_, i_25_, i ^ 0x5e3e);
			    kg.a(i_25_, is, i_3_, i_23_, 27);
			}
		    }
		}
	    }
	    int i_27_ = i_0_ - i_6_;
	    int i_28_ = i_0_ + i_6_;
	    if (i_28_ >= Class_md.h && Class_db.o >= i_27_) {
		int i_29_ = i_8_ + i_1_;
		int i_30_ = i_1_ - i_8_;
		if (vaa.xb <= i_29_ && i_30_ <= jga.v) {
		    i_29_ = sl.a(i_29_, i ^ ~0x51b2, vaa.xb, jga.v);
		    i_30_ = sl.a(i_30_, 4095, vaa.xb, jga.v);
		    if (i_6_ >= i_7_) {
			if (i_28_ <= Class_db.o)
			    kg.a(i_30_, wh.O[i_28_], i_3_, i_29_, -113);
			if (Class_md.h <= i_27_)
			    kg.a(i_30_, wh.O[i_27_], i_3_, i_29_, -109);
		    } else {
			int i_31_ = i_6_ > i_10_ ? cc.i[i_6_] : i_10_;
			int i_32_ = sl.a(i_31_ + i_1_, 4095, vaa.xb, jga.v);
			int i_33_ = sl.a(i_1_ - i_31_, 4095, vaa.xb, jga.v);
			if (i_28_ <= Class_db.o) {
			    int[] is = wh.O[i_28_];
			    kg.a(i_30_, is, i_3_, i_33_, 25);
			    kg.a(i_33_, is, i_5_, i_32_, -128);
			    kg.a(i_32_, is, i_3_, i_29_, i ^ ~0x5e09);
			}
			if (Class_md.h <= i_27_) {
			    int[] is = wh.O[i_27_];
			    kg.a(i_30_, is, i_3_, i_33_, i ^ ~0x5e69);
			    kg.a(i_33_, is, i_5_, i_32_, 58);
			    kg.a(i_32_, is, i_3_, i_29_, -128);
			}
		    }
		}
	    }
	}
	if (i != -24142)
	    applyClientCommand(-37, false, null, true);
    }
    
    static final void applyClientCommand(int i, boolean bool, String string, boolean bool_34_) {
	f++;
	try {
	    if (string.equalsIgnoreCase("commands")
		|| string.equalsIgnoreCase("help")) {
		ia.a(i + 4, "commands - This command");
		ia.a(4, "cls - Clear console");
		ia.a(4, "displayfps - Toggle FPS and other information");
		ia.a(i ^ 0x4,
		     "renderer - Print graphics renderer information");
		ia.a(4, "heap - Print java memory information");
		return;
	    }
	    if (i != 0)
		return;
	    if (string.equalsIgnoreCase("cls")) {
		cp.c = 0;
		wi.l = 0;
		return;
	    }
	    if (string.equalsIgnoreCase("displayfps")) {
		sl.l = !sl.l;
		if (sl.l)
		    ia.a(4, "FPS on");
		else {
		    ia.a(i + 4, "FPS off");
		    return;
		}
		return;
	    }
	    if (string.equals("renderer")) {
		GraphicsCard var_oa = lg.r.y();
		ia.a(4, "Vendor: " + ((GraphicsCard) var_oa).vendor);
		ia.a(i ^ 0x4, "Name: " + ((GraphicsCard) var_oa).name);
		ia.a(4, "Version: " + ((GraphicsCard) var_oa).version);
		ia.a(i + 4, "Device: " + ((GraphicsCard) var_oa).device);
		ia.a(4, "Driver Version: " + ((GraphicsCard) var_oa).driverVersion);
		return;
	    }
	    if (string.equals("heap")) {
		ia.a(4, "Heap: " + qm.heapSize + "MB");
		return;
	    }
	} catch (Exception exception) {
	    ia.a(4, GameText.k.getString((byte) 100, cba.languageID));
	    return;
	}
	if (hs.modeWhere != oba.K || hv.thisPlayersRights >= 2) {
	    if (string.equalsIgnoreCase("errortest"))
		throw new RuntimeException();
	    if (string.equals("nativememerror"))
		throw new OutOfMemoryError("native(MPR");
	    try {
		if (string.equalsIgnoreCase("printfps")) {
		    ia.a(4, "FPS: " + fu.v);
		    return;
		}
		if (string.equalsIgnoreCase("occlude")) {
		    il.k = !il.k;
		    if (il.k)
			ia.a(i ^ 0x4, "Occlsion now on!");
		    else {
			ia.a(4, "Occlsion now off!");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("fpson")) {
		    sl.l = true;
		    ia.a(4, "fps debug enabled");
		    return;
		}
		if (string.equalsIgnoreCase("fpsoff")) {
		    sl.l = false;
		    ia.a(4, "fps debug disabled");
		    return;
		}
		if (string.equals("systemmem")) {
		    try {
			ia.a(i ^ 0x4,
			     ("System memory: "
			      + jagmisc.getAvailablePhysicalMemory() / 1048576L
			      + "/"
			      + jagmisc.getTotalPhysicalMemory() / 1048576L
			      + "Mb"));
		    } catch (Throwable throwable) {
			/* empty */
		    }
		    return;
		}
		if (string.equalsIgnoreCase("cleartext")) {
		    gs.v.b(128);
		    ia.a(i ^ 0x4, "Text coords cleared");
		    return;
		}
		if (string.equalsIgnoreCase("gc")) {
		    ffa.i(i + 4096);
		    for (int i_35_ = 0; i_35_ < 10; i_35_++)
			System.gc();
		    Runtime runtime = Runtime.getRuntime();
		    int i_36_
			= (int) ((runtime.totalMemory() - runtime.freeMemory())
				 / 1024L);
		    ia.a(4, "mem=" + i_36_ + "loginStream");
		    return;
		}
		if (string.equalsIgnoreCase("compact")) {
		    ffa.i(i ^ 0x1000);
		    for (int i_37_ = 0; i_37_ < 10; i_37_++)
			System.gc();
		    Runtime runtime = Runtime.getRuntime();
		    int i_38_
			= (int) ((runtime.totalMemory() - runtime.freeMemory())
				 / 1024L);
		    ia.a(4, "Memory before cleanup=" + i_38_ + "loginStream");
		    he.c((byte) 95);
		    ffa.i(4096);
		    for (int i_39_ = 0; i_39_ < 10; i_39_++)
			System.gc();
		    i_38_
			= (int) ((runtime.totalMemory() - runtime.freeMemory())
				 / 1024L);
		    ia.a(4, "Memory after cleanup=" + i_38_ + "loginStream");
		    return;
		}
		if (string.equalsIgnoreCase("unloadnatives")) {
		    ia.a(4, (!rv.b((int) 112) ? "Library unloading failed!"
			     : "Libraries unloaded"));
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    ia.a(4, "Dropped client connection");
		    if (hm.h == 10)
			uca.b(7);
		    else {
			if (hm.h == 11)
			    cm.K = true;
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("rotateconnectmethods")) {
		    gm.world.a((int) 0);
		    ia.a(i ^ 0x4, "Rotated connection methods");
		    return;
		}
		if (string.equalsIgnoreCase("clientjs5drop")) {
		    bl.I.a((byte) 118);
		    ia.a(4, "Dropped client js5 net queue");
		    return;
		}
		if (string.equalsIgnoreCase("serverjs5drop")) {
		    bl.I.c(i + 4);
		    ia.a(4, "Dropped server js5 net queue");
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    nda.signlink.a(i ^ 0x1388);
		    ce.y.a(0);
		    bl.I.c((byte) -31);
		    ia.a(4, "Breaking new connections for 5 seconds");
		    return;
		}
		if (string.equalsIgnoreCase("rebuild")) {
		    ka.a((byte) 84);
		    Entity.c((byte) -98);
		    ia.a(i + 4, "Rebuilding map");
		    return;
		}
		if (string.equalsIgnoreCase("rebuildprofile")) {
		    ft.t = us.a(91);
		    dp.m = true;
		    ka.a((byte) -13);
		    Entity.c((byte) -72);
		    ia.a(4, "Rebuilding map (with profiling)");
		    return;
		}
		if (string.equalsIgnoreCase("wm1")) {
		    kea.a(false, (byte) 126, -1, -1, 1);
		    if (ia.g(23) != 1)
			ia.a(4, "wm1 failed");
		    else {
			ia.a(4, "wm1 succeeded");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    kea.a(false, (byte) 126, -1, -1, 2);
		    if (ia.g(69) != 2)
			ia.a(4, "wm2 failed");
		    else {
			ia.a(4, "wm2 succeeded");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("wm3")) {
		    kea.a(false, (byte) 126, 1024, 768, 3);
		    if (ia.g(-15) == 3)
			ia.a(4, "wm3 succeeded");
		    else {
			ia.a(i + 4, "wm3 failed");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    ur.a(0, true);
		    if (on.performance == 0) {
			ia.a(4, "Entered tk0");
			((jb) cs.g).M = 0;
			cs.g.a(nda.signlink, (byte) 87);
			NPCNode.k = false;
		    } else {
			ia.a(4, "Failed to enter tk0");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    ur.a(1, true);
		    if (on.performance == 1) {
			ia.a(4, "Entered tk1");
			((jb) cs.g).M = 1;
			cs.g.a(nda.signlink, (byte) 87);
			NPCNode.k = false;
		    } else {
			ia.a(4, "Failed to enter tk1");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk2")) {
		    ur.a(2, true);
		    if (on.performance == 2) {
			ia.a(i + 4, "Entered tk2");
			((jb) cs.g).M = 2;
			cs.g.a(nda.signlink, (byte) 34);
			NPCNode.k = false;
		    } else {
			ia.a(4, "Failed to enter tk2");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    ur.a(3, true);
		    if (on.performance != 3)
			ia.a(4, "Failed to enter tk3");
		    else {
			ia.a(i + 4, "Entered tk3");
			((jb) cs.g).M = 3;
			cs.g.a(nda.signlink, (byte) 52);
			NPCNode.k = false;
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    ur.a(5, true);
		    if (on.performance != 5)
			ia.a(4, "Failed to enter tk5");
		    else {
			ia.a(4, "Entered tk5");
			((jb) cs.g).M = 5;
			cs.g.a(nda.signlink, (byte) 94);
			NPCNode.k = false;
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("ot")) {
		    ((jb) cs.g).B = !((jb) cs.g).B;
		    cs.g.a(nda.signlink, (byte) 80);
		    NPCNode.k = false;
		    ka.a((byte) -108);
		    ia.a(i + 4, "ot=" + ((jb) cs.g).B);
		    return;
		}
		if (string.equalsIgnoreCase("gb")) {
		    ((jb) cs.g).Q = !((jb) cs.g).Q;
		    cs.g.a(nda.signlink, (byte) 81);
		    NPCNode.k = false;
		    ka.a((byte) 126);
		    ia.a(i ^ 0x4, "gb=" + ((jb) cs.g).Q);
		    return;
		}
		if (string.startsWith("shadows")) {
		    if (string.length() < 8)
			ia.a(4, "Invalid shadows value");
		    else {
			String string_40_ = string.substring(8);
			int i_41_ = (!Class_kd.a((byte) 122, string_40_) ? -1
				     : Class_g.a(i ^ 0x80, string_40_));
			if (i_41_ < 0 || i_41_ > 2)
			    ia.a(4, "Invalid shadows value");
			else {
			    cs.g.a(i_41_, 2, on.performance);
			    cs.g.a(nda.signlink, (byte) 121);
			    NPCNode.k = false;
			    ka.a((byte) -119);
			    ia.a(4, "shadows=" + i_41_);
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.startsWith("textures")) {
		    ((jb) cs.g).k = !((jb) cs.g).k;
		    cs.g.a(nda.signlink, (byte) 97);
		    NPCNode.k = false;
		    bca.a((byte) 85);
		    ka.a((byte) 23);
		    ia.a(4, "textures=" + ((jb) cs.g).k);
		    return;
		}
		if (string.startsWith("lighting")) {
		    cs.g.a((byte) -98, !cs.g.a(i ^ ~0x5c, on.performance), on.performance);
		    cs.g.a(nda.signlink, (byte) 127);
		    NPCNode.k = false;
		    Class_ad.b(125);
		    bca.a((byte) 85);
		    ka.a((byte) -120);
		    ia.a(4, "lighting=" + cs.g.a((int) -79, on.performance));
		    return;
		}
		if (string.startsWith("setba")) {
		    if (string.length() < 6)
			ia.a(4, "Invalid buildarea value");
		    else {
			int i_42_ = Class_g.a(128, string.substring(6));
			if (i_42_ < 0 || Class_g.a(-62, qm.heapSize) < i_42_)
			    ia.a(4, "Invalid buildarea value");
			else {
			    ((jb) cs.g).m = i_42_;
			    cs.g.a(nda.signlink, (byte) 40);
			    NPCNode.k = false;
			    ia.a(i ^ 0x4, "maxbuildarea=" + ((jb) cs.g).m);
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.startsWith("rect_debug")) {
		    if (string.length() < 10)
			ia.a(i ^ 0x4, "Invalid rect_debug value");
		    else {
			lt.g = Class_g.a(128, string.substring(10).trim());
			ia.a(i + 4, "rect_debug=" + lt.g);
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("qa_op_test")) {
		    lba.Q = true;
		    ia.a(i + 4, "qa_op_test=" + lba.Q);
		    return;
		}
		if (string.equalsIgnoreCase("clipcomponents")) {
		    ji.g = !ji.g;
		    ia.a(4, "clipcomponents=" + ji.g);
		    return;
		}
		if (string.startsWith("bloom")) {
		    boolean bool_43_ = lg.r.z();
		    if (ik.a(i + 93, !bool_43_)) {
			if (!bool_43_)
			    ia.a(4, "Bloom enabled");
			else
			    ia.a(4, "Bloom disabled");
		    } else {
			ia.a(4, "Failed to enable bloom");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tween")) {
		    if (vm.r) {
			vm.r = false;
			ia.a(4, "Forced tweening disabled.");
		    } else {
			vm.r = true;
			ia.a(i ^ 0x4, "Forced tweening ENABLED!");
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("shiftclick")) {
		    if (vh.a) {
			ia.a(i + 4, "Shift-click disabled.");
			vh.a = false;
		    } else {
			ia.a(4, "Shift-click ENABLED!");
			vh.a = true;
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("getcgcoord")) {
		    ia.a(4,
			 "x:" + (((Animable) up.thisPlayer).locX >> 9) + " z:" + (((Animable) up.thisPlayer).locY
								>> 9));
		    return;
		}
		if (string.equalsIgnoreCase("getheight")) {
		    ia.a(4,
			 ("Height: "
			  + Class_q.b[((Animable) up.thisPlayer).height].a(((Animable) up.thisPlayer).locY >> 9,
						       (byte) 51,
						       ((Animable) up.thisPlayer).locX >> 9)));
		    return;
		}
		if (string.equalsIgnoreCase("resetminimap")) {
		    sm.a.b((byte) 55);
		    sm.a.b(i ^ ~0x6c6b);
		    gda.d.b(-87);
		    hq.a.b((byte) 126);
		    Entity.c((byte) -84);
		    ia.a(4, "Minimap reset");
		    return;
		}
		if (string.startsWith("mc")) {
		    if (lg.r.h()) {
			int i_44_ = Integer.parseInt(string.substring(3));
			if (i_44_ < 1)
			    i_44_ = 1;
			else if (i_44_ > 4)
			    i_44_ = 4;
			gd.d = i_44_;
			ka.a((byte) 100);
			ia.a(4, "Render cores now: " + gd.d);
		    } else {
			ia.a(4,
			     "Current toolkit doesn'applet support multiple cores");
			return;
		    }
		    return;
		}
		if (string.startsWith("cachespace")) {
		    ia.a(4, ("I(s): " + sr.U.c((int) 72) + "/"
			     + sr.U.b((int) -127)));
		    ia.a(i + 4, ("I(m): " + gea.m.c((int) 122) + "/"
				 + gea.m.b(i - 122)));
		    ia.a(4, ("O(s): " + ((ItemDefLoader) laa.itemDefLoader).v.c((byte) 80) + "/"
			     + ((ItemDefLoader) laa.itemDefLoader).v.b((byte) 86)));
		    return;
		}
		if (string.equalsIgnoreCase("getcamerapos")) {
		    ia.a(4, ("Pos: " + ((Animable) up.thisPlayer).height + ","
			     + (bfa.thisPlayersRegionX + (dg.gb >> 9) >> 6) + ","
			     + ((ada.N >> 9) + BytesParser.thisPlayersRegionY >> 6) + ","
			     + ((dg.gb >> 9) + bfa.thisPlayersRegionX & 0x3f) + ","
			     + (BytesParser.thisPlayersRegionY + (ada.N >> 9) & 0x3f) + " Height: "
			     + (Class_u.b(dg.gb, ((Animable) up.thisPlayer).height, -20214, ada.N)
				- us.e)));
		    ia.a(i ^ 0x4,
			 ("Look: " + ((Animable) up.thisPlayer).height + "," + (bfa.thisPlayersRegionX + ko.c >> 6)
			  + "," + (ItemDefLoader.d + BytesParser.thisPlayersRegionY >> 6) + ","
			  + (0x3f & bfa.thisPlayersRegionX + ko.c) + "," + (ItemDefLoader.d + BytesParser.thisPlayersRegionY & 0x3f)
			  + " Height: "
			  + (Class_u.b(ko.c, ((Animable) up.thisPlayer).height, i - 20214, ItemDefLoader.d)
			     - pm.s)));
		    return;
		}
		if (string.equals("renderprofile") || string.equals("rp")) {
		    ht.z = !ht.z;
		    lg.r.a(ht.z);
		    dd.i(0);
		    ia.a(4, "showprofiling=" + ht.z);
		    return;
		}
		if (string.startsWith("performancetest")) {
		    int i_45_ = -1;
		    int i_46_ = 1000;
		    if (string.length() > 15) {
			String[] strings = vq.a(-120, string, ' ');
			try {
			    if (strings.length > 1)
				i_46_ = Integer.parseInt(strings[1]);
			} catch (Throwable throwable) {
			    /* empty */
			}
			try {
			    if (strings.length > 2)
				i_45_ = Integer.parseInt(strings[2]);
			} catch (Throwable throwable) {
			    /* empty */
			}
		    }
		    if (i_45_ != -1)
			ia.a(4,
			     "Performance: " + ItemDef.a(on.performance, (byte) -116, i_46_));
		    else {
			ia.a(i + 4,
			     "Java toolkit: " + ItemDef.a(0, (byte) -107, i_46_));
			ia.a(4,
			     "SSE toolkit:  " + ItemDef.a(2, (byte) -125, i_46_));
			ia.a(4,
			     "D3D toolkit:  " + ItemDef.a(3, (byte) -118, i_46_));
			ia.a(4,
			     "GL toolkit:   " + ItemDef.a(1, (byte) -123, i_46_));
			ia.a(4,
			     "GLX toolkit:  " + ItemDef.a(5, (byte) -121, i_46_));
			return;
		    }
		    return;
		}
		if (string.equals("nonpcs")) {
		    qm.f = !qm.f;
		    ia.a(i + 4, "nonpcs=" + qm.f);
		    return;
		}
		if (string.equals("autoworld")) {
		    vca.a((byte) -88);
		    ia.a(i + 4, "auto world selected");
		    return;
		}
		if (string.startsWith("switchworld")) {
		    int i_47_ = Integer.parseInt(string.substring(12));
		    ee.a(i_47_, ((WorldSub) Class_kd.a(i_47_, true)).m, 55);
		    ia.a(4, "switched");
		    return;
		}
		if (string.equals("getworld")) {
		    ia.a(4, "w: " + ((World) gm.world).worldID);
		    return;
		}
		if (string.startsWith("pc")) {
		    tba var_tba = jga.sendGameOutPacket(lr.outgoingPacket66, pca.isaac, (byte) 119);
		    ((tba) var_tba).loginStream.writeByte((int) 0, (byte) -128);
		    int i_48_ = ((BytesParser) ((tba) var_tba).loginStream).pos;
		    int i_49_ = string.indexOf(" ", 4);
		    ((tba) var_tba).loginStream.writeString(string.substring(3, i_49_), -72);
		    kg.a(-1, string.substring(i_49_), ((tba) var_tba).loginStream);
		    ((tba) var_tba).loginStream.writeLengthByte(((BytesParser) ((tba) var_tba).loginStream).pos - i_48_,
					2105852);
		    ud.a(var_tba, (byte) -36);
		    return;
		}
		if (string.equals("savevarcs")) {
		    cc.a(false);
		    ia.a(i ^ 0x4, "perm varcs saved");
		    return;
		}
		if (string.equals("scramblevarcs")) {
		    for (int i_50_ = 0; rr.h.length > i_50_; i_50_++) {
			if (jm.i[i_50_]) {
			    rr.h[i_50_] = (int) (99999.0 * Math.random());
			    if (Math.random() > 0.5)
				rr.h[i_50_] *= -1;
			}
		    }
		    cc.a(false);
		    ia.a(4, "perm varcs scrambled");
		    return;
		}
		if (string.equals("showcolmap")) {
		    Class_qb.k = true;
		    Entity.c((byte) -111);
		    ia.a(4, "colmap is shown");
		    return;
		}
		if (string.equals("hidecolmap")) {
		    Class_qb.k = false;
		    Entity.c((byte) -90);
		    ia.a(4, "colmap is hidden");
		    return;
		}
		if (string.equals("resetcache")) {
		    um.a(0);
		    ia.a(i + 4, "Caches reset");
		    return;
		}
		if (string.equals("profilecpu")) {
		    ia.a(4, String.valueOf(ur.a((int) -113)) + "ms");
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i_51_ = Integer.parseInt(string.substring(17));
		    ia.a(4, "varpbit=" + cp.e.a(i ^ 0x78, i_51_));
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i_52_ = Integer.parseInt(string.substring(14));
		    ia.a(4, "varp=" + cp.e.b(i_52_, 48));
		    return;
		}
		if (string.startsWith("demologin")) {
		    Class_fd.a(false, 0, i ^ 0x3);
		    return;
		}
		if (string.startsWith("newdemologin")) {
		    Class_fd.a(true, 0, 3);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings = vq.a(-91, string.substring(12), ' ');
		    if (strings.length >= 2) {
			int i_53_ = (strings.length > 2
				     ? Integer.parseInt(strings[2]) : 0);
			ui.a(strings[1], strings[0], -120, i_53_);
			return;
		    }
		}
		if (string.startsWith("csprofileclear")) {
		    ClientScriptHandler.a();
		    return;
		}
		if (string.startsWith("csprofileoutputc")) {
		    ClientScriptHandler.c(100, false);
		    return;
		}
		if (string.startsWith("csprofileoutputt")) {
		    ClientScriptHandler.c(10, true);
		    return;
		}
		if (string.startsWith("texsize")) {
		    int i_54_ = Integer.parseInt(string.substring(8));
		    lg.r.b(i_54_);
		    return;
		}
		if (string.equals("soundstreamcount")) {
		    ia.a(4, "Active streams: " + ej.r.f());
		    return;
		}
		if (string.equals("autosetup")) {
		    cs.g.c((byte) 103);
		    ia.a(4, "Complete. Toolkit now: " + on.performance);
		    return;
		}
		if (string.equals("errormessage")) {
		    ia.a(4, po.c.d((byte) -30));
		    return;
		}
		if (string.equals("heapdump")) {
		    if (!Signlink.osNameLowerCase.startsWith("win"))
			gba.a(-4496, false, new File("/tmp/heap.dump"));
		    else
			gba.a(-4496, false, new File("C:\\Temp\\heap.dump"));
		    ia.a(i ^ 0x4, "Done");
		    return;
		}
		if (string.equals("os")) {
		    ia.a(4, "Name: " + Signlink.osNameLowerCase);
		    ia.a(4, "Arch: " + Signlink.osArch);
		    ia.a(4, "Ver: " + Signlink.osVersion);
		    return;
		}
		if (string.equals("w2debug")) {
		    la.u = !la.u;
		    ka.a((byte) 67);
		    ia.a(i ^ 0x4, "Toggled!");
		    return;
		}
		if (hm.h == 10) {
		    fo.g++;
		    tba var_tba = jga.sendGameOutPacket(bh.A, pca.isaac, (byte) -98);
		    ((tba) var_tba).loginStream.writeByte(string.length() + 3, (byte) -125);
		    ((tba) var_tba).loginStream.writeByte((int) (!bool_34_ ? 0 : 1),
					(byte) -124);
		    ((tba) var_tba).loginStream.writeByte((int) (bool ? 1 : 0), (byte) -117);
		    ((tba) var_tba).loginStream.writeString(string, -20);
		    ud.a(var_tba, (byte) -36);
		}
		if (string.startsWith("fps ") && oba.K != hs.modeWhere) {
		    ri.a(Class_g.a(128, string.substring(4)), -45);
		    return;
		}
	    } catch (Exception exception) {
		ia.a(4, GameText.k.getString((byte) 124, cba.languageID));
		return;
	    }
	}
	if (hm.h != 10)
	    ia.a(i + 4, GameText.l.getString((byte) -27, cba.languageID) + string);
    }
    
    static final boolean a(boolean bool, int i, int i_55_) {
	g++;
	if (bool != false)
	    b = -1.7512002F;
	boolean bool_56_
	    = (0x37 & i) != 0 ? bk.a(i, i_55_, -124) : jv.a(3, i_55_, i);
	return bool_56_ | ((0x10000 & i_55_) != 0 | cj.a(i, -545, i_55_));
    }
    
    bj(qj var_qj, int i, int i_57_) {
	d = var_qj;
	((bj) this).c = i_57_;
    }
}
