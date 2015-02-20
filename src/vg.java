/* vg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vg extends ha
{
    byte[] w;
    static int x;
    int y;
    int z;
    int A;
    static int B;
    static int C;
    static int D;
    static int[] E = new int[1000];
    static int F = 0;
    static int G;
    static int H;
    int I;
    static baa J = new baa(12, 0, 1, 0);
    
    final void a(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
	((vg) this).I = i_0_;
	((vg) this).A = i_1_ - i_0_;
	((vg) this).y = i;
	if (bool == true) {
	    x++;
	    ((vg) this).z = i_2_ - i;
	}
    }
    
    final void i(int i) {
	D++;
	if (i != -24051)
	    ((vg) this).w = null;
	int i_3_ = -1;
	int i_4_ = ((vg) this).w.length - 8;
	while (i_4_ > i_3_) {
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	    ((vg) this).w[++i_3_] = (byte) 0;
	}
	while (i_3_ < ((vg) this).w.length - 1)
	    ((vg) this).w[++i_3_] = (byte) 0;
    }
    
    static final int a(int i, int i_5_, int i_6_) {
	if (i >= -36)
	    return -17;
	H++;
	int i_7_ = 1;
	for (/**/; i_5_ > 1; i_5_ >>= 1) {
	    if ((0x1 & i_5_) != 0)
		i_7_ *= i_6_;
	    i_6_ *= i_6_;
	}
	if (i_5_ == 1)
	    return i_6_ * i_7_;
	return i_7_;
    }
    
    final void a(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
		 int i_13_) {
	C++;
	int i_14_ = 0;
	if (i_11_ != i_13_)
	    i_14_ = (i_10_ - i_8_ << 16) / (i_13_ - i_11_);
	int i_15_ = 0;
	if (i != i_13_)
	    i_15_ = (i_9_ - i_10_ << 16) / (i - i_13_);
	int i_16_ = 0;
	if (i != i_11_)
	    i_16_ = (i_8_ - i_9_ << 16) / (i_11_ - i);
	int i_17_ = 82 % ((80 - i_12_) / 32);
	if (i_11_ > i_13_ || i_11_ > i) {
	    if (i >= i_13_) {
		if (i >= i_11_) {
		    i_9_ = i_10_ <<= 16;
		    if (i_13_ < 0) {
			i_10_ -= i_13_ * i_15_;
			i_9_ -= i_13_ * i_14_;
			i_13_ = 0;
		    }
		    i_8_ <<= 16;
		    if (i_11_ < 0) {
			i_8_ -= i_16_ * i_11_;
			i_11_ = 0;
		    }
		    if (i_14_ >= i_15_) {
			i -= i_11_;
			i_11_ -= i_13_;
			i_13_ *= ((vg) this).z;
			while (--i_11_ >= 0) {
			    af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 97,
				 i_9_ >> 16, i_13_);
			    i_9_ += i_14_;
			    i_13_ += ((vg) this).z;
			    i_10_ += i_15_;
			}
			while (--i >= 0) {
			    af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 96,
				 i_8_ >> 16, i_13_);
			    i_10_ += i_15_;
			    i_8_ += i_16_;
			    i_13_ += ((vg) this).z;
			}
		    } else {
			i -= i_11_;
			i_11_ -= i_13_;
			i_13_ = ((vg) this).z * i_13_;
			while (--i_11_ >= 0) {
			    af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 112,
				 i_10_ >> 16, i_13_);
			    i_9_ += i_14_;
			    i_10_ += i_15_;
			    i_13_ += ((vg) this).z;
			}
			while (--i >= 0) {
			    af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 127,
				 i_10_ >> 16, i_13_);
			    i_10_ += i_15_;
			    i_8_ += i_16_;
			    i_13_ += ((vg) this).z;
			}
		    }
		} else {
		    i_8_ = i_10_ <<= 16;
		    if (i_13_ < 0) {
			i_10_ -= i_15_ * i_13_;
			i_8_ -= i_13_ * i_14_;
			i_13_ = 0;
		    }
		    i_9_ <<= 16;
		    if (i < 0) {
			i_9_ -= i * i_16_;
			i = 0;
		    }
		    if ((i == i_13_ || i_15_ <= i_14_)
			&& (i != i_13_ || i_16_ >= i_14_)) {
			i_11_ -= i;
			i -= i_13_;
			i_13_ = ((vg) this).z * i_13_;
			while (--i >= 0) {
			    af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 86,
				 i_8_ >> 16, i_13_);
			    i_8_ += i_14_;
			    i_10_ += i_15_;
			    i_13_ += ((vg) this).z;
			}
			while (--i_11_ >= 0) {
			    af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 97,
				 i_8_ >> 16, i_13_);
			    i_13_ += ((vg) this).z;
			    i_9_ += i_16_;
			    i_8_ += i_14_;
			}
		    } else {
			i_11_ -= i;
			i -= i_13_;
			i_13_ = ((vg) this).z * i_13_;
			while (--i >= 0) {
			    af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 110,
				 i_10_ >> 16, i_13_);
			    i_13_ += ((vg) this).z;
			    i_8_ += i_14_;
			    i_10_ += i_15_;
			}
			while (--i_11_ >= 0) {
			    af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 115,
				 i_9_ >> 16, i_13_);
			    i_9_ += i_16_;
			    i_8_ += i_14_;
			    i_13_ += ((vg) this).z;
			}
		    }
		}
	    } else if (i_11_ >= i_13_) {
		i_8_ = i_9_ <<= 16;
		if (i < 0) {
		    i_9_ -= i * i_16_;
		    i_8_ -= i_15_ * i;
		    i = 0;
		}
		i_10_ <<= 16;
		if (i_13_ < 0) {
		    i_10_ -= i_13_ * i_14_;
		    i_13_ = 0;
		}
		if (i_16_ > i_15_) {
		    i_11_ -= i_13_;
		    i_13_ -= i;
		    i *= ((vg) this).z;
		    while (--i_13_ >= 0) {
			af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 124,
			     i_9_ >> 16, i);
			i_8_ += i_15_;
			i += ((vg) this).z;
			i_9_ += i_16_;
		    }
		    while (--i_11_ >= 0) {
			af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 100,
			     i_9_ >> 16, i);
			i += ((vg) this).z;
			i_9_ += i_16_;
			i_10_ += i_14_;
		    }
		} else {
		    i_11_ -= i_13_;
		    i_13_ -= i;
		    i *= ((vg) this).z;
		    while (--i_13_ >= 0) {
			af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 125,
			     i_8_ >> 16, i);
			i_9_ += i_16_;
			i_8_ += i_15_;
			i += ((vg) this).z;
		    }
		    while (--i_11_ >= 0) {
			af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 89,
			     i_10_ >> 16, i);
			i_9_ += i_16_;
			i += ((vg) this).z;
			i_10_ += i_14_;
		    }
		}
	    } else {
		i_10_ = i_9_ <<= 16;
		i_8_ <<= 16;
		if (i < 0) {
		    i_9_ -= i_16_ * i;
		    i_10_ -= i * i_15_;
		    i = 0;
		}
		if (i_11_ < 0) {
		    i_8_ -= i_14_ * i_11_;
		    i_11_ = 0;
		}
		if (i_15_ >= i_16_) {
		    i_13_ -= i_11_;
		    i_11_ -= i;
		    i *= ((vg) this).z;
		    while (--i_11_ >= 0) {
			af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 98,
			     i_10_ >> 16, i);
			i += ((vg) this).z;
			i_9_ += i_16_;
			i_10_ += i_15_;
		    }
		    while (--i_13_ >= 0) {
			af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 86,
			     i_10_ >> 16, i);
			i_10_ += i_15_;
			i += ((vg) this).z;
			i_8_ += i_14_;
		    }
		} else {
		    i_13_ -= i_11_;
		    i_11_ -= i;
		    i = ((vg) this).z * i;
		    while (--i_11_ >= 0) {
			af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 84,
			     i_9_ >> 16, i);
			i_9_ += i_16_;
			i += ((vg) this).z;
			i_10_ += i_15_;
		    }
		    while (--i_13_ >= 0) {
			af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 86,
			     i_8_ >> 16, i);
			i_10_ += i_15_;
			i_8_ += i_14_;
			i += ((vg) this).z;
		    }
		}
	    }
	} else if (i > i_13_) {
	    i_9_ = i_8_ <<= 16;
	    i_10_ <<= 16;
	    if (i_11_ < 0) {
		i_8_ -= i_11_ * i_14_;
		i_9_ -= i_11_ * i_16_;
		i_11_ = 0;
	    }
	    if (i_13_ < 0) {
		i_10_ -= i_15_ * i_13_;
		i_13_ = 0;
	    }
	    if (i_11_ != i_13_ && i_16_ < i_14_
		|| i_13_ == i_11_ && i_15_ < i_16_) {
		i -= i_13_;
		i_13_ -= i_11_;
		i_11_ = ((vg) this).z * i_11_;
		while (--i_13_ >= 0) {
		    af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 101, i_8_ >> 16,
			 i_11_);
		    i_8_ += i_14_;
		    i_11_ += ((vg) this).z;
		    i_9_ += i_16_;
		}
		while (--i >= 0) {
		    af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 118, i_10_ >> 16,
			 i_11_);
		    i_9_ += i_16_;
		    i_11_ += ((vg) this).z;
		    i_10_ += i_15_;
		}
	    } else {
		i -= i_13_;
		i_13_ -= i_11_;
		i_11_ *= ((vg) this).z;
		while (--i_13_ >= 0) {
		    af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 116, i_9_ >> 16,
			 i_11_);
		    i_11_ += ((vg) this).z;
		    i_8_ += i_14_;
		    i_9_ += i_16_;
		}
		while (--i >= 0) {
		    af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 124, i_9_ >> 16,
			 i_11_);
		    i_10_ += i_15_;
		    i_9_ += i_16_;
		    i_11_ += ((vg) this).z;
		}
	    }
	} else {
	    i_10_ = i_8_ <<= 16;
	    i_9_ <<= 16;
	    if (i_11_ < 0) {
		i_10_ -= i_16_ * i_11_;
		i_8_ -= i_14_ * i_11_;
		i_11_ = 0;
	    }
	    if (i < 0) {
		i_9_ -= i * i_15_;
		i = 0;
	    }
	    if (i != i_11_ && i_14_ > i_16_ || i == i_11_ && i_15_ > i_14_) {
		i_13_ -= i;
		i -= i_11_;
		i_11_ *= ((vg) this).z;
		while (--i >= 0) {
		    af.a(i_10_ >> 16, 0, ((vg) this).w, (byte) 125, i_8_ >> 16,
			 i_11_);
		    i_10_ += i_16_;
		    i_11_ += ((vg) this).z;
		    i_8_ += i_14_;
		}
		while (--i_13_ >= 0) {
		    af.a(i_9_ >> 16, 0, ((vg) this).w, (byte) 102, i_8_ >> 16,
			 i_11_);
		    i_9_ += i_15_;
		    i_8_ += i_14_;
		    i_11_ += ((vg) this).z;
		}
	    } else {
		i_13_ -= i;
		i -= i_11_;
		i_11_ *= ((vg) this).z;
		while (--i >= 0) {
		    af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 82, i_10_ >> 16,
			 i_11_);
		    i_11_ += ((vg) this).z;
		    i_10_ += i_16_;
		    i_8_ += i_14_;
		}
		while (--i_13_ >= 0) {
		    af.a(i_8_ >> 16, 0, ((vg) this).w, (byte) 118, i_9_ >> 16,
			 i_11_);
		    i_8_ += i_14_;
		    i_11_ += ((vg) this).z;
		    i_9_ += i_15_;
		}
	    }
	}
    }
    
    final boolean b(int i, int i_18_, int i_19_) {
	int i_20_ = 93 % ((i_18_ - 15) / 51);
	G++;
	if (i_19_ * i > ((vg) this).w.length)
	    return false;
	return true;
    }
    
    public static void a(boolean bool) {
	E = null;
	J = null;
	if (bool != false)
	    a((byte) 76, 83, -29, -65, 100, 122, 98);
    }
    
    vg(qj var_qj, int i, int i_21_) {
	((vg) this).w = new byte[i_21_ * i];
    }
    
    static final boolean a(byte i, int i_22_, int i_23_, int i_24_, int i_25_,
			   int i_26_, int i_27_) {
	B++;
	if (!il.k)
	    return false;
	if (io.X < 100)
	    return false;
	if (i_27_ == i_24_ && i_26_ == i_23_) {
	    if (!vk.a(i_25_, i_27_, -1, i_23_))
		return false;
	    int i_28_ = i_27_ << Class_fb.a;
	    int i_29_ = i_23_ << Class_fb.a;
	    if (dd.a(false, bea.o, i_22_, i_29_,
		     Class_q.b[i_25_].a(i_23_, (byte) 51, i_27_), i_28_,
		     bea.o)) {
		ld.c++;
		return true;
	    }
	    return false;
	}
	for (int i_30_ = i_27_; i_24_ >= i_30_; i_30_++) {
	    for (int i_31_ = i_23_; i_31_ <= i_26_; i_31_++) {
		if (-dca.S == ega.k[i_25_][i_30_][i_31_])
		    return false;
	    }
	}
	int i_32_ = (i_27_ << Class_fb.a) + 1;
	int i_33_ = (i_23_ << Class_fb.a) + 2;
	if (!dd.a(false, (i_26_ + 1 - i_23_) * bea.o, i_22_, i_33_,
		  Class_q.b[i_25_].a(i_23_, (byte) 51, i_27_), i_32_,
		  (i_24_ - i_27_ + 1) * bea.o))
	    return false;
	if (i <= 52)
	    return true;
	ld.c++;
	return true;
    }
}
