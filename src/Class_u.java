/* Class_u - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_u extends mca
{
    static int H;
    private boolean I = true;
    static int J;
    static int K;
    static Class_ae L = new Class_ae();
    static int M;
    static int N;
    static int O;
    private boolean P = true;
    static int Q;
    
    static final int b(int i, int i_0_, int i_1_, int i_2_) {
	J++;
	if (Class_q.b == null)
	    return 0;
	if (i_1_ != -20214)
	    N = 72;
	int i_3_ = i >> 9;
	int i_4_ = i_2_ >> 9;
	if (i_3_ < 0 || i_4_ < 0 || Class_hc.e - 1 < i_3_ || i_4_ > bw.v - 1)
	    return 0;
	int i_5_ = i_0_;
	if (i_5_ < 3 && (tu.b[1][i_3_][i_4_] & 0x2) != 0)
	    i_5_++;
	return Class_q.b[i_5_].a(i_2_, i, true);
    }
    
    public static void i(int i) {
	L = null;
	if (i != 1)
	    Q = -4;
    }
    
    final int[] a(int i, int j) {
	H++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int[] is_7_ = this.a(I ? bc.d - j : j, false, 0);
	    if (P) {
		for (int i_8_ = 0; i_8_ < fr.v; i_8_++)
		    is[i_8_] = is_7_[qf.g - i_8_];
	    } else
		co.a(is_7_, 0, is, 0, fr.v);
	}
	int i_9_ = 63 / ((i - 81) / 36);
	return is;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    int i_11_ = j;
	while_226_:
	    do {
		do {
		    if (i_11_ != 0) {
			if (i_11_ != 1) {
			    if (i_11_ == 2)
				break;
			    break while_226_;
			}
		    } else {
			P = bytesParser.readUnsignedByte(-9268) == 1;
			break while_226_;
		    }
		    I = bytesParser.readUnsignedByte(-9268) == 1;
		    break while_226_;
		} while (false);
		((mca) this).m = bytesParser.readUnsignedByte(i - 9269) == 1;
	    } while (false);
	    M++;
	}
    }
    
    static final void a(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
	O++;
	int i_16_ = i_15_;
	int i_17_ = i;
	int i_18_ = -i;
	int i_19_ = -1;
	kg.a(i_14_ - i, wh.O[i_12_], i_13_, i_14_ + i, -104);
	while (i_17_ > i_16_) {
	    i_19_ += 2;
	    i_18_ += i_19_;
	    i_16_++;
	    if (i_18_ >= 0) {
		i_17_--;
		i_18_ -= i_17_ << 1;
		int[] is = wh.O[i_12_ + i_17_];
		int[] is_20_ = wh.O[i_12_ - i_17_];
		int i_21_ = i_16_ + i_14_;
		int i_22_ = i_14_ - i_16_;
		kg.a(i_22_, is, i_13_, i_21_, -126);
		kg.a(i_22_, is_20_, i_13_, i_21_, -106);
	    }
	    int i_23_ = i_14_ + i_17_;
	    int i_24_ = i_14_ - i_17_;
	    int[] is = wh.O[i_16_ + i_12_];
	    int[] is_25_ = wh.O[i_12_ - i_16_];
	    kg.a(i_24_, is, i_13_, i_23_, 69);
	    kg.a(i_24_, is_25_, i_13_, i_23_, i_15_ + 26);
	}
    }
    
    final int[][] a(int i, boolean bool) {
	K++;
	int[][] is = ((mca) this).B.a(i, -49);
	if (bool != true)
	    N = 40;
	if (((td) ((mca) this).B).p) {
	    int[][] is_26_ = this.a(0, !I ? i : bc.d - i, 0);
	    int[] is_27_ = is_26_[0];
	    int[] is_28_ = is_26_[1];
	    int[] is_29_ = is_26_[2];
	    int[] is_30_ = is[0];
	    int[] is_31_ = is[1];
	    int[] is_32_ = is[2];
	    if (P) {
		for (int i_33_ = 0; i_33_ < fr.v; i_33_++) {
		    is_30_[i_33_] = is_27_[qf.g - i_33_];
		    is_31_[i_33_] = is_28_[qf.g - i_33_];
		    is_32_[i_33_] = is_29_[qf.g - i_33_];
		}
	    } else {
		for (int i_34_ = 0; fr.v > i_34_; i_34_++) {
		    is_30_[i_34_] = is_27_[i_34_];
		    is_31_[i_34_] = is_28_[i_34_];
		    is_32_[i_34_] = is_29_[i_34_];
		}
	    }
	}
	return is;
    }
    
    public Class_u() {
	super(1, false);
    }
}
