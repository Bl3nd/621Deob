/* tw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tw
{
    private raa[] a;
    static int b;
    private int c;
    private raa[] d;
    private int e;
    private boolean f;
    static int g;
    static int h;
    private int i;
    private int j;
    private int k = -1;
    static fca[] l = new fca[5];
    private int m;
    private f n;
    private int o;
    private raa p;
    static int q;
    static boolean r;
    
    final void a(byte i) {
	int i_0_ = 80 % ((i - 50) / 62);
	if (d != null) {
	    for (int i_1_ = 0; i_1_ < d.length; i_1_++)
		d[i_1_].c();
	}
	g++;
	n = null;
    }
    
    final boolean a(byte i, int i_2_, Class_r class_r) {
	b++;
	if (k != i_2_) {
	    k = i_2_;
	    int i_3_ = ko.a((byte) 114, i_2_);
	    if (i_3_ > 512)
		i_3_ = 512;
	    if (i_3_ <= 0)
		i_3_ = 1;
	    if (j != i_3_) {
		j = i_3_;
		n = null;
	    }
	    if (d != null) {
		e = 0;
		int[] is = new int[d.length];
		for (int i_4_ = 0; d.length > i_4_; i_4_++) {
		    raa var_raa = d[i_4_];
		    if (var_raa.a(c, o, m, k)) {
			is[e] = ((raa) var_raa).g;
			a[e++] = var_raa;
		    }
		}
		cg.a(e - 1, is, a, 1, 0);
	    }
	    f = true;
	}
	boolean bool = false;
	if (f) {
	    f = false;
	    for (int i_5_ = e - 1; i_5_ >= 0; i_5_--) {
		boolean bool_6_ = a[i_5_].b(class_r, p);
		bool |= bool_6_;
		tw var_tw_7_ = this;
		var_tw_7_.f = var_tw_7_.f | !bool_6_;
	    }
	}
	if (i != -113)
	    a((int) -84);
	return bool;
    }
    
    public static void a(int i) {
	l = null;
	if (i != 0)
	    a((int) 81);
    }
    
    final void a(int i, int i_8_, int i_9_, int i_10_, byte i_11_, int i_12_,
		 int i_13_, int i_14_, int i_15_, Class_r class_r) {
	i_12_ = i_14_ + i_12_ & 0x3fff;
	h++;
	if (i_11_ < -72) {
	    if (this.i != -1) {
		vca var_vca = cj.e.a(this.i, (byte) 86);
		if (n == null && cj.e.a(false, this.i)) {
		    int[] is = (((vca) var_vca).s
				? cj.e.a(0.7F, j, (byte) 98, false, j, this.i)
				: cj.e.a(this.i, 0.7F, false, j, -5969, j));
		    n = class_r.a(is, 0, j, j, j);
		}
		if (((vca) var_vca).s)
		    class_r.J(i_8_, i_9_, i_13_, i_10_, i, 0);
		if (n != null) {
		    int i_16_ = ((vca) var_vca).s ? 1 : 0;
		    int i_17_ = i_15_ * i_10_ / -4096;
		    int i_18_;
		    for (i_18_ = i_10_ * i_12_ / 4096 + (i_13_ - i_10_) / 2;
			 i_18_ > i_10_; i_18_ -= i_10_) {
			/* empty */
		    }
		    for (/**/; i_17_ > i_10_; i_17_ -= i_10_) {
			/* empty */
		    }
		    for (/**/; i_18_ < 0; i_18_ += i_10_) {
			/* empty */
		    }
		    for (/**/; i_17_ < 0; i_17_ += i_10_) {
			/* empty */
		    }
		    for (int i_19_ = i_18_ - i_10_; i_13_ > i_19_;
			 i_19_ += i_10_) {
			for (int i_20_ = i_17_ - i_10_; i_20_ < i_10_;
			     i_20_ += i_10_)
			    n.a(i_19_ + i_8_, i_9_ + i_20_, i_10_, i_10_, 1, 0,
				i_16_);
		    }
		}
	    } else
		class_r.J(i_8_, i_9_, i_13_, i_10_, i, 0);
	    for (int i_21_ = e - 1; i_21_ >= 0; i_21_--)
		a[i_21_].a(class_r, i_8_, i_9_, i_13_, i_10_, i_15_, i_12_);
	}
    }
    
    tw(int i, raa[] var_raas, int i_22_, int i_23_, int i_24_, int i_25_) {
	f = true;
	c = i_23_;
	d = var_raas;
	m = i_25_;
	this.i = i;
	o = i_24_;
	if (var_raas != null) {
	    a = new raa[var_raas.length];
	    p = i_22_ < 0 ? null : var_raas[i_22_];
	} else {
	    p = null;
	    a = null;
	}
    }
    
    static {
	for (int i = 0; l.length > i; i++)
	    l[i] = new fca();
	q = 1;
    }
}
