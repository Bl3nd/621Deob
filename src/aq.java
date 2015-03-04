/* aq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.lang.reflect.Method;

public final class aq {

    public static Class_r createToolkit(pl pl, Canvas canvas, fa fa, int j) {
        if (!pu.b(false)) {
            throw new RuntimeException("");
        }
        if (!Class_ue.a("jagdx", -82)) {
            throw new RuntimeException("");
        }
        try {
            Class gaa = Class.forName("gaa");
            Method createToolkit = (gaa.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"),
                    Class.forName("fa"), Class.forName("pl"), Class.forName("java.lang.Integer")}));
            return ((Class_r) createToolkit.invoke(null, new Object[]{ canvas, fa, pl, new Integer(j)}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
