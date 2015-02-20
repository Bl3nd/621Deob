/* pm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

class pm extends rg
{
    static int s;
    static int t;
    int u;
    static la v;
    static int w;
    static long x = 0L;
    static int y;
    static int z;
    static int A;
    public static int currentTimedTicks;
    static float C;
    static int D;
    static int E;
    static float F = 1024.0F;
    int G;
    private int H = -1;
    static int I;
    static int J;
    static float K;
    private int L = -1;
    
    static final aea a(int i, BytesParser var_es) {
	I++;
	if (i != 0)
	    F = -1.0086068F;
	tm var_tm = tda.a(var_es, 78);
	int i_0_ = var_es.readShort2(86);
	return new aea(((iea) var_tm).m, ((iea) var_tm).j, ((iea) var_tm).k,
		       ((iea) var_tm).d, ((iea) var_tm).i, ((iea) var_tm).e,
		       ((iea) var_tm).g, ((iea) var_tm).b, ((iea) var_tm).f,
		       ((tm) var_tm).u, ((tm) var_tm).w, ((tm) var_tm).q,
		       ((tm) var_tm).n, ((tm) var_tm).r, ((tm) var_tm).z,
		       i_0_);
    }
    
    static final void a(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
	jga.v = i;
	if (i_4_ != 0)
	    d(-125);
	Class_md.h = i_2_;
	Class_db.o = i_3_;
	E++;
	vaa.xb = i_1_;
    }
    
    final void a(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_,
		 int i_9_, int i_10_, byte[] is, int i_11_) {
	t++;
	if (i == 0)
	    i = i_11_;
	if (bool) {
	    int i_12_ = kr.a(i_5_, (byte) -56);
	    int i_13_ = i_12_ * i_11_;
	    int i_14_ = i_12_ * i;
	    byte[] is_15_ = new byte[i_13_ * i_8_];
	    for (int i_16_ = 0; i_8_ > i_16_; i_16_++) {
		int i_17_ = i_13_ * i_16_;
		int i_18_ = i_14_ * (i_8_ + (-i_16_ - 1)) + i_6_;
		for (int i_19_ = 0; i_19_ < i_13_; i_19_++)
		    is_15_[i_17_++] = is[i_18_++];
	    }
	    is = is_15_;
	}
	((rg) this).o.a(this, -2);
	OpenGL.glPixelStorei(3317, 1);
	if (i != i_11_)
	    OpenGL.glPixelStorei(3314, i);
	OpenGL.glTexSubImage2Dub(((rg) this).i, 0, i_10_, i_7_, i_11_, i_8_,
				 i_5_, 5121, is, i_6_);
	if (i_9_ != 3314)
	    a(-126, -49, -49, -57, true, 21, -104, -68, null, -103);
	if (i != i_11_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    final void a(int i, byte i_20_, int i_21_, int i_22_, int i_23_, int i_24_,
		 int i_25_) {
	if (i_20_ == 40) {
	    J++;
	    int i_26_ = -i_25_ - i_21_ + ((qj) ((rg) this).o).ib;
	    ((rg) this).o.a(this, -2);
	    OpenGL.glCopyTexSubImage2D(((rg) this).i, 0, i,
				       -i_23_ - i_25_ + ((pm) this).G, i_22_,
				       i_26_, i_24_, i_25_);
	    OpenGL.glFlush();
	}
    }
    
    public final void a(int i) {
	OpenGL.glFramebufferTexture2DEXT(L, H, ((rg) this).i, 0, 0);
	z++;
	H = -1;
	L = -1;
	if (i != 29468)
	    K = -0.5307147F;
    }
    
    pm(qj var_qj, int i, int i_27_, int i_28_, int i_29_, boolean bool,
       byte[] is, int i_30_, boolean bool_31_) {
	super(var_qj, i, i_27_, i_29_ * i_28_, bool);
	((pm) this).G = i_29_;
	((pm) this).u = i_28_;
	if (bool_31_) {
	    byte[] is_32_ = new byte[is.length];
	    for (int i_33_ = 0; i_29_ > i_33_; i_33_++) {
		int i_34_ = i_33_ * i_28_;
		int i_35_ = i_28_ * (-i_33_ - 1 + i_29_);
		for (int i_36_ = 0; i_28_ > i_36_; i_36_++)
		    is_32_[i_34_++] = is[i_35_++];
	    }
	    is = is_32_;
	}
	((rg) this).o.a(this, -2);
	OpenGL.glPixelStorei(3317, 1);
	if (bool && ((rg) this).i != 34037) {
	    ufa.a(i, i_28_, i_30_, is, true, i_29_, i_27_);
	    this.a(true, 3);
	} else {
	    OpenGL.glTexImage2Dub(((rg) this).i, 0, ((rg) this).k,
				  ((pm) this).u, ((pm) this).G, 0, i_30_, 5121,
				  is, 0);
	    this.a(false, 3);
	}
	OpenGL.glPixelStorei(3317, 4);
	this.b(true, 17137);
    }
    
    pm(qj var_qj, int i, int i_37_, int i_38_, int i_39_) {
	super(var_qj, i, i_37_, i_38_ * i_39_, false);
	((pm) this).u = i_38_;
	((pm) this).G = i_39_;
	((rg) this).o.a(this, -2);
	OpenGL.glTexImage2Dub(((rg) this).i, 0, ((rg) this).k, i_38_, i_39_, 0,
			      ek.b(((rg) this).k, (byte) 29), 5121, null, 0);
	this.b(true, 17137);
    }
    
    pm(qj var_qj, int i, int i_40_, int i_41_, int i_42_, boolean bool,
       int[] is, boolean bool_43_) {
	super(var_qj, i, i_40_, i_41_ * i_42_, bool);
	((pm) this).G = i_42_;
	((pm) this).u = i_41_;
	if (bool_43_) {
	    int[] is_44_ = new int[is.length];
	    for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
		int i_46_ = i_41_ * i_45_;
		int i_47_ = (i_42_ - 1 - i_45_) * i_41_;
		for (int i_48_ = 0; i_48_ < i_41_; i_48_++)
		    is_44_[i_46_++] = is[i_47_++];
	    }
	    is = is_44_;
	}
	((rg) this).o.a(this, -2);
	if (bool && ((rg) this).i != 34037) {
	    sa.a(((rg) this).i, ((rg) this).k, ((pm) this).u, 160,
		 ((pm) this).G, 32993, is, ((qj) ((rg) this).o).Zg);
	    this.a(true, 3);
	} else {
	    OpenGL.glTexImage2Di(((rg) this).i, 0, ((rg) this).k,
				 ((pm) this).u, ((pm) this).G, 0, 32993,
				 ((qj) ((rg) this).o).Zg, is, 0);
	    this.a(false, 3);
	}
	this.b(true, 17137);
    }
    
    final void a(int i, int i_49_, int i_50_, int i_51_, boolean bool,
		 int i_52_, int i_53_, int[] is, int i_54_) {
	if (i_53_ == 0)
	    i_53_ = i_51_;
	A++;
	if (i > 86) {
	    if (bool) {
		int[] is_55_ = new int[i_52_ * i_51_];
		for (int i_56_ = 0; i_56_ < i_52_; i_56_++) {
		    int i_57_ = i_56_ * i_51_;
		    int i_58_ = i_54_ + (-i_56_ - 1 + i_52_) * i_53_;
		    for (int i_59_ = 0; i_59_ < i_51_; i_59_++)
			is_55_[i_57_++] = is[i_58_++];
		}
		is = is_55_;
	    }
	    ((rg) this).o.a(this, -2);
	    if (i_53_ != i_51_)
		OpenGL.glPixelStorei(3314, i_53_);
	    OpenGL.glTexSubImage2Di(((rg) this).i, 0, i_50_, i_49_, i_51_,
				    i_52_, 32993, ((qj) ((rg) this).o).Zg, is,
				    i_54_);
	    if (i_51_ != i_53_)
		OpenGL.glPixelStorei(3314, 0);
	}
    }
    
    public static void c(byte i) {
	v = null;
	if (i > -82)
	    a(-54, -9, -73, -3, -107);
    }
    
    pm(qj var_qj, int i, int i_60_, int i_61_, int i_62_, boolean bool,
       float[] fs, int i_63_) {
	super(var_qj, i, i_60_, i_62_ * i_61_, bool);
	((pm) this).G = i_62_;
	((pm) this).u = i_61_;
	((rg) this).o.a(this, -2);
	if (bool && ((rg) this).i != 34037) {
	    NPC.a(i_62_, fs, i_61_, i_63_, i_60_, i, (byte) -65);
	    this.a(true, 3);
	} else {
	    OpenGL.glTexImage2Df(((rg) this).i, 0, ((rg) this).k,
				 ((pm) this).u, ((pm) this).G, 0, i_63_, 5126,
				 fs, 0);
	    this.a(false, 3);
	}
	this.b(true, 17137);
    }
    
    pm(qj var_qj, int i, int i_64_, int i_65_, int i_66_, int i_67_) {
	super(var_qj, i, 6407, i_66_ * i_67_, false);
	((pm) this).u = i_66_;
	((pm) this).G = i_67_;
	int i_68_ = ((qj) ((rg) this).o).ib - i_65_ - i_67_;
	((rg) this).o.a(this, -2);
	OpenGL.glCopyTexImage2D(((rg) this).i, 0, ((rg) this).k, i_64_, i_68_,
				i_66_, i_67_, 0);
	this.b(true, 17137);
    }
    
    final void a(int i, int i_69_, int i_70_, byte i_71_) {
	D++;
	OpenGL.glFramebufferTexture2DEXT(i_69_, i_70_, ((rg) this).i,
					 ((rg) this).q, i);
	L = i_69_;
	if (i_71_ > 67)
	    H = i_70_;
    }
    
    static final String d(int i) {
	if (i != -9316)
	    return null;
	y++;
	String string = "www";
	if (hs.modeWhere != ia.o) {
	    if (hs.modeWhere == dp.g)
		string = "www-wtqa";
	    else if (hs.modeWhere == Class_g.modeWhere)
		string = "www-wtwip";
	} else
	    string = "www-wtrc";
	String string_72_ = "";
	if (ow.settings != null)
	    string_72_ = "/p=" + ow.settings;
	return ("http://" + string + "." + ((Class_rf) me.q).g + ".com/width="
		+ cba.languageID + "/nullLoader=" + hl.affId + string_72_ + "/");
    }
    
    final void a(boolean bool, byte i, boolean bool_73_) {
	if (((rg) this).i == 3553) {
	    ((rg) this).o.a(this, -2);
	    OpenGL.glTexParameteri(((rg) this).i, 10242,
				   !bool_73_ ? 33071 : 10497);
	    OpenGL.glTexParameteri(((rg) this).i, 10243, bool ? 10497 : 33071);
	}
	if (i < -6)
	    w++;
    }
    
    static {
	currentTimedTicks = 0;
    }
}
