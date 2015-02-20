/* Class_wb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

class Class_wb extends Interactable
{
    Class_wb g;
    Class_wb h;
    static Random random;
    static int j;
    static int[][] k
	= { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 },
	    { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
	    { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 },
	    { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
	    { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    static int l;
    static float m;
    
    final void a(int i) {
	l++;
	if (((Class_wb) this).g != null) {
	    ((Class_wb) ((Class_wb) this).g).h = ((Class_wb) this).h;
	    ((Class_wb) ((Class_wb) this).h).g = ((Class_wb) this).g;
	    ((Class_wb) this).g = null;
	    ((Class_wb) this).h = null;
	    if (i != 10511)
		a(false);
	}
    }
    
    static final int a(int i, int i_0_) {
	if (i_0_ != -20650)
	    m = -2.5326827F;
	j++;
	return i >>> 8;
    }
    
    public Class_wb() {
	/* empty */
    }
    
    public static void a(boolean bool) {
	random = null;
	k = null;
	if (bool != false)
	    k = null;
    }
    
    static {
	random = new Random();
    }
}
