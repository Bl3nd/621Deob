/* wr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class wr extends Animable
{
    static int w;
    static float x;
    static int y;
    static int z;
    static int A;
    static int B;
    static int C;
    static Class_i[] D;
    static int E;
    
    final int a(gga[] var_ggas, int i) {
	z++;
	int i_0_ = 74 / ((i + 87) / 32);
	return this.a((byte) 113, var_ggas, ((Animable) this).locX >> Class_fb.a,
		      ((Animable) this).locY >> Class_fb.a);
    }
    
    final void d(int i) {
	if (i != -1)
	    a(-91, 22, 123, -58, 66, false);
	w++;
	throw new IllegalStateException();
    }
    
    static final void a(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			boolean bool) {
	if (bool == true) {
	    B++;
	    if (((jb) cs.g).I != 0 && i_3_ != 0 && je.i < 50
		&& (i_1_ ^ 0xffffffff) != 0)
		tn.j[je.i++] = new vt((byte) 1, i_1_, i_3_, i, i_4_, i_2_);
	}
    }
    
    final boolean h(byte i) {
	if (i >= -26)
	    return false;
	C++;
	return false;
    }
    
    final boolean f(byte i) {
	E++;
	if (i <= 111)
	    a((gga[]) null, 62);
	ida var_ida = PlayerUpdateLocation.a(((Animable) this).height, ((Animable) this).locX >> Class_fb.a,
            ((Animable) this).locY >> Class_fb.a);
	if (var_ida == null || !((qda) ((ida) var_ida).a).w)
	    return vk.a(((Animable) this).height, ((Animable) this).locX >> Class_fb.a, -1,
			((Animable) this).locY >> Class_fb.a);
	return ik.a(((ida) var_ida).a.g((int) 40) + this.g((int) -109),
		    ((Animable) this).height, ((Animable) this).locY >> Class_fb.a,
		    ((Animable) this).locX >> Class_fb.a, 27);
    }
    
    wr(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
	((Animable) this).height = (byte) i_7_;
	((Animable) this).locY = i_6_;
	((Animable) this).locX = i;
	((Animable) this).j = i_5_;
	((Animable) this).h = (byte) i_8_;
    }
    
    final boolean f(int i) {
	A++;
	if (i != 4095)
	    return false;
	return (vd.O[(((Animable) this).locX >> Class_fb.a) - (n.e - FileOnDisk.k)]
		[FileOnDisk.k + ((((Animable) this).locY >> Class_fb.a) - fm.i)]);
    }
    
    public static void a(int i) {
	D = null;
	if (i != 0)
	    a(71);
    }
    
    final void a(boolean bool, int i, byte i_9_, Class_r class_r, Animable var_lo,
		 int i_10_, int i_11_) {
	int i_12_ = -128 % ((-50 - i_9_) / 55);
	y++;
	throw new IllegalStateException();
    }
}
