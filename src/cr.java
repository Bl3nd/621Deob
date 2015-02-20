/* cr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cr
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f = go.c(16);
    private int[] g;
    
    final void a(float[] fs, int i, boolean bool) {
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    fs[i_0_] = 0.0F;
	if (!bool) {
	    int i_1_ = ((se) go.w[e]).a;
	    int i_2_ = d - b;
	    int i_3_ = i_2_ / a;
	    int[] is = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < 8; i_4_++) {
		int i_5_ = 0;
		while (i_5_ < i_3_) {
		    if (i_4_ == 0) {
			int i_6_ = go.w[e].c();
			for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
			    if (i_5_ + i_7_ < i_3_)
				is[i_5_ + i_7_] = i_6_ % c;
			    i_6_ /= c;
			}
		    }
		    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
			int i_9_ = is[i_5_];
			int i_10_ = g[i_9_ * 8 + i_4_];
			if (i_10_ >= 0) {
			    int i_11_ = b + i_5_ * a;
			    se var_se = go.w[i_10_];
			    if (f == 0) {
				int i_12_ = a / ((se) var_se).a;
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				    float[] fs_14_ = var_se.a();
				    for (int i_15_ = 0;
					 i_15_ < ((se) var_se).a; i_15_++)
					fs[i_11_ + i_13_ + i_15_ * i_12_]
					    += fs_14_[i_15_];
				}
			    } else {
				int i_16_ = 0;
				while (i_16_ < a) {
				    float[] fs_17_ = var_se.a();
				    for (int i_18_ = 0;
					 i_18_ < ((se) var_se).a; i_18_++) {
					fs[i_11_ + i_16_] += fs_17_[i_18_];
					i_16_++;
				    }
				}
			    }
			}
			if (++i_5_ >= i_3_)
			    break;
		    }
		}
	    }
	}
    }
    
    cr() {
	b = go.c(24);
	d = go.c(24);
	a = go.c(24) + 1;
	c = go.c(6) + 1;
	e = go.c(8);
	int[] is = new int[c];
	for (int i = 0; i < c; i++) {
	    int i_19_ = 0;
	    int i_20_ = go.c(3);
	    boolean bool = go.b() != 0;
	    if (bool)
		i_19_ = go.c(5);
	    is[i] = i_19_ << 3 | i_20_;
	}
	g = new int[c * 8];
	for (int i = 0; i < c * 8; i++)
	    g[i] = (is[i >> 3] & 1 << (i & 0x7)) != 0 ? go.c(8) : -1;
    }
}
