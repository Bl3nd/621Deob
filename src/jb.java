/* jb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class jb extends Node {
    boolean k;
    int l;
    int m = 0;
    boolean n;
    static boolean o;
    boolean p;
    int q;
    static int r;
    boolean s;
    boolean t;
    static int u;
    boolean v;
    int w;
    int x;
    boolean y;
    int z;
    boolean A;
    boolean B;
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
    int M;
    int N;
    int O;
    int P;
    boolean Q;
    boolean R;
    int S;
    boolean T;
    static int U;
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
        bytesParser.writeByte((int) 22, (byte) -122);
        E++;
        bytesParser.writeByte(((jb) this).db, (byte) -108);
        bytesParser.writeByte((int) (!((jb) this).C ? 0 : 1), (byte) -119);
        bytesParser.writeByte((int) (((jb) this).R ? 1 : 0), (byte) -109);
        bytesParser.writeByte((int) (!((jb) this).ab ? 0 : 1), (byte) -126);
        bytesParser.writeByte((int) (!((jb) this).K ? 0 : 1), (byte) -108);
        bytesParser.writeByte((int) 0, (byte) -119);
        bytesParser.writeByte((int) (!((jb) this).y ? 0 : 1), (byte) -116);
        bytesParser.writeByte((int) (((jb) this).B ? 1 : 0), (byte) -110);
        bytesParser.writeByte((int) (!((jb) this).t ? 0 : 1), (byte) -108);
        bytesParser.writeByte(((jb) this).O, (byte) -126);
        bytesParser.writeByte(((jb) this).G, (byte) -123);
        bytesParser.writeByte((int) (((jb) this).T ? 1 : 0), (byte) -111);
        bytesParser.writeByte((int) (((jb) this).v ? 1 : 0), (byte) -115);
        bytesParser.writeByte((int) (!((jb) this).L ? 0 : 1), (byte) -113);
        bytesParser.writeByte((int) (!((jb) this).p ? 0 : 1), (byte) -127);
        bytesParser.writeByte(((jb) this).S, (byte) -111);
        bytesParser.writeByte((int) (((jb) this).s ? 1 : 0), (byte) -109);
        bytesParser.writeByte(((jb) this).I, (byte) -125);
        bytesParser.writeByte(((jb) this).P, (byte) -114);
        bytesParser.writeByte(((jb) this).N, (byte) -124);
        if (i <= 47)
            ((jb) this).M = 81;
        bytesParser.writeByte(((jb) this).Y, (byte) -123);
        bytesParser.writeByte(((jb) this).V, (byte) -110);
        bytesParser.writeShort(((jb) this).W, 13469);
        bytesParser.writeShort(((jb) this).F, 13469);
        bytesParser.writeByte(ql.a((int) 0), (byte) -112);
        bytesParser.writeInt(((jb) this).l, (int) -118);
        bytesParser.writeByte(((jb) this).w, (byte) -116);
        bytesParser.writeByte((int) (((jb) this).A ? 1 : 0), (byte) -111);
        bytesParser.writeByte((int) (((jb) this).n ? 1 : 0), (byte) -113);
        bytesParser.writeByte(((jb) this).m, (byte) -124);
        bytesParser.writeByte((int) (((jb) this).cb ? 1 : 0), (byte) -120);
        bytesParser.writeByte((int) (((jb) this).J ? 1 : 0), (byte) -110);
        bytesParser.writeByte(((jb) this).q, (byte) -121);
        bytesParser.writeByte((int) (!((jb) this).Q ? 0 : 1), (byte) -112);
        bytesParser.writeByte(((jb) this).M, (byte) -109);
        bytesParser.writeByte(((jb) this).x, (byte) -123);
        bytesParser.writeByte((int) (!((jb) this).k ? 0 : 1), (byte) -120);
        bytesParser.writeByte(((jb) this).X, (byte) -123);
        bytesParser.writeByte(((jb) this).H, (byte) -108);
        bytesParser.writeByte(((jb) this).z, (byte) -109);
    }

    final void a(int i, int i_0_, int i_1_) {
        if (vea.a(i_0_ ^ 0x7, i_1_))
            ((jb) this).O = i;
        else
            ((jb) this).G = i;
        if (i_0_ == 2)
            U++;
    }

    final boolean a(int i, int i_2_) {
        u++;
        if (i > -45)
            a(107, 113);
        if (!vea.a(5, i_2_))
            return ((jb) this).v;
        return ((jb) this).T;
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
                for (cf var_cf = (cf) bg.c.a((int) 114); var_cf != null;
                     var_cf = (cf) bg.c.b((byte) 66)) {
                    ww var_ww
                            = kca.a.a(((Class_vb) ((cf) var_cf).m).o, (int) 3);
                    if (var_cf.a(0, i_3_, i)) {
                        if (((ww) var_ww).D != null) {
                            if (((ww) var_ww).D[4] != null)
                                lea.setClickMenuOption(((ww) var_ww).C, false, 0, -1, true, -1,
                                        -75,
                                        (long) ((Class_vb) ((cf) var_cf).m).o,
                                        ((ww) var_ww).j, 1006,
                                        ((ww) var_ww).D[4]);
                            if (((ww) var_ww).D[3] != null)
                                lea.setClickMenuOption(((ww) var_ww).C, false, 0, -1, true, -1,
                                        -116,
                                        (long) ((Class_vb) ((cf) var_cf).m).o,
                                        ((ww) var_ww).j, 1002,
                                        ((ww) var_ww).D[3]);
                            if (((ww) var_ww).D[2] != null)
                                lea.setClickMenuOption(((ww) var_ww).C, false, 0, -1, true, -1,
                                        -97,
                                        (long) ((Class_vb) ((cf) var_cf).m).o,
                                        ((ww) var_ww).j, 1010,
                                        ((ww) var_ww).D[2]);
                            if (((ww) var_ww).D[1] != null)
                                lea.setClickMenuOption(((ww) var_ww).C, false, 0, -1, true, -1,
                                        127,
                                        (long) ((Class_vb) ((cf) var_cf).m).o,
                                        ((ww) var_ww).j, 1007,
                                        ((ww) var_ww).D[1]);
                            if (((ww) var_ww).D[0] != null)
                                lea.setClickMenuOption(((ww) var_ww).C, false, 0, -1, true, -1,
                                        -80,
                                        (long) ((Class_vb) ((cf) var_cf).m).o,
                                        ((ww) var_ww).j, 1012,
                                        ((ww) var_ww).D[0]);
                        }
                        if (!((Class_vb) ((cf) var_cf).m).l) {
                            ((Class_vb) ((cf) var_cf).m).l = true;
                            ClientScriptHandler.a(hk.Q, ((Class_vb) ((cf) var_cf).m).o,
                                    ((ww) var_ww).C);
                        }
                        if (((Class_vb) ((cf) var_cf).m).l)
                            ClientScriptHandler.a(GPIPlayer.a, ((Class_vb) ((cf) var_cf).m).o,
                                    ((ww) var_ww).C);
                    } else if (((Class_vb) ((cf) var_cf).m).l) {
                        ((Class_vb) ((cf) var_cf).m).l = false;
                        ClientScriptHandler.a(hba.a, ((Class_vb) ((cf) var_cf).m).o,
                                ((ww) var_ww).C);
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
            a(8, 107);
        r++;
        if (vea.a(5, i))
            return ((jb) this).O;
        return ((jb) this).G;
    }

    final void a(byte i, boolean bool, int i_7_) {
        if (vea.a(5, i_7_))
            ((jb) this).T = bool;
        else
            ((jb) this).v = bool;
        fb++;
        if (i > -71)
            ((jb) this).J = true;
    }

    public jb() {
        ((jb) this).z = 0;
        ((jb) this).H = 0;
        ((jb) this).J = true;
        ((jb) this).K = true;
        ((jb) this).A = false;
        ((jb) this).p = true;
        ((jb) this).k = false;
        ((jb) this).C = true;
        ((jb) this).l = 0;
        ((jb) this).L = true;
        ((jb) this).q = 1;
        ((jb) this).Q = true;
        ((jb) this).R = true;
        ((jb) this).w = 2;
        ((jb) this).P = 127;
        ((jb) this).x = 2;
        ((jb) this).t = true;
        ((jb) this).B = true;
        ((jb) this).I = 127;
        ((jb) this).X = 3;
        ((jb) this).y = true;
        ((jb) this).W = 0;
        ((jb) this).cb = false;
        ((jb) this).Z = 0;
        ((jb) this).O = 2;
        ((jb) this).G = 0;
        ((jb) this).V = 127;
        ((jb) this).Y = 127;
        ((jb) this).N = 127;
        ((jb) this).db = 3;
        ((jb) this).s = true;
        ((jb) this).M = 2;
        ((jb) this).ab = true;
        ((jb) this).S = 0;
    }

    static {
        o = false;
    }
}
