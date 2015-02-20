/* vs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class vs extends lp
{
    static int r = 0;
    static int s;
    static int t;
    private f u;
    f v;
    static int w;
    private f x;
    static int y;
    static int z;
    static int[] A = new int[14];
    private f B;
    private f C;
    static int D;
    static int E;
    private f F;
    
    void a(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
	if (i_0_ != 85)
	    x = null;
	z++;
	((vs) this).v.b(i_1_, i_2_, i_3_, i);
    }
    
    public final void a(int i) {
	super.a(-115);
	t++;
	tm var_tm = (tm) ((lp) this).d;
	((vs) this).v = fq.a(((lp) this).e, 1024, ((tm) var_tm).u);
	F = fq.a(((lp) this).e, 1024, ((tm) var_tm).w);
	B = fq.a(((lp) this).e, 1024, ((tm) var_tm).q);
	C = fq.a(((lp) this).e, 1024, ((tm) var_tm).n);
	if (i > -41)
	    a(-21, 65, 39, 85, -53, -34, (byte) 37);
	x = fq.a(((lp) this).e, 1024, ((tm) var_tm).r);
	u = fq.a(((lp) this).e, 1024, ((tm) var_tm).z);
    }
    
    final void b(int i, int i_4_, boolean bool, int i_5_) {
	w++;
	int i_6_ = B.A() + i_5_;
	int i_7_ = ((iea) ((lp) this).d).i + i_5_ - C.A();
	int i_8_ = x.ca() + i_4_;
	int i_9_ = i_4_ + (((iea) ((lp) this).d).e - u.ca());
	int i_10_ = i_7_ - i_6_;
	int i_11_ = i_9_ - i_8_;
	int i_12_ = this.b((byte) -8) * i_10_ / 10000;
	int[] is = new int[4];
	lg.r.oa(is);
	lg.r.da(i_6_, i_8_, i_6_ + i_12_, i_9_);
	a(i_11_, (byte) 85, i_6_, i_8_, i_10_);
	lg.r.da(i_12_ + i_6_, i_8_, i_7_, i_9_);
	F.b(i_6_, i_8_, i_10_, i_11_);
	lg.r.da(is[0], is[1], is[i], is[3]);
    }
    
    static final void a(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			int i_17_, byte i_18_) {
	if (i_18_ == 20) {
	    for (rm var_rm = (rm) gs.v.b((byte) 113); var_rm != null;
		 var_rm = (rm) gs.v.a((byte) -106)) {
		if (((rm) var_rm).h <= pm.currentTimedTicks)
		    var_rm.b(2);
		else {
		    iaa.a((((rm) var_rm).var_n << 9) + 256, i_14_ >> 1, i_15_,
			  (((rm) var_rm).i << 9) + 256, i_17_, (byte) 46,
			  i_13_ >> 1, ((rm) var_rm).l * 2, ((rm) var_rm).m);
		    pv.j.a(~0xffffff | ((rm) var_rm).k, i_18_ ^ ~0x99,
			   i_16_ + lt.h[0], 0, i + lt.h[1], ((rm) var_rm).p);
		}
	    }
	    y++;
	}
    }
    
    vs(pl var_pl, pl var_pl_19_, tm var_tm) {
	super(var_pl, var_pl_19_, (iea) var_tm);
    }
    
    public final boolean a(byte i) {
	E++;
	if (!super.a(i))
	    return false;
	tm var_tm = (tm) ((lp) this).d;
	if (!((lp) this).e.g(1912, ((tm) var_tm).u))
	    return false;
	if (!((lp) this).e.g(1912, ((tm) var_tm).w))
	    return false;
	if (!((lp) this).e.g(i ^ 0x72a, ((tm) var_tm).q))
	    return false;
	if (!((lp) this).e.g(1912, ((tm) var_tm).n))
	    return false;
	if (!((lp) this).e.g(1912, ((tm) var_tm).r))
	    return false;
	if (!((lp) this).e.g(i ^ 0x72a, ((tm) var_tm).z))
	    return false;
	return true;
    }
    
    final void a(int i, int i_20_, boolean bool, int i_21_) {
	if (bool) {
	    int[] is = new int[4];
	    lg.r.oa(is);
	    lg.r.da(i_20_, i_21_, ((iea) ((lp) this).d).i + i_20_,
		    ((iea) ((lp) this).d).e + i_21_);
	    int i_22_ = B.A();
	    int i_23_ = B.ca();
	    int i_24_ = C.A();
	    int i_25_ = C.ca();
	    B.a(i_20_, (((iea) ((lp) this).d).e - i_23_) / 2 + i_21_);
	    C.a(i_20_ + ((iea) ((lp) this).d).i - i_24_,
		i_21_ + (((iea) ((lp) this).d).e - i_25_) / 2);
	    lg.r.da(i_20_, i_21_, i_20_ + ((iea) ((lp) this).d).i,
		    x.ca() + i_21_);
	    x.b(i_20_ + i_22_, i_21_, ((iea) ((lp) this).d).i - i_22_ - i_24_,
		((iea) ((lp) this).d).e);
	    int i_26_ = u.ca();
	    lg.r.da(i_20_, ((iea) ((lp) this).d).e + i_21_ - i_26_,
		    i_20_ + ((iea) ((lp) this).d).i,
		    ((iea) ((lp) this).d).e + i_21_);
	    u.b(i_22_ + i_20_, i_21_ + ((iea) ((lp) this).d).e - i_26_,
		((iea) ((lp) this).d).i - i_24_ - i_22_,
		((iea) ((lp) this).d).e);
	    lg.r.da(is[0], is[1], is[2], is[3]);
	}
	s++;
	int i_27_ = -81 % ((i - 50) / 49);
    }
    
    public static void e(int i) {
	A = null;
	if (i != 2)
	    r = -27;
    }
}
