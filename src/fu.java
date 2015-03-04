/* fu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class fu implements hfa
{
    static int a = 0;
    static pl b;
    static int c;
    lm d;
    static qn e;
    static boolean f;
    static int g;
    static int h;
    private int i;
    private boolean j;
    private mv k = dda.d;
    static int l;
    static int m;
    static int n;
    Class_ec o;
    private int p;
    static int q;
    static int r;
    static int s;
    static int t;
    int u;
    static int fps = 0;
    static int w;
    bt x;
    static int y;
    static int z;
    static int A;
    static int B;
    
    final void a(int i, byte i_0_, int i_1_, int[] is, int i_2_) {
	l++;
	if (i > 0 && !ar.a(i, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i_2_ > 0 && !ar.a(i_2_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (nda.h != ((fu) this).o)
	    throw new IllegalArgumentException("");
	int i_3_ = 0;
	int i_4_ = i >= i_2_ ? i_2_ : i;
	if (i_0_ >= -45)
	    a((byte) -27, (String) null);
	int i_5_ = i >> 1;
	int i_6_ = i_2_ >> 1;
	int[] is_7_ = is;
	int[] is_8_ = new int[i_6_ * i_5_];
	for (;;) {
	    OpenGL.glTexImage2Di(i_1_, i_3_, e(26701), i, i_2_, 0, 32993,
				 ((lm) ((fu) this).d).ti, is_7_, 0);
	    if (i_4_ <= 1)
		break;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    int i_11_ = i_10_ + i;
	    for (int i_12_ = 0; i_12_ < i_6_; i_12_++) {
		for (int i_13_ = 0; i_13_ < i_5_; i_13_++) {
		    int i_14_ = is_7_[i_10_++];
		    int i_15_ = is_7_[i_11_++];
		    int i_16_ = is_7_[i_10_++];
		    int i_17_ = 0xff & i_14_ >> 16;
		    int i_18_ = 0xff & i_14_;
		    int i_19_ = i_14_ >> 24 & 0xff;
		    int i_20_ = is_7_[i_11_++];
		    int i_21_ = (i_14_ & 0xff7e) >> 8;
		    i_18_ += 0xff & i_16_;
		    i_19_ += i_16_ >> 24 & 0xff;
		    i_21_ += (i_16_ & 0xff40) >> 8;
		    i_17_ += i_16_ >> 16 & 0xff;
		    i_18_ += 0xff & i_15_;
		    i_17_ += 0xff & i_15_ >> 16;
		    i_19_ += i_15_ >> 24 & 0xff;
		    i_21_ += i_15_ >> 8 & 0xff;
		    i_21_ += i_20_ >> 8 & 0xff;
		    i_18_ += i_20_ & 0xff;
		    i_19_ += i_20_ >> 24 & 0xff;
		    i_17_ += i_20_ >> 16 & 0xff;
		    is_8_[i_9_++]
			= hba.bitwiseArg1ORArg2(uca.a(i_18_, 1020) >> 2,
				hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(uca.a(i_19_ << 22, -16777216),
					    uca.a(i_17_ << 14, 16711680)),
				      uca.a(1020, i_21_) << 6));
		}
		i_11_ += i;
		i_10_ += i;
	    }
	    int[] is_22_ = is_8_;
	    is_8_ = is_7_;
	    is_7_ = is_22_;
	    i_2_ = i_6_;
	    i = i_5_;
	    i_3_++;
	    i_5_ >>= 1;
	    i_6_ >>= 1;
	    i_4_ >>= 1;
	}
    }
    
    private final void c(int i) {
	((fu) this).d.a(this, 0);
	if (i != 1859)
	    a(-27, -32, (byte) 111, null, -94);
	n++;
	if (k != dda.d) {
	    OpenGL.glTexParameteri(((fu) this).u, 10241, !j ? 9728 : 9984);
	    OpenGL.glTexParameteri(((fu) this).u, 10240, 9728);
	} else {
	    OpenGL.glTexParameteri(((fu) this).u, 10241, j ? 9987 : 9729);
	    OpenGL.glTexParameteri(((fu) this).u, 10240, 9729);
	}
    }
    
    protected final void finalize() throws Throwable {
	y++;
	b((byte) -65);
	super.finalize();
    }
    
    final void a(int i, int i_23_, byte[] is, int i_24_, byte i_25_) {
	h++;
	if (i_23_ > 0 && !ar.a(i_23_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i_24_ > 0 && !ar.a(i_24_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i_25_ == -33) {
	    int i_26_ = ((Class_ec) ((fu) this).o).d;
	    int i_27_ = 0;
	    int i_28_ = i_24_ > i_23_ ? i_23_ : i_24_;
	    int i_29_ = i_23_ >> 1;
	    int i_30_ = i_24_ >> 1;
	    byte[] is_31_ = is;
	    byte[] is_32_ = new byte[i_30_ * (i_29_ * i_26_)];
	    for (;;) {
		OpenGL.glTexImage2Dub(i, i_27_, e(26701), i_23_, i_24_, 0,
				      Animable.a(6407, ((fu) this).o), 5121, is_31_,
				      0);
		if (i_28_ <= 1)
		    break;
		int i_33_ = i_23_ * i_26_;
		byte[] is_34_ = is_32_;
		for (int i_35_ = 0; i_26_ > i_35_; i_35_++) {
		    int i_36_ = i_35_;
		    int i_37_ = i_35_;
		    int i_38_ = i_33_ + i_37_;
		    for (int i_39_ = 0; i_30_ > i_39_; i_39_++) {
			for (int i_40_ = 0; i_29_ > i_40_; i_40_++) {
			    int i_41_ = is_31_[i_37_];
			    i_37_ += i_26_;
			    i_41_ += is_31_[i_37_];
			    i_37_ += i_26_;
			    i_41_ += is_31_[i_38_];
			    i_38_ += i_26_;
			    i_41_ += is_31_[i_38_];
			    is_32_[i_36_] = (byte) (i_41_ >> 2);
			    i_38_ += i_26_;
			    i_36_ += i_26_;
			}
			i_38_ += i_33_;
			i_37_ += i_33_;
		    }
		}
		is_32_ = is_31_;
		i_23_ = i_29_;
		is_31_ = is_34_;
		i_24_ = i_30_;
		i_27_++;
		i_28_ >>= 1;
		i_30_ >>= 1;
		i_29_ >>= 1;
	    }
	}
    }
    
    static final boolean a(int i, int i_42_, int i_43_, ev var_ev,
			   boolean bool) {
	m++;
	if (!il.occlude)
	    return false;
	if (io.X < 100)
	    return false;
	if (!vk.a(i, i_43_, -1, i_42_))
	    return false;
	int i_44_ = i_43_ << Class_fb.a;
	int i_45_ = i_42_ << Class_fb.a;
	int i_46_ = Class_q.b[i].a(i_42_, (byte) 51, i_43_) - 1;
	int i_47_ = var_ev.g((int) -108) + i_46_;
	if (((ev) var_ev).A == 1) {
	    if (!cda.a(i_47_, i_47_, i_45_ + bea.o, 26403, i_45_, i_45_, i_44_,
		       i_46_, i_44_, i_44_))
		return false;
	    if (!cda.a(i_46_, i_47_, i_45_ + bea.o, 26403, i_45_,
		       bea.o + i_45_, i_44_, i_46_, i_44_, i_44_))
		return false;
	    mu.g++;
	    return true;
	}
	if (((ev) var_ev).A == 2) {
	    if (!cda.a(i_47_, i_47_, i_45_ + bea.o, 26403, i_45_ + bea.o,
		       i_45_ + bea.o, bea.o + i_44_, i_46_, i_44_, i_44_))
		return false;
	    if (!cda.a(i_47_, i_46_, bea.o + i_45_, 26403, bea.o + i_45_,
		       i_45_ + bea.o, bea.o + i_44_, i_46_, bea.o + i_44_,
		       i_44_))
		return false;
	    mu.g++;
	    return true;
	}
	if (((ev) var_ev).A == 4) {
	    if (!cda.a(i_47_, i_47_, i_45_ + bea.o, 26403, i_45_, i_45_,
		       bea.o + i_44_, i_46_, i_44_ + bea.o, bea.o + i_44_))
		return false;
	    if (!cda.a(i_46_, i_47_, bea.o + i_45_, 26403, i_45_,
		       i_45_ + bea.o, bea.o + i_44_, i_46_, bea.o + i_44_,
		       bea.o + i_44_))
		return false;
	    mu.g++;
	    return true;
	}
	if (((ev) var_ev).A == 8) {
	    if (!cda.a(i_47_, i_47_, i_45_, 26403, i_45_, i_45_, bea.o + i_44_,
		       i_46_, i_44_, i_44_))
		return false;
	    if (!cda.a(i_47_, i_46_, i_45_, 26403, i_45_, i_45_, i_44_ + bea.o,
		       i_46_, i_44_ + bea.o, i_44_))
		return false;
	    mu.g++;
	    return true;
	}
	if (((ev) var_ev).A == 16) {
	    if (!dd.a(!bool, dba.k, i_47_, i_45_ + dba.k, i_46_, i_44_, dba.k))
		return false;
	    mu.g++;
	    return true;
	}
	if (bool != true)
	    fps = -70;
	if (((ev) var_ev).A == 32) {
	    if (!dd.a(false, dba.k, i_47_, i_45_ + dba.k, i_46_, i_44_ + dba.k,
		      dba.k))
		return false;
	    mu.g++;
	    return true;
	}
	if (((ev) var_ev).A == 64) {
	    if (!dd.a(false, dba.k, i_47_, i_45_, i_46_, dba.k + i_44_, dba.k))
		return false;
	    mu.g++;
	    return true;
	}
	if (((ev) var_ev).A == 128) {
	    if (!dd.a(!bool, dba.k, i_47_, i_45_, i_46_, i_44_, dba.k))
		return false;
	    mu.g++;
	    return true;
	}
	return true;
    }
    
    private final void a(int i, byte i_48_) {
	if (i_48_ == -126) {
	    ((en) ((fu) this).d).Nd -= i;
	    s++;
	    ((en) ((fu) this).d).Nd += f(i_48_ + 233);
	}
    }
    
    public static void d(int i) {
	b = null;
	e = null;
	if (i != -865)
	    a((byte) 26, (String) null);
    }
    
    final int e(int i) {
	q++;
	if (i != 26701)
	    ((fu) this).d = null;
	if (((fu) this).x != bt.g) {
	    if (bt.j == ((fu) this).x) {
		if (((fu) this).o != uca.d) {
		    if (nda.h == ((fu) this).o)
			return 34842;
		    if (NPCDef.hb == ((fu) this).o)
			return 34844;
		    if (((fu) this).o != Class_jc.S) {
			if (NPC.Xc != ((fu) this).o) {
			    if (((fu) this).o == dt.zb)
				return 6145;
			} else
			    return 34847;
		    } else
			return 34846;
		} else
		    return 34843;
	    } else if (bt.k == ((fu) this).x) {
		if (uca.d == ((fu) this).o)
		    return 34837;
		if (((fu) this).o == nda.h)
		    return 34836;
		if (NPCDef.hb != ((fu) this).o) {
		    if (((fu) this).o == Class_jc.S)
			return 34840;
		    if (NPC.Xc == ((fu) this).o)
			return 34841;
		    if (dt.zb == ((fu) this).o)
			return 6145;
		} else
		    return 34838;
	    }
	} else if (uca.d != ((fu) this).o) {
	    if (((fu) this).o == nda.h)
		return 6408;
	    if (NPCDef.hb == ((fu) this).o)
		return 6406;
	    if (((fu) this).o == Class_jc.S)
		return 6409;
	    if (((fu) this).o != NPC.Xc) {
		if (((fu) this).o == dt.zb)
		    return 6145;
	    } else
		return 6410;
	} else
	    return 6407;
	throw new IllegalStateException();
    }
    
    public final void a(mv var_mv, int i) {
	if (var_mv != k) {
	    k = var_mv;
	    c(1859);
	}
	if (i == 15590)
	    w++;
    }
    
    public final void a(int i) {
	if (i == 9258) {
	    A++;
	    int i_49_ = ((fu) this).d.L(i - 9381);
	    int i_50_ = ((lm) ((fu) this).d).Ai[i_49_];
	    if (((fu) this).u != i_50_) {
		if (i_50_ != 0) {
		    OpenGL.glBindTexture(i_50_, 0);
		    OpenGL.glDisable(i_50_);
		}
		OpenGL.glEnable(((fu) this).u);
		((lm) ((fu) this).d).Ai[i_49_] = ((fu) this).u;
	    }
	    OpenGL.glBindTexture(((fu) this).u, this.i);
	}
    }
    
    static final String a(byte i, String string) {
	B++;
	StringBuffer stringbuffer = new StringBuffer();
	if (i != 100)
	    return null;
	int i_51_ = string.length();
	for (int i_52_ = 0; i_51_ > i_52_; i_52_++) {
	    char c = string.charAt(i_52_);
	    if (c != 37 || i_52_ + 2 >= i_51_) {
		if (c == 43)
		    stringbuffer.append(' ');
		else
		    stringbuffer.append(c);
	    } else {
		c = string.charAt(i_52_ + 1);
		boolean bool = false;
		int i_53_;
		if (c >= 48 && c <= 57)
		    i_53_ = c - 48;
		else if (c >= 97 && c <= 102)
		    i_53_ = c - 87;
		else {
		    if (c < 65 || c > 70) {
			stringbuffer.append('%');
			continue;
		    }
		    i_53_ = c + 10 - 65;
		}
		i_53_ *= 16;
		int i_54_ = string.charAt(i_52_ + 2);
		if (i_54_ < 48 || i_54_ > 57) {
		    if (i_54_ >= 97 && i_54_ <= 102)
			i_53_ += 10 + i_54_ - 97;
		    else if (i_54_ >= 65 && i_54_ <= 70)
			i_53_ += i_54_ + 10 - 65;
		    else {
			stringbuffer.append('%');
			continue;
		    }
		} else
		    i_53_ += i_54_ - 48;
		i_52_ += 2;
		if (i_53_ != 0 && rc.a((byte) -84, (byte) i_53_))
		    stringbuffer.append(eq.a((byte) 94, (byte) i_53_));
	    }
	}
	return stringbuffer.toString();
    }
    
    final void a(int i, int i_55_, byte i_56_, float[] fs, int i_57_) {
	g++;
	if (i_55_ > 0 && !ar.a(i_55_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i > 0 && !ar.a(i, (byte) 98))
	    throw new IllegalArgumentException("");
	int i_58_ = ((Class_ec) ((fu) this).o).d;
	int i_59_ = 0;
	int i_60_ = -46 / ((-60 - i_56_) / 43);
	int i_61_ = i_55_ < i ? i_55_ : i;
	int i_62_ = i_55_ >> 1;
	int i_63_ = i >> 1;
	float[] fs_64_ = fs;
	float[] fs_65_ = new float[i_62_ * i_63_ * i_58_];
	for (;;) {
	    OpenGL.glTexImage2Df(i_57_, i_59_, e(26701), i_55_, i, 0,
				 Animable.a(6407, ((fu) this).o), 5126, fs_64_, 0);
	    if (i_61_ <= 1)
		break;
	    int i_66_ = i_55_ * i_58_;
	    float[] fs_67_ = fs_65_;
	    for (int i_68_ = 0; i_68_ < i_58_; i_68_++) {
		int i_69_ = i_68_;
		int i_70_ = i_68_;
		int i_71_ = i_70_ + i_66_;
		for (int i_72_ = 0; i_63_ > i_72_; i_72_++) {
		    for (int i_73_ = 0; i_73_ < i_62_; i_73_++) {
			float f = fs_64_[i_70_];
			i_70_ += i_58_;
			f += fs_64_[i_70_];
			f += fs_64_[i_71_];
			i_70_ += i_58_;
			i_71_ += i_58_;
			f += fs_64_[i_71_];
			fs_65_[i_69_] = 0.25F * f;
			i_71_ += i_58_;
			i_69_ += i_58_;
		    }
		    i_70_ += i_66_;
		    i_71_ += i_66_;
		}
	    }
	    fs_65_ = fs_64_;
	    i_55_ = i_62_;
	    i = i_63_;
	    fs_64_ = fs_67_;
	    i_59_++;
	    i_63_ >>= 1;
	    i_61_ >>= 1;
	    i_62_ >>= 1;
	}
    }
    
    static final void a(int i, int i_74_) {
	synchronized (bd.j) {
	    bd.j.a(true, i_74_);
	}
	r++;
	synchronized (Class_ad.k) {
	    if (i != 0) {
		/* empty */
	    } else
		Class_ad.k.a(true, i_74_);
	}
    }
    
    private final void b(byte i) {
	if (i != -65)
	    b = null;
	if (this.i > 0) {
	    ((fu) this).d.a(this.i, 0, f(102));
	    this.i = 0;
	}
	z++;
    }
    
    private final int f(int i) {
	t++;
	int i_75_
	    = p * (((bt) ((fu) this).x).c * ((Class_ec) ((fu) this).o).d);
	if (i < 62)
	    a(-38);
	if (!j)
	    return i_75_;
	return i_75_ * 4 / 3;
    }
    
    fu(lm var_lm, int i, Class_ec class_ec, bt var_bt, int i_76_,
       boolean bool) {
	((fu) this).o = class_ec;
	((fu) this).x = var_bt;
	((fu) this).u = i;
	p = i_76_;
	((fu) this).d = var_lm;
	j = bool;
	OpenGL.glGenTextures(1, sk.w, 0);
	this.i = sk.w[0];
	c(1859);
	a(0, (byte) -126);
    }
    
    static {
	f = false;
    }
}
