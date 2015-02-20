/* kea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

import jaggl.OpenGL;

final class kea extends Canvas
{
    static int a;
    private Component b;
    static int c;
    static int d;
    static int e;
    static GameOutPacket f = new GameOutPacket(34, 3);
    static GameOutPacket g = new GameOutPacket(47, 3);
    static GameInPacket incomingPacket80 = new GameInPacket(80, 0);
    static Class_r i;
    
    static final laa a(af[] var_afs, qj var_qj, int i) {
	a++;
	for (int i_0_ = 0; i_0_ < var_afs.length; i_0_++) {
	    if (var_afs[i_0_] == null || ((af) var_afs[i_0_]).d <= 0L)
		return null;
	}
	long l = OpenGL.glCreateProgramObjectARB();
	for (int i_1_ = 0; i_1_ < var_afs.length; i_1_++)
	    OpenGL.glAttachObjectARB(l, ((af) var_afs[i_1_]).d);
	OpenGL.glLinkProgramARB(l);
	OpenGL.glGetObjectParameterivARB(l, 35714, ge.P, 0);
	if (ge.P[0] == i) {
	    if (ge.P[0] == 0)
		System.out.println("Shader linking failed:");
	    OpenGL.glGetObjectParameterivARB(l, 35716, ge.P, 1);
	    if (ge.P[1] > 1) {
		byte[] is = new byte[ge.P[1]];
		OpenGL.glGetInfoLogARB(l, ge.P[1], ge.P, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (ge.P[0] == 0) {
		for (int i_2_ = 0; i_2_ < var_afs.length; i_2_++)
		    OpenGL.glDetachObjectARB(l, ((af) var_afs[i_2_]).d);
		OpenGL.glDeleteObjectARB(l);
		return null;
	    }
	}
	return new laa(var_qj, l, var_afs);
    }
    
    kea(Component component) {
	b = component;
    }
    
    public final void update(Graphics graphics) {
	b.update(graphics);
	d++;
    }
    
    static final void a(boolean bool, byte i, int i_3_, int i_4_, int i_5_) {
	cga.v = 0L;
	c++;
	int i_6_ = ia.g(i ^ 0x13);
	if (i_5_ == 3 || i_6_ == 3)
	    bool = true;
	if (!lg.r.B())
	    bool = true;
	oba.a(i_6_, i_4_, bool, -101, i_3_, i_5_);
	if (i != 126)
	    kea.i = null;
    }
    
    public final void paint(Graphics graphics) {
	b.paint(graphics);
	e++;
    }
    
    public static void a(int i) {
	if (i == 0) {
	    g = null;
	    kea.i = null;
	    incomingPacket80 = null;
	    f = null;
	}
    }
}
