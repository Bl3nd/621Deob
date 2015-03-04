/* fo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fo extends f
{
    static int a;
    private int b;
    static int c;
    static int d;
    private int e = 0;
    static int f;
    static int g;
    private en h;
    private int i = 0;
    static int j;
    static int k;
    private ls l;
    static int m;
    private boolean n;
    static int o;
    static int p;
    static int q;
    static boolean r = false;
    private int s;
    private boolean t;
    static int u;
    static int v;
    private int w;
    static byte[][][] x;
    static int y;
    private boolean z;
    private boolean A;
    static int B;
    private boolean C = false;
    static int D;
    private int E;
    
    private final void a(int i, int i_0_, int i_1_, int i_2_, int[] is,
			 int i_3_, int i_4_) {
	q++;
	l.a(i_3_, (byte) 75, i_4_, is, i, i_1_, i_2_, i_0_);
    }
    
    final void a(int i, int i_5_, ua var_ua, int i_6_, int i_7_) {
	j++;
	ao var_ao = (ao) var_ua;
	ls var_ls = ((ao) var_ao).ls;
	i_5_ += w;
	i += e;
	l.a(eg.T, 15590);
	h.d((byte) 71);
	h.a(l, 0);
	h.a((byte) 28, (int) 1);
	h.f(1, 0);
	mga var_mga = h.Y(12083);
	var_mga.b((float) s, 18543, (float) b, 0.0F);
	var_mga.U(i, i_5_, 0);
	h.T(-78);
	mga var_mga_8_ = h.E(101);
	var_mga_8_.b(l.a(false, (float) s), 18543, l.a((float) b, (byte) -59),
		     1.0F);
	h.a(117, at.ki);
	h.e(0, 1);
	h.a(var_ls, 0);
	h.a(ku.k, true, Class_rf.e);
	h.a(0, 1, bu.u);
	mga var_mga_9_ = h.E(118);
	var_mga_9_.b(var_ls.a(false, (float) s), 18543,
		     var_ls.a((float) b, (byte) -59), 1.0F);
	var_mga_9_.a(var_ls.a(false, (float) (i - i_6_)), 0.0F,
		     var_ls.a((float) (i_5_ - i_7_), (byte) -59), (byte) 95);
	h.a(116, at.ki);
	h.y(9);
	h.j((byte) -70);
	h.a(0, 1, mca.l);
	h.a(Class_rf.e, true, Class_rf.e);
	h.a((hfa) null, 0);
	h.e(0, 0);
	h.j((byte) -70);
    }
    
    final void YA(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
		  int i_15_, int i_16_) {
	d++;
	mga var_mga = h.Y(12083);
	mga var_mga_17_ = h.E(85);
	l.a(A || z || (i_16_ & 0x1) == 0 ? eg.T : dda.d, 15590);
	h.d((byte) 47);
	h.a(l, 0);
	h.a((byte) 28, i_15_);
	h.f(i_13_, 0);
	h.a(1, 1, ik.o);
	h.a(1, ik.o, -18836);
	h.c((byte) 48, i_14_);
	var_mga_17_.b(l.a(false, (float) s), 18543, l.a((float) b, (byte) -59),
		      1.0F);
	if (C) {
	    i_11_ = i_11_ * s / A();
	    i_12_ = b * i_12_ / ca();
	    i += i_11_ * e / s;
	    i_10_ += i_12_ * w / b;
	}
	var_mga.b((float) i_11_, 18543, (float) i_12_, 0.0F);
	var_mga.U(i, i_10_, 0);
	h.a(108, at.ki);
	h.T(117);
	h.y(9);
	h.j((byte) -70);
	h.a(1, 1, bu.u);
	h.a(1, bu.u, -18836);
    }
    
    final void V(int i, int i_18_, int i_19_, int i_20_, int i_21_) {
	a++;
	mga var_mga = h.Y(12083);
	mga var_mga_22_ = h.E(95);
	i_18_ += w;
	i += e;
	l.a(eg.T, 15590);
	h.d((byte) 41);
	h.a(l, 0);
	h.a((byte) 28, i_21_);
	h.f(i_19_, 0);
	h.a(1, 1, ik.o);
	h.a(1, ik.o, -18836);
	h.c((byte) 48, i_20_);
	var_mga.b((float) s, 18543, (float) b, 0.0F);
	var_mga.U(i, i_18_, 0);
	var_mga_22_.b(l.a(false, (float) s), 18543, l.a((float) b, (byte) -59),
		      1.0F);
	h.a(118, at.ki);
	h.T(-69);
	h.y(9);
	h.j((byte) -70);
	h.a(1, 1, bu.u);
	h.a(1, bu.u, -18836);
    }
    
    final void da(int i, int i_23_, int i_24_, int i_25_, int i_26_,
		  int i_27_) {
	y++;
	int[] is = h.h(i_26_, i_27_, i_24_, i_25_);
	if (is != null) {
	    for (int i_28_ = 0; is.length > i_28_; i_28_++)
		is[i_28_] = hba.bitwiseArg1ORArg2(is[i_28_], -16777216);
	    a(i, i_23_, i_24_, i_25_, is, 0, i_24_);
	}
    }
    
    public static void a(int i) {
	if (i != 1)
	    a(null, -63, (byte) -84, 112, -86, 37);
	x = null;
    }
    
    final void xa(int i, int i_29_, int i_30_) {
	D++;
    }
    
    final void qa(float f, float f_31_, float f_32_, float f_33_, float f_34_,
		  float f_35_, int i, int i_36_, int i_37_, int i_38_) {
	u++;
	mga var_mga = h.Y(12083);
	mga var_mga_39_ = h.E(90);
	l.a(A || z || (0x1 & i_38_) == 0 ? eg.T : dda.d, 15590);
	h.d((byte) 113);
	h.a(l, 0);
	h.a((byte) 28, i_37_);
	h.f(i, 0);
	h.a(1, 1, ik.o);
	h.a(1, ik.o, -18836);
	h.c((byte) 48, i_36_);
	if (C) {
	    float f_40_ = (float) A();
	    float f_41_ = (float) ca();
	    float f_42_ = (f_32_ - f) / f_40_;
	    float f_43_ = (f_33_ - f_31_) / f_40_;
	    float f_44_ = (f_34_ - f) / f_41_;
	    float f_45_ = (f_35_ - f_31_) / f_41_;
	    float f_46_ = (float) w * f_44_;
	    float f_47_ = (float) w * f_45_;
	    float f_48_ = (float) e * f_42_;
	    float f_49_ = f_43_ * (float) e;
	    float f_50_ = -f_42_ * (float) this.i;
	    float f_51_ = (float) this.i * -f_43_;
	    float f_52_ = (float) E * -f_44_;
	    f = f_48_ + f + f_46_;
	    f_32_ = f_32_ + f_50_ + f_46_;
	    float f_53_ = (float) E * -f_45_;
	    f_34_ = f_48_ + f_34_ + f_52_;
	    f_33_ = f_47_ + (f_33_ + f_51_);
	    f_31_ = f_47_ + (f_31_ + f_49_);
	    f_35_ = f_53_ + (f_49_ + f_35_);
	}
	var_mga.a(1.0F, f_34_ - f, 0.0F, 0.0F, f_32_ - f, 0.0F, f_33_ - f_31_,
		  0.0F, f_35_ - f_31_, false);
	var_mga.a(f, 0.0F, f_31_, (byte) -82);
	var_mga_39_.b(l.a(false, (float) s), 18543, l.a((float) b, (byte) -59),
		      1.0F);
	h.a(101, at.ki);
	h.T(115);
	h.y(9);
	h.j((byte) -70);
	h.a(1, 1, bu.u);
	h.a(1, bu.u, -18836);
    }
    
    final int A() {
	f++;
	return i + s + e;
    }
    
    final void Q(int i, int i_54_, int i_55_, int i_56_) {
	e = i;
	w = i_54_;
	k++;
	E = i_56_;
	this.i = i_55_;
	C = e != 0 || w != 0 || this.i != 0 || E != 0;
    }
    
    final int u() {
	o++;
	return b;
    }
    
    final void a(float f, float f_57_, float f_58_, float f_59_, float f_60_,
		 float f_61_, int i, ua var_ua, int i_62_, int i_63_) {
	B++;
	mga var_mga = h.Y(12083);
	mga var_mga_64_ = h.E(96);
	ao var_ao = (ao) var_ua;
	ls var_ls = ((ao) var_ao).ls;
	l.a(!A && !z && (i & 0x1) != 0 ? dda.d : eg.T, 15590);
	h.d((byte) 25);
	h.a(l, 0);
	h.a((byte) 28, (int) 1);
	h.f(1, 0);
	if (!C) {
	    var_mga.a(1.0F, f_60_ - f, 0.0F, 0.0F, f_58_ - f, 0.0F,
		      f_59_ - f_57_, 0.0F, f_61_ - f_57_, false);
	    var_mga.a(f, 0.0F, f_57_, (byte) -105);
	} else {
	    float f_65_ = (float) s / (float) A();
	    float f_66_ = (float) b / (float) ca();
	    var_mga.a(1.0F, f_66_ * (f_60_ - f), 0.0F, 0.0F,
		      f_65_ * (f_58_ - f), 0.0F, f_65_ * (f_59_ - f_57_), 0.0F,
		      (f_61_ - f_57_) * f_66_, false);
	    var_mga.a(f_65_ * ((float) e + f), 0.0F,
		      f_66_ * (f_57_ + (float) w), (byte) 97);
	}
	var_mga_64_.b(l.a(false, (float) s), 18543, l.a((float) b, (byte) -59),
		      1.0F);
	h.a(124, at.ki);
	h.e(0, 1);
	h.a(var_ls, 0);
	h.a(ku.k, true, Class_rf.e);
	h.a(0, 1, bu.u);
	mga var_mga_67_ = h.E(92);
	var_mga_67_.M(var_mga);
	var_mga_67_.U(-i_62_, -i_63_, 0);
	var_mga_67_.a((byte) 103, var_ls.a(false, 1.0F),
		      var_ls.a(1.0F, (byte) -59), 1.0F);
	h.a(120, at.ki);
	h.T(-28);
	h.y(9);
	h.j((byte) -70);
	h.a(0, 1, mca.l);
	h.a(Class_rf.e, true, Class_rf.e);
	h.a((hfa) null, 0);
	h.e(0, 0);
	h.j((byte) -70);
    }
    
    final void DA(int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_,
		  int i_73_) {
	m++;
	mga var_mga = h.Y(12083);
	mga var_mga_74_ = h.E(124);
	l.a(eg.T, 15590);
	h.d((byte) 127);
	h.a(l, 0);
	h.a((byte) 28, i_73_);
	h.f(i_71_, 0);
	h.a(1, 1, ik.o);
	h.a(1, ik.o, -18836);
	h.c((byte) 48, i_72_);
	boolean bool = n && w == 0 && E == 0;
	boolean bool_75_ = t && e == 0 && this.i == 0;
	if (!(bool & bool_75_)) {
	    if (!bool_75_) {
		if (!bool) {
		    int i_76_ = i_70_ + i_68_;
		    int i_77_ = i_69_ + i;
		    int i_78_ = A();
		    int i_79_ = ca();
		    int i_80_ = w + i_68_;
		    int i_81_ = i_80_ + b;
		    while (i_76_ >= i_81_) {
			var_mga_74_.b(l.a(false, (float) s), 18543,
				      l.a((float) b, (byte) -59), 1.0F);
			h.a(110, at.ki);
			int i_82_ = i + e;
			for (int i_83_ = i_82_ + s; i_77_ >= i_83_;
			     i_83_ += i_78_) {
			    var_mga.b((float) s, 18543, (float) b, 0.0F);
			    var_mga.U(i_82_, i_80_, 0);
			    h.T(-65);
			    h.y(9);
			    i_82_ += i_78_;
			}
			if (i_82_ < i_77_) {
			    int i_84_ = i_77_ - i_82_;
			    var_mga_74_.b(l.a(false, (float) i_84_), 18543,
					  l.a((float) b, (byte) -59), 1.0F);
			    h.a(118, at.ki);
			    var_mga.b((float) i_84_, 18543, (float) b, 0.0F);
			    var_mga.U(i_82_, i_80_, 0);
			    h.T(-10);
			    h.y(9);
			}
			i_81_ += i_79_;
			i_80_ += i_79_;
		    }
		    if (i_80_ < i_76_) {
			int i_85_ = i_76_ - i_80_;
			var_mga_74_.b(l.a(false, (float) s), 18543,
				      l.a((float) i_85_, (byte) -59), 1.0F);
			h.a(119, at.ki);
			int i_86_ = i + e;
			for (int i_87_ = s + i_86_; i_77_ >= i_87_;
			     i_87_ += i_78_) {
			    var_mga.b((float) s, 18543, (float) i_85_, 0.0F);
			    var_mga.U(i_86_, i_80_, 0);
			    h.T(122);
			    h.y(9);
			    i_86_ += i_78_;
			}
			if (i_86_ < i_77_) {
			    int i_88_ = i_77_ - i_86_;
			    var_mga_74_.b(l.a(false, (float) i_88_), 18543,
					  l.a((float) i_85_, (byte) -59),
					  1.0F);
			    h.a(108, at.ki);
			    var_mga.b((float) i_88_, 18543, (float) i_85_,
				      0.0F);
			    var_mga.U(i_86_, i_80_, 0);
			    h.T(-96);
			    h.y(9);
			}
		    }
		} else {
		    int i_89_ = i + i_69_;
		    int i_90_ = A();
		    var_mga_74_.b(l.a(false, (float) s), 18543,
				  l.a((float) i_70_, (byte) -59), 1.0F);
		    h.a(118, at.ki);
		    int i_91_ = i + e;
		    int i_92_ = i_91_ + s;
		    while (i_92_ <= i_89_) {
			var_mga.b((float) s, 18543, (float) i_70_, 0.0F);
			var_mga.U(i_91_, i_68_, 0);
			h.T(118);
			h.y(9);
			i_92_ += i_90_;
			i_91_ += i_90_;
		    }
		    if (i_89_ > i_91_) {
			int i_93_ = i_89_ - i_91_;
			var_mga_74_.b(l.a(false, (float) i_93_), 18543,
				      l.a((float) i_70_, (byte) -59), 1.0F);
			h.a(101, at.ki);
			var_mga.b((float) i_93_, 18543, (float) i_70_, 0.0F);
			var_mga.U(i_91_, i_68_, 0);
			h.T(-56);
			h.y(9);
		    }
		}
	    } else {
		int i_94_ = i_70_ + i_68_;
		int i_95_ = ca();
		var_mga_74_.b(l.a(false, (float) i_69_), 18543,
			      l.a((float) b, (byte) -59), 1.0F);
		h.a(108, at.ki);
		int i_96_ = i_68_ + w;
		int i_97_ = i_96_ + b;
		while (i_94_ >= i_97_) {
		    var_mga.b((float) i_69_, 18543, (float) b, 0.0F);
		    var_mga.U(i, i_96_, 0);
		    h.T(121);
		    h.y(9);
		    i_97_ += i_95_;
		    i_96_ += i_95_;
		}
		if (i_94_ > i_96_) {
		    int i_98_ = i_94_ - i_96_;
		    var_mga_74_.b(l.a(false, (float) i_69_), 18543,
				  l.a((float) i_98_, (byte) -59), 1.0F);
		    h.a(110, at.ki);
		    var_mga.b((float) i_69_, 18543, (float) i_98_, 0.0F);
		    var_mga.U(i, i_96_, 0);
		    h.T(-113);
		    h.y(9);
		}
	    }
	} else {
	    var_mga_74_.b(l.a(false, (float) i_69_), 18543,
			  l.a((float) i_70_, (byte) -59), 1.0F);
	    var_mga.b((float) i_69_, 18543, (float) i_70_, 0.0F);
	    var_mga.U(i, i_68_, 0);
	    h.a(119, at.ki);
	    h.T(118);
	    h.y(9);
	}
	h.j((byte) -70);
	h.a(1, 1, bu.u);
	h.a(1, bu.u, -18836);
    }
    
    static final boolean a(byte[] is, int i, byte i_99_, int i_100_,
			   int i_101_, int i_102_) {
	p++;
	boolean bool = true;
	BytesParser var_es = new BytesParser(is);
	int i_103_ = -1;
	int i_104_ = 88 % ((27 - i_99_) / 36);
	for (;;) {
	    int i_105_ = var_es.i((byte) -16);
	    if (i_105_ == 0)
		break;
	    i_103_ += i_105_;
	    int i_106_ = 0;
	    boolean bool_107_ = false;
	    for (;;) {
		if (!bool_107_) {
		    int i_108_ = var_es.readSmart2(-13829);
		    if (i_108_ == 0)
			break;
		    i_106_ += i_108_ - 1;
		    int i_109_ = 0x3f & i_106_;
		    int i_110_ = 0x3f & i_106_ >> 6;
		    int i_111_ = var_es.readUnsignedByte(-9268) >> 2;
		    int i_112_ = i_110_ + i;
		    int i_113_ = i_109_ + i_101_;
		    if (i_112_ > 0 && i_113_ > 0 && i_112_ < i_100_ - 1
			&& i_113_ < i_102_ - 1) {
			ObjectDef var_bda = ul.k.getObjectDef((byte) 31, i_103_);
			if (i_111_ != 22 || ((jb) cs.g).ab
			    || ((ObjectDef) var_bda).jb != 0
			    || ((ObjectDef) var_bda).ab == 1 || ((ObjectDef) var_bda).D) {
			    bool_107_ = true;
			    if (!var_bda.b((byte) -102)) {
				pp.q++;
				bool = false;
			    }
			}
		    }
		} else {
		    int i_114_ = var_es.readSmart2(-13829);
		    if (i_114_ == 0)
			break;
		    var_es.readUnsignedByte(-9268);
		}
	    }
	}
	return bool;
    }
    
    final int ca() {
	v++;
	return E + w + b;
    }
    
    final int E() {
	c++;
	return s;
    }
    
    fo(en var_en, int i, int i_115_, boolean bool) {
	w = 0;
	E = 0;
	b = i_115_;
	h = var_en;
	s = i;
	l = var_en.a(1, !bool ? uca.d : nda.h, i, i_115_, bt.g);
	l.a((byte) -81, true, true);
	A = i != l.a((byte) 110);
	z = i_115_ != l.b(-3537);
	t = !A && l.a(true);
	n = !z && l.a(true);
    }
    
    fo(en var_en, int i, int i_116_, int[] is, int i_117_, int i_118_) {
	w = 0;
	E = 0;
	s = i;
	h = var_en;
	b = i_116_;
	l = var_en.a(is, 3, false, i_118_, i_117_, i, i_116_);
	l.a((byte) -81, true, true);
	A = i != l.a((byte) 60);
	z = i_116_ != l.b(-3537);
	t = !A && l.a(true);
	n = !z && l.a(true);
    }
}
