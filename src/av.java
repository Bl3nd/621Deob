/* av - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class av
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static cg g = new cg();
    private pl h;
    private tb i = new tb(256);
    static boolean j = false;
    static int k;
    static pl l;
    static cba m;
    
    static final boolean a(int i, int i_0_, int i_1_) {
	if (i_1_ != 1)
	    a(107, -16, false, null, null);
	f++;
	if (!eba.a((byte) 106, i_0_, i) && !nf.a(1, i, i_0_))
	    return false;
	return true;
    }
    
    final bh a(int i, int i_2_) {
	e++;
	bh var_bh;
	synchronized (this.i) {
	    var_bh = (bh) this.i.get((long) i, (byte) 100);
	}
	if (var_bh != null)
	    return var_bh;
	if (i_2_ != 17796)
	    this.i = null;
	byte[] is;
	synchronized (h) {
	    is = h.b(i, 54, 26);
	}
	var_bh = new bh();
	if (is != null)
	    var_bh.a(new BytesParser(is), 13);
	synchronized (this.i) {
	    this.i.put((long) i, var_bh, 1);
	}
	return var_bh;
    }
    
    final void a(int i, boolean bool) {
	b++;
	synchronized (this.i) {
	    if (bool != false)
		g = null;
	    this.i.a(!bool, i);
	}
    }
    
    public static void a(int i) {
	if (i < 116)
	    a(-3, 52, false, null, null);
	m = null;
	l = null;
	g = null;
    }
    
    static final int a(int i, int i_3_, boolean bool, WorldSub var_iw,
		       WorldSub var_iw_4_) {
	c++;
	if (i_3_ == 1) {
	    int i_5_ = ((he) var_iw).a;
	    int i_6_ = ((he) var_iw_4_).a;
	    if (!bool) {
		if ((i_5_ ^ 0xffffffff) == 0)
		    i_5_ = 2001;
		if (i_6_ == -1)
		    i_6_ = 2001;
	    }
	    return i_5_ - i_6_;
	}
	if (i_3_ == 2)
	    return pg.a(cba.languageID, ((sw) var_iw_4_.d((byte) 125)).c,
			((sw) var_iw.d((byte) 121)).c, -125);
	if (i_3_ == 3) {
	    if (((WorldSub) var_iw).activity.equals("-")) {
		if (((WorldSub) var_iw_4_).activity.equals("-"))
		    return 0;
		if (!bool)
		    return 1;
		return -1;
	    }
	    if (((WorldSub) var_iw_4_).activity.equals("-")) {
		if (bool)
		    return 1;
		return -1;
	    }
	    return pg.a(cba.languageID, ((WorldSub) var_iw_4_).activity, ((WorldSub) var_iw).activity, -104);
	}
	if (i_3_ == 4) {
	    if (var_iw.b(i + 62085)) {
		if (var_iw_4_.b(i ^ ~0xd78))
		    return 0;
		return 1;
	    }
	    if (var_iw_4_.b(29342))
		return -1;
	    return 0;
	}
	if (i_3_ == 5) {
	    if (var_iw.a((int) 2)) {
		if (!var_iw_4_.a((int) 2))
		    return 1;
		return 0;
	    }
	    if (var_iw_4_.a((int) 2))
		return -1;
	    return 0;
	}
	if (i_3_ == 6) {
	    if (!var_iw.b((byte) -105)) {
		if (!var_iw_4_.b((byte) -126))
		    return 0;
		return -1;
	    }
	    if (var_iw_4_.b((byte) -102))
		return 0;
	    return 1;
	}
	if (i != -32743)
	    l = null;
	if (i_3_ == 7) {
	    if (var_iw.a((byte) 90)) {
		if (var_iw_4_.a((byte) 40))
		    return 0;
		return 1;
	    }
	    if (!var_iw_4_.a((byte) 91))
		return 0;
	    return -1;
	}
	if (i_3_ == 8) {
	    int i_7_ = ((WorldSub) var_iw).l;
	    int i_8_ = ((WorldSub) var_iw_4_).l;
	    if (!bool) {
		if ((i_8_ ^ 0xffffffff) == 0)
		    i_8_ = 1000;
		if ((i_7_ ^ 0xffffffff) == 0)
		    i_7_ = 1000;
	    } else {
		if (i_8_ == 1000)
		    i_8_ = -1;
		if (i_7_ == 1000)
		    i_7_ = -1;
	    }
	    return i_7_ - i_8_;
	}
	return ((WorldSub) var_iw).worldID - ((WorldSub) var_iw_4_).worldID;
    }
    
    final void a(byte i) {
	if (i >= 101) {
	    synchronized (this.i) {
		this.i.c((byte) -21);
	    }
	    k++;
	}
    }
    
    final void b(int i) {
	a++;
	synchronized (this.i) {
	    this.i.a(18385);
	    if (i != 1)
		a((int) -65);
	}
    }
    
    av(Class_rf class_rf, int i, pl var_pl) {
	h = var_pl;
	h.a(26, true);
    }
}
