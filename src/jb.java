/* jb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class jb extends Node {
    boolean isTextures;
    int l;
    int buildAreaSize = 0;
    boolean n;
    static boolean o;
    boolean p;
    int q;
    static int r;
    boolean s;
    boolean t;
    static int isLighting;
    boolean v;
    int w;
    int x;
    boolean y;
    int z;
    boolean A;
    boolean isOT;
    boolean C;
    static int D = 0;
    static int E;
    int F = 0;
    int G;
    int H;
    int I;
    boolean J;
    boolean K;
    boolean L;
    int tkVersion;
    int N;
    int O;
    int P;
    boolean isGB;
    boolean R;
    int S;
    boolean T;
    static int shadows;
    int V;
    int W;
    int X;
    int Y;
    int Z;
    boolean ab;
    static int bb;
    boolean cb;
    int db;
    static int eb;
    static int fb;

    final void a(int i, BytesParser bytesParser) {
        bytesParser.writeByte(22, (byte) -122);
        E++;
        bytesParser.writeByte(this.db, (byte) -108);
        bytesParser.writeByte(!this.C ? 0 : 1, (byte) -119);
        bytesParser.writeByte(this.R ? 1 : 0, (byte) -109);
        bytesParser.writeByte(!this.ab ? 0 : 1, (byte) -126);
        bytesParser.writeByte(!this.K ? 0 : 1, (byte) -108);
        bytesParser.writeByte(0, (byte) -119);
        bytesParser.writeByte(!this.y ? 0 : 1, (byte) -116);
        bytesParser.writeByte(this.isOT ? 1 : 0, (byte) -110);
        bytesParser.writeByte(!((jb) this).t ? 0 : 1, (byte) -108);
        bytesParser.writeByte(this.O, (byte) -126);
        bytesParser.writeByte(this.G, (byte) -123);
        bytesParser.writeByte(this.T ? 1 : 0, (byte) -111);
        bytesParser.writeByte(this.v ? 1 : 0, (byte) -115);
        bytesParser.writeByte(!this.L ? 0 : 1, (byte) -113);
        bytesParser.writeByte(!this.p ? 0 : 1, (byte) -127);
        bytesParser.writeByte(this.S, (byte) -111);
        bytesParser.writeByte(this.s ? 1 : 0, (byte) -109);
        bytesParser.writeByte(this.I, (byte) -125);
        bytesParser.writeByte(this.P, (byte) -114);
        bytesParser.writeByte(this.N, (byte) -124);
        if (i <= 47)
            this.tkVersion = 81;
        bytesParser.writeByte(this.Y, (byte) -123);
        bytesParser.writeByte(this.V, (byte) -110);
        bytesParser.writeShort(this.W, 13469);
        bytesParser.writeShort(this.F, 13469);
        bytesParser.writeByte(ql.a(0), (byte) -112);
        bytesParser.writeInt(this.l, -118);
        bytesParser.writeByte(this.w, (byte) -116);
        bytesParser.writeByte(this.A ? 1 : 0, (byte) -111);
        bytesParser.writeByte(this.n ? 1 : 0, (byte) -113);
        bytesParser.writeByte(this.buildAreaSize, (byte) -124);
        bytesParser.writeByte(this.cb ? 1 : 0, (byte) -120);
        bytesParser.writeByte(this.J ? 1 : 0, (byte) -110);
        bytesParser.writeByte(this.q, (byte) -121);
        bytesParser.writeByte(!this.isGB ? 0 : 1, (byte) -112);
        bytesParser.writeByte(this.tkVersion, (byte) -109);
        bytesParser.writeByte(this.x, (byte) -123);
        bytesParser.writeByte(!this.isTextures ? 0 : 1, (byte) -120);
        bytesParser.writeByte(this.X, (byte) -123);
        bytesParser.writeByte(this.H, (byte) -108);
        bytesParser.writeByte(this.z, (byte) -109);
    }

    /**
     * Called by the command (shadows).
     * @param shadowsCount
     * @param i
     * @param j
     */
    public final void shadows(int shadowsCount, int i, int j) {
        if (vea.a(i ^ 0x7, j)) {
            this.O = shadowsCount;
        } else {
            this.G = shadowsCount;
        }
        if (i == 2) {
            shadows++;
        }
    }

    /**
     * Called by the command (lighting).
     * @param i
     * @param performance
     * @return
     */
    public final boolean isLighting(int i, int performance) {
        isLighting++;
        if (i > -45) {
            isLighting(107, 113);
        }
        if (!vea.a(5, performance)) {
            return this.v;
        }
        return this.T;
    }

    static final void a(boolean bool, int i, int i_3_) {
        if (bool == false) {
            if (kca.o > kca.m) {
                kca.m += (double) kca.m / 30.0;
                if (kca.o < kca.m)
                    kca.m = kca.o;
                jf.c(-2488);
                kca.j = (int) kca.m >> 1;
                kca.s = mh.a(false, kca.j);
            } else if (kca.o < kca.m) {
                kca.m -= (double) kca.m / 30.0;
                if (kca.m < kca.o)
                    kca.m = kca.o;
                jf.c(-2488);
                kca.j = (int) kca.m >> 1;
                kca.s = mh.a(false, kca.j);
            }
            bb++;
            if (Class_k.Q != -1 && (pr.H ^ 0xffffffff) != 0) {
                int i_4_ = Class_k.Q - ut.I;
                if (i_4_ < 2 || i_4_ > 2)
                    i_4_ /= 8;
                int i_5_ = pr.H - cv.d;
                ut.I = i_4_ + ut.I;
                if (i_5_ < 2 || i_5_ > 2)
                    i_5_ /= 8;
                cv.d += i_5_;
                if (i_4_ == 0 && i_5_ == 0) {
                    pr.H = -1;
                    Class_k.Q = -1;
                }
                jf.c(-2488);
            }
            if (nda.g <= 0) {
                wh.J = -1;
                wq.o = -1;
            } else {
                sh.h--;
                if (sh.h == 0) {
                    sh.h = 100;
                    nda.g--;
                }
            }
            if (of.f && bg.c != null) {
                for (cf var_cf = (cf) bg.c.a(114); var_cf != null;
                     var_cf = (cf) bg.c.b((byte) 66)) {
                    ww var_ww
                            = kca.a.a(var_cf.m.o, 3);
                    if (var_cf.a(0, i_3_, i)) {
                        if (var_ww.D != null) {
                            if (var_ww.D[4] != null)
                                lea.setClickMenuOption(var_ww.C, false, 0, -1, true, -1,
                                        -75,
                                        (long) var_cf.m.o,
                                        var_ww.j, 1006,
                                        var_ww.D[4]);
                            if (var_ww.D[3] != null)
                                lea.setClickMenuOption(var_ww.C, false, 0, -1, true, -1,
                                        -116,
                                        (long) var_cf.m.o,
                                        var_ww.j, 1002,
                                        var_ww.D[3]);
                            if (var_ww.D[2] != null)
                                lea.setClickMenuOption(var_ww.C, false, 0, -1, true, -1,
                                        -97,
                                        (long) var_cf.m.o,
                                        var_ww.j, 1010,
                                        var_ww.D[2]);
                            if (var_ww.D[1] != null)
                                lea.setClickMenuOption(var_ww.C, false, 0, -1, true, -1,
                                        127,
                                        (long) var_cf.m.o,
                                        var_ww.j, 1007,
                                        var_ww.D[1]);
                            if (var_ww.D[0] != null)
                                lea.setClickMenuOption(var_ww.C, false, 0, -1, true, -1,
                                        -80,
                                        (long) var_cf.m.o,
                                        var_ww.j, 1012,
                                        var_ww.D[0]);
                        }
                        if (!var_cf.m.l) {
                            ((cf) var_cf).m.l = true;
                            ClientScriptHandler.a(hk.Q, var_cf.m.o,
                                    var_ww.C);
                        }
                        if (var_cf.m.l)
                            ClientScriptHandler.a(GPIPlayer.a, var_cf.m.o,
                                    var_ww.C);
                    } else if (var_cf.m.l) {
                        var_cf.m.l = false;
                        ClientScriptHandler.a(hba.a, var_cf.m.o,
                                var_ww.C);
                    }
                }
            }
        }
    }

    static final int a(int i, char c) {
        eb++;
        if (i >= (c ^ 0xffffffff) && c < Class_kd.d.length)
            return Class_kd.d[c];
        return -1;
    }

    final int b(int i, int i_6_) {
        if (i_6_ >= -105)
            isLighting(8, 107);
        r++;
        if (vea.a(5, i))
            return this.O;
        return this.G;
    }

    public final void showLighting(byte b, boolean isLighting, int performance) {
        if (vea.a(5, performance)) {
            this.T = isLighting;
        } else {
            this.v = isLighting;
        }
        fb++;
        if (b > -71) {
            this.J = true;
        }
    }

    public jb() {
        this.z = 0;
        this.H = 0;
        this.J = true;
        this.K = true;
        this.A = false;
        this.p = true;
        this.isTextures = false;
        this.C = true;
        this.l = 0;
        this.L = true;
        this.q = 1;
        this.isGB = true;
        this.R = true;
        this.w = 2;
        this.P = 127;
        this.x = 2;
        this.t = true;
        this.isOT = true;
        this.I = 127;
        this.X = 3;
        this.y = true;
        this.W = 0;
        this.cb = false;
        this.Z = 0;
        this.O = 2;
        this.G = 0;
        this.V = 127;
        this.Y = 127;
        this.N = 127;
        this.db = 3;
        this.s = true;
        this.tkVersion = 2;
        this.ab = true;
        this.S = 0;
    }

    static {
        o = false;
    }
}
