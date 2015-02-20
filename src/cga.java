/* cga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cga extends Node
{
    static int k;
    private fw l;
    private gv m;
    private float[][] n;
    private gga o;
    private dw p;
    private int q;
    private dga r;
    static int s;
    private int t;
    private nl u;
    static long v = 0L;
    static int w;
    static Object x;
    static int y;
    private int z;
    private float[][] A;
    private int B;
    private il C;
    private int D;
    static int E;
    private gv F;
    private BytesParser G;
    private qj H;
    static int I;
    static int J;
    static int L;
    private int M;
    private float[][] N;
    static int O;
    
    static final boolean a(byte i) {
	k++;
	try {
	    if (pj.j == 2) {
		if (ak.i == null) {
		    ak.i = vw.a(Class_vb.s, ha.u, ifa.a);
		    if (ak.i == null)
			return false;
		}
		if (Node.a == null)
		    Node.a = new pj(Animable.pl_, qs.h);
		if (ou.g.a(re.e, ak.i, (byte) 116, 22050, Node.a)) {
		    ou.g.d((byte) -53);
		    if (dt.nb > 0) {
			pj.j = 3;
			ou.g.b(-120, 0);
		    } else {
			pj.j = 0;
			ou.g.b(-73, uaa.e);
		    }
		    if (wl.g > 0L)
			ou.g.a(wl.g, ak.i, -104, nj.m, true);
		    else
			ou.g.a(ak.i, nj.m, 4096);
		    ak.i = null;
		    wl.g = 0L;
		    Class_vb.s = null;
		    Node.a = null;
		    return true;
		}
	    }
	    int i_0_ = 43 / ((i + 87) / 36);
	} catch (Exception exception) {
	    exception.printStackTrace();
	    ou.g.b((int) 32);
	    Node.a = null;
	    pj.j = 0;
	    ak.i = null;
	    Class_vb.s = null;
	}
	return false;
    }
    
    public static void a(int i) {
	if (i == 1)
	    x = null;
    }
    
    static final void a(boolean bool) {
	J++;
	kba.o.a(18385);
	if (bool != true)
	    E = -96;
    }
    
    static final void a(int i, Interface var_kp, int i_1_, int i_2_) {
	y++;
	if (i != 16383)
	    a((byte) -22);
	ua var_ua = var_kp.a((byte) 125, lg.r);
	if (var_ua != null) {
	    lg.r.da(i_1_, i_2_, i_1_ + ((Interface) var_kp).minHScroll,
		    ((Interface) var_kp).minVScroll + i_2_);
	    if (qaa.T >= 3)
		lg.r.FA(-16777216, var_ua, i_1_, i_2_);
	    else
		pk.b.a((float) i_1_ + (float) ((Interface) var_kp).minHScroll / 2.0F,
		       (float) ((Interface) var_kp).minVScroll / 2.0F + (float) i_2_, 4096,
		       (0x3fff & (int) -qw.n) << 2, var_ua, i_1_, i_2_);
	}
    }
    
    final void a(int i, boolean[][] bools, int i_3_, int i_4_, int i_5_) {
	I++;
	if (p != null && B <= i_3_ + i_4_) {
	    int i_6_ = 96 / ((8 - i) / 52);
	    if (M >= i_3_ - i_4_ && i_5_ + i_4_ >= t && D >= i_5_ - i_4_) {
		for (int i_7_ = t; i_7_ <= D; i_7_++) {
		    for (int i_8_ = B; i_8_ <= M; i_8_++) {
			int i_9_ = i_8_ - i_3_;
			int i_10_ = i_7_ - i_5_;
			if (-i_4_ < i_9_ && i_9_ < i_4_ && -i_4_ < i_10_
			    && i_10_ < i_4_
			    && bools[i_4_ + i_9_][i_10_ + i_4_]) {
			    H.e(-29455, (int) (o.b((int) 100) * 255.0F) << 24);
			    H.a(m, (byte) 21, F, null, null);
			    H.a(q, 0, 4, p, 255);
			    return;
			}
		    }
		}
	    }
	}
    }
    
    private final void a(short i, byte i_11_) {
	if (((qj) H).ig)
	    G.writeShort(i, 13469);
	else
	    G.writeShortReversed2(i, (byte) 0);
	if (i_11_ > 60)
	    O++;
    }
    
    private final void a(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			 int i_16_, int i_17_) {
	L++;
	long l = -1L;
	int i_18_ = (i_15_ << ((Class_i) r).g) + i_12_;
	int i_19_ = i_16_ + (i_13_ << ((Class_i) r).g);
	int i_20_ = r.a(i_19_, i_18_, true);
	if ((0x7f & i_12_) == 0 || (0x7f & i_16_) == 0) {
	    l = (0xffffL & (long) i_19_) << 16 | 0xffffL & (long) i_18_;
	    Node class_d = C.a(i ^ ~0x4ea0, l);
	    if (class_d != null) {
		a(((lk) (lk) class_d).n, (byte) 67);
		return;
	    }
	}
	short i_21_ = (short) z++;
	if (l != -1L)
	    C.a(new lk(i_21_), (byte) -81, l);
	float f;
	float f_22_;
	float f_23_;
	if (i_12_ == 0 && i_16_ == 0) {
	    f_22_ = N[i_17_][i_14_];
	    f = n[i_17_][i_14_];
	    f_23_ = A[i_17_][i_14_];
	} else if (i_12_ != ((Class_i) r).b || i_16_ != 0) {
	    if (((Class_i) r).b == i_12_ && ((Class_i) r).b == i_16_) {
		f = n[i_17_ + 1][i_14_ + 1];
		f_22_ = N[i_17_ + 1][i_14_ + 1];
		f_23_ = A[i_17_ + 1][i_14_ + 1];
	    } else if (i_12_ == 0 && ((Class_i) r).b == i_16_) {
		f = n[i_17_][i_14_ + 1];
		f_22_ = N[i_17_][i_14_ + 1];
		f_23_ = A[i_17_][i_14_ + 1];
	    } else {
		float f_24_ = (float) i_12_ / (float) ((Class_i) r).b;
		float f_25_ = (float) i_16_ / (float) ((Class_i) r).b;
		float f_26_ = N[i_17_][i_14_];
		float f_27_ = A[i_17_][i_14_];
		float f_28_ = n[i_17_][i_14_];
		float f_29_ = N[i_17_ + 1][i_14_];
		float f_30_ = A[i_17_ + 1][i_14_];
		f_26_ += f_24_ * (N[i_17_][i_14_ + 1] - f_26_);
		f_30_ += f_24_ * (A[i_17_ + 1][i_14_ + 1] - f_30_);
		float f_31_ = n[i_17_ + 1][i_14_];
		f_28_ += (n[i_17_][i_14_ + 1] - f_28_) * f_24_;
		f_29_ += (N[i_17_ + 1][i_14_ + 1] - f_29_) * f_24_;
		f_27_ += f_24_ * (A[i_17_][i_14_ + 1] - f_27_);
		f_31_ += f_24_ * (n[i_17_ + 1][i_14_ + 1] - f_31_);
		f_22_ = f_26_ + f_25_ * (f_29_ - f_26_);
		f_23_ = (f_30_ - f_27_) * f_25_ + f_27_;
		f = f_28_ + (f_31_ - f_28_) * f_25_;
	    }
	} else {
	    f = n[i_17_ + 1][i_14_];
	    f_23_ = A[i_17_ + 1][i_14_];
	    f_22_ = N[i_17_ + 1][i_14_];
	}
	if (i == 12619) {
	    float f_32_ = (float) (o.a(true) - i_18_);
	    float f_33_ = (float) (o.i(-55) - i_20_);
	    float f_34_ = (float) (o.b((byte) 119) - i_19_);
	    float f_35_ = (float) Math.sqrt((double) (f_34_ * f_34_
						      + (f_33_ * f_33_
							 + f_32_ * f_32_)));
	    float f_36_ = 1.0F / f_35_;
	    f_34_ *= f_36_;
	    f_32_ *= f_36_;
	    f_33_ *= f_36_;
	    float f_37_ = f_35_ / (float) o.a((byte) -53);
	    float f_38_ = -(f_37_ * f_37_) + 1.0F;
	    if (f_38_ < 0.0F)
		f_38_ = 0.0F;
	    float f_39_ = f_33_ * f_23_ + f_22_ * f_32_ + f * f_34_;
	    if (f_39_ < 0.0F)
		f_39_ = 0.0F;
	    float f_40_ = f_38_ * f_39_ * 2.0F;
	    if (f_40_ > 1.0F)
		f_40_ = 1.0F;
	    int i_41_ = o.a((int) 122);
	    int i_42_ = (int) (f_40_ * (float) ((0xff8848 & i_41_) >> 16));
	    if (i_42_ > 255)
		i_42_ = 255;
	    int i_43_ = (int) (f_40_ * (float) (i_41_ >> 8 & 0xff));
	    if (i_43_ > 255)
		i_43_ = 255;
	    int i_44_ = (int) (f_40_ * (float) (i_41_ & 0xff));
	    if (i_44_ > 255)
		i_44_ = 255;
	    if (!((qj) H).ig) {
		this.l.a((byte) -71, (float) i_18_);
		this.l.a((byte) -71, (float) i_20_);
		this.l.a((byte) -71, (float) i_19_);
	    } else {
		this.l.a((float) i_18_, -92);
		this.l.a((float) i_20_, i ^ ~0x312b);
		this.l.a((float) i_19_, -124);
	    }
        System.out.println("[cga]");
	    this.l.writeByte(i_42_, (byte) -128);
	    this.l.writeByte(i_43_, (byte) -117);
	    this.l.writeByte(i_44_, (byte) -108);
	    this.l.writeByte(255, (byte) -117);
	    a(i_21_, (byte) 88);
	}
    }
    
    cga(qj var_qj, dga var_dga, gga var_gga, int[] is) {
	r = var_dga;
	H = var_qj;
	o = var_gga;
	int i = o.a((byte) -54) - (((Class_i) var_dga).b >> 1);
	B = o.a(true) - i >> ((Class_i) var_dga).g;
	M = o.a(true) + i >> ((Class_i) var_dga).g;
	t = o.b((byte) 119) - i >> ((Class_i) var_dga).g;
	D = o.b((byte) 119) + i >> ((Class_i) var_dga).g;
	int i_45_ = -B + 1 + M;
	int i_46_ = D + 1 - t;
	n = new float[i_45_ + 1][i_46_ + 1];
	A = new float[i_45_ + 1][i_46_ + 1];
	N = new float[i_45_ + 1][i_46_ + 1];
	for (int i_47_ = 0; i_46_ >= i_47_; i_47_++) {
	    int i_48_ = t + i_47_;
	    if (i_48_ > 0 && i_48_ < ((Class_i) r).j - 1) {
		for (int i_49_ = 0; i_45_ >= i_49_; i_49_++) {
		    int i_50_ = B + i_49_;
		    if (i_50_ > 0 && ((Class_i) r).k - 1 > i_50_) {
			int i_51_ = (var_dga.a(i_48_, (byte) 51, i_50_ + 1)
				     - var_dga.a(i_48_, (byte) 51, i_50_ - 1));
			int i_52_ = (var_dga.a(i_48_ + 1, (byte) 51, i_50_)
				     - var_dga.a(i_48_ - 1, (byte) 51, i_50_));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_51_ * i_51_
							     + 65536
							     + (i_52_
								* i_52_))));
			N[i_49_][i_47_] = (float) i_51_ * f;
			A[i_49_][i_47_] = -256.0F * f;
			n[i_49_][i_47_] = (float) i_52_ * f;
		    }
		}
	    }
	}
	int i_53_ = 0;
	for (int i_54_ = t; D >= i_54_; i_54_++) {
	    if (i_54_ >= 0 && ((Class_i) var_dga).j > i_54_) {
		for (int i_55_ = B; i_55_ <= M; i_55_++) {
		    if (i_55_ >= 0 && i_55_ < ((Class_i) var_dga).k) {
			int i_56_ = is[i_53_];
			int[] is_57_ = ((dga) var_dga).I[i_55_][i_54_];
			if (is_57_ != null && i_56_ != 0) {
			    if (i_56_ == 1) {
				int i_58_ = 0;
				while (is_57_.length > i_58_) {
				    if (is_57_[i_58_++] != -1
					&& is_57_[i_58_++] != -1
					&& (is_57_[i_58_++] ^ 0xffffffff) != 0)
					q += 3;
				}
			    } else
				q += 3;
			}
		    }
		    i_53_++;
		}
	    } else
		i_53_ += M - B;
	}
	if (q > 0) {
	    G = new BytesParser(2 * q);
	    l = new fw(q * 16);
	    C = new il(dfa.a(q, 128));
	    int i_59_ = 0;
	    i_53_ = 0;
	    for (int i_60_ = t; D >= i_60_; i_60_++) {
		if (i_60_ < 0 || i_60_ >= ((Class_i) var_dga).j)
		    i_53_ += M - B;
		else {
		    int i_61_ = 0;
		    for (int i_62_ = B; M >= i_62_; i_62_++) {
			if (i_62_ >= 0 && i_62_ < ((Class_i) var_dga).k) {
			    int i_63_ = is[i_53_];
			    int[] is_64_ = ((dga) var_dga).I[i_62_][i_60_];
			    if (is_64_ != null && i_63_ != 0) {
				if (i_63_ != 1) {
				    if (i_63_ != 3) {
					if (i_63_ == 2) {
					    a(12619, ((Class_i) var_dga).b,
					      i_60_, i_59_, i_62_, 0, i_61_);
					    a(12619, ((Class_i) var_dga).b,
					      i_60_, i_59_, i_62_,
					      ((Class_i) var_dga).b, i_61_);
					    a(12619, 0, i_60_, i_59_, i_62_, 0,
					      i_61_);
					} else if (i_63_ != 5) {
					    if (i_63_ == 4) {
						a(12619, 0, i_60_, i_59_,
						  i_62_, ((Class_i) var_dga).b,
						  i_61_);
						a(12619, 0, i_60_, i_59_,
						  i_62_, 0, i_61_);
						a(12619, ((Class_i) var_dga).b,
						  i_60_, i_59_, i_62_,
						  ((Class_i) var_dga).b,
						  i_61_);
					    }
					} else {
					    a(12619, ((Class_i) var_dga).b,
					      i_60_, i_59_, i_62_,
					      ((Class_i) var_dga).b, i_61_);
					    a(12619, 0, i_60_, i_59_, i_62_,
					      ((Class_i) var_dga).b, i_61_);
					    a(12619, ((Class_i) var_dga).b,
					      i_60_, i_59_, i_62_, 0, i_61_);
					}
				    } else {
					a(12619, 0, i_60_, i_59_, i_62_, 0,
					  i_61_);
					a(12619, ((Class_i) var_dga).b, i_60_,
					  i_59_, i_62_, 0, i_61_);
					a(12619, 0, i_60_, i_59_, i_62_,
					  ((Class_i) var_dga).b, i_61_);
				    }
				} else {
				    int[] is_65_
					= ((dga) var_dga).n[i_62_][i_60_];
				    int[] is_66_
					= ((dga) var_dga).V[i_62_][i_60_];
				    int i_67_ = 0;
				    while (i_67_ < is_64_.length) {
					if ((is_64_[i_67_] ^ 0xffffffff) != 0
					    && is_64_[i_67_ + 1] != -1
					    && is_64_[i_67_ + 2] != -1) {
					    a(12619, is_65_[i_67_], i_60_,
					      i_59_, i_62_, is_66_[i_67_],
					      i_61_);
					    i_67_++;
					    a(12619, is_65_[i_67_], i_60_,
					      i_59_, i_62_, is_66_[i_67_],
					      i_61_);
					    i_67_++;
					    a(12619, is_65_[i_67_], i_60_,
					      i_59_, i_62_, is_66_[i_67_],
					      i_61_);
					    i_67_++;
					} else
					    i_67_ += 3;
				    }
				}
			    }
			}
			i_53_++;
			i_61_++;
		    }
		}
		i_59_++;
	    }
	    p = H.a((byte) -82, ((BytesParser) G).pos, ((BytesParser) G).bytes, false, 5123);
	    u = H.a(((BytesParser) l).bytes, ((BytesParser) l).pos, false, 16, -110);
	    m = new gv(u, 5126, 3, 0);
	    F = new gv(u, 5121, 4, 12);
	} else {
	    u = null;
	    p = null;
	    F = null;
	    m = null;
	}
	G = null;
	N = A = n = null;
	C = null;
	l = null;
    }
    
    static {
	s = -1;
    }
}
