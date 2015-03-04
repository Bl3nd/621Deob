/* ffa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ffa extends mca {
    private int[] H;
    static int I;
    static int J;
    static lea K;
    static String[] L = new String[100];
    private int M = 0;
    static int N;
    private int O = 10;
    static int P;
    private int[] Q;
    static int R;
    private int S = 2048;

    final int[] a(int i, int j) {
        N++;
        int[] is = ((mca) this).s.a(j, true);
        int i_1_ = 18 % ((i - 81) / 36);
        if (((oca) ((mca) this).s).o) {
            int i_2_ = Class_i.i[j];
            if (M == 0) {
                int i_3_ = 0;
                for (int i_4_ = 0; i_4_ < O; i_4_++) {
                    if (i_2_ >= H[i_4_] && H[i_4_ + 1] > i_2_) {
                        if (Q[i_4_] > i_2_)
                            i_3_ = 4096;
                        break;
                    }
                }
                co.a(is, 0, fr.v, i_3_);
            } else {
                for (int i_5_ = 0; i_5_ < fr.v; i_5_++) {
                    int i_6_ = 0;
                    int i_7_ = 0;
                    int i_8_ = js.p[i_5_];
                    int i_9_ = M;
                    while_38_:
                    do {
                        do {
                            if (i_9_ != 1) {
                                if (i_9_ != 2) {
                                    if (i_9_ == 3)
                                        break;
                                    break while_38_;
                                }
                            } else {
                                i_6_ = i_8_;
                                break while_38_;
                            }
                            i_6_ = (i_8_ + i_2_ - 4096 >> 1) + 2048;
                            break while_38_;
                        } while (false);
                        i_6_ = (i_8_ - i_2_ >> 1) + 2048;
                    } while (false);
                    for (i_9_ = 0; O > i_9_; i_9_++) {
                        if (H[i_9_] <= i_6_ && H[i_9_ + 1] > i_6_) {
                            if (i_6_ < Q[i_9_])
                                i_7_ = 4096;
                            break;
                        }
                    }
                    is[i_5_] = i_7_;
                }
            }
        }
        return is;
    }

    /**
     * Called by the command (gc).
     * @param i
     */
    public static void gcContainer(int i) {
        Class_eb.p.a((byte) 30);
        I++;
        Class_ef.G.a(28804);
        Class_ae.n.a((byte) -106);
        ul.k.c(93);
        jm.p.a((byte) 82);
        laa.itemDefLoader.e(i ^ i);
        Class_ef.J.a((byte) -120);
        Class_ic.H.b(25313);
        bw.t.a(-15501);
        fj.t.a((byte) 88);
        hs.f.a(i - 4064);
        gda.d.a(-1);
        hq.a.a((byte) 127);
        GameInPacket.d.b(35);
        jba.b.a(i - 3983);
        hi.u.c((byte) 13);
        ps.a.b((byte) 56);
        lr.k.a((byte) -114);
        fu.e.a((byte) -113);
        aw.m.a((byte) 127);
        tba.b((int) -1);
        sf.b(false);
        vn.i(i - 4096);
        it.b((byte) 25);
        dfa.i((byte) 122);
        mga.o.c((byte) -128);
        gba.t.c((byte) -122);
        br.k.c((byte) -120);
        wa.C.c((byte) 105);
        ClientScriptHandler.tb_.c((byte) 95);
    }

    public ffa() {
        super(0, true);
    }

    public static void c(byte i) {
        if (i != -42)
            gcContainer(-86);
        L = null;
        K = null;
    }

    final void a(int i, BytesParser bytesParser, int j) {
        int i_11_ = j;
        while_39_:
        do {
            do {
                if (i_11_ != 0) {
                    if (i_11_ != 1) {
                        if (i_11_ == 2)
                            break;
                        break while_39_;
                    }
                } else {
                    O = bytesParser.readUnsignedByte(-9268);
                    break while_39_;
                }
                S = bytesParser.readShort(13111);
                break while_39_;
            } while (false);
            M = bytesParser.readUnsignedByte(i ^ ~0x2432);
        } while (false);
        if (i != 1)
            a(-81, (BytesParser) null, 113);
        P++;
    }

    final void b(int i) {
        J++;
        int i_12_ = -2 / ((i - 64) / 60);
        a(false);
    }

    private final void a(boolean bool) {
        R++;
        Q = new int[O + 1];
        int i = 0;
        H = new int[O + 1];
        int i_13_ = 4096 / O;
        int i_14_ = i_13_ * S >> 12;
        if (bool != false)
            Q = null;
        for (int i_15_ = 0; O > i_15_; i_15_++) {
            H[i_15_] = i;
            Q[i_15_] = i_14_ + i;
            i += i_13_;
        }
        H[O] = 4096;
        Q[O] = Q[0] + 4096;
    }

    static {
        K = new lea();
    }
}
