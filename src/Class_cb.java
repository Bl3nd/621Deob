/* Class_cb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_cb
{
    long a;
    static int b;
    static int c;
    private lm d;
    static GameOutPacket e = new GameOutPacket(27, 8);
    static int f;
    static int g = -1;
    
    protected final void finalize() throws Throwable {
	d.a(true, ((Class_cb) this).a);
	c++;
	super.finalize();
    }
    
    Class_cb(lm var_lm, long l, int i) {
	((Class_cb) this).a = l;
	d = var_lm;
    }
    
    static final boolean interfacePacketCounterCheck(int counter, int i_0_) {
	qs.a = counter + 1 & i_0_;
	fg.d = true;
	b++;
	return true;
    }
    
    public static void a(int i) {
	e = null;
	if (i != 65535)
	    interfacePacketCounterCheck(123, 75);
    }
}
