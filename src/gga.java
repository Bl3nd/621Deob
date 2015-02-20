/* gga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class gga extends Node
{
    static int k;
    static long[] l = new long[100];
    static int m;
    int n;
    int o;
    private int p;
    static int q;
    float r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    private int x;
    static int y;
    int z;
    
    static final void a(int i, byte[] is, int i_0_, int i_1_, byte[] is_2_,
			int i_3_, int i_4_, int i_5_, int i_6_) {
	s++;
	int i_7_ = -(i >> 2);
	i = -(0x3 & i);
	int i_8_ = -i_4_;
	if (i_3_ == -1) {
	    for (/**/; i_8_ < 0; i_8_++) {
		for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
		    is_2_[i_5_++] += is[i_1_++];
		    is_2_[i_5_++] += is[i_1_++];
		    is_2_[i_5_++] += is[i_1_++];
		    is_2_[i_5_++] += is[i_1_++];
		}
		for (int i_10_ = i; i_10_ < 0; i_10_++)
		    is_2_[i_5_++] += is[i_1_++];
		i_5_ += i_0_;
		i_1_ += i_6_;
	    }
	}
    }
    
    final int a(int i) {
	v++;
	if (i <= 30)
	    return 44;
	return x;
    }
    
    abstract void a(int i, float f);
    
    final float b(int i) {
	if (i != 100)
	    return 1.2685008F;
	k++;
	return ((gga) this).r;
    }
    
    abstract void a(int i, int i_11_, byte i_12_, int i_13_);
    
    final int a(byte i) {
	int i_14_ = 122 % ((i + 5) / 38);
	y++;
	return p;
    }
    
    static final void a(int i, int i_15_, int i_16_, int i_17_, int i_18_,
			int i_19_) {
	if (i_18_ != 13616)
	    a(-67, null, -89, -119, null, -45, 91, 121, -124);
	w++;
	if (vaa.xb <= i_17_ && jga.v >= i_19_ && Class_md.h <= i_16_
	    && Class_db.o >= i_15_)
	    uh.a(i_17_, i_16_, i_18_ ^ ~0x3559, i_15_, i, i_19_);
	else
	    vo.b(i_17_, i_15_, i_19_, i, i_16_, -1);
    }
    
    final int b(byte i) {
	m++;
	if (i != 119)
	    a(73, 52, (byte) 52, 124);
	return ((gga) this).o;
    }
    
    final int a(boolean bool) {
	if (bool != true)
	    b((byte) 118);
	t++;
	return ((gga) this).z;
    }
    
    public static void c(int i) {
	l = null;
	if (i != 100)
	    l = null;
    }
    
    final int i(int i) {
	if (i > -24)
	    return 44;
	u++;
	return ((gga) this).n;
    }
    
    gga(int i, int i_20_, int i_21_, int i_22_, int i_23_, float f) {
	((gga) this).z = i;
	((gga) this).n = i_20_;
	((gga) this).r = f;
	p = i_22_;
	x = i_23_;
	((gga) this).o = i_21_;
    }
}
