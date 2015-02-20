/* gda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gda
{
    private int a;
    boolean b = true;
    int c;
    static sj d;
    static int e;
    boolean f = true;
    int g;
    static int h;
    int i;
    static int j;
    int k;
    static int l;
    int m;
    static int n;
    int o;
    
    static final float a(float f, byte i) {
	int i_0_ = 83 / ((-67 - i) / 52);
	j++;
	return f * f * f * ((f * 6.0F - 15.0F) * f + 10.0F);
    }
    
    public static void a(int i) {
	d = null;
	if (i != 4833)
	    a(false, true, (byte) -32);
    }
    
    private final void a(int i, BytesParser var_es, int i_1_) {
	n++;
	if (i_1_ == 65289) {
	    if (i == 1) {
		a = var_es.readTribyte(-1);
		a(i_1_ ^ 0xfff6, a);
	    } else if (i != 2) {
		if (i == 3)
		    ((gda) this).o = var_es.readShort(13111) << 2;
		else if (i == 4)
		    ((gda) this).b = false;
		else if (i == 5)
		    ((gda) this).f = false;
	    } else {
		((gda) this).m = var_es.readShort(i_1_ - 52178);
		if (((gda) this).m == 65535)
		    ((gda) this).m = -1;
	    }
	}
    }
    
    static final void a(boolean bool, boolean bool_2_, byte i) {
	l++;
	if (bool) {
	    taa.h++;
	    wd.a(true);
	}
	if (i != 88)
	    d = null;
	if (bool_2_) {
	    Class_ag.l++;
	    baa.a((int) 73);
	}
    }
    
    private final void a(int i, int i_3_) {
	h++;
	double d = (double) ((i_3_ & 0xffe825) >> 16) / 256.0;
	double d_4_ = (double) ((i_3_ & 0xff09) >> 8) / 256.0;
	double d_5_ = (double) (i & i_3_) / 256.0;
	double d_6_ = d;
	if (d_6_ > d_4_)
	    d_6_ = d_4_;
	if (d_5_ < d_6_)
	    d_6_ = d_5_;
	double d_7_ = d;
	if (d_7_ < d_4_)
	    d_7_ = d_4_;
	if (d_5_ > d_7_)
	    d_7_ = d_5_;
	double d_8_ = 0.0;
	double d_9_ = 0.0;
	double d_10_ = (d_6_ + d_7_) / 2.0;
	if (d_7_ != d_6_) {
	    if (d_10_ < 0.5)
		d_9_ = (d_7_ - d_6_) / (d_7_ + d_6_);
	    if (d_7_ != d) {
		if (d_7_ != d_4_) {
		    if (d_7_ == d_5_)
			d_8_ = (d - d_4_) / (d_7_ - d_6_) + 4.0;
		} else
		    d_8_ = (d_5_ - d) / (d_7_ - d_6_) + 2.0;
	    } else
		d_8_ = (d_4_ - d_5_) / (d_7_ - d_6_);
	    if (d_10_ >= 0.5)
		d_9_ = (d_7_ - d_6_) / (2.0 - d_7_ - d_6_);
	}
	d_8_ /= 6.0;
	((gda) this).i = (int) (256.0 * d_10_);
	((gda) this).k = (int) (d_9_ * 256.0);
	if (((gda) this).i >= 0) {
	    if (((gda) this).i > 255)
		((gda) this).i = 255;
	} else
	    ((gda) this).i = 0;
	if (!(d_10_ > 0.5))
	    ((gda) this).g = (int) (512.0 * (d_10_ * d_9_));
	else
	    ((gda) this).g = (int) (d_9_ * (-d_10_ + 1.0) * 512.0);
	if (((gda) this).k < 0)
	    ((gda) this).k = 0;
	else if (((gda) this).k > 255)
	    ((gda) this).k = 255;
	if (((gda) this).g < 1)
	    ((gda) this).g = 1;
	((gda) this).c = (int) (d_8_ * (double) ((gda) this).g);
    }
    
    final void a(BytesParser var_es, int i) {
	if (i <= 15)
	    a(27, null, -126);
	e++;
	for (;;) {
	    int i_11_ = var_es.readUnsignedByte(-9268);
	    if (i_11_ == 0)
		break;
	    a(i_11_, var_es, 65289);
	}
    }
    
    public gda() {
	a = 0;
	((gda) this).m = -1;
	((gda) this).o = 512;
    }
}
