/* ho - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ho
{
    static GameOutPacket objectExamineGameOutPacket = new GameOutPacket(49, 2);
    int b;
    static int c;
    int d;
    static GameOutPacket e = new GameOutPacket(6, 4);
    static int f;
    int g;
    
    static final void a(Class_r class_r, int i, int i_0_, byte i_1_) {
	if (i_1_ == -10) {
	    lm.Kh = class_r;
	    Class_qb.i = new Class_mc[i_0_][i];
	    f++;
	    if (tn.i != null)
		da.a = wi.a(tn.i[0], tn.i[3], tn.i[4], tn.i[5], tn.i[2],
			    tn.i[1], false);
	    th.d = new Class_mc();
	    Class_ef.k(84);
	}
    }
    
    public static void a(byte i) {
	e = null;
	if (i != 9)
	    a(null, -56, -120, (byte) -59);
	objectExamineGameOutPacket = null;
    }
    
    static final void a(boolean bool) {
	if (bool == true) {
	    c++;
	    qba var_qba = ofa.a(15, (int) 0, (byte) 113);
	    var_qba.i(0);
	}
    }
    
    public ho() {
	/* empty */
    }
}
