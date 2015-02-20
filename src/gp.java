/* gp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gp
{
    private static int a;
    private static int b;
    private static int c;
    private static int[] d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    
    private static final void a(int i, int i_0_) {
	if (i_0_ > i + 4) {
	    int i_1_ = i;
	    int i_2_ = d[i_1_];
	    int i_3_ = d[i_1_ + 1];
	    int i_4_ = d[i_1_ + 2];
	    int i_5_ = d[i_1_ + 3];
	    for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
		int i_7_ = d[i_6_ + 1];
		if (i_7_ < i_3_) {
		    d[i_1_] = d[i_6_];
		    d[i_1_ + 1] = i_7_;
		    d[i_1_ + 2] = d[i_6_ + 2];
		    d[i_1_ + 3] = d[i_6_ + 3];
		    i_1_ += 4;
		    d[i_6_] = d[i_1_];
		    d[i_6_ + 1] = d[i_1_ + 1];
		    d[i_6_ + 2] = d[i_1_ + 2];
		    d[i_6_ + 3] = d[i_1_ + 3];
		}
	    }
	    d[i_1_] = i_2_;
	    d[i_1_ + 1] = i_3_;
	    d[i_1_ + 2] = i_4_;
	    d[i_1_ + 3] = i_5_;
	    a(i, i_1_);
	    a(i_1_ + 4, i_0_);
	}
    }
    
    private static final void b(int i, int i_8_) {
	for (/**/; i_8_ >= i + 8; i_8_ -= 4) {
	    boolean bool = true;
	    for (int i_9_ = i + 4; i_9_ < i_8_; i_9_ += 4) {
		int i_10_ = d[i_9_ - 4];
		int i_11_ = d[i_9_];
		if (i_10_ > i_11_) {
		    bool = false;
		    d[i_9_ - 4] = i_11_;
		    d[i_9_] = i_10_;
		    i_10_ = d[i_9_ - 2];
		    d[i_9_ - 2] = d[i_9_ + 2];
		    d[i_9_ + 2] = i_10_;
		    i_10_ = d[i_9_ - 1];
		    d[i_9_ - 1] = d[i_9_ + 3];
		    d[i_9_ + 3] = i_10_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static final void a(Class_r class_r, int[] is, int i) {
	a(class_r, is, 0, is.length, i, null, null);
    }
    
    static final void a(Class_r class_r, int[] is, int i, int[] is_12_,
			int[] is_13_) {
	a(class_r, is, 0, is.length, i, is_12_, is_13_);
    }
    
    private static final boolean a(int i) {
	int i_14_ = g;
	int i_15_ = e;
	int i_16_ = f;
	int i_17_;
	for (/**/; i_15_ >= i_14_; i_15_ = i_17_) {
	    f = ++i_16_;
	    if (i_16_ >= i)
		return false;
	    i_17_ = b;
	    for (/**/; i_14_ < c; i_14_ += 4) {
		int i_18_ = d[i_14_ + 1];
		if (i_16_ < i_18_)
		    break;
		int i_19_ = d[i_14_];
		int i_20_ = d[i_14_ + 2];
		int i_21_ = d[i_14_ + 3];
		int i_22_ = (i_20_ - i_19_ << 16) / (i_21_ - i_18_);
		int i_23_ = (i_19_ << 16) + 32768;
		d[i_14_] = i_23_;
		d[i_14_ + 2] = i_22_;
	    }
	    for (int i_24_ = i_17_; i_24_ < i_14_; i_24_ += 4) {
		int i_25_ = d[i_24_ + 3];
		if (i_16_ >= i_25_) {
		    d[i_24_] = d[i_17_];
		    d[i_24_ + 1] = d[i_17_ + 1];
		    d[i_24_ + 2] = d[i_17_ + 2];
		    d[i_24_ + 3] = d[i_17_ + 3];
		    i_17_ += 4;
		}
	    }
	    if (i_17_ == c) {
		c = 0;
		return false;
	    }
	    b(i_17_, i_14_);
	    b = i_17_;
	    g = i_14_;
	}
	a = d[i_15_] >> 16;
	h = d[i_15_ + 4] >> 16;
	d[i_15_] += d[i_15_ + 2];
	d[i_15_ + 4] += d[i_15_ + 6];
	i_15_ += 8;
	e = i_15_;
	return true;
    }
    
    public static void a() {
	d = null;
    }
    
    private static final void a(Class_r class_r, int[] is, int i, int i_26_,
				int i_27_, int[] is_28_, int[] is_29_) {
	int[] is_30_ = new int[4];
	class_r.oa(is_30_);
	if (is_28_ != null && is_30_[3] - is_30_[1] != is_28_.length)
	    throw new IllegalStateException();
	b();
	a(is, i, i_26_);
	b(is_30_[1]);
	while (a(is_30_[3])) {
	    int i_31_ = a;
	    int i_32_ = h;
	    int i_33_ = f;
	    if (is_28_ != null) {
		int i_34_ = i_33_ - is_30_[1];
		if (i_31_ < is_28_[i_34_] + is_30_[0])
		    i_31_ = is_28_[i_34_] + is_30_[0];
		if (i_32_ > is_28_[i_34_] + is_29_[i_34_] + is_30_[0])
		    i_32_ = is_28_[i_34_] + is_29_[i_34_] + is_30_[0];
		if (i_32_ - i_31_ <= 0)
		    continue;
	    }
	    class_r.XA(i_31_, i_33_, i_32_ - i_31_, i_27_, 1);
	}
    }
    
    private static final void b(int i) {
	if (c < 0) {
	    b = g = e = 0;
	    f = 2147483646;
	} else {
	    a(0, c);
	    int i_35_ = d[1];
	    if (i_35_ < i)
		i_35_ = i;
	    int i_36_ = 0;
	    int i_37_;
	    for (i_37_ = 0; i_37_ < c; i_37_ += 4) {
		int i_38_ = d[i_37_ + 1];
		if (i_35_ < i_38_)
		    break;
		int i_39_ = d[i_37_];
		int i_40_ = d[i_37_ + 2];
		int i_41_ = d[i_37_ + 3];
		int i_42_ = (i_40_ - i_39_ << 16) / (i_41_ - i_38_);
		int i_43_ = (i_39_ << 16) + 32768;
		d[i_37_] = i_43_ + (i_35_ - i_38_) * i_42_;
		d[i_37_ + 2] = i_42_;
	    }
	    b = i_36_;
	    g = i_37_;
	    e = i_37_;
	    f = i_35_ - 1;
	}
    }
    
    private static final void a(int[] is, int i, int i_44_) {
	int i_45_ = c + (i_44_ << 1);
	if (d == null || d.length < i_45_) {
	    int[] is_46_ = new int[i_45_];
	    for (int i_47_ = 0; i_47_ < c; i_47_++)
		is_46_[i_47_] = d[i_47_];
	    d = is_46_;
	}
	i_44_ += i;
	int i_48_ = i_44_ - 2;
	for (int i_49_ = i; i_49_ < i_44_; i_49_ += 2) {
	    int i_50_ = is[i_48_ + 1];
	    int i_51_ = is[i_49_ + 1];
	    if (i_50_ < i_51_) {
		d[c++] = is[i_48_];
		d[c++] = i_50_;
		d[c++] = is[i_49_];
		d[c++] = i_51_;
	    } else if (i_51_ < i_50_) {
		d[c++] = is[i_49_];
		d[c++] = i_51_;
		d[c++] = is[i_48_];
		d[c++] = i_50_;
	    }
	    i_48_ = i_49_;
	}
    }
    
    private static final void b() {
	c = 0;
    }
}
