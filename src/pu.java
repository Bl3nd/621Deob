/* pu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pu extends Node
{
    static int k;
    int l;
    static tb m = new tb(20);
    int n;
    static Class_ae o;
    static boolean[] p;
    static boolean q = true;
    
    public static void a(boolean bool) {
	if (bool == true) {
	    p = null;
	    o = null;
	    m = null;
	}
    }
    
    static final boolean b(boolean bool) {
	if (bool != false)
	    b(false);
	k++;
	if (!Class_ue.a("jaclib", -114))
	    return false;
	return Class_ue.a("hw3d", -13);
    }
    
    pu(int i, int i_0_) {
	((pu) this).l = i;
	((pu) this).n = i_0_;
    }
    
    static {
	o = new Class_ae();
    }
}
