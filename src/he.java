/* he - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class he
{
    int a;
    int b;
    static int c;
    static sc[] d = new sc[100];
    int e;
    static int f;
    static int g;
    static int h;
    static int i;
    static int j;
    static int k;
    
    static final void a(long l, byte i) {
	try {
	    Thread.sleep(l);
	    int i_0_ = 105 % ((i + 40) / 33);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	h++;
    }
    
    final boolean a(int i) {
	if (i != 2)
	    ((he) this).a = 119;
	f++;
	if ((0x2 & ((he) this).e) == 0)
	    return false;
	return true;
    }
    
    final boolean b(int i) {
	c++;
	if (i != 29342)
	    b((int) 48);
	if ((((he) this).e & 0x8) == 0)
	    return false;
	return true;
    }
    
    public he() {
	/* empty */
    }
    
    final boolean a(byte i) {
	he.i++;
	if (i <= 28)
	    c((int) -50);
	if ((((he) this).e & 0x1) == 0)
	    return false;
	return true;
    }
    
    final boolean b(byte i) {
	if (i >= -97)
	    ((he) this).e = 55;
	k++;
	if ((((he) this).e & 0x4) == 0)
	    return false;
	return true;
    }
    
    static final void c(byte i) {
	j++;
	if (i > 28 && !cf.u) {
	    fp.a(ws.I, -6429);
	    if (fg.e != null)
		fp.a(fg.e, -6429);
	    cf.u = true;
	}
    }
    
    static final void c(int i) {
	g++;
	sl.j = bea.o;
	jr.w = new hv[500];
	Class_mb.Y = new hv[i];
	cda.b = 0;
	sr.R = 0;
	ui.n = new hv[500];
	vu.j = 0;
	bfa.D = 0;
	ega.k = new int[dfa.G][sv.T + 1][nf.H + 1];
	js.o = false;
	Class_ob.p = new hv[2000];
	mh.k = bea.o;
	if (!(nda.k instanceof l))
	    il.k = true;
	else
	    il.k = false;
    }
    
    public static void d(int i) {
	if (i != 15223)
	    a(46L, (byte) 6);
	d = null;
    }
}
