/* mq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class mq
{
    static pl a;
    static int b;
    static float c;
    static boolean[][] d;
    static int e;
    
    public static void a(int i) {
	a = null;
	d = null;
	if (i != 0)
	    c = -1.3738092F;
    }
    
    static final void a(int i, Entity var_ni, int i_0_) {
	e++;
	if (((Entity) var_ni).Ab != null) {
	    int i_1_ = ((Entity) var_ni).Ab[i_0_ + 1];
	    if (i_1_ != ((Entity) var_ni).yb) {
		((Entity) var_ni).yc = 0;
		((Entity) var_ni).yb = i_1_;
		((Entity) var_ni).ic = 0;
		((Entity) var_ni).W = 1;
		((Entity) var_ni).Hb = 0;
		((Entity) var_ni).Kc = ((Entity) var_ni).Nc;
		if (((Entity) var_ni).yb != -1)
		    qga.a(((Animable) var_ni).height,
			  Class_ef.J.c(i ^ ~0x1a86, ((Entity) var_ni).yb),
			  ((Animable) var_ni).locX, ((Animable) var_ni).locY, 82,
			  ((Entity) var_ni).yc, var_ni == up.thisPlayer);
	    }
	}
	if (i != -6855)
	    a = null;
    }
    
    static final int a(int i, int i_2_) {
	b++;
	if (i != 24231)
	    return 16;
	return 0x7f & i_2_;
    }
    
    public mq() {
	/* empty */
    }
}
