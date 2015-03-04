/* uw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

import jagex3.jagmisc.jagmisc;

public final class ClientScriptHandler {

    public static int a;
	private static int b;
    public static int c;
	private static qf[] qfs = new qf[50];
	private static int[][] ints;
    public static int f;
    public static int g;
	private static int offset;
    public static int i;
	private static int j = 0;
    public static int k;
    public static int l;
	private static int[] ints1;
	private static Interface interface_;
    public static int o;
	private static Calendar calendar;
	private static String[] strings;
	private static int[] ints2;
    public static int s;
	private static oe oe;
    public static int u;
	private static String[] strings1;
	private static int[] ints3;
	private static Interface interface_1;
    public static int y;
    public static tb tb_;
	private static int[] ints4;
	private static String[] monthNamesShort;
	private static int C;

	private static void getTextEffect(String effect) {
		if (hv.thisPlayersRights != 0 || (!id.b || tb.a) && !uda.d) {
			String string = effect.toLowerCase();
			int colorEffect = 0;
			if (string.startsWith(GameText.yellowTextEffect.getString(0))) {
				colorEffect = 0;
				effect = effect.substring(GameText.yellowTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.redTextEffect.getString(0))) {
				colorEffect = 1;
				effect = effect.substring(GameText.redTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.greenTextEffect.getString(0))) {
				colorEffect = 2;
				effect = effect.substring(GameText.greenTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.cyanTextEffect.getString(0))) {
				colorEffect = 3;
				effect = effect.substring(GameText.cyanTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.purpleTextEffect.getString(0))) {
				colorEffect = 4;
				effect = effect.substring(GameText.purpleTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.whiteTextEffect.getString(0))) {
				colorEffect = 5;
				effect = effect.substring(GameText.whiteTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.flash1TextEffect.getString(0))) {
				colorEffect = 6;
				effect = effect.substring(GameText.flash1TextEffect.getString(0).length());
			} else if (string.startsWith(GameText.flash2TextEffect.getString(0))) {
				colorEffect = 7;
				effect = effect.substring(GameText.flash2TextEffect.getString(0).length());
			} else if (string.startsWith(GameText.flash3TextEffect.getString(0))) {
				colorEffect = 8;
				effect = effect.substring(GameText.flash3TextEffect.getString(0).length());
			} else if (string.startsWith(GameText.glow1TextEffect.getString(0))) {
				colorEffect = 9;
				effect = effect.substring(GameText.glow1TextEffect.getString(0).length());
			} else if (string.startsWith(GameText.glow2TextEffect.getString(0))) {
				colorEffect = 10;
				effect = effect.substring(GameText.glow2TextEffect.getString(0).length());
			} else if (string.startsWith(GameText.glow3TextEffect.getString(0))) {
				colorEffect = 11;
				effect = effect.substring(GameText.glow3TextEffect.getString(0).length());
			} else if (cba.languageID != 0) {
				if (string.startsWith(GameText.yellowTextEffect.getString(cba.languageID))) {
					colorEffect = 0;
					effect = effect.substring(GameText.yellowTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.redTextEffect.getString(cba.languageID))) {
					colorEffect = 1;
					effect = effect.substring(GameText.redTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.greenTextEffect.getString(cba.languageID))) {
					colorEffect = 2;
					effect = effect.substring(GameText.greenTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.cyanTextEffect.getString(cba.languageID))) {
					colorEffect = 3;
					effect = effect.substring(GameText.cyanTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.purpleTextEffect.getString(cba.languageID))) {
					colorEffect = 4;
					effect = effect.substring(GameText.purpleTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.whiteTextEffect.getString(cba.languageID))) {
					colorEffect = 5;
					effect = effect.substring(GameText.whiteTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.flash1TextEffect.getString(cba.languageID))) {
					colorEffect = 6;
					effect = effect.substring(GameText.flash1TextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.flash2TextEffect.getString(cba.languageID))) {
					colorEffect = 7;
					effect = effect.substring(GameText.flash2TextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.flash3TextEffect.getString(cba.languageID))) {
					colorEffect = 8;
					effect = effect.substring(GameText.flash3TextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.glow1TextEffect.getString(cba.languageID))) {
					colorEffect = 9;
					effect = effect.substring(GameText.glow1TextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.glow2TextEffect.getString(cba.languageID))) {
					colorEffect = 10;
					effect = effect.substring(GameText.glow2TextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.glow3TextEffect.getString(cba.languageID))) {
					colorEffect = 11;
					effect = effect.substring(GameText.glow3TextEffect.getString(cba.languageID).length());
				}
			}
			string = effect.toLowerCase();
			int animateText = 0;
			if (string.startsWith(GameText.waveTextEffect.getString(0))) {
				animateText = 1;
				effect = effect.substring(GameText.waveTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.wave2TextEffect.getString(0))) {
				animateText = 2;
				effect = effect.substring(GameText.wave2TextEffect.getString(0).length());
			} else if (string.startsWith(GameText.shakeTextEffect.getString(0))) {
				animateText = 3;
				effect = effect.substring(GameText.shakeTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.scrollTextEffect.getString(0))) {
				animateText = 4;
				effect = effect.substring(GameText.scrollTextEffect.getString(0).length());
			} else if (string.startsWith(GameText.slideTextEffect.getString(0))) {
				animateText = 5;
				effect = effect.substring(GameText.slideTextEffect.getString(0).length());
			} else if (cba.languageID != 0) {
				if (string.startsWith(GameText.waveTextEffect.getString(cba.languageID))) {
					animateText = 1;
					effect = effect.substring(GameText.waveTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.wave2TextEffect.getString(cba.languageID))) {
					animateText = 2;
					effect = effect.substring(GameText.wave2TextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.shakeTextEffect.getString(cba.languageID))) {
					animateText = 3;
					effect = effect.substring(GameText.shakeTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.scrollTextEffect.getString(cba.languageID))) {
					animateText = 4;
					effect = effect.substring(GameText.scrollTextEffect.getString(cba.languageID).length());
				} else if (string.startsWith(GameText.slideTextEffect.getString(cba.languageID))) {
					animateText = 5;
					effect = effect.substring(GameText.slideTextEffect.getString(cba.languageID).length());
				}
			}
			ClientScriptHandler.i++;
            System.out.println("getTextEffect");
			tba tba = jga.sendGameOutPacket(hn.outgoingPacket32, pca.isaac, (byte) -56);
			tba.loginStream.writeByte(0, (byte) -120);
			int pos = tba.loginStream.pos;
			tba.loginStream.writeByte(colorEffect, (byte) -118);
			tba.loginStream.writeByte(animateText, (byte) -116);
			kg.a(-1, effect, tba.loginStream);
			tba.loginStream.writeLengthByte(tba.loginStream.pos - pos, 2105852);
			ud.a(tba, (byte) -36);
		}
	}

	public static void a(int i) {
		if (i != -1 && gf.a((byte) 109, i)) {
			Interface[] interfaces = Node_Sub.o[i];
			for (int index = 0; index < interfaces.length; index++) {
				Interface interface_ = interfaces[index];
				if (interface_.Tb != null) {
					ClientScript clientScript = new ClientScript();
					clientScript.interface_ = interface_;
					clientScript.objects = interface_.Tb;
					activateClientScript(clientScript, 2000000);
				}
			}
		}
	}

	private static void b(int i) {
		Interface interface_ = efa.a(-1018745488, i);
		if (interface_ != null) {
			int j = i >>> 16;
			Interface[] interfaces = mv.b[j];
			if (interfaces == null) {
				Interface[] interfaces1 = Node_Sub.o[j];
				int length = interfaces1.length;
				interfaces = mv.b[j] = new Interface[length];
				co.a(interfaces1, 0, interfaces, 0, interfaces1.length);
			}
			int index;
			for (index = 0; index < interfaces.length; index++) {
				if (interfaces[index] == interface_) {
                    break;
                }
			}
			if (index < interfaces.length) {
				co.a(interfaces, 0, interfaces, 1, index);
				interfaces[0] = interface_;
			}
		}
	}

	public static void activateClientScript(ClientScript clientScript) {
		activateClientScript(clientScript, 200000);
	}

	private static void activateHighClientScriptCommand(int command) {
		if (command < 5100) {
			if (command == 5000) {
				ints3[j++] = Class_fd.t;
				return;
			}
			if (command == 5001) {
				j -= 3;
				Class_fd.t = ints3[j];
				hga.b = saa.b(34067, ints3[j + 1]);
				if (hga.b == null) {
                    hga.b = ol.j;
                }
				aaa.a = ints3[j + 2];
				k++;
				tba tba = jga.sendGameOutPacket(GrandExchangeItem.outgoingPacket21, pca.isaac, (byte) -107);
				tba.loginStream.writeByte(Class_fd.t, (byte) -124);
				tba.loginStream.writeByte(hga.b.e, (byte) -119);
				tba.loginStream.writeByte(aaa.a, (byte) -118);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5002) {
				offset -= 2;
				String string = strings[offset];
				String string1 = strings[offset + 1];
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				if (string1 == null) {
                    string1 = "";
                }
				if (string1.length() > 80) {
                    string1 = string1.substring(0, 80);
                }
				o++;
				tba tba = jga.sendGameOutPacket(bm.outgoingPacket78, pca.isaac, (byte) 120);
				tba.loginStream.writeByte((cq.a(string, (byte) 2) + 2 + cq.a(string1, (byte) 2)), (byte) -127);
				tba.loginStream.writeString(string, -121);
				tba.loginStream.writeByte(i - 1, (byte) -117);
				tba.loginStream.writeByte(j, (byte) -110);
				tba.loginStream.writeString(string1, -35);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5003) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) -64);
				String string = "";
				if (sc != null && sc.g != null) {
                    string = sc.g;
                }
				strings[offset++] = string;
				return;
			}
			if (command == 5004) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) -101);
				int j = -1;
				if (sc != null) {
                    j = sc.k;
                }
				ints3[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5005) {
				if (hga.b == null) {
                    ints3[j++] = -1;
                } else {
					ints3[j++] = hga.b.e;
					return;
				}
				return;
			}
			if (command == 5006) {
				int i = ints3[--j];
				tba tba = jga.sendGameOutPacket(iga.outgoingPacket45, pca.isaac, (byte) -74);
				tba.loginStream.writeByte(i, (byte) -115);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5008) {
				String string = strings[--offset];
				getTextEffect(string);
				return;
			}
			if (command == 5009) {
				offset -= 2;
				String string = strings[offset];
				String string1 = strings[offset + 1];
				if (hv.thisPlayersRights != 0 || (!id.b || tb.a) && !uda.d) {
					u++;
					tba tba = jga.sendGameOutPacket(lr.outgoingPacket66, pca.isaac, (byte) -81);
					tba.loginStream.writeByte(0, (byte) -119);
					int position = tba.loginStream.pos;
					tba.loginStream.writeString(string, -18);
					kg.a(-1, string1, tba.loginStream);
					tba.loginStream.writeLengthByte(tba.loginStream.pos - position, 2105852);
					ud.a(tba, (byte) -36);
					return;
				}
				return;
			}
			if (command == 5010) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) -45);
				String string = "";
				if (sc != null && sc.j != null) {
                    string = sc.j;
                }
				strings[offset++] = string;
				return;
			}
			if (command == 5011) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) 117);
				String string = "";
				if (sc != null && sc.d != null) {
                    string = sc.d;
                }
				strings[offset++] = string;
				return;
			}
			if (command == 5012) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) 101);
				int j = -1;
				if (sc != null) {
                    j = sc.f;
                }
				ints3[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5015) {
				String username;
				if (up.thisPlayer != null && up.thisPlayer.playerName != null) {
                    username = up.thisPlayer.getUserDisplayName((byte) -122, true);
                } else {
                    username = op.username;
                }
				strings[offset++] = username;
				return;
			}
			if (command == 5016) {
				ints3[j++] = aaa.a;
				return;
			}
			if (command == 5017) {
				ints3[j++] = el.a(1818);
				return;
			}
			if (command == 5018) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) -115);
				int j = 0;
				if (sc != null) {
                    j = sc.m;
                }
				ints3[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5019) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) 113);
				String string = "";
				if (sc != null && sc.c != null) {
                    string = sc.c;
                }
				strings[offset++] = string;
				return;
			}
			if (command == 5020) {
				String username;
				if (up.thisPlayer != null && up.thisPlayer.playerName != null) {
                    username = up.thisPlayer.getDisplayName(false, (byte) -7);
                } else {
                    username = op.username;
                }
				strings[offset++] = username;
				return;
			}
			if (command == 5023) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) -98);
				int j = -1;
				if (sc != null) {
                    j = sc.a;
                }
				ints3[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5024) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) -120);
				int j = -1;
				if (sc != null) {
                    j = sc.l;
                }
				ints3[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5025) {
				int i = ints3[--j];
				sc sc = aw.a(i, (byte) 121);
				String string = "";
				if (sc != null && sc.e != null) {
                    string = sc.e;
                }
				strings[offset++] = string;
				return;
			}
			if (command == 5050) {
				int i = ints3[--j];
				strings[offset++] = mj.l.a(120, i).w;
				return;
			}
			if (command == 5051) {
				int i = ints3[--j];
				qt qt = mj.l.a(28, i);
				if (qt.x == null) {
                    ints3[j++] = 0;
                } else {
					ints3[j++] = qt.x.length;
					return;
				}
				return;
			}
			if (command == 5052) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				qt qt = mj.l.a(69, i);
				int k = qt.x[j];
				ints3[ClientScriptHandler.j++] = k;
				return;
			}
			if (command == 5053) {
				int i = ints3[--j];
				qt qt = mj.l.a(72, i);
				if (qt.t == null) {
                    ints3[j++] = 0;
                } else {
					ints3[j++] = qt.t.length;
					return;
				}
				return;
			}
			if (command == 5054) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				ints3[ClientScriptHandler.j++] = mj.l.a(103, i).t[j];
				return;
			}
			if (command == 5055) {
				int i = ints3[--j];
				strings[offset++] = ul.s.a(i, (byte) 14).b((byte) -107);
				return;
			}
			if (command == 5056) {
				int i = ints3[--j];
				uj uj = ul.s.a(i, (byte) 105);
				if (uj.C == null) {
                    ints3[j++] = 0;
                } else {
					ints3[j++] = uj.C.length;
					return;
				}
				return;
			}
			if (command == 5057) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				ints3[ClientScriptHandler.j++] = ul.s.a(i, (byte) 9).C[j];
				return;
			}
			if (command == 5058) {
				oe = new oe();
				oe.a = ints3[--j];
				oe.d = ul.s.a(oe.a, (byte) 65);
				oe.g = new int[oe.d.c((byte) 3)];
				return;
			}
			if (command == 5059) {
				c++;
				tba tba = jga.sendGameOutPacket(sc.outgoingPacket67, pca.isaac, (byte) -89);
				tba.loginStream.writeByte(0, (byte) -121);
				int pos = tba.loginStream.pos;
				tba.loginStream.writeByte(0, (byte) -112);
				tba.loginStream.writeShort(oe.a, 13469);
				oe.d.a(oe.g, 0, tba.loginStream);
				tba.loginStream.writeLengthByte(tba.loginStream.pos - pos, 2105852);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5060) {
				String string = strings[--offset];
				l++;
				tba tba = jga.sendGameOutPacket(sh.outgoingPacket62, pca.isaac, (byte) 101);
				tba.loginStream.writeByte(0, (byte) -114);
				int pos = tba.loginStream.pos;
				tba.loginStream.writeString(string, -112);
				tba.loginStream.writeShort(oe.a, 13469);
				oe.d.a(oe.g, 0, tba.loginStream);
				tba.loginStream.writeLengthByte(tba.loginStream.pos - pos, 2105852);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5061) {
				c++;
				tba tba = jga.sendGameOutPacket(sc.outgoingPacket67, pca.isaac, (byte) 91);
				tba.loginStream.writeByte(0, (byte) -127);
				int pos = tba.loginStream.pos;
				tba.loginStream.writeByte(1, (byte) -108);
				tba.loginStream.writeShort(oe.a, 13469);
				oe.d.a(oe.g, 0, tba.loginStream);
				tba.loginStream.writeLengthByte(tba.loginStream.pos - pos, 2105852);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5062) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				ints3[ClientScriptHandler.j++] = mj.l.a(49, i).s[j];
				return;
			}
			if (command == 5063) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				ints3[ClientScriptHandler.j++] = mj.l.a(50, i).A[j];
				return;
			}
			if (command == 5064) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				if (j == -1) {
                    ints3[ClientScriptHandler.j++] = -1;
                } else {
					ints3[ClientScriptHandler.j++] = mj.l.a(102, i).a((char) j, 3766);
					return;
				}
				return;
			}
			if (command == 5065) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				if (j == -1) {
                    ints3[ClientScriptHandler.j++] = -1;
                } else {
					ints3[ClientScriptHandler.j++] = mj.l.a(36, i).a((byte) 40, (char) j);
					return;
				}
				return;
			}
			if (command == 5066) {
				int i = ints3[--j];
				ints3[j++] = ul.s.a(i, (byte) 102).c((byte) 3);
				return;
			}
			if (command == 5067) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ul.s.a(i, (byte) 75).a(-127, j).j;
				ints3[ClientScriptHandler.j++] = k;
				return;
			}
			if (command == 5068) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				oe.g[i] = j;
				return;
			}
			if (command == 5069) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				oe.g[i] = j;
				return;
			}
			if (command == 5070) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				uj uj = ul.s.a(i, (byte) 34);
				if (uj.a(-121, j).j != 0) {
                    throw new RuntimeException("bad command");
                }
				ints3[ClientScriptHandler.j++] = uj.a(66, k, j);
				return;
			}
			if (command == 5071) {
				String string = strings[--offset];
				boolean bool1 = ints3[--j] == 1;
				jk.a(true, string, bool1);
				ints3[j++] = uh.a;
				return;
			}
			if (command == 5072) {
				if (oga.a == null || Class_u.N >= uh.a) {
                    ints3[j++] = -1;
                } else {
					ints3[j++] = oga.a[Class_u.N++] & 0xffff;
					return;
				}
				return;
			}
			if (command == 5073) {
				Class_u.N = 0;
				return;
			}
		} else if (command < 5200) {
			if (command == 5100) {
				if (uc.c.a((byte) -68, 86)) {
                    ints3[j++] = 1;
                } else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5101) {
				if (uc.c.a((byte) -68, 82)) {
                    ints3[j++] = 1;
                } else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5102) {
				if (uc.c.a((byte) -68, 81)) {
                    ints3[j++] = 1;
                } else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
		} else if (command < 5300) {
			if (command == 5200) {
				ou.a(ints3[--j], (byte) -123);
				return;
			}
			if (command == 5201) {
				ints3[j++] = cda.b(3411);
				return;
			}
			if (command == 5205) {
				hga.a(ints3[--j], -1, -1, false, -1);
				return;
			}
			if (command == 5206) {
				int i = ints3[--j];
				eaa eaa = kca.b(i >> 14 & 0x3fff, i & 0x3fff);
				if (eaa == null) {
                    ints3[j++] = -1;
                } else {
					ints3[j++] = eaa.t;
					return;
				}
				return;
			}
			if (command == 5207) {
				eaa eaa = kca.a(ints3[--j]);
				if (eaa == null || eaa.G == null) {
                    strings[offset++] = "";
                } else {
					strings[offset++] = eaa.G;
					return;
				}
				return;
			}
			if (command == 5208) {
				ints3[j++] = uda.b;
				ints3[j++] = dea.h;
				return;
			}
			if (command == 5209) {
				ints3[j++] = ut.I + kca.F;
				ints3[j++] = cv.d + kca.E;
				return;
			}
			if (command == 5210) {
				int i = ints3[--j];
				eaa eaa = kca.a(i);
				if (eaa == null) {
					ints3[j++] = 0;
					ints3[j++] = 0;
				} else {
					ints3[j++] = eaa.u >> 14 & 0x3fff;
					ints3[j++] = eaa.u & 0x3fff;
					return;
				}
				return;
			}
			if (command == 5211) {
				int i = ints3[--j];
				eaa eaa = kca.a(i);
				if (eaa == null) {
					ints3[j++] = 0;
					ints3[j++] = 0;
				} else {
					ints3[j++] = eaa.F - eaa.s;
					ints3[j++] = eaa.C - eaa.H;
					return;
				}
				return;
			}
			if (command == 5212) {
				Class_vb class_vb = tj.b(2048);
				if (class_vb == null) {
					ints3[j++] = -1;
					ints3[j++] = -1;
				} else {
					ints3[j++] = class_vb.o;
					int i = (class_vb.t << 28 | class_vb.m + kca.F << 14 | class_vb.n + kca.E);
					ints3[j++] = i;
					return;
				}
				return;
			}
			if (command == 5213) {
				Class_vb class_vb = Class_q.b(-102);
				if (class_vb == null) {
					ints3[j++] = -1;
					ints3[j++] = -1;
				} else {
					ints3[j++] = class_vb.o;
					int i = (class_vb.t << 28 | class_vb.m + kca.F << 14 | class_vb.n + kca.E);
					ints3[j++] = i;
					return;
				}
				return;
			}
			if (command == 5214) {
				int i = ints3[--j];
				eaa eaa = naa.e((byte) 103);
				if (eaa != null) {
					boolean bool1 = eaa.a(i >> 14 & 0x3fff, i & 0x3fff, ints4, 255, i >> 28 & 0x3);
					if (bool1) {
                        em.a(ints4[2], ints4[1], 113);
                    }
				}
				return;
			}
			if (command == 5215) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				je je = kca.a(i >> 14 & 0x3fff, i & 0x3fff);
				boolean bool1 = false;
				for (eaa eaa = (eaa) je.d((byte) -75); eaa != null; eaa = (eaa) je.a(1252027233)) {
					if (eaa.t == j) {
						bool1 = true;
						break;
					}
				}
				if (bool1) {
                    ints3[ClientScriptHandler.j++] = 1;
                } else {
					ints3[ClientScriptHandler.j++] = 0;
					return;
				}
				return;
			}
			if (command == 5218) {
				int i = ints3[--j];
				eaa eaa = kca.a(i);
				if (eaa == null) {
                    ints3[j++] = -1;
                } else {
					ints3[j++] = eaa.w;
					return;
				}
				return;
			}
			if (command == 5220) {
				ints3[j++] = taa.b == 100 ? 1 : 0;
				return;
			}
			if (command == 5221) {
				int i = ints3[--j];
				em.a(i & 0x3fff, i >> 14 & 0x3fff, -17);
				return;
			}
			if (command == 5222) {
				eaa eaa = naa.e((byte) 103);
				if (eaa != null) {
					boolean bool1 = eaa.a(cv.d + kca.E, ut.I + kca.F, ints4, (byte) -125);
					if (bool1) {
						ints3[j++] = ints4[1];
						ints3[j++] = ints4[2];
					} else {
						ints3[j++] = -1;
						ints3[j++] = -1;
					}
				} else {
					ints3[j++] = -1;
					ints3[j++] = -1;
					return;
				}
				return;
			}
			if (command == 5223) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				hga.a(i, -1, j & 0x3fff, false, j >> 14 & 0x3fff);
				return;
			}
			if (command == 5224) {
				int i = ints3[--j];
				eaa eaa = naa.e((byte) 103);
				if (eaa != null) {
					boolean bool1 = eaa.a(i >> 14 & 0x3fff, i & 0x3fff, ints4, 255, i >> 28 & 0x3);
					if (bool1) {
						ints3[j++] = ints4[1];
						ints3[j++] = ints4[2];
					} else {
						ints3[j++] = -1;
						ints3[j++] = -1;
					}
				} else {
					ints3[j++] = -1;
					ints3[j++] = -1;
					return;
				}
				return;
			}
			if (command == 5225) {
				int i = ints3[--j];
				eaa eaa = naa.e((byte) 103);
				if (eaa != null) {
					boolean bool1 = eaa.a(i & 0x3fff, i >> 14 & 0x3fff, ints4, (byte) -114);
					if (bool1) {
						ints3[j++] = ints4[1];
						ints3[j++] = ints4[2];
					} else {
						ints3[j++] = -1;
						ints3[j++] = -1;
					}
				} else {
					ints3[j++] = -1;
					ints3[j++] = -1;
					return;
				}
				return;
			}
			if (command == 5226) {
				bea.b(ints3[--j], 9192);
				return;
			}
			if (command == 5227) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				hga.a(i, -1, j & 0x3fff, true, j >> 14 & 0x3fff);
				return;
			}
			if (command == 5228) {
				fu.f = ints3[--j] == 1;
				return;
			}
			if (command == 5229) {
				ints3[j++] = fu.f ? 1 : 0;
				return;
			}
			if (command == 5230) {
				int i = ints3[--j];
				Class_pb.a(3, i);
				return;
			}
			if (command == 5231) {
				j -= 2;
				int i = ints3[j];
				boolean bool1 = ints3[j + 1] == 1;
				if (SpecialOutPacket.i1 != null) {
					Node node = SpecialOutPacket.i1.a(-32748, (long) i);
					if (node != null && !bool1) {
                        node.unlink(-14);
                    } else if (node == null && bool1) {
						node = new Node();
						SpecialOutPacket.i1.a(node, (byte) -50, (long) i);
					}
				}
				return;
			}
			if (command == 5232) {
				int i = ints3[--j];
				if (SpecialOutPacket.i1 != null) {
					Node node = SpecialOutPacket.i1.a(-32748, (long) i);
					ints3[j++] = node != null ? 1 : 0;
				} else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5233) {
				j -= 2;
				int i = ints3[j];
				boolean bool1 = ints3[j + 1] == 1;
				if (dd.I != null) {
					Node node = dd.I.a(-32748, (long) i);
					if (node != null && !bool1) {
                        node.unlink(-121);
                    } else if (node == null && bool1) {
						node = new Node();
						dd.I.a(node, (byte) -87, (long) i);
					}
				}
				return;
			}
			if (command == 5234) {
				int i = ints3[--j];
				if (dd.I != null) {
					Node node = dd.I.a(-32748, (long) i);
					ints3[j++] = node != null ? 1 : 0;
				} else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5235) {
				ints3[j++] = kca.c != null ? kca.c.t : -1;
				return;
			}
			if (command == 5236) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = j >> 14 & 0x3fff;
				int i1 = j & 0x3fff;
				int j1 = lba.b(i1, -100, i, k);
				if (j1 < 0) {
                    ints3[ClientScriptHandler.j++] = -1;
                } else {
					ints3[ClientScriptHandler.j++] = j1;
					return;
				}
				return;
			}
			if (command == 5237) {
				Class_ue.a(-108);
				return;
			}
		} else if (command < 5400) {
			if (command == 5300) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				kea.setWM(false, (byte) 126, i, j, 3);
				ints3[ClientScriptHandler.j++] = em.a != null ? 1 : 0;
				return;
			}
			if (command == 5301) {
				if (em.a != null) {
                    kea.setWM(false, (byte) 126, -1, -1, cs.g.w);
                }
				return;
			}
			if (command == 5302) {
				ro[] ros = vq.a((byte) 58);
				ints3[j++] = ros.length;
				return;
			}
			if (command == 5303) {
				int i = ints3[--j];
				ro[] ros = vq.a((byte) 58);
				ints3[j++] = ros[i].d;
				ints3[j++] = ros[i].a;
				return;
			}
			if (command == 5305) {
				int i = cs.g.W;
				int j = cs.g.F;
				int k = -1;
				ro[] ros = vq.a((byte) 58);
				for (int index = 0; index < ros.length; index++) {
					ro ro = ros[index];
					if (ro.d == i && ro.a == j) {
						k = index;
						break;
					}
				}
				ints3[ClientScriptHandler.j++] = k;
				return;
			}
			if (command == 5306) {
				ints3[j++] = ia.getWMVersion(110);
				return;
			}
			if (command == 5307) {
				int wmVersion = ints3[--j];
				if (wmVersion >= 1 && wmVersion <= 2) {
					kea.setWM(false, (byte) 126, -1, -1, wmVersion);
					return;
				}
				return;
			}
			if (command == 5308) {
				ints3[j++] = cs.g.w;
				return;
			}
			if (command == 5309) {
				int i = ints3[--j];
				if (i >= 1 && i <= 2) {
					cs.g.w = i;
					cs.g.a(nda.signlink, (byte) 32);
					return;
				}
				return;
			}
		} else if (command < 5500) {
			if (command == 5400) {
				offset -= 2;
				String string = strings[offset];
				String string1 = strings[offset + 1];
				int i = ints3[--j];
				f++;
				tba tba = jga.sendGameOutPacket(kj.outgoingPacket56, pca.isaac, (byte) -69);
				tba.loginStream.writeByte((cq.a(string, (byte) 2) + cq.a(string1, (byte) 2) + 1), (byte) -123);
				tba.loginStream.writeString(string, -43);
				tba.loginStream.writeString(string1, -21);
				tba.loginStream.writeByte(i, (byte) -120);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5401) {
				j -= 2;
				lf.n[ints3[j]] = (short) lg.a(53, ints3[j + 1]);
				laa.itemDefLoader.d(0);
				laa.itemDefLoader.b(-34);
				jm.p.c((byte) -122);
				fda.a(0);
				return;
			}
			if (command == 5405) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				if (i >= 0 && i < 2) {
                    Class_jc.lb[i] = new int[j << 1][4];
                }
				return;
			}
			if (command == 5406) {
				j -= 7;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1] << 1;
				int k = ints3[ClientScriptHandler.j + 2];
				int i1 = ints3[ClientScriptHandler.j + 3];
				int j1 = ints3[ClientScriptHandler.j + 4];
				int k1 = ints3[j + 5];
				int i2 = ints3[j + 6];
				if (i >= 0 && i < 2 && Class_jc.lb[i] != null && j >= 0 && j < Class_jc.lb[i].length) {
					Class_jc.lb[i][j] = new int[] { (k >> 14 & 0x3fff) << 9, i1 << 2, (k & 0x3fff) << 9, i2 };
					Class_jc.lb[i][j + 1] = new int[] { (j1 >> 14 & 0x3fff) << 9, k1 << 2, (j1 & 0x3fff) << 9 };
				}
				return;
			}
			if (command == 5407) {
				int i = Class_jc.lb[ints3[--j]].length >> 1;
				ints3[j++] = i;
				return;
			}
			if (command == 5411) {
				if (em.a != null) {
                    kea.setWM(false, (byte) 126, -1, -1, cs.g.w);
                }
				if (ws.J != null) {
					cc.saveVarcs(false);
					System.exit(0);
				} else {
					String string = bt.quitURL != null ? bt.quitURL : pm.d(-9316);
					wj.a(126, string, nda.signlink, on.performance == 1, false);
					return;
				}
				return;
			}
			if (command == 5419) {
				String string = "";
				if (sa.t != null) {
					if (sa.t.hostName != null) {
                        string = (String) sa.t.hostName;
                    } else {
                        string = sda.a((byte) 82, sa.t.priority);
                    }
				}
				strings[offset++] = string;
				return;
			}
			if (command == 5420) {
				ints3[j++] = nda.signlink.r ? 0 : 1;
				return;
			}
			if (command == 5421) {
				if (em.a != null) {
                    kea.setWM(false, (byte) 126, -1, -1, cs.g.w);
                }
				String string = strings[--offset];
				boolean bool1 = ints3[--j] == 1;
				String string1 = pm.d(-9316) + string;
				wj.a(125, string1, nda.signlink, on.performance == 1, bool1);
				return;
			}
			if (command == 5422) {
				offset -= 2;
				String string = strings[offset];
				String string1 = strings[offset + 1];
				int i = ints3[--j];
				if (string.length() > 0) {
					if (kr.e == null) {
                        kr.e = new String[wu.h[me.q.h]];
                    }
					kr.e[i] = string;
				}
				if (string1.length() > 0) {
					if (OutputStreamSub.g == null) {
                        OutputStreamSub.g = new String[wu.h[me.q.h]];
                    }
					OutputStreamSub.g[i] = string1;
				}
				return;
			}
			if (command == 5423) {
				System.out.println(strings[--offset]);
				return;
			}
			if (command == 5424) {
				j -= 11;
				dk.q = ints3[j];
				rm.o = ints3[j + 1];
				laa.a = ints3[j + 2];
				tda.f = ints3[j + 3];
				ik.t = ints3[j + 4];
				lfa.c = ints3[j + 5];
				pv.k = ints3[j + 6];
				jj.r = ints3[j + 7];
				uj.A = ints3[j + 8];
				vea.d = ints3[j + 9];
				ce.e = ints3[j + 10];
				sm.a.g(1912, ik.t);
				sm.a.g(1912, lfa.c);
				sm.a.g(1912, pv.k);
				sm.a.g(1912, jj.r);
				sm.a.g(1912, uj.A);
				Player.od = io.P = dba.d = null;
				lk.k = oca.h = ea.N = null;
				tp.c = iga.g = null;
				lq.hb = true;
				return;
			}
			if (command == 5425) {
				ir.b(17381);
				lq.hb = false;
				return;
			}
			if (command == 5426) {
				j -= 2;
				Login.j = ints3[j];
				jt.b = ints3[j + 1];
				return;
			}
			if (command == 5427) {
				j -= 2;
				ml.h = ints3[j + 1];
				return;
			}
			if (command == 5428) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				ints3[ClientScriptHandler.j++] = vq.a(false, i, j) ? 1 : 0;
				return;
			}
			if (command == 5429) {
				Commands.applyClientCommand(0, false, strings[--offset], false);
				return;
			}
			if (command == 5430) {
				try {
					rp.a(true, "accountcreated", vj.applet);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (command == 5431) {
				try {
					rp.a(true, "accountcreatestarted", vj.applet);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (command == 5432) {
				String string = "";
				if (sg.d != null) {
					Transferable transferable = sg.d.getContents(null);
					if (transferable != null) {
						try {
							string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string == null) {
                                string = "";
                            }
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
				strings[offset++] = string;
				return;
			}
		} else if (command < 5600) {
			if (command == 5500) {
				j -= 4;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				int i1 = ints3[ClientScriptHandler.j + 3];
				Class_ub.a(false, (i >> 14 & 0x3fff) - bfa.thisPlayersRegionX, k, i1, false, (i & 0x3fff) - BytesParser.thisPlayersRegionY, j << 2);
				return;
			}
			if (command == 5501) {
				j -= 4;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				int i1 = ints3[ClientScriptHandler.j + 3];
				it.a((byte) -16, k, (i >> 14 & 0x3fff) - bfa.thisPlayersRegionX, (i & 0x3fff) - BytesParser.thisPlayersRegionY, j << 2, i1);
				return;
			}
			if (command == 5502) {
				j -= 6;
				int i = ints3[j];
				if (i >= 2) {
                    throw new RuntimeException();
                }
				mg.t = i;
				int j = ints3[ClientScriptHandler.j + 1];
				if (j + 1 >= Class_jc.lb[mg.t].length >> 1) {
                    throw new RuntimeException();
                }
				rn.c = j;
				aj.d = 0;
				gn.I = ints3[ClientScriptHandler.j + 2];
				rv.A = ints3[ClientScriptHandler.j + 3];
				int k = ints3[ClientScriptHandler.j + 4];
				if (k >= 2) {
                    throw new RuntimeException();
                }
				pi.n = k;
				int i1 = ints3[ClientScriptHandler.j + 5];
				if (i1 + 1 >= Class_jc.lb[pi.n].length >> 1) {
                    throw new RuntimeException();
                }
				Class_kf.I = i1;
				ll.x = 3;
				ja.Cc = dj.o = -1;
				return;
			}
			if (command == 5503) {
				FileOnDisk.c();
				return;
			}
			if (command == 5504) {
				j -= 2;
				vr.a(0, ints3[j + 1], ints3[j], 8);
				return;
			}
			if (command == 5505) {
				ints3[j++] = (int) pm.F >> 3;
				return;
			}
			if (command == 5506) {
				ints3[j++] = (int) qw.n >> 3;
				return;
			}
			if (command == 5507) {
				oh.a((byte) -87);
				return;
			}
			if (command == 5508) {
				cba.b(-17);
				return;
			}
			if (command == 5509) {
				pg.a(191);
				return;
			}
			if (command == 5510) {
				jba.b((byte) 6);
				return;
			}
			if (command == 5511) {
				int i = ints3[--j];
				int x = i >> 14 & 0x3fff;
				int y = i & 0x3fff;
				x -= bfa.thisPlayersRegionX;
				if (x < 0) {
                    x = 0;
                } else if (x >= Class_hc.e) {
                    x = Class_hc.e;
                }
				y -= BytesParser.thisPlayersRegionY;
				if (y < 0) {
                    y = 0;
                } else if (y >= bw.v) {
                    y = bw.v;
                }
				fu.a = (x << 9) + 256;
				qg.j = (y << 9) + 256;
				ll.x = 4;
				ja.Cc = dj.o = -1;
				return;
			}
			if (command == 5512) {
				lp.b(5);
				return;
			}
			if (command == 5517) {
				int i = ints3[--j];
				if (i == -1) {
					int x = i >> 14 & 0x3fff;
					int y = i & 0x3fff;
					x -= bfa.thisPlayersRegionX;
					if (x < 0) {
                        x = 0;
                    } else if (x >= Class_hc.e) {
                        x = Class_hc.e;
                    }
					y -= BytesParser.thisPlayersRegionY;
					if (y < 0) {
                        y = 0;
                    } else if (y >= bw.v) {
                        y = bw.v;
                    }
					ja.Cc = (x << 9) + 256;
					dj.o = (y << 9) + 256;
				} else {
					ja.Cc = -1;
					dj.o = -1;
					return;
				}
				return;
			}
		} else if (command < 5700) {
			if (command == 5600) {
				offset -= 2;
				String username = strings[offset];
				String password = strings[offset + 1];
				int i = ints3[--j];
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					op.username = username;
					Interface.password = password;
					pda.y = i;
					ei.a(6, -117);
					return;
				}
				return;
			}
			if (command == 5601) {
				sj.a(false);
				return;
			}
			if (command == 5602) {
				if (hk.loginStage == 0) {
					td.l = -2;
					br.l = -2;
				}
				return;
			}
			if (command == 5603) {
				j -= 4;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					Class_r.a(ints3[j], ints3[j + 3], ints3[j + 2], ints3[j + 1], (byte) 99);
					return;
				}
				return;
			}
			if (command == 5604) {
				offset--;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					us.a(-119, aaa.stringToLong(0, strings[offset]));
					return;
				}
				return;
			}
			if (command == 5605) {
				offset -= 2;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					im.a(strings[offset + 1], aaa.stringToLong(0, strings[offset]), false, (byte) 110);
					return;
				}
				return;
			}
			if (command == 5606) {
				if (Class_eb.q == 0) {
                    RSKeyListener.s = -2;
                }
				return;
			}
			if (command == 5607) {
				ints3[j++] = br.l;
				return;
			}
			if (command == 5608) {
				ints3[j++] = nc.m;
				return;
			}
			if (command == 5609) {
				ints3[j++] = RSKeyListener.s;
				return;
			}
			if (command == 5610) {
				for (int index = 0; index < 5; index++) {
                    strings[offset++] = (bg.f != null && bg.f.length > index ? rg.a((byte) 111, bg.f[index]) : "");
                }
				bg.f = null;
				return;
			}
			if (command == 5611) {
				ints3[j++] = ip.T;
				return;
			}
			if (command == 5612) {
				int i = ints3[--j];
				if (hm.h == 7 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					if (ce.y != null) {
						ce.y.d(0);
						ce.y = null;
					}
					pda.y = i;
					ei.a(9, -104);
					return;
				}
				return;
			}
			if (command == 5613) {
				ints3[j++] = br.l;
				return;
			}
			if (command == 5615) {
				offset -= 2;
				String username = strings[offset];
				String password = strings[offset + 1];
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					if (ce.y != null) {
						ce.y.d(0);
						ce.y = null;
					}
					op.username = username;
					Interface.password = password;
					ei.a(5, -122);
					return;
				}
				return;
			}
			if (command == 5616) {
				la.logout((byte) 21, false);
				return;
			}
			if (command == 5617) {
				ints3[j++] = td.l;
				return;
			}
			if (command == 5618) {
				int i = ints3[--j];
				Class_fd.demoLogin(false, i, 3);
				return;
			}
			if (command == 5619) {
				int i = ints3[--j];
				Class_fd.demoLogin(true, i, 3);
				return;
			}
			if (command == 5620) {
				qca.a(-95);
				if (nu.i != "" && nu.i != "") {
                    ints3[j++] = 1;
                } else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5621) {
				offset -= 2;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					im.a(strings[offset + 1], aaa.stringToLong(0, strings[offset]), true, (byte) 103);
					return;
				}
				return;
			}
			if (command == 5622) {
				vfa vfa = nda.signlink.a("3", (byte) -28, false);
				while (vfa.f == 0) {
                    Connection.a(-28448, 1L);
                }
				if (vfa.f == 2) {
                    throw new RuntimeException("Error opening file");
                }
				FileOnDisk fileOnDisk = (FileOnDisk) vfa.hostName;
				if (fileOnDisk.getFile().exists()) {
					BytesParser bytesParser = new BytesParser(50);
					try {
						fileOnDisk.write(0, 50, bytesParser.bytes);
					} catch (java.io.IOException ioexception) {
						/* empty */
					}
				}
				try {
					fileOnDisk.close();
				} catch (Exception exception) {
					/* empty */
				}
				return;
			}
			if (command == 5623) {
				if (uo.ssKey != null) {
                    ints3[j++] = 1;
                } else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5624) {
				ints3[j++] = (int) (ak.userFlow >> 32);
				ints3[j++] = (int) (ak.userFlow & 0xffffL);
				return;
			}
		} else if (command < 6100) {
			if (command == 6001) {
				int i = ints3[--j];
				if (i < 1) {
                    i = 1;
                }
				if (i > 4) {
                    i = 4;
                }
				cs.g.db = i;
				ka.rebuildMap((byte) 49);
				cs.g.a(nda.signlink, (byte) 119);
				NPCNode.k = false;
				return;
			}
			if (command == 6002) {
				cs.g.a(ints3[--j] == 1, 1000);
				ka.rebuildMap((byte) 46);
				kl.b(-99);
				cs.g.a(nda.signlink, (byte) 105);
				NPCNode.k = false;
				return;
			}
			if (command == 6003) {
				cs.g.R = ints3[--j] == 1;
				kl.b(-118);
				cs.g.a(nda.signlink, (byte) 121);
				NPCNode.k = false;
				return;
			}
			if (command == 6005) {
				cs.g.ab = ints3[--j] == 1;
				ka.rebuildMap((byte) -114);
				cs.g.a(nda.signlink, (byte) 42);
				NPCNode.k = false;
				return;
			}
			if (command == 6006) {
				cs.g.K = ints3[--j] == 1;
				lg.r.b(!cs.g.K);
				cs.g.a(nda.signlink, (byte) 39);
				NPCNode.k = false;
				return;
			}
			if (command == 6007) {
				cs.g.q = ints3[--j];
				cs.g.a(nda.signlink, (byte) 114);
				NPCNode.k = false;
				return;
			}
			if (command == 6008) {
				cs.g.y = ints3[--j] == 1;
				cs.g.a(nda.signlink, (byte) 75);
				NPCNode.k = false;
				return;
			}
			if (command == 6009) {
				cs.g.isOT = ints3[--j] == 1;
				ka.rebuildMap((byte) -120);
				cs.g.a(nda.signlink, (byte) 112);
				NPCNode.k = false;
				return;
			}
			if (command == 6010) {
				cs.g.t = ints3[--j] == 1;
				cs.g.a(nda.signlink, (byte) 78);
				NPCNode.k = false;
				return;
			}
			if (command == 6011) {
				int shadowCount = ints3[--j];
				if (shadowCount < 0 || shadowCount > 2) {
                    shadowCount = 0;
                }
				cs.g.shadows(shadowCount, 2, on.performance);
				ka.rebuildMap((byte) 59);
				cs.g.a(nda.signlink, (byte) 79);
				NPCNode.k = false;
				return;
			}
			if (command == 6012) {
				cs.g.showLighting((byte) -119, ints3[--j] == 1, on.performance);
				bca.showTextures((byte) 103);
				Class_ad.lighting(-104);
				cs.g.a(nda.signlink, (byte) 90);
				NPCNode.k = false;
				return;
			}
			if (command == 6014) {
				cs.g.L = ints3[--j] == 1;
				ka.rebuildMap((byte) -115);
				cs.g.a(nda.signlink, (byte) 71);
				NPCNode.k = false;
				return;
			}
			if (command == 6015) {
				cs.g.p = ints3[--j] == 1;
				ka.rebuildMap((byte) -109);
				cs.g.a(nda.signlink, (byte) 89);
				NPCNode.k = false;
				return;
			}
			if (command == 6016) {
				int i = ints3[--j];
				if (i < 0 || i > 2) {
                    i = 0;
                }
				cs.g.Z = i;
				ur.setTKVersion(on.performance, true);
				cs.g.a(nda.signlink, (byte) 35);
				return;
			}
			if (command == 6017) {
				cs.g.s = ints3[--j] == 1;
				hm.a(true);
				cs.g.a(nda.signlink, (byte) 116);
				NPCNode.k = false;
				return;
			}
			if (command == 6018) {
				int i = ints3[--j];
				if (i < 0) {
                    i = 0;
                }
				if (i > 127) {
                    i = 127;
                }
				cs.g.I = i;
				cs.g.a(nda.signlink, (byte) 32);
				NPCNode.k = false;
				return;
			}
			if (command == 6019) {
				int i = ints3[--j];
				if (i < 0) {
                    i = 0;
                }
				if (i > 255) {
                    i = 255;
                }
				if (i != cs.g.N) {
					if (cs.g.N == 0 && ws.G != -1) {
						Class_b.a(false, 0, i, mq.pl, (byte) -48, ws.G);
						Class_jc.ib = false;
					} else if (i == 0) {
						ku.a(true);
						Class_jc.ib = false;
					} else {
                        nh.a(i, (byte) -119);
                    }
					cs.g.N = i;
				}
				cs.g.a(nda.signlink, (byte) 38);
				NPCNode.k = false;
				return;
			}
			if (command == 6020) {
				int i = ints3[--j];
				if (i < 0) {
                    i = 0;
                }
				if (i > 127) {
                    i = 127;
                }
				cs.g.Y = i;
				cs.g.a(nda.signlink, (byte) 40);
				NPCNode.k = false;
				return;
			}
			if (command == 6021) {
				cs.g.qb = ints3[--j] == 1;
				kl.b(-120);
				return;
			}
			if (command == 6023) {
				int i = ints3[--j];
				boolean bool1 = false;
				if (i < 0) {
                    i = 0;
                }
				if (i > 2) {
                    i = 2;
                }
				if (qm.heapSize < 96) {
					i = 0;
					bool1 = true;
				}
				pda.d(0, i);
				cs.g.a(nda.signlink, (byte) 115);
				NPCNode.k = false;
				ints3[j++] = bool1 ? 0 : 1;
				return;
			}
			if (command == 6024) {
				int i = ints3[--j];
				if (i < 0 || i > 2) {
                    i = 0;
                }
				cs.g.S = i;
				cs.g.a(nda.signlink, (byte) 43);
				return;
			}
			if (command == 6025) {
				int buildAreaSize = ints3[--j];
				if (buildAreaSize < 0 || buildAreaSize > Class_g.a(-69, qm.heapSize)) {
                    buildAreaSize = 0;
                }
				cs.g.buildAreaSize = buildAreaSize;
				cs.g.a(nda.signlink, (byte) 101);
				NPCNode.k = false;
				return;
			}
			if (command == 6027) {
				int enable = ints3[--j];
				if (enable < 0 || enable > 1) {
                    enable = 0;
                }
				ik.enableBloom(-49, enable == 1);
				return;
			}
			if (command == 6028) {
				cs.g.J = ints3[--j] != 0;
				cs.g.a(nda.signlink, (byte) 98);
				return;
			}
			if (command == 6029) {
				cs.g.q = ints3[--j];
				cs.g.a(nda.signlink, (byte) 62);
				return;
			}
			if (command == 6030) {
				cs.g.isGB = ints3[--j] != 0;
				cs.g.a(nda.signlink, (byte) 45);
				ka.rebuildMap((byte) -122);
				return;
			}
			if (command == 6031) {
				int version = ints3[--j];
				if (version < 0 || version > 5) {
                    version = 2;
                }
				ur.setTKVersion(version, true);
				return;
			}
			if (command == 6032) {
				int tkVersion = ints3[--j];
				if (tkVersion < 0 || tkVersion > 5) {
                    tkVersion = 2;
                }
				cs.g.tkVersion = tkVersion;
				cs.g.a(nda.signlink, (byte) 53);
				NPCNode.k = false;
				return;
			}
			if (command == 6033) {
				int i = ints3[--j];
				if (i < 0 || i > 4) {
                    i = 2;
                }
				cs.g.x = i;
				cs.g.a(nda.signlink, (byte) 45);
				return;
			}
			if (command == 6034) {
				cs.g.isTextures = ints3[--j] == 1;
				cs.g.a(nda.signlink, (byte) 57);
				bca.showTextures((byte) 50);
				NPCNode.k = false;
				return;
			}
			if (command == 6035) {
				cs.g.Hb = ints3[--j] == 1;
				ka.rebuildMap((byte) 12);
				kl.b(-110);
				return;
			}
			if (command == 6036) {
				int i = ints3[--j];
				if (i < 0 || i > 2) {
                    i = 0;
                }
				cs.g.a((byte) 122, i);
				cs.g.a(nda.signlink, (byte) 31);
				return;
			}
			if (command == 6037) {
				int i = ints3[--j];
				if (i < 0) {
                    i = 0;
                }
				if (i > 127) {
                    i = 127;
                }
				cs.g.P = i;
				cs.g.a(nda.signlink, (byte) 44);
				NPCNode.k = false;
				return;
			}
			if (command == 6038) {
				int i = ints3[--j];
				if (i < 0) {
                    i = 0;
                }
				if (i > 255) {
                    i = 255;
                }
				if (i != cs.g.V && ws.G == cga.E) {
					if (cs.g.V == 0) {
						Class_b.a(false, 0, i, mq.pl, (byte) -63, ws.G);
						Class_jc.ib = false;
					} else if (i == 0) {
						ku.a(true);
						Class_jc.ib = false;
					} else {
                        nh.a(i, (byte) -119);
                    }
				}
				cs.g.V = i;
				cs.g.a(nda.signlink, (byte) 120);
				NPCNode.k = false;
				return;
			}
			if (command == 6039) {
				int i = ints3[--j];
				if (i > 255 || i < 0) {
                    i = 0;
                }
				if (i != cs.g.z) {
					cs.g.z = i;
					cs.g.a(nda.signlink, (byte) 79);
					NPCNode.k = false;
				}
				return;
			}
		} else if (command < 6200) {
			if (command == 6101) {
				ints3[j++] = cs.g.db;
				return;
			}
			if (command == 6102) {
				ints3[j++] = cs.g.d(on.performance, -2) ? 1 : 0;
				return;
			}
			if (command == 6103) {
				ints3[j++] = cs.g.R ? 1 : 0;
				return;
			}
			if (command == 6105) {
				ints3[j++] = cs.g.ab ? 1 : 0;
				return;
			}
			if (command == 6106) {
				ints3[j++] = cs.g.K ? 1 : 0;
				return;
			}
			if (command == 6107) {
				ints3[j++] = cs.g.q;
				return;
			}
			if (command == 6108) {
				ints3[j++] = cs.g.y ? 1 : 0;
				return;
			}
			if (command == 6109) {
				ints3[j++] = cs.g.isOT ? 1 : 0;
				return;
			}
			if (command == 6110) {
				ints3[j++] = cs.g.t ? 1 : 0;
				return;
			}
			if (command == 6111) {
				ints3[j++] = cs.g.b(on.performance, -110);
				return;
			}
			if (command == 6112) {
				ints3[j++] = cs.g.isLighting(-126, on.performance) ? 1 : 0;
				return;
			}
			if (command == 6114) {
				ints3[j++] = cs.g.L ? 1 : 0;
				return;
			}
			if (command == 6115) {
				ints3[j++] = cs.g.p ? 1 : 0;
				return;
			}
			if (command == 6116) {
				ints3[j++] = cs.g.Z;
				return;
			}
			if (command == 6117) {
				ints3[j++] = cs.g.s ? 1 : 0;
				return;
			}
			if (command == 6118) {
				ints3[j++] = cs.g.I;
				return;
			}
			if (command == 6119) {
				ints3[j++] = cs.g.N;
				return;
			}
			if (command == 6120) {
				ints3[j++] = cs.g.Y;
				return;
			}
			if (command == 6121) {
				ints3[j++] = lg.r.d() ? 1 : 0;
				return;
			}
			if (command == 6123) {
				ints3[j++] = ql.a(0);
				return;
			}
			if (command == 6124) {
				ints3[j++] = cs.g.S;
				return;
			}
			if (command == 6125) {
				ints3[j++] = cs.g.buildAreaSize;
				return;
			}
			if (command == 6126) {
				ints3[j++] = lg.r.r() ? 1 : 0;
				return;
			}
			if (command == 6127) {
				ints3[j++] = cs.g.cb ? 1 : 0;
				return;
			}
			if (command == 6128) {
				ints3[j++] = cs.g.J ? 1 : 0;
				return;
			}
			if (command == 6129) {
				ints3[j++] = cs.g.q;
				return;
			}
			if (command == 6130) {
				ints3[j++] = cs.g.isGB ? 1 : 0;
				return;
			}
			if (command == 6131) {
				ints3[j++] = on.performance;
				return;
			}
			if (command == 6132) {
				ints3[j++] = cs.g.tkVersion;
				return;
			}
			if (command == 6133) {
				ints3[j++] = nda.signlink.r && !nda.signlink.e ? 1 : 0;
				return;
			}
			if (command == 6134) {
				ints3[j++] = Class_g.a(-77, qm.heapSize);
				return;
			}
			if (command == 6135) {
				ints3[j++] = cs.g.x;
				return;
			}
			if (command == 6136) {
				ints3[j++] = cs.g.isTextures ? 1 : 0;
				return;
			}
			if (command == 6137) {
				boolean bool1 = true;
				try {
					bool1 = jagmisc.getTotalPhysicalMemory() > 268435456L;
				} catch (Throwable throwable) {
					/* empty */
				}
				ints3[j++] = bool1 ? 1 : 0;
				return;
			}
			if (command == 6138) {
				ints3[j++] = ItemDef.getToolkit(on.performance, (byte) -128, 200);
				return;
			}
			if (command == 6139) {
				ints3[j++] = cs.g.a(on.performance, (byte) 121);
				return;
			}
			if (command == 6140) {
				int i = 0;
				if (mg.c(-1, on.performance) && qm.heapSize < 96) {
                    i = 1;
                }
				ints3[j++] = i;
				return;
			}
			if (command == 6141) {
				if (qm.heapSize < 96) {
                    ints3[j++] = 0;
                } else {
					ints3[j++] = 2;
					return;
				}
				return;
			}
			if (command == 6142) {
				ints3[j++] = cs.g.P;
				return;
			}
			if (command == 6143) {
				ints3[j++] = cs.g.V;
				return;
			}
			if (command == 6144) {
				ints3[j++] = no.x ? 1 : 0;
				return;
			}
			if (command == 6145) {
				ints3[j++] = cs.g.z;
				return;
			}
		} else if (command < 6300) {
			if (command == 6200) {
				j -= 2;
				ifa.c = (short) ints3[j];
				if (ifa.c <= 0) {
                    ifa.c = (short) 256;
                }
				Class_kd.m = (short) ints3[j + 1];
				if (Class_kd.m <= 0) {
                    Class_kd.m = (short) 205;
                }
				return;
			}
			if (command == 6201) {
				j -= 2;
				cda.a = (short) ints3[j];
				if (cda.a <= 0) {
                    cda.a = (short) 256;
                }
				gf.f = (short) ints3[j + 1];
				if (gf.f <= 0) {
                    gf.f = (short) 320;
                }
				return;
			}
			if (command == 6202) {
				j -= 4;
				bi.U = (short) ints3[j];
				if (bi.U <= 0) {
                    bi.U = (short) 1;
                }
				GrandExchangeItem.k = (short) ints3[j + 1];
				if (GrandExchangeItem.k <= 0) {
                    GrandExchangeItem.k = (short) 32767;
                } else if (GrandExchangeItem.k < bi.U) {
                    GrandExchangeItem.k = bi.U;
                }
				oe.e = (short) ints3[j + 2];
				if (oe.e <= 0) {
                    oe.e = (short) 1;
                }
				hm.d = (short) ints3[j + 3];
				if (hm.d <= 0) {
                    hm.d = (short) 32767;
                } else {
					if (hm.d < oe.e)
						hm.d = oe.e;
					return;
				}
				return;
			}
			if (command == 6203) {
				lu.a(tj.h.minVScroll, 0, -16777216, 0, tj.h.minHScroll, false);
				ints3[j++] = qea.b;
				ints3[j++] = vq.k;
				return;
			}
			if (command == 6204) {
				ints3[j++] = cda.a;
				ints3[j++] = gf.f;
				return;
			}
			if (command == 6205) {
				ints3[j++] = ifa.c;
				ints3[j++] = Class_kd.m;
				return;
			}
		} else if (command < 6400) {
			if (command == 6300) {
				ints3[j++] = (int) (us.getCurrentTime(115) / 60000L);
				return;
			}
			if (command == 6301) {
				ints3[j++] = (int) (us.getCurrentTime(96) / 86400000L) - 11745;
				return;
			}
			if (command == 6302) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				calendar.clear();
				calendar.set(11, 12);
				calendar.set(k, j, i);
				int time = (int) (calendar.getTime().getTime() / 86400000L) - 11745;
				if (k < 1970) {
                    time--;
                }
				ints3[ClientScriptHandler.j++] = time;
				return;
			}
			if (command == 6303) {
				calendar.clear();
				calendar.setTime(new Date(us.getCurrentTime(113)));
				ints3[j++] = calendar.get(1);
				return;
			}
			if (command == 6304) {
				int i = ints3[--j];
				boolean bool1 = true;
				if (i < 0) {
                    bool1 = (i + 1) % 4 == 0;
                } else if (i < 1582) {
                    bool1 = i % 4 == 0;
                } else if (i % 4 != 0) {
                    bool1 = false;
                } else if (i % 100 != 0) {
                    bool1 = true;
                } else if (i % 400 != 0) {
                    bool1 = false;
                }
				ints3[j++] = bool1 ? 1 : 0;
				return;
			}
		} else if (command < 6500) {
			if (command == 6405) {
				ints3[j++] = Class_jc.i((byte) 124) ? 1 : 0;
				return;
			}
			if (command == 6406) {
				ints3[j++] = Class_ec.a(103) ? 1 : 0;
				return;
			}
		} else if (command < 6600) {
			if (command == 6500) {
				if (hm.h != 7 || hk.loginStage != 0 || Class_eb.q != 0) {
                    ints3[j++] = 1;
                } else {
					if (il.r) {
                        ints3[j++] = 0;
                    } else {
						if (ufa.a > us.getCurrentTime(125) - 1000L) {
                            ints3[j++] = 1;
                        } else {
							il.r = true;
							tba tba = jga.sendGameOutPacket(dm.outgoingPacket52, pca.isaac, (byte) -100);
							tba.loginStream.writeInt(br.o, -100);
							ud.a(tba, (byte) -36);
							ints3[j++] = 0;
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			if (command == 6501) {
				WorldSub worldSub = hea.b(6684);
				if (worldSub != null) {
					ints3[j++] = worldSub.worldID;
					ints3[j++] = worldSub.e;
					strings[offset++] = worldSub.activity;
					sw sw = worldSub.d((byte) 123);
					ints3[j++] = sw.d;
					strings[offset++] = sw.c;
					ints3[j++] = worldSub.a;
					ints3[j++] = worldSub.l;
					strings[offset++] = worldSub.m;
				} else {
					ints3[j++] = -1;
					ints3[j++] = 0;
					strings[offset++] = "";
					ints3[j++] = 0;
					strings[offset++] = "";
					ints3[j++] = 0;
					ints3[j++] = 0;
					strings[offset++] = "";
					return;
				}
				return;
			}
			if (command == 6502) {
				WorldSub worldSub = GameOutPacket.a();
				if (worldSub != null) {
					ints3[j++] = worldSub.worldID;
					ints3[j++] = worldSub.e;
					strings[offset++] = worldSub.activity;
					sw sw = worldSub.d((byte) 126);
					ints3[j++] = sw.d;
					strings[offset++] = sw.c;
					ints3[j++] = worldSub.a;
					ints3[j++] = worldSub.l;
					strings[offset++] = worldSub.m;
				} else {
					ints3[j++] = -1;
					ints3[j++] = 0;
					strings[offset++] = "";
					ints3[j++] = 0;
					strings[offset++] = "";
					ints3[j++] = 0;
					ints3[j++] = 0;
					strings[offset++] = "";
					return;
				}
				return;
			}
			if (command == 6503) {
				int worldId = ints3[--j];
				String string = strings[--offset];
				if (hm.h != 7 || hk.loginStage != 0 || Class_eb.q != 0) {
                    ints3[j++] = 0;
                } else {
					ints3[j++] = ee.switchWorld(worldId, string, 55) ? 1 : 0;
					return;
				}
				return;
			}
			if (command == 6504) {
				cs.g.l = ints3[--j];
				cs.g.a(nda.signlink, (byte) 95);
				return;
			}
			if (command == 6505) {
				ints3[j++] = cs.g.l;
				return;
			}
			if (command == 6506) {
				int i = ints3[--j];
				WorldSub worldSub = Class_kd.a(i, true);
				if (worldSub != null) {
					ints3[j++] = worldSub.e;
					strings[offset++] = worldSub.activity;
					sw sw = worldSub.d((byte) 121);
					ints3[j++] = sw.d;
					strings[offset++] = sw.c;
					ints3[j++] = worldSub.a;
					ints3[j++] = worldSub.l;
					strings[offset++] = worldSub.m;
				} else {
					ints3[j++] = -1;
					strings[offset++] = "";
					ints3[j++] = 0;
					strings[offset++] = "";
					ints3[j++] = 0;
					ints3[j++] = 0;
					strings[offset++] = "";
					return;
				}
				return;
			}
			if (command == 6507) {
				j -= 4;
				int i = ints3[j];
				boolean bool1 = ints3[j + 1] == 1;
				int j = ints3[ClientScriptHandler.j + 2];
				boolean bool2 = ints3[ClientScriptHandler.j + 3] == 1;
				ml.a((byte) -25, i, bool1, j, bool2);
				return;
			}
			if (command == 6508) {
				vca.selectAutoWorld((byte) -29);
				return;
			}
			if (command == 6509) {
				if (hm.h == 7) {
					mga.s = ints3[--j] == 1;
					return;
				}
				return;
			}
			if (command == 6510) {
				ints3[j++] = cd.worldFlags;
				return;
			}
		} else if (command < 6700) {
			if (command == 6600) {
				cs.g.n = ints3[--j] == 1;
				cs.g.a(nda.signlink, (byte) 36);
				return;
			}
			if (command == 6601) {
				ints3[j++] = cs.g.n ? 1 : 0;
				return;
			}
		} else if (command < 6800 && gv.modeWhat == wd.WIP) {
			if (command == 6700) {
				int i = ida.l.a((byte) -26);
				if (Class_vb.u != -1) {
                    i++;
                }
				ints3[j++] = i;
				return;
			}
			if (command == 6701) {
				int i = ints3[--j];
				if (Class_vb.u != -1) {
					if (i == 0) {
						ints3[j++] = Class_vb.u;
						return;
					}
					i--;
				}
				tt tt = (tt) ida.l.b((byte) 124);
				while (i-- > 0) {
                    tt = (tt) ida.l.b(12561);
                }
				ints3[j++] = tt.l;
				return;
			}
			if (command == 6702) {
				int index = ints3[--j];
				if (Node_Sub.o[index] == null) {
                    strings[offset++] = "";
                } else {
					String string = Node_Sub.o[index][0].Hb;
					if (string == null) {
                        strings[offset++] = "";
                    } else {
						strings[offset++] = string.substring(0, string.indexOf(':'));
						return;
					}
					return;
				}
				return;
			}
			if (command == 6703) {
				int index = ints3[--j];
				if (Node_Sub.o[index] == null) {
                    ints3[j++] = 0;
                } else {
					ints3[j++] = Node_Sub.o[index].length;
					return;
				}
				return;
			}
			if (command == 6704) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				if (Node_Sub.o[i] == null) {
                    strings[offset++] = "";
                } else {
					String string = Node_Sub.o[i][j].Hb;
					if (string == null) {
                        strings[offset++] = "";
                    } else {
						strings[offset++] = string;
						return;
					}
					return;
				}
				return;
			}
			if (command == 6705) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				if (Node_Sub.o[i] == null) {
                    ints3[ClientScriptHandler.j++] = 0;
                } else {
					ints3[ClientScriptHandler.j++] = Node_Sub.o[i][j].bc;
					return;
				}
				return;
			}
			if (command == 6706) {
                return;
            }
			if (command == 6707) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 1, "", i << 16 | j);
				return;
			}
			if (command == 6708) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 2, "", i << 16 | j);
				return;
			}
			if (command == 6709) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 3, "", i << 16 | j);
				return;
			}
			if (command == 6710) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 4, "", i << 16 | j);
				return;
			}
			if (command == 6711) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 5, "", i << 16 | j);
				return;
			}
			if (command == 6712) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 6, "", i << 16 | j);
				return;
			}
			if (command == 6713) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 7, "", i << 16 | j);
				return;
			}
			if (command == 6714) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 8, "", i << 16 | j);
				return;
			}
			if (command == 6715) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 9, "", i << 16 | j);
				return;
			}
			if (command == 6716) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				cda.a(k, 18365, 10, "", i << 16 | j);
				return;
			}
			if (command == 6717) {
				j -= 3;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				int k = ints3[ClientScriptHandler.j + 2];
				Interface interface_ = ida.a(i << 16 | j, k, (byte) 47);
				vo.c((byte) 31);
				nm nm = client.c(interface_);
				ega.a(0, interface_, nm.a(-1035661311), nm.q);
				return;
			}
		} else if (command < 6900) {
			if (command == 6800) {
				int i = ints3[--j];
				ww ww = hq.a.a(i, -83);
				if (ww.q == null) {
                    strings[offset++] = "";
                } else {
					strings[offset++] = ww.q;
					return;
				}
				return;
			}
			if (command == 6801) {
				int i = ints3[--j];
				ww ww = hq.a.a(i, 108);
				ints3[j++] = ww.L;
				return;
			}
			if (command == 6802) {
				int i = ints3[--j];
				ww ww = hq.a.a(i, 65);
				ints3[j++] = ww.e;
				return;
			}
			if (command == 6803) {
				int i = ints3[--j];
				ww ww = hq.a.a(i, 16);
				ints3[j++] = ww.C;
				return;
			}
			if (command == 6804) {
				j -= 2;
				int i = ints3[j];
				int j = ints3[ClientScriptHandler.j + 1];
				vu vu = jba.b.a((byte) 6, j);
				if (vu.a(0)) {
                    strings[offset++] = hq.a.a(i, 0).a(124, vu.m, j);
                } else {
					ints3[ClientScriptHandler.j++] = hq.a.a(i, 123).a((byte) 26, j, vu.h);
					return;
				}
				return;
			}
		} else if (command < 7000) {
			if (command == 6900) {
				ints3[j++] = id.b && !tb.a ? 1 : 0;
				return;
			}
			if (command == 6901) {
				ints3[j++] = rea.C;
				return;
			}
			if (command == 6902) {
				ints3[j++] = cga.w;
				return;
			}
			if (command == 6903) {
				ints3[j++] = tu.a;
				return;
			}
			if (command == 6904) {
				ints3[j++] = sd.l;
				return;
			}
			if (command == 6905) {
				String string = "";
				if (sa.t != null) {
					if (sa.t.hostName != null) {
                        string = (String) sa.t.hostName;
                    } else {
                        string = sda.a((byte) 82, sa.t.priority);
                    }
				}
				strings[offset++] = string;
				return;
			}
			if (command == 6906) {
				ints3[j++] = ei.b;
				return;
			}
			if (command == 6907) {
				ints3[j++] = pw.a;
				return;
			}
			if (command == 6908) {
				ints3[j++] = bk.c;
				return;
			}
			if (command == 6909) {
				ints3[j++] = ou.a ? 1 : 0;
				return;
			}
			if (command == 6910) {
				ints3[j++] = GameText.ub;
				return;
			}
			if (command == 6911) {
				ints3[j++] = re.h;
				return;
			}
			if (command == 6912) {
				ints3[j++] = hea.b;
				return;
			}
		} else if (command < 7100) {
			if (command == 7000) {
				int setup = cs.g.autoSetup((byte) 109);
				ints3[j++] = cs.g.jb = on.performance;
				ints3[j++] = setup;
				ka.rebuildMap((byte) -107);
				cs.g.a(nda.signlink, (byte) 77);
				NPCNode.k = false;
				return;
			}
			if (command == 7001) {
				cs.g.c(119);
				ka.rebuildMap((byte) -9);
				cs.g.a(nda.signlink, (byte) 32);
				NPCNode.k = false;
				return;
			}
			if (command == 7002) {
				cs.g.a(-29520);
				ka.rebuildMap((byte) -117);
				cs.g.a(nda.signlink, (byte) 90);
				NPCNode.k = false;
				return;
			}
			if (command == 7003) {
				cs.g.a(false);
				ka.rebuildMap((byte) 77);
				cs.g.a(nda.signlink, (byte) 97);
				NPCNode.k = false;
				return;
			}
			if (command == 7004) {
				cs.g.a(true, (byte) -56);
				ka.rebuildMap((byte) -113);
				cs.g.a(nda.signlink, (byte) 120);
				NPCNode.k = false;
				return;
			}
			if (command == 7005) {
				cs.g.X = 0;
				cs.g.a(nda.signlink, (byte) 33);
				NPCNode.k = false;
				return;
			}
			if (command == 7006) {
				if (cs.g.jb == 2) {
                    cs.g.Db = true;
                } else {
					if (cs.g.jb == 1) {
                        cs.g.xb = true;
                    } else {
						if (cs.g.jb == 3)
							cs.g.nb = true;
						return;
					}
					return;
				}
				return;
			}
			if (command == 7007) {
				ints3[j++] = cs.g.X;
				return;
			}
			if (command == 7008) {
				if (on.performance == 0 && qm.heapSize < 96) {
                    ints3[j++] = 1;
                } else {
					ints3[j++] = 4;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(command));
	}

	private static void c(int i) {
		Interface interface_ = efa.a(-1018745488, i);
		if (interface_ != null) {
			int j = i >>> 16;
			Interface[] interfaces = mv.b[j];
			if (interfaces == null) {
				Interface[] interfaces1 = Node_Sub.o[j];
				int length = interfaces1.length;
				interfaces = mv.b[j] = new Interface[length];
				co.a(interfaces1, 0, interfaces, 0, interfaces1.length);
			}
			int index;
			for (index = 0; index < interfaces.length; index++) {
				if (interfaces[index] == interface_) {
                    break;
                }
			}
			if (index < interfaces.length) {
				co.a(interfaces, index + 1, interfaces, index, interfaces.length - index - 1);
				interfaces[interfaces.length - 1] = interface_;
			}
		}
	}

	private static void activateClientScriptCommand(it it, int i) {
		j = 0;
		offset = 0;
		int j = -1;
		int[] buf = it.C;
		int[] buf1 = it.w;
		int command = -1;
		b = 0;
		try {
			int k = 0;
			for (;;) {
				if (++k > i) {
                    throw new RuntimeException("slow");
                }
				command = buf[++j];
				if (command < 100) {
					if (command == 0) {
                        ints3[ClientScriptHandler.j++] = buf1[j];
                    } else if (command == 1) {
						int i1 = buf1[j];
						ints3[ClientScriptHandler.j++] = cp.e.k[i1];
					} else if (command == 2) {
						int i1 = buf1[j];
						cp.e.a(true, ints3[--ClientScriptHandler.j], i1);
					} else if (command == 3) {
                        strings[offset++] = it.G[j];
                    } else if (command == 6) {
                        j += buf1[j];
                    } else if (command == 7) {
						ClientScriptHandler.j -= 2;
						if (ints3[ClientScriptHandler.j] != ints3[ClientScriptHandler.j + 1]) {
                            j += buf1[j];
                        }
					} else if (command == 8) {
						ClientScriptHandler.j -= 2;
						if (ints3[ClientScriptHandler.j] == ints3[ClientScriptHandler.j + 1]) {
                            j += buf1[j];
                        }
					} else if (command == 9) {
						ClientScriptHandler.j -= 2;
						if (ints3[ClientScriptHandler.j] < ints3[ClientScriptHandler.j + 1]) {
                            j += buf1[j];
                        }
					} else if (command == 10) {
						ClientScriptHandler.j -= 2;
						if (ints3[ClientScriptHandler.j] > ints3[ClientScriptHandler.j + 1]) {
                            j += buf1[j];
                        }
					} else if (command == 21) {
						if (b == 0) {
                            return;
                        }
						qf qf = qfs[--b];
						it = qf.b;
						buf = it.C;
						buf1 = it.w;
						j = qf.c;
						ints2 = qf.f;
						strings1 = qf.d;
					} else if (command == 25) {
						int varpBit = buf1[j];
						ints3[ClientScriptHandler.j++] = cp.e.getClientVarpBit(121, varpBit);
					} else if (command == 27) {
						int i1 = buf1[j];
						cp.e.c(i1, ints3[--ClientScriptHandler.j], 16383);
					} else if (command == 31) {
						ClientScriptHandler.j -= 2;
						if (ints3[ClientScriptHandler.j] <= ints3[ClientScriptHandler.j + 1]) {
                            j += buf1[j];
                        }
					} else if (command == 32) {
						ClientScriptHandler.j -= 2;
						if (ints3[ClientScriptHandler.j] >= ints3[ClientScriptHandler.j + 1]) {
                            j += buf1[j];
                        }
					} else if (command == 33) {
                        ints3[ClientScriptHandler.j++] = ints2[buf1[j]];
                    } else if (command == 34) {
                        ints2[buf1[j]] = ints3[--ClientScriptHandler.j];
                    } else if (command == 35) {
                        strings[offset++] = strings1[buf1[j]];
                    } else if (command == 36) {
                        strings1[buf1[j]] = strings[--offset];
                    } else if (command == 37) {
						int i1 = buf1[j];
						offset -= i1;
						String string = GameOutPacket.dataToString(strings, i1, offset);
						strings[offset++] = string;
					} else if (command == 38) {
                        ClientScriptHandler.j--;
                    } else if (command == 39) {
                        offset--;
                    } else if (command == 40) {
						int i1 = buf1[j];
						it it1 = jo.b(i1, true);
						if (it1 == null) {
                            throw new RuntimeException();
                        }
						int[] buf2 = new int[it1.A];
						String[] strings = new String[it1.B];
						for (int index = 0; index < it1.y; index++) {
                            buf2[index] = ints3[ClientScriptHandler.j - it1.y + index];
                        }
						for (int index = 0; index < it1.t; index++) {
                            strings[index] = ClientScriptHandler.strings[offset - it1.t + index];
                        }
						ClientScriptHandler.j -= it1.y;
						offset -= it1.t;
						qf var_qf = new qf();
						var_qf.b = it;
						var_qf.c = j;
						var_qf.f = ints2;
						var_qf.d = strings1;
						if (b >= qfs.length) {
                            throw new RuntimeException();
                        }
						qfs[b++] = var_qf;
						it = it1;
						buf = it.C;
						buf1 = it.w;
						j = -1;
						ints2 = buf2;
						strings1 = strings;
					} else if (command == 42) {
                        ints3[ClientScriptHandler.j++] = rr.h[buf1[j]];
                    } else if (command == 43) {
						int index = buf1[j];
						rr.h[index] = ints3[--ClientScriptHandler.j];
						ida.a((byte) 93, index);
						dv.d |= jm.i[index];
					} else if (command == 44) {
						int i1 = buf1[j] >> 16;
						int j1 = buf1[j] & 0xffff;
						int k1 = ints3[--ClientScriptHandler.j];
						if (k1 < 0 || k1 > 5000) {
                            throw new RuntimeException();
                        }
						ints1[i1] = k1;
						int i2 = -1;
						if (j1 == 105) {
                            i2 = 0;
                        }
						for (int j2 = 0; j2 < k1; j2++) {
                            ints[i1][j2] = i2;
                        }
					} else if (command == 45) {
						int i1 = buf1[j];
						int j1 = ints3[--ClientScriptHandler.j];
						if (j1 < 0 || j1 >= ints1[i1]) {
                            throw new RuntimeException();
                        }
						ints3[ClientScriptHandler.j++] = ints[i1][j1];
					} else if (command == 46) {
						int i1 = buf1[j];
						ClientScriptHandler.j -= 2;
						int j1 = ints3[ClientScriptHandler.j];
						if (j1 < 0 || j1 >= ints1[i1]) {
                            throw new RuntimeException();
                        }
						ints[i1][j1] = ints3[ClientScriptHandler.j + 1];
					} else if (command == 47) {
						String string = client.strings[buf1[j]];
						if (string == null) {
                            string = "null";
                        }
						strings[offset++] = string;
					} else if (command == 48) {
						int index = buf1[j];
						client.strings[index] = strings[--offset];
						sba.a(index, (byte) -126);
					} else if (command == 51) {
						il il = it.z[buf1[j]];
						GameInPacketHandler inPacketHandler = (GameInPacketHandler) il.a(-32748, (long) ints3[--ClientScriptHandler.j]);
						if (inPacketHandler != null) {
                            j += inPacketHandler.k;
                        }
					}
				} else {
					boolean bool;
					if (buf1[j] == 1) {
                        bool = true;
                    } else {
                        bool = false;
                    }
					if (command >= 100 && command < 5000) {
                        activateLowClientScriptCommand(command, bool);
                    } else {
						if (command < 5000 || command >= 10000) {
                            break;
                        }
						activateHighClientScriptCommand(command);
					}
				}
			}
			throw new IllegalStateException("Command: " + command);
		} catch (Exception exception) {
			if (it.I != null) {
				cba.a(4, false, "Clientscript error in: " + it.I);
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("Clientscript error in: ").append(it.I).append("\n");
				for (int index = b - 1; index >= 0; index--) {
                    stringbuffer.append("via: ").append(qfs[index].b.I).append("\n");
                }
				stringbuffer.append("Op: ").append(command).append("\n");
				String string = exception.getMessage();
				if (string != null && string.length() > 0) {
                    stringbuffer.append("Message: ").append(string).append("\n");
                }
				cea.a(stringbuffer.toString(), -2, exception);
				ia.sendConsoleCommandText(4, stringbuffer.toString());
			} else {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2: ").append(it.nodeID).append(" ");
				for (int index = b - 1; index >= 0; index--) {
                    stringbuffer.append("v: ").append(qfs[index].b.nodeID).append(" ");
                }
				stringbuffer.append("op: ").append(command);
				cea.a(stringbuffer.toString(), -2, exception);
			}
		}
	}

	private static String d(int i) {
		long date = ((long) i + 11745L) * 86400000L;
		calendar.setTime(new Date(date));
		int j = calendar.get(5);
		int month = calendar.get(2);
		int k = calendar.get(1);
		return String.valueOf(j) + "-" + monthNamesShort[month] + "-" + k;
	}

	private static void activateLowClientScriptCommand(int i, boolean bool) {
		if (i < 300) {
			if (i == 100) {
				j -= 3;
				int i_264_ = ints3[j];
				int i_265_ = ints3[j + 1];
				int i_266_ = ints3[j + 2];
				if (i_265_ == 0)
					throw new RuntimeException();
				Interface var_kp = efa.a(-1018745488, i_264_);
				if (var_kp.children == null)
					var_kp.children = new Interface[i_266_ + 1];
				if (var_kp.children.length <= i_266_) {
					Interface[] var_kps = new Interface[i_266_ + 1];
					for (int i_267_ = 0; i_267_ < var_kp.children.length; i_267_++)
						var_kps[i_267_] = var_kp.children[i_267_];
					var_kp.children = var_kps;
				}
				if (i_266_ > 0
						&& var_kp.children[i_266_ - 1] == null)
					throw new RuntimeException("Gap at:" + (i_266_ - 1));
				Interface var_kp_268_ = new Interface();
				var_kp_268_.type = i_265_;
				var_kp_268_.parentID = var_kp_268_.interfaceID = var_kp.interfaceID;
				var_kp_268_.itemIndex = i_266_;
				var_kp.children[i_266_] = var_kp_268_;
				if (bool)
					interface_ = var_kp_268_;
				else
					interface_1 = var_kp_268_;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 101) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (var_kp.itemIndex == -1) {
					if (bool)
						throw new RuntimeException(
								"Tried to .cc_delete static .active-component!");
					throw new RuntimeException(
							"Tried to cc_delete static active-component!");
				}
				Interface var_kp_269_ = efa.a(-1018745488,
						var_kp.interfaceID);
				var_kp_269_.children[var_kp.itemIndex] = null;
				tn.a(var_kp_269_, 1023);
				return;
			}
			if (i == 102) {
				Interface var_kp = efa.a(-1018745488, ints3[--j]);
				var_kp.children = null;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 200) {
				j -= 2;
				int i_270_ = ints3[j];
				int i_271_ = ints3[j + 1];
				Interface var_kp = ida.a(i_270_, i_271_, (byte) 78);
				if (var_kp != null && i_271_ != -1) {
					ints3[j++] = 1;
					if (bool)
						interface_ = var_kp;
					else
						interface_1 = var_kp;
				} else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (i == 201) {
				int i_272_ = ints3[--j];
				Interface var_kp = efa.a(-1018745488, i_272_);
				if (var_kp != null) {
					ints3[j++] = 1;
					if (bool)
						interface_ = var_kp;
					else
						interface_1 = var_kp;
				} else {
					ints3[j++] = 0;
					return;
				}
				return;
			}
			if (i == 202) {
				int i_273_ = ints3[--j];
				c(i_273_);
				return;
			}
			if (i == 203) {
				int i_274_ = ints3[--j];
				b(i_274_);
				return;
			}
		} else if (i < 500) {
			if (i == 403) {
				j -= 2;
				int i_275_ = ints3[j];
				int i_276_ = ints3[j + 1];
				for (int i_277_ = 0; i_277_ < dg.ob.length; i_277_++) {
					if (dg.ob[i_277_] == i_275_) {
						up.thisPlayer.playerDef.a(i_277_, i_276_,
								Class_ae.n, -108);
						return;
					}
				}
				for (int i_278_ = 0; i_278_ < tda.j.length; i_278_++) {
					if (tda.j[i_278_] == i_275_) {
						up.thisPlayer.playerDef.a(i_278_, i_276_,
								Class_ae.n, -44);
						break;
					}
				}
				return;
			}
			if (i == 404) {
				j -= 2;
				int i_279_ = ints3[j];
				int i_280_ = ints3[j + 1];
				up.thisPlayer.playerDef.a(i_280_, i_279_, 31622);
				return;
			}
			if (i == 410) {
				boolean bool_281_ = ints3[--j] != 0;
				up.thisPlayer.playerDef.a(bool_281_, -23851);
				return;
			}
			if (i == 411) {
				j -= 2;
				int i_282_ = ints3[j];
				int i_283_ = ints3[j + 1];
				up.thisPlayer.playerDef.a(i_283_, i_282_,
						laa.itemDefLoader, true);
				return;
			}
		} else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
			Interface var_kp;
			if (i >= 2000) {
				i -= 1000;
				var_kp = efa.a(-1018745488, ints3[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			if (i == 1000) {
				j -= 4;
				var_kp.hc = ints3[j];
				var_kp.Wc = ints3[j + 1];
				int i_284_ = ints3[j + 2];
				if (i_284_ < 0)
					i_284_ = 0;
				else if (i_284_ > 5)
					i_284_ = 5;
				int i_285_ = ints3[j + 3];
				if (i_285_ < 0)
					i_285_ = 0;
				else if (i_285_ > 5)
					i_285_ = 5;
				var_kp.hd = (byte) i_284_;
				var_kp.ab = (byte) i_285_;
				tn.a(var_kp, 1023);
				qd.a((byte) -125, var_kp);
				if (var_kp.itemIndex == -1)
					uq.b(var_kp.interfaceID, 11);
				return;
			}
			if (i == 1001) {
				j -= 4;
				var_kp.width = ints3[j];
				var_kp.height = ints3[j + 1];
				var_kp.n = 0;
				var_kp.dc = 0;
				int i_286_ = ints3[j + 2];
				if (i_286_ < 0)
					i_286_ = 0;
				else if (i_286_ > 4)
					i_286_ = 4;
				int i_287_ = ints3[j + 3];
				if (i_287_ < 0)
					i_287_ = 0;
				else if (i_287_ > 4)
					i_287_ = 4;
				var_kp.f = (byte) i_286_;
				var_kp.o = (byte) i_287_;
				tn.a(var_kp, 1023);
				qd.a((byte) -125, var_kp);
				if (var_kp.type == 0)
					Class_kf.a(var_kp, false, false);
				return;
			}
			if (i == 1003) {
				boolean bool_288_ = ints3[--j] == 1;
				if (var_kp.hidden != bool_288_) {
					var_kp.hidden = bool_288_;
					tn.a(var_kp, 1023);
				}
				if (var_kp.itemIndex == -1)
					Class_pb.a(var_kp.interfaceID, (byte) 75);
				return;
			}
			if (i == 1004) {
				j -= 2;
				var_kp.Rb = ints3[j];
				var_kp.Uc = ints3[j + 1];
				tn.a(var_kp, 1023);
				qd.a((byte) -121, var_kp);
				if (var_kp.type == 0)
					Class_kf.a(var_kp, false, false);
				return;
			}
			if (i == 1005) {
				var_kp.vc = ints3[--j] == 1;
				return;
			}
		} else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
			Interface var_kp;
			if (i >= 2000) {
				i -= 1000;
				var_kp = efa.a(-1018745488, ints3[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			if (i == 1100) {
				j -= 2;
				var_kp.hScroll = ints3[j];
				if (var_kp.hScroll > var_kp.maxHScroll
						- var_kp.minHScroll)
					var_kp.hScroll = var_kp.maxHScroll
							- var_kp.minHScroll;
				if (var_kp.hScroll < 0)
					var_kp.hScroll = 0;
				var_kp.vScroll = ints3[j + 1];
				if (var_kp.vScroll > var_kp.maxVScroll
						- var_kp.minVScroll)
					var_kp.vScroll = var_kp.maxVScroll
							- var_kp.minVScroll;
				if (var_kp.vScroll < 0)
					var_kp.vScroll = 0;
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					ItemDef.b(var_kp.interfaceID, -10095);
				return;
			}
			if (i == 1101) {
				var_kp.textColor = ints3[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					kba.a((byte) -43, var_kp.interfaceID);
				return;
			}
			if (i == 1102) {
				var_kp.c = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1103) {
				var_kp.mb = ints3[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1104) {
				var_kp.X = ints3[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1105) {
				int i_289_ = ints3[--j];
				if (var_kp.textureID != i_289_) {
					var_kp.textureID = i_289_;
					tn.a(var_kp, 1023);
				}
				if (var_kp.itemIndex == -1)
					ji.a(var_kp.interfaceID, true);
				return;
			}
			if (i == 1106) {
				var_kp.db = ints3[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1107) {
				var_kp.jd = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1108) {
				var_kp.modelType = 1;
				var_kp.modelID = ints3[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1109) {
				j -= 6;
				var_kp.Ec = ints3[j];
				var_kp.wc = ints3[j + 1];
				var_kp.modelRotationX = ints3[j + 2];
				var_kp.modelRotationY = ints3[j + 3];
				var_kp.modelRotationZ = ints3[j + 4];
				var_kp.modelZoom = ints3[j + 5];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1) {
					bq.a(var_kp.interfaceID, -23477);
					oga.a(var_kp.interfaceID, 112);
				}
				return;
			}
			if (i == 1110) {
				int i_290_ = ints3[--j];
				if (var_kp.V != i_290_) {
					var_kp.V = i_290_;
					var_kp.s = 0;
					var_kp.rc = 1;
					var_kp.R = 0;
					dr var_dr = (var_kp.V == -1 ? null
							: Class_ef.J.c(64, var_kp.V));
					if (var_dr != null)
						cea.a(var_dr, (byte) 84, var_kp.s);
					tn.a(var_kp, 1023);
				}
				if (var_kp.itemIndex == -1)
					ItemDefLoader.a(var_kp.interfaceID, 0);
				return;
			}
			if (i == 1111) {
				var_kp.w = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1112) {
				String string = strings[--offset];
				if (!string.equals(var_kp.text)) {
					var_kp.text = string;
					tn.a(var_kp, 1023);
				}
				if (var_kp.itemIndex == -1)
					pga.a(var_kp.interfaceID, true);
				return;
			}
			if (i == 1113) {
				var_kp.Ab = ints3[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					baa.a((byte) 74, var_kp.interfaceID);
				return;
			}
			if (i == 1114) {
				j -= 3;
				var_kp.Fb = ints3[j];
				var_kp.Z = ints3[j + 1];
				var_kp.Db = ints3[j + 2];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1115) {
				var_kp.isInventoryInterface = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1116) {
				var_kp.borderThickness = ints3[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1117) {
				var_kp.shadowColor = ints3[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1118) {
				var_kp.flippedVertically = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1119) {
				var_kp.flippedHorizontally = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1120) {
				j -= 2;
				var_kp.maxHScroll = ints3[j];
				var_kp.maxVScroll = ints3[j + 1];
				tn.a(var_kp, 1023);
				if (var_kp.type == 0)
					Class_kf.a(var_kp, false, false);
				return;
			}
			if (i == 1122) {
				var_kp.xb = ints3[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1123) {
				var_kp.modelZoom = ints3[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					bq.a(var_kp.interfaceID, -23477);
				return;
			}
			if (i == 1124) {
				int i_291_ = ints3[--j];
				var_kp.oc = i_291_ == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1125) {
				j -= 2;
				var_kp.vb = ints3[j];
				var_kp.H = ints3[j + 1];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1126) {
				var_kp.r = ints3[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1127) {
				j -= 2;
				int i_292_ = ints3[j];
				int i_293_ = ints3[j + 1];
				vu var_vu = jba.b.a((byte) 6, i_292_);
				if (i_293_ != var_vu.h)
					var_kp.a((byte) 96, i_293_, i_292_);
				else {
					var_kp.a(i_292_, (byte) -106);
					return;
				}
				return;
			}
			if (i == 1128) {
				int i_294_ = ints3[--j];
				String string = strings[--offset];
				vu var_vu = jba.b.a((byte) 6, i_294_);
				if (!var_vu.m.equals(string))
					var_kp.b(i_294_, string, 100);
				else {
					var_kp.a(i_294_, (byte) -106);
					return;
				}
				return;
			}
		} else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
			Interface var_kp;
			if (i >= 2000) {
				i -= 1000;
				var_kp = efa.a(-1018745488, ints3[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			tn.a(var_kp, 1023);
			if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212
					|| i == 1213) {
				j -= 2;
				int i_295_ = ints3[j];
				int i_296_ = ints3[j + 1];
				if (var_kp.itemIndex == -1) {
					fw.b(var_kp.interfaceID, true);
					bq.a(var_kp.interfaceID, -23477);
					oga.a(var_kp.interfaceID, 105);
				}
				if (i_295_ == -1) {
					var_kp.modelType = 1;
					var_kp.modelID = -1;
					var_kp.itemID = -1;
				} else {
					var_kp.itemID = i_295_;
					var_kp.itemStackSize = i_296_;
					if (i == 1208 || i == 1209)
						var_kp.ib = true;
					else
						var_kp.ib = false;
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_295_);
					var_kp.modelRotationX = var_uv.z;
					var_kp.modelRotationY = var_uv.Bb;
					var_kp.modelRotationZ = var_uv.nb;
					var_kp.Ec = var_uv.S;
					var_kp.wc = var_uv.Ab;
					var_kp.modelZoom = var_uv.pb;
					if (i == 1205 || i == 1209)
						var_kp.Rc = 0;
					else if (i == 1212 || i == 1213)
						var_kp.Rc = 1;
					else
						var_kp.Rc = 2;
					if (var_kp.n > 0)
						var_kp.modelZoom = var_kp.modelZoom
								* 32 / var_kp.n;
					else {
						if (var_kp.width > 0)
							var_kp.modelZoom = var_kp.modelZoom
									* 32 / var_kp.width;
						return;
					}
					return;
				}
				return;
			}
			if (i == 1201) {
				var_kp.modelType = 2;
				var_kp.modelID = ints3[--j];
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1202) {
				var_kp.modelType = 3;
				var_kp.modelID = -1;
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1203) {
				var_kp.modelType = 6;
				var_kp.modelID = ints3[--j];
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1204) {
				var_kp.modelType = 5;
				var_kp.modelID = ints3[--j];
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1206) {
				j -= 4;
				var_kp.yc = ints3[j];
				var_kp.y = ints3[j + 1];
				var_kp.D = ints3[j + 2];
				var_kp.Tc = ints3[j + 3];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1207) {
				j -= 2;
				var_kp.gc = ints3[j];
				var_kp.Zb = ints3[j + 1];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1210) {
				j -= 4;
				var_kp.modelID = ints3[j];
				var_kp.U = ints3[j + 1];
				if (ints3[j + 2] == 1)
					var_kp.modelType = 9;
				else
					var_kp.modelType = 8;
				if (ints3[j + 3] == 1)
					var_kp.ib = true;
				else
					var_kp.ib = false;
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1211) {
				var_kp.modelType = 5;
				var_kp.modelID = ih.n;
				var_kp.U = 0;
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
		} else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
			Interface var_kp;
			if (i >= 2000) {
				i -= 1000;
				var_kp = efa.a(-1018745488, ints3[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			if (i == 1300) {
				int i_297_ = ints3[--j] - 1;
				if (i_297_ < 0 || i_297_ > 9)
					offset--;
				else {
					var_kp.a(i_297_, strings[--offset], -114);
					return;
				}
				return;
			}
			if (i == 1301) {
				j -= 2;
				int i_298_ = ints3[j];
				int i_299_ = ints3[j + 1];
				if (i_298_ == -1 && i_299_ == -1)
					var_kp.fd = null;
				else {
					var_kp.fd = ida.a(i_298_, i_299_, (byte) 45);
					return;
				}
				return;
			}
			if (i == 1302) {
				int i_300_ = ints3[--j];
				if (i_300_ == ao.k || i_300_ == qu.b || i_300_ == nk.a) {
					var_kp.od = i_300_;
					return;
				}
				return;
			}
			if (i == 1303) {
				var_kp.x = ints3[--j];
				return;
			}
			if (i == 1304) {
				var_kp.lb = ints3[--j];
				return;
			}
			if (i == 1305) {
				var_kp.itemName = strings[--offset];
				return;
			}
			if (i == 1306) {
				var_kp.G = strings[--offset];
				return;
			}
			if (i == 1307) {
				var_kp.itemActions = null;
				return;
			}
			if (i == 1308) {
				var_kp.cc = ints3[--j];
				var_kp.tb = ints3[--j];
				return;
			}
			if (i == 1309) {
				int i_301_ = ints3[--j];
				int i_302_ = ints3[--j];
				if (i_302_ >= 1 && i_302_ <= 10)
					var_kp.a(0, i_302_ - 1, i_301_);
				return;
			}
			if (i == 1310) {
				var_kp.bd = strings[--offset];
				return;
			}
			if (i == 1311) {
				var_kp.a = ints3[--j];
				return;
			}
			if (i == 1312 || i == 1313) {
				int i_303_;
				int i_304_;
				int i_305_;
				if (i == 1312) {
					j -= 3;
					i_303_ = ints3[j] - 1;
					i_304_ = ints3[j + 1];
					i_305_ = ints3[j + 2];
					if (i_303_ < 0 || i_303_ > 9)
						throw new RuntimeException("IOR13121313");
				} else {
					j -= 2;
					i_303_ = 10;
					i_304_ = ints3[j];
					i_305_ = ints3[j + 1];
				}
				if (var_kp.ub == null) {
					if (i_304_ != 0) {
						var_kp.ub = new byte[11];
						var_kp.Nc = new byte[11];
						var_kp.tc = new int[11];
					} else
						return;
				}
				var_kp.ub[i_303_] = (byte) i_304_;
				if (i_304_ != 0)
					var_kp.Ic = true;
				else {
					var_kp.Ic = false;
					for (int i_306_ = 0; i_306_ < var_kp.ub.length; i_306_++) {
						if (var_kp.ub[i_306_] != 0) {
							var_kp.Ic = true;
							break;
						}
					}
				}
				var_kp.Nc[i_303_] = (byte) i_305_;
				return;
			}
			if (i == 1314) {
				var_kp.Mc = ints3[--j];
				return;
			}
		} else {
			if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
				Interface var_kp;
				if (i >= 2000) {
					i -= 1000;
					var_kp = efa.a(-1018745488, ints3[--j]);
				} else
					var_kp = bool ? interface_ : interface_1;
				if (i == 1499)
					var_kp.reset(0);
				else {
					String string = strings[--offset];
					int[] is = null;
					if (string.length() > 0
							&& string.charAt(string.length() - 1) == 'Y') {
						int i_307_ = ints3[--j];
						if (i_307_ > 0) {
							is = new int[i_307_];
							while (i_307_-- > 0)
								is[i_307_] = ints3[--j];
						}
						string = string.substring(0, string.length() - 1);
					}
					Object[] objects = new Object[string.length() + 1];
					for (int i_308_ = objects.length - 1; i_308_ >= 1; i_308_--) {
						if (string.charAt(i_308_ - 1) == 's')
							objects[i_308_] = strings[--offset];
						else
							objects[i_308_] = new Integer(ints3[--j]);
					}
					int i_309_ = ints3[--j];
					if (i_309_ != -1)
						objects[0] = new Integer(i_309_);
					else
						objects = null;
					if (i == 1400)
						var_kp.Pb = objects;
					else if (i == 1401)
						var_kp.Sb = objects;
					else if (i == 1402)
						var_kp.cb = objects;
					else if (i == 1403)
						var_kp.e = objects;
					else if (i == 1404)
						var_kp.Bb = objects;
					else if (i == 1405)
						var_kp.L = objects;
					else if (i == 1406)
						var_kp.E = objects;
					else if (i == 1407) {
						var_kp.Zc = objects;
						var_kp.q = is;
					} else if (i == 1408)
						var_kp.Q = objects;
					else if (i == 1409)
						var_kp.nd = objects;
					else if (i == 1410)
						var_kp.gd = objects;
					else if (i == 1411)
						var_kp.Pc = objects;
					else if (i == 1412)
						var_kp.wb = objects;
					else if (i == 1414) {
						var_kp.Cc = objects;
						var_kp.P = is;
					} else if (i == 1415) {
						var_kp.ec = objects;
						var_kp.qc = is;
					} else if (i == 1416)
						var_kp.jb = objects;
					else if (i == 1417)
						var_kp.T = objects;
					else if (i == 1418)
						var_kp.I = objects;
					else if (i == 1419)
						var_kp.cd = objects;
					else if (i == 1420)
						var_kp.J = objects;
					else if (i == 1421)
						var_kp.hb = objects;
					else if (i == 1422)
						var_kp.Mb = objects;
					else if (i == 1423)
						var_kp.Gc = objects;
					else if (i == 1424)
						var_kp.Kc = objects;
					else if (i == 1425)
						var_kp.sc = objects;
					else if (i == 1426)
						var_kp.F = objects;
					else if (i == 1427)
						var_kp.rd = objects;
					else if (i == 1428) {
						var_kp.k = objects;
						var_kp.lc = is;
					} else if (i == 1429) {
						var_kp.S = objects;
						var_kp.pb = is;
					} else if (i == 1430)
						var_kp.zb = objects;
					var_kp.Kb = true;
					return;
				}
				return;
			}
			if (i < 1600) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1500) {
					ints3[j++] = var_kp.locX;
					return;
				}
				if (i == 1501) {
					ints3[j++] = var_kp.locY;
					return;
				}
				if (i == 1502) {
					ints3[j++] = var_kp.minHScroll;
					return;
				}
				if (i == 1503) {
					ints3[j++] = var_kp.minVScroll;
					return;
				}
				if (i == 1504) {
					ints3[j++] = var_kp.hidden ? 1 : 0;
					return;
				}
				if (i == 1505) {
					ints3[j++] = var_kp.parentID;
					return;
				}
				if (i == 1506) {
					Interface var_kp_310_ = bca.a((byte) 126, var_kp);
					ints3[j++] = var_kp_310_ == null ? -1
							: var_kp_310_.interfaceID;
					return;
				}
			} else if (i < 1700) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1600) {
					ints3[j++] = var_kp.hScroll;
					return;
				}
				if (i == 1601) {
					ints3[j++] = var_kp.vScroll;
					return;
				}
				if (i == 1602) {
					strings[offset++] = var_kp.text;
					return;
				}
				if (i == 1603) {
					ints3[j++] = var_kp.maxHScroll;
					return;
				}
				if (i == 1604) {
					ints3[j++] = var_kp.maxVScroll;
					return;
				}
				if (i == 1605) {
					ints3[j++] = var_kp.modelZoom;
					return;
				}
				if (i == 1606) {
					ints3[j++] = var_kp.modelRotationX;
					return;
				}
				if (i == 1607) {
					ints3[j++] = var_kp.modelRotationZ;
					return;
				}
				if (i == 1608) {
					ints3[j++] = var_kp.modelRotationY;
					return;
				}
				if (i == 1609) {
					ints3[j++] = var_kp.mb;
					return;
				}
				if (i == 1610) {
					ints3[j++] = var_kp.Ec;
					return;
				}
				if (i == 1611) {
					ints3[j++] = var_kp.wc;
					return;
				}
				if (i == 1612) {
					ints3[j++] = var_kp.textureID;
					return;
				}
				if (i == 1613) {
					int i_311_ = ints3[--j];
					vu var_vu = jba.b.a((byte) 6, i_311_);
					if (var_vu.a(0))
						strings[offset++] = var_kp.a(var_vu.m, i_311_, 4095);
					else {
						ints3[j++] = var_kp.b(121, var_vu.h, i_311_);
						return;
					}
					return;
				}
				if (i == 1614) {
					ints3[j++] = var_kp.db;
					return;
				}
			} else if (i < 1800) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1700) {
					ints3[j++] = var_kp.itemID;
					return;
				}
				if (i == 1701) {
					if (var_kp.itemID != -1)
						ints3[j++] = var_kp.itemStackSize;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 1702) {
					ints3[j++] = var_kp.itemIndex;
					return;
				}
			} else if (i < 1900) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1800) {
					ints3[j++] = client.c(var_kp).a(-1035661311);
					return;
				}
				if (i == 1801) {
					int i_312_ = ints3[--j];
					i_312_--;
					if (var_kp.itemActions == null
							|| i_312_ >= var_kp.itemActions.length
							|| var_kp.itemActions[i_312_] == null)
						strings[offset++] = "";
					else {
						strings[offset++] = var_kp.itemActions[i_312_];
						return;
					}
					return;
				}
				if (i == 1802) {
					if (var_kp.itemName == null)
						strings[offset++] = "";
					else {
						strings[offset++] = var_kp.itemName;
						return;
					}
					return;
				}
			} else if (i < 2000 || i >= 2900 && i < 3000) {
				Interface var_kp;
				if (i >= 2000) {
					var_kp = efa.a(-1018745488, ints3[--j]);
					i -= 1000;
				} else
					var_kp = bool ? interface_ : interface_1;
				if (C >= 10)
					throw new RuntimeException("C29xx-1");
				if (i == 1927) {
					if (var_kp.rd != null) {
						ClientScript var_mea = new ClientScript();
						var_mea.interface_ = var_kp;
						var_mea.objects = var_kp.rd;
						var_mea.u = C + 1;
						to.b.b(var_mea, (byte) 93);
						return;
					}
					return;
				}
			} else if (i < 2600) {
				Interface var_kp = efa.a(-1018745488, ints3[--j]);
				if (i == 2500) {
					ints3[j++] = var_kp.locX;
					return;
				}
				if (i == 2501) {
					ints3[j++] = var_kp.locY;
					return;
				}
				if (i == 2502) {
					ints3[j++] = var_kp.minHScroll;
					return;
				}
				if (i == 2503) {
					ints3[j++] = var_kp.minVScroll;
					return;
				}
				if (i == 2504) {
					ints3[j++] = var_kp.hidden ? 1 : 0;
					return;
				}
				if (i == 2505) {
					ints3[j++] = var_kp.parentID;
					return;
				}
				if (i == 1506) {
					Interface var_kp_313_ = bca.a((byte) 127, var_kp);
					ints3[j++] = var_kp_313_ == null ? -1
							: var_kp_313_.interfaceID;
					return;
				}
			} else if (i < 2700) {
				Interface var_kp = efa.a(-1018745488, ints3[--j]);
				if (i == 2600) {
					ints3[j++] = var_kp.hScroll;
					return;
				}
				if (i == 2601) {
					ints3[j++] = var_kp.vScroll;
					return;
				}
				if (i == 2602) {
					strings[offset++] = var_kp.text;
					return;
				}
				if (i == 2603) {
					ints3[j++] = var_kp.maxHScroll;
					return;
				}
				if (i == 2604) {
					ints3[j++] = var_kp.maxVScroll;
					return;
				}
				if (i == 2605) {
					ints3[j++] = var_kp.modelZoom;
					return;
				}
				if (i == 2606) {
					ints3[j++] = var_kp.modelRotationX;
					return;
				}
				if (i == 2607) {
					ints3[j++] = var_kp.modelRotationZ;
					return;
				}
				if (i == 2608) {
					ints3[j++] = var_kp.modelRotationY;
					return;
				}
				if (i == 2609) {
					ints3[j++] = var_kp.mb;
					return;
				}
				if (i == 2610) {
					ints3[j++] = var_kp.Ec;
					return;
				}
				if (i == 2611) {
					ints3[j++] = var_kp.wc;
					return;
				}
				if (i == 2612) {
					ints3[j++] = var_kp.textureID;
					return;
				}
				if (i == 2613) {
					ints3[j++] = var_kp.db;
					return;
				}
			} else if (i < 2800) {
				if (i == 2700) {
					Interface var_kp = efa.a(-1018745488, ints3[--j]);
					ints3[j++] = var_kp.itemID;
					return;
				}
				if (i == 2701) {
					Interface var_kp = efa.a(-1018745488, ints3[--j]);
					if (var_kp.itemID != -1)
						ints3[j++] = var_kp.itemStackSize;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 2702) {
					int i_314_ = ints3[--j];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_314_);
					if (var_tt != null)
						ints3[j++] = 1;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 2703) {
					Interface var_kp = efa.a(-1018745488, ints3[--j]);
					if (var_kp.children == null)
						ints3[j++] = 0;
					else {
						int i_315_ = var_kp.children.length;
						for (int i_316_ = 0; i_316_ < var_kp.children.length; i_316_++) {
							if (var_kp.children[i_316_] == null) {
								i_315_ = i_316_;
								break;
							}
						}
						ints3[j++] = i_315_;
						return;
					}
					return;
				}
				if (i == 2704 || i == 2705) {
					j -= 2;
					int i_317_ = ints3[j];
					int i_318_ = ints3[j + 1];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_317_);
					if (var_tt != null && var_tt.l == i_318_)
						ints3[j++] = 1;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
			} else if (i < 2900) {
				Interface var_kp = efa.a(-1018745488, ints3[--j]);
				if (i == 2800) {
					ints3[j++] = client.c(var_kp).a(-1035661311);
					return;
				}
				if (i == 2801) {
					int i_319_ = ints3[--j];
					i_319_--;
					if (var_kp.itemActions == null
							|| i_319_ >= var_kp.itemActions.length
							|| var_kp.itemActions[i_319_] == null)
						strings[offset++] = "";
					else {
						strings[offset++] = var_kp.itemActions[i_319_];
						return;
					}
					return;
				}
				if (i == 2802) {
					if (var_kp.itemName == null)
						strings[offset++] = "";
					else {
						strings[offset++] = var_kp.itemName;
						return;
					}
					return;
				}
			} else if (i < 3200) {
				if (i == 3100) {
					String string = strings[--offset];
					mm.a(-93, string);
					return;
				}
				if (i == 3101) {
					j -= 2;
					caa.a(ints3[j + 1], up.thisPlayer, (byte) -123, ints3[j]);
					return;
				}
				if (i == 3103) {
					jt.a(true, -1);
					return;
				}
				if (i == 3104) {
					String string = strings[--offset];
					int i_320_ = 0;
					if (Class_kd.a((byte) 98, string))
						i_320_ = Class_g.a(128, string);
					y++;
					tba var_tba = jga.sendGameOutPacket(bl.H, pca.isaac,
							(byte) -103);
					var_tba.loginStream.writeInt(i_320_, -107);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3105) {
                    System.out.println("[ClientScriptHandler]");
					String string = strings[--offset];
					a++;
					tba var_tba = jga.sendGameOutPacket(cg.w, pca.isaac, (byte) 90);
					var_tba.loginStream.writeByte(string.length() + 1, (byte) -122);
					var_tba.loginStream.writeString(string, -57);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3106) {
                    System.out.println("[ClientScriptHandler] kd");
					String string = strings[--offset];
					s++;
					tba var_tba = jga
							.sendGameOutPacket(qe.c, pca.isaac, (byte) -68);
					var_tba.loginStream.writeByte(string.length() + 1, (byte) -126);
					var_tba.loginStream.writeString(string, -29);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3107) {
					int i_321_ = ints3[--j];
					String string = strings[--offset];
					ge.a(-8, i_321_, string);
					return;
				}
				if (i == 3108) {
					j -= 3;
					int i_322_ = ints3[j];
					int i_323_ = ints3[j + 1];
					int i_324_ = ints3[j + 2];
					Interface var_kp = efa.a(-1018745488, i_324_);
					wf.a(i_322_, (byte) -104, var_kp, i_323_);
					return;
				}
				if (i == 3109) {
					j -= 2;
					int i_325_ = ints3[j];
					int i_326_ = ints3[j + 1];
					Interface var_kp = bool ? interface_ : interface_1;
					wf.a(i_325_, (byte) -119, var_kp, i_326_);
					return;
				}
				if (i == 3110) {
					int i_327_ = ints3[--j];
					g++;
					tba var_tba = jga
							.sendGameOutPacket(td.i, pca.isaac, (byte) -56);
					var_tba.loginStream.writeShort(i_327_, 13469);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3111) {
					j -= 2;
					int i_328_ = ints3[j];
					int i_329_ = ints3[j + 1];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_328_);
					if (var_tt != null)
						vm.a(true, var_tt.l != i_329_, false, var_tt);
					jr.a(true, 3, i_328_, (byte) 126, i_329_);
					return;
				}
				if (i == 3112) {
					j--;
					int i_330_ = ints3[j];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_330_);
					if (var_tt != null && var_tt.k == 3)
						vm.a(true, true, false, var_tt);
					return;
				}
				if (i == 3113) {
					rm.a(strings[--offset], true);
					return;
				}
				if (i == 3114) {
					j -= 2;
					int i_331_ = ints3[j];
					int i_332_ = ints3[j + 1];
					String string = strings[--offset];
					oba.a("", string, i_331_, -1, "", i_332_, "");
					return;
				}
				if (i == 3115) {
					j -= 11;
					ct[] var_cts = dh.b((byte) 87);
					rc[] var_rcs = dg.b(98);
					js.a(ints3[j + 2], ints3[j + 4], var_rcs[ints3[j + 1]], -128,
							var_cts[ints3[j]], ints3[j + 10], ints3[j + 7], ints3[j + 5],
							ints3[j + 8], ints3[j + 3], ints3[j + 9], ints3[j + 6]);
					return;
				}
			} else if (i < 3300) {
				if (i == 3200) {
					j -= 3;
					io.a(255, ints3[j], ints3[j + 1], ints3[j + 2], 29830);
					return;
				}
				if (i == 3201) {
					ao.a(ints3[--j], 255, 50, (byte) -123);
					return;
				}
				if (i == 3202) {
					j -= 2;
					eba.a(6567, 255, ints3[j + 1], ints3[j]);
					return;
				}
				if (i == 3203) {
					j -= 4;
					io.a(ints3[j + 3], ints3[j], ints3[j + 1], ints3[j + 2], 29830);
					return;
				}
				if (i == 3204) {
					j -= 3;
					ao.a(ints3[j], ints3[j + 1], ints3[j + 2], (byte) -123);
					return;
				}
				if (i == 3205) {
					j -= 3;
					eba.a(6567, ints3[j + 2], ints3[j + 1], ints3[j]);
					return;
				}
				if (i == 3206) {
					j -= 4;
					oh.a(ints3[j], ints3[j + 1], ints3[j + 2], false, ints3[j + 3], false);
					return;
				}
				if (i == 3207) {
					j -= 4;
					oh.a(ints3[j], ints3[j + 1], ints3[j + 2], false, ints3[j + 3], true);
					return;
				}
			} else if (i < 3400) {
				if (i == 3300) {
					ints3[j++] = pm.currentTimedTicks;
					return;
				}
				if (i == 3301) {
					j -= 2;
					int i_333_ = ints3[j];
					int i_334_ = ints3[j + 1];
					ints3[j++] = kg.a(i_334_, false, i_333_, true);
					return;
				}
				if (i == 3302) {
					j -= 2;
					int i_335_ = ints3[j];
					int i_336_ = ints3[j + 1];
					ints3[j++] = Login.a(i_335_, i_336_, (byte) -52, false);
					return;
				}
				if (i == 3303) {
					j -= 2;
					int i_337_ = ints3[j];
					int i_338_ = ints3[j + 1];
					ints3[j++] = an.a(0, false, i_337_, i_338_);
					return;
				}
				if (i == 3304) {
					int i_339_ = ints3[--j];
					ints3[j++] = vd.L.a(-88, i_339_).s;
					return;
				}
				if (i == 3305) {
					int i_340_ = ints3[--j];
					ints3[j++] = iu.k[i_340_];
					return;
				}
				if (i == 3306) {
					int i_341_ = ints3[--j];
					ints3[j++] = de.c[i_341_];
					return;
				}
				if (i == 3307) {
					int i_342_ = ints3[--j];
					ints3[j++] = mfa.j[i_342_];
					return;
				}
				if (i == 3308) {
					int i_343_ = up.thisPlayer.height;
					int i_344_ = (up.thisPlayer.locX >> 9)
							+ bfa.thisPlayersRegionX;
					int i_345_ = (up.thisPlayer.locY >> 9)
							+ BytesParser.thisPlayersRegionY;
					ints3[j++] = (i_343_ << 28) + (i_344_ << 14) + i_345_;
					return;
				}
				if (i == 3309) {
					int i_346_ = ints3[--j];
					ints3[j++] = i_346_ >> 14 & 0x3fff;
					return;
				}
				if (i == 3310) {
					int i_347_ = ints3[--j];
					ints3[j++] = i_347_ >> 28;
					return;
				}
				if (i == 3311) {
					int i_348_ = ints3[--j];
					ints3[j++] = i_348_ & 0x3fff;
					return;
				}
				if (i == 3312) {
					ints3[j++] = rba.d ? 1 : 0;
					return;
				}
				if (i == 3313) {
					j -= 2;
					int i_349_ = ints3[j];
					int i_350_ = ints3[j + 1];
					ints3[j++] = kg.a(i_350_, true, i_349_, true);
					return;
				}
				if (i == 3314) {
					j -= 2;
					int i_351_ = ints3[j];
					int i_352_ = ints3[j + 1];
					ints3[j++] = Login.a(i_351_, i_352_, (byte) 124, true);
					return;
				}
				if (i == 3315) {
					j -= 2;
					int i_353_ = ints3[j];
					int i_354_ = ints3[j + 1];
					ints3[j++] = an.a(0, true, i_353_, i_354_);
					return;
				}
				if (i == 3316) {
					if (hv.thisPlayersRights >= 2)
						ints3[j++] = hv.thisPlayersRights;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3317) {
					ints3[j++] = dj.b;
					return;
				}
				if (i == 3318) {
					ints3[j++] = gm.world.worldID;
					return;
				}
				if (i == 3321) {
					ints3[j++] = jm.j;
					return;
				}
				if (i == 3322) {
					ints3[j++] = Class_hb.v;
					return;
				}
				if (i == 3323) {
					if (qaa.gb >= 5 && qaa.gb <= 9)
						ints3[j++] = 1;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3324) {
					if (qaa.gb >= 5 && qaa.gb <= 9)
						ints3[j++] = qaa.gb;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3325) {
					ints3[j++] = Class_gb.h ? 1 : 0;
					return;
				}
				if (i == 3326) {
					ints3[j++] = up.thisPlayer.combatLevel;
					return;
				}
				if (i == 3327) {
					ints3[j++] = up.thisPlayer.playerDef.isMale ? 1
							: 0;
					return;
				}
				if (i == 3329) {
					ints3[j++] = uda.d ? 1 : 0;
					return;
				}
				if (i == 3330) {
					int i_355_ = ints3[--j];
					ints3[j++] = iu.a(1, i_355_, false);
					return;
				}
				if (i == 3331) {
					j -= 2;
					int i_356_ = ints3[j];
					int i_357_ = ints3[j + 1];
					ints3[j++] = ik.a(false, false, i_357_, i_356_, true);
					return;
				}
				if (i == 3332) {
					j -= 2;
					int i_358_ = ints3[j];
					int i_359_ = ints3[j + 1];
					ints3[j++] = ik.a(false, true, i_359_, i_358_, true);
					return;
				}
				if (i == 3333) {
					ints3[j++] = pda.y;
					return;
				}
				if (i == 3335) {
					ints3[j++] = cba.languageID;
					return;
				}
				if (i == 3336) {
					j -= 4;
					int i_360_ = ints3[j];
					int i_361_ = ints3[j + 1];
					int i_362_ = ints3[j + 2];
					int i_363_ = ints3[j + 3];
					i_360_ += i_361_ << 14;
					i_360_ += i_362_ << 28;
					i_360_ += i_363_;
					ints3[j++] = i_360_;
					return;
				}
				if (i == 3337) {
					ints3[j++] = hl.affId;
					return;
				}
				if (i == 3338) {
					ints3[j++] = ur.getProfileCPU(-116);
					return;
				}
				if (i == 3339) {
					ints3[j++] = uq.M ? 1 : 0;
					return;
				}
				if (i == 3340) {
					ints3[j++] = tw.r ? 1 : 0;
					return;
				}
				if (i == 3341) {
					ints3[j++] = Class_rf.fromBilling ? 1 : 0;
					return;
				}
				if (i == 3342) {
					ints3[j++] = Class_md.e.d(2000);
					return;
				}
				if (i == 3343) {
					ints3[j++] = Class_md.e.b(100);
					return;
				}
				if (i == 3344) {
					strings[offset++] = Class_db.a((byte) -95);
					return;
				}
				if (i == 3345) {
					strings[offset++] = up.e(58);
					return;
				}
				if (i == 3346) {
					ints3[j++] = wh.i(4);
					return;
				}
				if (i == 3347) {
					ints3[j++] = jk.m;
					return;
				}
			} else if (i < 3500) {
				if (i == 3400) {
					j -= 2;
					int i_364_ = ints3[j];
					int i_365_ = ints3[j + 1];
					ss var_ss = tv.e.a(i_364_, -8727);
					strings[offset++] = var_ss.d(-24908, i_365_);
					return;
				}
				if (i == 3408) {
					j -= 4;
					int i_366_ = ints3[j];
					int i_367_ = ints3[j + 1];
					int i_368_ = ints3[j + 2];
					int i_369_ = ints3[j + 3];
					ss var_ss = tv.e.a(i_368_, -8727);
					if (var_ss.s != i_366_ || var_ss.b != i_367_)
						throw new RuntimeException("C3408-1");
					if (i_367_ == 115)
						strings[offset++] = var_ss.d(-24908, i_369_);
					else {
						ints3[j++] = var_ss.c(i_369_, 438412161);
						return;
					}
					return;
				}
				if (i == 3409) {
					j -= 3;
					int i_370_ = ints3[j];
					int i_371_ = ints3[j + 1];
					int i_372_ = ints3[j + 2];
					if (i_371_ == -1)
						throw new RuntimeException("C3409-2");
					ss var_ss = tv.e.a(i_371_, -8727);
					if (var_ss.b != i_370_)
						throw new RuntimeException("C3409-1");
					ints3[j++] = var_ss.b(i_372_, -110) ? 1 : 0;
					return;
				}
				if (i == 3410) {
					int i_373_ = ints3[--j];
					String string = strings[--offset];
					if (i_373_ == -1)
						throw new RuntimeException("C3410-2");
					ss var_ss = tv.e.a(i_373_, -8727);
					if (var_ss.b != 's')
						throw new RuntimeException("C3410-1");
					ints3[j++] = var_ss.a(string, 5) ? 1 : 0;
					return;
				}
				if (i == 3411) {
					int i_374_ = ints3[--j];
					ss var_ss = tv.e.a(i_374_, -8727);
					ints3[j++] = var_ss.e.a((byte) -26);
					return;
				}
			} else if (i < 3700) {
				if (i == 3600) {
					if (Class_fd.L == 0)
						ints3[j++] = -2;
					else {
						if (Class_fd.L == 1)
							ints3[j++] = -1;
						else {
							ints3[j++] = rba.l;
							return;
						}
						return;
					}
					return;
				}
				if (i == 3601) {
					int i_375_ = ints3[--j];
					if (Class_fd.L == 2 && i_375_ < rba.l) {
						strings[offset++] = lfa.f[i_375_];
						if (nj.l[i_375_] != null)
							strings[offset++] = nj.l[i_375_];
						else
							strings[offset++] = "";
					} else {
						strings[offset++] = "";
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3602) {
					int i_376_ = ints3[--j];
					if (Class_fd.L == 2 && i_376_ < rba.l)
						ints3[j++] = dt.Jb[i_376_];
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3603) {
					int i_377_ = ints3[--j];
					if (Class_fd.L == 2 && i_377_ < rba.l)
						ints3[j++] = ObjectDef.rb[i_377_];
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3604) {
					String string = strings[--offset];
					int i_378_ = ints3[--j];
					or.a(i_378_, (byte) -9, string);
					return;
				}
				if (i == 3605) {
					String string = strings[--offset];
					rh.a(-108, string);
					return;
				}
				if (i == 3606) {
					String string = strings[--offset];
					hk.a(string, 1);
					return;
				}
				if (i == 3607) {
					String string = strings[--offset];
					Class_nd.a(false, string, -127);
					return;
				}
				if (i == 3608) {
					String string = strings[--offset];
					dk.a(1, string);
					return;
				}
				if (i == 3609) {
					String string = strings[--offset];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					ints3[j++] = wea.a(string, -128) ? 1 : 0;
					return;
				}
				if (i == 3610) {
					int i_379_ = ints3[--j];
					if (Class_fd.L == 2 && i_379_ < rba.l)
						strings[offset++] = di.f[i_379_];
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3611) {
					if (rc.d != null)
						strings[offset++] = rg.a((byte) 98, rc.d);
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3612) {
					if (rc.d != null)
						ints3[j++] = wj.clanChatPlayerCount;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3613) {
					int i_380_ = ints3[--j];
					if (rc.d != null && i_380_ < wj.clanChatPlayerCount)
						strings[offset++] = n.j[i_380_].a;
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3614) {
					int i_381_ = ints3[--j];
					if (rc.d != null && i_381_ < wj.clanChatPlayerCount)
						ints3[j++] = n.j[i_381_].n;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3615) {
					int i_382_ = ints3[--j];
					if (rc.d != null && i_382_ < wj.clanChatPlayerCount)
						ints3[j++] = n.j[i_382_].g;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3616) {
					ints3[j++] = ISAAC.a;
					return;
				}
				if (i == 3617) {
					String string = strings[--offset];
					sea.a((byte) 78, string);
					return;
				}
				if (i == 3618) {
					ints3[j++] = cfa.b;
					return;
				}
				if (i == 3619) {
					String string = strings[--offset];
					iaa.a(string, (byte) -109);
					return;
				}
				if (i == 3620) {
					ItemDef.a((byte) 69);
					return;
				}
				if (i == 3621) {
					if (Class_fd.L == 0)
						ints3[j++] = -1;
					else {
						ints3[j++] = dba.l;
						return;
					}
					return;
				}
				if (i == 3622) {
					int i_383_ = ints3[--j];
					if (Class_fd.L != 0 && i_383_ < dba.l) {
						strings[offset++] = nh.l[i_383_];
						if (mba.a[i_383_] != null)
							strings[offset++] = mba.a[i_383_];
						else
							strings[offset++] = "";
					} else {
						strings[offset++] = "";
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3623) {
					String string = strings[--offset];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					ints3[j++] = qf.a(string, -99) ? 1 : 0;
					return;
				}
				if (i == 3624) {
					int i_384_ = ints3[--j];
					if (n.j != null
							&& i_384_ < wj.clanChatPlayerCount
							&& n.j[i_384_].h
									.equalsIgnoreCase(up.thisPlayer.displayName))
						ints3[j++] = 1;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3625) {
					if (Class_ob.r != null)
						strings[offset++] = Class_ob.r;
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3626) {
					int i_385_ = ints3[--j];
					if (rc.d != null && i_385_ < wj.clanChatPlayerCount)
						strings[offset++] = n.j[i_385_].d;
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3627) {
					int i_386_ = ints3[--j];
					if (Class_fd.L == 2 && i_386_ >= 0 && i_386_ < rba.l)
						ints3[j++] = df.f[i_386_] ? 1 : 0;
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3628) {
					String string = strings[--offset];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					ints3[j++] = us.a(1, string);
					return;
				}
				if (i == 3629) {
					ints3[j++] = ea.thisCountry;
					return;
				}
				if (i == 3630) {
					String string = strings[--offset];
					Class_nd.a(true, string, -123);
					return;
				}
				if (i == 3631) {
					int i_387_ = ints3[--j];
					ints3[j++] = eq.M[i_387_] ? 1 : 0;
					return;
				}
				if (i == 3632) {
					int i_388_ = ints3[--j];
					if (rc.d != null && i_388_ < wj.clanChatPlayerCount)
						strings[offset++] = n.j[i_388_].h;
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 3633) {
					int i_389_ = ints3[--j];
					if (Class_fd.L != 0 && i_389_ < dba.l)
						strings[offset++] = GameOutPacket.d[i_389_];
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
			} else if (i < 4000) {
				if (i == 3903) {
					int i_390_ = ints3[--j];
					ints3[j++] = Interface.grandExchangeItems[i_390_].a(false);
					return;
				}
				if (i == 3904) {
					int i_391_ = ints3[--j];
					ints3[j++] = Interface.grandExchangeItems[i_391_].itemID;
					return;
				}
				if (i == 3905) {
					int i_392_ = ints3[--j];
					ints3[j++] = Interface.grandExchangeItems[i_392_].f;
					return;
				}
				if (i == 3906) {
					int i_393_ = ints3[--j];
					ints3[j++] = Interface.grandExchangeItems[i_393_].total;
					return;
				}
				if (i == 3907) {
					int i_394_ = ints3[--j];
					ints3[j++] = Interface.grandExchangeItems[i_394_].transferred;
					return;
				}
				if (i == 3908) {
					int i_395_ = ints3[--j];
					ints3[j++] = Interface.grandExchangeItems[i_395_].spent;
					return;
				}
				if (i == 3910) {
					int i_396_ = ints3[--j];
					int i_397_ = Interface.grandExchangeItems[i_396_].a(2183);
					ints3[j++] = i_397_ == 0 ? 1 : 0;
					return;
				}
				if (i == 3911) {
					int i_398_ = ints3[--j];
					int i_399_ = Interface.grandExchangeItems[i_398_].a(2183);
					ints3[j++] = i_399_ == 2 ? 1 : 0;
					return;
				}
				if (i == 3912) {
					int i_400_ = ints3[--j];
					int i_401_ = Interface.grandExchangeItems[i_400_].a(2183);
					ints3[j++] = i_401_ == 5 ? 1 : 0;
					return;
				}
				if (i == 3913) {
					int i_402_ = ints3[--j];
					int i_403_ = Interface.grandExchangeItems[i_402_].a(2183);
					ints3[j++] = i_403_ == 1 ? 1 : 0;
					return;
				}
			} else if (i < 4100) {
				if (i == 4000) {
					j -= 2;
					int i_404_ = ints3[j];
					int i_405_ = ints3[j + 1];
					ints3[j++] = i_404_ + i_405_;
					return;
				}
				if (i == 4001) {
					j -= 2;
					int i_406_ = ints3[j];
					int i_407_ = ints3[j + 1];
					ints3[j++] = i_406_ - i_407_;
					return;
				}
				if (i == 4002) {
					j -= 2;
					int i_408_ = ints3[j];
					int i_409_ = ints3[j + 1];
					ints3[j++] = i_408_ * i_409_;
					return;
				}
				if (i == 4003) {
					j -= 2;
					int i_410_ = ints3[j];
					int i_411_ = ints3[j + 1];
					ints3[j++] = i_410_ / i_411_;
					return;
				}
				if (i == 4004) {
					int i_412_ = ints3[--j];
					ints3[j++] = (int) (Math.random() * (double) i_412_);
					return;
				}
				if (i == 4005) {
					int i_413_ = ints3[--j];
					ints3[j++] = (int) (Math.random() * (double) (i_413_ + 1));
					return;
				}
				if (i == 4006) {
					j -= 5;
					int i_414_ = ints3[j];
					int i_415_ = ints3[j + 1];
					int i_416_ = ints3[j + 2];
					int i_417_ = ints3[j + 3];
					int i_418_ = ints3[j + 4];
					ints3[j++] = i_414_
							+ ((i_415_ - i_414_) * (i_418_ - i_416_) / (i_417_ - i_416_));
					return;
				}
				if (i == 4007) {
					j -= 2;
					long l = (long) ints3[j];
					long l_419_ = (long) ints3[j + 1];
					ints3[j++] = (int) (l + l * l_419_ / 100L);
					return;
				}
				if (i == 4008) {
					j -= 2;
					int i_420_ = ints3[j];
					int i_421_ = ints3[j + 1];
					ints3[j++] = i_420_ | 1 << i_421_;
					return;
				}
				if (i == 4009) {
					j -= 2;
					int i_422_ = ints3[j];
					int i_423_ = ints3[j + 1];
					ints3[j++] = i_422_ & -1 - (1 << i_423_);
					return;
				}
				if (i == 4010) {
					j -= 2;
					int i_424_ = ints3[j];
					int i_425_ = ints3[j + 1];
					ints3[j++] = (i_424_ & 1 << i_425_) != 0 ? 1 : 0;
					return;
				}
				if (i == 4011) {
					j -= 2;
					int i_426_ = ints3[j];
					int i_427_ = ints3[j + 1];
					ints3[j++] = i_426_ % i_427_;
					return;
				}
				if (i == 4012) {
					j -= 2;
					int i_428_ = ints3[j];
					int i_429_ = ints3[j + 1];
					if (i_428_ == 0)
						ints3[j++] = 0;
					else {
						ints3[j++] = (int) Math.pow((double) i_428_,
								(double) i_429_);
						return;
					}
					return;
				}
				if (i == 4013) {
					j -= 2;
					int i_430_ = ints3[j];
					int i_431_ = ints3[j + 1];
					if (i_430_ == 0)
						ints3[j++] = 0;
					else {
						if (i_431_ == 0)
							ints3[j++] = 2147483647;
						else {
							ints3[j++] = (int) Math.pow((double) i_430_,
									1.0 / (double) i_431_);
							return;
						}
						return;
					}
					return;
				}
				if (i == 4014) {
					j -= 2;
					int i_432_ = ints3[j];
					int i_433_ = ints3[j + 1];
					ints3[j++] = i_432_ & i_433_;
					return;
				}
				if (i == 4015) {
					j -= 2;
					int i_434_ = ints3[j];
					int i_435_ = ints3[j + 1];
					ints3[j++] = i_434_ | i_435_;
					return;
				}
				if (i == 4016) {
					j -= 2;
					int i_436_ = ints3[j];
					int i_437_ = ints3[j + 1];
					ints3[j++] = i_436_ < i_437_ ? i_436_ : i_437_;
					return;
				}
				if (i == 4017) {
					j -= 2;
					int i_438_ = ints3[j];
					int i_439_ = ints3[j + 1];
					ints3[j++] = i_438_ > i_439_ ? i_438_ : i_439_;
					return;
				}
				if (i == 4018) {
					j -= 3;
					long l = (long) ints3[j];
					long l_440_ = (long) ints3[j + 1];
					long l_441_ = (long) ints3[j + 2];
					ints3[j++] = (int) (l * l_441_ / l_440_);
					return;
				}
			} else if (i < 4200) {
				if (i == 4100) {
					String string = strings[--offset];
					int i_442_ = ints3[--j];
					strings[offset++] = string + i_442_;
					return;
				}
				if (i == 4101) {
					offset -= 2;
					String string = strings[offset];
					String string_443_ = strings[offset + 1];
					strings[offset++] = string + string_443_;
					return;
				}
				if (i == 4102) {
					String string = strings[--offset];
					int i_444_ = ints3[--j];
					strings[offset++] = string + baa.a((byte) 78, true, i_444_);
					return;
				}
				if (i == 4103) {
					String string = strings[--offset];
					strings[offset++] = string.toLowerCase();
					return;
				}
				if (i == 4104) {
					strings[offset++] = d(ints3[--j]);
					return;
				}
				if (i == 4105) {
					offset -= 2;
					String string = strings[offset];
					String string_445_ = strings[offset + 1];
					if (up.thisPlayer.playerDef != null
							&& up.thisPlayer.playerDef.isMale)
						strings[offset++] = string_445_;
					else {
						strings[offset++] = string;
						return;
					}
					return;
				}
				if (i == 4106) {
					int i_446_ = ints3[--j];
					strings[offset++] = Integer.toString(i_446_);
					return;
				}
				if (i == 4107) {
					offset -= 2;
					ints3[j++] = pg.a(cba.languageID, strings[offset + 1], strings[offset], -119);
					return;
				}
				if (i == 4108) {
					String string = strings[--offset];
					j -= 2;
					int i_447_ = ints3[j];
					int i_448_ = ints3[j + 1];
					sa var_sa = qj.a((byte) 11, cs.i, 0, i_448_);
					ints3[j++] = var_sa.a(i_447_, string, sp.s, -123);
					return;
				}
				if (i == 4109) {
					String string = strings[--offset];
					j -= 2;
					int i_449_ = ints3[j];
					int i_450_ = ints3[j + 1];
					sa var_sa = qj.a((byte) 11, cs.i, 0, i_450_);
					ints3[j++] = var_sa.a(string, sp.s, i_449_, 96);
					return;
				}
				if (i == 4110) {
					offset -= 2;
					String string = strings[offset];
					String string_451_ = strings[offset + 1];
					if (ints3[--j] == 1)
						strings[offset++] = string;
					else {
						strings[offset++] = string_451_;
						return;
					}
					return;
				}
				if (i == 4111) {
					String string = strings[--offset];
					strings[offset++] = dea.a(19317, string);
					return;
				}
				if (i == 4112) {
					String string = strings[--offset];
					int i_452_ = ints3[--j];
					if (i_452_ == -1)
						throw new RuntimeException("null char");
					strings[offset++] = string + (char) i_452_;
					return;
				}
				if (i == 4113) {
					int i_453_ = ints3[--j];
					ints3[j++] = ji.a((byte) -53, (char) i_453_) ? 1 : 0;
					return;
				}
				if (i == 4114) {
					int i_454_ = ints3[--j];
					ints3[j++] = nq.a(-115, (char) i_454_) ? 1 : 0;
					return;
				}
				if (i == 4115) {
					int i_455_ = ints3[--j];
					ints3[j++] = iq.a((char) i_455_, true) ? 1 : 0;
					return;
				}
				if (i == 4116) {
					int i_456_ = ints3[--j];
					ints3[j++] = qaa.a((char) i_456_, 20454) ? 1 : 0;
					return;
				}
				if (i == 4117) {
					String string = strings[--offset];
					if (string != null)
						ints3[j++] = string.length();
					else {
						ints3[j++] = 0;
						return;
					}
					return;
				}
				if (i == 4118) {
					String string = strings[--offset];
					j -= 2;
					int i_457_ = ints3[j];
					int i_458_ = ints3[j + 1];
					strings[offset++] = string.substring(i_457_, i_458_);
					return;
				}
				if (i == 4119) {
					String string = strings[--offset];
					StringBuffer stringbuffer = new StringBuffer(
							string.length());
					boolean bool_459_ = false;
					for (int i_460_ = 0; i_460_ < string.length(); i_460_++) {
						char c = string.charAt(i_460_);
						if (c == '<')
							bool_459_ = true;
						else if (c == '>')
							bool_459_ = false;
						else if (!bool_459_)
							stringbuffer.append(c);
					}
					strings[offset++] = stringbuffer.toString();
					return;
				}
				if (i == 4120) {
					String string = strings[--offset];
					j -= 2;
					int i_461_ = ints3[j];
					int i_462_ = ints3[j + 1];
					ints3[j++] = string.indexOf(i_461_, i_462_);
					return;
				}
				if (i == 4121) {
					offset -= 2;
					String string = strings[offset];
					String string_463_ = strings[offset + 1];
					int i_464_ = ints3[--j];
					ints3[j++] = string.indexOf(string_463_, i_464_);
					return;
				}
				if (i == 4122) {
					int i_465_ = ints3[--j];
					ints3[j++] = Character.toLowerCase((char) i_465_);
					return;
				}
				if (i == 4123) {
					int i_466_ = ints3[--j];
					ints3[j++] = Character.toUpperCase((char) i_466_);
					return;
				}
				if (i == 4124) {
					boolean bool_467_ = ints3[--j] != 0;
					int i_468_ = ints3[--j];
					strings[offset++] = bfa.a(cba.languageID, 7110, (long) i_468_,
							bool_467_, 0);
					return;
				}
				if (i == 4125) {
					String string = strings[--offset];
					int i_469_ = ints3[--j];
					sa var_sa = qj.a((byte) 11, cs.i, 0, i_469_);
					ints3[j++] = var_sa.a(sp.s, string, 68);
					return;
				}
			} else if (i < 4300) {
				if (i == 4200) {
					int i_470_ = ints3[--j];
					strings[offset++] = laa.itemDefLoader.d(12388, i_470_).itemName;
					return;
				}
				if (i == 4201) {
					j -= 2;
					int i_471_ = ints3[j];
					int i_472_ = ints3[j + 1];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_471_);
					if (i_472_ >= 1
							&& i_472_ <= 5
							&& var_uv.groundActions[i_472_ - 1] != null)
						strings[offset++] = var_uv.groundActions[i_472_ - 1];
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 4202) {
					j -= 2;
					int i_473_ = ints3[j];
					int i_474_ = ints3[j + 1];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_473_);
					if (i_474_ >= 1 && i_474_ <= 5
							&& var_uv.actions[i_474_ - 1] != null)
						strings[offset++] = var_uv.actions[i_474_ - 1];
					else {
						strings[offset++] = "";
						return;
					}
					return;
				}
				if (i == 4203) {
					int i_475_ = ints3[--j];
					ints3[j++] = laa.itemDefLoader.d(12388, i_475_).value;
					return;
				}
				if (i == 4204) {
					int i_476_ = ints3[--j];
					ints3[j++] = laa.itemDefLoader.d(12388, i_476_).stackable == 1 ? 1
							: 0;
					return;
				}
				if (i == 4205) {
					int i_477_ = ints3[--j];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_477_);
					if (var_uv.o == -1
							&& var_uv.certID >= 0)
						ints3[j++] = var_uv.certID;
					else {
						ints3[j++] = i_477_;
						return;
					}
					return;
				}
				if (i == 4206) {
					int i_478_ = ints3[--j];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_478_);
					if (var_uv.o >= 0
							&& var_uv.certID >= 0)
						ints3[j++] = var_uv.certID;
					else {
						ints3[j++] = i_478_;
						return;
					}
					return;
				}
				if (i == 4207) {
					int i_479_ = ints3[--j];
					ints3[j++] = laa.itemDefLoader.d(12388, i_479_).isMembersItem ? 1
							: 0;
					return;
				}
				if (i == 4208) {
					j -= 2;
					int i_480_ = ints3[j];
					int i_481_ = ints3[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_481_);
					if (var_vu.a(0))
						strings[offset++] = laa.itemDefLoader.d(12388, i_480_).a(
								var_vu.m, i_481_, true);
					else {
						ints3[j++] = laa.itemDefLoader.d(12388, i_480_).a(i_481_,
								var_vu.h, -58);
						return;
					}
					return;
				}
				if (i == 4209) {
					j -= 2;
					int i_482_ = ints3[j];
					int i_483_ = ints3[j + 1] - 1;
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_482_);
					if (var_uv.L == i_483_)
						ints3[j++] = var_uv.vb;
					else {
						if (var_uv.db == i_483_)
							ints3[j++] = var_uv.Z;
						else {
							ints3[j++] = -1;
							return;
						}
						return;
					}
					return;
				}
				if (i == 4210) {
					String string = strings[--offset];
					int i_484_ = ints3[--j];
					cl.a(-1, i_484_ == 1, string);
					ints3[j++] = uh.a;
					return;
				}
				if (i == 4211) {
					if (oga.a == null || Class_u.N >= uh.a)
						ints3[j++] = -1;
					else {
						ints3[j++] = oga.a[Class_u.N++] & 0xffff;
						return;
					}
					return;
				}
				if (i == 4212) {
					Class_u.N = 0;
					return;
				}
				if (i == 4213) {
					int i_485_ = ints3[--j];
					ints3[j++] = laa.itemDefLoader.d(12388, i_485_).ub;
					return;
				}
				if (i == 4214) {
					String string = strings[--offset];
					j -= 3;
					int i_486_ = ints3[j];
					int i_487_ = ints3[j + 1];
					int i_488_ = ints3[j + 2];
					fi.a(i_487_, i_486_ == 1, string, i_488_, 1986811992);
					ints3[j++] = uh.a;
					return;
				}
				if (i == 4215) {
					offset -= 2;
					j -= 2;
					String string = strings[offset];
					int i_489_ = ints3[j];
					int i_490_ = ints3[j + 1];
					String string_491_ = strings[offset + 1];
					cea.a(i_489_ == 1, string_491_, 160, i_490_, string);
					ints3[j++] = uh.a;
					return;
				}
			} else if (i < 4400) {
				if (i == 4300) {
					j -= 2;
					int i_492_ = ints3[j];
					int i_493_ = ints3[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_493_);
					if (var_vu.a(0))
						strings[offset++] = jm.p.getNPCDef(i_492_, (byte) -64).a(
								(byte) 122, var_vu.m, i_493_);
					else {
						ints3[j++] = jm.p.getNPCDef(i_492_, (byte) -104).a(
								var_vu.h, i_493_, false);
						return;
					}
					return;
				}
			} else if (i < 4500) {
				if (i == 4400) {
					j -= 2;
					int i_494_ = ints3[j];
					int i_495_ = ints3[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_495_);
					if (var_vu.a(0))
						strings[offset++] = ul.k.getObjectDef((byte) 42, i_494_).a(i_495_,
								var_vu.m, 30569);
					else {
						ints3[j++] = ul.k.getObjectDef((byte) 73, i_494_).a(i_495_,
								118, var_vu.h);
						return;
					}
					return;
				}
			} else if (i < 4600) {
				if (i == 4500) {
					j -= 2;
					int i_496_ = ints3[j];
					int i_497_ = ints3[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_497_);
					if (var_vu.a(0))
						strings[offset++] = aw.m.a(i_496_, 17796).a(false, i_497_,
								var_vu.m);
					else {
						ints3[j++] = aw.m.a(i_496_, 17796).a(var_vu.h,
								i_497_, -1);
						return;
					}
					return;
				}
			} else if (i < 4700 && i == 4600) {
				int i_498_ = ints3[--j];
				cg var_cg = hs.f.a(i_498_, (byte) 124);
				if (var_cg.F != null && var_cg.F.length > 0) {
					int i_499_ = 0;
					int i_500_ = var_cg.q[0];
					for (int i_501_ = 1; i_501_ < var_cg.F.length; i_501_++) {
						if (var_cg.q[i_501_] > i_500_) {
							i_499_ = i_501_;
							i_500_ = var_cg.q[i_501_];
						}
					}
					ints3[j++] = var_cg.F[i_499_];
				} else {
					ints3[j++] = var_cg.p;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	public static void csProfileClear() {
		/* empty */
	}

	public static void nullLoader() {
		ints2 = null;
		strings1 = null;
		ints1 = null;
		ints = null;
		ints3 = null;
		strings = null;
		qfs = null;
		interface_1 = null;
		interface_ = null;
		oe = null;
		calendar = null;
		monthNamesShort = null;
		ints4 = null;
		tb_ = null;
	}

	public static void csProfileOutput(int i, boolean bool) {
		/* empty */
	}

	private static final void activateClientScript(ClientScript script, int i) {
		Object[] objects = script.objects;
		int i_502_ = ((Integer) objects[0]).intValue();
		it var_it = jo.b(i_502_, true);
		if (var_it != null) {
			ints2 = new int[var_it.A];
			int i_503_ = 0;
			strings1 = new String[var_it.B];
			int i_504_ = 0;
			for (int i_505_ = 1; i_505_ < objects.length; i_505_++) {
				if (objects[i_505_] instanceof Integer) {
					int i_506_ = ((Integer) objects[i_505_]).intValue();
					if (i_506_ == -2147483647)
						i_506_ = script._x;
					if (i_506_ == -2147483646)
						i_506_ = script._y;
					if (i_506_ == -2147483645)
						i_506_ = (script.interface_ != null ? script.interface_.interfaceID
								: -1);
					if (i_506_ == -2147483644)
						i_506_ = script.A;
					if (i_506_ == -2147483643)
						i_506_ = (script.interface_ != null ? ((ClientScript) script).interface_.itemIndex
								: -1);
					if (i_506_ == -2147483642)
						i_506_ = (script.interface_1 != null ? script.interface_1.interfaceID
								: -1);
					if (i_506_ == -2147483641)
						i_506_ = (script.interface_1 != null ? script.interface_1.itemIndex
								: -1);
					if (i_506_ == -2147483640)
						i_506_ = script.x;
					if (i_506_ == -2147483639)
						i_506_ = script.o;
					ints2[i_503_++] = i_506_;
				} else if (objects[i_505_] instanceof String) {
					String string = (String) objects[i_505_];
					if (string.equals("event_opbase"))
						string = script.t;
					strings1[i_504_++] = string;
				}
			}
			C = script.u;
			activateClientScriptCommand(var_it, i);
		}
	}

	static final void a(qfa var_qfa, int i, int i_507_) {
		it var_it = ud.a(var_qfa, i_507_, i, -6162);
		if (var_it != null) {
			ints2 = new int[var_it.A];
			strings1 = new String[var_it.B];
			if (var_it.D == hk.Q || var_it.D == GPIPlayer.a
					|| var_it.D == hba.a) {
				int i_508_ = 0;
				int i_509_ = 0;
				if (nr.b != null) {
					i_508_ = nr.b.locX;
					i_509_ = nr.b.locY;
				}
				ints2[0] = Class_md.e.d(2000) - i_508_;
				ints2[1] = Class_md.e.b(108) - i_509_;
			}
			activateClientScriptCommand(var_it, 200000);
		}
	}

	static {
		b = 0;
		strings = new String[1000];
		ints = new int[5][5000];
		ints1 = new int[5];
		offset = 0;
		ints3 = new int[1000];
		calendar = Calendar.getInstance();
		monthNamesShort = new String[] { "Jan", "Feb", "Mar", "Apr", "May",
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		ints4 = new int[3];
		tb_ = new tb(4);
		C = 0;
	}
}
