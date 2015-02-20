/* dh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dh
{
    static int a;
    static GameOutPacket b = new GameOutPacket(68, 8);
    static wea c = new wea(5, 1);
    static boolean d = false;
    static float e;
    
    public static void a(byte i) {
	c = null;
	int i_0_ = 6 % ((i + 52) / 53);
	b = null;
    }
    
    static final ct[] b(byte i) {
	a++;
	if (i != 87)
	    c = null;
	return new ct[] { ml.g, jga.r, Class_lc.I };
    }
}
