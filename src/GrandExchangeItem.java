/* oda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GrandExchangeItem
{
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
    
    final int a(int i) {
	d++;
	if (i != 2183)
	    outgoingPacket21 = null;
	return 0x7 & a;
    }
    
    static final void a(int i, boolean bool) {
	if (bool) {
	    if ((Class_vb.u ^ 0xffffffff) != 0)
		li.a(Class_vb.u, (int) 0);
	    for (tt var_tt = (tt) ida.l.b((byte) 124); var_tt != null;
		 var_tt = (tt) ida.l.b(12561)) {
		if (!var_tt.g(-76)) {
		    var_tt = (tt) ida.l.b((byte) 124);
		    if (var_tt == null)
			break;
		}
		vm.a(false, true, false, var_tt);
	    }
	    Class_vb.u = -1;
	    ida.l = new il(8);
	    lh.a((int) 1);
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
	((Animable) up.thisPlayer).locX = 512 * Class_hc.e / 2;
	((Entity) up.thisPlayer).regionLocalX[0] = Class_hc.e / 2;
	((Animable) up.thisPlayer).locY = bw.v * 512 / 2;
	dg.gb = ada.N = 0;
	((Entity) up.thisPlayer).regionLocalY[0] = bw.v / 2;
	if (i <= 27)
	    b(-119);
	if (ll.x == 2) {
	    ada.N = uc.d << 9;
	    dg.gb = pca.D << 9;
	} else
	    fi.a(-1202242076);
	Class_ad.b(124);
    }
    
    public static void b(int i) {
	outgoingPacket21 = null;
	if (i != 7)
	    a(-105, false);
    }
    
    final int a(boolean bool) {
	if (bool != false)
	    ((GrandExchangeItem) this).spent = 116;
	e++;
	if ((a & 0x8) != 8)
	    return 0;
	return 1;
    }
    
    public GrandExchangeItem() {
	/* empty */
    }
    
    GrandExchangeItem(BytesParser var_es) {
	a = var_es.readByte(-20933);
	((GrandExchangeItem) this).itemID = var_es.readShort(13111);
	((GrandExchangeItem) this).f = var_es.readInt(74);
	((GrandExchangeItem) this).total = var_es.readInt(67);
	((GrandExchangeItem) this).transferred = var_es.readInt(98);
	((GrandExchangeItem) this).spent = var_es.readInt(71);
    }
}
