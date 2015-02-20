/* wl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wl
{
    static int a;
    static int b;
    int c;
    static lh d = new lh(16);
    static int e;
    static float f;
    static long g;
    
    final int a(byte i) {
	if (i != -114)
	    ((wl) this).c = -26;
	a++;
	return ((wl) this).c;
    }
    
    public static void a(int i) {
	d = null;
	if (i != -19211)
	    f = 1.1029164F;
    }
    
    wl(String string, int i) {
	((wl) this).c = i;
    }
    
    static final void a(pl var_pl, fa var_fa, int i) {
	SpecialOutPacket.c = var_pl;
	if (i == -27984) {
	    cj.e = var_fa;
	    b++;
	}
    }
    
    public final String toString() {
	e++;
	throw new IllegalStateException();
    }
}
