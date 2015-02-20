/* dda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dda
{
    static int a;
    static int b;
    static int c;
    static mv d = new mv();
    static int e;
    static int f;
    static int g;
    private fca h = new fca();
    String i;
    static float j;
    private volatile int k;
    private wda l;
    
    final void a(Animable var_lo, byte i) {
	((Animable) var_lo).i = true;
	g++;
	synchronized (h) {
	    h.a(var_lo, 78);
	    if (i != 87)
		return;
	    k++;
	}
	if (l != null) {
	    synchronized (l) {
		l.notify();
	    }
	}
    }
    
    final void a(boolean bool, Animable var_lo) {
	a++;
	((Animable) var_lo).i = false;
	synchronized (h) {
	    h.a(var_lo, 41);
	    k++;
	}
	if (l != null) {
	    synchronized (l) {
		l.notify();
	    }
	}
	if (bool != true)
	    k = -81;
    }
    
    public static void a(int i) {
	if (i == 25860)
	    d = null;
    }
    
    final Interactable b(int i) {
	int i_0_ = -113 / ((38 - i) / 40);
	f++;
	Object object = null;
	Interactable var_fga;
	synchronized (h) {
	    var_fga = h.b((byte) 94);
	    var_fga.b(2);
	    k--;
	}
	return var_fga;
    }
    
    final void a(byte i, wu var_wu) {
	c++;
	synchronized (h) {
	    h.a(var_wu, 62);
	    k++;
	}
	if (i != -32)
	    b(-8);
	if (l != null) {
	    synchronized (l) {
		l.notify();
	    }
	}
    }
    
    final void a(int i, wda var_wda) {
	l = var_wda;
	b++;
	if (i >= -66)
	    b(-19);
    }
    
    final boolean c(int i) {
	int i_1_ = -105 % ((-39 - i) / 59);
	e++;
	if (k != 0)
	    return false;
	return true;
    }
    
    dda(String string) {
	((dda) this).i = string;
    }
}
