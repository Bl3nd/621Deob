/* oda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GrandExchangeItem {

    private byte a;
    int itemID;
    int spent;
    static int d;
    static int e;
    int f;
    int total;
    int transferred;
    static int i;
    static GameOutPacket outgoingPacket21 = new GameOutPacket(21, 3);
    static short k = 32767;
    static int l;

    public final int a(int i) {
        d++;
        if (i != 2183) {
            outgoingPacket21 = null;
        }
        return 0x7 & a;
    }

    public static void a(int i, boolean bool) {
        if (bool) {
            if ((~Class_vb.u) != 0) {
                li.a(Class_vb.u, 0);
            }
            for (tt tt = (tt) ida.l.b((byte) 124); tt != null;
                 tt = (tt) ida.l.b(12561)) {
                if (!tt.isNextNode(-76)) {
                    tt = (tt) ida.l.b((byte) 124);
                    if (tt == null) {
                        break;
                    }
                }
                vm.a(false, true, false, tt);
            }
            Class_vb.u = -1;
            ida.l = new il(8);
            lh.a(1);
            Class_vb.u = nh.k;
            cv.a(false, (byte) -69);
            fda.a(0);
            ClientScriptHandler.a(Class_vb.u);
        }
        GrandExchangeItem.i++;
        Class_ub.U = false;
        op.username = Interface.password = "";
        Entity.cancel(false);
        da.e = -1;
        ah.b(true, Login.j);
        up.thisPlayer = new Player();
        up.thisPlayer.locX = 512 * Class_hc.e / 2;
        ((Entity) up.thisPlayer).regionLocalX[0] = Class_hc.e / 2;
        up.thisPlayer.locY = bw.v * 512 / 2;
        dg.gb = ada.N = 0;
        ((Entity) up.thisPlayer).regionLocalY[0] = bw.v / 2;
        if (i <= 27) {
            nulLLoader(-119);
        }
        if (ll.x == 2) {
            ada.N = uc.d << 9;
            dg.gb = pca.D << 9;
        } else {
            fi.a(-1202242076);
        }
        Class_ad.lighting(124);
    }

    public static void nulLLoader(int i) {
        outgoingPacket21 = null;
        if (i != 7) {
            a(-105, false);
        }
    }

    public final int a(boolean isSpent) {
        if (isSpent) {
            this.spent = 116;
        }
        e++;
        if ((a & 0x8) != 8) {
            return 0;
        }
        return 1;
    }

    public GrandExchangeItem() {
    /* empty */
    }

    public GrandExchangeItem(BytesParser bytesParser) {
        a = bytesParser.readByte(-20933);
        this.itemID = bytesParser.readShort(13111);
        this.f = bytesParser.readInt(74);
        this.total = bytesParser.readInt(67);
        this.transferred = bytesParser.readInt(98);
        this.spent = bytesParser.readInt(71);
    }
}
