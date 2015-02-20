/* hr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ISAAC
{
    static byte a;
    private int[] keySetArray;
    static int initKeySets;
    static int getNextKeys;
    static boolean e;
    static int f;
    private int keyArrayIndex;
    static int[] h;
    static int generateNextKeySets;
    private int j;
    static int k = 2;
    private int l;
    static int getNextKeyAndPrepareNexts;
    private int[] cryptArray;
    static int[] o = new int[32];
    private int p;
    static int q;
    
    static final void a(int i, Class_r class_r) {
	ir.d = new bq[th.j.length];
	if (i != 8)
	    e = false;
	f++;
	for (int i_0_ = 0; th.j.length > i_0_; i_0_++) {
	    int i_1_ = th.j[i_0_];
	    sa var_sa = GameOutPacket.a(lm.vh, i_1_, (byte) 32);
	    la var_la = class_r.a(var_sa, aga.a(GameText.wb, i_1_), true);
	    ir.d[i_0_] = new bq(var_la, var_sa);
	}
    }
    
    final int getNextKeyAndPrepareNext(int dummy) {
		if (keyArrayIndex == 0) {
		    generateNextKeySet((int) -1);
		    keyArrayIndex = 256;
		}
		int i_2_ = 60 % ((69 - dummy) / 46);
		getNextKeyAndPrepareNexts++;
		return keySetArray[--keyArrayIndex];
    }
    
    private final void initKeySet(byte dummy) {
	initKeySets++;
	int i_4_;
	int i_5_;
	int i_6_;
	int i_7_;
	int i_8_;
	int i_9_;
	int i_10_;
	int i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = i_9_ = i_10_ = -1640531527;
	for (int i_11_ = 0; i_11_ < 4; i_11_++) {
	    i_3_ ^= i_4_ << 11;
	    i_4_ += i_5_;
	    i_6_ += i_3_;
	    i_4_ ^= i_5_ >>> 2;
	    i_7_ += i_4_;
	    i_5_ += i_6_;
	    i_5_ ^= i_6_ << 8;
	    i_6_ += i_7_;
	    i_8_ += i_5_;
	    i_6_ ^= i_7_ >>> 16;
	    i_9_ += i_6_;
	    i_7_ += i_8_;
	    i_7_ ^= i_8_ << 10;
	    i_8_ += i_9_;
	    i_10_ += i_7_;
	    i_8_ ^= i_9_ >>> 4;
	    i_3_ += i_8_;
	    i_9_ += i_10_;
	    i_9_ ^= i_10_ << 8;
	    i_4_ += i_9_;
	    i_10_ += i_3_;
	    i_10_ ^= i_3_ >>> 9;
	    i_3_ += i_4_;
	    i_5_ += i_10_;
	}
	for (int i_12_ = 0; i_12_ < 256; i_12_ += 8) {
	    i_6_ += keySetArray[i_12_ + 3];
	    i_10_ += keySetArray[i_12_ + 7];
	    i_3_ += keySetArray[i_12_];
	    i_8_ += keySetArray[i_12_ + 5];
	    i_7_ += keySetArray[i_12_ + 4];
	    i_9_ += keySetArray[i_12_ + 6];
	    i_5_ += keySetArray[i_12_ + 2];
	    i_4_ += keySetArray[i_12_ + 1];
	    i_3_ ^= i_4_ << 11;
	    i_6_ += i_3_;
	    i_4_ += i_5_;
	    i_4_ ^= i_5_ >>> 2;
	    i_7_ += i_4_;
	    i_5_ += i_6_;
	    i_5_ ^= i_6_ << 8;
	    i_8_ += i_5_;
	    i_6_ += i_7_;
	    i_6_ ^= i_7_ >>> 16;
	    i_7_ += i_8_;
	    i_9_ += i_6_;
	    i_7_ ^= i_8_ << 10;
	    i_8_ += i_9_;
	    i_10_ += i_7_;
	    i_8_ ^= i_9_ >>> 4;
	    i_3_ += i_8_;
	    i_9_ += i_10_;
	    i_9_ ^= i_10_ << 8;
	    i_10_ += i_3_;
	    i_4_ += i_9_;
	    i_10_ ^= i_3_ >>> 9;
	    i_5_ += i_10_;
	    i_3_ += i_4_;
	    cryptArray[i_12_] = i_3_;
	    cryptArray[i_12_ + 1] = i_4_;
	    cryptArray[i_12_ + 2] = i_5_;
	    cryptArray[i_12_ + 3] = i_6_;
	    cryptArray[i_12_ + 4] = i_7_;
	    cryptArray[i_12_ + 5] = i_8_;
	    cryptArray[i_12_ + 6] = i_9_;
	    cryptArray[i_12_ + 7] = i_10_;
	}
	int i_13_ = 0;
	if (dummy != 126)
	    o = null;
	for (/**/; i_13_ < 256; i_13_ += 8) {
	    i_10_ += cryptArray[i_13_ + 7];
	    i_9_ += cryptArray[i_13_ + 6];
	    i_5_ += cryptArray[i_13_ + 2];
	    i_4_ += cryptArray[i_13_ + 1];
	    i_8_ += cryptArray[i_13_ + 5];
	    i_3_ += cryptArray[i_13_];
	    i_7_ += cryptArray[i_13_ + 4];
	    i_6_ += cryptArray[i_13_ + 3];
	    i_3_ ^= i_4_ << 11;
	    i_4_ += i_5_;
	    i_6_ += i_3_;
	    i_4_ ^= i_5_ >>> 2;
	    i_5_ += i_6_;
	    i_7_ += i_4_;
	    i_5_ ^= i_6_ << 8;
	    i_8_ += i_5_;
	    i_6_ += i_7_;
	    i_6_ ^= i_7_ >>> 16;
	    i_7_ += i_8_;
	    i_9_ += i_6_;
	    i_7_ ^= i_8_ << 10;
	    i_8_ += i_9_;
	    i_10_ += i_7_;
	    i_8_ ^= i_9_ >>> 4;
	    i_3_ += i_8_;
	    i_9_ += i_10_;
	    i_9_ ^= i_10_ << 8;
	    i_4_ += i_9_;
	    i_10_ += i_3_;
	    i_10_ ^= i_3_ >>> 9;
	    i_3_ += i_4_;
	    i_5_ += i_10_;
	    cryptArray[i_13_] = i_3_;
	    cryptArray[i_13_ + 1] = i_4_;
	    cryptArray[i_13_ + 2] = i_5_;
	    cryptArray[i_13_ + 3] = i_6_;
	    cryptArray[i_13_ + 4] = i_7_;
	    cryptArray[i_13_ + 5] = i_8_;
	    cryptArray[i_13_ + 6] = i_9_;
	    cryptArray[i_13_ + 7] = i_10_;
	}
	generateNextKeySet((int) -1);
	keyArrayIndex = 256;
    }
    
    private final void generateNextKeySet(int dummy) {
	ISAAC.generateNextKeySets++;
	j += ++l;
	if (dummy != -1)
	    l = -120;
	for (int i_14_ = 0; i_14_ < 256; i_14_++) {
	    int i_15_ = cryptArray[i_14_];
	    if ((i_14_ & 0x2) == 0) {
			if ((i_14_ & 0x1) == 0)
			    p ^= p << 13;
			else
			    p ^= p >>> 6;
	    } else if ((0x1 & i_14_) != 0)
	    	p ^= p >>> 16;
	    else
	    	p ^= p << 2;
	    p += cryptArray[0xff & i_14_ + 128];
	    int i_16_;
	    cryptArray[i_14_] = i_16_ = cryptArray[uca.a(i_15_, 1020) >> 2] + (p + j);
	    keySetArray[i_14_] = j = cryptArray[uca.a(255, i_16_ >> 8 >> 2)] + i_15_;
	}
    }
    
    public static void c(int i) {
	int i_17_ = 70 % ((-60 - i) / 61);
	o = null;
	h = null;
    }
    
    private ISAAC() {
	/* empty */
    }
    
    ISAAC(int[] keys) {
		cryptArray = new int[256];
		keySetArray = new int[256];
		for (int loopID = 0; loopID < keys.length; loopID++)
		    keySetArray[loopID] = keys[loopID];
		initKeySet((byte) 126);
    }
    
    final int getNextKey(byte i) {
		if (keyArrayIndex == 0) {
		    generateNextKeySet((int) -1);
		    keyArrayIndex = 256;
		}
		getNextKeys++;
		int i_18_ = 17 / ((-65 - i) / 51);
		return keySetArray[keyArrayIndex - 1];
    }
}
