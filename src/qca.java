/* qca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Constructor;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class qca extends Node
{
    static int k;
    static int l;
    private il m;
    private int n;
    private nba o;
    static int p;
    private int q;
    private hh r;
    private float[][] s;
    private daa t;
    private en u;
    static int v;
    private int w;
    private float[][] x;
    private Stream y;
    private Stream z;
    private int A;
    private gga B;
    static int D;
    static int E = 0;
    private int F;
    static ki G = new ki();
    private float[][] H;
    static int I;
    static int J;
    private int K;
    /*synthetic*/ static Class L;
    
    static final of a(Component component, int i, boolean bool) {
	D++;
	try {
	    if (i != 6611)
		G = null;
	    Constructor constructor
		= (Class.forName("pe").getDeclaredConstructor
		   (new Class[] { L != null ? L : (L
						   = a("java.awt.Component")),
				  Boolean.TYPE }));
	    return ((of)
		    constructor.newInstance(new Object[]
					    { component, new Boolean(bool) }));
	} catch (Throwable throwable) {
	    return new ia(component, bool);
	}
    }
    
    private final void a(short i, int i_0_) {
	int i_1_ = 125 % ((74 - i_0_) / 51);
	if (Stream.a())
	    z.c(i);
	else
	    z.e(i);
	k++;
    }
    
    public static void a(boolean bool) {
	G = null;
	if (bool != false)
	    a(false);
    }
    
    final void a(int i, int i_2_, boolean[][] bools, int i_3_, int i_4_) {
	v++;
	if (r != null && n <= i_2_ + i_3_ && A >= i_3_ - i_2_ && q <= i_2_ + i
	    && w >= i - i_2_) {
	    for (int i_5_ = q; i_5_ <= w; i_5_++) {
		for (int i_6_ = n; i_6_ <= A; i_6_++) {
		    int i_7_ = i_6_ - i_3_;
		    int i_8_ = i_5_ - i;
		    if (i_7_ > -i_2_ && i_7_ < i_2_ && i_8_ > -i_2_
			&& i_8_ < i_2_ && bools[i_2_ + i_7_][i_2_ + i_8_]) {
			u.a((byte) 89, (byte) (int) (B.b((int) 100) * 255.0F));
			u.a((byte) -16, o, 0);
			u.a(true, ((en) u).kg);
			u.a(K, mo.E, 0, 12896, F / 3, 0, r);
			return;
		    }
		}
	    }
	    if (i_4_ >= -111)
		a(false);
	}
    }
    
    static final void a(int i) {
	p++;
	FileOnDisk var_cu = null;
	try {
	    vfa var_vfa = nda.signlink.a("3", (byte) -28, false);
	    while (var_vfa.f == 0)
		Connection.a(-28448, 1L);
	    if (var_vfa.f == 2)
		throw new RuntimeException("Error opening file");
	    if (i > -87)
		a(null, -21, false);
	    var_cu = (FileOnDisk) var_vfa.hostName;
	    byte[] is = new byte[(int) var_cu.getLength()];
	    if (is.length == 0) {
		nu.i = "";
		eo.n = "";
	    } else {
		int i_9_;
		for (int i_10_ = 0; is.length > i_10_; i_10_ += i_9_) {
		    i_9_ = var_cu.read(i_10_, is, is.length - i_10_);
		    if (i_9_ == -1)
			throw new IOException("EOF");
		}
		BytesParser var_es = new BytesParser(is);
		int i_11_ = var_es.readUnsignedByte(-9268);
		if (i_11_ > 120)
		    throw new RuntimeException("Bad length");
		((BytesParser) var_es).pos = i_11_ + 1;
		if (!var_es.x(9182))
		    throw new RuntimeException("Invalid CRC");
		((BytesParser) var_es).pos = 1;
		int i_12_ = var_es.readUnsignedByte(-9268);
		if (i_12_ > 3)
		    throw new RuntimeException("Invalid version " + i_12_);
		nu.i = var_es.readUTF8((byte) 120);
		eo.n = var_es.readUTF8((byte) 111);
		if (i_12_ >= 1)
		    nf.G = var_es.readShort(13111);
		else
		    nf.G = hl.affId;
		if (i_12_ >= 2)
		    ei.e = var_es.readLong(false);
		else
		    ei.e = ak.userFlow;
		if (i_12_ < 3)
		    mj.u = br.additionalInfo;
		else if (var_es.readUnsignedByte(-9268) == 1)
		    mj.u = var_es.readUTF8((byte) 123);
		else
		    mj.u = null;
	    }
	} catch (Exception exception) {
	    eo.n = "";
	    nu.i = "";
	}
	do {
	    try {
		if (var_cu == null)
		    break;
		var_cu.close();
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    private final void a(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			 int i_17_, int i_18_) {
	qca.l++;
	long l = -1L;
	int i_19_ = (i_15_ << ((Class_i) t).g) + i_16_;
	int i_20_ = i + (i_18_ << ((Class_i) t).g);
	int i_21_ = t.a(i_20_, i_19_, true);
	if ((i_16_ & 0x7f) == 0 || (0x7f & i) == 0) {
	    l = (long) i_19_ & 0xffffL | (0xffffL & (long) i_20_) << 16;
	    Node class_d = m.a(i_14_ ^ ~0x697a, l);
	    if (class_d != null) {
		a(((lk) (lk) class_d).n, i_14_ ^ 0x1694);
		return;
	    }
	}
	short i_22_ = (short) K++;
	if (l != -1L)
	    m.a(new lk(i_22_), (byte) -89, l);
	float f;
	float f_23_;
	float f_24_;
	if (i_16_ != 0 || i != 0) {
	    if (i_16_ == ((Class_i) t).b && i == 0) {
		f = H[i_17_ + 1][i_13_];
		f_23_ = x[i_17_ + 1][i_13_];
		f_24_ = s[i_17_ + 1][i_13_];
	    } else if (i_16_ != ((Class_i) t).b || ((Class_i) t).b != i) {
		if (i_16_ != 0 || i != ((Class_i) t).b) {
		    float f_25_ = (float) i_16_ / (float) ((Class_i) t).b;
		    float f_26_ = (float) i / (float) ((Class_i) t).b;
		    float f_27_ = H[i_17_][i_13_];
		    float f_28_ = s[i_17_][i_13_];
		    float f_29_ = x[i_17_][i_13_];
		    float f_30_ = H[i_17_ + 1][i_13_];
		    float f_31_ = s[i_17_ + 1][i_13_];
		    f_29_ += f_25_ * (x[i_17_][i_13_ + 1] - f_29_);
		    float f_32_ = x[i_17_ + 1][i_13_];
		    f_28_ += f_25_ * (s[i_17_][i_13_ + 1] - f_28_);
		    f_27_ += f_25_ * (H[i_17_][i_13_ + 1] - f_27_);
		    f_31_ += (s[i_17_ + 1][i_13_ + 1] - f_31_) * f_25_;
		    f_30_ += (H[i_17_ + 1][i_13_ + 1] - f_30_) * f_25_;
		    f_24_ = f_28_ + (f_31_ - f_28_) * f_26_;
		    f_32_ += f_25_ * (x[i_17_ + 1][i_13_ + 1] - f_32_);
		    f = f_27_ + f_26_ * (f_30_ - f_27_);
		    f_23_ = (f_32_ - f_29_) * f_26_ + f_29_;
		} else {
		    f_24_ = s[i_17_][i_13_ + 1];
		    f = H[i_17_][i_13_ + 1];
		    f_23_ = x[i_17_][i_13_ + 1];
		}
	    } else {
		f = H[i_17_ + 1][i_13_ + 1];
		f_23_ = x[i_17_ + 1][i_13_ + 1];
		f_24_ = s[i_17_ + 1][i_13_ + 1];
	    }
	} else {
	    f = H[i_17_][i_13_];
	    f_23_ = x[i_17_][i_13_];
	    f_24_ = s[i_17_][i_13_];
	}
	float f_33_ = (float) (B.a(true) - i_19_);
	float f_34_ = (float) (B.i(i_14_ ^ ~0x16f3) - i_21_);
	float f_35_ = (float) (B.b((byte) 119) - i_20_);
	float f_36_
	    = (float) Math.sqrt((double) (f_35_ * f_35_
					  + (f_33_ * f_33_ + f_34_ * f_34_)));
	float f_37_ = 1.0F / f_36_;
	f_35_ *= f_37_;
	f_33_ *= f_37_;
	f_34_ *= f_37_;
	float f_38_ = f_36_ / (float) B.a((byte) -107);
	float f_39_ = 1.0F - f_38_ * f_38_;
	if (f_39_ < 0.0F)
	    f_39_ = 0.0F;
	float f_40_ = f_35_ * f_23_ + (f_33_ * f + f_24_ * f_34_);
	if (f_40_ < 0.0F)
	    f_40_ = 0.0F;
	float f_41_ = 2.0F * (f_40_ * f_39_);
	if (f_41_ > 1.0F)
	    f_41_ = 1.0F;
	int i_42_ = B.a((int) 46);
	int i_43_ = (int) (f_41_ * (float) (i_42_ >> 16 & 0xff));
	if (i_43_ > 255)
	    i_43_ = 255;
	int i_44_ = (int) (f_41_ * (float) ((i_42_ & 0xffe4) >> 8));
	if (i_44_ > 255)
	    i_44_ = 255;
	if (i_14_ != 5777)
	    a(-56, -61, -81, 47, -110, 16, 110);
	int i_45_ = (int) (f_41_ * (float) (i_42_ & 0xff));
	if (i_45_ > 255)
	    i_45_ = 255;
	if (Stream.a()) {
	    y.a((float) i_19_);
	    y.a((float) i_21_);
	    y.a((float) i_20_);
	} else {
	    y.b((float) i_19_);
	    y.b((float) i_21_);
	    y.b((float) i_20_);
	}
	if (((en) u).If != 0) {
	    y.d(i_43_);
	    y.d(i_44_);
	    y.d(i_45_);
	} else {
	    y.d(i_45_);
	    y.d(i_44_);
	    y.d(i_43_);
	}
	y.d(255);
	a(i_22_, i_14_ ^ 0x16ec);
    }
    
    qca(en var_en, daa var_daa, gga var_gga, int[] is) {
	t = var_daa;
	u = var_en;
	B = var_gga;
	int i = B.a((byte) -62) - (((Class_i) var_daa).b >> 1);
	n = B.a(true) - i >> ((Class_i) var_daa).g;
	A = i + B.a(true) >> ((Class_i) var_daa).g;
	q = B.b((byte) 119) - i >> ((Class_i) var_daa).g;
	w = i + B.b((byte) 119) >> ((Class_i) var_daa).g;
	int i_46_ = A + 1 - n;
	int i_47_ = w - q + 1;
	x = new float[i_46_ + 1][i_47_ + 1];
	H = new float[i_46_ + 1][i_47_ + 1];
	s = new float[i_46_ + 1][i_47_ + 1];
	for (int i_48_ = 0; i_47_ >= i_48_; i_48_++) {
	    int i_49_ = q + i_48_;
	    if (i_49_ > 0 && ((Class_i) t).j - 1 > i_49_) {
		for (int i_50_ = 0; i_50_ <= i_46_; i_50_++) {
		    int i_51_ = n + i_50_;
		    if (i_51_ > 0 && i_51_ < ((Class_i) t).k - 1) {
			int i_52_ = (var_daa.a(i_49_, (byte) 51, i_51_ + 1)
				     - var_daa.a(i_49_, (byte) 51, i_51_ - 1));
			int i_53_ = (var_daa.a(i_49_ + 1, (byte) 51, i_51_)
				     - var_daa.a(i_49_ - 1, (byte) 51, i_51_));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_53_ * i_53_
							     + (i_52_ * i_52_
								+ 65536))));
			H[i_50_][i_48_] = (float) i_52_ * f;
			s[i_50_][i_48_] = -256.0F * f;
			x[i_50_][i_48_] = (float) i_53_ * f;
		    }
		}
	    }
	}
	int i_54_ = 0;
	for (int i_55_ = q; i_55_ <= w; i_55_++) {
	    if (i_55_ < 0 || i_55_ >= ((Class_i) var_daa).j)
		i_54_ += A - n;
	    else {
		for (int i_56_ = n; A >= i_56_; i_56_++) {
		    if (i_56_ >= 0 && i_56_ < ((Class_i) var_daa).k) {
			int i_57_ = is[i_54_];
			int[] is_58_ = ((daa) var_daa).R[i_56_][i_55_];
			if (is_58_ != null && i_57_ != 0) {
			    if (i_57_ != 1)
				F += 3;
			    else {
				int i_59_ = 0;
				while (is_58_.length > i_59_) {
				    if (is_58_[i_59_++] != -1
					&& (is_58_[i_59_++] ^ 0xffffffff) != 0
					&& (is_58_[i_59_++] ^ 0xffffffff) != 0)
					F += 3;
				}
			    }
			}
		    }
		    i_54_++;
		}
	    }
	}
	if (F > 0) {
	    m = new il(dfa.a(F, 128));
	    r = u.b(false, (int) 16);
	    r.a(27209, F);
	    jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer
		= u.a(F * 16, (byte) 68, false);
	    y = new Stream(nativeheapbuffer);
	    for (;;) {
		Buffer buffer = r.a((byte) -88, true);
		if (buffer != null) {
		    z = new Stream(buffer);
		    i_54_ = 0;
		    int i_60_ = 0;
		    for (int i_61_ = q; i_61_ <= w; i_61_++) {
			if (i_61_ >= 0 && ((Class_i) var_daa).j > i_61_) {
			    int i_62_ = 0;
			    for (int i_63_ = n; i_63_ <= A; i_63_++) {
				if (i_63_ >= 0
				    && i_63_ < ((Class_i) var_daa).k) {
				    int i_64_ = is[i_54_];
				    int[] is_65_
					= ((daa) var_daa).R[i_63_][i_61_];
				    if (is_65_ != null && i_64_ != 0) {
					if (i_64_ == 1) {
					    int[] is_66_ = (((daa) var_daa).A
							    [i_63_][i_61_]);
					    int[] is_67_ = (((daa) var_daa).q
							    [i_63_][i_61_]);
					    int i_68_ = 0;
					    while (is_65_.length > i_68_) {
						if (is_65_[i_68_] == -1
						    || is_65_[i_68_ + 1] == -1
						    || (is_65_[i_68_ + 2]
							^ 0xffffffff) == 0)
						    i_68_ += 3;
						else {
						    a(is_67_[i_68_], i_60_,
						      5777, i_63_,
						      is_66_[i_68_], i_62_,
						      i_61_);
						    i_68_++;
						    a(is_67_[i_68_], i_60_,
						      5777, i_63_,
						      is_66_[i_68_], i_62_,
						      i_61_);
						    i_68_++;
						    a(is_67_[i_68_], i_60_,
						      5777, i_63_,
						      is_66_[i_68_], i_62_,
						      i_61_);
						    i_68_++;
						}
					    }
					} else if (i_64_ == 3) {
					    a(0, i_60_, 5777, i_63_, 0, i_62_,
					      i_61_);
					    a(0, i_60_, 5777, i_63_,
					      ((Class_i) var_daa).b, i_62_,
					      i_61_);
					    a(((Class_i) var_daa).b, i_60_,
					      5777, i_63_, 0, i_62_, i_61_);
					} else if (i_64_ != 2) {
					    if (i_64_ != 5) {
						if (i_64_ == 4) {
						    a(((Class_i) var_daa).b,
						      i_60_, 5777, i_63_, 0,
						      i_62_, i_61_);
						    a(0, i_60_, 5777, i_63_, 0,
						      i_62_, i_61_);
						    a(((Class_i) var_daa).b,
						      i_60_, 5777, i_63_,
						      ((Class_i) var_daa).b,
						      i_62_, i_61_);
						}
					    } else {
						a(((Class_i) var_daa).b, i_60_,
						  5777, i_63_,
						  ((Class_i) var_daa).b, i_62_,
						  i_61_);
						a(((Class_i) var_daa).b, i_60_,
						  5777, i_63_, 0, i_62_,
						  i_61_);
						a(0, i_60_, 5777, i_63_,
						  ((Class_i) var_daa).b, i_62_,
						  i_61_);
					    }
					} else {
					    a(0, i_60_, 5777, i_63_,
					      ((Class_i) var_daa).b, i_62_,
					      i_61_);
					    a(((Class_i) var_daa).b, i_60_,
					      5777, i_63_,
					      ((Class_i) var_daa).b, i_62_,
					      i_61_);
					    a(0, i_60_, 5777, i_63_, 0, i_62_,
					      i_61_);
					}
				    }
				}
				i_54_++;
				i_62_++;
			    }
			} else
			    i_54_ += A - n;
			i_60_++;
		    }
		    z.c();
		    if (r.b((byte) 43))
			break;
		    y.b(0);
		    m.a(true);
		}
	    }
	    y.c();
	    o = u.a(false, false);
	    o.a(nativeheapbuffer, 16, K * 16, (byte) 58);
	} else {
	    r = null;
	    o = null;
	}
	m = null;
	z = null;
	y = null;
	H = s = x = null;
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
