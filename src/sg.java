/* sg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

final class sg
{
    static int[] a = new int[256];
    static int b;
    static float c;
    static Clipboard d;
    
    public static void a(int i) {
	if (i != 256)
	    d = null;
	a = null;
	d = null;
    }
    
    static final String a(byte i, String string) {
	if (i > -59)
	    a(88);
	b++;
	if (hk.operatingSystem.startsWith("win"))
	    return string + ".dll";
	if (!hk.operatingSystem.startsWith("linux")) {
	    if (hk.operatingSystem.startsWith("mac"))
		return "lib" + string + ".dylib";
	} else
	    return "lib" + string + ".so";
	return null;
    }
}
