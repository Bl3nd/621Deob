/* hs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hs
{
    int a;
    int b;
    static int c;
    int d;
    int e;
    static wca f;
    int g;
    int h;
    int i;
    int j;
    static int k;
    static int l;
    int m;
    static long n = -1L;
    int o;
    int p;
    int q;
    static GameInPacket incomingPacket92 = new GameInPacket(92, -1);
    static pk modeWhere;
    
    static final void a(int i, byte i_0_, boolean bool) {
	if (i_0_ > -13)
	    a(-34, (byte) 11, false);
	l++;
	hg var_hg = el.a(bool, (byte) 28, i);
	if (var_hg != null) {
	    for (int i_1_ = 0; ((hg) var_hg).itemIDs.length > i_1_; i_1_++) {
		((hg) var_hg).itemIDs[i_1_] = -1;
		((hg) var_hg).amounts[i_1_] = 0;
	    }
	}
    }
    
    final boolean a(hs var_hs_2_, int i) {
	k++;
	if (((hs) var_hs_2_).a == ((hs) this).a
	    && ((hs) var_hs_2_).q == ((hs) this).q
	    && ((hs) var_hs_2_).i == ((hs) this).i)
	    return true;
	if (i > -125)
	    return true;
	return false;
    }
    
    public static void a(boolean bool) {
	if (bool != false)
	    a(25, (byte) 11, true);
	modeWhere = null;
	f = null;
	incomingPacket92 = null;
    }
    
    public hs() {
	/* empty */
    }
}
