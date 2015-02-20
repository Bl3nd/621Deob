/* bl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class bl extends Node
{
    static int k = -50;
    static int l;
    private int[] m;
    int n;
    static int o;
    static int p;
    static int q;
    static int r;
    private nba s;
    int t;
    static int u;
    static tb v = new tb(10);
    private Stream w;
    private en x;
    static int y;
    int z = 0;
    int A;
    static int B;
    private daa C;
    int D;
    private NativeHeapBuffer E;
    float F;
    static GameInPacket G = new GameInPacket(106, 6);
    static GameOutPacket H = new GameOutPacket(10, 4);
    static uaa I;
    static float J = 0.25F;
    
    final void a(int i, int i_0_, int i_1_, boolean bool) {
	m[i_0_ * ((Class_i) C).k + i_1_]
	    = hba.bitwiseArg1ORArg2(m[i_0_ * ((Class_i) C).k + i_1_], 1 << i);
	if (bool != true)
	    ((bl) this).D = 13;
	p++;
	((bl) this).z++;
    }
    
    final void a(int i, int i_2_) {
	r++;
	w.b(i_2_ * 4 + 3);
	w.d(-1);
	int i_3_ = 109 % ((i + 69) / 41);
    }
    
    static final int a(pl var_pl, int i) {
	u++;
	int i_4_ = 0;
	if (i != 65280)
	    return -118;
	if (var_pl.g(1912, mh.m))
	    i_4_++;
	if (var_pl.g(1912, vca.k))
	    i_4_++;
	if (var_pl.g(1912, ida.k))
	    i_4_++;
	if (var_pl.g(1912, bfa.y))
	    i_4_++;
	if (var_pl.g(i ^ 0xf878, mm.s))
	    i_4_++;
	if (var_pl.g(i - 63368, od.qb))
	    i_4_++;
	if (var_pl.g(1912, fs.b))
	    i_4_++;
	if (var_pl.g(i - 63368, sp.w))
	    i_4_++;
	if (var_pl.g(i ^ 0xf878, ke.G))
	    i_4_++;
	if (var_pl.g(i - 63368, dg.Eb))
	    i_4_++;
	if (var_pl.g(1912, ko.h))
	    i_4_++;
	if (var_pl.g(1912, el.c))
	    i_4_++;
	if (var_pl.g(1912, qaa.Q))
	    i_4_++;
	if (var_pl.g(i - 63368, vu.g))
	    i_4_++;
	if (var_pl.g(1912, bq.h))
	    i_4_++;
	if (var_pl.g(i ^ 0xf878, mw.H))
	    i_4_++;
	return i_4_;
    }
    
    final void b(int i, int i_5_) {
	l++;
	E = x.a(i * i_5_, (byte) 78, true);
	w = new Stream(E, 0, i * 4);
    }
    
    final void a(int i, int i_6_, byte i_7_, float f, int i_8_) {
	if ((((bl) this).n ^ 0xffffffff) != 0) {
	    vca var_vca = ((Class_r) x).j.a(((bl) this).n, (byte) 86);
	    int i_9_ = 0xff & ((vca) var_vca).q;
	    if (i_9_ != 0 && ((vca) var_vca).i != 4) {
		int i_10_;
		if (i_6_ >= 0) {
		    if (i_6_ <= 127)
			i_10_ = 131586 * i_6_;
		    else
			i_10_ = 16777215;
		} else
		    i_10_ = 0;
		if (i_9_ == 256)
		    i = i_10_;
		else {
		    int i_11_ = i_9_;
		    int i_12_ = 256 - i_9_;
		    i = ((0xff0000
			  & (0xff00 & i) * i_12_ + (0xff00 & i_10_) * i_11_)
			 + ((0xff00ff & i_10_) * i_11_ + (i & 0xff00ff) * i_12_
			    & ~0xff00ff)) >> 8;
		}
	    }
	    int i_13_ = 0xff & ((vca) var_vca).f;
	    if (i_13_ != 0) {
		i_13_ += 256;
		int i_14_ = (i >> 16 & 0xff) * i_13_;
		if (i_14_ > 65535)
		    i_14_ = 65535;
		int i_15_ = i_13_ * ((i & 0xff00) >> 8);
		if (i_15_ > 65535)
		    i_15_ = 65535;
		int i_16_ = i_13_ * (i & 0xff);
		if (i_16_ > 65535)
		    i_16_ = 65535;
		i = (0xff002d & i_14_ << 8) - (-(i_16_ >> 8)
					       - (i_15_ & 0xff00));
	    }
	}
	q++;
	if (i_7_ >= -33)
	    a((byte) 106, 8);
	w.b(4 * i_8_);
	if (f != 1.0F) {
	    int i_17_ = (i & 0xff6818) >> 16;
	    int i_18_ = i >> 8 & 0xff;
	    i_17_ *= f;
	    int i_19_ = i & 0xff;
	    if (i_17_ >= 0) {
		if (i_17_ > 255)
		    i_17_ = 255;
	    } else
		i_17_ = 0;
	    i_18_ *= f;
	    if (i_18_ < 0)
		i_18_ = 0;
	    else if (i_18_ > 255)
		i_18_ = 255;
	    i_19_ *= f;
	    if (i_19_ >= 0) {
		if (i_19_ > 255)
		    i_19_ = 255;
	    } else
		i_19_ = 0;
	    i = i_18_ << 8 | i_17_ << 16 | i_19_;
	}
	if (((en) x).If == 0) {
	    w.d((byte) i);
	    w.d((byte) (i >> 8));
	    w.d((byte) (i >> 16));
	} else {
	    w.d((byte) (i >> 16));
	    w.d((byte) (i >> 8));
	    w.d((byte) i);
	}
    }
    
    static final boolean c(int i, int i_20_) {
	B++;
	if (i_20_ < 30)
	    c(-39, -128);
	if (i != 60 && i != 45 && i != 1011 && i != 57 && i != 50)
	    return false;
	return true;
    }
    
    final void a(byte i, int i_21_) {
	if (i <= 11)
	    a((int) 42, -80);
	y++;
	w.c();
	s = x.a(false, false);
	s.a(E, 4, 4 * i_21_, (byte) 92);
	E = null;
	w = null;
    }
    
    final void a(int[] is, int i, int i_22_) {
	o++;
	hh var_hh = x.c((int) -116, ((bl) this).z * 3);
	Buffer buffer = var_hh.a((byte) -88, true);
	if (buffer != null) {
	    Stream stream = x.a(buffer, 96);
	    int i_23_ = 0;
	    int i_24_ = 32767;
	    int i_25_ = -32768;
	    if (i != 1602853160)
		a(-30, -55, (byte) 69, -1.690743F, 115);
	    if (!Stream.a()) {
		for (int i_26_ = 0; i_26_ < i_22_; i_26_++) {
		    int i_27_ = is[i_26_];
		    short[] is_28_ = ((daa) C).O[i_27_];
		    int i_29_ = m[i_27_];
		    if (i_29_ != 0 && is_28_ != null) {
			int i_30_ = 0;
			int i_31_ = 0;
			while (i_31_ < is_28_.length) {
			    if ((i_29_ & 1 << i_30_++) != 0) {
				for (int i_32_ = 0; i_32_ < 3; i_32_++) {
				    int i_33_ = is_28_[i_31_++] & 0xffff;
				    if (i_33_ > i_25_)
					i_25_ = i_33_;
				    stream.e(i_33_);
				    if (i_33_ < i_24_)
					i_24_ = i_33_;
				}
				i_23_++;
			    } else
				i_31_ += 3;
			}
		    }
		}
	    } else {
		for (int i_34_ = 0; i_22_ > i_34_; i_34_++) {
		    int i_35_ = is[i_34_];
		    short[] is_36_ = ((daa) C).O[i_35_];
		    int i_37_ = m[i_35_];
		    if (i_37_ != 0 && is_36_ != null) {
			int i_38_ = 0;
			int i_39_ = 0;
			while (i_39_ < is_36_.length) {
			    if ((i_37_ & 1 << i_38_++) == 0)
				i_39_ += 3;
			    else {
				i_23_++;
				for (int i_40_ = 0; i_40_ < 3; i_40_++) {
				    int i_41_ = 0xffff & is_36_[i_39_++];
				    if (i_41_ < i_24_)
					i_24_ = i_41_;
				    stream.c(i_41_);
				    if (i_41_ > i_25_)
					i_25_ = i_41_;
				}
			    }
			}
		    }
		}
	    }
	    stream.c();
	    if (var_hh.b((byte) 42) && i_23_ > 0) {
		x.a(0, ((bl) this).n, (0x7 & ((daa) C).N) != 0,
		    (((daa) C).N & 0x8) != 0);
		if (((en) x).We)
		    x.YA(2147483647, ((bl) this).A, ((bl) this).D,
			 ((bl) this).t);
		mga var_mga = x.E(126);
		var_mga.b(1.0F / ((bl) this).F, 18543, 1.0F / ((bl) this).F,
			  1.0F);
		x.a(112, at.I);
		x.a((byte) -16, s, 1);
		x.a(true, ((daa) C).jb);
		x.a(i_25_ - i_24_ + 1, mo.E, 0, 12896, i_23_, i_24_, var_hh);
		x.j((byte) -70);
	    }
	}
    }
    
    public static void a(int i) {
	v = null;
	I = null;
	if (i > -86)
	    a(81);
	H = null;
	G = null;
    }
    
    bl(daa var_daa, int i, int i_42_, int i_43_, int i_44_, int i_45_) {
	C = var_daa;
	x = ((daa) C).D;
	((bl) this).D = i_44_;
	((bl) this).n = i;
	((bl) this).A = i_43_;
	((bl) this).F = (float) i_42_;
	((bl) this).t = i_45_;
	m = new int[((Class_i) C).j * ((Class_i) C).k];
    }
}
