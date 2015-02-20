/* hl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hl
{
    static int a;
    static int b;
    private pl c;
    static int d;
    static int e;
    static int f;
    private tb g = new tb(64);
    static int h;
    static int i;
    static int affId = 0;
    static int k;
    private tb l = new tb(100);
    
    final void a(byte i) {
	if (i > -108)
	    a((byte) 81);
	d++;
	synchronized (g) {
	    g.c((byte) -126);
	}
	synchronized (l) {
	    l.c((byte) -24);
	}
    }
    
    final void a(int i, int i_0_) {
	k++;
	synchronized (g) {
	    g.a(true, i_0_);
	}
	synchronized (l) {
	    int i_1_ = 4 / ((i + 59) / 34);
	    l.a(true, i_0_);
	}
    }
    
    final void a(boolean bool) {
	e++;
	synchronized (g) {
	    g.a(18385);
	}
	synchronized (l) {
	    if (bool != true)
		b(-73, 67);
	    l.a(18385);
	}
    }
    
    static final int a(String string, boolean bool) {
	f++;
	int i = string.length();
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i; i_3_++)
	    i_2_ = (i_2_ << 5) - i_2_ + string.charAt(i_3_);
	if (bool != false)
	    a(null, false);
	return i_2_;
    }
    
    final wa b(int i, int i_4_) {
	h++;
	wa var_wa;
	synchronized (l) {
	    var_wa = (wa) l.get((long) i, (byte) 100);
	    int i_5_ = 7 % ((i_4_ + 28) / 58);
	    if (var_wa == null) {
		var_wa = new wa(i);
		l.put((long) i, var_wa, 1);
	    }
	    if (!var_wa.a(true))
		return null;
	}
	return var_wa;
    }
    
    final dr c(int i, int i_6_) {
	b++;
	if (i != 64)
	    return null;
	dr var_dr;
	synchronized (g) {
	    var_dr = (dr) g.get((long) i_6_, (byte) 100);
	}
	if (var_dr != null)
	    return var_dr;
	byte[] is;
	synchronized (c) {
	    is = c.b(ufa.a(-78, i_6_), i ^ ~0x2e, client.a(i_6_, (byte) 114));
	}
	var_dr = new dr();
	((dr) var_dr).c = i_6_;
	((dr) var_dr).r = this;
	if (is != null)
	    var_dr.a(i + 6, new BytesParser(is));
	var_dr.a(i - 62);
	synchronized (g) {
	    g.put((long) i_6_, var_dr, i ^ 0x41);
	}
	return var_dr;
    }
    
    static final void a(BytesParser var_es, int i) {
	for (int i_7_ = 0; i_7_ < pga.d; i_7_++) {
	    int i_8_ = var_es.readSmart2(-13829);
	    int i_9_ = var_es.readShort(13111);
	    if (i_9_ == 65535)
		i_9_ = -1;
	    if (nk.i[i_8_] != null)
		((he) nk.i[i_8_]).a = i_9_;
	}
	if (i != 6130)
	    a((BytesParser) null, -64);
	hl.i++;
    }
    
    hl(Class_rf class_rf, int i, pl var_pl, pl var_pl_10_, pl var_pl_11_) {
	c = var_pl;
	if (c != null) {
	    int i_12_ = c.a((byte) -107) - 1;
	    c.a(i_12_, true);
	}
	ok.a(var_pl_11_, var_pl_10_, 2, 21);
    }
}
