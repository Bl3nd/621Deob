/* Class_ob - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class Class_ob extends IncomingPackets
{
    static int n;
    static int o;
    static hv[] p;
    static int q;
    static String r = null;
    static int s;
    static int[] t;
    static int u;
    NativeHeap v;
    
    final void a(int i) {
	u++;
	if (i != -15184)
	    a((int) -14);
	((Class_ob) this).v.b();
    }
    
    static final String a(bfa var_bfa, int i) {
	if (i < 113)
	    b(109, -13);
	n++;
	if (((bfa) var_bfa).p == null || ((bfa) var_bfa).p.length() <= 0)
	    return ((bfa) var_bfa).k;
	return (((bfa) var_bfa).k + GameText.O.getString((byte) -64, cba.languageID)
		+ ((bfa) var_bfa).p);
    }
    
    static final boolean a(int i, byte i_0_, int i_1_) {
	if (i_0_ != 92)
	    a(-41, (byte) -43, -84);
	q++;
	if ((0x800 & i_1_) == 0)
	    return false;
	return true;
    }
    
    static final String a(BytesParser var_es, byte i) {
	o++;
	int i_2_ = -78 / ((i + 67) / 49);
	return oea.a((byte) 103, var_es, 32767);
    }
    
    public static void b(int i) {
	if (i == 0) {
	    t = null;
	    p = null;
	    r = null;
	}
    }
    
    static final int b(int i, int i_3_) {
	s++;
	if (i_3_ != 0)
	    t = null;
	return 0xff & i;
    }
    
    Class_ob(int i) {
	((Class_ob) this).v = new NativeHeap(i);
    }
}
