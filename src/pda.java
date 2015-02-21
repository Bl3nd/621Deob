/* pda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pda extends ur
{
    static int h;
    static int i;
    static int[] j;
    private int k;
    private ft l;
    private int m = 0;
    private byte[] n;
    static int o;
    static int p;
    static Object q;
    static int r;
    static int s;
    private int t;
    private ds u;
    static ro[] v;
    static int w;
    static int x;
    static int y = -1;
    static int[] z;
    static int A;
    private lf B;
    static int C;
    private il D = new il(16);
    private int E;
    static int F;
    private byte[] G;
    private uaa H;
    static int I;
    static float J;
    static int K;
    static int L;
    private th M;
    private lf N;
    private boolean O;
    private Class_ae P;
    private int Q = 0;
    private Class_ae R;
    private boolean S;
    private boolean T;
    private long U;
    
    final int c(byte i) {
	K++;
	if (i < 57)
	    d(16, -68);
	if (a((byte) -14) == null) {
	    if (l == null)
		return 0;
	    return l.b((byte) -69);
	}
	return 100;
    }
    
    final void d(byte i) {
	p++;
	if (i != -95)
	    Q = 56;
	if (N != null) {
	    S = true;
	    if (R == null)
		R = new Class_ae();
	}
    }
    
    final void b(int i) {
	pda.i++;
	if (R != null && a((byte) -14) != null) {
	    for (Node class_d = P.a((int) 118); class_d != null;
		 class_d = P.b((byte) 69)) {
		int i_0_ = (int) ((Node) class_d).nodeID;
		if (i_0_ < 0 || ((ds) u).f <= i_0_ || ((ds) u).r[i_0_] == 0)
		    class_d.unlink(-122);
		else {
		    if (G[i_0_] == 0)
			a(i_0_, 112, 1);
		    if (G[i_0_] == -1)
			a(i_0_, -103, 2);
		    if (G[i_0_] == 1)
			class_d.unlink(-127);
		}
	    }
	    if (i > -102)
		d((byte) -34);
	}
    }
    
    private final ft a(int i, int i_1_, int i_2_) {
	w++;
	ft var_ft = (ft) D.a(-32748, (long) i);
	int i_3_ = -48 % ((i_1_ - 8) / 47);
	if (var_ft != null && i_2_ == 0 && !((ft) var_ft).u
	    && ((ft) var_ft).x) {
	    var_ft.unlink(-39);
	    var_ft = null;
	}
	if (var_ft == null) {
	    if (i_2_ != 0) {
		if (i_2_ == 1) {
		    if (N == null)
			throw new RuntimeException();
		    var_ft = M.a(i, -121, N);
		} else if (i_2_ == 2) {
		    if (N == null)
			throw new RuntimeException();
		    if (G[i] != -1)
			throw new RuntimeException();
		    if (H.d(90))
			return null;
		    var_ft = H.a(i, t, 4, false, (byte) 2);
		} else
		    throw new RuntimeException();
	    } else if (N == null || G[i] == -1) {
		if (H.e(26555))
		    return null;
		var_ft = H.a(i, t, 4, true, (byte) 2);
	    } else
		var_ft = M.a(8217, N, i);
	    D.a(var_ft, (byte) -59, (long) i);
	}
	if (((ft) var_ft).x)
	    return null;
	byte[] is = var_ft.d((byte) 114);
	if (!(var_ft instanceof Class_kf)) {
	    try {
		if (is == null || is.length <= 2)
		    throw new RuntimeException();
		ufa.j.reset();
		ufa.j.update(is, 0, is.length - 2);
		int i_4_ = (int) ufa.j.getValue();
		if (((ds) u).p[i] != i_4_)
		    throw new RuntimeException();
		if (((ds) u).m != null && ((ds) u).m[i] != null) {
		    byte[] is_5_ = ((ds) u).m[i];
		    byte[] is_6_ = Class_a.a(is.length - 2, is, -73, 0);
		    for (int i_7_ = 0; i_7_ < 64; i_7_++) {
			if (is_5_[i_7_] != is_6_[i_7_])
			    throw new RuntimeException();
		    }
		}
		((uaa) H).E = 0;
		((uaa) H).D = 0;
	    } catch (RuntimeException runtimeexception) {
		H.a(true);
		var_ft.unlink(-27);
		if (((ft) var_ft).u && !H.e(26555)) {
		    nf var_nf = H.a(i, t, 4, true, (byte) 2);
		    D.a(var_nf, (byte) -63, (long) i);
		}
		return null;
	    }
	    is[is.length - 2] = (byte) (((ds) u).b[i] >>> 8);
	    is[is.length - 1] = (byte) ((ds) u).b[i];
	    if (N != null) {
		M.a(is, true, N, i);
		if (G[i] != 1) {
		    m++;
		    G[i] = (byte) 1;
		}
	    }
	    if (!((ft) var_ft).u)
		var_ft.unlink(-74);
	    return var_ft;
	}
	try {
	    if (is == null || is.length <= 2)
		throw new RuntimeException();
	    ufa.j.reset();
	    ufa.j.update(is, 0, is.length - 2);
	    int i_8_ = (int) ufa.j.getValue();
	    if (i_8_ != ((ds) u).p[i])
		throw new RuntimeException();
	    if (((ds) u).m != null && ((ds) u).m[i] != null) {
		byte[] is_9_ = ((ds) u).m[i];
		byte[] is_10_ = Class_a.a(is.length - 2, is, 127, 0);
		for (int i_11_ = 0; i_11_ < 64; i_11_++) {
		    if (is_9_[i_11_] != is_10_[i_11_])
			throw new RuntimeException();
		}
	    }
	    int i_12_ = ((is[is.length - 2] << 8 & 0xff00)
			 + (is[is.length - 1] & 0xff));
	    if ((0xffff & ((ds) u).b[i]) != i_12_)
		throw new RuntimeException();
	    if (G[i] != 1) {
		m++;
		G[i] = (byte) 1;
	    }
	    if (!((ft) var_ft).u)
		var_ft.unlink(-17);
	    return var_ft;
	} catch (Exception exception) {
	    G[i] = (byte) -1;
	    var_ft.unlink(-126);
	    if (((ft) var_ft).u && !H.e(26555)) {
		nf var_nf = H.a(i, t, 4, true, (byte) 2);
		D.a(var_nf, (byte) -84, (long) i);
	    }
	    return null;
	}
    }
    
    final int c(int i) {
	h++;
	if (i != -14311)
	    return 76;
	return m;
    }
    
    final void d(int i) {
	F++;
	if (R != null) {
	    if (a((byte) -14) == null)
		return;
	    if (!O) {
		if (!S)
		    R = null;
		else {
		    boolean bool = true;
		    for (Node class_d = R.a((int) 96); class_d != null;
			 class_d = R.b((byte) 119)) {
			int i_13_ = (int) ((Node) class_d).nodeID;
			if (G[i_13_] != 1)
			    a(i_13_, -43, 2);
			if (G[i_13_] == 1)
			    class_d.unlink(-97);
			else
			    bool = false;
		    }
		    while (((ds) u).r.length > Q) {
			if (((ds) u).r[Q] == 0)
			    Q++;
			else {
			    if (H.d(108)) {
				bool = false;
				break;
			    }
			    if (G[Q] != 1)
				a(Q, -79, 2);
			    if (G[Q] != 1) {
				Node class_d = new Node();
				((Node) class_d).nodeID = (long) Q;
				R.b(class_d, (byte) 93);
				bool = false;
			    }
			    Q++;
			}
		    }
		    if (bool) {
			S = false;
			Q = 0;
		    }
		}
	    } else {
		boolean bool = true;
		for (Node class_d = R.a((int) 120); class_d != null;
		     class_d = R.b((byte) 102)) {
		    int i_14_ = (int) ((Node) class_d).nodeID;
		    if (G[i_14_] == 0)
			a(i_14_, 126, 1);
		    if (G[i_14_] == 0)
			bool = false;
		    else
			class_d.unlink(-12);
		}
		while (((ds) u).r.length > Q) {
		    if (((ds) u).r[Q] == 0)
			Q++;
		    else {
			if (((th) M).q >= 250) {
			    bool = false;
			    break;
			}
			if (G[Q] == 0)
			    a(Q, 66, 1);
			if (G[Q] == 0) {
			    Node class_d = new Node();
			    ((Node) class_d).nodeID = (long) Q;
			    R.b(class_d, (byte) 93);
			    bool = false;
			}
			Q++;
		    }
		}
		if (bool) {
		    Q = 0;
		    O = false;
		}
	    }
	}
	if (T && us.a(116) >= U) {
	    for (ft var_ft = (ft) D.b((byte) 124); var_ft != null;
		 var_ft = (ft) D.b(12561)) {
		if (!((ft) var_ft).x) {
		    if (!((ft) var_ft).w)
			((ft) var_ft).w = true;
		    else {
			if (!((ft) var_ft).u)
			    throw new RuntimeException();
			var_ft.unlink(-24);
		    }
		}
	    }
	    U = us.a(112) + 1000L;
	}
	if (i < 53)
	    d((byte) 13);
    }
    
    public static void e(int i) {
	if (i != -4058)
	    d(-34, -116);
	z = null;
	q = null;
	j = null;
	v = null;
    }
    
    final int a(boolean bool) {
	s++;
	if (u == null)
	    return 0;
	if (!O)
	    return ((ds) u).q;
	Node class_d = R.a((int) 123);
	if (class_d == null)
	    return 0;
	if (bool != true)
	    return 31;
	return (int) ((Node) class_d).nodeID;
    }
    
    final int b(boolean bool) {
	L++;
	if (bool != false)
	    c(-1, 56);
	if (u == null)
	    return 0;
	return ((ds) u).q;
    }
    
    final ds a(byte i) {
	I++;
	if (u != null)
	    return u;
	if (l == null) {
	    if (H.e(26555))
		return null;
	    l = H.a(t, 255, 4, true, (byte) 0);
	}
	if (((ft) l).x)
	    return null;
	if (i != -14)
	    c((byte) 70);
	byte[] is = l.d((byte) 121);
	if (!(l instanceof Class_kf)) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		u = new ds(is, k, n);
	    } catch (RuntimeException runtimeexception) {
		H.a(true);
		u = null;
		if (!H.e(26555))
		    l = H.a(t, 255, i ^ ~0x9, true, (byte) 0);
		else
		    l = null;
		return null;
	    }
	    if (B != null)
		M.a(is, true, B, t);
	} else {
	    try {
		if (is == null)
		    throw new RuntimeException();
		u = new ds(is, k, n);
		if (E != ((ds) u).e)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		u = null;
		if (!H.e(i + 26569))
		    l = H.a(t, 255, i ^ ~0x9, true, (byte) 0);
		else
		    l = null;
		return null;
	    }
	}
	if (N != null) {
	    m = 0;
	    G = new byte[((ds) u).f];
	}
	l = null;
	return u;
    }
    
    static final void f(int i) {
	if (dj.b > 1) {
	    tda.i = tb.u;
	    dj.b--;
	}
	r++;
	if (cm.K) {
	    cm.K = false;
	    uca.b(i - 1);
	} else {
	    if (!gea.n)
		uk.a((byte) 91);
	    for (int i_15_ = 0; i_15_ < 100; i_15_++) {
		if (!fh.a(true))
		    break;
	    }
	    if (hm.h == 10) {
		while (hk.j(-25236)) {
		    tba var_tba = jga.sendGameOutPacket(jv.s, pca.isaac, (byte) 78);
		    ((tba) var_tba).loginStream.writeByte((int) 0, (byte) -114);
		    int i_16_ = ((BytesParser) ((tba) var_tba).loginStream).pos;
		    hp.a(4, ((tba) var_tba).loginStream);
		    ((tba) var_tba).loginStream.writeLengthByte(((BytesParser) ((tba) var_tba).loginStream).pos - i_16_,
					2105852);
		    ud.a(var_tba, (byte) -36);
		}
		if (bg.a == null) {
		    if (us.a(106) >= pga.a)
			bg.a = Class_ag.i.a(((World) gm.world).lobbyAddress, i + 89);
		} else if ((((vm) bg.a).o ^ 0xffffffff) != 0) {
		    tba var_tba = jga.sendGameOutPacket(nr.a, pca.isaac, (byte) -128);
		    ((tba) var_tba).loginStream.writeShort(((vm) bg.a).o, 13469);
		    ud.a(var_tba, (byte) -36);
		    bg.a = null;
		    pga.a = us.a(i ^ 0x6a) + 30000L;
		}
		ew var_ew = (ew) qt.F.a(i ^ 0x52);
		if (var_ew != null || bw.s < us.a(125) - 2000L) {
		    tba var_tba = null;
		    int i_17_ = 0;
		    for (ew var_ew_18_ = (ew) eda.i.a((int) 115);
			 var_ew_18_ != null;
			 var_ew_18_ = (ew) eda.i.b((byte) 22)) {
			if (var_tba != null
			    && ((BytesParser) ((tba) var_tba).loginStream).pos - i_17_ >= 240)
			    break;
			var_ew_18_.unlink(i ^ ~0x35);
			int i_19_ = var_ew_18_.a(true);
			if (i_19_ >= -1) {
			    if (i_19_ > 65534)
				i_19_ = 65534;
			} else
			    i_19_ = -1;
			int i_20_ = var_ew_18_.a(9);
			if (i_20_ < -1)
			    i_20_ = -1;
			else if (i_20_ > 65534)
			    i_20_ = 65534;
			if (i_20_ != mn.a || i_19_ != Class_ic.P) {
			    if (var_tba == null) {
				dr.A++;
				var_tba = jga.sendGameOutPacket(kga.jb, pca.isaac, (byte) 91);
				((tba) var_tba).loginStream.writeByte((int) 0, (byte) -115);
				i_17_ = ((BytesParser) ((tba) var_tba).loginStream).pos;
			    }
			    int i_21_ = i_20_ - mn.a;
			    mn.a = i_20_;
			    int i_22_ = i_19_ - Class_ic.P;
			    Class_ic.P = i_19_;
			    int i_23_
				= (int) ((var_ew_18_.i(-84) - bw.s) / 20L);
			    if (i_23_ >= 8 || i_21_ < -32 || i_21_ > 31
				|| i_22_ < -32 || i_22_ > 31) {
				if (i_23_ >= 32 || i_21_ < -128 || i_21_ > 127
				    || i_22_ < -128 || i_22_ > 127) {
				    if (i_23_ >= 32) {
					((tba) var_tba).loginStream.writeShort(i_23_ + 57344,
							    13469);
					if (i_20_ == 1 || i_19_ == -1)
					    ((tba) var_tba).loginStream.writeInt(-2147483648,
								i ^ ~0x62);
					else
					    ((tba) var_tba).loginStream.writeInt((i_20_
								 | (i_19_
								    << 16)),
								(int) -97);
				    } else {
					((tba) var_tba).loginStream.writeByte(i_23_ + 192,
							    (byte) -112);
					if (i_20_ == 1
					    || (i_19_ ^ 0xffffffff) == 0)
					    ((tba) var_tba).loginStream.writeInt(-2147483648,
								(int) -106);
					else
					    ((tba) var_tba).loginStream.writeInt((i_20_
								 | (i_19_
								    << 16)),
								(int) -120);
				    }
				} else {
				    ((tba) var_tba).loginStream.writeByte(i_23_ + 128,
							(byte) -110);
				    i_21_ += 128;
				    i_22_ += 128;
				    ((tba) var_tba).loginStream.writeShort((i_21_ << 8) + i_22_,
							i ^ 0x3495);
				}
			    } else {
				i_22_ += 32;
				i_21_ += 32;
				((tba) var_tba).loginStream.writeShort((i_22_ + (i_21_ << 6)
						     + (i_23_ << 12)),
						    13469);
			    }
			    bw.s = var_ew_18_.i(-71);
			}
		    }
		    if (var_tba != null) {
			((tba) var_tba).loginStream.writeLengthByte(((BytesParser) ((tba) var_tba).loginStream).pos - i_17_,
					    2105852);
			ud.a(var_tba, (byte) -36);
		    }
		}
		if (var_ew != null) {
		    long l = (var_ew.i(-106) - kfa.g) / 50L;
		    if (l > 32767L)
			l = 32767L;
		    kfa.g = var_ew.i(i ^ ~0x79);
		    int i_24_ = var_ew.a(true);
		    if (i_24_ >= 0) {
			if (i_24_ > 65535)
			    i_24_ = 65535;
		    } else
			i_24_ = 0;
		    int i_25_ = var_ew.a(9);
		    if (i_25_ < 0)
			i_25_ = 0;
		    else if (i_25_ > 65535)
			i_25_ = 65535;
		    int i_26_ = 0;
		    if (var_ew.b(false) == 2)
			i_26_ = 1;
		    gfa.M++;
		    int i_27_ = (int) l;
		    tba var_tba = jga.sendGameOutPacket(ea.H, pca.isaac, (byte) 119);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ ~0x73, i_27_ | i_26_ << 15);
		    ((tba) var_tba).loginStream.writeIntShiftsInOrder_16_24_0_8(i_24_ << 16 | i_25_, -97);
		    ud.a(var_tba, (byte) -36);
		}
		if (ar.Q > 0) {
		    vn.M++;
		    tba var_tba = jga.sendGameOutPacket(di.b, pca.isaac, (byte) 74);
		    ((tba) var_tba).loginStream.writeByte(ar.Q * 3, (byte) -119);
		    for (int i_28_ = 0; i_28_ < ar.Q; i_28_++) {
			au var_au = je.g[i_28_];
			long l = (var_au.a(i + 26009) - qf.a) / 50L;
			if (l > 65535L)
			    l = 65535L;
			qf.a = var_au.a(26017);
			((tba) var_tba).loginStream.writeByte(var_au.a((byte) -109),
					    (byte) -122);
			((tba) var_tba).loginStream.writeShort((int) l, 13469);
		    }
		    ud.a(var_tba, (byte) -36);
		}
		if (rq.N > 0)
		    rq.N--;
		if (mo.F && rq.N <= 0) {
		    mo.F = false;
		    lba.N++;
		    rq.N = 20;
		    tba var_tba = jga.sendGameOutPacket(hv.k, pca.isaac, (byte) 124);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, (int) qw.n >> 3);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ ~0x72, (int) pm.F >> 3);
		    ud.a(var_tba, (byte) -36);
		}
		if (sj.p != tw.r) {
		    sq.g++;
		    sj.p = tw.r;
		    tba var_tba = jga.sendGameOutPacket(mu.e, pca.isaac, (byte) -66);
		    ((tba) var_tba).loginStream.writeByte((int) (tw.r ? 1 : 0), (byte) -128);
		    ud.a(var_tba, (byte) -36);
		}
		if (!NPCNode.k) {
		    Class_is.m++;
		    tba var_tba = jga.sendGameOutPacket(ik.n, pca.isaac, (byte) -77);
		    ((tba) var_tba).loginStream.writeByte((int) 0, (byte) -126);
		    int i_29_ = ((BytesParser) ((tba) var_tba).loginStream).pos;
		    BytesParser var_es = new BytesParser(tm.d(4929));
		    cs.g.a(108, var_es);
		    ((tba) var_tba).loginStream.writeBytes(65536, ((BytesParser) var_es).pos, 0,
					((BytesParser) var_es).bytes);
		    ((tba) var_tba).loginStream.writeLengthByte(((BytesParser) ((tba) var_tba).loginStream).pos - i_29_,
					i ^ 0x2021f4);
		    ud.a(var_tba, (byte) -36);
		    NPCNode.k = true;
		}
		if (ol.p != null) {
		    if (ll.x != 2) {
			if (ll.x == 3)
			    fi.a(i - 1202242084);
		    } else
			hg.a(true);
		}
		if (!sa.s)
		    J /= 2.0F;
		else
		    sa.s = false;
		if (!dq.e)
		    afa.a /= 2.0F;
		else
		    dq.e = false;
		hn.b(i + 3);
		if (hm.h == 10) {
		    wh.d((byte) -71);
		    Node.h(-21715);
		    bt.a((byte) -122);
		    gv.a++;
		    if (gv.a > 750)
			uca.b(7);
		    else {
			pl.e(0);
			mv.a((int) 124);
			nn.b(-1);
			for (int i_30_ = cp.e.a((byte) -108, true);
			     i_30_ != -1; i_30_ = cp.e.a((byte) 117, false)) {
			    kw.a(i ^ 0x8, i_30_);
			    ul.v[uca.a(hn.g++, 31)] = i_30_;
			}
			for (qba var_qba = cfa.a((byte) 108); var_qba != null;
			     var_qba = cfa.a((byte) 116)) {
			    int i_31_ = var_qba.a(i + 247);
			    int i_32_ = var_qba.j(i - 4);
			    if (i_31_ != 1) {
				if (i_31_ != 2) {
				    if (i_31_ != 3) {
					if (i_31_ == 4) {
					    Interface var_kp
						= efa.a(-1018745488, i_32_);
					    int i_33_ = ((qba) var_qba).v;
					    int i_34_ = ((qba) var_qba).t;
					    int i_35_ = ((qba) var_qba).A;
					    if (i_33_ != ((Interface) var_kp).modelType
						|| ((Interface) var_kp).modelID != i_34_
						|| i_35_ != ((Interface) var_kp).U) {
						((Interface) var_kp).U = i_35_;
						((Interface) var_kp).modelType = i_33_;
						((Interface) var_kp).modelID = i_34_;
						tn.a(var_kp, 1023);
					    }
					} else if (i_31_ != 5) {
					    if (i_31_ == 6) {
						int i_36_ = ((qba) var_qba).v;
						int i_37_ = i_36_ >> 10 & 0x1f;
						int i_38_
						    = (i_36_ & 0x3e1) >> 5;
						int i_39_ = 0x1f & i_36_;
						int i_40_ = ((i_38_ << 11)
							     + (i_37_ << 19)
							     + (i_39_ << 3));
						Interface var_kp = efa.a(-1018745488,
								  i_32_);
						if (i_40_ != ((Interface) var_kp).textColor) {
						    ((Interface) var_kp).textColor = i_40_;
						    tn.a(var_kp, i ^ 0x3f7);
						}
					    } else if (i_31_ != 7) {
						if (i_31_ != 8) {
						    if (i_31_ == 9) {
							Interface var_kp
							    = (efa.a
							       (-1018745488,
								i_32_));
							if ((((Interface) var_kp).itemID
							     != ((qba)
								 var_qba).v)
							    || ((((Interface) var_kp)
								 .itemStackSize)
								!= (((qba)
								     var_qba)
								    .t))) {
							    ((Interface) var_kp).itemStackSize
								= ((qba)
								   var_qba).t;
							    ((Interface) var_kp).itemID
								= ((qba)
								   var_qba).v;
							    tn.a(var_kp, 1023);
							}
						    } else if (i_31_ == 10) {
							Interface var_kp
							    = (efa.a
							       (-1018745488,
								i_32_));
							if ((((qba) var_qba).v
							     != (((Interface) var_kp)
								 .Ec))
							    || (((qba)
								 var_qba).t
								!= ((Interface)
								    var_kp).wc)
							    || (((qba)
								 var_qba).A
								!= (((Interface)
								     var_kp)
								    .modelRotationZ))) {
							    ((Interface) var_kp).modelRotationZ
								= ((qba)
								   var_qba).A;
							    ((Interface) var_kp).Ec
								= ((qba)
								   var_qba).v;
							    ((Interface) var_kp).wc
								= ((qba)
								   var_qba).t;
							    tn.a(var_kp, 1023);
							}
						    } else if (i_31_ != 11) {
							if (i_31_ != 12) {
							    if (i_31_ != 14) {
								if (i_31_
								    != 15) {
								    if (i_31_
									== 16) {
									Interface var_kp
									    = efa.a(i ^ ~0x3cb8d287, i_32_);
									((Interface)
									 var_kp)
									    .Ab
									    = ((qba)
									       var_qba).v;
								    }
								} else {
								    uaa.h
									= (((qba)
									    var_qba)
									   .t);
								    po.d
									= true;
								    bca.c
									= (((qba)
									    var_qba)
									   .v);
								}
							    } else {
								Interface var_kp
								    = (efa.a
								       (-1018745488,
									i_32_));
								((Interface) var_kp)
								    .textureID
								    = (((qba)
									var_qba)
								       .v);
							    }
							} else {
							    Interface var_kp
								= (efa.a
								   (i - 1018745496,
								    i_32_));
							    int i_41_
								= (((qba)
								    var_qba)
								   .v);
							    if (var_kp != null
								&& (((Interface)
								     var_kp).type
								    == 0)) {
								if (i_41_
								    > ((((Interface)
									 var_kp)
									.maxVScroll)
								       - (((Interface)
									   var_kp)
									  .minVScroll)))
								    i_41_
									= (((Interface)
									    var_kp).maxVScroll
									   - ((Interface)
									      var_kp).minVScroll);
								if (i_41_ < 0)
								    i_41_ = 0;
								if (i_41_
								    != (((Interface)
									 var_kp)
									.vScroll)) {
								    ((Interface)
								     var_kp).vScroll
									= i_41_;
								    tn.a(var_kp,
									 1023);
								}
							    }
							}
						    } else {
							Interface var_kp
							    = (efa.a
							       (i - 1018745496,
								i_32_));
							((Interface) var_kp).ab
							    = (byte) 0;
							((Interface) var_kp).locX
							    = ((Interface) var_kp).hc
							    = (((qba) var_qba)
							       .v);
							((Interface) var_kp).locY
							    = ((Interface) var_kp).Wc
							    = (((qba) var_qba)
							       .t);
							((Interface) var_kp).hd
							    = (byte) 0;
							tn.a(var_kp, 1023);
						    }
						} else {
						    Interface var_kp
							= efa.a(-1018745488,
								i_32_);
						    if ((((Interface) var_kp).modelRotationX
							 != ((qba) var_qba).v)
							|| (((qba) var_qba).t
							    != (((Interface) var_kp)
								.modelRotationY))
							|| (((Interface) var_kp).modelZoom
							    != (((qba) var_qba)
								.A))) {
							((Interface) var_kp).modelRotationX
							    = (((qba) var_qba)
							       .v);
							((Interface) var_kp).modelRotationY
							    = (((qba) var_qba)
							       .t);
							((Interface) var_kp).modelZoom
							    = (((qba) var_qba)
							       .A);
							if (((Interface) var_kp).itemID
							    != -1) {
							    if (((Interface) var_kp).n
								> 0)
								((Interface) var_kp)
								    .modelZoom
								    = (32
								       * (((Interface)
									   var_kp)
									  .modelZoom)
								       / (((Interface)
									   var_kp)
									  .n));
							    else if ((((Interface)
								       var_kp)
								      .width)
								     > 0)
								((Interface) var_kp)
								    .modelZoom
								    = (32
								       * (((Interface)
									   var_kp)
									  .modelZoom)
								       / (((Interface)
									   var_kp)
									  .width));
							}
							tn.a(var_kp, 1023);
						    }
						}
					    } else {
						Interface var_kp = efa.a(-1018745488,
								  i_32_);
						boolean bool
						    = ((qba) var_qba).v == 1;
						if (((Interface) var_kp).hidden != bool) {
						    ((Interface) var_kp).hidden = bool;
						    tn.a(var_kp, 1023);
						}
					    }
					} else {
					    Interface var_kp
						= efa.a(-1018745488, i_32_);
					    if ((((Interface) var_kp).V
						 != ((qba) var_qba).v)
						|| ((qba) var_qba).v == -1) {
						((Interface) var_kp).R = 0;
						((Interface) var_kp).V
						    = ((qba) var_qba).v;
						((Interface) var_kp).s = 0;
						((Interface) var_kp).rc = 1;
						dr var_dr
						    = ((((Interface) var_kp).V
							^ 0xffffffff) == 0
						       ? null
						       : Class_ef.J.c(64,
								      (((Interface)
									var_kp)
								       .V)));
						if (var_dr != null)
						    cea.a(var_dr, (byte) 104,
							  ((Interface) var_kp).s);
						tn.a(var_kp, 1023);
					    }
					}
				    } else {
					Interface var_kp
					    = efa.a(i ^ ~0x3cb8d287, i_32_);
					if (!((qba) var_qba).x
						 .equals(((Interface) var_kp).text)) {
					    ((Interface) var_kp).text
						= ((qba) var_qba).x;
					    tn.a(var_kp, i + 1015);
					}
				    }
				} else {
				    client.ob[i_32_] = ((qba) var_qba).x;
				    kv.c[uca.a(31, qn.j++)] = i_32_;
				}
			    } else {
				rr.h[i_32_] = ((qba) var_qba).v;
				dv.d |= jm.i[i_32_];
				li.E[uca.a(31, hg.p++)] = i_32_;
			    }
			}
			nq.x++;
			if (nm.s != 0) {
			    to.h += 20;
			    if (to.h >= 400)
				nm.s = 0;
			}
			if (vv.i != null) {
			    WorldSub.n++;
			    if (WorldSub.n >= 15) {
				tn.a(vv.i, 1023);
				vv.i = null;
			    }
			}
			bm.h = false;
			bw.u = null;
			nr.b = null;
			wd.f = false;
			eh.a(-1, -1, null, 17274);
			wg.a((byte) 65, (Interface) null, -1, -1);
			if (!ba.c)
			    da.e = -1;
			dc.a((byte) 91);
			tb.u++;
			if (gd.e) {
			    NPC.hd++;
			    tba var_tba = jga.sendGameOutPacket(it.M, pca.isaac, (byte) 104);
			    ((tba) var_tba).loginStream.writeIntReversed(13412, op.y_ | (cp.height << 28
							       | dv.x << 14));
			    ud.a(var_tba, (byte) -36);
			    gd.e = false;
			}
			for (;;) {
			    ClientScript var_mea = (ClientScript) Class_b.c.a(true);
			    if (var_mea == null)
				break;
			    Interface var_kp = ((ClientScript) var_mea).interface_;
			    if (((Interface) var_kp).itemIndex >= 0) {
				Interface var_kp_42_
				    = efa.a(i - 1018745496, ((Interface) var_kp).parentID);
				if (var_kp_42_ == null
				    || ((Interface) var_kp_42_).children == null
				    || (((Interface) var_kp).itemIndex
					>= ((Interface) var_kp_42_).children.length)
				    || var_kp != (((Interface) var_kp_42_).children
						  [((Interface) var_kp).itemIndex]))
				    continue;
			    }
			    ClientScriptHandler.activateClientScript(var_mea);
			}
			for (;;) {
			    ClientScript var_mea = (ClientScript) caa.C.a(true);
			    if (var_mea == null)
				break;
			    Interface var_kp = ((ClientScript) var_mea).interface_;
			    if (((Interface) var_kp).itemIndex >= 0) {
				Interface var_kp_43_
				    = efa.a(i ^ ~0x3cb8d287, ((Interface) var_kp).parentID);
				if (var_kp_43_ == null
				    || ((Interface) var_kp_43_).children == null
				    || (((Interface) var_kp).itemIndex
					>= ((Interface) var_kp_43_).children.length)
				    || var_kp != (((Interface) var_kp_43_).children
						  [((Interface) var_kp).itemIndex]))
				    continue;
			    }
			    ClientScriptHandler.activateClientScript(var_mea);
			}
			for (;;) {
			    ClientScript var_mea = (ClientScript) to.b.a(true);
			    if (var_mea == null)
				break;
			    Interface var_kp = ((ClientScript) var_mea).interface_;
			    if (((Interface) var_kp).itemIndex >= 0) {
				Interface var_kp_44_
				    = efa.a(-1018745488, ((Interface) var_kp).parentID);
				if (var_kp_44_ == null
				    || ((Interface) var_kp_44_).children == null
				    || (((Interface) var_kp).itemIndex
					>= ((Interface) var_kp_44_).children.length)
				    || (((Interface) var_kp_44_).children[((Interface) var_kp).itemIndex]
					!= var_kp))
				    continue;
			    }
			    ClientScriptHandler.activateClientScript(var_mea);
			}
			if (nr.b == null)
			    bg.e = 0;
			if (kr.a != null)
			    qc.a(7129);
			if (hv.thisPlayersRights > 0 && uc.c.a((byte) -68, (int) 82)
			    && uc.c.a((byte) -68, (int) 81) && fm.b != 0) {
			    int i_45_ = ((Animable) up.thisPlayer).height - fm.b;
			    if (i_45_ >= 0) {
				if (i_45_ > 3)
				    i_45_ = 3;
			    } else
				i_45_ = 0;
			    mca.teleport(1024908230, i_45_, BytesParser.thisPlayersRegionY + ((Entity) up.thisPlayer).regionLocalY[0],
                        bfa.thisPlayersRegionX + ((Entity) up.thisPlayer).regionLocalX[0]);
			}
			NPCDef.a(true);
			for (int i_46_ = 0; i_46_ < 5; i_46_++)
			    gu.J[i_46_]++;
			if (dv.d && us.a(114) - 60000L > hs.n)
			    cc.a(false);
			for (rk var_rk = (rk) mw.v.b((byte) 94);
			     var_rk != null;
			     var_rk = (rk) mw.v.a((byte) -106)) {
			    if (us.a(i ^ 0x76) / 1000L - 5L
				> (long) ((rk) var_rk).p) {
				if (((rk) var_rk).n > 0)
				    oba.a("",
					  ((rk) var_rk).playerName + GameText._hasLoggedIn.getString((byte) 90,
								   cba.languageID),
					  5, -1, "", 0, "");
				if (((rk) var_rk).n == 0)
				    oba.a("",
					  ((rk) var_rk).playerName + GameText._hasLoggedOut.getString((byte) 117,
								   cba.languageID),
					  5, -1, "", 0, "");
				var_rk.unlink(2);
			    }
			}
			BytesParser.u++;
			if (BytesParser.u > 500) {
			    BytesParser.u = 0;
			    int i_47_ = (int) (Math.random() * 8.0);
			    if ((0x1 & i_47_) == 1)
				el.d += cj.l;
			    if ((0x2 & i_47_) == 2)
				la.s += kk.q;
			    if ((i_47_ & 0x4) == 4)
				sca.j += fr.z;
			}
			if (el.d < -50)
			    cj.l = 2;
			if (la.s < -55)
			    kk.q = 2;
			if (el.d > 50)
			    cj.l = -2;
			if (sca.j < -40)
			    fr.z = 1;
			if (la.s > 55)
			    kk.q = -2;
			if (sca.j > 40)
			    fr.z = -1;
			rn.d++;
			if (i != 8)
			    f(58);
			if (rn.d > 500) {
			    rn.d = 0;
			    int i_48_ = (int) (Math.random() * 8.0);
			    if ((0x1 & i_48_) == 1)
				pt.b += fp.i;
			    if ((0x2 & i_48_) == 2)
				vd.N += ObjectDef.Bb;
			}
			if (pt.b < -60)
			    fp.i = 2;
			if (pt.b > 60)
			    fp.i = -2;
			if (vd.N < -20)
			    ObjectDef.Bb = 1;
			nc.n++;
			if (vd.N > 10)
			    ObjectDef.Bb = -1;
			if (nc.n > 50) {
			    jq.k++;
			    tba var_tba = jga.sendGameOutPacket(lw.outgoingPacket24, pca.isaac, (byte) -88);
			    ud.a(var_tba, (byte) -36);
			}
			if (fg.d) {
			    sh.b(-30184);
			    fg.d = false;
			}
			try {
			    uu.a((byte) 119);
			} catch (java.io.IOException ioexception) {
			    uca.b(7);
			}
		    }
		}
	    }
	}
    }
    
    final void a(int i, int i_49_) {
	A++;
	if (i != 59)
	    t = 121;
	if (N != null) {
	    for (Node class_d = P.a((int) 90); class_d != null;
		 class_d = P.b((byte) 87)) {
		if ((long) i_49_ == ((Node) class_d).nodeID)
		    return;
	    }
	    Node class_d = new Node();
	    ((Node) class_d).nodeID = (long) i_49_;
	    P.b(class_d, (byte) 93);
	}
    }
    
    static final void d(int i, int i_50_) {
	C++;
	if (i_50_ < 0 || i_50_ > 2)
	    i_50_ = 0;
	ISAAC.k = i_50_;
	da.d = new tq[gr.a[ISAAC.k] + 1];
	vq.n = i;
	tba.r = 0;
    }
    
    final byte[] b(int i, int i_51_) {
	o++;
	if (i_51_ != 750)
	    return null;
	ft var_ft = a(i, -71, 0);
	if (var_ft == null)
	    return null;
	byte[] is = var_ft.d((byte) 125);
	var_ft.unlink(-55);
	return is;
    }
    
    final int c(int i, int i_52_) {
	x++;
	if (i < 71)
	    S = true;
	ft var_ft = (ft) D.a(-32748, (long) i_52_);
	if (var_ft != null)
	    return var_ft.b((byte) -69);
	return 0;
    }
    
    pda(int i, lf var_lf, lf var_lf_53_, uaa var_uaa, th var_th, int i_54_,
	byte[] is, int i_55_, boolean bool) {
	P = new Class_ae();
	U = 0L;
	t = i;
	N = var_lf;
	if (N != null) {
	    O = true;
	    R = new Class_ae();
	} else
	    O = false;
	T = bool;
	B = var_lf_53_;
	E = i_55_;
	M = var_th;
	H = var_uaa;
	k = i_54_;
	n = is;
	if (B != null)
	    l = M.a(8217, B, t);
    }
    
    static {
	j = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	J = 0.0F;
    }
}
