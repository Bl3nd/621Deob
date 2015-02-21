/* tc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class tc extends mca
{
    int H;
    int[] I;
    static int J;
    static int K;
    static int L;
    static int M;
    static int N;
    private int O = -1;
    static int P;
    static int Q;
    int R;
    
    static final void i(int i) {
	qba.a(60, ((jb) cs.g).m);
	K++;
	int i_0_ = (bfa.thisPlayersRegionX >> 3) + (dg.gb >> 12);
	int i_1_ = (BytesParser.thisPlayersRegionY >> 3) + (ada.N >> 12);
	vo.clientHeight = ((Animable) up.thisPlayer).height = (byte) 0;
	up.thisPlayer.updateLocation(i + 16773839, 8, 8);
	if (i != -16777216)
	    i(120);
	int i_2_ = 18;
	uc.g = new byte[i_2_][];
	ru.t = new int[i_2_][4];
	Class_ue.b = new byte[i_2_][];
	iu.o = new int[i_2_];
	os.l = new int[i_2_];
	pw.b = new byte[i_2_][];
	lca.D = new byte[i_2_][];
	jv.u = new int[i_2_];
	fba.N = new int[i_2_];
	laa.f = new int[i_2_];
	wk.h = new int[i_2_];
	kaa.q = new byte[i_2_][];
	i_2_ = 0;
	for (int i_3_ = (i_0_ - (Class_hc.e >> 4)) / 8;
	     i_3_ <= (i_0_ + (Class_hc.e >> 4)) / 8; i_3_++) {
	    for (int i_4_ = (i_1_ - (bw.v >> 4)) / 8;
		 ((bw.v >> 4) + i_1_) / 8 >= i_4_; i_4_++) {
		int i_5_ = (i_3_ << 8) + i_4_;
		iu.o[i_2_] = i_5_;
		wk.h[i_2_] = ua.c.a("m" + i_3_ + "_" + i_4_, i + 16777307);
		os.l[i_2_]
		    = ua.c.a("width" + i_3_ + "_" + i_4_, mv.a(i, 16777133));
		fba.N[i_2_]
		    = ua.c.a("n" + i_3_ + "_" + i_4_, mv.a(i, -16777183));
		laa.f[i_2_]
		    = ua.c.a("um" + i_3_ + "_" + i_4_, mv.a(i, 16777114));
		jv.u[i_2_] = ua.c.a("ul" + i_3_ + "_" + i_4_, i + 16777285);
		if (fba.N[i_2_] == -1) {
		    wk.h[i_2_] = -1;
		    os.l[i_2_] = -1;
		    laa.f[i_2_] = -1;
		    jv.u[i_2_] = -1;
		}
		i_2_++;
	    }
	}
	for (int i_6_ = i_2_; fba.N.length > i_6_; i_6_++) {
	    fba.N[i_6_] = -1;
	    wk.h[i_6_] = -1;
	    os.l[i_6_] = -1;
	    laa.f[i_6_] = -1;
	    jv.u[i_6_] = -1;
	}
	int i_7_;
	if (hm.h == 3)
	    i_7_ = 4;
	else
	    i_7_ = 8;
	kga.a(i_7_, 512, false, i_0_, i_1_);
    }
    
    static final void a(boolean bool, Class_r class_r) {
	P++;
	int i = mr.a;
	int i_8_ = hn.b;
	int i_9_ = aw.l;
	int i_10_ = lfa.r - 3;
	int i_11_ = 20;
	if (lk.k == null || oca.h == null) {
	    if (!sm.a.g(1912, ik.t) || !sm.a.g(1912, lfa.c))
		class_r.J(i, i_8_, i_9_, i_11_, dk.q | -rm.o + 255 << 24, 1);
	    else {
		lk.k = class_r.a(aga.a(sm.a, ik.t, 0), true);
		aga var_aga = aga.a(sm.a, lfa.c, 0);
		oca.h = class_r.a(var_aga, true);
		var_aga.a();
		ea.N = class_r.a(var_aga, true);
	    }
	}
	if (lk.k != null && oca.h != null) {
	    int i_12_ = (i_9_ - oca.h.E() * 2) / lk.k.E();
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		lk.k.a(i + oca.h.E() + i_13_ * lk.k.E(), i_8_);
	    oca.h.a(i, i_8_);
	    ea.N.a(i + (i_9_ - ea.N.E()), i_8_);
	}
	pv.j.a(~0xffffff | vea.d, true, i + 3, GameText.chooseOptionText.getString((byte) -62, cba.languageID), -1,
	       i_8_ + 14);
	class_r.J(i, i_8_ + i_11_, i_9_, i_10_ - i_11_,
		  dk.q | 255 - rm.o << 24, 1);
	int i_14_ = Class_md.e.d(2000);
	int i_15_ = Class_md.e.b((int) 118);
	int i_16_ = 0;
	for (bfa var_bfa = (bfa) oba.I.a((int) 86); var_bfa != null;
	     var_bfa = (bfa) oba.I.b((byte) 38)) {
	    int i_17_ = i_11_ + 13 + (i_8_ + (mu.j - 1 - i_16_) * 16);
	    i_16_++;
	    if (i < i_14_ && i_9_ + i > i_14_ && i_17_ - 13 < i_15_
		&& i_15_ < i_17_ + 4 && ((bfa) var_bfa).z)
		class_r.J(i, i_17_ - 12, i_9_, 16, laa.a | 255 - tda.f << 24,
			  1);
	}
	if ((dba.d == null || tp.c == null || Player.od == null)
	    && sm.a.g(1912, pv.k) && sm.a.g(1912, jj.r)
	    && sm.a.g(1912, uj.A)) {
	    aga var_aga = aga.a(sm.a, jj.r, 0);
	    tp.c = class_r.a(var_aga, true);
	    var_aga.a();
	    iga.g = class_r.a(var_aga, true);
	    dba.d = class_r.a(aga.a(sm.a, pv.k, 0), true);
	    aga var_aga_18_ = aga.a(sm.a, uj.A, 0);
	    Player.od = class_r.a(var_aga_18_, true);
	    var_aga_18_.a();
	    io.P = class_r.a(var_aga_18_, true);
	}
	if (dba.d != null && tp.c != null && Player.od != null) {
	    int i_19_ = (i_9_ - 2 * Player.od.E()) / dba.d.E();
	    for (int i_20_ = 0; i_19_ > i_20_; i_20_++)
		dba.d.a(Player.od.E() + (i + dba.d.E() * i_20_),
			i_10_ + i_8_ - dba.d.u());
	    int i_21_ = (i_10_ - Player.od.u() - i_11_) / tp.c.u();
	    for (int i_22_ = 0; i_21_ > i_22_; i_22_++) {
		tp.c.a(i, i_8_ + (i_11_ + tp.c.u() * i_22_));
		iga.g.a(i + (i_9_ - iga.g.E()),
			i_22_ * tp.c.u() + i_11_ + i_8_);
	    }
	    Player.od.a(i, i_8_ + i_10_ - Player.od.u());
	    io.P.a(i_9_ + (i - Player.od.E()), i_8_ - Player.od.u() + i_10_);
	}
	i_16_ = 0;
	for (bfa var_bfa = (bfa) oba.I.a((int) 106); var_bfa != null;
	     var_bfa = (bfa) oba.I.b((byte) 41)) {
	    int i_23_ = i_11_ + i_8_ - (-13 - (mu.j - 1 - i_16_) * 16);
	    int i_24_ = ~0xffffff | vea.d;
	    if (i < i_14_ && i_14_ < i_9_ + i && i_23_ - 13 < i_15_
		&& i_15_ < i_23_ + 4 && ((bfa) var_bfa).z)
		i_24_ = ~0xffffff | ce.e;
	    int[] is = null;
	    if (nt.a(((bfa) var_bfa).v, (byte) 56))
		is = ((ItemDef) laa.itemDefLoader.d(12388, (int) ((bfa) var_bfa).n)).eb;
	    else if (((bfa) var_bfa).o == -1) {
		if (!sl.b(-1, ((bfa) var_bfa).v)) {
		    if (hq.a(((bfa) var_bfa).v, 21922)) {
			Object object = null;
			ObjectDef var_bda;
			if (((bfa) var_bfa).v == 1008)
			    var_bda
				= ul.k.getObjectDef((byte) 104, (int) ((bfa) var_bfa).n);
			else
			    var_bda
				= ul.k.getObjectDef((byte) 90,
					 (int) (0x7fffffffL
						& ((bfa) var_bfa).n >>> 32));
			if (((ObjectDef) var_bda).xb != null)
			    var_bda = var_bda.a(cp.e, -1643);
			if (var_bda != null)
			    is = ((ObjectDef) var_bda).l;
		    }
		} else {
		    NPCNode var_mi
			= (NPCNode) uo.a.a(-32748, (long) (int) ((bfa) var_bfa).n);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).npc;
			NPCDef var_du = ((NPC) class_ac).npcDef;
			if (((NPCDef) var_du).L != null)
			    var_du = var_du.a(-4261, cp.e);
			if (var_du != null)
			    is = ((NPCDef) var_du).G;
		    }
		}
	    } else
		is = ((ItemDef) laa.itemDefLoader.d(12388, ((bfa) var_bfa).o)).eb;
	    String string = Class_ob.a(var_bfa, 124);
	    if (is != null)
		string += nj.a(is, (byte) 126);
	    pv.j.a(-4611, 0, en.S, i_23_, pda.z, i_24_, i + 3, string);
	    if (((bfa) var_bfa).m)
		ua.e.a(dca.R.a((byte) 99, string) + i + 5, i_23_ - 12);
	    i_16_++;
	}
	if (bool != false)
	    i(-18);
	vv.a(hn.b, mr.a, aw.l, (byte) 97, lfa.r);
    }
    
    final int a(byte b) {
	int i_25_ = 69 % ((67 - b) / 56);
	J++;
	return O;
    }
    
    final void a(int i) {
	if (i < 42)
	    c((byte) -85);
	Q++;
	super.a(74);
	((tc) this).I = null;
    }
    
    public tc() {
	super(0, false);
    }
    
    final boolean c(byte i) {
	M++;
	if (((tc) this).I != null)
	    return true;
	if (O >= 0) {
	    aga var_aga = mk.e >= 0 ? aga.a(ip.eb, mk.e, O) : aga.b(ip.eb, O);
	    var_aga.b();
	    ((tc) this).I = var_aga.f();
	    ((tc) this).H = ((aga) var_aga).d;
	    ((tc) this).R = ((aga) var_aga).b;
	    return true;
	}
	int i_26_ = 43 / ((-44 - i) / 43);
	return false;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    N++;
	    if (j == 0)
		O = bytesParser.readShort(i + 13110);
	}
    }
    
    int[][] a(int i, boolean bool) {
	L++;
	int[][] is = ((mca) this).B.a(i, -56);
	if (((td) ((mca) this).B).p && c((byte) 104)) {
	    int[] is_28_ = is[0];
	    int[] is_29_ = is[1];
	    int[] is_30_ = is[2];
	    int i_31_ = ((tc) this).R * (od.pb == ((tc) this).H ? i
					 : ((tc) this).H * i / od.pb);
	    if (((tc) this).R != fr.v) {
		for (int i_32_ = 0; i_32_ < fr.v; i_32_++) {
		    int i_33_ = i_32_ * ((tc) this).R / fr.v;
		    int i_34_ = ((tc) this).I[i_31_ + i_33_];
		    is_30_[i_32_] = uca.a(i_34_ << 4, 4080);
		    is_29_[i_32_] = uca.a(i_34_ >> 4, 4080);
		    is_28_[i_32_] = uca.a(16711680, i_34_) >> 12;
		}
	    } else {
		for (int i_35_ = 0; i_35_ < fr.v; i_35_++) {
		    int i_36_ = ((tc) this).I[i_31_++];
		    is_30_[i_35_] = uca.a(4080, i_36_ << 4);
		    is_29_[i_35_] = uca.a(4080, i_36_ >> 4);
		    is_28_[i_35_] = uca.a(4080, i_36_ >> 12);
		}
	    }
	}
	if (bool != true)
	    a(34, (BytesParser) null, -119);
	return is;
    }
}
