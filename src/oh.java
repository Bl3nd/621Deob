/* oh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class oh
{
    static int a;
    int b;
    static rc c = new rc();
    byte d;
    int e;
    static int f;
    short g;
    static int h;
    int i;
    boolean j;
    static int k;
    int l;
    short m;
    static int n;
    static int o;
    short p;
    int q;
    static int r;
    
    static final boolean a(int i, byte i_0_) {
	a++;
	for (bfa var_bfa = (bfa) oba.I.a((int) 93); var_bfa != null;
	     var_bfa = (bfa) oba.I.b((byte) 60)) {
	    if (sl.b(-1, ((bfa) var_bfa).v) && (long) i == ((bfa) var_bfa).n)
		return true;
	}
	if (i_0_ != -99)
	    c = null;
	return false;
    }
    
    public static void a(int i) {
	c = null;
	if (i > -122)
	    c = null;
    }
    
    static final void a(int i, boolean bool, String string) {
	if (i == 0) {
	    lg.r = Class_r.a(((jb) cs.g).Z * 2, 0, on.c, ru.canvas, Class_nd.p,
			     -19464);
	    if (string != null) {
		lg.r.ja(0);
		sa var_sa = qj.a((byte) 11, cs.i, 0, iq.plainFont);
		la var_la = lg.r.a(var_sa, aga.b(sm.a, iq.plainFont, 0), true);
		ro.b(0);
		Class_rf.a(!bool, lg.r, true, var_sa, var_la, string);
	    }
	} else {
	    Class_r class_r = null;
	    if (string != null) {
		class_r = Class_r.a(0, 0, on.c, ru.canvas, Class_nd.p, -19464);
		class_r.ja(0);
		sa var_sa = qj.a((byte) 11, cs.i, 0, iq.plainFont);
		la var_la = class_r.a(var_sa, aga.b(sm.a, iq.plainFont, 0), true);
		ro.b(0);
		Class_rf.a(true, class_r, true, var_sa, var_la, string);
	    }
	    try {
		lg.r = Class_r.a(2 * ((jb) cs.g).Z, i, on.c, ru.canvas, Class_nd.p,
				 -19464);
		if (string != null) {
		    class_r.ja(0);
		    sa var_sa = qj.a((byte) 11, cs.i, 0, iq.plainFont);
		    la var_la = class_r.a(var_sa, aga.b(sm.a, iq.plainFont, 0), true);
		    ro.b(0);
		    Class_rf.a(!bool, class_r, true, var_sa, var_la, string);
		}
		if (lg.r.x()) {
		    boolean bool_1_ = true;
		    try {
			bool_1_
			    = jagmisc.getTotalPhysicalMemory() > 268435456L;
		    } catch (Throwable throwable) {
			/* empty */
		    }
		    IncomingPackets incomingPackets;
		    if (!bool_1_)
			incomingPackets = lg.r.c(104857600);
		    else
			incomingPackets = lg.r.c(146800640);
		    lg.r.a(incomingPackets);
		}
	    } catch (Throwable throwable) {
		lg.r = Class_r.a(0, 0, on.c, ru.canvas, Class_nd.p, -19464);
		i = 0;
	    }
	    if (class_r != null) {
		try {
		    class_r.h(1);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	}
	f++;
	on.performance = i;
	jfa.i(-1);
	lg.r.va(32);
	tg.G = lg.r.C();
	br.n = lg.r.C();
	SpecialOutPacket.a((byte) -106);
	lg.r.b(!((jb) cs.g).K);
	if (lg.r.r())
	    ik.a(-66, ((jb) cs.g).cb);
	ho.a(lg.r, bw.v >> 3, Class_hc.e >> 3, (byte) -10);
	Class_ad.b(29);
	NPCNode.k = bool;
	pda.v = null;
	up.I = true;
    }
    
    static final void a(byte i) {
	r++;
	if (!sa.s) {
	    if (((jb) cs.g).n)
		pm.F = (float) ((int) pm.F + 47 & ~0xf);
	    else
		pda.J += (12.0F - pda.J) / 2.0F;
	    mo.F = true;
	    if (i < -11)
		sa.s = true;
	}
    }
    
    static final int b(int i, byte i_2_) {
	if (i_2_ != 75)
	    c = null;
	k++;
	return i & 0xff;
    }
    
    static final void a(int i, int i_3_, int i_4_, boolean bool, int i_5_,
			boolean bool_6_) {
	if (bool != false)
	    c = null;
	n++;
	if ((!bool_6_ ? ((jb) cs.g).I : ((jb) cs.g).P) != 0 && i_3_ != 0
	    && je.i < 50 && (i ^ 0xffffffff) != 0)
	    tn.j[je.i++] = new vt(bool_6_ ? (byte) 3 : (byte) 2, i, i_3_, i_4_,
				  i_5_, 0);
    }
    
    static final void b(int i) {
	o++;
	dl.c = new Class_ae();
	if (i <= 10)
	    a(-26, (byte) 13);
    }
    
    oh(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
       int i_13_, int i_14_, boolean bool, boolean bool_15_, int i_16_) {
	((oh) this).d = (byte) i_14_;
	((oh) this).g = (short) i_10_;
	((oh) this).i = i_7_;
	((oh) this).m = (short) i_12_;
	((oh) this).p = (short) i_11_;
	((oh) this).b = i_8_;
	((oh) this).q = i_16_;
	((oh) this).l = i_9_;
	((oh) this).j = bool_15_;
	((oh) this).e = i;
    }
}
