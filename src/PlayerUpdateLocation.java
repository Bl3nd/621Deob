/* cn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class PlayerUpdateLocation {

    static int a;
    private tb b = new tb(64);
    static int inScreenPlayerUpdates;
    static int d;
    pl e;
    static int f;
    private pl g;
    static int h;

    protected static ida a(int height, int x, int y) {
        vf vf = ol.p[height][x][y];
        if (vf == null) {
            return null;
        }
        return vf.f;
    }

    public static void inScreenPlayerUpdate(LoginStream stream, int dummy, int playerID) {
        inScreenPlayerUpdates++;
        boolean needUpdate = stream.readBits(false, 1) == 1;
        if (needUpdate) {
            fca.f[vu.a++] = playerID;
        }
        int action = stream.readBits(false, 2);
        Player player = Class_fc.playersInScreen[playerID];
        if (action == 0) {
            if (needUpdate) {
                player.Vc = false;
            } else {
                if (ih.n == playerID) {
                    throw new RuntimeException("s:lr");
                }
                GPIPlayer gpiPlayer = ega.gpiPlayers[playerID] = new GPIPlayer();
                gpiPlayer.locationHash = ((bfa.thisPlayersRegionX + player.regionLocalX[0] >> 6 << 14) + ((player.height << 28)
                        + (BytesParser.thisPlayersRegionY + player.regionLocalY[0] >> 6)));
                if (player.orientation == -1) {
                    gpiPlayer.orientation = player.class_kd.getOrientation((byte) 67);
                } else {
                    gpiPlayer.orientation = player.orientation;
                }
                gpiPlayer.faceEntityID = player.faceEntityID;
                gpiPlayer.b = player.cd;
                if (player.xd > 0) {
                    jn.a((byte) 70, player);
                }
                Class_fc.playersInScreen[playerID] = null;
                if (stream.readBits(false, 1) != 0) {
                    re.outScreenPlayerUpdate(stream, playerID, 31261);
                }
            }
        } else if (action == 1) {
            int walkDir = stream.readBits(false, 3);
            int x = player.regionLocalX[0];
            int y = player.regionLocalY[0];
            if (walkDir != 0) {
                if (walkDir == 1) {
                    y--;
                } else if (walkDir != 2) {
                    if (walkDir != 3) {
                        if (walkDir == 4) {
                            x++;
                        } else if (walkDir == 5) {
                            x--;
                            y++;
                        } else if (walkDir != 6) {
                            if (walkDir == 7) {
                                x++;
                                y++;
                            }
                        } else {
                            y++;
                        }
                    } else {
                        x--;
                    }
                } else {
                    x++;
                    y--;
                }
            } else {
                y--;
                x--;
            }
            if (!needUpdate) {
                player.updateLocation(hg.moveTypePerPlayer[playerID], y, -1157357879, x);
            } else {
                player.playerX = x;
                player.playerY = y;
                player.Vc = true;
            }
        } else if (action == 2) {
            int runDir = stream.readBits(false, 4);
            int x = player.regionLocalX[0];
            int y = player.regionLocalY[0];
            if (runDir != 0) {
                if (runDir == 1) {
                    x--;
                    y -= 2;
                } else if (runDir == 2) {
                    y -= 2;
                } else if (runDir == 3) {
                    x++;
                    y -= 2;
                } else if (runDir == 4) {
                    x += 2;
                    y -= 2;
                } else if (runDir == 5) {
                    x -= 2;
                    y--;
                } else if (runDir != 6) {
                    if (runDir == 7) {
                        x -= 2;
                    } else if (runDir != 8) {
                        if (runDir != 9) {
                            if (runDir != 10) {
                                if (runDir != 11) {
                                    if (runDir == 12) {
                                        x--;
                                        y += 2;
                                    } else if (runDir == 13) {
                                        y += 2;
                                    } else if (runDir != 14) {
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
                    } else {
                        x += 2;
                    }
                } else {
                    y--;
                    x += 2;
                }
            } else {
                x -= 2;
                y -= 2;
            }
            if (needUpdate) {
                player.Vc = true;
                player.playerX = x;
                player.playerY = y;
            } else {
                player.updateLocation(hg.moveTypePerPlayer[playerID], y, -1157357879, x);
            }
        } else {
            int distance = stream.readBits(false, 1);
            if (distance == 0) {
                int deltaHash = stream.readBits(false, 12);
                int deltaHeight = deltaHash >> 10;
                int deltaX = (0x3f8 & deltaHash) >> 5;
                if (deltaX > 15) {
                    deltaX -= 32;
                }
                int deltaY = deltaHash & 0x1f;
                if (deltaY > 15) {
                    deltaY -= 32;
                }
                int toX = deltaX + player.regionLocalX[0];
                int toY = deltaY + player.regionLocalY[0];
                if (!needUpdate) {
                    player.updateLocation(hg.moveTypePerPlayer[playerID], toY, -1157357879, toX);
                } else {
                    player.Vc = true;
                    player.playerY = toY;
                    player.playerX = toX;
                }
                player.height = player.height_ = (byte) (player.height + deltaHeight & 0x3);
                if (ItemDef.b(toY, toX, 5706)) {
                    player.height_++;
                }
                if (playerID == ih.n) {
                    vo.clientHeight = player.height;
                }
            } else {
                int deltaHash = stream.readBits(false, 30);
                int heightDelta = deltaHash >> 28;
                int deltaX = (0xfffe318 & deltaHash) >> 14;
                int deltaY = deltaHash & 0x3fff;
                int toX = (0x3fff & player.regionLocalX[0] + (bfa.thisPlayersRegionX + deltaX)) - bfa.thisPlayersRegionX;
                int toY = (0x3fff & BytesParser.thisPlayersRegionY + (player.regionLocalY[0] + deltaY)) - BytesParser.thisPlayersRegionY;
                if (needUpdate) {
                    player.playerY = toY;
                    player.playerX = toX;
                    player.Vc = true;
                } else {
                    player.updateLocation(hg.moveTypePerPlayer[playerID], toY, -1157357879, toX);
                }
                player.height = player.height_ = (byte) (0x3 & heightDelta + player.height);
                if (ItemDef.b(toY, toX, 5706)) {
                    player.height_++;
                }
                if (playerID == ih.n) {
                    vo.clientHeight = player.height;
                }
                if (dummy <= -25) {
                    /* empty */
                }
            }
        }
    }

    public final void a(int i) {
        synchronized (b) {
            b.a(18385);
        }
        h++;
        if (i != 4468) {
            b = null;
        }
    }

    public final void a(byte b) {
        synchronized (this.b) {
            if (b >= -80) {
                return;
            }
            this.b.c((byte) -119);
        }
        d++;
    }

    public final dn a(byte b, int id) {
        f++;
        dn dn;
        synchronized (this.b) {
            dn = (dn) this.b.get((long) id, (byte) 100);
        }
        if (b < 19) {
            this.e = null;
        }
        if (dn != null) {
            return dn;
        }
        byte[] buf;
        synchronized (g) {
            buf = g.b(id, 21, 3);
        }
        dn = new dn();
        dn.b = this;
        if (buf != null) {
            dn.a(64, new BytesParser(buf));
        }
        synchronized (this.b) {
            this.b.put((long) id, dn, 1);
        }
        return dn;
    }

    public final void b(byte b, int i) {
        a++;
        synchronized (this.b) {
            this.b.a(true, i);
            if (b > -53) {
                a((byte) -66, 125);
            }
        }
    }

    public PlayerUpdateLocation(Class_rf class_rf, int i, pl pl, pl pl1) {
        this.e = pl1;
        g = pl;
        g.a(3, true);
    }
}
