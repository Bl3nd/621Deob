/* gk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class gk
{
    static int a;
    static boolean b = false;
    private qj c;
    static int d;
    static int e;
    private laa f;
    
    static final void a(float[] fs, int i, int i_0_, int i_1_, int i_2_,
			float f, int i_3_, int i_4_, int i_5_, int i_6_) {
	if (i_4_ <= -13) {
	    i_1_ -= i;
	    i_0_ -= i_3_;
	    e++;
	    i_5_ -= i_6_;
	    float f_7_ = (fs[2] * (float) i_0_
			  + (fs[1] * (float) i_5_ + (float) i_1_ * fs[0]));
	    float f_8_ = (fs[3] * (float) i_1_ + (float) i_5_ * fs[4]
			  + (float) i_0_ * fs[5]);
	    float f_9_ = ((float) i_0_ * fs[8]
			  + ((float) i_1_ * fs[6] + (float) i_5_ * fs[7]));
	    float f_10_
		= (float) Math.sqrt((double) (f_9_ * f_9_
					      + (f_8_ * f_8_ + f_7_ * f_7_)));
	    float f_11_ = (((float) Math.atan2((double) f_7_, (double) f_9_)
			    / 6.2831855F)
			   + 0.5F);
	    float f_12_
		= f + ((float) Math.asin((double) (f_8_ / f_10_)) / 3.1415927F
		       + 0.5F);
	    if (i_2_ == 1) {
		float f_13_ = f_11_;
		f_11_ = -f_12_;
		f_12_ = f_13_;
	    } else if (i_2_ == 2) {
		f_11_ = -f_11_;
		f_12_ = -f_12_;
	    } else if (i_2_ == 3) {
		float f_14_ = f_11_;
		f_11_ = f_12_;
		f_12_ = -f_14_;
	    }
	    wr.x = f_11_;
	    Class_fb.c = f_12_;
	}
    }
    
    final boolean a(byte i) {
	if (((qj) c).wg && ((qj) c).zf && f == null) {
	    af var_af
		= (mk.a
		   ((byte) 108, c, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (var_af != null)
		f = kea.a(new af[] { var_af }, c, 0);
	}
	a++;
	if (i >= -119)
	    return true;
	if (f == null)
	    return false;
	return true;
    }
    
    final boolean a(gba var_gba, gba var_gba_15_, float f, byte i) {
	d++;
	if (!a((byte) -122))
	    return false;
	qk var_qk = ((qj) c).tf;
	if (i >= -35)
	    return false;
	pca var_pca = new pca(c, 6408, ((gba) var_gba).D, ((gba) var_gba).x);
	c.b(255, var_qk);
	boolean bool = false;
	var_qk.a(0, var_pca, -2693);
	if (var_qk.a(false)) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, ((gba) var_gba).D, ((gba) var_gba).x);
	    OpenGL.glUseProgramObjectARB(((laa) this.f).e);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(((laa)
								  this.f).e,
								 "heightMap"),
				  0);
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(((laa)
								  this.f).e,
								 "rcpRelief"),
				  1.0F / f);
	    OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(((laa)
								  this.f).e,
								 "sampleSize"),
				  1.0F / (float) ((gba) var_gba_15_).D,
				  1.0F / (float) ((gba) var_gba_15_).x);
	    for (int i_16_ = 0; ((gba) var_gba).B > i_16_; i_16_++) {
		float f_17_ = (float) i_16_ / (float) ((gba) var_gba).B;
		c.a(var_gba_15_, -2);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_17_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_17_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_17_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_17_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		var_gba.a(0, ((gba) var_gba).D, i_16_, ((gba) var_gba).x, 0, 0,
			  0, 0);
	    }
	    OpenGL.glUseProgramObjectARB(0L);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	var_qk.a((int) 0, 1);
	c.a(65, var_qk);
	return bool;
    }
    
    gk(qj var_qj) {
	c = var_qj;
    }
}
