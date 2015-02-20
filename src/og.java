/* og - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class og extends Interactable
{
    pba[] g;
    static int h;
    static GameOutPacket i = new GameOutPacket(79, 8);
    Animable j;
    
    final boolean a(Class_r class_r, int i, int i_0_, int i_1_) {
	if (i != 0)
	    ((og) this).j = null;
	h++;
	if (((og) this).g != null) {
	    for (int i_2_ = 0; i_2_ < ((og) this).g.length; i_2_++) {
		if (((og) this).g[i_2_].a(i_1_, i_0_)
		    && ((og) this).j.a(i_1_, i_0_, class_r, 9678))
		    return true;
	    }
	}
	return false;
    }
    
    public static void a(int i) {
	if (i > -79)
	    a(17);
	og.i = null;
    }
}
