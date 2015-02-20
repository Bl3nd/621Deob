/* jt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

abstract class jt
{
    static il a;
    static int b = -1;
    static GameInPacket c;
    static int d;
    static pl e;
    static int f;
    
    static final Frame a(int i, byte i_0_, int i_1_, int i_2_, Signlink var_rj,
			 int i_3_) {
	d++;
	if (!var_rj.a(false))
	    return null;
	if (i == 0) {
	    ro[] var_ros = Class_gb.a(var_rj, i_0_ ^ 0x71);
	    if (var_ros == null)
		return null;
	    boolean bool = false;
	    for (int i_4_ = 0; i_4_ < var_ros.length; i_4_++) {
		if (((ro) var_ros[i_4_]).d == i_3_
		    && i_1_ == ((ro) var_ros[i_4_]).a
		    && (i_2_ == 0 || ((ro) var_ros[i_4_]).b == i_2_)
		    && (!bool || ((ro) var_ros[i_4_]).f > i)) {
		    bool = true;
		    i = ((ro) var_ros[i_4_]).f;
		}
	    }
	    if (!bool)
		return null;
	}
	vfa var_vfa = var_rj.a(i_2_, i, (byte) -94, i_3_, i_1_);
	while (var_vfa.f == 0)
	    Connection.a(-28448, 10L);
	if (i_0_ != 7)
	    e = null;
	Frame frame = (Frame) var_vfa.hostName;
	if (frame == null)
	    return null;
	if (var_vfa.f == 2) {
	    iga.a(frame, var_rj, false);
	    return null;
	}
	return frame;
    }
    
    public static void a(byte i) {
	e = null;
	int i_5_ = -2 % ((-40 - i) / 59);
	c = null;
	a = null;
    }
    
    static final void a(boolean bool, int i) {
	od.U++;
	if (i != -1)
	    a(-82, (byte) -82, 51, 1, null, -84);
	f++;
	tba var_tba = jga.sendGameOutPacket(hm.i, pca.isaac, (byte) 112);
	ud.a(var_tba, (byte) -36);
	for (tt var_tt = (tt) ida.l.b((byte) 124); var_tt != null;
	     var_tt = (tt) ida.l.b(12561)) {
	    if (!var_tt.g(123)) {
		var_tt = (tt) ida.l.b((byte) 124);
		if (var_tt == null)
		    break;
	    }
	    if (((tt) var_tt).k == 0)
		vm.a(bool, true, false, var_tt);
	}
	if (rd.D != null) {
	    tn.a(rd.D, 1023);
	    rd.D = null;
	}
    }
    
    public jt() {
	/* empty */
    }
    
    static {
	a = new il(64);
    }
}
