/* fh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class fh
{
    static Color[] a = { new Color(9179409), new Color(16777215) };
    static int b;
    static int c;
    static GameInPacket incomingPacket6 = new GameInPacket(6, 6);
    
    public final String toString() {
	b++;
	throw new IllegalStateException();
    }
    
    fh(int i, int i_0_) {
	/* empty */
    }
    
    static final boolean a(boolean bool) {
	c++;
	try {
	    if (bool != true)
		a((byte) -68);
	    return GameInPacketHandler.parseIncomingPackets(-1);
	} catch (java.io.IOException ioexception) {
	    uca.dropClient(7);
	    return true;
	} catch (Exception exception) {
	    String string = ("T2 - " + (sw.currentGameInPacket == null ? -1 : sw.currentGameInPacket.getPacketID())
			     + "," + (ClientScript.gameInPacket == null ? -1 : ClientScript.gameInPacket.getPacketID())
			     + "," + (jt.incomingPacket != null ? jt.incomingPacket.getPacketID() : -1)
			     + " - " + ck.currentGameInPacketSize + "," + (bfa.thisPlayersRegionX + ((Entity) up.thisPlayer).regionLocalX[0])
			     + "," + (((Entity) up.thisPlayer).regionLocalY[0] + BytesParser.thisPlayersRegionY) + " - ");
	    for (int i = 0; ck.currentGameInPacketSize > i && i < 50; i++)
		string += ((BytesParser) faa.loginStream).bytes[i] + ",";
	    cea.a(string, -2, exception);
	    la.logout((byte) 114, false);
	    return true;
	}
    }
    
    public static void a(byte i) {
	a = null;
	if (i <= 25)
	    a(false);
	incomingPacket6 = null;
    }
}
