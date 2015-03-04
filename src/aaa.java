/* aaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class aaa {

    static int a = 0;
    static int b;
    static int c;
    static int d;
    static int e;
    private int f;
    static int g;
    static GameInPacket incomingPacket73 = new GameInPacket(73, -1);
    private il i;
    static int j;
    static Animable[][] animables;
    static int l;
    private je je = new je();
    static int n;
    static int o;
    static GameInPacket incomingPacket32 = new GameInPacket(32, 2);
    private int q;
    static int r;
    static rca rca = new rca();
    static int t;
    static int[] u = new int[14];

    public static long stringToLong(int index, String string) {
        d++;
        long l = 0L;
        int length = string.length();
        for (int count = index; length > count; count++) {
            l *= 37L;
            char c = string.charAt(count);
            if (c >= 'A' && c <= 'Z') {
                l += (long) (c - '@');
            } else if (c >= 'a' && c <= 'z') {
                l += (long) (c - 'a' + '\001');
            } else if (c >= '0' && c <= '9') {
                l += (long) (c - '0' + '\033');
            }
            if (l >= 177917621779460413L) {
                break;
            }
        }
        for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
            /* empty */
        }
        return l;
    }

    public static void nullLoader(int i) {
        rca = null;
        incomingPacket73 = null;
        if (i != -91)
            stringToLong(53, null);
        animables = null;
        u = null;
        incomingPacket32 = null;
    }

    public final Object a(gj gj) {
        g++;
        long l = gj.a(61);
        for (as as = (as) this.i.a(-32748, l); as != null; as = (as) this.i.c((byte) 115)) {
            if (as.gj.a(gj, 126)) {
                Object object = as.getObject(-9023);
                if (object == null) {
                    as.unlink(-54);
                    as.a((byte) -95);
                    f += as.t;
                } else {
                    if (!as.d((byte) -13)) {
                        je.a(75, as);
                        as.l = 0L;
                    } else {
                        at at = new at(gj, object, as.t);
                        this.i.a(at, (byte) -40, as.nodeID);
                        je.a(75, at);
                        at.l = 0L;
                        as.unlink(-72);
                        as.a((byte) -55);
                    }
                    return object;
                }
            }
        }
        return null;
    }

    public final void a(byte b) {
        for (as var_as = (as) je.d((byte) -127); var_as != null;
             var_as = (as) je.a(1252027233)) {
            if (var_as.d((byte) -125)) {
                var_as.unlink(b - 149);
                var_as.a((byte) -70);
                f += var_as.t;
            }
        }
        r++;
    }

    private void a(as as, int i) {
        if (i >= 3) {
            t++;
            if (as != null) {
                as.unlink(-43);
                as.a((byte) -69);
                f += as.t;
            }
        }
    }

    public final void a(Object object, gj gj) {
        j++;
        a(1, (byte) -58, gj, object);
    }

    private void a(int i, byte b, gj gj, Object object) {
        e++;
        if (i > q) {
            throw new IllegalStateException("s>cs");
        }
        a(true, gj);
        f -= i;
        while (f < 0) {
            as as = (as) je.b(-21957);
            a(as, 18);
        }
        at at = new at(gj, object, i);
        this.i.a(at, (byte) -46, gj.a(72));
        je.a(75, at);
        at.l = 0L;
        if (b >= -7) {
            nullLoader(-62);
        }
    }

    public final int b() {
        c++;
        return q;
    }

    private void a(boolean bool, gj gj) {
        b++;
        long l = gj.a(116);
        for (as as = (as) i.a(-32748, l); as != null;
             as = (as) i.c((byte) 120)) {
            if (as.gj.a(gj, 86)) {
                a(as, 100);
                break;
            }
        }
    }

    public final void a(int i, int j) {
        if (dca.P != null) {
            for (as as = (as) je.d((byte) -125); as != null; as = (as) je.a(1252027233)) {
                if (as.d((byte) -127)) {
                    if (as.getObject(-9023) == null) {
                        as.unlink(j ^ ~0x2e);
                        as.a((byte) -63);
                        f += as.t;
                    }
                } else if ((long) i < ++as.l) {
                    as as1 = dca.P.a(as, (byte) -120);
                    this.i.a(as1, (byte) -64, as.nodeID);
                    te.a(as, 2, as1);
                    as.unlink(j ^ ~0x1a);
                    as.a((byte) -69);
                }
            }
        }
        n++;
        if (j != 0) {
            je = null;
        }
    }

    public final int c() {
        l++;
        return f;
    }

    public final void d() {
        o++;
        je.c(1252027233);
        this.i.a(true);
        f = q;
    }

    public aaa(int i) {
        f = i;
        q = i;
        int j;
        for (j = 1; i > j + j; j += j) {
	        /* empty */
        }
        this.i = new il(j);
    }
}
