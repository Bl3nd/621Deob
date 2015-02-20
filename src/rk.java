/* rk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rk extends Class_wb
{
    short n;
    static int o;
    int p = (int) (us.a(99) / 1000L);
    String playerName;
    static int r;
    static int s;
    static int[] t;
    static int u;
    
    static final void c(int i) {
	r++;
	mr.c.a(18385);
	if (i > -6)
	    c(-90);
    }
    
    static final int a(int i, WorldSub var_iw, int i_0_, boolean bool, int i_1_,
		       WorldSub var_iw_2_, boolean bool_3_) {
	u++;
	int i_4_ = av.a(-32743, i_1_, bool, var_iw_2_, var_iw);
	if (i_4_ != 0) {
	    if (bool)
		return -i_4_;
	    return i_4_;
	}
	if (i == -1)
	    return 0;
	if (i_0_ != -30991)
	    s = 44;
	int i_5_ = av.a(-32743, i, bool_3_, var_iw_2_, var_iw);
	if (bool_3_)
	    return -i_5_;
	return i_5_;
    }
    
    static final int a(byte i, char c, String string) {
	o++;
	int i_6_ = 0;
	int i_7_ = string.length();
	if (i != 41)
	    s = 127;
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    if (string.charAt(i_8_) == c)
		i_6_++;
	}
	return i_6_;
    }
    
    rk(String string, int i) {
	((rk) this).playerName = string;
	((rk) this).n = (short) i;
    }
    
    public static void a(byte i) {
	t = null;
	if (i != 43)
	    c(-81);
    }
}
