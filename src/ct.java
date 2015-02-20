/* ct - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ct
{
    static int a;
    static int b;
    static int c;
    
    static final void a(int i, Class_r class_r) {
	c++;
	if (!gea.n)
	    uj.a(16777215, class_r);
	else
	    pj.a(256, class_r);
	if (i == 2) {
	    /* empty */
	}
    }
    
    public ct() {
	/* empty */
    }
    
    public final String toString() {
	a++;
	throw new IllegalStateException();
    }
    
    final int a(int i, int i_0_, int i_1_) {
	b++;
	int i_2_ = i < ff.width ? ff.width : i;
	if (this == ml.g)
	    return 0;
	if (this == Class_lc.I)
	    return i_2_ - i_0_;
	if (this == jga.r)
	    return (i_2_ - i_0_) / 2;
	if (i_1_ != 2)
	    return 34;
	return 0;
    }
}
