/* nu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nu extends ua
{
    static int f;
    int[] g;
    static int h;
    static String i = "";
    static int j;
    int[] k;
    static int l;
    static int m;
    
    public static void b(int i) {
	nu.i = null;
	if (i != -4795)
	    a(-69, 23, 50, 56, 99);
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			byte i_4_, int i_5_, int i_6_) {
	if (i_4_ > 68) {
	    m++;
	    int i_7_ = i_0_ + i_3_;
	    int i_8_ = i_2_ - i_3_;
	    for (int i_9_ = i_0_; i_9_ < i_7_; i_9_++)
		kg.a(i_6_, wh.O[i_9_], i_1_, i, -127);
	    int i_10_ = i - i_3_;
	    for (int i_11_ = i_2_; i_11_ > i_8_; i_11_--)
		kg.a(i_6_, wh.O[i_11_], i_1_, i, -116);
	    int i_12_ = i_3_ + i_6_;
	    for (int i_13_ = i_7_; i_13_ <= i_8_; i_13_++) {
		int[] is = wh.O[i_13_];
		kg.a(i_6_, is, i_1_, i_12_, 63);
		kg.a(i_12_, is, i_5_, i_10_, -126);
		kg.a(i_10_, is, i_1_, i, -122);
	    }
	}
    }
    
    static final void a(int i, int i_14_, Player var_qi, int i_15_, byte i_16_) {
	f++;
	int i_17_ = ((Entity) var_qi).regionLocalX[0];
	int i_18_ = -112 % ((-3 - i_14_) / 35);
	int i_19_ = ((Entity) var_qi).regionLocalY[0];
	if (i_17_ >= 0 && Class_hc.e > i_17_ && i_19_ >= 0 && i_19_ < bw.v
	    && (i_15_ >= 0 && Class_hc.e > i_15_ && i >= 0 && i < bw.v)) {
	    int i_20_
		= dr.a(bn.c, 0, i_17_, 0, i, true, 0, su.a[((Animable) var_qi).height],
		       i_19_, i_15_, true, var_qi.i(-1), kq.S, -4, 0);
	    if (i_20_ >= 1 && i_20_ <= 3) {
		for (int i_21_ = 0; i_20_ - 1 > i_21_; i_21_++)
		    var_qi.a(kq.S[i_21_], i_16_, bn.c[i_21_], true);
	    }
	}
    }
    
    static final void a(int i, int i_22_, int i_23_, int i_24_, int i_25_) {
	j++;
	float f = (float) kca.N / (float) kca.z;
	int i_26_ = i_25_;
	int i_27_ = i;
	if ((float) i_22_ > f)
	    i_27_ = (int) ((float) i_25_ * f);
	else
	    i_26_ = (int) ((float) i / f);
	i_24_ -= (i - i_27_) / 2;
	i_23_ -= (i_25_ - i_26_) / 2;
	cv.d = kca.N - i_24_ * kca.N / i_27_;
	pr.H = -1;
	Class_k.Q = -1;
	ut.I = i_23_ * kca.z / i_26_;
	jf.c(-2488);
    }
    
    nu(int i, int i_28_, int[] is, int[] is_29_) {
	((nu) this).k = is_29_;
	((nu) this).g = is;
    }
}
