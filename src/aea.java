/* aea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Hashtable;

public final class aea extends tm {

    static GameInPacket incomingPacket99 = new GameInPacket(99, 7);
    static int B;
    static int C;
    int D;
    static il il = new il(512);
    static bc bc;
    static int G = 0;
    static Hashtable hashtable = new Hashtable();

    public aea(ct ct, rc rc, int i, int j, int k, int i1, int j1, int k1, int i2, int j2, int k2, int i3, int j3, int k3, int i4, int j4) {
        super(ct, rc, i, j, k, i1, j1, k1, i2, j2, k2, i3, j3, k3, i4);
        this.D = j4;
    }

    public static char a(byte b, char c) {
        C++;
        if (b > -29) {
            a((byte) 26, '\uff9b');
        }
        char c1 = c;
        while_11_:
        do {
            while_10_:
            do {
                while_9_:
                do {
                    while_8_:
                    do {
                        while_7_:
                        do {
                            while_6_:
                            do {
                                while_5_:
                                do {
                                    while_4_:
                                    do {
                                        while_3_:
                                        do {
                                            do {
                                                if (c1 != ' ' && c1 != '\u00a0' && c1 != '_' && c1 != '-') {
                                                    if (c1 != '[' && c1 != ']' && c1 != '#') {
                                                        if (c1 != '\u00e0' && (c1 != '\u00e1') && (c1 != '\u00e2') && (c1 != '\u00e4')
                                                                && (c1 != '\u00e3') && (c1 != '\u00c0') && (c1 != '\u00c1') && (c1 != '\u00c2')
                                                                && (c1 != '\u00c4') && (c1 != '\u00c3')) {
                                                            if ((c1 != '\u00e8') && (c1 != '\u00e9') && (c1 != '\u00ea') && (c1 != '\u00eb')
                                                                    && (c1 != '\u00c8') && (c1 != '\u00c9') && (c1 != '\u00ca') && (c1 != '\u00cb')) {
                                                                if ((c1 != '\u00ed') && (c1 != '\u00ee') && (c1 != '\u00ef') && (c1 != '\u00cd')
                                                                        && (c1 != '\u00ce') && (c1 != '\u00cf')) {
                                                                    if ((c1 != '\u00f2') && (c1 != '\u00f3') && (c1 != '\u00f4') && (c1 != '\u00f6')
                                                                            && (c1 != '\u00f5') && (c1 != '\u00d2') && (c1 != '\u00d3')
                                                                            && (c1 != '\u00d4') && (c1 != '\u00d6') && (c1 != '\u00d5')) {
                                                                        if ((c1 != '\u00f9') && c1 != '\u00fa' && c1 != '\u00fb' && c1 != '\u00fc'
                                                                                && c1 != '\u00d9' && c1 != '\u00da' && c1 != '\u00db'
                                                                                && c1 != '\u00dc') {
                                                                            if (c1 != '\u00e7' && c1 != '\u00c7') {
                                                                                if (c1 != '\u00ff' && c1 != '\u0178') {
                                                                                    if (c1 != '\u00f1' && c1 != '\u00d1') {
                                                                                        if (c1 == '\u00df') {
                                                                                            break while_10_;
                                                                                        }
                                                                                        break while_11_;
                                                                                    }
                                                                                } else {
                                                                                    break while_8_;
                                                                                }
                                                                                break while_9_;
                                                                            }
                                                                        } else {
                                                                            break while_6_;
                                                                        }
                                                                        break while_7_;
                                                                    }
                                                                } else {
                                                                    break while_4_;
                                                                }
                                                                break while_5_;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                        break while_3_;
                                                    }
                                                } else {
                                                    return '_';
                                                }
                                                return c;
                                            } while (false);
                                            return 'a';
                                        } while (false);
                                        return 'e';
                                    } while (false);
                                    return 'i';
                                } while (false);
                                return 'o';
                            } while (false);
                            return 'u';
                        } while (false);
                        return 'c';
                    } while (false);
                    return 'y';
                } while (false);
                return 'n';
            } while (false);
            return 'b';
        } while (false);
        return Character.toLowerCase(c);
    }

    public static void nullLoader(int i) {
        il = null;
        if (i != -236) {
            nullLoader(-24);
        }
        incomingPacket99 = null;
        hashtable = null;
        bc = null;
    }

    public final wea a(int i) {
        if (i <= 38) {
            G = 49;
        }
        B++;
        return ha.s;
    }
}
