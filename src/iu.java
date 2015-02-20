/* iu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class iu
{
    static int a;
    private int b;
    static int c;
    static int d;
    static GameInPacket e;
    private int f;
    private int g;
    static int h;
    static int i;
    static int j;
    static int[] k = new int[25];
    static int l;
    int m;
    static int n;
    static int[] o;
    private km[][] p;
    private dga q;
    private int r;
    private qj s;
    byte[] t;
    
    private final void a(int i, boolean bool, int i_0_, int i_1_, int i_2_) {
	iu.i++;
	if (p != null) {
	    if (bool != false)
		a(-127, null, false, -108);
	    int i_3_ = i - 1 >> 7;
	    int i_4_ = i - 1 + i_2_ - 1 >> 7;
	    int i_5_ = i_1_ - 1 >> 7;
	    int i_6_ = i_1_ + i_0_ - 2 >> 7;
	    for (int i_7_ = i_3_; i_4_ >= i_7_; i_7_++) {
		km[] var_kms = p[i_7_];
		for (int i_8_ = i_5_; i_8_ <= i_6_; i_8_++)
		    ((km) var_kms[i_8_]).k = true;
	    }
	}
    }
    
    final void a(int i, int i_9_, boolean[][] bools, boolean bool,
		 boolean bool_10_, int i_11_) {
	s.a((byte) 105, false);
	l++;
	s.a(false, (int) 125);
	s.b((int) -2, (byte) -106);
	if (bool != true)
	    a(-3, -16, null, true, false, -12);
	s.c(false, 1);
	s.b((byte) 60, (int) 1);
	float f = 1.0F / (float) (((qj) s).me * 128);
	if (bool_10_) {
	    for (int i_12_ = 0; i_12_ < g; i_12_++) {
		int i_13_ = i_12_ << this.f;
		int i_14_ = i_12_ + 1 << this.f;
		for (int i_15_ = 0; i_15_ < r; i_15_++) {
		    int i_16_ = i_15_ << this.f;
		    int i_17_ = i_15_ + 1 << this.f;
		while_57_:
		    for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
			if (i_18_ - i >= -i_11_ && i_18_ - i <= i_11_) {
			    for (int i_19_ = i_13_; i_19_ < i_14_; i_19_++) {
				if (i_19_ - i_9_ >= -i_11_
				    && i_11_ >= i_19_ - i_9_
				    && (bools[i_11_ + (i_18_ - i)]
					[i_11_ + (i_19_ - i_9_)])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_15_ / f,
							(float) -i_12_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    p[i_15_][i_12_].b((byte) -94);
				    break while_57_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_20_ = 0; g > i_20_; i_20_++) {
		int i_21_ = i_20_ << this.f;
		int i_22_ = i_20_ + 1 << this.f;
		for (int i_23_ = 0; i_23_ < r; i_23_++) {
		    int i_24_ = 0;
		    int i_25_ = i_23_ << this.f;
		    int i_26_ = i_23_ + 1 << this.f;
		    fw var_fw = ((qj) s).Zf;
		    ((BytesParser) var_fw).pos = 0;
		    for (int i_27_ = i_21_; i_27_ < i_22_; i_27_++) {
			if (-i_11_ <= i_27_ - i_9_ && i_27_ - i_9_ <= i_11_) {
			    int i_28_ = i_27_ * ((Class_i) q).k + i_25_;
			    for (int i_29_ = i_25_; i_26_ > i_29_; i_29_++) {
				if (-i_11_ <= i_29_ - i && i_11_ >= i_29_ - i
				    && (bools[i_11_ + i_29_ - i]
					[i_27_ - i_9_ + i_11_])) {
				    short[] is = ((dga) q).p[i_28_];
				    if (is != null) {
					if (!((qj) s).ig) {
					    for (int i_30_ = 0;
						 i_30_ < is.length; i_30_++) {
						i_24_++;
						var_fw.writeShortReversed2(is[i_30_] & 0xffff,
							 (byte) 0);
					    }
					} else {
					    for (int i_31_ = 0;
						 i_31_ < is.length; i_31_++) {
						var_fw.writeShort(0xffff & is[i_31_],
							 13469);
						i_24_++;
					    }
					}
				    }
				}
				i_28_++;
			    }
			}
		    }
		    if (i_24_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_23_ / f,
					    (float) -i_20_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			p[i_23_][i_20_].a(((BytesParser) var_fw).bytes, 5123, i_24_, -57);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    final boolean a(ha var_ha, int i, int i_32_, int i_33_) {
	h++;
	vg var_vg = (vg) var_ha;
	i_32_ += ((vg) var_vg).y + 1;
	i += ((vg) var_vg).I + 1;
	int i_34_ = i * ((iu) this).m + i_32_;
	int i_35_ = ((vg) var_vg).A;
	int i_36_ = ((vg) var_vg).z;
	int i_37_ = ((iu) this).m - i_36_;
	if (i <= 0) {
	    int i_38_ = -i + 1;
	    i_34_ += ((iu) this).m * i_38_;
	    i_35_ -= i_38_;
	    i = 1;
	}
	if (i_33_ != -11578)
	    a(38);
	if (b <= i + i_35_) {
	    int i_39_ = i + i_35_ + 1 - b;
	    i_35_ -= i_39_;
	}
	if (i_32_ <= 0) {
	    int i_40_ = -i_32_ + 1;
	    i_34_ += i_40_;
	    i_37_ += i_40_;
	    i_32_ = 1;
	    i_36_ -= i_40_;
	}
	if (i_32_ + i_36_ >= ((iu) this).m) {
	    int i_41_ = i_36_ + (i_32_ + (-((iu) this).m + 1));
	    i_36_ -= i_41_;
	    i_37_ += i_41_;
	}
	if (i_36_ <= 0 || i_35_ <= 0)
	    return false;
	int i_42_ = 8;
	i_37_ += ((iu) this).m * (i_42_ - 1);
	return GameInPacket.a(i_36_, i_42_, i_37_, i_34_, ((iu) this).t, i_35_);
    }
    
    final void a(int i) {
	if (i > 41) {
	    j++;
	    p = new km[r][g];
	    for (int i_43_ = 0; i_43_ < g; i_43_++) {
		for (int i_44_ = 0; r > i_44_; i_44_++)
		    p[i_44_][i_43_] = new km(s, this, q, i_44_, i_43_, f,
					     128 * i_44_ + 1, 128 * i_43_ + 1);
	    }
	}
    }
    
    final void a(int i, ha var_ha, boolean bool, int i_45_) {
	n++;
	vg var_vg = (vg) var_ha;
	i_45_ += ((vg) var_vg).I + 1;
	i += ((vg) var_vg).y + 1;
	int i_46_ = i_45_ * ((iu) this).m + i;
	int i_47_ = 0;
	int i_48_ = ((vg) var_vg).A;
	int i_49_ = ((vg) var_vg).z;
	int i_50_ = ((iu) this).m - i_49_;
	if (bool != true)
	    a(-72, 31, false);
	int i_51_ = 0;
	if (i_45_ <= 0) {
	    int i_52_ = -i_45_ + 1;
	    i_48_ -= i_52_;
	    i_47_ += i_52_ * i_49_;
	    i_45_ = 1;
	    i_46_ += i_52_ * ((iu) this).m;
	}
	if (i_48_ + i_45_ >= b) {
	    int i_53_ = i_48_ + i_45_ + 1 - b;
	    i_48_ -= i_53_;
	}
	if (i <= 0) {
	    int i_54_ = -i + 1;
	    i_46_ += i_54_;
	    i_49_ -= i_54_;
	    i_51_ += i_54_;
	    i = 1;
	    i_47_ += i_54_;
	    i_50_ += i_54_;
	}
	if (((iu) this).m <= i + i_49_) {
	    int i_55_ = i_49_ + i - ((iu) this).m + 1;
	    i_49_ -= i_55_;
	    i_50_ += i_55_;
	    i_51_ += i_55_;
	}
	if (i_49_ > 0 && i_48_ > 0) {
	    gga.a(i_49_, ((vg) var_vg).w, i_50_, i_47_, ((iu) this).t, -1,
		  i_48_, i_46_, i_51_);
	    a(i, !bool, i_48_, i_45_, i_49_);
	}
    }
    
    static final js a(BytesParser var_es, byte i) {
	a++;
	int i_56_ = var_es.readUnsignedByte(-9268);
	if (i != -117)
	    o = null;
	ct var_ct = dh.b((byte) 87)[var_es.readUnsignedByte(-9268)];
	rc var_rc = dg.b(i + 174)[var_es.readUnsignedByte(i ^ 0x2447)];
	int i_57_ = var_es.readShort2(85);
	int i_58_ = var_es.readShort2(i ^ ~0x29);
	int i_59_ = var_es.readShort(13111);
	int i_60_ = var_es.readShort(i + 13228);
	int i_61_ = var_es.readInt(58);
	int i_62_ = var_es.readInt(127);
	int i_63_ = var_es.readInt(73);
	boolean bool = var_es.readUnsignedByte(-9268) == 1;
	return new js(i_56_, var_ct, var_rc, i_57_, i_58_, i_59_, i_60_, i_61_,
		      i_62_, i_63_, bool);
    }
    
    final void b(ha var_ha, int i, int i_64_, int i_65_) {
	c++;
	vg var_vg = (vg) var_ha;
	i_64_ += ((vg) var_vg).y + 1;
	i += ((vg) var_vg).I + 1;
	int i_66_ = i * ((iu) this).m + i_64_;
	int i_67_ = 0;
	int i_68_ = ((vg) var_vg).A;
	int i_69_ = ((vg) var_vg).z;
	int i_70_ = ((iu) this).m - i_69_;
	if (i <= 0) {
	    int i_71_ = 1 - i;
	    i_66_ += i_71_ * ((iu) this).m;
	    i_68_ -= i_71_;
	    i_67_ += i_69_ * i_71_;
	    i = 1;
	}
	int i_72_ = 0;
	if (i + i_68_ >= b) {
	    int i_73_ = i_68_ + (i + 1) - b;
	    i_68_ -= i_73_;
	}
	if (i_65_ <= (i_64_ ^ 0xffffffff)) {
	    int i_74_ = -i_64_ + 1;
	    i_70_ += i_74_;
	    i_67_ += i_74_;
	    i_72_ += i_74_;
	    i_64_ = 1;
	    i_69_ -= i_74_;
	    i_66_ += i_74_;
	}
	if (i_69_ + i_64_ >= ((iu) this).m) {
	    int i_75_ = i_64_ + i_69_ - ((iu) this).m + 1;
	    i_70_ += i_75_;
	    i_72_ += i_75_;
	    i_69_ -= i_75_;
	}
	if (i_69_ > 0 && i_68_ > 0) {
	    Class_ic.a(i_69_, i_72_, ((iu) this).t, i_67_, ((vg) var_vg).w,
		       i_70_, i_68_, i_66_, i_65_ - 112);
	    a(i_64_, false, i_68_, i, i_69_);
	}
    }
    
    public static void b(int i) {
	k = null;
	o = null;
	if (i != 1)
	    a(null, (byte) 95);
	e = null;
    }
    
    static final int a(int i, int i_76_, boolean bool) {
	d++;
	if (bool)
	    return 0;
	hg var_hg = el.a(bool, (byte) 123, i_76_);
	if (var_hg == null)
	    return ((no) vd.L.a(-101, i_76_)).s;
	int i_77_ = 0;
	if (i != 1)
	    return -69;
	for (int i_78_ = 0; i_78_ < ((hg) var_hg).itemIDs.length; i_78_++) {
	    if (((hg) var_hg).itemIDs[i_78_] == -1)
		i_77_++;
	}
	i_77_ += ((no) vd.L.a(-102, i_76_)).s - ((hg) var_hg).itemIDs.length;
	return i_77_;
    }
    
    iu(qj var_qj, dga var_dga) {
	q = var_dga;
	s = var_qj;
	((iu) this).m = 2 + (((Class_i) q).b * ((Class_i) q).k >> ((qj) s).le);
	b = (((Class_i) q).b * ((Class_i) q).j >> ((qj) s).le) + 2;
	f = ((qj) s).le - ((Class_i) q).g + 7;
	((iu) this).t = new byte[b * ((iu) this).m];
	r = ((Class_i) q).k >> f;
	g = ((Class_i) q).j >> f;
    }
    
    static {
	e = new GameInPacket(37, 5);
    }
}
