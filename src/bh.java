/* bh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bh extends pp
{
    static int s;
    private il t;
    static int u;
    static int v;
    static GameInPacket incomingPacket16 = new GameInPacket(16, 6);
    static int x;
    static int y;
    static fh z = new fh(8, 6);
    static GameOutPacket A = new GameOutPacket(31, -1);
    static GameInPacket sendStringGameInPacket = new GameInPacket(49, -2);
    static int[] C = new int[13];
    
    public static void b(byte i) {
	incomingPacket16 = null;
	A = null;
	C = null;
	if (i > 102) {
	    z = null;
	    sendStringGameInPacket = null;
	}
    }
    
    final int a(int i, int i_0_, int i_1_) {
	x++;
	if (t == null)
	    return i;
	GameInPacketHandler var_hda = (GameInPacketHandler) t.a(-32748, (long) i_0_);
	if (i_1_ != -1)
	    return 42;
	if (var_hda == null)
	    return i;
	return ((GameInPacketHandler) var_hda).k;
    }
    
    static final int a(int i, int i_2_, int i_3_, byte i_4_) {
	y++;
	int i_5_ = i_3_ / i_2_;
	if (i_4_ >= -78)
	    A = null;
	int i_6_ = i_3_ & i_2_ - 1;
	int i_7_ = i / i_2_;
	int i_8_ = i_2_ - 1 & i;
	int i_9_ = nj.a((byte) 105, i_5_, i_7_);
	int i_10_ = nj.a((byte) 105, i_5_ + 1, i_7_);
	int i_11_ = nj.a((byte) 105, i_5_, i_7_ + 1);
	int i_12_ = nj.a((byte) 105, i_5_ + 1, i_7_ + 1);
	int i_13_ = rq.a(i_2_, i_6_, i_9_, i_10_, (byte) -99);
	int i_14_ = rq.a(i_2_, i_6_, i_11_, i_12_, (byte) -78);
	return rq.a(i_2_, i_8_, i_13_, i_14_, (byte) -128);
    }
    
    private final void a(BytesParser var_es, int i, int i_15_) {
	v++;
	if (i != 14146)
	    sendStringGameInPacket = null;
	if (i_15_ == 249) {
	    int i_16_ = var_es.readUnsignedByte(-9268);
	    if (t == null) {
		int i_17_ = dfa.a(i_16_, i ^ 0x37c2);
		t = new il(i_17_);
	    }
	    for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
		boolean bool = var_es.readUnsignedByte(-9268) == 1;
		int i_19_ = var_es.readTribyte(i ^ ~0x3742);
		Node class_d;
		if (!bool)
		    class_d = new GameInPacketHandler(var_es.readInt(62));
		else
		    class_d = new aa(var_es.readString((byte) 118));
		t.a(class_d, (byte) -54, (long) i_19_);
	    }
	}
    }
    
    public bh() {
	/* empty */
    }
    
    final String a(boolean bool, int i, String string) {
	u++;
	if (t == null)
	    return string;
	if (bool != false)
	    return null;
	aa var_aa = (aa) t.a(-32748, (long) i);
	if (var_aa == null)
	    return string;
	return ((aa) var_aa).m;
    }
    
    final void a(BytesParser var_es, int i) {
	s++;
	if (i != 13)
	    b((byte) 41);
	for (;;) {
	    int i_20_ = var_es.readUnsignedByte(-9268);
	    if (i_20_ == 0)
		break;
	    a(var_es, i + 14133, i_20_);
	}
    }
}
