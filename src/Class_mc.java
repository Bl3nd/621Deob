/* Class_mc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_mc
{
    int a;
    float b;
    float c = 1.0F;
    static int d;
    static int e;
    int f;
    int g;
    static int h;
    static int i;
    int j;
    float k;
    static int[] l = new int[14];
    int m;
    float n = 1.0F;
    float o;
    jt p;
    int q;
    float r = 0.25F;
    static int s;
    
    static final short[] a(int i, int i_0_, short[] is) {
	s++;
	short[] is_1_ = new short[i_0_];
	int i_2_ = -103 / ((47 - i) / 44);
	co.a(is, 0, is_1_, 0, i_0_);
	return is_1_;
    }
    
    public static void a(int i) {
	if (i <= -121)
	    l = null;
    }
    
    final boolean a(int i, Class_mc class_mc_3_) {
	if (i != 100)
	    return true;
	e++;
	if (((Class_mc) this).m != ((Class_mc) class_mc_3_).m
	    || ((Class_mc) this).k != ((Class_mc) class_mc_3_).k
	    || ((Class_mc) this).o != ((Class_mc) class_mc_3_).o
	    || ((Class_mc) class_mc_3_).b != ((Class_mc) this).b
	    || ((Class_mc) this).r != ((Class_mc) class_mc_3_).r
	    || ((Class_mc) class_mc_3_).n != ((Class_mc) this).n
	    || ((Class_mc) this).c != ((Class_mc) class_mc_3_).c
	    || ((Class_mc) this).f != ((Class_mc) class_mc_3_).f
	    || ((Class_mc) class_mc_3_).q != ((Class_mc) this).q
	    || ((Class_mc) this).p != ((Class_mc) class_mc_3_).p)
	    return false;
	return true;
    }
    
    final void a(int i, BytesParser var_es) {
	d++;
	((Class_mc) this).n = (float) (8 * var_es.readUnsignedByte(-9268)) / 255.0F;
	((Class_mc) this).r = (float) (var_es.readUnsignedByte(-9268) * 8) / 255.0F;
	((Class_mc) this).c = (float) (var_es.readUnsignedByte(i ^ ~0x243b) * i) / 255.0F;
    }
    
    static final void a(byte i, pn var_pn) {
	int i_4_ = 47 / ((-65 - i) / 34);
	if (((pn) var_pn).n != null)
	    ((bo) ((pn) var_pn).n).k = 0;
	h++;
	((pn) var_pn).l = false;
	for (pn var_pn_5_ = var_pn.a(); var_pn_5_ != null;
	     var_pn_5_ = var_pn.b())
	    a((byte) 105, var_pn_5_);
    }
    
    static final void b(int i) {
	or.a((int) -71);
	Class_mc.i++;
	jt.c = null;
	sw.currentGameInPacket = null;
	ClientScript.gameInPacket = null;
	dj.b = 0;
	ck.currentGameInPacketSize = 0;
	gv.a = 0;
	((BytesParser) faa.loginStream).pos = 0;
	ng.u = null;
	sd.a(-128);
	vp.a(0);
	for (int i_6_ = 0; i_6_ < 2048; i_6_++)
	    Class_fc.playersInScreen[i_6_] = null;
	up.thisPlayer = null;
	for (int i_7_ = 0; ObjectDef.Ib > i_7_; i_7_++) {
	    NPC class_ac = ((NPCNode) ii.npcNodes[i_7_]).npc;
	    if (class_ac != null)
		((Entity) class_ac).faceEntityID = -1;
	}
	fba.c((byte) -61);
	ll.x = 1;
	ja.Cc = dj.o = -1;
	if (i != 29723)
	    l = null;
	ei.a(10, 20);
	for (int i_8_ = 0; i_8_ < 100; i_8_++)
	    la.q[i_8_] = true;
	jp.a(true);
	pga.a = 0L;
	bg.a = null;
    }
    
    public Class_mc() {
	((Class_mc) this).a = -60;
	((Class_mc) this).q = 0;
	((Class_mc) this).m = iea.h;
	((Class_mc) this).p = da.a;
	((Class_mc) this).b = 1.2F;
	((Class_mc) this).j = -50;
	((Class_mc) this).g = -50;
	((Class_mc) this).k = 1.1523438F;
	((Class_mc) this).o = 0.69921875F;
	((Class_mc) this).f = sea.b;
    }
    
    Class_mc(BytesParser var_es) {
	int i = var_es.readUnsignedByte(-9268);
	if (!cs.g.a((int) -67, on.performance) || lm.Kh.c() <= 0) {
	    if ((i & 0x1) != 0)
		var_es.readInt(88);
	    if ((i & 0x2) != 0)
		var_es.readShort(13111);
	    if ((i & 0x4) != 0)
		var_es.readShort(13111);
	    if ((0x8 & i) != 0)
		var_es.readShort(13111);
	    ((Class_mc) this).k = 1.1523438F;
	    ((Class_mc) this).o = 0.69921875F;
	    ((Class_mc) this).b = 1.2F;
	    ((Class_mc) this).m = iea.h;
	} else {
	    if ((0x1 & i) == 0)
		((Class_mc) this).m = iea.h;
	    else
		((Class_mc) this).m = var_es.readInt(115);
	    if ((0x2 & i) != 0)
		((Class_mc) this).k = (float) var_es.readShort(13111) / 256.0F;
	    else
		((Class_mc) this).k = 1.1523438F;
	    if ((0x4 & i) == 0)
		((Class_mc) this).o = 0.69921875F;
	    else
		((Class_mc) this).o = (float) var_es.readShort(13111) / 256.0F;
	    if ((i & 0x8) == 0)
		((Class_mc) this).b = 1.2F;
	    else
		((Class_mc) this).b = (float) var_es.readShort(13111) / 256.0F;
	}
	if ((0x10 & i) != 0) {
	    ((Class_mc) this).g = var_es.readShort2(99);
	    ((Class_mc) this).a = var_es.readShort2(114);
	    ((Class_mc) this).j = var_es.readShort2(28);
	} else {
	    ((Class_mc) this).g = -50;
	    ((Class_mc) this).a = -60;
	    ((Class_mc) this).j = -50;
	}
	if ((i & 0x20) != 0)
	    ((Class_mc) this).f = var_es.readInt(87);
	else
	    ((Class_mc) this).f = sea.b;
	if ((i & 0x40) != 0)
	    ((Class_mc) this).q = var_es.readShort(13111);
	else
	    ((Class_mc) this).q = 0;
	if ((0x80 & i) != 0) {
	    int i_9_ = var_es.readShort(13111);
	    int i_10_ = var_es.readShort(13111);
	    int i_11_ = var_es.readShort(13111);
	    int i_12_ = var_es.readShort(13111);
	    int i_13_ = var_es.readShort(13111);
	    int i_14_ = var_es.readShort(13111);
	    ((Class_mc) this).p
		= wi.a(i_9_, i_12_, i_13_, i_14_, i_11_, i_10_, false);
	} else
	    ((Class_mc) this).p = da.a;
    }
}
