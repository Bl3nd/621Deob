/* ws - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class ws extends kba
{
    static GameInPacket incomingPacket91;
    private byte[] C;
    static int D;
    static int E;
    static int F;
    static int G = -1;
    static float H;
    static vf[][][] I;
    static Frame J;
    
    public static void e(int i) {
	incomingPacket91 = null;
	J = null;
	if (i >= -5)
	    H = -0.12919146F;
	I = null;
    }
    
    static final boolean a(int i, int i_0_) {
	if (i != 5)
	    e(1);
	F++;
	if (i_0_ != 3 && i_0_ != 5 && i_0_ != 6)
	    return false;
	return true;
    }
    
    public ws() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    final byte[] a(int i, int i_1_, int i_2_, int i_3_) {
	if (i != 12743)
	    C = null;
	D++;
	C = new byte[2 * (i_3_ * (i_2_ * i_1_))];
	this.a((byte) 122, i_1_, i_3_, i_2_);
	return C;
    }
    
    final void a(int i, byte i_4_, byte i_5_) {
	E++;
	int i_6_ = i * 2;
	i_5_ = (byte) ((0x7f & i_5_ >> 1) + 127);
	if (i_4_ != -76)
	    incomingPacket91 = null;
	C[i_6_++] = i_5_;
	C[i_6_] = i_5_;
    }
    
    static {
	incomingPacket91 = new GameInPacket(91, 10);
    }
}
