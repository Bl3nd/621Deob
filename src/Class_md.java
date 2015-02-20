/* Class_md - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_md
{
    static int[] a = new int[2];
    private pl b;
    private tb c = new tb(128);
    static int d;
    static of e;
    static GameOutPacket f = new GameOutPacket(17, 8);
    static f g;
    static int h = 0;
    static int i;
    static int j;
    
    final ss a(int i, int i_0_) {
	d++;
	ss var_ss;
	synchronized (c) {
	    if (i_0_ != -8727)
		Class_md.i = -78;
	    var_ss = (ss) c.get((long) i, (byte) 100);
	}
	if (var_ss != null)
	    return var_ss;
	byte[] is = b.b(Class_jg.b(255, i), 113, pr.a(-46, i));
	var_ss = new ss();
	if (is != null)
	    var_ss.a(new BytesParser(is), (byte) -67);
	synchronized (c) {
	    c.put((long) i, var_ss, i_0_ + 8728);
	}
	return var_ss;
    }
    
    public static void a(boolean bool) {
	a = null;
	if (bool != false)
	    i = -100;
	f = null;
	g = null;
	e = null;
    }
    
    Class_md(Class_rf class_rf, int i, pl var_pl) {
	b = var_pl;
	if (b != null) {
	    int i_1_ = b.a((byte) -107) - 1;
	    b.a(i_1_, true);
	}
    }
}
