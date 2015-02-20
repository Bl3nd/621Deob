/* baa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class baa
{
    static int a;
    static int b;
    static int c;
    static int d = 765;
    static int e;
    int f;
    int g;
    static int h;
    int i;
    int j;
    static int k;
    static int[] l;
    static int m;
    
    static final void a(int i) {
	c++;
	if (ji.j == null)
	    ji.j = new int[65536];
	else
	    return;
	double d = Math.random() * 0.03 - 0.015 + 0.7;
	int i_0_ = 0;
	if (i <= 46)
	    a((byte) 78, -86);
	for (/**/; i_0_ < 65536; i_0_++) {
	    double d_1_ = (double) ((0xfc39 & i_0_) >> 10) / 64.0 + 0.0078125;
	    double d_2_ = (double) (0x7 & i_0_ >> 7) / 8.0 + 0.0625;
	    double d_3_ = (double) (i_0_ & 0x7f) / 128.0;
	    double d_4_ = d_3_;
	    double d_5_ = d_3_;
	    double d_6_ = d_3_;
	    if (d_2_ != 0.0) {
		double d_7_;
		if (!(d_3_ < 0.5))
		    d_7_ = d_3_ + d_2_ - d_2_ * d_3_;
		else
		    d_7_ = (d_2_ + 1.0) * d_3_;
		double d_8_ = 2.0 * d_3_ - d_7_;
		double d_9_ = d_1_ + 0.3333333333333333;
		if (d_9_ > 1.0)
		    d_9_--;
		double d_10_ = d_1_;
		double d_11_ = d_1_ - 0.3333333333333333;
		if (d_11_ < 0.0)
		    d_11_++;
		if (d_9_ * 6.0 < 1.0)
		    d_4_ = d_8_ + d_9_ * (6.0 * (d_7_ - d_8_));
		else if (d_9_ * 2.0 < 1.0)
		    d_4_ = d_7_;
		else if (3.0 * d_9_ < 2.0)
		    d_4_ = d_8_ + ((0.6666666666666666 - d_9_) * (d_7_ - d_8_)
				   * 6.0);
		else
		    d_4_ = d_8_;
		if (!(6.0 * d_10_ < 1.0)) {
		    if (!(2.0 * d_10_ < 1.0)) {
			if (3.0 * d_10_ < 2.0)
			    d_5_ = 6.0 * ((-d_10_ + 0.6666666666666666)
					  * (d_7_ - d_8_)) + d_8_;
			else
			    d_5_ = d_8_;
		    } else
			d_5_ = d_7_;
		} else
		    d_5_ = d_8_ + (d_7_ - d_8_) * 6.0 * d_10_;
		if (!(6.0 * d_11_ < 1.0)) {
		    if (!(2.0 * d_11_ < 1.0)) {
			if (d_11_ * 3.0 < 2.0)
			    d_6_ = (d_7_ - d_8_) * (0.6666666666666666
						    - d_11_) * 6.0 + d_8_;
			else
			    d_6_ = d_8_;
		    } else
			d_6_ = d_7_;
		} else
		    d_6_ = d_8_ + d_11_ * ((d_7_ - d_8_) * 6.0);
	    }
	    d_4_ = Math.pow(d_4_, d);
	    d_5_ = Math.pow(d_5_, d);
	    d_6_ = Math.pow(d_6_, d);
	    int i_12_ = (int) (d_4_ * 256.0);
	    int i_13_ = (int) (256.0 * d_5_);
	    int i_14_ = (int) (d_6_ * 256.0);
	    int i_15_ = i_14_ + ((i_12_ << 16) + (i_13_ << 8));
	    ji.j[i_0_] = i_15_;
	}
    }
    
    static final void a(byte i, int i_16_) {
	e++;
	qba var_qba = ofa.a(16, i_16_, (byte) 113);
	if (i != 74)
	    d = -35;
	var_qba.i(i ^ 0x4a);
    }
    
    public final String toString() {
	a++;
	throw new IllegalStateException();
    }
    
    static final void a(Interactable var_fga, Interactable var_fga_17_, int i) {
	b++;
	if (((Interactable) var_fga).interactable_ != null)
	    var_fga.b(2);
	int i_18_ = 57 % ((i - 33) / 43);
	((Interactable) var_fga).interactable = var_fga_17_;
	((Interactable) var_fga).interactable_ = ((Interactable) var_fga_17_).interactable_;
	((Interactable) ((Interactable) var_fga).interactable_).interactable = var_fga;
	((Interactable) ((Interactable) var_fga).interactable).interactable_ = var_fga;
    }
    
    static final String a(byte i, boolean bool, int i_19_) {
	h++;
	if (i != 78)
	    return null;
	if (!bool || i_19_ < 0)
	    return Integer.toString(i_19_);
	return ns.a(10, bool, false, i_19_);
    }
    
    public static void a(byte i) {
	if (i < 110)
	    a((Interactable) null, null, -109);
	l = null;
    }
    
    static final boolean a(int i, int i_20_, int i_21_) {
	int i_22_ = -74 / ((i_20_ - 34) / 63);
	m++;
	if (!((i & 0x800) != 0 | Class_kf.a((byte) 71, i_21_, i))
	    && !jv.a(3, i, i_21_))
	    return false;
	return true;
    }
    
    baa(int i, int i_23_, int i_24_, int i_25_) {
	((baa) this).f = i_24_;
	((baa) this).j = i;
	((baa) this).i = i_23_;
	((baa) this).g = i_25_;
    }
}
