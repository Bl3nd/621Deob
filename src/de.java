/* de - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class de
{
    static GameOutPacket a = new GameOutPacket(25, 12);
    static int b;
    static int[] c = new int[25];
    
    static final int a(int i, int i_0_, int i_1_) {
	b++;
	if ((i_1_ ^ 0xffffffff) == 0)
	    return 12345678;
	i = (0x7f & i_1_) * i >> 7;
	if (i_0_ <= 124)
	    a = null;
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return (i_1_ & 0xff80) + i;
    }
    
    public static void a(int i) {
	c = null;
	a = null;
	if (i != 32088)
	    a(89);
    }
}
