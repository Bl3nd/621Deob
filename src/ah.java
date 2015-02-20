/* ah - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;

class ah
{
    private int a = 32;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    private pn i;
    static int j;
    int[] k;
    static int l;
    private boolean m = false;
    static int n;
    static int o;
    static Signlink p;
    private long q = us.a(93);
    private int r = 0;
    static int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private long x = 0L;
    private long y;
    private int z;
    int A;
    int B;
    static int C;
    private pn[] D;
    private pn[] E;
    
    private final void a(boolean bool, int i) {
	if (bool == false) {
	    g++;
	    z -= i;
	    if (z < 0)
		z = 0;
	    if (this.i != null)
		this.i.a(i);
	}
    }
    
    private final void a(int i, pn var_pn, byte i_0_) {
	C++;
	int i_1_ = i >> 5;
	pn var_pn_2_ = D[i_1_];
	if (var_pn_2_ != null)
	    ((pn) var_pn_2_).m = var_pn;
	else
	    E[i_1_] = var_pn;
	D[i_1_] = var_pn;
	if (i_0_ != 33)
	    w = true;
	((pn) var_pn).k = i;
    }
    
    void a() {
	s++;
    }
    
    final synchronized void a(int i) {
	c++;
	if (!m) {
	    long l = us.a(103);
	    try {
		if (q + 500000L < l)
		    q = l - 500000L;
		for (/**/; l > q + 5000L; q += (long) (256000 / gba.G))
		    a(false, 256);
		if (i != -26789)
		    b(false, 43);
	    } catch (Exception exception) {
		q = l;
	    }
	    if (((ah) this).k != null) {
		try {
		    if (x != 0L) {
			if (l < x)
			    return;
			d(((ah) this).B);
			x = 0L;
			w = true;
		    }
		    int i_3_ = b();
		    if (r < v - i_3_)
			r = v - i_3_;
		    int i_4_ = u + ((ah) this).A;
		    if (i_4_ + 256 > 16384)
			i_4_ = 16128;
		    if (i_4_ + 256 > ((ah) this).B) {
			((ah) this).B += 1024;
			if (((ah) this).B > 16384)
			    ((ah) this).B = 16384;
			a();
			d(((ah) this).B);
			i_3_ = 0;
			w = true;
			if (i_4_ + 256 > ((ah) this).B) {
			    i_4_ = ((ah) this).B - 256;
			    u = i_4_ - ((ah) this).A;
			}
		    }
		    while (i_3_ < i_4_) {
			a(((ah) this).k, 256);
			i_3_ += 256;
			d();
		    }
		    if (y < l) {
			if (!w) {
			    if (r == 0 && t == 0) {
				a();
				x = l + 2000L;
				return;
			    }
			    u = Math.min(t, r);
			    t = r;
			} else
			    w = false;
			r = 0;
			y = l + 2000L;
		    }
		    v = i_3_;
		} catch (Exception exception) {
		    a();
		    x = l + 2000L;
		}
	    }
	}
    }
    
    void a(Component component) throws Exception {
	j++;
    }
    
    final synchronized void a(pn var_pn, byte i) {
	h++;
	this.i = var_pn;
	if (i != 88)
	    a = 77;
    }
    
    final synchronized void b(int i) {
	if (av.m != null) {
	    boolean bool = true;
	    for (int i_5_ = 0; i_5_ < 2; i_5_++) {
		if (this == ((cba) av.m).g[i_5_])
		    ((cba) av.m).g[i_5_] = null;
		if (((cba) av.m).g[i_5_] != null)
		    bool = false;
	    }
	    if (bool) {
		((cba) av.m).e = true;
		while (((cba) av.m).i)
		    Connection.a(-28448, 50L);
		av.m = null;
	    }
	}
	b++;
	if (i != -32470)
	    a((int) -119);
	a();
	((ah) this).k = null;
	m = true;
    }
    
    private final void a(int[] is, int i) {
	int i_6_ = i;
	if (wq.p)
	    i_6_ <<= 1;
	co.a(is, 0, i_6_);
	z -= i;
	if (this.i != null && z <= 0) {
	    z += gba.G >> 4;
	    Class_mc.a((byte) 121, this.i);
	    a(this.i.c(), this.i, (byte) 33);
	    int i_7_ = 0;
	    int i_8_ = 255;
	    int i_9_ = 7;
	while_12_:
	    while (i_8_ != 0) {
		int i_10_;
		int i_11_;
		if (i_9_ < 0) {
		    i_10_ = i_9_ & 0x3;
		    i_11_ = -(i_9_ >> 2);
		} else {
		    i_10_ = i_9_;
		    i_11_ = 0;
		}
		for (int i_12_ = i_8_ >>> i_10_ & 0x11111111; i_12_ != 0;
		     i_12_ >>>= 4) {
		    if ((i_12_ & 0x1) != 0) {
			i_8_ &= 1 << i_10_ ^ 0xffffffff;
			pn var_pn = null;
			pn var_pn_13_ = E[i_10_];
			while (var_pn_13_ != null) {
			    bo var_bo = ((pn) var_pn_13_).n;
			    if (var_bo != null && ((bo) var_bo).k > i_11_) {
				i_8_ |= 1 << i_10_;
				var_pn = var_pn_13_;
				var_pn_13_ = ((pn) var_pn_13_).m;
			    } else {
				((pn) var_pn_13_).l = true;
				int i_14_ = var_pn_13_.d();
				i_7_ += i_14_;
				if (var_bo != null)
				    ((bo) var_bo).k += i_14_;
				if (i_7_ >= a)
				    break while_12_;
				pn var_pn_15_ = var_pn_13_.a();
				if (var_pn_15_ != null) {
				    int i_16_ = ((pn) var_pn_13_).k;
				    for (/**/; var_pn_15_ != null;
					 var_pn_15_ = var_pn_13_.b())
					a(i_16_ * var_pn_15_.c() >> 8,
					  var_pn_15_, (byte) 33);
				}
				pn var_pn_17_ = ((pn) var_pn_13_).m;
				((pn) var_pn_13_).m = null;
				if (var_pn == null)
				    E[i_10_] = var_pn_17_;
				else
				    ((pn) var_pn).m = var_pn_17_;
				if (var_pn_17_ == null)
				    D[i_10_] = var_pn;
				var_pn_13_ = var_pn_17_;
			    }
			}
		    }
		    i_10_ += 4;
		    i_11_++;
		}
		i_9_--;
	    }
	    for (int i_18_ = 0; i_18_ < 8; i_18_++) {
		pn var_pn = E[i_18_];
		E[i_18_] = D[i_18_] = null;
		pn var_pn_19_;
		for (/**/; var_pn != null; var_pn = var_pn_19_) {
		    var_pn_19_ = ((pn) var_pn).m;
		    ((pn) var_pn).m = null;
		}
	    }
	}
	if (z < 0)
	    z = 0;
	if (this.i != null)
	    this.i.b(is, 0, i);
	q = us.a(117);
    }
    
    final synchronized void c(int i) {
	f++;
	w = true;
	if (i == 2000) {
	    try {
		c();
	    } catch (Exception exception) {
		a();
		x = us.a(i ^ 0x78a) + 2000L;
	    }
	}
    }
    
    public static void a(byte i) {
	if (i == -91)
	    p = null;
    }
    
    static final void b(boolean bool, int i) {
	if (bool != true)
	    a((byte) 15);
	e++;
	if (!((jb) cs.g).J)
	    i = -1;
	if (i != jk.m) {
	    if ((i ^ 0xffffffff) != 0) {
		Class_ag var_ag = fu.e.a(i, (byte) 93);
		aga var_aga = var_ag.b(-1);
		if (var_aga != null) {
		    nda.signlink.a(var_aga.f(),
			    new Point(((Class_ag) var_ag).g, ((Class_ag) var_ag).a),
			    var_aga.c(), var_aga.d(), bool, ru.canvas);
		    jk.m = i;
		} else
		    i = -1;
	    }
	    if ((i ^ 0xffffffff) == 0 && jk.m != -1) {
		nda.signlink.a(null, new Point(), -1, -1, true, ru.canvas);
		jk.m = -1;
	    }
	}
    }
    
    int b() throws Exception {
	o++;
	return ((ah) this).B;
    }
    
    void c() throws Exception {
	d++;
    }
    
    void d(int i) throws Exception {
	l++;
    }
    
    void d() throws Exception {
	n++;
    }
    
    public ah() {
	t = 0;
	v = 0;
	w = true;
	y = 0L;
	z = 0;
	E = new pn[8];
	D = new pn[8];
    }
}
