/* ga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class ga extends fu implements ls
{
    static int C;
    static int D;
    static int E;
    static int F;
    private int G;
    static int H;
    static int I;
    static int J;
    private int K;
    static int L;
    static int M;
    static int N;
    static int O;
    
    ga(lm var_lm, int i, int i_0_, int[] is, int i_1_, int i_2_) {
	super(var_lm, 34037, nda.h, bt.g, i_0_ * i, false);
	G = i_0_;
	K = i;
	((fu) this).d.a(this, 0);
	OpenGL.glPixelStorei(3314, i_2_);
	OpenGL.glTexImage2Di(((fu) this).u, 0, 6408, K, G, 0, 32993,
			     ((lm) ((fu) this).d).ti, is, 4 * i_1_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    ga(lm var_lm, Class_ec class_ec, int i, int i_3_, float[] fs, int i_4_,
       int i_5_) {
	super(var_lm, 34037, class_ec, bt.k, i_3_ * i, false);
	K = i;
	G = i_3_;
	((fu) this).d.a(this, 0);
	OpenGL.glPixelStorei(3314, i_5_);
	OpenGL.glTexImage2Df(((fu) this).u, 0, this.e(26701), i, i_3_, 0,
			     Animable.a(6407, ((fu) this).o), 5126, fs, 4 * i_4_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    static final int[] a(int i, boolean bool, int i_6_, byte i_7_, int i_8_,
			 float f, int i_9_, int i_10_) {
	D++;
	int[] is = new int[i];
	vd var_vd = new vd();
	if (i_7_ != -9)
	    return null;
	((vd) var_vd).K = i_10_;
	((vd) var_vd).W = bool;
	((vd) var_vd).H = i_8_;
	((vd) var_vd).M = i_9_;
	((vd) var_vd).J = (int) (4096.0F * f);
	((vd) var_vd).Q = i_6_;
	var_vd.b((int) -69);
	im.a((int) 1, (byte) -124, i);
	var_vd.a(0, (byte) 31, is);
	return is;
    }
    
    public final float a(float f, byte i) {
	F++;
	if (i != -59)
	    K = -23;
	return f;
    }
    
    ga(lm var_lm, Class_ec class_ec, int i, int i_11_, byte[] is, int i_12_,
       int i_13_) {
	super(var_lm, 34037, class_ec, bt.g, i * i_11_, false);
	G = i_11_;
	K = i;
	((fu) this).d.a(this, 0);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_13_);
	OpenGL.glTexImage2Dub(((fu) this).u, 0, this.e(26701), i, i_11_, 0,
			      Animable.a(6407, ((fu) this).o), 5121, is, i_12_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public final boolean a(boolean bool) {
	N++;
	if (bool != true)
	    return true;
	return false;
    }
    
    public final void a(byte i, boolean bool, boolean bool_14_) {
	if (i == -81)
	    C++;
    }
    
    ga(lm var_lm, Class_ec class_ec, bt var_bt, int i, int i_15_) {
	super(var_lm, 34037, class_ec, var_bt, i * i_15_, false);
	K = i;
	G = i_15_;
	((fu) this).d.a(this, 0);
	OpenGL.glTexImage2Dub(((fu) this).u, 0, this.e(26701), i, i_15_, 0,
			      Animable.a(6407, ((fu) this).o),
			      Class_kf.a(((fu) this).x, 93), null, 0);
    }
    
    public final int a(byte i) {
	if (i < 53)
	    a((byte) 115);
	M++;
	return K;
    }
    
    public final void a(int i, byte[] is, Class_ec class_ec, int i_16_,
			int i_17_, int i_18_, int i_19_, int i_20_,
			int i_21_) {
	if (i_19_ == 996) {
	    H++;
	    if (i_18_ == 0)
		i_18_ = i_17_;
	    ((fu) this).d.a(this, 0);
	    OpenGL.glPixelStorei(3317, 1);
	    if (i_18_ != i_17_)
		OpenGL.glPixelStorei(3314, i_18_);
	    OpenGL.glTexSubImage2Dub(((fu) this).u, 0, i_21_, i_16_, i_17_,
				     i_20_, Animable.a(6407, class_ec), 5121, is, i);
	    if (i_17_ != i_18_)
		OpenGL.glPixelStorei(3314, 0);
	    OpenGL.glPixelStorei(3317, 4);
	}
    }
    
    static final void a(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			int i_26_, String string, int i_27_) {
	L++;
	rm var_rm = new rm();
	((rm) var_rm).h = i_24_ + pm.currentTimedTicks;
	((rm) var_rm).i = i_22_;
	if (i == 4) {
	    ((rm) var_rm).l = i_23_;
	    ((rm) var_rm).m = i_25_;
	    ((rm) var_rm).p = string;
	    ((rm) var_rm).k = i_26_;
	    ((rm) var_rm).var_n = i_27_;
	    gs.v.a(var_rm, i + 108);
	}
    }
    
    public final void a(int i, byte i_28_, int i_29_, int[] is, int i_30_,
			int i_31_, int i_32_, int i_33_) {
	I++;
	((fu) this).d.a(this, 0);
	if (i_29_ == 0)
	    i_29_ = i_31_;
	if (i_29_ != i_31_)
	    OpenGL.glPixelStorei(3314, i_29_);
	if (i_28_ == 75) {
	    OpenGL.glTexSubImage2Di(((fu) this).u, 0, i_30_, i_33_, i_31_,
				    i_32_, 32993, ((lm) ((fu) this).d).ti, is,
				    i);
	    if (i_31_ != i_29_)
		OpenGL.glPixelStorei(3314, 0);
	}
    }
    
    public final int b(int i) {
	O++;
	if (i != -3537)
	    K = 69;
	return G;
    }
    
    public final float a(boolean bool, float f) {
	E++;
	if (bool != false)
	    a(82, null, null, 103, -69, -108, 18, -77, 64);
	return f;
    }
}
