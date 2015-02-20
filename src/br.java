/* br - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class br
{
    static int a;
    static int b;
    static int c;
    static int d;
    static String additionalInfo = null;
    static int f;
    static int g;
    private pl h;
    private tb i = new tb(64);
    static GameInPacket incomingPacket65 = new GameInPacket(65, -1);
    static tb k = new tb(8);
    static int l;
    static boolean m = true;
    static Class_q n;
    static int o;
    
    final void a(byte i) {
	b++;
	synchronized (this.i) {
	    int i_0_ = -106 % ((i + 64) / 42);
	    this.i.c((byte) -121);
	}
    }
    
    static final boolean a(int i, Class_vb class_vb, Class_r class_r, int i_1_,
			   ww var_ww, int i_2_) {
	f++;
	int i_3_ = 2147483647;
	int i_4_ = -2147483648;
	int i_5_ = 2147483647;
	int i_6_ = -2147483648;
	if (((ww) var_ww).O != null) {
	    i_4_ = kca.B + (kca.x - kca.B) * (((Class_vb) class_vb).m
					      + (((ww) var_ww).x
						 - kca.M)) / (kca.t - kca.M);
	    i_6_ = kca.J - ((((ww) var_ww).c - kca.L + ((Class_vb) class_vb).n)
			    * (kca.J - kca.y) / (kca.D - kca.L));
	    i_5_ = (kca.J
		    - (kca.J - kca.y) * (((Class_vb) class_vb).n - kca.L
					 + ((ww) var_ww).b) / (kca.D - kca.L));
	    i_3_ = ((((Class_vb) class_vb).m + ((ww) var_ww).P - kca.M)
		    * (kca.x - kca.B) / (kca.t - kca.M)) + kca.B;
	}
	f var_f = null;
	int i_7_ = 0;
	int i_8_ = 0;
	int i_9_ = 0;
	int i_10_ = 0;
	if ((((ww) var_ww).L ^ 0xffffffff) != 0) {
	    if (!((Class_vb) class_vb).l
		|| (((ww) var_ww).r ^ 0xffffffff) == 0)
		var_f = var_ww.a(i + 92, class_r, false);
	    else
		var_f = var_ww.a(75, class_r, true);
	    if (var_f != null) {
		i_7_ = ((Class_vb) class_vb).p - (var_f.A() + 1 >> 1);
		i_8_ = ((Class_vb) class_vb).p + (var_f.A() + 1 >> 1);
		if (i_7_ < i_3_)
		    i_3_ = i_7_;
		i_9_ = ((Class_vb) class_vb).k - (var_f.ca() + 1 >> 1);
		if (i_8_ > i_4_)
		    i_4_ = i_8_;
		if (i_5_ > i_9_)
		    i_5_ = i_9_;
		i_10_ = ((Class_vb) class_vb).k + (var_f.ca() + 1 >> 1);
		if (i_6_ < i_10_)
		    i_6_ = i_10_;
	    }
	}
	oj var_oj = null;
	int i_11_ = i;
	int i_12_ = 0;
	int i_13_ = 0;
	int i_14_ = 0;
	int i_15_ = 0;
	int i_16_ = 0;
	int i_17_ = 0;
	if (((ww) var_ww).q != null) {
	    var_oj = as.a(1, ((ww) var_ww).e);
	    if (var_oj != null) {
		i_11_ = Class_rb.O.a(((ww) var_ww).q, nt.d, i ^ 0xffffffff,
				     null, null);
		i_12_ = ((Class_vb) class_vb).k;
		if (var_f == null)
		    i_12_ -= var_oj.b() * i_11_ / 2;
		else
		    i_12_ -= (var_f.ca() >> 1) + var_oj.a() * i_11_;
		for (int i_18_ = 0; i_11_ > i_18_; i_18_++) {
		    String string = nt.d[i_18_];
		    if (i_11_ - 1 > i_18_)
			string = string.substring(0, string.length() - 4);
		    int i_19_ = var_oj.a(string);
		    if (i_13_ < i_19_)
			i_13_ = i_19_;
		}
		i_14_ = ((Class_vb) class_vb).p - (i_13_ / 2 - i_1_);
		i_15_ = ((Class_vb) class_vb).p - (-(i_13_ / 2) - i_1_);
		if (i_3_ > i_14_)
		    i_3_ = i_14_;
		if (i_15_ > i_4_)
		    i_4_ = i_15_;
		i_16_ = i_2_ + i_12_;
		if (i_16_ < i_5_)
		    i_5_ = i_16_;
		i_17_ = var_oj.a() * i_11_ + i_12_ + i_2_;
		if (i_17_ > i_6_)
		    i_6_ = i_17_;
	    }
	}
	if (kca.B > i_4_ || kca.x < i_3_ || kca.y > i_6_ || kca.J < i_5_)
	    return true;
	if (((ww) var_ww).O != null) {
	    int[] is = new int[((ww) var_ww).O.length];
	    for (int i_20_ = 0; is.length / 2 > i_20_; i_20_++) {
		int i_21_
		    = ((Class_vb) class_vb).m + ((ww) var_ww).O[i_20_ * 2];
		int i_22_
		    = ((Class_vb) class_vb).n + ((ww) var_ww).O[i_20_ * 2 + 1];
		is[2 * i_20_]
		    = kca.B + (i_21_ - kca.M) * (kca.x - kca.B) / (kca.t
								   - kca.M);
		is[i_20_ * 2 + 1]
		    = kca.J - (i_22_ - kca.L) * (kca.J - kca.y) / (kca.D
								   - kca.L);
	    }
	    gp.a(class_r, is, ((ww) var_ww).Q);
	    for (int i_23_ = 0; i_23_ < is.length / 2 - 1; i_23_++)
		class_r.e(1, is[2 * i_23_ + 1], ((ww) var_ww).R,
			  is[2 * i_23_ + 2 + 1], is[2 * i_23_],
			  is[2 * i_23_ + 2]);
	    class_r.e(1, is[is.length - 1], ((ww) var_ww).R, is[1],
		      is[is.length - 2], is[0]);
	}
	if (var_f != null) {
	    if (nda.g > 0
		&& (wq.o != -1 && ((Class_vb) class_vb).o == wq.o
		    || (wh.J ^ 0xffffffff) != 0 && wh.J == ((ww) var_ww).C)) {
		int i_24_;
		if (sh.h > 50)
		    i_24_ = -(sh.h * 2) + 200;
		else
		    i_24_ = 2 * sh.h;
		int i_25_ = i_24_ << 24 | 0xffff00;
		class_r.a(i + 9, i_25_, ((Class_vb) class_vb).p,
			  ((Class_vb) class_vb).k, var_f.E() / 2 + 7);
		class_r.a(i + 115, i_25_, ((Class_vb) class_vb).p,
			  ((Class_vb) class_vb).k, var_f.E() / 2 + 5);
		class_r.a(-7, i_25_, ((Class_vb) class_vb).p,
			  ((Class_vb) class_vb).k, var_f.E() / 2 + 3);
		class_r.a(i ^ 0x65, i_25_, ((Class_vb) class_vb).p,
			  ((Class_vb) class_vb).k, var_f.E() / 2 + 1);
		class_r.a(102, i_25_, ((Class_vb) class_vb).p,
			  ((Class_vb) class_vb).k, var_f.E() / 2);
	    }
	    var_f.a(((Class_vb) class_vb).p - (var_f.A() >> 1),
		    ((Class_vb) class_vb).k - (var_f.ca() >> 1));
	}
	if (((ww) var_ww).q != null && var_oj != null)
	    qt.a(i_11_, var_ww, var_oj, class_r, i_12_, i_13_, class_vb, 0);
	if (((ww) var_ww).L != -1 || ((ww) var_ww).q != null) {
	    cf var_cf = new cf(class_vb);
	    ((cf) var_cf).k = i_16_;
	    ((cf) var_cf).p = i_8_;
	    ((cf) var_cf).q = i_7_;
	    ((cf) var_cf).r = i_10_;
	    ((cf) var_cf).t = i_9_;
	    ((cf) var_cf).s = i_17_;
	    ((cf) var_cf).v = i_15_;
	    ((cf) var_cf).o = i_14_;
	    bg.c.b(var_cf, (byte) 93);
	}
	return false;
    }
    
    final void a(int i, int i_26_) {
	d++;
	synchronized (this.i) {
	    this.i.a(true, i_26_);
	}
	if (i != -18944)
	    a(true);
    }
    
    final df a(boolean bool, int i) {
	g++;
	df var_df;
	synchronized (this.i) {
	    var_df = (df) this.i.get((long) i, (byte) 100);
	}
	if (var_df != null)
	    return var_df;
	byte[] is;
	synchronized (h) {
	    if (bool != true)
		return null;
	    is = h.b(i, 61, 31);
	}
	var_df = new df();
	if (is != null)
	    var_df.a(new BytesParser(is), -16042);
	synchronized (this.i) {
	    this.i.put((long) i, var_df, 1);
	}
	return var_df;
    }
    
    public static void a(int i) {
	additionalInfo = null;
	k = null;
	n = null;
	incomingPacket65 = null;
	if (i != -1)
	    k = null;
    }
    
    final void a(boolean bool) {
	a++;
	synchronized (i) {
	    if (bool != true) {
		/* empty */
	    } else
		i.a(18385);
	}
    }
    
    static final void a(int i, int i_27_, int i_28_, int i_29_) {
	c++;
	int i_30_ = i_29_ + bfa.thisPlayersRegionX;
	int i_31_ = BytesParser.thisPlayersRegionY + i_27_;
	if (ol.p != null && i_29_ >= 0 && i_27_ >= 0 && Class_hc.e > i_29_
	    && i_27_ < bw.v && (cs.g.e(on.performance, 108) || i_28_ == ((Animable) up.thisPlayer).height)) {
	    long l = (long) (i_30_ | (i_28_ << 28 | i_31_ << 14));
	    sba var_sba = (sba) jt.a.a(-32748, l);
	    if (var_sba == null)
		wh.b(i_28_, i_29_, i_27_);
	    else {
		fn var_fn = (fn) ((sba) var_sba).o.a(i - 1632);
		if (var_fn == null)
		    wh.b(i_28_, i_29_, i_27_);
		else {
		    if (i != 1736)
			n = null;
		    ip var_ip = (ip) wh.b(i_28_, i_29_, i_27_);
		    if (var_ip == null)
			var_ip = new ip(i_29_ << 9,
					Class_q.b[i_28_].a(i_27_, (byte) 51,
							   i_29_),
					i_27_ << 9, i_28_, i_28_);
		    else
			((ip) var_ip).X = ((ip) var_ip).W = -1;
		    ((ip) var_ip).ab = ((fn) var_fn).n;
		    ((ip) var_ip).H = ((fn) var_fn).o;
		while_13_:
		    do {
			fn var_fn_32_;
			do {
			    var_fn_32_ = (fn) ((sba) var_sba).o.b((byte) 61);
			    if (var_fn_32_ == null)
				break while_13_;
			} while (((ip) var_ip).H == ((fn) var_fn_32_).o);
			((ip) var_ip).X = ((fn) var_fn_32_).o;
			((ip) var_ip).db = ((fn) var_fn_32_).n;
			for (;;) {
			    fn var_fn_33_
				= (fn) ((sba) var_sba).o.b((byte) 55);
			    if (var_fn_33_ == null)
				break;
			    if (((ip) var_ip).H != ((fn) var_fn_33_).o
				&& ((ip) var_ip).X != ((fn) var_fn_33_).o) {
				((ip) var_ip).W = ((fn) var_fn_33_).o;
				((ip) var_ip).O = ((fn) var_fn_33_).n;
			    }
			}
		    } while (false);
		    int i_34_ = Class_u.b((i_29_ << 9) + 256, i_28_, -20214,
					  (i_27_ << 9) + 256);
		    ((Animable) var_ip).height = (byte) i_28_;
		    ((ip) var_ip).J = 0;
		    ((Animable) var_ip).h = (byte) i_28_;
		    ((Animable) var_ip).j = i_34_;
		    ((Animable) var_ip).locX = i_29_ << 9;
		    ((Animable) var_ip).locY = i_27_ << 9;
		    if (ItemDef.b(i_27_, i_29_, i ^ 0x1082))
			((Animable) var_ip).h++;
		    em.a(i_28_, i_29_, i_27_, i_34_, var_ip);
		}
	    }
	}
    }
    
    br(Class_rf class_rf, int i, pl var_pl) {
	h = var_pl;
	h.a(31, true);
    }
    
    static {
	l = -2;
    }
}
