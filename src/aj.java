/* aj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aj
{
    static fca a = new fca();
    static int b;
    static int c;
    static int d = 0;
    
    static final void a(int i, int i_0_) {
	b++;
	int i_1_ = pm.currentTimedTicks - Class_b.f;
	if (i_1_ >= 100) {
	    ja.Cc = dj.o = -1;
	    ll.x = 1;
	} else {
	    int i_2_ = (int) pm.F;
	    if (dk.y >> 8 > i_2_)
		i_2_ = dk.y >> 8;
	    if (Class_ug.W[4] && i_2_ < me.m[4] + 128)
		i_2_ = me.m[4] + 128;
	    int i_3_ = (int) qw.n + sca.j & i_0_;
	    faa.a((i_2_ >> 3) * 3 + 600 << 2, Class_k.N, i_2_, vaa.L, i_3_,
		  117, i,
		  Class_u.b(((Animable) up.thisPlayer).locX, vo.clientHeight, i_0_ ^ ~0x710a,
			    ((Animable) up.thisPlayer).locY) - 200);
	    float f = 1.0F - ((float) ((-i_1_ + 100)
				       * ((100 - i_1_) * (-i_1_ + 100)))
			      / 1000000.0F);
	    ada.N = (int) ((float) rk.s + f * (float) (ada.N - rk.s));
	    dg.gb = (int) ((float) (dg.gb - js.n) * f + (float) js.n);
	    us.e = (int) ((float) (us.e - dr.v) * f + (float) dr.v);
	    mba.e = (int) ((float) lca.w + (float) (mba.e - lca.w) * f);
	    int i_4_ = gn.G - tea.l;
	    if (i_4_ > 8192)
		i_4_ -= 16384;
	    else if (i_4_ < -8192)
		i_4_ += 16384;
	    gn.G = (int) ((float) tea.l + (float) i_4_ * f);
	    gn.G &= 0x3fff;
	}
    }
    
    public static void a(int i) {
	if (i != -27669)
	    a(75, -89);
	a = null;
    }
}
