/* jq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jq extends qga
{
    static int j;
    static int k;
    static qm l = new qm();
    static GameInPacket m = new GameInPacket(55, 2);
    static String[] n = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    int o;
    
    jq(int i, ct var_ct, rc var_rc, int i_0_, int i_1_, int i_2_) {
	super(i, var_ct, var_rc, i_0_, i_1_);
	((jq) this).o = i_2_;
    }
    
    public static void a(byte i) {
	m = null;
	if (i != -115)
	    a((byte) 100);
	n = null;
	l = null;
    }
    
    public final wea a(int i) {
	if (i <= 38)
	    a((int) -30);
	j++;
	return oba.J;
    }
}
