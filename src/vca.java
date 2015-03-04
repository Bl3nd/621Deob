/* vca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vca {
    int a;
    static int b;
    byte c;
    static int d;
    boolean e;
    byte f;
    byte g;
    boolean h;
    byte i;
    boolean j;
    static int k;
    static int selectAutoWorld;
    boolean m;
    byte n;
    int o;
    boolean p;
    byte q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    short v;
    byte w;
    boolean x;

    public static void selectAutoWorld(byte i) {
        if (i > -25) {
            a(31, (byte) 107);
        }
        selectAutoWorld++;
        if (nda.signlink.r && (~Class_kb.o.worldID) != 0) {
            ee.switchWorld(Class_kb.o.worldID, Class_kb.o.lobbyAddress, 55);
        }
    }

    static final int a(int i, byte i_0_) {
        d++;
        int i_1_ = 75 % ((i_0_ - 54) / 46);
        if (i == 16711935)
            return -1;
        return lg.a(121, i);
    }

    public vca() {
    /* empty */
    }
}
