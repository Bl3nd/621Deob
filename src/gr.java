/* gr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gr
{
    static int[] a = { 3, 7, 15 };
    static int b;
    static GameOutPacket c = new GameOutPacket(26, 11);
    
    public static void a(int i) {
	a = null;
	if (i != 12531)
	    b(32);
	c = null;
    }
    
    static final tba b(int i) {
	b++;
	tba var_tba = ItemDefLoader.a(18375);
	((tba) var_tba).s = 0;
	if (i > -94)
	    c = null;
	((tba) var_tba).l = null;
	((tba) var_tba).loginStream = new LoginStream(5000);
	return var_tba;
    }
}
