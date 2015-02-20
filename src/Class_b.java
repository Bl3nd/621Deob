/* Class_b - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class_b
{
    static int a;
    static int b;
    static Class_ae c = new Class_ae();
    static int d = 0;
    static Font e;
    static int f = 0;
    
    static final boolean a(int i, int i_0_, int i_1_) {
	b++;
	if (i_1_ != 0)
	    return true;
	if ((0x100 & i_0_) == 0)
	    return false;
	return true;
    }
    
    static final void a(boolean bool, int i, int i_2_, pl var_pl, byte i_3_,
			int i_4_) {
	a++;
	ti.a(0L, -74, i, bool, var_pl, i_4_, i_2_);
	int i_5_ = -118 % ((i_3_ - 38) / 34);
    }
    
    public static void a(byte i) {
	c = null;
	e = null;
	if (i < 2)
	    e = null;
    }
}
