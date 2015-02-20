/* ml - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ml
{
    static long[] a = new long[256];
    int b;
    static int c;
    static int d;
    private lm e;
    static int f;
    static ct g;
    static int h;
    static pl i;
    static int j;
    static boolean k;
    
    static final boolean a(byte i, int i_0_) {
	c++;
	if (i != 22)
	    a((byte) 21, 61);
	if (i_0_ != 4 && i_0_ != 8 && i_0_ != 11)
	    return false;
	return true;
    }
    
    static final void a(byte i, int i_1_, boolean bool, int i_2_,
			boolean bool_3_) {
	mp.a(bool, il.o.length - 1, bool_3_, 2, i_2_, 0, i_1_);
	if (i != -25)
	    a((byte) 81, -100, true, 73, false);
	f++;
	vh.c = 0;
	fk.c = null;
    }
    
    public static void a(byte i) {
	a = null;
	if (i == -92) {
	    ml.i = null;
	    g = null;
	}
    }
    
    protected final void finalize() throws Throwable {
	e.g(((ml) this).b, 27077);
	d++;
	super.finalize();
    }
    
    ml(lm var_lm, int i, int i_4_) {
	e = var_lm;
	((ml) this).b = i_4_;
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    long l = (long) i;
	    for (int i_5_ = 0; i_5_ < 8; i_5_++) {
		if ((l & 0x1L) == 1L)
		    l = ~0x3693a86a2878f0bdL ^ l >>> 1;
		else
		    l >>>= 1;
	    }
	    a[i] = l;
	}
	g = new ct();
	h = -1;
	j = 0;
	k = false;
    }
}
