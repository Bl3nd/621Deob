/* Class_kf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_kf extends ft
{
    static int y;
    static int z;
    static int A;
    static int B;
    static int C;
    static int D;
    lf E;
    static int F;
    int G;
    static int H;
    static int I = 0;
    static int J;
    byte[] K;
    static int L;
    static int M;
    static int O;
    static int P;
    
    final byte[] d(byte i) {
	if (i < 104)
	    ((Class_kf) this).E = null;
	O++;
	if (((ft) this).x)
	    throw new RuntimeException();
	return ((Class_kf) this).K;
    }
    
    final int b(byte i) {
	if (i != -69)
	    ((Class_kf) this).E = null;
	J++;
	if (((ft) this).x)
	    return 0;
	return 100;
    }
    
    static final void a(byte i, byte[] is) {
	if (i >= -95)
	    F = -5;
	L++;
	BytesParser var_es = new BytesParser(is);
	for (;;) {
	    int i_0_ = var_es.readUnsignedByte(-9268);
	    if (i_0_ == 0)
		break;
	    if (i_0_ != 1) {
		if (i_0_ != 4) {
		    if (i_0_ == 5) {
			int i_1_ = var_es.readUnsignedByte(-9268);
			vn.P = new int[i_1_];
			for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
			    vn.P[i_2_] = var_es.readShort(13111);
			    if (vn.P[i_2_] == 65535)
				vn.P[i_2_] = -1;
			}
		    }
		} else {
		    int i_3_ = var_es.readUnsignedByte(-9268);
		    il.m = new int[i_3_];
		    for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
			il.m[i_4_] = var_es.readShort(13111);
			if (il.m[i_4_] == 65535)
			    il.m[i_4_] = -1;
		    }
		}
	    } else {
		int[] is_5_ = tn.i = new int[6];
		is_5_[0] = var_es.readShort(13111);
		is_5_[1] = var_es.readShort(13111);
		is_5_[2] = var_es.readShort(13111);
		is_5_[3] = var_es.readShort(13111);
		is_5_[4] = var_es.readShort(13111);
		is_5_[5] = var_es.readShort(13111);
	    }
	}
    }
    
    static final void a(int i) {
	if (pm.F < 1024.0F)
	    pm.F = 1024.0F;
	z++;
	if (pm.F > 3072.0F)
	    pm.F = 3072.0F;
	for (/**/; qw.n >= 16384.0F; qw.n -= 16384.0F) {
	    /* empty */
	}
	for (/**/; qw.n < 0.0F; qw.n += 16384.0F) {
	    /* empty */
	}
	int i_6_ = vaa.L >> 9;
	int i_7_ = Class_k.N >> 9;
	int i_8_ = Class_u.b(vaa.L, vo.clientHeight, -20214, Class_k.N);
	int i_9_ = 0;
	if (i_6_ > 3 && i_7_ > 3 && i_6_ < Class_hc.e - 4 && i_7_ < bw.v - 4) {
	    for (int i_10_ = i_6_ - 4; i_10_ <= i_6_ + 4; i_10_++) {
		for (int i_11_ = i_7_ - 4; i_7_ + 4 >= i_11_; i_11_++) {
		    int i_12_ = vo.clientHeight;
		    if (i_12_ < 3 && ItemDef.b(i_11_, i_10_, 5706))
			i_12_++;
		    int i_13_ = 0;
		    if (((cd) gba.E).w != null
			&& ((cd) gba.E).w[i_12_] != null)
			i_13_
			    = (((cd) gba.E).w[i_12_][i_10_][i_11_] & 0xff) * 8;
		    if (Class_q.b != null && Class_q.b[i_12_] != null) {
			int i_14_
			    = (i_13_
			       - Class_q.b[i_12_].a(i_11_, (byte) 51, i_10_)
			       + i_8_);
			if (i_9_ < i_14_)
			    i_9_ = i_14_;
		    }
		}
	    }
	}
	if (i != 5126)
	    F = -37;
	int i_15_ = (i_9_ >> 2) * 1536;
	if (i_15_ > 786432)
	    i_15_ = 786432;
	if (i_15_ < 262144)
	    i_15_ = 262144;
	if (dk.y >= i_15_) {
	    if (dk.y > i_15_)
		dk.y += (i_15_ - dk.y) / 80;
	} else
	    dk.y += (i_15_ - dk.y) / 24;
    }
    
    static final int a(Class_gb var_gb, byte i) {
	B++;
	if (mca.l != var_gb) {
	    if (eda.h == var_gb)
		return 34167;
	    if (var_gb != bu.u) {
		if (ik.o == var_gb)
		    return 34166;
	    } else
		return 34168;
	} else
	    return 5890;
	if (i < 6)
	    y = 2;
	throw new IllegalArgumentException();
    }
    
    static final boolean a(byte i, int i_16_, int i_17_) {
	if (i != 71)
	    a((int) -123, -63, -54);
	H++;
	if ((i_17_ & 0x8000) == 0)
	    return false;
	return true;
    }
    
    static final int a(bt var_bt, int i) {
	A++;
	if (bt.a == var_bt)
	    return 5120;
	if (bt.d == var_bt)
	    return 5122;
	if (bt.f != var_bt) {
	    if (var_bt == bt.g)
		return 5121;
	    if (bt.h == var_bt)
		return 5123;
	    if (var_bt != bt.i) {
		if (var_bt == bt.j)
		    return 5131;
		if (bt.k == var_bt)
		    return 5126;
	    } else
		return 5125;
	} else
	    return 5124;
	if (i < 8)
	    a((bt) null, -12);
	throw new IllegalArgumentException("");
    }
    
    public Class_kf() {
	/* empty */
    }
    
    static final int a(int i, int i_18_, int i_19_) {
	M++;
	if (i_18_ < 48)
	    return 33;
	int i_20_ = i >>> 31;
	return (i_20_ + i) / i_19_ - i_20_;
    }
    
    static final void a(Interface var_kp, boolean bool, boolean bool_21_) {
	if (bool != false)
	    y = -21;
	C++;
	int i = ((Interface) var_kp).maxHScroll != 0 ? ((Interface) var_kp).maxHScroll : ((Interface) var_kp).minHScroll;
	int i_22_ = ((Interface) var_kp).maxVScroll != 0 ? ((Interface) var_kp).maxVScroll : ((Interface) var_kp).minVScroll;
	sca.a(i_22_, i, aa.o[((Interface) var_kp).interfaceID >> 16], ((Interface) var_kp).interfaceID,
	      bool_21_, -115);
	if (((Interface) var_kp).children != null)
	    sca.a(i_22_, i, ((Interface) var_kp).children, ((Interface) var_kp).interfaceID, bool_21_, -116);
	tt var_tt = (tt) ida.l.a(-32748, (long) ((Interface) var_kp).interfaceID);
	if (var_tt != null)
	    Class_mb.a(4, i, bool_21_, ((tt) var_tt).l, i_22_);
    }
}
