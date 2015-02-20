/* mfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mfa
{
    static oj a;
    static int b;
    static int c;
    int d = 128;
    int e;
    static nm f = new nm(0, -1);
    static int g;
    int h;
    static int i;
    static int[] j = new int[25];
    static float k;
    int l;
    int m;
    int n = 128;
    
    final mfa a(int i) {
	int i_0_ = -18 / ((-8 - i) / 38);
	g++;
	return new mfa(((mfa) this).l, ((mfa) this).n, ((mfa) this).d,
		       ((mfa) this).h, ((mfa) this).e, ((mfa) this).m);
    }
    
    static final int a(int i, int i_1_) {
	i_1_ = (i_1_ & 0x55555555) + ((i_1_ & ~0x55555554) >>> 1);
	mfa.i++;
	i_1_ = (i_1_ & 0x33333333) + ((i_1_ & ~0x33333330) >>> 2);
	i_1_ = 0xf0f0f0f & i_1_ + (i_1_ >>> 4);
	i_1_ += i_1_ >>> 8;
	i_1_ += i_1_ >>> 16;
	int i_2_ = -25 % ((72 - i) / 34);
	return i_1_ & 0xff;
    }
    
    public static void b(int i) {
	j = null;
	a = null;
	f = null;
	if (i != 28163)
	    b(-97);
    }
    
    static final int a(byte[][] is, byte[] is_3_, int[] is_4_, boolean bool,
		       byte[][] is_5_, int[] is_6_, int i, int i_7_) {
	b++;
	int i_8_ = is_4_[i_7_];
	int i_9_ = i_8_ + is_6_[i_7_];
	int i_10_ = is_4_[i];
	int i_11_ = i_10_ + is_6_[i];
	int i_12_ = i_8_;
	if (i_10_ > i_8_)
	    i_12_ = i_10_;
	int i_13_ = i_9_;
	if (i_9_ > i_11_)
	    i_13_ = i_11_;
	int i_14_ = 0xff & is_3_[i_7_];
	if (i_14_ > (is_3_[i] & 0xff))
	    i_14_ = is_3_[i] & 0xff;
	byte[] is_15_ = is_5_[i_7_];
	byte[] is_16_ = is[i];
	int i_17_ = i_12_ - i_8_;
	int i_18_ = i_12_ - i_10_;
	for (int i_19_ = i_12_; i_13_ > i_19_; i_19_++) {
	    int i_20_ = is_16_[i_18_++] + is_15_[i_17_++];
	    if (i_14_ > i_20_)
		i_14_ = i_20_;
	}
	if (bool != false)
	    k = -1.9385135F;
	return -i_14_;
    }
    
    final void a(mfa var_mfa_21_, int i) {
	((mfa) this).l = ((mfa) var_mfa_21_).l;
	((mfa) this).h = ((mfa) var_mfa_21_).h;
	((mfa) this).n = ((mfa) var_mfa_21_).n;
	((mfa) this).d = ((mfa) var_mfa_21_).d;
	((mfa) this).e = ((mfa) var_mfa_21_).e;
	c++;
	if (i != 255)
	    j = null;
	((mfa) this).m = ((mfa) var_mfa_21_).m;
    }
    
    mfa(int i) {
	((mfa) this).l = i;
    }
    
    private mfa(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
	((mfa) this).e = i_25_;
	((mfa) this).m = i_26_;
	((mfa) this).l = i;
	((mfa) this).n = i_22_;
	((mfa) this).d = i_23_;
	((mfa) this).h = i_24_;
    }
}
