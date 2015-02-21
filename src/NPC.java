/* Class_ac - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

public final class NPC extends Entity {

    static int Qc;
    int Rc = -1;
    static int Sc;
    static int Tc;
    NPCDef npcDef;
    static int Vc;
    static int sendIllegalStateException;
    static Class_ec Xc = new Class_ec(2);
    static int Yc;
    static int Zc;
    static int ad;
    int bd = -1;
    static int cd;
    static int dd;
    static int ed;
    static int fd;
    static int gd;
    static int hd;
    static int id;
    static int jd;
    static qfa kd = new qfa("", 11);
    static int ld;
    static int md;
    static int nd;

    public final void b(boolean bool, Class_r class_r) {
        gd++;
        if (this.npcDef != null && (this.Hc || a(21918, class_r, 0))) {
            Class_q class_q = class_r.p();
            if (bool) {
                this.bd = -13;
            }
            class_q.o(this.class_kd.getOrientation((byte) 67));
            class_q.U(this.locX, this.j - 20, this.locY);
            this.a(class_q, this.Hc, class_r, this.das, (byte) -58);
            ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
        }
    }

    public final int a(boolean bool) {
        Vc++;
        if (bool) {
            return -84;
        }
        if (this.npcDef.L != null) {
            NPCDef npcDef1 = this.npcDef.a(-4261, cp.e);
            if (npcDef1 != null && (~npcDef1.x) != 0) {
                return npcDef1.x;
            }
        }
        return this.npcDef.x;
    }

    private boolean i(byte b) {
        if (b != 89) {
            kd = null;
        }
        Qc++;
        return this.npcDef.m;
    }

    public final sd a(Class_r class_r, int i) {
        if (i != -1660704056) {
            return null;
        }
        cd++;
        return null;
    }

    public final void a(boolean bool, int i, byte b, Class_r class_r, Animable animable, int j, int k) {
        id++;
        throw new IllegalStateException();
    }

    public final boolean h(byte b) {
        if (b > -26) {
            return true;
        }
        md++;
        return false;
    }

    public final void a(boolean bool, int y, byte b, int i, int height, int x) {
        ld++;
        this.height = this.h = (byte) height;
        if (ItemDef.b(y, x, 5706)) {
            this.h++;
        }
        if (this.yb != -1 && Class_ef.J.c(64, this.yb).k == 1) {
            this.yb = -1;
            this.Ab = null;
        }
        if (this.graphicsId_ != -1) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId_);
            if (iv.d && (~iv.w) != 0 && Class_ef.J.c(64, iv.w).k == 1) {
                this.graphicsId_ = -1;
            }
        }
        if (this.graphicsId != -1) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId);
            if (iv.d && (~iv.w) != 0 && Class_ef.J.c(64, iv.w).k == 1) {
                this.graphicsId = -1;
            }
        }
        if (!bool) {
            int xx = x - this.regionLocalX[0];
            int yy = y - this.regionLocalY[0];
            if (xx >= -8 && xx <= 8 && yy >= -8 && yy <= 8) {
                if (this.Nc < 9) {
                    this.Nc++;
                }
                for (int index = this.Nc; index > 0; index--) {
                    ((Entity) this).regionLocalX[index] = this.regionLocalX[index - 1];
                    ((Entity) this).regionLocalY[index] = this.regionLocalY[index - 1];
                    ((Entity) this).moveTypes[index] = this.moveTypes[index - 1];
                }
                ((Entity) this).regionLocalX[0] = x;
                ((Entity) this).regionLocalY[0] = y;
                ((Entity) this).moveTypes[0] = (byte) 1;
                return;
            }
        }
        this.Kc = 0;
        this.Nc = 0;
        ((Entity) this).regionLocalX[0] = x;
        this.Fc = 0;
        ((Entity) this).regionLocalY[0] = y;
        this.locX = (i << 8) + (this.regionLocalX[0] << 9);
        this.locY = (this.regionLocalY[0] << 9) + (i << 8);
        if (this.tq_ != null) {
            this.tq_.b();
        }
    }

    public static boolean b(int i, int j) {
        ed++;
        if (i < 4 || i > 8) {
            return false;
        }
        return true;
    }

    public static void nullLoader(int i) {
        if (i == 18986) {
            kd = null;
            Xc = null;
        }
    }

    public final int a(byte b) {
        if (b != -7) {
            b(false, null);
        }
        fd++;
        if (this.npcDef.L != null) {
            NPCDef npcDef1 = this.npcDef.a(b - 4254, cp.e);
            if (npcDef1 != null && npcDef1.i != -1) {
                return npcDef1.i;
            }
        }
        return this.npcDef.i;
    }

    public final boolean isNpcDef(int i) {
        dd++;
        if (this.npcDef == null) {
            return false;
        }
        return true;
    }

    public final void a(int i, int moveTypes, byte b) {
        Tc++;
        if (b != -79) {
            this.bd = -76;
        }
        int x = this.regionLocalX[0];
        int y = this.regionLocalY[0];
        if (i == 0) {
            y++;
        }
        if (i == 1) {
            y++;
            x++;
        }
        if (i == 2) {
            x++;
        }
        if (i == 3) {
            x++;
            y--;
        }
        if (i == 4) {
            y--;
        }
        if (i == 5) {
            x--;
            y--;
        }
        if (i == 6) {
            x--;
        }
        if ((~this.yb) != 0 && Class_ef.J.c(64, this.yb).k == 1) {
            this.yb = -1;
            this.Ab = null;
        }
        if (i == 7) {
            x--;
            y++;
        }
        if (this.graphicsId_ != -1) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId_);
            if (iv.d && iv.w != -1 && Class_ef.J.c(64, iv.w).k == 1) {
                this.graphicsId_ = -1;
            }
        }
        if ((~this.graphicsId) != 0) {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId);
            if (iv.d && (~iv.w) != 0 && Class_ef.J.c(64, iv.w).k == 1) {
                this.graphicsId = -1;
            }
        }
        if (this.Nc < 9) {
            this.Nc++;
        }
        for (int index = this.Nc; index > 0; index--) {
            ((Entity) this).regionLocalX[index] = this.regionLocalX[index - 1];
            ((Entity) this).regionLocalY[index] = this.regionLocalY[index - 1];
            ((Entity) this).moveTypes[index] = this.moveTypes[index - 1];
        }
        ((Entity) this).regionLocalX[0] = x;
        ((Entity) this).regionLocalY[0] = y;
        ((Entity) this).moveTypes[0] = (byte) moveTypes;
    }

    public static void a(int height, float[] data_, int width, int format, int internalFormat, int target, byte b) {
        Sc++;
        if (width > 0 && !ar.a(width, (byte) 98)) {
            throw new IllegalArgumentException("");
        }
        if (height > 0 && !ar.a(height, (byte) 98)) {
            throw new IllegalArgumentException("");
        }
        int k1 = kr.a(format, (byte) -116);
        int level = 0;
        int j2 = width >= height ? height : width;
        int widthOff = width >> 1;
        int heightOff = height >> 1;
        float[] data = data_;
        float[] data_2 = new float[widthOff * heightOff * k1];
        for (; ; ) {
            OpenGL.glTexImage2Df(target, level, internalFormat, width, height, 0, format, 5126, data, 0);
            if (j2 <= 1) {
                break;
            }
            int k2 = width * k1;
            for (int i3 = 0; k1 > i3; i3++) {
                int j3 = i3;
                int k3 = i3;
                int i4 = k3 + k2;
                for (int heightOffset = 0; heightOffset < heightOff; heightOffset++) {
                    for (int widthOffset = 0; widthOff > widthOffset; widthOffset++) {
                        float f = data[k3];
                        k3 += k1;
                        f += data[k3];
                        f += data[i4];
                        k3 += k1;
                        i4 += k1;
                        f += data[i4];
                        i4 += k1;
                        data_2[j3] = f * 0.25F;
                        j3 += k1;
                    }
                    i4 += k2;
                    k3 += k2;
                }
            }
            float[] data_1 = data_2;
            data_2 = data;
            width = widthOff;
            data = data_1;
            height = heightOff;
            j2 >>= 1;
            heightOff >>= 1;
            level++;
            widthOff >>= 1;
        }
        if (b != -65) {
            a(-9, null, 89, 47, -70, -119, (byte) -2);
        }
    }

    public final int j(int i) {
        jd++;
        if (i != 17566) {
            this.bd = -105;
        }
        if (this.npcDef.L != null) {
            NPCDef npcDef1 = this.npcDef.a(-4261, cp.e);
            if (npcDef1 != null && npcDef1.xb != -1) {
                return npcDef1.xb;
            }
        }
        if (this.npcDef.xb == -1) {
            return super.j(17566);
        }
        return this.npcDef.xb;
    }

    private boolean a(int i, Class_r class_r, int mask) {
        Yc++;
        int mask_ = mask;
        cg cg = this.k(32195);
        dr dr = ((~this.yb) != 0 && this.oc == 0 ? Class_ef.J.c(64, this.yb) : null);
        dr dr1= ((~this.Bc) != 0 && (!this.V || dr == null) ? Class_ef.J.c(i ^ 0x55de, this.Bc) : null);
        int j = cg.i;
        int k = cg.W;
        if (j != 0 || k != 0 || cg.O != 0 || cg.C != 0)
            mask |= 0x7;
        boolean bool = (this.Xb != 0 && pm.currentTimedTicks >= this.zc && pm.currentTimedTicks < this.Cb);
        if (i != 21918) {
            this.Rc = 23;
        }
        if (bool) {
            mask |= 0x80000;
        }
        da da = (((Entity) this).das[0] = this.npcDef.a(this.yc, this.rc, this.W, hs.f, this.hc, this.ic, dr1, 13770, this.Ib, dr, Class_ef.J,
                mask, this.ans, class_r, cp.e));
        if (da == null) {
            return false;
        }
        this.Ac = da.J();
        this.cc = da.RA();
        this.a((byte) -34, da);
        int orientation = this.class_kd.getOrientation((byte) 67);
        if (j != 0 || k != 0) {
            this.a(i - 24830, orientation, j, cg.D, k, cg.U);
            if (this.ec != 0) {
                this.das[0].MA(this.ec);
            }
            if (this.R != 0) {
                this.das[0].W(this.R);
            }
            if (this.pb != 0) {
                this.das[0].oa(0, this.pb, 0);
            }
        } else {
            this.a(-2912, orientation, this.i(-1) << 9, 0, this.i(-1) << 9, 0);
        }
        if (bool) {
            da.a(this.vb, this.Mb, this.Tb, 0xff & this.Xb);
        }
        if (this.graphicsId_ == -1 || this.kc == -1) {
            ((Entity) this).das[1] = null;
        } else {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId_);
            boolean bool1 = iv.r == 3 && (j != 0 || k != 0);
            int mask_1 = mask_;
            if (!bool1) {
                if (this.rotation_ != 0) {
                    mask_1 |= 0x5;
                }
                if (this.Pb != 0) {
                    mask_1 |= 0x2;
                }
            } else {
                mask_1 |= 0x7;
            }
            da da1 = (((Entity) this).das[1] = iv.a(this.Ob, class_r, i - 21806, Class_ef.J, this.kc, mask_1, this.qb));
            if (da1 != null) {
                if (this.Pb != 0) {
                    da1.oa(0, -this.Pb << 2, 0);
                }
                if (this.rotation_ != 0) {
                    da1.M(2048 * this.rotation_);
                }
                if (bool1) {
                    if (this.ec != 0) {
                        da1.MA(this.ec);
                    }
                    if (this.R != 0) {
                        da1.W(this.R);
                    }
                    if (this.pb != 0) {
                        da1.oa(0, this.pb, 0);
                    }
                }
            }
        }
        if (this.graphicsId == -1 || this.mb == -1) {
            ((Entity) this).das[2] = null;
        } else {
            iv iv = Class_ic.H.a((byte) 12, this.graphicsId);
            boolean bool1 = iv.r == 3 && (j != 0 || k != 0);
            int mask_1 = mask_;
            if (bool1) {
                mask_1 |= 0x7;
            } else {
                if (this.rotation != 0) {
                    mask_1 |= 0x5;
                }
                if (this.delayAndHeight != 0) {
                    mask_1 |= 0x2;
                }
            }
            da da1 = (((Entity) this).das[2] = iv.a(Class_ef.J, 79, class_r, this.P, mask_1, this.mb, this.pc));
            if (da1 != null) {
                if (this.delayAndHeight != 0) {
                    da1.oa(0, -this.delayAndHeight << 2, 0);
                }
                if (this.rotation != 0) {
                    da1.M(this.rotation * 2048);
                }
                if (bool1) {
                    if (this.ec != 0) {
                        da1.MA(this.ec);
                    }
                    if (this.R != 0) {
                        da1.W(this.R);
                    }
                    if (this.pb != 0) {
                        da1.oa(0, this.pb, 0);
                    }
                }
            }
        }
        return true;
    }

    public final void sendIllegalStateException(int i) {
        sendIllegalStateException++;
        if (i == -1) {
            throw new IllegalStateException();
        }
    }

    public final og a(boolean bool, Class_r class_r) {
        ad++;
        if (this.npcDef == null || !a(21918, class_r, 2048)) {
            return null;
        }
        Class_q class_q = class_r.p();
        int orientation = this.class_kd.getOrientation((byte) 67);
        class_q.o(orientation);
        vf vf = (ol.p[this.height][this.locX >> Class_fb.a][this.locY >> Class_fb.a]);
        if (vf != null && vf.m != null) {
            int i = this.db - vf.m.x;
            this.db -= (float) i / 10.0F;
        } else {
            this.db -= (float) this.db / 10.0F;
        }
        class_q.U(this.locX, this.j - this.db - 20, this.locY);
        cg cg = this.k(32195);
        NPCDef npcDef1 = (this.npcDef.L == null ? this.npcDef : this.npcDef.a(-4261, cp.e));
        this.Oc = bool;
        if (cs.g.t && npcDef1.f && cg.k) {
            dr dr = (this.yb == -1 || this.oc != 0 ? null : Class_ef.J.c(64, this.yb));
            dr dr1 = (this.Bc != -1 && (!this.V || dr == null) ? Class_ef.J.c(64, this.Bc) : null);
            da dr2 = cg.a(this.npcDef.qb & 0xff, orientation, this.das[0], this.npcDef.n & 0xff, this.npcDef.rb & 0xffff, this.npcDef.Q, this.R,
                    class_r, this.npcDef.V & 0xffff, this.ec, this.pb, false, dr1 == null ? this.yc : this.Ib, dr1 != null ? dr1 : dr);
            if (dr2 != null) {
                this.Oc = true;
                class_r.ZA(false);
                if (ml.k) {
                    dr2.a(class_q, null, Class_pd.r, 0);
                } else {
                    dr2.a(class_q, null, 0);
                }
                class_r.ZA(true);
            }
        }
        class_q.o(orientation);
        class_q.U(this.locX, this.j - 5 - this.db, this.locY);
        og og = null;
        if (i((byte) 89)) {
            og = lf.a(true, this.das.length);
        }
        this.a(class_q, false, class_r, this.das, (byte) -100);
        if (ml.k) {
            for (int index = 0; index < this.das.length; index++) {
                if (this.das[index] != null) {
                    this.das[index].a(class_q, (og == null ? null : og.g[index]), Class_pd.r, 0);
                }
            }
        } else {
            for (int index = 0; index < this.das.length; index++) {
                if (this.das[index] != null) {
                    this.das[index].a(class_q, (og != null ? og.g[index] : null), 0);
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
        for (int index = 0; index < this.das.length; index++) {
            if (this.das[index] != null) {
                this.Oc |= this.das[index].LA();
            }
        }
        this.Wb = sh.j;
        ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
        return og;
    }

    public NPC() {
    /* empty */
    }

    public final void a(NPCDef npcDef1, int i) {
        if (i != 0) {
            isNpcDef(85);
        }
        nd++;
        this.npcDef = npcDef1;
        if (this.tq_ != null) {
            this.tq_.b();
        }
    }

    public final boolean a(int i, int j, Class_r class_r, int k) {
        Zc++;
        if (this.npcDef == null || !a(21918, class_r, 131072)) {
            return false;
        }
        Class_q class_q = class_r.p();
        int orientation = this.class_kd.getOrientation((byte) 67);
        class_q.o(orientation);
        class_q.U(this.locX, this.j, this.locY);
        boolean bool = false;
        if (k != 9678) {
            return true;
        }
        for (int index = 0; index < this.das.length; index++) {
            if (this.das[index] != null) {
                boolean bool1 = ((~this.npcDef.O) != 0 ? this.npcDef.O == 1 : this.npcDef.Q == 1);
                boolean bool2;
                if (ml.k) {
                    bool2 = this.das[index].a(i, j, class_q, bool1, Class_pd.r);
                } else {
                    bool2 = this.das[index].a(i, j, class_q, bool1);
                }
                if (bool2) {
                    bool = true;
                    break;
                }
            }
        }
        ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
        return bool;
    }
}
