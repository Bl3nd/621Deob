/* Class_ec - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ec
{
    static int a;
    static int b;
    static int c;
    int d;
    
    public final String toString() {
	b++;
	throw new IllegalStateException();
    }
    
    static final boolean a(int i) {
	c++;
	if (i < 101)
	    return false;
	if (GameInPacket.l) {
	    try {
		if (((Boolean) rp.a(true, "showingVideoAd", vj.applet))
			.booleanValue())
		    return false;
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return true;
    }
    
    static final boolean a(int i, int i_0_, int i_1_) {
	a++;
	if (i != (0x10000 & i_0_) | Class_q.a(i_1_, 116, i_0_)
	    || eq.a(i_0_, i_1_, -109))
	    return true;
	if ((0x37 & i_1_) != 0 || !kl.a(i_0_, i ^ 0x37, i_1_))
	    return false;
	return true;
    }
    
    Class_ec(int i) {
	((Class_ec) this).d = i;
    }
}
