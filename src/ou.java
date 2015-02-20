/* ou - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ou
{
    static boolean a;
    static int b;
    static int c;
    static int d;
    static int e = 0;
    static GameOutPacket outgoingPacket2 = new GameOutPacket(2, -1);
    static dt g;
    
    abstract void a(byte i);
    
    abstract boolean a(byte i, int i_0_);
    
    static final byte a(byte i, char c) {
	if (i != 99)
	    a((byte) 86, '\017');
	b++;
	byte i_1_;
	if (c > '\0' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i_1_ = (byte) c;
	else if (c != '\u20ac') {
	    if (c != '\u201a') {
		if (c == '\u0192')
		    i_1_ = (byte) -125;
		else if (c != '\u201e') {
		    if (c == '\u2026')
			i_1_ = (byte) -123;
		    else if (c == '\u2020')
			i_1_ = (byte) -122;
		    else if (c != '\u2021') {
			if (c == '\u02c6')
			    i_1_ = (byte) -120;
			else if (c == '\u2030')
			    i_1_ = (byte) -119;
			else if (c == '\u0160')
			    i_1_ = (byte) -118;
			else if (c != '\u2039') {
			    if (c != '\u0152') {
				if (c != '\u017d') {
				    if (c == '\u2018')
					i_1_ = (byte) -111;
				    else if (c == '\u2019')
					i_1_ = (byte) -110;
				    else if (c == '\u201c')
					i_1_ = (byte) -109;
				    else if (c == '\u201d')
					i_1_ = (byte) -108;
				    else if (c == '\u2022')
					i_1_ = (byte) -107;
				    else if (c == '\u2013')
					i_1_ = (byte) -106;
				    else if (c == '\u2014')
					i_1_ = (byte) -105;
				    else if (c == '\u02dc')
					i_1_ = (byte) -104;
				    else if (c != '\u2122') {
					if (c == '\u0161')
					    i_1_ = (byte) -102;
					else if (c != '\u203a') {
					    if (c == '\u0153')
						i_1_ = (byte) -100;
					    else if (c == '\u017e')
						i_1_ = (byte) -98;
					    else if (c == '\u0178')
						i_1_ = (byte) -97;
					    else
						i_1_ = (byte) 63;
					} else
					    i_1_ = (byte) -101;
				    } else
					i_1_ = (byte) -103;
				} else
				    i_1_ = (byte) -114;
			    } else
				i_1_ = (byte) -116;
			} else
			    i_1_ = (byte) -117;
		    } else
			i_1_ = (byte) -121;
		} else
		    i_1_ = (byte) -124;
	    } else
		i_1_ = (byte) -126;
	} else
	    i_1_ = (byte) -128;
	return i_1_;
    }
    
    public static void b(byte i) {
	g = null;
	if (i == -123)
	    outgoingPacket2 = null;
    }
    
    abstract void c(byte i);
    
    public ou() {
	/* empty */
    }
    
    static final void a(int i, byte i_2_) {
	if (i == 37)
	    kca.o = 3.0F;
	else if (i == 50)
	    kca.o = 4.0F;
	else if (i != 75) {
	    if (i == 100)
		kca.o = 8.0F;
	    else if (i == 200)
		kca.o = 16.0F;
	} else
	    kca.o = 6.0F;
	if (i_2_ == -123) {
	    pr.H = -1;
	    d++;
	    pr.H = -1;
	}
    }
    
    abstract au d(byte i);
}
