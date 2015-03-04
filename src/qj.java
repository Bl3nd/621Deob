/* qj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;

import jaggl.OpenGL;

final class qj extends Class_r
{
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    private Canvas v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int A;
    static int B;
    private int C;
    private long D;
    static int E;
    static int F;
    static int G;
    static int H;
    static int I;
    static int J;
    static int K;
    static int L;
    static int M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    static int T;
    static int U;
    static int V;
    static int W;
    static int X;
    static int Y;
    static int Z;
    static int ab;
    static int bb;
    static int cb;
    static int db;
    static int eb;
    static int fb;
    static int gb;
    static int hb;
    int ib;
    static int jb;
    static int kb;
    static int lb;
    static int mb;
    static int nb;
    static int ob;
    static int pb;
    static int qb;
    static int rb;
    static int sb;
    static int tb;
    static int ub;
    static int vb;
    static int wb;
    static int xb;
    static int yb;
    static int zb;
    static int Ab;
    private Hashtable Bb = new Hashtable();
    static int Cb;
    static int Db;
    static int Eb;
    static int Fb;
    static int Gb;
    static int Hb;
    static int Ib;
    static int Jb;
    static int Kb;
    private long Lb;
    static int Mb;
    static int Nb;
    static int Ob;
    static int Pb;
    static int Qb;
    static int Rb;
    static int Sb;
    static int Tb;
    static int Ub;
    static int Vb;
    static int Wb;
    static int Xb;
    static int Yb;
    static int Zb;
    static int ac;
    static int bc;
    static int cc;
    static int dc;
    static int ec;
    static int fc;
    static int gc;
    static int hc;
    static int ic;
    static int jc;
    static int kc;
    static int lc;
    static int mc;
    static int nc;
    static int oc;
    static int pc;
    static int qc;
    static int rc;
    static int sc;
    static int tc;
    static int uc;
    static int vc;
    static int wc;
    static int xc;
    static int yc;
    static int zc;
    static int Ac;
    static int Bc;
    static int Cc;
    static int Dc;
    static int Ec;
    static int Fc;
    static int Gc;
    static int Hc;
    static int Ic;
    static int Jc;
    static int Kc;
    static int Lc;
    static int Mc;
    static int Nc;
    static int Oc;
    static int Pc;
    static int Qc;
    static int Rc;
    private Canvas Sc;
    private int Tc;
    static int Uc;
    static int Vc;
    static int Wc;
    static int Xc;
    static float Yc;
    static int Zc;
    static int ad;
    static int bd;
    static int cd;
    static int dd;
    static int ed;
    static int fd;
    static int gd;
    static int hd;
    static int id;
    static int jd;
    static int kd;
    static int ld;
    static int md;
    static int nd;
    int od;
    static int pd;
    static int qd;
    static int rd;
    static int sd;
    static int td;
    OpenGL ud;
    static int vd;
    static int wd;
    static int xd;
    static int yd;
    static int zd;
    static int Ad;
    static int Bd;
    static int Cd;
    static int Dd;
    int Ed;
    static int Fd;
    private su Gd;
    static int Hd;
    private taa Id;
    private dk Jd;
    static int Kd;
    static int Ld;
    static int Md;
    static int Nd;
    static int Od;
    static int Pd;
    static int Qd;
    static int Rd;
    static int Sd;
    private kfa Td;
    static int Ud;
    static int Vd;
    int Wd = 128;
    static int Xd;
    private bf Yd;
    static int Zd;
    static int ae;
    static int be;
    static int ce;
    static int de;
    static int ee;
    static int fe;
    private Class_db ge;
    Class_db he;
    gk ie;
    int je;
    private Class_ae ke;
    int le;
    int me;
    NativeHeap ne;
    private boolean oe;
    private jh pe;
    private eca qe;
    private je re;
    private int se;
    private jh[] te;
    private int ue;
    private qk ve;
    private jh[] we;
    private jh[] xe;
    private int ye;
    private jh ze;
    private il Ae;
    private Class_ae Be;
    private int Ce;
    int De;
    int Ee;
    private int Fe;
    private Class_ae Ge;
    private Class_ae He;
    private Class_ae Ie;
    private Class_ae Je;
    private Class_ae Ke;
    private Class_ae Le;
    private int Me;
    Class_db Ne;
    private int Oe;
    private boolean Pe;
    private boolean Qe;
    private boolean Re;
    private int Se;
    private long Te;
    private boolean Ue;
    Class_db Ve;
    Class_db We;
    private float Xe;
    private int Ye;
    private int Ze;
    float af;
    int bf;
    int cf;
    vaa df;
    boolean ef;
    float ff;
    private int gf;
    boolean hf;
    private float[] jf;
    private int kf;
    float lf;
    gv mf;
    int nf;
    private boolean of;
    float pf;
    private int qf;
    private float rf;
    private int sf;
    qk tf;
    vaa uf;
    boolean vf;
    float wf;
    boolean xf;
    int yf;
    boolean zf;
    private float Af;
    private float Bf;
    private int Cf;
    private nl Df;
    private int Ef;
    private float Ff;
    vaa Gf;
    boolean Hf;
    float If;
    int Jf;
    private boolean Kf;
    boolean Lf;
    private boolean Mf;
    int Nf;
    vaa Of;
    float Pf;
    int Qf;
    vaa Rf;
    private int Sf;
    private int Tf;
    private String Uf;
    private boolean Vf;
    vaa Wf;
    float Xf;
    pm Yf;
    fw Zf;
    int ag;
    int bg;
    private float[] cg;
    private boolean dg;
    int eg;
    gv fg;
    private bm gg;
    private int hg;
    boolean ig;
    private ar jg;
    int kg;
    float lg;
    private boolean mg;
    float ng;
    vaa og;
    boolean pg;
    private rg[] qg;
    private int rg;
    int sg;
    private boolean tg;
    private float ug;
    boolean vg;
    boolean wg;
    private boolean xg;
    private int yg;
    boolean zg;
    private boolean Ag;
    boolean Bg;
    private boolean Cg;
    vaa Dg;
    int Eg;
    int Fg;
    float Gg;
    private float Hg;
    private int Ig;
    vaa Jg;
    boolean Kg;
    private float[] Lg;
    private boolean Mg;
    float[] Ng;
    private dw Og;
    private String Pg;
    private nl Qg;
    private gga[] Rg;
    private int Sg;
    vaa Tg;
    private int Ug;
    private float Vg;
    private float[] Wg;
    float Xg;
    private boolean Yg;
    int Zg;
    int ah;
    private int bh;
    private int ch;
    float dh;
    private int eh;
    byte[] fh;
    private int gh;
    int[] hh;
    int[] ih;
    int[] jh;
    
    final synchronized void a(int i, byte i_0_) {
	ae++;
	Node class_d = new Node();
	((Node) class_d).nodeID = (long) i;
	if (i_0_ >= 97)
	    Ke.b(class_d, (byte) 93);
    }
    
    private final void i(int i) {
	if (i != 16711680)
	    ra(1.8107573F);
	ed++;
	if (Ef != 3) {
	    Ef = 3;
	    m(5888);
	    l((byte) 29);
	    Oe &= ~0x7;
	}
    }
    
    final void m(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
	Dc++;
	v(-88);
	b((byte) 97, i_4_);
	float f = (float) i + 0.35F;
	float f_5_ = (float) i_1_ + 0.35F;
	OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_,
			  (byte) (i_3_ >> 24));
	OpenGL.glBegin(1);
	OpenGL.glVertex2f(f, f_5_);
	OpenGL.glVertex2f(f, (float) i_2_ + f_5_);
	OpenGL.glEnd();
    }
    
    final int c(int i, int i_6_) {
	if (i_6_ != 260)
	    return -100;
	E++;
	if (i == 1)
	    return 7681;
	if (i != 0) {
	    if (i == 2)
		return 34165;
	    if (i != 3) {
		if (i == 4)
		    return 34023;
	    } else
		return 260;
	} else
	    return 8448;
	throw new IllegalArgumentException();
    }
    
    final void a(int i, int i_7_, int i_8_, int i_9_) {
	fe++;
	Jd.a(-42, i_7_, i_9_, i_8_, i);
    }
    
    final void a(int i, boolean bool, boolean bool_10_) {
	a(i, 126, bool, bool_10_);
	J++;
    }
    
    final f a(aga var_aga, boolean bool) {
	Dd++;
	int[] is = new int[((aga) var_aga).d * ((aga) var_aga).b];
	int i = 0;
	int i_11_ = 0;
	if (((aga) var_aga).f != null) {
	    for (int i_12_ = 0; ((aga) var_aga).d > i_12_; i_12_++) {
		for (int i_13_ = 0; ((aga) var_aga).b > i_13_; i_13_++) {
		    is[i_11_++] = hba.bitwiseArg1ORArg2(((aga) var_aga).f[i] << 24,
					(((aga) var_aga).i
					 [uca.a(255, ((aga) var_aga).c[i])]));
		    i++;
		}
	    }
	} else {
	    for (int i_14_ = 0; ((aga) var_aga).d > i_14_; i_14_++) {
		for (int i_15_ = 0; ((aga) var_aga).b > i_15_; i_15_++) {
		    int i_16_
			= ((aga) var_aga).i[((aga) var_aga).c[i++] & 0xff];
		    is[i_11_++] = i_16_ == 0 ? 0 : hba.bitwiseArg1ORArg2(-16777216, i_16_);
		}
	    }
	}
	f var_f = a(is, 0, ((aga) var_aga).b, ((aga) var_aga).b,
		    ((aga) var_aga).d);
	var_f.Q(((aga) var_aga).e, ((aga) var_aga).g, ((aga) var_aga).a,
		((aga) var_aga).h);
	return var_f;
    }
    
    final void j(int i) {
	Zc++;
	if (Oe != 16) {
	    i(16711680);
	    a(true, (byte) -114);
	    a((int) 65, true);
	    a(true, (int) 122);
	    b((byte) 56, (int) 1);
	    Oe = 16;
	}
	if (i != 379)
	    ya();
    }
    
    final void f(int i) {
	Qc++;
	n((int) 118);
    }
    
    final void a(jh var_jh, byte i) {
	s++;
	if (ye >= 3)
	    throw new RuntimeException();
	if (ye >= 0)
	    xe[ye].d(16401);
	if (i != -20)
	    q();
	ze = xe[++ye] = var_jh;
	ze.a((byte) 104);
    }
    
    final GraphicsCard y() {
	qb++;
	int i = -1;
	if (Pg.indexOf("nvidia") == -1) {
	    if ((Pg.indexOf("intel") ^ 0xffffffff) == 0) {
		if ((Pg.indexOf("ati") ^ 0xffffffff) != 0)
		    i = 4098;
	    } else
		i = 32902;
	} else
	    i = 4318;
	return new GraphicsCard(i, "OpenGL", Cf, Uf, 0L);
    }
    
    final void da(int i, int i_17_, int i_18_, int i_19_) {
	if (i_17_ < 0)
	    i_17_ = 0;
	T++;
	if (i_19_ > ((qj) this).ib)
	    i_19_ = ((qj) this).ib;
	if (i_18_ > ((qj) this).od)
	    i_18_ = ((qj) this).od;
	if (i < 0)
	    i = 0;
	Ug = i;
	ch = i_19_;
	qf = i_17_;
	yg = i_18_;
	OpenGL.glEnable(3089);
	s(0);
	a((byte) 42);
    }
    
    final void b(jh var_jh, byte i) {
	H++;
	if (ue >= 3)
	    throw new RuntimeException();
	if (ue >= 0)
	    te[ue].c(i + 20865);
	pe = te[++ue] = var_jh;
	if (i != 101)
	    ((qj) this).hf = true;
	pe.e(-128);
    }
    
    final void a(ir var_ir, int i) {
	Ub++;
	Gd.a(false, var_ir, this, i);
    }
    
    final boolean d() {
	bc++;
	if (!Mg || bloom() && !Vf)
	    return false;
	return true;
    }
    
    final void a(boolean bool, int i) {
	if (!Ue == bool) {
	    Ue = bool;
	    j((byte) 100);
	    Oe &= ~0x1f;
	}
	r++;
	int i_20_ = 2 % ((i - 56) / 61);
    }
    
    private final void a(byte i) {
	int i_21_ = -46 % ((-26 - i) / 36);
	nc++;
	if (yg >= Ug && qf <= ch)
	    OpenGL.glScissor(Ug + gf, Tf + (((qj) this).ib - ch), yg - Ug,
			     ch - qf);
	else
	    OpenGL.glScissor(0, 0, 0, 0);
    }
    
    final void a(f var_f, boolean bool) {
	Eb++;
	qe = (eca) var_f;
	if (!((qj) this).wg) {
	    if (!dg)
		throw new RuntimeException("");
	    fj var_fj = (fj) Ae.a(-32748, (long) (qe.E() << 16 | qe.u()));
	    if (var_fj == null) {
		var_fj = new fj(this, qe.E(), qe.u());
		fj var_fj_22_;
		for (Fe += 4 * ((fj) var_fj).x; Fe > 2097152;
		     Fe -= ((fj) var_fj_22_).x) {
		    pp var_pp = re.b((byte) 127);
		    if (var_pp == null)
			break;
		    var_fj_22_ = (fj) var_pp;
		    var_fj_22_.a((byte) -62);
		    var_fj_22_.unlink(-60);
		    ((qj) this).ud.releasePbuffer(var_fj_22_.b((byte) -114));
		}
		Ae.a(var_fj, (byte) -62, (long) (qe.E() << 16 | qe.u()));
	    }
	    re.a((byte) -121, var_fj);
	    ((qj) this).ud.setPbuffer(var_fj.b((byte) -103));
	} else {
	    if (ve == null)
		ve = new qk(this);
	    if (ve == pe)
		throw new RuntimeException();
	    b(255, ve);
	    if (bool) {
		pca var_pca
		    = (pca) Ae.a(-32748, (long) (qe.E() << 16 | qe.u()));
		if (var_pca == null) {
		    var_pca = new pca(this, 6402, qe.E(), qe.u());
		    pca var_pca_23_;
		    for (Fe += ((pca) var_pca).F; Fe > 2097152;
			 Fe -= ((pca) var_pca_23_).F) {
			pp var_pp = re.b((byte) 127);
			if (var_pp == null)
			    break;
			var_pca_23_ = (pca) var_pp;
			var_pca_23_.a((byte) -86);
			var_pca_23_.unlink(-79);
			var_pca_23_.b((byte) 126);
		    }
		    Ae.a(var_pca, (byte) -106, (long) (qe.E() << 16 | qe.u()));
		}
		re.a((byte) -126, var_pca);
		ve.a(8, var_pca, -2693);
	    }
	    ve.a(((eca) qe).m, (byte) 1, 0);
	}
	((qj) this).od = var_f.E();
	((qj) this).ib = var_f.u();
	B(-13);
	h((byte) 16);
	JA();
    }
    
    private final void k(int i) {
	if (i != 13842)
	    a((Canvas) null);
	if (Kf) {
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5888);
	    Kf = false;
	}
	Pc++;
    }
    
    private final void l(int i) {
	ob++;
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(Lg, 0);
	if (i != 692534472)
	    ((qj) this).Zg = 23;
	OpenGL.glMatrixMode(5888);
    }
    
    final boolean n() {
	tb++;
	return true;
    }
    
    final int[] h(int i, int i_24_, int i_25_, int i_26_) {
	xc++;
	int[] is = new int[i_26_ * i_25_];
	for (int i_27_ = 0; i_26_ > i_27_; i_27_++)
	    OpenGL.glReadPixelsi(i, -i_24_ - i_27_ + ((qj) this).ib, i_25_, 1,
				 32993, ((qj) this).Zg, is, i_25_ * i_27_);
	return is;
    }
    
    final void a(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_,
		 int i_33_, int i_34_, int i_35_, int i_36_) {
	v(-2);
	id++;
	b((byte) 83, i_36_);
	OpenGL.glBegin(4);
	OpenGL.glColor4ub((byte) (i_33_ >> 16), (byte) (i_33_ >> 8),
			  (byte) i_33_, (byte) (i_33_ >> 24));
	OpenGL.glVertex2f((float) i + 0.35F, (float) i_28_ + 0.35F);
	OpenGL.glColor4ub((byte) (i_34_ >> 16), (byte) (i_34_ >> 8),
			  (byte) i_34_, (byte) (i_34_ >> 24));
	OpenGL.glVertex2f((float) i_29_ + 0.35F, (float) i_30_ + 0.35F);
	OpenGL.glColor4ub((byte) (i_35_ >> 16), (byte) (i_35_ >> 8),
			  (byte) i_35_, (byte) (i_35_ >> 24));
	OpenGL.glVertex2f((float) i_31_ + 0.35F, (float) i_32_ + 0.35F);
	OpenGL.glEnd();
    }
    
    private final void m(int i) {
	mb++;
	float f = (float) -((qj) this).kg * Vg / (float) ((qj) this).bg;
	float f_37_ = Vg * (float) -((qj) this).ag / (float) ((qj) this).eg;
	float f_38_ = (Vg * (float) (((qj) this).od - ((qj) this).kg)
		       / (float) ((qj) this).bg);
	float f_39_ = ((float) (((qj) this).ib - ((qj) this).ag) * Vg
		       / (float) ((qj) this).eg);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	if (f != f_38_ && f_39_ != f_37_)
	    OpenGL.glOrtho((double) f, (double) f_38_, (double) -f_39_,
			   (double) -f_37_, (double) ((qj) this).Jf,
			   (double) Ze);
	OpenGL.glMatrixMode(i);
    }
    
    private final void b(byte i) {
	Qb++;
	ar.S[1] = ((qj) this).Xf * ((qj) this).Xg;
	ar.S[0] = ((qj) this).wf * ((qj) this).Xf;
	ar.S[2] = ((qj) this).Xf * ((qj) this).pf;
	ar.S[3] = 1.0F;
	if (i != 42)
	    k((int) 65);
	OpenGL.glLightModelfv(2899, ar.S, 0);
    }
    
    final void ra(float f) {
	if (f != ((qj) this).Xf) {
	    ((qj) this).Xf = f;
	    b((byte) 42);
	}
	pb++;
    }
    
    private final void n(int i) {
	uc++;
	if (i <= 49)
	    xg = false;
	int i_40_ = 0;
	while (!((qj) this).ud.a()) {
	    if (i_40_++ > 5)
		throw new RuntimeException("");
	    Connection.a(-28448, 1000L);
	}
    }
    
    final Class_i a(int i, int i_41_, int[][] is, int[][] is_42_, int i_43_,
		    int i_44_, int i_45_) {
	t++;
	return new dga(this, i_44_, i_45_, i, i_41_, is, is_42_, i_43_);
    }
    
    final void V(int i, int i_46_, int i_47_, int i_48_) {
	if (Ug < i)
	    Ug = i;
	if (ch > i_48_)
	    ch = i_48_;
	if (i_46_ > qf)
	    qf = i_46_;
	tc++;
	if (yg > i_47_)
	    yg = i_47_;
	OpenGL.glEnable(3089);
	s(0);
	a((byte) -113);
    }
    
    final void a(rg var_rg, int i) {
	vb++;
	rg var_rg_49_ = qg[Sf];
	if (var_rg != var_rg_49_) {
	    if (var_rg != null) {
		if (var_rg_49_ == null)
		    OpenGL.glEnable(((rg) var_rg).i);
		else if (((rg) var_rg).i != ((rg) var_rg_49_).i) {
		    OpenGL.glDisable(((rg) var_rg_49_).i);
		    OpenGL.glEnable(((rg) var_rg).i);
		}
		OpenGL.glBindTexture(((rg) var_rg).i, var_rg.a(true));
	    } else
		OpenGL.glDisable(((rg) var_rg_49_).i);
	    qg[Sf] = var_rg;
	}
	Oe &= i;
    }
    
    final void IA(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_,
		  byte[] is, int i_55_, int i_56_) {
	F++;
	float f;
	float f_57_;
	if (jg != null && ((pm) jg).u >= i_51_ && ((pm) jg).G >= i_52_) {
	    jg.a(0, 6406, 0, 0, false, i_52_, 3314, 0, is, i_51_);
	    f = (float) i_51_ * ((ar) jg).O / (float) ((pm) jg).u;
	    f_57_ = ((ar) jg).M * (float) i_52_ / (float) ((pm) jg).G;
	} else {
	    jg = pga.a(i_52_, false, this, 123, is, i_51_, 6406, 6406);
	    jg.a(false, (byte) -37, false);
	    f = ((ar) jg).O;
	    f_57_ = ((ar) jg).M;
	}
	m((byte) 3);
	a(jg, -2);
	b((byte) 43, i_56_);
	OpenGL.glColor4ub((byte) (i_53_ >> 16), (byte) (i_53_ >> 8),
			  (byte) i_53_, (byte) (i_53_ >> 24));
	e(-29455, i_54_);
	a(34165, -465309136, 34165);
	b(0, 768, 768, 34166);
	b(2, 770, 768, 5890);
	a(34166, 770, 0, true);
	a(5890, 770, 2, true);
	float f_58_ = (float) i;
	float f_59_ = (float) i_50_;
	float f_60_ = (float) i_51_ + f_58_;
	float f_61_ = (float) i_52_ + f_59_;
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_58_, f_59_);
	OpenGL.glTexCoord2f(0.0F, f);
	OpenGL.glVertex2f(f_58_, f_61_);
	OpenGL.glTexCoord2f(f_57_, f);
	OpenGL.glVertex2f(f_60_, f_61_);
	OpenGL.glTexCoord2f(f_57_, 0.0F);
	OpenGL.glVertex2f(f_60_, f_59_);
	OpenGL.glEnd();
	b(0, 768, 768, 5890);
	b(2, 770, 768, 34166);
	a(5890, 770, 0, true);
	a(34166, 770, 2, true);
    }
    
    final void a() {
	if (Yd != null && Yd.j(-16056)) {
	    Jd.a((byte) -44, Yd);
	    Id.b(6408);
	}
	Rd++;
    }
    
    final void a(float f, float f_62_, float f_63_) {
	GameOutPacket.g = f_62_;
	fd++;
	bl.J = f_63_;
	ol.d = f;
    }
    
    final boolean r() {
	yd++;
	if (Yd == null || ((qj) this).Ed > 1 && !Vf)
	    return false;
	return true;
    }
    
    final void b(int i, byte i_64_) {
	Pb++;
	if (i_64_ <= -13)
	    a(i, true, true);
    }
    
    final jt a(jt var_jt, jt var_jt_65_, float f, jt var_jt_66_) {
	zc++;
	if (var_jt != null && var_jt_65_ != null && ((qj) this).Lf
	    && ((qj) this).wg) {
	    Class_eb class_eb = null;
	    bm var_bm = (bm) var_jt;
	    bm var_bm_67_ = (bm) var_jt_65_;
	    waa var_waa = var_bm.b((byte) 37);
	    waa var_waa_68_ = var_bm_67_.b((byte) 37);
	    if (var_waa != null && var_waa_68_ != null) {
		int i = (((waa) var_waa).s > ((waa) var_waa_68_).s
			 ? ((waa) var_waa).s : ((waa) var_waa_68_).s);
		if (var_jt_66_ != var_jt && var_jt_66_ != var_jt_65_
		    && var_jt_66_ instanceof Class_eb) {
		    Class_eb class_eb_69_ = (Class_eb) var_jt_66_;
		    if (class_eb_69_.b(30576) == i)
			class_eb = class_eb_69_;
		}
		if (class_eb == null)
		    class_eb = new Class_eb(this, i);
		if (class_eb.a(true, var_waa_68_, var_waa, f))
		    return class_eb;
	    }
	}
	if (!(f < 0.5F))
	    return var_jt_65_;
	return var_jt;
    }
    
    final int U() {
	Vb++;
	return Ze;
    }
    
    final void A() {
	for (Node class_d = ke.a((int) 114); class_d != null;
	     class_d = ke.b((byte) 52))
	    ((ns) class_d).b((byte) -104);
	sc++;
	if (Jd != null)
	    Jd.a((int) 0);
	if (((qj) this).ud != null) {
	    d((byte) 17);
	    Enumeration enumeration = Bb.keys();
	    while (enumeration.hasMoreElements()) {
		Canvas canvas = (Canvas) enumeration.nextElement();
		Long var_long = (Long) Bb.get(canvas);
		((qj) this).ud.releaseSurface(canvas, var_long.longValue());
	    }
	    ((qj) this).ud.release();
	    ((qj) this).ud = null;
	}
	if (oe) {
	    lea.a(false, false, true);
	    oe = false;
	}
    }
    
    final void o(int i) {
	if (i != 13211)
	    t(-53);
	OpenGL.glLightfv(16384, 4611, ((qj) this).Ng, 0);
	Tb++;
	OpenGL.glLightfv(16385, 4611, jf, 0);
    }
    
    final void CA(int i, int i_70_, int i_71_, int i_72_) {
	((qj) this).sg = i_71_;
	lb++;
	((qj) this).ah = i_70_;
	((qj) this).yf = i_72_;
	((qj) this).Hf = true;
	((qj) this).Nf = i;
    }
    
    final void getTexSize(int size) {
	ic++;
	if (size < 128 || size > 1024)
	    throw new IllegalArgumentException();
	((qj) this).Wd = size;
	Id.b(6408);
    }
    
    final int d(int i, int i_73_) {
	Kd++;
	if (i != -6402)
	    Hg = -1.641317F;
	if (i_73_ == 6406 || i_73_ == 6409)
	    return 1;
	if (i_73_ != 6410 && i_73_ != 34846 && i_73_ != 34844) {
	    if (i_73_ != 6407) {
		if (i_73_ == 6408 || i_73_ == 34847)
		    return 4;
		if (i_73_ == 34843)
		    return 6;
		if (i_73_ == 34842)
		    return 8;
		if (i_73_ != 6402) {
		    if (i_73_ == 6401)
			return 1;
		} else
		    return 3;
	    } else
		return 3;
	} else
	    return 2;
	throw new IllegalArgumentException("");
    }
    
    final void pa(int i, int i_74_, int i_75_) {
	if (i != ((qj) this).nf || i_74_ != ((qj) this).bf
	    || ((qj) this).cf != i_75_) {
	    ((qj) this).nf = i;
	    ((qj) this).cf = i_75_;
	    ((qj) this).bf = i_74_;
	    c(true);
	    z(32411);
	}
	ee++;
    }
    
    static final sa a(byte i, pl var_pl, int i_76_, int i_77_) {
	if (i != 11)
	    a((byte) 44, (pl) null, -80, 51);
	Fc++;
	byte[] is = var_pl.b(i_76_, i ^ 0x2d, i_77_);
	if (is == null)
	    return null;
	return new sa(is);
    }
    
    final Class_q C() {
	Rc++;
	return new Class_db();
    }
    
    final waa p(int i) {
	if (i != 8960)
	    B(-87);
	S++;
	if (gg == null)
	    return null;
	return gg.b((byte) 37);
    }
    
    final void ZA(boolean bool) {
	bb++;
	Yg = bool;
	j((byte) -107);
    }
    
    final int T() {
	Ic++;
	int i = eh;
	eh = 0;
	return i;
    }
    
    final f a(int i, int i_78_, int i_79_, int i_80_, boolean bool) {
	gb++;
	return new eca(this, i, i_78_, i_79_, i_80_);
    }
    
    final void a(Canvas canvas) {
	Nb++;
	D = 0L;
	v = null;
	if (canvas == null || Sc == canvas) {
	    D = Lb;
	    v = Sc;
	} else if (Bb.containsKey(canvas)) {
	    Long var_long = (Long) Bb.get(canvas);
	    D = var_long.longValue();
	    v = canvas;
	}
	if (v == null || D == 0L)
	    throw new RuntimeException();
	((qj) this).ud.setSurface(D);
	x(1);
    }
    
    qj(Canvas canvas, fa var_fa, int i) {
	super(var_fa);
	Gd = new su();
	ge = new Class_db();
	((qj) this).he = new Class_db();
	((qj) this).le = 3;
	((qj) this).me = 8;
	oe = false;
	ke = new Class_ae();
	te = new jh[4];
	se = -1;
	ue = -1;
	we = new jh[4];
	xe = new jh[4];
	ye = -1;
	re = new je();
	Ae = new il(16);
	Be = new Class_ae();
	Ge = new Class_ae();
	He = new Class_ae();
	Ie = new Class_ae();
	Je = new Class_ae();
	Ke = new Class_ae();
	Le = new Class_ae();
	((qj) this).Ne = new Class_db();
	((qj) this).Ve = new Class_db();
	((qj) this).We = new Class_db();
	((qj) this).nf = -1;
	((qj) this).af = 3584.0F;
	((qj) this).lf = -1.0F;
	((qj) this).bf = -1;
	((qj) this).yf = 0;
	Tf = 0;
	Mf = false;
	rf = 1.0F;
	qf = 0;
	hg = -1;
	((qj) this).If = -1.0F;
	jf = new float[4];
	Ze = 3584;
	gf = 0;
	((qj) this).pf = 1.0F;
	rg = 8448;
	cg = new float[4];
	((qj) this).cf = 0;
	((qj) this).wf = 1.0F;
	((qj) this).Jf = 50;
	ug = -1.0F;
	Ug = 0;
	((qj) this).eg = 512;
	Lg = new float[16];
	Xe = 0.0F;
	((qj) this).bg = 512;
	Vg = 1.0F;
	((qj) this).ag = 0;
	((qj) this).Gg = 3584.0F;
	Hg = -1.0F;
	Yg = true;
	((qj) this).sg = -1;
	((qj) this).Xg = 1.0F;
	Sg = 8448;
	Rg = new gga[ol.o];
	((qj) this).kg = 0;
	yg = 0;
	((qj) this).Ng = new float[4];
	((qj) this).ah = -1;
	ch = 0;
	Wg = new float[4];
	((qj) this).Zf = new fw(8192);
	((qj) this).fh = new byte[16384];
	((qj) this).hh = new int[1];
	((qj) this).ih = new int[1];
	((qj) this).jh = new int[1];
	v = Sc = canvas;
	((qj) this).Ed = i;
	if (!Class_ue.a("jaclib", -103))
	    throw new RuntimeException("");
	if (!Class_ue.a("jaggl", -69))
	    throw new RuntimeException("");
	try {
	    ((qj) this).ud = new OpenGL();
	    D = Lb
		= ((qj) this).ud.init(canvas, 8, 8, 8, 24, 0, ((qj) this).Ed);
	    if (Lb == 0L)
		throw new RuntimeException("");
	    n((int) 76);
	    int i_81_ = A(10505);
	    if (i_81_ != 0)
		throw new RuntimeException("");
	    ((qj) this).Zg = ((qj) this).ig ? 33639 : 5121;
	    if (Uf.indexOf("radeon") != -1) {
		int i_82_ = 0;
		boolean bool = false;
		boolean bool_83_ = false;
		String[] strings = vq.a(-91, Uf.replace('/', ' '), ' ');
		for (int i_84_ = 0; i_84_ < strings.length; i_84_++) {
		    String string = strings[i_84_];
		    try {
			if (string.length() > 0) {
			    if (string.charAt(0) == 'x' && string.length() >= 3
				&& Class_kd.a((byte) 124,
					      string.substring(1, 3))) {
				string = string.substring(1);
				bool_83_ = true;
			    }
			    if (string.equals("hd"))
				bool = true;
			    else {
				if (string.startsWith("hd")) {
				    bool = true;
				    string = string.substring(2);
				}
				if (string.length() >= 4
				    && Class_kd.a((byte) 104,
						  string.substring(0, 4))) {
				    i_82_ = Class_g.a(128,
						      string.substring(0, 4));
				    break;
				}
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		if (!bool || i_82_ < 4000)
		    ((qj) this).zg = false;
		if (!bool_83_ && !bool) {
		    if (i_82_ >= 7000 && i_82_ <= 9250)
			((qj) this).Bg = false;
		    if (i_82_ >= 7000 && i_82_ <= 7999)
			Cg = false;
		}
		((qj) this).vf &= ((qj) this).ud.a("GL_ARB_half_float_pixel");
		mg = Cg;
		((qj) this).hf = true;
	    }
	    if (Pg.indexOf("intel") != -1)
		((qj) this).wg = false;
	    Ag = !Pg.equals("s3 graphics");
	    if (Cg) {
		int[] is = new int[1];
		OpenGL.glGenBuffersARB(1, is, 0);
	    }
	    gda.a(false, true, (byte) 88);
	    oe = true;
	    Id = new taa(this, ((Class_r) this).j);
	    w(1);
	    ((qj) this).ie = new gk(this);
	    Jd = new dk(this);
	    if (Jd.c((int) 79)) {
		Yd = new bf(this);
		if (!Yd.m(-11982)) {
		    Yd.c(35632);
		    Yd = null;
		}
	    }
	    Td = new kfa(this);
	    i((byte) -128);
	    x(1);
	    s();
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    A();
	    throw new RuntimeException("");
	}
    }
    
    final void b(Canvas canvas) {
	xd++;
	long l = 0L;
	if (canvas == null || Sc == canvas)
	    l = Lb;
	else if (Bb.containsKey(canvas)) {
	    Long var_long = (Long) Bb.get(canvas);
	    l = var_long.longValue();
	}
	if (l == 0L)
	    throw new RuntimeException();
	((qj) this).ud.surfaceResized(l);
	if (v == canvas)
	    x(1);
    }
    
    final void e(int i, int i_85_, int i_86_, int i_87_, int i_88_) {
	Vd++;
	if (i_86_ < 0)
	    i_86_ = -i_86_;
	if (i_86_ + i >= Ug && i - i_86_ <= yg && i_85_ + i_86_ >= qf
	    && i_85_ - i_86_ <= ch) {
	    v(-106);
	    b((byte) 78, i_88_);
	    OpenGL.glColor4ub((byte) (i_87_ >> 16), (byte) (i_87_ >> 8),
			      (byte) i_87_, (byte) (i_87_ >> 24));
	    float f = (float) i + 0.35F;
	    float f_89_ = (float) i_85_ + 0.35F;
	    int i_90_ = i_86_ << 1;
	    if (ug > (float) i_90_) {
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f + 1.0F, f_89_ + 1.0F);
		OpenGL.glVertex2f(f + 1.0F, f_89_ - 1.0F);
		OpenGL.glVertex2f(f - 1.0F, f_89_ - 1.0F);
		OpenGL.glVertex2f(f - 1.0F, f_89_ + 1.0F);
		OpenGL.glEnd();
	    } else if (!((float) i_90_ <= Hg)) {
		OpenGL.glBegin(6);
		OpenGL.glVertex2f(f, f_89_);
		int i_91_ = 262144 / (i_86_ * 6);
		if (i_91_ > 64) {
		    if (i_91_ > 512)
			i_91_ = 512;
		} else
		    i_91_ = 64;
		i_91_ = ko.a((byte) 114, i_91_);
		OpenGL.glVertex2f((float) i_86_ + f, f_89_);
		for (int i_92_ = 16384 - i_91_; i_92_ > 0; i_92_ -= i_91_)
		    OpenGL.glVertex2f(dea.f[i_92_] * (float) i_86_ + f,
				      f_89_ + (float) i_86_ * dea.d[i_92_]);
		OpenGL.glVertex2f(f + (float) i_86_, f_89_);
		OpenGL.glEnd();
	    } else {
		OpenGL.glEnable(2832);
		OpenGL.glPointSize((float) i_90_);
		OpenGL.glBegin(0);
		OpenGL.glVertex2f(f, f_89_);
		OpenGL.glEnd();
		OpenGL.glDisable(2832);
	    }
	}
    }
    
    final void b(int i, int i_93_, int i_94_, int i_95_) {
	OpenGL.glTexEnvi(8960, i + 34176, i_95_);
	if (i_94_ != 768)
	    T();
	oc++;
	OpenGL.glTexEnvi(8960, i + 34192, i_93_);
    }
    
    final void q() {
	yb++;
	if (!((qj) this).wg) {
	    if (!dg)
		throw new RuntimeException("");
	    qe.da(0, 0, ((qj) this).od, ((qj) this).ib, 0, 0);
	    ((qj) this).ud.setSurface(D);
	} else {
	    if (ve != pe)
		throw new RuntimeException();
	    ve.a((int) 0, 1);
	    ve.a((int) 8, 1);
	    a(-69, ve);
	}
	qe = null;
	((qj) this).od = Tc;
	((qj) this).ib = C;
	B(-13);
	h((byte) 16);
	JA();
    }
    
    private final void a(float f, float f_96_, int i, float f_97_) {
	Nc++;
	OpenGL.glMatrixMode(5890);
	if (Kf)
	    OpenGL.glLoadIdentity();
	if (i != 1)
	    ra(-0.015320938F);
	OpenGL.glTranslatef(f_96_, f_97_, f);
	OpenGL.glMatrixMode(5888);
	Kf = true;
    }
    
    final void MA(int i, int i_98_, int i_99_, int[] is) {
	Oc++;
	float f = ((float) i_99_ * ((Class_db) ((qj) this).Ne).L
		   + (((Class_db) ((qj) this).Ne).v * (float) i
		      + (float) i_98_ * ((Class_db) ((qj) this).Ne).j)
		   + ((Class_db) ((qj) this).Ne).p);
	if ((float) ((qj) this).Jf > f || (float) Ze < f)
	    is[0] = is[1] = is[2] = -1;
	else {
	    int i_100_
		= (int) ((float) ((qj) this).bg
			 * (((Class_db) ((qj) this).Ne).A * (float) i
			    + ((Class_db) ((qj) this).Ne).F * (float) i_98_
			    + (float) i_99_ * ((Class_db) ((qj) this).Ne).x
			    + ((Class_db) ((qj) this).Ne).J)
			 / f);
	    int i_101_
		= (int) ((float) ((qj) this).eg
			 * (((Class_db) ((qj) this).Ne).w
			    + ((float) i_99_ * ((Class_db) ((qj) this).Ne).n
			       + (((Class_db) ((qj) this).Ne).q * (float) i_98_
				  + ((float) i
				     * ((Class_db) ((qj) this).Ne).r))))
			 / f);
	    is[0] = (int) ((float) i_100_ - ((qj) this).dh);
	    is[1] = (int) ((float) i_101_ - ((qj) this).lg);
	    is[2] = (int) f;
	}
    }
    
    final void a(int i, gga[] var_ggas) {
	nd++;
	for (int i_102_ = 0; i_102_ < i; i_102_++)
	    Rg[i_102_] = var_ggas[i_102_];
	sf = i;
	if (Ef != 1)
	    f((byte) -68);
    }
    
    private final void c(byte i) {
	if (xg && !tg)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
	Cb++;
	if (i <= 39)
	    m((int) 87);
    }
    
    final void J(int i, int i_103_, int i_104_, int i_105_, int i_106_,
		 int i_107_) {
	Hd++;
	float f = (float) i + 0.35F;
	float f_108_ = (float) i_103_ + 0.35F;
	float f_109_ = (float) i_104_ + f;
	float f_110_ = f_108_ + (float) i_105_;
	v(-108);
	b((byte) 91, i_107_);
	OpenGL.glColor4ub((byte) (i_106_ >> 16), (byte) (i_106_ >> 8),
			  (byte) i_106_, (byte) (i_106_ >> 24));
	if (Mg)
	    OpenGL.glDisable(32925);
	OpenGL.glBegin(7);
	OpenGL.glVertex2f(f, f_108_);
	OpenGL.glVertex2f(f, f_110_);
	OpenGL.glVertex2f(f_109_, f_110_);
	OpenGL.glVertex2f(f_109_, f_108_);
	OpenGL.glEnd();
	if (Mg)
	    OpenGL.glEnable(32925);
    }
    
    final void a(jt var_jt) {
	gg = (bm) var_jt;
	Jb++;
    }
    
    final void a(IncomingPackets incomingPackets) {
	Mc++;
	((qj) this).ne = ((ns) (ns) incomingPackets).o;
	if (Qg == null) {
	    fw var_fw = new fw(80);
	    if (!((qj) this).ig) {
		var_fw.a((byte) -71, -1.0F);
		var_fw.a((byte) -71, -1.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, -1.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, -1.0F);
		var_fw.a((byte) -71, 1.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, 0.0F);
		var_fw.a((byte) -71, 0.0F);
	    } else {
		var_fw.a(-1.0F, 55);
		var_fw.a(-1.0F, 93);
		var_fw.a(0.0F, 111);
		var_fw.a(0.0F, -124);
		var_fw.a(1.0F, 84);
		var_fw.a(1.0F, 116);
		var_fw.a(-1.0F, 96);
		var_fw.a(0.0F, 88);
		var_fw.a(1.0F, 108);
		var_fw.a(1.0F, 127);
		var_fw.a(1.0F, 63);
		var_fw.a(1.0F, -68);
		var_fw.a(0.0F, -79);
		var_fw.a(1.0F, 53);
		var_fw.a(0.0F, 71);
		var_fw.a(-1.0F, -67);
		var_fw.a(1.0F, -54);
		var_fw.a(0.0F, -101);
		var_fw.a(0.0F, -85);
		var_fw.a(0.0F, 106);
	    }
	    Qg = a(((BytesParser) var_fw).bytes, ((BytesParser) var_fw).pos, false, 20, -84);
	    ((qj) this).fg = new gv(Qg, 5126, 3, 0);
	    ((qj) this).mf = new gv(Qg, 5126, 2, 12);
	    Gd.a((byte) 110, this);
	}
    }
    
    final boolean x() {
	cb++;
	return true;
    }
    
    final boolean g() {
	B++;
	return true;
    }
    
    final boolean h() {
	lc++;
	return false;
    }
    
    final int BA() {
	Cc++;
	return ((qj) this).Jf;
    }
    
    final void a(int i, float f, float f_111_) {
	if (i != 1)
	    a((aga) null, false);
	Xe = f_111_;
	rf = f;
	Sb++;
	c(true);
    }
    
    final boolean e() {
	M++;
	return Td.a(-9, 3);
    }
    
    final void c(int i, int i_112_, int i_113_, int i_114_, int i_115_,
		 int i_116_) {
	x++;
	float f = (float) i + 0.35F;
	float f_117_ = (float) i_112_ + 0.35F;
	float f_118_ = f + (float) i_113_ - 1.0F;
	v(-99);
	float f_119_ = f_117_ + (float) i_114_ - 1.0F;
	b((byte) 108, i_116_);
	OpenGL.glColor4ub((byte) (i_115_ >> 16), (byte) (i_115_ >> 8),
			  (byte) i_115_, (byte) (i_115_ >> 24));
	if (Mg)
	    OpenGL.glDisable(32925);
	OpenGL.glBegin(2);
	OpenGL.glVertex2f(f, f_117_);
	OpenGL.glVertex2f(f, f_119_);
	OpenGL.glVertex2f(f_118_, f_119_);
	OpenGL.glVertex2f(f_118_, f_117_);
	OpenGL.glEnd();
	if (Mg)
	    OpenGL.glEnable(32925);
    }
    
    private final void d(byte i) {
	if (i != 17)
	    Tf = 38;
	((qj) this).ud.b();
	z++;
    }
    
    final void a(boolean bool, byte i) {
	if (i < -113) {
	    if (of != bool) {
		of = bool;
		z(32411);
		Oe &= ~0x1f;
	    }
	    p++;
	}
    }
    
    final void YA(int i, int i_120_, int i_121_, int i_122_) {
	Ad++;
	if (!((qj) this).Hf)
	    throw new RuntimeException("");
	((qj) this).yf = i_122_;
	((qj) this).sg = i_121_;
	((qj) this).Nf = i;
	((qj) this).ah = i_120_;
	if (Mf) {
	    ((kfa) Td).m.d((byte) 108);
	    ((kfa) Td).m.b((int) -82);
	}
    }
    
    final int b() {
	Mb++;
	return Ce + ((qj) this).De + ((qj) this).Ee;
    }
    
    final void e(int i, int i_123_) {
	if (i != -29455)
	    a((IncomingPackets) null);
	ar.S[0] = (float) uca.a(16711680, i_123_) / 1.671168E7F;
	Hc++;
	ar.S[3] = (float) (i_123_ >>> 24) / 255.0F;
	ar.S[2] = (float) uca.a(i_123_, 255) / 255.0F;
	ar.S[1] = (float) uca.a(65280, i_123_) / 65280.0F;
	OpenGL.glTexEnvfv(8960, 8705, ar.S, 0);
    }
    
    final void s() {
	ub++;
	if (Ag && ((qj) this).od > 0 && ((qj) this).ib > 0) {
	    int i = Ug;
	    int i_124_ = yg;
	    int i_125_ = qf;
	    int i_126_ = ch;
	    JA();
	    OpenGL.glReadBuffer(1028);
	    OpenGL.glDrawBuffer(1029);
	    B(-13);
	    a(false, (byte) -114);
	    a((byte) 105, false);
	    a((int) 119, false);
	    a(false, (int) 122);
	    a((rg) null, -2);
	    b((int) -2, (byte) -60);
	    c(false, 1);
	    b((byte) 101, (int) 0);
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadIdentity();
	    OpenGL.glRasterPos2i(0, 0);
	    OpenGL.glCopyPixels(0, 0, ((qj) this).od, ((qj) this).ib, 6144);
	    OpenGL.glFlush();
	    OpenGL.glReadBuffer(1029);
	    OpenGL.glDrawBuffer(1029);
	    da(i, i_125_, i_124_, i_126_);
	}
    }
    
    private final void q(int i) {
	md++;
	Lg[10] = Ff;
	Lg[14] = Bf;
	((qj) this).af = ((float) -Ze + Lg[14]) / Lg[10];
	((qj) this).Gg = (float) Ze;
	if (i != -16543)
	    ((qj) this).jh = null;
    }
    
    final void r(int i) {
	jd++;
	if (i != 0)
	    Cg = true;
	OpenGL.glPopMatrix();
    }
    
    final nl a(int i, boolean bool, int i_127_, Buffer buffer, int i_128_) {
	Ac++;
	if (Cg && (!bool || mg))
	    return new bu(this, i, buffer, i_127_, bool);
	if (i_128_ != 3)
	    we = null;
	return new in(this, i, buffer);
    }
    
    final synchronized void a(long l, int i) {
	hb++;
	Node class_d = new Node();
	((Node) class_d).nodeID = l;
	Le.b(class_d, (byte) 93);
	if (i < 18)
	    Qg = null;
    }
    
    final void a(byte i, float f) {
	if (f != Vg) {
	    Vg = f;
	    if (Ef == 3)
		m(5888);
	}
	if (i == 95)
	    hd++;
    }
    
    final void a(int i, int i_129_, int i_130_, int i_131_, int i_132_,
		 int i_133_, ua var_ua, int i_134_, int i_135_) {
	rb++;
	hj var_hj = (hj) var_ua;
	ar var_ar = ((hj) var_hj).f;
	m((byte) 3);
	a(((hj) var_hj).f, -2);
	b((byte) 63, i_133_);
	a(7681, -465309136, 8448);
	b(0, 768, 768, 34167);
	float f = ((ar) var_ar).O / (float) ((ar) var_ar).T;
	float f_136_ = ((ar) var_ar).M / (float) ((ar) var_ar).N;
	float f_137_ = (float) -i + (float) i_130_;
	float f_138_ = (float) -i_129_ + (float) i_131_;
	float f_139_ = (float) (1.0 / Math.sqrt((double) (f_137_ * f_137_
							  + f_138_ * f_138_)));
	f_138_ *= f_139_;
	f_137_ *= f_139_;
	OpenGL.glColor4ub((byte) (i_132_ >> 16), (byte) (i_132_ >> 8),
			  (byte) i_132_, (byte) (i_132_ >> 24));
	OpenGL.glBegin(1);
	OpenGL.glTexCoord2f(f * (float) (i - i_134_),
			    f_136_ * (float) (i_129_ - i_135_));
	OpenGL.glVertex2f((float) i + 0.35F, (float) i_129_ + 0.35F);
	OpenGL.glTexCoord2f(f * (float) (i_130_ - i_134_),
			    f_136_ * (float) (i_131_ - i_135_));
	OpenGL.glVertex2f((float) i_130_ + f_137_ + 0.35F,
			  f_138_ + (float) i_131_ + 0.35F);
	OpenGL.glEnd();
	b(0, 768, 768, 5890);
    }
    
    final void a(int i, int i_140_, int i_141_, dw var_dw, int i_142_) {
	Bd++;
	int i_143_ = var_dw.a((byte) -17);
	if (i_142_ != 255)
	    ((qj) this).wf = 0.2851723F;
	i_140_ *= a((byte) 105, i_143_);
	a(-98, var_dw);
	OpenGL.glDrawElements(i_141_, i, i_143_,
			      (long) i_140_ + var_dw.a(13456));
    }
    
    final void a(int i, int i_144_, boolean bool, boolean bool_145_) {
	mc++;
	if (bh != i || Mf != ((qj) this).Hf) {
	    pm var_pm = null;
	    int i_146_ = 0;
	    byte i_147_ = 0;
	    int i_148_ = 0;
	    byte i_149_ = ((qj) this).Hf ? (byte) 3 : (byte) 0;
	    if (i < 0)
		k(13842);
	    else {
		var_pm = Id.a(i, 256);
		vca var_vca = ((Class_r) this).j.a(i, (byte) 86);
		if (((vca) var_vca).n != 0 || ((vca) var_vca).c != 0) {
		    int i_150_ = !((vca) var_vca).p ? 128 : 64;
		    int i_151_ = i_150_ * 50;
		    a(0.0F,
		      ((float) (((vca) var_vca).n * (((qj) this).je % i_151_))
		       / (float) i_151_),
		      1,
		      ((float) (((vca) var_vca).c * (((qj) this).je % i_151_))
		       / (float) i_151_));
		} else
		    k(13842);
		i_146_ = ((vca) var_vca).a;
		if (!((qj) this).Hf) {
		    i_147_ = ((vca) var_vca).w;
		    i_148_ = ((vca) var_vca).o;
		    i_149_ = ((vca) var_vca).i;
		}
	    }
	    Td.a(bool_145_, bool, -128, i_147_, i_148_, i_149_);
	    if (!Td.a(-27079, var_pm, i_146_)) {
		a(var_pm, -2);
		c(false, i_146_);
	    }
	    bh = i;
	    Mf = ((qj) this).Hf;
	}
	Oe &= ~0x7;
	if (i_144_ <= 21)
	    ((qj) this).ih = null;
    }
    
    private final void s(int i) {
	((qj) this).ng = (float) (yg - ((qj) this).kg);
	((qj) this).Pf = (float) (ch - ((qj) this).ag);
	if (i != 0)
	    ((qj) this).wf = 0.2703641F;
	((qj) this).lg = (float) (qf - ((qj) this).ag);
	((qj) this).dh = (float) (Ug - ((qj) this).kg);
	fb++;
    }
    
    final void a(int i, jh var_jh) {
	Gb++;
	if (((qj) this).xf) {
	    c(var_jh, (byte) -107);
	    a(var_jh, (int) -102);
	} else {
	    if (se < 0 || var_jh != we[se])
		throw new RuntimeException();
	    we[se--] = null;
	    var_jh.b(-9828);
	    if (se < 0)
		ze = pe = null;
	    else {
		ze = pe = we[se];
		ze.a(-5908);
	    }
	}
	int i_152_ = -124 / ((-9 - i) / 60);
    }
    
    final boolean o() {
	X++;
	return true;
    }
    
    final void a(float f, float f_153_, float f_154_, int i, float f_155_) {
	ar.S[3] = f_154_;
	ar.S[0] = f_153_;
	if (i != -23119)
	    ya();
	wc++;
	ar.S[2] = f;
	ar.S[1] = f_155_;
	OpenGL.glTexEnvfv(8960, 8705, ar.S, 0);
    }
    
    final void a(int i, int i_156_, int i_157_) {
	rc++;
	if (i_156_ != -465309136)
	    k();
	if (Sf != 0) {
	    OpenGL.glTexEnvi(8960, 34161, i);
	    OpenGL.glTexEnvi(8960, 34162, i_157_);
	} else {
	    boolean bool = false;
	    if (Sg != i) {
		OpenGL.glTexEnvi(8960, 34161, i);
		bool = true;
		Sg = i;
	    }
	    if (rg != i_157_) {
		OpenGL.glTexEnvi(8960, 34162, i_157_);
		rg = i_157_;
		bool = true;
	    }
	    if (bool)
		Oe &= ~0x1d;
	}
    }
    
    final void k() {
	Ec++;
	OpenGL.glFinish();
    }
    
    final int b(int i, int i_158_) {
	w++;
	return i_158_ ^ i_158_ & i;
    }
    
    final dw a(byte i, int i_159_, byte[] is, boolean bool, int i_160_) {
	be++;
	if (i >= -57)
	    return null;
	if (Cg && (!bool || mg))
	    return new nq(this, i_160_, is, i_159_, bool);
	return new wk(this, i_160_, is, i_159_);
    }
    
    final int a(int i, int i_161_) {
	wd++;
	return i | i_161_;
    }
    
    final Class_q t() {
	dd++;
	return ((qj) this).Ne;
    }
    
    final void a(gv var_gv, byte i, gv var_gv_162_, gv var_gv_163_,
		 gv var_gv_164_) {
	if (var_gv != null) {
	    a((byte) -128, ((gv) var_gv).c);
	    OpenGL.glVertexPointer(((gv) var_gv).h, ((gv) var_gv).b,
				   Df.a(30991),
				   Df.a((byte) 102) + (long) ((gv) var_gv).g);
	    OpenGL.glEnableClientState(32884);
	} else
	    OpenGL.glDisableClientState(32884);
	Q++;
	if (var_gv_164_ == null)
	    OpenGL.glDisableClientState(32885);
	else {
	    a((byte) -120, ((gv) var_gv_164_).c);
	    OpenGL.glNormalPointer(((gv) var_gv_164_).b, Df.a(30991),
				   (Df.a((byte) -126)
				    + (long) ((gv) var_gv_164_).g));
	    OpenGL.glEnableClientState(32885);
	}
	if (var_gv_162_ != null) {
	    a((byte) -126, ((gv) var_gv_162_).c);
	    OpenGL.glColorPointer(((gv) var_gv_162_).h, ((gv) var_gv_162_).b,
				  Df.a(30991),
				  (Df.a((byte) -103)
				   + (long) ((gv) var_gv_162_).g));
	    OpenGL.glEnableClientState(32886);
	} else
	    OpenGL.glDisableClientState(32886);
	if (i > 10) {
	    if (var_gv_163_ != null) {
		a((byte) -128, ((gv) var_gv_163_).c);
		OpenGL.glTexCoordPointer(((gv) var_gv_163_).h,
					 ((gv) var_gv_163_).b, Df.a(30991),
					 (Df.a((byte) 63)
					  + (long) ((gv) var_gv_163_).g));
		OpenGL.glEnableClientState(32888);
	    } else
		OpenGL.glDisableClientState(32888);
	}
    }
    
    final void a(int[] is) {
	is[1] = ((qj) this).ib;
	is[0] = ((qj) this).od;
	y++;
    }
    
    final void a(Class_q class_q) {
	((qj) this).Ne.M(class_q);
	V++;
	((qj) this).Ve.M(((qj) this).Ne);
	((qj) this).Ve.b(false);
	((qj) this).We.a(((qj) this).Ve, (byte) -77);
	if (Ef != 1)
	    l((byte) 29);
    }
    
    final void ya() {
	eb++;
	a(true, (int) -12);
	OpenGL.glClear(256);
    }
    
    final boolean m() {
	Sd++;
	return false;
    }
    
    final void a(int i, int i_165_, int i_166_, int i_167_, int i_168_,
		 int i_169_) {
	Zb++;
	v(5);
	b((byte) 54, i_169_);
	float f = (float) i_166_ - (float) i;
	float f_170_ = (float) -i_165_ + (float) i_167_;
	if (f == 0.0F && f_170_ == 0.0F)
	    f = 1.0F;
	else {
	    float f_171_
		= (float) (1.0
			   / Math.sqrt((double) (f * f + f_170_ * f_170_)));
	    f *= f_171_;
	    f_170_ *= f_171_;
	}
	OpenGL.glColor4ub((byte) (i_168_ >> 16), (byte) (i_168_ >> 8),
			  (byte) i_168_, (byte) (i_168_ >> 24));
	OpenGL.glBegin(1);
	OpenGL.glVertex2f((float) i + 0.35F, (float) i_165_ + 0.35F);
	OpenGL.glVertex2f(f + (float) i_166_ + 0.35F,
			  f_170_ + (float) i_167_ + 0.35F);
	OpenGL.glEnd();
    }
    
    final void la(int i, int i_172_, int i_173_, int i_174_) {
	((qj) this).eg = i_174_;
	((qj) this).kg = i;
	((qj) this).ag = i_172_;
	((qj) this).bg = i_173_;
	ab++;
	n((byte) 108);
	s(0);
	if (Ef == 3)
	    m(5888);
	else if (Ef == 2)
	    l(692534472);
    }
    
    final IncomingPackets c(int i) {
	gc++;
	ns var_ns = new ns(i);
	ke.b(var_ns, (byte) 93);
	return var_ns;
    }
    
    final void VA(int i, float f, float f_175_, float f_176_, float f_177_,
		  float f_178_) {
	qc++;
	boolean bool = hg != i;
	if (bool || f != ((qj) this).lf || ((qj) this).If != f_175_) {
	    hg = i;
	    ((qj) this).lf = f;
	    ((qj) this).If = f_175_;
	    if (bool) {
		((qj) this).Xg = (float) (0xff00 & hg) / 65280.0F;
		((qj) this).pf = (float) (hg & 0xff) / 255.0F;
		((qj) this).wf = (float) (hg & 0xff0000) / 1.671168E7F;
		b((byte) 42);
	    }
	    y(-56);
	}
	if (cg[0] != f_176_ || f_177_ != cg[1] || f_178_ != cg[2]) {
	    cg[1] = f_177_;
	    cg[0] = f_176_;
	    cg[2] = f_178_;
	    Wg[0] = -f_176_;
	    Wg[2] = -f_178_;
	    Wg[1] = -f_177_;
	    float f_179_
		= (float) (1.0 / Math.sqrt((double) (f_178_ * f_178_
						     + (f_176_ * f_176_
							+ f_177_ * f_177_))));
	    ((qj) this).Ng[2] = f_179_ * f_178_;
	    ((qj) this).Ng[1] = f_177_ * f_179_;
	    ((qj) this).Ng[0] = f_176_ * f_179_;
	    jf[1] = -((qj) this).Ng[1];
	    jf[2] = -((qj) this).Ng[2];
	    jf[0] = -((qj) this).Ng[0];
	    o(13211);
	    ((qj) this).Eg = (int) (256.0F * f_176_ / f_177_);
	    ((qj) this).Fg = (int) (f_178_ * 256.0F / f_177_);
	}
    }
    
    final void a(jh var_jh, int i) {
	if (i > -52)
	    ((qj) this).Kg = true;
	K++;
	if (ue < 0 || te[ue] != var_jh)
	    throw new RuntimeException();
	te[ue--] = null;
	var_jh.c(20966);
	if (ue >= 0) {
	    pe = te[ue];
	    pe.e(-128);
	} else
	    pe = null;
    }
    
    private final void t(int i) {
	A++;
	if (Ef != 1) {
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadIdentity();
	    if (((qj) this).od > 0 && ((qj) this).ib > 0)
		OpenGL.glOrtho(0.0, (double) ((qj) this).od,
			       (double) ((qj) this).ib, 0.0, -1.0, 1.0);
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadIdentity();
	    Ef = 1;
	    Oe &= ~0x18;
	}
	if (i != 16032)
	    a(null, null, false);
    }
    
    final void u(int i) {
	cc++;
	if (Oe != 8) {
	    k((byte) -45);
	    a(true, (byte) -125);
	    a((int) 94, true);
	    a(true, (int) -92);
	    b((byte) 35, (int) 1);
	    Oe = 8;
	}
	int i_180_ = -24 / ((i + 22) / 58);
    }
    
    final void b(boolean bool) {
	zb++;
    }
    
    final void e(byte i) {
	if (i <= 16)
	    d((Canvas) null);
	OpenGL.glPushMatrix();
	Yb++;
    }
    
    final void JA() {
	Ug = 0;
	yg = ((qj) this).od;
	ch = ((qj) this).ib;
	fc++;
	qf = 0;
	OpenGL.glDisable(3089);
	s(0);
    }
    
    final void d(int i) {
	Db++;
	d((byte) 17);
    }
    
    final synchronized void b(int i, int i_181_, int i_182_) {
	u++;
	GameInPacketHandler var_hda = new GameInPacketHandler(i_182_);
	if (i != 8448)
	    T();
	((Node) var_hda).nodeID = (long) i_181_;
	Ge.b(var_hda, (byte) 93);
    }
    
    final Class_q p() {
	ec++;
	return ge;
    }
    
    final synchronized void b(boolean bool, int i) {
	Lc++;
	GameInPacketHandler var_hda = new GameInPacketHandler(i);
	if (bool == false)
	    Ie.b(var_hda, (byte) 93);
    }
    
    private final void v(int i) {
	Kc++;
	int i_183_ = -106 / ((-46 - i) / 36);
	if (Oe != 1) {
	    t(16032);
	    a(false, (byte) -123);
	    a((byte) 101, false);
	    a((int) -68, false);
	    a(false, (int) -79);
	    a((rg) null, -2);
	    b((int) -2, (byte) -101);
	    c(false, 1);
	    Oe = 1;
	}
    }
    
    private final void w(int i) {
	Ib++;
	qg = new rg[((qj) this).Qf];
	((qj) this).Yf = new pm(this, 3553, 6408, i, 1);
	new pm(this, 3553, 6408, 1, 1);
	new pm(this, 3553, 6408, 1, 1);
	((qj) this).Dg = new vaa(this);
	((qj) this).Rf = new vaa(this);
	((qj) this).Of = new vaa(this);
	((qj) this).og = new vaa(this);
	((qj) this).df = new vaa(this);
	((qj) this).uf = new vaa(this);
	((qj) this).Jg = new vaa(this);
	((qj) this).Tg = new vaa(this);
	((qj) this).Gf = new vaa(this);
	((qj) this).Wf = new vaa(this);
	if (((qj) this).wg) {
	    ((qj) this).tf = new qk(this);
	    new qk(this);
	}
    }
    
    final f a(int[] is, int i, int i_184_, int i_185_, int i_186_) {
	kc++;
	return new eca(this, i_185_, i_186_, is, i, i_184_);
    }
    
    private final void f(byte i) {
	de++;
	int i_187_ = 0;
	int i_188_ = 28 % ((i - 83) / 34);
	for (/**/; sf > i_187_; i_187_++) {
	    gga var_gga = Rg[i_187_];
	    hp.H[0] = (float) var_gga.a(true);
	    int i_189_ = i_187_ + 16386;
	    hp.H[1] = (float) var_gga.i(-42);
	    hp.H[2] = (float) var_gga.b((byte) 119);
	    hp.H[3] = 1.0F;
	    OpenGL.glLightfv(i_189_, 4611, hp.H, 0);
	    int i_190_ = var_gga.a((int) 96);
	    float f = var_gga.b((int) 100) / 255.0F;
	    hp.H[1] = (float) uca.a(255, i_190_ >> 8) * f;
	    hp.H[2] = f * (float) uca.a(255, i_190_);
	    hp.H[0] = f * (float) (uca.a(i_190_, 16730675) >> 16);
	    OpenGL.glLightfv(i_189_, 4609, hp.H, 0);
	    OpenGL.glLightf(i_189_, 4617,
			    1.0F / (float) (var_gga.a((byte) -82)
					    * var_gga.a((byte) 104)));
	    OpenGL.glEnable(i_189_);
	}
	for (/**/; Ye > i_187_; i_187_++)
	    OpenGL.glDisable(i_187_ + 16386);
	Ye = sf;
    }
    
    final int c() {
	Fd++;
	return 4;
    }
    
    final void AA(int i, int i_191_, int i_192_, int[] is) {
	xb++;
	float f = (((Class_db) ((qj) this).Ne).L * (float) i_192_
		   + ((float) i * ((Class_db) ((qj) this).Ne).v
		      + ((Class_db) ((qj) this).Ne).j * (float) i_191_)
		   + ((Class_db) ((qj) this).Ne).p);
	if ((float) ((qj) this).Jf > f || f > (float) Ze)
	    is[0] = is[1] = is[2] = -1;
	else {
	    int i_193_
		= (int) ((((Class_db) ((qj) this).Ne).J
			  + ((float) i_191_ * ((Class_db) ((qj) this).Ne).F
			     + ((Class_db) ((qj) this).Ne).A * (float) i
			     + ((Class_db) ((qj) this).Ne).x * (float) i_192_))
			 * (float) ((qj) this).bg / f);
	    int i_194_
		= (int) ((float) ((qj) this).eg
			 * (((Class_db) ((qj) this).Ne).q * (float) i_191_
			    + ((Class_db) ((qj) this).Ne).r * (float) i
			    + ((Class_db) ((qj) this).Ne).n * (float) i_192_
			    + ((Class_db) ((qj) this).Ne).w)
			 / f);
	    if (((qj) this).dh <= (float) i_193_
		&& (float) i_193_ <= ((qj) this).ng
		&& ((qj) this).lg <= (float) i_194_
		&& ((qj) this).Pf >= (float) i_194_) {
		is[1] = (int) ((float) i_194_ - ((qj) this).lg);
		is[0] = (int) ((float) i_193_ - ((qj) this).dh);
		is[2] = (int) f;
	    } else
		is[0] = is[1] = is[2] = -1;
	}
    }
    
    final void oa(int[] is) {
	is[2] = yg;
	is[0] = Ug;
	is[3] = ch;
	vd++;
	is[1] = qf;
    }
    
    final void g(byte i) {
	Xb++;
	if (Oe != 4) {
	    t(16032);
	    a(false, (byte) -128);
	    a((byte) 109, false);
	    a((int) -109, false);
	    a(false, (int) -46);
	    b((int) -2, (byte) -16);
	    b((byte) 107, (int) 1);
	    Oe = 4;
	}
	if (i > -88)
	    d((Canvas) null);
    }
    
    private final void h(byte i) {
	OpenGL.glViewport(gf, Tf, ((qj) this).od, ((qj) this).ib);
	if (i != 16)
	    Sg = -45;
	N++;
    }
    
    final void a(Class_db class_db, int i) {
	Md++;
	OpenGL.glLoadMatrixf(class_db.a(true), i);
    }
    
    private final void x(int i) {
	if (v == null)
	    Tc = C = 0;
	else {
	    Dimension dimension = v.getSize();
	    Tc = dimension.width;
	    C = dimension.height;
	}
	Y++;
	if (pe == null) {
	    ((qj) this).ib = C;
	    ((qj) this).od = Tc;
	    h((byte) 16);
	}
	B(-13);
	JA();
	if (i != 1)
	    ((qj) this).me = 57;
    }
    
    private final void y(int i) {
	ar.S[1] = ((qj) this).Xg * ((qj) this).lf;
	int i_195_ = -87 / ((i - 35) / 41);
	ar.S[2] = ((qj) this).pf * ((qj) this).lf;
	ar.S[0] = ((qj) this).lf * ((qj) this).wf;
	hc++;
	ar.S[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609, ar.S, 0);
	ar.S[3] = 1.0F;
	ar.S[2] = -((qj) this).If * ((qj) this).pf;
	ar.S[0] = ((qj) this).wf * -((qj) this).If;
	ar.S[1] = -((qj) this).If * ((qj) this).Xg;
	OpenGL.glLightfv(16385, 4609, ar.S, 0);
    }
    
    final void a(byte i, nl var_nl) {
	Z++;
	if (var_nl != Df) {
	    if (Cg)
		OpenGL.glBindBufferARB(34962, var_nl.b(13003));
	    Df = var_nl;
	}
	if (i > -112)
	    c((jh) null, (byte) 75);
    }
    
    final void a(byte i, int i_196_, int i_197_) {
	gf = i_197_;
	ad++;
	if (i < 70)
	    Sf = -33;
	Tf = i_196_;
	h((byte) 16);
	a((byte) -71);
    }
    
    private final void z(int i) {
	Uc++;
	if (!of || ((qj) this).bf < 0)
	    OpenGL.glDisable(2912);
	else
	    OpenGL.glEnable(2912);
	if (i != 32411)
	    ((qj) this).kg = 115;
    }
    
    private final void i(byte i) {
	qd++;
	b((int) -2, (byte) -128);
	for (int i_198_ = ((qj) this).Qf - 1; i_198_ >= 0; i_198_--) {
	    b(i_198_, true);
	    a((rg) null, -2);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	}
	a(8448, -465309136, 8448);
	b(2, 770, 768, 34168);
	k(13842);
	Me = 1;
	OpenGL.glEnable(3042);
	OpenGL.glBlendFunc(770, 771);
	Se = 1;
	OpenGL.glEnable(3008);
	OpenGL.glAlphaFunc(516, 0.0F);
	Re = true;
	OpenGL.glColorMask(true, true, true, true);
	Qe = true;
	a(true, (byte) -116);
	a((byte) 108, true);
	a((int) -86, true);
	a(true, (int) 117);
	B(-13);
	((qj) this).ud.setSwapInterval(0);
	OpenGL.glShadeModel(7425);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glDepthFunc(515);
	OpenGL.glPolygonMode(1028, 6914);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i_199_ = 0; i_199_ < 8; i_199_++) {
	    int i_200_ = i_199_ + 16384;
	    OpenGL.glLightfv(i_200_, 4608, fs, 0);
	    OpenGL.glLightf(i_200_, 4615, 0.0F);
	    OpenGL.glLightf(i_200_, 4616, 0.0F);
	}
	int i_201_ = 19 / ((-60 - i) / 62);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	hg = ((qj) this).nf = -1;
	JA();
    }
    
    final void a(byte i, int i_202_, int i_203_, int i_204_) {
	Pd++;
	OpenGL.glDrawArrays(i_203_, i_204_, i_202_);
	int i_205_ = -86 % ((-79 - i) / 36);
    }
    
    final la a(sa var_sa, aga[] var_agas, boolean bool) {
	U++;
	return new ph(this, var_sa, var_agas, bool);
    }
    
    final void c(boolean bool, int i) {
	O++;
	if (bool == false) {
	    if (i != 1) {
		if (i == 0)
		    a(8448, -465309136, 8448);
		else if (i == 2)
		    a(34165, -465309136, 7681);
		else if (i != 3) {
		    if (i == 4)
			a(34023, -465309136, 34023);
		} else
		    a(260, -465309136, 8448);
	    } else
		a(7681, -465309136, 7681);
	}
    }
    
    final void d(Canvas canvas) {
	Ab++;
	if (canvas == Sc)
	    throw new RuntimeException();
	if (!Bb.containsKey(canvas)) {
	    if (!canvas.isShowing())
		throw new RuntimeException();
	    try {
		Class var_class = Class.forName("java.awt.Canvas");
		Method method
		    = var_class.getMethod("setIgnoreRepaint",
					  new Class[] { Boolean.TYPE });
		method.invoke(canvas, new Object[] { Boolean.TRUE });
	    } catch (Exception exception) {
		/* empty */
	    }
	    long l = ((qj) this).ud.prepareSurface(canvas);
	    if (l == -1L)
		throw new RuntimeException();
	    Bb.put(canvas, new Long(l));
	}
    }
    
    final void L() {
	((qj) this).Hf = false;
	Qd++;
    }
    
    final synchronized void a(int i) {
	Ob++;
	i &= 0x7fffffff;
	int i_206_ = 0;
	while (!Ge.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Ge.a(true);
	    dea.g[i_206_++] = (int) ((Node) var_hda).nodeID;
	    ((qj) this).De -= ((GameInPacketHandler) var_hda).k;
	    if (i_206_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_206_, dea.g, 0);
		i_206_ = 0;
	    }
	}
	if (i_206_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_206_, dea.g, 0);
	    i_206_ = 0;
	}
	while (!He.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) He.a(true);
	    dea.g[i_206_++] = (int) ((Node) var_hda).nodeID;
	    ((qj) this).Ee -= ((GameInPacketHandler) var_hda).k;
	    if (i_206_ == 1000) {
		OpenGL.glDeleteTextures(i_206_, dea.g, 0);
		i_206_ = 0;
	    }
	}
	if (i_206_ > 0) {
	    OpenGL.glDeleteTextures(i_206_, dea.g, 0);
	    i_206_ = 0;
	}
	while (!Ie.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Ie.a(true);
	    dea.g[i_206_++] = ((GameInPacketHandler) var_hda).k;
	    if (i_206_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_206_, dea.g, 0);
		i_206_ = 0;
	    }
	}
	if (i_206_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_206_, dea.g, 0);
	    i_206_ = 0;
	}
	while (!Je.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Je.a(true);
	    dea.g[i_206_++] = (int) ((Node) var_hda).nodeID;
	    Ce -= ((GameInPacketHandler) var_hda).k;
	    if (i_206_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_206_, dea.g, 0);
		i_206_ = 0;
	    }
	}
	if (i_206_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_206_, dea.g, 0);
	    boolean bool = false;
	}
	while (!Be.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Be.a(true);
	    OpenGL.glDeleteLists((int) ((Node) var_hda).nodeID,
				 ((GameInPacketHandler) var_hda).k);
	}
	while (!Ke.b(true)) {
	    Node class_d = Ke.a(true);
	    OpenGL.glDeleteProgramARB((int) ((Node) class_d).nodeID);
	}
	while (!Le.b(true)) {
	    Node class_d = Le.a(true);
	    OpenGL.glDeleteObjectARB(((Node) class_d).nodeID);
	}
	while (!Be.b(true)) {
	    GameInPacketHandler var_hda = (GameInPacketHandler) Be.a(true);
	    OpenGL.glDeleteLists((int) ((Node) var_hda).nodeID,
				 ((GameInPacketHandler) var_hda).k);
	}
	Id.a((int) 118);
	if (b() > 100663296 && Te + 60000L < us.getCurrentTime(124)) {
	    System.gc();
	    Te = us.getCurrentTime(90);
	}
	((qj) this).je = i;
    }
    
    final int a(byte i, int i_207_) {
	int i_208_ = 29 % ((i - 13) / 55);
	Ud++;
	if (i_207_ == 5121 || i_207_ == 5120)
	    return 1;
	if (i_207_ == 5123 || i_207_ == 5122)
	    return 2;
	if (i_207_ == 5125 || i_207_ == 5124 || i_207_ == 5126)
	    return 4;
	throw new IllegalArgumentException("");
    }
    
    final void a(int i, boolean bool) {
	int i_209_ = -3 / ((i + 5) / 62);
	Xc++;
	if (!Pe != !bool) {
	    if (bool)
		OpenGL.glEnable(2929);
	    else
		OpenGL.glDisable(2929);
	    Oe &= ~0x1f;
	    Pe = bool;
	}
    }
    
    final void a(ir var_ir) {
	ce++;
	Gd.a(false, var_ir, this, -1);
    }
    
    final synchronized void c(int i, int i_210_, int i_211_) {
	P++;
	GameInPacketHandler var_hda = new GameInPacketHandler(i);
	if (i_210_ != 20024)
	    a(22L, -116);
	((Node) var_hda).nodeID = (long) i_211_;
	He.b(var_hda, (byte) 93);
    }
    
    final void renderProfile(boolean profile) {
	Vc++;
    }
    
    final void a(Rectangle[] rectangles, int i) throws uo {
	ac++;
	u();
    }
    
    final boolean l() {
	jc++;
	return true;
    }
    
    final void w() {
	wb++;
    }
    
    final boolean i() {
	Wb++;
	if (Yd != null) {
	    if (!Yd.j(-16056)) {
		if (Jd.a((int) -105, Yd))
		    Id.b(6408);
		else
		    return false;
	    }
	    return true;
	}
	return false;
    }
    
    private final void j(byte i) {
	sb++;
	OpenGL.glDepthMask(Ue && Yg);
	int i_212_ = -85 / ((i + 32) / 56);
    }
    
    final gga a(int i, int i_213_, int i_214_, int i_215_, int i_216_,
		float f) {
	yc++;
	return new Class_ef(i, i_213_, i_214_, i_215_, i_216_, f);
    }
    
    final void u() throws uo {
	I++;
	try {
	    ((qj) this).ud.swapBuffers();
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    final void a(byte i, boolean bool) {
	pd++;
	if (i <= 99)
	    ((qj) this).ef = true;
	if (!bool == xg) {
	    xg = bool;
	    c((byte) 70);
	    Oe &= ~0x7;
	}
    }
    
    final int[] v() {
	gd++;
	return new int[] { ((qj) this).kg, ((qj) this).ag, ((qj) this).bg,
			   ((qj) this).eg };
    }
    
    final int DA() {
	Rb++;
	int i = gh;
	gh = 0;
	return i;
    }
    
    final void c(Canvas canvas) {
	td++;
	if (canvas == Sc)
	    throw new RuntimeException();
	if (Bb.containsKey(canvas)) {
	    Long var_long = (Long) Bb.get(canvas);
	    ((qj) this).ud.releaseSurface(canvas, var_long.longValue());
	    Bb.remove(canvas);
	}
    }
    
    private final void c(boolean bool) {
	q++;
	if (bool != true)
	    Sf = 67;
	Af = (float) (Ze - ((qj) this).cf) - Xe;
	((qj) this).ff = Af - (float) ((qj) this).bf * rf;
	if ((float) ((qj) this).Jf > ((qj) this).ff)
	    ((qj) this).ff = (float) ((qj) this).Jf;
	OpenGL.glFogf(2915, ((qj) this).ff);
	OpenGL.glFogf(2916, Af);
	ar.S[2] = (float) uca.a(255, ((qj) this).nf) / 255.0F;
	ar.S[1] = (float) uca.a(((qj) this).nf, 65280) / 65280.0F;
	ar.S[0] = (float) uca.a(((qj) this).nf, 16711680) / 1.671168E7F;
	OpenGL.glFogfv(2918, ar.S, 0);
    }
    
    final void FA(int i, ua var_ua, int i_217_, int i_218_) {
	dc++;
	hj var_hj = (hj) var_ua;
	ar var_ar = ((hj) var_hj).f;
	m((byte) 3);
	a(((hj) var_hj).f, -2);
	b((byte) 55, (int) 1);
	a(7681, -465309136, 8448);
	b(0, 768, 768, 34167);
	float f = ((ar) var_ar).O / (float) ((ar) var_ar).T;
	float f_219_ = ((ar) var_ar).M / (float) ((ar) var_ar).N;
	OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i,
			  (byte) (i >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(f * (float) (Ug - i_217_),
			    f_219_ * (float) (qf - i_218_));
	OpenGL.glVertex2i(Ug, qf);
	OpenGL.glTexCoord2f(f * (float) (Ug - i_217_),
			    (float) (ch - i_218_) * f_219_);
	OpenGL.glVertex2i(Ug, ch);
	OpenGL.glTexCoord2f((float) (yg - i_217_) * f,
			    f_219_ * (float) (ch - i_218_));
	OpenGL.glVertex2i(yg, ch);
	OpenGL.glTexCoord2f((float) (yg - i_217_) * f,
			    f_219_ * (float) (qf - i_218_));
	OpenGL.glVertex2i(yg, qf);
	OpenGL.glEnd();
	b(0, 768, 768, 5890);
    }
    
    final void b(Class_db class_db, int i) {
	int i_220_ = -55 % ((-65 - i) / 56);
	OpenGL.glPushMatrix();
	Zd++;
	OpenGL.glMultMatrixf(class_db.a(true), 0);
    }
    
    final void j() {
	Jd.c((byte) -38);
	cd++;
    }
    
    final da a(eg var_eg, int i, int i_221_, int i_222_, int i_223_) {
	nb++;
	return new vaa(this, var_eg, i, i_222_, i_223_, i_221_);
    }
    
    final void XA(int i, int i_224_, int i_225_, int i_226_, int i_227_) {
	Nd++;
	v(44);
	b((byte) 48, i_227_);
	float f = (float) i + 0.35F;
	float f_228_ = (float) i_224_ + 0.35F;
	OpenGL.glColor4ub((byte) (i_226_ >> 16), (byte) (i_226_ >> 8),
			  (byte) i_226_, (byte) (i_226_ >> 24));
	OpenGL.glBegin(1);
	OpenGL.glVertex2f(f, f_228_);
	OpenGL.glVertex2f((float) i_225_ + f, f_228_);
	OpenGL.glEnd();
    }
    
    final boolean B() {
	kd++;
	return true;
    }
    
    private final int A(int i) {
	Ld++;
	int i_229_ = 0;
	Pg = OpenGL.glGetString(7936).toLowerCase();
	Uf = OpenGL.glGetString(7937).toLowerCase();
	if ((Pg.indexOf("microsoft") ^ 0xffffffff) != 0)
	    i_229_ |= 0x1;
	if (Pg.indexOf("brian paul") != -1
	    || (Pg.indexOf("mesa") ^ 0xffffffff) != 0)
	    i_229_ |= 0x1;
	String string = OpenGL.glGetString(7938);
	String[] strings = vq.a(i - 10608, string.replace('.', ' '), ' ');
	if (strings.length < 2)
	    i_229_ |= 0x4;
	else {
	    try {
		int i_230_ = Class_g.a(i - 10377, strings[0]);
		int i_231_ = Class_g.a(128, strings[1]);
		Cf = i_230_ * 10 + i_231_;
	    } catch (NumberFormatException numberformatexception) {
		i_229_ |= 0x4;
	    }
	}
	if (Cf < 12)
	    i_229_ |= 0x2;
	if (!((qj) this).ud.a("GL_ARB_multitexture"))
	    i_229_ |= 0x8;
	if (!((qj) this).ud.a("GL_ARB_texture_env_combine"))
	    i_229_ |= 0x20;
	int[] is = new int[1];
	OpenGL.glGetIntegerv(34018, is, 0);
	((qj) this).Qf = is[0];
	OpenGL.glGetIntegerv(34929, is, 0);
	if (i != 10505)
	    a((int) 119, false);
	kf = is[0];
	OpenGL.glGetIntegerv(34930, is, 0);
	Ig = is[0];
	if (((qj) this).Qf < 2 || kf < 2 || Ig < 2)
	    i_229_ |= 0x10;
	((qj) this).ig = Stream.a();
	dg = ((qj) this).ud.arePbuffersAvailable();
	Cg = ((qj) this).ud.a("GL_ARB_vertex_buffer_object");
	Mg = ((qj) this).ud.a("GL_ARB_multisample");
	((qj) this).ef = ((qj) this).ud.a("GL_ARB_vertex_program");
	((qj) this).ud.a("GL_ARB_fragment_program");
	((qj) this).vg = ((qj) this).ud.a("GL_ARB_vertex_shader");
	((qj) this).zf = ((qj) this).ud.a("GL_ARB_fragment_shader");
	((qj) this).Bg = ((qj) this).ud.a("GL_EXT_texture3D");
	((qj) this).vf = ((qj) this).ud.a("GL_ARB_texture_rectangle");
	((qj) this).Lf = ((qj) this).ud.a("GL_ARB_texture_cube_map");
	((qj) this).zg = ((qj) this).ud.a("GL_ARB_texture_float");
	((qj) this).pg = false;
	((qj) this).wg = ((qj) this).ud.a("GL_EXT_framebuffer_object");
	((qj) this).xf = ((qj) this).ud.a("GL_EXT_framebuffer_blit");
	((qj) this).Kg = ((qj) this).ud.a("GL_EXT_framebuffer_multisample");
	Vf = ((qj) this).xf & ((qj) this).Kg;
	OpenGL.glGetFloatv(2834, ar.S, 0);
	Hg = ar.S[1];
	ug = ar.S[0];
	if (i_229_ != 0)
	    return i_229_;
	return 0;
    }
    
    private final void k(byte i) {
	if (Ef != 2) {
	    Ef = 2;
	    l(692534472);
	    l((byte) 29);
	    Oe &= ~0x7;
	}
	zd++;
	if (i != -45)
	    f((int) 122);
    }
    
    final void a(int i, int i_232_, int i_233_, boolean bool) {
	OpenGL.glTexEnvi(8960, i_233_ + 34184, i);
	if (bool == true) {
	    o++;
	    OpenGL.glTexEnvi(8960, 34200 + i_233_, i_232_);
	}
    }
    
    final void B(int i) {
	if (Ef != 0) {
	    Ef = 0;
	    Oe &= ~0x1f;
	}
	if (i != -13)
	    ((qj) this).af = 0.29725137F;
	db++;
    }
    
    final void a(int i, int i_234_, int i_235_, int i_236_, int i_237_,
		 int i_238_, int i_239_) {
	G++;
	OpenGL.glLineWidth((float) i_238_);
	a(i, i_234_, i_235_, i_236_, i_237_, i_239_);
	OpenGL.glLineWidth(1.0F);
    }
    
    final jt d(int i, int i_240_, int i_241_, int i_242_, int i_243_,
	       int i_244_) {
	jb++;
	if (!((qj) this).Lf)
	    return null;
	return new rh(this, i, i_240_, i_241_, i_242_, i_243_, i_244_);
    }
    
    final void ja(int i) {
	Jc++;
	b((byte) 72, (int) 0);
	OpenGL.glClearColor((float) (0xff0000 & i) / 1.671168E7F,
			    (float) (i & 0xff00) / 65280.0F,
			    (float) (i & 0xff) / 255.0F,
			    (float) (i >>> 24) / 255.0F);
	OpenGL.glClear(16384);
    }
    
    final void b(byte i, int i_245_) {
	if (i <= 23)
	    a(-87, -4, -39, 16, -89, -45, null, 61, 106);
	if (i_245_ != Me) {
	    int i_246_;
	    boolean bool;
	    boolean bool_247_;
	    if (i_245_ != 1) {
		if (i_245_ == 2) {
		    i_246_ = 2;
		    bool_247_ = true;
		    bool = false;
		} else if (i_245_ != 128) {
		    i_246_ = 0;
		    bool = false;
		    bool_247_ = true;
		} else {
		    bool_247_ = true;
		    i_246_ = 3;
		    bool = true;
		}
	    } else {
		i_246_ = 1;
		bool = true;
		bool_247_ = true;
	    }
	    if (bool_247_ == !Qe) {
		OpenGL.glColorMask(bool_247_, bool_247_, bool_247_, true);
		Qe = bool_247_;
	    }
	    if (Re != bool) {
		if (!bool)
		    OpenGL.glDisable(3008);
		else
		    OpenGL.glEnable(3008);
		Re = bool;
	    }
	    if (i_246_ != Se) {
		if (i_246_ != 1) {
		    if (i_246_ == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		    } else if (i_246_ != 3)
			OpenGL.glDisable(3042);
		    else {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		    }
		} else {
		    OpenGL.glEnable(3042);
		    OpenGL.glBlendFunc(770, 771);
		}
		Se = i_246_;
	    }
	    Me = i_245_;
	    Oe &= ~0x1c;
	}
	R++;
    }
    
    final ua a(int i, int i_248_, int[] is, int[] is_249_) {
	Hb++;
	return Class_fb.a(i, i_248_, this, (byte) 96, is_249_, is);
    }
    
    final f a(int i, int i_250_, boolean bool) {
	ld++;
	return new eca(this, i, i_250_, bool);
    }
    
    final boolean bloom() {
	bd++;
	if (Yd == null || !Yd.j(-16056))
	    return false;
	return true;
    }
    
    final void a(int i, dw var_dw) {
	if (var_dw != Og) {
	    if (Cg)
		OpenGL.glBindBufferARB(34963, var_dw.b(-22904));
	    Og = var_dw;
	}
	int i_251_ = -48 % ((16 - i) / 52);
	vc++;
    }
    
    final void g(int i) {
	sd++;
	if (i != 1)
	    throw new IllegalArgumentException("");
    }
    
    private final void l(byte i) {
	OpenGL.glLoadIdentity();
	kb++;
	if (i != 29)
	    Ze = -66;
	OpenGL.glMultMatrixf(((qj) this).Ve.a(true), 0);
	if (Mf)
	    ((kfa) Td).m.d((byte) 82);
	o(13211);
	f((byte) -16);
    }
    
    final synchronized void a(int i, int i_252_, byte i_253_) {
	Bc++;
	GameInPacketHandler var_hda = new GameInPacketHandler(i);
	((Node) var_hda).nodeID = (long) i_252_;
	if (i_253_ < 77)
	    a((jh) null, (byte) -123);
	Je.b(var_hda, (byte) 93);
    }
    
    final void c(jh var_jh, byte i) {
	W++;
	if (ye < 0 || var_jh != xe[ye])
	    throw new RuntimeException();
	xe[ye--] = null;
	var_jh.d(16401);
	if (ye >= 0) {
	    ze = xe[ye];
	    ze.a((byte) 89);
	} else
	    ze = null;
	int i_254_ = 51 % ((i + 10) / 43);
    }
    
    final void va(int i) {
	Gc++;
	((qj) this).le = 0;
	while (i > 1) {
	    i >>= 1;
	    ((qj) this).le++;
	}
	((qj) this).me = 1 << ((qj) this).le;
    }
    
    final void m(byte i) {
	Fb++;
	if (i != 3)
	    n();
	if (Oe != 2) {
	    t(i + 16029);
	    a(false, (byte) -116);
	    a((byte) 109, false);
	    a((int) 85, false);
	    a(false, i - 25);
	    b((int) -2, (byte) -52);
	    Oe = 2;
	}
    }
    
    final boolean O(int i, int i_255_, int i_256_, int i_257_, int i_258_,
		    int i_259_) {
	Od++;
	float f = (((Class_db) ((qj) this).Ne).p
		   + ((float) i_256_ * ((Class_db) ((qj) this).Ne).L
		      + ((float) i_255_ * ((Class_db) ((qj) this).Ne).j
			 + ((Class_db) ((qj) this).Ne).v * (float) i)));
	if (f < 1.0F)
	    f = 1.0F;
	float f_260_
	    = (((Class_db) ((qj) this).Ne).p
	       + ((float) i_259_ * ((Class_db) ((qj) this).Ne).L
		  + (((Class_db) ((qj) this).Ne).v * (float) i_257_
		     + ((Class_db) ((qj) this).Ne).j * (float) i_258_)));
	if (f_260_ < 1.0F)
	    f_260_ = 1.0F;
	if (f < (float) ((qj) this).Jf && f_260_ < (float) ((qj) this).Jf
	    || (float) Ze < f && (float) Ze < f_260_)
	    return false;
	int i_261_
	    = (int) ((float) ((qj) this).bg
		     * (((Class_db) ((qj) this).Ne).J
			+ (((Class_db) ((qj) this).Ne).F * (float) i_255_
			   + (float) i * ((Class_db) ((qj) this).Ne).A
			   + (float) i_256_ * ((Class_db) ((qj) this).Ne).x))
		     / f);
	int i_262_
	    = (int) ((float) ((qj) this).bg
		     * (((Class_db) ((qj) this).Ne).J
			+ ((float) i_257_ * ((Class_db) ((qj) this).Ne).A
			   + ((Class_db) ((qj) this).Ne).F * (float) i_258_
			   + (float) i_259_ * ((Class_db) ((qj) this).Ne).x))
		     / f_260_);
	if ((float) i_261_ < ((qj) this).dh && (float) i_262_ < ((qj) this).dh
	    || ((float) i_261_ > ((qj) this).ng
		&& ((qj) this).ng < (float) i_262_))
	    return false;
	int i_263_ = (int) ((float) ((qj) this).eg
			    * (((Class_db) ((qj) this).Ne).r * (float) i
			       + (float) i_255_ * ((Class_db) ((qj) this).Ne).q
			       + (float) i_256_ * ((Class_db) ((qj) this).Ne).n
			       + ((Class_db) ((qj) this).Ne).w)
			    / f);
	int i_264_
	    = (int) ((float) ((qj) this).eg
		     * (((Class_db) ((qj) this).Ne).w
			+ (((Class_db) ((qj) this).Ne).r * (float) i_257_
			   + (float) i_258_ * ((Class_db) ((qj) this).Ne).q
			   + (float) i_259_ * ((Class_db) ((qj) this).Ne).n))
		     / f_260_);
	if (((qj) this).lg > (float) i_263_ && ((qj) this).lg > (float) i_264_
	    || (((qj) this).Pf < (float) i_263_
		&& ((qj) this).Pf < (float) i_264_))
	    return false;
	return true;
    }
    
    final void GA(int i, int i_265_) {
	if (((qj) this).Jf != i || Ze != i_265_) {
	    ((qj) this).Jf = i;
	    Ze = i_265_;
	    n((byte) 35);
	    c(true);
	    if (Ef == 3)
		m(5888);
	    else if (Ef == 2)
		l(692534472);
	}
	pc++;
    }
    
    final void b(byte i, boolean bool) {
	Xd++;
	int i_266_ = 126 % ((-90 - i) / 35);
	if (bool == !tg) {
	    tg = bool;
	    c((byte) 125);
	}
    }
    
    final nl a(byte[] is, int i, boolean bool, int i_267_, int i_268_) {
	L++;
	int i_269_ = 19 / ((-29 - i_268_) / 49);
	if (Cg && (!bool || mg))
	    return new bu(this, i_267_, is, i, bool);
	return new in(this, i_267_, is, i);
    }
    
    private final void n(byte i) {
	rd++;
	float[] fs = Lg;
	if (i <= 13)
	    a((int) -37);
	float f = ((float) (((qj) this).Jf * -((qj) this).kg)
		   / (float) ((qj) this).bg);
	float f_270_
	    = ((float) (((qj) this).Jf * (((qj) this).od - ((qj) this).kg))
	       / (float) ((qj) this).bg);
	float f_271_ = ((float) (((qj) this).ag * ((qj) this).Jf)
			/ (float) ((qj) this).eg);
	float f_272_
	    = ((float) (((qj) this).Jf * (((qj) this).ag - ((qj) this).ib))
	       / (float) ((qj) this).eg);
	if (f != f_270_ && f_272_ != f_271_) {
	    float f_273_ = 2.0F * (float) ((qj) this).Jf;
	    fs[15] = 0.0F;
	    fs[13] = 0.0F;
	    fs[4] = 0.0F;
	    fs[6] = 0.0F;
	    fs[5] = f_273_ / (f_271_ - f_272_);
	    fs[8] = (f + f_270_) / (f_270_ - f);
	    fs[7] = 0.0F;
	    fs[0] = f_273_ / (f_270_ - f);
	    fs[12] = 0.0F;
	    fs[10] = Ff
		= (float) -(((qj) this).Jf + Ze) / (float) (Ze
							    - ((qj) this).Jf);
	    fs[1] = 0.0F;
	    fs[3] = 0.0F;
	    fs[2] = 0.0F;
	    fs[9] = (f_272_ + f_271_) / (f_271_ - f_272_);
	    fs[11] = -1.0F;
	    fs[14] = Bf
		= -(f_273_ * (float) Ze) / (float) (Ze - ((qj) this).Jf);
	} else {
	    fs[9] = 0.0F;
	    fs[3] = 0.0F;
	    fs[13] = 0.0F;
	    fs[6] = 0.0F;
	    fs[2] = 0.0F;
	    fs[12] = 0.0F;
	    fs[5] = 1.0F;
	    fs[10] = 1.0F;
	    fs[0] = 1.0F;
	    fs[8] = 0.0F;
	    fs[14] = 0.0F;
	    fs[7] = 0.0F;
	    fs[1] = 0.0F;
	    fs[4] = 0.0F;
	    fs[11] = 0.0F;
	    fs[15] = 1.0F;
	}
	q(-16543);
    }
    
    final void b(int i, jh var_jh) {
	Wc++;
	if (!((qj) this).xf) {
	    if (se >= 3)
		throw new RuntimeException();
	    if (se >= 0)
		we[se].b(i ^ ~0x269c);
	    ze = pe = we[++se] = var_jh;
	    ze.a(-5908);
	} else {
	    a(var_jh, (byte) -20);
	    b(var_jh, (byte) 101);
	}
	if (i != 255)
	    a((byte) -7, -0.0013043648F);
    }
    
    final boolean f() {
	Kb++;
	return true;
    }
    
    final void b(int i, boolean bool) {
	if (bool != true)
	    a(-12, (gga[]) null);
	Cd++;
	if (Sf != i) {
	    OpenGL.glActiveTexture(i + 33984);
	    Sf = i;
	}
    }
}
