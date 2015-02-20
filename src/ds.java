/* ds - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ds
{
    static int a;
    int[] b;
    int[] c;
    int[][] d;
    int e;
    int f;
    int[] g;
    int[][] h;
    static sfa i = new sfa();
    private byte[] j;
    id k;
    id[] l;
    byte[][] m;
    int[] n;
    int o;
    int[] p;
    int q;
    int[] r;
    
    private final void a(int i, byte[] is) {
	a++;
	BytesParser var_es = new BytesParser(ek.a(0, is));
	int i_0_ = var_es.readUnsignedByte(-9268);
	if (i_0_ < 5 || i_0_ > 6)
	    throw new RuntimeException();
	if (i_0_ >= 6)
	    ((ds) this).e = var_es.readInt(i + 58);
	else
	    ((ds) this).e = 0;
	int i_1_ = var_es.readUnsignedByte(-9268);
	boolean bool = (0x1 & i_1_) != 0;
	boolean bool_2_ = (i_1_ & 0x2) != 0;
	((ds) this).q = var_es.readShort(13111);
	int i_3_ = 0;
	((ds) this).g = new int[((ds) this).q];
	int i_4_ = -1;
	for (int i_5_ = 0; ((ds) this).q > i_5_; i_5_++) {
	    ((ds) this).g[i_5_] = i_3_ += var_es.readShort(13111);
	    if (((ds) this).g[i_5_] > i_4_)
		i_4_ = ((ds) this).g[i_5_];
	}
	((ds) this).f = i_4_ + 1;
	((ds) this).d = new int[((ds) this).f][];
	((ds) this).r = new int[((ds) this).f];
	((ds) this).p = new int[((ds) this).f];
	((ds) this).b = new int[((ds) this).f];
	((ds) this).c = new int[((ds) this).f];
	if (bool_2_)
	    ((ds) this).m = new byte[((ds) this).f][];
	if (bool) {
	    ((ds) this).n = new int[((ds) this).f];
	    for (int i_6_ = 0; i_6_ < ((ds) this).f; i_6_++)
		((ds) this).n[i_6_] = -1;
	    for (int i_7_ = 0; ((ds) this).q > i_7_; i_7_++)
		((ds) this).n[((ds) this).g[i_7_]] = var_es.readInt(118);
	    ((ds) this).k = new id(((ds) this).n);
	}
	for (int i_8_ = i; ((ds) this).q > i_8_; i_8_++)
	    ((ds) this).p[((ds) this).g[i_8_]] = var_es.readInt(68);
	if (bool_2_) {
	    for (int i_9_ = 0; ((ds) this).q > i_9_; i_9_++) {
		byte[] is_10_ = new byte[64];
		var_es.readBytes(is_10_, true, 64, 0);
		((ds) this).m[((ds) this).g[i_9_]] = is_10_;
	    }
	}
	for (int i_11_ = 0; ((ds) this).q > i_11_; i_11_++)
	    ((ds) this).b[((ds) this).g[i_11_]] = var_es.readInt(64);
	for (int i_12_ = 0; i_12_ < ((ds) this).q; i_12_++)
	    ((ds) this).r[((ds) this).g[i_12_]] = var_es.readShort(13111);
	for (int i_13_ = 0; ((ds) this).q > i_13_; i_13_++) {
	    int i_14_ = ((ds) this).g[i_13_];
	    int i_15_ = ((ds) this).r[i_14_];
	    i_3_ = 0;
	    int i_16_ = -1;
	    ((ds) this).d[i_14_] = new int[i_15_];
	    for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
		int i_18_
		    = ((ds) this).d[i_14_][i_17_] = i_3_ += var_es.readShort(13111);
		if (i_16_ < i_18_)
		    i_16_ = i_18_;
	    }
	    ((ds) this).c[i_14_] = i_16_ + 1;
	    if (i_16_ + 1 == i_15_)
		((ds) this).d[i_14_] = null;
	}
	if (bool) {
	    ((ds) this).l = new id[i_4_ + 1];
	    ((ds) this).h = new int[i_4_ + 1][];
	    for (int i_19_ = 0; i_19_ < ((ds) this).q; i_19_++) {
		int i_20_ = ((ds) this).g[i_19_];
		int i_21_ = ((ds) this).r[i_20_];
		((ds) this).h[i_20_] = new int[((ds) this).c[i_20_]];
		for (int i_22_ = 0; i_22_ < ((ds) this).c[i_20_]; i_22_++)
		    ((ds) this).h[i_20_][i_22_] = -1;
		for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
		    int i_24_;
		    if (((ds) this).d[i_20_] != null)
			i_24_ = ((ds) this).d[i_20_][i_23_];
		    else
			i_24_ = i_23_;
		    ((ds) this).h[i_20_][i_24_] = var_es.readInt(57);
		}
		((ds) this).l[i_20_] = new id(((ds) this).h[i_20_]);
	    }
	}
    }
    
    public static void a(int i) {
	ds.i = null;
	if (i != -27718)
	    a(-109);
    }
    
    ds(byte[] is, int i, byte[] is_25_) {
	((ds) this).o = hu.a(is, (byte) -95, is.length);
	if (((ds) this).o != i)
	    throw new RuntimeException();
	if (is_25_ != null) {
	    if (is_25_.length != 64)
		throw new RuntimeException();
	    j = Class_a.a(is.length, is, 127, 0);
	    for (int i_26_ = 0; i_26_ < 64; i_26_++) {
		if (j[i_26_] != is_25_[i_26_])
		    throw new RuntimeException();
	    }
	}
	a(0, is);
    }
}
