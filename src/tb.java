/* tb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tb
{
    static boolean a = false;
    static int b;
    private il c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    private int i;
    static qfa j = new qfa("", 14);
    static int k;
    static int l;
    static int m;
    static int n;
    private int o;
    static int p;
    private je q = new je();
    static int r;
    static int s;
    static int t;
    static int u = 1;
    static int v;
    
    final int a(byte i) {
	b++;
	int i_0_ = 0;
	sp var_sp = (sp) q.d((byte) -72);
	if (i < 27)
	    a = true;
	for (/**/; var_sp != null; var_sp = (sp) q.a(1252027233)) {
	    if (!var_sp.a((int) -116))
		i_0_++;
	}
	return i_0_;
    }
    
    static final ar a(byte i, qj var_qj, int i_1_, int i_2_, int i_3_,
		      int i_4_) {
	k++;
	if (i != -87)
	    u = 4;
	if (!((qj) var_qj).pg
	    && (!ar.a(i_1_, (byte) 98) || !ar.a(i_3_, (byte) 98))) {
	    if (((qj) var_qj).vf)
		return new ar(var_qj, 34037, i_4_, i_2_, i_1_, i_3_, true);
	    return new ar(var_qj, i_4_, i_2_, i_1_, i_3_, dfa.a(i_1_, i + 215),
			  dfa.a(i_3_, i ^ ~0xd6), true);
	}
	return new ar(var_qj, 3553, i_4_, i_2_, i_1_, i_3_, true);
    }
    
    final void a(int i) {
	if (i != 18385)
	    u = -32;
	q.c(1252027233);
	p++;
	c.a(true);
	o = this.i;
    }
    
    public static void b(byte i) {
	j = null;
	if (i < 109)
	    u = 28;
    }
    
    final int b(int i) {
	if (i > -78)
	    b((int) 68);
	g++;
	return this.i;
    }
    
    final void put(long l, Object object, int i) {
		put((byte) -124, i, l, object);
		n++;
    }
    
    final Object a(boolean bool) {
	r++;
	sp var_sp = (sp) c.b((byte) 124);
	if (bool != true)
	    return null;
	while (var_sp != null) {
	    Object object = var_sp.i(-1);
	    if (object == null) {
		sp var_sp_5_ = var_sp;
		var_sp = (sp) c.b(12561);
		var_sp_5_.unlink(-12);
		var_sp_5_.a((byte) -103);
		o += ((sp) var_sp_5_).v;
	    } else
		return object;
	}
	return null;
    }
    
    final void a(boolean bool, int i) {
	if (bool != true)
	    c((byte) 123);
	s++;
	if (oe.c != null) {
	    for (sp var_sp = (sp) q.d((byte) -77); var_sp != null;
		 var_sp = (sp) q.a(1252027233)) {
		if (var_sp.a((int) -105)) {
		    if (var_sp.i(-1) == null) {
			var_sp.unlink(-80);
			var_sp.a((byte) -69);
			o++;
		    }
		} else if ((long) i < ++((pp) var_sp).l) {
		    sp var_sp_6_ = oe.c.a(18855, var_sp);
		    c.a(var_sp_6_, (byte) -55, ((Node) var_sp).nodeID);
		    te.a(var_sp, 2, var_sp_6_);
		    var_sp.unlink(-102);
		    var_sp.a((byte) -122);
		}
	    }
	}
    }
    
    final void c(byte i) {
	h++;
	sp var_sp = (sp) q.d((byte) -79);
	int i_7_ = -89 / ((-82 - i) / 36);
	for (/**/; var_sp != null; var_sp = (sp) q.a(1252027233)) {
	    if (var_sp.a((int) -85)) {
		var_sp.unlink(-97);
		var_sp.a((byte) -86);
		o += ((sp) var_sp).v;
	    }
	}
    }
    
    tb(int i) {
	this(i, i);
    }
    
    final int c(int i) {
	if (i < 47)
	    return 49;
	t++;
	return o;
    }
    
    static final void a(int i, int i_8_, byte i_9_, int i_10_) {
	if (i_9_ != 118)
	    j = null;
	d++;
	Class_mc class_mc = Class_qb.i[i][i_8_];
	qfa.a(i_10_, class_mc == null ? th.d : class_mc, -124);
    }
    
    final void put(byte i, int i_11_, long l, Object object) {
	tb.l++;
	if (this.i < i_11_)
	    throw new IllegalStateException("s>cs");
	a(34037, l);
	o -= i_11_;
	while (o < 0) {
	    sp var_sp = (sp) q.b(-21957);
	    a(var_sp, 5106);
	}
	li var_li = new li(object, i_11_);
	c.a(var_li, (byte) -76, l);
	q.a((int) 75, var_li);
	((pp) var_li).l = 0L;
	if (i >= -116)
	    a(1, -57L);
    }
    
    private final void a(sp var_sp, int i) {
	e++;
	if (i == 5106) {
	    if (var_sp != null) {
		var_sp.unlink(i - 5187);
		var_sp.a((byte) -63);
		o += ((sp) var_sp).v;
	    }
	}
    }
    
    final Object d(int i) {
	m++;
	if (i != -26973)
	    c((byte) -21);
	sp var_sp = (sp) c.b(12561);
	while (var_sp != null) {
	    Object object = var_sp.i(-1);
	    if (object != null)
		return object;
	    sp var_sp_12_ = var_sp;
	    var_sp = (sp) c.b(12561);
	    var_sp_12_.unlink(-91);
	    var_sp_12_.a((byte) -101);
	    o += ((sp) var_sp_12_).v;
	}
	return null;
    }
    
    final Object get(long index, byte dummy) {
	f++;
	if (dummy != 100)
	    return null;
	sp var_sp = (sp) c.a(dummy - 32848, index);
	if (var_sp == null)
	    return null;
	Object object = var_sp.i(dummy ^ ~0x64);
	if (object == null) {
	    var_sp.unlink(dummy ^ ~0x79);
	    var_sp.a((byte) -59);
	    o += ((sp) var_sp).v;
	    return null;
	}
	if (!var_sp.a((int) -101)) {
	    q.a((int) 75, var_sp);
	    ((pp) var_sp).l = 0L;
	} else {
	    li var_li = new li(object, ((sp) var_sp).v);
	    c.a(var_li, (byte) -101, ((Node) var_sp).nodeID);
	    q.a((int) 75, var_li);
	    ((pp) var_li).l = 0L;
	    var_sp.unlink(dummy ^ ~0x6);
	    var_sp.a((byte) -85);
	}
	return object;
    }
    
    private final void a(int i, long l) {
	v++;
	sp var_sp = (sp) c.a(-32748, l);
	if (i != 34037)
	    q = null;
	a(var_sp, 5106);
    }
    
    tb(int i, int i_13_) {
	this.i = i;
	o = i;
	int i_14_;
	for (i_14_ = 1; i > i_14_ + i_14_ && i_13_ > i_14_; i_14_ += i_14_) {
	    /* empty */
	}
	c = new il(i_14_);
    }
}
