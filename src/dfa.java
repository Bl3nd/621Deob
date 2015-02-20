/* dfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class dfa extends Animable
{
    static int w;
    short x;
    static int y;
    static int z;
    static int A;
    static int B;
    static int D;
    static int E;
    static GameInPacket F = new GameInPacket(5, 4);
    static int G;
    static int I;
    
    static final void i(byte i) {
	if (i > 77) {
	    z++;
	    synchronized (hv.p) {
		hv.p.c((byte) 60);
	    }
	}
    }
    
    final boolean f(int i) {
	if (i != 4095)
	    a(1, -123);
	y++;
	return (vd.O[FileOnDisk.k + ((((Animable) this).locX >> Class_fb.a) - n.e)]
		[(((Animable) this).locY >> Class_fb.a) + (FileOnDisk.k - fm.i)]);
    }
    
    static final void h(int i) {
	pu.m.a(i + 18257);
	if (i == 128)
	    B++;
    }
    
    final int a(gga[] var_ggas, int i) {
	int i_0_ = -19 % ((i + 87) / 32);
	w++;
	return this.a((byte) 66, var_ggas, ((Animable) this).locX >> Class_fb.a,
		      ((Animable) this).locY >> Class_fb.a);
    }
    
    dfa(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
	((dfa) this).x = (short) i_5_;
	((Animable) this).j = i_1_;
	((Animable) this).locX = i;
	((Animable) this).locY = i_2_;
	((Animable) this).height = (byte) i_3_;
	((Animable) this).h = (byte) i_4_;
    }
    
    final boolean f(byte i) {
	if (i <= 111)
	    i((byte) -40);
	A++;
	return vk.a(((Animable) this).h, ((Animable) this).locX >> Class_fb.a, -1,
		    ((Animable) this).locY >> Class_fb.a);
    }
    
    public static void j(byte i) {
	F = null;
	if (i != -72)
	    h((int) 115);
    }
    
    static final void i(int i) {
	if (i != -6899)
	    h((int) -53);
	if (cga.x == null) {
	    ke var_ke = new ke();
	    byte[] is = var_ke.a((int) 0, 128, 128, 16);
	    cga.x = kg.a(-137, is, false);
	}
	D++;
	if (pda.q == null) {
	    ws var_ws = new ws();
	    byte[] is = var_ws.a(12743, 16, 128, 128);
	    pda.q = kg.a(-137, is, false);
	}
    }
    
    static final int a(int i, int i_6_) {
	if (i_6_ != 128)
	    return 40;
	E++;
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return i + 1;
    }
}
