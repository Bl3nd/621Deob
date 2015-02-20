/* sq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sq
{
    static int a;
    private Node b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    private Class_ae h;
    
    final void a(byte i, Class_ae class_ae) {
	if (i != -104)
	    c = -74;
	e++;
	h = class_ae;
    }
    
    static final void a(int i, pl var_pl, int i_0_, int i_1_, long l,
			boolean bool, int i_2_, int i_3_) {
	ISAAC.q = i_2_;
	nj.m = bool;
	wl.g = l;
	pj.j = 1;
	Class_vb.s = var_pl;
	ha.u = i_0_;
	uaa.e = i_1_;
	ifa.a = i;
	dt.nb = i_3_;
	f++;
    }
    
    final Node a(int i) {
	if (i != -15840)
	    h = null;
	d++;
	Node class_d = b;
	if (class_d == ((Class_ae) h).o) {
	    b = null;
	    return null;
	}
	b = ((Node) class_d).previous;
	return class_d;
    }
    
    final Node b(int i) {
	a++;
	Node class_d = ((Node) ((Class_ae) h).o).previous;
	if (((Class_ae) h).o == class_d) {
	    b = null;
	    return null;
	}
	int i_4_ = -1 / ((i - 39) / 53);
	b = ((Node) class_d).previous;
	return class_d;
    }
    
    public sq() {
	/* empty */
    }
    
    sq(Class_ae class_ae) {
	h = class_ae;
    }
}
