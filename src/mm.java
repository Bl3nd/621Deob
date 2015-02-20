/* mm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class mm extends Class_wb
{
    boolean n;
    int o;
    int p;
    static int q = 0;
    int r;
    static int s;
    int t;
    byte u = 5;
    static int v;
    int w;
    static lt x;
    static int y;
    static int z;
    static int[] B = new int[500];
    int C;
    
    static final void a(int i, String string) {
	oba.a("", string, 0, -1, "", 0, "");
	if (i > -85)
	    B = null;
	v++;
    }
    
    static final void a(int[] is, boolean bool, int[] is_0_) {
	y++;
	if (bool == true) {
	    if (is_0_ == null || is == null) {
		fo.x = null;
		Class_ob.t = null;
		lp.n = null;
	    } else {
		lp.n = is_0_;
		Class_ob.t = new int[is_0_.length];
		fo.x = new byte[is_0_.length][][];
		for (int i = 0; i < lp.n.length; i++)
		    fo.x[i] = new byte[is[i]][];
	    }
	}
    }
    
    public static void a(byte i) {
	B = null;
	x = null;
	int i_1_ = -22 % ((65 - i) / 38);
    }
    
    static final void a(int i, int i_2_, byte i_3_, int i_4_, int i_5_) {
	z++;
	int i_6_ = -83 % ((33 - i_3_) / 53);
	if (i_5_ <= i_2_) {
	    for (int i_7_ = i_5_; i_2_ > i_7_; i_7_++)
		wh.O[i_7_][i_4_] = i;
	} else {
	    for (int i_8_ = i_2_; i_5_ > i_8_; i_8_++)
		wh.O[i_8_][i_4_] = i;
	}
    }
    
    static final void a(int i, int i_9_, int i_10_) {
	vf var_vf = ol.p[i][i_9_][i_10_];
	if (var_vf != null) {
	    rba.a(((vf) var_vf).m);
	    if (((vf) var_vf).m != null)
		((vf) var_vf).m = null;
	}
    }
    
    public mm() {
	/* empty */
    }
    
    static {
	x = new lt();
    }
}
