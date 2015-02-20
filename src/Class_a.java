/* Class_a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_a
{
    static int a;
    
    static final byte[] a(int i, byte[] is, int i_0_, int i_1_) {
	a++;
	byte[] is_2_;
	if (i_1_ > 0) {
	    is_2_ = new byte[i];
	    for (int i_3_ = 0; i > i_3_; i_3_++)
		is_2_[i_3_] = is[i_1_ + i_3_];
	} else
	    is_2_ = is;
	wj var_wj = new wj();
	int i_4_ = -18 % ((i_0_ - 90) / 34);
	var_wj.a((int) 8);
	var_wj.a(is_2_, (long) (i * 8), -30);
	byte[] is_5_ = new byte[64];
	var_wj.a(is_5_, 0, 256);
	return is_5_;
    }
}
