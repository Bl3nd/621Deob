/* ot - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

public final class Login {

	static long[] a;
	static int b;
	static GameInPacket incomingPacket17 = new GameInPacket(17, 5);
	static int processLoginCount;
	static int e;
	static nw nw = new nw();
	static int g = 0;
	static boolean h;
	static pl pl;
	static int j = -1;

	public static void a(int i, int j, int k, int i1, int j1, int k1, int i2) {
		if (i != 3) {
            a = null;
        }
		e++;
		if (j != 8 && j != 16) {
			vf vf = ol.p[k1][j1][i1];
			if (vf == null) {
                vf = new vf(k1);
            }
			if (j == 1) {
				vf.k = (short) i2;
				vf.o = (short) k;
			} else if (j == 2) {
				vf.i = (short) i2;
				vf.n = (short) k;
			}
			if (js.o) {
                Class_i.a(2);
            }
		} else if (j == 8) {
			int j6 = j1 << Class_fb.a;
			int k6 = j6 + bea.o;
			int i7 = i1 << Class_fb.a;
			int j7 = bea.o + i7;
			int k7 = vr.b[k1].a(i1, (byte) 51, j1);
			int i8 = vr.b[k1].a(i1 + 1, (byte) 51, j1 + 1);
			Class_mb.Y[sr.R++] = new hv(j, k1, j6, k6, k6, j6, k7, i8, i8 - k, k7 - k, i7, j7, j7, i7);
		} else {
			int j6 = bea.o + (j1 << Class_fb.a);
			int k6 = j6 - bea.o;
			int i7 = i1 << Class_fb.a;
			int j7 = i7 + bea.o;
			int k7 = vr.b[k1].a(i1, (byte) 51, j1 + 1);
			int i8 = vr.b[k1].a(i1 + 1, (byte) 51, j1);
			Class_mb.Y[sr.R++] = new hv(j, k1, j6, k6, k6, j6, k7, i8, i8 - k, k7 - k, i7, j7, j7, i7);
		}
	}

	public static void nullLoader() {
		nw = null;
		Login.pl = null;
		incomingPacket17 = null;
		a = null;
	}

	public static int a(int i, int j, byte b, boolean bool) {
		Login.b++;
		hg hg = el.a(bool, (byte) 94, i);
		if (hg == null) {
            return 0;
        }
		if (j < 0 || j >= hg.amounts.length) {
            return 0;
        }
		return hg.amounts[j];
	}

	public static void processLogin() {
		System.out.println("ProcessLogin");
		processLoginCount++;
		if (hk.loginStage != 0 && hk.loginStage != 6) {
			System.out.println("Login");
			try {
				if (++rv.p > 2000) {
					if (ce.y != null) {
						ce.y.d(0);
						ce.y = null;
					}
					if (km.q < 2) {
						if (jl.s == 2 || jl.s == 3) {
							gm.world.rotateConnectionMethods(0);
						} else {
							cf.world.rotateConnectionMethods(0);
						}
						hk.loginStage = 1;
						km.q++;
						rv.p = 0;
					} else {
						hk.loginStage = 0;
						fda.a((byte) 108, -5);
						return;
					}
				}
				if (hk.loginStage == 1) {
					System.out.println("Entering stage 1.");
					if (jl.s != 2 && jl.s != 3) {
						maa.vfa = cf.world.a(nda.signlink);
					} else {
						maa.vfa = gm.world.a(nda.signlink);
					}
					hk.loginStage = 2;
				}
				if (hk.loginStage == 2) {
					System.out.println("Entering stage 2.");
					if (maa.vfa.f == 2) {
						throw new IOException();
					}
					if (maa.vfa.f != 1) {
						return;
					}
					ce.y = bd.a(-119, (Socket) maa.vfa.hostName, 7500);
					maa.vfa = null;
					long username = qea.a = aaa.stringToLong(0, op.username);
					int usernameHash = (int) (username >> 16 & 0x1fL);
					System.out.println("Username: " + username + ", usernameHash: " + usernameHash);
					or.a(-66);
					tba tba = gr.b(-117);
					tba.loginStream.writeByte(hea.e.packetID, (byte) -125);
					tba.loginStream.writeByte(usernameHash, (byte) -127);
					ud.a(tba, (byte) -36);
					InputStreamSub.a((byte) 123);
					hk.loginStage = 3;
				}
				if (hk.loginStage == 3) {
					System.out.println("Entering stage 3.");
					if (!ce.y.a(1, (byte) -107)) {
						return;
					}
					ce.y.a((byte) 112, 0, faa.loginStream.bytes, 1);
					int j = faa.loginStream.bytes[0] & 0xff;
					if (j != 0) {
						hk.loginStage = 0;
						fda.a((byte) 84, j);
						ce.y.d(0);
						ce.y = null;
						cfa.b((byte) -61);
						return;
					}
					hk.loginStage = 4;
				}
				if (hk.loginStage == 4) {
					System.out.println("Entering stage 4.");
					if (!ce.y.a(8, (byte) 126)) {
						return;
					}
					ce.y.a((byte) 127, 0, faa.loginStream.bytes, 8);
					faa.loginStream.pos = 0;
					bfa.C = faa.loginStream.readLong(false);
					BytesParser encryptedStream = new BytesParser(518);
					int[] sessionISAACKeys = new int[4];
					sessionISAACKeys[1] = (int) (9.9999999E7 * Math.random());
					sessionISAACKeys[2] = (int) (bfa.C >> 32);
					sessionISAACKeys[3] = (int) bfa.C;
					sessionISAACKeys[0] = (int) (Math.random() * 9.9999999E7);
					encryptedStream.writeByte(10, (byte) -117);
					encryptedStream.writeInt(sessionISAACKeys[0], -107);
					encryptedStream.writeInt(sessionISAACKeys[1], -125);
					encryptedStream.writeInt(sessionISAACKeys[2], -126);
					encryptedStream.writeInt(sessionISAACKeys[3], -105);
					encryptedStream.writeLong(aaa.stringToLong(0, op.username), -16719);
					encryptedStream.writeString(Interface.password, -20);
					encryptedStream.writeLong(bba.S, -16719);
					encryptedStream.writeLong(OutputStreamSub.e, -16719);
					encryptedStream.applyRSAEncryption(nf.publicRSAKey, 120, uf.rsaModulus);
					or.a(100);
					tba tba = gr.b(-108);
					LoginStream loginStream = tba.loginStream;
					if (jl.s != 2 && jl.s != 3) {
						loginStream.writeByte(hea.lobbyLoginOutPacket.packetID, (byte) -114);
						loginStream.writeShort(0, 13469);
						int pos = loginStream.pos;
						loginStream.writeInt(621, -102);
						loginStream.writeByte(me.q.h, (byte) -124);
						loginStream.writeByte(cba.languageID, (byte) -112);
						vq.writeBytesWithSetOffset(loginStream, 0);
						loginStream.writeString(ow.settings, -28);
						loginStream.writeInt(hl.affId, -104);
						dc.a(2797, loginStream);
						loginStream.writeBytes(65536, encryptedStream.pos, 0, encryptedStream.bytes);
						loginStream.writeLengthShort(loginStream.pos - pos, false);
					} else {
						if (hm.h != 13) {
							loginStream.writeByte(hea.mainLoginOutPacket.packetID, (byte) -113);
						} else {
							loginStream.writeByte(hea.mainLoginOutPacket2.packetID, (byte) -124);
						}
						loginStream.writeShort(0, 13469);
						int pos = loginStream.pos;
						loginStream.writeInt(621, -98);
						loginStream.writeByte(pda.y, (byte) -115);
						loginStream.writeByte(ia.getWMVersion(-116), (byte) -122);
						loginStream.writeShort(ff.width, 13469);
						loginStream.writeShort(eh.height, 13469);
						loginStream.writeByte(cs.g.Z, (byte) -109);
						vq.writeBytesWithSetOffset(loginStream, 0);
						loginStream.writeString(ow.settings, -121);
						loginStream.writeInt(hl.affId, -112);
						BytesParser bytesParser = new BytesParser(tm.d(4929));
						cs.g.a(92, bytesParser);
						loginStream.writeByte(bytesParser.pos, (byte) -115);
						loginStream.writeBytes(65536, bytesParser.pos, 0, bytesParser.bytes);
						NPCNode.k = true;
						BytesParser bytesParser_ = new BytesParser(kl.a(-1));
						new lg(true, nda.signlink).a(bytesParser_, -1);
						loginStream.writeBytes(65536, bytesParser_.bytes.length, 0, bytesParser_.bytes);
						loginStream.writeShort(qs.a, 13469);
						loginStream.writeLong(ak.userFlow, -16719);
						loginStream.writeByte(br.additionalInfo == null ? 0 : 1, (byte) -110);
						if (br.additionalInfo != null) {
							loginStream.writeString(br.additionalInfo, -61);
						}
						dc.a(2797, loginStream);
						loginStream.writeBytes(65536, encryptedStream.pos, 0, encryptedStream.bytes);
						loginStream.writeLengthShort(loginStream.pos - pos, false);
					}
					ud.a(tba, (byte) -36);
					InputStreamSub.a((byte) 88);
					pca.isaac = new ISAAC(sessionISAACKeys);
					for (int loopID = 0; loopID < 4; loopID++) {
						sessionISAACKeys[loopID] += 50;
					}
					faa.loginStream.a((byte) -55, sessionISAACKeys);
					hk.loginStage = 5;
				}
				if (hk.loginStage == 5) {
					System.out.println("Entering stage 5.");
					if (!ce.y.a(1, (byte) -83)) {
						return;
					}
					ce.y.a((byte) 48, 0, faa.loginStream.bytes, 1);
					int j = faa.loginStream.bytes[0] & 0xff;
					if (j != 21) {
						if (j == 29) {
							hk.loginStage = 14;
						} else {
							if (j == 1) {
								hk.loginStage = 6;
								fda.a((byte) 17, j);
								return;
							}
							if (j != 2) {
								if (j != 15) {
									if (j == 23 && km.q < 2) {
										hk.loginStage = 1;
										km.q++;
										rv.p = 0;
										ce.y.d(0);
										ce.y = null;
									} else {
										hk.loginStage = 0;
										fda.a((byte) 14, j);
										ce.y.d(0);
										ce.y = null;
										cfa.b((byte) -121);
										return;
									}
									return;
								}
								ck.currentGameInPacketSize = -2;
								hk.loginStage = 15;
							} else {
								hk.loginStage = 9;
							}
						}
					} else {
						hk.loginStage = 8;
					}
				}
				if (hk.loginStage == 7) {
					System.out.println("Entering stage 7.");
					or.a(-110);
					tba tba = gr.b(-122);
					LoginStream loginStream = tba.loginStream;
					loginStream.a(pca.isaac);
					loginStream.n(26951, hea.specialOutPacket26.packetID);
					ud.a(tba, (byte) -36);
					InputStreamSub.a((byte) 100);
					hk.loginStage = 5;
				} else if (hk.loginStage == 8) {
					System.out.println("Entering stage 8.");
					if (ce.y.a(1, (byte) -74)) {
						ce.y.a((byte) 50, 0, faa.loginStream.bytes, 1);
						int j = 0xff & faa.loginStream.bytes[0];
						hk.loginStage = 0;
						nc.m = 60 * (j + 3);
						fda.a((byte) 46, 21);
						ce.y.d(0);
						ce.y = null;
						cfa.b((byte) -100);
					}
				} else if (hk.loginStage == 14) {
					System.out.println("Entering stage 14.");
					if (ce.y.a(1, (byte) -8)) {
						ce.y.a((byte) 104, 0, faa.loginStream.bytes, 1);
						ip.T = faa.loginStream.bytes[0] & 0xff;
						hk.loginStage = 0;
						fda.a((byte) 52, 29);
						ce.y.d(0);
						ce.y = null;
						cfa.b((byte) -35);
					}
				} else if (hk.loginStage == 9) {
					System.out.println("Entering stage 9.");
					if (ce.y.a(1, (byte) -31)) {
						ce.y.a((byte) 81, 0, faa.loginStream.bytes, 1);
						saa.F = faa.loginStream.bytes[0] & 0xff;
						hk.loginStage = 10;
					}
				} else {
					if (hk.loginStage == 10) {
						System.out.println("Entering stage 10.");
						LoginStream loginStream = faa.loginStream;
						if (jl.s == 3) {
							uq.M = true;
						} else {
							uq.M = false;
						}
						if (jl.s != 2 && jl.s != 3) {
							if (!ce.y.a(saa.F, (byte) -52)) {
								return;
							}
							ce.y.a((byte) 93, 0, loginStream.bytes, saa.F);
							loginStream.pos = 0;
							hv.thisPlayersRights = loginStream.readUnsignedByte(-9268);
							qaa.gb = loginStream.readUnsignedByte(-9268);
							id.b = loginStream.readUnsignedByte(-9268) == 1;
							tb.a = loginStream.readUnsignedByte(-9268) == 1;
							nw.c = loginStream.readUnsignedByte(-9268) == 1;
							rea.C = loginStream.readShort2(49);
							Class_gb.h = rea.C > 0;
							cga.w = loginStream.readShort(13111);
							tu.a = loginStream.readShort(13111);
							sd.l = loginStream.readShort(13111);
							fba.L = loginStream.readInt(119);
							sa.t = nda.signlink.a(fba.L, (byte) 116);
							ei.b = loginStream.readUnsignedByte(-9268);
							pw.a = loginStream.readShort(13111);
							bk.c = loginStream.readShort(13111);
							ou.a = loginStream.readUnsignedByte(-9268) == 1;
							up.thisPlayer.displayName = up.thisPlayer.playerName = loginStream.readString2(-1);
							re.h = loginStream.readUnsignedByte(-9268);
							hea.b = loginStream.readInt(65);
							Class_kb.o = new World();
							Class_kb.o.worldID = loginStream.readShort(13111);
							if (Class_kb.o.worldID == 65535) {
								Class_kb.o.worldID = -1;
							}
							Class_kb.o.lobbyAddress = loginStream.readString2(-1);
							if (oba.pk != hs.modeWhere) {
								Class_kb.o.mainPort = Class_kb.o.worldID + 40000;
								Class_kb.o.worldPort = Class_kb.o.worldID + 50000;
							}
							if (hs.modeWhere != vea.a && (gm.world.isWorld(kfa.world) || gm.world.isWorld(Class_eb.world))) {
								vca.selectAutoWorld((byte) -60);
							}
						} else {
							if (!ce.y.a(saa.F, (byte) 112)) {
								return;
							}
							ce.y.a((byte) 65, 0, loginStream.bytes, saa.F);
							loginStream.pos = 0;
							hv.thisPlayersRights = loginStream.readUnsignedByte(-9268);
							qaa.gb = loginStream.readUnsignedByte(-9268);
							id.b = loginStream.readUnsignedByte(-9268) == 1;
							tb.a = loginStream.readUnsignedByte(-9268) == 1;
							nw.c = loginStream.readUnsignedByte(-9268) == 1;
							uda.d = loginStream.readUnsignedByte(-9268) == 1;
							ih.n = loginStream.readShort(13111);
							Class_gb.h = loginStream.readUnsignedByte(-9268) == 1;
							GameText.ub = loginStream.readTribyte2((byte) -60);
							rba.d = loginStream.readUnsignedByte(-9268) == 1;
							if (jl.s == 3) {
								boolean demo = loginStream.readUnsignedByte(-9268) == 1;
								if (demo) {
									long l = loginStream.readLong(false);
									String string = kba.a((byte) -119, l);
									int j = loginStream.readUnsignedByte(-9268);
									byte[] buf = new byte[j];
									loginStream.a(0, j, buf, -59);
									String string_ = ns.bytesToUTF8(-129, buf);
									FileOnDisk fileOnDisk = null;
									try {
										vfa vfa = nda.signlink.a("3", (byte) -28, false);
										while (vfa.f == 0) {
											Connection.a(-28448, 1L);
										}
										if (vfa.f == 1) {
											fileOnDisk = (FileOnDisk) vfa.hostName;
											int k = (17 + string.length() - (-string_.length() - 2 - 1));
											if (br.additionalInfo != null) {
												k += br.additionalInfo.length() + 2;
											}
											if (k > 120) {
												throw new RuntimeException(">120");
											}
											BytesParser bytesParser = new BytesParser(k + 1);
											bytesParser.writeByte(k, (byte) -126);
											bytesParser.writeByte(3, (byte) -114);
											bytesParser.writeString2(string, 77);
											bytesParser.writeString2(string_, -122);
											bytesParser.writeShort(hl.affId, 13469);
											bytesParser.writeLong(ak.userFlow, -16719);
											bytesParser.writeByte(br.additionalInfo != null ? 1 : 0, (byte) -111);
											if (br.additionalInfo != null) {
												bytesParser.writeString2(br.additionalInfo, 91);
											}
											bytesParser.b((byte) -120);
											fileOnDisk.write(0, bytesParser.pos, bytesParser.bytes);
										}
									} catch (Exception exception) {
										/* empty */
									}
									try {
										if (fileOnDisk != null) {
                                            fileOnDisk.close();
                                        }
									} catch (Exception exception) {
										/* empty */
									}
									try {
										rp.a(true, "demoaccountcreated", vj.applet);
									} catch (Throwable throwable) {
										/* empty */
									}
								}
							}
							ul.k.a(rba.d, -6407);
							laa.itemDefLoader.a(rba.d, 5);
							jm.p.a(rba.d, (byte) 116);
						}
						if (id.b && !nw.c || Class_gb.h) {
							try {
								rp.a(true, "zap", vj.applet);
							} catch (Throwable throwable) {
								if (wu.g) {
									try {
										vj.applet.getAppletContext().showDocument(new URL(vj.applet.getCodeBase(), "blank.ws"), "tbi");
									} catch (Exception exception) {
										/* empty */
									}
								}
							}
						} else {
							try {
								rp.a(true, "unzap", vj.applet);
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						if (hs.modeWhere == oba.pk) {
							try {
								rp.a(true, "loggedin", vj.applet);
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						if (jl.s != 2 && jl.s != 3) {
							hk.loginStage = 0;
							fda.a((byte) 36, 2);
							ng.a(true);
							ei.a(7, -119);
							sw.currentGameInPacket = null;
							return;
						}
						hk.loginStage = 12;
					}
					if (hk.loginStage == 12) {
						System.out.println("Entering stage 12");
						if (!ce.y.a(3, (byte) -53)) {
							return;
						}
						ce.y.a((byte) 57, 0, faa.loginStream.bytes, 3);
						hk.loginStage = 13;
					}
					if (hk.loginStage == 13) {
						System.out.println("Entering stage 13.");
						LoginStream loginStream = faa.loginStream;
						loginStream.pos = 0;
						if (loginStream.m((byte) 17)) {
							if (!ce.y.a(1, (byte) 121)) {
								return;
							}
							ce.y.a((byte) 84, 3, loginStream.bytes, 1);
						}
						sw.currentGameInPacket = IncomingPackets.getGameInPackets((byte) 103)[loginStream.f(false)];
						ck.currentGameInPacketSize = loginStream.readShort(13111);
						hk.loginStage = 11;
					}
					if (hk.loginStage == 11) {
						System.out.println("Entering stage 11.");
						if (ce.y.a(ck.currentGameInPacketSize, (byte) -65)) {
							ce.y.a((byte) 88, 0, faa.loginStream.bytes, ck.currentGameInPacketSize);
							faa.loginStream.pos = 0;
							hk.loginStage = 0;
							int size = ck.currentGameInPacketSize;
							fda.a((byte) 84, 2);
							tp.a(0);
							lk.a(faa.loginStream, 0);
							wj.q = -1;
							if (ku.incomingPacket100 == sw.currentGameInPacket) {
								ji.a(-510117917);
							} else {
								nda.a(2072317608);
							}
							if (faa.loginStream.pos != size) {
								throw new RuntimeException("lswp pos:" + faa.loginStream.pos + " psize:" + size);
							}
							sw.currentGameInPacket = null;
						}
					} else if (hk.loginStage == 15) {
						System.out.println("Entering stage 15.");
						if (ck.currentGameInPacketSize == -2) {
							if (!ce.y.a(2, (byte) 122)) {
								return;
							}
							ce.y.a((byte) 64, 0, faa.loginStream.bytes, 2);
							faa.loginStream.pos = 0;
							ck.currentGameInPacketSize = faa.loginStream.readShort(13111);
						}
						if (ce.y.a(ck.currentGameInPacketSize, (byte) 117)) {
							ce.y.a((byte) 100, 0, faa.loginStream.bytes, ck.currentGameInPacketSize);
							faa.loginStream.pos = 0;
							hk.loginStage = 0;
							int size = ck.currentGameInPacketSize;
							fda.a((byte) 105, 15);
							Class_mc.b(29723);
							lk.a(faa.loginStream, 0);
							if (size != faa.loginStream.pos) {
								throw new RuntimeException("lswpr pos:" + faa.loginStream.pos + " psize:" + size);
							}
							sw.currentGameInPacket = null;
						}
					}
				}
			} catch (IOException ioexception) {
				if (ce.y != null) {
					ce.y.d(0);
					ce.y = null;
				}
				if (km.q < 2) {
					if (jl.s == 2 || jl.s == 3) {
						gm.world.rotateConnectionMethods(0);
					} else {
						cf.world.rotateConnectionMethods(0);
					}
					rv.p = 0;
					km.q++;
					hk.loginStage = 1;
				} else {
					hk.loginStage = 0;
					fda.a((byte) 49, -4);
					cfa.b((byte) -31);
				}
			}
		}
	}

	static {
		h = false;
	}
}
