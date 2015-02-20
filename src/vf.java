/* vf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vf
{
    static int a;
    static byte[] b;
    wr c;
    lca d;
    vf e;
    ida f;
    static int g;
    ev h;
    short i;
    byte j;
    short k;
    ev l;
    dfa m;
    short n;
    short o;
    lca p;
    
    public static void a(int i) {
	b = null;
	int i_0_ = 24 / ((i + 12) / 56);
    }
    
    final void a(boolean bool) {
	a++;
	ida var_ida;
	for (/**/; ((vf) this).f != null; ((vf) this).f = var_ida) {
	    var_ida = ((ida) ((vf) this).f).d;
	    ((vf) this).f.a(-501);
	}
	if (bool != false)
	    a(-62, 13, 73, (byte) -105);
    }
    
    static final int a(int i, int i_1_, int i_2_, byte i_3_) {
	g++;
	if (i_1_ == i)
	    return i;
	int i_4_ = -i_2_ + 128;
	if (i_3_ != 99)
	    a(-17, -89, 70, (byte) -112);
	int i_5_ = i_4_ * (0x7f & i) + i_2_ * (0x7f & i_1_) >> 7;
	int i_6_ = (i & 0x380) * i_4_ + (0x380 & i_1_) * i_2_ >> 7;
	int i_7_ = i_2_ * (0xfc00 & i_1_) + (i & 0xfc00) * i_4_ >> 7;
	return i_5_ & 0x7f | (i_7_ & 0xfc00 | i_6_ & 0x380);
    }
    
    vf(int i) {
	((vf) this).j = (byte) i;
    }
}
