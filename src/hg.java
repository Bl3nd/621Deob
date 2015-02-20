/* hg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hg extends Node
{
    static int k;
    static int l;
    static byte[] moveTypePerPlayer = new byte[2048];
    int[] amounts = new int[1];
    int[] itemIDs = { -1 };
    static int p = 0;
    static int q;
    
    static final void a(boolean bool) {
	q++;
	int i = pca.D * 512 + 256;
	int i_0_ = 512 * uc.d + 256;
	int i_1_ = Class_u.b(i, vo.clientHeight, -20214, i_0_) - ru.v;
	if (bool != true)
	    a(-53);
	if (vs.D >= 100) {
	    ada.N = 512 * uc.d + 256;
	    dg.gb = 512 * pca.D + 256;
	    us.e = Class_u.b(dg.gb, vo.clientHeight, -20214, ada.N) - ru.v;
	} else {
	    if (i > dg.gb) {
		dg.gb += Class_md.i + (i - dg.gb) * vs.D / 1000;
		if (dg.gb > i)
		    dg.gb = i;
	    }
	    if (us.e < i_1_) {
		us.e += Class_md.i + vs.D * (i_1_ - us.e) / 1000;
		if (i_1_ < us.e)
		    us.e = i_1_;
	    }
	    if (dg.gb > i) {
		dg.gb -= Class_md.i + vs.D * (dg.gb - i) / 1000;
		if (i > dg.gb)
		    dg.gb = i;
	    }
	    if (us.e > i_1_) {
		us.e -= Class_md.i + (us.e - i_1_) * vs.D / 1000;
		if (us.e < i_1_)
		    us.e = i_1_;
	    }
	    if (ada.N < i_0_) {
		ada.N += Class_md.i + (i_0_ - ada.N) * vs.D / 1000;
		if (i_0_ < ada.N)
		    ada.N = i_0_;
	    }
	    if (ada.N > i_0_) {
		ada.N -= (ada.N - i_0_) * vs.D / 1000 + Class_md.i;
		if (i_0_ > ada.N)
		    ada.N = i_0_;
	    }
	}
	i_0_ = 512 * ItemDefLoader.d + 256;
	i = ko.c * 512 + 256;
	i_1_ = Class_u.b(i, vo.clientHeight, -20214, i_0_) - pm.s;
	int i_2_ = i - dg.gb;
	int i_3_ = i_1_ - us.e;
	int i_4_ = i_0_ - ada.N;
	int i_5_ = (int) Math.sqrt((double) (i_4_ * i_4_ + i_2_ * i_2_));
	int i_6_ = ((int) (2607.5945876176133
			   * Math.atan2((double) i_3_, (double) i_5_))
		    & 0x3fff);
	int i_7_ = ((int) (Math.atan2((double) i_2_, (double) i_4_)
			   * -2607.5945876176133)
		    & 0x3fff);
	if (i_6_ < 1024)
	    i_6_ = 1024;
	if (i_6_ > 3072)
	    i_6_ = 3072;
	if (mba.e < i_6_) {
	    mba.e += hp.z + (i_6_ - mba.e >> 3) * li.z / 1000 << 3;
	    if (i_6_ < mba.e)
		mba.e = i_6_;
	}
	if (i_6_ < mba.e) {
	    mba.e -= (mba.e - i_6_ >> 3) * li.z / 1000 + hp.z << 3;
	    if (mba.e < i_6_)
		mba.e = i_6_;
	}
	int i_8_ = i_7_ - gn.G;
	if (i_8_ > 8192)
	    i_8_ -= 16384;
	if (i_8_ < -8192)
	    i_8_ += 16384;
	i_8_ >>= 3;
	if (i_8_ > 0) {
	    gn.G += i_8_ * li.z / 1000 + hp.z << 3;
	    gn.G &= 0x3fff;
	}
	if (i_8_ < 0) {
	    gn.G -= hp.z + li.z * -i_8_ / 1000 << 3;
	    gn.G &= 0x3fff;
	}
	int i_9_ = i_7_ - gn.G;
	if (i_9_ > 8192)
	    i_9_ -= 16384;
	if (i_9_ < -8192)
	    i_9_ += 16384;
	GPIPlayer.e = 0;
	if (i_9_ < 0 && i_8_ > 0 || i_9_ > 0 && i_8_ < 0)
	    gn.G = i_7_;
    }
    
    public static void a(int i) {
	moveTypePerPlayer = null;
	if (i > -51)
	    a(true);
    }
    
    final da a(int i, int i_10_, int i_11_, int i_12_, boolean bool,
	       Class_r class_r, PlayerDef var_kn, int i_13_, int i_14_, dr var_dr) {
	k++;
	da var_da = null;
	int i_15_ = i_11_;
	cg var_cg = null;
	if (i_14_ != i)
	    var_cg = hs.f.a(i_14_, (byte) 126);
	int[] is = ((hg) this).itemIDs;
	if (var_cg != null && ((cg) var_cg).s != null) {
	    is = new int[((cg) var_cg).s.length];
	    for (int i_16_ = 0; i_16_ < ((cg) var_cg).s.length; i_16_++) {
		int i_17_ = ((cg) var_cg).s[i_16_];
		if (i_17_ < 0 || i_17_ >= ((hg) this).itemIDs.length)
		    is[i_16_] = -1;
		else
		    is[i_16_] = ((hg) this).itemIDs[i_17_];
	    }
	}
	boolean bool_18_ = false;
	boolean bool_19_ = false;
	boolean bool_20_ = false;
	boolean bool_21_ = false;
	int i_22_ = -1;
	int i_23_ = -1;
	int i_24_ = 0;
	wa var_wa = null;
	wa var_wa_25_ = null;
	if (var_dr != null) {
	    i_15_ |= 0x20;
	    i_22_ = ((dr) var_dr).p[i_13_];
	    int i_26_ = i_22_ >>> 16;
	    i_22_ &= 0xffff;
	    var_wa = Class_ef.J.b(i_26_, 61);
	    if (var_wa != null) {
		bool_19_ |= var_wa.a(i_22_, i ^ 0xffffffff);
		bool_18_ |= var_wa.a(i_22_, (byte) -35);
		bool_21_ |= var_wa.a((byte) -101, i_22_);
		bool_20_ |= ((dr) var_dr).n;
	    }
	    if ((((dr) var_dr).z || vm.r) && i_10_ != -1
		&& i_10_ < ((dr) var_dr).p.length) {
		i_23_ = ((dr) var_dr).p[i_10_];
		i_24_ = ((dr) var_dr).B[i_13_];
		int i_27_ = i_23_ >>> 16;
		i_23_ &= 0xffff;
		if (i_27_ == i_26_)
		    var_wa_25_ = var_wa;
		else
		    var_wa_25_ = Class_ef.J.b(i_23_ >>> 16, i ^ ~0x36);
		if (var_wa_25_ != null) {
		    bool_19_ |= var_wa_25_.a(i_23_, (int) 0);
		    bool_18_ |= var_wa_25_.a(i_23_, (byte) -50);
		    bool_21_ |= var_wa_25_.a((byte) -101, i_23_);
		}
	    }
	    if (bool_19_)
		i_15_ |= 0x80;
	    if (bool_18_)
		i_15_ |= 0x100;
	    if (bool_20_)
		i_15_ |= 0x200;
	    if (bool_21_)
		i_15_ |= 0x400;
	}
	long l = a(i_14_, bool, is, (byte) -4,
		   var_kn == null ? null : ((PlayerDef) var_kn).k);
	if (bl.v != null)
	    var_da = (da) bl.v.get(l, (byte) 100);
	if (var_da == null || class_r.b(var_da.PA(), i_15_) != 0) {
	    if (var_da != null)
		i_15_ = class_r.a(i_15_, var_da.PA());
	    int i_28_ = i_15_;
	    boolean bool_29_ = false;
	    for (int i_30_ = 0; i_30_ < is.length; i_30_++) {
		if ((is[i_30_] ^ 0xffffffff) != 0
		    && !laa.itemDefLoader.d(12388, is[i_30_]).b((byte) 89, bool))
		    bool_29_ = true;
	    }
	    if (bool_29_)
		return null;
	    eg[] var_egs = new eg[is.length];
	    for (int i_31_ = 0; is.length > i_31_; i_31_++) {
		if ((is[i_31_] ^ 0xffffffff) != 0)
		    var_egs[i_31_] = laa.itemDefLoader.d(12388, is[i_31_]).a(bool, i);
	    }
	    if (var_cg != null && ((cg) var_cg).y != null) {
		for (int i_32_ = 0; i_32_ < ((cg) var_cg).y.length; i_32_++) {
		    if (((cg) var_cg).y[i_32_] != null
			&& var_egs[i_32_] != null) {
			int i_33_ = ((cg) var_cg).y[i_32_][0];
			int i_34_ = ((cg) var_cg).y[i_32_][1];
			int i_35_ = ((cg) var_cg).y[i_32_][2];
			int i_36_ = ((cg) var_cg).y[i_32_][3];
			int i_37_ = ((cg) var_cg).y[i_32_][4];
			int i_38_ = ((cg) var_cg).y[i_32_][5];
			if (i_36_ != 0 || i_37_ != 0 || i_38_ != 0)
			    var_egs[i_32_].b(i_36_, 19068, i_38_, i_37_);
			if (i_33_ != 0 || i_34_ != 0 || i_35_ != 0)
			    var_egs[i_32_].a(i_35_, (byte) 101, i_33_, i_34_);
		    }
		}
	    }
	    eg var_eg = new eg(var_egs, var_egs.length);
	    if (var_kn != null)
		i_28_ |= 0x4000;
	    var_da = class_r.a(var_eg, i_28_, kr.f, 64, 850);
	    if (var_kn != null) {
		for (int i_39_ = 0; i_39_ < 5; i_39_++) {
		    for (int i_40_ = 0; i_40_ < ck.K.length; i_40_++) {
			if (((PlayerDef) var_kn).k[i_39_] < ck.K[i_40_][i_39_].length)
			    var_da.d(lp.p[i_40_][i_39_],
				     (ck.K[i_40_][i_39_]
				      [((PlayerDef) var_kn).k[i_39_]]));
		    }
		}
	    }
	    if (bl.v != null) {
		var_da.SA(i_15_);
		bl.v.put(l, var_da, 1);
	    }
	}
	if (var_dr == null || var_wa == null)
	    return var_da;
	da var_da_41_ = var_da.a((byte) 1, i_15_, true);
	var_da_41_.a(((dr) var_dr).n, (byte) -11, var_wa, i_23_, i_22_,
		     var_wa_25_, i_12_ - 1, 0, i_24_);
	return var_da_41_;
    }
    
    private final long a(int i, boolean bool, int[] is, byte i_42_,
			 int[] is_43_) {
	hg.l++;
	long[] ls = ml.a;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) i))];
	for (int i_44_ = 0; is.length > i_44_; i_44_++) {
	    l = l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) (is[i_44_] >> 24)))];
	    l = ls[(int) (0xffL & (l ^ (long) (is[i_44_] >> 16)))] ^ l >>> 8;
	    l = ls[(int) (0xffL & ((long) (is[i_44_] >> 8) ^ l))] ^ l >>> 8;
	    l = ls[(int) (((long) is[i_44_] ^ l) & 0xffL)] ^ l >>> 8;
	}
	if (i_42_ != -4)
	    a(-79, -117, -20, -23, true, null, null, 61, -115, null);
	if (is_43_ != null) {
	    for (int i_45_ = 0; i_45_ < 5; i_45_++)
		l = ls[(int) (0xffL & ((long) is_43_[i_45_] ^ l))] ^ l >>> 8;
	}
	l = l >>> 8 ^ ls[(int) (((long) (bool ? 1 : 0) ^ l) & 0xffL)];
	return l;
    }
    
    public hg() {
	/* empty */
    }
}
