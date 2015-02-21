/* nn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nn implements oc
{
    int a;
    int b;
    int c;
    static pu d = new pu(0, 0);
    String e;
    int f;
    int g;
    rc h;
    static int i;
    int j;
    int k;
    int l;
    static int m;
    int n;
    int o;
    ct p;
    static GameInPacket incomingPacket101 = new GameInPacket(101, 16);
    
    static final void b(int i) {
	nn.i++;
	if (i != -1)
	    b(50);
	int i_0_ = oca.inScreenPlayers;
	int[] is = vd.inScreenPlayerIDs;
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    Player var_qi = Class_fc.playersInScreen[is[i_1_]];
	    if (var_qi != null && ((Entity) var_qi).Q > 0) {
		((Entity) var_qi).Q--;
		if (((Entity) var_qi).Q == 0)
		    ((Entity) var_qi).cb = null;
	    }
	}
	for (int i_2_ = 0; i_2_ < ps.npcCount; i_2_++) {
	    long l = (long) gfa.npcIndices[i_2_];
	    NPCNode var_mi = (NPCNode) uo.a.a(-32748, l);
	    if (var_mi != null) {
		NPC class_ac = ((NPCNode) var_mi).npc;
		if (((Entity) class_ac).Q > 0) {
		    ((Entity) class_ac).Q--;
		    if (((Entity) class_ac).Q == 0)
			((Entity) class_ac).cb = null;
		}
	    }
	}
    }
    
    public static void c(int i) {
	d = null;
	incomingPacket101 = null;
	if (i != -1)
	    b(27);
    }
    
    nn(String string, ct var_ct, rc var_rc, int i, int i_3_, int i_4_,
       int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
       int i_11_) {
	((nn) this).f = i_4_;
	((nn) this).h = var_rc;
	((nn) this).k = i_11_;
	((nn) this).g = i_7_;
	((nn) this).o = i;
	((nn) this).b = i_9_;
	((nn) this).n = i_8_;
	((nn) this).e = string;
	((nn) this).j = i_3_;
	((nn) this).p = var_ct;
	((nn) this).c = i_10_;
	((nn) this).l = i_5_;
	((nn) this).a = i_6_;
    }
    
    public final wea a(int i) {
	if (i < 38)
	    ((nn) this).b = -123;
	m++;
	return Class_gb.c;
    }
}
