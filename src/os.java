/* os - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

class os extends nfa
{
    static int g;
    static int h;
    static Color[] i = { new Color(9179409), new Color(3289650) };
    static fh j = new fh(3, 7);
    static GameInPacket incomingPacket83 = new GameInPacket(83, 4);
    static int[] l;
    
    static final void b(int i) {
	tn.j = new vt[i];
	g++;
	je.i = 0;
    }
    
    static final void a(Interface var_kp, int i) {
	h++;
	if (((Interface) var_kp).v == sr.P) {
	    if (((Player) up.thisPlayer).displayName == null) {
		((Interface) var_kp).modelID = 0;
		((Interface) var_kp).U = 0;
	    } else {
		((Interface) var_kp).modelRotationX = 150;
		((Interface) var_kp).modelRotationY
		    = 0x7ff & (int) (Math.sin((double) pm.currentTimedTicks / 40.0) * 256.0);
		((Interface) var_kp).modelID = ih.n;
		((Interface) var_kp).modelType = 5;
		((Interface) var_kp).U = hl.a(((Player) up.thisPlayer).displayName, false);
		((Interface) var_kp).rc = ((Entity) up.thisPlayer).hc;
		((Interface) var_kp).V = ((Entity) up.thisPlayer).Bc;
		((Interface) var_kp).R = 0;
		((Interface) var_kp).s = ((Entity) up.thisPlayer).Ib;
		dr var_dr = (((Interface) var_kp).V != -1
			     ? Class_ef.J.c(64, ((Interface) var_kp).V) : null);
		if (var_dr != null)
		    cea.a(var_dr, (byte) 125, ((Interface) var_kp).s);
	    }
	} else if (i < 68)
	    j = null;
    }
    
    public static void a(boolean bool) {
	j = null;
	l = null;
	i = null;
	incomingPacket83 = null;
	if (bool != false)
	    i = null;
    }
}
