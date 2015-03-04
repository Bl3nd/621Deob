/* nk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nk
{
    static int a = 2;
    private pl b;
    static int c;
    private tb d = new tb(16);
    static int e;
    static int f;
    static pl g;
    static int h;
    static WorldSub[] i;
    static int j;
    
    final void a(byte i) {
	synchronized (d) {
	    d.a(18385);
	}
	if (i <= 119)
	    g = null;
	f++;
    }
    
    final void b(byte i) {
	synchronized (d) {
	    d.c((byte) -128);
	}
	int i_0_ = 91 / ((-11 - i) / 36);
	j++;
    }
    
    final void a(int i, byte i_1_) {
	h++;
	synchronized (d) {
	    d.a(true, i);
	}
	int i_2_ = -100 % ((-11 - i_1_) / 36);
    }
    
    static final void a(byte i, ej var_ej) {
	((ej) var_ej).k = null;
	c++;
	if (i == -45) {
	    if (uba.m < 20) {
		aj.fca.a(var_ej, 103);
		uba.m++;
	    }
	}
    }
    
    public static void a(int i) {
	if (i == 30) {
	    nk.i = null;
	    g = null;
	}
    }
    
    final dba a(int i, int i_3_) {
	e++;
	dba var_dba;
	synchronized (d) {
	    var_dba = (dba) d.get((long) i, (byte) 100);
	}
	if (var_dba != null)
	    return var_dba;
	byte[] is;
	synchronized (b) {
	    if (i_3_ != -27456)
		g = null;
	    is = b.b(i, i_3_ + 27354, 30);
	}
	var_dba = new dba();
	if (is != null)
	    var_dba.a(-1, new BytesParser(is));
	synchronized (d) {
	    d.put((long) i, var_dba, 1);
	}
	return var_dba;
    }
    
    nk(Class_rf class_rf, int i, pl var_pl) {
	b = var_pl;
	b.a(30, true);
    }
}
