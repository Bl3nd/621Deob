/* sj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sj
{
    static int a;
    static int b;
    private pl c;
    static boolean d = false;
    pl e;
    static int f;
    static int g;
    static int h;
    private tb i = new tb(64);
    static GameInPacket incomingPacket29 = new GameInPacket(29, 6);
    tb k = new tb(64);
    static int l;
    static GameInPacket incomingPacket85;
    static int n;
    static int o;
    static boolean p = true;
    static GameOutPacket q;
    static int r;
    
    static final boolean a(int i, int i_0_, int i_1_) {
	if (i_0_ != 85)
	    a(false);
	o++;
	if (!((0x40000 & i) != 0 | WorldSub.a(i, i_1_, (byte) 36))
	    && !jv.a(i_0_ - 82, i, i_1_))
	    return false;
	return true;
    }
    
    final void a(int i) {
	synchronized (this.i) {
	    if (i != -1)
		a(false);
	    this.i.c((byte) 42);
	}
	g++;
	synchronized (((sj) this).k) {
	    ((sj) this).k.c((byte) 5);
	}
    }
    
    final void b(int i) {
	if (i >= -84)
	    a(-54, (int) -5);
	synchronized (this.i) {
	    this.i.a(18385);
	}
	h++;
	synchronized (((sj) this).k) {
	    ((sj) this).k.a(18385);
	}
    }
    
    final wi a(int i, byte i_2_) {
	l++;
	wi var_wi;
	synchronized (this.i) {
	    var_wi = (wi) this.i.get((long) i, (byte) 100);
	}
	if (var_wi != null)
	    return var_wi;
	byte[] is;
	synchronized (c) {
	    is = c.b(i, -127, 34);
	}
	var_wi = new wi();
	((wi) var_wi).j = this;
	if (is != null)
	    var_wi.a(new BytesParser(is), -1);
	synchronized (this.i) {
	    this.i.put((long) i, var_wi, 1);
	}
	if (i_2_ <= 7)
	    return null;
	return var_wi;
    }
    
    static final void a(boolean bool) {
	b++;
	if (hk.loginStage == 6) {
	    hk.loginStage = 7;
	    if (bool != false)
		a(false);
	}
    }
    
    final void a(int i, int i_3_, boolean bool) {
	if (bool == false) {
	    this.i = new tb(i);
	    n++;
	    ((sj) this).k = new tb(i_3_);
	}
    }
    
    final void a(int i, int i_4_) {
	synchronized (this.i) {
	    this.i.a(true, i_4_);
	}
	if (i == 29) {
	    f++;
	    synchronized (((sj) this).k) {
		((sj) this).k.a(true, i_4_);
	    }
	}
    }
    
    public static void c(int i) {
	q = null;
	incomingPacket85 = null;
	incomingPacket29 = null;
	if (i != 29)
	    incomingPacket85 = null;
    }
    
    sj(Class_rf class_rf, int i, pl var_pl, pl var_pl_5_) {
	((sj) this).e = var_pl_5_;
	c = var_pl;
	c.a(34, true);
    }
    
    static {
	incomingPacket85 = new GameInPacket(85, 28);
	q = new GameOutPacket(50, 3);
	r = 0;
    }
}
