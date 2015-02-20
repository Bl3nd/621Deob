/* gh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gh extends mca
{
    static wea H;
    private int J = 32768;
    static int K;
    static int L;
    static int[] M = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1,
		       1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };
    static int N;
    static int O;
    static il P;
    static int[] Q;
    static pt R;
    
    final void b(int i) {
	lp.d(0);
	N++;
	int i_0_ = 83 % ((64 - i) / 60);
    }
    
    final int[] a(int i, int j) {
	K++;
	int[] is = ((mca) this).s.a(j, true);
	int i_2_ = -40 % ((i - 81) / 36);
	if (((oca) ((mca) this).s).o) {
	    int[] is_3_ = this.a(j, false, 1);
	    int[] is_4_ = this.a(j, false, 2);
	    for (int i_5_ = 0; i_5_ < fr.v; i_5_++) {
		int i_6_ = (0xff5 & is_3_[i_5_]) >> 4;
		int i_7_ = J * is_4_[i_5_] >> 12;
		int i_8_ = i_7_ * ok.H[i_6_] >> 12;
		int i_9_ = vh.d[i_6_] * i_7_ >> 12;
		int i_10_ = qf.g & i_5_ + (i_8_ >> 12);
		int i_11_ = j + (i_9_ >> 12) & bc.d;
		int[] is_12_ = this.a(i_11_, false, 0);
		is[i_5_] = is_12_[i_10_];
	    }
	}
	return is;
    }
    
    public gh() {
	super(3, false);
    }
    
    public static void i(int i) {
	P = null;
	R = null;
	M = null;
	Q = null;
	if (i != 1393315076)
	    i(-95);
	H = null;
    }
    
    final int[][] a(int i, boolean bool) {
	L++;
	int[][] is = ((mca) this).B.a(i, -53);
	if (bool != true)
	    return null;
	if (((td) ((mca) this).B).p) {
	    int[] is_13_ = this.a(i, false, 1);
	    int[] is_14_ = this.a(i, false, 2);
	    int[] is_15_ = is[0];
	    int[] is_16_ = is[1];
	    int[] is_17_ = is[2];
	    for (int i_18_ = 0; i_18_ < fr.v; i_18_++) {
		int i_19_ = (is_13_[i_18_] * 255 & 0xff276) >> 12;
		int i_20_ = is_14_[i_18_] * J >> 12;
		int i_21_ = i_20_ * ok.H[i_19_] >> 12;
		int i_22_ = i_20_ * vh.d[i_19_] >> 12;
		int i_23_ = (i_21_ >> 12) + i_18_ & qf.g;
		int i_24_ = (i_22_ >> 12) + i & bc.d;
		int[][] is_25_ = this.a(0, i_24_, 0);
		is_15_[i_18_] = is_25_[0][i_23_];
		is_16_[i_18_] = is_25_[1][i_23_];
		is_17_[i_18_] = is_25_[2][i_23_];
	    }
	}
	return is;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	O++;
	int i_27_ = j;
	do {
	    if (i_27_ != 0) {
		if (i_27_ != 1)
		    break;
	    } else {
		J = bytesParser.readShort(13111) << 4;
		break;
	    }
	    ((mca) this).m = bytesParser.readUnsignedByte(i - 9269) == 1;
	} while (false);
	if (i != 1)
	    b((int) 22);
    }
    
    static {
	H = new wea(8, 1);
	Q = new int[4096];
	P = new il(16);
    }
}
