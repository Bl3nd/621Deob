/* sda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sda
{
    static int a;
    static int b;
    private tb c = new tb(256);
    static int d;
    private en e;
    static int f;
    static int g;
    static int h;
    static int i;
    private fa j;
    static int k;
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, boolean bool) {
	a++;
	int i_5_ = sl.a(i_4_, 4095, Class_md.h, Class_db.o);
	int i_6_ = sl.a(i_2_, 4095, Class_md.h, Class_db.o);
	int i_7_ = sl.a(i, 4095, vaa.xb, jga.v);
	int i_8_ = sl.a(i_0_, 4095, vaa.xb, jga.v);
	int i_9_ = sl.a(i_3_ + i_4_, 4095, Class_md.h, Class_db.o);
	int i_10_ = sl.a(i_2_ - i_3_, 4095, Class_md.h, Class_db.o);
	for (int i_11_ = i_5_; i_11_ < i_9_; i_11_++)
	    kg.a(i_7_, wh.O[i_11_], i_1_, i_8_, 69);
	if (bool == true) {
	    for (int i_12_ = i_6_; i_10_ < i_12_; i_12_--)
		kg.a(i_7_, wh.O[i_12_], i_1_, i_8_, -119);
	    int i_13_ = sl.a(i_3_ + i, 4095, vaa.xb, jga.v);
	    int i_14_ = sl.a(i_0_ - i_3_, 4095, vaa.xb, jga.v);
	    for (int i_15_ = i_9_; i_10_ >= i_15_; i_15_++) {
		int[] is = wh.O[i_15_];
		kg.a(i_7_, is, i_1_, i_13_, 34);
		kg.a(i_14_, is, i_1_, i_8_, 18);
	    }
	}
    }
    
    static final boolean a(byte i, int i_16_, int i_17_) {
	g++;
	if (i <= 20)
	    return false;
	if ((i_17_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    final void a(int i) {
	c.a(true, 5);
	if (i <= 94)
	    a((int) -45, -109);
	d++;
    }
    
    final ls a(int i, int i_18_) {
	if (i_18_ != -23049)
	    b(-76);
	f++;
	Object object = c.get((long) i, (byte) 100);
	if (object != null)
	    return (ls) object;
	if (!j.a(false, i))
	    return null;
	vca var_vca = j.a(i, (byte) 86);
	int i_19_ = !((vca) var_vca).p ? ((en) e).ve : 64;
	ls var_ls;
	if (((vca) var_vca).t && e.z()) {
	    float[] fs = j.a(110, i_19_, false, 0.7F, i_19_, i);
	    var_ls = e.a(i_19_, fs, nda.h, ((vca) var_vca).g != 0, i_19_,
			 i_18_ + 23049);
	} else {
	    int[] is
		= (!((vca) var_vca).s && Class_jc.a(-30497, ((vca) var_vca).i)
		   ? j.a(i, 0.7F, true, i_19_, -5969, i_19_)
		   : j.a(0.7F, i_19_, (byte) 23, false, i_19_, i));
	    var_ls = e.a(i_19_, ((vca) var_vca).g != 0, i_19_, is, (byte) 70);
	}
	var_ls.a((byte) -81, ((vca) var_vca).r, ((vca) var_vca).m);
	c.put((long) i, var_ls, i_18_ ^ ~0x5a09);
	return var_ls;
    }
    
    static final void b(int i) {
	dv.a(lg.r, (long) pm.currentTimedTicks, 27063);
	k++;
	int i_20_ = -37 / ((i - 56) / 59);
	if (Class_vb.u != -1)
	    nj.a(-69, Class_vb.u);
	for (int i_21_ = 0; rba.m > i_21_; i_21_++) {
	    if (la.q[i_21_])
		cj.c[i_21_] = true;
	    sr.T[i_21_] = la.q[i_21_];
	    la.q[i_21_] = false;
	}
	rr.g = pm.currentTimedTicks;
	if ((Class_vb.u ^ 0xffffffff) != 0) {
	    rba.m = 0;
	    Player.m(16383);
	}
	lg.r.JA();
	ct.a(2, lg.r);
	int i_22_ = Class_mb.j(-3);
	if (i_22_ == -1)
	    i_22_ = da.e;
	if ((i_22_ ^ 0xffffffff) == 0)
	    i_22_ = Login.j;
	ah.b(true, i_22_);
	nq.x = 0;
    }
    
    final void c(int i) {
	if (i != 0)
	    c = null;
	c.a(18385);
	sda.i++;
    }
    
    static final String a(byte i, int i_23_) {
	if (i != 82)
	    return null;
	h++;
	return (String.valueOf(i_23_ >> 24 & 0xff) + "." + (0xff & i_23_ >> 16)
		+ "." + (i_23_ >> 8 & 0xff) + "." + (0xff & i_23_));
    }
    
    static final void d(int i) {
	for (ej var_ej = (ej) NPCDef.g.a(true); var_ej != null;
	     var_ej = (ej) NPCDef.g.a(true))
	    nk.a((byte) -45, var_ej);
	b++;
	int i_24_;
	int i_25_;
	if (!cs.g.e(on.performance, 111))
	    i_24_ = i_25_ = qca.E;
	else {
	    i_24_ = 0;
	    i_25_ = 3;
	}
	client.b();
	int i_26_ = i_24_;
	if (i != 255)
	    a((byte) 88, 75);
	for (/**/; i_25_ >= i_26_; i_26_++) {
	    client.a();
	    client.m(i_26_);
	    client.i(i_26_);
	}
	client.d();
	client.c();
    }
    
    sda(en var_en, fa var_fa) {
	e = var_en;
	j = var_fa;
    }
}
