/* id - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class id
{
    static int a;
    static boolean b = false;
    private int[] c;
    static int d;
    static int e;
    static int f;
    static int g = 0;
    static int h;
    static int i;
    static pl j;
    
    static final void a(int i, int i_0_, int i_1_, boolean bool, int i_2_,
			byte[] is) {
	f++;
	if (i > i_2_) {
	    i_0_ = i - i_2_ >> 2;
	    i_1_ += i_2_;
	    if (bool != true)
		j = null;
	    while (--i_0_ >= 0) {
		is[i_1_++] = (byte) 1;
		is[i_1_++] = (byte) 1;
		is[i_1_++] = (byte) 1;
		is[i_1_++] = (byte) 1;
	    }
	    i_0_ = i - i_2_ & 0x3;
	    while (--i_0_ >= 0)
		is[i_1_++] = (byte) 1;
	}
    }
    
    final int a(int i, int i_3_) {
	e++;
	if (i_3_ <= 98)
	    a(-114, -80, 126, false, -2, null);
	int i_4_ = (c.length >> 1) - 1;
	int i_5_ = i & i_4_;
	for (;;) {
	    int i_6_ = c[i_5_ + i_5_ + 1];
	    if (i_6_ == -1)
		return -1;
	    if (i == c[i_5_ + i_5_])
		return i_6_;
	    i_5_ = i_4_ & i_5_ + 1;
	}
    }
    
    id(int[] is) {
	int i;
	for (i = 1; is.length + (is.length >> 1) >= i; i <<= 1) {
	    /* empty */
	}
	c = new int[i + i];
	for (int i_7_ = 0; i_7_ < i + i; i_7_++)
	    c[i_7_] = -1;
	for (int i_8_ = 0; is.length > i_8_; i_8_++) {
	    int i_9_;
	    for (i_9_ = is[i_8_] & i - 1; c[i_9_ + i_9_ + 1] != -1;
		 i_9_ = i - 1 & i_9_ + 1) {
		/* empty */
	    }
	    c[i_9_ + i_9_] = is[i_8_];
	    c[i_9_ + (i_9_ + 1)] = i_8_;
	}
    }
    
    static final void a(int i) {
	Class_eb.p.a(-4, (int) 5);
	d++;
	Class_ef.G.a(true, 5);
	Class_ae.n.b((byte) -80, 5);
	ul.k.a((int) 5, (byte) 111);
	jm.p.b(116, 5);
	laa.itemDefLoader.b(5, 50);
	Class_ef.J.a(-106, 5);
	Class_ic.H.a((int) 5, 29206);
	bw.t.a((int) 5, (byte) 75);
	fj.t.a(0, 5);
	hs.f.b(5, (byte) 57);
	hq.a.a((byte) 123, (int) 5);
	gda.d.a(29, (int) 5);
	jba.b.a((int) 118, 5);
	GameInPacket.d.a((byte) -77, 5);
	hi.u.a((byte) -54, 5);
	int i_10_ = 42 % ((i - 35) / 41);
	ps.a.a(5, (byte) 49);
	lr.k.a(-18944, 5);
	fu.e.a(0, (int) 5);
	aw.m.a(5, false);
	fu.a(0, (int) 5);
	Class_i.a(50, (byte) 70);
	tn.a(50, (byte) -89);
	al.a(0, 5);
	qaa.b(5, 100);
	mga.o.a(true, 5);
	gba.t.a(true, 5);
	br.k.a(true, 5);
	wa.C.a(true, 5);
	ClientScriptHandler.tb_.a(true, 5);
    }
    
    static final byte[] a(int i, byte i_11_, int i_12_, Object object) {
	id.i++;
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return dj.a(-1047, is, i, i_12_);
	}
	if (object instanceof ko) {
	    ko var_ko = (ko) object;
	    return var_ko.a((byte) -112, i, i_12_);
	}
	if (i_11_ != 121)
	    a(127, (byte) -10, -51, null);
	throw new IllegalArgumentException();
    }
    
    public static void a(byte i) {
	j = null;
	int i_13_ = 3 % ((i + 44) / 61);
    }
    
    static final void a(int i, int i_14_, int i_15_, int i_16_, byte i_17_) {
	int i_18_ = -2 % ((i_17_ + 46) / 60);
	if (i - i_16_ < vaa.xb || i_16_ + i > jga.v
	    || Class_md.h > i_14_ - i_16_ || Class_db.o < i_16_ + i_14_)
	    no.a((byte) 82, i_16_, i_14_, i, i_15_);
	else
	    Class_u.a(i_16_, i_14_, i_15_, i, 0);
	h++;
    }
    
    static final void a(boolean bool, int i, int i_19_) {
	a++;
	qba var_qba = ofa.a(16, i, (byte) -105);
	var_qba.c((byte) 11);
	if (bool == true)
	    ((qba) var_qba).v = i_19_;
    }
}
