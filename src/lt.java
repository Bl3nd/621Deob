/* lt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lt
{
    static int a = 0;
    static float b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int rectValue = 0;
    static int[] h = new int[3];
    
    public final String toString() {
	d++;
	throw new IllegalStateException();
    }
    
    static final void a(boolean bool) {
	c++;
	if ((caa.I ^ 0xffffffff) != 0) {
	    hga.a(caa.I, -1, -1, false, -1);
	    caa.I = -1;
	}
	if (bool != false)
	    b = -1.7855922F;
    }
    
    static final boolean a(int i, int i_0_, int i_1_) {
	e++;
	if (i_0_ != 1024)
	    return true;
	if ((0x400 & i) == 0)
	    return false;
	return true;
    }
    
    public lt() {
	/* empty */
    }
    
    public static void a(byte i) {
	h = null;
	int i_2_ = -122 / ((39 - i) / 50);
    }
    
    static final void a(byte i, int i_3_) {
	f++;
	for (Node class_d = aea.il.b((byte) 124); class_d != null;
	     class_d = aea.il.b(12561)) {
	    if ((0xffffL & ((Node) class_d).nodeID >> 48) == (long) i_3_)
		class_d.unlink(-69);
	}
	if (i != 79)
	    a(-22, -36, -30);
    }
}
