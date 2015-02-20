/* iga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class iga
{
    static int a;
    static int b;
    static int c;
    static int d;
    char e;
    static int f;
    static f g;
    int h = 1;
    static GameOutPacket outgoingPacket45 = new GameOutPacket(45, 1);
    static Class_ae j = new Class_ae();
    static boolean k = false;
    
    public static void a(int i) {
	if (i != 81)
	    a(null, null, false);
	j = null;
	iga.outgoingPacket45 = null;
	g = null;
    }
    
    private final void a(boolean bool, int i, BytesParser var_es) {
	if (i == 1)
	    ((iga) this).e = eq.a((byte) 115, var_es.readByte(-20933));
	else if (i == 2)
	    ((iga) this).h = 0;
	d++;
	if (bool != false)
	    b(-33);
    }
    
    final void a(byte i, BytesParser var_es) {
	if (i < 59)
	    iga.outgoingPacket45 = null;
	for (;;) {
	    int i_0_ = var_es.readUnsignedByte(-9268);
	    if (i_0_ == 0)
		break;
	    a(false, i_0_, var_es);
	}
	a++;
    }
    
    static final void b(int i) {
	f++;
	if (i != 2)
	    b(-113);
	ew var_ew = (ew) qt.F.a((int) 93);
	boolean bool = kr.a != null || bg.e > 0;
	if (bool)
	    Class_ad.h = 1;
	if (vh.a && uc.c.a((byte) -68, (int) 81) && mu.j > 2) {
	    if (bool)
		ej.q = (bfa) ((Node) ((Node) ((Class_ae) oba.I).o).next).next;
	    else
		un.a(i - 2, var_ew.a(true),
		     (bfa) ((Node) ((Node) ((Class_ae) oba.I).o).next).next,
		     var_ew.a(i + 7));
	} else if (bool)
	    ej.q = (bfa) ((Node) ((Class_ae) oba.I).o).next;
	else
	    un.a(0, var_ew.a(true), (bfa) ((Node) ((Class_ae) oba.I).o).next,
		 var_ew.a(9));
    }
    
    public iga() {
	/* empty */
    }
    
    static final void a(Frame frame, Signlink var_rj, boolean bool) {
	c++;
	for (;;) {
	    vfa var_vfa = var_rj.a(frame, (byte) -36);
	    while (var_vfa.f == 0)
		Connection.a(-28448, 10L);
	    if (var_vfa.f == 1)
		break;
	    Connection.a(-28448, 100L);
	}
	frame.setVisible(bool);
	frame.dispose();
    }
}
