/* dl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dl
{
    static int a;
    long b;
    static Class_ae c = new Class_ae();
    static int d;
    private lm e;
    
    public static void a(int i) {
	c = null;
	if (i != 32165)
	    a(115);
    }
    
    dl(lm var_lm, long l, Class_cb[] class_cbs) {
	((dl) this).b = l;
	e = var_lm;
    }
    
    protected final void finalize() throws Throwable {
	a++;
	e.a(true, ((dl) this).b);
	super.finalize();
    }
}
