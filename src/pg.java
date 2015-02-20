/* pg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class pg
{
    static GameInPacket sendWorldListGameInPacket = new GameInPacket(0, -2);
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h = -1;
    
    public static void a(byte i) {
	sendWorldListGameInPacket = null;
	if (i != 57)
	    a((int) 91);
    }
    
    static final short a(int i, int i_0_) {
	c++;
	int i_1_ = 0x3f & i_0_ >> 10;
	int i_2_ = (0x387 & i_0_) >> 3;
	int i_3_ = 0x7f & i_0_;
	i_2_ = i_3_ > 64 ? (-i_3_ + 127) * i_2_ >> 7 : i_3_ * i_2_ >> 7;
	if (i != 0)
	    a(78, 76);
	int i_4_ = i_3_ + i_2_;
	int i_5_;
	if (i_4_ == 0)
	    i_5_ = i_2_ << 1;
	else
	    i_5_ = (i_2_ << 8) / i_4_;
	int i_6_ = i_4_;
	return (short) (i_6_ | (i_5_ >> 4 << 7 | i_1_ << 10));
    }
    
    static final Class_r a(int i, Canvas canvas, fa var_fa, int i_7_) {
	if (i_7_ != 191)
	    return null;
	e++;
	return new qj(canvas, var_fa, i);
    }
    
    static final int a(int i, String string, String string_8_, int i_9_) {
	b++;
	int i_10_ = string_8_.length();
	if (i_9_ > -100)
	    sendWorldListGameInPacket = null;
	int i_11_ = string.length();
	int i_12_ = 0;
	int i_13_ = 0;
	char c = '\0';
	char c_14_ = '\0';
    while_136_:
	do {
	    char c_15_;
	    char c_16_;
	    for (;;) {
		if (i_10_ <= i_12_ - c && i_11_ <= i_13_ - c_14_)
		    break while_136_;
		if (i_12_ - c >= i_10_)
		    return -1;
		if (i_11_ <= i_13_ - c_14_)
		    return 1;
		if (c != 0) {
		    c_15_ = c;
		    boolean bool = false;
		} else
		    c_15_ = string_8_.charAt(i_12_++);
		if (c_14_ != 0) {
		    c_16_ = c_14_;
		    boolean bool = false;
		} else
		    c_16_ = string.charAt(i_13_++);
		c = Class_nb.a(c_15_, true);
		c_14_ = Class_nb.a(c_16_, true);
		c_15_ = jj.a(i, true, c_15_);
		c_16_ = jj.a(i, true, c_16_);
		if (c_16_ != c_15_ && (Character.toUpperCase(c_15_)
				       != Character.toUpperCase(c_16_))) {
		    c_15_ = Character.toLowerCase(c_15_);
		    c_16_ = Character.toLowerCase(c_16_);
		    if (c_16_ != c_15_)
			break;
		}
	    }
	    return efa.a(c_15_, i, 93) - efa.a(c_16_, i, 125);
	} while (false);
	int i_17_ = Math.min(i_10_, i_11_);
	for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
	    if (i != 2)
		i_12_ = i_13_ = i_18_;
	    else {
		i_13_ = i_11_ - 1 - i_18_;
		i_12_ = i_10_ - i_18_ - 1;
	    }
	    char c_19_ = string_8_.charAt(i_12_);
	    char c_20_ = string.charAt(i_13_);
	    if (c_20_ != c_19_ && (Character.toUpperCase(c_19_)
				   != Character.toUpperCase(c_20_))) {
		c_19_ = Character.toLowerCase(c_19_);
		c_20_ = Character.toLowerCase(c_20_);
		if (c_20_ != c_19_)
		    return efa.a(c_19_, i, 102) - efa.a(c_20_, i, 93);
	    }
	}
	int i_21_ = i_10_ - i_11_;
	if (i_21_ != 0)
	    return i_21_;
	for (int i_22_ = 0; i_17_ > i_22_; i_22_++) {
	    char c_23_ = string_8_.charAt(i_22_);
	    char c_24_ = string.charAt(i_22_);
	    if (c_23_ != c_24_)
		return efa.a(c_23_, i, 93) - efa.a(c_24_, i, 116);
	}
	return 0;
    }
    
    static final void a(int i) {
	d++;
	if (!dq.e) {
	    if (((jb) cs.g).n)
		qw.n = (float) ((int) qw.n + 191 & ~0x7f);
	    else
		afa.a += (-afa.a + 24.0F) / 2.0F;
	    if (i == 191) {
		dq.e = true;
		mo.F = true;
	    }
	}
    }
}
