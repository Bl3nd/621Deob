/* uc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class uc
{
    static int a;
    static int b;
    static ou c;
    static int d;
    static int e;
    static int f;
    static byte[][] g;
    qj h;
    
    abstract void a(int i, int i_0_, rg var_rg);
    
    abstract void a(int i);
    
    abstract boolean a(byte i);
    
    static final void b(byte i) {
	b++;
	bca.c = -1;
	qaa.T = 0;
	dg.Cb = -1;
	if (i < -96)
	    uaa.h = -1;
    }
    
    public static void c(byte i) {
	g = null;
	c = null;
	if (i > -61)
	    g = null;
    }
    
    abstract void a(int i, boolean bool);
    
    abstract void a(int i, int i_1_, int i_2_);
    
    abstract void b(int i, boolean bool);
    
    static final void a(int i, int i_3_, boolean bool, int i_4_, int i_5_,
			int i_6_, int i_7_) {
	a++;
	if (i_3_ != ((bool ? ((jb) cs.g).P : ((jb) cs.g).I) ^ 0xffffffff)
	    && i_5_ != 0 && je.i < 50 && (i ^ 0xffffffff) != 0)
	    tn.j[je.i++] = new vt(!bool ? (byte) 2 : (byte) 3, i, i_5_, i_6_,
				  i_4_, i_7_);
    }
    
    static final int a(int i, int i_8_, int i_9_, int i_10_) {
	i_8_ &= 0x3;
	e++;
	if (i_8_ == 0)
	    return i_10_;
	if (i_8_ == 1)
	    return -i + 7;
	if (i_9_ > -59)
	    c((byte) 63);
	if (i_8_ == 2)
	    return -i_10_ + 7;
	return i;
    }
    
    uc(qj var_qj) {
	((uc) this).h = var_qj;
    }
}
