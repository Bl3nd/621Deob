/* Class_g - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_g extends cl
{
    static int t;
    static int u;
    static int v;
    static int w;
    static pk modeWhere;
    static int y;
    static int z;
    static int A;
    static int B;
    static int C;
    static boolean D = true;
    static int E;
    static int F;
    static int G;
    
    final void a(boolean bool, boolean bool_0_) {
	w++;
	if (bool != true)
	    modeWhere = null;
    }
    
    final void a(int i, int i_1_, byte i_2_) {
	y++;
	if (i_2_ != 65)
	    a(-81, false);
    }
    
    static final int a(int i, int i_3_, int i_4_, int i_5_) {
	t++;
	if ((0x8 & tu.b[i][i_5_][i_3_]) != i_4_)
	    return 0;
	if (i > 0 && (0x2 & tu.b[1][i_5_][i_3_]) != 0)
	    return i - 1;
	return i;
    }
    
    final void a(int i, int i_6_, hfa var_hfa) {
	E++;
	((cl) this).l.a(var_hfa, 0);
	((cl) this).l.f(i, 0);
	if (i_6_ <= 47)
	    a((int) 90);
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    a(-76, false);
	u++;
	return false;
    }
    
    static final int a(int i, String string) {
	if (i != 128)
	    b(-124, -2, -83, -57);
	A++;
	return ur.a(string, true, 10, (byte) 67);
    }
    
    static final int a(int i, int i_7_) {
	if (i >= -54)
	    D = true;
	G++;
	if (i_7_ < 96)
	    return 0;
	if (i_7_ < 128)
	    return 2;
	return 3;
    }
    
    static final int b(int i, int i_8_, int i_9_, int i_10_) {
	i_9_ &= 0x3;
	F++;
	if (i_9_ == 0)
	    return i_8_;
	if (i_9_ == 1)
	    return i;
	if (i_9_ == 2)
	    return -i_8_ + 4095;
	if (i_10_ < 77)
	    return 120;
	return 4095 - i;
    }
    
    final void a(int i, boolean bool) {
	C++;
	int i_11_ = 45 % ((52 - i) / 36);
    }
    
    final void d(int i) {
	z++;
	if (i != -19092)
	    B = -77;
    }
    
    static final void a(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			int i_16_, int i_17_) {
	oi.B = i;
	ItemDef.g = i_12_;
	v++;
	gga.q = i_17_;
	if (i_13_ != 8)
	    a(82, 113, 39, -15, 6, 2, -92);
	gn.L = i_14_;
	dfa.I = i_15_;
	n.b = i_16_;
    }
    
    public static void d(byte i) {
	if (i == -9)
	    modeWhere = null;
    }
    
    Class_g(en var_en) {
	super(var_en);
    }
    
    static {
	modeWhere = new pk("WTWIP", 3);
    }
}
