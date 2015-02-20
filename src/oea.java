/* oea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class oea extends mca
{
    static int H;
    private int I;
    private int J = 204;
    private int K;
    private int L = 1024;
    private int M;
    private int N;
    private int O;
    private int P;
    static int Q;
    private int R;
    static int S;
    static int T;
    private int U;
    private int[][] V;
    static int X;
    private int Y;
    private int[][] Z;
    static int ab;
    static int bb;
    static lt cb = new lt();
    static int db;
    private int[] eb;
    static fca fb = new fca();
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_1_ = j;
    while_114_:
	do {
	while_113_:
	    do {
	    while_112_:
		do {
		while_111_:
		    do {
		    while_110_:
			do {
			while_109_:
			    do {
				do {
				    if (i_1_ != 0) {
					if (i_1_ != 1) {
					    if (i_1_ != 2) {
						if (i_1_ != 3) {
						    if (i_1_ != 4) {
							if (i_1_ != 5) {
							    if (i_1_ != 6) {
								if (i_1_ != 7)
								    break while_114_;
							    } else
								break while_112_;
							    break while_113_;
							}
						    } else
							break while_110_;
						    break while_111_;
						}
					    } else
						break;
					    break while_109_;
					}
				    } else {
					I = bytesParser.readUnsignedByte(-9268);
					break while_114_;
				    }
				    N = bytesParser.readUnsignedByte(-9268);
				    break while_114_;
				} while (false);
				Y = bytesParser.readShort(13111);
				break while_114_;
			    } while (false);
			    J = bytesParser.readShort(13111);
			    break while_114_;
			} while (false);
			M = bytesParser.readShort(13111);
			break while_114_;
		    } while (false);
		    P = bytesParser.readShort(13111);
		    break while_114_;
		} while (false);
		K = bytesParser.readShort(13111);
		break while_114_;
	    } while (false);
	    L = bytesParser.readShort(i ^ 0x3336);
	} while (false);
	if (i != 1)
	    V = null;
	X++;
    }
    
    public static void c(byte i) {
	cb = null;
	fb = null;
	if (i != -105)
	    fb = null;
    }
    
    final int[] a(int i, int j) {
	Q++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int i_3_ = 0;
	    int i_4_;
	    for (i_4_ = Class_i.i[j] + P; i_4_ < 0; i_4_ += 4096) {
		/* empty */
	    }
	    for (/**/; i_4_ > 4096; i_4_ -= 4096) {
		/* empty */
	    }
	    for (/**/; i_3_ < N; i_3_++) {
		if (eb[i_3_] > i_4_)
		    break;
	    }
	    int i_5_ = i_3_ - 1;
	    boolean bool = (i_3_ & 0x1) == 0;
	    int i_6_ = eb[i_3_];
	    int i_7_ = eb[i_3_ - 1];
	    if (i_7_ + O >= i_4_ || i_4_ >= i_6_ - O)
		co.a(is, 0, fr.v, 0);
	    else {
		for (int i_8_ = 0; i_8_ < fr.v; i_8_++) {
		    int i_9_ = 0;
		    int i_10_ = bool ? M : -M;
		    int i_11_;
		    for (i_11_ = js.p[i_8_] + (i_10_ * R >> 12); i_11_ < 0;
			 i_11_ += 4096) {
			/* empty */
		    }
		    for (/**/; i_11_ > 4096; i_11_ -= 4096) {
			/* empty */
		    }
		    for (/**/; i_9_ < I; i_9_++) {
			if (i_11_ < V[i_5_][i_9_])
			    break;
		    }
		    int i_12_ = i_9_ - 1;
		    int i_13_ = V[i_5_][i_12_];
		    int i_14_ = V[i_5_][i_9_];
		    if (i_11_ <= i_13_ + O || i_11_ >= i_14_ - O)
			is[i_8_] = 0;
		    else
			is[i_8_] = Z[i_5_][i_12_];
		}
	    }
	}
	int i_15_ = 47 % ((81 - i) / 36);
	return is;
    }
    
    private final void i(int i) {
	ab++;
	Random random = new Random((long) N);
	O = K / 2;
	R = 4096 / I;
	U = 4096 / N;
	int i_16_ = R / 2;
	V = new int[N][I + 1];
	int i_17_ = U / 2;
	Z = new int[N][I];
	eb = new int[N + 1];
	eb[0] = 0;
	for (int i_18_ = i; i_18_ < N; i_18_++) {
	    if (i_18_ > 0) {
		int i_19_ = U;
		int i_20_ = (it.a(random, 4096, 124) - 2048) * J >> 12;
		i_19_ += i_20_ * i_17_ >> 12;
		eb[i_18_] = i_19_ + eb[i_18_ - 1];
	    }
	    V[i_18_][0] = 0;
	    for (int i_21_ = 0; I > i_21_; i_21_++) {
		if (i_21_ > 0) {
		    int i_22_ = R;
		    int i_23_ = (it.a(random, 4096, i + 121) - 2048) * Y >> 12;
		    i_22_ += i_23_ * i_16_ >> 12;
		    V[i_18_][i_21_] = i_22_ + V[i_18_][i_21_ - 1];
		}
		Z[i_18_][i_21_]
		    = L > 0 ? -it.a(random, L, i + 122) + 4096 : 4096;
	    }
	    V[i_18_][I] = 4096;
	}
	eb[N] = 4096;
    }
    
    static final void a() {
	for (int i = 0; i < vk.i.length; i++)
	    vk.i[i].f();
	vk.i = null;
    }
    
    public oea() {
	super(0, true);
	K = 81;
	M = 1024;
	N = 8;
	Y = 409;
	P = 0;
	I = 4;
    }
    
    static final int a(int i, int i_24_, byte[] is, int i_25_) {
	T++;
	int i_26_ = -1;
	if (i != 255)
	    a((byte) -6, (BytesParser) null, 6);
	for (int i_27_ = i_24_; i_27_ < i_25_; i_27_++)
	    i_26_ = Class_ub.V[(is[i_27_] ^ i_26_) & 0xff] ^ i_26_ >>> 8;
	i_26_ ^= 0xffffffff;
	return i_26_;
    }
    
    static final void j(int i) {
	if (i != -12296)
	    fb = null;
	bb++;
	nda.j = ga.a(2048, true, 8, (byte) -9, 8, 0.4F, 4, 35);
    }
    
    static final void k(int i) {
	if (i == -1) {
	    if (vn.J == 1 || vn.J == 3
		|| vn.J != rq.H && (vn.J == 0 || rq.H == 0)) {
		ObjectDef.Ib = 0;
		ps.npcCount = 0;
		uo.a.a(true);
	    }
	    S++;
	    rq.H = vn.J;
	}
    }
    
    final void b(int i) {
	i(0);
	int i_28_ = -80 % ((i - 64) / 60);
	H++;
    }
    
    static final String a(byte i, BytesParser var_es, int i_29_) {
	db++;
	try {
	    int i_30_ = var_es.readSmart2(-13829);
	    if (i_30_ > i_29_)
		i_30_ = i_29_;
	    int i_31_ = -119 / ((i + 23) / 50);
	    byte[] is = new byte[i_30_];
	    ((BytesParser) var_es).pos += dp.k.a(is, i_30_, ((BytesParser) var_es).bytes, 0, (byte) 92,
				      ((BytesParser) var_es).pos);
	    String string = cea.bytesToString(26144, i_30_, is, 0);
	    return string;
	} catch (Exception exception) {
	    return "Cabbage";
	}
    }
}
