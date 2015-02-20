/* lea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lea
{
    static int a;
    static int b;
    static int c;
    static float d;
    
    public final String toString() {
	a++;
	throw new IllegalStateException();
    }
    
    static final void setClickMenuOption(int i, boolean bool, int i_0_, int i_1_,
			boolean bool_2_, int i_3_, int i_4_, long l,
			String objectForOption, int i_5_, String option) {
		b++;
		if (!gea.n && mu.j < 500) {
		    i_3_ = (i_3_ ^ 0xffffffff) == 0 ? da.e : i_3_;
		    bfa var_bfa = new bfa(option, objectForOption, i_3_, i_5_, i_1_, l, i, i_0_, bool_2_, bool);
		    oba.I.b(var_bfa, (byte) 93);
		    int i_7_ = 10 % ((83 - i_4_) / 43);
		    mu.j++;
		}
    }
    
    static final void a(boolean bool, boolean bool_8_, boolean bool_9_) {
	c++;
	if (bool == false) {
	    if (bool_9_) {
		Class_ag.l--;
		if (Class_ag.l == 0)
		    ji.j = null;
	    }
	    if (bool_8_) {
		taa.h--;
		if (taa.h == 0)
		    vq.m = null;
	    }
	}
    }
    
    public lea() {
	/* empty */
    }
}
