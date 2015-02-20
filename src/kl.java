/* kl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class kl
{
    static int a;
    static int b;
    static int c;
    static int d;
    static pk e = new pk("WTI", 5);
    static int f;
    static int g;
    static pl h;
    static boolean[][] i;
    static th j;
    static int[] k;
    static int[] l = new int[1];
    
    static final int a(int i) {
	b++;
	if (i != -1)
	    h = null;
	return 19;
    }
    
    static final boolean a(int i, int i_0_, int i_1_) {
	a++;
	if (!uca.a(2048, i_1_, i))
	    return false;
	if (i_0_ != 55)
	    a((byte) 1, -125, -116);
	if ((0xb000 & i) != 0 | tl.a(i, i_1_, 14031) | Class_b.a(i_1_, i, 0))
	    return true;
	return ((i_1_ & 0x37) == 0
		& (Class_q.a(i_1_, 116, i) | nh.a(i_1_, i_0_ + 10, i)));
    }
    
    static final void a(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			boolean bool, int i_6_, int i_7_) {
	if (vaa.xb > i || jga.v < i_2_ || i_4_ < Class_md.h
	    || i_5_ > Class_db.o)
	    kv.a(i_3_, i_5_, 28443, i_2_, i_7_, i, i_6_, i_4_);
	else
	    nu.a(i_2_, i_4_, i_6_, i_5_, i_7_, (byte) 100, i_3_, i);
	d++;
	if (bool != false)
	    a((byte) -29, -2, 9, -105, 67);
    }
    
    public static void a(byte i) {
	h = null;
	l = null;
	e = null;
	k = null;
	kl.i = null;
	j = null;
	if (i < 40)
	    a(54, 16, -22, 124, 101, false, -27, 14);
    }
    
    static final void a(byte i, int i_8_, int i_9_, int i_10_, int i_11_) {
	g++;
	qba var_qba = ofa.a(10, i_10_, (byte) -109);
	var_qba.c((byte) 11);
	if (i != -119)
	    l = null;
	((qba) var_qba).A = i_8_;
	((qba) var_qba).t = i_9_;
	((qba) var_qba).v = i_11_;
    }
    
    static final void b(int i) {
	if (i >= -96)
	    b(27);
	f++;
	int i_12_ = cs.g.f(-111, on.performance);
	if (i_12_ == 0) {
	    Interactable.e = null;
	    ba.a(1000, 0);
	} else if (i_12_ == 1) {
	    Class_pb.b(4319, (byte) 0);
	    ba.a(1000, 512);
	    if (tu.b != null)
		nw.a((byte) -47);
	} else {
	    Class_pb.b(4319, (byte) (sh.j - 4 & 0xff));
	    ba.a(1000, 2);
	}
	rq.K = vo.clientHeight;
    }
    
    static final boolean a(byte i, int i_13_, int i_14_) {
	if (i != 46)
	    h = null;
	c++;
	if ((0x84080 & i_14_) == 0)
	    return false;
	return true;
    }
    
    static {
	k = new int[8];
    }
}
