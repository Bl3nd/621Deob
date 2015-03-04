/* rca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rca
{
    static int a = 0;
    static int b;
    static int c;
    static int d;
    static Interface e = null;
    static int f;
    
    static final int a(int i) {
	f++;
	if (i != 0)
	    e = null;
	return Class_is.h++;
    }
    
    public static void b(int i) {
	e = null;
	if (i != 0)
	    e = null;
    }
    
    public rca() {
	/* empty */
    }
    
    static final void c(int i) {
	if (i != 6870)
	    a(-11);
	dd.I.a(true);
	d++;
	SpecialOutPacket.i1.a(true);
    }
    
    static final int a(boolean bool, byte i) {
	c++;
	if (th.j == null)
	    return 0;
	if (!bool && ir.d != null)
	    return 2 * th.j.length;
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < th.j.length; i_1_++) {
	    int i_2_ = th.j[i_1_];
	    if (GameText.wb.g(1912, i_2_))
		i_0_++;
	    if (lm.vh.g(1912, i_2_))
		i_0_++;
	}
	if (i != -15)
	    a = 56;
	return i_0_;
    }
    
    public final String toString() {
	b++;
	throw new IllegalStateException();
    }
}
