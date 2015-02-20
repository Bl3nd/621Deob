/* lu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class lu extends uc
{
    private pea i;
    static int j;
    static GameInPacket incomingPacket24;
    static wa[] l = new wa[14];
    private Class_fb m;
    private float[] n;
    static int o;
    static int p;
    static int q;
    private bj r;
    private float s;
    static int t;
    private int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int outScreenPlayers;
    static int B;
    static int C;
    
    private final void b(int i) {
	x++;
	m = new Class_fb(((uc) this).h, 2);
	m.a(0, i - 260);
	((uc) this).h.b((int) 1, true);
	((uc) this).h.e(i ^ ~0x720a, -16777216);
	((uc) this).h.a(i, i - 465309396, 7681);
	((uc) this).h.a(34166, 770, 0, true);
	((uc) this).h.b((int) 0, true);
	OpenGL.glBindProgramARB(34336, ((bj) r).c);
	OpenGL.glEnable(34336);
	m.a((byte) 76);
	m.a(1, 0);
	((uc) this).h.b((int) 1, true);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((uc) this).h.c(false, 0);
	((uc) this).h.a(5890, 770, 0, true);
	((uc) this).h.b((int) 0, true);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	m.a((byte) 69);
    }
    
    public static void d(byte i) {
	if (i >= -34)
	    l = null;
	l = null;
	incomingPacket24 = null;
    }
    
    lu(qj var_qj, pea var_pea) {
	super(var_qj);
	this.i = var_pea;
	if (((qj) ((uc) this).h).ef && ((qj) ((uc) this).h).Qf >= 2) {
	    r = (ur.a
		 ("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND",
		  -65536, 34336, ((uc) this).h));
	    if (r != null) {
		int[][] is
		    = client.a(0, 256, 4, 3, 4, false, 64, 0.4F);
		int[][] is_0_
		    = client.a(8, 256, 4, 3, 4, false, 64, 0.4F);
		n = new float[32768];
		int i = 0;
		for (int i_1_ = 0; i_1_ < 256; i_1_++) {
		    int[] is_2_ = is[i_1_];
		    int[] is_3_ = is_0_[i_1_];
		    for (int i_4_ = 0; i_4_ < 64; i_4_++) {
			n[i++] = (float) is_2_[i_4_] / 4096.0F;
			n[i++] = (float) is_3_[i_4_] / 4096.0F;
		    }
		}
		b(260);
	    }
	}
    }
    
    final void a(int i) {
	C++;
	if (m != null) {
	    m.a(i ^ ~0x76c3, '\001');
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a((rg) null, -2);
	    ((uc) this).h.b((int) 0, true);
	    if (i != 1268)
		this.i = null;
	}
    }
    
    final void a(int i, boolean bool) {
	o++;
	if (i >= -64)
	    b((int) 121);
    }
    
    static final int a(int i, int i_5_, byte[] is, byte i_6_, int i_7_,
		       String string) {
	p++;
	int i_8_ = i_5_ - i;
	if (i_6_ >= -49)
	    return -73;
	for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
	    char c = string.charAt(i + i_9_);
	    if ((c <= '\0' || c >= '\u0080')
		&& (c < '\u00a0' || c > '\u00ff')) {
		if (c == '\u20ac')
		    is[i_7_ + i_9_] = (byte) -128;
		else if (c == '\u201a')
		    is[i_7_ + i_9_] = (byte) -126;
		else if (c == '\u0192')
		    is[i_7_ + i_9_] = (byte) -125;
		else if (c != '\u201e') {
		    if (c != '\u2026') {
			if (c != '\u2020') {
			    if (c != '\u2021') {
				if (c == '\u02c6')
				    is[i_7_ + i_9_] = (byte) -120;
				else if (c == '\u2030')
				    is[i_9_ + i_7_] = (byte) -119;
				else if (c == '\u0160')
				    is[i_9_ + i_7_] = (byte) -118;
				else if (c == '\u2039')
				    is[i_9_ + i_7_] = (byte) -117;
				else if (c != '\u0152') {
				    if (c != '\u017d') {
					if (c == '\u2018')
					    is[i_7_ + i_9_] = (byte) -111;
					else if (c == '\u2019')
					    is[i_9_ + i_7_] = (byte) -110;
					else if (c != '\u201c') {
					    if (c == '\u201d')
						is[i_7_ + i_9_] = (byte) -108;
					    else if (c == '\u2022')
						is[i_7_ + i_9_] = (byte) -107;
					    else if (c != '\u2013') {
						if (c == '\u2014')
						    is[i_7_ + i_9_]
							= (byte) -105;
						else if (c != '\u02dc') {
						    if (c != '\u2122') {
							if (c != '\u0161') {
							    if (c
								!= '\u203a') {
								if (c
								    == '\u0153')
								    is[(i_9_
									+ i_7_)]
									= (byte) -100;
								else if (c
									 == '\u017e')
								    is[(i_7_
									+ i_9_)]
									= (byte) -98;
								else if (c
									 == '\u0178')
								    is[(i_9_
									+ i_7_)]
									= (byte) -97;
								else
								    is[(i_9_
									+ i_7_)]
									= (byte) 63;
							    } else
								is[i_7_ + i_9_]
								    = (byte) -101;
							} else
							    is[i_9_ + i_7_]
								= (byte) -102;
						    } else
							is[i_7_ + i_9_]
							    = (byte) -103;
						} else
						    is[i_9_ + i_7_]
							= (byte) -104;
					    } else
						is[i_9_ + i_7_] = (byte) -106;
					} else
					    is[i_9_ + i_7_] = (byte) -109;
				    } else
					is[i_7_ + i_9_] = (byte) -114;
				} else
				    is[i_9_ + i_7_] = (byte) -116;
			    } else
				is[i_9_ + i_7_] = (byte) -121;
			} else
			    is[i_9_ + i_7_] = (byte) -122;
		    } else
			is[i_7_ + i_9_] = (byte) -123;
		} else
		    is[i_7_ + i_9_] = (byte) -124;
	    } else
		is[i_9_ + i_7_] = (byte) c;
	}
	return i_8_;
    }
    
    static final void a(int i, int i_10_, Class_r class_r) {
	B++;
	if (!il.k)
	    bfa.D = 0;
	else {
	    if (pu.q)
		Class_ef.B = wf.u.a(false);
	    Class_j.j = 0;
	    ld.c = 0;
	    mu.g = 0;
	    int[] is = class_r.v();
	    Class_cb.f = (int) ((float) is[2] / 3.0F);
	    if (i_10_ == 26871) {
		bt.p = (int) ((float) is[3] / 3.0F);
		class_r.a(io.Y);
		if (dn.c != (int) ((float) io.Y[0] / 3.0F)
		    || taa.c != (int) ((float) io.Y[1] / 3.0F)) {
		    taa.c = (int) ((float) io.Y[1] / 3.0F);
		    dn.c = (int) ((float) io.Y[0] / 3.0F);
		    dr.f = taa.c >> 1;
		    kaa.p = new int[dn.c * taa.c];
		    iq.j = dn.c >> 1;
		}
		qga.i = class_r.t();
		bfa.D = 0;
		for (int i_11_ = 0; cda.b > i_11_; i_11_++)
		    rea.a(i, class_r, 0, ui.n[i_11_]);
		for (int i_12_ = 0; i_12_ < vu.j; i_12_++)
		    rea.a(i, class_r, 0, Class_ob.p[i_12_]);
		for (int i_13_ = 0; sr.R > i_13_; i_13_++)
		    rea.a(i, class_r, 0, Class_mb.Y[i_13_]);
		io.X = 0;
		if (bfa.D > 0) {
		    int i_14_ = kaa.p.length;
		    int i_15_ = 0x7 & i_14_ - i_14_;
		    int i_16_ = 0;
		    while (i_15_ > i_16_) {
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
			kaa.p[i_16_++] = 2147483647;
		    }
		    while (i_14_ > i_16_)
			kaa.p[i_16_++] = 2147483647;
		    nq.p = 1;
		    for (int i_17_ = 0; i_17_ < bfa.D; i_17_++) {
			hv var_hv = jr.w[i_17_];
			tp.a(((hv) var_hv).i[0], ((hv) var_hv).c[3],
			     ((hv) var_hv).i[1], 0, ((hv) var_hv).l[3],
			     ((hv) var_hv).l[1], ((hv) var_hv).i[3],
			     ((hv) var_hv).c[0], ((hv) var_hv).c[1],
			     ((hv) var_hv).l[0]);
			tp.a(((hv) var_hv).i[1], ((hv) var_hv).c[3],
			     ((hv) var_hv).i[2], 0, ((hv) var_hv).l[3],
			     ((hv) var_hv).l[2], ((hv) var_hv).i[3],
			     ((hv) var_hv).c[1], ((hv) var_hv).c[2],
			     ((hv) var_hv).l[1]);
		    }
		    nq.p = 2;
		}
		if (pu.q)
		    kga.nb = wf.u.a(false) - Class_ef.B;
	    }
	}
    }
    
    final void a(int i, int i_18_, rg var_rg) {
	((uc) this).h.a(var_rg, i_18_ - 9);
	y++;
	if (i_18_ != 7)
	    this.i = null;
	((uc) this).h.c(false, i);
    }
    
    final void b(int i, boolean bool) {
	q++;
	if (m != null) {
	    int i_19_ = 41 / ((65 - i) / 60);
	    m.a(-29240, '\0');
	    ((uc) this).h.b((int) 1, true);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf(((qj) ((uc) this).h).We.a(true), 0);
	    OpenGL.glMatrixMode(5888);
	    ((uc) this).h.b((int) 0, true);
	    if (((qj) ((uc) this).h).je != u) {
		int i_20_ = 128 * (((qj) ((uc) this).h).je % 5000) / 5000;
		for (int i_21_ = 0; i_21_ < 64; i_21_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_21_, n,
							 i_20_);
		    i_20_ += 2;
		}
		if (!((pea) this.i).a)
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		else
		    s = (float) (((qj) ((uc) this).h).je % 4000) / 4000.0F;
		u = ((qj) ((uc) this).h).je;
	    }
	}
    }
    
    static final void a(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			boolean bool) {
	if (i_25_ < 1)
	    i_25_ = 1;
	if (i < 1)
	    i = 1;
	t++;
	int i_26_ = i - 334;
	if (i_26_ >= 0) {
	    if (i_26_ > 100)
		i_26_ = 100;
	} else
	    i_26_ = 0;
	int i_27_ = ifa.c + i_26_ * (Class_kd.m - ifa.c) / 100;
	if (bi.U <= i_27_) {
	    if (i_27_ > GrandExchangeItem.k)
		i_27_ = GrandExchangeItem.k;
	} else
	    i_27_ = bi.U;
	int i_28_ = i * i_27_ * 512 / (334 * i_25_);
	if (i_23_ != -16777216)
	    l = null;
	if (i_28_ >= oe.e) {
	    if (i_28_ > hm.d) {
		i_28_ = hm.d;
		i_27_ = 334 * (i_25_ * i_28_) / (512 * i);
		if (i_27_ < bi.U) {
		    i_27_ = bi.U;
		    int i_29_ = i_25_ * (i_28_ * 334) / (i_27_ * 512);
		    int i_30_ = (i - i_29_) / 2;
		    if (bool) {
			lg.r.JA();
			lg.r.f(-16777216, i_22_, i_24_, 1, i_30_, i_25_);
			lg.r.f(-16777216, i_22_, i_24_ + i - i_30_, 1, i_30_,
			       i_25_);
		    }
		    i -= 2 * i_30_;
		    i_24_ += i_30_;
		}
	    }
	} else {
	    i_28_ = oe.e;
	    i_27_ = i_25_ * (i_28_ * 334) / (i * 512);
	    if (GrandExchangeItem.k < i_27_) {
		i_27_ = GrandExchangeItem.k;
		int i_31_ = 512 * (i_27_ * i) / (i_28_ * 334);
		int i_32_ = (i_25_ - i_31_) / 2;
		if (bool) {
		    lg.r.JA();
		    lg.r.f(-16777216, i_22_, i_24_, i_23_ ^ ~0xfffffe, i,
			   i_32_);
		    lg.r.f(-16777216, i_25_ + i_22_ - i_32_, i_24_, 1, i,
			   i_32_);
		}
		i_22_ += i_32_;
		i_25_ -= 2 * i_32_;
	    }
	}
	qea.b = (short) i_25_;
	fw.Eb = i * i_27_ / 334;
	faa.e = i_24_;
	da.b = i_22_;
	vq.k = (short) i;
    }
    
    final boolean a(byte i) {
	z++;
	if (i >= -93)
	    return false;
	return true;
    }
    
    static final long a(int i, int i_33_, int i_34_, vda var_vda) {
	w++;
	long l = 4194304L;
	long l_35_ = -9223372036854775808L;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 63, var_vda.b((byte) 127));
	long l_36_ = (long) (var_vda.a((byte) 42) << 14 | (i_33_ | i << 7)
			     | var_vda.c((byte) 61) << 20 | 0x40000000);
	if ((((ObjectDef) var_bda).jb ^ 0xffffffff) == i_34_)
	    l_36_ |= l_35_;
	if (((ObjectDef) var_bda).i == 1)
	    l_36_ |= l;
	l_36_ |= (long) var_vda.b((byte) 127) << 32;
	return l_36_;
    }
    
    final void a(int i, int i_37_, int i_38_) {
	v++;
	if (m != null) {
	    if (i_37_ != 50)
		a(12, -10, (Class_r) null);
	    ((uc) this).h.b((int) 1, true);
	    if ((i & 0x80) != 0)
		((uc) this).h.a((rg) null, -2);
	    else if ((0x1 & i_38_) == 1) {
		if (((pea) this.i).a) {
		    ((uc) this).h.a(((pea) this.i).i, -2);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, s, 0.0F,
							0.0F, 1.0F);
		} else {
		    int i_39_ = 16 * (((qj) ((uc) this).h).je % 4000) / 4000;
		    ((uc) this).h.a(((pea) this.i).e[i_39_], -2);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else {
		if (((pea) this.i).a)
		    ((uc) this).h.a(((pea) this.i).i, -2);
		else
		    ((uc) this).h.a(((pea) this.i).e[0], -2);
		OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
						    0.0F, 1.0F);
	    }
	    ((uc) this).h.b((int) 0, true);
	    if ((0x40 & i) == 0) {
		OpenGL.glGetFloatv(2899, me.l, 0);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66, me.l, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_40_ = i & 0x3;
	    if (i_40_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_40_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    static {
	j = 0;
	incomingPacket24 = new GameInPacket(24, 3);
	outScreenPlayers = 0;
    }
}
