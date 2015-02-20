/* fg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fg
{
    static int[] a;
    static int b;
    static int c;
    static boolean d = false;
    static vf[][][] e;
    
    public static void a(int i) {
	e = null;
	a = null;
	if (i != -24012)
	    d = false;
    }
    
    static final int a(float f, float f_0_, byte i, float f_1_) {
	b++;
	if (i != 126)
	    a(-78);
	float f_2_ = !(f < 0.0F) ? f : -f;
	float f_3_ = !(f_0_ < 0.0F) ? f_0_ : -f_0_;
	float f_4_ = f_1_ < 0.0F ? -f_1_ : f_1_;
	if (f_3_ > f_2_ && f_4_ < f_3_) {
	    if (f_0_ > 0.0F)
		return 0;
	    return 1;
	}
	if (!(f_4_ > f_2_) || !(f_3_ < f_4_)) {
	    if (f > 0.0F)
		return 4;
	    return 5;
	}
	if (f_1_ > 0.0F)
	    return 2;
	return 3;
    }
    
    static final mca a(byte i, BytesParser var_es) {
	c++;
	var_es.readUnsignedByte(-9268);
	int i_5_ = var_es.readUnsignedByte(i ^ ~0x240d);
	if (i != 62)
	    a(107);
	mca var_mca = qe.a(i - 91, i_5_);
	((mca) var_mca).u = var_es.readUnsignedByte(-9268);
	int i_6_ = var_es.readUnsignedByte(-9268);
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
	    int i_8_ = var_es.readUnsignedByte(i ^ ~0x240d);
	    var_mca.a(1, var_es, i_8_);
	}
	var_mca.b((int) -8);
	return var_mca;
    }
}
