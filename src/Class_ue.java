/* Class_ue - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_ue
{
    static int a;
    static byte[][] b;
    static long c = 0L;
    static int d;
    static int e = -1;
    /*synthetic*/ static Class f;
    
    static final void a(int i) {
	ei.a(11, -103);
	int i_0_ = -83 % ((-55 - i) / 40);
	d++;
	ns.c((byte) -58);
	System.gc();
    }
    
    public static void b(int i) {
	if (i != 0)
	    a(83);
	b = null;
    }
    
    static final boolean a(String string, int i) {
	a++;
	if (i > -8)
	    e = -41;
	return bi.a(string, 120, f != null ? f : (f = a("ka")));
    }
    
    abstract sp a(int i, sp var_sp);
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
