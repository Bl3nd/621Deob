/* Class_j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_j extends jt
{
    static tda g = new tda(0);
    static int h;
    static boolean[] i;
    static int j;
    static int k;
    static qd[] l;
    
    abstract oq a(boolean bool);
    
    static final void a() {
	for (int i = uaa.c; i < dfa.G; i++) {
	    for (int i_0_ = 0; i_0_ < sv.T; i_0_++) {
		for (int i_1_ = 0; i_1_ < nf.H; i_1_++) {
		    vf var_vf = ol.p[i][i_0_][i_1_];
		    if (var_vf != null) {
			ev var_ev = ((vf) var_vf).l;
			ev var_ev_2_ = ((vf) var_vf).h;
			if (var_ev != null && var_ev.h((byte) -82)) {
			    wo.a(var_ev, i, i_0_, i_1_, 1, 1);
			    if (var_ev_2_ != null && var_ev_2_.h((byte) -29)) {
				wo.a(var_ev_2_, i, i_0_, i_1_, 1, 1);
				var_ev_2_.a(false, 0, (byte) 106, nda.k,
					    var_ev, 0, 0);
				var_ev_2_.sendIllegalStateException((int) -1);
			    }
			    var_ev.sendIllegalStateException((int) -1);
			}
			for (ida var_ida = ((vf) var_vf).f; var_ida != null;
			     var_ida = ((ida) var_ida).d) {
			    qda var_qda = ((ida) var_ida).a;
			    if (var_qda != null && var_qda.h((byte) -54)) {
				wo.a(var_qda, i, i_0_, i_1_,
				     ((qda) var_qda).I - ((qda) var_qda).B + 1,
				     (((qda) var_qda).y - ((qda) var_qda).x
				      + 1));
				var_qda.sendIllegalStateException((int) -1);
			    }
			}
			dfa var_dfa = ((vf) var_vf).m;
			if (var_dfa != null && var_dfa.h((byte) -72)) {
			    Class_pf.a(var_dfa, i, i_0_, i_1_);
			    var_dfa.sendIllegalStateException((int) -1);
			}
		    }
		}
	    }
	}
    }
    
    public static void a(int i) {
	Class_j.i = null;
	g = null;
	if (i != 0)
	    l = null;
	l = null;
    }
    
    static final boolean a(byte i, int i_3_, int i_4_) {
	h++;
	if (i != -55)
	    j = -87;
	if (!((i_3_ & 0x70000) != 0 | tfa.a((byte) 87, i_4_, i_3_))
	    && !oe.a(68, i_3_, i_4_))
	    return false;
	return true;
    }
}
