/* qba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qba extends pp
{
    static int s;
    int t;
    static int u;
    int v;
    static int w;
    String x;
    static boolean y;
    static int z;
    int A;
    static int B;
    static eg[] C = new eg[4];
    static int D;
    static int E;
    
    static final void a(int i, int i_0_) {
	if (i > 48) {
	    B++;
	    if (ri.u != i_0_) {
		Class_hc.e = bw.v = ida.h[i_0_];
		SpecialOutPacket.a((byte) -110);
		GameInPacket.ints = new int[Class_hc.e][bw.v];
		cl.s = new int[4][Class_hc.e >> 3][bw.v >> 3];
		gi.k = new int[Class_hc.e][bw.v];
		for (int i_1_ = 0; i_1_ < 4; i_1_++)
		    su.a[i_1_] = cq.a(bw.v, Class_hc.e, (byte) -94);
		Interactable.e = new byte[4][Class_hc.e][bw.v];
		Interface.a(4, bw.v, Class_hc.e, 0);
		ho.a(lg.r, bw.v >> 3, Class_hc.e >> 3, (byte) -10);
		ri.u = i_0_;
	    }
	}
    }
    
    final int a(int i) {
	z++;
	if (i != 255)
	    ((qba) this).x = null;
	return (int) (((Node) this).nodeID >>> 32 & 0xffL);
    }
    
    final void i(int i) {
	E++;
	((pp) this).l
	    = ((pp) this).l & ~0x7fffffffffffffffL | us.getCurrentTime(i ^ 0x6a) + 500L;
	kaa.n.a((int) 75, this);
	if (i != 0)
	    j(-100);
    }
    
    public static void a(boolean bool) {
	if (bool != false)
	    y = false;
	C = null;
    }
    
    final long b(byte i) {
	s++;
	if (i != -108)
	    a(125, -32);
	return 0x7fffffffffffffffL & ((pp) this).l;
    }
    
    final void c(byte i) {
	u++;
	((pp) this).l |= ~0x7fffffffffffffffL;
	if (i == 11) {
	    if (b((byte) -108) == 0L)
		eq.C.a((int) 75, this);
	}
    }
    
    final int j(int i) {
	if (i != 4)
	    a(false);
	D++;
	return (int) ((Node) this).nodeID;
    }
    
    static final String a(int i, int i_2_, Interface var_kp) {
	w++;
	if (i != 15648)
	    C = null;
	if (!client.c(var_kp).a(i_2_, (byte) 91) && ((Interface) var_kp).nd == null)
	    return null;
	if (((Interface) var_kp).itemActions == null || i_2_ >= ((Interface) var_kp).itemActions.length
	    || ((Interface) var_kp).itemActions[i_2_] == null
	    || ((Interface) var_kp).itemActions[i_2_].trim().length() == 0) {
	    if (lba.qa_op_test)
		return "Hidden-" + i_2_;
	    return null;
	}
	return ((Interface) var_kp).itemActions[i_2_];
    }
    
    qba(int i, int i_3_) {
	((Node) this).nodeID = (long) i_3_ | (long) i << 32;
    }
    
    static {
	y = true;
    }
}
