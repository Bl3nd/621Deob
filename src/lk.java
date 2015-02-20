/* lk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lk extends Node
{
    static f k;
    static int l;
    static int m;
    short n;
    
    public lk() {
	/* empty */
    }
    
    static final void a(LoginStream var_loginStream, int i) {
	m++;
	var_loginStream.initBits(i + 8);
	int i_0_ = ih.n;
	Player var_qi = up.thisPlayer = Class_fc.playersInScreen[i_0_] = new Player();
	((Entity) var_qi).lb = i_0_;
	int i_1_ = var_loginStream.readBits(false, 30);
	byte i_2_ = (byte) (i_1_ >> 28);
	int i_3_ = (i_1_ & 0xfffcd27) >> 14;
	((Entity) var_qi).regionLocalX[0] = i_3_ - bfa.thisPlayersRegionX;
	int i_4_ = 0x3fff & i_1_;
	((Animable) var_qi).locX = (((Entity) var_qi).regionLocalX[0] << 9) + (var_qi.i(-1) << 8);
	((Entity) var_qi).regionLocalY[i] = i_4_ - BytesParser.thisPlayersRegionY;
	((Animable) var_qi).locY = (((Entity) var_qi).regionLocalY[0] << 9) + (var_qi.i(-1) << 8);
	vo.clientHeight = ((Animable) var_qi).height = ((Animable) var_qi).h = i_2_;
	if (ItemDef.b(((Entity) var_qi).regionLocalY[0], ((Entity) var_qi).regionLocalX[0], 5706))
	    ((Animable) var_qi).h++;
	if (vo.J[i_0_] != null)
	    var_qi.playerAppearanceUpdate(-1, vo.J[i_0_]);
	oca.inScreenPlayers = 0;
	vd.inScreenPlayerIDs[oca.inScreenPlayers++] = i_0_;
	tea.skipHistory[i_0_] = (byte) 0;
	lu.outScreenPlayers = 0;
	for (int i_5_ = 1; i_5_ < 2048; i_5_++) {
	    if (i_0_ != i_5_) {
		int i_6_ = var_loginStream.readBits(false, 18);
		int i_7_ = i_6_ >> 16;
		int i_8_ = 0xff & i_6_ >> 8;
		int i_9_ = 0xff & i_6_;
		GPIPlayer var_qq = ega.gpiPlayers[i_5_] = new GPIPlayer();
		((GPIPlayer) var_qq).faceEntityID = -1;
		((GPIPlayer) var_qq).b = false;
		((GPIPlayer) var_qq).locationHash = (i_7_ << 28) - (-(i_8_ << 14) - i_9_);
		((GPIPlayer) var_qq).orientation = 0;
		gba.outScreenPlayerIDs[lu.outScreenPlayers++] = i_5_;
		tea.skipHistory[i_5_] = (byte) 0;
	    }
	}
	var_loginStream.finishBits((byte) -76);
    }
    
    lk(short i) {
	((lk) this).n = i;
    }
    
    static final void a(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_, int i_16_, int i_17_,
			int i_18_) {
	l++;
	nv var_nv = null;
	nv var_nv_19_ = (nv) Class_u.L.a(i ^ ~0x55);
	if (i != -1)
	    a(null, 12);
	for (/**/; var_nv_19_ != null;
	     var_nv_19_ = (nv) Class_u.L.b((byte) 50)) {
	    if (((nv) var_nv_19_).t == i_11_ && i_17_ == ((nv) var_nv_19_).u
		&& i_16_ == ((nv) var_nv_19_).k
		&& ((nv) var_nv_19_).o == i_18_) {
		var_nv = var_nv_19_;
		break;
	    }
	}
	if (var_nv == null) {
	    var_nv = new nv();
	    ((nv) var_nv).u = i_17_;
	    ((nv) var_nv).k = i_16_;
	    ((nv) var_nv).o = i_18_;
	    ((nv) var_nv).t = i_11_;
	    if (i_17_ >= 0 && i_16_ >= 0 && i_17_ < Class_hc.e && i_16_ < bw.v)
		rh.a(var_nv, i ^ 0x7b);
	    Class_u.L.b(var_nv, (byte) 93);
	}
	((nv) var_nv).n = i_14_;
	((nv) var_nv).l = i_13_;
	((nv) var_nv).s = i_10_;
	((nv) var_nv).m = i_15_;
	((nv) var_nv).v = i_12_;
    }
    
    public static void a(int i) {
	k = null;
	if (i != 1201566057)
	    k = null;
    }
}
