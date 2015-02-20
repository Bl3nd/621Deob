/* er - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;
import java.util.Date;

final class er
{
    static int a;
    static int b;
    static int[][] c = new int[6][];
    static int d;
    /*synthetic*/ static Class e;
    /*synthetic*/ static Class f;
    
    static final String a(long l, byte i) {
	ru.gmtCalendar.setTime(new Date(l));
	b++;
	int i_0_ = ru.gmtCalendar.get(7);
	int i_1_ = ru.gmtCalendar.get(5);
	int i_2_ = ru.gmtCalendar.get(2);
	int i_3_ = ru.gmtCalendar.get(1);
	int i_4_ = ru.gmtCalendar.get(11);
	if (i <= 114)
	    return null;
	int i_5_ = ru.gmtCalendar.get(12);
	int i_6_ = ru.gmtCalendar.get(13);
	return (jq.n[i_0_ - 1] + ", " + i_1_ / 10 + i_1_ % 10 + "-"
		+ vea.shortMonthNames[i_2_] + "-" + i_3_ + " " + i_4_ / 10 + i_4_ % 10 + ":"
		+ i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10 + i_6_ % 10
		+ " GMT");
    }
    
    static final synchronized void a(int i) {
	a++;
	if (fn.l == null) {
	    try {
		if (i != -30983)
		    c = null;
		Class var_class
		    = Class.forName("java.lang.management.ManagementFactory");
		Method method
		    = var_class.getDeclaredMethod("getPlatformMBeanServer",
						  null);
		Object object = method.invoke(null, null);
		Method method_7_
		    = (var_class.getMethod
		       ("newPlatformMXBeanProxy",
			(new Class[]
			 { (Class.forName
			    ("javax.management.MBeanServerConnection")),
			   e != null ? e : (e = a("java.lang.String")),
			   f != null ? f : (f = a("java.lang.Class")) })));
		fn.l
		    = (method_7_.invoke
		       (null,
			(new Object[]
			 { object, "com.sun.management:type=HotSpotDiagnostic",
			   (Class.forName
			    ("com.sun.management.HotSpotDiagnosticMXBean")) })));
	    } catch (Exception exception) {
		System.out.println("HeapDump setup error:");
		exception.printStackTrace();
	    }
	}
    }
    
    public static void a(byte i) {
	if (i != -42)
	    a((int) -117);
	c = null;
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
