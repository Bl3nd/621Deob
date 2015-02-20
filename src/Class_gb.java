/* gb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_gb
{
    static int a;
    static int b;
    static wea c = new wea(7, 2);
    private static short[] d = { 957, 20418, -21587, 11209, -10300 };
    private static short[] e;
    static short[][] f;
    private static short[] g = { 962, 20423, -21582, 11214, -10295 };
    static boolean h;
    private static short[] i;
    
    public final String toString() {
	a++;
	throw new IllegalStateException();
    }
    
    public static void a(byte i) {
	e = null;
	if (i < 60)
	    a((byte) 59);
	d = null;
	c = null;
	Class_gb.i = null;
	g = null;
	f = null;
    }
    
    static final ro[] a(Signlink var_rj, int i) {
	b++;
	if (!var_rj.a(false))
	    return new ro[0];
	vfa var_vfa = var_rj.a((byte) -96);
	while (var_vfa.f == 0)
	    Connection.a(-28448, 10L);
	if (var_vfa.f == 2)
	    return new ro[0];
	int[] is = (int[]) var_vfa.hostName;
	ro[] var_ros = new ro[is.length >> 2];
	if (i <= 114)
	    a((byte) 5);
	for (int i_0_ = 0; i_0_ < var_ros.length; i_0_++) {
	    ro var_ro = new ro();
	    var_ros[i_0_] = var_ro;
	    ((ro) var_ro).d = is[i_0_ << 2];
	    ((ro) var_ro).a = is[(i_0_ << 2) + 1];
	    ((ro) var_ro).f = is[(i_0_ << 2) + 2];
	    ((ro) var_ro).b = is[(i_0_ << 2) + 3];
	}
	return var_ros;
    }
    
    public Class_gb() {
	/* empty */
    }
    
    static {
	e = new short[] { 967, 20428, -21577, 11219, -10290 };
	h = false;
	i = new short[] { 952, 20413, -21592, 11204, -10305 };
	f = new short[][] { e, g, d, i };
    }
}
