/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

final class aa extends Node
{
    static int k;
    static GameInPacket incomingPacket113;
    String m;
    static int n = 0;
    static Interface[][] o;
    
    public static void a(int i) {
	if (i != 0)
	    a(null, null, 68, (byte) 30, null);
	incomingPacket113 = null;
	o = null;
    }
    
    static final Class_r a(fa var_fa, Canvas canvas, int i, byte i_0_,
			   pl var_pl) {
	if (i_0_ > -6)
	    return null;
	k++;
	if (!pu.b(false))
	    throw new RuntimeException("");
	if (!Class_ue.a("jaggl", -84))
	    throw new RuntimeException("");
	OpenGL opengl = new OpenGL();
	long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
	if (l == 0L)
	    throw new RuntimeException("");
	lm var_lm = new lm(opengl, canvas, l, var_fa, var_pl, i);
	var_lm.s((byte) -100);
	return var_lm;
    }
    
    public aa() {
	/* empty */
    }
    
    aa(String string) {
	((aa) this).m = string;
    }
    
    static {
	incomingPacket113 = new GameInPacket(113, 1);
    }
}
