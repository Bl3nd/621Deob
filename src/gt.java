/* gt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.qr;

final class gt extends qo implements ls
{
    private int f;
    boolean g;
    private int h;
    private IDirect3DTexture i;
    boolean j;
    
    public final int b(int i) {
	if (i != -3537)
	    return -118;
	return h;
    }
    
    public final float a(float f, byte i) {
	if (i != -59)
	    ((gt) this).j = false;
	return f / (float) h;
    }
    
    public final boolean a(boolean bool) {
	if (bool != true)
	    return false;
	return true;
    }
    
    public final void a(int i, byte i_0_, int i_1_, int[] is, int i_2_,
			int i_3_, int i_4_, int i_5_) {
	if (nda.h != ((gt) this).e || bt.g != ((gt) this).d)
	    throw new RuntimeException();
	PixelBuffer pixelbuffer = ((gaa) ((gt) this).c).Lg;
	int i_6_ = this.i.LockRect(0, i_2_, i_5_, i_3_, i_4_, 0, pixelbuffer);
	if (qr.a(i_6_, -2005530519)) {
	    int i_7_ = pixelbuffer.getRowPitch();
	    if (i_7_ != 4 * i_3_ || i_3_ != i_1_) {
		for (int i_8_ = 0; i_8_ < i_4_; i_8_++)
		    pixelbuffer.a(is, i_1_ * i_8_ + i, i_8_ * i_7_, i_3_);
	    } else
		pixelbuffer.a(is, i, 0, i_4_ * i_3_);
	    this.i.UnlockRect(0);
	}
	if (i_0_ != 75)
	    f = -78;
    }
    
    public final void a(mv var_mv, int i) {
	super.a(var_mv, i);
    }
    
    public final float a(boolean bool, float f) {
	if (bool)
	    return 1.6255823F;
	return f / (float) this.f;
    }
    
    gt(gaa var_gaa, Class_ec class_ec, int i, int i_9_, boolean bool,
       byte[] is, int i_10_, int i_11_) {
	super(var_gaa, class_ec, bt.g, bool && ((gaa) var_gaa).Fg, i_9_ * i);
	if (!((gaa) ((gt) this).c).Ag) {
	    f = dfa.a(i, 128);
	    h = dfa.a(i_9_, 128);
	} else {
	    f = i;
	    h = i_9_;
	}
	if (!bool)
	    this.i = ((gaa) ((gt) this).c).Hg
			 .a(f, h, 1, 0, gaa.a(((gt) this).e, bt.g, true), 1);
	else
	    this.i
		= ((gaa) ((gt) this).c).Hg
		      .a(f, h, 0, 1024, gaa.a(((gt) this).e, bt.g, true), 1);
	PixelBuffer pixelbuffer = ((gaa) ((gt) this).c).Lg;
	int i_12_ = this.i.LockRect(0, 0, 0, i, i_9_, 0, pixelbuffer);
	if (qr.a(i_12_, -2005530519)) {
	    if (0 == i_11_)
		i_11_ = i;
	    i_11_ *= ((Class_ec) ((gt) this).e).d;
	    i *= ((Class_ec) ((gt) this).e).d;
	    int i_13_ = pixelbuffer.getRowPitch();
	    if (i != i_13_ || i != i_11_) {
		for (int i_14_ = 0; i_14_ < i_9_; i_14_++)
		    pixelbuffer.a(is, i_10_ + i_14_ * i_11_, i_14_ * i_13_, i);
	    } else
		pixelbuffer.a(is, i_10_, 0, i_9_ * i);
	    this.i.UnlockRect(0);
	}
    }
    
    public final void a(int i, byte[] is, Class_ec class_ec, int i_15_,
			int i_16_, int i_17_, int i_18_, int i_19_,
			int i_20_) {
	if (((gt) this).e != class_ec || bt.g != ((gt) this).d)
	    throw new RuntimeException();
	PixelBuffer pixelbuffer = ((gaa) ((gt) this).c).Lg;
	int i_21_
	    = this.i.LockRect(0, i_20_, i_15_, i_16_, i_19_, 0, pixelbuffer);
	if (qr.a(i_21_, -2005530519)) {
	    i_17_ *= ((Class_ec) ((gt) this).e).d;
	    i_16_ *= ((Class_ec) ((gt) this).e).d;
	    int i_22_ = pixelbuffer.getRowPitch();
	    if (i_16_ != i_22_ || i_17_ != i_16_) {
		for (int i_23_ = 0; i_19_ > i_23_; i_23_++)
		    pixelbuffer.a(is, i + i_17_ * i_23_, i_23_ * i_22_, i_16_);
	    } else
		pixelbuffer.a(is, i, 0, i_19_ * i_16_);
	    this.i.UnlockRect(0);
	}
	if (i_18_ != 996)
	    a((int) -31);
    }
    
    final IDirect3DBaseTexture c(int i) {
	if (i != -13997)
	    a(-54, null, null, -114, -66, 41, -12, -72, 99);
	return this.i;
    }
    
    public final void a(byte i, boolean bool, boolean bool_24_) {
	if (i != -81)
	    a((byte) 97, true, false);
	((gt) this).j = bool;
	((gt) this).g = bool_24_;
    }
    
    gt(gaa var_gaa, Class_ec class_ec, bt var_bt, int i, int i_25_) {
	super(var_gaa, class_ec, var_bt, false, i_25_ * i);
	if (!((gaa) ((gt) this).c).Ag) {
	    f = dfa.a(i, 128);
	    h = dfa.a(i_25_, 128);
	} else {
	    h = i_25_;
	    f = i;
	}
	this.i = ((gaa) ((gt) this).c).Hg.a(i, i_25_, 1, 0,
					    gaa.a(((gt) this).e, ((gt) this).d,
						  true),
					    1);
    }
    
    public final int a(byte i) {
	if (i < 53)
	    a(true);
	return f;
    }
    
    gt(gaa var_gaa, int i, int i_26_, boolean bool, int[] is, int i_27_,
       int i_28_) {
	super(var_gaa, nda.h, bt.g, bool && ((gaa) var_gaa).Fg, i * i_26_);
	if (((gaa) ((gt) this).c).Ag) {
	    f = i;
	    h = i_26_;
	} else {
	    f = dfa.a(i, 128);
	    h = dfa.a(i_26_, 128);
	}
	if (bool)
	    this.i = ((gaa) ((gt) this).c).Hg.a(f, h, 0, 1024, 21, 1);
	else
	    this.i = ((gaa) ((gt) this).c).Hg.a(f, h, 1, 0, 21, 1);
	PixelBuffer pixelbuffer = ((gaa) ((gt) this).c).Lg;
	int i_29_ = this.i.LockRect(0, 0, 0, i, i_26_, 0, pixelbuffer);
	if (qr.a(i_29_, -2005530519)) {
	    if (i_28_ == 0)
		i_28_ = i;
	    int i_30_ = pixelbuffer.getRowPitch();
	    if (i_30_ == i * 4 && i == i_28_)
		pixelbuffer.a(is, i_27_, 0, i * i_26_);
	    else {
		for (int i_31_ = 0; i_26_ > i_31_; i_31_++)
		    pixelbuffer.a(is, i_27_ + i_28_ * i_31_, i_30_ * i_31_, i);
	    }
	    this.i.UnlockRect(0);
	}
    }
    
    public final void a(int i) {
	if (i != 9258)
	    a((byte) 88, false, true);
	((gt) this).c.a(this, 0);
    }
}
