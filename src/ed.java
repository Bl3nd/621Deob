/* ed - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class ed extends bc
{
    private long e;
    private long f = 0L;
    private int g;
    private int h;
    private long[] i;
    private long j;
    
    final long c(int i) {
	f += a((byte) 40);
	if (i > -96)
	    return -22L;
	if (f < e)
	    return (e - f) / 1000000L;
	return 0L;
    }

    final int a(long l, byte i) {
	int i_0_ = 121 / ((50 - i) / 63);
	if (e <= f) {
	    int i_1_ = 0;
	    do {
		i_1_++;
		e += l;
	    } while (i_1_ < 10 && f > e);
	    if (f > e)
		e = f;
	    return i_1_;
	}
	j += e - f;
	f += e - f;
	e += l;
	return 1;
    }
    
    final void d(int time) {
	j = (long) time;
	if (e > f)
	    f += e - f;
    }
    
    ed() {
	e = 0L;
	g = 0;
	i = new long[10];
	h = 1;
	j = 0L;
	e = f = jagmisc.nanoTime();
	if (f == 0L)
	    throw new RuntimeException();
    }
    
    private final long a(byte i) {
	if (i != 40)
	    j = -1L;
	long l = jagmisc.nanoTime();
	long l_2_ = l - j;
	j = l;
	if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
	    this.i[g] = l_2_;
	    if (h < 1)
		h++;
	    g = (g + 1) % 10;
	}
	long l_3_ = 0L;
	for (int i_4_ = 1; h >= i_4_; i_4_++)
	    l_3_ += this.i[(g - i_4_ + 10) % 10];
	return l_3_ / (long) h;
    }
    
    final long b() {
	/*if (i != 26262)
	    return 95L;*/
	return f;
    }
}
