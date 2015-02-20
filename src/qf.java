/* qf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qf
{
    static long a = -1L;
    it b;
    int c = -1;
    String[] d;
    static int e;
    int[] f;
    static int g;
    static int h;
    
    static final boolean a(String string, int i) {
	e++;
	if (string == null)
	    return false;
	if (i >= -95)
	    a(null, 65);
	for (int i_0_ = 0; i_0_ < dba.l; i_0_++) {
	    if (string.equalsIgnoreCase(GameOutPacket.d[i_0_]))
		return true;
	    if (string.equalsIgnoreCase(pi.m[i_0_]))
		return true;
	}
	return false;
    }
}
