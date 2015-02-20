/* cba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cba implements Runnable
{
    static int a;
    static int languageID = 0;
    static int c;
    Signlink d;
    volatile boolean e;
    static f[] f;
    volatile ah[] g = new ah[2];
    static int h;
    volatile boolean i;
    static GameInPacket j = new GameInPacket(57, 8);
    static int k;
    
    static final void a(int i) {
	a++;
	int i_0_ = -88 % ((i - 42) / 44);
	if (mga.s) {
	    while (vh.c < il.o.length) {
		WorldSub var_iw = il.o[vh.c];
		if (var_iw == null || ((WorldSub) var_iw).l != -1)
		    vh.c++;
		else {
		    if (fk.c == null)
			fk.c = Class_ag.i.a(((WorldSub) var_iw).m, 93);
		    int i_1_ = ((vm) fk.c).o;
		    if ((i_1_ ^ 0xffffffff) == 0)
			break;
		    fk.c = null;
		    vh.c++;
		    ((WorldSub) var_iw).l = i_1_;
		}
	    }
	}
    }
    
    public static void a(byte i) {
	f = null;
	j = null;
	if (i != -17)
	    a((byte) 59);
    }
    
    static final void b(int i) {
	k++;
	if (i == -17 && !sa.s) {
	    if (!((jb) cs.g).n)
		pda.J += (-pda.J - 12.0F) / 2.0F;
	    else
		pm.F = (float) ((int) pm.F - 17 & ~0xf);
	    sa.s = true;
	    mo.F = true;
	}
    }
    
    static final void a(int i, boolean bool, String string) {
	h++;
	oba.a("", string, i, -1, "", 0, "");
	if (bool != false)
	    f = null;
    }
    
    public final void run() {
	((cba) this).i = true;
	c++;
	try {
	    while (!((cba) this).e) {
		for (int i = 0; i < 2; i++) {
		    ah var_ah = ((cba) this).g[i];
		    if (var_ah != null)
			var_ah.a(-26789);
		}
		Connection.a(-28448, 10L);
		Class_q.a(((cba) this).d, (byte) -50, null);
	    }
	} catch (Exception exception) {
	    cea.a(null, -2, exception);
	} finally {
	    ((cba) this).i = false;
	}
    }
    
    cba() {
	((cba) this).e = false;
	((cba) this).i = false;
    }
}
