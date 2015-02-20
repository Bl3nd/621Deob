/* wea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class wea
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    int f;
    
    static final void a(int i, int i_0_, int i_1_, byte i_2_) {
	d++;
	qba var_qba = ofa.a(11, i_0_, (byte) 120);
	int i_3_ = -26 % ((-18 - i_2_) / 44);
	var_qba.c((byte) 11);
	((qba) var_qba).t = i_1_;
	((qba) var_qba).v = i;
    }
    
    static final Class_r a(fa var_fa, Canvas canvas, byte i) {
	if (i != -25)
	    return null;
	e++;
	return new nga(canvas, var_fa);
    }
    
    static final boolean a(String string, int i) {
	a++;
	if (string == null)
	    return false;
	if (i >= -70)
	    return true;
	for (int i_4_ = 0; i_4_ < rba.l; i_4_++) {
	    if (string.equalsIgnoreCase(lfa.f[i_4_]))
		return true;
	}
	if (string.equalsIgnoreCase(((Player) up.thisPlayer).displayName))
	    return true;
	return false;
    }
    
    static final int a(Player var_qi, boolean bool) {
	b++;
	int i = ((Player) var_qi).fd;
	cg var_cg = var_qi.k(32195);
	if (bool != false)
	    a(85, -13, 52, (byte) -42);
	if (((Entity) var_qi).V)
	    i = ((Player) var_qi).Rc;
	else if (((Entity) var_qi).Bc != ((cg) var_cg).h
		 && ((Entity) var_qi).Bc != ((cg) var_cg).g
		 && ((cg) var_cg).X != ((Entity) var_qi).Bc
		 && ((cg) var_cg).M != ((Entity) var_qi).Bc) {
	    if (((cg) var_cg).j == ((Entity) var_qi).Bc
		|| ((cg) var_cg).e == ((Entity) var_qi).Bc
		|| ((Entity) var_qi).Bc == ((cg) var_cg).u
		|| ((cg) var_cg).m == ((Entity) var_qi).Bc)
		i = ((Player) var_qi).yd;
	} else
	    i = ((Player) var_qi).jd;
	return i;
    }
    
    public final String toString() {
	c++;
	throw new IllegalStateException();
    }
    
    wea(int i, int i_5_) {
	((wea) this).f = i_5_;
    }
}
