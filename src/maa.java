/* maa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

final class maa implements Runnable
{
    static int a;
    static int b;
    static int c;
    private Thread d;
    static vfa vfa;
    static int f;
    static int g;
    static int h;
    private Class_ae i = new Class_ae();
    
    private final void a(byte i, Node class_d) {
	if (i > 88) {
	    f++;
	    synchronized (this.i) {
		this.i.b(class_d, (byte) 93);
		this.i.notify();
	    }
	}
    }
    
    final void a(boolean bool) {
	c++;
	if (d != null) {
	    a((byte) 101, new Node());
	    try {
		d.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    if (bool != false)
		a(null, -16);
	    d = null;
	}
    }
    
    public static void a(int i) {
	vfa = null;
	if (i < 104)
	    vfa = null;
    }
    
    public final void run() {
	a++;
	for (;;) {
	    vm var_vm;
	    synchronized (this.i) {
		Node class_d;
		for (class_d = this.i.a(true); class_d == null;
		     class_d = this.i.a(true)) {
		    try {
			this.i.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (!(class_d instanceof vm))
		    break;
		var_vm = (vm) class_d;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName(((vm) var_vm).m).getAddress();
		i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    ((vm) var_vm).o = i;
	}
    }
    
    final vm a(String string, int i) {
	h++;
	if (d == null)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	if (i <= 75)
	    return null;
	vm var_vm = new vm(string);
	a((byte) 123, var_vm);
	return var_vm;
    }
    
    static final void a(int i, Class_r class_r, byte i_0_, int i_1_) {
	b++;
	if (i >= 0 && i_1_ >= 0 && n.i != 0 && ih.i != 0) {
	    class_r.la(up.H, Class_kf.F, n.i, ih.i);
	    class_r.da(Class_ue.e, dp.o, n.i, ih.i);
	    Class_q class_q = class_r.C();
	    class_q.na(oi.B, gn.L, dfa.I, ItemDef.g, gga.q, n.b);
	    class_r.a(class_q);
	    if (vr.b != null) {
		int i_2_ = -1;
		int i_3_ = -1;
		int i_4_ = class_r.BA();
		int i_5_ = (i - up.H) * i_4_ / n.i;
		int i_6_ = i_4_ * (i_1_ - Class_kf.F) / ih.i;
		int i_7_ = class_r.U();
		int i_8_ = i_7_ * (i - up.H) / n.i;
		int i_9_ = (i_1_ - Class_kf.F) * i_7_ / ih.i;
		int[] is = { i_5_, i_6_, i_4_ };
		class_q.YA(is);
		int[] is_10_ = { i_8_, i_9_, i_7_ };
		class_q.YA(is_10_);
		float f = 0.0F;
		int i_11_ = is_10_[0] - is[0];
		int i_12_ = is_10_[1] - is[1];
		int i_13_ = is_10_[2] - is[2];
		for (/**/; f < 1.0F; f += 0.01) {
		    int i_14_ = (int) ((float) is[0] + f * (float) i_11_);
		    int i_15_ = i_14_ >> 9;
		    int i_16_ = (int) ((float) i_13_ * f + (float) is[2]);
		    int i_17_ = i_16_ >> 9;
		    if (i_15_ > 0 && i_17_ > 0 && Class_hc.e > i_15_
			&& bw.v > i_17_) {
			int i_18_ = ((Animable) up.thisPlayer).height;
			if (i_18_ < 3 && (0x2 & tu.b[1][i_15_][i_17_]) != 0)
			    i_18_++;
			if ((float) vr.b[i_18_].a(i_16_, i_14_, true)
			    < f * (float) i_12_ + (float) is[1]) {
			    i_2_ = i_14_ + (up.thisPlayer.i(-1) - 1 << 8) >> 9;
			    i_3_ = (up.thisPlayer.i(-1) - 1 << 8) + i_16_ >> 9;
			    break;
			}
		    }
		}
		if ((i_2_ ^ 0xffffffff) != 0 && (i_3_ ^ 0xffffffff) != 0) {
		    if (!ba.c || (Class_jc.db & 0x40) == 0) {
			if (me.q == Class_pf.O)
			    lea.setClickMenuOption(i_2_, false, i_3_, -1, true, -1, i_0_ + 165,
				  0L, "", 21, GameText.faceHereText.getString((byte) -63, cba.languageID));
			lea.setClickMenuOption(i_2_, false, i_3_, -1, true, it.K, -67, 0L, "",
			      10, lw.e);
			qca.I++;
		    } else {
			Interface var_kp = ida.a(tm.t, qda.G, (byte) 102);
			if (var_kp != null)
			    lea.setClickMenuOption(i_2_, false, i_3_, -1, true, uk.d, 8, 0L,
				  " ->", 30, Class_kd.b);
			else
			    vo.c((byte) 31);
		    }
		}
	    }
	    if (i_0_ != -39)
		a(119, null, (byte) 11, 123);
	    fca var_fca = oea.fb;
	    for (og var_og = (og) var_fca.b((byte) 93); var_og != null;
		 var_og = (og) var_fca.a((byte) -106)) {
		if ((Class_g.D || ((Animable) up.thisPlayer).height == ((Animable) ((og) var_og).j).height)
		    && var_og.a(class_r, i_0_ ^ ~0x26, i_1_, i)) {
		    boolean bool = false;
		    boolean bool_19_ = false;
		    int i_20_;
		    int i_21_;
		    if (!(((og) var_og).j instanceof qda)) {
			i_21_ = ((Animable) ((og) var_og).j).locY >> 9;
			i_20_ = ((Animable) ((og) var_og).j).locX >> 9;
		    } else {
			i_20_ = ((qda) (qda) ((og) var_og).j).B;
			i_21_ = ((qda) (qda) ((og) var_og).j).x;
		    }
		    if (((og) var_og).j instanceof Player) {
			Player var_qi = (Player) ((og) var_og).j;
			int i_22_ = var_qi.i(-1);
			if (((i_22_ & 0x1) == 0
			     && (0x1ff & ((Animable) var_qi).locX) == 0
			     && (((Animable) var_qi).locY & 0x1ff) == 0)
			    || ((0x1 & i_22_) == 1
				&& (((Animable) var_qi).locX & 0x1ff) == 256
				&& (0x1ff & ((Animable) var_qi).locY) == 256)) {
			    int i_23_
				= ((Animable) var_qi).locX - (var_qi.i(-1) - 1 << 8);
			    int i_24_
				= ((Animable) var_qi).locY - (var_qi.i(-1) - 1 << 8);
			    for (int i_25_ = 0; ps.npcCount > i_25_; i_25_++) {
				NPCNode var_mi
				    = (NPCNode) uo.a.a(-32748, (long) gfa.npcIndices[i_25_]);
				if (var_mi != null) {
				    NPC class_ac = ((NPCNode) var_mi).npc;
				    if (((Entity) class_ac).sb != pm.currentTimedTicks
					&& ((Entity) class_ac).gb) {
					int i_26_
					    = (((Animable) class_ac).locX
					       - (((NPCDef) (((NPC) class_ac)
							 .npcDef)).Q - 1
						  << 8));
					int i_27_
					    = (((Animable) class_ac).locY
					       - (((NPCDef) (((NPC) class_ac)
							 .npcDef)).Q - 1
						  << 8));
					if (i_26_ >= i_23_
					    && (((NPCDef)
						 ((NPC) class_ac).npcDef).Q
						<= (var_qi.i(-1)
						    - (i_26_ - i_23_ >> 9)))
					    && i_27_ >= i_24_
					    && (((NPCDef)
						 ((NPC) class_ac).npcDef).Q
						<= (var_qi.i(-1)
						    - (i_27_ - i_24_ >> 9)))) {
					    ee.a(class_ac,
						 (((Animable) up.thisPlayer).height
						  != ((Animable) ((og) var_og).j).height),
						 (byte) -116);
					    ((Entity) class_ac).sb = pm.currentTimedTicks;
					}
				    }
				}
			    }
			    int i_28_ = oca.inScreenPlayers;
			    int[] is = vd.inScreenPlayerIDs;
			    for (int i_29_ = 0; i_28_ > i_29_; i_29_++) {
				Player var_qi_30_ = Class_fc.playersInScreen[is[i_29_]];
				if (var_qi_30_ != null
				    && pm.currentTimedTicks != ((Entity) var_qi_30_).sb
				    && var_qi_30_ != var_qi
				    && ((Entity) var_qi_30_).gb) {
				    int i_31_
					= (((Animable) var_qi_30_).locX
					   - (var_qi_30_.i(-1) - 1 << 8));
				    int i_32_
					= (((Animable) var_qi_30_).locY
					   - (var_qi_30_.i(-1) - 1 << 8));
				    if (i_31_ >= i_23_
					&& (var_qi_30_.i(-1)
					    <= (var_qi.i(i_0_ + 38)
						- (i_31_ - i_23_ >> 9)))
					&& i_32_ >= i_24_
					&& (var_qi_30_.i(-1)
					    <= (var_qi.i(i_0_ ^ 0x26)
						- (i_32_ - i_24_ >> 9)))) {
					cc.a((((Animable) ((og) var_og).j).height
					      != ((Animable) up.thisPlayer).height),
					     i_0_ + 6631, var_qi_30_);
					((Entity) var_qi_30_).sb = pm.currentTimedTicks;
				    }
				}
			    }
			}
			if (pm.currentTimedTicks == ((Entity) var_qi).sb)
			    continue;
			cc.a(((Animable) up.thisPlayer).height != ((Animable) ((og) var_og).j).height,
			     i_0_ ^ ~0x19e6, var_qi);
			((Entity) var_qi).sb = pm.currentTimedTicks;
		    }
		    if (((og) var_og).j instanceof NPC) {
			NPC class_ac = (NPC) ((og) var_og).j;
			if (((NPC) class_ac).npcDef != null) {
			    if (((0x1 & ((NPCDef) ((NPC) class_ac).npcDef).Q) == 0
				 && (0x1ff & ((Animable) class_ac).locX) == 0
				 && (0x1ff & ((Animable) class_ac).locY) == 0)
				|| (((((NPCDef) ((NPC) class_ac).npcDef).Q & 0x1)
				     == 1)
				    && (0x1ff & ((Animable) class_ac).locX) == 256
				    && (0x1ff & ((Animable) class_ac).locY) == 256)) {
				int i_33_
				    = (((Animable) class_ac).locX
				       - (((NPCDef) ((NPC) class_ac).npcDef).Q - 1
					  << 8));
				int i_34_
				    = (((Animable) class_ac).locY
				       - (((NPCDef) ((NPC) class_ac).npcDef).Q - 1
					  << 8));
				for (int i_35_ = 0; i_35_ < ps.npcCount; i_35_++) {
				    NPCNode var_mi
					= (NPCNode) uo.a.a(-32748,
						      (long) gfa.npcIndices[i_35_]);
				    if (var_mi != null) {
					NPC class_ac_36_
					    = ((NPCNode) var_mi).npc;
					if (pm.currentTimedTicks != ((Entity) class_ac_36_).sb
					    && class_ac_36_ != class_ac
					    && ((Entity) class_ac_36_).gb) {
					    int i_37_
						= (((Animable) class_ac_36_).locX
						   - ((((NPCDef) ((NPC)
							      class_ac_36_).npcDef)
						       .Q) - 1
						      << 8));
					    int i_38_
						= (((Animable) class_ac_36_).locY
						   - ((((NPCDef) ((NPC)
							      class_ac_36_).npcDef)
						       .Q) - 1
						      << 8));
					    if (i_33_ <= i_37_
						&& ((((NPCDef)
						      ((NPC) class_ac).npcDef)
						     .Q) - (i_37_ - i_33_ >> 9)
						    >= ((NPCDef) (((NPC)
							       class_ac_36_)
							      .npcDef)).Q)
						&& i_34_ <= i_38_
						&& (((NPCDef) ((NPC)
							   class_ac_36_).npcDef).Q
						    <= (((NPCDef) ((NPC)
							       class_ac).npcDef).Q
							- (i_38_ - i_34_
							   >> 9)))) {
						ee.a(class_ac_36_,
						     (((Animable) ((og) var_og).j).height
						      != ((Animable) up.thisPlayer).height),
						     (byte) -113);
						((Entity) class_ac_36_).sb = pm.currentTimedTicks;
					    }
					}
				    }
				}
				int i_39_ = oca.inScreenPlayers;
				int[] is = vd.inScreenPlayerIDs;
				for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				    Player var_qi = Class_fc.playersInScreen[is[i_40_]];
				    if (var_qi != null
					&& ((Entity) var_qi).sb != pm.currentTimedTicks
					&& ((Entity) var_qi).gb) {
					int i_41_
					    = (((Animable) var_qi).locX
					       - (var_qi.i(i_0_ ^ 0x26) - 1
						  << 8));
					int i_42_
					    = (((Animable) var_qi).locY
					       - (var_qi.i(-1) - 1 << 8));
					if (i_33_ <= i_41_
					    && (var_qi.i(-1)
						<= (((NPCDef)
						     ((NPC) class_ac).npcDef)
						    .Q) - (i_41_ - i_33_ >> 9))
					    && i_42_ >= i_34_
					    && (var_qi.i(i_0_ ^ 0x26)
						<= ((((NPCDef)
						      ((NPC) class_ac).npcDef)
						     .Q)
						    - (i_42_ - i_34_ >> 9)))) {
					    cc.a((((Animable) up.thisPlayer).height
						  != ((Animable) ((og) var_og).j).height),
						 6592, var_qi);
					    ((Entity) var_qi).sb = pm.currentTimedTicks;
					}
				    }
				}
			    }
			    if (pm.currentTimedTicks == ((Entity) class_ac).sb)
				continue;
			    ee.a(class_ac,
				 ((Animable) up.thisPlayer).height != ((Animable) ((og) var_og).j).height,
				 (byte) -122);
			    ((Entity) class_ac).sb = pm.currentTimedTicks;
			}
		    }
		    if (((og) var_og).j instanceof ip) {
			int i_43_ = bfa.thisPlayersRegionX + i_20_;
			int i_44_ = i_21_ + BytesParser.thisPlayersRegionY;
			sba var_sba
			    = ((sba)
			       jt.a.a(-32748,
				      (long) (i_43_
					      | (i_44_ << 14
						 | (((Animable) ((og) var_og).j).height
						    << 28)))));
			if (var_sba != null) {
			    for (fn var_fn = (fn) ((sba) var_sba).o.c(false);
				 var_fn != null;
				 var_fn = (fn) ((sba) var_sba).o.c(16)) {
				ItemDef var_uv = laa.itemDefLoader.d(12388, ((fn) var_fn).o);
				if (ba.c && (((Animable) up.thisPlayer).height
					     == ((Animable) ((og) var_og).j).height)) {
				    vu var_vu
					= ((nu.h ^ 0xffffffff) == 0 ? null
					   : jba.b.a((byte) 6, nu.h));
				    if ((Class_jc.db & 0x1) != 0
					&& (var_vu == null
					    || (var_uv.a(nu.h, ((vu) var_vu).h,
							 -123)
						!= ((vu) var_vu).h))) {
					lea.setClickMenuOption(i_20_, false, i_21_, -1, true,
					      uk.d, 126,
					      (long) ((fn) var_fn).o,
					      (Class_ag.k + " -> <col=ff9040>"
					       + ((ItemDef) var_uv).itemName),
					      48, Class_kd.b);
					ul.z++;
				    }
				}
				if (((Animable) ((og) var_og).j).height
				    == ((Animable) up.thisPlayer).height) {
				    String[] strings = ((ItemDef) var_uv).groundActions;
				    for (int i_45_ = 4; i_45_ >= 0; i_45_--) {
					if (strings != null
					    && strings[i_45_] != null) {
					    int i_46_ = 0;
					    int i_47_ = jt.b;
					    if (i_45_ == 0)
						i_46_ = 25;
					    if (i_45_ == 1)
						i_46_ = 11;
					    if (i_45_ == 2)
						i_46_ = 6;
					    if (i_45_ == 3)
						i_46_ = 46;
					    if (i_45_ == 4)
						i_46_ = 16;
					    if (i_45_ == ((ItemDef) var_uv).Eb)
						i_47_ = ((ItemDef) var_uv).i;
					    if (((ItemDef) var_uv).kb == i_45_)
						i_47_ = ((ItemDef) var_uv).fb;
					    iq.d++;
					    lea.setClickMenuOption(i_20_, false, i_21_, -1,
						  true, i_47_, 8,
						  (long) ((fn) var_fn).o,
						  ("<col=ff9040>"
						   + ((ItemDef) var_uv).itemName),
						  i_46_, strings[i_45_]);
					}
				    }
				}
				lea.setClickMenuOption(i_20_,
				      (((Animable) ((og) var_og).j).height
				       != ((Animable) up.thisPlayer).height),
				      i_21_, -1, true, ml.h, 127,
				      (long) ((fn) var_fn).o,
				      "<col=ff9040>" + ((ItemDef) var_uv).itemName, 1004,
				      GameText.examineText.getString((byte) -93, cba.languageID));
				rba.e++;
			    }
			}
		    }
		    if (((og) var_og).j instanceof vda) {
			vda var_vda = (vda) ((og) var_og).j;
			ObjectDef var_bda = ul.k.getObjectDef((byte) 51, var_vda.b((byte) 127));
			if (((ObjectDef) var_bda).xb != null)
			    var_bda = var_bda.a(cp.e, i_0_ - 1604);
			if (var_bda != null) {
			    if (ba.c
				&& ((Animable) ((og) var_og).j).height == ((Animable) up.thisPlayer).height) {
				vu var_vu = ((nu.h ^ 0xffffffff) == 0 ? null
					     : jba.b.a((byte) 6, nu.h));
				if ((Class_jc.db & 0x4) != 0
				    && (var_vu == null
					|| (var_bda.a(nu.h, i_0_ + 102,
						      ((vu) var_vu).h)
					    != ((vu) var_vu).h))) {
				    lea.setClickMenuOption(i_20_, false, i_21_, -1, true, uk.d,
					  127, lu.a(i_21_, i_20_, -1, var_vda),
					  (Class_ag.k + " -> <col=00ffff>"
					   + ((ObjectDef) var_bda).objectName),
					  19, Class_kd.b);
				    faa.b++;
				}
			    }
			    if (((Animable) ((og) var_og).j).height == ((Animable) up.thisPlayer).height) {
				String[] strings = ((ObjectDef) var_bda).T;
				if (strings != null) {
				    for (int i_48_ = 4; i_48_ >= 0; i_48_--) {
					if (strings[i_48_] != null) {
					    int i_49_ = 0;
					    if (i_48_ == 0)
						i_49_ = 22;
					    int i_50_ = jt.b;
					    if (i_48_ == 1)
						i_49_ = 47;
					    if (i_48_ == 2)
						i_49_ = 18;
					    if (i_48_ == 3)
						i_49_ = 51;
					    if (i_48_ == ((ObjectDef) var_bda).Hb)
						i_50_ = ((ObjectDef) var_bda).z;
					    if (i_48_ == 4)
						i_49_ = 1009;
					    if (i_48_ == ((ObjectDef) var_bda).H)
						i_50_ = ((ObjectDef) var_bda).a;
					    lea.setClickMenuOption(i_20_, false, i_21_, -1,
						  true, i_50_, 29,
						  lu.a(i_21_, i_20_,
						       i_0_ ^ 0x26, var_vda),
						  ("<col=00ffff>"
						   + ((ObjectDef) var_bda).objectName),
						  i_49_, strings[i_48_]);
					    dga.P++;
					}
				    }
				}
			    }
			    gi.m++;
			    lea.setClickMenuOption(i_20_,
				  ((Animable) up.thisPlayer).height != ((Animable) ((og) var_og).j).height,
				  i_21_, -1, true, ml.h, 126,
				  (long) ((ObjectDef) var_bda).objectID,
				  "<col=00ffff>" + ((ObjectDef) var_bda).objectName, 1008,
				  GameText.examineText.getString((byte) -41, cba.languageID));
			}
		    }
		}
	    }
	}
    }
    
    public maa() {
	d = new Thread(this);
	d.setDaemon(true);
	d.start();
    }
}
