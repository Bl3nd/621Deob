/* in - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

final class in extends bv implements nl
{
    static int c;
    static int d;
    static GameOutPacket e = new GameOutPacket(77, -1);
    static int f;
    static int g;
    static int h;
    static int i;
    private int j;
    static int k;
    static int l;
    
    static final bc c(int i) {
	d++;
	try {
	    return new ed();
	} catch (Throwable throwable) {
	    try {
		return (bc) Class.forName("ne").newInstance();
	    } catch (Throwable throwable_0_) {
		if (i != 15902)
		    return null;
		return new ai();
	    }
	}
    }
    
    static final boolean a(int i, boolean bool, int i_1_) {
	if (bool != false)
	    return true;
	k++;
	if ((i_1_ & 0x20) == 0)
	    return false;
	return true;
    }
    
    in(qj var_qj, int i, Buffer buffer) {
	super(var_qj, buffer);
	j = i;
    }
    
    static final void b(byte i) {
	bfa var_bfa = (bfa) oba.I.a((int) 107);
	int i_2_ = 29 / ((-51 - i) / 38);
	for (/**/; var_bfa != null; var_bfa = (bfa) oba.I.b((byte) 84)) {
	    if (bl.c(((bfa) var_bfa).v, 49))
		Class_rf.a(-30036, var_bfa);
	}
	h++;
	if (mu.j == 1)
	    eq.b(-8234);
	else {
	    caa.a(aw.option, hn.y_, lfa.r, (byte) 31, mr.x_);
	    int i_3_ = dca.R.a((byte) 99, GameText.chooseOptionText.getString(cba.languageID));
	    for (bfa var_bfa_4_ = (bfa) oba.I.a((int) 96); var_bfa_4_ != null;
		 var_bfa_4_ = (bfa) oba.I.b((byte) 36)) {
		int i_5_ = hv.a(25322, var_bfa_4_);
		if (i_3_ < i_5_)
		    i_3_ = i_5_;
	    }
	    lfa.r = (!lq.hb ? 22 : 16 * mu.j) + 26;
	    aw.option = i_3_ + 8;
	}
    }
    
    static final ml a(byte i, byte[] is, lm var_lm, int i_6_) {
	l++;
	if (is == null)
	    return null;
	if (i < 94)
	    return null;
	int i_7_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i_6_, i_7_);
	OpenGL.glProgramRawARB(i_6_, 34933, is);
	OpenGL.glGetIntegerv(34379, Class_hc.g, 0);
	if ((Class_hc.g[0] ^ 0xffffffff) != 0) {
	    OpenGL.glBindProgramARB(i_6_, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i_6_, 0);
	return new ml(var_lm, i_6_, i_7_);
    }
    
    public final int b(int i) {
	in.i++;
	if (i != 13003)
	    return 87;
	return 0;
    }
    
    public final long a(byte i) {
	f++;
	int i_8_ = 58 % ((i + 48) / 35);
	return ((bv) this).a.getAddress();
    }
    
    public final void a(byte[] is, int i, int i_9_, byte i_10_) {
	if (i_10_ != -80)
	    a(null, 117, 49, (byte) -52);
	this.a(is, i);
	g++;
	j = i_9_;
    }
    
    public static void d(int i) {
	if (i == 30987)
	    e = null;
    }
    
    in(qj var_qj, int i, byte[] is, int i_11_) {
	super(var_qj, is, i_11_);
	j = i;
    }
    
    public final int a(int i) {
	if (i != 30991)
	    return 87;
	c++;
	return j;
    }
}
