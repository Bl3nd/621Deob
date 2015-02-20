/* ai - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ai extends bc
{
    private int e = 0;
    private long[] f = new long[10];
    private int g;
    private long h;
    private long i = 0L;
    private long j;
    
    final long c(int i) {
	if (i > -96)
	    h = 110L;
	h += a(true);
	if (this.i > h)
	    return (this.i - h) / 1000000L;
	return 0L;
    }
    
    final void d(int i) {
	if (h < this.i)
	    h += this.i - h;
	j = (long) i;
    }
    
    final int a(long l, byte i) {
	int i_0_ = -90 / ((i - 50) / 63);
	if (h >= this.i) {
	    int i_1_ = 0;
	    do {
		i_1_++;
		this.i += l;
	    } while (i_1_ < 10 && this.i < h);
	    if (this.i < h)
		this.i = h;
	    return i_1_;
	}
	j += this.i - h;
	h += this.i - h;
	this.i += l;
	return 1;
    }
    
    final long b(int i) {
	if (i != 26262)
	    d(67);
	return h;
    }
    
    private final long a(boolean bool) {
	long l = 1000000L * us.a(120);
	long l_2_ = l - j;
	j = l;
	if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
	    f[e] = l_2_;
	    e = (e + 1) % 10;
	    if (g < 10)
		g++;
	}
	long l_3_ = 0L;
	for (int i = 1; g >= i; i++)
	    l_3_ += f[(-i + 10 + e) % 10];
	if (bool != true)
	    h = -13L;
	return l_3_ / (long) g;
    }
    
    ai() {
	h = 0L;
	g = 1;
	j = 0L;
    }
}
