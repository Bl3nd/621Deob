/* sv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class sv extends mca
{
    static int H;
    private int I = 2000;
    private int J;
    private int K;
    private int L = 0;
    static int M;
    static int N;
    private int O;
    static GameInPacket completeLogoutGameInPacket = new GameInPacket(90, 0);
    static GameInPacket lobbyConnectionAliveGameInPacket = new GameInPacket(116, 0);
    static int R;
    static boolean S = false;
    static int T;
    
    final void b(int i) {
	int i_0_ = -58 / ((i - 64) / 60);
	lp.d(0);
	N++;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    H++;
	    int i_2_ = j;
	while_220_:
	    do {
	    while_219_:
		do {
		while_218_:
		    do {
			do {
			    if (i_2_ != 0) {
				if (i_2_ != 1) {
				    if (i_2_ != 2) {
					if (i_2_ != 3) {
					    if (i_2_ == 4)
						break while_219_;
					    break while_220_;
					}
				    } else
					break;
				    break while_218_;
				}
			    } else {
				L = bytesParser.readUnsignedByte(-9268);
				return;
			    }
			    I = bytesParser.readShort(13111);
			    return;
			} while (false);
			O = bytesParser.readUnsignedByte(-9268);
			return;
		    } while (false);
		    K = bytesParser.readShort(13111);
		    return;
		} while (false);
		J = bytesParser.readShort(13111);
	    } while (false);
	}
    }
    
    static final ce a(byte i, int i_3_) {
	R++;
	ce var_ce = (ce) mr.c.get((long) i_3_, (byte) 100);
	if (var_ce != null)
	    return var_ce;
	int i_4_ = 64 % ((i + 62) / 58);
	byte[] is = jj.m.b(i_3_, 75, 0);
	var_ce = new ce();
	if (is != null)
	    var_ce.a((byte) 91, new BytesParser(is));
	var_ce.a(-4);
	mr.c.put((long) i_3_, var_ce, 1);
	return var_ce;
    }
    
    final int[] a(int i, int j) {
	M++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int i_6_ = J >> 1;
	    int[][] is_7_ = ((mca) this).s.a(false);
	    Random random = new Random((long) L);
	    for (int i_8_ = 0; I > i_8_; i_8_++) {
		int i_9_ = J <= 0 ? K : K - i_6_ + it.a(random, J, 124);
		i_9_ = (0xff6 & i_9_) >> 4;
		int i_10_ = it.a(random, fr.v, 123);
		int i_11_ = it.a(random, od.pb, 123);
		int i_12_ = i_10_ + (ok.H[i_9_] * O >> 12);
		int i_13_ = i_11_ + (O * vh.d[i_9_] >> 12);
		int i_14_ = i_13_ - i_11_;
		int i_15_ = i_12_ - i_10_;
		if (i_15_ != 0 || i_14_ != 0) {
		    if (i_14_ < 0)
			i_14_ = -i_14_;
		    if (i_15_ < 0)
			i_15_ = -i_15_;
		    boolean bool = i_14_ > i_15_;
		    if (bool) {
			int i_16_ = i_10_;
			int i_17_ = i_12_;
			i_10_ = i_11_;
			i_11_ = i_16_;
			i_12_ = i_13_;
			i_13_ = i_17_;
		    }
		    if (i_10_ > i_12_) {
			int i_18_ = i_10_;
			int i_19_ = i_11_;
			i_10_ = i_12_;
			i_12_ = i_18_;
			i_11_ = i_13_;
			i_13_ = i_19_;
		    }
		    int i_20_ = i_11_;
		    int i_21_ = i_12_ - i_10_;
		    int i_22_ = i_13_ - i_11_;
		    int i_23_ = -i_21_ / 2;
		    int i_24_ = 2048 / i_21_;
		    int i_25_ = 1024 - (it.a(random, 4096, 122) >> 2);
		    int i_26_ = i_11_ < i_13_ ? 1 : -1;
		    if (i_22_ < 0)
			i_22_ = -i_22_;
		    for (int i_27_ = i_10_; i_27_ < i_12_; i_27_++) {
			int i_28_ = i_25_ + 1024 + (i_27_ - i_10_) * i_24_;
			int i_29_ = i_27_ & qf.g;
			int i_30_ = bc.d & i_20_;
			if (!bool)
			    is_7_[i_29_][i_30_] = i_28_;
			else
			    is_7_[i_30_][i_29_] = i_28_;
			i_23_ += i_22_;
			if (i_23_ > 0) {
			    i_23_ -= i_21_;
			    i_20_ = i_26_ + i_20_;
			}
		    }
		}
	    }
	}
	int i_31_ = -119 % ((i - 81) / 36);
	return is;
    }
    
    public sv() {
	super(0, true);
	K = 0;
	O = 16;
	J = 4096;
    }
    
    public static void i(int i) {
	lobbyConnectionAliveGameInPacket = null;
	completeLogoutGameInPacket = null;
	if (i != -1024)
	    completeLogoutGameInPacket = null;
    }
}
