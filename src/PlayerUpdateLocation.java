/* cn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerUpdateLocation
{
    static int a;
    private tb b = new tb(64);
    static int inScreenPlayerUpdates;
    static int d;
    pl e;
    static int f;
    private pl g;
    static int h;
    
    static final ida a(int i, int i_0_, int i_1_) {
	vf var_vf = ol.p[i][i_0_][i_1_];
	if (var_vf == null)
	    return null;
	return ((vf) var_vf).f;
    }
    
    static final void inScreenPlayerUpdate(LoginStream stream, int dummy, int playerID) {
		inScreenPlayerUpdates++;
		boolean needUpdate = stream.readBits(false, 1) == 1;
		if (needUpdate)
		    fca.f[vu.a++] = playerID;
		int action = stream.readBits(false, 2);
		Player p = Class_fc.playersInScreen[playerID];
		if (action == 0) {
		    if (needUpdate)
		    	((Player) p).Vc = false;
		    else {
			if (ih.n == playerID)
			    throw new RuntimeException("s:lr");
			GPIPlayer var_qq = ega.gpiPlayers[playerID] = new GPIPlayer();
			((GPIPlayer) var_qq).locationHash = ((bfa.thisPlayersRegionX + ((Entity) p).regionLocalX[0] >> 6 << 14) + ((((Animable) p).height << 28) + (BytesParser.thisPlayersRegionY + ((Entity) p).regionLocalY[0] >> 6)));
			if (((Player) p).orientation == -1)
			    ((GPIPlayer) var_qq).orientation = ((Entity) p).class_kd.getOrientation((byte) 67);
			else
			    ((GPIPlayer) var_qq).orientation = ((Player) p).orientation;
			((GPIPlayer) var_qq).faceEntityID = ((Entity) p).faceEntityID;
			((GPIPlayer) var_qq).b = ((Player) p).cd;
			if (((Player) p).xd > 0)
			    jn.a((byte) 70, p);
			Class_fc.playersInScreen[playerID] = null;
			if (stream.readBits(false, 1) != 0)
			    re.outScreenPlayerUpdate(stream, playerID, 31261);
		    }
		} else if (action == 1) {
		    int walkDir = stream.readBits(false, 3);
		    int x = ((Entity) p).regionLocalX[0];
		    int y = ((Entity) p).regionLocalY[0];
		    if (walkDir != 0) {
				if (walkDir == 1)
				    y--;
				else if (walkDir != 2) {
				    if (walkDir != 3) {
						if (walkDir == 4)
						    x++;
						else if (walkDir == 5) {
						    x--;
						    y++;
						} else if (walkDir != 6) {
						    if (walkDir == 7) {
								x++;
								y++;
						    }
						} else
						    y++;
				    } else
				    	x--;
				} else {
				    x++;
				    y--;
				}
		    } else {
				y--;
				x--;
		    }
		    if (!needUpdate)
		    	p.updateLocation(hg.moveTypePerPlayer[playerID], y, -1157357879, x);
		    else {
				((Player) p).kd = x;
				((Player) p).rd = y;
				((Player) p).Vc = true;
		    }
		} else if (action == 2) {
		    int runDir = stream.readBits(false, 4);
		    int x = ((Entity) p).regionLocalX[0];
		    int y = ((Entity) p).regionLocalY[0];
		    if (runDir != 0) {
				if (runDir == 1) {
				    x--;
				    y -= 2;
				} else if (runDir == 2)
				    y -= 2;
				else if (runDir == 3) {
				    x++;
				    y -= 2;
				} else if (runDir == 4) {
				    x += 2;
				    y -= 2;
				} else if (runDir == 5) {
				    x -= 2;
				    y--;
				} else if (runDir != 6) {
				    if (runDir == 7)
						x -= 2;
				    else if (runDir != 8) {
						if (runDir != 9) {
						    if (runDir != 10) {
								if (runDir != 11) {
								    if (runDir == 12) {
										x--;
										y += 2;
								    } else if (runDir == 13)
								    	y += 2;
								    else if (runDir != 14) {
										if (runDir == 15) {
										    x += 2;
										    y += 2;
										}
								    } else {
										x++;
										y += 2;
								    }
								} else {
								    x -= 2;
								    y += 2;
								}
						    } else {
								x += 2;
								y++;
						    }
						} else {
						    y++;
						    x -= 2;
						}
				    } else
				    	x += 2;
				} else {
				    y--;
				    x += 2;
				}
		    } else {
				x -= 2;
				y -= 2;
		    }
		    if (needUpdate) {
				((Player) p).Vc = true;
				((Player) p).kd = x;
				((Player) p).rd = y;
		    } else
		    	p.updateLocation(hg.moveTypePerPlayer[playerID], y, -1157357879, x);
		} else {
		    int distance = stream.readBits(false, 1);
		    if (distance == 0) {
			    int deltaHash = stream.readBits(false, 12);
				int deltaHeight = deltaHash >> 10;
				int deltaX = (0x3f8 & deltaHash) >> 5;
				if (deltaX > 15)
				    deltaX -= 32;
				int deltaY = deltaHash & 0x1f;
				if (deltaY > 15)
				    deltaY -= 32;
				int toX = deltaX + ((Entity) p).regionLocalX[0];
				int toY = deltaY + ((Entity) p).regionLocalY[0];
				if (!needUpdate)
				    p.updateLocation(hg.moveTypePerPlayer[playerID], toY, -1157357879, toX);
				else {
				    ((Player) p).Vc = true;
				    ((Player) p).rd = toY;
				    ((Player) p).kd = toX;
				}
				((Animable) p).height = ((Animable) p).h = (byte) (((Animable) p).height + deltaHeight & 0x3);
				if (ItemDef.b(toY, toX, 5706))
				    ((Animable) p).h++;
				if (playerID == ih.n)
				    vo.clientHeight = ((Animable) p).height;
		    } else {
				int deltaHash = stream.readBits(false, 30);
				int heightDelta = deltaHash >> 28;
				int deltaX = (0xfffe318 & deltaHash) >> 14;
				int deltaY = deltaHash & 0x3fff;
				int toX = (0x3fff & ((Entity) p).regionLocalX[0] + (bfa.thisPlayersRegionX + deltaX)) - bfa.thisPlayersRegionX;
				int toY = (0x3fff & BytesParser.thisPlayersRegionY + (((Entity) p).regionLocalY[0] + deltaY)) - BytesParser.thisPlayersRegionY;
				if (needUpdate) {
				    ((Player) p).rd = toY;
				    ((Player) p).kd = toX;
				    ((Player) p).Vc = true;
				} else
				    p.updateLocation(hg.moveTypePerPlayer[playerID], toY, -1157357879, toX);
				((Animable) p).height = ((Animable) p).h
				    = (byte) (0x3 & heightDelta + ((Animable) p).height);
				if (ItemDef.b(toY, toX, 5706))
				    ((Animable) p).h++;
				if (playerID == ih.n)
				    vo.clientHeight = ((Animable) p).height;
				if (dummy <= -25) {
				    /* empty */
				}
		    }
		}
    }
    
    final void a(int i) {
	synchronized (b) {
	    b.a(18385);
	}
	h++;
	if (i != 4468)
	    b = null;
    }
    
    final void a(byte i) {
	synchronized (b) {
	    if (i >= -80)
		return;
	    b.c((byte) -119);
	}
	d++;
    }
    
    final dn a(byte i, int i_23_) {
	f++;
	dn var_dn;
	synchronized (b) {
	    var_dn = (dn) b.get((long) i_23_, (byte) 100);
	}
	if (i < 19)
	    ((PlayerUpdateLocation) this).e = null;
	if (var_dn != null)
	    return var_dn;
	byte[] is;
	synchronized (g) {
	    is = g.b(i_23_, 21, 3);
	}
	var_dn = new dn();
	((dn) var_dn).b = this;
	if (is != null)
	    var_dn.a(64, new BytesParser(is));
	synchronized (b) {
	    b.put((long) i_23_, var_dn, 1);
	}
	return var_dn;
    }
    
    final void b(byte i, int i_24_) {
	a++;
	synchronized (b) {
	    b.a(true, i_24_);
	    if (i > -53)
		a((byte) -66, 125);
	}
    }
    
    PlayerUpdateLocation(Class_rf class_rf, int i, pl var_pl, pl var_pl_25_) {
	((PlayerUpdateLocation) this).e = var_pl_25_;
	g = var_pl;
	g.a(3, true);
    }
}
