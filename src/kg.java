/* kg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class kg
{
    static int a;
    static GameOutPacket b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int[] g = new int[1];
    static int h;
    static int i;
    static aca[] j;
    
    static final SpecialOutPacket[] a(byte i) {
	if (i <= 36)
	    return null;
	kg.i++;
	return new SpecialOutPacket[] { hea.e, hea.specialOutPacket15, hea.mainLoginOutPacket, hea.i, hea.mainLoginOutPacket2, hea.lobbyLoginOutPacket, hea.l,
			  hea.m, hea.n, hea.o, hea.p, hea.q, hea.specialOutPacket26, hea.s };
    }
    
    static final Object a(int i, byte[] is, boolean bool) {
	d++;
	if (is == null)
	    return null;
	if ((is.length ^ 0xffffffff) < i && !vv.m) {
	    try {
		ko var_ko = (ko) Class.forName("nea").newInstance();
		var_ko.a(is, true);
		return var_ko;
	    } catch (Throwable throwable) {
		vv.m = true;
	    }
	}
	if (!bool)
	    return is;
	return ko.a(is, -25553);
    }
    
    static final int a(int i, String string, BytesParser var_es) {
	if (i != -1)
	    return 104;
	h++;
	int i_0_ = ((BytesParser) var_es).pos;
	byte[] is = ip.a(string, (byte) -47);
	var_es.b(-139194328, is.length);
	((BytesParser) var_es).pos
	    += dp.k.a(is.length, ((BytesParser) var_es).pos, ((BytesParser) var_es).bytes, is, 8, 0);
	return ((BytesParser) var_es).pos - i_0_;
    }
    
    abstract as a(as var_as, byte i);
    
    public static void b(byte i) {
	if (i > -127)
	    a(87, null, null, -78, null, -1, -13, 45);
	j = null;
	g = null;
	b = null;
    }
    
    static final cj a(int i, int i_1_) {
	f++;
	cj var_cj = (cj) sf.a.get((long) i, (byte) 100);
	if (var_cj != null)
	    return var_cj;
	byte[] is = on.g.b(i, 127, 0);
	var_cj = new cj();
	if (i_1_ > -88)
	    a((byte) 105);
	if (is != null)
	    var_cj.a(new BytesParser(is), -84, i);
	sf.a.put((long) i, var_cj, 1);
	return var_cj;
    }
    
    static final void a(int i, int[] is, int i_2_, int i_3_, int i_4_) {
	e++;
	i--;
	int i_5_ = 30 / ((-47 - i_4_) / 57);
	int i_6_ = i_3_-- - 7;
	while (i < i_6_) {
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	    is[++i] = i_2_;
	}
	while (i < i_3_)
	    is[++i] = i_2_;
    }
    
    static final int a(int i, boolean bool, int i_7_, boolean bool_8_) {
	c++;
	hg var_hg = el.a(bool, (byte) 50, i_7_);
	if (var_hg == null)
	    return -1;
	if (i < 0 || ((hg) var_hg).itemIDs.length <= i)
	    return -1;
	if (bool_8_ != true)
	    return 44;
	return ((hg) var_hg).itemIDs[i];
    }
    
    static final void a(int i, Player var_qi, ObjectDef var_bda, int i_9_,
			NPC class_ac, int i_10_, int i_11_, int i_12_) {
	a++;
	ql var_ql = new ql();
	((ql) var_ql).yLoc = i_11_ << 9;
	if (i > -110)
	    a(37, null, null, 99, null, -51, -118, -51);
	((ql) var_ql).G = i_12_;
	((ql) var_ql).xLoc = i_10_ << 9;
	if (var_bda != null) {
	    ((ql) var_ql).v = var_bda;
	    int i_13_ = ((ObjectDef) var_bda).A;
	    int i_14_ = ((ObjectDef) var_bda).J;
	    if (i_9_ == 1 || i_9_ == 3) {
		i_13_ = ((ObjectDef) var_bda).J;
		i_14_ = ((ObjectDef) var_bda).A;
	    }
	    ((ql) var_ql).y = i_11_ + i_14_ << 9;
	    ((ql) var_ql).t = ((ObjectDef) var_bda).gb << 9;
	    ((ql) var_ql).o = ((ObjectDef) var_bda).eb;
	    ((ql) var_ql).x = ((ObjectDef) var_bda).Cb;
	    ((ql) var_ql).E = ((ObjectDef) var_bda).n;
	    ((ql) var_ql).p = ((ObjectDef) var_bda).Nb;
	    ((ql) var_ql).z = i_13_ + i_10_ << 9;
	    ((ql) var_ql).J = ((ObjectDef) var_bda).m;
	    ((ql) var_ql).k = ((ObjectDef) var_bda).kb;
	    ((ql) var_ql).l = ((ObjectDef) var_bda).Qb;
	    if (((ObjectDef) var_bda).xb != null) {
		((ql) var_ql).u = true;
		var_ql.a((byte) -99);
	    }
	    if (((ql) var_ql).E != null)
		((ql) var_ql).D
		    = ((ql) var_ql).o + (int) ((double) (((ql) var_ql).l
							 - ((ql) var_ql).o)
					       * Math.random());
	    pu.o.b(var_ql, (byte) 93);
	} else if (class_ac != null) {
	    ((ql) var_ql).H = class_ac;
	    NPCDef var_du = ((NPC) class_ac).npcDef;
	    if (((NPCDef) var_du).L != null) {
		((ql) var_ql).u = true;
		var_du = var_du.a(-4261, cp.e);
	    }
	    if (var_du != null) {
		((ql) var_ql).y = ((NPCDef) var_du).Q + i_11_ << 9;
		((ql) var_ql).z = ((NPCDef) var_du).Q + i_10_ << 9;
		((ql) var_ql).p = te.a(false, class_ac);
		((ql) var_ql).t = ((NPCDef) var_du).pb << 9;
		((ql) var_ql).x = ((NPCDef) var_du).v;
		((ql) var_ql).J = ((NPCDef) var_du).h;
	    }
	    bea.h.b(var_ql, (byte) 93);
	} else if (var_qi != null) {
	    ((ql) var_ql).F = var_qi;
	    ((ql) var_ql).z = var_qi.i(-1) + i_10_ << 9;
	    ((ql) var_ql).y = i_11_ + var_qi.i(-1) << 9;
	    ((ql) var_ql).p = wea.a(var_qi, false);
	    ((ql) var_ql).J = ((Player) var_qi).Od;
	    ((ql) var_ql).x = ((Player) var_qi).sd;
	    ((ql) var_ql).t = ((Player) var_qi).xd << 9;
	    gl.O.a(var_ql, (byte) -65, (long) ((Entity) var_qi).lb);
	}
    }
    
    static {
	b = new GameOutPacket(36, 8);
    }
}
