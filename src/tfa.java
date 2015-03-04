/* tfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class tfa
{
    private mm[][] a;
    private int[] b = new int[64];
    private int c = 0;
    static int d;
    static int e;
    static int f;
    private mq g;
    static GameInPacket incomingPacket44 = new GameInPacket(44, 7);
    static int i;
    static int j;
    static int k;
    private nba l;
    static int m;
    static int n;
    private mm[][] o = new mm[64][768];
    static int p;
    static int q;
    private int[] r;
    private int[] s;
    private hh t;
    static int u = 0;
    private nba v;
    static fca w;
    
    public static void a(int i) {
	if (i > -92)
	    a(93);
	incomingPacket44 = null;
	w = null;
    }
    
    private final void a(byte i, en var_en) {
	p++;
	ik.q = ((en) var_en).Nf;
	var_en.J(8);
	var_en.b(false, (byte) 50);
	var_en.c(false, (byte) -25);
	if (i >= -6)
	    a = null;
	var_en.i((byte) 93);
    }
    
    static final int a(int i, byte i_0_, int i_1_) {
	q++;
	if (i == 1 || i == 3)
	    return hu.b[i_1_ & 0x3];
	if (i_0_ <= 21)
	    return 104;
	return Class_kd.j[0x3 & i_1_];
    }
    
    private final void a(int i, int i_2_, en var_en) {
	ik.q = ((en) var_en).Nf;
	n++;
	var_en.a((float) i_2_, (byte) -53);
	var_en.N(128);
	var_en.b(false, (byte) -126);
	if (i != 0)
	    a((en) null, 102, (byte) -50);
	var_en.c(false, (byte) -25);
	var_en.i((byte) 77);
    }
    
    private final void a(int i, en var_en) {
	tfa.i++;
	if (i >= 7) {
	    var_en.c(true, (byte) -25);
	    var_en.b(true, (byte) -126);
	    if (((en) var_en).Nf != ik.q)
		var_en.ra(ik.q);
	}
    }
    
    static final boolean a(byte i, int i_3_, int i_4_) {
	if (i != 87)
	    w = null;
	e++;
	if ((0x34 & i_4_) == 0)
	    return false;
	return true;
    }
    
    final void b(byte i, en var_en) {
	if (i == 77) {
	    v.a(-79, 24, 786336);
	    j++;
	}
    }
    
    final void a(int i, int i_5_, en var_en, ir var_ir) {
	d++;
	if (((en) var_en).Td != null) {
	    if (i >= 0)
		a(0, i, var_en);
	    else
		a((byte) -51, var_en);
	    float f = ((mga) ((en) var_en).Td).H;
	    float f_6_ = ((mga) ((en) var_en).Td).fb;
	    float f_7_ = ((mga) ((en) var_en).Td).I;
	    float f_8_ = ((mga) ((en) var_en).Td).E;
	    try {
		int i_9_ = 0;
		int i_10_ = 2147483647;
		int i_11_ = 0;
		Class_wb class_wb = ((nr) ((ir) var_ir).a).j;
		for (Class_wb class_wb_12_ = ((Class_wb) class_wb).h;
		     class_wb_12_ != class_wb;
		     class_wb_12_ = ((Class_wb) class_wb_12_).h) {
		    mm var_mm = (mm) class_wb_12_;
		    int i_13_
			= (int) (f_8_ + ((float) (((mm) var_mm).r >> 12) * f_7_
					 + ((float) (((mm) var_mm).w >> 12) * f
					    + ((float) (((mm) var_mm).t >> 12)
					       * f_6_))));
		    if (i_11_ < i_13_)
			i_11_ = i_13_;
		    if (i_10_ > i_13_)
			i_10_ = i_13_;
		    s[i_9_++] = i_13_;
		}
		int i_14_ = i_11_ - i_10_;
		int i_15_;
		if (i_14_ + 2 <= 1600) {
		    i_15_ = 0;
		    i_14_ += 2;
		} else {
		    i_15_ = it.a(-24420, i_14_) + (-cl.d + 1);
		    i_14_ = (i_14_ >> i_15_) + 2;
		}
		i_9_ = i_5_;
		Class_wb class_wb_16_ = ((Class_wb) class_wb).h;
		int i_17_ = -2;
		boolean bool = true;
		boolean bool_18_ = true;
		while (class_wb_16_ != class_wb) {
		    c = 0;
		    for (int i_19_ = 0; i_19_ < i_14_; i_19_++)
			r[i_19_] = 0;
		    for (int i_20_ = 0; i_20_ < 64; i_20_++)
			b[i_20_] = 0;
		    for (/**/; class_wb_16_ != class_wb;
			 class_wb_16_ = ((Class_wb) class_wb_16_).h) {
			mm var_mm = (mm) class_wb_16_;
			if (bool_18_) {
			    i_17_ = ((mm) var_mm).C;
			    bool = ((mm) var_mm).n;
			    bool_18_ = false;
			}
			if (i_9_ > 0 && (i_17_ != ((mm) var_mm).C
					 || !((mm) var_mm).n == bool)) {
			    bool_18_ = true;
			    break;
			}
			int i_21_ = s[i_9_++] - i_10_ >> i_15_;
			if (i_21_ < 1600) {
			    if (r[i_21_] >= 64) {
				if (r[i_21_] == 64) {
				    if (c == 64)
					continue;
				    r[i_21_] += c++ + 1;
				}
				o[r[i_21_] - 64 - 1][b[r[i_21_] - 64 - 1]++]
				    = var_mm;
			    } else
				a[i_21_][r[i_21_]++] = var_mm;
			}
		    }
		    var_en.a(0, i_17_ < 0 ? -1 : i_17_, false, false);
		    if (!bool || ((en) var_en).Nf == ik.q) {
			if (((en) var_en).Nf != 1.0F)
			    var_en.ra(1.0F);
		    } else
			var_en.ra(ik.q);
		    a(var_en, i_14_, (byte) 106);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    a((int) 98, var_en);
	}
    }
    
    private final void a(en var_en, int i, byte i_22_) {
	m++;
	int i_23_ = 82 / ((i_22_ - 45) / 47);
	int i_24_ = 0;
	mga var_mga = var_en.Q(3);
	float f = ((mga) var_mga).M;
	float f_25_ = ((mga) var_mga).q;
	float f_26_ = ((mga) var_mga).gb;
	float f_27_ = ((mga) var_mga).cb;
	float f_28_ = ((mga) var_mga).T;
	float f_29_ = ((mga) var_mga).F;
	float f_30_ = f_27_ + f;
	float f_31_ = f_28_ + f_25_;
	float f_32_ = f_29_ + f_26_;
	float f_33_ = f - f_27_;
	float f_34_ = f_25_ - f_28_;
	float f_35_ = f_26_ - f_29_;
	float f_36_ = f_27_ - f;
	float f_37_ = f_28_ - f_25_;
	float f_38_ = f_29_ - f_26_;
	Buffer buffer = v.a(true, 32726);
	if (buffer != null) {
	    Stream stream = var_en.a(buffer, 127);
	    if (Stream.a()) {
		for (int i_39_ = i - 1; i_39_ >= 0; i_39_--) {
		    int i_40_ = r[i_39_] <= 64 ? r[i_39_] : 64;
		    if (i_40_ > 0) {
			for (int i_41_ = i_40_ - 1; i_41_ >= 0; i_41_--) {
			    mm var_mm = a[i_39_][i_41_];
			    int i_42_ = ((mm) var_mm).p;
			    byte i_43_ = (byte) (i_42_ >> 16);
			    byte i_44_ = (byte) (i_42_ >> 8);
			    byte i_45_ = (byte) i_42_;
			    byte i_46_ = (byte) (i_42_ >>> 24);
			    float f_47_ = (float) (((mm) var_mm).w >> 12);
			    float f_48_ = (float) (((mm) var_mm).t >> 12);
			    float f_49_ = (float) (((mm) var_mm).r >> 12);
			    int i_50_ = ((mm) var_mm).o >> 12;
			    stream.a(f_47_ + (float) -i_50_ * f_30_);
			    stream.a(f_48_ + f_31_ * (float) -i_50_);
			    stream.a(f_49_ + f_32_ * (float) -i_50_);
			    if (((en) var_en).If == 0)
				stream.b(i_43_, i_44_, i_45_, i_46_);
			    else
				stream.a(i_43_, i_44_, i_45_, i_46_);
			    stream.a(0.0F);
			    stream.a(0.0F);
			    stream.a((float) i_50_ * f_33_ + f_47_);
			    stream.a(f_48_ + (float) i_50_ * f_34_);
			    stream.a(f_49_ + (float) i_50_ * f_35_);
			    if (((en) var_en).If == 0)
				stream.b(i_43_, i_44_, i_45_, i_46_);
			    else
				stream.a(i_43_, i_44_, i_45_, i_46_);
			    stream.a(1.0F);
			    stream.a(0.0F);
			    stream.a(f_30_ * (float) i_50_ + f_47_);
			    stream.a((float) i_50_ * f_31_ + f_48_);
			    stream.a((float) i_50_ * f_32_ + f_49_);
			    if (((en) var_en).If != 0)
				stream.a(i_43_, i_44_, i_45_, i_46_);
			    else
				stream.b(i_43_, i_44_, i_45_, i_46_);
			    stream.a(1.0F);
			    stream.a(1.0F);
			    stream.a(f_36_ * (float) i_50_ + f_47_);
			    stream.a(f_48_ + f_37_ * (float) i_50_);
			    stream.a(f_49_ + (float) i_50_ * f_38_);
			    if (((en) var_en).If == 0)
				stream.b(i_43_, i_44_, i_45_, i_46_);
			    else
				stream.a(i_43_, i_44_, i_45_, i_46_);
			    stream.a(0.0F);
			    i_24_++;
			    stream.a(1.0F);
			}
			if (r[i_39_] > 64) {
			    int i_51_ = r[i_39_] - 65;
			    for (int i_52_ = b[i_51_] - 1; i_52_ >= 0;
				 i_52_--) {
				mm var_mm = o[i_51_][i_52_];
				int i_53_ = ((mm) var_mm).p;
				byte i_54_ = (byte) (i_53_ >> 16);
				byte i_55_ = (byte) (i_53_ >> 8);
				byte i_56_ = (byte) i_53_;
				byte i_57_ = (byte) (i_53_ >>> 24);
				float f_58_ = (float) (((mm) var_mm).w >> 12);
				float f_59_ = (float) (((mm) var_mm).t >> 12);
				float f_60_ = (float) (((mm) var_mm).r >> 12);
				int i_61_ = ((mm) var_mm).o >> 12;
				stream.a(f_58_ + f_30_ * (float) -i_61_);
				stream.a(f_59_ + (float) -i_61_ * f_31_);
				stream.a(f_60_ + (float) -i_61_ * f_32_);
				if (((en) var_en).If == 0)
				    stream.b(i_54_, i_55_, i_56_, i_57_);
				else
				    stream.a(i_54_, i_55_, i_56_, i_57_);
				stream.a(0.0F);
				stream.a(0.0F);
				stream.a((float) i_61_ * f_33_ + f_58_);
				stream.a(f_59_ + (float) i_61_ * f_34_);
				stream.a(f_60_ + f_35_ * (float) i_61_);
				if (((en) var_en).If != 0)
				    stream.a(i_54_, i_55_, i_56_, i_57_);
				else
				    stream.b(i_54_, i_55_, i_56_, i_57_);
				stream.a(1.0F);
				stream.a(0.0F);
				stream.a(f_30_ * (float) i_61_ + f_58_);
				stream.a(f_31_ * (float) i_61_ + f_59_);
				stream.a(f_32_ * (float) i_61_ + f_60_);
				if (((en) var_en).If == 0)
				    stream.b(i_54_, i_55_, i_56_, i_57_);
				else
				    stream.a(i_54_, i_55_, i_56_, i_57_);
				stream.a(1.0F);
				stream.a(1.0F);
				stream.a(f_58_ + f_36_ * (float) i_61_);
				stream.a(f_59_ + (float) i_61_ * f_37_);
				stream.a((float) i_61_ * f_38_ + f_60_);
				if (((en) var_en).If == 0)
				    stream.b(i_54_, i_55_, i_56_, i_57_);
				else
				    stream.a(i_54_, i_55_, i_56_, i_57_);
				stream.a(0.0F);
				stream.a(1.0F);
				i_24_++;
			    }
			}
		    }
		}
	    } else {
		for (int i_62_ = i - 1; i_62_ >= 0; i_62_--) {
		    int i_63_ = r[i_62_] > 64 ? 64 : r[i_62_];
		    if (i_63_ > 0) {
			for (int i_64_ = i_63_ - 1; i_64_ >= 0; i_64_--) {
			    mm var_mm = a[i_62_][i_64_];
			    int i_65_ = ((mm) var_mm).p;
			    byte i_66_ = (byte) (i_65_ >> 16);
			    byte i_67_ = (byte) (i_65_ >> 8);
			    byte i_68_ = (byte) i_65_;
			    byte i_69_ = (byte) (i_65_ >>> 24);
			    float f_70_ = (float) (((mm) var_mm).w >> 12);
			    float f_71_ = (float) (((mm) var_mm).t >> 12);
			    float f_72_ = (float) (((mm) var_mm).r >> 12);
			    int i_73_ = ((mm) var_mm).o >> 12;
			    stream.b((float) -i_73_ * f_30_ + f_70_);
			    stream.b((float) -i_73_ * f_31_ + f_71_);
			    stream.b(f_32_ * (float) -i_73_ + f_72_);
			    if (((en) var_en).If != 0)
				stream.a(i_66_, i_67_, i_68_, i_69_);
			    else
				stream.b(i_66_, i_67_, i_68_, i_69_);
			    stream.b(0.0F);
			    stream.b(0.0F);
			    stream.b(f_70_ + f_33_ * (float) i_73_);
			    stream.b(f_71_ + f_34_ * (float) i_73_);
			    stream.b(f_35_ * (float) i_73_ + f_72_);
			    if (((en) var_en).If != 0)
				stream.a(i_66_, i_67_, i_68_, i_69_);
			    else
				stream.b(i_66_, i_67_, i_68_, i_69_);
			    stream.b(1.0F);
			    stream.b(0.0F);
			    stream.b((float) i_73_ * f_30_ + f_70_);
			    stream.b(f_31_ * (float) i_73_ + f_71_);
			    stream.b(f_72_ + (float) i_73_ * f_32_);
			    if (((en) var_en).If == 0)
				stream.b(i_66_, i_67_, i_68_, i_69_);
			    else
				stream.a(i_66_, i_67_, i_68_, i_69_);
			    stream.b(1.0F);
			    stream.b(1.0F);
			    stream.b(f_70_ + f_36_ * (float) i_73_);
			    stream.b(f_71_ + f_37_ * (float) i_73_);
			    stream.b((float) i_73_ * f_38_ + f_72_);
			    if (((en) var_en).If == 0)
				stream.b(i_66_, i_67_, i_68_, i_69_);
			    else
				stream.a(i_66_, i_67_, i_68_, i_69_);
			    stream.b(0.0F);
			    stream.b(1.0F);
			    i_24_++;
			}
			if (r[i_62_] > 64) {
			    int i_74_ = r[i_62_] - 65;
			    for (int i_75_ = b[i_74_] - 1; i_75_ >= 0;
				 i_75_--) {
				mm var_mm = o[i_74_][i_75_];
				int i_76_ = ((mm) var_mm).p;
				byte i_77_ = (byte) (i_76_ >> 16);
				byte i_78_ = (byte) (i_76_ >> 8);
				byte i_79_ = (byte) i_76_;
				byte i_80_ = (byte) (i_76_ >>> 24);
				float f_81_ = (float) (((mm) var_mm).w >> 12);
				float f_82_ = (float) (((mm) var_mm).t >> 12);
				float f_83_ = (float) (((mm) var_mm).r >> 12);
				int i_84_ = ((mm) var_mm).o >> 12;
				stream.b(f_81_ + f_30_ * (float) -i_84_);
				stream.b(f_82_ + f_31_ * (float) -i_84_);
				stream.b((float) -i_84_ * f_32_ + f_83_);
				if (((en) var_en).If == 0)
				    stream.b(i_77_, i_78_, i_79_, i_80_);
				else
				    stream.a(i_77_, i_78_, i_79_, i_80_);
				stream.b(0.0F);
				stream.b(0.0F);
				stream.b(f_33_ * (float) i_84_ + f_81_);
				stream.b((float) i_84_ * f_34_ + f_82_);
				stream.b((float) i_84_ * f_35_ + f_83_);
				if (((en) var_en).If != 0)
				    stream.a(i_77_, i_78_, i_79_, i_80_);
				else
				    stream.b(i_77_, i_78_, i_79_, i_80_);
				stream.b(1.0F);
				stream.b(0.0F);
				stream.b((float) i_84_ * f_30_ + f_81_);
				stream.b((float) i_84_ * f_31_ + f_82_);
				stream.b((float) i_84_ * f_32_ + f_83_);
				if (((en) var_en).If != 0)
				    stream.a(i_77_, i_78_, i_79_, i_80_);
				else
				    stream.b(i_77_, i_78_, i_79_, i_80_);
				stream.b(1.0F);
				stream.b(1.0F);
				stream.b((float) i_84_ * f_36_ + f_81_);
				stream.b(f_82_ + f_37_ * (float) i_84_);
				stream.b(f_38_ * (float) i_84_ + f_83_);
				if (((en) var_en).If != 0)
				    stream.a(i_77_, i_78_, i_79_, i_80_);
				else
				    stream.b(i_77_, i_78_, i_79_, i_80_);
				stream.b(0.0F);
				stream.b(1.0F);
				i_24_++;
			    }
			}
		    }
		}
	    }
	    stream.c();
	    if (v.a(54)) {
		var_en.a((byte) -16, v, 0);
		var_en.a((byte) -16, l, 1);
		var_en.a(true, g);
		var_en.a(i_24_ * 4, mo.E, 0, 12896, i_24_ * 2, 0, t);
	    }
	}
    }
    
    static final void a(boolean bool) {
	tfa.f++;
	if (mv.a >= 0) {
	    long l = us.getCurrentTime(127);
	    mv.a -= l - pr.D;
	    if (mv.a <= 0) {
		dr.e = ((Class_mc) uj.x).p;
		uf.g = ((Class_mc) uj.x).f;
		kw.v = ((Class_mc) uj.x).m;
		qda.D = ((Class_mc) uj.x).q;
		hq.b = ((Class_mc) uj.x).r;
		mv.a = -1;
		dm.a = ((Class_mc) uj.x).k;
		ei.d = ((Class_mc) uj.x).n;
		dh.e = ((Class_mc) uj.x).c;
		bq.k = ((Class_mc) uj.x).b;
		LoginStream.Qb = ((Class_mc) uj.x).o;
	    } else {
		int i = (mv.a << 8) / ur.g;
		int i_85_ = 255 - i;
		float f = (float) i / 255.0F;
		kw.v = ((0xff0000 & (i * (mda.H & 0xff00)
				     + (0xff00 & ((Class_mc) uj.x).m) * i_85_))
			+ (~0xff00ff
			   & ((mda.H & 0xff00ff) * i
			      + i_85_ * (0xff00ff
					 & ((Class_mc) uj.x).m)))) >>> 8;
		float f_86_ = -f + 1.0F;
		uf.g = (((i * (0xff00ff & ii.c)
			  + (0xff00ff & ((Class_mc) uj.x).f) * i_85_)
			 & ~0xff00ff)
			+ (0xff0000
			   & i * (ii.c & 0xff00) + (((Class_mc) uj.x).f
						    & 0xff00) * i_85_)) >>> 8;
		LoginStream.Qb = (((Class_mc) uj.x).o - rq.M) * f_86_ + rq.M;
		ei.d = f_86_ * (((Class_mc) uj.x).n - Class_hc.f) + Class_hc.f;
		hq.b = f_86_ * (((Class_mc) uj.x).r - Class_ab.c) + Class_ab.c;
		qda.D = ej.i * i + i_85_ * ((Class_mc) uj.x).q >> 8;
		dh.e = Commands.b + (((Class_mc) uj.x).c - Commands.b) * f_86_;
		dm.a = dd.J + (((Class_mc) uj.x).k - dd.J) * f_86_;
		bq.k = qd.x + f_86_ * (((Class_mc) uj.x).b - qd.x);
		if (((Class_mc) uj.x).p != GameText.vb)
		    dr.e = lm.Kh.a(GameText.vb, ((Class_mc) uj.x).p, f_86_, dr.e);
	    }
	    pr.D = l;
	}
	if (bool != true)
	    a(67);
    }
    
    final void b(boolean bool) {
	v.b(-21271);
	if (bool == true)
	    k++;
    }
    
    tfa(en var_en) {
	a = new mm[1600][64];
	r = new int[1600];
	s = new int[8191];
	g = var_en.a(new eda[] { new eda(new jv[] { jv.e, jv.l, jv.n }),
				 new eda(jv.k) },
		     true);
	v = var_en.a(false, true);
	l = var_en.a(false, false);
	l.a(-77, 12, 393168);
	t = var_en.b(false, (int) 16);
	t.a(27209, 49146);
	Buffer buffer = t.a((byte) -88, true);
	if (buffer != null) {
	    Stream stream = var_en.a(buffer, 119);
	    if (!Stream.a()) {
		for (int i = 0; i < 8191; i++) {
		    int i_87_ = 4 * i;
		    stream.e(i_87_);
		    stream.e(i_87_ + 1);
		    stream.e(i_87_ + 2);
		    stream.e(i_87_ + 2);
		    stream.e(i_87_ + 3);
		    stream.e(i_87_);
		}
	    } else {
		for (int i = 0; i < 8191; i++) {
		    int i_88_ = i * 4;
		    stream.c(i_88_);
		    stream.c(i_88_ + 1);
		    stream.c(i_88_ + 2);
		    stream.c(i_88_ + 2);
		    stream.c(i_88_ + 3);
		    stream.c(i_88_);
		}
	    }
	    stream.c();
	    t.b((byte) 118);
	}
	Buffer buffer_89_ = l.a(true, 32726);
	if (buffer_89_ != null) {
	    Stream stream = var_en.a(buffer_89_, 96);
	    if (Stream.a()) {
		for (int i = 0; i < 8191; i++) {
		    stream.a(0.0F);
		    stream.a(-1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(-1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(-1.0F);
		    stream.a(0.0F);
		    stream.a(0.0F);
		    stream.a(-1.0F);
		    stream.a(0.0F);
		}
	    } else {
		for (int i = 0; i < 8191; i++) {
		    stream.b(0.0F);
		    stream.b(-1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(-1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(-1.0F);
		    stream.b(0.0F);
		    stream.b(0.0F);
		    stream.b(-1.0F);
		    stream.b(0.0F);
		}
	    }
	    stream.c();
	    l.a(84);
	}
    }
    
    static {
	new qfa("", 76);
    }
}
