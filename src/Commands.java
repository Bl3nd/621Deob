/* bj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

import jagex3.jagmisc.jagmisc;

final class Commands {
    static int a;
    static float b;
    int c;
    private qj d;
    static int e;
    static int applyClientCommand;
    static int g;

    protected final void finalize() throws Throwable {
        d.a(this.c, (byte) 109);
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

    public static void applyClientCommand(int i, boolean bool, String command, boolean bool_34_) {
        applyClientCommand++;
        try {
            if (command.equalsIgnoreCase("commands") || command.equalsIgnoreCase("help")) {
                ia.sendConsoleCommandText(i + 4, "commands - This command");
                ia.sendConsoleCommandText(4, "cls - Clear console");
                ia.sendConsoleCommandText(4, "displayfps - Toggle FPS and other information");
                ia.sendConsoleCommandText(i ^ 0x4, "renderer - Print graphics renderer information");
                ia.sendConsoleCommandText(4, "heap - Print java memory information");
                return;
            }
            if (i != 0) {
                return;
            }
            if (command.equalsIgnoreCase("cls")) {
                cp.c = 0;
                wi.l = 0;
                return;
            }
            if (command.equalsIgnoreCase("displayfps")) {
                sl.fpsOn = !sl.fpsOn;
                if (sl.fpsOn) {
                    ia.sendConsoleCommandText(4, "FPS on");
                } else {
                    ia.sendConsoleCommandText(i + 4, "FPS off");
                    return;
                }
                return;
            }
            if (command.equals("renderer")) {
                GraphicsCard graphicsCard = lg.r.y();
                ia.sendConsoleCommandText(4, "Vendor: " + graphicsCard.vendor);
                ia.sendConsoleCommandText(i ^ 0x4, "Name: " + graphicsCard.name);
                ia.sendConsoleCommandText(4, "Version: " + graphicsCard.version);
                ia.sendConsoleCommandText(i + 4, "Device: " + graphicsCard.device);
                ia.sendConsoleCommandText(4, "Driver Version: " + graphicsCard.driverVersion);
                return;
            }
            if (command.equals("heap")) {
                ia.sendConsoleCommandText(4, "Heap: " + qm.heapSize + "MB");
                return;
            }
        } catch (Exception exception) {
            ia.sendConsoleCommandText(4, GameText.errorExecutingCommand.getString(cba.languageID));
            return;
        }
        if (hs.modeWhere != oba.pk || hv.thisPlayersRights >= 2) {
            if (command.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (command.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (command.equalsIgnoreCase("printfps")) {
                    ia.sendConsoleCommandText(4, "FPS: " + fu.fps);
                    return;
                }
                if (command.equalsIgnoreCase("occlude")) {
                    il.occlude = !il.occlude;
                    if (il.occlude) {
                        ia.sendConsoleCommandText(i ^ 0x4, "Occlsion now on!");
                    } else {
                        ia.sendConsoleCommandText(4, "Occlsion now off!");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("fpson")) {
                    sl.fpsOn = true;
                    ia.sendConsoleCommandText(4, "fps debug enabled");
                    return;
                }
                if (command.equalsIgnoreCase("fpsoff")) {
                    sl.fpsOn = false;
                    ia.sendConsoleCommandText(4, "fps debug disabled");
                    return;
                }
                if (command.equals("systemmem")) {
                    try {
                        ia.sendConsoleCommandText(i ^ 0x4, ("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/"
                                + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb"));
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    return;
                }
                if (command.equalsIgnoreCase("cleartext")) {
                    gs.v.clearTextCoords(128);
                    ia.sendConsoleCommandText(i ^ 0x4, "Text coords cleared");
                    return;
                }
                if (command.equalsIgnoreCase("gc")) {
                    ffa.gcContainer(i + 4096);
                    for (int count = 0; count < 10; count++) {
                        System.gc();
                    }
                    Runtime runtime = Runtime.getRuntime();
                    int memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    ia.sendConsoleCommandText(4, "mem=" + memory + "loginStream");
                    return;
                }
                if (command.equalsIgnoreCase("compact")) {
                    ffa.gcContainer(i ^ 0x1000);
                    for (int count = 0; count < 10; count++) {
                        System.gc();
                    }
                    Runtime runtime = Runtime.getRuntime();
                    int memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    ia.sendConsoleCommandText(4, "Memory before cleanup=" + memory + "loginStream");
                    he.cleanup((byte) 95);
                    ffa.gcContainer(4096);
                    for (int count = 0; count < 10; count++) {
                        System.gc();
                    }
                    memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    ia.sendConsoleCommandText(4, "Memory after cleanup=" + memory + "loginStream");
                    return;
                }
                if (command.equalsIgnoreCase("unloadnatives")) {
                    ia.sendConsoleCommandText(4, (!rv.unloadNativeLibraries() ? "Library unloading failed!" : "Libraries unloaded"));
                    return;
                }
                if (command.equalsIgnoreCase("clientdrop")) {
                    ia.sendConsoleCommandText(4, "Dropped client connection");
                    if (hm.h == 10) {
                        uca.dropClient(7);
                    } else {
                        if (hm.h == 11) {
                            cm.K = true;
                        }
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("rotateconnectmethods")) {
                    gm.world.rotateConnectionMethods(0);
                    ia.sendConsoleCommandText(i ^ 0x4, "Rotated connection methods");
                    return;
                }
                if (command.equalsIgnoreCase("clientjs5drop")) {
                    bl.uaa.dropClientJS5((byte) 118);
                    ia.sendConsoleCommandText(4, "Dropped client js5 net queue");
                    return;
                }
                if (command.equalsIgnoreCase("serverjs5drop")) {
                    bl.uaa.dropServerJS5(i + 4);
                    ia.sendConsoleCommandText(4, "Dropped server js5 net queue");
                    return;
                }
                if (command.equalsIgnoreCase("breakcon")) {
                    nda.signlink.getCurrentTime(i ^ 0x1388);
                    ce.y.a(0);
                    bl.uaa.breakConnections((byte) -31);
                    ia.sendConsoleCommandText(4, "Breaking new connections for 5 seconds");
                    return;
                }
                if (command.equalsIgnoreCase("rebuild")) {
                    ka.rebuildMap((byte) 84);
                    Entity.rebuildMap((byte) -98);
                    ia.sendConsoleCommandText(i + 4, "Rebuilding map");
                    return;
                }
                if (command.equalsIgnoreCase("rebuildprofile")) {
                    ft.currentTime = us.getCurrentTime(91);
                    dp.m = true;
                    ka.rebuildMap((byte) -13);
                    Entity.rebuildMap((byte) -72);
                    ia.sendConsoleCommandText(4, "Rebuilding map (with profiling)");
                    return;
                }
                if (command.equalsIgnoreCase("wm1")) {
                    kea.setWM(false, (byte) 126, -1, -1, 1);
                    if (ia.getWMVersion(23) != 1) {
                        ia.sendConsoleCommandText(4, "wm1 failed");
                    } else {
                        ia.sendConsoleCommandText(4, "wm1 succeeded");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("wm2")) {
                    kea.setWM(false, (byte) 126, -1, -1, 2);
                    if (ia.getWMVersion(69) != 2) {
                        ia.sendConsoleCommandText(4, "wm2 failed");
                    } else {
                        ia.sendConsoleCommandText(4, "wm2 succeeded");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("wm3")) {
                    kea.setWM(false, (byte) 126, 1024, 768, 3);
                    if (ia.getWMVersion(-15) == 3) {
                        ia.sendConsoleCommandText(4, "wm3 succeeded");
                    } else {
                        ia.sendConsoleCommandText(i + 4, "wm3 failed");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("tk0")) {
                    ur.setTKVersion(0, true);
                    if (on.performance == 0) {
                        ia.sendConsoleCommandText(4, "Entered tk0");
                        cs.g.tkVersion = 0;
                        cs.g.a(nda.signlink, (byte) 87);
                        NPCNode.k = false;
                    } else {
                        ia.sendConsoleCommandText(4, "Failed to enter tk0");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("tk1")) {
                    ur.setTKVersion(1, true);
                    if (on.performance == 1) {
                        ia.sendConsoleCommandText(4, "Entered tk1");
                        cs.g.tkVersion = 1;
                        cs.g.a(nda.signlink, (byte) 87);
                        NPCNode.k = false;
                    } else {
                        ia.sendConsoleCommandText(4, "Failed to enter tk1");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("tk2")) {
                    ur.setTKVersion(2, true);
                    if (on.performance == 2) {
                        ia.sendConsoleCommandText(i + 4, "Entered tk2");
                        cs.g.tkVersion = 2;
                        cs.g.a(nda.signlink, (byte) 34);
                        NPCNode.k = false;
                    } else {
                        ia.sendConsoleCommandText(4, "Failed to enter tk2");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("tk3")) {
                    ur.setTKVersion(3, true);
                    if (on.performance != 3) {
                        ia.sendConsoleCommandText(4, "Failed to enter tk3");
                    } else {
                        ia.sendConsoleCommandText(i + 4, "Entered tk3");
                        cs.g.tkVersion = 3;
                        cs.g.a(nda.signlink, (byte) 52);
                        NPCNode.k = false;
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("tk5")) {
                    ur.setTKVersion(5, true);
                    if (on.performance != 5) {
                        ia.sendConsoleCommandText(4, "Failed to enter tk5");
                    } else {
                        ia.sendConsoleCommandText(4, "Entered tk5");
                        cs.g.tkVersion = 5;
                        cs.g.a(nda.signlink, (byte) 94);
                        NPCNode.k = false;
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("ot")) {
                    cs.g.isOT = !cs.g.isOT;
                    cs.g.a(nda.signlink, (byte) 80);
                    NPCNode.k = false;
                    ka.rebuildMap((byte) -108);
                    ia.sendConsoleCommandText(i + 4, "ot=" + cs.g.isOT);
                    return;
                }
                if (command.equalsIgnoreCase("gb")) {
                    cs.g.isGB = !cs.g.isGB;
                    cs.g.a(nda.signlink, (byte) 81);
                    NPCNode.k = false;
                    ka.rebuildMap((byte) 126);
                    ia.sendConsoleCommandText(i ^ 0x4, "gb=" + cs.g.isGB);
                    return;
                }
                if (command.startsWith("shadows")) {
                    if (command.length() < 8) {
                        ia.sendConsoleCommandText(4, "Invalid shadows value");
                    } else {
                        String string1 = command.substring(8);
                        int shadowsCount = (!Class_kd.a((byte) 122, string1) ? -1 : Class_g.a(i ^ 0x80, string1));
                        if (shadowsCount < 0 || shadowsCount > 2) {
                            ia.sendConsoleCommandText(4, "Invalid shadows value");
                        } else {
                            cs.g.shadows(shadowsCount, 2, on.performance);
                            cs.g.a(nda.signlink, (byte) 121);
                            NPCNode.k = false;
                            ka.rebuildMap((byte) -119);
                            ia.sendConsoleCommandText(4, "shadows=" + shadowsCount);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (command.startsWith("textures")) {
                    cs.g.isTextures = !cs.g.isTextures;
                    cs.g.a(nda.signlink, (byte) 97);
                    NPCNode.k = false;
                    bca.showTextures((byte) 85);
                    ka.rebuildMap((byte) 23);
                    ia.sendConsoleCommandText(4, "textures=" + cs.g.isTextures);
                    return;
                }
                if (command.startsWith("lighting")) {
                    cs.g.showLighting((byte) -98, !cs.g.isLighting(i ^ ~0x5c, on.performance), on.performance);
                    cs.g.a(nda.signlink, (byte) 127);
                    NPCNode.k = false;
                    Class_ad.lighting(125);
                    bca.showTextures((byte) 85);
                    ka.rebuildMap((byte) -120);
                    ia.sendConsoleCommandText(4, "lighting=" + cs.g.isLighting(-79, on.performance));
                    return;
                }
                if (command.startsWith("setba")) {
                    if (command.length() < 6) {
                        ia.sendConsoleCommandText(4, "Invalid buildarea value");
                    } else {
                        int size = Class_g.a(128, command.substring(6));
                        if (size < 0 || Class_g.a(-62, qm.heapSize) < size) {
                            ia.sendConsoleCommandText(4, "Invalid buildarea value");
                        } else {
                            cs.g.buildAreaSize = size;
                            cs.g.a(nda.signlink, (byte) 40);
                            NPCNode.k = false;
                            ia.sendConsoleCommandText(i ^ 0x4, "maxbuildarea=" + cs.g.buildAreaSize);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (command.startsWith("rect_debug")) {
                    if (command.length() < 10) {
                        ia.sendConsoleCommandText(i ^ 0x4, "Invalid rect_debug value");
                    } else {
                        lt.rectValue = Class_g.a(128, command.substring(10).trim());
                        ia.sendConsoleCommandText(i + 4, "rect_debug=" + lt.rectValue);
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("qa_op_test")) {
                    lba.qa_op_test = true;
                    ia.sendConsoleCommandText(i + 4, "qa_op_test=" + lba.qa_op_test);
                    return;
                }
                if (command.equalsIgnoreCase("clipcomponents")) {
                    ji.clipComponents = !ji.clipComponents;
                    ia.sendConsoleCommandText(4, "clipcomponents=" + ji.clipComponents);
                    return;
                }
                if (command.startsWith("bloom")) {
                    boolean bloom = lg.r.bloom();
                    if (ik.enableBloom(i + 93, !bloom)) {
                        if (!bloom) {
                            ia.sendConsoleCommandText(4, "Bloom enabled");
                        } else {
                            ia.sendConsoleCommandText(4, "Bloom disabled");
                        }
                    } else {
                        ia.sendConsoleCommandText(4, "Failed to enable bloom");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("tween")) {
                    if (vm.isTweening) {
                        vm.isTweening = false;
                        ia.sendConsoleCommandText(4, "Forced tweening disabled.");
                    } else {
                        vm.isTweening = true;
                        ia.sendConsoleCommandText(i ^ 0x4, "Forced tweening ENABLED!");
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("shiftclick")) {
                    if (vh.shiftClickEnabled) {
                        ia.sendConsoleCommandText(i + 4, "Shift-click disabled.");
                        vh.shiftClickEnabled = false;
                    } else {
                        ia.sendConsoleCommandText(4, "Shift-click ENABLED!");
                        vh.shiftClickEnabled = true;
                        return;
                    }
                    return;
                }
                if (command.equalsIgnoreCase("getcgcoord")) {
                    ia.sendConsoleCommandText(4, "x:" + (up.thisPlayer.locX >> 9) + " z:" + (up.thisPlayer.locY >> 9));
                    return;
                }
                if (command.equalsIgnoreCase("getheight")) {
                    ia.sendConsoleCommandText(4, ("Height: " + Class_q.b[up.thisPlayer.height].a(up.thisPlayer.locY >> 9, (byte) 51,
                            up.thisPlayer.locX >> 9)));
                    return;
                }
                if (command.equalsIgnoreCase("resetminimap")) {
                    sm.a.b((byte) 55);
                    sm.a.b(i ^ ~0x6c6b);
                    gda.d.b(-87);
                    hq.a.b((byte) 126);
                    Entity.rebuildMap((byte) -84);
                    ia.sendConsoleCommandText(4, "Minimap reset");
                    return;
                }
                if (command.startsWith("mc")) {
                    if (lg.r.h()) {
                        int cores = Integer.parseInt(command.substring(3));
                        if (cores < 1) {
                            cores = 1;
                        } else if (cores > 4) {
                            cores = 4;
                        }
                        gd.cores = cores;
                        ka.rebuildMap((byte) 100);
                        ia.sendConsoleCommandText(4, "Render cores now: " + gd.cores);
                    } else {
                        ia.sendConsoleCommandText(4, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    return;
                }
                if (command.startsWith("cachespace")) {
                    ia.sendConsoleCommandText(4, ("I(s): " + sr.U.c(72) + "/" + sr.U.b(-127)));
                    ia.sendConsoleCommandText(i + 4, ("I(m): " + gea.m.c(122) + "/" + gea.m.b(i - 122)));
                    ia.sendConsoleCommandText(4, ("O(s): " + laa.itemDefLoader.v.c() + "/" + laa.itemDefLoader.v.b()));
                    return;
                }
                if (command.equalsIgnoreCase("getcamerapos")) {
                    ia.sendConsoleCommandText(4, ("Pos: " + up.thisPlayer.height + "," + (bfa.thisPlayersRegionX + (dg.gb >> 9) >> 6) + ","
                            + ((ada.N >> 9) + BytesParser.thisPlayersRegionY >> 6) + "," + ((dg.gb >> 9) + bfa.thisPlayersRegionX & 0x3f) + ","
                            + (BytesParser.thisPlayersRegionY + (ada.N >> 9) & 0x3f) + " Height: " + (Class_u.b(dg.gb, up.thisPlayer.height, -20214,
                            ada.N) - us.e)));
                    ia.sendConsoleCommandText(i ^ 0x4, ("Look: " + up.thisPlayer.height + "," + (bfa.thisPlayersRegionX + ko.c >> 6)
                            + "," + (ItemDefLoader.d + BytesParser.thisPlayersRegionY >> 6) + "," + (0x3f & bfa.thisPlayersRegionX + ko.c)
                            + "," + (ItemDefLoader.d + BytesParser.thisPlayersRegionY & 0x3f) + " Height: " + (Class_u.b(ko.c, up.thisPlayer.height,
                            i - 20214, ItemDefLoader.d) - pm.s)));
                    return;
                }
                if (command.equals("renderprofile") || command.equals("rp")) {
                    ht.showProfiling = !ht.showProfiling;
                    lg.r.renderProfile(ht.showProfiling);
                    dd.renderProfile(0);
                    ia.sendConsoleCommandText(4, "showprofiling=" + ht.showProfiling);
                    return;
                }
                if (command.startsWith("performancetest")) {
                    int j = -1;
                    int k = 1000;
                    if (command.length() > 15) {
                        String[] strings = vq.a(-120, command, ' ');
                        try {
                            if (strings.length > 1) {
                                k = Integer.parseInt(strings[1]);
                            }
                        } catch (Throwable throwable) {
			                /* empty */
                        }
                        try {
                            if (strings.length > 2) {
                                j = Integer.parseInt(strings[2]);
                            }
                        } catch (Throwable throwable) {
			                /* empty */
                        }
                    }
                    if (j != -1) {
                        ia.sendConsoleCommandText(4, "Performance: " + ItemDef.getToolkit(on.performance, (byte) -116, k));
                    } else {
                        ia.sendConsoleCommandText(i + 4, "Java toolkit: " + ItemDef.getToolkit(0, (byte) -107, k));
                        ia.sendConsoleCommandText(4, "SSE toolkit:  " + ItemDef.getToolkit(2, (byte) -125, k));
                        ia.sendConsoleCommandText(4, "D3D toolkit:  " + ItemDef.getToolkit(3, (byte) -118, k));
                        ia.sendConsoleCommandText(4, "GL toolkit:   " + ItemDef.getToolkit(1, (byte) -123, k));
                        ia.sendConsoleCommandText(4, "GLX toolkit:  " + ItemDef.getToolkit(5, (byte) -121, k));
                        return;
                    }
                    return;
                }
                if (command.equals("nonpcs")) {
                    qm.isNonpcs = !qm.isNonpcs;
                    ia.sendConsoleCommandText(i + 4, "nonpcs=" + qm.isNonpcs);
                    return;
                }
                if (command.equals("autoworld")) {
                    vca.selectAutoWorld((byte) -88);
                    ia.sendConsoleCommandText(i + 4, "auto world selected");
                    return;
                }
                if (command.startsWith("switchworld")) {
                    int world = Integer.parseInt(command.substring(12));
                    ee.switchWorld(world, Class_kd.a(world, true).m, 55);
                    ia.sendConsoleCommandText(4, "switched");
                    return;
                }
                if (command.equals("getworld")) {
                    ia.sendConsoleCommandText(4, "w: " + gm.world.worldID);
                    return;
                }
                if (command.startsWith("pc")) {
                    tba tba = jga.sendGameOutPacket(lr.outgoingPacket66, pca.isaac, (byte) 119);
                    tba.loginStream.writeByte(0, (byte) -128);
                    int pos = tba.loginStream.pos;
                    int indexOf = command.indexOf(" ", 4);
                    tba.loginStream.writeString(command.substring(3, indexOf), -72);
                    kg.a(-1, command.substring(indexOf), tba.loginStream);
                    tba.loginStream.writeLengthByte(tba.loginStream.pos - pos, 2105852);
                    ud.a(tba, (byte) -36);
                    return;
                }
                if (command.equals("savevarcs")) {
                    cc.saveVarcs(false);
                    ia.sendConsoleCommandText(i ^ 0x4, "perm varcs saved");
                    return;
                }
                if (command.equals("scramblevarcs")) {
                    for (int index = 0; rr.h.length > index; index++) {
                        if (jm.i[index]) {
                            rr.h[index] = (int) (99999.0 * Math.random());
                            if (Math.random() > 0.5) {
                                rr.h[index] *= -1;
                            }
                        }
                    }
                    cc.saveVarcs(false);
                    ia.sendConsoleCommandText(4, "perm varcs scrambled");
                    return;
                }
                if (command.equals("showcolmap")) {
                    Class_qb.showColMap = true;
                    Entity.rebuildMap((byte) -111);
                    ia.sendConsoleCommandText(4, "colmap is shown");
                    return;
                }
                if (command.equals("hidecolmap")) {
                    Class_qb.showColMap = false;
                    Entity.rebuildMap((byte) -90);
                    ia.sendConsoleCommandText(4, "colmap is hidden");
                    return;
                }
                if (command.equals("resetcache")) {
                    um.resetCache(0);
                    ia.sendConsoleCommandText(i + 4, "Caches reset");
                    return;
                }
                if (command.equals("profilecpu")) {
                    ia.sendConsoleCommandText(4, String.valueOf(ur.getProfileCPU(-113)) + "ms");
                    return;
                }
                if (command.startsWith("getclientvarpbit")) {
                    int clientVarpBit = Integer.parseInt(command.substring(17));
                    ia.sendConsoleCommandText(4, "varpbit=" + cp.e.getClientVarpBit(i ^ 0x78, clientVarpBit));
                    return;
                }
                if (command.startsWith("getclientvarp")) {
                    int clientVarp = Integer.parseInt(command.substring(14));
                    ia.sendConsoleCommandText(4, "varp=" + cp.e.getClientVarp(clientVarp, 48));
                    return;
                }
                if (command.startsWith("demologin")) {
                    Class_fd.demoLogin(false, 0, i ^ 0x3);
                    return;
                }
                if (command.startsWith("newdemologin")) {
                    Class_fd.demoLogin(true, 0, 3);
                    return;
                }
                if (command.startsWith("directlogin")) {
                    String[] strings = vq.a(-91, command.substring(12), ' ');
                    if (strings.length >= 2) {
                        int j = (strings.length > 2 ? Integer.parseInt(strings[2]) : 0);
                        ui.a(strings[1], strings[0], -120, j);
                        return;
                    }
                }
                if (command.startsWith("csprofileclear")) {
                    ClientScriptHandler.csProfileClear();
                    return;
                }
                if (command.startsWith("csprofileoutputc")) {
                    ClientScriptHandler.csProfileOutput(100, false);
                    return;
                }
                if (command.startsWith("csprofileoutputt")) {
                    ClientScriptHandler.csProfileOutput(10, true);
                    return;
                }
                if (command.startsWith("texsize")) {
                    int texSize = Integer.parseInt(command.substring(8));
                    lg.r.getTexSize(texSize);
                    return;
                }
                if (command.equals("soundstreamcount")) {
                    ia.sendConsoleCommandText(4, "Active streams: " + ej.r.getSoundStreamCount());
                    return;
                }
                if (command.equals("autosetup")) {
                    cs.g.autoSetup((byte) 103);
                    ia.sendConsoleCommandText(4, "Complete. Toolkit now: " + on.performance);
                    return;
                }
                if (command.equals("errormessage")) {
                    ia.sendConsoleCommandText(4, po.c.errorMessage((byte) -30));
                    return;
                }
                if (command.equals("heapdump")) {
                    if (!Signlink.osNameLowerCase.startsWith("win")) {
                        gba.dumpHeap(-4496, false, new File("/tmp/heap.dump"));
                    } else {
                        gba.dumpHeap(-4496, false, new File("C:\\Temp\\heap.dump"));
                    }
                    ia.sendConsoleCommandText(i ^ 0x4, "Done");
                    return;
                }
                if (command.equals("os")) {
                    ia.sendConsoleCommandText(4, "Name: " + Signlink.osNameLowerCase);
                    ia.sendConsoleCommandText(4, "Arch: " + Signlink.osArch);
                    ia.sendConsoleCommandText(4, "Ver: " + Signlink.osVersion);
                    return;
                }
                if (command.equals("w2debug")) {
                    la.w2Debug = !la.w2Debug;
                    ka.rebuildMap((byte) 67);
                    ia.sendConsoleCommandText(i ^ 0x4, "Toggled!");
                    return;
                }
                if (hm.h == 10) {
                    fo.g++;
                    tba tba = jga.sendGameOutPacket(bh.A, pca.isaac, (byte) -98);
                    tba.loginStream.writeByte(command.length() + 3, (byte) -125);
                    tba.loginStream.writeByte(!bool_34_ ? 0 : 1, (byte) -124);
                    tba.loginStream.writeByte(bool ? 1 : 0, (byte) -117);
                    tba.loginStream.writeString(command, -20);
                    ud.a(tba, (byte) -36);
                }
                if (command.startsWith("fps ") && oba.pk != hs.modeWhere) {
                    ri.showFPS(Class_g.a(128, command.substring(4)), -45);
                    return;
                }
            } catch (Exception exception) {
                ia.sendConsoleCommandText(4, GameText.errorExecutingCommand.getString(cba.languageID));
                return;
            }
        }
        if (hm.h != 10) {
            ia.sendConsoleCommandText(i + 4, GameText.unknownCommand.getString(cba.languageID) + command);
        }
    }

    static boolean a(boolean bool, int i, int i_55_) {
        g++;
        if (bool)
            b = -1.7512002F;
        boolean bool_56_
                = (0x37 & i) != 0 ? bk.a(i, i_55_, -124) : jv.a(3, i_55_, i);
        return bool_56_ | ((0x10000 & i_55_) != 0 | cj.a(i, -545, i_55_));
    }

    public Commands(qj qj, int i, int j) {
        d = qj;
        this.c = j;
    }
}
