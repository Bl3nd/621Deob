/* ofa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class ofa extends mca
{
    static int H;
    static rn I;
    private int J = 1;
    static int K;
    static int L;
    static int M;
    static int N;
    static int O = -1;
    private int P = 1;
    
    static final qba a(int i, int i_0_, byte i_1_) {
	int i_2_ = -105 / ((i_1_ - 43) / 43);
	L++;
	qba var_qba = (qba) qd.p.a(-32748, (long) i_0_ | (long) i << 32);
	if (var_qba == null) {
	    var_qba = new qba(i, i_0_);
	    qd.p.a(var_qba, (byte) -58, ((Node) var_qba).nodeID);
	}
	return var_qba;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	N++;
	int i_4_ = j;
    while_115_:
	do {
	    do {
		if (i_4_ != 0) {
		    if (i_4_ != 1) {
			if (i_4_ == 2)
			    break;
			break while_115_;
		    }
		} else {
		    J = bytesParser.readUnsignedByte(i ^ ~0x2432);
		    break while_115_;
		}
		P = bytesParser.readUnsignedByte(-9268);
		break while_115_;
	    } while (false);
	    ((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	} while (false);
	if (i != 1)
	    a(119, 34);
    }
    
    static final byte[] a(byte i, File file) {
	if (i != -103)
	    return null;
	H++;
	return vd.a((byte) 53, file, (int) file.length());
    }
    
    final int[][] a(int i, boolean bool) {
	if (bool != true)
	    return null;
	M++;
	int[][] is = ((mca) this).B.a(i, -126);
	if (((td) ((mca) this).B).p) {
	    int i_5_ = P + 1 + P;
	    int i_6_ = 65536 / i_5_;
	    int i_7_ = J + J + 1;
	    int i_8_ = 65536 / i_7_;
	    int[][][] is_9_ = new int[i_5_][][];
	    for (int i_10_ = i - P; i + P >= i_10_; i_10_++) {
		int[][] is_11_ = this.a(0, i_10_ & bc.d, (int) 0);
		int[][] is_12_ = new int[3][fr.v];
		int i_13_ = 0;
		int i_14_ = 0;
		int i_15_ = 0;
		int[] is_16_ = is_11_[0];
		int[] is_17_ = is_11_[1];
		int[] is_18_ = is_11_[2];
		for (int i_19_ = -J; i_19_ <= J; i_19_++) {
		    int i_20_ = i_19_ & qf.g;
		    i_14_ += is_17_[i_20_];
		    i_15_ += is_18_[i_20_];
		    i_13_ += is_16_[i_20_];
		}
		int[] is_21_ = is_12_[0];
		int[] is_22_ = is_12_[1];
		int[] is_23_ = is_12_[2];
		int i_24_ = 0;
		while (fr.v > i_24_) {
		    is_21_[i_24_] = i_8_ * i_13_ >> 16;
		    is_22_[i_24_] = i_8_ * i_14_ >> 16;
		    is_23_[i_24_] = i_15_ * i_8_ >> 16;
		    int i_25_ = qf.g & i_24_ - J;
		    i_14_ -= is_17_[i_25_];
		    i_15_ -= is_18_[i_25_];
		    i_13_ -= is_16_[i_25_];
		    i_24_++;
		    i_25_ = qf.g & i_24_ + J;
		    i_14_ += is_17_[i_25_];
		    i_15_ += is_18_[i_25_];
		    i_13_ += is_16_[i_25_];
		}
		is_9_[i_10_ + P - i] = is_12_;
	    }
	    int[] is_26_ = is[0];
	    int[] is_27_ = is[1];
	    int[] is_28_ = is[2];
	    for (int i_29_ = 0; fr.v > i_29_; i_29_++) {
		int i_30_ = 0;
		int i_31_ = 0;
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < i_5_; i_33_++) {
		    int[][] is_34_ = is_9_[i_33_];
		    i_30_ += is_34_[0][i_29_];
		    i_32_ += is_34_[2][i_29_];
		    i_31_ += is_34_[1][i_29_];
		}
		is_26_[i_29_] = i_6_ * i_30_ >> 16;
		is_27_[i_29_] = i_31_ * i_6_ >> 16;
		is_28_[i_29_] = i_32_ * i_6_ >> 16;
	    }
	}
	return is;
    }
    
    public static void a(boolean bool) {
	if (bool == true)
	    I = null;
    }
    
    public ofa() {
	super(1, false);
    }
    
    final int[] a(int i, int j) {
	K++;
	int[] is = ((mca) this).s.a(j, true);
	int i_36_ = -24 / ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int i_37_ = P + P + 1;
	    int i_38_ = 65536 / i_37_;
	    int i_39_ = J + (J + 1);
	    int i_40_ = 65536 / i_39_;
	    int[][] is_41_ = new int[i_37_][];
	    for (int i_42_ = j - P; i_42_ <= j + P; i_42_++) {
		int[] is_43_ = this.a(bc.d & i_42_, false, 0);
		int[] is_44_ = new int[fr.v];
		int i_45_ = 0;
		for (int i_46_ = -J; i_46_ <= J; i_46_++)
		    i_45_ += is_43_[i_46_ & qf.g];
		int i_47_ = 0;
		while (fr.v > i_47_) {
		    is_44_[i_47_] = i_40_ * i_45_ >> 16;
		    i_45_ -= is_43_[i_47_ - J & qf.g];
		    i_47_++;
		    i_45_ += is_43_[qf.g & i_47_ + J];
		}
		is_41_[P + (i_42_ - j)] = is_44_;
	    }
	    for (int i_48_ = 0; fr.v > i_48_; i_48_++) {
		int i_49_ = 0;
		for (int i_50_ = 0; i_37_ > i_50_; i_50_++)
		    i_49_ += is_41_[i_50_][i_48_];
		is[i_48_] = i_49_ * i_38_ >> 16;
	    }
	}
	return is;
    }
}
