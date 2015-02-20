/* mu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mu
{
    int a;
    int b;
    int c;
    int d;
    static GameOutPacket e;
    int f;
    static int g;
    byte[] h;
    int i;
    static int j = 0;
    int k;
    byte[] l;
    static vj[] m;
    
    static long a(long l, long l_0_) {
	return l | l_0_;
    }
    
    public static void a(int i) {
	m = null;
	if (i >= 120)
	    e = null;
    }
    
    public mu() {
	/* empty */
    }
    
    static {
	e = new GameOutPacket(70, 1);
	m = new vj[16];
    }
}
