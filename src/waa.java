/* waa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class waa extends rg
{
    int s;
    static int t;
    static int u;
    static int v;
    private int w = -1;
    private int x = -1;
    
    waa(qj var_qj, int i, int i_0_, boolean bool, int[][] is) {
	super(var_qj, 34067, i, i_0_ * i_0_ * 6, bool);
	((waa) this).s = i_0_;
	((rg) this).o.a(this, -2);
	if (bool) {
	    for (int i_1_ = 0; i_1_ < 6; i_1_++)
		sa.a(i_1_ + 34069, ((rg) this).k, i_0_, 160, i_0_, 32993,
		     is[i_1_], ((qj) ((rg) this).o).Zg);
	} else {
	    for (int i_2_ = 0; i_2_ < 6; i_2_++)
		OpenGL.glTexImage2Di(i_2_ + 34069, 0, ((rg) this).k, i_0_,
				     i_0_, 0, 32993, ((qj) ((rg) this).o).Zg,
				     is[i_2_], 0);
	}
	this.b(true, 17137);
    }
    
    waa(qj var_qj, int i, int i_3_) {
	super(var_qj, 34067, i, 6 * i_3_ * i_3_, false);
	((waa) this).s = i_3_;
	((rg) this).o.a(this, -2);
	for (int i_4_ = 0; i_4_ < 6; i_4_++)
	    OpenGL.glTexImage2Dub(34069 + i_4_, 0, ((rg) this).k, i_3_, i_3_,
				  0, ek.b(((rg) this).k, (byte) 29), 5121,
				  null, 0);
	this.b(true, 17137);
    }
    
    waa(qj var_qj, int i, int i_5_, boolean bool, byte[][] is, int i_6_) {
	super(var_qj, 34067, i, i_5_ * (i_5_ * 6), bool);
	((waa) this).s = i_5_;
	((rg) this).o.a(this, -2);
	for (int i_7_ = 0; i_7_ < 6; i_7_++)
	    OpenGL.glTexImage2Dub(i_7_ + 34069, 0, ((rg) this).k, i_5_, i_5_,
				  0, i_6_, 5121, is[i_7_], 0);
	this.b(true, 17137);
    }
    
    public final void a(int i) {
	t++;
	OpenGL.glFramebufferTexture2DEXT(w, x, 3553, 0, 0);
	w = -1;
	x = -1;
	if (i != 29468)
	    w = 33;
    }
    
    static final void a(Class_r class_r, int i, Class_vb class_vb, ww var_ww) {
	v++;
	f var_f = var_ww.a(-126, class_r);
	if (var_f != null) {
	    int i_8_ = var_f.E();
	    if (i_8_ < var_f.u())
		i_8_ = var_f.u();
	    int i_9_ = 10;
	    int i_10_ = ((Class_vb) class_vb).p;
	    int i_11_ = ((Class_vb) class_vb).k;
	    int i_12_ = 0;
	    int i_13_ = 0;
	    int i_14_ = 0;
	    if (((ww) var_ww).q != null) {
		i_12_ = Class_rb.O.a(((ww) var_ww).q, nt.d, -1, null, null);
		for (int i_15_ = 0; i_12_ > i_15_; i_15_++) {
		    String string = nt.d[i_15_];
		    if (i_12_ - 1 > i_15_)
			string = string.substring(0, string.length() - 4);
		    int i_16_ = al.oj.a(string);
		    if (i_16_ > i_13_)
			i_13_ = i_16_;
		}
		i_14_ = i_12_ * al.oj.a() + al.oj.b() / 2;
	    }
	    int i_17_ = ((Class_vb) class_vb).p + i_8_ / 2;
	    int i_18_ = ((Class_vb) class_vb).k;
	    if (i_10_ < kca.B + i_8_) {
		i_10_ = kca.B;
		i_17_ = i_13_ / 2 + 5 + i_9_ + (kca.B + i_8_ / 2);
	    } else if (i_10_ > kca.x - i_8_) {
		i_17_ = kca.x - (i_8_ / 2 - (-i_9_ - i_13_ / 2)) - 5;
		i_10_ = kca.x - i_8_;
	    }
	    if (i_8_ + kca.y <= i_11_) {
		if (kca.J - i_8_ < i_11_) {
		    i_11_ = kca.J - i_8_;
		    i_18_ = kca.J - (i_8_ / 2 + i_9_) - i_14_;
		}
	    } else {
		i_18_ = i_8_ / 2 + kca.y + i_9_;
		i_11_ = kca.y;
	    }
	    int i_19_
		= ((int) (32767.0
			  * (Math.atan2((double) (i_10_
						  - ((Class_vb) class_vb).p),
					(double) (i_11_
						  - ((Class_vb) class_vb).k))
			     / 3.141592653589793))
		   & 0xffff);
	    var_f.a((float) i_8_ / 2.0F + (float) i_10_,
		    (float) i_11_ + (float) i_8_ / 2.0F, 4096, i_19_);
	    int i_20_ = -2;
	    int i_21_ = -2;
	    int i_22_ = -2;
	    if (i != 32993)
		a(null, -18, null, null);
	    int i_23_ = -2;
	    if (((ww) var_ww).q != null) {
		i_21_ = i_18_;
		i_20_ = -(i_13_ / 2) - 5 + i_17_;
		i_22_ = i_20_ + i_13_ + 10;
		i_23_ = i_21_ + 3 + al.oj.a() * i_12_;
		if (((ww) var_ww).p != 0)
		    class_r.f(((ww) var_ww).p, i_20_, i_21_, 1, i_23_ - i_21_,
			      i_22_ - i_20_);
		if (((ww) var_ww).w != 0)
		    class_r.b(i_22_ - i_20_, i_21_, i_23_ - i_21_, i_20_,
			      20822, ((ww) var_ww).w);
		for (int i_24_ = 0; i_12_ > i_24_; i_24_++) {
		    String string = nt.d[i_24_];
		    if (i_24_ < i_12_ - 1)
			string = string.substring(0, string.length() - 4);
		    al.oj.a(class_r, string, i_17_, i_18_, ((ww) var_ww).E,
			   true);
		    i_18_ += al.oj.a();
		}
	    }
	    if ((((ww) var_ww).L ^ 0xffffffff) != 0
		|| ((ww) var_ww).q != null) {
		cf var_cf = new cf(class_vb);
		i_8_ >>= 1;
		((cf) var_cf).q = i_10_ - i_8_;
		((cf) var_cf).r = i_8_ + i_11_;
		((cf) var_cf).k = i_21_;
		((cf) var_cf).v = i_22_;
		((cf) var_cf).s = i_23_;
		((cf) var_cf).o = i_20_;
		((cf) var_cf).t = i_11_ - i_8_;
		((cf) var_cf).p = i_10_ + i_8_;
		bg.c.b(var_cf, (byte) 93);
	    }
	}
    }
    
    final void a(byte i, int i_25_, int i_26_, int i_27_, int i_28_) {
	OpenGL.glFramebufferTexture2DEXT(i_26_, i_25_, i_27_, ((rg) this).q,
					 i_28_);
	u++;
	w = i_26_;
	int i_29_ = -73 % ((i - 20) / 38);
	x = i_25_;
    }
}
