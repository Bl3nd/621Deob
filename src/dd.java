/* dd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dd extends mca
{
    static int H;
    static il I = new il(8);
    static float J;
    static int K;
    static int L;
    
    final int[] a(int i, int j) {
	H++;
	int i_1_ = 84 / ((81 - i) / 36);
	return js.p;
    }
    
    static final boolean a(boolean bool, int i, int i_2_, int i_3_, int i_4_,
			   int i_5_, int i_6_) {
	K++;
	if (bool != false)
	    return false;
	int i_7_ = i_5_ + i_6_;
	int i_8_ = i_4_ + i_2_;
	int i_9_ = i + i_3_;
	if (!cda.a(i_8_, i_8_, i_9_, 26403, i_3_, i_9_, i_7_, i_8_, i_5_,
		   i_5_))
	    return false;
	if (!cda.a(i_8_, i_8_, i_9_, 26403, i_3_, i_3_, i_7_, i_8_, i_7_,
		   i_5_))
	    return false;
	if (dl.d <= i_5_) {
	    if (!cda.a(i_8_, i_8_, i_9_, 26403, i_9_, i_3_, i_7_, i_4_, i_7_,
		       i_7_))
		return false;
	    if (!cda.a(i_8_, i_4_, i_3_, 26403, i_9_, i_3_, i_7_, i_4_, i_7_,
		       i_7_))
		return false;
	} else {
	    if (!cda.a(i_8_, i_8_, i_9_, 26403, i_9_, i_3_, i_5_, i_4_, i_5_,
		       i_5_))
		return false;
	    if (!cda.a(i_8_, i_4_, i_3_, 26403, i_9_, i_3_, i_5_, i_4_, i_5_,
		       i_5_))
		return false;
	}
	if (sw.g > i_3_) {
	    if (!cda.a(i_8_, i_8_, i_3_, 26403, i_3_, i_3_, i_7_, i_4_, i_5_,
		       i_5_))
		return false;
	    if (!cda.a(i_8_, i_4_, i_3_, 26403, i_3_, i_3_, i_7_, i_4_, i_7_,
		       i_5_))
		return false;
	} else {
	    if (!cda.a(i_8_, i_8_, i_9_, 26403, i_9_, i_9_, i_7_, i_4_, i_5_,
		       i_5_))
		return false;
	    if (!cda.a(i_8_, i_4_, i_9_, 26403, i_9_, i_9_, i_7_, i_4_, i_7_,
		       i_5_))
		return false;
	}
	return true;
    }
    
    public dd() {
	super(0, true);
    }
    
    static final void i(int i) {
	tp.b = bfa.A = gd.f = ml.j = i;
	L++;
    }
    
    public static void c(byte i) {
	I = null;
	if (i <= 18)
	    J = 0.5022329F;
    }
}
