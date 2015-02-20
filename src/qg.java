/* qg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qg
{
    static int[] a = new int[14];
    int b;
    static int c;
    static Interface d;
    static int e;
    int f;
    int g;
    static int h;
    static int i;
    static int j = 0;
    static int k;
    int l;
    int m;
    qg n;
    static GameInPacket incomingPacket27;
    Class_q p;
    static int[] q;
    
    final qg a(int i, byte i_0_) {
	h++;
	if (i_0_ < 38)
	    ((qg) this).l = 84;
	return new qg(((qg) this).g, i);
    }
    
    public static void a(int i) {
	incomingPacket27 = null;
	a = null;
	d = null;
	q = null;
	if (i != 2)
	    a(115);
    }
    
    static final boolean a(int i, int i_1_, int i_2_) {
	if (i != 0)
	    a(84, (int) -120);
	e++;
	return ih.a((byte) 67, i_2_, i_1_) & pv.a(i + 35044, i_2_, i_1_);
    }
    
    final vj b(int i) {
	k++;
	int i_3_ = 92 % ((i - 90) / 33);
	return ha.a(((qg) this).g, false);
    }
    
    static final void a(Animable var_lo) {
	nda.k.MA(((Animable) var_lo).locX, ((Animable) var_lo).j + (var_lo.g((int) 47) >> 1),
		 ((Animable) var_lo).locY, Class_rb.I);
	((Animable) var_lo).var_n = Class_rb.I[0];
	((Animable) var_lo).o = Class_rb.I[1];
	((Animable) var_lo).g = Class_rb.I[2];
    }
    
    static final int a(int i, int i_4_) {
	c++;
	if (i_4_ != 7836)
	    a(-43, (int) -76);
	return i >>> 8;
    }
    
    qg(int i, int i_5_) {
	((qg) this).g = i;
	((qg) this).b = i_5_;
    }
    
    static {
	d = null;
	q = new int[2];
	incomingPacket27 = new GameInPacket(27, -1);
    }
}
