/* ag - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ag
{
    int a;
    private int b;
    qn c;
    static int d;
    static int e;
    static int f;
    int g;
    static lea h = new lea();
    static maa i = new maa();
    static GameOutPacket j;
    static String k = null;
    static int l;
    
    final void a(int i, BytesParser var_es) {
	e++;
	for (;;) {
	    int i_0_ = var_es.readUnsignedByte(-9268);
	    if (i_0_ == 0)
		break;
	    a(var_es, -100, i_0_);
	}
	int i_1_ = -20 / ((i - 48) / 51);
    }
    
    private final void a(BytesParser var_es, int i, int i_2_) {
	if (i_2_ == 1)
	    b = var_es.readShort(13111);
	else if (i_2_ == 2) {
	    ((Class_ag) this).g = var_es.readUnsignedByte(-9268);
	    ((Class_ag) this).a = var_es.readUnsignedByte(-9268);
	}
	if (i >= -67)
	    j = null;
	f++;
    }
    
    public static void a(int i) {
	if (i != 0)
	    j = null;
	k = null;
	Class_ag.i = null;
	j = null;
	h = null;
    }
    
    public Class_ag() {
	/* empty */
    }
    
    final synchronized aga b(int i) {
	d++;
	aga var_aga = (aga) ((qn) ((Class_ag) this).c).n.get((long) b, (byte) 100);
	if (i != -1)
	    return null;
	if (var_aga != null)
	    return var_aga;
	var_aga = aga.a(((qn) ((Class_ag) this).c).h, b, 0);
	if (var_aga != null)
	    ((qn) ((Class_ag) this).c).n.put((long) b, var_aga, i ^ ~0x1);
	return var_aga;
    }
    
    static {
	j = new GameOutPacket(35, 3);
	l = 0;
    }
}
