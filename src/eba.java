/* eba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eba extends pn
{
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    Class_ae w = new Class_ae();
    static int x;
    private dt y;
    static int z;
    static int A;
    ch B = new ch();
    
    final void b(int[] is, int i, int i_0_) {
	t++;
	((eba) this).B.b(is, i, i_0_);
    while_32_:
	for (Class_hb class_hb = (Class_hb) ((eba) this).w.a((int) 101);
	     class_hb != null;
	     class_hb = (Class_hb) ((eba) this).w.b((byte) 65)) {
	    if (!y.a((byte) 84, class_hb)) {
		int i_1_ = i_0_;
		int i_2_ = i;
		while (i_1_ > ((Class_hb) class_hb).p) {
		    a(is, class_hb, i_1_ + i_2_, ((Class_hb) class_hb).p, i_2_,
		      0);
		    i_1_ -= ((Class_hb) class_hb).p;
		    i_2_ += ((Class_hb) class_hb).p;
		    if (y.a(is, class_hb, i_2_, i_1_, -1908521944))
			continue while_32_;
		}
		a(is, class_hb, i_2_ + i_1_, i_1_, i_2_, 0);
		((Class_hb) class_hb).p -= i_1_;
	    }
	}
    }
    
    final int d() {
	r++;
	return 0;
    }
    
    private final void a(int i, byte i_3_, Class_hb class_hb) {
	if ((((dt) y).O[((Class_hb) class_hb).m] & 0x4) != 0
	    && ((Class_hb) class_hb).E < 0) {
	    int i_4_ = ((dt) y).K[((Class_hb) class_hb).m] / gba.G;
	    int i_5_ = (i_4_ - ((Class_hb) class_hb).u + 1048575) / i_4_;
	    ((Class_hb) class_hb).u
		= 0xfffff & i_4_ * i + ((Class_hb) class_hb).u;
	    if (i_5_ <= i) {
		if (((dt) y).jb[((Class_hb) class_hb).m] != 0) {
		    ((Class_hb) class_hb).H
			= hw.a(((Class_hb) class_hb).q,
			       ((Class_hb) class_hb).H.g(), 0,
			       ((Class_hb) class_hb).H.e());
		    y.a(8, class_hb, (((ul) ((Class_hb) class_hb).o).u
				      [((Class_hb) class_hb).A]) < 0);
		} else
		    ((Class_hb) class_hb).H
			= hw.a(((Class_hb) class_hb).q,
			       ((Class_hb) class_hb).H.g(),
			       ((Class_hb) class_hb).H.i(),
			       ((Class_hb) class_hb).H.e());
		if (((ul) ((Class_hb) class_hb).o).u[((Class_hb) class_hb).A]
		    < 0)
		    ((Class_hb) class_hb).H.l(-1);
		i = ((Class_hb) class_hb).u / i_4_;
	    }
	}
	p++;
	if (i_3_ < 38)
	    ((eba) this).B = null;
	((Class_hb) class_hb).H.a(i);
    }
    
    static final boolean a(byte i, int i_6_, int i_7_) {
	if (i < 23)
	    return true;
	o++;
	return false;
    }
    
    static final void a(int i, int i_8_, int i_9_, int i_10_) {
	i_8_ = i_8_ * ((jb) cs.g).N >> 8;
	u++;
	if (i_8_ != 0 && i_10_ != -1) {
	    Class_b.a(false, 0, i_8_, ml.i, (byte) -12, i_10_);
	    Class_jc.ib = true;
	}
	if (i == 6567) {
	    /* empty */
	}
    }
    
    final pn a() {
	v++;
	Class_hb class_hb = (Class_hb) ((eba) this).w.a((int) 118);
	if (class_hb == null)
	    return null;
	if (((Class_hb) class_hb).H != null)
	    return ((Class_hb) class_hb).H;
	return b();
    }
    
    final void a(int i) {
	A++;
	((eba) this).B.a(i);
    while_34_:
	for (Class_hb class_hb = (Class_hb) ((eba) this).w.a((int) 115);
	     class_hb != null;
	     class_hb = (Class_hb) ((eba) this).w.b((byte) 70)) {
	    if (!y.a((byte) 84, class_hb)) {
		int i_11_ = i;
		while (((Class_hb) class_hb).p < i_11_) {
		    a(((Class_hb) class_hb).p, (byte) 122, class_hb);
		    i_11_ -= ((Class_hb) class_hb).p;
		    if (y.a(null, class_hb, 0, i_11_, -1908521944))
			continue while_34_;
		}
		a(i_11_, (byte) 61, class_hb);
		((Class_hb) class_hb).p -= i_11_;
	    }
	}
    }
    
    static final boolean a(boolean bool, int[] is, int i, int i_12_, int i_13_,
			   int i_14_, int i_15_, int i_16_) {
	if (dn.c < i_13_)
	    i_13_ = dn.c;
	q++;
	if (i_15_ < 0)
	    i_15_ = 0;
	if (i_15_ >= i_13_)
	    return true;
	i_14_ += i_15_ * i;
	i_16_ = i_13_ - i_15_ >> 2;
	i_12_ += i_15_ - 1;
	if (nq.p != 1) {
	    i_14_ -= 15360;
	    while (--i_16_ >= 0) {
		if (is[++i_12_] > i_14_)
		    return false;
		i_14_ += i;
		if (is[++i_12_] > i_14_)
		    return false;
		i_14_ += i;
		if (i_14_ < is[++i_12_])
		    return false;
		i_14_ += i;
		if (i_14_ < is[++i_12_])
		    return false;
		i_14_ += i;
	    }
	    i_16_ = 0x3 & i_13_ - i_15_;
	    while (--i_16_ >= 0) {
		if (is[++i_12_] > i_14_)
		    return false;
		i_14_ += i;
	    }
	} else {
	    io.X += i_16_;
	    while (--i_16_ >= 0) {
		if (is[++i_12_] > i_14_)
		    is[i_12_] = i_14_;
		i_14_ += i;
		if (i_14_ < is[++i_12_])
		    is[i_12_] = i_14_;
		i_14_ += i;
		if (is[++i_12_] > i_14_)
		    is[i_12_] = i_14_;
		i_14_ += i;
		if (is[++i_12_] > i_14_)
		    is[i_12_] = i_14_;
		i_14_ += i;
	    }
	    i_16_ = i_13_ - i_15_ & 0x3;
	    while (--i_16_ >= 0) {
		if (i_14_ < is[++i_12_])
		    is[i_12_] = i_14_;
		i_14_ += i;
	    }
	}
	if (bool != true)
	    return false;
	return true;
    }
    
    static final void a(int i, int i_17_) {
	if (i != -1)
	    a(22, 76);
	z++;
	qba var_qba = ofa.a(4, i_17_, (byte) 118);
	var_qba.i(0);
    }
    
    private final void a(int[] is, Class_hb class_hb, int i, int i_18_,
			 int i_19_, int i_20_) {
	if ((0x4 & ((dt) y).O[((Class_hb) class_hb).m]) != 0
	    && ((Class_hb) class_hb).E < 0) {
	    int i_21_ = ((dt) y).K[((Class_hb) class_hb).m] / gba.G;
	    for (;;) {
		int i_22_
		    = (i_21_ + (1048575 - ((Class_hb) class_hb).u)) / i_21_;
		if (i_18_ < i_22_)
		    break;
		((Class_hb) class_hb).H.b(is, i_19_, i_22_);
		((Class_hb) class_hb).u += i_21_ * i_22_ - 1048576;
		i_19_ += i_22_;
		i_18_ -= i_22_;
		int i_23_ = gba.G / 100;
		int i_24_ = 262144 / i_21_;
		if (i_23_ > i_24_)
		    i_23_ = i_24_;
		hw var_hw = ((Class_hb) class_hb).H;
		if (((dt) y).jb[((Class_hb) class_hb).m] != 0) {
		    ((Class_hb) class_hb).H = hw.a(((Class_hb) class_hb).q,
						   var_hw.g(), 0, var_hw.e());
		    y.a(8, class_hb, (((ul) ((Class_hb) class_hb).o).u
				      [((Class_hb) class_hb).A]) < 0);
		    ((Class_hb) class_hb).H.a(i_23_, var_hw.i());
		} else
		    ((Class_hb) class_hb).H
			= hw.a(((Class_hb) class_hb).q, var_hw.g(), var_hw.i(),
			       var_hw.e());
		if (((ul) ((Class_hb) class_hb).o).u[((Class_hb) class_hb).A]
		    < 0)
		    ((Class_hb) class_hb).H.l(-1);
		var_hw.k(i_23_);
		var_hw.b(is, i_19_, i - i_19_);
		if (var_hw.l())
		    ((eba) this).B.b(var_hw);
	    }
	    ((Class_hb) class_hb).u += i_21_ * i_18_;
	}
	s++;
	((Class_hb) class_hb).H.b(is, i_19_, i_18_);
	if (i_20_ != 0)
	    a((byte) 54, -2, -37);
    }
    
    final pn b() {
	x++;
	Class_hb class_hb;
	do {
	    class_hb = (Class_hb) ((eba) this).w.b((byte) 81);
	    if (class_hb == null)
		return null;
	} while (((Class_hb) class_hb).H == null);
	return ((Class_hb) class_hb).H;
    }
    
    eba(dt var_dt) {
	y = var_dt;
    }
}
