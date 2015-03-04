/* rq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rq extends mca
{
    static int H = 0;
    static int I;
    static int J;
    static int K = -1;
    private int L = 585;
    static float M;
    static int N = 0;
    static int O;
    
    final int[] a(int i, int j) {
	J++;
	int[] is = ((mca) this).s.a(j, true);
	int i_1_ = 91 / ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int i_2_ = Class_i.i[j];
	    for (int i_3_ = 0; i_3_ < fr.v; i_3_++) {
		int i_4_ = js.p[i_3_];
		if (i_4_ > L && i_4_ < 4096 - L && -L + 2048 < i_2_
		    && L + 2048 > i_2_) {
		    int i_5_ = -i_4_ + 2048;
		    i_5_ = i_5_ >= 0 ? i_5_ : -i_5_;
		    i_5_ <<= 12;
		    i_5_ /= -L + 2048;
		    is[i_3_] = 4096 - i_5_;
		} else if (i_4_ > 2048 - L && i_4_ < 2048 + L) {
		    int i_6_ = i_2_ - 2048;
		    i_6_ = i_6_ < 0 ? -i_6_ : i_6_;
		    i_6_ -= L;
		    i_6_ <<= 12;
		    is[i_3_] = i_6_ / (2048 - L);
		} else if (i_2_ < L || i_2_ > -L + 4096) {
		    int i_7_ = i_4_ - 2048;
		    i_7_ = i_7_ >= 0 ? i_7_ : -i_7_;
		    i_7_ -= L;
		    i_7_ <<= 12;
		    is[i_3_] = i_7_ / (-L + 2048);
		} else if (i_4_ < L || i_4_ > 4096 - L) {
		    int i_8_ = -i_2_ + 2048;
		    i_8_ = i_8_ >= 0 ? i_8_ : -i_8_;
		    i_8_ <<= 12;
		    i_8_ /= -L + 2048;
		    is[i_3_] = -i_8_ + 4096;
		} else
		    is[i_3_] = 0;
	    }
	}
	return is;
    }
    
    public rq() {
	super(0, true);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_10_ = j;
	if (i_10_ == 0)
	    L = bytesParser.readShort(13111);
	if (i != 1)
	    H = -88;
	I++;
    }
    
    static final int a(int i, int i_11_, int i_12_, int i_13_, byte i_14_) {
	if (i_14_ >= -69)
	    K = -89;
	O++;
	int i_15_ = -GameInPacket.ints2[i_11_ * 8192 / i] + 65536 >> 1;
	return (i_13_ * i_15_ >> 16) + (i_12_ * (65536 - i_15_) >> 16);
    }
}
