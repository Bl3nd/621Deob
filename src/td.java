/* td - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class td
{
    private jk[] a;
    static int b;
    static GameInPacket incomingPacket89 = new GameInPacket(89, -1);
    private int d;
    static int e;
    private int f = -1;
    static int g;
    private int[][][] h;
    static GameOutPacket i;
    static int j;
    private Class_ae k;
    static int l;
    private int m = 0;
    static long[] n = new long[32];
    private int o;
    boolean p;
    
    static final void a(int i, byte i_0_, long l, int i_1_) {
	e++;
	int i_2_ = (int) l >> 14 & 0x1f;
	int i_3_ = 0x3 & (int) l >> 20;
	int i_4_ = (int) (l >>> 32) & 0x7fffffff;
	if (i_0_ == -42) {
	    if (i_2_ == 10 || i_2_ == 11 || i_2_ == 22) {
		ObjectDef var_bda = ul.k.getObjectDef((byte) 96, i_4_);
		int i_5_;
		int i_6_;
		if (i_3_ != 0 && i_3_ != 2) {
		    i_6_ = ((ObjectDef) var_bda).A;
		    i_5_ = ((ObjectDef) var_bda).J;
		} else {
		    i_5_ = ((ObjectDef) var_bda).A;
		    i_6_ = ((ObjectDef) var_bda).J;
		}
		int i_7_ = ((ObjectDef) var_bda).fb;
		if (i_3_ != 0)
		    i_7_ = (0xf & i_7_ << i_3_) + (i_7_ >> -i_3_ + 4);
		la.a(1, 0, 0, i_6_, i_7_, true, i, i_1_, i_5_);
	    } else
		la.a(i_0_ ^ ~0x28, i_3_, i_2_, 0, 0, true, i, i_1_, 0);
	}
    }
    
    final int[][] a(int i, int i_8_) {
	j++;
	if (i_8_ > -14)
	    f = 30;
	if (o != d) {
	    if (d != 1) {
		jk var_jk = a[i];
		if (var_jk == null) {
		    ((td) this).p = true;
		    if (d <= m) {
			jk var_jk_9_ = (jk) k.c(false);
			var_jk = new jk(i, ((jk) var_jk_9_).q);
			a[((jk) var_jk_9_).o] = null;
			var_jk_9_.unlink(-105);
		    } else {
			var_jk = new jk(i, m);
			m++;
		    }
		    a[i] = var_jk;
		} else
		    ((td) this).p = false;
		k.a(var_jk, (byte) 62);
		return h[((jk) var_jk).q];
	    }
	    ((td) this).p = f != i;
	    f = i;
	    return h[0];
	}
	((td) this).p = a[i] == null;
	a[i] = bc.c;
	return h[i];
    }
    
    final int[][][] a(int i) {
	b++;
	if (d != o)
	    throw new RuntimeException("Can only retrieve nullLoader full image cache");
	for (int i_10_ = i; d > i_10_; i_10_++)
	    a[i_10_] = bc.c;
	return h;
    }
    
    public static void b(int i) {
	if (i != 2147483647)
	    b(-24);
	incomingPacket89 = null;
	n = null;
	td.i = null;
    }
    
    final void c(int i) {
	g++;
	if (i >= -7)
	    a(58, (byte) 85, 59L, -107);
	for (int i_11_ = 0; d > i_11_; i_11_++) {
	    h[i_11_][0] = null;
	    h[i_11_][1] = null;
	    h[i_11_][2] = null;
	    h[i_11_] = null;
	}
	a = null;
	h = null;
	k.d(2);
	k = null;
    }
    
    td(int i, int i_12_, int i_13_) {
	k = new Class_ae();
	((td) this).p = false;
	o = i_12_;
	d = i;
	a = new jk[o];
	h = new int[d][3][i_13_];
    }
    
    static {
	l = -2;
	i = new GameOutPacket(42, 2);
    }
}
