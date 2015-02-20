/* dv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dv
{
    static fh a = new fh(1, 3);
    static int b;
    static int c;
    static boolean d = false;
    static int x;
    
    public static void a(byte i) {
	if (i > 82)
	    a = null;
    }
    
    static final void a(int i) {
	if (i <= -106) {
	    b++;
	    synchronized (bd.j) {
		bd.j.a(18385);
	    }
	    synchronized (Class_ad.k) {
		Class_ad.k.a(18385);
	    }
	}
    }
    
    static final void a(Class_r class_r, long l, int i) {
	ig.e = daa.cb;
	lt.a = 0;
	c++;
	vm.k = 0;
	if (i != 27063)
	    a = null;
	daa.cb = 0;
	long l_0_ = us.a(i ^ 0x69d5);
	for (tq var_tq = (tq) tfa.w.b((byte) 109); var_tq != null;
	     var_tq = (tq) tfa.w.a((byte) -106)) {
	    if (var_tq.a(class_r, l))
		lt.a++;
	}
	if (mj.n && l % 100L == 0L) {
	    System.out.println("Particle system count: " + tfa.w.d(0)
			       + ", running: " + lt.a);
	    System.out.println("Emitters: " + vm.k + " Particles: " + daa.cb
			       + ". Time taken: " + (us.a(100) - l_0_) + "ms");
	}
    }
}
