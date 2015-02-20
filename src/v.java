/* v - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class v extends da implements p
{
    private m p;
    long nativeid;
    qg[] q;
    private l r;
    hi[] s;
    
    private final native void X(l class_l);
    
    private final native void QA
	(l class_l, m var_m, int i, int i_0_, int[] is, int[] is_1_,
	 int[] is_2_, int[] is_3_, short[] is_4_, int i_5_, short[] is_6_,
	 short[] is_7_, short[] is_8_, byte[] is_9_, byte[] is_10_,
	 byte[] is_11_, byte[] is_12_, short[] is_13_, short[] is_14_,
	 int[] is_15_, byte i_16_, short[] is_17_, int i_18_, byte[] is_19_,
	 short[] is_20_, short[] is_21_, short[] is_22_, int[] is_23_,
	 int[] is_24_, int[] is_25_, byte[] is_26_, byte[] is_27_,
	 int[] is_28_, int[] is_29_, int[] is_30_, int[] is_31_, int i_32_,
	 int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int[] is_38_);
    
    final native boolean LA();
    
    final da a(byte i, int i_39_, boolean bool) {
	return r.D().a(this, i, i_39_, bool);
    }
    
    final void a(Class_q class_q, pba var_pba, int i) {
	if (var_pba == null)
	    r.D().LA(this, class_q, null, i);
	else {
	    l.t[5] = 0;
	    r.D().LA(this, class_q, l.t, i);
	    ((pba) var_pba).k = l.t[0];
	    ((pba) var_pba).g = l.t[1];
	    ((pba) var_pba).l = l.t[2];
	    ((pba) var_pba).i = l.t[3];
	    ((pba) var_pba).j = l.t[4];
	    ((pba) var_pba).h = l.t[5] != 0;
	}
    }
    
    final native void d(short i, short i_40_);
    
    final void a(da var_da, int i, int i_41_, int i_42_, boolean bool) {
	r.D().i(this, var_da, i, i_41_, i_42_, bool);
    }
    
    final native int na();
    
    final boolean a(int i, int i_43_, Class_q class_q, boolean bool) {
	return r.D().XA(this, i, i_43_, class_q, bool);
    }
    
    final qg[] f() {
	return ((v) this).q;
    }
    
    final void a(Class_q class_q) {
	a(l.s, class_q);
	int i = 0;
	if (((v) this).s != null) {
	    for (int i_44_ = 0; i_44_ < ((v) this).s.length; i_44_++) {
		hi var_hi = ((v) this).s[i_44_];
		((hi) var_hi).j = l.s[i++];
		((hi) var_hi).a = l.s[i++];
		((hi) var_hi).l = l.s[i++];
		((hi) var_hi).b = l.s[i++];
		((hi) var_hi).c = l.s[i++];
		((hi) var_hi).m = l.s[i++];
		((hi) var_hi).t = l.s[i++];
		((hi) var_hi).o = l.s[i++];
		((hi) var_hi).n = l.s[i++];
	    }
	}
	if (((v) this).q != null) {
	    for (int i_45_ = 0; i_45_ < ((v) this).q.length; i_45_++) {
		qg var_qg = ((v) this).q[i_45_];
		qg var_qg_46_ = var_qg;
		if (((qg) var_qg).n != null)
		    var_qg_46_ = ((qg) var_qg).n;
		if (((qg) var_qg).p != null)
		    ((qg) var_qg).p.M(class_q);
		else
		    ((qg) var_qg).p = class_q.a();
		((qg) var_qg_46_).m = l.s[i++];
		((qg) var_qg_46_).f = l.s[i++];
		((qg) var_qg_46_).l = l.s[i++];
	    }
	}
    }
    
    final native void B(int i, int[] is, int i_47_, int i_48_, int i_49_,
			boolean bool, int i_50_, int[] is_51_);
    
    final native void fa(int i);
    
    final native int K();
    
    final native void MA(int i);
    
    final native int OA();
    
    final boolean b() {
	return true;
    }
    
    final void e() {
	if (((l) r).J > 1) {
	    synchronized (this) {
		while (((da) this).f) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		((da) this).f = true;
	    }
	}
    }
    
    final native void R(int i, int i_52_, int i_53_);
    
    final void a(int i, int i_54_, int i_55_, int i_56_) {
	/* empty */
    }
    
    final native void M(int i);
    
    final void a() {
	/* empty */
    }
    
    final native void T(int i);
    
    final native int za();
    
    final native void WA(int i, int i_57_, int i_58_, int i_59_);
    
    final native void W(int i);
    
    final native int J();
    
    final native int PA();
    
    private final void a(int[] is, Class_q class_q) {
	r.D().s(this, is, class_q);
    }
    
    final boolean a(int i, int i_60_, Class_q class_q, boolean bool,
		    int i_61_) {
	return r.D().XA(this, i, i_60_, class_q, bool);
    }
    
    final native void ba(int i, int i_62_, Class_i class_i,
			 Class_i class_i_63_, int i_64_, int i_65_, int i_66_);
    
    protected final void finalize() {
	if (((v) this).nativeid != 0L)
	    iba.a(this, (byte) -77);
    }
    
    final native void L();
    
    final native boolean F();
    
    final native int RA();
    
    final native ha S(ha var_ha);
    
    final native void oa(int i, int i_67_, int i_68_);
    
    final native void ga(int i);
    
    final hi[] c() {
	return ((v) this).s;
    }
    
    private final native void I(long l, int i, int[] is, int i_69_, int i_70_,
				int i_71_, int i_72_, boolean bool);
    
    final void a(int i, int[] is, int i_73_, int i_74_, int i_75_, int i_76_,
		 boolean bool) {
	I(((v) this).nativeid, i, is, i_73_, i_74_, i_75_, i_76_, bool);
    }
    
    final native void FA();
    
    final native int TA();
    
    final native void SA(int i);
    
    final native int KA();
    
    final void a(Class_q class_q, pba var_pba, int i, int i_77_) {
	if (var_pba == null)
	    r.D().J(this, class_q, null, i, i_77_);
	else {
	    l.t[5] = 0;
	    r.D().J(this, class_q, l.t, i, i_77_);
	    ((pba) var_pba).k = l.t[0];
	    ((pba) var_pba).g = l.t[1];
	    ((pba) var_pba).l = l.t[2];
	    ((pba) var_pba).i = l.t[3];
	    ((pba) var_pba).j = l.t[4];
	    ((pba) var_pba).h = l.t[5] != 0;
	}
    }
    
    final native int l();
    
    final native void n(v var_v_78_, v var_v_79_, int i, boolean bool,
			boolean bool_80_);
    
    final native int H();
    
    final void d() {
	if (((l) r).J > 1) {
	    synchronized (this) {
		((da) this).f = false;
		this.notifyAll();
	    }
	}
    }
    
    final native void DA(short i, short i_81_);
    
    public final native void UA(boolean bool);
    
    v(l class_l, m var_m, eg var_eg, int i, int i_82_, int i_83_,
      int i_84_) {
	r = class_l;
	p = var_m;
	((v) this).s = ((eg) var_eg).q;
	((v) this).q = ((eg) var_eg).i;
	int i_85_ = ((eg) var_eg).q == null ? 0 : ((eg) var_eg).q.length;
	int i_86_ = ((eg) var_eg).i == null ? 0 : ((eg) var_eg).i.length;
	int i_87_ = 0;
	int[] is = new int[i_85_ * 3 + i_86_];
	for (int i_88_ = 0; i_88_ < i_85_; i_88_++) {
	    is[i_87_++] = ((hi) ((v) this).s[i_88_]).d;
	    is[i_87_++] = ((hi) ((v) this).s[i_88_]).g;
	    is[i_87_++] = ((hi) ((v) this).s[i_88_]).e;
	}
	for (int i_89_ = 0; i_89_ < i_86_; i_89_++)
	    is[i_87_++] = ((qg) ((v) this).q[i_89_]).b;
	int i_90_ = ((eg) var_eg).N == null ? 0 : ((eg) var_eg).N.length;
	int[] is_91_ = new int[i_90_ * 8];
	int i_92_ = 0;
	for (int i_93_ = 0; i_93_ < i_90_; i_93_++) {
	    lw var_lw = ((eg) var_eg).N[i_93_];
	    cj var_cj = kg.a(((lw) var_lw).g, -94);
	    is_91_[i_92_++] = ((lw) var_lw).c;
	    is_91_[i_92_++] = ((cj) var_cj).g;
	    is_91_[i_92_++] = ((cj) var_cj).var_n;
	    is_91_[i_92_++] = ((cj) var_cj).i;
	    is_91_[i_92_++] = ((cj) var_cj).f;
	    is_91_[i_92_++] = ((cj) var_cj).m;
	    is_91_[i_92_++] = ((cj) var_cj).d ? -1 : 0;
	}
	for (int i_94_ = 0; i_94_ < i_90_; i_94_++) {
	    lw var_lw = ((eg) var_eg).N[i_94_];
	    is_91_[i_92_++] = ((lw) var_lw).h;
	}
	QA(r, p, ((eg) var_eg).z, ((eg) var_eg).l, ((eg) var_eg).o,
	   ((eg) var_eg).W, ((eg) var_eg).R, ((eg) var_eg).Q, ((eg) var_eg).f,
	   ((eg) var_eg).G, ((eg) var_eg).O, ((eg) var_eg).v, ((eg) var_eg).a,
	   ((eg) var_eg).U, ((eg) var_eg).w, ((eg) var_eg).m, ((eg) var_eg).e,
	   ((eg) var_eg).Z, ((eg) var_eg).B, ((eg) var_eg).s, ((eg) var_eg).c,
	   ((eg) var_eg).C, ((eg) var_eg).L, ((eg) var_eg).F, ((eg) var_eg).p,
	   ((eg) var_eg).h, ((eg) var_eg).x, ((eg) var_eg).S, ((eg) var_eg).j,
	   ((eg) var_eg).D, ((eg) var_eg).Y, ((eg) var_eg).y, ((eg) var_eg).V,
	   ((eg) var_eg).k, ((eg) var_eg).d, is, i_85_, i_86_, i, i_82_, i_83_,
	   i_84_, is_91_);
    }
    
    v(l class_l) {
	r = class_l;
	p = null;
	X(class_l);
    }
}
