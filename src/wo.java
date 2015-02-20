/* wo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wo
{
    static int a;
    static int b;
    static int c;
    
    static final void a(int i) {
	if (i != 1)
	    a(-7);
	for (int i_0_ = 0; tu.b.length > i_0_; i_0_++) {
	    for (int i_1_ = 0; i_1_ < tu.b[0].length; i_1_++) {
		for (int i_2_ = 0; i_2_ < tu.b[0][0].length; i_2_++)
		    tu.b[i_0_][i_1_][i_2_] = (byte) 0;
	    }
	}
	a++;
    }
    
    static final bq a(byte i, int i_3_, Class_r class_r, boolean bool) {
	c++;
	int i_4_ = -18 % ((59 - i) / 41);
	if ((i_3_ ^ 0xffffffff) == 0)
	    return null;
	if (th.j != null) {
	    for (int i_5_ = 0; i_5_ < th.j.length; i_5_++) {
		if (i_3_ == th.j[i_5_])
		    return ir.d[i_5_];
	    }
	}
	bq var_bq = (bq) pu.m.get((long) i_3_, (byte) 100);
	if (var_bq != null) {
	    if (bool && ((bq) var_bq).a == null) {
		sa var_sa = GameOutPacket.a(lm.vh, i_3_, (byte) 32);
		if (var_sa == null)
		    return null;
		((bq) var_bq).a = var_sa;
	    }
	    return var_bq;
	}
	aga[] var_agas = aga.a(GameText.wb, i_3_);
	if (var_agas == null)
	    return null;
	sa var_sa = GameOutPacket.a(lm.vh, i_3_, (byte) 32);
	if (var_sa == null)
	    return null;
	if (bool)
	    var_bq = new bq(class_r.a(var_sa, var_agas, true), var_sa);
	else
	    var_bq = new bq(class_r.a(var_sa, var_agas, true));
	pu.m.put((long) i_3_, var_bq, 1);
	return var_bq;
    }
    
    static final void b(int i) {
	if (Class_ub.W != null)
	    Class_ub.W.b(24551);
	b++;
	if (rh.o != null) {
	    for (;;) {
		try {
		    rh.o.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
	if (i == 21074) {
	    /* empty */
	}
    }
    
    static final void a(Animable var_lo, int i, int i_6_, int i_7_, int i_8_,
			int i_9_) {
	boolean bool = true;
	int i_10_ = i_6_;
	int i_11_ = i_6_ + i_8_;
	int i_12_ = i_7_ - 1;
	int i_13_ = i_7_ + i_9_;
	for (int i_14_ = i; i_14_ <= i + 1; i_14_++) {
	    if (i_14_ != dfa.G) {
		for (int i_15_ = i_10_; i_15_ <= i_11_; i_15_++) {
		    if (i_15_ >= 0 && i_15_ < sv.T) {
			for (int i_16_ = i_12_; i_16_ <= i_13_; i_16_++) {
			    if (i_16_ >= 0 && i_16_ < nf.H
				&& (!bool || i_15_ >= i_11_ || i_16_ >= i_13_
				    || i_16_ < i_7_ && i_15_ != i_6_)) {
				vf var_vf = ol.p[i_14_][i_15_][i_16_];
				if (var_vf != null) {
				    int i_17_
					= (((Class_q.b[i_14_]
						 .a(i_16_, (byte) 51, i_15_)
					     + Class_q.b[i_14_].a(i_16_,
								  (byte) 51,
								  i_15_ + 1)
					     + Class_q.b[i_14_].a(i_16_ + 1,
								  (byte) 51,
								  i_15_)
					     + Class_q.b[i_14_].a(i_16_ + 1,
								  (byte) 51,
								  i_15_ + 1))
					    / 4)
					   - (Class_q.b[i].a(i_7_, (byte) 51,
							     i_6_)
					      + Class_q.b[i].a(i_7_, (byte) 51,
							       i_6_ + 1)
					      + Class_q.b[i].a(i_7_ + 1,
							       (byte) 51, i_6_)
					      + Class_q.b[i].a(i_7_ + 1,
							       (byte) 51,
							       i_6_ + 1)) / 4);
				    ev var_ev = ((vf) var_vf).l;
				    ev var_ev_18_ = ((vf) var_vf).h;
				    if (var_ev != null && var_ev.h((byte) -90))
					var_lo.a(bool,
						 ((i_15_ - i_6_) * bea.o
						  + (1 - i_8_) * dba.k),
						 (byte) 47, nda.k, var_ev,
						 i_17_,
						 ((i_16_ - i_7_) * bea.o
						  + (1 - i_9_) * dba.k));
				    if (var_ev_18_ != null
					&& var_ev_18_.h((byte) -81))
					var_lo.a(bool,
						 ((i_15_ - i_6_) * bea.o
						  + (1 - i_8_) * dba.k),
						 (byte) -120, nda.k,
						 var_ev_18_, i_17_,
						 ((i_16_ - i_7_) * bea.o
						  + (1 - i_9_) * dba.k));
				    for (ida var_ida = ((vf) var_vf).f;
					 var_ida != null;
					 var_ida = ((ida) var_ida).d) {
					qda var_qda = ((ida) var_ida).a;
					if (var_qda != null
					    && var_qda.h((byte) -114)
					    && (i_15_ == ((qda) var_qda).B
						|| i_15_ == i_10_)
					    && (i_16_ == ((qda) var_qda).x
						|| i_16_ == i_12_)) {
					    int i_19_
						= (((qda) var_qda).I
						   - ((qda) var_qda).B + 1);
					    int i_20_
						= (((qda) var_qda).y
						   - ((qda) var_qda).x + 1);
					    var_lo.a(bool,
						     ((((qda) var_qda).B
						       - i_6_) * bea.o
						      + ((i_19_ - i_8_)
							 * dba.k)),
						     (byte) 59, nda.k, var_qda,
						     i_17_,
						     ((((qda) var_qda).x
						       - i_7_) * bea.o
						      + ((i_20_ - i_9_)
							 * dba.k)));
					}
				    }
				}
			    }
			}
		    }
		}
		i_10_--;
		bool = false;
	    }
	}
    }
}
