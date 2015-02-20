/* hd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;

final class hd extends cl
{
    private IDirect3DPixelShader t;
    private gaa u;
    private boolean v;
    private IDirect3DVertexShader w;
    private bd x;
    private boolean y;
    private static float[] z = new float[16];
    
    final void a(boolean bool) {
	if (bool)
	    b((byte) -126);
	if (v) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    mga var_mga = u.l((byte) 88);
	    mga var_mga_0_ = u.Q(3);
	    idirect3ddevice.a(0, var_mga_0_.d(-5928, z));
	    idirect3ddevice.a(4, var_mga.b(-83, z));
	}
    }
    
    final void a(int i, int i_1_, hfa var_hfa) {
	if (i_1_ < 47)
	    u = null;
    }
    
    final void a(int i, boolean bool) {
	int i_2_ = 18 % ((i - 52) / 36);
	oq var_oq = ((hd) this).l.R(2);
	if (y && null != var_oq) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    idirect3ddevice.SetVertexShader(w);
	    idirect3ddevice.SetPixelShader(t);
	    ((hd) this).l.e(0, 1);
	    ((hd) this).l.a(var_oq, 0);
	    ((hd) this).l.e(0, 0);
	    ((hd) this).l.a(((bd) x).h, 0);
	    v = true;
	    a(false);
	    c((byte) -103);
	    c((int) -95);
	    b(26185);
	    idirect3ddevice.b(1, -((en) ((hd) this).l).Of[0],
			      -((en) ((hd) this).l).Of[1],
			      -((en) ((hd) this).l).Of[2], 0.0F);
	    idirect3ddevice.b(2, ((en) ((hd) this).l).ke,
			      ((en) ((hd) this).l).cf, ((en) ((hd) this).l).Ie,
			      1.0F);
	    idirect3ddevice.b(3, (Math.abs(((en) ((hd) this).l).Of[1]) * 928.0F
				  + 96.0F), 0.0F, 0.0F, 0.0F);
	}
    }
    
    final void a(int i, int i_3_, byte i_4_) {
	if (i_4_ == 65) {
	    if (v) {
		IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
		int i_5_ = 1 << (0x3 & i);
		float f = (float) (1 << (0x7 & i >> 3)) / 32.0F;
		int i_6_ = 0xffff & i_3_;
		idirect3ddevice.a(14,
				  (float) (i_5_ * ((en) ((hd) this).l).Me
					   % 40000) / 40000.0F,
				  0.0F, 0.0F, 0.0F);
		float f_7_ = (float) (i_3_ >> 16 & 0x3) / 8.0F;
		idirect3ddevice.a(15, f, 0.0F, 0.0F, 0.0F);
		idirect3ddevice.b(4, (float) i_6_, 0.0F, 0.0F, 0.0F);
		idirect3ddevice.b(5, f_7_, 0.0F, 0.0F, 0.0F);
	    }
	}
    }
    
    final void c(int i) {
	int i_8_ = 18 % ((54 - i) / 37);
	if (v) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    idirect3ddevice.a(8, ((hd) this).l.a(88, z));
	}
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    w = null;
	return y;
    }
    
    final void c(byte i) {
	if (v) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    mga var_mga = ((hd) this).l.f(true);
	    idirect3ddevice.SetVertexShaderConstantF(12, var_mga.a(-26631, z),
						     2);
	}
	if (i > -35)
	    a(true, true);
    }
    
    final void b(int i) {
	if (v) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    if (0 < ((en) ((hd) this).l).Gf) {
		float f = ((en) ((hd) this).l).bf;
		float f_9_ = ((en) ((hd) this).l).ce;
		idirect3ddevice.a(16, f, 1.0F / (f - f_9_), 0.0F, 0.0F);
	    } else
		idirect3ddevice.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
	    idirect3ddevice.b
		(0, (float) (0xff & ((en) ((hd) this).l).lf >> 16) / 255.0F,
		 (float) (((en) ((hd) this).l).lf >> 8 & 0xff) / 255.0F,
		 (float) (0xff & ((en) ((hd) this).l).lf) / 255.0F, 0.0F);
	}
	if (i != 26185)
	    a(false, false);
    }
    
    final void d(int i) {
	if (i != -19092)
	    y = true;
	if (v) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    idirect3ddevice.SetVertexShader(null);
	    idirect3ddevice.SetPixelShader(null);
	    ((hd) this).l.e(0, 1);
	    ((hd) this).l.a((hfa) null, 0);
	    ((hd) this).l.e(0, 0);
	    ((hd) this).l.a((hfa) null, 0);
	    v = false;
	}
    }
    
    hd(gaa var_gaa, pl var_pl, bd var_bd) {
	super(var_gaa);
	u = var_gaa;
	x = var_bd;
	if (var_pl == null || !((en) ((hd) this).l).ge
	    || !((en) ((hd) this).l).Jf
	    || (0xffff & ((gaa) u).Bg.VertexShaderVersion) < 257) {
	    y = false;
	    t = null;
	    w = null;
	} else {
	    w = ((gaa) u).Hg.a(var_pl.a(117, "dx",
					"environment_mapped_water_v"));
	    t = ((gaa) u).Hg.b(var_pl.a(111, "dx",
					"environment_mapped_water_f"));
	    y = w != null && null != t && x.a(true);
	}
    }
    
    final void b(byte i) {
	if (v) {
	    IDirect3DDevice idirect3ddevice = ((gaa) u).Hg;
	    mga var_mga = u.Q(3);
	    idirect3ddevice.a(0, var_mga.d(-5928, z));
	}
	if (i > -114)
	    u = null;
    }
    
    final void a(boolean bool, boolean bool_10_) {
	if (bool != true)
	    w = null;
    }
}
