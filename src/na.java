/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class na extends OutputStream
{
    static int a;
    static int b;
    static int c;
    static float d;
    static long e = (long) (Math.random() * 9.999999999E9);
    static float f;
    static String[] g;
    
    public static void a(int i) {
	if (i != -252896726)
	    a(71);
	g = null;
    }
    
    static final int a(int i, int i_0_) {
	c++;
	if (i_0_ != -252896726)
	    e = -20L;
	return i >>> 10;
    }
    
    static final ega b(int i, int i_1_) {
	a++;
	if (i_1_ <= 89)
	    g = null;
	ega var_ega = new ega(i, false);
	return var_ega;
    }
    
    public final void write(int i) throws IOException {
	b++;
	throw new IOException();
    }
}
