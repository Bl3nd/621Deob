/* pt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pt
{
    private pl a;
    static int b;
    static int[] c = new int[4];
    static int d;
    static int e;
    static Connection f;
    static ah g;
    private tb h = new tb(64);
    int i;
    
    final iga a(byte i, int i_0_) {
	e++;
	iga var_iga;
	synchronized (h) {
	    var_iga = (iga) h.get((long) i_0_, (byte) 100);
	}
	if (var_iga != null)
	    return var_iga;
	if (i > -126)
	    a(-5, null, -72, (byte) -69, 113, null, -59, 72L, 3);
	byte[] is;
	synchronized (a) {
	    is = a.b(i_0_, 56, 19);
	}
	var_iga = new iga();
	if (is != null)
	    var_iga.a((byte) 98, new BytesParser(is));
	synchronized (h) {
	    h.put((long) i_0_, var_iga, 1);
	}
	return var_iga;
    }
    
    static final void a(int i, Interface var_kp, int i_1_, byte i_2_, int i_3_,
			ua var_ua, int i_4_, long l, int i_5_) {
	if (i_2_ != -113)
	    a((byte) 32);
	pt.d++;
	int i_6_ = i_4_ * i_4_ + i * i;
	if (l >= (long) i_6_) {
	    int i_7_ = Math.min(((Interface) var_kp).minHScroll / 2, ((Interface) var_kp).minVScroll / 2);
	    if (i_6_ <= i_7_ * i_7_)
		Class_kb.a(i_5_, i_4_, i, var_kp, ir.b[i_1_], i_3_,
			   (byte) -108, var_ua);
	    else {
		i_7_ -= 10;
		int i_8_;
		if (ll.x != 4)
		    i_8_ = (int) qw.n + b & 0x3fff;
		else
		    i_8_ = (int) qw.n & 0x3fff;
		int i_9_ = GameInPacket.h[i_8_];
		int i_10_ = GameInPacket.i[i_8_];
		if (ll.x != 4) {
		    i_9_ = i_9_ * 256 / (vd.N + 256);
		    i_10_ = 256 * i_10_ / (vd.N + 256);
		}
		int i_11_ = i_9_ * i_4_ + i * i_10_ >> 14;
		int i_12_ = i_4_ * i_10_ - i_9_ * i >> 14;
		double d = Math.atan2((double) i_11_, (double) i_12_);
		int i_13_ = (int) (Math.sin(d) * (double) i_7_);
		int i_14_ = (int) ((double) i_7_ * Math.cos(d));
		ek.w[i_1_].a(((float) ((Interface) var_kp).minHScroll / 2.0F + (float) i_3_
			      + (float) i_13_),
			     ((float) ((Interface) var_kp).minVScroll / 2.0F + (float) i_5_
			      - (float) i_14_),
			     4096, (int) (65535.0 * (-d / 6.283185307179586)));
	    }
	}
    }
    
    public static void a(byte i) {
	if (i == -109) {
	    c = null;
	    f = null;
	    g = null;
	}
    }
    
    static final void a(qd var_qd) {
	if (qn.k < 65535) {
	    gga var_gga = ((qd) var_qd).m;
	    Class_j.l[qn.k] = var_qd;
	    Class_j.i[qn.k] = false;
	    qn.k++;
	    int i = ((qd) var_qd).o;
	    if (((qd) var_qd).e)
		i = 0;
	    int i_15_ = ((qd) var_qd).o;
	    if (((qd) var_qd).b)
		i_15_ = dfa.G - 1;
	    for (int i_16_ = i; i_16_ <= i_15_; i_16_++) {
		int i_17_ = 0;
		int i_18_
		    = (var_gga.b((byte) 119) - var_gga.a((byte) -81) + dba.k
		       >> Class_fb.a);
		if (i_18_ < 0) {
		    i_17_ -= i_18_;
		    i_18_ = 0;
		}
		int i_19_
		    = (var_gga.b((byte) 119) + var_gga.a((byte) 105) - dba.k
		       >> Class_fb.a);
		if (i_19_ >= nf.H)
		    i_19_ = nf.H - 1;
		for (int i_20_ = i_18_; i_20_ <= i_19_; i_20_++) {
		    int i_21_ = ((qd) var_qd).g[i_17_++];
		    int i_22_
			= ((var_gga.a(true) - var_gga.a((byte) -88) + dba.k
			    >> Class_fb.a)
			   + (i_21_ >>> 8));
		    int i_23_ = i_22_ + (i_21_ & 0xff) - 1;
		    if (i_22_ < 0)
			i_22_ = 0;
		    if (i_23_ >= sv.T)
			i_23_ = sv.T - 1;
		    for (int i_24_ = i_22_; i_24_ <= i_23_; i_24_++) {
			long l = tba.n[i_16_][i_24_][i_20_];
			if ((l & 0xffffL) == 0L)
			    tba.n[i_16_][i_24_][i_20_] = l | (long) qn.k;
			else if ((l & 0xffff0000L) == 0L)
			    tba.n[i_16_][i_24_][i_20_] = l | (long) qn.k << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    tba.n[i_16_][i_24_][i_20_] = l | (long) qn.k << 32;
			else if ((l & ~0xffffffffffffL) == 0L)
			    tba.n[i_16_][i_24_][i_20_] = l | (long) qn.k << 48;
		    }
		}
	    }
	}
    }
    
    pt(Class_rf class_rf, int i, pl var_pl) {
	a = var_pl;
	((pt) this).i = a.a(19, true);
    }
    
    static {
	b = 0;
    }
}
