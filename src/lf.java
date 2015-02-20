/* lf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lf
{
    static int a;
    static rc b = new rc();
    static int c;
    static int d;
    private cv e;
    private int f;
    private cv g = null;
    static int h;
    private int i;
    static int j;
    static int k;
    static cw l;
    static GameInPacket incomingPacket11 = new GameInPacket(11, 0);
    static short[] n;
    static int o;
    
    public static void a(int i) {
	if (i == 4) {
	    n = null;
	    l = null;
	    incomingPacket11 = null;
	    b = null;
	}
    }
    
    static final void a(byte[] is, int i, int i_0_, int i_1_, int i_2_,
			byte i_3_, int i_4_, int i_5_, byte[] is_6_) {
	j++;
	if (i_3_ > -80)
	    a(null, 82, 124, 91, 20, (byte) 37, -28, -127, null);
	int i_7_ = -(i_1_ >> 2);
	i_1_ = -(i_1_ & 0x3);
	for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
	    for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
		is_6_[i_2_++] += is[i++];
		is_6_[i_2_++] += is[i++];
		is_6_[i_2_++] += is[i++];
		is_6_[i_2_++] += is[i++];
	    }
	    for (int i_10_ = i_1_; i_10_ < 0; i_10_++)
		is_6_[i_2_++] += is[i++];
	    i += i_0_;
	    i_2_ += i_5_;
	}
    }
    
    final byte[] a(byte i, int i_11_) {
	a++;
	if (i != 108)
	    b = null;
	synchronized (e) {
	    try {
		if (g.d(0) < (long) (6 * i_11_ + 6))
		    return null;
		g.seek(13755, (long) (6 * i_11_));
		g.a(0, (byte) 121, 6, bt.n);
		int i_12_ = ((bt.n[1] << 8 & 0xff00)
			     + (((bt.n[0] & 0xff) << 16) + (0xff & bt.n[2])));
		int i_13_ = ((0xff00 & bt.n[4] << 8)
			     + (bt.n[3] << 16 & 0xff0000) + (0xff & bt.n[5]));
		if (i_12_ < 0 || i_12_ > f)
		    return null;
		if (i_13_ <= 0 || (long) i_13_ > e.d(0) / 520L)
		    return null;
		byte[] is = new byte[i_12_];
		int i_14_ = 0;
		int i_15_ = 0;
		while (i_12_ > i_14_) {
		    if (i_13_ == 0)
			return null;
		    e.seek(i ^ 0x35d7, (long) (i_13_ * 520));
		    int i_16_ = i_12_ - i_14_;
		    if (i_16_ > 512)
			i_16_ = 512;
		    e.a(0, (byte) 113, i_16_ + 8, bt.n);
		    int i_17_ = (0xff & bt.n[1]) + ((0xff & bt.n[0]) << 8);
		    int i_18_ = ((0xff & bt.n[2]) << 8) + (0xff & bt.n[3]);
		    int i_19_
			= (0xff & bt.n[6]) + (((bt.n[5] & 0xff) << 8)
					      + (bt.n[4] << 16 & 0xff0000));
		    int i_20_ = 0xff & bt.n[7];
		    if (i_11_ != i_17_ || i_15_ != i_18_ || i_20_ != this.i)
			return null;
		    if (i_19_ < 0 || e.d(0) / 520L < (long) i_19_)
			return null;
		    i_15_++;
		    i_13_ = i_19_;
		    for (int i_21_ = 0; i_21_ < i_16_; i_21_++)
			is[i_14_++] = bt.n[i_21_ + 8];
		}
		return is;
	    } catch (java.io.IOException ioexception) {
		return null;
	    }
	}
    }
    
    private final boolean a(int i, byte i_22_, boolean bool, int i_23_,
			    byte[] is) {
	k++;
	synchronized (e) {
	    if (i_22_ != -15)
		a(-47);
	    try {
		int i_24_;
		if (!bool) {
		    i_24_ = (int) ((e.d(i_22_ + 15) + 519L) / 520L);
		    if (i_24_ == 0)
			i_24_ = 1;
		} else {
		    if ((long) (6 * i + 6) > g.d(i_22_ + 15))
			return false;
		    g.seek(13755, (long) (i * 6));
		    g.a(0, (byte) 113, 6, bt.n);
		    i_24_ = (((bt.n[3] & 0xff) << 16) + (0xff00 & bt.n[4] << 8)
			     + (bt.n[5] & 0xff));
		    if (i_24_ <= 0 || (long) i_24_ > e.d(0) / 520L)
			return false;
		}
		bt.n[3] = (byte) (i_24_ >> 16);
		bt.n[5] = (byte) i_24_;
		bt.n[2] = (byte) i_23_;
		bt.n[1] = (byte) (i_23_ >> 8);
		bt.n[4] = (byte) (i_24_ >> 8);
		bt.n[0] = (byte) (i_23_ >> 16);
		g.seek(13755, (long) (i * 6));
		g.a(bt.n, 0, 6, 27895);
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_;
		for (/**/; i_23_ > i_25_; i_25_ += i_27_) {
		    int i_28_ = 0;
		    if (bool) {
			e.seek(13755, (long) (i_24_ * 520));
			try {
			    e.a(0, (byte) 121, 8, bt.n);
			} catch (java.io.EOFException eofexception) {
			    break;
			}
			i_27_ = (bt.n[0] << 8 & 0xff00) + (bt.n[1] & 0xff);
			int i_29_ = (bt.n[2] << 8 & 0xff00) + (bt.n[3] & 0xff);
			i_28_ = (bt.n[5] << 8 & 0xff00) + ((0xff0000
							    & bt.n[4] << 16)
							   + (0xff & bt.n[6]));
			int i_30_ = bt.n[7] & 0xff;
			if (i_27_ != i || i_29_ != i_26_ || i_30_ != this.i)
			    return false;
			if (i_28_ < 0 || e.d(0) / 520L < (long) i_28_)
			    return false;
		    }
		    if (i_28_ == 0) {
			i_28_ = (int) ((e.d(i_22_ + 15) + 519L) / 520L);
			bool = false;
			if (i_28_ == 0)
			    i_28_++;
			if (i_28_ == i_24_)
			    i_28_++;
		    }
		    bt.n[3] = (byte) i_26_;
		    bt.n[2] = (byte) (i_26_ >> 8);
		    bt.n[1] = (byte) i;
		    bt.n[0] = (byte) (i >> 8);
		    if (i_23_ - i_25_ <= 512)
			i_28_ = 0;
		    bt.n[7] = (byte) this.i;
		    bt.n[4] = (byte) (i_28_ >> 16);
		    bt.n[5] = (byte) (i_28_ >> 8);
		    bt.n[6] = (byte) i_28_;
		    e.seek(13755, (long) (i_24_ * 520));
		    e.a(bt.n, 0, 8, 27895);
		    i_27_ = i_23_ - i_25_;
		    if (i_27_ > 512)
			i_27_ = 512;
		    e.a(is, i_25_, i_27_, 27895);
		    i_24_ = i_28_;
		    i_26_++;
		}
		return true;
	    } catch (java.io.IOException ioexception) {
		return false;
	    }
	}
    }
    
    final boolean a(int i, byte[] is, int i_31_, int i_32_) {
	d++;
	synchronized (e) {
	    if (i < 0 || i > f)
		throw new IllegalArgumentException();
	    boolean bool = a(i_31_, (byte) -15, true, i, is);
	    if (!bool)
		bool = a(i_31_, (byte) -15, false, i, is);
	    if (i_32_ >= -25)
		a((byte) 56, 9);
	    return bool;
	}
    }
    
    public final String toString() {
	c++;
	return "Cache:" + i;
    }
    
    static final og a(boolean bool, int i) {
	h++;
	synchronized (tw.l) {
	    if (bool != true)
		a(false, -8);
	    og var_og;
	    if (tw.l.length <= i || tw.l[i].a(17494)) {
		var_og = new og();
		((og) var_og).g = new pba[i];
		for (int i_33_ = 0; i_33_ < i; i_33_++)
		    ((og) var_og).g[i_33_] = new pba();
	    } else {
		var_og = (og) tw.l[i].c(127);
		var_og.b(2);
		World.k[i]--;
	    }
	    return var_og;
	}
    }
    
    lf(int i, cv var_cv, cv var_cv_34_, int i_35_) {
	f = 65000;
	e = null;
	this.i = i;
	g = var_cv_34_;
	e = var_cv;
	f = i_35_;
    }
}
