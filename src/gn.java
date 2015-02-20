/* gn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gn extends im
{
    static int F;
    static int G;
    static int I = 0;
    static int readSkips;
    static int K;
    static int L;
    static int M;
    static qfa N;
    static int[] O = new int[2];
    private byte[] P;
    static long[][] Q;
    static long[] R;
    static GameOutPacket S;
    
    public static void e(byte i) {
	Q = null;
	O = null;
	S = null;
	N = null;
	R = null;
	if (i <= 21)
	    O = null;
    }
    
    static final boolean a(boolean bool, int i, int i_0_) {
	if (bool != false)
	    return false;
	F++;
	if (!((i & 0x70000) != 0 | ew.a(i, 1, i_0_)) && !oe.a(68, i, i_0_))
	    return false;
	return true;
    }
    
    final byte[] a(int i, int i_1_, int i_2_, int i_3_) {
	M++;
	P = new byte[2 * i_1_ * (i_2_ * i_3_)];
	if (i != 0)
	    G = -90;
	this.a((byte) 113, i_3_, i_2_, i_1_);
	return P;
    }
    
    final void a(byte i, int i_4_, boolean bool) {
	K++;
	if (bool != false)
	    Q = null;
	int i_5_ = i_4_ * 2;
	int i_6_ = i & 0xff;
	P[i_5_++] = (byte) (3 * i_6_ >> 5);
	P[i_5_] = (byte) (i_6_ * 3 >> 5);
    }
    
    public gn() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    static final int readSkip(int i, LoginStream var_loginStream) {
		if (i != 11)
		    a(false, -83, 70);
		readSkips++;
		int amountOfBitsType = var_loginStream.readBits(false, 2);
		int amountToSkip;
		if (amountOfBitsType != 0) {
		    if (amountOfBitsType == 1)
		    	amountToSkip = var_loginStream.readBits(false, 5);
		    else if (amountOfBitsType != 2)
		    	amountToSkip = var_loginStream.readBits(false, 11);
		    else
		    	amountToSkip = var_loginStream.readBits(false, 8);
		} else
		    amountToSkip = 0;
		return amountToSkip;
    }
    
    static {
	N = new qfa("", 12);
	Q = new long[8][256];
	R = new long[11];
	for (int i = 0; i < 256; i++) {
	    int i_9_
		= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
		      .charAt(i / 2);
	    long l = (long) ((0x1 & i) != 0 ? 0xff & i_9_ : i_9_ >>> 8);
	    long l_10_ = l << 1;
	    if (l_10_ >= 256L)
		l_10_ ^= 0x11dL;
	    long l_11_ = l_10_ << 1;
	    if (l_11_ >= 256L)
		l_11_ ^= 0x11dL;
	    long l_12_ = l ^ l_11_;
	    long l_13_ = l_11_ << 1;
	    if (l_13_ >= 256L)
		l_13_ ^= 0x11dL;
	    long l_14_ = l_13_ ^ l;
	    Q[0][i] = mu.a(mu.a(mu.a(mu.a(mu.a(mu.a(mu.a(l << 56, l << 48),
						    l_11_ << 40),
					       l << 32),
					  l_13_ << 24),
				     l_12_ << 16),
				l_10_ << 8),
			   l_14_);
	    for (int i_15_ = 1; i_15_ < 8; i_15_++)
		Q[i_15_][i]
		    = mu.a(Q[i_15_ - 1][i] >>> 8, Q[i_15_ - 1][i] << 56);
	}
	R[0] = 0L;
	for (int i = 1; i <= 10; i++) {
	    int i_16_ = 8 * i - 8;
	    R[i]
		= la.a(ee.a(255L, Q[7][i_16_ + 7]),
		       la.a(ee.a(65280L, Q[6][i_16_ + 6]),
			    la.a(la.a(la.a(ee.a(1095216660480L,
						Q[3][i_16_ + 3]),
					   la.a(la.a(ee.a(-72057594037927936L,
							  Q[0][i_16_]),
						     ee.a(Q[1][i_16_ + 1],
							  71776119061217280L)),
						ee.a(280375465082880L,
						     Q[2][i_16_ + 2]))),
				      ee.a(4278190080L, Q[4][i_16_ + 4])),
				 ee.a(Q[5][i_16_ + 5], 16711680L))));
	}
	S = new GameOutPacket(37, 7);
    }
}
