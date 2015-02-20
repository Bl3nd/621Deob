/* as - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

abstract class as extends pp
{
    static int s;
    int t;
    static int[] u = new int[120];
    static int v;
    static int w;
    static dr[] x = new dr[14];
    gj y;
    static int z;
    /*synthetic*/ static Class A;
    
    static final void b(byte i) {
	try {
	    if (i != 92)
		return;
	    Method method
		= (A != null ? A : (A = a("java.lang.Runtime")))
		      .getMethod("availableProcessors", new Class[0]);
	    if (method != null) {
		try {
		    Runtime runtime = Runtime.getRuntime();
		    Integer integer = (Integer) method.invoke(runtime, null);
		    uf.h = integer.intValue();
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	v++;
    }
    
    static final oj a(int i, int i_0_) {
	if (i != 1)
	    u = null;
	z++;
	if (i_0_ != 0) {
	    if (i_0_ == 1) {
		if ((double) kca.m == 3.0)
		    return al.o;
		if ((double) kca.m == 4.0)
		    return dea.c;
		if ((double) kca.m == 6.0)
		    return mfa.a;
		if ((double) kca.m >= 8.0)
		    return pga.h;
	    } else if (i_0_ == 2) {
		if ((double) kca.m == 3.0)
		    return mfa.a;
		if ((double) kca.m == 4.0)
		    return pga.h;
		if ((double) kca.m == 6.0)
		    return sk.s;
		if ((double) kca.m >= 8.0)
		    return hp.F;
	    }
	} else {
	    if ((double) kca.m == 3.0)
		return Class_db.l;
	    if ((double) kca.m == 4.0)
		return fw.Jb;
	    if ((double) kca.m == 6.0)
		return al.o;
	    if ((double) kca.m >= 8.0)
		return dea.c;
	}
	return null;
    }
    
    public static void c(byte i) {
	x = null;
	int i_1_ = -5 % ((-60 - i) / 49);
	u = null;
    }
    
    abstract Object a(int i);
    
    abstract boolean d(byte i);
    
    as(gj var_gj, int i) {
	((as) this).y = var_gj;
	((as) this).t = i;
    }
    
    static final pk[] e(byte i) {
	s++;
	if (i != -105)
	    b((byte) 94);
	return new pk[] { oba.K, ia.o, dp.g, Class_g.modeWhere, vea.a, kl.e };
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
	int i = 0;
	for (int i_2_ = 0; i_2_ < 120; i_2_++) {
	    int i_3_ = i_2_ + 1;
	    int i_4_ = (int) (300.0 * Math.pow(2.0, (double) i_3_ / 7.0)
			      + (double) i_3_);
	    i += i_4_;
	    u[i_2_] = i / 4;
	}
    }
}
