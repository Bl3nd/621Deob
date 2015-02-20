/* mk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class mk implements oc
{
    int a;
    static int b;
    static int c;
    static int d;
    static int e = -1;
    static int[] f = new int[13];
    
    public final wea a(int i) {
	if (i < 38)
	    return null;
	b++;
	return gh.H;
    }
    
    mk(int i) {
	((mk) this).a = i;
    }
    
    static final af a(byte i, qj var_qj, int i_0_, String string) {
	c++;
	long l = OpenGL.glCreateShaderObjectARB(i_0_);
	OpenGL.glShaderSourceARB(l, string);
	OpenGL.glCompileShaderARB(l);
	if (i <= 84)
	    a(true);
	OpenGL.glGetObjectParameterivARB(l, 35713, Interactable.c, 0);
	if (Interactable.c[0] == 0) {
	    if (Interactable.c[0] == 0)
		System.out.println("Shader compile failed:");
	    OpenGL.glGetObjectParameterivARB(l, 35716, Interactable.c, 1);
	    if (Interactable.c[1] > 1) {
		byte[] is = new byte[Interactable.c[1]];
		OpenGL.glGetInfoLogARB(l, Interactable.c[1], Interactable.c, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (Interactable.c[0] == 0) {
		OpenGL.glDeleteObjectARB(l);
		return null;
	    }
	}
	return new af(var_qj, l, i_0_);
    }
    
    public static void a(boolean bool) {
	f = null;
	if (bool != false)
	    a(true);
    }
    
    static final int a(int i, boolean bool, int i_1_, int i_2_) {
	if (bool != true)
	    f = null;
	d++;
	i_1_ = (~0xff00ff & (0xff00ff & i_1_) * i
		| 0xff0000 & i * (i_1_ & 0xff00)) >>> 8;
	int i_3_ = -i + 255;
	return i_1_ + (((0xff00ff & i_2_) * i_3_ & ~0xff00ff
			| 0xff0000 & i_3_ * (0xff00 & i_2_))
		       >>> 8);
    }
}
