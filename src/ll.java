/* ll - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ll extends lp
{
    static int r = 1406;
    static int s;
    static boolean t = false;
    static int u;
    static int[] v = new int[64];
    static boolean w = false;
    static int x;
    
    final void b(int i, int i_0_, boolean bool, int i_1_) {
	s++;
	int i_2_ = this.b((byte) -8) * ((iea) ((lp) this).d).i / 10000;
	lg.r.J(i_1_, i_0_ + 2, i_2_, ((iea) ((lp) this).d).e - 2,
	       ((kk) (kk) ((lp) this).d).s, 0);
	lg.r.J(i_1_ + i_2_, i + i_0_, ((iea) ((lp) this).d).i - i_2_,
	       ((iea) ((lp) this).d).e - 2, 0, 0);
    }
    
    final void a(int i, int i_3_, boolean bool, int i_4_) {
	int i_5_ = 108 % ((i - 50) / 49);
	u++;
	lg.r.c(i_3_ - 2, i_4_, ((iea) ((lp) this).d).i + 4,
	       ((iea) ((lp) this).d).e + 2, ((kk) (kk) ((lp) this).d).r, 0);
	lg.r.c(i_3_ - 1, i_4_ + 1, ((iea) ((lp) this).d).i + 2,
	       ((iea) ((lp) this).d).e, 0, 0);
    }
    
    public static void c(byte i) {
	if (i == -83)
	    v = null;
    }
    
    ll(pl var_pl, pl var_pl_6_, kk var_kk) {
	super(var_pl, var_pl_6_, (iea) var_kk);
    }
}
