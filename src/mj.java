/* mj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mj extends Class_pb
{
    static int[] j;
    static int k;
    static or l;
    private int m;
    static boolean n = false;
    private int o;
    static int p;
    static int q;
    private int r;
    static int s;
    static int t;
    static String u = null;
    private int v;
    
    final void a(int i, int i_0_, int i_1_) {
	if (i_0_ == -21716) {
	    t++;
	    int i_2_ = i * o >> 12;
	    int i_3_ = v * i >> 12;
	    int i_4_ = i_1_ * m >> 12;
	    int i_5_ = i_1_ * r >> 12;
	    gga.a(((Class_pb) this).f, i_5_, i_4_, i_2_, i_0_ ^ ~0x61e3, i_3_);
	}
    }
    
    mj(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
	super(i_9_, i_10_, i_11_);
	o = i;
	r = i_8_;
	m = i_6_;
	v = i_7_;
    }
    
    final void a(int i, byte i_12_, int i_13_) {
	p++;
	int i_14_ = i * o >> 12;
	int i_15_ = i * v >> 12;
	if (i_12_ != -34)
	    a(-121, (byte) -103, 78);
	int i_16_ = m * i_13_ >> 12;
	int i_17_ = r * i_13_ >> 12;
	kl.a(i_14_, i_15_, ((Class_pb) this).f, i_16_, i_17_, false,
	     ((Class_pb) this).c, ((Class_pb) this).g);
    }
    
    final void b(int i, int i_18_, int i_19_) {
	q++;
	int i_20_ = o * i_18_ >> 12;
	int i_21_ = v * i_18_ >> 12;
	int i_22_ = m * i >> 12;
	if (i_19_ != 4)
	    l = null;
	int i_23_ = i * r >> 12;
	nf.a(i_21_, i_22_, ((Class_pb) this).c, i_23_, 376,
	     ((Class_pb) this).g, i_20_);
    }
    
    static final int a(int i, byte i_24_, int i_25_, int i_26_, int i_27_) {
	s++;
	int i_28_ = i & 0xf;
	if (i_24_ != 116)
	    a(5, (byte) 36, 17, 88, 17);
	int i_29_ = i_28_ < 8 ? i_27_ : i_25_;
	int i_30_
	    = i_28_ >= 4 ? i_28_ == 12 || i_28_ == 14 ? i_27_ : i_26_ : i_25_;
	return (((0x1 & i_28_) == 0 ? i_29_ : -i_29_)
		+ ((0x2 & i_28_) == 0 ? i_30_ : -i_30_));
    }
    
    public static void a(int i) {
	u = null;
	if (i == -9) {
	    l = null;
	    j = null;
	}
    }
}
