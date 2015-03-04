/* hda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

@SuppressWarnings("ALL")
public final class GameInPacketHandler extends Node {

    public int k;
    public static int parseIncomingPackets;
    public static baa baa = new baa(13, 0, 1, 0);
    public static int[] var_n = new int[4];
    public static int isKeyTyped;

	public static boolean parseIncomingPackets(int i) throws IOException {
		GameInPacketHandler.parseIncomingPackets++;
		if (ce.y == null) {
            return false;
        }
		if (sw.currentGameInPacket == null) {
			if (qba.y) {
				if (!ce.y.a(1, (byte) 115)) {
                    return false;
                }
				ce.y.a((byte) 120, 0, faa.loginStream.bytes, 1);
				gv.a = 0;
				ga.J++;
				qba.y = false;
			}
			faa.loginStream.pos = 0;
			if (faa.loginStream.m((byte) 17)) {
				if (!ce.y.a(1, (byte) 115)) {
                    return false;
                }
				ce.y.a((byte) 72, 1, faa.loginStream.bytes, 1);
				gv.a = 0;
				ga.J++;
			}
			qba.y = true;
			GameInPacket[] gameInPackets = IncomingPackets.getGameInPackets((byte) -117);
			int currentPacketID = faa.loginStream.f(false);
			if (currentPacketID < 0 || currentPacketID >= gameInPackets.length) {
                throw new IOException("invo:" + currentPacketID + " ip:" + faa.loginStream.pos);
            }
			sw.currentGameInPacket = gameInPackets[currentPacketID];
			ck.currentGameInPacketSize = sw.currentGameInPacket.packetSize;
			if (currentPacketID != 68 && currentPacketID != 61) {
                Console.printPacketActivation("GameInPacket: " + currentPacketID + ", " + ck.currentGameInPacketSize);
            }
		}
		if (ck.currentGameInPacketSize == -1) {
			if (!ce.y.a(1, (byte) 113)) {
                return false;
            }
			ce.y.a((byte) 92, 0, faa.loginStream.bytes, 1);
			gv.a = 0;
			ck.currentGameInPacketSize = faa.loginStream.bytes[0] & 0xff;
			ga.J++;
		}
		if (ck.currentGameInPacketSize == -2) {
			if (!ce.y.a(2, (byte) -108)) {
                return false;
            }
			ce.y.a((byte) 113, 0, faa.loginStream.bytes, 2);
			faa.loginStream.pos = 0;
			ck.currentGameInPacketSize = faa.loginStream.readShort(13111);
			ga.J += 2;
			gv.a = 0;
		}
		if (ck.currentGameInPacketSize > 0) {
			if (!ce.y.a(ck.currentGameInPacketSize, (byte) 114)) {
                return false;
            }
			faa.loginStream.pos = 0;
			ce.y.a((byte) 94, 0, faa.loginStream.bytes, ck.currentGameInPacketSize);
			gv.a = 0;
			ga.J += ck.currentGameInPacketSize;
		}
		jt.incomingPacket = ClientScript.gameInPacket;
		ClientScript.gameInPacket = ng.u;
		ng.u = sw.currentGameInPacket;

        /**
         * Incoming Packet 63.
         */
		if (te.incomingPacket63 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming packet 63.");
			Class_hb.v = faa.loginStream.readShort2(41);
			tda.i = tb.u;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Complete Logout Incoming Packet.
         */
		if (sw.currentGameInPacket == sv.completeLogoutGameInPacket) {
            System.out.println("[GamInPacketHandler] Complete Logout incoming packet.");
			la.logout((byte) 33, false);
			sw.currentGameInPacket = null;
			return false;
		}

        /**
         * Incoming Packet 74.
         */
		if (pi.incomingPacket_74 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 74.");
			int id = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int k = faa.loginStream.readUnsignedByte(-9268);
			int i1 = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int delayAndHeight = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int k1 = faa.loginStream.readInt(104);
			boolean bool = (0x80 & k) != 0;
			if (k1 >> 30 == 0) {
				if (k1 >> 29 == 0) {
					if (k1 >> 28 != 0) {
						int inScreenIndex = 0xffff & k1;
						Player player;
						if (ih.n == inScreenIndex) {
                            player = up.thisPlayer;
                        } else {
                            player = Class_fc.playersInScreen[inScreenIndex];
                        }
						if (player != null) {
							if (id == 65535) {
                                id = -1;
                            }
							boolean bool1 = true;
							int graphicsId = !bool ? player.graphicsId_ : player.graphicsId;
							if ((~id) != 0 && (~graphicsId) != 0) {
								if (graphicsId != id) {
									iv iv = Class_ic.H.a((byte) 12, id);
									iv iv1 = Class_ic.H.a((byte) 12, graphicsId);
									if ((~iv.w) != 0 && iv1.w != -1) {
										dr dr = Class_ef.J.c(i + 65, iv.w);
										dr dr1 = Class_ef.J.c(64, iv1.w);
										if (dr1.t > dr.t) {
                                            bool1 = false;
                                        }
									}
								} else {
									iv iv = Class_ic.H.a((byte) 12, id);
									if (iv.d && ((~iv.w) != 0)) {
										dr dr = Class_ef.J.c(64, iv.w);
										int i2 = dr.g;
										if (i2 != 0 && i2 != 2) {
											if (i2 == 1) {
                                                bool1 = true;
                                            }
										} else {
                                            bool1 = false;
                                        }
									}
								}
							}
							if (bool1) {
								if (!bool) {
									player.qb = 0;
									player.rotation_ = k & 0x7;
									player.Ob = 1;
									player.graphicsId_ = id;
									player.Fb = i1 + pm.currentTimedTicks;
									player.Pb = delayAndHeight;
									player.kc = 0;
									if (player.Fb > pm.currentTimedTicks) {
                                        player.kc = -1;
                                    }
									if (player.graphicsId_ == 65535) {
                                        player.graphicsId_ = -1;
                                    }
									if (player.graphicsId_ != -1 && pm.currentTimedTicks == player.Fb) {
										int i2 = (Class_ic.H.a((byte) 12, player.graphicsId_).w);
										if (i2 != -1) {
											dr dr = Class_ef.J.c(64, i2);
											if (dr != null && dr.p != null) {
                                                qga.a(player.height, dr, player.locX, player.locY, 107, 0, up.thisPlayer == player);
                                            }
										}
									}
								} else {
									player.rotation = 0x7 & k;
									player.S = i1 + pm.currentTimedTicks;
									player.mb = 0;
									player.graphicsId = id;
									player.P = 1;
									player.delayAndHeight = delayAndHeight;
									player.pc = 0;
									if (player.S > pm.currentTimedTicks) {
                                        player.mb = -1;
                                    }
									if (player.graphicsId == 65535) {
                                        player.graphicsId = -1;
                                    }
									if (player.graphicsId != -1 && pm.currentTimedTicks == player.S) {
										int i2 = (Class_ic.H.a((byte) 12, player.graphicsId).w);
										if ((~i2) != 0) {
											dr dr = Class_ef.J.c(64, i2);
											if (dr != null && dr.p != null) {
                                                qga.a(player.height, dr, player.locX, player.locY, 124, 0, up.thisPlayer == player);
                                            }
										}
									}
								}
							}
						}
					}
				} else {
					int configId = k1 & 0xffff;
					NPCNode npcNode = (NPCNode) uo.a.a(-32748, (long) configId);
					if (npcNode != null) {
						if (id == 65535) {
                            id = -1;
                        }
						NPC npc = npcNode.npc;
						boolean bool1 = true;
						int graphicsId = bool ? npc.graphicsId : npc.graphicsId_;
						if ((~id) != 0 && graphicsId != -1) {
							if (graphicsId != id) {
								iv iv = Class_ic.H.a((byte) 12, id);
								iv iv1 = Class_ic.H.a((byte) 12, graphicsId);
								if (iv.w != -1 && iv1.w != -1) {
									dr dr = Class_ef.J.c(64, iv.w);
									dr dr1 = Class_ef.J.c(64, iv1.w);
									if (dr.t < dr1.t) {
                                        bool1 = false;
                                    }
								}
							} else {
								iv iv = Class_ic.H.a((byte) 12, id);
								if (iv.d && (~iv.w) != 0) {
									dr dr = Class_ef.J.c(64, iv.w);
									int i2 = dr.g;
									if (i2 == 0 || i2 == 2) {
                                        bool1 = false;
                                    } else if (i2 == 1) {
                                        bool1 = true;
                                    }
								}
							}
						}
						if (bool1) {
							if (bool) {
								npc.mb = 0;
								npc.delayAndHeight = delayAndHeight;
								npc.S = pm.currentTimedTicks + i1;
								npc.rotation = k & 0x7;
								npc.graphicsId = id;
								npc.pc = 0;
								npc.P = 1;
								if (npc.S > pm.currentTimedTicks) {
                                    npc.mb = -1;
                                }
								if (npc.graphicsId != -1 && pm.currentTimedTicks == npc.S) {
									int i2 = (Class_ic.H.a((byte) 12, npc.graphicsId).w);
									if (i2 != -1) {
										dr dr = Class_ef.J.c(64, i2);
										if (dr != null && dr.p != null)
											qga.a(npc.height, dr, npc.locX, npc.locY, 117, 0, false);
									}
								}
							} else {
								npc.kc = 0;
								npc.rotation_ = k & 0x7;
								npc.Pb = delayAndHeight;
								npc.graphicsId_ = id;
								npc.qb = 0;
								npc.Ob = 1;
								npc.Fb = i1 + pm.currentTimedTicks;
								if (npc.Fb > pm.currentTimedTicks) {
                                    npc.kc = -1;
                                }
								if ((~npc.graphicsId_) != 0 && npc.Fb == pm.currentTimedTicks) {
									int i2 = (Class_ic.H.a((byte) 12, npc.graphicsId_).w);
									if (i2 != -1) {
										dr dr = Class_ef.J.c(64, i2);
										if (dr != null && dr.p != null) {
                                            qga.a(npc.height, dr, npc.locX, npc.locY, 115, 0, false);
                                        }
									}
								}
							}
						}
					}
				}
			} else {
				int i2 = (k1 & 0x3bcf0558) >> 28;
				int playerX = (k1 >> 14 & 0x3fff) - bfa.thisPlayersRegionX;
				int playerY = (0x3fff & k1) - BytesParser.thisPlayersRegionY;
				if (playerX >= 0 && playerY >= 0 && Class_hc.e > playerX && bw.v > playerY) {
					int x = 512 * playerX + 256;
					int y = 512 * playerY + 256;
					int j2 = i2;
					if (j2 < 3 && ItemDef.b(playerY, playerX, 5706)) {
                        j2++;
                    }
					od od = new od(id, 0, pm.currentTimedTicks, i2, j2, x, Class_u.b(x, i2, -20214, y) - delayAndHeight, y, playerX,
                            playerX, playerY, playerY, k & 0x7);
					rv.o.b(new ud(od), (byte) 93);
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 2.
         */
		if (hi.incomingPacket2 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 2.");
			cp.e.a(10542);
			sw.currentGameInPacket = null;
			hn.g += 32;
			return true;
		}

        /**
         * Incoming Packet 28.
         */
		if (dk.incomingPacket28 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 28.");
			fi.a(sca.k, (byte) 31);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * NPC Update incoming packet.
         */
		if (sw.currentGameInPacket == oe.npcUpdateGameInPacket) {
            System.out.println("[GameInPacketHandler] NPC Update incoming packet.");
			bm.updateNPC(false, (byte) -125);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 80.
         */
		if (sw.currentGameInPacket == kea.incomingPacket80) {
            System.out.println("[GameInPacketHandler] Incoming Packet 80.");
			je.c((byte) 58);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 85.
         */
		if (sw.currentGameInPacket == sj.incomingPacket85) {
            System.out.println("[GameInPacketHandler] Incoming Packet 85.");
			faa.loginStream.pos += 28;
			if (faa.loginStream.x(i ^ ~0x23de)) {
                Class_mb.a(faa.loginStream, true, faa.loginStream.pos - 28);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 46.
         */
		if (GameOutPacket.incomingPacket46 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 46.");
			fi.a(gv.e, (byte) 89);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 53.
         */
		if (ItemDefLoader.incomingPacket53 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 53.");
			int j = faa.loginStream.readShort(i ^ ~0x3337);
			if (Class_cb.interfacePacketCounterCheck(j, 65535)) {
                FileOnDisk.c();
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 71.
         */
		if (sw.currentGameInPacket == Class_fb.incomingPacket71) {
            System.out.println("[GameInPacketHandler] Incoming Packet 71.");
			int j = faa.loginStream.readShortReversed((byte) 104);
			int k = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int i1 = faa.loginStream.readInt(125);
			if (Class_cb.interfacePacketCounterCheck(j, 65535)) {
                lda.a(k, 107, i1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 91.
         */
		if (ws.incomingPacket91 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 91.");
			int j = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int id = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-81);
			int id_ = faa.loginStream.readIntReversed2(i - 123);
			if (Class_cb.interfacePacketCounterCheck(j, 65535)) {
				tt tt = (tt) ida.l.a(-32748, (long) id);
				tt tt1 = (tt) ida.l.a(-32748, (long) id_);
				if (tt1 != null) {
                    vm.a(false, (tt == null || tt.l != tt1.l), false, tt1);
                }
				if (tt != null) {
					tt.unlink(-64);
					ida.l.a(tt, (byte) -123, (long) id_);
				}
				Interface interface_ = efa.a(i - 1018745487, id);
				if (interface_ != null) {
                    tn.a(interface_, i ^ ~0x3ff);
                }
				interface_ = efa.a(-1018745488, id_);
				if (interface_ != null) {
					tn.a(interface_, i + 1024);
					Class_kf.a(interface_, false, true);
				}
				if ((~Class_vb.u) != 0) {
                    cea.b(i ^ 0x6129ebba, Class_vb.u, 1);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 65.
         */
		if (br.incomingPacket65 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 65.");
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			String string = faa.loginStream.readString((byte) 119);
			String string1 = string;
			if (bool) {
                string1 = faa.loginStream.readString((byte) 126);
            }
			int playerRights = faa.loginStream.readUnsignedByte(i ^ 0x2433);
			int k = faa.loginStream.readShort(i + 13112);
			boolean bool1 = false;
			if (playerRights <= 1 && qf.a(string1, -111)) {
                bool1 = true;
            }
			if (!bool1 && sba.q == 0) {
				String string2 = ul.s.a(k, (byte) 95).a(1772, faa.loginStream);
				if (playerRights != 2) {
					if (playerRights != 1) {
                        at.a(string, string2, 25, 0, k, string1, null, (byte) 123, string);
                    } else {
                        at.a(string, string2, 25, 0, k, "<img=0>" + string1, null, (byte) 101, "<img=0>" + string);
                    }
				} else {
                    at.a(string, string2, 25, 0, k, "<img=1>" + string1, null, (byte) 121, "<img=1>" + string);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 83.
         */
		if (sw.currentGameInPacket == os.incomingPacket83) {
            System.out.println("[GameInPacketHandler] Incoming Packet 83.");
			int j = faa.loginStream.readUnsignedNegativeBytePlus128(255);
			int k = faa.loginStream.readUnsignedByteMinus128(-118);
			int id = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (id == 65535) {
                id = -1;
            }
			ao.a(id, k, j, (byte) -123);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 69.
         */
		if (sw.currentGameInPacket == Class_qb.incomingPacket69) {
            System.out.println("[GameInPacketHandler] Incoming Packet 69.");
			int j = faa.loginStream.readTribyteReversed(false);
			int id = faa.loginStream.readShortReversed((byte) 109);
			if (id == 65535) {
                id = -1;
            }
			int k = faa.loginStream.readUnsignedNegativeByte((byte) -18);
			eba.a(6567, k, j, id);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 100.
         */
		if (sw.currentGameInPacket == ku.incomingPacket100) {
            System.out.println("[GameInPacketHandler] Incoming Packet 100.");
			ji.a(-510117917);
			sw.currentGameInPacket = null;
			return false;
		}

        /**
         * Incoming Packet 29.
         */
		if (sw.currentGameInPacket == sj.incomingPacket29) {
            System.out.println("[GameInPacketHandler] Incoming Packet 29.");
			int j = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int k = faa.loginStream.readShort(13111);
			int i1 = faa.loginStream.readShort(13111);
			if (Class_cb.interfacePacketCounterCheck(i1, 65535)) {
                vr.a(0, k, j, -127);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 114.
         */
		if (sw.currentGameInPacket == hu.incomingPacket114) {
            System.out.println("[GameInPacketHandler] Incoming Packet 114.");
			wd.z = faa.loginStream.readUnsignedByteMinus128(i ^ 0x5a);
			sl.k = faa.loginStream.readBytePlus128(i + 16437) << 3;
			it.v = faa.loginStream.readByteMinus128((byte) -51) << 3;
			while (faa.loginStream.pos < ck.currentGameInPacketSize) {
				fh fh = fm.c(0)[faa.loginStream.readUnsignedByte(-9268)];
				fi.a(fh, (byte) 106);
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Add To Ignore incoming packet.
         */
		if (sw.currentGameInPacket == LoginStream.addToIgnoreGameInPacket) {
            System.out.println("[GameInPacketHandler] Add To Ignore incoming packet.");
			int j = faa.loginStream.readUnsignedByte(-9268);
			boolean bool = (j & 0x1) == 1;
			String string = faa.loginStream.readString((byte) 121);
			String string1 = faa.loginStream.readString((byte) 124);
			if (string1.equals("")) {
                string1 = string;
            }
			String string2 = faa.loginStream.readString((byte) 124);
			String string3 = faa.loginStream.readString((byte) 127);
			if (string3.equals("")) {
                string3 = string2;
            }
			if (!bool) {
				nh.l[dba.l] = string;
				GameOutPacket.d[dba.l] = string1;
				mba.a[dba.l] = string2;
				pi.m[dba.l] = string3;
				eq.M[dba.l] = uca.a(2, j) == 2;
				dba.l++;
			} else {
				for (int index = 0; index < dba.l; index++) {
					if (GameOutPacket.d[index].equals(string3)) {
						nh.l[index] = string;
						GameOutPacket.d[index] = string1;
						mba.a[index] = string2;
						pi.m[index] = string3;
						break;
					}
				}
			}
			rda.h = tb.u;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 32.
         */
		if (sw.currentGameInPacket == aaa.incomingPacket32) {
            System.out.println("[GameInPacketHandler] Incoming Packet 32.");
			if (!pga.a(-66, hm.h)) {
                dj.b = faa.loginStream.readShort(i ^ ~0x3337) * 30;
            } else {
                dj.b = (int) (2.5F * (float) faa.loginStream.readShort(i ^ ~0x3337));
            }
			sw.currentGameInPacket = null;
			tda.i = tb.u;
			return true;
		}

        /**
         * Incoming Packet 77.
         */
		if (sw.currentGameInPacket == cj.incomingPacket77) {
            System.out.println("[GameInPacketHandler] Incoming Packet 77.");
			int j = faa.loginStream.readShort(13111);
			int index = faa.loginStream.readUnsignedByte(i ^ 0x2433);
			int k = faa.loginStream.readUnsignedByte(-9268);
			int i1 = faa.loginStream.readUnsignedByte(-9268);
			int j1 = faa.loginStream.readUnsignedByte(-9268);
			int k1 = faa.loginStream.readShort(13111);
			if (Class_cb.interfacePacketCounterCheck(j, 65535)) {
				Class_ug.W[index] = true;
				rn.e[index] = k;
				me.m[index] = i1;
				ul.A[index] = j1;
				gu.J[index] = k1;
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 8.
         */
		if (wa.incomingPacket8 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 8.");
			int j = faa.loginStream.readUnsignedNegativeBytePlus128(255);
			int k = faa.loginStream.readUnsignedByteMinus128(-120);
			if (k == 255) {
				j = -1;
				k = -1;
			}
			gi.b(0, k, j);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 59.
         */
		if (GameOutPacket.incomingPacket59 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 59.");
			int j = faa.loginStream.readShort(i + 13112);
			int k = faa.loginStream.readUnsignedByte(-9268);
			int i1 = faa.loginStream.readUnsignedByte(i - 9267);
			int j1 = faa.loginStream.readShort(13111) << 2;
			int k1 = faa.loginStream.readUnsignedByte(-9268);
			int i2 = faa.loginStream.readUnsignedByte(-9268);
			if (Class_cb.interfacePacketCounterCheck(j, 65535)) {
                it.a((byte) 76, k1, k, i1, j1, i2);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 43.
         */
		if (sw.currentGameInPacket == dq.incomingPacket43) {
            System.out.println("[GameInPacketHandler] Incoming Packet 43.");
			GameText.ub = faa.loginStream.readTribyte2((byte) -102);
			id.b = faa.loginStream.readUnsignedByte(i - 9267) == 1;
			sw.currentGameInPacket = null;
			return true;
		}
		if (i != -1) {
            var_n = null;
        }

        /**
         * Incoming Packet 7.
         */
		if (sw.currentGameInPacket == pj.incomingPacket7) {
            System.out.println("[GameInPacketHandler] Incoming Packet 7.");
			String string = faa.loginStream.readString((byte) 121);
			String string1 = dea.a(i ^ ~0x4b75, Class_ob.a(faa.loginStream, (byte) -13));
			oba.a(string, string1, 6, -1, string, 0, string);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Send Interface incoming packet.
         */
		if (bf.sendInterfaceGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Send Interface incoming packet.");
			int j = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int k = faa.loginStream.readShortReversed((byte) 110);
			int id = faa.loginStream.readInt(81);
			int j1 = faa.loginStream.readUnsignedByte(-9268);
			if (Class_cb.interfacePacketCounterCheck(k, 65535)) {
				tt tt = (tt) ida.l.a(-32748, (long) id);
				if (tt != null) {
                    vm.a(false, j != tt.l, false, tt);
                }
				jr.a(false, j1, id, (byte) 127, j);
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Set Player Option incoming packet.
         */
		if (ji.setPlayerOptionGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Set Player Option incoming packet.");
			int j = faa.loginStream.readUnsignedByte(i ^ 0x2433);
			String string = faa.loginStream.readString((byte) 126);
			int id = faa.loginStream.readShortReversed((byte) 103);
			if (id == 65535) {
                id = -1;
            }
			int k = faa.loginStream.readUnsignedNegativeByte((byte) -18);
			if (j >= 1 && j <= 8) {
				if (string.equalsIgnoreCase("null")) {
                    string = null;
                }
				GameOutPacket.m[j - 1] = string;
				kl.k[j - 1] = id;
				Class_q.d[j - 1] = k == 0;
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 92.
         */
		if (hs.incomingPacket92 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 92.");
			String string = faa.loginStream.readString((byte) 118);
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			String displayName;
			if (!bool) {
                displayName = string;
            } else {
                displayName = faa.loginStream.readString((byte) 127);
            }
			int j = faa.loginStream.readShort(13111);
			byte b = faa.loginStream.readByte(-20933);
			boolean bool1 = false;
			if (b == -128) {
                bool1 = true;
            }
			if (!bool1) {
				String string2 = faa.loginStream.readString((byte) 127);
				iaa iaa = new iaa();
				iaa.h = displayName;
				iaa.a = string;
				iaa.b = kk.a(iaa.h, true);
				iaa.n = j;
				iaa.d = string2;
				iaa.g = b;
				int k;
				for (k = wj.clanChatPlayerCount - 1; k >= 0; k--) {
					int i1 = n.j[k].b.compareTo(iaa.b);
					if (i1 == 0) {
						n.j[k].n = j;
						n.j[k].g = b;
						n.j[k].d = string2;
						if (displayName.equals(up.thisPlayer.displayName)) {
                            cfa.b = b;
                        }
						qt.I = tb.u;
						sw.currentGameInPacket = null;
						return true;
					}
					if (i1 < 0) {
                        break;
                    }
				}
				if (wj.clanChatPlayerCount >= n.j.length) {
					sw.currentGameInPacket = null;
					return true;
				}
				for (int index = wj.clanChatPlayerCount - 1; k < index; index--) {
                    n.j[index + 1] = n.j[index];
                }
				if (wj.clanChatPlayerCount == 0) {
                    n.j = new iaa[100];
                }
				n.j[k + 1] = iaa;
				wj.clanChatPlayerCount++;
				if (displayName.equals(up.thisPlayer.displayName)) {
                    cfa.b = b;
                }
			} else {
				if (wj.clanChatPlayerCount == 0) {
					sw.currentGameInPacket = null;
					return true;
				}
				int k;
				for (k = 0; wj.clanChatPlayerCount > k; k++) {
					if (n.j[k].h.equals(displayName) && j == n.j[k].n) {
                        break;
                    }
				}
				if (wj.clanChatPlayerCount > k) {
					for (/**/; wj.clanChatPlayerCount - 1 > k; k++) {
                        n.j[k] = n.j[k + 1];
                    }
					wj.clanChatPlayerCount--;
					n.j[wj.clanChatPlayerCount] = null;
				}
			}
			sw.currentGameInPacket = null;
			qt.I = tb.u;
			return true;
		}

        /**
         * Incoming Packet 110.
         */
		if (dk.incomingPacket110 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 110.");
			int j = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int k = faa.loginStream.readUnsignedByte(-9268);
			boolean bool = (0x1 & k) == 1;
			Class_qb.a(52, bool, j);
			ida.n[uca.a(31, ou.e++)] = j;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 94.
         */
		if (efa.incomingPacket94 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 94.");
			fi.a(im.n, (byte) 44);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Player Update incoming packet.
         */
		if (sw.currentGameInPacket == wg.playerUpdateGameInPacket) {
            System.out.println("[GameInPacketHandler] Player Update incoming packet.");
			sh.updatePlayer(faa.loginStream, 32767, ck.currentGameInPacketSize);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 21.
         */
		if (Class_ic.incomingPacket21 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 21.");
			fi.a(gl.Q, (byte) 123);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Lobby Connection Alive incoming packet.
         */
		if (sv.lobbyConnectionAliveGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Lobby Connection Alive incoming packet.");
			sw.currentGameInPacket = null;
			return false;
		}

        /**
         * Incoming Packet 9. Has to do with G.E. Items
         */
		if (ow.incomingPacket9 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 9.");
			int index = faa.loginStream.readUnsignedByte(-9268);
			if (faa.loginStream.readUnsignedByte(i - 9267) == 0) {
                Interface.grandExchangeItems[index] = new GrandExchangeItem();
            } else {
				faa.loginStream.pos--;
				Interface.grandExchangeItems[index] = new GrandExchangeItem(faa.loginStream);
			}
			ip.M = tb.u;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 50.
         */
		if (sw.currentGameInPacket == dp.incomingPacket50) {
            System.out.println("[GameInPacketHandler] Incoming Packet 50.");
			int j = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int k = faa.loginStream.readIntShiftsInOrder_8_0_24_16(4087);
			cp.e.a(j, k, -120);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 73.
         */
		if (sw.currentGameInPacket == aaa.incomingPacket73) {
            System.out.println("[GameInPacketHandler] Incoming Packet 73.");
			fi.a(te.B, (byte) 115);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 42.
         */
		if (sw.currentGameInPacket == dk.incomingPacket42) {
            System.out.println("[GameInPacketHandler] Incoming Packet 42.");
			int j = faa.loginStream.readUnsignedByte(-9268);
			int k = j >> 5;
			int i1 = j & 0x1f;
			if (i1 == 0) {
				Class_fb.j[k] = null;
				sw.currentGameInPacket = null;
				return true;
			}
			on on = new on();
			on.a = i1;
			on.b = faa.loginStream.readUnsignedByte(-9268);
			if (on.b >= 0 && on.b < vq.h.length) {
				if (on.a != 1 && on.a != 10) {
					if (on.a >= 2 && on.a <= 6) {
						if (on.a == 2) {
							on.n = 256;
							on.i = 256;
						}
						if (on.a == 3) {
							on.i = 256;
							on.n = 0;
						}
						if (on.a == 4) {
							on.i = 256;
							on.n = 512;
						}
						if (on.a == 5) {
							on.n = 256;
							on.i = 0;
						}
						if (on.a == 6) {
							on.n = 256;
							on.i = 512;
						}
						on.a = 2;
						on.p = faa.loginStream.readUnsignedByte(-9268);
						on.n += faa.loginStream.readShort(i + 13112) - bfa.thisPlayersRegionX << 9;
						on.i += faa.loginStream.readShort(13111) - BytesParser.thisPlayersRegionY << 9;
						on.d = faa.loginStream.readUnsignedByte(-9268) << 2;
						on.f = faa.loginStream.readShort(13111);
					}
				} else {
					on.e = faa.loginStream.readShort(13111);
					faa.loginStream.pos += 6;
				}
				on.h = faa.loginStream.readShort(13111);
				if (on.h == 65535) {
                    on.h = -1;
                }
				Class_fb.j[k] = on;
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 86.
         */
		if (Class_pd.incomingPacket86 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 86.");
			int j = faa.loginStream.readShortReversed((byte) 122);
			int k = faa.loginStream.readShortReversedFirstByteMinus128(-49);
			int i1 = faa.loginStream.readInt(90);
			if (Class_cb.interfacePacketCounterCheck(j, 65535)) {
                sba.a(k, 74, i1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 11.
         */
		if (lf.incomingPacket11 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 11.");
			Class_fd.L = 1;
			sw.currentGameInPacket = null;
			rda.h = tb.u;
			return true;
		}

        /**
         * Incoming Packet 36.
         */
		if (ua.incomingPacket36 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 36.");
			int j = faa.loginStream.readShortReversedFirstByteMinus128(i - 48);
			int k = faa.loginStream.readShortReversed((byte) 107);
			int i1 = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-91);
			int j1 = faa.loginStream.readShort2(i + 91);
			if (Class_cb.interfacePacketCounterCheck(k, i + 65536)) {
                wea.a(j1, i1, j, (byte) -111);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 6.
         */
		if (fh.incomingPacket6 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 6.");
			int id = faa.loginStream.readShort(13111);
			if (id == 65535) {
                id = -1;
            }
			int j = faa.loginStream.readUnsignedByte(-9268);
			int k = faa.loginStream.readShort(13111);
			int i1 = faa.loginStream.readUnsignedByte(i - 9267);
			oh.a(id, j, k, false, i1, true);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 104.
         */
		if (uba.incomingPacket104 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 104.");
			int j = faa.loginStream.readShort(i ^ ~0x3337);
			int k = faa.loginStream.readShort(13111);
			int i1 = faa.loginStream.readShort(13111);
			int j1 = faa.loginStream.readShort(i + 13112);
			if (Class_cb.interfacePacketCounterCheck(j, i ^ ~0xffff) && Node_Sub.o[k] != null) {
				for (int k1 = i1; k1 < j1; k1++) {
					int i2 = faa.loginStream.readTribyte(-1);
					if (Node_Sub.o[k].length > k1 && Node_Sub.o[k][k1] != null) {
                        Node_Sub.o[k][k1].bc = i2;
                    }
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 15.
         */
		if (sw.currentGameInPacket == tda.incomingPacket15) {
            System.out.println("[GameInPacketHandler] Incoming Packet 15.");
			sba.a(i ^ 0x4e, nda.signlink, ck.currentGameInPacketSize, faa.loginStream);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 67.
         */
		if (ke.incomingPacket67 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 67.");
			int j = faa.loginStream.readShortReversed((byte) 105);
			int k = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-104);
			int i1 = faa.loginStream.readShort(13111);
			if (Class_cb.interfacePacketCounterCheck(i1, i ^ ~0xffff)) {
                bca.a(j, k, 0);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Send Ignore List incoming packet.
         */
		if (sw.currentGameInPacket == dk.sendIgnoreListGameInPacket) {
            System.out.println("[GameInPacketHandler] Send Ignore List incoming packet.");
			dba.l = faa.loginStream.readUnsignedByte(-9268);
			for (int index = 0; dba.l > index; index++) {
				nh.l[index] = faa.loginStream.readString((byte) 122);
				GameOutPacket.d[index] = faa.loginStream.readString((byte) 116);
				if (GameOutPacket.d[index].equals("")) {
                    GameOutPacket.d[index] = nh.l[index];
                }
				mba.a[index] = faa.loginStream.readString((byte) 115);
				pi.m[index] = faa.loginStream.readString((byte) 119);
				if (pi.m[index].equals("")) {
                    pi.m[index] = mba.a[index];
                }
				eq.M[index] = false;
			}
			rda.h = tb.u;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Small Interface Config incoming packet.
         */
		if (sw.currentGameInPacket == sea.smallInterfaceConfigGameInPacket) {
            System.out.println("[GameInPacketHandler] Small Interface Config incoming packet.");
			int configID = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			byte value = faa.loginStream.readBytePlus128(16436);
			int interfacePacketCounter = faa.loginStream.readShortReversed((byte) 114);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                vaa.setInterfaceConfig(configID, value, 1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 31.
         */
		if (ko.incomingPacket31 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 31.");
			int j = faa.loginStream.readInt(63);
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                qw.a(5, ih.n, j, 0, 0);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 66.
         */
		if (sw.currentGameInPacket == bf.incomingPacket66) {
            System.out.println("[GameInPacketHandler] Incoming Packet 66.");
			int j = faa.loginStream.readIntReversed2(-117);
			int k = faa.loginStream.readShortReversed((byte) 107);
			if (k == 65535) {
                k = -1;
            }
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i + 65536)) {
                id.a(true, j, k);
            }
			sw.currentGameInPacket = null;
			return true;
		}
		if (td.incomingPacket89 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 89.");
			pea.a(faa.loginStream.readString((byte) 122), 7628);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 103.
         */
		if (sw.currentGameInPacket == ql.incomingPacket103) {
            System.out.println("[GameInPacketHandler] Incoming Packet 103.");
			int j = faa.loginStream.readShort(13111);
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int k = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-68);
			int i1 = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                hm.a((byte) 2, k, (j << 16) + i1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 3.
         */
		if (sw.currentGameInPacket == an.incomingPacket3) {
            System.out.println("[GameInPacketHandler] Incoming Packet 3.");
			int j = faa.loginStream.readIntShiftsInOrder_16_24_0_8(i - 82);
			int k = faa.loginStream.readUnsignedByteMinus128(-128);
			int i1 = faa.loginStream.readUnsignedByte(-9268);
			mfa.j[k] = j;
			iu.k[k] = i1;
			de.c[k] = 1;
			int j1 = BytesParser.maxLevels[k] - 1;
			for (int k1 = 0; k1 < j1; k1++) {
				if (as.u[k1] <= j) {
                    de.c[k] = k1 + 2;
                }
			}
			ISAAC.o[uca.a(31, hea.c++)] = k;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 101.
         */
		if (sw.currentGameInPacket == nn.incomingPacket101) {
            System.out.println("[GameInPacketHandler] Incoming Packet 101.");
			fi.a(pca.s, (byte) 21);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 10.
         */
		if (vo.incomingPacket10 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 10.");
			int j = faa.loginStream.readUnsignedNegativeBytePlus128(255);
			int k = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			cp.e.a(k, j, i ^ 0x65);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 4.
         */
		if (sw.currentGameInPacket == qd.incomingPacket4) {
            System.out.println("[GameInPacketHandler] Incoming Packet 4.");
			int interfacePacketCounter = faa.loginStream.readShort(i + 13112);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                lp.b(5);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 96.
         */
		if (sw.currentGameInPacket == kba.incomingPacket96) {
            System.out.println("[GameInPacketHandler] Incoming Packet 96.");
			nda.a(2072317608);
			sw.currentGameInPacket = null;
			return false;
		}

        /**
         * Incoming Packet 27.
         */
		if (sw.currentGameInPacket == qg.incomingPacket27) {
            System.out.println("[GameInPacketHandler] Incoming Packet 27.");
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			String string = faa.loginStream.readString((byte) 122);
			String string1 = string;
			if (bool) {
                string1 = faa.loginStream.readString((byte) 123);
            }
			long l = (long) faa.loginStream.readShort(13111);
			long l1 = (long) faa.loginStream.readTribyte(-1);
			int playerRights = faa.loginStream.readUnsignedByte(-9268);
			int k = faa.loginStream.readShort(13111);
			long l2 = (l << 32) + l1;
			boolean bool1 = false;
			while_48_: do {
				for (int index = 0; index < 100; index++) {
					if (gga.l[index] == l2) {
						bool1 = true;
						break while_48_;
					}
				}
				if (playerRights <= 1 && qf.a(string1, -113)) {
                    bool1 = true;
                }
			} while (false);
			if (!bool1 && sba.q == 0) {
				gga.l[bg.g] = l2;
				bg.g = (bg.g + 1) % 100;
				String string2 = ul.s.a(k, (byte) 115).a(1772, faa.loginStream);
				if (playerRights != 2) {
					if (playerRights == 1) {
                        at.a(string, string2, 18, 0, k, "<img=0>" + string1, null, (byte) 104, "<img=0>" + string);
                    } else {
                        at.a(string, string2, 18, 0, k, string1, null, (byte) 100, string);
                    }
				} else {
                    at.a(string, string2, 18, 0, k, "<img=1>" + string1, null, (byte) 110, "<img=1>" + string);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 48.
         */
		if (sw.currentGameInPacket == qt.incomingPacket48) {
            System.out.println("[GameInPacketHandler] Incoming Packet 48.");
			int id = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (id == 65535) {
                id = -1;
            }
			int id_ = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (id_ == 65535) {
                id_ = -1;
            }
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int k = faa.loginStream.readIntReversed2(-123);
			int interfaceId = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
				for (int j1 = id; id_ >= j1; j1++) {
					long l = (long) j1 + ((long) k << 32);
					nm nm = (nm) aea.il.a(-32748, l);
					nm nm1;
					if (nm != null) {
						nm1 = new nm(nm.l, interfaceId);
						nm.unlink(i - 38);
					} else if (j1 != -1) {
                        nm1 = new nm(0, interfaceId);
                    } else {
                        nm1 = new nm(efa.a(-1018745488, k).qd.l, interfaceId);
                    }
					aea.il.a(nm1, (byte) -87, l);
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 45.
         */
		if (sw.currentGameInPacket == it.incomingPacket45) {
            System.out.println("[GameInPacketHandler] Incoming Packet 45.");
			fi.a(hv.s, (byte) 35);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 40.
         */
		if (sw.currentGameInPacket == js.incomingPacket40) {
            System.out.println("[GameInPacketHandler] Incoming Packet 40.");
			aaa.a = faa.loginStream.readUnsignedNegativeByte((byte) -18);
			Class_fd.t = faa.loginStream.readUnsignedNegativeBytePlus128(255);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 38.
         */
		if (sw.currentGameInPacket == nh.incomingPacket38) {
            System.out.println("[GameInPacketHandler] Incoming Packet 38.");
			int interfacePacketCounter = faa.loginStream.readShortReversed((byte) 113);
			int j = faa.loginStream.readIntShiftsInOrder_8_0_24_16(4087);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i + 65536)) {
                qw.a(3, -1, j, 0, -1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 60.
         */
		if (sw.currentGameInPacket == Class_ab.incomingPacket60) {
            System.out.println("[GameInPacketHandler] Incoming Packet 60.");
			while (faa.loginStream.pos < ck.currentGameInPacketSize) {
				boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
				String playerName = faa.loginStream.readString((byte) 118);
				String string1 = faa.loginStream.readString((byte) 125);
				int j = faa.loginStream.readShort(13111);
				int k = faa.loginStream.readUnsignedByte(-9268);
				String string2 = "";
				boolean bool1 = false;
				if (j > 0) {
					string2 = faa.loginStream.readString((byte) 118);
					bool1 = faa.loginStream.readUnsignedByte(-9268) == 1;
				}
				for (int i1 = 0; i1 < rba.l; i1++) {
					if (!bool) {
						if (playerName.equals(lfa.f[i1])) {
							if (dt.Jb[i1] != j) {
								boolean bool3 = true;
								for (rk rk = (rk) mw.v.b((byte) 92); rk != null; rk = (rk) mw.v.a((byte) -106)) {
									if (rk.playerName.equals(playerName)) {
										if (j != 0 && rk.n == 0) {
											bool3 = false;
											rk.unlink(i + 3);
										} else if (j == 0 && rk.n != 0) {
											rk.unlink(2);
											bool3 = false;
										}
									}
								}
								if (bool3) {
                                    mw.v.a(new rk(playerName, j), 88);
                                }
								dt.Jb[i1] = j;
							}
							nj.l[i1] = string1;
							di.f[i1] = string2;
							ObjectDef.rb[i1] = k;
							playerName = null;
							df.f[i1] = bool1;
							break;
						}
					} else if (string1.equals(lfa.f[i1])) {
						lfa.f[i1] = playerName;
						nj.l[i1] = string1;
						playerName = null;
						break;
					}
				}
				if (playerName != null && rba.l < 200) {
					lfa.f[rba.l] = playerName;
					nj.l[rba.l] = string1;
					dt.Jb[rba.l] = j;
					di.f[rba.l] = string2;
					ObjectDef.rb[rba.l] = k;
					df.f[rba.l] = bool1;
					rba.l++;
				}
			}
			rda.h = tb.u;
			Class_fd.L = 2;
			boolean bool = false;
			int j = rba.l;
			while (j > 0) {
				bool = true;
				j--;
				for (int index = 0; j > index; index++) {
					if ((dt.Jb[index] != gm.world.worldID && gm.world.worldID == dt.Jb[index + 1]) || dt.Jb[index] == 0 && dt.Jb[index + 1] != 0) {
						int k = dt.Jb[index];
						dt.Jb[index] = dt.Jb[index + 1];
						dt.Jb[index + 1] = k;
						String string = di.f[index];
						di.f[index] = di.f[index + 1];
						di.f[index + 1] = string;
						String string1 = lfa.f[index];
						lfa.f[index] = lfa.f[index + 1];
						lfa.f[index + 1] = string1;
						String string2 = nj.l[index];
						nj.l[index] = nj.l[index + 1];
						nj.l[index + 1] = string2;
						int i1 = ObjectDef.rb[index];
						ObjectDef.rb[index] = ObjectDef.rb[index + 1];
						ObjectDef.rb[index + 1] = i1;
						boolean bool1 = df.f[index];
						df.f[index] = df.f[index + 1];
						bool = false;
						df.f[index + 1] = bool1;
					}
				}
				if (bool) {
                    break;
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 18.
         */
		if (sw.currentGameInPacket == ida.incomingPacket18) {
            System.out.println("[GameInPacketHandler] Incoming Packet 18.");
			int priority = faa.loginStream.readInt(66);
			sa.t = nda.signlink.a(priority, (byte) 116);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 26.
         */
		if (ak.incomingPacket26 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 26.");
			fi.a(bh.z, (byte) 109);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 1.
         */
		if (fj.incomingPacket1 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 1.");
			int j = faa.loginStream.readShort(13111);
			String string = faa.loginStream.readString((byte) 125);
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                jn.a(i + 11333, string, j);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 99.
         */
		if (aea.incomingPacket99 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 99.");
			int j = faa.loginStream.readUnsignedByteMinus128(-113);
			int k = j >> 2;
			int i1 = j & 0x3;
			int j1 = nr.d[k];
			int id = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (id == 65535) {
                id = -1;
            }
			int k1 = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-87);
			int i2 = k1 >> 28 & 0x3;
			int j2 = (0xfffdfb4 & k1) >> 14;
			j2 -= bfa.thisPlayersRegionX;
			int k2 = 0x3fff & k1;
			k2 -= BytesParser.thisPlayersRegionY;
			wj.a(-1, k, id, j1, i2, k2, i1, j2);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 106.
         */
		if (sw.currentGameInPacket == bl.incomingPacket106) {
            System.out.println("[GameInPacketHandler] Incoming Packet 106.");
            int interfacePacketCounter = faa.loginStream.readShort(13111);
			int id = faa.loginStream.readInt(67);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
				tt tt = (tt) ida.l.a(i ^ 0x7feb, (long) id);
				if (tt != null) {
                    vm.a(false, true, false, tt);
                }
				if (rd.D != null) {
					tn.a(rd.D, 1023);
					rd.D = null;
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Send Lobby String incoming packet.
         */
		if (sw.currentGameInPacket == il.sendLobbyStringGameInPacket) {
            System.out.println("[GameInPacketHandler] Send Lobby String incoming packet.");
            int j = faa.loginStream.readSmart2(-13829);
			int k = faa.loginStream.readInt(89);
			int i1 = faa.loginStream.readUnsignedByte(i ^ 0x2433);
			String string = "";
			String string1 = string;
			if ((i1 & 0x1) != 0) {
				string = faa.loginStream.readString((byte) 123);
				if ((0x2 & i1) != 0) {
                    string1 = faa.loginStream.readString((byte) 117);
                } else {
                    string1 = string;
                }
			}
			String string2 = faa.loginStream.readString((byte) 123);
			if (j == 99) {
                ia.sendConsoleCommandText(4, string2);
            } else {
				if (!string1.equals("") && qf.a(string1, -117)) {
					sw.currentGameInPacket = null;
					return true;
				}
				oba.a(string, string2, j, -1, string1, k, string);
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Access Mask incoming packet.
         */
		if (sw.currentGameInPacket == ns.accessMaskGameInPacket) {
            System.out.println("[GameInPacketHandler] Access Mask incoming packet.");
			int endOffset = faa.loginStream.readShort(13111);
			if (endOffset == 65535) {
                endOffset = -1;
            }
			int interfaceHash = faa.loginStream.readInt(61);
			int beginOffset = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (beginOffset == 65535) {
                beginOffset = -1;
            }
			int interfacePacketCounter = faa.loginStream.readShort(13111);
			int settingsHash = faa.loginStream.readIntReversed2(-106);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
				for (int loopID = beginOffset; loopID <= endOffset; loopID++) {
					long l = ((long) interfaceHash << 32) + (long) loopID;
					nm nm = (nm) aea.il.a(i - 32747, l);
					nm nm1;
					if (nm == null) {
						if ((~loopID) != 0) {
                            nm1 = new nm(settingsHash, -1);
                        } else {
                            nm1 = new nm(settingsHash, efa.a(-1018745488, interfaceHash).qd.q);
                        }
					} else {
						nm1 = new nm(settingsHash, nm.q);
						nm.unlink(-123);
					}
					aea.il.a(nm1, (byte) -56, l);
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Small Config incoming packet.
         */
		if (sw.currentGameInPacket == rba.smallConfigPacket) {
            System.out.println("[GameInPacketHandler] Small Config incoming packet.");
			byte value = faa.loginStream.readByte(-20933);
			int configID = faa.loginStream.readShort(13111);
			cp.e.setConfig(configID, 0, value);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 13.
         */
		if (sw.currentGameInPacket == mh.incomingPacket13) {
            System.out.println("[GameInPacketHandler] Incoming Packet 13.");
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			String string = faa.loginStream.readString((byte) 124);
			String string1 = string;
			if (bool) {
                string1 = faa.loginStream.readString((byte) 119);
            }
			long l = (long) faa.loginStream.readShort(13111);
			long l1 = (long) faa.loginStream.readTribyte(i);
			int playerRights = faa.loginStream.readUnsignedByte(i - 9267);
			long l2 = (l << 32) + l1;
			boolean bool1 = false;
			while_49_: do {
				for (int index = 0; index < 100; index++) {
					if (gga.l[index] == l2) {
						bool1 = true;
						break while_49_;
					}
				}
				if (playerRights <= 1) {
					if (id.b && !tb.a || uda.d) {
                        bool1 = true;
                    } else if (qf.a(string1, -124)) {
                        bool1 = true;
                    }
				}
			} while (false);
			if (!bool1 && sba.q == 0) {
				gga.l[bg.g] = l2;
				bg.g = (bg.g + 1) % 100;
				String string2 = dea.a(19317, Class_ob.a(faa.loginStream, (byte) 77));
				if (playerRights == 2) {
                    at.a(string, string2, 7, 0, -1, "<img=1>" + string1, null, (byte) 120, "<img=1>" + string);
                } else if (playerRights != 1) {
                    at.a(string, string2, 3, 0, -1, string1, null, (byte) 106, string);
                } else {
                    at.a(string, string2, 7, 0, -1, "<img=0>" + string1, null, (byte) 106, "<img=0>" + string);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 107.
         */
		if (lda.incomingPacket107 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 107.");
			fi.a(os.j, (byte) 34);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 98.
         */
		if (sw.currentGameInPacket == sa.incomingPacket98) {
            System.out.println("[GameInPacketHandler] Incoming Packet 98.");
			int interfacePacketCounter = faa.loginStream.readShort(i ^ ~0x3337);
			int k = faa.loginStream.readUnsignedByte(-9268);
			int i1 = faa.loginStream.readUnsignedByte(-9268);
			int j1 = faa.loginStream.readShort(i ^ ~0x3337) << 2;
			int k1 = faa.loginStream.readUnsignedByte(-9268);
			int i2 = faa.loginStream.readUnsignedByte(i - 9267);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                Class_ub.a(false, k, k1, i2, true, i1, j1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Send World List incoming packet.
         */
		if (pg.sendWorldListGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Send World List incoming packet.");
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			byte[] worlds = new byte[ck.currentGameInPacketSize - 1];
			faa.loginStream.readBytes(worlds, true, ck.currentGameInPacketSize - 1, 0);
			tea.a(13736, worlds, bool);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 37.
         */
		if (iu.incomingPacket37 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 37.");
			int interfacePacketCounter = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int j = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int k = faa.loginStream.readUnsignedNegativeBytePlus128(i + 256);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
				if (k == 2) {
                    Class_ue.a(-122);
                }
				Class_vb.u = j;
				NPCNode.a(-93, j);
				cv.a(false, (byte) -120);
				ClientScriptHandler.a(Class_vb.u);
				for (int index = 0; index < 100; index++) {
                    la.q[index] = true;
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 57.
         */
		if (sw.currentGameInPacket == cba.incomingPacket57) {
            System.out.println("[GameInPacketHandler] Incoming Packet 57.");
			int j = faa.loginStream.readShortReversed((byte) 119);
			int k = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-91);
			int interfacePacketCounter = faa.loginStream.readShortReversed((byte) 120);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i + 65536)) {
                to.a(12, j, k);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 108.
         */
		if (sw.currentGameInPacket == nj.incomingPacket108) {
            System.out.println("[GameInPacketHandler] Incoming Packet 108.");
			fi.a(pk.c, (byte) 26);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 78.
         */
		if (sw.currentGameInPacket == Player.incomingPacket78) {
            System.out.println("[GameInPacketHandler] Incoming Packet 78.");
			lw.e = ck.currentGameInPacketSize <= 2 ? GameText.walkHereText.getString(cba.languageID) : faa.loginStream.readString((byte) 127);
			it.K = ck.currentGameInPacketSize <= 0 ? -1 : faa.loginStream.readShort(13111);
			sw.currentGameInPacket = null;
			if (it.K == 65535) {
                it.K = -1;
            }
			return true;
		}

        /**
         * Incoming Packet 113.
         */
		if (Node_Sub.incomingPacket113 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 113.");
			qaa.T = faa.loginStream.readUnsignedByte(-9268);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 109.
         */
		if (sw.currentGameInPacket == ro.incomingPacket109) {
            System.out.println("[GameInPacketHandler] Incoming Packet 109.");
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			String string = faa.loginStream.readString((byte) 118);
			String string1 = string;
			if (bool) {
                string1 = faa.loginStream.readString((byte) 120);
            }
			int playerRights = faa.loginStream.readUnsignedByte(-9268);
			boolean bool1 = false;
			if (playerRights <= 1) {
				if (id.b && !tb.a || uda.d) {
                    bool1 = true;
                } else if (playerRights <= 1 && qf.a(string1, -127)) {
                    bool1 = true;
                }
			}
			if (!bool1 && sba.q == 0) {
				String string2 = dea.a(19317, Class_ob.a(faa.loginStream, (byte) -6));
				if (playerRights != 2) {
					if (playerRights != 1) {
                        at.a(string, string2, 24, 0, -1, string1, null, (byte) 101, string);
                    } else {
                        at.a(string, string2, 24, 0, -1, "<img=0>" + string1, null, (byte) 102, "<img=0>" + string);
                    }
				} else {
                    at.a(string, string2, 24, 0, -1, "<img=1>" + string1, null, (byte) 101, "<img=1>" + string);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Update NPC incoming packet.
         */
		if (Class_is.updateNPCInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Update NPC incoming packet 76.");
			bm.updateNPC(true, (byte) -125);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 62.
         */
		if (faa.incomingPacket62 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 62.");
			int playerInScreen = faa.loginStream.readShort(13111);
			Player player;
			if (playerInScreen == ih.n) {
                player = up.thisPlayer;
            } else {
                player = Class_fc.playersInScreen[playerInScreen];
            }
			if (player == null) {
				sw.currentGameInPacket = null;
				return true;
			}
			int j = faa.loginStream.readShort(i + 13112);
			int k = faa.loginStream.readUnsignedByte(-9268);
			boolean bool = (j & 0x8000) != 0;
			if (player.displayName != null && player.playerDef != null) {
				boolean bool1 = false;
				if (k <= 1) {
					if (!bool && (id.b && !tb.a || uda.d)) {
                        bool1 = true;
                    } else if (qf.a(player.displayName, i - 116)) {
                        bool1 = true;
                    }
				}
				if (!bool1 && sba.q == 0) {
					int i1 = -1;
					String string;
					if (!bool) {
                        string = dea.a(19317, Class_ob.a(faa.loginStream, (byte) -124));
                    } else {
						j &= 0x7fff;
						oe oe = wa.a(faa.loginStream, (byte) -47);
						i1 = oe.a;
						string = oe.d.a(1772, faa.loginStream);
					}
					player.cb = string.trim();
					player.jb = j >> 8;
					player.vc = 0xff & j;
					player.Q = 150;
					int j1;
					if (k != 1 && k != 2) {
                        j1 = bool ? 17 : 2;
                    } else {
                        j1 = bool ? 17 : 1;
                    }
					if (k != 2) {
						if (k != 1) {
                            at.a(player.playerName, string, j1, 0, i1, player.getDisplayName(false, (byte) -7), null, (byte) 109,
                                    player.getUserDisplayName((byte) -128, true));
                        } else {
                            at.a(player.playerName, string, j1, 0, i1, "<img=0>" + player.getDisplayName(false, (byte) -7), null, (byte) 110, "<img=0>"
                                    + player.getUserDisplayName((byte) -124, true));
                        }
					} else
						at.a(player.playerName, string, j1, 0, i1, "<img=1>" + player.getDisplayName(false, (byte) -7), null, (byte) 107, "<img=1>"
                                + player.getUserDisplayName((byte) -127, true));
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 54.
         */
		if (jn.incomingPacket54 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 54.");
			String string = faa.loginStream.readString((byte) 121);
			int interfacePacketCounter = faa.loginStream.readShort(13111);
			int j = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                jn.a(i ^ ~0x2c44, string, j);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 72.
         */
		if (di.incomingPacket72 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 72.");
			fi.a(dv.a, (byte) 64);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 87.
         */
		if (sw.currentGameInPacket == Class_ef.incomingPacket87) {
            System.out.println("[GameInPacketHandler] Incoming Packet 87.");
			int j = faa.loginStream.readInt(127);
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
				if (j == -1) {
					dj.o = -1;
					ja.Cc = -1;
				} else {
					int k = 0x3fff & j >> 14;
					k -= bfa.thisPlayersRegionX;
					int i1 = 0x3fff & j;
					if (k >= 0) {
						if (k >= Class_hc.e) {
                            k = Class_hc.e;
                        }
					} else {
                        k = 0;
                    }
					i1 -= BytesParser.thisPlayersRegionY;
					if (i1 < 0) {
                        i1 = 0;
                    } else if (i1 >= bw.v) {
                        i1 = bw.v;
                    }
					ja.Cc = (k << 9) + 256;
					dj.o = (i1 << 9) + 256;
				}
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 39.
         */
		if (lh.incomingPacket39 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 39.");
			int j = faa.loginStream.readShortReversed((byte) 107);
			int k = faa.loginStream.readIntShiftsInOrder_16_24_0_8(-111);
			int i1 = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int interfacePacketCounter = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int j1 = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                qw.a(7, j | i1 << 16, k, 0, j1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 12.
         */
		if (ao.incomingPacket12 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 12.");
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			String string = faa.loginStream.readString((byte) 126);
			String string1 = string;
			if (bool) {
                string1 = faa.loginStream.readString((byte) 123);
            }
			long l = faa.loginStream.readLong(false);
			long l1 = (long) faa.loginStream.readShort(13111);
			long l2 = (long) faa.loginStream.readTribyte(-1);
			int playerRights = faa.loginStream.readUnsignedByte(-9268);
			int k = faa.loginStream.readShort(13111);
			long l3 = l2 + (l1 << 32);
			boolean bool1 = false;
			while_50_: do {
				for (int index = 0; index < 100; index++) {
					if (gga.l[index] == l3) {
						bool1 = true;
						break while_50_;
					}
				}
				if (playerRights <= 1 && qf.a(string1, -121)) {
                    bool1 = true;
                }
			} while (false);
			if (!bool1 && sba.q == 0) {
				gga.l[bg.g] = l3;
				bg.g = (bg.g + 1) % 100;
				String string2 = ul.s.a(k, (byte) 118).a(1772, faa.loginStream);
				if (playerRights != 2) {
					if (playerRights == 1) {
                        at.a(string, string2, 20, 0, k, "<img=0>" + string1, ns.a(l, 88), (byte) 127, "<img=0>" + string);
                    } else {
                        at.a(string, string2, 20, 0, k, string1, ns.a(l, 79), (byte) 102, string);
                    }
				} else {
                    at.a(string, string2, 20, 0, k, "<img=1>" + string1, ns.a(l, 72), (byte) 115, "<img=1>" + string);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 79.
         */
		if (sw.currentGameInPacket == pw.incomingPacket79) {
            System.out.println("[GameInPacketHandler] Incoming Packet 79.");
			boolean bool = faa.loginStream.readUnsignedByte(i ^ 0x2433) == 1;
			String string = faa.loginStream.readString((byte) 117);
			String string1 = string;
			if (bool) {
                string1 = faa.loginStream.readString((byte) 115);
            }
			long l = faa.loginStream.readLong(false);
			long l1 = (long) faa.loginStream.readShort(13111);
			long l2 = (long) faa.loginStream.readTribyte(-1);
			int j = faa.loginStream.readUnsignedByte(-9268);
			long l3 = (l1 << 32) + l2;
			boolean bool1 = false;
			while_51_: do {
				for (int index = 0; index < 100; index++) {
					if (gga.l[index] == l3) {
						bool1 = true;
						break while_51_;
					}
				}
				if (j <= 1) {
					if (id.b && !tb.a || uda.d) {
                        bool1 = true;
                    } else if (qf.a(string1, -97)) {
                        bool1 = true;
                    }
				}
			} while (false);
			if (!bool1 && sba.q == 0) {
				gga.l[bg.g] = l3;
				bg.g = (bg.g + 1) % 100;
				String string2 = dea.a(i + 19318, Class_ob.a(faa.loginStream, (byte) -123));
				if (j == 2 || j == 3) {
                    at.a(string, string2, 9, 0, -1, "<img=1>" + string1, ns.a(l, 63), (byte) 117, "<img=1>" + string);
                } else if (j != 1) {
                    at.a(string, string2, 9, 0, -1, string1, ns.a(l, 43), (byte) 107, string);
                } else {
                    at.a(string, string2, 9, 0, -1, "<img=0>" + string1, ns.a(l, 59), (byte) 114, "<img=0>" + string);
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 23.
         */
		if (sw.currentGameInPacket == hp.incomingPacket23) {
            System.out.println("[GameInPacketHandler] Incoming Packet 23.");
			if ((~Class_vb.u) != 0) {
                cea.b(i - 1630137274, Class_vb.u, 0);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 5.
         */
		if (dfa.incomingPacket5 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 5.");
			fi.a(Class_nd.k, (byte) 48);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 52.
         */
		if (sw.currentGameInPacket == qaa.incomingPacket52) {
            System.out.println("[GameInPacketHandler] Incoming Packet 52.");
			jm.j = faa.loginStream.readUnsignedByte(-9268);
			tda.i = tb.u;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 44.
         */
		if (tfa.incomingPacket44 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 44.");
			int j = faa.loginStream.readUnsignedByteMinus128(-122);
			int k = faa.loginStream.readIntShiftsInOrder_8_0_24_16(4087);
			int interfacePacketCounter = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                ge.b(k, (byte) 15, j);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 17.
         */
		if (Login.incomingPacket17 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 17.");
			fi.a(sr.K, (byte) 100);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 64.
         */
		if (ifa.incomingPacket64 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 64.");
			for (int index = 0; Class_fc.playersInScreen.length > index; index++) {
				if (Class_fc.playersInScreen[index] != null) {
					Class_fc.playersInScreen[index].Ab = null;
					Class_fc.playersInScreen[index].yb = -1;
				}
			}
			for (int index = 0; index < ObjectDef.Ib; index++) {
				ii.npcNodes[index].npc.Ab = null;
				ii.npcNodes[index].npc.yb = -1;
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 102.
         */
		if (GameOutPacket.incomingPacket102 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 102.");
			int j = faa.loginStream.readInt(86);
			int interfacePacketCounter = faa.loginStream.readShort(13111);
			int id = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (id == 65535) {
                id = -1;
            }
			int k = faa.loginStream.readIntShiftsInOrder_16_24_0_8(i - 71);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
				lw.a(k, i ^ ~0x9, id, j);
				ItemDef itemDef = laa.itemDefLoader.d(i ^ ~0x3064, id);
				rr.a(itemDef.pb, itemDef.Bb, -26287, itemDef.z, j);
				kl.a((byte) -119, itemDef.nb, itemDef.Ab, j, itemDef.S);
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 84. Apply NPC animation??
         */
		if (sw.currentGameInPacket == od.incomingPacket84) {
            System.out.println("[GameInPacketHandler] Incoming Packet 84.");
			int[] buf = new int[4];
			for (int index = 0; index < 4; index++) {
                buf[index] = faa.loginStream.readShortReversed((byte) 116);
            }
			int j = faa.loginStream.readShort(13111);
			int delay = faa.loginStream.readUnsignedNegativeBytePlus128(255);
			NPCNode npcNode = (NPCNode) uo.a.a(i ^ 0x7feb, (long) j);
			if (npcNode != null) {
                bg.applyNPCAnim(buf, (byte) -124, npcNode.npc, delay);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 55.
         */
		if (jq.incomingPacket55 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 55.");
			fi.a(cd.m, (byte) 29);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 88.
         */
		if (lm.incomingPacket88 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 88.");
			int j = faa.loginStream.readIntReversed2(41);
			int k = faa.loginStream.readIntReversed2(i ^ ~0x71);
			int i1 = faa.loginStream.readShortReversed((byte) 115);
			int interfacPacketCounter = faa.loginStream.readShortReversed((byte) 102);
			if (Class_cb.interfacePacketCounterCheck(interfacPacketCounter, 65535)) {
                qw.a(5, i1, k, 0, j);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 22.
         */
		if (sw.currentGameInPacket == Interface.incomingPacket22) {
            System.out.println("[GameInPacketHandler] Incoming Packet 22.");
			int j = faa.loginStream.readInt(117);
			int id = faa.loginStream.readShort(13111);
			if (id == 65535) {
                id = -1;
            }
			int interfacePacketCounter = faa.loginStream.readShort(13111);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                qw.a(1, id, j, 0, -1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Big Interface Config incoming packet.
         */
		if (Class_r.bigInterfaceConfigGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Big Interface Config incoming packet.");
			int value = faa.loginStream.readIntShiftsInOrder_16_24_0_8(i ^ 0x45);
			int interfacePacketCounter = faa.loginStream.readShort(13111);
			int configID = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i ^ ~0xffff)) {
                vaa.setInterfaceConfig(configID, value, 1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 97.
         */
		if (sw.currentGameInPacket == sca.incomingPacket97) {
            System.out.println("[GameInPacketHandler] Incoming Packet 97.");
			if (em.a != null) {
                kea.setWM(false, (byte) 126, -1, -1, cs.g.w);
            }
			byte[] buf = new byte[ck.currentGameInPacketSize];
			faa.loginStream.a(0, ck.currentGameInPacketSize, buf, -122);
			String string = cea.bytesToString(26144, ck.currentGameInPacketSize, buf, 0);
			wj.a(125, string, nda.signlink, on.performance == 1, true);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 111.
         */
		if (lr.incomingPacket111 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 111.");
			int id = faa.loginStream.readShort(13111);
			if (id == 65535) {
                id = -1;
            }
			int j = faa.loginStream.readUnsignedByte(i - 9267);
			int k = faa.loginStream.readShort(13111);
			int i1 = faa.loginStream.readUnsignedByte(i - 9267);
			oh.a(id, j, k, false, i1, false);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Clan Chat incoming packet.
         */
		if (Class_ae.clanChatGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Clan Chat incoming packet.");
			qt.I = tb.u;
			if (ck.currentGameInPacketSize == 0) {
				Class_ob.r = null;
				n.j = null;
				sw.currentGameInPacket = null;
				rc.d = null;
				wj.clanChatPlayerCount = 0;
				return true;
			}
			Class_ob.r = faa.loginStream.readString((byte) 124);
			boolean bool = faa.loginStream.readUnsignedByte(-9268) == 1;
			if (bool) {
                faa.loginStream.readString((byte) 119);
            }
			long l = faa.loginStream.readLong(false);
			rc.d = kba.a((byte) -84, l);
			ISAAC.a = faa.loginStream.readByte(i - 20932);
			int j = faa.loginStream.readUnsignedByte(-9268);
			if (j == 255) {
				sw.currentGameInPacket = null;
				return true;
			}
			wj.clanChatPlayerCount = j;
			iaa[] iaas = new iaa[100];
			for (int index = 0; wj.clanChatPlayerCount > index; index++) {
				iaas[index] = new iaa();
				iaas[index].a = faa.loginStream.readString((byte) 121);
				bool = faa.loginStream.readUnsignedByte(i ^ 0x2433) == 1;
				if (!bool) {
                    iaas[index].h = iaas[index].a;
                } else {
                    iaas[index].h = faa.loginStream.readString((byte) 117);
                }
				iaas[index].b = kk.a(iaas[index].h, true);
				iaas[index].n = faa.loginStream.readShort(13111);
				iaas[index].g = faa.loginStream.readByte(-20933);
				iaas[index].d = faa.loginStream.readString((byte) 115);
				if (iaas[index].h.equals(up.thisPlayer.displayName)) {
                    cfa.b = iaas[index].g;
                }
			}
			boolean bool_281_ = false;
			int i_282_ = wj.clanChatPlayerCount;
			while (i_282_ > 0) {
				bool_281_ = true;
				i_282_--;
				for (int i_283_ = 0; i_283_ < i_282_; i_283_++) {
					if (iaas[i_283_].b
							.compareTo(iaas[i_283_ + 1].b) > 0) {
						iaa var_iaa = iaas[i_283_];
						iaas[i_283_] = iaas[i_283_ + 1];
						bool_281_ = false;
						iaas[i_283_ + 1] = var_iaa;
					}
				}
				if (bool_281_)
					break;
			}
			sw.currentGameInPacket = null;
			n.j = iaas;
			return true;
		}

        /**
         * Incoming Packet 16.
         */
		if (bh.incomingPacket16 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 16.");
			int id = faa.loginStream.readShort(i ^ ~0x3337);
			if (id == 65535) {
                id = -1;
            }
			int j = faa.loginStream.readUnsignedByte(-9268);
			int k = faa.loginStream.readShort(i ^ ~0x3337);
			int i1 = faa.loginStream.readUnsignedByte(-9268);
			io.a(i1, id, j, k, 29830);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Set Items By Index incoming packet.
         */
		if (nh.setItemsByIndexGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Set Items by Index incoming packet.");
			int itemContainerIndex = faa.loginStream.readShort(13111);
			int splitByte = faa.loginStream.readUnsignedByte(-9268);
			boolean split = (0x1 & splitByte) == 1;
			while (faa.loginStream.pos < ck.currentGameInPacketSize) {
				int itemIndex = faa.loginStream.readSmart2(i ^ 0x3604);
				int itemID = faa.loginStream.readShort(i + 13112);
				int amount = 0;
				if (itemID != 0) {
					amount = faa.loginStream.readUnsignedByte(-9268);
					if (amount == 255) {
                        amount = faa.loginStream.readInt(113);
                    }
				}
				dm.setItemOnInterface(-84, split, itemID - 1, itemIndex, amount, itemContainerIndex);
			}
			ida.n[uca.a(ou.e++, 31)] = itemContainerIndex;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Client Script incoming packet.
         */
		if (ek.clientScriptGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Client Script incoming packet.");
			int interfacePacketCounter = faa.loginStream.readShort(i + 13112);
			String valString = faa.loginStream.readString((byte) 118);
			Object[] objects = new Object[valString.length() + 1];
			for (int loopID = valString.length() - 1; loopID >= 0; loopID--) {
				if (valString.charAt(loopID) == 's') {
                    objects[loopID + 1] = faa.loginStream.readString((byte) 119);
                } else {
                    objects[loopID + 1] = new Integer(faa.loginStream.readInt(97));
                }
			}
			objects[0] = new Integer(faa.loginStream.readInt(91));
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i ^ ~0xffff)) {
				ClientScript script = new ClientScript();
				script.objects = objects;
				ClientScriptHandler.activateClientScript(script);
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 81.
         */
		if (sw.currentGameInPacket == an.incomingPacket81) {
            System.out.println("[GameInPacketHandler] Incoming Packet 81.");
			hga.b = saa.b(34067, faa.loginStream.readUnsignedByte(-9268));
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 58.
         */
		if (hi.incomingPacket58 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 58.");
			int j = faa.loginStream.readUnsignedNegativeByte((byte) -18);
			int interfacePacketCounter = faa.loginStream.readShort(i + 13112);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                vs.r = j;
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 112.
         */
		if (sw.currentGameInPacket == pr.incomingPacket112) {
            System.out.println("[GameInPacketHandler] Incoming Packet 112.");
			int j = faa.loginStream.readIntShiftsInOrder_8_0_24_16(i ^ ~0xff7);
			int interfacePacketCounter = faa.loginStream.readShortSecondByteMinus128((byte) -80);
			int id = faa.loginStream.readShortReversed((byte) 123);
			if (id == 65535) {
                id = -1;
            }
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, 65535)) {
                qw.a(2, id, j, 0, -1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 30.
         */
		if (sca.incomingPacket30 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 30.");
			String string = faa.loginStream.readString((byte) 126);
			int j = faa.loginStream.readShort(13111);
			String string1 = ul.s.a(j, (byte) 78).a(i + 1773, faa.loginStream);
			at.a(string, string1, 19, 0, j, string, null, (byte) 103, string);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 24.
         */
		if (lu.incomingPacket24 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 24.");
			wd.z = faa.loginStream.readUnsignedByte(-9268);
			sl.k = faa.loginStream.readByteMinus128((byte) -51) << 3;
			it.v = faa.loginStream.readByteMinus128((byte) -51) << 3;
			for (sba sba = (sba) jt.a.b((byte) 124); sba != null; sba = (sba) jt.a.b(i + 12562)) {
				int j = (int) (sba.nodeID >> 28 & 0x3L);
				int k = (int) (sba.nodeID & 0x3fffL);
				int i1 = k - bfa.thisPlayersRegionX;
				int j1 = (int) (0x3fffL & sba.nodeID >> 14);
				int k1 = j1 - BytesParser.thisPlayersRegionY;
				if (j == wd.z && i1 >= sl.k && i1 < sl.k + 8 && k1 >= it.v && it.v + 8 > k1) {
					sba.unlink(-65);
					if (i1 >= 0 && k1 >= 0 && Class_hc.e > i1 && k1 < bw.v) {
                        br.a(1736, k1, wd.z, i1);
                    }
				}
			}
			for (nv nv = (nv) Class_u.L.a(102); nv != null; nv = (nv) Class_u.L.b((byte) 116)) {
				if (nv.u >= sl.k && nv.u < sl.k + 8 && nv.k >= it.v && nv.k < it.v + 8 && wd.z == nv.t) {
                    nv.n = 0;
                }
			}
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Logout to Lobby incoming packet.
         */
		if (ut.logoutToLobbyGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Logout to Lobby incoming packet.");
			la.logout((byte) -93, Class_ub.U);
			sw.currentGameInPacket = null;
			return false;
		}

        /**
         * Big Config incoming packet.
         */
		if (sw.currentGameInPacket == Node.bigConfigPacket) {
            System.out.println("[GameInPacketHandler] Big Config incoming packet.");
			int value = faa.loginStream.readIntReversed2(i ^ 0x78);
			int configID = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			cp.e.setConfig(configID, 0, value);
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 70.
         */
		if (sw.currentGameInPacket == Player.incomingPacket70) {
            System.out.println("[GameInPacketHandler] Incoming Packet 70.");
			int itemContainerIndex = faa.loginStream.readShort(13111);
			int splitByte = faa.loginStream.readUnsignedByte(-9268);
			boolean split = (splitByte & 0x1) == 1;
			hs.a(itemContainerIndex, (byte) -34, split);
			int amountOfItems = faa.loginStream.readShort(13111);
			for (int itemIndex = 0; amountOfItems > itemIndex; itemIndex++) {
				int amount = faa.loginStream.readUnsignedByte(-9268);
				if (amount == 255) {
                    amount = faa.loginStream.readIntShiftsInOrder_8_0_24_16(4087);
                }
				int itemID = faa.loginStream.readShort(i + 13112);
				dm.setItemOnInterface(-103, split, itemID - 1, itemIndex, amount, itemContainerIndex);
			}
			ida.n[uca.a(31, ou.e++)] = itemContainerIndex;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 41.
         */
		if (sw.currentGameInPacket == ge.incomingPacket41) {
            System.out.println("[GameInPacketHandler] Incoming Packet 41.");
			wd.z = faa.loginStream.readUnsignedNegativeByte((byte) -18);
			sl.k = faa.loginStream.readBytePlus128(i ^ ~0x4034) << 3;
			it.v = faa.loginStream.readBytePlus128(16436) << 3;
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Send String incoming packet.
         */
		if (bh.sendStringGameInPacket == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Send String incoming packet.");
			int j = faa.loginStream.readIntReversed2(112);
			int interfacePacketCounter = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			String string = faa.loginStream.readString((byte) 115);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i ^ ~0xffff)) {
                uk.a(3, string, j);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 115.
         */
		if (bw.incomingPacket115 == sw.currentGameInPacket) {
            System.out.println("[GameInPacketHandler] Incoming Packet 115.");
			int interfacePacketCounter = faa.loginStream.readShortReversed((byte) 125);
			int j = faa.loginStream.readShortReversed((byte) 125);
			int k = faa.loginStream.readShortReversed((byte) 124);
			int i1 = faa.loginStream.readShortReversedFirstByteMinus128_2(true);
			int j1 = faa.loginStream.readIntShiftsInOrder_8_0_24_16(4087);
			if (Class_cb.interfacePacketCounterCheck(interfacePacketCounter, i + 65536)) {
                rr.a(j, i1, -26287, k, j1);
            }
			sw.currentGameInPacket = null;
			return true;
		}

        /**
         * Incoming Packet 25.
         */
		if (sw.currentGameInPacket == daa.incomingPacket25) {
			fi.a(ln.e, (byte) 13);
			sw.currentGameInPacket = null;
			return true;
		}
		cea.a(("T1 - " + (sw.currentGameInPacket == null ? -1 : sw.currentGameInPacket.getPacketID()) + ","
                        + (ClientScript.gameInPacket != null ? ClientScript.gameInPacket.getPacketID() : -1) + ","
                        + (jt.incomingPacket != null ? jt.incomingPacket.getPacketID() : -1) + " - " + ck.currentGameInPacketSize), -2, null);
		la.logout((byte) -125, false);
		return true;
	}

	public GameInPacketHandler() {
		/* empty */
	}

	public static void nullLoader() {
		baa = null;
		var_n = null;
	}

	public static boolean isKeyTyped(char c) {
		isKeyTyped++;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
            return true;
        }
		if (c != '\0') {
			char[] cs = th.g;
			for (int index = 0; cs.length > index; index++) {
				char c1 = cs[index];
				if (c1 == c) {
                    return true;
                }
			}
		}
		return false;
	}

	public GameInPacketHandler(int i) {
		this.k = i;
	}
}
