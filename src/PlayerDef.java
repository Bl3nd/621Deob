/* kn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerDef
{
    static int a;
    static int b;
    private int c;
    int d = -1;
    static int e;
    static int f;
    static int g;
    static int h;
    static GameOutPacket i = new GameOutPacket(29, 7);
    private int[] j;
    int[] k;
    static int l;
    private long m;
    private int[][] n;
    static int o;
    static int p;
    boolean isMale;
    static int r;
    static int s;
    private long t;
    
    final void a(int[] is, boolean bool, int i, int i_0_, byte i_1_,
		 int[] is_2_) {
	if (c != i) {
	    n = null;
	    c = i;
	}
	j = is;
	((PlayerDef) this).k = is_2_;
	((PlayerDef) this).isMale = bool;
	((PlayerDef) this).d = i_0_;
	a++;
	a((byte) -122);
	if (i_1_ != 23)
	    ((PlayerDef) this).k = null;
    }
    
    private final void a(byte i) {
	l++;
	m = -1L;
	long[] ls = ml.a;
	m = ls[(int) (((long) (c >> 8) ^ m) & 0xffL)] ^ m >>> 8;
	m = m >>> 8 ^ ls[(int) (((long) c ^ m) & 0xffL)];
	for (int i_3_ = 0; i_3_ < 12; i_3_++) {
	    m = ls[(int) (0xffL & ((long) (j[i_3_] >> 24) ^ m))] ^ m >>> 8;
	    m = m >>> 8 ^ ls[(int) (0xffL & (m ^ (long) (j[i_3_] >> 16)))];
	    m = ls[(int) (((long) (j[i_3_] >> 8) ^ m) & 0xffL)] ^ m >>> 8;
	    m = m >>> 8 ^ ls[(int) (0xffL & ((long) j[i_3_] ^ m))];
	}
	if (i <= -93) {
	    for (int i_4_ = 0; i_4_ < 5; i_4_++)
		m = m >>> 8 ^ ls[(int) (((long) ((PlayerDef) this).k[i_4_] ^ m)
					& 0xffL)];
	    m = m >>> 8 ^ ls[(int) (0xffL
				    & (m ^ (long) (((PlayerDef) this).isMale ? 1 : 0)))];
	}
    }
    
    final void a(int i, int i_5_, int i_6_) {
	((PlayerDef) this).k[i_5_] = i;
	r++;
	a((byte) -108);
	if (i_6_ != 31622)
	    a(29, null, -67, -76, 21, (byte) 126, null, 6, null, -78, 111,
	      null);
    }
    
    public static void a(int i) {
	PlayerDef.i = null;
	if (i != 0)
	    b(-32, 89, -12);
    }
    
    static final wl[] b(int i) {
	h++;
	if (i != 20565)
	    return null;
	return new wl[] { ft.s, GameOutPacket.wl, wd.b };
    }
    
    final da a(int i, hl var_hl, int i_7_, int i_8_, int i_9_, byte i_10_,
	       dr var_dr, int i_11_, Class_r class_r, int i_12_, int i_13_,
	       PlayerUpdateLocation var_cn) {
	e++;
	int i_14_ = i_13_;
	if (var_dr != null) {
	    boolean bool = false;
	    boolean bool_15_ = false;
	    boolean bool_16_ = false;
	    boolean bool_17_ = false;
	    int i_18_ = -1;
	    int i_19_ = -1;
	    Object object = null;
	    i_18_ = ((dr) var_dr).p[i_12_];
	    Object object_20_ = null;
	    i_14_ |= 0x20;
	    int i_21_ = i_18_ >>> 16;
	    i_18_ &= 0xffff;
	    wa var_wa = var_hl.b(i_21_, -108);
	    if (var_wa != null) {
		bool_15_ |= var_wa.a(i_18_, (int) 0);
		bool |= var_wa.a(i_18_, (byte) -57);
		bool_17_ |= var_wa.a((byte) -101, i_18_);
		bool_16_ |= ((dr) var_dr).n;
	    }
	    if ((((dr) var_dr).z || vm.r) && i_8_ != -1
		&& i_8_ < ((dr) var_dr).p.length) {
		i_19_ = ((dr) var_dr).p[i_8_];
		int i_22_ = i_19_ >>> 16;
		i_19_ &= 0xffff;
		wa var_wa_23_;
		if (i_22_ != i_21_)
		    var_wa_23_ = var_hl.b(i_19_ >>> 16, -126);
		else
		    var_wa_23_ = var_wa;
		if (var_wa_23_ != null) {
		    bool_15_ |= var_wa_23_.a(i_19_, (int) 0);
		    bool |= var_wa_23_.a(i_19_, (byte) -99);
		    bool_17_ |= var_wa_23_.a((byte) -101, i_19_);
		}
	    }
	    if (bool_15_)
		i_14_ |= 0x80;
	    if (bool)
		i_14_ |= 0x100;
	    if (bool_16_)
		i_14_ |= 0x200;
	    if (bool_17_)
		i_14_ |= 0x400;
	}
	long l = (long) (i_9_ << 16) | (long) i_11_ << 32 | (long) i;
	da var_da;
	synchronized (Class_ad.k) {
	    var_da = (da) Class_ad.k.get(l, (byte) 100);
	}
	if (var_da == null || class_r.b(var_da.PA(), i_14_) != 0) {
	    if (var_da != null)
		i_14_ = class_r.a(i_14_, var_da.PA());
	    int i_24_ = i_14_;
	    eg[] var_egs = new eg[3];
	    int i_25_ = 0;
	    if (!var_cn.a((byte) 81, i).a((byte) -95)
		|| !var_cn.a((byte) 89, i_9_).a((byte) -69)
		|| !var_cn.a((byte) 42, i_11_).a((byte) -111))
		return null;
	    eg var_eg = var_cn.a((byte) 86, i).b(false);
	    if (var_eg != null)
		var_egs[i_25_++] = var_eg;
	    var_eg = var_cn.a((byte) 94, i_9_).b(false);
	    if (var_eg != null)
		var_egs[i_25_++] = var_eg;
	    var_eg = var_cn.a((byte) 47, i_11_).b(false);
	    if (var_eg != null)
		var_egs[i_25_++] = var_eg;
	    var_eg = new eg(var_egs, i_25_);
	    i_24_ |= 0x4000;
	    var_da = class_r.a(var_eg, i_24_, fba.O, 64, 768);
	    for (int i_26_ = 0; i_26_ < 5; i_26_++) {
		for (int i_27_ = 0; i_27_ < ck.K.length; i_27_++) {
		    if (ck.K[i_27_][i_26_].length > ((PlayerDef) this).k[i_26_])
			var_da.d(lp.p[i_27_][i_26_],
				 ck.K[i_27_][i_26_][((PlayerDef) this).k[i_26_]]);
		}
	    }
	    var_da.SA(i_14_);
	    synchronized (Class_ad.k) {
		Class_ad.k.put(l, var_da, 1);
	    }
	}
	if (var_dr == null)
	    return var_da;
	var_da = var_da.a((byte) 4, i_14_, true);
	if (i_10_ != -42)
	    return null;
	var_da = var_dr.a(i_12_, i_13_, (byte) 93, i_7_, i_8_, var_da);
	return var_da;
    }
    
    final da a(PlayerUpdateLocation var_cn, hl var_hl, int i, ItemDefLoader var_mf, dr var_dr,
	       Class_lb class_lb, an[] var_ans, haa var_haa, int i_28_,
	       int i_29_, dr var_dr_30_, int i_31_, int i_32_, int i_33_,
	       wca var_wca, Class_r class_r, int i_34_, boolean bool,
	       byte i_35_) {
	b++;
	if (((PlayerDef) this).d != -1)
	    return class_lb.getNPCDef(((PlayerDef) this).d, (byte) -103).a(i_31_, i_34_,
							    i_32_, var_wca,
							    i_29_, i_28_,
							    var_dr_30_,
							    i_35_ + 13645,
							    i_33_, var_dr,
							    var_hl, i, var_ans,
							    class_r, var_haa);
	int i_36_ = i;
	long l = m;
	int[] is = j;
	if (var_dr != null && (((dr) var_dr).h >= 0 || ((dr) var_dr).D >= 0)) {
	    is = new int[12];
	    for (int i_37_ = 0; i_37_ < 12; i_37_++)
		is[i_37_] = j[i_37_];
	    if (((dr) var_dr).h >= 0) {
		if (((dr) var_dr).h == 65535) {
		    l ^= ~0xffffffffL;
		    is[5] = 0;
		} else {
		    is[5] = hba.bitwiseArg1ORArg2(1073741824, ((dr) var_dr).h);
		    l ^= (long) is[5] << 32;
		}
	    }
	    if (((dr) var_dr).D >= 0) {
		if (((dr) var_dr).D == 65535) {
		    is[3] = 0;
		    l ^= 0xffffffffL;
		} else {
		    is[3] = hba.bitwiseArg1ORArg2(1073741824, ((dr) var_dr).D);
		    l ^= (long) is[3];
		}
	    }
	}
	boolean bool_38_ = false;
	boolean bool_39_ = false;
	boolean bool_40_ = false;
	boolean bool_41_ = var_dr != null || var_dr_30_ != null;
	int i_42_ = var_ans != null ? var_ans.length : 0;
	for (int i_43_ = 0; i_42_ > i_43_; i_43_++) {
	    ui.g[i_43_] = null;
	    if (var_ans[i_43_] != null) {
		dr var_dr_44_
		    = var_hl.c(i_35_ ^ 0x3d, ((an) var_ans[i_43_]).c);
		if (((dr) var_dr_44_).p != null) {
		    bool_41_ = true;
		    as.x[i_43_] = var_dr_44_;
		    int i_45_ = ((an) var_ans[i_43_]).d;
		    int i_46_ = ((an) var_ans[i_43_]).g;
		    int i_47_ = ((dr) var_dr_44_).p[i_45_];
		    ui.g[i_43_] = var_hl.b(i_47_ >>> 16, 60);
		    i_47_ &= 0xffff;
		    qg.a[i_43_] = i_47_;
		    if (ui.g[i_43_] != null) {
			bool_39_ |= ui.g[i_43_].a(i_47_, (int) 0);
			bool_38_ |= ui.g[i_43_].a(i_47_, (byte) -105);
			bool_40_ |= ui.g[i_43_].a((byte) -101, i_47_);
		    }
		    if ((((dr) var_dr_44_).z || vm.r)
			&& (i_46_ ^ 0xffffffff) != 0
			&& i_46_ < ((dr) var_dr_44_).p.length) {
			hv.r[i_43_] = ((dr) var_dr_44_).B[i_45_];
			ud.s[i_43_] = ((an) var_ans[i_43_]).b;
			int i_48_ = ((dr) var_dr_44_).p[i_46_];
			at.K[i_43_] = var_hl.b(i_48_ >>> 16, 101);
			i_48_ &= 0xffff;
			th.m[i_43_] = i_48_;
			if (at.K[i_43_] != null) {
			    bool_39_ |= at.K[i_43_].a(i_48_, (int) 0);
			    bool_38_ |= at.K[i_43_].a(i_48_, (byte) -100);
			    bool_40_ |= at.K[i_43_].a((byte) -101, i_48_);
			}
		    } else {
			hv.r[i_43_] = 0;
			ud.s[i_43_] = 0;
			at.K[i_43_] = null;
			th.m[i_43_] = -1;
		    }
		}
	    }
	}
	int i_49_ = -1;
	int i_50_ = -1;
	int i_51_ = 0;
	wa var_wa = null;
	wa var_wa_52_ = null;
	int i_53_ = -1;
	int i_54_ = -1;
	int i_55_ = 0;
	wa var_wa_56_ = null;
	if (i_35_ != 125)
	    return null;
	wa var_wa_57_ = null;
	if (bool_41_) {
	    if (var_dr != null) {
		i_49_ = ((dr) var_dr).p[i_31_];
		int i_58_ = i_49_ >>> 16;
		var_wa = var_hl.b(i_58_, i_35_ - 21);
		i_49_ &= 0xffff;
		if (var_wa != null) {
		    bool_39_ |= var_wa.a(i_49_, (int) 0);
		    bool_38_ |= var_wa.a(i_49_, (byte) -35);
		    bool_40_ |= var_wa.a((byte) -101, i_49_);
		}
		if ((((dr) var_dr).z || vm.r) && (i_32_ ^ 0xffffffff) != 0
		    && i_32_ < ((dr) var_dr).p.length) {
		    i_50_ = ((dr) var_dr).p[i_32_];
		    i_51_ = ((dr) var_dr).B[i_31_];
		    int i_59_ = i_50_ >>> 16;
		    i_50_ &= 0xffff;
		    var_wa_52_
			= i_58_ != i_59_ ? var_hl.b(i_59_, -106) : var_wa;
		    if (var_wa_52_ != null) {
			bool_39_ |= var_wa_52_.a(i_50_, (int) 0);
			bool_38_ |= var_wa_52_.a(i_50_, (byte) -82);
			bool_40_ |= var_wa_52_.a((byte) -101, i_50_);
		    }
		}
	    }
	    i_36_ |= 0x20;
	    if (var_dr_30_ != null) {
		i_53_ = ((dr) var_dr_30_).p[i_33_];
		int i_60_ = i_53_ >>> 16;
		var_wa_56_ = var_hl.b(i_60_, 63);
		i_53_ &= 0xffff;
		if (var_wa_56_ != null) {
		    bool_39_ |= var_wa_56_.a(i_53_, (int) 0);
		    bool_38_ |= var_wa_56_.a(i_53_, (byte) -30);
		    bool_40_ |= var_wa_56_.a((byte) -101, i_53_);
		}
		if ((((dr) var_dr_30_).z || vm.r) && i_29_ != -1
		    && i_29_ < ((dr) var_dr_30_).p.length) {
		    i_54_ = ((dr) var_dr_30_).p[i_29_];
		    i_55_ = ((dr) var_dr_30_).B[i_33_];
		    int i_61_ = i_54_ >>> 16;
		    var_wa_57_
			= i_60_ != i_61_ ? var_hl.b(i_61_, -96) : var_wa_56_;
		    i_54_ &= 0xffff;
		    if (var_wa_57_ != null) {
			bool_39_ |= var_wa_57_.a(i_54_, (int) 0);
			bool_38_ |= var_wa_57_.a(i_54_, (byte) -109);
			bool_40_ |= var_wa_57_.a((byte) -101, i_54_);
		    }
		}
	    }
	    if (bool_39_)
		i_36_ |= 0x80;
	    if (bool_38_)
		i_36_ |= 0x100;
	    if (bool_40_)
		i_36_ |= 0x400;
	}
	da var_da;
	synchronized (bd.j) {
	    var_da = (da) bd.j.get(l, (byte) 100);
	}
	cg var_cg = null;
	if (c != -1)
	    var_cg = var_wca.a(c, (byte) 68);
	if (var_da == null || class_r.b(var_da.PA(), i_36_) != 0
	    || var_cg != null && ((cg) var_cg).y != null && n == null) {
	    if (var_da != null)
		i_36_ = class_r.a(i_36_, var_da.PA());
	    int i_62_ = i_36_;
	    boolean bool_63_ = false;
	    for (int i_64_ = 0; i_64_ < 12; i_64_++) {
		int i_65_ = is[i_64_];
		if ((i_65_ & 0x40000000) == 0) {
		    if ((i_65_ & ~0x7fffffff) != 0
			&& !var_cn.a((byte) 52, i_65_ & 0x3fffffff).a(true))
			bool_63_ = true;
		} else if (!var_mf.d(12388, 0x3fffffff & i_65_)
				.b((byte) 85, ((PlayerDef) this).isMale))
		    bool_63_ = true;
	    }
	    if (!bool_63_) {
		eg[] var_egs = new eg[12];
		for (int i_66_ = 0; i_66_ < 12; i_66_++) {
		    int i_67_ = is[i_66_];
		    if ((i_67_ & 0x40000000) == 0) {
			if ((~0x7fffffff & i_67_) != 0) {
			    eg var_eg
				= var_cn.a((byte) 103, 0x3fffffff & i_67_)
				      .a((int) -86);
			    if (var_eg != null)
				var_egs[i_66_] = var_eg;
			}
		    } else {
			eg var_eg = var_mf.d(12388, i_67_ & 0x3fffffff)
					.a(((PlayerDef) this).isMale, (int) -1);
			if (var_eg != null)
			    var_egs[i_66_] = var_eg;
		    }
		}
		if (var_cg != null && ((cg) var_cg).y != null) {
		    for (int i_68_ = 0; i_68_ < ((cg) var_cg).y.length;
			 i_68_++) {
			if (((cg) var_cg).y[i_68_] != null
			    && var_egs[i_68_] != null) {
			    int i_69_ = ((cg) var_cg).y[i_68_][0];
			    int i_70_ = ((cg) var_cg).y[i_68_][1];
			    int i_71_ = ((cg) var_cg).y[i_68_][2];
			    int i_72_ = ((cg) var_cg).y[i_68_][3] << 3;
			    int i_73_ = ((cg) var_cg).y[i_68_][4] << 3;
			    int i_74_ = ((cg) var_cg).y[i_68_][5] << 3;
			    if (n == null)
				n = new int[((cg) var_cg).y.length][];
			    if (n[i_68_] == null) {
				int[] is_75_ = n[i_68_] = new int[15];
				if (i_72_ == 0 && i_73_ == 0 && i_74_ == 0) {
				    is_75_[13] = -i_70_;
				    is_75_[0] = is_75_[4] = is_75_[8] = 32768;
				    is_75_[14] = -i_71_;
				    is_75_[12] = -i_69_;
				} else {
				    int i_76_ = GameInPacket.i[i_72_];
				    int i_77_ = GameInPacket.h[i_72_];
				    int i_78_ = GameInPacket.i[i_73_];
				    int i_79_ = GameInPacket.h[i_73_];
				    int i_80_ = GameInPacket.i[i_74_];
				    int i_81_ = GameInPacket.h[i_74_];
				    int i_82_ = i_77_ * i_80_ + 8192 >> 14;
				    int i_83_ = i_77_ * i_81_ + 8192 >> 14;
				    is_75_[4] = i_80_ * i_76_ + 8192 >> 14;
				    is_75_[1]
					= i_78_ * -i_81_ + (i_79_ * i_82_
							    + 8192) >> 14;
				    is_75_[7]
					= -i_81_ * -i_79_ - (-(i_82_ * i_78_)
							     - 8192) >> 14;
				    is_75_[6] = (i_80_ * -i_79_ + 8192
						 + i_83_ * i_78_) >> 14;
				    is_75_[8] = i_78_ * i_76_ + 8192 >> 14;
				    is_75_[2] = i_76_ * i_79_ + 8192 >> 14;
				    is_75_[5] = -i_77_;
				    is_75_[0]
					= i_80_ * i_78_ - (-(i_83_ * i_79_)
							   - 8192) >> 14;
				    is_75_[3] = i_76_ * i_81_ + 8192 >> 14;
				    is_75_[13] = (-i_71_ * is_75_[7]
						  + is_75_[1] * -i_69_
						  - (-(is_75_[4] * -i_70_)
						     - 8192)) >> 14;
				    is_75_[12] = (-i_71_ * is_75_[6]
						  + (is_75_[3] * -i_70_
						     + (is_75_[0] * -i_69_
							+ 8192))) >> 14;
				    is_75_[14] = (is_75_[8] * -i_71_
						  + (-i_69_ * is_75_[2]
						     + is_75_[5] * -i_70_)
						  + 8192) >> 14;
				}
				is_75_[11] = i_71_;
				is_75_[10] = i_70_;
				is_75_[9] = i_69_;
			    }
			    if (i_72_ != 0 || i_73_ != 0 || i_74_ != 0)
				var_egs[i_68_].b(i_72_, 19068, i_74_, i_73_);
			    if (i_69_ != 0 || i_70_ != 0 || i_71_ != 0)
				var_egs[i_68_].a(i_71_, (byte) 113, i_69_,
						 i_70_);
			}
		    }
		}
		i_62_ |= 0x4000;
		eg var_eg = new eg(var_egs, var_egs.length);
		var_da = class_r.a(var_eg, i_62_, fba.O, 64, 850);
		for (int i_84_ = 0; i_84_ < 5; i_84_++) {
		    for (int i_85_ = 0; ck.K.length > i_85_; i_85_++) {
			if (((PlayerDef) this).k[i_84_] < ck.K[i_85_][i_84_].length)
			    var_da.d(lp.p[i_85_][i_84_],
				     ck.K[i_85_][i_84_][((PlayerDef) this).k[i_84_]]);
		    }
		}
		if (bool) {
		    var_da.SA(i_36_);
		    synchronized (bd.j) {
			bd.j.put(l, var_da, 1);
		    }
		    t = l;
		}
	    } else {
		if (t != -1L) {
		    synchronized (bd.j) {
			var_da = (da) bd.j.get(t, (byte) 100);
		    }
		}
		if (var_da == null || class_r.b(var_da.PA(), i_36_) != 0
		    || var_cg != null && ((cg) var_cg).y != null && n == null)
		    return null;
	    }
	}
	da var_da_86_ = var_da.a((byte) 4, i_36_, true);
	if (!bool_41_)
	    return var_da_86_;
	int i_87_ = 0;
	int i_88_ = 1;
	for (/**/; i_42_ > i_87_; i_87_++) {
	    if (ui.g[i_87_] != null)
		var_da_86_.a((byte) -121, at.K[i_87_], ud.s[i_87_] - 1, 0,
			     qg.a[i_87_], n == null ? null : n[i_87_], i_88_,
			     th.m[i_87_], false, hv.r[i_87_], ui.g[i_87_]);
	    i_88_ <<= 1;
	}
	if (var_wa != null && var_wa_56_ != null)
	    var_da_86_.a(var_wa_52_, i_49_, var_wa_57_, i_28_ - 1, i_50_,
			 var_wa_56_, i_55_, ((dr) var_dr).a, i_34_ - 1, i_51_,
			 false, i_53_, var_wa, i_35_ ^ ~0x3a, i_54_);
	else if (var_wa == null) {
	    if (var_wa_56_ != null)
		var_da_86_.a(false, (byte) -11, var_wa_56_, i_54_, i_53_,
			     var_wa_57_, i_34_ - 1, 0, i_55_);
	} else
	    var_da_86_.a(false, (byte) -11, var_wa, i_50_, i_49_, var_wa_52_,
			 i_28_ - 1, 0, i_51_);
	for (int i_89_ = 0; i_89_ < i_42_; i_89_++) {
	    ui.g[i_89_] = null;
	    at.K[i_89_] = null;
	    as.x[i_89_] = null;
	}
	return var_da_86_;
    }
    
    final da a(int i, int i_90_, haa var_haa, dr var_dr, int i_91_, ItemDefLoader var_mf,
	       int i_92_, hl var_hl, int i_93_, Class_lb class_lb, PlayerUpdateLocation var_cn,
	       Class_r class_r) {
	if (i_92_ != 768)
	    a((byte) -68);
	p++;
	if (((PlayerDef) this).d != -1)
	    return class_lb.getNPCDef(((PlayerDef) this).d, (byte) -125).a(var_haa, i_90_,
							    (byte) 71, var_dr,
							    i_93_, var_hl, i,
							    class_r, i_91_);
	int i_94_ = i_90_;
	if (var_dr != null) {
	    boolean bool = false;
	    boolean bool_95_ = false;
	    boolean bool_96_ = false;
	    boolean bool_97_ = false;
	    int i_98_ = -1;
	    int i_99_ = -1;
	    Object object = null;
	    Object object_100_ = null;
	    i_98_ = ((dr) var_dr).p[i_91_];
	    i_94_ |= 0x20;
	    int i_101_ = i_98_ >>> 16;
	    i_98_ &= 0xffff;
	    wa var_wa = var_hl.b(i_101_, i_92_ - 877);
	    if (var_wa != null) {
		bool_95_ |= var_wa.a(i_98_, (int) 0);
		bool |= var_wa.a(i_98_, (byte) -84);
		bool_97_ |= var_wa.a((byte) -101, i_98_);
		bool_96_ |= ((dr) var_dr).n;
	    }
	    if ((((dr) var_dr).z || vm.r) && (i_93_ ^ 0xffffffff) != 0
		&& ((dr) var_dr).p.length > i_93_) {
		i_99_ = ((dr) var_dr).p[i_93_];
		int i_102_ = i_99_ >>> 16;
		wa var_wa_103_
		    = i_101_ == i_102_ ? var_wa : var_hl.b(i_102_, -128);
		i_99_ &= 0xffff;
		if (var_wa_103_ != null) {
		    bool_95_ |= var_wa_103_.a(i_99_, i_92_ - 768);
		    bool |= var_wa_103_.a(i_99_, (byte) -90);
		    bool_97_ |= var_wa_103_.a((byte) -101, i_99_);
		}
	    }
	    if (bool_95_)
		i_94_ |= 0x80;
	    if (bool)
		i_94_ |= 0x100;
	    if (bool_96_)
		i_94_ |= 0x200;
	    if (bool_97_)
		i_94_ |= 0x400;
	}
	da var_da;
	synchronized (Class_ad.k) {
	    var_da = (da) Class_ad.k.get(m, (byte) 100);
	}
	if (var_da == null || class_r.b(var_da.PA(), i_94_) != 0) {
	    if (var_da != null)
		i_94_ = class_r.a(i_94_, var_da.PA());
	    int i_104_ = i_94_;
	    boolean bool = false;
	    for (int i_105_ = 0; i_105_ < 12; i_105_++) {
		int i_106_ = j[i_105_];
		if ((0x40000000 & i_106_) != 0) {
		    if (!var_mf.d(12388, 0x3fffffff & i_106_).a(((PlayerDef) this).isMale,
								(byte) -118))
			bool = true;
		} else if ((i_106_ & ~0x7fffffff) != 0
			   && !var_cn.a((byte) 28, 0x3fffffff & i_106_)
				   .a((byte) -125))
		    bool = true;
	    }
	    if (bool)
		return null;
	    eg[] var_egs = new eg[12];
	    int i_107_ = 0;
	    for (int i_108_ = 0; i_108_ < 12; i_108_++) {
		int i_109_ = j[i_108_];
		if ((i_109_ & 0x40000000) != 0) {
		    eg var_eg = var_mf.d(12388, i_109_ & 0x3fffffff)
				    .a((byte) -84, ((PlayerDef) this).isMale);
		    if (var_eg != null)
			var_egs[i_107_++] = var_eg;
		} else if ((i_109_ & ~0x7fffffff) != 0) {
		    eg var_eg
			= var_cn.a((byte) 115, i_109_ & 0x3fffffff).b(false);
		    if (var_eg != null)
			var_egs[i_107_++] = var_eg;
		}
	    }
	    i_104_ |= 0x4000;
	    eg var_eg = new eg(var_egs, i_107_);
	    var_da = class_r.a(var_eg, i_104_, fba.O, 64, 768);
	    for (int i_110_ = 0; i_110_ < 5; i_110_++) {
		for (int i_111_ = 0; ck.K.length > i_111_; i_111_++) {
		    if (ck.K[i_111_][i_110_].length > ((PlayerDef) this).k[i_110_])
			var_da.d(lp.p[i_111_][i_110_],
				 ck.K[i_111_][i_110_][((PlayerDef) this).k[i_110_]]);
		}
	    }
	    var_da.SA(i_94_);
	    synchronized (Class_ad.k) {
		Class_ad.k.put(m, var_da, 1);
	    }
	}
	if (var_dr == null)
	    return var_da;
	da var_da_112_ = var_da.a((byte) 4, i_94_, true);
	var_da_112_ = var_dr.a(i_91_, i_90_, (byte) 100, i, i_93_, var_da);
	return var_da_112_;
    }
    
    final void a(int i, int i_113_, ItemDefLoader var_mf, boolean bool) {
	g++;
	if (bool != true)
	    a(-37, -12, null, 63);
	if (i == -1)
	    j[i_113_] = 0;
	else if (var_mf.d(12388, i) != null) {
	    j[i_113_] = hba.bitwiseArg1ORArg2(i, 1073741824);
	    a((byte) -118);
	}
    }
    
    final void a(boolean bool, int i) {
	o++;
	if (i != -23851)
	    c = 11;
	((PlayerDef) this).isMale = bool;
	a((byte) -123);
    }
    
    final void a(int i, int i_114_, PlayerUpdateLocation var_cn, int i_115_) {
	f++;
	int i_116_ = fi.b[i];
	if (var_cn.a((byte) 105, i_114_) != null) {
	    j[i_116_] = hba.bitwiseArg1ORArg2(i_114_, -2147483648);
	    if (i_115_ < -11)
		a((byte) -109);
	}
    }
    
    static final int b(int i, int i_117_, int i_118_) {
	if (i_117_ > i) {
	    int i_119_ = i;
	    i = i_117_;
	    i_117_ = i_119_;
	}
	int i_120_ = -44 / ((25 - i_118_) / 58);
	s++;
	int i_121_;
	for (/**/; i_117_ != 0; i_117_ = i_121_) {
	    i_121_ = i % i_117_;
	    i = i_117_;
	}
	return i;
    }
    
    public PlayerDef() {
	/* empty */
    }
}
