/* Class_lc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class_lc extends mca
{
    private int H = 409;
    static ct I;
    private int J;
    static int K;
    static int L;
    static int M;
    private int N = 1024;
    static int P;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V = 819;
    static int W;
    static boolean[][] X = { { true, true, true, true, true, true, true, true,
			       true, true, true, true, true },
			     { true, true, true, false, false, false, true,
			       true, false, false, false, false, true },
			     { true, false, false, false, false, true, true,
			       true, false, false, false, false, false },
			     { false, false, true, true, true, true, false,
			       false, false, false, false, false, false },
			     { true, true, true, true, true, true, false,
			       false, false, false, false, false, false },
			     { true, true, true, false, false, true, true,
			       true, false, false, false, false, false },
			     { true, true, false, false, false, true, true,
			       true, false, false, false, false, true },
			     { true, true, false, false, false, false, false,
			       true, false, false, false, false, false },
			     { false, true, true, true, true, true, true, true,
			       false, false, false, false, false },
			     { true, false, false, false, true, true, true,
			       true, true, true, false, false, false },
			     { true, true, true, true, true, false, false,
			       false, true, true, false, false, false },
			     { true, true, true, false, false, false, false,
			       false, false, false, true, true, false },
			     new boolean[13],
			     { true, true, true, true, true, true, true, true,
			       true, true, true, true, true },
			     new boolean[13] };
    private int Y;
    static int Z;
    private int ab;
    static int bb;
    static int cb;
    static int db;
    static int[][] eb;
    
    static final void a(byte i, BytesParser var_es) {
	cb++;
	if (i != -126)
	    c((byte) -97);
	if (((BytesParser) var_es).bytes.length - ((BytesParser) var_es).pos >= 1) {
	    int i_0_ = var_es.readUnsignedByte(-9268);
	    if (i_0_ >= 0 && i_0_ <= 1
		&& ((BytesParser) var_es).bytes.length - ((BytesParser) var_es).pos >= 2) {
		int i_1_ = var_es.readShort(i ^ ~0x334a);
		if (((BytesParser) var_es).bytes.length - ((BytesParser) var_es).pos >= 6 * i_1_) {
		    for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			int i_3_ = var_es.readShort(13111);
			int i_4_ = var_es.readInt(i + 198);
			if (rr.h.length > i_3_ && jm.i[i_3_]
			    && (((iga) gh.R.a((byte) -127, i_3_)).e != '1'
				|| i_4_ >= -1 && i_4_ <= 1))
			    rr.h[i_3_] = i_4_;
		    }
		}
	    }
	}
    }
    
    static final boolean b(int i, int i_5_, int i_6_) {
	K++;
	if (i_5_ != 32)
	    eb = null;
	if ((0x20 & i) == 0)
	    return false;
	return true;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_8_ = j;
    while_82_:
	do {
	while_81_:
	    do {
	    while_80_:
		do {
		while_79_:
		    do {
		    while_78_:
			do {
			while_77_:
			    do {
			    while_76_:
				do {
				    do {
					if (i_8_ != 0) {
					    if (i_8_ != 1) {
						if (i_8_ != 2) {
						    if (i_8_ != 3) {
							if (i_8_ != 4) {
							    if (i_8_ != 5) {
								if (i_8_
								    != 6) {
								    if (i_8_
									!= 7) {
									if (i_8_
									    == 8)
									    break while_81_;
									break while_82_;
								    }
								} else
								    break while_79_;
								break while_80_;
							    }
							} else
							    break while_77_;
							break while_78_;
						    }
						} else
						    break;
						break while_76_;
					    }
					} else {
					    S = bytesParser.readUnsignedByte(-9268);
					    break while_82_;
					}
					T = bytesParser.readShort(i ^ 0x3336);
					break while_82_;
				    } while (false);
				    ab = bytesParser.readShort(13111);
				    break while_82_;
				} while (false);
				H = bytesParser.readShort(13111);
				break while_82_;
			    } while (false);
			    V = bytesParser.readShort(13111);
			    break while_82_;
			} while (false);
			N = bytesParser.readShort(i + 13110);
			break while_82_;
		    } while (false);
		    Y = bytesParser.readUnsignedByte(-9268);
		    break while_82_;
		} while (false);
		R = bytesParser.readShort(13111);
		break while_82_;
	    } while (false);
	    U = bytesParser.readShort(13111);
	} while (false);
	if (i != 1)
	    c(76, -23);
	M++;
    }
    
    public static void c(byte i) {
	I = null;
	X = null;
	eb = null;
	int i_9_ = 101 % ((-26 - i) / 33);
    }
    
    public Class_lc() {
	super(0, true);
	U = 1024;
	T = 1024;
	Y = 0;
	ab = 2048;
	R = 1024;
	S = 0;
    }
    
    static final int b(int i, int i_10_) {
	if (uo.c != null)
	    return uo.c[i][i_10_] & 0xffff;
	return 0;
    }
    
    static final void c(int i, int i_11_) {
	if (i_11_ == 1) {
	    sq.c = i;
	    W++;
	    kba.o.a(18385);
	}
    }
    
    static final void a(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			Class_r class_r) {
	class_r.da(i_12_, i_15_, i_14_ + i_12_, i_15_ + i_13_);
	db++;
	int i_16_ = -39 / ((i + 42) / 49);
	class_r.f(-16777216, i_12_, i_15_, 1, i_13_, i_14_);
	if (taa.b >= 100) {
	    float f = (float) kca.N / (float) kca.z;
	    int i_17_ = i_14_;
	    int i_18_ = i_13_;
	    if (!(f < 1.0F))
		i_17_ = (int) ((float) i_13_ / f);
	    else
		i_18_ = (int) (f * (float) i_14_);
	    i_15_ += (i_13_ - i_18_) / 2;
	    i_12_ += (i_14_ - i_17_) / 2;
	    if (Class_md.g == null || Class_md.g.E() != i_14_
		|| Class_md.g.u() != i_13_) {
		kca.a(kca.F, kca.N + kca.E, kca.z + kca.F, kca.E, i_12_, i_15_,
		      i_17_ + i_12_, i_15_ + i_18_);
		kca.a(class_r);
		Class_md.g = class_r.a(i_12_, i_15_, i_17_, i_18_, false);
	    }
	    Class_md.g.a(i_12_, i_15_);
	    int i_19_ = uda.b * i_17_ / kca.z;
	    int i_20_ = i_18_ * dea.h / kca.N;
	    int i_21_ = i_17_ * hga.c / kca.z + i_12_;
	    int i_22_ = i_18_ - dba.b * i_18_ / kca.N + i_15_ - i_20_;
	    int i_23_ = -1996554240;
	    if (me.q == Class_pf.O)
		i_23_ = -1996488705;
	    class_r.J(i_21_, i_22_, i_19_, i_20_, i_23_, 1);
	    class_r.c(i_21_, i_22_, i_19_, i_20_, i_23_, 0);
	    if (nda.g > 0) {
		int i_24_;
		if (sh.h <= 50)
		    i_24_ = sh.h * 5;
		else
		    i_24_ = 5 * (100 - sh.h);
		for (Class_vb class_vb = (Class_vb) kca.n.a((int) 98);
		     class_vb != null;
		     class_vb = (Class_vb) kca.n.b((byte) 109)) {
		    ww var_ww = kca.a.a(((Class_vb) class_vb).o, (int) 5);
		    if (vk.a(var_ww, (byte) -66)) {
			if (wq.o != ((Class_vb) class_vb).o) {
			    if (wh.J != -1 && wh.J == ((ww) var_ww).C) {
				int i_25_ = i_12_ + (((Class_vb) class_vb).m
						     * i_17_ / kca.z);
				int i_26_
				    = (i_15_
				       + ((kca.N - ((Class_vb) class_vb).n)
					  * i_18_ / kca.N));
				class_r.f(0xffff00 | i_24_ << 24, i_25_ - 2,
					  i_26_ - 2, 1, 4, 4);
			    }
			} else {
			    int i_27_
				= (i_17_ * ((Class_vb) class_vb).m / kca.z
				   + i_12_);
			    int i_28_
				= (i_15_
				   + (i_18_ * (kca.N - ((Class_vb) class_vb).n)
				      / kca.N));
			    class_r.f(i_24_ << 24 | 0xffff00, i_27_ - 2,
				      i_28_ - 2, 1, 4, 4);
			}
		    }
		}
	    }
	}
    }
    
    final void b(int i) {
	int i_29_ = -1 / ((i - 64) / 60);
	Z++;
    }
    
    private final void a(int i, int i_30_, int i_31_, int[][] is,
			 Random random, int i_32_, int i_33_) {
	P++;
	int i_34_ = U > 0 ? -it.a(random, U, 126) + 4096 : 4096;
	int i_35_ = J * R >> 12;
	int i_36_ = J - (i_33_ > (i_35_ ^ 0xffffffff)
			 ? it.a(random, i_35_, 123) : 0);
	if (i_30_ >= fr.v)
	    i_30_ -= fr.v;
	if (i_36_ > 0) {
	    if (i_32_ > 0 && i_31_ > 0) {
		int i_37_ = i_31_ / 2;
		int i_38_ = i_32_ / 2;
		int i_39_ = i_36_ > i_37_ ? i_37_ : i_36_;
		int i_40_ = i_38_ >= i_36_ ? i_36_ : i_38_;
		int i_41_ = i_30_ + i_39_;
		int i_42_ = i_31_ - 2 * i_39_;
		for (int i_43_ = 0; i_32_ > i_43_; i_43_++) {
		    int[] is_44_ = is[i_43_ + i];
		    if (i_40_ > i_43_) {
			int i_45_ = i_34_ * i_43_ / i_40_;
			if (Y != 0) {
			    for (int i_46_ = 0; i_46_ < i_39_; i_46_++) {
				int i_47_ = i_34_ * i_46_ / i_39_;
				is_44_[uca.a(i_30_ + i_46_, qf.g)]
				    = is_44_[uca.a(i_31_ + (i_30_ - i_46_ - 1),
						   qf.g)]
				    = i_45_ > i_47_ ? i_47_ : i_45_;
			    }
			} else {
			    for (int i_48_ = 0; i_39_ > i_48_; i_48_++) {
				int i_49_ = i_48_ * i_34_ / i_39_;
				is_44_[uca.a(qf.g, i_48_ + i_30_)]
				    = is_44_[uca.a(qf.g,
						   i_30_ - i_48_ + (i_31_
								    - 1))]
				    = i_49_ * i_45_ >> 12;
			    }
			}
			if (i_41_ + i_42_ > fr.v) {
			    int i_50_ = fr.v - i_41_;
			    co.a(is_44_, i_41_, i_50_, i_45_);
			    co.a(is_44_, 0, i_42_ - i_50_, i_45_);
			} else
			    co.a(is_44_, i_41_, i_42_, i_45_);
		    } else {
			int i_51_ = i_32_ - 1 - i_43_;
			if (i_51_ < i_40_) {
			    int i_52_ = i_34_ * i_51_ / i_40_;
			    if (Y != 0) {
				for (int i_53_ = 0; i_53_ < i_39_; i_53_++) {
				    int i_54_ = i_34_ * i_53_ / i_39_;
				    is_44_[uca.a(qf.g, i_53_ + i_30_)]
					= is_44_[uca.a((-i_53_ - 1 + i_30_
							+ i_31_),
						       qf.g)]
					= i_52_ <= i_54_ ? i_52_ : i_54_;
				}
			    } else {
				for (int i_55_ = 0; i_55_ < i_39_; i_55_++) {
				    int i_56_ = i_55_ * i_34_ / i_39_;
				    is_44_[uca.a(i_55_ + i_30_, qf.g)]
					= is_44_[uca.a(qf.g,
						       i_30_ - (i_55_ - i_31_
								+ 1))]
					= i_52_ * i_56_ >> 12;
				}
			    }
			    if (i_41_ + i_42_ <= fr.v)
				co.a(is_44_, i_41_, i_42_, i_52_);
			    else {
				int i_57_ = fr.v - i_41_;
				co.a(is_44_, i_41_, i_57_, i_52_);
				co.a(is_44_, 0, i_42_ - i_57_, i_52_);
			    }
			} else {
			    for (int i_58_ = 0; i_58_ < i_39_; i_58_++)
				is_44_[uca.a(qf.g, i_30_ + i_58_)]
				    = is_44_[uca.a(qf.g,
						   i_31_ + i_30_ - i_58_ - 1)]
				    = i_58_ * i_34_ / i_39_;
			    if (fr.v < i_42_ + i_41_) {
				int i_59_ = fr.v - i_41_;
				co.a(is_44_, i_41_, i_59_, i_34_);
				co.a(is_44_, 0, i_42_ - i_59_, i_34_);
			    } else
				co.a(is_44_, i_41_, i_42_, i_34_);
			}
		    }
		}
	    }
	} else if (fr.v < i_30_ + i_31_) {
	    int i_60_ = fr.v - i_30_;
	    for (int i_61_ = 0; i_32_ > i_61_; i_61_++) {
		int[] is_62_ = is[i + i_61_];
		co.a(is_62_, i_30_, i_60_, i_34_);
		co.a(is_62_, 0, i_31_ - i_60_, i_34_);
	    }
	} else {
	    for (int i_63_ = 0; i_32_ > i_63_; i_63_++)
		co.a(is[i_63_ + i], i_30_, i_31_, i_34_);
	}
    }
    
    final int[] a(int i, int j) {
	L++;
	int[] is = ((mca) this).s.a(j, true);
	int i_65_ = 63 % ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int[][] is_66_ = ((mca) this).s.a(false);
	    int i_67_ = 0;
	    int i_68_ = 0;
	    int i_69_ = 0;
	    int i_70_ = 0;
	    int i_71_ = 0;
	    boolean bool = true;
	    boolean bool_72_ = true;
	    int i_73_ = 0;
	    int i_74_ = 0;
	    int i_75_ = fr.v * T >> 12;
	    int i_76_ = ab * fr.v >> 12;
	    int i_77_ = H * od.pb >> 12;
	    int i_78_ = V * od.pb >> 12;
	    if (i_78_ <= 1)
		return is_66_[j];
	    J = fr.v / 8 * N >> 12;
	    int i_79_ = fr.v / i_75_ + 1;
	    int[][] is_80_ = new int[i_79_][3];
	    int[][] is_81_ = new int[i_79_][3];
	    Random random = new Random((long) S);
	    for (;;) {
		int i_82_ = it.a(random, i_76_ - i_75_, 123) + i_75_;
		int i_83_ = i_77_ + it.a(random, i_78_ - i_77_, 124);
		int i_84_ = i_70_ + i_82_;
		if (i_84_ > fr.v) {
		    i_84_ = fr.v;
		    i_82_ = fr.v - i_70_;
		}
		int i_85_;
		if (!bool_72_) {
		    int i_86_ = i_71_;
		    int[] is_87_ = is_81_[i_71_];
		    int i_88_ = 0;
		    int i_89_ = i_67_ + i_84_;
		    if (i_89_ < 0)
			i_89_ += fr.v;
		    if (fr.v < i_89_)
			i_89_ -= fr.v;
		    i_85_ = is_87_[2];
		    for (;;) {
			int[] is_90_ = is_81_[i_86_];
			if (is_90_[0] <= i_89_ && i_89_ <= is_90_[1])
			    break;
			if (++i_86_ >= i_73_)
			    i_86_ = 0;
			i_88_++;
		    }
		    if (i_71_ != i_86_) {
			int i_91_ = i_70_ + i_67_;
			if (i_91_ < 0)
			    i_91_ += fr.v;
			if (fr.v < i_91_)
			    i_91_ -= fr.v;
			for (int i_92_ = 1; i_88_ >= i_92_; i_92_++) {
			    int[] is_93_ = is_81_[(i_71_ + i_92_) % i_73_];
			    i_85_ = Math.max(i_85_, is_93_[2]);
			}
			for (int i_94_ = 0; i_88_ >= i_94_; i_94_++) {
			    int[] is_95_ = is_81_[(i_94_ + i_71_) % i_73_];
			    int i_96_ = is_95_[2];
			    if (i_85_ != i_96_) {
				int i_97_ = is_95_[0];
				int i_98_ = is_95_[1];
				int i_99_;
				int i_100_;
				if (i_89_ > i_91_) {
				    i_99_ = Math.max(i_91_, i_97_);
				    i_100_ = Math.min(i_89_, i_98_);
				} else if (i_97_ != 0) {
				    i_99_ = Math.max(i_91_, i_97_);
				    i_100_ = fr.v;
				} else {
				    i_100_ = Math.min(i_89_, i_98_);
				    i_99_ = 0;
				}
				a(i_96_, i_99_ + i_69_, i_100_ - i_99_, is_66_,
				  random, i_85_ - i_96_, -1);
			    }
			}
		    }
		    i_71_ = i_86_;
		} else
		    i_85_ = 0;
		if (od.pb >= i_85_ + i_83_)
		    bool = false;
		else
		    i_83_ = od.pb - i_85_;
		if (i_84_ != fr.v) {
		    int[] is_101_ = is_80_[i_74_++];
		    is_101_[2] = i_85_ + i_83_;
		    is_101_[0] = i_70_;
		    is_101_[1] = i_84_;
		    a(i_85_, i_68_ + i_70_, i_82_, is_66_, random, i_83_, -1);
		    i_70_ = i_84_;
		} else {
		    a(i_85_, i_68_ + i_70_, i_82_, is_66_, random, i_83_, -1);
		    if (bool)
			break;
		    bool = true;
		    int[] is_102_ = is_80_[i_74_++];
		    is_102_[1] = i_84_;
		    is_102_[2] = i_85_ + i_83_;
		    is_102_[0] = i_70_;
		    int[][] is_103_ = is_81_;
		    is_81_ = is_80_;
		    is_80_ = is_103_;
		    i_73_ = i_74_;
		    i_74_ = 0;
		    i_69_ = i_68_;
		    i_68_ = it.a(random, fr.v, 122);
		    i_67_ = i_68_ - i_69_;
		    i_70_ = 0;
		    int i_104_ = i_67_;
		    if (i_104_ < 0)
			i_104_ += fr.v;
		    i_71_ = 0;
		    if (fr.v < i_104_)
			i_104_ -= fr.v;
		    bool_72_ = false;
		    for (;;) {
			int[] is_105_ = is_81_[i_71_];
			if (i_104_ >= is_105_[0] && i_104_ <= is_105_[1])
			    break;
			if (i_73_ <= ++i_71_)
			    i_71_ = 0;
		    }
		}
	    }
	}
	return is;
    }
    
    static {
	I = new ct();
	eb = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 },
			   { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 },
			   { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 },
			   { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 },
			   { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
			   { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
    }
}
