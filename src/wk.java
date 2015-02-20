/* wk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class wk extends bv implements dw
{
    static int c;
    static int d;
    static int e;
    static int f;
    private int g;
    static int[] h;
    static int i;
    static int[] j = { 16, 32, 64, 128 };
    static int k;
    
    public final int a(byte i) {
	f++;
	if (i != -17)
	    h = null;
	return g;
    }
    
    static final vfa a(int i, String string, Signlink var_rj, int i_0_) {
	wk.i++;
	if (i_0_ == 0)
	    return var_rj.a(0, string);
	if (i_0_ == 1) {
	    try {
		rp.a(vj.applet, "openjs",
		     (new Object[]
		      { new URL(vj.applet.getCodeBase(), string).toString() }),
		     1164);
		vfa var_vfa = new vfa();
		var_vfa.f = 1;
		return var_vfa;
	    } catch (Throwable throwable) {
		vfa var_vfa = new vfa();
		var_vfa.f = 2;
		return var_vfa;
	    }
	}
	if (i_0_ == 2) {
	    try {
		vj.applet.getAppletContext().showDocument
		    (new URL(vj.applet.getCodeBase(), string), "_blank");
		vfa var_vfa = new vfa();
		var_vfa.f = 1;
		return var_vfa;
	    } catch (Exception exception) {
		vfa var_vfa = new vfa();
		var_vfa.f = 2;
		return var_vfa;
	    }
	}
	if (i_0_ == 3) {
	    try {
		rp.a(true, "loggedout", vj.applet);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		vj.applet.getAppletContext()
		    .showDocument(new URL(vj.applet.getCodeBase(), string), "_top");
		vfa var_vfa = new vfa();
		var_vfa.f = 1;
		return var_vfa;
	    } catch (Exception exception) {
		vfa var_vfa = new vfa();
		var_vfa.f = 2;
		return var_vfa;
	    }
	}
	int i_1_ = -36 % ((i - 27) / 52);
	throw new IllegalArgumentException();
    }
    
    public final void a(int i, int i_2_, int i_3_, byte[] is) {
	if (i_2_ != 17816)
	    h = null;
	this.a(is, i_3_);
	d++;
	g = i;
    }
    
    wk(qj var_qj, int i, byte[] is, int i_4_) {
	super(var_qj, is, i_4_);
	g = i;
    }
    
    public final long a(int i) {
	if (i != 13456)
	    return -7L;
	e++;
	return ((bv) this).a.getAddress();
    }
    
    public final int b(int i) {
	k++;
	if (i != -22904)
	    a(104, (String) null, null, -8);
	return 0;
    }
    
    static final boolean a(int i, int i_5_, int i_6_, int i_7_) {
	if (i_7_ != 12524)
	    a(-110, -56, 69, 12);
	c++;
	qga.i.a(i_6_, i_5_, i, qd.w);
	int i_8_ = qd.w[2];
	if (i_8_ < 50)
	    return false;
	qd.w[1] = bt.p * qd.w[1] / i_8_ + dr.f;
	qd.w[2] = i_8_;
	qd.w[0] = Class_cb.f * qd.w[0] / i_8_ + iq.j;
	return true;
    }
    
    public static void c(int i) {
	j = null;
	if (i != 1)
	    j = null;
	h = null;
    }
}
