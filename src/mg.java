/* mg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mg extends nj
{
    static int q;
    static GameOutPacket r = new GameOutPacket(1, -1);
    static int s;
    static int t = -1;
    
    static final void b(int i, int i_0_) {
	q++;
	uaa.e = 0;
	ha.u = -1;
	ISAAC.q = i_0_;
	ifa.a = -1;
	nj.m = false;
	pj.j = 1;
	int i_1_ = -106 % ((-26 - i) / 54);
	Class_vb.s = null;
    }
    
    static final boolean c(int i, int i_2_) {
	s++;
	if (i != -1)
	    return true;
	if (i_2_ != 0)
	    return false;
	return true;
    }
    
    public static void a(boolean bool) {
	if (bool != true)
	    c(80, 61);
	r = null;
    }
}
