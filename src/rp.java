/* rp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

final class rp
{
    static final void a(String string, byte i, Applet applet)
	throws Throwable {
	int i_0_ = 39 / ((i + 29) / 35);
	JSObject.getWindow(applet).eval(string);
    }
    
    static final Object a(Applet applet, String string, Object[] objects,
			  int i) throws Throwable {
	if (i != 1164)
	    return null;
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    static final Object a(boolean bool, String string, Applet applet)
	throws Throwable {
	if (bool != true)
	    return null;
	return JSObject.getWindow(applet).call(string, null);
    }
}
