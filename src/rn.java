/* rn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rn
{
    int a;
    int[] b;
    static int c;
    static int d;
    static int[] e = new int[5];
    int[] f;
    static int g;
    
    static final int a(byte i) {
	g++;
	synchronized (bd.j) {
	    if (i != 24)
		e = null;
	    return bd.j.a((byte) 116);
	}
    }
    
    public static void a(int i) {
	e = null;
	if (i != 0)
	    e = null;
    }
    
    rn(int i) {
	((rn) this).a = i;
	((rn) this).f = new int[((rn) this).a];
	((rn) this).b = new int[((rn) this).a];
    }
    
    static {
	d = 0;
	c = 0;
    }
}
