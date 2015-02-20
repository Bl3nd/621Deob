/* cm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cm extends mca
{
    static int H;
    static int I;
    static int J;
    static boolean K;
    static int L;
    static int M;
    static int[] N = new int[3];
    
    final int[][] a(int i, boolean bool) {
	I++;
	if (bool != true)
	    N = null;
	int[][] is = ((mca) this).B.a(i, -16);
	if (((td) ((mca) this).B).p) {
	    int[] is_0_ = is[0];
	    int[] is_1_ = is[1];
	    int[] is_2_ = is[2];
	    for (int i_3_ = 0; fr.v > i_3_; i_3_++) {
		b(i, (byte) 92, i_3_);
		int[][] is_4_ = this.a(0, lu.j, 0);
		is_0_[i_3_] = is_4_[0][cv.g];
		is_1_[i_3_] = is_4_[1][cv.g];
		is_2_[i_3_] = is_4_[2][cv.g];
	    }
	}
	return is;
    }
    
    public static void a(boolean bool) {
	N = null;
	if (bool != false)
	    a(-68, -120, -69, (byte) 125, 83, 1, -44, 107, -29, 51);
    }
    
    final int[] a(int i, int j) {
	int i_6_ = 1 % ((i - 81) / 36);
	J++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    for (int i_7_ = 0; fr.v > i_7_; i_7_++) {
		b(j, (byte) 92, i_7_);
		int[] is_8_ = this.a(lu.j, false, 0);
		is[i_7_] = is_8_[cv.g];
	    }
	}
	return is;
    }
    
    static final void a(int i, int i_9_, int i_10_, byte i_11_, int i_12_,
			int i_13_, int i_14_, int i_15_, int i_16_,
			int i_17_) {
	if (vaa.xb > i || jga.v < i || vaa.xb > i_16_ || jga.v < i_16_
	    || i_9_ < vaa.xb || jga.v < i_9_ || i_15_ < vaa.xb || i_15_ > jga.v
	    || i_10_ < Class_md.h || Class_db.o < i_10_ || Class_md.h > i_13_
	    || Class_db.o < i_13_ || i_17_ < Class_md.h || i_17_ > Class_db.o
	    || i_14_ < Class_md.h || i_14_ > Class_db.o)
	    oga.a(i_10_, i_13_, i_15_, i_16_, i_12_, i_9_, 0, i_14_, i_17_, i);
	else
	    sfa.a(i_10_, i_12_, i_13_, i_17_, i, (byte) -127, i_9_, i_14_,
		  i_16_, i_15_);
	if (i_11_ != 42)
	    K = true;
	M++;
    }
    
    private final void b(int i, byte i_18_, int i_19_) {
	H++;
	int i_20_ = js.p[i_19_];
	int i_21_ = Class_i.i[i];
	float f = (float) Math.atan2((double) (i_20_ - 2048),
				     (double) (i_21_ - 2048));
	if ((double) f >= -3.141592653589793
	    && (double) f <= -2.356194490192345) {
	    lu.j = i;
	    cv.g = i_19_;
	} else if (!((double) f <= -1.5707963267948966)
		   || !((double) f >= -2.356194490192345)) {
	    if ((double) f <= -0.7853981633974483
		&& (double) f >= -1.5707963267948966) {
		lu.j = i_19_;
		cv.g = fr.v - i;
	    } else if (!(f <= 0.0F) || !((double) f >= -0.7853981633974483)) {
		if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483)) {
		    if (!((double) f >= 0.7853981633974483)
			|| !((double) f <= 1.5707963267948966)) {
			if ((double) f >= 1.5707963267948966
			    && (double) f <= 2.356194490192345) {
			    lu.j = od.pb - i_19_;
			    cv.g = i;
			} else if ((double) f >= 2.356194490192345
				   && (double) f <= 3.141592653589793) {
			    lu.j = i;
			    cv.g = fr.v - i_19_;
			}
		    } else {
			cv.g = fr.v - i;
			lu.j = od.pb - i_19_;
		    }
		} else {
		    cv.g = fr.v - i_19_;
		    lu.j = od.pb - i;
		}
	    } else {
		cv.g = i_19_;
		lu.j = od.pb - i;
	    }
	} else {
	    lu.j = i_19_;
	    cv.g = i;
	}
	lu.j &= bc.d;
	if (i_18_ != 92)
	    a(true);
	cv.g &= qf.g;
    }
    
    public cm() {
	super(1, false);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    if (j == 0)
		((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	    L++;
	}
    }
    
    static {
	K = false;
    }
}
