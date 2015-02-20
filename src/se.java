/* se - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class se
{
    int a;
    private float[][] b;
    private int[] c;
    private int d;
    private int[] e;
    private int[] f;
    
    private static final int a(int i, int i_0_) {
	int i_1_;
	for (i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1;
	     vg.a(-64, i_0_, i_1_) > i; i_1_--) {
	    /* empty */
	}
	return i_1_;
    }
    
    final float[] a() {
	return b[c()];
    }
    
    private final void b() {
	int[] is = new int[d];
	int[] is_2_ = new int[33];
	for (int i = 0; i < d; i++) {
	    int i_3_ = e[i];
	    if (i_3_ != 0) {
		int i_4_ = 1 << 32 - i_3_;
		int i_5_ = is_2_[i_3_];
		is[i] = i_5_;
		int i_6_;
		if ((i_5_ & i_4_) != 0)
		    i_6_ = is_2_[i_3_ - 1];
		else {
		    i_6_ = i_5_ | i_4_;
		    for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
			int i_8_ = is_2_[i_7_];
			if (i_8_ != i_5_)
			    break;
			int i_9_ = 1 << 32 - i_7_;
			if ((i_8_ & i_9_) != 0) {
			    is_2_[i_7_] = is_2_[i_7_ - 1];
			    break;
			}
			is_2_[i_7_] = i_8_ | i_9_;
		    }
		}
		is_2_[i_3_] = i_6_;
		for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
		    int i_11_ = is_2_[i_10_];
		    if (i_11_ == i_5_)
			is_2_[i_10_] = i_6_;
		}
	    }
	}
	f = new int[8];
	int i = 0;
	for (int i_12_ = 0; i_12_ < d; i_12_++) {
	    int i_13_ = e[i_12_];
	    if (i_13_ != 0) {
		int i_14_ = is[i_12_];
		int i_15_ = 0;
		for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
		    int i_17_ = -2147483648 >>> i_16_;
		    if ((i_14_ & i_17_) != 0) {
			if (f[i_15_] == 0)
			    f[i_15_] = i;
			i_15_ = f[i_15_];
		    } else
			i_15_++;
		    if (i_15_ >= f.length) {
			int[] is_18_ = new int[f.length * 2];
			for (int i_19_ = 0; i_19_ < f.length; i_19_++)
			    is_18_[i_19_] = f[i_19_];
			f = is_18_;
		    }
		    i_17_ >>>= 1;
		}
		f[i_15_] = i_12_ ^ 0xffffffff;
		if (i_15_ >= i)
		    i = i_15_ + 1;
	    }
	}
    }
    
    final int c() {
	int i;
	for (i = 0; f[i] >= 0; i = go.b() != 0 ? f[i] : i + 1) {
	    /* empty */
	}
	return f[i] ^ 0xffffffff;
    }
    
    se() {
	go.c(24);
	((se) this).a = go.c(16);
	d = go.c(24);
	e = new int[d];
	boolean bool = go.b() != 0;
	if (bool) {
	    int i = 0;
	    int i_20_ = go.c(5) + 1;
	    while (i < d) {
		int i_21_ = go.c(it.a(-24420, d - i));
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
		    e[i++] = i_20_;
		i_20_++;
	    }
	} else {
	    boolean bool_23_ = go.b() != 0;
	    for (int i = 0; i < d; i++) {
		if (bool_23_ && go.b() == 0)
		    e[i] = 0;
		else
		    e[i] = go.c(5) + 1;
	    }
	}
	b();
	int i = go.c(4);
	if (i > 0) {
	    float f = go.a(go.c(32));
	    float f_24_ = go.a(go.c(32));
	    int i_25_ = go.c(4) + 1;
	    boolean bool_26_ = go.b() != 0;
	    int i_27_;
	    if (i == 1)
		i_27_ = a(d, ((se) this).a);
	    else
		i_27_ = d * ((se) this).a;
	    c = new int[i_27_];
	    for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
		c[i_28_] = go.c(i_25_);
	    b = new float[d][((se) this).a];
	    if (i == 1) {
		for (int i_29_ = 0; i_29_ < d; i_29_++) {
		    float f_30_ = 0.0F;
		    int i_31_ = 1;
		    for (int i_32_ = 0; i_32_ < ((se) this).a; i_32_++) {
			int i_33_ = i_29_ / i_31_ % i_27_;
			float f_34_ = (float) c[i_33_] * f_24_ + f + f_30_;
			b[i_29_][i_32_] = f_34_;
			if (bool_26_)
			    f_30_ = f_34_;
			i_31_ *= i_27_;
		    }
		}
	    } else {
		for (int i_35_ = 0; i_35_ < d; i_35_++) {
		    float f_36_ = 0.0F;
		    int i_37_ = i_35_ * ((se) this).a;
		    for (int i_38_ = 0; i_38_ < ((se) this).a; i_38_++) {
			float f_39_ = (float) c[i_37_] * f_24_ + f + f_36_;
			b[i_35_][i_38_] = f_39_;
			if (bool_26_)
			    f_36_ = f_39_;
			i_37_++;
		    }
		}
	    }
	}
    }
}
