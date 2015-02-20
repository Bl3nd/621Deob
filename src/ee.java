/* ee - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.net.URL;

final class ee
{
    static int a;
    static int b;
    static int c;
    static String d;
    static int e;
    static int f;
    static int g;
    
    static final boolean a(int i, String string, int i_0_) {
	e++;
	if (((Signlink) nda.signlink).r) {
	    gm.world = new World();
	    ((World) gm.world).worldID = i;
	    ((World) gm.world).lobbyAddress = string;
	    if (hs.modeWhere != oba.K) {
		((World) gm.world).firstPort = ((World) gm.world).worldID + 40000;
		((World) gm.world).secondPort = ((World) gm.world).worldID + 50000;
	    }
	    if (i < il.o.length && il.o[i] != null)
		cd.worldFlags = ((he) il.o[i]).e;
	    return true;
	}
	String string_1_ = "";
	if (oba.K != hs.modeWhere)
	    string_1_ = ":" + (i + 7000);
	String string_2_ = "";
	if (i_0_ != 55)
	    a((int) 81, null, 111);
	if (ow.settings != null)
	    string_2_ = "/p=" + ow.settings;
	String string_3_
	    = ("http://" + string + string_1_ + "/l=" + cba.languageID + "/nullLoader=" + hl.affId
	       + string_2_ + "/j" + (GameInPacket.l ? "1" : "0") + ",o"
	       + (!dm.d ? "0" : "1") + ",a2");
	try {
	    po.c.getAppletContext().showDocument(new URL(string_3_), "_self");
	} catch (Exception exception) {
	    return false;
	}
	return true;
    }
    
    static final Class_r a(Canvas canvas, byte i, fa var_fa) {
	c++;
	if (i != 105)
	    return null;
	return new l(canvas, var_fa);
    }
    
    static long a(long l, long l_4_) {
	return l & l_4_;
    }
    
    static final void a(NPC class_ac, boolean bool, byte i) {
	a++;
	if (mu.j < 400) {
	    if (i > -109)
		a((int) 58, null, 12);
	    NPCDef hoverOverNPC = ((NPC) class_ac).npcDef;
	    if (((NPCDef) hoverOverNPC).L != null) {
		hoverOverNPC = hoverOverNPC.a(-4261, cp.e);
		if (hoverOverNPC == null)
		    return;
	    }
	    if (((NPCDef) hoverOverNPC).m) {
	    	String string = ((NPCDef) hoverOverNPC).npcName;
		if (((NPCDef) hoverOverNPC).combatLevel != 0) {
		    String string_5_
			= (Class_pf.O != me.q ? GameText.K.getString((byte) -42, cba.languageID)
			   : GameText.M.getString((byte) -97, cba.languageID));
		    string
			+= (cq.getColorForPlayerName(((NPCDef) hoverOverNPC).combatLevel, true, ((Player) up.thisPlayer).combatLevel) + " ("
			    + (String) string_5_ + ((NPCDef) hoverOverNPC).combatLevel + ")");
		}
		if (ba.c && !bool) {
		    vu var_vu = nu.h != -1 ? jba.b.a((byte) 6, nu.h) : null;
		    if ((Class_jc.db & 0x2) != 0
			&& (var_vu == null
			    || (hoverOverNPC.a(((vu) var_vu).h, nu.h, false)
				!= ((vu) var_vu).h))) {
			jk.l++;
			lea.setClickMenuOption(0, false, 0, -1, true, uk.d, -46,
			      (long) ((Entity) class_ac).lb,
			      Class_ag.k + " -> <col=ffff00>" + string, 20,
			      Class_kd.b);
		    }
		}
		if (!bool) {
		    String[] strings = ((NPCDef) hoverOverNPC).actions;
		    if (Login.h)
			strings = mr.a(84, strings);
		    if (strings != null) {
			for (int i_6_ = 4; i_6_ >= 0; i_6_--) {
			    if (strings[i_6_] != null
				&& (((NPCDef) hoverOverNPC).D == 0
				    || !(strings[i_6_].equalsIgnoreCase
					 (GameText.F.getString((byte) -69, cba.languageID))))) {
				int i_7_ = 0;
				int i_8_ = jt.b;
				if (i_6_ == 0)
				    i_7_ = 23;
				if (i_6_ == 1)
				    i_7_ = 5;
				if (i_6_ == 2)
				    i_7_ = 17;
				if (i_6_ == 3)
				    i_7_ = 58;
				if (i_6_ == ((NPCDef) hoverOverNPC).a)
				    i_8_ = ((NPCDef) hoverOverNPC).B;
				if (i_6_ == 4)
				    i_7_ = 13;
				if (i_6_ == ((NPCDef) hoverOverNPC).X)
				    i_8_ = ((NPCDef) hoverOverNPC).T;
				lea.setClickMenuOption(0, false, 0, -1, true,
				      (!(strings[i_6_].equalsIgnoreCase
					 (GameText.F.getString((byte) 105, cba.languageID)))
				       ? i_8_ : ((NPCDef) hoverOverNPC).mb),
				      -51, (long) ((Entity) class_ac).lb,
				      "<col=ffff00>" + string, i_7_,
				      strings[i_6_]);
				vca.b++;
			    }
			}
		    }
		    if (((NPCDef) hoverOverNPC).D == 1 && strings != null) {
			for (int i_9_ = 4; i_9_ >= 0; i_9_--) {
			    if (strings[i_9_] != null
				&& (strings[i_9_].equalsIgnoreCase
				    (GameText.F.getString((byte) -116, cba.languageID)))) {
				short i_10_ = 0;
				if (((Player) up.thisPlayer).combatLevel < ((NPCDef) hoverOverNPC).combatLevel)
				    i_10_ = (short) 2000;
				short i_11_ = 0;
				if (i_9_ == 0)
				    i_11_ = (short) 23;
				if (i_9_ == 1)
				    i_11_ = (short) 5;
				if (i_9_ == 2)
				    i_11_ = (short) 17;
				if (i_9_ == 3)
				    i_11_ = (short) 58;
				if (i_9_ == 4)
				    i_11_ = (short) 13;
				if (i_11_ != 0)
				    i_11_ += i_10_;
				lea.setClickMenuOption(0, false, 0, -1, true, ((NPCDef) hoverOverNPC).mb,
				      -71, (long) ((Entity) class_ac).lb,
				      "<col=ffff00>" + string, i_11_,
				      strings[i_9_]);
				pp.r++;
			    }
			}
		    }
		}
		lea.setClickMenuOption(0, bool, 0, -1, true, ml.h, 126,
		      (long) ((Entity) class_ac).lb, "<col=ffff00>" + string, 1001,
		      GameText.E.getString((byte) -81, cba.languageID));
		daa.var_n++;
	    }
	}
    }
    
    static final void a(int i, byte i_12_) {
	ok.G = i;
	int i_13_ = 96 / ((-37 - i_12_) / 58);
	f++;
	synchronized (hv.p) {
	    hv.p.a(18385);
	}
    }
    
    static final void a(byte i, int i_14_, int i_15_) {
	g++;
	if (me.q != Class_pf.O) {
	    if (la.a(1, 0, -3, 1, 0, false, i_14_, i_15_, 1))
		return;
	    la.a(i + 68, 0, -2, 1, 0, false, i_14_, i_15_, 1);
	} else {
	    if (la.a(1, 0, -2, 1, 0, false, i_14_, i_15_, 1))
		return;
	    la.a(1, 0, -3, 1, 0, false, i_14_, i_15_, 1);
	}
	if (i != -67)
	    a(83);
    }
    
    static final Interface a(int i, Interface var_kp) {
	b++;
	Interface var_kp_16_ = client.a(var_kp);
	int i_17_ = 10 / ((-51 - i) / 56);
	if (var_kp_16_ == null)
	    var_kp_16_ = ((Interface) var_kp).fd;
	return var_kp_16_;
    }
    
    public static void a(int i) {
	d = null;
	if (i != 19714)
	    d = null;
    }
}
