/* eca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

final class eca extends f
{
    private boolean a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    private ar g;
    static int h;
    private int i = 0;
    static int j;
    static int k;
    static int l;
    ar m;
    static int n;
    private qj o;
    private int p;
    private int q;
    static int r;
    private int s;
    static int t;
    static int u;
    private int v;
    static float w;
    static int x;
    static int y;
    static int z;
    static int A;
    
    private final void b(int i, int i_0_) {
	o.b((int) 1, true);
	r++;
	o.a(((eca) this).m, -2);
	o.a(o.c(i, 260), i_0_ - 465309904, 7681);
	o.b(1, i_0_, 768, 34167);
	o.a(34168, 770, 0, true);
	o.b((int) 0, true);
	o.a(g, -2);
	o.a(34479, -465309136, 7681);
	o.b(1, 768, 768, 34166);
	if (p != 0) {
	    if (p == 1)
		o.a(0.5F, 0.5F, 0.0F, -23119, 1.0F);
	    else if (p != 2) {
		if (p == 3)
		    o.a(128.5F, 128.5F, 0.0F, -23119, 128.5F);
	    } else
		o.a(1.0F, 0.5F, 0.0F, i_0_ - 23887, 0.5F);
	} else
	    o.a(0.5F, 1.0F, 0.0F, i_0_ ^ ~0x594e, 0.5F);
    }
    
    final int A() {
	n++;
	return ((ar) ((eca) this).m).T - (-i - v);
    }
    
    final void a(int i, int i_1_, ua var_ua, int i_2_, int i_3_) {
	y++;
	hj var_hj = (hj) var_ua;
	ar var_ar = ((hj) var_hj).f;
	((eca) this).m.b(false, 17137);
	o.m((byte) 3);
	o.a(((eca) this).m, -2);
	o.c(false, 1);
	o.b((int) 1, true);
	o.a(var_ar, -2);
	o.a(7681, -465309136, 8448);
	o.b(0, 768, 768, 34168);
	o.b((byte) 40, (int) 1);
	i += v;
	i_1_ += q;
	int i_4_ = i + ((ar) ((eca) this).m).T;
	int i_5_ = ((ar) ((eca) this).m).N + i_1_;
	float f = ((ar) var_ar).O / (float) ((ar) var_ar).T;
	float f_6_ = ((ar) var_ar).M / (float) ((ar) var_ar).N;
	float f_7_ = f * (float) (i - i_2_);
	float f_8_ = f * (float) (i_4_ - i_2_);
	float f_9_ = ((ar) var_ar).M - (float) (i_1_ - i_3_) * f_6_;
	float f_10_ = ((ar) var_ar).M - f_6_ * (float) (i_5_ - i_3_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, ((ar) ((eca) this).m).M);
	OpenGL.glMultiTexCoord2f(33985, f_7_, f_9_);
	OpenGL.glVertex2i(i, i_1_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_7_, f_10_);
	OpenGL.glVertex2i(i, i_1_ + ((ar) ((eca) this).m).N);
	OpenGL.glMultiTexCoord2f(33984, ((ar) ((eca) this).m).O, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_8_, f_10_);
	OpenGL.glVertex2i(i + ((ar) ((eca) this).m).T,
			  i_1_ + ((ar) ((eca) this).m).N);
	OpenGL.glMultiTexCoord2f(33984, ((ar) ((eca) this).m).O,
				 ((ar) ((eca) this).m).M);
	OpenGL.glMultiTexCoord2f(33985, f_8_, f_9_);
	OpenGL.glVertex2i(((ar) ((eca) this).m).T + i, i_1_);
	OpenGL.glEnd();
	o.b(0, 768, 768, 5890);
	o.c(false, 0);
	o.a((rg) null, -2);
	o.b((int) 0, true);
    }
    
    final void YA(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_,
		  int i_16_, int i_17_) {
	z++;
	((eca) this).m.b((i_17_ & 0x1) != 0, 17137);
	o.m((byte) 3);
	o.b((byte) 85, i_16_);
	OpenGL.glColor4ub((byte) (i_15_ >> 16), (byte) (i_15_ >> 8),
			  (byte) i_15_, (byte) (i_15_ >> 24));
	if (a) {
	    float f = (float) i_12_ / (float) A();
	    float f_18_ = (float) i_13_ / (float) ca();
	    float f_19_ = (float) i + (float) v * f;
	    float f_20_ = (float) i_11_ + f_18_ * (float) q;
	    float f_21_ = f * (float) ((ar) ((eca) this).m).T + f_19_;
	    float f_22_ = f_20_ + f_18_ * (float) ((ar) ((eca) this).m).N;
	    if (g == null) {
		o.a(((eca) this).m, -2);
		o.c(false, i_14_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
		OpenGL.glVertex2f(f_19_, f_20_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_19_, f_22_);
		OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
		OpenGL.glVertex2f(f_21_, f_22_);
		OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
				    ((ar) ((eca) this).m).M);
		OpenGL.glVertex2f(f_21_, f_20_);
		OpenGL.glEnd();
	    } else {
		b(i_14_, 768);
		g.b(true, 17137);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, ((ar) ((eca) this).m).M);
		OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
		OpenGL.glVertex2f(f_19_, f_20_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_19_, f_22_);
		OpenGL.glMultiTexCoord2f(33985, ((ar) ((eca) this).m).O, 0.0F);
		OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
		OpenGL.glVertex2f(f_21_, f_22_);
		OpenGL.glMultiTexCoord2f(33985, ((ar) ((eca) this).m).O,
					 ((ar) ((eca) this).m).M);
		OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
				    ((ar) ((eca) this).m).M);
		OpenGL.glVertex2f(f_21_, f_20_);
		OpenGL.glEnd();
		a((byte) -98);
	    }
	} else if (g == null) {
	    o.a(((eca) this).m, -2);
	    o.c(false, i_14_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(i, i_11_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_11_ + i_13_);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
	    OpenGL.glVertex2i(i + i_12_, i_11_ + i_13_);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
				((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(i + i_12_, i_11_);
	    OpenGL.glEnd();
	} else {
	    b(i_14_, 768);
	    g.b(true, 17137);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, ((ar) ((eca) this).m).M);
	    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(i, i_11_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_13_ + i_11_);
	    OpenGL.glMultiTexCoord2f(33985, ((ar) ((eca) this).m).O, 0.0F);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
	    OpenGL.glVertex2i(i + i_12_, i_11_ + i_13_);
	    OpenGL.glMultiTexCoord2f(33985, ((ar) ((eca) this).m).O,
				     ((ar) ((eca) this).m).M);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
				((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(i + i_12_, i_11_);
	    OpenGL.glEnd();
	    a((byte) -84);
	}
    }
    
    static final int a(Interface var_kp, int i, boolean bool) {
	if (bool != true)
	    return 73;
	e++;
	if (!client.c(var_kp).a(i, (byte) 91) && ((Interface) var_kp).nd == null)
	    return -1;
	if (((Interface) var_kp).kb != null && ((Interface) var_kp).kb.length > i)
	    return ((Interface) var_kp).kb[i];
	return -1;
    }
    
    final int u() {
	b++;
	return ((ar) ((eca) this).m).N;
    }
    
    final void DA(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_,
		  int i_28_) {
	c++;
	int i_29_ = i + i_24_;
	((eca) this).m.b(false, 17137);
	int i_30_ = i_23_ + i_25_;
	o.m((byte) 3);
	o.a(((eca) this).m, -2);
	o.b((byte) 90, i_28_);
	o.c(false, i_26_);
	OpenGL.glColor4ub((byte) (i_27_ >> 16), (byte) (i_27_ >> 8),
			  (byte) i_27_, (byte) (i_27_ >> 24));
	if (!((ar) ((eca) this).m).P || a) {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) v, (float) q, 0.0F);
	    int i_31_ = A();
	    int i_32_ = ca();
	    int i_33_ = ((ar) ((eca) this).m).N + i_23_;
	    OpenGL.glBegin(7);
	    int i_34_ = i_23_;
	    while (i_30_ >= i_33_) {
		int i_35_ = i + ((ar) ((eca) this).m).T;
		int i_36_ = i;
		while (i_35_ <= i_29_) {
		    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_36_, i_34_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_36_, i_33_);
		    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
		    OpenGL.glVertex2i(i_35_, i_33_);
		    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
					((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_35_, i_34_);
		    i_35_ += i_31_;
		    i_36_ += i_31_;
		}
		if (i_29_ > i_36_) {
		    float f
			= (((ar) ((eca) this).m).O * (float) (i_29_ - i_36_)
			   / (float) ((ar) ((eca) this).m).T);
		    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_36_, i_34_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_36_, i_33_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_29_, i_33_);
		    OpenGL.glTexCoord2f(f, ((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_29_, i_34_);
		}
		i_33_ += i_32_;
		i_34_ += i_32_;
	    }
	    if (i_30_ > i_34_) {
		float f = ((float) (i_34_ + ((ar) ((eca) this).m).N - i_30_)
			   * ((ar) ((eca) this).m).M
			   / (float) ((ar) ((eca) this).m).N);
		int i_37_ = i + ((ar) ((eca) this).m).T;
		int i_38_ = i;
		while (i_29_ >= i_37_) {
		    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_38_, i_34_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_38_, i_30_);
		    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, f);
		    OpenGL.glVertex2i(i_37_, i_30_);
		    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
					((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_37_, i_34_);
		    i_37_ += i_31_;
		    i_38_ += i_31_;
		}
		if (i_38_ < i_29_) {
		    float f_39_
			= ((float) (i_29_ - i_38_) * ((ar) ((eca) this).m).O
			   / (float) ((ar) ((eca) this).m).T);
		    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_38_, i_34_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_38_, i_30_);
		    OpenGL.glTexCoord2f(f_39_, f);
		    OpenGL.glVertex2i(i_29_, i_30_);
		    OpenGL.glTexCoord2f(f_39_, ((ar) ((eca) this).m).M);
		    OpenGL.glVertex2i(i_29_, i_34_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	} else {
	    float f = ((float) i_25_ * ((ar) ((eca) this).m).M
		       / (float) ((ar) ((eca) this).m).N);
	    float f_40_ = ((float) i_24_ * ((ar) ((eca) this).m).O
			   / (float) ((ar) ((eca) this).m).T);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_23_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_30_);
	    OpenGL.glTexCoord2f(f_40_, 0.0F);
	    OpenGL.glVertex2i(i_29_, i_30_);
	    OpenGL.glTexCoord2f(f_40_, f);
	    OpenGL.glVertex2i(i_29_, i_23_);
	    OpenGL.glEnd();
	}
    }
    
    final void a(float f, float f_41_, float f_42_, float f_43_, float f_44_,
		 float f_45_, int i, ua var_ua, int i_46_, int i_47_) {
	j++;
	ar var_ar = ((hj) (hj) var_ua).f;
	if (a) {
	    float f_48_ = (float) A();
	    float f_49_ = (float) ca();
	    float f_50_ = (f_42_ - f) / f_48_;
	    float f_51_ = (f_43_ - f_41_) / f_48_;
	    float f_52_ = (f_44_ - f) / f_49_;
	    float f_53_ = (f_45_ - f_41_) / f_49_;
	    float f_54_ = f_52_ * (float) q;
	    float f_55_ = f_53_ * (float) q;
	    float f_56_ = f_50_ * (float) v;
	    float f_57_ = f_51_ * (float) v;
	    float f_58_ = -f_50_ * (float) this.i;
	    float f_59_ = -f_51_ * (float) this.i;
	    float f_60_ = -f_52_ * (float) s;
	    f_43_ = f_55_ + (f_59_ + f_43_);
	    f_44_ = f_44_ + f_56_ + f_60_;
	    float f_61_ = -f_53_ * (float) s;
	    f_42_ = f_54_ + (f_58_ + f_42_);
	    f = f_54_ + (f + f_56_);
	    f_41_ = f_55_ + (f_57_ + f_41_);
	    f_45_ = f_61_ + (f_57_ + f_45_);
	}
	float f_62_ = f_42_ - f + f_44_;
	float f_63_ = f_43_ + (f_45_ - f_41_);
	((eca) this).m.b((0x1 & i) != 0, 17137);
	o.m((byte) 3);
	o.a(((eca) this).m, -2);
	o.c(false, 1);
	o.b((int) 1, true);
	o.a(var_ar, -2);
	o.a(7681, -465309136, 8448);
	o.b(0, 768, 768, 34168);
	o.b((byte) 99, (int) 1);
	float f_64_ = ((ar) var_ar).O / (float) ((ar) var_ar).T;
	float f_65_ = ((ar) var_ar).M / (float) ((ar) var_ar).N;
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, ((ar) ((eca) this).m).M);
	OpenGL.glMultiTexCoord2f(33985, (f - (float) i_46_) * f_64_,
				 ((ar) var_ar).M - f_65_ * (f_41_
							    - (float) i_47_));
	OpenGL.glVertex2f(f, f_41_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_64_ * (f_44_ - (float) i_46_),
				 (((ar) var_ar).M
				  - (f_45_ - (float) i_47_) * f_65_));
	OpenGL.glVertex2f(f_44_, f_45_);
	OpenGL.glMultiTexCoord2f(33984, ((ar) ((eca) this).m).O, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, ((float) -i_46_ + f_62_) * f_64_,
				 (((ar) var_ar).M
				  - ((float) -i_47_ + f_63_) * f_65_));
	OpenGL.glVertex2f(f_62_, f_63_);
	OpenGL.glMultiTexCoord2f(33984, ((ar) ((eca) this).m).O,
				 ((ar) ((eca) this).m).M);
	OpenGL.glMultiTexCoord2f(33985, f_64_ * ((float) -i_46_ + f_42_),
				 (((ar) var_ar).M
				  - ((float) -i_47_ + f_43_) * f_65_));
	OpenGL.glVertex2f(f_42_, f_43_);
	OpenGL.glEnd();
	o.b(0, 768, 768, 5890);
	o.c(false, 0);
	o.a((rg) null, -2);
	o.b((int) 0, true);
    }
    
    final void xa(int i, int i_66_, int i_67_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	A++;
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	g = tb.a((byte) -87, o, ((ar) ((eca) this).m).T, i_66_,
		 ((ar) ((eca) this).m).N, i);
	p = i_67_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    final void da(int i, int i_68_, int i_69_, int i_70_, int i_71_,
		  int i_72_) {
	t++;
	((eca) this).m.a(i, (byte) 40, i_72_, i_71_, i_68_, i_69_, i_70_);
    }
    
    private final void a(byte i) {
	o.b((int) 1, true);
	d++;
	o.a((rg) null, -2);
	if (i <= -53) {
	    o.a(8448, -465309136, 8448);
	    o.b(1, 768, 768, 34168);
	    o.a(5890, 770, 0, true);
	    o.b((int) 0, true);
	    o.b(1, 768, 768, 34168);
	}
    }
    
    final int ca() {
	h++;
	return q + ((ar) ((eca) this).m).N + s;
    }
    
    static final void a(Animable var_lo, boolean bool) {
	if (kw.B) {
	    if (bool)
		ff.p[ff.p.length - 1].a(true, var_lo);
	    else {
		int i = Class_fb.a(((Animable) var_lo).var_n);
		int i_73_ = eh.c[2] * var_lo.c(-22496) / ((Animable) var_lo).g;
		int i_74_ = Class_fb.a(((Animable) var_lo).var_n - i_73_);
		int i_75_ = Class_fb.a(((Animable) var_lo).var_n + i_73_);
		if (i_74_ == i_75_)
		    ff.p[i].a(true, var_lo);
		else if (i_75_ - i_74_ == 1)
		    ff.p[ko.a + i_74_].a(true, var_lo);
		else
		    ff.p[ff.p.length - 1].a(true, var_lo);
	    }
	} else
	    nw.a(var_lo, tf.b);
    }
    
    final void Q(int i, int i_76_, int i_77_, int i_78_) {
	v = i;
	s = i_78_;
	x++;
	q = i_76_;
	this.i = i_77_;
	a = v != 0 || q != 0 || this.i != 0 || s != 0;
    }
    
    static final void a(byte i, Class_r class_r) {
	if (i != -4)
	    w = -1.049912F;
	l++;
	if (iga.j.b(i ^ 0x48) != 0) {
	    if (on.performance != 0) {
		if (kea.i == null) {
		    Canvas canvas = new Canvas();
		    canvas.setSize(36, 32);
		    kea.i = Class_r.a(0, 0, on.c, canvas, Class_nd.p, -19464);
		    Class_k.K = kea.i.a(qj.a((byte) 11, cs.i, 0, od.smallFont),
					aga.b(sm.a, od.smallFont, 0), true);
		}
		for (wq var_wq = (wq) iga.j.a(i + 111); var_wq != null;
		     var_wq = (wq) iga.j.b((byte) 90)) {
		    laa.itemDefLoader.a(((wq) var_wq).r, false, kea.i, ((wq) var_wq).k,
			    ((wq) var_wq).n ? ((Player) up.thisPlayer).playerDef : null, false,
			    ((wq) var_wq).l, class_r, ((wq) var_wq).s,
			    Class_k.K, ((wq) var_wq).q, i ^ ~0x70);
		    var_wq.unlink(i ^ 0xa);
		}
	    } else {
		for (wq var_wq = (wq) iga.j.a(i + 99); var_wq != null;
		     var_wq = (wq) iga.j.b((byte) 120)) {
		    laa.itemDefLoader.a(((wq) var_wq).r, false, class_r, ((wq) var_wq).k,
			    ((wq) var_wq).n ? ((Player) up.thisPlayer).playerDef : null, false,
			    ((wq) var_wq).l, class_r, ((wq) var_wq).s, bq.e,
			    ((wq) var_wq).q, 112);
		    var_wq.unlink(-90);
		}
		fda.a(0);
	    }
	}
    }
    
    final void V(int i, int i_79_, int i_80_, int i_81_, int i_82_) {
	k++;
	((eca) this).m.b(false, 17137);
	o.m((byte) 3);
	o.b((byte) 118, i_82_);
	OpenGL.glColor4ub((byte) (i_81_ >> 16), (byte) (i_81_ >> 8),
			  (byte) i_81_, (byte) (i_81_ >> 24));
	i_79_ += q;
	i += v;
	if (g != null) {
	    b(i_80_, 768);
	    g.b(false, 17137);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, ((ar) ((eca) this).m).M);
	    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(i, i_79_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, ((ar) ((eca) this).m).N + i_79_);
	    OpenGL.glMultiTexCoord2f(33985, ((ar) ((eca) this).m).O, 0.0F);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
	    OpenGL.glVertex2i(i + ((ar) ((eca) this).m).T,
			      i_79_ + ((ar) ((eca) this).m).N);
	    OpenGL.glMultiTexCoord2f(33985, ((ar) ((eca) this).m).O,
				     ((ar) ((eca) this).m).M);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
				((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(((ar) ((eca) this).m).T + i, i_79_);
	    OpenGL.glEnd();
	    a((byte) -112);
	} else {
	    o.a(((eca) this).m, -2);
	    o.c(false, i_80_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(i, i_79_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_79_ + ((ar) ((eca) this).m).N);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
	    OpenGL.glVertex2i(i + ((ar) ((eca) this).m).T,
			      i_79_ + ((ar) ((eca) this).m).N);
	    OpenGL.glTexCoord2f(((ar) ((eca) this).m).O,
				((ar) ((eca) this).m).M);
	    OpenGL.glVertex2i(((ar) ((eca) this).m).T + i, i_79_);
	    OpenGL.glEnd();
	}
    }
    
    final int E() {
	u++;
	return ((ar) ((eca) this).m).T;
    }
    
    final void qa(float f, float f_83_, float f_84_, float f_85_, float f_86_,
		  float f_87_, int i, int i_88_, int i_89_, int i_90_) {
	eca.f++;
	if (a) {
	    float f_91_ = (float) A();
	    float f_92_ = (float) ca();
	    float f_93_ = (f_84_ - f) / f_91_;
	    float f_94_ = (f_85_ - f_83_) / f_91_;
	    float f_95_ = (f_86_ - f) / f_92_;
	    float f_96_ = (f_87_ - f_83_) / f_92_;
	    float f_97_ = (float) q * f_95_;
	    float f_98_ = f_96_ * (float) q;
	    float f_99_ = f_93_ * (float) v;
	    float f_100_ = f_94_ * (float) v;
	    float f_101_ = (float) this.i * -f_93_;
	    float f_102_ = -f_94_ * (float) this.i;
	    float f_103_ = (float) s * -f_95_;
	    f_83_ = f_83_ + f_100_ + f_98_;
	    float f_104_ = -f_96_ * (float) s;
	    f_85_ = f_98_ + (f_85_ + f_102_);
	    f = f + f_99_ + f_97_;
	    f_86_ = f_86_ + f_99_ + f_103_;
	    f_84_ = f_84_ + f_101_ + f_97_;
	    f_87_ = f_104_ + (f_100_ + f_87_);
	}
	float f_105_ = f_86_ + (f_84_ - f);
	float f_106_ = f_85_ + (f_87_ - f_83_);
	((eca) this).m.b((0x1 & i_90_) != 0, 17137);
	o.m((byte) 3);
	o.a(((eca) this).m, -2);
	o.b((byte) 76, i_89_);
	o.c(false, i);
	OpenGL.glColor4ub((byte) (i_88_ >> 16), (byte) (i_88_ >> 8),
			  (byte) i_88_, (byte) (i_88_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, ((ar) ((eca) this).m).M);
	OpenGL.glVertex2f(f, f_83_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_86_, f_87_);
	OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, 0.0F);
	OpenGL.glVertex2f(f_105_, f_106_);
	OpenGL.glTexCoord2f(((ar) ((eca) this).m).O, ((ar) ((eca) this).m).M);
	OpenGL.glVertex2f(f_84_, f_85_);
	OpenGL.glEnd();
    }
    
    eca(qj var_qj, int i, int i_107_, boolean bool) {
	a = false;
	q = 0;
	v = 0;
	p = 0;
	s = 0;
	o = var_qj;
	((eca) this).m = no.a(var_qj, !bool ? 6407 : 6408, i_107_, i, 34037);
    }
    
    eca(qj var_qj, int i, int i_108_, int i_109_, int i_110_) {
	a = false;
	q = 0;
	v = 0;
	p = 0;
	s = 0;
	o = var_qj;
	((eca) this).m = tb.a((byte) -87, var_qj, i_109_, i_108_, i_110_, i);
    }
    
    eca(qj var_qj, int i, int i_111_, int[] is, int i_112_, int i_113_) {
	a = false;
	q = 0;
	v = 0;
	p = 0;
	s = 0;
	o = var_qj;
	((eca) this).m = fca.a(26871, i, var_qj, false, i_111_, is);
    }
}
