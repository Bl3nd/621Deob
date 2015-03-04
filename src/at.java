/* at - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class at extends as {

    static int B;
    static int C;
    static int D;
    static int E;
    static int F;
    private Object object;
    static int H;
    static ki ki = new ki();
    static rc rc;
    static wa[] was = new wa[14];

    public final boolean d(byte i) {
        H++;
        return false;
    }

    public static void a(String string, String string1, int i, int j, int k, String string2, String string3, byte b, String string4) {
        D++;
        if (b <= 99) {
            nullLoader(68);
        }
        sc sc = he.d[99];
        for (int index = 99; index > 0; index--) {
            he.d[index] = he.d[index - 1];
        }
        if (sc != null) {
            sc.a(string3, string1, string4, string2, i, j, k, false, string);
        } else {
            sc = new sc(i, j, string4, string2, string, string3, k, string1);
        }
        pl.f++;
        aea.G = tb.u;
        he.d[0] = sc;
    }

    public static void nullLoader(int i) {
        if (i != 27843) {
            a(null, null, -24, 82, -42, null, null, (byte) -28, null);
        }
        was = null;
        rc = null;
        ki = null;
    }

    public final Object getObject(int i) {
        C++;
        return object;
    }

    public static void f() {
        lm.Kh.ra(dm.a * ((float) cs.g.db * 0.1F + 0.7F));
        B++;
        lm.Kh.VA(kw.v, LoginStream.Qb, bq.k, (float) (bl.k << 2), (float) (hp.C << 2), (float) (Class_i.l << 2));
        lm.Kh.a(dr.e);
    }

    public static boolean a(int i, byte b) {
        if (b >= -77) {
            return false;
        }
        E++;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public at(gj gj, Object object, int i) {
        super(gj, i);
        this.object = object;
    }

    public static void a(int i, int j, int k, dfa dfa) {
        vf vf = lh.a(i, j, k);
        if (vf != null) {
            vf.m = dfa;
            int index = Class_q.b == wr.D ? 1 : 0;
            if (dfa.g((byte) 115)) {
                if (dfa.e((byte) 23)) {
                    lm.Nh[index][fg.a[index]++] = dfa;
                } else {
                    aaa.animables[index][baa.l[index]++] = dfa;
                }
            } else {
                InputStreamSub_1.d[index][cc.f[index]++] = dfa;
            }
        }
    }
}
