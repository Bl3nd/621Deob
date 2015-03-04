/* kn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class PlayerDef {

    static int a;
    static int b;
    private int c;
    int d = -1;
    static int e;
    static int f;
    static int g;
    static int getGameStatus;
    static GameOutPacket outgoingPacket29 = new GameOutPacket(29, 7);
    private int[] j;
    int[] k;
    static int l;
    private long m;
    private int[][] n;
    static int o;
    static int p;
    boolean isMale;
    static int r;
    static int s;
    private long t;

    public final void a(int[] buf, boolean isMale, int i, int j, byte b, int[] ints) {
        if (c != i) {
            n = null;
            c = i;
        }
        this.j = buf;
        this.k = ints;
        this.isMale = isMale;
        this.d = j;
        a++;
        a((byte) -122);
        if (b != 23) {
            this.k = null;
        }
    }

    private void a(byte b) {
        l++;
        m = -1L;
        long[] longs = ml.a;
        m = longs[(int) (((long) (c >> 8) ^ m) & 0xffL)] ^ m >>> 8;
        m = m >>> 8 ^ longs[(int) (((long) c ^ m) & 0xffL)];
        for (int index = 0; index < 12; index++) {
            m = longs[(int) (0xffL & ((long) (j[index] >> 24) ^ m))] ^ m >>> 8;
            m = m >>> 8 ^ longs[(int) (0xffL & (m ^ (long) (j[index] >> 16)))];
            m = longs[(int) (((long) (j[index] >> 8) ^ m) & 0xffL)] ^ m >>> 8;
            m = m >>> 8 ^ longs[(int) (0xffL & ((long) j[index] ^ m))];
        }
        if (b <= -93) {
            for (int index = 0; index < 5; index++) {
                m = m >>> 8 ^ longs[(int) (((long) this.k[index] ^ m) & 0xffL)];
            }
            m = m >>> 8 ^ longs[(int) (0xffL & (m ^ (long) (this.isMale ? 1 : 0)))];
        }
    }

    public final void a(int i, int index, int j) {
        this.k[index] = i;
        r++;
        a((byte) -108);
        if (j != 31622) {
            a(29, null, -67, -76, 21, (byte) 126, null, 6, null, -78, 111, null);
        }
    }

    public static void nullLoader() {
        PlayerDef.outgoingPacket29 = null;
    }

    public static wl[] getGameStatus(int i) {
        getGameStatus++;
        if (i != 20565) {
            return null;
        }
        return new wl[]{ft.LIVE, GameOutPacket.RC, wd.WIP};
    }

    public final da a(int i, hl hl, int j, int k, int i1, byte b, dr dr, int j1, Class_r class_r, int k1, int mask_,
               PlayerUpdateLocation playerUpdateLocation) {
        e++;
        int mask = mask_;
        if (dr != null) {
            boolean bool = false;
            boolean bool1 = false;
            boolean bool2 = false;
            boolean bool3 = false;
            int k2 = -1;
            int i3 = -1;
            k2 = dr.p[k1];
            mask |= 0x20;
            int j3 = k2 >>> 16;
            k2 &= 0xffff;
            wa wa = hl.b(j3, -108);
            if (wa != null) {
                bool1 |= wa.a(k2, 0);
                bool |= wa.a(k2, (byte) -57);
                bool3 |= wa.a((byte) -101, k2);
                bool2 |= dr.n;
            }
            if ((dr.z || vm.isTweening) && k != -1 && k < dr.p.length) {
                i3 = dr.p[k];
                int k3 = i3 >>> 16;
                i3 &= 0xffff;
                wa wa1;
                if (k3 != j3) {
                    wa1 = hl.b(i3 >>> 16, -126);
                } else {
                    wa1 = wa;
                }
                if (wa1 != null) {
                    bool1 |= wa1.a(i3, 0);
                    bool |= wa1.a(i3, (byte) -99);
                    bool3 |= wa1.a((byte) -101, i3);
                }
            }
            if (bool1) {
                mask |= 0x80;
            }
            if (bool) {
                mask |= 0x100;
            }
            if (bool2) {
                mask |= 0x200;
            }
            if (bool3) {
                mask |= 0x400;
            }
        }
        long id = (long) (i1 << 16) | (long) j1 << 32 | (long) i;
        da da;
        synchronized (Class_ad.k) {
            da = (da) Class_ad.k.get(id, (byte) 100);
        }
        if (da == null || class_r.b(da.PA(), mask) != 0) {
            if (da != null) {
                mask = class_r.a(mask, da.PA());
            }
            int mask_1 = mask;
            eg[] egs = new eg[3];
            int i2 = 0;
            if (!playerUpdateLocation.a((byte) 81, i).a((byte) -95) || !playerUpdateLocation.a((byte) 89, i1).a((byte) -69)
                    || !playerUpdateLocation.a((byte) 42, j1).a((byte) -111)) {
                return null;
            }
            eg eg = playerUpdateLocation.a((byte) 86, i).b(false);
            if (eg != null) {
                egs[i2++] = eg;
            }
            eg = playerUpdateLocation.a((byte) 94, i1).b(false);
            if (eg != null) {
                egs[i2++] = eg;
            }
            eg = playerUpdateLocation.a((byte) 47, j1).b(false);
            if (eg != null) {
                egs[i2++] = eg;
            }
            eg = new eg(egs, i2);
            mask_1 |= 0x4000;
            da = class_r.a(eg, mask_1, fba.O, 64, 768);
            for (int j2 = 0; j2 < 5; j2++) {
                for (int k2 = 0; k2 < ck.K.length; k2++) {
                    if (ck.K[k2][j2].length > this.k[j2]) {
                        da.d(lp.p[k2][j2], ck.K[k2][j2][this.k[j2]]);
                    }
                }
            }
            da.SA(mask);
            synchronized (Class_ad.k) {
                Class_ad.k.put(id, da, 1);
            }
        }
        if (dr == null) {
            return da;
        }
        da = da.a((byte) 4, mask, true);
        if (b != -42) {
            return null;
        }
        da = dr.a(k1, mask_, (byte) 93, j, k, da);
        return da;
    }

    public final da a(PlayerUpdateLocation updateLocation, hl hl, int mask_, ItemDefLoader itemDefLoader, dr dr, Class_lb class_lb, an[] ans, haa haa,
                      int j, int k, dr dr1, int i1, int j1, int k1, wca wca, Class_r class_r, int i2, boolean bool, byte b) {
        PlayerDef.b++;
        if (this.d != -1) {
            return class_lb.getNPCDef(this.d, (byte) -103).a(i1, i2, j1, wca, k, j, dr1, b + 13645, k1, dr, hl, mask_, ans, class_r, haa);
        }
        int mask = mask_;
        long id = m;
        int[] buf = this.j;
        if (dr != null && (dr.h >= 0 || dr.D >= 0)) {
            buf = new int[12];
            for (int index = 0; index < 12; index++) {
                buf[index] = this.j[index];
            }
            if (dr.h >= 0) {
                if (dr.h == 65535) {
                    id ^= ~0xffffffffL;
                    buf[5] = 0;
                } else {
                    buf[5] = hba.bitwiseArg1ORArg2(1073741824, dr.h);
                    id ^= (long) buf[5] << 32;
                }
            }
            if (dr.D >= 0) {
                if (dr.D == 65535) {
                    buf[3] = 0;
                    id ^= 0xffffffffL;
                } else {
                    buf[3] = hba.bitwiseArg1ORArg2(1073741824, dr.D);
                    id ^= (long) buf[3];
                }
            }
        }
        boolean bool1 = false;
        boolean bool2 = false;
        boolean bool3 = false;
        boolean bool4 = dr != null || dr1 != null;
        int k2 = ans != null ? ans.length : 0;
        for (int index = 0; k2 > index; index++) {
            ui.g[index] = null;
            if (ans[index] != null) {
                dr dr2 = hl.c(b ^ 0x3d, ans[index].c);
                if (dr2.p != null) {
                    bool4 = true;
                    as.drs[index] = dr2;
                    int i3 = ans[index].d;
                    int j3 = ans[index].g;
                    int k3 = dr2.p[i3];
                    ui.g[index] = hl.b(k3 >>> 16, 60);
                    k3 &= 0xffff;
                    qg.a[index] = k3;
                    if (ui.g[index] != null) {
                        bool2 |= ui.g[index].a(k3, 0);
                        bool1 |= ui.g[index].a(k3, (byte) -105);
                        bool3 |= ui.g[index].a((byte) -101, k3);
                    }
                    if ((dr2.z || vm.isTweening) && (~j3) != 0 && j3 < dr2.p.length) {
                        hv.r[index] = dr2.B[i3];
                        ud.s[index] = ans[index].b;
                        int i4 = dr2.p[j3];
                        at.was[index] = hl.b(i4 >>> 16, 101);
                        i4 &= 0xffff;
                        th.m[index] = i4;
                        if (at.was[index] != null) {
                            bool2 |= at.was[index].a(i4, 0);
                            bool1 |= at.was[index].a(i4, (byte) -100);
                            bool3 |= at.was[index].a((byte) -101, i4);
                        }
                    } else {
                        hv.r[index] = 0;
                        ud.s[index] = 0;
                        at.was[index] = null;
                        th.m[index] = -1;
                    }
                }
            }
        }
        int i3 = -1;
        int j3 = -1;
        int k3 = 0;
        wa wa = null;
        wa wa1 = null;
        int i4 = -1;
        int j4 = -1;
        int k4 = 0;
        wa wa2 = null;
        if (b != 125) {
            return null;
        }
        wa wa3 = null;
        if (bool4) {
            if (dr != null) {
                i3 = dr.p[i1];
                int i5 = i3 >>> 16;
                wa = hl.b(i5, b - 21);
                i3 &= 0xffff;
                if (wa != null) {
                    bool2 |= wa.a(i3, 0);
                    bool1 |= wa.a(i3, (byte) -35);
                    bool3 |= wa.a((byte) -101, i3);
                }
                if ((dr.z || vm.isTweening) && (~j1) != 0 && j1 < dr.p.length) {
                    j3 = dr.p[j1];
                    k3 = dr.B[i1];
                    int j5 = j3 >>> 16;
                    j3 &= 0xffff;
                    wa1 = i5 != j5 ? hl.b(j5, -106) : wa;
                    if (wa1 != null) {
                        bool2 |= wa1.a(j3, 0);
                        bool1 |= wa1.a(j3, (byte) -82);
                        bool3 |= wa1.a((byte) -101, j3);
                    }
                }
            }
            mask |= 0x20;
            if (dr1 != null) {
                i4 = dr1.p[k1];
                int i5 = i4 >>> 16;
                wa2 = hl.b(i5, 63);
                i4 &= 0xffff;
                if (wa2 != null) {
                    bool2 |= wa2.a(i4, 0);
                    bool1 |= wa2.a(i4, (byte) -30);
                    bool3 |= wa2.a((byte) -101, i4);
                }
                if ((dr1.z || vm.isTweening) && k != -1 && k < dr1.p.length) {
                    j4 = dr1.p[k];
                    k4 = dr1.B[k1];
                    int j5 = j4 >>> 16;
                    wa3 = i5 != j5 ? hl.b(j5, -96) : wa2;
                    j4 &= 0xffff;
                    if (wa3 != null) {
                        bool2 |= wa3.a(j4, 0);
                        bool1 |= wa3.a(j4, (byte) -109);
                        bool3 |= wa3.a((byte) -101, j4);
                    }
                }
            }
            if (bool2) {
                mask |= 0x80;
            }
            if (bool1) {
                mask |= 0x100;
            }
            if (bool3) {
                mask |= 0x400;
            }
        }
        da da;
        synchronized (bd.j) {
            da = (da) bd.j.get(id, (byte) 100);
        }
        cg cg = null;
        if (c != -1) {
            cg = wca.a(c, (byte) 68);
        }
        if (da == null || class_r.b(da.PA(), mask) != 0 || cg != null && cg.y != null && n == null) {
            if (da != null) {
                mask = class_r.a(mask, da.PA());
            }
            int mask_1 = mask;
            boolean bool5 = false;
            for (int i5 = 0; i5 < 12; i5++) {
                int j5 = buf[i5];
                if ((j5 & 0x40000000) == 0) {
                    if ((j5 & ~0x7fffffff) != 0 && !updateLocation.a((byte) 52, j5 & 0x3fffffff).a(true)) {
                        bool5 = true;
                    }
                } else if (!itemDefLoader.d(12388, 0x3fffffff & j5).b((byte) 85, this.isMale)) {
                    bool5 = true;
                }
            }
            if (!bool5) {
                eg[] egs = new eg[12];
                for (int i5 = 0; i5 < 12; i5++) {
                    int j5 = buf[i5];
                    if ((j5 & 0x40000000) == 0) {
                        if ((~0x7fffffff & j5) != 0) {
                            eg var_eg = updateLocation.a((byte) 103, 0x3fffffff & j5).a(-86);
                            if (var_eg != null) {
                                egs[i5] = var_eg;
                            }
                        }
                    } else {
                        eg eg = itemDefLoader.d(12388, j5 & 0x3fffffff).a(this.isMale, -1);
                        if (eg != null) {
                            egs[i5] = eg;
                        }
                    }
                }
                if (cg != null && cg.y != null) {
                    for (int i5 = 0; i5 < cg.y.length; i5++) {
                        if (cg.y[i5] != null && egs[i5] != null) {
                            int j5 = cg.y[i5][0];
                            int k5 = cg.y[i5][1];
                            int i6 = cg.y[i5][2];
                            int j6 = cg.y[i5][3] << 3;
                            int k6 = cg.y[i5][4] << 3;
                            int i7 = cg.y[i5][5] << 3;
                            if (n == null) {
                                n = new int[cg.y.length][];
                            }
                            if (n[i5] == null) {
                                int[] buf1 = n[i5] = new int[15];
                                if (j6 == 0 && k6 == 0 && i7 == 0) {
                                    buf1[13] = -k5;
                                    buf1[0] = buf1[4] = buf1[8] = 32768;
                                    buf1[14] = -i6;
                                    buf1[12] = -j5;
                                } else {
                                    int j7 = GameInPacket.ints2[j6];
                                    int k7 = GameInPacket.ints1[j6];
                                    int i8 = GameInPacket.ints2[k6];
                                    int j8 = GameInPacket.ints1[k6];
                                    int k8 = GameInPacket.ints2[i7];
                                    int i9 = GameInPacket.ints1[i7];
                                    int j9 = k7 * k8 + 8192 >> 14;
                                    int k9 = k7 * i9 + 8192 >> 14;
                                    buf1[4] = k8 * j7 + 8192 >> 14;
                                    buf1[1] = i8 * -i9 + (j8 * j9 + 8192) >> 14;
                                    buf1[7] = -i9 * -j8 - (-(j9 * i8) - 8192) >> 14;
                                    buf1[6] = (k8 * -j8 + 8192 + k9 * i8) >> 14;
                                    buf1[8] = i8 * j7 + 8192 >> 14;
                                    buf1[2] = j7 * j8 + 8192 >> 14;
                                    buf1[5] = -k7;
                                    buf1[0] = k8 * i8 - (-(k9 * j8) - 8192) >> 14;
                                    buf1[3] = j7 * i9 + 8192 >> 14;
                                    buf1[13] = (-i6 * buf1[7] + buf1[1] * -j5 - (-(buf1[4] * -k5) - 8192)) >> 14;
                                    buf1[12] = (-i6 * buf1[6] + (buf1[3] * -k5 + (buf1[0] * -j5 + 8192))) >> 14;
                                    buf1[14] = (buf1[8] * -i6 + (-j5 * buf1[2] + buf1[5] * -k5) + 8192) >> 14;
                                }
                                buf1[11] = i6;
                                buf1[10] = k5;
                                buf1[9] = j5;
                            }
                            if (j6 != 0 || k6 != 0 || i7 != 0) {
                                egs[i5].b(j6, 19068, i7, k6);
                            }
                            if (j5 != 0 || k5 != 0 || i6 != 0) {
                                egs[i5].a(i6, (byte) 113, j5, k5);
                            }
                        }
                    }
                }
                mask_1 |= 0x4000;
                eg eg = new eg(egs, egs.length);
                da = class_r.a(eg, mask_1, fba.O, 64, 850);
                for (int i5 = 0; i5 < 5; i5++) {
                    for (int j5 = 0; ck.K.length > j5; j5++) {
                        if (this.k[i5] < ck.K[j5][i5].length) {
                            da.d(lp.p[j5][i5], ck.K[j5][i5][this.k[i5]]);
                        }
                    }
                }
                if (bool) {
                    da.SA(mask);
                    synchronized (bd.j) {
                        bd.j.put(id, da, 1);
                    }
                    t = id;
                }
            } else {
                if (t != -1L) {
                    synchronized (bd.j) {
                        da = (da) bd.j.get(t, (byte) 100);
                    }
                }
                if (da == null || class_r.b(da.PA(), mask) != 0 || cg != null && cg.y != null && n == null) {
                    return null;
                }
            }
        }
        da da1 = da.a((byte) 4, mask, true);
        if (!bool4) {
            return da1;
        }
        int i5 = 0;
        int j5 = 1;
        for (/**/; k2 > i5; i5++) {
            if (ui.g[i5] != null) {
                da1.a((byte) -121, at.was[i5], ud.s[i5] - 1, 0, qg.a[i5], n == null ? null : n[i5], j5, th.m[i5], false, hv.r[i5], ui.g[i5]);
            }
            j5 <<= 1;
        }
        if (wa != null && wa2 != null) {
            da1.a(wa1, i3, wa3, j - 1, j3, wa2, k4, dr.a, i2 - 1, k3, false, i4, wa, b ^ ~0x3a, j4);
        } else if (wa == null) {
            if (wa2 != null) {
                da1.a(false, (byte) -11, wa2, j4, i4, wa3, i2 - 1, 0, k4);
            }
        } else {
            da1.a(false, (byte) -11, wa, j3, i3, wa1, j - 1, 0, k3);
        }
        for (int index = 0; index < k2; index++) {
            ui.g[index] = null;
            at.was[index] = null;
            as.drs[index] = null;
        }
        return da1;
    }

    public final da a(int i, int mask_, haa haa, dr dr, int k, ItemDefLoader itemDefLoader, int i1, hl hl, int j1, Class_lb class_lb,
               PlayerUpdateLocation updateLocation, Class_r class_r) {
        if (i1 != 768) {
            a((byte) -68);
        }
        p++;
        if (this.d != -1) {
            return class_lb.getNPCDef(this.d, (byte) -125).a(haa, mask_, (byte) 71, dr, j1, hl, i, class_r, k);
        }
        int mask = mask_;
        if (dr != null) {
            boolean bool = false;
            boolean bool1 = false;
            boolean bool2 = false;
            boolean bool3 = false;
            int k1 = -1;
            int i2 = -1;
            k1 = dr.p[k];
            mask |= 0x20;
            int j2 = k1 >>> 16;
            k1 &= 0xffff;
            wa wa = hl.b(j2, i1 - 877);
            if (wa != null) {
                bool1 |= wa.a(k1, 0);
                bool |= wa.a(k1, (byte) -84);
                bool3 |= wa.a((byte) -101, k1);
                bool2 |= dr.n;
            }
            if ((dr.z || vm.isTweening) && (~j1) != 0 && dr.p.length > j1) {
                i2 = dr.p[j1];
                int k2 = i2 >>> 16;
                wa wa1 = j2 == k2 ? wa : hl.b(k2, -128);
                i2 &= 0xffff;
                if (wa1 != null) {
                    bool1 |= wa1.a(i2, i1 - 768);
                    bool |= wa1.a(i2, (byte) -90);
                    bool3 |= wa1.a((byte) -101, i2);
                }
            }
            if (bool1) {
                mask |= 0x80;
            }
            if (bool) {
                mask |= 0x100;
            }
            if (bool2) {
                mask |= 0x200;
            }
            if (bool3) {
                mask |= 0x400;
            }
        }
        da da;
        synchronized (Class_ad.k) {
            da = (da) Class_ad.k.get(m, (byte) 100);
        }
        if (da == null || class_r.b(da.PA(), mask) != 0) {
            if (da != null) {
                mask = class_r.a(mask, da.PA());
            }
            int mask_1 = mask;
            boolean bool = false;
            for (int k1 = 0; k1 < 12; k1++) {
                int i2 = this.j[k1];
                if ((0x40000000 & i2) != 0) {
                    if (!itemDefLoader.d(12388, 0x3fffffff & i2).a(this.isMale, (byte) -118)) {
                        bool = true;
                    }
                } else if ((i2 & ~0x7fffffff) != 0 && !updateLocation.a((byte) 28, 0x3fffffff & i2).a((byte) -125)) {
                    bool = true;
                }
            }
            if (bool) {
                return null;
            }
            eg[] egs = new eg[12];
            int k1 = 0;
            for (int i2 = 0; i2 < 12; i2++) {
                int j2 = this.j[i2];
                if ((j2 & 0x40000000) != 0) {
                    eg eg = itemDefLoader.d(12388, j2 & 0x3fffffff).a((byte) -84, this.isMale);
                    if (eg != null) {
                        egs[k1++] = eg;
                    }
                } else if ((j2 & ~0x7fffffff) != 0) {
                    eg eg = updateLocation.a((byte) 115, j2 & 0x3fffffff).b(false);
                    if (eg != null) {
                        egs[k1++] = eg;
                    }
                }
            }
            mask_1 |= 0x4000;
            eg eg = new eg(egs, k1);
            da = class_r.a(eg, mask_1, fba.O, 64, 768);
            for (int i2 = 0; i2 < 5; i2++) {
                for (int j2 = 0; ck.K.length > j2; j2++) {
                    if (ck.K[j2][i2].length > this.k[i2]) {
                        da.d(lp.p[j2][i2], ck.K[j2][i2][this.k[i2]]);
                    }
                }
            }
            da.SA(mask);
            synchronized (Class_ad.k) {
                Class_ad.k.put(m, da, 1);
            }
        }
        if (dr == null) {
            return da;
        }
        da da1 = da.a((byte) 4, mask, true);
        da1 = dr.a(k, mask_, (byte) 100, i, j1, da);
        return da1;
    }

    public final void a(int id, int index, ItemDefLoader itemDefLoader, boolean bool) {
        g++;
        if (!bool) {
            a(-37, -12, null, 63);
        }
        if (id == -1) {
            this.j[index] = 0;
        } else if (itemDefLoader.d(12388, id) != null) {
            this.j[index] = hba.bitwiseArg1ORArg2(id, 1073741824);
            a((byte) -118);
        }
    }

    public final void a(boolean isMale, int i) {
        o++;
        if (i != -23851) {
            c = 11;
        }
        this.isMale = isMale;
        a((byte) -123);
    }

    public final void a(int i, int j, PlayerUpdateLocation updateLocation, int k) {
        f++;
        int i1 = fi.b[i];
        if (updateLocation.a((byte) 105, j) != null) {
            this.j[i1] = hba.bitwiseArg1ORArg2(j, -2147483648);
            if (k < -11) {
                a((byte) -109);
            }
        }
    }

    public static int b(int i, int j, int k) {
        if (j > i) {
            int i1 = i;
            i = j;
            j = i1;
        }
        s++;
        int i1;
        for (/**/; j != 0; j = i1) {
            i1 = i % j;
            i = j;
        }
        return i;
    }

    public PlayerDef() {
    /* empty */
    }
}
