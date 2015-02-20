/* pc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class pc extends mca
{
    private short[] H = new short[512];
    static int I;
    private int J;
    static int[][] K = { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 },
			 { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
			 { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 },
			 { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 },
			 { 0, 1, 2, 3 } };
    static int L;
    private byte[] M = new byte[512];
    private int N;
    private int O;
    static int P;
    private int Q;
    private int R;
    static int S;
    private int T;
    
    public pc() {
	super(0, true);
	J = 0;
	Q = 2;
	R = 2048;
	O = 5;
	N = 1;
	T = 5;
    }
    
    private final void i(int i) {
	L++;
	Random random = new Random((long) J);
	H = new short[512];
	if (R > 0) {
	    for (int i_0_ = 0; i_0_ < 512; i_0_++)
		H[i_0_] = (short) it.a(random, R, mv.a(i, (int) 120));
	}
	if (i != 5)
	    a(1, (BytesParser) null, -58);
    }
    
    final void b(int i) {
	I++;
	M = lba.a(J, (byte) -97);
	int i_1_ = 102 % ((i - 64) / 60);
	i(5);
    }
    
    final int[] a(int i, int j) {
	P++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int i_3_ = Class_i.i[j] * O + 2048;
	    int i_4_ = i_3_ >> 12;
	    int i_5_ = i_4_ + 1;
	    int i_6_ = 0;
	while_129_:
	    for (/**/; fr.v > i_6_; i_6_++) {
		daa.Z = ida.m = fm.g = Class_lb.o = 2147483647;
		int i_7_ = js.p[i_6_] * T + 2048;
		int i_8_ = i_7_ >> 12;
		int i_9_ = i_8_ + 1;
		for (int i_10_ = i_4_ - 1; i_10_ <= i_5_; i_10_++) {
		    int i_11_
			= M[(i_10_ < O ? i_10_ : i_10_ - O) & 0xff] & 0xff;
		    for (int i_12_ = i_8_ - 1; i_9_ >= i_12_; i_12_++) {
			int i_13_ = ((M[0xff & i_11_ + (i_12_ >= T ? i_12_ - T
							: i_12_)]
				      & 0xff)
				     * 2);
			int i_14_ = i_7_ - (i_12_ << 12) - H[i_13_++];
			int i_15_ = i_3_ - (H[i_13_] + (i_10_ << 12));
			int i_16_ = N;
			int i_17_;
		    while_125_:
			do {
			while_124_:
			    do {
			    while_123_:
				do {
				while_122_:
				    do {
					do {
					    if (i_16_ != 1) {
						if (i_16_ != 3) {
						    if (i_16_ != 4) {
							if (i_16_ != 5) {
							    if (i_16_ == 2)
								break while_123_;
							    break while_124_;
							}
						    } else
							break;
						    break while_122_;
						}
					    } else {
						i_17_
						    = (i_14_ * i_14_
						       + i_15_ * i_15_) >> 12;
						break while_125_;
					    }
					    i_15_
						= i_15_ >= 0 ? i_15_ : -i_15_;
					    i_14_
						= i_14_ >= 0 ? i_14_ : -i_14_;
					    i_17_ = (i_15_ >= i_14_ ? i_15_
						     : i_14_);
					    break while_125_;
					} while (false);
					i_14_
					    = (int) (4096.0
						     * (Math.sqrt
							((double) ((float) ((i_14_
									     >= 0)
									    ? i_14_
									    : -i_14_)
								   / 4096.0F))));
					i_15_
					    = (int) ((Math.sqrt
						      ((double) ((float) ((i_15_
									   < 0)
									  ? -i_15_
									  : i_15_)
								 / 4096.0F)))
						     * 4096.0);
					i_17_ = i_14_ + i_15_;
					i_17_ = i_17_ * i_17_ >> 12;
					break while_125_;
				    } while (false);
				    i_15_ *= i_15_;
				    i_14_ *= i_14_;
				    i_17_
					= (int) ((Math.sqrt
						  (Math.sqrt
						   ((double) ((float) (i_15_
								       + i_14_)
							      / 1.6777216E7F))))
						 * 4096.0);
				    break while_125_;
				} while (false);
				i_17_ = ((i_14_ < 0 ? -i_14_ : i_14_)
					 + (i_15_ >= 0 ? i_15_ : -i_15_));
				break while_125_;
			    } while (false);
			    i_17_ = (int) (4096.0
					   * (Math.sqrt
					      ((double) ((float) (i_14_ * i_14_
								  + (i_15_
								     * i_15_))
							 / 1.6777216E7F))));
			} while (false);
			if (daa.Z > i_17_) {
			    Class_lb.o = fm.g;
			    fm.g = ida.m;
			    ida.m = daa.Z;
			    daa.Z = i_17_;
			} else if (i_17_ < ida.m) {
			    Class_lb.o = fm.g;
			    fm.g = ida.m;
			    ida.m = i_17_;
			} else if (i_17_ >= fm.g) {
			    if (i_17_ < Class_lb.o)
				Class_lb.o = i_17_;
			} else {
			    Class_lb.o = fm.g;
			    fm.g = i_17_;
			}
		    }
		}
		int i_18_ = Q;
	    while_127_:
		do {
		while_126_:
		    do {
			do {
			    if (i_18_ != 0) {
				if (i_18_ != 1) {
				    if (i_18_ != 3) {
					if (i_18_ != 4) {
					    if (i_18_ == 2)
						break while_127_;
					    continue while_129_;
					}
				    } else
					break;
				    break while_126_;
				}
			    } else {
				is[i_6_] = daa.Z;
				continue while_129_;
			    }
			    is[i_6_] = ida.m;
			    continue while_129_;
			} while (false);
			is[i_6_] = fm.g;
			continue while_129_;
		    } while (false);
		    is[i_6_] = Class_lb.o;
		    continue while_129_;
		} while (false);
		is[i_6_] = ida.m - daa.Z;
	    }
	}
	int i_19_ = 34 % ((i - 81) / 36);
	return is;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_21_ = j;
    while_134_:
	do {
	while_133_:
	    do {
	    while_132_:
		do {
		while_131_:
		    do {
		    while_130_:
			do {
			    do {
				if (i_21_ != 0) {
				    if (i_21_ != 1) {
					if (i_21_ != 2) {
					    if (i_21_ != 3) {
						if (i_21_ != 4) {
						    if (i_21_ != 5) {
							if (i_21_ == 6)
							    break while_133_;
							break while_134_;
						    }
						} else
						    break while_131_;
						break while_132_;
					    }
					} else
					    break;
					break while_130_;
				    }
				} else {
				    T = O = bytesParser.readUnsignedByte(-9268);
				    break while_134_;
				}
				J = bytesParser.readUnsignedByte(i - 9269);
				break while_134_;
			    } while (false);
			    R = bytesParser.readShort(13111);
			    break while_134_;
			} while (false);
			Q = bytesParser.readUnsignedByte(-9268);
			break while_134_;
		    } while (false);
		    N = bytesParser.readUnsignedByte(i ^ ~0x2432);
		    break while_134_;
		} while (false);
		T = bytesParser.readUnsignedByte(i ^ ~0x2432);
		break while_134_;
	    } while (false);
	    O = bytesParser.readUnsignedByte(-9268);
	} while (false);
	if (i != 1)
	    H = null;
	S++;
    }
    
    public static void j(int i) {
	K = null;
	if (i >= -109)
	    j(-89);
    }
}
