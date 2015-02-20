/* di - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class di implements lv
{
    static int a;
    static GameOutPacket b = new GameOutPacket(73, -1);
    static int c;
    static int[] d = new int[1];
    static GameInPacket incomingPacket72;
    static String[] f = new String[200];
    
    public static void a(byte i) {
	if (i < -43) {
	    f = null;
	    d = null;
	    incomingPacket72 = null;
	    b = null;
	}
    }
    
    public di() {
	/* empty */
    }
    
    static final byte[] a(byte i, int i_0_, byte[] is) {
	if (i >= -72)
	    return null;
	a++;
	byte[] is_1_ = new byte[i_0_];
	co.a(is, 0, is_1_, 0, i_0_);
	return is_1_;
    }
    
    public final String a(long l, int[] is, int i, baa var_baa) {
	int i_2_ = -21 / ((i + 33) / 37);
	c++;
	if (var_baa == nt.c) {
	    ss var_ss = tv.e.a(is[0], -8727);
	    return var_ss.d(-24908, (int) l);
	}
	if (var_baa == client.gb || var_baa == qm.a) {
	    ItemDef var_uv = laa.itemDefLoader.d(12388, (int) l);
	    return ((ItemDef) var_uv).itemName;
	}
	if (bq.c == var_baa || ku.j == var_baa || var_baa == lp.k)
	    return tv.e.a(is[0], -8727).d(-24908, (int) l);
	return null;
    }
    
    static final void a(int i, int i_3_, int i_4_, lca var_lca,
			lca var_lca_5_) {
	vf var_vf = lh.a(i, i_3_, i_4_);
	if (var_vf != null) {
	    ((vf) var_vf).d = var_lca;
	    ((vf) var_vf).p = var_lca_5_;
	    int i_6_ = Class_q.b == wr.D ? 1 : 0;
	    if (var_lca.g((byte) 117)) {
		if (var_lca.e((byte) 23))
		    lm.Nh[i_6_][fg.a[i_6_]++] = var_lca;
		else
		    aaa.k[i_6_][baa.l[i_6_]++] = var_lca;
	    } else
		cca.d[i_6_][cc.f[i_6_]++] = var_lca;
	    if (var_lca_5_ != null) {
		if (var_lca_5_.g((byte) 122)) {
		    if (var_lca_5_.e((byte) 23))
			lm.Nh[i_6_][fg.a[i_6_]++] = var_lca_5_;
		    else
			aaa.k[i_6_][baa.l[i_6_]++] = var_lca_5_;
		} else
		    cca.d[i_6_][cc.f[i_6_]++] = var_lca_5_;
	    }
	}
    }
    
    static {
	incomingPacket72 = new GameInPacket(72, 3);
    }
}
