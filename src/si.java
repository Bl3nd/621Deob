/* si - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class si
{
    private static byte[] a
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private BytesParser b;
    int c;
    int[] d;
    private int e;
    private int[] f;
    private int[] g;
    private long h;
    private int[] i;
    
    final int a() {
	return g.length;
    }
    
    final int b() {
	int i = g.length;
	int i_0_ = -1;
	int i_1_ = 2147483647;
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    if (g[i_2_] >= 0 && ((si) this).d[i_2_] < i_1_) {
		i_0_ = i_2_;
		i_1_ = ((si) this).d[i_2_];
	    }
	}
	return i_0_;
    }
    
    final void a(int i) {
	((BytesParser) b).pos = g[i];
    }
    
    final boolean c() {
	if (((BytesParser) b).bytes == null)
	    return false;
	return true;
    }
    
    private final int a(int i, int i_3_) {
	if (i_3_ == 255) {
	    int i_4_ = b.readUnsignedByte(-9268);
	    int i_5_ = b.c(false);
	    if (i_4_ == 47) {
		((BytesParser) b).pos += i_5_;
		return 1;
	    }
	    if (i_4_ == 81) {
		int i_6_ = b.readTribyte(-1);
		i_5_ -= 3;
		int i_7_ = ((si) this).d[i];
		h += (long) i_7_ * (long) (e - i_6_);
		e = i_6_;
		((BytesParser) b).pos += i_5_;
		return 2;
	    }
	    ((BytesParser) b).pos += i_5_;
	    return 3;
	}
	byte i_8_ = a[i_3_ - 128];
	int i_9_ = i_3_;
	if (i_8_ >= 1)
	    i_9_ |= b.readUnsignedByte(-9268) << 8;
	if (i_8_ >= 2)
	    i_9_ |= b.readUnsignedByte(-9268) << 16;
	return i_9_;
    }
    
    public static void d() {
	a = null;
    }
    
    final boolean e() {
	int i = g.length;
	for (int i_10_ = 0; i_10_ < i; i_10_++) {
	    if (g[i_10_] >= 0)
		return false;
	}
	return true;
    }
    
    final void b(int i) {
	int i_11_ = b.c(false);
	((si) this).d[i] += i_11_;
    }
    
    final void c(int i) {
	g[i] = ((BytesParser) b).pos;
    }
    
    private final int d(int i) {
	int i_12_ = ((BytesParser) b).bytes[((BytesParser) b).pos];
	if (i_12_ < 0) {
	    i_12_ &= 0xff;
	    f[i] = i_12_;
	    ((BytesParser) b).pos++;
	} else
	    i_12_ = f[i];
	if (i_12_ == 240 || i_12_ == 247) {
	    int i_13_ = b.c(false);
	    if (i_12_ == 247 && i_13_ > 0) {
		int i_14_ = ((BytesParser) b).bytes[((BytesParser) b).pos] & 0xff;
		if (i_14_ >= 241 && i_14_ <= 243 || i_14_ == 246
		    || i_14_ == 248 || i_14_ >= 250 && i_14_ <= 252
		    || i_14_ == 254) {
		    ((BytesParser) b).pos++;
		    f[i] = i_14_;
		    return a(i, i_14_);
		}
	    }
	    ((BytesParser) b).pos += i_13_;
	    return 0;
	}
	return a(i, i_12_);
    }
    
    final void f() {
	((BytesParser) b).bytes = null;
	i = null;
	g = null;
	((si) this).d = null;
	f = null;
    }
    
    final int e(int i) {
	int i_15_ = d(i);
	return i_15_;
    }
    
    final void a(byte[] is) {
	((BytesParser) b).bytes = is;
	((BytesParser) b).pos = 10;
	int i = b.readShort(13111);
	((si) this).c = b.readShort(13111);
	e = 500000;
	this.i = new int[i];
	int i_16_ = 0;
	while (i_16_ < i) {
	    int i_17_ = b.readInt(67);
	    int i_18_ = b.readInt(70);
	    if (i_17_ == 1297379947) {
		this.i[i_16_] = ((BytesParser) b).pos;
		i_16_++;
	    }
	    ((BytesParser) b).pos += i_18_;
	}
	h = 0L;
	g = new int[i];
	for (int i_19_ = 0; i_19_ < i; i_19_++)
	    g[i_19_] = this.i[i_19_];
	((si) this).d = new int[i];
	f = new int[i];
    }
    
    final void a(long l) {
	h = l;
	int i = g.length;
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    ((si) this).d[i_20_] = 0;
	    f[i_20_] = 0;
	    ((BytesParser) b).pos = this.i[i_20_];
	    b(i_20_);
	    g[i_20_] = ((BytesParser) b).pos;
	}
    }
    
    final long f(int i) {
	return h + (long) i * (long) e;
    }
    
    final void g() {
	((BytesParser) b).pos = -1;
    }
    
    public si() {
	b = new BytesParser(null);
    }
    
    si(byte[] is) {
	b = new BytesParser(null);
	a(is);
    }
}
