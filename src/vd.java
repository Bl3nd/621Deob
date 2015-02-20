/* vd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class vd extends mca
{
    int H;
    private byte[] I;
    int J;
    int K = 0;
    static sm L;
    int M;
    static int N = 0;
    static boolean[][] O;
    static int P;
    int Q;
    static int R;
    static int S;
    private short[] T;
    private short[] U;
    static int V;
    boolean W;
    static int X;
    static int[] inScreenPlayerIDs = new int[2048];
    static int Z;
    static int ab;
    static int bb;
    
    static final byte[] a(byte i, File file, int i_0_) {
	P++;
	try {
	    byte[] is = new byte[i_0_];
	    int i_1_ = -54 / ((i + 56) / 50);
	    sa.a(i_0_, -101, file, is);
	    return is;
	} catch (java.io.IOException ioexception) {
	    return null;
	}
    }
    
    public vd() {
	super(0, true);
	I = new byte[512];
	((vd) this).J = 1638;
	((vd) this).M = 4;
	((vd) this).Q = 4;
	((vd) this).H = 4;
	((vd) this).W = true;
    }
    
    private final int a(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_) {
	R++;
	int i_8_ = i_4_ >> 12;
	int i_9_ = i_8_ + 1;
	if (i_6_ <= i_9_)
	    i_9_ = 0;
	i_8_ &= 0xff;
	i_4_ &= 0xfff;
	i_9_ &= 0xff;
	int i_10_ = i - 4096;
	int i_11_ = i_4_ - 4096;
	int i_12_ = ns.s[i_4_];
	int i_13_ = 0x3 & I[i_8_ + i_5_];
	int i_14_;
	if (i_13_ <= 1)
	    i_14_ = i_13_ == 0 ? i + i_4_ : i - i_4_;
	else
	    i_14_ = i_13_ != 2 ? -i_4_ - i : i_4_ - i;
	i_13_ = I[i_5_ + i_9_] & 0x3;
	int i_15_;
	if (i_13_ <= 1)
	    i_15_ = i_13_ == 0 ? i + i_11_ : i - i_11_;
	else
	    i_15_ = i_13_ == 2 ? i_11_ - i : -i_11_ - i;
	i_13_ = 0x3 & I[i_3_ + i_8_];
	int i_16_ = i_14_ + ((i_15_ - i_14_) * i_12_ >> 12);
	if (i_13_ > 1)
	    i_14_ = i_13_ != 2 ? -i_4_ - i_10_ : i_4_ - i_10_;
	else
	    i_14_ = i_13_ != 0 ? i_10_ - i_4_ : i_4_ + i_10_;
	if (i_2_ != 31757)
	    return 32;
	i_13_ = I[i_3_ + i_9_] & 0x3;
	if (i_13_ > 1)
	    i_15_ = i_13_ == 2 ? i_11_ - i_10_ : -i_11_ - i_10_;
	else
	    i_15_ = i_13_ != 0 ? i_10_ - i_11_ : i_10_ + i_11_;
	int i_17_ = i_14_ + ((i_15_ - i_14_) * i_12_ >> 12);
	return (i_7_ * (i_17_ - i_16_) >> 12) + i_16_;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_19_ = j;
    while_235_:
	do {
	while_234_:
	    do {
	    while_233_:
		do {
		while_232_:
		    do {
		    while_231_:
			do {
			    do {
				if (i_19_ != 0) {
				    if (i_19_ != 1) {
					if (i_19_ != 2) {
					    if (i_19_ != 3) {
						if (i_19_ != 4) {
						    if (i_19_ != 5) {
							if (i_19_ == 6)
							    break while_234_;
							break while_235_;
						    }
						} else
						    break while_232_;
						break while_233_;
					    }
					} else
					    break;
					break while_231_;
				    }
				} else {
				    ((vd) this).W = bytesParser.readUnsignedByte(-9268) == 1;
				    break while_235_;
				}
				((vd) this).M = bytesParser.readUnsignedByte(i ^ ~0x2432);
				break while_235_;
			    } while (false);
			    ((vd) this).J = bytesParser.readShort2(32);
			    if (((vd) this).J < 0) {
				T = new short[((vd) this).M];
				for (i_19_ = 0; ((vd) this).M > i_19_; i_19_++)
				    T[i_19_] = (short) bytesParser.readShort2(30);
			    }
			    break while_235_;
			} while (false);
			((vd) this).H = ((vd) this).Q = bytesParser.readUnsignedByte(-9268);
			break while_235_;
		    } while (false);
		    ((vd) this).K = bytesParser.readUnsignedByte(-9268);
		    break while_235_;
		} while (false);
		((vd) this).H = bytesParser.readUnsignedByte(-9268);
		break while_235_;
	    } while (false);
	    ((vd) this).Q = bytesParser.readUnsignedByte(-9268);
	} while (false);
	if (i != 1)
	    U = null;
	ab++;
    }
    
    final int[] a(int i, int j) {
	bb++;
	int[] is = ((mca) this).s.a(j, true);
	int i_21_ = 66 / ((81 - i) / 36);
	if (((oca) ((mca) this).s).o)
	    a(j, (byte) 31, is);
	return is;
    }
    
    private final void i(int i) {
	if (i != 1998)
	    i(-34);
	if (((vd) this).J > 0) {
	    T = new short[((vd) this).M];
	    U = new short[((vd) this).M];
	    for (int i_22_ = 0; ((vd) this).M > i_22_; i_22_++) {
		T[i_22_]
		    = (short) (int) (Math.pow((double) ((float) ((vd) this).J
							/ 4096.0F),
					      (double) i_22_)
				     * 4096.0);
		U[i_22_] = (short) (int) Math.pow(2.0, (double) i_22_);
	    }
	} else if (T != null && T.length == ((vd) this).M) {
	    U = new short[((vd) this).M];
	    for (int i_23_ = 0; ((vd) this).M > i_23_; i_23_++)
		U[i_23_] = (short) (int) Math.pow(2.0, (double) i_23_);
	}
	Z++;
    }
    
    static final boolean b(int i, int i_24_, int i_25_) {
	S++;
	if (i_25_ >= -6)
	    inScreenPlayerIDs = null;
	if (!((i & 0x70000) != 0 | wg.a(i_24_, i, false))
	    && !oe.a(68, i, i_24_))
	    return false;
	return true;
    }
    
    public static void j(int i) {
	if (i != 265391564)
	    j(119);
	L = null;
	inScreenPlayerIDs = null;
	O = null;
    }
    
    final void a(int i, byte i_26_, int[] is) {
	X++;
	int i_27_ = Class_i.i[i] * ((vd) this).Q;
	if (i_26_ == 31) {
	    if (((vd) this).M == 1) {
		int i_28_ = U[0] << 12;
		int i_29_ = T[0];
		int i_30_ = i_28_ * ((vd) this).Q >> 12;
		int i_31_ = i_28_ * ((vd) this).H >> 12;
		int i_32_ = i_28_ * i_27_ >> 12;
		int i_33_ = i_32_ >> 12;
		int i_34_ = i_33_ + 1;
		if (i_34_ >= i_30_)
		    i_34_ = 0;
		i_32_ &= 0xfff;
		int i_35_ = ns.s[i_32_];
		int i_36_ = 0xff & I[i_34_ & 0xff];
		int i_37_ = 0xff & I[i_33_ & 0xff];
		if (((vd) this).W) {
		    for (int i_38_ = 0; fr.v > i_38_; i_38_++) {
			int i_39_ = ((vd) this).H * js.p[i_38_];
			int i_40_ = a(i_32_, 31757, i_36_, i_28_ * i_39_ >> 12,
				      i_37_, i_31_, i_35_);
			i_40_ = i_40_ * i_29_ >> 12;
			is[i_38_] = (i_40_ >> 1) + 2048;
		    }
		} else {
		    for (int i_41_ = 0; i_41_ < fr.v; i_41_++) {
			int i_42_ = js.p[i_41_] * ((vd) this).H;
			int i_43_ = a(i_32_, 31757, i_36_, i_42_ * i_28_ >> 12,
				      i_37_, i_31_, i_35_);
			is[i_41_] = i_43_ * i_29_ >> 12;
		    }
		}
	    } else {
		int i_44_ = T[0];
		if (i_44_ > 8 || i_44_ < -8) {
		    int i_45_ = U[0] << 12;
		    int i_46_ = ((vd) this).H * i_45_ >> 12;
		    int i_47_ = i_45_ * i_27_ >> 12;
		    int i_48_ = ((vd) this).Q * i_45_ >> 12;
		    int i_49_ = i_47_ >> 12;
		    int i_50_ = i_49_ + 1;
		    if (i_50_ >= i_48_)
			i_50_ = 0;
		    i_47_ &= 0xfff;
		    int i_51_ = ns.s[i_47_];
		    int i_52_ = I[i_50_ & 0xff] & 0xff;
		    int i_53_ = I[i_49_ & 0xff] & 0xff;
		    for (int i_54_ = 0; fr.v > i_54_; i_54_++) {
			int i_55_ = js.p[i_54_] * ((vd) this).H;
			int i_56_ = a(i_47_, 31757, i_52_, i_55_ * i_45_ >> 12,
				      i_53_, i_46_, i_51_);
			is[i_54_] = i_44_ * i_56_ >> 12;
		    }
		}
		for (int i_57_ = 1; ((vd) this).M > i_57_; i_57_++) {
		    i_44_ = T[i_57_];
		    if (i_44_ > 8 || i_44_ < -8) {
			int i_58_ = U[i_57_] << 12;
			int i_59_ = i_58_ * ((vd) this).H >> 12;
			int i_60_ = i_27_ * i_58_ >> 12;
			int i_61_ = i_58_ * ((vd) this).Q >> 12;
			int i_62_ = i_60_ >> 12;
			int i_63_ = i_62_ + 1;
			if (i_63_ >= i_61_)
			    i_63_ = 0;
			i_60_ &= 0xfff;
			int i_64_ = 0xff & I[0xff & i_62_];
			int i_65_ = I[i_63_ & 0xff] & 0xff;
			int i_66_ = ns.s[i_60_];
			if (((vd) this).W && ((vd) this).M - 1 == i_57_) {
			    for (int i_67_ = 0; fr.v > i_67_; i_67_++) {
				int i_68_ = js.p[i_67_] * ((vd) this).H;
				int i_69_ = a(i_60_, 31757, i_65_,
					      i_58_ * i_68_ >> 12, i_64_,
					      i_59_, i_66_);
				i_69_ = is[i_67_] + (i_44_ * i_69_ >> 12);
				is[i_67_] = 2048 + (i_69_ >> 1);
			    }
			} else {
			    for (int i_70_ = 0; i_70_ < fr.v; i_70_++) {
				int i_71_ = ((vd) this).H * js.p[i_70_];
				int i_72_ = a(i_60_, 31757, i_65_,
					      i_71_ * i_58_ >> 12, i_64_,
					      i_59_, i_66_);
				is[i_70_] += i_44_ * i_72_ >> 12;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void b(int i) {
	I = lba.a(((vd) this).K, (byte) -97);
	V++;
	i(1998);
	for (int i_73_ = ((vd) this).M - 1; i_73_ >= 1; i_73_--) {
	    short i_74_ = T[i_73_];
	    if (i_74_ > 8 || i_74_ < -8)
		break;
	    ((vd) this).M--;
	}
	int i_75_ = 85 / ((i - 64) / 60);
    }
}
