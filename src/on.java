/* on - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class on
{
    int a;
    int b;
    static fa c;
    int d;
    int e;
    int f;
    static pl g;
    int h = -1;
    int i;
    static int j = 0;
    static int performance = -1;
    static int l;
    static int m;
    int n;
    static float o;
    int p;
    static int q;
    
    public static void a(byte i) {
	c = null;
	g = null;
	if (i != -107)
	    a(-101, 117, -35, -89, 117, null, -128, null, (byte) 95);
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			byte[] is, int i_4_, byte[] is_5_, byte i_6_) {
	m++;
	int i_7_ = -(i >> 2);
	i = -(i & 0x3);
	int i_8_ = -i_0_;
	if (i_6_ != -113)
	    a(-24, null, 32);
	for (/**/; i_8_ < 0; i_8_++) {
	    for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
		is_5_[i_3_++] -= is[i_1_++];
		is_5_[i_3_++] -= is[i_1_++];
		is_5_[i_3_++] -= is[i_1_++];
		is_5_[i_3_++] -= is[i_1_++];
	    }
	    for (int i_10_ = i; i_10_ < 0; i_10_++)
		is_5_[i_3_++] -= is[i_1_++];
	    i_1_ += i_4_;
	    i_3_ += i_2_;
	}
    }
    
    static final void a(int i, Interface[] var_kps, int i_11_) {
	q++;
	int i_12_ = -92 / ((14 - i) / 47);
	for (int i_13_ = 0; var_kps.length > i_13_; i_13_++) {
	    Interface var_kp = var_kps[i_13_];
	    if (var_kp != null && ((Interface) var_kp).parentID == i_11_
		&& !client.isHidden(var_kp)) {
		if (((Interface) var_kp).type == 0) {
		    a(119, var_kps, ((Interface) var_kp).interfaceID);
		    if (((Interface) var_kp).children != null)
			a(77, ((Interface) var_kp).children, ((Interface) var_kp).interfaceID);
		    tt var_tt = (tt) ida.l.a(-32748, (long) ((Interface) var_kp).interfaceID);
		    if (var_tt != null)
			nj.a(-126, ((tt) var_tt).l);
		}
		if (((Interface) var_kp).type == 6 && ((Interface) var_kp).V != -1) {
		    dr var_dr = Class_ef.J.c(64, ((Interface) var_kp).V);
		    if (var_dr != null) {
			((Interface) var_kp).R += nq.x;
			int i_14_ = ((Interface) var_kp).s;
			while (((Interface) var_kp).R
			       > ((dr) var_dr).B[((Interface) var_kp).s]) {
			    ((Interface) var_kp).R
				-= ((dr) var_dr).B[((Interface) var_kp).s];
			    ((Interface) var_kp).s++;
			    if (((Interface) var_kp).s >= ((dr) var_dr).p.length) {
				((Interface) var_kp).s -= ((dr) var_dr).y;
				if (((Interface) var_kp).s < 0
				    || (((Interface) var_kp).s
					>= ((dr) var_dr).p.length))
				    ((Interface) var_kp).s = 0;
			    }
			    ((Interface) var_kp).rc = ((Interface) var_kp).s + 1;
			    if (((dr) var_dr).p.length <= ((Interface) var_kp).rc) {
				((Interface) var_kp).rc -= ((dr) var_dr).y;
				if (((Interface) var_kp).rc < 0
				    || (((dr) var_dr).p.length
					<= ((Interface) var_kp).rc))
				    ((Interface) var_kp).rc = -1;
			    }
			    tn.a(var_kp, 1023);
			}
			if (i_14_ != ((Interface) var_kp).s)
			    cea.a(var_dr, (byte) -102, ((Interface) var_kp).s);
		    }
		}
	    }
	}
    }
    
    public on() {
	/* empty */
    }
}
