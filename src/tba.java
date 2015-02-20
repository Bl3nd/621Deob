/* tba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tba extends Node
{
    LoginStream loginStream;
    GameOutPacket l;
    int m;
    static long[][][] n;
    static int o;
    static int p;
    static int q;
    static int r = 0;
    int s;
    
    final void a(byte i) {
	q++;
	if (mr.d < rd.J.length) {
	    if (i >= -42)
		((tba) this).loginStream = null;
	    rd.J[mr.d++] = this;
	}
    }
    
    public static void a(int i) {
	int i_0_ = -99 / ((i + 50) / 61);
	n = null;
    }
    
    static final void b(int i) {
	synchronized (bd.j) {
	    bd.j.c((byte) -121);
	}
	p++;
	if (i == -1) {
	    synchronized (Class_ad.k) {
		Class_ad.k.c((byte) -120);
	    }
	}
    }
    
    static final void b(byte i) {
	if (i >= -80)
	    n = null;
	o++;
	pda.y = -1;
	jl.s = 1;
	long l = 0L;
	if (uo.ssKey == null)
	    fda.a((byte) 52, 35);
	else {
	    BytesParser var_es = new BytesParser(uf.a(fu.a((byte) 100, uo.ssKey), 16));
	    l = var_es.readLong(false);
	    bba.S = var_es.readLong(false);
	    dq.a(true, "", -106, kba.a((byte) -127, l));
	}
    }
}
