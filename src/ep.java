/* ep - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.qr;

final class ep extends qo implements fl
{
    private int f;
    private IDirect3DVolumeTexture g;
    private int h;
    private int i;
    
    public final void a(int i) {
	((ep) this).c.a(this, true);
	if (i != 9258)
	    g = null;
    }
    
    ep(gaa var_gaa, Class_ec class_ec, int i, int i_0_, int i_1_, byte[] is) {
	super(var_gaa, class_ec, bt.g, false, i_0_ * (i * i_1_));
	f = i;
	this.i = i_0_;
	h = i_1_;
	g = ((gaa) ((ep) this).c).Hg.a(i, i_0_, i_1_, 1, 0,
				       gaa.a(class_ec, ((ep) this).d, true),
				       1);
	PixelBuffer pixelbuffer = ((gaa) ((ep) this).c).Lg;
	int i_2_ = g.LockBox(0, 0, 0, 0, i, i_0_, i_1_, 0, pixelbuffer);
	if (qr.a(i_2_, -2005530519)) {
	    int i_3_ = f * ((Class_ec) ((ep) this).e).d;
	    int i_4_ = this.i * i_3_;
	    int i_5_ = pixelbuffer.getSlicePitch();
	    if (i_5_ == i_4_)
		pixelbuffer.put(is, 0, 0, h * (this.i * i_3_));
	    else {
		int i_6_ = pixelbuffer.getRowPitch();
		if (i_6_ == i_3_) {
		    for (int i_7_ = 0; h > i_7_; i_7_++)
			pixelbuffer.put(is, i_7_ * i_4_, i_7_ * i_5_, i_4_);
		} else {
		    for (int i_8_ = 0; i_8_ < h; i_8_++) {
			for (int i_9_ = 0; i_9_ < this.i; i_9_++)
			    pixelbuffer.put(is, i_8_ * i_4_ + i_3_ * i_9_,
                        i_9_ * i_6_ + i_5_ * i_8_, i_3_);
		    }
		}
	    }
	    g.UnlockBox(0);
	}
    }
    
    public final void a(mv var_mv, int i) {
	super.a(var_mv, i);
    }
    
    final IDirect3DBaseTexture c(int i) {
	if (i != -13997)
	    c(81);
	return g;
    }
}
