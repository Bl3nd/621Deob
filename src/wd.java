/* wd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wd
{
    static int a;
    static wl b;
    static int c;
    static int d;
    int[][] e;
    static boolean f = false;
    static int g;
    static int h;
    static int i;
    int j;
    static int k;
    static int l;
    static int m;
    static int n;
    int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    int w;
    int x;
    static dr[] y = new dr[14];
    static int z;
    static int A;
    static int B;
    
    public static void a(byte i) {
	b = null;
	if (i > 13)
	    y = null;
    }
    
    static final void a(int i, Class_r class_r) {
	wd.i++;
	int i_0_ = mr.a;
	int i_1_ = hn.b;
	int i_2_ = aw.l;
	int i_3_ = lfa.r;
	int i_4_ = -10660793;
	class_r.f(i_4_, i_0_, i_1_, i - 30, i_3_, i_2_);
	class_r.f(-16777216, i_0_ + 1, i_1_ + 1, i - 30, 16, i_2_ - 2);
	class_r.b(i_2_ - 2, i_1_ + 18, i_3_ - 19, i_0_ + 1, i ^ 0x5149,
		  -16777216);
	pv.j.a(i_4_, true, i_0_ + 3, GameText.chooseOptionText.getString((byte) 120, cba.languageID), -1, i_1_ + 14);
	int i_5_ = Class_md.e.d(i ^ 0x7cf);
	if (i != 31)
	    a((byte) 8, (BytesParser) null);
	int i_6_ = Class_md.e.b(i + 61);
	int i_7_ = 0;
	for (bfa var_bfa = (bfa) oba.I.a(i + 96); var_bfa != null;
	     var_bfa = (bfa) oba.I.b((byte) 62)) {
	    int i_8_ = (-i_7_ - 1 + mu.j) * 16 + 31 + i_1_;
	    int i_9_ = -1;
	    if (i_0_ < i_5_ && i_5_ < i_2_ + i_0_ && i_8_ - 13 < i_6_
		&& i_8_ + 3 > i_6_ && ((bfa) var_bfa).z)
		i_9_ = -256;
	    int[] is = null;
	    if (nt.a(((bfa) var_bfa).v, (byte) 112))
		is = ((ItemDef) laa.itemDefLoader.d(12388, (int) ((bfa) var_bfa).n)).eb;
	    else if (((bfa) var_bfa).o != -1)
		is = ((ItemDef) laa.itemDefLoader.d(12388, ((bfa) var_bfa).o)).eb;
	    else if (sl.b(-1, ((bfa) var_bfa).v)) {
		NPCNode var_mi
		    = (NPCNode) uo.a.a(-32748, (long) (int) ((bfa) var_bfa).n);
		if (var_mi != null) {
		    NPC class_ac = ((NPCNode) var_mi).l;
		    NPCDef var_du = ((NPC) class_ac).npcDef;
		    if (((NPCDef) var_du).L != null)
			var_du = var_du.a(i - 4292, cp.e);
		    if (var_du != null)
			is = ((NPCDef) var_du).G;
		}
	    } else if (hq.a(((bfa) var_bfa).v, 21922)) {
		Object object = null;
		ObjectDef var_bda;
		if (((bfa) var_bfa).v != 1008)
		    var_bda = ul.k.getObjectDef((byte) 42,
				     (int) (0x7fffffffL
					    & ((bfa) var_bfa).n >>> 32));
		else
		    var_bda = ul.k.getObjectDef((byte) 54, (int) ((bfa) var_bfa).n);
		if (((ObjectDef) var_bda).xb != null)
		    var_bda = var_bda.a(cp.e, i ^ ~0x675);
		if (var_bda != null)
		    is = ((ObjectDef) var_bda).l;
	    }
	    String string = Class_ob.a(var_bfa, i + 86);
	    if (is != null)
		string += nj.a(is, (byte) 126);
	    pv.j.a(-4611, 0, en.S, i_8_, pda.z, i_9_, i_0_ + 3, string);
	    if (((bfa) var_bfa).m)
		ua.e.a(dca.R.a((byte) 99, string) + i_0_ + 5, i_8_ - 12);
	    i_7_++;
	}
	vv.a(hn.b, mr.a, aw.l, (byte) -63, lfa.r);
    }
    
    static final void a(boolean bool) {
	s++;
	if (vq.m == null) {
	    vq.m = new int[65536];
	    double d = 0.03 * Math.random() - 0.015 + 0.7;
	    int i = 0;
	    if (bool != true)
		a(true);
	    for (int i_10_ = 0; i_10_ < 512; i_10_++) {
		float f = 360.0F * ((float) (i_10_ >> 3) / 64.0F + 0.0078125F);
		float f_11_ = (float) (i_10_ & 0x7) / 8.0F + 0.0625F;
		for (int i_12_ = 0; i_12_ < 128; i_12_++) {
		    float f_13_ = (float) i_12_ / 128.0F;
		    float f_14_ = 0.0F;
		    float f_15_ = 0.0F;
		    float f_16_ = 0.0F;
		    float f_17_ = f / 60.0F;
		    int i_18_ = (int) f_17_;
		    int i_19_ = i_18_ % 6;
		    float f_20_ = (float) -i_18_ + f_17_;
		    float f_21_ = f_13_ * (-f_11_ + 1.0F);
		    float f_22_ = f_13_ * (1.0F - f_11_ * f_20_);
		    float f_23_ = (-(f_11_ * (1.0F - f_20_)) + 1.0F) * f_13_;
		    if (i_19_ != 0) {
			if (i_19_ == 1) {
			    f_14_ = f_22_;
			    f_16_ = f_21_;
			    f_15_ = f_13_;
			} else if (i_19_ == 2) {
			    f_15_ = f_13_;
			    f_16_ = f_23_;
			    f_14_ = f_21_;
			} else if (i_19_ == 3) {
			    f_14_ = f_21_;
			    f_16_ = f_13_;
			    f_15_ = f_22_;
			} else if (i_19_ == 4) {
			    f_14_ = f_23_;
			    f_15_ = f_21_;
			    f_16_ = f_13_;
			} else if (i_19_ == 5) {
			    f_14_ = f_13_;
			    f_16_ = f_22_;
			    f_15_ = f_21_;
			}
		    } else {
			f_14_ = f_13_;
			f_15_ = f_23_;
			f_16_ = f_21_;
		    }
		    f_14_ = (float) Math.pow((double) f_14_, d);
		    f_15_ = (float) Math.pow((double) f_15_, d);
		    f_16_ = (float) Math.pow((double) f_16_, d);
		    int i_24_ = (int) (f_14_ * 256.0F);
		    int i_25_ = (int) (f_15_ * 256.0F);
		    int i_26_ = (int) (256.0F * f_16_);
		    int i_27_
			= i_26_ + (i_24_ << 16) - 16777216 + (i_25_ << 8);
		    vq.m[i++] = i_27_;
		}
	    }
	}
    }
    
    final boolean a(int i, int i_28_, int i_29_, int i_30_, int i_31_,
		    int i_32_, int i_33_, int i_34_, int i_35_) {
	p++;
	if (i_35_ > 1) {
	    if (eaa.a(i_33_, false, i_35_, i_30_, i_28_, i_29_, i_31_, i_35_,
		      i_32_))
		return true;
	    return a(i_28_, i_35_, (byte) 39, i_31_, i_34_, i_29_, i_32_,
		     i_30_, i_33_, i_35_);
	}
	int i_36_ = i_28_ - 1 + i_29_;
	int i_37_ = i_32_ + i_31_ - 1;
	if (i_33_ >= i_29_ && i_36_ >= i_33_ && i_30_ >= i_31_
	    && i_37_ >= i_30_)
	    return true;
	if (i_33_ == i_29_ - 1 && i_30_ >= i_31_ && i_37_ >= i_30_
	    && ((0x8
		 & ((wd) this).e[i_33_ - ((wd) this).w][i_30_ - ((wd) this).o])
		== 0)
	    && (0x8 & i_34_) == 0)
	    return true;
	if (i_33_ == i_36_ + 1 && i_31_ <= i_30_ && i_37_ >= i_30_
	    && (((wd) this).e[i_33_ - ((wd) this).w][i_30_ - ((wd) this).o]
		& 0x80) == 0
	    && (i_34_ & 0x2) == 0)
	    return true;
	if (i_30_ == i + i_31_ && i_33_ >= i_29_ && i_33_ <= i_36_
	    && (((wd) this).e[i_33_ - ((wd) this).w][i_30_ - ((wd) this).o]
		& 0x2) == 0
	    && (0x4 & i_34_) == 0)
	    return true;
	if (i_37_ + 1 == i_30_ && i_33_ >= i_29_ && i_33_ <= i_36_
	    && ((0x20
		 & ((wd) this).e[i_33_ - ((wd) this).w][i_30_ - ((wd) this).o])
		== 0)
	    && (0x1 & i_34_) == 0)
	    return true;
	return false;
    }
    
    static final void a(short[] is, String[] strings, int i) {
	n++;
	iaa.a((byte) 54, i, strings, strings.length - 1, is);
    }
    
    final void a(int i) {
	c++;
	for (int i_38_ = 0; ((wd) this).x > i_38_; i_38_++) {
	    for (int i_39_ = 0; i_39_ < ((wd) this).j; i_39_++) {
		if (i_38_ == 0 || i_39_ == 0 || i_38_ >= ((wd) this).x - 5
		    || ((wd) this).j - 5 <= i_39_)
		    ((wd) this).e[i_38_][i_39_] = -1;
		else
		    ((wd) this).e[i_38_][i_39_] = 2097152;
	    }
	}
	if (i != 2097152)
	    a(true);
    }
    
    static final mj a(byte i, BytesParser var_es) {
	if (i != 1)
	    b = null;
	m++;
	return new mj(var_es.readShort2(91), var_es.readShort2(118), var_es.readShort2(55), var_es.readShort2(43),
		      var_es.readTribyte(-1), var_es.readTribyte(i - 2), var_es.readUnsignedByte(-9268));
    }
    
    final boolean a(int i, int i_40_, int i_41_, int i_42_, int i_43_,
		    int i_44_, int i_45_, int i_46_) {
	q++;
	if (i == 1) {
	    if (i_46_ == i_45_ && i_42_ == i_44_)
		return true;
	} else if (i_46_ >= i_45_ && i_45_ + i - 1 >= i_46_ && i_42_ <= i_42_
		   && i_42_ <= i_42_ + i - 1)
	    return true;
	i_45_ -= ((wd) this).w;
	i_46_ -= ((wd) this).w;
	i_44_ -= ((wd) this).o;
	int i_47_ = -62 % ((i_40_ + 49) / 61);
	i_42_ -= ((wd) this).o;
	if (i != 1) {
	    int i_48_ = i + i_45_ - 1;
	    int i_49_ = i_44_ + (i - 1);
	    if (i_41_ == 6 || i_41_ == 7) {
		if (i_41_ == 7)
		    i_43_ = 0x3 & i_43_ + 2;
		if (i_43_ != 0) {
		    if (i_43_ == 1) {
			if (i_45_ == i_46_ - i && i_42_ >= i_44_
			    && i_49_ >= i_42_
			    && (0x8 & ((wd) this).e[i_48_][i_42_]) == 0)
			    return true;
			if (i_45_ <= i_46_ && i_46_ <= i_48_
			    && i_44_ == i_42_ - i
			    && (((wd) this).e[i_46_][i_49_] & 0x2) == 0)
			    return true;
		    } else if (i_43_ == 2) {
			if (i_45_ == i_46_ - i && i_42_ >= i_44_
			    && i_42_ <= i_49_
			    && (0x8 & ((wd) this).e[i_48_][i_42_]) == 0)
			    return true;
			if (i_46_ >= i_45_ && i_48_ >= i_46_
			    && i_42_ + 1 == i_44_
			    && (0x20 & ((wd) this).e[i_46_][i_44_]) == 0)
			    return true;
		    } else if (i_43_ == 3) {
			if (i_45_ == i_46_ + 1 && i_44_ <= i_42_
			    && i_49_ >= i_42_
			    && (0x80 & ((wd) this).e[i_45_][i_42_]) == 0)
			    return true;
			if (i_46_ >= i_45_ && i_46_ <= i_48_
			    && i_42_ + 1 == i_44_
			    && (0x20 & ((wd) this).e[i_46_][i_44_]) == 0)
			    return true;
		    }
		} else {
		    if (i_46_ + 1 == i_45_ && i_44_ <= i_42_ && i_42_ <= i_49_
			&& (0x80 & ((wd) this).e[i_45_][i_42_]) == 0)
			return true;
		    if (i_46_ >= i_45_ && i_46_ <= i_48_ && i_44_ == i_42_ - i
			&& (((wd) this).e[i_46_][i_49_] & 0x2) == 0)
			return true;
		}
	    }
	    if (i_41_ == 8) {
		if (i_45_ <= i_46_ && i_46_ <= i_48_ && i_44_ == i_42_ + 1
		    && (((wd) this).e[i_46_][i_44_] & 0x20) == 0)
		    return true;
		if (i_46_ >= i_45_ && i_46_ <= i_48_ && i_42_ - i == i_44_
		    && (0x2 & ((wd) this).e[i_46_][i_49_]) == 0)
		    return true;
		if (i_46_ - i == i_45_ && i_44_ <= i_42_ && i_42_ <= i_49_
		    && (0x8 & ((wd) this).e[i_48_][i_42_]) == 0)
		    return true;
		if (i_46_ + 1 == i_45_ && i_44_ <= i_42_ && i_42_ <= i_49_
		    && (((wd) this).e[i_45_][i_42_] & 0x80) == 0)
		    return true;
	    }
	} else {
	    if (i_41_ == 6 || i_41_ == 7) {
		if (i_41_ == 7)
		    i_43_ = 0x3 & i_43_ + 2;
		if (i_43_ == 0) {
		    if (i_45_ == i_46_ + 1 && i_42_ == i_44_
			&& (0x80 & ((wd) this).e[i_45_][i_44_]) == 0)
			return true;
		    if (i_46_ == i_45_ && i_44_ == i_42_ - 1
			&& (0x2 & ((wd) this).e[i_45_][i_44_]) == 0)
			return true;
		} else if (i_43_ == 1) {
		    if (i_46_ - 1 == i_45_ && i_44_ == i_42_
			&& (0x8 & ((wd) this).e[i_45_][i_44_]) == 0)
			return true;
		    if (i_46_ == i_45_ && i_42_ - 1 == i_44_
			&& (0x2 & ((wd) this).e[i_45_][i_44_]) == 0)
			return true;
		} else if (i_43_ != 2) {
		    if (i_43_ == 3) {
			if (i_46_ + 1 == i_45_ && i_42_ == i_44_
			    && (0x80 & ((wd) this).e[i_45_][i_44_]) == 0)
			    return true;
			if (i_46_ == i_45_ && i_42_ + 1 == i_44_
			    && (0x20 & ((wd) this).e[i_45_][i_44_]) == 0)
			    return true;
		    }
		} else {
		    if (i_46_ - 1 == i_45_ && i_44_ == i_42_
			&& (0x8 & ((wd) this).e[i_45_][i_44_]) == 0)
			return true;
		    if (i_45_ == i_46_ && i_44_ == i_42_ + 1
			&& (0x20 & ((wd) this).e[i_45_][i_44_]) == 0)
			return true;
		}
	    }
	    if (i_41_ == 8) {
		if (i_45_ == i_46_ && i_42_ + 1 == i_44_
		    && (((wd) this).e[i_45_][i_44_] & 0x20) == 0)
		    return true;
		if (i_46_ == i_45_ && i_44_ == i_42_ - 1
		    && (((wd) this).e[i_45_][i_44_] & 0x2) == 0)
		    return true;
		if (i_45_ == i_46_ - 1 && i_44_ == i_42_
		    && (0x8 & ((wd) this).e[i_45_][i_44_]) == 0)
		    return true;
		if (i_46_ + 1 == i_45_ && i_44_ == i_42_
		    && (((wd) this).e[i_45_][i_44_] & 0x80) == 0)
		    return true;
	    }
	}
	return false;
    }
    
    final void a(int i, byte i_50_, int i_51_) {
	i_51_ -= ((wd) this).w;
	t++;
	i -= ((wd) this).o;
	if (i_50_ != -3)
	    ((wd) this).e = null;
	((wd) this).e[i_51_][i] = hba.bitwiseArg1ORArg2(((wd) this).e[i_51_][i], 262144);
    }
    
    private final void a(int i, int i_52_, int i_53_, int i_54_) {
	if (i != 1)
	    y = null;
	((wd) this).e[i_52_][i_53_]
	    = uca.a(((wd) this).e[i_52_][i_53_], i_54_ ^ 0xffffffff);
	k++;
    }
    
    final void b(int i, byte i_55_, int i_56_) {
	i -= ((wd) this).o;
	i_56_ -= ((wd) this).w;
	if (i_55_ > -95)
	    b(false, 69, -100, 52, -49, false, 70);
	h++;
	((wd) this).e[i_56_][i] = uca.a(((wd) this).e[i_56_][i], -2097153);
    }
    
    final void a(byte i, int i_57_, int i_58_) {
	i_57_ -= ((wd) this).o;
	i_58_ -= ((wd) this).w;
	A++;
	if (i > 77)
	    ((wd) this).e[i_58_][i_57_]
		= hba.bitwiseArg1ORArg2(((wd) this).e[i_58_][i_57_], 2097152);
    }
    
    final void a(boolean bool, int i, int i_59_, int i_60_, int i_61_,
		 boolean bool_62_, int i_63_) {
	i_61_ -= ((wd) this).w;
	if (i_59_ < 27)
	    b(-90, (byte) -84, -85);
	i_60_ -= ((wd) this).o;
	r++;
	if (i == 0) {
	    if (i_63_ == 0) {
		b(128, 17861, i_61_, i_60_);
		b(8, 17861, i_61_ - 1, i_60_);
	    }
	    if (i_63_ == 1) {
		b(2, 17861, i_61_, i_60_);
		b(32, 17861, i_61_, i_60_ + 1);
	    }
	    if (i_63_ == 2) {
		b(8, 17861, i_61_, i_60_);
		b(128, 17861, i_61_ + 1, i_60_);
	    }
	    if (i_63_ == 3) {
		b(32, 17861, i_61_, i_60_);
		b(2, 17861, i_61_, i_60_ - 1);
	    }
	}
	if (i == 1 || i == 3) {
	    if (i_63_ == 0) {
		b(1, 17861, i_61_, i_60_);
		b(16, 17861, i_61_ - 1, i_60_ + 1);
	    }
	    if (i_63_ == 1) {
		b(4, 17861, i_61_, i_60_);
		b(64, 17861, i_61_ + 1, i_60_ + 1);
	    }
	    if (i_63_ == 2) {
		b(16, 17861, i_61_, i_60_);
		b(1, 17861, i_61_ + 1, i_60_ - 1);
	    }
	    if (i_63_ == 3) {
		b(64, 17861, i_61_, i_60_);
		b(4, 17861, i_61_ - 1, i_60_ - 1);
	    }
	}
	if (i == 2) {
	    if (i_63_ == 0) {
		b(130, 17861, i_61_, i_60_);
		b(8, 17861, i_61_ - 1, i_60_);
		b(32, 17861, i_61_, i_60_ + 1);
	    }
	    if (i_63_ == 1) {
		b(10, 17861, i_61_, i_60_);
		b(32, 17861, i_61_, i_60_ + 1);
		b(128, 17861, i_61_ + 1, i_60_);
	    }
	    if (i_63_ == 2) {
		b(40, 17861, i_61_, i_60_);
		b(128, 17861, i_61_ + 1, i_60_);
		b(2, 17861, i_61_, i_60_ - 1);
	    }
	    if (i_63_ == 3) {
		b(160, 17861, i_61_, i_60_);
		b(2, 17861, i_61_, i_60_ - 1);
		b(8, 17861, i_61_ - 1, i_60_);
	    }
	}
	if (bool) {
	    if (i == 0) {
		if (i_63_ == 0) {
		    b(65536, 17861, i_61_, i_60_);
		    b(4096, 17861, i_61_ - 1, i_60_);
		}
		if (i_63_ == 1) {
		    b(1024, 17861, i_61_, i_60_);
		    b(16384, 17861, i_61_, i_60_ + 1);
		}
		if (i_63_ == 2) {
		    b(4096, 17861, i_61_, i_60_);
		    b(65536, 17861, i_61_ + 1, i_60_);
		}
		if (i_63_ == 3) {
		    b(16384, 17861, i_61_, i_60_);
		    b(1024, 17861, i_61_, i_60_ - 1);
		}
	    }
	    if (i == 1 || i == 3) {
		if (i_63_ == 0) {
		    b(512, 17861, i_61_, i_60_);
		    b(8192, 17861, i_61_ - 1, i_60_ + 1);
		}
		if (i_63_ == 1) {
		    b(2048, 17861, i_61_, i_60_);
		    b(32768, 17861, i_61_ + 1, i_60_ + 1);
		}
		if (i_63_ == 2) {
		    b(8192, 17861, i_61_, i_60_);
		    b(512, 17861, i_61_ + 1, i_60_ - 1);
		}
		if (i_63_ == 3) {
		    b(32768, 17861, i_61_, i_60_);
		    b(2048, 17861, i_61_ - 1, i_60_ - 1);
		}
	    }
	    if (i == 2) {
		if (i_63_ == 0) {
		    b(66560, 17861, i_61_, i_60_);
		    b(4096, 17861, i_61_ - 1, i_60_);
		    b(16384, 17861, i_61_, i_60_ + 1);
		}
		if (i_63_ == 1) {
		    b(5120, 17861, i_61_, i_60_);
		    b(16384, 17861, i_61_, i_60_ + 1);
		    b(65536, 17861, i_61_ + 1, i_60_);
		}
		if (i_63_ == 2) {
		    b(20480, 17861, i_61_, i_60_);
		    b(65536, 17861, i_61_ + 1, i_60_);
		    b(1024, 17861, i_61_, i_60_ - 1);
		}
		if (i_63_ == 3) {
		    b(81920, 17861, i_61_, i_60_);
		    b(1024, 17861, i_61_, i_60_ - 1);
		    b(4096, 17861, i_61_ - 1, i_60_);
		}
	    }
	}
	if (bool_62_) {
	    if (i == 0) {
		if (i_63_ == 0) {
		    b(536870912, 17861, i_61_, i_60_);
		    b(33554432, 17861, i_61_ - 1, i_60_);
		}
		if (i_63_ == 1) {
		    b(8388608, 17861, i_61_, i_60_);
		    b(134217728, 17861, i_61_, i_60_ + 1);
		}
		if (i_63_ == 2) {
		    b(33554432, 17861, i_61_, i_60_);
		    b(536870912, 17861, i_61_ + 1, i_60_);
		}
		if (i_63_ == 3) {
		    b(134217728, 17861, i_61_, i_60_);
		    b(8388608, 17861, i_61_, i_60_ - 1);
		}
	    }
	    if (i == 1 || i == 3) {
		if (i_63_ == 0) {
		    b(4194304, 17861, i_61_, i_60_);
		    b(67108864, 17861, i_61_ - 1, i_60_ + 1);
		}
		if (i_63_ == 1) {
		    b(16777216, 17861, i_61_, i_60_);
		    b(268435456, 17861, i_61_ + 1, i_60_ + 1);
		}
		if (i_63_ == 2) {
		    b(67108864, 17861, i_61_, i_60_);
		    b(4194304, 17861, i_61_ + 1, i_60_ - 1);
		}
		if (i_63_ == 3) {
		    b(268435456, 17861, i_61_, i_60_);
		    b(16777216, 17861, i_61_ - 1, i_60_ - 1);
		}
	    }
	    if (i == 2) {
		if (i_63_ == 0) {
		    b(545259520, 17861, i_61_, i_60_);
		    b(33554432, 17861, i_61_ - 1, i_60_);
		    b(134217728, 17861, i_61_, i_60_ + 1);
		}
		if (i_63_ == 1) {
		    b(41943040, 17861, i_61_, i_60_);
		    b(134217728, 17861, i_61_, i_60_ + 1);
		    b(536870912, 17861, i_61_ + 1, i_60_);
		}
		if (i_63_ == 2) {
		    b(167772160, 17861, i_61_, i_60_);
		    b(536870912, 17861, i_61_ + 1, i_60_);
		    b(8388608, 17861, i_61_, i_60_ - 1);
		}
		if (i_63_ == 3) {
		    b(671088640, 17861, i_61_, i_60_);
		    b(8388608, 17861, i_61_, i_60_ - 1);
		    b(33554432, 17861, i_61_ - 1, i_60_);
		}
	    }
	}
    }
    
    final boolean a(int i, int i_64_, byte i_65_, int i_66_, int i_67_,
		    int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
	d++;
	int i_73_ = i_64_ + i_71_;
	int i_74_ = i_70_ + i_72_;
	if (i_65_ <= 36)
	    return false;
	int i_75_ = i_68_ + i;
	int i_76_ = i_69_ + i_66_;
	if (i_71_ == i_75_ && (0x2 & i_67_) == 0) {
	    int i_77_ = i_66_ < i_70_ ? i_70_ : i_66_;
	    for (int i_78_ = i_76_ <= i_74_ ? i_76_ : i_74_; i_77_ < i_78_;
		 i_77_++) {
		if (((((wd) this).e[i_75_ - ((wd) this).w - 1]
		      [i_77_ - ((wd) this).o])
		     & 0x8)
		    == 0)
		    return true;
	    }
	} else if (i_73_ != i_68_ || (i_67_ & 0x8) != 0) {
	    if (i_70_ != i_76_ || (i_67_ & 0x1) != 0) {
		if (i_74_ == i_66_ && (i_67_ & 0x4) == 0) {
		    int i_79_ = i_68_ < i_71_ ? i_71_ : i_68_;
		    for (int i_80_ = i_73_ >= i_75_ ? i_75_ : i_73_;
			 i_80_ > i_79_; i_79_++) {
			if (((((wd) this).e[i_79_ - ((wd) this).w]
			      [i_66_ - ((wd) this).o])
			     & 0x20)
			    == 0)
			    return true;
		    }
		}
	    } else {
		int i_81_ = i_68_ < i_71_ ? i_71_ : i_68_;
		for (int i_82_ = i_73_ < i_75_ ? i_73_ : i_75_; i_82_ > i_81_;
		     i_81_++) {
		    if (((((wd) this).e[i_81_ - ((wd) this).w]
			  [i_76_ - 1 - ((wd) this).o])
			 & 0x2)
			== 0)
			return true;
		}
	    }
	} else {
	    int i_83_ = i_66_ < i_70_ ? i_70_ : i_66_;
	    for (int i_84_ = i_74_ < i_76_ ? i_74_ : i_76_; i_83_ < i_84_;
		 i_83_++) {
		if (((((wd) this).e[i_68_ - ((wd) this).w]
		      [i_83_ - ((wd) this).o])
		     & 0x80)
		    == 0)
		    return true;
	    }
	}
	return false;
    }
    
    private final void b(int i, int i_85_, int i_86_, int i_87_) {
	u++;
	if (i_85_ != 17861)
	    ((wd) this).e = null;
	((wd) this).e[i_86_][i_87_] = hba.bitwiseArg1ORArg2(((wd) this).e[i_86_][i_87_], i);
    }
    
    final void a(int i, boolean bool, int i_88_, byte i_89_, int i_90_,
		 boolean bool_91_, int i_92_) {
	v++;
	int i_93_ = 256;
	if (bool)
	    i_93_ |= 0x20000;
	i_90_ -= ((wd) this).w;
	if (bool_91_)
	    i_93_ |= 0x40000000;
	i_92_ -= ((wd) this).o;
	int i_94_ = i_90_;
	if (i_89_ != 100)
	    ((wd) this).j = -89;
	for (/**/; i + i_90_ > i_94_; i_94_++) {
	    if (i_94_ >= 0 && ((wd) this).x > i_94_) {
		for (int i_95_ = i_92_; i_88_ + i_92_ > i_95_; i_95_++) {
		    if (i_95_ >= 0 && i_95_ < ((wd) this).j)
			b(i_93_, i_89_ + 17761, i_94_, i_95_);
		}
	    }
	}
    }
    
    final void a(int i, int i_96_, int i_97_, int i_98_, boolean bool,
		 int i_99_, boolean bool_100_, int i_101_) {
	B++;
	int i_102_ = 256;
	if (bool)
	    i_102_ |= 0x20000;
	i_101_ -= ((wd) this).o;
	i_99_ -= ((wd) this).w;
	if (i_97_ == 1 || i_97_ == 3) {
	    int i_103_ = i_98_;
	    i_98_ = i_96_;
	    i_96_ = i_103_;
	}
	if (bool_100_)
	    i_102_ |= 0x40000000;
	int i_104_ = 47 / ((-49 - i) / 50);
	for (int i_105_ = i_99_; i_99_ + i_98_ > i_105_; i_105_++) {
	    if (i_105_ >= 0 && ((wd) this).x > i_105_) {
		for (int i_106_ = i_101_; i_106_ < i_96_ + i_101_; i_106_++) {
		    if (i_106_ >= 0 && ((wd) this).j > i_106_)
			a(1, i_105_, i_106_, i_102_);
		}
	    }
	}
    }
    
    final void b(boolean bool, int i, int i_107_, int i_108_, int i_109_,
		 boolean bool_110_, int i_111_) {
	i_107_ -= ((wd) this).o;
	l++;
	i_109_ -= ((wd) this).w;
	if (i == 0) {
	    if (i_111_ == 0) {
		a(1, i_109_, i_107_, 128);
		a(1, i_109_ - 1, i_107_, 8);
	    }
	    if (i_111_ == 1) {
		a(1, i_109_, i_107_, 2);
		a(1, i_109_, i_107_ + 1, 32);
	    }
	    if (i_111_ == 2) {
		a(1, i_109_, i_107_, 8);
		a(1, i_109_ + 1, i_107_, 128);
	    }
	    if (i_111_ == 3) {
		a(1, i_109_, i_107_, 32);
		a(1, i_109_, i_107_ - 1, 2);
	    }
	}
	int i_112_ = -7 % ((68 - i_108_) / 48);
	if (i == 1 || i == 3) {
	    if (i_111_ == 0) {
		a(1, i_109_, i_107_, 1);
		a(1, i_109_ - 1, i_107_ + 1, 16);
	    }
	    if (i_111_ == 1) {
		a(1, i_109_, i_107_, 4);
		a(1, i_109_ + 1, i_107_ + 1, 64);
	    }
	    if (i_111_ == 2) {
		a(1, i_109_, i_107_, 16);
		a(1, i_109_ + 1, i_107_ - 1, 1);
	    }
	    if (i_111_ == 3) {
		a(1, i_109_, i_107_, 64);
		a(1, i_109_ - 1, i_107_ - 1, 4);
	    }
	}
	if (i == 2) {
	    if (i_111_ == 0) {
		a(1, i_109_, i_107_, 130);
		a(1, i_109_ - 1, i_107_, 8);
		a(1, i_109_, i_107_ + 1, 32);
	    }
	    if (i_111_ == 1) {
		a(1, i_109_, i_107_, 10);
		a(1, i_109_, i_107_ + 1, 32);
		a(1, i_109_ + 1, i_107_, 128);
	    }
	    if (i_111_ == 2) {
		a(1, i_109_, i_107_, 40);
		a(1, i_109_ + 1, i_107_, 128);
		a(1, i_109_, i_107_ - 1, 2);
	    }
	    if (i_111_ == 3) {
		a(1, i_109_, i_107_, 160);
		a(1, i_109_, i_107_ - 1, 2);
		a(1, i_109_ - 1, i_107_, 8);
	    }
	}
	if (bool_110_) {
	    if (i == 0) {
		if (i_111_ == 0) {
		    a(1, i_109_, i_107_, 65536);
		    a(1, i_109_ - 1, i_107_, 4096);
		}
		if (i_111_ == 1) {
		    a(1, i_109_, i_107_, 1024);
		    a(1, i_109_, i_107_ + 1, 16384);
		}
		if (i_111_ == 2) {
		    a(1, i_109_, i_107_, 4096);
		    a(1, i_109_ + 1, i_107_, 65536);
		}
		if (i_111_ == 3) {
		    a(1, i_109_, i_107_, 16384);
		    a(1, i_109_, i_107_ - 1, 1024);
		}
	    }
	    if (i == 1 || i == 3) {
		if (i_111_ == 0) {
		    a(1, i_109_, i_107_, 512);
		    a(1, i_109_ - 1, i_107_ + 1, 8192);
		}
		if (i_111_ == 1) {
		    a(1, i_109_, i_107_, 2048);
		    a(1, i_109_ + 1, i_107_ + 1, 32768);
		}
		if (i_111_ == 2) {
		    a(1, i_109_, i_107_, 8192);
		    a(1, i_109_ + 1, i_107_ - 1, 512);
		}
		if (i_111_ == 3) {
		    a(1, i_109_, i_107_, 32768);
		    a(1, i_109_ - 1, i_107_ - 1, 2048);
		}
	    }
	    if (i == 2) {
		if (i_111_ == 0) {
		    a(1, i_109_, i_107_, 66560);
		    a(1, i_109_ - 1, i_107_, 4096);
		    a(1, i_109_, i_107_ + 1, 16384);
		}
		if (i_111_ == 1) {
		    a(1, i_109_, i_107_, 5120);
		    a(1, i_109_, i_107_ + 1, 16384);
		    a(1, i_109_ + 1, i_107_, 65536);
		}
		if (i_111_ == 2) {
		    a(1, i_109_, i_107_, 20480);
		    a(1, i_109_ + 1, i_107_, 65536);
		    a(1, i_109_, i_107_ - 1, 1024);
		}
		if (i_111_ == 3) {
		    a(1, i_109_, i_107_, 81920);
		    a(1, i_109_, i_107_ - 1, 1024);
		    a(1, i_109_ - 1, i_107_, 4096);
		}
	    }
	}
	if (bool) {
	    if (i == 0) {
		if (i_111_ == 0) {
		    a(1, i_109_, i_107_, 536870912);
		    a(1, i_109_ - 1, i_107_, 33554432);
		}
		if (i_111_ == 1) {
		    a(1, i_109_, i_107_, 8388608);
		    a(1, i_109_, i_107_ + 1, 134217728);
		}
		if (i_111_ == 2) {
		    a(1, i_109_, i_107_, 33554432);
		    a(1, i_109_ + 1, i_107_, 536870912);
		}
		if (i_111_ == 3) {
		    a(1, i_109_, i_107_, 134217728);
		    a(1, i_109_, i_107_ - 1, 8388608);
		}
	    }
	    if (i == 1 || i == 3) {
		if (i_111_ == 0) {
		    a(1, i_109_, i_107_, 4194304);
		    a(1, i_109_ - 1, i_107_ + 1, 67108864);
		}
		if (i_111_ == 1) {
		    a(1, i_109_, i_107_, 16777216);
		    a(1, i_109_ + 1, i_107_ + 1, 268435456);
		}
		if (i_111_ == 2) {
		    a(1, i_109_, i_107_, 67108864);
		    a(1, i_109_ + 1, i_107_ - 1, 4194304);
		}
		if (i_111_ == 3) {
		    a(1, i_109_, i_107_, 268435456);
		    a(1, i_109_ - 1, i_107_ - 1, 16777216);
		}
	    }
	    if (i == 2) {
		if (i_111_ == 0) {
		    a(1, i_109_, i_107_, 545259520);
		    a(1, i_109_ - 1, i_107_, 33554432);
		    a(1, i_109_, i_107_ + 1, 134217728);
		}
		if (i_111_ == 1) {
		    a(1, i_109_, i_107_, 41943040);
		    a(1, i_109_, i_107_ + 1, 134217728);
		    a(1, i_109_ + 1, i_107_, 536870912);
		}
		if (i_111_ == 2) {
		    a(1, i_109_, i_107_, 167772160);
		    a(1, i_109_ + 1, i_107_, 536870912);
		    a(1, i_109_, i_107_ - 1, 8388608);
		}
		if (i_111_ == 3) {
		    a(1, i_109_, i_107_, 671088640);
		    a(1, i_109_, i_107_ - 1, 8388608);
		    a(1, i_109_ - 1, i_107_, 33554432);
		}
	    }
	}
    }
    
    final boolean b(int i, int i_113_, int i_114_, int i_115_, int i_116_,
		    int i_117_, int i_118_, int i_119_) {
	if (i_115_ != 67108864)
	    y = null;
	g++;
	if (i_114_ == 1) {
	    if (i_119_ == i && i_113_ == i_116_)
		return true;
	} else if (i_119_ >= i && i_119_ <= i - 1 + i_114_ && i_116_ <= i_116_
		   && i_116_ <= i_116_ - (-i_114_ + 1))
	    return true;
	i_116_ -= ((wd) this).o;
	i_113_ -= ((wd) this).o;
	i_119_ -= ((wd) this).w;
	i -= ((wd) this).w;
	if (i_114_ == 1) {
	    if (i_118_ == 0) {
		if (i_117_ != 0) {
		    if (i_117_ != 1) {
			if (i_117_ == 2) {
			    if (i_119_ + 1 == i && i_116_ == i_113_)
				return true;
			    if (i == i_119_ && i_113_ == i_116_ + 1
				&& (0x2c0120 & ((wd) this).e[i][i_113_]) == 0)
				return true;
			    if (i == i_119_ && i_116_ - 1 == i_113_
				&& (0x2c0102 & ((wd) this).e[i][i_113_]) == 0)
				return true;
			} else if (i_117_ == 3) {
			    if (i_119_ == i && i_116_ - 1 == i_113_)
				return true;
			    if (i == i_119_ - 1 && i_113_ == i_116_
				&& (0x2c0108 & ((wd) this).e[i][i_113_]) == 0)
				return true;
			    if (i_119_ + 1 == i && i_116_ == i_113_
				&& (((wd) this).e[i][i_113_] & 0x2c0180) == 0)
				return true;
			}
		    } else {
			if (i == i_119_ && i_113_ == i_116_ + 1)
			    return true;
			if (i_119_ - 1 == i && i_116_ == i_113_
			    && (((wd) this).e[i][i_113_] & 0x2c0108) == 0)
			    return true;
			if (i_119_ + 1 == i && i_116_ == i_113_
			    && (((wd) this).e[i][i_113_] & 0x2c0180) == 0)
			    return true;
		    }
		} else {
		    if (i_119_ - 1 == i && i_116_ == i_113_)
			return true;
		    if (i_119_ == i && i_113_ == i_116_ + 1
			&& (0x2c0120 & ((wd) this).e[i][i_113_]) == 0)
			return true;
		    if (i == i_119_ && i_116_ - 1 == i_113_
			&& (((wd) this).e[i][i_113_] & 0x2c0102) == 0)
			return true;
		}
	    }
	    if (i_118_ == 2) {
		if (i_117_ == 0) {
		    if (i == i_119_ - 1 && i_116_ == i_113_)
			return true;
		    if (i_119_ == i && i_116_ + 1 == i_113_)
			return true;
		    if (i == i_119_ + 1 && i_116_ == i_113_
			&& (((wd) this).e[i][i_113_] & 0x2c0180) == 0)
			return true;
		    if (i == i_119_ && i_116_ - 1 == i_113_
			&& (((wd) this).e[i][i_113_] & 0x2c0102) == 0)
			return true;
		} else if (i_117_ == 1) {
		    if (i == i_119_ - 1 && i_113_ == i_116_
			&& (0x2c0108 & ((wd) this).e[i][i_113_]) == 0)
			return true;
		    if (i == i_119_ && i_116_ + 1 == i_113_)
			return true;
		    if (i_119_ + 1 == i && i_116_ == i_113_)
			return true;
		    if (i_119_ == i && i_116_ - 1 == i_113_
			&& (0x2c0102 & ((wd) this).e[i][i_113_]) == 0)
			return true;
		} else if (i_117_ != 2) {
		    if (i_117_ == 3) {
			if (i == i_119_ - 1 && i_113_ == i_116_)
			    return true;
			if (i == i_119_ && i_113_ == i_116_ + 1
			    && (((wd) this).e[i][i_113_] & 0x2c0120) == 0)
			    return true;
			if (i == i_119_ + 1 && i_113_ == i_116_
			    && (0x2c0180 & ((wd) this).e[i][i_113_]) == 0)
			    return true;
			if (i_119_ == i && i_116_ - 1 == i_113_)
			    return true;
		    }
		} else {
		    if (i_119_ - 1 == i && i_113_ == i_116_
			&& (((wd) this).e[i][i_113_] & 0x2c0108) == 0)
			return true;
		    if (i_119_ == i && i_116_ + 1 == i_113_
			&& (0x2c0120 & ((wd) this).e[i][i_113_]) == 0)
			return true;
		    if (i == i_119_ + 1 && i_113_ == i_116_)
			return true;
		    if (i_119_ == i && i_113_ == i_116_ - 1)
			return true;
		}
	    }
	    if (i_118_ == 9) {
		if (i == i_119_ && i_116_ + 1 == i_113_
		    && (((wd) this).e[i][i_113_] & 0x20) == 0)
		    return true;
		if (i == i_119_ && i_113_ == i_116_ - 1
		    && (((wd) this).e[i][i_113_] & 0x2) == 0)
		    return true;
		if (i == i_119_ - 1 && i_116_ == i_113_
		    && (0x8 & ((wd) this).e[i][i_113_]) == 0)
		    return true;
		if (i_119_ + 1 == i && i_113_ == i_116_
		    && (((wd) this).e[i][i_113_] & 0x80) == 0)
		    return true;
	    }
	} else {
	    int i_120_ = i_114_ - 1 + i;
	    int i_121_ = i_113_ + i_114_ - 1;
	    if (i_118_ == 0) {
		if (i_117_ != 0) {
		    if (i_117_ != 1) {
			if (i_117_ == 2) {
			    if (i == i_119_ + 1 && i_113_ <= i_116_
				&& i_116_ <= i_121_)
				return true;
			    if (i <= i_119_ && i_119_ <= i_120_
				&& i_116_ + 1 == i_113_
				&& ((0x2c0120 & ((wd) this).e[i_119_][i_113_])
				    == 0))
				return true;
			    if (i_119_ >= i && i_119_ <= i_120_
				&& i_113_ == i_116_ - i_114_
				&& ((0x2c0102 & ((wd) this).e[i_119_][i_121_])
				    == 0))
				return true;
			} else if (i_117_ == 3) {
			    if (i_119_ >= i && i_120_ >= i_119_
				&& i_116_ - i_114_ == i_113_)
				return true;
			    if (i_119_ - i_114_ == i && i_113_ <= i_116_
				&& i_116_ <= i_121_
				&& ((0x2c0108 & ((wd) this).e[i_120_][i_116_])
				    == 0))
				return true;
			    if (i == i_119_ + 1 && i_116_ >= i_113_
				&& i_116_ <= i_121_
				&& (0x2c0180 & ((wd) this).e[i][i_116_]) == 0)
				return true;
			}
		    } else {
			if (i_119_ >= i && i_120_ >= i_119_
			    && i_113_ == i_116_ + 1)
			    return true;
			if (i == i_119_ - i_114_ && i_113_ <= i_116_
			    && i_116_ <= i_121_
			    && (0x2c0108 & ((wd) this).e[i_120_][i_116_]) == 0)
			    return true;
			if (i == i_119_ + 1 && i_113_ <= i_116_
			    && i_116_ <= i_121_
			    && (((wd) this).e[i][i_116_] & 0x2c0180) == 0)
			    return true;
		    }
		} else {
		    if (i == i_119_ - i_114_ && i_116_ >= i_113_
			&& i_116_ <= i_121_)
			return true;
		    if (i_119_ >= i && i_119_ <= i_120_ && i_116_ + 1 == i_113_
			&& (0x2c0120 & ((wd) this).e[i_119_][i_113_]) == 0)
			return true;
		    if (i <= i_119_ && i_119_ <= i_120_
			&& i_113_ == i_116_ - i_114_
			&& (0x2c0102 & ((wd) this).e[i_119_][i_121_]) == 0)
			return true;
		}
	    }
	    if (i_118_ == 2) {
		if (i_117_ != 0) {
		    if (i_117_ == 1) {
			if (i == i_119_ - i_114_ && i_116_ >= i_113_
			    && i_121_ >= i_116_
			    && (0x2c0108 & ((wd) this).e[i_120_][i_116_]) == 0)
			    return true;
			if (i <= i_119_ && i_119_ <= i_120_
			    && i_113_ == i_116_ + 1)
			    return true;
			if (i_119_ + 1 == i && i_113_ <= i_116_
			    && i_121_ >= i_116_)
			    return true;
			if (i <= i_119_ && i_119_ <= i_120_
			    && i_116_ - i_114_ == i_113_
			    && (0x2c0102 & ((wd) this).e[i_119_][i_121_]) == 0)
			    return true;
		    } else if (i_117_ == 2) {
			if (i_119_ - i_114_ == i && i_116_ >= i_113_
			    && i_116_ <= i_121_
			    && (0x2c0108 & ((wd) this).e[i_120_][i_116_]) == 0)
			    return true;
			if (i <= i_119_ && i_120_ >= i_119_
			    && i_113_ == i_116_ + 1
			    && (((wd) this).e[i_119_][i_113_] & 0x2c0120) == 0)
			    return true;
			if (i == i_119_ + 1 && i_113_ <= i_116_
			    && i_121_ >= i_116_)
			    return true;
			if (i <= i_119_ && i_119_ <= i_120_
			    && i_116_ - i_114_ == i_113_)
			    return true;
		    } else if (i_117_ == 3) {
			if (i_119_ - i_114_ == i && i_116_ >= i_113_
			    && i_121_ >= i_116_)
			    return true;
			if (i <= i_119_ && i_119_ <= i_120_
			    && i_113_ == i_116_ + 1
			    && (((wd) this).e[i_119_][i_113_] & 0x2c0120) == 0)
			    return true;
			if (i == i_119_ + 1 && i_116_ >= i_113_
			    && i_121_ >= i_116_
			    && (0x2c0180 & ((wd) this).e[i][i_116_]) == 0)
			    return true;
			if (i_119_ >= i && i_120_ >= i_119_
			    && i_113_ == i_116_ - i_114_)
			    return true;
		    }
		} else {
		    if (i == i_119_ - i_114_ && i_113_ <= i_116_
			&& i_121_ >= i_116_)
			return true;
		    if (i <= i_119_ && i_120_ >= i_119_
			&& i_116_ + 1 == i_113_)
			return true;
		    if (i == i_119_ + 1 && i_116_ >= i_113_ && i_121_ >= i_116_
			&& (((wd) this).e[i][i_116_] & 0x2c0180) == 0)
			return true;
		    if (i_119_ >= i && i_119_ <= i_120_
			&& i_116_ - i_114_ == i_113_
			&& (((wd) this).e[i_119_][i_121_] & 0x2c0102) == 0)
			return true;
		}
	    }
	    if (i_118_ == 9) {
		if (i_119_ >= i && i_120_ >= i_119_ && i_113_ == i_116_ + 1
		    && (((wd) this).e[i_119_][i_113_] & 0x2c0120) == 0)
		    return true;
		if (i <= i_119_ && i_119_ <= i_120_
		    && i_116_ - i_114_ == i_113_
		    && (((wd) this).e[i_119_][i_121_] & 0x2c0102) == 0)
		    return true;
		if (i_119_ - i_114_ == i && i_113_ <= i_116_
		    && i_121_ >= i_116_
		    && (0x2c0108 & ((wd) this).e[i_120_][i_116_]) == 0)
		    return true;
		if (i == i_119_ + 1 && i_113_ <= i_116_ && i_116_ <= i_121_
		    && (((wd) this).e[i][i_116_] & 0x2c0180) == 0)
		    return true;
	    }
	}
	return false;
    }
    
    final void a(int i, int i_122_, int i_123_) {
	i_123_ -= ((wd) this).o;
	i -= ((wd) this).w;
	if (i_122_ <= 4)
	    ((wd) this).w = 52;
	a++;
	((wd) this).e[i][i_123_] = uca.a(((wd) this).e[i][i_123_], -262145);
    }
    
    static {
	b = new wl("WIP", 2);
    }
}
