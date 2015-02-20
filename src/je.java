/* je - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class je
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static au[] g;
    static int h;
    static int i = 0;
    static int j;
    static int k;
    static int l;
    static int m;
    private pp n = new pp();
    static int o;
    private pp p;
    static int q;
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
	f++;
	int i_5_ = 0;
	int i_6_ = i_2_;
	int i_7_ = i_3_ * i_3_;
	int i_8_ = i_2_ * i_2_;
	int i_9_ = i_8_ << 1;
	int i_10_ = i_7_ << 1;
	int i_11_ = i_2_ << 1;
	int i_12_ = i_9_ + i_7_ * (-i_11_ + 1);
	int i_13_ = i_8_ - (i_11_ - 1) * i_10_;
	int i_14_ = i_7_ << 2;
	int i_15_ = i_8_ << 2;
	int i_16_ = ((i_5_ << 1) + 3) * i_9_;
	int i_17_ = ((i_6_ << 1) + i_0_) * i_10_;
	int i_18_ = (i_5_ + 1) * i_15_;
	if (Class_md.h <= i_4_ && Class_db.o >= i_4_) {
	    int i_19_ = sl.a(i_3_ + i_1_, i_0_ ^ ~0xffd, vaa.xb, jga.v);
	    int i_20_ = sl.a(i_1_ - i_3_, 4095, vaa.xb, jga.v);
	    kg.a(i_20_, wh.O[i_4_], i, i_19_, 16);
	}
	int i_21_ = (i_6_ - 1) * i_14_;
	while (i_6_ > 0) {
	    if (i_12_ < 0) {
		while (i_12_ < 0) {
		    i_13_ += i_18_;
		    i_12_ += i_16_;
		    i_5_++;
		    i_18_ += i_15_;
		    i_16_ += i_15_;
		}
	    }
	    if (i_13_ < 0) {
		i_13_ += i_18_;
		i_12_ += i_16_;
		i_16_ += i_15_;
		i_5_++;
		i_18_ += i_15_;
	    }
	    i_12_ -= i_21_;
	    i_13_ -= i_17_;
	    i_6_--;
	    i_21_ -= i_14_;
	    i_17_ -= i_14_;
	    int i_22_ = i_4_ - i_6_;
	    int i_23_ = i_4_ + i_6_;
	    if (Class_md.h <= i_23_ && Class_db.o >= i_22_) {
		int i_24_ = sl.a(i_5_ + i_1_, 4095, vaa.xb, jga.v);
		int i_25_ = sl.a(i_1_ - i_5_, 4095, vaa.xb, jga.v);
		if (i_22_ >= Class_md.h)
		    kg.a(i_25_, wh.O[i_22_], i, i_24_, 97);
		if (i_23_ <= Class_db.o)
		    kg.a(i_25_, wh.O[i_23_], i, i_24_, -126);
	    }
	}
    }
    
    public static void a(byte i) {
	g = null;
	int i_26_ = -70 / ((i + 6) / 47);
    }
    
    final pp a(int i) {
	k++;
	if (i != 1252027233)
	    je.i = 59;
	pp var_pp = p;
	if (var_pp == n) {
	    p = null;
	    return null;
	}
	p = ((pp) var_pp).var_n;
	return var_pp;
    }
    
    final pp b(int i) {
	d++;
	pp var_pp = ((pp) n).var_n;
	if (n == var_pp)
	    return null;
	if (i != -21957)
	    je.i = 69;
	var_pp.a((byte) -92);
	return var_pp;
    }
    
    static final Class a(int i, String string) throws ClassNotFoundException {
	b++;
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (i != 18944)
	    return null;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("outgoingPacket13"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	return Class.forName(string);
    }
    
    static final baa a(byte i, int i_27_) {
	c++;
	baa[] var_baas = ev.h((int) -125);
	if (i < 96)
	    return null;
	for (int i_28_ = 0; i_28_ < var_baas.length; i_28_++) {
	    if (i_27_ == ((baa) var_baas[i_28_]).j)
		return var_baas[i_28_];
	}
	return null;
    }
    
    final void c(int i) {
	if (i == 1252027233) {
	    j++;
	    for (;;) {
		pp var_pp = ((pp) n).var_n;
		if (n == var_pp)
		    break;
		var_pp.a((byte) -72);
	    }
	    p = null;
	}
    }
    
    final void a(int i, pp var_pp) {
	a++;
	if (((pp) var_pp).o != null)
	    var_pp.a((byte) -75);
	((pp) var_pp).var_n = n;
	((pp) var_pp).o = ((pp) n).o;
	((pp) ((pp) var_pp).o).var_n = var_pp;
	((pp) ((pp) var_pp).var_n).o = var_pp;
	if (i != 75)
	    a((byte) 83);
    }
    
    final void a(byte i, pp var_pp) {
	if (i >= -113)
	    p = null;
	if (((pp) var_pp).o != null)
	    var_pp.a((byte) -53);
	h++;
	((pp) var_pp).var_n = ((pp) n).var_n;
	((pp) var_pp).o = n;
	((pp) ((pp) var_pp).o).var_n = var_pp;
	((pp) ((pp) var_pp).var_n).o = var_pp;
    }
    
    final int d(int i) {
	l++;
	int i_29_ = i;
	pp var_pp = ((pp) n).var_n;
	while (var_pp != n) {
	    var_pp = ((pp) var_pp).var_n;
	    i_29_++;
	}
	return i_29_;
    }
    
    final pp b(byte i) {
	q++;
	pp var_pp = ((pp) n).o;
	if (n == var_pp)
	    return null;
	if (i <= 126)
	    n = null;
	var_pp.a((byte) -87);
	return var_pp;
    }
    
    static final void c(byte i) {
	o++;
	for (int i_30_ = 0; je.i > i_30_; i_30_++) {
	    vt var_vt = tn.j[i_30_];
	    if (((vt) var_vt).f == 3) {
		if (((vt) var_vt).a == null)
		    ((vt) var_vt).k = -2147483648;
		else
		    ej.r.a(((vt) var_vt).a);
	    }
	}
	if (i != 58)
	    a(-34, -60, -49, 36, -72, -111);
    }
    
    final pp d(byte i) {
	if (i > -51)
	    m = -15;
	e++;
	pp var_pp = ((pp) n).var_n;
	if (var_pp == n) {
	    p = null;
	    return null;
	}
	p = ((pp) var_pp).var_n;
	return var_pp;
    }
    
    public je() {
	((pp) n).var_n = n;
	((pp) n).o = n;
    }
    
    static {
	g = new au[75];
    }
}
