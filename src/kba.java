/* kba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class kba extends mp
{
    private int n;
    static tb o = new tb(4);
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    private int u;
    private int[] v = new int[((mp) this).b];
    private byte[] w;
    static GameInPacket incomingPacket96 = new GameInPacket(96, -2);
    static int y;
    static int z;
    static int A;
    
    void a(int i, byte i_0_, byte i_1_) {
	if (i_0_ != -76)
	    d(47);
	w[n++] = (byte) (uca.a(127, i_1_ >> 1) + 127);
	y++;
    }
    
    final void c(int i) {
	n = 0;
	p++;
	u = 0;
	int i_2_ = 64 / ((i + 84) / 39);
    }
    
    kba(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
	super(i, i_3_, i_4_, i_5_, i_6_);
	for (int i_7_ = 0; i_7_ < ((mp) this).b; i_7_++)
	    v[i_7_]
		= (short) (int) (Math.pow((double) f, (double) i_7_) * 4096.0);
    }
    
    static final void a(byte i, int i_8_) {
	A++;
	qba var_qba = ofa.a(6, i_8_, (byte) -104);
	var_qba.i(0);
	if (i != -43)
	    o = null;
    }
    
    final void a(byte i, int i_9_, int i_10_) {
	if (i < 111)
	    a((int) 57, (byte) 46, (byte) -53);
	t++;
	u += i_10_ * v[i_9_] >> 12;
    }
    
    static final String a(byte i, long l) {
	if (i >= -53)
	    return null;
	z++;
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i_11_ = 0;
	for (long l_12_ = l; l_12_ != 0L; l_12_ /= 37L)
	    i_11_++;
	StringBuffer stringbuffer = new StringBuffer(i_11_);
	while (l != 0L) {
	    long l_13_ = l;
	    l /= 37L;
	    stringbuffer.append(Class_q.a[(int) (l_13_ - 37L * l)]);
	}
	return stringbuffer.reverse().toString();
    }
    
    static final boolean a(dt var_dt, pl var_pl, pl var_pl_14_, pl var_pl_15_,
			   int i) {
	ou.g = var_dt;
	q++;
	qs.h = var_pl;
	re.e = var_pl_14_;
	if (i > -67)
	    return false;
	Animable.pl_ = var_pl_15_;
	return true;
    }
    
    public static void d(int i) {
	o = null;
	incomingPacket96 = null;
	if (i != 0)
	    a((byte) 38, 17L);
    }
    
    final void b(int i) {
	u = Math.abs(u);
	s++;
	if (u >= 4096)
	    u = 4095;
	a(n++, (byte) -76, (byte) (u >> 4));
	u = 0;
	if (i != 1)
	    a(null, null, null, null, 20);
    }
}
