/* Class_kb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_kb extends Node
{
    static int k;
    static tb l = new tb(128, 4);
    static int m;
    byte[] n;
    static World o;
    static rca p = new rca();
    
    static final void a(int i, int i_0_, int i_1_, Interface var_kp, f var_f,
			int i_2_, byte i_3_, ua var_ua) {
	k++;
	if (var_f != null) {
	    int i_4_;
	    if (ll.x != 4)
		i_4_ = (int) qw.n + pt.b & 0x3fff;
	    else
		i_4_ = (int) qw.n & 0x3fff;
	    int i_5_
		= Math.max(((Interface) var_kp).minHScroll / 2, ((Interface) var_kp).minVScroll / 2) + 10;
	    int i_6_ = i_0_ * i_0_ + i_1_ * i_1_;
	    if (i_5_ * i_5_ >= i_6_) {
		int i_7_ = GameInPacket.ints1[i_4_];
		int i_8_ = GameInPacket.ints2[i_4_];
		int i_9_ = -58 / ((9 - i_3_) / 63);
		if (ll.x != 4) {
		    i_8_ = i_8_ * 256 / (vd.N + 256);
		    i_7_ = 256 * i_7_ / (vd.N + 256);
		}
		int i_10_ = i_7_ * i_0_ + i_8_ * i_1_ >> 14;
		int i_11_ = i_8_ * i_0_ - i_7_ * i_1_ >> 14;
		var_f.a(i_10_ + ((Interface) var_kp).minHScroll / 2 + (i_2_ - var_f.A() / 2),
			i - i_11_ + (((Interface) var_kp).minVScroll / 2 - var_f.ca() / 2),
			var_ua, i_2_, i);
	    }
	}
    }
    
    public static void a(int i) {
	l = null;
	p = null;
	if (i != 16383)
	    a(125);
	o = null;
    }
    
    static final boolean a(int i, int i_12_, int i_13_) {
	m++;
	if (i != -998559250)
	    a(-81, -66, -88);
	if (!client.a(/*(byte) 83,*/ i_13_, i_12_) && !kq.a(i_13_, i_12_, true))
	    return false;
	return true;
    }
    
    Class_kb(byte[] is) {
	((Class_kb) this).n = is;
    }
}
