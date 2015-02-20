/* sr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sr extends mca
{
    private int[] H = new int[257];
    static int I;
    static int J;
    static fh K = new fh(7, 5);
    static int L;
    static int M;
    static int N;
    static int O;
    static int P;
    private int[][] Q;
    static int R;
    static pl S;
    static boolean[] T = new boolean[100];
    static tb U;
    static long V;
    
    final int[][] a(int i, boolean bool) {
	M++;
	int[][] is = ((mca) this).B.a(i, -118);
	if (((td) ((mca) this).B).p) {
	    int[] is_0_ = this.a(i, !bool, 0);
	    int[] is_1_ = is[0];
	    int[] is_2_ = is[1];
	    int[] is_3_ = is[2];
	    for (int i_4_ = 0; i_4_ < fr.v; i_4_++) {
		int i_5_ = is_0_[i_4_] >> 4;
		if (i_5_ < 0)
		    i_5_ = 0;
		if (i_5_ > 256)
		    i_5_ = 256;
		i_5_ = H[i_5_];
		is_1_[i_4_] = uca.a(i_5_, 16711680) >> 12;
		is_2_[i_4_] = uca.a(65280, i_5_) >> 4;
		is_3_[i_4_] = uca.a(i_5_ << 4, 4080);
	    }
	}
	if (bool != true)
	    j(-29);
	return is;
    }
    
    public sr() {
	super(1, false);
    }
    
    private final void b(int i, int i_6_) {
	J++;
    while_217_:
	do {
	    if (i_6_ != 0) {
		int i_7_ = i_6_;
	    while_216_:
		do {
		while_215_:
		    do {
		    while_214_:
			do {
			while_213_:
			    do {
				do {
				    if (i_7_ != 1) {
					if (i_7_ != 2) {
					    if (i_7_ != 3) {
						if (i_7_ != 4) {
						    if (i_7_ != 5) {
							if (i_7_ != 6)
							    break while_216_;
						    } else
							break while_214_;
						    break while_215_;
						}
					    } else
						break;
					    break while_213_;
					}
				    } else {
					Q = new int[2][4];
					Q[0][2] = 0;
					Q[0][3] = 0;
					Q[0][1] = 0;
					Q[0][0] = 0;
					Q[1][1] = 4096;
					Q[1][2] = 4096;
					Q[1][0] = 4096;
					Q[1][3] = 4096;
					break while_217_;
				    }
				    Q = new int[8][4];
				    Q[0][1] = 2650;
				    Q[0][2] = 2602;
				    Q[0][3] = 2361;
				    Q[0][0] = 0;
				    Q[1][0] = 2867;
				    Q[1][3] = 1558;
				    Q[1][2] = 1799;
				    Q[1][1] = 2313;
				    Q[2][0] = 3072;
				    Q[2][2] = 1734;
				    Q[2][1] = 2618;
				    Q[2][3] = 1413;
				    Q[3][0] = 3276;
				    Q[3][1] = 2296;
				    Q[3][2] = 1220;
				    Q[3][3] = 947;
				    Q[4][2] = 963;
				    Q[4][1] = 2072;
				    Q[4][3] = 722;
				    Q[4][0] = 3481;
				    Q[5][2] = 2152;
				    Q[5][1] = 2730;
				    Q[5][3] = 1766;
				    Q[5][0] = 3686;
				    Q[6][3] = 915;
				    Q[6][2] = 1060;
				    Q[6][0] = 3891;
				    Q[6][1] = 2232;
				    Q[7][0] = 4096;
				    Q[7][3] = 1140;
				    Q[7][2] = 1413;
				    Q[7][1] = 1686;
				    break while_217_;
				} while (false);
				Q = new int[7][4];
				Q[0][1] = 0;
				Q[0][2] = 0;
				Q[0][3] = 4096;
				Q[0][0] = 0;
				Q[1][2] = 4096;
				Q[1][0] = 663;
				Q[1][3] = 4096;
				Q[1][1] = 0;
				Q[2][0] = 1363;
				Q[2][3] = 0;
				Q[2][2] = 4096;
				Q[2][1] = 0;
				Q[3][1] = 4096;
				Q[3][3] = 0;
				Q[3][2] = 4096;
				Q[3][0] = 2048;
				Q[4][1] = 4096;
				Q[4][2] = 0;
				Q[4][0] = 2727;
				Q[4][3] = 0;
				Q[5][1] = 4096;
				Q[5][3] = 4096;
				Q[5][0] = 3411;
				Q[5][2] = 0;
				Q[6][1] = 0;
				Q[6][3] = 4096;
				Q[6][0] = 4096;
				Q[6][2] = 0;
				break while_217_;
			    } while (false);
			    Q = new int[6][4];
			    Q[0][3] = 0;
			    Q[0][0] = 0;
			    Q[0][2] = 0;
			    Q[0][1] = 0;
			    Q[1][1] = 0;
			    Q[1][3] = 1493;
			    Q[1][0] = 1843;
			    Q[1][2] = 0;
			    Q[2][3] = 2939;
			    Q[2][2] = 0;
			    Q[2][1] = 0;
			    Q[2][0] = 2457;
			    Q[3][3] = 3565;
			    Q[3][2] = 1124;
			    Q[3][0] = 2781;
			    Q[3][1] = 0;
			    Q[4][0] = 3481;
			    Q[4][1] = 546;
			    Q[4][2] = 3084;
			    Q[4][3] = 4031;
			    Q[5][3] = 4096;
			    Q[5][2] = 4096;
			    Q[5][1] = 4096;
			    Q[5][0] = 4096;
			    break while_217_;
			} while (false);
			Q = new int[16][4];
			Q[0][0] = 0;
			Q[0][3] = 321;
			Q[0][1] = 80;
			Q[0][2] = 192;
			Q[1][0] = 155;
			Q[1][3] = 562;
			Q[1][2] = 449;
			Q[1][1] = 321;
			Q[2][2] = 690;
			Q[2][1] = 578;
			Q[2][0] = 389;
			Q[2][3] = 803;
			Q[3][3] = 1140;
			Q[3][2] = 995;
			Q[3][1] = 947;
			Q[3][0] = 671;
			Q[4][0] = 897;
			Q[4][1] = 1285;
			Q[4][2] = 1397;
			Q[4][3] = 1509;
			Q[5][3] = 1413;
			Q[5][0] = 1175;
			Q[5][2] = 1429;
			Q[5][1] = 1525;
			Q[6][3] = 1333;
			Q[6][0] = 1368;
			Q[6][2] = 1461;
			Q[6][1] = 1734;
			Q[7][3] = 1702;
			Q[7][2] = 1525;
			Q[7][0] = 1507;
			Q[7][1] = 1413;
			Q[8][2] = 1590;
			Q[8][3] = 2056;
			Q[8][1] = 1108;
			Q[8][0] = 1736;
			Q[9][1] = 1766;
			Q[9][0] = 2088;
			Q[9][2] = 2056;
			Q[9][3] = 2666;
			Q[10][1] = 2409;
			Q[10][0] = 2355;
			Q[10][2] = 2586;
			Q[10][3] = 3276;
			Q[11][3] = 3228;
			Q[11][1] = 3116;
			Q[11][0] = 2691;
			Q[11][2] = 3148;
			Q[12][0] = 3031;
			Q[12][3] = 3196;
			Q[12][2] = 3710;
			Q[12][1] = 3806;
			Q[13][1] = 3437;
			Q[13][0] = 3522;
			Q[13][3] = 3019;
			Q[13][2] = 3421;
			Q[14][0] = 3727;
			Q[14][3] = 3228;
			Q[14][2] = 3148;
			Q[14][1] = 3116;
			Q[15][0] = 4096;
			Q[15][3] = 2746;
			Q[15][1] = 2377;
			Q[15][2] = 2505;
			break while_217_;
		    } while (false);
		    Q = new int[4][4];
		    Q[0][0] = 2048;
		    Q[0][1] = 0;
		    Q[0][2] = 4096;
		    Q[0][3] = 0;
		    Q[1][3] = 0;
		    Q[1][1] = 4096;
		    Q[1][0] = 2867;
		    Q[1][2] = 4096;
		    Q[2][2] = 4096;
		    Q[2][1] = 4096;
		    Q[2][0] = 3276;
		    Q[2][3] = 0;
		    Q[3][2] = 0;
		    Q[3][3] = 0;
		    Q[3][0] = 4096;
		    Q[3][1] = 4096;
		    break while_217_;
		} while (false);
		throw new RuntimeException("Invalid gradient preset");
	    }
	} while (false);
	if (i != 2867)
	    R = -74;
    }
    
    final void b(int i) {
	int i_8_ = 14 % ((64 - i) / 60);
	L++;
	if (Q == null)
	    b(2867, 1);
	j(98);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	I++;
	if (i != 1)
	    b(127, 24);
	if (j == 0) {
	    int i_10_ = bytesParser.readUnsignedByte(-9268);
	    if (i_10_ == 0) {
		Q = new int[bytesParser.readUnsignedByte(-9268)][4];
		for (int i_11_ = 0; Q.length > i_11_; i_11_++) {
		    Q[i_11_][0] = bytesParser.readShort(13111);
		    Q[i_11_][1] = bytesParser.readUnsignedByte(-9268) << 4;
		    Q[i_11_][2] = bytesParser.readUnsignedByte(mv.a(i, -9267)) << 4;
		    Q[i_11_][3] = bytesParser.readUnsignedByte(-9268) << 4;
		}
	    } else
		b(i + 2866, i_10_);
	}
    }
    
    public static void i(int i) {
	U = null;
	K = null;
	if (i != -5300)
	    i(6);
	T = null;
	S = null;
    }
    
    static final void a(float f, int i, byte[] is, float f_12_,
			Class_ab class_ab, float f_13_, float f_14_,
			float f_15_, int i_16_, int i_17_, int i_18_,
			int i_19_, int i_20_) {
	O++;
	for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
	    mda.a(i_19_, f_14_, f, f_12_, is, class_ab, f_13_, i_17_, i_16_, i,
		  i_20_, f_15_, 0, i_21_);
	    i_19_ += i_16_ * i_17_;
	}
	if (i_18_ != 1)
	    P = -68;
    }
    
    private final void j(int i) {
	N++;
	int i_22_ = Q.length;
	if (i_22_ > 0) {
	    for (int i_23_ = 0; i_23_ < 257; i_23_++) {
		int i_24_ = 0;
		int i_25_ = i_23_ << 4;
		for (int i_26_ = 0; i_26_ < i_22_; i_26_++) {
		    if (Q[i_26_][0] > i_25_)
			break;
		    i_24_++;
		}
		int i_27_;
		int i_28_;
		int i_29_;
		if (i_22_ > i_24_) {
		    int[] is = Q[i_24_];
		    if (i_24_ > 0) {
			int[] is_30_ = Q[i_24_ - 1];
			int i_31_
			    = (i_25_ - is_30_[0] << 12) / (is[0] - is_30_[0]);
			int i_32_ = 4096 - i_31_;
			i_27_ = i_31_ * is[3] + is_30_[3] * i_32_ >> 12;
			i_28_ = i_32_ * is_30_[1] + is[1] * i_31_ >> 12;
			i_29_ = is_30_[2] * i_32_ + is[2] * i_31_ >> 12;
		    } else {
			i_29_ = is[2];
			i_27_ = is[3];
			i_28_ = is[1];
		    }
		} else {
		    int[] is = Q[i_22_ - 1];
		    i_27_ = is[3];
		    i_28_ = is[1];
		    i_29_ = is[2];
		}
		i_28_ >>= 4;
		i_27_ >>= 4;
		i_29_ >>= 4;
		if (i_28_ < 0)
		    i_28_ = 0;
		else if (i_28_ > 255)
		    i_28_ = 255;
		if (i_29_ >= 0) {
		    if (i_29_ > 255)
			i_29_ = 255;
		} else
		    i_29_ = 0;
		if (i_27_ >= 0) {
		    if (i_27_ > 255)
			i_27_ = 255;
		} else
		    i_27_ = 0;
		H[i_23_] = hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_28_ << 16, i_29_ << 8), i_27_);
	    }
	}
	if (i <= 31)
	    i(43);
    }
    
    static {
	P = 328;
	U = new tb(3000000, 200);
    }
}
