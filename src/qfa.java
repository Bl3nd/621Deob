/* qfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qfa implements fv
{
    static f[] a;
    static int b;
    static int c;
    static int[] d
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    static int e;
    int f;
    
    public static void a(byte i) {
	if (i >= 65) {
	    d = null;
	    a = null;
	}
    }
    
    static final void a(int i, Class_mc class_mc, int i_0_) {
	b++;
	if (i_0_ > -119)
	    a(119, null, -50);
	if (hv.t) {
	    i = 0;
	    hv.t = false;
	}
	if (uj.x == null || !uj.x.a(100, class_mc)) {
	    uj.x = class_mc;
	    pr.D = us.a(105);
	    ur.g = mv.a = i;
	    if (ur.g == 0)
		tfa.a(true);
	    else {
		GameText.vb = dr.e;
		ej.i = qda.D;
		Class_hc.f = ei.d;
		ii.c = uf.g;
		dd.J = dm.a;
		rq.M = LoginStream.Qb;
		qd.x = bq.k;
		Class_ab.c = hq.b;
		mda.H = kw.v;
		bj.b = dh.e;
	    }
	}
    }
    
    public final String toString() {
	c++;
	throw new IllegalStateException();
    }
    
    qfa(String string, int i) {
	((qfa) this).f = i;
    }
}
