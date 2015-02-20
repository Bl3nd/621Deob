/* rc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rc
{
    static int a;
    static int b;
    static int c;
    static String d = null;
    static int e;
    
    public static void a(int i) {
	d = null;
	if (i != 0)
	    a(null, false);
    }
    
    static final boolean a(byte i, byte i_0_) {
	if (i > -79)
	    d = null;
	e++;
	int i_1_ = 0xff & i_0_;
	if (i_1_ == 0)
	    return false;
	if (i_1_ >= 128 && i_1_ < 160 && th.g[i_1_ - 128] == '\0')
	    return false;
	return true;
    }
    
    final int a(int i, int i_2_, int i_3_) {
	if (i_3_ > -82)
	    d = null;
	c++;
	int i_4_ = eh.height > i ? eh.height : i;
	if (this == oh.c)
	    return 0;
	if (this == tda.b)
	    return i_4_ - i_2_;
	if (lf.b == this)
	    return (i_4_ - i_2_) / 2;
	return 0;
    }
    
    public rc() {
	/* empty */
    }
    
    public final String toString() {
	a++;
	throw new IllegalStateException();
    }
    
    static final void a(Entity var_ni, boolean bool) {
	if (var_ni instanceof NPC) {
	    NPC class_ac = (NPC) var_ni;
	    if (((NPC) class_ac).npcDef != null)
		ee.a(class_ac, ((Animable) up.thisPlayer).height != ((Animable) class_ac).height,
		     (byte) -110);
	} else if (var_ni instanceof Player) {
	    Player var_qi = (Player) var_ni;
	    cc.a(((Animable) up.thisPlayer).height != ((Animable) var_qi).height, 6592, var_qi);
	}
	b++;
	if (bool != false)
	    a(-18);
    }
}
