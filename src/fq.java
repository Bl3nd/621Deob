/* fq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fq implements ica
{
    static int a;
    private mk b;
    static int c;
    static int d;
    static int handlePlayerUpdateMasks;
    private f f;
    private pl g;
    static int h;
    static int i;
    
    public final boolean a(byte i) {
	c++;
	if (i != 82)
	    a(null, 59, 78);
	return g.g(1912, ((mk) b).a);
    }
    
    public final void a(int i) {
	fq.i++;
	f = a(g, 1024, ((mk) b).a);
	if (i >= -41)
	    f = null;
    }
    
    static final f a(pl var_pl, int i, int i_0_) {
	d++;
	f var_f = (f) Class_kb.l.get((long) i_0_, (byte) 100);
	if (i != 1024)
	    h = 120;
	if (var_f == null) {
	    if (!vt.c)
		var_f = aw.a(var_pl.a((int) 110, i_0_), i ^ 0x443);
	    else
		var_f = lg.r.a(aga.b(var_pl, i_0_), true);
	    Class_kb.l.put((long) i_0_, var_f, 1);
	}
	return var_f;
    }
    
    static final void handlePlayerUpdateMasks(LoginStream stream, byte dummy) {
		if (dummy > -125)
		    h = 73;
		handlePlayerUpdateMasks++;
		for (int i_1_ = 0; vu.a > i_1_; i_1_++) {
		    int inScreenPlayerID = fca.f[i_1_];
		    Player p = Class_fc.playersInScreen[inScreenPlayerID];
		    int maskData = stream.readUnsignedByte(-9268);
		    if ((0x40 & maskData) != 0)
		    	maskData += stream.readUnsignedByte(-9268) << 8;
		    if ((0x400 & maskData) != 0)
		    	maskData += stream.readUnsignedByte(-9268) << 16;
		    dk.handlePlayerUpdateMasks(0, p, stream, maskData, inScreenPlayerID);
		}
    }
    
    public final void a(boolean bool, int i) {
	if (bool) {
	    int i_4_ = ff.width > baa.d ? ff.width : baa.d;
	    int i_5_ = Class_vb.r < eh.height ? eh.height : Class_vb.r;
	    int i_6_ = f.A();
	    int i_7_ = f.ca();
	    int i_8_ = 0;
	    int i_9_ = i_4_;
	    int i_10_ = i_4_ * i_7_ / i_6_;
	    int i_11_ = (i_5_ - i_10_) / 2;
	    if (i_5_ < i_10_) {
		i_10_ = i_5_;
		i_11_ = 0;
		i_9_ = i_5_ * i_6_ / i_7_;
		i_8_ = (i_4_ - i_9_) / 2;
	    }
	    f.a(i_8_, i_11_, i_9_, i_10_);
	}
	a++;
	if (i != 6621)
	    a(false, 26);
    }
    
    fq(pl var_pl, mk var_mk) {
	b = var_mk;
	g = var_pl;
    }
}
