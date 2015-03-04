/* al - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class al extends rba {

    static int n;
    static oj oj;
    static int p;
    static int q;
    private int r = 0;

    public al(pl pl, jq jq) {
        super(pl, jq);
    }

    public static void a(int i, int index, int j, int k, int i1) {
        if (of.b != null) {
            of.b[i][index] = ~0xffffff | j;
        }
        if (uo.c != null) {
            uo.c[i][index] = (short) k;
        }
        if (qh.q != null) {
            qh.q[i][index] = (byte) i1;
        }
    }

    public final void a(boolean bool, int i) {
        if (i != 6621) {
            r = -5;
        }
        n++;
        int j = (this.g.b.a(baa.d, this.c.A(), 2) + this.g.h);
        int k = (this.g.e.a(Class_vb.r, this.c.ca(), -98) + this.g.g);
        this.c.a((float) (j + this.c.A() / 2), (float) (this.c.ca() / 2 + k), 4096, r);
        r += ((jq) this.g).o;
    }

    public static void nullLoader() {
        oj = null;
    }

    public static void a(int i, int j) {
        p++;
        kba.o.a(true, j);
    }
}
