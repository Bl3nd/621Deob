/* ea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ea extends mca
{
    static GameOutPacket H = new GameOutPacket(20, 6);
    static int I;
    private int J = 4096;
    static int thisCountry;
    private int L = 0;
    static boolean[] M = new boolean[8];
    static f N;
    static int O;
    static int P;
    
    public static void i(int i) {
	M = null;
	H = null;
	if (i < 23)
	    i(-17);
	N = null;
    }
    
    final int[][] a(int i, boolean bool) {
	P++;
	if (bool != true)
	    a(6, 70);
	int[][] is = ((mca) this).B.a(i, -70);
	if (((td) ((mca) this).B).p) {
	    int[][] is_0_ = this.a(0, i, 0);
	    int[] is_1_ = is_0_[0];
	    int[] is_2_ = is_0_[1];
	    int[] is_3_ = is_0_[2];
	    int[] is_4_ = is[0];
	    int[] is_5_ = is[1];
	    int[] is_6_ = is[2];
	    for (int i_7_ = 0; i_7_ < fr.v; i_7_++) {
		int i_8_ = is_1_[i_7_];
		int i_9_ = is_2_[i_7_];
		int i_10_ = is_3_[i_7_];
		if (i_8_ >= L) {
		    if (J < i_8_)
			is_4_[i_7_] = J;
		    else
			is_4_[i_7_] = i_8_;
		} else
		    is_4_[i_7_] = L;
		if (i_9_ < L)
		    is_5_[i_7_] = L;
		else if (i_9_ > J)
		    is_5_[i_7_] = J;
		else
		    is_5_[i_7_] = i_9_;
		if (L > i_10_)
		    is_6_[i_7_] = L;
		else if (i_10_ > J)
		    is_6_[i_7_] = J;
		else
		    is_6_[i_7_] = i_10_;
	    }
	}
	return is;
    }
    
    final int[] a(int i, int j) {
	I++;
	int i_12_ = -112 / ((81 - i) / 36);
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int[] is_13_ = this.a(j, false, 0);
	    for (int i_14_ = 0; i_14_ < fr.v; i_14_++) {
		int i_15_ = is_13_[i_14_];
		if (L > i_15_)
		    is[i_14_] = L;
		else if (i_15_ > J)
		    is[i_14_] = J;
		else
		    is[i_14_] = i_15_;
	    }
	}
	return is;
    }
    
    public ea() {
	super(1, false);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	O++;
	if (i != 1)
	    thisCountry = 53;
	int i_17_ = j;
    while_26_:
	do {
	    do {
		if (i_17_ != 0) {
		    if (i_17_ != 1) {
			if (i_17_ == 2)
			    break;
			break while_26_;
		    }
		} else {
		    L = bytesParser.readShort(13111);
		    return;
		}
		J = bytesParser.readShort(13111);
		return;
	    } while (false);
	    ((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	} while (false);
    }
}
