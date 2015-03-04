/* ce - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ce {
    short a;
    int b;
    private int c;
    int d;
    static int e;
    private int f;
    int g = -1;
    int h;
    int i;
    private int j;
    boolean k = false;
    private int l;
    private int m;
    boolean n;
    int o;
    static int p;
    static int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w = 0;
    boolean x;
    static fm y;
    int z;
    int A;
    int B;
    int C;
    int D;
    private int E;
    int F;
    int G;
    int[] H;
    boolean I;
    int[] J;
    int K;
    boolean L;
    private int M;
    int N;
    int O;
    private int P;
    int[] Q;
    int R;
    private int S;
    int T;
    int U;
    int V;
    int W;
    int X;
    int Y;
    boolean Z;
    short ab;
    static boolean forced64mb = false;
    short cb;
    int db;
    int eb;
    int fb;
    boolean gb;
    int hb;
    int ib;
    int jb;
    boolean kb;
    int lb;
    int mb;
    short nb;
    int ob;
    private int pb;
    int qb;
    static int rb;
    static int sb;
    boolean tb;
    int[] ub;

    final void a(byte i, BytesParser var_es) {
        if (i > 85) {
            q++;
            for (; ; ) {
                int i_0_ = var_es.readUnsignedByte(-9268);
                if (i_0_ == 0)
                    break;
                a(true, var_es, i_0_);
            }
        }
    }

    private final void a(boolean bool, BytesParser var_es, int i) {
        if (bool == true) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((ce) this).C = var_es.readInt(86);
                        ((ce) this).v = var_es.readInt(76);
                    } else if (i == 4) {
                        ((ce) this).w = var_es.readUnsignedByte(-9268);
                        ((ce) this).qb = var_es.readByte(-20933);
                    } else if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i == 9) {
                                        int i_1_ = var_es.readUnsignedByte(-9268);
                                        ((ce) this).J = new int[i_1_];
                                        for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
                                            ((ce) this).J[i_2_]
                                                    = var_es.readShort(13111);
                                    } else if (i == 10) {
                                        int i_3_ = var_es.readUnsignedByte(-9268);
                                        ((ce) this).ub = new int[i_3_];
                                        for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
                                            ((ce) this).ub[i_4_]
                                                    = var_es.readShort(13111);
                                    } else if (i != 12) {
                                        if (i != 13) {
                                            if (i != 14) {
                                                if (i == 15)
                                                    ((ce) this).R
                                                            = var_es.readShort(13111);
                                                else if (i == 16) {
                                                    ((ce) this).tb
                                                            = var_es.readUnsignedByte(-9268) == 1;
                                                    ((ce) this).r
                                                            = var_es.readShort(13111);
                                                    ((ce) this).mb
                                                            = var_es.readShort(13111);
                                                    ((ce) this).n
                                                            = var_es.readUnsignedByte(-9268) == 1;
                                                } else if (i != 17) {
                                                    if (i == 18)
                                                        ((ce) this).eb
                                                                = var_es.readInt(87);
                                                    else if (i == 19)
                                                        ((ce) this).i
                                                                = var_es.readUnsignedByte(-9268);
                                                    else if (i == 20)
                                                        P = var_es.readUnsignedByte(-9268);
                                                    else if (i == 21)
                                                        pb = var_es.readUnsignedByte(-9268);
                                                    else if (i == 22)
                                                        ((ce) this).g
                                                                = var_es.readInt(120);
                                                    else if (i != 23) {
                                                        if (i == 24)
                                                            ((ce) this).L
                                                                    = false;
                                                        else if (i == 25) {
                                                            int i_5_
                                                                    = (var_es.readUnsignedByte
                                                                    (-9268));
                                                            ((ce) this).H
                                                                    = (new int
                                                                    [i_5_]);
                                                            for (int i_6_ = 0;
                                                                 i_5_ > i_6_;
                                                                 i_6_++)
                                                                ((ce) this)
                                                                        .H[i_6_]
                                                                        = (var_es.readShort
                                                                        (13111));
                                                        } else if (i != 26) {
                                                            if (i != 27) {
                                                                if (i != 28) {
                                                                    if (i
                                                                            != 29) {
                                                                        if (i
                                                                                != 30) {
                                                                            if (i == 31) {
                                                                                ((ce) this).B = var_es.readShort(13111) << 12 << 2;
                                                                                ((ce) this).h = var_es.readShort(13111) << 12 << 2;
                                                                            } else if (i == 32)
                                                                                ((ce) this).kb = false;
                                                                            else if (i != 33) {
                                                                                if (i == 34)
                                                                                    ((ce) this).Z = false;
                                                                            } else
                                                                                ((ce) this).x = true;
                                                                        } else
                                                                            ((ce)
                                                                                    this).gb
                                                                                    = true;
                                                                    } else
                                                                        var_es
                                                                                .readShort2
                                                                                        (90);
                                                                } else
                                                                    c = (var_es
                                                                            .readUnsignedByte
                                                                                    (-9268));
                                                            } else
                                                                ((ce) this).K
                                                                        = ((var_es
                                                                        .readShort
                                                                                (13111))
                                                                        << 12
                                                                        << 2);
                                                        } else
                                                            ((ce) this).I
                                                                    = false;
                                                    } else
                                                        M = var_es.readUnsignedByte(-9268);
                                                } else
                                                    ((ce) this).Y
                                                            = var_es.readShort(13111);
                                            } else
                                                ((ce) this).o = var_es.readShort(13111);
                                        } else
                                            ((ce) this).lb = var_es.readByte(-20933);
                                    } else
                                        ((ce) this).F = var_es.readByte(-20933);
                                } else {
                                    ((ce) this).ob = var_es.readShort(13111);
                                    ((ce) this).t = var_es.readShort(13111);
                                }
                            } else {
                                ((ce) this).D = var_es.readShort(13111);
                                ((ce) this).T = var_es.readShort(13111);
                            }
                        } else {
                            f = var_es.readInt(121);
                            S = var_es.readInt(107);
                        }
                    } else
                        ((ce) this).B = ((ce) this).h
                                = var_es.readShort(13111) << 12 << 2;
                } else
                    var_es.readUnsignedByte(-9268);
            } else {
                ((ce) this).a = (short) var_es.readShort(13111);
                ((ce) this).ab = (short) var_es.readShort(13111);
                ((ce) this).nb = (short) var_es.readShort(13111);
                ((ce) this).cb = (short) var_es.readShort(13111);
                int i_7_ = 3;
                ((ce) this).a <<= i_7_;
                ((ce) this).nb <<= i_7_;
                ((ce) this).cb <<= i_7_;
                ((ce) this).ab <<= i_7_;
            }
            p++;
        }
    }

    public static void a(boolean bool) {
        y = null;
        if (bool != false)
            a(null, null, null, null, (byte) -51);
    }

    final void a(int i) {
        ((ce) this).u = (f & 0xff3b37) >> 16;
        rb++;
        if (((ce) this).F > -2 || ((ce) this).lb > -2)
            ((ce) this).k = true;
        j = (0xff7030 & S) >> 16;
        ((ce) this).U = j - ((ce) this).u;
        ((ce) this).X = (0xff4a & f) >> 8;
        m = (0xff37 & S) >> 8;
        ((ce) this).db = m - ((ce) this).X;
        ((ce) this).G = f & 0xff;
        l = S & 0xff;
        ((ce) this).N = 0xff & f >> 24;
        ((ce) this).A = l - ((ce) this).G;
        E = 0xff & S >> 24;
        ((ce) this).ib = E - ((ce) this).N;
        if (i != -4)
            a(null, null, null, null, (byte) -115);
        if (((ce) this).K != -1) {
            ((ce) this).O = ((ce) this).T * c / 100;
            if (((ce) this).O == 0)
                ((ce) this).O = 1;
            ((ce) this).b
                    = (((ce) this).K - ((ce) this).B
                    - (((ce) this).h - ((ce) this).B) / 2) / ((ce) this).O;
        }
        if ((((ce) this).g ^ 0xffffffff) != 0) {
            ((ce) this).fb = ((ce) this).T * M / 100;
            if (((ce) this).fb == 0)
                ((ce) this).fb = 1;
            ((ce) this).W
                    = ((((ce) this).g
                    + (-((ce) this).C - (((ce) this).v - ((ce) this).C) / 2))
                    / ((ce) this).fb);
        }
        if (((ce) this).eb != 0) {
            ((ce) this).jb = ((ce) this).T * pb / 100;
            ((ce) this).s = P * ((ce) this).T / 100;
            if (((ce) this).s == 0)
                ((ce) this).s = 1;
            ((ce) this).z
                    = (((0xff66 & ((ce) this).eb) >> 8) + (-((ce) this).X
                    - ((ce) this).db / 2)
                    << 8) / ((ce) this).s;
            if (((ce) this).jb == 0)
                ((ce) this).jb = 1;
            ((ce) this).d
                    = ((0xff & ((ce) this).eb) - ((ce) this).A / 2 - ((ce) this).G
                    << 8) / ((ce) this).s;
            ((ce) this).hb = ((-((ce) this).u - ((ce) this).U / 2
                    + ((0xff2417 & ((ce) this).eb) >> 16))
                    << 8) / ((ce) this).s;
            ((ce) this).V = (((0xff & ((ce) this).eb >> 24) - ((ce) this).N
                    - ((ce) this).ib / 2)
                    << 8) / ((ce) this).jb;
            ce var_ce_8_ = this;
            ((ce) var_ce_8_).hb
                    = ((ce) var_ce_8_).hb - (((ce) this).hb > 0 ? 4 : 4);
            ce var_ce_9_ = this;
            ((ce) var_ce_9_).z
                    = ((ce) var_ce_9_).z - (((ce) this).z > 0 ? 4 : 4);
            ce var_ce_10_ = this;
            ((ce) var_ce_10_).d
                    = ((ce) var_ce_10_).d + (((ce) this).d <= 0 ? 4 : -4);
            ce var_ce_11_ = this;
            ((ce) var_ce_11_).V
                    = ((ce) var_ce_11_).V + (((ce) this).V <= 0 ? 4 : -4);
        }
    }

    static final void a(pl var_pl, pl var_pl_12_, pl var_pl_13_, pl var_pl_14_,
                        byte i) {
        Class_fc.a = var_pl_12_;
        if (i >= -60)
            y = null;
        nr.i = var_pl_14_;
        dga.G = var_pl_13_;
        sb++;
        Node_Sub.o = new Interface[Class_fc.a.a((byte) -107)][];
        pu.p = new boolean[Class_fc.a.a((byte) -107)];
    }

    public ce() {
        ((ce) this).n = true;
        c = 100;
        M = 100;
        ((ce) this).K = -1;
        ((ce) this).x = false;
        ((ce) this).I = true;
        ((ce) this).F = -2;
        ((ce) this).r = -1;
        P = 100;
        ((ce) this).i = 0;
        ((ce) this).Z = true;
        ((ce) this).kb = true;
        ((ce) this).R = -1;
        ((ce) this).mb = -1;
        ((ce) this).L = true;
        ((ce) this).Y = -1;
        ((ce) this).gb = false;
        ((ce) this).lb = -2;
        ((ce) this).tb = true;
        pb = 100;
        ((ce) this).o = 0;
    }
}
