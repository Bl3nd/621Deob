/* cg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cg
{
    int a;
    int b;
    static int c;
    static int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k = true;
    int l;
    int m = -1;
    int n;
    int o;
    int p;
    int[] q;
    int r;
    int[] s;
    int t;
    int u;
    int v = 0;
    static GameOutPacket w = new GameOutPacket(53, -1);
    static int x;
    int[][] y;
    int z;
    int A;
    int B;
    int C;
    int D;
    static int E;
    int[] F;
    int G;
    int H;
    int I;
    static int J;
    int K;
    static int L;
    int M;
    int N;
    int O;
    int P;
    int Q;
    int R;
    int S;
    int T;
    int U;
    private int V;
    int W;
    int X;
    
    static final da a(int i, int i_0_, da var_da, int i_1_, int i_2_, int i_3_,
		      int i_4_, Class_r class_r, int i_5_, int i_6_, int i_7_,
		      boolean bool, int i_8_, dr var_dr) {
	x++;
	if (var_da == null)
	    return null;
	int i_9_ = 2055;
	if (var_dr != null) {
	    i_9_ |= var_dr.a(1024, -1, false, i_8_);
	    i_9_ &= ~0x200;
	}
	long l = ((long) ((i << 24) + ((i_1_ << 16) + i_3_))
		  + (((long) i_5_ << 32) + ((long) i_2_ << 48)));
	da var_da_10_;
	synchronized (hv.p) {
	    var_da_10_ = (da) hv.p.get(l, (byte) 100);
	}
	if (var_da_10_ == null || class_r.b(var_da_10_.PA(), i_9_) != 0) {
	    if (var_da_10_ != null)
		i_9_ = class_r.a(i_9_, var_da_10_.PA());
	    int i_11_;
	    if (i_3_ != 1) {
		if (i_3_ != 2) {
		    if (i_3_ != 3) {
			if (i_3_ == 4)
			    i_11_ = 18;
			else
			    i_11_ = 21;
		    } else
			i_11_ = 15;
		} else
		    i_11_ = 12;
	    } else
		i_11_ = 9;
	    int i_12_ = 3;
	    int[] is = { 64, 96, 128 };
	    eg var_eg
		= new eg(i_12_ * i_11_ + 1, 2 * (i_12_ * i_11_) - i_11_, 0);
	    int i_13_ = var_eg.a(0, (int) 0, 0, -21519);
	    int[][] is_14_ = new int[i_12_][i_11_];
	    for (int i_15_ = 0; i_12_ > i_15_; i_15_++) {
		int i_16_ = is[i_15_];
		int i_17_ = is[i_15_];
		for (int i_18_ = 0; i_18_ < i_11_; i_18_++) {
		    int i_19_ = (i_18_ << 14) / i_11_;
		    int i_20_ = GameInPacket.h[i_19_] * i_16_ >> 14;
		    int i_21_ = GameInPacket.i[i_19_] * i_17_ >> 14;
		    is_14_[i_15_][i_18_] = var_eg.a(i_20_, i_21_, 0, -21519);
		}
	    }
	    for (int i_22_ = 0; i_22_ < i_12_; i_22_++) {
		int i_23_ = (256 * i_22_ + 128) / i_12_;
		int i_24_ = -i_23_ + 256;
		byte i_25_ = (byte) (i * i_23_ + i_24_ * i_1_ >> 8);
		short i_26_
		    = (short) ((((i_5_ & 0x7f) * i_24_ + (0x7f & i_2_) * i_23_
				 & 0x7f00)
				+ ((0x38000 & ((i_5_ & 0x380) * i_24_
					       + (i_2_ & 0x380) * i_23_))
				   + (0xfc0000 & (i_24_ * (0xfc00 & i_5_)
						  + (i_2_ & 0xfc00) * i_23_))))
			       >> 8);
		for (int i_27_ = 0; i_27_ < i_11_; i_27_++) {
		    if (i_22_ == 0)
			var_eg.a(is_14_[0][i_27_], i_26_, (byte) -1, i_25_,
				 is_14_[0][(i_27_ + 1) % i_11_], 0, (short) -1,
				 i_13_, (byte) 1);
		    else {
			var_eg.a(is_14_[i_22_][(i_27_ + 1) % i_11_], i_26_,
				 (byte) -1, i_25_,
				 is_14_[i_22_ - 1][(i_27_ + 1) % i_11_], 0,
				 (short) -1, is_14_[i_22_ - 1][i_27_],
				 (byte) 1);
			var_eg.a(is_14_[i_22_][i_27_], i_26_, (byte) -1, i_25_,
				 is_14_[i_22_][(i_27_ + 1) % i_11_], 0,
				 (short) -1, is_14_[i_22_ - 1][i_27_],
				 (byte) 1);
		    }
		}
	    }
	    var_da_10_ = class_r.a(var_eg, i_9_, ok.G, 64, 768);
	    synchronized (hv.p) {
		hv.p.put(l, var_da_10_, 1);
	    }
	}
	int i_28_ = var_da.KA();
	int i_29_ = var_da.l();
	int i_30_ = var_da.OA();
	int i_31_ = var_da.za();
	wa var_wa = null;
	if (var_dr != null) {
	    i_8_ = ((dr) var_dr).p[i_8_];
	    var_wa = Class_ef.J.b(i_8_ >> 16, -95);
	    i_8_ &= 0xffff;
	}
	if (var_wa != null) {
	    var_da_10_ = var_da_10_.a((byte) 3, i_9_, true);
	    var_da_10_.R(i_29_ - i_28_ >> 1, 128, i_31_ - i_30_ >> 1);
	    var_da_10_.oa(i_29_ + i_28_ >> 1, 0, i_31_ + i_30_ >> 1);
	    var_da_10_.a(var_wa, i_8_, 19093);
	} else {
	    var_da_10_ = var_da_10_.a((byte) 3, i_9_, true);
	    var_da_10_.R(i_29_ - i_28_ >> 1, 128, i_31_ - i_30_ >> 1);
	    var_da_10_.oa(i_28_ + i_29_ >> 1, 0, i_30_ + i_31_ >> 1);
	}
	if (i_6_ != 0)
	    var_da_10_.MA(i_6_);
	if (i_4_ != 0)
	    var_da_10_.W(i_4_);
	if (bool != false)
	    return null;
	if (i_7_ != 0)
	    var_da_10_.oa(0, i_7_, 0);
	return var_da_10_;
    }
    
    public static void a(int i) {
	w = null;
	if (i != -1388)
	    w = null;
    }
    
    final int b(int i) {
	c++;
	if (((cg) this).p != -1)
	    return ((cg) this).p;
	if (((cg) this).F != null) {
	    int i_32_ = (int) (Math.random() * (double) V);
	    int i_33_;
	    for (i_33_ = 0; ((cg) this).q[i_33_] <= i_32_; i_33_++)
		i_32_ -= ((cg) this).q[i_33_];
	    return ((cg) this).F[i_33_];
	}
	if (i != 1)
	    a(-56, null, null, 44, 114);
	return -1;
    }
    
    static final void a(int i, int[] is, Object[] objects, int i_34_,
			int i_35_) {
	if (i > i_35_) {
	    int i_36_ = (i + i_35_) / 2;
	    int i_37_ = i_35_;
	    int i_38_ = is[i_36_];
	    is[i_36_] = is[i];
	    is[i] = i_38_;
	    Object object = objects[i_36_];
	    objects[i_36_] = objects[i];
	    objects[i] = object;
	    int i_39_ = i_38_ == 2147483647 ? 0 : 1;
	    for (int i_40_ = i_35_; i_40_ < i; i_40_++) {
		if (is[i_40_] < i_38_ + (i_39_ & i_40_)) {
		    int i_41_ = is[i_40_];
		    is[i_40_] = is[i_37_];
		    is[i_37_] = i_41_;
		    Object object_42_ = objects[i_40_];
		    objects[i_40_] = objects[i_37_];
		    objects[i_37_++] = object_42_;
		}
	    }
	    is[i] = is[i_37_];
	    is[i_37_] = i_38_;
	    objects[i] = objects[i_37_];
	    objects[i_37_] = object;
	    a(i_37_ - 1, is, objects, 1, i_35_);
	    a(i, is, objects, i_34_, i_37_ + 1);
	}
	J++;
	if (i_34_ != 1)
	    a(54);
    }
    
    final void a(BytesParser var_es, int i) {
	L++;
	for (;;) {
	    int i_43_ = var_es.readUnsignedByte(-9268);
	    if (i_43_ == 0)
		break;
	    a(i_43_, (byte) 106, var_es);
	}
	if (i <= 109)
	    a((BytesParser) null, -7);
    }
    
    final boolean a(int i, int i_44_) {
	E++;
	if (i == -1)
	    return false;
	int i_45_ = -21 / ((i_44_ + 66) / 50);
	if (i == ((cg) this).p)
	    return true;
	if (((cg) this).F != null) {
	    for (int i_46_ = 0; ((cg) this).F.length > i_46_; i_46_++) {
		if (((cg) this).F[i_46_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    private final void a(int i, byte i_47_, BytesParser var_es) {
	if (i_47_ <= 83)
	    a(98, -99, null, 114, 98, 87, 60, null, 76, -17, -83, true, -5,
	      null);
	if (i == 1) {
	    ((cg) this).p = var_es.readShort(13111);
	    ((cg) this).A = var_es.readShort(13111);
	    if (((cg) this).A == 65535)
		((cg) this).A = -1;
	    if (((cg) this).p == 65535)
		((cg) this).p = -1;
	} else if (i != 2) {
	    if (i != 3) {
		if (i == 4)
		    ((cg) this).m = var_es.readShort(13111);
		else if (i == 5)
		    ((cg) this).u = var_es.readShort(13111);
		else if (i == 6)
		    ((cg) this).h = var_es.readShort(13111);
		else if (i == 7)
		    ((cg) this).g = var_es.readShort(13111);
		else if (i == 8)
		    ((cg) this).M = var_es.readShort(13111);
		else if (i != 9) {
		    if (i != 26) {
			if (i == 27) {
			    if (((cg) this).y == null)
				((cg) this).y = new int[12][];
			    int i_48_ = var_es.readUnsignedByte(-9268);
			    ((cg) this).y[i_48_] = new int[6];
			    for (int i_49_ = 0; i_49_ < 6; i_49_++)
				((cg) this).y[i_48_][i_49_] = var_es.readShort2(29);
			} else if (i == 28) {
			    ((cg) this).s = new int[12];
			    for (int i_50_ = 0; i_50_ < 12; i_50_++) {
				((cg) this).s[i_50_] = var_es.readUnsignedByte(-9268);
				if (((cg) this).s[i_50_] == 255)
				    ((cg) this).s[i_50_] = -1;
			    }
			} else if (i == 29)
			    ((cg) this).l = var_es.readUnsignedByte(-9268);
			else if (i != 30) {
			    if (i == 31)
				((cg) this).n = var_es.readUnsignedByte(-9268);
			    else if (i == 32)
				((cg) this).v = var_es.readShort(13111);
			    else if (i != 33) {
				if (i == 34)
				    ((cg) this).P = var_es.readUnsignedByte(-9268);
				else if (i != 35) {
				    if (i != 36) {
					if (i == 37)
					    ((cg) this).b = var_es.readUnsignedByte(-9268);
					else if (i == 38)
					    ((cg) this).S = var_es.readShort(13111);
					else if (i == 39)
					    ((cg) this).N = var_es.readShort(13111);
					else if (i == 40)
					    ((cg) this).I = var_es.readShort(13111);
					else if (i == 41)
					    ((cg) this).r = var_es.readShort(13111);
					else if (i == 42)
					    ((cg) this).o = var_es.readShort(13111);
					else if (i == 43)
					    ((cg) this).f = var_es.readShort(13111);
					else if (i == 44)
					    ((cg) this).Q = var_es.readShort(13111);
					else if (i != 45) {
					    if (i != 46) {
						if (i != 47) {
						    if (i != 48) {
							if (i == 49)
							    ((cg) this).T
								= (var_es.readShort
								   (13111));
							else if (i == 50)
							    ((cg) this).z
								= (var_es.readShort
								   (13111));
							else if (i == 51)
							    ((cg) this).R
								= (var_es.readShort
								   (13111));
							else if (i == 52) {
							    int i_51_
								= (var_es.readUnsignedByte
								   (-9268));
							    ((cg) this).F
								= (new int
								   [i_51_]);
							    ((cg) this).q
								= (new int
								   [i_51_]);
							    for (int i_52_ = 0;
								 i_52_ < i_51_;
								 i_52_++) {
								((cg) this)
								    .F[i_52_]
								    = (var_es.readShort
								       (13111));
								int i_53_
								    = (var_es.readUnsignedByte
								       (-9268));
								((cg) this)
								    .q[i_52_]
								    = i_53_;
								V += i_53_;
							    }
							} else if (i != 53) {
							    if (i == 54) {
								((cg) this).U
								    = ((var_es
									    .readUnsignedByte
									(-9268))
								       << 6);
								((cg) this).D
								    = ((var_es
									    .readUnsignedByte
									(-9268))
								       << 6);
							    }
							} else
							    ((cg) this).k
								= false;
						    } else
							((cg) this).H
							    = var_es.readShort(13111);
						} else
						    ((cg) this).G
							= var_es.readShort(13111);
					    } else
						((cg) this).B
						    = var_es.readShort(13111);
					} else
					    ((cg) this).a = var_es.readShort(13111);
				    } else
					((cg) this).C = var_es.readShort2(45);
				} else
				    ((cg) this).t = var_es.readShort(13111);
			    } else
				((cg) this).O = var_es.readShort2(57);
			} else
			    ((cg) this).K = var_es.readShort(13111);
		    } else {
			((cg) this).i = (short) (var_es.readUnsignedByte(-9268) * 4);
			((cg) this).W = (short) (4 * var_es.readUnsignedByte(-9268));
		    }
		} else
		    ((cg) this).X = var_es.readShort(13111);
	    } else
		((cg) this).e = var_es.readShort(13111);
	} else
	    ((cg) this).j = var_es.readShort(13111);
	d++;
    }
    
    public cg() {
	((cg) this).n = 0;
	((cg) this).e = -1;
	((cg) this).l = 0;
	((cg) this).f = -1;
	((cg) this).p = -1;
	((cg) this).h = -1;
	((cg) this).i = 0;
	((cg) this).B = -1;
	((cg) this).r = -1;
	((cg) this).z = -1;
	((cg) this).C = 0;
	((cg) this).q = null;
	((cg) this).I = -1;
	((cg) this).G = -1;
	((cg) this).F = null;
	((cg) this).M = -1;
	((cg) this).u = -1;
	((cg) this).o = -1;
	((cg) this).a = -1;
	((cg) this).K = 0;
	((cg) this).H = -1;
	((cg) this).g = -1;
	((cg) this).O = 0;
	((cg) this).A = -1;
	((cg) this).N = -1;
	((cg) this).D = 0;
	((cg) this).R = -1;
	((cg) this).P = 0;
	((cg) this).b = -1;
	((cg) this).Q = -1;
	((cg) this).t = 0;
	V = 0;
	((cg) this).U = 0;
	((cg) this).j = -1;
	((cg) this).T = -1;
	((cg) this).S = -1;
	((cg) this).W = 0;
	((cg) this).X = -1;
    }
}
