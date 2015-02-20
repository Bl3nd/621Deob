/* qp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class qp extends f
{
    static int a;
    nga b;
    static int c;
    private static int d;
    private static int e;
    int f;
    static int g = 0;
    static int h;
    private static int i;
    static int j = 0;
    int k;
    static int l = 0;
    static int m;
    static int n;
    int o;
    private int[] p;
    int q;
    private static int r;
    static int s;
    private static int t;
    static int u;
    static int v;
    static int w;
    private static int x = 0;
    static int y;
    static int z;
    static int A;
    static int B;
    int C;
    static int D;
    int E;
    static int F;
    static int G;
    
    final int A() {
	return ((qp) this).E + ((qp) this).k + ((qp) this).q;
    }
    
    final int ca() {
	return ((qp) this).f + ((qp) this).o + ((qp) this).C;
    }
    
    abstract void a(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    int i_5_, int i_6_, int i_7_);
    
    final void DA(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
		  int i_13_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	if (p == null)
	    p = new int[4];
	((qp) this).b.oa(p);
	((qp) this).b.V(((nga) ((qp) this).b).Y, ((nga) ((qp) this).b).u,
			i + i_9_, i_8_ + i_10_);
	int i_14_ = A();
	int i_15_ = ca();
	int i_16_ = (i_9_ + i_14_ - 1) / i_14_;
	int i_17_ = (i_10_ + i_15_ - 1) / i_15_;
	for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
	    int i_19_ = i_18_ * i_15_;
	    for (int i_20_ = 0; i_20_ < i_16_; i_20_++)
		V(i + i_20_ * i_14_, i_8_ + i_19_, i_11_, i_12_, i_13_);
	}
	((qp) this).b.da(p[0], p[1], p[2], p[3]);
    }
    
    final void Q(int i, int i_21_, int i_22_, int i_23_) {
	((qp) this).E = i;
	((qp) this).f = i_21_;
	((qp) this).q = i_22_;
	((qp) this).C = i_23_;
    }
    
    final void a(float f, float f_24_, float f_25_, float f_26_, float f_27_,
		 float f_28_, int i, ua var_ua, int i_29_, int i_30_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	if (a(f, f_24_, f_25_, f_26_, f_27_, f_28_)) {
	    nu var_nu = (nu) var_ua;
	    a(((nu) var_nu).g, ((nu) var_nu).k, d - i_29_, -i_30_ - (F - e));
	}
    }
    
    abstract void a(int i, int i_31_, ua var_ua, int i_32_, int i_33_);
    
    private final boolean a(float f, float f_34_, float f_35_, float f_36_,
			    float f_37_, float f_38_) {
	int i = ((qp) this).E + ((qp) this).k + ((qp) this).q;
	int i_39_ = ((qp) this).f + ((qp) this).o + ((qp) this).C;
	if (i != ((qp) this).k || i_39_ != ((qp) this).o) {
	    float f_40_ = (f_35_ - f) / (float) i;
	    float f_41_ = (f_36_ - f_34_) / (float) i;
	    float f_42_ = (f_37_ - f) / (float) i_39_;
	    float f_43_ = (f_38_ - f_34_) / (float) i_39_;
	    float f_44_ = f_42_ * (float) ((qp) this).f;
	    float f_45_ = f_43_ * (float) ((qp) this).f;
	    float f_46_ = f_40_ * (float) ((qp) this).E;
	    float f_47_ = f_41_ * (float) ((qp) this).E;
	    float f_48_ = -f_40_ * (float) ((qp) this).q;
	    float f_49_ = -f_41_ * (float) ((qp) this).q;
	    float f_50_ = -f_42_ * (float) ((qp) this).C;
	    float f_51_ = -f_43_ * (float) ((qp) this).C;
	    f += f_46_ + f_44_;
	    f_34_ += f_47_ + f_45_;
	    f_35_ += f_48_ + f_44_;
	    f_36_ += f_49_ + f_45_;
	    f_37_ += f_46_ + f_50_;
	    f_38_ += f_47_ + f_51_;
	}
	float f_52_ = f_37_ + (f_35_ - f);
	float f_53_ = f_36_ + (f_38_ - f_34_);
	float f_54_;
	float f_55_;
	if (f < f_35_) {
	    f_54_ = f;
	    f_55_ = f_35_;
	} else {
	    f_54_ = f_35_;
	    f_55_ = f;
	}
	if (f_37_ < f_54_)
	    f_54_ = f_37_;
	if (f_52_ < f_54_)
	    f_54_ = f_52_;
	if (f_37_ > f_55_)
	    f_55_ = f_37_;
	if (f_52_ > f_55_)
	    f_55_ = f_52_;
	float f_56_;
	float f_57_;
	if (f_34_ < f_36_) {
	    f_56_ = f_34_;
	    f_57_ = f_36_;
	} else {
	    f_56_ = f_36_;
	    f_57_ = f_34_;
	}
	if (f_38_ < f_56_)
	    f_56_ = f_38_;
	if (f_53_ < f_56_)
	    f_56_ = f_53_;
	if (f_38_ > f_57_)
	    f_57_ = f_38_;
	if (f_53_ > f_57_)
	    f_57_ = f_53_;
	if (f_54_ < (float) ((nga) ((qp) this).b).Y)
	    f_54_ = (float) ((nga) ((qp) this).b).Y;
	if (f_55_ > (float) ((nga) ((qp) this).b).B)
	    f_55_ = (float) ((nga) ((qp) this).b).B;
	if (f_56_ < (float) ((nga) ((qp) this).b).u)
	    f_56_ = (float) ((nga) ((qp) this).b).u;
	if (f_57_ > (float) ((nga) ((qp) this).b).cb)
	    f_57_ = (float) ((nga) ((qp) this).b).cb;
	f_55_ = f_54_ - f_55_;
	if (f_55_ >= 0.0F)
	    return false;
	f_57_ = f_56_ - f_57_;
	if (f_57_ >= 0.0F)
	    return false;
	u = ((nga) ((qp) this).b).C;
	v = (int) ((float) ((int) f_56_ * u) + f_54_);
	float f_58_
	    = (f_35_ - f) * (f_38_ - f_34_) - (f_36_ - f_34_) * (f_37_ - f);
	float f_59_
	    = (f_37_ - f) * (f_36_ - f_34_) - (f_38_ - f_34_) * (f_35_ - f);
	h = (int) ((f_38_ - f_34_) * 4096.0F * (float) ((qp) this).k / f_58_);
	n = (int) ((f_36_ - f_34_) * 4096.0F * (float) ((qp) this).o / f_59_);
	m = (int) ((f_37_ - f) * 4096.0F * (float) ((qp) this).k / f_59_);
	G = (int) ((f_35_ - f) * 4096.0F * (float) ((qp) this).o / f_58_);
	r = (int) (f_54_ * 16.0F + 8.0F
		   - (f + f_35_ + f_37_ + f_52_) / 4.0F * 16.0F);
	t = (int) (f_56_ * 16.0F + 8.0F
		   - (f_34_ + f_36_ + f_38_ + f_53_) / 4.0F * 16.0F);
	B = (((qp) this).k >> 1 << 12) + (t * m >> 4);
	z = (((qp) this).o >> 1 << 12) + (t * G >> 4);
	a = r * h >> 4;
	c = r * n >> 4;
	d = (int) f_54_;
	y = (int) f_55_;
	e = (int) f_56_;
	F = (int) f_57_;
	return true;
    }
    
    abstract void V(int i, int i_60_, int i_61_, int i_62_, int i_63_);
    
    final void qa(float f, float f_64_, float f_65_, float f_66_, float f_67_,
		  float f_68_, int i, int i_69_, int i_70_, int i_71_) {
	if (((qp) this).b.E())
	    throw new IllegalStateException();
	if (a(f, f_64_, f_65_, f_66_, f_67_, f_68_)) {
	    w = i_69_;
	    if (i != 1) {
		D = i_69_ >>> 24;
		s = 256 - D;
		if (i == 0) {
		    l = (i_69_ & 0xff0000) >> 16;
		    g = (i_69_ & 0xff00) >> 8;
		    A = i_69_ & 0xff;
		} else if (i == 2) {
		    qp.i = i_69_ >>> 24;
		    x = 256 - qp.i;
		    int i_72_ = (i_69_ & 0xff00ff) * x & ~0xff00ff;
		    int i_73_ = (i_69_ & 0xff00) * x & 0xff0000;
		    j = (i_72_ | i_73_) >>> 8;
		}
	    }
	    if (i == 1) {
		if (i_70_ == 0)
		    b(1, 0);
		else if (i_70_ == 1)
		    b(1, 1);
		else if (i_70_ == 2)
		    b(1, 2);
	    } else if (i == 0) {
		if (i_70_ == 0)
		    b(0, 0);
		else if (i_70_ == 1)
		    b(0, 1);
		else if (i_70_ == 2)
		    b(0, 2);
	    } else if (i == 3) {
		if (i_70_ == 0)
		    b(3, 0);
		else if (i_70_ == 1)
		    b(3, 1);
		else if (i_70_ == 2)
		    b(3, 2);
	    } else if (i == 2) {
		if (i_70_ == 0)
		    b(2, 0);
		else if (i_70_ == 1)
		    b(2, 1);
		else if (i_70_ == 2)
		    b(2, 2);
	    }
	}
    }
    
    final int E() {
	return ((qp) this).k;
    }
    
    final int u() {
	return ((qp) this).o;
    }
    
    abstract void a(int[] is, int[] is_74_, int i, int i_75_);
    
    abstract void YA(int i, int i_76_, int i_77_, int i_78_, int i_79_,
		     int i_80_, int i_81_, int i_82_);
    
    abstract void b(int i, int i_83_);
    
    qp(nga var_nga, int i, int i_84_) {
	((qp) this).b = var_nga;
	((qp) this).k = i;
	((qp) this).o = i_84_;
    }
    
    static {
	i = 0;
	A = 0;
	D = 0;
	s = 0;
    }
}
