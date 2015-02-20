/* gm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gm
{
    boolean a;
    nba b;
    static World world;
    static int d;
    static int e;
    static int f;
    nba g;
    boolean h;
    
    static final boolean a(int i, int i_0_, int i_1_) {
	e++;
	if (i_0_ != 0)
	    return true;
	if ((i & 0x800) == 0 || (i_1_ & 0x37) == 0)
	    return false;
	return true;
    }
    
    final boolean a(byte i) {
	int i_2_ = -125 % ((i - 84) / 35);
	f++;
	if (!((gm) this).a || ((gm) this).h)
	    return false;
	return true;
    }
    
    final void a(int i) {
	if (((gm) this).b != null)
	    ((gm) this).b.b(-21271);
	d++;
	((gm) this).a = false;
	if (i != 55)
	    ((gm) this).b = null;
    }
    
    public static void a(boolean bool) {
	world = null;
	if (bool != false)
	    world = null;
    }
    
    gm(boolean bool) {
	((gm) this).h = bool;
    }
}
