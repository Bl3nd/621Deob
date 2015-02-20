/* ka - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ka
{
    static int a;
    static int b;
    static int c;
    static int[][] d
	= { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 },
	    { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 },
	    { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
	    { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
    
    static final void a(byte i) {
	if (hm.h == 3)
	    ei.a(4, 50);
	else if (hm.h == 7)
	    ei.a(8, -118);
	else if (hm.h == 10)
	    ei.a(11, 49);
	int i_0_ = -103 / ((i + 65) / 39);
	c++;
    }
    
    public static void b(byte i) {
	d = null;
	if (i > -117)
	    b((byte) 78);
    }
    
    static final byte a(int i, int i_1_, int i_2_) {
	if (i_2_ < 3)
	    a((byte) -41);
	a++;
	if (i != 9)
	    return (byte) 0;
	if ((i_1_ & 0x1) != 0)
	    return (byte) 2;
	return (byte) 1;
    }
    
    public ka() {
	/* empty */
    }
}
