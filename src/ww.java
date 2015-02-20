/* ww - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ww {
    boolean a;
    int b;
    int c;
    private int d;
    int e;
    aw f;
    static int g;
    boolean h = true;
    private int i = -1;
    String j;
    static int k;
    private int l;
    static int m;
    static int n;
    private int o;
    int p;
    String q;
    int r = -1;
    private int s;
    static int t;
    static int u;
    private int v;
    int w;
    int x;
    static int y;
    int z;
    private int A;
    boolean B;
    int C;
    String[] D;
    int E;
    static int F;
    int G;
    private int H;
    private il I;
    boolean J;
    static int K;
    int L;
    private int M;
    static int N;
    int[] O;
    int P;
    int Q;
    int R;

    final f a(int i, Class_r class_r) {
        g++;
        if (i >= -59)
            a((int) 112, (BytesParser) null, (byte) -61);
        f var_f
                = ((f)
                ((aw) ((ww) this).f).n.get((long) (0x20000 | A
                                | ((Class_r) class_r).b << 29),
                        (byte) 100));
        if (var_f != null)
            return var_f;
        ((aw) ((ww) this).f).d.g(1912, A);
        aga var_aga = aga.a(((aw) ((ww) this).f).d, A, 0);
        if (var_aga != null) {
            var_f = class_r.a(var_aga, true);
            ((aw) ((ww) this).f).n.put((long) (((Class_r) class_r).b << 29
                            | (0x20000 | A)),
                    var_f, 1);
        }
        return var_f;
    }

    final String a(int i, String string, int i_0_) {
        N++;
        if (I == null)
            return string;
        if (i <= 77)
            ((ww) this).r = 55;
        aa var_aa = (aa) I.a(-32748, (long) i_0_);
        if (var_aa == null)
            return string;
        return ((aa) var_aa).m;
    }

    final boolean a(haa var_haa, boolean bool) {
        t++;
        int i;
        if ((o ^ 0xffffffff) == 0) {
            if ((v ^ 0xffffffff) == 0)
                return true;
            i = var_haa.a(117, v);
        } else
            i = var_haa.b(o, -99);
        if (d > i || i > l)
            return false;
        if (bool != false)
            ((ww) this).G = -128;
        boolean bool_1_ = false;
        int i_2_;
        if (H == -1) {
            if ((this.i ^ 0xffffffff) != 0)
                i_2_ = var_haa.a(115, this.i);
            else
                return true;
        } else
            i_2_ = var_haa.b(H, -127);
        if (i_2_ < s || M < i_2_)
            return false;
        return true;
    }

    private final void a(int i, BytesParser var_es, byte i_3_) {
        n++;
        if (i == 1)
            ((ww) this).L = var_es.readShort(13111);
        else if (i == 2)
            ((ww) this).r = var_es.readShort(13111);
        else if (i == 3)
            ((ww) this).q = var_es.readString((byte) 127);
        else if (i != 4) {
            if (i == 5)
                ((ww) this).z = var_es.readTribyte(-1);
            else if (i != 6) {
                if (i == 7) {
                    int i_4_ = var_es.readUnsignedByte(-9268);
                    if ((i_4_ & 0x2) == 2)
                        ((ww) this).J = true;
                    if ((0x1 & i_4_) == 0)
                        ((ww) this).a = false;
                } else if (i == 8)
                    ((ww) this).B = var_es.readUnsignedByte(-9268) == 1;
                else if (i != 9) {
                    if (i >= 10 && i <= 14)
                        ((ww) this).D[i - 10] = var_es.readString((byte) 123);
                    else if (i == 15) {
                        System.out.println("15");
                        int i_5_ = var_es.readUnsignedByte(-9268);
                        ((ww) this).O = new int[i_5_ * 2];
                        for (int i_6_ = 0; i_5_ * 2 > i_6_; i_6_++)
                            ((ww) this).O[i_6_] = var_es.readShort2(127);
                        ((ww) this).R = var_es.readInt(115);
                        ((ww) this).Q = var_es.readInt(82);
                    } else if (i == 16)
                        ((ww) this).h = false;
                    else if (i == 17)
                        ((ww) this).j = var_es.readString((byte) 123);
                    else if (i == 18)
                        A = var_es.readShort(13111);
                    else if (i != 19) {
                        if (i == 20) {
                            this.i = var_es.readShort(13111);
                            if (this.i == 65535)
                                this.i = -1;
                            H = var_es.readShort(13111);
                            if (H == 65535)
                                H = -1;
                            s = var_es.readInt(90);
                            M = var_es.readInt(109);
                        } else if (i == 21)
                            ((ww) this).w = var_es.readInt(75);
                        else if (i != 22) {
                            if (i == 249) {
                                int i_7_ = var_es.readUnsignedByte(-9268);
                                if (I == null) {
                                    int i_8_ = dfa.a(i_7_, 128);
                                    I = new il(i_8_);
                                }
                                for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
                                    boolean bool = var_es.readUnsignedByte(-9268) == 1;
                                    int i_10_ = var_es.readTribyte(-1);
                                    Node class_d;
                                    if (!bool)
                                        class_d = new GameInPacketHandler(var_es.readInt(116));
                                    else
                                        class_d = new aa(var_es.readString((byte) 115));
                                    I.a(class_d, (byte) -48, (long) i_10_);
                                }
                            }
                        } else
                            ((ww) this).p = var_es.readInt(77);
                    } else
                        ((ww) this).C = var_es.readShort(13111);
                } else {
                    v = var_es.readShort(13111);
                    if (v == 65535)
                        v = -1;
                    o = var_es.readShort(13111);
                    if (o == 65535)
                        o = -1;
                    d = var_es.readInt(72);
                    l = var_es.readInt(101);
                }
            } else
                ((ww) this).e = var_es.readUnsignedByte(-9268);
        } else
            ((ww) this).E = var_es.readTribyte(-1);
        if (i_3_ <= 75)
            a((int) 28, (BytesParser) null, (byte) -5);
    }

    final f a(int i, Class_r class_r, boolean bool) {
        F++;
        if (i <= 34)
            ((ww) this).E = -66;
        int i_11_ = bool ? ((ww) this).r : ((ww) this).L;
        int i_12_ = ((Class_r) class_r).b << 29 | i_11_;
        f var_f = (f) ((aw) ((ww) this).f).n.get((long) i_12_, (byte) 100);
        if (var_f != null)
            return var_f;
        if (!((aw) ((ww) this).f).d.g(1912, i_11_))
            return null;
        aga var_aga = aga.a(((aw) ((ww) this).f).d, i_11_, 0);
        if (var_aga != null) {
            var_f = class_r.a(var_aga, true);
            ((aw) ((ww) this).f).n.put((long) i_12_, var_f, 1);
        }
        return var_f;
    }

    final void a(int i, BytesParser var_es) {
        if (i != -1)
            a(-84, (Class_r) null);
        y++;
        for (; ; ) {
            int i_13_ = var_es.readUnsignedByte(-9268);
            if (i_13_ == 0)
                break;
            a(i_13_, var_es, (byte) 105);
        }
    }

    final void a(int i) {
        if (((ww) this).O != null) {
            for (int i_14_ = 0; i_14_ < ((ww) this).O.length; i_14_ += 2) {
                if (((ww) this).O[i_14_] < ((ww) this).P)
                    ((ww) this).P = ((ww) this).O[i_14_];
                else if (((ww) this).x < ((ww) this).O[i_14_])
                    ((ww) this).x = ((ww) this).O[i_14_];
                if (((ww) this).O[i_14_ + 1] < ((ww) this).c)
                    ((ww) this).c = ((ww) this).O[i_14_ + 1];
                else if (((ww) this).O[i_14_ + 1] > ((ww) this).b)
                    ((ww) this).b = ((ww) this).O[i_14_ + 1];
            }
        }
        if (i >= -4)
            ((ww) this).f = null;
        k++;
    }

    static final void a(int i, int i_15_, int i_16_, int i_17_, int i_18_,
                        int i_19_) {
        m++;
        int i_20_ = i_18_ - i_19_;
        int i_21_ = i - i_15_;
        if (i_20_ == 0) {
            if (i_21_ != 0)
                qea.a(i, (byte) 1, i_16_, i_19_, i_15_);
        } else if (i_21_ == 0)
            mda.a((byte) 78, i_15_, i_18_, i_19_, i_16_);
        else if (i_17_ == 9761) {
            int i_22_ = (i_21_ << 12) / i_20_;
            int i_23_ = i_15_ - (i_19_ * i_22_ >> 12);
            int i_24_;
            int i_25_;
            if (i_19_ >= vaa.xb) {
                if (i_19_ > jga.v) {
                    i_25_ = jga.v;
                    i_24_ = (i_22_ * jga.v >> 12) + i_23_;
                } else {
                    i_24_ = i_15_;
                    i_25_ = i_19_;
                }
            } else {
                i_24_ = i_23_ + (vaa.xb * i_22_ >> 12);
                i_25_ = vaa.xb;
            }
            int i_26_;
            int i_27_;
            if (i_18_ < vaa.xb) {
                i_26_ = vaa.xb;
                i_27_ = i_23_ + (vaa.xb * i_22_ >> 12);
            } else if (jga.v < i_18_) {
                i_26_ = jga.v;
                i_27_ = i_23_ + (jga.v * i_22_ >> 12);
            } else {
                i_26_ = i_18_;
                i_27_ = i;
            }
            if (Class_md.h <= i_27_) {
                if (Class_db.o < i_27_) {
                    i_26_ = (Class_db.o - i_23_ << 12) / i_22_;
                    i_27_ = Class_db.o;
                }
            } else {
                i_26_ = (Class_md.h - i_23_ << 12) / i_22_;
                i_27_ = Class_md.h;
            }
            if (i_24_ >= Class_md.h) {
                if (Class_db.o < i_24_) {
                    i_24_ = Class_db.o;
                    i_25_ = (Class_db.o - i_23_ << 12) / i_22_;
                }
            } else {
                i_24_ = Class_md.h;
                i_25_ = (Class_md.h - i_23_ << 12) / i_22_;
            }
            ida.a(i_27_, i_26_, i_24_, false, i_16_, i_25_);
        }
    }

    final int a(byte i, int i_28_, int i_29_) {
        if (i != 26)
            return -66;
        u++;
        if (I == null)
            return i_29_;
        GameInPacketHandler var_hda = (GameInPacketHandler) I.a(-32748, (long) i_28_);
        if (var_hda == null)
            return i_29_;
        return ((GameInPacketHandler) var_hda).k;
    }

    public ww() {
        o = -1;
        ((ww) this).b = -2147483648;
        v = -1;
        A = -1;
        ((ww) this).x = -2147483648;
        ((ww) this).c = 2147483647;
        ((ww) this).z = -1;
        ((ww) this).B = true;
        ((ww) this).J = false;
        ((ww) this).L = -1;
        H = -1;
        ((ww) this).a = true;
        ((ww) this).e = 0;
        ((ww) this).D = new String[5];
        ((ww) this).C = -1;
        ((ww) this).P = 2147483647;
    }
}
