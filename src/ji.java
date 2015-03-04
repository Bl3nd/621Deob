/* ji - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ji
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static boolean clipComponents = false;
    static GameInPacket setPlayerOptionGameInPacket;
    static long[] i = new long[32];
    static int[] j;
    
    static final void a(int i) {
	b++;
	vn.J = faa.loginStream.readUnsignedNegativeByte((byte) -18);
	int i_0_ = faa.loginStream.readShort(13111);
	int i_1_ = faa.loginStream.readShort(i + 510131028);
	boolean bool = faa.loginStream.readUnsignedByte(i ^ 0x1e67ec2f) == 1;
	int i_2_ = faa.loginStream.readUnsignedNegativeByte((byte) -18);
	if (i == -510117917) {
	    oea.k(i + 510117916);
	    qba.a(71, i_2_);
	    faa.loginStream.initBits(8);
	    for (int i_3_ = 0; i_3_ < 4; i_3_++) {
		for (int i_4_ = 0; Class_hc.e >> 3 > i_4_; i_4_++) {
		    for (int i_5_ = 0; bw.v >> 3 > i_5_; i_5_++) {
			int i_6_ = faa.loginStream.readBits(false, 1);
			if (i_6_ != 1)
			    cl.s[i_3_][i_4_][i_5_] = -1;
			else
			    cl.s[i_3_][i_4_][i_5_] = faa.loginStream.readBits(false, 26);
		    }
		}
	    }
	    faa.loginStream.finishBits((byte) -45);
	    int i_7_ = (ck.currentGameInPacketSize - ((BytesParser) faa.loginStream).pos) / 16;
	    ru.t = new int[i_7_][4];
	    for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
		for (int i_9_ = 0; i_9_ < 4; i_9_++)
		    ru.t[i_8_][i_9_] = faa.loginStream.readInt((int) 89);
	    }
	    uc.g = null;
	    iu.o = new int[i_7_];
	    laa.f = new int[i_7_];
	    lca.D = new byte[i_7_][];
	    jv.u = new int[i_7_];
	    os.l = new int[i_7_];
	    pw.b = new byte[i_7_][];
	    wk.h = new int[i_7_];
	    fba.N = null;
	    Class_ue.b = new byte[i_7_][];
	    kaa.q = new byte[i_7_][];
	    i_7_ = 0;
	    for (int i_10_ = 0; i_10_ < 4; i_10_++) {
		for (int i_11_ = 0; Class_hc.e >> 3 > i_11_; i_11_++) {
		    for (int i_12_ = 0; bw.v >> 3 > i_12_; i_12_++) {
			int i_13_ = cl.s[i_10_][i_11_][i_12_];
			if ((i_13_ ^ 0xffffffff) != 0) {
			    int i_14_ = (0xffc792 & i_13_) >> 14;
			    int i_15_ = i_13_ >> 3 & 0x7ff;
			    int i_16_ = i_15_ / 8 + (i_14_ / 8 << 8);
			    for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
				if (iu.o[i_17_] == i_16_) {
				    i_16_ = -1;
				    break;
				}
			    }
			    if (i_16_ != -1) {
				iu.o[i_7_] = i_16_;
				int i_18_ = i_16_ >> 8 & 0xff;
				int i_19_ = 0xff & i_16_;
				wk.h[i_7_] = ua.c.a("m" + i_18_ + "_" + i_19_,
						    (int) 61);
				os.l[i_7_] = ua.c.a("width" + i_18_ + "_" + i_19_,
						    i + 510117847);
				laa.f[i_7_]
				    = ua.c.a("um" + i_18_ + "_" + i_19_,
					     (int) 72);
				jv.u[i_7_] = ua.c.a("ul" + i_18_ + "_" + i_19_,
						    (int) -65);
				i_7_++;
			    }
			}
		    }
		}
	    }
	    kga.a(11, 512, bool, i_0_, i_1_);
	}
    }
    
    static final void a(int i, boolean bool) {
	d++;
	if (bool != true)
	    a(90, -68, null, -96, 68, (byte) -114, 89);
	qba var_qba = ofa.a(14, i, (byte) 113);
	var_qba.i(0);
    }
    
    public static void a(byte i) {
	ji.i = null;
	setPlayerOptionGameInPacket = null;
	if (i != 126)
	    j = null;
	j = null;
    }
    
    static final boolean a(byte i, char c) {
	f++;
	if (c >= ' ' && c <= '~')
	    return true;
	if (i != -53)
	    a((int) -89);
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || c == '\u0153'
	    || c == '\u0178')
	    return true;
	return false;
    }
    
    static final boolean a(int i, int i_20_, byte[] is, int i_21_, int i_22_,
			   byte i_23_, int i_24_) {
	c++;
	if (i_23_ != -69)
	    a(-92, true);
	int i_25_ = i_21_ % i_22_;
	int i_26_;
	if (i_25_ == 0)
	    i_26_ = 0;
	else
	    i_26_ = i_22_ - i_25_;
	int i_27_ = -((i_22_ - 1 + i_20_) / i_22_);
	int i_28_ = -((i_21_ + (i_22_ - 1)) / i_22_);
	for (int i_29_ = i_27_; i_29_ < 0; i_29_++) {
	    for (int i_30_ = i_28_; i_30_ < 0; i_30_++) {
		if (is[i_24_] == 0)
		    return true;
		i_24_ += i_22_;
	    }
	    i_24_ -= i_26_;
	    if (is[i_24_ - 1] == 0)
		return true;
	    i_24_ += i;
	}
	return false;
    }
    
    static {
	setPlayerOptionGameInPacket = new GameInPacket(20, -1);
    }
}
