/* hf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class hf extends cl
{
    private gaa t;
    private ls u;
    private boolean v;
    private IDirect3DVertexShader w;
    private static float[] x = new float[4];
    private IDirect3DVertexShader y;
    private IDirect3DVertexShader z;
    private boolean A;
    private static float[] B = new float[16];
    private IDirect3DVertexShader C;
    private IDirect3DVertexShader D;
    
    hf(gaa var_gaa, pl var_pl) {
	super(var_gaa);
	t = var_gaa;
	if (var_pl != null
	    && (0xffff & ((gaa) t).Bg.VertexShaderVersion) >= 257) {
	    D = ((gaa) t).Hg.a(var_pl.a(70, "dx", "uw_ground_unlit"));
	    y = ((gaa) t).Hg.a(var_pl.a(83, "dx", "uw_ground_lit"));
	    C = ((gaa) t).Hg.a(var_pl.a(124, "dx", "uw_model_unlit"));
	    w = ((gaa) t).Hg.a(var_pl.a(122, "dx", "uw_model_lit"));
	    if (null != w & (null != C & (null != D & null != y))) {
		u = ((hf) this).l.a(2, false, 1, new int[] { 0, -1 },
				    (byte) 119);
		u.a((byte) -81, false, false);
		A = true;
	    } else
		A = false;
	} else
	    A = false;
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    C = null;
	return A;
    }
    
    final void a(boolean bool, boolean bool_0_) {
	if (bool != true)
	    A = true;
    }
    
    final void a(int i, int i_1_, hfa var_hfa) {
	if (var_hfa != null) {
	    ((hf) this).l.a(var_hfa, 0);
	    ((hf) this).l.f(i, 0);
	} else {
	    ((hf) this).l.a(((en) ((hf) this).l).fe, 0);
	    ((hf) this).l.f(1, 0);
	    ((hf) this).l.a(0, 1, bu.u);
	    ((hf) this).l.a(0, bu.u, -18836);
	}
	if (i_1_ < 47)
	    y = null;
    }
    
    final void e(int i) {
	IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	int i_2_ = ((hf) this).l.c(true);
	mga var_mga = ((hf) this).l.l((byte) 88);
	IDirect3DVertexShader idirect3dvertexshader;
	if (v)
	    idirect3dvertexshader = i_2_ != 2147483647 ? w : y;
	else
	    idirect3dvertexshader = i_2_ != 2147483647 ? C : D;
	if (z != idirect3dvertexshader) {
	    z = idirect3dvertexshader;
	    idirect3ddevice.SetVertexShader(idirect3dvertexshader);
	    f(105);
	    c((int) 104);
	    c((byte) -55);
	    b((byte) -116);
	    a(false);
	    b(26185);
	}
	var_mga.a(0.0F, x, -1.0F, i ^ i, (float) i_2_, 0.0F);
	idirect3ddevice.a(12, x);
    }
    
    final void b(byte i) {
	if (i < -114) {
	    if (null != z) {
		IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
		mga var_mga = t.Q(3);
		idirect3ddevice.a(0, var_mga.d(-5928, B));
	    }
	}
    }
    
    final void c(byte i) {
	if (i > -35)
	    t = null;
	if (null != z) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    mga var_mga = ((hf) this).l.f(true);
	    idirect3ddevice.SetVertexShaderConstantF(8, var_mga.a(-26631, B),
						     2);
	}
    }
    
    final void a(int i, int i_3_, byte i_4_) {
	if (i_4_ != 65)
	    w = null;
    }
    
    private final void f(int i) {
	if (null != z && v) {
	    mga var_mga = ((hf) this).l.Z(-9813);
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    idirect3ddevice.a
		(13, ((en) ((hf) this).l).Nf * ((en) ((hf) this).l).ke,
		 ((en) ((hf) this).l).Nf * ((en) ((hf) this).l).cf,
		 ((en) ((hf) this).l).Nf * ((en) ((hf) this).l).Ie, 1.0F);
	    idirect3ddevice.a
		(14, ((en) ((hf) this).l).ke * ((en) ((hf) this).l).Xe,
		 ((en) ((hf) this).l).Xe * ((en) ((hf) this).l).cf,
		 ((en) ((hf) this).l).Xe * ((en) ((hf) this).l).Ie, 1.0F);
	    idirect3ddevice.a
		(16, ((en) ((hf) this).l).mf * ((en) ((hf) this).l).ke,
		 ((en) ((hf) this).l).cf * ((en) ((hf) this).l).mf,
		 ((en) ((hf) this).l).mf * ((en) ((hf) this).l).Ie, 1.0F);
	    var_mga.a(((en) ((hf) this).l).Of[0], x,
		      ((en) ((hf) this).l).Of[1], ((en) ((hf) this).l).Of[2],
		      12342);
	    idirect3ddevice.SetVertexShaderConstantF(15, x, 1);
	    var_mga.a(((en) ((hf) this).l).gf[0], x,
		      ((en) ((hf) this).l).gf[1], ((en) ((hf) this).l).gf[2],
		      12342);
	    idirect3ddevice.SetVertexShaderConstantF(17, x, 1);
	}
	if (i <= 86)
	    c((int) -89);
    }
    
    final void a(boolean bool) {
	if (z != null) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    mga var_mga = t.Q(3);
	    idirect3ddevice.a(0, var_mga.d(-5928, B));
	}
	if (bool)
	    v = true;
    }
    
    final void d(int i) {
	((hf) this).l.e(0, 1);
	((hf) this).l.a((hfa) null, 0);
	((hf) this).l.a(Class_rf.e, true, Class_rf.e);
	((hf) this).l.a(0, i + 19093, mca.l);
	((hf) this).l.a(2, 1, ik.o);
	((hf) this).l.a(0, mca.l, -18836);
	if (i != -19092)
	    a(14, true);
	((hf) this).l.e(0, 0);
	((hf) this).l.a(0, 1, mca.l);
	((hf) this).l.a(0, mca.l, -18836);
	if (z != null) {
	    ((gaa) t).Hg.SetVertexShader(null);
	    z = null;
	}
    }
    
    final void c(int i) {
	if (null != z) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    idirect3ddevice.a(4, ((hf) this).l.a(85, B));
	}
	int i_5_ = 25 / ((54 - i) / 37);
    }
    
    final void a(int i, boolean bool) {
	int i_6_ = 95 / ((52 - i) / 36);
	v = bool;
	((hf) this).l.e(0, 1);
	((hf) this).l.a(u, 0);
	((hf) this).l.a(wi.e, true, ku.k);
	((hf) this).l.a(0, 1, ik.o);
	((hf) this).l.a(false, mca.l, 2, true, (byte) -66);
	((hf) this).l.a(0, bu.u, -18836);
	((hf) this).l.e(0, 0);
	e(-16573);
    }
    
    final void b(int i) {
	if (z != null) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    int i_7_ = ((hf) this).l.U();
	    int i_8_ = ((hf) this).l.BA();
	    float f = (float) i_7_ - (float) (i_7_ - i_8_) * 0.125F;
	    float f_9_ = (float) i_7_ - (float) (i_7_ - i_8_) * 0.25F;
	    idirect3ddevice.a(10, f_9_, 1.0F / (f - f_9_), f,
			      1.0F / ((float) i_7_ - f));
	    idirect3ddevice.a(11, 1.0F / (float) ((hf) this).l.U(i - 26176),
			      (float) ((hf) this).l.S(-30561) / 255.0F,
			      ((en) ((hf) this).l).bf,
			      1.0F / (((en) ((hf) this).l).bf
				      - ((en) ((hf) this).l).ce));
	    ((hf) this).l.c((byte) 48, ((hf) this).l.d(true));
	}
	if (i != 26185)
	    z = null;
    }
}
