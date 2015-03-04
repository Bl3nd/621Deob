/* Class_kd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_kd
{
    static int a;
    static String itemName = null;
    static int c;
    static int[] d = new int[128];
    static int e;
    static int f;
    static int g;
    private int h;
    int i;
    static int[] j;
    static int k;
    static int[] l;
    static short m;
    static int n;
    
    public static void a(int i) {
	l = null;
	d = null;
	itemName = null;
	if (i != -11808)
	    a((byte) 77, (String) null);
	j = null;
    }
    
    final int getOrientation(byte i) {
	n++;
	if (i != 67)
	    return 4;
	return ((Class_kd) this).i & 0x3fff;
    }
    
    static final boolean a(byte i, String string) {
	a++;
	if (i <= 47)
	    return false;
	return fn.a((byte) 8, string, true, 10);
    }
    
    final void a(boolean bool) {
	if (bool != true)
	    itemName = null;
	e++;
	((Class_kd) this).i &= 0x3fff;
    }
    
    static final void b(int i) {
	g++;
	int i_0_ = -87 % ((i + 85) / 39);
	int i_1_ = uc.g.length;
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    if (uc.g[i_2_] != null) {
		int i_3_ = -1;
		for (int i_4_ = 0; i_4_ < uj.s; i_4_++) {
		    if (iu.o[i_2_] == ll.v[i_4_]) {
			i_3_ = i_4_;
			break;
		    }
		}
		if (i_3_ == -1) {
		    ll.v[uj.s] = iu.o[i_2_];
		    i_3_ = uj.s++;
		}
		BytesParser var_es = new BytesParser(uc.g[i_2_]);
		int i_5_ = 0;
		while (uc.g[i_2_].length > ((BytesParser) var_es).pos) {
		    if (i_5_ >= 511 || ps.npcCount >= 1023)
			break;
		    int i_6_ = i_3_ | i_5_++ << 6;
		    int i_7_ = var_es.readShort(13111);
		    int i_8_ = i_7_ >> 14;
		    int i_9_ = i_7_ >> 7 & 0x3f;
		    int i_10_ = i_7_ & 0x3f;
		    int i_11_ = (iu.o[i_2_] >> 8) * 64 + (i_9_ - bfa.thisPlayersRegionX);
		    int i_12_ = i_10_ + ((0xff & iu.o[i_2_]) * 64 - BytesParser.thisPlayersRegionY);
		    NPCDef var_du = jm.p.getNPCDef(var_es.readShort(13111), (byte) -121);
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_6_);
		    if (var_mi == null && (0x1 & ((NPCDef) var_du).y) > 0
			&& qca.E == i_8_ && i_11_ >= 0
			&& ((NPCDef) var_du).Q + i_11_ < Class_hc.e && i_12_ >= 0
			&& bw.v > ((NPCDef) var_du).Q + i_12_) {
			NPC class_ac = new NPC();
			((Entity) class_ac).lb = i_6_;
			NPCNode var_mi_13_ = new NPCNode(class_ac);
			uo.a.a(var_mi_13_, (byte) -80, (long) i_6_);
			ii.npcNodes[ObjectDef.Ib++] = var_mi_13_;
			gfa.npcIndices[ps.npcCount++] = i_6_;
			((Entity) class_ac).U = pm.currentTimedTicks;
			class_ac.a(var_du, 0);
			class_ac.a(((NPCDef) ((NPC) class_ac).npcDef).Q, 0);
			((Entity) class_ac).Zb
			    = ((NPCDef) ((NPC) class_ac).npcDef).U << 3;
			class_ac.a(0x3967 & (((NPCDef) ((NPC) class_ac).npcDef).Z
					     + 4) << 11,
				   1003, true);
			class_ac.a(true, i_12_, (byte) -107,
				   class_ac.getNPCDefinition((int) -1), i_8_, i_11_);
		    }
		}
	    }
	}
    }
    
    static final WorldSub a(int i, boolean bool) {
	if (bool != true)
	    l = null;
	k++;
	if (!pv.b || Class_g.B > i || i > hj.g)
	    return null;
	return nk.i[i - Class_g.B];
    }
    
    final void a(int i, int i_14_) {
	f++;
	int i_15_ = 73 / ((69 - i) / 45);
	((Class_kd) this).i = i_14_;
	h = 0;
    }
    
    final boolean a(int i, int i_16_, int i_17_, byte i_18_) {
	c++;
	if (i_18_ < 44)
	    l = null;
	int i_19_ = h;
	if (((Class_kd) this).i == i_16_ && h == 0)
	    return false;
	boolean bool;
	if (h == 0) {
	    if ((i_16_ > ((Class_kd) this).i
		 && i_17_ + ((Class_kd) this).i >= i_16_)
		|| (((Class_kd) this).i > i_16_
		    && ((Class_kd) this).i - i_17_ <= i_16_)) {
		((Class_kd) this).i = i_16_;
		return false;
	    }
	    bool = true;
	} else if (h > 0 && i_16_ > ((Class_kd) this).i) {
	    int i_20_ = h * h / (2 * i_17_);
	    int i_21_ = ((Class_kd) this).i + i_20_;
	    if (i_21_ >= i_16_ || ((Class_kd) this).i > i_21_)
		bool = false;
	    else
		bool = true;
	} else if (h >= 0 || ((Class_kd) this).i <= i_16_)
	    bool = false;
	else {
	    int i_22_ = h * h / (2 * i_17_);
	    int i_23_ = ((Class_kd) this).i - i_22_;
	    if (i_16_ < i_23_ && i_23_ <= ((Class_kd) this).i)
		bool = true;
	    else
		bool = false;
	}
	if (!bool) {
	    if (h > 0) {
		h -= i_17_;
		if (h < 0)
		    h = 0;
	    } else {
		h += i_17_;
		if (h > 0)
		    h = 0;
	    }
	} else {
	    if (((Class_kd) this).i < i_16_) {
		h += i_17_;
		if (i != 0 && i < h)
		    h = i;
	    } else {
		h -= i_17_;
		if (i != 0 && h < -i)
		    h = -i;
	    }
	    if (i_19_ != h) {
		int i_24_ = h * h / (i_17_ * 2);
		if (((Class_kd) this).i >= i_16_) {
		    if (i_16_ < ((Class_kd) this).i
			&& i_16_ > ((Class_kd) this).i - i_24_)
			h = i_19_;
		} else if (i_16_ < i_24_ + ((Class_kd) this).i)
		    h = i_19_;
	    }
	}
	((Class_kd) this).i += h + i_19_ >> 1;
	return bool;
    }
    
    public Class_kd() {
	/* empty */
    }
    
    static {
	for (int i = 0; i < d.length; i++)
	    d[i] = -1;
	for (int i = 65; i <= 90; i++)
	    d[i] = i - 65;
	for (int i = 97; i <= 122; i++)
	    d[i] = i + 26 - 97;
	for (int i = 48; i <= 57; i++)
	    d[i] = i + 52 - 48;
	d[45] = d[47] = 63;
	d[42] = d[43] = 62;
	l = new int[8];
	j = new int[] { 1, 2, 4, 8 };
	m = (short) 205;
    }
}
