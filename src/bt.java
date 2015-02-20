/* bt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bt
{
    static bt a = new bt(1);
    static int b;
    int c;
    static bt d = new bt(2);
    static int e;
    static bt f = new bt(4);
    static bt g = new bt(1);
    static bt h = new bt(2);
    static bt i = new bt(4);
    static bt j = new bt(2);
    static bt k = new bt(4);
    static GameOutPacket l = new GameOutPacket(33, 3);
    static String quitURL;
    static byte[] n = new byte[520];
    static GameOutPacket o = new GameOutPacket(3, -1);
    static int p;
    
    public static void a(int i) {
	k = null;
	h = null;
	d = null;
	f = null;
	n = null;
	bt.i = null;
	l = null;
	if (i != 18914)
	    a((int) 114);
	a = null;
	o = null;
	g = null;
	j = null;
	quitURL = null;
    }
    
    private bt(int i) {
	((bt) this).c = i;
    }
    
    public final String toString() {
	b++;
	throw new IllegalStateException();
    }
    
    static final void a(byte i) {
	e++;
	int i_0_ = -34 / ((-60 - i) / 62);
	for (int i_1_ = 0; je.i > i_1_; i_1_++) {
	    vt var_vt = tn.j[i_1_];
	    boolean bool = false;
	    if (((vt) var_vt).a != null) {
		if (!((vt) var_vt).a.g(-38))
		    bool = true;
	    } else {
		((vt) var_vt).k--;
		if (((vt) var_vt).k >= (var_vt.a(1) ? -1500 : -10)) {
		    if (((vt) var_vt).f == 1 && ((vt) var_vt).p == null) {
			((vt) var_vt).p = uea.a(jt.e, ((vt) var_vt).l, 0);
			if (((vt) var_vt).p == null)
			    continue;
			((vt) var_vt).k += ((vt) var_vt).p.b();
		    } else if (var_vt.a(1) && (((vt) var_vt).d == null
					       || ((vt) var_vt).n == null)) {
			if (((vt) var_vt).d == null)
			    ((vt) var_vt).d = go.a(sr.S, ((vt) var_vt).l);
			if (((vt) var_vt).d == null)
			    continue;
			if (((vt) var_vt).n == null) {
			    ((vt) var_vt).n
				= ((vt) var_vt).d.a(new int[] { 22050 });
			    if (((vt) var_vt).n == null)
				continue;
			}
		    }
		    if (((vt) var_vt).k < 0) {
			int i_2_;
			if (((vt) var_vt).g == 0)
			    i_2_ = ((vt) var_vt).o * (((vt) var_vt).f == 3
						      ? ((jb) cs.g).P
						      : ((jb) cs.g).I) >> 8;
			else {
			    int i_3_ = 0x3 & ((vt) var_vt).g >> 24;
			    if (((Animable) up.thisPlayer).height != i_3_)
				i_2_ = 0;
			    else {
				int i_4_ = 0x1fe00 & ((vt) var_vt).g << 9;
				int i_5_ = (0xff142f & ((vt) var_vt).g) >> 16;
				int i_6_ = (i_5_ << 9) + 256 - ((Animable) up.thisPlayer).locX;
				if (i_6_ < 0)
				    i_6_ = -i_6_;
				int i_7_ = (((vt) var_vt).g & 0xffe6) >> 8;
				int i_8_ = (i_7_ << 9) + 256 - ((Animable) up.thisPlayer).locY;
				if (i_8_ < 0)
				    i_8_ = -i_8_;
				int i_9_ = i_8_ - 512 + i_6_;
				if (i_9_ > i_4_) {
				    ((vt) var_vt).k = -99999;
				    continue;
				}
				if (i_9_ < 0)
				    i_9_ = 0;
				i_2_ = (((vt) var_vt).o
					* ((i_4_ - i_9_) * ((jb) cs.g).Y)
					/ i_4_) >> 8;
			    }
			}
			if (i_2_ > 0) {
			    oaa var_oaa = null;
			    if (((vt) var_vt).f == 1)
				var_oaa = ((vt) var_vt).p.c().a(kfa.o);
			    else if (var_vt.a(1))
				var_oaa = ((vt) var_vt).n;
			    hw var_hw
				= ((vt) var_vt).a = hw.a(var_oaa, 100, i_2_);
			    var_hw.l(((vt) var_vt).h - 1);
			    ej.r.b(var_hw);
			}
		    }
		} else
		    bool = true;
	    }
	    if (bool) {
		je.i--;
		for (int i_10_ = i_1_; i_10_ < je.i; i_10_++)
		    tn.j[i_10_] = tn.j[i_10_ + 1];
		i_1_--;
	    }
	}
	if (Class_jc.ib && !ir.a(true)) {
	    if (((jb) cs.g).N != 0 && ws.G != -1)
		Class_b.a(false, 0, ((jb) cs.g).N, mq.a, (byte) 107, ws.G);
	    Class_jc.ib = false;
	} else if (((jb) cs.g).N != 0 && ws.G != -1 && !ir.a(true)) {
	    dga.B++;
	    tba var_tba = jga.sendGameOutPacket(eo.i, pca.isaac, (byte) 76);
	    ((tba) var_tba).loginStream.writeInt(ws.G, (int) -105);
	    ud.a(var_tba, (byte) -36);
	    ws.G = -1;
	}
    }
}
