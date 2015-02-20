/* km - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class km
{
    private int a;
    static int b;
    static int c;
    private int d;
    private iu e;
    static int f;
    private wk g;
    private int h;
    static int i;
    static int j;
    boolean k = true;
    private dw l;
    private int m;
    static int n;
    private pm o;
    private qj p;
    static int q = 0;
    
    private final void a(byte i) {
	km.i++;
	if (((km) this).k) {
	    ((km) this).k = false;
	    byte[] is = ((iu) e).t;
	    byte[] is_0_ = ((qj) p).fh;
	    if (i != -62)
		l = null;
	    int i_1_ = 0;
	    int i_2_ = ((iu) e).m;
	    int i_3_ = a * ((iu) e).m + m;
	    for (int i_4_ = -128; i_4_ < 0; i_4_++) {
		i_1_ = (i_1_ << 8) - i_1_;
		for (int i_5_ = -128; i_5_ < 0; i_5_++) {
		    if (is[i_3_++] != 0)
			i_1_++;
		}
		i_3_ += i_2_ - 128;
	    }
	    if (o != null && d == i_1_)
		((km) this).k = false;
	    else {
		d = i_1_;
		int i_6_ = 0;
		i_3_ = m + a * i_2_;
		for (int i_7_ = -128; i_7_ < 0; i_7_++) {
		    for (int i_8_ = -128; i_8_ < 0; i_8_++) {
			if (is[i_3_] == 0) {
			    int i_9_ = 0;
			    if (is[i_3_ - 1] != 0)
				i_9_++;
			    if (is[i_3_ + 1] != 0)
				i_9_++;
			    if (is[i_3_ - i_2_] != 0)
				i_9_++;
			    if (is[i_2_ + i_3_] != 0)
				i_9_++;
			    is_0_[i_6_++] = (byte) (17 * i_9_);
			} else
			    is_0_[i_6_++] = (byte) 68;
			i_3_++;
		    }
		    i_3_ += ((iu) e).m - 128;
		}
		if (o != null)
		    o.a(0, 6406, 0, 0, false, 128, 3314, 0, ((qj) p).fh, 128);
		else {
		    o = new pm(p, 3553, 6406, 128, 128, false, ((qj) p).fh,
			       6406, false);
		    o.a(false, (byte) -126, false);
		    o.b(true, 17137);
		}
	    }
	}
    }
    
    final void a(byte[] is, int i, int i_10_, int i_11_) {
	n++;
	g.a(i, 17816, p.a((byte) 74, i) * i_10_, is);
	int i_12_ = -11 % ((52 - i_11_) / 49);
	a(-6202, i_10_, g);
    }
    
    final void b(byte i) {
	a(-6202, h, l);
	if (i != -94)
	    o = null;
	j++;
    }
    
    static final void a(int i, float[] fs, byte i_13_, float f, int i_14_,
			int i_15_, int i_16_, int i_17_, int i_18_,
			int i_19_) {
	i_17_ -= i_15_;
	i_18_ -= i_14_;
	c++;
	i_16_ -= i_19_;
	float f_20_ = (fs[1] * (float) i_18_ + fs[0] * (float) i_17_
		       + (float) i_16_ * fs[2]);
	if (i_13_ >= -5)
	    q = -121;
	float f_21_ = (fs[4] * (float) i_18_ + fs[3] * (float) i_17_
		       + fs[5] * (float) i_16_);
	float f_22_ = ((float) i_18_ * fs[7] + fs[6] * (float) i_17_
		       + fs[8] * (float) i_16_);
	float f_23_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_
						  + f_22_ * f_22_));
	float f_24_
	    = ((float) Math.atan2((double) f_20_, (double) f_22_) / 6.2831855F
	       + 0.5F);
	float f_25_ = ((float) Math.asin((double) (f_21_ / f_23_)) / 3.1415927F
		       + 0.5F + f);
	if (i != 1) {
	    if (i == 2) {
		f_25_ = -f_25_;
		f_24_ = -f_24_;
	    } else if (i == 3) {
		float f_26_ = f_24_;
		f_24_ = f_25_;
		f_25_ = -f_26_;
	    }
	} else {
	    float f_27_ = f_24_;
	    f_24_ = -f_25_;
	    f_25_ = f_27_;
	}
	lg.A = f_24_;
	gs.y = f_25_;
    }
    
    private final void a(int i, int i_28_, dw var_dw) {
	b++;
	if (i_28_ != 0) {
	    a((byte) -62);
	    p.a(o, -2);
	    p.a(i_28_, 0, 4, var_dw, i ^ ~0x18c6);
	    if (i != -6202)
		e = null;
	}
    }
    
    km(qj var_qj, iu var_iu, dga var_dga, int i, int i_29_, int i_30_,
       int i_31_, int i_32_) {
	d = -1;
	e = var_iu;
	p = var_qj;
	a = i_32_;
	m = i_31_;
	int i_33_ = 1 << i_30_;
	int i_34_ = 0;
	int i_35_ = i << i_30_;
	int i_36_ = i_29_ << i_30_;
	for (int i_37_ = 0; i_37_ < i_33_; i_37_++) {
	    int i_38_ = i_35_ + (i_36_ + i_37_) * ((Class_i) var_dga).k;
	    for (int i_39_ = 0; i_33_ > i_39_; i_39_++) {
		short[] is = ((dga) var_dga).p[i_38_++];
		if (is != null)
		    i_34_ += is.length;
	    }
	}
	h = i_34_;
	if (i_34_ <= 0)
	    o = null;
	else {
	    BytesParser var_es = new BytesParser(2 * i_34_);
	    if (!((qj) p).ig) {
		for (int i_40_ = 0; i_33_ > i_40_; i_40_++) {
		    int i_41_
			= i_35_ + ((Class_i) var_dga).k * (i_40_ + i_36_);
		    for (int i_42_ = 0; i_42_ < i_33_; i_42_++) {
			short[] is = ((dga) var_dga).p[i_41_++];
			if (is != null) {
			    for (int i_43_ = 0; i_43_ < is.length; i_43_++)
				var_es.writeShortReversed2(is[i_43_] & 0xffff, (byte) 0);
			}
		    }
		}
	    } else {
		for (int i_44_ = 0; i_33_ > i_44_; i_44_++) {
		    int i_45_
			= i_35_ + (i_36_ + i_44_) * ((Class_i) var_dga).k;
		    for (int i_46_ = 0; i_46_ < i_33_; i_46_++) {
			short[] is = ((dga) var_dga).p[i_45_++];
			if (is != null) {
			    for (int i_47_ = 0; is.length > i_47_; i_47_++)
				var_es.writeShort(is[i_47_] & 0xffff, 13469);
			}
		    }
		}
	    }
	    l = p.a((byte) -81, ((BytesParser) var_es).pos, ((BytesParser) var_es).bytes, false, 5123);
	    g = new wk(p, 5123, null, 1);
	}
    }
}
