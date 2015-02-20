/* be - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class be extends ah
{
    private int F;
    private static rl G;
    
    final void d(int i) throws Exception {
	if (i > 32768)
	    throw new IllegalArgumentException();
	G.a(false, i, F);
    }
    
    final void c() {
	G.b(F, 127);
    }
    
    final void a() {
	G.a(-123, F);
    }
    
    public static void e() {
	G = null;
    }
    
    final int b() {
	return G.c(116, F);
    }
    
    be(Signlink var_rj, int i) {
	G = (rl) var_rj.b((byte) -117);
	F = i;
    }
    
    final void d() {
	G.a(F, ((ah) this).k);
    }
    
    final void a(Component component) throws Exception {
	G.a(component, gba.G, wq.p, -1);
    }
}
