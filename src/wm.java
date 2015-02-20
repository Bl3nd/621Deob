/* wm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wm extends mca
{
    private int H;
    static int I;
    private int J = 4;
    static int K;
    static int L;
    static int M;
    
    final void a(int i, BytesParser bytesParser, int j) {
	K++;
	if (i == 1) {
	    int i_1_ = j;
	    do {
		if (i_1_ != 0) {
		    if (i_1_ != 1)
			break;
		} else {
		    J = bytesParser.readUnsignedByte(-9268);
		    break;
		}
		H = bytesParser.readUnsignedByte(-9268);
	    } while (false);
	}
    }
    
    final int[] a(int i, int j) {
	int i_3_ = -56 % ((81 - i) / 36);
	L++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int i_4_ = fr.v / J;
	    int i_5_ = od.pb / H;
	    int[] is_6_;
	    if (i_5_ > 0) {
		int i_7_ = j % i_5_;
		is_6_ = this.a(i_7_ * od.pb / i_5_, false, 0);
	    } else
		is_6_ = this.a(0, false, 0);
	    for (int i_8_ = 0; fr.v > i_8_; i_8_++) {
		if (i_4_ <= 0)
		    is[i_8_] = is_6_[0];
		else {
		    int i_9_ = i_8_ % i_4_;
		    is[i_8_] = is_6_[i_9_ * fr.v / i_4_];
		}
	    }
	}
	return is;
    }
    
    static final void a(int i, int[] is, byte i_10_, int i_11_, int[] is_12_) {
	I++;
	if (i_10_ == 8) {
	    if (i_11_ > i) {
		int i_13_ = (i + i_11_) / 2;
		int i_14_ = i;
		int i_15_ = is_12_[i_13_];
		is_12_[i_13_] = is_12_[i_11_];
		is_12_[i_11_] = i_15_;
		int i_16_ = is[i_13_];
		is[i_13_] = is[i_11_];
		is[i_11_] = i_16_;
		int i_17_ = i_15_ == 2147483647 ? 0 : 1;
		for (int i_18_ = i; i_11_ > i_18_; i_18_++) {
		    if ((i_18_ & i_17_) + i_15_ > is_12_[i_18_]) {
			int i_19_ = is_12_[i_18_];
			is_12_[i_18_] = is_12_[i_14_];
			is_12_[i_14_] = i_19_;
			int i_20_ = is[i_18_];
			is[i_18_] = is[i_14_];
			is[i_14_++] = i_20_;
		    }
		}
		is_12_[i_11_] = is_12_[i_14_];
		is_12_[i_14_] = i_15_;
		is[i_11_] = is[i_14_];
		is[i_14_] = i_16_;
		a(i, is, (byte) 8, i_14_ - 1, is_12_);
		a(i_14_ + 1, is, (byte) 8, i_11_, is_12_);
	    }
	}
    }
    
    final int[][] a(int i, boolean bool) {
	M++;
	int[][] is = ((mca) this).B.a(i, -41);
	if (bool != true)
	    J = 38;
	if (((td) ((mca) this).B).p) {
	    int i_21_ = fr.v / J;
	    int i_22_ = od.pb / H;
	    int[][] is_23_;
	    if (i_22_ > 0) {
		int i_24_ = i % i_22_;
		is_23_ = this.a(0, od.pb * i_24_ / i_22_, 0);
	    } else
		is_23_ = this.a(0, (int) 0, 0);
	    int[] is_25_ = is_23_[0];
	    int[] is_26_ = is_23_[1];
	    int[] is_27_ = is_23_[2];
	    int[] is_28_ = is[0];
	    int[] is_29_ = is[1];
	    int[] is_30_ = is[2];
	    for (int i_31_ = 0; fr.v > i_31_; i_31_++) {
		int i_32_;
		if (i_21_ <= 0)
		    i_32_ = 0;
		else {
		    int i_33_ = i_31_ % i_21_;
		    i_32_ = i_33_ * fr.v / i_21_;
		}
		is_28_[i_31_] = is_25_[i_32_];
		is_29_[i_31_] = is_26_[i_32_];
		is_30_[i_31_] = is_27_[i_32_];
	    }
	}
	return is;
    }
    
    public wm() {
	super(1, false);
	H = 4;
    }
}
