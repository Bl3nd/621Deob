/* kv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kv implements sn
{
    static int a;
    static int b;
    static int[] c = new int[32];
    static int d;
    private pl e;
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_) {
	b++;
	int i_7_ = sl.a(i_6_, 4095, Class_md.h, Class_db.o);
	int i_8_ = sl.a(i_0_, 4095, Class_md.h, Class_db.o);
	int i_9_ = sl.a(i_4_, i_1_ - 24348, vaa.xb, jga.v);
	int i_10_ = sl.a(i_2_, 4095, vaa.xb, jga.v);
	int i_11_ = sl.a(i_6_ + i_3_, 4095, Class_md.h, Class_db.o);
	int i_12_ = sl.a(i_0_ - i_3_, 4095, Class_md.h, Class_db.o);
	for (int i_13_ = i_7_; i_11_ > i_13_; i_13_++)
	    kg.a(i_9_, wh.O[i_13_], i_5_, i_10_, -127);
	for (int i_14_ = i_8_; i_14_ > i_12_; i_14_--)
	    kg.a(i_9_, wh.O[i_14_], i_5_, i_10_, -121);
	int i_15_ = sl.a(i_3_ + i_4_, 4095, vaa.xb, jga.v);
	if (i_1_ == 28443) {
	    int i_16_ = sl.a(i_2_ - i_3_, 4095, vaa.xb, jga.v);
	    for (int i_17_ = i_11_; i_17_ <= i_12_; i_17_++) {
		int[] is = wh.O[i_17_];
		kg.a(i_9_, is, i_5_, i_15_, i_1_ ^ ~0x6f76);
		kg.a(i_15_, is, i, i_16_, -123);
		kg.a(i_16_, is, i_5_, i_10_, 95);
	    }
	}
    }
    
    static final void a(int i, int i_18_, int i_19_) {
	vf var_vf = ol.p[i][i_18_][i_19_];
	if (var_vf != null) {
	    rba.a(((vf) var_vf).d);
	    rba.a(((vf) var_vf).p);
	    if (((vf) var_vf).d != null)
		((vf) var_vf).d = null;
	    if (((vf) var_vf).p != null)
		((vf) var_vf).p = null;
	}
    }
    
    public static void b(int i) {
	c = null;
	if (i != 9179)
	    b(68);
    }
    
    public final tj a(byte i) {
	d++;
	if (i != -58)
	    e = null;
	return tj.tj3;
    }
    
    public final int a(int i) {
	int i_20_ = 116 / ((-55 - i) / 49);
	a++;
	if (e.c(28528))
	    return 100;
	return e.a(false);
    }
    
    kv(pl var_pl) {
	e = var_pl;
    }
}
