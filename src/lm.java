/* lm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

final class lm extends en
{
    static int sg;
    static int tg;
    static int ug;
    static int vg;
    private OpenGL wg;
    static int xg;
    static int yg;
    static int zg;
    static int Ag;
    static int Bg;
    static int Cg;
    static int Dg;
    static int Eg;
    static int Fg;
    static int Gg;
    static int Hg;
    static int Ig;
    static int Jg;
    static int Kg;
    static int Lg;
    static int Mg;
    static int Ng;
    static int Og;
    static int Pg;
    static int Qg;
    static int Rg;
    static int Sg;
    static int Tg;
    static int Ug;
    static int Vg;
    private Class_ae Wg = new Class_ae();
    static int Xg;
    static int Yg;
    static int Zg;
    static int ah;
    static int bh;
    static int ch;
    static int dh;
    static int eh;
    static int fh;
    static int gh;
    static int hh;
    static int ih;
    static int jh;
    static int kh;
    static int lh;
    static int mh;
    static int nh;
    static int oh;
    static int ph;
    static int qh;
    static int rh;
    static int sh;
    static int th;
    static int uh;
    static pl vh;
    private Class_ae wh = new Class_ae();
    static int xh;
    static int yh;
    static int zh;
    static int Ah;
    static int Bh;
    static int Ch;
    static GameInPacket incomingPacket88 = new GameInPacket(88, 12);
    static int Eh;
    static int Fh;
    static int Gh;
    static int Hh;
    static int Ih;
    static int Jh;
    static Class_r Kh;
    static int Lh;
    static int Mh;
    static Animable[][] Nh;
    static int Oh;
    static int Ph;
    static int Qh;
    static int Rh;
    static int Sh;
    static int Th;
    static int Uh;
    static int Vh;
    static int Wh;
    static int Xh;
    static int Yh;
    static int Zh;
    private Class_ae ai = new Class_ae();
    private Class_ae bi = new Class_ae();
    private Class_ae ci = new Class_ae();
    private Class_ae di = new Class_ae();
    private Class_ae ei = new Class_ae();
    private caa[] fi = new caa[16];
    private boolean gi;
    MapBuffer hi = new MapBuffer();
    private long ii;
    private boolean ji;
    private boolean ki;
    private int li;
    private boolean mi;
    private boolean ni;
    MapBuffer oi = new MapBuffer();
    boolean pi;
    private boolean qi;
    private boolean ri;
    private String si;
    int ti;
    private String ui;
    private int vi = 0;
    boolean wi;
    boolean xi;
    boolean yi;
    private int zi;
    int[] Ai;
    
    final void n(byte i) {
	OpenGL.glMatrixMode(5890);
	Lg++;
	if (Class_jg.H == ((en) this).Sf[((en) this).Te])
	    OpenGL.glLoadIdentity();
	else
	    OpenGL.glLoadMatrixf(((en) this).xf[((en) this).Te].a((byte) 68,
								  Class_ae.k),
				 0);
	OpenGL.glMatrixMode(5888);
	int i_0_ = 19 / ((i + 25) / 60);
    }
    
    final void a(byte i, nba var_nba, int i_1_) {
	if (i != -16)
	    ((lm) this).wi = false;
	Rh++;
	fi[i_1_] = (caa) var_nba;
    }
    
    final void j(int i) {
	OpenGL.glTexEnvi(8960, 34162,
			 Class_pf.a(260, ((en) this).xe[((en) this).Te]));
	if (i == 2)
	    Bh++;
    }
    
    final nba a(boolean bool, boolean bool_2_) {
	if (bool != false)
	    a(null, null, -48, -89, false, false, -82, 26);
	bh++;
	return new caa(this, bool_2_);
    }
    
    final void u(int i) {
	if (i != 1)
	    ab(2);
	if (!((en) this).Oe) {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	} else {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	}
	Eg++;
    }
    
    final void k(int i) {
	Lh++;
	if (i == 1)
	    OpenGL.glDepthMask(((en) this).wf && ((en) this).af);
    }
    
    final void g(boolean bool) {
	if (bool == false) {
	    Mh++;
	    if (((en) this).Uf)
		OpenGL.glEnable(3042);
	    else
		OpenGL.glDisable(3042);
	}
    }
    
    final void D(int i) {
	Class_ub.M[1] = ((en) this).cf * ((en) this).Xe;
	Class_ub.M[3] = 1.0F;
	Class_ub.M[2] = ((en) this).Ie * ((en) this).Xe;
	Class_ub.M[0] = ((en) this).ke * ((en) this).Xe;
	Ag++;
	OpenGL.glLightfv(16384, 4609, Class_ub.M, 0);
	if (i != -25688)
	    wh = null;
	Class_ub.M[1] = -((en) this).mf * ((en) this).cf;
	Class_ub.M[3] = 1.0F;
	Class_ub.M[2] = ((en) this).Ie * -((en) this).mf;
	Class_ub.M[0] = -((en) this).mf * ((en) this).ke;
	OpenGL.glLightfv(16385, 4609, Class_ub.M, 0);
    }
    
    final mq a(eda[] var_edas, boolean bool) {
	Wh++;
	if (bool != true)
	    u((int) -6);
	return new ku(var_edas);
    }
    
    final void l(int i) {
	Class_ub.M[0] = (float) uca.a(16711680, ((en) this).hf) / 1.671168E7F;
	Class_ub.M[3] = (float) (((en) this).hf >>> 24) / 255.0F;
	sg++;
	Class_ub.M[2] = (float) uca.a(255, ((en) this).hf) / 255.0F;
	Class_ub.M[1] = (float) uca.a(65280, ((en) this).hf) / 65280.0F;
	OpenGL.glTexEnvfv(8960, 8705, Class_ub.M, i);
    }
    
    final synchronized void a(int i) {
	Ch++;
	i &= 0x7fffffff;
	int i_3_ = 0;
	while (!wh.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) wh.a(true);
	    Class_ef.I[i_3_++] = (int) ((Node) var_hda).nodeID;
	    ((en) this).Qd -= ((GameInPacketHandler) var_hda).k;
	    if (i_3_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_3_, Class_ef.I, 0);
		i_3_ = 0;
	    }
	}
	if (i_3_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_3_, Class_ef.I, 0);
	    i_3_ = 0;
	}
	while (!ai.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) ai.a(true);
	    Class_ef.I[i_3_++] = (int) ((Node) var_hda).nodeID;
	    ((en) this).Nd -= ((GameInPacketHandler) var_hda).k;
	    if (i_3_ == 1000) {
		OpenGL.glDeleteTextures(i_3_, Class_ef.I, 0);
		i_3_ = 0;
	    }
	}
	if (i_3_ > 0) {
	    OpenGL.glDeleteTextures(i_3_, Class_ef.I, 0);
	    i_3_ = 0;
	}
	while (!bi.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) bi.a(true);
	    Class_ef.I[i_3_++] = ((GameInPacketHandler) var_hda).k;
	    if (i_3_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_3_, Class_ef.I, 0);
		i_3_ = 0;
	    }
	}
	if (i_3_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_3_, Class_ef.I, 0);
	    i_3_ = 0;
	}
	while (!ci.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) ci.a(true);
	    Class_ef.I[i_3_++] = (int) ((Node) var_hda).nodeID;
	    ((en) this).Sd -= ((GameInPacketHandler) var_hda).k;
	    if (i_3_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_3_, Class_ef.I, 0);
		i_3_ = 0;
	    }
	}
	if (i_3_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_3_, Class_ef.I, 0);
	    boolean bool = false;
	}
	while (!Wg.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Wg.a(true);
	    OpenGL.glDeleteLists((int) ((Node) var_hda).nodeID,
				 ((GameInPacketHandler) var_hda).k);
	}
	while (!di.b(true)) {
	    Node class_d = di.a(true);
	    OpenGL.glDeleteProgramARB((int) ((Node) class_d).nodeID);
	}
	while (!ei.b(true)) {
	    Node class_d = ei.a(true);
	    OpenGL.glDeleteObjectARB(((Node) class_d).nodeID);
	}
	while (!Wg.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Wg.a(true);
	    OpenGL.glDeleteLists((int) ((Node) var_hda).nodeID,
				 ((GameInPacketHandler) var_hda).k);
	}
	if (this.b() > 100663296 && us.a(103) > ii + 60000L) {
	    System.gc();
	    ii = us.a(103);
	}
	super.a(i);
    }
    
    final void v(byte i) {
	gi = false;
	ch++;
	ab(15997);
	if (i >= -119)
	    wh = null;
    }
    
    final void a(boolean bool, mq var_mq) {
	gh++;
	eda[] var_edas = ((ku) (ku) var_mq).l;
	int i = 0;
	if (bool != true)
	    ri = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	for (int i_7_ = 0; var_edas.length > i_7_; i_7_++) {
	    eda var_eda = var_edas[i_7_];
	    caa var_caa = fi[i_7_];
	    int i_8_ = 0;
	    int i_9_ = var_caa.b((byte) -102);
	    long l = var_caa.d(0);
	    var_caa.c(35001);
	    for (int i_10_ = 0; var_eda.b(-113) > i_10_; i_10_++) {
		jv var_jv = var_eda.a(i_10_, (byte) 96);
		if (jv.e == var_jv) {
		    bool_6_ = true;
		    OpenGL.glVertexPointer(3, 5126, i_9_, l + (long) i_8_);
		} else if (var_jv != jv.k) {
		    if (var_jv != jv.l) {
			if (var_jv == jv.m) {
			    int i_11_ = i;
			    int i_12_ = 33984;
			    i++;
			    OpenGL.glClientActiveTexture(i_11_ + i_12_);
			    OpenGL.glTexCoordPointer(1, 5126, i_9_,
						     l + (long) i_8_);
			} else if (var_jv != jv.n) {
			    if (var_jv != jv.o) {
				if (jv.p == var_jv) {
				    OpenGL.glClientActiveTexture(i++ + 33984);
				    OpenGL.glTexCoordPointer(4, 5126, i_9_,
							     (long) i_8_ + l);
				}
			    } else {
				OpenGL.glClientActiveTexture(i++ + 33984);
				OpenGL.glTexCoordPointer(3, 5126, i_9_,
							 l + (long) i_8_);
			    }
			} else {
			    OpenGL.glClientActiveTexture(33984 + i++);
			    OpenGL.glTexCoordPointer(2, 5126, i_9_,
						     l + (long) i_8_);
			}
		    } else {
			OpenGL.glColorPointer(4, 5121, i_9_, l + (long) i_8_);
			bool_4_ = true;
		    }
		} else {
		    bool_5_ = true;
		    OpenGL.glNormalPointer(5126, i_9_, l + (long) i_8_);
		}
		i_8_ += ((jv) var_jv).c;
	    }
	}
	if (!bool_6_ != !ji) {
	    if (!bool_6_)
		OpenGL.glDisableClientState(32884);
	    else
		OpenGL.glEnableClientState(32884);
	    ji = bool_6_;
	}
	if (!ni != !bool_5_) {
	    if (!bool_5_)
		OpenGL.glDisableClientState(32885);
	    else
		OpenGL.glEnableClientState(32885);
	    ni = bool_5_;
	}
	if (ki == !bool_4_) {
	    if (!bool_4_)
		OpenGL.glDisableClientState(32886);
	    else
		OpenGL.glEnableClientState(32886);
	    ki = bool_4_;
	}
	if (i > li) {
	    for (int i_13_ = li; i_13_ < i; i_13_++) {
		OpenGL.glClientActiveTexture(i_13_ + 33984);
		OpenGL.glEnableClientState(32888);
	    }
	    li = i;
	} else if (i < li) {
	    for (int i_14_ = i; li > i_14_; i_14_++) {
		OpenGL.glClientActiveTexture(33984 + i_14_);
		OpenGL.glDisableClientState(32888);
	    }
	    li = i;
	}
    }
    
    final void W(int i) {
	if (i < -11) {
	    if (!((en) this).me || ((en) this).nf)
		OpenGL.glDisable(2896);
	    else
		OpenGL.glEnable(2896);
	    Zg++;
	}
    }
    
    final void u(byte i) {
	Xh++;
	for (int i_15_ = ((en) this).ff - 1; i_15_ >= 0; i_15_--) {
	    OpenGL.glActiveTexture(i_15_ + 33984);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glDepthFunc(515);
	OpenGL.glPolygonMode(1028, 6914);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i_16_ = 0; i_16_ < 8; i_16_++) {
	    int i_17_ = 16384 + i_16_;
	    OpenGL.glLightfv(i_17_, 4608, fs, 0);
	    OpenGL.glLightf(i_17_, 4615, 0.0F);
	    OpenGL.glLightf(i_17_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	wg.setSwapInterval(0);
	super.u(i);
    }
    
    public static void x(byte i) {
	if (i > 85) {
	    Kh = null;
	    vh = null;
	    Nh = null;
	    incomingPacket88 = null;
	}
    }
    
    final void d(boolean bool, byte i) {
	kh++;
	if (i >= -51)
	    X(61);
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    final void a(Object object, byte i, Canvas canvas) {
	ph++;
	int i_18_ = -16 / ((8 - i) / 55);
	Long var_long = (Long) object;
	if (!wg.setSurface(var_long.longValue()))
	    throw new RuntimeException();
    }
    
    final void a(boolean bool, int i, Class_gb var_gb, boolean bool_19_) {
	if (bool_19_ == false) {
	    OpenGL.glTexEnvi(8960, i + 34184, Class_kf.a(var_gb, (byte) 127));
	    ih++;
	    OpenGL.glTexEnvi(8960, i + 34200, !bool ? 770 : 771);
	}
    }
    
    final synchronized void g(int i, int i_20_) {
	sh++;
	Node class_d = new Node();
	((Node) class_d).nodeID = (long) i;
	di.b(class_d, (byte) 93);
	if (i_20_ != 27077)
	    ((lm) this).oi = null;
    }
    
    final float r(byte i) {
	int i_21_ = 62 % ((1 - i) / 37);
	Og++;
	return 0.0F;
    }
    
    final void v(int i) {
	Vh++;
	if (i != 5)
	    a(104, null, 29, -125, null, 59);
    }
    
    final void a(int i, int i_22_, int i_23_, int i_24_) {
	Jh++;
    }
    
    final boolean z() {
	xg++;
	return false;
    }
    
    final synchronized void a(boolean bool, long l) {
	if (bool == true) {
	    jh++;
	    Node class_d = new Node();
	    ((Node) class_d).nodeID = l;
	    ei.b(class_d, (byte) 93);
	}
    }
    
    final void s() {
	Gg++;
	if (((en) this).R > 0 || ((en) this).sb > 0) {
	    int i = ((en) this).kf;
	    int i_25_ = ((en) this).Pf;
	    int i_26_ = ((en) this).Rf;
	    int i_27_ = ((en) this).of;
	    this.JA();
	    OpenGL.glReadBuffer(1028);
	    OpenGL.glDrawBuffer(1029);
	    this.a((byte) 84);
	    this.d(false, (int) -110);
	    this.a(false, (int) 108);
	    this.a((byte) 126, false);
	    this.c(false, (byte) -25);
	    this.a((hfa) null, 0);
	    this.a(0, -2, false, false);
	    this.f(1, 0);
	    this.a((byte) 28, (int) 0);
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadIdentity();
	    OpenGL.glRasterPos2i(0, 0);
	    OpenGL.glCopyPixels(0, 0, ((en) this).R, ((en) this).sb, 6144);
	    OpenGL.glFlush();
	    OpenGL.glReadBuffer(1029);
	    OpenGL.glDrawBuffer(1029);
	    this.da(i, i_26_, i_25_, i_27_);
	}
    }
    
    final void j() {
	Fh++;
    }
    
    final void ja(int i) {
	OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F,
			    (float) (0xff00 & i) / 65280.0F,
			    (float) (0xff & i) / 255.0F,
			    (float) (i >>> 24) / 255.0F);
	Ih++;
	OpenGL.glClear(16384);
    }
    
    final void h(byte i) {
	OpenGL.glViewport(((en) this).pf, ((en) this).Se, ((en) this).R,
			  ((en) this).sb);
	if (i != 116)
	    u((byte) 97);
	qh++;
    }
    
    final void M(int i) {
	this.i((byte) 112);
	nh++;
	if (i != 1)
	    wg = null;
	int i_28_;
	for (i_28_ = 0; ((en) this).uf > i_28_; i_28_++) {
	    gga var_gga = ((en) this).Tf[i_28_];
	    int i_29_ = var_gga.a((int) 40);
	    int i_30_ = i_28_ + 16386;
	    float f = var_gga.b((int) 100) / 255.0F;
	    Class_ub.M[0] = (float) var_gga.a(true);
	    Class_ub.M[1] = (float) var_gga.i(-82);
	    Class_ub.M[2] = (float) var_gga.b((byte) 119);
	    Class_ub.M[3] = 1.0F;
	    OpenGL.glLightfv(i_30_, 4611, Class_ub.M, 0);
	    Class_ub.M[2] = f * (float) uca.a(i_29_, 255);
	    Class_ub.M[1] = f * (float) uca.a(i_29_ >> 8, 255);
	    Class_ub.M[0] = (float) (uca.a(16727385, i_29_) >> 16) * f;
	    Class_ub.M[3] = 1.0F;
	    OpenGL.glLightfv(i_30_, 4609, Class_ub.M, 0);
	    OpenGL.glLightf(i_30_, 4617,
			    1.0F / (float) (var_gga.a((byte) -96)
					    * var_gga.a((byte) 73)));
	    OpenGL.glEnable(i_30_);
	}
	for (/**/; i_28_ < ((en) this).we; i_28_++)
	    OpenGL.glDisable(i_28_ + 16386);
	super.M(i);
    }
    
    final int DA() {
	ug++;
	return vi;
    }
    
    final void b(byte i) {
	Yg++;
	ab(15997);
	if (i != 86)
	    ((lm) this).Ai = null;
    }
    
    final hh b(boolean bool, int i) {
	hh++;
	if (i != 16)
	    return null;
	return new gg(this, bt.h, bool);
    }
    
    final void A() {
	super.A();
	Sg++;
	if (wg != null) {
	    wg.b();
	    wg.release();
	    wg = null;
	}
    }
    
    final void I(int i) {
	if (!((en) this).He)
	    OpenGL.glDisable(2929);
	else
	    OpenGL.glEnable(2929);
	zg++;
	if (i != 0)
	    a((int) 14);
    }
    
    final jt a(jt var_jt, jt var_jt_31_, float f, jt var_jt_32_) {
	Tg++;
	if (!(f < 0.5F))
	    return var_jt_31_;
	return var_jt;
    }
    
    final void s(int i) {
	Class_ub.M[2] = ((en) this).Nf * ((en) this).Ie;
	Class_ub.M[0] = ((en) this).ke * ((en) this).Nf;
	Class_ub.M[1] = ((en) this).cf * ((en) this).Nf;
	Uh++;
	Class_ub.M[3] = 1.0F;
	OpenGL.glLightModelfv(2899, Class_ub.M, i);
    }
    
    final oq a(boolean bool, boolean bool_33_, int i, int[][] is) {
	Xg++;
	if (bool_33_ != true)
	    ((lm) this).ti = -125;
	return new saa(this, i, bool, is);
    }
    
    private final void ab(int i) {
	if (i == 15997) {
	    if (mi)
		OpenGL.glPopMatrix();
	    vg++;
	    if (!((en) this).Mf.b(3)) {
		if (!((en) this).Od) {
		    OpenGL.glLoadMatrixf(((en) this).Rd.a((byte) 68,
							  Class_ae.k),
					 0);
		    mi = false;
		} else {
		    OpenGL.glLoadIdentity();
		    mi = false;
		}
	    } else {
		if (!gi) {
		    OpenGL.glLoadMatrixf(((en) this).Vd.a((byte) 68,
							  Class_ae.k),
					 0);
		    gi = true;
		    i(false);
		    M(1);
		}
		if (!((en) this).Od) {
		    OpenGL.glPushMatrix();
		    OpenGL.glMultMatrixf(((en) this).Rd.a((byte) 68,
							  Class_ae.k),
					 0);
		    mi = true;
		} else
		    mi = false;
	    }
	}
    }
    
    final void a(boolean bool) {
	Gh++;
    }
    
    final ls a(float[] fs, int i, int i_34_, int i_35_, boolean bool,
	       int i_36_, int i_37_, Class_ec class_ec) {
	if (i_35_ != 10)
	    Wg = null;
	Ng++;
	if (qi || ar.a(i_36_, (byte) 98) && ar.a(i, (byte) 98))
	    return new tg(this, class_ec, i_36_, i, bool, fs, i_37_, i_34_);
	if (!ri) {
	    tg var_tg = new tg(this, class_ec, bt.k, dfa.a(i_36_, i_35_ + 118),
			       dfa.a(i, 128));
	    var_tg.a(0, fs, class_ec, i_37_, 0, i, i_36_, 3314, i_34_);
	    return var_tg;
	}
	return new ga(this, class_ec, i_36_, i, fs, i_37_, i_34_);
    }
    
    final void X(int i) {
	if (i < -74) {
	    Kg++;
	    if (!((en) this).Ef)
		OpenGL.glDisable(3008);
	    else
		OpenGL.glEnable(3008);
	}
    }
    
    final boolean i() {
	tg++;
	return false;
    }
    
    final synchronized void a(int i, int i_38_, int i_39_) {
	Yh++;
	GameInPacketHandler var_hda = new GameInPacketHandler(i_39_);
	if (i_38_ != 0)
	    X(-38);
	((Node) var_hda).nodeID = (long) i;
	ai.b(var_hda, (byte) 93);
    }
    
    final ls a(byte[] is, Class_ec class_ec, int i, int i_40_, boolean bool,
	       boolean bool_41_, int i_42_, int i_43_) {
	if (bool_41_ != false)
	    ai = null;
	lh++;
	if (qi || ar.a(i_43_, (byte) 98) && ar.a(i, (byte) 98))
	    return new tg(this, class_ec, i_43_, i, bool, is, i_40_, i_42_);
	if (!ri) {
	    tg var_tg = new tg(this, class_ec, bt.g, dfa.a(i_43_, 128),
			       dfa.a(i, 128));
	    var_tg.a(i_40_, is, class_ec, 0, i_43_, i_42_, 996, i, 0);
	    return var_tg;
	}
	return new ga(this, class_ec, i_43_, i, is, i_40_, i_42_);
    }
    
    final ls a(int i, Class_ec class_ec, int i_44_, int i_45_, bt var_bt) {
	Eh++;
	if (i != 1)
	    ((lm) this).xi = false;
	if (qi || ar.a(i_44_, (byte) 98) && ar.a(i_45_, (byte) 98))
	    return new tg(this, class_ec, var_bt, i_44_, i_45_);
	if (!ri)
	    return new tg(this, class_ec, var_bt, dfa.a(i_44_, i + 127),
			  dfa.a(i_45_, i ^ 0x81));
	return new ga(this, class_ec, var_bt, i_44_, i_45_);
    }
    
    final void A(int i) {
	if (((en) this).qe && ((en) this).pe && ((en) this).Gf >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
	Qh++;
	int i_46_ = -103 % ((-15 - i) / 55);
    }
    
    final void a(rca var_rca, int i) {
	if (aaa.s == var_rca) {
	    OpenGL.glDisable(3168);
	    OpenGL.glDisable(3169);
	    OpenGL.glDisable(3170);
	} else {
	    int i_47_ = caa.a(var_rca, (byte) 42);
	    OpenGL.glTexGeni(8192, 9472, i_47_);
	    OpenGL.glEnable(3168);
	    OpenGL.glTexGeni(8193, 9472, i_47_);
	    OpenGL.glEnable(3169);
	    OpenGL.glTexGeni(8194, 9472, i_47_);
	    OpenGL.glEnable(3170);
	}
	int i_48_ = -9 % ((80 - i) / 38);
	Sh++;
    }
    
    final void a(boolean bool, Class_gb var_gb, int i, boolean bool_49_,
		 byte i_50_) {
	yh++;
	int i_51_ = 58 % ((i_50_ + 17) / 34);
	OpenGL.glTexEnvi(8960, i + 34176, Class_kf.a(var_gb, (byte) 123));
	if (bool_49_)
	    OpenGL.glTexEnvi(8960, i + 34192, !bool ? 770 : 771);
	else
	    OpenGL.glTexEnvi(8960, i + 34192, !bool ? 768 : 769);
    }
    
    final void K(int i) {
	yg++;
	int i_52_ = ((lm) this).Ai[((en) this).Te];
	if (i != i_52_) {
	    ((lm) this).Ai[((en) this).Te] = 0;
	    OpenGL.glBindTexture(i_52_, 0);
	    OpenGL.glDisable(i_52_);
	}
    }
    
    final void k() {
	OpenGL.glFinish();
	zh++;
    }
    
    final void a(f var_f, boolean bool) {
	oh++;
    }
    
    final void u() throws uo {
	wg.swapBuffers();
	th++;
    }
    
    final boolean a(Class_ec class_ec, bt var_bt, int i) {
	int i_53_ = -94 % ((i - 55) / 33);
	xh++;
	return true;
    }
    
    final fl a(int i, byte[] is, int i_54_, int i_55_, Class_ec class_ec,
	       int i_56_) {
	Zh++;
	if (i != -13331)
	    A(31);
	return new eq(this, class_ec, i_54_, i_56_, i_55_, is);
    }
    
    final void a(int i, Object object, Canvas canvas) {
	if (i == 7) {
	    uh++;
	    Long var_long = (Long) object;
	    wg.surfaceResized(var_long.longValue());
	}
    }
    
    final void d(int i, int i_57_) {
	if (i != 3)
	    ji = false;
	Hg++;
    }
    
    final GraphicsCard y() {
	Rg++;
	int i = -1;
	if ((si.indexOf("nvidia") ^ 0xffffffff) != 0)
	    i = 4318;
	else if (si.indexOf("intel") != -1)
	    i = 32902;
	else if ((si.indexOf("ati") ^ 0xffffffff) != 0)
	    i = 4098;
	return new GraphicsCard(i, "OpenGL", zi, ui, 0L);
    }
    
    final void k(boolean bool) {
	Ug++;
	if (IncomingPackets.lea != ((en) this).Ve) {
	    if (((en) this).Ve == Class_ug.H)
		OpenGL.glBlendFunc(1, 1);
	    else if (Class_ag.h == ((en) this).Ve)
		OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glBlendFunc(770, 771);
	if (bool != true)
	    ((lm) this).oi = null;
    }
    
    final Object a(Canvas canvas, int i) {
	Ig++;
	long l = wg.prepareSurface(canvas);
	if (i != 19449)
	    ((lm) this).yi = false;
	if (l == -1L)
	    throw new RuntimeException();
	return new Long(l);
    }
    
    final void a(float f, float f_58_, float f_59_) {
	Oh++;
    }
    
    final void a() {
	Dg++;
    }
    
    final void o(int i) {
	int i_60_ = -99 % ((82 - i) / 40);
	OpenGL.glScissor(((en) this).pf + ((en) this).kf,
			 ((en) this).sb + ((en) this).Se - ((en) this).of,
			 ((en) this).Pf - ((en) this).kf,
			 ((en) this).of - ((en) this).Rf);
	Qg++;
    }
    
    final synchronized void a(int i, int i_61_, byte i_62_) {
	Bg++;
	GameInPacketHandler var_hda = new GameInPacketHandler(i);
	int i_63_ = -66 / ((-52 - i_62_) / 51);
	((Node) var_hda).nodeID = (long) i_61_;
	wh.b(var_hda, (byte) 93);
    }
    
    lm(OpenGL opengl, Canvas canvas, long l, fa var_fa, pl var_pl, int i) {
	super(canvas, new Long(l), var_fa, var_pl, i, 1);
	try {
	    wg = opengl;
	    wg.a();
	    si = OpenGL.glGetString(7936).toLowerCase();
	    ui = OpenGL.glGetString(7937).toLowerCase();
	    if ((si.indexOf("microsoft") ^ 0xffffffff) != 0
		|| (si.indexOf("brian paul") ^ 0xffffffff) != 0
		|| (si.indexOf("mesa") ^ 0xffffffff) != 0)
		throw new RuntimeException("");
	    String string = OpenGL.glGetString(7938);
	    String[] strings = vq.a(-120, string.replace('.', ' '), ' ');
	    if (strings.length >= 2) {
		int i_64_ = Class_g.a(128, strings[0]);
		int i_65_ = Class_g.a(128, strings[1]);
		zi = i_65_ + 10 * i_64_;
	    } else
		throw new RuntimeException("");
	    if (zi < 12)
		throw new RuntimeException("");
	    if (!wg.a("GL_ARB_multitexture"))
		throw new RuntimeException("");
	    if (!wg.a("GL_ARB_texture_env_combine"))
		throw new RuntimeException("");
	    int[] is = new int[1];
	    OpenGL.glGetIntegerv(34018, is, 0);
	    ((en) this).ff = is[0];
	    if (((en) this).ff < 2)
		throw new RuntimeException("");
	    ((en) this).df = 8;
	    ((lm) this).xi = wg.a("GL_ARB_vertex_buffer_object");
	    ((en) this).Fe = wg.a("GL_ARB_multisample");
	    ri = wg.a("GL_ARB_texture_rectangle");
	    ((en) this).ge = wg.a("GL_ARB_texture_cube_map");
	    qi = wg.a("GL_ARB_texture_non_power_of_two");
	    ((en) this).Jf = wg.a("GL_EXT_texture3D");
	    ((lm) this).yi = wg.a("GL_ARB_vertex_shader");
	    ((lm) this).wi = wg.a("GL_ARB_vertex_program");
	    ((lm) this).pi = wg.a("GL_ARB_fragment_shader");
	    wg.a("GL_ARB_fragment_program");
	    ((lm) this).Ai = new int[((en) this).ff];
	    ((lm) this).ti = Stream.a() ? 33639 : 5121;
	    if ((ui.indexOf("radeon") ^ 0xffffffff) != 0) {
		int i_66_ = 0;
		boolean bool = false;
		boolean bool_67_ = false;
		String[] strings_68_ = vq.a(-80, ui.replace('/', ' '), ' ');
		for (int i_69_ = 0; i_69_ < strings_68_.length; i_69_++) {
		    String string_70_ = strings_68_[i_69_];
		    try {
			if (string_70_.length() > 0) {
			    if (string_70_.charAt(0) == 'x'
				&& string_70_.length() >= 3
				&& Class_kd.a((byte) 80,
					      string_70_.substring(1, 3))) {
				string_70_ = string_70_.substring(1);
				bool_67_ = true;
			    }
			    if (string_70_.equals("hd"))
				bool = true;
			    else {
				if (string_70_.startsWith("hd")) {
				    bool = true;
				    string_70_ = string_70_.substring(2);
				}
				if (string_70_.length() >= 4
				    && Class_kd.a((byte) 99,
						  string_70_.substring(0,
								       4))) {
				    i_66_ = Class_g.a(128,
						      string_70_.substring(0,
									   4));
				    break;
				}
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		if (!bool_67_ && !bool) {
		    if (i_66_ >= 7000 && i_66_ <= 9250)
			((en) this).Jf = false;
		    if (i_66_ >= 7000 && i_66_ <= 7999)
			((lm) this).xi = false;
		}
		ri &= wg.a("GL_ARB_half_float_pixel");
	    }
	    si.indexOf("intel");
	    if (((lm) this).xi) {
		int[] is_71_ = new int[1];
		OpenGL.glGenBuffersARB(1, is_71_, 0);
	    }
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    A();
	    throw new RuntimeException("");
	}
    }
    
    final void q() {
	Cg++;
    }
    
    final void a(int i, lt var_lt, int i_72_, int i_73_, int i_74_, int i_75_,
		 hh var_hh) {
	fh++;
	int i_76_;
	int i_77_;
	if (oea.cb == var_lt) {
	    i_77_ = 1;
	    i_76_ = 2 * i_74_;
	} else if (kfa.p != var_lt) {
	    if (mo.E == var_lt) {
		i_76_ = i_74_ * 3;
		i_77_ = 4;
	    } else if (mm.x != var_lt) {
		if (caa.F == var_lt) {
		    i_77_ = 5;
		    i_76_ = i_74_ + 2;
		} else {
		    i_76_ = i_74_;
		    i_77_ = 0;
		}
	    } else {
		i_76_ = i_74_ + 2;
		i_77_ = 6;
	    }
	} else {
	    i_77_ = 3;
	    i_76_ = i_74_ + 1;
	}
	if (i_73_ == 12896) {
	    bt var_bt = var_hh.a(i_73_ ^ ~0x71c5);
	    gg var_gg = (gg) var_hh;
	    var_gg.c(35001);
	    OpenGL.glDrawElements(i_77_, i_76_,
				  Class_kf.a(var_bt, i_73_ ^ 0x3254),
				  var_gg.d(0) + (long) (i_72_
							* ((bt) var_bt).c));
	}
    }
    
    final int[] h(int i, int i_78_, int i_79_, int i_80_) {
	dh++;
	int[] is = new int[i_80_ * i_79_];
	for (int i_81_ = 0; i_81_ < i_80_; i_81_++)
	    OpenGL.glReadPixelsi(i, ((en) this).sb - i_78_ - i_81_ - 1, i_79_,
				 1, 32993, ((lm) this).ti, is, i_81_ * i_79_);
	return is;
    }
    
    final cl b(byte i, int i_82_) {
	eh++;
	if (i > -126)
	    return null;
	int i_83_ = i_82_;
    while_83_:
	do {
	    do {
		if (i_83_ != 3) {
		    if (i_83_ != 4) {
			if (i_83_ == 8)
			    break;
			break while_83_;
		    }
		} else
		    return new mw(this, ((en) this).nd);
		return new ht(this, ((en) this).nd, ((en) this).Lc);
	    } while (false);
	    return new pr(this, ((en) this).nd, ((en) this).Lc);
	} while (false);
	return super.b((byte) -127, i_82_);
    }
    
    final void i(boolean bool) {
	OpenGL.glLightfv(16384, 4611, ((en) this).Of, 0);
	Pg++;
	if (bool != false)
	    a(-20, null, -50, 80, null, -48);
	OpenGL.glLightfv(16385, 4611, ((en) this).gf, 0);
    }
    
    final void P(int i) {
	ah++;
	OpenGL.glMatrixMode(5889);
	int i_84_ = 119 % ((6 - i) / 53);
	OpenGL.glLoadMatrixf(((en) this).zf, 0);
	OpenGL.glMatrixMode(5888);
    }
    
    final void a(byte i, Canvas canvas, Object object) {
	Hh++;
	Long var_long = (Long) object;
	if (i != 121)
	    ri = false;
	wg.releaseSurface(canvas, var_long.longValue());
    }
    
    final void a(lt var_lt, int i, int i_85_, int i_86_) {
	Th++;
	int i_87_;
	int i_88_;
	if (oea.cb == var_lt) {
	    i_88_ = i_85_ * 2;
	    i_87_ = 1;
	} else if (kfa.p == var_lt) {
	    i_87_ = 3;
	    i_88_ = i_85_ + 1;
	} else if (mo.E == var_lt) {
	    i_87_ = 4;
	    i_88_ = i_85_ * 3;
	} else if (var_lt != mm.x) {
	    if (caa.F == var_lt) {
		i_88_ = i_85_ + 2;
		i_87_ = 5;
	    } else {
		i_88_ = i_85_;
		i_87_ = 0;
	    }
	} else {
	    i_88_ = i_85_ + 2;
	    i_87_ = 6;
	}
	OpenGL.glDrawArrays(i_87_, i, i_88_);
	if (i_86_ != 28463)
	    u((int) -2);
    }
    
    final boolean a(int i, bt var_bt, Class_ec class_ec) {
	if (i < 25)
	    a(false, -100, null, false);
	rh++;
	return true;
    }
    
    final void B(int i) {
	((en) this).bf = (float) (((en) this).Ae - ((en) this).qf);
	if (i > -53)
	    ((lm) this).Ai = null;
	mh++;
	((en) this).ce = ((en) this).bf - (float) ((en) this).Gf;
	if (((en) this).ce < (float) ((en) this).Af)
	    ((en) this).ce = (float) ((en) this).Af;
	OpenGL.glFogf(2915, ((en) this).ce);
	OpenGL.glFogf(2916, ((en) this).bf);
	Class_ub.M[0] = (float) uca.a(((en) this).lf, 16711680) / 1.671168E7F;
	Class_ub.M[1] = (float) uca.a(65280, ((en) this).lf) / 65280.0F;
	Class_ub.M[2] = (float) uca.a(((en) this).lf, 255) / 255.0F;
	OpenGL.glFogfv(2918, Class_ub.M, 0);
    }
    
    final void c(byte i) {
	Ah++;
	if (i == -108)
	    OpenGL.glActiveTexture(((en) this).Te + 33984);
    }
    
    final void a(Rectangle[] rectangles, int i) throws uo {
	Vg++;
	u();
    }
    
    final void F(int i) {
	if (i >= 45) {
	    if (((en) this).qg)
		OpenGL.glEnable(3089);
	    else
		OpenGL.glDisable(3089);
	    Mg++;
	}
    }
    
    final void x(int i) {
	Jg++;
	if (i == -2)
	    OpenGL.glTexEnvi(8960, 34161,
			     Class_pf.a(260, ((en) this).oe[((en) this).Te]));
    }
    
    final ls a(int[] is, int i, boolean bool, int i_89_, int i_90_, int i_91_,
	       int i_92_) {
	Ph++;
	if (i != 3)
	    return null;
	if (!qi && (!ar.a(i_91_, (byte) 98) || !ar.a(i_92_, (byte) 98))) {
	    if (!ri) {
		tg var_tg = new tg(this, nda.h, bt.g, dfa.a(i_91_, 128),
				   dfa.a(i_92_, 128));
		var_tg.a(i_90_, (byte) 75, i_89_, is, 0, i_91_, i_92_, 0);
		return var_tg;
	    }
	    return new ga(this, i_91_, i_92_, is, i_90_, i_89_);
	}
	return new tg(this, i_91_, i_92_, bool, is, i_90_, i_89_);
    }
    
    final void ya() {
	this.c(true, (byte) -25);
	Fg++;
	OpenGL.glClear(256);
    }
}
