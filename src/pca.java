/* pca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class pca extends pp implements nca
{
    static fh s = new fh(0, 16);
    static int t;
    static int u;
    static int v;
    private int w = -1;
    static ISAAC isaac;
    int y;
    private int z = -1;
    private int A;
    static int B;
    int C;
    static int D;
    private int E;
    int F;
    private qj G;
    static int H;
    
    protected final void finalize() throws Throwable {
	b((byte) 127);
	H++;
	super.finalize();
    }
    
    static final void a(int i, pl var_pl) {
	if (i == 36161) {
	    v++;
	    jj.m = var_pl;
	}
    }
    
    final void b(byte i) {
	if (A > 0) {
	    G.a(((pca) this).F, A, (byte) 119);
	    A = 0;
	}
	if (i >= 124)
	    u++;
    }
    
    public final void a(int i) {
	OpenGL.glFramebufferRenderbufferEXT(w, z, 36161, 0);
	t++;
	w = -1;
	z = -1;
	if (i != 29468)
	    a(75, -16, 92);
    }
    
    public static void i(int i) {
	isaac = null;
	s = null;
	if (i != 17519)
	    a(104, null);
    }
    
    final void a(int i, int i_0_, int i_1_) {
	OpenGL.glFramebufferRenderbufferEXT(i_1_, i_0_, 36161, A);
	B++;
	if (i >= 117) {
	    z = i_0_;
	    w = i_1_;
	}
    }
    
    pca(qj var_qj, int i, int i_2_, int i_3_) {
	E = i;
	((pca) this).y = i_3_;
	G = var_qj;
	((pca) this).C = i_2_;
	OpenGL.glGenRenderbuffersEXT(1, ew.l, 0);
	A = ew.l[0];
	OpenGL.glBindRenderbufferEXT(36161, A);
	OpenGL.glRenderbufferStorageEXT(36161, E, ((pca) this).C,
					((pca) this).y);
	((pca) this).F = ((pca) this).y * (((pca) this).C * G.d(-6402, E));
    }
    
    pca(qj var_qj, int i, int i_4_, int i_5_, int i_6_) {
	((pca) this).C = i_4_;
	((pca) this).y = i_5_;
	E = i;
	G = var_qj;
	OpenGL.glGenRenderbuffersEXT(1, ew.l, 0);
	A = ew.l[0];
	OpenGL.glBindRenderbufferEXT(36161, A);
	OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_6_, E,
						   ((pca) this).C,
						   ((pca) this).y);
	((pca) this).F = ((pca) this).y * (((pca) this).C * G.d(-6402, E));
    }
}
