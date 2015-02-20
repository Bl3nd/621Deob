/* bi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

final class bi extends qda
{
    private int K;
    static int L;
    static int M;
    static int N;
    private int O;
    static int P;
    private boolean Q;
    private int R;
    private boolean S;
    static int T;
    static short U;
    static int[] V = new int[13];
    static int W;
    static int X;
    static int Y;
    private int Z;
    private int ab = 0;
    private int bb;
    private double cb;
    private int db;
    static int eb;
    static int fb;
    static int gb;
    static int hb;
    private double ib;
    int jb;
    static int kb;
    private double lb;
    int mb;
    static qfa nb;
    static int ob;
    private boolean pb;
    private int qb;
    static int rb;
    private double sb;
    int tb;
    int ub;
    static int vb;
    private double wb;
    private double xb;
    private int yb;
    private int zb;
    private int Ab;
    static int Bb;
    private double Cb;
    private tq Db;
    static int Eb;
    private double Fb;
    static int Gb;
    private dr Hb;
    /*synthetic*/ static Class Ib;
    
    final og a(boolean bool, Class_r class_r) {
	if (bool != false)
	    return null;
	fb++;
	da var_da = a((byte) 111, 2048, class_r);
	if (var_da == null)
	    return null;
	Class_q class_q = class_r.p();
	class_q.oa(zb);
	class_q.ZA(R);
	class_q.U((int) lb, (int) Fb, (int) sb);
	a(-113, class_r, class_q, var_da);
	if (!ml.k)
	    var_da.a(class_q, null, 0);
	else
	    var_da.a(class_q, null, Class_pd.r, 0);
	if (Db != null) {
	    ir var_ir = Db.g();
	    if (ml.k)
		class_r.a(var_ir, Class_pd.r);
	    else
		class_r.a(var_ir);
	}
	S = var_da.LA();
	Z = var_da.J();
	Ab = var_da.RA();
	return null;
    }
    
    private final da a(byte i, int i_0_, Class_r class_r) {
	if (i != 111)
	    qb = -62;
	Bb++;
	iv var_iv = Class_ic.H.a((byte) 12, O);
	return var_iv.a(db, class_r, -36, Class_ef.J, yb, i_0_, ab);
    }
    
    final boolean e(byte i) {
	if (i != 23)
	    Db = null;
	ob++;
	return S;
    }
    
    final void a(byte i) {
	Eb++;
	if (Db != null)
	    Db.f();
	if (i != 105)
	    zb = -28;
    }
    
    private final void a(int i, Class_r class_r, Class_q class_q, da var_da) {
	var_da.a(class_q);
	W++;
	hi[] var_his = var_da.c();
	if (i < -106) {
	    qg[] var_qgs = var_da.f();
	    if ((Db == null || ((tq) Db).k)
		&& (var_his != null || var_qgs != null))
		Db = tq.a(pm.currentTimedTicks, true);
	    if (Db != null) {
		Db.a(class_r, (long) pm.currentTimedTicks, var_his, var_qgs, false);
		Db.a(((Animable) this).height, ((qda) this).B, ((qda) this).I,
		     ((qda) this).x, ((qda) this).y);
	    }
	}
    }
    
    final void b(boolean bool, Class_r class_r) {
	M++;
	if (bool != false)
	    a((byte) 38);
	da var_da = a((byte) 111, 0, class_r);
	if (var_da != null) {
	    Class_q class_q = class_r.p();
	    class_q.oa(zb);
	    class_q.ZA(R);
	    class_q.U((int) lb, (int) Fb, (int) sb);
	    Z = var_da.J();
	    Ab = var_da.RA();
	    a(-120, class_r, class_q, var_da);
	}
    }
    
    final boolean a(int i, int i_1_, Class_r class_r, int i_2_) {
	P++;
	if (i_2_ != 9678)
	    a(-112, -86, -40, -59, 54);
	return false;
    }
    
    final void a(int i, int i_3_) {
	Gb++;
	sb += (double) i * xb;
	Q = true;
	lb += wb * (double) i;
	if (!pb) {
	    if ((qb ^ 0xffffffff) != 0) {
		Fb += 0.5 * cb * (double) i * (double) i + Cb * (double) i;
		Cb += (double) i * cb;
	    } else
		Fb += Cb * (double) i;
	} else
	    Fb = (double) (Class_u.b((int) lb, ((Animable) this).height, -20214, (int) sb)
			   - bb);
	R = (int) (Math.atan2(wb, xb) * 2607.5945876176133) + 8192 & 0x3fff;
	zb = (int) (Math.atan2(Cb, ib) * 2607.5945876176133) & 0x3fff;
	if (i_3_ == 0) {
	    if (Hb != null) {
		ab += i;
		while (((dr) Hb).B[yb] < ab) {
		    ab -= ((dr) Hb).B[yb];
		    yb++;
		    if (((dr) Hb).p.length <= yb) {
			yb -= ((dr) Hb).y;
			if (yb < 0 || ((dr) Hb).p.length <= yb)
			    yb = 0;
		    }
		    db = yb + 1;
		    if (((dr) Hb).p.length <= db) {
			db -= ((dr) Hb).y;
			if (db < 0 || db >= ((dr) Hb).p.length)
			    db = -1;
		    }
		}
	    }
	}
    }
    
    protected final void finalize() {
	if (Db != null)
	    Db.f();
	L++;
    }
    
    final void a(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
	if (!Q) {
	    double d = (double) (i_4_ - ((Animable) this).locX);
	    double d_8_ = (double) (i - ((Animable) this).locY);
	    double d_9_ = Math.sqrt(d * d + d_8_ * d_8_);
	    lb = (double) ((Animable) this).locX + (double) K * d / d_9_;
	    sb = d_8_ * (double) K / d_9_ + (double) ((Animable) this).locY;
	    if (!pb)
		Fb = (double) ((Animable) this).j;
	    else
		Fb = (double) (Class_u.b((int) lb, ((Animable) this).height, -20214,
					 (int) sb)
			       - bb);
	}
	X++;
	double d = (double) (((bi) this).mb + 1 - i_6_);
	xb = ((double) i - sb) / d;
	wb = ((double) i_4_ - lb) / d;
	ib = Math.sqrt(xb * xb + wb * wb);
	if (i_5_ == (qb ^ 0xffffffff))
	    Cb = ((double) i_7_ - Fb) / d;
	else {
	    if (!Q)
		Cb = -ib * Math.tan((double) qb * 0.02454369);
	    cb = ((double) i_7_ - Fb - Cb * d) * 2.0 / (d * d);
	}
    }
    
    final boolean h(byte i) {
	if (i > -26)
	    a((Class_r) null, 33);
	Y++;
	return false;
    }
    
    final boolean g(byte i) {
	T++;
	if (i <= 114)
	    d((int) -21);
	return false;
    }
    
    final void h(int i) {
	if (i == 0) {
	    ((qda) this).B = ((qda) this).I = (short) (int) (lb / 512.0);
	    rb++;
	    ((qda) this).x = ((qda) this).y = (short) (int) (sb / 512.0);
	}
    }
    
    final void a(boolean bool, int i, byte i_10_, Class_r class_r, Animable var_lo,
		 int i_11_, int i_12_) {
	kb++;
	int i_13_ = -64 % ((i_10_ + 50) / 55);
	throw new IllegalStateException();
    }
    
    final sd a(Class_r class_r, int i) {
	if (i != -1660704056)
	    h((byte) -109);
	vb++;
	return null;
    }
    
    final int c(int i) {
	if (i != -22496)
	    h((byte) 6);
	gb++;
	return Ab;
    }
    
    final int g(int i) {
	eb++;
	int i_14_ = 40 / ((-43 - i) / 59);
	return Z;
    }
    
    final void d(int i) {
	if (i == -1) {
	    hb++;
	    throw new IllegalStateException();
	}
    }
    
    bi(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_,
       int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, boolean bool) {
	super(i_15_, i_16_, i_17_,
	      Class_u.b(i_17_, i_15_, -20214, i_18_) - i_19_, i_18_,
	      i_17_ >> 9, i_17_ >> 9, i_18_ >> 9, i_18_ >> 9, false, (byte) 0);
	S = false;
	Z = 0;
	Ab = 0;
	yb = 0;
	Q = false;
	db = -1;
	((bi) this).mb = i_21_;
	Q = false;
	((bi) this).tb = i_20_;
	qb = i_22_;
	((bi) this).ub = i_24_;
	bb = i_19_;
	O = i;
	K = i_23_;
	((bi) this).jb = i_25_;
	pb = bool;
	int i_26_ = ((iv) Class_ic.H.a((byte) 12, O)).w;
	if ((i_26_ ^ 0xffffffff) != 0)
	    Hb = Class_ef.J.c(64, i_26_);
	else
	    Hb = null;
    }
    
    public static void b(byte i) {
	if (i <= 115)
	    V = null;
	V = null;
	nb = null;
    }
    
    static final boolean a(String string, int i, Class var_class) {
	N++;
	if (i < 95)
	    a((String) null, -107, null);
	Class var_class_27_ = (Class) pfa.c.get(string);
	if (var_class_27_ != null) {
	    if (var_class_27_.getClassLoader() != var_class.getClassLoader())
		return false;
	    return true;
	}
	File file = null;
	if (file == null)
	    file = (File) aea.H.get(string);
	if (file != null) {
	    try {
		file = new File(file.getCanonicalPath());
		Class var_class_28_ = Class.forName("java.lang.Runtime");
		Class var_class_29_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_29_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_30_
		    = (var_class_28_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_30_, new Object[] { Boolean.TRUE });
		method_30_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_30_, new Object[] { Boolean.FALSE });
		pfa.c.put(string, var_class);
		return true;
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		pfa.c.put(string, Ib != null ? Ib : (Ib = a("ka")));
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return false;
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	U = (short) 1;
	nb = new qfa("", 13);
    }
}
