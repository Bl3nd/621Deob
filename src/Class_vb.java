/* Class_vb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_vb extends Node
{
    int k;
    boolean l;
    int m;
    int n;
    int o = -1;
    int p;
    static GameOutPacket q = new GameOutPacket(11, 3);
    static int r = 503;
    static pl s;
    int t;
    static int u = -1;
    
    static final void a(Animable[] var_los, int i, int i_0_) {
	if (i < i_0_) {
	    int i_1_ = (i + i_0_) / 2;
	    int i_2_ = i;
	    Animable var_lo = var_los[i_1_];
	    var_los[i_1_] = var_los[i_0_];
	    var_los[i_0_] = var_lo;
	    int i_3_ = ((Animable) var_lo).g;
	    for (int i_4_ = i; i_4_ < i_0_; i_4_++) {
		if (((Animable) var_los[i_4_]).g < i_3_ + (i_4_ & 0x1)) {
		    Animable var_lo_5_ = var_los[i_4_];
		    var_los[i_4_] = var_los[i_2_];
		    var_los[i_2_++] = var_lo_5_;
		}
	    }
	    var_los[i_0_] = var_los[i_2_];
	    var_los[i_2_] = var_lo;
	    a(var_los, i, i_2_ - 1);
	    a(var_los, i_2_ + 1, i_0_);
	}
    }
    
    public static void a(int i) {
	if (i == 17391) {
	    s = null;
	    q = null;
	}
    }
    
    Class_vb(int i) {
	((Class_vb) this).l = false;
	((Class_vb) this).o = i;
    }
}
