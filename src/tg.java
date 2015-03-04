/* tg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class tg extends fu implements ls
{
    static int C;
    static bga D = null;
    static int E;
    static int F;
    static Class_q G;
    static int H;
    private int I;
    static int J;
    static int K;
    static int L;
    static int[] M;
    static int N;
    static int O;
    static int P;
    private int Q;
    static int R;
    
    public final boolean a(boolean bool) {
	N++;
	if (bool != true)
	    a(false, 1.374529F);
	return true;
    }
    
    tg(lm var_lm, int i, int i_0_, boolean bool, int[] is, int i_1_,
       int i_2_) {
	super(var_lm, 3553, nda.h, bt.g, i_0_ * i, bool);
	Q = i;
	I = i_0_;
	((fu) this).d.a(this, 0);
	if (!bool || i_2_ != 0 || i_1_ != 0) {
	    OpenGL.glPixelStorei(3314, i_2_);
	    OpenGL.glTexImage2Di(((fu) this).u, 0, 6408, Q, I, 0, 32993,
				 ((lm) ((fu) this).d).ti, is, i_1_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    this.a(i, (byte) -106, ((fu) this).u, is, i_0_);
    }
    
    public final void a(int i, byte i_3_, int i_4_, int[] is, int i_5_,
			int i_6_, int i_7_, int i_8_) {
	((fu) this).d.a(this, i_3_ ^ 0x4b);
	K++;
	OpenGL.glPixelStorei(3314, i_4_);
	OpenGL.glTexSubImage2Di(((fu) this).u, 0, i_5_, i_8_, i_6_, i_7_,
				32993, ((lm) ((fu) this).d).ti, is, i);
	if (i_3_ != 75)
	    M = null;
	OpenGL.glPixelStorei(3314, 0);
    }
    
    static final int a(int i, int i_9_, int i_10_) {
	if (i_9_ <= 10)
	    M = null;
	E++;
	int i_11_ = i_10_ >> 31 & i - 1;
	return i_11_ + ((i_10_ >>> 31) + i_10_) % i;
    }
    
    public final float a(boolean bool, float f) {
	L++;
	if (bool != false)
	    a(-108, (byte[]) null, null, -81, -53, -88, -33, 97, -101);
	return f / (float) Q;
    }
    
    tg(lm var_lm, Class_ec class_ec, int i, int i_12_, boolean bool,
       float[] fs, int i_13_, int i_14_) {
	super(var_lm, 3553, class_ec, bt.k, i_12_ * i, bool);
	I = i_12_;
	Q = i;
	((fu) this).d.a(this, 0);
	if (bool || i_14_ != 0 || i_13_ != 0) {
	    OpenGL.glPixelStorei(3314, i_14_);
	    OpenGL.glTexImage2Df(((fu) this).u, 0, this.e(26701), i, i_12_, 0,
				 Animable.a(6407, ((fu) this).o), 5126, fs,
				 4 * i_13_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    this.a(i_12_, i, (byte) 117, fs, ((fu) this).u);
    }
    
    tg(lm var_lm, Class_ec class_ec, int i, int i_15_, boolean bool, byte[] is,
       int i_16_, int i_17_) {
	super(var_lm, 3553, class_ec, bt.g, i * i_15_, bool);
	Q = i;
	I = i_15_;
	((fu) this).d.a(this, 0);
	OpenGL.glPixelStorei(3317, 1);
	if (!bool || i_17_ != 0 || i_16_ != 0) {
	    OpenGL.glPixelStorei(3314, i_17_);
	    OpenGL.glTexImage2Dub(((fu) this).u, 0, this.e(26701), i, i_15_, 0,
				  Animable.a(6407, ((fu) this).o), 5121, is, i_16_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    this.a(((fu) this).u, i, is, i_15_, (byte) -33);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    static final String a(Interface var_kp, byte i) {
	F++;
	int i_18_ = 55 % ((-33 - i) / 56);
	if (client.c(var_kp).a(-1035661311) == 0)
	    return null;
	if (((Interface) var_kp).G == null || ((Interface) var_kp).G.trim().length() == 0) {
	    if (lba.qa_op_test)
		return "Hidden-use";
	    return null;
	}
	return ((Interface) var_kp).G;
    }
    
    public final void a(int i, byte[] is, Class_ec class_ec, int i_19_,
			int i_20_, int i_21_, int i_22_, int i_23_,
			int i_24_) {
	((fu) this).d.a(this, 0);
	C++;
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_21_);
	OpenGL.glTexSubImage2Dub(((fu) this).u, 0, i_24_, i_19_, i_20_, i_23_,
				 Animable.a(6407, class_ec), 5121, is, i);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
	if (i_22_ != 996)
	    a((byte) -57);
    }
    
    public final float a(float f, byte i) {
	if (i != -59)
	    return 1.0254947F;
	P++;
	return f / (float) I;
    }
    
    public final void a(byte i, boolean bool, boolean bool_25_) {
	((fu) this).d.a(this, i ^ ~0x50);
	O++;
	OpenGL.glTexParameteri(((fu) this).u, 10242,
			       !bool_25_ ? 33071 : 10497);
	OpenGL.glTexParameteri(((fu) this).u, 10243, bool ? 10497 : 33071);
	if (i != -81)
	    a(45, (byte[]) null, null, -84, -109, 2, 82, 114, 105);
    }
    
    public final int b(int i) {
	H++;
	if (i != -3537)
	    M = null;
	return I;
    }
    
    public final int a(byte i) {
	J++;
	if (i <= 53)
	    a((Interface) null, (byte) 0);
	return Q;
    }
    
    final void a(int i, float[] fs, Class_ec class_ec, int i_26_, int i_27_,
		 int i_28_, int i_29_, int i_30_, int i_31_) {
	((fu) this).d.a(this, 0);
	R++;
	OpenGL.glPixelStorei(i_30_, i_31_);
	OpenGL.glTexSubImage2Df(((fu) this).u, 0, i, i_27_, i_29_, i_28_,
				Animable.a(i_30_ ^ 0x15f5, class_ec), 5121, fs,
				i_26_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    tg(lm var_lm, Class_ec class_ec, bt var_bt, int i, int i_32_) {
	super(var_lm, 3553, class_ec, var_bt, i * i_32_, false);
	I = i_32_;
	Q = i;
	((fu) this).d.a(this, 0);
	OpenGL.glTexImage2Dub(((fu) this).u, 0, this.e(26701), i, i_32_, 0,
			      Animable.a(6407, ((fu) this).o),
			      Class_kf.a(((fu) this).x, 59), null, 0);
    }
    
    public static void g(int i) {
	G = null;
	M = null;
	if (i != 3317)
	    M = null;
    }
}
