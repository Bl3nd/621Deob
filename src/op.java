/* op - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class op extends mca
{
    private int H;
    static int y_;
    private int J = 0;
    private int K;
    static int L;
    private int M;
    static int N;
    private int P;
    static int Q;
    private int R = 0;
    static String username = "";
    private int T;
    static int U;
    private int V;
    static int W;
    static int[] X;
    static int Y;
    static int Z;
    private int ab;
    /*synthetic*/ static Class bb;
    /*synthetic*/ static Class cb;
    
    public op() {
	super(1, false);
	K = 0;
    }
    
    final int[][] a(int i, boolean bool) {
	if (bool != true)
	    a(-17, 60, -61, -65, -64, 66, -33, null, 58, 36, null, 104, 2);
	Q++;
	int[][] is = ((mca) this).B.a(i, -117);
	if (((td) ((mca) this).B).p) {
	    int[][] is_0_ = this.a(0, i, 0);
	    int[] is_1_ = is_0_[0];
	    int[] is_2_ = is_0_[1];
	    int[] is_3_ = is_0_[2];
	    int[] is_4_ = is[0];
	    int[] is_5_ = is[1];
	    int[] is_6_ = is[2];
	    for (int i_7_ = 0; fr.v > i_7_; i_7_++) {
		b(is_1_[i_7_], is_3_[i_7_], 31189, is_2_[i_7_]);
		T += J;
		V += K;
		ab += R;
		for (/**/; V < 0; V += 4096) {
		    /* empty */
		}
		if (T < 0)
		    T = 0;
		for (/**/; V > 4096; V -= 4096) {
		    /* empty */
		}
		if (T > 4096)
		    T = 4096;
		if (ab < 0)
		    ab = 0;
		if (ab > 4096)
		    ab = 4096;
		a(V, (byte) -124, T, ab);
		is_4_[i_7_] = M;
		is_5_[i_7_] = H;
		is_6_[i_7_] = P;
	    }
	}
	return is;
    }
    
    static final void a(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_, int i_13_, Class_r class_r, int i_14_,
			int i_15_, byte[][][] is, int i_16_, int i_17_) {
	U++;
	if (i_16_ != 0 && i_15_ != 0) {
	    if (i_16_ == 9) {
		i_10_ = 0x3 & i_10_ + 1;
		i_16_ = 1;
	    }
	    if (i_16_ == 10) {
		i_16_ = 1;
		i_10_ = i_10_ + 3 & 0x3;
	    }
	    if (i_16_ == 11) {
		i_10_ = i_10_ + 3 & 0x3;
		i_16_ = 8;
	    }
	    if (i_17_ > 31)
		class_r.IA(i, i_8_, i_13_, i_9_, i_14_, i_11_,
			   is[i_16_ - 1][i_10_], i_15_, i_12_);
	}
    }
    
    private final void b(int i, int i_18_, int i_19_, int i_20_) {
	N++;
	int i_21_ = i > i_20_ ? i : i_20_;
	int i_22_ = i >= i_20_ ? i_20_ : i;
	i_21_ = i_18_ <= i_21_ ? i_21_ : i_18_;
	i_22_ = i_18_ >= i_22_ ? i_22_ : i_18_;
	ab = (i_21_ + i_22_) / 2;
	int i_23_ = i_21_ - i_22_;
	if (i_19_ == 31189) {
	    if (i_23_ > 0) {
		int i_24_ = (i_21_ - i << 12) / i_23_;
		int i_25_ = (i_21_ - i_20_ << 12) / i_23_;
		int i_26_ = (i_21_ - i_18_ << 12) / i_23_;
		if (i != i_21_) {
		    if (i_21_ != i_20_)
			V = i != i_22_ ? 20480 - i_24_ : i_25_ + 12288;
		    else
			V = i_18_ != i_22_ ? -i_26_ + 12288 : i_24_ + 4096;
		} else
		    V = i_20_ == i_22_ ? i_26_ + 20480 : -i_25_ + 4096;
		V /= 6;
	    } else
		V = 0;
	    if (ab <= 0 || ab >= 4096)
		T = 0;
	    else
		T = (i_23_ << 12) / (ab <= 2048 ? ab * 2 : -(ab * 2) + 8192);
	}
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_28_ = j;
    while_117_:
	do {
	    do {
		if (i_28_ != 0) {
		    if (i_28_ != 1) {
			if (i_28_ == 2)
			    break;
			break while_117_;
		    }
		} else {
		    K = bytesParser.readShort2(108);
		    break while_117_;
		}
		J = (bytesParser.readByte(-20933) << 12) / 100;
		break while_117_;
	    } while (false);
	    R = (bytesParser.readByte(i - 20934) << 12) / 100;
	} while (false);
	Z++;
	if (i != 1)
	    y_ = -86;
    }
    
    static final void a(byte i, int i_29_, int i_30_, int i_31_, int i_32_,
			int i_33_, Class_r class_r, int i_34_, int i_35_) {
	W++;
	vda var_vda = (vda) Class_nb.a(i_29_, i_30_, i_33_);
	if (var_vda != null) {
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 126, var_vda.b((byte) 127));
	    int i_36_ = var_vda.c((byte) -103) & 0x3;
	    int i_37_ = var_vda.a((byte) 42);
	    if ((((ObjectDef) var_bda).u ^ 0xffffffff) == 0) {
		int i_38_ = i_34_;
		if (((ObjectDef) var_bda).jb > 0)
		    i_38_ = i_35_;
		if (i_37_ == 0 || i_37_ == 2) {
		    if (i_36_ == 0)
			class_r.a(i_31_, (byte) 4, i_38_, 4, i_32_);
		    else if (i_36_ != 1) {
			if (i_36_ == 2)
			    class_r.a(i_31_ + 3, (byte) 4, i_38_, 4, i_32_);
			else if (i_36_ == 3)
			    class_r.b(i_32_ + 3, (byte) 11, i_31_, 4, i_38_);
		    } else
			class_r.b(i_32_, (byte) 11, i_31_, 4, i_38_);
		}
		if (i_37_ == 3) {
		    if (i_36_ != 0) {
			if (i_36_ == 1)
			    class_r.f(i_38_, i_31_ + 3, i_32_, i ^ ~0x8, 1, 1);
			else if (i_36_ != 2) {
			    if (i_36_ == 3)
				class_r.f(i_38_, i_31_, i_32_ + 3, 1, 1, 1);
			} else
			    class_r.f(i_38_, i_31_ + 3, i_32_ + 3, 1, 1, 1);
		    } else
			class_r.f(i_38_, i_31_, i_32_, i ^ ~0x8, 1, 1);
		}
		if (i_37_ == 2) {
		    if (i_36_ != 0) {
			if (i_36_ != 1) {
			    if (i_36_ == 2)
				class_r.b(i_32_ + 3, (byte) 11, i_31_, 4,
					  i_38_);
			    else if (i_36_ == 3)
				class_r.a(i_31_, (byte) 4, i_38_, 4, i_32_);
			} else
			    class_r.a(i_31_ + 3, (byte) 4, i_38_, 4, i_32_);
		    } else
			class_r.b(i_32_, (byte) 11, i_31_, 4, i_38_);
		}
	    } else
		me.a(true, i_31_, i_32_, class_r, var_bda, i_36_);
	}
	var_vda = (vda) ik.a(i_29_, i_30_, i_33_,
			     bb != null ? bb : (bb = a("vda")));
	if (i != -10)
	    i(-11);
	if (var_vda != null) {
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 52, var_vda.b((byte) 127));
	    int i_39_ = 0x3 & var_vda.c((byte) -71);
	    int i_40_ = var_vda.a((byte) 42);
	    if (((ObjectDef) var_bda).u == -1) {
		if (i_40_ == 9) {
		    int i_41_ = -1118482;
		    if (((ObjectDef) var_bda).jb > 0)
			i_41_ = -1179648;
		    if (i_39_ == 0 || i_39_ == 2)
			class_r.e(1, i_32_ + 3, i_41_, i_32_, i_31_,
				  i_31_ + 3);
		    else
			class_r.e(1, i_32_, i_41_, i_32_ + 3, i_31_,
				  i_31_ + 3);
		}
	    } else
		me.a(true, i_31_, i_32_, class_r, var_bda, i_39_);
	}
	var_vda = (vda) lr.a(i_29_, i_30_, i_33_);
	if (var_vda != null) {
	    ObjectDef var_bda = ul.k.getObjectDef((byte) 65, var_vda.b((byte) 127));
	    int i_42_ = var_vda.c((byte) -37) & 0x3;
	    if ((((ObjectDef) var_bda).u ^ 0xffffffff) != 0)
		me.a(true, i_31_, i_32_, class_r, var_bda, i_42_);
	}
    }
    
    private final void a(int i, byte i_43_, int i_44_, int i_45_) {
	Y++;
	int i_46_ = (i_45_ > 2048 ? i_45_ + (i_44_ - (i_45_ * i_44_ >> 12))
		     : i_45_ * (i_44_ + 4096) >> 12);
    while_121_:
	do {
	    if (i_46_ > 0) {
		i *= 6;
		int i_47_ = i_45_ + (i_45_ - i_46_);
		int i_48_ = (i_46_ - i_47_ << 12) / i_46_;
		int i_49_ = i >> 12;
		int i_50_ = i - (i_49_ << 12);
		int i_51_ = i_46_;
		i_51_ = i_51_ * i_48_ >> 12;
		i_51_ = i_51_ * i_50_ >> 12;
		int i_52_ = i_51_ + i_47_;
		int i_53_ = i_46_ - i_51_;
		int i_54_ = i_49_;
	    while_120_:
		do {
		while_119_:
		    do {
		    while_118_:
			do {
			    do {
				if (i_54_ != 0) {
				    if (i_54_ != 1) {
					if (i_54_ != 2) {
					    if (i_54_ != 3) {
						if (i_54_ != 4) {
						    if (i_54_ != 5)
							break while_121_;
						} else
						    break while_119_;
						break while_120_;
					    }
					} else
					    break;
					break while_118_;
				    }
				} else {
				    M = i_46_;
				    P = i_47_;
				    H = i_52_;
				    break while_121_;
				}
				P = i_47_;
				M = i_53_;
				H = i_46_;
				break while_121_;
			    } while (false);
			    M = i_47_;
			    P = i_52_;
			    H = i_46_;
			    break while_121_;
			} while (false);
			M = i_47_;
			H = i_53_;
			P = i_46_;
			break while_121_;
		    } while (false);
		    H = i_47_;
		    P = i_46_;
		    M = i_52_;
		    break while_121_;
		} while (false);
		P = i_53_;
		H = i_47_;
		M = i_46_;
	    } else
		M = H = P = i_45_;
	} while (false);
	int i_55_ = 73 % ((-30 - i_43_) / 40);
    }
    
    public static void a(boolean bool) {
	username = null;
	X = null;
	if (bool != true)
	    i(96);
    }
    
    static final void i(int i) {
	L++;
	if (((Signlink) nda.signlink).e)
	    qm.heapSize = 96;
	else {
	    try {
		Method method
		    = (cb != null ? cb : (cb = a("java.lang.Runtime")))
			  .getMethod("maxMemory", new Class[0]);
		if (method != null) {
		    try {
			Runtime runtime = Runtime.getRuntime();
			Long var_long = (Long) method.invoke(runtime, null);
			qm.heapSize = (int) (var_long.longValue() / 1048576L) + 1;
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (i != -3)
	    a(34, -45, -10, -24, 57, -101, 86, null, 113, -4, null, 8, -34);
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
