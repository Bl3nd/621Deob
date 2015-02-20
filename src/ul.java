/* ul - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ul extends Node
{
    static ek k;
    static int l;
    static int m;
    int n;
    byte[] o;
    static int p;
    private int[] q;
    static int r = 0;
    static sh s;
    static boolean t;
    short[] u;
    static int[] v;
    static int w;
    byte[] x;
    oaa[] y;
    static int z;
    static int[] A = new int[5];
    byte[] B;
    mu[] C;
    
    public static void a(int i) {
	if (i != -1335466206)
	    k = null;
	v = null;
	k = null;
	A = null;
	s = null;
    }
    
    static final void a(byte i, byte[][] is, gl var_gl) {
	m++;
	int[] is_0_ = { -1, 0, 0, 0, 0 };
	for (int i_1_ = 0; i_1_ < ((cd) var_gl).s; i_1_++) {
	    naa.d((byte) 76);
	    for (int i_2_ = 0; i_2_ < Class_hc.e >> 3; i_2_++) {
		for (int i_3_ = 0; i_3_ < bw.v >> 3; i_3_++) {
		    int i_4_ = cl.s[i_1_][i_2_][i_3_];
		    if ((i_4_ ^ 0xffffffff) != 0) {
			int i_5_ = i_4_ >> 24 & 0x3;
			if (!((cd) var_gl).b || i_5_ == 0) {
			    int i_6_ = 0x3 & i_4_ >> 1;
			    int i_7_ = 0x3ff & i_4_ >> 14;
			    int i_8_ = (0x3ff9 & i_4_) >> 3;
			    int i_9_ = (i_7_ / 8 << 8) + i_8_ / 8;
			    for (int i_10_ = 0; iu.o.length > i_10_; i_10_++) {
				if (i_9_ == iu.o[i_10_] && is[i_10_] != null) {
				    BytesParser var_es = new BytesParser(is[i_10_]);
				    var_gl.a(i_1_, su.a, var_es, i_6_, i_5_,
					     i_7_, 8 * i_3_, i_2_ * 8, true,
					     i_8_);
				    var_gl.a(((is_0_[0] ^ 0xffffffff) == 0
					      ? is_0_ : null),
					     lg.r, i_8_, true, i_6_, i_2_ * 8,
					     i_7_, i_3_ * 8, i_5_, i_1_,
					     var_es);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	if ((is_0_[0] ^ 0xffffffff) != 0) {
	    Connection.tw
		= hi.u.a(ps.a, is_0_[1], is_0_[2], is_0_[3], -29532, is_0_[0]);
	    fr.A = is_0_[4];
	}
	if (i < 23)
	    A = null;
    }
    
    final boolean a(int[] is, pj var_pj, byte[] is_11_, int i) {
	w++;
	boolean bool = true;
	int i_12_ = 0;
	oaa var_oaa = null;
	if (i != 5150)
	    r = 96;
	for (int i_13_ = 0; i_13_ < 128; i_13_++) {
	    if (is_11_ == null || is_11_[i_13_] != 0) {
		int i_14_ = q[i_13_];
		if (i_14_ != 0) {
		    if (i_14_ != i_12_) {
			i_12_ = i_14_;
			if ((--i_14_ & 0x1) != 0)
			    var_oaa = var_pj.a(i_14_ >> 2, is, (byte) -100);
			else
			    var_oaa = var_pj.a(i_14_ >> 2, 1, is);
			if (var_oaa == null)
			    bool = false;
		    }
		    if (var_oaa != null) {
			((ul) this).y[i_13_] = var_oaa;
			q[i_13_] = 0;
		    }
		}
	    }
	}
	return bool;
    }
    
    final void b(int i) {
	q = null;
	if (i >= 53)
	    p++;
    }
    
    public ul() {
	/* empty */
    }
    
    ul(byte[] is) {
	((ul) this).y = new oaa[128];
	((ul) this).o = new byte[128];
	((ul) this).x = new byte[128];
	((ul) this).C = new mu[128];
	q = new int[128];
	((ul) this).B = new byte[128];
	((ul) this).u = new short[128];
	BytesParser var_es = new BytesParser(is);
	int i;
	for (i = 0; ((BytesParser) var_es).bytes[i + ((BytesParser) var_es).pos] != 0; i++) {
	    /* empty */
	}
	byte[] is_15_ = new byte[i];
	for (int i_16_ = 0; i > i_16_; i_16_++)
	    is_15_[i_16_] = var_es.readByte(-20933);
	i++;
	((BytesParser) var_es).pos++;
	int i_17_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i;
	int i_18_;
	for (i_18_ = 0; ((BytesParser) var_es).bytes[i_18_ + ((BytesParser) var_es).pos] != 0;
	     i_18_++) {
	    /* empty */
	}
	byte[] is_19_ = new byte[i_18_];
	for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
	    is_19_[i_20_] = var_es.readByte(-20933);
	i_18_++;
	((BytesParser) var_es).pos++;
	int i_21_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_18_;
	int i_22_;
	for (i_22_ = 0; ((BytesParser) var_es).bytes[i_22_ + ((BytesParser) var_es).pos] != 0;
	     i_22_++) {
	    /* empty */
	}
	byte[] is_23_ = new byte[i_22_];
	for (int i_24_ = 0; i_22_ > i_24_; i_24_++)
	    is_23_[i_24_] = var_es.readByte(-20933);
	((BytesParser) var_es).pos++;
	byte[] is_25_ = new byte[++i_22_];
	int i_26_;
	if (i_22_ <= 1)
	    i_26_ = i_22_;
	else {
	    is_25_[1] = (byte) 1;
	    i_26_ = 2;
	    int i_27_ = 1;
	    for (int i_28_ = 2; i_22_ > i_28_; i_28_++) {
		int i_29_ = var_es.readUnsignedByte(-9268);
		if (i_29_ == 0)
		    i_27_ = i_26_++;
		else {
		    if (i_27_ >= i_29_)
			i_29_--;
		    i_27_ = i_29_;
		}
		is_25_[i_28_] = (byte) i_27_;
	    }
	}
	mu[] var_mus = new mu[i_26_];
	for (int i_30_ = 0; var_mus.length > i_30_; i_30_++) {
	    mu var_mu = var_mus[i_30_] = new mu();
	    int i_31_ = var_es.readUnsignedByte(-9268);
	    if (i_31_ > 0)
		((mu) var_mu).l = new byte[2 * i_31_];
	    i_31_ = var_es.readUnsignedByte(-9268);
	    if (i_31_ > 0) {
		((mu) var_mu).h = new byte[i_31_ * 2 + 2];
		((mu) var_mu).h[1] = (byte) 64;
	    }
	}
	int i_32_ = var_es.readUnsignedByte(-9268);
	byte[] is_33_ = i_32_ <= 0 ? null : new byte[2 * i_32_];
	i_32_ = var_es.readUnsignedByte(-9268);
	byte[] is_34_ = i_32_ > 0 ? new byte[i_32_ * 2] : null;
	int i_35_;
	for (i_35_ = 0; ((BytesParser) var_es).bytes[((BytesParser) var_es).pos + i_35_] != 0;
	     i_35_++) {
	    /* empty */
	}
	byte[] is_36_ = new byte[i_35_];
	for (int i_37_ = 0; i_35_ > i_37_; i_37_++)
	    is_36_[i_37_] = var_es.readByte(-20933);
	i_35_++;
	((BytesParser) var_es).pos++;
	int i_38_ = 0;
	for (int i_39_ = 0; i_39_ < 128; i_39_++) {
	    i_38_ += var_es.readUnsignedByte(-9268);
	    ((ul) this).u[i_39_] = (short) i_38_;
	}
	i_38_ = 0;
	for (int i_40_ = 0; i_40_ < 128; i_40_++) {
	    i_38_ += var_es.readUnsignedByte(-9268);
	    ((ul) this).u[i_40_] += i_38_ << 8;
	}
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	for (int i_44_ = 0; i_44_ < 128; i_44_++) {
	    if (i_41_ == 0) {
		if (i_42_ >= is_36_.length)
		    i_41_ = -1;
		else
		    i_41_ = is_36_[i_42_++];
		i_43_ = var_es.c(false);
	    }
	    ((ul) this).u[i_44_] += uca.a(i_43_ - 1, 2) << 14;
	    i_41_--;
	    q[i_44_] = i_43_;
	}
	i_42_ = 0;
	i_41_ = 0;
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < 128; i_46_++) {
	    if (q[i_46_] != 0) {
		if (i_41_ == 0) {
		    if (i_42_ >= is_15_.length)
			i_41_ = -1;
		    else
			i_41_ = is_15_[i_42_++];
		    i_45_ = ((BytesParser) var_es).bytes[i_17_++] - 1;
		}
		i_41_--;
		((ul) this).o[i_46_] = (byte) i_45_;
	    }
	}
	i_41_ = 0;
	i_42_ = 0;
	int i_47_ = 0;
	for (int i_48_ = 0; i_48_ < 128; i_48_++) {
	    if (q[i_48_] != 0) {
		if (i_41_ == 0) {
		    i_47_ = ((BytesParser) var_es).bytes[i_21_++] + 16 << 2;
		    if (is_19_.length <= i_42_)
			i_41_ = -1;
		    else
			i_41_ = is_19_[i_42_++];
		}
		i_41_--;
		((ul) this).x[i_48_] = (byte) i_47_;
	    }
	}
	i_42_ = 0;
	i_41_ = 0;
	mu var_mu = null;
	for (int i_49_ = 0; i_49_ < 128; i_49_++) {
	    if (q[i_49_] != 0) {
		if (i_41_ == 0) {
		    var_mu = var_mus[is_25_[i_42_]];
		    if (is_23_.length <= i_42_)
			i_41_ = -1;
		    else
			i_41_ = is_23_[i_42_++];
		}
		i_41_--;
		((ul) this).C[i_49_] = var_mu;
	    }
	}
	i_42_ = 0;
	i_41_ = 0;
	int i_50_ = 0;
	for (int i_51_ = 0; i_51_ < 128; i_51_++) {
	    if (i_41_ == 0) {
		if (is_36_.length <= i_42_)
		    i_41_ = -1;
		else
		    i_41_ = is_36_[i_42_++];
		if (q[i_51_] > 0)
		    i_50_ = var_es.readUnsignedByte(-9268) + 1;
	    }
	    ((ul) this).B[i_51_] = (byte) i_50_;
	    i_41_--;
	}
	((ul) this).n = var_es.readUnsignedByte(-9268) + 1;
	for (int i_52_ = 0; i_26_ > i_52_; i_52_++) {
	    mu var_mu_53_ = var_mus[i_52_];
	    if (((mu) var_mu_53_).l != null) {
		for (int i_54_ = 1; ((mu) var_mu_53_).l.length > i_54_;
		     i_54_ += 2)
		    ((mu) var_mu_53_).l[i_54_] = var_es.readByte(-20933);
	    }
	    if (((mu) var_mu_53_).h != null) {
		for (int i_55_ = 3; ((mu) var_mu_53_).h.length - 2 > i_55_;
		     i_55_ += 2)
		    ((mu) var_mu_53_).h[i_55_] = var_es.readByte(-20933);
	    }
	}
	if (is_33_ != null) {
	    for (int i_56_ = 1; i_56_ < is_33_.length; i_56_ += 2)
		is_33_[i_56_] = var_es.readByte(-20933);
	}
	if (is_34_ != null) {
	    for (int i_57_ = 1; is_34_.length > i_57_; i_57_ += 2)
		is_34_[i_57_] = var_es.readByte(-20933);
	}
	for (int i_58_ = 0; i_58_ < i_26_; i_58_++) {
	    mu var_mu_59_ = var_mus[i_58_];
	    if (((mu) var_mu_59_).h != null) {
		i_38_ = 0;
		for (int i_60_ = 2; i_60_ < ((mu) var_mu_59_).h.length;
		     i_60_ += 2) {
		    i_38_ = i_38_ + var_es.readUnsignedByte(-9268) + 1;
		    ((mu) var_mu_59_).h[i_60_] = (byte) i_38_;
		}
	    }
	}
	for (int i_61_ = 0; i_26_ > i_61_; i_61_++) {
	    mu var_mu_62_ = var_mus[i_61_];
	    if (((mu) var_mu_62_).l != null) {
		i_38_ = 0;
		for (int i_63_ = 2; i_63_ < ((mu) var_mu_62_).l.length;
		     i_63_ += 2) {
		    i_38_ = var_es.readUnsignedByte(-9268) + 1 + i_38_;
		    ((mu) var_mu_62_).l[i_63_] = (byte) i_38_;
		}
	    }
	}
	if (is_33_ != null) {
	    i_38_ = var_es.readUnsignedByte(-9268);
	    is_33_[0] = (byte) i_38_;
	    for (int i_64_ = 2; is_33_.length > i_64_; i_64_ += 2) {
		i_38_ = var_es.readUnsignedByte(-9268) + 1 + i_38_;
		is_33_[i_64_] = (byte) i_38_;
	    }
	    int i_65_ = is_33_[0];
	    int i_66_ = is_33_[1];
	    for (int i_67_ = 0; i_67_ < i_65_; i_67_++)
		((ul) this).B[i_67_]
		    = (byte) (i_66_ * ((ul) this).B[i_67_] + 32 >> 6);
	    int i_68_ = 2;
	    while (i_68_ < is_33_.length) {
		int i_69_ = is_33_[i_68_];
		int i_70_ = is_33_[i_68_ + 1];
		int i_71_ = i_66_ * (i_69_ - i_65_) + (i_69_ - i_65_) / 2;
		for (int i_72_ = i_65_; i_72_ < i_69_; i_72_++) {
		    int i_73_ = Class_kf.a(i_71_, 100, i_69_ - i_65_);
		    i_71_ += i_70_ - i_66_;
		    ((ul) this).B[i_72_]
			= (byte) (i_73_ * ((ul) this).B[i_72_] + 32 >> 6);
		}
		i_66_ = i_70_;
		i_68_ += 2;
		i_65_ = i_69_;
	    }
	    Object object = null;
	    for (int i_74_ = i_65_; i_74_ < 128; i_74_++)
		((ul) this).B[i_74_]
		    = (byte) (i_66_ * ((ul) this).B[i_74_] + 32 >> 6);
	}
	if (is_34_ != null) {
	    i_38_ = var_es.readUnsignedByte(-9268);
	    is_34_[0] = (byte) i_38_;
	    for (int i_75_ = 2; is_34_.length > i_75_; i_75_ += 2) {
		i_38_ = var_es.readUnsignedByte(-9268) + 1 + i_38_;
		is_34_[i_75_] = (byte) i_38_;
	    }
	    int i_76_ = is_34_[0];
	    int i_77_ = is_34_[1] << 1;
	    for (int i_78_ = 0; i_76_ > i_78_; i_78_++) {
		int i_79_ = i_77_ + (((ul) this).x[i_78_] & 0xff);
		if (i_79_ < 0)
		    i_79_ = 0;
		if (i_79_ > 128)
		    i_79_ = 128;
		((ul) this).x[i_78_] = (byte) i_79_;
	    }
	    int i_80_ = 2;
	    while (is_34_.length > i_80_) {
		int i_81_ = is_34_[i_80_];
		int i_82_ = is_34_[i_80_ + 1] << 1;
		int i_83_ = i_77_ * (i_81_ - i_76_) + (i_81_ - i_76_) / 2;
		for (int i_84_ = i_76_; i_81_ > i_84_; i_84_++) {
		    int i_85_ = Class_kf.a(i_83_, 100, i_81_ - i_76_);
		    int i_86_ = (((ul) this).x[i_84_] & 0xff) + i_85_;
		    if (i_86_ < 0)
			i_86_ = 0;
		    if (i_86_ > 128)
			i_86_ = 128;
		    i_83_ += i_82_ - i_77_;
		    ((ul) this).x[i_84_] = (byte) i_86_;
		}
		i_80_ += 2;
		i_77_ = i_82_;
		i_76_ = i_81_;
	    }
	    for (int i_87_ = i_76_; i_87_ < 128; i_87_++) {
		int i_88_ = (((ul) this).x[i_87_] & 0xff) + i_77_;
		if (i_88_ < 0)
		    i_88_ = 0;
		if (i_88_ > 128)
		    i_88_ = 128;
		((ul) this).x[i_87_] = (byte) i_88_;
	    }
	    Object object = null;
	}
	for (int i_89_ = 0; i_89_ < i_26_; i_89_++)
	    ((mu) var_mus[i_89_]).a = var_es.readUnsignedByte(-9268);
	for (int i_90_ = 0; i_90_ < i_26_; i_90_++) {
	    mu var_mu_91_ = var_mus[i_90_];
	    if (((mu) var_mu_91_).l != null)
		((mu) var_mu_91_).f = var_es.readUnsignedByte(-9268);
	    if (((mu) var_mu_91_).h != null)
		((mu) var_mu_91_).i = var_es.readUnsignedByte(-9268);
	    if (((mu) var_mu_91_).a > 0)
		((mu) var_mu_91_).k = var_es.readUnsignedByte(-9268);
	}
	for (int i_92_ = 0; i_26_ > i_92_; i_92_++)
	    ((mu) var_mus[i_92_]).b = var_es.readUnsignedByte(-9268);
	for (int i_93_ = 0; i_93_ < i_26_; i_93_++) {
	    mu var_mu_94_ = var_mus[i_93_];
	    if (((mu) var_mu_94_).b > 0)
		((mu) var_mu_94_).c = var_es.readUnsignedByte(-9268);
	}
	for (int i_95_ = 0; i_95_ < i_26_; i_95_++) {
	    mu var_mu_96_ = var_mus[i_95_];
	    if (((mu) var_mu_96_).c > 0)
		((mu) var_mu_96_).d = var_es.readUnsignedByte(-9268);
	}
    }
    
    static {
	v = new int[32];
    }
}
