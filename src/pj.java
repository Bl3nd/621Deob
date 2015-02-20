/* pj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pj
{
    static int a;
    static GameInPacket incomingPacket7;
    static int c;
    private pl d;
    static int e;
    private pl f;
    static int g;
    private il h = new il(256);
    static int i;
    static int j = 0;
    static int k;
    private il l = new il(256);
    
    private final oaa a(int i, int i_0_, int[] is, int i_1_) {
	a++;
	int i_2_ = (0xfff8 & i_1_ << 4 | i_1_ >>> 12) ^ i;
	int i_3_ = -127 / ((i_0_ - 6) / 63);
	i_2_ |= i_1_ << 16;
	long l = (long) i_2_;
	oaa var_oaa = (oaa) this.l.a(-32748, l);
	if (var_oaa != null)
	    return var_oaa;
	if (is != null && is[0] <= 0)
	    return null;
	uea var_uea = uea.a(f, i_1_, i);
	if (var_uea == null)
	    return null;
	var_oaa = var_uea.c();
	this.l.a(var_oaa, (byte) -72, l);
	if (is != null)
	    is[0] -= ((oaa) var_oaa).l.length;
	return var_oaa;
    }
    
    static final void a(int i, Class_r class_r) {
	if (i != 256)
	    a(45, null);
	g++;
	if (!lq.hb)
	    wd.a(i - 225, class_r);
	else
	    tc.a(false, class_r);
    }
    
    private final oaa a(int i, int[] is, int i_4_, int i_5_) {
	k++;
	int i_6_ = i_5_ ^ ((i_4_ & ~0x5ffff000) << 4 | i_4_ >>> 12);
	i_6_ |= i_4_ << 16;
	long l = 0x100000000L ^ (long) i_6_;
	oaa var_oaa = (oaa) this.l.a(-32748, l);
	if (i != -432121204)
	    d = null;
	if (var_oaa != null)
	    return var_oaa;
	if (is != null && is[0] <= 0)
	    return null;
	go var_go = (go) h.a(-32748, l);
	if (var_go == null) {
	    var_go = go.a(d, i_4_, i_5_);
	    if (var_go == null)
		return null;
	    h.a(var_go, (byte) -117, l);
	}
	var_oaa = var_go.a(is);
	if (var_oaa == null)
	    return null;
	var_go.unlink(-56);
	this.l.a(var_oaa, (byte) -41, l);
	return var_oaa;
    }
    
    public static void a(byte i) {
	if (i != -71)
	    a(-85, null);
	incomingPacket7 = null;
    }
    
    static final void a(float f, int i, float f_7_, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_, float[] fs, int i_13_,
			int i_14_, int i_15_, float f_16_) {
	i_11_ -= i_8_;
	pj.i++;
	i_15_ -= i;
	i_14_ -= i_13_;
	if (i_12_ == 8431) {
	    float f_17_ = ((float) i_11_ * fs[1] + fs[0] * (float) i_14_
			   + fs[2] * (float) i_15_);
	    float f_18_ = (fs[4] * (float) i_11_ + (float) i_14_ * fs[3]
			   + (float) i_15_ * fs[5]);
	    float f_19_ = ((float) i_15_ * fs[8]
			   + (fs[7] * (float) i_11_ + (float) i_14_ * fs[6]));
	    float f_20_;
	    float f_21_;
	    if (i_9_ != 0) {
		if (i_9_ == 1) {
		    f_21_ = f_7_ + f_19_ + 0.5F;
		    f_20_ = f + f_17_ + 0.5F;
		} else if (i_9_ != 2) {
		    if (i_9_ != 3) {
			if (i_9_ == 4) {
			    f_21_ = f_16_ - f_18_ + 0.5F;
			    f_20_ = f_19_ + f_7_ + 0.5F;
			} else {
			    f_20_ = f_7_ - f_19_ + 0.5F;
			    f_21_ = f_16_ - f_18_ + 0.5F;
			}
		    } else {
			f_20_ = f_17_ + f + 0.5F;
			f_21_ = f_16_ - f_18_ + 0.5F;
		    }
		} else {
		    f_20_ = f - f_17_ + 0.5F;
		    f_21_ = f_16_ - f_18_ + 0.5F;
		}
	    } else {
		f_20_ = f + f_17_ + 0.5F;
		f_21_ = f_7_ - f_19_ + 0.5F;
	    }
	    if (i_10_ != 1) {
		if (i_10_ == 2) {
		    f_21_ = -f_21_;
		    f_20_ = -f_20_;
		} else if (i_10_ == 3) {
		    float f_22_ = f_20_;
		    f_20_ = f_21_;
		    f_21_ = -f_22_;
		}
	    } else {
		float f_23_ = f_20_;
		f_20_ = -f_21_;
		f_21_ = f_23_;
	    }
	    ega.m = f_21_;
	    Class_wb.m = f_20_;
	}
    }
    
    final oaa a(int i, int i_24_, int[] is) {
	e++;
	if (f.a((byte) -107) == i_24_)
	    return a(i, -100, is, 0);
	if (f.a(i, true) == 1)
	    return a(0, -102, is, i);
	throw new RuntimeException();
    }
    
    pj(pl var_pl, pl var_pl_25_) {
	f = var_pl;
	d = var_pl_25_;
    }
    
    final oaa a(int i, int[] is, byte i_26_) {
	c++;
	if (d.a((byte) -107) == 1)
	    return a(-432121204, is, 0, i);
	if (i_26_ > -54)
	    j = 78;
	if (d.a(i, true) == 1)
	    return a(-432121204, is, i, 0);
	throw new RuntimeException();
    }
    
    static {
	incomingPacket7 = new GameInPacket(7, -1);
    }
}
