/* an - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class an
{
    int a;
    int b;
    int c;
    int d;
    int e;
    static GameInPacket incomingPacket3 = new GameInPacket(3, 6);
    int g;
    static int h;
    static GameInPacket incomingPacket81 = new GameInPacket(81, 1);
    
    static final int a(int i, boolean bool, int i_0_, int i_1_) {
	h++;
	hg var_hg = el.a(bool, (byte) 117, i_0_);
	if (var_hg == null)
	    return 0;
	if ((i_1_ ^ 0xffffffff) == 0)
	    return 0;
	int i_2_ = i;
	for (int i_3_ = 0; ((hg) var_hg).amounts.length > i_3_; i_3_++) {
	    if (((hg) var_hg).itemIDs[i_3_] == i_1_)
		i_2_ += ((hg) var_hg).amounts[i_3_];
	}
	return i_2_;
    }
    
    public static void a(byte i) {
	if (i == 19) {
	    an.incomingPacket81 = null;
	    incomingPacket3 = null;
	}
    }
    
    public an() {
	/* empty */
    }
}
