/* ke - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ke extends im
{
    static int F;
    static int G;
    static lda[] H;
    static GameInPacket incomingPacket67 = new GameInPacket(67, 8);
    static int J;
    static int K;
    private byte[] L;
    
    public ke() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    static final void a(int i, boolean bool) {
	ql var_ql = (ql) pu.o.a(i ^ 0x58);
	if (i != 2)
	    a(-22, true);
	for (/**/; var_ql != null; var_ql = (ql) pu.o.b((byte) 22)) {
	    if (((ql) var_ql).K != null) {
		ej.r.a(((ql) var_ql).K);
		((ql) var_ql).K = null;
	    }
	    if (((ql) var_ql).w != null) {
		ej.r.a(((ql) var_ql).w);
		((ql) var_ql).w = null;
	    }
	    var_ql.unlink(-30);
	}
	F++;
	if (bool) {
	    for (ql var_ql_0_ = (ql) bea.h.a((int) 97); var_ql_0_ != null;
		 var_ql_0_ = (ql) bea.h.b((byte) 44)) {
		if (((ql) var_ql_0_).K != null) {
		    ej.r.a(((ql) var_ql_0_).K);
		    ((ql) var_ql_0_).K = null;
		}
		var_ql_0_.unlink(-59);
	    }
	    for (ql var_ql_1_ = (ql) gl.O.b((byte) 124); var_ql_1_ != null;
		 var_ql_1_ = (ql) gl.O.b(i + 12559)) {
		if (((ql) var_ql_1_).K != null) {
		    ej.r.a(((ql) var_ql_1_).K);
		    ((ql) var_ql_1_).K = null;
		}
		var_ql_1_.unlink(-126);
	    }
	}
    }
    
    public static void e(byte i) {
	incomingPacket67 = null;
	if (i < 126)
	    H = null;
	H = null;
    }
    
    final void a(byte i, int i_2_, boolean bool) {
	K++;
	if (bool != false)
	    L = null;
	int i_3_ = 2 * i_2_;
	int i_4_ = 0xff & i;
	L[i_3_++] = (byte) -1;
	L[i_3_] = (byte) (3 * i_4_ >> 5);
    }
    
    final byte[] a(int i, int i_5_, int i_6_, int i_7_) {
	J++;
	L = new byte[i_7_ * (i_5_ * (i_6_ * 2))];
	if (i != 0)
	    return null;
	this.a((byte) 120, i_7_, i_6_, i_5_);
	return L;
    }
}
