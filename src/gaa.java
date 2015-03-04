/* gaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

import jaclib.peer.am;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.PixelBuffer;
import jagdx.bs;
import jagdx.qr;

public final class gaa extends en
{
    private boolean[] sg;
    private D3DPRESENT_PARAMETERS tg;
    private boolean[] ug;
    private D3DLIGHT vg;
    private int wg = 0;
    private static float[] xg;
    private mv[] yg;
    private IDirect3D zg;
    boolean Ag;
    D3DCAPS Bg;
    private boolean[] Cg;
    private static int[] Dg = { 22, 23 };
    private int Eg;
    boolean Fg;
    private int[] Gg;
    IDirect3DDevice Hg;
    private D3DLIGHT Ig;
    private D3DLIGHT Jg;
    boolean Kg;
    PixelBuffer Lg;
    am Mg;
    private boolean Ng = false;
    private boolean[] Og;
    GeometryBuffer Pg;
    private int Qg;
    private oo Rg;
    private static int[] Sg;
    
    final void ya() {
	this.c(true, (byte) -25);
	((gaa) this).Hg.Clear(2, 0, 1.0F, 0);
    }
    
    final void B(int i) {
	if (i >= -53)
	    ((gaa) this).Lg = null;
	((gaa) this).bf = (float) (((gaa) this).Ae - ((gaa) this).qf);
	((gaa) this).ce = ((gaa) this).bf - (float) ((gaa) this).Gf;
	if (((gaa) this).ce < (float) ((gaa) this).Af)
	    ((gaa) this).ce = (float) ((gaa) this).Af;
	((gaa) this).Hg.a(36, ((gaa) this).ce);
	((gaa) this).Hg.a(37, ((gaa) this).bf);
	((gaa) this).Hg.SetRenderState(34, ((gaa) this).lf);
    }
    
    final void h(byte i) {
	((gaa) this).Hg.SetViewport(((gaa) this).pf, ((gaa) this).Se,
				    ((gaa) this).R, ((gaa) this).sb, 0.0F,
				    1.0F);
	if (i != 116)
	    Jg = null;
    }
    
    final void a(Object object, byte i, Canvas canvas) {
	Rg = (oo) object;
	int i_0_ = 124 / ((i - 8) / 55);
    }
    
    final ls a(int[] is, int i, boolean bool, int i_1_, int i_2_, int i_3_,
	       int i_4_) {
	if (i != 3)
	    return null;
	return new gt(this, i_3_, i_4_, bool, is, i_2_, i_1_);
    }
    
    final boolean bloom() {
	return false;
    }
    
    final void a(boolean bool, int i, Class_gb var_gb, boolean bool_5_) {
	int i_6_ = i;
	int i_7_;
    while_40_:
	do {
	    do {
		if (1 != i_6_) {
		    if (2 != i_6_)
			break;
		} else {
		    i_7_ = 6;
		    break while_40_;
		}
		i_7_ = 27;
		break while_40_;
	    } while (false);
	    i_7_ = 5;
	} while (false);
	int i_8_ = 0;
	if (bool)
	    i_8_ |= 0x10;
	((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, i_7_,
					     i_8_ | a((byte) 82, var_gb));
	if (bool_5_)
	    A(127);
    }
    
    final void s() {
	/* empty */
    }
    
    final void o(int i) {
	int i_9_ = 115 / ((82 - i) / 40);
	((gaa) this).Hg.SetScissorRect(((gaa) this).kf + ((gaa) this).pf,
				       ((gaa) this).Se + ((gaa) this).Rf,
				       ((gaa) this).Pf, ((gaa) this).of);
    }
    
    final void a(boolean bool, Class_gb var_gb, int i, boolean bool_10_,
		 byte i_11_) {
	int i_12_ = -100 / ((i_11_ + 17) / 34);
	int i_13_ = i;
	int i_14_;
    while_41_:
	do {
	    do {
		if (i_13_ != 1) {
		    if (i_13_ != 2)
			break;
		} else {
		    i_14_ = 3;
		    break while_41_;
		}
		i_14_ = 26;
		break while_41_;
	    } while (false);
	    i_14_ = 2;
	} while (false);
	int i_15_ = 0;
	if (bool_10_)
	    i_15_ |= 0x20;
	if (bool)
	    i_15_ |= 0x10;
	((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, i_14_,
					     a((byte) 78, var_gb) | i_15_);
    }
    
    final void a(rca var_rca, int i) {
	int i_16_ = 0;
	if (var_rca == tj.i)
	    i_16_ = 65536;
	else if (Interface.Yc == var_rca)
	    i_16_ = 131072;
	else if (Class_kb.p == var_rca)
	    i_16_ = 196608;
	int i_17_ = -50 % ((80 - i) / 38);
	((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, 11,
					     i_16_ | ((gaa) this).Te);
    }
    
    private static final int a(int i, mv var_mv) {
	if (dda.d == var_mv)
	    return 2;
	if (eg.T == var_mv)
	    return 1;
	if (i != 1)
	    xg = null;
	throw new IllegalArgumentException();
    }
    
    final void v(byte i) {
	if (((gaa) this).Mf.b(3))
	    ((gaa) this).Vd.a((byte) 68, xg);
	else {
	    xg[8] = 0.0F;
	    xg[1] = 0.0F;
	    xg[6] = 0.0F;
	    xg[9] = 0.0F;
	    xg[0] = 1.0F;
	    xg[4] = 0.0F;
	    xg[10] = 1.0F;
	    xg[7] = 0.0F;
	    xg[2] = 0.0F;
	    xg[15] = 1.0F;
	    xg[5] = 1.0F;
	    xg[13] = 0.0F;
	    xg[11] = 0.0F;
	    xg[12] = 0.0F;
	    xg[3] = 0.0F;
	    xg[14] = 0.0F;
	}
	((gaa) this).Hg.SetTransform(2, xg);
	if (i > -119)
	    a();
    }
    
    final hh b(boolean bool, int i) {
	if (i != 16)
	    return null;
	return new kda(this, bt.h, bool);
    }
    
    final void s(int i) {
	vg.SetAmbient(((gaa) this).Nf * ((gaa) this).ke,
		      ((gaa) this).Nf * ((gaa) this).cf,
		      ((gaa) this).Nf * ((gaa) this).Ie, (float) i);
	Ng = false;
    }
    
    final void d(boolean bool, byte i) {
	if (i < -51)
	    ((gaa) this).Hg.a(161, bool);
    }
    
    final void renderProfile(boolean profile) {
	/* empty */
    }
    
    final void M(int i) {
	int i_18_;
	for (i_18_ = 0; i_18_ < ((gaa) this).uf; i_18_++) {
	    gga var_gga = ((gaa) this).Tf[i_18_];
	    int i_19_ = i_18_ + 2;
	    int i_20_ = var_gga.a((int) 45);
	    float f = var_gga.b(i ^ 0x65) / 255.0F;
	    Ig.SetPosition((float) var_gga.a(true), (float) var_gga.i(-111),
			   (float) var_gga.b((byte) 119));
	    Ig.SetDiffuse(f * (float) ((i_20_ & 0xff2342) >> 16),
			  f * (float) ((0xff02 & i_20_) >> 8),
			  f * (float) (i_20_ & 0xff), 0.0F);
	    Ig.SetAttenuation(0.0F, 0.0F,
			      1.0F / (float) (var_gga.a((byte) 108)
					      * var_gga.a((byte) -81)));
	    Ig.SetRange((float) var_gga.a((byte) 70));
	    ((gaa) this).Hg.SetLight(i_19_, Ig);
	    ((gaa) this).Hg.LightEnable(i_19_, true);
	}
	for (/**/; ((gaa) this).we > i_18_; i_18_++)
	    ((gaa) this).Hg.LightEnable(i_18_ + 2, false);
	super.M(i);
    }
    
    final void F(int i) {
	((gaa) this).Hg.a(174, ((gaa) this).qg);
	if (i <= 45)
	    b((byte) 78, -61);
    }
    
    final void k(boolean bool) {
	if (bool != true)
	    Cg = null;
	if (IncomingPackets.lea != ((gaa) this).Ve) {
	    if (((gaa) this).Ve == Class_ug.H) {
		((gaa) this).Hg.SetRenderState(19, 2);
		((gaa) this).Hg.SetRenderState(20, 2);
	    } else if (((gaa) this).Ve == Class_ag.h) {
		((gaa) this).Hg.SetRenderState(19, 9);
		((gaa) this).Hg.SetRenderState(20, 2);
	    }
	} else {
	    ((gaa) this).Hg.SetRenderState(19, 5);
	    ((gaa) this).Hg.SetRenderState(20, 6);
	}
    }
    
    final void I(int i) {
	((gaa) this).Hg.a(7, ((gaa) this).He);
	if (i != 0)
	    zg = null;
    }
    
    final boolean a(int i, bt var_bt, Class_ec class_ec) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	if (i <= 25)
	    b((int) -93, (ki) null);
	return (qr.a(zg.a(Qg, d3ddisplaymode), -2005530519)
		&& qr.a(zg.CheckDeviceFormat(Qg, Eg, d3ddisplaymode.Format, 0,
					     3, a(class_ec, var_bt, true)),
			-2005530519));
    }
    
    final float r(byte i) {
	int i_21_ = 79 % ((1 - i) / 37);
	return -0.5F;
    }
    
    final void u(int i) {
	D(i - 25689);
	v(i + 4);
	if (i != 1)
	    a((byte) -38, (Class_gb) null);
    }
    
    final void a(int i, Object object, Canvas canvas) {
	if (((gaa) this).A == canvas) {
	    Dimension dimension = canvas.getSize();
	    if (dimension.width > 0 && 0 < dimension.height) {
		((gaa) this).Hg.EndScene();
		ab(i ^ 0x7);
		((gaa) this).Hg.BeginScene();
	    }
	}
	if (i != 7)
	    wg = -53;
    }
    
    final void k(int i) {
	if (i != 1)
	    j((int) 40);
	((gaa) this).Hg.a(14, ((gaa) this).wf && ((gaa) this).af);
    }
    
    final void a(f var_f, boolean bool) {
	/* empty */
    }
    
    final void g(boolean bool) {
	if (bool)
	    Sg = null;
	((gaa) this).Hg.a(27, ((gaa) this).Uf);
    }
    
    final void i(boolean bool) {
	vg.SetDirection(-((gaa) this).Of[0], -((gaa) this).Of[1],
			-((gaa) this).Of[2]);
	Jg.SetDirection(-((gaa) this).gf[0], -((gaa) this).gf[1],
			-((gaa) this).gf[2]);
	Ng = bool;
    }
    
    final void a(ep var_ep, boolean bool) {
	a(-22, var_ep);
	if (bool == true) {
	    if (!Cg[((gaa) this).Te]) {
		((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 1, 1);
		Cg[((gaa) this).Te] = true;
	    }
	    if (!sg[((gaa) this).Te]) {
		((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 2, 1);
		sg[((gaa) this).Te] = true;
	    }
	}
    }
    
    final void a(byte i, nba var_nba, int i_22_) {
	if (i == -16) {
	    ov var_ov = (ov) var_nba;
	    ((gaa) this).Hg.SetStreamSource(i_22_, ((ov) var_ov).g, 0,
					    var_ov.b((byte) -102));
	}
    }
    
    final oq a(boolean bool, boolean bool_23_, int i, int[][] is) {
	if (bool_23_ != true)
	    k((int) 124);
	return new paa(this, i, bool, is);
    }
    
    final void n(byte i) {
	if (Class_jg.H != ((gaa) this).Sf[((gaa) this).Te]) {
	    if (ck.J == ((gaa) this).Sf[((gaa) this).Te])
		((gaa) this).Hg.SetTransform(((gaa) this).Te + 16,
					     ((gaa) this).xf
						 [((gaa) this).Te]
						 .a((byte) 68, xg));
	    else
		((gaa) this).Hg.SetTransform(((gaa) this).Te + 16,
					     ((gaa) this).xf
						 [((gaa) this).Te].c(77, xg));
	    int i_24_ = b(1, ((gaa) this).Sf[((gaa) this).Te]);
	    if (Gg[((gaa) this).Te] != i_24_) {
		((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, 24,
						     i_24_);
		Gg[((gaa) this).Te] = i_24_;
	    }
	} else {
	    ((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, 24, 0);
	    Gg[((gaa) this).Te] = 0;
	}
	int i_25_ = -125 / ((i + 25) / 60);
    }
    
    final ls a(float[] fs, int i, int i_26_, int i_27_, boolean bool,
	       int i_28_, int i_29_, Class_ec class_ec) {
	if (i_27_ != 10)
	    q();
	return null;
    }
    
    final GraphicsCard y() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier = zg.a(Qg, 0);
	return new GraphicsCard(d3dadapter_identifier.VendorID, "Direct3D", 9,
		      d3dadapter_identifier.Description,
		      d3dadapter_identifier.DriverVersion);
    }
    
    private static final int a(byte i, Class_gb var_gb) {
	if (var_gb == mca.l)
	    return 2;
	if (var_gb == eda.h)
	    return 0;
	if (bu.u == var_gb)
	    return 1;
	if (var_gb == ik.o)
	    return 3;
	if (i <= 49)
	    Dg = null;
	throw new IllegalArgumentException();
    }
    
    final void a(int i, lt var_lt, int i_30_, int i_31_, int i_32_, int i_33_,
		 hh var_hh) {
	((gaa) this).Hg.SetIndices(((kda) (kda) var_hh).d);
	((gaa) this).Hg.DrawIndexedPrimitive(a(var_lt, (byte) 116), 0, i_33_,
					     i, i_30_, i_32_);
	if (i_31_ != 12896)
	    b((byte) -23, -99);
    }
    
    final void u() throws uo {
	((gaa) this).Hg.EndScene();
	if (Rg.a((byte) 14)) {
	    wg = 0;
	    if (qr.a(true, Rg.a(true, 0)))
		ab(0);
	} else {
	    if (50 < ++wg)
		throw new uo();
	    ab(0);
	}
	((gaa) this).Hg.BeginScene();
    }
    
    final void a(int i, int i_34_, int i_35_, int i_36_) {
	/* empty */
    }
    
    static final Class_r createToolkit(Canvas canvas, fa var_fa, pl var_pl,
				       Integer integer) {
	gaa var_gaa = null;
	gaa var_gaa_37_;
	try {
	    int i = 0;
	    int i_38_ = 1;
	    am var_am = new am();
	    IDirect3D idirect3d = IDirect3D.a(-2147483616, var_am);
	    D3DCAPS d3dcaps = idirect3d.b(i, i_38_);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((0x2 & d3dcaps.TextureOpCaps) == 0)
		throw new RuntimeException("");
	    if ((0x8 & d3dcaps.TextureOpCaps) == 0)
		throw new RuntimeException("");
	    if (0 == (0x40 & d3dcaps.TextureOpCaps))
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((0x10 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps)) == 0)
		throw new RuntimeException("");
	    if ((0x20 & (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps)) == 0)
		throw new RuntimeException("");
	    if ((0x2 & (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps)) == 0)
		throw new RuntimeException("");
	    if (0 < d3dcaps.MaxActiveLights && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    if (!a(-98, i, integer.intValue(), i_38_, d3dpresent_parameters,
		   idirect3d))
		throw new RuntimeException("");
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    int i_39_ = 2;
	    if (0 != (0x100000 & d3dcaps.DevCaps))
		i_39_ |= 0x10;
	    Object object = null;
	    IDirect3DDevice idirect3ddevice;
	    try {
		idirect3ddevice = idirect3d.a(i, i_38_, canvas, i_39_ | 0x40,
					      d3dpresent_parameters);
	    } catch (bs var_bs) {
	    	idirect3ddevice = idirect3d.a(i, i_38_, canvas, 0x20 | i_39_, d3dpresent_parameters);
	    }
	    oo var_oo = new oo(idirect3ddevice.d(0), idirect3ddevice.b());
	    var_gaa = new gaa(i, i_38_, canvas, var_am, idirect3d,
			      idirect3ddevice, var_oo, d3dpresent_parameters,
			      d3dcaps, var_fa, var_pl, integer.intValue());
	    var_gaa.s((byte) -121);
	    var_gaa_37_ = var_gaa;
	} catch (RuntimeException runtimeexception) {
	    if (var_gaa != null)
		var_gaa.A();
	    throw runtimeexception;
	}
	return var_gaa_37_;
    }
    
    final boolean i() {
	return false;
    }
    
    final void u(byte i) {
	for (int i_40_ = 0; ((gaa) this).ff > i_40_; i_40_++) {
	    ((gaa) this).Hg.SetSamplerState(i_40_, 7, 0);
	    ((gaa) this).Hg.SetSamplerState(i_40_, 6, 2);
	    ((gaa) this).Hg.SetSamplerState(i_40_, 5, 2);
	    ((gaa) this).Hg.SetSamplerState(i_40_, 1, 1);
	    ((gaa) this).Hg.SetSamplerState(i_40_, 2, 1);
	    yg[i_40_] = dda.d;
	    Cg[i_40_] = sg[i_40_] = true;
	    ug[i_40_] = false;
	    Gg[i_40_] = 0;
	}
	((gaa) this).Hg.SetTextureStageState(0, 6, 1);
	((gaa) this).Hg.SetRenderState(9, 2);
	((gaa) this).Hg.SetRenderState(23, 4);
	((gaa) this).Hg.SetRenderState(25, 5);
	((gaa) this).Hg.SetRenderState(24, 0);
	((gaa) this).Hg.SetRenderState(22, 2);
	((gaa) this).Hg.SetRenderState(147, 1);
	((gaa) this).Hg.SetRenderState(145, 1);
	((gaa) this).Hg.a(38, 0.95F);
	((gaa) this).Hg.SetRenderState(140, 3);
	vg.SetType(3);
	Jg.SetType(3);
	Ig.SetType(1);
	Ng = false;
	super.u(i);
    }
    
    final void a(int i, qo var_qo) {
	((gaa) this).Hg.SetTexture(((gaa) this).Te, var_qo.c(-13997));
	if (((qo) var_qo).a != yg[((gaa) this).Te]) {
	    int i_41_ = a(1, ((qo) var_qo).a);
	    ((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 6, i_41_);
	    ((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 5, i_41_);
	    yg[((gaa) this).Te] = ((qo) var_qo).a;
	    if (((qo) var_qo).b == !ug[((gaa) this).Te]) {
		((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 7,
						(!((qo) var_qo).b ? 0
						 : a(1, ((qo) var_qo).a)));
		ug[((gaa) this).Te] = ((qo) var_qo).b;
	    }
	} else if (((qo) var_qo).b != ug[((gaa) this).Te]) {
	    ((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 7,
					    (!((qo) var_qo).b ? 0
					     : a(1, ((qo) var_qo).a)));
	    ug[((gaa) this).Te] = ((qo) var_qo).b;
	}
	if (i < -7) {
	    if (!Og[((gaa) this).Te]) {
		Og[((gaa) this).Te] = true;
		j((int) 2);
		x(-2);
	    }
	}
    }
    
    private static final int a(lt var_lt, byte i) {
	if (i <= 111)
	    a(95, -16, 0, 4, (D3DPRESENT_PARAMETERS) null, null);
	if (var_lt != oea.cb) {
	    if (var_lt == kfa.p)
		return 3;
	    if (ti.w == var_lt)
		return 1;
	    if (mo.E == var_lt)
		return 4;
	    if (mm.x == var_lt)
		return 6;
	    if (caa.F == var_lt)
		return 5;
	} else
	    return 2;
	throw new IllegalArgumentException("");
    }
    
    private static final int a(int i, nw var_nw) {
	if (var_nw == ku.k)
	    return 2;
	if (Class_rf.e == var_nw)
	    return 4;
	if (wi.e != var_nw) {
	    if (var_nw != hn.f) {
		if (var_nw == Login.nw)
		    return 10;
	    } else
		return 7;
	} else
	    return 26;
	if (i != -1)
	    xg = null;
	throw new IllegalArgumentException();
    }
    
    final void d(int i, int i_42_) {
	((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, 11, i_42_);
	if (i != 3)
	    ((gaa) this).Fg = false;
    }
    
    final Object a(Canvas canvas, int i) {
	if (i != 19449)
	    v((int) -21);
	return null;
    }
    
    final void W(int i) {
	((gaa) this).Hg.a(137, ((gaa) this).me && !((gaa) this).nf);
	if (i > -11)
	    a(false, null, 111, true, (byte) -78);
    }    

    private static final boolean a(int i1, int j1, int k1, int l1, D3DPRESENT_PARAMETERS d3dpresent_parameters, IDirect3D idirect3d)
    {
    	try {
        int i2;
        int j2;
        int k2;
        if(i1 > -94)
            xg = (float[])null;
        i2 = 0;
        j2 = 0;
        k2 = 0;
        D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
        if(qr.a(true, idirect3d.a(j1, d3ddisplaymode)))
            return false;
label0:
        for(; 0 <= k1; k1--)
        {
            if(1 == k1)
                continue;
            k2 = 0 + k1;
label1:
            for(int l2 = 0; l2 < Dg.length; l2++)
            {
                if(0 != idirect3d.CheckDeviceType(j1, l1, d3ddisplaymode.Format, Dg[l2], true) || 0 != idirect3d.CheckDeviceFormat(j1, l1, d3ddisplaymode.Format, 1, 1, Dg[l2]) || ~k1 != -1 && ~idirect3d.CheckDeviceMultiSampleType(j1, l1, Dg[l2], true, k2) != -1)
                    continue;
                int i3 = 0;
                do
                {
                    if(~i3 <= ~Sg.length)
                        continue label1;
                    if(0 == idirect3d.CheckDeviceFormat(j1, l1, d3ddisplaymode.Format, 2, 1, Sg[i3]) && idirect3d.CheckDepthStencilMatch(j1, l1, d3ddisplaymode.Format, Dg[l2], Sg[i3]) == 0 && (-1 == ~k1 || ~idirect3d.CheckDeviceMultiSampleType(j1, l1, Sg[l2], true, k2) == -1))
                    {
                        j2 = Dg[l2];
                        i2 = Sg[i3];
                        break label0;
                    }
                    i3++;
                } while(true);
            }

        }

        if(0 > k1 || -1 == ~j2 || -1 == ~i2)
            return false;
        d3dpresent_parameters.AutoDepthStencilFormat = i2;
        d3dpresent_parameters.BackBufferFormat = j2;
        d3dpresent_parameters.MultiSampleType = k2;
        d3dpresent_parameters.MultiSampleQuality = 0;
        return true;
    } catch(Throwable throwable) {
    	return false;
    }
    }
    
    final void a(boolean bool, mq var_mq) {
	dxVertexLayout var_dxVertexLayout = (dxVertexLayout) var_mq;
	((gaa) this).Hg
	    .SetVertexDeclaration(((dxVertexLayout) var_dxVertexLayout).iDirect3dVertexDeclaration);
	if (bool != true)
	    s();
    }
    
    final void a(gt var_gt, int i) {
	a(-110, var_gt);
	if (!Cg[((gaa) this).Te] != !((gt) var_gt).g) {
	    ((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 1,
					    ((gt) var_gt).g ? 1 : 3);
	    Cg[((gaa) this).Te] = ((gt) var_gt).g;
	}
	if (i == 0) {
	    if (!((gt) var_gt).j == sg[((gaa) this).Te]) {
		((gaa) this).Hg.SetSamplerState(((gaa) this).Te, 2,
						!((gt) var_gt).j ? 3 : 1);
		sg[((gaa) this).Te] = ((gt) var_gt).j;
	    }
	}
    }
    
    private gaa(int i, int i_55_, Canvas canvas, am var_am,
		IDirect3D idirect3d, IDirect3DDevice idirect3ddevice,
		oo var_oo, D3DPRESENT_PARAMETERS d3dpresent_parameters,
		D3DCAPS d3dcaps, fa var_fa, pl var_pl, int i_56_) {
	super(canvas, var_oo, var_fa, var_pl, i_56_, 0);
	zg = idirect3d;
	Qg = i;
	Eg = i_55_;
	((gaa) this).Mg = var_am;
	((gaa) this).Hg = idirect3ddevice;
	tg = d3dpresent_parameters;
	Rg = var_oo;
	((gaa) this).Bg = d3dcaps;
	vg = new D3DLIGHT(((gaa) this).Mg);
	Jg = new D3DLIGHT(((gaa) this).Mg);
	Ig = new D3DLIGHT(((gaa) this).Mg);
	((gaa) this).Lg = new PixelBuffer(((gaa) this).Mg);
	((gaa) this).Pg = new GeometryBuffer(((gaa) this).Mg);
	new GeometryBuffer(((gaa) this).Mg);
	((gaa) this).Jf = 0 != (0x2000 & ((gaa) this).Bg.TextureCaps);
	((gaa) this).df = (((gaa) this).Bg.MaxActiveLights <= 0 ? 8
			   : ((gaa) this).Bg.MaxActiveLights);
	((gaa) this).ff = ((gaa) this).Bg.MaxSimultaneousTextures;
	((gaa) this).Ag = (0x2 & ((gaa) this).Bg.TextureCaps) == 0;
	((gaa) this).Kg = 0 != (0x10000 & ((gaa) this).Bg.TextureCaps);
	((gaa) this).Fg = (((gaa) this).Bg.TextureCaps & 0x4000) != 0;
	((gaa) this).ge = (((gaa) this).Bg.TextureCaps & 0x800) != 0;
	((gaa) this).Fe
	    = (((gaa) this).te > 0
	       || zg.CheckDeviceMultiSampleType(Qg, Eg, tg.BackBufferFormat,
						true, 2) == 0);
	sg = new boolean[((gaa) this).ff];
	Gg = new int[((gaa) this).ff];
	Cg = new boolean[((gaa) this).ff];
	yg = new mv[((gaa) this).ff];
	Og = new boolean[((gaa) this).ff];
	ug = new boolean[((gaa) this).ff];
	((gaa) this).Hg.BeginScene();
    }
    
    final void A() {
	((gaa) this).Mg.b((byte) -62);
	super.A();
    }
    
    final synchronized void a(int i) {
	((gaa) this).Mg.a((byte) -108);
	super.a(i);
    }
    
    final void a(byte i, Canvas canvas, Object object) {
	if (i != 121)
	    Ig = null;
    }
    
    final boolean a(Class_ec class_ec, bt var_bt, int i) {
	int i_57_ = 33 % ((i - 55) / 33);
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (qr.a(zg.a(Qg, d3ddisplaymode), -2005530519)
		&& qr.a(zg.CheckDeviceFormat(Qg, Eg, d3ddisplaymode.Format, 0,
					     4, a(class_ec, var_bt, true)),
			-2005530519));
    }
    
    final ls a(int i, Class_ec class_ec, int i_58_, int i_59_, bt var_bt) {
	if (i != 1)
	    return null;
	return new gt(this, class_ec, var_bt, i_58_, i_59_);
    }
    
    final ls a(byte[] is, Class_ec class_ec, int i, int i_60_, boolean bool,
	       boolean bool_61_, int i_62_, int i_63_) {
	if (bool_61_)
	    a(-77, -70, 41, -14, (D3DPRESENT_PARAMETERS) null, null);
	return new gt(this, class_ec, i_63_, i, bool, is, i_60_, i_62_);
    }
    
    final jt a(jt var_jt, jt var_jt_64_, float f, jt var_jt_65_) {
	return !(0.5F > f) ? var_jt_64_ : var_jt;
    }
    
    final void a(lt var_lt, int i, int i_66_, int i_67_) {
	((gaa) this).Hg.DrawPrimitive(a(var_lt, (byte) 124), i, i_66_);
	if (i_67_ != 28463)
	    a((Class_ec) null, null, -78);
    }
    
    final nba a(boolean bool, boolean bool_68_) {
	if (bool)
	    return null;
	return new ov(this, bool_68_);
    }
    
    final int DA() {
	return 0;
    }
    
    final void a(Rectangle[] rectangles, int i) throws uo {
	u();
    }
    
    final void X(int i) {
	((gaa) this).Hg.a(15, ((gaa) this).Ef);
	if (i > -74)
	    Cg = null;
    }
    
    final void c(byte i) {
	if (i != -108)
	    ((gaa) this).Kg = true;
    }
    
    final void a(float f, float f_69_, float f_70_) {
	/* empty */
    }
    
    private final boolean ab(int i) {
	int i_71_ = ((gaa) this).Hg.TestCooperativeLevel();
	if (i == i_71_ || i_71_ == -2005530519) {
	    oo var_oo = (oo) ((gaa) this).q;
	    H(i ^ ~0x5136);
	    var_oo.b((byte) 97);
	    tg.BackBufferWidth = 0;
	    tg.BackBufferHeight = 0;
	    if (a(-119, Qg, ((gaa) this).te, Eg, tg, zg)) {
		int i_72_ = ((gaa) this).Hg.Reset(tg);
		if (qr.a(i_72_, -2005530519)) {
		    var_oo.a(((gaa) this).Hg.b(), ((gaa) this).Hg.d(0),
			     (byte) 115);
		    m((byte) 127);
		    u((byte) 20);
		    return true;
		}
	    }
	}
	return false;
    }
    
    final void q() {
	/* empty */
    }
    
    final void k() {
	IDirect3DEventQuery idirect3deventquery = ((gaa) this).Hg.c();
	if (qr.a(idirect3deventquery.Issue(), -2005530519)) {
	    for (;;) {
		int i = idirect3deventquery.IsSignaled();
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	idirect3deventquery.b(6168);
    }
    
    final void ja(int i) {
	((gaa) this).Hg.Clear(1, i, 0.0F, 0);
    }
    
    static final int a(Class_ec class_ec, bt var_bt, boolean bool) {
	if (bool != true)
	    Dg = null;
	if (var_bt == bt.g) {
	    if (class_ec != uca.d) {
		if (class_ec == nda.h)
		    return 21;
		if (class_ec != NPCDef.hb) {
		    if (Class_jc.S != class_ec) {
			if (NPC.Xc != class_ec) {
			    if (class_ec == dt.zb)
				return 77;
			} else
			    return 51;
		    } else
			return 50;
		} else
		    return 28;
	    } else
		return 22;
	}
	throw new IllegalArgumentException("");
    }
    
    final void j(int i) {
	int i_73_ = (!Og[((gaa) this).Te] ? 1
		     : a(i ^ ~0x2, ((gaa) this).xe[((gaa) this).Te]));
	if (i != 2)
	    ((gaa) this).Kg = false;
	((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, 4, i_73_);
    }
    
    final void D(int i) {
	if (i == -25688) {
	    float f = !((gaa) this).Oe ? 0.0F : ((gaa) this).Xe;
	    float f_74_ = ((gaa) this).Oe ? -((gaa) this).mf : 0.0F;
	    vg.SetDiffuse(((gaa) this).ke * f, f * ((gaa) this).cf,
			  f * ((gaa) this).Ie, 0.0F);
	    Jg.SetDiffuse(f_74_ * ((gaa) this).ke, ((gaa) this).cf * f_74_,
			  f_74_ * ((gaa) this).Ie, 0.0F);
	    Ng = false;
	}
    }
    
    final void A(int i) {
	((gaa) this).Hg
	    .a(28, ((gaa) this).qe && ((gaa) this).pe && 0 <= ((gaa) this).Gf);
	int i_75_ = 28 / ((i + 15) / 55);
    }
    
    final void v(int i) {
	if (!Ng) {
	    ((gaa) this).Hg.LightEnable(0, false);
	    ((gaa) this).Hg.LightEnable(1, false);
	    ((gaa) this).Hg.SetLight(0, vg);
	    ((gaa) this).Hg.SetLight(1, Jg);
	    ((gaa) this).Hg.LightEnable(0, true);
	    ((gaa) this).Hg.LightEnable(1, true);
	    Ng = true;
	}
	if (i != 5)
	    a(null, null, 45, -21, false, false, 124, -101);
    }
    
    final int[] h(int i, int i_76_, int i_77_, int i_78_) {
	int[] is = null;
	IDirect3DSurface idirect3dsurface = ((gaa) this).Hg.c(0);
	IDirect3DSurface idirect3dsurface_79_
	    = ((gaa) this).Hg.a(i_77_, i_78_, 21, 0, 0, true);
	if (qr.a(((gaa) this).Hg.StretchRect(idirect3dsurface, i, i_76_, i_77_,
					     i_78_, idirect3dsurface_79_, 0, 0,
					     i_77_, i_78_, 0),
		 -2005530519)
	    && qr.a(idirect3dsurface_79_.LockRect(0, 0, i_77_, i_78_, 0,
						  ((gaa) this).Lg),
		    -2005530519)) {
	    is = new int[i_78_ * i_77_];
	    int i_80_ = ((gaa) this).Lg.getRowPitch();
	    if (i_77_ * 4 != i_80_) {
		for (int i_81_ = 0; i_78_ > i_81_; i_81_++)
		    ((gaa) this).Lg.b(is, i_77_ * i_81_, i_80_ * i_81_, i_77_);
	    } else
		((gaa) this).Lg.b(is, 0, 0, i_77_ * i_78_);
	    idirect3dsurface_79_.UnlockRect();
	}
	idirect3dsurface.b(6168);
	idirect3dsurface_79_.b(6168);
	return is;
    }
    
    final cl b(byte i, int i_82_) {
	if (i > -126)
	    return null;
	int i_83_ = i_82_;
    while_44_:
	do {
	    do {
		if (3 != i_83_) {
		    if (4 != i_83_) {
			if (8 == i_83_)
			    break;
			break while_44_;
		    }
		} else
		    return new hf(this, ((gaa) this).nd);
		return new ts(this, ((gaa) this).nd, ((gaa) this).Lc);
	    } while (false);
	    return new hd(this, ((gaa) this).nd, ((gaa) this).Lc);
	} while (false);
	return super.b((byte) -127, i_82_);
    }
    
    final void K(int i) {
	if (Og[((gaa) this).Te]) {
	    Og[((gaa) this).Te] = false;
	    ((gaa) this).Hg.SetTexture(((gaa) this).Te, null);
	    j(i ^ 0x2);
	    x(-2);
	}
	if (i != 0)
	    Og = null;
    }
    
    final void x(int i) {
	int i_84_ = (!Og[((gaa) this).Te] ? 1
		     : a(-1, ((gaa) this).oe[((gaa) this).Te]));
	((gaa) this).Hg.SetTextureStageState(((gaa) this).Te, 1, i_84_);
	if (i != -2)
	    v((byte) -35);
    }
    
    final void P(int i) {
	int i_85_ = -78 % ((i - 6) / 53);
	((gaa) this).Hg.SetTransform(3, ((gaa) this).zf);
    }
    
    final void l(int i) {
	if (i != 0)
	    Dg = null;
	((gaa) this).Hg.SetRenderState(60, ((gaa) this).hf);
    }
    
    final void j() {
	/* empty */
    }
    
    final mq a(eda[] var_edas, boolean bool) {
	if (bool != true)
	    ((gaa) this).Kg = true;
	return new dxVertexLayout(this, var_edas);
    }
    
    final void b(byte i) {
	if (((gaa) this).Od) {
	    xg[9] = 0.0F;
	    xg[0] = 1.0F;
	    xg[12] = 0.0F;
	    xg[7] = 0.0F;
	    xg[13] = 0.0F;
	    xg[5] = 1.0F;
	    xg[3] = 0.0F;
	    xg[14] = 0.0F;
	    xg[10] = 1.0F;
	    xg[1] = 0.0F;
	    xg[11] = 0.0F;
	    xg[4] = 0.0F;
	    xg[8] = 0.0F;
	    xg[6] = 0.0F;
	    xg[2] = 0.0F;
	    xg[15] = 1.0F;
	} else
	    ((gaa) this).Rd.a((byte) 68, xg);
	if (i != 86)
	    zg = null;
	((gaa) this).Hg.SetTransform(256, xg);
    }
    
    final fl a(int i, byte[] is, int i_86_, int i_87_, Class_ec class_ec,
	       int i_88_) {
	if (i != -13331)
	    return null;
	return new ep(this, class_ec, i_86_, i_88_, i_87_, is);
    }
    
    final void a() {
	/* empty */
    }
    
    private static final int b(int i, ki var_ki) {
	if (i != 1)
	    xg = null;
	if (var_ki == qca.G)
	    return 1;
	if (at.ki != var_ki) {
	    if (nda.d == var_ki)
		return 3;
	    if (ck.J == var_ki)
		return 4;
	    if (var_ki == ClientScript.ki)
		return 256;
	} else
	    return 2;
	return 0;
    }
    
    static {
	xg = new float[16];
	Sg = new int[] { 77, 80 };
    }
}
