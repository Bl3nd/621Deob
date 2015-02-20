/*
* nda-Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/


final class nda {
    static int a;
    static int b;
    static pl c;
    static ki d = new ki();
    static int e;
    static int f;
    static int g;
    static Class_ec h = new Class_ec(4);
    static Signlink signlink;
    static int[] j;
    static Class_r k;

    public static void a(byte i) {
        if (i <= 24)
            g = -16;
        j = null;
        nda.signlink = null;
        c = null;
        d = null;
        h = null;
        k = null;
    }

    static final void a(int i) {
        a++;
        vn.J = 0;
        boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
        int i_0_ = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
        int i_1_ = faa.loginStream.readShortSecondByteMinus128((byte) -80);
        int i_2_ = faa.loginStream.readUnsignedByteMinus128(i - 2072317725);
        oea.k(i - 2072317609);
        qba.a(i ^ 0x7b850e9a, i_2_);
        int i_3_ = (ck.currentGameInPacketSize - ((BytesParser) faa.loginStream).pos) / 16;
        ru.t = new int[i_3_][4];
        for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
            for (int i_5_ = 0; i_5_ < 4; i_5_++)
                ru.t[i_4_][i_5_] = faa.loginStream.readInt((int) 63);
        }
        lca.D = new byte[i_3_][];
        if (i != 2072317608)
            g = -74;
        fba.N = null;
        wk.h = new int[i_3_];
        uc.g = null;
        jv.u = new int[i_3_];
        pw.b = new byte[i_3_][];
        laa.f = new int[i_3_];
        iu.o = new int[i_3_];
        os.l = new int[i_3_];
        kaa.q = new byte[i_3_][];
        Class_ue.b = new byte[i_3_][];
        i_3_ = 0;
        for (int i_6_ = (i_1_ - (Class_hc.e >> 4)) / 8; (i_1_ + (Class_hc.e >> 4)) / 8 >= i_6_; i_6_++) {
            for (int i_7_ = (i_0_ - (bw.v >> 4)) / 8; i_7_ <= ((bw.v >> 4) + i_0_) / 8; i_7_++) {
                iu.o[i_3_] = (i_6_ << 8) + i_7_;
                wk.h[i_3_] = ua.c.a("m" + i_6_ + "_" + i_7_, i - 2072317670);
                os.l[i_3_] = ua.c.a("width" + i_6_ + "_" + i_7_, (int) -102);
                laa.f[i_3_] = ua.c.a("um" + i_6_ + "_" + i_7_, mv.a(i,
                        2072317572));
                jv.u[i_3_] = ua.c.a("ul" + i_6_ + "_" + i_7_, (int) 119);
                i_3_++;
            }
        }
        kga.a(11, 512, bool, i_1_, i_0_);
    }

    static final qga a(BytesParser var_es, int i) {
        e++;
        int i_8_ = var_es.readShort(13111);
        ct var_ct = dh.b((byte) 87)[var_es.readUnsignedByte(-9268)];
        rc var_rc = dg.b((int) 103)[var_es.readUnsignedByte(-9268)];
        int i_9_ = -63 / ((44 - i) / 60);
        int i_10_ = var_es.readShort2(51);
        int i_11_ = var_es.readShort2(106);
        return new qga(i_8_, var_ct, var_rc, i_10_, i_11_);
    }

    static final void a(int i, int i_12_, int i_13_, byte i_14_, int i_15_,
                        int i_16_, int i_17_, int i_18_, int i_19_) {
        f++;
        if (i_14_ != 68)
            c = null;
        if (i_15_ >= 1 && i_16_ >= 1 && Class_hc.e - 2 >= i_15_
                && bw.v - 2 >= i_16_) {
            int i_20_ = i_18_;
            if (i_20_ < 3 && ItemDef.b(i_16_, i_15_, 5706))
                i_20_++;
            if ((cs.g.e(on.performance, 113) || hk.a(i_20_, qca.E, i_15_, (byte) 108,
                    i_16_))
                    && ol.p != null) {
                gba.E.a(i_15_, su.a[i_18_], 99, i_18_, i, i_16_, lg.r);
                if (i_19_ >= 0) {
                    boolean bool = ((jb) cs.g).ab;
                    ((jb) cs.g).ab = true;
                    gba.E.a(i_13_, su.a[i_18_], i_17_, lg.r, i_12_, i_20_, -12,
                            i_19_, i_16_, i_18_, i_15_);
                    ((jb) cs.g).ab = bool;
                }
            }
        }
    }

    static final void handleNPCUpdateMasks(byte dummy) {
        if (dummy != -78)
            handleNPCUpdateMasks((byte) 6);
        for (int i_21_ = 0; i_21_ < pfa.e; i_21_++) {
            int i_22_ = sk.v[i_21_];
            NPC n = ((NPCNode) (NPCNode) uo.a.a(-32748, (long) i_22_)).l;
            int maskData = faa.loginStream.readUnsignedByte(-9268);
            if ((0x80 & maskData) != 0)
                maskData += faa.loginStream.readUnsignedByte(-9268) << 8;
            if ((maskData & 0x200) != 0) {
                int i_24_ = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
                ((Entity) n).dc = faa.loginStream.readUnsignedNegativeBytePlus128(255);
                ((Entity) n).fb = faa.loginStream
                        .readUnsignedNegativeBytePlus128(dummy + 333);
                ((Entity) n).ac = 0x7fff & i_24_;
                ((Entity) n).kb = (i_24_ & 0x8000) != 0;
                ((Entity) n).Y = ((Entity) n).ac
                        + (pm.currentTimedTicks + ((Entity) n).dc);
            }
            if ((0x10 & maskData) != 0) {//hit1
                int damage = faa.loginStream.readSmart2(-13829);
                int hitType = faa.loginStream.readUnsignedNegativeByte((byte) -18);
                n.applyHit(pm.currentTimedTicks, hitType, damage, dummy + 199);
                ((Entity) n).hitRemovalTime = pm.currentTimedTicks + 300;
                ((Entity) n).hitBarScale = faa.loginStream.readUnsignedByteMinus128(dummy ^ 0x39);
            }
            if ((0x2 & maskData) != 0) {
                if (((NPC) n).npcDef.a((byte) 126))
                    ei.a(n, (byte) -114);
                n.a(jm.p.getNPCDef(faa.loginStream
                                .readShortSecondByteMinus128((byte) -80), (byte) -121),
                        0);
                n.a(((NPCDef) ((NPC) n).npcDef).Q, 0);
                ((Entity) n).Zb = ((NPCDef) ((NPC) n).npcDef).U << 3;
                if (((NPC) n).npcDef.a((byte) -13))
                    kg.a(-120, null, null, 0, n, ((Entity) n).regionLocalX[0],
                            ((Entity) n).regionLocalY[0], ((Animable) n).height);
            }
            if ((0x20 & maskData) != 0) {
                ((Entity) n).faceEntityID = faa.loginStream
                        .readShortSecondByteMinus128((byte) -80);
                if (((Entity) n).faceEntityID == 65535)
                    ((Entity) n).faceEntityID = -1;
            }
            if ((maskData & 0x40) != 0) {
                ((NPC) n).Rc = faa.loginStream.readShort(13111);
                ((NPC) n).bd = faa.loginStream
                        .readShortReversedFirstByteMinus128_2(true);
            }
            if ((maskData & 0x800) != 0) {
                ((Entity) n).M = faa.loginStream.readBytePlus128(16436);
                ((Entity) n).fc = faa.loginStream.readNegativeByte(false);
                ((Entity) n).Yb = faa.loginStream.readByteMinus128((byte) -51);
                ((Entity) n).Db = faa.loginStream.readByte(-20933);
                ((Entity) n).xc = faa.loginStream
                        .readShortSecondByteMinus128((byte) -80)
                        + pm.currentTimedTicks;
                ((Entity) n).ab = faa.loginStream
                        .readShortSecondByteMinus128((byte) -80)
                        + pm.currentTimedTicks;
                ((Entity) n).ub = faa.loginStream.readUnsignedNegativeBytePlus128(255);
                ((Entity) n).fc += ((Entity) n).regionLocalY[0];
                ((Entity) n).Nc = 1;
                ((Entity) n).M += ((Entity) n).regionLocalX[0];
                ((Entity) n).Yb += ((Entity) n).regionLocalX[0];
                ((Entity) n).Db += ((Entity) n).regionLocalY[0];
                ((Entity) n).Kc = 0;
            }
            if ((0x1000 & maskData) != 0) {//hit2
                int damage = faa.loginStream.readSmart2(-13829);
                int hitType = faa.loginStream.readUnsignedNegativeByte((byte) -18);
                n.applyHit(pm.currentTimedTicks, hitType, damage, 123);
            }
            if ((maskData & 0x100) != 0) {
                int i_29_ = faa.loginStream.readShortReversed((byte) 104);
                int i_30_ = faa.loginStream.readInt(dummy ^ ~0x74);
                if (i_29_ == 65535)
                    i_29_ = -1;
                int i_31_ = faa.loginStream.readUnsignedNegativeByte((byte) -18);
                n.applyGraphics(i_30_, i_29_, (byte) 97, i_31_, true);
            }
            if ((maskData & 0x1) != 0) {
                int i_32_ = faa.loginStream.readShortSecondByteMinus128((byte) -80);
                int i_33_ = faa.loginStream.readIntShiftsInOrder_16_24_0_8((int) -71);
                if (i_32_ == 65535)
                    i_32_ = -1;
                int i_34_ = faa.loginStream.readUnsignedByte(dummy - 9190);
                n.applyGraphics(i_33_, i_32_, (byte) 37, i_34_, false);
            }
            if ((maskData & 0x400) != 0) {
                ((Entity) n).vb = faa.loginStream.readByteMinus128((byte) -51);
                ((Entity) n).Mb = faa.loginStream.readBytePlus128(16436);
                ((Entity) n).Tb = faa.loginStream.readNegativeByte(false);
                ((Entity) n).Xb = (byte) faa.loginStream.readUnsignedByte(-9268);
                ((Entity) n).zc = pm.currentTimedTicks
                        + faa.loginStream.readShortReversedFirstByteMinus128_2(true);
                ((Entity) n).Cb = pm.currentTimedTicks
                        + faa.loginStream.readShortReversedFirstByteMinus128_2(true);
            }
            if ((0x2000 & maskData) != 0) {
                int i_35_ = faa.loginStream.readUnsignedByteMinus128(dummy - 39);
                int[] is = new int[i_35_];
                int[] is_36_ = new int[i_35_];
                int[] is_37_ = new int[i_35_];
                for (int i_38_ = 0; i_35_ > i_38_; i_38_++) {
                    int i_39_ = faa.loginStream.readShortSecondByteMinus128((byte) -80);
                    if (i_39_ == 65535)
                        i_39_ = -1;
                    is[i_38_] = i_39_;
                    is_36_[i_38_] = faa.loginStream.readUnsignedByteMinus128(-106);
                    is_37_[i_38_] = faa.loginStream
                            .readShortReversedFirstByteMinus128_2(true);
                }
                af.a(is, is_36_, (byte) -94, n, is_37_);
            }
            if ((maskData & 0x4) != 0) {
                int[] animIDs = new int[4];
                for (int loopID = 0; loopID < 4; loopID++) {
                    animIDs[loopID] = faa.loginStream.readShort(13111);
                    if (animIDs[loopID] == 65535)
                        animIDs[loopID] = -1;
                }
                int delay = faa.loginStream.readUnsignedByteMinus128(-122);
                bg.applyNPCAnim(animIDs, (byte) -122, n, delay);
            }
            if ((maskData & 0x8) != 0) {//NPC chat mask?
                ((Entity) n).cb = faa.loginStream.readString((byte) 125);
                ((Entity) n).Q = 100;
            }
        }
        b++;
    }
}
