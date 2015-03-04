/* ld - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ld
{
    static int a;
    static int b;
    static int c;
    
    static final void a() {
	for (int i = 0; i < Node_Sub.n; i++) {
	    qda var_qda = sw.a[i];
	    mn.a(var_qda, true);
	    sw.a[i] = null;
	}
	Node_Sub.n = 0;
    }
    
    static final boolean a(int i, int i_0_) {
	a++;
	if (i != 2429)
	    c = 125;
	if (i_0_ < 12 || i_0_ > 17)
	    return false;
	return true;
    }
    
    static final void a(int i, gl var_gl, byte[][] is) {
	b++;
	int i_1_ = -23 % ((i + 11) / 49);
	for (int i_2_ = 0; i_2_ < ((cd) var_gl).s; i_2_++) {
	    naa.d((byte) 76);
	    for (int i_3_ = 0; Class_hc.e >> 3 > i_3_; i_3_++) {
		for (int i_4_ = 0; i_4_ < bw.v >> 3; i_4_++) {
		    int i_5_ = cl.s[i_2_][i_3_][i_4_];
		    if ((i_5_ ^ 0xffffffff) != 0) {
			int i_6_ = (0x356f3ae & i_5_) >> 24;
			if (!((cd) var_gl).b || i_6_ == 0) {
			    int i_7_ = (i_5_ & 0x6) >> 1;
			    int i_8_ = 0x3ff & i_5_ >> 14;
			    int i_9_ = (0x3ffd & i_5_) >> 3;
			    int i_10_ = (i_8_ / 8 << 8) + i_9_ / 8;
			    for (int i_11_ = 0; i_11_ < iu.o.length; i_11_++) {
				if (iu.o[i_11_] == i_10_
				    && is[i_11_] != null) {
				    var_gl.a(i_2_, lg.r, 0, su.a, i_6_,
					     (i_8_ & 0x7) * 8, is[i_11_],
					     i_3_ * 8, i_4_ * 8, i_7_,
					     (i_9_ & 0x7) * 8);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
    }
}
