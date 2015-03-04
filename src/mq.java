/* mq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class mq {

    public static pl pl;
    public static int putNpcId;
    public static float c;
    public static boolean[][] d;
    public static int e;

    public static void nullLoader() {
        pl = null;
        d = null;
    }

    public static void a(int i, Entity entity, int j) {
        e++;
        if (entity.Ab != null) {
            int k = entity.Ab[j + 1];
            if (k != entity.yb) {
                entity.yc = 0;
                entity.yb = k;
                entity.ic = 0;
                entity.W = 1;
                entity.Hb = 0;
                entity.Kc = entity.Nc;
                if (entity.yb != -1) {
                    qga.a(entity.height, Class_ef.J.c(i ^ ~0x1a86, entity.yb), entity.locX, entity.locY, 82, entity.yc, entity == up.thisPlayer);
                }
            }
        }
    }

    public static int putNpcId(int npcId) {
        putNpcId++;
        return 0x7f & npcId;
    }

    public mq() {
        /* empty */
    }
}
