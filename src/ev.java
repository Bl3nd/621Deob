/* ev - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ev extends Animable
{
    static int w;
    static int x;
    static int y;
    static int z;
    short A;
    static int B;
    
    final int a(gga[] var_ggas, int i) {
	z++;
	int x = ((Animable) this).locX >> Class_fb.a;
	int i_1_ = 74 % ((i + 87) / 32);
	int y = ((Animable) this).locY >> Class_fb.a;
	int i_3_ = 0;
	if (x == n.e)
	    i_3_++;
	else if (n.e < x)
	    i_3_ += 2;
	if (fm.i == y)
	    i_3_ += 3;
	else if (fm.i > y)
	    i_3_ += 6;
	int i_4_ = sp.t[i_3_];
	if ((i_4_ & ((ev) this).A) != 0)
	    return this.a(var_ggas, x, y);
	if (((ev) this).A == 1 && x > 0)
	    return this.a(var_ggas, x - 1, y);
	if (((ev) this).A == 4 && sv.T >= x)
	    return this.a(var_ggas, x + 1, y);
	if (((ev) this).A == 8 && y > 0)
	    return this.a(var_ggas, x, y - 1);
	if (((ev) this).A == 2 && nf.H >= y)
	    return this.a(var_ggas, x, y + 1);
	if (((ev) this).A == 16 && x > 0 && y <= nf.H)
	    return this.a(var_ggas, x - 1, y + 1);
	if (((ev) this).A == 32 && x <= sv.T && y <= nf.H)
	    return this.a(var_ggas, x + 1, y + 1);
	if (((ev) this).A == 128 && x > 0 && y > 0)
	    return this.a(var_ggas, x - 1, y - 1);
	if (((ev) this).A == 64 && sv.T >= x && y > 0)
	    return this.a(var_ggas, x + 1, y - 1);
	throw new RuntimeException("");
    }
    
    final boolean f(int i) {
	B++;
	if (i != 4095)
	    ((ev) this).A = (short) -97;
	return (vd.O[FileOnDisk.k + ((((Animable) this).locX >> Class_fb.a) - n.e)]
		[FileOnDisk.k - fm.i + (((Animable) this).locY >> Class_fb.a)]);
    }
    
    final boolean f(byte i) {
	y++;
	if (i < 111)
	    return true;
	return fu.a(((Animable) this).height_, ((Animable) this).locY >> Class_fb.a,
		    ((Animable) this).locX >> Class_fb.a, this, true);
    }
    
    static final String a(int i, String string, String string_5_,
			  String string_6_) {
	x++;
	if (i != 0)
	    return null;
	for (int i_7_ = string.indexOf(string_5_); i_7_ != -1;
	     i_7_ = string.indexOf(string_5_, i_7_ + string_6_.length()))
	    string = (string.substring(0, i_7_) + string_6_
		      + string.substring(string_5_.length() + i_7_));
	return string;
    }
    
    static final baa[] h(int i) {
	int i_8_ = 72 / ((61 - i) / 60);
	w++;
	return new baa[] { nt.c, client.baa, bfa.l, ko.g, bq.c, ku.j, daa.Y,
			   Class_pb.h, qm.a, lp.k, vg.J, GameInPacketHandler.baa, ff.b, ej.l };
    }
    
    ev(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
	((Animable) this).j = i_9_;
	((Animable) this).locY = i_10_;
	((Animable) this).height = (byte) i_11_;
	((ev) this).A = (short) i_13_;
	((Animable) this).locX = i;
	((Animable) this).height_ = (byte) i_12_;
    }
}
