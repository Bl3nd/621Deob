/* ao - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ao extends ua {

    static int f;
    ls ls;
    static int h = -1;
    static int i;
    static int j;
    static int k = 0;
    static GameInPacket incomingPacket12 = new GameInPacket(12, -1);
    static int m;

    public static la a(boolean bool, int i, Class_r class_r, int j) {
        m++;
        bq bq = wo.a((byte) -56, i, class_r, bool);
        if (j != 0) {
            return null;
        }
        if (bq == null) {
            return null;
        }
        return bq.g;
    }

    public static void a(int i, int j, int k, byte b) {
        j = cs.g.N * j >> 8;
        f++;
        if (b != -123) {
            h = 97;
        }
        if ((~i) != 0 || Class_jc.ib) {
            if ((~i) != 0 && (i != ws.G || !ir.a(true)) && j != 0 && !Class_jc.ib) {
                Class_hc.a(j, false, i, mq.pl, k, 0, (byte) 117);
            }
        } else {
            ku.a(true);
        }
        ws.G = i;
    }

    public static void b() {
        j++;
        for (ri ri = (ri) iq.g.a(86); ri != null; ri = (ri) iq.g.b((byte) 122)) {
            bi bi = ri.s;
            if (bi.mb < pm.currentTimedTicks) {
                ri.unlink(-61);
                bi.a((byte) 105);
            } else if (bi.tb <= pm.currentTimedTicks) {
                if (bi.ub > 0) {
                    NPCNode npcNode = (NPCNode) uo.a.a(-32748, (long) (bi.ub - 1));
                    if (npcNode != null) {
                        NPC npc = npcNode.npc;
                        if (npc.locX >= 0 && 512 * Class_hc.e > npc.locX && npc.locY >= 0 && bw.v * 512 > npc.locY) {
                            bi.a(npc.locY, npc.locX, 0, pm.currentTimedTicks, (Class_u.b(npc.locX, bi.height, -20214, npc.locY) - bi.jb));
                        }
                    }
                }
                if (bi.ub < 0) {
                    int inScreenIndex = -bi.ub - 1;
                    Player player;
                    if (inScreenIndex == ih.n) {
                        player = up.thisPlayer;
                    } else {
                        player = Class_fc.playersInScreen[inScreenIndex];
                    }
                    if (player != null && player.locX >= 0 && player.locX < Class_hc.e * 512 && player.locY >= 0 && player.locY < 512 * bw.v) {
                        bi.a(player.locY, player.locX, 0, pm.currentTimedTicks, (Class_u.b(player.locX, bi.height, -20214, player.locY) - bi.jb));
                    }
                }
                bi.a(nq.x, 0);
                to.a(bi, true);
            }
        }
    }

    public static void nullLoader() {
        incomingPacket12 = null;
    }

    public ao(en en, int i, int j, byte[] buf) {
        this.ls = en.a(buf, i, j, NPCDef.hb, false, (byte) 73);
        this.ls.a((byte) -81, false, false);
    }

    public ao(en en, int i, int j, int[] buf) {
        this.ls = en.a(i, false, j, buf, (byte) 65);
        this.ls.a((byte) -81, false, false);
    }

    public static int a(float f, float f1, float f2) {
        ao.i++;
        float f3 = f2 < 0.0F ? -f2 : f2;
        float f4 = f < 0.0F ? -f : f;
        float f5 = !(f1 < 0.0F) ? f1 : -f1;
        if (f3 < f4 && f5 < f4) {
            if (!(f > 0.0F)) {
                return 1;
            }
            return 0;
        }
        if (f3 < f5 && f5 > f4) {
            if (!(f1 > 0.0F)) {
                return 3;
            }
            return 2;
        }
        if (f2 > 0.0F) {
            return 4;
        }
        return 5;
    }
}
