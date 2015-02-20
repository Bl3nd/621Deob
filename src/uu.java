/* uu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.InputStream;

final class uu extends InputStream
{
    static int a;
    static int[][] b
	= { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 },
	    { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 },
	    { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 },
	    { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
    static int c;
    
    public static void a(int i) {
	if (i <= 97)
	    a((int) 63);
	b = null;
    }
    
    public final int read() {
	a++;
	Connection.a(-28448, 30000L);
	return -1;
    }
    
    static final void a(byte i) throws IOException {
	if (ce.y != null && qt.y > 0) {
	    int i_0_ = 0;
	    for (;;) {
			tba var_tba = (tba) SpecialOutPacket.d.a((int) 91);
			if (var_tba == null)
			    break;
			ce.y.a(((BytesParser) ((tba) var_tba).loginStream).bytes, 0, ((tba) var_tba).m, (byte) 116);
			qt.y -= ((tba) var_tba).m;
			i_0_ += ((tba) var_tba).m;
			var_tba.unlink(-96);
			((tba) var_tba).loginStream.d((byte) -122);
			var_tba.a((byte) -120);
	    }
	    nc.n = 0;
	    ka.b += i_0_;
	}
	c++;
	if (i < 78)
	    b = null;
    }
}
