/* Class_hc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_hc
{
    static int a;
    private pl b;
    static GameOutPacket c = new GameOutPacket(82, 6);
    int d;
    static int e;
    static float f;
    static int[] g = new int[1];
    
    static final void a(int i, boolean bool, int i_0_, pl var_pl, int i_1_,
			int i_2_, byte i_3_) {
	a++;
	if (i_1_ > 0) {
	    nj.m = bool;
	    ha.u = i_0_;
	    ifa.a = i_2_;
	    uaa.e = i;
	    Class_vb.s = var_pl;
	    pj.j = 1;
	    ISAAC.q = ou.g.c((int) -128) / i_1_;
	    if (ISAAC.q < 1)
		ISAAC.q = 1;
	} else
	    Class_b.a(bool, i_2_, i, var_pl, (byte) -73, i_0_);
	if (i_3_ < 103)
	    e = -4;
    }
    
    public static void a(boolean bool) {
	c = null;
	g = null;
	if (bool != false)
	    e = 58;
    }
    
    Class_hc(Class_rf class_rf, int i, pl var_pl) {
	new tb(64);
	b = var_pl;
	((Class_hc) this).d = b.a(15, true);
    }
    
    static {
	e = 104;
    }
}
