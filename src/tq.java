/* tq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tq extends Interactable
{
    private boolean g = false;
    private long h;
    private static boolean[] i = new boolean[8];
    private long j;
    boolean k;
    int l = 0;
    private static boolean[] m = new boolean[32];
    fe[] n;
    private fca o;
    Class_ae p;
    private int q;
    private boolean r;
    boolean s;
    ir t;
    private int u;
    int v;
    
    final boolean a(Class_r class_r, long l) {
	if (j != h)
	    f();
	else
	    c();
	if (l - j > 750L) {
	    d();
	    return false;
	}
	int i = (int) (l - h);
	if (r) {
	    for (fp var_fp = (fp) o.b((byte) 127); var_fp != null;
		 var_fp = (fp) o.a((byte) -106)) {
		for (int i_0_ = 0; i_0_ < ((ce) ((fp) var_fp).o).o; i_0_++)
		    var_fp.a(!g, class_r, 1, l, -91);
	    }
	    r = false;
	}
	for (fp var_fp = (fp) o.b((byte) 117); var_fp != null;
	     var_fp = (fp) o.a((byte) -106))
	    var_fp.a(!g, class_r, i, l, 50);
	h = l;
	return true;
    }
    
    final void a(Class_r class_r, long l, hi[] var_his, qg[] var_qgs,
		 boolean bool) {
	if (!((tq) this).k) {
	    a(class_r, var_his, bool);
	    a(var_qgs, bool);
	    j = l;
	}
    }
    
    final void a(long l) {
	j = l;
    }
    
    final ir a() {
	((ir) ((tq) this).t).a.c(0);
	for (int i = 0; i < ((tq) this).n.length; i++) {
	    if (((tq) this).n[i] != null && ((fe) ((tq) this).n[i]).K != null)
		((ir) ((tq) this).t).a.a((byte) 126, ((tq) this).n[i]);
	}
	return ((tq) this).t;
    }
    
    final void b() {
	r = true;
    }
    
    final void a(Class_r class_r) {
	((ir) ((tq) this).t).a.c(0);
	for (fp var_fp = (fp) o.b((byte) 72); var_fp != null;
	     var_fp = (fp) o.a((byte) -106))
	    var_fp.a(82, class_r, h);
    }
    
    private final void c() {
	g = false;
    }
    
    final void d() {
	((tq) this).k = true;
	for (mt var_mt = (mt) ((tq) this).p.a((int) 116); var_mt != null;
	     var_mt = (mt) ((tq) this).p.b((byte) 31)) {
	    if (((vj) ((mt) var_mt).v).b == 1)
		var_mt.a((byte) -114);
	}
	for (int i = 0; i < ((tq) this).n.length; i++) {
	    if (((tq) this).n[i] != null) {
		((tq) this).n[i].a();
		((tq) this).n[i] = null;
	    }
	}
	((tq) this).l = 0;
	o = new fca();
	q = 0;
	((tq) this).p = new Class_ae();
	u = 0;
	this.b(2);
	da.d[vq.n] = this;
	vq.n = vq.n + 1 & gr.a[ISAAC.k];
    }
    
    static final tq a(int i, boolean bool) {
	if (vq.n != tba.r) {
	    tq var_tq = da.d[tba.r];
	    tba.r = tba.r + 1 & gr.a[ISAAC.k];
	    var_tq.b(i, bool);
	    return var_tq;
	}
	return new tq(i, bool);
    }
    
    public static void e() {
	m = null;
	i = null;
    }
    
    private final void b(int i, boolean bool) {
	tfa.w.a(this, 65);
	j = (long) i;
	h = (long) i;
	r = true;
	((tq) this).s = bool;
    }
    
    final void f() {
	g = true;
    }
    
    final void a(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
	((tq) this).v = i;
    }
    
    final ir g() {
	return ((tq) this).t;
    }
    
    private final void a(qg[] var_qgs, boolean bool) {
	for (int i = 0; i < 8; i++)
	    tq.i[i] = false;
    while_223_:
	for (mt var_mt = (mt) ((tq) this).p.a((int) 120); var_mt != null;
	     var_mt = (mt) ((tq) this).p.b((byte) 81)) {
	    if (var_qgs != null) {
		for (int i = 0; i < var_qgs.length; i++) {
		    if (((mt) var_mt).x == var_qgs[i]
			|| ((mt) var_mt).x == ((qg) var_qgs[i]).n) {
			tq.i[i] = true;
			var_mt.b((byte) 127);
			continue while_223_;
		    }
		}
	    }
	    if (!bool) {
		var_mt.unlink(-44);
		u--;
		if (var_mt.c(13)) {
		    var_mt.a((byte) -85);
		    vo.H--;
		}
	    }
	}
	if (var_qgs != null) {
	    for (int i = 0; i < var_qgs.length; i++) {
		if (i == 8 || u == 8)
		    break;
		if (!tq.i[i]) {
		    mt var_mt = null;
		    if (((vj) var_qgs[i].b(-17)).b == 1 && vo.H < 32) {
			var_mt = new mt(var_qgs[i], this);
			io.J.a((long) ((qg) var_qgs[i]).g, 78, var_mt);
			vo.H++;
		    }
		    if (var_mt == null)
			var_mt = new mt(var_qgs[i], this);
		    ((tq) this).p.b(var_mt, (byte) 93);
		    u++;
		    tq.i[i] = true;
		}
	    }
	}
    }
    
    private final void a(Class_r class_r, hi[] var_his, boolean bool) {
	for (int i = 0; i < 32; i++)
	    m[i] = false;
    while_225_:
	for (fp var_fp = (fp) o.b((byte) 125); var_fp != null;
	     var_fp = (fp) o.a((byte) -106)) {
	    if (var_his != null) {
		for (int i = 0; i < var_his.length; i++) {
		    if (((fp) var_fp).h == var_his[i]
			|| ((fp) var_fp).h == ((hi) var_his[i]).f) {
			m[i] = true;
			var_fp.a(-32768);
			((fp) var_fp).r = false;
			continue while_225_;
		    }
		}
	    }
	    if (!bool) {
		if (((fp) var_fp).s == 0) {
		    var_fp.b(2);
		    q--;
		} else
		    ((fp) var_fp).r = true;
	    }
	}
	if (var_his != null) {
	    for (int i = 0; i < var_his.length; i++) {
		if (i == 32 || q == 32)
		    break;
		if (!m[i]) {
		    fp var_fp = new fp(class_r, var_his[i], this, j);
		    o.a(var_fp, 54);
		    q++;
		    m[i] = true;
		}
	    }
	}
    }
    
    private tq(int i, boolean bool) {
	((tq) this).k = false;
	o = new fca();
	q = 0;
	((tq) this).p = new Class_ae();
	r = false;
	((tq) this).s = false;
	u = 0;
	((tq) this).t = new ir();
	((tq) this).n = new fe[8192];
	b(i, bool);
    }
}
