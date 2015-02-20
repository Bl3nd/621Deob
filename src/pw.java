/* pw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pw
{
    static int a;
    static byte[][] b;
    static GameInPacket incomingPacket79 = new GameInPacket(79, -1);
    
    public static void a(int i) {
	incomingPacket79 = null;
	b = null;
	if (i != 79)
	    a(-42);
    }
}
