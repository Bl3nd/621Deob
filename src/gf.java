/* gf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gf
{
    static int a;
    static int b;
    static int c;
    static int d;
    static ct e;
    static short f = 320;
    
    public static void a(int i) {
	e = null;
	if (i < 91)
	    e = null;
    }
    
    static final int b(int i) {
	a++;
	if (i != 0)
	    a((byte) 122, 53);
	return qk.w;
    }
    
    static final boolean a(byte i, int i_0_) {
	b++;
	if (pu.p[i_0_])
	    return true;
	if (!Class_fc.a.a(false, i_0_))
	    return false;
	int i_1_ = Class_fc.a.a(i_0_, true);
	if (i_1_ == 0) {
	    pu.p[i_0_] = true;
	    return true;
	}
	if (Node_Sub.o[i_0_] == null)
	    Node_Sub.o[i_0_] = new Interface[i_1_];
	if (i <= 79)
	    return false;
	for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
	    if (Node_Sub.o[i_0_][i_2_] == null) {
		byte[] is = Class_fc.a.b(i_2_, 59, i_0_);
		if (is != null) {
		    Interface var_kp = Node_Sub.o[i_0_][i_2_] = new Interface();
		    ((Interface) var_kp).interfaceID = (i_0_ << 16) + i_2_;
		    if ((is[0] ^ 0xffffffff) != 0)
			throw new IllegalStateException("if1");
		    var_kp.a(new BytesParser(is), 27157);
		}
	    }
	}
	pu.p[i_0_] = true;
	return true;
    }
    
    static final void c(int i) {
	c++;
	oca.inScreenPlayers = 0;
	if (i != 1048576)
	    f = (short) -57;
	for (int i_3_ = 0; i_3_ < 2048; i_3_++) {
	    vo.J[i_3_] = null;
	    hg.moveTypePerPlayer[i_3_] = (byte) 1;
	    ega.gpiPlayers[i_3_] = null;
	}
    }
    
    static final int a(int i, int i_4_, int i_5_) {
	i_4_ = i_4_ * (0x7f & i) >> 7;
	d++;
	if (i_5_ >= (i_4_ ^ 0xffffffff)) {
	    if (i_4_ > 126)
		i_4_ = 126;
	} else
	    i_4_ = 2;
	return (i & 0xff80) + i_4_;
    }
}
