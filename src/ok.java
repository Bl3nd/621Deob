/* ok - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ok extends ha
{
    int w;
    static Class_ae x = new Class_ae();
    int y;
    static int z;
    byte[] A;
    int B;
    static boolean C;
    static int D;
    static int E;
    static int F;
    static int G;
    static int[] H;
    static int I;
    int J;
    
    public static void b(byte i) {
	x = null;
	int i_0_ = 67 / ((i + 51) / 58);
	H = null;
    }
    
    final void a(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
	z++;
	if (i_2_ == 1831282672) {
	    ((ok) this).w = i_4_ - i_3_;
	    ((ok) this).J = i - i_1_;
	    ((ok) this).B = i_1_;
	    ((ok) this).y = i_3_;
	}
    }
    
    final boolean a(int i, int i_5_, int i_6_) {
	I++;
	if (i_5_ > -5)
	    return true;
	if (((ok) this).A.length < i_6_ * i)
	    return false;
	return true;
    }
    
    static final void a(pl var_pl, pl var_pl_7_, int i, int i_8_) {
	eda.j = var_pl_7_;
	int i_9_ = -16 / ((i_8_ + 37) / 41);
	qe.e = var_pl;
	D++;
    }
    
    final void a(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
		 int i_15_) {
	F++;
	int i_16_ = 0;
	if (i_11_ != i_15_)
	    i_16_ = (i_14_ - i_13_ << 16) / (i_15_ - i_11_);
	if (i_10_ != -3417)
	    G = 65;
	int i_17_ = 0;
	if (i_15_ != i_12_)
	    i_17_ = (i - i_14_ << 16) / (i_12_ - i_15_);
	int i_18_ = 0;
	if (i_12_ != i_11_)
	    i_18_ = (i_13_ - i << 16) / (i_11_ - i_12_);
	if (i_11_ > i_15_ || i_11_ > i_12_) {
	    if (i_15_ <= i_12_) {
		if (i_12_ < i_11_) {
		    i_13_ = i_14_ <<= 16;
		    i <<= 16;
		    if (i_15_ < 0) {
			i_14_ -= i_15_ * i_17_;
			i_13_ -= i_15_ * i_16_;
			i_15_ = 0;
		    }
		    if (i_12_ < 0) {
			i -= i_12_ * i_18_;
			i_12_ = 0;
		    }
		    if (i_12_ != i_15_ && i_17_ > i_16_
			|| i_12_ == i_15_ && i_18_ < i_16_) {
			i_11_ -= i_12_;
			i_12_ -= i_15_;
			i_15_ = ((ok) this).w * i_15_;
			while (--i_12_ >= 0) {
			    id.a(i_14_ >> 16, 0, i_15_, true, i_13_ >> 16,
				 ((ok) this).A);
			    i_15_ += ((ok) this).w;
			    i_13_ += i_16_;
			    i_14_ += i_17_;
			}
			while (--i_11_ >= 0) {
			    id.a(i >> 16, 0, i_15_, true, i_13_ >> 16,
				 ((ok) this).A);
			    i_15_ += ((ok) this).w;
			    i_13_ += i_16_;
			    i += i_18_;
			}
		    } else {
			i_11_ -= i_12_;
			i_12_ -= i_15_;
			i_15_ = ((ok) this).w * i_15_;
			while (--i_12_ >= 0) {
			    id.a(i_13_ >> 16, 0, i_15_, true, i_14_ >> 16,
				 ((ok) this).A);
			    i_13_ += i_16_;
			    i_15_ += ((ok) this).w;
			    i_14_ += i_17_;
			}
			while (--i_11_ >= 0) {
			    id.a(i_13_ >> 16, 0, i_15_, true, i >> 16,
				 ((ok) this).A);
			    i += i_18_;
			    i_15_ += ((ok) this).w;
			    i_13_ += i_16_;
			}
		    }
		} else {
		    i = i_14_ <<= 16;
		    if (i_15_ < 0) {
			i -= i_16_ * i_15_;
			i_14_ -= i_17_ * i_15_;
			i_15_ = 0;
		    }
		    i_13_ <<= 16;
		    if (i_11_ < 0) {
			i_13_ -= i_18_ * i_11_;
			i_11_ = 0;
		    }
		    if (i_16_ >= i_17_) {
			i_12_ -= i_11_;
			i_11_ -= i_15_;
			i_15_ *= ((ok) this).w;
			while (--i_11_ >= 0) {
			    id.a(i >> 16, 0, i_15_, true, i_14_ >> 16,
				 ((ok) this).A);
			    i_14_ += i_17_;
			    i_15_ += ((ok) this).w;
			    i += i_16_;
			}
			while (--i_12_ >= 0) {
			    id.a(i_13_ >> 16, 0, i_15_, true, i_14_ >> 16,
				 ((ok) this).A);
			    i_15_ += ((ok) this).w;
			    i_13_ += i_18_;
			    i_14_ += i_17_;
			}
		    } else {
			i_12_ -= i_11_;
			i_11_ -= i_15_;
			i_15_ = ((ok) this).w * i_15_;
			while (--i_11_ >= 0) {
			    id.a(i_14_ >> 16, 0, i_15_, true, i >> 16,
				 ((ok) this).A);
			    i += i_16_;
			    i_14_ += i_17_;
			    i_15_ += ((ok) this).w;
			}
			while (--i_12_ >= 0) {
			    id.a(i_14_ >> 16, 0, i_15_, true, i_13_ >> 16,
				 ((ok) this).A);
			    i_13_ += i_18_;
			    i_15_ += ((ok) this).w;
			    i_14_ += i_17_;
			}
		    }
		}
	    } else if (i_11_ >= i_15_) {
		i_13_ = i <<= 16;
		i_14_ <<= 16;
		if (i_12_ < 0) {
		    i_13_ -= i_17_ * i_12_;
		    i -= i_12_ * i_18_;
		    i_12_ = 0;
		}
		if (i_15_ < 0) {
		    i_14_ -= i_15_ * i_16_;
		    i_15_ = 0;
		}
		if (i_17_ < i_18_) {
		    i_11_ -= i_15_;
		    i_15_ -= i_12_;
		    i_12_ = ((ok) this).w * i_12_;
		    while (--i_15_ >= 0) {
			id.a(i >> 16, 0, i_12_, true, i_13_ >> 16,
			     ((ok) this).A);
			i_13_ += i_17_;
			i += i_18_;
			i_12_ += ((ok) this).w;
		    }
		    while (--i_11_ >= 0) {
			id.a(i >> 16, 0, i_12_, true, i_14_ >> 16,
			     ((ok) this).A);
			i_14_ += i_16_;
			i_12_ += ((ok) this).w;
			i += i_18_;
		    }
		} else {
		    i_11_ -= i_15_;
		    i_15_ -= i_12_;
		    i_12_ = ((ok) this).w * i_12_;
		    while (--i_15_ >= 0) {
			id.a(i_13_ >> 16, 0, i_12_, true, i >> 16,
			     ((ok) this).A);
			i_13_ += i_17_;
			i_12_ += ((ok) this).w;
			i += i_18_;
		    }
		    while (--i_11_ >= 0) {
			id.a(i_14_ >> 16, 0, i_12_, true, i >> 16,
			     ((ok) this).A);
			i_12_ += ((ok) this).w;
			i_14_ += i_16_;
			i += i_18_;
		    }
		}
	    } else {
		i_14_ = i <<= 16;
		i_13_ <<= 16;
		if (i_12_ < 0) {
		    i -= i_18_ * i_12_;
		    i_14_ -= i_17_ * i_12_;
		    i_12_ = 0;
		}
		if (i_11_ < 0) {
		    i_13_ -= i_11_ * i_16_;
		    i_11_ = 0;
		}
		if (i_17_ < i_18_) {
		    i_15_ -= i_11_;
		    i_11_ -= i_12_;
		    i_12_ = ((ok) this).w * i_12_;
		    while (--i_11_ >= 0) {
			id.a(i >> 16, 0, i_12_, true, i_14_ >> 16,
			     ((ok) this).A);
			i_14_ += i_17_;
			i += i_18_;
			i_12_ += ((ok) this).w;
		    }
		    while (--i_15_ >= 0) {
			id.a(i_13_ >> 16, 0, i_12_, true, i_14_ >> 16,
			     ((ok) this).A);
			i_14_ += i_17_;
			i_12_ += ((ok) this).w;
			i_13_ += i_16_;
		    }
		} else {
		    i_15_ -= i_11_;
		    i_11_ -= i_12_;
		    i_12_ = ((ok) this).w * i_12_;
		    while (--i_11_ >= 0) {
			id.a(i_14_ >> 16, 0, i_12_, true, i >> 16,
			     ((ok) this).A);
			i_12_ += ((ok) this).w;
			i += i_18_;
			i_14_ += i_17_;
		    }
		    while (--i_15_ >= 0) {
			id.a(i_14_ >> 16, 0, i_12_, true, i_13_ >> 16,
			     ((ok) this).A);
			i_13_ += i_16_;
			i_14_ += i_17_;
			i_12_ += ((ok) this).w;
		    }
		}
	    }
	} else if (i_15_ >= i_12_) {
	    i_14_ = i_13_ <<= 16;
	    i <<= 16;
	    if (i_11_ < 0) {
		i_13_ -= i_16_ * i_11_;
		i_14_ -= i_18_ * i_11_;
		i_11_ = 0;
	    }
	    if (i_12_ < 0) {
		i -= i_17_ * i_12_;
		i_12_ = 0;
	    }
	    if (i_11_ != i_12_ && i_16_ > i_18_
		|| i_11_ == i_12_ && i_16_ < i_17_) {
		i_15_ -= i_12_;
		i_12_ -= i_11_;
		i_11_ = ((ok) this).w * i_11_;
		while (--i_12_ >= 0) {
		    id.a(i_13_ >> 16, 0, i_11_, true, i_14_ >> 16,
			 ((ok) this).A);
		    i_11_ += ((ok) this).w;
		    i_13_ += i_16_;
		    i_14_ += i_18_;
		}
		while (--i_15_ >= 0) {
		    id.a(i_13_ >> 16, 0, i_11_, true, i >> 16, ((ok) this).A);
		    i_13_ += i_16_;
		    i += i_17_;
		    i_11_ += ((ok) this).w;
		}
	    } else {
		i_15_ -= i_12_;
		i_12_ -= i_11_;
		i_11_ *= ((ok) this).w;
		while (--i_12_ >= 0) {
		    id.a(i_14_ >> 16, 0, i_11_, true, i_13_ >> 16,
			 ((ok) this).A);
		    i_13_ += i_16_;
		    i_11_ += ((ok) this).w;
		    i_14_ += i_18_;
		}
		while (--i_15_ >= 0) {
		    id.a(i >> 16, 0, i_11_, true, i_13_ >> 16, ((ok) this).A);
		    i_13_ += i_16_;
		    i_11_ += ((ok) this).w;
		    i += i_17_;
		}
	    }
	} else {
	    i = i_13_ <<= 16;
	    if (i_11_ < 0) {
		i_13_ -= i_11_ * i_16_;
		i -= i_18_ * i_11_;
		i_11_ = 0;
	    }
	    i_14_ <<= 16;
	    if (i_15_ < 0) {
		i_14_ -= i_15_ * i_17_;
		i_15_ = 0;
	    }
	    if (i_11_ != i_15_ && i_18_ < i_16_
		|| i_11_ == i_15_ && i_17_ < i_18_) {
		i_12_ -= i_15_;
		i_15_ -= i_11_;
		i_11_ = ((ok) this).w * i_11_;
		while (--i_15_ >= 0) {
		    id.a(i_13_ >> 16, 0, i_11_, true, i >> 16, ((ok) this).A);
		    i += i_18_;
		    i_11_ += ((ok) this).w;
		    i_13_ += i_16_;
		}
		while (--i_12_ >= 0) {
		    id.a(i_14_ >> 16, 0, i_11_, true, i >> 16, ((ok) this).A);
		    i_14_ += i_17_;
		    i_11_ += ((ok) this).w;
		    i += i_18_;
		}
	    } else {
		i_12_ -= i_15_;
		i_15_ -= i_11_;
		i_11_ = ((ok) this).w * i_11_;
		while (--i_15_ >= 0) {
		    id.a(i >> 16, 0, i_11_, true, i_13_ >> 16, ((ok) this).A);
		    i += i_18_;
		    i_13_ += i_16_;
		    i_11_ += ((ok) this).w;
		}
		while (--i_12_ >= 0) {
		    id.a(i >> 16, 0, i_11_, true, i_14_ >> 16, ((ok) this).A);
		    i += i_18_;
		    i_11_ += ((ok) this).w;
		    i_14_ += i_17_;
		}
	    }
	}
    }
    
    final void i(int i) {
	E++;
	int i_19_ = -1;
	if (i <= 23)
	    b((byte) -43);
	int i_20_ = ((ok) this).A.length - 8;
	while (i_20_ > i_19_) {
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	    ((ok) this).A[++i_19_] = (byte) 0;
	}
	while (((ok) this).A.length - 1 > i_19_)
	    ((ok) this).A[++i_19_] = (byte) 0;
    }
    
    ok(en var_en, int i, int i_21_) {
	((ok) this).A = new byte[i * i_21_];
    }
}
