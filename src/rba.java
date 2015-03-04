/* rba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class rba implements ica
{
    static GameInPacket smallConfigPacket;
    private pl b;
    f c;
    static boolean d = false;
    static int e;
    static int f;
    qga g;
    static int h;
    static int i = 0;
    static int j;
    static int k;
    static int l;
    static int m;
    
    public static void b(int i) {
	smallConfigPacket = null;
	if (i != 14793)
	    a((Animable) null);
    }
    
    public final boolean a(byte i) {
	if (i != 82)
	    return false;
	h++;
	return b.g(1912, ((qga) ((rba) this).g).c);
    }
    
    static final void a(Animable var_lo) {
	if (var_lo != null) {
	    for (int i = 0; i < 2; i++) {
		for (int i_0_ = 0; i_0_ < baa.l[i]; i_0_++) {
		    if (aaa.animables[i][i_0_] == var_lo) {
			co.a(aaa.animables[i], i_0_ + 1, aaa.animables[i], i_0_,
			     baa.l[i] - i_0_ - 1);
			baa.l[i]--;
			return;
		    }
		}
		for (int i_1_ = 0; i_1_ < fg.a[i]; i_1_++) {
		    if (lm.Nh[i][i_1_] == var_lo) {
			co.a(lm.Nh[i], i_1_ + 1, lm.Nh[i], i_1_,
			     fg.a[i] - i_1_ - 1);
			fg.a[i]--;
			return;
		    }
		}
		for (int i_2_ = 0; i_2_ < cc.f[i]; i_2_++) {
		    if (InputStreamSub_1.d[i][i_2_] == var_lo) {
			co.a(InputStreamSub_1.d[i], i_2_ + 1, InputStreamSub_1.d[i], i_2_,
			     cc.f[i] - i_2_ - 1);
			cc.f[i]--;
			return;
		    }
		}
	    }
	}
    }
    
    public final void a(int i) {
	k++;
	((rba) this).c = fq.a(b, 1024, ((qga) ((rba) this).g).c);
	if (i > -41)
	    a(false, -112);
    }
    
    public void a(boolean bool, int i) {
	if (bool) {
	    int i_3_
		= (((qga) ((rba) this).g).b.a(baa.d, ((rba) this).c.A(), 2)
		   + ((qga) ((rba) this).g).h);
	    int i_4_ = (((qga) ((rba) this).g).e.a(Class_vb.r,
						   ((rba) this).c.ca(), -87)
			+ ((qga) ((rba) this).g).g);
	    ((rba) this).c.a(i_3_, i_4_);
	}
	j++;
	if (i != 6621)
	    m = -81;
    }
    
    rba(pl var_pl, qga var_qga) {
	((rba) this).g = var_qga;
	b = var_pl;
    }
    
    static {
	smallConfigPacket = new GameInPacket(35, 3);
	l = 0;
	m = 0;
    }
}
