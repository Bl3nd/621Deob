/* vr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vr
{
    static int a;
    static Class_i[] b;
    
    public static void a(byte i) {
	if (i == -119)
	    b = null;
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_) {
	i_1_ <<= 3;
	i_0_ <<= 3;
	i <<= 3;
	a++;
	qw.n = (float) i_0_;
	pm.F = (float) i_1_;
	int i_3_ = 95 / ((i_2_ + 61) / 63);
	if (ll.x == 2) {
	    GPIPlayer.e = i;
	    gn.G = i_0_;
	    mba.e = i_1_;
	}
	Class_kf.a(5126);
	mo.F = true;
    }
}
