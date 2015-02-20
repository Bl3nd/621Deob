/* Class_ad - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ad {
    private pl a;
    private tb b = new tb(64);
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h = 0;
    static int i;
    int j;
    static tb k = new tb(5);
    static int[] l = new int[4096];

    final void a(int i, int i_0_) {
        g++;
        synchronized (b) {
            if (i != 0) {
        /* empty */
            } else
                b.a(true, i_0_);
        }
    }

    final void a(int i) {
        if (i != -23401)
            a((byte) -12);
        e++;
        synchronized (b) {
            b.a(18385);
        }
    }

    static final void b(int i) {
        int i_1_ = 18 / ((i - 82) / 34);
        f++;
        hv.t = true;
    }

    final void a(byte i) {
        synchronized (b) {
            b.c((byte) 4);
            if (i <= 32)
                l = null;
        }
        c++;
    }

    public static void c(int i) {
        if (i == 16) {
            l = null;
            k = null;
        }
    }

    Class_ad(Class_rf class_rf, int i, pl var_pl) {
        a = var_pl;
        if (a == null)
            ((Class_ad) this).j = 0;
        else
            ((Class_ad) this).j = a.a(16, true);
    }

    final hga a(int configId, boolean bool) {
        Class_ad.i++;
        hga var_hga;
        synchronized (b) {
            var_hga = (hga) b.get((long) configId, (byte) 100);
        }
        if (var_hga != null)
            return var_hga;
        if (bool != true)
            k = null;
        byte[] is;
        synchronized (a) {
            is = a.b(configId, -123, 16);
        }
        var_hga = new hga();
        if (is != null)
            var_hga.a(new BytesParser(is), -1);
        synchronized (b) {
            b.put((long) configId, var_hga, 1);
        }
        return var_hga;
    }
}
