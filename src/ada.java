/* ada - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ada extends mca
{
    static int H;
    private int I;
    private int J;
    private int K;
    private int[] L = new int[3];
    static pl M;
    static int N;
    static int O;
    private int P;
    static int Q;
    
    final void a(int i, BytesParser bytesParser, int j) {
	Q++;
	int i_1_ = j;
    while_2_:
	do {
	while_1_:
	    do {
	    while_0_:
		do {
		    do {
			if (i_1_ != 0) {
			    if (i_1_ != 1) {
				if (i_1_ != 2) {
				    if (i_1_ != 3) {
					if (i_1_ == 4)
					    break while_1_;
					break while_2_;
				    }
				} else
				    break;
				break while_0_;
			    }
			} else {
			    I = bytesParser.readShort(13111);
			    break while_2_;
			}
			J = bytesParser.readShort(13111);
			break while_2_;
		    } while (false);
		    K = bytesParser.readShort(13111);
		    break while_2_;
		} while (false);
		P = bytesParser.readShort(i ^ 0x3336);
		break while_2_;
	    } while (false);
	    int i_2_ = bytesParser.readTribyte(i - 2);
	    L[2] = uca.a(i_2_, 255) >> 12;
	    L[0] = uca.a(267386880, i_2_ << 4);
	    L[1] = uca.a(65280, i_2_) >> 4;
	} while (false);
	if (i != 1)
	    i(-128);
    }
    
    public static void i(int i) {
	M = null;
	if (i != 0)
	    N = -49;
    }
    
    final int[][] a(int i, boolean bool) {
	O++;
	int[][] is = ((mca) this).B.a(i, -103);
	if (bool != true)
	    P = 35;
	if (((td) ((mca) this).B).p) {
	    int[][] is_3_ = this.a(0, i, 0);
	    int[] is_4_ = is_3_[0];
	    int[] is_5_ = is_3_[1];
	    int[] is_6_ = is_3_[2];
	    int[] is_7_ = is[0];
	    int[] is_8_ = is[1];
	    int[] is_9_ = is[2];
	    for (int i_10_ = 0; i_10_ < fr.v; i_10_++) {
		int i_11_ = is_4_[i_10_];
		int i_12_ = i_11_ - L[0];
		if (i_12_ < 0)
		    i_12_ = -i_12_;
		if (I < i_12_) {
		    is_7_[i_10_] = i_11_;
		    is_8_[i_10_] = is_5_[i_10_];
		    is_9_[i_10_] = is_6_[i_10_];
		} else {
		    int i_13_ = is_5_[i_10_];
		    i_12_ = i_13_ - L[1];
		    if (i_12_ < 0)
			i_12_ = -i_12_;
		    if (i_12_ > I) {
			is_7_[i_10_] = i_11_;
			is_8_[i_10_] = i_13_;
			is_9_[i_10_] = is_6_[i_10_];
		    } else {
			int i_14_ = is_6_[i_10_];
			i_12_ = i_14_ - L[2];
			if (i_12_ < 0)
			    i_12_ = -i_12_;
			if (i_12_ > I) {
			    is_7_[i_10_] = i_11_;
			    is_8_[i_10_] = i_13_;
			    is_9_[i_10_] = i_14_;
			} else {
			    is_7_[i_10_] = i_11_ * P >> 12;
			    is_8_[i_10_] = i_13_ * K >> 12;
			    is_9_[i_10_] = J * i_14_ >> 12;
			}
		    }
		}
	    }
	}
	return is;
    }
    
    public ada() {
	super(1, false);
	K = 4096;
	I = 409;
	P = 4096;
	J = 4096;
    }
}
