/* ft - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ft extends pp
{
    static wl s = new wl("LIVE", 0);
    static long t;
    boolean u;
    static int[] v = new int[1];
    boolean w;
    volatile boolean x = true;
    
    abstract int b(byte i);
    
    public static void c(byte i) {
	if (i != -93)
	    t = -100L;
	v = null;
	s = null;
    }
    
    abstract byte[] d(byte i);
    
    public ft() {
	/* empty */
    }
}
