/* qda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class qda extends Animable
{
    boolean w;
    short x;
    short y;
    static int z = 0;
    static int A;
    short B;
    static int C;
    static int D;
    static int E;
    static int F;
    static int G = -1;
    static int H;
    short I;
    byte J;
    
    final boolean f(int i) {
	F++;
	if (i != 4095)
	    h((int) 19);
	for (int i_0_ = ((qda) this).B; ((qda) this).I >= i_0_; i_0_++) {
	    for (int i_1_ = ((qda) this).x; i_1_ <= ((qda) this).y; i_1_++) {
		int i_2_ = FileOnDisk.k + (i_0_ - n.e);
		if (i_2_ >= 0 && i_2_ < vd.O.length) {
		    int i_3_ = FileOnDisk.k + i_1_ - fm.i;
		    if (i_3_ >= 0 && i_3_ < vd.O.length && vd.O[i_2_][i_3_])
			return true;
		}
	    }
	}
	return false;
    }
    
    final boolean f(byte i) {
	if (i < 111)
	    ((qda) this).I = (short) 75;
	A++;
	return vg.a((byte) 57, this.g((int) -103), ((qda) this).x,
		    ((qda) this).I, ((Animable) this).h, ((qda) this).y,
		    ((qda) this).B);
    }
    
    final int a(gga[] var_ggas, int i) {
	H++;
	int i_4_ = -66 % ((i + 87) / 32);
	int i_5_ = 0;
    while_156_:
	for (int i_6_ = ((qda) this).B; ((qda) this).I >= i_6_; i_6_++) {
	    for (int i_7_ = ((qda) this).x; i_7_ <= ((qda) this).y; i_7_++) {
		long l = tba.n[((Animable) this).height][i_6_][i_7_];
		long l_8_ = 0L;
	    while_155_:
		while (l_8_ <= 48L) {
		    int i_9_ = (int) (l >>> (int) l_8_ & 0xffffL);
		    if (i_9_ <= 0)
			break;
		    qd var_qd = Class_j.l[i_9_ - 1];
		    for (int i_10_ = 0; i_10_ < i_5_; i_10_++) {
			if (var_ggas[i_10_] == ((qd) var_qd).m) {
			    l_8_ += 16L;
			    continue while_155_;
			}
		    }
		    var_ggas[i_5_++] = ((qd) var_qd).m;
		    if (i_5_ == 4)
			break while_156_;
		    l_8_ += 16L;
		}
	    }
	}
	for (int i_11_ = i_5_; i_11_ < 4; i_11_++)
	    var_ggas[i_11_] = null;
	if (((qda) this).J != 0) {
	    int i_12_ = ((qda) this).B - n.e;
	    int i_13_ = ((qda) this).x - fm.i;
	    short i_14_;
	    int i_15_;
	    short i_16_;
	    int i_17_;
	    if (((qda) this).J != 1) {
		if (i_13_ <= -i_12_) {
		    i_15_ = ((qda) this).B + 1;
		    i_14_ = ((qda) this).x;
		    i_16_ = ((qda) this).B;
		    i_17_ = ((qda) this).x + 1;
		} else {
		    i_17_ = ((qda) this).x - 1;
		    i_15_ = ((qda) this).B - 1;
		    i_16_ = ((qda) this).B;
		    i_14_ = ((qda) this).x;
		}
	    } else if (i_13_ <= i_12_) {
		i_14_ = ((qda) this).x;
		i_15_ = ((qda) this).B - 1;
		i_16_ = ((qda) this).B;
		i_17_ = ((qda) this).x + 1;
	    } else {
		i_15_ = ((qda) this).B + 1;
		i_17_ = ((qda) this).x - 1;
		i_16_ = ((qda) this).B;
		i_14_ = ((qda) this).x;
	    }
	    int i_18_ = 0;
	while_158_:
	    for (/**/; i_18_ < i_5_; i_18_++) {
		long l = tba.n[((Animable) this).height][i_16_][i_17_];
		while (l != 0L) {
		    qd var_qd = Class_j.l[(int) ((l & 0xffffL) - 1L)];
		    l >>>= 16;
		    if (((qd) var_qd).m == var_ggas[i_18_])
			continue while_158_;
		}
		l = tba.n[((Animable) this).height][i_15_][i_14_];
		while (l != 0L) {
		    qd var_qd = Class_j.l[(int) ((0xffffL & l) - 1L)];
		    l >>>= 16;
		    if (((qd) var_qd).m == var_ggas[i_18_])
			continue while_158_;
		}
		for (int i_19_ = i_18_; i_19_ < i_5_ - 1; i_19_++)
		    var_ggas[i_19_] = var_ggas[i_19_ + 1];
		i_5_--;
	    }
	}
	return i_5_;
    }
    
    void h(int i) {
	C++;
	if (i != 0)
	    h((int) 30);
    }
    
    qda(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_,
	int i_25_, int i_26_, int i_27_, boolean bool, byte i_28_) {
	((qda) this).J = i_28_;
	((qda) this).w = bool;
	((Animable) this).locX = i_21_;
	((qda) this).I = (short) i_25_;
	((Animable) this).height = (byte) i;
	((qda) this).B = (short) i_24_;
	((qda) this).x = (short) i_26_;
	((Animable) this).j = i_22_;
	((Animable) this).h = (byte) i_20_;
	((qda) this).y = (short) i_27_;
	((Animable) this).locY = i_23_;
    }
    
    static final boolean a(byte i, int i_29_, int i_30_) {
	E++;
	if (i != -110)
	    z = -110;
	if (i_29_ == 11)
	    i_29_ = 10;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 104, i_30_);
	if (i_29_ >= 5 && i_29_ <= 8)
	    i_29_ = 4;
	return var_bda.a(78, i_29_);
    }
}
