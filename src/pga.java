/* pga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pga
{
    static long a;
    static int b;
    static int c;
    static int d;
    static int e;
    static vfa f;
    static pl g;
    static oj h;
    
    static final void a(int i, boolean bool) {
	e++;
	qba var_qba = ofa.a(3, i, (byte) 97);
	if (bool == true)
	    var_qba.i(0);
    }
    
    static final boolean a(int i, int i_0_) {
	if (i != -66)
	    a(73, false);
	c++;
	if (i_0_ != 7 && i_0_ != 8 && i_0_ != 9)
	    return false;
	return true;
    }
    
    static final ar a(int i, boolean bool, qj var_qj, int i_1_, byte[] is,
		      int i_2_, int i_3_, int i_4_) {
	b++;
	if (i_1_ <= 86)
	    return null;
	if (((qj) var_qj).pg || ar.a(i_2_, (byte) 98) && ar.a(i, (byte) 98))
	    return new ar(var_qj, 3553, i_4_, i_2_, i, bool, is, i_3_);
	if (((qj) var_qj).vf)
	    return new ar(var_qj, 34037, i_4_, i_2_, i, bool, is, i_3_);
	return new ar(var_qj, i_4_, i_2_, i, dfa.a(i_2_, 128), dfa.a(i, 128),
		      is, i_3_);
    }
    
    public static void a(int i) {
	h = null;
	g = null;
	f = null;
	if (i != -26723)
	    h = null;
    }
}
