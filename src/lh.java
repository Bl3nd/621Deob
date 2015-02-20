/* lh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lh
{
    private pp a = new pp();
    static int b;
    static int c;
    private je d = new je();
    private int e;
    private int f;
    static GameInPacket g = new GameInPacket(39, 12);
    private il h;
    static int i;
    static int j;
    static f[] k;
    static int[] l = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    static int m;
    
    public static void a(byte i) {
	k = null;
	if (i == -67) {
	    l = null;
	    g = null;
	}
    }
    
    static final void a(int i, byte i_0_) {
	j++;
	fba.O = i;
	synchronized (Class_ad.k) {
	    Class_ad.k.a(18385);
	}
	if (i_0_ < 8)
	    a((int) -95);
	synchronized (bd.j) {
	    bd.j.a(18385);
	}
    }
    
    final void a(pp var_pp, boolean bool, long l) {
	m++;
	if (f != 0)
	    f--;
	else {
	    pp var_pp_1_ = d.b(-21957);
	    var_pp_1_.unlink(-51);
	    var_pp_1_.a((byte) -79);
	    if (var_pp_1_ == a) {
		var_pp_1_ = d.b(-21957);
		var_pp_1_.unlink(-81);
		var_pp_1_.a((byte) -105);
	    }
	}
	h.a(var_pp, (byte) -90, l);
	if (bool != false)
	    d = null;
	d.a((int) 75, var_pp);
    }
    
    static final void a(int i) {
	c++;
	aa.o = new Interface[Class_fc.a.a((byte) -107)][];
	mv.b = new Interface[Class_fc.a.a((byte) -107)][];
	pu.p = new boolean[Class_fc.a.a((byte) -107)];
	if (i != 1)
	    a(112, -42, 108);
    }
    
    static final vf a(int i, int i_2_, int i_3_) {
	if (ol.p[i][i_2_][i_3_] == null) {
	    boolean bool = (ol.p[0][i_2_][i_3_] != null
			    && ((vf) ol.p[0][i_2_][i_3_]).e != null);
	    if (bool && i >= dfa.G - 1)
		return null;
	    oga.a(i, i_2_, i_3_);
	}
	return ol.p[i][i_2_][i_3_];
    }
    
    final pp a(byte i, long l) {
	int i_4_ = 101 % ((i - 41) / 38);
	b++;
	pp var_pp = (pp) h.a(-32748, l);
	if (var_pp != null)
	    d.a((int) 75, var_pp);
	return var_pp;
    }
    
    final void b(byte i) {
	d.c(1252027233);
	if (i != 69)
	    e = 66;
	lh.i++;
	h.a(true);
	a = new pp();
	f = e;
    }
    
    lh(int i) {
	e = i;
	f = i;
	int i_5_;
	for (i_5_ = 1; i_5_ + i_5_ < i; i_5_ += i_5_) {
	    /* empty */
	}
	h = new il(i_5_);
    }
}
