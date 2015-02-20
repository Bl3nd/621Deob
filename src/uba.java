/* uba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class uba extends Class_pb
{
    private int j;
    static int k;
    static int l;
    static int m = 0;
    static GameInPacket incomingPacket104;
    private int o;
    private int p;
    static int q;
    private int r;
    static int[] s = new int[1];
    static int t;
    static int u;
    
    public static void a(int i) {
	incomingPacket104 = null;
	if (i != -17444)
	    a((int) 122);
	s = null;
    }
    
    uba(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
	super(-1, i_3_, i_4_);
	o = i_2_;
	p = i;
	j = i_1_;
	r = i_0_;
    }
    
    final void b(int i, int i_5_, int i_6_) {
	t++;
	int i_7_ = p * i_5_ >> 12;
	int i_8_ = i_5_ * j >> 12;
	int i_9_ = i * r >> 12;
	int i_10_ = i * o >> 12;
	if (i_6_ != 4)
	    incomingPacket104 = null;
	ww.a(i_10_, i_9_, ((Class_pb) this).c, 9761, i_8_, i_7_);
    }
    
    final void a(int i, byte i_11_, int i_12_) {
	if (i_11_ == -34)
	    u++;
    }
    
    static final qc a(int i, int i_13_, String string) {
	k++;
	qc var_qc;
	try {
	    var_qc = (qc) Class.forName("ij").newInstance();
	} catch (Throwable throwable) {
	    var_qc = new ma();
	}
	((qc) var_qc).d = i;
	if (i_13_ <= 26)
	    a(29, (int) -82, (String) null);
	((qc) var_qc).b = string;
	return var_qc;
    }
    
    final void a(int i, int i_14_, int i_15_) {
	q++;
	if (i_14_ != -21716)
	    o = -107;
    }
    
    static {
	incomingPacket104 = new GameInPacket(104, -1);
    }
}
