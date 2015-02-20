/* sd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sd
{
    private int a;
    private int b;
    private int c;
    static int d;
    private int e;
    private int f;
    static int g;
    private int h;
    private int i;
    static long[] j;
    private int k;
    static int l;
    private int m;
    static int n;
    private int o;
    
    final boolean a(int i, int i_0_, int i_1_, int i_2_) {
	d++;
	if (b > i || this.i < i)
	    return false;
	int i_3_ = 9 / ((i_1_ - 67) / 49);
	if (i_2_ < f || c < i_2_)
	    return false;
	if (m > i_0_ || k < i_0_)
	    return false;
	int i_4_ = i - e;
	int i_5_ = i_0_ - a;
	if (o <= i_4_ * i_4_ + i_5_ * i_5_)
	    return false;
	return true;
    }
    
    static final void a(int i) {
	g++;
	mu.j = 0;
	int i_6_ = 28 / ((i + 51) / 48);
	oba.I.d(2);
	gea.n = false;
    }
    
    final void a(int i, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_,
		 int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
	e = i;
	o = i_8_ * i_8_;
	a = i_10_;
	n++;
	h = i_14_;
	c = h + i_13_;
	k = i_15_ + a;
	b = e + i_12_;
	m = i_9_ + a;
	if (bool != true)
	    b(-29);
	this.i = e + i_11_;
	f = h + i_7_;
    }
    
    public static void b(int i) {
	j = null;
	if (i != -8862)
	    j = null;
    }
    
    sd(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_,
       int i_22_, int i_23_, int i_24_) {
	h = i_16_;
	o = i_18_ * i_18_;
	a = i_17_;
	e = i;
	m = a + i_23_;
	this.i = i_20_ + e;
	c = h + i_22_;
	f = i_21_ + h;
	b = i_19_ + e;
	k = a + i_24_;
    }
}
