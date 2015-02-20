/* gi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class gi extends uc
{
    private boolean i;
    static int j;
    static int[][] k;
    static int l;
    static int m;
    static int n;
    static int o;
    private pea p;
    static int q;
    static int r;
    static int s;
    private laa t;
    static int u;
    private boolean v = false;
    static int w;
    
    static final float[] a(float f, float f_0_, int i, float f_1_, byte i_2_,
			   int i_3_, int i_4_, int i_5_) {
	w++;
	float[] fs = new float[9];
	float[] fs_6_ = new float[9];
	float f_7_ = (float) Math.cos((double) ((float) i * 0.024543693F));
	float f_8_ = (float) Math.sin((double) ((float) i * 0.024543693F));
	fs[2] = f_8_;
	fs[8] = f_7_;
	fs[0] = f_7_;
	float f_9_ = 1.0F - f_7_;
	fs[7] = 0.0F;
	fs[1] = 0.0F;
	fs[6] = -f_8_;
	fs[3] = 0.0F;
	fs[5] = 0.0F;
	fs[4] = 1.0F;
	float[] fs_10_ = new float[9];
	float f_11_ = 1.0F;
	f_7_ = (float) i_3_ / 32767.0F;
	float f_12_ = 0.0F;
	f_8_ = -(float) Math.sqrt((double) (-(f_7_ * f_7_) + 1.0F));
	f_9_ = -f_7_ + 1.0F;
	float f_13_ = (float) Math.sqrt((double) (i_5_ * i_5_ + i_4_ * i_4_));
	if (f_13_ == 0.0F && f_7_ == 0.0F)
	    fs_6_ = fs;
	else {
	    if (f_13_ != 0.0F) {
		f_11_ = (float) -i_4_ / f_13_;
		f_12_ = (float) i_5_ / f_13_;
	    }
	    fs_10_[2] = f_12_ * f_11_ * f_9_;
	    fs_10_[4] = f_7_;
	    fs_10_[8] = f_12_ * f_12_ * f_9_ + f_7_;
	    fs_10_[1] = f_12_ * f_8_;
	    fs_10_[3] = -f_12_ * f_8_;
	    fs_10_[6] = f_9_ * (f_11_ * f_12_);
	    fs_10_[5] = f_11_ * f_8_;
	    fs_10_[0] = f_9_ * (f_11_ * f_11_) + f_7_;
	    fs_10_[7] = -f_11_ * f_8_;
	    fs_6_[0]
		= fs_10_[6] * fs[2] + (fs[0] * fs_10_[0] + fs[1] * fs_10_[3]);
	    fs_6_[1]
		= fs_10_[4] * fs[1] + fs[0] * fs_10_[1] + fs[2] * fs_10_[7];
	    fs_6_[3]
		= fs[3] * fs_10_[0] + fs[4] * fs_10_[3] + fs[5] * fs_10_[6];
	    fs_6_[2]
		= fs[1] * fs_10_[5] + fs_10_[2] * fs[0] + fs[2] * fs_10_[8];
	    fs_6_[4]
		= fs_10_[4] * fs[4] + fs_10_[1] * fs[3] + fs_10_[7] * fs[5];
	    fs_6_[5]
		= fs[5] * fs_10_[8] + (fs_10_[2] * fs[3] + fs[4] * fs_10_[5]);
	    fs_6_[6]
		= fs[6] * fs_10_[0] + fs[7] * fs_10_[3] + fs_10_[6] * fs[8];
	    fs_6_[7]
		= fs[6] * fs_10_[1] + fs_10_[4] * fs[7] + fs_10_[7] * fs[8];
	    fs_6_[8]
		= fs_10_[2] * fs[6] + fs[7] * fs_10_[5] + fs_10_[8] * fs[8];
	}
	fs_6_[5] *= f;
	fs_6_[1] *= f_1_;
	if (i_2_ >= -68)
	    a(-124, null, 127);
	fs_6_[0] *= f_1_;
	fs_6_[8] *= f_0_;
	fs_6_[4] *= f;
	fs_6_[7] *= f_0_;
	fs_6_[2] *= f_1_;
	fs_6_[6] *= f_0_;
	fs_6_[3] *= f;
	return fs_6_;
    }
    
    final boolean a(byte i) {
	if (i > -93)
	    d((byte) 110);
	r++;
	return false;
    }
    
    static final short[] a(int i, short[] is, int i_14_) {
	s++;
	if (i <= 37)
	    d((byte) -18);
	short[] is_15_ = new short[i_14_];
	co.a(is, 0, is_15_, 0, i_14_);
	return is_15_;
    }
    
    static final void b(int i, int i_16_, int i_17_) {
	n++;
	qba var_qba = ofa.a(15, i, (byte) 88);
	var_qba.c((byte) 11);
	((qba) var_qba).v = i_16_;
	((qba) var_qba).t = i_17_;
    }
    
    public static void d(byte i) {
	if (i != 3)
	    k = null;
	k = null;
    }
    
    final void a(int i, int i_18_, rg var_rg) {
	if (i_18_ != 7)
	    k = null;
	q++;
	if (!v) {
	    ((uc) this).h.a(var_rg, -2);
	    ((uc) this).h.c(false, i);
	}
    }
    
    final void a(int i, boolean bool) {
	o++;
	if (i > -64)
	    a(98, false);
    }
    
    gi(qj var_qj, pea var_pea) {
	super(var_qj);
	i = false;
	p = var_pea;
	if (((pea) p).h != null && ((qj) ((uc) this).h).vg
	    && ((qj) ((uc) this).h).zf) {
	    af var_af
		= (mk.a
		   ((byte) 105, ((uc) this).h, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    af var_af_19_
		= (mk.a
		   ((byte) 124, ((uc) this).h, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.nullLoader);\n}\n"));
	    t = kea.a(new af[] { var_af, var_af_19_ }, ((uc) this).h, 0);
	    i = t != null;
	}
    }
    
    final void b(int i, boolean bool) {
	int i_20_ = 33 / ((i - 65) / 60);
	u++;
	waa var_waa = ((uc) this).h.p(8960);
	if (this.i && var_waa != null) {
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a(var_waa, -2);
	    ((uc) this).h.b((int) 0, true);
	    ((uc) this).h.a(((pea) p).h, -2);
	    long l = ((laa) t).e;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB
		(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
	    OpenGL.glUniform1iARB
		(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"),
				  -((qj) ((uc) this).h).Ng[0],
				  ((qj) ((uc) this).h).Ng[1],
				  ((qj) ((uc) this).h).Ng[2]);
	    OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l,
								 "sunColour"),
				  ((qj) ((uc) this).h).wf,
				  ((qj) ((uc) this).h).Xg,
				  ((qj) ((uc) this).h).pf, 1.0F);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "sunExponent"),
		 Math.abs(((qj) ((uc) this).h).Ng[1]) * 928.0F + 96.0F);
	    v = true;
	}
    }
    
    final void a(int i, int i_21_, int i_22_) {
	if (v) {
	    int i_23_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_24_ = 0xffff & i_22_;
	    float f_25_ = (float) ((0x3fae0 & i_22_) >> 16) / 8.0F;
	    long l = ((laa) t).e;
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"),
				  (float) (((qj) ((uc) this).h).je * i_23_
					   % 40000) / 40000.0F);
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"),
				  f);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"),
		 (float) i_24_);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_25_);
	}
	if (i_21_ == 50)
	    gi.l++;
    }
    
    final void a(int i) {
	j++;
	if (v) {
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a((rg) null, -2);
	    ((uc) this).h.b((int) 0, true);
	    ((uc) this).h.a((rg) null, -2);
	    OpenGL.glUseProgramObjectARB(0L);
	    v = false;
	}
	if (i != 1268)
	    a(1, null, 79);
    }
}
