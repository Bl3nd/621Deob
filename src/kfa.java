/* kfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kfa
{
    static GameOutPacket a;
    private rg b = null;
    private pea c;
    private int d = 0;
    private qj e;
    static int f;
    static long g = -1L;
    private int h = 0;
    static int i;
    private uc[] j;
    static int k;
    private int l = 0;
    un m;
    static World world;
    static ui o;
    static lt p;
    
    final boolean a(int i, rg var_rg, int i_0_) {
	kfa.i++;
	if (i != -27079)
	    return false;
	if (d == 0)
	    return false;
	if (b != var_rg) {
	    j[0x7fffffff & d].a(i_0_, 7, var_rg);
	    b = var_rg;
	}
	return true;
    }
    
    public static void a(byte i) {
	o = null;
	a = null;
	if (i != -19)
	    a((byte) 86);
	world = null;
	p = null;
    }
    
    final boolean a(int i, int i_1_) {
	k++;
	if (i != -9)
	    ((kfa) this).m = null;
	return j[i_1_].a((byte) -106);
    }
    
    final void a(boolean bool, boolean bool_2_, int i, int i_3_, int i_4_,
		 int i_5_) {
	bool_2_ &= e.e();
	f++;
	if (!bool_2_ && (i_5_ == 4 || i_5_ == 8 || i_5_ == 9)) {
	    if (i_5_ == 4)
		i_4_ = i_3_;
	    i_5_ = 2;
	}
	if (i > -120)
	    a(-19, null, -117);
	if (i_5_ != 0 && bool)
	    i_5_ |= ~0x7fffffff;
	if (i_5_ != d) {
	    if (d != 0)
		j[d & 0x7fffffff].a(1268);
	    if (i_5_ != 0) {
		j[i_5_ & 0x7fffffff].b(-22, bool);
		j[i_5_ & 0x7fffffff].a(-89, bool);
		j[0x7fffffff & i_5_].a(i_3_, 50, i_4_);
	    }
	    l = i_3_;
	    h = i_4_;
	    d = i_5_;
	    b = null;
	} else if (d != 0) {
	    j[0x7fffffff & d].a(-119, bool);
	    if (i_3_ != l || h != i_4_) {
		j[0x7fffffff & d].a(i_3_, 50, i_4_);
		h = i_4_;
		l = i_3_;
	    }
	}
    }
    
    kfa(qj var_qj) {
	e = var_qj;
	c = new pea(var_qj);
	j = new uc[10];
	j[1] = new wf(var_qj);
	j[2] = new lu(var_qj, c);
	j[4] = new jr(var_qj, c);
	j[5] = new jga(var_qj, c);
	j[6] = new eo(var_qj);
	j[7] = new vv(var_qj);
	j[3] = ((kfa) this).m = new un(var_qj);
	j[8] = new gi(var_qj, c);
	j[9] = new qw(var_qj, c);
	if (!j[8].a((byte) -119))
	    j[8] = j[4];
	if (!j[9].a((byte) -102))
	    j[9] = j[8];
    }
    
    static {
	a = new GameOutPacket(7, 8);
	p = new lt();
    }
}
