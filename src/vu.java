/* vu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vu
{
    static int a = 0;
    static int[] b;
    private char c;
    boolean d = true;
    static int e;
    static int f;
    static int g;
    int h;
    static int i;
    static int j;
    static int k;
    static int l;
    String m;
    
    private final void a(int i, int i_0_, BytesParser var_es) {
	e++;
	if (i != -6)
	    a(-90);
	if (i_0_ != 1) {
	    if (i_0_ == 2)
		((vu) this).h = var_es.readInt(i ^ ~0x4d);
	    else if (i_0_ != 4) {
		if (i_0_ == 5)
		    ((vu) this).m = var_es.readString((byte) 117);
	    } else
		((vu) this).d = false;
	} else
	    c = eq.a((byte) 72, var_es.readByte(-20933));
    }
    
    final boolean a(int i) {
	if (i != 0)
	    return true;
	vu.i++;
	if (c != 's')
	    return false;
	return true;
    }
    
    static final void a(int i, int i_1_, int i_2_, float f, int i_3_,
			float f_4_, int i_5_, int i_6_, float[] fs, int i_7_,
			int i_8_) {
	i_5_ -= i_2_;
	i -= i_7_;
	k++;
	i_3_ -= i_6_;
	float f_9_ = (fs[2] * (float) i_3_
		      + ((float) i * fs[1] + (float) i_5_ * fs[0]));
	float f_10_ = ((float) i_5_ * fs[3] + (float) i * fs[i_8_]
		       + fs[5] * (float) i_3_);
	float f_11_
	    = (float) i * fs[7] + (float) i_5_ * fs[6] + fs[8] * (float) i_3_;
	float f_12_
	    = ((float) Math.atan2((double) f_9_, (double) f_11_) / 6.2831855F
	       + 0.5F);
	if (f_4_ != 1.0F)
	    f_12_ *= f_4_;
	float f_13_ = f_10_ + 0.5F + f;
	if (i_1_ != 1) {
	    if (i_1_ == 2) {
		f_12_ = -f_12_;
		f_13_ = -f_13_;
	    } else if (i_1_ == 3) {
		float f_14_ = f_12_;
		f_12_ = f_13_;
		f_13_ = -f_14_;
	    }
	} else {
	    float f_15_ = f_12_;
	    f_12_ = -f_13_;
	    f_13_ = f_15_;
	}
	fm.c = f_13_;
	lt.b = f_12_;
    }
    
    final void a(byte i, BytesParser var_es) {
	if (i >= -77)
	    a(108);
	for (;;) {
	    int i_16_ = var_es.readUnsignedByte(-9268);
	    if (i_16_ == 0)
		break;
	    a(-6, i_16_, var_es);
	}
	l++;
    }
    
    public static void a(boolean bool) {
	b = null;
	if (bool != false)
	    j = 59;
    }
    
    public vu() {
	/* empty */
    }
}
