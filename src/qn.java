/* qn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qn
{
    static int a;
    static sfa b = new sfa();
    static int c;
    static int d;
    static int e;
    private tb f = new tb(64);
    private pl g;
    pl h;
    static boolean i = false;
    static int j = 0;
    static int k;
    static short[] l = new short[256];
    static int m;
    tb n = new tb(2);
    
    final void a(int i) {
	c++;
	synchronized (f) {
	    f.a(18385);
	}
	synchronized (((qn) this).n) {
	    if (i != 256)
		g = null;
	    ((qn) this).n.a(18385);
	}
    }
    
    final void a(byte i) {
	if (i >= -30)
	    c((byte) 57);
	synchronized (f) {
	    f.c((byte) -122);
	}
	d++;
	synchronized (((qn) this).n) {
	    ((qn) this).n.c((byte) 122);
	}
    }
    
    static final void b(byte i) {
	int i_0_ = 99 % ((-79 - i) / 47);
	Class_i.a((int) 2);
	e++;
    }
    
    final void a(int i, int i_1_) {
	if (i != 0)
	    g = null;
	synchronized (f) {
	    f.a(true, i_1_);
	}
	a++;
	synchronized (((qn) this).n) {
	    ((qn) this).n.a(true, i_1_);
	}
    }
    
    final Class_ag a(int i, byte i_2_) {
	if (i_2_ <= 69)
	    b((byte) 107);
	m++;
	Class_ag var_ag;
	synchronized (f) {
	    var_ag = (Class_ag) f.get((long) i, (byte) 100);
	}
	if (var_ag != null)
	    return var_ag;
	byte[] is;
	synchronized (g) {
	    is = g.b(i, 92, 33);
	}
	var_ag = new Class_ag();
	((Class_ag) var_ag).c = this;
	if (is != null)
	    var_ag.a(-40, new BytesParser(is));
	synchronized (f) {
	    f.put((long) i, var_ag, 1);
	}
	return var_ag;
    }
    
    public static void c(byte i) {
	if (i != 6)
	    b = null;
	b = null;
	l = null;
    }
    
    qn(Class_rf class_rf, int i, pl var_pl, pl var_pl_3_) {
	((qn) this).h = var_pl_3_;
	g = var_pl;
	g.a(33, true);
    }
}
