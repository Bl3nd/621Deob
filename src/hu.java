/* hu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hu
{
    static int a;
    static int[] b = { 16, 32, 64, 128 };
    static f[] c;
    static int d;
    static int e;
    static int f;
    private pl g;
    private tb h = new tb(16);
    static int i;
    static GameInPacket incomingPacket114 = new GameInPacket(114, -2);
    static int k;
    static Class_hc l;
    static int m;
    
    public static void a(byte i) {
	if (i == 12) {
	    b = null;
	    incomingPacket114 = null;
	    l = null;
	    c = null;
	}
    }
    
    final void b(byte i) {
	m++;
	synchronized (h) {
	    h.a(18385);
	    if (i != -104)
		a((byte) -62);
	}
    }
    
    final tw a(nk var_nk, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	d++;
	raa[] var_raas = null;
	tv var_tv = a(i_3_, 29);
	if (i_2_ != -29532)
	    return null;
	if (((tv) var_tv).f != null) {
	    var_raas = new raa[((tv) var_tv).f.length];
	    for (int i_4_ = 0; i_4_ < var_raas.length; i_4_++) {
		dba var_dba = var_nk.a(((tv) var_tv).f[i_4_], i_2_ ^ 0x1864);
		var_raas[i_4_] = new raa(((dba) var_dba).g, ((dba) var_dba).f,
					 ((dba) var_dba).m, ((dba) var_dba).o,
					 ((dba) var_dba).i, ((dba) var_dba).p,
					 ((dba) var_dba).e, ((dba) var_dba).j);
	    }
	}
	return new tw(((tv) var_tv).a, var_raas, ((tv) var_tv).b, i, i_0_,
		      i_1_);
    }
    
    final void c(byte i) {
	synchronized (h) {
	    h.c((byte) 8);
	    if (i != 13)
		l = null;
	}
	hu.i++;
    }
    
    static final int a(byte[] is, byte i, int i_5_) {
	if (i != -95)
	    incomingPacket114 = null;
	k++;
	return oea.a(255, 0, is, i_5_);
    }
    
    final void a(byte i, int i_6_) {
	if (i != -54)
	    a((int) -124, -111);
	a++;
	synchronized (h) {
	    h.a(true, i_6_);
	}
    }
    
    private final tv a(int i, int i_7_) {
	f++;
	tv var_tv;
	synchronized (h) {
	    var_tv = (tv) h.get((long) i, (byte) 100);
	}
	if (var_tv != null)
	    return var_tv;
	byte[] is;
	synchronized (g) {
	    is = g.b(i, -106, i_7_);
	}
	var_tv = new tv();
	if (is != null)
	    var_tv.a(new BytesParser(is), i_7_ ^ 0x1d);
	synchronized (h) {
	    h.put((long) i, var_tv, 1);
	}
	return var_tv;
    }
    
    hu(Class_rf class_rf, int i, pl var_pl) {
	g = var_pl;
	g.a(29, true);
    }
}
