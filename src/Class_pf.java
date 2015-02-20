/* Class_pf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_pf extends mca
{
    private int H;
    private int I = 4096;
    static int J;
    static int K;
    static int L;
    static int M;
    private int N;
    static Class_rf O = new Class_rf("stellardawn", 1);
    
    static final void a(Animable var_lo, int i, int i_0_, int i_1_) {
	if (i_0_ < sv.T) {
	    vf var_vf = ol.p[i][i_0_ + 1][i_1_];
	    if (var_vf != null && ((vf) var_vf).m != null
		&& ((vf) var_vf).m.h((byte) -50))
		var_lo.a(true, bea.o, (byte) 14, nda.k, ((vf) var_vf).m, 0, 0);
	}
	if (i_1_ < sv.T) {
	    vf var_vf = ol.p[i][i_0_][i_1_ + 1];
	    if (var_vf != null && ((vf) var_vf).m != null
		&& ((vf) var_vf).m.h((byte) -95))
		var_lo.a(true, 0, (byte) -109, nda.k, ((vf) var_vf).m, 0,
			 bea.o);
	}
	if (i_0_ < sv.T && i_1_ < nf.H) {
	    vf var_vf = ol.p[i][i_0_ + 1][i_1_ + 1];
	    if (var_vf != null && ((vf) var_vf).m != null
		&& ((vf) var_vf).m.h((byte) -46))
		var_lo.a(true, bea.o, (byte) 32, nda.k, ((vf) var_vf).m, 0,
			 bea.o);
	}
	if (i_0_ < sv.T && i_1_ > 0) {
	    vf var_vf = ol.p[i][i_0_ + 1][i_1_ - 1];
	    if (var_vf != null && ((vf) var_vf).m != null
		&& ((vf) var_vf).m.h((byte) -117))
		var_lo.a(true, bea.o, (byte) 34, nda.k, ((vf) var_vf).m, 0,
			 -bea.o);
	}
    }
    
    final int[][] a(int i, boolean bool) {
	L++;
	int[][] is = ((mca) this).B.a(i, -71);
	if (((td) ((mca) this).B).p) {
	    int[][] is_2_ = this.a(0, i, 0);
	    int[] is_3_ = is_2_[0];
	    int[] is_4_ = is_2_[1];
	    int[] is_5_ = is_2_[2];
	    int[] is_6_ = is[0];
	    int[] is_7_ = is[1];
	    int[] is_8_ = is[2];
	    for (int i_9_ = 0; fr.v > i_9_; i_9_++) {
		int i_10_ = is_3_[i_9_];
		int i_11_ = is_5_[i_9_];
		int i_12_ = is_4_[i_9_];
		if (i_10_ == i_11_ && i_12_ == i_11_) {
		    is_6_[i_9_] = H * i_10_ >> 12;
		    is_7_[i_9_] = N * i_11_ >> 12;
		    is_8_[i_9_] = I * i_12_ >> 12;
		} else {
		    is_6_[i_9_] = H;
		    is_7_[i_9_] = N;
		    is_8_[i_9_] = I;
		}
	    }
	}
	if (bool != true)
	    i(88);
	return is;
    }
    
    static final void a(int i, byte i_13_, String string) {
	wo.b(21074);
	J++;
	lg.b(-4);
	ClientScript.a(true);
	oh.a(i, false, string);
	ti.b(true);
	ISAAC.a(8, lg.r);
	bn.a(lg.r, -27346);
	if (i_13_ >= -122)
	    O = null;
	um.a(sm.a, lg.r, 0);
	ir.b(17381);
	iea.a(true, sp.s);
	fda.a(0);
	bca.a((byte) 86);
	if (hm.h != 3) {
	    if (hm.h == 7)
		ei.a(8, 44);
	    else if (hm.h == 10)
		ei.a(11, -116);
	    else if (hm.h == 1 || hm.h == 2)
		lq.i((byte) 55);
	} else
	    ei.a(4, 75);
    }
    
    public static void i(int i) {
	if (i >= -117)
	    O = null;
	O = null;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	K++;
	int i_15_ = j;
    while_135_:
	do {
	    do {
		if (i_15_ != 0) {
		    if (i_15_ != 1) {
			if (i_15_ == 2)
			    break;
			break while_135_;
		    }
		} else {
		    H = bytesParser.readShort(13111);
		    break while_135_;
		}
		N = bytesParser.readShort(13111);
		break while_135_;
	    } while (false);
	    I = bytesParser.readShort(13111);
	} while (false);
	if (i != 1)
	    H = -122;
    }
    
    static final int a(int i, nw var_nw) {
	M++;
	if (ku.k == var_nw)
	    return 7681;
	if (var_nw != Class_rf.e) {
	    if (wi.e == var_nw)
		return 34165;
	    if (hn.f == var_nw)
		return 260;
	    if (Login.f == var_nw)
		return 34023;
	} else
	    return 8448;
	if (i != 260)
	    O = null;
	throw new IllegalArgumentException();
    }
    
    public Class_pf() {
	super(1, false);
	H = 4096;
	N = 4096;
    }
}
