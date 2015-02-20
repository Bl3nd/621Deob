/* ao - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ao extends ua
{
    static int f;
    ls g;
    static int h = -1;
    static int i;
    static int j;
    static int k = 0;
    static GameInPacket incomingPacket12 = new GameInPacket(12, -1);
    static int m;
    
    static final la a(boolean bool, int i, Class_r class_r, int i_0_) {
	m++;
	bq var_bq = wo.a((byte) -56, i, class_r, bool);
	if (i_0_ != 0)
	    return null;
	if (var_bq == null)
	    return null;
	return ((bq) var_bq).g;
    }
    
    static final void a(int i, int i_1_, int i_2_, byte i_3_) {
	i_1_ = ((jb) cs.g).N * i_1_ >> 8;
	f++;
	if (i_3_ != -123)
	    h = 97;
	if ((i ^ 0xffffffff) != 0 || Class_jc.ib) {
	    if ((i ^ 0xffffffff) != 0 && (i != ws.G || !ir.a(true))
		&& i_1_ != 0 && !Class_jc.ib)
		Class_hc.a(i_1_, false, i, mq.a, i_2_, 0, (byte) 117);
	} else
	    ku.a(true);
	ws.G = i;
    }
    
    static final void b(int i) {
	j++;
	for (ri var_ri = (ri) iq.g.a((int) 86); var_ri != null;
	     var_ri = (ri) iq.g.b((byte) 122)) {
	    bi var_bi = ((ri) var_ri).s;
	    if (((bi) var_bi).mb < pm.currentTimedTicks) {
		var_ri.unlink(-61);
		var_bi.a((byte) 105);
	    } else if (((bi) var_bi).tb <= pm.currentTimedTicks) {
		if (((bi) var_bi).ub > 0) {
		    NPCNode var_mi
			= (NPCNode) uo.a.a(-32748, (long) (((bi) var_bi).ub - 1));
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			if (((Animable) class_ac).locX >= 0
			    && 512 * Class_hc.e > ((Animable) class_ac).locX
			    && ((Animable) class_ac).locY >= 0
			    && bw.v * 512 > ((Animable) class_ac).locY)
			    var_bi.a(((Animable) class_ac).locY, ((Animable) class_ac).locX, 0,
				     pm.currentTimedTicks,
				     (Class_u.b(((Animable) class_ac).locX,
						((Animable) var_bi).height, -20214,
						((Animable) class_ac).locY)
				      - ((bi) var_bi).jb));
		    }
		}
		if (((bi) var_bi).ub < 0) {
		    int i_4_ = -((bi) var_bi).ub - 1;
		    Player var_qi;
		    if (i_4_ == ih.n)
			var_qi = up.thisPlayer;
		    else
			var_qi = Class_fc.playersInScreen[i_4_];
		    if (var_qi != null && ((Animable) var_qi).locX >= 0
			&& ((Animable) var_qi).locX < Class_hc.e * 512
			&& ((Animable) var_qi).locY >= 0
			&& ((Animable) var_qi).locY < 512 * bw.v)
			var_bi.a(((Animable) var_qi).locY, ((Animable) var_qi).locX, 0, pm.currentTimedTicks,
				 (Class_u.b(((Animable) var_qi).locX, ((Animable) var_bi).height,
					    -20214, ((Animable) var_qi).locY)
				  - ((bi) var_bi).jb));
		}
		var_bi.a(nq.x, 0);
		to.a(var_bi, true);
	    }
	}
	if (i > -64)
	    a(-68, 62, -61, (byte) -46);
    }
    
    public static void a(byte i) {
	incomingPacket12 = null;
	if (i >= -99)
	    incomingPacket12 = null;
    }
    
    ao(en var_en, int i, int i_5_, byte[] is) {
	((ao) this).g = var_en.a(is, i, i_5_, NPCDef.hb, false, (byte) 73);
	((ao) this).g.a((byte) -81, false, false);
    }
    
    ao(en var_en, int i, int i_6_, int[] is) {
	((ao) this).g = var_en.a(i, false, i_6_, is, (byte) 65);
	((ao) this).g.a((byte) -81, false, false);
    }
    
    static final int a(byte i, float f, float f_7_, float f_8_) {
	ao.i++;
	float f_9_ = f_8_ < 0.0F ? -f_8_ : f_8_;
	if (i > -90)
	    incomingPacket12 = null;
	float f_10_ = f < 0.0F ? -f : f;
	float f_11_ = !(f_7_ < 0.0F) ? f_7_ : -f_7_;
	if (f_9_ < f_10_ && f_11_ < f_10_) {
	    if (!(f > 0.0F))
		return 1;
	    return 0;
	}
	if (f_9_ < f_11_ && f_11_ > f_10_) {
	    if (!(f_7_ > 0.0F))
		return 3;
	    return 2;
	}
	if (f_8_ > 0.0F)
	    return 4;
	return 5;
    }
}
