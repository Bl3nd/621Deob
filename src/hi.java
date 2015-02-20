/* hi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hi
{
    int a;
    int b;
    int c;
    int d;
    int e;
    hi f;
    int g;
    static int h;
    private int i;
    int j;
    static GameInPacket incomingPacket2 = new GameInPacket(2, 0);
    int l;
    int m;
    int n;
    int o;
    static GameInPacket p = new GameInPacket(58, 3);
    byte q;
    static int r;
    static int s;
    int t;
    static hu u;
    
    static final int a(String string, byte[] is, int i, boolean bool) {
	h++;
	int i_0_ = string.length();
	int i_1_ = i;
	if (bool != true)
	    a(null, null, 17, true);
	for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
	    char c = string.charAt(i_2_);
	    if (c <= '\u007f')
		is[i_1_++] = (byte) c;
	    else if (c <= '\u07ff') {
		is[i_1_++] = (byte) (hba.bitwiseArg1ORArg2(c, 12303) >> 6);
		is[i_1_++] = (byte) hba.bitwiseArg1ORArg2(uca.a(c, 63), 128);
	    } else {
		is[i_1_++] = (byte) (hba.bitwiseArg1ORArg2(c, 919249) >> 12);
		is[i_1_++] = (byte) hba.bitwiseArg1ORArg2(128, uca.a(c, 4085) >> 6);
		is[i_1_++] = (byte) hba.bitwiseArg1ORArg2(128, uca.a(c, 63));
	    }
	}
	return i_1_ - i;
    }
    
    final hi a(int i, int i_3_, int i_4_, byte i_5_) {
	s++;
	if (i_5_ != 11)
	    a((byte) 25);
	return new hi(this.i, i_3_, i, i_4_, ((hi) this).q);
    }
    
    final ce a(boolean bool) {
	r++;
	if (bool != true)
	    ((hi) this).q = (byte) -8;
	return sv.a((byte) -128, i);
    }
    
    public static void a(byte i) {
	u = null;
	p = null;
	if (i <= -44)
	    incomingPacket2 = null;
    }
    
    hi(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
	((hi) this).g = i_7_;
	((hi) this).e = i_8_;
	this.i = i;
	((hi) this).q = i_9_;
	((hi) this).d = i_6_;
    }
}
