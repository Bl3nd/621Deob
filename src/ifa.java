/* ifa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ifa
{
    static int a;
    static GameInPacket incomingPacket64 = new GameInPacket(64, 0);
    static short c = 256;
    
    public static void a(boolean bool) {
	incomingPacket64 = null;
	if (bool != true)
	    c = (short) 18;
    }
}
