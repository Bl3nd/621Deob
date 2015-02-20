/* eu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eu extends Class_i
{
    private wt[][] m;
    private byte[][] n;
    private ap[][] o;
    private float p;
    private float q;
    private float r;
    private float s;
    private int t = -1;
    private float u;
    private float v;
    private byte[][] w;
    private int x;
    private float y;
    private float z;
    private float A;
    private float B;
    private ie[][] C;
    private nga D;
    private float E;
    private wc[][] F;
    private float G;
    
    final void a(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool,
		 int i_2_) {
	rd var_rd = ((nga) D).bb;
	t = i_2_;
	v = ((rd) var_rd).z;
	A = ((rd) var_rd).m;
	s = ((rd) var_rd).s;
	u = ((rd) var_rd).v;
	G = ((rd) var_rd).i;
	z = ((rd) var_rd).k;
	p = ((rd) var_rd).w;
	r = ((rd) var_rd).o;
	y = ((rd) var_rd).q;
	B = ((rd) var_rd).M;
	q = ((rd) var_rd).C;
	E = ((rd) var_rd).B;
	for (int i_3_ = 0; i_3_ < i_1_ + i_1_; i_3_++) {
	    for (int i_4_ = 0; i_4_ < i_1_ + i_1_; i_4_++) {
		if (bools[i_3_][i_4_]) {
		    int i_5_ = i - i_1_ + i_3_;
		    int i_6_ = i_0_ - i_1_ + i_4_;
		    if (i_5_ >= 0 && i_5_ < ((Class_i) this).k && i_6_ >= 0
			&& i_6_ < ((Class_i) this).j)
			a(i_5_, i_6_);
		}
	    }
	}
    }
    
    final void DA(ha var_ha, int i, int i_7_, int i_8_, int i_9_,
		  boolean bool) {
	/* empty */
    }
    
    final void a(int i, int i_10_, int i_11_) {
	if (n[i][i_10_] < i_11_)
	    n[i][i_10_] = (byte) i_11_;
    }
    
    final void a(gga var_gga, int[] is) {
	/* empty */
    }
    
    final boolean a(ha var_ha, int i, int i_12_, int i_13_, int i_14_,
		    boolean bool) {
	return false;
    }
    
    final void E(ha var_ha, int i, int i_15_, int i_16_, int i_17_,
		 boolean bool) {
	/* empty */
    }
    
    final void BA() {
	w = null;
	n = null;
    }
    
    final void a(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_,
		 int i_23_, boolean[][] bools) {
	lfa var_lfa = D.a(Thread.currentThread());
	jea var_jea = ((lfa) var_lfa).Q;
	((jea) var_jea).q = 0;
	((jea) var_jea).o = false;
	D.ya();
	if (m != null)
	    a(i, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, bools, var_lfa,
	      var_jea, ((lfa) var_lfa).U, ((lfa) var_lfa).u);
	else if (F != null)
	    b(i, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, bools, var_lfa,
	      var_jea, ((lfa) var_lfa).U, ((lfa) var_lfa).u);
    }
    
    eu(nga var_nga, int i, int i_24_, int i_25_, int i_26_, int[][] is,
       int[][] is_27_, int i_28_) {
	super(i_25_, i_26_, i_28_, is);
	D = var_nga;
	x = i_24_;
	w = new byte[i_25_ + 1][i_26_ + 1];
	int i_29_ = ((nga) D).A >> 9;
	for (int i_30_ = 1; i_30_ < i_26_; i_30_++) {
	    for (int i_31_ = 1; i_31_ < i_25_; i_31_++) {
		int i_32_ = i_29_;
		int i_33_
		    = is_27_[i_31_ + 1][i_30_] - is_27_[i_31_ - 1][i_30_];
		int i_34_
		    = is_27_[i_31_][i_30_ + 1] - is_27_[i_31_][i_30_ - 1];
		int i_35_
		    = (int) Math.sqrt((double) (i_33_ * i_33_ + 512 * i_28_
						+ i_34_ * i_34_));
		int i_36_ = (i_33_ << 8) / i_35_;
		int i_37_ = -512 * i_28_ / i_35_;
		int i_38_ = (i_34_ << 8) / i_35_;
		i_32_ += (((nga) D).x * i_36_ + ((nga) D).w * i_37_
			  + ((nga) D).G * i_38_) >> 17;
		i_32_ >>= 1;
		if (i_32_ < 2)
		    i_32_ = 2;
		else if (i_32_ > 126)
		    i_32_ = 126;
		w[i_31_][i_30_] = (byte) i_32_;
	    }
	}
	n = new byte[i_25_ + 1][i_26_ + 1];
    }
    
    final void O(int i, int i_39_, int[] is, int[] is_40_, int[] is_41_,
		 int[] is_42_, int[] is_43_, int[] is_44_, int[] is_45_,
		 int[] is_46_, int i_47_, int i_48_, int i_49_, boolean bool) {
	if (m == null) {
	    m = new wt[((Class_i) this).k][((Class_i) this).j];
	    o = new ap[((Class_i) this).k][((Class_i) this).j];
	} else if (F != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_50_ = 0; i_50_ < is_43_.length; i_50_++) {
		if (is_43_[i_50_] == -1)
		    is_43_[i_50_] = 0;
		else
		    is_43_[i_50_]
			= vq.m[pg.a(0, is_43_[i_50_]) & 0xffff] << 8 | 0xff;
	    }
	    if (is_44_ != null) {
		for (int i_51_ = 0; i_51_ < is_44_.length; i_51_++) {
		    if (is_44_[i_51_] == -1)
			is_44_[i_51_] = 0;
		    else
			is_44_[i_51_]
			    = (vq.m[pg.a(0, is_44_[i_51_]) & 0xffff] << 8
			       | 0xff);
		}
	    }
	    boolean bool_52_ = true;
	    int i_53_ = -1;
	    int i_54_ = -1;
	    int i_55_ = -1;
	    int i_56_ = -1;
	    if (is.length == 6) {
		for (int i_57_ = 0; i_57_ < 6; i_57_++) {
		    if (is[i_57_] == 0 && is_41_[i_57_] == 0) {
			if (i_53_ != -1 && is_43_[i_53_] != is_43_[i_57_]) {
			    bool_52_ = false;
			    break;
			}
			i_53_ = i_57_;
		    } else if (is[i_57_] == ((Class_i) this).b
			       && is_41_[i_57_] == 0) {
			if (i_54_ != -1 && is_43_[i_54_] != is_43_[i_57_]) {
			    bool_52_ = false;
			    break;
			}
			i_54_ = i_57_;
		    } else if (is[i_57_] == ((Class_i) this).b
			       && is_41_[i_57_] == ((Class_i) this).b) {
			if (i_55_ != -1 && is_43_[i_55_] != is_43_[i_57_]) {
			    bool_52_ = false;
			    break;
			}
			i_55_ = i_57_;
		    } else if (is[i_57_] == 0
			       && is_41_[i_57_] == ((Class_i) this).b) {
			if (i_56_ != -1 && is_43_[i_56_] != is_43_[i_57_]) {
			    bool_52_ = false;
			    break;
			}
			i_56_ = i_57_;
		    }
		}
		if (i_53_ == -1 || i_54_ == -1 || i_55_ == -1 || i_56_ == -1)
		    bool_52_ = false;
		if (bool_52_) {
		    if (is_40_ != null) {
			for (int i_58_ = 0; i_58_ < 4; i_58_++) {
			    if (is_40_[i_58_] != 0) {
				bool_52_ = false;
				break;
			    }
			}
		    }
		    if (bool_52_) {
			for (int i_59_ = 1; i_59_ < 4; i_59_++) {
			    if (is[i_59_] != is[0]
				&& is[i_59_] != is[0] + ((Class_i) this).b
				&& is[i_59_] != is[0] - ((Class_i) this).b) {
				bool_52_ = false;
				break;
			    }
			    if (is_41_[i_59_] != is_41_[0]
				&& (is_41_[i_59_]
				    != is_41_[0] + ((Class_i) this).b)
				&& (is_41_[i_59_]
				    != is_41_[0] - ((Class_i) this).b)) {
				bool_52_ = false;
				break;
			    }
			}
		    }
		}
	    } else
		bool_52_ = false;
	    if (bool_52_) {
		wt var_wt = new wt();
		int i_60_ = is_43_[0];
		int i_61_ = is_45_[0];
		if (is_44_ != null) {
		    ((wt) var_wt).g = is_44_[0] >> 8;
		    if (i_60_ == 0)
			((wt) var_wt).a |= 0x2;
		} else if (i_60_ == 0)
		    return;
		if ((((Class_i) this).f[i][i_39_]
		     == ((Class_i) this).f[i + 1][i_39_])
		    && (((Class_i) this).f[i][i_39_]
			== ((Class_i) this).f[i + 1][i_39_ + 1])
		    && (((Class_i) this).f[i][i_39_]
			== ((Class_i) this).f[i][i_39_ + 1]))
		    ((wt) var_wt).a |= 0x1;
		if (i_61_ != -1 && (((wt) var_wt).a & 0x2) == 0
		    && !((vca) ((Class_r) D).j.a(i_61_, (byte) 86)).u) {
		    ((wt) var_wt).d = w[i][i_39_] - n[i][i_39_];
		    ((wt) var_wt).j = w[i + 1][i_39_] - n[i + 1][i_39_];
		    ((wt) var_wt).e
			= w[i + 1][i_39_ + 1] - n[i + 1][i_39_ + 1];
		    ((wt) var_wt).i = w[i][i_39_ + 1] - n[i][i_39_ + 1];
		    ((wt) var_wt).c = (short) i_61_;
		} else {
		    int i_62_;
		    if (is_42_ != null && i_48_ != 0) {
			i_62_ = 255 * is_42_[i_53_] / i_48_;
			if (i_62_ < 0)
			    i_62_ = 0;
			else if (i_62_ > 255)
			    i_62_ = 255;
		    } else
			i_62_ = 0;
		    ((wt) var_wt).d = mk.a(i_62_, true, i_47_,
					   b(is_43_[i_53_] >> 8,
					     w[i][i_39_] - n[i][i_39_]));
		    if (((wt) var_wt).g != 0)
			((wt) var_wt).d
			    |= 255 - (w[i][i_39_] - n[i][i_39_]) << 25;
		    if (is_42_ != null && i_48_ != 0) {
			i_62_ = 255 * is_42_[i_54_] / i_48_;
			if (i_62_ < 0)
			    i_62_ = 0;
			else if (i_62_ > 255)
			    i_62_ = 255;
		    } else
			i_62_ = 0;
		    ((wt) var_wt).j
			= mk.a(i_62_, true, i_47_,
			       b(is_43_[i_54_] >> 8,
				 w[i + 1][i_39_] - n[i + 1][i_39_]));
		    if (((wt) var_wt).g != 0)
			((wt) var_wt).j
			    |= 255 - (w[i + 1][i_39_] - n[i + 1][i_39_]) << 25;
		    if (is_42_ != null && i_48_ != 0) {
			i_62_ = 255 * is_42_[i_55_] / i_48_;
			if (i_62_ < 0)
			    i_62_ = 0;
			else if (i_62_ > 255)
			    i_62_ = 255;
		    } else
			i_62_ = 0;
		    ((wt) var_wt).e
			= mk.a(i_62_, true, i_47_,
			       b(is_43_[i_55_] >> 8,
				 w[i + 1][i_39_ + 1] - n[i + 1][i_39_ + 1]));
		    if (((wt) var_wt).g != 0)
			((wt) var_wt).e |= 255 - (w[i + 1][i_39_ + 1]
						  - n[i + 1][i_39_ + 1]) << 25;
		    if (is_42_ != null && i_48_ != 0) {
			i_62_ = 255 * is_42_[i_56_] / i_48_;
			if (i_62_ < 0)
			    i_62_ = 0;
			else if (i_62_ > 255)
			    i_62_ = 255;
		    } else
			i_62_ = 0;
		    ((wt) var_wt).i
			= mk.a(i_62_, true, i_47_,
			       b(is_43_[i_56_] >> 8,
				 w[i][i_39_ + 1] - n[i][i_39_ + 1]));
		    if (((wt) var_wt).g != 0)
			((wt) var_wt).i
			    |= 255 - (w[i][i_39_ + 1] - n[i][i_39_ + 1]) << 25;
		    ((wt) var_wt).c = (short) -1;
		}
		if (is_42_ != null) {
		    ((wt) var_wt).k = (short) is_42_[i_55_];
		    ((wt) var_wt).f = (short) is_42_[i_56_];
		    ((wt) var_wt).h = (short) is_42_[i_54_];
		    ((wt) var_wt).b = (short) is_42_[i_53_];
		}
		m[i][i_39_] = var_wt;
	    } else {
		ap var_ap = new ap();
		((ap) var_ap).c = (short) is.length;
		((ap) var_ap).j = (short) (is.length / 3);
		((ap) var_ap).h = new short[((ap) var_ap).c];
		((ap) var_ap).i = new short[((ap) var_ap).c];
		((ap) var_ap).g = new short[((ap) var_ap).c];
		((ap) var_ap).b = new int[((ap) var_ap).c];
		if (is_42_ != null)
		    ((ap) var_ap).e = new short[((ap) var_ap).c];
		for (int i_63_ = 0; i_63_ < ((ap) var_ap).c; i_63_++) {
		    int i_64_ = is[i_63_];
		    int i_65_ = is_41_[i_63_];
		    boolean bool_66_ = false;
		    int i_67_;
		    if (i_64_ == 0 && i_65_ == 0)
			i_67_ = w[i][i_39_] - n[i][i_39_];
		    else if (i_64_ == 0 && i_65_ == ((Class_i) this).b)
			i_67_ = w[i][i_39_ + 1] - n[i][i_39_ + 1];
		    else if (i_64_ == ((Class_i) this).b
			     && i_65_ == ((Class_i) this).b)
			i_67_ = w[i + 1][i_39_ + 1] - n[i + 1][i_39_ + 1];
		    else if (i_64_ == ((Class_i) this).b && i_65_ == 0)
			i_67_ = w[i + 1][i_39_] - n[i + 1][i_39_];
		    else {
			int i_68_
			    = (((w[i][i_39_] - n[i][i_39_])
				* (((Class_i) this).b - i_64_))
			       + (w[i + 1][i_39_] - n[i + 1][i_39_]) * i_64_);
			int i_69_ = (((w[i][i_39_ + 1] - n[i][i_39_ + 1])
				      * (((Class_i) this).b - i_64_))
				     + (w[i + 1][i_39_ + 1]
					- n[i + 1][i_39_ + 1]) * i_64_);
			i_67_ = (i_68_ * (((Class_i) this).b - i_65_)
				 + i_69_ * i_65_) >> 2 * ((Class_i) this).g;
		    }
		    int i_70_ = (i << ((Class_i) this).g) + i_64_;
		    int i_71_ = (i_39_ << ((Class_i) this).g) + i_65_;
		    ((ap) var_ap).h[i_63_] = (short) i_64_;
		    ((ap) var_ap).g[i_63_] = (short) i_65_;
		    ((ap) var_ap).i[i_63_]
			= (short) (this.a(i_71_, i_70_, true)
				   + (is_40_ != null ? is_40_[i_63_] : 0));
		    if (i_67_ < 0)
			i_67_ = 0;
		    if (is_45_[i_63_] == -1
			|| (((vca) ((Class_r) D).j.a(is_45_[i_63_], (byte) 86))
			    .u)) {
			if (is_43_[i_63_] == 0) {
			    if (is_44_ != null)
				((ap) var_ap).b[i_63_] = i_67_ << 25;
			    else
				((ap) var_ap).b[i_63_] = 0;
			} else {
			    int i_72_ = 0;
			    if (is_42_ != null) {
				int i_73_ = (((ap) var_ap).e[i_63_]
					     = (short) is_42_[i_63_]);
				if (i_48_ != 0) {
				    i_72_ = 255 * i_73_ / i_48_;
				    if (i_72_ < 0)
					i_72_ = 0;
				    else if (i_72_ > 255)
					i_72_ = 255;
				}
			    }
			    ((ap) var_ap).b[i_63_]
				= mk.a(i_72_, true, i_47_,
				       b(is_43_[i_63_] >> 8, i_67_));
			    if (is_44_ != null)
				((ap) var_ap).b[i_63_] |= i_67_ << 25;
			}
		    } else
			((ap) var_ap).b[i_63_] = i_67_;
		}
		boolean bool_74_ = false;
		for (int i_75_ = 0; i_75_ < ((ap) var_ap).j; i_75_++) {
		    if (is_45_[i_75_ * 3] != -1
			&& !((vca) ((Class_r) D).j.a(is_45_[i_75_ * 3],
						     (byte) 86)).u)
			bool_74_ = true;
		}
		if (is_44_ != null)
		    ((ap) var_ap).a = new int[((ap) var_ap).j];
		if (bool_74_) {
		    ((ap) var_ap).d = new short[((ap) var_ap).j];
		    ((ap) var_ap).f = new short[((ap) var_ap).j];
		}
		for (int i_76_ = 0; i_76_ < ((ap) var_ap).j; i_76_++) {
		    int i_77_ = i_76_ * 3;
		    if (is_44_ != null && is_44_[i_77_] != 0)
			((ap) var_ap).a[i_76_] = is_44_[i_77_] >> 8;
		    if (bool_74_) {
			int i_78_ = i_77_ + 1;
			int i_79_ = i_78_ + 1;
			boolean bool_80_ = false;
			boolean bool_81_ = true;
			int i_82_ = is_45_[i_77_];
			if (i_82_ == -1
			    || ((vca) ((Class_r) D).j.a(i_82_, (byte) 86)).u)
			    bool_81_ = false;
			else
			    bool_80_ = true;
			i_82_ = is_45_[i_78_];
			if (i_82_ == -1
			    || ((vca) ((Class_r) D).j.a(i_82_, (byte) 86)).u)
			    bool_81_ = false;
			else
			    bool_80_ = true;
			i_82_ = is_45_[i_79_];
			if (i_82_ == -1
			    || ((vca) ((Class_r) D).j.a(i_82_, (byte) 86)).u)
			    bool_81_ = false;
			else
			    bool_80_ = true;
			if (bool_81_) {
			    ((ap) var_ap).d[i_76_] = (short) i_82_;
			    ((ap) var_ap).f[i_76_] = (short) is_46_[i_77_];
			} else {
			    if (bool_80_) {
				i_82_ = is_45_[i_77_];
				if (i_82_ != -1
				    && !((vca) ((Class_r) D).j.a(i_82_,
								 (byte) 86)).u)
				    ((ap) var_ap).b[i_77_]
					= vq.m[pg.a(0,
						    (((vca)
						      ((Class_r) D).j
							  .a(i_82_, (byte) 86))
						     .v) & 0xffff) & 0xffff];
				i_82_ = is_45_[i_78_];
				if (i_82_ != -1
				    && !((vca) ((Class_r) D).j.a(i_82_,
								 (byte) 86)).u)
				    ((ap) var_ap).b[i_78_]
					= vq.m[pg.a(0,
						    (((vca)
						      ((Class_r) D).j
							  .a(i_82_, (byte) 86))
						     .v) & 0xffff) & 0xffff];
				i_82_ = is_45_[i_79_];
				if (i_82_ != -1
				    && !((vca) ((Class_r) D).j.a(i_82_,
								 (byte) 86)).u)
				    ((ap) var_ap).b[i_79_]
					= vq.m[pg.a(0,
						    (((vca)
						      ((Class_r) D).j
							  .a(i_82_, (byte) 86))
						     .v) & 0xffff) & 0xffff];
			    }
			    ((ap) var_ap).d[i_76_] = (short) -1;
			}
		    }
		}
		o[i][i_39_] = var_ap;
	    }
	}
    }
    
    final void a(int i, int i_83_) {
	lfa var_lfa = D.a(Thread.currentThread());
	((jea) ((lfa) var_lfa).Q).q = 0;
	if (m != null)
	    a(i, i_83_, ((lfa) var_lfa).m, var_lfa, ((lfa) var_lfa).Q,
	      ((lfa) var_lfa).U, ((lfa) var_lfa).u, ((lfa) var_lfa).S,
	      ((lfa) var_lfa).B);
	else if (F != null)
	    a(i, i_83_, ((lfa) var_lfa).Q, ((lfa) var_lfa).U,
	      ((lfa) var_lfa).u, ((lfa) var_lfa).S, ((lfa) var_lfa).B);
    }
    
    private final void a(int i, int i_84_, jea var_jea, int[] is, int[] is_85_,
			 int[] is_86_, int[] is_87_) {
	wc var_wc = F[i][i_84_];
	if (var_wc != null) {
	    if ((((wc) var_wc).a & 0x2) == 0) {
		int i_88_ = i * ((Class_i) this).b;
		int i_89_ = i_88_ + ((Class_i) this).b;
		int i_90_ = i_84_ * ((Class_i) this).b;
		int i_91_ = i_90_ + ((Class_i) this).b;
		float f;
		float f_92_;
		float f_93_;
		float f_94_;
		float f_95_;
		int i_96_;
		float f_97_;
		int i_98_;
		float f_99_;
		int i_100_;
		float f_101_;
		int i_102_;
		int i_103_;
		int i_104_;
		float f_105_;
		int i_106_;
		float f_107_;
		int i_108_;
		if ((((wc) var_wc).a & 0x1) != 0) {
		    int i_109_ = ((Class_i) this).f[i][i_84_];
		    float f_110_ = B * (float) i_109_;
		    if (t == -1) {
			f = E + (y * (float) i_88_ + f_110_
				 + q * (float) i_90_);
			if (f <= (float) ((nga) D).M)
			    return;
			f_92_ = E + (y * (float) i_89_ + f_110_
				     + q * (float) i_90_);
			if (f_92_ <= (float) ((nga) D).M)
			    return;
			f_93_ = E + (y * (float) i_89_ + f_110_
				     + q * (float) i_91_);
			if (f_93_ <= (float) ((nga) D).M)
			    return;
			f_94_ = E + (y * (float) i_88_ + f_110_
				     + q * (float) i_91_);
			if (f_94_ <= (float) ((nga) D).M)
			    return;
		    } else {
			f = E + (y * (float) i_88_ + f_110_
				 + q * (float) i_90_);
			f_92_ = E + (y * (float) i_89_ + f_110_
				     + q * (float) i_90_);
			f_93_ = E + (y * (float) i_89_ + f_110_
				     + q * (float) i_91_);
			f_94_ = E + (y * (float) i_88_ + f_110_
				     + q * (float) i_91_);
		    }
		    float f_111_ = A * (float) i_109_;
		    float f_112_ = z * (float) i_109_;
		    if (t == -1) {
			f_95_ = u + (v * (float) i_88_ + f_111_
				     + s * (float) i_90_);
			i_96_ = (((jea) var_jea).i
				 + (int) (f_95_ * (float) ((nga) D).L / f));
			f_97_ = r + (G * (float) i_88_ + f_112_
				     + p * (float) i_90_);
			i_98_ = (((jea) var_jea).l
				 + (int) (f_97_ * (float) ((nga) D).O / f));
			f_99_ = u + (v * (float) i_89_ + f_111_
				     + s * (float) i_90_);
			i_100_
			    = (((jea) var_jea).i
			       + (int) (f_99_ * (float) ((nga) D).L / f_92_));
			f_101_ = r + (G * (float) i_89_ + f_112_
				      + p * (float) i_90_);
			i_102_
			    = (((jea) var_jea).l
			       + (int) (f_101_ * (float) ((nga) D).O / f_92_));
			float f_113_ = u + (v * (float) i_89_ + f_111_
					    + s * (float) i_91_);
			i_103_
			    = (((jea) var_jea).i
			       + (int) (f_113_ * (float) ((nga) D).L / f_93_));
			float f_114_ = r + (G * (float) i_89_ + f_112_
					    + p * (float) i_91_);
			i_104_
			    = (((jea) var_jea).l
			       + (int) (f_114_ * (float) ((nga) D).O / f_93_));
			f_105_ = u + (v * (float) i_88_ + f_111_
				      + s * (float) i_91_);
			i_106_
			    = (((jea) var_jea).i
			       + (int) (f_105_ * (float) ((nga) D).L / f_94_));
			f_107_ = r + (G * (float) i_88_ + f_112_
				      + p * (float) i_91_);
			i_108_
			    = (((jea) var_jea).l
			       + (int) (f_107_ * (float) ((nga) D).O / f_94_));
		    } else {
			f_95_ = u + (v * (float) i_88_ + f_111_
				     + s * (float) i_90_);
			i_96_
			    = ((jea) var_jea).i + (int) (f_95_
							 * (float) ((nga) D).L
							 / (float) t);
			f_97_ = r + (G * (float) i_88_ + f_112_
				     + p * (float) i_90_);
			i_98_
			    = ((jea) var_jea).l + (int) (f_97_
							 * (float) ((nga) D).O
							 / (float) t);
			f_99_ = u + (v * (float) i_89_ + f_111_
				     + s * (float) i_90_);
			i_100_
			    = ((jea) var_jea).i + (int) (f_99_
							 * (float) ((nga) D).L
							 / (float) t);
			f_101_ = r + (G * (float) i_89_ + f_112_
				      + p * (float) i_90_);
			i_102_
			    = ((jea) var_jea).l + (int) (f_101_
							 * (float) ((nga) D).O
							 / (float) t);
			float f_115_ = u + (v * (float) i_89_ + f_111_
					    + s * (float) i_91_);
			i_103_
			    = ((jea) var_jea).i + (int) (f_115_
							 * (float) ((nga) D).L
							 / (float) t);
			float f_116_ = r + (G * (float) i_89_ + f_112_
					    + p * (float) i_91_);
			i_104_
			    = ((jea) var_jea).l + (int) (f_116_
							 * (float) ((nga) D).O
							 / (float) t);
			f_105_ = u + (v * (float) i_88_ + f_111_
				      + s * (float) i_91_);
			i_106_
			    = ((jea) var_jea).i + (int) (f_105_
							 * (float) ((nga) D).L
							 / (float) t);
			f_107_ = r + (G * (float) i_88_ + f_112_
				      + p * (float) i_91_);
			i_108_
			    = ((jea) var_jea).l + (int) (f_107_
							 * (float) ((nga) D).O
							 / (float) t);
		    }
		} else {
		    int i_117_ = ((Class_i) this).f[i][i_84_];
		    int i_118_ = ((Class_i) this).f[i + 1][i_84_];
		    int i_119_ = ((Class_i) this).f[i + 1][i_84_ + 1];
		    int i_120_ = ((Class_i) this).f[i][i_84_ + 1];
		    if (t == -1) {
			f = E + (y * (float) i_88_ + B * (float) i_117_
				 + q * (float) i_90_);
			if (f <= (float) ((nga) D).M)
			    return;
			f_92_ = E + (y * (float) i_89_ + B * (float) i_118_
				     + q * (float) i_90_);
			if (f_92_ <= (float) ((nga) D).M)
			    return;
			f_93_ = E + (y * (float) i_89_ + B * (float) i_119_
				     + q * (float) i_91_);
			if (f_93_ <= (float) ((nga) D).M)
			    return;
			f_94_ = E + (y * (float) i_88_ + B * (float) i_120_
				     + q * (float) i_91_);
			if (f_94_ <= (float) ((nga) D).M)
			    return;
			f_95_ = u + (v * (float) i_88_ + A * (float) i_117_
				     + s * (float) i_90_);
			i_96_ = (((jea) var_jea).i
				 + (int) (f_95_ * (float) ((nga) D).L / f));
			f_97_ = r + (G * (float) i_88_ + z * (float) i_117_
				     + p * (float) i_90_);
			i_98_ = (((jea) var_jea).l
				 + (int) (f_97_ * (float) ((nga) D).O / f));
			f_99_ = u + (v * (float) i_89_ + A * (float) i_118_
				     + s * (float) i_90_);
			i_100_
			    = (((jea) var_jea).i
			       + (int) (f_99_ * (float) ((nga) D).L / f_92_));
			f_101_ = r + (G * (float) i_89_ + z * (float) i_118_
				      + p * (float) i_90_);
			i_102_
			    = (((jea) var_jea).l
			       + (int) (f_101_ * (float) ((nga) D).O / f_92_));
			float f_121_
			    = u + (v * (float) i_89_ + A * (float) i_119_
				   + s * (float) i_91_);
			i_103_
			    = (((jea) var_jea).i
			       + (int) (f_121_ * (float) ((nga) D).L / f_93_));
			float f_122_
			    = r + (G * (float) i_89_ + z * (float) i_119_
				   + p * (float) i_91_);
			i_104_
			    = (((jea) var_jea).l
			       + (int) (f_122_ * (float) ((nga) D).O / f_93_));
			f_105_ = u + (v * (float) i_88_ + A * (float) i_120_
				      + s * (float) i_91_);
			i_106_
			    = (((jea) var_jea).i
			       + (int) (f_105_ * (float) ((nga) D).L / f_94_));
			f_107_ = r + (G * (float) i_88_ + z * (float) i_120_
				      + p * (float) i_91_);
			i_108_
			    = (((jea) var_jea).l
			       + (int) (f_107_ * (float) ((nga) D).O / f_94_));
		    } else {
			f = E + (y * (float) i_88_ + B * (float) i_117_
				 + q * (float) i_90_);
			f_92_ = E + (y * (float) i_89_ + B * (float) i_118_
				     + q * (float) i_90_);
			f_93_ = E + (y * (float) i_89_ + B * (float) i_119_
				     + q * (float) i_91_);
			f_94_ = E + (y * (float) i_88_ + B * (float) i_120_
				     + q * (float) i_91_);
			f_95_ = u + (v * (float) i_88_ + A * (float) i_117_
				     + s * (float) i_90_);
			i_96_
			    = ((jea) var_jea).i + (int) (f_95_
							 * (float) ((nga) D).L
							 / (float) t);
			f_97_ = r + (G * (float) i_88_ + z * (float) i_117_
				     + p * (float) i_90_);
			i_98_
			    = ((jea) var_jea).l + (int) (f_97_
							 * (float) ((nga) D).O
							 / (float) t);
			f_99_ = u + (v * (float) i_89_ + A * (float) i_118_
				     + s * (float) i_90_);
			i_100_
			    = ((jea) var_jea).i + (int) (f_99_
							 * (float) ((nga) D).L
							 / (float) t);
			f_101_ = r + (G * (float) i_89_ + z * (float) i_118_
				      + p * (float) i_90_);
			i_102_
			    = ((jea) var_jea).l + (int) (f_101_
							 * (float) ((nga) D).O
							 / (float) t);
			float f_123_
			    = u + (v * (float) i_89_ + A * (float) i_119_
				   + s * (float) i_91_);
			i_103_
			    = ((jea) var_jea).i + (int) (f_123_
							 * (float) ((nga) D).L
							 / (float) t);
			float f_124_
			    = r + (G * (float) i_89_ + z * (float) i_119_
				   + p * (float) i_91_);
			i_104_
			    = ((jea) var_jea).l + (int) (f_124_
							 * (float) ((nga) D).O
							 / (float) t);
			f_105_ = u + (v * (float) i_88_ + A * (float) i_120_
				      + s * (float) i_91_);
			i_106_
			    = ((jea) var_jea).i + (int) (f_105_
							 * (float) ((nga) D).L
							 / (float) t);
			f_107_ = r + (G * (float) i_88_ + z * (float) i_120_
				      + p * (float) i_91_);
			i_108_
			    = ((jea) var_jea).l + (int) (f_107_
							 * (float) ((nga) D).O
							 / (float) t);
		    }
		}
		if (t == -1) {
		    if (((i_103_ - i_106_) * (i_102_ - i_108_)
			 - (i_104_ - i_108_) * (i_100_ - i_106_))
			> 0) {
			((jea) var_jea).o
			    = (i_103_ < 0 || i_106_ < 0 || i_100_ < 0
			       || i_103_ > ((jea) var_jea).b
			       || i_106_ > ((jea) var_jea).b
			       || i_100_ > ((jea) var_jea).b);
			if (((wc) var_wc).d >= 0) {
			    if (b(((vca) ((Class_r) D).j.a(((wc) var_wc).d,
							   (byte) 86)).i))
				((jea) var_jea).q = 100;
			    var_jea.a(i_104_, i_108_, i_102_, i_103_, i_106_,
				      i_100_, (int) f_93_, (int) f_94_,
				      (int) f_92_, ((wc) var_wc).b & 0xffff,
				      ((wc) var_wc).f & 0xffff,
				      ((wc) var_wc).e & 0xffff, (int) f_95_,
				      (int) f_99_, (int) f_105_, (int) f_97_,
				      (int) f_101_, (int) f_107_, (int) f,
				      (int) f_92_, (int) f_94_,
				      ((wc) var_wc).d);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_104_, i_108_, i_102_, i_103_, i_106_,
				      i_100_, (int) f_93_, (int) f_94_,
				      (int) f_92_, ((wc) var_wc).b & 0xffff,
				      ((wc) var_wc).f & 0xffff,
				      ((wc) var_wc).e & 0xffff);
		    }
		    if (((i_96_ - i_100_) * (i_108_ - i_102_)
			 - (i_98_ - i_102_) * (i_106_ - i_100_))
			> 0) {
			((jea) var_jea).o
			    = (i_96_ < 0 || i_100_ < 0 || i_106_ < 0
			       || i_96_ > ((jea) var_jea).b
			       || i_100_ > ((jea) var_jea).b
			       || i_106_ > ((jea) var_jea).b);
			if (((wc) var_wc).d >= 0) {
			    if (b(((vca) ((Class_r) D).j.a(((wc) var_wc).d,
							   (byte) 86)).i))
				((jea) var_jea).q = 100;
			    var_jea.a(i_98_, i_102_, i_108_, i_96_, i_100_,
				      i_106_, (int) f, (int) f_92_,
				      (int) f_94_, ((wc) var_wc).c & 0xffff,
				      ((wc) var_wc).e & 0xffff,
				      ((wc) var_wc).f & 0xffff, (int) f_95_,
				      (int) f_99_, (int) f_105_, (int) f_97_,
				      (int) f_101_, (int) f_107_, (int) f,
				      (int) f_92_, (int) f_94_,
				      ((wc) var_wc).d);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_98_, i_102_, i_108_, i_96_, i_100_,
				      i_106_, (int) f, (int) f_92_,
				      (int) f_94_, ((wc) var_wc).c & 0xffff,
				      ((wc) var_wc).e & 0xffff,
				      ((wc) var_wc).f & 0xffff);
		    }
		} else {
		    if (((i_103_ - i_106_) * (i_102_ - i_108_)
			 - (i_104_ - i_108_) * (i_100_ - i_106_))
			> 0) {
			((jea) var_jea).o
			    = (i_103_ < 0 || i_106_ < 0 || i_100_ < 0
			       || i_103_ > ((jea) var_jea).b
			       || i_106_ > ((jea) var_jea).b
			       || i_100_ > ((jea) var_jea).b);
			if (((wc) var_wc).d >= 0) {
			    if (b(((vca) ((Class_r) D).j.a(((wc) var_wc).d,
							   (byte) 86)).i))
				((jea) var_jea).q = 100;
			    var_jea.a(i_104_, i_108_, i_102_, i_103_, i_106_,
				      i_100_, (int) f_93_, (int) f_94_,
				      (int) f_92_, ((wc) var_wc).b & 0xffff,
				      ((wc) var_wc).f & 0xffff,
				      ((wc) var_wc).e & 0xffff, (int) f_95_,
				      (int) f_99_, (int) f_105_, (int) f_97_,
				      (int) f_101_, (int) f_107_, t, t, t,
				      ((wc) var_wc).d);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_104_, i_108_, i_102_, i_103_, i_106_,
				      i_100_, (int) f_93_, (int) f_94_,
				      (int) f_92_, ((wc) var_wc).b & 0xffff,
				      ((wc) var_wc).f & 0xffff,
				      ((wc) var_wc).e & 0xffff);
		    }
		    if (((i_96_ - i_100_) * (i_108_ - i_102_)
			 - (i_98_ - i_102_) * (i_106_ - i_100_))
			> 0) {
			((jea) var_jea).o
			    = (i_96_ < 0 || i_100_ < 0 || i_106_ < 0
			       || i_96_ > ((jea) var_jea).b
			       || i_100_ > ((jea) var_jea).b
			       || i_106_ > ((jea) var_jea).b);
			if (((wc) var_wc).d >= 0) {
			    if (b(((vca) ((Class_r) D).j.a(((wc) var_wc).d,
							   (byte) 86)).i))
				((jea) var_jea).q = 100;
			    var_jea.a(i_98_, i_102_, i_108_, i_96_, i_100_,
				      i_106_, (int) f, (int) f_92_,
				      (int) f_94_, ((wc) var_wc).c & 0xffff,
				      ((wc) var_wc).e & 0xffff,
				      ((wc) var_wc).f & 0xffff, (int) f_95_,
				      (int) f_99_, (int) f_105_, (int) f_97_,
				      (int) f_101_, (int) f_107_, t, t, t,
				      ((wc) var_wc).d);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_98_, i_102_, i_108_, i_96_, i_100_,
				      i_106_, (int) f, (int) f_92_,
				      (int) f_94_, ((wc) var_wc).c & 0xffff,
				      ((wc) var_wc).e & 0xffff,
				      ((wc) var_wc).f & 0xffff);
		    }
		}
	    }
	} else {
	    ie var_ie = C[i][i_84_];
	    if (var_ie != null) {
		if (t == -1) {
		    for (int i_125_ = 0; i_125_ < ((ie) var_ie).c; i_125_++) {
			int i_126_ = (((ie) var_ie).d[i_125_]
				      + (i << ((Class_i) this).g));
			short i_127_ = ((ie) var_ie).f[i_125_];
			int i_128_ = (((ie) var_ie).k[i_125_]
				      + (i_84_ << ((Class_i) this).g));
			float f = E + (y * (float) i_126_ + B * (float) i_127_
				       + q * (float) i_128_);
			if (f <= (float) ((nga) D).M)
			    return;
			float f_129_
			    = u + (v * (float) i_126_ + A * (float) i_127_
				   + s * (float) i_128_);
			float f_130_
			    = r + (G * (float) i_126_ + z * (float) i_127_
				   + p * (float) i_128_);
			is[i_125_]
			    = (((jea) var_jea).i
			       + (int) (f_129_ * (float) ((nga) D).L / f));
			is_85_[i_125_]
			    = (((jea) var_jea).l
			       + (int) (f_130_ * (float) ((nga) D).O / f));
			is_86_[i_125_] = (int) f;
		    }
		} else {
		    for (int i_131_ = 0; i_131_ < ((ie) var_ie).c; i_131_++) {
			int i_132_ = (((ie) var_ie).d[i_131_]
				      + (i << ((Class_i) this).g));
			short i_133_ = ((ie) var_ie).f[i_131_];
			int i_134_ = (((ie) var_ie).k[i_131_]
				      + (i_84_ << ((Class_i) this).g));
			float f = E + (y * (float) i_132_ + B * (float) i_133_
				       + q * (float) i_134_);
			float f_135_
			    = u + (v * (float) i_132_ + A * (float) i_133_
				   + s * (float) i_134_);
			float f_136_
			    = r + (G * (float) i_132_ + z * (float) i_133_
				   + p * (float) i_134_);
			is[i_131_]
			    = ((jea) var_jea).i + (int) (f_135_
							 * (float) ((nga) D).L
							 / (float) t);
			is_85_[i_131_]
			    = ((jea) var_jea).l + (int) (f_136_
							 * (float) ((nga) D).O
							 / (float) t);
			is_86_[i_131_] = (int) f;
		    }
		}
		if (((ie) var_ie).m != null) {
		    int i_137_ = ((Class_i) this).f[i][i_84_];
		    int i_138_ = ((Class_i) this).f[i + 1][i_84_];
		    int i_139_ = ((Class_i) this).f[i][i_84_ + 1];
		    int i_140_ = i * ((Class_i) this).b;
		    int i_141_ = i_140_ + ((Class_i) this).b;
		    int i_142_ = i_84_ * ((Class_i) this).b;
		    int i_143_ = i_142_ + ((Class_i) this).b;
		    float f = u + (v * (float) i_140_ + A * (float) i_137_
				   + s * (float) i_142_);
		    float f_144_ = r + (G * (float) i_140_ + z * (float) i_137_
					+ p * (float) i_142_);
		    float f_145_ = E + (y * (float) i_140_ + B * (float) i_137_
					+ q * (float) i_142_);
		    float f_146_ = u + (v * (float) i_141_ + A * (float) i_138_
					+ s * (float) i_142_);
		    float f_147_ = r + (G * (float) i_141_ + z * (float) i_138_
					+ p * (float) i_142_);
		    float f_148_ = E + (y * (float) i_141_ + B * (float) i_138_
					+ q * (float) i_142_);
		    float f_149_ = u + (v * (float) i_140_ + A * (float) i_139_
					+ s * (float) i_143_);
		    float f_150_ = r + (G * (float) i_140_ + z * (float) i_139_
					+ p * (float) i_143_);
		    float f_151_ = E + (y * (float) i_140_ + B * (float) i_139_
					+ q * (float) i_143_);
		    if (t == -1) {
			for (int i_152_ = 0; i_152_ < ((ie) var_ie).b;
			     i_152_++) {
			    short i_153_ = ((ie) var_ie).h[i_152_];
			    short i_154_ = ((ie) var_ie).g[i_152_];
			    short i_155_ = ((ie) var_ie).a[i_152_];
			    int i_156_ = is[i_153_];
			    int i_157_ = is[i_154_];
			    int i_158_ = is[i_155_];
			    int i_159_ = is_85_[i_153_];
			    int i_160_ = is_85_[i_154_];
			    int i_161_ = is_85_[i_155_];
			    if (((i_156_ - i_157_) * (i_161_ - i_160_)
				 - (i_159_ - i_160_) * (i_158_ - i_157_))
				> 0) {
				((jea) var_jea).o
				    = (i_156_ < 0 || i_157_ < 0 || i_158_ < 0
				       || i_156_ > ((jea) var_jea).b
				       || i_157_ > ((jea) var_jea).b
				       || i_158_ > ((jea) var_jea).b);
				short i_162_ = ((ie) var_ie).m[i_152_];
				if (i_162_ != -1) {
				    if (b(((vca) ((Class_r) D).j.a(i_162_,
								   (byte) 86))
					  .i))
					((jea) var_jea).q = 100;
				    var_jea.a(i_159_, i_160_, i_161_, i_156_,
					      i_157_, i_158_, is_86_[i_153_],
					      is_86_[i_154_], is_86_[i_155_],
					      ((ie) var_ie).j[i_153_],
					      ((ie) var_ie).j[i_154_],
					      ((ie) var_ie).j[i_155_], (int) f,
					      (int) f_146_, (int) f_149_,
					      (int) f_144_, (int) f_147_,
					      (int) f_150_, (int) f_145_,
					      (int) f_148_, (int) f_151_,
					      i_162_);
				    ((jea) var_jea).q = 0;
				} else {
				    int i_163_ = ((ie) var_ie).i[i_152_];
				    if (i_163_ != -1)
					var_jea.a
					    (i_159_, i_160_, i_161_, i_156_,
					     i_157_, i_158_, is_86_[i_153_],
					     is_86_[i_154_], is_86_[i_155_],
					     lfa.a(-116,
						   ((ie) var_ie).j[i_153_],
						   i_163_),
					     lfa.a(27, ((ie) var_ie).j[i_154_],
						   i_163_),
					     lfa.a(113,
						   ((ie) var_ie).j[i_155_],
						   i_163_));
				}
			    }
			}
		    } else {
			for (int i_164_ = 0; i_164_ < ((ie) var_ie).b;
			     i_164_++) {
			    short i_165_ = ((ie) var_ie).h[i_164_];
			    short i_166_ = ((ie) var_ie).g[i_164_];
			    short i_167_ = ((ie) var_ie).a[i_164_];
			    int i_168_ = is[i_165_];
			    int i_169_ = is[i_166_];
			    int i_170_ = is[i_167_];
			    int i_171_ = is_85_[i_165_];
			    int i_172_ = is_85_[i_166_];
			    int i_173_ = is_85_[i_167_];
			    if (((i_168_ - i_169_) * (i_173_ - i_172_)
				 - (i_171_ - i_172_) * (i_170_ - i_169_))
				> 0) {
				((jea) var_jea).o
				    = (i_168_ < 0 || i_169_ < 0 || i_170_ < 0
				       || i_168_ > ((jea) var_jea).b
				       || i_169_ > ((jea) var_jea).b
				       || i_170_ > ((jea) var_jea).b);
				short i_174_ = ((ie) var_ie).m[i_164_];
				if (i_174_ != -1) {
				    if (b(((vca) ((Class_r) D).j.a(i_174_,
								   (byte) 86))
					  .i))
					((jea) var_jea).q = 100;
				    var_jea.a(i_171_, i_172_, i_173_, i_168_,
					      i_169_, i_170_, is_86_[i_165_],
					      is_86_[i_166_], is_86_[i_167_],
					      ((ie) var_ie).j[i_165_],
					      ((ie) var_ie).j[i_166_],
					      ((ie) var_ie).j[i_167_], (int) f,
					      (int) f_146_, (int) f_149_,
					      (int) f_144_, (int) f_147_,
					      (int) f_150_, t, t, t, i_174_);
				    ((jea) var_jea).q = 0;
				} else {
				    int i_175_ = ((ie) var_ie).i[i_164_];
				    if (i_175_ != -1)
					var_jea.a
					    (i_171_, i_172_, i_173_, i_168_,
					     i_169_, i_170_, is_86_[i_165_],
					     is_86_[i_166_], is_86_[i_167_],
					     lfa.a(-103,
						   ((ie) var_ie).j[i_165_],
						   i_175_),
					     lfa.a(106,
						   ((ie) var_ie).j[i_166_],
						   i_175_),
					     lfa.a(126,
						   ((ie) var_ie).j[i_167_],
						   i_175_));
				}
			    }
			}
		    }
		} else {
		    for (int i_176_ = 0; i_176_ < ((ie) var_ie).b; i_176_++) {
			short i_177_ = ((ie) var_ie).h[i_176_];
			short i_178_ = ((ie) var_ie).g[i_176_];
			short i_179_ = ((ie) var_ie).a[i_176_];
			int i_180_ = is[i_177_];
			int i_181_ = is[i_178_];
			int i_182_ = is[i_179_];
			int i_183_ = is_85_[i_177_];
			int i_184_ = is_85_[i_178_];
			int i_185_ = is_85_[i_179_];
			if (((i_180_ - i_181_) * (i_185_ - i_184_)
			     - (i_183_ - i_184_) * (i_182_ - i_181_))
			    > 0) {
			    int i_186_ = ((ie) var_ie).i[i_176_];
			    if (i_186_ != -1) {
				((jea) var_jea).o
				    = (i_180_ < 0 || i_181_ < 0 || i_182_ < 0
				       || i_180_ > ((jea) var_jea).b
				       || i_181_ > ((jea) var_jea).b
				       || i_182_ > ((jea) var_jea).b);
				var_jea.a(i_183_, i_184_, i_185_, i_180_,
					  i_181_, i_182_, is_86_[i_177_],
					  is_86_[i_178_], is_86_[i_179_],
					  lfa.a(49, ((ie) var_ie).j[i_177_],
						i_186_),
					  lfa.a(61, ((ie) var_ie).j[i_178_],
						i_186_),
					  lfa.a(84, ((ie) var_ie).j[i_179_],
						i_186_));
			    }
			}
		    }
		}
	    }
	}
    }
    
    private static final int b(int i, int i_187_) {
	int i_188_ = (i & 0xff0000) * i_187_ >> 23;
	if (i_188_ < 2)
	    i_188_ = 2;
	else if (i_188_ > 253)
	    i_188_ = 253;
	int i_189_ = (i & 0xff00) * i_187_ >> 15;
	if (i_189_ < 2)
	    i_189_ = 2;
	else if (i_189_ > 253)
	    i_189_ = 253;
	int i_190_ = (i & 0xff) * i_187_ >> 7;
	if (i_190_ < 2)
	    i_190_ = 2;
	else if (i_190_ > 253)
	    i_190_ = 253;
	return i_188_ << 16 | i_189_ << 8 | i_190_;
    }
    
    final void a(int i, int i_191_, int[] is, int[] is_192_, int[] is_193_,
		 int[] is_194_, int[] is_195_, int[] is_196_, int[] is_197_,
		 int[] is_198_, int[] is_199_, int[] is_200_, int[] is_201_,
		 int i_202_, int i_203_, int i_204_, boolean bool) {
	if (F == null) {
	    F = new wc[((Class_i) this).k][((Class_i) this).j];
	    C = new ie[((Class_i) this).k][((Class_i) this).j];
	} else if (m != null)
	    throw new IllegalStateException();
	boolean bool_205_ = false;
	if (is_198_.length == 2 && is_195_.length == 2
	    && (is_198_[0] == is_198_[1]
		|| is_200_[0] != -1 && is_200_[0] == is_200_[1])) {
	    bool_205_ = true;
	    for (int i_206_ = 1; i_206_ < 2; i_206_++) {
		int i_207_ = is[is_195_[i_206_]];
		int i_208_ = is_193_[is_195_[i_206_]];
		if (i_207_ != 0 && i_207_ != ((Class_i) this).b
		    || i_208_ != 0 && i_208_ != ((Class_i) this).b) {
		    bool_205_ = false;
		    break;
		}
	    }
	}
	if (!bool_205_) {
	    ie var_ie = new ie();
	    short i_209_ = (short) is.length;
	    int i_210_ = (short) is_198_.length;
	    ((ie) var_ie).c = i_209_;
	    ((ie) var_ie).j = new short[i_209_];
	    ((ie) var_ie).d = new short[i_209_];
	    ((ie) var_ie).f = new short[i_209_];
	    ((ie) var_ie).k = new short[i_209_];
	    for (int i_211_ = 0; i_211_ < i_209_; i_211_++) {
		int i_212_ = is[i_211_];
		int i_213_ = is_193_[i_211_];
		if (i_212_ == 0 && i_213_ == 0)
		    ((ie) var_ie).j[i_211_]
			= (short) (w[i][i_191_] - n[i][i_191_]);
		else if (i_212_ == 0 && i_213_ == ((Class_i) this).b)
		    ((ie) var_ie).j[i_211_]
			= (short) (w[i][i_191_ + 1] - n[i][i_191_ + 1]);
		else if (i_212_ == ((Class_i) this).b
			 && i_213_ == ((Class_i) this).b)
		    ((ie) var_ie).j[i_211_] = (short) (w[i + 1][i_191_ + 1]
						       - n[i + 1][i_191_ + 1]);
		else if (i_212_ == ((Class_i) this).b && i_213_ == 0)
		    ((ie) var_ie).j[i_211_]
			= (short) (w[i + 1][i_191_] - n[i + 1][i_191_]);
		else {
		    int i_214_
			= ((w[i][i_191_] - n[i][i_191_]) * (((Class_i) this).b
							    - i_212_)
			   + (w[i + 1][i_191_] - n[i + 1][i_191_]) * i_212_);
		    int i_215_ = (((w[i][i_191_ + 1] - n[i][i_191_ + 1])
				   * (((Class_i) this).b - i_212_))
				  + (w[i + 1][i_191_ + 1]
				     - n[i + 1][i_191_ + 1]) * i_212_);
		    ((ie) var_ie).j[i_211_]
			= (short) ((i_214_ * (((Class_i) this).b - i_213_)
				    + i_215_ * i_213_)
				   >> 2 * ((Class_i) this).g);
		}
		int i_216_ = (i << ((Class_i) this).g) + i_212_;
		int i_217_ = (i_191_ << ((Class_i) this).g) + i_213_;
		((ie) var_ie).d[i_211_] = (short) i_212_;
		((ie) var_ie).k[i_211_] = (short) i_213_;
		((ie) var_ie).f[i_211_]
		    = (short) (this.a(i_217_, i_216_, true)
			       + (is_192_ != null ? is_192_[i_211_] : 0));
		if (((ie) var_ie).j[i_211_] < 2)
		    ((ie) var_ie).j[i_211_] = (short) 2;
	    }
	    boolean bool_218_ = false;
	    int i_219_ = 0;
	    for (int i_220_ = 0; i_220_ < i_210_; i_220_++) {
		if (is_198_[i_220_] >= 0
		    || is_199_ != null && is_199_[i_220_] >= 0)
		    i_219_++;
		if (is_200_[i_220_] != -1
		    && !(((vca) ((Class_r) D).j.a(is_200_[i_220_], (byte) 86))
			 .u))
		    bool_218_ = true;
	    }
	    ((ie) var_ie).i = new int[i_219_];
	    if (is_199_ != null)
		((ie) var_ie).l = new int[i_219_];
	    ((ie) var_ie).h = new short[i_219_];
	    ((ie) var_ie).g = new short[i_219_];
	    ((ie) var_ie).a = new short[i_219_];
	    if (bool_218_) {
		((ie) var_ie).m = new short[i_219_];
		((ie) var_ie).e = new short[i_219_];
	    }
	    for (int i_221_ = 0; i_221_ < i_210_; i_221_++) {
		if (is_198_[i_221_] >= 0
		    || is_199_ != null && is_199_[i_221_] >= 0) {
		    if (is_198_[i_221_] >= 0)
			((ie) var_ie).i[((ie) var_ie).b]
			    = pg.a(0, is_198_[i_221_]);
		    else
			((ie) var_ie).i[((ie) var_ie).b] = -1;
		    if (is_199_ != null) {
			if (is_199_[i_221_] != -1)
			    ((ie) var_ie).l[((ie) var_ie).b]
				= pg.a(0, is_199_[i_221_]);
			else
			    ((ie) var_ie).l[((ie) var_ie).b] = -1;
		    }
		    ((ie) var_ie).h[((ie) var_ie).b] = (short) is_195_[i_221_];
		    ((ie) var_ie).g[((ie) var_ie).b] = (short) is_196_[i_221_];
		    ((ie) var_ie).a[((ie) var_ie).b] = (short) is_197_[i_221_];
		    if (bool_218_) {
			if (is_200_[i_221_] != -1
			    && !((vca) ((Class_r) D).j.a(is_200_[i_221_],
							 (byte) 86)).u) {
			    ((ie) var_ie).m[((ie) var_ie).b]
				= (short) is_200_[i_221_];
			    ((ie) var_ie).e[((ie) var_ie).b]
				= (short) is_201_[i_221_];
			} else
			    ((ie) var_ie).m[((ie) var_ie).b] = (short) -1;
		    }
		    ((ie) var_ie).b++;
		}
	    }
	    C[i][i_191_] = var_ie;
	} else if (is_198_[0] >= 0 || is_199_ != null && is_199_[0] >= 0) {
	    wc var_wc = new wc();
	    int i_222_ = is_198_[0];
	    int i_223_ = is_200_[0];
	    if (is_199_ != null) {
		((wc) var_wc).g = lfa.a(-123, w[i][i_191_] - n[i][i_191_],
					pg.a(0, is_199_[0]));
		if (i_222_ == -1)
		    ((wc) var_wc).a |= 0x2;
	    }
	    if ((((Class_i) this).f[i][i_191_]
		 == ((Class_i) this).f[i + 1][i_191_])
		&& (((Class_i) this).f[i][i_191_]
		    == ((Class_i) this).f[i + 1][i_191_ + 1])
		&& (((Class_i) this).f[i][i_191_]
		    == ((Class_i) this).f[i][i_191_ + 1]))
		((wc) var_wc).a |= 0x1;
	    if (i_223_ != -1 && (((wc) var_wc).a & 0x2) == 0
		&& !((vca) ((Class_r) D).j.a(i_223_, (byte) 86)).u) {
		((wc) var_wc).c = (short) (w[i][i_191_] - n[i][i_191_]);
		((wc) var_wc).e
		    = (short) (w[i + 1][i_191_] - n[i + 1][i_191_]);
		((wc) var_wc).b
		    = (short) (w[i + 1][i_191_ + 1] - n[i + 1][i_191_ + 1]);
		((wc) var_wc).f
		    = (short) (w[i][i_191_ + 1] - n[i][i_191_ + 1]);
		((wc) var_wc).d = (short) i_223_;
	    } else {
		short i_224_ = pg.a(0, i_222_);
		((wc) var_wc).c
		    = (short) lfa.a(-120, w[i][i_191_] - n[i][i_191_], i_224_);
		((wc) var_wc).e
		    = (short) lfa.a(-122, w[i + 1][i_191_] - n[i + 1][i_191_],
				    i_224_);
		((wc) var_wc).b
		    = (short) lfa.a(-108, (w[i + 1][i_191_ + 1]
					   - n[i + 1][i_191_ + 1]), i_224_);
		((wc) var_wc).f
		    = (short) lfa.a(-93, w[i][i_191_ + 1] - n[i][i_191_ + 1],
				    i_224_);
		((wc) var_wc).d = (short) -1;
	    }
	    F[i][i_191_] = var_wc;
	}
    }
    
    private final void a(int i, int i_225_, int i_226_, int i_227_, int i_228_,
			 int i_229_, int i_230_, boolean[][] bools,
			 lfa var_lfa, jea var_jea, int[] is, int[] is_231_) {
	int i_232_ = (i_230_ - i_228_) * i_226_ / 256;
	int i_233_ = i_226_ >> 8;
	boolean bool = ((lfa) var_lfa).i;
	D.ZA(false);
	((jea) var_jea).c = false;
	((jea) var_jea).k = false;
	int i_234_ = i;
	int i_235_ = i_225_ + i_232_;
	for (int i_236_ = i_227_; i_236_ < i_229_; i_236_++) {
	    for (int i_237_ = i_228_; i_237_ < i_230_; i_237_++) {
		if (bools[i_236_ - i_227_][i_237_ - i_228_]) {
		    if (m[i_236_][i_237_] != null) {
			wt var_wt = m[i_236_][i_237_];
			if (((wt) var_wt).c != -1
			    && (((wt) var_wt).a & 0x2) == 0
			    && ((wt) var_wt).g == 0) {
			    int i_238_ = D.j(((wt) var_wt).c);
			    var_jea.a(i_235_ - i_233_, i_235_ - i_233_, i_235_,
				      i_234_ + i_233_, i_234_, i_234_ + i_233_,
				      100, 100, 100,
				      lfa.a(88, ((wt) var_wt).e, i_238_),
				      lfa.a(61, ((wt) var_wt).i, i_238_),
				      lfa.a(-92, ((wt) var_wt).j, i_238_));
			    var_jea.a(i_235_, i_235_, i_235_ - i_233_, i_234_,
				      i_234_ + i_233_, i_234_, 100, 100, 100,
				      lfa.a(-88, ((wt) var_wt).d, i_238_),
				      lfa.a(94, ((wt) var_wt).j, i_238_),
				      lfa.a(91, ((wt) var_wt).i, i_238_));
			} else if (((wt) var_wt).g == 0) {
			    var_jea.b(i_235_ - i_233_, i_235_ - i_233_, i_235_,
				      i_234_ + i_233_, i_234_, i_234_ + i_233_,
				      100, 100, 100, ((wt) var_wt).e,
				      ((wt) var_wt).i, ((wt) var_wt).j);
			    var_jea.b(i_235_, i_235_, i_235_ - i_233_, i_234_,
				      i_234_ + i_233_, i_234_, 100, 100, 100,
				      ((wt) var_wt).d, ((wt) var_wt).j,
				      ((wt) var_wt).i);
			} else {
			    int i_239_ = ((wt) var_wt).g;
			    var_jea.b(i_235_ - i_233_, i_235_ - i_233_, i_235_,
				      i_234_ + i_233_, i_234_, i_234_ + i_233_,
				      100, 100, 100,
				      pr.a((byte) 0,
					   ((wt) var_wt).e & ~0xffffff,
					   i_239_),
				      pr.a((byte) 4,
					   ((wt) var_wt).i & ~0xffffff,
					   i_239_),
				      pr.a((byte) 18,
					   ((wt) var_wt).j & ~0xffffff,
					   i_239_));
			    var_jea.b(i_235_, i_235_, i_235_ - i_233_, i_234_,
				      i_234_ + i_233_, i_234_, 100, 100, 100,
				      pr.a((byte) 17,
					   ((wt) var_wt).d & ~0xffffff,
					   i_239_),
				      pr.a((byte) 5,
					   ((wt) var_wt).j & ~0xffffff,
					   i_239_),
				      pr.a((byte) -121,
					   ((wt) var_wt).i & ~0xffffff,
					   i_239_));
			}
		    } else if (o[i_236_][i_237_] != null) {
			ap var_ap = o[i_236_][i_237_];
			for (int i_240_ = 0; i_240_ < ((ap) var_ap).c;
			     i_240_++) {
			    is[i_240_]
				= i_234_ + (((ap) var_ap).h[i_240_] * i_233_
					    / ((Class_i) this).b);
			    is_231_[i_240_]
				= i_235_ - (((ap) var_ap).g[i_240_] * i_233_
					    / ((Class_i) this).b);
			}
			for (int i_241_ = 0; i_241_ < ((ap) var_ap).j;
			     i_241_++) {
			    int i_242_ = i_241_ * 3;
			    int i_243_ = i_242_ + 1;
			    int i_244_ = i_243_ + 1;
			    int i_245_ = is[i_242_];
			    int i_246_ = is[i_243_];
			    int i_247_ = is[i_244_];
			    int i_248_ = is_231_[i_242_];
			    int i_249_ = is_231_[i_243_];
			    int i_250_ = is_231_[i_244_];
			    if (((ap) var_ap).a != null
				&& ((ap) var_ap).a[i_241_] != 0
				&& (((ap) var_ap).d == null
				    || (((ap) var_ap).d != null
					&& ((ap) var_ap).d[i_241_] == -1))) {
				int i_251_ = ((ap) var_ap).a[i_241_];
				var_jea.b
				    (i_248_, i_249_, i_250_, i_245_, i_246_,
				     i_247_, 100, 100, 100,
				     pr.a((byte) -111,
					  -16777216 - (((ap) var_ap).b[i_242_]
						       & ~0xffffff),
					  i_251_),
				     pr.a((byte) -120,
					  -16777216 - (((ap) var_ap).b[i_243_]
						       & ~0xffffff),
					  i_251_),
				     pr.a((byte) 93,
					  -16777216 - (((ap) var_ap).b[i_244_]
						       & ~0xffffff),
					  i_251_));
			    } else if (((ap) var_ap).d != null
				       && ((ap) var_ap).d[i_241_] != -1) {
				int i_252_ = D.j(((ap) var_ap).d[i_241_]);
				var_jea.a(i_248_, i_249_, i_250_, i_245_,
					  i_246_, i_247_, 100, 100, 100,
					  i_252_, i_252_, i_252_);
			    } else
				var_jea.b(i_248_, i_249_, i_250_, i_245_,
					  i_246_, i_247_, 100, 100, 100,
					  ((ap) var_ap).b[i_242_],
					  ((ap) var_ap).b[i_243_],
					  ((ap) var_ap).b[i_244_]);
			}
		    }
		}
		i_235_ -= i_233_;
	    }
	    i_235_ = i_225_ + i_232_;
	    i_234_ += i_233_;
	}
	((jea) var_jea).c = true;
	D.ZA(bool);
    }
    
    final ha v(int i, int i_253_, ha var_ha) {
	return null;
    }
    
    final void a(int i, int i_254_, int i_255_, boolean[][] bools,
		 boolean bool) {
	rd var_rd = ((nga) D).bb;
	t = -1;
	v = ((rd) var_rd).z;
	A = ((rd) var_rd).m;
	s = ((rd) var_rd).s;
	u = ((rd) var_rd).v;
	G = ((rd) var_rd).i;
	z = ((rd) var_rd).k;
	p = ((rd) var_rd).w;
	r = ((rd) var_rd).o;
	y = ((rd) var_rd).q;
	B = ((rd) var_rd).M;
	q = ((rd) var_rd).C;
	E = ((rd) var_rd).B;
	for (int i_256_ = 0; i_256_ < i_255_ + i_255_; i_256_++) {
	    for (int i_257_ = 0; i_257_ < i_255_ + i_255_; i_257_++) {
		if (bools[i_256_][i_257_]) {
		    int i_258_ = i - i_255_ + i_256_;
		    int i_259_ = i_254_ - i_255_ + i_257_;
		    if (i_258_ >= 0 && i_258_ < ((Class_i) this).k
			&& i_259_ >= 0 && i_259_ < ((Class_i) this).j)
			a(i_258_, i_259_);
		}
	    }
	}
    }
    
    private final void b(int i, int i_260_, int i_261_, int i_262_, int i_263_,
			 int i_264_, int i_265_, boolean[][] bools,
			 lfa var_lfa, jea var_jea, int[] is, int[] is_266_) {
	int i_267_ = (i_265_ - i_263_) * i_261_ / 256;
	int i_268_ = i_261_ >> 8;
	boolean bool = ((lfa) var_lfa).i;
	D.ZA(false);
	((jea) var_jea).c = false;
	((jea) var_jea).k = false;
	int i_269_ = i;
	int i_270_ = i_260_ + i_267_;
	for (int i_271_ = i_262_; i_271_ < i_264_; i_271_++) {
	    for (int i_272_ = i_263_; i_272_ < i_265_; i_272_++) {
		if (bools[i_271_ - i_262_][i_272_ - i_263_]) {
		    if (F[i_271_][i_272_] != null) {
			wc var_wc = F[i_271_][i_272_];
			if (((wc) var_wc).d != -1
			    && (((wc) var_wc).a & 0x2) == 0
			    && ((wc) var_wc).g == -1) {
			    int i_273_ = D.j(((wc) var_wc).d);
			    var_jea.a(i_270_ - i_268_, i_270_ - i_268_, i_270_,
				      i_269_ + i_268_, i_269_, i_269_ + i_268_,
				      100, 100, 100,
				      lfa.a(-120, ((wc) var_wc).b & 0xffff,
					    i_273_),
				      lfa.a(-87, ((wc) var_wc).f & 0xffff,
					    i_273_),
				      lfa.a(-124, ((wc) var_wc).e & 0xffff,
					    i_273_));
			    var_jea.a(i_270_, i_270_, i_270_ - i_268_, i_269_,
				      i_269_ + i_268_, i_269_, 100, 100, 100,
				      lfa.a(114, ((wc) var_wc).c & 0xffff,
					    i_273_),
				      lfa.a(44, ((wc) var_wc).e & 0xffff,
					    i_273_),
				      lfa.a(49, ((wc) var_wc).f & 0xffff,
					    i_273_));
			} else if (((wc) var_wc).g == -1) {
			    var_jea.a(i_270_ - i_268_, i_270_ - i_268_, i_270_,
				      i_269_ + i_268_, i_269_, i_269_ + i_268_,
				      100, 100, 100, ((wc) var_wc).b & 0xffff,
				      ((wc) var_wc).f & 0xffff,
				      ((wc) var_wc).e & 0xffff);
			    var_jea.a(i_270_, i_270_, i_270_ - i_268_, i_269_,
				      i_269_ + i_268_, i_269_, 100, 100, 100,
				      ((wc) var_wc).c & 0xffff,
				      ((wc) var_wc).e & 0xffff,
				      ((wc) var_wc).f & 0xffff);
			} else {
			    int i_274_ = ((wc) var_wc).g;
			    var_jea.a(i_270_ - i_268_, i_270_ - i_268_, i_270_,
				      i_269_ + i_268_, i_269_, i_269_ + i_268_,
				      100, 100, 100, i_274_, i_274_, i_274_);
			    var_jea.a(i_270_, i_270_, i_270_ - i_268_, i_269_,
				      i_269_ + i_268_, i_269_, 100, 100, 100,
				      i_274_, i_274_, i_274_);
			}
		    } else if (C[i_271_][i_272_] != null) {
			ie var_ie = C[i_271_][i_272_];
			for (int i_275_ = 0; i_275_ < ((ie) var_ie).c;
			     i_275_++) {
			    is[i_275_]
				= i_269_ + (((ie) var_ie).d[i_275_] * i_268_
					    / ((Class_i) this).b);
			    is_266_[i_275_]
				= i_270_ - (((ie) var_ie).k[i_275_] * i_268_
					    / ((Class_i) this).b);
			}
			for (int i_276_ = 0; i_276_ < ((ie) var_ie).b;
			     i_276_++) {
			    short i_277_ = ((ie) var_ie).h[i_276_];
			    short i_278_ = ((ie) var_ie).g[i_276_];
			    short i_279_ = ((ie) var_ie).a[i_276_];
			    int i_280_ = is[i_277_];
			    int i_281_ = is[i_278_];
			    int i_282_ = is[i_279_];
			    int i_283_ = is_266_[i_277_];
			    int i_284_ = is_266_[i_278_];
			    int i_285_ = is_266_[i_279_];
			    if (((ie) var_ie).l != null
				&& ((ie) var_ie).l[i_276_] != -1) {
				int i_286_ = ((ie) var_ie).l[i_276_];
				var_jea.a(i_283_, i_284_, i_285_, i_280_,
					  i_281_, i_282_, 100, 100, 100,
					  lfa.a(93, ((ie) var_ie).j[i_277_],
						i_286_),
					  lfa.a(71, ((ie) var_ie).j[i_278_],
						i_286_),
					  lfa.a(62, ((ie) var_ie).j[i_279_],
						i_286_));
			    } else if (((ie) var_ie).m != null
				       && ((ie) var_ie).m[i_276_] != -1) {
				int i_287_ = D.j(((ie) var_ie).m[i_276_]);
				var_jea.a(i_283_, i_284_, i_285_, i_280_,
					  i_281_, i_282_, 100, 100, 100,
					  lfa.a(-110, ((ie) var_ie).j[i_277_],
						i_287_),
					  lfa.a(103, ((ie) var_ie).j[i_278_],
						i_287_),
					  lfa.a(-95, ((ie) var_ie).j[i_279_],
						i_287_));
			    } else {
				int i_288_ = ((ie) var_ie).i[i_276_];
				var_jea.a(i_283_, i_284_, i_285_, i_280_,
					  i_281_, i_282_, 100, 100, 100,
					  lfa.a(-102, ((ie) var_ie).j[i_277_],
						i_288_),
					  lfa.a(37, ((ie) var_ie).j[i_278_],
						i_288_),
					  lfa.a(-92, ((ie) var_ie).j[i_279_],
						i_288_));
			    }
			}
		    }
		}
		i_270_ -= i_268_;
	    }
	    i_270_ = i_260_ + i_267_;
	    i_269_ += i_268_;
	}
	((jea) var_jea).c = true;
	D.ZA(bool);
    }
    
    private final boolean b(int i) {
	if ((x & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    private final void a(int i, int i_289_, boolean bool, lfa var_lfa,
			 jea var_jea, int[] is, int[] is_290_, int[] is_291_,
			 int[] is_292_) {
	wt var_wt = m[i][i_289_];
	if (var_wt != null) {
	    if ((((wt) var_wt).a & 0x2) == 0) {
		int i_293_ = i * ((Class_i) this).b;
		int i_294_ = i_293_ + ((Class_i) this).b;
		int i_295_ = i_289_ * ((Class_i) this).b;
		int i_296_ = i_295_ + ((Class_i) this).b;
		int i_297_ = 0;
		int i_298_ = 0;
		int i_299_ = 0;
		int i_300_ = 0;
		float f;
		float f_301_;
		float f_302_;
		float f_303_;
		float f_304_;
		int i_305_;
		float f_306_;
		int i_307_;
		float f_308_;
		int i_309_;
		float f_310_;
		int i_311_;
		float f_312_;
		int i_313_;
		float f_314_;
		int i_315_;
		float f_316_;
		int i_317_;
		float f_318_;
		int i_319_;
		if ((((wt) var_wt).a & 0x1) != 0 && !bool) {
		    int i_320_ = ((Class_i) this).f[i][i_289_];
		    float f_321_ = B * (float) i_320_;
		    if (t == -1) {
			f = E + (y * (float) i_293_ + f_321_
				 + q * (float) i_295_);
			if (f <= (float) ((nga) D).M)
			    return;
			f_301_ = E + (y * (float) i_294_ + f_321_
				      + q * (float) i_295_);
			if (f_301_ <= (float) ((nga) D).M)
			    return;
			f_302_ = E + (y * (float) i_294_ + f_321_
				      + q * (float) i_296_);
			if (f_302_ <= (float) ((nga) D).M)
			    return;
			f_303_ = E + (y * (float) i_293_ + f_321_
				      + q * (float) i_296_);
			if (f_303_ <= (float) ((nga) D).M)
			    return;
		    } else {
			f = E + (y * (float) i_293_ + f_321_
				 + q * (float) i_295_);
			f_301_ = E + (y * (float) i_294_ + f_321_
				      + q * (float) i_295_);
			f_302_ = E + (y * (float) i_294_ + f_321_
				      + q * (float) i_296_);
			f_303_ = E + (y * (float) i_293_ + f_321_
				      + q * (float) i_296_);
		    }
		    if (((lfa) var_lfa).j) {
			int i_322_ = (int) (f - (float) ((lfa) var_lfa).a);
			if (i_322_ > 0) {
			    i_297_ = i_322_;
			    if (i_297_ > 255)
				i_297_ = 255;
			}
			i_322_ = (int) (f_301_ - (float) ((lfa) var_lfa).a);
			if (i_322_ > 0) {
			    i_298_ = i_322_;
			    if (i_298_ > 255)
				i_298_ = 255;
			}
			i_322_ = (int) (f_302_ - (float) ((lfa) var_lfa).a);
			if (i_322_ > 0) {
			    i_299_ = i_322_;
			    if (i_299_ > 255)
				i_299_ = 255;
			}
			i_322_ = (int) (f_303_ - (float) ((lfa) var_lfa).a);
			if (i_322_ > 0) {
			    i_300_ = i_322_;
			    if (i_300_ > 255)
				i_300_ = 255;
			}
		    }
		    float f_323_ = A * (float) i_320_;
		    float f_324_ = z * (float) i_320_;
		    if (t == -1) {
			f_304_ = u + (v * (float) i_293_ + f_323_
				      + s * (float) i_295_);
			i_305_ = (((jea) var_jea).i
				  + (int) (f_304_ * (float) ((nga) D).L / f));
			f_306_ = r + (G * (float) i_293_ + f_324_
				      + p * (float) i_295_);
			i_307_ = (((jea) var_jea).l
				  + (int) (f_306_ * (float) ((nga) D).O / f));
			f_308_ = u + (v * (float) i_294_ + f_323_
				      + s * (float) i_295_);
			i_309_
			    = ((jea) var_jea).i + (int) (f_308_
							 * (float) ((nga) D).L
							 / f_301_);
			f_310_ = r + (G * (float) i_294_ + f_324_
				      + p * (float) i_295_);
			i_311_
			    = ((jea) var_jea).l + (int) (f_310_
							 * (float) ((nga) D).O
							 / f_301_);
			f_312_ = u + (v * (float) i_294_ + f_323_
				      + s * (float) i_296_);
			i_313_
			    = ((jea) var_jea).i + (int) (f_312_
							 * (float) ((nga) D).L
							 / f_302_);
			f_314_ = r + (G * (float) i_294_ + f_324_
				      + p * (float) i_296_);
			i_315_
			    = ((jea) var_jea).l + (int) (f_314_
							 * (float) ((nga) D).O
							 / f_302_);
			f_316_ = u + (v * (float) i_293_ + f_323_
				      + s * (float) i_296_);
			i_317_
			    = ((jea) var_jea).i + (int) (f_316_
							 * (float) ((nga) D).L
							 / f_303_);
			f_318_ = r + (G * (float) i_293_ + f_324_
				      + p * (float) i_296_);
			i_319_
			    = ((jea) var_jea).l + (int) (f_318_
							 * (float) ((nga) D).O
							 / f_303_);
		    } else {
			f_304_ = u + (v * (float) i_293_ + f_323_
				      + s * (float) i_295_);
			i_305_
			    = ((jea) var_jea).i + (int) (f_304_
							 * (float) ((nga) D).L
							 / (float) t);
			f_306_ = r + (G * (float) i_293_ + f_324_
				      + p * (float) i_295_);
			i_307_
			    = ((jea) var_jea).l + (int) (f_306_
							 * (float) ((nga) D).O
							 / (float) t);
			f_308_ = u + (v * (float) i_294_ + f_323_
				      + s * (float) i_295_);
			i_309_
			    = ((jea) var_jea).i + (int) (f_308_
							 * (float) ((nga) D).L
							 / (float) t);
			f_310_ = r + (G * (float) i_294_ + f_324_
				      + p * (float) i_295_);
			i_311_
			    = ((jea) var_jea).l + (int) (f_310_
							 * (float) ((nga) D).O
							 / (float) t);
			f_312_ = u + (v * (float) i_294_ + f_323_
				      + s * (float) i_296_);
			i_313_
			    = ((jea) var_jea).i + (int) (f_312_
							 * (float) ((nga) D).L
							 / (float) t);
			f_314_ = r + (G * (float) i_294_ + f_324_
				      + p * (float) i_296_);
			i_315_
			    = ((jea) var_jea).l + (int) (f_314_
							 * (float) ((nga) D).O
							 / (float) t);
			f_316_ = u + (v * (float) i_293_ + f_323_
				      + s * (float) i_296_);
			i_317_
			    = ((jea) var_jea).i + (int) (f_316_
							 * (float) ((nga) D).L
							 / (float) t);
			f_318_ = r + (G * (float) i_293_ + f_324_
				      + p * (float) i_296_);
			i_319_
			    = ((jea) var_jea).l + (int) (f_318_
							 * (float) ((nga) D).O
							 / (float) t);
		    }
		} else {
		    int i_325_ = ((Class_i) this).f[i][i_289_];
		    int i_326_ = ((Class_i) this).f[i + 1][i_289_];
		    int i_327_ = ((Class_i) this).f[i + 1][i_289_ + 1];
		    int i_328_ = ((Class_i) this).f[i][i_289_ + 1];
		    if (t == -1) {
			f = E + (y * (float) i_293_ + B * (float) i_325_
				 + q * (float) i_295_);
			if (f <= (float) ((nga) D).M)
			    return;
			f_301_ = E + (y * (float) i_294_ + B * (float) i_326_
				      + q * (float) i_295_);
			if (f_301_ <= (float) ((nga) D).M)
			    return;
			f_302_ = E + (y * (float) i_294_ + B * (float) i_327_
				      + q * (float) i_296_);
			if (f_302_ <= (float) ((nga) D).M)
			    return;
			f_303_ = E + (y * (float) i_293_ + B * (float) i_328_
				      + q * (float) i_296_);
			if (f_303_ <= (float) ((nga) D).M)
			    return;
		    } else {
			f = E + (y * (float) i_293_ + B * (float) i_325_
				 + q * (float) i_295_);
			f_301_ = E + (y * (float) i_294_ + B * (float) i_326_
				      + q * (float) i_295_);
			f_302_ = E + (y * (float) i_294_ + B * (float) i_327_
				      + q * (float) i_296_);
			f_303_ = E + (y * (float) i_293_ + B * (float) i_328_
				      + q * (float) i_296_);
		    }
		    if (bool) {
			int i_329_ = (int) (f - (float) ((lfa) var_lfa).a);
			if (i_329_ > 255)
			    i_329_ = 255;
			if (i_329_ > 0) {
			    i_297_ = i_329_;
			    int i_330_ = ((wt) var_wt).b * i_329_ / 255;
			    if (i_330_ > 0)
				i_325_ -= i_330_;
			}
			i_329_ = (int) (f_301_ - (float) ((lfa) var_lfa).a);
			if (i_329_ > 255)
			    i_329_ = 255;
			if (i_329_ > 0) {
			    i_298_ = i_329_;
			    int i_331_ = ((wt) var_wt).h * i_329_ / 255;
			    if (i_331_ > 0)
				i_326_ -= i_331_;
			}
			i_329_ = (int) (f_302_ - (float) ((lfa) var_lfa).a);
			if (i_329_ > 255)
			    i_329_ = 255;
			if (i_329_ > 0) {
			    i_299_ = i_329_;
			    int i_332_ = ((wt) var_wt).k * i_329_ / 255;
			    if (i_332_ > 0)
				i_327_ -= i_332_;
			}
			i_329_ = (int) (f_303_ - (float) ((lfa) var_lfa).a);
			if (i_329_ > 255)
			    i_329_ = 255;
			if (i_329_ > 0) {
			    i_300_ = i_329_;
			    int i_333_ = ((wt) var_wt).f * i_329_ / 255;
			    if (i_333_ > 0)
				i_328_ -= i_333_;
			}
		    } else if (((lfa) var_lfa).j) {
			int i_334_ = (int) (f - (float) ((lfa) var_lfa).a);
			if (i_334_ > 0) {
			    i_297_ = i_334_;
			    if (i_297_ > 255)
				i_297_ = 255;
			}
			i_334_ = (int) (f_301_ - (float) ((lfa) var_lfa).a);
			if (i_334_ > 0) {
			    i_298_ = i_334_;
			    if (i_298_ > 255)
				i_298_ = 255;
			}
			i_334_ = (int) (f_302_ - (float) ((lfa) var_lfa).a);
			if (i_334_ > 0) {
			    i_299_ = i_334_;
			    if (i_299_ > 255)
				i_299_ = 255;
			}
			i_334_ = (int) (f_303_ - (float) ((lfa) var_lfa).a);
			if (i_334_ > 0) {
			    i_300_ = i_334_;
			    if (i_300_ > 255)
				i_300_ = 255;
			}
		    }
		    if (t == -1) {
			f_304_ = u + (v * (float) i_293_ + A * (float) i_325_
				      + s * (float) i_295_);
			i_305_ = (((jea) var_jea).i
				  + (int) (f_304_ * (float) ((nga) D).L / f));
			f_306_ = r + (G * (float) i_293_ + z * (float) i_325_
				      + p * (float) i_295_);
			i_307_ = (((jea) var_jea).l
				  + (int) (f_306_ * (float) ((nga) D).O / f));
			f_308_ = u + (v * (float) i_294_ + A * (float) i_326_
				      + s * (float) i_295_);
			i_309_
			    = ((jea) var_jea).i + (int) (f_308_
							 * (float) ((nga) D).L
							 / f_301_);
			f_310_ = r + (G * (float) i_294_ + z * (float) i_326_
				      + p * (float) i_295_);
			i_311_
			    = ((jea) var_jea).l + (int) (f_310_
							 * (float) ((nga) D).O
							 / f_301_);
			f_312_ = u + (v * (float) i_294_ + A * (float) i_327_
				      + s * (float) i_296_);
			i_313_
			    = ((jea) var_jea).i + (int) (f_312_
							 * (float) ((nga) D).L
							 / f_302_);
			f_314_ = r + (G * (float) i_294_ + z * (float) i_327_
				      + p * (float) i_296_);
			i_315_
			    = ((jea) var_jea).l + (int) (f_314_
							 * (float) ((nga) D).O
							 / f_302_);
			f_316_ = u + (v * (float) i_293_ + A * (float) i_328_
				      + s * (float) i_296_);
			i_317_
			    = ((jea) var_jea).i + (int) (f_316_
							 * (float) ((nga) D).L
							 / f_303_);
			f_318_ = r + (G * (float) i_293_ + z * (float) i_328_
				      + p * (float) i_296_);
			i_319_
			    = ((jea) var_jea).l + (int) (f_318_
							 * (float) ((nga) D).O
							 / f_303_);
		    } else {
			f_304_ = u + (v * (float) i_293_ + A * (float) i_325_
				      + s * (float) i_295_);
			i_305_
			    = ((jea) var_jea).i + (int) (f_304_
							 * (float) ((nga) D).L
							 / (float) t);
			f_306_ = r + (G * (float) i_293_ + z * (float) i_325_
				      + p * (float) i_295_);
			i_307_
			    = ((jea) var_jea).l + (int) (f_306_
							 * (float) ((nga) D).O
							 / (float) t);
			f_308_ = u + (v * (float) i_294_ + A * (float) i_326_
				      + s * (float) i_295_);
			i_309_
			    = ((jea) var_jea).i + (int) (f_308_
							 * (float) ((nga) D).L
							 / (float) t);
			f_310_ = r + (G * (float) i_294_ + z * (float) i_326_
				      + p * (float) i_295_);
			i_311_
			    = ((jea) var_jea).l + (int) (f_310_
							 * (float) ((nga) D).O
							 / (float) t);
			f_312_ = u + (v * (float) i_294_ + A * (float) i_327_
				      + s * (float) i_296_);
			i_313_
			    = ((jea) var_jea).i + (int) (f_312_
							 * (float) ((nga) D).L
							 / (float) t);
			f_314_ = r + (G * (float) i_294_ + z * (float) i_327_
				      + p * (float) i_296_);
			i_315_
			    = ((jea) var_jea).l + (int) (f_314_
							 * (float) ((nga) D).O
							 / (float) t);
			f_316_ = u + (v * (float) i_293_ + A * (float) i_328_
				      + s * (float) i_296_);
			i_317_
			    = ((jea) var_jea).i + (int) (f_316_
							 * (float) ((nga) D).L
							 / (float) t);
			f_318_ = r + (G * (float) i_293_ + z * (float) i_328_
				      + p * (float) i_296_);
			i_319_
			    = ((jea) var_jea).l + (int) (f_318_
							 * (float) ((nga) D).O
							 / (float) t);
		    }
		}
		boolean bool_335_
		    = (((wt) var_wt).c != -1
		       && b(((vca) ((Class_r) D).j.a(((wt) var_wt).c,
						     (byte) 86)).i));
		if (t == -1) {
		    int i_336_ = i_298_ + i_299_ + i_300_;
		    if (((i_313_ - i_317_) * (i_311_ - i_319_)
			 - (i_315_ - i_319_) * (i_309_ - i_317_))
			> 0) {
			((jea) var_jea).o
			    = (i_313_ < 0 || i_317_ < 0 || i_309_ < 0
			       || i_313_ > ((jea) var_jea).b
			       || i_317_ > ((jea) var_jea).b
			       || i_309_ > ((jea) var_jea).b);
			if (i_336_ < 765) {
			    if (bool_335_)
				((jea) var_jea).q = 100;
			    if (i_336_ > 0) {
				if (((wt) var_wt).c >= 0)
				    var_jea.a(i_315_, i_319_, i_311_, i_313_,
					      i_317_, i_309_, (int) f_302_,
					      (int) f_303_, (int) f_301_,
					      ((lfa) var_lfa).s, i_299_,
					      i_300_, i_298_, ((wt) var_wt).e,
					      ((wt) var_wt).i, ((wt) var_wt).j,
					      (int) f_312_, (int) f_316_,
					      (int) f_308_, (int) f_314_,
					      (int) f_318_, (int) f_310_,
					      (int) f_302_, (int) f_303_,
					      (int) f_301_, ((wt) var_wt).c);
				else
				    var_jea.b
					(i_315_, i_319_, i_311_, i_313_,
					 i_317_, i_309_, (int) f_302_,
					 (int) f_303_, (int) f_301_,
					 pr.a((byte) 117,
					      i_299_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).e),
					 pr.a((byte) 79,
					      i_300_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).i),
					 pr.a((byte) -104,
					      i_298_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).j));
			    } else if (((wt) var_wt).c >= 0)
				var_jea.a(i_315_, i_319_, i_311_, i_313_,
					  i_317_, i_309_, (int) f_302_,
					  (int) f_303_, (int) f_301_,
					  ((wt) var_wt).e, ((wt) var_wt).i,
					  ((wt) var_wt).j, (int) f_312_,
					  (int) f_316_, (int) f_308_,
					  (int) f_314_, (int) f_318_,
					  (int) f_310_, (int) f_302_,
					  (int) f_303_, (int) f_301_,
					  ((wt) var_wt).c);
			    else
				var_jea.b(i_315_, i_319_, i_311_, i_313_,
					  i_317_, i_309_, (int) f_302_,
					  (int) f_303_, (int) f_301_,
					  ((wt) var_wt).e, ((wt) var_wt).i,
					  ((wt) var_wt).j);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_315_, i_319_, i_311_, i_313_, i_317_,
				      i_309_, (int) f_302_, (int) f_303_,
				      (int) f_301_, ((lfa) var_lfa).s);
		    }
		    i_336_ = i_297_ + i_298_ + i_300_;
		    if (((i_305_ - i_309_) * (i_319_ - i_311_)
			 - (i_307_ - i_311_) * (i_317_ - i_309_))
			> 0) {
			((jea) var_jea).o
			    = (i_305_ < 0 || i_309_ < 0 || i_317_ < 0
			       || i_305_ > ((jea) var_jea).b
			       || i_309_ > ((jea) var_jea).b
			       || i_317_ > ((jea) var_jea).b);
			if (i_336_ < 765) {
			    if (bool_335_)
				((jea) var_jea).q = 100;
			    if (i_336_ > 0) {
				if (((wt) var_wt).c >= 0)
				    var_jea.a(i_307_, i_311_, i_319_, i_305_,
					      i_309_, i_317_, (int) f,
					      (int) f_301_, (int) f_303_,
					      ((lfa) var_lfa).s, i_297_,
					      i_298_, i_300_, ((wt) var_wt).d,
					      ((wt) var_wt).j, ((wt) var_wt).i,
					      (int) f_304_, (int) f_308_,
					      (int) f_316_, (int) f_306_,
					      (int) f_310_, (int) f_318_,
					      (int) f, (int) f_301_,
					      (int) f_303_, ((wt) var_wt).c);
				else
				    var_jea.b
					(i_307_, i_311_, i_319_, i_305_,
					 i_309_, i_317_, (int) f, (int) f_301_,
					 (int) f_303_,
					 pr.a((byte) 39,
					      i_297_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).d),
					 pr.a((byte) -104,
					      i_298_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).j),
					 pr.a((byte) 2,
					      i_300_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).i));
			    } else if (((wt) var_wt).c >= 0)
				var_jea.a(i_307_, i_311_, i_319_, i_305_,
					  i_309_, i_317_, (int) f,
					  (int) f_301_, (int) f_303_,
					  ((wt) var_wt).d, ((wt) var_wt).j,
					  ((wt) var_wt).i, (int) f_304_,
					  (int) f_308_, (int) f_316_,
					  (int) f_306_, (int) f_310_,
					  (int) f_318_, (int) f, (int) f_301_,
					  (int) f_303_, ((wt) var_wt).c);
			    else
				var_jea.b(i_307_, i_311_, i_319_, i_305_,
					  i_309_, i_317_, (int) f,
					  (int) f_301_, (int) f_303_,
					  ((wt) var_wt).d, ((wt) var_wt).j,
					  ((wt) var_wt).i);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_307_, i_311_, i_319_, i_305_, i_309_,
				      i_317_, (int) f, (int) f_301_,
				      (int) f_303_, ((lfa) var_lfa).s);
		    }
		} else {
		    int i_337_ = i_298_ + i_299_ + i_300_;
		    if (((i_313_ - i_317_) * (i_311_ - i_319_)
			 - (i_315_ - i_319_) * (i_309_ - i_317_))
			> 0) {
			((jea) var_jea).o
			    = (i_313_ < 0 || i_317_ < 0 || i_309_ < 0
			       || i_313_ > ((jea) var_jea).b
			       || i_317_ > ((jea) var_jea).b
			       || i_309_ > ((jea) var_jea).b);
			if (i_337_ < 765) {
			    if (bool_335_)
				((jea) var_jea).q = 100;
			    if (i_337_ > 0) {
				if (((wt) var_wt).c >= 0)
				    var_jea.a(i_315_, i_319_, i_311_, i_313_,
					      i_317_, i_309_, (int) f_302_,
					      (int) f_303_, (int) f_301_,
					      ((lfa) var_lfa).s, i_299_,
					      i_300_, i_298_, ((wt) var_wt).e,
					      ((wt) var_wt).i, ((wt) var_wt).j,
					      (int) f_312_, (int) f_316_,
					      (int) f_308_, (int) f_314_,
					      (int) f_318_, (int) f_310_, t, t,
					      t, ((wt) var_wt).c);
				else
				    var_jea.b
					(i_315_, i_319_, i_311_, i_313_,
					 i_317_, i_309_, (int) f_302_,
					 (int) f_303_, (int) f_301_,
					 pr.a((byte) -118,
					      i_299_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).e),
					 pr.a((byte) 19,
					      i_300_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).i),
					 pr.a((byte) -106,
					      i_298_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).j));
			    } else if (((wt) var_wt).c >= 0)
				var_jea.a(i_315_, i_319_, i_311_, i_313_,
					  i_317_, i_309_, (int) f_302_,
					  (int) f_303_, (int) f_301_,
					  ((wt) var_wt).e, ((wt) var_wt).i,
					  ((wt) var_wt).j, (int) f_312_,
					  (int) f_316_, (int) f_308_,
					  (int) f_314_, (int) f_318_,
					  (int) f_310_, t, t, t,
					  ((wt) var_wt).c);
			    else
				var_jea.b(i_315_, i_319_, i_311_, i_313_,
					  i_317_, i_309_, (int) f_302_,
					  (int) f_303_, (int) f_301_,
					  ((wt) var_wt).e, ((wt) var_wt).i,
					  ((wt) var_wt).j);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_315_, i_319_, i_311_, i_313_, i_317_,
				      i_309_, (int) f_302_, (int) f_303_,
				      (int) f_301_, ((lfa) var_lfa).s);
		    }
		    i_337_ = i_297_ + i_298_ + i_300_;
		    if (((i_305_ - i_309_) * (i_319_ - i_311_)
			 - (i_307_ - i_311_) * (i_317_ - i_309_))
			> 0) {
			((jea) var_jea).o
			    = (i_305_ < 0 || i_309_ < 0 || i_317_ < 0
			       || i_305_ > ((jea) var_jea).b
			       || i_309_ > ((jea) var_jea).b
			       || i_317_ > ((jea) var_jea).b);
			if (i_337_ < 765) {
			    if (bool_335_)
				((jea) var_jea).q = 100;
			    if (i_337_ > 0) {
				if (((wt) var_wt).c >= 0)
				    var_jea.a(i_307_, i_311_, i_319_, i_305_,
					      i_309_, i_317_, (int) f,
					      (int) f_301_, (int) f_303_,
					      ((lfa) var_lfa).s, i_297_,
					      i_298_, i_300_, ((wt) var_wt).d,
					      ((wt) var_wt).j, ((wt) var_wt).i,
					      (int) f_304_, (int) f_308_,
					      (int) f_316_, (int) f_306_,
					      (int) f_310_, (int) f_318_, t, t,
					      t, ((wt) var_wt).c);
				else
				    var_jea.b
					(i_307_, i_311_, i_319_, i_305_,
					 i_309_, i_317_, (int) f, (int) f_301_,
					 (int) f_303_,
					 pr.a((byte) -108,
					      i_297_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).d),
					 pr.a((byte) 100,
					      i_298_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).j),
					 pr.a((byte) 4,
					      i_300_ << 24 | ((lfa) var_lfa).s,
					      ((wt) var_wt).i));
			    } else if (((wt) var_wt).c >= 0)
				var_jea.a(i_307_, i_311_, i_319_, i_305_,
					  i_309_, i_317_, (int) f,
					  (int) f_301_, (int) f_303_,
					  ((wt) var_wt).d, ((wt) var_wt).j,
					  ((wt) var_wt).i, (int) f_304_,
					  (int) f_308_, (int) f_316_,
					  (int) f_306_, (int) f_310_,
					  (int) f_318_, t, t, t,
					  ((wt) var_wt).c);
			    else
				var_jea.b(i_307_, i_311_, i_319_, i_305_,
					  i_309_, i_317_, (int) f,
					  (int) f_301_, (int) f_303_,
					  ((wt) var_wt).d, ((wt) var_wt).j,
					  ((wt) var_wt).i);
			    ((jea) var_jea).q = 0;
			} else
			    var_jea.a(i_307_, i_311_, i_319_, i_305_, i_309_,
				      i_317_, (int) f, (int) f_301_,
				      (int) f_303_, ((lfa) var_lfa).s);
		    }
		}
	    }
	} else {
	    ap var_ap = o[i][i_289_];
	    if (var_ap != null) {
		if (t == -1) {
		    for (int i_338_ = 0; i_338_ < ((ap) var_ap).c; i_338_++) {
			int i_339_ = (((ap) var_ap).h[i_338_]
				      + (i << ((Class_i) this).g));
			int i_340_ = ((ap) var_ap).i[i_338_];
			int i_341_ = (((ap) var_ap).g[i_338_]
				      + (i_289_ << ((Class_i) this).g));
			float f = E + (y * (float) i_339_ + B * (float) i_340_
				       + q * (float) i_341_);
			if (f <= (float) ((nga) D).M)
			    return;
			is_292_[i_338_] = 0;
			if (bool) {
			    int i_342_ = (int) (f - (float) ((lfa) var_lfa).a);
			    if (i_342_ > 255)
				i_342_ = 255;
			    if (i_342_ > 0) {
				is_292_[i_338_] = i_342_;
				int i_343_
				    = ((ap) var_ap).e[i_338_] * i_342_ / 255;
				if (i_343_ > 0)
				    i_340_ -= i_343_;
			    }
			} else if (((lfa) var_lfa).j) {
			    int i_344_ = (int) (f - (float) ((lfa) var_lfa).a);
			    if (i_344_ > 0) {
				is_292_[i_338_] = i_344_;
				if (is_292_[i_338_] > 255)
				    is_292_[i_338_] = 255;
			    }
			}
			float f_345_
			    = u + (v * (float) i_339_ + A * (float) i_340_
				   + s * (float) i_341_);
			float f_346_
			    = r + (G * (float) i_339_ + z * (float) i_340_
				   + p * (float) i_341_);
			is[i_338_]
			    = (((jea) var_jea).i
			       + (int) (f_345_ * (float) ((nga) D).L / f));
			is_290_[i_338_]
			    = (((jea) var_jea).l
			       + (int) (f_346_ * (float) ((nga) D).O / f));
			is_291_[i_338_] = (int) f;
		    }
		} else {
		    for (int i_347_ = 0; i_347_ < ((ap) var_ap).c; i_347_++) {
			int i_348_ = (((ap) var_ap).h[i_347_]
				      + (i << ((Class_i) this).g));
			int i_349_ = ((ap) var_ap).i[i_347_];
			int i_350_ = (((ap) var_ap).g[i_347_]
				      + (i_289_ << ((Class_i) this).g));
			float f = E + (y * (float) i_348_ + B * (float) i_349_
				       + q * (float) i_350_);
			is_292_[i_347_] = 0;
			if (bool) {
			    int i_351_ = t - ((lfa) var_lfa).a;
			    if (i_351_ > 255)
				i_351_ = 255;
			    if (i_351_ > 0) {
				is_292_[i_347_] = i_351_;
				int i_352_
				    = ((ap) var_ap).e[i_347_] * i_351_ / 255;
				if (i_352_ > 0)
				    i_349_ -= i_352_;
			    }
			} else if (((lfa) var_lfa).j) {
			    int i_353_ = t - ((lfa) var_lfa).a;
			    if (i_353_ > 0) {
				is_292_[i_347_] = i_353_;
				if (is_292_[i_347_] > 255)
				    is_292_[i_347_] = 255;
			    }
			}
			float f_354_
			    = u + (v * (float) i_348_ + A * (float) i_349_
				   + s * (float) i_350_);
			float f_355_
			    = r + (G * (float) i_348_ + z * (float) i_349_
				   + p * (float) i_350_);
			is[i_347_]
			    = ((jea) var_jea).i + (int) (f_354_
							 * (float) ((nga) D).L
							 / (float) t);
			is_290_[i_347_]
			    = ((jea) var_jea).l + (int) (f_355_
							 * (float) ((nga) D).O
							 / (float) t);
			is_291_[i_347_] = (int) f;
		    }
		}
		if (((ap) var_ap).d != null) {
		    int i_356_ = ((Class_i) this).f[i][i_289_];
		    int i_357_ = ((Class_i) this).f[i + 1][i_289_];
		    int i_358_ = ((Class_i) this).f[i][i_289_ + 1];
		    int i_359_ = i * ((Class_i) this).b;
		    int i_360_ = i_359_ + ((Class_i) this).b;
		    int i_361_ = i_289_ * ((Class_i) this).b;
		    int i_362_ = i_361_ + ((Class_i) this).b;
		    float f = u + (v * (float) i_359_ + A * (float) i_356_
				   + s * (float) i_361_);
		    float f_363_ = r + (G * (float) i_359_ + z * (float) i_356_
					+ p * (float) i_361_);
		    float f_364_ = E + (y * (float) i_359_ + B * (float) i_356_
					+ q * (float) i_361_);
		    float f_365_ = u + (v * (float) i_360_ + A * (float) i_357_
					+ s * (float) i_361_);
		    float f_366_ = r + (G * (float) i_360_ + z * (float) i_357_
					+ p * (float) i_361_);
		    float f_367_ = E + (y * (float) i_360_ + B * (float) i_357_
					+ q * (float) i_361_);
		    float f_368_ = u + (v * (float) i_359_ + A * (float) i_358_
					+ s * (float) i_362_);
		    float f_369_ = r + (G * (float) i_359_ + z * (float) i_358_
					+ p * (float) i_362_);
		    float f_370_ = E + (y * (float) i_359_ + B * (float) i_358_
					+ q * (float) i_362_);
		    if (t == -1) {
			for (int i_371_ = 0; i_371_ < ((ap) var_ap).j;
			     i_371_++) {
			    int i_372_ = i_371_ * 3;
			    int i_373_ = i_372_ + 1;
			    int i_374_ = i_373_ + 1;
			    int i_375_ = is[i_372_];
			    int i_376_ = is[i_373_];
			    int i_377_ = is[i_374_];
			    int i_378_ = is_290_[i_372_];
			    int i_379_ = is_290_[i_373_];
			    int i_380_ = is_290_[i_374_];
			    int i_381_ = (is_292_[i_372_] + is_292_[i_373_]
					  + is_292_[i_374_]);
			    if (((i_375_ - i_376_) * (i_380_ - i_379_)
				 - (i_378_ - i_379_) * (i_377_ - i_376_))
				> 0) {
				((jea) var_jea).o
				    = (i_375_ < 0 || i_376_ < 0 || i_377_ < 0
				       || i_375_ > ((jea) var_jea).b
				       || i_376_ > ((jea) var_jea).b
				       || i_377_ > ((jea) var_jea).b);
				short i_382_ = ((ap) var_ap).d[i_371_];
				if (i_381_ < 765) {
				    if (i_382_ != -1
					&& b(((vca) ((Class_r) D).j
							.a(i_382_, (byte) 86))
					     .i))
					((jea) var_jea).q = 100;
				    if (i_381_ > 0) {
					if (i_382_ != -1)
					    var_jea.a(i_378_, i_379_, i_380_,
						      i_375_, i_376_, i_377_,
						      is_291_[i_372_],
						      is_291_[i_373_],
						      is_291_[i_374_],
						      ((lfa) var_lfa).s,
						      is_292_[i_372_],
						      is_292_[i_373_],
						      is_292_[i_374_],
						      ((ap) var_ap).b[i_372_],
						      ((ap) var_ap).b[i_373_],
						      ((ap) var_ap).b[i_374_],
						      (int) f, (int) f_365_,
						      (int) f_368_,
						      (int) f_363_,
						      (int) f_366_,
						      (int) f_369_,
						      (int) f_364_,
						      (int) f_367_,
						      (int) f_370_, i_382_);
					else if ((((ap) var_ap).b[i_372_]
						  & 0xffffff)
						 != 0)
					    var_jea.b
						(i_378_, i_379_, i_380_,
						 i_375_, i_376_, i_377_,
						 is_291_[i_372_],
						 is_291_[i_373_],
						 is_291_[i_374_],
						 pr.a((byte) -105,
						      (is_292_[i_372_] << 24
						       | ((lfa) var_lfa).s),
						      ((ap) var_ap).b[i_372_]),
						 pr.a((byte) -127,
						      (is_292_[i_373_] << 24
						       | ((lfa) var_lfa).s),
						      ((ap) var_ap).b[i_373_]),
						 pr.a((byte) 127,
						      (is_292_[i_374_] << 24
						       | ((lfa) var_lfa).s),
						      (((ap) var_ap).b
						       [i_374_])));
				    } else if (i_382_ != -1)
					var_jea.a(i_378_, i_379_, i_380_,
						  i_375_, i_376_, i_377_,
						  is_291_[i_372_],
						  is_291_[i_373_],
						  is_291_[i_374_],
						  ((ap) var_ap).b[i_372_],
						  ((ap) var_ap).b[i_373_],
						  ((ap) var_ap).b[i_374_],
						  (int) f, (int) f_365_,
						  (int) f_368_, (int) f_363_,
						  (int) f_366_, (int) f_369_,
						  (int) f_364_, (int) f_367_,
						  (int) f_370_, i_382_);
				    else if ((((ap) var_ap).b[i_372_]
					      & 0xffffff)
					     != 0)
					var_jea.b(i_378_, i_379_, i_380_,
						  i_375_, i_376_, i_377_,
						  is_291_[i_372_],
						  is_291_[i_373_],
						  is_291_[i_374_],
						  ((ap) var_ap).b[i_372_],
						  ((ap) var_ap).b[i_373_],
						  ((ap) var_ap).b[i_374_]);
				    ((jea) var_jea).q = 0;
				} else
				    var_jea.a(i_378_, i_379_, i_380_, i_375_,
					      i_376_, i_377_, is_291_[i_372_],
					      is_291_[i_373_], is_291_[i_374_],
					      ((lfa) var_lfa).s);
			    }
			}
		    } else {
			for (int i_383_ = 0; i_383_ < ((ap) var_ap).j;
			     i_383_++) {
			    int i_384_ = i_383_ * 3;
			    int i_385_ = i_384_ + 1;
			    int i_386_ = i_385_ + 1;
			    int i_387_ = is[i_384_];
			    int i_388_ = is[i_385_];
			    int i_389_ = is[i_386_];
			    int i_390_ = is_290_[i_384_];
			    int i_391_ = is_290_[i_385_];
			    int i_392_ = is_290_[i_386_];
			    int i_393_ = (is_292_[i_384_] + is_292_[i_385_]
					  + is_292_[i_386_]);
			    if (((i_387_ - i_388_) * (i_392_ - i_391_)
				 - (i_390_ - i_391_) * (i_389_ - i_388_))
				> 0) {
				((jea) var_jea).o
				    = (i_387_ < 0 || i_388_ < 0 || i_389_ < 0
				       || i_387_ > ((jea) var_jea).b
				       || i_388_ > ((jea) var_jea).b
				       || i_389_ > ((jea) var_jea).b);
				short i_394_ = ((ap) var_ap).d[i_383_];
				if (i_393_ < 765) {
				    if (i_394_ != -1
					&& b(((vca) ((Class_r) D).j
							.a(i_394_, (byte) 86))
					     .i))
					((jea) var_jea).q = 100;
				    if (i_393_ > 0) {
					if (i_394_ != -1)
					    var_jea.a(i_390_, i_391_, i_392_,
						      i_387_, i_388_, i_389_,
						      is_291_[i_384_],
						      is_291_[i_385_],
						      is_291_[i_386_],
						      ((lfa) var_lfa).s,
						      is_292_[i_384_],
						      is_292_[i_385_],
						      is_292_[i_386_],
						      ((ap) var_ap).b[i_384_],
						      ((ap) var_ap).b[i_385_],
						      ((ap) var_ap).b[i_386_],
						      (int) f, (int) f_365_,
						      (int) f_368_,
						      (int) f_363_,
						      (int) f_366_,
						      (int) f_369_, t, t, t,
						      i_394_);
					else if ((((ap) var_ap).b[i_384_]
						  & 0xffffff)
						 != 0)
					    var_jea.b
						(i_390_, i_391_, i_392_,
						 i_387_, i_388_, i_389_,
						 is_291_[i_384_],
						 is_291_[i_385_],
						 is_291_[i_386_],
						 pr.a((byte) 70,
						      (is_292_[i_384_] << 24
						       | ((lfa) var_lfa).s),
						      ((ap) var_ap).b[i_384_]),
						 pr.a((byte) -119,
						      (is_292_[i_385_] << 24
						       | ((lfa) var_lfa).s),
						      ((ap) var_ap).b[i_385_]),
						 pr.a((byte) 21,
						      (is_292_[i_386_] << 24
						       | ((lfa) var_lfa).s),
						      (((ap) var_ap).b
						       [i_386_])));
				    } else if (i_394_ != -1)
					var_jea.a(i_390_, i_391_, i_392_,
						  i_387_, i_388_, i_389_,
						  is_291_[i_384_],
						  is_291_[i_385_],
						  is_291_[i_386_],
						  ((ap) var_ap).b[i_384_],
						  ((ap) var_ap).b[i_385_],
						  ((ap) var_ap).b[i_386_],
						  (int) f, (int) f_365_,
						  (int) f_368_, (int) f_363_,
						  (int) f_366_, (int) f_369_,
						  t, t, t, i_394_);
				    else if ((((ap) var_ap).b[i_384_]
					      & 0xffffff)
					     != 0)
					var_jea.b(i_390_, i_391_, i_392_,
						  i_387_, i_388_, i_389_,
						  is_291_[i_384_],
						  is_291_[i_385_],
						  is_291_[i_386_],
						  ((ap) var_ap).b[i_384_],
						  ((ap) var_ap).b[i_385_],
						  ((ap) var_ap).b[i_386_]);
				    ((jea) var_jea).q = 0;
				} else
				    var_jea.a(i_390_, i_391_, i_392_, i_387_,
					      i_388_, i_389_, is_291_[i_384_],
					      is_291_[i_385_], is_291_[i_386_],
					      ((lfa) var_lfa).s);
			    }
			}
		    }
		} else {
		    for (int i_395_ = 0; i_395_ < ((ap) var_ap).j; i_395_++) {
			int i_396_ = i_395_ * 3;
			int i_397_ = i_396_ + 1;
			int i_398_ = i_397_ + 1;
			int i_399_ = is[i_396_];
			int i_400_ = is[i_397_];
			int i_401_ = is[i_398_];
			int i_402_ = is_290_[i_396_];
			int i_403_ = is_290_[i_397_];
			int i_404_ = is_290_[i_398_];
			int i_405_ = (is_292_[i_396_] + is_292_[i_397_]
				      + is_292_[i_398_]);
			if (((i_399_ - i_400_) * (i_404_ - i_403_)
			     - (i_402_ - i_403_) * (i_401_ - i_400_))
			    > 0) {
			    ((jea) var_jea).o
				= (i_399_ < 0 || i_400_ < 0 || i_401_ < 0
				   || i_399_ > ((jea) var_jea).b
				   || i_400_ > ((jea) var_jea).b
				   || i_401_ > ((jea) var_jea).b);
			    if (i_405_ < 765) {
				if (i_405_ > 0) {
				    if ((((ap) var_ap).b[i_396_] & 0xffffff)
					!= 0)
					var_jea.b
					    (i_402_, i_403_, i_404_, i_399_,
					     i_400_, i_401_, is_291_[i_396_],
					     is_291_[i_397_], is_291_[i_398_],
					     mk.a(is_292_[i_396_], true,
						  ((lfa) var_lfa).s,
						  ((ap) var_ap).b[i_396_]),
					     mk.a(is_292_[i_397_], true,
						  ((lfa) var_lfa).s,
						  ((ap) var_ap).b[i_397_]),
					     mk.a(is_292_[i_398_], true,
						  ((lfa) var_lfa).s,
						  ((ap) var_ap).b[i_398_]));
				} else if ((((ap) var_ap).b[i_396_] & 0xffffff)
					   != 0)
				    var_jea.b(i_402_, i_403_, i_404_, i_399_,
					      i_400_, i_401_, is_291_[i_396_],
					      is_291_[i_397_], is_291_[i_398_],
					      ((ap) var_ap).b[i_396_],
					      ((ap) var_ap).b[i_397_],
					      ((ap) var_ap).b[i_398_]);
			    } else
				var_jea.a(i_402_, i_403_, i_404_, i_399_,
					  i_400_, i_401_, is_291_[i_396_],
					  is_291_[i_397_], is_291_[i_398_],
					  ((lfa) var_lfa).s);
			}
		    }
		}
	    }
	}
    }
}
