/* caa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

final class caa extends ms implements nba
{
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int A;
    static int B;
    static Class_ae C = new Class_ae();
    private byte D;
    static int E;
    static lt F = new lt();
    static pl G;
    static GameOutPacket H = new GameOutPacket(57, 8);
    static int I;
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	s++;
	if (nm.s == 1)
	    cba.f[to.h / 100].a(hv.q - 8, fm.a - 8);
	int i_4_ = 52 / ((i_0_ - 69) / 39);
	if (nm.s == 2)
	    cba.f[4 + to.h / 100].a(hv.q - 8, fm.a - 8);
	cw.a(-3073);
    }
    
    public static void f(int i) {
	F = null;
	G = null;
	H = null;
	if (i > -71)
	    a(-72, -55, -105, (byte) 31, -61);
	C = null;
    }
    
    final int b(byte i) {
	if (i != -102)
	    b((int) 24);
	E++;
	return D;
    }
    
    public final boolean a(int i) {
	A++;
	if (i < 12)
	    return false;
	return super.a(((lm) ((ms) this).j).oi, 35040);
    }
    
    public final void b(int i) {
	z++;
	super.b(i);
    }
    
    caa(lm var_lm, boolean bool) {
	super(var_lm, 34962, bool);
    }
    
    public final boolean a(int i, int i_5_, int i_6_) {
	t++;
	if (i >= -29)
	    return true;
	D = (byte) i_5_;
	super.a(27209, i_6_);
	return true;
    }
    
    public final Buffer a(boolean bool, int i) {
	if (i != 32726)
	    return null;
	u++;
	return super.a(bool, (byte) 49, ((lm) ((ms) this).j).oi);
    }
    
    public final boolean a(Source source, int i, int i_7_, byte i_8_) {
	x++;
	D = (byte) i;
	super.a(i_7_, source, (byte) 108);
	if (i_8_ < 20)
	    F = null;
	return true;
    }
    
    static final void a(int i, Player var_qi, byte i_9_, int i_10_) {
	v++;
	int[] is = new int[4];
	co.a(is, 0, is.length, i_10_);
	lq.applyPlayerAnimation(i, is, -120, var_qi);
	if (i_9_ != -123)
	    f(-50);
    }
    
    static final void a(int i, int i_11_, int i_12_, byte i_13_, int i_14_) {
	w++;
	int i_15_ = 0;
	if (i_13_ == 31) {
	    for (/**/; i_15_ < rba.m; i_15_++) {
		Rectangle rectangle = ng.s[i_15_];
		if (rectangle.width + rectangle.x > i_14_
		    && rectangle.x < i_14_ + i
		    && i_11_ < rectangle.height + rectangle.y
		    && rectangle.y < i_12_ + i_11_)
		    la.q[i_15_] = true;
	    }
	}
    }
    
    static final int a(rca var_rca, byte i) {
	B++;
	if (Interface.Yc != var_rca) {
	    if (tj.i == var_rca)
		return 34065;
	    if (Class_kb.p == var_rca)
		return 34066;
	} else
	    return 9216;
	if (i != 42)
	    G = null;
	throw new IllegalArgumentException();
    }
    
    public final int a(byte i) {
	y++;
	if (i <= 11)
	    a(-33, 8, 88);
	return super.a((byte) 119);
    }
}
