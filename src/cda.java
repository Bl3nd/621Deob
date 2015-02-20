/* cda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cda
{
    static short a = 256;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    
    static final boolean a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
	f++;
	if (!wk.a(i_3_, i_6_, i_8_, 12524))
	    return false;
	i_8_ = qd.w[0];
	i_6_ = qd.w[1];
	i_3_ = qd.w[2];
	if (i_2_ != 26403)
	    return true;
	if (!wk.a(i_4_, i_0_, i_5_, 12524))
	    return false;
	i_0_ = qd.w[1];
	i_4_ = qd.w[2];
	i_5_ = qd.w[0];
	if (!wk.a(i_1_, i, i_7_, 12524))
	    return false;
	i_7_ = qd.w[0];
	i = qd.w[1];
	i_1_ = qd.w[2];
	return tp.a(i_8_, i_1_, i_5_, i_2_ - 26403, i, i_0_, i_7_, i_3_, i_4_,
		    i_6_);
    }
    
    static final void a(int i) {
	e++;
	n.h = false;
	if (i != -4)
	    b(-76);
	fda.a(i + 4);
    }
    
    static final void a(int i, int i_9_, int i_10_, String string, int i_11_) {
	if (i_9_ == 18365) {
	    c++;
	    Interface var_kp = ida.a(i_11_, i, (byte) 44);
	    if (var_kp != null) {
		if (((Interface) var_kp).nd != null) {
		    ClientScript var_mea = new ClientScript();
		    ((ClientScript) var_mea).A = i_10_;
		    ((ClientScript) var_mea).interface_ = var_kp;
		    ((ClientScript) var_mea).objects = ((Interface) var_kp).nd;
		    ((ClientScript) var_mea).t = string;
		    ClientScriptHandler.activateClientScript(var_mea);
		}
		if (hm.h == 10 && client.c(var_kp).a(i_10_ - 1, (byte) 91)) {
		    if (i_10_ == 1) {
			gg.w++;
			tba var_tba = jga.sendGameOutPacket(ur.c, pca.isaac, (byte) -101);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 2) {
			baa.k++;
			tba var_tba = jga.sendGameOutPacket(kfa.a, pca.isaac, (byte) -62);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 3) {
			km.f++;
			tba var_tba = jga.sendGameOutPacket(og.i, pca.isaac, (byte) -119);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 4) {
			ji.a++;
			tba var_tba = jga.sendGameOutPacket(dh.b, pca.isaac, (byte) -112);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 5) {
			um.c++;
			tba var_tba = jga.sendGameOutPacket(caa.H, pca.isaac, (byte) -111);
			lda.a(i, ((Interface) var_kp).itemID, i_9_ ^ 0x47b2, i_11_,
			      var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 6) {
			vt.e++;
			tba var_tba = jga.sendGameOutPacket(Class_md.f, pca.isaac, (byte) -113);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 7) {
			gfa.C++;
			tba var_tba = jga.sendGameOutPacket(nq.w, pca.isaac, (byte) 119);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 8) {
			hs.c++;
			tba var_tba = jga.sendGameOutPacket(fr.p, pca.isaac, (byte) 122);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 9) {
			jo.J++;
			tba var_tba = jga.sendGameOutPacket(Class_cb.e, pca.isaac, (byte) 99);
			lda.a(i, ((Interface) var_kp).itemID, i_9_ ^ 0x47b2, i_11_,
			      var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		    if (i_10_ == 10) {
			dca.Q++;
			tba var_tba = jga.sendGameOutPacket(kg.b, pca.isaac, (byte) -90);
			lda.a(i, ((Interface) var_kp).itemID, 15, i_11_, var_tba);
			ud.a(var_tba, (byte) -36);
		    }
		}
	    }
	}
    }
    
    static final int b(int i) {
	g++;
	if ((double) kca.o == 3.0)
	    return 37;
	if ((double) kca.o == 4.0)
	    return 50;
	if ((double) kca.o == 6.0)
	    return 75;
	if ((double) kca.o == 8.0)
	    return 100;
	if (i != 3411)
	    return 100;
	return 200;
    }
}
