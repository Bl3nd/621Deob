/* cp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cp
{
    private pl a;
    static int b;
    static int c = 0;
    int d;
    static dj e;
    static int f;
    private tb g = new tb(64);
    static int h;
    static int height;
    static int j;
    static int k;
    int l = 0;
    /*synthetic*/ static Class m;
    
    final void a(int i) {
	synchronized (g) {
	    g.a(18385);
	}
	if (i > -71)
	    b(114);
	k++;
    }
    
    static final boolean a(int i, int i_0_, Class_r class_r) {
	b++;
	int i_1_ = (Class_hc.e - 104) / 2;
	int i_2_ = (bw.v - 104) / 2;
	boolean bool = true;
	for (int i_3_ = i_1_; i_3_ < i_1_ + 104; i_3_++) {
	    for (int i_4_ = i_2_; i_4_ < i_2_ + 104; i_4_++) {
		for (int i_5_ = i; i_5_ <= 3; i_5_++) {
		    if (hk.a(i_5_, i, i_3_, (byte) 108, i_4_)) {
			int i_6_ = i_5_;
			if (ItemDef.b(i_4_, i_3_, 5706))
			    i_6_--;
			if (i_6_ >= 0)
			    bool &= rr.a(i_4_, i_0_ - 4, i_3_, i_6_);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	if (i_0_ != 104)
	    return true;
	int[] is = new int[262144];
	for (int i_7_ = 0; is.length > i_7_; i_7_++)
	    is[i_7_] = -16777216;
	tl.e = class_r.a(is, 0, 512, 512, 512);
	ja.c(i_0_ ^ ~0x87);
	int i_8_ = (~0xffffff
		    | (-10 + (int) (20.0 * Math.random())
		       - (-238 - ((228 + (int) (Math.random() * 20.0) << 8)
				  + ((int) (20.0 * Math.random()) - 10 + 238
				     << 16)))));
	int i_9_
	    = (0x1cffff00 | (int) (20.0 * Math.random()) + 238 - 10) << 16;
	int i_10_ = ((int) (8.0 * Math.random()) << 8
		     | (int) (8.0 * Math.random()) << 16
		     | (int) (8.0 * Math.random()));
	boolean[][] bools = new boolean[ak.r + 1][ak.r + 1];
	for (int i_11_ = i_1_; i_1_ + 104 > i_11_; i_11_ += ak.r) {
	    for (int i_12_ = i_2_; i_2_ + 104 > i_12_; i_12_ += ak.r) {
		int i_13_ = 0;
		int i_14_ = 0;
		int i_15_ = i_11_;
		if (i_15_ > 0) {
		    i_15_--;
		    i_13_ += 4;
		}
		int i_16_ = i_12_;
		if (i_16_ > 0)
		    i_16_--;
		int i_17_ = ak.r + i_11_;
		if (i_17_ < 104)
		    i_17_++;
		int i_18_ = i_12_ + ak.r;
		if (i_18_ < 104) {
		    i_14_ += 4;
		    i_18_++;
		}
		class_r.da(0, 0, 4 * ak.r + i_13_, ak.r * 4 + i_14_);
		class_r.ja(-16777216);
		for (int i_19_ = i; i_19_ <= 3; i_19_++) {
		    for (int i_20_ = 0; ak.r >= i_20_; i_20_++) {
			for (int i_21_ = 0; i_21_ <= ak.r; i_21_++)
			    bools[i_20_][i_21_]
				= hk.a(i_19_, i, i_15_ + i_20_, (byte) 108,
				       i_16_ + i_21_);
		    }
		    vr.b[i_19_].a(0, 0, 1024, i_15_, i_16_, i_17_, i_18_,
				  bools);
		    if (!Class_qb.k) {
			for (int i_22_ = -4; i_22_ < ak.r; i_22_++) {
			    for (int i_23_ = -4; i_23_ < ak.r; i_23_++) {
				int i_24_ = i_11_ + i_22_;
				int i_25_ = i_12_ + i_23_;
				if (i_24_ >= i_1_ && i_2_ <= i_25_
				    && hk.a(i_19_, i, i_24_, (byte) 108,
					    i_25_)) {
				    int i_26_ = i_19_;
				    if (ItemDef.b(i_25_, i_24_, i_0_ + 5602))
					i_26_--;
				    if (i_26_ >= 0)
					op.a((byte) -10, i_26_, i_24_,
					     i_22_ * 4 + i_13_,
					     i_14_ - 4 + 4 * (ak.r - i_23_),
					     i_25_, class_r, i_8_, i_9_);
				}
			    }
			}
		    }
		}
		if (Class_qb.k) {
		    wd var_wd = su.a[i];
		    for (int i_27_ = 0; ak.r > i_27_; i_27_++) {
			for (int i_28_ = 0; i_28_ < ak.r; i_28_++) {
			    int i_29_ = i_27_ + i_11_;
			    int i_30_ = i_12_ + i_28_;
			    int i_31_
				= (((wd) var_wd).e[i_29_ - ((wd) var_wd).w]
				   [i_30_ - ((wd) var_wd).o]);
			    if ((i_31_ & 0x40240000) != 0)
				class_r.f(-1713569622, 4 * i_27_ + i_13_,
					  4 * (ak.r - i_28_) + (i_14_ - 4), 1,
					  4, 4);
			    else if ((i_31_ & 0x800000) == 0) {
				if ((i_31_ & 0x2000000) != 0)
				    class_r.a(4 * i_27_ + 3 + i_13_, (byte) 4,
					      -1713569622, 4,
					      i_14_ + ((ak.r - i_28_) * 4
						       - 4));
				else if ((i_31_ & 0x8000000) == 0) {
				    if ((i_31_ & 0x20000000) != 0)
					class_r.a(i_27_ * 4 + i_13_, (byte) 4,
						  -1713569622, 4,
						  4 * (ak.r - i_28_) + (i_14_
									- 4));
				} else
				    class_r.b((ak.r - i_28_) * 4 - 1 + i_14_,
					      (byte) 11, i_27_ * 4 + i_13_, 4,
					      -1713569622);
			    } else
				class_r.b(i_14_ + ((ak.r - i_28_) * 4 - 4),
					  (byte) 11, i_13_ + 4 * i_27_, 4,
					  -1713569622);
			}
		    }
		}
		class_r.J(i_13_, i_14_, 4 * ak.r, ak.r * 4, i_10_, 2);
		tl.e.da(48 + 4 * (i_11_ - i_1_),
			464 - (i_12_ - i_2_) * 4 - 4 * ak.r, 4 * ak.r,
			ak.r * 4, i_13_, i_14_);
	    }
	}
	class_r.JA();
	class_r.ja(-16777215);
	fda.a(0);
	on.j = 0;
	ok.x.d(i_0_ - 102);
	if (!Class_qb.k) {
	    for (int i_32_ = i_1_; i_1_ + 104 > i_32_; i_32_++) {
		for (int i_33_ = i_2_; i_2_ + 104 > i_33_; i_33_++) {
		    for (int i_34_ = i; i + 1 >= i_34_ && i_34_ <= 3;
			 i_34_++) {
			if (hk.a(i_34_, i, i_32_, (byte) 108, i_33_)) {
			    vda var_vda = (vda) lr.a(i_34_, i_32_, i_33_);
			    if (var_vda == null)
				var_vda
				    = (vda) ik.a(i_34_, i_32_, i_33_,
						 m != null ? m : (m
								  = a("vda")));
			    if (var_vda == null)
				var_vda
				    = (vda) Class_nb.a(i_34_, i_32_, i_33_);
			    if (var_vda == null)
				var_vda = (vda) ej.a(i_34_, i_32_, i_33_);
			    if (var_vda != null) {
				ObjectDef var_bda
				    = ul.k.getObjectDef((byte) 77, var_vda.b((byte) 127));
				if (!((ObjectDef) var_bda).Db || rba.d) {
				    int i_35_ = ((ObjectDef) var_bda).R;
				    if (((ObjectDef) var_bda).xb != null) {
					for (int i_36_ = 0;
					     ((ObjectDef) var_bda).xb.length > i_36_;
					     i_36_++) {
					    if ((((ObjectDef) var_bda).xb[i_36_]
						 ^ 0xffffffff)
						!= 0) {
						ObjectDef var_bda_37_
						    = ul.k.getObjectDef((byte) 38,
							     (((ObjectDef) var_bda)
							      .xb[i_36_]));
						if (((ObjectDef) var_bda_37_).R >= 0)
						    i_35_
							= (((ObjectDef) var_bda_37_)
							   .R);
					    }
					}
				    }
				    if (i_35_ >= 0) {
					boolean bool_38_ = false;
					if (i_35_ >= 0) {
					    ww var_ww
						= hq.a.a(i_35_, (int) 16);
					    if (var_ww != null
						&& ((ww) var_ww).B)
						bool_38_ = true;
					}
					int i_39_ = i_32_;
					int i_40_ = i_33_;
					if (bool_38_) {
					    int[][] is_41_
						= ((wd) su.a[i_34_]).e;
					    int i_42_ = ((wd) su.a[i_34_]).w;
					    int i_43_ = ((wd) su.a[i_34_]).o;
					    for (int i_44_ = 0; i_44_ < 10;
						 i_44_++) {
						int i_45_
						    = (int) (4.0
							     * Math.random());
						if (i_45_ == 0 && i_39_ > i_1_
						    && i_32_ - 3 < i_39_
						    && ((is_41_
							 [i_39_ + (-1 - i_42_)]
							 [i_40_ - i_43_])
							& 0x2c0108) == 0)
						    i_39_--;
						if (i_45_ == 1
						    && i_39_ < i_1_ - 1 + 104
						    && i_39_ < i_32_ + 3
						    && ((0x2c0180
							 & (is_41_
							    [i_39_ + 1 - i_42_]
							    [i_40_ - i_43_]))
							== 0))
						    i_39_++;
						if (i_45_ == 2 && i_2_ < i_40_
						    && i_40_ > i_33_ - 3
						    && (0x2c0102
							& (is_41_
							   [i_39_ - i_42_]
							   [(-i_43_ - 1
							     + i_40_)])) == 0)
						    i_40_--;
						if (i_45_ == 3
						    && i_2_ + 104 - 1 > i_40_
						    && i_33_ + 3 > i_40_
						    && (0x2c0120
							& (is_41_
							   [i_39_ - i_42_]
							   [(i_40_ + 1
							     - i_43_)])) == 0)
						    i_40_++;
					    }
					}
					uh.d[on.j] = ((ObjectDef) var_bda).objectID;
					tm.x[on.j] = i_39_;
					vg.E[on.j] = i_40_;
					on.j++;
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (ofa.I != null) {
		((pl) fu.b).y = 1;
		hq.a.a(64, true, 1024);
		for (int i_46_ = 0; ((rn) ofa.I).a > i_46_; i_46_++) {
		    int i_47_ = ((rn) ofa.I).f[i_46_];
		    if (i_47_ >> 28 == ((Animable) up.thisPlayer).height) {
			int i_48_ = ((i_47_ & 0xfffcb23) >> 14) - bfa.thisPlayersRegionX;
			int i_49_ = (0x3fff & i_47_) - BytesParser.thisPlayersRegionY;
			if (i_48_ >= 0 && i_48_ < Class_hc.e && i_49_ >= 0
			    && bw.v > i_49_)
			    ok.x.b(new GameInPacketHandler(i_46_), (byte) 93);
			else {
			    ww var_ww
				= hq.a.a(((rn) ofa.I).b[i_46_], (int) 95);
			    if (((ww) var_ww).O != null
				&& i_48_ + ((ww) var_ww).x >= 0
				&& Class_hc.e > ((ww) var_ww).P + i_48_
				&& i_49_ + ((ww) var_ww).b >= 0
				&& i_49_ + ((ww) var_ww).c < bw.v)
				ok.x.b(new GameInPacketHandler(i_46_), (byte) 93);
			}
		    }
		}
		hq.a.a(64, true, 128);
		((pl) fu.b).y = 2;
		fu.b.b(-27756);
	    }
	}
	return true;
    }
    
    final void a(byte i) {
	synchronized (g) {
	    g.c((byte) 18);
	}
	if (i != 30)
	    a = null;
	h++;
    }
    
    final ng a(int i, byte i_50_) {
	f++;
	ng var_ng;
	synchronized (g) {
	    var_ng = (ng) g.get((long) i, (byte) 100);
	}
	if (var_ng != null)
	    return var_ng;
	byte[] is;
	synchronized (a) {
	    is = a.b(i, 19, 4);
	}
	var_ng = new ng();
	((ng) var_ng).l = i;
	((ng) var_ng).b = this;
	if (is != null)
	    var_ng.a(new BytesParser(is), -3990);
	var_ng.a(3);
	synchronized (g) {
	    if (i_50_ != 19)
		g = null;
	    g.put((long) i, var_ng, 1);
	}
	return var_ng;
    }
    
    final void a(int i, int i_51_) {
	synchronized (g) {
	    if (i != -4)
		a(-54, (int) -7);
	    g.a(true, i_51_);
	}
	j++;
    }
    
    public static void b(int i) {
	e = null;
	if (i != 486539008)
	    b(-120);
    }
    
    cp(Class_rf class_rf, int i, pl var_pl) {
	a = var_pl;
	((cp) this).d = a.a(4, true);
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
