/* lca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class lca extends Animable
{
    static int w;
    short x;
    static int y;
    static int z;
    static int A;
    static int B;
    static int C;
    static byte[][] D;
    short E;
    static int F;
    static int G;
    
    final boolean h(byte i) {
	G++;
	if (i > -26)
	    ((lca) this).E = (short) -67;
	return false;
    }
    
    final int a(gga[] var_ggas, int i) {
	int i_0_ = 97 % ((-87 - i) / 32);
	A++;
	return this.a((byte) 111, var_ggas, ((Animable) this).locX >> Class_fb.a,
		      ((Animable) this).locY >> Class_fb.a);
    }
    
    final boolean f(byte i) {
	if (i < 111)
	    D = null;
	z++;
	return ik.a(this.g((int) 116), ((Animable) this).h,
		    ((Animable) this).locY >> Class_fb.a, ((Animable) this).locX >> Class_fb.a,
		    55);
    }
    
    final boolean f(int i) {
	if (i != 4095)
	    h((byte) 112);
	F++;
	return (vd.O[FileOnDisk.k - n.e + (((Animable) this).locX >> Class_fb.a)]
		[FileOnDisk.k + ((((Animable) this).locY >> Class_fb.a) - fm.i)]);
    }
    
    final void d(int i) {
	y++;
	if (i != -1)
	    ((lca) this).x = (short) -1;
	throw new IllegalStateException();
    }
    
    static final void a(int i, int i_1_) {
	B++;
	pda.y = i;
	jl.s = 2;
	long l = (long) i_1_;
	if (uo.ssKey != null) {
	    BytesParser var_es = new BytesParser(uf.a(fu.a((byte) 100, uo.ssKey), i_1_ ^ 0x10));
	    l = var_es.readLong(false);
	    bba.S = var_es.readLong(false);
	} else {
	    fda.a((byte) 117, 35);
	    return;
	}
	dq.a(true, "", i_1_ ^ 0x7a, kba.a((byte) -67, l));
    }
    
    public static void h(int i) {
	if (i == 35)
	    D = null;
    }
    
    final void a(boolean bool, int i, byte i_2_, Class_r class_r, Animable var_lo,
		 int i_3_, int i_4_) {
	int i_5_ = 126 / ((-50 - i_2_) / 55);
	C++;
	throw new IllegalStateException();
    }
    
    lca(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
	((Animable) this).h = (byte) i_9_;
	((Animable) this).locY = i_7_;
	((lca) this).x = (short) i_11_;
	((Animable) this).j = i_6_;
	((lca) this).E = (short) i_10_;
	((Animable) this).locX = i;
	((Animable) this).height = (byte) i_8_;
    }
}
