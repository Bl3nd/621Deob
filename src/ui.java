/* ui - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ui
{
    static int a;
    static int b;
    static pl c;
    private int[][] d;
    private int e;
    static int f = 0;
    static wa[] g;
    static int h = -1;
    static int i;
    static int j;
    private int k;
    static int l;
    static int m;
    static hv[] n;
    
    static final void a(String string, String string_0_, int i, int i_1_) {
	int i_2_ = 36 / ((7 - i) / 57);
	l++;
	jl.s = 2;
	pda.y = i_1_;
	dq.a(false, string, -119, string_0_);
    }
    
    final int a(int i, int i_3_) {
	if (d != null)
	    i = (int) ((long) i * (long) k / (long) e);
	m++;
	if (i_3_ > -34)
	    a(false, null);
	return i;
    }
    
    public static void a(int i) {
	if (i <= 96)
	    n = null;
	g = null;
	n = null;
	c = null;
    }
    
    final int a(byte i, int i_4_) {
	if (i >= -94)
	    a = -2;
	b++;
	if (d != null)
	    i_4_ = (int) ((long) i_4_ * (long) k / (long) e) + 6;
	return i_4_;
    }
    
    ui(int i, int i_5_) {
	if (i != i_5_) {
	    int i_6_ = PlayerDef.b(i, i_5_, 126);
	    i /= i_6_;
	    i_5_ /= i_6_;
	    this.d = new int[i][14];
	    e = i;
	    k = i_5_;
	    for (int i_7_ = 0; i > i_7_; i_7_++) {
		int[] is = this.d[i_7_];
		double d = (double) i_7_ / (double) i + 6.0;
		int i_8_ = (int) Math.floor(d - 7.0 + 1.0);
		if (i_8_ < 0)
		    i_8_ = 0;
		int i_9_ = (int) Math.ceil(d + 7.0);
		if (i_9_ > 14)
		    i_9_ = 14;
		double d_10_ = (double) i_5_ / (double) i;
		for (/**/; i_9_ > i_8_; i_8_++) {
		    double d_11_ = ((double) i_8_ - d) * 3.141592653589793;
		    double d_12_ = d_10_;
		    if (d_11_ < -1.0E-4 || d_11_ > 1.0E-4)
			d_12_ *= Math.sin(d_11_) / d_11_;
		    d_12_
			*= 0.46 * Math.cos(0.2243994752564138 * ((double) i_8_
								 - d)) + 0.54;
		    is[i_8_] = (int) Math.floor(65536.0 * d_12_ + 0.5);
		}
	    }
	}
    }
    
    final byte[] a(boolean bool, byte[] is) {
	if (bool != false)
	    return null;
	j++;
	if (d != null) {
	    int i = (int) ((long) is.length * (long) k / (long) e) + 14;
	    int[] is_13_ = new int[i];
	    int i_14_ = 0;
	    int i_15_ = 0;
	    for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
		int i_17_ = is[i_16_];
		int[] is_18_ = d[i_15_];
		for (int i_19_ = 0; i_19_ < 14; i_19_++)
		    is_13_[i_14_ + i_19_] += is_18_[i_19_] * i_17_;
		i_15_ += k;
		int i_20_ = i_15_ / e;
		i_15_ -= e * i_20_;
		i_14_ += i_20_;
	    }
	    is = new byte[i];
	    for (int i_21_ = 0; i > i_21_; i_21_++) {
		int i_22_ = is_13_[i_21_] + 32768 >> 16;
		if (i_22_ < -128)
		    is[i_21_] = (byte) -128;
		else if (i_22_ <= 127)
		    is[i_21_] = (byte) i_22_;
		else
		    is[i_21_] = (byte) 127;
	    }
	}
	return is;
    }
    
    static {
	g = new wa[14];
	i = 0;
    }
}
