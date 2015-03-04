/* nj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class nj extends nfa
{
    static int g;
    static int h;
    static int i;
    static wea j = new wea(3, 2);
    static int k;
    static String[] l = new String[200];
    static boolean m;
    static int n;
    static GameInPacket incomingPacket108 = new GameInPacket(108, 17);
    static int p;
    
    static final String a(int[] is, byte i) {
	n++;
	if (i != 126)
	    return null;
	StringBuffer stringbuffer = new StringBuffer();
	int i_0_ = al.q;
	for (int i_1_ = 0; is.length > i_1_; i_1_++) {
	    ru var_ru = GameInPacket.d.b((byte) 0, is[i_1_]);
	    if (((ru) var_ru).a != -1) {
		f var_f = (f) wa.C.get((long) ((ru) var_ru).a, (byte) 100);
		if (var_f == null) {
		    aga var_aga = aga.a(sm.a, ((ru) var_ru).a, 0);
		    if (var_aga != null) {
			var_f = lg.r.a(var_aga, true);
			wa.C.put((long) ((ru) var_ru).a, var_f, i - 125);
		    }
		}
		if (var_f != null) {
		    en.S[i_0_] = var_f;
		    stringbuffer.append(" <img=").append(i_0_).append(">");
		    i_0_++;
		}
	    }
	}
	return stringbuffer.toString();
    }
    
    static final int a(byte i, int i_2_, int i_3_) {
	k++;
	int i_4_ = (dg.b(i_3_ - 1, i_2_ - 1, -11)
		    + dg.b(i_3_ - 1, i_2_ + 1, i ^ ~0x63)
		    - (-dg.b(i_3_ + 1, i_2_ - 1, -11)
		       - dg.b(i_3_ + 1, i_2_ + 1, -11)));
	if (i != 105)
	    return 61;
	int i_5_ = (dg.b(i_3_, i_2_ - 1, i - 116)
		    - (-dg.b(i_3_ - 1, i_2_, -11) - dg.b(i_3_ + 1, i_2_, -11)
		       - dg.b(i_3_, i_2_ + 1, -11)));
	int i_6_ = dg.b(i_3_, i_2_, -11);
	return i_5_ / 8 + (i_4_ / 16 + i_6_ / 4);
    }
    
    static final void a(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_) {
	g++;
	int i_12_ = -12 / ((i_8_ - 52) / 53);
	if (Class_db.o >= i_9_ && Class_md.h <= i_11_) {
	    boolean bool;
	    if (i < vaa.xb) {
		i = vaa.xb;
		bool = false;
	    } else if (jga.v < i) {
		bool = false;
		i = jga.v;
	    } else
		bool = true;
	    boolean bool_13_;
	    if (i_10_ >= vaa.xb) {
		if (jga.v >= i_10_)
		    bool_13_ = true;
		else {
		    i_10_ = jga.v;
		    bool_13_ = false;
		}
	    } else {
		i_10_ = vaa.xb;
		bool_13_ = false;
	    }
	    if (i_9_ >= Class_md.h)
		kg.a(i, wh.O[i_9_++], i_7_, i_10_, 26);
	    else
		i_9_ = Class_md.h;
	    if (i_11_ <= Class_db.o)
		kg.a(i, wh.O[i_11_--], i_7_, i_10_, 100);
	    else
		i_11_ = Class_db.o;
	    if (bool && bool_13_) {
		for (int i_14_ = i_9_; i_11_ >= i_14_; i_14_++) {
		    int[] is = wh.O[i_14_];
		    is[i] = is[i_10_] = i_7_;
		}
	    } else if (bool) {
		for (int i_15_ = i_9_; i_15_ <= i_11_; i_15_++)
		    wh.O[i_15_][i] = i_7_;
	    } else if (bool_13_) {
		for (int i_16_ = i_9_; i_11_ >= i_16_; i_16_++)
		    wh.O[i_16_][i_10_] = i_7_;
	    }
	}
    }
    
    public static void b(int i) {
	incomingPacket108 = null;
	l = null;
	if (i != 0)
	    m = true;
	j = null;
    }
    
    static final sa a(byte i, Class_r class_r, int i_17_) {
	if (i < 55)
	    return null;
	p++;
	bq var_bq = wo.a((byte) -66, i_17_, class_r, true);
	if (var_bq == null)
	    return null;
	return ((bq) var_bq).a;
    }
    
    static final void a(int i, int i_18_) {
	if (i < -50) {
	    nj.i++;
	    if (gf.a((byte) 123, i_18_))
		on.a(71, Node_Sub.o[i_18_], -1);
	}
    }
    
    static final boolean a(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			   wd var_wd, int i_23_, int i_24_, int i_25_,
			   int i_26_, int i_27_) {
	h++;
	int i_28_ = i_21_;
	int i_29_ = i_23_;
	int i_30_ = 64;
	int i_31_ = 64;
	if (i_25_ != 4095)
	    incomingPacket108 = null;
	int i_32_ = i_21_ - i_30_;
	int i_33_ = i_23_ - i_31_;
	it.J[i_30_][i_31_] = 99;
	ps.b[i_30_][i_31_] = 0;
	int i_34_ = 0;
	int i_35_ = 0;
	Class_ad.l[i_34_] = i_28_;
	jn.I[i_34_++] = i_29_;
	int[][] is = ((wd) var_wd).e;
	while (i_34_ != i_35_) {
	    i_28_ = Class_ad.l[i_35_];
	    i_29_ = jn.I[i_35_];
	    i_31_ = i_29_ - i_33_;
	    i_30_ = i_28_ - i_32_;
	    i_35_ = i_35_ + 1 & 0xfff;
	    int i_36_ = i_28_ - ((wd) var_wd).w;
	    int i_37_ = i_29_ - ((wd) var_wd).o;
	    int i_38_ = i_24_;
	while_108_:
	    do {
	    while_107_:
		do {
		while_106_:
		    do {
		    while_105_:
			do {
			    do {
				if (i_38_ != -4) {
				    if (i_38_ != -3) {
					if (i_38_ != -2) {
					    if (i_38_ != -1) {
						if (i_38_ == 0 || i_38_ == 1
						    || i_38_ == 2 || i_38_ == 3
						    || i_38_ == 9)
						    break while_106_;
						break while_107_;
					    }
					} else
					    break;
					break while_105_;
				    }
				} else {
				    if (i == i_28_ && i_26_ == i_29_) {
					je.m = i_29_;
					bd.l = i_28_;
					return true;
				    }
				    break while_108_;
				}
				if (eaa.a(i_28_, false, 2, i_29_, i_22_, i,
					  i_26_, 2, i_20_)) {
				    je.m = i_29_;
				    bd.l = i_28_;
				    return true;
				}
				break while_108_;
			    } while (false);
			    if (var_wd.a(i_22_, 2, (byte) 119, i_26_, i_27_, i,
					 i_20_, i_29_, i_28_, 2)) {
				bd.l = i_28_;
				je.m = i_29_;
				return true;
			    }
			    break while_108_;
			} while (false);
			if (var_wd.a(-1, i_22_, i, i_29_, i_26_, i_20_, i_28_,
				     i_27_, 2)) {
			    bd.l = i_28_;
			    je.m = i_29_;
			    return true;
			}
			break while_108_;
		    } while (false);
		    if (var_wd.b(i_28_, i_29_, 2, 67108864, i_26_, i_19_,
				 i_24_, i)) {
			bd.l = i_28_;
			je.m = i_29_;
			return true;
		    }
		    break while_108_;
		} while (false);
		if (var_wd.a(2, 44, i_24_, i_26_, i_19_, i_29_, i_28_, i)) {
		    je.m = i_29_;
		    bd.l = i_28_;
		    return true;
		}
	    } while (false);
	    i_38_ = ps.b[i_30_][i_31_] + 1;
	    if (i_30_ > 0 && it.J[i_30_ - 1][i_31_] == 0
		&& (is[i_36_ - 1][i_37_] & 0x43a40000) == 0
		&& (0x4e240000 & is[i_36_ - 1][i_37_ + 1]) == 0) {
		Class_ad.l[i_34_] = i_28_ - 1;
		jn.I[i_34_] = i_29_;
		i_34_ = 0xfff & i_34_ + 1;
		it.J[i_30_ - 1][i_31_] = 2;
		ps.b[i_30_ - 1][i_31_] = i_38_;
	    }
	    if (i_30_ < 126 && it.J[i_30_ + 1][i_31_] == 0
		&& (0x60e40000 & is[i_36_ + 2][i_37_]) == 0
		&& (0x78240000 & is[i_36_ + 2][i_37_ + 1]) == 0) {
		Class_ad.l[i_34_] = i_28_ + 1;
		jn.I[i_34_] = i_29_;
		it.J[i_30_ + 1][i_31_] = 8;
		i_34_ = i_34_ + 1 & 0xfff;
		ps.b[i_30_ + 1][i_31_] = i_38_;
	    }
	    if (i_31_ > 0 && it.J[i_30_][i_31_ - 1] == 0
		&& (0x43a40000 & is[i_36_][i_37_ - 1]) == 0
		&& (is[i_36_ + 1][i_37_ - 1] & 0x60e40000) == 0) {
		Class_ad.l[i_34_] = i_28_;
		jn.I[i_34_] = i_29_ - 1;
		it.J[i_30_][i_31_ - 1] = 1;
		i_34_ = 0xfff & i_34_ + 1;
		ps.b[i_30_][i_31_ - 1] = i_38_;
	    }
	    if (i_31_ < 126 && it.J[i_30_][i_31_ + 1] == 0
		&& (is[i_36_][i_37_ + 2] & 0x4e240000) == 0
		&& (0x78240000 & is[i_36_ + 1][i_37_ + 2]) == 0) {
		Class_ad.l[i_34_] = i_28_;
		jn.I[i_34_] = i_29_ + 1;
		it.J[i_30_][i_31_ + 1] = 4;
		i_34_ = i_34_ + 1 & 0xfff;
		ps.b[i_30_][i_31_ + 1] = i_38_;
	    }
	    if (i_30_ > 0 && i_31_ > 0 && it.J[i_30_ - 1][i_31_ - 1] == 0
		&& (is[i_36_ - 1][i_37_] & 0x4fa40000) == 0
		&& (is[i_36_ - 1][i_37_ - 1] & 0x43a40000) == 0
		&& (0x63e40000 & is[i_36_][i_37_ - 1]) == 0) {
		Class_ad.l[i_34_] = i_28_ - 1;
		jn.I[i_34_] = i_29_ - 1;
		it.J[i_30_ - 1][i_31_ - 1] = 3;
		i_34_ = 0xfff & i_34_ + 1;
		ps.b[i_30_ - 1][i_31_ - 1] = i_38_;
	    }
	    if (i_30_ < 126 && i_31_ > 0 && it.J[i_30_ + 1][i_31_ - 1] == 0
		&& (is[i_36_ + 1][i_37_ - 1] & 0x63e40000) == 0
		&& (0x60e40000 & is[i_36_ + 2][i_37_ - 1]) == 0
		&& (0x78e40000 & is[i_36_ + 2][i_37_]) == 0) {
		Class_ad.l[i_34_] = i_28_ + 1;
		jn.I[i_34_] = i_29_ - 1;
		i_34_ = 0xfff & i_34_ + 1;
		it.J[i_30_ + 1][i_31_ - 1] = 9;
		ps.b[i_30_ + 1][i_31_ - 1] = i_38_;
	    }
	    if (i_30_ > 0 && i_31_ < 126 && it.J[i_30_ - 1][i_31_ + 1] == 0
		&& (0x4fa40000 & is[i_36_ - 1][i_37_ + 1]) == 0
		&& (0x4e240000 & is[i_36_ - 1][i_37_ + 2]) == 0
		&& (0x7e240000 & is[i_36_][i_37_ + 2]) == 0) {
		Class_ad.l[i_34_] = i_28_ - 1;
		jn.I[i_34_] = i_29_ + 1;
		i_34_ = 0xfff & i_34_ + 1;
		it.J[i_30_ - 1][i_31_ + 1] = 6;
		ps.b[i_30_ - 1][i_31_ + 1] = i_38_;
	    }
	    if (i_30_ < 126 && i_31_ < 126 && it.J[i_30_ + 1][i_31_ + 1] == 0
		&& (0x7e240000 & is[i_36_ + 1][i_37_ + 2]) == 0
		&& (is[i_36_ + 2][i_37_ + 2] & 0x78240000) == 0
		&& (0x78e40000 & is[i_36_ + 2][i_37_ + 1]) == 0) {
		Class_ad.l[i_34_] = i_28_ + 1;
		jn.I[i_34_] = i_29_ + 1;
		i_34_ = 0xfff & i_34_ + 1;
		it.J[i_30_ + 1][i_31_ + 1] = 12;
		ps.b[i_30_ + 1][i_31_ + 1] = i_38_;
	    }
	}
	je.m = i_29_;
	bd.l = i_28_;
	return false;
    }
}
