/* ow - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ow extends mca
{
    static GameInPacket incomingPacket9 = new GameInPacket(9, 20);
    static int I;
    static int J;
    private int K = 4096;
    private boolean L = true;
    static String settings = null;
    
    public ow() {
	super(1, false);
    }
    
    public static void c(byte i) {
	if (i >= -81)
	    incomingPacket9 = null;
	incomingPacket9 = null;
	settings = null;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_1_ = j;
	do {
	    if (i_1_ != 0) {
		if (i_1_ != 1)
		    break;
	    } else {
		K = bytesParser.readShort(13111);
		break;
	    }
	    L = bytesParser.readUnsignedByte(-9268) == 1;
	} while (false);
	if (i != 1)
	    L = true;
	J++;
    }
    
    final int[][] a(int i, boolean bool) {
	I++;
	int[][] is = ((mca) this).B.a(i, -108);
	if (((td) ((mca) this).B).p) {
	    int[] is_2_ = this.a(bc.d & i - 1, !bool, 0);
	    int[] is_3_ = this.a(i, false, 0);
	    int[] is_4_ = this.a(bc.d & i + 1, false, 0);
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    for (int i_8_ = 0; i_8_ < fr.v; i_8_++) {
		int i_9_ = K * (is_4_[i_8_] - is_2_[i_8_]);
		int i_10_
		    = (is_3_[i_8_ + 1 & qf.g] - is_3_[i_8_ - 1 & qf.g]) * K;
		int i_11_ = i_10_ >> 12;
		int i_12_ = i_9_ >> 12;
		int i_13_ = i_11_ * i_11_ >> 12;
		int i_14_ = i_12_ * i_12_ >> 12;
		int i_15_
		    = (int) (Math.sqrt((double) ((float) (i_13_
							  + (i_14_ + 4096))
						 / 4096.0F))
			     * 4096.0);
		int i_16_;
		int i_17_;
		int i_18_;
		if (i_15_ != 0) {
		    i_18_ = i_9_ / i_15_;
		    i_17_ = 16777216 / i_15_;
		    i_16_ = i_10_ / i_15_;
		} else {
		    i_16_ = 0;
		    i_17_ = 0;
		    i_18_ = 0;
		}
		if (L) {
		    i_18_ = (i_18_ >> 1) + 2048;
		    i_17_ = (i_17_ >> 1) + 2048;
		    i_16_ = 2048 + (i_16_ >> 1);
		}
		is_5_[i_8_] = i_16_;
		is_6_[i_8_] = i_18_;
		is_7_[i_8_] = i_17_;
	    }
	}
	if (bool != true)
	    return null;
	return is;
    }
}
