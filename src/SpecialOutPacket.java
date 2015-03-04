/* ju - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class SpecialOutPacket {

    static int a;
    static int b;
    static pl c;
    static Class_ae d = new Class_ae();
    int packetID;
    static int toString;
    static int g;
    static il i1 = new il(8);

    public static void nullLoader() {
        c = null;
        d = null;
        i1 = null;
    }

    public final String toString() {
        toString++;
        throw new IllegalStateException();
    }

    public static void a(byte b) {
        if (b > -102) {
            c = null;
        }
        SpecialOutPacket.b++;
        int i = (int) (34.46 * (double) Class_hc.e);
        i <<= 2;
        if (lg.r.o()) {
            i += 512;
        }
        lg.r.GA(200, i);
    }

    public static void a(da da, int x, sd sd, int i, int y, int j) {
        a++;
        if (da != null && j == 26219) {
            sd.a(x, true, da.J(), da.K(), da.OA(), y, da.l(), da.KA(), da.H(), i, da.za());
        }
    }

    public static void b(byte b) {
        g++;
        int[] buf = new int[laa.itemDefLoader.g];
        int i = 0;
        for (int j = 0; laa.itemDefLoader.g > j; j++) {
            ItemDef itemDef = laa.itemDefLoader.d(12388, j);
            if (itemDef.B >= 0 || itemDef.J >= 0) {
                buf[i++] = j;
            }
        }
        kq.U = new int[i];
        int index = 0;
        for (/**/; index < i; index++) {
            kq.U[index] = buf[index];
        }
    }

    public SpecialOutPacket(int packetID, int packetSize) {
        this.packetID = packetID;
    }
}
