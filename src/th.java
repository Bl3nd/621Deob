/* th - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class th implements Runnable
{
    static int a;
    static int b;
    static int c;
    static Class_mc d;
    static int e;
    static int f;
    static char[] g
	= { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    static int h;
    static int i = -1;
    static int[] j = null;
    static int[] k;
    static int l;
    static int[] m = new int[14];
    private je n = new je();
    private boolean o = false;
    private Thread p;
    int q = 0;
    
    public final void run() {
	h++;
	while (!o) {
	    Class_kf class_kf;
	    synchronized (n) {
		class_kf = (Class_kf) n.b(-21957);
		if (class_kf != null)
		    ((th) this).q--;
		else {
		    try {
			n.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (((Class_kf) class_kf).G == 2)
		    ((Class_kf) class_kf).E.a(((Class_kf) class_kf).K.length,
					      ((Class_kf) class_kf).K,
					      (int) ((pp) class_kf).l, -68);
		else if (((Class_kf) class_kf).G == 3)
		    ((Class_kf) class_kf).K
			= ((Class_kf) class_kf).E.a((byte) 108,
						    (int) ((pp) class_kf).l);
	    } catch (Exception exception) {
		cea.a(null, -2, exception);
	    }
	    ((ft) class_kf).x = false;
	}
    }
    
    static final sd a(int i, int i_0_, da var_da, int i_1_, int i_2_) {
	if (i != -24294)
	    a(-109, -34, null, 105, -123);
	b++;
	if (var_da == null)
	    return null;
	sd var_sd
	    = new sd(i_2_, i_0_, i_1_, var_da.K(), var_da.KA(), var_da.l(),
		     var_da.J(), var_da.H(), var_da.OA(), var_da.za());
	return var_sd;
    }
    
    private final void a(boolean bool, Class_kf class_kf) {
	synchronized (n) {
	    if (bool != false)
		i = 62;
	    n.a((int) 75, class_kf);
	    ((th) this).q++;
	    n.notifyAll();
	}
	e++;
    }
    
    final void a(byte i) {
	o = true;
	a++;
	synchronized (n) {
	    n.notifyAll();
	}
	if (i >= -98)
	    a(-55, -95, null, -90, 89);
	try {
	    p.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	p = null;
    }
    
    final Class_kf a(int i, int i_3_, lf var_lf) {
	l++;
	Class_kf class_kf = new Class_kf();
	if (i_3_ > -73)
	    return null;
	((pp) class_kf).l = (long) i;
	((Class_kf) class_kf).G = 3;
	((Class_kf) class_kf).E = var_lf;
	((ft) class_kf).u = false;
	a(false, class_kf);
	return class_kf;
    }
    
    final Class_kf a(byte[] is, boolean bool, lf var_lf, int i) {
	c++;
	Class_kf class_kf = new Class_kf();
	((ft) class_kf).u = false;
	((pp) class_kf).l = (long) i;
	((Class_kf) class_kf).G = 2;
	((Class_kf) class_kf).K = is;
	if (bool != true)
	    n = null;
	((Class_kf) class_kf).E = var_lf;
	a(false, class_kf);
	return class_kf;
    }
    
    final Class_kf a(int i, lf var_lf, int i_4_) {
	f++;
	Class_kf class_kf = new Class_kf();
	((Class_kf) class_kf).G = 1;
	synchronized (n) {
	    if (i != 8217)
		return null;
	    for (Class_kf class_kf_5_ = (Class_kf) n.d((byte) -121);
		 class_kf_5_ != null;
		 class_kf_5_ = (Class_kf) n.a(1252027233)) {
		if ((long) i_4_ == ((pp) class_kf_5_).l
		    && var_lf == ((Class_kf) class_kf_5_).E
		    && ((Class_kf) class_kf_5_).G == 2) {
		    ((Class_kf) class_kf).K = ((Class_kf) class_kf_5_).K;
		    ((ft) class_kf).x = false;
		    return class_kf;
		}
	    }
	}
	((Class_kf) class_kf).K = var_lf.a((byte) 108, i_4_);
	((ft) class_kf).u = true;
	((ft) class_kf).x = false;
	return class_kf;
    }
    
    public static void b(byte i) {
	g = null;
	j = null;
	m = null;
	k = null;
	d = null;
	if (i <= 2)
	    b((byte) -7);
    }
    
    th(Signlink var_rj) {
	vfa var_vfa = var_rj.a(5, this, 0);
	while (var_vfa.f == 0)
	    Connection.a(-28448, 10L);
	if (var_vfa.f == 2)
	    throw new RuntimeException();
	p = (Thread) var_vfa.hostName;
    }
}
