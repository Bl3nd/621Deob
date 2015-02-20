/* ju - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SpecialOutPacket
{
    static int a;
    static int b;
    static pl c;
    static Class_ae d = new Class_ae();
    int packetID;
    static int f;
    static int g;
    static il h = new il(8);
    
    public static void a(int i) {
	if (i != 0)
	    c = null;
	c = null;
	d = null;
	h = null;
    }
    
    public final String toString() {
	f++;
	throw new IllegalStateException();
    }
    
    static final void a(byte i) {
	if (i > -102)
	    c = null;
	b++;
	int i_0_ = (int) (34.46 * (double) Class_hc.e);
	i_0_ <<= 2;
	if (lg.r.o())
	    i_0_ += 512;
	lg.r.GA(200, i_0_);
    }
    
    static final void a(da var_da, int i, sd var_sd, int i_1_, int i_2_,
			int i_3_) {
	a++;
	if (var_da != null && i_3_ == 26219)
	    var_sd.a(i, true, var_da.J(), var_da.K(), var_da.OA(), i_2_,
		     var_da.l(), var_da.KA(), var_da.H(), i_1_, var_da.za());
    }
    
    static final void b(byte i) {
	g++;
	int[] is = new int[((ItemDefLoader) laa.itemDefLoader).g];
	int i_4_ = 0;
	for (int i_5_ = 0; ((ItemDefLoader) laa.itemDefLoader).g > i_5_; i_5_++) {
	    ItemDef var_uv = laa.itemDefLoader.d(12388, i_5_);
	    if (((ItemDef) var_uv).B >= 0 || ((ItemDef) var_uv).J >= 0)
		is[i_4_++] = i_5_;
	}
	kq.U = new int[i_4_];
	int i_6_ = 0;
	int i_7_ = -26 / ((i - 63) / 42);
	for (/**/; i_6_ < i_4_; i_6_++)
	    kq.U[i_6_] = is[i_6_];
    }
    
    SpecialOutPacket(int packetID, int packetSize) {
	((SpecialOutPacket) this).packetID = packetID;
    }
}
