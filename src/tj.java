/* tj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tj
{
    static tj tj3 = new tj();
    static int b;
    static int c;
    static int d;
    static tj tj = new tj();
    static tj tj1 = new tj();
    static tj tj2 = new tj();
    static Interface h = null;
    static rca i = new rca();
    
    static final boolean a(int i, int i_0_, int i_1_) {
	b++;
	if (i_0_ != 55)
	    b(-21);
	if ((i_1_ & 0x800) == 0 || (0x37 & i) == 0)
	    return false;
	return true;
    }
    
    public static void a(int i) {
	h = null;
	tj.i = null;
	tj = null;
	tj3 = null;
	tj1 = null;
	if (i != -1743)
	    tj2 = null;
	tj2 = null;
    }
    
    public tj() {
	/* empty */
    }
    
    static final Class_vb b(int i) {
	d++;
	if (kca.n == null || Class_fc.d == null)
	    return null;
	Class_fc.d.a((byte) -104, kca.n);
	if (i != 2048)
	    a(66);
	Class_vb class_vb = (Class_vb) Class_fc.d.b(i ^ 0x85f);
	if (class_vb == null)
	    return null;
	ww var_ww = kca.a.a(((Class_vb) class_vb).o, i ^ 0x83e);
	if (var_ww == null || !((ww) var_ww).h || !var_ww.a(kca.h, false))
	    return Class_q.b(-126);
	return class_vb;
    }
    
    public final String toString() {
	c++;
	throw new IllegalStateException();
    }
}
