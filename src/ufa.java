/* ufa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

import jaggl.OpenGL;

final class ufa
{
    static long a;
    static pl b;
    static int c;
    static int d;
    private int e = 0;
    private Node f;
    static int g;
    private il h;
    static int i;
    static CRC32 j = new CRC32();
    
    final Node a(int i) {
	d++;
	if (e > 0 && f != ((il) h).l[e - 1]) {
	    Node class_d = f;
	    f = ((Node) class_d).previous;
	    return class_d;
	}
	while (((il) h).i > e) {
	    Node class_d = ((Node) ((il) h).l[e++]).previous;
	    if (class_d != ((il) h).l[e - 1]) {
		f = ((Node) class_d).previous;
		return class_d;
	    }
	}
	if (i != 1)
	    a(-1, 47);
	return null;
    }
    
    static final void a(int i, int i_0_, int i_1_, byte[] is, boolean bool,
			int i_2_, int i_3_) {
	c++;
	if (i_0_ > 0 && !ar.a(i_0_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i_2_ > 0 && !ar.a(i_2_, (byte) 98))
	    throw new IllegalArgumentException("");
	int i_4_ = kr.a(i_1_, (byte) -108);
	int i_5_ = 0;
	int i_6_ = i_0_ < i_2_ ? i_0_ : i_2_;
	int i_7_ = i_0_ >> 1;
	int i_8_ = i_2_ >> 1;
	byte[] is_9_ = is;
	if (bool != true)
	    a(25, -1, 34, null, false, 100, -39);
	byte[] is_10_ = new byte[i_4_ * i_8_ * i_7_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_5_, i_3_, i_0_, i_2_, 0, i_1_, 5121,
				  is_9_, 0);
	    if (i_6_ <= 1)
		break;
	    int i_11_ = i_4_ * i_0_;
	    for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
		int i_13_ = i_12_;
		int i_14_ = i_12_;
		int i_15_ = i_14_ + i_11_;
		for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
		    for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
			int i_18_ = is_9_[i_14_];
			i_14_ += i_4_;
			i_18_ += is_9_[i_14_];
			i_18_ += is_9_[i_15_];
			i_14_ += i_4_;
			i_15_ += i_4_;
			i_18_ += is_9_[i_15_];
			i_15_ += i_4_;
			is_10_[i_13_] = (byte) (i_18_ >> 2);
			i_13_ += i_4_;
		    }
		    i_15_ += i_11_;
		    i_14_ += i_11_;
		}
	    }
	    byte[] is_19_ = is_10_;
	    is_10_ = is_9_;
	    is_9_ = is_19_;
	    i_0_ = i_7_;
	    i_2_ = i_8_;
	    i_5_++;
	    i_6_ >>= 1;
	    i_7_ >>= 1;
	    i_8_ >>= 1;
	}
    }
    
    final Node a(byte i) {
	int i_20_ = 101 / ((i + 76) / 42);
	g++;
	e = 0;
	return a((int) 1);
    }
    
    static final int a(int i, int i_21_) {
	ufa.i++;
	if (i > -61)
	    return -14;
	return 0x7f & i_21_;
    }
    
    public static void b(int i) {
	if (i != 0)
	    b = null;
	b = null;
	j = null;
    }
    
    public ufa() {
	/* empty */
    }
    
    ufa(il var_il) {
	h = var_il;
    }
}
