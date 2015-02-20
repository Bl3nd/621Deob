/* Class_ab - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_ab
{
    static int[] a = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    static tb b = new tb(64);
    static float c;
    static GameInPacket incomingPacket60 = new GameInPacket(60, -2);
    /*synthetic*/ static Class e;
    
    public Class_ab() {
	/* empty */
    }
    
    abstract void a(float f, int i, int i_0_, int i_1_, float f_2_, float[] fs,
		    int i_3_, int i_4_, float f_5_, int i_6_, float f_7_);
    
    public static void a(int i) {
	b = null;
	if (i == -11521) {
	    incomingPacket60 = null;
	    a = null;
	}
    }
    
    static final void a() {
	for (int i = 0; i < qn.k; i++) {
	    if (!Class_j.i[i]) {
		qd var_qd = Class_j.l[i];
		gga var_gga = ((qd) var_qd).m;
		int i_8_ = ((qd) var_qd).o;
		int i_9_ = var_gga.a((byte) -73) - dba.k;
		int i_10_ = (2 * i_9_ >> Class_fb.a) + 1;
		int i_11_ = 0;
		int[] is = new int[i_10_ * i_10_];
		int i_12_ = var_gga.a(true) - i_9_ >> Class_fb.a;
		int i_13_ = var_gga.b((byte) 119) - i_9_ >> Class_fb.a;
		int i_14_ = var_gga.b((byte) 119) + i_9_ >> Class_fb.a;
		if (i_13_ < 0) {
		    i_11_ -= i_13_;
		    i_13_ = 0;
		}
		if (i_14_ >= nf.H)
		    i_14_ = nf.H - 1;
		for (int i_15_ = i_13_; i_15_ <= i_14_; i_15_++) {
		    int i_16_ = ((qd) var_qd).g[i_11_];
		    int i_17_ = i_16_ >>> 8;
		    int i_18_ = i_11_ * i_10_ + i_17_;
		    int i_19_ = i_12_ + (i_16_ >>> 8);
		    int i_20_ = i_19_ + (i_16_ & 0xff) - 1;
		    if (i_19_ < 0) {
			i_18_ -= i_19_;
			i_19_ = 0;
		    }
		    if (i_20_ >= sv.T)
			i_20_ = sv.T - 1;
		    for (int i_21_ = i_19_; i_21_ <= i_20_; i_21_++) {
			int i_22_ = 1;
			qda var_qda = ik.a(i_8_, i_21_, i_15_,
					   e != null ? e : (e = a("qda")));
			if (var_qda != null && ((qda) var_qda).J != 0) {
			    if (((qda) var_qda).J == 1) {
				boolean bool = i_21_ - 1 >= i_19_;
				boolean bool_23_ = i_21_ + 1 <= i_20_;
				if (!bool && i_15_ + 1 <= i_14_) {
				    int i_24_ = ((qd) var_qd).g[i_11_ + 1];
				    int i_25_ = i_12_ + (i_24_ >>> 8);
				    int i_26_ = i_25_ + (i_24_ & 0xff);
				    bool = i_21_ > i_25_ && i_21_ < i_26_;
				}
				if (!bool_23_ && i_15_ - 1 >= i_13_) {
				    int i_27_ = ((qd) var_qd).g[i_11_ - 1];
				    int i_28_ = i_12_ + (i_27_ >>> 8);
				    int i_29_ = i_28_ + (i_27_ & 0xff);
				    bool_23_ = i_21_ > i_28_ && i_21_ < i_29_;
				}
				if (bool && !bool_23_)
				    i_22_ = 4;
				else if (bool_23_ && !bool)
				    i_22_ = 2;
			    } else {
				boolean bool = i_21_ - 1 >= i_19_;
				boolean bool_30_ = i_21_ + 1 <= i_20_;
				if (!bool && i_15_ - 1 >= i_13_) {
				    int i_31_ = ((qd) var_qd).g[i_11_ - 1];
				    int i_32_ = i_12_ + (i_31_ >>> 8);
				    int i_33_ = i_32_ + (i_31_ & 0xff);
				    bool = i_21_ > i_32_ && i_21_ < i_33_;
				}
				if (!bool_30_ && i_15_ + 1 <= i_14_) {
				    int i_34_ = ((qd) var_qd).g[i_11_ + 1];
				    int i_35_ = i_12_ + (i_34_ >>> 8);
				    int i_36_ = i_35_ + (i_34_ & 0xff);
				    bool_30_ = i_21_ > i_35_ && i_21_ < i_36_;
				}
				if (bool && !bool_30_)
				    i_22_ = 3;
				else if (bool_30_ && !bool)
				    i_22_ = 5;
			    }
			}
			is[i_18_++] = i_22_;
		    }
		    i_11_++;
		}
		Class_j.i[i] = true;
		Class_q.b[i_8_].a(var_gga, is);
	    }
	}
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
