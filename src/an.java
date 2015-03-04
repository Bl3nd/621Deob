/* an - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class an {

    int a;
    int b;
    int c;
    int d;
    int e;
    static GameInPacket incomingPacket3 = new GameInPacket(3, 6);
    int g;
    static int h;
    static GameInPacket incomingPacket81 = new GameInPacket(81, 1);

    public static int a(int i, boolean bool, int j, int id) {
        h++;
        hg hg = el.a(bool, (byte) 117, j);
        if (hg == null) {
            return 0;
        }
        if ((~id) == 0) {
            return 0;
        }
        int i1 = i;
        for (int item = 0; hg.amounts.length > item; item++) {
            if (hg.itemIDs[item] == id) {
                i1 += hg.amounts[item];
            }
        }
        return i1;
    }

    public static void nullLoader() {
        an.incomingPacket81 = null;
        incomingPacket3 = null;
    }

    public an() {
        /* empty */
    }
}
