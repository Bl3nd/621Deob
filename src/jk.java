/* jk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jk extends Node
{
    static byte[][] k = new byte[250][];
    static int l;
    static int m = -1;
    static float[] n = new float[4];
    int o;
    static int p;
    int q;
    
    static final void a(boolean bool, String string, boolean bool_0_) {
	p++;
	string = string.toLowerCase();
	short[] is = new short[16];
	int i = 0;
	int i_1_ = !bool_0_ ? 0 : 32768;
	int i_2_ = (bool_0_ ? ((sh) ul.s).k : ((sh) ul.s).m) + i_1_;
	if (bool == true) {
	    for (int i_3_ = i_1_; i_2_ > i_3_; i_3_++) {
		uj var_uj = ul.s.a(i_3_, (byte) 18);
		if (((uj) var_uj).K
		    && (var_uj.b((byte) 93).toLowerCase().indexOf(string)
			!= -1)) {
		    if (i >= 50) {
			uh.a = -1;
			oga.a = null;
			return;
		    }
		    if (i >= is.length) {
			short[] is_4_ = new short[2 * is.length];
			for (int i_5_ = 0; i_5_ < i; i_5_++)
			    is_4_[i_5_] = is[i_5_];
			is = is_4_;
		    }
		    is[i++] = (short) i_3_;
		}
	    }
	    uh.a = i;
	    oga.a = is;
	    Class_u.N = 0;
	    String[] strings = new String[uh.a];
	    for (int i_6_ = 0; i_6_ < uh.a; i_6_++)
		strings[i_6_] = ul.s.a(is[i_6_], (byte) 79).b((byte) 33);
	    wd.a(oga.a, strings, 0);
	}
    }
    
    public static void a(int i) {
	if (i != 16)
	    n = null;
	k = null;
	n = null;
    }
    
    jk(int i, int i_7_) {
	((jk) this).o = i;
	((jk) this).q = i_7_;
    }
}
