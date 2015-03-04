/* nh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nh
{
    int a;
    static int b;
    int c;
    oc[] d;
    static int e;
    static int f;
    static GameInPacket incomingPacket38 = new GameInPacket(38, 6);
    static int h;
    static GameInPacket setItemsByIndexGameInPacket;
    static long j = 20000000L;
    static int k;
    static String[] l;
    
    final void a(BytesParser var_es, byte i) {
	((nh) this).c = var_es.readTribyte(i ^ 0x4f);
	b++;
	((nh) this).a = var_es.readShort(13111);
	((nh) this).d = new oc[var_es.readUnsignedByte(-9268)];
	wea[] var_weas = InputStreamSub_1.a(true);
	if (i == -80) {
	    for (int i_0_ = 0; ((nh) this).d.length > i_0_; i_0_++)
		((nh) this).d[i_0_]
		    = a(var_weas[var_es.readUnsignedByte(-9268)], mv.a(i, (int) 30), var_es);
	}
    }
    
    private final oc a(wea var_wea, int i, BytesParser var_es) {
	h++;
	if (Connection.wea == var_wea)
	    return vm.a((byte) 121, var_es);
	if (dk.P == var_wea)
	    return ip.a(var_es, (byte) -101);
	if (var_wea == jr.m)
	    return iu.a(var_es, (byte) -117);
	if (var_wea == oba.J)
	    return ej.a((byte) 71, var_es);
	if (var_wea == dh.c)
	    return nda.a(var_es, 124);
	if (un.B == var_wea)
	    return kq.a(true, var_es);
	if (nj.j == var_wea)
	    return tda.a(var_es, 72);
	if (var_wea == Class_gb.c)
	    return tn.a(1023, var_es);
	if (var_wea == gh.H)
	    return Class_jg.a((byte) 108, var_es);
	if (i >= -73)
	    return null;
	if (ha.s == var_wea)
	    return pm.a(0, var_es);
	return null;
    }
    
    static final void a(int i, byte i_1_) {
	if (pj.j == 0)
	    ou.g.b(-118, i);
	else
	    uaa.e = i;
	e++;
	if (i_1_ != -119)
	    a(44, -53, -114);
    }
    
    public nh() {
	/* empty */
    }
    
    public static void a(int i) {
	incomingPacket38 = null;
	nh.setItemsByIndexGameInPacket = null;
	if (i != 65536)
	    a(-54);
	l = null;
    }
    
    static final boolean a(int i, int i_2_, int i_3_) {
	f++;
	int i_4_ = -58 / ((i_2_ + 45) / 59);
	if ((0x10000 & i_3_) == 0)
	    return false;
	return true;
    }
    
    static {
	setItemsByIndexGameInPacket = new GameInPacket(82, -2);
	l = new String[100];
    }
}
