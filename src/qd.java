/* qd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qd
{
    static int a;
    boolean b;
    static int c;
    private int d;
    boolean e;
    static int f;
    short[] g;
    private int h;
    static int i;
    static int j;
    static int k;
    int l;
    gga m;
    private int n;
    int o;
    static il p = new il(16);
    private int q;
    private int r;
    private static char[] s = new char[64];
    static int t;
    static GameInPacket incomingPacket4;
    static int v;
    static int[] w;
    static float x;
    
    final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	n = i;
	d = i_1_;
	j++;
	r = i_0_;
	h = i_3_;
	if (i_2_ != 10236)
	    a(-3, -71, 122, 67, 47);
    }
    
    private final void a(int i) {
	int i_4_ = ((qd) this).l;
    while_150_:
	do {
	while_149_:
	    do {
	    while_148_:
		do {
		while_147_:
		    do {
		    while_146_:
			do {
			while_145_:
			    do {
			    while_144_:
				do {
				while_143_:
				    do {
				    while_142_:
					do {
					while_141_:
					    do {
					    while_140_:
						do {
						while_139_:
						    do {
						    while_138_:
							do {
							while_137_:
							    do {
								do {
								    if (i_4_
									!= 2) {
									if (i_4_
									    != 3) {
									    if (i_4_ != 4) {
										if (i_4_ != 5) {
										    if (i_4_ != 12) {
											if (i_4_ != 13) {
											    if (i_4_ != 10) {
												if (i_4_ != 11) {
												    if (i_4_ != 6) {
													if (i_4_ != 7) {
													    if (i_4_ != 8) {
														if (i_4_ != 9) {
														    if (i_4_ != 14) {
															if (i_4_ != 15) {
															    if (i_4_ == 16)
																break while_148_;
															    break while_149_;
															}
														    } else
															break while_146_;
														    break while_147_;
														}
													    } else
														break while_144_;
													    break while_145_;
													}
												    } else
													break while_142_;
												    break while_143_;
												}
											    } else
												break while_140_;
											    break while_141_;
											}
										    } else
											break while_138_;
										    break while_139_;
										}
									    } else
										break;
									    break while_137_;
									}
								    } else {
									h = 1;
									d = 2048;
									n = 0;
									r = 2048;
									break while_150_;
								    }
								    d = 2048;
								    h = 1;
								    r = 4096;
								    n = 0;
								    break while_150_;
								} while (false);
								d = 2048;
								n = 0;
								h = 4;
								r = 2048;
								break while_150_;
							    } while (false);
							    r = 8192;
							    n = 0;
							    h = 4;
							    d = 2048;
							    break while_150_;
							} while (false);
							r = 2048;
							n = 0;
							d = 2048;
							h = 2;
							break while_150_;
						    } while (false);
						    r = 8192;
						    h = 2;
						    d = 2048;
						    n = 0;
						    break while_150_;
						} while (false);
						d = 512;
						h = 3;
						r = 2048;
						n = 1536;
						break while_150_;
					    } while (false);
					    r = 4096;
					    n = 1536;
					    h = 3;
					    d = 512;
					    break while_150_;
					} while (false);
					r = 2048;
					h = 3;
					d = 768;
					n = 1280;
					break while_150_;
				    } while (false);
				    h = 3;
				    n = 1280;
				    r = 4096;
				    d = 768;
				    break while_150_;
				} while (false);
				r = 2048;
				d = 1024;
				h = 3;
				n = 1024;
				break while_150_;
			    } while (false);
			    n = 1024;
			    h = 3;
			    r = 4096;
			    d = 1024;
			    break while_150_;
			} while (false);
			h = 1;
			n = 1280;
			r = 2048;
			d = 768;
			break while_150_;
		    } while (false);
		    d = 512;
		    n = 1536;
		    h = 1;
		    r = 4096;
		    break while_150_;
		} while (false);
		h = 1;
		n = 1792;
		d = 256;
		r = 8192;
		break while_150_;
	    } while (false);
	    d = 2048;
	    r = 2048;
	    h = 0;
	    n = 0;
	} while (false);
	k++;
	if (i != -18971)
	    q = 67;
    }
    
    private final void a(byte i, Class_r class_r, int i_5_, int i_6_, int i_7_,
			 int i_8_, int i_9_) {
	int i_10_ = 52 / ((i + 26) / 62);
	qd.i++;
	((qd) this).m = class_r.a(i_7_, i_8_, i_9_, i_6_, i_5_, 1.0F);
    }
    
    final void a(boolean bool, int i, boolean bool_11_) {
	f++;
	if (bool != false)
	    ((qd) this).g = null;
	int i_12_;
    while_154_:
	do {
	    if (bool_11_)
		i_12_ = 2048;
	    else {
		int i_13_ = q + r * i / 50 & 0x7ff;
		int i_14_ = h;
	    while_153_:
		do {
		while_152_:
		    do {
		    while_151_:
			do {
			    do {
				if (i_14_ != 1) {
				    if (i_14_ != 3) {
					if (i_14_ != 4) {
					    if (i_14_ != 2) {
						if (i_14_ == 5)
						    break while_152_;
						break while_153_;
					    }
					} else
					    break;
					break while_151_;
				    }
				} else {
				    i_12_ = (GameInPacket.h[i_13_ << 3] >> 4) + 1024;
				    break while_154_;
				}
				i_12_ = nda.j[i_13_] >> 1;
				break while_154_;
			    } while (false);
			    i_12_ = i_13_ >> 10 << 11;
			    break while_154_;
			} while (false);
			i_12_ = i_13_;
			break while_154_;
		    } while (false);
		    i_12_ = (i_13_ < 1024 ? i_13_ : -i_13_ + 2048) << 1;
		    break while_154_;
		} while (false);
		i_12_ = 2048;
	    }
	} while (false);
	((qd) this).m.a(0, (float) (n + (i_12_ * d >> 11)) / 2048.0F);
    }
    
    static final void a(byte i, Interface var_kp) {
	c++;
	if (i > -90)
	    x = 1.1969491F;
	Interface var_kp_15_ = bca.a((byte) 124, var_kp);
	int i_16_;
	int i_17_;
	if (var_kp_15_ != null) {
	    i_16_ = ((Interface) var_kp_15_).minHScroll;
	    i_17_ = ((Interface) var_kp_15_).minVScroll;
	} else {
	    i_16_ = ff.width;
	    i_17_ = eh.height;
	}
	Class_ic.a(i_17_, var_kp, 23054, false, i_16_);
	mga.a(i_17_, i_16_, (byte) -72, var_kp);
    }
    
    protected qd() {
	if (nda.j == null)
	    oea.j(-12296);
	a(-18971);
    }
    
    public static void b(int i) {
	w = null;
	s = null;
	p = null;
	int i_18_ = -75 / ((56 - i) / 55);
	incomingPacket4 = null;
    }
    
    qd(Class_r class_r, BytesParser var_es, int i) {
	if (nda.j == null)
	    oea.j(-12296);
	((qd) this).o = var_es.readUnsignedByte(-9268);
	((qd) this).e = (0x10 & ((qd) this).o) != 0;
	((qd) this).b = (0x8 & ((qd) this).o) != 0;
	((qd) this).o = 0x7 & ((qd) this).o;
	int i_19_ = var_es.readShort(13111) << i;
	int i_20_ = var_es.readShort(13111) << i;
	int i_21_ = var_es.readShort(13111) << i;
	int i_22_ = var_es.readUnsignedByte(-9268);
	int i_23_ = 2 * i_22_ + 1;
	((qd) this).g = new short[i_23_];
	for (int i_24_ = 0; i_24_ < ((qd) this).g.length; i_24_++) {
	    int i_25_ = (short) var_es.readShort(13111);
	    int i_26_ = i_25_ >>> 8;
	    int i_27_ = 0xff & i_25_;
	    if (i_26_ >= i_23_)
		i_26_ = i_23_ - 1;
	    if (i_23_ - i_26_ < i_27_)
		i_27_ = i_23_ - i_26_;
	    ((qd) this).g[i_24_] = (short) hba.bitwiseArg1ORArg2(i_26_ << 8, i_27_);
	}
	i_22_ = (i_22_ << Class_fb.a) + dba.k;
	int i_28_ = (ji.j != null ? ji.j[var_es.readShort(13111)]
		     : vq.m[0xffff & pg.a(0, var_es.readShort(13111))]);
	int i_29_ = var_es.readUnsignedByte(-9268);
	q = i_29_ << 3 & 0x700;
	((qd) this).l = 0x1f & i_29_;
	if (((qd) this).l != 31)
	    a(-18971);
	a((byte) -90, class_r, i_28_, i_22_, i_19_, i_21_, i_20_);
    }
    
    static final void a(Interface var_kp, int i) {
	a++;
	if (ba.c) {
	    if (((Interface) var_kp).zb != null) {
		Interface var_kp_30_ = ida.a(tm.t, qda.G, (byte) 123);
		if (var_kp_30_ != null) {
		    ClientScript var_mea = new ClientScript();
		    ((ClientScript) var_mea).objects = ((Interface) var_kp).zb;
		    ((ClientScript) var_mea).interface_1 = var_kp_30_;
		    ((ClientScript) var_mea).interface_ = var_kp;
		    ClientScriptHandler.activateClientScript(var_mea);
		}
	    }
	    at.F++;
	    if (i != 23687)
		v = 91;
	    tba var_tba = jga.sendGameOutPacket(cs.f, pca.isaac, (byte) 101);
	    ((tba) var_tba).loginStream.writeInt(((Interface) var_kp).interfaceID, i ^ ~0x5ce5);
	    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(i ^ 0x5c07, ((Interface) var_kp).itemIndex);
	    ((tba) var_tba).loginStream.writeShort(qda.G, 13469);
	    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, th.i);
	    ((tba) var_tba).loginStream.writeIntReversed(13412, tm.t);
	    ((tba) var_tba).loginStream.writeShortReversedPlus128(-126, ((Interface) var_kp).itemID);
	    ud.a(var_tba, (byte) -36);
	}
    }
    
    static {
	for (int i = 0; i < 26; i++)
	    s[i] = (char) (i + 65);
	for (int i = 26; i < 52; i++)
	    s[i] = (char) (i - 26 + 97);
	for (int i = 52; i < 62; i++)
	    s[i] = (char) (i - 4);
	s[63] = '/';
	s[62] = '+';
	incomingPacket4 = new GameInPacket(4, 2);
	w = new int[3];
    }
}
