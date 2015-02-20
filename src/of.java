/* of - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class of
{
    static int a;
    static int[][] b;
    static int c;
    static int[] d = { 25000, 2000 };
    static int[] e;
    static boolean f = false;
    
    static final void a(int i) {
	vq.h = null;
	a++;
	ua.e = null;
	ek.w = null;
	pm.v = null;
	qfa.a = null;
	cba.f = null;
	if (i <= -35) {
	    pk.b = null;
	    fp.j = null;
	    od.ob = null;
	    io.V = null;
	    ir.b = null;
	    ak.e = null;
	    sp.s = null;
	    pv.j = null;
	    hu.c = null;
	    lh.k = null;
	    bq.e = null;
	    sfa.a = null;
	}
    }
    
    public of() {
	/* empty */
    }
    
    abstract int b(int i);
    
    abstract boolean c(int i);
    
    final boolean a(byte i) {
	c++;
	if (i != 9)
	    return true;
	if (!f(-30249) && !c(2000) && !e(2000))
	    return false;
	return true;
    }
    
    abstract ew a(boolean bool);
    
    abstract int d(int i);
    
    abstract void b(byte i);
    
    abstract boolean e(int i);
    
    public static void b(boolean bool) {
	if (bool == true) {
	    b = null;
	    d = null;
	    e = null;
	}
    }
    
    abstract void c(boolean bool);
    
    abstract boolean f(int i);
    
    static {
	e = new int[2];
    }
}
