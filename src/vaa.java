/* vaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

import jaggl.OpenGL;

final class vaa extends da
{
    private int p;
    static int q;
    static int r;
    static int s;
    static int t;
    private short u;
    private short[] v;
    private short w;
    static int x;
    static int y;
    static int z;
    static int A;
    private rda[] B;
    static int C;
    static int D;
    private int E;
    private ik[] F;
    private byte[] G;
    static int H;
    static int I;
    private boolean J = true;
    private gv K;
    static int L;
    static int M;
    private short[] N;
    private nl O;
    private short[] P;
    static int Q;
    private short[] R;
    static int S;
    static int T;
    static int U;
    private short V;
    private int W = 0;
    private int[] X;
    private short Y;
    private short[] Z;
    static int ab;
    static int bb;
    private short[] cb;
    private gv db;
    private byte eb;
    static int fb;
    static int gb;
    static int hb;
    private qj ib;
    static int jb;
    private byte[] kb;
    private short[] lb;
    static int setInterfaceConfigs;
    static int nb;
    private int ob;
    private hi[] pb;
    static int qb;
    static float[][] rb;
    private int[][] sb;
    static int tb;
    private short ub;
    private gv vb;
    private short[] wb;
    static int xb = 0;
    private int[][] yb;
    private float[] zb;
    private int[] Ab;
    static int Bb;
    private qg[] Cb;
    static int Db;
    static int Eb;
    private gv Fb;
    private int[][] Gb;
    private short[] Hb;
    private short[] Ib;
    static int Jb;
    static int Kb;
    static int Lb;
    static int Mb;
    static int Nb;
    static int Ob;
    private iq Pb;
    static int Qb;
    static int Rb;
    static int Sb;
    static int Tb;
    static int Ub;
    static int Vb;
    private short[] Wb;
    private int[] Xb;
    static int Yb;
    private short Zb;
    private boolean ac = false;
    private int bc = 0;
    static int cc;
    static int dc;
    static int ec;
    static int fc;
    private short gc;
    static int hc;
    static int ic;
    static int jc;
    static int kc;
    private short lc;
    private int mc = 0;
    private int[] nc;
    private short oc;
    static int pc;
    private int qc = 0;
    private int[] rc;
    private dw sc;
    private eh tc;
    private float[] uc;
    private int vc = 0;
    static int wc;
    private short xc;
    private boolean yc = false;
    static int zc;
    static int Ac;
    static int Bc;
    static int Cc;
    static int Dc;
    
    final boolean b() {
	Kb++;
	if (wb == null)
	    return true;
	for (int i = 0; wb.length > i; i++) {
	    if (wb[i] != -1 && !((Class_r) ib).j.a(false, wb[i]))
		return false;
	}
	return true;
    }
    
    final void a(Class_q class_q) {
	Rb++;
	Class_db class_db = (Class_db) class_q;
	if (pb != null) {
	    for (int i = 0; pb.length > i; i++) {
		hi var_hi = pb[i];
		hi var_hi_0_ = var_hi;
		if (((hi) var_hi).f != null)
		    var_hi_0_ = ((hi) var_hi).f;
		((hi) var_hi_0_).j = (int) ((((Class_db) class_db).x
					     * (float) Ab[((hi) var_hi).d])
					    + ((((Class_db) class_db).A
						* (float) nc[((hi) var_hi).d])
					       + ((float) Xb[((hi) var_hi).d]
						  * ((Class_db) class_db).F))
					    + ((Class_db) class_db).J);
		((hi) var_hi_0_).a = (int) (((float) Xb[((hi) var_hi).d]
					     * ((Class_db) class_db).q)
					    + ((float) nc[((hi) var_hi).d]
					       * ((Class_db) class_db).r)
					    + (((Class_db) class_db).n
					       * (float) Ab[((hi) var_hi).d])
					    + ((Class_db) class_db).w);
		((hi) var_hi_0_).l
		    = (int) (((Class_db) class_db).p
			     + (((float) Ab[((hi) var_hi).d]
				 * ((Class_db) class_db).L)
				+ ((((Class_db) class_db).v
				    * (float) nc[((hi) var_hi).d])
				   + ((float) Xb[((hi) var_hi).d]
				      * ((Class_db) class_db).j))));
		((hi) var_hi_0_).b
		    = (int) (((Class_db) class_db).J
			     + ((((Class_db) class_db).x
				 * (float) Ab[((hi) var_hi).g])
				+ ((((Class_db) class_db).A
				    * (float) nc[((hi) var_hi).g])
				   + ((float) Xb[((hi) var_hi).g]
				      * ((Class_db) class_db).F))));
		((hi) var_hi_0_).c
		    = (int) (((Class_db) class_db).w
			     + (((float) Ab[((hi) var_hi).g]
				 * ((Class_db) class_db).n)
				+ ((((Class_db) class_db).q
				    * (float) Xb[((hi) var_hi).g])
				   + ((float) nc[((hi) var_hi).g]
				      * ((Class_db) class_db).r))));
		((hi) var_hi_0_).m
		    = (int) (((Class_db) class_db).p
			     + ((((Class_db) class_db).v
				 * (float) nc[((hi) var_hi).g])
				+ (((Class_db) class_db).j
				   * (float) Xb[((hi) var_hi).g])
				+ (((Class_db) class_db).L
				   * (float) Ab[((hi) var_hi).g])));
		((hi) var_hi_0_).t
		    = (int) (((Class_db) class_db).J
			     + ((((Class_db) class_db).F
				 * (float) Xb[((hi) var_hi).e])
				+ (((Class_db) class_db).A
				   * (float) nc[((hi) var_hi).e])
				+ ((float) Ab[((hi) var_hi).e]
				   * ((Class_db) class_db).x)));
		((hi) var_hi_0_).o = (int) (((float) Xb[((hi) var_hi).e]
					     * ((Class_db) class_db).q)
					    + (((Class_db) class_db).r
					       * (float) nc[((hi) var_hi).e])
					    + ((float) Ab[((hi) var_hi).e]
					       * ((Class_db) class_db).n)
					    + ((Class_db) class_db).w);
		((hi) var_hi_0_).n
		    = (int) ((((Class_db) class_db).L
			      * (float) Ab[((hi) var_hi).e])
			     + (((float) Xb[((hi) var_hi).e]
				 * ((Class_db) class_db).j)
				+ (((Class_db) class_db).v
				   * (float) nc[((hi) var_hi).e]))
			     + ((Class_db) class_db).p);
	    }
	}
	if (Cb != null) {
	    for (int i = 0; i < Cb.length; i++) {
		qg var_qg = Cb[i];
		qg var_qg_1_ = var_qg;
		if (((qg) var_qg).n != null)
		    var_qg_1_ = ((qg) var_qg).n;
		if (((qg) var_qg).p != null)
		    ((qg) var_qg).p.M(class_db);
		else
		    ((qg) var_qg).p = class_db.a();
		((qg) var_qg_1_).m = (int) (((Class_db) class_db).J
					    + (((float) nc[((qg) var_qg).b]
						* ((Class_db) class_db).A)
					       + ((float) Xb[((qg) var_qg).b]
						  * ((Class_db) class_db).F)
					       + ((float) Ab[((qg) var_qg).b]
						  * ((Class_db) class_db).x)));
		((qg) var_qg_1_).f = (int) (((float) nc[((qg) var_qg).b]
					     * ((Class_db) class_db).r)
					    + ((float) Xb[((qg) var_qg).b]
					       * ((Class_db) class_db).q)
					    + ((float) Ab[((qg) var_qg).b]
					       * ((Class_db) class_db).n)
					    + ((Class_db) class_db).w);
		((qg) var_qg_1_).l = (int) ((((Class_db) class_db).L
					     * (float) Ab[((qg) var_qg).b])
					    + ((((Class_db) class_db).j
						* (float) Xb[((qg) var_qg).b])
					       + ((float) nc[((qg) var_qg).b]
						  * ((Class_db) class_db).v))
					    + ((Class_db) class_db).p);
	    }
	}
    }
    
    final void SA(int i) {
	ob = i;
	D++;
	if (Pb != null && (0x10000 & ob) == 0) {
	    cb = ((iq) Pb).b;
	    Hb = ((iq) Pb).e;
	    kb = ((iq) Pb).a;
	    Wb = ((iq) Pb).k;
	    Pb = null;
	}
	J = true;
	c(-93);
    }
    
    final void M(int i) {
	Eb++;
	int i_2_ = GameInPacket.h[i];
	int i_3_ = GameInPacket.i[i];
	for (int i_4_ = 0; qc > i_4_; i_4_++) {
	    int i_5_ = nc[i_4_] * i_3_ + Ab[i_4_] * i_2_ >> 14;
	    Ab[i_4_] = i_3_ * Ab[i_4_] - i_2_ * nc[i_4_] >> 14;
	    nc[i_4_] = i_5_;
	}
	ac = false;
	if (K != null)
	    ((gv) K).c = null;
    }
    
    final void a(da var_da, int i, int i_6_, int i_7_, boolean bool) {
	ec++;
	vaa var_vaa_8_ = (vaa) var_da;
	if (bc != 0 && var_vaa_8_.bc != 0) {
	    int i_9_ = var_vaa_8_.qc;
	    int[] is = var_vaa_8_.nc;
	    int[] is_10_ = var_vaa_8_.Xb;
	    int[] is_11_ = var_vaa_8_.Ab;
	    short[] is_12_ = var_vaa_8_.Wb;
	    short[] is_13_ = var_vaa_8_.Hb;
	    short[] is_14_ = var_vaa_8_.cb;
	    byte[] is_15_ = var_vaa_8_.kb;
	    short[] is_16_;
	    byte[] is_17_;
	    short[] is_18_;
	    short[] is_19_;
	    if (Pb == null) {
		is_19_ = null;
		is_16_ = null;
		is_17_ = null;
		is_18_ = null;
	    } else {
		is_16_ = ((iq) Pb).b;
		is_17_ = ((iq) Pb).a;
		is_18_ = ((iq) Pb).k;
		is_19_ = ((iq) Pb).e;
	    }
	    short[] is_20_;
	    short[] is_21_;
	    byte[] is_22_;
	    short[] is_23_;
	    if (var_vaa_8_.Pb == null) {
		is_22_ = null;
		is_23_ = null;
		is_21_ = null;
		is_20_ = null;
	    } else {
		is_20_ = ((iq) var_vaa_8_.Pb).e;
		is_21_ = ((iq) var_vaa_8_.Pb).b;
		is_22_ = ((iq) var_vaa_8_.Pb).a;
		is_23_ = ((iq) var_vaa_8_.Pb).k;
	    }
	    int[] is_24_ = var_vaa_8_.rc;
	    short[] is_25_ = var_vaa_8_.v;
	    if (!var_vaa_8_.ac)
		var_vaa_8_.b((byte) -100);
	    int i_26_ = var_vaa_8_.V;
	    int i_27_ = var_vaa_8_.Y;
	    int i_28_ = var_vaa_8_.gc;
	    int i_29_ = var_vaa_8_.oc;
	    int i_30_ = var_vaa_8_.w;
	    int i_31_ = var_vaa_8_.lc;
	    for (int i_32_ = 0; qc > i_32_; i_32_++) {
		int i_33_ = Xb[i_32_] - i_6_;
		if (i_26_ <= i_33_ && i_33_ <= i_27_) {
		    int i_34_ = nc[i_32_] - i;
		    if (i_34_ >= i_28_ && i_34_ <= i_29_) {
			int i_35_ = Ab[i_32_] - i_7_;
			if (i_30_ <= i_35_ && i_35_ <= i_31_) {
			    int i_36_ = -1;
			    int i_37_ = rc[i_32_];
			    int i_38_ = rc[i_32_ + 1];
			    for (int i_39_ = i_37_; i_38_ > i_39_; i_39_++) {
				i_36_ = v[i_39_] - 1;
				if (i_36_ == -1 || kb[i_36_] != 0)
				    break;
			    }
			    if ((i_36_ ^ 0xffffffff) != 0) {
				for (int i_40_ = 0; i_40_ < i_9_; i_40_++) {
				    if (is[i_40_] == i_34_
					&& i_35_ == is_11_[i_40_]
					&& i_33_ == is_10_[i_40_]) {
					i_37_ = is_24_[i_40_];
					int i_41_ = -1;
					i_38_ = is_24_[i_40_ + 1];
					for (int i_42_ = i_37_; i_42_ < i_38_;
					     i_42_++) {
					    i_41_ = is_25_[i_42_] - 1;
					    if (i_41_ == -1
						|| is_15_[i_41_] != 0)
						break;
					}
					if ((i_41_ ^ 0xffffffff) != 0) {
					    if (is_18_ == null) {
						Pb = new iq();
						is_18_ = ((iq) Pb).k
						    = mca.a(0, Wb);
						is_19_ = ((iq) Pb).e
						    = mca.a(0, Hb);
						is_16_ = ((iq) Pb).b
						    = mca.a(0, cb);
						is_17_ = ((iq) Pb).a
						    = cca.a(true, kb);
					    }
					    if (is_23_ == null) {
						iq var_iq
						    = var_vaa_8_.Pb = new iq();
						is_23_ = ((iq) var_iq).k
						    = mca.a(0, is_12_);
						is_20_ = ((iq) var_iq).e
						    = mca.a(0, is_13_);
						is_21_ = ((iq) var_iq).b
						    = mca.a(0, is_14_);
						is_22_ = ((iq) var_iq).a
						    = cca.a(true, is_15_);
					    }
					    short i_43_ = Wb[i_36_];
					    short i_44_ = Hb[i_36_];
					    short i_45_ = cb[i_36_];
					    i_37_ = is_24_[i_40_];
					    i_38_ = is_24_[i_40_ + 1];
					    byte i_46_ = kb[i_36_];
					    for (int i_47_ = i_37_;
						 i_47_ < i_38_; i_47_++) {
						int i_48_ = is_25_[i_47_] - 1;
						if ((i_48_ ^ 0xffffffff) == 0)
						    break;
						if (is_22_[i_48_] != 0) {
						    is_23_[i_48_] += i_43_;
						    is_20_[i_48_] += i_44_;
						    is_21_[i_48_] += i_45_;
						    is_22_[i_48_] += i_46_;
						}
					    }
					    i_43_ = is_12_[i_41_];
					    i_38_ = rc[i_32_ + 1];
					    i_37_ = rc[i_32_];
					    i_44_ = is_13_[i_41_];
					    i_46_ = is_15_[i_41_];
					    i_45_ = is_14_[i_41_];
					    for (int i_49_ = i_37_;
						 i_49_ < i_38_; i_49_++) {
						int i_50_ = v[i_49_] - 1;
						if ((i_50_ ^ 0xffffffff) == 0)
						    break;
						if (is_17_[i_50_] != 0) {
						    is_18_[i_50_] += i_43_;
						    is_19_[i_50_] += i_44_;
						    is_16_[i_50_] += i_45_;
						    is_17_[i_50_] += i_46_;
						}
					    }
					    if (Fb == null && db != null)
						((gv) db).c = null;
					    if (Fb != null)
						((gv) Fb).c = null;
					    if (var_vaa_8_.Fb == null
						&& var_vaa_8_.db != null)
						((gv) var_vaa_8_.db).c = null;
					    if (var_vaa_8_.Fb != null)
						((gv) var_vaa_8_.Fb).c = null;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final boolean a(boolean bool, int i, Class_q class_q, int i_51_,
			    int i_52_, boolean bool_53_) {
	M++;
	Class_db class_db = (Class_db) class_q;
	Class_db class_db_54_ = ((qj) ib).Ne;
	if (bool_53_ != true)
	    l();
	float f = (((Class_db) class_db_54_).J
		   + (((Class_db) class_db).p * ((Class_db) class_db_54_).x
		      + (((Class_db) class_db_54_).F * ((Class_db) class_db).w
			 + (((Class_db) class_db_54_).A
			    * ((Class_db) class_db).J))));
	float f_55_ = (((Class_db) class_db_54_).r * ((Class_db) class_db).J
		       + ((Class_db) class_db).w * ((Class_db) class_db_54_).q
		       + ((Class_db) class_db).p * ((Class_db) class_db_54_).n
		       + ((Class_db) class_db_54_).w);
	float f_56_ = (((Class_db) class_db_54_).j * ((Class_db) class_db).w
		       + ((Class_db) class_db_54_).v * ((Class_db) class_db).J
		       + ((Class_db) class_db).p * ((Class_db) class_db_54_).L
		       + ((Class_db) class_db_54_).p);
	pm.C = (((Class_db) class_db_54_).r * ((Class_db) class_db).F
		+ ((Class_db) class_db_54_).q * ((Class_db) class_db).q
		+ ((Class_db) class_db).j * ((Class_db) class_db_54_).n);
	mfa.k = (((Class_db) class_db_54_).x * ((Class_db) class_db).j
		 + (((Class_db) class_db).F * ((Class_db) class_db_54_).A
		    + ((Class_db) class_db).q * ((Class_db) class_db_54_).F));
	gca.m = (((Class_db) class_db_54_).v * ((Class_db) class_db).A
		 + ((Class_db) class_db_54_).j * ((Class_db) class_db).r
		 + ((Class_db) class_db_54_).L * ((Class_db) class_db).v);
	mn.b = (((Class_db) class_db_54_).L * ((Class_db) class_db).L
		+ (((Class_db) class_db).n * ((Class_db) class_db_54_).j
		   + ((Class_db) class_db).x * ((Class_db) class_db_54_).v));
	cd.A = (((Class_db) class_db_54_).r * ((Class_db) class_db).A
		+ ((Class_db) class_db).r * ((Class_db) class_db_54_).q
		+ ((Class_db) class_db_54_).n * ((Class_db) class_db).v);
	lr.i = (((Class_db) class_db).L * ((Class_db) class_db_54_).x
		+ (((Class_db) class_db_54_).F * ((Class_db) class_db).n
		   + ((Class_db) class_db_54_).A * ((Class_db) class_db).x));
	bfa.w = (((Class_db) class_db_54_).x * ((Class_db) class_db).v
		 + (((Class_db) class_db).r * ((Class_db) class_db_54_).F
		    + ((Class_db) class_db_54_).A * ((Class_db) class_db).A));
	mq.c = (((Class_db) class_db).x * ((Class_db) class_db_54_).r
		+ ((Class_db) class_db_54_).q * ((Class_db) class_db).n
		+ ((Class_db) class_db_54_).n * ((Class_db) class_db).L);
	World.b = (((Class_db) class_db).F * ((Class_db) class_db_54_).v
		 + ((Class_db) class_db_54_).j * ((Class_db) class_db).q
		 + ((Class_db) class_db_54_).L * ((Class_db) class_db).j);
	boolean bool_57_ = false;
	float f_58_ = 3.4028235E38F;
	float f_59_ = -3.4028235E38F;
	float f_60_ = 3.4028235E38F;
	float f_61_ = -3.4028235E38F;
	int i_62_ = ((qj) ib).bg;
	int i_63_ = ((qj) ib).eg;
	if (!ac)
	    b((byte) -100);
	rea.D[0] = gc;
	sa.r[0] = V;
	jfa.H[0] = w;
	rea.D[1] = oc;
	sa.r[1] = V;
	jfa.H[1] = w;
	rea.D[2] = gc;
	sa.r[2] = Y;
	rea.D[3] = oc;
	jfa.H[2] = w;
	sa.r[3] = Y;
	jfa.H[3] = w;
	rea.D[4] = gc;
	sa.r[4] = V;
	rea.D[5] = oc;
	jfa.H[4] = lc;
	sa.r[5] = V;
	jfa.H[5] = lc;
	rea.D[6] = gc;
	sa.r[6] = Y;
	jfa.H[6] = lc;
	rea.D[7] = oc;
	sa.r[7] = Y;
	jfa.H[7] = lc;
	for (int i_64_ = 0; i_64_ < 8; i_64_++) {
	    float f_65_ = (float) jfa.H[i_64_];
	    float f_66_ = (float) sa.r[i_64_];
	    float f_67_ = (float) rea.D[i_64_];
	    float f_68_ = f + (f_65_ * lr.i + (bfa.w * f_67_ + mfa.k * f_66_));
	    float f_69_ = World.b * f_66_ + f_67_ * gca.m + f_65_ * mn.b + f_56_;
	    float f_70_
		= f_55_ + (f_65_ * mq.c + (pm.C * f_66_ + cd.A * f_67_));
	    if ((float) ((qj) ib).Jf <= f_69_) {
		if (i > 0)
		    f_69_ = (float) i;
		float f_71_
		    = f_68_ * (float) i_62_ / f_69_ + (float) ((qj) ib).kg;
		float f_72_
		    = f_70_ * (float) i_63_ / f_69_ + (float) ((qj) ib).ag;
		if (f_59_ < f_71_)
		    f_59_ = f_71_;
		if (f_58_ > f_71_)
		    f_58_ = f_71_;
		if (f_60_ > f_72_)
		    f_60_ = f_72_;
		if (f_72_ > f_61_)
		    f_61_ = f_72_;
		bool_57_ = true;
	    }
	}
	if (bool_57_ && f_58_ < (float) i_52_ && (float) i_52_ < f_59_
	    && f_60_ < (float) i_51_ && f_61_ > (float) i_51_) {
	    if (bool)
		return true;
	    if (mc > ((qj) ib).jh.length) {
		((qj) ib).jh = new int[mc];
		((qj) ib).hh = new int[mc];
	    }
	    int[] is = ((qj) ib).jh;
	    int[] is_73_ = ((qj) ib).hh;
	    for (int i_74_ = 0; qc > i_74_; i_74_++) {
		float f_75_ = (float) Xb[i_74_];
		float f_76_ = (float) Ab[i_74_];
		float f_77_ = (float) nc[i_74_];
		float f_78_
		    = f_55_ + (f_76_ * mq.c + (cd.A * f_77_ + f_75_ * pm.C));
		float f_79_
		    = f_76_ * mn.b + (World.b * f_75_ + f_77_ * gca.m) + f_56_;
		float f_80_
		    = f + (f_76_ * lr.i + (bfa.w * f_77_ + mfa.k * f_75_));
		if (f_79_ >= (float) ((qj) ib).Jf) {
		    if (i > 0)
			f_79_ = (float) i;
		    int i_81_ = (int) ((float) ((qj) ib).kg
				       + f_80_ * (float) i_62_ / f_79_);
		    int i_82_ = (int) ((float) ((qj) ib).ag
				       + (float) i_63_ * f_78_ / f_79_);
		    int i_83_ = rc[i_74_];
		    int i_84_ = rc[i_74_ + 1];
		    for (int i_85_ = i_83_; i_85_ < i_84_; i_85_++) {
			int i_86_ = v[i_85_] - 1;
			if (i_86_ == -1)
			    break;
			is[i_86_] = i_81_;
			is_73_[i_86_] = i_82_;
		    }
		} else {
		    int i_87_ = rc[i_74_];
		    int i_88_ = rc[i_74_ + 1];
		    for (int i_89_ = i_87_; i_89_ < i_88_; i_89_++) {
			int i_90_ = v[i_89_] - 1;
			if (i_90_ == -1)
			    break;
			is[v[i_89_] - 1] = -999999;
		    }
		}
	    }
	    for (int i_91_ = 0; i_91_ < bc; i_91_++) {
		if (is[N[i_91_]] != -999999 && is[Ib[i_91_]] != -999999
		    && is[lb[i_91_]] != -999999
		    && a(i_51_, i_52_, is_73_[Ib[i_91_]], is_73_[N[i_91_]],
			 is[Ib[i_91_]], -117, is[lb[i_91_]], is_73_[lb[i_91_]],
			 is[N[i_91_]]))
		    return true;
	    }
	}
	return false;
    }
    
    private final int a(int i, int i_92_, int i_93_, short i_94_, byte i_95_) {
	if (i_93_ <= 49)
	    return -105;
	hb++;
	int i_96_ = ji.j[gf.a(i_92_, i, -3)];
	if ((i_94_ ^ 0xffffffff) != 0) {
	    vca var_vca = ((Class_r) ib).j.a(0xffff & i_94_, (byte) 86);
	    int i_97_ = 0xff & ((vca) var_vca).q;
	    if (i_97_ != 0) {
		int i_98_;
		if (i >= 0) {
		    if (i <= 127)
			i_98_ = 131586 * i;
		    else
			i_98_ = 16777215;
		} else
		    i_98_ = 0;
		if (i_97_ != 256) {
		    int i_99_ = i_97_;
		    int i_100_ = -i_97_ + 256;
		    i_96_ = ((((i_98_ & 0xff00) * i_99_
			       + (i_96_ & 0xff00) * i_100_)
			      & 0xff0000)
			     + ((i_99_ * (i_98_ & 0xff00ff)
				 + (0xff00ff & i_96_) * i_100_)
				& ~0xff00ff)) >> 8;
		} else
		    i_96_ = i_98_;
	    }
	    int i_101_ = 0xff & ((vca) var_vca).f;
	    if (i_101_ != 0) {
		i_101_ += 256;
		int i_102_ = ((i_96_ & 0xff0000) >> 16) * i_101_;
		if (i_102_ > 65535)
		    i_102_ = 65535;
		int i_103_ = (i_96_ >> 8 & 0xff) * i_101_;
		if (i_103_ > 65535)
		    i_103_ = 65535;
		int i_104_ = (i_96_ & 0xff) * i_101_;
		if (i_104_ > 65535)
		    i_104_ = 65535;
		i_96_ = (i_104_ >> 8) + (i_102_ << 8 & 0xff00c4) + (i_103_
								    & 0xff00);
	    }
	}
	return (i_96_ << 8) + 255 - (i_95_ & 0xff);
    }
    
    final hi[] c() {
	Sb++;
	return pb;
    }
    
    private final void a(byte i) {
	if (i == -82) {
	    if (F != null) {
		Class_db class_db = ((qj) ib).he;
		ib.e((byte) 101);
		ib.ZA(false);
		ib.a((byte) 116, false);
		ib.a(((qj) ib).fg, (byte) 39, null, ((qj) ib).mf, null);
		for (int i_105_ = 0; E > i_105_; i_105_++) {
		    ik var_ik = F[i_105_];
		    rda var_rda = B[i_105_];
		    if (!((ik) var_ik).j || !ib.z()) {
			float f
			    = 0.3333333F * (float) (nc[((ik) var_ik).p]
						    + (nc[((ik) var_ik).g]
						       + nc[((ik) var_ik).k]));
			float f_106_ = ((float) (Xb[((ik) var_ik).p]
						 + (Xb[((ik) var_ik).g]
						    + Xb[((ik) var_ik).k]))
					* 0.3333333F);
			float f_107_
			    = 0.3333333F * (float) (Ab[((ik) var_ik).g]
						    + Ab[((ik) var_ik).k]
						    + Ab[((ik) var_ik).p]);
			float f_108_ = Class_fd.F + (lr.i * f_107_
					       + (f * bfa.w + f_106_ * mfa.k));
			float f_109_ = pm.K + (f * cd.A + f_106_ * pm.C
					       + mq.c * f_107_);
			float f_110_ = (gca.m * f + f_106_ * World.b
					+ f_107_ * mn.b + qt.J);
			class_db.a(((rda) var_rda).k * ((ik) var_ik).m >> 7,
				   (byte) -56,
				   f_108_ + (float) ((rda) var_rda).d,
				   ((rda) var_rda).j,
				   (float) ((rda) var_rda).a - f_109_,
				   (float) ((ik) var_ik).h - f_110_,
				   ((ik) var_ik).f * ((rda) var_rda).f >> 7);
			ib.a(class_db, 0);
			int i_111_ = ((rda) var_rda).e;
			OpenGL.glColor4ub((byte) (i_111_ >> 16),
					  (byte) (i_111_ >> 8), (byte) i_111_,
					  (byte) (i_111_ >> 24));
			ib.b(((ik) var_ik).e, (byte) -41);
			ib.b((byte) 25, (int) ((ik) var_ik).c);
			ib.a((byte) -31, 4, 7, 0);
		    }
		}
		ib.ZA(true);
		ib.r(0);
	    }
	    nb++;
	}
    }
    
    static final void setInterfaceConfig(int configID, int value, int i_113_) {
		setInterfaceConfigs++;
		qba var_qba = ofa.a(i_113_, configID, (byte) 111);
		var_qba.c((byte) 11);
		((qba) var_qba).v = value;
    }
    
    final void DA(short i, short i_114_) {
	T++;
	fa var_fa = ((Class_r) ib).j;
	for (int i_115_ = 0; i_115_ < bc; i_115_++) {
	    if (wb[i_115_] == i)
		wb[i_115_] = i_114_;
	}
	byte i_116_ = 0;
	byte i_117_ = 0;
	if (i != -1) {
	    vca var_vca = var_fa.a(i & 0xffff, (byte) 86);
	    i_117_ = ((vca) var_vca).f;
	    i_116_ = ((vca) var_vca).q;
	}
	byte i_118_ = 0;
	byte i_119_ = 0;
	if (i_114_ != -1) {
	    vca var_vca = var_fa.a(i_114_ & 0xffff, (byte) 86);
	    i_119_ = ((vca) var_vca).f;
	    i_118_ = ((vca) var_vca).q;
	}
	if (i_118_ != i_116_ | i_117_ != i_119_) {
	    if (F != null) {
		for (int i_120_ = 0; E > i_120_; i_120_++) {
		    ik var_ik = F[i_120_];
		    rda var_rda = B[i_120_];
		    ((rda) var_rda).e
			= (0xffffff & ji.j[0xffff & Z[((ik) var_ik).b]]
			   | ~0xffffff & ((rda) var_rda).e);
		}
	    }
	    if (db != null)
		((gv) db).c = null;
	}
    }
    
    final void a(int i, int[] is, int i_121_, int i_122_, int i_123_,
		 int i_124_, boolean bool) {
	Lb++;
	int i_125_ = is.length;
	if (i == 0) {
	    i_122_ <<= 4;
	    i_121_ <<= 4;
	    i_123_ <<= 4;
	    int i_126_ = 0;
	    ul.l = 0;
	    Class_i.a = 0;
	    ui.a = 0;
	    for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
		int i_128_ = is[i_127_];
		if (i_128_ < sb.length) {
		    int[] is_129_ = sb[i_128_];
		    for (int i_130_ = 0; is_129_.length > i_130_; i_130_++) {
			int i_131_ = is_129_[i_130_];
			ui.a += nc[i_131_];
			ul.l += Xb[i_131_];
			Class_i.a += Ab[i_131_];
			i_126_++;
		    }
		}
	    }
	    if (i_126_ <= 0) {
		ui.a = i_121_;
		ul.l = i_122_;
		Class_i.a = i_123_;
	    } else {
		ul.l = ul.l / i_126_ + i_122_;
		Class_i.a = Class_i.a / i_126_ + i_123_;
		ui.a = i_121_ + ui.a / i_126_;
	    }
	} else if (i == 1) {
	    i_123_ <<= 4;
	    i_122_ <<= 4;
	    i_121_ <<= 4;
	    for (int i_132_ = 0; i_125_ > i_132_; i_132_++) {
		int i_133_ = is[i_132_];
		if (i_133_ < sb.length) {
		    int[] is_134_ = sb[i_133_];
		    for (int i_135_ = 0; i_135_ < is_134_.length; i_135_++) {
			int i_136_ = is_134_[i_135_];
			nc[i_136_] += i_121_;
			Xb[i_136_] += i_122_;
			Ab[i_136_] += i_123_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_137_ = 0; i_125_ > i_137_; i_137_++) {
		int i_138_ = is[i_137_];
		if (i_138_ < sb.length) {
		    int[] is_139_ = sb[i_138_];
		    if ((0x1 & i_124_) != 0) {
			for (int i_140_ = 0; is_139_.length > i_140_;
			     i_140_++) {
			    int i_141_ = is_139_[i_140_];
			    nc[i_141_] -= ui.a;
			    Xb[i_141_] -= ul.l;
			    Ab[i_141_] -= Class_i.a;
			    if (i_121_ != 0) {
				int i_142_ = GameInPacket.h[i_121_];
				int i_143_ = GameInPacket.i[i_121_];
				int i_144_ = ((i_143_ * Xb[i_141_] + 16383
					       - i_142_ * Ab[i_141_])
					      >> 14);
				Ab[i_141_] = (Xb[i_141_] * i_142_ + 16383
					      + Ab[i_141_] * i_143_) >> 14;
				Xb[i_141_] = i_144_;
			    }
			    if (i_123_ != 0) {
				int i_145_ = GameInPacket.h[i_123_];
				int i_146_ = GameInPacket.i[i_123_];
				int i_147_ = ((nc[i_141_] * i_146_
					       + i_145_ * Xb[i_141_] + 16383)
					      >> 14);
				Xb[i_141_]
				    = i_146_ * Xb[i_141_] + (-(i_145_
							       * nc[i_141_])
							     + 16383) >> 14;
				nc[i_141_] = i_147_;
			    }
			    if (i_122_ != 0) {
				int i_148_ = GameInPacket.h[i_122_];
				int i_149_ = GameInPacket.i[i_122_];
				int i_150_ = ((nc[i_141_] * i_149_
					       + i_148_ * Ab[i_141_] + 16383)
					      >> 14);
				Ab[i_141_]
				    = (i_149_ * Ab[i_141_]
				       - nc[i_141_] * i_148_ + 16383) >> 14;
				nc[i_141_] = i_150_;
			    }
			    nc[i_141_] += ui.a;
			    Xb[i_141_] += ul.l;
			    Ab[i_141_] += Class_i.a;
			}
		    } else {
			for (int i_151_ = 0; is_139_.length > i_151_;
			     i_151_++) {
			    int i_152_ = is_139_[i_151_];
			    nc[i_152_] -= ui.a;
			    Xb[i_152_] -= ul.l;
			    Ab[i_152_] -= Class_i.a;
			    if (i_123_ != 0) {
				int i_153_ = GameInPacket.h[i_123_];
				int i_154_ = GameInPacket.i[i_123_];
				int i_155_ = ((i_154_ * nc[i_152_]
					       + (i_153_ * Xb[i_152_] + 16383))
					      >> 14);
				Xb[i_152_] = (i_154_ * Xb[i_152_] + 16383
					      - i_153_ * nc[i_152_]) >> 14;
				nc[i_152_] = i_155_;
			    }
			    if (i_121_ != 0) {
				int i_156_ = GameInPacket.h[i_121_];
				int i_157_ = GameInPacket.i[i_121_];
				int i_158_ = ((Xb[i_152_] * i_157_
					       - Ab[i_152_] * i_156_ + 16383)
					      >> 14);
				Ab[i_152_]
				    = (Ab[i_152_] * i_157_
				       + (Xb[i_152_] * i_156_ + 16383)) >> 14;
				Xb[i_152_] = i_158_;
			    }
			    if (i_122_ != 0) {
				int i_159_ = GameInPacket.h[i_122_];
				int i_160_ = GameInPacket.i[i_122_];
				int i_161_ = ((Ab[i_152_] * i_159_
					       + i_160_ * nc[i_152_] + 16383)
					      >> 14);
				Ab[i_152_]
				    = (i_160_ * Ab[i_152_]
				       - i_159_ * nc[i_152_] + 16383) >> 14;
				nc[i_152_] = i_161_;
			    }
			    nc[i_152_] += ui.a;
			    Xb[i_152_] += ul.l;
			    Ab[i_152_] += Class_i.a;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_162_ = 0; i_162_ < i_125_; i_162_++) {
		    int i_163_ = is[i_162_];
		    if (sb.length > i_163_) {
			int[] is_164_ = sb[i_163_];
			for (int i_165_ = 0; i_165_ < is_164_.length;
			     i_165_++) {
			    int i_166_ = is_164_[i_165_];
			    int i_167_ = rc[i_166_];
			    int i_168_ = rc[i_166_ + 1];
			    for (int i_169_ = i_167_; i_169_ < i_168_;
				 i_169_++) {
				int i_170_ = v[i_169_] - 1;
				if ((i_170_ ^ 0xffffffff) == 0)
				    break;
				if (i_123_ != 0) {
				    int i_171_ = GameInPacket.h[i_123_];
				    int i_172_ = GameInPacket.i[i_123_];
				    int i_173_
					= ((i_171_ * Hb[i_170_]
					    - (-(i_172_ * Wb[i_170_]) - 16383))
					   >> 14);
				    Hb[i_170_]
					= (short) ((Hb[i_170_] * i_172_
						    + (-(Wb[i_170_] * i_171_)
						       + 16383))
						   >> 14);
				    Wb[i_170_] = (short) i_173_;
				}
				if (i_121_ != 0) {
				    int i_174_ = GameInPacket.h[i_121_];
				    int i_175_ = GameInPacket.i[i_121_];
				    int i_176_
					= ((Hb[i_170_] * i_175_
					    - (i_174_ * cb[i_170_] - 16383))
					   >> 14);
				    cb[i_170_]
					= (short) ((cb[i_170_] * i_175_
						    + i_174_ * Hb[i_170_]
						    + 16383)
						   >> 14);
				    Hb[i_170_] = (short) i_176_;
				}
				if (i_122_ != 0) {
				    int i_177_ = GameInPacket.h[i_122_];
				    int i_178_ = GameInPacket.i[i_122_];
				    int i_179_ = ((i_177_ * cb[i_170_] + 16383
						   + i_178_ * Wb[i_170_])
						  >> 14);
				    cb[i_170_]
					= (short) ((cb[i_170_] * i_178_ + 16383
						    - Wb[i_170_] * i_177_)
						   >> 14);
				    Wb[i_170_] = (short) i_179_;
				}
			    }
			}
		    }
		}
		if (Fb == null && db != null)
		    ((gv) db).c = null;
		if (Fb != null)
		    ((gv) Fb).c = null;
	    }
	} else if (i == 3) {
	    for (int i_180_ = 0; i_125_ > i_180_; i_180_++) {
		int i_181_ = is[i_180_];
		if (i_181_ < sb.length) {
		    int[] is_182_ = sb[i_181_];
		    for (int i_183_ = 0; i_183_ < is_182_.length; i_183_++) {
			int i_184_ = is_182_[i_183_];
			nc[i_184_] -= ui.a;
			Xb[i_184_] -= ul.l;
			Ab[i_184_] -= Class_i.a;
			nc[i_184_] = nc[i_184_] * i_121_ >> 7;
			Xb[i_184_] = i_122_ * Xb[i_184_] >> 7;
			Ab[i_184_] = i_123_ * Ab[i_184_] >> 7;
			nc[i_184_] += ui.a;
			Xb[i_184_] += ul.l;
			Ab[i_184_] += Class_i.a;
		    }
		}
	    }
	} else if (i == 5) {
	    if (yb != null) {
		for (int i_185_ = 0; i_125_ > i_185_; i_185_++) {
		    int i_186_ = is[i_185_];
		    if (i_186_ < yb.length) {
			int[] is_187_ = yb[i_186_];
			for (int i_188_ = 0; is_187_.length > i_188_;
			     i_188_++) {
			    int i_189_ = is_187_[i_188_];
			    int i_190_ = i_121_ * 8 + (0xff & G[i_189_]);
			    if (i_190_ < 0)
				i_190_ = 0;
			    else if (i_190_ > 255)
				i_190_ = 255;
			    G[i_189_] = (byte) i_190_;
			}
			if (is_187_.length > 0 && db != null)
			    ((gv) db).c = null;
		    }
		}
		if (F != null) {
		    for (int i_191_ = 0; i_191_ < E; i_191_++) {
			ik var_ik = F[i_191_];
			rda var_rda = B[i_191_];
			((rda) var_rda).e
			    = (0xffffff & ((rda) var_rda).e
			       | 255 - (G[((ik) var_ik).b] & 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (yb != null) {
		for (int i_192_ = 0; i_192_ < i_125_; i_192_++) {
		    int i_193_ = is[i_192_];
		    if (i_193_ < yb.length) {
			int[] is_194_ = yb[i_193_];
			for (int i_195_ = 0; is_194_.length > i_195_;
			     i_195_++) {
			    int i_196_ = is_194_[i_195_];
			    int i_197_ = 0xffff & Z[i_196_];
			    int i_198_ = (0xfd55 & i_197_) >> 10;
			    int i_199_ = (0x3b0 & i_197_) >> 7;
			    i_199_ += i_122_ / 4;
			    i_198_ = 0x3f & i_198_ + i_121_;
			    int i_200_ = i_197_ & 0x7f;
			    i_200_ += i_123_;
			    if (i_199_ < 0)
				i_199_ = 0;
			    else if (i_199_ > 7)
				i_199_ = 7;
			    if (i_200_ < 0)
				i_200_ = 0;
			    else if (i_200_ > 127)
				i_200_ = 127;
			    Z[i_196_]
				= (short) hba.bitwiseArg1ORArg2(i_200_, hba.bitwiseArg1ORArg2(i_198_ << 10,
							      i_199_ << 7));
			}
			if (is_194_.length > 0 && db != null)
			    ((gv) db).c = null;
		    }
		}
		if (F != null) {
		    for (int i_201_ = 0; E > i_201_; i_201_++) {
			ik var_ik = F[i_201_];
			rda var_rda = B[i_201_];
			((rda) var_rda).e
			    = (~0xffffff & ((rda) var_rda).e
			       | 0xffffff & ji.j[0xffff & Z[((ik) var_ik).b]]);
		    }
		}
	    }
	} else if (i == 8) {
	    if (Gb != null) {
		for (int i_202_ = 0; i_125_ > i_202_; i_202_++) {
		    int i_203_ = is[i_202_];
		    if (i_203_ < Gb.length) {
			int[] is_204_ = Gb[i_203_];
			for (int i_205_ = 0; is_204_.length > i_205_;
			     i_205_++) {
			    rda var_rda = B[is_204_[i_205_]];
			    ((rda) var_rda).d += i_121_;
			    ((rda) var_rda).a += i_122_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (Gb != null) {
		for (int i_206_ = 0; i_125_ > i_206_; i_206_++) {
		    int i_207_ = is[i_206_];
		    if (i_207_ < Gb.length) {
			int[] is_208_ = Gb[i_207_];
			for (int i_209_ = 0; i_209_ < is_208_.length;
			     i_209_++) {
			    rda var_rda = B[is_208_[i_209_]];
			    ((rda) var_rda).f
				= ((rda) var_rda).f * i_122_ >> 7;
			    ((rda) var_rda).k
				= i_121_ * ((rda) var_rda).k >> 7;
			}
		    }
		}
	    }
	} else if (i == 9 && Gb != null) {
	    for (int i_210_ = 0; i_125_ > i_210_; i_210_++) {
		int i_211_ = is[i_210_];
		if (Gb.length > i_211_) {
		    int[] is_212_ = Gb[i_211_];
		    for (int i_213_ = 0; i_213_ < is_212_.length; i_213_++) {
			rda var_rda = B[is_212_[i_213_]];
			((rda) var_rda).j
			    = i_121_ + ((rda) var_rda).j & 0x3fff;
		    }
		}
	    }
	}
    }
    
    private final void b(int i) {
	cc++;
	if (vc != 0) {
	    if (i != eb)
		a(-117, true);
	    a(i - 92, false);
	    if (tc != null) {
		if (((eh) tc).d == null)
		    a(true, (0x10 & eb) != 0);
		if (((eh) tc).d != null) {
		    ib.a((byte) 100, Fb != null);
		    ib.a(K, (byte) 21, db, vb, Fb);
		    int i_214_ = X.length - 1;
		    for (int i_215_ = 0; i_214_ > i_215_; i_215_++) {
			int i_216_ = X[i_215_];
			int i_217_ = X[i_215_ + 1];
			int i_218_ = wb[i_216_] & 0xffff;
			if (i_218_ == 65535)
			    i_218_ = -1;
			ib.a(i_218_, true, Fb != null);
			ib.a((i_217_ - i_216_) * 3, i_216_ * 3, 4, ((eh) tc).d,
			     255);
		    }
		}
	    }
	    c(i + 117);
	}
    }
    
    final void R(int i, int i_219_, int i_220_) {
	Dc++;
	for (int i_221_ = 0; i_221_ < qc; i_221_++) {
	    if (i != 128)
		nc[i_221_] = nc[i_221_] * i >> 7;
	    if (i_219_ != 128)
		Xb[i_221_] = i_219_ * Xb[i_221_] >> 7;
	    if (i_220_ != 128)
		Ab[i_221_] = i_220_ * Ab[i_221_] >> 7;
	}
	if (K != null)
	    ((gv) K).c = null;
	ac = false;
    }
    
    final void oa(int i, int i_222_, int i_223_) {
	fb++;
	for (int i_224_ = 0; qc > i_224_; i_224_++) {
	    if (i != 0)
		nc[i_224_] += i;
	    if (i_222_ != 0)
		Xb[i_224_] += i_222_;
	    if (i_223_ != 0)
		Ab[i_224_] += i_223_;
	}
	if (K != null)
	    ((gv) K).c = null;
	ac = false;
    }
    
    final boolean F() {
	Vb++;
	if (sb == null)
	    return false;
	for (int i = 0; i < W; i++) {
	    nc[i] <<= 4;
	    Xb[i] <<= 4;
	    Ab[i] <<= 4;
	}
	Class_i.a = 0;
	ul.l = 0;
	ui.a = 0;
	return true;
    }
    
    final int J() {
	Db++;
	if (!ac)
	    b((byte) -100);
	return V;
    }
    
    final int za() {
	if (!ac)
	    b((byte) -100);
	ab++;
	return lc;
    }
    
    final boolean a(int i, int i_225_, Class_q class_q, boolean bool) {
	Nb++;
	return a(bool, -1, class_q, i_225_, i, true);
    }
    
    final int TA() {
	s++;
	return u;
    }
    
    private final void a(int i, boolean bool) {
        System.out.println("[vaa]");
	tb++;
	boolean bool_226_ = db != null && ((gv) db).c == null;
	boolean bool_227_ = Fb != null && ((gv) Fb).c == null;
	boolean bool_228_ = K != null && ((gv) K).c == null;
	if (i > -85)
	    rc = null;
	boolean bool_229_ = vb != null && ((gv) vb).c == null;
	if (bool) {
	    bool_229_ = bool_229_ & (0x8 & eb) != 0;
	    bool_228_ = bool_228_ & (0x1 & eb) != 0;
	    bool_226_ = bool_226_ & (eb & 0x2) != 0;
	    bool_227_ = bool_227_ & (0x4 & eb) != 0;
	}
	byte i_230_ = 0;
	byte i_231_ = 0;
	byte i_232_ = 0;
	byte i_233_ = 0;
	byte i_234_ = 0;
	if (bool_228_) {
	    i_231_ = i_230_;
	    i_230_ += 12;
	}
	if (bool_226_) {
	    i_232_ = i_230_;
	    i_230_ += 4;
	}
	if (bool_227_) {
	    i_233_ = i_230_;
	    i_230_ += 12;
	}
	if (bool_229_) {
	    i_234_ = i_230_;
	    i_230_ += 8;
	}
	if (i_230_ != 0) {
	    if (mc * i_230_ <= ((BytesParser) ((qj) ib).Zf).bytes.length)
		((BytesParser) ((qj) ib).Zf).pos = 0;
	    else
		((qj) ib).Zf = new fw((mc + 100) * i_230_);
	    fw var_fw = ((qj) ib).Zf;
	    if (bool_228_) {
		if (((qj) ib).ig) {
		    for (int i_235_ = 0; qc > i_235_; i_235_++) {
			int i_236_
			    = Stream.floatToRawIntBits((float) nc[i_235_]);
			int i_237_
			    = Stream.floatToRawIntBits((float) Xb[i_235_]);
			int i_238_
			    = Stream.floatToRawIntBits((float) Ab[i_235_]);
			int i_239_ = rc[i_235_];
			int i_240_ = rc[i_235_ + 1];
			for (int i_241_ = i_239_; i_241_ < i_240_; i_241_++) {
			    int i_242_ = v[i_241_] - 1;
			    if (i_242_ == -1)
				break;
			    ((BytesParser) var_fw).pos = i_242_ * i_230_;
			    var_fw.writeInt(i_236_, (int) -109);
			    var_fw.writeInt(i_237_, (int) -106);
			    var_fw.writeInt(i_238_, (int) -104);
			}
		    }
		} else {
		    for (int i_243_ = 0; i_243_ < qc; i_243_++) {
			int i_244_
			    = Stream.floatToRawIntBits((float) nc[i_243_]);
			int i_245_
			    = Stream.floatToRawIntBits((float) Xb[i_243_]);
			int i_246_
			    = Stream.floatToRawIntBits((float) Ab[i_243_]);
			int i_247_ = rc[i_243_];
			int i_248_ = rc[i_243_ + 1];
			for (int i_249_ = i_247_; i_248_ > i_249_; i_249_++) {
			    int i_250_ = v[i_249_] - 1;
			    if (i_250_ == -1)
				break;
			    ((BytesParser) var_fw).pos = i_230_ * i_250_;
			    var_fw.writeIntReversed2(i_244_, (byte) 60);
			    var_fw.writeIntReversed2(i_245_, (byte) 48);
			    var_fw.writeIntReversed2(i_246_, (byte) 66);
			}
		    }
		}
	    }
	    if (bool_226_) {
		if (Fb != null) {
		    for (int i_251_ = 0; bc > i_251_; i_251_++) {
			int i_252_
			    = a(u, Z[i_251_], 94, wb[i_251_], G[i_251_]);
			((BytesParser) var_fw).pos = N[i_251_] * i_230_ + i_232_;
			var_fw.writeInt(i_252_, (int) -110);
			((BytesParser) var_fw).pos = Ib[i_251_] * i_230_ + i_232_;
			var_fw.writeInt(i_252_, (int) -116);
			((BytesParser) var_fw).pos = lb[i_251_] * i_230_ + i_232_;
			var_fw.writeInt(i_252_, (int) -100);
		    }
		} else {
		    short[] is;
		    short[] is_253_;
		    byte[] is_254_;
		    short[] is_255_;
		    if (Pb == null) {
			is_255_ = cb;
			is_253_ = Wb;
			is = Hb;
			is_254_ = kb;
		    } else {
			is = ((iq) Pb).e;
			is_253_ = ((iq) Pb).k;
			is_254_ = ((iq) Pb).a;
			is_255_ = ((iq) Pb).b;
		    }
		    float f = ((qj) ib).Ng[0];
		    float f_256_ = ((qj) ib).Ng[1];
		    float f_257_ = ((qj) ib).Ng[2];
		    float f_258_ = ((qj) ib).Xf;
		    float f_259_ = 768.0F * ((qj) ib).lf / (float) ub;
		    float f_260_ = ((qj) ib).If * 768.0F / (float) ub;
		    for (int i_261_ = 0; i_261_ < bc; i_261_++) {
			int i_262_
			    = a(u, Z[i_261_], 85, wb[i_261_], G[i_261_]);
			float f_263_
			    = ((qj) ib).pf * (float) ((i_262_ & 0xff62) >> 8);
			int i_264_ = N[i_261_];
			float f_265_ = (float) (i_262_ >>> 24) * ((qj) ib).wf;
			float f_266_ = (((qj) ib).Xg
					* (float) ((0xff81cc & i_262_) >> 16));
			short i_267_ = (short) is_254_[i_264_];
			float f_268_;
			if (i_267_ != 0)
			    f_268_ = (((float) is_255_[i_264_] * f_257_
				       + ((float) is[i_264_] * f_256_
					  + f * (float) is_253_[i_264_]))
				      / (float) (i_267_ * 256));
			else
			    f_268_ = ((f_256_ * (float) is[i_264_]
				       + f * (float) is_253_[i_264_]
				       + (float) is_255_[i_264_] * f_257_)
				      * 0.0026041667F);
			float f_269_
			    = (f_258_
			       + (f_268_ < 0.0F ? f_260_ : f_259_) * f_268_);
			int i_270_ = (int) (f_265_ * f_269_);
			int i_271_ = (int) (f_266_ * f_269_);
			if (i_270_ >= 0) {
			    if (i_270_ > 255)
				i_270_ = 255;
			} else
			    i_270_ = 0;
			if (i_271_ < 0)
			    i_271_ = 0;
			else if (i_271_ > 255)
			    i_271_ = 255;
			int i_272_ = (int) (f_269_ * f_263_);
			if (i_272_ < 0)
			    i_272_ = 0;
			else if (i_272_ > 255)
			    i_272_ = 255;
			((BytesParser) var_fw).pos = i_230_ * i_264_ + i_232_;
			var_fw.writeByte(i_270_, (byte) -108);
			var_fw.writeByte(i_271_, (byte) -114);
			var_fw.writeByte(i_272_, (byte) -112);
			var_fw.writeByte(255 - (0xff & G[i_261_]), (byte) -114);
			i_264_ = Ib[i_261_];
			i_267_ = (short) is_254_[i_264_];
			if (i_267_ == 0)
			    f_268_ = ((f_257_ * (float) is_255_[i_264_]
				       + ((float) is_253_[i_264_] * f
					  + f_256_ * (float) is[i_264_]))
				      * 0.0026041667F);
			else
			    f_268_ = ((f_257_ * (float) is_255_[i_264_]
				       + ((float) is_253_[i_264_] * f
					  + f_256_ * (float) is[i_264_]))
				      / (float) (256 * i_267_));
			f_269_ = f_258_ + f_268_ * (!(f_268_ < 0.0F) ? f_259_
						    : f_260_);
			i_270_ = (int) (f_265_ * f_269_);
			i_271_ = (int) (f_266_ * f_269_);
			if (i_270_ >= 0) {
			    if (i_270_ > 255)
				i_270_ = 255;
			} else
			    i_270_ = 0;
			i_272_ = (int) (f_263_ * f_269_);
			if (i_271_ >= 0) {
			    if (i_271_ > 255)
				i_271_ = 255;
			} else
			    i_271_ = 0;
			((BytesParser) var_fw).pos = i_264_ * i_230_ + i_232_;
			if (i_272_ < 0)
			    i_272_ = 0;
			else if (i_272_ > 255)
			    i_272_ = 255;
			var_fw.writeByte(i_270_, (byte) -109);
			var_fw.writeByte(i_271_, (byte) -114);
			var_fw.writeByte(i_272_, (byte) -113);
			var_fw.writeByte(255 - (G[i_261_] & 0xff), (byte) -121);
			i_264_ = lb[i_261_];
			i_267_ = (short) is_254_[i_264_];
			if (i_267_ != 0)
			    f_268_ = ((f_257_ * (float) is_255_[i_264_]
				       + ((float) is_253_[i_264_] * f
					  + (float) is[i_264_] * f_256_))
				      / (float) (256 * i_267_));
			else
			    f_268_ = ((f_257_ * (float) is_255_[i_264_]
				       + ((float) is_253_[i_264_] * f
					  + (float) is[i_264_] * f_256_))
				      * 0.0026041667F);
			f_269_ = f_258_ + ((f_268_ < 0.0F ? f_260_ : f_259_)
					   * f_268_);
			i_270_ = (int) (f_269_ * f_265_);
			i_271_ = (int) (f_266_ * f_269_);
			if (i_270_ < 0)
			    i_270_ = 0;
			else if (i_270_ > 255)
			    i_270_ = 255;
			i_272_ = (int) (f_263_ * f_269_);
			if (i_271_ >= 0) {
			    if (i_271_ > 255)
				i_271_ = 255;
			} else
			    i_271_ = 0;
			if (i_272_ < 0)
			    i_272_ = 0;
			else if (i_272_ > 255)
			    i_272_ = 255;
			((BytesParser) var_fw).pos = i_230_ * i_264_ + i_232_;
			var_fw.writeByte(i_270_, (byte) -120);
			var_fw.writeByte(i_271_, (byte) -125);
			var_fw.writeByte(i_272_, (byte) -127);
			var_fw.writeByte(-(0xff & G[i_261_]) + 255, (byte) -123);
		    }
		}
	    }
	    if (bool_227_) {
		short[] is;
		byte[] is_273_;
		short[] is_274_;
		short[] is_275_;
		if (Pb == null) {
		    is_274_ = Hb;
		    is_273_ = kb;
		    is_275_ = Wb;
		    is = cb;
		} else {
		    is = ((iq) Pb).b;
		    is_273_ = ((iq) Pb).a;
		    is_274_ = ((iq) Pb).e;
		    is_275_ = ((iq) Pb).k;
		}
		float f = 3.0F / (float) ub;
		((BytesParser) var_fw).pos = i_233_;
		float f_276_ = 3.0F / (float) (ub / 2 + ub);
		if (!((qj) ib).ig) {
		    for (int i_277_ = 0; mc > i_277_; i_277_++) {
			int i_278_ = is_273_[i_277_] & 0xff;
			if (i_278_ != 0) {
			    float f_279_ = f / (float) i_278_;
			    var_fw.a((byte) -71,
				     (float) is_275_[i_277_] * f_279_);
			    var_fw.a((byte) -71,
				     (float) is_274_[i_277_] * f_279_);
			    var_fw.a((byte) -71, f_279_ * (float) is[i_277_]);
			} else {
			    var_fw.a((byte) -71,
				     (float) is_275_[i_277_] * f_276_);
			    var_fw.a((byte) -71,
				     (float) is_274_[i_277_] * f_276_);
			    var_fw.a((byte) -71, f_276_ * (float) is[i_277_]);
			}
			((BytesParser) var_fw).pos += i_230_ - 12;
		    }
		} else {
		    for (int i_280_ = 0; mc > i_280_; i_280_++) {
			int i_281_ = 0xff & is_273_[i_280_];
			if (i_281_ == 0) {
			    var_fw.a(f_276_ * (float) is_275_[i_280_], 38);
			    var_fw.a(f_276_ * (float) is_274_[i_280_], -115);
			    var_fw.a((float) is[i_280_] * f_276_, 98);
			} else {
			    float f_282_ = f / (float) i_281_;
			    var_fw.a((float) is_275_[i_280_] * f_282_, -58);
			    var_fw.a(f_282_ * (float) is_274_[i_280_], 72);
			    var_fw.a((float) is[i_280_] * f_282_, 110);
			}
			((BytesParser) var_fw).pos += i_230_ - 12;
		    }
		}
	    }
	    if (bool_229_) {
		((BytesParser) var_fw).pos = i_234_;
		if (!((qj) ib).ig) {
		    for (int i_283_ = 0; i_283_ < mc; i_283_++) {
			var_fw.a((byte) -71, zb[i_283_]);
			var_fw.a((byte) -71, uc[i_283_]);
			((BytesParser) var_fw).pos += i_230_ - 8;
		    }
		} else {
		    for (int i_284_ = 0; i_284_ < mc; i_284_++) {
			var_fw.a(zb[i_284_], 28);
			var_fw.a(uc[i_284_], -119);
			((BytesParser) var_fw).pos += i_230_ - 8;
		    }
		}
	    }
	    ((BytesParser) var_fw).pos = i_230_ * mc;
	    nl var_nl;
	    if (!bool) {
		var_nl = ib.a(((BytesParser) var_fw).bytes, ((BytesParser) var_fw).pos, false, i_230_,
			      70);
		J = true;
	    } else {
		if (O != null)
		    O.a(((BytesParser) var_fw).bytes, ((BytesParser) var_fw).pos, i_230_, (byte) -80);
		else
		    O = ib.a(((BytesParser) var_fw).bytes, ((BytesParser) var_fw).pos, true, i_230_,
			     -99);
		eb = (byte) 0;
		var_nl = O;
	    }
	    if (bool_228_) {
		((gv) K).g = i_231_;
		((gv) K).c = var_nl;
	    }
	    if (bool_229_) {
		((gv) vb).c = var_nl;
		((gv) vb).g = i_234_;
	    }
	    if (bool_226_) {
		((gv) db).g = i_232_;
		((gv) db).c = var_nl;
	    }
	    if (bool_227_) {
		((gv) Fb).c = var_nl;
		((gv) Fb).g = i_233_;
	    }
	}
    }
    
    private final void c(int i) {
	dc++;
	if (J) {
	    J = false;
	    if (pb == null && Cb == null && F == null) {
		if (nc != null && !sba.a((byte) 107, ob, p)) {
		    if (K != null && ((gv) K).c == null)
			J = true;
		    else {
			if (!ac)
			    b((byte) -100);
			nc = null;
		    }
		}
		if (Xb != null && !hj.a(p, (byte) 114, ob)) {
		    if (K == null || ((gv) K).c != null) {
			if (!ac)
			    b((byte) -100);
			Xb = null;
		    } else
			J = true;
		}
		if (Ab != null && !dba.a(ob, -53, p)) {
		    if (K != null && ((gv) K).c == null)
			J = true;
		    else {
			if (!ac)
			    b((byte) -100);
			Ab = null;
		    }
		}
	    }
	    if (v != null && nc == null && Xb == null && Ab == null) {
		rc = null;
		v = null;
	    }
	    if (kb != null && !Class_ec.a(0, ob, p)) {
		if (Fb == null) {
		    if (db != null && ((gv) db).c == null)
			J = true;
		    else {
			Wb = Hb = cb = null;
			kb = null;
		    }
		} else if (((gv) Fb).c != null) {
		    kb = null;
		    Wb = Hb = cb = null;
		} else
		    J = true;
	    }
	    if (Z != null && !ek.a(1, ob, p)) {
		if (db == null || ((gv) db).c != null)
		    Z = null;
		else
		    J = true;
	    }
	    if (G != null && !kga.a(262144, ob, p)) {
		if (db != null && ((gv) db).c == null)
		    J = true;
		else
		    G = null;
	    }
	    if (zb != null && !av.a(p, ob, 1)) {
		if (vb != null && ((gv) vb).c == null)
		    J = true;
		else
		    zb = uc = null;
	    }
	    if (wb != null && !ku.a(ob, (byte) 116, p)) {
		if (db != null && ((gv) db).c == null)
		    J = true;
		else
		    wb = null;
	    }
	    int i_285_ = 113 % ((i + 22) / 44);
	    if (N != null && !ss.a(ob, false, p)) {
		if ((tc == null || ((eh) tc).d != null)
		    && (db == null || ((gv) db).c != null))
		    N = Ib = lb = null;
		else
		    J = true;
	    }
	    if (yb != null && !Class_rb.b(p, (byte) 119, ob)) {
		P = null;
		yb = null;
	    }
	    if (sb != null && !Class_lc.b(ob, 32, p)) {
		sb = null;
		R = null;
	    }
	    if (Gb != null && !fi.a(512, p, ob))
		Gb = null;
	    if (X != null && (0x800 & ob) == 0 && (ob & 0x40000) == 0)
		X = null;
	}
    }
    
    private final short a(int i, int i_286_, int i_287_, float f, int i_288_,
			  long l, float f_289_, int i_290_, eg var_eg,
			  int i_291_) {
	jb++;
	int i_292_ = rc[i_291_];
	int i_293_ = rc[i_291_ + 1];
	int i_294_ = 0;
	if (i_288_ != 26375)
	    d((short) 25, (short) 48);
	for (int i_295_ = i_292_; i_293_ > i_295_; i_295_++) {
	    short i_296_ = v[i_295_];
	    if (i_296_ == 0) {
		i_294_ = i_295_;
		break;
	    }
	    if (l == Login.a[i_295_])
		return (short) (i_296_ - 1);
	}
	v[i_294_] = (short) (mc + 1);
	Login.a[i_294_] = l;
	Wb[mc] = (short) i_290_;
	Hb[mc] = (short) i;
	cb[mc] = (short) i_287_;
	kb[mc] = (byte) i_286_;
	zb[mc] = f;
	uc[mc] = f_289_;
	return (short) mc++;
    }
    
    public static void d(int i) {
	rb = null;
	if (i != 15426)
	    rb = null;
    }
    
    final void d() {
	I++;
    }
    
    final boolean LA() {
	x++;
	return yc;
    }
    
    final da a(byte i, int i_297_, boolean bool) {
	Jb++;
	vaa var_vaa_298_;
	vaa var_vaa_299_;
	if (i != 1) {
	    if (i == 2) {
		var_vaa_298_ = ((qj) ib).Jg;
		var_vaa_299_ = ((qj) ib).Rf;
	    } else if (i == 3) {
		var_vaa_298_ = ((qj) ib).Tg;
		var_vaa_299_ = ((qj) ib).Of;
	    } else if (i != 4) {
		if (i != 5)
		    var_vaa_299_ = var_vaa_298_ = new vaa(ib);
		else {
		    var_vaa_298_ = ((qj) ib).Wf;
		    var_vaa_299_ = ((qj) ib).df;
		}
	    } else {
		var_vaa_298_ = ((qj) ib).Gf;
		var_vaa_299_ = ((qj) ib).og;
	    }
	} else {
	    var_vaa_298_ = ((qj) ib).uf;
	    var_vaa_299_ = ((qj) ib).Dg;
	}
	return a(var_vaa_298_, (byte) 40, bool, var_vaa_299_, i_297_, i != 0);
    }
    
    final void ba(int i, int i_300_, Class_i class_i, Class_i class_i_301_,
		  int i_302_, int i_303_, int i_304_) {
	if (!ac)
	    b((byte) -100);
	kc++;
	int i_305_ = gc + i_302_;
	int i_306_ = oc + i_302_;
	int i_307_ = i_304_ + w;
	int i_308_ = lc + i_304_;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_305_ >= 0
		&& (((Class_i) class_i).k
		    > ((Class_i) class_i).b + i_306_ >> ((Class_i) class_i).g)
		&& i_307_ >= 0
		&& (((Class_i) class_i).b + i_308_ >> ((Class_i) class_i).g
		    < ((Class_i) class_i).j))) {
	    if (i != 4 && i != 5) {
		i_305_ >>= ((Class_i) class_i).g;
		i_306_ = (-1 + ((Class_i) class_i).b + i_306_
			  >> ((Class_i) class_i).g);
		i_307_ >>= ((Class_i) class_i).g;
		i_308_ = (i_308_ - 1 + ((Class_i) class_i).b
			  >> ((Class_i) class_i).g);
		if (class_i.a(i_307_, (byte) 51, i_305_) == i_303_
		    && i_303_ == class_i.a(i_307_, (byte) 51, i_306_)
		    && i_303_ == class_i.a(i_308_, (byte) 51, i_305_)
		    && class_i.a(i_308_, (byte) 51, i_306_) == i_303_)
		    return;
	    } else if (class_i_301_ == null
		       || (i_305_ < 0
			   || ((((Class_i) class_i_301_).b + i_306_
				>> ((Class_i) class_i_301_).g)
			       >= ((Class_i) class_i_301_).k)
			   || i_307_ < 0
			   || ((((Class_i) class_i_301_).b + i_308_
				>> ((Class_i) class_i_301_).g)
			       >= ((Class_i) class_i_301_).j)))
		return;
	    if (i != 1) {
		if (i == 2) {
		    int i_309_ = V;
		    if (i_309_ == 0)
			return;
		    for (int i_310_ = 0; qc > i_310_; i_310_++) {
			int i_311_ = (Xb[i_310_] << 16) / i_309_;
			if (i_300_ > i_311_)
			    Xb[i_310_]
				= (Xb[i_310_]
				   + ((i_300_ - i_311_)
				      * (class_i.a(i_304_ + Ab[i_310_],
						   nc[i_310_] + i_302_, true)
					 - i_303_)
				      / i_300_));
		    }
		} else if (i != 3) {
		    if (i != 4) {
			if (i == 5) {
			    int i_312_ = Y - V;
			    for (int i_313_ = 0; i_313_ < qc; i_313_++) {
				int i_314_ = nc[i_313_] + i_302_;
				int i_315_ = Ab[i_313_] + i_304_;
				int i_316_ = class_i.a(i_315_, i_314_, true);
				int i_317_
				    = class_i_301_.a(i_315_, i_314_, true);
				int i_318_ = -i_317_ - i_300_ + i_316_;
				Xb[i_313_]
				    = ((Xb[i_313_] << 8) / i_312_ * i_318_
				       >> 8) - i_303_ + i_316_;
			    }
			}
		    } else {
			int i_319_ = Y - V;
			for (int i_320_ = 0; qc > i_320_; i_320_++)
			    Xb[i_320_]
				= (i_319_
				   + (Xb[i_320_]
				      + class_i_301_.a(i_304_ + Ab[i_320_],
						       i_302_ + nc[i_320_],
						       true)
				      - i_303_));
		    }
		} else {
		    int i_321_ = (i_300_ & 0xff) * 4;
		    int i_322_ = ((i_300_ & 0xffa0) >> 8) * 4;
		    int i_323_ = 0x3fc0 & i_300_ >> 16 << 6;
		    int i_324_ = 0x3fc0 & i_300_ >> 24 << 6;
		    if (i_302_ - (i_321_ >> 1) < 0
			|| ((i_321_ >> 1) + (i_302_ + ((Class_i) class_i).b)
			    >= ((Class_i) class_i).k << ((Class_i) class_i).g)
			|| i_304_ - (i_322_ >> 1) < 0
			|| (((Class_i) class_i).b + (i_322_ >> 1) + i_304_
			    >= ((Class_i) class_i).j << ((Class_i) class_i).g))
			return;
		    this.a(i_322_, class_i, i_302_, i_323_, 0, i_321_, i_303_,
			   i_324_, i_304_);
		}
	    } else {
		for (int i_325_ = 0; i_325_ < qc; i_325_++)
		    Xb[i_325_] = Xb[i_325_] + class_i.a(Ab[i_325_] + i_304_,
							nc[i_325_] + i_302_,
							true) - i_303_;
	    }
	    if (K != null)
		((gv) K).c = null;
	    ac = false;
	}
    }
    
    final void MA(int i) {
	Q++;
	int i_326_ = GameInPacket.h[i];
	int i_327_ = GameInPacket.i[i];
	for (int i_328_ = 0; qc > i_328_; i_328_++) {
	    int i_329_ = i_327_ * Xb[i_328_] - i_326_ * Ab[i_328_] >> 14;
	    Ab[i_328_] = Xb[i_328_] * i_326_ + i_327_ * Ab[i_328_] >> 14;
	    Xb[i_328_] = i_329_;
	}
	if (K != null)
	    ((gv) K).c = null;
	ac = false;
    }
    
    final void FA() {
	for (int i = 0; i < qc; i++)
	    Ab[i] = -Ab[i];
	bb++;
	for (int i = 0; mc > i; i++)
	    cb[i] = (short) -cb[i];
	for (int i = 0; i < bc; i++) {
	    short i_330_ = N[i];
	    N[i] = lb[i];
	    lb[i] = i_330_;
	}
	if (Fb == null && db != null)
	    ((gv) db).c = null;
	if (Fb != null)
	    ((gv) Fb).c = null;
	if (tc != null)
	    ((eh) tc).d = null;
	if (K != null)
	    ((gv) K).c = null;
	ac = false;
    }
    
    final boolean a(int i, int i_331_, Class_q class_q, boolean bool,
		    int i_332_) {
	Mb++;
	return a(bool, i_332_, class_q, i_331_, i, true);
    }
    
    private final void a(vg var_vg, boolean bool) {
	if (((qj) ib).jh.length < mc) {
	    ((qj) ib).hh = new int[mc];
	    ((qj) ib).jh = new int[mc];
	}
	Tb++;
	int[] is = ((qj) ib).jh;
	int[] is_333_ = ((qj) ib).hh;
	for (int i = 0; qc > i; i++) {
	    int i_334_ = ((nc[i] - (((qj) ib).Eg * Xb[i] >> 8) >> ((qj) ib).le)
			  - ((vg) var_vg).y);
	    int i_335_ = ((Ab[i] - (((qj) ib).Fg * Xb[i] >> 8) >> ((qj) ib).le)
			  - ((vg) var_vg).I);
	    int i_336_ = rc[i];
	    int i_337_ = rc[i + 1];
	    for (int i_338_ = i_336_; i_337_ > i_338_; i_338_++) {
		int i_339_ = v[i_338_] - 1;
		if (i_339_ == -1)
		    break;
		is[i_339_] = i_334_;
		is_333_[i_339_] = i_335_;
	    }
	}
	if (bool == false) {
	    for (int i = 0; vc > i; i++) {
		if (G == null || G[i] <= 128) {
		    short i_340_ = N[i];
		    short i_341_ = Ib[i];
		    short i_342_ = lb[i];
		    int i_343_ = is[i_340_];
		    int i_344_ = is[i_341_];
		    int i_345_ = is[i_342_];
		    int i_346_ = is_333_[i_340_];
		    int i_347_ = is_333_[i_341_];
		    int i_348_ = is_333_[i_342_];
		    if (((i_343_ - i_344_) * (i_347_ - i_348_)
			 - (i_347_ - i_346_) * (i_345_ - i_344_))
			> 0)
			var_vg.a(i_348_, i_343_, i_345_, i_344_, i_346_, 117,
				 i_347_);
		}
	    }
	}
    }
    
    final int na() {
	z++;
	return ub;
    }
    
    final int PA() {
	r++;
	return ob;
    }
    
    final void WA(int i, int i_349_, int i_350_, int i_351_) {
	Yb++;
	if (i == 0) {
	    Class_i.a = 0;
	    ui.a = 0;
	    ul.l = 0;
	    int i_352_ = 0;
	    for (int i_353_ = 0; qc > i_353_; i_353_++) {
		ui.a += nc[i_353_];
		ul.l += Xb[i_353_];
		Class_i.a += Ab[i_353_];
		i_352_++;
	    }
	    if (i_352_ > 0) {
		Class_i.a = i_351_ + Class_i.a / i_352_;
		ul.l = ul.l / i_352_ + i_350_;
		ui.a = ui.a / i_352_ + i_349_;
	    } else {
		ui.a = i_349_;
		Class_i.a = i_351_;
		ul.l = i_350_;
	    }
	} else if (i == 1) {
	    for (int i_354_ = 0; qc > i_354_; i_354_++) {
		nc[i_354_] += i_349_;
		Xb[i_354_] += i_350_;
		Ab[i_354_] += i_351_;
	    }
	} else if (i == 2) {
	    for (int i_355_ = 0; i_355_ < qc; i_355_++) {
		nc[i_355_] -= ui.a;
		Xb[i_355_] -= ul.l;
		Ab[i_355_] -= Class_i.a;
		if (i_351_ != 0) {
		    int i_356_ = GameInPacket.h[i_351_];
		    int i_357_ = GameInPacket.i[i_351_];
		    int i_358_
			= (i_357_ * nc[i_355_] + i_356_ * Xb[i_355_] + 16383
			   >> 14);
		    Xb[i_355_]
			= (i_357_ * Xb[i_355_] + 16383 - i_356_ * nc[i_355_]
			   >> 14);
		    nc[i_355_] = i_358_;
		}
		if (i_349_ != 0) {
		    int i_359_ = GameInPacket.h[i_349_];
		    int i_360_ = GameInPacket.i[i_349_];
		    int i_361_
			= (Xb[i_355_] * i_360_ - i_359_ * Ab[i_355_] + 16383
			   >> 14);
		    Ab[i_355_]
			= (i_359_ * Xb[i_355_] + 16383 + Ab[i_355_] * i_360_
			   >> 14);
		    Xb[i_355_] = i_361_;
		}
		if (i_350_ != 0) {
		    int i_362_ = GameInPacket.h[i_350_];
		    int i_363_ = GameInPacket.i[i_350_];
		    int i_364_
			= (i_362_ * Ab[i_355_] + i_363_ * nc[i_355_] + 16383
			   >> 14);
		    Ab[i_355_] = i_363_ * Ab[i_355_] + (-(i_362_ * nc[i_355_])
							+ 16383) >> 14;
		    nc[i_355_] = i_364_;
		}
		nc[i_355_] += ui.a;
		Xb[i_355_] += ul.l;
		Ab[i_355_] += Class_i.a;
	    }
	} else if (i == 3) {
	    for (int i_365_ = 0; qc > i_365_; i_365_++) {
		nc[i_365_] -= ui.a;
		Xb[i_365_] -= ul.l;
		Ab[i_365_] -= Class_i.a;
		nc[i_365_] = i_349_ * nc[i_365_] / 128;
		Xb[i_365_] = Xb[i_365_] * i_350_ / 128;
		Ab[i_365_] = i_351_ * Ab[i_365_] / 128;
		nc[i_365_] += ui.a;
		Xb[i_365_] += ul.l;
		Ab[i_365_] += Class_i.a;
	    }
	} else if (i == 5) {
	    for (int i_366_ = 0; bc > i_366_; i_366_++) {
		int i_367_ = (G[i_366_] & 0xff) + i_349_ * 8;
		if (i_367_ >= 0) {
		    if (i_367_ > 255)
			i_367_ = 255;
		} else
		    i_367_ = 0;
		G[i_366_] = (byte) i_367_;
	    }
	    if (db != null)
		((gv) db).c = null;
	    if (F != null) {
		for (int i_368_ = 0; i_368_ < E; i_368_++) {
		    ik var_ik = F[i_368_];
		    rda var_rda = B[i_368_];
		    ((rda) var_rda).e
			= (((rda) var_rda).e & 0xffffff
			   | -(G[((ik) var_ik).b] & 0xff) + 255 << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_369_ = 0; bc > i_369_; i_369_++) {
		int i_370_ = 0xffff & Z[i_369_];
		int i_371_ = 0x3f & i_370_ >> 10;
		int i_372_ = 0x7 & i_370_ >> 7;
		i_371_ = 0x3f & i_371_ + i_349_;
		int i_373_ = 0x7f & i_370_;
		i_372_ += i_350_ / 4;
		if (i_372_ >= 0) {
		    if (i_372_ > 7)
			i_372_ = 7;
		} else
		    i_372_ = 0;
		i_373_ += i_351_;
		if (i_373_ < 0)
		    i_373_ = 0;
		else if (i_373_ > 127)
		    i_373_ = 127;
		Z[i_369_]
		    = (short) hba.bitwiseArg1ORArg2(i_373_, hba.bitwiseArg1ORArg2(i_372_ << 7, i_371_ << 10));
	    }
	    if (db != null)
		((gv) db).c = null;
	    if (F != null) {
		for (int i_374_ = 0; i_374_ < E; i_374_++) {
		    ik var_ik = F[i_374_];
		    rda var_rda = B[i_374_];
		    ((rda) var_rda).e
			= (0xffffff & ji.j[0xffff & Z[((ik) var_ik).b]]
			   | ((rda) var_rda).e & ~0xffffff);
		}
	    }
	} else if (i == 8) {
	    for (int i_375_ = 0; E > i_375_; i_375_++) {
		rda var_rda = B[i_375_];
		((rda) var_rda).a += i_350_;
		((rda) var_rda).d += i_349_;
	    }
	} else if (i == 10) {
	    for (int i_376_ = 0; i_376_ < E; i_376_++) {
		rda var_rda = B[i_376_];
		((rda) var_rda).k = ((rda) var_rda).k * i_349_ >> 7;
		((rda) var_rda).f = i_350_ * ((rda) var_rda).f >> 7;
	    }
	} else if (i == 9) {
	    for (int i_377_ = 0; E > i_377_; i_377_++) {
		rda var_rda = B[i_377_];
		((rda) var_rda).j = ((rda) var_rda).j + i_349_ & 0x3fff;
	    }
	}
    }
    
    private final void b(byte i) {
	zc++;
	int i_378_ = 32767;
	if (i != -100)
	    Ib = null;
	int i_379_ = 32767;
	int i_380_ = 32767;
	int i_381_ = -32768;
	int i_382_ = -32768;
	int i_383_ = -32768;
	int i_384_ = 0;
	int i_385_ = 0;
	for (int i_386_ = 0; qc > i_386_; i_386_++) {
	    int i_387_ = nc[i_386_];
	    int i_388_ = Xb[i_386_];
	    int i_389_ = Ab[i_386_];
	    if (i_379_ > i_388_)
		i_379_ = i_388_;
	    if (i_387_ < i_378_)
		i_378_ = i_387_;
	    if (i_382_ < i_388_)
		i_382_ = i_388_;
	    if (i_387_ > i_381_)
		i_381_ = i_387_;
	    if (i_380_ > i_389_)
		i_380_ = i_389_;
	    if (i_383_ < i_389_)
		i_383_ = i_389_;
	    int i_390_ = i_389_ * i_389_ + i_387_ * i_387_;
	    if (i_390_ > i_384_)
		i_384_ = i_390_;
	    i_390_ = i_389_ * i_389_ + (i_387_ * i_387_ + i_388_ * i_388_);
	    if (i_385_ < i_390_)
		i_385_ = i_390_;
	}
	lc = (short) i_383_;
	w = (short) i_380_;
	gc = (short) i_378_;
	Y = (short) i_382_;
	oc = (short) i_381_;
	V = (short) i_379_;
	Zb = (short) (int) (Math.sqrt((double) i_384_) + 0.99);
	xc = (short) (int) (Math.sqrt((double) i_385_) + 0.99);
	ac = true;
    }
    
    final int KA() {
	if (!ac)
	    b((byte) -100);
	C++;
	return gc;
    }
    
    final void W(int i) {
	qb++;
	int i_391_ = GameInPacket.h[i];
	int i_392_ = GameInPacket.i[i];
	for (int i_393_ = 0; qc > i_393_; i_393_++) {
	    int i_394_ = nc[i_393_] * i_392_ + Xb[i_393_] * i_391_ >> 14;
	    Xb[i_393_] = Xb[i_393_] * i_392_ - i_391_ * nc[i_393_] >> 14;
	    nc[i_393_] = i_394_;
	}
	ac = false;
	if (K != null)
	    ((gv) K).c = null;
    }
    
    private final void a(boolean bool, boolean bool_395_) {
	Bb++;
	if (vc * 6 <= ((BytesParser) ((qj) ib).Zf).bytes.length)
	    ((BytesParser) ((qj) ib).Zf).pos = 0;
	else
	    ((qj) ib).Zf = new fw(6 * (vc + 100));
	if (bool == true) {
	    fw var_fw = ((qj) ib).Zf;
	    if (!((qj) ib).ig) {
		for (int i = 0; i < vc; i++) {
		    var_fw.writeShortReversed2(N[i], (byte) 0);
		    var_fw.writeShortReversed2(Ib[i], (byte) 0);
		    var_fw.writeShortReversed2(lb[i], (byte) 0);
		}
	    } else {
		for (int i = 0; i < vc; i++) {
		    var_fw.writeShort(N[i], 13469);
		    var_fw.writeShort(Ib[i], 13469);
		    var_fw.writeShort(lb[i], 13469);
		}
	    }
	    if (((BytesParser) var_fw).pos != 0) {
		if (!bool_395_)
		    ((eh) tc).d = ib.a((byte) -126, ((BytesParser) var_fw).pos,
				       ((BytesParser) var_fw).bytes, false, 5123);
		else {
		    if (sc == null)
			sc = ib.a((byte) -97, ((BytesParser) var_fw).pos, ((BytesParser) var_fw).bytes,
				  true, 5123);
		    else
			sc.a(5123, 17816, ((BytesParser) var_fw).pos, ((BytesParser) var_fw).bytes);
		    ((eh) tc).d = sc;
		}
		if (!bool_395_)
		    J = true;
	    }
	}
    }
    
    final int l() {
	if (!ac)
	    b((byte) -100);
	jc++;
	return oc;
    }
    
    final void d(short i, short i_396_) {
	for (int i_397_ = 0; i_397_ < bc; i_397_++) {
	    if (i == Z[i_397_])
		Z[i_397_] = i_396_;
	}
	t++;
	if (F != null) {
	    for (int i_398_ = 0; i_398_ < E; i_398_++) {
		ik var_ik = F[i_398_];
		rda var_rda = B[i_398_];
		((rda) var_rda).e
		    = (((rda) var_rda).e & ~0xffffff
		       | 0xffffff & ji.j[0xffff & Z[((ik) var_ik).b]]);
	    }
	}
	if (db != null)
	    ((gv) db).c = null;
    }
    
    final int OA() {
	if (!ac)
	    b((byte) -100);
	pc++;
	return w;
    }
    
    private final boolean a(int i, int i_399_, int i_400_, int i_401_,
			    int i_402_, int i_403_, int i_404_, int i_405_,
			    int i_406_) {
	int i_407_ = 40 % ((-56 - i_403_) / 59);
	Ac++;
	if (i < i_401_ && i < i_400_ && i < i_405_)
	    return false;
	if (i > i_401_ && i_400_ < i && i > i_405_)
	    return false;
	if (i_406_ > i_399_ && i_399_ < i_402_ && i_404_ > i_399_)
	    return false;
	if (i_406_ < i_399_ && i_402_ < i_399_ && i_404_ < i_399_)
	    return false;
	return true;
    }
    
    final int K() {
	if (!ac)
	    b((byte) -100);
	Ob++;
	return Zb;
    }
    
    final int RA() {
	hc++;
	if (!ac)
	    b((byte) -100);
	return xc;
    }
    
    final void a(Class_q class_q, pba var_pba, int i) {
	Qb++;
	if (mc != 0) {
	    Class_db class_db = ((qj) ib).Ne;
	    if (!ac)
		b((byte) -100);
	    Class_db class_db_408_ = (Class_db) class_q;
	    qt.J
		= (((Class_db) class_db).p
		   + (((Class_db) class_db).L * ((Class_db) class_db_408_).p
		      + (((Class_db) class_db).j * ((Class_db) class_db_408_).w
			 + (((Class_db) class_db_408_).J
			    * ((Class_db) class_db).v))));
	    World.b = (((Class_db) class_db_408_).q * ((Class_db) class_db).j
		     + ((Class_db) class_db_408_).F * ((Class_db) class_db).v
		     + ((Class_db) class_db).L * ((Class_db) class_db_408_).j);
	    float f = qt.J + (float) V * World.b;
	    float f_409_ = World.b * (float) Y + qt.J;
	    float f_410_;
	    float f_411_;
	    if (!(f_409_ < f)) {
		f_411_ = (float) -Zb + f;
		f_410_ = f_409_ + (float) Zb;
	    } else {
		f_410_ = f + (float) Zb;
		f_411_ = f_409_ - (float) Zb;
	    }
	    if (!(((qj) ib).af <= f_411_)
		&& !((float) ((qj) ib).Jf >= f_410_)) {
		Class_fd.F = (((Class_db) class_db).J
			+ ((((Class_db) class_db).x
			    * ((Class_db) class_db_408_).p)
			   + ((((Class_db) class_db_408_).w
			       * ((Class_db) class_db).F)
			      + (((Class_db) class_db).A
				 * ((Class_db) class_db_408_).J))));
		mfa.k = (((Class_db) class_db_408_).j * ((Class_db) class_db).x
			 + ((((Class_db) class_db).F
			     * ((Class_db) class_db_408_).q)
			    + (((Class_db) class_db).A
			       * ((Class_db) class_db_408_).F)));
		float f_412_ = (float) V * mfa.k + Class_fd.F;
		float f_413_ = Class_fd.F + (float) Y * mfa.k;
		float f_414_;
		float f_415_;
		if (!(f_412_ > f_413_)) {
		    f_414_ = (float) ((qj) ib).bg * (f_412_ - (float) Zb);
		    f_415_ = ((float) Zb + f_413_) * (float) ((qj) ib).bg;
		} else {
		    f_414_ = ((float) -Zb + f_413_) * (float) ((qj) ib).bg;
		    f_415_ = (f_412_ + (float) Zb) * (float) ((qj) ib).bg;
		}
		if (!(f_414_ / f_410_ >= ((qj) ib).ng)
		    && !(((qj) ib).dh >= f_415_ / f_410_)) {
		    pm.C = ((((Class_db) class_db).q
			     * ((Class_db) class_db_408_).q)
			    + (((Class_db) class_db_408_).F
			       * ((Class_db) class_db).r)
			    + (((Class_db) class_db_408_).j
			       * ((Class_db) class_db).n));
		    pm.K = (((Class_db) class_db).w
			    + ((((Class_db) class_db).n
				* ((Class_db) class_db_408_).p)
			       + ((((Class_db) class_db_408_).w
				   * ((Class_db) class_db).q)
				  + (((Class_db) class_db).r
				     * ((Class_db) class_db_408_).J))));
		    float f_416_ = (float) V * pm.C + pm.K;
		    float f_417_ = pm.K + pm.C * (float) Y;
		    float f_418_;
		    float f_419_;
		    if (f_417_ < f_416_) {
			f_419_ = (float) ((qj) ib).eg * ((float) -Zb + f_417_);
			f_418_ = (float) ((qj) ib).eg * (f_416_ + (float) Zb);
		    } else {
			f_418_ = (float) ((qj) ib).eg * ((float) Zb + f_417_);
			f_419_ = (f_416_ - (float) Zb) * (float) ((qj) ib).eg;
		    }
		    if (!(f_419_ / f_410_ >= ((qj) ib).Pf)
			&& !(f_418_ / f_410_ <= ((qj) ib).lg)) {
			if (var_pba != null || F != null) {
			    bfa.w = ((((Class_db) class_db).x
				      * ((Class_db) class_db_408_).v)
				     + ((((Class_db) class_db).F
					 * ((Class_db) class_db_408_).r)
					+ (((Class_db) class_db_408_).A
					   * ((Class_db) class_db).A)));
			    mq.c = ((((Class_db) class_db).q
				     * ((Class_db) class_db_408_).n)
				    + (((Class_db) class_db_408_).x
				       * ((Class_db) class_db).r)
				    + (((Class_db) class_db).n
				       * ((Class_db) class_db_408_).L));
			    lr.i = ((((Class_db) class_db).x
				     * ((Class_db) class_db_408_).L)
				    + ((((Class_db) class_db).A
					* ((Class_db) class_db_408_).x)
				       + (((Class_db) class_db_408_).n
					  * ((Class_db) class_db).F)));
			    mn.b = ((((Class_db) class_db).v
				     * ((Class_db) class_db_408_).x)
				    + (((Class_db) class_db).j
				       * ((Class_db) class_db_408_).n)
				    + (((Class_db) class_db_408_).L
				       * ((Class_db) class_db).L));
			    gca.m = ((((Class_db) class_db_408_).A
				      * ((Class_db) class_db).v)
				     + (((Class_db) class_db_408_).r
					* ((Class_db) class_db).j)
				     + (((Class_db) class_db_408_).v
					* ((Class_db) class_db).L));
			    cd.A = ((((Class_db) class_db_408_).v
				     * ((Class_db) class_db).n)
				    + ((((Class_db) class_db_408_).A
					* ((Class_db) class_db).r)
				       + (((Class_db) class_db_408_).r
					  * ((Class_db) class_db).q)));
			}
			if (var_pba != null) {
			    boolean bool = false;
			    boolean bool_420_ = true;
			    int i_421_ = gc + oc >> 1;
			    int i_422_ = w + lc >> 1;
			    int i_423_
				= (int) ((float) V * mfa.k
					 + (Class_fd.F + (float) i_421_ * bfa.w)
					 + (float) i_422_ * lr.i);
			    int i_424_ = (int) ((float) i_421_ * cd.A + pm.K
						+ (float) V * pm.C
						+ (float) i_422_ * mq.c);
			    int i_425_ = (int) (mn.b * (float) i_422_
						+ (World.b * (float) V
						   + (gca.m * (float) i_421_
						      + qt.J)));
			    if (((qj) ib).Jf <= i_425_) {
				((pba) var_pba).k
				    = (((qj) ib).kg
				       + ((qj) ib).bg * i_423_ / i_425_);
				((pba) var_pba).g
				    = (i_424_ * ((qj) ib).eg / i_425_
				       + ((qj) ib).ag);
			    } else
				bool = true;
			    int i_426_
				= (int) (mfa.k * (float) Y
					 + (Class_fd.F + bfa.w * (float) i_421_)
					 + (float) i_422_ * lr.i);
			    int i_427_
				= (int) ((float) Y * pm.C
					 + (pm.K + cd.A * (float) i_421_)
					 + (float) i_422_ * mq.c);
			    int i_428_ = (int) (qt.J + (float) i_421_ * gca.m
						+ (float) Y * World.b
						+ mn.b * (float) i_422_);
			    if (((qj) ib).Jf <= i_428_) {
				((pba) var_pba).l
				    = (((qj) ib).kg
				       + i_426_ * ((qj) ib).bg / i_428_);
				((pba) var_pba).i
				    = (((qj) ib).ag
				       + i_427_ * ((qj) ib).eg / i_428_);
			    } else
				bool = true;
			    if (bool) {
				if (i_425_ < ((qj) ib).Jf
				    && ((qj) ib).Jf > i_428_)
				    bool_420_ = false;
				else if (i_425_ < ((qj) ib).Jf) {
				    int i_429_ = ((i_428_ - ((qj) ib).Jf << 16)
						  / (i_428_ - i_425_));
				    int i_430_
					= i_426_ + ((i_426_ - i_423_) * i_429_
						    >> 16);
				    int i_431_
					= i_427_ + ((i_427_ - i_424_) * i_429_
						    >> 16);
				    ((pba) var_pba).k
					= ((qj) ib).kg + (i_430_ * ((qj) ib).bg
							  / ((qj) ib).Jf);
				    ((pba) var_pba).g
					= (i_431_ * ((qj) ib).eg / ((qj) ib).Jf
					   + ((qj) ib).ag);
				} else if (i_428_ < ((qj) ib).Jf) {
				    int i_432_ = ((i_425_ - ((qj) ib).Jf << 16)
						  / (i_425_ - i_428_));
				    int i_433_
					= i_423_ + (i_432_ * (i_423_ - i_426_)
						    >> 16);
				    int i_434_
					= i_424_ + (i_432_ * (i_424_ - i_427_)
						    >> 16);
				    ((pba) var_pba).k
					= (((qj) ib).bg * i_433_ / ((qj) ib).Jf
					   + ((qj) ib).kg);
				    ((pba) var_pba).g
					= (i_434_ * ((qj) ib).eg / ((qj) ib).Jf
					   + ((qj) ib).ag);
				}
			    }
			    if (bool_420_) {
				((pba) var_pba).h = true;
				if (i_428_ < i_425_)
				    ((pba) var_pba).j
					= ((qj) ib).kg + ((((qj) ib).bg
							   * (Zb + i_423_)
							   / i_425_)
							  - ((pba) var_pba).k);
				else
				    ((pba) var_pba).j
					= (((qj) ib).kg
					   + ((Zb + i_426_) * ((qj) ib).bg
					      / i_428_)
					   - ((pba) var_pba).l);
			    }
			}
			ib.u(-123);
			ib.b(class_db_408_, 99);
			b((int) 0);
			ib.r(0);
			a((byte) -82);
		    }
		}
	    }
	}
    }
    
    final void a() {
	Bc++;
	if (mc > 0 && vc > 0) {
	    a(-89, false);
	    if ((0x10 & eb) == 0 && ((eh) tc).d == null)
		a(true, false);
	    c(-106);
	}
    }
    
    final void e() {
	S++;
    }
    
    final qg[] f() {
	q++;
	return Cb;
    }
    
    final void B(int i, int[] is, int i_435_, int i_436_, int i_437_,
		 boolean bool, int i_438_, int[] is_439_) {
	U++;
	int i_440_ = is.length;
	if (i == 0) {
	    i_436_ <<= 4;
	    i_435_ <<= 4;
	    i_437_ <<= 4;
	    ui.a = 0;
	    Class_i.a = 0;
	    int i_441_ = 0;
	    ul.l = 0;
	    for (int i_442_ = 0; i_440_ > i_442_; i_442_++) {
		int i_443_ = is[i_442_];
		if (sb.length > i_443_) {
		    int[] is_444_ = sb[i_443_];
		    for (int i_445_ = 0; i_445_ < is_444_.length; i_445_++) {
			int i_446_ = is_444_[i_445_];
			if (R == null || (i_438_ & R[i_446_]) != 0) {
			    ui.a += nc[i_446_];
			    ul.l += Xb[i_446_];
			    i_441_++;
			    Class_i.a += Ab[i_446_];
			}
		    }
		}
	    }
	    if (i_441_ > 0) {
		Class_i.a = i_437_ + Class_i.a / i_441_;
		ul.l = ul.l / i_441_ + i_436_;
		ui.a = ui.a / i_441_ + i_435_;
		ul.t = true;
	    } else {
		ul.l = i_436_;
		ui.a = i_435_;
		Class_i.a = i_437_;
	    }
	} else if (i == 1) {
	    if (is_439_ != null) {
		int i_447_
		    = (i_437_ * is_439_[2] + 8192 + (is_439_[0] * i_435_
						     + is_439_[1] * i_436_)
		       >> 14);
		int i_448_ = ((i_436_ * is_439_[4] + i_435_ * is_439_[3] + 8192
			       + is_439_[5] * i_437_)
			      >> 14);
		int i_449_ = ((i_435_ * is_439_[6] + is_439_[7] * i_436_ + 8192
			       + is_439_[8] * i_437_)
			      >> 14);
		i_435_ = i_447_;
		i_436_ = i_448_;
		i_437_ = i_449_;
	    }
	    i_435_ <<= 4;
	    i_436_ <<= 4;
	    i_437_ <<= 4;
	    for (int i_450_ = 0; i_450_ < i_440_; i_450_++) {
		int i_451_ = is[i_450_];
		if (sb.length > i_451_) {
		    int[] is_452_ = sb[i_451_];
		    for (int i_453_ = 0; is_452_.length > i_453_; i_453_++) {
			int i_454_ = is_452_[i_453_];
			if (R == null || (R[i_454_] & i_438_) != 0) {
			    nc[i_454_] += i_435_;
			    Xb[i_454_] += i_436_;
			    Ab[i_454_] += i_437_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_439_ == null) {
		for (int i_455_ = 0; i_455_ < i_440_; i_455_++) {
		    int i_456_ = is[i_455_];
		    if (sb.length > i_456_) {
			int[] is_457_ = sb[i_456_];
			for (int i_458_ = 0; i_458_ < is_457_.length;
			     i_458_++) {
			    int i_459_ = is_457_[i_458_];
			    if (R == null || (i_438_ & R[i_459_]) != 0) {
				nc[i_459_] -= ui.a;
				Xb[i_459_] -= ul.l;
				Ab[i_459_] -= Class_i.a;
				if (i_437_ != 0) {
				    int i_460_ = GameInPacket.h[i_437_];
				    int i_461_ = GameInPacket.i[i_437_];
				    int i_462_
					= ((i_461_ * nc[i_459_]
					    + Xb[i_459_] * i_460_ + 16383)
					   >> 14);
				    Xb[i_459_] = (i_461_ * Xb[i_459_] + 16383
						  - nc[i_459_] * i_460_) >> 14;
				    nc[i_459_] = i_462_;
				}
				if (i_435_ != 0) {
				    int i_463_ = GameInPacket.h[i_435_];
				    int i_464_ = GameInPacket.i[i_435_];
				    int i_465_ = ((i_464_ * Xb[i_459_] + 16383
						   - i_463_ * Ab[i_459_])
						  >> 14);
				    Ab[i_459_] = (Ab[i_459_] * i_464_
						  + Xb[i_459_] * i_463_
						  + 16383) >> 14;
				    Xb[i_459_] = i_465_;
				}
				if (i_436_ != 0) {
				    int i_466_ = GameInPacket.h[i_436_];
				    int i_467_ = GameInPacket.i[i_436_];
				    int i_468_
					= ((i_466_ * Ab[i_459_]
					    - (-(i_467_ * nc[i_459_]) - 16383))
					   >> 14);
				    Ab[i_459_] = (i_467_ * Ab[i_459_] + 16383
						  - i_466_ * nc[i_459_]) >> 14;
				    nc[i_459_] = i_468_;
				}
				nc[i_459_] += ui.a;
				Xb[i_459_] += ul.l;
				Ab[i_459_] += Class_i.a;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_469_ = 0; i_440_ > i_469_; i_469_++) {
			int i_470_ = is[i_469_];
			if (i_470_ < sb.length) {
			    int[] is_471_ = sb[i_470_];
			    for (int i_472_ = 0; is_471_.length > i_472_;
				 i_472_++) {
				int i_473_ = is_471_[i_472_];
				if (R == null || (i_438_ & R[i_473_]) != 0) {
				    int i_474_ = rc[i_473_];
				    int i_475_ = rc[i_473_ + 1];
				    for (int i_476_ = i_474_; i_476_ < i_475_;
					 i_476_++) {
					int i_477_ = v[i_476_] - 1;
					if (i_477_ == -1)
					    break;
					if (i_437_ != 0) {
					    int i_478_ = GameInPacket.h[i_437_];
					    int i_479_ = GameInPacket.i[i_437_];
					    int i_480_ = (Hb[i_477_] * i_478_
							  + Wb[i_477_] * i_479_
							  + 16383) >> 14;
					    Hb[i_477_]
						= (short) ((Hb[i_477_] * i_479_
							    - (Wb[i_477_]
							       * i_478_)
							    + 16383)
							   >> 14);
					    Wb[i_477_] = (short) i_480_;
					}
					if (i_435_ != 0) {
					    int i_481_ = GameInPacket.h[i_435_];
					    int i_482_ = GameInPacket.i[i_435_];
					    int i_483_
						= ((i_482_ * Hb[i_477_]
						    + (-(i_481_ * cb[i_477_])
						       + 16383))
						   >> 14);
					    cb[i_477_]
						= (short) ((cb[i_477_] * i_482_
							    + ((i_481_
								* Hb[i_477_])
							       + 16383))
							   >> 14);
					    Hb[i_477_] = (short) i_483_;
					}
					if (i_436_ != 0) {
					    int i_484_ = GameInPacket.h[i_436_];
					    int i_485_ = GameInPacket.i[i_436_];
					    int i_486_ = (i_485_ * Wb[i_477_]
							  + cb[i_477_] * i_484_
							  + 16383) >> 14;
					    cb[i_477_]
						= (short) ((cb[i_477_] * i_485_
							    - (Wb[i_477_]
							       * i_484_)
							    + 16383)
							   >> 14);
					    Wb[i_477_] = (short) i_486_;
					}
				    }
				}
			    }
			}
		    }
		    if (Fb == null && db != null)
			((gv) db).c = null;
		    if (Fb != null)
			((gv) Fb).c = null;
		}
	    } else {
		int i_487_ = is_439_[9] << 4;
		int i_488_ = is_439_[10] << 4;
		int i_489_ = is_439_[11] << 4;
		int i_490_ = is_439_[12] << 4;
		int i_491_ = is_439_[13] << 4;
		int i_492_ = is_439_[14] << 4;
		if (ul.t) {
		    int i_493_ = ul.l * is_439_[3] + (is_439_[0] * ui.a
						      + (is_439_[6] * Class_i.a
							 + 8192)) >> 14;
		    int i_494_ = ((ui.a * is_439_[1] + ul.l * is_439_[4]
				   + (is_439_[7] * Class_i.a + 8192))
				  >> 14);
		    i_494_ += i_491_;
		    int i_495_ = ((is_439_[8] * Class_i.a + ui.a * is_439_[2]
				   + ul.l * is_439_[5] + 8192)
				  >> 14);
		    i_493_ += i_490_;
		    ui.a = i_493_;
		    ul.l = i_494_;
		    i_495_ += i_492_;
		    Class_i.a = i_495_;
		    ul.t = false;
		}
		int[] is_496_ = new int[9];
		int i_497_ = GameInPacket.i[i_435_];
		int i_498_ = GameInPacket.h[i_435_];
		int i_499_ = GameInPacket.i[i_436_];
		int i_500_ = GameInPacket.h[i_436_];
		int i_501_ = GameInPacket.i[i_437_];
		int i_502_ = GameInPacket.h[i_437_];
		int i_503_ = i_501_ * i_498_ + 8192 >> 14;
		int i_504_ = i_498_ * i_502_ + 8192 >> 14;
		is_496_[7] = i_502_ * i_500_ + (i_503_ * i_499_ + 8192) >> 14;
		is_496_[0] = i_504_ * i_500_ + i_499_ * i_501_ + 8192 >> 14;
		is_496_[3] = i_497_ * i_502_ + 8192 >> 14;
		is_496_[6] = i_499_ * i_504_ + i_501_ * -i_500_ + 8192 >> 14;
		is_496_[2] = i_497_ * i_500_ + 8192 >> 14;
		is_496_[1] = -i_499_ * i_502_ + 8192 + i_503_ * i_500_ >> 14;
		is_496_[8] = i_497_ * i_499_ + 8192 >> 14;
		is_496_[5] = -i_498_;
		is_496_[4] = i_497_ * i_501_ + 8192 >> 14;
		int i_505_
		    = (-Class_i.a * is_496_[2] + 8192 + (-ul.l * is_496_[1]
							 + -ui.a * is_496_[0])
		       >> 14);
		int i_506_
		    = ((-Class_i.a * is_496_[5]
			+ (-ui.a * is_496_[3] + is_496_[4] * -ul.l) + 8192)
		       >> 14);
		int i_507_ = ((is_496_[8] * -Class_i.a + -ul.l * is_496_[7]
			       + (-ui.a * is_496_[6] + 8192))
			      >> 14);
		int i_508_ = i_505_ + ui.a;
		int i_509_ = i_506_ + ul.l;
		int i_510_ = i_507_ + Class_i.a;
		int[] is_511_ = new int[9];
		for (int i_512_ = 0; i_512_ < 3; i_512_++) {
		    for (int i_513_ = 0; i_513_ < 3; i_513_++) {
			int i_514_ = 0;
			for (int i_515_ = 0; i_515_ < 3; i_515_++)
			    i_514_ += (is_439_[3 * i_513_ + i_515_]
				       * is_496_[i_512_ * 3 + i_515_]);
			is_511_[i_513_ + i_512_ * 3] = i_514_ + 8192 >> 14;
		    }
		}
		int i_516_
		    = (is_496_[1] * i_491_ + 8192 + (is_496_[0] * i_490_
						     + i_492_ * is_496_[2])
		       >> 14);
		int i_517_ = ((is_496_[4] * i_491_ + is_496_[3] * i_490_
			       + i_492_ * is_496_[5] + 8192)
			      >> 14);
		int i_518_
		    = (is_496_[6] * i_490_ - (-(i_491_ * is_496_[7])
					      - is_496_[8] * i_492_) + 8192
		       >> 14);
		i_517_ += i_509_;
		i_516_ += i_508_;
		i_518_ += i_510_;
		int[] is_519_ = new int[9];
		for (int i_520_ = 0; i_520_ < 3; i_520_++) {
		    for (int i_521_ = 0; i_521_ < 3; i_521_++) {
			int i_522_ = 0;
			for (int i_523_ = 0; i_523_ < 3; i_523_++)
			    i_522_ += (is_439_[i_523_ + i_520_ * 3]
				       * is_511_[i_523_ * 3 + i_521_]);
			is_519_[i_521_ + 3 * i_520_] = i_522_ + 8192 >> 14;
		    }
		}
		int i_524_
		    = ((i_518_ * is_439_[2]
			+ (is_439_[1] * i_517_ + i_516_ * is_439_[0]) + 8192)
		       >> 14);
		int i_525_ = ((is_439_[5] * i_518_ + is_439_[4] * i_517_ + 8192
			       + is_439_[3] * i_516_)
			      >> 14);
		i_524_ += i_487_;
		int i_526_ = ((is_439_[8] * i_518_ + i_517_ * is_439_[7] + 8192
			       + is_439_[6] * i_516_)
			      >> 14);
		i_525_ += i_488_;
		i_526_ += i_489_;
		for (int i_527_ = 0; i_440_ > i_527_; i_527_++) {
		    int i_528_ = is[i_527_];
		    if (i_528_ < sb.length) {
			int[] is_529_ = sb[i_528_];
			for (int i_530_ = 0; is_529_.length > i_530_;
			     i_530_++) {
			    int i_531_ = is_529_[i_530_];
			    if (R == null || (i_438_ & R[i_531_]) != 0) {
				int i_532_ = ((Ab[i_531_] * is_519_[2] + 8192
					       + (Xb[i_531_] * is_519_[1]
						  + nc[i_531_] * is_519_[0]))
					      >> 14);
				int i_533_
				    = ((Ab[i_531_] * is_519_[5]
					+ Xb[i_531_] * is_519_[4]
					+ is_519_[3] * nc[i_531_] + 8192)
				       >> 14);
				i_533_ += i_525_;
				int i_534_
				    = ((is_519_[8] * Ab[i_531_]
					+ nc[i_531_] * is_519_[6]
					+ Xb[i_531_] * is_519_[7] + 8192)
				       >> 14);
				i_532_ += i_524_;
				i_534_ += i_526_;
				nc[i_531_] = i_532_;
				Xb[i_531_] = i_533_;
				Ab[i_531_] = i_534_;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_439_ != null) {
		int i_535_ = is_439_[9] << 4;
		int i_536_ = is_439_[10] << 4;
		int i_537_ = is_439_[11] << 4;
		int i_538_ = is_439_[12] << 4;
		int i_539_ = is_439_[13] << 4;
		int i_540_ = is_439_[14] << 4;
		if (ul.t) {
		    int i_541_ = ((is_439_[3] * ul.l + ui.a * is_439_[0] + 8192
				   + Class_i.a * is_439_[6])
				  >> 14);
		    int i_542_ = ((ui.a * is_439_[1] + is_439_[4] * ul.l
				   + Class_i.a * is_439_[7] + 8192)
				  >> 14);
		    i_542_ += i_539_;
		    i_541_ += i_538_;
		    int i_543_ = ((ul.l * is_439_[5] + ui.a * is_439_[2] + 8192
				   + Class_i.a * is_439_[8])
				  >> 14);
		    i_543_ += i_540_;
		    ui.a = i_541_;
		    ul.l = i_542_;
		    ul.t = false;
		    Class_i.a = i_543_;
		}
		int i_544_ = i_435_ << 15 >> 7;
		int i_545_ = i_436_ << 15 >> 7;
		int i_546_ = i_437_ << 15 >> 7;
		int i_547_ = i_544_ * -ui.a + 8192 >> 14;
		int i_548_ = -ul.l * i_545_ + 8192 >> 14;
		int i_549_ = i_546_ * -Class_i.a + 8192 >> 14;
		int i_550_ = ui.a + i_547_;
		int i_551_ = ul.l + i_548_;
		int i_552_ = Class_i.a + i_549_;
		int[] is_553_ = new int[9];
		is_553_[2] = is_439_[6] * i_544_ + 8192 >> 14;
		is_553_[0] = i_544_ * is_439_[0] + 8192 >> 14;
		is_553_[1] = is_439_[3] * i_544_ + 8192 >> 14;
		is_553_[3] = is_439_[1] * i_545_ + 8192 >> 14;
		is_553_[5] = i_545_ * is_439_[7] + 8192 >> 14;
		is_553_[4] = i_545_ * is_439_[4] + 8192 >> 14;
		is_553_[6] = is_439_[2] * i_546_ + 8192 >> 14;
		is_553_[8] = i_546_ * is_439_[8] + 8192 >> 14;
		is_553_[7] = is_439_[5] * i_546_ + 8192 >> 14;
		int i_554_ = i_538_ * i_544_ + 8192 >> 14;
		int i_555_ = i_539_ * i_545_ + 8192 >> 14;
		i_555_ += i_551_;
		int i_556_ = i_540_ * i_546_ + 8192 >> 14;
		i_554_ += i_550_;
		i_556_ += i_552_;
		int[] is_557_ = new int[9];
		for (int i_558_ = 0; i_558_ < 3; i_558_++) {
		    for (int i_559_ = 0; i_559_ < 3; i_559_++) {
			int i_560_ = 0;
			for (int i_561_ = 0; i_561_ < 3; i_561_++)
			    i_560_ += (is_553_[3 * i_561_ + i_559_]
				       * is_439_[i_561_ + i_558_ * 3]);
			is_557_[3 * i_558_ + i_559_] = i_560_ + 8192 >> 14;
		    }
		}
		int i_562_ = ((i_554_ * is_439_[0] + i_555_ * is_439_[1] + 8192
			       + is_439_[2] * i_556_)
			      >> 14);
		int i_563_
		    = (is_439_[3] * i_554_ + 8192 - (-(i_556_ * is_439_[5])
						     - is_439_[4] * i_555_)
		       >> 14);
		i_562_ += i_535_;
		i_563_ += i_536_;
		int i_564_ = ((i_556_ * is_439_[8] + i_554_ * is_439_[6]
			       + (is_439_[7] * i_555_ + 8192))
			      >> 14);
		i_564_ += i_537_;
		for (int i_565_ = 0; i_440_ > i_565_; i_565_++) {
		    int i_566_ = is[i_565_];
		    if (sb.length > i_566_) {
			int[] is_567_ = sb[i_566_];
			for (int i_568_ = 0; i_568_ < is_567_.length;
			     i_568_++) {
			    int i_569_ = is_567_[i_568_];
			    if (R == null || (R[i_569_] & i_438_) != 0) {
				int i_570_ = ((is_557_[2] * Ab[i_569_]
					       + nc[i_569_] * is_557_[0] + 8192
					       + is_557_[1] * Xb[i_569_])
					      >> 14);
				int i_571_ = ((Ab[i_569_] * is_557_[5] + 8192
					       + is_557_[3] * nc[i_569_]
					       + is_557_[4] * Xb[i_569_])
					      >> 14);
				i_570_ += i_562_;
				int i_572_
				    = ((Xb[i_569_] * is_557_[7]
					+ is_557_[6] * nc[i_569_]
					- (-(is_557_[8] * Ab[i_569_]) - 8192))
				       >> 14);
				i_571_ += i_563_;
				i_572_ += i_564_;
				nc[i_569_] = i_570_;
				Xb[i_569_] = i_571_;
				Ab[i_569_] = i_572_;
			    }
			}
		    }
		}
	    } else {
		for (int i_573_ = 0; i_573_ < i_440_; i_573_++) {
		    int i_574_ = is[i_573_];
		    if (sb.length > i_574_) {
			int[] is_575_ = sb[i_574_];
			for (int i_576_ = 0; is_575_.length > i_576_;
			     i_576_++) {
			    int i_577_ = is_575_[i_576_];
			    if (R == null || (i_438_ & R[i_577_]) != 0) {
				nc[i_577_] -= ui.a;
				Xb[i_577_] -= ul.l;
				Ab[i_577_] -= Class_i.a;
				nc[i_577_] = nc[i_577_] * i_435_ >> 7;
				Xb[i_577_] = Xb[i_577_] * i_436_ >> 7;
				Ab[i_577_] = i_437_ * Ab[i_577_] >> 7;
				nc[i_577_] += ui.a;
				Xb[i_577_] += ul.l;
				Ab[i_577_] += Class_i.a;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (yb != null) {
		for (int i_578_ = 0; i_440_ > i_578_; i_578_++) {
		    int i_579_ = is[i_578_];
		    if (i_579_ < yb.length) {
			int[] is_580_ = yb[i_579_];
			for (int i_581_ = 0; is_580_.length > i_581_;
			     i_581_++) {
			    int i_582_ = is_580_[i_581_];
			    if (P == null || (i_438_ & P[i_582_]) != 0) {
				int i_583_ = 8 * i_435_ + (G[i_582_] & 0xff);
				if (i_583_ < 0)
				    i_583_ = 0;
				else if (i_583_ > 255)
				    i_583_ = 255;
				G[i_582_] = (byte) i_583_;
				if (db != null)
				    ((gv) db).c = null;
			    }
			}
		    }
		}
		if (F != null) {
		    for (int i_584_ = 0; i_584_ < E; i_584_++) {
			ik var_ik = F[i_584_];
			rda var_rda = B[i_584_];
			((rda) var_rda).e
			    = (-(0xff & G[((ik) var_ik).b]) + 255 << 24
			       | ((rda) var_rda).e & 0xffffff);
		    }
		}
	    }
	} else if (i == 7) {
	    if (yb != null) {
		for (int i_585_ = 0; i_440_ > i_585_; i_585_++) {
		    int i_586_ = is[i_585_];
		    if (i_586_ < yb.length) {
			int[] is_587_ = yb[i_586_];
			for (int i_588_ = 0; i_588_ < is_587_.length;
			     i_588_++) {
			    int i_589_ = is_587_[i_588_];
			    if (P == null || (P[i_589_] & i_438_) != 0) {
				int i_590_ = 0xffff & Z[i_589_];
				int i_591_ = i_590_ >> 10 & 0x3f;
				int i_592_ = (0x3c1 & i_590_) >> 7;
				i_591_ = 0x3f & i_435_ + i_591_;
				i_592_ += i_436_ / 4;
				int i_593_ = i_590_ & 0x7f;
				if (i_592_ < 0)
				    i_592_ = 0;
				else if (i_592_ > 7)
				    i_592_ = 7;
				i_593_ += i_437_;
				if (i_593_ >= 0) {
				    if (i_593_ > 127)
					i_593_ = 127;
				} else
				    i_593_ = 0;
				Z[i_589_] = (short) hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(i_591_ << 10,
								i_592_ << 7),
							  i_593_);
				if (db != null)
				    ((gv) db).c = null;
			    }
			}
		    }
		}
		if (F != null) {
		    for (int i_594_ = 0; i_594_ < E; i_594_++) {
			ik var_ik = F[i_594_];
			rda var_rda = B[i_594_];
			((rda) var_rda).e
			    = (~0xffffff & ((rda) var_rda).e
			       | 0xffffff & ji.j[Z[((ik) var_ik).b] & 0xffff]);
		    }
		}
	    }
	} else if (i == 8) {
	    if (Gb != null) {
		for (int i_595_ = 0; i_595_ < i_440_; i_595_++) {
		    int i_596_ = is[i_595_];
		    if (Gb.length > i_596_) {
			int[] is_597_ = Gb[i_596_];
			for (int i_598_ = 0; is_597_.length > i_598_;
			     i_598_++) {
			    rda var_rda = B[is_597_[i_598_]];
			    ((rda) var_rda).d += i_435_;
			    ((rda) var_rda).a += i_436_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (Gb != null) {
		for (int i_599_ = 0; i_599_ < i_440_; i_599_++) {
		    int i_600_ = is[i_599_];
		    if (Gb.length > i_600_) {
			int[] is_601_ = Gb[i_600_];
			for (int i_602_ = 0; i_602_ < is_601_.length;
			     i_602_++) {
			    rda var_rda = B[is_601_[i_602_]];
			    ((rda) var_rda).f
				= i_436_ * ((rda) var_rda).f >> 7;
			    ((rda) var_rda).k
				= i_435_ * ((rda) var_rda).k >> 7;
			}
		    }
		}
	    }
	} else if (i == 9 && Gb != null) {
	    for (int i_603_ = 0; i_603_ < i_440_; i_603_++) {
		int i_604_ = is[i_603_];
		if (i_604_ < Gb.length) {
		    int[] is_605_ = Gb[i_604_];
		    for (int i_606_ = 0; i_606_ < is_605_.length; i_606_++) {
			rda var_rda = B[is_605_[i_606_]];
			((rda) var_rda).j
			    = 0x3fff & i_435_ + ((rda) var_rda).j;
		    }
		}
	    }
	}
    }
    
    final void L() {
	Cc++;
	for (int i = 0; i < W; i++) {
	    nc[i] = nc[i] + 7 >> 4;
	    Xb[i] = Xb[i] + 7 >> 4;
	    Ab[i] = Ab[i] + 7 >> 4;
	}
	ac = false;
	if (K != null)
	    ((gv) K).c = null;
    }
    
    final void ga(int i) {
	ub = (short) i;
	if (db != null)
	    ((gv) db).c = null;
	gb++;
	if (Fb != null)
	    ((gv) Fb).c = null;
    }
    
    final void fa(int i) {
	ic++;
	int i_607_ = GameInPacket.h[i];
	int i_608_ = GameInPacket.i[i];
	for (int i_609_ = 0; qc > i_609_; i_609_++) {
	    int i_610_ = Ab[i_609_] * i_607_ + i_608_ * nc[i_609_] >> 14;
	    Ab[i_609_] = Ab[i_609_] * i_608_ - i_607_ * nc[i_609_] >> 14;
	    nc[i_609_] = i_610_;
	}
	for (int i_611_ = 0; i_611_ < mc; i_611_++) {
	    int i_612_ = i_608_ * Wb[i_611_] + cb[i_611_] * i_607_ >> 14;
	    cb[i_611_]
		= (short) (cb[i_611_] * i_608_ - i_607_ * Wb[i_611_] >> 14);
	    Wb[i_611_] = (short) i_612_;
	}
	if (Fb == null && db != null)
	    ((gv) db).c = null;
	if (Fb != null)
	    ((gv) Fb).c = null;
	ac = false;
	if (K != null)
	    ((gv) K).c = null;
    }
    
    final void a(int i, int i_613_, int i_614_, int i_615_) {
	for (int i_616_ = 0; i_616_ < bc; i_616_++) {
	    int i_617_ = Z[i_616_] & 0xffff;
	    int i_618_ = (i_617_ & 0xff2c) >> 10;
	    int i_619_ = (0x393 & i_617_) >> 7;
	    if (i != -1)
		i_618_ = ((i - i_618_) * i_615_ >> 7) + i_618_;
	    int i_620_ = 0x7f & i_617_;
	    if (i_613_ != -1)
		i_619_ = ((i_613_ - i_619_) * i_615_ >> 7) + i_619_;
	    if (i_614_ != -1)
		i_620_ += i_615_ * (i_614_ - i_620_) >> 7;
	    Z[i_616_]
		= (short) hba.bitwiseArg1ORArg2(i_620_, hba.bitwiseArg1ORArg2(i_618_ << 10, i_619_ << 7));
	}
	Ub++;
	if (F != null) {
	    for (int i_621_ = 0; i_621_ < E; i_621_++) {
		ik var_ik = F[i_621_];
		rda var_rda = B[i_621_];
		((rda) var_rda).e
		    = (((rda) var_rda).e & ~0xffffff
		       | ji.j[0xffff & Z[((ik) var_ik).b]] & 0xffffff);
	    }
	}
	if (db != null)
	    ((gv) db).c = null;
    }
    
    private final da a(vaa var_vaa_622_, byte i, boolean bool,
		       vaa var_vaa_623_, int i_624_, boolean bool_625_) {
	var_vaa_623_.eb = (byte) 0;
	var_vaa_623_.E = E;
	var_vaa_623_.vc = vc;
	var_vaa_623_.W = W;
	y++;
	var_vaa_623_.u = u;
	var_vaa_623_.qc = qc;
	var_vaa_623_.bc = bc;
	var_vaa_623_.p = p;
	var_vaa_623_.mc = mc;
	var_vaa_623_.ub = ub;
	var_vaa_623_.ob = i_624_;
	if ((i_624_ & 0x100) != 0)
	    var_vaa_623_.yc = true;
	else
	    var_vaa_623_.yc = yc;
	boolean bool_626_ = dk.a(33, i_624_, p);
	boolean bool_627_ = Class_db.a(p, i_624_, false);
	boolean bool_628_ = dga.b(119, i_624_, p);
	boolean bool_629_ = bool_628_ | (bool_626_ | bool_627_);
	if (bool_629_) {
	    if (bool_626_) {
		if (var_vaa_622_.nc == null || var_vaa_622_.nc.length < W)
		    var_vaa_623_.nc = var_vaa_622_.nc = new int[W];
		else
		    var_vaa_623_.nc = var_vaa_622_.nc;
	    } else
		var_vaa_623_.nc = nc;
	    if (!bool_627_)
		var_vaa_623_.Xb = Xb;
	    else if (var_vaa_622_.Xb != null && var_vaa_622_.Xb.length >= W)
		var_vaa_623_.Xb = var_vaa_622_.Xb;
	    else
		var_vaa_623_.Xb = var_vaa_622_.Xb = new int[W];
	    if (bool_628_) {
		if (var_vaa_622_.Ab == null || W > var_vaa_622_.Ab.length)
		    var_vaa_623_.Ab = var_vaa_622_.Ab = new int[W];
		else
		    var_vaa_623_.Ab = var_vaa_622_.Ab;
	    } else
		var_vaa_623_.Ab = Ab;
	    for (int i_630_ = 0; i_630_ < W; i_630_++) {
		if (bool_626_)
		    var_vaa_623_.nc[i_630_] = nc[i_630_];
		if (bool_627_)
		    var_vaa_623_.Xb[i_630_] = Xb[i_630_];
		if (bool_628_)
		    var_vaa_623_.Ab[i_630_] = Ab[i_630_];
	    }
	} else {
	    var_vaa_623_.Xb = Xb;
	    var_vaa_623_.Ab = Ab;
	    var_vaa_623_.nc = nc;
	}
	if (ih.a(i_624_, i - 41, p)) {
	    if (bool_625_)
		var_vaa_623_.eb |= 0x1;
	    var_vaa_623_.K = var_vaa_622_.K;
	    ((gv) var_vaa_623_.K).g = ((gv) K).g;
	    ((gv) var_vaa_623_.K).c = ((gv) K).c;
	} else if (!fn.a(-44, i_624_, p))
	    var_vaa_623_.K = null;
	else
	    var_vaa_623_.K = K;
	if (!tl.a(i_624_, p, 14031))
	    var_vaa_623_.Z = Z;
	else {
	    if (var_vaa_622_.Z == null || bc > var_vaa_622_.Z.length)
		var_vaa_623_.Z = var_vaa_622_.Z = new short[bc];
	    else
		var_vaa_623_.Z = var_vaa_622_.Z;
	    for (int i_631_ = 0; bc > i_631_; i_631_++)
		var_vaa_623_.Z[i_631_] = Z[i_631_];
	}
	if (!Class_b.a(p, i_624_, 0))
	    var_vaa_623_.G = G;
	else {
	    if (var_vaa_622_.G != null && var_vaa_622_.G.length >= bc)
		var_vaa_623_.G = var_vaa_622_.G;
	    else
		var_vaa_623_.G = var_vaa_622_.G = new byte[bc];
	    for (int i_632_ = 0; bc > i_632_; i_632_++)
		var_vaa_623_.G[i_632_] = G[i_632_];
	}
	if (!kl.a(i_624_, 55, p)) {
	    if (!uca.a(2048, p, i_624_))
		var_vaa_623_.db = null;
	    else
		var_vaa_623_.db = db;
	} else {
	    var_vaa_623_.db = var_vaa_622_.db;
	    if (bool_625_)
		var_vaa_623_.eb |= 0x2;
	    ((gv) var_vaa_623_.db).g = ((gv) db).g;
	    ((gv) var_vaa_623_.db).c = ((gv) db).c;
	}
	if (Class_q.a(p, 116, i_624_)) {
	    if (var_vaa_622_.Wb != null && mc <= var_vaa_622_.Wb.length) {
		var_vaa_623_.Wb = var_vaa_622_.Wb;
		var_vaa_623_.Hb = var_vaa_622_.Hb;
		var_vaa_623_.cb = var_vaa_622_.cb;
	    } else {
		int i_633_ = mc;
		var_vaa_623_.Wb = var_vaa_622_.Wb = new short[i_633_];
		var_vaa_623_.Hb = var_vaa_622_.Hb = new short[i_633_];
		var_vaa_623_.cb = var_vaa_622_.cb = new short[i_633_];
	    }
	    if (Pb != null) {
		if (var_vaa_622_.Pb == null)
		    var_vaa_622_.Pb = new iq();
		iq var_iq = var_vaa_623_.Pb = var_vaa_622_.Pb;
		if (((iq) var_iq).k == null || mc > ((iq) var_iq).k.length) {
		    int i_634_ = mc;
		    ((iq) var_iq).b = new short[i_634_];
		    ((iq) var_iq).a = new byte[i_634_];
		    ((iq) var_iq).e = new short[i_634_];
		    ((iq) var_iq).k = new short[i_634_];
		}
		for (int i_635_ = 0; i_635_ < mc; i_635_++) {
		    var_vaa_623_.Wb[i_635_] = Wb[i_635_];
		    var_vaa_623_.Hb[i_635_] = Hb[i_635_];
		    var_vaa_623_.cb[i_635_] = cb[i_635_];
		    ((iq) var_iq).k[i_635_] = ((iq) Pb).k[i_635_];
		    ((iq) var_iq).e[i_635_] = ((iq) Pb).e[i_635_];
		    ((iq) var_iq).b[i_635_] = ((iq) Pb).b[i_635_];
		    ((iq) var_iq).a[i_635_] = ((iq) Pb).a[i_635_];
		}
	    } else {
		for (int i_636_ = 0; mc > i_636_; i_636_++) {
		    var_vaa_623_.Wb[i_636_] = Wb[i_636_];
		    var_vaa_623_.Hb[i_636_] = Hb[i_636_];
		    var_vaa_623_.cb[i_636_] = cb[i_636_];
		}
	    }
	    var_vaa_623_.kb = kb;
	} else {
	    var_vaa_623_.Hb = Hb;
	    var_vaa_623_.Wb = Wb;
	    var_vaa_623_.Pb = Pb;
	    var_vaa_623_.cb = cb;
	    var_vaa_623_.kb = kb;
	}
	if (!eq.a(i_624_, p, -36)) {
	    if (tj.a(p, i ^ 0x1f, i_624_))
		var_vaa_623_.Fb = Fb;
	    else
		var_vaa_623_.Fb = null;
	} else {
	    var_vaa_623_.Fb = var_vaa_622_.Fb;
	    if (bool_625_)
		var_vaa_623_.eb |= 0x4;
	    ((gv) var_vaa_623_.Fb).g = ((gv) Fb).g;
	    ((gv) var_vaa_623_.Fb).c = ((gv) Fb).c;
	}
	if (eba.a((byte) 54, i_624_, p)) {
	    if (var_vaa_622_.zb == null || bc > var_vaa_622_.zb.length) {
		int i_637_ = mc;
		var_vaa_623_.zb = var_vaa_622_.zb = new float[i_637_];
		var_vaa_623_.uc = var_vaa_622_.uc = new float[i_637_];
	    } else {
		var_vaa_623_.zb = var_vaa_622_.zb;
		var_vaa_623_.uc = var_vaa_622_.uc;
	    }
	    for (int i_638_ = 0; i_638_ < mc; i_638_++) {
		var_vaa_623_.zb[i_638_] = zb[i_638_];
		var_vaa_623_.uc[i_638_] = uc[i_638_];
	    }
	} else {
	    var_vaa_623_.zb = zb;
	    var_vaa_623_.uc = uc;
	}
	if (!nf.a(i ^ 0x29, p, i_624_)) {
	    if (!cf.a(p, (byte) -123, i_624_))
		var_vaa_623_.vb = null;
	    else
		var_vaa_623_.vb = vb;
	} else {
	    if (bool_625_)
		var_vaa_623_.eb |= 0x8;
	    var_vaa_623_.vb = var_vaa_622_.vb;
	    ((gv) var_vaa_623_.vb).g = ((gv) vb).g;
	    ((gv) var_vaa_623_.vb).c = ((gv) vb).c;
	}
	if (ih.a((byte) 69, i_624_, p)) {
	    if (var_vaa_622_.N == null || bc > var_vaa_622_.N.length) {
		int i_639_ = bc;
		var_vaa_623_.lb = var_vaa_622_.lb = new short[i_639_];
		var_vaa_623_.Ib = var_vaa_622_.Ib = new short[i_639_];
		var_vaa_623_.N = var_vaa_622_.N = new short[i_639_];
	    } else {
		var_vaa_623_.N = var_vaa_622_.N;
		var_vaa_623_.lb = var_vaa_622_.lb;
		var_vaa_623_.Ib = var_vaa_622_.Ib;
	    }
	    for (int i_640_ = 0; i_640_ < bc; i_640_++) {
		var_vaa_623_.N[i_640_] = N[i_640_];
		var_vaa_623_.Ib[i_640_] = Ib[i_640_];
		var_vaa_623_.lb[i_640_] = lb[i_640_];
	    }
	} else {
	    var_vaa_623_.lb = lb;
	    var_vaa_623_.Ib = Ib;
	    var_vaa_623_.N = N;
	}
	if (i != 40)
	    return null;
	if (qg.a(0, p, i_624_)) {
	    var_vaa_623_.tc = var_vaa_622_.tc;
	    if (bool_625_)
		var_vaa_623_.eb |= 0x10;
	    ((eh) var_vaa_623_.tc).d = ((eh) tc).d;
	} else if (pv.a(35044, i_624_, p))
	    var_vaa_623_.tc = tc;
	else
	    var_vaa_623_.tc = null;
	if (!dr.a(i_624_, p, (byte) 126))
	    var_vaa_623_.wb = wb;
	else {
	    if (var_vaa_622_.wb != null && bc <= var_vaa_622_.wb.length)
		var_vaa_623_.wb = var_vaa_622_.wb;
	    else {
		int i_641_ = bc;
		var_vaa_623_.wb = var_vaa_622_.wb = new short[i_641_];
	    }
	    for (int i_642_ = 0; i_642_ < bc; i_642_++)
		var_vaa_623_.wb[i_642_] = wb[i_642_];
	}
	if (js.a(0, i_624_, p)) {
	    if (var_vaa_622_.B == null || E > var_vaa_622_.B.length) {
		int i_643_ = E;
		var_vaa_623_.B = var_vaa_622_.B = new rda[i_643_];
		for (int i_644_ = 0; i_644_ < E; i_644_++)
		    var_vaa_623_.B[i_644_] = B[i_644_].a(mv.a(i, (int) -22));
	    } else {
		var_vaa_623_.B = var_vaa_622_.B;
		for (int i_645_ = 0; i_645_ < E; i_645_++)
		    var_vaa_623_.B[i_645_].a((byte) 110, B[i_645_]);
	    }
	} else
	    var_vaa_623_.B = B;
	var_vaa_623_.Gb = Gb;
	if (!ac)
	    var_vaa_623_.ac = false;
	else {
	    var_vaa_623_.lc = lc;
	    var_vaa_623_.gc = gc;
	    var_vaa_623_.Y = Y;
	    var_vaa_623_.Zb = Zb;
	    var_vaa_623_.V = V;
	    var_vaa_623_.oc = oc;
	    var_vaa_623_.xc = xc;
	    var_vaa_623_.ac = true;
	    var_vaa_623_.w = w;
	}
	var_vaa_623_.rc = rc;
	var_vaa_623_.pb = pb;
	var_vaa_623_.v = v;
	var_vaa_623_.R = R;
	var_vaa_623_.sb = sb;
	var_vaa_623_.Cb = Cb;
	var_vaa_623_.X = X;
	var_vaa_623_.P = P;
	var_vaa_623_.F = F;
	var_vaa_623_.yb = yb;
	return var_vaa_623_;
    }
    
    final void a(Class_q class_q, pba var_pba, int i, int i_646_) {
	H++;
	if (mc != 0) {
	    Class_db class_db = ((qj) ib).Ne;
	    if (!ac)
		b((byte) -100);
	    Class_db class_db_647_ = (Class_db) class_q;
	    World.b = (((Class_db) class_db_647_).q * ((Class_db) class_db).j
		     + ((Class_db) class_db_647_).F * ((Class_db) class_db).v
		     + ((Class_db) class_db).L * ((Class_db) class_db_647_).j);
	    qt.J
		= (((Class_db) class_db_647_).p * ((Class_db) class_db).L
		   + (((Class_db) class_db).j * ((Class_db) class_db_647_).w
		      + ((Class_db) class_db_647_).J * ((Class_db) class_db).v)
		   + ((Class_db) class_db).p);
	    float f = World.b * (float) V + qt.J;
	    float f_648_ = (float) Y * World.b + qt.J;
	    float f_649_;
	    float f_650_;
	    if (!(f > f_648_)) {
		f_650_ = (float) Zb + f_648_;
		f_649_ = f - (float) Zb;
	    } else {
		f_649_ = (float) -Zb + f_648_;
		f_650_ = (float) Zb + f;
	    }
	    if (!(f_649_ >= ((qj) ib).Gg)
		&& !(f_650_ <= (float) ((qj) ib).Jf)) {
		mfa.k
		    = (((Class_db) class_db_647_).F * ((Class_db) class_db).A
		       + ((Class_db) class_db_647_).q * ((Class_db) class_db).F
		       + (((Class_db) class_db_647_).j
			  * ((Class_db) class_db).x));
		Class_fd.F = (((Class_db) class_db).J
			+ ((((Class_db) class_db_647_).p
			    * ((Class_db) class_db).x)
			   + ((((Class_db) class_db).A
			       * ((Class_db) class_db_647_).J)
			      + (((Class_db) class_db_647_).w
				 * ((Class_db) class_db).F))));
		float f_651_ = (float) V * mfa.k + Class_fd.F;
		float f_652_ = (float) Y * mfa.k + Class_fd.F;
		float f_653_;
		float f_654_;
		if (f_651_ > f_652_) {
		    f_654_ = ((float) Zb + f_651_) * (float) ((qj) ib).bg;
		    f_653_ = (float) ((qj) ib).bg * (f_652_ - (float) Zb);
		} else {
		    f_653_ = (float) ((qj) ib).bg * ((float) -Zb + f_651_);
		    f_654_ = ((float) Zb + f_652_) * (float) ((qj) ib).bg;
		}
		if (!(f_653_ / (float) i >= ((qj) ib).ng)
		    && !(((qj) ib).dh >= f_654_ / (float) i)) {
		    pm.C = ((((Class_db) class_db).q
			     * ((Class_db) class_db_647_).q)
			    + (((Class_db) class_db).r
			       * ((Class_db) class_db_647_).F)
			    + (((Class_db) class_db_647_).j
			       * ((Class_db) class_db).n));
		    pm.K = ((((Class_db) class_db_647_).w
			     * ((Class_db) class_db).q)
			    + (((Class_db) class_db).r
			       * ((Class_db) class_db_647_).J)
			    + (((Class_db) class_db_647_).p
			       * ((Class_db) class_db).n)
			    + ((Class_db) class_db).w);
		    float f_655_ = (float) V * pm.C + pm.K;
		    float f_656_ = pm.K + pm.C * (float) Y;
		    float f_657_;
		    float f_658_;
		    if (!(f_655_ > f_656_)) {
			f_658_ = (float) ((qj) ib).eg * (f_656_ + (float) Zb);
			f_657_ = (float) ((qj) ib).eg * ((float) -Zb + f_655_);
		    } else {
			f_657_ = (float) ((qj) ib).eg * (f_656_ - (float) Zb);
			f_658_ = ((float) Zb + f_655_) * (float) ((qj) ib).eg;
		    }
		    if (!(((qj) ib).Pf <= f_657_ / (float) i)
			&& !(f_658_ / (float) i <= ((qj) ib).lg)) {
			if (var_pba != null || F != null) {
			    lr.i = ((((Class_db) class_db_647_).x
				     * ((Class_db) class_db).A)
				    + (((Class_db) class_db).F
				       * ((Class_db) class_db_647_).n)
				    + (((Class_db) class_db).x
				       * ((Class_db) class_db_647_).L));
			    mq.c = ((((Class_db) class_db).r
				     * ((Class_db) class_db_647_).x)
				    + (((Class_db) class_db_647_).n
				       * ((Class_db) class_db).q)
				    + (((Class_db) class_db).n
				       * ((Class_db) class_db_647_).L));
			    cd.A = ((((Class_db) class_db_647_).r
				     * ((Class_db) class_db).q)
				    + (((Class_db) class_db_647_).A
				       * ((Class_db) class_db).r)
				    + (((Class_db) class_db_647_).v
				       * ((Class_db) class_db).n));
			    gca.m = ((((Class_db) class_db_647_).A
				      * ((Class_db) class_db).v)
				     + (((Class_db) class_db).j
					* ((Class_db) class_db_647_).r)
				     + (((Class_db) class_db_647_).v
					* ((Class_db) class_db).L));
			    mn.b = ((((Class_db) class_db).L
				     * ((Class_db) class_db_647_).L)
				    + ((((Class_db) class_db_647_).x
					* ((Class_db) class_db).v)
				       + (((Class_db) class_db_647_).n
					  * ((Class_db) class_db).j)));
			    bfa.w = ((((Class_db) class_db).x
				      * ((Class_db) class_db_647_).v)
				     + ((((Class_db) class_db).A
					 * ((Class_db) class_db_647_).A)
					+ (((Class_db) class_db_647_).r
					   * ((Class_db) class_db).F)));
			}
			if (var_pba != null) {
			    int i_659_ = oc + gc >> 1;
			    int i_660_ = lc + w >> 1;
			    int i_661_ = (int) ((float) i_660_ * lr.i
						+ (mfa.k * (float) V
						   + (bfa.w * (float) i_659_
						      + Class_fd.F)));
			    int i_662_ = (int) ((float) i_660_ * mq.c
						+ ((float) i_659_ * cd.A + pm.K
						   + pm.C * (float) V));
			    int i_663_
				= (int) (mn.b * (float) i_660_
					 + ((float) V * World.b
					    + (qt.J
					       + gca.m * (float) i_659_)));
			    int i_664_
				= (int) ((float) Y * mfa.k
					 + (bfa.w * (float) i_659_ + Class_fd.F)
					 + (float) i_660_ * lr.i);
			    int i_665_ = (int) (mq.c * (float) i_660_
						+ (pm.K + cd.A * (float) i_659_
						   + pm.C * (float) Y));
			    ((pba) var_pba).i
				= ((qj) ib).eg * i_665_ / i + ((qj) ib).ag;
			    ((pba) var_pba).g
				= i_662_ * ((qj) ib).eg / i + ((qj) ib).ag;
			    ((pba) var_pba).k
				= ((qj) ib).bg * i_661_ / i + ((qj) ib).kg;
			    int i_666_ = (int) (qt.J + gca.m * (float) i_659_
						+ (float) Y * World.b
						+ mn.b * (float) i_660_);
			    ((pba) var_pba).l
				= ((qj) ib).kg + i_664_ * ((qj) ib).bg / i;
			    if (((qj) ib).Jf <= i_663_
				|| i_666_ >= ((qj) ib).Jf) {
				((pba) var_pba).h = true;
				((pba) var_pba).j
				    = (((qj) ib).bg * (Zb + i_661_) / i
				       + ((qj) ib).kg - ((pba) var_pba).k);
			    }
			}
			ib.a((byte) 95, (float) i);
			ib.j(379);
			ib.b(class_db_647_, -123);
			b((int) 0);
			ib.r(0);
			a((byte) -82);
		    }
		}
	    }
	}
    }
    
    final int H() {
	if (!ac)
	    b((byte) -100);
	A++;
	return Y;
    }
    
    final void T(int i) {
	u = (short) i;
	if (db != null)
	    ((gv) db).c = null;
	wc++;
    }
    
    final ha S(ha var_ha) {
	fc++;
	if (mc == 0)
	    return null;
	if (!ac)
	    b((byte) -100);
	int i;
	int i_667_;
	if (((qj) ib).Eg > 0) {
	    i = gc - (Y * ((qj) ib).Eg >> 8) >> ((qj) ib).le;
	    i_667_ = oc - (((qj) ib).Eg * V >> 8) >> ((qj) ib).le;
	} else {
	    i = gc - (((qj) ib).Eg * V >> 8) >> ((qj) ib).le;
	    i_667_ = oc - (Y * ((qj) ib).Eg >> 8) >> ((qj) ib).le;
	}
	int i_668_;
	int i_669_;
	if (((qj) ib).Fg > 0) {
	    i_668_ = w - (((qj) ib).Fg * Y >> 8) >> ((qj) ib).le;
	    i_669_ = lc - (((qj) ib).Fg * V >> 8) >> ((qj) ib).le;
	} else {
	    i_668_ = w - (V * ((qj) ib).Fg >> 8) >> ((qj) ib).le;
	    i_669_ = lc - (((qj) ib).Fg * Y >> 8) >> ((qj) ib).le;
	}
	int i_670_ = i_667_ + (-i + 1);
	int i_671_ = i_669_ + 1 - i_668_;
	vg var_vg = (vg) var_ha;
	vg var_vg_672_;
	if (var_vg == null || !var_vg.b(i_671_, 87, i_670_))
	    var_vg_672_ = new vg(ib, i_670_, i_671_);
	else {
	    var_vg_672_ = var_vg;
	    var_vg_672_.i(-24051);
	}
	var_vg_672_.a(i, i_668_, i_669_, true, i_667_);
	a(var_vg_672_, false);
	return var_vg_672_;
    }
    
    vaa(qj var_qj) {
	ib = var_qj;
	K = new gv(null, 5126, 3, 0);
	vb = new gv(null, 5126, 2, 0);
	Fb = new gv(null, 5126, 3, 0);
	db = new gv(null, 5121, 4, 0);
	tc = new eh();
    }
    
    vaa(qj var_qj, eg var_eg, int i, int i_673_, int i_674_, int i_675_) {
	ib = var_qj;
	ob = i;
	p = i_675_;
	if (fn.a(-44, i, i_675_))
	    K = new gv(null, 5126, 3, 0);
	if (cf.a(i_675_, (byte) -127, i))
	    vb = new gv(null, 5126, 2, 0);
	if (tj.a(i_675_, 55, i))
	    Fb = new gv(null, 5126, 3, 0);
	if (uca.a(2048, i_675_, i))
	    db = new gv(null, 5121, 4, 0);
	if (pv.a(35044, i, i_675_))
	    tc = new eh();
	fa var_fa = ((Class_r) var_qj).j;
	rc = new int[((eg) var_eg).l + 1];
	int[] is = new int[((eg) var_eg).G];
	for (int i_676_ = 0; ((eg) var_eg).G > i_676_; i_676_++) {
	    if ((((eg) var_eg).U == null || ((eg) var_eg).U[i_676_] != 2)
		&& (((eg) var_eg).B == null || ((eg) var_eg).B[i_676_] == -1
		    || !((vca) var_fa.a(((eg) var_eg).B[i_676_] & 0xffff,
					(byte) 86)).x)) {
		is[bc++] = i_676_;
		rc[((eg) var_eg).O[i_676_]]++;
		rc[((eg) var_eg).v[i_676_]]++;
		rc[((eg) var_eg).a[i_676_]]++;
	    }
	}
	vc = bc;
	long[] ls = new long[bc];
	boolean bool = (0x100 & ob) != 0;
    while_230_:
	for (int i_677_ = 0; bc > i_677_; i_677_++) {
	    int i_678_ = is[i_677_];
	    vca var_vca = null;
	    int i_679_ = 0;
	    int i_680_ = 0;
	    int i_681_ = 0;
	    int i_682_ = 0;
	    if (((eg) var_eg).N != null) {
		for (int i_683_ = 0; ((eg) var_eg).N.length > i_683_;
		     i_683_++) {
		    lw var_lw = ((eg) var_eg).N[i_683_];
		    if (((lw) var_lw).c == i_678_) {
			cj var_cj = kg.a(((lw) var_lw).g, -119);
			if (((cj) var_cj).d) {
			    ls[i_677_] = 9223372036854775807L;
			    vc--;
			    continue while_230_;
			}
		    }
		}
	    }
	    int i_684_ = -1;
	    if (((eg) var_eg).B != null) {
		i_684_ = ((eg) var_eg).B[i_678_];
		if (i_684_ != -1) {
		    var_vca = var_fa.a(i_684_ & 0xffff, (byte) 86);
		    i_681_ = ((vca) var_vca).i;
		    i_682_ = ((vca) var_vca).w;
		}
	    }
	    boolean bool_685_
		= (((eg) var_eg).m != null && ((eg) var_eg).m[i_678_] != 0
		   || (var_vca != null
		       && ((vca) var_vca).s | !((vca) var_vca).e));
	    if ((bool || bool_685_) && ((eg) var_eg).w != null)
		i_679_ += ((eg) var_eg).w[i_678_] << 17;
	    if (bool_685_)
		i_679_ += 65536;
	    i_679_ += (0xff & i_681_) << 8;
	    i_680_ += i_684_ << 16 & ~0xffff;
	    i_679_ += 0xff & i_682_;
	    i_680_ += 0xffff & i_677_;
	    ls[i_677_] = ((long) i_679_ << 32) + (long) i_680_;
	    yc |= bool_685_;
	}
	qk.a((byte) -72, ls, is);
	Xb = ((eg) var_eg).W;
	W = ((eg) var_eg).z;
	qc = ((eg) var_eg).l;
	R = ((eg) var_eg).f;
	nc = ((eg) var_eg).o;
	Ab = ((eg) var_eg).R;
	kh[] var_khs = new kh[qc];
	pb = ((eg) var_eg).q;
	Cb = ((eg) var_eg).i;
	if (((eg) var_eg).N != null) {
	    E = ((eg) var_eg).N.length;
	    B = new rda[E];
	    F = new ik[E];
	    for (int i_686_ = 0; E > i_686_; i_686_++) {
		lw var_lw = ((eg) var_eg).N[i_686_];
		cj var_cj = kg.a(((lw) var_lw).g, -124);
		int i_687_ = -1;
		for (int i_688_ = 0; bc > i_688_; i_688_++) {
		    if (is[i_688_] == ((lw) var_lw).c) {
			i_687_ = i_688_;
			break;
		    }
		}
		if ((i_687_ ^ 0xffffffff) == 0)
		    throw new RuntimeException();
		int i_689_
		    = (0xffffff
		       & ji.j[0xffff & ((eg) var_eg).Z[((lw) var_lw).c]]);
		i_689_ = i_689_ | (-(((eg) var_eg).m == null ? (int) 0
				     : ((eg) var_eg).m[((lw) var_lw).c]) + 255
				   << 24);
		F[i_686_]
		    = new ik(i_687_, ((eg) var_eg).O[((lw) var_lw).c],
			     ((eg) var_eg).v[((lw) var_lw).c],
			     ((eg) var_eg).a[((lw) var_lw).c], ((cj) var_cj).g,
			     ((cj) var_cj).var_n, ((cj) var_cj).i, ((cj) var_cj).f,
			     ((cj) var_cj).m, ((cj) var_cj).d, ((cj) var_cj).b,
			     ((lw) var_lw).a);
		B[i_686_] = new rda(i_689_);
	    }
	}
	int i_690_ = 3 * bc;
	Hb = new short[i_690_];
	zb = new float[i_690_];
	uc = new float[i_690_];
	kb = new byte[i_690_];
	Login.a = new long[i_690_];
	v = new short[i_690_];
	u = (short) i_673_;
	Ib = new short[bc];
	if (((eg) var_eg).C != null)
	    P = new short[bc];
	ub = (short) i_674_;
	G = new byte[bc];
	cb = new short[i_690_];
	N = new short[bc];
	Wb = new short[i_690_];
	lb = new short[bc];
	wb = new short[bc];
	Z = new short[bc];
	int i_691_ = 0;
	for (int i_692_ = 0; ((eg) var_eg).l > i_692_; i_692_++) {
	    int i_693_ = rc[i_692_];
	    rc[i_692_] = i_691_;
	    i_691_ += i_693_;
	    var_khs[i_692_] = new kh();
	}
	rc[((eg) var_eg).l] = i_691_;
	int[] is_694_ = null;
	int[] is_695_ = null;
	int[] is_696_ = null;
	float[][] fs = null;
	if (((eg) var_eg).e != null) {
	    int i_697_ = ((eg) var_eg).L;
	    int[] is_698_ = new int[i_697_];
	    int[] is_699_ = new int[i_697_];
	    int[] is_700_ = new int[i_697_];
	    int[] is_701_ = new int[i_697_];
	    int[] is_702_ = new int[i_697_];
	    int[] is_703_ = new int[i_697_];
	    for (int i_704_ = 0; i_697_ > i_704_; i_704_++) {
		is_698_[i_704_] = 2147483647;
		is_699_[i_704_] = -2147483647;
		is_700_[i_704_] = 2147483647;
		is_701_[i_704_] = -2147483647;
		is_702_[i_704_] = 2147483647;
		is_703_[i_704_] = -2147483647;
	    }
	    is_694_ = new int[i_697_];
	    is_696_ = new int[i_697_];
	    fs = new float[i_697_][];
	    is_695_ = new int[i_697_];
	    for (int i_705_ = 0; i_705_ < bc; i_705_++) {
		int i_706_ = is[i_705_];
		if ((((eg) var_eg).e[i_706_] ^ 0xffffffff) != 0) {
		    int i_707_ = 0xff & ((eg) var_eg).e[i_706_];
		    for (int i_708_ = 0; i_708_ < 3; i_708_++) {
			short i_709_;
			if (i_708_ == 0)
			    i_709_ = ((eg) var_eg).O[i_706_];
			else if (i_708_ != 1)
			    i_709_ = ((eg) var_eg).a[i_706_];
			else
			    i_709_ = ((eg) var_eg).v[i_706_];
			int i_710_ = ((eg) var_eg).o[i_709_];
			int i_711_ = ((eg) var_eg).W[i_709_];
			int i_712_ = ((eg) var_eg).R[i_709_];
			if (i_710_ < is_698_[i_707_])
			    is_698_[i_707_] = i_710_;
			if (i_710_ > is_699_[i_707_])
			    is_699_[i_707_] = i_710_;
			if (i_711_ < is_700_[i_707_])
			    is_700_[i_707_] = i_711_;
			if (is_701_[i_707_] < i_711_)
			    is_701_[i_707_] = i_711_;
			if (i_712_ < is_702_[i_707_])
			    is_702_[i_707_] = i_712_;
			if (is_703_[i_707_] < i_712_)
			    is_703_[i_707_] = i_712_;
		    }
		}
	    }
	    for (int i_713_ = 0; i_713_ < i_697_; i_713_++) {
		byte i_714_ = ((eg) var_eg).F[i_713_];
		if (i_714_ > 0) {
		    is_694_[i_713_] = (is_699_[i_713_] + is_698_[i_713_]) / 2;
		    is_695_[i_713_] = (is_701_[i_713_] + is_700_[i_713_]) / 2;
		    is_696_[i_713_] = (is_703_[i_713_] + is_702_[i_713_]) / 2;
		    float f;
		    float f_715_;
		    float f_716_;
		    if (i_714_ == 1) {
			int i_717_ = ((eg) var_eg).S[i_713_];
			if (i_717_ == 0) {
			    f_715_ = 1.0F;
			    f_716_ = 1.0F;
			} else if (i_717_ > 0) {
			    f_716_ = (float) i_717_ / 1024.0F;
			    f_715_ = 1.0F;
			} else {
			    f_715_ = (float) -i_717_ / 1024.0F;
			    f_716_ = 1.0F;
			}
			f = 64.0F / (float) ((eg) var_eg).j[i_713_];
		    } else if (i_714_ == 2) {
			f = 64.0F / (float) ((eg) var_eg).j[i_713_];
			f_715_ = 64.0F / (float) ((eg) var_eg).S[i_713_];
			f_716_ = 64.0F / (float) ((eg) var_eg).D[i_713_];
		    } else {
			f_716_ = (float) ((eg) var_eg).D[i_713_] / 1024.0F;
			f_715_ = (float) ((eg) var_eg).S[i_713_] / 1024.0F;
			f = (float) ((eg) var_eg).j[i_713_] / 1024.0F;
		    }
		    fs[i_713_] = oba.a(f_716_, ((eg) var_eg).h[i_713_],
				       ((eg) var_eg).x[i_713_], f_715_,
				       (byte) -72, ((eg) var_eg).p[i_713_], f,
				       uca.a(((eg) var_eg).Y[i_713_], 255));
		}
	    }
	}
	tf[] var_tfs = new tf[((eg) var_eg).G];
	for (int i_718_ = 0; i_718_ < ((eg) var_eg).G; i_718_++) {
	    short i_719_ = ((eg) var_eg).O[i_718_];
	    short i_720_ = ((eg) var_eg).v[i_718_];
	    short i_721_ = ((eg) var_eg).a[i_718_];
	    int i_722_ = nc[i_720_] - nc[i_719_];
	    int i_723_ = Xb[i_720_] - Xb[i_719_];
	    int i_724_ = Ab[i_720_] - Ab[i_719_];
	    int i_725_ = nc[i_721_] - nc[i_719_];
	    int i_726_ = Xb[i_721_] - Xb[i_719_];
	    int i_727_ = Ab[i_721_] - Ab[i_719_];
	    int i_728_ = i_723_ * i_727_ - i_724_ * i_726_;
	    int i_729_ = i_724_ * i_725_ - i_722_ * i_727_;
	    int i_730_;
	    for (i_730_ = i_726_ * i_722_ - i_723_ * i_725_;
		 (i_728_ > 8192 || i_729_ > 8192 || i_730_ > 8192
		  || i_728_ < -8192 || i_729_ < -8192 || i_730_ < -8192);
		 i_729_ >>= 1) {
		i_730_ >>= 1;
		i_728_ >>= 1;
	    }
	    int i_731_
		= (int) Math.sqrt((double) (i_730_ * i_730_ + i_729_ * i_729_
					    + i_728_ * i_728_));
	    if (i_731_ <= 0)
		i_731_ = 1;
	    i_728_ = 256 * i_728_ / i_731_;
	    i_730_ = 256 * i_730_ / i_731_;
	    i_729_ = i_729_ * 256 / i_731_;
	    byte i_732_
		= ((eg) var_eg).U != null ? ((eg) var_eg).U[i_718_] : (byte) 0;
	    if (i_732_ == 0) {
		kh var_kh = var_khs[i_719_];
		((kh) var_kh).b += i_728_;
		((kh) var_kh).a += i_730_;
		((kh) var_kh).c += i_729_;
		((kh) var_kh).d++;
		var_kh = var_khs[i_720_];
		((kh) var_kh).c += i_729_;
		((kh) var_kh).d++;
		((kh) var_kh).a += i_730_;
		((kh) var_kh).b += i_728_;
		var_kh = var_khs[i_721_];
		((kh) var_kh).a += i_730_;
		((kh) var_kh).d++;
		((kh) var_kh).c += i_729_;
		((kh) var_kh).b += i_728_;
	    } else if (i_732_ == 1) {
		tf var_tf = var_tfs[i_718_] = new tf();
		((tf) var_tf).d = i_729_;
		((tf) var_tf).c = i_728_;
		((tf) var_tf).a = i_730_;
	    }
	}
	for (int i_733_ = 0; i_733_ < bc; i_733_++) {
	    int i_734_ = is[i_733_];
	    int i_735_ = 0xffff & ((eg) var_eg).Z[i_734_];
	    short i_736_;
	    if (((eg) var_eg).B == null)
		i_736_ = (short) -1;
	    else
		i_736_ = ((eg) var_eg).B[i_734_];
	    int i_737_;
	    if (((eg) var_eg).e == null)
		i_737_ = -1;
	    else
		i_737_ = ((eg) var_eg).e[i_734_];
	    int i_738_;
	    if (((eg) var_eg).m != null)
		i_738_ = ((eg) var_eg).m[i_734_] & 0xff;
	    else
		i_738_ = 0;
	    float f = 0.0F;
	    float f_739_ = 0.0F;
	    float f_740_ = 0.0F;
	    float f_741_ = 0.0F;
	    float f_742_ = 0.0F;
	    float f_743_ = 0.0F;
	    int i_744_ = 0;
	    int i_745_ = 0;
	    int i_746_ = 0;
	    if ((i_736_ ^ 0xffffffff) != 0) {
		if (i_737_ != -1) {
		    i_737_ &= 0xff;
		    byte i_747_ = ((eg) var_eg).F[i_737_];
		    if (i_747_ != 0) {
			short i_748_ = ((eg) var_eg).O[i_734_];
			short i_749_ = ((eg) var_eg).v[i_734_];
			short i_750_ = ((eg) var_eg).a[i_734_];
			int i_751_ = is_694_[i_737_];
			int i_752_ = is_695_[i_737_];
			int i_753_ = is_696_[i_737_];
			float[] fs_754_ = fs[i_737_];
			byte i_755_ = ((eg) var_eg).y[i_737_];
			float f_756_
			    = (float) ((eg) var_eg).V[i_737_] / 256.0F;
			if (i_747_ == 1) {
			    float f_757_
				= (float) ((eg) var_eg).D[i_737_] / 1024.0F;
			    ol.a(f_756_, i_752_, i_755_,
				 ((eg) var_eg).R[i_748_], i_751_, i_753_,
				 f_757_, 8, fs_754_, ((eg) var_eg).o[i_748_],
				 ((eg) var_eg).W[i_748_]);
			    f_739_ = Animable.u;
			    f = mca.y;
			    ol.a(f_756_, i_752_, i_755_,
				 ((eg) var_eg).R[i_749_], i_751_, i_753_,
				 f_757_, 8, fs_754_, ((eg) var_eg).o[i_749_],
				 ((eg) var_eg).W[i_749_]);
			    f_741_ = Animable.u;
			    f_740_ = mca.y;
			    ol.a(f_756_, i_752_, i_755_,
				 ((eg) var_eg).R[i_750_], i_751_, i_753_,
				 f_757_, 8, fs_754_, ((eg) var_eg).o[i_750_],
				 ((eg) var_eg).W[i_750_]);
			    f_743_ = Animable.u;
			    f_742_ = mca.y;
			    float f_758_ = f_757_ / 2.0F;
			    if ((i_755_ & 0x1) != 0) {
				if (f_758_ < f_743_ - f_739_) {
				    f_743_ -= f_757_;
				    i_745_ = 1;
				} else if (f_758_ < f_739_ - f_743_) {
				    f_743_ += f_757_;
				    i_745_ = 2;
				}
				if (!(f_758_ < f_741_ - f_739_)) {
				    if (f_758_ < f_739_ - f_741_) {
					i_744_ = 2;
					f_741_ += f_757_;
				    }
				} else {
				    i_744_ = 1;
				    f_741_ -= f_757_;
				}
			    } else {
				if (!(f_742_ - f > f_758_)) {
				    if (f - f_742_ > f_758_) {
					f_742_ += f_757_;
					i_745_ = 2;
				    }
				} else {
				    f_742_ -= f_757_;
				    i_745_ = 1;
				}
				if (f_740_ - f > f_758_) {
				    i_744_ = 1;
				    f_740_ -= f_757_;
				} else if (f_758_ < f - f_740_) {
				    f_740_ += f_757_;
				    i_744_ = 2;
				}
			    }
			} else if (i_747_ == 2) {
			    float f_759_
				= (float) ((eg) var_eg).k[i_737_] / 256.0F;
			    float f_760_
				= (float) ((eg) var_eg).d[i_737_] / 256.0F;
			    int i_761_ = (((eg) var_eg).o[i_749_]
					  - ((eg) var_eg).o[i_748_]);
			    int i_762_ = (((eg) var_eg).W[i_749_]
					  - ((eg) var_eg).W[i_748_]);
			    int i_763_ = (((eg) var_eg).R[i_749_]
					  - ((eg) var_eg).R[i_748_]);
			    int i_764_ = (((eg) var_eg).o[i_750_]
					  - ((eg) var_eg).o[i_748_]);
			    int i_765_ = (((eg) var_eg).W[i_750_]
					  - ((eg) var_eg).W[i_748_]);
			    int i_766_ = (((eg) var_eg).R[i_750_]
					  - ((eg) var_eg).R[i_748_]);
			    int i_767_ = i_762_ * i_766_ - i_765_ * i_763_;
			    int i_768_ = i_763_ * i_764_ - i_766_ * i_761_;
			    int i_769_ = i_765_ * i_761_ - i_762_ * i_764_;
			    float f_770_
				= 64.0F / (float) ((eg) var_eg).S[i_737_];
			    float f_771_
				= 64.0F / (float) ((eg) var_eg).j[i_737_];
			    float f_772_
				= 64.0F / (float) ((eg) var_eg).D[i_737_];
			    float f_773_ = (((float) i_769_ * fs_754_[2]
					     + (fs_754_[1] * (float) i_768_
						+ (float) i_767_ * fs_754_[0]))
					    / f_770_);
			    float f_774_ = ((fs_754_[3] * (float) i_767_
					     + fs_754_[4] * (float) i_768_
					     + fs_754_[5] * (float) i_769_)
					    / f_771_);
			    float f_775_ = ((fs_754_[6] * (float) i_767_
					     + fs_754_[7] * (float) i_768_
					     + (float) i_769_ * fs_754_[8])
					    / f_772_);
			    i_746_ = fg.a(f_773_, f_774_, (byte) 126, f_775_);
			    rm.a(i_746_, i_753_, ((eg) var_eg).R[i_748_],
				 i_755_, f_760_, ((eg) var_eg).o[i_748_], -127,
				 ((eg) var_eg).W[i_748_], f_759_, i_751_,
				 f_756_, i_752_, fs_754_);
			    f = dda.j;
			    f_739_ = na.f;
			    rm.a(i_746_, i_753_, ((eg) var_eg).R[i_749_],
				 i_755_, f_760_, ((eg) var_eg).o[i_749_], -59,
				 ((eg) var_eg).W[i_749_], f_759_, i_751_,
				 f_756_, i_752_, fs_754_);
			    f_741_ = na.f;
			    f_740_ = dda.j;
			    rm.a(i_746_, i_753_, ((eg) var_eg).R[i_750_],
				 i_755_, f_760_, ((eg) var_eg).o[i_750_], 97,
				 ((eg) var_eg).W[i_750_], f_759_, i_751_,
				 f_756_, i_752_, fs_754_);
			    f_742_ = dda.j;
			    f_743_ = na.f;
			} else if (i_747_ == 3) {
			    gk.a(fs_754_, i_751_, ((eg) var_eg).R[i_748_],
				 ((eg) var_eg).o[i_748_], i_755_, f_756_,
				 i_753_, -113, ((eg) var_eg).W[i_748_],
				 i_752_);
			    f = wr.x;
			    f_739_ = Class_fb.c;
			    gk.a(fs_754_, i_751_, ((eg) var_eg).R[i_749_],
				 ((eg) var_eg).o[i_749_], i_755_, f_756_,
				 i_753_, -118, ((eg) var_eg).W[i_749_],
				 i_752_);
			    f_740_ = wr.x;
			    f_741_ = Class_fb.c;
			    gk.a(fs_754_, i_751_, ((eg) var_eg).R[i_750_],
				 ((eg) var_eg).o[i_750_], i_755_, f_756_,
				 i_753_, -34, ((eg) var_eg).W[i_750_], i_752_);
			    f_742_ = wr.x;
			    f_743_ = Class_fb.c;
			    if ((i_755_ & 0x1) != 0) {
				if (f_743_ - f_739_ > 0.5F) {
				    f_743_--;
				    i_745_ = 1;
				} else if (f_739_ - f_743_ > 0.5F) {
				    f_743_++;
				    i_745_ = 2;
				}
				if (!(f_741_ - f_739_ > 0.5F)) {
				    if (f_739_ - f_741_ > 0.5F) {
					i_744_ = 2;
					f_741_++;
				    }
				} else {
				    f_741_--;
				    i_744_ = 1;
				}
			    } else {
				if (!(f_742_ - f > 0.5F)) {
				    if (f - f_742_ > 0.5F) {
					f_742_++;
					i_745_ = 2;
				    }
				} else {
				    i_745_ = 1;
				    f_742_--;
				}
				if (!(f_740_ - f > 0.5F)) {
				    if (f - f_740_ > 0.5F) {
					f_740_++;
					i_744_ = 2;
				    }
				} else {
				    f_740_--;
				    i_744_ = 1;
				}
			    }
			}
		    } else {
			short i_776_ = ((eg) var_eg).O[i_734_];
			short i_777_ = ((eg) var_eg).v[i_734_];
			short i_778_ = ((eg) var_eg).a[i_734_];
			short i_779_ = ((eg) var_eg).p[i_737_];
			short i_780_ = ((eg) var_eg).h[i_737_];
			short i_781_ = ((eg) var_eg).x[i_737_];
			float f_782_ = (float) ((eg) var_eg).o[i_779_];
			float f_783_ = (float) ((eg) var_eg).W[i_779_];
			float f_784_ = (float) ((eg) var_eg).R[i_779_];
			float f_785_
			    = (float) ((eg) var_eg).o[i_780_] - f_782_;
			float f_786_
			    = (float) ((eg) var_eg).W[i_780_] - f_783_;
			float f_787_
			    = (float) ((eg) var_eg).R[i_780_] - f_784_;
			float f_788_
			    = (float) ((eg) var_eg).o[i_781_] - f_782_;
			float f_789_
			    = (float) ((eg) var_eg).W[i_781_] - f_783_;
			float f_790_
			    = (float) ((eg) var_eg).R[i_781_] - f_784_;
			float f_791_
			    = (float) ((eg) var_eg).o[i_776_] - f_782_;
			float f_792_
			    = (float) ((eg) var_eg).W[i_776_] - f_783_;
			float f_793_
			    = (float) ((eg) var_eg).R[i_776_] - f_784_;
			float f_794_
			    = (float) ((eg) var_eg).o[i_777_] - f_782_;
			float f_795_
			    = (float) ((eg) var_eg).W[i_777_] - f_783_;
			float f_796_
			    = (float) ((eg) var_eg).R[i_777_] - f_784_;
			float f_797_
			    = (float) ((eg) var_eg).o[i_778_] - f_782_;
			float f_798_
			    = (float) ((eg) var_eg).W[i_778_] - f_783_;
			float f_799_
			    = (float) ((eg) var_eg).R[i_778_] - f_784_;
			float f_800_ = f_790_ * f_786_ - f_789_ * f_787_;
			float f_801_ = f_787_ * f_788_ - f_785_ * f_790_;
			float f_802_ = f_785_ * f_789_ - f_786_ * f_788_;
			float f_803_ = f_802_ * f_789_ - f_801_ * f_790_;
			float f_804_ = f_790_ * f_800_ - f_788_ * f_802_;
			float f_805_ = f_801_ * f_788_ - f_800_ * f_789_;
			float f_806_
			    = 1.0F / (f_804_ * f_786_ + f_785_ * f_803_
				      + f_805_ * f_787_);
			f_740_ = f_806_ * (f_803_ * f_794_ + f_795_ * f_804_
					   + f_796_ * f_805_);
			f_742_
			    = (f_799_ * f_805_
			       + (f_797_ * f_803_ + f_798_ * f_804_)) * f_806_;
			f = (f_803_ * f_791_ + f_792_ * f_804_
			     + f_805_ * f_793_) * f_806_;
			f_805_ = f_785_ * f_801_ - f_800_ * f_786_;
			f_803_ = f_786_ * f_802_ - f_787_ * f_801_;
			f_804_ = f_800_ * f_787_ - f_785_ * f_802_;
			f_806_
			    = 1.0F / (f_805_ * f_790_
				      + (f_788_ * f_803_ + f_804_ * f_789_));
			f_743_ = f_806_ * (f_797_ * f_803_ + f_804_ * f_798_
					   + f_799_ * f_805_);
			f_739_
			    = (f_793_ * f_805_
			       + (f_792_ * f_804_ + f_791_ * f_803_)) * f_806_;
			f_741_
			    = f_806_ * (f_805_ * f_796_
					+ (f_794_ * f_803_ + f_795_ * f_804_));
		    }
		} else {
		    i_745_ = 2;
		    f_741_ = 1.0F;
		    f_742_ = 0.0F;
		    f = 0.0F;
		    i_744_ = 1;
		    f_743_ = 0.0F;
		    f_739_ = 1.0F;
		    f_740_ = 1.0F;
		}
	    }
	    byte i_807_;
	    if (((eg) var_eg).U == null)
		i_807_ = (byte) 0;
	    else
		i_807_ = ((eg) var_eg).U[i_734_];
	    if (i_807_ != 0) {
		if (i_807_ == 1) {
		    tf var_tf = var_tfs[i_734_];
		    long l
			= ((long) ((((tf) var_tf).c <= 0 ? 2048 : i_737_ << 2)
				   + 1024
				   + ((((tf) var_tf).d + 256 << 12)
				      + (((tf) var_tf).a + 256 << 22)))
			   + (((long) i_738_ + (long) (i_735_ << 8)
			       + (long) (i_746_ << 24))
			      << 32));
		    N[i_733_] = a(((tf) var_tf).d, 0, ((tf) var_tf).a, f,
				  26375, l, f_739_, ((tf) var_tf).c, var_eg,
				  ((eg) var_eg).O[i_734_]);
		    Ib[i_733_]
			= a(((tf) var_tf).d, 0, ((tf) var_tf).a, f_740_, 26375,
			    (long) i_744_ + l, f_741_, ((tf) var_tf).c, var_eg,
			    ((eg) var_eg).v[i_734_]);
		    lb[i_733_]
			= a(((tf) var_tf).d, 0, ((tf) var_tf).a, f_742_, 26375,
			    l + (long) i_745_, f_743_, ((tf) var_tf).c, var_eg,
			    ((eg) var_eg).a[i_734_]);
		}
	    } else {
		long l = (((long) (i_735_ << 8) + ((long) (i_746_ << 24)
						   + (long) i_738_)
			   << 32)
			  + (long) (i_737_ << 2));
		short i_808_ = ((eg) var_eg).O[i_734_];
		short i_809_ = ((eg) var_eg).v[i_734_];
		short i_810_ = ((eg) var_eg).a[i_734_];
		kh var_kh = var_khs[i_808_];
		N[i_733_]
		    = a(((kh) var_kh).c, ((kh) var_kh).d, ((kh) var_kh).a, f,
			26375, l, f_739_, ((kh) var_kh).b, var_eg, i_808_);
		var_kh = var_khs[i_809_];
		Ib[i_733_]
		    = a(((kh) var_kh).c, ((kh) var_kh).d, ((kh) var_kh).a,
			f_740_, 26375, l + (long) i_744_, f_741_,
			((kh) var_kh).b, var_eg, i_809_);
		var_kh = var_khs[i_810_];
		lb[i_733_]
		    = a(((kh) var_kh).c, ((kh) var_kh).d, ((kh) var_kh).a,
			f_742_, 26375, (long) i_745_ + l, f_743_,
			((kh) var_kh).b, var_eg, i_810_);
	    }
	    if (((eg) var_eg).B == null)
		wb[i_733_] = (short) -1;
	    else
		wb[i_733_] = ((eg) var_eg).B[i_734_];
	    if (((eg) var_eg).m != null)
		G[i_733_] = ((eg) var_eg).m[i_734_];
	    if (((eg) var_eg).C != null)
		P[i_733_] = ((eg) var_eg).C[i_734_];
	    Z[i_733_] = ((eg) var_eg).Z[i_734_];
	}
	int i_811_ = 0;
	short i_812_ = -10000;
	for (int i_813_ = 0; i_813_ < vc; i_813_++) {
	    short i_814_ = wb[i_813_];
	    if (i_814_ != i_812_) {
		i_811_++;
		i_812_ = i_814_;
	    }
	}
	X = new int[i_811_ + 1];
	i_812_ = (short) -10000;
	i_811_ = 0;
	for (int i_815_ = 0; i_815_ < vc; i_815_++) {
	    short i_816_ = wb[i_815_];
	    if (i_816_ != i_812_) {
		X[i_811_++] = i_815_;
		i_812_ = i_816_;
	    }
	}
	X[i_811_] = vc;
	Login.a = null;
	Wb = Class_mc.a(-28, mc, Wb);
	Hb = Class_mc.a(-121, mc, Hb);
	cb = Class_mc.a(98, mc, cb);
	kb = cv.a(kb, mc, 27995);
	zb = gfa.a(0, zb, mc);
	uc = gfa.a(0, uc, mc);
	if (((eg) var_eg).Q != null && Class_lc.b(i, 32, p))
	    sb = var_eg.a(false, -75);
	if (((eg) var_eg).N != null && fi.a(512, p, i))
	    Gb = var_eg.b((int) 85);
	if (((eg) var_eg).s != null && Class_rb.b(p, (byte) 83, i)) {
	    int i_817_ = 0;
	    int[] is_818_ = new int[256];
	    for (int i_819_ = 0; bc > i_819_; i_819_++) {
		int i_820_ = ((eg) var_eg).s[is[i_819_]];
		if (i_820_ >= 0) {
		    if (i_820_ > i_817_)
			i_817_ = i_820_;
		    is_818_[i_820_]++;
		}
	    }
	    yb = new int[i_817_ + 1][];
	    for (int i_821_ = 0; i_817_ >= i_821_; i_821_++) {
		yb[i_821_] = new int[is_818_[i_821_]];
		is_818_[i_821_] = 0;
	    }
	    for (int i_822_ = 0; bc > i_822_; i_822_++) {
		int i_823_ = ((eg) var_eg).s[is[i_822_]];
		if (i_823_ >= 0)
		    yb[i_823_][is_818_[i_823_]++] = i_822_;
	    }
	}
    }
    
    static {
	rb = new float[][] { { -0.333333F, -0.333333F, -0.333333F },
			     { 0.333333F, -0.333333F, -0.333333F },
			     { -0.333333F, 0.333333F, -0.333333F },
			     { 0.333333F, 0.333333F, -0.333333F },
			     { -0.333333F, -0.333333F, 0.333333F },
			     { 0.333333F, -0.333333F, 0.333333F },
			     { -0.333333F, 0.333333F, 0.333333F },
			     { 0.333333F, 0.333333F, 0.333333F } };
    }
}
