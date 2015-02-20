/* me - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class me extends Node implements au
{
    int k;
    static float[] l = new float[4];
    static int[] m = new int[5];
    static int n;
    int o;
    static int p;
    static Class_rf q = null;
    static int r;
    int s;
    char t;
    long u;
    static int v;
    static int w;
    static int x;
    
    public final char a(boolean bool) {
	if (bool != true)
	    l = null;
	p++;
	return ((me) this).t;
    }
    
    static final void a(boolean bool, int i, int i_0_, Class_r class_r,
			ObjectDef var_bda, int i_1_) {
	r++;
	wi var_wi = gda.d.a(((ObjectDef) var_bda).u, (byte) 90);
	if (((wi) var_wi).a != -1) {
	    if (((ObjectDef) var_bda).U) {
		i_1_ += ((ObjectDef) var_bda).I;
		i_1_ &= 0x3;
	    } else
		i_1_ = 0;
	    f var_f = var_wi.a(((ObjectDef) var_bda).db, class_r, i_1_, -103);
	    if (var_f != null && bool == true) {
		int i_2_ = ((ObjectDef) var_bda).A;
		int i_3_ = ((ObjectDef) var_bda).J;
		if ((i_1_ & 0x1) == 1) {
		    i_2_ = ((ObjectDef) var_bda).J;
		    i_3_ = ((ObjectDef) var_bda).A;
		}
		int i_4_ = var_f.A();
		int i_5_ = var_f.ca();
		if (((wi) var_wi).g) {
		    i_5_ = i_3_ * 4;
		    i_4_ = 4 * i_2_;
		}
		if (((wi) var_wi).d != 0)
		    var_f.a(i, i_0_ - (i_3_ - 1) * 4, i_4_, i_5_, 0,
			    ~0xffffff | ((wi) var_wi).d, 1);
		else
		    var_f.a(i, -(4 * i_3_) - (-4 - i_0_), i_4_, i_5_);
	    }
	}
    }
    
    public final int b(int i) {
	if (i != -15194)
	    a(true, -26, -108, null, null, -126);
	n++;
	return ((me) this).s;
    }
    
    public final long a(int i) {
	if (i != 26017)
	    a(true, 25, -19, null, null, 112);
	v++;
	return ((me) this).u;
    }
    
    public static void i(int i) {
	q = null;
	l = null;
	if (i == 4)
	    m = null;
    }
    
    public final int a(byte i) {
	if (i > -34)
	    ((me) this).s = -47;
	w++;
	return ((me) this).o;
    }
    
    public final int c(int i) {
	if (i != 22858)
	    c(-65);
	x++;
	return ((me) this).k;
    }
}
