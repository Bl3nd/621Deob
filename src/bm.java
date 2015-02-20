/* bm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class bm extends jt
{
    static GameOutPacket outgoingPacket78;
    static boolean h = false;
    static int i;
    static int[] j;
    
    static final void updateNPC(boolean bool, byte i) {
	pfa.e = 0;
	bm.i++;
	iq.i = 0;
	lfa.b(i - 32291);
	mw.b(i ^ ~0x1f, bool);
	nda.handleNPCUpdateMasks((byte) -78);
	boolean bool_0_ = false;
	for (int i_1_ = 0; i_1_ < iq.i; i_1_++) {
	    int i_2_ = ba.b[i_1_];
	    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_2_);
	    NPC class_ac = ((NPCNode) var_mi).l;
	    if (gea.n && oh.a(i_2_, (byte) -99))
		eq.b(-8234);
	    if (pm.currentTimedTicks != ((Entity) class_ac).U) {
		if (((NPC) class_ac).npcDef.a((byte) -44))
		    ei.a(class_ac, (byte) -122);
		class_ac.a((NPCDef) null, 0);
		bool_0_ = true;
		var_mi.unlink(i + 32);
	    }
	}
	if (i != -125)
	    updateNPC(false, (byte) 98);
	if (bool_0_) {
	    ObjectDef.Ib = uo.a.a((byte) -26);
	    uo.a.a(ii.npcNodes, (byte) -93);
	}
	if (((BytesParser) faa.loginStream).pos != ck.currentGameInPacketSize)
	    throw new RuntimeException("gnp1 pos:" + ((BytesParser) faa.loginStream).pos + " psize:"
				       + ck.currentGameInPacketSize);
	for (int i_3_ = 0; ps.npcCount > i_3_; i_3_++) {
	    if (uo.a.a(i - 32623, (long) gfa.npcIndices[i_3_]) == null)
		throw new RuntimeException("gnp2 pos:" + i_3_ + " size:"
					   + ps.npcCount);
	}
    }
    
    abstract waa b(byte i);
    
    public static void a(int i) {
	outgoingPacket78 = null;
	if (i == -23124)
	    j = null;
    }
    
    static {
	outgoingPacket78 = new GameOutPacket(78, -1);
	j = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
    }
}
