/* Class_i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_i
{
    static int a;
    int b;
    static int c;
    static int d;
    static int e;
    int[][] f;
    int g;
    static int h;
    static int[] i;
    int j;
    int k;
    static int l = -50;
    
    abstract boolean a(ha var_ha, int i, int i_0_, int i_1_, int i_2_,
		       boolean bool);
    
    static final void a(int i, byte i_3_) {
	e++;
	sr.U.a(true, i);
	gea.m.a(true, i);
	up.D.a(true, i);
	if (i_3_ != 70)
	    a(70, (byte) -41);
	up.K.a(true, i);
    }
    
    abstract void BA();
    
    final int a(int i, byte i_4_, int i_5_) {
	if (i_4_ != 51)
	    return 67;
	h++;
	return ((Class_i) this).f[i_5_][i];
    }
    
    public static void a(byte i) {
	Class_i.i = null;
	if (i <= 98)
	    l = 92;
    }
    
    abstract void a(int i, int i_6_, int i_7_);
    
    abstract void a(gga var_gga, int[] is);
    
    static final void a(int i) {
	c++;
	if (i != 2)
	    a((int) 108);
	for (int i_8_ = 0; i_8_ < vu.j; i_8_++)
	    Class_ob.p[i_8_] = null;
	vu.j = 0;
	for (int i_9_ = 0; i_9_ < dfa.G; i_9_++) {
	    for (int i_10_ = 0; sv.T > i_10_; i_10_++) {
		for (int i_11_ = 0; nf.H > i_11_; i_11_++) {
		    vf var_vf = ol.p[i_9_][i_11_][i_10_];
		    if (var_vf != null) {
			if (((vf) var_vf).o > 0)
			    ((vf) var_vf).o *= -1;
			if (((vf) var_vf).n > 0)
			    ((vf) var_vf).n *= -1;
		    }
		}
	    }
	}
	for (int i_12_ = 0; i_12_ < dfa.G; i_12_++) {
	    for (int i_13_ = 0; sv.T > i_13_; i_13_++) {
		for (int i_14_ = 0; i_14_ < nf.H; i_14_++) {
		    vf var_vf = ol.p[i_12_][i_14_][i_13_];
		    if (var_vf != null) {
			boolean bool
			    = (ol.p[0][i_14_][i_13_] != null
			       && ((vf) ol.p[0][i_14_][i_13_]).e != null);
			if (((vf) var_vf).o < 0) {
			    int i_15_ = i_13_;
			    int i_16_ = i_13_;
			    int i_17_ = i_12_;
			    int i_18_ = i_12_;
			    vf var_vf_19_ = ol.p[i_12_][i_14_][i_15_ - 1];
			    int i_20_;
			    for (i_20_
				     = vr.b[i_12_].a(i_13_, (byte) 51, i_14_);
				 (i_15_ > 0 && var_vf_19_ != null
				  && ((vf) var_vf_19_).o < 0
				  && ((vf) var_vf_19_).o == ((vf) var_vf).o
				  && ((vf) var_vf).k == ((vf) var_vf_19_).k
				  && i_20_ == vr.b[i_12_].a(i_15_ - 1,
							    (byte) 51, i_14_));
				 var_vf_19_ = ol.p[i_12_][i_14_][i_15_ - 1]) {
				if (i_15_ - 1 > 0
				    && vr.b[i_12_].a(i_15_ - 2, (byte) 51,
						     i_14_) != i_20_)
				    break;
				i_15_--;
			    }
			    for (var_vf_19_ = ol.p[i_12_][i_14_][i_16_ + 1];
				 (nf.H > i_16_ && var_vf_19_ != null
				  && ((vf) var_vf_19_).o < 0
				  && ((vf) var_vf).o == ((vf) var_vf_19_).o
				  && ((vf) var_vf).k == ((vf) var_vf_19_).k);
				 var_vf_19_ = ol.p[i_12_][i_14_][i_16_ + 1]) {
				if (vr.b[i_12_].a(i_16_ + 1, (byte) 51, i_14_)
				    != i_20_)
				    break;
				if (i_16_ + 1 < nf.H
				    && vr.b[i_12_].a(i_16_ + 2, (byte) 51,
						     i_14_) != i_20_)
				    break;
				i_16_++;
			    }
			while_52_:
			    for (/**/; i_17_ > 0; i_17_--) {
				for (int i_21_ = i_15_; i_16_ >= i_21_;
				     i_21_++) {
				    if (ol.p[i_17_ - 1][i_14_][i_21_] == null
					|| (((vf) var_vf).o
					    != ((vf) (ol.p[i_17_ - 1][i_14_]
						      [i_21_])).o)
					|| (((vf) var_vf).k
					    != ((vf) (ol.p[i_17_ - 1][i_14_]
						      [i_21_])).k))
					break while_52_;
				}
			    }
			while_53_:
			    for (/**/; i_18_ < dfa.G - 1; i_18_++) {
				for (int i_22_ = i_15_; i_16_ >= i_22_;
				     i_22_++) {
				    if (ol.p[i_18_ + 1][i_14_][i_22_] == null
					|| (((vf)
					     ol.p[i_18_ + 1][i_14_][i_22_]).o
					    != ((vf) var_vf).o)
					|| (((vf)
					     ol.p[i_18_ + 1][i_14_][i_22_]).k
					    != ((vf) var_vf).k))
					break while_53_;
				}
			    }
			    int i_23_ = -i_17_ + 1 + i_18_;
			    int i_24_ = vr.b[bool ? i_17_ + 1 : i_17_]
					    .a(i_15_, (byte) 51, i_14_);
			    int i_25_ = i_23_ * ((vf) var_vf).o + i_24_;
			    int i_26_ = vr.b[bool ? i_17_ + 1 : i_17_]
					    .a(i_16_ + 1, (byte) 51, i_14_);
			    int i_27_ = ((vf) var_vf).o * i_23_ + i_26_;
			    int i_28_ = i_14_ << Class_fb.a;
			    int i_29_ = i_15_ << Class_fb.a;
			    int i_30_ = (i_16_ << Class_fb.a) + bea.o;
			    Class_ob.p[vu.j++]
				= new hv(1, i_18_, i_28_ + ((vf) var_vf).k,
					 i_28_ + ((vf) var_vf).k,
					 ((vf) var_vf).k + i_28_,
					 ((vf) var_vf).k + i_28_, i_24_, i_26_,
					 i_27_, i_25_, i_29_, i_30_, i_30_,
					 i_29_);
			    for (int i_31_ = i_17_; i_31_ <= i_18_; i_31_++) {
				for (int i_32_ = i_15_; i_16_ >= i_32_;
				     i_32_++)
				    ((vf) ol.p[i_31_][i_14_][i_32_]).o *= -1;
			    }
			}
			if (((vf) var_vf).n < 0) {
			    int i_33_ = i_14_;
			    int i_34_ = i_14_;
			    int i_35_ = i_12_;
			    int i_36_ = i_12_;
			    vf var_vf_37_ = ol.p[i_12_][i_33_ - 1][i_13_];
			    int i_38_;
			    for (i_38_
				     = vr.b[i_12_].a(i_13_, (byte) 51, i_14_);
				 (i_33_ > 0 && var_vf_37_ != null
				  && ((vf) var_vf_37_).n < 0
				  && ((vf) var_vf).n == ((vf) var_vf_37_).n
				  && ((vf) var_vf_37_).i == ((vf) var_vf).i
				  && vr.b[i_12_].a(i_13_, (byte) 51,
						   i_33_ - 1) == i_38_);
				 var_vf_37_ = ol.p[i_12_][i_33_ - 1][i_13_]) {
				if (i_33_ - 1 > 0
				    && vr.b[i_12_].a(i_13_, (byte) 51,
						     i_33_ - 2) != i_38_)
				    break;
				i_33_--;
			    }
			    for (var_vf_37_ = ol.p[i_12_][i_34_ + 1][i_13_];
				 (sv.T > i_34_ && var_vf_37_ != null
				  && ((vf) var_vf_37_).n < 0
				  && ((vf) var_vf_37_).n == ((vf) var_vf).n
				  && ((vf) var_vf_37_).i == ((vf) var_vf).i);
				 var_vf_37_ = ol.p[i_12_][i_34_ + 1][i_13_]) {
				if (i_38_ != vr.b[i_12_].a(i_13_, (byte) 51,
							   i_34_ + 1))
				    break;
				if (i_34_ + 1 < sv.T
				    && vr.b[i_12_].a(i_13_, (byte) 51,
						     i_34_ + 2) != i_38_)
				    break;
				i_34_++;
			    }
			while_54_:
			    for (/**/; i_35_ > 0; i_35_--) {
				for (int i_39_ = i_33_; i_34_ >= i_39_;
				     i_39_++) {
				    if (ol.p[i_35_ - 1][i_39_][i_13_] == null
					|| (((vf)
					     ol.p[i_35_ - 1][i_39_][i_13_]).n
					    != ((vf) var_vf).n)
					|| (((vf)
					     ol.p[i_35_ - 1][i_39_][i_13_]).i
					    != ((vf) var_vf).i))
					break while_54_;
				}
			    }
			while_55_:
			    for (/**/; i_36_ < dfa.G - 1; i_36_++) {
				for (int i_40_ = i_33_; i_34_ >= i_40_;
				     i_40_++) {
				    if (ol.p[i_36_ + 1][i_40_][i_13_] == null
					|| (((vf) var_vf).n
					    != ((vf) (ol.p[i_36_ + 1][i_40_]
						      [i_13_])).n)
					|| (((vf) var_vf).i
					    != ((vf) (ol.p[i_36_ + 1][i_40_]
						      [i_13_])).i))
					break while_55_;
				}
			    }
			    int i_41_ = i_36_ - i_35_ + 1;
			    int i_42_ = vr.b[!bool ? i_35_ : i_35_ + 1]
					    .a(i_13_, (byte) 51, i_33_);
			    int i_43_ = i_41_ * ((vf) var_vf).n + i_42_;
			    int i_44_ = vr.b[!bool ? i_35_ : i_35_ + 1]
					    .a(i_13_, (byte) 51, i_34_ + 1);
			    int i_45_ = i_41_ * ((vf) var_vf).n + i_44_;
			    int i_46_ = i_33_ << Class_fb.a;
			    int i_47_ = bea.o + (i_34_ << Class_fb.a);
			    int i_48_ = i_13_ << Class_fb.a;
			    Class_ob.p[vu.j++]
				= new hv(2, i_36_, i_46_, i_47_, i_47_, i_46_,
					 i_42_, i_44_, i_45_, i_43_,
					 i_48_ + ((vf) var_vf).i,
					 ((vf) var_vf).i + i_48_,
					 ((vf) var_vf).i + i_48_,
					 ((vf) var_vf).i + i_48_);
			    for (int i_49_ = i_35_; i_49_ <= i_36_; i_49_++) {
				for (int i_50_ = i_33_; i_50_ <= i_34_;
				     i_50_++)
				    ((vf) ol.p[i_49_][i_50_][i_13_]).n *= -1;
			    }
			}
		    }
		}
	    }
	}
	js.o = true;
    }
    
    abstract ha v(int i, int i_51_, ha var_ha);
    
    final int a(int i, int i_52_, boolean bool) {
	d++;
	if (bool != true)
	    return -5;
	int i_53_ = i_52_ >> ((Class_i) this).g;
	int i_54_ = i >> ((Class_i) this).g;
	if (i_53_ < 0 || i_54_ < 0 || i_53_ > ((Class_i) this).k - 1
	    || ((Class_i) this).j - 1 < i_54_)
	    return 0;
	int i_55_ = ((Class_i) this).b - 1 & i_52_;
	int i_56_ = i & ((Class_i) this).b - 1;
	int i_57_
	    = (((((Class_i) this).b - i_55_) * ((Class_i) this).f[i_53_][i_54_]
		+ ((Class_i) this).f[i_53_ + 1][i_54_] * i_55_)
	       >> ((Class_i) this).g);
	int i_58_ = ((((((Class_i) this).b - i_55_)
		       * ((Class_i) this).f[i_53_][i_54_ + 1])
		      + i_55_ * ((Class_i) this).f[i_53_ + 1][i_54_ + 1])
		     >> ((Class_i) this).g);
	return (i_56_ * i_58_ + (((Class_i) this).b - i_56_) * i_57_
		>> ((Class_i) this).g);
    }
    
    abstract void E(ha var_ha, int i, int i_59_, int i_60_, int i_61_,
		    boolean bool);
    
    abstract void a(int i, int i_62_, int i_63_, boolean[][] bools,
		    boolean bool, int i_64_);
    
    abstract void DA(ha var_ha, int i, int i_65_, int i_66_, int i_67_,
		     boolean bool);
    
    abstract void a(int i, int i_68_, int i_69_, int i_70_, int i_71_,
		    int i_72_, int i_73_, boolean[][] bools);
    
    abstract void a(int i, int i_74_, int[] is, int[] is_75_, int[] is_76_,
		    int[] is_77_, int[] is_78_, int[] is_79_, int[] is_80_,
		    int[] is_81_, int[] is_82_, int[] is_83_, int[] is_84_,
		    int i_85_, int i_86_, int i_87_, boolean bool);
    
    abstract void O(int i, int i_88_, int[] is, int[] is_89_, int[] is_90_,
		    int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_,
		    int[] is_95_, int i_96_, int i_97_, int i_98_,
		    boolean bool);
    
    abstract void a(int i, int i_99_, int i_100_, boolean[][] bools,
		    boolean bool);
    
    abstract void a(int i, int i_101_);
    
    Class_i(int i, int i_102_, int i_103_, int[][] is) {
	((Class_i) this).j = i_102_;
	((Class_i) this).k = i;
	int i_104_ = 0;
	for (/**/; i_103_ > 1; i_103_ >>= 1)
	    i_104_++;
	((Class_i) this).b = 1 << i_104_;
	((Class_i) this).f = is;
	((Class_i) this).g = i_104_;
    }
}
