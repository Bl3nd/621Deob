/* bw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bw extends iea
{
    static int handlePlayerUpdates;
    int o;
    static GameInPacket incomingPacket115 = new GameInPacket(115, 12);
    static int q;
    int r;
    static long s = -1L;
    static re t;
    static Interface u = null;
    static int v = 104;
    
    public final wea a(int i) {
	if (i < 38)
	    v = 65;
	q++;
	return un.B;
    }
    
    bw(ct var_ct, rc var_rc, int i, int i_0_, int i_1_, int i_2_, int i_3_,
       int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
	super(var_ct, var_rc, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
	((bw) this).r = i_7_;
	((bw) this).o = i_8_;
    }
    
    static final void handlePlayerUpdating(byte i, LoginStream stream) {
		handlePlayerUpdates++;
		stream.initBits(8);
		int skipAmount = 0;
		for (int loopID = 0; loopID < oca.inScreenPlayers; loopID++) {
		    int currentPlayerID = vd.inScreenPlayerIDs[loopID];
		    if ((0x1 & tea.skipHistory[currentPlayerID]) == 0) {
				if (skipAmount > 0) {
				    tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				    skipAmount--;
				} else {
				    int shouldSkip = stream.readBits(false, 1);
				    if (shouldSkip == 0) {
						skipAmount = gn.readSkip(11, stream);
						tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				    } else
				    	PlayerUpdateLocation.inScreenPlayerUpdate(stream, -36, currentPlayerID);
				}
		    }
		}
		stream.finishBits((byte) -58);
		if (skipAmount != 0)
		    throw new RuntimeException("nsn0");
		if (i > -46)
		    handlePlayerUpdating((byte) 117, null);
		stream.initBits(8);
		for (int loopID = 0; loopID < oca.inScreenPlayers; loopID++) {
		    int currentPlayerID = vd.inScreenPlayerIDs[loopID];
		    if ((0x1 & tea.skipHistory[currentPlayerID]) != 0) {
			if (skipAmount > 0) {
			    skipAmount--;
			    tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
			} else {
			    int shouldSkip = stream.readBits(false, 1);
			    if (shouldSkip == 0) {
					skipAmount = gn.readSkip(11, stream);
					tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
			    } else
			    	PlayerUpdateLocation.inScreenPlayerUpdate(stream, -35, currentPlayerID);
			}
		    }
		}
		stream.finishBits((byte) -68);
		if (skipAmount != 0)
		    throw new RuntimeException("nsn1");
		stream.initBits(8);
		for (int loopID = 0; lu.outScreenPlayers > loopID; loopID++) {
		    int currentPlayerID = gba.outScreenPlayerIDs[loopID];
		    if ((tea.skipHistory[currentPlayerID] & 0x1) != 0) {
				if (skipAmount > 0) {
				    tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				    skipAmount--;
				} else {
				    int shouldSkip = stream.readBits(false, 1);
				    if (shouldSkip == 0) {
						skipAmount = gn.readSkip(11, stream);
						tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				    } else if (re.outScreenPlayerUpdate(stream, currentPlayerID, 31261))
				    	tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				}
		    }
		}
		stream.finishBits((byte) -64);
		if (skipAmount != 0)
		    throw new RuntimeException("nsn2");
		stream.initBits(8);
		for (int loopID = 0; lu.outScreenPlayers > loopID; loopID++) {
		    int currentPlayerID = gba.outScreenPlayerIDs[loopID];
		    if ((tea.skipHistory[currentPlayerID] & 0x1) == 0) {
				if (skipAmount > 0) {
				    tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				    skipAmount--;
				} else {
				    int shouldSkip = stream.readBits(false, 1);
				    if (shouldSkip == 0) {
						skipAmount = gn.readSkip(11, stream);
						tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				    } else if (re.outScreenPlayerUpdate(stream, currentPlayerID, 31261))
				    	tea.skipHistory[currentPlayerID] = (byte) hba.bitwiseArg1ORArg2(tea.skipHistory[currentPlayerID], 2);
				}
		    }
		}
		stream.finishBits((byte) -122);
		if (skipAmount != 0)
		    throw new RuntimeException("nsn3");
		lu.outScreenPlayers = 0;
		oca.inScreenPlayers = 0;
		for (int playerID = 1; playerID < 2048; playerID++) {
		    tea.skipHistory[playerID] >>= 1;
		    Player p = Class_fc.playersInScreen[playerID];
		    if (p == null)
		    	gba.outScreenPlayerIDs[lu.outScreenPlayers++] = playerID;
		    else
		    	vd.inScreenPlayerIDs[oca.inScreenPlayers++] = playerID;
		}
    }
    
    public static void a(boolean bool) {
	if (bool != false)
	    u = null;
	t = null;
	incomingPacket115 = null;
	u = null;
    }
}
