/* ur - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

abstract class ur
{
    static int y_ = -1;
    static int b;
    static GameOutPacket c;
    static int d;
    static int e;
    static int f;
    static int g = 0;
    
    abstract void a(int i, int i_0_);
    
    abstract byte[] b(int i, int i_1_);
    
    static final bj a(String string, int i, int i_2_, qj var_qj) {
	if (i != -65536)
	    return null;
	d++;
	int i_3_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i_2_, i_3_);
	OpenGL.glProgramStringARB(i_2_, 34933, string);
	OpenGL.glGetIntegerv(34379, Interface.eb, 0);
	if ((Interface.eb[0] ^ 0xffffffff) != 0) {
	    OpenGL.glBindProgramARB(i_2_, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i_2_, 0);
	return new bj(var_qj, i_2_, i_3_);
    }
    
    static final int a(int i) {
	b++;
	Class_r class_r = lg.r;
	boolean bool = false;
	if (on.performance != 0) {
	    Canvas canvas = new Canvas();
	    canvas.setSize(100, 100);
	    class_r = Class_r.a(0, 0, null, canvas, null, -19464);
	    bool = true;
	}
	long l = us.a(94);
	if (i >= -106)
	    return 39;
	for (int i_4_ = 0; i_4_ < 10000; i_4_++)
	    class_r.a(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
	int i_5_ = (int) (us.a(95) - l);
	class_r.f(-16777216, 0, 0, 1, 100, 100);
	if (bool)
	    class_r.h(1);
	return i_5_;
    }
    
    static final int a(String string, boolean bool, int i, byte i_6_) {
	f++;
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException("Invalid radix:" + i);
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	int i_9_ = 0;
	int i_10_ = string.length();
	for (int i_11_ = 0; i_10_ > i_11_; i_11_++) {
	    int i_12_ = string.charAt(i_11_);
	    if (i_11_ == 0) {
		if (i_12_ == 45) {
		    bool_7_ = true;
		    continue;
		}
		if (i_12_ == 43 && bool)
		    continue;
	    }
	    if (i_12_ < 48 || i_12_ > 57) {
		if (i_12_ >= 65 && i_12_ <= 90)
		    i_12_ -= 55;
		else {
		    if (i_12_ < 97 || i_12_ > 122)
			throw new NumberFormatException();
		    i_12_ -= 87;
		}
	    } else
		i_12_ -= 48;
	    if (i_12_ >= i)
		throw new NumberFormatException();
	    if (bool_7_)
		i_12_ = -i_12_;
	    int i_13_ = i * i_9_ + i_12_;
	    if (i_13_ / i != i_9_)
		throw new NumberFormatException();
	    bool_8_ = true;
	    i_9_ = i_13_;
	}
	if (!bool_8_)
	    throw new NumberFormatException();
	int i_14_ = -120 % ((i_6_ + 5) / 56);
	return i_9_;
    }
    
    public ur() {
	/* empty */
    }
    
    static final void a(int i, boolean bool) {
	if (bool != true)
	    c = null;
	e++;
	Class_pf.a(i, (byte) -126, GameText.loadingPleaseWait.getString((byte) 74, cba.languageID));
    }
    
    abstract ds a(byte i);
    
    abstract int c(int i, int i_15_);
    
    public static void b(byte i) {
	if (i <= 126)
	    a((int) -48);
	c = null;
    }
    
    static {
	c = new GameOutPacket(59, 8);
    }
}
