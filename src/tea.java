/* tea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class tea
{
    private int a;
    byte[] b;
    private ln[][] c;
    private int d;
    private int e;
    static int f;
    static byte[] skipHistory = new byte[2048];
    static int h;
    private en i;
    static int j;
    int k;
    static int l;
    static int m;
    private int n;
    static int o;
    static int p;
    static int q;
    static int r;
    private daa s;
    
    final void a(int i) {
	h++;
	if (i != 128)
	    a(true, -112, null, 4);
	c = new ln[e][d];
	for (int i_0_ = 0; d > i_0_; i_0_++) {
	    for (int i_1_ = 0; e > i_1_; i_1_++) {
		c[i_1_][i_0_] = new ln(this.i, this, s, i_1_, i_0_, n,
				       128 * i_1_ + 1, 128 * i_0_ + 1);
		if (((ln) c[i_1_][i_0_]).l == 0)
		    c[i_1_][i_0_] = null;
	    }
	}
    }
    
    final void a(boolean bool, int i, ha var_ha, int i_2_) {
	o++;
	ok var_ok = (ok) var_ha;
	if (bool != false)
	    skipHistory = null;
	i_2_ += ((ok) var_ok).B + 1;
	i += ((ok) var_ok).y + 1;
	int i_3_ = i + i_2_ * ((tea) this).k;
	int i_4_ = 0;
	int i_5_ = ((ok) var_ok).J;
	int i_6_ = ((ok) var_ok).w;
	int i_7_ = ((tea) this).k - i_6_;
	if (i_2_ <= 0) {
	    int i_8_ = -i_2_ + 1;
	    i_5_ -= i_8_;
	    i_4_ += i_6_ * i_8_;
	    i_3_ += i_8_ * ((tea) this).k;
	    i_2_ = 1;
	}
	int i_9_ = 0;
	if (i_5_ + i_2_ >= a) {
	    int i_10_ = -a + 1 + (i_2_ + i_5_);
	    i_5_ -= i_10_;
	}
	if (i <= 0) {
	    int i_11_ = -i + 1;
	    i_9_ += i_11_;
	    i_3_ += i_11_;
	    i_7_ += i_11_;
	    i = 1;
	    i_4_ += i_11_;
	    i_6_ -= i_11_;
	}
	if (i + i_6_ >= ((tea) this).k) {
	    int i_12_ = i + i_6_ + 1 - ((tea) this).k;
	    i_7_ += i_12_;
	    i_9_ += i_12_;
	    i_6_ -= i_12_;
	}
	if (i_6_ > 0 && i_5_ > 0) {
	    lf.a(((ok) var_ok).A, i_4_, i_9_, i_6_, i_3_, (byte) -82, i_5_,
		 i_7_, ((tea) this).b);
	    a(-117, i_6_, i_2_, i_5_, i);
	}
    }
    
    public static void a(boolean bool) {
	skipHistory = null;
	if (bool != false)
	    p = 70;
    }
    
    private final void a(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
	r++;
	if (c != null) {
	    int i_17_ = i_16_ - 1 >> 7;
	    int i_18_ = i_16_ - 1 + i_13_ - 1 >> 7;
	    int i_19_ = i_14_ - 1 >> 7;
	    int i_20_ = i_14_ - 1 - (1 - i_15_) >> 7;
	    for (int i_21_ = i_17_; i_21_ <= i_18_; i_21_++) {
		ln[] var_lns = c[i_21_];
		for (int i_22_ = i_19_; i_20_ >= i_22_; i_22_++) {
		    if (var_lns[i_22_] != null)
			((ln) var_lns[i_22_]).m = true;
		}
	    }
	    if (i >= -87)
		a(-32, null, true);
	}
    }
    
    final boolean a(ha var_ha, byte i, int i_23_, int i_24_) {
	m++;
	ok var_ok = (ok) var_ha;
	i_23_ += ((ok) var_ok).B + 1;
	i_24_ += ((ok) var_ok).y + 1;
	int i_25_ = i_23_ * ((tea) this).k + i_24_;
	if (i != -85)
	    a = -97;
	int i_26_ = ((ok) var_ok).J;
	int i_27_ = ((ok) var_ok).w;
	if (i_23_ <= 0) {
	    int i_28_ = -i_23_ + 1;
	    i_23_ = 1;
	    i_25_ += i_28_ * ((tea) this).k;
	    i_26_ -= i_28_;
	}
	int i_29_ = ((tea) this).k - i_27_;
	if (i_23_ + i_26_ >= a) {
	    int i_30_ = i_26_ + 1 + (i_23_ - a);
	    i_26_ -= i_30_;
	}
	if (i_24_ <= 0) {
	    int i_31_ = -i_24_ + 1;
	    i_24_ = 1;
	    i_29_ += i_31_;
	    i_27_ -= i_31_;
	    i_25_ += i_31_;
	}
	if (((tea) this).k <= i_27_ + i_24_) {
	    int i_32_ = i_27_ + (i_24_ + 1) - ((tea) this).k;
	    i_27_ -= i_32_;
	    i_29_ += i_32_;
	}
	if (i_27_ <= 0 || i_26_ <= 0)
	    return false;
	int i_33_ = 8;
	i_29_ += ((tea) this).k * (i_33_ - 1);
	return ji.a(i_29_, i_26_, ((tea) this).b, i_27_, i_33_, (byte) -69,
		    i_25_);
    }
    
    final void b(ha var_ha, byte i, int i_34_, int i_35_) {
	f++;
	ok var_ok = (ok) var_ha;
	i_34_ += ((ok) var_ok).B + 1;
	i_35_ += ((ok) var_ok).y + 1;
	int i_36_ = i_35_ + ((tea) this).k * i_34_;
	int i_37_ = 0;
	if (i < -48) {
	    int i_38_ = ((ok) var_ok).J;
	    int i_39_ = ((ok) var_ok).w;
	    int i_40_ = ((tea) this).k - i_39_;
	    if (i_34_ <= 0) {
		int i_41_ = -i_34_ + 1;
		i_34_ = 1;
		i_37_ += i_39_ * i_41_;
		i_36_ += i_41_ * ((tea) this).k;
		i_38_ -= i_41_;
	    }
	    int i_42_ = 0;
	    if (a <= i_34_ + i_38_) {
		int i_43_ = i_38_ + i_34_ + 1 - a;
		i_38_ -= i_43_;
	    }
	    if (i_35_ <= 0) {
		int i_44_ = 1 - i_35_;
		i_37_ += i_44_;
		i_35_ = 1;
		i_39_ -= i_44_;
		i_40_ += i_44_;
		i_42_ += i_44_;
		i_36_ += i_44_;
	    }
	    if (((tea) this).k <= i_39_ + i_35_) {
		int i_45_ = i_35_ + 1 + i_39_ - ((tea) this).k;
		i_42_ += i_45_;
		i_40_ += i_45_;
		i_39_ -= i_45_;
	    }
	    if (i_39_ > 0 && i_38_ > 0) {
		on.a(i_39_, i_38_, i_37_, i_40_, i_36_, ((ok) var_ok).A, i_42_,
		     ((tea) this).b, (byte) -113);
		a(-98, i_39_, i_34_, i_38_, i_35_);
	    }
	}
    }
    
    static final void a(int i, byte[] is, boolean bool) {
	if (ak.s == null)
	    ak.s = new BytesParser(20000);
	if (i != 13736)
	    l = -54;
	j++;
	ak.s.writeBytes(65536, is.length, 0, is);
	if (bool) {
	    gba.a(((BytesParser) ak.s).bytes, -2);
	    il.o = new WorldSub[pga.d];
	    int i_46_ = 0;
	    for (int i_47_ = Class_g.B; i_47_ <= hj.g; i_47_++) {
		WorldSub var_iw = Class_kd.a(i_47_, true);
		if (var_iw != null)
		    il.o[i_46_++] = var_iw;
	    }
	    il.r = false;
	    ufa.a = us.a(i ^ 0x35cc);
	    ak.s = null;
	}
    }
    
    tea(en var_en, daa var_daa) {
	i = var_en;
	s = var_daa;
	((tea) this).k
	    = (((Class_i) s).b * ((Class_i) s).k >> ((en) i).ae) + 2;
	a = (((Class_i) s).b * ((Class_i) s).j >> ((en) i).ae) + 2;
	((tea) this).b = new byte[a * ((tea) this).k];
	n = ((en) i).ae + 7 - ((Class_i) s).g;
	e = ((Class_i) s).k >> n;
	d = ((Class_i) s).j >> n;
    }
    
    final void a(boolean bool, int i, int i_48_, int i_49_, boolean[][] bools,
		 boolean bool_50_) {
	this.i.a(false, (int) 68);
	q++;
	this.i.c(false, (byte) -25);
	this.i.a((byte) 28, (int) 1);
	this.i.f(1, 0);
	this.i.a(0, -2, false, bool_50_);
	float f = 1.0F / (float) (128 * ((en) this.i).tf);
	if (bool) {
	    for (int i_51_ = 0; d > i_51_; i_51_++) {
		int i_52_ = i_51_ << n;
		int i_53_ = i_51_ + 1 << n;
		for (int i_54_ = 0; e > i_54_; i_54_++) {
		    if (c[i_54_][i_51_] != null) {
			int i_55_ = i_54_ << n;
			int i_56_ = i_54_ + 1 << n;
		    while_221_:
			for (int i_57_ = i_55_; i_57_ < i_56_; i_57_++) {
			    if (i_57_ - i_48_ >= -i && i >= i_57_ - i_48_) {
				for (int i_58_ = i_52_; i_53_ > i_58_;
				     i_58_++) {
				    if (i_58_ - i_49_ >= -i
					&& i_58_ - i_49_ <= i
					&& (bools[i_57_ - i_48_ + i]
					    [i_58_ + i - i_49_])) {
					mga var_mga = this.i.E(108);
					var_mga.b(f, 18543, f, 1.0F);
					var_mga.U(-i_54_, -i_51_, 0);
					this.i.a(126, at.I);
					c[i_54_][i_51_].a(-102);
					break while_221_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_59_ = 0; i_59_ < d; i_59_++) {
		int i_60_ = i_59_ << n;
		int i_61_ = i_59_ + 1 << n;
		for (int i_62_ = 0; i_62_ < e; i_62_++) {
		    ln var_ln = c[i_62_][i_59_];
		    if (var_ln != null) {
			hh var_hh = this.i.c((int) -115, 3 * ((ln) var_ln).l);
			Buffer buffer = var_hh.a((byte) -88, true);
			if (buffer != null) {
			    Stream stream = this.i.a(buffer, 119);
			    int i_63_ = 0;
			    int i_64_ = i_62_ << n;
			    int i_65_ = i_62_ + 1 << n;
			    for (int i_66_ = i_60_; i_66_ < i_61_; i_66_++) {
				if (-i <= i_66_ - i_49_
				    && i_66_ - i_49_ <= i) {
				    int i_67_
					= i_64_ + i_66_ * ((Class_i) s).k;
				    for (int i_68_ = i_64_; i_65_ > i_68_;
					 i_68_++) {
					if (i_68_ - i_48_ >= -i
					    && i_68_ - i_48_ <= i
					    && (bools[i_68_ + i - i_48_]
						[i_66_ + i - i_49_])) {
					    short[] is = ((daa) s).O[i_67_];
					    if (is != null) {
						if (!Stream.a()) {
						    for (int i_69_ = 0;
							 i_69_ < is.length;
							 i_69_++) {
							i_63_++;
							stream.e(is[i_69_]
								 & 0xffff);
						    }
						} else {
						    for (int i_70_ = 0;
							 i_70_ < is.length;
							 i_70_++) {
							stream.c(is[i_70_]
								 & 0xffff);
							i_63_++;
						    }
						}
					    }
					}
					i_67_++;
				    }
				}
			    }
			    stream.c();
			    if (var_hh.b((byte) 46) && i_63_ > 0) {
				mga var_mga = this.i.E(94);
				var_mga.b(f, 18543, f, 1.0F);
				var_mga.U(-i_62_, -i_59_, 0);
				this.i.a(106, at.I);
				var_ln.a(86, i_63_ / 3, var_hh);
			    }
			}
		    }
		}
	    }
	}
	this.i.j((byte) -70);
    }
}
