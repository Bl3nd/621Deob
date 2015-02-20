/* dq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dq
{
    static GameInPacket incomingPacket43;
    static int b;
    static int[] c = { -1, -1, 1, 1 };
    static long d;
    static boolean e;
    static int f;
    
    static final void a(boolean bool, String string, int i, String string_0_) {
	b++;
	jb.o = bool;
	Interface.password = string;
	op.username = string_0_;
	if (!jb.o && jl.s != 3 && (op.username.equals("") || Interface.password.equals("")))
	    fda.a((byte) 60, 3);
	else {
	    if (jl.s != 1) {
		ip.T = -1;
		nc.m = 0;
	    }
	    cm.K = false;
	    int i_1_ = 61 % ((-29 - i) / 63);
	    fda.a((byte) 70, -3);
	    km.q = 0;
	    hk.loginStage = 1;
	    rv.p = 0;
	}
    }
    
    static final Class_pd a(BytesParser var_es, boolean bool) {
	if (bool != false)
	    return null;
	f++;
	return new Class_pd(var_es.readShort2(96), var_es.readShort2(108), var_es.readShort2(78),
			    var_es.readShort2(82), var_es.readTribyte(-1), var_es.readTribyte(-1),
			    var_es.readUnsignedByte(-9268));
    }
    
    public static void a(byte i) {
	if (i != -43)
	    a(true, null, 21, null);
	c = null;
	incomingPacket43 = null;
    }
    
    static {
	incomingPacket43 = new GameInPacket(43, 4);
	d = 0L;
	e = false;
    }
}
