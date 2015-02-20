/* fn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fn extends Node
{
    static int k;
    static volatile Object l = null;
    static int m;
    int n;
    int o;
    static int p;
    
    static final void a(int[] is, Object[] objects, int i) {
	m++;
	if (i <= 110)
	    a(null, null, 120);
	cg.a(is.length - 1, is, objects, 1, 0);
    }
    
    static final boolean a(int i, int i_0_, int i_1_) {
	k++;
	if (i != -44)
	    return false;
	if ((0x800 & i_0_) == 0)
	    return false;
	return true;
    }
    
    public static void a(int i) {
	l = null;
	if (i > -88)
	    a((byte) 64, null, true, 11);
    }
    
    fn(int i, int i_2_) {
	((fn) this).n = i_2_;
	((fn) this).o = i;
    }
    
    static final void a(int i, int i_3_, int i_4_, int i_5_) {
	vf var_vf = ol.p[i][i_3_][i_4_];
	if (var_vf != null) {
	    lca var_lca = ((vf) var_vf).d;
	    lca var_lca_6_ = ((vf) var_vf).p;
	    if (var_lca != null) {
		((lca) var_lca).E = (short) (((lca) var_lca).E * i_5_
					     / (16 << Class_fb.a - 7));
		((lca) var_lca).x = (short) (((lca) var_lca).x * i_5_
					     / (16 << Class_fb.a - 7));
	    }
	    if (var_lca_6_ != null) {
		((lca) var_lca_6_).E = (short) (((lca) var_lca_6_).E * i_5_
						/ (16 << Class_fb.a - 7));
		((lca) var_lca_6_).x = (short) (((lca) var_lca_6_).x * i_5_
						/ (16 << Class_fb.a - 7));
	    }
	}
    }
    
    static final boolean a(byte i, String string, boolean bool, int i_7_) {
	p++;
	if (i_7_ < 2 || i_7_ > 36)
	    throw new IllegalArgumentException("Invalid radix:" + i_7_);
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	int i_10_ = 0;
	int i_11_ = string.length();
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
	    int i_13_ = string.charAt(i_12_);
	    if (i_12_ == 0) {
		if (i_13_ == 45) {
		    bool_8_ = true;
		    continue;
		}
		if (i_13_ == 43 && bool)
		    continue;
	    }
	    if (i_13_ >= 48 && i_13_ <= 57)
		i_13_ -= 48;
	    else if (i_13_ < 65 || i_13_ > 90) {
		if (i_13_ >= 97 && i_13_ <= 122)
		    i_13_ -= 87;
		else
		    return false;
	    } else
		i_13_ -= 55;
	    if (i_13_ >= i_7_)
		return false;
	    if (bool_8_)
		i_13_ = -i_13_;
	    int i_14_ = i_10_ * i_7_ + i_13_;
	    if (i_10_ != i_14_ / i_7_)
		return false;
	    bool_9_ = true;
	    i_10_ = i_14_;
	}
	if (i != 8)
	    a(41, -21, 36, -4);
	return bool_9_;
    }
}
