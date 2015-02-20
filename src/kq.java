/* kq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kq extends mca
{
    private int[] H;
    static int I;
    static int J;
    static int K;
    private int[] L;
    private short[] M = new short[257];
    static int N;
    static GameOutPacket O;
    static int P;
    private int[][] Q;
    static int R;
    static int[] S = new int[50];
    private int T = 0;
    static int[] U;
    static int V;
    static pl W;
    static int X;
    
    public kq() {
	super(1, true);
    }
    
    final void b(int i) {
	if (Q == null)
	    Q = new int[][] { new int[2], { 4096, 4096 } };
	N++;
	if (Q.length < 2)
	    throw new RuntimeException
		      ("Curve operation requires at least two markers");
	if (T == 2)
	    j(76);
	int i_0_ = 18 / ((i - 64) / 60);
	lp.d(0);
	k(-99);
    }
    
    static final bw a(boolean bool, BytesParser var_es) {
	I++;
	iea var_iea = la.a(71, var_es);
	int i = var_es.readInt(71);
	int i_1_ = var_es.readInt(82);
	int i_2_ = var_es.readShort(13111);
	if (bool != true)
	    a(33, 78, true);
	return new bw(((iea) var_iea).m, ((iea) var_iea).j, ((iea) var_iea).k,
		      ((iea) var_iea).d, ((iea) var_iea).i, ((iea) var_iea).e,
		      ((iea) var_iea).g, ((iea) var_iea).b, ((iea) var_iea).f,
		      i, i_1_, i_2_);
    }
    
    public static void i(int i) {
	O = null;
	U = null;
	S = null;
	int i_3_ = 97 / ((31 - i) / 42);
	W = null;
    }
    
    static final boolean a(int i, int i_4_, boolean bool) {
	X++;
	if (bool != true)
	    O = null;
	return client.a(/*(byte) 95,*/ i, i_4_) & Class_jc.a(i, i_4_, -101);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	V++;
	if (j == 0) {
	    T = bytesParser.readUnsignedByte(-9268);
	    Q = new int[bytesParser.readUnsignedByte(i - 9269)][2];
	    for (int i_6_ = 0; Q.length > i_6_; i_6_++) {
		Q[i_6_][0] = bytesParser.readShort(13111);
		Q[i_6_][1] = bytesParser.readShort(13111);
	    }
	}
	if (i != 1)
	    T = -19;
    }
    
    final int[] a(int i, int j) {
	K++;
	int i_8_ = 55 / ((81 - i) / 36);
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int[] is_9_ = this.a(j, false, 0);
	    for (int i_10_ = 0; fr.v > i_10_; i_10_++) {
		int i_11_ = is_9_[i_10_] >> 4;
		if (i_11_ < 0)
		    i_11_ = 0;
		if (i_11_ > 256)
		    i_11_ = 256;
		is[i_10_] = M[i_11_];
	    }
	}
	return is;
    }
    
    private final void j(int i) {
	J++;
	int[] is = Q[0];
	int[] is_12_ = Q[1];
	int[] is_13_ = Q[Q.length - 2];
	if (i <= 56)
	    M = null;
	int[] is_14_ = Q[Q.length - 1];
	H = new int[] { is_13_[0] - is_14_[0] + is_13_[0],
			is_13_[1] - is_14_[1] + is_13_[1] };
	L = new int[] { is[0] - (is_12_[0] - is[0]),
			-is_12_[1] - (-is[1] - is[1]) };
    }
    
    private final void k(int i) {
	P++;
	if (i > -67)
	    i(113);
	int i_15_ = T;
	do {
	    if (i_15_ != 2) {
		if (i_15_ != 1)
		    break;
	    } else {
		for (i_15_ = 0; i_15_ < 257; i_15_++) {
		    int i_16_ = i_15_ << 4;
		    int i_17_;
		    for (i_17_ = 1; i_17_ < Q.length - 1; i_17_++) {
			if (Q[i_17_][0] > i_16_)
			    break;
		    }
		    int[] is = Q[i_17_ - 1];
		    int[] is_18_ = Q[i_17_];
		    int i_19_ = b(i_17_ - 2, 0)[1];
		    int i_20_ = is[1];
		    int i_21_ = is_18_[1];
		    int i_22_ = b(i_17_ + 1, 0)[1];
		    int i_23_ = (i_16_ - is[0] << 12) / (is_18_[0] - is[0]);
		    int i_24_ = i_23_ * i_23_ >> 12;
		    int i_25_ = i_22_ - i_19_ - i_21_ + i_20_;
		    int i_26_ = -i_20_ - i_25_ + i_19_;
		    int i_27_ = i_21_ - i_19_;
		    int i_28_ = i_20_;
		    int i_29_ = i_24_ * (i_25_ * i_23_ >> 12) >> 12;
		    int i_30_ = i_24_ * i_26_ >> 12;
		    int i_31_ = i_27_ * i_23_ >> 12;
		    int i_32_ = i_31_ + i_29_ + i_30_ + i_28_;
		    if (i_32_ <= -32768)
			i_32_ = -32767;
		    if (i_32_ >= 32768)
			i_32_ = 32767;
		    M[i_15_] = (short) i_32_;
		}
		return;
	    }
	    for (i_15_ = 0; i_15_ < 257; i_15_++) {
		int i_33_ = i_15_ << 4;
		int i_34_;
		for (i_34_ = 1; Q.length - 1 > i_34_; i_34_++) {
		    if (i_33_ < Q[i_34_][0])
			break;
		}
		int[] is = Q[i_34_ - 1];
		int[] is_35_ = Q[i_34_];
		int i_36_ = (i_33_ - is[0] << 12) / (is_35_[0] - is[0]);
		int i_37_ = -ok.H[i_36_ >> 5 & 0xff] + 4096 >> 1;
		int i_38_ = 4096 - i_37_;
		int i_39_ = is_35_[1] * i_37_ + is[1] * i_38_ >> 12;
		if (i_39_ <= -32768)
		    i_39_ = -32767;
		if (i_39_ >= 32768)
		    i_39_ = 32767;
		M[i_15_] = (short) i_39_;
	    }
	    return;
	} while (false);
	for (i_15_ = 0; i_15_ < 257; i_15_++) {
	    int i_40_ = i_15_ << 4;
	    int i_41_;
	    for (i_41_ = 1; Q.length - 1 > i_41_; i_41_++) {
		if (Q[i_41_][0] > i_40_)
		    break;
	    }
	    int[] is = Q[i_41_ - 1];
	    int[] is_42_ = Q[i_41_];
	    int i_43_ = (i_40_ - is[0] << 12) / (is_42_[0] - is[0]);
	    int i_44_ = -i_43_ + 4096;
	    int i_45_ = is_42_[1] * i_43_ + i_44_ * is[1] >> 12;
	    if (i_45_ <= -32768)
		i_45_ = -32767;
	    if (i_45_ >= 32768)
		i_45_ = 32767;
	    M[i_15_] = (short) i_45_;
	}
    }
    
    private final int[] b(int i, int i_46_) {
	R++;
	if (i < i_46_)
	    return L;
	if (i >= Q.length)
	    return H;
	return Q[i];
    }
    
    static {
	O = new GameOutPacket(41, 7);
    }
}
