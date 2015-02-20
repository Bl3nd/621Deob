/* fj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fj extends pp
{
    static GameInPacket incomingPacket1;
    static Class_ad t;
    private long u;
    private qj v;
    static int w;
    int x;
    static int y;
    static boolean z = false;
    static int A;
    
    final long b(byte i) {
	if (i >= -99)
	    z = true;
	y++;
	return u;
    }
    
    private final void c(byte i) {
	if (i == 44) {
	    if (u > 0L) {
		((qj) v).ud.releasePbuffer(u);
		u = 0L;
	    }
	    A++;
	}
    }
    
    public static void d(byte i) {
	if (i != 120)
	    incomingPacket1 = null;
	t = null;
	incomingPacket1 = null;
    }
    
    protected final void finalize() throws Throwable {
	c((byte) 44);
	w++;
	super.finalize();
    }
    
    fj(qj var_qj, int i, int i_0_) {
	v = var_qj;
	((fj) this).x = i * i_0_;
	u = ((qj) v).ud.createPbuffer(i, i_0_);
    }
    
    static {
	incomingPacket1 = new GameInPacket(1, -1);
    }
}
