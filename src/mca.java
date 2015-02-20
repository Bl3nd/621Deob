/* mca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class mca extends Node {
    static int k;
    static Class_gb l = new Class_gb();
    boolean m;
    static int var_n;
    static int o;
    static int p;
    static int q;
    static int r;
    oca s;
    static int t;
    int u;
    static int v;
    mca[] w;
    static int x;
    static float y;
    static int z;
    static int A;
    td B;
    static int C;
    static GameOutPacket outgoingPacket13;
    static int[] E
            = {0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0,
            0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96,
            98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22,
            23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39,
            54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64,
            0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232,
            89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0,
            0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int F;
    static GameOutPacket outgoingPacket54;

    void a(int i) {
        if (((mca) this).m) {
            ((mca) this).s.a((byte) 96);
            ((mca) this).s = null;
        } else {
            ((mca) this).B.c(-85);
            ((mca) this).B = null;
        }
        z++;
        if (i <= 42) {
            ((mca) this).m = false;
        }
    }

    int a(byte b) {
        int unused = -2 % ((b - 67) / 56);
        var_n++;
        return -1;
    }

    int[] a(int i, int j) {
        int unused = -5 % ((81 - i) / 36);
        A++;
        throw new IllegalStateException("This operation does not have nullLoader monochrome output");
    }

    public static final short[] a(int i, short[] shorts) {
        q++;
        if (shorts == null) {
            return null;
        }
        short[] shorts1 = new short[shorts.length];
        co.a(shorts, 0, shorts1, i, shorts.length);
        return shorts1;
    }

    public static final void teleport(int i, int height, int y, int x) {
        if (i == 1024908230) {
            C++;
            String string = ("tele " + height + "," + (x >> 6) + "," + (y >> 6) + "," + (0x3f & x) + "," + (y & 0x3f));
            System.out.println(string);
            bj.applyClientCommand(i - 1024908230, false, string, true);
        }
    }

    void a(int i, byte b, int j) {
        int unused = 81 % ((b + 21) / 35);
        t++;
        int k = ((mca) this).u != 255 ? ((mca) this).u : i;
        if (!((mca) this).m) {
            ((mca) this).B = new td(k, i, j);
        } else {
            ((mca) this).s = new oca(k, i, j);
        }
    }

    int b(byte b) {
        int unused = 3 % ((10 - b) / 46);
        F++;
        return -1;
    }

    int[][] a(int i, boolean bool) {
        if (bool != true) {
            return null;
        }
        p++;
        throw new IllegalStateException("This operation does not have nullLoader colour output");
    }

    public final int[][] a(int i, int j, int k) {
        if (k != 0) {
            a(4, (BytesParser) null, 31);
        }
        o++;
        if (!((mca) ((mca) this).w[i]).m) {
            return ((mca) this).w[i].a(j, true);
        }
        int[] buf = ((mca) this).w[i].a(-78, j);
        int[][] ints = new int[3][];
        ints[2] = buf;
        ints[1] = buf;
        ints[0] = buf;
        return ints;
    }

    void b(int i) {
        int unused = 64 / ((64 - i) / 60);
        x++;
    }

    void a(int i, BytesParser bytesParser, int j) {
        if (i != 1) {
            outgoingPacket13 = null;
        }
        v++;
    }

    public static void nullLoader(int i) {
        if (i != 0) {
            E = null;
        }
        l = null;
        outgoingPacket54 = null;
        E = null;
        outgoingPacket13 = null;
    }

    public final int[] a(int i, boolean bool, int index) {
        r++;
        if (bool != false) {
            teleport(-44, 101, -1, -53);
        }
        if (((mca) ((mca) this).w[index]).m) {
            return ((mca) this).w[index].a(120, i);
        }
        return ((mca) this).w[index].a(i, true)[0];
    }

    protected mca(int index, boolean bool) {
        ((mca) this).m = bool;
        ((mca) this).w = new mca[index];
    }

    static {
        outgoingPacket13 = new GameOutPacket(13, 3);
        outgoingPacket54 = new GameOutPacket(54, 7);
    }
}
