/* kr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kr
{
    static Interface a = null;
    static int b;
    static int c;
    static int d;
    static String[] e;
    static int f;
    
    static final void a(pl var_pl, int i, int[] is, pl var_pl_0_) {
	if (is != null)
	    th.j = is;
	if (i < 76)
	    f = -54;
	d++;
	GameText.wb = var_pl_0_;
	lm.vh = var_pl;
    }
    
    static final void a(int i) {
	sr.U.a(18385);
	c++;
	gea.m.a(18385);
	up.D.a(18385);
	up.K.a(18385);
	if (i < 101)
	    e = null;
    }
    
    public static void b(int i) {
	a = null;
	if (i == 6407)
	    e = null;
    }
    
    static final int a(int i, byte i_1_) {
	b++;
	if (i == 6406)
	    return 1;
	if (i != 6409) {
	    if (i != 32841) {
		if (i == 6410)
		    return 2;
		if (i == 6407)
		    return 3;
		if (i == 6408)
		    return 4;
	    } else
		return 1;
	} else
	    return 1;
	if (i_1_ >= -45)
	    a(null, -110, null, null);
	throw new IllegalArgumentException("");
    }
}
