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
	int i_0_ = ((Animable) this).locX >> Class_fb.a;
	int i_1_ = 74 % ((i + 87) / 32);
	int i_2_ = ((Animable) this).locY >> Class_fb.a;
	int i_3_ = 0;
	if (i_0_ == n.e)
	    i_3_++;
	else if (n.e < i_0_)
	    i_3_ += 2;
	if (fm.i == i_2_)
	    i_3_ += 3;
	else if (fm.i > i_2_)
	    i_3_ += 6;
	int i_4_ = sp.t[i_3_];
	if ((i_4_ & ((ev) this).A) != 0)
	    return this.a((byte) 122, var_ggas, i_0_, i_2_);
	if (((ev) this).A == 1 && i_0_ > 0)
	    return this.a((byte) 70, var_ggas, i_0_ - 1, i_2_);
	if (((ev) this).A == 4 && sv.T >= i_0_)
	    return this.a((byte) 111, var_ggas, i_0_ + 1, i_2_);
	if (((ev) this).A == 8 && i_2_ > 0)
	    return this.a((byte) 98, var_ggas, i_0_, i_2_ - 1);
	if (((ev) this).A == 2 && nf.H >= i_2_)
	    return this.a((byte) 67, var_ggas, i_0_, i_2_ + 1);
	if (((ev) this).A == 16 && i_0_ > 0 && i_2_ <= nf.H)
	    return this.a((byte) 111, var_ggas, i_0_ - 1, i_2_ + 1);
	if (((ev) this).A == 32 && i_0_ <= sv.T && i_2_ <= nf.H)
	    return this.a((byte) 104, var_ggas, i_0_ + 1, i_2_ + 1);
	if (((ev) this).A == 128 && i_0_ > 0 && i_2_ > 0)
	    return this.a((byte) 124, var_ggas, i_0_ - 1, i_2_ - 1);
	if (((ev) this).A == 64 && sv.T >= i_0_ && i_2_ > 0)
	    return this.a((byte) 62, var_ggas, i_0_ + 1, i_2_ - 1);
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
	return fu.a(((Animable) this).h, ((Animable) this).locY >> Class_fb.a,
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
	return new baa[] { nt.c, client.gb, bfa.l, ko.g, bq.c, ku.j, daa.Y,
			   Class_pb.h, qm.a, lp.k, vg.J, GameInPacketHandler.m, ff.b, ej.l };
    }
    
    ev(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
	((Animable) this).j = i_9_;
	((Animable) this).locY = i_10_;
	((Animable) this).height = (byte) i_11_;
	((ev) this).A = (short) i_13_;
	((Animable) this).locX = i;
	((Animable) this).h = (byte) i_12_;
    }
}
