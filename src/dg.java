/* dg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagex3.jagmisc.jagmisc;

final class dg extends jb
{
    static int gb;
    static int hb;
    static int ib;
    int jb;
    static int kb;
    static int lb;
    static int mb;
    boolean nb = false;
    static int[] ob = { 0, 1, 2, 3, 4, 5, 6, 14 };
    static int pb;
    boolean qb = false;
    static int rb;
    static int sb;
    static int tb;
    static int ub;
    static int vb;
    static int wb;
    boolean xb = false;
    static int yb;
    static int zb;
    static int Ab;
    static int Bb;
    static int Cb = -1;
    boolean Db = false;
    static int Eb;
    static int Fb;
    static int Gb;
    boolean Hb = false;
    static int Ib;
    static int Jb;
    
    private final int c(int i, int i_0_) {
	if (i >= -35)
	    ((dg) this).qb = false;
	wb++;
	int i_1_;
	if (i_0_ > 12000) {
	    i_1_ = 4;
	    c((int) 124);
	} else if (i_0_ > 5000) {
	    a(-29520);
	    i_1_ = 3;
	} else if (i_0_ <= 2000) {
	    i_1_ = 1;
	    a(true, (byte) -89);
	} else {
	    a(false);
	    i_1_ = 2;
	}
	if (on.performance != 2) {
	    ((jb) this).M = 2;
	    ur.a(2, true);
	}
	a(nda.signlink, (byte) 101);
	return i_1_;
    }
    
    private final void a(byte i) {
	if (i != -126)
	    Cb = 21;
	if (uf.h <= 1)
	    ((jb) this).x = 2;
	else
	    ((jb) this).x = 4;
	ib++;
    }
    
    private final int b(boolean bool, int i, int i_2_) {
	if (bool != false)
	    b((byte) -121);
	Gb++;
	int i_3_;
	if (i <= 20000) {
	    if (i <= 10000) {
		if (i <= 5000) {
		    i_3_ = 1;
		    a(true, (byte) -91);
		} else {
		    i_3_ = 2;
		    a(false);
		}
	    } else {
		i_3_ = 3;
		a(-29520);
	    }
	} else {
	    c((int) 112);
	    i_3_ = 4;
	}
	if (on.performance != i_2_) {
	    ((jb) this).M = i_2_;
	    ur.a(i_2_, true);
	}
	a(nda.signlink, (byte) 92);
	return i_3_;
    }
    
    static final int b(int i, int i_4_, int i_5_) {
	if (i_5_ != -11)
	    b((byte) 31);
	vb++;
	int i_6_ = 57 * i + i_4_;
	i_6_ ^= i_6_ << 13;
	int i_7_ = (i_6_ * (i_6_ * (i_6_ * 15731) + 789221) + 1376312589
		    & 0x7fffffff);
	return (0x7f9daa3 & i_7_) >> 19;
    }
    
    final void a(int i) {
	if (i == -29520) {
	    rb++;
	    a(true, 1000);
	    ((jb) this).k = true;
	    ((jb) this).v = false;
	    ((jb) this).O = ((jb) this).G = 1;
	    ((jb) this).p = true;
	    ((jb) this).y = true;
	    ((jb) this).T = true;
	    ((jb) this).R = true;
	    ((jb) this).B = true;
	    ((jb) this).K = true;
	    ((jb) this).q = 1;
	    ((jb) this).t = true;
	    ((jb) this).S = ((jb) this).Z = 0;
	    ((jb) this).L = false;
	    ((jb) this).ab = true;
	    if (qm.heapSize > 95)
		pda.d(0, 1);
	    else
		pda.d(i + 29520, 0);
	    ((jb) this).Q = true;
	    ((jb) this).m = 0;
	    ((jb) this).cb = false;
	    a((byte) -126);
	    a((byte) 106, (int) 1);
	    ((jb) this).X = 3;
	    bca.a((byte) 112);
	    Class_ad.b(-32);
	}
    }
    
    final boolean d(int i, int i_8_) {
	Ib++;
	if (i_8_ != -2)
	    return true;
	if (i != 0)
	    return true;
	return ((jb) this).C;
    }
    
    static final rc[] b(int i) {
	Bb++;
	if (i < 13)
	    return null;
	return new rc[] { oh.c, lf.b, tda.b };
    }
    
    public static void b(byte i) {
	if (i == 5)
	    ob = null;
    }
    
    private final void a(BytesParser var_es, boolean bool) {
	tb++;
	if (((BytesParser) var_es).bytes.length - ((BytesParser) var_es).pos >= 1) {
	    int i = var_es.readUnsignedByte(-9268);
	    if (i >= 0 && i <= 22) {
		int i_9_;
		if (i == 22)
		    i_9_ = 45;
		else if (i == 21)
		    i_9_ = 44;
		else if (i == 20)
		    i_9_ = 43;
		else if (i == 19)
		    i_9_ = 42;
		else if (i != 18) {
		    if (i != 17) {
			if (i != 16) {
			    if (i != 15) {
				if (i == 14)
				    i_9_ = 36;
				else if (i != 13) {
				    if (i == 12)
					i_9_ = 34;
				    else if (i == 11)
					i_9_ = 33;
				    else if (i == 10)
					i_9_ = 32;
				    else if (i != 9) {
					if (i != 8) {
					    if (i == 7)
						i_9_ = 29;
					    else if (i == 6)
						i_9_ = 28;
					    else if (i == 5)
						i_9_ = 28;
					    else if (i == 4)
						i_9_ = 24;
					    else if (i != 3) {
						if (i == 2)
						    i_9_ = 22;
						else if (i == 1)
						    i_9_ = 23;
						else
						    i_9_ = 19;
					    } else
						i_9_ = 23;
					} else
					    i_9_ = 30;
				    } else
					i_9_ = 31;
				} else
				    i_9_ = 35;
			    } else
				i_9_ = 37;
			} else
			    i_9_ = 38;
		    } else
			i_9_ = 40;
		} else
		    i_9_ = 41;
		if (bool != false)
		    zb = 48;
		if (i_9_ <= ((BytesParser) var_es).bytes.length - ((BytesParser) var_es).pos) {
		    ((jb) this).db = var_es.readUnsignedByte(-9268);
		    if (((jb) this).db >= 1) {
			if (((jb) this).db > 4)
			    ((jb) this).db = 4;
		    } else
			((jb) this).db = 1;
		    a(var_es.readUnsignedByte(-9268) == 1, 1000);
		    ((jb) this).R = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).ab = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).K = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).q = var_es.readUnsignedByte(-9268) == 1 ? 1 : 0;
		    ((jb) this).y = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).B = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).t = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).O = var_es.readUnsignedByte(-9268);
		    if (((jb) this).O > 2)
			((jb) this).O = 2;
		    if (i >= 17)
			((jb) this).G = var_es.readUnsignedByte(-9268);
		    if (i < 2) {
			((jb) this).T = var_es.readUnsignedByte(-9268) == 1;
			var_es.readUnsignedByte(-9268);
		    } else {
			((jb) this).T = var_es.readUnsignedByte(-9268) == 1;
			if (i >= 17)
			    ((jb) this).v = var_es.readUnsignedByte(-9268) == 1;
		    }
		    ((jb) this).L = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).p = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).S = var_es.readUnsignedByte(-9268);
		    if (((jb) this).S > 2)
			((jb) this).S = 2;
		    ((jb) this).Z = ((jb) this).S;
		    ((jb) this).s = var_es.readUnsignedByte(-9268) == 1;
		    ((jb) this).I = var_es.readUnsignedByte(-9268);
		    if (((jb) this).I > 127)
			((jb) this).I = 127;
		    if (i < 20)
			((jb) this).P = ((jb) this).I;
		    else {
			((jb) this).P = var_es.readUnsignedByte(-9268);
			if (((jb) this).P > 127)
			    ((jb) this).P = 127;
		    }
		    ((jb) this).N = var_es.readUnsignedByte(-9268);
		    ((jb) this).Y = var_es.readUnsignedByte(-9268);
		    if (((jb) this).Y > 127)
			((jb) this).Y = 127;
		    if (i >= 21) {
			((jb) this).V = var_es.readUnsignedByte(-9268);
			if (((jb) this).V > 127)
			    ((jb) this).V = 127;
		    } else
			((jb) this).V = ((jb) this).N;
		    if (i >= 1) {
			((jb) this).W = var_es.readShort(13111);
			((jb) this).F = var_es.readShort(13111);
		    }
		    if (i >= 3 && i < 6)
			var_es.readUnsignedByte(-9268);
		    if (i >= 4) {
			int i_10_ = var_es.readUnsignedByte(-9268);
			if (i_10_ < 0 || i_10_ > 2)
			    i_10_ = 0;
			if (qm.heapSize < 96)
			    i_10_ = 0;
			pda.d(0, i_10_);
		    }
		    if (i >= 5)
			((jb) this).l = var_es.readInt(97);
		    int i_11_ = 0;
		    if (i >= 6)
			((jb) this).w = i_11_ = var_es.readUnsignedByte(-9268);
		    if (((jb) this).w != 1 && ((jb) this).w != 2)
			((jb) this).w = 2;
		    if (i >= 7)
			((jb) this).A = var_es.readUnsignedByte(-9268) == 1;
		    if (i >= 8)
			((jb) this).n = var_es.readUnsignedByte(-9268) == 1;
		    if (i >= 9)
			((jb) this).m = var_es.readUnsignedByte(-9268);
		    if (((jb) this).m < 0
			|| ((jb) this).m > Class_g.a(-93, qm.heapSize))
			((jb) this).m = 0;
		    if (i >= 10)
			((jb) this).cb = var_es.readUnsignedByte(-9268) != 0;
		    if (i >= 11)
			((jb) this).J = var_es.readUnsignedByte(-9268) != 0;
		    if (i >= 12)
			((jb) this).q = var_es.readUnsignedByte(-9268);
		    if (((jb) this).q < 0 || ((jb) this).q > 2)
			((jb) this).q = 1;
		    if (i >= 13)
			((jb) this).Q = var_es.readUnsignedByte(-9268) == 1;
		    if (i < 14) {
			if (i_11_ == 0)
			    ((jb) this).M = 2;
			else
			    ((jb) this).M = 1;
		    } else
			((jb) this).M = var_es.readUnsignedByte(-9268);
		    if (((jb) this).M < 0 || ((jb) this).M > 5)
			((jb) this).M = 2;
		    if (i >= 15) {
			((jb) this).x = var_es.readUnsignedByte(-9268);
			if (((jb) this).x < 0 || ((jb) this).x > 4)
			    ((jb) this).x = uf.h != 1 ? 4 : 2;
		    }
		    if (i >= 16) {
			((jb) this).k = var_es.readUnsignedByte(-9268) == 1;
			try {
			    if (jagmisc.getTotalPhysicalMemory() <= 268435456L)
				((jb) this).k = false;
			} catch (Throwable throwable) {
			    /* empty */
			}
		    }
		    if (i < 17 && ((jb) this).M == 0)
			((jb) this).M = 2;
		    if (i >= 18) {
			((jb) this).X = var_es.readUnsignedByte(-9268);
			if (((jb) this).X < 0 || ((jb) this).X > 4)
			    ((jb) this).X = 0;
		    }
		    if (i >= 19)
			((jb) this).H = var_es.readUnsignedByte(-9268);
		    else if (((jb) this).X == 1 || ((jb) this).X == 2)
			((jb) this).H = 2;
		    else if (((jb) this).X != 3)
			((jb) this).H = 0;
		    else
			((jb) this).H = 1;
		    if (i >= 22)
			((jb) this).z = var_es.readUnsignedByte(-9268);
		    if (((jb) this).M == 0 && qm.heapSize < 96 && ((jb) this).X != 1
			&& ((jb) this).X != 0)
			a(false, (byte) -108);
		}
	    }
	}
    }
    
    final boolean e(int i, int i_12_) {
	Jb++;
	if (i_12_ <= 72)
	    Eb = 57;
	if (i != 0 || ((dg) this).Hb)
	    return true;
	return ((jb) this).C;
    }
    
    final int a(int i, byte i_13_) {
	sb++;
	int i_14_ = -77 / ((30 - i_13_) / 51);
	if (!iv.a(i, (byte) -59) || dn.a(113, hm.h))
	    return 0;
	if (qm.heapSize < 96 && mg.c(-1, i) && ((jb) this).H == 0)
	    return 1;
	return ((jb) this).H;
    }
    
    final int c(byte i) {
	pb++;
	boolean bool = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	if (((Signlink) nda.signlink).r && !((Signlink) nda.signlink).e) {
	    if (Signlink.osNameLowerCase.startsWith("win")) {
		if (!Signlink.osArch.startsWith("amd64") && !Signlink.osArch.startsWith("x86_64"))
		    bool = true;
		bool_16_ = true;
		bool_15_ = true;
	    } else
		bool_15_ = true;
	}
	if (((dg) this).Db)
	    bool = false;
	if (((dg) this).nb)
	    bool_16_ = false;
	if (((dg) this).xb)
	    bool_15_ = false;
	if (!bool && !bool_15_ && !bool_16_)
	    return i(0);
	int i_17_ = -1;
	int i_18_ = -1;
	int i_19_ = -1;
	if (bool) {
	    try {
		i_17_ = ItemDef.a(2, (byte) -113, 1000);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	do {
	    if (bool_16_) {
		try {
		    i_19_ = ItemDef.a(3, (byte) -104, 1000);
		    if (on.performance == 3) {
			GraphicsCard var_oa = lg.r.y();
			long l = 0xffffffffffffL & ((GraphicsCard) var_oa).driverVersion;
			int i_20_ = ((GraphicsCard) var_oa).vendor;
			if (i_20_ != 4318) {
			    if (i_20_ != 4098)
				break;
			} else {
			    bool_15_ = bool_15_ & l >= 64425238954L;
			    break;
			}
			bool_15_ = bool_15_ & l >= 60129613779L;
		    }
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	} while (false);
	if (bool_15_) {
	    try {
		i_18_ = ItemDef.a(1, (byte) -111, 1000);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if ((i_17_ ^ 0xffffffff) == 0 && i_18_ == -1 && i_19_ == -1)
	    return i(0);
	if (i <= 99)
	    return 81;
	i_18_ *= 1.1F;
	i_19_ *= 1.1F;
	if (i_19_ < i_17_ && i_18_ < i_17_)
	    return c(-81, i_17_);
	if (i_19_ <= i_18_)
	    return b(false, i_18_, 1);
	return b(false, i_19_, 3);
    }
    
    final void a(Signlink var_rj, byte i) {
	Fb++;
	FileOnDisk var_cu = null;
	try {
	    if (i <= 30)
		((dg) this).Hb = true;
	    vfa var_vfa = var_rj.a("", (byte) -28, true);
	    while (var_vfa.f == 0)
		Connection.a(-28448, 1L);
	    if (var_vfa.f == 1) {
		var_cu = (FileOnDisk) var_vfa.hostName;
		BytesParser var_es = new BytesParser(tm.d(4929));
		this.a(123, var_es);
		var_cu.write(0, (byte) 57, ((BytesParser) var_es).pos, ((BytesParser) var_es).bytes);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (var_cu == null)
		    break;
		var_cu.close((byte) -128);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    final void a(boolean bool) {
	hb++;
	a(true, 1000);
	((jb) this).t = false;
	((jb) this).T = false;
	((jb) this).k = false;
	((jb) this).K = false;
	((jb) this).y = false;
	((jb) this).B = false;
	((jb) this).q = 0;
	((jb) this).ab = true;
	((jb) this).v = false;
	((jb) this).L = false;
	((jb) this).S = ((jb) this).Z = 0;
	((jb) this).p = false;
	((jb) this).R = bool;
	((jb) this).O = ((jb) this).G = 0;
	pda.d(0, 0);
	((jb) this).m = 0;
	((jb) this).Q = true;
	((jb) this).cb = false;
	a((byte) -126);
	a((byte) 120, (int) 2);
	((jb) this).X = 2;
	bca.a((byte) 102);
	Class_ad.b(125);
    }
    
    final void a(byte i, int i_21_) {
	pda.v = null;
	up.I = true;
	yb++;
	if (i <= 103)
	    a(false, (int) -122);
	((jb) this).H = i_21_;
    }
    
    final void c(int i) {
	a(true, 1000);
	lb++;
	((jb) this).t = true;
	((jb) this).p = true;
	((jb) this).q = 1;
	((jb) this).O = ((jb) this).G = 2;
	((jb) this).y = true;
	((jb) this).B = true;
	((jb) this).T = true;
	((jb) this).k = true;
	((jb) this).L = true;
	((jb) this).R = true;
	((jb) this).v = true;
	((jb) this).ab = true;
	((jb) this).S = ((jb) this).Z = 0;
	((jb) this).K = true;
	int i_22_ = -30 / ((i - 59) / 50);
	if (qm.heapSize > 95)
	    pda.d(0, 2);
	else
	    pda.d(0, 0);
	((jb) this).Q = true;
	((jb) this).m = 0;
	((jb) this).cb = false;
	a((byte) -126);
	a((byte) 111, (int) 0);
	((jb) this).X = 4;
	bca.a((byte) 83);
	Class_ad.b(125);
    }
    
    final void a(boolean bool, int i) {
	mb++;
	((jb) this).C = bool;
	if (i == 1000) {
	    if (ul.k != null)
		ul.k.a(1, !e(on.performance, 74));
	}
    }
    
    final int f(int i, int i_23_) {
	int i_24_ = -109 % ((i - 1) / 57);
	kb++;
	if (((dg) this).qb)
	    return 0;
	if (!e(i_23_, 118))
	    return 1;
	if (((jb) this).R)
	    return 2;
	return 1;
    }
    
    private final int i(int i) {
	ub++;
	if (i != 0)
	    Cb = 1;
	int i_25_;
	if (qm.heapSize < 96) {
	    a(true, (byte) -120);
	    i_25_ = 1;
	} else {
	    int i_26_ = ur.a(i - 115);
	    if (i_26_ <= 100) {
		i_25_ = 4;
		c((int) 121);
	    } else if (i_26_ > 500) {
		if (i_26_ > 1000) {
		    i_25_ = 1;
		    a(true, (byte) -115);
		} else {
		    i_25_ = 2;
		    a(false);
		}
	    } else {
		a(-29520);
		i_25_ = 3;
	    }
	}
	if (on.performance != 0) {
	    ((jb) this).M = 0;
	    ur.a(0, true);
	}
	a(nda.signlink, (byte) 123);
	return i_25_;
    }
    
    final void a(boolean bool, byte i) {
	Ab++;
	a(false, 1000);
	((jb) this).q = 0;
	((jb) this).p = false;
	((jb) this).k = false;
	((jb) this).B = false;
	((jb) this).T = false;
	if (i >= -12)
	    gb = 86;
	((jb) this).y = false;
	((jb) this).S = ((jb) this).Z = 0;
	((jb) this).t = false;
	((jb) this).v = false;
	((jb) this).L = false;
	((jb) this).R = false;
	((jb) this).ab = false;
	((jb) this).K = false;
	((jb) this).O = ((jb) this).G = 0;
	pda.d(0, 0);
	((jb) this).cb = false;
	((jb) this).m = 0;
	((jb) this).Q = false;
	a((byte) -126);
	a((byte) 127, (int) 2);
	((jb) this).X = 1;
	if (bool)
	    bca.a((byte) 77);
	Class_ad.b(6);
    }
    
    dg(Signlink var_rj) {
	((jb) this).X = 3;
	((jb) this).db = 3;
	a(true, 1000);
	((jb) this).R = true;
	((jb) this).t = true;
	((jb) this).W = 0;
	((jb) this).S = 0;
	((jb) this).ab = true;
	((jb) this).L = true;
	((jb) this).p = true;
	((jb) this).q = 1;
	((jb) this).P = 127;
	((jb) this).N = 127;
	((jb) this).v = false;
	((jb) this).Z = 0;
	((jb) this).Y = 127;
	((jb) this).F = 0;
	((jb) this).K = true;
	((jb) this).B = true;
	((jb) this).V = 127;
	((jb) this).s = true;
	((jb) this).I = 127;
	((jb) this).O = 2;
	((jb) this).T = true;
	((jb) this).y = true;
	((jb) this).G = 0;
	if (qm.heapSize >= 96)
	    pda.d(0, 2);
	else
	    pda.d(0, 0);
	((jb) this).m = 0;
	((jb) this).x = uf.h != 1 ? 4 : 2;
	((jb) this).Q = true;
	((jb) this).cb = false;
	((jb) this).A = false;
	((jb) this).J = true;
	((jb) this).w = 2;
	((jb) this).l = 0;
	((jb) this).n = false;
	((jb) this).M = 2;
	((jb) this).H = 0;
	FileOnDisk var_cu = null;
	try {
	    vfa var_vfa = var_rj.a("", (byte) -28, true);
	    while (var_vfa.f == 0)
		Connection.a(-28448, 1L);
	    if (var_vfa.f == 1) {
		var_cu = (FileOnDisk) var_vfa.hostName;
		byte[] is = new byte[(int) var_cu.getLength((int) 0)];
		int i;
		for (int i_27_ = 0; i_27_ < is.length; i_27_ += i) {
		    i = var_cu.read(i_27_, is, is.length - i_27_, 3);
		    if (i == -1)
			throw new IOException("EOF");
		}
		a(new BytesParser(is), false);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (var_cu == null)
		    break;
		var_cu.close((byte) -127);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    static {
	zb = 0;
    }
}
