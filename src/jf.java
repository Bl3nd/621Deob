/* jf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jf
{
    static int a;
    static int b;
    private pl c;
    static int d;
    static int e;
    private tb f = new tb(128);
    static int g;
    static int h;
    static int i;
    
    final void a(int i) {
	synchronized (f) {
	    if (i != 28804)
		c = null;
	    f.c((byte) 2);
	}
	d++;
    }
    
    static final void b(int i) {
	Class_ab.b.a(18385);
	e++;
	if (i != -13609)
	    e(-86);
    }
    
    final void a(boolean bool, int i) {
	a++;
	synchronized (f) {
	    f.a(bool, i);
	}
    }
    
    static final void c(int i) {
	b++;
	if (i != -2488)
	    e(-88);
	if (ut.I < 0) {
	    pr.H = -1;
	    Class_k.Q = -1;
	    ut.I = 0;
	}
	if (kca.z < ut.I) {
	    ut.I = kca.z;
	    Class_k.Q = -1;
	    pr.H = -1;
	}
	if (cv.d < 0) {
	    cv.d = 0;
	    Class_k.Q = -1;
	    pr.H = -1;
	}
	if (cv.d > kca.N) {
	    cv.d = kca.N;
	    pr.H = -1;
	    Class_k.Q = -1;
	}
    }
    
    final void d(int i) {
	synchronized (f) {
	    f.a(18385);
	}
	h++;
	if (i != 0)
	    e(23);
    }
    
    static final void e(int i) {
	g++;
	if (ke.H == null) {
	    ke.H = lda.b((byte) -47);
	    nw.a = ke.H[0];
	    sr.V = us.a(i ^ ~0x69);
	}
	if (Class_ub.W == null)
	    ip.h((int) -128);
	lda var_lda = nw.a;
	int i_0_ = ik.a(-14);
	if (var_lda == nw.a) {
	    hk.K = ((lda) nw.a).k.getString((byte) 96, cba.languageID);
	    if (((lda) nw.a).g)
		as.w = (i_0_ * (((lda) nw.a).m - ((lda) nw.a).o) / 100
			+ ((lda) nw.a).o);
	    if (((lda) nw.a).j)
		hk.K += as.w + "%";
	} else if (nw.a != lda.K) {
	    hk.K = ((lda) var_lda).e.getString((byte) -50, cba.languageID);
	    if (((lda) nw.a).j)
		hk.K += ((lda) var_lda).m + "%";
	    as.w = ((lda) var_lda).m;
	    if (((lda) nw.a).g || ((lda) var_lda).g)
		sr.V = us.a(92);
	} else {
	    Class_ub.W = null;
	    ei.a(3, -114);
	}
	if (i == -1) {
	    if (Class_ub.W != null) {
		Class_ub.W.a(nw.a, (byte) -124, sr.V, as.w, hk.K);
		if (kg.j != null) {
		    for (int i_1_ = Class_nb.n + 1; kg.j.length > i_1_;
			 i_1_++) {
			if (kg.j[i_1_].b((byte) 77) >= 100
			    && i_1_ - 1 == Class_nb.n && hm.h >= 1
			    && Class_ub.W.a(true)) {
			    try {
				kg.j[i_1_].a((int) 100);
			    } catch (Exception exception) {
				kg.j = null;
				break;
			    }
			    Class_ub.W.a((byte) -126, kg.j[i_1_]);
			    Class_nb.n++;
			    if (kg.j.length - 1 <= Class_nb.n
				&& kg.j.length > 1)
				Class_nb.n = !lf.l.a((byte) -86) ? -1 : 0;
			}
		    }
		}
	    }
	}
    }
    
    final gda b(boolean bool, int i) {
	jf.i++;
	if (bool != false)
	    a(true, 59);
	gda var_gda;
	synchronized (f) {
	    var_gda = (gda) f.get((long) i, (byte) 100);
	}
	if (var_gda != null)
	    return var_gda;
	byte[] is;
	synchronized (c) {
	    is = c.b(i, 42, 1);
	}
	var_gda = new gda();
	if (is != null)
	    var_gda.a(new BytesParser(is), 54);
	synchronized (f) {
	    f.put((long) i, var_gda, 1);
	}
	return var_gda;
    }
    
    jf(Class_rf class_rf, int i, pl var_pl) {
	c = var_pl;
	c.a(1, true);
    }
}
