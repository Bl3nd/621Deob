/* al - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class al extends rba
{
    static int n;
    static oj o;
    static int p;
    static int q;
    private int r = 0;
    
    al(pl var_pl, jq var_jq) {
	super(var_pl, (qga) var_jq);
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	if (of.b != null)
	    of.b[i][i_0_] = ~0xffffff | i_1_;
	if (uo.c != null)
	    uo.c[i][i_0_] = (short) i_2_;
	if (qh.q != null)
	    qh.q[i][i_0_] = (byte) i_3_;
    }
    
    public final void a(boolean bool, int i) {
	if (i != 6621)
	    r = -5;
	n++;
	int i_4_ = (((qga) ((rba) this).g).b.a(baa.d, ((rba) this).c.A(), 2)
		    + ((qga) ((rba) this).g).h);
	int i_5_
	    = (((qga) ((rba) this).g).e.a(Class_vb.r, ((rba) this).c.ca(), -98)
	       + ((qga) ((rba) this).g).g);
	((rba) this).c.a((float) (i_4_ + ((rba) this).c.A() / 2),
			 (float) (((rba) this).c.ca() / 2 + i_5_), 4096, r);
	r += ((jq) (jq) ((rba) this).g).o;
    }
    
    public static void c(int i) {
	o = null;
	if (i != 2)
	    q = 89;
    }
    
    static final void a(int i, int i_6_) {
	if (i != 0)
	    a(41, -84, 64, 0, 60);
	p++;
	kba.o.a(true, i_6_);
    }
}
