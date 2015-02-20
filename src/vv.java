/* vv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

import jaggl.OpenGL;

final class vv extends uc
{
    static Interface i;
    private Class_fb j;
    static int k;
    static int l = 0;
    static boolean m = false;
    static int n;
    static volatile boolean o = false;
    static int p;
    private boolean q = false;
    static int r;
    static int s;
    static int t;
    static int u;
    
    final void a(int i, int i_0_, rg var_rg) {
	r++;
	if (i_0_ != 7)
	    a((byte) 39);
	((uc) this).h.a(var_rg, i_0_ - 9);
	((uc) this).h.c(false, i);
    }
    
    final void a(int i, boolean bool) {
	((uc) this).h.a(8448, -465309136, 7681);
	if (i <= -64)
	    n++;
    }
    
    final boolean a(byte i) {
	if (i > -93)
	    vv.i = null;
	s++;
	return true;
    }
    
    final void a(int i, int i_1_, int i_2_) {
	k++;
	if (i_1_ != 50)
	    vv.i = null;
    }
    
    static final void a(int i, int i_3_, int i_4_, byte i_5_, int i_6_) {
	for (int i_7_ = 0; rba.m > i_7_; i_7_++) {
	    Rectangle rectangle = ng.s[i_7_];
	    if (i_3_ < rectangle.width + rectangle.x
		&& i_3_ + i_4_ > rectangle.x
		&& rectangle.height + rectangle.y > i
		&& i_6_ + i > rectangle.y)
		cj.c[i_7_] = true;
	}
	int i_8_ = -105 % ((-16 - i_5_) / 32);
	t++;
    }
    
    final void a(int i) {
	u++;
	if (q) {
	    j.a(-29240, '\001');
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a((rg) null, -2);
	    ((uc) this).h.b((int) 0, true);
	} else
	    ((uc) this).h.a(5890, 770, 0, true);
	((uc) this).h.a(8448, -465309136, 8448);
	if (i == 1268)
	    q = false;
    }
    
    vv(qj var_qj) {
	super(var_qj);
	if (((qj) var_qj).Lf) {
	    j = new Class_fb(var_qj, 2);
	    j.a(0, 0);
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a(34165, -465309136, 7681);
	    ((uc) this).h.b(2, 770, 768, 34168);
	    ((uc) this).h.a(34167, 770, 0, true);
	    OpenGL.glTexGeni(8192, 9472, 34066);
	    OpenGL.glTexGeni(8193, 9472, 34066);
	    OpenGL.glTexGeni(8194, 9472, 34066);
	    OpenGL.glEnable(3168);
	    OpenGL.glEnable(3169);
	    OpenGL.glEnable(3170);
	    ((uc) this).h.b((int) 0, true);
	    j.a((byte) 110);
	    j.a(1, 0);
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a(8448, -465309136, 8448);
	    ((uc) this).h.b(2, 770, 768, 34166);
	    ((uc) this).h.a(5890, 770, 0, true);
	    OpenGL.glDisable(3168);
	    OpenGL.glDisable(3169);
	    OpenGL.glDisable(3170);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5888);
	    ((uc) this).h.b((int) 0, true);
	    j.a((byte) 105);
	}
    }
    
    final void b(int i, boolean bool) {
	p++;
	waa var_waa = ((uc) this).h.p(8960);
	if (j != null && var_waa != null && bool) {
	    j.a(-29240, '\0');
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a(var_waa, -2);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf(((qj) ((uc) this).h).We.d(-1801), 0);
	    OpenGL.glMatrixMode(5888);
	    ((uc) this).h.b((int) 0, true);
	    q = true;
	} else
	    ((uc) this).h.a(34168, 770, 0, true);
	int i_9_ = -6 % ((65 - i) / 60);
    }
    
    public static void d(byte i) {
	if (i >= -31)
	    l = -15;
	vv.i = null;
    }
}
