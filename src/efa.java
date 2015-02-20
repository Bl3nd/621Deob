/* efa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class efa
{
    private int[] a;
    private int[] b;
    private byte[] c;
    static int d;
    static GameInPacket incomingPacket94 = new GameInPacket(94, 6);
    static int f;
    static int g;
    static int h;
    static int i;
    
    static final int a(char c, int i, int i_0_) {
	h++;
	int i_1_ = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    int i_2_ = Character.toLowerCase(c);
	    i_1_ = (i_2_ << 4) + 1;
	}
	if (i_0_ <= 85)
	    incomingPacket94 = null;
	return i_1_;
    }
    
    static final eg a(int i, pl var_pl, int i_3_, boolean bool) {
	if (bool != false)
	    return null;
	f++;
	byte[] is = var_pl.b(i_3_, 84, i);
	if (is == null)
	    return null;
	return new eg(is);
    }
    
    static final Interface a(int i, int i_4_) {
	if (i != -1018745488)
	    return null;
	g++;
	int i_5_ = i_4_ >> 16;
	int i_6_ = i_4_ & 0xffff;
	if (aa.o[i_5_] == null || aa.o[i_5_][i_6_] == null) {
	    boolean bool = gf.a((byte) 125, i_5_);
	    if (!bool)
		return null;
	}
	return aa.o[i_5_][i_6_];
    }
    
    final int a(int i, int i_7_, byte[] is, byte[] is_8_, int i_9_,
		int i_10_) {
	if (i_9_ != 8)
	    return -78;
	d++;
	int i_11_ = 0;
	i += i_10_;
	int i_12_ = i_7_ << 3;
	for (/**/; i_10_ < i; i_10_++) {
	    int i_13_ = 0xff & is_8_[i_10_];
	    int i_14_ = a[i_13_];
	    int i_15_ = c[i_13_];
	    if (i_15_ == 0)
		throw new RuntimeException("No codeword for data value "
					   + i_13_);
	    int i_16_ = i_12_ >> 3;
	    int i_17_ = i_12_ & 0x7;
	    i_11_ &= -i_17_ >> 31;
	    int i_18_ = i_16_ + (i_15_ + (i_17_ - 1) >> 3);
	    i_17_ += 24;
	    is[i_16_] = (byte) (i_11_ = hba.bitwiseArg1ORArg2(i_11_, i_14_ >>> i_17_));
	    if (i_18_ > i_16_) {
		i_17_ -= 8;
		i_16_++;
		is[i_16_] = (byte) (i_11_ = i_14_ >>> i_17_);
		if (i_18_ > i_16_) {
		    i_16_++;
		    i_17_ -= 8;
		    is[i_16_] = (byte) (i_11_ = i_14_ >>> i_17_);
		    if (i_18_ > i_16_) {
			i_16_++;
			i_17_ -= 8;
			is[i_16_] = (byte) (i_11_ = i_14_ >>> i_17_);
			if (i_18_ > i_16_) {
			    i_17_ -= 8;
			    i_16_++;
			    is[i_16_] = (byte) (i_11_ = i_14_ << -i_17_);
			}
		    }
		}
	    }
	    i_12_ += i_15_;
	}
	return (i_12_ + 7 >> 3) - i_7_;
    }
    
    public static void a(byte i) {
	if (i != -42)
	    incomingPacket94 = null;
	incomingPacket94 = null;
    }
    
    final int a(byte[] is, int i, byte[] is_19_, int i_20_, byte i_21_,
		int i_22_) {
	efa.i++;
	if (i == 0)
	    return 0;
	if (i_21_ != 92)
	    return -34;
	i += i_20_;
	int i_23_ = 0;
	int i_24_ = i_22_;
	for (;;) {
	    byte i_25_ = is_19_[i_24_];
	    if (i_25_ >= 0)
		i_23_++;
	    else
		i_23_ = b[i_23_];
	    int i_26_;
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i <= i_20_)
		    break;
		i_23_ = 0;
	    }
	    if ((0x40 & i_25_) == 0)
		i_23_++;
	    else
		i_23_ = b[i_23_];
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_20_ >= i)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x20) != 0)
		i_23_ = b[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i <= i_20_)
		    break;
		i_23_ = 0;
	    }
	    if ((0x10 & i_25_) == 0)
		i_23_++;
	    else
		i_23_ = b[i_23_];
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_20_ >= i)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x8) != 0)
		i_23_ = b[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_20_ >= i)
		    break;
		i_23_ = 0;
	    }
	    if ((0x4 & i_25_) != 0)
		i_23_ = b[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i <= i_20_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x2) == 0)
		i_23_++;
	    else
		i_23_ = b[i_23_];
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i <= i_20_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x1) == 0)
		i_23_++;
	    else
		i_23_ = b[i_23_];
	    if ((i_26_ = b[i_23_]) < 0) {
		is[i_20_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_20_ >= i)
		    break;
		i_23_ = 0;
	    }
	    i_24_++;
	}
	return i_24_ - (-1 + i_22_);
    }
    
    efa(byte[] is) {
	int i = is.length;
	c = is;
	a = new int[i];
	int[] is_27_ = new int[33];
	b = new int[8];
	int i_28_ = 0;
	for (int i_29_ = 0; i_29_ < i; i_29_++) {
	    int i_30_ = is[i_29_];
	    if (i_30_ != 0) {
		int i_31_ = 1 << -i_30_ + 32;
		int i_32_ = is_27_[i_30_];
		a[i_29_] = i_32_;
		int i_33_;
		if ((i_31_ & i_32_) == 0) {
		    i_33_ = i_31_ | i_32_;
		    for (int i_34_ = i_30_ - 1; i_34_ >= 1; i_34_--) {
			int i_35_ = is_27_[i_34_];
			if (i_32_ != i_35_)
			    break;
			int i_36_ = 1 << 32 - i_34_;
			if ((i_36_ & i_35_) != 0) {
			    is_27_[i_34_] = is_27_[i_34_ - 1];
			    break;
			}
			is_27_[i_34_] = hba.bitwiseArg1ORArg2(i_35_, i_36_);
		    }
		} else
		    i_33_ = is_27_[i_30_ - 1];
		is_27_[i_30_] = i_33_;
		for (int i_37_ = i_30_ + 1; i_37_ <= 32; i_37_++) {
		    if (i_32_ == is_27_[i_37_])
			is_27_[i_37_] = i_33_;
		}
		int i_38_ = 0;
		for (int i_39_ = 0; i_30_ > i_39_; i_39_++) {
		    int i_40_ = -2147483648 >>> i_39_;
		    if ((i_40_ & i_32_) == 0)
			i_38_++;
		    else {
			if (b[i_38_] == 0)
			    b[i_38_] = i_28_;
			i_38_ = b[i_38_];
		    }
		    i_40_ >>>= 1;
		    if (b.length <= i_38_) {
			int[] is_41_ = new int[b.length * 2];
			for (int i_42_ = 0; i_42_ < b.length; i_42_++)
			    is_41_[i_42_] = b[i_42_];
			b = is_41_;
		    }
		}
		if (i_38_ >= i_28_)
		    i_28_ = i_38_ + 1;
		b[i_38_] = i_29_ ^ 0xffffffff;
	    }
	}
    }
}
