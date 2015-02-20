/* bda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectDef
{
    /*int nullLoader;
    private int yLoc;
    private int nullLoader;
    static int next;
    private byte unlink;
    int objectID;
    private int specialOutPacket15;
    private byte h = 0;
    int previous = -1;
    int j;
    private short[] loginStream;
    int[] width;
    int m;
    int[] n;
    private int o;
    static int p;
    static int q;
    private int r;
    private int s;
    static int applet;
    int u;
    private int[][] v;
    private int w;
    static int x;
    boolean incomingPacket63 = false;
    int z;
    int A;
    boolean B;
    boolean C;
    boolean outgoingPacket13;
    int E;
    private int F;
    private byte outgoingPacket54;
    int H;
    int I;
    int faceHereText;
    boolean xLoc;
    static int L;
    private short[] M;
    private byte[] N;
    static int O;
    private int P;
    private int Q;
    int R;
    private int S;
    String[] T;
    boolean U;
    private int V;
    private byte W;
    static int X;
    private int Y;
    private int[] Z;
    int ab;
    boolean bb;
    boolean cb;
    boolean db;
    int eb;
    int fb;
    int gb;
    boolean hb;
    boolean ib;
    int jb;
    boolean kb;
    static int lb;
    static int mb;
    ek nb;
    int ob;
    int[] pb;
    boolean qb;
    static int[] rb = new int[200];
    private int sb;
    static int tb;
    int ub;
    int vb;
    private int wb;
    int[] xb;
    static int yb;
    int zb;
    private byte Ab;
    static int Bb;
    boolean Cb;
    boolean Db;
    String objectName;
    private short[] Fb;
    static int Gb;
    int Hb;
    static int Ib = 0;
    static int Jb;
    static int Kb;
    static int Lb;
    private il Mb;
    int Nb;
    private short[] Ob;
    private byte[] Pb;
    int Qb;*/
	
	public int a;
    private int b;
    private int c;
    public static int d;
    private byte e;
    public int objectID;
    private int g;
    private byte h = 0;
    public int i = -1;
    public int j;
    private short[] k;
    public int[] l;
    public int m;
    public int[] n;
    private int o;
    public static int p;
    public static int q;
    private int r;
    private int s;
    public static int t;
    public int u;
    private int[][] v;
    private int w;
    public static int x;
    public boolean y = false;
    public int z;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    private int F;
    private byte G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public static int L;
    private short[] M;
    private byte[] N;
    public static int O;
    private int P;
    private int Q;
    public int R;
    private int S;
    public String[] T;
    public boolean U;
    private int V;
    private byte W;
    public static int X;
    private int Y;
    private int[] Z;
    public int ab;
    public boolean bb;
    public boolean cb;
    public boolean db;
    public int eb;
    public int fb;
    public int gb;
    public boolean hb;
    public boolean ib;
    public int jb;
    public boolean kb;
    public static int lb;
    public static int mb;
    public ek nb;
    public int ob;
    public int[] pb;
    public boolean qb;
    public static int[] rb = new int[200];
    private int sb;
    public static int tb;
    public int ub;
    public int vb;
    private int wb;
    public int[] xb;
    public static int yb;
    public int zb;
    private byte Ab;
    public static int Bb;
    public boolean Cb;
    public boolean Db;
    public String objectName;
    private short[] Fb;
    public static int Gb;
    public int Hb;
    public static int Ib = 0;
    public static int Jb;
    public static int Kb;
    public static int Lb;
    private il Mb;
    public int Nb;
    private short[] Ob;
    private byte[] Pb;
    public int Qb;
    
    final int a(int i, int i_0_, int i_1_) {
	Lb++;
	if (Mb == null)
	    return i_1_;
	if (i_0_ < 46)
	    Bb = 26;
	GameInPacketHandler var_hda = (GameInPacketHandler) Mb.a(-32748, (long) i);
	if (var_hda == null)
	    return i_1_;
	return ((GameInPacketHandler) var_hda).k;
    }
    
    final boolean a(boolean bool, int i) {
	tb++;
	if ((i ^ 0xffffffff) == 0)
	    return false;
	if (bool != false)
	    ((ObjectDef) this).n = null;
	if (i == ((ObjectDef) this).zb)
	    return true;
	if (((ObjectDef) this).pb != null) {
	    for (int i_2_ = 0; i_2_ < ((ObjectDef) this).pb.length; i_2_++) {
		if (i == ((ObjectDef) this).pb[i_2_])
		    return true;
	    }
	}
	return false;
    }
    
    final boolean a(byte i) {
	Jb++;
	if (i < 120)
	    ((ObjectDef) this).objectID = -12;
	if (((ObjectDef) this).xb == null) {
	    if ((((ObjectDef) this).Nb ^ 0xffffffff) == 0 && ((ObjectDef) this).n == null)
		return false;
	    return true;
	}
	for (int i_3_ = 0; i_3_ < ((ObjectDef) this).xb.length; i_3_++) {
	    if (((ObjectDef) this).xb[i_3_] != -1) {
		ObjectDef var_bda_4_ = ((ObjectDef) this).nb.getObjectDef((byte) 48, ((ObjectDef) this).xb[i_3_]);
		if (((ObjectDef) var_bda_4_).Nb != -1 || ((ObjectDef) var_bda_4_).n != null)
		    return true;
	    }
	}
	return false;
    }
    
    final da a(int i, int i_5_, Class_i class_i, int i_6_, Class_i class_i_7_,
	       dr var_dr, int i_8_, Class_r class_r, int i_9_, int i_10_,
	       int i_11_, int i_12_, int i_13_, int i_14_) {
	if (NPC.b(i_14_, i_12_ + 19))
	    i_14_ = 4;
	L++;
	long l = (long) (i_5_ + ((i_14_ << 3) + (((ObjectDef) this).objectID << 10)));
	l |= (long) (((Class_r) class_r).b << 29);
	int i_15_ = i_13_;
	if (var_dr != null)
	    i_13_ |= var_dr.a(i_12_ + 1020, i_8_, false, i_11_);
	if (e == 3)
	    i_13_ |= 0x7;
	else {
	    if (e != 0 || P != 0)
		i_13_ |= 0x2;
	    if (w != 0)
		i_13_ |= 0x1;
	    if (sb != 0)
		i_13_ |= 0x4;
	}
	if (i_14_ == 10 && i_5_ > 3)
	    i_13_ |= 0x5;
	da var_da;
	synchronized (((ek) ((ObjectDef) this).nb).x) {
	    var_da = (da) ((ek) ((ObjectDef) this).nb).x.get(l, (byte) 100);
	}
	if (var_da == null || class_r.b(var_da.PA(), i_13_) != 0) {
	    if (var_da != null)
		i_13_ = class_r.a(i_13_, var_da.PA());
	    var_da = a(i_14_, i_13_, -129, class_r, i_5_);
	    if (var_da == null)
		return null;
	    synchronized (((ek) ((ObjectDef) this).nb).x) {
		((ek) ((ObjectDef) this).nb).x.put(l, var_da, 1);
	    }
	}
	boolean bool = false;
	if (var_dr != null) {
	    var_da = var_dr.a((byte) 1, var_da, i_13_, 7, 0x3 & i_5_, i_6_,
			      i_11_, i_8_);
	    bool = true;
	}
	if (i_14_ == 10 && i_5_ > 3) {
	    if (!bool) {
		var_da = var_da.a((byte) 3, i_13_, true);
		bool = true;
	    }
	    var_da.M(2048);
	}
	if (i_12_ != 4)
	    return null;
	if (e != 0) {
	    if (!bool) {
		bool = true;
		var_da = var_da.a((byte) 3, i_13_, true);
	    }
	    var_da.ba(e, s, class_i, class_i_7_, i, i_9_, i_10_);
	}
	if (w != 0 || P != 0 || sb != 0) {
	    if (!bool) {
		bool = true;
		var_da = var_da.a((byte) 3, i_13_, true);
	    }
	    var_da.oa(w, P, sb);
	}
	if (bool)
	    var_da.SA(i_15_);
	return var_da;
    }
    
    final ObjectDef a(haa var_haa, int i) {
	q++;
	int i_16_ = -1;
	if (i != -1643)
	    parseValues((byte) 22, (BytesParser) null);
	if (b == -1) {
	    if (r != -1)
		i_16_ = var_haa.b(r, i + 1527);
	} else
	    i_16_ = var_haa.a(112, b);
	if (i_16_ < 0 || i_16_ >= ((ObjectDef) this).xb.length - 1
	    || (((ObjectDef) this).xb[i_16_] ^ 0xffffffff) == 0) {
	    int i_17_ = ((ObjectDef) this).xb[((ObjectDef) this).xb.length - 1];
	    if ((i_17_ ^ 0xffffffff) == 0)
		return null;
	    return ((ObjectDef) this).nb.getObjectDef((byte) 21, i_17_);
	}
	return ((ObjectDef) this).nb.getObjectDef((byte) 37, ((ObjectDef) this).xb[i_16_]);
    }
    
    private final void parseValue(int valueID, BytesParser stream, int dummy) {
	X++;
	if (valueID != 1 && valueID != 5) {
	    if (valueID == 2)
	    	((ObjectDef) this).objectName = stream.readString((byte) 115);
	    else if (valueID != 14) {
		if (valueID != 15) {
		    if (valueID == 17) {
			((ObjectDef) this).qb = false;
			((ObjectDef) this).ab = 0;
		    } else if (valueID != 18) {
			if (valueID != 19) {
			    if (valueID == 21)
				e = (byte) 1;
			    else if (valueID == 22)
				((ObjectDef) this).ib = true;
			    else if (valueID != 23) {
				if (valueID == 24) {
				    ((ObjectDef) this).zb = stream.readShort(13111);
				    if (((ObjectDef) this).zb == 65535)
					((ObjectDef) this).zb = -1;
				} else if (valueID == 27)
				    ((ObjectDef) this).ab = 1;
				else if (valueID != 28) {
				    if (valueID == 29)
					wb = stream.readByte(dummy ^ 0x29ff);
				    else if (valueID != 39) {
					if (valueID >= 30 && valueID < 35)
					    ((ObjectDef) this).T[valueID - 30]
						= stream.readString((byte) 122);
					else if (valueID != 40) {
					    if (valueID == 41) {
						int i_19_ = stream.readUnsignedByte(-9268);
						M = new short[i_19_];
						k = new short[i_19_];
						for (int i_20_ = 0;
						     i_19_ > i_20_; i_20_++) {
						    M[i_20_]
							= (short) (stream.readShort
								   (dummy
								    + 43891));
						    k[i_20_]
							= (short) (stream.readShort
								   (13111));
						}
					    } else if (valueID == 42) {
						int i_21_ = stream.readUnsignedByte(-9268);
						N = new byte[i_21_];
						for (int i_22_ = 0;
						     i_21_ > i_22_; i_22_++)
						    N[i_22_]
							= stream.readByte(-20933);
					    } else if (valueID != 62) {
						if (valueID == 64)
						    ((ObjectDef) this).cb = false;
						else if (valueID == 65)
						    V = stream
							    .readShort(dummy + 43891);
						else if (valueID != 66) {
						    if (valueID == 67)
							c = stream.readShort(13111);
						    else if (valueID == 69)
							((ObjectDef) this).fb
							    = stream.readUnsignedByte(-9268);
						    else if (valueID == 70)
							F = stream.readShort2(55) << 2;
						    else if (valueID != 71) {
							if (valueID == 72)
							    S = (stream.readShort2(72)
								 << 2);
							else if (valueID == 73)
							    ((ObjectDef) this).D
								= true;
							else if (valueID == 74)
							    ((ObjectDef) this).y
								= true;
							else if (valueID != 75) {
							    if (valueID != 77
								&& valueID != 92) {
								if (valueID == 78) {
								    ((ObjectDef)
								     this).Nb
									= (stream.readShort
									   (13111));
								    ((ObjectDef)
								     this).gb
									= (stream.readUnsignedByte
									   (-9268));
								} else if (valueID
									   == 79) {
								    ((ObjectDef)
								     this).eb
									= (stream.readShort
									   (13111));
								    ((ObjectDef)
								     this).Qb
									= (stream.readShort
									   (13111));
								    ((ObjectDef)
								     this).gb
									= (stream.readUnsignedByte
									   (-9268));
								    int i_23_
									= (stream.readUnsignedByte
									   (-9268));
								    ((ObjectDef)
								     this).n
									= (new int
									   [i_23_]);
								    for (int i_24_
									     = 0;
									 (i_23_
									  > i_24_);
									 i_24_++)
									((ObjectDef)
									 this)
									    .n
									    [i_24_]
									    = stream.readShort(mv.a(dummy, -19213));
								} else if (valueID
									   == 81) {
								    e = (byte) 2;
								    s = (256
									 * (stream.readUnsignedByte
									    (dummy
									     ^ 0x5c08)));
								} else if (valueID
									   == 82)
								    ((ObjectDef)
								     this).K
									= true;
								else if (valueID
									 != 88) {
								    if (valueID
									== 89)
									((ObjectDef)
									 this)
									    .bb
									    = false;
								    else if (valueID
									     == 91)
									((ObjectDef)
									 this)
									    .Db
									    = true;
								    else if (valueID
									     == 93) {
									e = (byte) 3;
									s = stream.readShort(13111);
								    } else if (valueID
									       == 94)
									e = (byte) 4;
								    else if (valueID
									     == 95) {
									e = (byte) 5;
									s = stream.readShort2(27);
								    } else if (valueID
									       == 97)
									((ObjectDef)
									 this)
									    .U
									    = true;
								    else if (valueID
									     == 98)
									((ObjectDef)
									 this)
									    .B
									    = true;
								    else if (valueID
									     == 99) {
									((ObjectDef)
									 this)
									    .Hb
									    = stream.readUnsignedByte(-9268);
									((ObjectDef)
									 this)
									    .z
									    = stream.readShort(dummy ^ ~0x4b0c);
								    } else if (valueID
									       == 100) {
									((ObjectDef)
									 this)
									    .H
									    = stream.readUnsignedByte(-9268);
									((ObjectDef)
									 this)
									    .a
									    = stream.readShort(13111);
								    } else if (valueID
									       != 101) {
									if (valueID
									    != 102) {
									    if (valueID == 103)
										((ObjectDef) this).vb = 0;
									    else if (valueID == 104)
										((ObjectDef) this).m = stream.readUnsignedByte(-9268);
									    else if (valueID != 105) {
										if (valueID != 106) {
										    if (valueID != 107) {
											if (valueID < 150 || valueID >= 155) {
											    if (valueID != 160) {
												if (valueID == 162) {
												    e = (byte) 3;
												    s = stream.readInt(dummy + 30872);
												} else if (valueID == 163) {
												    W = stream.readByte(-20933);
												    Ab = stream.readByte(-20933);
												    G = stream.readByte(-20933);
												    h = stream.readByte(dummy + 9847);
												} else if (valueID == 164)
												    w = stream.readShort2(dummy + 30871);
												else if (valueID == 165)
												    P = stream.readShort2(dummy ^ ~0x7825);
												else if (valueID == 166)
												    sb = stream.readShort2(46);
												else if (valueID == 167)
												    ((ObjectDef) this).j = stream.readShort(13111);
												else if (valueID != 168) {
												    if (valueID != 169) {
													if (valueID == 170)
													    ((ObjectDef) this).ob = stream.readSmart2(dummy + 16951);
													else if (valueID == 171)
													    ((ObjectDef) this).E = stream.readSmart2(-13829);
													else if (valueID == 249) {
													    int i_25_ = stream.readUnsignedByte(dummy + 21512);
													    if (Mb == null) {
														int i_26_ = dfa.a(i_25_, 128);
														Mb = new il(i_26_);
													    }
													    for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
														boolean bool = stream.readUnsignedByte(-9268) == 1;
														int i_28_ = stream.readTribyte(-1);
														Node class_d;
														if (bool)
														    class_d = new aa(stream.readString((byte) 125));
														else
														    class_d = new GameInPacketHandler(stream.readInt(dummy ^ ~0x784a));
														Mb.a(class_d, (byte) -111, (long) i_28_);
													    }
													}
												    } else
													((ObjectDef) this).kb = true;
												} else
												    ((ObjectDef) this).Cb = true;
											    } else {
												int i_29_ = stream.readUnsignedByte(-9268);
												((ObjectDef) this).l = new int[i_29_];
												for (int i_30_ = 0; i_29_ > i_30_; i_30_++)
												    ((ObjectDef) this).l[i_30_] = stream.readShort(dummy + 43891);
											    }
											} else {
											    ((ObjectDef) this).T[valueID - 150] = stream.readString((byte) 123);
											    if (!((ek) ((ObjectDef) this).nb).c)
												((ObjectDef) this).T[valueID - 150] = null;
											}
										    } else
											((ObjectDef) this).R = stream.readShort(13111);
										} else {
										    int i_31_ = stream.readUnsignedByte(-9268);
										    Z = new int[i_31_];
										    ((ObjectDef) this).pb = new int[i_31_];
										    for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
											((ObjectDef) this).pb[i_32_] = stream.readShort(13111);
											int i_33_ = stream.readUnsignedByte(-9268);
											Z[i_32_] = i_33_;
											Y += i_33_;
										    }
										}
									    } else
										((ObjectDef) this).db = true;
									} else
									    ((ObjectDef)
									     this).u
										= stream.readShort(13111);
								    } else
									((ObjectDef)
									 this)
									    .I
									    = stream.readUnsignedByte(-9268);
								} else
								    ((ObjectDef)
								     this).hb
									= false;
							    } else {
								b = (stream.readShort
								     (13111));
								if (b == 65535)
								    b = -1;
								r = (stream.readShort
								     (dummy
								      ^ ~0x4b0c));
								if (r == 65535)
								    r = -1;
								int i_34_ = -1;
								if (valueID == 92) {
								    i_34_
									= (stream.readShort
									   (13111));
								    if (i_34_
									== 65535)
									i_34_
									    = -1;
								}
								int i_35_
								    = (stream.readUnsignedByte
								       (-9268));
								((ObjectDef) this).xb
								    = (new int
								       [(i_35_
									 + 2)]);
								for (int i_36_
									 = 0;
								     (i_36_
								      <= i_35_);
								     i_36_++) {
								    ((ObjectDef)
								     this)
									.xb
									[i_36_]
									= (stream.readShort
									   (13111));
								    if ((((ObjectDef)
									  this)
									 .xb
									 [i_36_])
									== 65535)
									((ObjectDef)
									 this)
									    .xb
									    [i_36_]
									    = -1;
								}
								((ObjectDef) this)
								    .xb
								    [i_35_ + 1]
								    = i_34_;
							    }
							} else
							    ((ObjectDef) this).i
								= (stream.readUnsignedByte
								   (-9268));
						    } else
							Q = stream.readShort2(104) << 2;
						} else
						    o = stream.readShort(13111);
					    } else
						((ObjectDef) this).C = true;
					} else {
					    int i_37_ = stream.readUnsignedByte(-9268);
					    Ob = new short[i_37_];
					    Fb = new short[i_37_];
					    for (int i_38_ = 0; i_37_ > i_38_;
						 i_38_++) {
						Ob[i_38_]
						    = (short) (stream.readShort
							       (dummy
								+ 43891));
						Fb[i_38_]
						    = (short) (stream.readShort
							       (dummy
								+ 43891));
					    }
					}
				    } else
					g = 5 * stream.readByte(-20933);
				} else
				    ((ObjectDef) this).ub = stream.readUnsignedByte(-9268) << 2;
			    } else
				((ObjectDef) this).vb = 1;
			} else
			    ((ObjectDef) this).jb = stream.readUnsignedByte(dummy + 21512);
		    } else
			((ObjectDef) this).qb = false;
		} else
		    ((ObjectDef) this).J = stream.readUnsignedByte(dummy ^ 0x5c08);
	    } else
		((ObjectDef) this).A = stream.readUnsignedByte(-9268);
	} else {
	    if (valueID == 5 && ((ek) ((ObjectDef) this).nb).i)
		a(dummy + 20170, stream);
	    int i_39_ = stream.readUnsignedByte(-9268);
	    Pb = new byte[i_39_];
	    v = new int[i_39_][];
	    for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
		Pb[i_40_] = stream.readByte(-20933);
		int i_41_ = stream.readUnsignedByte(-9268);
		v[i_40_] = new int[i_41_];
		for (int i_42_ = 0; i_41_ > i_42_; i_42_++)
		    v[i_40_][i_42_] = stream.readShort(13111);
	    }
	    if (valueID == 5 && !((ek) ((ObjectDef) this).nb).i)
		a(-10610, stream);
	}
	if (dummy != -30780)
	    a((byte) 114);
    }
    
    private final da a(int i, int i_43_, int i_44_, Class_r class_r,
		       int i_45_) {
	Gb++;
	int i_46_ = wb + 64;
	int i_47_ = g + 850;
	int i_48_ = i_43_;
	boolean bool = ((ObjectDef) this).C || i == 2 && i_45_ > 3;
	if (bool)
	    i_43_ |= 0x10;
	if (i_45_ != 0)
	    i_43_ |= 0xd;
	else {
	    if (V != 128 || F != 0)
		i_43_ |= 0x1;
	    if (c != 128 || S != 0)
		i_43_ |= 0x4;
	}
	if ((o ^ 0xffffffff) != i_44_ || Q != 0)
	    i_43_ |= 0x2;
	if (Ob != null)
	    i_43_ |= 0x4000;
	if (M != null)
	    i_43_ |= 0x8000;
	if (h != 0)
	    i_43_ |= 0x80000;
	da var_da = null;
	if (Pb == null)
	    return null;
	int i_49_ = -1;
	for (int i_50_ = 0; i_50_ < Pb.length; i_50_++) {
	    if (i == Pb[i_50_]) {
		i_49_ = i_50_;
		break;
	    }
	}
	if ((i_49_ ^ 0xffffffff) == 0)
	    return null;
	int i_51_ = v[i_49_].length;
	if (i_51_ > 0) {
	    long l = (long) ((Class_r) class_r).b;
	    for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
		l = (long) v[i_49_][i_52_] + 67783L * l;
	    synchronized (((ek) ((ObjectDef) this).nb).u) {
		var_da = (da) ((ek) ((ObjectDef) this).nb).u.get(l, (byte) 100);
	    }
	    if (var_da != null) {
		if (var_da.TA() != i_46_)
		    i_43_ |= 0x1000;
		if (i_47_ != var_da.na())
		    i_43_ |= 0x2000;
	    }
	    if (var_da == null || class_r.b(var_da.PA(), i_43_) != 0) {
		int i_53_ = 0x1f01f | i_43_;
		if (var_da != null)
		    i_53_ = class_r.a(i_53_, var_da.PA());
		eg var_eg = null;
		synchronized (qba.C) {
		    for (int i_54_ = 0; i_51_ > i_54_; i_54_++) {
			synchronized (((ek) ((ObjectDef) this).nb).o) {
			    var_eg = efa.a(0xffff & v[i_49_][i_54_],
					   ((ek) ((ObjectDef) this).nb).o, 0, false);
			}
			if (var_eg == null)
			    return null;
			if (((eg) var_eg).bb < 13)
			    var_eg.a((byte) -107, 2);
			if (i_51_ > 1)
			    qba.C[i_54_] = var_eg;
		    }
		    if (i_51_ > 1)
			var_eg = new eg(qba.C, i_51_);
		}
		var_da = class_r.a(var_eg, i_53_, ((ek) ((ObjectDef) this).nb).y,
				   i_46_, i_47_);
		synchronized (((ek) ((ObjectDef) this).nb).u) {
		    ((ek) ((ObjectDef) this).nb).u.put(l, var_da, 1);
		}
	    }
	}
	da var_da_55_ = var_da.a((byte) 0, i_43_, true);
	if (var_da.TA() != i_46_)
	    var_da_55_.T(i_46_);
	if (var_da.na() != i_47_)
	    var_da_55_.ga(i_47_);
	if (bool)
	    var_da_55_.FA();
	if (i == 4 && i_45_ > 3) {
	    var_da_55_.fa(2048);
	    var_da_55_.oa(180, 0, -180);
	}
	i_45_ &= 0x3;
	if (i_45_ != 1) {
	    if (i_45_ == 2)
		var_da_55_.fa(8192);
	    else if (i_45_ == 3)
		var_da_55_.fa(12288);
	} else
	    var_da_55_.fa(4096);
	if (Ob != null) {
	    for (int i_56_ = 0; Ob.length > i_56_; i_56_++) {
		if (N == null || N.length <= i_56_)
		    var_da_55_.d(Ob[i_56_], Fb[i_56_]);
		else
		    var_da_55_.d(Ob[i_56_], Class_pd.s[0xff & N[i_56_]]);
	    }
	}
	if (M != null) {
	    for (int i_57_ = 0; i_57_ < M.length; i_57_++)
		var_da_55_.DA(M[i_57_], k[i_57_]);
	}
	if (h != 0)
	    var_da_55_.a(W, Ab, G, h & 0xff);
	if (V != 128 || o != 128 || c != 128)
	    var_da_55_.R(V, o, c);
	if (F != 0 || Q != 0 || S != 0)
	    var_da_55_.oa(F, Q, S);
	var_da_55_.SA(i_48_);
	return var_da_55_;
    }
    
    final String a(int i, String string, int i_58_) {
	lb++;
	if (Mb == null)
	    return string;
	aa var_aa = (aa) Mb.a(i_58_ ^ ~0x882, (long) i);
	if (var_aa == null)
	    return string;
	if (i_58_ != 30569)
	    ((ObjectDef) this).ob = -104;
	return ((aa) var_aa).m;
    }
    
    final void a(boolean bool) {
	Kb++;
	if (bool != false)
	    ((ObjectDef) this).kb = false;
	if (((ObjectDef) this).jb == -1) {
	    ((ObjectDef) this).jb = 0;
	    if (Pb != null && Pb.length == 1 && Pb[0] == 10)
		((ObjectDef) this).jb = 1;
	    for (int i = 0; i < 5; i++) {
		if (((ObjectDef) this).T[i] != null) {
		    ((ObjectDef) this).jb = 1;
		    break;
		}
	    }
	}
	if ((((ObjectDef) this).i ^ 0xffffffff) == 0)
	    ((ObjectDef) this).i = ((ObjectDef) this).ab == 0 ? 0 : 1;
    }
    
    final boolean b(byte i) {
	p++;
	if (v == null)
	    return true;
	boolean bool = true;
	synchronized (((ek) ((ObjectDef) this).nb).o) {
	    int i_59_ = 0;
	    if (i > -82)
		b((int) -10);
	    for (/**/; i_59_ < v.length; i_59_++) {
		for (int i_60_ = 0; i_60_ < v[i_59_].length; i_60_++)
		    bool &= ((ek) ((ObjectDef) this).nb).o.a(0, (byte) 117,
						       v[i_59_][i_60_]);
	    }
	}
	return bool;
    }
    
    public static void a(int i) {
	rb = null;
	int i_61_ = -70 / ((-17 - i) / 48);
    }
    
    final kj a(int i, Class_r class_r, int i_62_, Class_i class_i, int i_63_,
	       int i_64_, Class_i class_i_65_, int i_66_, boolean bool,
	       int i_67_, int i_68_) {
	t++;
	if (NPC.b(i_67_, -122))
	    i_67_ = 4;
	long l = (long) ((((ObjectDef) this).objectID << 10) + (i_67_ << 3) + i_68_);
	l |= (long) (((Class_r) class_r).b << 29);
	int i_69_ = i;
	if (e == 3)
	    i_69_ |= 0x7;
	else {
	    if (e != 0 || P != 0)
		i_69_ |= 0x2;
	    if (w != 0)
		i_69_ |= 0x1;
	    if (sb != 0)
		i_69_ |= 0x4;
	}
	if (bool)
	    i_69_ |= 0x40000;
	kj var_kj;
	synchronized (((ek) ((ObjectDef) this).nb).v) {
	    var_kj = (kj) ((ek) ((ObjectDef) this).nb).v.get(l, (byte) 100);
	}
	da var_da = var_kj == null ? null : ((kj) var_kj).d;
	ha var_ha = null;
	if (var_da == null || class_r.b(var_da.PA(), i_69_) != 0) {
	    if (var_da != null)
		i_69_ = class_r.a(i_69_, var_da.PA());
	    int i_70_ = i_69_;
	    if (i_67_ == 10 && i_68_ > 3)
		i_70_ |= 0x5;
	    var_da = a(i_67_, i_70_, -129, class_r, i_68_);
	    if (var_da == null)
		return null;
	    if (i_67_ == 10 && i_68_ > 3)
		var_da.M(2048);
	    if (bool)
		var_ha = var_da.S(null);
	    var_da.SA(i_69_);
	    var_kj = new kj();
	    ((kj) var_kj).d = var_da;
	    ((kj) var_kj).e = var_ha;
	    synchronized (((ek) ((ObjectDef) this).nb).v) {
		((ek) ((ObjectDef) this).nb).v.put(l, var_kj, 1);
	    }
	} else {
	    var_da = ((kj) var_kj).d;
	    var_ha = ((kj) var_kj).e;
	    if (bool && var_ha == null)
		var_ha = ((kj) var_kj).e = var_da.S(null);
	}
	boolean bool_71_ = e != 0 && (class_i != null || class_i_65_ != null);
	boolean bool_72_ = w != 0 || P != 0 || sb != 0;
	if (!bool_71_ && !bool_72_)
	    var_da = var_da.a((byte) 0, i, true);
	else {
	    var_da = var_da.a((byte) 0, i_69_, true);
	    if (bool_71_)
		var_da.ba(e, s, class_i, class_i_65_, i_63_, i_62_, i_66_);
	    if (bool_72_)
		var_da.oa(w, P, sb);
	    var_da.SA(i);
	}
	((kj) rda.g).e = var_ha;
	((kj) rda.g).d = var_da;
	if (i_64_ != -129)
	    a((int) -106, (BytesParser) null);
	return rda.g;
    }
    
    final int b(int i) {
	if (i != -1)
	    a(4, -25);
	mb++;
	if (((ObjectDef) this).pb != null) {
	    int i_73_ = (int) (Math.random() * (double) Y);
	    int i_74_;
	    for (i_74_ = 0; i_73_ >= Z[i_74_]; i_74_++)
		i_73_ -= Z[i_74_];
	    return ((ObjectDef) this).pb[i_74_];
	}
	return -1;
    }
    
    final boolean a(int i, int i_75_) {
	d++;
	if (v == null)
	    return true;
	synchronized (((ek) ((ObjectDef) this).nb).o) {
	    int i_76_ = -13 % ((15 - i) / 61);
	    for (int i_77_ = 0; i_77_ < Pb.length; i_77_++) {
		if (Pb[i_77_] == i_75_) {
		    for (int i_78_ = 0; i_78_ < v[i_77_].length; i_78_++) {
			if (!((ek) ((ObjectDef) this).nb).o.a(0, (byte) 85,
							v[i_77_][i_78_]))
			    return false;
		    }
		    return true;
		}
	    }
	}
	return true;
    }
    
    static final int a(int i, int i_79_, int i_80_, int i_81_, int i_82_,
		       int i_83_, int i_84_) {
	i_79_ &= 0x3;
	O++;
	if ((i_84_ & i) == 1) {
	    int i_85_ = i_83_;
	    i_83_ = i_80_;
	    i_80_ = i_85_;
	}
	if (i_79_ == 0)
	    return i_82_;
	if (i_79_ == 1)
	    return i_81_;
	if (i_79_ == 2)
	    return 7 - i_83_ - i_82_ + 1;
	return -i_81_ - i_80_ + 7 + 1;
    }
    
    private final void a(int i, BytesParser var_es) {
	x++;
	int i_86_ = var_es.readUnsignedByte(-9268);
	int i_87_ = 0;
	if (i != -10610)
	    a((int) -104);
	for (/**/; i_86_ > i_87_; i_87_++) {
	    ((BytesParser) var_es).pos++;
	    int i_88_ = var_es.readUnsignedByte(-9268);
	    ((BytesParser) var_es).pos += 2 * i_88_;
	}
    }
    
    final void parseValues(byte i, BytesParser var_es) {
	if (i != 0)
	    ((ObjectDef) this).J = -97;
	for (;;) {
	    int valueID = var_es.readUnsignedByte(-9268);
	    if (valueID == 0)
	    	break;
	    parseValue(valueID, var_es, -30780);
	}
	yb++;
    }
    
    public ObjectDef() {
	((ObjectDef) this).a = -1;
	s = -1;
	F = 0;
	e = (byte) 0;
	((ObjectDef) this).A = 1;
	((ObjectDef) this).H = -1;
	((ObjectDef) this).D = false;
	g = 0;
	((ObjectDef) this).B = false;
	c = 128;
	((ObjectDef) this).u = -1;
	((ObjectDef) this).T = new String[5];
	((ObjectDef) this).C = false;
	b = -1;
	P = 0;
	((ObjectDef) this).I = 0;
	o = 128;
	((ObjectDef) this).ab = 2;
	w = 0;
	((ObjectDef) this).bb = true;
	((ObjectDef) this).U = false;
	((ObjectDef) this).jb = -1;
	((ObjectDef) this).ib = false;
	((ObjectDef) this).m = 255;
	((ObjectDef) this).pb = null;
	((ObjectDef) this).gb = 0;
	((ObjectDef) this).eb = 0;
	((ObjectDef) this).R = -1;
	((ObjectDef) this).cb = true;
	((ObjectDef) this).K = false;
	((ObjectDef) this).ub = 64;
	Y = 0;
	((ObjectDef) this).qb = true;
	wb = 0;
	((ObjectDef) this).E = 0;
	((ObjectDef) this).j = 0;
	((ObjectDef) this).zb = -1;
	((ObjectDef) this).db = false;
	V = 128;
	((ObjectDef) this).J = 1;
	((ObjectDef) this).objectName = "null";
	((ObjectDef) this).z = -1;
	r = -1;
	((ObjectDef) this).kb = false;
	sb = 0;
	S = 0;
	((ObjectDef) this).Db = false;
	((ObjectDef) this).hb = true;
	Q = 0;
	((ObjectDef) this).Cb = false;
	((ObjectDef) this).Nb = -1;
	Z = null;
	((ObjectDef) this).vb = -1;
	((ObjectDef) this).Qb = 0;
	((ObjectDef) this).ob = 960;
	((ObjectDef) this).fb = 0;
	((ObjectDef) this).Hb = -1;
    }
    
    static {
	Bb = 1;
    }
}
