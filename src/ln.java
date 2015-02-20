/* ln - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class ln
{
    private ls a;
    private en b;
    private int c;
    static int d;
    static fh e = new fh(13, 7);
    private int f;
    private int g;
    private tea h;
    private int i;
    private hh j;
    private int k;
    int l;
    boolean m = true;
    static int n;
    static int o;
    
    final void a(int i, int i_0_, hh var_hh) {
	n++;
	if (i < 64)
	    e = null;
	if (i_0_ > 0) {
	    b(false);
	    b.a(a, 0);
	    b.a(this.i - c + 1, mo.E, 0, 12896, i_0_, c, var_hh);
	}
    }
    
    final void a(int i) {
	if (i >= -8)
	    a(true);
	d++;
	a(114, ((ln) this).l, j);
    }
    
    public static void a(boolean bool) {
	e = null;
	if (bool != true)
	    e = null;
    }
    
    private final void b(boolean bool) {
	o++;
	if (((ln) this).m) {
	    ((ln) this).m = bool;
	    byte[] is = ((tea) h).b;
	    int i = 0;
	    int i_1_ = ((tea) h).k;
	    int i_2_ = ((tea) h).k * f + g;
	    for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		i = (i << 8) - i;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
		    if (is[i_2_++] != 0)
			i++;
		}
		i_2_ += i_1_ - 128;
	    }
	    if (a != null && k == i)
		((ln) this).m = false;
	    else {
		k = i;
		i_2_ = g + i_1_ * f;
		int i_5_ = 0;
		if (b.a(85, bt.g, NPCDef.hb)) {
		    if (vf.b == null)
			vf.b = new byte[16384];
		    byte[] is_6_ = vf.b;
		    for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			for (int i_8_ = -128; i_8_ < 0; i_8_++) {
			    if (is[i_2_] == 0) {
				int i_9_ = 0;
				if (is[i_2_ - 1] != 0)
				    i_9_++;
				if (is[i_2_ + 1] != 0)
				    i_9_++;
				if (is[i_2_ - i_1_] != 0)
				    i_9_++;
				if (is[i_2_ + i_1_] != 0)
				    i_9_++;
				is_6_[i_5_++] = (byte) (17 * i_9_);
			    } else
				is_6_[i_5_++] = (byte) 68;
			    i_2_++;
			}
			i_2_ += ((tea) h).k - 128;
		    }
		    if (a == null) {
			a = b.a(vf.b, 128, 128, NPCDef.hb, false, (byte) 73);
			a.a((byte) -81, false, false);
		    } else
			a.a(0, vf.b, NPCDef.hb, 0, 128, 128, 996, 128, 0);
		} else {
		    if (sba.l == null)
			sba.l = new int[16384];
		    int[] is_10_ = sba.l;
		    for (int i_11_ = -128; i_11_ < 0; i_11_++) {
			for (int i_12_ = -128; i_12_ < 0; i_12_++) {
			    if (is[i_2_] == 0) {
				int i_13_ = 0;
				if (is[i_2_ - 1] != 0)
				    i_13_++;
				if (is[i_2_ + 1] != 0)
				    i_13_++;
				if (is[i_2_ - i_1_] != 0)
				    i_13_++;
				if (is[i_2_ + i_1_] != 0)
				    i_13_++;
				is_10_[i_5_++] = 17 * i_13_ << 24;
			    } else
				is_10_[i_5_++] = 1140850688;
			    i_2_++;
			}
			i_2_ += ((tea) h).k - 128;
		    }
		    if (a == null) {
			a = b.a(128, false, 128, sba.l, (byte) 78);
			a.a((byte) -81, false, false);
		    } else
			a.a(0, (byte) 75, 128, sba.l, 0, 128, 128, 0);
		}
	    }
	}
    }
    
    ln(en var_en, tea var_tea, daa var_daa, int i, int i_14_, int i_15_,
       int i_16_, int i_17_) {
	k = -1;
	g = i_16_;
	f = i_17_;
	b = var_en;
	h = var_tea;
	int i_18_ = 1 << i_15_;
	int i_19_ = 0;
	int i_20_ = i << i_15_;
	int i_21_ = i_14_ << i_15_;
	for (int i_22_ = 0; i_22_ < i_18_; i_22_++) {
	    int i_23_ = i_20_ + (i_22_ + i_21_) * ((Class_i) var_daa).k;
	    for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
		short[] is = ((daa) var_daa).O[i_23_++];
		if (is != null)
		    i_19_ += is.length;
	    }
	}
	if (i_19_ > 0) {
	    this.i = -2147483648;
	    c = 2147483647;
	    j = b.b(false, (int) 16);
	    j.a(27209, i_19_);
	    for (int i_25_ = 0; i_25_ < 4; i_25_++) {
		Buffer buffer = j.a((byte) -88, true);
		if (buffer != null) {
		    Stream stream = b.a(buffer, 111);
		    if (!Stream.a()) {
			for (int i_26_ = 0; i_26_ < i_18_; i_26_++) {
			    int i_27_
				= (i_20_
				   + ((Class_i) var_daa).k * (i_26_ + i_21_));
			    for (int i_28_ = 0; i_28_ < i_18_; i_28_++) {
				short[] is = ((daa) var_daa).O[i_27_++];
				if (is != null) {
				    for (int i_29_ = 0; i_29_ < is.length;
					 i_29_++) {
					int i_30_ = is[i_29_] & 0xffff;
					if (i_30_ > this.i)
					    this.i = i_30_;
					if (c > i_30_)
					    c = i_30_;
					stream.e(i_30_);
				    }
				}
			    }
			}
		    } else {
			for (int i_31_ = 0; i_18_ > i_31_; i_31_++) {
			    int i_32_
				= (((Class_i) var_daa).k * (i_31_ + i_21_)
				   + i_20_);
			    for (int i_33_ = 0; i_33_ < i_18_; i_33_++) {
				short[] is = ((daa) var_daa).O[i_32_++];
				if (is != null) {
				    for (int i_34_ = 0; i_34_ < is.length;
					 i_34_++) {
					int i_35_ = is[i_34_] & 0xffff;
					if (i_35_ < c)
					    c = i_35_;
					if (i_35_ > this.i)
					    this.i = i_35_;
					stream.c(i_35_);
				    }
				}
			    }
			}
		    }
		    stream.c();
		    if (j.b((byte) 74))
			break;
		}
	    }
	    ((ln) this).l = i_19_ / 3;
	} else {
	    a = null;
	    ((ln) this).l = 0;
	}
    }
}
