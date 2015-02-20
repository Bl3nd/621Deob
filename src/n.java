/* Class_n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class n implements sn
{
    static int a;
    static int b;
    static int c;
    private pl d;
    static int e;
    static int f;
    static int g;
    static boolean h = false;
    static int i;
    static iaa[] j;
    static int k;
    static int l;
    private String m;
    
    public final int a(int i) {
	f++;
	if (d.a(false, m))
	    return 100;
	int i_0_ = -1 / ((-55 - i) / 49);
	return d.b(m, 60);
    }
    
    static final int a(byte i, int i_1_, int i_2_, int i_3_) {
	c++;
	i_2_ &= 0x3;
	if (i_2_ == 0)
	    return i_1_;
	if (i != -117)
	    j = null;
	if (i_2_ == 1)
	    return -i_3_ + 4095;
	if (i_2_ == 2)
	    return -i_1_ + 4095;
	return i_3_;
    }
    
    public final tj a(byte i) {
	if (i != -58)
	    e = -116;
	l++;
	return tj.f;
    }
    
    static final void a(String string, boolean bool) {
	k++;
	if (bool == true)
	    System.out.println("Error: " + ev.a(0, string, "%0a", "\n"));
    }
    
    public static void b(int i) {
	j = null;
	if (i != 0)
	    h = true;
    }
    
    static final dl a(boolean bool, Class_cb[] class_cbs, lm var_lm) {
	a++;
	if (bool != false)
	    b = -16;
	for (int i = 0; i < class_cbs.length; i++) {
	    if (class_cbs[i] == null || ((Class_cb) class_cbs[i]).a <= 0L)
		return null;
	}
	long l = OpenGL.glCreateProgramObjectARB();
	for (int i = 0; i < class_cbs.length; i++)
	    OpenGL.glAttachObjectARB(l, ((Class_cb) class_cbs[i]).a);
	OpenGL.glLinkProgramARB(l);
	OpenGL.glGetObjectParameterivARB(l, 35714, qg.q, 0);
	if (qg.q[0] == 0) {
	    if (qg.q[0] == 0)
		System.out.println("Shader linking failed:");
	    OpenGL.glGetObjectParameterivARB(l, 35716, qg.q, 1);
	    if (qg.q[1] > 1) {
		byte[] is = new byte[qg.q[1]];
		OpenGL.glGetInfoLogARB(l, qg.q[1], qg.q, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (qg.q[0] == 0) {
		for (int i = 0; class_cbs.length > i; i++)
		    OpenGL.glDetachObjectARB(l, ((Class_cb) class_cbs[i]).a);
		OpenGL.glDeleteObjectARB(l);
		return null;
	    }
	}
	return new dl(var_lm, l, class_cbs);
    }
    
    n(pl var_pl, String string) {
	m = string;
	d = var_pl;
    }
}
