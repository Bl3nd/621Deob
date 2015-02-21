/* mi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class NPCNode extends Node {

    static boolean k = true;
    NPC npc;
    static int m;

    public static void a(int i, int j) {
        m++;
        if (gf.a((byte) 111, j)) {
            Interface[] interfaces = aa.o[j];
            if (i >= -87) {
                a(-9, 6);
            }
            for (int index = 0; interfaces.length > index; index++) {
                Interface interface_ = interfaces[index];
                if (interface_ != null) {
                    interface_.R = 0;
                    interface_.rc = 1;
                    interface_.s = 0;
                }
            }
        }
    }

    public NPCNode(NPC npc_) {
        this.npc = npc_;
    }
}
