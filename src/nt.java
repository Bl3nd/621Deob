/* nt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nt
{
    static int a;
    static int b;
    static baa c;
    static String[] d = new String[5];
    static qfa e;
    
    public static void a(byte i) {
	if (i < 103)
	    a(-62, 50, 105, 66, 94, -36, -87, -50);
	c = null;
	d = null;
	e = null;
    }
    
    static final boolean a(int i, byte i_0_) {
	a++;
	if (i_0_ < 17)
	    e = null;
	if (i == 25 || i == 11 || i == 6 || i == 46 || i == 16)
	    return true;
	if (i == 48 || i == 1004)
	    return true;
	return false;
    }
    
    static final void a(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_) {
	b++;
	if (i_2_ == i_7_)
	    en.b(i_6_, i_7_, i_1_, i_3_, i_5_, 110, i_4_);
	else {
	    if (i_5_ - i_7_ >= vaa.xb && jga.v >= i_7_ + i_5_
		&& i_1_ - i_2_ >= Class_md.h && i_1_ + i_2_ <= Class_db.o)
		Class_ef.a(i_5_, i_7_, i_3_, i_2_, -96, i_6_, i_1_, i_4_);
	    else
		ff.a(i_1_, i_2_, 6144, i_7_, i_6_, i_5_, i_3_, i_4_);
	    if (i > -59)
		a(54, -113, 104, -26, 31, 121, 16, -100);
	}
    }
    
    static {
	c = new baa(0, 2, 2, 1);
	e = new qfa("", 10);
    }
}
