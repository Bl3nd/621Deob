/* aq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

final class aq
{
    static final Class_r a(int i, pl var_pl, Canvas canvas, fa var_fa, int i_0_) {
		if (!pu.b(false))
		    throw new RuntimeException("");
		if (!Class_ue.a("jagdx", -82))
		    throw new RuntimeException("");
		try {
			Class var_class = Class.forName("gaa");
			if (i > -68)
			    return null;
			Method method
			    = (var_class.getDeclaredMethod
			       ("createToolkit",
				new Class[] { Class.forName("java.awt.Canvas"),
					      Class.forName("fa"), Class.forName("pl"),
					      Class.forName("java.lang.Integer") }));
			return ((Class_r)
				method.invoke(
						null, 
						new Object[] { 
						canvas, 
						var_fa, 
						var_pl, 
						new Integer(i_0_) }));
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
