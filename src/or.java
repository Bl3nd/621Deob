/* or - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class or
{
    private pl a;
    static int b;
    static int c;
    private tb d = new tb(64);
    static int e;
    static cv f;
    static int g;
    static int[] h = new int[3];
    static int i;
    private pl j;
    
    public static void a(byte i) {
	if (i != -106)
	    f = null;
	h = null;
	f = null;
    }
    
    static final void a(int i, byte i_0_, String string) {
	g++;
	Class_fd.I++;
	tba var_tba = jga.sendGameOutPacket(od.S, pca.isaac, (byte) -55);
	if (i_0_ != -9)
	    a(35, (byte) 55, -127, -14, 127, -30, 3, -40, -116);
	((tba) var_tba).loginStream.writeByte(cq.a(string, (byte) 2) + 1, (byte) -108);
	((tba) var_tba).loginStream.writeString(string, -78);
	((tba) var_tba).loginStream.writeNegativeByte((byte) 125, i);
	ud.a(var_tba, (byte) -36);
    }
    
    static final void a(int i) {
	SpecialOutPacket.d.d(2);
	or.i++;
	int i_1_ = -113 / ((i + 9) / 54);
	qt.y = 0;
    }
    
    final qt a(int i, int i_2_) {
	b++;
	qt var_qt = (qt) d.get((long) i_2_, (byte) 100);
	if (var_qt != null)
	    return var_qt;
	if (i <= 25)
	    a(41, (byte) -79, null);
	byte[] is;
	if (i_2_ < 32768)
	    is = a.b(i_2_, -109, 0);
	else
	    is = j.b(0x7fff & i_2_, -127, 0);
	var_qt = new qt();
	if (is != null)
	    var_qt.a(new BytesParser(is), 70);
	if (i_2_ >= 32768)
	    var_qt.a((int) -54);
	d.put((long) i_2_, var_qt, 1);
	return var_qt;
    }
    
    static final void a(int i, byte i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_) {
	c++;
	if (!gf.a((byte) 82, i_7_)) {
	    if ((i_5_ ^ 0xffffffff) != 0)
		la.q[i_5_] = true;
	    else {
		for (int i_11_ = 0; i_11_ < 100; i_11_++)
		    la.q[i_11_] = true;
	    }
	} else if (i_3_ == -23) {
	    if (mv.b[i_7_] == null)
		bn.a(i_9_, i_4_, i_8_, i_10_, (byte) -4, i_6_, i_5_,
		     Node_Sub.o[i_7_], i, -1);
	    else
		bn.a(i_9_, i_4_, i_8_, i_10_, (byte) -4, i_6_, i_5_,
		     mv.b[i_7_], i, -1);
	}
    }
    
    or(int i, pl var_pl, pl var_pl_12_) {
	j = var_pl_12_;
	a = var_pl;
	if (a != null)
	    a.a(0, true);
	if (j != null)
	    j.a(0, true);
    }
    
    static {
	e = -1;
    }
}
