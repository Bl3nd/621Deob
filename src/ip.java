/* ip - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ip extends wr
{
    static int F;
    private boolean G = false;
    int H;
    static int I;
    int J;
    static int[] K = new int[6];
    static int M;
    static int N;
    int O;
    static int P;
    static int Q;
    static int R;
    static boolean S = false;
    static int T = -1;
    private int U = 0;
    static int V;
    int W;
    int X = -1;
    static int Y;
    static int Z;
    int ab;
    static int bb;
    static int cb;
    int db;
    static pl eb;
    static int fb;
    
    final void b(boolean bool, Class_r class_r) {
	if (bool != false)
	    g((int) 38);
	R++;
    }
    
    final int g(int i) {
	Z++;
	int i_0_ = 31 / ((i + 43) / 59);
	return -10;
    }
    
    final sd a(Class_r class_r, int i) {
	if (i != -1660704056)
	    ((ip) this).O = 20;
	I++;
	return null;
    }
    
    static final byte[] a(String string, byte i) {
	P++;
	int i_1_ = string.length();
	byte[] is = new byte[i_1_];
	if (i != -47)
	    return null;
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    char c = string.charAt(i_2_);
	    if ((c <= 0 || c >= '\u0080') && (c < '\u00a0' || c > '\u00ff')) {
		if (c != '\u20ac') {
		    if (c != '\u201a') {
			if (c != '\u0192') {
			    if (c != '\u201e') {
				if (c != '\u2026') {
				    if (c != '\u2020') {
					if (c == '\u2021')
					    is[i_2_] = (byte) -121;
					else if (c != '\u02c6') {
					    if (c == '\u2030')
						is[i_2_] = (byte) -119;
					    else if (c == '\u0160')
						is[i_2_] = (byte) -118;
					    else if (c == '\u2039')
						is[i_2_] = (byte) -117;
					    else if (c != '\u0152') {
						if (c != '\u017d') {
						    if (c != '\u2018') {
							if (c == '\u2019')
							    is[i_2_]
								= (byte) -110;
							else if (c
								 != '\u201c') {
							    if (c
								!= '\u201d') {
								if (c
								    == '\u2022')
								    is[i_2_]
									= (byte) -107;
								else if (c
									 == '\u2013')
								    is[i_2_]
									= (byte) -106;
								else if (c
									 == '\u2014')
								    is[i_2_]
									= (byte) -105;
								else if (c
									 != '\u02dc') {
								    if (c
									!= '\u2122') {
									if (c
									    == '\u0161')
									    is[i_2_] = (byte) -102;
									else if (c == '\u203a')
									    is[i_2_] = (byte) -101;
									else if (c == '\u0153')
									    is[i_2_] = (byte) -100;
									else if (c == '\u017e')
									    is[i_2_] = (byte) -98;
									else if (c != '\u0178')
									    is[i_2_] = (byte) 63;
									else
									    is[i_2_] = (byte) -97;
								    } else
									is[i_2_]
									    = (byte) -103;
								} else
								    is[i_2_]
									= (byte) -104;
							    } else
								is[i_2_]
								    = (byte) -108;
							} else
							    is[i_2_]
								= (byte) -109;
						    } else
							is[i_2_] = (byte) -111;
						} else
						    is[i_2_] = (byte) -114;
					    } else
						is[i_2_] = (byte) -116;
					} else
					    is[i_2_] = (byte) -120;
				    } else
					is[i_2_] = (byte) -122;
				} else
				    is[i_2_] = (byte) -123;
			    } else
				is[i_2_] = (byte) -124;
			} else
			    is[i_2_] = (byte) -125;
		    } else
			is[i_2_] = (byte) -126;
		} else
		    is[i_2_] = (byte) -128;
	    } else
		is[i_2_] = (byte) c;
	}
	return is;
    }
    
    final boolean e(byte i) {
	fb++;
	if (i != 23)
	    return true;
	return G;
    }
    
    static final void a(int i, int i_3_, String string, boolean bool, int i_4_,
			boolean bool_5_, String string_6_) {
	F++;
	((pl) sh.i).y = 1;
	string_6_ = string_6_.toLowerCase();
	short[] is = new short[16];
	int i_7_ = -1;
	String string_8_ = null;
	if ((i_4_ ^ 0xffffffff) != 0) {
	    vu var_vu = jba.b.a((byte) 6, i_4_);
	    if (var_vu == null || bool_5_ == !var_vu.a(0))
		return;
	    if (var_vu.a(0))
		string_8_ = ((vu) var_vu).m;
	    else
		i_7_ = ((vu) var_vu).h;
	}
	int i_9_ = 0;
	for (int i_10_ = 0; ((ItemDefLoader) laa.itemDefLoader).g > i_10_; i_10_++) {
	    ItemDef var_uv = laa.itemDefLoader.d(12388, i_10_);
	    if ((!bool || ((ItemDef) var_uv).Y)
		&& (((ItemDef) var_uv).o ^ 0xffffffff) == 0 && ((ItemDef) var_uv).n == -1
		&& ((ItemDef) var_uv).qb == 0
		&& (((ItemDef) var_uv).itemName.toLowerCase().indexOf(string_6_)
		    ^ 0xffffffff) != 0) {
		if ((i_4_ ^ 0xffffffff) != 0) {
		    if (bool_5_) {
			if (!string.equals(var_uv.a(string_8_, i_4_, true)))
			    continue;
		    } else if (var_uv.a(i_4_, i_7_, -109) != i)
			continue;
		}
		if (i_9_ >= 250) {
		    uh.a = -1;
		    oga.a = null;
		    return;
		}
		if (is.length <= i_9_) {
		    short[] is_11_ = new short[is.length * 2];
		    for (int i_12_ = 0; i_12_ < i_9_; i_12_++)
			is_11_[i_12_] = is[i_12_];
		    is = is_11_;
		}
		is[i_9_++] = (short) i_10_;
	    }
	}
	uh.a = i_9_;
	Class_u.N = 0;
	oga.a = is;
	String[] strings = new String[uh.a];
	for (int i_13_ = 0; i_13_ < uh.a; i_13_++)
	    strings[i_13_] = ((ItemDef) laa.itemDefLoader.d(12388, is[i_13_])).itemName;
	if (i_3_ != 339)
	    a((String) null, (byte) 15);
	wd.a(oga.a, strings, 0);
	sh.i.b(-27756);
	((pl) sh.i).y = 2;
    }
    
    final og a(boolean bool, Class_r class_r) {
	cb++;
	ida var_ida = PlayerUpdateLocation.a(((Animable) this).height, ((Animable) this).locX >> Class_fb.a,
            ((Animable) this).locY >> Class_fb.a);
	if (var_ida != null && ((qda) ((ida) var_ida).a).w) {
	    int i = ((ida) var_ida).a.g((int) 34);
	    if (i != ((ip) this).J) {
		((Animable) this).j -= ((ip) this).J;
		((Animable) this).j += i;
		((ip) this).J = i;
	    }
	}
	Class_q class_q = class_r.p();
	class_q.Y();
	if (var_ida == null || !((qda) ((ida) var_ida).a).w) {
	    boolean bool_14_ = false;
	    boolean bool_15_ = false;
	    boolean bool_16_ = false;
	    Class_i class_i = Class_q.b[((Animable) this).h];
	    int i = U << 1;
	    int i_17_ = i;
	    int i_18_ = -i / 2;
	    int i_19_ = -i_17_ / 2;
	    int i_20_ = class_i.a(((Animable) this).locY + i_19_, i_18_ + ((Animable) this).locX,
				  true);
	    int i_21_ = i / 2;
	    int i_22_ = -i_17_ / 2;
	    int i_23_ = class_i.a(i_22_ + ((Animable) this).locY, i_21_ + ((Animable) this).locX,
				  !bool);
	    int i_24_ = -i / 2;
	    int i_25_ = i_17_ / 2;
	    int i_26_ = class_i.a(i_25_ + ((Animable) this).locY, i_24_ + ((Animable) this).locX,
				  !bool);
	    int i_27_ = i / 2;
	    int i_28_ = i_17_ / 2;
	    int i_29_ = class_i.a(((Animable) this).locY + i_28_, i_27_ + ((Animable) this).locX,
				  true);
	    int i_30_ = i_23_ <= i_20_ ? i_23_ : i_20_;
	    int i_31_ = i_29_ > i_26_ ? i_26_ : i_29_;
	    int i_32_ = i_29_ > i_23_ ? i_23_ : i_29_;
	    if (i_17_ != 0) {
		int i_33_
		    = 0x3fff & (int) (Math.atan2((double) (i_30_ - i_31_),
						 (double) i_17_)
				      * 2607.5945876176133);
		if (i_33_ != 0)
		    class_q.w(i_33_);
	    }
	    int i_34_ = i_20_ < i_26_ ? i_20_ : i_26_;
	    if (i != 0) {
		int i_35_
		    = 0x3fff & (int) (Math.atan2((double) (i_34_ - i_32_),
						 (double) i)
				      * 2607.5945876176133);
		if (i_35_ != 0)
		    class_q.AA(-i_35_);
	    }
	    int i_36_ = i_20_ + i_29_;
	    if (i_26_ + i_23_ < i_36_)
		i_36_ = i_23_ + i_26_;
	    i_36_ = (i_36_ >> 1) - ((Animable) this).j;
	    if (i_36_ != 0)
		class_q.U(0, i_36_, 0);
	}
	class_q.U(((Animable) this).locX, ((Animable) this).j - 10, ((Animable) this).locY);
	og var_og = lf.a(true, 3);
	U = 0;
	G = bool;
	if ((((ip) this).W ^ 0xffffffff) != 0) {
	    da var_da = laa.itemDefLoader.d(12388, ((ip) this).W).a(0, class_r, 2048, null,
							0, null, ((ip) this).O,
							-1, 16777215);
	    if (var_da != null) {
		if (ml.k)
		    var_da.a(class_q, ((og) var_og).g[2], Class_pd.r, 0);
		else
		    var_da.a(class_q, ((og) var_og).g[2], 0);
		G |= var_da.LA();
		U = var_da.RA();
	    }
	}
	if ((((ip) this).X ^ 0xffffffff) != 0) {
	    da var_da
		= laa.itemDefLoader.d(12388, ((ip) this).X).a(0, class_r, 2048, null, 0,
						  null, ((ip) this).db, -1,
						  16777215);
	    if (var_da != null) {
		if (!ml.k)
		    var_da.a(class_q, ((og) var_og).g[1], 0);
		else
		    var_da.a(class_q, ((og) var_og).g[1], Class_pd.r, 0);
		G |= var_da.LA();
		if (var_da.RA() > U)
		    U = var_da.RA();
	    }
	}
	da var_da
	    = laa.itemDefLoader.d(12388, ((ip) this).H).a(0, class_r, 2048, null, 0, null,
					      ((ip) this).ab, -1, 16777215);
	if (var_da != null) {
	    if (!ml.k)
		var_da.a(class_q, ((og) var_og).g[0], 0);
	    else
		var_da.a(class_q, ((og) var_og).g[0], Class_pd.r, 0);
	    G |= var_da.LA();
	    if (var_da.RA() > U)
		U = var_da.RA();
	}
	return var_og;
    }
    
    final boolean g(byte i) {
	V++;
	if (i <= 114)
	    return true;
	return false;
    }
    
    static final kk a(BytesParser var_es, byte i) {
	Q++;
	iea var_iea = la.a(-120, var_es);
	int i_37_ = var_es.readInt(74);
	int i_38_ = var_es.readInt(i + 217);
	if (i != -101)
	    S = true;
	return new kk(((iea) var_iea).m, ((iea) var_iea).j, ((iea) var_iea).k,
		      ((iea) var_iea).d, ((iea) var_iea).i, ((iea) var_iea).e,
		      ((iea) var_iea).g, ((iea) var_iea).b, ((iea) var_iea).f,
		      i_37_, i_38_);
    }
    
    final boolean a(int i, int i_39_, Class_r class_r, int i_40_) {
	Y++;
	Class_q class_q = class_r.p();
	class_q.NA(((Animable) this).locX, ((Animable) this).j - 10, ((Animable) this).locY);
	da var_da
	    = laa.itemDefLoader.d(i_40_ + 2710, ((ip) this).H).a(0, class_r, 131072, null,
						     0, null, ((ip) this).ab,
						     -1, 16777215);
	if (i_40_ != 9678)
	    return true;
	if (var_da != null
	    && (ml.k ? var_da.a(i, i_39_, class_q, true, Class_pd.r)
		: var_da.a(i, i_39_, class_q, true)))
	    return true;
	if (((ip) this).X != -1) {
	    var_da = laa.itemDefLoader.d(12388, ((ip) this).X).a(0, class_r, 131072, null,
						     0, null, ((ip) this).db,
						     -1, 16777215);
	    if (var_da != null
		&& (!ml.k ? var_da.a(i, i_39_, class_q, true)
		    : var_da.a(i, i_39_, class_q, true, Class_pd.r)))
		return true;
	}
	if (((ip) this).W != -1) {
	    var_da
		= laa.itemDefLoader.d(i_40_ ^ 0x15aa, ((ip) this).W).a(0, class_r, 131072,
							   null, 0, null,
							   ((ip) this).O, -1,
							   i_40_ + 16767537);
	    if (var_da != null
		&& (ml.k ? var_da.a(i, i_39_, class_q, true, Class_pd.r)
		    : var_da.a(i, i_39_, class_q, true)))
		return true;
	}
	return false;
    }
    
    public static void a(boolean bool) {
	K = null;
	if (bool != true)
	    eb = null;
	eb = null;
    }
    
    ip(int i, int i_41_, int i_42_, int i_43_, int i_44_) {
	super(i, i_41_, i_42_, i_43_, i_44_);
	((ip) this).W = -1;
	((ip) this).J = 0;
    }
    
    static final void h(int i) {
	N++;
	if (nw.a != null) {
	    Class_ub.W = new jl();
	    Class_ub.W.a(nw.a, (byte) -123, sr.V, ((lda) nw.a).o,
			 ((lda) nw.a).k.getString((byte) 76, cba.languageID));
	    rh.o = new Thread(Class_ub.W, "");
	    if (i >= -118)
		a((BytesParser) null, (byte) 33);
	    rh.o.start();
	}
    }
    
    final int c(int i) {
	bb++;
	if (i != -22496)
	    ((ip) this).J = -45;
	return U;
    }
    
    static {
	M = 0;
    }
}
