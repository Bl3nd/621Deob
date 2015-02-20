/* bba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bba extends tc
{
    static long S = 0L;
    static int T;
    
    final int[][] a(int i, boolean bool) {
	T++;
	int[][] is = ((mca) this).B.a(i, -103);
	if (((td) ((mca) this).B).p && this.c((byte) 5)) {
	    int[] is_0_ = is[0];
	    int[] is_1_ = is[1];
	    int[] is_2_ = is[2];
	    int i_3_ = i % ((tc) this).H * ((tc) this).H;
	    for (int i_4_ = 0; fr.v > i_4_; i_4_++) {
		int i_5_ = ((tc) this).I[i_3_ + i_4_ % ((tc) this).R];
		is_2_[i_4_] = uca.a(255, i_5_) << 4;
		is_1_[i_4_] = uca.a(65280, i_5_) >> 4;
		is_0_[i_4_] = uca.a(i_5_, 16711680) >> 12;
	    }
	}
	if (bool != true)
	    return null;
	return is;
    }
    
    public bba() {
	/* empty */
    }
}
