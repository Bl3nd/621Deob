/* qs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qs implements ica
{
    static int a = 0;
    private js b;
    static int c;
    static int d;
    static int e;
    static int f;
    private Class_is g;
    static pl h;
    static int i;
    
    public static void b(int i) {
	if (i <= -121)
	    h = null;
    }
    
    public final void a(boolean bool, int i) {
	f++;
	cfa var_cfa = g.a(((js) b).c, -1);
	if (i != 6621)
	    h = null;
	if (var_cfa != null) {
	    int i_0_ = ((js) b).l.a(baa.d, ((js) b).r, 2) + ((js) b).a;
	    int i_1_ = ((js) b).i.a(Class_vb.r, ((js) b).d, -84) + ((js) b).m;
	    if (((js) b).e)
		lg.r.c(i_0_, i_1_, ((js) b).r, ((js) b).d, ((js) b).g, 0);
	    i_1_ += a(i_0_, pv.j, i_1_, 5, ((cfa) var_cfa).c, false) * 12;
	    i_1_ += 8;
	    if (((js) b).e)
		lg.r.a(i_0_, i_1_, ((js) b).r + i_0_ - 1, i_1_, ((js) b).g, 0);
	    i_1_ = ++i_1_ + 12 * a(i_0_, pv.j, i_1_, 5, ((cfa) var_cfa).f,
				   false);
	    i_1_ += 5;
	    i_1_ += a(i_0_, pv.j, i_1_, 5, ((cfa) var_cfa).e, false) * 12;
	}
    }
    
    static final void a(Class_r class_r, int i) {
	if (i != 5)
	    a((Class_r) null, 78);
	e++;
	for (tq var_tq = (tq) tfa.w.b((byte) 120); var_tq != null;
	     var_tq = (tq) tfa.w.a((byte) -106)) {
	    if (((tq) var_tq).s)
		var_tq.a(class_r);
	}
    }
    
    public final void a(int i) {
	if (i > -41)
	    a = -115;
	c++;
    }
    
    public final boolean a(byte i) {
	d++;
	if (i != 82)
	    return true;
	return g.a((byte) 116);
    }
    
    qs(Class_is class_is, js var_js) {
	b = var_js;
	g = class_is;
    }
    
    private final int a(int i, la var_la, int i_2_, int i_3_, String string,
			boolean bool) {
	qs.i++;
	if (bool != false)
	    g = null;
	return var_la.a(((js) b).q, 0, null, ((js) b).r - 2 * i_3_, string,
			((js) b).f, 0, -79, 0, ((js) b).d - i_3_ * 2, null,
			null, 0, 0, i_2_ + i_3_, i + i_3_);
    }
}
