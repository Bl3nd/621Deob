/* gu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gu extends mca
{
    static int H;
    static int I;
    static int[] J = new int[5];
    static int K;
    
    public static void a(boolean bool) {
	J = null;
	if (bool != false)
	    J = null;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (j == 0)
	    ((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	if (i != 1)
	    a(true);
	H++;
    }
    
    final int[] a(int i, int j) {
	K++;
	int[] is = ((mca) this).s.a(j, true);
	int i_2_ = -7 % ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int[] is_3_ = this.a(j, false, 0);
	    int[] is_4_ = this.a(j, false, 1);
	    int[] is_5_ = this.a(j, false, 2);
	    for (int i_6_ = 0; fr.v > i_6_; i_6_++) {
		int i_7_ = is_5_[i_6_];
		if (i_7_ == 4096)
		    is[i_6_] = is_3_[i_6_];
		else if (i_7_ != 0)
		    is[i_6_]
			= (is_4_[i_6_] * (4096 - i_7_) + i_7_ * is_3_[i_6_]
			   >> 12);
		else
		    is[i_6_] = is_4_[i_6_];
	    }
	}
	return is;
    }
    
    public gu() {
	super(3, false);
    }
    
    final int[][] a(int i, boolean bool) {
	I++;
	int[][] is = ((mca) this).B.a(i, -84);
	if (((td) ((mca) this).B).p) {
	    int[] is_8_ = this.a(i, !bool, 2);
	    int[][] is_9_ = this.a(0, i, 0);
	    int[][] is_10_ = this.a(1, i, 0);
	    int[] is_11_ = is[0];
	    int[] is_12_ = is[1];
	    int[] is_13_ = is[2];
	    int[] is_14_ = is_9_[0];
	    int[] is_15_ = is_9_[1];
	    int[] is_16_ = is_9_[2];
	    int[] is_17_ = is_10_[0];
	    int[] is_18_ = is_10_[1];
	    int[] is_19_ = is_10_[2];
	    for (int i_20_ = 0; i_20_ < fr.v; i_20_++) {
		int i_21_ = is_8_[i_20_];
		if (i_21_ != 4096) {
		    if (i_21_ == 0) {
			is_11_[i_20_] = is_17_[i_20_];
			is_12_[i_20_] = is_18_[i_20_];
			is_13_[i_20_] = is_19_[i_20_];
		    } else {
			int i_22_ = -i_21_ + 4096;
			is_11_[i_20_]
			    = (i_21_ * is_14_[i_20_] + i_22_ * is_17_[i_20_]
			       >> 12);
			is_12_[i_20_]
			    = (i_21_ * is_15_[i_20_] + is_18_[i_20_] * i_22_
			       >> 12);
			is_13_[i_20_]
			    = (i_22_ * is_19_[i_20_] + i_21_ * is_16_[i_20_]
			       >> 12);
		    }
		} else {
		    is_11_[i_20_] = is_14_[i_20_];
		    is_12_[i_20_] = is_15_[i_20_];
		    is_13_[i_20_] = is_16_[i_20_];
		}
	    }
	}
	if (bool != true)
	    J = null;
	return is;
    }
}
