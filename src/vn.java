/* vn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vn extends mca
{
    static int H;
    static int I;
    static int J = 0;
    static int K;
    static int L;
    static int M;
    static int N;
    static int O;
    static int[] P;
    private int Q = 4096;
    
    final int[] a(int i, int j) {
	int i_1_ = -57 % ((i - 81) / 36);
	L++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int[] is_2_ = this.a(j - 1 & bc.d, false, 0);
	    int[] is_3_ = this.a(j, false, 0);
	    int[] is_4_ = this.a(j + 1 & bc.d, false, 0);
	    for (int i_5_ = 0; fr.v > i_5_; i_5_++) {
		int i_6_ = Q * (is_4_[i_5_] - is_2_[i_5_]);
		int i_7_
		    = Q * (is_3_[qf.g & i_5_ + 1] - is_3_[qf.g & i_5_ - 1]);
		int i_8_ = i_7_ >> 12;
		int i_9_ = i_6_ >> 12;
		int i_10_ = i_8_ * i_8_ >> 12;
		int i_11_ = i_9_ * i_9_ >> 12;
		int i_12_
		    = (int) (Math.sqrt((double) ((float) (i_10_ + i_11_ + 4096)
						 / 4096.0F))
			     * 4096.0);
		int i_13_ = i_12_ != 0 ? 16777216 / i_12_ : 0;
		is[i_5_] = -i_13_ + 4096;
	    }
	}
	return is;
    }
    
    public vn() {
	super(1, true);
    }
    
    static final ega c(byte i) {
	N++;
	if (i != 65)
	    P = null;
	return OutputStreamSub.b(1, 105);
    }
    
    static final void i(int i) {
	if (i != 0)
	    O = 100;
	pu.m.c((byte) -43);
	H++;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (j == 0)
	    Q = bytesParser.readShort(13111);
	K++;
	if (i != 1)
	    Q = -69;
    }
    
    public static void d(byte i) {
	P = null;
	if (i != -23)
	    O = 60;
    }
    
    static final boolean j(int i) {
	I++;
	try {
	    qm var_qm = new qm();
	    if (i != 0)
		return true;
	    byte[] is = var_qm.a(to.a, i ^ 0x5);
	    aw.a(is, 70);
	    return true;
	} catch (Exception exception) {
	    return false;
	}
    }
}
