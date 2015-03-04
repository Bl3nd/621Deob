/* jga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class jga extends uc
{
    static int i;
    static int j;
    static int k;
    private Class_fb l;
    static int m;
    static int n;
    static GameOutPacket o = new GameOutPacket(63, -1);
    static int[] p = { 1, 0, -1, 0 };
    static int q;
    static ct r = new ct();
    static int s;
    static int t;
    private pea u;
    static int v = 100;
    
    final void a(int i, boolean bool) {
	if (i <= -64)
	    k++;
    }
    
    final void a(int i, int i_0_, rg var_rg) {
	t++;
	((uc) this).h.a(var_rg, -2);
	if (i_0_ != 7)
	    s = -88;
	((uc) this).h.c(false, i);
    }
    
    static final tba sendGameOutPacket(GameOutPacket packet, ISAAC var_hr, byte i) {
    	Console.printPacketActivation("GameOutPacket: "+packet.getPacketID()+", "+packet.packetSize);
		jga.i++;
		int i_1_ = -117 % ((10 - i) / 63);
		tba var_tba = ItemDefLoader.a(18375);
		((tba) var_tba).l = packet;
		((tba) var_tba).s = ((GameOutPacket) packet).packetSize;
		if ((((tba) var_tba).s ^ 0xffffffff) == 0)
		    ((tba) var_tba).loginStream = new LoginStream(260);
		else if (((tba) var_tba).s == -2)
		    ((tba) var_tba).loginStream = new LoginStream(10000);
		else if (((tba) var_tba).s > 18) {
		    if (((tba) var_tba).s <= 98)
			((tba) var_tba).loginStream = new LoginStream(100);
		    else
			((tba) var_tba).loginStream = new LoginStream(260);
		} else
		    ((tba) var_tba).loginStream = new LoginStream(20);
		((tba) var_tba).loginStream.a(var_hr);
		((tba) var_tba).loginStream.n(26951, ((tba) var_tba).l.getPacketID());
		((tba) var_tba).m = 0;
		return var_tba;
    }
    
    final void a(int i, int i_2_, int i_3_) {
	n++;
	float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
	float f_4_ = (float) ((0x3 & i >> 3) + 1) * 5.0E-4F;
	float f_5_ = (0x40 & i) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((uc) this).h.b((int) 1, true);
	if (!bool) {
	    Player.Qd[1] = 0.0F;
	    Player.Qd[2] = f_5_;
	    Player.Qd[0] = 0.0F;
	    Player.Qd[3] = 0.0F;
	} else {
	    Player.Qd[2] = 0.0F;
	    Player.Qd[0] = f_5_;
	    Player.Qd[1] = 0.0F;
	    Player.Qd[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, Player.Qd, 0);
	Player.Qd[1] = f_5_;
	Player.Qd[3] = f * (float) ((qj) ((uc) this).h).je % 1.0F;
	Player.Qd[2] = 0.0F;
	Player.Qd[0] = 0.0F;
	OpenGL.glTexGenfv(8193, 9474, Player.Qd, 0);
	if (i_2_ != 50)
	    sendGameOutPacket((GameOutPacket) null, null, (byte) 105);
	if (((pea) u).a) {
	    Player.Qd[3] = (float) ((qj) ((uc) this).h).je * f_4_ % 1.0F;
	    Player.Qd[0] = 0.0F;
	    Player.Qd[2] = 0.0F;
	    Player.Qd[1] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, Player.Qd, 0);
	} else {
	    int i_6_ = (int) ((float) ((qj) ((uc) this).h).je * f_4_ * 16.0F);
	    ((uc) this).h.a(((pea) u).b[i_6_ % 16], -2);
	}
	((uc) this).h.b((int) 0, true);
    }
    
    final boolean a(byte i) {
	q++;
	if (i > -93)
	    return false;
	return true;
    }
    
    final void b(int i, boolean bool) {
	int i_7_ = 37 / ((i - 65) / 60);
	m++;
	l.a(-29240, '\0');
	if (((pea) u).a) {
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.a(((pea) u).f, -2);
	    ((uc) this).h.b((int) 0, true);
	}
    }
    
    final void a(int i) {
	j++;
	if (i != 1268)
	    sendGameOutPacket((GameOutPacket) null, null, (byte) 21);
	l.a(-29240, '\001');
	((uc) this).h.b((int) 1, true);
	((uc) this).h.a((rg) null, -2);
	((uc) this).h.b((int) 0, true);
    }
    
    jga(qj var_qj, pea var_pea) {
	super(var_qj);
	u = var_pea;
	l = new Class_fb(var_qj, 2);
	l.a(0, 0);
	((uc) this).h.b((int) 1, true);
	if (((pea) u).a) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glEnable(3170);
	}
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	((uc) this).h.b((int) 0, true);
	l.a((byte) 32);
	l.a(1, 0);
	((uc) this).h.b((int) 1, true);
	if (((pea) u).a)
	    OpenGL.glDisable(3170);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((uc) this).h.b((int) 0, true);
	l.a((byte) 61);
    }
    
    public static void d(byte i) {
	p = null;
	if (i >= 117) {
	    o = null;
	    r = null;
	}
    }
}
