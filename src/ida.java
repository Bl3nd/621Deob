/* ida - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ida
{
    qda a;
    static GameInPacket incomingPacket18 = new GameInPacket(18, 4);
    static int c;
    ida d;
    static int e;
    static int f;
    static int g;
    static int[] h = { 104, 120, 136, 168 };
    static sw[] i;
    static int j;
    static int k;
    static il l = new il(8);
    static int m;
    static int[] n = new int[32];
    
    static final void a(int i, int i_0_, int i_1_, boolean bool, int i_2_,
			int i_3_) {
	j++;
	int i_4_ = i - i_1_;
	int i_5_ = i_0_ - i_3_;
	if (i_5_ != 0) {
	    if (i_4_ == 0) {
		ng.a(i_1_, i_0_, (byte) -80, i_2_, i_3_);
		return;
	    }
	} else {
	    if (i_4_ != 0)
		mm.a(i_2_, i, (byte) 125, i_3_, i_1_);
	    return;
	}
	if (i_4_ < 0)
	    i_4_ = -i_4_;
	if (i_5_ < 0)
	    i_5_ = -i_5_;
	boolean bool_6_ = i_4_ > i_5_;
	if (bool_6_) {
	    int i_7_ = i_3_;
	    i_3_ = i_1_;
	    int i_8_ = i_0_;
	    i_1_ = i_7_;
	    i_0_ = i;
	    i = i_8_;
	}
	if (i_3_ > i_0_) {
	    int i_9_ = i_3_;
	    int i_10_ = i_1_;
	    i_3_ = i_0_;
	    i_1_ = i;
	    i_0_ = i_9_;
	    i = i_10_;
	}
	int i_11_ = i_1_;
	int i_12_ = i_0_ - i_3_;
	int i_13_ = i - i_1_;
	int i_14_ = -(i_12_ >> 1);
	if (i_13_ < 0)
	    i_13_ = -i_13_;
	int i_15_ = i_1_ < i ? 1 : -1;
	if (bool_6_) {
	    for (int i_16_ = i_3_; i_16_ <= i_0_; i_16_++) {
		wh.O[i_16_][i_11_] = i_2_;
		i_14_ += i_13_;
		if (i_14_ > 0) {
		    i_14_ -= i_12_;
		    i_11_ += i_15_;
		}
	    }
	} else {
	    for (int i_17_ = i_3_; i_0_ >= i_17_; i_17_++) {
		wh.O[i_11_][i_17_] = i_2_;
		i_14_ += i_13_;
		if (i_14_ > 0) {
		    i_14_ -= i_12_;
		    i_11_ += i_15_;
		}
	    }
	}
	if (bool != false)
	    incomingPacket18 = null;
    }
    
    public static void a(boolean bool) {
	h = null;
	l = null;
	n = null;
	incomingPacket18 = null;
	if (bool != false)
	    incomingPacket18 = null;
	i = null;
    }
    
    static final void b(boolean bool) {
	if (bool != false)
	    i = null;
	g++;
	lm.Kh.pa(uf.g, !((jb) cs.g).p ? -1 : qda.D + 256 << 2, 0);
    }
    
    static final void a(byte i, int i_18_) {
	e++;
	int i_19_ = 7 / ((i - 39) / 45);
	qba var_qba = ofa.a(1, i_18_, (byte) -127);
	var_qba.i(0);
    }
    
    final void a(int i) {
	c++;
	if (i < (Class_k.P ^ 0xffffffff)) {
	    ((ida) this).a = null;
	    ((ida) this).d = pfa.d;
	    Class_k.P++;
	    pfa.d = this;
	}
    }
    
    static final Interface a(int i, int i_20_, byte i_21_) {
	f++;
	Interface var_kp = efa.a(-1018745488, i);
	if ((i_20_ ^ 0xffffffff) == 0)
	    return var_kp;
	if (var_kp == null || ((Interface) var_kp).children == null
	    || i_20_ >= ((Interface) var_kp).children.length)
	    return null;
	if (i_21_ < 36)
	    return null;
	return ((Interface) var_kp).children[i_20_];
    }
}
