/* fm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

abstract class fm
{
    static int a = 0;
    static int b = 0;
    static float c;
    static int d;
    static int e;
    static int[] f;
    static int g;
    static int h;
    static int i;
    
    abstract int a(byte i, int i_0_, byte[] is, int i_1_) throws IOException;
    
    abstract void a(int i);
    
    abstract void a(byte[] is, int i, int i_2_, byte i_3_) throws IOException;
    
    public fm() {
	/* empty */
    }
    
    static final tda[] a(boolean bool) {
	h++;
	if (bool != false)
	    c(-126);
	return new tda[] { Class_j.g, ol.j, la.m };
    }
    
    abstract boolean a(int i, byte i_4_) throws IOException;
    
    public static void b(int i) {
	f = null;
	if (i != 14828)
	    c(-84);
    }
    
    static final fh[] c(int i) {
	if (i != 0)
	    c(-25);
	d++;
	return new fh[] { pca.s, dv.a, te.B, os.j, pk.c, Class_nd.k, gv.e,
			  sr.K, bh.z, im.n, sca.k, cd.m, hv.s, ln.e, gl.Q };
    }
    
    abstract void d(int i);
}
