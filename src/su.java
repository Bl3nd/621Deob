/* su - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class su
{
    static wd[] a = new wd[4];
    private fw b;
    static int c;
    static int d;
    static int e;
    static int f;
    private float[] g = new float[16];
    static int h;
    static int i;
    static int j;
    private gv k;
    private gv l;
    private nl m;
    private int n;
    private gv o;
    private int[] p;
    private int[] q;
    private int[] r;
    private mm[][] s;
    private mm[][] t;
    private int u;
    
    private final void a(int i, int i_0_, qj var_qj) {
	OpenGL.glGetFloatv(2982, g, 0);
        System.out.println("[su] method height");
	d++;
	float f = g[0];
	float f_1_ = g[4];
	if (i != 8593)
	    a(null, (byte) 77);
	float f_2_ = g[8];
	float f_3_ = g[1];
	float f_4_ = g[5];
	float f_5_ = g[9];
	float f_6_ = f_3_ + f;
	float f_7_ = f_4_ + f_1_;
	float f_8_ = f_5_ + f_2_;
	float f_9_ = f - f_3_;
	float f_10_ = f_1_ - f_4_;
	float f_11_ = f_2_ - f_5_;
	float f_12_ = f_3_ - f;
	float f_13_ = f_4_ - f_1_;
	((BytesParser) b).pos = 0;
	float f_14_ = f_5_ - f_2_;
	if (!((qj) var_qj).ig) {
	    for (int i_15_ = i_0_ - 1; i_15_ >= 0; i_15_--) {
		int i_16_ = q[i_15_] > 64 ? 64 : q[i_15_];
		if (i_16_ > 0) {
		    for (int i_17_ = i_16_ - 1; i_17_ >= 0; i_17_--) {
			mm var_mm = s[i_15_][i_17_];
			int i_18_ = ((mm) var_mm).p;
			byte i_19_ = (byte) (i_18_ >> 16);
			byte i_20_ = (byte) (i_18_ >> 8);
			byte i_21_ = (byte) i_18_;
			byte i_22_ = (byte) (i_18_ >>> 24);
			float f_23_ = (float) (((mm) var_mm).w >> 12);
			float f_24_ = (float) (((mm) var_mm).t >> 12);
			float f_25_ = (float) (((mm) var_mm).r >> 12);
			int i_26_ = ((mm) var_mm).o >> 12;
			b.a((byte) -71, 0.0F);
			b.a((byte) -71, 0.0F);
			b.a((byte) -71, (float) -i_26_ * f_6_ + f_23_);
			b.a((byte) -71, f_24_ + f_7_ * (float) -i_26_);
			b.a((byte) -71, f_25_ + (float) -i_26_ * f_8_);
			b.writeByte((int) i_19_, (byte) -115);
			b.writeByte((int) i_20_, (byte) -125);
			b.writeByte((int) i_21_, (byte) -128);
			b.writeByte((int) i_22_, (byte) -117);
			b.a((byte) -71, 1.0F);
			b.a((byte) -71, 0.0F);
			b.a((byte) -71, (float) i_26_ * f_9_ + f_23_);
			b.a((byte) -71, f_10_ * (float) i_26_ + f_24_);
			b.a((byte) -71, f_25_ + (float) i_26_ * f_11_);
			b.writeByte((int) i_19_, (byte) -122);
			b.writeByte((int) i_20_, (byte) -124);
			b.writeByte((int) i_21_, (byte) -120);
			b.writeByte((int) i_22_, (byte) -124);
			b.a((byte) -71, 1.0F);
			b.a((byte) -71, 1.0F);
			b.a((byte) -71, f_23_ + (float) i_26_ * f_6_);
			b.a((byte) -71, f_24_ + (float) i_26_ * f_7_);
			b.a((byte) -71, f_25_ + f_8_ * (float) i_26_);
			b.writeByte((int) i_19_, (byte) -128);
			b.writeByte((int) i_20_, (byte) -108);
			b.writeByte((int) i_21_, (byte) -125);
			b.writeByte((int) i_22_, (byte) -126);
			b.a((byte) -71, 0.0F);
			b.a((byte) -71, 1.0F);
			b.a((byte) -71, (float) i_26_ * f_12_ + f_23_);
			b.a((byte) -71, f_24_ + f_13_ * (float) i_26_);
			b.a((byte) -71, f_14_ * (float) i_26_ + f_25_);
			b.writeByte((int) i_19_, (byte) -123);
			b.writeByte((int) i_20_, (byte) -117);
			b.writeByte((int) i_21_, (byte) -126);
			b.writeByte((int) i_22_, (byte) -116);
		    }
		    if (q[i_15_] > 64) {
			int i_27_ = q[i_15_] - 65;
			for (int i_28_ = p[i_27_] - 1; i_28_ >= 0; i_28_--) {
			    mm var_mm = t[i_27_][i_28_];
			    int i_29_ = ((mm) var_mm).p;
			    byte i_30_ = (byte) (i_29_ >> 16);
			    byte i_31_ = (byte) (i_29_ >> 8);
			    byte i_32_ = (byte) i_29_;
			    byte i_33_ = (byte) (i_29_ >>> 24);
			    float f_34_ = (float) (((mm) var_mm).w >> 12);
			    float f_35_ = (float) (((mm) var_mm).t >> 12);
			    float f_36_ = (float) (((mm) var_mm).r >> 12);
			    int i_37_ = ((mm) var_mm).o >> 12;
			    b.a((byte) -71, 0.0F);
			    b.a((byte) -71, 0.0F);
			    b.a((byte) -71, (float) -i_37_ * f_6_ + f_34_);
			    b.a((byte) -71, (float) -i_37_ * f_7_ + f_35_);
			    b.a((byte) -71, (float) -i_37_ * f_8_ + f_36_);
			    b.writeByte((int) i_30_, (byte) -124);
			    b.writeByte((int) i_31_, (byte) -117);
			    b.writeByte((int) i_32_, (byte) -120);
			    b.writeByte((int) i_33_, (byte) -128);
			    b.a((byte) -71, 1.0F);
			    b.a((byte) -71, 0.0F);
			    b.a((byte) -71, f_34_ + (float) i_37_ * f_9_);
			    b.a((byte) -71, (float) i_37_ * f_10_ + f_35_);
			    b.a((byte) -71, f_36_ + f_11_ * (float) i_37_);
			    b.writeByte((int) i_30_, (byte) -118);
			    b.writeByte((int) i_31_, (byte) -126);
			    b.writeByte((int) i_32_, (byte) -118);
			    b.writeByte((int) i_33_, (byte) -124);
			    b.a((byte) -71, 1.0F);
			    b.a((byte) -71, 1.0F);
			    b.a((byte) -71, f_34_ + (float) i_37_ * f_6_);
			    b.a((byte) -71, f_7_ * (float) i_37_ + f_35_);
			    b.a((byte) -71, f_8_ * (float) i_37_ + f_36_);
			    b.writeByte((int) i_30_, (byte) -128);
			    b.writeByte((int) i_31_, (byte) -122);
			    b.writeByte((int) i_32_, (byte) -111);
			    b.writeByte((int) i_33_, (byte) -110);
			    b.a((byte) -71, 0.0F);
			    b.a((byte) -71, 1.0F);
			    b.a((byte) -71, (float) i_37_ * f_12_ + f_34_);
			    b.a((byte) -71, f_35_ + (float) i_37_ * f_13_);
			    b.a((byte) -71, (float) i_37_ * f_14_ + f_36_);
			    b.writeByte((int) i_30_, (byte) -116);
			    b.writeByte((int) i_31_, (byte) -111);
			    b.writeByte((int) i_32_, (byte) -123);
			    b.writeByte((int) i_33_, (byte) -123);
			}
		    }
		}
	    }
	} else {
	    for (int i_38_ = i_0_ - 1; i_38_ >= 0; i_38_--) {
		int i_39_ = q[i_38_] > 64 ? 64 : q[i_38_];
		if (i_39_ > 0) {
		    for (int i_40_ = i_39_ - 1; i_40_ >= 0; i_40_--) {
			mm var_mm = s[i_38_][i_40_];
			int i_41_ = ((mm) var_mm).p;
			byte i_42_ = (byte) (i_41_ >> 16);
			byte i_43_ = (byte) (i_41_ >> 8);
			byte i_44_ = (byte) i_41_;
			byte i_45_ = (byte) (i_41_ >>> 24);
			float f_46_ = (float) (((mm) var_mm).w >> 12);
			float f_47_ = (float) (((mm) var_mm).t >> 12);
			float f_48_ = (float) (((mm) var_mm).r >> 12);
			int i_49_ = ((mm) var_mm).o >> 12;
			b.a(0.0F, -68);
			b.a(0.0F, -121);
			b.a((float) -i_49_ * f_6_ + f_46_, i - 8718);
			b.a(f_47_ + f_7_ * (float) -i_49_, i - 8673);
			b.a(f_48_ + (float) -i_49_ * f_8_, i - 8488);
			b.writeByte((int) i_42_, (byte) -123);
			b.writeByte((int) i_43_, (byte) -126);
			b.writeByte((int) i_44_, (byte) -109);
			b.writeByte((int) i_45_, (byte) -120);
			b.a(1.0F, i ^ ~0x21f0);
			b.a(0.0F, 95);
			b.a(f_9_ * (float) i_49_ + f_46_, -67);
			b.a(f_10_ * (float) i_49_ + f_47_, -76);
			b.a(f_11_ * (float) i_49_ + f_48_, -106);
			b.writeByte((int) i_42_, (byte) -121);
			b.writeByte((int) i_43_, (byte) -122);
			b.writeByte((int) i_44_, (byte) -124);
			b.writeByte((int) i_45_, (byte) -123);
			b.a(1.0F, 77);
			b.a(1.0F, 30);
			b.a(f_46_ + f_6_ * (float) i_49_, -95);
			b.a(f_47_ + (float) i_49_ * f_7_, -108);
			b.a(f_8_ * (float) i_49_ + f_48_, -87);
			b.writeByte((int) i_42_, (byte) -125);
			b.writeByte((int) i_43_, (byte) -126);
			b.writeByte((int) i_44_, (byte) -113);
			b.writeByte((int) i_45_, (byte) -113);
			b.a(0.0F, i - 8719);
			b.a(1.0F, i ^ ~0x21d4);
			b.a((float) i_49_ * f_12_ + f_46_, i ^ 0x21a3);
			b.a(f_13_ * (float) i_49_ + f_47_, i ^ 0x21af);
			b.a(f_48_ + f_14_ * (float) i_49_, i ^ 0x21a2);
			b.writeByte((int) i_42_, (byte) -114);
			b.writeByte((int) i_43_, (byte) -114);
			b.writeByte((int) i_44_, (byte) -123);
			b.writeByte((int) i_45_, (byte) -120);
		    }
		    if (q[i_38_] > 64) {
			int i_50_ = q[i_38_] - 64 - 1;
			for (int i_51_ = p[i_50_] - 1; i_51_ >= 0; i_51_--) {
			    mm var_mm = t[i_50_][i_51_];
			    int i_52_ = ((mm) var_mm).p;
			    byte i_53_ = (byte) (i_52_ >> 16);
			    byte i_54_ = (byte) (i_52_ >> 8);
			    byte i_55_ = (byte) i_52_;
			    byte i_56_ = (byte) (i_52_ >>> 24);
			    float f_57_ = (float) (((mm) var_mm).w >> 12);
			    float f_58_ = (float) (((mm) var_mm).t >> 12);
			    float f_59_ = (float) (((mm) var_mm).r >> 12);
			    int i_60_ = ((mm) var_mm).o >> 12;
			    b.a(0.0F, -114);
			    b.a(0.0F, i - 8558);
			    b.a(f_57_ + (float) -i_60_ * f_6_, i ^ ~0x21ab);
			    b.a((float) -i_60_ * f_7_ + f_58_, -55);
			    b.a(f_8_ * (float) -i_60_ + f_59_, 80);
			    b.writeByte((int) i_53_, (byte) -121);
			    b.writeByte((int) i_54_, (byte) -113);
			    b.writeByte((int) i_55_, (byte) -127);
			    b.writeByte((int) i_56_, (byte) -113);
			    b.a(1.0F, i ^ 0x21d0);
			    b.a(0.0F, -83);
			    b.a(f_9_ * (float) i_60_ + f_57_, 102);
			    b.a(f_58_ + (float) i_60_ * f_10_, -85);
			    b.a(f_11_ * (float) i_60_ + f_59_, i - 8647);
			    b.writeByte((int) i_53_, (byte) -110);
			    b.writeByte((int) i_54_, (byte) -112);
			    b.writeByte((int) i_55_, (byte) -128);
			    b.writeByte((int) i_56_, (byte) -112);
			    b.a(1.0F, i ^ 0x21f3);
			    b.a(1.0F, 28);
			    b.a(f_57_ + f_6_ * (float) i_60_, -78);
			    b.a(f_58_ + f_7_ * (float) i_60_, 111);
			    b.a((float) i_60_ * f_8_ + f_59_, 40);
			    b.writeByte((int) i_53_, (byte) -110);
			    b.writeByte((int) i_54_, (byte) -121);
			    b.writeByte((int) i_55_, (byte) -127);
			    b.writeByte((int) i_56_, (byte) -111);
			    b.a(0.0F, -52);
			    b.a(1.0F, -100);
			    b.a((float) i_60_ * f_12_ + f_57_, i ^ 0x21e2);
			    b.a((float) i_60_ * f_13_ + f_58_, i - 8544);
			    b.a(f_59_ + (float) i_60_ * f_14_, -99);
			    b.writeByte((int) i_53_, (byte) -122);
			    b.writeByte((int) i_54_, (byte) -121);
			    b.writeByte((int) i_55_, (byte) -121);
			    b.writeByte((int) i_56_, (byte) -127);
			}
		    }
		}
	    }
	}
	if (((BytesParser) b).pos != 0) {
	    m.a(((BytesParser) b).bytes, ((BytesParser) b).pos, 24, (byte) -80);
	    var_qj.a(k, (byte) 83, l, o, null);
	    var_qj.a((byte) -121, ((BytesParser) b).pos / 24, 7, 0);
	}
    }
    
    private final void a(qj var_qj, int i) {
	var_qj.a(true, (int) 120);
	if (i > -94)
	    n = -29;
	f++;
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (((qj) var_qj).Xf != lea.d)
	    var_qj.ra(lea.d);
    }
    
    private final void b(int i, int i_61_, qj var_qj) {
	lea.d = ((qj) var_qj).Xf;
	su.i++;
	if (i != 0)
	    b(116, -36, null);
	var_qj.a((byte) 95, (float) i_61_);
	var_qj.j(379);
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	var_qj.a(false, (int) 126);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    static final void a(int i, int i_62_, int i_63_, boolean bool,
			ObjectDef var_bda) {
	h++;
	for (ql var_ql = (ql) pu.o.a((int) 90); var_ql != null;
	     var_ql = (ql) pu.o.b((byte) 71)) {
	    if (((ql) var_ql).G == i_62_ && i_63_ << 9 == ((ql) var_ql).xLoc
		&& i << 9 == ((ql) var_ql).yLoc
		&& ((ObjectDef) var_bda).objectID == ((ObjectDef) ((ql) var_ql).v).objectID) {
		if (((ql) var_ql).K != null) {
		    ej.r.a(((ql) var_ql).K);
		    ((ql) var_ql).K = null;
		}
		if (((ql) var_ql).w != null) {
		    ej.r.a(((ql) var_ql).w);
		    ((ql) var_ql).w = null;
		}
		var_ql.unlink(-108);
		return;
	    }
	}
	if (bool != true)
	    a(97, 33, 123, true, null);
    }
    
    private final void a(qj var_qj, byte i) {
	lea.d = ((qj) var_qj).Xf;
	e++;
	var_qj.u(-102);
	if (i != -92)
	    g = null;
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	var_qj.a(false, (int) -80);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    final void a(byte i, qj var_qj) {
	m = var_qj.a(null, 196584, true, 24, 66);
	if (i <= 48)
	    a(-72);
	j++;
	o = new gv(m, 5126, 2, 0);
	k = new gv(m, 5126, 3, 8);
	l = new gv(m, 5121, 4, 20);
    }
    
    final void a(boolean bool, ir var_ir, qj var_qj, int i) {
	c++;
	if (((qj) var_qj).Ne != null) {
	    if (i >= 0)
		b(0, i, var_qj);
	    else
		a(var_qj, (byte) -92);
	    float f = ((Class_db) ((qj) var_qj).Ne).v;
	    float f_64_ = ((Class_db) ((qj) var_qj).Ne).j;
	    float f_65_ = ((Class_db) ((qj) var_qj).Ne).L;
	    if (bool != false)
		u = -79;
	    float f_66_ = ((Class_db) ((qj) var_qj).Ne).p;
	    try {
		int i_67_ = 0;
		int i_68_ = 2147483647;
		int i_69_ = 0;
		Class_wb class_wb = ((nr) ((ir) var_ir).a).j;
		for (Class_wb class_wb_70_ = ((Class_wb) class_wb).h;
		     class_wb != class_wb_70_;
		     class_wb_70_ = ((Class_wb) class_wb_70_).h) {
		    mm var_mm = (mm) class_wb_70_;
		    int i_71_
			= (int) (f_66_
				 + (f_65_ * (float) (((mm) var_mm).r >> 12)
				    + (f * (float) (((mm) var_mm).w >> 12)
				       + f_64_ * (float) (((mm) var_mm).t
							  >> 12))));
		    if (i_69_ < i_71_)
			i_69_ = i_71_;
		    r[i_67_++] = i_71_;
		    if (i_71_ < i_68_)
			i_68_ = i_71_;
		}
		int i_72_ = i_69_ - i_68_;
		int i_73_;
		if (i_72_ + 2 <= 1600) {
		    i_72_ += 2;
		    i_73_ = 0;
		} else {
		    i_73_ = it.a(-24420, i_72_) + 1 - n;
		    i_72_ = (i_72_ >> i_73_) + 2;
		}
		Class_wb class_wb_74_ = ((Class_wb) class_wb).h;
		i_67_ = 0;
		int i_75_ = -2;
		boolean bool_76_ = true;
		boolean bool_77_ = true;
		while (class_wb != class_wb_74_) {
		    u = 0;
		    for (int i_78_ = 0; i_72_ > i_78_; i_78_++)
			q[i_78_] = 0;
		    for (int i_79_ = 0; i_79_ < 64; i_79_++)
			p[i_79_] = 0;
		    for (/**/; class_wb_74_ != class_wb;
			 class_wb_74_ = ((Class_wb) class_wb_74_).h) {
			mm var_mm = (mm) class_wb_74_;
			if (bool_77_) {
			    i_75_ = ((mm) var_mm).C;
			    bool_76_ = ((mm) var_mm).n;
			    bool_77_ = false;
			}
			if (i_67_ > 0 && (i_75_ != ((mm) var_mm).C
					  || !bool_76_ == ((mm) var_mm).n)) {
			    bool_77_ = true;
			    break;
			}
			int i_80_ = r[i_67_++] - i_68_ >> i_73_;
			if (i_80_ < 1600) {
			    if (q[i_80_] >= 64) {
				if (q[i_80_] == 64) {
				    if (u == 64)
					continue;
				    q[i_80_] += u++ + 1;
				}
				t[q[i_80_] - 65][p[q[i_80_] - 65]++] = var_mm;
			    } else
				s[i_80_][q[i_80_]++] = var_mm;
			}
		    }
		    if (i_75_ < 0)
			var_qj.b((int) -1, (byte) -41);
		    else
			var_qj.b(i_75_, (byte) -32);
		    if (!bool_76_ || lea.d == ((qj) var_qj).Xf) {
			if (((qj) var_qj).Xf != 1.0F)
			    var_qj.ra(1.0F);
		    } else
			var_qj.ra(lea.d);
		    a(8593, i_72_, var_qj);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    a(var_qj, (int) -112);
	}
    }
    
    public static void a(int i) {
	if (i == -1)
	    a = null;
    }
    
    su() {
	b = new fw(786336);
	n = it.a(-24420, 1600);
	p = new int[64];
	r = new int[8191];
	s = new mm[1600][64];
	t = new mm[64][768];
	u = 0;
	q = new int[1600];
    }
}
