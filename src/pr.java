/* pr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class pr extends cl
{
    static int t;
    private dl u;
    static int v;
    static int w;
    static int x;
    static GameInPacket incomingPacket112 = new GameInPacket(112, 8);
    static int z;
    private boolean A;
    static int B;
    static int C;
    static long D = 0L;
    private boolean E;
    static int F;
    private bd G;
    static int H = -1;
    
    final void a(int i, int i_0_, byte i_1_) {
	w++;
	if (A) {
	    int i_2_ = 1 << (0x3 & i);
	    float f = (float) (1 << ((0x3e & i) >> 3)) / 32.0F;
	    int i_3_ = i_0_ & 0xffff;
	    float f_4_ = (float) ((i_0_ & 0x377ea) >> 16) / 8.0F;
	    long l = ((dl) u).b;
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"),
				  (float) (((en) ((cl) this).l).Me * i_2_
					   % 40000) / 40000.0F);
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"),
				  f);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"),
		 (float) i_3_);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_4_);
	}
	if (i_1_ != 65)
	    u = null;
    }
    
    static final int a(int i, int i_5_) {
	F++;
	if (i > -8)
	    H = 29;
	return i_5_ >>> 8;
    }
    
    static final int a(byte i, int i_6_, int i_7_) {
	B++;
	int i_8_ = i_6_ >>> 24;
	int i_9_ = -i_8_ + 255;
	int i_10_ = -10 / ((i + 55) / 48);
	i_6_ = (i_8_ * (0xff00ff & i_6_) & ~0xff00ff
		| 0xff0000 & (0xff00 & i_6_) * i_8_) >>> 8;
	return (((~0xff00ff & i_9_ * (0xff00ff & i_7_)
		  | (i_7_ & 0xff00) * i_9_ & 0xff0000)
		 >>> 8)
		+ i_6_);
    }
    
    final void d(int i) {
	if (i != -19092)
	    A = false;
	C++;
	if (A) {
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.a((hfa) null, 0);
	    ((cl) this).l.e(0, 0);
	    ((cl) this).l.a((hfa) null, 0);
	    OpenGL.glUseProgramObjectARB(0L);
	    A = false;
	}
    }
    
    public static void b(boolean bool) {
	incomingPacket112 = null;
	if (bool != false)
	    a(-32, 106);
    }
    
    final void a(boolean bool, boolean bool_11_) {
	z++;
	if (bool != true)
	    A = false;
    }
    
    final void a(int i, boolean bool) {
	x++;
	oq var_oq = ((cl) this).l.R(2);
	if (E && var_oq != null) {
	    ((cl) this).l.e(0, 1);
	    ((cl) this).l.a(var_oq, 0);
	    ((cl) this).l.e(0, 0);
	    ((cl) this).l.a(((bd) G).h, 0);
	    long l = ((dl) u).b;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB
		(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
	    OpenGL.glUniform1iARB
		(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"),
				  ((en) ((cl) this).l).Of[0],
				  -((en) ((cl) this).l).Of[1],
				  -((en) ((cl) this).l).Of[2]);
	    OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l,
								 "sunColour"),
				  ((en) ((cl) this).l).ke,
				  ((en) ((cl) this).l).cf,
				  ((en) ((cl) this).l).Ie, 1.0F);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "sunExponent"),
		 928.0F * Math.abs(((en) ((cl) this).l).Of[1]) + 96.0F);
	    A = true;
	}
	int i_12_ = -107 / ((52 - i) / 36);
    }
    
    pr(lm var_lm, pl var_pl, bd var_bd) {
	super(var_lm);
	G = var_bd;
	if (var_pl == null || !((lm) var_lm).yi || !((lm) var_lm).pi)
	    E = false;
	else {
	    Class_cb class_cb
		= dga.a(35633,
			var_pl.a(123, "gl", "environment_mapped_water_v"),
			var_lm, (byte) 125);
	    Class_cb class_cb_13_
		= dga.a(35632,
			var_pl.a(106, "gl", "environment_mapped_water_f"),
			var_lm, (byte) 97);
	    u = n.a(false, new Class_cb[] { class_cb, class_cb_13_ },
			  var_lm);
	    E = u != null && G.a(true);
	}
    }
    
    final void a(int i, int i_14_, hfa var_hfa) {
	t++;
	if (!A) {
	    ((cl) this).l.a(var_hfa, 0);
	    ((cl) this).l.f(i, 0);
	}
	if (i_14_ < 47)
	    A = true;
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    return false;
	v++;
	return E;
    }
}
