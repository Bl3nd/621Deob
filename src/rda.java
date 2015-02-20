/* rda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rda
{
    int a;
    static int b;
    static int width;
    int d;
    int e;
    int f = 128;
    static kj g;
    static int h = 0;
    static int i;
    int j;
    int k = 128;
    
    final rda a(int i) {
	if (i > -50)
	    ((rda) this).e = -39;
	b++;
	return new rda(((rda) this).e, ((rda) this).k, ((rda) this).f,
		       ((rda) this).d, ((rda) this).a, ((rda) this).j);
    }
    
    public static void b(int i) {
	if (i < -32)
	    g = null;
    }
    
    final void a(byte i, rda var_rda_0_) {
	((rda) this).f = ((rda) var_rda_0_).f;
	((rda) this).j = ((rda) var_rda_0_).j;
	((rda) this).a = ((rda) var_rda_0_).a;
	if (i != 110)
	    a(-78);
	((rda) this).e = ((rda) var_rda_0_).e;
	rda.i++;
	((rda) this).k = ((rda) var_rda_0_).k;
	((rda) this).d = ((rda) var_rda_0_).d;
    }
    
    rda(int i) {
	((rda) this).e = i;
    }
    
    private rda(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
	((rda) this).k = i_1_;
	((rda) this).j = i_5_;
	((rda) this).f = i_2_;
	((rda) this).d = i_3_;
	((rda) this).e = i;
	((rda) this).a = i_4_;
    }
    
    static {
	g = new kj();
    }
}
