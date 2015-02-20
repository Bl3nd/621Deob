/* nw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nw
{
    static lda a;
    static int[][] b = new int[6][];
    static boolean c = false;
    static int d;
    
    public static void a(int i) {
	if (i > -48)
	    a((int) -115);
	b = null;
	a = null;
    }
    
    static final void a(Animable var_lo, gga[] var_ggas) {
	if (ih.m) {
	    int i = var_lo.a(var_ggas, 83);
	    nda.k.a(i, var_ggas);
	}
	if (wr.D == Class_q.b) {
	    boolean bool = false;
	    boolean bool_0_ = false;
	    int i;
	    int i_1_;
	    if (var_lo instanceof qda) {
		i = ((qda) (qda) var_lo).B;
		i_1_ = ((qda) (qda) var_lo).x;
	    } else {
		i = ((Animable) var_lo).locX >> Class_fb.a;
		i_1_ = ((Animable) var_lo).locY >> Class_fb.a;
	    }
	    nda.k.YA(vr.b[0].a(((Animable) var_lo).locY, ((Animable) var_lo).locX, true),
		     Class_e.a(i, i_1_), Class_lc.b(i, i_1_), oi.a(i, i_1_));
	}
	og var_og = var_lo.a(false, nda.k);
	if (var_og != null) {
	    ((og) var_og).j = var_lo;
	    if (kw.B) {
		synchronized (oea.fb) {
		    boolean bool = false;
		    for (og var_og_2_ = (og) oea.fb.b((byte) 109);
			 var_og_2_ != null;
			 var_og_2_ = (og) oea.fb.a((byte) -106)) {
			if (((Animable) var_lo).g >= ((Animable) ((og) var_og_2_).j).g) {
			    baa.a(var_og, var_og_2_, -109);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			oea.fb.a(var_og, 86);
		}
	    } else {
		boolean bool = false;
		for (og var_og_3_ = (og) oea.fb.b((byte) 76);
		     var_og_3_ != null;
		     var_og_3_ = (og) oea.fb.a((byte) -106)) {
		    if (((Animable) var_lo).g >= ((Animable) ((og) var_og_3_).j).g) {
			baa.a(var_og, var_og_3_, -93);
			bool = true;
			break;
		    }
		}
		if (!bool)
		    oea.fb.a(var_og, 43);
	    }
	}
    }
    
    static final void a(byte i) {
	d++;
	int i_4_ = 0;
	for (int i_5_ = 0; Class_hc.e > i_5_; i_5_++) {
	    for (int i_6_ = 0; bw.v > i_6_; i_6_++) {
		if (Class_rb.a(true, i_4_, i_6_, (byte) 74, i_5_, ol.p))
		    i_4_++;
		if (i_4_ >= 512)
		    return;
	    }
	}
	if (i > -41)
	    b = null;
    }
    
    public nw() {
	/* empty */
    }
}
