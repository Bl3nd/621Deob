/* mp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class mp
{
    private short[] a;
    int b = 4;
    private int c;
    static int d;
    static int e;
    static int f;
    static eaa g;
    private int h;
    private int i;
    private int j = 4;
    static int k;
    private short[] l;
    static int m;
    
    private final void a(byte i) {
	if (i <= 14)
	    a((byte) 36, 80, 119);
	f++;
	Random random = new Random((long) this.i);
	for (int i_0_ = 0; i_0_ < 255; i_0_++)
	    l[i_0_] = (short) i_0_;
	for (int i_1_ = 0; i_1_ < 255; i_1_++) {
	    int i_2_ = -i_1_ + 255;
	    int i_3_ = it.a(random, i_2_, 124);
	    short i_4_ = l[i_3_];
	    l[i_3_] = l[i_2_];
	    l[i_2_] = l[i_2_ + 256] = i_4_;
	}
    }
    
    final void a(byte i, int i_5_, int i_6_, int i_7_) {
	e++;
	if (i < 112)
	    b((byte) 102);
	int[] is = new int[i_7_];
	int[] is_8_ = new int[i_6_];
	int[] is_9_ = new int[i_5_];
	for (int i_10_ = 0; i_10_ < i_7_; i_10_++)
	    is[i_10_] = (i_10_ << 12) / i_7_;
	for (int i_11_ = 0; i_11_ < i_6_; i_11_++)
	    is_8_[i_11_] = (i_11_ << 12) / i_6_;
	for (int i_12_ = 0; i_12_ < i_5_; i_12_++)
	    is_9_[i_12_] = (i_12_ << 12) / i_5_;
	c((int) 22);
	for (int i_13_ = 0; i_13_ < i_5_; i_13_++) {
	    for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
		for (int i_15_ = 0; i_7_ > i_15_; i_15_++) {
		    for (int i_16_ = 0; ((mp) this).b > i_16_; i_16_++) {
			int i_17_ = a[i_16_] << 12;
			int i_18_ = i_17_ * is[i_15_] >> 12;
			int i_19_ = i_17_ * is_8_[i_14_] >> 12;
			int i_20_ = i_17_ * j >> 12;
			int i_21_ = h * i_17_ >> 12;
			int i_22_ = i_17_ * c >> 12;
			int i_23_ = i_17_ * is_9_[i_13_] >> 12;
			i_19_ *= j;
			i_23_ *= h;
			i_18_ *= c;
			int i_24_ = i_18_ >> 12;
			int i_25_ = i_24_ + 1;
			i_24_ &= 0xff;
			int i_26_ = i_19_ >> 12;
			int i_27_ = i_26_ + 1;
			i_26_ &= 0xff;
			int i_28_ = i_23_ >> 12;
			int i_29_ = i_28_ + 1;
			if (i_25_ < i_22_)
			    i_25_ &= 0xff;
			else
			    i_25_ = 0;
			i_18_ &= 0xfff;
			if (i_27_ >= i_20_)
			    i_27_ = 0;
			else
			    i_27_ &= 0xff;
			i_28_ &= 0xff;
			if (i_21_ > i_29_)
			    i_29_ &= 0xff;
			else
			    i_29_ = 0;
			i_19_ &= 0xfff;
			i_23_ &= 0xfff;
			int i_30_ = ns.s[i_19_];
			int i_31_ = i_19_ - 4096;
			int i_32_ = i_23_ - 4096;
			int i_33_ = ns.s[i_18_];
			int i_34_ = i_18_ - 4096;
			int i_35_ = l[i_28_];
			int i_36_ = ns.s[i_23_];
			int i_37_ = l[i_29_];
			int i_38_ = l[i_35_ + i_26_];
			int i_39_ = l[i_26_ + i_37_];
			int i_40_ = l[i_35_ + i_27_];
			int i_41_ = l[i_27_ + i_37_];
			int i_42_ = mj.a(l[i_24_ + i_38_], (byte) 116, i_19_,
					 i_23_, i_18_);
			int i_43_ = mj.a(l[i_38_ + i_25_], (byte) 116, i_19_,
					 i_23_, i_34_);
			int i_44_ = (i_33_ * (i_43_ - i_42_) >> 12) + i_42_;
			i_42_ = mj.a(l[i_24_ + i_40_], (byte) 116, i_31_,
				     i_23_, i_18_);
			i_43_ = mj.a(l[i_40_ + i_25_], (byte) 116, i_31_,
				     i_23_, i_34_);
			int i_45_ = i_42_ + ((i_43_ - i_42_) * i_33_ >> 12);
			int i_46_ = i_44_ + (i_30_ * (i_45_ - i_44_) >> 12);
			i_42_ = mj.a(l[i_24_ + i_39_], (byte) 116, i_19_,
				     i_32_, i_18_);
			i_43_ = mj.a(l[i_25_ + i_39_], (byte) 116, i_19_,
				     i_32_, i_34_);
			i_44_ = i_42_ + ((i_43_ - i_42_) * i_33_ >> 12);
			i_42_ = mj.a(l[i_24_ + i_41_], (byte) 116, i_31_,
				     i_32_, i_18_);
			i_43_ = mj.a(l[i_25_ + i_41_], (byte) 116, i_31_,
				     i_32_, i_34_);
			i_45_ = i_42_ + (i_33_ * (i_43_ - i_42_) >> 12);
			int i_47_ = i_44_ + ((i_45_ - i_44_) * i_30_ >> 12);
			a((byte) 127, i_16_,
			  i_46_ + ((i_47_ - i_46_) * i_36_ >> 12));
		    }
		    b((int) 1);
		}
	    }
	}
    }
    
    private final void b(byte i) {
	int i_48_ = -95 / ((64 - i) / 49);
	m++;
	a = new short[((mp) this).b];
	for (int i_49_ = 0; i_49_ < ((mp) this).b; i_49_++)
	    a[i_49_] = (short) (int) Math.pow(2.0, (double) i_49_);
    }
    
    static final Class_ue a(int i) {
	if (i != -1)
	    c((byte) 110);
	k++;
	try {
	    return (Class_ue) Class.forName("vl").newInstance();
	} catch (Throwable throwable) {
	    return null;
	}
    }
    
    public static void c(byte i) {
	if (i >= -84)
	    g = null;
	g = null;
    }
    
    abstract void b(int i);
    
    abstract void c(int i);
    
    static final void a(boolean bool, int i, boolean bool_50_, int i_51_,
			int i_52_, int i_53_, int i_54_) {
	d++;
	if (i > i_53_) {
	    int i_55_ = (i + i_53_) / 2;
	    int i_56_ = i_53_;
	    WorldSub var_iw = il.o[i_55_];
	    il.o[i_55_] = il.o[i];
	    il.o[i] = var_iw;
	    for (int i_57_ = i_53_; i_57_ < i; i_57_++) {
		if (rk.a(i_52_, var_iw, -30991, bool, i_54_, il.o[i_57_],
			 bool_50_)
		    <= 0) {
		    WorldSub var_iw_58_ = il.o[i_57_];
		    il.o[i_57_] = il.o[i_56_];
		    il.o[i_56_++] = var_iw_58_;
		}
	    }
	    il.o[i] = il.o[i_56_];
	    il.o[i_56_] = var_iw;
	    a(bool, i_56_ - 1, bool_50_, i_51_, i_52_, i_53_, i_54_);
	    a(bool, i, bool_50_, 2, i_52_, i_56_ + 1, i_54_);
	}
	if (i_51_ != 2)
	    a((int) 25);
    }
    
    abstract void a(byte i, int i_59_, int i_60_);
    
    mp(int i, int i_61_, int i_62_, int i_63_, int i_64_) {
	h = 4;
	c = 4;
	l = new short[512];
	this.i = 0;
	((mp) this).b = i_61_;
	h = i_64_;
	this.i = i;
	c = i_62_;
	j = i_63_;
	b((byte) 124);
	a((byte) 68);
    }
}
