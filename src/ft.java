/* ft - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ft extends pp
{
    static wl LIVE = new wl("LIVE", 0);
    static long currentTime;
    boolean u;
    static int[] v = new int[1];
    boolean w;
    volatile boolean x = true;
    
    abstract int b(byte i);
    
    public static void c(byte i) {
	if (i != -93)
	    currentTime = -100L;
	v = null;
	LIVE = null;
    }
    
    abstract byte[] d(byte i);
    
    public ft() {
	/* empty */
    }
}
