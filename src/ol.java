/* ol - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class ol implements aca
{
    static int a;
    static int b;
    static int c;
    static float d = 1.0F;
    static int e;
    static int f;
    private nh g;
    static int h;
    static int i;
    static tda j;
    static int k;
    static int l;
    private boolean m;
    private Class_r n;
    static int o = 4;
    static vf[][][] p;
    private ica[] q;
    
    public final void a(byte i) {
	ol.i++;
	if (i != -22)
	    p = null;
    }
    
    public final int c(byte i) {
	b++;
	if (i > -88)
	    n = null;
	return ((nh) g).a;
    }
    
    public static void b(int i) {
	p = null;
	j = null;
	if (i != 8)
	    a(-1.1095078F, 108, 118, -19, -71, 1, -0.10066131F, -113, null, 73,
	      -77);
    }
    
    static final void a(float f, int i, int i_0_, int i_1_, int i_2_, int i_3_,
			float f_4_, int i_5_, float[] fs, int i_6_, int i_7_) {
	i_6_ -= i_2_;
	h++;
	i_1_ -= i_3_;
	i_7_ -= i;
	float f_8_ = ((float) i_6_ * fs[0] + (float) i_7_ * fs[1]
		      + (float) i_1_ * fs[2]);
	float f_9_ = (fs[5] * (float) i_1_
		      + (fs[3] * (float) i_6_ + fs[4] * (float) i_7_));
	float f_10_ = ((float) i_6_ * fs[6] + fs[7] * (float) i_7_
		       + (float) i_1_ * fs[i_5_]);
	float f_11_
	    = ((float) Math.atan2((double) f_8_, (double) f_10_) / 6.2831855F
	       + 0.5F);
	if (f_4_ != 1.0F)
	    f_11_ *= f_4_;
	float f_12_ = f_9_ + 0.5F + f;
	if (i_0_ != 1) {
	    if (i_0_ != 2) {
		if (i_0_ == 3) {
		    float f_13_ = f_11_;
		    f_11_ = f_12_;
		    f_12_ = -f_13_;
		}
	    } else {
		f_12_ = -f_12_;
		f_11_ = -f_11_;
	    }
	} else {
	    float f_14_ = f_11_;
	    f_11_ = -f_12_;
	    f_12_ = f_14_;
	}
	Animable.u = f_12_;
	mca.y = f_11_;
    }
    
    public final boolean a(long l, int i) {
	if (i != 21336)
	    d = -0.9429004F;
	f++;
	if (l + (long) ((nh) g).c > us.a(121))
	    return false;
	return true;
    }
    
    public final void a(boolean bool, boolean bool_15_) {
	bool_15_ = bool;
	e++;
	ica[] var_icas = q;
	for (int i = 0; i < var_icas.length; i++) {
	    ica var_ica = var_icas[i];
	    if (var_ica != null)
		var_ica.a(bool_15_ || m, 6621);
	}
	m = false;
    }
    
    static final nc a(int i, Canvas canvas) {
	l++;
	try {
	    Class var_class = Class.forName("jd");
	    nc var_nc = (nc) var_class.newInstance();
	    var_nc.a(i ^ ~0x1f3, canvas);
	    if (i != 256)
		return null;
	    return var_nc;
	} catch (Throwable throwable) {
	    Class_fd var_fd = new Class_fd();
	    var_fd.a(-244, canvas);
	    return var_fd;
	}
    }
    
    public final void a(int i) {
	if (lg.r != n) {
	    n = lg.r;
	    m = true;
	}
	a++;
	if (i < 74)
	    a((int) 124, null);
	n.ja(0);
	ica[] var_icas = q;
	for (int i_16_ = 0; i_16_ < var_icas.length; i_16_++) {
	    ica var_ica = var_icas[i_16_];
	    if (var_ica != null)
		var_ica.a((int) -48);
	}
    }
    
    static final void a(byte i, Entity var_ni) {
	k++;
	boolean bool = false;
	if (((Entity) var_ni).ab != pm.currentTimedTicks && (((Entity) var_ni).yb ^ 0xffffffff) != 0
	    && ((Entity) var_ni).oc == 0) {
	    dr var_dr = Class_ef.J.c(64, ((Entity) var_ni).yb);
	    if (((dr) var_dr).z
		|| ((dr) var_dr).B[((Entity) var_ni).yc] < ((Entity) var_ni).ic + 1)
		bool = true;
	} else
	    bool = true;
	if (bool) {
	    int i_17_ = ((Entity) var_ni).ab - ((Entity) var_ni).xc;
	    int i_18_ = pm.currentTimedTicks - ((Entity) var_ni).xc;
	    int i_19_ = 512 * ((Entity) var_ni).M + var_ni.i(-1) * 256;
	    int i_20_ = ((Entity) var_ni).fc * 512 + 256 * var_ni.i(-1);
	    int i_21_ = 512 * ((Entity) var_ni).Yb + var_ni.i(-1) * 256;
	    int i_22_ = ((Entity) var_ni).Db * 512 + 256 * var_ni.i(-1);
	    ((Animable) var_ni).locX
		= (i_19_ * (i_17_ - i_18_) + i_18_ * i_21_) / i_17_;
	    ((Animable) var_ni).locY
		= (i_18_ * i_22_ + (i_17_ - i_18_) * i_20_) / i_17_;
	}
	((Entity) var_ni).Fc = 0;
	if (((Entity) var_ni).ub == 0)
	    var_ni.a(8192, 1003, false);
	if (((Entity) var_ni).ub == 1)
	    var_ni.a(12288, 1003, false);
	if (((Entity) var_ni).ub == 2)
	    var_ni.a(0, 1003, false);
	if (i < 68)
	    d = 1.1650994F;
	if (((Entity) var_ni).ub == 3)
	    var_ni.a(4096, 1003, false);
    }
    
    ol(nh var_nh, hm var_hm) {
	g = var_nh;
	q = new ica[((nh) g).d.length];
	for (int i = 0; q.length > i; i++)
	    q[i] = var_hm.a((byte) 94, ((nh) g).d[i]);
    }
    
    public final int b(byte i) {
	if (i <= 74)
	    return -42;
	c++;
	int i_23_ = 0;
	ica[] var_icas = q;
	for (int i_24_ = 0; var_icas.length > i_24_; i_24_++) {
	    ica var_ica = var_icas[i_24_];
	    if (var_ica == null || var_ica.a((byte) 82))
		i_23_++;
	}
	return 100 * i_23_ / q.length;
    }
    
    static {
	j = new tda(1);
    }
}
