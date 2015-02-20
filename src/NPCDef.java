/* du - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPCDef {
	/*int nullLoader;
	private short[] yLoc;
	static int nullLoader;
	String[] next = new String[5];
	private byte unlink;
	boolean outgoingPacket2;
	static fca specialOutPacket15 = new fca();
	int h;
	int previous;
	static int j;
	static int loginStream;
	private byte width;
	boolean m = true;
	byte n;
	static int o;
	private short[] p;
	boolean q;
	static int r;
	static int s;
	int applet;
	private int u;
	boolean v;
	static int w;
	int x;
	byte incomingPacket63;
	int z;
	static int A;
	int B;
	static int C;
	byte outgoingPacket13;
	int E;
	int npcID;
	int[] outgoingPacket54;
	private byte H;
	private int[][] I;
	private byte[] faceHereText;
	static int xLoc;
	int[] L;
	int combatLevel;
	boolean N;
	int O;
	private int P;
	int Q;
	static int R;
	private int[][] S;
	int T;
	int U;
	short V;
	static int W;
	int X;
	private int Y;
	byte Z;
	int ab;
	int bb;
	private int[] cb;
	Class_lb db;
	private int eb;
	boolean fb;
	private short[] gb;
	static Class_ec hb = new Class_ec(1);
	private byte ib;
	private int jb;
	private int kb;
	int lb;
	int mb;
	private short[] nb;
	boolean ob;
	int pb;
	byte qb;
	short rb;
	int sb;
	static int tb;
	boolean ub;
	String npcName;
	private il wb;
	int xb;
	int yb;
	private int[] zb;*/
	
	public int a;
	private short[] b;
	public static int c;
	public String[] actions = new String[5];
	private byte e;
	public boolean f;
	public static fca g = new fca();
	public int h;
	public int i;
	public static int j;
	public static int k;
	private byte l;
	public boolean m = true;
	public byte n;
	public static int o;
	private short[] p;
	public boolean q;
	public static int r;
	public static int s;
	int t;
	private int u;
	public boolean v;
	public static int w;
	public int x;
	public byte y;
	public int z;
	public static int A;
	public int B;
	public static int C;
	public byte D;
	public int E;
	public int npcID;
	public int[] G;
	private byte H;
	private int[][] I;
	private byte[] J;
	public static int K;
	public int[] L;
	public int combatLevel;
	public boolean N;
	public int O;
	private int P;
	public int Q;
	public static int R;
	private int[][] S;
	public int T;
	public int U;
	public short V;
	public static int W;
	public int X;
	private int Y;
	public byte Z;
	public int ab;
	public int bb;
	private int[] cb;
	public Class_lb db;
	private int eb;
	public boolean fb;
	private short[] gb;
	public static Class_ec hb = new Class_ec(1);
	private byte ib;
	private int jb;
	private int kb;
	public int lb;
	public int mb;
	private short[] nb;
	public boolean ob;
	public int pb;
	public byte qb;
	public short rb;
	public int sb;
	public static int tb;
	public boolean ub;
	public String npcName;
	private il wb;
	public int xb;
	public int yb;
	private int[] zb;

	final void a(int i) {
		if (((NPCDef) this).D == -1) {
			if (((Class_lb) ((NPCDef) this).db).k == wa.t)
				((NPCDef) this).D = (byte) 1;
			else
				((NPCDef) this).D = (byte) 0;
		}
		C++;
		if (cb == null)
			cb = new int[0];
		if (i != 16)
			I = null;
	}

	static final void a(int i, int i_0_, int i_1_) {
		po.b++;
		K++;
		tba var_tba = jga.sendGameOutPacket(ek.j, pca.isaac, (byte) 114);
		((tba) var_tba).loginStream.writeShortReversed(103, i_0_);
		((tba) var_tba).loginStream.writeIntShiftsInOrder_8_0_24_16(i_1_, 123);
		if (i != 0)
			g = null;
		ud.a(var_tba, (byte) -36);
	}

	final NPCDef a(int i, haa var_haa) {
		if (i != -4261)
			H = (byte) 58;
		R++;
		int i_2_ = -1;
		if (P == -1) {
			if (u != -1)
				i_2_ = var_haa.b(u, -100);
		} else
			i_2_ = var_haa.a(113, P);
		if (i_2_ < 0 || i_2_ >= ((NPCDef) this).L.length - 1
				|| ((NPCDef) this).L[i_2_] == -1) {
			int i_3_ = ((NPCDef) this).L[((NPCDef) this).L.length - 1];
			if (i_3_ != -1)
				return ((NPCDef) this).db.getNPCDef(i_3_, (byte) -125);
			return null;
		}
		return ((NPCDef) this).db.getNPCDef(((NPCDef) this).L[i_2_],
				(byte) -111);
	}

	private final void parseValue(byte i, BytesParser var_es, int valueID) {
		j++;
		if (valueID != 1) {
			if (valueID != 2) {
				if (valueID == 12)
					((NPCDef) this).Q = var_es.readUnsignedByte(-9268);
				else if (valueID >= 30 && valueID < 35)
					((NPCDef) this).actions[valueID - 30] = var_es
							.readString((byte) 126);
				else if (valueID != 40) {
					if (valueID == 41) {
						int i_5_ = var_es.readUnsignedByte(-9268);
						b = new short[i_5_];
						nb = new short[i_5_];
						for (int i_6_ = 0; i_5_ > i_6_; i_6_++) {
							nb[i_6_] = (short) var_es.readShort(13111);
							b[i_6_] = (short) var_es.readShort(13111);
						}
					} else if (valueID != 42) {
						if (valueID == 60) {
							int i_7_ = var_es.readUnsignedByte(-9268);
							zb = new int[i_7_];
							for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
								zb[i_8_] = var_es.readShort(13111);
						} else if (valueID != 93) {
							if (valueID != 95) {
								if (valueID == 97)
									jb = var_es.readShort(i ^ 0x336b);
								else if (valueID != 98) {
									if (valueID == 99)
										((NPCDef) this).q = true;
									else if (valueID != 100) {
										if (valueID != 101) {
											if (valueID != 102) {
												if (valueID == 103)
													((NPCDef) this).U = var_es
															.readShort(i ^ 0x336b);
												else if (valueID != 106
														&& valueID != 118) {
													if (valueID == 107)
														((NPCDef) this).m = false;
													else if (valueID == 109)
														((NPCDef) this).fb = false;
													else if (valueID == 111)
														((NPCDef) this).f = false;
													else if (valueID == 113) {
														((NPCDef) this).V = (short) (var_es
																.readShort(13111));
														((NPCDef) this).rb = (short) (var_es
																.readShort(13111));
													} else if (valueID != 114) {
														if (valueID == 119)
															((NPCDef) this).y = (var_es
																	.readByte(-20933));
														else if (valueID == 121) {
															I = (new int[cb.length][]);
															int i_9_ = (var_es
																	.readUnsignedByte(-9268));
															for (int i_10_ = 0; i_9_ > i_10_; i_10_++) {
																int i_11_ = (var_es
																		.readUnsignedByte(-9268));
																int[] is = (I[i_11_] = (new int[3]));
																is[0] = (var_es
																		.readByte(-20933));
																is[1] = (var_es
																		.readByte(-20933));
																is[2] = (var_es
																		.readByte(-20933));
															}
														} else if (valueID == 122)
															((NPCDef) this).yb = (var_es
																	.readShort(13111));
														else if (valueID == 123)
															((NPCDef) this).xb = (var_es
																	.readShort(13111));
														else if (valueID != 125) {
															if (valueID == 127)
																((NPCDef) this).x = (var_es
																		.readShort(i + 13019));
															else if (valueID != 128) {
																if (valueID != 134) {
																	if (valueID == 135) {
																		((NPCDef) this).a = var_es
																				.readUnsignedByte(-9268);
																		((NPCDef) this).B = var_es
																				.readShort(i ^ 0x336b);
																	} else if (valueID != 136) {
																		if (valueID != 137) {
																			if (valueID != 138) {
																				if (valueID == 139)
																					((NPCDef) this).E = var_es
																							.readShort(13111);
																				else if (valueID != 140) {
																					if (valueID == 141)
																						((NPCDef) this).ub = true;
																					else if (valueID != 142) {
																						if (valueID != 143) {
																							if (valueID < 150
																									|| valueID >= 155) {
																								if (valueID != 155) {
																									if (valueID != 158) {
																										if (valueID == 159)
																											((NPCDef) this).D = (byte) 0;
																										else if (valueID != 160) {
																											if (valueID != 162) {
																												if (valueID != 163) {
																													if (valueID == 249) {
																														int i_12_ = var_es
																																.readUnsignedByte(i
																																		^ ~0x246f);
																														if (wb == null) {
																															int i_13_ = dfa
																																	.a(
																																			i_12_,
																																			128);
																															wb = new il(
																																	i_13_);
																														}
																														for (int i_14_ = 0; i_12_ > i_14_; i_14_++) {
																															boolean bool = var_es
																																	.readUnsignedByte(-9268) == 1;
																															int i_15_ = var_es
																																	.readTribyte(-1);
																															Node class_d;
																															if (bool)
																																class_d = new aa(
																																		var_es
																																				.readString((byte) 125));
																															else
																																class_d = new GameInPacketHandler(
																																		var_es
																																				.readInt(i ^ 0x20));
																															wb
																																	.a(
																																			class_d,
																																			(byte) -84,
																																			(long) i_15_);
																														}
																													}
																												} else
																													((NPCDef) this).O = var_es
																															.readUnsignedByte(i - 9360);
																											} else
																												((NPCDef) this).v = true;
																										} else {
																											int i_16_ = var_es
																													.readUnsignedByte(-9268);
																											((NPCDef) this).G = new int[i_16_];
																											for (int i_17_ = 0; i_16_ > i_17_; i_17_++)
																												((NPCDef) this).G[i_17_] = var_es
																														.readShort(13111);
																										}
																									} else
																										((NPCDef) this).D = (byte) 1;
																								} else {
																									e = var_es
																											.readByte(i
																													^ ~0x5198);
																									l = var_es
																											.readByte(-20933);
																									H = var_es
																											.readByte(-20933);
																									ib = var_es
																											.readByte(i - 21025);
																								}
																							} else {
																								((NPCDef) this).actions[valueID - 150] = var_es
																										.readString((byte) 120);
																								if (!((Class_lb) ((NPCDef) this).db).c)
																									((NPCDef) this).actions[valueID - 150] = null;
																							}
																						} else
																							((NPCDef) this).N = true;
																					} else
																						((NPCDef) this).z = var_es
																								.readShort(i ^ 0x336b);
																				} else
																					((NPCDef) this).h = var_es
																							.readUnsignedByte(-9268);
																			} else
																				((NPCDef) this).i = var_es
																						.readShort(13111);
																		} else
																			((NPCDef) this).mb = var_es
																					.readShort(13111);
																	} else {
																		((NPCDef) this).X = var_es
																				.readUnsignedByte(i - 9360);
																		((NPCDef) this).T = var_es
																				.readShort(13111);
																	}
																} else {
																	((NPCDef) this).lb = (var_es
																			.readShort(13111));
																	if ((((NPCDef) this).lb) == 65535)
																		((NPCDef) this).lb = -1;
																	((NPCDef) this).ab = (var_es
																			.readShort(13111));
																	if ((((NPCDef) this).ab) == 65535)
																		((NPCDef) this).ab = -1;
																	((NPCDef) this).t = (var_es
																			.readShort(13111));
																	if ((((NPCDef) this).t) == 65535)
																		((NPCDef) this).t = -1;
																	((NPCDef) this).sb = (var_es
																			.readShort(13111));
																	if ((((NPCDef) this).sb) == 65535)
																		((NPCDef) this).sb = -1;
																	((NPCDef) this).pb = (var_es
																			.readUnsignedByte(-9268));
																}
															} else
																var_es
																		.readUnsignedByte(-9268);
														} else
															((NPCDef) this).Z = (var_es
																	.readByte(-20933));
													} else {
														((NPCDef) this).n = var_es
																.readByte(-20933);
														((NPCDef) this).qb = var_es
																.readByte(-20933);
													}
												} else {
													P = var_es.readShort(13111);
													if (P == 65535)
														P = -1;
													u = var_es
															.readShort(i ^ 0x336b);
													if (u == 65535)
														u = -1;
													int i_18_ = -1;
													if (valueID == 118) {
														i_18_ = var_es
																.readShort(13111);
														if (i_18_ == 65535)
															i_18_ = -1;
													}
													int i_19_ = var_es
															.readUnsignedByte(-9268);
													((NPCDef) this).L = new int[i_19_ + 2];
													for (int i_20_ = 0; i_19_ >= i_20_; i_20_++) {
														((NPCDef) this).L[i_20_] = var_es
																.readShort(13111);
														if ((((NPCDef) this).L[i_20_]) == 65535)
															((NPCDef) this).L[i_20_] = -1;
													}
													((NPCDef) this).L[i_19_ + 1] = i_18_;
												}
											} else
												((NPCDef) this).bb = var_es
														.readShort(i + 13019);
										} else
											eb = var_es.readByte(-20933) * 5;
									} else
										Y = var_es.readByte(-20933);
								} else
									kb = var_es.readShort(13111);
							} else
								((NPCDef) this).combatLevel = var_es.readShort(13111);
						} else
							((NPCDef) this).ob = false;
					} else {
						int i_21_ = var_es.readUnsignedByte(-9268);
						J = new byte[i_21_];
						for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
							J[i_22_] = var_es.readByte(-20933);
					}
				} else {
					int i_23_ = var_es.readUnsignedByte(-9268);
					gb = new short[i_23_];
					p = new short[i_23_];
					for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
						p[i_24_] = (short) var_es.readShort(13111);
						gb[i_24_] = (short) var_es.readShort(13111);
					}
				}
			} else
				((NPCDef) this).npcName = var_es.readString((byte) 121);
		} else {
			int i_25_ = var_es.readUnsignedByte(-9268);
			cb = new int[i_25_];
			for (int i_26_ = 0; i_25_ > i_26_; i_26_++) {
				cb[i_26_] = var_es.readShort(mv.a(i, 13163));
				if (cb[i_26_] == 65535)
					cb[i_26_] = -1;
			}
		}
		if (i != 92)
			((NPCDef) this).yb = -119;
	}

	final void parseValues(BytesParser var_es, boolean bool) {
		for (;;) {
			int valueID = var_es.readUnsignedByte(-9268);
			if (valueID == 0)
				break;
			parseValue((byte) 92, var_es, valueID);
		}
		if (bool != true)
			l = (byte) -127;
		A++;
	}

	public static void b(int i) {
		hb = null;
		g = null;
		if (i > -83)
			a(false);
	}

	final String a(byte i, String string, int i_27_) {
		c++;
		if (wb == null)
			return string;
		aa var_aa = (aa) wb.a(-32748, (long) i_27_);
		int i_28_ = 54 / ((84 - i) / 36);
		if (var_aa == null)
			return string;
		return ((aa) var_aa).m;
	}

	final boolean a(byte i, haa var_haa) {
		w++;
		if (((NPCDef) this).L == null)
			return true;
		if (i != -33)
			eb = -124;
		int i_29_ = -1;
		if ((P ^ 0xffffffff) != 0)
			i_29_ = var_haa.a(127, P);
		else if ((u ^ 0xffffffff) != 0)
			i_29_ = var_haa.b(u, i + 144);
		if (i_29_ < 0 || ((NPCDef) this).L.length - 1 <= i_29_
				|| (((NPCDef) this).L[i_29_] ^ 0xffffffff) == 0) {
			int i_30_ = ((NPCDef) this).L[((NPCDef) this).L.length - 1];
			if (i_30_ == -1)
				return false;
			return true;
		}
		return true;
	}

	static final void a(Class_r class_r, Interface var_kp, int i) {
		if (i > -116)
			b(-19);
		tb++;
		boolean bool = (laa.itemDefLoader.a(~0xffffff | ((Interface) var_kp).shadowColor, ((Interface) var_kp).itemID,
				((Interface) var_kp).ib ? ((Player) up.thisPlayer).playerDef : null, class_r,
				((Interface) var_kp).itemStackSize, ((Interface) var_kp).borderThickness, 123, ((Interface) var_kp).Rc) == null);
		if (bool) {
			iga.j.b(new wq(((Interface) var_kp).itemID, ((Interface) var_kp).itemStackSize,
					((Interface) var_kp).borderThickness, ((Interface) var_kp).shadowColor | ~0xffffff,
					((Interface) var_kp).Rc, ((Interface) var_kp).ib), (byte) 93);
			tn.a(var_kp, 1023);
		}
	}

	final da a(int i, int i_31_, int i_32_, wca var_wca, int i_33_, int i_34_,
			dr var_dr, int i_35_, int i_36_, dr var_dr_37_, hl var_hl,
			int i_38_, an[] var_ans, Class_r class_r, haa var_haa) {
		s++;
		if (((NPCDef) this).L != null) {
			NPCDef var_du_39_ = a(-4261, var_haa);
			if (var_du_39_ == null)
				return null;
			return var_du_39_.a(i, i_31_, i_32_, var_wca, i_33_, i_34_, var_dr,
					13770, i_36_, var_dr_37_, var_hl, i_38_, var_ans, class_r,
					var_haa);
		}
		int i_40_ = i_38_;
		if (kb != 128)
			i_40_ |= 0x2;
		if (jb != 128)
			i_40_ |= 0x5;
		boolean bool = var_dr_37_ != null || var_dr != null;
		boolean bool_41_ = false;
		boolean bool_42_ = false;
		boolean bool_43_ = false;
		boolean bool_44_ = false;
		int i_45_ = var_ans == null ? 0 : var_ans.length;
		for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
			qc.a[i_46_] = null;
			if (var_ans[i_46_] != null) {
				dr var_dr_47_ = var_hl.c(64, ((an) var_ans[i_46_]).c);
				if (((dr) var_dr_47_).p != null) {
					bool = true;
					wd.y[i_46_] = var_dr_47_;
					int i_48_ = ((an) var_ans[i_46_]).d;
					int i_49_ = ((an) var_ans[i_46_]).g;
					int i_50_ = ((dr) var_dr_47_).p[i_48_];
					qc.a[i_46_] = var_hl.b(i_50_ >>> 16, 88);
					i_50_ &= 0xffff;
					Class_mc.l[i_46_] = i_50_;
					if (qc.a[i_46_] != null) {
						bool_42_ |= qc.a[i_46_].a(i_50_, i_35_ - 13770);
						bool_41_ |= qc.a[i_46_].a(i_50_, (byte) -120);
						bool_44_ |= qc.a[i_46_].a((byte) -101, i_50_);
						bool_43_ |= ((dr) var_dr_47_).n;
					}
					if ((((dr) var_dr_47_).z || vm.r) && i_49_ != -1
							&& ((dr) var_dr_47_).p.length > i_49_) {
						aaa.u[i_46_] = ((dr) var_dr_47_).B[i_48_];
						Animable.r[i_46_] = ((an) var_ans[i_46_]).b;
						int i_51_ = ((dr) var_dr_47_).p[i_49_];
						lu.l[i_46_] = var_hl.b(i_51_ >>> 16, -118);
						i_51_ &= 0xffff;
						vs.A[i_46_] = i_51_;
						if (lu.l[i_46_] != null) {
							bool_42_ |= lu.l[i_46_].a(i_51_, (int) 0);
							bool_41_ |= lu.l[i_46_].a(i_51_, (byte) -111);
							bool_44_ |= lu.l[i_46_].a((byte) -101, i_51_);
						}
					} else {
						aaa.u[i_46_] = 0;
						Animable.r[i_46_] = 0;
						lu.l[i_46_] = null;
						vs.A[i_46_] = -1;
					}
				}
			}
		}
		int i_52_ = -1;
		int i_53_ = -1;
		int i_54_ = 0;
		wa var_wa = null;
		wa var_wa_55_ = null;
		int i_56_ = -1;
		int i_57_ = -1;
		int i_58_ = 0;
		wa var_wa_59_ = null;
		wa var_wa_60_ = null;
		if (bool) {
			if (var_dr_37_ != null) {
				i_52_ = ((dr) var_dr_37_).p[i];
				int i_61_ = i_52_ >>> 16;
				i_52_ &= 0xffff;
				var_wa = var_hl.b(i_61_, -120);
				if (var_wa != null) {
					bool_42_ |= var_wa.a(i_52_, (int) 0);
					bool_41_ |= var_wa.a(i_52_, (byte) -45);
					bool_44_ |= var_wa.a((byte) -101, i_52_);
					bool_43_ |= ((dr) var_dr_37_).n;
				}
				if ((((dr) var_dr_37_).z || vm.r) && (i_32_ ^ 0xffffffff) != 0
						&& ((dr) var_dr_37_).p.length > i_32_) {
					i_53_ = ((dr) var_dr_37_).p[i_32_];
					i_54_ = ((dr) var_dr_37_).B[i];
					int i_62_ = i_53_ >>> 16;
					if (i_62_ != i_61_)
						var_wa_55_ = var_hl.b(i_62_, 43);
					else
						var_wa_55_ = var_wa;
					i_53_ &= 0xffff;
					if (var_wa_55_ != null) {
						bool_42_ |= var_wa_55_.a(i_53_, (int) 0);
						bool_41_ |= var_wa_55_.a(i_53_, (byte) -120);
						bool_44_ |= var_wa_55_.a((byte) -101, i_53_);
					}
				}
			}
			i_40_ |= 0x20;
			if (var_dr != null) {
				i_56_ = ((dr) var_dr).p[i_36_];
				int i_63_ = i_56_ >>> 16;
				i_56_ &= 0xffff;
				var_wa_59_ = var_hl.b(i_63_, -111);
				if (var_wa_59_ != null) {
					bool_42_ |= var_wa_59_.a(i_56_, (int) 0);
					bool_41_ |= var_wa_59_.a(i_56_, (byte) -95);
					bool_44_ |= var_wa_59_.a((byte) -101, i_56_);
					bool_43_ |= ((dr) var_dr).n;
				}
				if ((((dr) var_dr).z || vm.r) && i_33_ != -1
						&& i_33_ < ((dr) var_dr).p.length) {
					i_58_ = ((dr) var_dr).B[i_36_];
					i_57_ = ((dr) var_dr).p[i_33_];
					int i_64_ = i_57_ >>> 16;
					i_57_ &= 0xffff;
					if (i_63_ == i_64_)
						var_wa_60_ = var_wa_59_;
					else
						var_wa_60_ = var_hl.b(i_64_, i_35_ ^ 0x35b3);
					if (var_wa_60_ != null) {
						bool_42_ |= var_wa_60_.a(i_57_, (int) 0);
						bool_41_ |= var_wa_60_.a(i_57_, (byte) -97);
						bool_44_ |= var_wa_60_.a((byte) -101, i_57_);
					}
				}
			}
			if (bool_42_)
				i_40_ |= 0x80;
			if (bool_41_)
				i_40_ |= 0x100;
			if (bool_43_)
				i_40_ |= 0x200;
			if (bool_44_)
				i_40_ |= 0x400;
		}
		da var_da;
		synchronized (((Class_lb) ((NPCDef) this).db).n) {
			var_da = (da) ((Class_lb) ((NPCDef) this).db).n
					.get(
							(long) (((NPCDef) this).npcID | (((Class_r) class_r).b << 16)),
							(byte) 100);
		}
		if (var_da == null || (i_40_ & var_da.PA()) != i_40_) {
			if (var_da != null)
				i_40_ |= var_da.PA();
			int i_65_ = i_40_;
			boolean bool_66_ = false;
			synchronized (((Class_lb) ((NPCDef) this).db).e) {
				for (int i_67_ = 0; cb.length > i_67_; i_67_++) {
					if ((cb[i_67_] ^ 0xffffffff) != 0
							&& !((Class_lb) ((NPCDef) this).db).e.a(0,
									(byte) 82, cb[i_67_]))
						bool_66_ = true;
				}
			}
			if (bool_66_)
				return null;
			eg[] var_egs = new eg[cb.length];
			for (int i_68_ = 0; i_68_ < cb.length; i_68_++) {
				if (cb[i_68_] != -1) {
					synchronized (((Class_lb) ((NPCDef) this).db).e) {
						var_egs[i_68_] = efa.a(cb[i_68_],
								((Class_lb) ((NPCDef) this).db).e, 0, false);
					}
					if (var_egs[i_68_] != null) {
						if (((eg) var_egs[i_68_]).bb < 13)
							var_egs[i_68_].a((byte) -107, 2);
						if (I != null && I[i_68_] != null)
							var_egs[i_68_].a(I[i_68_][2], (byte) 110,
									I[i_68_][0], I[i_68_][1]);
					}
				}
			}
			cg var_cg = null;
			if (((NPCDef) this).x != -1)
				var_cg = var_wca.a(((NPCDef) this).x, (byte) 55);
			if (var_cg != null && ((cg) var_cg).y != null) {
				for (int i_69_ = 0; ((cg) var_cg).y.length > i_69_; i_69_++) {
					if (((cg) var_cg).y[i_69_] != null
							&& var_egs.length > i_69_ && var_egs[i_69_] != null) {
						int i_70_ = ((cg) var_cg).y[i_69_][0];
						int i_71_ = ((cg) var_cg).y[i_69_][1];
						int i_72_ = ((cg) var_cg).y[i_69_][2];
						int i_73_ = ((cg) var_cg).y[i_69_][3] << 3;
						int i_74_ = ((cg) var_cg).y[i_69_][4] << 3;
						int i_75_ = ((cg) var_cg).y[i_69_][5] << 3;
						if (S == null)
							S = new int[((cg) var_cg).y.length][];
						if (S[i_69_] == null) {
							int[] is = S[i_69_] = new int[15];
							if (i_73_ == 0 && i_74_ == 0 && i_75_ == 0) {
								is[12] = -i_70_;
								is[14] = -i_72_;
								is[0] = is[4] = is[8] = 32768;
								is[13] = -i_71_;
							} else {
								int i_76_ = GameInPacket.i[i_73_];
								int i_77_ = GameInPacket.h[i_73_];
								int i_78_ = GameInPacket.i[i_74_];
								int i_79_ = GameInPacket.h[i_74_];
								int i_80_ = GameInPacket.i[i_75_];
								int i_81_ = GameInPacket.h[i_75_];
								int i_82_ = i_77_ * i_80_ + 8192 >> 14;
								int i_83_ = i_77_ * i_81_ + 8192 >> 14;
								is[4] = i_80_ * i_76_ + 8192 >> 14;
								is[1] = i_78_ * -i_81_ + (i_79_ * i_82_ + 8192) >> 14;
								is[2] = i_79_ * i_76_ + 8192 >> 14;
								is[8] = i_78_ * i_76_ + 8192 >> 14;
								is[7] = (-i_79_ * -i_81_ + i_78_ * i_82_ + 8192 >> 14);
								is[5] = -i_77_;
								is[0] = (i_79_ * i_83_ + i_80_ * i_78_ + 8192 >> 14);
								is[3] = i_81_ * i_76_ + 8192 >> 14;
								is[6] = i_83_ * i_78_ + (i_80_ * -i_79_ + 8192) >> 14;
								is[14] = (is[5] * -i_71_ + -i_70_ * is[2]
										+ is[8] * -i_72_ + 8192) >> 14;
								is[12] = (is[6] * -i_72_ + 8192 + is[0]
										* -i_70_ + -i_71_ * is[3]) >> 14;
								is[13] = (is[4] * -i_71_ + is[1] * -i_70_
										+ -i_72_ * is[7] + 8192) >> 14;
							}
							is[11] = i_72_;
							is[10] = i_71_;
							is[9] = i_70_;
						}
						if (i_73_ != 0 || i_74_ != 0 || i_75_ != 0)
							var_egs[i_69_].b(i_73_, i_35_ ^ 0x7fb6, i_75_,
									i_74_);
						if (i_70_ != 0 || i_71_ != 0 || i_72_ != 0)
							var_egs[i_69_].a(i_72_, (byte) 123, i_70_, i_71_);
					}
				}
			}
			eg var_eg;
			if (var_egs.length == 1)
				var_eg = var_egs[0];
			else
				var_eg = new eg(var_egs, var_egs.length);
			if (p != null)
				i_65_ |= 0x4000;
			if (nb != null)
				i_65_ |= 0x8000;
			if (ib != 0)
				i_65_ |= 0x80000;
			var_da = class_r.a(var_eg, i_65_,
					((Class_lb) ((NPCDef) this).db).q, 64 + Y, eb + 850);
			if (p != null) {
				for (int i_84_ = 0; p.length > i_84_; i_84_++) {
					if (J == null || i_84_ >= J.length)
						var_da.d(p[i_84_], gb[i_84_]);
					else
						var_da.d(p[i_84_], qn.l[0xff & J[i_84_]]);
				}
			}
			if (nb != null) {
				for (int i_85_ = 0; i_85_ < nb.length; i_85_++)
					var_da.DA(nb[i_85_], b[i_85_]);
			}
			if (ib != 0)
				var_da.a(e, l, H, ib & 0xff);
			var_da.SA(i_40_);
			synchronized (((Class_lb) ((NPCDef) this).db).n) {
				((Class_lb) ((NPCDef) this).db).n
						.put(
								(long) ((((Class_r) class_r).b << 16) | ((NPCDef) this).npcID),
								var_da, 1);
			}
		}
		da var_da_86_ = var_da.a((byte) 4, i_40_, true);
		if (!bool)
			return var_da_86_;
		if (i_35_ != 13770)
			a((int) -62, null);
		int i_87_ = 0;
		int i_88_ = 1;
		for (/**/; i_87_ < i_45_; i_87_++) {
			if (qc.a[i_87_] != null)
				var_da_86_.a((byte) 121, lu.l[i_87_], Animable.r[i_87_] - 1, 0,
						Class_mc.l[i_87_], S[i_87_], i_88_, vs.A[i_87_],
						((dr) wd.y[i_87_]).n, aaa.u[i_87_], qc.a[i_87_]);
			i_88_ <<= 1;
		}
		if (var_wa != null && var_wa_59_ != null)
			var_da_86_.a(var_wa_55_, i_52_, var_wa_60_, i_34_ - 1, i_53_,
					var_wa_59_, i_58_, ((dr) var_dr_37_).a, i_31_ - 1, i_54_,
					((dr) var_dr).n | ((dr) var_dr_37_).n, i_56_, var_wa,
					i_35_ - 13862, i_57_);
		else if (var_wa == null) {
			if (var_wa_59_ != null)
				var_da_86_.a(((dr) var_dr).n, (byte) -11, var_wa_59_, i_57_,
						i_56_, var_wa_60_, i_31_ - 1, 0, i_58_);
		} else
			var_da_86_.a(((dr) var_dr_37_).n, (byte) -11, var_wa, i_53_, i_52_,
					var_wa_55_, i_34_ - 1, 0, i_54_);
		for (int i_89_ = 0; i_89_ < i_45_; i_89_++) {
			qc.a[i_89_] = null;
			lu.l[i_89_] = null;
			wd.y[i_89_] = null;
		}
		if (jb != 128 || kb != 128)
			var_da_86_.R(jb, kb, jb);
		var_da_86_.SA(i_38_);
		return var_da_86_;
	}

	final da a(haa var_haa, int i, byte i_90_, dr var_dr, int i_91_, hl var_hl,
			int i_92_, Class_r class_r, int i_93_) {
		k++;
		if (((NPCDef) this).L != null) {
			NPCDef var_du_94_ = a(-4261, var_haa);
			if (var_du_94_ == null)
				return null;
			return var_du_94_.a(var_haa, i, (byte) 71, var_dr, i_91_, var_hl,
					i_92_, class_r, i_93_);
		}
		if (zb == null)
			return null;
		int i_95_ = i;
		if (var_dr != null && (i_93_ ^ 0xffffffff) != 0)
			i_95_ |= var_dr.a(1024, i_91_, true, i_93_);
		da var_da;
		synchronized (((Class_lb) ((NPCDef) this).db).p) {
			var_da = ((da) ((Class_lb) ((NPCDef) this).db).p
					.get(
							(long) ((((Class_r) class_r).b) << 16 | ((NPCDef) this).npcID),
							(byte) 100));
		}
		if (var_da == null || i_95_ != (var_da.PA() & i_95_)) {
			if (var_da != null)
				i_95_ |= var_da.PA();
			int i_96_ = i_95_;
			boolean bool = false;
			synchronized (((Class_lb) ((NPCDef) this).db).e) {
				for (int i_97_ = 0; zb.length > i_97_; i_97_++) {
					if (!((Class_lb) ((NPCDef) this).db).e.a(0, (byte) 120,
							zb[i_97_]))
						bool = true;
				}
			}
			if (bool)
				return null;
			eg[] var_egs = new eg[zb.length];
			synchronized (((Class_lb) ((NPCDef) this).db).e) {
				for (int i_98_ = 0; zb.length > i_98_; i_98_++)
					var_egs[i_98_] = efa.a(zb[i_98_],
							((Class_lb) ((NPCDef) this).db).e, 0, false);
			}
			for (int i_99_ = 0; i_99_ < zb.length; i_99_++) {
				if (var_egs[i_99_] != null && ((eg) var_egs[i_99_]).bb < 13)
					var_egs[i_99_].a((byte) -107, 2);
			}
			eg var_eg;
			if (var_egs.length != 1)
				var_eg = new eg(var_egs, var_egs.length);
			else
				var_eg = var_egs[0];
			if (p != null)
				i_96_ |= 0x4000;
			if (nb != null)
				i_96_ |= 0x8000;
			if (ib != 0)
				i_96_ |= 0x80000;
			var_da = class_r.a(var_eg, i_96_,
					((Class_lb) ((NPCDef) this).db).q, 64, 768);
			if (p != null) {
				for (int i_100_ = 0; p.length > i_100_; i_100_++) {
					if (J != null && J.length > i_100_)
						var_da.d(p[i_100_], qn.l[J[i_100_] & 0xff]);
					else
						var_da.d(p[i_100_], gb[i_100_]);
				}
			}
			if (nb != null) {
				for (int i_101_ = 0; i_101_ < nb.length; i_101_++)
					var_da.DA(nb[i_101_], b[i_101_]);
			}
			if (ib != 0)
				var_da.a(e, l, H, 0xff & ib);
			var_da.SA(i_95_);
			synchronized (((Class_lb) ((NPCDef) this).db).p) {
				((Class_lb) ((NPCDef) this).db).p
						.put(
								(long) ((((Class_r) class_r).b << 16) | ((NPCDef) this).npcID),
								var_da, 1);
			}
		}
		if (var_dr != null && i_93_ != -1)
			var_da = var_dr.a(i_93_, i_95_, (byte) 123, i_92_, i_91_, var_da);
		var_da.SA(i);
		if (i_90_ != 71)
			return null;
		return var_da;
	}

	static final void a(boolean bool) {
		em.c.d(2);
		o++;
		hj.h.d(2);
		bfa var_bfa = (bfa) oba.I.a((int) 123);
		if (bool != true)
			g = null;
		for (/**/; var_bfa != null; var_bfa = (bfa) oba.I.b((byte) 54)) {
			int i = ((bfa) var_bfa).v;
			if (i < 1000) {
				var_bfa.unlink(-55);
				if (i != 30 && i != 19 && i != 20 && i != 48 && i != 4
						&& i != 2 && i != 45)
					em.c.b(var_bfa, (byte) 93);
				else
					hj.h.b(var_bfa, (byte) 93);
			}
		}
		em.c.a((byte) -84, oba.I);
		hj.h.a((byte) -84, oba.I);
		if (mu.j <= 1)
			um.b = null;
		else if (vh.a && uc.c.a((byte) -68, (int) 81) && mu.j > 2)
			um.b = (bfa) ((Node) ((Node) ((Class_ae) oba.I).o).next).next;
		else
			um.b = (bfa) ((Node) ((Class_ae) oba.I).o).next;
		int i = -1;
		ew var_ew = (ew) qt.F.a((int) 101);
		if (var_ew != null)
			i = var_ew.b(false);
		if (!gea.n) {
			if (i == 0 && (ik.r == 1 && mu.j > 2 || pl.c(false)))
				i = 2;
			if (i == 2 && mu.j > 0 && var_ew != null) {
				if (kr.a != null || bg.e != 0)
					Class_ad.h = 2;
				else
					Connection.a(var_ew.a(9), var_ew.a(true), -11387);
			}
			if (i == 0 && mu.j > 0)
				iga.b(2);
			if (kr.a == null && bg.e == 0) {
				Class_ad.h = 0;
				ej.q = null;
			}
		} else {
			if ((i ^ 0xffffffff) == 0) {
				int i_102_ = Class_md.e.d(2000);
				int i_103_ = Class_md.e.b((int) 100);
				if (i_102_ < mr.a - 10 || i_102_ > mr.a + 10 + aw.l
						|| i_103_ < hn.b - 10 || hn.b - (-lfa.r - 10) < i_103_)
					eq.b(-8234);
			}
			if (i == 0) {
				int i_104_ = mr.a;
				int i_105_ = hn.b;
				int i_106_ = aw.l;
				int i_107_ = var_ew.a(9);
				int i_108_ = var_ew.a(true);
				int i_109_ = -1;
				for (int i_110_ = 0; i_110_ < mu.j; i_110_++) {
					if (lq.hb) {
						int i_111_ = i_105_ + 33 + (mu.j - (i_110_ + 1)) * 16;
						if (i_104_ < i_107_ && i_107_ < i_106_ + i_104_
								&& i_111_ - 13 < i_108_ && i_108_ < i_111_ + 4)
							i_109_ = i_110_;
					} else {
						int i_112_ = 16 * (mu.j - 1 - i_110_) + i_105_ + 31;
						if (i_107_ > i_104_ && i_106_ + i_104_ > i_107_
								&& i_112_ - 13 < i_108_ && i_112_ + 3 > i_108_)
							i_109_ = i_110_;
					}
				}
				if (i_109_ != -1) {
					int i_113_ = 0;
					sq var_sq = new sq(oba.I);
					for (bfa var_bfa_114_ = (bfa) var_sq.b(102); var_bfa_114_ != null; var_bfa_114_ = (bfa) var_sq
							.a(-15840)) {
						if (i_113_ == i_109_)
							un.a(0, i_108_, var_bfa_114_, i_107_);
						i_113_++;
					}
				}
				eq.b(-8234);
			}
		}
	}

	final boolean a(byte i) {
		W++;
		int i_115_ = 54 / ((72 - i) / 47);
		if (((NPCDef) this).L == null) {
			if ((((NPCDef) this).lb ^ 0xffffffff) == 0
					&& ((NPCDef) this).t == -1
					&& (((NPCDef) this).sb ^ 0xffffffff) == 0)
				return false;
			return true;
		}
		for (int i_116_ = 0; i_116_ < ((NPCDef) this).L.length; i_116_++) {
			if ((((NPCDef) this).L[i_116_] ^ 0xffffffff) != 0) {
				NPCDef var_du_117_ = ((NPCDef) this).db.getNPCDef(
						((NPCDef) this).L[i_116_], (byte) -116);
				if (((NPCDef) var_du_117_).lb != -1
						|| ((NPCDef) var_du_117_).t != -1
						|| ((NPCDef) var_du_117_).sb != -1)
					return true;
			}
		}
		return false;
	}

	final int a(int i, int i_118_, boolean bool) {
		if (bool != false)
			l = (byte) -116;
		r++;
		if (wb == null)
			return i;
		GameInPacketHandler var_hda = (GameInPacketHandler) wb.a(-32748,
				(long) i_118_);
		if (var_hda == null)
			return i;
		return ((GameInPacketHandler) var_hda).k;
	}

	public NPCDef() {
		((NPCDef) this).f = true;
		((NPCDef) this).t = -1;
		((NPCDef) this).z = -1;
		((NPCDef) this).h = 255;
		((NPCDef) this).x = -1;
		((NPCDef) this).q = false;
		((NPCDef) this).D = (byte) -1;
		((NPCDef) this).y = (byte) 0;
		((NPCDef) this).N = false;
		P = -1;
		((NPCDef) this).X = -1;
		((NPCDef) this).T = -1;
		((NPCDef) this).ab = -1;
		((NPCDef) this).B = -1;
		u = -1;
		((NPCDef) this).E = -1;
		((NPCDef) this).Q = 1;
		((NPCDef) this).a = -1;
		((NPCDef) this).V = (short) 0;
		Y = 0;
		((NPCDef) this).i = -1;
		eb = 0;
		((NPCDef) this).lb = -1;
		((NPCDef) this).pb = 0;
		((NPCDef) this).n = (byte) -96;
		jb = 128;
		((NPCDef) this).ob = true;
		((NPCDef) this).rb = (short) 0;
		((NPCDef) this).mb = -1;
		((NPCDef) this).bb = -1;
		ib = (byte) 0;
		kb = 128;
		((NPCDef) this).qb = (byte) -16;
		((NPCDef) this).npcName = "null";
		((NPCDef) this).ub = false;
		((NPCDef) this).combatLevel = -1;
		((NPCDef) this).sb = -1;
		((NPCDef) this).O = -1;
		((NPCDef) this).U = 32;
		((NPCDef) this).fb = true;
		((NPCDef) this).yb = -1;
		((NPCDef) this).Z = (byte) 4;
		((NPCDef) this).xb = -1;
	}
}
