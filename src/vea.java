/* vea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vea
{
    static pk a;
    static int b;
    static String[] shortMonthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			  "Aug", "Sep", "Oct", "Nov", "Dec" };
    static int d;
    
    public static void a(boolean bool) {
	if (bool != true)
	    a(23, 97);
	a = null;
	shortMonthNames = null;
    }
    
    static final boolean a(int i, int i_0_) {
	b++;
	if (i != 5)
	    a(118, -113);
	if (i_0_ != 1 && i_0_ != 3 && i_0_ != 5)
	    return false;
	return true;
    }
    
    static {
	a = new pk("LOCAL", 4);
    }
}
