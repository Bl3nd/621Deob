/* sca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sca
{
    private pp[] a;
    private pp b;
    private int c;
    static int d;
    static int e;
    static int f;
    private long g;
    static int h;
    static GameInPacket i = new GameInPacket(97, -1);
    static int j = 0;
    static fh k = new fh(10, 3);
    static GameInPacket l = new GameInPacket(30, -1);
    static int[] m = { 1, -1, -1, 1 };
    
    final pp a(int i, long l) {
	g = l;
	e++;
	pp var_pp = a[(int) (l & (long) (i + c))];
	for (b = ((pp) var_pp).var_n; b != var_pp; b = ((pp) b).var_n) {
	    if (((pp) b).l == l) {
		pp var_pp_0_ = b;
		b = ((pp) b).var_n;
		return var_pp_0_;
	    }
	}
	b = null;
	return null;
    }
    
    final void a(long l, int i, pp var_pp) {
	h++;
	if (((pp) var_pp).o != null)
	    var_pp.a((byte) -101);
	pp var_pp_1_ = a[(int) (l & (long) (c - 1))];
	((pp) var_pp).var_n = var_pp_1_;
	((pp) var_pp).o = ((pp) var_pp_1_).o;
	((pp) ((pp) var_pp).o).var_n = var_pp;
	((pp) var_pp).l = l;
	int i_2_ = 39 / ((27 - i) / 51);
	((pp) ((pp) var_pp).var_n).o = var_pp;
    }
    
    sca(int i) {
	c = i;
	a = new pp[i];
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    pp var_pp = a[i_3_] = new pp();
	    ((pp) var_pp).o = var_pp;
	    ((pp) var_pp).var_n = var_pp;
	}
    }
    
    static final void a(int i, int i_4_, Interface[] var_kps, int i_5_, boolean bool,
			int i_6_) {
	f++;
	if (i_6_ <= -29) {
	    for (int i_7_ = 0; var_kps.length > i_7_; i_7_++) {
		Interface var_kp = var_kps[i_7_];
		if (var_kp != null && ((Interface) var_kp).parentID == i_5_) {
		    Class_ic.a(i, var_kp, 23054, bool, i_4_);
		    mga.a(i, i_4_, (byte) -127, var_kp);
		    if (((Interface) var_kp).hScroll > ((Interface) var_kp).maxHScroll - ((Interface) var_kp).minHScroll)
			((Interface) var_kp).hScroll = ((Interface) var_kp).maxHScroll - ((Interface) var_kp).minHScroll;
		    if (((Interface) var_kp).hScroll < 0)
			((Interface) var_kp).hScroll = 0;
		    if (((Interface) var_kp).maxVScroll - ((Interface) var_kp).minVScroll < ((Interface) var_kp).vScroll)
			((Interface) var_kp).vScroll = ((Interface) var_kp).maxVScroll - ((Interface) var_kp).minVScroll;
		    if (((Interface) var_kp).vScroll < 0)
			((Interface) var_kp).vScroll = 0;
		    if (((Interface) var_kp).type == 0)
			Class_kf.a(var_kp, false, bool);
		}
	    }
	}
    }
    
    public static void a(int i) {
	sca.i = null;
	l = null;
	int i_8_ = 29 / ((i + 43) / 63);
	m = null;
	k = null;
    }
    
    final pp b(int i) {
	d++;
	if (b == null)
	    return null;
	if (i != 23986)
	    return null;
	for (pp var_pp = a[(int) (g & (long) (c - 1))]; b != var_pp;
	     b = ((pp) b).var_n) {
	    if (g == ((pp) b).l) {
		pp var_pp_9_ = b;
		b = ((pp) b).var_n;
		return var_pp_9_;
	    }
	}
	b = null;
	return null;
    }
}
