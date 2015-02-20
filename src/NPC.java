/* Class_ac - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class NPC extends Entity
{
    static int Qc;
    int Rc = -1;
    static int Sc;
    static int Tc;
    NPCDef npcDef;
    static int Vc;
    static int Wc;
    static Class_ec Xc = new Class_ec(2);
    static int Yc;
    static int Zc;
    static int ad;
    int bd = -1;
    static int cd;
    static int dd;
    static int ed;
    static int fd;
    static int gd;
    static int hd;
    static int id;
    static int jd;
    static qfa kd = new qfa("", 11);
    static int ld;
    static int md;
    static int nd;
    
    final void b(boolean bool, Class_r class_r) {
	gd++;
	if (((NPC) this).npcDef != null
	    && (((Entity) this).Hc || a(21918, class_r, 0))) {
	    Class_q class_q = class_r.p();
	    if (bool != false)
		((NPC) this).bd = -13;
	    class_q.o(((Entity) this).class_kd.getOrientation((byte) 67));
	    class_q.U(((Animable) this).locX, ((Animable) this).j - 20, ((Animable) this).locY);
	    this.a(class_q, ((Entity) this).Hc, class_r, ((Entity) this).das,
		   (byte) -58);
	    ((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
	}
    }
    
    final int a(boolean bool) {
	Vc++;
	if (bool != false)
	    return -84;
	if (((NPCDef) ((NPC) this).npcDef).L != null) {
	    NPCDef var_du = ((NPC) this).npcDef.a(-4261, cp.e);
	    if (var_du != null && (((NPCDef) var_du).x ^ 0xffffffff) != 0)
		return ((NPCDef) var_du).x;
	}
	return ((NPCDef) ((NPC) this).npcDef).x;
    }
    
    private final boolean i(byte i) {
	if (i != 89)
	    kd = null;
	Qc++;
	return ((NPCDef) ((NPC) this).npcDef).m;
    }
    
    final sd a(Class_r class_r, int i) {
	if (i != -1660704056)
	    return null;
	cd++;
	return null;
    }
    
    final void a(boolean bool, int i, byte i_0_, Class_r class_r, Animable var_lo,
		 int i_1_, int i_2_) {
	int i_3_ = -101 % ((-50 - i_0_) / 55);
	id++;
	throw new IllegalStateException();
    }
    
    final boolean h(byte i) {
	if (i > -26)
	    return true;
	md++;
	return false;
    }
    
    final void a(boolean bool, int i, byte i_4_, int i_5_, int i_6_,
		 int i_7_) {
	ld++;
	((Animable) this).height = ((Animable) this).h = (byte) i_6_;
	if (ItemDef.b(i, i_7_, 5706))
	    ((Animable) this).h++;
	if (((Entity) this).yb != -1
	    && ((dr) Class_ef.J.c(64, ((Entity) this).yb)).k == 1) {
	    ((Entity) this).yb = -1;
	    ((Entity) this).Ab = null;
	}
	if (((Entity) this).graphicsId_ != -1) {
	    iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId_);
	    if (((iv) var_iv).d && (((iv) var_iv).w ^ 0xffffffff) != 0
		&& ((dr) Class_ef.J.c(64, ((iv) var_iv).w)).k == 1)
		((Entity) this).graphicsId_ = -1;
	}
	if (((Entity) this).graphicsId != -1) {
	    iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId);
	    if (((iv) var_iv).d && (((iv) var_iv).w ^ 0xffffffff) != 0
		&& ((dr) Class_ef.J.c(64, ((iv) var_iv).w)).k == 1)
		((Entity) this).graphicsId = -1;
	}
	if (!bool) {
	    int i_8_ = i_7_ - ((Entity) this).regionLocalX[0];
	    int i_9_ = i - ((Entity) this).regionLocalY[0];
	    if (i_8_ >= -8 && i_8_ <= 8 && i_9_ >= -8 && i_9_ <= 8) {
		if (((Entity) this).Nc < 9)
		    ((Entity) this).Nc++;
		for (int i_10_ = ((Entity) this).Nc; i_10_ > 0; i_10_--) {
		    ((Entity) this).regionLocalX[i_10_] = ((Entity) this).regionLocalX[i_10_ - 1];
		    ((Entity) this).regionLocalY[i_10_] = ((Entity) this).regionLocalY[i_10_ - 1];
		    ((Entity) this).moveTypes[i_10_] = ((Entity) this).moveTypes[i_10_ - 1];
		}
		((Entity) this).regionLocalX[0] = i_7_;
		((Entity) this).regionLocalY[0] = i;
		((Entity) this).moveTypes[0] = (byte) 1;
		return;
	    }
	}
	((Entity) this).Kc = 0;
	((Entity) this).Nc = 0;
	((Entity) this).regionLocalX[0] = i_7_;
	((Entity) this).Fc = 0;
	((Entity) this).regionLocalY[0] = i;
	((Animable) this).locX = (i_5_ << 8) + (((Entity) this).regionLocalX[0] << 9);
	((Animable) this).locY = (((Entity) this).regionLocalY[0] << 9) + (i_5_ << 8);
	if (((Entity) this).tq_ != null)
	    ((Entity) this).tq_.b();
	int i_11_ = -117 / ((i_4_ + 37) / 62);
    }
    
    static final boolean b(int i, int i_12_) {
	int i_13_ = 80 / ((-57 - i_12_) / 46);
	ed++;
	if (i < 4 || i > 8)
	    return false;
	return true;
    }
    
    public static void l(int i) {
	if (i == 18986) {
	    kd = null;
	    Xc = null;
	}
    }
    
    final int a(byte i) {
	if (i != -7)
	    b(false, null);
	fd++;
	if (((NPCDef) ((NPC) this).npcDef).L != null) {
	    NPCDef var_du = ((NPC) this).npcDef.a(i - 4254, cp.e);
	    if (var_du != null && ((NPCDef) var_du).i != -1)
		return ((NPCDef) var_du).i;
	}
	return ((NPCDef) ((NPC) this).npcDef).i;
    }
    
    final boolean m(int i) {
	int i_14_ = 63 / ((i - 55) / 41);
	dd++;
	if (((NPC) this).npcDef == null)
	    return false;
	return true;
    }
    
    final void a(int i, int i_15_, byte i_16_) {
	Tc++;
	if (i_16_ != -79)
	    ((NPC) this).bd = -76;
	int i_17_ = ((Entity) this).regionLocalX[0];
	int i_18_ = ((Entity) this).regionLocalY[0];
	if (i == 0)
	    i_18_++;
	if (i == 1) {
	    i_18_++;
	    i_17_++;
	}
	if (i == 2)
	    i_17_++;
	if (i == 3) {
	    i_17_++;
	    i_18_--;
	}
	if (i == 4)
	    i_18_--;
	if (i == 5) {
	    i_17_--;
	    i_18_--;
	}
	if (i == 6)
	    i_17_--;
	if ((((Entity) this).yb ^ 0xffffffff) != 0
	    && ((dr) Class_ef.J.c(64, ((Entity) this).yb)).k == 1) {
	    ((Entity) this).yb = -1;
	    ((Entity) this).Ab = null;
	}
	if (i == 7) {
	    i_17_--;
	    i_18_++;
	}
	if (((Entity) this).graphicsId_ != -1) {
	    iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId_);
	    if (((iv) var_iv).d && ((iv) var_iv).w != -1
		&& ((dr) Class_ef.J.c(64, ((iv) var_iv).w)).k == 1)
		((Entity) this).graphicsId_ = -1;
	}
	if ((((Entity) this).graphicsId ^ 0xffffffff) != 0) {
	    iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId);
	    if (((iv) var_iv).d && (((iv) var_iv).w ^ 0xffffffff) != 0
		&& ((dr) Class_ef.J.c(64, ((iv) var_iv).w)).k == 1)
		((Entity) this).graphicsId = -1;
	}
	if (((Entity) this).Nc < 9)
	    ((Entity) this).Nc++;
	for (int i_19_ = ((Entity) this).Nc; i_19_ > 0; i_19_--) {
	    ((Entity) this).regionLocalX[i_19_] = ((Entity) this).regionLocalX[i_19_ - 1];
	    ((Entity) this).regionLocalY[i_19_] = ((Entity) this).regionLocalY[i_19_ - 1];
	    ((Entity) this).moveTypes[i_19_] = ((Entity) this).moveTypes[i_19_ - 1];
	}
	((Entity) this).regionLocalX[0] = i_17_;
	((Entity) this).regionLocalY[0] = i_18_;
	((Entity) this).moveTypes[0] = (byte) i_15_;
    }
    
    static final void a(int i, float[] fs, int i_20_, int i_21_, int i_22_,
			int i_23_, byte i_24_) {
	Sc++;
	if (i_20_ > 0 && !ar.a(i_20_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i > 0 && !ar.a(i, (byte) 98))
	    throw new IllegalArgumentException("");
	int i_25_ = kr.a(i_21_, (byte) -116);
	int i_26_ = 0;
	int i_27_ = i_20_ >= i ? i : i_20_;
	int i_28_ = i_20_ >> 1;
	int i_29_ = i >> 1;
	float[] fs_30_ = fs;
	float[] fs_31_ = new float[i_28_ * i_29_ * i_25_];
	for (;;) {
	    OpenGL.glTexImage2Df(i_23_, i_26_, i_22_, i_20_, i, 0, i_21_, 5126,
				 fs_30_, 0);
	    if (i_27_ <= 1)
		break;
	    int i_32_ = i_20_ * i_25_;
	    for (int i_33_ = 0; i_25_ > i_33_; i_33_++) {
		int i_34_ = i_33_;
		int i_35_ = i_33_;
		int i_36_ = i_35_ + i_32_;
		for (int i_37_ = 0; i_37_ < i_29_; i_37_++) {
		    for (int i_38_ = 0; i_28_ > i_38_; i_38_++) {
			float f = fs_30_[i_35_];
			i_35_ += i_25_;
			f += fs_30_[i_35_];
			f += fs_30_[i_36_];
			i_35_ += i_25_;
			i_36_ += i_25_;
			f += fs_30_[i_36_];
			i_36_ += i_25_;
			fs_31_[i_34_] = f * 0.25F;
			i_34_ += i_25_;
		    }
		    i_36_ += i_32_;
		    i_35_ += i_32_;
		}
	    }
	    float[] fs_39_ = fs_31_;
	    fs_31_ = fs_30_;
	    i_20_ = i_28_;
	    fs_30_ = fs_39_;
	    i = i_29_;
	    i_27_ >>= 1;
	    i_29_ >>= 1;
	    i_26_++;
	    i_28_ >>= 1;
	}
	if (i_24_ != -65)
	    a(-9, null, 89, 47, -70, -119, (byte) -2);
    }
    
    public final int j(int i) {
	jd++;
	if (i != 17566)
	    ((NPC) this).bd = -105;
	if (((NPCDef) ((NPC) this).npcDef).L != null) {
	    NPCDef var_du = ((NPC) this).npcDef.a(-4261, cp.e);
	    if (var_du != null && ((NPCDef) var_du).xb != -1)
		return ((NPCDef) var_du).xb;
	}
	if (((NPCDef) ((NPC) this).npcDef).xb == -1)
	    return super.j(17566);
	return ((NPCDef) ((NPC) this).npcDef).xb;
    }
    
    private final boolean a(int i, Class_r class_r, int i_40_) {
	Yc++;
	int i_41_ = i_40_;
	cg var_cg = this.k(32195);
	dr var_dr = ((((Entity) this).yb ^ 0xffffffff) != 0 && ((Entity) this).oc == 0
		     ? Class_ef.J.c(64, ((Entity) this).yb) : null);
	dr var_dr_42_
	    = ((((Entity) this).Bc ^ 0xffffffff) != 0 && (!((Entity) this).V
						      || var_dr == null)
	       ? Class_ef.J.c(i ^ 0x55de, ((Entity) this).Bc) : null);
	int i_43_ = ((cg) var_cg).i;
	int i_44_ = ((cg) var_cg).W;
	if (i_43_ != 0 || i_44_ != 0 || ((cg) var_cg).O != 0
	    || ((cg) var_cg).C != 0)
	    i_40_ |= 0x7;
	boolean bool = (((Entity) this).Xb != 0 && pm.currentTimedTicks >= ((Entity) this).zc
			&& pm.currentTimedTicks < ((Entity) this).Cb);
	if (i != 21918)
	    ((NPC) this).Rc = 23;
	if (bool)
	    i_40_ |= 0x80000;
	da var_da
	    = (((Entity) this).das[0]
	       = ((NPC) this).npcDef.a(((Entity) this).yc, ((Entity) this).rc,
					((Entity) this).W, hs.f, ((Entity) this).hc,
					((Entity) this).ic, var_dr_42_, 13770,
					((Entity) this).Ib, var_dr, Class_ef.J,
					i_40_, ((Entity) this).ans, class_r, cp.e));
	if (var_da == null)
	    return false;
	((Entity) this).Ac = var_da.J();
	((Entity) this).cc = var_da.RA();
	this.a((byte) -34, var_da);
	int i_45_ = ((Entity) this).class_kd.getOrientation((byte) 67);
	if (i_43_ != 0 || i_44_ != 0) {
	    this.a(i - 24830, i_45_, i_43_, ((cg) var_cg).D, i_44_,
		   ((cg) var_cg).U);
	    if (((Entity) this).ec != 0)
		((Entity) this).das[0].MA(((Entity) this).ec);
	    if (((Entity) this).R != 0)
		((Entity) this).das[0].W(((Entity) this).R);
	    if (((Entity) this).pb != 0)
		((Entity) this).das[0].oa(0, ((Entity) this).pb, 0);
	} else
	    this.a(-2912, i_45_, this.i((int) -1) << 9, 0,
		   this.i((int) -1) << 9, 0);
	if (bool)
	    var_da.a(((Entity) this).vb, ((Entity) this).Mb, ((Entity) this).Tb,
		     0xff & ((Entity) this).Xb);
	if (((Entity) this).graphicsId_ == -1 || ((Entity) this).kc == -1)
	    ((Entity) this).das[1] = null;
	else {
	    iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId_);
	    boolean bool_46_
		= ((iv) var_iv).r == 3 && (i_43_ != 0 || i_44_ != 0);
	    int i_47_ = i_41_;
	    if (!bool_46_) {
		if (((Entity) this).rotation_ != 0)
		    i_47_ |= 0x5;
		if (((Entity) this).Pb != 0)
		    i_47_ |= 0x2;
	    } else
		i_47_ |= 0x7;
	    da var_da_48_
		= (((Entity) this).das[1]
		   = var_iv.a(((Entity) this).Ob, class_r, i - 21806, Class_ef.J,
			      ((Entity) this).kc, i_47_, ((Entity) this).qb));
	    if (var_da_48_ != null) {
		if (((Entity) this).Pb != 0)
		    var_da_48_.oa(0, -((Entity) this).Pb << 2, 0);
		if (((Entity) this).rotation_ != 0)
		    var_da_48_.M(2048 * ((Entity) this).rotation_);
		if (bool_46_) {
		    if (((Entity) this).ec != 0)
			var_da_48_.MA(((Entity) this).ec);
		    if (((Entity) this).R != 0)
			var_da_48_.W(((Entity) this).R);
		    if (((Entity) this).pb != 0)
			var_da_48_.oa(0, ((Entity) this).pb, 0);
		}
	    }
	}
	if (((Entity) this).graphicsId == -1 || ((Entity) this).mb == -1)
	    ((Entity) this).das[2] = null;
	else {
	    iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId);
	    boolean bool_49_
		= ((iv) var_iv).r == 3 && (i_43_ != 0 || i_44_ != 0);
	    int i_50_ = i_41_;
	    if (bool_49_)
		i_50_ |= 0x7;
	    else {
		if (((Entity) this).rotation != 0)
		    i_50_ |= 0x5;
		if (((Entity) this).delayAndHeight != 0)
		    i_50_ |= 0x2;
	    }
	    da var_da_51_
		= (((Entity) this).das[2]
		   = var_iv.a(Class_ef.J, 79, class_r, ((Entity) this).P, i_50_,
			      ((Entity) this).mb, ((Entity) this).pc));
	    if (var_da_51_ != null) {
		if (((Entity) this).delayAndHeight != 0)
		    var_da_51_.oa(0, -((Entity) this).delayAndHeight << 2, 0);
		if (((Entity) this).rotation != 0)
		    var_da_51_.M(((Entity) this).rotation * 2048);
		if (bool_49_) {
		    if (((Entity) this).ec != 0)
			var_da_51_.MA(((Entity) this).ec);
		    if (((Entity) this).R != 0)
			var_da_51_.W(((Entity) this).R);
		    if (((Entity) this).pb != 0)
			var_da_51_.oa(0, ((Entity) this).pb, 0);
		}
	    }
	}
	return true;
    }
    
    final void d(int i) {
	Wc++;
	if (i == -1)
	    throw new IllegalStateException();
    }
    
    final og a(boolean bool, Class_r class_r) {
	ad++;
	if (((NPC) this).npcDef == null || !a(21918, class_r, 2048))
	    return null;
	Class_q class_q = class_r.p();
	int i = ((Entity) this).class_kd.getOrientation((byte) 67);
	class_q.o(i);
	vf var_vf = (ol.p[((Animable) this).height][((Animable) this).locX >> Class_fb.a]
		     [((Animable) this).locY >> Class_fb.a]);
	if (var_vf != null && ((vf) var_vf).m != null) {
	    int i_52_ = ((Entity) this).db - ((dfa) ((vf) var_vf).m).x;
	    ((Entity) this).db -= (float) i_52_ / 10.0F;
	} else
	    ((Entity) this).db -= (float) ((Entity) this).db / 10.0F;
	class_q.U(((Animable) this).locX, ((Animable) this).j - ((Entity) this).db - 20,
		  ((Animable) this).locY);
	cg var_cg = this.k(32195);
	NPCDef var_du
	    = (((NPCDef) ((NPC) this).npcDef).L == null ? ((NPC) this).npcDef
	       : ((NPC) this).npcDef.a(-4261, cp.e));
	((Entity) this).Oc = bool;
	if (((jb) cs.g).t && ((NPCDef) var_du).f && ((cg) var_cg).k) {
	    dr var_dr = (((Entity) this).yb == -1 || ((Entity) this).oc != 0 ? null
			 : Class_ef.J.c(64, ((Entity) this).yb));
	    dr var_dr_53_
		= (((Entity) this).Bc != -1 && (!((Entity) this).V || var_dr == null)
		   ? Class_ef.J.c(64, ((Entity) this).Bc) : null);
	    da var_da
		= cg.a(((NPCDef) ((NPC) this).npcDef).qb & 0xff, i,
		       ((Entity) this).das[0], ((NPCDef) ((NPC) this).npcDef).n & 0xff,
		       ((NPCDef) ((NPC) this).npcDef).rb & 0xffff,
		       ((NPCDef) ((NPC) this).npcDef).Q, ((Entity) this).R, class_r,
		       ((NPCDef) ((NPC) this).npcDef).V & 0xffff, ((Entity) this).ec,
		       ((Entity) this).pb, false,
		       var_dr_53_ == null ? ((Entity) this).yc : ((Entity) this).Ib,
		       var_dr_53_ != null ? var_dr_53_ : var_dr);
	    if (var_da != null) {
		((Entity) this).Oc = true;
		class_r.ZA(false);
		if (ml.k)
		    var_da.a(class_q, null, Class_pd.r, 0);
		else
		    var_da.a(class_q, null, 0);
		class_r.ZA(true);
	    }
	}
	class_q.o(i);
	class_q.U(((Animable) this).locX, ((Animable) this).j - 5 - ((Entity) this).db,
		  ((Animable) this).locY);
	og var_og = null;
	if (i((byte) 89))
	    var_og = lf.a(true, ((Entity) this).das.length);
	this.a(class_q, false, class_r, ((Entity) this).das, (byte) -100);
	if (ml.k) {
	    for (int i_54_ = 0; i_54_ < ((Entity) this).das.length; i_54_++) {
		if (((Entity) this).das[i_54_] != null)
		    ((Entity) this).das[i_54_].a(class_q,
					    (var_og == null ? null
					     : ((og) var_og).g[i_54_]),
					    Class_pd.r, 0);
	    }
	} else {
	    for (int i_55_ = 0; i_55_ < ((Entity) this).das.length; i_55_++) {
		if (((Entity) this).das[i_55_] != null)
		    ((Entity) this).das[i_55_].a(class_q,
					    (var_og != null
					     ? ((og) var_og).g[i_55_] : null),
					    0);
	    }
	}
	if (((Entity) this).tq_ != null) {
	    ir var_ir = ((Entity) this).tq_.g();
	    if (ml.k)
		class_r.a(var_ir, Class_pd.r);
	    else
		class_r.a(var_ir);
	}
	for (int i_56_ = 0; i_56_ < ((Entity) this).das.length; i_56_++) {
	    if (((Entity) this).das[i_56_] != null)
		((Entity) this).Oc |= ((Entity) this).das[i_56_].LA();
	}
	((Entity) this).Wb = sh.j;
	((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
	return var_og;
    }
    
    public NPC() {
	/* empty */
    }
    
    final void a(NPCDef var_du, int i) {
	if (i != 0)
	    m(85);
	nd++;
	((NPC) this).npcDef = var_du;
	if (((Entity) this).tq_ != null)
	    ((Entity) this).tq_.b();
    }
    
    final boolean a(int i, int i_57_, Class_r class_r, int i_58_) {
	Zc++;
	if (((NPC) this).npcDef == null || !a(21918, class_r, 131072))
	    return false;
	Class_q class_q = class_r.p();
	int i_59_ = ((Entity) this).class_kd.getOrientation((byte) 67);
	class_q.o(i_59_);
	class_q.U(((Animable) this).locX, ((Animable) this).j, ((Animable) this).locY);
	boolean bool = false;
	if (i_58_ != 9678)
	    return true;
	for (int i_60_ = 0; i_60_ < ((Entity) this).das.length; i_60_++) {
	    if (((Entity) this).das[i_60_] != null) {
		boolean bool_61_
		    = ((((NPCDef) ((NPC) this).npcDef).O ^ 0xffffffff) != 0
		       ? ((NPCDef) ((NPC) this).npcDef).O == 1
		       : ((NPCDef) ((NPC) this).npcDef).Q == 1);
		boolean bool_62_;
		if (ml.k)
		    bool_62_ = ((Entity) this).das[i_60_].a(i, i_57_, class_q,
						       bool_61_, Class_pd.r);
		else
		    bool_62_
			= ((Entity) this).das[i_60_].a(i, i_57_, class_q, bool_61_);
		if (bool_62_) {
		    bool = true;
		    break;
		}
	    }
	}
	((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
	return bool;
    }
}
