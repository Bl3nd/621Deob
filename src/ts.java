/* ts - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class ts extends cl
{
    private gaa t;
    private static float[] u = new float[16];
    private bd v;
    private IDirect3DVertexShader w;
    
    final void c(byte i) {
	if (i > -35)
	    v = null;
	if (null != w) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    mga var_mga = ((ts) this).l.f(true);
	    var_mga.a(-26631, u);
	    u[7] *= 0.25F;
	    u[0] *= 0.25F;
	    u[2] *= 0.25F;
	    u[4] *= 0.25F;
	    u[3] *= 0.25F;
	    u[1] *= 0.25F;
	    u[5] *= 0.25F;
	    u[6] *= 0.25F;
	    idirect3ddevice.SetVertexShaderConstantF(8, u, 2);
	}
    }
    
    final void a(boolean bool, boolean bool_0_) {
	((ts) this).l.a(wi.e, bool, hn.f);
    }
    
    final void a(int i, int i_1_, byte i_2_) {
	IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	if (i_2_ != 65)
	    w = null;
	if (!((bd) v).e) {
	    int i_3_ = ((en) ((ts) this).l).Me % 4000 * 16 / 4000;
	    ((ts) this).l.a(((bd) v).c[i_3_], i_2_ ^ 0x41);
	    idirect3ddevice.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
	} else {
	    float f = (float) (((en) ((ts) this).l).Me % 4000) / 4000.0F;
	    ((ts) this).l.a(((bd) v).b, 0);
	    idirect3ddevice.a(11, f, 0.0F, 0.0F, 0.0F);
	}
    }
    
    final void a(int i, int i_4_, hfa var_hfa) {
	if (i_4_ <= 47)
	    w = null;
    }
    
    final void a(boolean bool) {
	if (null != w) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    mga var_mga = t.Q(3);
	    idirect3ddevice.a(0, var_mga.d(-5928, u));
	}
	if (bool)
	    v = null;
    }
    
    ts(gaa var_gaa, pl var_pl, bd var_bd) {
	super(var_gaa);
	t = var_gaa;
	v = var_bd;
	if (null != var_pl && v.a((byte) -80)
	    && (0xffff & ((gaa) t).Bg.VertexShaderVersion) >= 257)
	    w = ((gaa) t).Hg.a(var_pl.a(115, "dx", "transparent_water"));
	else
	    w = null;
    }
    
    final void d(int i) {
	((gaa) t).Hg.SetVertexShader(null);
	((ts) this).l.a(0, 1, mca.l);
	if (i == -19092) {
	    ((ts) this).l.a(1, 1, eda.h);
	    ((ts) this).l.a(2, 1, ik.o);
	    ((ts) this).l.a(true, (byte) -99);
	}
    }
    
    final void b(byte i) {
	if (i <= -114) {
	    if (null != w) {
		IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
		mga var_mga = t.Q(3);
		idirect3ddevice.a(0, var_mga.d(-5928, u));
	    }
	}
    }
    
    final void c(int i) {
	int i_5_ = 18 / ((54 - i) / 37);
	if (w != null) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    idirect3ddevice.a(4, ((ts) this).l.a(66, u));
	}
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    w = null;
	return w != null;
    }
    
    final void a(int i, boolean bool) {
	int i_6_ = -9 % ((52 - i) / 36);
	((gaa) t).Hg.SetVertexShader(w);
	((ts) this).l.a(0, 1, mca.l);
	((ts) this).l.a(1, 1, ik.o);
	((ts) this).l.a(true, eda.h, 2, false, (byte) 44);
	((ts) this).l.a(false, (byte) -99);
	b((byte) -123);
	c((byte) -116);
	c((int) 96);
	b(26185);
    }
    
    final void b(int i) {
	if (null != w) {
	    IDirect3DDevice idirect3ddevice = ((gaa) t).Hg;
	    if (((en) ((ts) this).l).Gf <= 0)
		idirect3ddevice.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
	    else {
		float f = ((en) ((ts) this).l).bf;
		float f_7_ = ((en) ((ts) this).l).ce;
		float f_8_ = f_7_ - 512.0F;
		idirect3ddevice.a(10, f_8_, 1.0F / (f_7_ - f_8_), f_7_,
				  1.0F / (f - f_7_));
	    }
	    ((ts) this).l.c((byte) 48, ((en) ((ts) this).l).lf);
	}
	if (i != 26185)
	    v = null;
    }
}
