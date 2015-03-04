/* Class_l - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;

final class l extends Class_r implements p
{
    private static int[] o = new int[Math.max(Math.max(104, 20), 24573)];
    private Class_ae p;
    private m q;
    long nativeid = 0L;
    private static short[] r = new short[8191];
    static int[] s;
    static int[] t;
    private static byte[] u = new byte[8191];
    private static float[] v;
    private static float[] w;
    private static int[] x;
    private static int[] y;
    private static int[] z;
    private static int[] A;
    private boolean B = false;
    private int C;
    private int D;
    private il E;
    private ta F;
    private Class_q G;
    private Class_q H;
    private boolean I;
    int J;
    private qa[] K;
    
    final void d(int i) {
	K[i].b();
    }
    
    final native int BA();
    
    final boolean n() {
	return true;
    }
    
    final void a(f var_f, boolean bool) {
	if (var_f instanceof va)
	    q((va) var_f);
	else if (var_f instanceof t)
	    ma((t) var_f);
	else
	    throw new RuntimeException();
    }
    
    private final native void EA(IncomingPackets incomingPackets);
    
    final void c(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
	XA(i, i_0_, i_1_, i_3_, i_4_);
	XA(i, i_0_ + i_2_ - 1, i_1_, i_3_, i_4_);
	m(i, i_0_ + 1, i_2_ - 1, i_3_, i_4_);
	m(i + i_1_ - 1, i_0_ + 1, i_2_ - 1, i_3_, i_4_);
    }
    
    private final boolean A(short i) {
	synchronized (this) {
	    vca var_vca = ((Class_r) this).j.a(i, (byte) 86);
	    if (var_vca == null)
		return false;
	    Z(i, ((vca) var_vca).q, ((vca) var_vca).f, ((vca) var_vca).e,
	      ((vca) var_vca).u, ((vca) var_vca).x, ((vca) var_vca).n,
	      ((vca) var_vca).c, ((vca) var_vca).i, ((vca) var_vca).v,
	      ((vca) var_vca).a, ((vca) var_vca).m, ((vca) var_vca).r);
	}
	return true;
    }
    
    final void a(jt var_jt) {
	/* empty */
    }
    
    private final native void I(int i, int[] is, float[] fs);
    
    final native boolean O(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			   int i_9_);
    
    final void j() {
	/* empty */
    }
    
    final native void YA(int i, int i_10_, int i_11_, int i_12_);
    
    final boolean d() {
	return false;
    }
    
    final qa D() {
	for (int i = 0; i < ((l) this).J; i++) {
	    if (((qa) K[i]).h == Thread.currentThread())
		return K[i];
	}
	return null;
    }
    
    final void a(Rectangle[] rectangles, int i) throws uo {
	if (F == null)
	    throw new IllegalStateException("off");
	F.a(rectangles, i);
    }
    
    final void u() throws uo {
	if (F == null)
	    throw new IllegalStateException("off");
	F.b();
    }
    
    final la a(sa var_sa, aga[] var_agas, boolean bool) {
	int[] is = new int[var_agas.length];
	int[] is_13_ = new int[var_agas.length];
	boolean bool_14_ = false;
	for (int i = 0; i < var_agas.length; i++) {
	    is[i] = ((aga) var_agas[i]).b;
	    is_13_[i] = ((aga) var_agas[i]).d;
	    if (((aga) var_agas[i]).f != null)
		bool_14_ = true;
	}
	if (bool) {
	    if (bool_14_)
		throw new IllegalArgumentException
			  ("Cannot specify alpha with non-mono font unless someone writes it");
	    return new c(this, q, var_sa, var_agas, null);
	}
	if (bool_14_)
	    throw new IllegalArgumentException
		      ("Cannot specify alpha with non-mono font unless someone writes it");
	return new ca(this, q, var_sa, var_agas, null);
    }
    
    final jt d(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
	return null;
    }
    
    final native void MA(int i, int i_20_, int i_21_, int[] is);
    
    private final native void ma(t var_t);
    
    final void a(ir var_ir) {
	a(var_ir, false);
	D().HA(this, z, A, x, r, ((ir) var_ir).a.d(-14300));
    }
    
    final native void VA(int i, float f, float f_22_, float f_23_, float f_24_,
			 float f_25_);
    
    final Class_q p() {
	return G;
    }
    
    final boolean l() {
	return true;
    }
    
    final int c() {
	return 4;
    }
    
    final int b(int i, int i_26_) {
	int i_27_ = i & 0xfffff;
	int i_28_ = i_26_ & 0xfffff;
	return i_27_ & i_28_ ^ i_28_;
    }
    
    final void a(ir var_ir, int i) {
	a(var_ir, false);
	D().HA(this, z, A, x, r, ((ir) var_ir).a.d(-14300));
    }
    
    final native void CA(int i, int i_29_, int i_30_, int i_31_);
    
    final GraphicsCard y() {
	return new GraphicsCard(0, "SSE", 1, "CPU", 0L);
    }
    
    final native void m(int i, int i_32_, int i_33_, int i_34_, int i_35_);
    
    public l(Canvas canvas, fa var_fa) {
	super(var_fa);
	p = new Class_ae();
	D = 4096;
	C = 4096;
	E = new il(4);
	I = false;
	if (!Class_ue.a("sw3d", -126))
	    throw new RuntimeException("");
	iba.a((byte) -75);
	OA(((Class_r) this).j, 0, 0);
	gda.a(false, true, (byte) 88);
	I = true;
	G = new ra();
	a(new ra());
	g(1);
	f(0);
	if (canvas != null) {
	    d(canvas);
	    a(canvas);
	}
    }
    
    final void w() {
	/* empty */
    }
    
    final void k() {
	/* empty */
    }
    
    final void b(boolean bool) {
	/* empty */
    }
    
    final boolean bloom() {
	return false;
    }
    
    final void a(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_,
		 ua var_ua, int i_41_, int i_42_) {
	Q(i, i_36_, i_37_, i_38_, i_39_, i_40_, var_ua, i_41_, i_42_);
    }
    
    final Class_i a(int i, int i_43_, int[][] is, int[][] is_44_, int i_45_,
		    int i_46_, int i_47_) {
	return new s(this, q, i, i_43_, is, is_44_, i_45_, i_46_, i_47_);
    }
    
    private final native void Q(int i, int i_48_, int i_49_, int i_50_,
				int i_51_, int i_52_, ua var_ua, int i_53_,
				int i_54_);
    
    private final native void xa
	(short i, byte i_55_, byte i_56_, boolean bool, boolean bool_57_,
	 boolean bool_58_, byte i_59_, byte i_60_, byte i_61_, int i_62_,
	 int i_63_, boolean bool_64_, boolean bool_65_, int[] is);
    
    final boolean o() {
	return true;
    }
    
    final native void FA(int i, ua var_ua, int i_66_, int i_67_);
    
    private final void WA() {
	System.gc();
	System.runFinalization();
	iba.b(-5175);
    }
    
    final void a(float f, float f_68_, float f_69_) {
	/* empty */
    }
    
    final IncomingPackets c(int i) {
	m var_m = new m(this, i);
	p.b(var_m, (byte) 93);
	return var_m;
    }
    
    final native int[] v();
    
    final native void JA();
    
    final int a(int i, int i_70_) {
	return i | i_70_;
    }
    
    final da a(eg var_eg, int i, int i_71_, int i_72_, int i_73_) {
	return new v(this, q, var_eg, i, i_71_, i_72_, i_73_);
    }
    
    final void c(Canvas canvas) {
	if (((ta) F).k == canvas)
	    a((Canvas) null);
	ta var_ta = (ta) E.a(-32748, (long) canvas.hashCode());
	if (var_ta != null) {
	    var_ta.unlink(-125);
	    var_ta.a();
	}
    }
    
    final void a(int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_,
		 int i_79_) {
	D().G(this, i, i_74_, i_75_, i_76_, i_77_, i_78_, i_79_);
    }
    
    final native void e(int i, int i_80_, int i_81_, int i_82_, int i_83_);
    
    final boolean x() {
	return true;
    }
    
    final void a(int i, gga[] var_ggas) {
	int i_84_ = 0;
	for (int i_85_ = 0; i_85_ < i; i_85_++) {
	    y[i_84_++] = var_ggas[i_85_].a(true);
	    y[i_84_++] = var_ggas[i_85_].i(-105);
	    y[i_84_++] = var_ggas[i_85_].b((byte) 119);
	    y[i_84_++] = var_ggas[i_85_].a((byte) -89);
	    v[i_85_] = var_ggas[i_85_].b((int) 100);
	    y[i_84_++] = var_ggas[i_85_].a((int) 60);
	}
	I(i, y, v);
    }
    
    final f a(int[] is, int i, int i_86_, int i_87_, int i_88_) {
	boolean bool = false;
	int i_89_ = i;
    while_75_:
	for (int i_90_ = 0; i_90_ < i_88_; i_90_++) {
	    for (int i_91_ = 0; i_91_ < i_87_; i_91_++) {
		int i_92_ = is[i_89_++] >>> 24;
		if (i_92_ != 0 && i_92_ != 255) {
		    bool = true;
		    break while_75_;
		}
	    }
	}
	if (bool)
	    return new t(this, q, is, i, i_86_, i_87_, i_88_);
	return new va(this, q, is, i, i_86_, i_87_, i_88_);
    }
    
    final boolean m() {
	return true;
    }
    
    final boolean g() {
	return true;
    }
    
    final native void ja(int i);
    
    final native void va(int i);
    
    public final native void UA(boolean bool);
    
    final void a(int[] is) {
	Dimension dimension = ((ta) F).k.getSize();
	is[0] = dimension.width;
	is[1] = dimension.height;
    }
    
    final native void ya();
    
    final boolean i() {
	return false;
    }
    
    final Class_q t() {
	return H;
    }
    
    final native void ZA(boolean bool);
    
    final gga a(int i, int i_93_, int i_94_, int i_95_, int i_96_, float f) {
	return new oba(i, i_93_, i_94_, i_95_, i_96_, f);
    }
    
    final native int T();
    
    final native int[] h(int i, int i_97_, int i_98_, int i_99_);
    
    final void renderProfile(boolean profile) {
	/* empty */
    }
    
    final native void L();
    
    final void f(int i) {
	K[i].a();
    }
    
    final void getTexSize(int size) {
	throw new IllegalStateException();
    }
    
    private final native void qa(int i);
    
    private final native void R();
    
    final void a(int i, int i_100_, int i_101_, int i_102_, int i_103_,
		 int i_104_, int i_105_, int i_106_, int i_107_, int i_108_) {
	throw new IllegalStateException();
    }
    
    final native int DA();
    
    final native void AA(int i, int i_109_, int i_110_, int[] is);
    
    final boolean e() {
	return true;
    }
    
    final native void la(int i, int i_111_, int i_112_, int i_113_);
    
    final boolean r() {
	return false;
    }
    
    private final boolean W(short i) {
	synchronized (((Class_r) this).j) {
	    if (!((Class_r) this).j.a(false, i))
		return false;
	    vca var_vca = ((Class_r) this).j.a(i, (byte) 86);
	    if (var_vca == null)
		return false;
	    int[] is;
	    if (!((vca) var_vca).s)
		is = ((Class_r) this).j.a(i, 0.7F, true, 128, -5969, 128);
	    else
		is = ((Class_r) this).j.a(0.7F, 128, (byte) 111, true, 128, i);
	    xa(i, ((vca) var_vca).q, ((vca) var_vca).f, ((vca) var_vca).e,
	       ((vca) var_vca).u, ((vca) var_vca).x, ((vca) var_vca).n,
	       ((vca) var_vca).c, ((vca) var_vca).i, ((vca) var_vca).v,
	       ((vca) var_vca).a, ((vca) var_vca).m, ((vca) var_vca).r, is);
	}
	return true;
    }
    
    final void a(int i) {
	iba.b(-5175);
	qa(i);
	for (m var_m = (m) p.a((int) 88); var_m != null;
	     var_m = (m) p.b((byte) 43))
	    var_m.Z();
    }
    
    final void s() {
	/* empty */
    }
    
    final f a(int i, int i_114_, int i_115_, int i_116_, boolean bool) {
	if (bool)
	    return new t(this, q, i, i_114_, i_115_, i_116_);
	return new va(this, q, i, i_114_, i_115_, i_116_);
    }
    
    final native void ra(float f);
    
    final native int U();
    
    private final void a(ir var_ir, boolean bool) {
	int i = 0;
	int i_117_ = 0;
	int i_118_ = 0;
	int i_119_ = 0;
	int i_120_ = 0;
	for (mm var_mm = (mm) ((ir) var_ir).a.a(-19895); var_mm != null;
	     var_mm = (mm) ((ir) var_ir).a.e(83)) {
	    z[i++] = ((mm) var_mm).w;
	    z[i++] = ((mm) var_mm).t;
	    z[i++] = ((mm) var_mm).r;
	    A[i_117_++] = ((mm) var_mm).p;
	    r[i_119_++] = (short) ((mm) var_mm).C;
	    x[i_118_++] = ((mm) var_mm).o;
	    if (bool)
		u[i_120_++] = ((mm) var_mm).u;
	}
    }
    
    final native int b();
    
    final void a(Class_q class_q) {
	H = class_q;
	NA(class_q);
    }
    
    private final native void OA(fa var_fa, int i, int i_121_);
    
    final native void oa(int[] is);
    
    private final native void ia(ta var_ta);
    
    protected final synchronized void finalize() {
	this.h(1);
	if (((l) this).nativeid != 0L)
	    iba.a(this, (byte) 97);
    }
    
    final native void GA(int i, int i_122_);
    
    final void g(int i) {
	((l) this).J = i;
	K = new qa[((l) this).J];
	for (int i_123_ = 0; i_123_ < ((l) this).J; i_123_++)
	    K[i_123_] = new qa(this, C, D);
    }
    
    final jt a(jt var_jt, jt var_jt_124_, float f, jt var_jt_125_) {
	return null;
    }
    
    final void a(int i, int i_126_, int i_127_, int i_128_, int i_129_,
		 int i_130_) {
	w(i, i_126_, i_127_, i_128_, i_129_, i_130_);
    }
    
    private final native void Z
	(short i, byte i_131_, byte i_132_, boolean bool, boolean bool_133_,
	 boolean bool_134_, byte i_135_, byte i_136_, byte i_137_, int i_138_,
	 int i_139_, boolean bool_140_, boolean bool_141_);
    
    final boolean f() {
	return false;
    }
    
    final void b(Canvas canvas) {
	ta var_ta = (ta) E.a(-32748, (long) canvas.hashCode());
	Dimension dimension = canvas.getSize();
	var_ta.AA(canvas, dimension.width, dimension.height);
	if (canvas != null && canvas == ((ta) F).k)
	    a(canvas);
    }
    
    final void A() {
	if (!B) {
	    K = null;
	    F = null;
	    q = null;
	    G = null;
	    E.a(true);
	    for (m var_m = (m) p.a((int) 116); var_m != null;
		 var_m = (m) p.b((byte) 27))
		var_m.D();
	    p.d(2);
	    R();
	    if (I) {
		lea.a(false, false, true);
		I = false;
	    }
	    WA();
	    iba.a((int) 0);
	    B = true;
	}
    }
    
    final native void V(int i, int i_142_, int i_143_, int i_144_);
    
    final f a(int i, int i_145_, boolean bool) {
	if (bool)
	    return new t(this, q, i, i_145_);
	return new va(this, q, i, i_145_);
    }
    
    final f a(aga var_aga, boolean bool) {
	int[] is = ((aga) var_aga).i;
	byte[] is_146_ = ((aga) var_aga).c;
	int i = ((aga) var_aga).b;
	int i_147_ = ((aga) var_aga).d;
	f var_f;
	if (bool && ((aga) var_aga).f == null)
	    var_f = new w(this, q, is, is_146_, 0, ((aga) var_aga).b,
			  ((aga) var_aga).b, ((aga) var_aga).d);
	else {
	    int i_148_ = i * i_147_;
	    int[] is_149_ = new int[i_148_];
	    byte[] is_150_ = ((aga) var_aga).f;
	    if (is_150_ != null) {
		for (int i_151_ = 0; i_151_ < i_147_; i_151_++) {
		    int i_152_ = i_151_ * i;
		    for (int i_153_ = 0; i_153_ < i; i_153_++)
			is_149_[i_152_ + i_153_]
			    = (is[is_146_[i_152_ + i_153_] & 0xff]
			       | is_150_[i_152_ + i_153_] << 24);
		}
		var_f = new t(this, q, is_149_, 0, i, i, i_147_);
	    } else {
		boolean bool_154_ = false;
		for (int i_155_ = 0; i_155_ < i_148_; i_155_++) {
		    int i_156_ = ((aga) var_aga).i[is_146_[i_155_] & 0xff];
		    if (i_156_ >>> 24 != 255)
			bool_154_ = true;
		    is_149_[i_155_] = i_156_;
		}
		if (bool_154_)
		    var_f = new t(this, q, is_149_, 0, ((aga) var_aga).b,
				  ((aga) var_aga).b, ((aga) var_aga).d);
		else
		    var_f = new va(this, q, is_149_, 0, ((aga) var_aga).b,
				   ((aga) var_aga).b, ((aga) var_aga).d);
	    }
	}
	var_f.Q(((aga) var_aga).e, ((aga) var_aga).g, ((aga) var_aga).a,
		((aga) var_aga).h);
	return var_f;
    }
    
    final void d(Canvas canvas) {
	ta var_ta = (ta) E.a(-32748, (long) canvas.hashCode());
	if (var_ta == null) {
	    try {
		Class var_class = Class.forName("java.awt.Canvas");
		Method method
		    = var_class.getMethod("setIgnoreRepaint",
					  new Class[] { Boolean.TYPE });
		method.invoke(canvas, new Object[] { Boolean.TRUE });
	    } catch (Exception exception) {
		/* empty */
	    }
	    var_ta = new ta(this, canvas);
	    E.a(var_ta, (byte) -71, (long) canvas.hashCode());
	}
    }
    
    final native void IA(int i, int i_157_, int i_158_, int i_159_, int i_160_,
			 int i_161_, byte[] is, int i_162_, int i_163_);
    
    final native void pa(int i, int i_164_, int i_165_);
    
    final boolean B() {
	return true;
    }
    
    private final Object fa() {
	return new h(this);
    }
    
    final void a(int i, int i_166_, int i_167_, int i_168_) {
	/* empty */
    }
    
    private final native void NA(Class_q class_q);
    
    final ua a(int i, int i_169_, int[] is, int[] is_170_) {
	return new za(this, q, i, i_169_, is, is_170_);
    }
    
    private final native void q(va var_va);
    
    final void q() {
	a(((ta) F).k);
    }
    
    final native void da(int i, int i_171_, int i_172_, int i_173_);
    
    final native void XA(int i, int i_174_, int i_175_, int i_176_,
			 int i_177_);
    
    final boolean h() {
	return true;
    }
    
    final void a(Canvas canvas) {
	if (canvas != null) {
	    ta var_ta = (ta) E.a(-32748, (long) canvas.hashCode());
	    F = var_ta;
	    ia(var_ta);
	} else {
	    F = null;
	    ia(null);
	}
    }
    
    final Class_q C() {
	return new ra();
    }
    
    private final native void w(int i, int i_178_, int i_179_, int i_180_,
				int i_181_, int i_182_);
    
    final void a() {
	/* empty */
    }
    
    final native void J(int i, int i_183_, int i_184_, int i_185_, int i_186_,
			int i_187_);
    
    final void a(IncomingPackets incomingPackets) {
	q = (m) incomingPackets;
	EA(incomingPackets);
    }
    
    static {
	s = o;
	t = new int[6];
	x = new int[8191];
	w = new float[20];
	v = w;
	z = o;
	A = new int[8191];
	y = o;
    }
}
