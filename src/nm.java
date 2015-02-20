/* nm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nm extends Node
{
    static int k;
    int l;
    static int m;
    static int n;
    static int o;
    static int p;
    int q;
    static int r;
    static int s = 0;
    
    final boolean a(boolean bool) {
	if (bool != false)
	    return false;
	p++;
	if ((((nm) this).l & 0x5911ff) >> 22 == 0)
	    return false;
	return true;
    }
    
    final int a(int i) {
	k++;
	if (i != -1035661311)
	    b(107);
	return mv.a(((nm) this).l, (byte) 104);
    }
    
    final int b(boolean bool) {
	if (bool != false)
	    b(-86);
	m++;
	return 0x7 & ((nm) this).l >> 18;
    }
    
    final boolean b(int i) {
	if (i >= -18)
	    b(111);
	r++;
	if ((0x1 & ((nm) this).l >> 21) == 0)
	    return false;
	return true;
    }
    
    final boolean a(int i, byte i_0_) {
	if (i_0_ != 91)
	    a(true);
	n++;
	if ((0x1 & ((nm) this).l >> i + 1) == 0)
	    return false;
	return true;
    }
    
    final boolean c(int i) {
	o++;
	if (i > -122)
	    a(false);
	if ((0x1 & ((nm) this).l) == 0)
	    return false;
	return true;
    }
    
    nm(int i, int i_1_) {
	((nm) this).l = i;
	((nm) this).q = i_1_;
    }
}
