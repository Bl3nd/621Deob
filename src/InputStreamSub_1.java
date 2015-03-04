/* cca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStreamSub_1 extends InputStream
{
    static int a;
    static Object b;
    static int c;
    static Animable[][] d;
    static int e;
    
    public final int read() {
	Connection.a(-28448, 30000L);
	c++;
	return -1;
    }
    
    public static void a(int i) {
	d = null;
	b = null;
	if (i != -12902)
	    b = null;
    }
    
    static final wea[] a(boolean bool) {
	if (bool != true)
	    a(false);
	e++;
	return new wea[] { Connection.wea, dk.P, un.B, nj.j, jr.m, dh.c, oba.J, Class_gb.c,
			   gh.H, ha.s };
    }
    
    static final byte[] a(boolean bool, byte[] is) {
	a++;
	if (is == null)
	    return null;
	if (bool != true)
	    a(false, null);
	byte[] is_0_ = new byte[is.length];
	co.a(is, 0, is_0_, 0, is.length);
	return is_0_;
    }
}
