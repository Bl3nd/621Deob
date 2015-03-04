/* qw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class qw extends uc
{
    private pea i;
    private boolean j = false;
    static int k;
    static int l;
    private boolean m = false;
    static float n = 0.0F;
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    private laa u;
    static int v;
    
    final void a(int i, int i_0_, rg var_rg) {
	if (i_0_ == 7) {
	    if (!m) {
		((uc) this).h.a(var_rg, i_0_ - 9);
		((uc) this).h.c(false, i);
	    }
	    t++;
	}
    }
    
    static final void b(int i) {
	rv.a(-1, false);
	k++;
	dga.w = 0;
	boolean bool = true;
	for (int i_1_ = 0; i_1_ < pw.b.length; i_1_++) {
	    if (wk.h[i_1_] != -1 && pw.b[i_1_] == null) {
		pw.b[i_1_] = ua.c.b(0, mv.a(i, (int) 113), wk.h[i_1_]);
		if (pw.b[i_1_] == null) {
		    bool = false;
		    dga.w++;
		}
	    }
	    if ((os.l[i_1_] ^ 0xffffffff) != 0 && lca.D[i_1_] == null) {
		lca.D[i_1_] = ua.c.a(0, ru.t[i_1_], (byte) 121, os.l[i_1_]);
		if (lca.D[i_1_] == null) {
		    bool = false;
		    dga.w++;
		}
	    }
	    if (laa.f[i_1_] != -1 && Class_ue.b[i_1_] == null) {
		Class_ue.b[i_1_] = ua.c.b(0, mv.a(i, (int) 47), laa.f[i_1_]);
		if (Class_ue.b[i_1_] == null) {
		    dga.w++;
		    bool = false;
		}
	    }
	    if (jv.u[i_1_] != -1 && kaa.q[i_1_] == null) {
		kaa.q[i_1_] = ua.c.b(0, -126, jv.u[i_1_]);
		if (kaa.q[i_1_] == null) {
		    dga.w++;
		    bool = false;
		}
	    }
	    if (fba.N != null && uc.g[i_1_] == null
		&& (fba.N[i_1_] ^ 0xffffffff) != 0) {
		uc.g[i_1_] = ua.c.a(0, ru.t[i_1_], (byte) 103, fba.N[i_1_]);
		if (uc.g[i_1_] == null) {
		    dga.w++;
		    bool = false;
		}
	    }
	}
	if (ofa.I == null) {
	    if (mp.g == null
		|| !cf.l.a(((eaa) mp.g).I + "_staticelements", true))
		ofa.I = new rn(0);
	    else if (cf.l.a(false, ((eaa) mp.g).I + "_staticelements"))
		ofa.I = mo.a(cf.l, 512, rba.d,
			     ((eaa) mp.g).I + "_staticelements");
	    else {
		bool = false;
		dga.w++;
	    }
	}
	if (!bool)
	    em.e = 1;
	else {
	    bool = true;
	    pp.q = 0;
	    for (int i_2_ = 0; i_2_ < pw.b.length; i_2_++) {
		byte[] is = lca.D[i_2_];
		if (is != null) {
		    int i_3_ = 64 * (iu.o[i_2_] >> 8) - bfa.thisPlayersRegionX;
		    int i_4_ = (0xff & iu.o[i_2_]) * 64 - BytesParser.thisPlayersRegionY;
		    if (vn.J != 0) {
			i_3_ = 10;
			i_4_ = 10;
		    }
		    bool &= fo.a(is, i_3_, (byte) 68, Class_hc.e, i_4_, bw.v);
		}
		is = kaa.q[i_2_];
		if (is != null) {
		    int i_5_ = (iu.o[i_2_] >> 8) * 64 - bfa.thisPlayersRegionX;
		    int i_6_ = (iu.o[i_2_] & 0xff) * 64 - BytesParser.thisPlayersRegionY;
		    if (vn.J != 0) {
			i_6_ = 10;
			i_5_ = 10;
		    }
		    bool
			&= fo.a(is, i_5_, (byte) -105, Class_hc.e, i_6_, bw.v);
		}
	    }
	    if (!bool)
		em.e = 2;
	    else {
		if (em.e != 0)
		    Class_rf.a(true, lg.r, true, Class_nd.o, pm.v,
			       GameText.loadingPleaseWait.getString(cba.languageID) + "<br>(100%)");
		naa.d((byte) 76);
		um.resetCache(0);
		boolean bool_7_ = false;
		if (lg.r.e() && ((jb) cs.g).L) {
		    for (int i_8_ = 0; pw.b.length > i_8_; i_8_++) {
			if (kaa.q[i_8_] != null || Class_ue.b[i_8_] != null) {
			    bool_7_ = true;
			    break;
			}
		    }
		}
		int i_9_;
		if (!((jb) cs.g).p)
		    i_9_ = vc.b[ri.u];
		else
		    i_9_ = Class_fc.h[ri.u];
		if (lg.r.o())
		    i_9_++;
		sm.a(lg.r, gd.cores, 9, 4, Class_hc.e, bw.v, i_9_, bool_7_,
		     lg.r.c() > 0);
		if (!la.w2Debug)
		    bf.a((la) null);
		else
		    bf.a(bq.e);
		for (int i_10_ = 0; i_10_ < 4; i_10_++)
		    su.a[i_10_].a(2097152);
		wo.a(1);
		ke.a(2, false);
		Class_ef.k(i + 66);
		cf.u = false;
		Connection.tw = null;
		naa.d((byte) 76);
		System.gc();
		rv.a(-1, true);
		vt.b(i ^ ~0x4);
		Interface.pd = cs.g.b(on.performance, i ^ ~0x7a);
		qaa.O = ((jb) cs.g).L;
		av.j = qm.heapSize >= 96;
		iv.y = cs.g.isLighting((int) -51, on.performance);
		ha.v = !((jb) cs.g).isOT;
		or.e = !cs.g.e(on.performance, i + 95) ? qca.E : -1;
		dh.d = vea.a(5, on.performance) || ((jb) cs.g).isGB;
		pea.d = ((jb) cs.g).isTextures;
		gba.E = new gl(4, Class_hc.e, bw.v, false);
		if (vn.J != 0)
		    ul.a((byte) 111, pw.b, gba.E);
		else
		    cea.a(pw.b, gba.E, i ^ 0xc);
		bq.a(Class_hc.e >> 4, false, bw.v >> 4);
		wh.d((byte) 77);
		if (bool_7_) {
		    il.b(true);
		    Class_fd.r = new gl(1, Class_hc.e, bw.v, true);
		    if (vn.J == 0) {
			cea.a(Class_ue.b, Class_fd.r, 8);
			rv.a(i - 5, true);
		    } else {
			ul.a((byte) 94, Class_ue.b, Class_fd.r);
			rv.a(-1, true);
		    }
		    Class_fd.r.a((byte) -62, 0, ((cd) gba.E).i[0]);
		    Class_fd.r.a(null, null, lg.r, (byte) 20);
		    il.b(false);
		}
		gba.E.a(bool_7_ ? ((cd) Class_fd.r).i : null, su.a, lg.r, (byte) 20);
		if (vn.J == 0) {
		    rv.a(i - 5, true);
		    qe.a(lca.D, gba.E, (byte) 88);
		    if (uc.g != null)
			Class_kd.b(-124);
		} else {
		    rv.a(-1, true);
		    ld.a(-111, gba.E, lca.D);
		}
		um.resetCache(i ^ 0x4);
		if (qm.heapSize < 96)
		    he.cleanup((byte) 88);
		rv.a(-1, true);
		gba.E.a(!bool_7_ ? null : wr.D[0], null, -23, lg.r);
		gba.E.a(false, (byte) 45, lg.r);
		rv.a(-1, true);
		if (bool_7_) {
		    il.b(true);
		    rv.a(i - 5, true);
		    if (vn.J != 0)
			ld.a(124, Class_fd.r, kaa.q);
		    else
			qe.a(kaa.q, Class_fd.r, (byte) 50);
		    um.resetCache(i ^ 0x4);
		    rv.a(-1, true);
		    Class_fd.r.a(null, vr.b[0], i + 100, lg.r);
		    Class_fd.r.a(true, (byte) 45, lg.r);
		    rv.a(-1, true);
		    il.b(false);
		}
		fw.y(25923);
		int i_11_ = ((gl) gba.E).L;
		if (vo.clientHeight < i_11_)
		    i_11_ = vo.clientHeight;
		if (i_11_ < vo.clientHeight - 1)
		    i_11_ = vo.clientHeight - 1;
		if (!cs.g.e(on.performance, 105))
		    Class_fb.b(i_11_);
		else
		    Class_fb.b(0);
		for (int i_12_ = 0; i_12_ < 4; i_12_++) {
		    for (int i_13_ = 0; i_13_ < Class_hc.e; i_13_++) {
			for (int i_14_ = 0; i_14_ < bw.v; i_14_++)
			    br.a(1736, i_14_, i_12_, i_13_);
		    }
		}
		kl.b(-110);
		naa.d((byte) 76);
		tm.c(-1);
		um.resetCache(i ^ i);
		ida.b(false);
		if (ws.J != null && ce.y != null && hm.h == 11) {
		    vu.f++;
		    tba var_tba = jga.sendGameOutPacket(ho.e, pca.isaac, (byte) -119);
		    ((tba) var_tba).loginStream.writeInt(1057001181, (int) -117);
		    ud.a(var_tba, (byte) -36);
		}
		if (vn.J == 0) {
		    int i_15_ = (wj.q - (Class_hc.e >> 4)) / 8;
		    int i_16_ = (wj.q + (Class_hc.e >> 4)) / 8;
		    int i_17_ = (Class_kf.y - (bw.v >> 4)) / 8;
		    int i_18_ = ((bw.v >> 4) + Class_kf.y) / 8;
		    for (int i_19_ = i_15_ - 1; i_19_ <= i_16_ + 1; i_19_++) {
			for (int i_20_ = i_17_ - 1; i_18_ + 1 >= i_20_;
			     i_20_++) {
			    if (i_19_ < i_15_ || i_16_ < i_19_ || i_17_ > i_20_
				|| i_18_ < i_20_) {
				ua.c.a("m" + i_19_ + "_" + i_20_, (byte) 54);
				ua.c.a("width" + i_19_ + "_" + i_20_, (byte) 54);
			    }
			}
		    }
		}
		if (hm.h == 4)
		    ei.a(3, i ^ 0x11);
		else if (hm.h != 8) {
		    ei.a(10, -119);
		    if (ce.y != null) {
			tba var_tba = jga.sendGameOutPacket(ak.outgoingPacket48, pca.isaac, (byte) -69);
			ud.a(var_tba, (byte) -36);
		    }
		} else
		    ei.a(7, 22);
		lt.a(false);
		naa.d((byte) 76);
		te.a(true);
		if (dp.m) {
		    ia.sendConsoleCommandText(4, "Took: " + (us.getCurrentTime(i ^ 0x6a) - ft.currentTime) + "ms");
		    dp.m = false;
		}
	    }
	}
    }
    
    final void b(int i, boolean bool) {
	int i_21_ = 21 % ((i - 65) / 60);
	o++;
	waa var_waa = ((uc) this).h.p(8960);
	if (j && var_waa != null) {
	    float f
		= (1.0F - Math.abs(((qj) ((uc) this).h).Ng[1])) * 2.0F + 1.0F;
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a(var_waa, -2);
	    ((uc) this).h.b((int) 0, true);
	    ((uc) this).h.a(((pea) this.i).h, -2);
	    long l = ((laa) u).e;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB
		(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
	    OpenGL.glUniform1iARB
		(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"),
				  -((qj) ((uc) this).h).Ng[0],
				  -((qj) ((uc) this).h).Ng[1],
				  -((qj) ((uc) this).h).Ng[2]);
	    OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l,
								 "sunColour"),
				  ((qj) ((uc) this).h).wf * f,
				  ((qj) ((uc) this).h).Xg * f,
				  ((qj) ((uc) this).h).pf * f, 1.0F);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "sunExponent"),
		 928.0F * Math.abs(((qj) ((uc) this).h).Ng[1]) + 64.0F);
	    m = true;
	}
    }
    
    static final void a(int i, int i_22_, int i_23_, int i_24_, int i_25_) {
	l++;
	if (i_24_ != 0)
	    n = -0.29173368F;
	qba var_qba = ofa.a(4, i_23_, (byte) -109);
	var_qba.c((byte) 11);
	((qba) var_qba).A = i_25_;
	((qba) var_qba).v = i;
	((qba) var_qba).t = i_22_;
    }
    
    qw(qj var_qj, pea var_pea) {
	super(var_qj);
	i = var_pea;
	if (((pea) i).h != null && ((qj) ((uc) this).h).vg
	    && ((qj) ((uc) this).h).zf) {
	    af var_af
		= (mk.a
		   ((byte) 118, ((uc) this).h, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    af var_af_26_
		= (mk.a
		   ((byte) 110, ((uc) this).h, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.nullLoader);\n}\n"));
	    u = kea.a(new af[] { var_af, var_af_26_ }, ((uc) this).h, 0);
	    j = u != null;
	}
    }
    
    final void a(int i, int i_27_, int i_28_) {
	if (m) {
	    int i_29_ = 1 << (i & 0x3);
	    float f = (float) (1 << (0x7 & i >> 3)) / 32.0F;
	    int i_30_ = i_28_ & 0xffff;
	    float f_31_ = (float) (0x3 & i_28_ >> 16) / 8.0F;
	    float f_32_ = (float) (i_28_ >> 19 & 0xf) / 16.0F;
	    float f_33_ = (float) (0xf & i_28_ >> 23) / 16.0F;
	    int i_34_ = (0x7cbe44f4 & i_28_) >> 27;
	    long l = ((laa) u).e;
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"),
				  (float) (((qj) ((uc) this).h).je * i_29_
					   % 40000) / 40000.0F);
	    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"),
				  f);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"),
		 (float) i_30_);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_31_);
	    OpenGL.glUniform2fARB
		(OpenGL.glGetUniformLocationARB(l, "waveIntensity"), f_33_,
		 f_32_);
	    OpenGL.glUniform1fARB
		(OpenGL.glGetUniformLocationARB(l, "waveExponent"),
		 (float) i_34_);
	}
	p++;
	if (i_27_ != 50)
	    b(121, true);
    }
    
    final void a(int i) {
	v++;
	if (m) {
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a((rg) null, i - 1270);
	    ((uc) this).h.b((int) 0, true);
	    ((uc) this).h.a((rg) null, -2);
	    OpenGL.glUseProgramObjectARB(0L);
	    m = false;
	}
	if (i != 1268)
	    j = true;
    }
    
    final boolean a(byte i) {
	if (i >= -93)
	    a(-94, -97, -126);
	q++;
	return j;
    }
    
    final void a(int i, boolean bool) {
	s++;
	if (i >= -64)
	    b(-86, true);
    }
}
