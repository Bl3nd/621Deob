/* jr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class jr extends uc
{
    static int i;
    static int colourId = 0;
    static int k;
    static int l;
    static wea m = new wea(4, 1);
    private pea n;
    private Class_fb o;
    static int p;
    private gs q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static hv[] w;
    
    final void b(int i, boolean bool) {
	if (((qj) ((uc) this).h).bf > 0) {
	    float f = -0.5F / (float) ((qj) ((uc) this).h).bf;
	    ((uc) this).h.b((int) 1, true);
	    jk.n[3] = f * ((qj) ((uc) this).h).ff + 0.25F;
	    jk.n[2] = f;
	    jk.n[0] = 0.0F;
	    jk.n[1] = 0.0F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, jk.n, 0);
	    OpenGL.glPopMatrix();
	    ((uc) this).h.a(1, 0.5F, (float) ((qj) ((uc) this).h).bf);
	    ((uc) this).h.a(q, -2);
	    ((uc) this).h.b((int) 0, true);
	}
	l++;
	o.a(-29240, '\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
	int i_0_ = -14 / ((65 - i) / 60);
    }
    
    private final void b(int i) {
	k++;
	o = new Class_fb(((uc) this).h, 2);
	o.a(0, 0);
	((uc) this).h.b((int) 1, true);
	((uc) this).h.a(7681, -465309136, 260);
	((uc) this).h.b(0, 768, 768, 34168);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	((uc) this).h.b((int) 0, true);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (((pea) n).a) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	o.a((byte) 80);
	o.a(1, i);
	((uc) this).h.b((int) 1, true);
	((uc) this).h.a(8448, -465309136, 8448);
	((uc) this).h.b(i, 768, 768, 5890);
	OpenGL.glDisable(3168);
	((uc) this).h.b((int) 0, true);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (((pea) n).a) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	o.a((byte) 120);
    }
    
    final void a(int i, int i_1_, rg var_rg) {
	if (i_1_ == 7)
	    u++;
    }
    
    static final tt a(boolean bool, int i, int i_2_, byte i_3_, int i_4_) {
	r++;
	tt var_tt = new tt();
	((tt) var_tt).k = i;
	int i_5_ = 67 / ((71 - i_3_) / 44);
	((tt) var_tt).l = i_4_;
	ida.l.a(var_tt, (byte) -28, (long) i_2_);
	NPCNode.a(-122, i_4_);
	Interface var_kp = efa.a(-1018745488, i_2_);
	if (var_kp != null)
	    tn.a(var_kp, 1023);
	if (rd.D != null) {
	    tn.a(rd.D, 1023);
	    rd.D = null;
	}
	in.b((byte) -121);
	if (var_kp != null)
	    Class_kf.a(var_kp, false, !bool);
	if (!bool)
	    ClientScriptHandler.a(i_4_);
	if (!bool && Class_vb.u != -1)
	    cea.b(-1630137275, Class_vb.u, 1);
	return var_tt;
    }
    
    final void a(int i) {
	t++;
	o.a(-29240, '\001');
	if (i == 1268) {
	    if (((qj) ((uc) this).h).bf > 0) {
		((uc) this).h.b((int) 1, true);
		((uc) this).h.a((rg) null, -2);
		((uc) this).h.a(1, 1.0F, 0.0F);
		((uc) this).h.b((int) 0, true);
	    }
	    ((uc) this).h.a(8448, -465309136, 8448);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    jr(qj var_qj, pea var_pea) {
	super(var_qj);
	n = var_pea;
	b((int) 0);
	q = new gs(((uc) this).h, 6406, 2, new byte[] { 0, -1 }, 6406);
	q.a(-40, false);
    }
    
    final boolean a(byte i) {
	p++;
	if (i >= -93)
	    a(-2, true);
	return true;
    }
    
    static final boolean c(int i) {
	s++;
	if (i != 3171)
	    return true;
	boolean bool = true;
	if (taa.g == null) {
	    if (sm.a.g(1912, LoginStream.Tb))
		taa.g = aga.b(sm.a, LoginStream.Tb);
	    else
		bool = false;
	}
	if (bq.j == null) {
	    if (!sm.a.g(1912, dk.A))
		bool = false;
	    else
		bq.j = aga.b(sm.a, dk.A);
	}
	if (hq.f == null) {
	    if (!sm.a.g(1912, bea.n))
		bool = false;
	    else
		hq.f = aga.b(sm.a, bea.n);
	}
	if (LoginStream.sa == null) {
	    if (cs.i.g(1912, ci.m))
		LoginStream.sa = GameOutPacket.a(cs.i, ci.m, (byte) 32);
	    else
		bool = false;
	}
	if (uk.c == null) {
	    if (!sm.a.g(i ^ 0xb1b, ci.m))
		bool = false;
	    else
		uk.c = aga.a(sm.a, ci.m);
	}
	return bool;
    }
    
    final void a(int i, int i_6_, int i_7_) {
	if (i_6_ != 50)
	    c((int) -126);
	jr.i++;
	if ((i & 0x1) == 1) {
	    if (!((pea) n).a) {
		int i_8_ = 16 * (((qj) ((uc) this).h).je % 4000) / 4000;
		((uc) this).h.a(((pea) n).e[i_8_], -2);
	    } else {
		((uc) this).h.a(((pea) n).i, -2);
		jk.n[2] = 0.0F;
		jk.n[3] = (float) (((qj) ((uc) this).h).je % 4000) / 4000.0F;
		jk.n[1] = 0.0F;
		jk.n[0] = 0.0F;
		OpenGL.glTexGenfv(8194, 9473, jk.n, 0);
	    }
	} else if (!((pea) n).a)
	    ((uc) this).h.a(((pea) n).e[0], -2);
	else {
	    ((uc) this).h.a(((pea) n).i, i_6_ - 52);
	    jk.n[3] = 0.0F;
	    jk.n[1] = 0.0F;
	    jk.n[2] = 0.0F;
	    jk.n[0] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, jk.n, 0);
	}
    }
    
    final void a(int i, boolean bool) {
	if (i > -64)
	    b((int) -65);
	((uc) this).h.a(260, -465309136, 8448);
	v++;
    }
    
    public static void d(int i) {
	w = null;
	m = null;
	if (i != 8194)
	    a(false, 62, -120, (byte) 56, -33);
    }
}
