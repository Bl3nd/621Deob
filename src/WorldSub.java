/* iw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class WorldSub extends he {

    public int l = -1;
    public String m;
    public static int n = 0;
    public int worldID;
    public static Interface[] interfaces;
    public static int q;
    public String activity;
    public static int s;

    public static boolean a(int i, int dummy) {
        q++;
        if ((i & 0x100) == 0) {
            return false;
        }
        return true;
    }

    public static void nullLoader() {
        interfaces = null;
    }

    public final sw d(byte b) {
        s++;
        if (b <= 120) {
            d((byte) 43);
        }
        return ida.i[this.b];
    }
}
