/* ew - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ew extends Node
{
    static int k = 0;
    static int[] l = new int[1];
    static int m;
    static int n;
    static int[][] o
	= { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 },
	    { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
	    { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 },
	    { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 },
	    { 12, 12, 12, 12 } };
    
    abstract int a(int i);
    
    abstract int a(boolean bool);
    
    static final boolean a(int i, int i_0_, int i_1_) {
	if (i_0_ != 1)
	    l = null;
	m++;
	if ((0x22 & i) == 0)
	    return false;
	return true;
    }
    
    public static void b(int i) {
	l = null;
	o = null;
	if (i < 32)
	    b(60);
    }
    
    public ew() {
	/* empty */
    }
    
    abstract int b(boolean bool);
    
    static final float a(float f, float f_2_, int i, float f_3_) {
	n++;
	if (i > -60)
	    k = -28;
	return f * (f_3_ - f_2_) + f_2_;
    }
    
    abstract int c(int i);
    
    abstract long i(int i);
}
