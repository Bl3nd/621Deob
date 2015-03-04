/* vt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vt
{
    hw a;
    static int b;
    static boolean c;
    go d;
    static int e;
    byte f;
    int g;
    int h;
    static String[] i = { "en", "de", "fr", "pt", "nl" };
    static int j;
    int k;
    int l;
    static int m;
    oaa n;
    int o;
    uea p;
    static int q;
    static int r;
    
    static final ida a(byte i, qda var_qda) {
	q++;
	ida var_ida;
	if (pfa.d != null) {
	    var_ida = pfa.d;
	    pfa.d = ((ida) pfa.d).d;
	    Class_k.P--;
	    ((ida) var_ida).d = null;
	} else
	    var_ida = new ida();
	((ida) var_ida).a = var_qda;
	if (i < 33)
	    c = true;
	return var_ida;
    }
    
    final boolean a(int i) {
	if (i != 1)
	    ((vt) this).n = null;
	m++;
	if (((vt) this).f != 2 && ((vt) this).f != 3)
	    return false;
	return true;
    }
    
    static final void a(boolean bool, Entity var_ni, byte i) {
	b++;
	cg var_cg = var_ni.k(32195);
	if (((Entity) var_ni).Nc == 0) {
	    ej.s = 0;
	    pg.f = -1;
	    ((Entity) var_ni).Fc = 0;
	} else {
	    if ((((Entity) var_ni).yb ^ 0xffffffff) != 0
		&& ((Entity) var_ni).oc == 0) {
		dr var_dr = Class_ef.J.c(i ^ 0xe, ((Entity) var_ni).yb);
		if (((Entity) var_ni).Kc > 0 && ((dr) var_dr).i == 0) {
		    ej.s = 0;
		    ((Entity) var_ni).Fc++;
		    pg.f = -1;
		    return;
		}
		if (((Entity) var_ni).Kc <= 0 && ((dr) var_dr).k == 0) {
		    pg.f = -1;
		    ((Entity) var_ni).Fc++;
		    ej.s = 0;
		    return;
		}
	    }
	    if ((((Entity) var_ni).graphicsId_ ^ 0xffffffff) != 0
		&& ((Entity) var_ni).Fb <= pm.currentTimedTicks) {
		iv var_iv = Class_ic.H.a((byte) 12, ((Entity) var_ni).graphicsId_);
		if (((iv) var_iv).d && ((iv) var_iv).w != -1) {
		    dr var_dr = Class_ef.J.c(64, ((iv) var_iv).w);
		    if (((Entity) var_ni).Kc > 0 && ((dr) var_dr).i == 0) {
			ej.s = 0;
			pg.f = -1;
			((Entity) var_ni).Fc++;
			return;
		    }
		    if (((Entity) var_ni).Kc <= 0 && ((dr) var_dr).k == 0) {
			((Entity) var_ni).Fc++;
			pg.f = -1;
			ej.s = 0;
			return;
		    }
		}
	    }
	    if (((Entity) var_ni).graphicsId_ != -1 && pm.currentTimedTicks >= ((Entity) var_ni).Fb) {
		iv var_iv = Class_ic.H.a((byte) 12, ((Entity) var_ni).graphicsId_);
		if (((iv) var_iv).d && (((iv) var_iv).w ^ 0xffffffff) != 0) {
		    dr var_dr = Class_ef.J.c(i - 14, ((iv) var_iv).w);
		    if (((Entity) var_ni).Kc > 0 && ((dr) var_dr).i == 0) {
			ej.s = 0;
			((Entity) var_ni).Fc++;
			pg.f = -1;
			return;
		    }
		    if (((Entity) var_ni).Kc <= 0 && ((dr) var_dr).k == 0) {
			pg.f = -1;
			ej.s = 0;
			((Entity) var_ni).Fc++;
			return;
		    }
		}
	    }
	    int i_0_ = ((Animable) var_ni).locX;
	    int i_1_ = ((Animable) var_ni).locY;
	    int i_2_ = (512 * ((Entity) var_ni).regionLocalX[((Entity) var_ni).Nc - 1]
			+ 256 * var_ni.getNPCDefinition(i ^ ~0x4e));
	    int i_3_ = (512 * ((Entity) var_ni).regionLocalY[((Entity) var_ni).Nc - 1]
			+ 256 * var_ni.getNPCDefinition(i - 79));
	    if (i_0_ >= i_2_) {
		if (i_2_ < i_0_) {
		    if (i_3_ <= i_1_) {
			if (i_1_ > i_3_)
			    var_ni.a(false, 2048);
			else
			    var_ni.a(false, 4096);
		    } else
			var_ni.a(false, 6144);
		} else if (i_1_ < i_3_)
		    var_ni.a(false, 8192);
		else if (i_3_ < i_1_)
		    var_ni.a(false, 0);
	    } else if (i_1_ >= i_3_) {
		if (i_1_ > i_3_)
		    var_ni.a(false, 14336);
		else
		    var_ni.a(false, 12288);
	    } else
		var_ni.a(false, 10240);
	    byte i_4_ = ((Entity) var_ni).moveTypes[((Entity) var_ni).Nc - 1];
	    if (!bool && (i_2_ - i_0_ > 1024 || i_2_ - i_0_ < -1024
			  || i_3_ - i_1_ > 1024 || i_3_ - i_1_ < -1024)) {
		((Animable) var_ni).locY = i_3_;
		((Animable) var_ni).locX = i_2_;
		var_ni.a(((Entity) var_ni).Gb, 1003, false);
		if (((Entity) var_ni).Kc > 0)
		    ((Entity) var_ni).Kc--;
		ej.s = 0;
		pg.f = -1;
		((Entity) var_ni).Nc--;
	    } else {
		int i_5_ = 16;
		if (i == 78) {
		    boolean bool_6_ = true;
		    if (var_ni instanceof NPC)
			bool_6_ = ((NPCDef) ((NPC) (NPC) var_ni).npcDef).fb;
		    if (bool_6_) {
			int i_7_ = (((Entity) var_ni).Gb
				    - ((Class_kd) ((Entity) var_ni).class_kd).i);
			if (i_7_ != 0 && ((Entity) var_ni).faceEntityID == -1
			    && ((Entity) var_ni).Zb != 0)
			    i_5_ = 8;
			if (!bool && ((Entity) var_ni).Nc > 2)
			    i_5_ = 24;
			if (!bool && ((Entity) var_ni).Nc > 3)
			    i_5_ = 32;
		    } else {
			if (!bool && ((Entity) var_ni).Nc > 1)
			    i_5_ = 24;
			if (!bool && ((Entity) var_ni).Nc > 2)
			    i_5_ = 32;
		    }
		    if (((Entity) var_ni).Fc > 0 && ((Entity) var_ni).Nc > 1) {
			((Entity) var_ni).Fc--;
			i_5_ = 32;
		    }
		    if (i_4_ != 2) {
			if (i_4_ == 0)
			    i_5_ >>= 1;
		    } else
			i_5_ <<= 1;
		    ej.s = 0;
		    if (((cg) var_cg).b != -1) {
			i_5_ <<= 9;
			if (((Entity) var_ni).Nc != 1) {
			    if (i_5_ <= ((Entity) var_ni).Gc) {
				if (((Entity) var_ni).Gc > 0) {
				    ((Entity) var_ni).Gc -= ((cg) var_cg).b;
				    if (((Entity) var_ni).Gc < 0)
					((Entity) var_ni).Gc = 0;
				}
			    } else {
				((Entity) var_ni).Gc += ((cg) var_cg).b;
				if (i_5_ < ((Entity) var_ni).Gc)
				    ((Entity) var_ni).Gc = i_5_;
			    }
			} else {
			    int i_8_ = ((Entity) var_ni).Gc * ((Entity) var_ni).Gc;
			    int i_9_ = ((((Animable) var_ni).locX <= i_2_
					 ? i_2_ - ((Animable) var_ni).locX
					 : ((Animable) var_ni).locX - i_2_)
					<< 9);
			    int i_10_ = ((((Animable) var_ni).locY <= i_3_
					  ? i_3_ - ((Animable) var_ni).locY
					  : ((Animable) var_ni).locY - i_3_)
					 << 9);
			    int i_11_ = i_9_ > i_10_ ? i_9_ : i_10_;
			    int i_12_ = ((cg) var_cg).b * (2 * i_11_);
			    if (i_8_ <= i_12_) {
				if (i_11_ < i_8_ / 2) {
				    ((Entity) var_ni).Gc -= ((cg) var_cg).b;
				    if (((Entity) var_ni).Gc < 0)
					((Entity) var_ni).Gc = 0;
				} else if (((Entity) var_ni).Gc < i_5_) {
				    ((Entity) var_ni).Gc += ((cg) var_cg).b;
				    if (((Entity) var_ni).Gc > i_5_)
					((Entity) var_ni).Gc = i_5_;
				}
			    } else
				((Entity) var_ni).Gc /= 2;
			}
			i_5_ = ((Entity) var_ni).Gc >> 9;
			if (i_5_ < 1)
			    i_5_ = 1;
		    }
		    if (i_2_ == i_0_ && i_3_ == i_1_)
			pg.f = -1;
		    else {
			if (i_0_ >= i_2_) {
			    if (i_0_ > i_2_) {
				ej.s |= 0x8;
				((Animable) var_ni).locX -= i_5_;
				if (((Animable) var_ni).locX < i_2_)
				    ((Animable) var_ni).locX = i_2_;
			    }
			} else {
			    ((Animable) var_ni).locX += i_5_;
			    ej.s |= 0x4;
			    if (((Animable) var_ni).locX > i_2_)
				((Animable) var_ni).locX = i_2_;
			}
			if (i_3_ > i_1_) {
			    ((Animable) var_ni).locY += i_5_;
			    ej.s |= 0x1;
			    if (((Animable) var_ni).locY > i_3_)
				((Animable) var_ni).locY = i_3_;
			} else if (i_1_ > i_3_) {
			    ej.s |= 0x2;
			    ((Animable) var_ni).locY -= i_5_;
			    if (i_3_ > ((Animable) var_ni).locY)
				((Animable) var_ni).locY = i_3_;
			}
			if (i_5_ < 32)
			    pg.f = i_4_;
			else
			    pg.f = 2;
		    }
		    if (((Animable) var_ni).locX == i_2_ && ((Animable) var_ni).locY == i_3_) {
			if (((Entity) var_ni).Kc > 0)
			    ((Entity) var_ni).Kc--;
			((Entity) var_ni).Nc--;
		    }
		}
	    }
	}
    }
    
    public static void a(boolean bool) {
	if (bool == false)
	    i = null;
    }
    
    static final void b(int i) {
	if (i == -1) {
	    ok.C = true;
	    j++;
	}
    }
    
    static final void a(Entity var_ni, byte i) {
	do {
	    if (((Entity) var_ni).Bc != -1) {
		dr var_dr = Class_ef.J.c(64, ((Entity) var_ni).Bc);
		if (var_dr == null || ((dr) var_dr).p == null) {
		    ((Entity) var_ni).Bc = -1;
		    ((Entity) var_ni).V = false;
		} else {
		    ((Entity) var_ni).rc++;
		    if (((Entity) var_ni).Ib < ((dr) var_dr).p.length
			&& (((Entity) var_ni).rc
			    > ((dr) var_dr).B[((Entity) var_ni).Ib])) {
			((Entity) var_ni).Ib++;
			((Entity) var_ni).hc++;
			((Entity) var_ni).rc = 1;
			qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
			      ((Animable) var_ni).locY, 91, ((Entity) var_ni).Ib,
			      var_ni == up.thisPlayer);
		    }
		    if (((Entity) var_ni).Ib >= ((dr) var_dr).p.length) {
			((Entity) var_ni).Ib = 0;
			((Entity) var_ni).rc = 0;
			if (((Entity) var_ni).V) {
			    ((Entity) var_ni).Bc = var_ni.k(32195).b(1);
			    if (((Entity) var_ni).Bc == -1) {
				((Entity) var_ni).V = false;
				break;
			    }
			    var_dr = Class_ef.J.c(64, ((Entity) var_ni).Bc);
			}
			qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
			      ((Animable) var_ni).locY, 96, ((Entity) var_ni).Ib,
			      var_ni == up.thisPlayer);
		    }
		    ((Entity) var_ni).hc = ((Entity) var_ni).Ib + 1;
		    if (((dr) var_dr).p.length <= ((Entity) var_ni).hc)
			((Entity) var_ni).hc = 0;
		}
	    }
	} while (false);
	r++;
	do {
	    if ((((Entity) var_ni).graphicsId_ ^ 0xffffffff) != 0
		&& pm.currentTimedTicks >= ((Entity) var_ni).Fb) {
		iv var_iv = Class_ic.H.a((byte) 12, ((Entity) var_ni).graphicsId_);
		int i_13_ = ((iv) var_iv).w;
		if (i_13_ == -1)
		    ((Entity) var_ni).graphicsId_ = -1;
		else {
		    dr var_dr = Class_ef.J.c(64, i_13_);
		    if (((iv) var_iv).d) {
			if (((dr) var_dr).i != 3) {
			    if (((dr) var_dr).i == 1 && ((Entity) var_ni).Kc > 0
				&& ((Entity) var_ni).xc <= pm.currentTimedTicks
				&& ((Entity) var_ni).ab < pm.currentTimedTicks) {
				((Entity) var_ni).Fb = pm.currentTimedTicks + 1;
				break;
			    }
			} else if (((Entity) var_ni).Kc > 0
				   && pm.currentTimedTicks >= ((Entity) var_ni).xc
				   && pm.currentTimedTicks > ((Entity) var_ni).ab) {
			    ((Entity) var_ni).graphicsId_ = -1;
			    break;
			}
		    }
		    if (var_dr != null && ((dr) var_dr).p != null) {
			if (((Entity) var_ni).kc < 0) {
			    ((Entity) var_ni).kc = 0;
			    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				  ((Animable) var_ni).locY, 76, 0, var_ni == up.thisPlayer);
			}
			((Entity) var_ni).qb++;
			if (((Entity) var_ni).kc < ((dr) var_dr).p.length
			    && (((Entity) var_ni).qb
				> ((dr) var_dr).B[((Entity) var_ni).kc])) {
			    ((Entity) var_ni).kc++;
			    ((Entity) var_ni).qb = 1;
			    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				  ((Animable) var_ni).locY, 64, ((Entity) var_ni).kc,
				  up.thisPlayer == var_ni);
			}
			if (((dr) var_dr).p.length <= ((Entity) var_ni).kc) {
			    if (!((iv) var_iv).d)
				((Entity) var_ni).graphicsId_ = -1;
			    else {
				((Entity) var_ni).kc -= ((dr) var_dr).y;
				((Entity) var_ni).Sb++;
				if (((dr) var_dr).b > ((Entity) var_ni).Sb) {
				    if (((Entity) var_ni).kc < 0
					|| (((dr) var_dr).p.length
					    <= ((Entity) var_ni).kc))
					((Entity) var_ni).graphicsId_ = -1;
				    else
					qga.a(((Animable) var_ni).height, var_dr,
					      ((Animable) var_ni).locX, ((Animable) var_ni).locY,
					      95, ((Entity) var_ni).kc,
					      var_ni == up.thisPlayer);
				} else
				    ((Entity) var_ni).graphicsId_ = -1;
			    }
			}
			((Entity) var_ni).Ob = ((Entity) var_ni).kc + 1;
			if (((dr) var_dr).p.length <= ((Entity) var_ni).Ob) {
			    if (((iv) var_iv).d) {
				((Entity) var_ni).Ob -= ((dr) var_dr).y;
				if (((Entity) var_ni).Sb + 1 < ((dr) var_dr).b) {
				    if (((Entity) var_ni).Ob < 0
					|| (((Entity) var_ni).Ob
					    >= ((dr) var_dr).p.length))
					((Entity) var_ni).Ob = -1;
				} else
				    ((Entity) var_ni).Ob = -1;
			    } else
				((Entity) var_ni).Ob = -1;
			}
		    } else
			((Entity) var_ni).graphicsId_ = -1;
		}
	    }
	} while (false);
	if (i < 61)
	    c = false;
	do {
	    if (((Entity) var_ni).graphicsId != -1 && ((Entity) var_ni).S <= pm.currentTimedTicks) {
		iv var_iv = Class_ic.H.a((byte) 12, ((Entity) var_ni).graphicsId);
		int i_14_ = ((iv) var_iv).w;
		if (i_14_ != -1) {
		    dr var_dr = Class_ef.J.c(64, i_14_);
		    if (((iv) var_iv).d) {
			if (((dr) var_dr).i == 3) {
			    if (((Entity) var_ni).Kc > 0
				&& ((Entity) var_ni).xc <= pm.currentTimedTicks
				&& pm.currentTimedTicks > ((Entity) var_ni).ab) {
				((Entity) var_ni).graphicsId = -1;
				break;
			    }
			} else if (((dr) var_dr).i == 1 && ((Entity) var_ni).Kc > 0
				   && pm.currentTimedTicks >= ((Entity) var_ni).xc
				   && ((Entity) var_ni).ab < pm.currentTimedTicks) {
			    ((Entity) var_ni).S = pm.currentTimedTicks + 1;
			    break;
			}
		    }
		    if (var_dr == null || ((dr) var_dr).p == null)
			((Entity) var_ni).graphicsId = -1;
		    else {
			if (((Entity) var_ni).mb < 0) {
			    ((Entity) var_ni).mb = 0;
			    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				  ((Animable) var_ni).locY, 87, 0, var_ni == up.thisPlayer);
			}
			((Entity) var_ni).pc++;
			if (((Entity) var_ni).mb < ((dr) var_dr).p.length
			    && (((Entity) var_ni).pc
				> ((dr) var_dr).B[((Entity) var_ni).mb])) {
			    ((Entity) var_ni).pc = 1;
			    ((Entity) var_ni).mb++;
			    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				  ((Animable) var_ni).locY, 105, ((Entity) var_ni).mb,
				  var_ni == up.thisPlayer);
			}
			if (((Entity) var_ni).mb >= ((dr) var_dr).p.length) {
			    if (!((iv) var_iv).d)
				((Entity) var_ni).graphicsId = -1;
			    else {
				((Entity) var_ni).mb -= ((dr) var_dr).y;
				((Entity) var_ni).Jb++;
				if (((dr) var_dr).b > ((Entity) var_ni).Jb) {
				    if (((Entity) var_ni).mb >= 0
					&& (((dr) var_dr).p.length
					    > ((Entity) var_ni).mb))
					qga.a(((Animable) var_ni).height, var_dr,
					      ((Animable) var_ni).locX, ((Animable) var_ni).locY,
					      89, ((Entity) var_ni).mb,
					      var_ni == up.thisPlayer);
				    else
					((Entity) var_ni).graphicsId = -1;
				} else
				    ((Entity) var_ni).graphicsId = -1;
			    }
			}
			((Entity) var_ni).P = ((Entity) var_ni).mb + 1;
			if (((Entity) var_ni).P >= ((dr) var_dr).p.length) {
			    if (!((iv) var_iv).d)
				((Entity) var_ni).P = -1;
			    else {
				((Entity) var_ni).P -= ((dr) var_dr).y;
				if (((dr) var_dr).b <= ((Entity) var_ni).Jb + 1)
				    ((Entity) var_ni).P = -1;
				else if (((Entity) var_ni).P < 0
					 || (((dr) var_dr).p.length
					     <= ((Entity) var_ni).P))
				    ((Entity) var_ni).P = -1;
			    }
			}
		    }
		} else
		    ((Entity) var_ni).graphicsId = -1;
	    }
	} while (false);
	if (((Entity) var_ni).yb != -1 && ((Entity) var_ni).oc <= 1) {
	    dr var_dr = Class_ef.J.c(64, ((Entity) var_ni).yb);
	    if (((dr) var_dr).i == 3) {
		if (((Entity) var_ni).Kc > 0 && ((Entity) var_ni).xc <= pm.currentTimedTicks
		    && pm.currentTimedTicks > ((Entity) var_ni).ab) {
		    ((Entity) var_ni).yb = -1;
		    ((Entity) var_ni).Ab = null;
		}
	    } else if (((dr) var_dr).i == 1 && ((Entity) var_ni).Kc > 0
		       && pm.currentTimedTicks >= ((Entity) var_ni).xc && pm.currentTimedTicks > ((Entity) var_ni).ab)
		((Entity) var_ni).oc = 2;
	}
	if (((Entity) var_ni).yb != -1 && ((Entity) var_ni).oc == 0) {
	    dr var_dr = Class_ef.J.c(64, ((Entity) var_ni).yb);
	    if (var_dr == null || ((dr) var_dr).p == null) {
		((Entity) var_ni).Ab = null;
		((Entity) var_ni).yb = -1;
	    } else {
		((Entity) var_ni).ic++;
		if (((dr) var_dr).p.length > ((Entity) var_ni).yc
		    && ((dr) var_dr).B[((Entity) var_ni).yc] < ((Entity) var_ni).ic) {
		    ((Entity) var_ni).ic = 1;
		    ((Entity) var_ni).yc++;
		    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
			  ((Animable) var_ni).locY, 127, ((Entity) var_ni).yc,
			  up.thisPlayer == var_ni);
		}
		if (((dr) var_dr).p.length <= ((Entity) var_ni).yc) {
		    ((Entity) var_ni).Hb++;
		    ((Entity) var_ni).yc -= ((dr) var_dr).y;
		    if (((dr) var_dr).b > ((Entity) var_ni).Hb) {
			if (((Entity) var_ni).yc < 0
			    || ((Entity) var_ni).yc >= ((dr) var_dr).p.length) {
			    ((Entity) var_ni).yb = -1;
			    ((Entity) var_ni).Ab = null;
			} else
			    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				  ((Animable) var_ni).locY, 97, ((Entity) var_ni).yc,
				  var_ni == up.thisPlayer);
		    } else {
			((Entity) var_ni).yb = -1;
			((Entity) var_ni).Ab = null;
		    }
		}
		((Entity) var_ni).W = ((Entity) var_ni).yc + 1;
		if (((dr) var_dr).p.length <= ((Entity) var_ni).W) {
		    ((Entity) var_ni).W -= ((dr) var_dr).y;
		    if (((dr) var_dr).b > ((Entity) var_ni).Hb + 1) {
			if (((Entity) var_ni).W < 0
			    || ((dr) var_dr).p.length <= ((Entity) var_ni).W)
			    ((Entity) var_ni).W = -1;
		    } else
			((Entity) var_ni).W = -1;
		}
	    }
	}
	if (((Entity) var_ni).oc > 0)
	    ((Entity) var_ni).oc--;
	for (int i_15_ = 0; i_15_ < ((Entity) var_ni).ans.length; i_15_++) {
	    an var_an = ((Entity) var_ni).ans[i_15_];
	    if (var_an != null) {
		if (((an) var_an).a > 0)
		    ((an) var_an).a--;
		else {
		    dr var_dr = Class_ef.J.c(64, ((an) var_an).c);
		    if (var_dr == null || ((dr) var_dr).p == null)
			((Entity) var_ni).ans[i_15_] = null;
		    else {
			((an) var_an).b++;
			if (((an) var_an).d < ((dr) var_dr).p.length
			    && (((dr) var_dr).B[((an) var_an).d]
				< ((an) var_an).b)) {
			    ((an) var_an).d++;
			    ((an) var_an).b = 1;
			    qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				  ((Animable) var_ni).locY, 99, ((an) var_an).d,
				  var_ni == up.thisPlayer);
			}
			if (((dr) var_dr).p.length <= ((an) var_an).d) {
			    ((an) var_an).d -= ((dr) var_dr).y;
			    ((an) var_an).e++;
			    if (((dr) var_dr).b <= ((an) var_an).e)
				((Entity) var_ni).ans[i_15_] = null;
			    else if (((an) var_an).d >= 0
				     && (((an) var_an).d
					 < ((dr) var_dr).p.length))
				qga.a(((Animable) var_ni).height, var_dr, ((Animable) var_ni).locX,
				      ((Animable) var_ni).locY, 83, ((an) var_an).d,
				      up.thisPlayer == var_ni);
			    else
				((Entity) var_ni).ans[i_15_] = null;
			}
			((an) var_an).g = ((an) var_an).d + 1;
			if (((dr) var_dr).p.length <= ((an) var_an).g) {
			    ((an) var_an).g -= ((dr) var_dr).y;
			    if (((dr) var_dr).b > ((an) var_an).e + 1) {
				if (((an) var_an).g < 0
				    || (((dr) var_dr).p.length
					<= ((an) var_an).g))
				    ((an) var_an).g = -1;
			    } else
				((an) var_an).g = -1;
			}
		    }
		}
	    }
	}
    }
    
    vt(byte i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
	((vt) this).l = i_16_;
	((vt) this).g = i_20_;
	((vt) this).h = i_17_;
	((vt) this).k = i_18_;
	((vt) this).o = i_19_;
	((vt) this).f = i;
    }
}
