/* wda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wda implements Runnable
{
    private volatile boolean a;
    private long b;
    private Class_r c;
    private int d;
    private gga[] e = new gga[8];
    private int[] f = new int[3];
    private volatile boolean g = true;
    private volatile boolean h = true;
    private dda i;
    
    final void a() {
	g = false;
	synchronized (this) {
	    this.notify();
	}
    }
    
    final void a(dda var_dda) {
	if (i != null)
	    i.a((int) -77, null);
	i = var_dda;
	if (i != null)
	    i.a(-97, this);
    }
    
    final void b() {
	g = true;
	synchronized (this) {
	    this.notify();
	}
    }
    
    final boolean c() {
	if (i != null && (a || !i.c(73)))
	    return false;
	return true;
    }
    
    public final void run() {
	while (h)
	    d();
    }
    
    private final void d() {
	c.f(d);
	while (!g && h) {
	    if (this.i != null && !this.i.c(116)) {
		a = true;
		Interactable var_fga = this.i.b(121);
		if (var_fga instanceof Animable) {
		    Animable var_lo = (Animable) var_fga;
		    if (((Animable) var_lo).i)
			var_lo.b(false, nda.k);
		    else {
			nw.a(var_lo, e);
			if (us.c != null)
			    us.c.a(-256, true, ((Animable) var_lo).var_n,
				   ((dda) this.i).i, -16777216,
				   ((Animable) var_lo).o);
		    }
		} else {
		    int i = ((wu) (wu) var_fga).i;
		    if (i >= 1 && i <= 4) {
			Class_i class_i = Class_q.b[i - 1];
			for (int i_0_ = 0; i_0_ < FileOnDisk.k + FileOnDisk.k; i_0_++) {
			    for (int i_1_ = 0; i_1_ < FileOnDisk.k + FileOnDisk.k; i_1_++) {
				if (qea.d[i - 1][i_0_][i_1_]) {
				    int i_2_ = n.e - FileOnDisk.k + i_0_;
				    int i_3_ = fm.i - FileOnDisk.k + i_1_;
				    if (i_2_ >= 0
					&& i_2_ < ((Class_i) class_i).k
					&& i_3_ >= 0
					&& i_3_ < ((Class_i) class_i).j) {
					nda.k.MA(i_2_ << Class_fb.a,
						 class_i.a(i_3_, (byte) 51,
							   i_2_),
						 i_3_ << Class_fb.a, f);
					if (Class_fb.a(f[0]) == d - 1)
					    class_i.a(i_2_, i_3_);
				    }
				}
			    }
			}
		    }
		}
	    } else {
		a = false;
		b = wf.u.a(false);
		synchronized (this) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	}
	c.d(d);
	while (g && h) {
	    synchronized (this) {
		try {
		    this.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    final long e() {
	return b;
    }
    
    final void f() {
	g = false;
	h = false;
	synchronized (this) {
	    this.notify();
	}
    }
    
    wda(int i, Class_r class_r) {
	a = false;
	d = i;
	c = class_r;
    }
}
