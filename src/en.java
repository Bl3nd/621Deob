/* en - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import jagex3.graphics2.hw.NativeInterface;

abstract class en extends Class_r
{
    static int o;
    static int p;
    Object q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    Canvas A;
    static int B;
    static int C;
    static int D;
    static int E;
    NativeHeap F;
    static int G;
    static int H;
    static int I;
    static int J;
    static int K;
    static int L;
    static int M;
    private Object N;
    static int O;
    static int P;
    static int Q;
    int R;
    static f[] S;
    static int T;
    static int U;
    static int V;
    static int W;
    static int X;
    static int Y;
    static int Z;
    private Canvas ab;
    static int bb;
    static int cb;
    static int db;
    static int eb;
    static int fb;
    static int gb;
    static int hb;
    static int ib;
    static int jb;
    static int kb;
    long peer;
    static int lb;
    private Class_ae mb = new Class_ae();
    static int nb;
    static int ob;
    static int pb;
    private Hashtable qb;
    static int rb;
    int sb;
    static int tb;
    static int ub;
    static int vb;
    static int wb;
    static int xb;
    static int yb;
    static int zb;
    static int Ab;
    static int Bb;
    static int Cb;
    static int Db;
    static int Eb;
    static int Fb;
    static int Gb;
    static int Hb;
    static int Ib;
    static int Jb;
    static int Kb;
    static int Lb;
    static int Mb;
    static int Nb;
    static int Ob;
    static int Pb;
    static int Qb;
    NativeInterface Rb;
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
    private int pc;
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
    bd Lc;
    static int Mc;
    static int Nc;
    static int Oc;
    static int Pc;
    static int Qc;
    static int Rc;
    static int Sc = 1407;
    static int Tc;
    static int Uc;
    static int Vc;
    static int Wc;
    static int Xc;
    static int Yc;
    static int Zc;
    static int ad;
    static int bd;
    static int cd;
    static int dd;
    static int ed;
    static int fd;
    private int gd;
    static int hd;
    static int id;
    static int jd;
    static int kd;
    static int ld;
    static int md;
    pl nd;
    static int od;
    static int pd;
    static int qd;
    static int rd;
    static int sd;
    static int td;
    static int ud;
    static int vd;
    static int wd;
    static int xd;
    static int yd;
    static int zd;
    static int Ad;
    static int Bd;
    static int Cd;
    static int Dd;
    static int Ed;
    static int Fd;
    static int Gd;
    static int Hd;
    static int Id;
    NativeHeapBuffer Jd;
    static int Kd;
    static int Ld;
    static int Md;
    int Nd;
    boolean Od = true;
    static int Pd;
    int Qd;
    mga Rd = new mga();
    int Sd;
    mga Td = new mga();
    mga Ud = new mga();
    mga Vd = new mga();
    private mga Wd = new mga();
    private mga Xd = new mga();
    private float[] Yd;
    int Zd;
    int ae;
    private Class_j be;
    float ce;
    private sda de;
    private int ee;
    hfa fe;
    boolean ge;
    private int he;
    private tfa ie;
    private boolean je;
    float ke;
    float le;
    boolean me;
    private int ne = 0;
    nw[] oe;
    boolean pe;
    boolean qe;
    private int re;
    private cl[] se;
    int te;
    private hfa[] ue;
    int ve;
    int we;
    nw[] xe;
    private float[] ye;
    int ze;
    int Ae;
    private int Be;
    private float[] Ce;
    float De;
    float Ee;
    boolean Fe;
    private boolean Ge;
    boolean He;
    float Ie;
    private int Je;
    private cl Ke;
    private float Le;
    int Me;
    float Ne;
    boolean Oe;
    int Pe;
    private boolean Qe;
    private boolean Re;
    int Se;
    int Te;
    private int Ue;
    lea Ve;
    boolean We;
    float Xe;
    float Ye;
    private float[] Ze;
    boolean af;
    float bf;
    float cf;
    int df;
    int ef;
    int ff;
    float[] gf;
    int hf;
    int jf;
    int kf;
    int lf;
    float mf;
    boolean nf;
    int of;
    int pf;
    int qf;
    private int rf;
    private float sf;
    int tf;
    int uf;
    private float[] vf;
    boolean wf;
    mga[] xf;
    private float[] yf;
    float[] zf;
    int Af;
    private Stream Bf;
    float Cf;
    private int Df;
    boolean Ef;
    int Ff;
    int Gf;
    private int Hf;
    int If;
    boolean Jf;
    private float Kf;
    private int Lf;
    sfa Mf;
    float Nf;
    float[] Of;
    int Pf;
    private boolean Qf;
    int Rf;
    ki[] Sf;
    gga[] Tf;
    boolean Uf;
    private boolean Vf;
    mq Wf;
    ja Xf;
    mq Yf;
    ja Zf;
    ja ag;
    private nba bg;
    private mga cg;
    ja dg;
    private nba eg;
    ja fg;
    ja gg;
    private hh hg;
    mq ig;
    ja jg;
    mq kg;
    ja lg;
    private mq mg;
    ja ng;
    ja og;
    private mq pg;
    boolean qg;
    private int rg;
    
    final f a(int[] is, int i, int i_0_, int i_1_, int i_2_) {
	bc++;
	return new fo(this, i_1_, i_2_, is, i, i_0_);
    }
    
    public static void i(int i) {
	S = null;
	if (i != 0)
	    i((int) 93);
    }
    
    abstract void j(int i);
    
    abstract ls a(float[] fs, int i, int i_3_, int i_4_, boolean bool,
		  int i_5_, int i_6_, Class_ec class_ec);
    
    final boolean d() {
	K++;
	return ((en) this).Fe;
    }
    
    static final void b(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_, int i_12_) {
	wc++;
	int i_13_ = 8 / ((-78 - i_11_) / 41);
	if (i_10_ - i_7_ >= vaa.xb && jga.v >= i_10_ + i_7_
	    && Class_md.h <= i_8_ - i_7_ && i_8_ + i_7_ <= Class_db.o)
	    ss.a(i, true, i_10_, i_9_, i_8_, i_12_, i_7_);
	else
	    bj.a(-24142, i_8_, i_10_, i_7_, i_9_, i, i_12_);
    }
    
    final void b(int i) {
	Yb++;
	if (i < 128 || i > 1024)
	    throw new IllegalArgumentException();
	if (de != null)
	    de.c(0);
	((en) this).ve = i;
    }
    
    abstract void a(boolean bool, int i, Class_gb var_gb, boolean bool_14_);
    
    abstract void k(int i);
    
    abstract void l(int i);
    
    final void VA(int i, float f, float f_15_, float f_16_, float f_17_,
		  float f_18_) {
	w++;
	boolean bool = i != he;
	if (bool || ((en) this).Xe != f || f_15_ != ((en) this).mf) {
	    ((en) this).mf = f_15_;
	    he = i;
	    ((en) this).Xe = f;
	    if (bool) {
		((en) this).ke = (float) (he & 0xff0000) / 1.671168E7F;
		((en) this).Ie = (float) (0xff & he) / 255.0F;
		((en) this).cf = (float) (0xff00 & he) / 65280.0F;
		s((int) 0);
	    }
	    ((en) this).Rb.setSunColour(((en) this).ke, ((en) this).cf,
					((en) this).Ie, f, f_15_);
	    D(-25688);
	}
	if (vf[0] != f_16_ || vf[1] != f_17_ || f_18_ != vf[2]) {
	    vf[0] = f_16_;
	    vf[1] = f_17_;
	    vf[2] = f_18_;
	    ye[0] = -f_16_;
	    ye[1] = -f_17_;
	    ye[2] = -f_18_;
	    float f_19_
		= (float) (1.0
			   / Math.sqrt((double) (f_16_ * f_16_ + f_17_ * f_17_
						 + f_18_ * f_18_)));
	    ((en) this).Of[1] = f_17_ * f_19_;
	    ((en) this).Of[0] = f_19_ * f_16_;
	    ((en) this).Of[2] = f_18_ * f_19_;
	    ((en) this).gf[0] = -((en) this).Of[0];
	    ((en) this).gf[1] = -((en) this).Of[1];
	    ((en) this).gf[2] = -((en) this).Of[2];
	    ((en) this).Rb.setSunDirection(((en) this).Of[0],
					   ((en) this).Of[1],
					   ((en) this).Of[2]);
	    i(false);
	    ((en) this).jf = (int) (f_16_ * 256.0F / f_17_);
	    ((en) this).Pe = (int) (256.0F * f_18_ / f_17_);
	}
	v((int) 5);
    }
    
    abstract void a(boolean bool, mq var_mq);
    
    final boolean m() {
	M++;
	return false;
    }
    
    final void a(int i, ki var_ki) {
	rb++;
	((en) this).Sf[((en) this).Te] = var_ki;
	t((int) 114);
	if (i < 100)
	    ((en) this).Gf = 9;
    }
    
    abstract oq a(boolean bool, boolean bool_20_, int i, int[][] is);
    
    final void a(byte i, byte i_21_) {
	Bb++;
	c((byte) 48, i_21_ | (i_21_ << 8 | (i_21_ << 24 | i_21_ << 16)));
	if (i <= 75)
	    ((en) this).If = -58;
    }
    
    final void a(IncomingPackets incomingPackets) {
	E++;
	((en) this).F = ((Class_ob) (Class_ob) incomingPackets).v;
	((en) this).Jd = ((en) this).F.a(32768, false);
    }
    
    final void a(int i, int i_22_, boolean bool, boolean bool_23_) {
	Nb++;
	if (i != 0)
	    c(true, (int) 71);
	if (i_22_ != Je || !Ge == ((en) this).We) {
	    ls var_ls = null;
	    int i_24_ = 0;
	    byte i_25_ = 0;
	    int i_26_ = 0;
	    byte i_27_ = !((en) this).We ? (byte) 0 : (byte) 3;
	    if (i_22_ >= 0) {
		var_ls = de.a(i_22_, -23049);
		vca var_vca = ((Class_r) this).j.a(i_22_, (byte) 86);
		if (((vca) var_vca).n == 0 && ((vca) var_vca).c == 0)
		    j((byte) -70);
		else {
		    int i_28_ = !((vca) var_vca).p ? 128 : 64;
		    int i_29_ = 50 * i_28_;
		    mga var_mga = E(100);
		    var_mga.a(((float) (((vca) var_vca).c
					* (((en) this).Me % i_29_))
			       / (float) i_29_),
			      (byte) 36, 0.0F,
			      ((float) (((vca) var_vca).n
					* (((en) this).Me % i_29_))
			       / (float) i_29_));
		    a(106, at.I);
		}
		i_24_ = ((vca) var_vca).a;
		if (!((en) this).We) {
		    i_25_ = ((vca) var_vca).w;
		    i_27_ = ((vca) var_vca).i;
		    i_26_ = ((vca) var_vca).o;
		}
	    } else
		j((byte) -70);
	    a(i_26_, i_25_, bool_23_, (byte) 127, bool, i_27_);
	    if (Ke != null)
		Ke.a(i_24_, 114, var_ls);
	    else {
		a(var_ls, 0);
		f(i_24_, 0);
	    }
	    Je = i_22_;
	    Ge = ((en) this).We;
	}
	rf &= ~0x7;
    }
    
    final void a(byte i) {
	if (((en) this).Mf != ih.g) {
	    sfa var_sfa = ((en) this).Mf;
	    ((en) this).Mf = ih.g;
	    if (var_sfa.b(3))
		l(false);
	    rf &= ~0x1f;
	    ((en) this).zf = yf;
	}
	if (i == 84)
	    tb++;
    }
    
    final void FA(int i, ua var_ua, int i_30_, int i_31_) {
	x++;
	ao var_ao = (ao) var_ua;
	ls var_ls = ((ao) var_ao).g;
	d((byte) 16);
	a(var_ls, 0);
	a((byte) 28, (int) 1);
	a(ku.k, true, ku.k);
	a(0, 1, ik.o);
	c((byte) 48, i);
	((en) this).Rd.b((float) ((en) this).R, 18543, (float) ((en) this).sb,
			 0.0F);
	T(-52);
	((en) this).xf[0].b(var_ls.a(false, (float) ((en) this).R), 18543,
			    var_ls.a((float) ((en) this).sb, (byte) -59),
			    1.0F);
	((en) this).xf[0].a(var_ls.a(false, (float) -i_30_), 0.0F,
			    var_ls.a((float) -i_31_, (byte) -59), (byte) -125);
	((en) this).Sf[0] = at.I;
	t((int) 114);
	y(9);
	j((byte) -70);
	a(0, 1, mca.l);
    }
    
    private final void m(int i) {
	mc++;
	if (rf != i) {
	    m(false);
	    d(false, (int) -117);
	    a(false, (int) 49);
	    a((byte) 121, false);
	    c(false, (byte) -25);
	    a(i - 1, -2, false, false);
	    f(1, i ^ 0x1);
	    a(((en) this).fe, 0);
	    rf = 1;
	}
    }
    
    abstract void a(int i, lt var_lt, int i_32_, int i_33_, int i_34_,
		    int i_35_, hh var_hh);
    
    final void XA(int i, int i_36_, int i_37_, int i_38_, int i_39_) {
	W++;
	a(i, i_36_, i + i_37_, i_36_, i_38_, i_39_);
    }
    
    final void a(boolean bool, byte i) {
	if (!((en) this).qe == bool) {
	    ((en) this).qe = bool;
	    A(i + 142);
	}
	if (i != -99)
	    ((en) this).le = 1.1504375F;
	z++;
    }
    
    final void J(int i, int i_40_, int i_41_, int i_42_, int i_43_,
		 int i_44_) {
	m((int) 1);
	Lb++;
	c((byte) 48, i_43_);
	a(0, 1, ik.o);
	a(0, ik.o, -18836);
	a((byte) 28, i_44_);
	((en) this).Rd.b((float) i_41_, 18543, (float) i_42_, 1.0F);
	((en) this).Rd.U(i, i_40_, 0);
	T(117);
	d(false, (byte) -110);
	y(9);
	d(true, (byte) -128);
	a(0, mca.l, -18836);
	a(0, 1, mca.l);
    }
    
    final void a(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_,
		 int i_50_, int i_51_, int i_52_, int i_53_) {
	md++;
    }
    
    final int[] v() {
	ob++;
	return new int[] { ((en) this).Ff, ((en) this).ze, ((en) this).Zd,
			   ((en) this).ef };
    }
    
    private final void n(int i) {
	gb++;
	je = false;
	if (ds.i == ((en) this).Mf) {
	    g((byte) 107);
	    t((byte) -18);
	}
	if (i != 0)
	    ((en) this).xf = null;
    }
    
    abstract void b(byte i);
    
    final int c(boolean bool) {
	Rc++;
	if (bool != true)
	    return 67;
	return Be;
    }
    
    abstract void o(int i);
    
    abstract void c(byte i);
    
    final ls a(int i, float[] fs, Class_ec class_ec, boolean bool, int i_54_,
	       int i_55_) {
	nc++;
	if (i_55_ != 0)
	    return null;
	return a(fs, i_54_, 0, 10, bool, i, 0, class_ec);
    }
    
    final la a(sa var_sa, aga[] var_agas, boolean bool) {
	gc++;
	return new bb(this, var_sa, var_agas, bool);
    }
    
    private final void a(int i, lt var_lt, int i_56_) {
	uc++;
	a((byte) -16, eg, i_56_);
	a(true, mg);
	a(var_lt, 0, i, 28463);
    }
    
    final Class_i a(int i, int i_57_, int[][] is, int[][] is_58_, int i_59_,
		    int i_60_, int i_61_) {
	lc++;
	return new daa(this, i_60_, i_61_, i, i_57_, is, is_58_, i_59_);
    }
    
    private final void p(int i) {
	rc++;
	Qe = false;
	z(i);
	if (((en) this).Mf == fr.t)
	    t((byte) -18);
    }
    
    final void a(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_,
		 int i_67_) {
	cb++;
    }
    
    final void CA(int i, int i_68_, int i_69_, int i_70_) {
	Hf = i_70_;
	ee = i_69_;
	Ic++;
	Df = i_68_;
	((en) this).We = true;
	Be = i;
    }
    
    final void a(boolean bool, int i) {
	if (i < 44)
	    h((byte) 88);
	if (!((en) this).me == bool) {
	    ((en) this).me = bool;
	    W(-67);
	    rf &= ~0x7;
	}
	zc++;
    }
    
    final void la(int i, int i_71_, int i_72_, int i_73_) {
	((en) this).ef = i_73_;
	wb++;
	((en) this).ze = i_71_;
	((en) this).Ff = i;
	((en) this).Zd = i_72_;
	p((int) 0);
	e((byte) -120);
	a((byte) 84);
	e(true);
    }
    
    private final void q(int i) {
	Jc++;
	eg = a(false, false);
	eg.a(i - 89, 28, 140);
	for (int i_74_ = i; i_74_ < 4; i_74_++) {
	    Buffer buffer = eg.a(true, 32726);
	    if (buffer != null) {
		Stream stream = a(buffer, i ^ 0x6b);
		if (!Stream.a()) {
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		} else {
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		}
		stream.c();
		if (eg.a(i + 21))
		    break;
	    }
	}
	mg = a(new eda[] { new eda(new jv[] { jv.e, jv.n, jv.n }) }, true);
    }
    
    final boolean l() {
	Sb++;
	return true;
    }
    
    abstract fl a(int i, byte[] is, int i_75_, int i_76_, Class_ec class_ec,
		  int i_77_);
    
    abstract hh b(boolean bool, int i);
    
    private final void r(int i) {
	D++;
	int i_78_ = -118 % ((i + 49) / 36);
	if (Ke != null)
	    Ke.b(26185);
	B(-105);
    }
    
    final int a(int i, int i_79_) {
	ac++;
	return i | i_79_;
    }
    
    final void a(int i, int i_80_, int i_81_, int i_82_, int i_83_,
		 int i_84_) {
	Zb++;
	float f = (float) i_81_ - (float) i;
	float f_85_ = (float) -i_80_ + (float) i_82_;
	if (f != 0.0F || f_85_ != 0.0F) {
	    float f_86_
		= (float) (1.0 / Math.sqrt((double) (f * f + f_85_ * f_85_)));
	    f *= f_86_;
	    f_85_ *= f_86_;
	} else
	    f = 1.0F;
	if (a(0.0F, (float) i, (float) i_80_, -31334, 0.0F, f + (float) i_81_,
	      f_85_ + (float) i_82_)) {
	    m((int) 1);
	    c((byte) 48, i_83_);
	    a(0, 1, ik.o);
	    a(0, ik.o, -18836);
	    a((byte) 28, i_84_);
	    i((byte) 28);
	    d(false, (byte) -89);
	    G(32619);
	    d(true, (byte) -118);
	    a(0, mca.l, -18836);
	    a(0, 1, mca.l);
	}
    }
    
    abstract void s(int i);
    
    final IncomingPackets c(int i) {
	Gc++;
	Class_ob class_ob = new Class_ob(i);
	mb.b(class_ob, (byte) 93);
	return class_ob;
    }
    
    private final void t(int i) {
	if (i == 114) {
	    vb++;
	    n((byte) -109);
	    if (Ke != null)
		Ke.c((byte) -47);
	}
    }
    
    abstract void u(int i);
    
    abstract void v(int i);
    
    final void e(int i, int i_87_, int i_88_, int i_89_, int i_90_) {
	zd++;
    }
    
    final void w(int i) {
	dd++;
	if (i == 0) {
	    a((byte) 84);
	    t((byte) -18);
	}
    }
    
    final void a(jt var_jt) {
	od++;
	be = (Class_j) var_jt;
    }
    
    final void d(byte i) {
	if (rf != 2) {
	    m(false);
	    d(false, (int) -102);
	    a(false, (int) 122);
	    a((byte) 125, false);
	    c(false, (byte) -25);
	    a(0, -2, false, false);
	    rf = 2;
	}
	kd++;
	if (i <= 6)
	    ((en) this).Zd = 43;
    }
    
    final int c() {
	Wc++;
	return ((en) this).df - 2;
    }
    
    final gga a(int i, int i_91_, int i_92_, int i_93_, int i_94_, float f) {
	P++;
	return new vo(i, i_91_, i_92_, i_93_, i_94_, f);
    }
    
    final void JA() {
	((en) this).Pf = ((en) this).R;
	((en) this).Rf = 0;
	yc++;
	((en) this).kf = 0;
	((en) this).of = ((en) this).sb;
	if (((en) this).qg) {
	    ((en) this).qg = false;
	    F(111);
	}
	e(true);
    }
    
    private final void e(byte i) {
	Qf = false;
	zb++;
	w((byte) -122);
	if (i <= -35) {
	    if (qn.b == ((en) this).Mf)
		t((byte) -18);
	}
    }
    
    abstract void x(int i);
    
    abstract ls a(int[] is, int i, boolean bool, int i_95_, int i_96_,
		  int i_97_, int i_98_);
    
    final void a(int i, int i_99_, int i_100_, int i_101_, int i_102_,
		 int i_103_, ua var_ua, int i_104_, int i_105_) {
	vc++;
    }
    
    final NativeHeapBuffer a(int i, byte i_106_, boolean bool) {
	if (i_106_ < 54)
	    T(38);
	jd++;
	return ((en) this).F.a(i, bool);
    }
    
    final ua a(int i, int i_107_, int[] is, int[] is_108_) {
	eb++;
	return lba.a(i_107_, is_108_, this, is, i, (byte) 37);
    }
    
    final int d(boolean bool) {
	if (bool != true)
	    a((Canvas) null);
	Ub++;
	return Df;
    }
    
    private final void f(byte i) {
	jc++;
	if (i != -124)
	    ((en) this).Zf = null;
	Ce[14] = sf;
	Ce[10] = Kf;
	((en) this).De = ((float) -((en) this).Ae + Ce[14]) / Ce[10];
    }
    
    private final void e(boolean bool) {
	s++;
	((en) this).Ne = (float) (((en) this).Rf - ((en) this).ze);
	((en) this).Ee = (float) (((en) this).Pf - ((en) this).Ff);
	((en) this).Ye = (float) (((en) this).kf - ((en) this).Ff);
	((en) this).le = (float) (((en) this).of - ((en) this).ze);
	if (bool != true)
	    a((hfa) null, -95);
    }
    
    final mga f(boolean bool) {
	if (bool != true)
	    b(true);
	B++;
	return ((en) this).xf[((en) this).Te];
    }
    
    final Class_q C() {
	Gd++;
	return new mga();
    }
    
    final void MA(int i, int i_109_, int i_110_, int[] is) {
	Fb++;
	float f = ((en) this).Td.a((float) i_109_, (int) 105, (float) i_110_,
				   (float) i);
	int i_111_;
	int i_112_;
	if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
	    i_112_ = ((en) this).ze;
	    i_111_ = ((en) this).Ff;
	} else {
	    i_111_ = (int) ((float) ((en) this).Zd
			    * ((en) this).Td.a((int) 114, (float) i_109_,
					       (float) i, (float) i_110_)
			    / f);
	    i_112_ = (int) ((float) ((en) this).ef
			    * ((en) this).Td.a((float) i, (float) i_109_,
					       (float) i_110_, (int) 116)
			    / f);
	}
	is[0] = (int) ((float) i_111_ - ((en) this).Ye);
	is[2] = (int) f;
	is[1] = (int) ((float) i_112_ - ((en) this).Ne);
    }
    
    private final void g(byte i) {
	if (i != 107)
	    ((en) this).Oe = false;
	if (!je) {
	    float[] fs = Yd;
	    je = true;
	    if (((en) this).R == 0 || ((en) this).sb == 0) {
		fs[9] = 0.0F;
		fs[11] = 0.0F;
		fs[0] = 1.0F;
		fs[12] = 0.0F;
		fs[4] = 0.0F;
		fs[3] = 0.0F;
		fs[1] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[10] = 1.0F;
		fs[15] = 1.0F;
		fs[2] = 0.0F;
		fs[8] = 0.0F;
		fs[7] = 0.0F;
		fs[5] = 1.0F;
		fs[6] = 0.0F;
	    } else {
		fs[7] = 0.0F;
		fs[12] = -1.0F;
		fs[3] = 0.0F;
		fs[14] = 0.5F;
		fs[6] = 0.0F;
		fs[13] = 1.0F;
		fs[1] = 0.0F;
		fs[15] = 1.0F;
		fs[11] = 0.0F;
		fs[2] = 0.0F;
		fs[8] = 0.0F;
		fs[5] = -2.0F / (float) ((en) this).sb;
		fs[0] = 2.0F / (float) ((en) this).R;
		fs[9] = 0.0F;
		fs[10] = 0.5F;
		fs[4] = 0.0F;
	    }
	}
	bd++;
    }
    
    abstract boolean a(int i, bt var_bt, Class_ec class_ec);
    
    final hh c(int i, int i_113_) {
	if (hg.a((byte) 77) < 2 * i_113_)
	    hg.a(27209, i_113_);
	int i_114_ = -63 / ((i + 58) / 36);
	Pc++;
	return hg;
    }
    
    final da a(eg var_eg, int i, int i_115_, int i_116_, int i_117_) {
	cd++;
	return new ja(this, var_eg, i, i_116_, i_117_, i_115_);
    }
    
    final f a(aga var_aga, boolean bool) {
	ec++;
	f var_f;
	if (((aga) var_aga).b == 0 || ((aga) var_aga).d == 0)
	    var_f = a(new int[1], 0, 1, 1, 1);
	else {
	    int[] is = new int[((aga) var_aga).b * ((aga) var_aga).d];
	    int i = 0;
	    int i_118_ = 0;
	    if (((aga) var_aga).f == null) {
		for (int i_119_ = 0; i_119_ < ((aga) var_aga).d; i_119_++) {
		    for (int i_120_ = 0; i_120_ < ((aga) var_aga).b;
			 i_120_++) {
			int i_121_
			    = ((aga) var_aga).i[((aga) var_aga).c[i++] & 0xff];
			is[i_118_++]
			    = i_121_ != 0 ? hba.bitwiseArg1ORArg2(i_121_, -16777216) : 0;
		    }
		}
	    } else {
		for (int i_122_ = 0; i_122_ < ((aga) var_aga).d; i_122_++) {
		    for (int i_123_ = 0; i_123_ < ((aga) var_aga).b;
			 i_123_++) {
			is[i_118_++]
			    = hba.bitwiseArg1ORArg2((((aga) var_aga).i
				     [uca.a(((aga) var_aga).c[i], 255)]),
				    ((aga) var_aga).f[i] << 24);
			i++;
		    }
		}
	    }
	    var_f = a(is, 0, ((aga) var_aga).b, ((aga) var_aga).b,
		      ((aga) var_aga).d);
	}
	var_f.Q(((aga) var_aga).e, ((aga) var_aga).g, ((aga) var_aga).a,
		((aga) var_aga).h);
	return var_f;
    }
    
    final void ZA(boolean bool) {
	qd++;
	((en) this).wf = bool;
	k((int) 1);
    }
    
    final boolean n() {
	ad++;
	return true;
    }
    
    final int T() {
	Db++;
	return rg;
    }
    
    final void y(int i) {
	if (i != 9)
	    ((en) this).Gf = -2;
	a(2, mm.x, 0);
	id++;
    }
    
    final void a(nw var_nw, boolean bool, nw var_nw_124_) {
	O++;
	if (bool != true)
	    ((en) this).Uf = false;
	boolean bool_125_ = false;
	if (((en) this).oe[((en) this).Te] != var_nw) {
	    ((en) this).oe[((en) this).Te] = var_nw;
	    bool_125_ = true;
	    x(-2);
	}
	if (((en) this).xe[((en) this).Te] != var_nw_124_) {
	    ((en) this).xe[((en) this).Te] = var_nw_124_;
	    j((int) 2);
	    bool_125_ = true;
	}
	if (bool_125_)
	    rf &= ~0x1d;
    }
    
    final void YA(int i, int i_126_, int i_127_, int i_128_) {
	Fc++;
	if (!((en) this).We)
	    throw new RuntimeException("");
	Be = i;
	Df = i_126_;
	Hf = i_128_;
	ee = i_127_;
	if (Ge) {
	    se[3].e(-16573);
	    se[3].b(26185);
	}
    }
    
    abstract void h(byte i);
    
    final void c(Canvas canvas) {
	Tb++;
	if (canvas == ((en) this).A)
	    throw new RuntimeException();
	if (qb.containsKey(canvas)) {
	    a((byte) 121, canvas, qb.get(canvas));
	    qb.remove(canvas);
	}
    }
    
    final void i(byte i) {
	((en) this).Rd.Y();
	Tc++;
	if (i > 1) {
	    ((en) this).Od = true;
	    V(14);
	}
    }
    
    private final void z(int i) {
	wd++;
	if (!Qe) {
	    float[] fs = Ze;
	    float f = (float) ((en) this).Af;
	    float f_129_ = (float) ((en) this).Ae;
	    float f_130_
		= Le * (float) -((en) this).ze / (float) ((en) this).ef;
	    float f_131_
		= Le * (float) -((en) this).Ff / (float) ((en) this).Zd;
	    float f_132_ = (Le * (float) (((en) this).R - ((en) this).Ff)
			    / (float) ((en) this).Zd);
	    float f_133_ = ((float) (((en) this).sb - ((en) this).ze) * Le
			    / (float) ((en) this).ef);
	    if (f_132_ == f_131_ || f_133_ == f_130_) {
		fs[12] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = 0.0F;
		fs[5] = 1.0F;
		fs[0] = 1.0F;
		fs[2] = 0.0F;
		fs[15] = 1.0F;
		fs[10] = 1.0F;
		fs[3] = 0.0F;
		fs[14] = 0.0F;
		fs[13] = 0.0F;
		fs[4] = 0.0F;
		fs[9] = 0.0F;
		fs[1] = 0.0F;
		fs[6] = 0.0F;
		fs[11] = 0.0F;
	    } else {
		fs[7] = 0.0F;
		fs[3] = 0.0F;
		fs[10] = 1.0F / (f - f_129_);
		fs[5] = 2.0F / (f_133_ - f_130_);
		fs[11] = 0.0F;
		fs[8] = 0.0F;
		fs[9] = 0.0F;
		fs[4] = 0.0F;
		fs[2] = 0.0F;
		fs[1] = 0.0F;
		fs[6] = 0.0F;
		fs[15] = 1.0F;
		fs[0] = 2.0F / (f_132_ - f_131_);
		fs[14] = f / (f - f_129_);
		fs[12] = (f_131_ + f_132_) / (f_131_ - f_132_);
		fs[13] = (f_130_ + f_133_) / (f_133_ - f_130_);
	    }
	    p((byte) 124);
	    Qe = true;
	}
	if (i != 0)
	    m(48, 122, 49, -116, 27);
    }
    
    final void a(byte i, int i_134_) {
	if (i_134_ != re) {
	    boolean bool;
	    lea var_lea;
	    boolean bool_135_;
	    if (i_134_ != 1) {
		if (i_134_ != 2) {
		    if (i_134_ != 128) {
			var_lea = ffa.K;
			bool = false;
			bool_135_ = false;
		    } else {
			var_lea = Class_ag.h;
			bool = true;
			bool_135_ = true;
		    }
		} else {
		    bool = true;
		    var_lea = Class_ug.H;
		    bool_135_ = false;
		}
	    } else {
		bool = true;
		var_lea = IncomingPackets.lea;
		bool_135_ = true;
	    }
	    if (!bool_135_ != !((en) this).Ef) {
		((en) this).Ef = bool_135_;
		X(-101);
	    }
	    if (!((en) this).Uf == bool) {
		((en) this).Uf = bool;
		g(false);
	    }
	    if (var_lea != ((en) this).Ve) {
		((en) this).Ve = var_lea;
		k(true);
	    }
	    re = i_134_;
	    rf &= ~0x1c;
	}
	if (i == 28)
	    hb++;
    }
    
    final boolean e() {
	Vc++;
	return se[3].a(-16777216);
    }
    
    abstract void A(int i);
    
    abstract void B(int i);
    
    final void j(byte i) {
	if (i != -70)
	    ((en) this).Ud = null;
	if (((en) this).Sf[((en) this).Te] != Class_jg.H) {
	    ((en) this).Sf[((en) this).Te] = Class_jg.H;
	    ((en) this).xf[((en) this).Te].Y();
	    t((int) 114);
	}
	I++;
    }
    
    private final boolean a(float f, float f_136_, float f_137_, int i,
			    float f_138_, float f_139_, float f_140_) {
	Kb++;
	if (i != -31334)
	    bg = null;
	Buffer buffer = bg.a(true, i ^ ~0x5b3);
	if (buffer == null)
	    return false;
	Stream stream = a(buffer, i ^ ~0x7a13);
	if (Stream.a()) {
	    stream.a(f_136_);
	    stream.a(f_137_);
	    stream.a(f);
	    stream.a(f_139_);
	    stream.a(f_140_);
	    stream.a(f_138_);
	} else {
	    stream.b(f_136_);
	    stream.b(f_137_);
	    stream.b(f);
	    stream.b(f_139_);
	    stream.b(f_140_);
	    stream.b(f_138_);
	}
	stream.c();
	return bg.a(13);
    }
    
    final float[] C(int i) {
	Xb++;
	if (i != 0)
	    ((en) this).Ye = -0.34390706F;
	return yf;
    }
    
    private final void k(byte i) {
	ld++;
	if (i != 125)
	    T(-90);
	bg = a(false, true);
	bg.a(-117, 12, 24);
	pg = a(new eda[] { new eda(jv.e) }, true);
    }
    
    abstract void a(byte i, Canvas canvas, Object object);
    
    final void pa(int i, int i_141_, int i_142_) {
	if (((en) this).lf != i || ((en) this).Gf != i_141_
	    || ((en) this).qf != i_142_) {
	    ((en) this).lf = i;
	    ((en) this).Gf = i_141_;
	    ((en) this).qf = i_142_;
	    r((int) -121);
	    A(117);
	}
	jb++;
    }
    
    final float[] a(int i, float[] fs) {
	fs[4] = ((en) this).zf[1];
	if (i < 62)
	    return null;
	Pb++;
	fs[0] = ((en) this).zf[0];
	fs[12] = ((en) this).zf[3];
	fs[8] = ((en) this).zf[2];
	fs[2] = ((en) this).zf[8];
	fs[13] = ((en) this).zf[7];
	fs[1] = ((en) this).zf[4];
	fs[9] = ((en) this).zf[6];
	fs[5] = ((en) this).zf[5];
	fs[6] = ((en) this).zf[9];
	fs[3] = ((en) this).zf[12];
	fs[7] = ((en) this).zf[13];
	fs[10] = ((en) this).zf[10];
	fs[14] = ((en) this).zf[11];
	fs[11] = ((en) this).zf[14];
	fs[15] = ((en) this).zf[15];
	return fs;
    }
    
    abstract boolean a(Class_ec class_ec, bt var_bt, int i);
    
    final void a(int[] is) {
	is[1] = ((en) this).sb;
	is[0] = ((en) this).R;
	Ab++;
    }
    
    final mga l(byte i) {
	Q++;
	if (i != 88)
	    return null;
	return ((en) this).Vd;
    }
    
    final void m(byte i) {
	Cd++;
	if (i > 126) {
	    Hashtable hashtable = new Hashtable();
	    if (qb != null && !qb.isEmpty()) {
		Enumeration enumeration = qb.keys();
		while (enumeration.hasMoreElements()) {
		    Canvas canvas = (Canvas) enumeration.nextElement();
		    hashtable.put(canvas, a(canvas, 19449));
		}
	    }
	    qb = hashtable;
	    q((int) 0);
	    k((byte) 125);
	    ie.b((byte) 77, this);
	}
    }
    
    final int b() {
	Kc++;
	return ((en) this).Nd + ((en) this).Qd + ((en) this).Sd;
    }
    
    abstract void n(byte i);
    
    abstract ls a(byte[] is, Class_ec class_ec, int i, int i_143_,
		  boolean bool, boolean bool_144_, int i_145_, int i_146_);
    
    final void a(ir var_ir) {
	yd++;
	ie.a(-1, 0, this, var_ir);
    }
    
    abstract void a(int i, Object object, Canvas canvas);
    
    final void a(int i, Class_gb var_gb, int i_147_) {
	oc++;
	if (i_147_ == -18836)
	    a(false, i, var_gb, false);
    }
    
    abstract void D(int i);
    
    final mga E(int i) {
	if (i <= 82)
	    mg = null;
	Qb++;
	return ((en) this).xf[((en) this).Te];
    }
    
    final boolean O(int i, int i_148_, int i_149_, int i_150_, int i_151_,
		    int i_152_) {
	Hd++;
	float f = ((en) this).Td.a((float) i_148_, (int) 93, (float) i_149_,
				   (float) i);
	if (f < 1.0F)
	    f = 1.0F;
	float f_153_ = ((en) this).Td.a((float) i_151_, (int) -111,
					(float) i_152_, (float) i_150_);
	if (f_153_ < 1.0F)
	    f_153_ = 1.0F;
	if ((float) ((en) this).Af > f && f_153_ < (float) ((en) this).Af
	    || f > (float) ((en) this).Ae && (float) ((en) this).Ae < f_153_)
	    return false;
	int i_154_ = (int) ((float) ((en) this).Zd
			    * ((en) this).Td.a((int) 92, (float) i_148_,
					       (float) i, (float) i_149_)
			    / f);
	int i_155_ = (int) ((float) ((en) this).Zd
			    * ((en) this).Td.a((int) 56, (float) i_151_,
					       (float) i_150_, (float) i_152_)
			    / f_153_);
	if ((float) i_154_ < ((en) this).Ye && (float) i_155_ < ((en) this).Ye
	    || ((float) i_154_ > ((en) this).Ee
		&& ((en) this).Ee < (float) i_155_))
	    return false;
	int i_156_ = (int) ((float) ((en) this).ef
			    * ((en) this).Td.a((float) i, (float) i_148_,
					       (float) i_149_, (int) 100)
			    / f);
	int i_157_ = (int) ((float) ((en) this).ef
			    * ((en) this).Td.a((float) i_150_, (float) i_151_,
					       (float) i_152_, (int) 111)
			    / f_153_);
	if ((float) i_156_ < ((en) this).Ne && ((en) this).Ne > (float) i_157_
	    || (((en) this).le < (float) i_156_
		&& (float) i_157_ > ((en) this).le))
	    return false;
	return true;
    }
    
    final Class_q t() {
	Cb++;
	return ((en) this).Td;
    }
    
    abstract void F(int i);
    
    final void va(int i) {
	ud++;
	((en) this).ae = 0;
	for (/**/; i > 1; i >>= 1)
	    ((en) this).ae++;
	((en) this).tf = 1 << ((en) this).ae;
    }
    
    private final void G(int i) {
	a((byte) -16, bg, 0);
	G++;
	if (i == 32619) {
	    a(true, pg);
	    a(oea.cb, 0, 1, 28463);
	}
    }
    
    private final void o(byte i) {
	s((int) 0);
	Yc++;
	D(-25688);
	W(-30);
	M(1);
	i(false);
	if (i > 0)
	    ((en) this).Ie = -2.828104F;
	v((int) 5);
	u((int) 1);
	I(0);
	k((int) 1);
	A(82);
	B(-104);
	g(false);
	k(true);
	X(-107);
	for (int i_158_ = ((en) this).ff - 1; i_158_ >= 0; i_158_--) {
	    e(0, i_158_);
	    x(-2);
	    j((int) 2);
	    j((byte) -70);
	}
	l((int) 0);
	h((byte) 116);
	P(-86);
	b((byte) 86);
	v((byte) -128);
    }
    
    abstract void g(boolean bool);
    
    final void da(int i, int i_159_, int i_160_, int i_161_) {
	kc++;
	if (i <= 0 && i_160_ >= ((en) this).R - 1 && i_159_ <= 0
	    && ((en) this).sb - 1 <= i_161_)
	    JA();
	else {
	    ((en) this).kf = i >= 0 ? i : 0;
	    ((en) this).Rf = i_159_ >= 0 ? i_159_ : 0;
	    ((en) this).of = i_161_ > ((en) this).R ? 0 : i_161_;
	    ((en) this).Pf = ((en) this).R < i_160_ ? 0 : i_160_;
	    if (!((en) this).qg) {
		((en) this).qg = true;
		F(110);
	    }
	    o((int) -1);
	    e(true);
	}
    }
    
    private final void p(byte i) {
	if (i == 124) {
	    ((en) this).Cf = (float) ((en) this).Ae;
	    vd++;
	}
    }
    
    final int BA() {
	Md++;
	return ((en) this).Af;
    }
    
    final void a(int i, gga[] var_ggas) {
	rd++;
	for (int i_162_ = 0; i_162_ < i; i_162_++)
	    ((en) this).Tf[i_162_] = var_ggas[i_162_];
	((en) this).uf = i;
	if (((en) this).Mf.b(3))
	    M(1);
    }
    
    final void IA(int i, int i_163_, int i_164_, int i_165_, int i_166_,
		  int i_167_, byte[] is, int i_168_, int i_169_) {
	cc++;
    }
    
    final void H(int i) {
	if (i != -20791)
	    ne = 32;
	Dc++;
	Enumeration enumeration = qb.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    a((byte) 121, canvas, qb.get(canvas));
	}
	eg.b(-21271);
	bg.b(-21271);
	((en) this).dg.a((byte) 34);
	((en) this).og.a((byte) 34);
	((en) this).lg.a((byte) 34);
	((en) this).Xf.a((byte) 34);
	((en) this).ng.a((byte) 34);
	ie.b(true);
	hg.b(i ^ 0x220);
    }
    
    void A() {
	xc++;
	if (!Re) {
	    for (Node class_d = mb.a((int) 90); class_d != null;
		 class_d = mb.b((byte) 62))
		((Class_ob) class_d).a(-15184);
	    Enumeration enumeration = qb.keys();
	    while (enumeration.hasMoreElements()) {
		Canvas canvas = (Canvas) enumeration.nextElement();
		a((byte) 121, canvas, qb.get(canvas));
	    }
	    lea.a(false, false, true);
	    ((en) this).Rb.release();
	    Re = true;
	}
    }
    
    final void V(int i, int i_170_, int i_171_, int i_172_) {
	pd++;
	boolean bool = false;
	if (i > ((en) this).kf) {
	    bool = true;
	    ((en) this).kf = i;
	}
	if (((en) this).Pf > i_171_) {
	    ((en) this).Pf = i_171_;
	    bool = true;
	}
	if (((en) this).Rf < i_170_) {
	    bool = true;
	    ((en) this).Rf = i_170_;
	}
	if (((en) this).of > i_172_) {
	    bool = true;
	    ((en) this).of = i_172_;
	}
	if (bool) {
	    if (!((en) this).qg) {
		((en) this).qg = true;
		F(80);
	    }
	    o((int) 125);
	    e(true);
	}
    }
    
    abstract void I(int i);
    
    final int b(int i, int i_173_) {
	Id++;
	return i & i_173_ ^ i_173_;
    }
    
    final boolean B() {
	yb++;
	return true;
    }
    
    final void c(boolean bool, int i) {
	if (i == -27379) {
	    hc++;
	    if (!bool != !((en) this).nf) {
		((en) this).nf = bool;
		W(-122);
	    }
	}
    }
    
    final boolean g() {
	Xc++;
	return true;
    }
    
    private final void a(int i, int i_174_, boolean bool, byte i_175_,
			 boolean bool_176_, int i_177_) {
	Wb++;
	bool &= e();
	if (!bool && (i_177_ == 4 || i_177_ == 8 || i_177_ == 9)) {
	    i_177_ = 2;
	    i = i_177_ != 4 ? 1 : 0x1 & i_174_;
	    i_174_ = 0;
	}
	if (i_177_ != 0 && bool_176_)
	    i_177_ |= ~0x7fffffff;
	if (Ue == i_177_) {
	    if (Ue != 0) {
		se[0x7fffffff & Ue].a(true, bool_176_);
		if (i_174_ != ne || Lf != i) {
		    se[0x7fffffff & Ue].a(i_174_, i, (byte) 65);
		    Lf = i;
		    ne = i_174_;
		}
	    }
	} else {
	    if (Ue != 0)
		se[0x7fffffff & Ue].d(-19092);
	    if (i_177_ == 0)
		Ke = null;
	    else {
		Ke = se[i_177_ & 0x7fffffff];
		Ke.a(92, bool_176_);
		Ke.a(true, bool_176_);
		Ke.a(i_174_, i, (byte) 65);
	    }
	    ne = i_174_;
	    Ue = i_177_;
	    Lf = i;
	}
	int i_178_ = 68 % ((i_175_ - 76) / 33);
    }
    
    final void J(int i) {
	if (i != rf) {
	    O(119);
	    d(true, (int) -106);
	    a((byte) 119, true);
	    c(true, (byte) -25);
	    a((byte) 28, (int) 1);
	    rf = 8;
	}
	Nc++;
    }
    
    final void oa(int[] is) {
	is[3] = ((en) this).of;
	ed++;
	is[2] = ((en) this).Pf;
	is[0] = ((en) this).kf;
	is[1] = ((en) this).Rf;
    }
    
    final int U() {
	pb++;
	return ((en) this).Ae;
    }
    
    final void m(int i, int i_179_, int i_180_, int i_181_, int i_182_) {
	Eb++;
	a(i, i_179_, i, i_179_ + i_180_, i_181_, i_182_);
    }
    
    final void AA(int i, int i_183_, int i_184_, int[] is) {
	p++;
	float f = ((en) this).Td.a((float) i_183_, (int) -93, (float) i_184_,
				   (float) i);
	int i_185_;
	int i_186_;
	if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
	    i_186_ = ((en) this).ze;
	    i_185_ = ((en) this).Ff;
	} else {
	    i_185_ = (int) ((float) ((en) this).Zd
			    * ((en) this).Td.a((int) 63, (float) i_183_,
					       (float) i, (float) i_184_)
			    / f);
	    i_186_ = (int) ((float) ((en) this).ef
			    * ((en) this).Td.a((float) i, (float) i_183_,
					       (float) i_184_, (int) 62)
			    / f);
	}
	is[0] = (int) ((float) i_185_ - ((en) this).Ye);
	is[2] = (int) f;
	is[1] = (int) ((float) i_186_ - ((en) this).Ne);
    }
    
    final void L() {
	((en) this).We = false;
	Ad++;
    }
    
    abstract void K(int i);
    
    final int L(int i) {
	H++;
	if (i > -14)
	    je = true;
	return ((en) this).Te;
    }
    
    void M(int i) {
	((en) this).we = ((en) this).uf;
	if (i != 1)
	    j(true);
	bb++;
	((en) this).uf = 0;
    }
    
    final void a(byte i, boolean bool) {
	if (i < 118)
	    ((en) this).kf = 92;
	td++;
	if (bool == !((en) this).He) {
	    ((en) this).He = bool;
	    I(0);
	    rf &= ~0x1f;
	}
    }
    
    final void N(int i) {
	if (i != 128)
	    ((en) this).gf = null;
	Ac++;
	if (rf != 16) {
	    q((byte) -41);
	    d(true, (int) -107);
	    a((byte) 125, true);
	    c(true, (byte) -25);
	    a((byte) 28, (int) 1);
	    rf = 16;
	}
    }
    
    final void ra(float f) {
	Fd++;
	if (((en) this).Nf != f) {
	    ((en) this).Nf = f;
	    ((en) this).Rb.setAmbient(f);
	    s((int) 0);
	    v((int) 5);
	}
    }
    
    final Stream a(Buffer buffer, int i) {
	if (i <= 94)
	    return null;
	Bf.a(buffer);
	Qc++;
	return Bf;
    }
    
    final boolean r() {
	dc++;
	return false;
    }
    
    final void b(boolean bool, byte i) {
	Bc++;
	int i_187_ = -31 / ((-72 - i) / 53);
	if (!bool != !((en) this).Oe) {
	    ((en) this).Oe = bool;
	    u((int) 1);
	}
    }
    
    private final void O(int i) {
	if (((en) this).Mf != qn.b) {
	    sfa var_sfa = ((en) this).Mf;
	    ((en) this).Mf = qn.b;
	    if (!var_sfa.b(3))
		l(false);
	    w((byte) -118);
	    ((en) this).zf = Ce;
	    t((byte) -18);
	    rf &= ~0x7;
	}
	fb++;
	if (i < 15)
	    AA(120, 18, 42, null);
    }
    
    final f a(int i, int i_188_, int i_189_, int i_190_, boolean bool) {
	r++;
	fo var_fo = new fo(this, i_189_, i_190_, bool);
	var_fo.da(0, 0, i_189_, i_190_, i, i_188_);
	return var_fo;
    }
    
    final jt d(int i, int i_191_, int i_192_, int i_193_, int i_194_,
	       int i_195_) {
	Z++;
	return new rv(this, i, i_191_, i_192_, i_193_, i_194_, i_195_);
    }
    
    abstract nba a(boolean bool, boolean bool_196_);
    
    final ls a(int i, boolean bool, int i_197_, int[] is, byte i_198_) {
	xd++;
	if (i_198_ < 64)
	    a(-26, -47, null, null);
	return a(is, 3, bool, 0, 0, i, i_197_);
    }
    
    final void f(int i) {
	ub++;
    }
    
    private final void q(byte i) {
	Gb++;
	if (i >= -36)
	    ((en) this).ng = null;
	if (fr.t != ((en) this).Mf) {
	    sfa var_sfa = ((en) this).Mf;
	    ((en) this).Mf = fr.t;
	    if (!var_sfa.b(3))
		l(false);
	    z(0);
	    ((en) this).zf = Ze;
	    t((byte) -18);
	    rf &= ~0x7;
	}
    }
    
    abstract void P(int i);
    
    final void d(Canvas canvas) {
	Ld++;
	if (canvas == ((en) this).A)
	    throw new RuntimeException();
	if (!qb.containsKey(canvas)) {
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
	    Object object = a(canvas, 19449);
	    if (object == null)
		throw new RuntimeException();
	    qb.put(canvas, object);
	}
    }
    
    private final void h(boolean bool) {
	if (ab == null)
	    pc = gd = 1;
	else {
	    Dimension dimension = ab.getSize();
	    gd = dimension.height;
	    pc = dimension.width;
	}
	Vb++;
	((en) this).sb = gd;
	((en) this).R = pc;
	n((int) 0);
	e((byte) -103);
	p((int) 0);
	if (bool != true)
	    ((en) this).nf = false;
	h((byte) 116);
	e(bool);
	a((byte) 84);
	JA();
    }
    
    final mga Q(int i) {
	Mc++;
	if (i != 3)
	    c(false);
	if (!Vf) {
	    Xd.a(((en) this).Vd, ((en) this).Rd);
	    Vf = true;
	}
	return Xd;
    }
    
    final void b(boolean bool) {
	T++;
    }
    
    abstract void i(boolean bool);
    
    final void a(float f, byte i) {
	if (Le != f) {
	    Le = f;
	    p((int) 0);
	}
	y++;
	if (i >= -47)
	    Hf = 116;
    }
    
    final oq R(int i) {
	Cc++;
	if (i != 2)
	    return null;
	if (be != null)
	    return be.a(false);
	return null;
    }
    
    abstract ls a(int i, Class_ec class_ec, int i_199_, int i_200_, bt var_bt);
    
    final Class_q p() {
	Hc++;
	return cg;
    }
    
    final void d(int i) {
	tc++;
    }
    
    final int S(int i) {
	U++;
	if (i != -30561)
	    H(-110);
	return Hf;
    }
    
    final void j(boolean bool) {
	if (rf != 4) {
	    m(!bool);
	    d(false, (int) -105);
	    a(false, (int) 127);
	    a((byte) 124, false);
	    c(false, (byte) -25);
	    a(0, -2, false, false);
	    a((byte) 28, (int) 1);
	    f(0, 0);
	    rf = 4;
	}
	qc++;
	if (bool != true)
	    A();
    }
    
    abstract void a(lt var_lt, int i, int i_201_, int i_202_);
    
    void a(int i) {
	ib++;
	if (de != null)
	    de.a(98);
	((en) this).Me = i & 0x7fffffff;
    }
    
    final void a(int i, mga var_mga) {
	((en) this).Rd.M(var_mga);
	if (i != -16926)
	    h(false);
	X++;
	((en) this).Od = false;
	V(14);
    }
    
    final void b(Canvas canvas) {
	Mb++;
	Object object = null;
	if (canvas != null && ((en) this).A != canvas) {
	    if (qb.containsKey(canvas))
		object = qb.get(canvas);
	} else
	    object = N;
	if (object == null)
	    throw new RuntimeException();
	a(7, object, canvas);
	if (canvas == ab)
	    h(true);
    }
    
    abstract float r(byte i);
    
    final void s(byte i) {
	ue = new hfa[((en) this).ff];
	((en) this).oe = new nw[((en) this).ff];
	((en) this).xf = new mga[((en) this).ff];
	db++;
	((en) this).Sf = new ki[((en) this).ff];
	if (i >= -41)
	    ((en) this).te = 111;
	((en) this).xe = new nw[((en) this).ff];
	for (int i_203_ = 0; i_203_ < ((en) this).ff; i_203_++) {
	    ((en) this).xe[i_203_] = Class_rf.e;
	    ((en) this).oe[i_203_] = Class_rf.e;
	    ((en) this).Sf[i_203_] = Class_jg.H;
	    ((en) this).xf[i_203_] = new mga();
	}
	((en) this).Tf = new gga[((en) this).df - 2];
	((en) this).fe = a(1, nda.h, 1, 1, bt.g);
	a(new Class_ob(262144));
	((en) this).Yf
	    = a(new eda[] { new eda(new jv[] { jv.e, jv.n }) }, true);
	((en) this).kg
	    = a(new eda[] { new eda(new jv[] { jv.e, jv.l }) }, true);
	((en) this).ig = a(new eda[] { new eda(jv.e), new eda(jv.l),
				       new eda(jv.n), new eda(jv.k) },
			   true);
	((en) this).Wf
	    = a(new eda[] { new eda(jv.e), new eda(jv.l), new eda(jv.n) },
		true);
	((en) this).gg = new ja(this, 0, 0, false, false);
	((en) this).dg = new ja(this, 0, 0, true, true);
	((en) this).fg = new ja(this, 0, 0, false, false);
	((en) this).og = new ja(this, 0, 0, true, true);
	((en) this).jg = new ja(this, 0, 0, false, false);
	((en) this).lg = new ja(this, 0, 0, true, true);
	((en) this).ag = new ja(this, 0, 0, false, false);
	((en) this).Xf = new ja(this, 0, 0, true, true);
	((en) this).Zf = new ja(this, 0, 0, false, false);
	((en) this).ng = new ja(this, 0, 0, true, true);
	ie = new tfa(this);
	hg = b(true, (int) 16);
	m((byte) 127);
	((en) this).Lc = new bd(this);
	se[1] = b((byte) -128, 1);
	se[2] = b((byte) -127, 2);
	se[4] = b((byte) -128, 4);
	se[5] = b((byte) -128, 5);
	se[6] = b((byte) -128, 6);
	se[7] = b((byte) -127, 7);
	se[3] = b((byte) -127, 3);
	se[8] = b((byte) -128, 8);
	se[9] = b((byte) -128, 9);
	if (!se[2].a(-16777216))
	    se[2] = b((byte) -127, 0);
	if (!se[4].a(-16777216))
	    se[4] = se[2];
	if (!se[8].a(-16777216))
	    se[8] = se[4];
	if (!se[9].a(-16777216))
	    se[9] = se[8];
	u((byte) 20);
	JA();
	this.s();
    }
    
    final f a(int i, int i_204_, boolean bool) {
	J++;
	return new fo(this, i, i_204_, bool);
    }
    
    abstract mq a(eda[] var_edas, boolean bool);
    
    final void a(Class_q class_q) {
	Hb++;
	((en) this).Td = (mga) class_q;
	((en) this).Vd.M(((en) this).Td);
	((en) this).Vd.d(0);
	Wd.b(2, ((en) this).Vd);
	((en) this).Ud.b(2, ((en) this).Td);
	if (((en) this).Mf.b(3))
	    l(false);
    }
    
    private final void t(byte i) {
	u++;
	P(108);
	if (Ke != null)
	    Ke.c((int) 17);
	if (i != -18)
	    U(-58);
    }
    
    abstract void a(rca var_rca, int i);
    
    abstract void k(boolean bool);
    
    final void d(boolean bool, int i) {
	if (i < -99) {
	    if (!bool != !((en) this).pe) {
		((en) this).pe = bool;
		A(119);
		rf &= ~0x1f;
	    }
	    Ob++;
	}
    }
    
    final void T(int i) {
	int i_205_ = 14 / ((51 - i) / 57);
	((en) this).Od = false;
	Zc++;
	V(14);
    }
    
    final boolean f() {
	Jb++;
	return true;
    }
    
    abstract void d(int i, int i_206_);
    
    final void e(int i, int i_207_) {
	if (i == 0) {
	    if (((en) this).Te != i_207_) {
		((en) this).Te = i_207_;
		c((byte) -108);
	    }
	    sd++;
	}
    }
    
    abstract void a(Object object, byte i, Canvas canvas);
    
    abstract Object a(Canvas canvas, int i);
    
    abstract void a(byte i, nba var_nba, int i_208_);
    
    final int U(int i) {
	if (i != 9)
	    U();
	Kd++;
	return ee;
    }
    
    private final void V(int i) {
	V++;
	if (i != 14)
	    x(-90);
	if (((en) this).Mf == ds.i) {
	    float f = r((byte) -49);
	    ((en) this).Rd.a(f, 0.0F, f, (byte) 103);
	}
	Vf = false;
	b((byte) 86);
	if (Ke != null)
	    Ke.b((byte) -127);
    }
    
    final void g(int i) {
	Pd++;
	if (i != 1)
	    throw new IllegalArgumentException("");
    }
    
    cl b(byte i, int i_209_) {
	t++;
	if (i >= -126)
	    a((Canvas) null, 70);
	int i_210_ = i_209_;
    while_37_:
	do {
	while_36_:
	    do {
		do {
		    if (i_210_ != 6) {
			if (i_210_ != 1) {
			    if (i_210_ != 2) {
				if (i_210_ != 7)
				    break while_37_;
			    } else
				break;
			    break while_36_;
			}
		    } else
			return new ti(this);
		    return new oi(this);
		} while (false);
		return new jn(this, ((en) this).Lc);
	    } while (false);
	    return new kw(this);
	} while (false);
	return new Class_g(this);
    }
    
    final void a(Canvas canvas) {
	N = null;
	Oc++;
	ab = null;
	if (canvas == null || canvas == ((en) this).A) {
	    N = ((en) this).q;
	    ab = ((en) this).A;
	} else if (qb.containsKey(canvas)) {
	    N = qb.get(canvas);
	    ab = canvas;
	}
	if (ab == null || N == null)
	    throw new RuntimeException();
	a(N, (byte) -111, ab);
	h(true);
    }
    
    abstract void W(int i);
    
    final boolean o() {
	v++;
	return true;
    }
    
    final void c(int i, int i_211_, int i_212_, int i_213_, int i_214_,
		 int i_215_) {
	Ib++;
	float f = r((byte) -96);
	m((int) 1);
	c((byte) 48, i_214_);
	a(0, 1, ik.o);
	a(0, ik.o, -18836);
	a((byte) 28, i_215_);
	((en) this).Rd.b((float) (i_212_ - 1), 18543, (float) (i_213_ - 1),
			 1.0F);
	((en) this).Rd.a((float) i - f, 0.0F, (float) i_211_ - f, (byte) 57);
	T(123);
	d(false, (byte) -107);
	a(4, kfa.p, 0);
	d(true, (byte) -71);
	a(0, mca.l, -18836);
	a(0, 1, mca.l);
    }
    
    abstract void X(int i);
    
    final ls a(byte[] is, int i, int i_216_, Class_ec class_ec, boolean bool,
	       byte i_217_) {
	if (i_217_ != 73)
	    r();
	o++;
	return a(is, class_ec, i_216_, 0, bool, false, 0, i);
    }
    
    private final void l(boolean bool) {
	C++;
	Vf = bool;
	if (Ke != null)
	    Ke.a(bool);
	v((byte) -125);
    }
    
    final void c(boolean bool, byte i) {
	if (bool != ((en) this).af) {
	    ((en) this).af = bool;
	    k((int) 1);
	    rf &= ~0x1f;
	}
	if (i != -25)
	    ((en) this).Se = 41;
	Ed++;
    }
    
    final void f(int i, int i_218_) {
	lb++;
	if (i_218_ != 0)
	    ((en) this).Se = -80;
	if (i != 1) {
	    if (i == 0)
		a(Class_rf.e, true, Class_rf.e);
	    else if (i == 2)
		a(wi.e, true, ku.k);
	    else if (i == 3)
		a(hn.f, true, Class_rf.e);
	    else if (i == 4)
		a(Login.f, true, Login.f);
	} else
	    a(ku.k, true, ku.k);
    }
    
    void u(byte i) {
	hd++;
	if (i != 20)
	    b((Canvas) null);
	o((byte) -24);
    }
    
    abstract void v(byte i);
    
    final boolean x() {
	Ec++;
	return true;
    }
    
    abstract void a(boolean bool, Class_gb var_gb, int i, boolean bool_219_,
		    byte i_220_);
    
    final void a(hfa var_hfa, int i) {
	if (ue[((en) this).Te] != var_hfa) {
	    ue[((en) this).Te] = var_hfa;
	    if (var_hfa == null)
		K(0);
	    else
		var_hfa.a(9258);
	    rf &= ~0x1;
	}
	L++;
	if (i != 0)
	    ((en) this).Sf = null;
    }
    
    final void c(byte i, int i_221_) {
	if (i_221_ != ((en) this).hf) {
	    ((en) this).hf = i_221_;
	    l((int) 0);
	}
	if (i != 48)
	    ((en) this).Ff = -53;
	Y++;
    }
    
    final void GA(int i, int i_222_) {
	ic++;
	if (((en) this).Af != i || ((en) this).Ae != i_222_) {
	    ((en) this).Af = i;
	    ((en) this).Ae = i_222_;
	    e((byte) -117);
	    p((int) 0);
	    r((int) -102);
	}
    }
    
    final mga Y(int i) {
	if (i != 12083)
	    GA(-2, -12);
	nb++;
	return ((en) this).Rd;
    }
    
    final boolean h() {
	fc++;
	return false;
    }
    
    private final void w(byte i) {
	if (i <= -117) {
	    if (!Qf) {
		float[] fs = Ce;
		float f = ((float) (-((en) this).Ff * ((en) this).Af)
			   / (float) ((en) this).Zd);
		float f_223_ = ((float) ((((en) this).R - ((en) this).Ff)
					 * ((en) this).Af)
				/ (float) ((en) this).Zd);
		float f_224_ = ((float) (((en) this).Af * ((en) this).ze)
				/ (float) ((en) this).ef);
		float f_225_ = ((float) ((((en) this).ze - ((en) this).sb)
					 * ((en) this).Af)
				/ (float) ((en) this).ef);
		if (f == f_223_ || f_225_ == f_224_) {
		    fs[4] = 0.0F;
		    fs[13] = 0.0F;
		    fs[1] = 0.0F;
		    fs[7] = 0.0F;
		    fs[15] = 1.0F;
		    fs[6] = 0.0F;
		    fs[9] = 0.0F;
		    fs[14] = 0.0F;
		    fs[11] = 0.0F;
		    fs[3] = 0.0F;
		    fs[12] = 0.0F;
		    fs[2] = 0.0F;
		    fs[10] = 1.0F;
		    fs[5] = 1.0F;
		    fs[8] = 0.0F;
		    fs[0] = 1.0F;
		} else {
		    float f_226_ = 2.0F * (float) ((en) this).Af;
		    fs[5] = f_226_ / (f_224_ - f_225_);
		    fs[12] = 0.0F;
		    fs[2] = 0.0F;
		    fs[14] = sf
			= ((float) (((en) this).Af * ((en) this).Ae)
			   / (float) (((en) this).Af - ((en) this).Ae));
		    fs[4] = 0.0F;
		    fs[13] = 0.0F;
		    fs[6] = 0.0F;
		    fs[15] = 0.0F;
		    fs[11] = -1.0F;
		    fs[10] = Kf
			= (float) ((en) this).Ae / (float) (((en) this).Af
							    - ((en) this).Ae);
		    fs[9] = (f_224_ + f_225_) / (f_224_ - f_225_);
		    fs[3] = 0.0F;
		    fs[0] = f_226_ / (f_223_ - f);
		    fs[8] = (f_223_ + f) / (f_223_ - f);
		    fs[1] = 0.0F;
		    fs[7] = 0.0F;
		}
		f((byte) -124);
		Qf = true;
	    }
	    Dd++;
	}
    }
    
    final mga Z(int i) {
	fd++;
	if (i != -9813)
	    a(false, false);
	return Wd;
    }
    
    final void a(ir var_ir, int i) {
	xb++;
	ie.a(i, 0, this, var_ir);
    }
    
    abstract void d(boolean bool, byte i);
    
    en(Canvas canvas, Object object, fa var_fa, pl var_pl, int i, int i_227_) {
	super(var_fa);
	Yd = new float[16];
	he = 16777215;
	((en) this).ve = 128;
	je = false;
	((en) this).qe = true;
	((en) this).De = 3584.0F;
	se = new cl[10];
	Le = 1.0F;
	((en) this).Ae = 3584;
	((en) this).me = false;
	((en) this).ae = 3;
	re = 1;
	((en) this).Xe = -1.0F;
	Je = -1;
	((en) this).Ie = 1.0F;
	Ge = false;
	((en) this).af = false;
	((en) this).ef = 512;
	((en) this).mf = -1.0F;
	Ce = new float[16];
	((en) this).Te = 0;
	((en) this).Oe = true;
	((en) this).cf = 1.0F;
	ee = -1;
	((en) this).Ve = IncomingPackets.lea;
	((en) this).tf = 8;
	Ze = new float[16];
	Qe = false;
	((en) this).nf = false;
	((en) this).lf = -1;
	yf = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
			   0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
	ye = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	vf = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	((en) this).wf = true;
	((en) this).Gf = -1;
	((en) this).pf = 0;
	((en) this).Cf = 3584.0F;
	((en) this).He = false;
	((en) this).kf = 0;
	((en) this).gf = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
	((en) this).Se = 0;
	Re = false;
	((en) this).of = 0;
	((en) this).Af = 50;
	((en) this).ke = 1.0F;
	Df = -1;
	Hf = 0;
	((en) this).Ff = 0;
	((en) this).ze = 0;
	Lf = 0;
	((en) this).Zd = 512;
	Qf = false;
	((en) this).Nf = 1.0F;
	((en) this).Ef = true;
	((en) this).Of = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	((en) this).Mf = ih.g;
	((en) this).zf = yf;
	((en) this).Rf = 0;
	Ue = 0;
	((en) this).qf = 0;
	((en) this).Pf = 0;
	((en) this).Uf = true;
	Vf = false;
	Bf = new Stream();
	cg = new mga();
	N = ((en) this).q = object;
	((en) this).nd = var_pl;
	((en) this).te = i;
	ab = ((en) this).A = canvas;
	Dimension dimension = canvas.getSize();
	((en) this).If = i_227_;
	((en) this).R = pc = dimension.width;
	((en) this).sb = gd = dimension.height;
	gda.a(false, true, (byte) 88);
	if (((Class_r) this).j == null) {
	    ((en) this).Rb = new NativeInterface(0, ((en) this).If);
	    de = null;
	} else {
	    de = new sda(this, ((Class_r) this).j);
	    ((en) this).Rb = new NativeInterface(((Class_r) this).j.a(-16330),
						 ((en) this).If);
	    for (int i_228_ = 0; ((Class_r) this).j.a(-16330) > i_228_;
		 i_228_++) {
		vca var_vca = ((Class_r) this).j.a(i_228_, (byte) 86);
		if (var_vca != null)
		    ((en) this).Rb.initTextureMetrics(i_228_,
						      ((vca) var_vca).q,
						      ((vca) var_vca).f);
	    }
	}
    }
    
    private final void m(boolean bool) {
	if (bool != false)
	    de = null;
	Bd++;
	if (ds.i != ((en) this).Mf) {
	    sfa var_sfa = ((en) this).Mf;
	    ((en) this).Mf = ds.i;
	    if (var_sfa.b(3))
		l(false);
	    g((byte) 107);
	    ((en) this).zf = Yd;
	    t((byte) -18);
	    rf &= ~0x18;
	}
    }
    
    final void a(int i, int i_229_, Class_gb var_gb) {
	a(false, var_gb, i, false, (byte) -109);
	if (i_229_ == 1)
	    sc++;
    }
    
    final void w() {
	kb++;
	if (de != null)
	    de.c(0);
    }
}
