/* tl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tl implements oc
{
    static int a;
    static int b;
    static int c;
    int d;
    static f e;
    static int f;
    
    public static void a(byte i) {
	if (i < 109)
	    e = null;
	e = null;
    }
    
    tl(int i) {
	((tl) this).d = i;
    }
    
    static final boolean a(int i, int i_0_) {
	if (i_0_ != 540800)
	    e = null;
	b++;
	if (i != 0 && i != 1 && i != 2)
	    return false;
	return true;
    }
    
    public final wea a(int i) {
	f++;
	if (i <= 38)
	    ((tl) this).d = -105;
	return Connection.wea;
    }
    
    static final boolean a(int i, int i_1_, int i_2_) {
	if (i_2_ != 14031)
	    a(37, -122);
	a++;
	if ((i & 0x84080) == 0)
	    return false;
	return true;
    }
}
