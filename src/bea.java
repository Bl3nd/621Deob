/* bea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bea
{
    static int a;
    pl b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static Class_ae h = new Class_ae();
    static int i;
    private pl j;
    private tb k = new tb(64);
    tb l = new tb(60);
    int m;
    static int n;
    static int o;
    
    final void a(int i, int i_0_) {
	if (i_0_ != 29206)
	    k = null;
	d++;
	synchronized (k) {
	    k.a(true, i);
	}
	synchronized (((bea) this).l) {
	    ((bea) this).l.a(true, i);
	}
    }
    
    static final void b(int i, int i_1_) {
	nda.g = 3;
	wh.J = -1;
	wq.o = i;
	if (i_1_ != 9192)
	    a((int) 107);
	sh.h = 100;
	e++;
    }
    
    static final void a(Class_r class_r, int i) {
	bea.i++;
	if (((Animable) up.thisPlayer).height != dg.Cb) {
	    if (i <= 4)
		a((Class_r) null, 124);
	    if (ol.p != null) {
		if (cp.a(((Animable) up.thisPlayer).height, 104, class_r))
		    dg.Cb = ((Animable) up.thisPlayer).height;
	    }
	}
    }
    
    public static void a(int i) {
	h = null;
	if (i > -82)
	    b(-17, 75);
    }
    
    final void b(int i) {
	if (i == 25313) {
	    g++;
	    synchronized (k) {
		k.c((byte) 106);
	    }
	    synchronized (((bea) this).l) {
		((bea) this).l.c((byte) 35);
	    }
	}
    }
    
    final void c(int i, int i_2_) {
	((bea) this).m = i_2_;
	a++;
	synchronized (((bea) this).l) {
	    ((bea) this).l.a(18385);
	    if (i != -12336)
		b(50);
	}
    }
    
    final iv a(byte i, int i_3_) {
	f++;
	iv var_iv;
	synchronized (k) {
	    var_iv = (iv) k.get((long) i_3_, (byte) 100);
	}
	if (i != 12)
	    k = null;
	if (var_iv != null)
	    return var_iv;
	byte[] is;
	synchronized (j) {
	    is = j.b(Class_ob.b(i_3_, i ^ 0xc), i ^ ~0x71, qg.a(i_3_, 7836));
	}
	var_iv = new iv();
	((iv) var_iv).k = this;
	((iv) var_iv).e = i_3_;
	if (is != null)
	    var_iv.a(3, new BytesParser(is));
	synchronized (k) {
	    k.put((long) i_3_, var_iv, 1);
	}
	return var_iv;
    }
    
    final void a(byte i) {
	c++;
	synchronized (k) {
	    if (i != -115)
		a((Class_r) null, -66);
	    k.a(i ^ ~0x47a3);
	}
	synchronized (((bea) this).l) {
	    ((bea) this).l.a(18385);
	}
    }
    
    bea(Class_rf class_rf, int i, pl var_pl, pl var_pl_4_) {
	j = var_pl;
	((bea) this).b = var_pl_4_;
	int i_5_ = j.a((byte) -107) - 1;
	j.a(i_5_, true);
    }
}
