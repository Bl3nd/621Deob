/* oe - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class oe
{
    int a;
    static int b;
    static Class_ue c = mp.a((int) -1);
    uj d;
    static short e = 1;
    static GameInPacket npcUpdateGameInPacket = new GameInPacket(68, -2);
    int[] g;
    
    public static void a(int i) {
	c = null;
	if (i > 66)
	    npcUpdateGameInPacket = null;
    }
    
    static final boolean a(int i, int i_0_, int i_1_) {
	b++;
	if (i != 68)
	    return true;
	return ((wg.a(i_1_, i_0_, false) | ew.a(i_0_, i ^ 0x45, i_1_)
		 | tfa.a((byte) 87, i_1_, i_0_))
		& Class_ob.a(i_1_, (byte) 92, i_0_));
    }
    
    public oe() {
	/* empty */
    }
}
