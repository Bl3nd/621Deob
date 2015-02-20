/* kk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kk extends iea
{
    static byte[] n;
    static int o;
    static int p;
    static int q = 2;
    int r;
    int s;
    
    public static void b(int i) {
	int i_0_ = -41 / ((i + 64) / 49);
	n = null;
    }
    
    public final wea a(int i) {
	o++;
	if (i <= 38)
	    ((kk) this).r = -28;
	return dk.P;
    }
    
    kk(ct var_ct, rc var_rc, int i, int i_1_, int i_2_, int i_3_, int i_4_,
       int i_5_, int i_6_, int i_7_, int i_8_) {
	super(var_ct, var_rc, i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
	((kk) this).r = i_8_;
	((kk) this).s = i_7_;
    }
    
    static final String a(String string, boolean bool) {
	p++;
	if (string == null)
	    return null;
	int i = 0;
	int i_9_;
	for (i_9_ = string.length(); i < i_9_; i++) {
	    if (!GameText.a((int) 0, string.charAt(i)))
		break;
	}
	for (/**/; i_9_ > i && GameText.a((int) 0, string.charAt(i_9_ - 1));
	     i_9_--) {
	    /* empty */
	}
	if (bool != true)
	    q = -114;
	int i_10_ = i_9_ - i;
	if (i_10_ < 1 || i_10_ > 12)
	    return null;
	StringBuffer stringbuffer = new StringBuffer(i_10_);
	for (int i_11_ = i; i_9_ > i_11_; i_11_++) {
	    char c = string.charAt(i_11_);
	    if (hba.a((byte) 17, c)) {
		char c_12_ = aea.a((byte) -88, c);
		if (c_12_ != '\0')
		    stringbuffer.append(c_12_);
	    }
	}
	if (stringbuffer.length() == 0)
	    return null;
	return stringbuffer.toString();
    }
    
    static {
	int i = 0;
	n = new byte[32896];
	for (int i_13_ = 0; i_13_ < 256; i_13_++) {
	    for (int i_14_ = 0; i_14_ <= i_13_; i_14_++)
		n[i++]
		    = (byte) (int) (255.0
				    / Math.sqrt((double) ((float) ((i_13_
								    * i_13_)
								   + ((i_14_
								       * i_14_)
								      + 65535))
							  / 65535.0F)));
	}
    }
}
