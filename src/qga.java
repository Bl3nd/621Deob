/* qga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class qga implements oc
{
    static GameOutPacket a = new GameOutPacket(15, -1);
    ct b;
    int c;
    static int d;
    rc e;
    static int f;
    int g;
    int h;
    static Class_q i;
    
    static final void a(int i, dr var_dr, int i_0_, int i_1_, int i_2_,
			int i_3_, boolean bool) {
	d++;
	if (je.i < 50 && (var_dr != null && ((dr) var_dr).j != null
			  && i_3_ < ((dr) var_dr).j.length
			  && ((dr) var_dr).j[i_3_] != null)) {
	    int i_4_ = ((dr) var_dr).j[i_3_][0];
	    if (i_2_ <= 58)
		a = null;
	    int i_5_ = i_4_ >> 8;
	    int i_6_ = (i_4_ & 0xea) >> 5;
	    if (((dr) var_dr).j[i_3_].length > 1) {
		int i_7_ = (int) (Math.random()
				  * (double) ((dr) var_dr).j[i_3_].length);
		if (i_7_ > 0)
		    i_5_ = ((dr) var_dr).j[i_3_][i_7_];
	    }
	    int i_8_ = 0x1f & i_4_;
	    if (i_8_ == 0) {
		if (bool) {
		    if (((dr) var_dr).u)
			oh.a(i_5_, i_6_, 0, false, 255, false);
		    else
			io.a(255, i_5_, i_6_, 0, 29830);
		}
	    } else if (((jb) cs.g).Y != 0) {
		int i_9_ = i_0_ - 256 >> 9;
		int i_10_ = i_1_ - 256 >> 9;
		tn.j[je.i++]
		    = new vt(!((dr) var_dr).u ? (byte) 1 : (byte) 2, i_5_,
			     i_6_, 0, 255,
			     i_8_ + ((i << 24) + (i_9_ << 16) + (i_10_ << 8)));
	    }
	}
    }
    
    public static void b(int i) {
	a = null;
	if (i < 110)
	    qga.i = null;
	qga.i = null;
    }
    
    public wea a(int i) {
	if (i < 38)
	    qga.i = null;
	f++;
	return dh.c;
    }
    
    static final void a() {
	for (;;) {
	    boolean bool = true;
	    for (int i = 0; i < vk.i.length; i++) {
		if (!vk.i[i].c()) {
		    synchronized (vk.i[i]) {
			vk.i[i].notify();
		    }
		    bool = false;
		} else
		    jj.l[i] = vk.i[i].e();
	    }
	    if (bool)
		break;
	    try {
		Connection.a(-28448, 1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	vk.i[vk.i.length - 1].b();
	mga.c(1);
	for (;;) {
	    boolean bool = true;
	    for (int i = 0; i < vk.i.length - 1; i++) {
		if (!vk.i[i].c()) {
		    synchronized (vk.i[i]) {
			vk.i[i].notify();
		    }
		    bool = false;
		}
	    }
	    if (bool)
		break;
	    try {
		Connection.a(-28448, 1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	for (int i = 1; i < vk.i.length - 2; i++)
	    vk.i[i].b();
	mga.c(2);
	while (!vk.i[0].c()) {
	    synchronized (vk.i[0]) {
		vk.i[0].notify();
	    }
	    try {
		Connection.a(-28448, 1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	vk.i[0].b();
    }
    
    qga(int i, ct var_ct, rc var_rc, int i_11_, int i_12_) {
	((qga) this).c = i;
	((qga) this).h = i_11_;
	((qga) this).g = i_12_;
	((qga) this).b = var_ct;
	((qga) this).e = var_rc;
    }
}
