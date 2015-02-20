/* cw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class cw
{
    private int[][] a;
    static GameOutPacket b = new GameOutPacket(60, 16);
    private pl c;
    static int d;
    private boolean[] e;
    private int f;
    static int g;
    static int h;
    static int i;
    
    static final void a(int i) {
	sba.q = 0;
	d++;
	int i_0_ = (((Animable) up.thisPlayer).locX >> 9) + bfa.thisPlayersRegionX;
	int i_1_ = BytesParser.thisPlayersRegionY + (((Animable) up.thisPlayer).locY >> 9);
	if (i_0_ >= 3053 && i_0_ <= 3156 && i_1_ >= 3056 && i_1_ <= 3136)
	    sba.q = 1;
	if ((i_0_ ^ 0xffffffff) <= i && i_0_ <= 3118 && i_1_ >= 9492
	    && i_1_ <= 9535)
	    sba.q = 1;
	if (sba.q == 1 && i_0_ >= 3139 && i_0_ <= 3199 && i_1_ >= 3008
	    && i_1_ <= 3062)
	    sba.q = 0;
    }
    
    public static void b(int i) {
	int i_2_ = -84 / ((i - 22) / 54);
	b = null;
    }
    
    final nh a(int i, int i_3_) {
	h++;
	byte[] is = c.b(i_3_, -111, 1);
	if (i < 14)
	    a((int) -7);
	nh var_nh = new nh();
	var_nh.a(new BytesParser(is), (byte) -80);
	return var_nh;
    }
    
    final boolean a(byte i) {
	if (i != -86)
	    c = null;
	cw.i++;
	if ((f ^ 0xffffffff) == 0)
	    return false;
	return true;
    }
    
    cw(Class_rf class_rf, int i, pl var_pl) {
	c = var_pl;
	c.a(1, true);
	BytesParser var_es = new BytesParser(c.b(0, -4, 0));
	int i_4_ = var_es.readUnsignedByte(-9268);
	if (i_4_ <= 3) {
	    int i_5_ = var_es.readUnsignedByte(-9268);
	    wea[] var_weas = cca.a(true);
	    boolean bool = true;
	    if (var_weas.length != i_5_)
		bool = false;
	    else {
		for (int i_6_ = 0; i_6_ < var_weas.length; i_6_++) {
		    int i_7_ = var_es.readUnsignedByte(-9268);
		    if (((wea) var_weas[i_6_]).f != i_7_) {
			bool = false;
			break;
		    }
		}
	    }
	    if (!bool) {
		f = -1;
		a = new int[0][];
		e = new boolean[0];
	    } else {
		int i_8_ = var_es.readUnsignedByte(-9268);
		int i_9_ = var_es.readUnsignedByte(-9268);
		if (i_4_ > 2)
		    f = var_es.readShort2(58);
		else
		    f = -1;
		e = new boolean[i_9_ + 1];
		a = new int[i_9_ + 1][];
		for (int i_10_ = 0; i_8_ > i_10_; i_10_++) {
		    int i_11_ = var_es.readUnsignedByte(-9268);
		    e[i_11_] = var_es.readUnsignedByte(-9268) == 1;
		    int i_12_ = var_es.readShort(13111);
		    if ((f ^ 0xffffffff) == 0) {
			a[i_11_] = new int[i_12_];
			for (int i_13_ = 0; i_12_ > i_13_; i_13_++)
			    a[i_11_][i_13_] = var_es.readShort(13111);
		    } else {
			a[i_11_] = new int[i_12_ + 1];
			a[i_11_][0] = f;
			for (int i_14_ = 0; i_12_ > i_14_; i_14_++)
			    a[i_11_][i_14_ + 1] = var_es.readShort(13111);
		    }
		}
		for (int i_15_ = 0; i_9_ + 1 > i_15_; i_15_++) {
		    if (a[i_15_] == null) {
			if (f == -1)
			    a[i_15_] = new int[0];
			else
			    a[i_15_] = new int[] { f };
		    }
		}
	    }
	} else {
	    e = new boolean[0];
	    a = new int[0][];
	    f = -1;
	}
    }
    
    final int[] a(byte i, int i_16_) {
	g++;
	if (i_16_ < 0 || a.length <= i_16_) {
	    if (f == -1)
		return new int[0];
	    return new int[] { f };
	}
	if (!e[i_16_] || a[i_16_].length <= 1)
	    return a[i_16_];
	int i_17_ = f != -1 ? 1 : 0;
	Random random = new Random();
	int[] is = new int[a[i_16_].length];
	co.a(a[i_16_], 0, is, 0, is.length);
	int i_18_ = 29 / ((i - 43) / 52);
	for (int i_19_ = i_17_; is.length > i_19_; i_19_++) {
	    int i_20_ = i_17_ + it.a(random, is.length - i_17_, 124);
	    int i_21_ = is[i_19_];
	    is[i_19_] = is[i_20_];
	    is[i_20_] = i_21_;
	}
	return is;
    }
}
