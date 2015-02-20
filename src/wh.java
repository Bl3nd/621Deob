/* wh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wh extends mca
{
    static int H;
    static int J = -1;
    private int K;
    private int L;
    private int M;
    static int N;
    static int[][] O;
    static int P;
    static int Q;
    static int R;
    
    private final void a(int i, byte i_0_) {
	L = (i & 0xff) << 4;
	M = (0xff00 & i) >> 4;
	K = i >> 12 & 0xff0;
	P++;
	if (i_0_ != 6)
	    K = -8;
    }
    
    public static void c(byte i) {
	if (i < -14)
	    O = null;
    }
    
    public wh() {
	this(0);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i != 1)
	    L = 30;
	int i_2_ = j;
	if (i_2_ == 0)
	    a(bytesParser.readTribyte(-1), (byte) 6);
	Q++;
    }
    
    private wh(int i) {
	super(0, false);
	a(i, (byte) 6);
    }
    
    static final int i(int i) {
	N++;
	if (gea.n)
	    return 6;
	if (um.b == null)
	    return 0;
	int i_3_ = ((bfa) um.b).v;
	if (bl.c(i_3_, 37))
	    return 1;
	if (nt.a(i_3_, (byte) 84))
	    return 2;
	if (hq.a(i_3_, 21922))
	    return 3;
	if (sl.b(-1, i_3_))
	    return 4;
	if (i != 4)
	    c((byte) 31);
	return 5;
    }
    
    static final wr b(int i, int i_4_, int i_5_) {
	vf var_vf = ol.p[i][i_4_][i_5_];
	if (var_vf == null)
	    return null;
	wr var_wr = ((vf) var_vf).c;
	((vf) var_vf).c = null;
	rba.a(var_wr);
	return var_wr;
    }
    
    static final void d(byte i) {
	int i_6_ = 109 % ((i + 1) / 45);
	R++;
	if (gs.b(hm.h, 0) || pga.a(-66, hm.h))
	    tb.a(dg.gb >> 12, ada.N >> 12, (byte) 118, 5000);
	else {
	    int i_7_ = ((Entity) up.thisPlayer).regionLocalX[0] >> 3;
	    int i_8_ = ((Entity) up.thisPlayer).regionLocalY[0] >> 3;
	    if (i_7_ >= 0 && Class_hc.e >> 3 > i_7_ && i_8_ >= 0
		&& bw.v >> 3 > i_8_)
		tb.a(i_7_, i_8_, (byte) 118, 5000);
	    else
		tb.a(Class_hc.e >> 4, bw.v >> 4, (byte) 118, 0);
	}
	tfa.a(true);
	at.f((byte) -38);
	fba.b((byte) 14);
	ida.b(false);
    }
    
    final int[][] a(int i, boolean bool) {
	H++;
	int[][] is = ((mca) this).B.a(i, -21);
	if (bool != true)
	    O = null;
	if (((td) ((mca) this).B).p) {
	    int[] is_9_ = is[0];
	    int[] is_10_ = is[1];
	    int[] is_11_ = is[2];
	    for (int i_12_ = 0; fr.v > i_12_; i_12_++) {
		is_9_[i_12_] = K;
		is_10_[i_12_] = M;
		is_11_[i_12_] = L;
	    }
	}
	return is;
    }
}
