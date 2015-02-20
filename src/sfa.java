/* sfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sfa
{
    static f[] a;
    static int b;
    static int c = 1401;
    static int d;
    static int e;
    
    public static void a(int i) {
	if (i > -48)
	    a(75, 48, -92, 43, 101, (byte) 25, 92, 31, -78, -119);
	a = null;
    }
    
    public sfa() {
	/* empty */
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			byte i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
	if (i_4_ < -113) {
	    d++;
	    if (i_7_ == i_3_ && i_1_ == i && i_5_ == i_8_ && i_6_ == i_2_)
		ida.a(i_6_, i_8_, i, false, i_0_, i_3_);
	    else {
		int i_9_ = i_3_;
		int i_10_ = i;
		int i_11_ = i_3_ * 3;
		int i_12_ = 3 * i;
		int i_13_ = 3 * i_7_;
		int i_14_ = i_1_ * 3;
		int i_15_ = 3 * i_5_;
		int i_16_ = 3 * i_2_;
		int i_17_ = i_8_ - i_15_ - i_3_ + i_13_;
		int i_18_ = i_14_ - i_16_ + i_6_ - i;
		int i_19_ = i_15_ - i_13_ - i_13_ + i_11_;
		int i_20_ = i_16_ - i_14_ + (i_12_ - i_14_);
		int i_21_ = i_13_ - i_11_;
		int i_22_ = i_14_ - i_12_;
		for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
		    int i_24_ = i_23_ * i_23_ >> 12;
		    int i_25_ = i_23_ * i_24_ >> 12;
		    int i_26_ = i_17_ * i_25_;
		    int i_27_ = i_25_ * i_18_;
		    int i_28_ = i_24_ * i_19_;
		    int i_29_ = i_20_ * i_24_;
		    int i_30_ = i_21_ * i_23_;
		    int i_31_ = i_23_ * i_22_;
		    int i_32_ = (i_26_ - (-i_30_ - i_28_) >> 12) + i_3_;
		    int i_33_ = i + (i_31_ + i_27_ + i_29_ >> 12);
		    ida.a(i_33_, i_32_, i_10_, false, i_0_, i_9_);
		    i_10_ = i_33_;
		    i_9_ = i_32_;
		}
	    }
	}
    }
    
    public final String toString() {
	b++;
	throw new IllegalStateException();
    }
    
    final boolean b(int i) {
	if (i != 3)
	    return false;
	e++;
	return this == fr.t | qn.b == this;
    }
}
