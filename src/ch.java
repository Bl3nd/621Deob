/* ch - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ch extends pn
{
    private Class_ae o = new Class_ae();
    private Class_ae p = new Class_ae();
    private int q = 0;
    private int r = -1;
    
    private final void e() {
	if (q > 0) {
	    for (wba var_wba = (wba) p.a((int) 98); var_wba != null;
		 var_wba = (wba) p.b((byte) 70))
		((wba) var_wba).k -= q;
	    r -= q;
	    q = 0;
	}
    }
    
    final pn b() {
	return (pn) o.b((byte) 34);
    }
    
    final synchronized void a(int i) {
	do {
	    if (r < 0) {
		b(i);
		break;
	    }
	    if (q + i < r) {
		q += i;
		b(i);
		break;
	    }
	    int i_0_ = r - q;
	    b(i_0_);
	    i -= i_0_;
	    q += i_0_;
	    e();
	    wba var_wba = (wba) p.a((int) 108);
	    synchronized (var_wba) {
		int i_1_ = var_wba.a(this);
		if (i_1_ < 0) {
		    ((wba) var_wba).k = 0;
		    a(var_wba);
		} else {
		    ((wba) var_wba).k = i_1_;
		    a(((Node) var_wba).previous, var_wba);
		}
	    }
	} while (i != 0);
    }
    
    private final void b(int i) {
	for (pn var_pn = (pn) o.a((int) 125); var_pn != null;
	     var_pn = (pn) o.b((byte) 110))
	    var_pn.a(i);
    }
    
    final int d() {
	return 0;
    }
    
    private final void a(Node class_d, wba var_wba) {
	for (/**/;
	     (class_d != ((Class_ae) p).o
	      && ((wba) (wba) class_d).k <= ((wba) var_wba).k);
	     class_d = ((Node) class_d).previous) {
	    /* empty */
	}
	Class_pb.a(var_wba, class_d, 4);
	r = ((wba) (wba) ((Node) ((Class_ae) p).o).previous).k;
    }
    
    private final void a(wba var_wba) {
	var_wba.unlink(-122);
	var_wba.a();
	Node class_d = ((Node) ((Class_ae) p).o).previous;
	if (class_d == ((Class_ae) p).o)
	    r = -1;
	else
	    r = ((wba) (wba) class_d).k;
    }
    
    final synchronized void b(int[] is, int i, int i_2_) {
	do {
	    if (r < 0) {
		c(is, i, i_2_);
		break;
	    }
	    if (q + i_2_ < r) {
		q += i_2_;
		c(is, i, i_2_);
		break;
	    }
	    int i_3_ = r - q;
	    c(is, i, i_3_);
	    i += i_3_;
	    i_2_ -= i_3_;
	    q += i_3_;
	    e();
	    wba var_wba = (wba) p.a((int) 103);
	    synchronized (var_wba) {
		int i_4_ = var_wba.a(this);
		if (i_4_ < 0) {
		    ((wba) var_wba).k = 0;
		    a(var_wba);
		} else {
		    ((wba) var_wba).k = i_4_;
		    a(((Node) var_wba).previous, var_wba);
		}
	    }
	} while (i_2_ != 0);
    }
    
    private final void c(int[] is, int i, int i_5_) {
	for (pn var_pn = (pn) o.a((int) 99); var_pn != null;
	     var_pn = (pn) o.b((byte) 73))
	    var_pn.a(is, i, i_5_);
    }
    
    final synchronized void a(pn var_pn) {
	var_pn.unlink(-92);
    }
    
    final synchronized void b(pn var_pn) {
	o.a(var_pn, (byte) 23);
    }
    
    final pn a() {
	return (pn) o.a((int) 122);
    }
    
    final synchronized int f() {
	return o.b((int) -121);
    }
    
    public ch() {
	/* empty */
    }
}
