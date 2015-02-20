/* iba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class iba
{
    private static boolean a = false;
    private static Class_ae b;
    private static int c = 0;
    
    static final synchronized void a(boolean bool, byte i) {
	a = bool;
	if (i != -28)
	    c = -14;
    }
    
    static final synchronized void a(p var_p, byte i) {
	int i_0_ = 76 % ((-18 - i) / 37);
	if (!a) {
	    if (c <= 0)
		var_p.UA(false);
	    else {
		tca var_tca = new tca();
		((tca) var_tca).k = var_p;
		b.b(var_tca, (byte) 93);
	    }
	}
    }
    
    static final synchronized void a(int i) {
	c--;
	if (c == i)
	    b(-5175);
    }
    
    static final synchronized void a(byte i) {
	c++;
	if (i != -75)
	    a((p) null, (byte) -102);
    }
    
    static final synchronized void b(int i) {
	for (;;) {
	    tca var_tca = (tca) b.a(true);
	    if (var_tca == null)
		break;
	    ((tca) var_tca).k.UA(true);
	    var_tca.unlink(-57);
	}
	if (i != -5175)
	    b(-112);
    }
    
    static {
	b = new Class_ae();
    }
}
