/* hp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class hp extends pp
{
    static int s;
    static int t;
    static int u;
    static GameInPacket v;
    static int w;
    private mca[] x;
    private mca y;
    static int z;
    private int[] A;
    private int[] B;
    static int C = -60;
    private mca D;
    static int E;
    static oj F;
    private mca G;
    static float[] H;
    static int[] I;
    
    static final void a(int i, LoginStream var_loginStream) {
	E++;
	if (i != 4)
	    v = null;
	vp var_vp = (vp) dl.c.a(i + 97);
	if (var_vp != null) {
	    boolean bool = false;
	    for (int i_0_ = 0; ((vp) var_vp).s > i_0_; i_0_++) {
		if (((vp) var_vp).k[i_0_] != null) {
		    if (((vp) var_vp).k[i_0_].f == 2)
			((vp) var_vp).l[i_0_] = -5;
		    if (((vp) var_vp).k[i_0_].f == 0)
			bool = true;
		}
		if (((vp) var_vp).r[i_0_] != null) {
		    if (((vp) var_vp).r[i_0_].f == 2)
			((vp) var_vp).l[i_0_] = -6;
		    if (((vp) var_vp).r[i_0_].f == 0)
			bool = true;
		}
	    }
	    if (!bool) {
		int i_1_ = ((BytesParser) var_loginStream).pos;
		var_loginStream.writeInt(((vp) var_vp).p, (int) -97);
		for (int i_2_ = 0; ((vp) var_vp).s > i_2_; i_2_++) {
		    if (((vp) var_vp).l[i_2_] != 0)
			var_loginStream.writeByte(((vp) var_vp).l[i_2_], (byte) -116);
		    else {
			try {
			    int i_3_ = ((vp) var_vp).n[i_2_];
			    if (i_3_ == 0) {
				Field field = (Field) ((vp) var_vp).k[i_2_].hostName;
				int i_4_ = field.getInt(null);
				var_loginStream.writeByte((int) 0, (byte) -125);
				var_loginStream.writeInt(i_4_, i - 103);
			    } else if (i_3_ == 1) {
				Field field = (Field) ((vp) var_vp).k[i_2_].hostName;
				field.setInt(null, ((vp) var_vp).q[i_2_]);
				var_loginStream.writeByte((int) 0, (byte) -128);
			    } else if (i_3_ == 2) {
				Field field = (Field) ((vp) var_vp).k[i_2_].hostName;
				int i_5_ = field.getModifiers();
				var_loginStream.writeByte((int) 0, (byte) -115);
				var_loginStream.writeInt(i_5_, (int) -98);
			    }
			    if (i_3_ != 3) {
				if (i_3_ == 4) {
				    Method method
					= (Method) ((vp) var_vp).r[i_2_].hostName;
				    int i_6_ = method.getModifiers();
				    var_loginStream.writeByte((int) 0, (byte) -112);
				    var_loginStream.writeInt(i_6_, i ^ ~0x6c);
				}
			    } else {
				Method method
				    = (Method) ((vp) var_vp).r[i_2_].hostName;
				byte[][] is = ((vp) var_vp).m[i_2_];
				Object[] objects = new Object[is.length];
				for (int i_7_ = 0; is.length > i_7_; i_7_++) {
				    ObjectInputStream objectinputstream
					= (new ObjectInputStream
					   (new ByteArrayInputStream(is
								     [i_7_])));
				    objects[i_7_]
					= objectinputstream.readObject();
				}
				Object object = method.invoke(null, objects);
				if (object == null)
				    var_loginStream.writeByte((int) 0, (byte) -124);
				else if (!(object instanceof Number)) {
				    if (object instanceof String) {
					var_loginStream.writeByte((int) 2, (byte) -121);
					var_loginStream.writeString((String) object, -126);
				    } else
					var_loginStream.writeByte((int) 4, (byte) -125);
				} else {
				    var_loginStream.writeByte((int) 1, (byte) -110);
				    var_loginStream.writeLong(((Number) object).longValue(),
					     i ^ ~0x414a);
				}
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    var_loginStream.writeByte((int) -10, (byte) -113);
			} catch (java.io.InvalidClassException invalidclassexception) {
			    var_loginStream.writeByte((int) -11, (byte) -126);
			} catch (java.io.StreamCorruptedException streamcorruptedexception) {
			    var_loginStream.writeByte((int) -12, (byte) -115);
			} catch (java.io.OptionalDataException optionaldataexception) {
			    var_loginStream.writeByte((int) -13, (byte) -119);
			} catch (IllegalAccessException illegalaccessexception) {
			    var_loginStream.writeByte((int) -14, (byte) -113);
			} catch (IllegalArgumentException illegalargumentexception) {
			    var_loginStream.writeByte((int) -15, (byte) -109);
                System.out.println("[hp] method height");
			} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			    var_loginStream.writeByte((int) -16, (byte) -111);
			} catch (SecurityException securityexception) {
			    var_loginStream.writeByte((int) -17, (byte) -115);
			} catch (java.io.IOException ioexception) {
			    var_loginStream.writeByte((int) -18, (byte) -117);
			} catch (NullPointerException nullpointerexception) {
			    var_loginStream.writeByte((int) -19, (byte) -116);
			} catch (Exception exception) {
			    var_loginStream.writeByte((int) -20, (byte) -110);
			} catch (Throwable throwable) {
			    var_loginStream.writeByte((int) -21, (byte) -124);
			}
		    }
		}
		var_loginStream.a(i + 119, i_1_);
		var_vp.unlink(-72);
	    }
	}
    }
    
    final int[] a(fa var_fa, int i, boolean bool, pl var_pl, int i_8_,
		  double d, int i_9_) {
	t++;
	ip.eb = var_pl;
	pfa.b = var_fa;
	for (int i_10_ = 0; x.length > i_10_; i_10_++)
	    x[i_10_].a(i_8_, (byte) -70, i);
	fca.a((byte) 86, d);
	if (i_9_ >= -123)
	    return null;
	im.a(i_8_, (byte) -107, i);
	int[] is = new int[4 * i_8_ * i];
	int i_11_ = 0;
	for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
	    int[] is_13_;
	    int[] is_14_;
	    int[] is_15_;
	    if (((mca) D).m) {
		int[] is_16_ = D.a(-24, i_12_);
		is_14_ = is_16_;
		is_15_ = is_16_;
		is_13_ = is_16_;
	    } else {
		int[][] is_17_ = D.a(i_12_, true);
		is_13_ = is_17_[0];
		is_14_ = is_17_[1];
		is_15_ = is_17_[2];
	    }
	    if (bool)
		i_11_ = i_12_;
	    int[] is_18_;
	    if (((mca) G).m)
		is_18_ = G.a(-98, i_12_);
	    else
		is_18_ = G.a(i_12_, true)[0];
	    for (int i_19_ = i - 1; i_19_ >= 0; i_19_--) {
		int i_20_ = is_13_[i_19_] >> 4;
		if (i_20_ > 255)
		    i_20_ = 255;
		if (i_20_ < 0)
		    i_20_ = 0;
		int i_21_ = is_14_[i_19_] >> 4;
		if (i_21_ > 255)
		    i_21_ = 255;
		if (i_21_ < 0)
		    i_21_ = 0;
		int i_22_ = is_15_[i_19_] >> 4;
		if (i_22_ > 255)
		    i_22_ = 255;
		i_21_ = sg.a[i_21_];
		if (i_22_ < 0)
		    i_22_ = 0;
		i_20_ = sg.a[i_20_];
		i_22_ = sg.a[i_22_];
		int i_23_;
		if (i_20_ == 0 && i_21_ == 0 && i_22_ == 0)
		    i_23_ = 0;
		else {
		    i_23_ = is_18_[i_19_] >> 4;
		    if (i_23_ > 255)
			i_23_ = 255;
		    if (i_23_ < 0)
			i_23_ = 0;
		}
		is[i_11_++] = (i_23_ << 24) - (-(i_20_ << 16)
					       - ((i_21_ << 8) + i_22_));
		if (bool)
		    i_11_ += i - 1;
	    }
	}
	for (int i_24_ = 0; i_24_ < x.length; i_24_++)
	    x[i_24_].a((int) 45);
	return is;
    }
    
    final boolean a(int i, pl var_pl, fa var_fa) {
	u++;
	if (mk.e < i) {
	    for (int i_25_ = 0; B.length > i_25_; i_25_++) {
		if (!var_pl.g(i + 1912, B[i_25_]))
		    return false;
	    }
	} else {
	    for (int i_26_ = 0; i_26_ < B.length; i_26_++) {
		if (!var_pl.a(B[i_26_], (byte) 98, mk.e))
		    return false;
	    }
	}
	for (int i_27_ = 0; A.length > i_27_; i_27_++) {
	    if (!var_fa.a(false, A[i_27_]))
		return false;
	}
	return true;
    }
    
    final float[] a(boolean bool, int i, int i_28_, fa var_fa, pl var_pl,
		    int i_29_) {
	pfa.b = var_fa;
	s++;
	ip.eb = var_pl;
	for (int i_30_ = i_28_; i_30_ < x.length; i_30_++)
	    x[i_30_].a(i, (byte) 59, i_29_);
	im.a(i, (byte) -77, i_29_);
	float[] fs = new float[4 * (i * i_29_)];
	int i_31_ = 0;
	for (int i_32_ = 0; i_32_ < i; i_32_++) {
	    int[] is;
	    int[] is_33_;
	    int[] is_34_;
	    if (!((mca) D).m) {
		int[][] is_35_ = D.a(i_32_, true);
		is_34_ = is_35_[1];
		is = is_35_[0];
		is_33_ = is_35_[2];
	    } else {
		int[] is_36_ = D.a(118, i_32_);
		is = is_36_;
		is_33_ = is_36_;
		is_34_ = is_36_;
	    }
	    int[] is_37_;
	    if (((mca) G).m)
		is_37_ = G.a(i_28_ ^ ~0xb, i_32_);
	    else
		is_37_ = G.a(i_32_, true)[0];
	    if (bool)
		i_31_ = i_32_ << 2;
	    int[] is_38_;
	    if (!((mca) y).m)
		is_38_ = y.a(i_32_, true)[0];
	    else
		is_38_ = y.a(117, i_32_);
	    for (int i_39_ = i_29_ - 1; i_39_ >= 0; i_39_--) {
		float f = (float) is_37_[i_39_] / 4096.0F;
		float f_40_ = (((float) is_38_[i_39_] * 31.0F / 4096.0F + 1.0F)
			       / 4096.0F);
		if (f < 0.0F)
		    f = 0.0F;
		else if (f > 1.0F)
		    f = 1.0F;
		fs[i_31_++] = f_40_ * (float) is[i_39_];
		fs[i_31_++] = (float) is_34_[i_39_] * f_40_;
		fs[i_31_++] = f_40_ * (float) is_33_[i_39_];
		fs[i_31_++] = f;
		if (bool)
		    i_31_ += (i_29_ << 2) - 4;
	    }
	}
	for (int i_41_ = 0; x.length > i_41_; i_41_++)
	    x[i_41_].a((int) 46);
	return fs;
    }
    
    final int[] a(byte i, pl var_pl, double d, int i_42_, boolean bool,
		  boolean bool_43_, int i_44_, fa var_fa) {
	ip.eb = var_pl;
	w++;
	pfa.b = var_fa;
	for (int i_45_ = 0; i_45_ < x.length; i_45_++)
	    x[i_45_].a(i_44_, (byte) -85, i_42_);
	fca.a((byte) 86, d);
	im.a(i_44_, (byte) -109, i_42_);
	int[] is = new int[i_44_ * i_42_];
	int i_46_;
	int i_47_;
	int i_48_;
	if (bool) {
	    i_46_ = -1;
	    i_47_ = i_42_ - 1;
	    i_48_ = -1;
	} else {
	    i_46_ = 1;
	    i_47_ = 0;
	    i_48_ = i_42_;
	}
	int i_49_ = 0;
	if (i < 61)
	    B = null;
	for (int i_50_ = 0; i_50_ < i_44_; i_50_++) {
	    int[] is_51_;
	    int[] is_52_;
	    int[] is_53_;
	    if (!((mca) D).m) {
		int[][] is_54_ = D.a(i_50_, true);
		is_52_ = is_54_[0];
		is_51_ = is_54_[2];
		is_53_ = is_54_[1];
	    } else {
		int[] is_55_ = D.a(121, i_50_);
		is_51_ = is_55_;
		is_52_ = is_55_;
		is_53_ = is_55_;
	    }
	    if (bool_43_)
		i_49_ = i_50_;
	    for (int i_56_ = i_47_; i_48_ != i_56_; i_56_ += i_46_) {
		int i_57_ = is_52_[i_56_] >> 4;
		if (i_57_ > 255)
		    i_57_ = 255;
		if (i_57_ < 0)
		    i_57_ = 0;
		int i_58_ = is_53_[i_56_] >> 4;
		if (i_58_ > 255)
		    i_58_ = 255;
		if (i_58_ < 0)
		    i_58_ = 0;
		int i_59_ = is_51_[i_56_] >> 4;
		if (i_59_ > 255)
		    i_59_ = 255;
		i_57_ = sg.a[i_57_];
		i_58_ = sg.a[i_58_];
		if (i_59_ < 0)
		    i_59_ = 0;
		i_59_ = sg.a[i_59_];
		int i_60_ = i_59_ + (i_57_ << 16) + (i_58_ << 8);
		if (i_60_ != 0)
		    i_60_ |= ~0xffffff;
		is[i_49_++] = i_60_;
		if (bool_43_)
		    i_49_ += i_42_ - 1;
	    }
	}
	for (int i_61_ = 0; x.length > i_61_; i_61_++)
	    x[i_61_].a((int) 47);
	return is;
    }
    
    public static void b(byte i) {
	F = null;
	I = null;
	v = null;
	if (i < 112)
	    a(-127, null);
	H = null;
    }
    
    public hp() {
	B = new int[0];
	A = new int[0];
	y = new Class_jg(0);
	((mca) y).u = 1;
	D = new Class_jg();
	((mca) D).u = 1;
	G = new Class_jg();
	x = new mca[] { D, G, y };
	((mca) G).u = 1;
    }
    
    hp(BytesParser var_es) {
	int i = var_es.readUnsignedByte(-9268);
	int i_62_ = 0;
	int i_63_ = 0;
	x = new mca[i];
	int[][] is = new int[i][];
	for (int i_64_ = 0; i > i_64_; i_64_++) {
	    mca var_mca = fg.a((byte) 62, var_es);
	    if (var_mca.a((byte) 126) >= 0)
		i_62_++;
	    if (var_mca.b((byte) 104) >= 0)
		i_63_++;
	    int i_65_ = ((mca) var_mca).w.length;
	    is[i_64_] = new int[i_65_];
	    for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
		is[i_64_][i_66_] = var_es.readUnsignedByte(-9268);
	    x[i_64_] = var_mca;
	}
	B = new int[i_62_];
	A = new int[i_63_];
	i_62_ = 0;
	i_63_ = 0;
	for (int i_67_ = 0; i_67_ < i; i_67_++) {
	    mca var_mca = x[i_67_];
	    int i_68_ = ((mca) var_mca).w.length;
	    for (int i_69_ = 0; i_69_ < i_68_; i_69_++)
		((mca) var_mca).w[i_69_] = x[is[i_67_][i_69_]];
	    int i_70_ = var_mca.a((byte) 127);
	    int i_71_ = var_mca.b((byte) 58);
	    if (i_70_ > 0)
		B[i_62_++] = i_70_;
	    if (i_71_ > 0)
		A[i_63_++] = i_71_;
	    is[i_67_] = null;
	}
	D = x[var_es.readUnsignedByte(-9268)];
	G = x[var_es.readUnsignedByte(-9268)];
	Object object = null;
	y = x[var_es.readUnsignedByte(-9268)];
    }
    
    static {
	v = new GameInPacket(23, 0);
	I = new int[2];
	H = new float[4];
    }
}
