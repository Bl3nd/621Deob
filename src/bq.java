/* bq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bq
{
    sa a = null;
    static int b;
    static baa c = new baa(6, 0, 4, 2);
    static int d;
    static la e;
    static int f;
    la g = null;
    static int h;
    static int i;
    static aga j;
    static float k;
    
    static final void a(int i, boolean bool, int i_0_) {
	d++;
	Class_mc class_mc = Class_qb.i[i][i_0_];
	if (class_mc != null) {
	    hp.C = ((Class_mc) class_mc).a;
	    Class_i.l = ((Class_mc) class_mc).j;
	    bl.k = ((Class_mc) class_mc).g;
	}
	at.f((byte) -38);
	if (bool != false)
	    j = null;
    }
    
    static final void a(int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
	b++;
	if (i_4_ != 41)
	    h = -48;
	if (i_2_ != 8 && i_2_ != 16) {
	    vf var_vf = ol.p[i_3_][i_1_][i];
	    if (var_vf != null) {
		if (i_2_ == 1)
		    ((vf) var_vf).o = (short) 0;
		else if (i_2_ == 2)
		    ((vf) var_vf).n = (short) 0;
	    }
	    Class_i.a(i_4_ - 39);
	} else {
	    for (int i_5_ = 0; i_5_ < sr.R; i_5_++) {
		hv var_hv = Class_mb.Y[i_5_];
		if ((((hv) var_hv).h == i_2_ && i_1_ == ((hv) var_hv).j
		     && ((hv) var_hv).b == i)
		    || i_1_ == ((hv) var_hv).o && i == ((hv) var_hv).b) {
		    if (i_5_ != sr.R)
			co.a(Class_mb.Y, i_5_ + 1, Class_mb.Y, i_5_,
			     Class_mb.Y.length - i_5_ - 1);
		    sr.R--;
		    break;
		}
	    }
	}
    }
    
    static final void a(int i, int i_6_) {
	f++;
	qba var_qba = ofa.a(8, i, (byte) -15);
	var_qba.i(0);
	if (i_6_ != -23477)
	    k = -0.10097351F;
    }
    
    static final void a(byte i) {
	bq.i++;
	pi.a(2, ((jb) cs.g).s, 22050, 47);
	Connection.dt = new dt();
	Connection.dt.b(9, 128, 18959);
	daa.ab = Class_nb.a(12869, nda.signlink, 22050, ru.canvas, 0);
	if (i > -76)
	    a(-32, -104, 9, 2, (byte) 90);
	daa.ab.a(Connection.dt, (byte) 88);
	kba.a(Connection.dt, sr.S, ii.b, jt.e, -92);
	pt.g = Class_nb.a(12869, nda.signlink, 2048, ru.canvas, 1);
	ej.r = new ch();
	pt.g.a(ej.r, (byte) 88);
	kfa.o = new ui(22050, gba.G);
	cga.E = mq.a.a("scape main", (int) -62);
    }
    
    public static void a(int i) {
	e = null;
	j = null;
	if (i == -12420)
	    c = null;
    }
    
    bq(la var_la) {
	((bq) this).g = var_la;
    }
    
    bq(la var_la, sa var_sa) {
	((bq) this).g = var_la;
	((bq) this).a = var_sa;
    }
}
