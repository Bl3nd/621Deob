/* wg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wg extends mca
{
    static int H;
    static int I;
    private int J = 0;
    static long K;
    static GameInPacket playerUpdateGameInPacket = new GameInPacket(61, -2);
    private int M;
    private int N = 0;
    static int O;
    private int P;
    static int Q;
    
    public wg() {
	super(0, true);
	M = 20;
	P = 1365;
    }
    
    static final boolean a(int i, int i_0_, boolean bool) {
	H++;
	if (bool != false)
	    playerUpdateGameInPacket = null;
	if ((i_0_ & 0x21) == 0)
	    return false;
	return true;
    }
    
    static final void a(byte i, Interface var_kp, int i_1_, int i_2_) {
	pg.h = i_1_;
	I++;
	fp.p = i_2_;
	qg.d = var_kp;
	if (i <= 50)
	    a((byte) 9, (Interface) null, -63, -54);
    }
    
    public static void i(int i) {
	int i_3_ = -94 % ((-62 - i) / 34);
	playerUpdateGameInPacket = null;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	O++;
	int i_5_ = j;
    while_243_:
	do {
	while_242_:
	    do {
		do {
		    if (i_5_ != 0) {
			if (i_5_ != 1) {
			    if (i_5_ != 2) {
				if (i_5_ != 3)
				    break while_243_;
			    } else
				break;
			    break while_242_;
			}
		    } else {
			P = bytesParser.readShort(13111);
			break while_243_;
		    }
		    M = bytesParser.readShort(13111);
		    break while_243_;
		} while (false);
		N = bytesParser.readShort(13111);
		break while_243_;
	    } while (false);
	    J = bytesParser.readShort(13111);
	} while (false);
	if (i != 1)
	    i(-105);
    }
    
    final int[] a(int i, int j) {
	Q++;
	int i_7_ = -89 % ((i - 81) / 36);
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    for (int i_8_ = 0; i_8_ < fr.v; i_8_++) {
		int i_9_ = N + (js.p[i_8_] << 12) / P;
		int i_10_ = J + (Class_i.i[j] << 12) / P;
		int i_11_ = i_9_;
		int i_12_ = i_10_;
		int i_13_ = i_9_;
		int i_14_ = i_10_;
		int i_15_ = i_9_ * i_9_ >> 12;
		int i_16_ = i_10_ * i_10_ >> 12;
		int i_17_;
		for (i_17_ = 0; i_15_ + i_16_ < 16384 && M > i_17_; i_17_++) {
		    i_14_ = i_12_ + (i_14_ * i_13_ >> 12) * 2;
		    i_13_ = i_11_ - i_16_ + i_15_;
		    i_16_ = i_14_ * i_14_ >> 12;
		    i_15_ = i_13_ * i_13_ >> 12;
		}
		is[i_8_] = M - 1 > i_17_ ? (i_17_ << 12) / M : 0;
	    }
	}
	return is;
    }
}
