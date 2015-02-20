/* oba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class oba extends gga
{
    static int B;
    static int D;
    static int E;
    private static char[] F = new char[64];
    static int G;
    static int H;
    static Class_ae I;
    static wea J;
    static pk K;
    
    oba(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
	super(i, i_0_, i_1_, i_2_, i_3_, f);
    }
    
    final void a(int i, float f) {
	((gga) this).r = f;
	H++;
	if (i != 0)
	    a(null, null, 70, -89, null, 84, null);
    }
    
    final void a(int i, int i_4_, byte i_5_, int i_6_) {
	B++;
	if (i_5_ >= -18)
	    I = null;
	((gga) this).z = i;
	((gga) this).o = i_4_;
	((gga) this).n = i_6_;
    }
    
    static final void a(String string, String string_7_, int i, int i_8_,
			String string_9_, int i_10_, String string_11_) {
	at.a(string, string_7_, i, i_10_, i_8_, string_9_, null, (byte) 127,
	     string_11_);
	D++;
    }
    
    public static void j(int i) {
	I = null;
	J = null;
	if (i > 100) {
	    F = null;
	    K = null;
	}
    }
    
    static final void a(int i, int i_12_, boolean bool, int i_13_, int i_14_,
			int i_15_) {
	G++;
	if (em.a != null && (i_15_ != 3 || ((jb) cs.g).W != i_14_
			     || ((jb) cs.g).F != i_12_)) {
	    iga.a(em.a, nda.signlink, false);
	    em.a = null;
	}
	if (i_13_ != -101)
	    a(null, null, -127, -10, null, 64, null);
	if (i_15_ == 3 && em.a == null) {
	    em.a = jt.a(0, (byte) 7, i_12_, 0, nda.signlink, i_14_);
	    if (em.a != null) {
		((jb) cs.g).F = i_12_;
		((jb) cs.g).W = i_14_;
		cs.g.a(nda.signlink, (byte) 80);
	    }
	}
	if (i_15_ == 3 && em.a == null)
	    a(i, -1, true, -101, -1, ((jb) cs.g).w);
	else {
	    java.awt.Container container;
	    if (em.a != null) {
		rda.width = i_14_;
		container = em.a;
		Class_jg.height = i_12_;
	    } else if (ws.J == null) {
		if (vj.applet == null)
		    container = tg.D;
		else
		    container = vj.applet;
		rda.width = container.getSize().width;
		Class_jg.height = container.getSize().height;
	    } else {
		Insets insets = ws.J.getInsets();
		rda.width = ws.J.getSize().width - insets.left - insets.right;
		Class_jg.height = ws.J.getSize().height + (-insets.bottom - insets.top);
		container = ws.J;
	    }
	    if (i_15_ != 1)
		lfa.b((byte) -10);
	    else {
		ff.width = baa.d;
		vh.yLoc = 0;
		ia.xLoc = (rda.width - baa.d) / 2;
		eh.height = Class_vb.r;
	    }
	    if (K != hs.modeWhere) {
		if (ff.width < 1024 && eh.height < 768) {
		    /* empty */
		}
	    }
	    if (bool)
		wu.c(4);
	    else {
		ru.canvas.setSize(ff.width, eh.height);
		lg.r.b(ru.canvas);
		if (container == ws.J) {
		    Insets insets = ws.J.getInsets();
		    ru.canvas.setLocation(insets.left + ia.xLoc, vh.yLoc + insets.top);
		} else
		    ru.canvas.setLocation(ia.xLoc, vh.yLoc);
	    }
	    if (i_15_ >= 2)
		br.m = true;
	    else
		br.m = false;
	    if ((Class_vb.u ^ 0xffffffff) != 0)
		cv.a(true, (byte) 105);
	    if (ce.y != null && bc.a(hm.h, (byte) -62))
		jp.a(true);
	    for (int i_16_ = 0; i_16_ < 100; i_16_++)
		la.q[i_16_] = true;
	    sea.d = true;
	}
    }
    
    static final float[] a(float f, int i, int i_17_, float f_18_, byte i_19_,
			   int i_20_, float f_21_, int i_22_) {
	E++;
	float[] fs = new float[9];
	float[] fs_23_ = new float[9];
	float f_24_
	    = (float) Math.cos((double) (0.024543693F * (float) i_22_));
	float f_25_
	    = (float) Math.sin((double) (0.024543693F * (float) i_22_));
	fs[8] = f_24_;
	fs[6] = -f_25_;
	fs[1] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[2] = f_25_;
	fs[0] = f_24_;
	fs[7] = 0.0F;
	fs[3] = 0.0F;
	float f_26_ = -f_24_ + 1.0F;
	float[] fs_27_ = new float[9];
	float f_28_ = 1.0F;
	f_24_ = (float) i / 32767.0F;
	float f_29_ = 0.0F;
	f_26_ = 1.0F - f_24_;
	f_25_ = -(float) Math.sqrt((double) (-(f_24_ * f_24_) + 1.0F));
	float f_30_
	    = (float) Math.sqrt((double) (i_17_ * i_17_ + i_20_ * i_20_));
	if (f_30_ == 0.0F && f_24_ == 0.0F)
	    fs_23_ = fs;
	else {
	    if (f_30_ != 0.0F) {
		f_28_ = (float) -i_17_ / f_30_;
		f_29_ = (float) i_20_ / f_30_;
	    }
	    fs_27_[8] = f_24_ + f_29_ * f_29_ * f_26_;
	    fs_27_[7] = f_25_ * -f_28_;
	    fs_27_[6] = f_29_ * f_28_ * f_26_;
	    fs_27_[3] = f_25_ * -f_29_;
	    fs_27_[4] = f_24_;
	    fs_27_[5] = f_28_ * f_25_;
	    fs_27_[0] = f_26_ * (f_28_ * f_28_) + f_24_;
	    fs_27_[1] = f_25_ * f_29_;
	    fs_27_[2] = f_26_ * (f_28_ * f_29_);
	    fs_23_[0]
		= fs_27_[3] * fs[1] + fs[0] * fs_27_[0] + fs[2] * fs_27_[6];
	    fs_23_[1]
		= fs[2] * fs_27_[7] + (fs[0] * fs_27_[1] + fs[1] * fs_27_[4]);
	    fs_23_[3]
		= fs[3] * fs_27_[0] + fs_27_[3] * fs[4] + fs[5] * fs_27_[6];
	    fs_23_[2]
		= fs_27_[2] * fs[0] + fs_27_[5] * fs[1] + fs[2] * fs_27_[8];
	    fs_23_[4]
		= fs_27_[4] * fs[4] + fs_27_[1] * fs[3] + fs[5] * fs_27_[7];
	    fs_23_[5]
		= fs_27_[5] * fs[4] + fs_27_[2] * fs[3] + fs[5] * fs_27_[8];
	    fs_23_[6]
		= fs_27_[6] * fs[8] + (fs_27_[3] * fs[7] + fs[6] * fs_27_[0]);
	    fs_23_[7]
		= fs[8] * fs_27_[7] + (fs_27_[1] * fs[6] + fs_27_[4] * fs[7]);
	    fs_23_[8]
		= fs_27_[8] * fs[8] + (fs_27_[2] * fs[6] + fs[7] * fs_27_[5]);
	}
	fs_23_[7] *= f;
	fs_23_[4] *= f_21_;
	if (i_19_ != -72)
	    return null;
	fs_23_[6] *= f;
	fs_23_[1] *= f_18_;
	fs_23_[0] *= f_18_;
	fs_23_[8] *= f;
	fs_23_[5] *= f_21_;
	fs_23_[3] *= f_21_;
	fs_23_[2] *= f_18_;
	return fs_23_;
    }
    
    static {
	for (int i = 0; i < 26; i++)
	    F[i] = (char) (i + 65);
	for (int i = 26; i < 52; i++)
	    F[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    F[i] = (char) (i - 52 + 48);
	F[63] = '-';
	F[62] = '*';
	I = new Class_ae();
	J = new wea(6, 1);
	K = new pk("LIVE", 0);
    }
}
