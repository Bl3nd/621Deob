/* eo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eo extends uc
{
    static GameOutPacket i;
    static int j;
    static int k;
    static int l;
    static int m;
    static String n = "";
    static int o;
    static int p;
    
    final void a(int i, int i_0_, int i_1_) {
	p++;
	if (i_0_ != 50)
	    a(125, 23, 61);
    }
    
    final boolean a(byte i) {
	if (i > -93)
	    return false;
	m++;
	return true;
    }
    
    eo(qj var_qj) {
	super(var_qj);
    }
    
    final void a(int i, int i_2_, rg var_rg) {
	k++;
	if (i_2_ == 7) {
	    ((uc) this).h.a(var_rg, -2);
	    ((uc) this).h.c(false, i);
	}
    }
    
    public static void b(int i) {
	n = null;
	if (i != 5495)
	    b((int) -91);
	eo.i = null;
    }
    
    final void a(int i, boolean bool) {
	if (i >= -64)
	    b(62, false);
	j++;
    }
    
    final void a(int i) {
	if (i != 1268)
	    n = null;
	o++;
	((uc) this).h.b((byte) -127, false);
    }
    
    final void b(int i, boolean bool) {
	l++;
	int i_3_ = -16 / ((65 - i) / 60);
	((uc) this).h.b((byte) 123, true);
    }
    
    static {
	i = new GameOutPacket(5, 4);
    }
}
