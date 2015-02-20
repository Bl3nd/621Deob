/* sea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sea
{
    static int[] a;
    static int b = 13156520;
    static GameInPacket smallInterfaceConfigGameInPacket;
    static volatile boolean d;
    static int e;
    
    static final void a(byte i, String string) {
	e++;
	if (n.j != null) {
	    if (i < 73)
		b = -8;
	    kba.r++;
	    tba var_tba = jga.sendGameOutPacket(jga.o, pca.isaac, (byte) 88);
	    ((tba) var_tba).loginStream.writeByte(cq.a(string, (byte) 2), (byte) -114);
	    ((tba) var_tba).loginStream.writeString(string, -23);
	    ud.a(var_tba, (byte) -36);
	}
    }
    
    public static void a(int i) {
	if (i == 0) {
	    a = null;
	    smallInterfaceConfigGameInPacket = null;
	}
    }
    
    static {
	a = new int[] { 0, -1, 0, 1 };
	smallInterfaceConfigGameInPacket = new GameInPacket(14, 5);
	d = true;
    }
}
