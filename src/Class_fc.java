/* Class_fc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_fc
{
    static pl a;
    int b;
    int c;
    static sq d;
    int e;
    static Player[] playersInScreen = new Player[2048];
    int g;
    static int[] h;
    
    public static void a(byte i) {
	playersInScreen = null;
	if (i < 104)
	    a((byte) -75);
	a = null;
	d = null;
	h = null;
    }
    
    public Class_fc() {
	/* empty */
    }
    
    static {
	d = new sq();
	h = new int[] { 32, 39, 44, 47 };
    }
}
