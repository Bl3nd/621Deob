/* qk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class qk implements jh
{
    static int a;
    private int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    private int j;
    static int k;
    static int l;
    static int m;
    private int n = -1;
    static int o;
    static int p;
    static int q;
    static int r;
    private int s;
    private qj t;
    private int u;
    static int v;
    static int w;
    private int x = 0;
    static int y;
    private nca[] z = new nca[9];
    static int A;
    
    static final void a(byte i, long[] ls, int[] is) {
	o++;
	int i_0_ = 19 % ((i + 24) / 34);
	ru.a(ls.length - 1, false, is, ls, 0);
    }
    
    final void a(int i, int i_1_) {
	if (z[i] != null)
	    z[i].a(29468);
	A++;
	s &= i_1_ << i ^ 0xffffffff;
	z[i] = null;
    }
    
    protected final void finalize() throws Throwable {
	t.b(false, u);
	e++;
	super.finalize();
    }
    
    public final void c(int i) {
	OpenGL.glBindFramebufferEXT(36009, 0);
	if (i != 20966)
	    c(-79);
	qk.i++;
	x &= ~0x2;
	n = b((byte) -58);
    }
    
    private final void a(waa var_waa, byte i, int i_2_, int i_3_, int i_4_) {
	k++;
	if (n == -1)
	    throw new RuntimeException();
	int i_5_ = 12 / ((-42 - i) / 38);
	int i_6_ = 1 << i_3_;
	if (((i_6_ ^ 0xffffffff) & s) == 0) {
	    j = ((waa) var_waa).s;
	    b = ((waa) var_waa).s;
	} else if (((waa) var_waa).s != b || ((waa) var_waa).s != j)
	    throw new RuntimeException();
	var_waa.a((byte) 109, rh.x[i_3_], n, i_2_, i_4_);
	z[i_3_] = var_waa;
	s |= i_6_;
    }
    
    public final void a(int i) {
	OpenGL.glBindFramebufferEXT(36160, u);
	v++;
	if (i == -5908) {
	    x |= 0x4;
	    n = b((byte) -43);
	}
    }
    
    private final void a(int i, pm var_pm, byte i_7_, int i_8_) {
	r++;
	if ((n ^ 0xffffffff) == 0)
	    throw new RuntimeException();
	int i_9_ = 1 << i;
	if ((s & (i_9_ ^ 0xffffffff)) != 0) {
	    if (b != ((pm) var_pm).u || ((pm) var_pm).G != j)
		throw new RuntimeException();
	} else {
	    b = ((pm) var_pm).u;
	    j = ((pm) var_pm).G;
	}
	var_pm.a(i_8_, n, rh.x[i], (byte) 107);
	if (i_7_ < 51)
	    z = null;
	z[i] = var_pm;
	s |= i_9_;
    }
    
    private final int b(byte i) {
	d++;
	int i_10_ = -80 % ((i - 18) / 34);
	if ((x & 0x4) != 0)
	    return 36160;
	if ((0x2 & x) != 0)
	    return 36009;
	if ((x & 0x1) != 0)
	    return 36008;
	return -1;
    }
    
    final void a(int i, boolean bool) {
	y++;
	if (bool == true) {
	    if ((n ^ 0xffffffff) == 0)
		throw new RuntimeException();
	    OpenGL.glDrawBuffer(rh.x[i]);
	}
    }
    
    final boolean a(boolean bool) {
	m++;
	if (bool != false)
	    return false;
	int i = OpenGL.glCheckFramebufferStatusEXT(n);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public final void b(int i) {
	a++;
	OpenGL.glBindFramebufferEXT(36160, 0);
	x &= ~0x4;
	if (i != -9828)
	    t = null;
	n = b((byte) 86);
    }
    
    public final void e(int i) {
	if (i >= -127)
	    a((byte) -100, 64);
	l++;
	OpenGL.glBindFramebufferEXT(36009, u);
	x |= 0x2;
	n = b((byte) -75);
    }
    
    final void a(int i, pca var_pca, int i_11_) {
	g++;
	if ((n ^ 0xffffffff) == 0)
	    throw new RuntimeException();
	if (i_11_ != -2693)
	    a(true);
	int i_12_ = 1 << i;
	if ((s & (i_12_ ^ 0xffffffff)) == 0) {
	    b = ((pca) var_pca).C;
	    j = ((pca) var_pca).y;
	} else if (b != ((pca) var_pca).C || ((pca) var_pca).y != j)
	    throw new RuntimeException();
	var_pca.a(i_11_ + 2819, rh.x[i], n);
	z[i] = var_pca;
	s |= i_12_;
    }
    
    final void a(byte i, int i_13_) {
	int i_14_ = 31 / ((i + 6) / 42);
	p++;
	if ((n ^ 0xffffffff) == 0)
	    throw new RuntimeException();
	OpenGL.glReadBuffer(rh.x[i_13_]);
    }
    
    public final void a(byte i) {
	OpenGL.glBindFramebufferEXT(36008, u);
	h++;
	if (i > 78) {
	    x |= 0x1;
	    n = b((byte) 97);
	}
    }
    
    final void a(int i, byte i_15_, waa var_waa, int i_16_) {
	c++;
	a(var_waa, (byte) -110, i_16_, i, 0);
	if (i_15_ != -64)
	    a(120, null, -107);
    }
    
    final void a(pm var_pm, byte i, int i_17_) {
	a(i_17_, var_pm, (byte) 55, 0);
	if (i != 1)
	    w = 80;
	f++;
    }
    
    public final void d(int i) {
	q++;
	if (i != 16401)
	    a(null, (byte) -83, -24, 44, -61);
	OpenGL.glBindFramebufferEXT(36008, 0);
	x &= ~0x1;
	n = b((byte) 120);
    }
    
    qk(qj var_qj) {
	if (!((qj) var_qj).wg)
	    throw new IllegalStateException("");
	t = var_qj;
	OpenGL.glGenFramebuffersEXT(1, un.A, 0);
	u = un.A[0];
    }
}
