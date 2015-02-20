/* paa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.qr;

final class paa extends qo implements oq
{
    private int f;
    private IDirect3DCubeTexture g;
    
    paa(gaa var_gaa, int i, boolean bool, int[][] is) {
	super(var_gaa, nda.h, bt.g, bool && ((gaa) var_gaa).Kg, 6 * (i * i));
	f = i;
	if (!((paa) this).b)
	    g = ((gaa) ((paa) this).c).Hg.a(f, 1, 0, 21, 1);
	else
	    g = ((gaa) ((paa) this).c).Hg.a(f, 0, 1024, 21, 1);
	PixelBuffer pixelbuffer = ((gaa) ((paa) this).c).Lg;
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    int i_1_ = g.LockRect(i_0_, 0, 0, 0, f, f, 0, pixelbuffer);
	    if (qr.a(i_1_, -2005530519)) {
		int i_2_ = pixelbuffer.getRowPitch();
		if (4 * f == i_2_)
		    pixelbuffer.a(is[i_0_], 0, 0, f * f);
		else {
		    for (int i_3_ = 0; i_3_ < f; i_3_++)
			pixelbuffer.a(is[i_0_], i_3_ * f, i_2_ * i_3_, f);
		}
		g.UnlockRect(i_0_, 0);
	    }
	}
    }
    
    final IDirect3DBaseTexture c(int i) {
	if (i != -13997)
	    return null;
	return g;
    }
    
    public final void a(int i) {
	((paa) this).c.a(-104, this);
	if (i != 9258)
	    g = null;
    }
    
    public final void a(mv var_mv, int i) {
	super.a(var_mv, i);
    }
}
