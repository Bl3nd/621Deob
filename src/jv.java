/* jv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jv
{
    static int a;
    static int b;
    int c;
    static int d;
    static jv e = new jv(0, 3, bt.k);
    private bt f;
    static int g;
    static int h;
    int i;
    private int j;
    static jv k = new jv(1, 3, bt.k);
    static jv l = new jv(2, 4, bt.g);
    static jv m = new jv(3, 1, bt.k);
    static jv n = new jv(4, 2, bt.k);
    static jv o = new jv(5, 3, bt.k);
    static jv p = new jv(6, 4, bt.k);
    static int q = it.a(-24420, 16);
    static int r;
    static GameOutPacket s = new GameOutPacket(83, -1);
    static long t;
    static int[] u;
    
    public static void a(boolean bool) {
	o = null;
	m = null;
	k = null;
	n = null;
	s = null;
	p = null;
	if (bool == true) {
	    e = null;
	    l = null;
	    u = null;
	}
    }
    
    public final String toString() {
	h++;
	throw new IllegalStateException();
    }
    
    static final jv a(int i, int i_0_) {
	d++;
	if (i_0_ != 31974)
	    return null;
	int i_1_ = i;
    while_73_:
	do {
	while_72_:
	    do {
	    while_71_:
		do {
		while_70_:
		    do {
		    while_69_:
			do {
			    do {
				if (i_1_ != 0) {
				    if (i_1_ != 1) {
					if (i_1_ != 2) {
					    if (i_1_ != 3) {
						if (i_1_ != 4) {
						    if (i_1_ != 5) {
							if (i_1_ == 6)
							    break while_72_;
							break while_73_;
						    }
						} else
						    break while_70_;
						break while_71_;
					    }
					} else
					    break;
					break while_69_;
				    }
				} else
				    return e;
				return k;
			    } while (false);
			    return l;
			} while (false);
			return m;
		    } while (false);
		    return n;
		} while (false);
		return o;
	    } while (false);
	    return p;
	} while (false);
	return null;
    }
    
    static final boolean a(int i, int i_2_, int i_3_) {
	g++;
	if (!sda.a((byte) 85, i_3_, i_2_))
	    return false;
	if (kl.a((byte) 46, i_3_, i_2_) | (0x9000 & i_2_) != 0
	    | WorldSub.a(i_2_, i_3_, (byte) 36))
	    return true;
	if (i != 3)
	    t = 108L;
	return ((0x37 & i_3_) == 0
		& ((0x2000 & i_2_) != 0 | cj.a(i_3_, -545, i_2_)
		   | cea.a(i_3_, i_2_, -128)));
    }
    
    private jv(int i, int i_4_, bt var_bt) {
	((jv) this).i = i;
	j = i_4_;
	f = var_bt;
	((jv) this).c = j * ((bt) f).c;
	if (((jv) this).i >= 16)
	    throw new RuntimeException();
    }
    
    static final void a(pl var_pl, int i, int i_5_, int i_6_, int i_7_,
			boolean bool, int i_8_) {
	Class_vb.s = var_pl;
	uaa.e = i_8_;
	ifa.a = i_6_;
	pj.j = 1;
	ha.u = i;
	ISAAC.q = i_7_;
	a++;
	int i_9_ = 40 % ((i_5_ + 41) / 49);
	nj.m = bool;
    }
}
