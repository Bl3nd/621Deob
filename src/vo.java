/* vo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vo extends gga
{
    static int B;
    static int C;
    static int D;
    static int F;
    static int clientHeight;
    static int H = 0;
    static GameInPacket incomingPacket10 = new GameInPacket(10, 3);
    static BytesParser[] J = new BytesParser[2048];
    
    public static void b(boolean bool) {
	if (bool != true)
	    c((byte) -15);
	incomingPacket10 = null;
	J = null;
    }
    
    vo(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
	super(i, i_0_, i_1_, i_2_, i_3_, f);
    }
    
    static final void b(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_) {
	D++;
	int i_9_ = sl.a(i_7_, 4095, Class_md.h, Class_db.o);
	if (i_8_ != -1)
	    b(false);
	int i_10_ = sl.a(i_4_, 4095, Class_md.h, Class_db.o);
	int i_11_ = sl.a(i, 4095, vaa.xb, jga.v);
	int i_12_ = sl.a(i_5_, 4095, vaa.xb, jga.v);
	for (int i_13_ = i_9_; i_13_ <= i_10_; i_13_++)
	    kg.a(i_11_, wh.O[i_13_], i_6_, i_12_, 65);
    }
    
    final void a(int i, int i_14_, byte i_15_, int i_16_) {
	((gga) this).n = i_16_;
	((gga) this).o = i_14_;
	if (i_15_ <= -18) {
	    ((gga) this).z = i;
	    C++;
	}
    }
    
    static final void c(byte i) {
	F++;
	if (ba.c && i == 31) {
	    Interface var_kp = ida.a(tm.t, qda.G, (byte) 64);
	    if (var_kp != null && ((Interface) var_kp).E != null) {
		ClientScript var_mea = new ClientScript();
		((ClientScript) var_mea).objects = ((Interface) var_kp).E;
		((ClientScript) var_mea).interface_ = var_kp;
		ClientScriptHandler.activateClientScript(var_mea);
	    }
	    da.e = -1;
	    ba.c = false;
	    th.i = -1;
	    if (var_kp != null)
		tn.a(var_kp, 1023);
	}
    }
    
    final void a(int i, float f) {
	if (i != 0)
	    incomingPacket10 = null;
	B++;
	((gga) this).r = f;
    }
}
