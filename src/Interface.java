// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


final class Interface
{

    final void a(int i1)
    {
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
        if(i1 != 0)
        {
            return;
        } else
        {
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

    final void a(int i1, String s1, int j1)
    {
        rb++;
        int k1 = 19 % ((j1 - 20) / 53);
        if(itemActions == null || itemActions.length <= i1)
        {
            String as[] = new String[i1 + 1];
            if(itemActions != null)
            {
                for(int l1 = 0; l1 < itemActions.length; l1++)
                    as[l1] = itemActions[l1];

            }
            itemActions = as;
        }
        itemActions[i1] = s1;
    }

    final void b(int i1, String s1, int j1)
    {
        A++;
        if(qb == null)
        {
            qb = new il(16);
            qb.a(new aa(s1), (byte)-61, i1);
            return;
        }
        if(j1 != 100)
            ib = true;
        aa aa1 = (aa)qb.a(-32748, i1);
        if(aa1 != null)
        {
            aa1.m = s1;
            return;
        } else
        {
            qb.a(new aa(s1), (byte)-27, i1);
            return;
        }
    }

    final da a(Class_r class_r, haa haa, int i1, wca wca, ItemDefLoader mf1, int j1, PlayerUpdateLocation cn,
            dr dr1, PlayerDef kn1, int k1, int l1, Class_lb class_lb, int i2, hl hl)
    {
        fo.r = false;
        Hc++;
        if(modelType == 0)
            return null;
        if(modelType == 1 && ~modelID == 0)
            return null;
        if(modelType == 1)
        {
            int j2 = l1;
            if(dr1 != null)
                l1 |= dr1.a(1024, k1, true, i2);
            long l2 = (class_r.b << 29) + (modelType << 16) + modelID;
            da da5 = (da)gea.m.get(l2, (byte)100);
            if(da5 == null || class_r.b(da5.PA(), l1) != 0)
            {
                if(da5 != null)
                    l1 = class_r.a(l1, da5.PA());
                eg eg1 = efa.a(modelID, nr.i, 0, false);
                if(eg1 == null)
                {
                    fo.r = true;
                    return null;
                }
                if(eg1.bb < 13)
                    eg1.a((byte)-107, 2);
                da5 = class_r.a(
                		eg1, 
                		l1, 
                		Class_fd.y, 
                		64, 
                		768);
                gea.m.put(l2, da5, 1);
            }
            if(dr1 != null)
                da5 = dr1.a(i2, l1, (byte)122, i1, k1, da5);
            da5.SA(j2);
            return da5;
        }
        if(modelType == 2)
        {
            da da1 = class_lb.getNPCDef(modelID, (byte)-114).a(haa, l1, (byte)71, dr1, k1, hl, i1, class_r, i2);
            if(da1 == null)
            {
                fo.r = true;
                return null;
            } else
            {
                return da1;
            }
        }
        if(modelType == 3)
        {
            if(kn1 == null)
                return null;
            da da2 = kn1.a(i1, l1, haa, dr1, i2, mf1, 768, hl, k1, class_lb, cn, class_r);
            if(da2 == null)
            {
                fo.r = true;
                return null;
            } else
            {
                return da2;
            }
        }
        if(modelType == 4)
        {
            ItemDef uv1 = mf1.d(12388, modelID);
            da da4 = uv1.a(i1, class_r, l1, dr1, i2, kn1, 10, k1, 0xffffff);
            if(da4 == null)
            {
                fo.r = true;
                return null;
            } else
            {
                return da4;
            }
        }
        if(modelType == 6)
        {
            da da3 = class_lb.getNPCDef(modelID, (byte)-91).a(i2, 0, k1, wca, 0, i1, null, 13770, 0, dr1, hl, l1, null, class_r, haa);
            if(da3 == null)
            {
                fo.r = true;
                return null;
            } else
            {
                return da3;
            }
        }
        if(modelType == 7)
        {
            if(kn1 == null)
                return null;
            int k2 = modelID >>> 16;
            int i3 = 0xffff & modelID;
            int j3 = U;
            da da6 = kn1.a(k2, hl, i1, k1, i3, (byte)-42, dr1, j3, class_r, i2, l1, cn);
            if(da6 == null)
            {
                fo.r = true;
                return null;
            } else
            {
                return da6;
            }
        }
        if(j1 > -107)
            return null;
        else
            return null;
    }

    final void a(byte byte0, int i1, int j1)
    {
        g++;
        if(qb == null)
        {
            qb = new il(16);
            qb.a(new GameInPacketHandler(i1), (byte)-30, j1);
            return;
        }
        GameInPacketHandler hda1 = (GameInPacketHandler)qb.a(-32748, j1);
        if(hda1 != null)
            hda1.k = i1;
        else
            qb.a(new GameInPacketHandler(i1), (byte)-89, j1);
        int k1 = 91 % ((byte0 - 4) / 53);
    }

    static final void a(int i1, int j1, int k1, int l1)
    {
        N++;
        if(l1 != 0)
            eb = null;
        tu.b = new byte[i1][k1][j1];
    }

    final void a(int i1, int j1, int k1)
    {
        t++;
        if(kb == null || kb.length <= j1)
        {
            int ai[] = new int[j1 + 1];
            if(kb != null)
            {
                for(int l1 = 0; l1 < kb.length; l1++)
                    ai[l1] = kb[l1];

                for(int i2 = kb.length; j1 > i2; i2++)
                    ai[i2] = -1;

            }
            kb = ai;
        }
        kb[j1] = k1;
        if(i1 != 0)
            a(((Class_r) (null)), 70);
    }

    final void a(BytesParser es1, int i1)
    {
        mc++;
        int j1 = es1.readUnsignedByte(-9268);
        if(j1 == 255)
            j1 = -1;
        type = es1.readUnsignedByte(-9268);
        if((0x80 & type) != 0)
        {
            type &= 0x7f;
            Hb = es1.readString((byte)116);
        }
        v = es1.readShort(13111);
        hc = es1.readShort2(48);
        Wc = es1.readShort2(i1 ^ 0x6a73);
        width = es1.readShort(13111);
        height = es1.readShort(i1 ^ 0x5922);
        f = es1.readByte(-20933);
        o = es1.readByte(i1 - 48090);
        hd = es1.readByte(-20933);
        ab = es1.readByte(i1 ^ 0xffffc42e);
        parentID = es1.readShort(13111);
        if(parentID != 65535)
            parentID = parentID + (interfaceID & 0xffff0000);
        else
            parentID = -1;
        int k1 = es1.readUnsignedByte(-9268);
        if(j1 >= 0)
            vc = (k1 & 2) != 0;
        hidden = (1 & k1) != 0;
        if(type == 0)
        {
            maxHScroll = es1.readShort(13111);
            maxVScroll = es1.readShort(13111);
            if(j1 < 0)
                vc = es1.readUnsignedByte(-9268) == 1;
        }
        if(type == 5)
        {
            textureID = es1.readInt(i1 - 27069);
            db = es1.readShort(13111);
            int l1 = es1.readUnsignedByte(-9268);
            jd = (1 & l1) != 0;
            xb = (2 & l1) != 0;
            mb = es1.readUnsignedByte(-9268);
            borderThickness = es1.readUnsignedByte(-9268);
            shadowColor = es1.readInt(88);
            flippedVertically = es1.readUnsignedByte(-9268) == 1;
            flippedHorizontally = es1.readUnsignedByte(-9268) == 1;
            textColor = es1.readInt(57);
        }
        if(type == 6)
        {
            modelType = 1;
            modelID = es1.readShort(13111);
            if(modelID == 65535)
                modelID = -1;
            int i2 = es1.readUnsignedByte(-9268);
            boolean flag = (i2 & 1) == 1;
            w = (i2 & 4) == 4;
            C = (i2 & 2) == 2;
            ad = (i2 & 8) == 8;
            if(!flag)
            {
                if(C)
                {
                    vb = es1.readShort2(71);
                    H = es1.readShort2(116);
                    O = es1.readShort2(i1 ^ 0x6a53);
                    modelRotationX = es1.readShort(i1 - 14046);
                    modelRotationY = es1.readShort(13111);
                    modelRotationZ = es1.readShort(13111);
                    modelZoom = es1.readShort2(117);
                }
            } else
            {
                vb = es1.readShort2(i1 ^ 0x6a52);
                H = es1.readShort2(i1 - 27127);
                modelRotationX = es1.readShort(i1 ^ 0x5922);
                modelRotationY = es1.readShort(13111);
                modelRotationZ = es1.readShort(13111);
                modelZoom = es1.readShort(13111);
            }
            V = es1.readShort(13111);
            if(V == 65535)
                V = -1;
            if(f != 0)
                n = es1.readShort(i1 ^ 0x5922);
            if(o != 0)
                dc = es1.readShort(13111);
        }
        if(type == 4)
        {
            Ab = es1.readShort(13111);
            if(Ab == 65535)
                Ab = -1;
            text = es1.readString((byte)125);
            Db = es1.readUnsignedByte(-9268);
            Fb = es1.readUnsignedByte(-9268);
            Z = es1.readUnsignedByte(-9268);
            isInventoryInterface = es1.readUnsignedByte(-9268) == 1;
            textColor = es1.readInt(79);
            mb = es1.readUnsignedByte(-9268);
            if(j1 >= 0)
                r = es1.readUnsignedByte(-9268);
        }
        if(type == 3)
        {
            textColor = es1.readInt(103);
            c = es1.readUnsignedByte(-9268) == 1;
            mb = es1.readUnsignedByte(-9268);
        }
        if(type == 9)
        {
            X = es1.readUnsignedByte(-9268);
            textColor = es1.readInt(i1 - 27041);
            oc = es1.readUnsignedByte(-9268) == 1;
        }
        int j2 = es1.readTribyte(i1 ^ 0xffff95ea);
        int k2 = es1.readUnsignedByte(i1 - 36425);
        if(k2 != 0)
        {
            ub = new byte[11];
            tc = new int[11];
            Nc = new byte[11];
            for(; k2 != 0; k2 = es1.readUnsignedByte(-9268))
            {
                int l2 = (k2 >> 4) - 1;
                k2 = k2 << 8 | es1.readUnsignedByte(i1 - 36425);
                k2 &= 0xfff;
                if(k2 == 4095)
                    k2 = -1;
                byte byte0 = es1.readByte(-20933);
                if(byte0 != 0)
                    Ic = true;
                byte byte1 = es1.readByte(-20933);
                tc[l2] = k2;
                ub[l2] = byte0;
                Nc[l2] = byte1;
            }

        }
        itemName = es1.readString((byte)127);
        int i3 = es1.readUnsignedByte(-9268);
        int j3 = 0xf & i3;
        int k3 = i3 >> 4;
        if(j3 > 0)
        {
            itemActions = new String[j3];
            for(int l3 = 0; j3 > l3; l3++)
                itemActions[l3] = es1.readString((byte)126);

        }
        if(k3 > 0)
        {
            int i4 = es1.readUnsignedByte(-9268);
            kb = new int[i4 + 1];
            for(int l4 = 0; kb.length > l4; l4++)
                kb[l4] = -1;

            kb[i4] = es1.readShort(13111);
        }
        if(k3 > 1)
        {
            int j4 = es1.readUnsignedByte(-9268);
            kb[j4] = es1.readShort(13111);
        }
        bd = es1.readString((byte)123);
        if(bd.equals(""))
            bd = null;
        x = es1.readUnsignedByte(-9268);
        lb = es1.readUnsignedByte(i1 ^ 0xffffb1d9);
        od = es1.readUnsignedByte(i1 ^ 0xffffb1d9);
        G = es1.readString((byte)118);
        int k4 = -1;
        if(mv.a(j2, (byte)109) != 0)
        {
            k4 = es1.readShort(13111);
            if(k4 == 65535)
                k4 = -1;
            tb = es1.readShort(13111);
            if(tb == 65535)
                tb = -1;
            cc = es1.readShort(13111);
            if(cc == 65535)
                cc = -1;
        }
        if(j1 >= 0)
        {
            Mc = es1.readShort(13111);
            if(Mc == 65535)
                Mc = -1;
        }
        qd = new nm(j2, k4);
        if(j1 >= 0)
        {
            int i5 = es1.readUnsignedByte(i1 - 36425);
            for(int j5 = 0; i5 > j5; j5++)
            {
                int k5 = es1.readTribyte(-1);
                int i6 = es1.readInt(97);
                qb.a(new GameInPacketHandler(i6), (byte)-77, k5);
            }

            int l5 = es1.readUnsignedByte(-9268);
            for(int j6 = 0; l5 > j6; j6++)
            {
                int k6 = es1.readTribyte(-1);
                String s1 = es1.readString2(-1);
                qb.a(new aa(s1), (byte)-100, k6);
            }

        }
        Tb = a(false, es1);
        e = a(false, es1);
        Bb = a(false, es1);
        E = a(false, es1);
        jb = a(false, es1);
        Zc = a(false, es1);
        Cc = a(false, es1);
        ec = a(false, es1);
        Q = a(false, es1);
        nd = a(false, es1);
        if(j1 >= 0)
            zb = a(false, es1);
        wb = a(false, es1);
        Pb = a(false, es1);
        Pc = a(false, es1);
        cb = a(false, es1);
        if(i1 != 27157)
        {
            return;
        } else
        {
            Sb = a(false, es1);
            L = a(false, es1);
            gd = a(false, es1);
            T = a(false, es1);
            k = a(false, es1);
            S = a(false, es1);
            q = a(es1, (byte)57);
            P = a(es1, (byte)51);
            qc = a(es1, (byte)-75);
            lc = a(es1, (byte)116);
            pb = a(es1, (byte)71);
            return;
        }
    }

    final void a(byte byte0, da da1, Class_q class_q, Class_r class_r, int i1)
    {
        Eb++;
        da1.a(class_q);
        hi ahi[] = da1.c();
        if(byte0 != 55)
            b(null, -7);
        qg aqg[] = da1.f();
        if((Qc == null || Qc.k) && (ahi != null || aqg != null))
            Qc = tq.a(i1, false);
        if(Qc != null)
            Qc.a(class_r, i1, ahi, aqg, false);
    }

    final tw a(hu hu1, nk nk, byte byte0)
    {
        Lb++;
        if(~yc == 0)
            return null;
        long l1 = ((long)Tc & 65535L) << 16 | ((65535L & (long)D) << 32 | (65535L & (long)y) << 48) | (long)yc & 65535L;
        if(byte0 < 57)
            H = -69;
        tw tw1 = (tw)up.K.get(l1, (byte)100);
        if(tw1 == null)
        {
            tw1 = hu1.a(nk, y, D, Tc, -29532, yc);
            up.K.put(l1, tw1, 1);
        }
        return tw1;
    }

    private final int[] a(BytesParser es1, byte byte0)
    {
        W++;
        int i1 = es1.readUnsignedByte(-9268);
        if(i1 == 0)
            return null;
        int ai[] = new int[i1];
        int j1 = 0;
        int k1 = 111 % ((-13 - byte0) / 40);
        for(; i1 > j1; j1++)
            ai[j1] = es1.readInt(82);

        return ai;
    }

    final String a(String s1, int i1, int j1)
    {
        fc++;
        if(j1 != 4095)
            return null;
        if(qb == null)
            return s1;
        aa aa1 = (aa)qb.a(-32748, i1);
        if(aa1 == null)
            return s1;
        else
            return aa1.m;
    }

    public static void b(int i1)
    {
        password = null;
        Yc = null;
        if(i1 != -1)
        {
            return;
        } else
        {
            grandExchangeItems = null;
            eb = null;
            fb = null;
            return;
        }
    }
    

    final f a(Class_r class_r, int i1)
    {
        try
        {
            long l1;
            aga aga1;
label0:
            {
                Nb++;
                fo.r = false;
                if(i1 >= -33)
                    J = null;
                l1 = ((long)shadowColor << 0xd3bbbee8) + (((flippedVertically ? 1L : 0L) << 0xd5bcd26) + (long)textureID + (((xb ? 1L : 0L) << 0x67164023) + ((long)borderThickness << 0x796ccba4) + ((flippedHorizontally ? 1L : 0L) << 0x6c79de67)));
                f f1 = (f)sr.U.get(l1, (byte)100);
                if(f1 != null)
                    return f1;
                aga1 = aga.a(dga.G, textureID, 0);
                if(aga1 == null)
                {
                    fo.r = true;
                    return null;
                }
                if(flippedVertically)
                    aga1.g();
                if(flippedHorizontally)
                    aga1.a();
                if(borderThickness <= 0)
                {
                    if(shadowColor == 0)
                        break label0;
                    aga1.b(1);
                    if(!client.sb)
                        break label0;
                }
                aga1.b(borderThickness);
            }
            if(~borderThickness <= -2)
                aga1.a(1);
            if(~borderThickness <= -3)
                aga1.a(0xffffff);
            if(~shadowColor != -1)
                aga1.c(shadowColor | 0xff000000);
            f f2 = class_r.a(aga1, true);
            sr.U.put((byte)-124, 4 * (f2.E() * f2.u()), l1, f2);
            return f2;
        }
        catch(RuntimeException runtimeexception)
        {
            //throw nc.nullLoader(runtimeexception, "kp.N(" + (class_r == null ? "null" : "{...}") + ',' + i1 + ')');
        	runtimeexception.printStackTrace();
        	return null;
        }
    }

    final void a(int i1, byte byte0)
    {
        d++;
        if(qb != null)
        {
            Node class_d = qb.a(-32748, i1);
            if(class_d != null)
                class_d.unlink(-38);
        }
        if(byte0 != -106)
            mb = -58;
    }

    static final void c(int i1)
    {
        Sc++;
        Node.b = new String[500];
        uj.L = Class_nd.o.n + Class_nd.o.b + 2;
        el.e = dca.R.n + dca.R.b + 2;
        for(int j1 = 0; Node.b.length > j1; j1++)
            Node.b[j1] = "";

        int k1 = 5 / ((-8 - i1) / 57);
        ia.a(4, GameText.j.getString((byte)-105, cba.languageID));
    }

    private final Object[] a(boolean flag, BytesParser es1)
    {
        bb++;
        int i1 = es1.readUnsignedByte(-9268);
        if(i1 == 0)
            return null;
        Object aobj[] = new Object[i1];
        if(flag)
            a(41, (byte)20);
        for(int j1 = 0; j1 < i1; j1++)
        {
            int k1 = es1.readUnsignedByte(-9268);
            if(k1 != 0)
            {
                if(k1 == 1)
                    aobj[j1] = es1.readString((byte)119);
            } else
            {
                aobj[j1] = new Integer(es1.readInt(94));
            }
        }

        Kb = true;
        return aobj;
    }

    final int b(int i1, int j1, int k1)
    {
        ac++;
        if(qb == null)
            return j1;
        int l1 = -35 % ((i1 - 2) / 52);
        GameInPacketHandler hda1 = (GameInPacketHandler)qb.a(-32748, k1);
        if(hda1 == null)
            return j1;
        else
            return hda1.k;
    }

    final ua a(byte byte0, Class_r class_r)
    {
        gb++;
        ua ua1 = (ua)up.D.get(interfaceID, (byte)100);
        if(ua1 != null)
            return ua1;
        aga aga1 = aga.a(dga.G, textureID, 0);
        if(aga1 == null)
            return null;
        int i1 = aga1.e + (aga1.b + aga1.a);
        int j1 = aga1.d + (aga1.g + aga1.h);
        pc = new int[j1];
        Jc = new int[j1];
        for(int k1 = 0; aga1.d > k1; k1++)
        {
            int l1 = 0;
            for(int j2 = 0; j2 < aga1.b; j2++)
            {
                if(aga1.c[j2 + aga1.b * k1] == 0)
                    continue;
                l1 = j2;
                break;
            }

            int i2 = i1;
            for(int k2 = l1; k2 < aga1.b; k2++)
            {
                if(aga1.c[aga1.b * k1 + k2] != 0)
                    continue;
                i2 = k2;
                break;
            }

            pc[aga1.g + k1] = aga1.e + l1;
            Jc[k1 + aga1.g] = i2 - l1;
        }

        ua1 = class_r.a(i1, j1, pc, Jc);
        up.D.put(interfaceID, ua1, 1);
        if(byte0 != 125)
            return null;
        else
            return ua1;
    }

    final la b(Class_r class_r, int i1)
    {
        Ob++;
        la la = ao.a(false, Ab, class_r, 0);
        if(i1 != -7230)
        {
            return null;
        } else
        {
            fo.r = la == null;
            return la;
        }
    }

    public Interface()
    {
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
    static GameInPacket fb = new GameInPacket(22, 8);
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
