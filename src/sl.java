/* sl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sl extends Class_pb
{
    static int j;
    static int k;
    static boolean fpsOn = false;
    private int m;
    static int n;
    private int o;
    private int p;
    private int q;
    static int r;
    static int s;
    private int t;
    private int u;
    static int v;
    private int w;
    private int x;
    static int y;
    static int z;
    
    static final boolean a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
			   int i_9_, wd var_wd) {
	z++;
	int i_10_ = i_5_;
	int i_11_ = i_6_;
	int i_12_ = 64;
	int i_13_ = 64;
	int i_14_ = i_5_ - i_12_;
	it.J[i_12_][i_13_] = 99;
	int i_15_ = i_6_ - i_13_;
	ps.b[i_12_][i_13_] = 0;
	int i_16_ = 0;
	Class_ad.l[i_16_] = i_10_;
	int i_17_ = 0;
	jn.I[i_16_++] = i_11_;
	int[][] is = ((wd) var_wd).e;
	if (i >= -19)
	    return false;
    while_212_:
	while (i_17_ != i_16_) {
	    i_11_ = jn.I[i_17_];
	    i_10_ = Class_ad.l[i_17_];
	    i_12_ = i_10_ - i_14_;
	    i_13_ = i_11_ - i_15_;
	    i_17_ = i_17_ + 1 & 0xfff;
	    int i_18_ = i_10_ - ((wd) var_wd).w;
	    int i_19_ = i_11_ - ((wd) var_wd).o;
	    int i_20_ = i_1_;
	while_204_:
	    do {
	    while_203_:
		do {
		while_202_:
		    do {
		    while_201_:
			do {
			    do {
				if (i_20_ != -4) {
				    if (i_20_ != -3) {
					if (i_20_ != -2) {
					    if ((i_20_ ^ 0xffffffff) != 0) {
						if (i_20_ == 0 || i_20_ == 1
						    || i_20_ == 2 || i_20_ == 3
						    || i_20_ == 9)
						    break while_202_;
						break while_203_;
					    }
					} else
					    break;
					break while_201_;
				    }
				} else {
				    if (i_10_ == i_8_ && i_3_ == i_11_) {
					bd.l = i_10_;
					je.m = i_11_;
					return true;
				    }
				    break while_204_;
				}
				if (eaa.a(i_10_, false, i_2_, i_11_, i_0_,
					  i_8_, i_3_, i_2_, i_9_)) {
				    bd.l = i_10_;
				    je.m = i_11_;
				    return true;
				}
				break while_204_;
			    } while (false);
			    if (var_wd.a(i_0_, i_2_, (byte) 118, i_3_, i_7_,
					 i_8_, i_9_, i_11_, i_10_, i_2_)) {
				bd.l = i_10_;
				je.m = i_11_;
				return true;
			    }
			    break while_204_;
			} while (false);
			if (var_wd.a(-1, i_0_, i_8_, i_11_, i_3_, i_9_, i_10_,
				     i_7_, i_2_)) {
			    je.m = i_11_;
			    bd.l = i_10_;
			    return true;
			}
			break while_204_;
		    } while (false);
		    if (var_wd.b(i_10_, i_11_, i_2_, 67108864, i_3_, i_4_,
				 i_1_, i_8_)) {
			je.m = i_11_;
			bd.l = i_10_;
			return true;
		    }
		    break while_204_;
		} while (false);
		if (var_wd.a(i_2_, 80, i_1_, i_3_, i_4_, i_11_, i_10_, i_8_)) {
		    je.m = i_11_;
		    bd.l = i_10_;
		    return true;
		}
	    } while (false);
	    i_20_ = ps.b[i_12_][i_13_] + 1;
	while_205_:
	    do {
		if (i_12_ > 0 && it.J[i_12_ - 1][i_13_] == 0
		    && (0x43a40000 & is[i_18_ - 1][i_19_]) == 0
		    && (0x4e240000 & is[i_18_ - 1][i_2_ + i_19_ - 1]) == 0) {
		    for (int i_21_ = 1; i_2_ - 1 > i_21_; i_21_++) {
			if ((0x4fa40000 & is[i_18_ - 1][i_21_ + i_19_]) != 0)
			    break while_205_;
		    }
		    Class_ad.l[i_16_] = i_10_ - 1;
		    jn.I[i_16_] = i_11_;
		    i_16_ = i_16_ + 1 & 0xfff;
		    it.J[i_12_ - 1][i_13_] = 2;
		    ps.b[i_12_ - 1][i_13_] = i_20_;
		}
	    } while (false);
	while_206_:
	    do {
		if (i_12_ < -i_2_ + 128 && it.J[i_12_ + 1][i_13_] == 0
		    && (is[i_2_ + i_18_][i_19_] & 0x60e40000) == 0
		    && ((is[i_18_ + i_2_][i_2_ - 1 + i_19_] & 0x78240000)
			== 0)) {
		    for (int i_22_ = 1; i_2_ - 1 > i_22_; i_22_++) {
			if ((0x78e40000 & is[i_2_ + i_18_][i_19_ + i_22_])
			    != 0)
			    break while_206_;
		    }
		    Class_ad.l[i_16_] = i_10_ + 1;
		    jn.I[i_16_] = i_11_;
		    it.J[i_12_ + 1][i_13_] = 8;
		    i_16_ = i_16_ + 1 & 0xfff;
		    ps.b[i_12_ + 1][i_13_] = i_20_;
		}
	    } while (false);
	while_207_:
	    do {
		if (i_13_ > 0 && it.J[i_12_][i_13_ - 1] == 0
		    && (0x43a40000 & is[i_18_][i_19_ - 1]) == 0
		    && (0x60e40000 & is[i_18_ + (i_2_ - 1)][i_19_ - 1]) == 0) {
		    for (int i_23_ = 1; i_23_ < i_2_ - 1; i_23_++) {
			if ((0x63e40000 & is[i_18_ + i_23_][i_19_ - 1]) != 0)
			    break while_207_;
		    }
		    Class_ad.l[i_16_] = i_10_;
		    jn.I[i_16_] = i_11_ - 1;
		    it.J[i_12_][i_13_ - 1] = 1;
		    i_16_ = i_16_ + 1 & 0xfff;
		    ps.b[i_12_][i_13_ - 1] = i_20_;
		}
	    } while (false);
	while_208_:
	    do {
		if (i_13_ < -i_2_ + 128 && it.J[i_12_][i_13_ + 1] == 0
		    && (0x4e240000 & is[i_18_][i_19_ + i_2_]) == 0
		    && ((is[i_2_ + i_18_ - 1][i_2_ + i_19_] & 0x78240000)
			== 0)) {
		    for (int i_24_ = 1; i_24_ < i_2_ - 1; i_24_++) {
			if ((is[i_18_ + i_24_][i_19_ + i_2_] & 0x7e240000)
			    != 0)
			    break while_208_;
		    }
		    Class_ad.l[i_16_] = i_10_;
		    jn.I[i_16_] = i_11_ + 1;
		    i_16_ = 0xfff & i_16_ + 1;
		    it.J[i_12_][i_13_ + 1] = 4;
		    ps.b[i_12_][i_13_ + 1] = i_20_;
		}
	    } while (false);
	while_209_:
	    do {
		if (i_12_ > 0 && i_13_ > 0 && it.J[i_12_ - 1][i_13_ - 1] == 0
		    && (is[i_18_ - 1][i_19_ - 1] & 0x43a40000) == 0) {
		    for (int i_25_ = 1; i_2_ > i_25_; i_25_++) {
			if (((0x4fa40000 & is[i_18_ - 1][i_19_ - 1 + i_25_])
			     != 0)
			    || ((is[i_25_ - 1 + i_18_][i_19_ - 1] & 0x63e40000)
				!= 0))
			    break while_209_;
		    }
		    Class_ad.l[i_16_] = i_10_ - 1;
		    jn.I[i_16_] = i_11_ - 1;
		    it.J[i_12_ - 1][i_13_ - 1] = 3;
		    i_16_ = i_16_ + 1 & 0xfff;
		    ps.b[i_12_ - 1][i_13_ - 1] = i_20_;
		}
	    } while (false);
	while_210_:
	    do {
		if (i_12_ < -i_2_ + 128 && i_13_ > 0
		    && it.J[i_12_ + 1][i_13_ - 1] == 0
		    && (0x60e40000 & is[i_18_ + i_2_][i_19_ - 1]) == 0) {
		    for (int i_26_ = 1; i_26_ < i_2_; i_26_++) {
			if (((0x78e40000 & is[i_18_ + i_2_][i_26_ + i_19_ - 1])
			     != 0)
			    || ((is[i_26_ + i_18_][i_19_ - 1] & 0x63e40000)
				!= 0))
			    break while_210_;
		    }
		    Class_ad.l[i_16_] = i_10_ + 1;
		    jn.I[i_16_] = i_11_ - 1;
		    i_16_ = i_16_ + 1 & 0xfff;
		    it.J[i_12_ + 1][i_13_ - 1] = 9;
		    ps.b[i_12_ + 1][i_13_ - 1] = i_20_;
		}
	    } while (false);
	while_211_:
	    do {
		if (i_12_ > 0 && 128 - i_2_ > i_13_
		    && it.J[i_12_ - 1][i_13_ + 1] == 0
		    && (is[i_18_ - 1][i_19_ + i_2_] & 0x4e240000) == 0) {
		    for (int i_27_ = 1; i_27_ < i_2_; i_27_++) {
			if ((is[i_18_ - 1][i_19_ + i_27_] & 0x4fa40000) != 0
			    || (0x7e240000
				& is[i_27_ + (i_18_ - 1)][i_2_ + i_19_]) != 0)
			    break while_211_;
		    }
		    Class_ad.l[i_16_] = i_10_ - 1;
		    jn.I[i_16_] = i_11_ + 1;
		    i_16_ = i_16_ + 1 & 0xfff;
		    it.J[i_12_ - 1][i_13_ + 1] = 6;
		    ps.b[i_12_ - 1][i_13_ + 1] = i_20_;
		}
	    } while (false);
	    if (-i_2_ + 128 > i_12_ && i_13_ < 128 - i_2_
		&& it.J[i_12_ + 1][i_13_ + 1] == 0
		&& (is[i_2_ + i_18_][i_19_ + i_2_] & 0x78240000) == 0) {
		for (int i_28_ = 1; i_2_ > i_28_; i_28_++) {
		    if ((0x7e240000 & is[i_18_ + i_28_][i_19_ + i_2_]) != 0
			|| (is[i_2_ + i_18_][i_19_ + i_28_] & 0x78e40000) != 0)
			continue while_212_;
		}
		Class_ad.l[i_16_] = i_10_ + 1;
		jn.I[i_16_] = i_11_ + 1;
		i_16_ = 0xfff & i_16_ + 1;
		it.J[i_12_ + 1][i_13_ + 1] = 12;
		ps.b[i_12_ + 1][i_13_ + 1] = i_20_;
	    }
	}
	bd.l = i_10_;
	je.m = i_11_;
	return false;
    }
    
    final void a(int i, byte i_29_, int i_30_) {
	v++;
	if (i_29_ != -34)
	    b(-24, (int) 83);
    }
    
    sl(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_,
       int i_37_, int i_38_, int i_39_) {
	super(-1, i_38_, i_39_);
	m = i_36_;
	p = i_34_;
	x = i_37_;
	w = i_33_;
	u = i_31_;
	t = i;
	o = i_32_;
	q = i_35_;
    }
    
    final void a(int i, int i_40_, int i_41_) {
	if (i_40_ != -21716)
	    w = 115;
	y++;
    }
    
    static final int a(int i, int i_42_, int i_43_, int i_44_) {
	if (i_42_ != 4095)
	    return -13;
	s++;
	if (i < i_43_)
	    return i_43_;
	if (i <= i_44_)
	    return i;
	return i_44_;
    }
    
    static final boolean b(int i, int i_45_) {
	r++;
	if (i_45_ == 23 || i_45_ == 5 || i_45_ == 17 || i_45_ == 58
	    || i_45_ == 13)
	    return true;
	if (i_45_ == 20 || i_45_ == 1001)
	    return true;
	if (i != -1)
	    j = 33;
	return false;
    }
    
    final void b(int i, int i_46_, int i_47_) {
	n++;
	int i_48_ = t * i_46_ >> 12;
	int i_49_ = i * u >> 12;
	int i_50_ = o * i_46_ >> 12;
	if (i_47_ == 4) {
	    int i_51_ = i * w >> 12;
	    int i_52_ = p * i_46_ >> 12;
	    int i_53_ = q * i >> 12;
	    int i_54_ = m * i_46_ >> 12;
	    int i_55_ = x * i >> 12;
	    cm.a(i_48_, i_52_, i_49_, (byte) 42, ((Class_pb) this).c, i_51_,
		 i_55_, i_54_, i_50_, i_53_);
	}
    }
}
