/* Class_qb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_qb
{
    static int a;
    int b;
    int c;
    int d;
    static int e;
    static int f;
    static GameInPacket incomingPacket69 = new GameInPacket(69, 6);
    static int[][] h = { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 },
			 { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 },
			 { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 },
			 { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 },
			 { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
    static Class_mc[][] i;
    static int[] j = new int[32];
    static boolean showColMap = false;
    
    public static void a(byte i) {
	Class_qb.i = null;
	j = null;
	h = null;
	if (i != 17)
	    Class_qb.i = null;
	incomingPacket69 = null;
    }
    
    static final void a(int i, boolean bool, int i_0_) {
	e++;
	hg var_hg = el.a(bool, (byte) 59, i_0_);
	if (var_hg != null) {
	    if (i <= 39)
		Class_qb.i = null;
	    var_hg.unlink(-10);
	}
    }
    
    private final void a(byte i, int i_1_, BytesParser var_es) {
	f++;
	if (i_1_ == 1) {
	    ((Class_qb) this).c = var_es.readShort(13111);
	    ((Class_qb) this).d = var_es.readUnsignedByte(-9268);
	    ((Class_qb) this).b = var_es.readUnsignedByte(-9268);
	}
	if (i < 124)
	    a(-104, true, -28);
    }
    
    public Class_qb() {
	/* empty */
    }
    
    final void a(int i, BytesParser var_es) {
	if (i != 1)
	    a((byte) 118, 111, null);
	for (;;) {
	    int i_2_ = var_es.readUnsignedByte(-9268);
	    if (i_2_ == 0)
		break;
	    a((byte) 127, i_2_, var_es);
	}
	a++;
    }
    
    static {
	int i = 2;
	for (int i_3_ = 0; i_3_ < 32; i_3_++) {
	    j[i_3_] = i - 1;
	    i += i;
	}
    }
}
