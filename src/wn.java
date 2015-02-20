/* wn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class wn
{
    private aba a;
    private aba b;
    private static int[] c;
    private static int[] d;
    private int e;
    int f;
    private int[] g = new int[5];
    private static int[] h = new int[32768];
    private int[] i = new int[5];
    private aba j;
    private aba k;
    private om l;
    private int m = 100;
    private aba n;
    private aba o;
    private aba p;
    private aba q;
    int r;
    private int[] s;
    private aba t;
    private static int[] u;
    private static int[] v;
    private static int[] w;
    private static int[] x;
    private static int[] y;
    
    final void a(BytesParser var_es) {
	p = new aba();
	p.b(var_es);
	b = new aba();
	b.b(var_es);
	int i = var_es.readUnsignedByte(-9268);
	if (i != 0) {
	    ((BytesParser) var_es).pos--;
	    t = new aba();
	    t.b(var_es);
	    q = new aba();
	    q.b(var_es);
	}
	i = var_es.readUnsignedByte(-9268);
	if (i != 0) {
	    ((BytesParser) var_es).pos--;
	    j = new aba();
	    j.b(var_es);
	    k = new aba();
	    k.b(var_es);
	}
	i = var_es.readUnsignedByte(-9268);
	if (i != 0) {
	    ((BytesParser) var_es).pos--;
	    n = new aba();
	    n.b(var_es);
	    a = new aba();
	    a.b(var_es);
	}
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    int i_1_ = var_es.readSmart2(-13829);
	    if (i_1_ == 0)
		break;
	    g[i_0_] = i_1_;
	    this.i[i_0_] = var_es.readSmart(-9561);
	    s[i_0_] = var_es.readSmart2(-13829);
	}
	e = var_es.readSmart2(-13829);
	m = var_es.readSmart2(-13829);
	((wn) this).r = var_es.readShort(13111);
	((wn) this).f = var_es.readShort(13111);
	l = new om();
	o = new aba();
	l.a(var_es, o);
    }
    
    public static void a() {
	d = null;
	h = null;
	c = null;
	u = null;
	x = null;
	w = null;
	v = null;
	y = null;
    }
    
    private final int a(int i, int i_2_, int i_3_) {
	if (i_3_ == 1) {
	    if ((i & 0x7fff) < 16384)
		return i_2_;
	    return -i_2_;
	}
	if (i_3_ == 2)
	    return c[i & 0x7fff] * i_2_ >> 14;
	if (i_3_ == 3)
	    return ((i & 0x7fff) * i_2_ >> 14) - i_2_;
	if (i_3_ == 4)
	    return h[i / 2607 & 0x7fff] * i_2_;
	return 0;
    }
    
    final int[] a(int i, int i_4_) {
	co.a(wn.d, 0, i);
	if (i_4_ < 10)
	    return wn.d;
	double d = (double) i / ((double) i_4_ + 0.0);
	p.a();
	b.a();
	int i_5_ = 0;
	int i_6_ = 0;
	int i_7_ = 0;
	if (t != null) {
	    t.a();
	    q.a();
	    i_5_ = (int) ((double) (((aba) t).c - ((aba) t).d) * 32.768 / d);
	    i_6_ = (int) ((double) ((aba) t).d * 32.768 / d);
	}
	int i_8_ = 0;
	int i_9_ = 0;
	int i_10_ = 0;
	if (j != null) {
	    j.a();
	    k.a();
	    i_8_ = (int) ((double) (((aba) j).c - ((aba) j).d) * 32.768 / d);
	    i_9_ = (int) ((double) ((aba) j).d * 32.768 / d);
	}
	for (int i_11_ = 0; i_11_ < 5; i_11_++) {
	    if (g[i_11_] != 0) {
		u[i_11_] = 0;
		x[i_11_] = (int) ((double) s[i_11_] * d);
		w[i_11_] = (g[i_11_] << 14) / 100;
		v[i_11_] = (int) ((double) (((aba) p).c - ((aba) p).d) * 32.768
				  * Math.pow(1.0057929410678534,
					     (double) this.i[i_11_])
				  / d);
		y[i_11_] = (int) ((double) ((aba) p).d * 32.768 / d);
	    }
	}
	for (int i_12_ = 0; i_12_ < i; i_12_++) {
	    int i_13_ = p.a(i);
	    int i_14_ = b.a(i);
	    if (t != null) {
		int i_15_ = t.a(i);
		int i_16_ = q.a(i);
		i_13_ += a(i_7_, i_16_, ((aba) t).f) >> 1;
		i_7_ += (i_15_ * i_5_ >> 16) + i_6_;
	    }
	    if (j != null) {
		int i_17_ = j.a(i);
		int i_18_ = k.a(i);
		i_14_ = (i_14_ * ((a(i_10_, i_18_, ((aba) j).f) >> 1) + 32768)
			 >> 15);
		i_10_ += (i_17_ * i_8_ >> 16) + i_9_;
	    }
	    for (int i_19_ = 0; i_19_ < 5; i_19_++) {
		if (g[i_19_] != 0) {
		    int i_20_ = i_12_ + x[i_19_];
		    if (i_20_ < i) {
			wn.d[i_20_] += a(u[i_19_], i_14_ * w[i_19_] >> 15,
					 ((aba) p).f);
			u[i_19_] += (i_13_ * v[i_19_] >> 16) + y[i_19_];
		    }
		}
	    }
	}
	if (n != null) {
	    n.a();
	    a.a();
	    int i_21_ = 0;
	    boolean bool = false;
	    boolean bool_22_ = true;
	    for (int i_23_ = 0; i_23_ < i; i_23_++) {
		int i_24_ = n.a(i);
		int i_25_ = a.a(i);
		int i_26_;
		if (bool_22_)
		    i_26_ = ((aba) n).d + ((((aba) n).c - ((aba) n).d) * i_24_
					   >> 8);
		else
		    i_26_ = ((aba) n).d + ((((aba) n).c - ((aba) n).d) * i_25_
					   >> 8);
		i_21_ += 256;
		if (i_21_ >= i_26_) {
		    i_21_ = 0;
		    bool_22_ = !bool_22_;
		}
		if (bool_22_)
		    wn.d[i_23_] = 0;
	    }
	}
	if (e > 0 && m > 0) {
	    int i_27_ = (int) ((double) e * d);
	    for (int i_28_ = i_27_; i_28_ < i; i_28_++)
		wn.d[i_28_] += wn.d[i_28_ - i_27_] * m / 100;
	}
	if (((om) l).c[0] > 0 || ((om) l).c[1] > 0) {
	    o.a();
	    int i_29_ = o.a(i + 1);
	    int i_30_ = l.a(0, (float) i_29_ / 65536.0F);
	    int i_31_ = l.a(1, (float) i_29_ / 65536.0F);
	    if (i >= i_30_ + i_31_) {
		int i_32_ = 0;
		int i_33_ = i_31_;
		if (i_33_ > i - i_30_)
		    i_33_ = i - i_30_;
		for (/**/; i_32_ < i_33_; i_32_++) {
		    int i_34_ = (int) ((long) wn.d[i_32_ + i_30_] * (long) om.f
				       >> 16);
		    for (int i_35_ = 0; i_35_ < i_30_; i_35_++)
			i_34_ += (int) (((long) wn.d[i_32_ + i_30_ - 1 - i_35_]
					 * (long) om.d[0][i_35_])
					>> 16);
		    for (int i_36_ = 0; i_36_ < i_32_; i_36_++)
			i_34_ -= (int) (((long) wn.d[i_32_ - 1 - i_36_]
					 * (long) om.d[1][i_36_])
					>> 16);
		    wn.d[i_32_] = i_34_;
		    i_29_ = o.a(i + 1);
		}
		i_33_ = 128;
		for (;;) {
		    if (i_33_ > i - i_30_)
			i_33_ = i - i_30_;
		    for (/**/; i_32_ < i_33_; i_32_++) {
			int i_37_
			    = (int) ((long) wn.d[i_32_ + i_30_] * (long) om.f
				     >> 16);
			for (int i_38_ = 0; i_38_ < i_30_; i_38_++)
			    i_37_ += (int) (((long) wn.d[(i_32_ + i_30_ - 1
							  - i_38_)]
					     * (long) om.d[0][i_38_])
					    >> 16);
			for (int i_39_ = 0; i_39_ < i_31_; i_39_++)
			    i_37_ -= (int) (((long) wn.d[i_32_ - 1 - i_39_]
					     * (long) om.d[1][i_39_])
					    >> 16);
			wn.d[i_32_] = i_37_;
			i_29_ = o.a(i + 1);
		    }
		    if (i_32_ >= i - i_30_)
			break;
		    i_30_ = l.a(0, (float) i_29_ / 65536.0F);
		    i_31_ = l.a(1, (float) i_29_ / 65536.0F);
		    i_33_ += 128;
		}
		for (/**/; i_32_ < i; i_32_++) {
		    int i_40_ = 0;
		    for (int i_41_ = i_32_ + i_30_ - i; i_41_ < i_30_; i_41_++)
			i_40_ += (int) (((long) wn.d[i_32_ + i_30_ - 1 - i_41_]
					 * (long) om.d[0][i_41_])
					>> 16);
		    for (int i_42_ = 0; i_42_ < i_31_; i_42_++)
			i_40_ -= (int) (((long) wn.d[i_32_ - 1 - i_42_]
					 * (long) om.d[1][i_42_])
					>> 16);
		    wn.d[i_32_] = i_40_;
		    i_29_ = o.a(i + 1);
		}
	    }
	}
	for (int i_43_ = 0; i_43_ < i; i_43_++) {
	    if (wn.d[i_43_] < -32768)
		wn.d[i_43_] = -32768;
	    if (wn.d[i_43_] > 32767)
		wn.d[i_43_] = 32767;
	}
	return wn.d;
    }
    
    public wn() {
	((wn) this).f = 0;
	e = 0;
	((wn) this).r = 500;
	s = new int[5];
    }
    
    static {
	Random random = new Random(0L);
	for (int i = 0; i < 32768; i++)
	    h[i] = (random.nextInt() & 0x2) - 1;
	c = new int[32768];
	for (int i = 0; i < 32768; i++)
	    c[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
	d = new int[220500];
	u = new int[5];
	v = new int[5];
	w = new int[5];
	y = new int[5];
	x = new int[5];
    }
}
