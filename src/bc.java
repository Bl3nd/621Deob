/* bc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class bc
{
    static int a;
    static int b;
    static jk c = new jk(0, 0);
    static int d;
    
    public static void a(int i) {
	c = null;
	if (i != 0)
	    c = null;
    }
    
    final int a(int i, long l) {
	b++;
	long l_0_ = c(i - 86);
	if (l_0_ > 0L)
	    Connection.a(-28448, l_0_);
	if (i != -13)
	    d(58);
	return a(l, (byte) 121);
    }
    
    abstract long b();
    
    abstract int a(long l, byte i);
    
    abstract long c(int i);
    
    public bc() {
	/* empty */
    }
    
    static final boolean a(int i, byte i_1_) {
	if (i_1_ != -62)
	    return false;
	a++;
	if (i != 10 && i != 11 && i != 12)
	    return false;
	return true;
    }
    
    abstract void d(int time);
}
