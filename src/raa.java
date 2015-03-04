/* raa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class raa
{
    private int a;
    private int b;
    private int c;
    private int d;
    private static f e;
    private boolean f;
    int g;
    private static da h;
    private int i;
    private int j;
    private f k;
    private int l;
    private int m;
    private static int[] n = new int[4];
    private int o;
    private static f p;
    private int q;
    private int r;
    
    final void a(Class_r class_r, int i, int i_0_, int i_1_, int i_2_,
		 int i_3_, int i_4_) {
	if (k != null) {
	    int i_5_ = c - i_3_ & 0x3fff;
	    int i_6_ = o - i_4_ & 0x3fff;
	    if (i_6_ > 8192)
		i_6_ -= 16384;
	    if (i_5_ > 8192)
		i_5_ -= 16384;
	    int i_7_ = i_5_ * i_2_ / 4096 + (i_2_ - a) / 2;
	    int i_8_ = i_6_ * i_2_ / -4096 + (i_1_ - a) / 2;
	    if (i_7_ < i_2_ && i_7_ + a > 0 && i_8_ < i_1_ && i_8_ + a > 0)
		k.a(i_8_ + i, i_7_ + i_0_, a, a);
	}
    }
    
    private static final void a(Class_r class_r) {
	if (e == null) {
	    int[] is = new int[16384];
	    int[] is_9_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_10_ = 64 - i;
		i_10_ *= i_10_;
		int i_11_ = 128 - i - 1;
		int i_12_ = i * 128;
		int i_13_ = i_11_ * 128;
		for (int i_14_ = 0; i_14_ < 64; i_14_++) {
		    int i_15_ = 64 - i_14_;
		    i_15_ *= i_15_;
		    int i_16_ = 128 - i_14_ - 1;
		    int i_17_ = 256 - (i_15_ + i_10_ << 8) / 4096;
		    i_17_ = i_17_ * 16 * 192 / 1536;
		    if (i_17_ < 0)
			i_17_ = 0;
		    else if (i_17_ > 255)
			i_17_ = 255;
		    int i_18_ = i_17_ / 2;
		    is_9_[i_12_ + i_14_] = is_9_[i_12_ + i_16_]
			= is_9_[i_13_ + i_14_] = is_9_[i_13_ + i_16_]
			= ~0xffffff | i_17_ << 16;
		    is[i_12_ + i_14_] = is[i_12_ + i_16_]
			= is[i_13_ + i_14_] = is[i_13_ + i_16_]
			= 127 - i_18_ << 24 | 0xffffff;
		}
	    }
	    e = class_r.a(is_9_, 0, 128, 128, 128);
	    p = class_r.a(is, 0, 128, 128, 128);
	}
    }
    
    private static final void b(Class_r class_r) {
	if (h == null) {
	    eg var_eg = new eg(580, 1104, 1);
	    var_eg.a((short) 1024, (byte) 0, (short) 1024, (short) 0,
		     (short) 32767, 0, (byte) 0, (short) 0, (short) 1024,
		     (byte) 0);
	    var_eg.a(0, (int) 0, 128, -21519);
	    var_eg.a(0, (int) 0, -128, -21519);
	    for (int i = 0; i <= 24; i++) {
		int i_19_ = i * 8192 / 24;
		int i_20_ = GameInPacket.ints1[i_19_];
		int i_21_ = GameInPacket.ints2[i_19_];
		for (int i_22_ = 1; i_22_ < 24; i_22_++) {
		    int i_23_ = i_22_ * 8192 / 24;
		    int i_24_ = GameInPacket.ints2[i_23_] >> 7;
		    int i_25_ = GameInPacket.ints1[i_23_] * i_20_ >> 21;
		    int i_26_ = GameInPacket.ints1[i_23_] * i_21_ >> 21;
		    var_eg.a(i_26_, -i_25_, i_24_, -21519);
		}
		if (i > 0) {
		    int i_27_ = i * 23 + 2;
		    int i_28_ = i_27_ - 23;
		    var_eg.a(i_27_, (short) 127, (byte) 0, (byte) 0, i_28_, 0,
			     (short) 0, 0, (byte) 0);
		    for (int i_29_ = 1; i_29_ < 23; i_29_++) {
			int i_30_ = i_28_ + 1;
			int i_31_ = i_27_ + 1;
			var_eg.a(i_27_, (short) 127, (byte) 0, (byte) 0, i_30_,
				 0, (short) 0, i_28_, (byte) 0);
			var_eg.a(i_27_, (short) 127, (byte) 0, (byte) 0, i_31_,
				 0, (short) 0, i_30_, (byte) 0);
			i_28_ = i_30_;
			i_27_ = i_31_;
		    }
		    var_eg.a(1, (short) 127, (byte) 0, (byte) 0, i_28_, 0,
			     (short) 0, i_27_, (byte) 0);
		}
	    }
	    ((eg) var_eg).l = ((eg) var_eg).z;
	    ((eg) var_eg).s = null;
	    ((eg) var_eg).Q = null;
	    ((eg) var_eg).w = null;
	    h = class_r.a(var_eg, 51200, 33, 64, 768);
	}
    }
    
    private final boolean a(Class_r class_r, raa var_raa_32_) {
	if (k == null) {
	    if (d == 0) {
		if (cj.e.a(false, m)) {
		    int[] is = cj.e.a(0.7F, r, (byte) 85, false, r, m);
		    k = class_r.a(is, 0, r, r, r);
		}
	    } else if (d == 2)
		c(class_r, var_raa_32_);
	    else if (d == 1)
		d(class_r, var_raa_32_);
	}
	if (k == null)
	    return false;
	return true;
    }
    
    static final void a() {
	h = null;
	e = null;
    }
    
    final boolean b(Class_r class_r, raa var_raa_33_) {
	if (k == null && !a(class_r, var_raa_33_))
	    return false;
	return true;
    }
    
    private final void c(Class_r class_r, raa var_raa_34_) {
	eg var_eg = efa.a(m, SpecialOutPacket.c, 0, false);
	if (var_eg != null) {
	    class_r.oa(n);
	    class_r.da(0, 0, r, r);
	    class_r.J(0, 0, r, r, 0, 0);
	    int i = 0;
	    int i_35_ = 0;
	    int i_36_ = 256;
	    if (var_raa_34_ != null) {
		if (var_raa_34_.f) {
		    i = -var_raa_34_.i;
		    i_35_ = -var_raa_34_.b;
		    i_36_ = -var_raa_34_.q;
		} else {
		    i = this.i - var_raa_34_.i;
		    i_35_ = b - var_raa_34_.b;
		    i_36_ = q - var_raa_34_.q;
		}
	    }
	    if (c != 0) {
		int i_37_ = -c & 0x3fff;
		int i_38_ = GameInPacket.ints1[i_37_];
		int i_39_ = GameInPacket.ints2[i_37_];
		int i_40_ = i_35_ * i_39_ - i_36_ * i_38_ >> 14;
		i_36_ = i_35_ * i_38_ + i_36_ * i_39_ >> 14;
		i_35_ = i_40_;
	    }
	    if (o != 0) {
		int i_41_ = -o & 0x3fff;
		int i_42_ = GameInPacket.ints1[i_41_];
		int i_43_ = GameInPacket.ints2[i_41_];
		int i_44_ = i_36_ * i_42_ + i * i_43_ >> 14;
		i_36_ = i_36_ * i_43_ - i * i_42_ >> 14;
		i = i_44_;
	    }
	    class_r.ra(1.0F);
	    class_r.VA(16777215, 1.0F, 1.0F, (float) i, (float) i_35_,
		       (float) i_36_);
	    da var_da = class_r.a(var_eg, 2048, 0, 64, 768);
	    int i_45_ = var_da.l() - var_da.KA();
	    int i_46_ = var_da.H() - var_da.J();
	    int i_47_ = var_da.KA() + i_45_ / 2;
	    int i_48_ = var_da.J() + i_46_ / 2;
	    int i_49_ = i_45_ > i_46_ ? i_45_ : i_46_;
	    class_r.la(i_47_, i_48_, i_49_, i_49_);
	    class_r.a(class_r.C());
	    Class_q class_q = class_r.p();
	    class_q.NA(0, 0, class_r.BA() - var_da.OA());
	    var_da.a(class_q, null, class_r.BA(), 1);
	    k = class_r.a(0, 0, r, r, true);
	    k.xa(0, 0, 3);
	    class_r.da(n[0], n[1], n[2], n[3]);
	}
    }
    
    public static void b() {
	h = null;
	p = null;
	e = null;
	n = null;
    }
    
    final boolean a(int i, int i_50_, int i_51_, int i_52_) {
	int i_53_;
	int i_54_;
	int i_55_;
	if (!f) {
	    i_53_ = this.i - i;
	    i_54_ = b - i_50_;
	    i_55_ = q - i_51_;
	    ((raa) this).g
		= (int) Math.sqrt((double) (i_53_ * i_53_ + i_54_ * i_54_
					    + i_55_ * i_55_));
	    if (((raa) this).g == 0)
		((raa) this).g = 1;
	    i_53_ = (i_53_ << 8) / ((raa) this).g;
	    i_54_ = (i_54_ << 8) / ((raa) this).g;
	    i_55_ = (i_55_ << 8) / ((raa) this).g;
	} else {
	    ((raa) this).g = 1073741823;
	    i_53_ = this.i;
	    i_54_ = b;
	    i_55_ = q;
	}
	int i_56_ = (int) (Math.sqrt((double) (i_53_ * i_53_ + i_54_ * i_54_
					       + i_55_ * i_55_))
			   * 256.0);
	if (i_56_ > 128) {
	    i_53_ = (i_53_ << 16) / i_56_;
	    i_54_ = (i_54_ << 16) / i_56_;
	    i_55_ = (i_55_ << 16) / i_56_;
	    a = j * i_52_ / (f ? 1024 : ((raa) this).g);
	} else
	    a = 0;
	if (a < 8) {
	    k = null;
	    return false;
	}
	int i_57_ = dfa.a(a, 128);
	if (i_57_ > i_52_)
	    i_57_ = ko.a((byte) 114, i_52_);
	if (i_57_ > 512)
	    i_57_ = 512;
	if (i_57_ != r)
	    r = i_57_;
	c = (int) (Math.asin((double) ((float) i_54_ / 256.0F))
		   * 2607.5945876176133) & 0x3fff;
	o = (int) (Math.atan2((double) i_53_, (double) -i_55_)
		   * 2607.5945876176133) & 0x3fff;
	k = null;
	return true;
    }
    
    private final void d(Class_r class_r, raa var_raa_58_) {
	b(class_r);
	a(class_r);
	class_r.oa(n);
	class_r.da(0, 0, r, r);
	class_r.ya();
	class_r.J(0, 0, r, r, ~0xffffff | l, 0);
	int i = 0;
	int i_59_ = 0;
	int i_60_ = 256;
	if (var_raa_58_ != null) {
	    if (var_raa_58_.f) {
		i = -var_raa_58_.i;
		i_59_ = -var_raa_58_.b;
		i_60_ = -var_raa_58_.q;
	    } else {
		i = var_raa_58_.i - this.i;
		i_59_ = var_raa_58_.b - b;
		i_60_ = var_raa_58_.q - q;
	    }
	}
	if (c != 0) {
	    int i_61_ = GameInPacket.ints1[c];
	    int i_62_ = GameInPacket.ints2[c];
	    int i_63_ = i_59_ * i_62_ - i_60_ * i_61_ >> 14;
	    i_60_ = i_59_ * i_61_ + i_60_ * i_62_ >> 14;
	    i_59_ = i_63_;
	}
	if (o != 0) {
	    int i_64_ = GameInPacket.ints1[o];
	    int i_65_ = GameInPacket.ints2[o];
	    int i_66_ = i_60_ * i_64_ + i * i_65_ >> 14;
	    i_60_ = i_60_ * i_65_ - i * i_64_ >> 14;
	    i = i_66_;
	}
	da var_da = h.a((byte) 0, 51200, true);
	if (!class_r.g()) {
	    var_da.d((short) 127, ((vca) cj.e.a(m, (byte) 86)).v);
	    var_da.DA((short) 0, (short) -1);
	} else
	    var_da.DA((short) 0, (short) m);
	class_r.ra(1.0F);
	class_r.VA(16777215, 1.0F, 1.0F, (float) i, (float) i_59_,
		   (float) i_60_);
	int i_67_ = 1024 * r / (var_da.l() - var_da.KA());
	if (l != 0)
	    i_67_ = i_67_ * 13 / 16;
	class_r.la(r / 2, r / 2, i_67_, i_67_);
	class_r.a(class_r.C());
	Class_q class_q = class_r.C();
	class_q.NA(0, 0, class_r.BA() - var_da.OA());
	var_da.a(class_q, null, 1024, 1);
	int i_68_ = r * 13 / 16;
	int i_69_ = (r - i_68_) / 2;
	p.a(i_69_, i_69_, i_68_, i_68_, 0, ~0xffffff | l, 1);
	k = class_r.a(0, 0, r, r, true);
	class_r.ya();
	class_r.J(0, 0, r, r, 0, 0);
	e.a(0, 0, r, r, 1, 0, 0);
	k.xa(0, 0, 0);
	class_r.da(n[0], n[1], n[2], n[3]);
    }
    
    final void c() {
	k = null;
    }
    
    raa(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_,
	int i_75_, boolean bool) {
	this.i = i_71_;
	b = i_72_;
	q = i_73_;
	f = bool;
	m = i_70_;
	l = i_75_;
	j = i_74_;
	d = i;
    }
}
