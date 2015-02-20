/* jo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jo extends mca
{
    static int H;
    private int I = 2048;
    static int J;
    static int K;
    static int L;
    static int M;
    private int N;
    private int O;
    private int P;
    private int Q = 0;
    static int R;
    static int S;
    private int T;
    private int U;
    static int V;
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_1_ = j;
    while_68_:
	do {
	while_67_:
	    do {
	    while_66_:
		do {
		while_65_:
		    do {
		    while_64_:
			do {
			    do {
				if (i_1_ != 0) {
				    if (i_1_ != 1) {
					if (i_1_ != 2) {
					    if (i_1_ != 3) {
						if (i_1_ != 4) {
						    if (i_1_ != 5) {
							if (i_1_ == 6)
							    break while_67_;
							break while_68_;
						    }
						} else
						    break while_65_;
						break while_66_;
					    }
					} else
					    break;
					break while_64_;
				    }
				} else {
				    I = bytesParser.readShort(13111);
				    break while_68_;
				}
				O = bytesParser.readShort(13111);
				break while_68_;
			    } while (false);
			    Q = bytesParser.readShort(13111);
			    break while_68_;
			} while (false);
			N = bytesParser.readShort(13111);
			break while_68_;
		    } while (false);
		    U = bytesParser.readShort(13111);
		    break while_68_;
		} while (false);
		P = bytesParser.readShort(13111);
		break while_68_;
	    } while (false);
	    T = bytesParser.readShort(i ^ 0x3336);
	} while (false);
	H++;
	if (i != 1)
	    a((int) -42, (String) null, -6);
    }
    
    final void b(int i) {
	lp.d(0);
	int i_2_ = 68 % ((i - 64) / 60);
	K++;
    }
    
    public jo() {
	super(0, true);
	O = 0;
	N = 2048;
	T = 8192;
	P = 4096;
	U = 12288;
    }
    
    static final int a(int i, String string, int i_3_) {
	M++;
	if (i != -4096)
	    return 38;
	return ur.a(string, true, i_3_, (byte) 124);
    }
    
    private final boolean a(byte i, int i_4_, int i_5_) {
	L++;
	int i_6_ = U * (i_5_ - i_4_) >> 12;
	if (i != 127)
	    a((int) -41, (String) null, 9);
	int i_7_ = ok.H[(i_6_ * 255 & 0xff7c9) >> 12];
	i_7_ = (i_7_ << 12) / U;
	i_7_ = (i_7_ << 12) / T;
	i_7_ = i_7_ * P >> 12;
	if (i_7_ <= i_5_ + i_4_ || i_4_ + i_5_ <= -i_7_)
	    return false;
	return true;
    }
    
    private final boolean b(int i, int i_8_, int i_9_) {
	V++;
	int i_10_ = (i_8_ + i_9_) * U >> 12;
	int i_11_ = -64 % ((i - 67) / 47);
	int i_12_ = ok.H[(0xff3a3 & i_10_ * 255) >> 12];
	i_12_ = (i_12_ << 12) / U;
	i_12_ = (i_12_ << 12) / T;
	i_12_ = i_12_ * P >> 12;
	if (i_9_ - i_8_ >= i_12_ || i_9_ - i_8_ <= -i_12_)
	    return false;
	return true;
    }
    
    final int[] a(int i, int j) {
	S++;
	int[] is = ((mca) this).s.a(j, true);
	int i_14_ = 3 % ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int i_15_ = Class_i.i[j] - 2048;
	    for (int i_16_ = 0; fr.v > i_16_; i_16_++) {
		int i_17_ = js.p[i_16_] - 2048;
		int i_18_ = I + i_17_;
		i_18_ = i_18_ >= -2048 ? i_18_ : i_18_ + 4096;
		i_18_ = i_18_ > 2048 ? i_18_ - 4096 : i_18_;
		int i_19_ = i_15_ + O;
		i_19_ = i_19_ < -2048 ? i_19_ + 4096 : i_19_;
		i_19_ = i_19_ > 2048 ? i_19_ - 4096 : i_19_;
		int i_20_ = i_17_ + Q;
		i_20_ = i_20_ >= -2048 ? i_20_ : i_20_ + 4096;
		i_20_ = i_20_ <= 2048 ? i_20_ : i_20_ - 4096;
		int i_21_ = N + i_15_;
		i_21_ = i_21_ >= -2048 ? i_21_ : i_21_ + 4096;
		i_21_ = i_21_ > 2048 ? i_21_ - 4096 : i_21_;
		is[i_16_] = a((byte) 127, i_18_, i_19_) || b(-83, i_20_,
							     i_21_) ? 4096 : 0;
	    }
	}
	return is;
    }
    
    static final it b(int i, boolean bool) {
	R++;
	if (bool != true)
	    return null;
	it var_it = (it) nfa.a.a((byte) 97, (long) i);
	if (var_it != null)
	    return var_it;
	byte[] is = Class_nd.n.b(0, -107, i);
	if (is == null || is.length <= 1)
	    return null;
	var_it = naa.a(is, -49);
	nfa.a.a(var_it, false, (long) i);
	return var_it;
    }
}
