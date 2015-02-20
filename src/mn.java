/* mn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mn
{
    static int a = -1;
    static float b;
    
    static final void a(qda var_qda, boolean bool) {
	for (int i = ((qda) var_qda).B; i <= ((qda) var_qda).I; i++) {
	    for (int i_0_ = ((qda) var_qda).x; i_0_ <= ((qda) var_qda).y;
		 i_0_++) {
		vf var_vf = ol.p[((Animable) var_qda).height][i][i_0_];
		if (var_vf != null) {
		    ida var_ida = ((vf) var_vf).f;
		    ida var_ida_1_ = null;
		    for (/**/; var_ida != null; var_ida = ((ida) var_ida).d) {
			if (((ida) var_ida).a == var_qda) {
			    if (var_ida_1_ != null)
				((ida) var_ida_1_).d = ((ida) var_ida).d;
			    else
				((vf) var_vf).f = ((ida) var_ida).d;
			    var_ida.a(-501);
			    break;
			}
			var_ida_1_ = var_ida;
		    }
		}
	    }
	}
	if (!bool)
	    rba.a(var_qda);
    }
}
