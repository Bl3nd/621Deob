/* jl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jl implements Runnable
{
    static int a;
    static int b;
    private aca c = new gfa();
    private volatile boolean d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    static int j;
    static int k;
    static int l;
    static int m;
    private boolean n;
    static int o;
    private long p;
    private int q;
    private long r;
    static int s;
    static int t;
    private int u;
    private aca v = null;
    private lda w;
    private String x;
    
    final synchronized void a(byte i, aca var_aca) {
	v = c;
	b++;
	c = var_aca;
	int i_0_ = -48 % ((i + 44) / 63);
	r = us.getCurrentTime(111);
    }
    
    final int a(byte i) {
	if (i != -39)
	    return -36;
	a++;
	return q;
    }
    
    final synchronized void a(int i) {
	h++;
	int i_1_ = -66 / ((i - 57) / 47);
	n = true;
    }
    
    final synchronized void a(lda var_lda, byte i, long l, int i_2_,
			      String string) {
	u = i_2_;
	w = var_lda;
	x = string;
	e++;
	int i_3_ = 99 % ((i + 68) / 53);
	p = l;
    }
    
    final long b(byte i) {
	if (i != -25)
	    return 8L;
	k++;
	return p;
    }
    
    final synchronized boolean a(boolean bool) {
	j++;
	if (bool != true)
	    c = null;
	return c.a(r, 21336);
    }
    
    final void b(int i) {
	d = true;
	if (i != 24551)
	    p = -13L;
	f++;
    }
    
    final lda c(byte i) {
	if (i <= 31)
	    return null;
	jl.i++;
	return w;
    }
    
    final String d(byte i) {
	m++;
	if (i != 86)
	    s = -67;
	return x;
    }
    
    final int c(int i) {
	l++;
	if (w == null)
	    return 0;
	int i_4_ = w.c((byte) -98);
	if (((lda) w).g && u < ((lda) w).m)
	    return u + 1;
	if (i_4_ < 0 || i_4_ >= ke.H.length - 1)
	    return 100;
	if (u == ((lda) w).o)
	    return ((lda) w).m;
	if (i != -23213)
	    return 25;
	return ((lda) w).o;
    }
    
    public final void run() {
	while (!d) {
	    long l = us.getCurrentTime(112);
	    synchronized (this) {
		try {
		    if (c instanceof gfa)
			c.a(true, n);
		    else {
			q++;
			long l_5_ = us.getCurrentTime(117);
			if (lg.r != null && v != null && v.c((byte) -105) != 0
			    && r >= l_5_ - (long) v.c((byte) -108)) {
			    int i = (int) (255L * (l_5_ - r)
					   / (long) v.c((byte) -96));
			    int i_6_ = -i + 255;
			    ro.b(0);
			    i_6_ = 0xffffff | i_6_ << 24;
			    i = i << 24 | 0xffffff;
			    lg.r.ja(0);
			    f var_f = lg.r.a(ff.width, eh.height, true);
			    lg.r.a(var_f, 5);
			    v.a(true, true);
			    lg.r.q();
			    var_f.V(0, 0, 0, i_6_, 1);
			    lg.r.a(var_f, 5);
			    lg.r.ja(0);
			    c.a(true, true);
			    lg.r.q();
			    var_f.V(0, 0, 0, i, 1);
			} else {
			    if (v != null) {
				n = true;
				v.a((byte) -22);
				v = null;
			    }
			    if (n) {
				ro.b(0);
				if (lg.r != null)
				    lg.r.ja(0);
			    }
			    c.a(true, n || lg.r != null && lg.r.f());
			}
			try {
			    if (lg.r != null && !(c instanceof gfa))
				lg.r.u();
			} catch (uo var_uo) {
			    cea.a((var_uo.getMessage() + " (Recovered) "
				   + po.c.errorMessage((byte) -30)),
				  -2, var_uo);
			    ur.setTKVersion(0, true);
			}
		    }
		    n = false;
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_7_ = us.getCurrentTime(92);
	    int i = (int) (20L - (l_7_ - l));
	    if (i > 0)
		Connection.a(-28448, (long) i);
	}
	o++;
    }
    
    final int e(byte i) {
	t++;
	if (i != -29)
	    return 3;
	return u;
    }
    
    public jl() {
	/* empty */
    }
}
