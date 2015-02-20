/* fk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fk
{
    static int a;
    static int b;
    static vm c = null;
    
    public static void a(boolean bool) {
	c = null;
	if (bool != true)
	    a(null, 67);
    }
    
    static final synchronized byte[] a(byte i, int i_0_) {
	b++;
	if (i_0_ == 100 && rd.G > 0) {
	    byte[] is = Class_fb.i[--rd.G];
	    Class_fb.i[rd.G] = null;
	    return is;
	}
	if (i_0_ == 5000 && rca.a > 0) {
	    byte[] is = jk.k[--rca.a];
	    jk.k[rca.a] = null;
	    return is;
	}
	if (i_0_ == 30000 && vg.F > 0) {
	    byte[] is = gl.N[--vg.F];
	    gl.N[vg.F] = null;
	    return is;
	}
	if (i != 90)
	    c = null;
	if (fo.x != null) {
	    for (int i_1_ = 0; lp.n.length > i_1_; i_1_++) {
		if (i_0_ == lp.n[i_1_] && Class_ob.t[i_1_] > 0) {
		    byte[] is = fo.x[i_1_][--Class_ob.t[i_1_]];
		    fo.x[i_1_][Class_ob.t[i_1_]] = null;
		    return is;
		}
	    }
	}
	return new byte[i_0_];
    }
    
    static final synchronized void a(byte[] is, int i) {
	a++;
	if (is.length == 100 && rd.G < 1000)
	    Class_fb.i[rd.G++] = is;
	else if (is.length == 5000 && rca.a < 250)
	    jk.k[rca.a++] = is;
	else if (is.length == 30000 && vg.F < 50)
	    gl.N[vg.F++] = is;
	else {
	    if (fo.x != null) {
		for (int i_2_ = 0; lp.n.length > i_2_; i_2_++) {
		    if (is.length == lp.n[i_2_]
			&& Class_ob.t[i_2_] < fo.x[i_2_].length) {
			fo.x[i_2_][Class_ob.t[i_2_]++] = is;
			return;
		    }
		}
	    }
	    if (i != -13476)
		a(null, 3);
	}
    }
}
