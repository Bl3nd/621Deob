/* po - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class po implements sn
{
    static int a;
    static int b;
    static client c;
    static boolean d = true;
    private String e;
    static int f;
    static int g;
    private boolean h;
    
    public final int a(int i) {
	a++;
	int i_0_ = 113 / ((-55 - i) / 49);
	int i_1_ = rv.a((byte) -127, e);
	if (i_1_ >= 0 && i_1_ <= 100)
	    return i_1_;
	h = true;
	return 100;
    }
    
    final boolean b(byte i) {
	if (i != 25)
	    return false;
	f++;
	return h;
    }
    
    public final tj a(byte i) {
	if (i != -58)
	    return null;
	g++;
	return tj.tj2;
    }
    
    public static void b(int i) {
	if (i != 20285)
	    b((int) -6);
	c = null;
    }
    
    po(String string) {
	e = string;
    }
}
