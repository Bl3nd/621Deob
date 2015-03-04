/* kga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kga extends lca implements vda
{
    static int H;
    private short I;
    static int J;
    static int K;
    static int L;
    static int M;
    static int N;
    private boolean O;
    static int P;
    static int Q;
    static int R;
    static int S;
    private byte T;
    static int U;
    private da V;
    static int W;
    private boolean X;
    static int Y;
    static int Z;
    static int ab;
    static int bb;
    static int cb;
    static int db;
    private byte eb;
    static int fb;
    private sd gb;
    private ha hb;
    private boolean ib;
    static GameOutPacket jb = new GameOutPacket(55, -1);
    static int kb;
    static Signlink lb;
    static boolean[][][] mb;
    static long nb;
    
    final boolean a(int i, int i_0_, Class_r class_r, int i_1_) {
	Z++;
	da var_da = a(131072, class_r, 113);
	if (i_1_ != 9678)
	    return true;
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.NA(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	    if (!ml.k)
		return var_da.a(i, i_0_, class_q, false);
	    return var_da.a(i, i_0_, class_q, false, Class_pd.r);
	}
	return false;
    }
    
    public final void a(boolean bool) {
	J++;
	if (V != null)
	    V.a();
	if (bool != false)
	    nb = -97L;
    }
    
    public final int b(byte i) {
	K++;
	if (i < 126)
	    return 94;
	return I & 0xffff;
    }
    
    public final void b(byte i, Class_r class_r) {
	db++;
	if (i != -114)
	    ib = true;
	Object object = null;
	ha var_ha;
	if (hb == null && X) {
	    kj var_kj = a(class_r, 262144, true, -1);
	    var_ha = var_kj == null ? null : ((kj) var_kj).e;
	} else {
	    var_ha = hb;
	    hb = null;
	}
	if (var_ha != null)
	    oga.a(var_ha, ((Animable) this).height_, ((Animable) this).locX, ((Animable) this).locY, null);
    }
    
    final boolean g(byte i) {
	if (i <= 114)
	    mb = null;
	N++;
	return true;
    }
    
    final sd a(Class_r class_r, int i) {
	R++;
	if (gb == null)
	    gb = th.a(-24294, ((Animable) this).j, a(0, class_r, 70), ((Animable) this).locY,
		      ((Animable) this).locX);
	if (i != -1660704056)
	    return null;
	return gb;
    }
    
    static final boolean a(int i, int i_2_, int i_3_) {
	S++;
	if (i != 262144)
	    a(53, 31, true, -83, -59);
	if (!((0x40000 & i_2_) != 0 | Class_b.a(i_3_, i_2_, 0))
	    && !kl.a(i_2_, i ^ 0x40037, i_3_))
	    return false;
	return true;
    }
    
    static final void b(int i, int i_4_, int i_5_) {
	if (Class_ad.h == 1)
	    un.a(0, i_5_, ej.q, i);
	else if (Class_ad.h == 2)
	    Connection.a(i, i_5_);
	kb++;
	Class_ad.h = 0;
	if (i_4_ <= 74)
	    jb = null;
	ej.q = null;
    }
    
    final og a(boolean bool, Class_r class_r) {
	Q++;
	if (V == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.NA(((lca) this).E + ((Animable) this).locX, ((Animable) this).j,
		   ((lca) this).x + ((Animable) this).locY);
	if (bool != false)
	    a((byte) 16, (Class_r) null);
	og var_og = null;
	if (O)
	    var_og = lf.a(!bool, 1);
	if (ml.k)
	    V.a(class_q, var_og != null ? ((og) var_og).g[0] : null,
		Class_pd.r, 0);
	else
	    V.a(class_q, var_og != null ? ((og) var_og).g[0] : null, 0);
	return var_og;
    }
    
    final boolean e(byte i) {
	if (i != 23)
	    I = (short) 45;
	ab++;
	if (V == null)
	    return false;
	return V.LA();
    }
    
    public final void a(byte i, Class_r class_r) {
	P++;
	Object object = null;
	int i_6_ = -21 % ((i + 19) / 34);
	ha var_ha;
	if (hb != null || !X) {
	    var_ha = hb;
	    hb = null;
	} else {
	    kj var_kj = a(class_r, 262144, true, -1);
	    var_ha = var_kj == null ? null : ((kj) var_kj).e;
	}
	if (var_ha != null)
	    ck.a(var_ha, ((Animable) this).height_, ((Animable) this).locX, ((Animable) this).locY, null);
    }
    
    static final void a(int i, int i_7_, boolean bool, int i_8_, int i_9_) {
	U++;
	if (bool || wj.q != i_8_ || i_9_ != Class_kf.y
	    || qca.E != vo.clientHeight && !cs.g.e(on.performance, 109)) {
	    wj.q = i_8_;
	    qca.E = vo.clientHeight;
	    Class_kf.y = i_9_;
	    if (cs.g.e(on.performance, i_7_ ^ 0x272))
		qca.E = 0;
	    ei.a(i, -117);
	    Class_rf.a(true, lg.r, true, Class_nd.o, pm.v,
		       GameText.loadingPleaseWait.getString(cba.languageID));
	    int i_10_ = bfa.thisPlayersRegionX;
	    bfa.thisPlayersRegionX = 8 * (wj.q - (Class_hc.e >> 4));
	    int i_11_ = BytesParser.thisPlayersRegionY;
	    BytesParser.thisPlayersRegionY = 8 * (Class_kf.y - (bw.v >> 4));
	    mp.g = kca.b(8 * wj.q, 8 * Class_kf.y);
	    ofa.I = null;
	    int i_12_ = bfa.thisPlayersRegionX - i_10_;
	    int i_13_ = BytesParser.thisPlayersRegionY - i_11_;
	    if (i != 11) {
		ps.npcCount = 0;
		boolean bool_14_ = false;
		int i_15_ = Class_hc.e * 512 - 512;
		int i_16_ = (bw.v - 1) * 512;
		for (int i_17_ = 0; ObjectDef.Ib > i_17_; i_17_++) {
		    NPCNode var_mi = ii.npcNodes[i_17_];
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).npc;
			((Animable) class_ac).locY -= i_13_ * 512;
			((Animable) class_ac).locX -= 512 * i_12_;
			if (((Animable) class_ac).locX < 0 || i_15_ < ((Animable) class_ac).locX
			    || ((Animable) class_ac).locY < 0
			    || i_16_ < ((Animable) class_ac).locY) {
			    class_ac.a((NPCDef) null, i_7_ ^ 0x200);
			    var_mi.unlink(-94);
			    bool_14_ = true;
			} else {
			    boolean bool_18_ = true;
			    for (int i_19_ = 0; i_19_ < 10; i_19_++) {
				((Entity) class_ac).regionLocalX[i_19_] -= i_12_;
				((Entity) class_ac).regionLocalY[i_19_] -= i_13_;
				if (((Entity) class_ac).regionLocalX[i_19_] < 0
				    || Class_hc.e <= ((Entity) class_ac).regionLocalX[i_19_]
				    || ((Entity) class_ac).regionLocalY[i_19_] < 0
				    || ((Entity) class_ac).regionLocalY[i_19_] >= bw.v)
				    bool_18_ = false;
			    }
			    if (!bool_18_) {
				class_ac.a((NPCDef) null, 0);
				var_mi.unlink(-32);
				bool_14_ = true;
			    } else
				gfa.npcIndices[ps.npcCount++] = ((Entity) class_ac).lb;
			}
		    }
		}
		if (bool_14_) {
		    ObjectDef.Ib = uo.a.a((byte) -26);
		    uo.a.a(ii.npcNodes, (byte) -95);
		}
	    } else {
		for (int i_20_ = 0; ObjectDef.Ib > i_20_; i_20_++) {
		    NPCNode var_mi = ii.npcNodes[i_20_];
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).npc;
			for (int i_21_ = 0; i_21_ < 10; i_21_++) {
			    ((Entity) class_ac).regionLocalX[i_21_] -= i_12_;
			    ((Entity) class_ac).regionLocalY[i_21_] -= i_13_;
			}
			((Animable) class_ac).locX -= i_12_ * 512;
			((Animable) class_ac).locY -= i_13_ * 512;
		    }
		}
	    }
	    int i_22_ = 0;
	    if (i_7_ == 512) {
		for (/**/; i_22_ < 2048; i_22_++) {
		    Player var_qi = Class_fc.playersInScreen[i_22_];
		    if (var_qi != null) {
			for (int i_23_ = 0; i_23_ < 10; i_23_++) {
			    ((Entity) var_qi).regionLocalX[i_23_] -= i_12_;
			    ((Entity) var_qi).regionLocalY[i_23_] -= i_13_;
			}
			((Animable) var_qi).locY -= 512 * i_13_;
			((Animable) var_qi).locX -= i_12_ * 512;
		    }
		}
		on[] var_ons = Class_fb.j;
		for (int i_24_ = 0; var_ons.length > i_24_; i_24_++) {
		    on var_on = var_ons[i_24_];
		    if (var_on != null) {
			((on) var_on).i -= i_13_ * 512;
			((on) var_on).n -= i_12_ * 512;
		    }
		}
		for (nv var_nv = (nv) Class_u.L.a((int) 106); var_nv != null;
		     var_nv = (nv) Class_u.L.b((byte) 56)) {
		    ((nv) var_nv).k -= i_13_;
		    ((nv) var_nv).u -= i_12_;
		    if (vn.J != 4
			&& (((nv) var_nv).u < 0 || ((nv) var_nv).k < 0
			    || ((nv) var_nv).u >= Class_hc.e
			    || bw.v <= ((nv) var_nv).k))
			var_nv.unlink(-18);
		}
		if (vn.J != 4) {
		    for (sba var_sba = (sba) jt.a.b((byte) 124);
			 var_sba != null; var_sba = (sba) jt.a.b(12561)) {
			int i_25_ = (int) (0x3fffL & ((Node) var_sba).nodeID);
			int i_26_ = i_25_ - bfa.thisPlayersRegionX;
			int i_27_
			    = (int) (0x3fffL & ((Node) var_sba).nodeID >> 14);
			int i_28_ = i_27_ - BytesParser.thisPlayersRegionY;
			if (i_26_ < 0 || i_28_ < 0 || i_26_ >= Class_hc.e
			    || bw.v <= i_28_)
			    var_sba.unlink(i_7_ ^ ~0x247);
		    }
		}
		if (bca.c != 0) {
		    bca.c -= i_12_;
		    uaa.h -= i_13_;
		}
		os.b(50);
		if (i == 11) {
		    if (ll.x != 4) {
			ll.x = 1;
			ja.Cc = dj.o = -1;
		    } else {
			vaa.L -= i_12_ * 512;
			Class_k.N -= 512 * i_13_;
			fu.a -= 512 * i_12_;
			qg.j -= i_13_ * 512;
		    }
		} else {
		    dg.gb -= i_12_ * 512;
		    pca.D -= i_12_;
		    ItemDefLoader.d -= i_13_;
		    ko.c -= i_12_;
		    uc.d -= i_13_;
		    ada.N -= i_13_ * 512;
		    if (Math.abs(i_12_) > Class_hc.e || Math.abs(i_13_) > bw.v)
			Class_ad.lighting(2);
		}
		sd.a(10);
		Entity.rebuildMap((byte) -108);
		rv.o.d(i_7_ ^ 0x202);
		iq.g.d(2);
		gs.v.clearTextCoords(128);
		kh.a(i_7_ ^ ~0x252);
	    }
	}
    }
    
    final void b(boolean bool, Class_r class_r) {
	if (bool != false)
	    mb = null;
	bb++;
    }
    
    public final int c(byte i) {
	int i_29_ = -15 / ((12 - i) / 48);
	M++;
	return eb;
    }
    
    public static void i(byte i) {
	lb = null;
	if (i <= 80)
	    b(-112, -16, -106);
	jb = null;
	mb = null;
    }
    
    private final kj a(Class_r class_r, int i, boolean bool, int i_30_) {
	cb++;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 41, 0xffff & I);
	if (i_30_ != -1)
	    a((byte) 51);
	Class_i class_i;
	Class_i class_i_31_;
	if (!ib) {
	    if (((Animable) this).height_ >= 3)
		class_i = null;
	    else
		class_i = vr.b[((Animable) this).height_ + 1];
	    class_i_31_ = vr.b[((Animable) this).height_];
	} else {
	    class_i = vr.b[0];
	    class_i_31_ = wr.D[((Animable) this).height_];
	}
	return var_bda.a(i, class_r, ((Animable) this).j, class_i_31_, ((Animable) this).locX,
			 -129, class_i, ((Animable) this).locY, bool, T, eb);
    }
    
    final int g(int i) {
	H++;
	int i_32_ = 9 % ((-43 - i) / 59);
	if (V != null)
	    return V.J();
	return 0;
    }
    
    public final int a(byte i) {
	Y++;
	if (i != 42)
	    b((byte) 54);
	return T;
    }
    
    kga(Class_r class_r, ObjectDef var_bda, int i, int i_33_, int i_34_, int i_35_,
	int i_36_, boolean bool, int i_37_, int i_38_, int i_39_, int i_40_) {
	super(i_34_, i_35_, i_36_, i, i_33_, i_37_, i_38_);
	T = (byte) i_39_;
	eb = (byte) i_40_;
	((Animable) this).locY = i_36_;
	((Animable) this).locX = i_34_;
	ib = bool;
	O = ((ObjectDef) var_bda).jb != 0 && !bool;
	I = (short) ((ObjectDef) var_bda).objectID;
	X = (class_r.n() && ((ObjectDef) var_bda).hb && !ib
	     && cs.g.b(on.performance, -124) != 0);
	kj var_kj = a(class_r, 2048, X, -1);
	if (var_kj != null) {
	    hb = ((kj) var_kj).e;
	    V = ((kj) var_kj).d;
	}
    }
    
    public final boolean a(int i) {
	if (i != 3755)
	    mb = null;
	L++;
	return X;
    }
    
    final int c(int i) {
	if (i != -22496)
	    gb = null;
	W++;
	if (V == null)
	    return 0;
	return V.RA();
    }
    
    private final da a(int i, Class_r class_r, int i_41_) {
	fb++;
	if (i_41_ < 21)
	    a(-29, -42, null, 45);
	if (V != null && class_r.b(V.PA(), i) == 0)
	    return V;
	kj var_kj = a(class_r, i, false, -1);
	if (var_kj == null)
	    return null;
	return ((kj) var_kj).d;
    }
}
