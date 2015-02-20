/* iq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class iq
{
    byte[] a;
    short[] b;
    static int plainFont;
    static int d;
    short[] e;
    static int f;
    static Class_ae g;
    static int h;
    static int i = 0;
    static int j;
    short[] k;
    
    static final void a(boolean bool) {
	if (bool != true)
	    a('\uff94', false);
	for (int i = 0; i < 100; i++)
	    he.d[i] = null;
	f++;
	pl.f = 0;
    }
    
    static final boolean a(char c, boolean bool) {
	if (bool != true)
	    a(false);
	h++;
	if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z'))
	    return false;
	return true;
    }
    
    public static void b(boolean bool) {
	if (bool != false)
	    a(false);
	g = null;
    }
    
    static {
	g = new Class_ae();
    }
}
