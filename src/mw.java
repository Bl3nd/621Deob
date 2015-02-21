/* mw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class mw extends cl
{
    static int t;
    static int u;
    static fca v = new fca();
    private boolean w;
    static int x;
    private ml y;
    private ml z;
    private ml A;
    static int B;
    static int C;
    static int D;
    static int E;
    private ml F;
    private boolean G;
    static int H;
    static int I;
    static int J;
    static int K;
    private ls L;
    private boolean M;
    private float[] N = new float[4];
    
    final void a(int i, boolean bool) {
	G = bool;
	J++;
	((cl) this).l.e(0, 1);
	((cl) this).l.a(L, 0);
	int i_0_ = -28 % ((52 - i) / 36);
	((cl) this).l.a(wi.e, true, ku.k);
	((cl) this).l.a(0, 1, ik.o);
	((cl) this).l.a(false, mca.l, 2, true, (byte) -105);
	((cl) this).l.a(0, bu.u, -18836);
	((cl) this).l.e(0, 0);
	e(-16573);
    }
    
    final void e(int i) {
	x++;
	int i_1_ = ((cl) this).l.c(true);
	mga var_mga = ((cl) this).l.l((byte) 88);
	if (G)
	    OpenGL.glBindProgramARB(34336, (i_1_ != 2147483647 ? ((ml) A).b
					    : ((ml) z).b));
	else
	    OpenGL.glBindProgramARB(34336, (i_1_ == 2147483647 ? ((ml) F).b
					    : ((ml) y).b));
	OpenGL.glEnable(34336);
	M = true;
	var_mga.a(0.0F, N, -1.0F, 0, (float) i_1_, 0.0F);
	if (i != -16573)
	    a(-69, true);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, N[0], N[1], N[2], N[3]);
	b(26185);
    }
    
    final void a(int i, int i_2_, hfa var_hfa) {
	D++;
	if (i_2_ > 47) {
	    ((cl) this).l.a(var_hfa, 0);
	    ((cl) this).l.f(i, 0);
	}
    }
    
    final void d(int i) {
	B++;
	((cl) this).l.e(0, 1);
	((cl) this).l.a((hfa) null, 0);
	((cl) this).l.a(Class_rf.e, true, Class_rf.e);
	if (i == -19092) {
	    ((cl) this).l.a(0, 1, mca.l);
	    ((cl) this).l.a(2, i ^ ~0x4a92, ik.o);
	    ((cl) this).l.a(0, mca.l, -18836);
	    ((cl) this).l.e(0, 0);
	    if (M) {
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
		M = false;
	    }
	}
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    L = null;
	E++;
	return w;
    }
    
    public static void d(byte i) {
	int i_3_ = 3 / ((57 - i) / 41);
	v = null;
    }
    
    mw(lm var_lm, pl var_pl) {
	super(var_lm);
	if (var_pl != null && ((lm) var_lm).wi) {
	    F = in.a((byte) 100, var_pl.a(103, "gl", "uw_ground_unlit"),
		     var_lm, 34336);
	    z = in.a((byte) 107, var_pl.a(103, "gl", "uw_ground_lit"), var_lm,
		     34336);
	    y = in.a((byte) 124, var_pl.a(78, "gl", "uw_model_unlit"), var_lm,
		     34336);
	    A = in.a((byte) 125, var_pl.a(58, "gl", "uw_model_lit"), var_lm,
		     34336);
	    if (!(y != null & (F != null & z != null) & A != null))
		w = false;
	    else {
		L = ((cl) this).l.a(2, false, 1, new int[] { 0, -1 },
				    (byte) 76);
		L.a((byte) -81, false, false);
		w = true;
	    }
	} else
	    w = false;
    }
    
    final void b(int i) {
	if (M) {
	    int i_4_ = ((cl) this).l.U();
	    int i_5_ = ((cl) this).l.BA();
	    float f = (float) i_4_ - 0.125F * (float) (i_4_ - i_5_);
	    float f_6_ = (float) i_4_ - (float) (i_4_ - i_5_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_6_, f, 1.0F / (float) ((cl) this).l.U(9),
		 (float) ((cl) this).l.S(-30561) / 255.0F);
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.c((byte) 48, ((cl) this).l.d(true));
	    ((cl) this).l.e(0, 0);
	}
	u++;
	if (i != 26185)
	    H = 61;
    }
    
    final void a(boolean bool, boolean bool_7_) {
	if (bool != true)
	    z = null;
	K++;
    }
    
    static final void b(int i, boolean bool) {
	t++;
	while (faa.loginStream.b(false, ck.currentGameInPacketSize) >= 15) {
	    int i_8_ = faa.loginStream.readBits(false, 15);
	    if (i_8_ == 32767)
		break;
	    boolean bool_9_ = false;
	    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_8_);
	    if (var_mi == null) {
		NPC class_ac = new NPC();
		((Entity) class_ac).lb = i_8_;
		var_mi = new NPCNode(class_ac);
		uo.a.a(var_mi, (byte) -48, (long) i_8_);
		ii.npcNodes[ObjectDef.Ib++] = var_mi;
		bool_9_ = true;
	    }
	    NPC class_ac = ((NPCNode) var_mi).npc;
	    gfa.npcIndices[ps.npcCount++] = i_8_;
	    ((Entity) class_ac).U = pm.currentTimedTicks;
	    if (((NPC) class_ac).npcDef != null
		&& ((NPC) class_ac).npcDef.a((byte) -76))
		ei.a(class_ac, (byte) -126);
	    int i_10_ = faa.loginStream.readBits(false, 1);
	    if (i_10_ == 1)
		sk.v[pfa.e++] = i_8_;
	    int i_11_;
	    if (!bool) {
		i_11_ = faa.loginStream.readBits(false, 5);
		if (i_11_ > 15)
		    i_11_ -= 32;
	    } else {
		i_11_ = faa.loginStream.readBits(false, 8);
		if (i_11_ > 127)
		    i_11_ -= 256;
	    }
	    int i_12_ = faa.loginStream.readBits(false, 2);
	    int i_13_ = faa.loginStream.readBits(false, 1);
	    class_ac.a(jm.p.getNPCDef(faa.loginStream.readBits(false, 14), (byte) -117), 0);
	    int i_14_ = (~0x547ffff8 & faa.loginStream.readBits(false, 3) + 4) << 11;
	    int i_15_;
	    if (!bool) {
		i_15_ = faa.loginStream.readBits(false, 5);
		if (i_15_ > 15)
		    i_15_ -= 32;
	    } else {
		i_15_ = faa.loginStream.readBits(false, 8);
		if (i_15_ > 127)
		    i_15_ -= 256;
	    }
	    class_ac.a(((NPCDef) ((NPC) class_ac).npcDef).Q, 0);
	    ((Entity) class_ac).Zb = ((NPCDef) ((NPC) class_ac).npcDef).U << 3;
	    if (bool_9_)
		class_ac.a(i_14_, 1003, true);
	    class_ac.a(i_13_ == 1, i_15_ + ((Entity) up.thisPlayer).regionLocalY[0], (byte) 45,
		       class_ac.i((int) -1), i_12_, ((Entity) up.thisPlayer).regionLocalX[0] + i_11_);
	    if (((NPC) class_ac).npcDef.a((byte) 119))
		kg.a(-112, null, null, 0, class_ac, ((Entity) class_ac).regionLocalX[0],
		     ((Entity) class_ac).regionLocalY[0], ((Animable) class_ac).height);
	}
	faa.loginStream.finishBits((byte) -127);
	int i_16_ = 16 / ((i - 24) / 32);
    }
    
    final void a(int i, int i_17_, byte i_18_) {
	C++;
	if (i_18_ != 65)
	    F = null;
    }
    
    static final int a(byte i, Entity var_ni) {
	I++;
	if (((Entity) var_ni).Zb == 0)
	    return 0;
	int i_19_ = 105 % ((75 - i) / 37);
	if ((((Entity) var_ni).faceEntityID ^ 0xffffffff) != 0) {
	    Entity var_ni_20_ = null;
	    if (((Entity) var_ni).faceEntityID >= 32768) {
		if (((Entity) var_ni).faceEntityID >= 32768)
		    var_ni_20_ = Class_fc.playersInScreen[((Entity) var_ni).faceEntityID - 32768];
	    } else {
		NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) ((Entity) var_ni).faceEntityID);
		if (var_mi != null)
		    var_ni_20_ = ((NPCNode) var_mi).npc;
	    }
	    if (var_ni_20_ != null) {
		int i_21_ = ((Animable) var_ni).locX - ((Animable) var_ni_20_).locX;
		int i_22_ = ((Animable) var_ni).locY - ((Animable) var_ni_20_).locY;
		if (i_21_ != 0 || i_22_ != 0)
		    var_ni.a(false,
			     (int) (Math.atan2((double) i_21_, (double) i_22_)
				    * 2607.5945876176133) & 0x3fff);
	    }
	}
	if (!(var_ni instanceof Player)) {
	    if (var_ni instanceof NPC) {
		NPC class_ac = (NPC) var_ni;
		if ((((NPC) class_ac).Rc ^ 0xffffffff) != 0
		    && (((Entity) class_ac).Nc == 0 || ((Entity) class_ac).Fc > 0)) {
		    int i_23_ = (((Animable) class_ac).locX
				 - ((-bfa.thisPlayersRegionX - bfa.thisPlayersRegionX + ((NPC) class_ac).Rc)
				    * 256));
		    int i_24_ = ((Animable) class_ac).locY - (((NPC) class_ac).bd
						     - (BytesParser.thisPlayersRegionY + BytesParser.thisPlayersRegionY)) * 256;
		    if (i_23_ != 0 || i_24_ != 0)
			class_ac.a(false,
				   (0x3fff
				    & (int) (2607.5945876176133
					     * Math.atan2((double) i_23_,
							  (double) i_24_))));
		    ((NPC) class_ac).Rc = -1;
		}
	    }
	} else {
	    Player var_qi = (Player) var_ni;
	    if ((((Player) var_qi).orientation ^ 0xffffffff) != 0
		&& (((Entity) var_qi).Nc == 0 || ((Entity) var_qi).Fc > 0)) {
		var_qi.a(false, ((Player) var_qi).orientation);
		((Player) var_qi).orientation = -1;
	    }
	}
	return var_ni.b();
    }
}
