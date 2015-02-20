/* mi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPCNode extends Node
{
    static boolean k = true;
    NPC l;
    static int m;
    
    static final void a(int i, int i_0_) {
	m++;
	if (gf.a((byte) 111, i_0_)) {
	    Interface[] var_kps = aa.o[i_0_];
	    if (i >= -87)
		a(-9, 6);
	    for (int i_1_ = 0; var_kps.length > i_1_; i_1_++) {
		Interface var_kp = var_kps[i_1_];
		if (var_kp != null) {
		    ((Interface) var_kp).R = 0;
		    ((Interface) var_kp).rc = 1;
		    ((Interface) var_kp).s = 0;
		}
	    }
	}
    }
    
    NPCNode(NPC class_ac) {
	((NPCNode) this).l = class_ac;
    }
}
