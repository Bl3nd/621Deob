/* mr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mr
{
    static int a;
    static int b;
    static tb c;
    static int d = 0;
    
    public static void a(byte i) {
	if (i <= 99)
	    a((byte) -59);
	c = null;
    }
    
    static final String[] a(int i, String[] strings) {
	b++;
	String[] strings_0_ = new String[5];
	int i_1_ = 0;
	if (i < 43)
	    return null;
	for (/**/; i_1_ < 5; i_1_++) {
	    strings_0_[i_1_] = String.valueOf(i_1_) + ": ";
	    if (strings != null && strings[i_1_] != null)
		strings_0_[i_1_] = strings_0_[i_1_] + strings[i_1_];
	}
	return strings_0_;
    }
    
    static {
	c = new tb(64);
    }
}
