/* hq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hq
{
    static aw a;
    static float b;
    static int c;
    static int d;
    static int e;
    static aga f;
    
    static final boolean a(int i, int i_0_) {
	e++;
	if (i == 22 || i == 47 || i == 18 || i == 51 || i == 1009)
	    return true;
	if (i == 19 || i == 1008)
	    return true;
	if (i_0_ != 21922)
	    return true;
	return false;
    }
    
    static final pl a(boolean bool, int i, int i_1_, int i_2_) {
	d++;
	if (i_1_ != 1000000)
	    b = -1.0759982F;
	lf var_lf = null;
	if (or.f != null)
	    var_lf = new lf(i_2_, or.f, Connection.cvs[i_2_], 1000000);
	GPIPlayer.pdas[i_2_] = cd.y.a(i_2_, Class_jg.N, var_lf, (byte) 109);
	GPIPlayer.pdas[i_2_].d((byte) -95);
	return new pl(GPIPlayer.pdas[i_2_], bool, i);
    }
    
    public static void a(int i) {
	int i_3_ = 120 / ((i - 30) / 62);
	a = null;
	f = null;
    }
    
    static final float a(float f, int i, int i_4_, float f_5_, float f_6_) {
	c++;
	int i_7_ = -82 % ((44 - i) / 62);
	float[] fs = vaa.rb[i_4_];
	return f_5_ * fs[2] + (fs[0] * f_6_ + fs[1] * f);
    }
}
