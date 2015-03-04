/* sm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sm
{
    static pl a;
    private tb b = new tb(64);
    static int c;
    static int d;
    private pl e;
    static int f;
    static int g;
    static int h;
    static int i = 1403;
    
    static final void a(Interface var_kp, int i, int i_0_, int i_1_) {
	if (ba.c) {
	    vu var_vu
		= (nu.h ^ 0xffffffff) == 0 ? null : jba.b.a((byte) 6, nu.h);
	    if (client.c(var_kp).a(false) && (0x20 & Class_jc.db) != 0
		&& (var_vu == null || (var_kp.b(124, ((vu) var_vu).h, nu.h)
				       != ((vu) var_vu).h))) {
		oh.h++;
		lea.setClickMenuOption(((Interface) var_kp).itemIndex, false, ((Interface) var_kp).interfaceID,
		      ((Interface) var_kp).itemID, true, uk.d, i ^ ~0x403d, 0L,
		      Class_ag.k + " -> " + ((Interface) var_kp).itemName, 45, Class_kd.itemName);
	    }
	}
	h++;
	for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
	    String string = qba.a(15648, i_2_, var_kp);
	    if (string != null) {
		lea.setClickMenuOption(((Interface) var_kp).itemIndex, false, ((Interface) var_kp).interfaceID,
		      ((Interface) var_kp).itemID, true, eca.a(var_kp, i_2_, true), 126,
		      (long) (i_2_ + 1), ((Interface) var_kp).itemName, 1011, string);
		jv.b++;
	    }
	}
	String string = tg.a(var_kp, (byte) -117);
	if (i == -16452) {
	    if (string != null) {
		er.d++;
		lea.setClickMenuOption(((Interface) var_kp).itemIndex, false, ((Interface) var_kp).interfaceID,
		      ((Interface) var_kp).itemID, true, ((Interface) var_kp).a, i ^ ~0x4062, 0L,
		      ((Interface) var_kp).itemName, 57, string);
	    }
	    for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
		String string_4_ = qba.a(15648, i_3_, var_kp);
		if (string_4_ != null) {
		    lea.setClickMenuOption(((Interface) var_kp).itemIndex, false, ((Interface) var_kp).interfaceID,
			  ((Interface) var_kp).itemID, true, eca.a(var_kp, i_3_, true),
			  i + 16578, (long) (i_3_ + 1), ((Interface) var_kp).itemName, 60,
			  string_4_);
		    jv.b++;
		}
	    }
	    if (client.c(var_kp).c(-128)) {
		Class_kf.P++;
		if (((Interface) var_kp).bd == null)
		    lea.setClickMenuOption(((Interface) var_kp).itemIndex, false, ((Interface) var_kp).interfaceID,
			  ((Interface) var_kp).itemID, true, -1, i + 16325, 0L, "", 50,
			  GameText.continueText.getString(cba.languageID));
		else
		    lea.setClickMenuOption(((Interface) var_kp).itemIndex, false, ((Interface) var_kp).interfaceID,
			  ((Interface) var_kp).itemID, true, -1, 126, 0L, "", 50,
			  ((Interface) var_kp).bd);
	    }
	}
    }
    
    final no a(int i, int i_5_) {
	f++;
	if (i > -55)
	    sm.i = 83;
	no var_no;
	synchronized (b) {
	    var_no = (no) b.get((long) i_5_, (byte) 100);
	}
	if (var_no != null)
	    return var_no;
	byte[] is;
	synchronized (e) {
	    is = e.b(i_5_, -123, 5);
	}
	var_no = new no();
	if (is != null)
	    var_no.a(new BytesParser(is), -50);
	synchronized (b) {
	    b.put((long) i_5_, var_no, 1);
	}
	return var_no;
    }
    
    public static void a(int i) {
	if (i == 1403)
	    a = null;
    }
    
    static final boolean a(int i, int i_6_, int i_7_) {
	c++;
	if (i_6_ != 0)
	    a = null;
	if ((i & 0x800) == 0)
	    return false;
	return true;
    }
    
    static final boolean a(int i, pk var_pk) {
	if (i != 1)
	    a(-23);
	d++;
	if (var_pk != ia.o && var_pk != dp.g && var_pk != Class_g.modeWhere
	    && var_pk != kl.e)
	    return false;
	return true;
    }
    
    static final void a(Class_r class_r, int i, int i_8_, int i_9_, int i_10_,
			int i_11_, int i_12_, boolean bool, boolean bool_13_) {
	nda.k = class_r;
	qd.v = i;
	kw.B = qd.v > 1 && nda.k.h();
	Class_fb.a = i_8_;
	bea.o = 1 << Class_fb.a;
	dba.k = bea.o >> 1;
	Math.sqrt((double) (dba.k * dba.k + dba.k * dba.k));
	dfa.G = i_9_;
	sv.T = i_10_;
	nf.H = i_11_;
	FileOnDisk.k = i_12_;
	wf.u = dp.d(113);
	he.c(1000);
	ws.I = new vf[i_9_][sv.T][nf.H];
	vr.b = new Class_i[i_9_];
	if (bool) {
	    of.b = new int[sv.T][nf.H];
	    qh.q = new byte[sv.T][nf.H];
	    uo.c = new short[sv.T][nf.H];
	    fg.e = new vf[1][sv.T][nf.H];
	    wr.D = new Class_i[1];
	} else {
	    of.b = null;
	    qh.q = null;
	    uo.c = null;
	    fg.e = null;
	    wr.D = null;
	}
	if (bool_13_) {
	    tba.n = new long[i_9_][i_10_][i_11_];
	    Class_j.l = new qd[65535];
	    Class_j.i = new boolean[65535];
	    qn.k = 0;
	} else {
	    tba.n = null;
	    Class_j.l = null;
	    Class_j.i = null;
	    qn.k = 0;
	}
	il.b(false);
	aaa.animables = new Animable[2][];
	aaa.animables[0] = new Animable[of.d[0]];
	aaa.animables[1] = new Animable[of.d[1]];
	baa.l = new int[2];
	lm.Nh = new Animable[2][];
	lm.Nh[0] = new Animable[nq.n[0]];
	lm.Nh[1] = new Animable[nq.n[1]];
	fg.a = new int[2];
	InputStreamSub_1.d = new Animable[2][];
	InputStreamSub_1.d[0] = new Animable[dca.T[0]];
	InputStreamSub_1.d[1] = new Animable[dca.T[1]];
	cc.f = new int[2];
	ht.F = new Animable[10000];
	ii.d = 0;
	uq.H = new Animable[5000];
	Class_u.Q = 0;
	sw.a = new qda[5000];
	Node_Sub.n = 0;
	vd.O = new boolean[FileOnDisk.k + FileOnDisk.k + 1][FileOnDisk.k + FileOnDisk.k + 1];
	kl.i = new boolean[FileOnDisk.k + FileOnDisk.k + 2][FileOnDisk.k + FileOnDisk.k + 2];
	if (kw.B) {
	    qea.d = new boolean[i_9_][FileOnDisk.k + FileOnDisk.k + 1][FileOnDisk.k + FileOnDisk.k + 1];
	    kga.mb = new boolean[i_9_][][];
	    if (vk.i != null)
		oea.a();
	    vk.i = new wda[qd.v];
	    nda.k.g(vk.i.length + 1);
	    nda.k.f(0);
	    for (int i_14_ = 0; i_14_ < vk.i.length; i_14_++) {
		vk.i[i_14_] = new wda(i_14_ + 1, nda.k);
		new Thread(vk.i[i_14_], "wr" + i_14_).start();
	    }
	    int i_15_;
	    if (qd.v == 2) {
		i_15_ = 4;
		ko.a = 2;
	    } else if (qd.v == 3) {
		i_15_ = 6;
		ko.a = 3;
	    } else {
		i_15_ = 8;
		ko.a = 4;
	    }
	    ff.p = new dda[i_15_];
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
		ff.p[i_16_] = new dda(Animable.q[qd.v - 2][i_16_]);
	} else
	    ko.a = 1;
	tg.M = new int[ko.a - 1];
	fm.f = new int[ko.a - 1];
    }
    
    static final void a(int i, Class_r class_r, int i_17_, byte i_18_,
			int i_19_, int i_20_, fa var_fa) {
	if (i_18_ != -34)
	    sm.i = 62;
	if (taa.b < 100)
	    gv.a(var_fa, class_r, -74);
	g++;
	class_r.da(i_17_, i, i_17_ + i_20_, i_19_ + i);
	if (taa.b < 100) {
	    int i_21_ = 20;
	    int i_22_ = i_17_ + i_20_ / 2;
	    int i_23_ = i_19_ / 2 - i_21_ + (i - 18);
	    class_r.J(i_17_, i, i_20_, i_19_, -16777216, 0);
	    class_r.c(i_22_ - 152, i_23_, 304, 34, fh.a[jr.colourId].getRGB(), 0);
	    class_r.J(i_22_ - 150, i_23_ + 2, 3 * taa.b, 30,
		      os.i[jr.colourId].getRGB(), 0);
	    pv.j.a(uca.a[jr.colourId].getRGB(), -142, i_22_, -1, i_23_ + i_21_,
		   GameText.loadingText.getString(cba.languageID));
	} else {
	    int i_24_ = ut.I - (int) ((float) i_20_ / kca.m);
	    int i_25_ = (int) ((float) i_19_ / kca.m) + cv.d;
	    int i_26_ = (int) ((float) i_20_ / kca.m) + ut.I;
	    dea.h = (int) ((float) (2 * i_19_) / kca.m);
	    uda.b = (int) ((float) (2 * i_20_) / kca.m);
	    dba.b = cv.d - (int) ((float) i_19_ / kca.m);
	    hga.c = ut.I - (int) ((float) i_20_ / kca.m);
	    int i_27_ = cv.d - (int) ((float) i_19_ / kca.m);
	    kca.a(kca.F + i_24_, kca.E + i_25_, kca.F + i_26_, kca.E + i_27_,
		  i_17_, i, i_20_ + i_17_, i + i_19_ + 1);
	    kca.a(class_r);
	    Class_ae class_ae = kca.b(class_r);
	    ss.a(0, class_r, class_ae, 0, 0);
	    if (nda.g > 0) {
		sh.h--;
		if (sh.h == 0) {
		    nda.g--;
		    sh.h = 20;
		}
	    }
	    if (sl.fpsOn) {
		int i_28_ = i_20_ + i_17_ - 5;
		int i_29_ = i - (-i_19_ + 8);
		pm.v.a(i_28_, i_29_, "Fps:" + fu.fps, 16776960, -1, -98);
		i_29_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_30_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_31_ = 16776960;
		if (i_30_ > 65536)
		    i_31_ = 16711680;
		pm.v.a(i_28_, i_29_, "Mem:" + i_30_ + "loginStream", i_31_, -1, -64);
		i_29_ -= 15;
	    }
	}
    }
    
    sm(Class_rf class_rf, int i, pl var_pl) {
	e = var_pl;
	e.a(5, true);
    }
}
