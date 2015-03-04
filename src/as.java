/* as - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Method;

public abstract class as extends pp {

    static int s;
    int t;
    static int[] u = new int[120];
    static int v;
    static int w;
    static dr[] drs = new dr[14];
    gj gj;
    static int z;
    /*synthetic*/ static Class lang_Runtime;

    public static void b(byte b) {
        try {
            if (b != 92) {
                return;
            }
            Method availableProcessors = (lang_Runtime != null ? lang_Runtime :
                    (lang_Runtime = getClassByName("java.lang.Runtime"))).getMethod("availableProcessors", new Class[0]);
            if (availableProcessors != null) {
                try {
                    Runtime runtime = Runtime.getRuntime();
                    Integer integer = (Integer) availableProcessors.invoke(runtime, null);
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

    public static oj a(int i, int j) {
        z++;
        if (j != 0) {
            if (j == 1) {
                if ((double) kca.m == 3.0) {
                    return al.oj;
                }
                if ((double) kca.m == 4.0) {
                    return dea.c;
                }
                if ((double) kca.m == 6.0) {
                    return mfa.a;
                }
                if ((double) kca.m >= 8.0) {
                    return pga.h;
                }
            } else if (j == 2) {
                if ((double) kca.m == 3.0) {
                    return mfa.a;
                }
                if ((double) kca.m == 4.0) {
                    return pga.h;
                }
                if ((double) kca.m == 6.0) {
                    return sk.s;
                }
                if ((double) kca.m >= 8.0) {
                    return hp.F;
                }
            }
        } else {
            if ((double) kca.m == 3.0) {
                return Class_db.l;
            }
            if ((double) kca.m == 4.0) {
                return fw.Jb;
            }
            if ((double) kca.m == 6.0) {
                return al.oj;
            }
            if ((double) kca.m >= 8.0) {
                return dea.c;
            }
        }
        return null;
    }

    public static void nullLoader() {
        drs = null;
        u = null;
    }

    abstract Object getObject(int i);

    abstract boolean d(byte i);

    public as(gj gj, int i) {
        this.gj = gj;
        this.t = i;
    }

    public static pk[] getPKs() {
        s++;
        return new pk[]{oba.pk, ia.o, dp.g, Class_g.modeWhere, vea.a, kl.e};
    }

    /*synthetic*/
    private static Class getClassByName(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static {
        int i = 0;
        for (int index = 0; index < 120; index++) {
            int j = index + 1;
            int k = (int) (300.0 * Math.pow(2.0, (double) j / 7.0) + (double) j);
            i += k;
            u[index] = i / 4;
        }
    }
}
