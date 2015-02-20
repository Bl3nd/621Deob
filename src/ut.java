/* ut - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ut extends mca
{
    static int I;
    static int J;
    static GameInPacket logoutToLobbyGameInPacket = new GameInPacket(75, 0);
    static int L;
    private int[] M;
    static int N;
    private int O;
    private int P = 3216;
    private int Q;
    static int R;
    
    final int[] a(int i, int j) {
	R++;
	int i_1_ = 19 % ((81 - i) / 36);
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int i_2_ = O * Class_lc.bb >> 12;
	    int[] is_3_ = this.a(j - 1 & bc.d, false, 0);
	    int[] is_4_ = this.a(j, false, 0);
	    int[] is_5_ = this.a(j + 1 & bc.d, false, 0);
	    for (int i_6_ = 0; fr.v > i_6_; i_6_++) {
		int i_7_ = (is_5_[i_6_] - is_3_[i_6_]) * i_2_ >> 12;
		int i_8_
		    = ((is_4_[i_6_ - 1 & qf.g] - is_4_[qf.g & i_6_ + 1]) * i_2_
		       >> 12);
		int i_9_ = i_8_ >> 4;
		int i_10_ = i_7_ >> 4;
		if (i_9_ < 0)
		    i_9_ = -i_9_;
		if (i_10_ < 0)
		    i_10_ = -i_10_;
		if (i_9_ > 255)
		    i_9_ = 255;
		if (i_10_ > 255)
		    i_10_ = 255;
		int i_11_ = kk.n[(i_10_ * (i_10_ + 1) >> 1) + i_9_] & 0xff;
		int i_12_ = i_11_ * i_7_ >> 8;
		int i_13_ = i_11_ * i_8_ >> 8;
		int i_14_ = i_11_ * 4096 >> 8;
		i_13_ = M[0] * i_13_ >> 12;
		i_12_ = M[1] * i_12_ >> 12;
		i_14_ = M[2] * i_14_ >> 12;
		is[i_6_] = i_14_ + (i_12_ + i_13_);
	    }
	}
	return is;
    }
    
    public static void c(byte i) {
	logoutToLobbyGameInPacket = null;
	if (i >= -1)
	    c((byte) -53);
    }
    
    public ut() {
	super(1, true);
	M = new int[3];
	Q = 3216;
	O = 4096;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i != 1)
	    i(-31);
	J++;
	int i_16_ = j;
    while_227_:
	do {
	    do {
		if (i_16_ != 0) {
		    if (i_16_ != 1) {
			if (i_16_ == 2)
			    break;
			break while_227_;
		    }
		} else {
		    O = bytesParser.readShort(13111);
		    return;
		}
		P = bytesParser.readShort(13111);
		return;
	    } while (false);
	    Q = bytesParser.readShort(13111);
	} while (false);
    }
    
    final void b(int i) {
	int i_17_ = 123 / ((i - 64) / 60);
	L++;
	i(4096);
    }
    
    private final void i(int i) {
	N++;
	double d = Math.cos((double) ((float) Q / 4096.0F));
	M[0] = (int) (Math.sin((double) ((float) P / 4096.0F)) * d
		      * (double) i);
	M[1] = (int) (4096.0 * (d * Math.cos((double) ((float) P / 4096.0F))));
	M[2] = (int) (4096.0 * Math.sin((double) ((float) Q / 4096.0F)));
	int i_18_ = M[0] * M[0] >> 12;
	int i_19_ = M[1] * M[1] >> 12;
	int i_20_ = M[2] * M[2] >> 12;
	int i_21_ = (int) (4096.0 * Math.sqrt((double) (i_20_ + (i_19_ + i_18_)
							>> 12)));
	if (i_21_ != 0) {
	    M[2] = (M[2] << 12) / i_21_;
	    M[1] = (M[1] << 12) / i_21_;
	    M[0] = (M[0] << 12) / i_21_;
	}
    }
}
