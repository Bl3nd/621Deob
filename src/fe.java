/* fe - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fe extends mm
{
    private short A;
    private short D;
    private short E;
    private short F;
    private short G;
    private int H;
    private short I;
    private int J;
    fp K;
    
    final void a(Class_r class_r, long l) {
	int i = ((mm) this).w >> Class_fb.a + 12;
	int i_0_ = ((mm) this).r >> Class_fb.a + 12;
	int i_1_ = ((mm) this).t >> 12;
	if (i_1_ > 0 || i_1_ < -262144 || i < 0 || i >= sv.T || i_0_ < 0
	    || i_0_ >= nf.H)
	    a();
	else {
	    tq var_tq = ((fp) ((fe) this).K).t;
	    ce var_ce = ((fp) ((fe) this).K).o;
	    Class_i[] class_is = Class_q.b;
	    int i_2_ = ((tq) var_tq).v;
	    vf var_vf = ol.p[((tq) var_tq).v][i][i_0_];
	    if (var_vf != null)
		i_2_ = ((vf) var_vf).j;
	    int i_3_ = class_is[i_2_].a(i_0_, (byte) 51, i);
	    int i_4_;
	    if (i_2_ < dfa.G - 1)
		i_4_ = class_is[i_2_ + 1].a(i_0_, (byte) 51, i);
	    else
		i_4_ = i_3_ - (8 << Class_fb.a);
	    if (((ce) var_ce).k) {
		if (((ce) var_ce).F == -1 && i_1_ > i_3_) {
		    a();
		    return;
		}
		if (((ce) var_ce).F >= 0
		    && i_1_ > class_is[((ce) var_ce).F].a(i_0_, (byte) 51,
							  i)) {
		    a();
		    return;
		}
		if (((ce) var_ce).lb == -1 && i_1_ < i_4_) {
		    a();
		    return;
		}
		if (((ce) var_ce).lb >= 0
		    && i_1_ < class_is[((ce) var_ce).lb + 1].a(i_0_, (byte) 51,
							       i)) {
		    a();
		    return;
		}
	    }
	    int i_5_;
	    for (i_5_ = dfa.G - 1;
		 i_5_ > 0 && i_1_ > class_is[i_5_].a(i_0_, (byte) 51, i);
		 i_5_--) {
		/* empty */
	    }
	    if (((ce) var_ce).Z && i_5_ == 0
		&& i_1_ > class_is[0].a(i_0_, (byte) 51, i))
		a();
	    else if (i_5_ == dfa.G - 1
		     && (class_is[i_5_].a(i_0_, (byte) 51, i) - i_1_
			 > 8 << Class_fb.a))
		a();
	    else {
		var_vf = ol.p[i_5_][i][i_0_];
		if (var_vf == null) {
		    if (i_5_ == 0 || ol.p[0][i][i_0_] == null)
			var_vf = ol.p[0][i][i_0_] = new vf(0);
		    boolean bool = ((vf) ol.p[0][i][i_0_]).e != null;
		    if (i_5_ == 3 && bool) {
			a();
			return;
		    }
		    for (int i_6_ = 1; i_6_ <= i_5_; i_6_++) {
			if (ol.p[i_6_][i][i_0_] == null) {
			    var_vf = ol.p[i_6_][i][i_0_] = new vf(i_6_);
			    if (bool)
				((vf) var_vf).j++;
			}
		    }
		}
		if (((ce) var_ce).x) {
		    int i_7_ = ((mm) this).w >> 12;
		    int i_8_ = ((mm) this).r >> 12;
		    if (((vf) var_vf).l != null) {
			sd var_sd = ((vf) var_vf).l.a(class_r, -1660704056);
			if (var_sd != null
			    && var_sd.a(i_7_, i_8_, -41, i_1_)) {
			    a();
			    return;
			}
		    }
		    if (((vf) var_vf).h != null) {
			sd var_sd = ((vf) var_vf).h.a(class_r, -1660704056);
			if (var_sd != null && var_sd.a(i_7_, i_8_, 5, i_1_)) {
			    a();
			    return;
			}
		    }
		    if (((vf) var_vf).m != null) {
			sd var_sd = ((vf) var_vf).m.a(class_r, -1660704056);
			if (var_sd != null
			    && var_sd.a(i_7_, i_8_, 126, i_1_)) {
			    a();
			    return;
			}
		    }
		    for (ida var_ida = ((vf) var_vf).f; var_ida != null;
			 var_ida = ((ida) var_ida).d) {
			sd var_sd = ((ida) var_ida).a.a(class_r, -1660704056);
			if (var_sd != null
			    && var_sd.a(i_7_, i_8_, -51, i_1_)) {
			    a();
			    return;
			}
		    }
		}
		((ir) ((tq) var_tq).t).a.a((byte) 126, this);
	    }
	}
    }
    
    final void a(long l, int i) {
	E -= i;
	if (E <= 0)
	    a();
	else {
	    int i_9_ = ((mm) this).w >> 12;
	    int i_10_ = ((mm) this).t >> 12;
	    int i_11_ = ((mm) this).r >> 12;
	    tq var_tq = ((fp) ((fe) this).K).t;
	    ce var_ce = ((fp) ((fe) this).K).o;
	    if (((ce) var_ce).eb != 0) {
		if (D - E <= ((ce) var_ce).s) {
		    int i_12_ = ((((mm) this).p >> 8 & 0xff00)
				 + (H >> 16 & 0xff) + ((ce) var_ce).hb * i);
		    int i_13_ = ((((mm) this).p & 0xff00) + (H >> 8 & 0xff)
				 + ((ce) var_ce).z * i);
		    int i_14_ = ((((mm) this).p << 8 & 0xff00) + (H & 0xff)
				 + ((ce) var_ce).d * i);
		    if (i_12_ < 0)
			i_12_ = 0;
		    else if (i_12_ > 65535)
			i_12_ = 65535;
		    if (i_13_ < 0)
			i_13_ = 0;
		    else if (i_13_ > 65535)
			i_13_ = 65535;
		    if (i_14_ < 0)
			i_14_ = 0;
		    else if (i_14_ > 65535)
			i_14_ = 65535;
		    ((mm) this).p &= ~0xffffff;
		    ((mm) this).p
			|= (((i_12_ & 0xff00) << 8) + (i_13_ & 0xff00)
			    + ((i_14_ & 0xff00) >> 8));
		    H &= ~0xffffff;
		    H |= (((i_12_ & 0xff) << 16) + ((i_13_ & 0xff) << 8)
			  + (i_14_ & 0xff));
		}
		if (D - E <= ((ce) var_ce).jb) {
		    int i_15_ = ((((mm) this).p >> 16 & 0xff00)
				 + (H >> 24 & 0xff) + ((ce) var_ce).V * i);
		    if (i_15_ < 0)
			i_15_ = 0;
		    else if (i_15_ > 65535)
			i_15_ = 65535;
		    ((mm) this).p &= 0xffffff;
		    ((mm) this).p |= (i_15_ & 0xff00) << 16;
		    H &= 0xffffff;
		    H |= (i_15_ & 0xff) << 24;
		}
	    }
	    if (((ce) var_ce).g != -1 && D - E <= ((ce) var_ce).fb)
		J += ((ce) var_ce).W * i;
	    if (((ce) var_ce).K != -1 && D - E <= ((ce) var_ce).O)
		((mm) this).o += ((ce) var_ce).b * i;
	    double d = (double) G;
	    double d_16_ = (double) I;
	    double d_17_ = (double) A;
	    boolean bool = false;
	    if (((ce) var_ce).w == 1) {
		int i_18_ = i_9_ - ((hs) ((fp) ((fe) this).K).l).a;
		int i_19_ = i_10_ - ((hs) ((fp) ((fe) this).K).l).q;
		int i_20_ = i_11_ - ((hs) ((fp) ((fe) this).K).l).i;
		int i_21_
		    = ((int) Math.sqrt((double) (i_18_ * i_18_ + i_19_ * i_19_
						 + i_20_ * i_20_))
		       >> 2);
		long l_22_ = (long) (((ce) var_ce).qb * i_21_ * i);
		J -= (long) J * l_22_ >> 18;
	    } else if (((ce) var_ce).w == 2) {
		int i_23_ = i_9_ - ((hs) ((fp) ((fe) this).K).l).a;
		int i_24_ = i_10_ - ((hs) ((fp) ((fe) this).K).l).q;
		int i_25_ = i_11_ - ((hs) ((fp) ((fe) this).K).l).i;
		int i_26_ = i_23_ * i_23_ + i_24_ * i_24_ + i_25_ * i_25_;
		long l_27_ = (long) (((ce) var_ce).qb * i_26_ * i);
		J -= (long) J * l_27_ >> 28;
	    }
	    if (((ce) var_ce).J != null) {
		Node class_d = ((Class_ae) ((tq) var_tq).p).o;
		for (Node class_d_28_ = ((Node) class_d).previous;
		     class_d_28_ != class_d;
		     class_d_28_ = ((Node) class_d_28_).previous) {
		    mt var_mt = (mt) class_d_28_;
		    vj var_vj = ((mt) var_mt).v;
		    if (((vj) var_vj).b != 1) {
			boolean bool_29_ = false;
			for (int i_30_ = 0; i_30_ < ((ce) var_ce).J.length;
			     i_30_++) {
			    if (((ce) var_ce).J[i_30_] == ((vj) var_vj).j) {
				bool_29_ = true;
				break;
			    }
			}
			if (bool_29_) {
			    double d_31_ = (double) (i_9_ - ((mt) var_mt).s);
			    double d_32_ = (double) (i_10_ - ((mt) var_mt).z);
			    double d_33_ = (double) (i_11_ - ((mt) var_mt).u);
			    double d_34_ = (d_31_ * d_31_ + d_32_ * d_32_
					    + d_33_ * d_33_);
			    if (!(d_34_ > (double) ((vj) var_vj).q)) {
				double d_35_ = Math.sqrt(d_34_);
				if (d_35_ == 0.0)
				    d_35_ = 1.0;
				double d_36_
				    = ((d_31_ * (double) ((mt) var_mt).y
					+ d_32_ * (double) ((vj) var_vj).o
					+ d_33_ * (double) ((mt) var_mt).t)
				       * 65535.0
				       / ((double) ((vj) var_vj).p * d_35_));
				if (!(d_36_ < (double) ((vj) var_vj).i)) {
				    double d_37_ = 0.0;
				    if (((vj) var_vj).l == 1)
					d_37_ = (d_35_ / 16.0
						 * (double) ((vj) var_vj).h);
				    else if (((vj) var_vj).l == 2)
					d_37_ = (d_35_ / 16.0 * (d_35_ / 16.0)
						 * (double) ((vj) var_vj).h);
				    if (((vj) var_vj).k == 0) {
					if (((vj) var_vj).g == 0) {
					    d += ((double) ((mt) var_mt).y
						  - d_37_) * (double) i;
					    d_16_ += ((double) ((vj) var_vj).o
						      - d_37_) * (double) i;
					    d_17_ += ((double) ((mt) var_mt).t
						      - d_37_) * (double) i;
					    bool = true;
					} else {
					    ((mm) this).w
						+= ((double) ((mt) var_mt).y
						    - d_37_) * (double) i;
					    ((mm) this).t
						+= ((double) ((vj) var_vj).o
						    - d_37_) * (double) i;
					    ((mm) this).r
						+= ((double) ((mt) var_mt).t
						    - d_37_) * (double) i;
					}
				    } else {
					double d_38_
					    = (d_31_ / d_35_
					       * (double) ((vj) var_vj).p);
					double d_39_
					    = (d_32_ / d_35_
					       * (double) ((vj) var_vj).p);
					double d_40_
					    = (d_33_ / d_35_
					       * (double) ((vj) var_vj).p);
					if (((vj) var_vj).g == 0) {
					    d += d_38_ * (double) i;
					    d_16_ += d_39_ * (double) i;
					    d_17_ += d_40_ * (double) i;
					    bool = true;
					} else {
					    ((mm) this).w
						+= d_38_ * (double) i;
					    ((mm) this).t
						+= d_39_ * (double) i;
					    ((mm) this).r
						+= d_40_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (((ce) var_ce).H != null) {
		for (int i_41_ = 0; i_41_ < ((ce) var_ce).H.length; i_41_++) {
		    mt var_mt = (mt) io.J.a(-1, (long) ((ce) var_ce).H[i_41_]);
		    while (var_mt != null) {
			vj var_vj = ((mt) var_mt).v;
			double d_42_ = (double) (i_9_ - ((mt) var_mt).s);
			double d_43_ = (double) (i_10_ - ((mt) var_mt).z);
			double d_44_ = (double) (i_11_ - ((mt) var_mt).u);
			double d_45_
			    = d_42_ * d_42_ + d_43_ * d_43_ + d_44_ * d_44_;
			if (d_45_ > (double) ((vj) var_vj).q)
			    var_mt = (mt) io.J.b(23986);
			else {
			    double d_46_ = Math.sqrt(d_45_);
			    if (d_46_ == 0.0)
				d_46_ = 1.0;
			    double d_47_
				= ((d_42_ * (double) ((mt) var_mt).y
				    + d_43_ * (double) ((vj) var_vj).o
				    + d_44_ * (double) ((mt) var_mt).t)
				   * 65535.0
				   / ((double) ((vj) var_vj).p * d_46_));
			    if (d_47_ < (double) ((vj) var_vj).i)
				var_mt = (mt) io.J.b(23986);
			    else {
				double d_48_ = 0.0;
				if (((vj) var_vj).l == 1)
				    d_48_ = (d_46_ / 16.0
					     * (double) ((vj) var_vj).h);
				else if (((vj) var_vj).l == 2)
				    d_48_ = (d_46_ / 16.0 * (d_46_ / 16.0)
					     * (double) ((vj) var_vj).h);
				if (((vj) var_vj).k == 0) {
				    if (((vj) var_vj).g == 0) {
					d += ((double) ((mt) var_mt).y
					      - d_48_) * (double) i;
					d_16_ += ((double) ((vj) var_vj).o
						  - d_48_) * (double) i;
					d_17_ += ((double) ((mt) var_mt).t
						  - d_48_) * (double) i;
					bool = true;
				    } else {
					((mm) this).w
					    += ((double) ((mt) var_mt).y
						- d_48_) * (double) i;
					((mm) this).t
					    += ((double) ((vj) var_vj).o
						- d_48_) * (double) i;
					((mm) this).r
					    += ((double) ((mt) var_mt).t
						- d_48_) * (double) i;
				    }
				} else {
				    double d_49_
					= (d_42_ / d_46_
					   * (double) ((vj) var_vj).p);
				    double d_50_
					= (d_43_ / d_46_
					   * (double) ((vj) var_vj).p);
				    double d_51_
					= (d_44_ / d_46_
					   * (double) ((vj) var_vj).p);
				    if (((vj) var_vj).g == 0) {
					d += d_49_ * (double) i;
					d_16_ += d_50_ * (double) i;
					d_17_ += d_51_ * (double) i;
					bool = true;
				    } else {
					((mm) this).w += d_49_ * (double) i;
					((mm) this).t += d_50_ * (double) i;
					((mm) this).r += d_51_ * (double) i;
				    }
				}
				var_mt = (mt) io.J.b(23986);
			    }
			}
		    }
		}
	    }
	    if (((ce) var_ce).ub != null) {
		if (((ce) var_ce).Q == null) {
		    ((ce) var_ce).Q = new int[((ce) var_ce).ub.length];
		    for (int i_52_ = 0; i_52_ < ((ce) var_ce).ub.length;
			 i_52_++) {
			ha.a(((ce) var_ce).ub[i_52_], false);
			((ce) var_ce).Q[i_52_]
			    = (((GameInPacketHandler) (GameInPacketHandler)
				gh.P.a(-32748, (long) ((ce) var_ce).ub[i_52_]))
			       .k);
		    }
		}
		for (int i_53_ = 0; i_53_ < ((ce) var_ce).Q.length; i_53_++) {
		    vj var_vj = mu.m[((ce) var_ce).Q[i_53_]];
		    if (((vj) var_vj).g == 0) {
			d += (double) (((vj) var_vj).n * i);
			d_16_ += (double) (((vj) var_vj).o * i);
			d_17_ += (double) (((vj) var_vj).d * i);
			bool = true;
		    } else {
			((mm) this).w += ((vj) var_vj).n * i;
			((mm) this).t += ((vj) var_vj).o * i;
			((mm) this).r += ((vj) var_vj).d * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_16_ > 32767.0 || d_17_ > 32767.0
		       || d < -32767.0 || d_16_ < -32767.0
		       || d_17_ < -32767.0) {
		    d /= 2.0;
		    d_16_ /= 2.0;
		    d_17_ /= 2.0;
		    J <<= 1;
		}
		G = (short) (int) d;
		I = (short) (int) d_16_;
		A = (short) (int) d_17_;
	    }
	    ((mm) this).w += ((long) G * (long) (J << 2) >> 23) * (long) i;
	    ((mm) this).t += ((long) I * (long) (J << 2) >> 23) * (long) i;
	    ((mm) this).r += ((long) A * (long) (J << 2) >> 23) * (long) i;
	}
    }
    
    final void a() {
	((tq) ((fp) ((fe) this).K).t).n[F] = null;
	pp.m[sw.e] = this;
	sw.e = sw.e + 1 & 0x3ff;
	this.b(2);
	this.a(10511);
    }
    
    private final void b() {
	int i = ((tq) ((fp) ((fe) this).K).t).l;
	if (((tq) ((fp) ((fe) this).K).t).n[i] != null)
	    ((tq) ((fp) ((fe) this).K).t).n[i].a();
	((tq) ((fp) ((fe) this).K).t).n[i] = this;
	F = (short) ((tq) ((fp) ((fe) this).K).t).l;
	((tq) ((fp) ((fe) this).K).t).l = i + 1 & 0x1fff;
	((fp) ((fe) this).K).v.a(this, 80);
    }
    
    final void a(fp var_fp, int i, int i_54_, int i_55_, int i_56_, int i_57_,
		 int i_58_, int i_59_, int i_60_, int i_61_, int i_62_,
		 int i_63_, boolean bool, boolean bool_64_) {
	((fe) this).K = var_fp;
	((mm) this).w = i << 12;
	((mm) this).t = i_54_ << 12;
	((mm) this).r = i_55_ << 12;
	((mm) this).p = i_61_;
	D = E = (short) i_60_;
	((mm) this).o = i_62_;
	((mm) this).C = i_63_;
	((mm) this).n = bool_64_;
	G = (short) i_56_;
	I = (short) i_57_;
	A = (short) i_58_;
	J = i_59_;
	((mm) this).u = ((hi) ((fp) ((fe) this).K).h).q;
	b();
    }
    
    fe(fp var_fp, int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_,
       int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool,
       boolean bool_75_) {
	((fe) this).K = var_fp;
	((mm) this).w = i << 12;
	((mm) this).t = i_65_ << 12;
	((mm) this).r = i_66_ << 12;
	((mm) this).p = i_72_;
	D = E = (short) i_71_;
	((mm) this).o = i_73_;
	((mm) this).C = i_74_;
	((mm) this).n = bool_75_;
	G = (short) i_67_;
	I = (short) i_68_;
	A = (short) i_69_;
	J = i_70_;
	((mm) this).u = ((hi) ((fp) ((fe) this).K).h).q;
	b();
    }
}
