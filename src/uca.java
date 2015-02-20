/* uca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class uca
{
    static Color[] a = { new Color(16777215), new Color(16777215) };
    static int b;
    static int c;
    static Class_ec d = new Class_ec(3);
    
    public static void a(int i) {
	d = null;
	if (i != 3)
	    a = null;
	a = null;
    }
    
    static final void b(int i) {
	c++;
	if (hm.h == i)
	    la.logout((byte) 112, false);
	else {
	    wj.l = ce.y;
	    ce.y = null;
	    ei.a(13, i - 134);
	}
    }
    
    static final boolean a(int i, int i_0_, int i_1_) {
	b++;
	if (i != 2048)
	    a(-69, 10, -20);
	if ((0x800 & i_1_) == 0)
	    return false;
	return true;
    }
    
    static int a(int i, int i_2_) {
	return i & i_2_;
    }
}
