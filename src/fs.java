/* fs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fs
{
    boolean a;
    static int b;
    hh c;
    static int d;
    hh e;
    boolean f;
    static int g;
    
    final boolean a(int i) {
	d++;
	if (i < 20)
	    a(59);
	if (!((fs) this).a || ((fs) this).f)
	    return false;
	return true;
    }
    
    final void b(int i) {
	g++;
	if (i == 23331) {
	    if (((fs) this).e != null)
		((fs) this).e.b(-21271);
	    ((fs) this).a = false;
	}
    }
    
    fs(boolean bool) {
	((fs) this).f = bool;
    }
}
