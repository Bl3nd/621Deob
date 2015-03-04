/* ne - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ne extends bc
{
    private long e = 0L;
    private long f = 0L;
    private int g;
    private long[] h;
    private long i = 0L;
    private int j;
    
    final long b() {
	return f;
    }
    
    final void d(int time) {
	this.i = (long) time;
	if (f < e)
	    f += e - f;
    }
    
    final long c(int i) {
	f += e(-82);
	if (e > f)
	    return (e - f) / 1000000L;
	if (i > -96)
	    return 28L;
	return 0L;
    }
    
    final int a(long l, byte i) {
	int i_0_ = -9 % ((i - 50) / 63);
	if (f < e) {
	    this.i += e - f;
	    f += e - f;
	    e += l;
	    return 1;
	}
	int i_1_ = 0;
	do {
	    e += l;
	    i_1_++;
	} while (10 > i_1_ && e < f);
	if (f > e)
	    e = f;
	return i_1_;
    }
    
    ne() {
	h = new long[10];
	g = 1;
	j = 0;
	f = System.nanoTime();
	e = System.nanoTime();
    }
    
    private final long e(int i) {
	long l = System.nanoTime();
	long l_2_ = l - this.i;
	this.i = l;
	if (-5000000000L < l_2_ && l_2_ < 5000000000L) {
	    h[j] = l_2_;
	    j = (j + 1) % 10;
	    if (g < 1)
		g++;
	}
	long l_3_ = 0L;
	if (i > -76)
	    e = 70L;
	for (int i_4_ = 1; g >= i_4_; i_4_++)
	    l_3_ += h[(j + (-i_4_ + 10)) % 10];
	return l_3_ / (long) g;
    }
}
