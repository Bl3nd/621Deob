/* bf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class bf extends qh
{
    private int u;
    private pm[] v;
    private int w;
    static int x;
    private laa y;
    private laa z;
    static int A;
    static int B;
    private qk C;
    static int D;
    static int E;
    static GameInPacket incomingPacket66 = new GameInPacket(66, 8);
    private int G;
    private laa H;
    static int I;
    static int K;
    private qk L;
    private laa M;
    private pm N;
    private int O;
    private pm P;
    static GameInPacket sendInterfaceGameInPacket = new GameInPacket(51, 9);
    static int[] R = new int[13];
    static int S;
    
    final int a(int i) {
	if (i != 1)
	    O = 52;
	I++;
	return 1;
    }
    
    bf(qj var_qj) {
	super(var_qj);
    }
    
    final void a(int i, int i_0_, int i_1_) {
	O = i;
	K++;
	G = i_0_;
	if (i_1_ < 122)
	    l(-100);
	int i_2_ = ko.a((byte) 114, O);
	int i_3_ = ko.a((byte) 114, G);
	if (i_2_ != u || w != i_3_) {
	    if (v != null) {
		for (int i_4_ = 0; i_4_ < v.length; i_4_++)
		    v[i_4_].b((byte) -54);
		v = null;
	    }
	    if (i_2_ > 256 || i_3_ > 256) {
		int i_5_ = i_2_;
		int i_6_ = i_3_;
		int i_7_ = 0;
		while (i_5_ > 256 || i_6_ > 256) {
		    if (i_5_ > 256)
			i_5_ >>= 1;
		    i_7_++;
		    if (i_6_ > 256)
			i_6_ >>= 1;
		}
		if (L == null)
		    L = new qk(((qh) this).p);
		v = new pm[i_7_];
		i_5_ = i_2_;
		i_6_ = i_3_;
		i_7_ = 0;
		while (i_5_ > 256 || i_6_ > 256) {
		    v[i_7_++] = new pm(((qh) this).p, 3553, 34842, i_5_, i_6_);
		    if (i_5_ > 256)
			i_5_ >>= 1;
		    if (i_6_ > 256)
			i_6_ >>= 1;
		}
	    } else
		L = null;
	    u = i_2_;
	    w = i_3_;
	}
    }
    
    final void c(int i) {
	E++;
	v = null;
	y = null;
	z = null;
	P = null;
	C = null;
	H = null;
	M = null;
	L = null;
	N = null;
	if (i != 35632)
	    a(null, false, 43, null);
    }
    
    final boolean m(int i) {
	A++;
	if (i != -11982)
	    C = null;
	if (!((qj) ((qh) this).p).wg || !((qj) ((qh) this).p).zf
	    || !((qj) ((qh) this).p).zg)
	    return false;
	return true;
    }
    
    public static void b(byte i) {
	if (i != -40)
	    incomingPacket66 = null;
	R = null;
	sendInterfaceGameInPacket = null;
	incomingPacket66 = null;
    }
    
    final boolean i(int i) {
	S++;
	if (((qj) ((qh) this).p).wg && ((qj) ((qh) this).p).zf
	    && ((qj) ((qh) this).p).zg) {
	    C = new qk(((qh) this).p);
	    N = new pm(((qh) this).p, 3553, 34842, 256, 256);
	    N.a(false, (byte) -61, false);
	    P = new pm(((qh) this).p, 3553, 34842, 256, 256);
	    P.a(false, (byte) -8, false);
	    ((qh) this).p.b(i + 255, C);
	    C.a(N, (byte) 1, 0);
	    C.a(P, (byte) 1, 1);
	    C.a(0, true);
	    if (!C.a(false)) {
		((qh) this).p.a(85, C);
		return false;
	    }
	    ((qh) this).p.a(-112, C);
	    M = (kea.a
		 ((new af[]
		   { mk.a
		     ((byte) 93, ((qh) this).p, 35632,
		      "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }),
		  ((qh) this).p, 0));
	    y = (kea.a
		 ((new af[]
		   { mk.a
		     ((byte) 107, ((qh) this).p, 35632,
		      "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }),
		  ((qh) this).p, 0));
	    z = (kea.a
		 ((new af[]
		   { mk.a
		     ((byte) 121, ((qh) this).p, 35632,
		      "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }),
		  ((qh) this).p, 0));
	    H = (kea.a
		 ((new af[]
		   { mk.a
		     ((byte) 87, ((qh) this).p, 35632,
		      "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }),
		  ((qh) this).p, 0));
	    if (y == null || M == null || z == null || H == null)
		return false;
	    return true;
	}
	if (i != 0)
	    return true;
	return false;
    }
    
    final void a(int i, int i_8_) {
	x++;
	OpenGL.glUseProgramObjectARB(0L);
	((qh) this).p.b((int) 1, true);
	((qh) this).p.a((rg) null, -2);
	((qh) this).p.b(i, true);
    }
    
    static final void a(la var_la) {
	us.c = var_la;
    }
    
    final boolean l(int i) {
	B++;
	if (i != 21223)
	    c(41);
	if (C == null)
	    return false;
	return true;
    }
    
    final void a(pm var_pm, boolean bool, int i, pm var_pm_9_) {
	D++;
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (v != null) {
	    ((qh) this).p.b(255, L);
	    int i_10_ = ko.a((byte) 114, O);
	    int i_11_ = ko.a((byte) 114, G);
	    int i_12_ = 0;
	    while (i_10_ > 256 || i_11_ > 256) {
		OpenGL.glViewport(0, 0, i_10_, i_11_);
		L.a(v[i_12_], (byte) 1, 0);
		if (i_10_ > 256)
		    i_10_ >>= 1;
		if (i_11_ > 256)
		    i_11_ >>= 1;
		if (i_12_ == 0) {
		    ((qh) this).p.a(var_pm, -2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) O, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) O, (float) G);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) G);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((qh) this).p.a(v[i_12_ - 1], -2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		i_12_++;
	    }
	    ((qh) this).p.a(-83, L);
	    ((qh) this).p.a(v[i_12_ - 1], -2);
	    ((qh) this).p.b(255, C);
	    C.a(0, true);
	    OpenGL.glViewport(0, 0, 256, 256);
	    long l = ((laa) y).e;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l,
								 "sceneTex"),
				  0);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"),
				  ol.d, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((qh) this).p.a(var_pm, -2);
	    ((qh) this).p.b(255, C);
	    C.a(0, true);
	    OpenGL.glViewport(0, 0, 256, 256);
	    long l = ((laa) M).e;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l,
								 "sceneTex"),
				  0);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"),
				  ol.d, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) O, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) O, (float) G);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) G);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	C.a(1, true);
	((qh) this).p.a(N, -2);
	long l = ((laa) H).e;
	OpenGL.glUseProgramObjectARB(l);
	OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "baseTex"), 0);
	OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"),
			      0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	C.a(0, true);
	((qh) this).p.a(P, -2);
	OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"), 0.0F,
			      0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((qh) this).p.a(101, C);
	long l_13_ = ((laa) z).e;
	OpenGL.glUseProgramObjectARB(l_13_);
	OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_13_,
							     "sceneTex"),
			      0);
	OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_13_,
							     "bloomTex"),
			      1);
	OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l_13_, "params"),
			      bl.J, GameOutPacket.g, 0.0F);
	((qh) this).p.b((int) 1, !bool);
	if (bool != false)
	    b((byte) 44);
	((qh) this).p.a(N, -2);
	((qh) this).p.b((int) 0, !bool);
	((qh) this).p.a(var_pm, -2);
    }
}
