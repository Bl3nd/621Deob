/* wj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wj
{
    private long[] a = new long[8];
    static int b;
    private int c = 0;
    static int clanChatPlayerCount;
    static int e;
    private long[] f;
    private long[] g = new long[8];
    static int h;
    private byte[] i;
    private long[] j;
    private int k = 0;
    static fm l;
    static int m;
    private byte[] n;
    static int o;
    static int p;
    static int q;
    private long[] r;
    /*synthetic*/ static Class s;
    
    final void a(int i) {
	int i_0_ = 0;
	if (i != 8)
	    n = null;
	for (/**/; i_0_ < 32; i_0_++)
	    n[i_0_] = (byte) 0;
	e++;
	c = k = 0;
	this.i[0] = (byte) 0;
	for (int i_1_ = 0; i_1_ < 8; i_1_++)
	    g[i_1_] = 0L;
    }
    
    private final void a(byte i) {
	m++;
	int i_2_ = 0;
	int i_3_ = 0;
	while (i_2_ < 8) {
	    r[i_2_]
		= la.a(ee.a(255L, (long) this.i[i_3_ + 7]),
		       la.a(ee.a(255L, (long) this.i[i_3_ + 6]) << 8,
			    la.a(la.a(ee.a((long) this.i[i_3_ + 4] << 24,
					   255L << 24),
				      la.a(ee.a((long) this.i[i_3_ + 3] << 32,
						255L << 32),
					   la.a(la.a(ee.a(((long) (this.i
								   [i_3_ + 1])
							   << 48),
							  255L << 48),
						     ((long) this.i[i_3_]
						      << 56)),
						ee.a((long) this.i[i_3_ + 2],
						     255L) << 40))),
				 ee.a(255L, (long) this.i[i_3_ + 5]) << 16)));
	    i_2_++;
	    i_3_ += 8;
	}
	for (int i_4_ = 0; i_4_ < 8; i_4_++)
	    f[i_4_] = la.a(r[i_4_], a[i_4_] = g[i_4_]);
	for (int i_5_ = 1; i_5_ <= 10; i_5_++) {
	    for (int i_6_ = 0; i_6_ < 8; i_6_++) {
		j[i_6_] = 0L;
		int i_7_ = 0;
		int i_8_ = 56;
		while (i_7_ < 8) {
		    j[i_6_]
			= la.a(j[i_6_],
			       gn.Q[i_7_][uca.a(255,
						(int) (a[uca.a(i_6_ - i_7_, 7)]
						       >>> i_8_))]);
		    i_7_++;
		    i_8_ -= 8;
		}
	    }
	    for (int i_9_ = 0; i_9_ < 8; i_9_++)
		a[i_9_] = j[i_9_];
	    a[0] = la.a(a[0], gn.R[i_5_]);
	    for (int i_10_ = 0; i_10_ < 8; i_10_++) {
		j[i_10_] = a[i_10_];
		int i_11_ = 0;
		int i_12_ = 56;
		while (i_11_ < 8) {
		    j[i_10_]
			= la.a(j[i_10_],
			       gn.Q[i_11_][uca.a((int) (f[uca.a(7,
								i_10_ - i_11_)]
							>>> i_12_),
						 255)]);
		    i_11_++;
		    i_12_ -= 8;
		}
	    }
	    for (int i_13_ = 0; i_13_ < 8; i_13_++)
		f[i_13_] = j[i_13_];
	}
	for (int i_14_ = 0; i_14_ < 8; i_14_++)
	    g[i_14_] = la.a(g[i_14_], la.a(f[i_14_], r[i_14_]));
	if (i != 36)
	    a(null, 107L, 15);
    }
    
    final void a(byte[] is, long l, int i) {
	b++;
	if (i >= -10)
	    g = null;
	int i_15_ = 0;
	int i_16_ = -(0x7 & (int) l) + 8 & 0x7;
	int i_17_ = c & 0x7;
	long l_18_ = l;
	int i_19_ = 31;
	int i_20_ = 0;
	for (/**/; i_19_ >= 0; i_19_--) {
	    i_20_ += (0xff & (int) l_18_) + (n[i_19_] & 0xff);
	    n[i_19_] = (byte) i_20_;
	    l_18_ >>>= 8;
	    i_20_ >>>= 8;
	}
	while (l > 8L) {
	    int i_21_ = (0xff & is[i_15_] << i_16_
			 | (0xff & is[i_15_ + 1]) >>> -i_16_ + 8);
	    if (i_21_ < 0 || i_21_ >= 256)
		throw new RuntimeException("LOGIC ERROR");
	    this.i[k] = (byte) hba.bitwiseArg1ORArg2(this.i[k], i_21_ >>> i_17_);
	    k++;
	    c += 8 - i_17_;
	    if (c == 512) {
		a((byte) 36);
		c = k = 0;
	    }
	    this.i[k] = (byte) uca.a(i_21_ << -i_17_ + 8, 255);
	    c += i_17_;
	    l -= 8L;
	    i_15_++;
	}
	int i_22_;
	if (l > 0L) {
	    i_22_ = 0xff & is[i_15_] << i_16_;
	    this.i[k] = (byte) hba.bitwiseArg1ORArg2(this.i[k], i_22_ >>> i_17_);
	} else
	    i_22_ = 0;
	if ((long) i_17_ + l < 8L)
	    c += l;
	else {
	    c += 8 - i_17_;
	    l -= (long) (-i_17_ + 8);
	    k++;
	    if (c == 512) {
		a((byte) 36);
		c = k = 0;
	    }
	    this.i[k] = (byte) uca.a(i_22_ << -i_17_ + 8, 255);
	    c += (int) l;
	}
    }
    
    public static void b(int i) {
	l = null;
	if (i > -17)
	    l = null;
    }
    
    final void a(byte[] is, int i, int i_23_) {
	this.i[k] = (byte) hba.bitwiseArg1ORArg2(this.i[k], 128 >>> uca.a(7, c));
	o++;
	k++;
	if (k > 32) {
	    while (k < 64)
		this.i[k++] = (byte) 0;
	    a((byte) 36);
	    k = 0;
	}
	while (k < 32)
	    this.i[k++] = (byte) 0;
	co.a(n, 0, this.i, 32, 32);
	a((byte) 36);
	int i_24_ = 0;
	int i_25_ = i;
	for (/**/; i_24_ < 8; i_24_++) {
	    long l = g[i_24_];
	    is[i_25_] = (byte) (int) (l >>> 56);
	    is[i_25_ + 1] = (byte) (int) (l >>> 48);
	    is[i_25_ + 2] = (byte) (int) (l >>> 40);
	    is[i_25_ + 3] = (byte) (int) (l >>> 32);
	    is[i_25_ + 4] = (byte) (int) (l >>> 24);
	    is[i_25_ + 5] = (byte) (int) (l >>> 16);
	    is[i_25_ + 6] = (byte) (int) (l >>> 8);
	    is[i_25_ + 7] = (byte) (int) l;
	    i_25_ += 8;
	}
	if (i_23_ != 256)
	    r = null;
    }
    
    static final void a(int i, int i_26_, int i_27_, int i_28_, int i_29_,
			int i_30_, int i_31_, int i_32_) {
	if (i != -1)
	    clanChatPlayerCount = -61;
	h++;
	do {
	    if (i_32_ >= 0 && i_30_ >= 0 && i_32_ < Class_hc.e - 1
		&& i_30_ < bw.v - 1) {
		if (ol.p == null)
		    break;
		if (i_28_ == 0) {
		    vda var_vda = (vda) Class_nb.a(i_29_, i_32_, i_30_);
		    vda var_vda_33_ = (vda) ia.a(i_29_, i_32_, i_30_);
		    if (var_vda != null && i_26_ != 2) {
			if (var_vda instanceof Class_ug)
			    ((Class_ug) (Class_ug) var_vda).N.a(i_27_,
								i + 2912);
			else
			    nda.a(i_28_, i_27_, i_31_, (byte) 68, i_32_, i_30_,
				  i_26_, i_29_, var_vda.b((byte) 127));
		    }
		    if (var_vda_33_ != null) {
			if (!(var_vda_33_ instanceof Class_ug))
			    nda.a(i_28_, i_27_, i_31_, (byte) 68, i_32_, i_30_,
				  i_26_, i_29_, var_vda_33_.b((byte) 127));
			else {
			    ((Class_ug) (Class_ug) var_vda_33_).N.a(i_27_,
								    i + 2912);
			    break;
			}
			break;
		    }
		} else {
		    if (i_28_ != 1) {
			if (i_28_ != 2) {
			    if (i_28_ == 3) {
				vda var_vda = (vda) lr.a(i_29_, i_32_, i_30_);
				if (var_vda != null) {
				    if (!(var_vda instanceof qaa))
					nda.a(i_28_, i_27_, i_31_, (byte) 68,
					      i_32_, i_30_, i_26_, i_29_,
					      var_vda.b((byte) 127));
				    else
					((qaa) (qaa) var_vda).H.a(i_27_, 2911);
				}
			    }
			} else {
			    vda var_vda
				= (vda) ik.a(i_29_, i_32_, i_30_,
					     s != null ? s : (s = a("vda")));
			    if (var_vda == null)
				break;
			    if (i_26_ == 11)
				i_26_ = 10;
			    if (!(var_vda instanceof lq))
				nda.a(i_28_, i_27_, i_31_, (byte) 68, i_32_,
				      i_30_, i_26_, i_29_,
				      var_vda.b((byte) 127));
			    else
				((lq) (lq) var_vda).X.a(i_27_, 2911);
			}
			break;
		    }
		    vda var_vda = (vda) ej.a(i_29_, i_32_, i_30_);
		    if (var_vda != null) {
			if (!(var_vda instanceof jfa)) {
			    int i_34_ = var_vda.b((byte) 127);
			    if (i_26_ == 4 || i_26_ == 5)
				nda.a(i_28_, i_27_, i_31_, (byte) 68, i_32_,
				      i_30_, 4, i_29_, i_34_);
			    else {
				if (i_26_ != 6) {
				    if (i_26_ == 7)
					nda.a(i_28_, i_27_,
					      (0x3 & i_31_ + 2) + 4, (byte) 68,
					      i_32_, i_30_, 4, i_29_, i_34_);
				    else if (i_26_ == 8) {
					nda.a(i_28_, i_27_, i_31_ + 4,
					      (byte) 68, i_32_, i_30_, 4,
					      i_29_, i_34_);
					nda.a(i_28_, i_27_,
					      (i_31_ + 2 & 0x3) + 4, (byte) 68,
					      i_32_, i_30_, 4, i_29_, i_34_);
				    }
				} else
				    nda.a(i_28_, i_27_, i_31_ + 4, (byte) 68,
					  i_32_, i_30_, 4, i_29_, i_34_);
				break;
			    }
			    break;
			}
			((jfa) (jfa) var_vda).P.a(i_27_, 2911);
		    }
		}
	    }
	} while (false);
    }
    
    static final void a(int i, String string, Signlink var_rj, boolean bool,
			boolean bool_35_) {
	p++;
	if (bool_35_) {
	    if (Signlink.osNameLowerCase.startsWith("win") && ((Signlink) var_rj).r) {
		String string_36_ = null;
		if (vj.applet != null)
		    string_36_ = vj.applet.getParameter("haveie6");
		if (string_36_ == null || !string_36_.equals("1")) {
		    vfa var_vfa = wk.a(-89, string, var_rj, 0);
		    ff.signlink = var_rj;
		    ee.d = string;
		    pga.f = var_vfa;
		    return;
		}
	    }
	    if (Signlink.osNameLowerCase.startsWith("mac")) {
		String string_37_ = null;
		if (vj.applet != null)
		    string_37_ = vj.applet.getParameter("havefirefox");
		if (string_37_ != null && string_37_.equals("1") && bool) {
		    wk.a(-31, string, var_rj, 1);
		    return;
		}
	    }
	    wk.a(126, string, var_rj, 2);
	} else
	    wk.a(100, string, var_rj, 3);
	if (i <= 65)
	    b(110);
    }
    
    public wj() {
	i = new byte[64];
	r = new long[8];
	f = new long[8];
	n = new byte[32];
	j = new long[8];
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
