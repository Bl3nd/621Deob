/* Class_rf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_rf
{
    static int a;
    static int b;
    static int c;
    static int d;
    static nw e;
    static boolean fromBilling = false;
    String g;
    int h;
    
    static final void a(int i) {
	b++;
	if (daa.ab != null)
	    daa.ab.b(-32470);
	if (pt.g != null)
	    pt.g.b(-32470);
	int i_0_ = -7 % ((i - 43) / 35);
    }
    
    static final void a(int i, bfa var_bfa) {
	a++;
	if (i == -30036 && !gea.n) {
	    var_bfa.unlink(-72);
	    mu.j--;
	}
    }
    
    static final void a(boolean bool, Class_r class_r, boolean bool_1_,
			sa var_sa, la var_la, String string) {
	if (bool != true)
	    a(true, null, true, null, null, null);
	c++;
	boolean bool_2_ = !ia.w || jr.c(3171);
	if (bool_2_) {
	    if (!ia.w || !bool_2_) {
		int i = var_sa.a(string, null, 250, -107);
		int i_3_ = 13 * var_sa.a(250, string, null, -128);
		int i_4_ = 4;
		int i_5_ = i_4_ + 6;
		int i_6_ = 6 + i_4_;
		class_r.J(i_5_ - i_4_, i_6_ - i_4_, i_4_ + (i + i_4_),
			  i_4_ + i_3_ + i_4_, -16777216, 0);
		class_r.c(i_5_ - i_4_, i_6_ - i_4_, i + i_4_ + i_4_,
			  i_3_ + i_4_ + i_4_, -1, 0);
		var_la.a(-1, 0, null, i, string, -1, 1, -65, 1, i_3_, null,
			 null, 0, 0, i_6_, i_5_);
		caa.a(i + i_4_ + i_4_, i_6_ - i_4_, i_4_ + (i_4_ + i_3_),
		      (byte) 31, i_5_ - i_4_);
	    } else {
		var_sa = LoginStream.sa;
		var_la = class_r.a(var_sa, uk.c, true);
		int i = var_sa.a(string, null, 250, -118);
		int i_7_
		    = var_sa.a(250, ((sa) var_sa).k, string, (byte) -92, null);
		int i_8_ = ((aga) bq.j).b;
		int i_9_ = i_8_ + 4;
		i_7_ += 2 * i_9_;
		i += 2 * i_9_;
		if (i < GrandExchangeItem.l)
		    i = GrandExchangeItem.l;
		if (gd.b > i_7_)
		    i_7_ = gd.b;
		int i_10_ = gf.e.a(baa.d, i, 2) + lf.o;
		int i_11_ = at.rc.a(Class_vb.r, i_7_, -123) + tea.p;
		class_r.a(hq.f, false).DA(((aga) taa.g).b + i_10_,
					  i_11_ + ((aga) taa.g).d,
					  i - 2 * ((aga) taa.g).b,
					  i_7_ - ((aga) taa.g).d * 2, 1, 0, 0);
		class_r.a(taa.g, true).a(i_10_, i_11_);
		taa.g.a();
		class_r.a(taa.g, true).a(i_10_ + i - i_8_, i_11_);
		taa.g.g();
		class_r.a(taa.g, true).a(i_10_ + i - i_8_,
					 i_7_ + (i_11_ - i_8_));
		taa.g.a();
		class_r.a(taa.g, true).a(i_10_, i_7_ - i_8_ + i_11_);
		taa.g.g();
		class_r.a(bq.j, true).b(i_10_, ((aga) taa.g).d + i_11_, i_8_,
					i_7_ - 2 * ((aga) taa.g).d);
		bq.j.e();
		class_r.a(bq.j, true).b(i_10_ + ((aga) taa.g).b, i_11_,
					i - 2 * ((aga) taa.g).b, i_8_);
		bq.j.e();
		class_r.a(bq.j, true).b(i + (i_10_ - i_8_),
					i_11_ + ((aga) taa.g).d, i_8_,
					i_7_ - 2 * ((aga) taa.g).d);
		bq.j.e();
		class_r.a(bq.j, true).b(i_10_ + ((aga) taa.g).b,
					i_11_ - i_8_ + i_7_,
					i - 2 * ((aga) taa.g).b, i_8_);
		bq.j.e();
		var_la.a(-1, 0, null, i - i_9_ * 2, string, ~0xffffff | qfa.e,
			 1, -36, 1, i_7_ - i_9_ * 2, null, null, 0, 0,
			 i_11_ + i_9_, i_9_ + i_10_);
		caa.a(i, i_11_, i_7_, (byte) 31, i_10_);
	    }
	    do {
		if (bool_1_) {
		    try {
			class_r.u();
		    } catch (uo var_uo) {
			break;
		    }
		    break;
		}
	    } while (false);
	}
    }
    
    public static void a(byte i) {
	e = null;
	if (i != 127)
	    a(false, null, true, null, null, null);
    }
    
    public final String toString() {
	d++;
	throw new IllegalStateException();
    }
    
    Class_rf(String string, int i) {
	((Class_rf) this).h = i;
	((Class_rf) this).g = string;
    }
    
    static {
	e = new nw();
    }
}
