/* Class_pd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_pd extends Class_pb
{
    private int j;
    private int k;
    static int l;
    static int m;
    static int n;
    private int o;
    static GameInPacket incomingPacket86 = new GameInPacket(86, 8);
    private int q;
    static int r;
    static short[] s = new short[256];
    
    public static void b(byte i) {
	incomingPacket86 = null;
	int i_0_ = 1 % ((65 - i) / 60);
	s = null;
    }
    
    final void b(int i, int i_1_, int i_2_) {
	m++;
	if (i_2_ != 4)
	    b(40, -113, 34);
    }
    
    final void a(int i, byte i_3_, int i_4_) {
	l++;
	int i_5_ = q * i >> 12;
	int i_6_ = j * i >> 12;
	int i_7_ = i_4_ * o >> 12;
	int i_8_ = i_4_ * k >> 12;
	if (i_3_ != -34)
	    o = 97;
	nt.a(-110, i_7_, i_8_, ((Class_pb) this).c, ((Class_pb) this).f, i_5_,
	     ((Class_pb) this).g, i_6_);
    }
    
    final void a(int i, int i_9_, int i_10_) {
	n++;
	int i_11_ = i * q >> 12;
	int i_12_ = i * j >> 12;
	if (i_9_ == -21716) {
	    int i_13_ = o * i_10_ >> 12;
	    int i_14_ = i_10_ * k >> 12;
	    tn.a(i_11_, i_13_, ((Class_pb) this).f, -19170, i_12_, i_14_);
	}
    }
    
    Class_pd(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_,
	     int i_20_) {
	super(i_18_, i_19_, i_20_);
	k = i_17_;
	o = i_15_;
	q = i;
	j = i_16_;
    }
    
    static {
	r = 7000;
    }
}
