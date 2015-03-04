/* mo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mo extends ew
{
    long p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    int v;
    static int w;
    static int x;
    static GameOutPacket y = new GameOutPacket(14, 3);
    int z;
    int A;
    static int C;
    int D;
    static lt E;
    static boolean F = true;
    static short[] G;
    
    final long i(int i) {
	u++;
	if (i > -67)
	    E = null;
	return ((mo) this).p;
    }
    
    public static void a(byte i) {
	if (i >= 11) {
	    E = null;
	    G = null;
	    y = null;
	}
    }
    
    static final rn a(pl var_pl, int i, boolean bool, String string) {
	s++;
	int i_0_ = var_pl.a(string, (int) 77);
	if ((i_0_ ^ 0xffffffff) == 0)
	    return new rn(0);
	int[] is = var_pl.c(i_0_, -124);
	rn var_rn = new rn(is.length);
	int i_1_ = 0;
	int i_2_ = 0;
	while (((rn) var_rn).a > i_1_) {
	    BytesParser var_es = new BytesParser(var_pl.b(is[i_2_++], i - 415, i_0_));
	    int i_3_ = var_es.readInt(113);
	    int i_4_ = var_es.readShort(13111);
	    int i_5_ = var_es.readUnsignedByte(-9268);
	    if (bool || i_5_ != 1) {
		((rn) var_rn).f[i_1_] = i_3_;
		((rn) var_rn).b[i_1_] = i_4_;
		i_1_++;
	    } else
		((rn) var_rn).a--;
	}
	if (i != 512)
	    E = null;
	return var_rn;
    }
    
    static final void a(byte i, Entity var_ni) {
	q++;
	if (i >= -63)
	    y = null;
	int i_6_ = ((Entity) var_ni).xc - pm.currentTimedTicks;
	int i_7_ = 512 * ((Entity) var_ni).M + var_ni.getNPCDefinition(-1) * 256;
	int i_8_ = ((Entity) var_ni).fc * 512 + var_ni.getNPCDefinition(-1) * 256;
	((Entity) var_ni).Fc = 0;
	((Animable) var_ni).locX += (i_7_ - ((Animable) var_ni).locX) / i_6_;
	((Animable) var_ni).locY += (i_8_ - ((Animable) var_ni).locY) / i_6_;
	if (((Entity) var_ni).ub == 0)
	    var_ni.a(false, 8192);
	if (((Entity) var_ni).ub == 1)
	    var_ni.a(false, 12288);
	if (((Entity) var_ni).ub == 2)
	    var_ni.a(false, 0);
	if (((Entity) var_ni).ub == 3)
	    var_ni.a(false, 4096);
    }
    
    final int a(boolean bool) {
	if (bool != true)
	    return -12;
	x++;
	return ((mo) this).D;
    }
    
    static final String a(String string, boolean bool) {
	t++;
	String string_9_ = null;
	int i = string.indexOf("--> ");
	if (i >= 0) {
	    string_9_ = string.substring(0, i + 4);
	    string = string.substring(i + 4);
	}
	if (string.startsWith("directlogin ")) {
	    int i_10_ = string.indexOf(" ", "directlogin ".length());
	    if (i_10_ >= 0) {
		int i_11_ = string.length();
		string = string.substring(0, i_10_) + " ";
		for (int i_12_ = i_10_ + 1; i_12_ < i_11_; i_12_++)
		    string += "*";
	    }
	}
	if (bool != false)
	    a((byte) -51);
	if (string_9_ == null)
	    return string;
	return string_9_ + string;
    }
    
    final int b(boolean bool) {
	C++;
	if (bool != false)
	    return 73;
	return ((mo) this).A;
    }
    
    final int c(int i) {
	w++;
	if (i < 117)
	    a((int) -10);
	return ((mo) this).z;
    }
    
    final int a(int i) {
	if (i != 9)
	    return 12;
	r++;
	return ((mo) this).v;
    }
    
    static {
	E = new lt();
	G = new short[] { 8, 12, 49, 59, 15, 3, 9, 44 };
    }
}
