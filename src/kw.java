/* kw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kw extends cl
{
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int A;
    static boolean B = false;
    static int[] C = new int[1];
    private boolean D = false;
    
    final boolean a(int i) {
	if (i != -16777216)
	    B = false;
	A++;
	return true;
    }
    
    final void d(int i) {
	x++;
	if (!D)
	    ((cl) this).l.a(0, mca.l, -18836);
	else {
	    ((cl) this).l.e(i + 19092, 1);
	    ((cl) this).l.a(aaa.s, -6);
	    ((cl) this).l.a(Class_rf.e, true, Class_rf.e);
	    ((cl) this).l.a(2, 1, ik.o);
	    ((cl) this).l.a(0, mca.l, -18836);
	    ((cl) this).l.j((byte) -70);
	    ((cl) this).l.a((hfa) null, i + 19092);
	    ((cl) this).l.e(i ^ ~0x4a93, 0);
	    D = false;
	}
	if (i != -19092)
	    a((int) 61);
	((cl) this).l.a(Class_rf.e, true, Class_rf.e);
    }
    
    final void a(int i, boolean bool) {
	y++;
	int i_0_ = -9 % ((52 - i) / 36);
	oq var_oq = ((cl) this).l.R(2);
	if (var_oq != null && bool) {
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.a(var_oq, 0);
	    ((cl) this).l.a(Class_kb.p, -43);
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.a(wi.e, true, ku.k);
	    ((cl) this).l.a(false, bu.u, 2, true, (byte) -54);
	    ((cl) this).l.a(0, eda.h, -18836);
	    mga var_mga = ((cl) this).l.E(96);
	    var_mga.a((int) 0, ((cl) this).l.Z(-9813));
	    ((cl) this).l.a(119, ck.J);
	    ((cl) this).l.e(0, 0);
	    D = true;
	} else
	    ((cl) this).l.a(0, eda.h, -18836);
    }
    
    final void a(boolean bool, boolean bool_1_) {
	z++;
	((cl) this).l.a(Class_rf.e, bool, ku.k);
    }
    
    public static void f(int i) {
	if (i != 6)
	    C = null;
	C = null;
    }
    
    final void a(int i, int i_2_, byte i_3_) {
	if (i_3_ != 65)
	    v = -118;
	t++;
    }
    
    final void a(int i, int i_4_, hfa var_hfa) {
	((cl) this).l.a(var_hfa, 0);
	if (i_4_ < 47)
	    a(-40, 113, (byte) 6);
	w++;
	((cl) this).l.f(i, 0);
    }
    
    static final void a(int i, int i_5_) {
	LoginStream.l((byte) 127);
	u++;
	int i_6_ = ((hga) fj.t.a(i_5_, true)).d;
	if (i != i_6_) {
	    int i_7_ = ((dj) cp.e).k[i_5_];
	    if (i_6_ == 5)
		ik.r = i_7_;
	    if (i_6_ == 6)
		jb.D = i_7_;
	}
    }
    
    kw(en var_en) {
	super(var_en);
    }
}
