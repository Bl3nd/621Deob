/* qi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Player extends Entity {

    static int Qc;
    int Rc;
    private byte Sc;
    static int updateLocationCounter;
    static int Uc;
    boolean Vc = false;
    static int Wc;
    static GameOutPacket outgoingPacekt69 = new GameOutPacket(69, 7);
    int combatLevel;
    static int Zc;
    static int ad;
    static int getUserDisplayNameCounter;
    boolean cd;
    int orientation;
    int ed;
    int fd;
    private byte gd;
    String hd;
    static int id;
    int jd = -1;
    int kd;
    static int ld;
    static int md;
    static int sendIllegalStateExceptionCounter;
    static f od;
    static int pd;
    static int qd;
    int rd;
    boolean sd;
    static int td;
    int ud;
    int vd;
    static int wd;
    int xd;
    int yd;
    PlayerDef playerDef;
    static int Ad;
    static int Bd;
    static int Cd;
    private int Dd;
    static int Ed;
    static int Fd;
    int Gd;
    int Hd;
    String displayName;
    static int isPlayerDefinitionCounter;
    private byte Kd;
    boolean Ld;
    int Md;
    static GameInPacket incomingPacket78 = new GameInPacket(78, -1);
    int Od;
    static int Pd;
    static float[] Qd = new float[4];
    static GameInPacket incomingPacket70;
    static int Sd = 0;

    public final void b(boolean bool, Class_r class_r) {
        qd++;
        if (this.playerDef != null && (this.Hc || a(false, class_r, 0))) {
            Class_q class_q = class_r.p();
            if (!bool) {
                class_q.o(this.class_kd.getOrientation((byte) 67));
                class_q.U(this.locX, this.j - 5, this.locY);
                this.a(class_q, this.Hc, class_r, this.das, (byte) -52);
                ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
            }
        }
    }

    public final boolean h(byte b) {
        Qc++;
        if (b > -26) {
            return true;
        }
        return false;
    }

    private void a(int i, da da, int j, int k, Class_q class_q, int i1, int j1, int k1, Class_r class_r) {
        Wc++;
        int i2 = i * i + j1 * j1;
        if (i2 >= 262144 && k >= i2) {
            int j2 = ((int) (2607.5945876176133 * Math.atan2((double) i, (double) j1)) & 0x3fff);
            da da_ = ss.a(k1, this.ec, class_r, this.R, j2, this.pb, (byte) -128);
            if (da_ != null) {
                class_r.ZA(false);
                da_.a(class_q, null, j, 0);
                class_r.ZA(true);
            }
        }
    }

    private boolean a(boolean bool, Class_r class_r, int mask) {
        md++;
        int mask_ = mask;
        cg cg = this.k(32195);
        dr dr = (this.yb != -1 && this.oc == 0 ? Class_ef.J.c(64, this.yb) : null);
        dr dr_ = (this.Bc != -1 && !this.Ld && (!this.V || dr == null) ? Class_ef.J.c(64, this.Bc) : null);
        int k = cg.i;
        int i1 = cg.W;
        if (k != 0 || i1 != 0 || cg.O != 0 || cg.C != 0) {
            mask |= 0x7;
        }
        boolean bool1 = (this.Xb != 0 && pm.currentTimedTicks >= this.zc && this.Cb > pm.currentTimedTicks);
        if (bool1) {
            mask |= 0x80000;
        }
        da da = (((Entity) this).das[0] = this.playerDef.a(Class_ae.n, Class_ef.J, mask, laa.itemDefLoader, dr, jm.p,
                this.ans, cp.e, this.ic, this.hc, dr_, this.yc, this.W, this.Ib, hs.f, class_r, this.rc, true, (byte) 125));
        int j1 = rn.a((byte) 24);
        if (qm.heapSize < 96 && j1 > 50) {
            he.c((byte) 61);
        }
        if (hs.modeWhere == oba.K || j1 >= 50) {
            if (oba.K != hs.modeWhere) {
                Class_is.n = 0;
                hk.R = new byte[50][];
            }
        } else {
            int k1;
            for (k1 = -j1 + 50; k1 > Class_is.n; Class_is.n++) {
                hk.R[Class_is.n] = new byte[102400];
            }
            while (Class_is.n > k1) {
                Class_is.n--;
                hk.R[Class_is.n] = null;
            }
        }
        if (da == null) {
            return false;
        }
        this.Ac = da.J();
        this.cc = da.RA();
        this.a((byte) -34, da);
        if (bool) {
            return true;
        }
        int orientation = this.class_kd.getOrientation((byte) 67);
        if (k != 0 || i1 != 0) {
            this.a(-2912, orientation, k, cg.D, i1, cg.U);
            if (this.ec != 0) {
                da.MA(this.ec);
            }
            if (this.R != 0) {
                da.W(this.R);
            }
            if (this.pb != 0) {
                da.oa(0, this.pb, 0);
            }
        } else {
            this.a(-2912, orientation, i(-1) << 9, 0, i(-1) << 9, 0);
        }
        if (bool1) {
            da.a(this.vb, this.Mb, this.Tb, this.Xb & 0xff);
        }
        if (!this.Ld && this.graphicsId_ != -1 && this.kc != -1) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId_);
            boolean bool2 = iv.r == 3 && (k != 0 || i1 != 0);
            int mask_1 = mask_;
            if (!bool2) {
                if (this.rotation_ != 0) {
                    mask_1 |= 0x5;
                }
                if (this.Pb != 0) {
                    mask_1 |= 0x2;
                }
            } else {
                mask_1 |= 0x7;
            }
            da da_ = (((Entity) this).das[1] = iv.a(this.Ob, class_r, 71, Class_ef.J, this.kc, mask_1, this.qb));
            if (da_ != null) {
                if (this.Pb != 0) {
                    da_.oa(0, -this.Pb << 2, 0);
                }
                if (this.rotation_ != 0) {
                    da_.M(2048 * this.rotation_);
                }
                if (bool2) {
                    if (this.ec != 0) {
                        da_.MA(this.ec);
                    }
                    if (this.R != 0) {
                        da_.W(this.R);
                    }
                    if (this.pb != 0) {
                        da_.oa(0, this.pb, 0);
                    }
                }
            }
        } else {
            ((Entity) this).das[1] = null;
        }
        if (!this.Ld && this.graphicsId != -1 && (~this.mb) != 0) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId);
            boolean bool2 = iv.r == 3 && (k != 0 || i1 != 0);
            int mask_1 = mask_;
            if (bool2) {
                mask_1 |= 0x7;
            } else {
                if (this.rotation != 0) {
                    mask_1 |= 0x5;
                }
                if (this.delayAndHeight != 0) {
                    mask_1 |= 0x2;
                }
            }
            da da_ = (((Entity) this).das[2] = iv.a(Class_ef.J, 83, class_r, this.P, mask_1, this.mb, this.pc));
            if (da_ != null) {
                if (this.delayAndHeight != 0) {
                    da_.oa(0, -this.delayAndHeight << 2, 0);
                }
                if (this.rotation != 0) {
                    da_.M(2048 * this.rotation);
                }
                if (bool2) {
                    if (this.ec != 0) {
                        da_.MA(this.ec);
                    }
                    if (this.R != 0) {
                        da_.W(this.R);
                    }
                    if (this.pb != 0) {
                        da_.oa(0, this.pb, 0);
                    }
                }
            }
        } else {
            ((Entity) this).das[2] = null;
        }
        return true;
    }

    public final void updateLocation(byte b, int y, int i, int x) {
        if ((~this.yb) != 0 && Class_ef.J.c(64, this.yb).k == 1) {
            this.yb = -1;
            this.Ab = null;
        }
        if (i != -1157357879) {
            b(false, null);
        }
        updateLocationCounter++;
        if (this.graphicsId_ != -1) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId_);
            if (iv.d && iv.w != -1 && Class_ef.J.c(64, ((iv) iv).w).k == 1) {
                this.graphicsId_ = -1;
            }
        }
        if ((~this.graphicsId) != 0) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId);
            if (iv.d && iv.w != -1 && Class_ef.J.c(64, iv.w).k == 1) {
                this.graphicsId = -1;
            }
        }
        this.orientation = -1;
        if (x >= 0 && Class_hc.e > x && y >= 0 && bw.v > y) {
            if (this.regionLocalX[0] >= 0 && Class_hc.e > this.regionLocalX[0] && this.regionLocalY[0] >= 0 && bw.v > this.regionLocalY[0]) {
                if (b == 2) {
                    nu.a(y, -79, this, x, (byte) 2);
                }
                a(x, b, y, true);
            } else {
                updateLocation(-3377, x, y);
            }
        } else {
            updateLocation(i + 1157354502, x, y);
        }
    }

    public final String getUserDisplayName(byte b, boolean bool) {
        getUserDisplayNameCounter++;
        if (b >= -119) {
            return null;
        }
        String string = "";
        if (kr.e != null) {
            string += kr.e[Sc];
        }
        int[] buf;
        if (Kd != 1 || vn.P == null) {
            buf = il.m;
        } else {
            buf = vn.P;
        }
        if (buf != null && buf[Sc] != -1) {
            ss ss = tv.e.a(buf[Sc], -8727);
            if (ss.b == 's') {
                string += ss.d(-24908, 0xff & gd);
            } else {
                cea.a("gdn1", -2, new Throwable());
                buf[Sc] = -1;
            }
        }
        if (!bool) {
            string += this.displayName;
        } else {
            string += this.hd;
        }
        if (na.g != null) {
            string += na.g[Sc];
        }
        return string;
    }

    public final boolean isPlayerDefinition(int i) {
        isPlayerDefinitionCounter++;
        if (this.playerDef == null) {
            return false;
        }
        return true;
    }

    public final void sendIllegalStateException(int i) {
        sendIllegalStateExceptionCounter++;
        if (i != -1) {
            this.xd = 101;
        }
        throw new IllegalStateException();
    }

    public static void a(byte b, int x, int i, int j, int width, int k, int i1, int y, int j1, int height) {
        Ed++;
        if (gf.a((byte) 92, i1) && b <= -94) {
            if (mv.b[i1] == null) {
                client.a(aa.o[i1], -1, j, k, width, height, x, y, i, j1);
            } else {
                client.a(mv.b[i1], -1, j, k, width, height, x, y, i, j1);
            }
        }
    }

    public final og a(boolean bool, Class_r class_r) {
        Fd++;
        if (this.playerDef == null || !a(false, class_r, 2048)) {
            return null;
        }
        Class_q class_q = class_r.p();
        int orientation = this.class_kd.getOrientation((byte) 67);
        class_q.o(orientation);
        vf vf = (ol.p[this.height][this.locX >> Class_fb.a][this.locY >> Class_fb.a]);
        if (vf == null || vf.m == null) {
            this.db -= (float) this.db / 10.0F;
        } else {
            int i = this.db - vf.m.x;
            this.db -= (float) i / 10.0F;
        }
        class_q.U(this.locX, this.j - 20 - this.db, this.locY);
        this.Oc = bool;
        if (cs.g.t) {
            cg cg = this.k(32195);
            if (cg.k && (this.playerDef.d == -1 || jm.p.getNPCDef(this.playerDef.d, (byte) -107).f)) {
                dr dr = (this.yb == -1 || this.oc != 0 ? null : Class_ef.J.c(64, this.yb));
                dr dr1 = (((~this.Bc) == 0 || this.Ld || this.V && dr != null) ? null : Class_ef.J.c(64, this.Bc));
                da da = cg.a(240, orientation, this.das[0], 160, 0, 1, this.R, class_r, 0, this.ec, this.pb, false, (dr1 == null ? this.yc : this.Ib),
                        dr1 == null ? dr : dr1);
                if (da != null) {
                    this.Oc = true;
                    class_r.ZA(false);
                    if (!ml.k) {
                        da.a(class_q, null, 0);
                    } else {
                        da.a(class_q, null, Class_pd.r, 0);
                    }
                    class_r.ZA(true);
                }
            }
        }
        if (up.thisPlayer == this) {
            class_q.NA(this.locX, this.j, this.locY);
            for (int i = Class_fb.j.length - 1; i >= 0; i--) {
                on on = Class_fb.j[i];
                if (on != null && (~on.h) != 0) {
                    if (on.a == 1) {
                        NPCNode npcNode = (NPCNode) uo.a.a(-32748, (long) on.e);
                        if (npcNode != null) {
                            NPC npc = npcNode.npc;
                            int x = npc.locX - up.thisPlayer.locX;
                            int y = npc.locY - up.thisPlayer.locY;
                            if (ml.k) {
                                a(x, this.das[0], Class_pd.r, 92160000, class_q, -20, y, on.h, class_r);
                            } else {
                                a(y, on.h, this.das[0], 92160000, x, -1, class_r, class_q);
                            }
                        }
                    }
                    if (on.a == 2) {
                        int x = on.n - up.thisPlayer.locX + 256;
                        int y = on.i - up.thisPlayer.locY + 256;
                        int j = on.f << 9;
                        j *= j;
                        if (!ml.k) {
                            a(y, on.h, this.das[0], j, x, -1, class_r, class_q);
                        } else {
                            a(x, this.das[0], Class_pd.r, j, class_q, -123, y, on.h, class_r);
                        }
                    }
                    if (on.a == 10 && on.e >= 0 && Class_fc.playersInScreen.length > on.e) {
                        Player player = Class_fc.playersInScreen[on.e];
                        if (player != null) {
                            int x = player.locX - up.thisPlayer.locX;
                            int y = player.locY - up.thisPlayer.locY;
                            if (!ml.k) {
                                a(y, on.h, this.das[0], 92160000, x, -1, class_r, class_q);
                            } else {
                                a(x, this.das[0], Class_pd.r, 92160000, class_q, -122, y, on.h, class_r);
                            }
                        }
                    }
                }
            }
            class_q.o(orientation);
            class_q.U(this.locX, this.j, this.locY);
        }
        class_q.o(orientation);
        class_q.U(this.locX, this.j - 5 - this.db, this.locY);
        og og = lf.a(!bool, this.das.length);
        this.a(class_q, false, class_r, this.das, (byte) -62);
        if (!ml.k) {
            for (int index = 0; index < this.das.length; index++) {
                if (this.das[index] != null) {
                    this.das[index].a(class_q, og.g[index], up.thisPlayer == this ? 1 : 0);
                }
            }
        } else {
            for (int index = 0; index < this.das.length; index++) {
                if (this.das[index] != null) {
                    this.das[index].a(class_q, og.g[index], Class_pd.r, this == up.thisPlayer ? 1 : 0);
                }
            }
        }
        if (this.tq_ != null) {
            ir ir = this.tq_.g();
            if (ml.k) {
                class_r.a(ir, Class_pd.r);
            } else {
                class_r.a(ir);
            }
        }
        for (int index = 0; this.das.length > index; index++) {
            if (this.das[index] != null) {
                this.Oc |= this.das[index].LA();
            }
        }
        ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
        this.Wb = sh.j;
        return og;
    }

    public final sd a(Class_r class_r, int i) {
        if (i != -1660704056) {
            this.Hd = -110;
        }
        wd++;
        return null;
    }

    public final void a(int x, byte moveTypes, int y, boolean bool) {
        ad++;
        if (this.Nc < 9) {
            this.Nc++;
        }
        for (int index = this.Nc; index > 0; index--) {
            ((Entity) this).regionLocalX[index] = this.regionLocalX[index - 1];
            ((Entity) this).regionLocalY[index] = this.regionLocalY[index - 1];
            ((Entity) this).moveTypes[index] = this.moveTypes[index - 1];
        }
        ((Entity) this).regionLocalX[0] = x;
        ((Entity) this).moveTypes[0] = moveTypes;
        ((Entity) this).regionLocalY[0] = y;
        if (!bool) {
            Dd = -29;
        }
    }

    public final String a(boolean bool, byte b) {
        if (b != -7) {
            getUserDisplayName((byte) -21, true);
        }
        pd++;
        if (bool) {
            return this.hd;
        }
        return this.displayName;
    }

    private void a(int y, int i, da da, int j, int x, int k, Class_r class_r, Class_q class_q) {
        if (k != -1) {
            this.ud = -21;
        }
        ld++;
        int i1 = y * y + x * x;
        if (i1 >= 262144 && j >= i1) {
            int j1 = 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) x, (double) y));
            da da1 = ss.a(i, this.ec, class_r, this.R, j1, this.pb, (byte) -123);
            if (da1 != null) {
                class_r.ZA(false);
                da1.a(class_q, null, 0);
                class_r.ZA(true);
            }
        }
    }

    public final int a(byte b) {
        Bd++;
        if (b != -7) {
            a(-36, 64, null, 24, -56, 76, null, null);
        }
        return -1;
    }

    public final void playerAppearanceUpdate(int dummy, BytesParser stream) {
        Uc++;
        stream.pos = 0;
        int i = stream.readUnsignedByte(-9268);
        Kd = (byte) (0x1 & i);
        boolean bool = this.sd;
        this.sd = (0x2 & i) != 0;
        boolean bool1 = (i & 0x4) != 0;
        int j = super.i(-1);
        this.a((0x7 & i >> 3) + 1, 0);
        Sc = (byte) (0x3 & i >> 6);
        this.locX += i(-1) - j << 8;
        this.locY += i(dummy) - j << 8;
        gd = stream.readByte(dummy - 20932);
        this.Hd = stream.readByte(-20933);
        this.vd = stream.readByte(-20933);
        this.Gd = 0;
        int k = -1;
        int[] buf = new int[12];
        for (int index = 0; index < 12; index++) {
            int i1 = stream.readUnsignedByte(-9268);
            if (i1 == 0) {
                buf[index] = 0;
            } else {
                int j1 = stream.readUnsignedByte(dummy - 9267);
                int k1 = (i1 << 8) + j1;
                if (index == 0 && k1 == 65535) {
                    k = stream.readShort(13111);
                    this.Gd = stream.readUnsignedByte(-9268);
                    break;
                }
                if (k1 >= 32768) {
                    k1 = kq.U[k1 - 32768];
                    buf[index] = hba.bitwiseArg1ORArg2(1073741824, k1);
                    int i2 = laa.itemDefLoader.d(12388, k1).wb;
                    if (i2 != 0) {
                        this.Gd = i2;
                    }
                } else {
                    buf[index] = hba.bitwiseArg1ORArg2(-2147483648, k1 - 256);
                }
            }
        }
        int[] buf1 = new int[5];
        for (int index = 0; index < 5; index++) {
            int i1 = stream.readUnsignedByte(-9268);
            if (ck.K.length < 1 || i1 < 0 || i1 >= ck.K[0][index].length) {
                i1 = 0;
            }
            buf1[index] = i1;
        }
        Dd = stream.readShort(13111);
        this.hd = stream.readString((byte) 124);
        this.displayName = this.hd;
        this.combatLevel = stream.readUnsignedByte(-9268);
        if (bool1) {
            this.ud = stream.readShort(dummy ^ ~0x3337);
            if (this.ud == 65535) {
                this.ud = -1;
            }
            this.ed = -1;
            this.Md = this.combatLevel;
        } else {
            this.ud = 0;
            this.Md = stream.readUnsignedByte(-9268);
            this.ed = stream.readUnsignedByte(-9268);
            if (this.ed == 255) {
                this.ed = -1;
            }
        }
        int i1 = this.xd;
        this.xd = stream.readUnsignedByte(-9268);
        if (this.xd != 0) {
            int j1 = this.Rc;
            int k1 = this.yd;
            int i2 = this.fd;
            int j2 = this.jd;
            int k2 = this.Od;
            this.Rc = stream.readShort(13111);
            this.yd = stream.readShort(13111);
            this.fd = stream.readShort(13111);
            this.jd = stream.readShort(13111);
            this.Od = stream.readUnsignedByte(-9268);
            if (bool == !this.sd || this.xd != i1 || j1 != this.Rc || this.yd != k1 || this.fd != i2 || j2 != this.jd || this.Od != k2) {
                gba.a(this, dummy ^ 0x70);
            }
        } else {
            jn.a((byte) 70, this);
        }
        if (this.playerDef == null) {
            this.playerDef = new PlayerDef();
        }
        int j1 = ((Player) this).playerDef.d;
        int[] buf2 = this.playerDef.k;
        this.playerDef.a(buf, Kd == 1, a(false), k, (byte) 23, buf1);
        if (k != j1) {
            this.locX = (this.regionLocalX[0] << 9) + (i(-1) << 8);
            this.locY = (this.regionLocalY[0] << 9) + (i(dummy) << 8);
        }
        if (ih.n == this.lb && buf2 != null) {
            for (int index = 0; buf1.length > index; index++) {
                if (buf1[index] != buf2[index]) {
                    laa.itemDefLoader.b(dummy ^ ~0x6a);
                    break;
                }
            }
        }
        if (this.tq_ != null) {
            this.tq_.b();
        }
        if (dummy != this.Bc && this.V) {
            cg cg = this.k(32195);
            if (!cg.a(this.Bc, -117)) {
                this.V = false;
                this.Bc = -1;
            }
        }
    }

    public final void a(boolean bool, int i, byte b, Class_r class_r, Animable animable, int j, int k) {
        td++;
        throw new IllegalStateException();
    }

    public static void m(int i) {
        if (i != 16383) {
            od = null;
        }
        WorldSub.p = null;
        id++;
        or.a(0, (byte) -23, eh.height, -1, ff.width, Class_vb.u, 0, 0, 0);
        if (WorldSub.p != null) {
            bn.a(0, eh.height, 0, jga.s, (byte) -4, ff.width, rca.e.Xb, WorldSub.p, qf.h, -1412584499);
            WorldSub.p = null;
        }
    }

    public final boolean a(int i, int j, Class_r class_r, int k) {
        if (k != 9678) {
            return true;
        }
        Zc++;
        if (this.playerDef == null || !a(false, class_r, 131072)) {
            return false;
        }
        Class_q class_q = class_r.p();
        int orientation = this.class_kd.getOrientation((byte) 67);
        class_q.o(orientation);
        class_q.U(this.locX, this.j, this.locY);
        boolean bool = false;
        for (int index = 0; this.das.length > index; index++) {
            if (this.das[index] != null && (ml.k ? this.das[index].a(i, j, class_q, true, Class_pd.r) : this.das[index].a(i, j, class_q, true))) {
                bool = true;
                break;
            }
        }
        ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
        return bool;
    }

    public final int i(int i) {
        Cd++;
        if (this.playerDef != null && this.playerDef.d != -1) {
            return jm.p.getNPCDef(this.playerDef.d, (byte) -115).Q;
        }
        if (i != -1) {
            updateLocation(29, 21, 67);
        }
        return super.i(-1);
    }

    public final void updateLocation(int i, int x, int y) {
        ((Entity) this).regionLocalX[0] = x;
        this.Fc = 0;
        this.Kc = 0;
        Ad++;
        this.Nc = 0;
        ((Entity) this).regionLocalY[0] = y;
        int j = i(i + 3376);
        this.locX = this.regionLocalX[0] * 512 + j * 256;
        this.locY = 512 * this.regionLocalY[0] + j * 256;
        if (this == up.thisPlayer) {
            Class_ad.b(120);
        }
        if (this.tq_ != null) {
            this.tq_.b();
        }
        if (i != -3377) {
            sendIllegalStateException(-126);
        }
    }

    public static void nullLoader(boolean bool) {
        Qd = null;
        incomingPacket70 = null;
        incomingPacket78 = null;
        outgoingPacekt69 = null;
        od = null;
        if (bool) {
            m(93);
        }
    }

    public final int a(boolean bool) {
        Pd++;
        if (bool) {
            this.Hd = -113;
        }
        return Dd;
    }

    public Player() {
        this.ed = -1;
        Sc = (byte) 0;
        this.orientation = -1;
        gd = (byte) 0;
        this.Rc = -1;
        this.cd = false;
        this.combatLevel = 0;
        this.sd = false;
        this.xd = 0;
        this.Hd = -1;
        this.fd = -1;
        this.vd = -1;
        Kd = (byte) 0;
        this.yd = -1;
        this.ud = 0;
        this.Md = 0;
        this.Ld = false;
        this.Gd = 0;
        this.Od = 255;
    }

    static {
        incomingPacket70 = new GameInPacket(70, -2);
    }
}
