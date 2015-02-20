/* rr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rr implements sn
{
    static int a;
    static int b;
    static int c;
    static int d;
    private pl e;
    private String f;
    static int g = -2;
    static int[] h;
    /*synthetic*/ static Class i;
    
    public static void b(int i) {
	h = null;
	if (i != -2526)
	    h = null;
    }
    
    public final tj a(byte i) {
	a++;
	if (i != -58)
	    return null;
	return tj.e;
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	c++;
	qba var_qba = ofa.a(8, i_3_, (byte) 119);
	var_qba.c((byte) 11);
	if (i_1_ != -26287)
	    a(-57, -80, 55, 1, 72);
	((qba) var_qba).v = i_2_;
	((qba) var_qba).t = i_0_;
	((qba) var_qba).A = i;
    }
    
    static final boolean a(int i, int i_4_, int i_5_, int i_6_) {
	d++;
	boolean bool = true;
	vda var_vda = (vda) Class_nb.a(i_6_, i_5_, i);
	if (i_4_ != 100)
	    a(25, -62, 92, -75);
	if (var_vda != null)
	    bool &= pv.a(0, var_vda);
	var_vda = (vda) ik.a(i_6_, i_5_, i,
			     rr.i != null ? rr.i : (rr.i = a("vda")));
	if (var_vda != null)
	    bool &= pv.a(i_4_ - 100, var_vda);
	var_vda = (vda) lr.a(i_6_, i_5_, i);
	if (var_vda != null)
	    bool &= pv.a(i_4_ ^ 0x64, var_vda);
	return bool;
    }
    
    public final int a(int i) {
	b++;
	if (e.a(31850, f))
	    return 100;
	int i_7_ = 70 / ((i + 55) / 49);
	return 0;
    }
    
    rr(pl var_pl, String string) {
	e = var_pl;
	f = string;
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
