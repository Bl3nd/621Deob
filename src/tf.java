/* tf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tf
{
    int a;
    static gga[] b = new gga[8];
    int c;
    int d;
    static int e;
    
    public static void a(int i) {
	b = null;
	if (i >= -34)
	    b = null;
    }
    
    static final int a(int i, int i_0_, byte i_1_) {
	e++;
	if (i_0_ == -2)
	    return 12345678;
	if (i_1_ != -10)
	    b = null;
	if (i_0_ == -1) {
	    if (i < 2)
		i = 2;
	    else if (i > 126)
		i = 126;
	    return i;
	}
	i = (0x7f & i_0_) * i >> 7;
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return (i_0_ & 0xff80) + i;
    }
    
    public tf() {
	/* empty */
    }
}
