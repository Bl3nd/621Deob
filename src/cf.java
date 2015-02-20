/* cf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cf extends Node
{
    int k;
    static pl l;
    Class_vb m;
    static int n;
    int o = 2147483647;
    int p;
    int q;
    int r = -2147483648;
    int s;
    int t;
    static boolean u = false;
    int v;
    static World world;
    static int x;
    
    static final boolean a(int i, byte i_0_, int i_1_) {
	x++;
	if (i_0_ >= -118)
	    l = null;
	if ((0x800 & i_1_) == 0)
	    return false;
	return true;
    }
    
    final boolean a(int i, int i_2_, int i_3_) {
	n++;
	if (i != 0)
	    a(116, (int) 31, -78);
	if (i_2_ >= ((cf) this).q && ((cf) this).p >= i_2_
	    && ((cf) this).t <= i_3_ && i_3_ <= ((cf) this).r)
	    return true;
	if (((cf) this).o <= i_2_ && ((cf) this).v >= i_2_
	    && ((cf) this).k <= i_3_ && ((cf) this).s >= i_3_)
	    return true;
	return false;
    }
    
    public static void a(int i) {
	world = null;
	l = null;
	if (i >= -52)
	    a(-62, (byte) -102, 112);
    }
    
    cf(Class_vb class_vb) {
	((cf) this).p = -2147483648;
	((cf) this).k = 2147483647;
	((cf) this).q = 2147483647;
	((cf) this).t = 2147483647;
	((cf) this).s = -2147483648;
	((cf) this).v = -2147483648;
	((cf) this).m = class_vb;
    }
}
