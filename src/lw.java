/* lw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lw
{
    int a;
    static int b;
    int c;
    static GameOutPacket outgoingPacket24 = new GameOutPacket(24, 0);
    static String e;
    static int f;
    int g;
    int h;
    static int i;
    
    public static void a(byte i) {
	outgoingPacket24 = null;
	if (i != -32)
	    outgoingPacket24 = null;
	e = null;
    }
    
    final lw a(int i, int i_0_) {
	if (i != 0)
	    return null;
	f++;
	return new lw(((lw) this).g, i_0_, ((lw) this).h, ((lw) this).a);
    }
    
    static final byte a(byte i, int i_1_, int i_2_) {
	b++;
	if (i_2_ != 9)
	    return (byte) 0;
	if (i != -74)
	    e = null;
	if ((i_1_ & 0x1) == 0)
	    return (byte) 1;
	return (byte) 2;
    }
    
    static final void a(int i, int i_3_, int i_4_, int i_5_) {
	lw.i++;
	qba var_qba = ofa.a(i_3_, i_5_, (byte) -18);
	var_qba.c((byte) 11);
	((qba) var_qba).t = i;
	((qba) var_qba).v = i_4_;
    }
    
    lw(int i, int i_6_, int i_7_, int i_8_) {
	((lw) this).a = i_8_;
	((lw) this).c = i_6_;
	((lw) this).h = i_7_;
	((lw) this).g = i;
    }
}
