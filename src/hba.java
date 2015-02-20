/* hba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hba
{
    static qfa a = new qfa("", 16);
    static int b;
    static int c;
    
    static final int a(byte i) {
	c++;
	if (i >= -108)
	    a((int) -48);
	return rca.a(false, (byte) -15);
    }
    
    static final boolean a(byte i, char c) {
	b++;
	if (i != 17)
	    a((byte) 62);
	if (Character.isISOControl(c))
	    return false;
	if (nq.a(-127, c))
	    return true;
	char[] cs = jm.o;
	for (int i_0_ = 0; cs.length > i_0_; i_0_++) {
	    char c_1_ = cs[i_0_];
	    if (c == c_1_)
		return true;
	}
	char[] cs_2_ = fba.M;
	for (int i_3_ = 0; i_3_ < cs_2_.length; i_3_++) {
	    char c_4_ = cs_2_[i_3_];
	    if (c_4_ == c)
		return true;
	}
	return false;
    }
    
    static int bitwiseArg1ORArg2(int arg1, int arg2) {
    	return arg1 | arg2;
    }
    
    public static void a(int i) {
	a = null;
	if (i >= -71)
	    a((int) -19);
    }
}
