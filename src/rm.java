/* rm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rm extends Interactable
{
    static int g;
    int h;
    int i;
    static int j;
    int k;
    int l;
    int m;
    int var_n;
    static int o;
    String p;
    
    static final void a(String string, boolean bool) {
	g++;
	if (ba.c && (Class_jc.db & 0x18) != 0) {
	    boolean bool_0_ = false;
	    int i = oca.inScreenPlayers;
	    int[] is = vd.inScreenPlayerIDs;
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		Player var_qi = Class_fc.playersInScreen[is[i_1_]];
		if (((Player) var_qi).displayName != null
		    && ((Player) var_qi).displayName.equalsIgnoreCase(string)
		    && (var_qi == up.thisPlayer && (0x10 & Class_jc.db) != 0
			|| var_qi != null && (0x8 & Class_jc.db) != 0)) {
		    pi.o++;
		    tba var_tba = jga.sendGameOutPacket(vj.u, pca.isaac, (byte) -126);
		    ((tba) var_tba).loginStream.writeByte((int) 0, (byte) -109);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, qda.G);
		    ((tba) var_tba).loginStream.writeIntShiftsInOrder_8_0_24_16(tm.t, 123);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, th.i);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, is[i_1_]);
		    ud.a(var_tba, (byte) -36);
		    bool_0_ = true;
		    la.a(1, 0, -2, var_qi.getNPCDefinition(-1), 0, true, ((Entity) var_qi).regionLocalX[0],
			 ((Entity) var_qi).regionLocalY[0], var_qi.getNPCDefinition(-1));
		    break;
		}
	    }
	    if (bool != true)
		o = 43;
	    if (!bool_0_)
		cba.a(4, false, GameText.unableToFind_.getString(cba.languageID) + string);
	    if (ba.c)
		vo.c((byte) 31);
	}
    }
    
    static final void a(int i, int i_2_, int i_3_, int i_4_, float f, int i_5_,
			int i_6_, int i_7_, float f_8_, int i_9_, float f_10_,
			int i_11_, float[] fs) {
	i_7_ -= i_11_;
	int i_12_ = 105 / ((i_6_ - 6) / 53);
	i_5_ -= i_9_;
	j++;
	i_3_ -= i_2_;
	float f_13_ = ((float) i_5_ * fs[0] + (float) i_7_ * fs[1]
		       + fs[2] * (float) i_3_);
	float f_14_ = (fs[4] * (float) i_7_ + fs[3] * (float) i_5_
		       + fs[5] * (float) i_3_);
	float f_15_ = ((float) i_7_ * fs[7] + (float) i_5_ * fs[6]
		       + (float) i_3_ * fs[8]);
	float f_16_;
	float f_17_;
	if (i != 0) {
	    if (i != 1) {
		if (i == 2) {
		    f_17_ = f_10_ - f_13_ + 0.5F;
		    f_16_ = f_8_ - f_14_ + 0.5F;
		} else if (i != 3) {
		    if (i != 4) {
			f_17_ = f - f_15_ + 0.5F;
			f_16_ = f_8_ - f_14_ + 0.5F;
		    } else {
			f_17_ = f_15_ + f + 0.5F;
			f_16_ = f_8_ - f_14_ + 0.5F;
		    }
		} else {
		    f_16_ = f_8_ - f_14_ + 0.5F;
		    f_17_ = f_13_ + f_10_ + 0.5F;
		}
	    } else {
		f_17_ = f_13_ + f_10_ + 0.5F;
		f_16_ = f + f_15_ + 0.5F;
	    }
	} else {
	    f_16_ = f - f_15_ + 0.5F;
	    f_17_ = f_13_ + f_10_ + 0.5F;
	}
	if (i_4_ == 1) {
	    float f_18_ = f_17_;
	    f_17_ = -f_16_;
	    f_16_ = f_18_;
	} else if (i_4_ == 2) {
	    f_17_ = -f_17_;
	    f_16_ = -f_16_;
	} else if (i_4_ == 3) {
	    float f_19_ = f_17_;
	    f_17_ = f_16_;
	    f_16_ = -f_19_;
	}
	OutputStreamSub.f = f_16_;
	dda.j = f_17_;
    }
    
    static final void a(int i, int i_20_, int i_21_, int i_22_, byte[][][] is,
			int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_,
			int[] is_27_, int i_28_, byte i_29_, int i_30_,
			int i_31_, boolean bool, boolean bool_32_) {
	ih.m = nda.k.c() > 0;
	ISAAC.e = bool_32_;
	n.e = i_20_ >> Class_fb.a;
	fm.i = i_22_ >> Class_fb.a;
	dl.d = i_20_;
	sw.g = i_22_;
	ItemDef.a = i_21_;
	fp.q = n.e - FileOnDisk.k;
	if (fp.q < 0) {
	    jl.g = -fp.q;
	    fp.q = 0;
	} else
	    jl.g = 0;
	dp.n = fm.i - FileOnDisk.k;
	if (dp.n < 0) {
	    vn.O = -dp.n;
	    dp.n = 0;
	} else
	    vn.O = 0;
	fq.h = n.e + FileOnDisk.k;
	if (fq.h > sv.T)
	    fq.h = sv.T;
	hea.d = fm.i + FileOnDisk.k;
	if (hea.d > nf.H)
	    hea.d = nf.H;
	boolean[][] bools = vd.O;
	boolean[][] bools_33_ = kl.i;
	if (ISAAC.e) {
	    for (int i_34_ = 0; i_34_ < FileOnDisk.k + FileOnDisk.k + 2; i_34_++) {
		for (int i_35_ = 0; i_35_ < FileOnDisk.k + FileOnDisk.k + 2; i_35_++) {
		    int i_36_ = n.e - FileOnDisk.k + i_34_;
		    int i_37_ = fm.i - FileOnDisk.k + i_35_;
		    if (i_36_ >= 0 && i_37_ >= 0 && i_36_ < sv.T
			&& i_37_ < nf.H) {
			int i_38_ = i_36_ << Class_fb.a;
			int i_39_ = i_37_ << Class_fb.a;
			int i_40_
			    = (vr.b[vr.b.length - 1].a(i_37_, (byte) 51, i_36_)
			       - (1000 << Class_fb.a - 7));
			int i_41_
			    = (wr.D != null
			       ? wr.D[0].a(i_37_, (byte) 51, i_36_) + bea.o
			       : vr.b[0].a(i_37_, (byte) 51, i_36_) + bea.o);
			kl.i[i_34_][i_35_] = nda.k.O(i_38_, i_40_, i_39_,
						     i_38_, i_41_, i_39_);
		    } else
			kl.i[i_34_][i_35_] = false;
		}
	    }
	    for (int i_42_ = 0; i_42_ < FileOnDisk.k + FileOnDisk.k + 1; i_42_++) {
		for (int i_43_ = 0; i_43_ < FileOnDisk.k + FileOnDisk.k + 1; i_43_++)
		    vd.O[i_42_][i_43_]
			= (kl.i[i_42_][i_43_] || kl.i[i_42_ + 1][i_43_]
			   || kl.i[i_42_][i_43_ + 1]
			   || kl.i[i_42_ + 1][i_43_ + 1]);
	    }
	    op.X = is_23_;
	    re.f = is_24_;
	    jm.e = is_25_;
	    th.k = is_26_;
	    mj.j = is_27_;
	    lu.a(i_28_, 26871, nda.k);
	} else {
	    if (mq.d == null) {
		mq.d = new boolean[sv.T + sv.T + 1][nf.H + sv.T + 1];
		for (int i_44_ = 0; i_44_ < mq.d.length; i_44_++) {
		    for (int i_45_ = 0; i_45_ < mq.d[0].length; i_45_++)
			mq.d[i_44_][i_45_] = true;
		}
	    }
	    kl.i = mq.d;
	    vd.O = mq.d;
	    fp.q = 0;
	    dp.n = 0;
	    fq.h = sv.T;
	    hea.d = nf.H;
	    bfa.D = 0;
	}
	qs.a(nda.k, 5);
	for (og var_og = (og) oea.fb.b((byte) 72); var_og != null;
	     var_og = (og) oea.fb.a((byte) -106)) {
	    var_og.unlink(2);
	    ej.a(var_og, 0);
	}
	if (ih.m) {
	    for (int i_46_ = 0; i_46_ < qn.k; i_46_++)
		Class_j.l[i_46_].a(false, i, bool);
	}
	if (kw.B) {
	    eh.c = nda.k.v();
	    nda.k.oa(GameInPacketHandler.var_n);
	    int i_47_ = (GameInPacketHandler.var_n[2] - GameInPacketHandler.var_n[0]) / ko.a;
	    for (int i_48_ = 0; i_48_ < ko.a - 1; i_48_++)
		tg.M[i_48_] = i_47_ * (i_48_ + 1) + fm.f[i_48_];
	    for (int i_49_ = 0; i_49_ < vk.i.length; i_49_++)
		vk.i[i_49_].a();
	}
	if (fg.e != null) {
	    if (kw.B)
		mga.c(0);
	    il.b(true);
	    nda.k.CA(-1, 1583160, 40, 127);
	    sp.a(true, is, i_28_, i_29_);
	    if (kw.B)
		qga.a();
	    nda.k.L();
	    il.b(false);
	}
	sp.a(false, is, i_28_, i_29_);
	if (kw.B) {
	    for (int i_50_ = 0; i_50_ < dfa.G; i_50_++)
		kga.mb[i_50_] = qea.d[i_50_];
	    mga.c(0);
	    for (int i_51_ = 0; i_51_ < vk.i.length; i_51_++)
		vk.i[i_51_].a();
	}
	if (kw.B) {
	    qga.a();
	    for (int i_52_ = 0; i_52_ < dfa.G; i_52_++)
		qea.d[i_52_] = kga.mb[i_52_];
	    if (qd.v == 2) {
		if (jj.l[0] < jj.l[1]) {
		    if (tg.M[0] + fm.f[0] > GameInPacketHandler.var_n[0])
			fm.f[0]++;
		} else if (jj.l[0] > jj.l[1] && tg.M[0] + fm.f[0] < GameInPacketHandler.var_n[2])
		    fm.f[0]--;
	    }
	}
	if (!ISAAC.e) {
	    vd.O = bools;
	    kl.i = bools_33_;
	}
	ud.a();
    }
    
    public rm() {
	/* empty */
    }
}
