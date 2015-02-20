/* hk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

public final class hk extends mca {

    static String operatingSystem;
    static int J;
    static String K;
    static String L;
    static int M;
    static int N;
    static int O;
    static int P;
    static qfa Q;
    static byte[][] R;
    static int loginStage;

    public static void nullLoader(int i) {
        if (i <= -77) {
            R = null;
            K = null;
            Q = null;
            operatingSystem = null;
            L = null;
        }
    }

    public hk() {
        super(1, true);
    }

    public static final void a(String string, int i) {
        J++;
        if (i != 1) {
            nullLoader(-108);
        }
        if (string != null) {
            if (string.startsWith("*")) {
                string = string.substring(1);
            }
            String string_ = kk.a(string, true);
            if (string_ != null) {
                for (int j = 0; j < rba.l; j++) {
                    String string_1 = lfa.f[j];
                    if (string_1.startsWith("*")) {
                        string_1 = string_1.substring(1);
                    }
                    string_1 = kk.a(string_1, true);
                    if (string_1 != null && string_1.equals(string_)) {
                        rba.l--;
                        for (int index = j; index < rba.l; index++) {
                            lfa.f[index] = lfa.f[index + 1];
                            nj.l[index] = nj.l[index + 1];
                            dt.Jb[index] = dt.Jb[index + 1];
                            di.f[index] = di.f[index + 1];
                            ObjectDef.rb[index] = ObjectDef.rb[index + 1];
                            df.f[index] = df.f[index + 1];
                        }
                        rda.h = tb.u;
                        fm.e++;
                        tba tba = jga.sendGameOutPacket(ou.outgoingPacket2, pca.isaac, (byte) -71);
                        ((tba) tba).loginStream.writeByte(cq.a(string, (byte) 2), (byte) -118);
                        ((tba) tba).loginStream.writeString(string, i ^ ~0x2b);
                        ud.a(tba, (byte) -36);
                        break;
                    }
                }
            }
        }
    }

    public final int[] a(int i, int j) {
        N++;
        int[] ints = ((mca) this).s.a(j, true);
        int unused = -86 / ((i - 81) / 36);
        if (((oca) ((mca) this).s).o) {
            int[][] ints1 = this.a(0, j, 0);
            int[] ints2 = ints1[0];
            int[] ints3 = ints1[1];
            int[] ints4 = ints1[2];
            for (int index = 0; fr.v > index; index++) {
                ints[index] = (ints2[index] - (-ints4[index] - ints3[index])) / 3;
            }
        }
        return ints;
    }

    public static final boolean a(int i, int j, int k, byte b, int i1) {
        if (b != 108) {
            return false;
        }
        M++;
        if ((tu.b[0][k][i1] & 0x2) != 0) {
            return true;
        }
        if ((tu.b[i][k][i1] & 0x10) != 0) {
            return false;
        }
        if (j == Class_g.a(i, i1, 0, k)) {
            return true;
        }
        return false;
    }

    public static final void c(byte b) {
        O++;
        ud ud = (ud) rv.o.a(b ^ 0x2a);
        if (b == 64) {
            for (/**/; ud != null; ud = (ud) rv.o.b((byte) 62)) {
                od od = ((ud) ud).v;
                if (((od) od).rb) {
                    ud.unlink(-90);
                    od.a(true);
                } else if (pm.currentTimedTicks >= ((od) od).ib) {
                    od.a(b - 64, nq.x);
                    if (((od) od).rb) {
                        ud.unlink(-84);
                    } else {
                        to.a(od, true);
                    }
                }
            }
        }
    }

    public static final boolean j(int i) {
        P++;
        vp vp = (vp) dl.c.a((int) 100);
        if (vp == null) {
            return false;
        }
        if (i != -25236) {
            return true;
        }
        for (int index = 0; index < ((vp) vp).s; index++) {
            if (((vp) vp).k[index] != null && ((vp) vp).k[index].f == 0) {
                return false;
            }
            if (((vp) vp).r[index] != null && ((vp) vp).r[index].f == 0) {
                return false;
            }
        }
        return true;
    }

    static {
        String string = "Unknown";
        try {
            string = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
			/* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
			/* empty */
        }
        operatingSystem = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
			/* empty */
        }
        L = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
			/* empty */
        }
        string.toLowerCase();
        string = "~/";
        try {
            string = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
			/* empty */
        }
        new File(string);
        Q = new qfa("", 15);
        loginStage = 0;
    }
}
