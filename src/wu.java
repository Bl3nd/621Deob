/* wu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wu extends Interactable
{
    static boolean g = false;
    static int[] h = { 1, 4 };
    int i;
    static int j;
    
    public static void a(int i) {
	h = null;
	if (i != -3127)
	    g = false;
    }
    
    static final void c(int i) {
	if (lg.r.m()) {
	    lg.r.c(ru.canvas);
	    ClientScript.a(true);
	    lg.r.d(ru.canvas);
	    lg.r.a(ru.canvas);
	} else
	    ur.setTKVersion(on.performance, true);
	j++;
	fda.a(0);
	if (i != 4)
	    c(52);
    }
    
    wu(int i) {
	((wu) this).i = i;
    }
}
