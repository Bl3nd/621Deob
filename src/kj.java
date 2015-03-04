/* kj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kj
{
    static int a;
    static int b;
    static GameOutPacket outgoingPacket56 = new GameOutPacket(56, -1);
    da d;
    ha e;
    
    static final void a(int i, byte i_0_) {
	b++;
	if (i_0_ <= -93) {
	    ut.I = i;
	    pr.H = -1;
	    Class_k.Q = -1;
	    jf.c(-2488);
	}
    }
    
    public kj() {
	/* empty */
    }
    
    public static void a(byte i) {
	outgoingPacket56 = null;
	int i_1_ = 54 % ((i - 11) / 42);
    }
}
