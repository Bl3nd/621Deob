/* laa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class laa
{
    static int a;
    private qj b;
    static ItemDefLoader itemDefLoader;
    static int d;
    long e;
    static int[] f;
    
    public static void a(boolean bool) {
	itemDefLoader = null;
	if (bool == true)
	    f = null;
    }
    
    protected final void finalize() throws Throwable {
	d++;
	b.a(((laa) this).e, 33);
	super.finalize();
    }
    
    laa(qj var_qj, long l, af[] var_afs) {
	((laa) this).e = l;
	b = var_qj;
    }
}
