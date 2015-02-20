/* wf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class wf extends uc
{
    static int i;
    static int j;
    private Class_fb k;
    static int l;
    static int m;
    private waa[] n;
    static int o;
    static int p;
    static int q;
    private boolean r = false;
    private boolean s;
    static int t;
    static oga u;
    static int v;
    
    static final void a(boolean bool) {
	bl.v.a(18385);
	t++;
	if (bool != true)
	    u = null;
    }
    
    final void a(int i, int i_0_, int i_1_) {
	if (i_0_ == 50) {
	    if (r) {
		((uc) this).h.b((int) 1, true);
		((uc) this).h.a(n[i - 1], -2);
		((uc) this).h.b((int) 0, true);
	    }
	    p++;
	}
    }
    
    wf(qj var_qj) {
	super(var_qj);
	if (((qj) var_qj).Lf) {
	    s = ((qj) var_qj).Qf < 3;
	    int i = s ? 48 : 127;
	    byte[][] is = new byte[6][4096];
	    byte[][] is_2_ = new byte[6][4096];
	    byte[][] is_3_ = new byte[6][4096];
	    int i_4_ = 0;
	    for (int i_5_ = 0; i_5_ < 64; i_5_++) {
		for (int i_6_ = 0; i_6_ < 64; i_6_++) {
		    float f = 2.0F * (float) i_6_ / 64.0F - 1.0F;
		    float f_7_ = (float) i_5_ * 2.0F / 64.0F - 1.0F;
		    float f_8_
			= (float) (1.0
				   / Math.sqrt((double) (f_7_ * f_7_
							 + (f * f + 1.0F))));
		    f *= f_8_;
		    f_7_ *= f_8_;
		    for (int i_9_ = 0; i_9_ < 6; i_9_++) {
			float f_10_;
			if (i_9_ != 0) {
			    if (i_9_ == 1)
				f_10_ = f;
			    else if (i_9_ != 2) {
				if (i_9_ != 3) {
				    if (i_9_ != 4)
					f_10_ = -f_8_;
				    else
					f_10_ = f_8_;
				} else
				    f_10_ = -f_7_;
			    } else
				f_10_ = f_7_;
			} else
			    f_10_ = -f;
			int i_11_;
			int i_12_;
			int i_13_;
			if (f_10_ > 0.0F) {
			    i_11_ = (int) ((double) i
					   * Math.pow((double) f_10_, 96.0));
			    i_12_ = (int) (Math.pow((double) f_10_, 36.0)
					   * (double) i);
			    i_13_ = (int) ((double) i
					   * Math.pow((double) f_10_, 12.0));
			} else
			    i_11_ = i_12_ = i_13_ = 0;
			is_2_[i_9_][i_4_] = (byte) i_11_;
			is_3_[i_9_][i_4_] = (byte) i_12_;
			is[i_9_][i_4_] = (byte) i_13_;
		    }
		    i_4_++;
		}
	    }
	    n = new waa[3];
	    n[0] = new waa(((uc) this).h, 6406, 64, false, is_2_, 6406);
	    n[1] = new waa(((uc) this).h, 6406, 64, false, is_3_, 6406);
	    n[2] = new waa(((uc) this).h, 6406, 64, false, is, 6406);
	    b(-25549);
	}
    }
    
    final void b(int i, boolean bool) {
	if (k != null && bool) {
	    if (!s) {
		((uc) this).h.b((int) 2, true);
		((uc) this).h.a(((qj) ((uc) this).h).Yf, -2);
		((uc) this).h.b((int) 0, true);
	    }
	    k.a(-29240, '\0');
	    r = true;
	} else
	    ((uc) this).h.a(34168, 770, 0, true);
	j++;
	int i_14_ = -80 / ((i - 65) / 60);
    }
    
    final void a(int i) {
	if (i != 1268)
	    a((byte) -67);
	m++;
	if (!r)
	    ((uc) this).h.a(5890, 770, 0, true);
	else {
	    if (!s) {
		((uc) this).h.b((int) 2, true);
		((uc) this).h.a((rg) null, -2);
	    }
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a((rg) null, -2);
	    ((uc) this).h.b((int) 0, true);
	    k.a(-29240, '\001');
	    r = false;
	}
	((uc) this).h.a(8448, i ^ ~0x1bbc093b, 8448);
    }
    
    final void a(int i, int i_15_, rg var_rg) {
	if (i_15_ != 7)
	    k = null;
	v++;
	((uc) this).h.a(var_rg, -2);
	((uc) this).h.c(false, i);
    }
    
    final void a(int i, boolean bool) {
	if (i <= -64) {
	    wf.i++;
	    ((uc) this).h.a(8448, -465309136, 7681);
	}
    }
    
    static final void a(int i, byte i_16_, Interface var_kp, int i_17_) {
	q++;
	if (kr.a == null && !gea.n
	    && (var_kp != null && ee.a(-108, var_kp) != null)) {
	    kr.a = var_kp;
	    rca.e = ee.a(45, var_kp);
	    pea.c = i;
	    mm.q = i_17_;
	    fj.z = false;
	    if (i_16_ >= -99)
		a(-121, (byte) -96, (Interface) null, 56);
	    ada.H = 0;
	}
    }
    
    public static void b(boolean bool) {
	if (bool != true)
	    b(false);
	u = null;
    }
    
    private final void b(int i) {
	k = new Class_fb(((uc) this).h, 2);
	o++;
	k.a(0, 0);
	((uc) this).h.b((int) 1, true);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
	OpenGL.glMatrixMode(5888);
	if (!s) {
	    ((uc) this).h.a(7681, -465309136, 8448);
	    ((uc) this).h.b(0, 768, 768, 34168);
	    ((uc) this).h.b((int) 2, true);
	    ((uc) this).h.a(260, -465309136, 7681);
	    ((uc) this).h.b(0, 768, 768, 34168);
	    ((uc) this).h.b(1, 770, 768, 34168);
	    ((uc) this).h.a(34167, 770, 0, true);
	} else {
	    ((uc) this).h.a(260, i ^ 0x1bbc6e03, 7681);
	    ((uc) this).h.b(0, 770, 768, 5890);
	    ((uc) this).h.a(34167, 770, 0, true);
	}
	((uc) this).h.b((int) 0, true);
	k.a((byte) 57);
	k.a(1, i ^ i);
	((uc) this).h.b((int) 1, true);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!s) {
	    ((uc) this).h.a(8448, -465309136, 8448);
	    ((uc) this).h.b(0, 768, 768, 5890);
	    ((uc) this).h.b((int) 2, true);
	    ((uc) this).h.a(8448, i ^ 0x1bbc6e03, 8448);
	    ((uc) this).h.b(0, 768, 768, 5890);
	    ((uc) this).h.b(1, 768, i ^ ~0x60cc, 34168);
	    ((uc) this).h.a(5890, 770, 0, true);
	} else {
	    ((uc) this).h.a(8448, -465309136, 8448);
	    ((uc) this).h.b(0, 768, 768, 5890);
	    ((uc) this).h.a(5890, 770, 0, true);
	}
	((uc) this).h.b((int) 0, true);
	k.a((byte) 66);
    }
    
    final boolean a(byte i) {
	if (i > -93)
	    a(63, 9, 96);
	l++;
	return true;
    }
}
