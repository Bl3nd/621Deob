/* ss - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ss
{
    static int a;
    char b;
    static GameOutPacket c = new GameOutPacket(12, 3);
    static int d;
    il e;
    private int f;
    static int g;
    static int h;
    static int i;
    static int j;
    static int k;
    private String l = "null";
    static int m;
    static int var_n;
    static int o;
    static int p;
    static int q;
    private il r;
    char s;
    static int t;
    static int u;
    static int v;
    
    final boolean a(String string, int i) {
	a++;
	if (((ss) this).e == null)
	    return false;
	if (r == null)
	    a((byte) 33);
	for (gca var_gca = (gca) r.a(-32748, ar.b((byte) -116, string));
	     var_gca != null; var_gca = (gca) r.c((byte) 112)) {
	    if (((gca) var_gca).k.equals(string))
		return true;
	}
	if (i != 5)
	    c(-110, 86);
	return false;
    }
    
    static final void a(pl var_pl, byte i) {
	sw.e = 0;
	var_n++;
	ui.i = 0;
	tfa.w = new fca();
	pp.m = new fe[1024];
	if (i != 57)
	    c = null;
	da.d = new tq[gr.a[ISAAC.k] + 1];
	vq.n = 0;
	tba.r = 0;
	pca.a(i + 36104, var_pl);
	bk.a(var_pl, -128);
    }
    
    static final void a(int i, Class_r class_r, Class_ae class_ae, int i_0_,
			int i_1_) {
	m++;
	bg.c.d(2);
	if (!fu.f) {
	    if (i_0_ != 0)
		a(false);
	    for (Class_vb class_vb = (Class_vb) class_ae.a((int) 104);
		 class_vb != null;
		 class_vb = (Class_vb) class_ae.b((byte) 114)) {
		ww var_ww = kca.a.a(((Class_vb) class_vb).o, (int) -119);
		if (vk.a(var_ww, (byte) -54)) {
		    boolean bool
			= br.a(i_0_, class_vb, class_r, i, var_ww, i_1_);
		    if (bool)
			waa.a(class_r, 32993, class_vb, var_ww);
		}
	    }
	}
    }
    
    static final void a(int i, int i_2_) {
	ha var_ha = null;
	for (int i_3_ = i; i_3_ < i_2_; i_3_++) {
	    Class_i class_i = vr.b[i_3_];
	    if (class_i != null) {
		for (int i_4_ = 0; i_4_ < nf.H; i_4_++) {
		    for (int i_5_ = 0; i_5_ < sv.T; i_5_++) {
			var_ha = class_i.v(i_5_, i_4_, var_ha);
			if (var_ha != null) {
			    int i_6_ = i_5_ << Class_fb.a;
			    int i_7_ = i_4_ << Class_fb.a;
			    for (int i_8_ = i_3_ - 1; i_8_ >= 0; i_8_--) {
				Class_i class_i_9_ = vr.b[i_8_];
				if (class_i_9_ != null) {
				    int i_10_
					= (class_i.a(i_4_, (byte) 51, i_5_)
					   - class_i_9_.a(i_4_, (byte) 51,
							  i_5_));
				    int i_11_
					= (class_i.a(i_4_, (byte) 51, i_5_ + 1)
					   - class_i_9_.a(i_4_, (byte) 51,
							  i_5_ + 1));
				    int i_12_
					= (class_i.a(i_4_ + 1, (byte) 51,
						     i_5_ + 1)
					   - class_i_9_.a(i_4_ + 1, (byte) 51,
							  i_5_ + 1));
				    int i_13_
					= (class_i.a(i_4_ + 1, (byte) 51, i_5_)
					   - class_i_9_.a(i_4_ + 1, (byte) 51,
							  i_5_));
				    class_i_9_.E(var_ha, i_6_,
						 (i_10_ + i_11_ + i_12_
						  + i_13_) / 4,
						 i_7_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void a(int i, int i_14_, int i_15_, int i_16_, byte i_17_) {
	up.H = i;
	if (i_17_ != 50)
	    c = null;
	n.i = i_15_;
	ih.i = i_14_;
	d++;
	Class_kf.F = i_16_;
    }
    
    static final boolean a(int i, boolean bool, int i_18_) {
	if (bool != false)
	    return true;
	u++;
	if (!((0x60000 & i) != 0 | ih.a((byte) 108, i, i_18_))
	    && !kl.a(i, 55, i_18_) && !qg.a(0, i_18_, i))
	    return false;
	return true;
    }
    
    private final void a(int i, BytesParser var_es, int i_19_) {
	if (i_19_ != 1) {
	    if (i_19_ != 2) {
		if (i_19_ != 3) {
		    if (i_19_ != 4) {
			if (i_19_ == 5 || i_19_ == 6) {
			    int i_20_ = var_es.readShort(13111);
			    ((ss) this).e = new il(dfa.a(i_20_, 128));
			    for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
				int i_22_ = var_es.readInt(68);
				Node class_d;
				if (i_19_ == 5)
				    class_d = new aa(var_es.readString((byte) 119));
				else
				    class_d = new GameInPacketHandler(var_es.readInt(57));
				((ss) this).e.a(class_d, (byte) -60,
						(long) i_22_);
			    }
			}
		    } else
			f = var_es.readInt(62);
		} else
		    l = var_es.readString((byte) 126);
	    } else
		((ss) this).b = eq.a((byte) 68, var_es.readByte(-20933));
	} else
	    ((ss) this).s = eq.a((byte) 61, var_es.readByte(-20933));
	if (i < 45)
	    l = null;
	q++;
    }
    
    private final void a(byte i) {
	r = new il(((ss) this).e.c((int) -1));
	g++;
	aa var_aa = (aa) ((ss) this).e.b((byte) 124);
	int i_23_ = -65 % ((-21 - i) / 53);
	for (/**/; var_aa != null; var_aa = (aa) ((ss) this).e.b(12561)) {
	    gca var_gca = new gca(((aa) var_aa).m, (int) ((Node) var_aa).nodeID);
	    r.a(var_gca, (byte) -60, ar.b((byte) -120, ((aa) var_aa).m));
	}
    }
    
    static final void a(int i, boolean bool, int i_24_, int i_25_, int i_26_,
			int i_27_, int i_28_) {
	p++;
	ua.a(bool, i_28_);
	int i_29_ = 0;
	int i_30_ = i_28_ - i;
	if (i_30_ < 0)
	    i_30_ = 0;
	int i_31_ = i_28_;
	int i_32_ = -i_28_;
	int i_33_ = i_30_;
	int i_34_ = -i_30_;
	int i_35_ = -1;
	int i_36_ = -1;
	int[] is = wh.O[i_26_];
	int i_37_ = i_24_ - i_30_;
	kg.a(i_24_ - i_28_, is, i_25_, i_37_, 77);
	int i_38_ = i_24_ + i_30_;
	kg.a(i_37_, is, i_27_, i_38_, 55);
	kg.a(i_38_, is, i_25_, i_24_ + i_28_, -115);
	while (i_29_ < i_31_) {
	    i_35_ += 2;
	    i_36_ += 2;
	    i_34_ += i_36_;
	    i_32_ += i_35_;
	    if (i_34_ >= 0 && i_33_ >= 1) {
		cc.i[i_33_] = i_29_;
		i_33_--;
		i_34_ -= i_33_ << 1;
	    }
	    i_29_++;
	    if (i_32_ >= 0) {
		i_31_--;
		if (i_30_ > i_31_) {
		    int[] is_39_ = wh.O[i_26_ + i_31_];
		    int[] is_40_ = wh.O[i_26_ - i_31_];
		    int i_41_ = cc.i[i_31_];
		    int i_42_ = i_29_ + i_24_;
		    int i_43_ = i_24_ - i_29_;
		    int i_44_ = i_24_ + i_41_;
		    int i_45_ = i_24_ - i_41_;
		    kg.a(i_43_, is_39_, i_25_, i_45_, 107);
		    kg.a(i_45_, is_39_, i_27_, i_44_, 11);
		    kg.a(i_44_, is_39_, i_25_, i_42_, 123);
		    kg.a(i_43_, is_40_, i_25_, i_45_, -121);
		    kg.a(i_45_, is_40_, i_27_, i_44_, -125);
		    kg.a(i_44_, is_40_, i_25_, i_42_, -113);
		} else {
		    int[] is_46_ = wh.O[i_26_ + i_31_];
		    int[] is_47_ = wh.O[i_26_ - i_31_];
		    int i_48_ = i_24_ + i_29_;
		    int i_49_ = i_24_ - i_29_;
		    kg.a(i_49_, is_46_, i_25_, i_48_, 20);
		    kg.a(i_49_, is_47_, i_25_, i_48_, -106);
		}
		i_32_ -= i_31_ << 1;
	    }
	    int[] is_50_ = wh.O[i_26_ + i_29_];
	    int[] is_51_ = wh.O[i_26_ - i_29_];
	    int i_52_ = i_24_ + i_31_;
	    int i_53_ = i_24_ - i_31_;
	    if (i_30_ <= i_29_) {
		kg.a(i_53_, is_50_, i_25_, i_52_, 52);
		kg.a(i_53_, is_51_, i_25_, i_52_, -106);
	    } else {
		int i_54_ = i_29_ > i_33_ ? cc.i[i_29_] : i_33_;
		int i_55_ = i_54_ + i_24_;
		int i_56_ = i_24_ - i_54_;
		kg.a(i_53_, is_50_, i_25_, i_56_, -125);
		kg.a(i_56_, is_50_, i_27_, i_55_, 116);
		kg.a(i_55_, is_50_, i_25_, i_52_, -106);
		kg.a(i_53_, is_51_, i_25_, i_56_, 38);
		kg.a(i_56_, is_51_, i_27_, i_55_, 58);
		kg.a(i_55_, is_51_, i_25_, i_52_, -119);
	    }
	}
    }
    
    static final da a(int i, int i_57_, Class_r class_r, int i_58_, int i_59_,
		      int i_60_, byte i_61_) {
	j++;
	long l = (long) i;
	da var_da = (da) kba.o.get(l, (byte) 100);
	if (i_61_ >= -122)
	    c = null;
	int i_62_ = 2055;
	if (var_da == null) {
	    eg var_eg = efa.a(i, av.l, 0, false);
	    if (var_eg == null)
		return null;
	    if (((eg) var_eg).bb < 13)
		var_eg.a((byte) -107, 2);
	    var_da = class_r.a(var_eg, i_62_, sq.c, 64, 768);
	    kba.o.put(l, var_da, 1);
	}
	var_da = var_da.a((byte) 2, i_62_, true);
	if (i_59_ != 0)
	    var_da.M(i_59_);
	if (i_57_ != 0)
	    var_da.MA(i_57_);
	if (i_58_ != 0)
	    var_da.W(i_58_);
	if (i_60_ != 0)
	    var_da.oa(0, i_60_, 0);
	return var_da;
    }
    
    final boolean b(int i, int i_63_) {
	h++;
	if (((ss) this).e == null)
	    return false;
	if (r == null)
	    a(-15321);
	GameInPacketHandler var_hda = (GameInPacketHandler) r.a(-32748, (long) i);
	if (i_63_ >= -93)
	    d(-4, 80);
	if (var_hda == null)
	    return false;
	return true;
    }
    
    static final void a(boolean bool) {
	k++;
	taa.a(false);
	GameText.vb = null;
	dr.e = null;
	lm.Kh = null;
	Class_qb.i = null;
	da.a = null;
	if (bool != true)
	    c = null;
    }
    
    private final void a(int i) {
	if (i != -15321)
	    ((ss) this).s = '\036';
	r = new il(((ss) this).e.c((int) -1));
	o++;
	for (GameInPacketHandler var_hda = (GameInPacketHandler) ((ss) this).e.b((byte) 124); var_hda != null;
	     var_hda = (GameInPacketHandler) ((ss) this).e.b(i + 27882)) {
	    GameInPacketHandler var_hda_64_ = new GameInPacketHandler((int) ((Node) var_hda).nodeID);
	    r.a(var_hda_64_, (byte) -76, (long) ((GameInPacketHandler) var_hda).k);
	}
    }
    
    final int c(int i, int i_65_) {
	v++;
	if (((ss) this).e == null)
	    return f;
	if (i_65_ != 438412161)
	    f = -56;
	GameInPacketHandler var_hda = (GameInPacketHandler) ((ss) this).e.a(i_65_ ^ ~0x1a21dc6a, (long) i);
	if (var_hda == null)
	    return f;
	return ((GameInPacketHandler) var_hda).k;
    }
    
    final void a(BytesParser var_es, byte i) {
	if (i != -67)
	    c(38, -56);
	for (;;) {
	    int i_66_ = var_es.readUnsignedByte(-9268);
	    if (i_66_ == 0)
		break;
	    a(65, var_es, i_66_);
	}
	ss.i++;
    }
    
    final String d(int i, int i_67_) {
	if (i != -24908)
	    ((ss) this).s = 'e';
	t++;
	if (((ss) this).e == null)
	    return l;
	aa var_aa = (aa) ((ss) this).e.a(-32748, (long) i_67_);
	if (var_aa == null)
	    return l;
	return ((aa) var_aa).m;
    }
    
    public ss() {
	/* empty */
    }
    
    public static void b(int i) {
	if (i == -1)
	    c = null;
    }
}
