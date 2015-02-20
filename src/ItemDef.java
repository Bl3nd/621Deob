/* uv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Dimension;

final class ItemDef
{
    static int a;
    static int b;
    static int c;
    il d;
    private int e;
    static int f;
    static int g;
    private int h = -1;
    int i;
    boolean isMembersItem;
    String itemName;
    static int l;
    private int m;
    int n;
    int o = -1;
    String[] groundActions;
    private int q;
    private int r;
    static int s;
    static int t;
    private int u;
    static int v;
    static int w;
    private int x;
    private int y;
    int z;
    static int A;
    int B;
    private int C;
    String[] actions;
    private int E;
    static int F;
    int G;
    private int H;
    private int I;
    int J;
    int K;
    int L;
    static int M;
    private int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    int S;
    static int T;
    private int U;
    private int V;
    static int W;
    int[] X;
    boolean Y;
    int Z;
    static int ab;
    ItemDefLoader loader;
    private short[] cb;
    int db;
    int[] eb;
    int fb;
    private short[] gb;
    private int hb;
    private int ib;
    static int jb;
    int kb;
    private int lb;
    int stackable;
    int nb;
    private short[] ob;
    int pb;
    int qb;
    private int rb;
    static int sb;
    private short[] tb;
    int ub;
    int vb;
    int wb;
    int value;
    int certID;
    static int zb;
    int Ab;
    int Bb;
    private byte[] Cb;
    private int Db;
    int Eb;
    int[] Fb;
    static int Gb;
    
    private final void parseValue(BytesParser bytesParser, byte i, int i_0_) {
	if (i >= -101)
	    a((byte) 13, false);
	if (i_0_ != 1) {
	    if (i_0_ != 2) {
		if (i_0_ == 4)
		    ((ItemDef) this).pb = bytesParser.readShort(13111);
		else if (i_0_ == 5)
		    ((ItemDef) this).z = bytesParser.readShort(13111);
		else if (i_0_ == 6)
		    ((ItemDef) this).Bb = bytesParser.readShort(13111);
		else if (i_0_ != 7) {
		    if (i_0_ != 8) {
			if (i_0_ != 11) {
			    if (i_0_ == 12)
				((ItemDef) this).value = bytesParser.readInt(111);
			    else if (i_0_ != 16) {
				if (i_0_ != 18) {
				    if (i_0_ != 23) {
					if (i_0_ != 24) {
					    if (i_0_ == 25)
						((ItemDef) this).J
						    = bytesParser.readShort(13111);
					    else if (i_0_ != 26) {
						if (i_0_ >= 30 && i_0_ < 35)
						    ((ItemDef) this).groundActions[i_0_ - 30]
							= bytesParser.readString((byte) 119);
						else if (i_0_ >= 35
							 && i_0_ < 40)
						    ((ItemDef) this).actions[i_0_ - 35]
							= bytesParser.readString((byte) 118);
						else if (i_0_ == 40) {
						    int i_1_ = bytesParser.readUnsignedByte(-9268);
						    ob = new short[i_1_];
						    tb = new short[i_1_];
						    for (int i_2_ = 0;
							 i_2_ < i_1_; i_2_++) {
							tb[i_2_]
							    = (short) (bytesParser.readShort
								       (13111));
							ob[i_2_]
							    = (short) (bytesParser.readShort
								       (13111));
						    }
						} else if (i_0_ != 41) {
						    if (i_0_ == 42) {
							int i_3_
							    = bytesParser.readUnsignedByte(-9268);
							Cb = new byte[i_3_];
							for (int i_4_ = 0;
							     i_4_ < i_3_;
							     i_4_++)
							    Cb[i_4_]
								= (bytesParser.readByte
								   (-20933));
						    } else if (i_0_ != 65) {
							if (i_0_ != 78) {
							    if (i_0_ != 79) {
								if (i_0_
								    != 90) {
								    if (i_0_
									!= 91) {
									if (i_0_
									    == 92)
									    H = bytesParser.readShort(13111);
									else if (i_0_ == 93)
									    ib = bytesParser.readShort(13111);
									else if (i_0_ == 95)
									    ((ItemDef)
									     this).nb
										= bytesParser.readShort(13111);
									else if (i_0_ == 96)
									    ((ItemDef)
									     this).qb
										= bytesParser.readUnsignedByte(-9268);
									else if (i_0_ == 97)
									    ((ItemDef)
									     this).certID
										= bytesParser.readShort(13111);
									else if (i_0_ != 98) {
									    if (i_0_ < 100 || i_0_ >= 110) {
										if (i_0_ == 110)
										    u = bytesParser.readShort(13111);
										else if (i_0_ == 111)
										    lb = bytesParser.readShort(13111);
										else if (i_0_ != 112) {
										    if (i_0_ == 113)
											q = bytesParser.readByte(-20933);
										    else if (i_0_ != 114) {
											if (i_0_ != 115) {
											    if (i_0_ != 121) {
												if (i_0_ != 122) {
												    if (i_0_ != 125) {
													if (i_0_ == 126) {
													    y = bytesParser.readByte(-20933) << 2;
													    hb = bytesParser.readByte(-20933) << 2;
													    x = bytesParser.readByte(-20933) << 2;
													} else if (i_0_ == 127) {
													    ((ItemDef) this).Eb = bytesParser.readUnsignedByte(-9268);
													    ((ItemDef) this).i = bytesParser.readShort(13111);
													} else if (i_0_ == 128) {
													    ((ItemDef) this).kb = bytesParser.readUnsignedByte(-9268);
													    ((ItemDef) this).fb = bytesParser.readShort(13111);
													} else if (i_0_ == 129) {
													    ((ItemDef) this).L = bytesParser.readUnsignedByte(-9268);
													    ((ItemDef) this).vb = bytesParser.readShort(13111);
													} else if (i_0_ != 130) {
													    if (i_0_ != 132) {
														if (i_0_ == 249) {
														    int i_5_ = bytesParser.readUnsignedByte(-9268);
														    if (((ItemDef) this).d == null) {
															int i_6_ = dfa.a(i_5_, 128);
															((ItemDef) this).d = new il(i_6_);
														    }
														    for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
															boolean bool = bytesParser.readUnsignedByte(-9268) == 1;
															int i_8_ = bytesParser.readTribyte(-1);
															Node class_d;
															if (bool)
															    class_d = new aa(bytesParser.readString((byte) 125));
															else
															    class_d = new GameInPacketHandler(bytesParser.readInt(121));
															((ItemDef) this).d.a(class_d, (byte) -49, (long) i_8_);
														    }
														}
													    } else {
														int i_9_ = bytesParser.readUnsignedByte(-9268);
														((ItemDef) this).eb = new int[i_9_];
														for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
														    ((ItemDef) this).eb[i_10_] = bytesParser.readShort(13111);
													    }
													} else {
													    ((ItemDef) this).db = bytesParser.readUnsignedByte(-9268);
													    ((ItemDef) this).Z = bytesParser.readShort(13111);
													}
												    } else {
													N = bytesParser.readByte(-20933) << 2;
													E = bytesParser.readByte(-20933) << 2;
													e = bytesParser.readByte(-20933) << 2;
												    }
												} else
												    ((ItemDef) this).n = bytesParser.readShort(13111);
											    } else
												((ItemDef) this).K = bytesParser.readShort(13111);
											} else
											    ((ItemDef) this).wb = bytesParser.readUnsignedByte(-9268);
										    } else
											V = bytesParser.readByte(-20933) * 5;
										} else
										    r = bytesParser.readShort(13111);
									    } else {
										if (((ItemDef) this).Fb == null) {
										    ((ItemDef) this).X = new int[10];
										    ((ItemDef) this).Fb = new int[10];
										}
										((ItemDef) this).Fb[i_0_ - 100] = bytesParser.readShort(13111);
										((ItemDef) this).X[i_0_ - 100] = bytesParser.readShort(13111);
									    }
									} else
									    ((ItemDef)
									     this).o
										= bytesParser.readShort(13111);
								    } else
									I = bytesParser.readShort(13111);
								} else
								    m = (bytesParser
									     .readShort
									 (13111));
							    } else
								Db = (bytesParser.readShort
								      (13111));
							} else
							    rb = bytesParser
								     .readShort(13111);
						    } else
							((ItemDef) this).Y = true;
						} else {
						    int i_11_
							= bytesParser.readUnsignedByte(-9268);
						    cb = new short[i_11_];
						    gb = new short[i_11_];
						    for (int i_12_ = 0;
							 i_12_ < i_11_;
							 i_12_++) {
							gb[i_12_]
							    = (short) (bytesParser.readShort
								       (13111));
							cb[i_12_]
							    = (short) (bytesParser.readShort
								       (13111));
						    }
						}
					    } else
						h = bytesParser.readShort(13111);
					} else
					    U = bytesParser.readShort(13111);
				    } else
					((ItemDef) this).B = bytesParser.readShort(13111);
				} else
				    ((ItemDef) this).ub = bytesParser.readShort(13111);
			    } else
				((ItemDef) this).isMembersItem = true;
			} else
			    ((ItemDef) this).stackable = 1;
		    } else {
			((ItemDef) this).Ab = bytesParser.readShort(13111);
			if (((ItemDef) this).Ab > 32767)
			    ((ItemDef) this).Ab -= 65536;
		    }
		} else {
		    ((ItemDef) this).S = bytesParser.readShort(13111);
		    if (((ItemDef) this).S > 32767)
			((ItemDef) this).S -= 65536;
		}
	    } else
		((ItemDef) this).itemName = bytesParser.readString((byte) 119);
	} else
	    C = bytesParser.readShort(13111);
	W++;
    }
    
    static final ou a(Component component, int i) {
	if (i != 10)
	    return null;
	c++;
	return new jp(component);
    }
    
    final void a(int i, BytesParser var_es) {
	for (;;) {
	    int i_13_ = var_es.readUnsignedByte(-9268);
	    if (i_13_ == 0)
		break;
	    parseValue(var_es, (byte) -120, i_13_);
	}
	A++;
	if (i != 30035)
	    a(null, -11, false);
    }
    
    private final String getMoneyColorForAmount(byte b, int amount) {
	s++;
	if (amount < 100000)
	    return "<col=ffff00>" + amount + "</col>";
	if (b < 82)
	    ((ItemDef) this).eb = null;
	if (amount < 10000000)
	    return ("<col=ffffff>" + amount / 1000 + GameText.thousandMoneyLetter.getString((byte) 121, 
	    		((ItemDefLoader) ((ItemDef) this).loader).i) + "</col>");
	return ("<col=00ff80>" + amount / 1000000 + GameText.millionMoneyLetter.getString((byte) -50, 
			((ItemDefLoader) ((ItemDef) this).loader).i) + "</col>");
    }
    
    final eg a(boolean bool, int i) {
	T++;
	int i_15_ = ((ItemDef) this).B;
	if (i != -1)
	    return null;
	int i_16_ = U;
	int i_17_ = rb;
	if (bool) {
	    i_15_ = ((ItemDef) this).J;
	    i_16_ = h;
	    i_17_ = Db;
	}
	if ((i_15_ ^ 0xffffffff) == 0)
	    return null;
	eg var_eg = efa.a(i_15_, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
	if (((eg) var_eg).bb < 13)
	    var_eg.a((byte) -107, 2);
	if ((i_16_ ^ 0xffffffff) != 0) {
	    eg var_eg_18_ = efa.a(i_16_, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
	    if (((eg) var_eg_18_).bb < 13)
		var_eg_18_.a((byte) -107, 2);
	    if (i_17_ != -1) {
		eg var_eg_19_
		    = efa.a(i_17_, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
		if (((eg) var_eg_19_).bb < 13)
		    var_eg_19_.a((byte) -107, 2);
		eg[] var_egs = { var_eg, var_eg_18_, var_eg_19_ };
		var_eg = new eg(var_egs, 3);
	    } else {
		eg[] var_egs = { var_eg, var_eg_18_ };
		var_eg = new eg(var_egs, 2);
	    }
	}
	if (var_eg == null)
	    return null;
	if (!bool && (N != 0 || E != 0 || e != 0))
	    var_eg.a(e, (byte) 89, N, E);
	if (bool && (y != 0 || hb != 0 || x != 0))
	    var_eg.a(x, (byte) 112, y, hb);
	if (tb != null) {
	    for (int i_20_ = 0; i_20_ < tb.length; i_20_++)
		var_eg.a(tb[i_20_], (byte) -65, ob[i_20_]);
	}
	if (gb != null) {
	    for (int i_21_ = 0; i_21_ < gb.length; i_21_++)
		var_eg.a(gb[i_21_], (int) -82, cb[i_21_]);
	}
	return var_eg;
    }
    
    final String a(String string, int i, boolean bool) {
	if (bool != true)
	    a(20, (byte) -106, null);
	F++;
	if (((ItemDef) this).d == null)
	    return string;
	aa var_aa = (aa) ((ItemDef) this).d.a(-32748, (long) i);
	if (var_aa == null)
	    return string;
	return ((aa) var_aa).m;
    }
    
    final boolean a(boolean bool, byte i) {
	O++;
	if (i >= -17)
	    a(true, (byte) 21);
	int i_22_ = m;
	int i_23_ = H;
	if (bool) {
	    i_22_ = I;
	    i_23_ = ib;
	}
	if (i_22_ == -1)
	    return true;
	boolean bool_24_ = true;
	if (!((ItemDefLoader) ((ItemDef) this).loader).f.a(0, (byte) 116, i_22_))
	    bool_24_ = false;
	if ((i_23_ ^ 0xffffffff) != 0
	    && !((ItemDefLoader) ((ItemDef) this).loader).f.a(0, (byte) 64, i_23_))
	    bool_24_ = false;
	return bool_24_;
    }
    
    final int a(int i, int i_25_, int i_26_) {
	t++;
	if (((ItemDef) this).d == null)
	    return i_25_;
	int i_27_ = 24 / ((i_26_ + 22) / 32);
	GameInPacketHandler var_hda = (GameInPacketHandler) ((ItemDef) this).d.a(-32748, (long) i);
	if (var_hda == null)
	    return i_25_;
	return ((GameInPacketHandler) var_hda).k;
    }
    
    static final void a(int i, int i_28_, int i_29_, Class var_class) {
	vf var_vf = ol.p[i][i_28_][i_29_];
	if (var_vf != null) {
	    for (ida var_ida = ((vf) var_vf).f; var_ida != null;
		 var_ida = ((ida) var_ida).d) {
		qda var_qda = ((ida) var_ida).a;
		if (var_class.isAssignableFrom(var_qda.getClass())
		    && ((qda) var_qda).B == i_28_
		    && ((qda) var_qda).x == i_29_) {
		    mn.a(var_qda, false);
		    break;
		}
	    }
	}
    }
    
    private final int[] a(int i, int[] is, byte i_30_) {
	M++;
	if (i_30_ > -12)
	    return null;
	int[] is_31_ = new int[1152];
	int i_32_ = 0;
	for (int i_33_ = 0; i_33_ < 32; i_33_++) {
	    for (int i_34_ = 0; i_34_ < 36; i_34_++) {
		int i_35_ = is[i_32_];
		if (i_35_ == 0) {
		    if (i_34_ > 0 && is[i_32_ - 1] != 0)
			i_35_ = i;
		    else if (i_33_ <= 0 || is[i_32_ - 36] == 0) {
			if (i_34_ < 35 && is[i_32_ + 1] != 0)
			    i_35_ = i;
			else if (i_33_ < 31 && is[i_32_ + 36] != 0)
			    i_35_ = i;
		    } else
			i_35_ = i;
		}
		is_31_[i_32_++] = i_35_;
	    }
	}
	return is_31_;
    }
    
    private final void a(int i, byte i_36_, int[] is) {
	if (i_36_ <= 45)
	    Cb = null;
	zb++;
	for (int i_37_ = 31; i_37_ > 0; i_37_--) {
	    int i_38_ = 36 * i_37_;
	    for (int i_39_ = 35; i_39_ > 0; i_39_--) {
		if (is[i_39_ + i_38_] == 0 && is[i_39_ - 37 + i_38_] != 0)
		    is[i_38_ + i_39_] = i;
	    }
	}
    }
    
    static final boolean b(int i, int i_40_, int i_41_) {
	if (i_41_ != 5706)
	    a((Component) null, -6);
	Q++;
	if (i_40_ < 0 || i < 0 || tu.b[1].length <= i_40_
	    || tu.b[1][i_40_].length <= i)
	    return false;
	if ((tu.b[1][i_40_][i] & 0x2) != 0)
	    return true;
	return false;
    }
    
    final void a(int i, ItemDef var_uv_42_, ItemDef var_uv_43_) {
	ob = var_uv_42_.ob;
	((ItemDef) this).Ab = ((ItemDef) var_uv_43_).Ab;
	N = var_uv_42_.N;
	rb = var_uv_42_.rb;
	Db = var_uv_42_.Db;
	I = var_uv_42_.I;
	((ItemDef) this).actions = new String[5];
	gb = var_uv_42_.gb;
	((ItemDef) this).wb = ((ItemDef) var_uv_42_).wb;
	((ItemDef) this).J = ((ItemDef) var_uv_42_).J;
	x = var_uv_42_.x;
	E = var_uv_42_.E;
	((ItemDef) this).groundActions = ((ItemDef) var_uv_42_).groundActions;
	U = var_uv_42_.U;
	y = var_uv_42_.y;
	e = var_uv_42_.e;
	((ItemDef) this).S = ((ItemDef) var_uv_43_).S;
	cb = var_uv_42_.cb;
	tb = var_uv_42_.tb;
	((ItemDef) this).z = ((ItemDef) var_uv_43_).z;
	((ItemDef) this).nb = ((ItemDef) var_uv_43_).nb;
	((ItemDef) this).itemName = ((ItemDef) var_uv_42_).itemName;
	((ItemDef) this).pb = ((ItemDef) var_uv_43_).pb;
	ib = var_uv_42_.ib;
	C = var_uv_43_.C;
	Cb = var_uv_42_.Cb;
	((ItemDef) this).Bb = ((ItemDef) var_uv_43_).Bb;
	((ItemDef) this).value = 0;
	((ItemDef) this).isMembersItem = ((ItemDef) var_uv_42_).isMembersItem;
	m = var_uv_42_.m;
	hb = var_uv_42_.hb;
	if (i != -22824)
	    cb = null;
	H = var_uv_42_.H;
	((ItemDef) this).d = ((ItemDef) var_uv_42_).d;
	((ItemDef) this).B = ((ItemDef) var_uv_42_).B;
	h = var_uv_42_.h;
	l++;
	if (((ItemDef) var_uv_42_).actions != null) {
	    for (int i_44_ = 0; i_44_ < 4; i_44_++)
		((ItemDef) this).actions[i_44_] = ((ItemDef) var_uv_42_).actions[i_44_];
	}
	((ItemDef) this).actions[4] = GameText.o.getString((byte) -127, ((ItemDefLoader) ((ItemDef) this).loader).i);
    }
    
    final ItemDef a(int i, int i_45_) {
	Gb++;
	if (i_45_ != -2)
	    return null;
	if (((ItemDef) this).Fb != null && i > 1) {
	    int i_46_ = -1;
	    for (int i_47_ = 0; i_47_ < 10; i_47_++) {
		if (((ItemDef) this).X[i_47_] <= i && ((ItemDef) this).X[i_47_] != 0)
		    i_46_ = ((ItemDef) this).Fb[i_47_];
	    }
	    if ((i_46_ ^ 0xffffffff) != 0)
		return ((ItemDef) this).loader.d(12388, i_46_);
	}
	return this;
    }
    
    static final void a(byte i) {
	jb++;
	up.B++;
	tba var_tba = jga.sendGameOutPacket(qga.a, pca.isaac, (byte) 95);
	((tba) var_tba).loginStream.writeByte((int) 0, (byte) -124);
	ud.a(var_tba, (byte) -36);
	if (i <= 18)
	    g = -106;
    }
    
    final int[] a(la var_la, int i, boolean bool, PlayerDef var_kn, Class_r class_r,
		  int i_48_, int i_49_, Class_r class_r_50_, int i_51_,
		  int i_52_) {
	sb++;
	eg var_eg = efa.a(C, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
	if (var_eg == null)
	    return null;
	if (((eg) var_eg).bb < 13)
	    var_eg.a((byte) -107, 2);
	if (tb != null) {
	    for (int i_53_ = 0; tb.length > i_53_; i_53_++) {
		if (Cb != null && i_53_ < Cb.length)
		    var_eg.a(tb[i_53_], (byte) 37, ua.d[0xff & Cb[i_53_]]);
		else
		    var_eg.a(tb[i_53_], (byte) -69, ob[i_53_]);
	    }
	}
	if (gb != null) {
	    for (int i_54_ = 0; i_54_ < gb.length; i_54_++)
		var_eg.a(gb[i_54_], (int) -75, cb[i_54_]);
	}
	if (i_49_ < 74)
	    return null;
	if (var_kn != null) {
	    for (int i_55_ = 0; i_55_ < 5; i_55_++) {
		for (int i_56_ = 0; ck.K.length > i_56_; i_56_++) {
		    if (ck.K[i_56_][i_55_].length > ((PlayerDef) var_kn).k[i_55_])
			var_eg.a(lp.p[i_56_][i_55_], (byte) -51,
				 ck.K[i_56_][i_55_][((PlayerDef) var_kn).k[i_55_]]);
		}
	    }
	}
	int i_57_ = 2048;
	boolean bool_58_ = false;
	if (u != 128 || lb != 128 || r != 128) {
	    bool_58_ = true;
	    i_57_ |= 0x7;
	}
	da var_da = class_r.a(var_eg, i_57_, 0, q + 64, V + 768);
	if (!var_da.b())
	    return null;
	if (bool_58_)
	    var_da.R(u, lb, r);
	f var_f = null;
	if (((ItemDef) this).o == -1) {
	    if ((((ItemDef) this).n ^ 0xffffffff) != 0) {
		var_f = ((ItemDef) this).loader.a(0, false, class_r, i_52_, var_kn,
					 true, ((ItemDef) this).K, class_r_50_,
					 i_48_, var_la, i, 110);
		if (var_f == null)
		    return null;
	    }
	} else {
	    var_f = ((ItemDef) this).loader.a(0, true, class_r, 1, var_kn, true,
				     ((ItemDef) this).certID, class_r_50_, 0, var_la,
				     10, 126);
	    if (var_f == null)
		return null;
	}
	int i_59_;
	if (!bool) {
	    if (i_52_ != 2)
		i_59_ = ((ItemDef) this).pb << 2;
	    else
		i_59_ = (int) (1.04 * (double) ((ItemDef) this).pb) << 2;
	} else
	    i_59_ = (int) ((double) ((ItemDef) this).pb * 1.5) << 2;
	class_r.la(16, 16, 512, 512);
	Class_q class_q = class_r.C();
	class_q.Y();
	class_r.a(class_q);
	class_r.ra(1.0F);
	class_r.VA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
	Class_q class_q_60_ = class_r.p();
	class_q_60_.J(-((ItemDef) this).nb << 3);
	class_q_60_.ZA(((ItemDef) this).Bb << 3);
	class_q_60_.U(((ItemDef) this).S << 2,
		      ((GameInPacket.h[((ItemDef) this).z << 3] * i_59_ >> 14)
		       + ((((ItemDef) this).Ab << 2) - var_da.J() / 2)),
		      (((ItemDef) this).Ab << 2) + (GameInPacket.i[((ItemDef) this).z << 3] * i_59_
					       >> 14));
	class_q_60_.w(((ItemDef) this).z << 3);
	int i_61_ = class_r.BA();
	int i_62_ = class_r.U();
	class_r.GA(50, 2147483647);
	class_r.ya();
	class_r.JA();
	class_r.J(0, 0, 36, 32, 0, 0);
	var_da.a(class_q_60_, null, 1);
	class_r.GA(i_61_, i_62_);
	int[] is = class_r.h(0, 0, 36, 32);
	if (i_52_ >= 1) {
	    is = a(-16777214, is, (byte) -81);
	    if (i_52_ >= 2)
		is = a(-1, is, (byte) -104);
	}
	if (i_48_ != 0)
	    a(i_48_, (byte) 116, is);
	class_r.a(is, 0, 36, 36, 32).a(0, 0);
	if (((ItemDef) this).o != -1)
	    var_f.a(0, 0);
	else if (((ItemDef) this).n != -1)
	    var_f.a(0, 0);
	if (i_51_ == 1 || (i_51_ == 2 && (((ItemDef) this).stackable == 1 || i != 1)
			   && (i ^ 0xffffffff) != 0))
	    var_la.a(-256, true, 0, getMoneyColorForAmount((byte) 109, i), -16777215, 9);
	is = class_r.h(0, 0, 36, 32);
	for (int i_63_ = 0; is.length > i_63_; i_63_++) {
	    if ((is[i_63_] & 0xffffff) == 0)
		is[i_63_] = 0;
	    else
		is[i_63_] = hba.bitwiseArg1ORArg2(is[i_63_], -16777216);
	}
	return is;
    }
    
    final eg a(byte i, boolean bool) {
	f++;
	int i_64_ = m;
	int i_65_ = H;
	if (bool) {
	    i_65_ = ib;
	    i_64_ = I;
	}
	if (i_64_ == -1)
	    return null;
	eg var_eg = efa.a(i_64_, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
	if (((eg) var_eg).bb < 13)
	    var_eg.a((byte) -107, 2);
	if (i_65_ != -1) {
	    eg var_eg_66_ = efa.a(i_65_, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
	    if (((eg) var_eg_66_).bb < 13)
		var_eg_66_.a((byte) -107, 2);
	    eg[] var_egs = { var_eg, var_eg_66_ };
	    var_eg = new eg(var_egs, 2);
	}
	if (tb != null) {
	    for (int i_67_ = 0; i_67_ < tb.length; i_67_++)
		var_eg.a(tb[i_67_], (byte) 70, ob[i_67_]);
	}
	if (i != -84)
	    ((ItemDef) this).n = 21;
	if (gb != null) {
	    for (int i_68_ = 0; i_68_ < gb.length; i_68_++)
		var_eg.a(gb[i_68_], (int) -84, cb[i_68_]);
	}
	return var_eg;
    }
    
    static final void b(int i, int i_69_) {
	ab++;
	qba var_qba = ofa.a(12, i, (byte) -93);
	if (i_69_ == -10095)
	    var_qba.i(0);
    }
    
    final void a(int i) {
	P++;
	int i_70_ = 78 / ((40 - i) / 45);
    }
    
    final boolean b(byte i, boolean bool) {
	R++;
	int i_71_ = ((ItemDef) this).B;
	if (i <= 83)
	    return true;
	int i_72_ = U;
	int i_73_ = rb;
	if (bool) {
	    i_72_ = h;
	    i_71_ = ((ItemDef) this).J;
	    i_73_ = Db;
	}
	if (i_71_ == -1)
	    return true;
	boolean bool_74_ = true;
	if (!((ItemDefLoader) ((ItemDef) this).loader).f.a(0, (byte) 96, i_71_))
	    bool_74_ = false;
	if (i_72_ != -1 && !((ItemDefLoader) ((ItemDef) this).loader).f.a(0, (byte) 119, i_72_))
	    bool_74_ = false;
	if (i_73_ != -1 && !((ItemDefLoader) ((ItemDef) this).loader).f.a(0, (byte) 125, i_73_))
	    bool_74_ = false;
	return bool_74_;
    }
    
    final da a(int i, Class_r class_r, int i_75_, dr var_dr, int i_76_,
	       PlayerDef var_kn, int i_77_, int i_78_, int i_79_) {
	w++;
	if (((ItemDef) this).Fb != null && i_77_ > 1) {
	    int i_80_ = -1;
	    for (int i_81_ = 0; i_81_ < 10; i_81_++) {
		if (i_77_ >= ((ItemDef) this).X[i_81_] && ((ItemDef) this).X[i_81_] != 0)
		    i_80_ = ((ItemDef) this).Fb[i_81_];
	    }
	    if ((i_80_ ^ 0xffffffff) != 0)
		return ((ItemDef) this).loader.d(12388, i_80_).a(i, class_r, i_75_,
							var_dr, i_76_, var_kn,
							1, i_78_, 16777215);
	}
	int i_82_ = i_75_;
	if (var_dr != null)
	    i_82_ |= var_dr.a(1024, i_78_, true, i_76_);
	da var_da;
	synchronized (((ItemDefLoader) ((ItemDef) this).loader).t) {
	    var_da
		= (da) ((ItemDefLoader) ((ItemDef) this).loader).t.get((long) ((((Class_r) class_r).b
							  << 29)
							 | ((ItemDef) this).G),
						 (byte) 100);
	}
	if (var_da == null || class_r.b(var_da.PA(), i_82_) != 0) {
	    if (var_da != null)
		i_82_ = class_r.a(i_82_, var_da.PA());
	    int i_83_ = i_82_;
	    if (gb != null)
		i_83_ |= 0x8000;
	    if (tb != null || var_kn != null)
		i_83_ |= 0x4000;
	    if (u != 128)
		i_83_ |= 0x1;
	    if (u != 128)
		i_83_ |= 0x2;
	    if (u != 128)
		i_83_ |= 0x4;
	    eg var_eg = efa.a(C, ((ItemDefLoader) ((ItemDef) this).loader).f, 0, false);
	    if (var_eg == null)
		return null;
	    if (((eg) var_eg).bb < 13)
		var_eg.a((byte) -107, 2);
	    var_da = class_r.a(var_eg, i_83_, ((ItemDefLoader) ((ItemDef) this).loader).z, q + 64,
			       850 + V);
	    if (u != 128 || lb != 128 || r != 128)
		var_da.R(u, lb, r);
	    if (tb != null) {
		for (int i_84_ = 0; tb.length > i_84_; i_84_++) {
		    if (Cb != null && i_84_ < Cb.length)
			var_da.d(tb[i_84_], ua.d[Cb[i_84_] & 0xff]);
		    else
			var_da.d(tb[i_84_], ob[i_84_]);
		}
	    }
	    if (gb != null) {
		for (int i_85_ = 0; gb.length > i_85_; i_85_++)
		    var_da.DA(gb[i_85_], cb[i_85_]);
	    }
	    if (var_kn != null) {
		for (int i_86_ = 0; i_86_ < 5; i_86_++) {
		    for (int i_87_ = 0; i_87_ < ck.K.length; i_87_++) {
			if (((PlayerDef) var_kn).k[i_86_] < ck.K[i_87_][i_86_].length)
			    var_da.d(lp.p[i_87_][i_86_],
				     (ck.K[i_87_][i_86_]
				      [((PlayerDef) var_kn).k[i_86_]]));
		    }
		}
	    }
	    var_da.SA(i_82_);
	    synchronized (((ItemDefLoader) ((ItemDef) this).loader).t) {
		((ItemDefLoader) ((ItemDef) this).loader).t.put((long) (((Class_r) class_r).b << 29
						  | ((ItemDef) this).G),
					  var_da, i_79_ ^ 0xfffffe);
	    }
	}
	if (var_dr != null)
	    var_da = var_dr.a(i_76_, i_82_, (byte) 122, i, i_78_, var_da);
	var_da.SA(i_75_);
	if (i_79_ != 16777215)
	    q = -76;
	return var_da;
    }
    
    final void a(ItemDef var_uv_88_, ItemDef var_uv_89_, int i) {
	C = var_uv_88_.C;
	cb = var_uv_88_.cb;
	((ItemDef) this).isMembersItem = ((ItemDef) var_uv_89_).isMembersItem;
	((ItemDef) this).S = ((ItemDef) var_uv_88_).S;
	int i_90_ = 5 % ((i - 10) / 55);
	((ItemDef) this).Bb = ((ItemDef) var_uv_88_).Bb;
	((ItemDef) this).z = ((ItemDef) var_uv_88_).z;
	((ItemDef) this).nb = ((ItemDef) var_uv_88_).nb;
	((ItemDef) this).stackable = 1;
	b++;
	gb = var_uv_88_.gb;
	((ItemDef) this).itemName = ((ItemDef) var_uv_89_).itemName;
	tb = var_uv_88_.tb;
	((ItemDef) this).value = ((ItemDef) var_uv_89_).value;
	((ItemDef) this).Ab = ((ItemDef) var_uv_88_).Ab;
	Cb = var_uv_88_.Cb;
	((ItemDef) this).pb = ((ItemDef) var_uv_88_).pb;
	ob = var_uv_88_.ob;
    }
    
    static final int a(int i, byte i_91_, int i_92_) {
	v++;
	if ((ao.h ^ 0xffffffff) == 0)
	    return 1;
	if (on.performance != i) {
	    Class_pf.a(i, (byte) -126, GameText.v.getString((byte) -78, cba.languageID));
	    if (on.performance != i)
		return -1;
	}
	try {
	    Dimension dimension = ru.canvas.getSize();
	    Class_rf.a(true, lg.r, true, Class_nd.o, pm.v,
		       GameText.v.getString((byte) -37, cba.languageID));
	    eg var_eg = efa.a(ao.h, av.l, 0, false);
	    long l = us.a(125);
	    if (i_91_ > -97)
		g = 106;
	    lg.r.JA();
	    tg.G.NA(0, dba.k, 0);
	    lg.r.a(tg.G);
	    lg.r.la(dimension.width / 2, dimension.height / 2, 512, 512);
	    lg.r.ra(1.0F);
	    lg.r.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
	    da var_da = lg.r.a(var_eg, 2048, 64, 64, 768);
	    int i_93_ = 0;
	while_228_:
	    for (int i_94_ = 0; i_94_ < 500; i_94_++) {
		lg.r.ja(0);
		lg.r.ya();
		for (int i_95_ = 15; i_95_ >= 0; i_95_--) {
		    for (int i_96_ = 0; i_95_ >= i_96_; i_96_++) {
			br.n.NA((int) ((float) bea.o
				       * ((float) i_96_
					  - (float) i_95_ / 2.0F)),
				0, bea.o * (i_95_ + 1));
			var_da.a(br.n, null, 0);
			i_93_++;
			if ((long) i_92_ <= us.a(109) - l)
			    break while_228_;
		    }
		}
	    }
	    lg.r.k();
	    long l_97_ = (long) (i_93_ * 1000) / (us.a(113) - l);
	    lg.r.ja(0);
	    lg.r.ya();
	    return (int) l_97_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
    }
    
    public ItemDef() {
	((ItemDef) this).itemName = "null";
	m = -1;
	((ItemDef) this).n = -1;
	((ItemDef) this).isMembersItem = false;
	x = 0;
	u = 128;
	N = 0;
	((ItemDef) this).K = -1;
	((ItemDef) this).J = -1;
	((ItemDef) this).z = 0;
	((ItemDef) this).B = -1;
	V = 0;
	E = 0;
	H = -1;
	y = 0;
	((ItemDef) this).Y = false;
	((ItemDef) this).db = -1;
	e = 0;
	lb = 128;
	q = 0;
	((ItemDef) this).L = -1;
	((ItemDef) this).pb = 2000;
	I = -1;
	((ItemDef) this).nb = 0;
	((ItemDef) this).stackable = 0;
	U = -1;
	r = 128;
	((ItemDef) this).kb = -1;
	((ItemDef) this).wb = 0;
	((ItemDef) this).vb = -1;
	((ItemDef) this).qb = 0;
	((ItemDef) this).i = -1;
	((ItemDef) this).value = 1;
	((ItemDef) this).ub = -1;
	((ItemDef) this).fb = -1;
	((ItemDef) this).S = 0;
	((ItemDef) this).certID = -1;
	rb = -1;
	ib = -1;
	((ItemDef) this).Ab = 0;
	((ItemDef) this).Eb = -1;
	((ItemDef) this).Bb = 0;
	Db = -1;
	hb = 0;
	((ItemDef) this).Z = -1;
    }
}
