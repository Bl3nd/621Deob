/* rv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class rv extends Class_j {
    static int unloadNativeLibraries;
    private int n;
    static Class_ae o;
    static int p = 0;
    private int q;
    private int r;
    static int s;
    static int t;
    static int u;
    static int v;
    private oq w;
    private int x;
    private en y;
    private int z;
    static int A;
    private int B;

    static final void a(int i, boolean bool) {
        u++;
        naa.d((byte) 76);
        if (bc.a(hm.h, (byte) -62)) {
            nc.n++;
            if (nc.n >= 50 || bool) {
                nc.n = 0;
                if (!cm.K && ce.y != null) {
                    jq.k++;
                    tba var_tba = jga.sendGameOutPacket(lw.outgoingPacket24, pca.isaac, (byte) -127);
                    ud.a(var_tba, (byte) -36);
                    try {
                        InputStreamSub.a((byte) 121);
                    } catch (java.io.IOException ioexception) {
                        cm.K = true;
                    }
                }
                naa.d((byte) 76);
                if (i != -1)
                    o = null;
            }
        }
    }

    public static void b(byte i) {
        if (i != -1)
            b(false);
        o = null;
    }

    static final void b(boolean bool) {
        s++;
        if (bool != false)
            o = null;
        if (pga.f != null) {
            if (pga.f.f == 1)
                pga.f = null;
            else if (pga.f.f == 2) {
                wk.a(-97, ee.d, ff.signlink, 2);
                pga.f = null;
            }
        }
    }

    static final int a(byte i, String string) {
        t++;
        if (!((Signlink) kga.lb).r)
            return -1;
        if (aea.hashtable.containsKey(string))
            return 100;
        if (i != -127)
            o = null;
        String string_0_ = sg.a((byte) -66, string);
        if (string_0_ == null)
            return -1;
        String string_1_ = Class_q.g + string_0_;
        if (!cv.x.a(string_1_, 69, ""))
            return -1;
        if (!cv.x.a(false, string_1_))
            return cv.x.b(string_1_, i ^ ~0x5);
        byte[] is = cv.x.a(78, string_1_, "");
        Object object = null;
        File file;
        try {
            file = le.a(string_0_, (byte) -106);
        } catch (RuntimeException runtimeexception) {
            return -1;
        }
        if (is != null && file != null) {
            boolean bool = true;
            byte[] is_2_ = ofa.a((byte) -103, file);
            if (is_2_ == null || is_2_.length != is.length)
                bool = false;
            else {
                for (int i_3_ = 0; i_3_ < is_2_.length; i_3_++) {
                    if (is_2_[i_3_] != is[i_3_]) {
                        bool = false;
                        break;
                    }
                }
            }
            try {
                if (!bool)
                    kga.lb.writeFileOutputStream(72, file, is);
            } catch (Throwable throwable) {
                return -1;
            }
            ih.a(string, file, 49);
            return 100;
        }
        return -1;
    }

    final oq a(boolean bool) {
        if (bool != false)
            z = -80;
        v++;
        if (w == null) {
            cea.h[1] = r;
            cea.h[0] = z;
            cea.h[3] = B;
            cea.h[5] = n;
            fa var_fa = ((Class_r) y).j;
            cea.h[2] = q;
            cea.h[4] = x;
            boolean bool_4_ = false;
            int i = 0;
            for (int i_5_ = 0; i_5_ < 6; i_5_++) {
                if (!var_fa.a(false, cea.h[i_5_]))
                    return null;
                vca var_vca = var_fa.a(cea.h[i_5_], (byte) 86);
                int i_6_ = ((vca) var_vca).p ? 64 : 128;
                if (((vca) var_vca).g > 0)
                    bool_4_ = true;
                if (i < i_6_)
                    i = i_6_;
            }
            for (int i_7_ = 0; i_7_ < 6; i_7_++)
                er.c[i_7_] = var_fa.a(cea.h[i_7_], 1.0F, false, i, -5969, i);
            w = y.a(bool_4_, true, i, er.c);
        }
        return w;
    }

    /**
     * Unloads the native libraries. Called by the command (unloadnatives).
     * @return
     */
    public static boolean unloadNativeLibraries() {
        unloadNativeLibraries++;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration = pfa.hashtable.keys();
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            hashtable.put(object, pfa.hashtable.get(object));
        }
        try {
            Class accessibleObject = Class.forName("java.lang.reflect.AccessibleObject");
            Class classLoader = Class.forName("java.lang.ClassLoader");
            Field nativeLibraries = classLoader.getDeclaredField("nativeLibraries");
            Method setAccessible = accessibleObject.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
            setAccessible.invoke(nativeLibraries, new Object[]{Boolean.TRUE});
            try {
                enumeration = pfa.hashtable.keys();
                while (enumeration.hasMoreElements()) {
                    String string = (String) enumeration.nextElement();
                    try {
                        File file = (File) aea.hashtable.get(string);
                        Class class_ = (Class) pfa.hashtable.get(string);
                        Vector vector = ((Vector) nativeLibraries.get(class_.getClassLoader()));
                        for (int j = 0; vector.size() > j; j++) {
                            try {
                                Object object = vector.elementAt(j);
                                Field name = object.getClass().getDeclaredField("name");
                                setAccessible.invoke(name, new Object[]{Boolean.TRUE});
                                try {
                                    String string1 = (String) name.get(object);
                                    if (string1 != null && (string1.equalsIgnoreCase(file.getCanonicalPath()))) {
                                        Field handle = object.getClass().getDeclaredField("handle");
                                        Method finalize = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
                                        setAccessible.invoke(handle, (new Object[] {Boolean.TRUE}));
                                        setAccessible.invoke(finalize, (new Object[] {Boolean.TRUE}));
                                        try {
                                            finalize.invoke(object, new Object[0]);
                                            handle.set(object, new Integer(0));
                                            hashtable.remove(string);
                                        } catch (Throwable throwable) {
                                            /* empty */
                                        }
                                        setAccessible.invoke(finalize, (new Object[] {Boolean.FALSE}));
                                        setAccessible.invoke(handle, (new Object[] {Boolean.FALSE}));
                                    }
                                } catch (Throwable throwable) {
				                    /* empty */
                                }
                                setAccessible.invoke(name, new Object[]{Boolean.FALSE});
                            } catch (Throwable throwable) {
				                /* empty */
                            }
                        }
                    } catch (Throwable throwable) {
			            /* empty */
                    }
                }
            } catch (Throwable throwable) {
		        /* empty */
            }
            setAccessible.invoke(nativeLibraries, new Object[]{Boolean.FALSE});
        } catch (Throwable throwable) {
	    /* empty */
        }
        pfa.hashtable = hashtable;
        return pfa.hashtable.isEmpty();
    }

    rv(en var_en, int i, int i_16_, int i_17_, int i_18_, int i_19_,
       int i_20_) {
        n = i_20_;
        r = i_16_;
        z = i;
        x = i_19_;
        q = i_17_;
        y = var_en;
        B = i_18_;
    }

    static {
        o = new Class_ae();
        A = 0;
    }
}
