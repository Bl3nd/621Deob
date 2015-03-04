// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public final class Interface {

    public final void reset(int i1) {
        J = null;
        nd = null;
        k = null;
        L = null;
        zb = null;
        Bb = null;
        hb = null;
        ec = null;
        S = null;
        Pc = null;
        Tb = null;
        E = null;
        F = null;
        ob++;
        Kc = null;
        P = null;
        Cc = null;
        Zc = null;
        pb = null;
        Sb = null;
        Q = null;
        if (i1 != 0) {
            return;
        } else {
            rd = null;
            Mb = null;
            sc = null;
            Pb = null;
            cb = null;
            e = null;
            lc = null;
            T = null;
            qc = null;
            Gc = null;
            jb = null;
            gd = null;
            q = null;
            I = null;
            cd = null;
            wb = null;
            return;
        }
    }

    public final void a(int i, String string, int j) {
        rb++;
        if (itemActions == null || itemActions.length <= i) {
            String actions[] = new String[i + 1];
            if (itemActions != null) {
                for (int index = 0; index < itemActions.length; index++) {
                    actions[index] = itemActions[index];
                }
            }
            itemActions = actions;
        }
        itemActions[i] = string;
    }

    public final void b(int i, String string, int j) {
        A++;
        if (qb == null) {
            qb = new il(16);
            qb.a(new Node_Sub(string), (byte) -61, i);
            return;
        }
        if (j != 100) {
            ib = true;
        }
        Node_Sub aa1 = (Node_Sub) qb.a(-32748, i);
        if (aa1 != null) {
            aa1.m = string;
            return;
        } else {
            qb.a(new Node_Sub(string), (byte) -27, i);
            return;
        }
    }

    public final da a(Class_r class_r, haa haa, int i, wca wca, ItemDefLoader itemDefLoader, int j, PlayerUpdateLocation updateLocation,
               dr dr, PlayerDef playerDef, int k, int mask_, Class_lb class_lb, int j2, hl hl) {
        fo.r = false;
        Hc++;
        if (modelType == 0) {
            return null;
        }
        if (modelType == 1 && ~modelID == 0) {
            return null;
        }
        if (modelType == 1) {
            int mask = mask_;
            if (dr != null) {
                mask_ |= dr.a(1024, k, true, j2);
            }
            long id = (class_r.b << 29) + (modelType << 16) + modelID;
            da da = (da) gea.m.get(id, (byte) 100);
            if (da == null || class_r.b(da.PA(), mask_) != 0) {
                if (da != null) {
                    mask_ = class_r.a(mask_, da.PA());
                }
                eg eg1 = efa.a(modelID, nr.i, 0, false);
                if (eg1 == null) {
                    fo.r = true;
                    return null;
                }
                if (eg1.bb < 13) {
                    eg1.a((byte) -107, 2);
                }
                da = class_r.a(eg1, mask_, Class_fd.y, 64, 768);
                gea.m.put(id, da, 1);
            }
            if (dr != null) {
                da = dr.a(j2, mask_, (byte) 122, i, k, da);
            }
            da.SA(mask);
            return da;
        }
        if (modelType == 2) {
            da da1 = class_lb.getNPCDef(modelID, (byte) -114).a(haa, mask_, (byte) 71, dr, k, hl, i, class_r, j2);
            if (da1 == null) {
                fo.r = true;
                return null;
            } else {
                return da1;
            }
        }
        if (modelType == 3) {
            if (playerDef == null) {
                return null;
            }
            da da2 = playerDef.a(i, mask_, haa, dr, j2, itemDefLoader, 768, hl, k, class_lb, updateLocation, class_r);
            if (da2 == null) {
                fo.r = true;
                return null;
            } else {
                return da2;
            }
        }
        if (modelType == 4) {
            ItemDef itemDef = itemDefLoader.d(12388, modelID);
            da da4 = itemDef.a(i, class_r, mask_, dr, j2, playerDef, 10, k, 0xffffff);
            if (da4 == null) {
                fo.r = true;
                return null;
            } else {
                return da4;
            }
        }
        if (modelType == 6) {
            da da3 = class_lb.getNPCDef(modelID, (byte) -91).a(j2, 0, k, wca, 0, i, null, 13770, 0, dr, hl, mask_, null, class_r, haa);
            if (da3 == null) {
                fo.r = true;
                return null;
            } else {
                return da3;
            }
        }
        if (modelType == 7) {
            if (playerDef == null) {
                return null;
            }
            int k2 = modelID >>> 16;
            int i3 = 0xffff & modelID;
            int j3 = U;
            da da6 = playerDef.a(k2, hl, i, k, i3, (byte) -42, dr, j3, class_r, j2, mask_, updateLocation);
            if (da6 == null) {
                fo.r = true;
                return null;
            } else {
                return da6;
            }
        }
        if (j > -107) {
            return null;
        } else {
            return null;
        }
    }

    public final void a(byte b, int i, int id) {
        g++;
        if (qb == null) {
            qb = new il(16);
            qb.a(new GameInPacketHandler(i), (byte) -30, id);
            return;
        }
        GameInPacketHandler hda1 = (GameInPacketHandler) qb.a(-32748, id);
        if (hda1 != null) {
            hda1.k = i;
        } else {
            qb.a(new GameInPacketHandler(i), (byte) -89, id);
        }
    }

    public static void a(int i, int j, int k, int i1) {
        N++;
        if (i1 != 0) {
            eb = null;
        }
        tu.b = new byte[i][k][j];
    }

    public final void a(int i, int j, int k) {
        t++;
        if (kb == null || kb.length <= j) {
            int ai[] = new int[j + 1];
            if (kb != null) {
                for (int index = 0; index < kb.length; index++) {
                    ai[index] = kb[index];
                }
                for (int index = kb.length; j > index; index++) {
                    ai[index] = -1;
                }
            }
            kb = ai;
        }
        kb[j] = k;
        if (i != 0) {
            a(((Class_r) (null)), 70);
        }
    }

    public final void a(BytesParser bytesParser, int i) {
        mc++;
        int j = bytesParser.readUnsignedByte(-9268);
        if (j == 255) {
            j = -1;
        }
        type = bytesParser.readUnsignedByte(-9268);
        if ((0x80 & type) != 0) {
            type &= 0x7f;
            Hb = bytesParser.readString((byte) 116);
        }
        v = bytesParser.readShort(13111);
        hc = bytesParser.readShort2(48);
        Wc = bytesParser.readShort2(i ^ 0x6a73);
        width = bytesParser.readShort(13111);
        height = bytesParser.readShort(i ^ 0x5922);
        f = bytesParser.readByte(-20933);
        o = bytesParser.readByte(i - 48090);
        hd = bytesParser.readByte(-20933);
        ab = bytesParser.readByte(i ^ 0xffffc42e);
        parentID = bytesParser.readShort(13111);
        if (parentID != 65535) {
            parentID = parentID + (interfaceID & 0xffff0000);
        } else {
            parentID = -1;
        }
        int k = bytesParser.readUnsignedByte(-9268);
        if (j >= 0) {
            vc = (k & 2) != 0;
        }
        hidden = (1 & k) != 0;
        if (type == 0) {
            maxHScroll = bytesParser.readShort(13111);
            maxVScroll = bytesParser.readShort(13111);
            if (j < 0) {
                vc = bytesParser.readUnsignedByte(-9268) == 1;
            }
        }
        if (type == 5) {
            textureID = bytesParser.readInt(i - 27069);
            db = bytesParser.readShort(13111);
            int i1 = bytesParser.readUnsignedByte(-9268);
            jd = (1 & i1) != 0;
            xb = (2 & i1) != 0;
            mb = bytesParser.readUnsignedByte(-9268);
            borderThickness = bytesParser.readUnsignedByte(-9268);
            shadowColor = bytesParser.readInt(88);
            flippedVertically = bytesParser.readUnsignedByte(-9268) == 1;
            flippedHorizontally = bytesParser.readUnsignedByte(-9268) == 1;
            textColor = bytesParser.readInt(57);
        }
        if (type == 6) {
            modelType = 1;
            modelID = bytesParser.readShort(13111);
            if (modelID == 65535) {
                modelID = -1;
            }
            int i1 = bytesParser.readUnsignedByte(-9268);
            boolean flag = (i1 & 1) == 1;
            w = (i1 & 4) == 4;
            C = (i1 & 2) == 2;
            ad = (i1 & 8) == 8;
            if (!flag) {
                if (C) {
                    vb = bytesParser.readShort2(71);
                    H = bytesParser.readShort2(116);
                    O = bytesParser.readShort2(i ^ 0x6a53);
                    modelRotationX = bytesParser.readShort(i - 14046);
                    modelRotationY = bytesParser.readShort(13111);
                    modelRotationZ = bytesParser.readShort(13111);
                    modelZoom = bytesParser.readShort2(117);
                }
            } else {
                vb = bytesParser.readShort2(i ^ 0x6a52);
                H = bytesParser.readShort2(i - 27127);
                modelRotationX = bytesParser.readShort(i ^ 0x5922);
                modelRotationY = bytesParser.readShort(13111);
                modelRotationZ = bytesParser.readShort(13111);
                modelZoom = bytesParser.readShort(13111);
            }
            V = bytesParser.readShort(13111);
            if (V == 65535) {
                V = -1;
            }
            if (f != 0) {
                n = bytesParser.readShort(i ^ 0x5922);
            }
            if (o != 0) {
                dc = bytesParser.readShort(13111);
            }
        }
        if (type == 4) {
            Ab = bytesParser.readShort(13111);
            if (Ab == 65535) {
                Ab = -1;
            }
            text = bytesParser.readString((byte) 125);
            Db = bytesParser.readUnsignedByte(-9268);
            Fb = bytesParser.readUnsignedByte(-9268);
            Z = bytesParser.readUnsignedByte(-9268);
            isInventoryInterface = bytesParser.readUnsignedByte(-9268) == 1;
            textColor = bytesParser.readInt(79);
            mb = bytesParser.readUnsignedByte(-9268);
            if (j >= 0) {
                r = bytesParser.readUnsignedByte(-9268);
            }
        }
        if (type == 3) {
            textColor = bytesParser.readInt(103);
            c = bytesParser.readUnsignedByte(-9268) == 1;
            mb = bytesParser.readUnsignedByte(-9268);
        }
        if (type == 9) {
            X = bytesParser.readUnsignedByte(-9268);
            textColor = bytesParser.readInt(i - 27041);
            oc = bytesParser.readUnsignedByte(-9268) == 1;
        }
        int hash = bytesParser.readTribyte(i ^ 0xffff95ea);
        int j1 = bytesParser.readUnsignedByte(i - 36425);
        if (j1 != 0) {
            ub = new byte[11];
            tc = new int[11];
            Nc = new byte[11];
            for (; j1 != 0; j1 = bytesParser.readUnsignedByte(-9268)) {
                int k1 = (j1 >> 4) - 1;
                j1 = j1 << 8 | bytesParser.readUnsignedByte(i - 36425);
                j1 &= 0xfff;
                if (j1 == 4095) {
                    j1 = -1;
                }
                byte b = bytesParser.readByte(-20933);
                if (b != 0) {
                    Ic = true;
                }
                byte b1 = bytesParser.readByte(-20933);
                tc[k1] = j1;
                ub[k1] = b;
                Nc[k1] = b1;
            }

        }
        itemName = bytesParser.readString((byte) 127);
        int k1 = bytesParser.readUnsignedByte(-9268);
        int i2 = 0xf & k1;
        int j2 = k1 >> 4;
        if (i2 > 0) {
            itemActions = new String[i2];
            for (int actions = 0; i2 > actions; actions++) {
                itemActions[actions] = bytesParser.readString((byte) 126);
            }
        }
        if (j2 > 0) {
            int k2 = bytesParser.readUnsignedByte(-9268);
            kb = new int[k2 + 1];
            for (int index = 0; kb.length > index; index++) {
                kb[index] = -1;
            }
            kb[k2] = bytesParser.readShort(13111);
        }
        if (j2 > 1) {
            int k2 = bytesParser.readUnsignedByte(-9268);
            kb[k2] = bytesParser.readShort(13111);
        }
        bd = bytesParser.readString((byte) 123);
        if (bd.equals("")) {
            bd = null;
        }
        x = bytesParser.readUnsignedByte(-9268);
        lb = bytesParser.readUnsignedByte(i ^ 0xffffb1d9);
        od = bytesParser.readUnsignedByte(i ^ 0xffffb1d9);
        G = bytesParser.readString((byte) 118);
        int id = -1;
        if (mv.a(hash, (byte) 109) != 0) {
            id = bytesParser.readShort(13111);
            if (id == 65535) {
                id = -1;
            }
            tb = bytesParser.readShort(13111);
            if (tb == 65535) {
                tb = -1;
            }
            cc = bytesParser.readShort(13111);
            if (cc == 65535) {
                cc = -1;
            }
        }
        if (j >= 0) {
            Mc = bytesParser.readShort(13111);
            if (Mc == 65535) {
                Mc = -1;
            }
        }
        qd = new nm(hash, id);
        if (j >= 0) {
            int k2 = bytesParser.readUnsignedByte(i - 36425);
            for (int i3 = 0; k2 > i3; i3++) {
                int j3 = bytesParser.readTribyte(-1);
                int k3 = bytesParser.readInt(97);
                qb.a(new GameInPacketHandler(k3), (byte) -77, j3);
            }

            int i3 = bytesParser.readUnsignedByte(-9268);
            for (int j3 = 0; i3 > j3; j3++) {
                int k3 = bytesParser.readTribyte(-1);
                String string = bytesParser.readString2(-1);
                qb.a(new Node_Sub(string), (byte) -100, k3);
            }

        }
        Tb = a(false, bytesParser);
        e = a(false, bytesParser);
        Bb = a(false, bytesParser);
        E = a(false, bytesParser);
        jb = a(false, bytesParser);
        Zc = a(false, bytesParser);
        Cc = a(false, bytesParser);
        ec = a(false, bytesParser);
        Q = a(false, bytesParser);
        nd = a(false, bytesParser);
        if (j >= 0) {
            zb = a(false, bytesParser);
        }
        wb = a(false, bytesParser);
        Pb = a(false, bytesParser);
        Pc = a(false, bytesParser);
        cb = a(false, bytesParser);
        if (i != 27157) {
            return;
        } else {
            Sb = a(false, bytesParser);
            L = a(false, bytesParser);
            gd = a(false, bytesParser);
            T = a(false, bytesParser);
            this.k = a(false, bytesParser);
            S = a(false, bytesParser);
            q = a(bytesParser, (byte) 57);
            P = a(bytesParser, (byte) 51);
            qc = a(bytesParser, (byte) -75);
            lc = a(bytesParser, (byte) 116);
            pb = a(bytesParser, (byte) 71);
            return;
        }
    }

    public final void a(byte b, da da, Class_q class_q, Class_r class_r, int ticks) {
        Eb++;
        da.a(class_q);
        hi his[] = da.c();
        if (b != 55) {
            b(null, -7);
        }
        qg qgs[] = da.f();
        if ((Qc == null || Qc.k) && (his != null || qgs != null)) {
            Qc = tq.a(ticks, false);
        }
        if (Qc != null) {
            Qc.a(class_r, ticks, his, qgs, false);
        }
    }

    public final tw a(hu hu, nk nk, byte b) {
        Lb++;
        if (~yc == 0) {
            return null;
        }
        long id = ((long) Tc & 65535L) << 16 | ((65535L & (long) D) << 32 | (65535L & (long) y) << 48) | (long) yc & 65535L;
        if (b < 57) {
            H = -69;
        }
        tw tw = (tw) up.K.get(id, (byte) 100);
        if (tw == null) {
            tw = hu.a(nk, y, D, Tc, -29532, yc);
            up.K.put(id, tw, 1);
        }
        return tw;
    }

    private int[] a(BytesParser bytesParser, byte b) {
        W++;
        int i = bytesParser.readUnsignedByte(-9268);
        if (i == 0) {
            return null;
        }
        int ai[] = new int[i];
        int index = 0;
        for (; i > index; index++) {
            ai[index] = bytesParser.readInt(82);
        }
        return ai;
    }

    public final String a(String string, int id, int j) {
        fc++;
        if (j != 4095) {
            return null;
        }
        if (qb == null) {
            return string;
        }
        Node_Sub aa = (Node_Sub) qb.a(-32748, id);
        if (aa == null) {
            return string;
        } else {
            return aa.m;
        }
    }

    public static void nullLoader(int i) {
        password = null;
        Yc = null;
        if (i != -1) {
            return;
        } else {
            grandExchangeItems = null;
            eb = null;
            incomingPacket22 = null;
            return;
        }
    }


    public final f a(Class_r class_r, int i) {
        try {
            long id;
            aga aga1;
            label0:
            {
                Nb++;
                fo.r = false;
                if (i >= -33) {
                    J = null;
                }
                id = ((long) shadowColor << 0xd3bbbee8) + (((flippedVertically ? 1L : 0L) << 0xd5bcd26) + (long) textureID
                        + (((xb ? 1L : 0L) << 0x67164023) + ((long) borderThickness << 0x796ccba4)
                        + ((flippedHorizontally ? 1L : 0L) << 0x6c79de67)));
                f f = (f) sr.U.get(id, (byte) 100);
                if (f != null) {
                    return f;
                }
                aga1 = aga.a(dga.G, textureID, 0);
                if (aga1 == null) {
                    fo.r = true;
                    return null;
                }
                if (flippedVertically) {
                    aga1.g();
                }
                if (flippedHorizontally) {
                    aga1.a();
                }
                if (borderThickness <= 0) {
                    if (shadowColor == 0) {
                        break label0;
                    }
                    aga1.b(1);
                    if (!client.sb) {
                        break label0;
                    }
                }
                aga1.b(borderThickness);
            }
            if (~borderThickness <= -2) {
                aga1.a(1);
            }
            if (~borderThickness <= -3) {
                aga1.a(0xffffff);
            }
            if (~shadowColor != -1) {
                aga1.c(shadowColor | 0xff000000);
            }
            f f1 = class_r.a(aga1, true);
            sr.U.put((byte) -124, 4 * (f1.E() * f1.u()), id, f1);
            return f1;
        } catch (RuntimeException runtimeexception) {
            //throw nc.nullLoader(runtimeexception, "kp.N(" + (class_r == null ? "null" : "{...}") + ',' + i1 + ')');
            runtimeexception.printStackTrace();
            return null;
        }
    }

    public final void a(int id, byte b) {
        d++;
        if (qb != null) {
            Node node = qb.a(-32748, id);
            if (node != null) {
                node.unlink(-38);
            }
        }
        if (b != -106) {
            mb = -58;
        }
    }

    public static void c(int i) {
        Sc++;
        Node.b = new String[500];
        uj.L = Class_nd.o.n + Class_nd.o.b + 2;
        el.e = dca.R.n + dca.R.b + 2;
        for (int index = 0; Node.b.length > index; index++) {
            Node.b[index] = "";
        }
        ia.sendConsoleCommandText(4, GameText.developerConsoleInfoText.getString(cba.languageID));
    }

    private Object[] a(boolean flag, BytesParser bytesParser) {
        bb++;
        int i = bytesParser.readUnsignedByte(-9268);
        if (i == 0) {
            return null;
        }
        Object objects[] = new Object[i];
        if (flag) {
            a(41, (byte) 20);
        }
        for (int index = 0; index < i; index++) {
            int j = bytesParser.readUnsignedByte(-9268);
            if (j != 0) {
                if (j == 1) {
                    objects[index] = bytesParser.readString((byte) 119);
                }
            } else {
                objects[index] = new Integer(bytesParser.readInt(94));
            }
        }
        Kb = true;
        return objects;
    }

    public final int b(int i, int j, int id) {
        ac++;
        if (qb == null) {
            return j;
        }
        GameInPacketHandler inPacketHandler = (GameInPacketHandler) qb.a(-32748, id);
        if (inPacketHandler == null) {
            return j;
        } else {
            return inPacketHandler.k;
        }
    }

    public final ua a(byte b, Class_r class_r) {
        gb++;
        ua ua = (ua) up.D.get(interfaceID, (byte) 100);
        if (ua != null) {
            return ua;
        }
        aga aga1 = aga.a(dga.G, textureID, 0);
        if (aga1 == null) {
            return null;
        }
        int i = aga1.e + (aga1.b + aga1.a);
        int j = aga1.d + (aga1.g + aga1.h);
        pc = new int[j];
        Jc = new int[j];
        for (int k = 0; aga1.d > k; k++) {
            int i1 = 0;
            for (int j1 = 0; j1 < aga1.b; j1++) {
                if (aga1.c[j1 + aga1.b * k] == 0) {
                    continue;
                }
                i1 = j1;
                break;
            }
            int j1 = i;
            for (int k1 = i1; k1 < aga1.b; k1++) {
                if (aga1.c[aga1.b * k + k1] != 0) {
                    continue;
                }
                j1 = k1;
                break;
            }
            pc[aga1.g + k] = aga1.e + i1;
            Jc[k + aga1.g] = j1 - i1;
        }
        ua = class_r.a(i, j, pc, Jc);
        up.D.put(interfaceID, ua, 1);
        if (b != 125) {
            return null;
        } else {
            return ua;
        }
    }

    public final la b(Class_r class_r, int i) {
        Ob++;
        la la = ao.a(false, Ab, class_r, 0);
        if (i != -7230) {
            return null;
        } else {
            fo.r = la == null;
            return la;
        }
    }

    public Interface() {
        a = -1;
        height = 0;
        minVScroll = 0;
        modelType = 1;
        H = 0;
        c = false;
        n = 0;
        ab = 0;
        R = 0;
        x = 0;
        textColor = 0;
        ib = false;
        Ab = -1;
        U = -1;
        minHScroll = 0;
        vb = 0;
        V = -1;
        Kb = false;
        vScroll = 0;
        modelRotationY = 0;
        db = 0;
        X = 1;
        s = 0;
        Y = 0;
        Rb = 1;
        j = 0;
        f = 0;
        hScroll = 0;
        locY = 0;
        dc = 0;
        lb = 0;
        Db = 0;
        cc = -1;
        G = "";
        Ub = false;
        O = 0;
        borderThickness = 0;
        textureID = -1;
        o = 0;
        v = 0;
        isInventoryInterface = false;
        tb = -1;
        width = 0;
        yb = 0;
        xb = false;
        Ac = -1;
        yc = -1;
        vc = false;
        interfaceID = -1;
        text = "";
        itemName = "";
        Z = 0;
        shadowColor = 0;
        ic = false;
        hc = 0;
        r = 0;
        wc = 0;
        itemID = -1;
        oc = false;
        Fb = 0;
        Wc = 0;
        parentID = -1;
        Ic = false;
        ad = false;
        maxVScroll = 0;
        modelZoom = 100;
        w = false;
        maxHScroll = 0;
        Rc = 2;
        Ec = 0;
        Mc = -1;
        Xb = -1;
        Uc = 1;
        Cb = 0;
        modelRotationX = 0;
        rc = 1;
        jd = false;
        modelRotationZ = 0;
        locX = 0;
        fd = null;
        kd = -1;
        itemIndex = -1;
        hidden = false;
        Jb = 0;
        od = ao.k;
        hd = 0;
        qd = mfa.f;
        itemStackSize = 0;
        mb = 0;
    }

    int a;
    int minVScroll;
    boolean c;
    static int d;
    Object e[];
    byte f;
    static int g;
    int height;
    Interface children[];
    int j;
    Object k[];
    int textColor;
    int m[];
    int n;
    byte o;
    int modelType;
    int q[];
    int r;
    int s;
    static int t;
    int parentID;
    int v;
    boolean w;
    int x;
    int y;
    int locY;
    static int A;
    int locX;
    boolean C;
    int D;
    Object E[];
    Object F[];
    String G;
    int H;
    Object I[];
    Object J[];
    int type;
    Object L[];
    boolean flippedVertically;
    static int N;
    int O;
    int P[];
    Object Q[];
    int R;
    Object S[];
    Object T[];
    int U;
    int V;
    static int W;
    int X;
    int Y;
    int Z;
    byte ab;
    static int bb;
    Object cb[];
    int db;
    static int eb[] = new int[1];
    static GameInPacket incomingPacket22 = new GameInPacket(22, 8);
    static int gb;
    Object hb[];
    boolean ib;
    Object jb[];
    int kb[];
    int lb;
    int mb;
    int interfaceID;
    static int ob;
    int pb[];
    private il qb;
    static int rb;
    int vScroll;
    int tb;
    byte ub[];
    int vb;
    Object wb[];
    boolean xb;
    int yb;
    Object zb[];
    int Ab;
    Object Bb[];
    int Cb;
    int Db;
    static int Eb;
    int Fb;
    int textureID;
    String Hb;
    int hScroll;
    int Jb;
    boolean Kb;
    static int Lb;
    Object Mb[];
    static int Nb;
    static int Ob;
    Object Pb[];
    int minHScroll;
    int Rb;
    Object Sb[];
    Object Tb[];
    boolean Ub;
    int modelID;
    int modelRotationY;
    int Xb;
    boolean flippedHorizontally;
    int Zb;
    static int ac;
    int bc;
    int cc;
    int dc;
    Object ec[];
    static int fc;
    int gc;
    int hc;
    boolean ic;
    int borderThickness;
    int modelRotationX;
    int lc[];
    static int mc;
    int maxHScroll;
    boolean oc;
    int pc[];
    int qc[];
    int rc;
    Object sc[];
    int tc[];
    int width;
    boolean vc;
    int wc;
    boolean isInventoryInterface;
    int yc;
    String itemName;
    int Ac;
    String itemActions[];
    Object Cc[];
    int itemID;
    int Ec;
    int itemIndex;
    Object Gc[];
    static int Hc;
    boolean Ic;
    int Jc[];
    Object Kc[];
    String text;
    int Mc;
    byte Nc[];
    int shadowColor;
    Object Pc[];
    tq Qc;
    int Rc;
    static int Sc;
    int Tc;
    int Uc;
    int modelZoom;
    int Wc;
    int maxVScroll;
    static rca Yc = new rca();
    Object Zc[];
    boolean ad;
    String bd;
    Object cd[];
    int itemStackSize;
    boolean hidden;
    Interface fd;
    Object gd[];
    byte hd;
    static GrandExchangeItem grandExchangeItems[] = new GrandExchangeItem[6];
    boolean jd;
    int kd;
    static String password = "";
    int modelRotationZ;
    Object nd[];
    int od;
    static int pd = 0;
    nm qd;
    Object rd[];

}
