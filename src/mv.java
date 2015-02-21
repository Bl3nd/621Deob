/* mv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mv
{
    static int a = -1;
    static Interface[][] b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int[] h = new int[1];
    
    static final void a(int i) {
	for (int i_0_ = 0; i_0_ < ps.npcCount; i_0_++) {
	    int i_1_ = gfa.npcIndices[i_0_];
	    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_1_);
	    if (var_mi != null) {
		NPC class_ac = ((NPCNode) var_mi).npc;
		vj.a(class_ac, ((NPCDef) ((NPC) class_ac).npcDef).Q, 0);
	    }
	}
	e++;
	int i_2_ = -102 / ((61 - i) / 63);
    }
    
    public static void a(byte i) {
	h = null;
	b = null;
	if (i != 121)
	    a = 68;
    }
    
    static int a(int i, int i_3_) {
	return i ^ i_3_;
    }
    
    static final void a(boolean bool) {
	d++;
	if (bool != true)
	    h = null;
	if (gd.a(18403)) {
	    if (Node.b == null)
		Interface.c(93);
	    n.h = true;
	    dg.zb = 0;
	}
    }
    
    public final String toString() {
	g++;
	throw new IllegalStateException();
    }
    
    static final int a(int i, byte i_4_) {
	if (i_4_ < 99)
	    return 14;
	f++;
	return (0x3f93f & i) >> 11;
    }
    
    public mv() {
	/* empty */
    }
    
    static final void a() {
	ss.a(1, dfa.G);
    }
}
