/* up - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class up extends kba
{
    static int B;
    static int C;
    static tb D = new tb(8);
    static int E;
    private byte[] F;
    static GameOutPacket G;
    static int H;
    static boolean I = false;
    static int J;
    static tb K;
    static Player thisPlayer;
    
    final void a(int i, byte i_0_, byte i_1_) {
	C++;
	if (i_0_ == -76) {
	    i_1_ = (byte) (((0xff & i_1_) >> 1) + 127);
	    int i_2_ = 2 * i;
	    F[i_2_++] = i_1_;
	    F[i_2_] = i_1_;
	}
    }
    
    final byte[] a(int i, int i_3_, int i_4_, int i_5_) {
	F = new byte[2 * i_3_ * (i_4_ * i_5_)];
	E++;
	this.a((byte) 125, i_3_, i_5_, i_4_);
	if (i != 12743)
	    D = null;
	return F;
    }
    
    static final String e(int i) {
	J++;
	if (i != 58)
	    e(-7);
	if (gea.n || um.b == null)
	    return "";
	return ((bfa) um.b).k;
    }
    
    public up() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    public static void d(byte i) {
	if (i < 21)
	    d((byte) 66);
	K = null;
	thisPlayer = null;
	D = null;
	G = null;
    }
    
    static {
	G = new GameOutPacket(58, 2);
	K = new tb(4);
    }
}
