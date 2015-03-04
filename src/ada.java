/* ada - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ada extends mca {

    static int H;
    private int I;
    private int J;
    private int K;
    private int[] L = new int[3];
    static pl pl;
    static int N;
    static int O;
    private int P;
    static int Q;

    public final void a(int i, BytesParser bytesParser, int j) {
        Q++;
        int k = j;
        while_2_:
        do {
            while_1_:
            do {
                while_0_:
                do {
                    do {
                        if (k != 0) {
                            if (k != 1) {
                                if (k != 2) {
                                    if (k != 3) {
                                        if (k == 4) {
                                            break while_1_;
                                        }
                                        break while_2_;
                                    }
                                } else {
                                    break;
                                }
                                break while_0_;
                            }
                        } else {
                            I = bytesParser.readShort(13111);
                            break while_2_;
                        }
                        J = bytesParser.readShort(13111);
                        break while_2_;
                    } while (false);
                    K = bytesParser.readShort(13111);
                    break while_2_;
                } while (false);
                P = bytesParser.readShort(i ^ 0x3336);
                break while_2_;
            } while (false);
            int i1 = bytesParser.readTribyte(i - 2);
            L[2] = uca.a(i1, 255) >> 12;
            L[0] = uca.a(267386880, i1 << 4);
            L[1] = uca.a(65280, i1) >> 4;
        } while (false);
        if (i != 1) {
            nullLoader(-128);
        }
    }

    public static void nullLoader(int i) {
        pl = null;
        if (i != 0) {
            N = -49;
        }
    }

    public final int[][] a(int i, boolean bool) {
        O++;
        int[][] buf = this.B.a(i, -103);
        if (this.B.p) {
            int[][] buf1 = this.a(0, i, 0);
            int[] buf2 = buf1[0];
            int[] buf3 = buf1[1];
            int[] buf4 = buf1[2];
            int[] buf5 = buf[0];
            int[] buf6 = buf[1];
            int[] buf7 = buf[2];
            for (int j = 0; j < fr.v; j++) {
                int k = buf2[j];
                int i1 = k - L[0];
                if (i1 < 0) {
                    i1 = -i1;
                }
                if (I < i1) {
                    buf5[j] = k;
                    buf6[j] = buf3[j];
                    buf7[j] = buf4[j];
                } else {
                    int j1 = buf3[j];
                    i1 = j1 - L[1];
                    if (i1 < 0) {
                        i1 = -i1;
                    }
                    if (i1 > I) {
                        buf5[j] = k;
                        buf6[j] = j1;
                        buf7[j] = buf4[j];
                    } else {
                        int k1 = buf4[j];
                        i1 = k1 - L[2];
                        if (i1 < 0) {
                            i1 = -i1;
                        }
                        if (i1 > I) {
                            buf5[j] = k;
                            buf6[j] = j1;
                            buf7[j] = k1;
                        } else {
                            buf5[j] = k * P >> 12;
                            buf6[j] = j1 * K >> 12;
                            buf7[j] = J * k1 >> 12;
                        }
                    }
                }
            }
        }
        return buf;
    }

    public ada() {
        super(1, false);
        K = 4096;
        I = 409;
        P = 4096;
        J = 4096;
    }
}
