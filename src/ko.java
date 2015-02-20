/* ko - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ko
{
    static int a = 1;
    static int b;
    static int c;
    static int d;
    static GameInPacket incomingPacket31 = new GameInPacket(31, 6);
    static volatile long f = 0L;
    static baa g = new baa(4, 1, 1, 1);
    static int h;
    
    abstract byte[] a(byte i, int i_0_, int i_1_);
    
    abstract byte[] a(byte i);
    
    static final int a(byte i, int i_2_) {
	d++;
	int i_3_ = i_2_ >>> 1;
	i_3_ |= i_3_ >>> 1;
	i_3_ |= i_3_ >>> 2;
	i_3_ |= i_3_ >>> 4;
	i_3_ |= i_3_ >>> 8;
	if (i != 114)
	    return -45;
	i_3_ |= i_3_ >>> 16;
	return i_2_ & (i_3_ ^ 0xffffffff);
    }
    
    static final byte[] a(byte[] is, int i) {
	b++;
	int i_4_ = is.length;
	byte[] is_5_ = new byte[i_4_];
	co.a(is, 0, is_5_, 0, i_4_);
	if (i != -25553)
	    a(null, 28);
	return is_5_;
    }
    
    public static void b(byte i) {
	g = null;
	incomingPacket31 = null;
	if (i <= 76)
	    a((byte) 22, -103);
    }
    
    abstract void a(byte[] is, boolean bool);
}
