/* bfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bfa extends Node
{
    String k;
    static baa l = new baa(2, 4, 4, 0);
    boolean m;
    long n;
    int o;
    String p;
    int q;
    int r;
    int s;
    static int t;
    static int u;
    int v;
    static float w;
    static int x;
    static int y;
    boolean z;
    static int A;
    static int thisPlayersRegionX;
    static long C = 0L;
    static int D;
    
    static final void a(byte i) {
	synchronized (tw.l) {
	    for (int i_0_ = 0; i_0_ < tw.l.length; i_0_++) {
		tw.l[i_0_] = new fca();
		World.k[i_0_] = 0;
	    }
	}
	if (i != -103)
	    l = null;
	u++;
    }
    
    static final void a(int i, Entity var_ni, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
	if (i_3_ != 4)
	    A = 74;
	pfa.a(i, ((Animable) var_ni).locY, 0, -121, i_5_, i_4_, ((Animable) var_ni).height, i_1_,
	      i_2_, ((Animable) var_ni).locX);
	x++;
    }
    
    public static void b(byte i) {
	if (i == 29)
	    l = null;
    }
    
    static final String a(int i, int i_6_, long l, boolean bool, int i_7_) {
	t++;
	if (i_6_ != 7110)
	    return null;
	char c = ',';
	char c_8_ = '.';
	if (i == 0) {
	    c = '.';
	    c_8_ = ',';
	}
	if (i == 2)
	    c_8_ = '\u00a0';
	boolean bool_9_ = false;
	if (l < 0L) {
	    l = -l;
	    bool_9_ = true;
	}
	StringBuffer stringbuffer = new StringBuffer(26);
	if (i_7_ > 0) {
	    for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
		int i_11_ = (int) l;
		l /= 10L;
		stringbuffer.append((char) (i_11_ + 48 - 10 * (int) l));
	    }
	    stringbuffer.append(c);
	}
	int i_12_ = 0;
	for (;;) {
	    int i_13_ = (int) l;
	    l /= 10L;
	    stringbuffer.append((char) (i_13_ - 10 * (int) l + 48));
	    if (l == 0L)
		break;
	    if (bool && ++i_12_ % 3 == 0)
		stringbuffer.append(c_8_);
	}
	if (bool_9_)
	    stringbuffer.append('-');
	return stringbuffer.reverse().toString();
    }
    
    bfa(String string, String string_14_, int i, int i_15_, int i_16_, long l,
	int i_17_, int i_18_, boolean bool, boolean bool_19_) {
	((bfa) this).r = i_17_;
	((bfa) this).m = bool_19_;
	((bfa) this).q = i_18_;
	((bfa) this).o = i_16_;
	((bfa) this).k = string;
	((bfa) this).s = i;
	((bfa) this).v = i_15_;
	((bfa) this).p = string_14_;
	((bfa) this).z = bool;
	((bfa) this).n = l;
    }
    
    static {
	A = 0;
	D = 0;
    }
}
