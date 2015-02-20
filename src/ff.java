/* ff - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ff
{
    int a;
    static baa b = new baa(14, 0, 4, 1);
    int c;
    int d;
    int e;
    int f = 128;
    static int g;
    static int h;
    static int i;
    int j;
    int k;
    static int width;
    int m;
    int n;
    int o;
    static dda[] p;
    static int q;
    static Signlink signlink;
    static int s = 999999;
    int t;
    
    static final void a(int i, int i_0_, Entity var_ni, int i_1_, int i_2_) {
	g++;
	cg var_cg = var_ni.k(32195);
	int i_3_ = 0x3fff & ((Entity) var_ni).Gb - ((Class_kd) ((Entity) var_ni).class_kd).i;
	if (i_0_ != -1) {
	    if ((((Entity) var_ni).faceEntityID ^ 0xffffffff) == 0
		|| i_3_ < 10240 && i_3_ > 2048) {
		if (i_3_ != 0 || ((Entity) var_ni).nb > 25) {
		    if (i_0_ != 2 || (((cg) var_cg).h ^ 0xffffffff) == 0) {
			if (i_0_ != 0 || ((cg) var_cg).j == -1) {
			    if (i < 0 && ((cg) var_cg).z != -1)
				((Entity) var_ni).Bc = ((cg) var_cg).z;
			    else if (i > 0
				     && (((cg) var_cg).R ^ 0xffffffff) != 0)
				((Entity) var_ni).Bc = ((cg) var_cg).R;
			    else
				((Entity) var_ni).Bc = ((cg) var_cg).A;
			} else if (i < 0 && ((cg) var_cg).B != -1)
			    ((Entity) var_ni).Bc = ((cg) var_cg).B;
			else if (i > 0 && (((cg) var_cg).G ^ 0xffffffff) != 0)
			    ((Entity) var_ni).Bc = ((cg) var_cg).G;
			else
			    ((Entity) var_ni).Bc = ((cg) var_cg).j;
		    } else if (i < 0 && (((cg) var_cg).H ^ 0xffffffff) != 0)
			((Entity) var_ni).Bc = ((cg) var_cg).H;
		    else if (i > 0 && (((cg) var_cg).T ^ 0xffffffff) != 0)
			((Entity) var_ni).Bc = ((cg) var_cg).T;
		    else
			((Entity) var_ni).Bc = ((cg) var_cg).h;
		    ((Entity) var_ni).V = false;
		} else {
		    ((Entity) var_ni).V = false;
		    if (i_0_ != 2 || (((cg) var_cg).h ^ 0xffffffff) == 0) {
			if (i_0_ != 0 || ((cg) var_cg).j == -1)
			    ((Entity) var_ni).Bc = ((cg) var_cg).A;
			else
			    ((Entity) var_ni).Bc = ((cg) var_cg).j;
		    } else
			((Entity) var_ni).Bc = ((cg) var_cg).h;
		}
	    } else {
		int i_4_
		    = 0x3fff & bd.k[i_2_] - ((Class_kd) ((Entity) var_ni).class_kd).i;
		if (i_0_ == 2 && (((cg) var_cg).h ^ 0xffffffff) != 0) {
		    if (i_4_ <= 2048 || i_4_ > 6144
			|| (((cg) var_cg).X ^ 0xffffffff) == 0) {
			if (i_4_ >= 10240 && i_4_ < 14336
			    && (((cg) var_cg).M ^ 0xffffffff) != 0)
			    ((Entity) var_ni).Bc = ((cg) var_cg).M;
			else if (i_4_ <= 6144 || i_4_ >= 10240
				 || (((cg) var_cg).g ^ 0xffffffff) == 0)
			    ((Entity) var_ni).Bc = ((cg) var_cg).h;
			else
			    ((Entity) var_ni).Bc = ((cg) var_cg).g;
		    } else
			((Entity) var_ni).Bc = ((cg) var_cg).X;
		} else if (i_0_ != 0 || ((cg) var_cg).j == -1) {
		    if (i_4_ <= 2048 || i_4_ > 6144
			|| (((cg) var_cg).o ^ 0xffffffff) == 0) {
			if (i_4_ >= 10240 && i_4_ < 14336
			    && (((cg) var_cg).r ^ 0xffffffff) != 0)
			    ((Entity) var_ni).Bc = ((cg) var_cg).r;
			else if (i_4_ <= 6144 || i_4_ >= 10240
				 || ((cg) var_cg).I == -1)
			    ((Entity) var_ni).Bc = ((cg) var_cg).A;
			else
			    ((Entity) var_ni).Bc = ((cg) var_cg).I;
		    } else
			((Entity) var_ni).Bc = ((cg) var_cg).o;
		} else if (i_4_ <= 2048 || i_4_ > 6144
			   || ((cg) var_cg).u == -1) {
		    if (i_4_ < 10240 || i_4_ >= 14336
			|| ((cg) var_cg).m == -1) {
			if (i_4_ > 6144 && i_4_ < 10240
			    && ((cg) var_cg).e != -1)
			    ((Entity) var_ni).Bc = ((cg) var_cg).e;
			else
			    ((Entity) var_ni).Bc = ((cg) var_cg).j;
		    } else
			((Entity) var_ni).Bc = ((cg) var_cg).m;
		} else
		    ((Entity) var_ni).Bc = ((cg) var_cg).u;
		((Entity) var_ni).V = false;
	    }
	} else if (i_3_ != 0 || ((Entity) var_ni).nb > 25) {
	    if (i >= 0 || ((cg) var_cg).S == -1) {
		if (i <= 0 || (((cg) var_cg).N ^ 0xffffffff) == 0)
		    ((Entity) var_ni).Bc = ((cg) var_cg).A;
		else
		    ((Entity) var_ni).Bc = ((cg) var_cg).N;
	    } else
		((Entity) var_ni).Bc = ((cg) var_cg).S;
	    ((Entity) var_ni).V = false;
	} else if (!((Entity) var_ni).V
		   || !var_cg.a(((Entity) var_ni).Bc, i_1_ ^ ~0x67b3)) {
	    ((Entity) var_ni).Bc = var_cg.b(i_1_ + 26564);
	    ((Entity) var_ni).V = (((Entity) var_ni).Bc ^ 0xffffffff) != 0;
	}
	if (i_1_ != -26563)
	    a(-85, -26, -7, 112, 36, -23, -103, 104);
    }
    
    static final void a(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			int i_9_, int i_10_, int i_11_) {
	ff.i++;
	int i_12_ = 0;
	int i_13_ = i_5_;
	int i_14_ = 0;
	int i_15_ = i_7_ - i_8_;
	int i_16_ = i_5_ - i_8_;
	int i_17_ = i_7_ * i_7_;
	int i_18_ = i_5_ * i_5_;
	int i_19_ = i_15_ * i_15_;
	int i_20_ = i_16_ * i_16_;
	int i_21_ = i_18_ << 1;
	int i_22_ = i_17_ << 1;
	int i_23_ = i_20_ << 1;
	int i_24_ = i_19_ << 1;
	int i_25_ = i_5_ << 1;
	int i_26_ = i_16_ << 1;
	int i_27_ = i_21_ + (-i_25_ + 1) * i_17_;
	int i_28_ = i_18_ - i_22_ * (i_25_ - 1);
	int i_29_ = i_19_ * (1 - i_26_) + i_23_;
	int i_30_ = i_20_ - i_24_ * (i_26_ - 1);
	int i_31_ = i_17_ << 2;
	int i_32_ = i_18_ << 2;
	int i_33_ = i_19_ << 2;
	int i_34_ = i_20_ << 2;
	int i_35_ = 3 * i_21_;
	if (i_6_ != 6144)
	    a((byte) 84);
	int i_36_ = i_22_ * (i_25_ - 3);
	int i_37_ = 3 * i_23_;
	int i_38_ = (i_26_ - 3) * i_24_;
	int i_39_ = i_32_;
	int i_40_ = (i_5_ - 1) * i_31_;
	int i_41_ = i_34_;
	int i_42_ = (i_16_ - 1) * i_33_;
	if (i >= Class_md.h && Class_db.o >= i) {
	    int[] is = wh.O[i];
	    int i_43_ = sl.a(i_9_ - i_7_, i_6_ ^ 0x17ff, vaa.xb, jga.v);
	    int i_44_ = sl.a(i_9_ + i_7_, 4095, vaa.xb, jga.v);
	    int i_45_ = sl.a(i_9_ - i_15_, 4095, vaa.xb, jga.v);
	    int i_46_ = sl.a(i_15_ + i_9_, i_6_ - 2049, vaa.xb, jga.v);
	    kg.a(i_43_, is, i_10_, i_45_, -104);
	    kg.a(i_45_, is, i_11_, i_46_, i_6_ ^ ~0x187a);
	    kg.a(i_46_, is, i_10_, i_44_, i_6_ ^ ~0x186e);
	}
	while (i_13_ > 0) {
	    boolean bool = i_13_ <= i_16_;
	    if (bool) {
		if (i_29_ < 0) {
		    while (i_29_ < 0) {
			i_30_ += i_41_;
			i_29_ += i_37_;
			i_37_ += i_34_;
			i_41_ += i_34_;
			i_14_++;
		    }
		}
		if (i_30_ < 0) {
		    i_30_ += i_41_;
		    i_29_ += i_37_;
		    i_41_ += i_34_;
		    i_14_++;
		    i_37_ += i_34_;
		}
		i_29_ -= i_42_;
		i_30_ -= i_38_;
		i_38_ -= i_33_;
		i_42_ -= i_33_;
	    }
	    if (i_27_ < 0) {
		while (i_27_ < 0) {
		    i_27_ += i_35_;
		    i_28_ += i_39_;
		    i_12_++;
		    i_35_ += i_32_;
		    i_39_ += i_32_;
		}
	    }
	    if (i_28_ < 0) {
		i_28_ += i_39_;
		i_27_ += i_35_;
		i_35_ += i_32_;
		i_12_++;
		i_39_ += i_32_;
	    }
	    i_28_ -= i_36_;
	    i_27_ -= i_40_;
	    i_36_ -= i_31_;
	    i_13_--;
	    i_40_ -= i_31_;
	    int i_47_ = i - i_13_;
	    int i_48_ = i_13_ + i;
	    if (i_48_ >= Class_md.h && Class_db.o >= i_47_) {
		int i_49_ = sl.a(i_12_ + i_9_, 4095, vaa.xb, jga.v);
		int i_50_ = sl.a(i_9_ - i_12_, 4095, vaa.xb, jga.v);
		if (bool) {
		    int i_51_ = sl.a(i_14_ + i_9_, 4095, vaa.xb, jga.v);
		    int i_52_ = sl.a(i_9_ - i_14_, 4095, vaa.xb, jga.v);
		    if (i_47_ >= Class_md.h) {
			int[] is = wh.O[i_47_];
			kg.a(i_50_, is, i_10_, i_52_, -128);
			kg.a(i_52_, is, i_11_, i_51_, 84);
			kg.a(i_51_, is, i_10_, i_49_, 60);
		    }
		    if (i_48_ <= Class_db.o) {
			int[] is = wh.O[i_48_];
			kg.a(i_50_, is, i_10_, i_52_, -117);
			kg.a(i_52_, is, i_11_, i_51_, i_6_ ^ ~0x187d);
			kg.a(i_51_, is, i_10_, i_49_, -119);
		    }
		} else {
		    if (i_47_ >= Class_md.h)
			kg.a(i_50_, wh.O[i_47_], i_10_, i_49_, -124);
		    if (i_48_ <= Class_db.o)
			kg.a(i_50_, wh.O[i_48_], i_10_, i_49_, -121);
		}
	    }
	}
    }
    
    public static void a(byte i) {
	p = null;
	int i_53_ = 3 % ((i + 4) / 36);
	b = null;
	signlink = null;
    }
    
    final void a(int i, ff var_ff_54_) {
	((ff) this).a = ((ff) var_ff_54_).a;
	((ff) this).f = ((ff) var_ff_54_).f;
	int i_55_ = -71 % ((36 - i) / 42);
	((ff) this).m = ((ff) var_ff_54_).m;
	((ff) this).d = ((ff) var_ff_54_).d;
	((ff) this).j = ((ff) var_ff_54_).j;
	q++;
	((ff) this).e = ((ff) var_ff_54_).e;
    }
    
    final ff a(boolean bool) {
	if (bool != false)
	    return null;
	h++;
	return new ff(((ff) this).j, ((ff) this).a, ((ff) this).f,
		      ((ff) this).d, ((ff) this).m, ((ff) this).e);
    }
    
    ff(int i) {
	((ff) this).a = 128;
	((ff) this).j = i;
    }
    
    private ff(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
	((ff) this).a = 128;
	((ff) this).a = i_56_;
	((ff) this).m = i_59_;
	((ff) this).d = i_58_;
	((ff) this).j = i;
	((ff) this).f = i_57_;
	((ff) this).e = i_60_;
    }
}
