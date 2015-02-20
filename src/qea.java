/* qea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qea
{
    static long a;
    static int b = 0;
    static int c;
    static boolean[][][] d;
    static int[] e = new int[500];
    
    static final void a(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
	if (i_2_ >= vaa.xb && i_2_ <= jga.v) {
	    i_3_ = sl.a(i_3_, 4095, Class_md.h, Class_db.o);
	    i = sl.a(i, i_0_ ^ 0xffe, Class_md.h, Class_db.o);
	    mm.a(i_1_, i, (byte) 117, i_2_, i_3_);
	}
	c++;
	if (i_0_ != 1)
	    d = null;
    }
    
    public static void a(byte i) {
	d = null;
	e = null;
	if (i <= 123)
	    b = -52;
    }
}
