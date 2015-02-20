/* uw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

import jagex3.jagmisc.jagmisc;

public final class ClientScriptHandler {
	
	static int a;
	private static int b;
	static int c;
	private static qf[] qfs = new qf[50];
	private static int[][] e;
	static int f;
	static int g;
	private static int h;
	static int i;
	private static int j = 0;
	static int k;
	static int l;
	private static int[] m;
	private static Interface interface_;
	static int o;
	private static Calendar calendar;
	private static String[] q;
	private static int[] r;
	static int s;
	private static oe t;
	static int u;
	private static String[] v;
	private static int[] w;
	private static Interface interface_1;
	static int y;
	static tb tb_;
	private static int[] A;
	private static String[] monthNamesShort;
	private static int C;

	private static void getTextEffect(String effect, int i) {
		if (hv.thisPlayersRights != 0 || (!id.b || tb.a) && !uda.d) {
			String string = effect.toLowerCase();
			int j = 0;
			if (string.startsWith(GameText.yellowTextEffect.getString((byte) 117, 0))) {
				j = 0;
				effect = effect.substring(GameText.yellowTextEffect.getString((byte) 117, 0).length());
			} else if (string.startsWith(GameText.redTextEffect.getString((byte) -42, 0))) {
				j = 1;
				effect = effect.substring(GameText.redTextEffect.getString((byte) -32, 0).length());
			} else if (string.startsWith(GameText.greenTextEffect.getString((byte) -42, 0))) {
				j = 2;
				effect = effect.substring(GameText.greenTextEffect.getString((byte) -57, 0).length());
			} else if (string.startsWith(GameText.cyanTextEffect.getString((byte) -64, 0))) {
				j = 3;
				effect = effect.substring(GameText.cyanTextEffect.getString((byte) 105, 0).length());
			} else if (string.startsWith(GameText.purpleTextEffect.getString((byte) -70, 0))) {
				j = 4;
				effect = effect.substring(GameText.purpleTextEffect.getString((byte) 103, 0).length());
			} else if (string.startsWith(GameText.whiteTextEffect.getString((byte) -95, 0))) {
				j = 5;
				effect = effect.substring(GameText.whiteTextEffect.getString((byte) -94, 0).length());
			} else if (string.startsWith(GameText.flash1TextEffect.getString((byte) -57, 0))) {
				j = 6;
				effect = effect.substring(GameText.flash1TextEffect.getString((byte) -75, 0).length());
			} else if (string.startsWith(GameText.flash2TextEffect.getString((byte) -118, 0))) {
				j = 7;
				effect = effect.substring(GameText.flash2TextEffect.getString((byte) 125, 0).length());
			} else if (string.startsWith(GameText.flash3TextEffect.getString((byte) 112, 0))) {
				j = 8;
				effect = effect.substring(GameText.flash3TextEffect.getString((byte) -63, 0).length());
			} else if (string.startsWith(GameText.glow1TextEffect.getString((byte) 75, 0))) {
				j = 9;
				effect = effect.substring(GameText.glow1TextEffect.getString((byte) -118, 0).length());
			} else if (string.startsWith(GameText.glow2TextEffect.getString((byte) 97, 0))) {
				j = 10;
				effect = effect.substring(GameText.glow2TextEffect.getString((byte) -35, 0).length());
			} else if (string.startsWith(GameText.glow3TextEffect.getString((byte) -33, 0))) {
				j = 11;
				effect = effect.substring(GameText.glow3TextEffect.getString((byte) -47, 0).length());
			} else if (cba.languageID != 0) {
				if (string.startsWith(GameText.yellowTextEffect.getString((byte) 80, cba.languageID))) {
					j = 0;
					effect = effect.substring(GameText.yellowTextEffect.getString((byte) 105, cba.languageID).length());
				} else if (string.startsWith(GameText.redTextEffect.getString((byte) 79, cba.languageID))) {
					j = 1;
					effect = effect.substring(GameText.redTextEffect.getString((byte) -34, cba.languageID).length());
				} else if (string.startsWith(GameText.greenTextEffect.getString((byte) 100, cba.languageID))) {
					j = 2;
					effect = effect.substring(GameText.greenTextEffect.getString((byte) -126, cba.languageID).length());
				} else if (string.startsWith(GameText.cyanTextEffect.getString((byte) -22, cba.languageID))) {
					j = 3;
					effect = effect.substring(GameText.cyanTextEffect.getString((byte) -110, cba.languageID).length());
				} else if (string.startsWith(GameText.purpleTextEffect.getString((byte) 72, cba.languageID))) {
					j = 4;
					effect = effect.substring(GameText.purpleTextEffect.getString((byte) 82, cba.languageID).length());
				} else if (string.startsWith(GameText.whiteTextEffect.getString((byte) 70, cba.languageID))) {
					j = 5;
					effect = effect.substring(GameText.whiteTextEffect.getString((byte) 124, cba.languageID).length());
				} else if (string.startsWith(GameText.flash1TextEffect.getString((byte) 114, cba.languageID))) {
					j = 6;
					effect = effect.substring(GameText.flash1TextEffect.getString((byte) -62, cba.languageID).length());
				} else if (string.startsWith(GameText.flash2TextEffect.getString((byte) -77, cba.languageID))) {
					j = 7;
					effect = effect.substring(GameText.flash2TextEffect.getString((byte) -121, cba.languageID).length());
				} else if (string.startsWith(GameText.flash3TextEffect.getString((byte) 90, cba.languageID))) {
					j = 8;
					effect = effect.substring(GameText.flash3TextEffect.getString((byte) 77, cba.languageID).length());
				} else if (string.startsWith(GameText.glow1TextEffect.getString((byte) -102, cba.languageID))) {
					j = 9;
					effect = effect.substring(GameText.glow1TextEffect.getString((byte) 125, cba.languageID).length());
				} else if (string.startsWith(GameText.glow2TextEffect.getString((byte) 80, cba.languageID))) {
					j = 10;
					effect = effect.substring(GameText.glow2TextEffect.getString((byte) -113, cba.languageID).length());
				} else if (string.startsWith(GameText.glow3TextEffect.getString((byte) 116, cba.languageID))) {
					j = 11;
					effect = effect.substring(GameText.glow3TextEffect.getString((byte) -118, cba.languageID).length());
				}
			}
			string = effect.toLowerCase();
			int k = 0;
			if (string.startsWith(GameText.waveTextEffect.getString((byte) 91, 0))) {
				k = 1;
				effect = effect.substring(GameText.waveTextEffect.getString((byte) -122, 0).length());
			} else if (string.startsWith(GameText.wave2TextEffect.getString((byte) -45, 0))) {
				k = 2;
				effect = effect.substring(GameText.wave2TextEffect.getString((byte) 101, 0).length());
			} else if (string.startsWith(GameText.shakeTextEffect.getString((byte) 119, 0))) {
				k = 3;
				effect = effect.substring(GameText.shakeTextEffect.getString((byte) -31, 0).length());
			} else if (string.startsWith(GameText.scrollTextEffect.getString((byte) 125, 0))) {
				k = 4;
				effect = effect.substring(GameText.scrollTextEffect.getString((byte) -48, 0).length());
			} else if (string.startsWith(GameText.slideTextEffect.getString((byte) -45, 0))) {
				k = 5;
				effect = effect.substring(GameText.slideTextEffect.getString((byte) 110, 0).length());
			} else if (cba.languageID != 0) {
				if (string.startsWith(GameText.waveTextEffect.getString((byte) -123, cba.languageID))) {
					k = 1;
					effect = effect.substring(GameText.waveTextEffect.getString((byte) -64, cba.languageID).length());
				} else if (string.startsWith(GameText.wave2TextEffect.getString((byte) 78, cba.languageID))) {
					k = 2;
					effect = effect.substring(GameText.wave2TextEffect.getString((byte) -127, cba.languageID).length());
				} else if (string.startsWith(GameText.shakeTextEffect.getString((byte) -25, cba.languageID))) {
					k = 3;
					effect = effect.substring(GameText.shakeTextEffect.getString((byte) 97, cba.languageID).length());
				} else if (string.startsWith(GameText.scrollTextEffect.getString((byte) 126, cba.languageID))) {
					k = 4;
					effect = effect.substring(GameText.scrollTextEffect.getString((byte) -41, cba.languageID).length());
				} else if (string.startsWith(GameText.slideTextEffect.getString((byte) 72, cba.languageID))) {
					k = 5;
					effect = effect.substring(GameText.slideTextEffect.getString((byte) -34, cba.languageID).length());
				}
			}
			ClientScriptHandler.i++;
            System.out.println("getTextEffect");
			tba tba = jga.sendGameOutPacket(hn.outgoingPacket32, pca.isaac, (byte) -56);
			tba.loginStream.writeByte(0, (byte) -120);
			int i1 = tba.loginStream.pos;
			tba.loginStream.writeByte(j, (byte) -118);
			tba.loginStream.writeByte(k, (byte) -116);
			kg.a(-1, effect, tba.loginStream);
			tba.loginStream.writeLengthByte(tba.loginStream.pos - i1, 2105852);
			ud.a(tba, (byte) -36);
		}
	}

	public static void a(int i) {
		if (i != -1 && gf.a((byte) 109, i)) {
			Interface[] interfaces = aa.o[i];
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
				Interface[] interfaces1 = aa.o[j];
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

	private static final void activateHighClientScriptCommand(int command) {
		if (command < 5100) {
			if (command == 5000) {
				w[j++] = Class_fd.t;
				return;
			}
			if (command == 5001) {
				j -= 3;
				Class_fd.t = w[j];
				hga.b = saa.b(34067, w[j + 1]);
				if (hga.b == null) {
                    hga.b = ol.j;
                }
				aaa.a = w[j + 2];
				k++;
				tba tba = jga.sendGameOutPacket(GrandExchangeItem.outgoingPacket21, pca.isaac, (byte) -107);
				tba.loginStream.writeByte(Class_fd.t, (byte) -124);
				tba.loginStream.writeByte(hga.b.e, (byte) -119);
				tba.loginStream.writeByte(aaa.a, (byte) -118);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5002) {
				h -= 2;
				String string = q[h];
				String string1 = q[h + 1];
				j -= 2;
				int i = w[j];
				int j = w[ClientScriptHandler.j + 1];
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
				int i = w[--j];
				sc sc = aw.a(i, (byte) -64);
				String string = "";
				if (sc != null && sc.g != null) {
                    string = sc.g;
                }
				q[h++] = string;
				return;
			}
			if (command == 5004) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) -101);
				int j = -1;
				if (sc != null) {
                    j = sc.k;
                }
				w[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5005) {
				if (hga.b == null) {
                    w[j++] = -1;
                } else {
					w[j++] = hga.b.e;
					return;
				}
				return;
			}
			if (command == 5006) {
				int i = w[--j];
				tba tba = jga.sendGameOutPacket(iga.outgoingPacket45, pca.isaac, (byte) -74);
				tba.loginStream.writeByte(i, (byte) -115);
				ud.a(tba, (byte) -36);
				return;
			}
			if (command == 5008) {
				String string = q[--h];
				getTextEffect(string, command);
				return;
			}
			if (command == 5009) {
				h -= 2;
				String string = q[h];
				String string1 = q[h + 1];
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
				int i = w[--j];
				sc sc = aw.a(i, (byte) -45);
				String string = "";
				if (sc != null && sc.j != null) {
                    string = sc.j;
                }
				q[h++] = string;
				return;
			}
			if (command == 5011) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) 117);
				String string = "";
				if (sc != null && sc.d != null) {
                    string = sc.d;
                }
				q[h++] = string;
				return;
			}
			if (command == 5012) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) 101);
				int j = -1;
				if (sc != null) {
                    j = sc.f;
                }
				w[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5015) {
				String username;
				if (up.thisPlayer != null && up.thisPlayer.hd != null) {
                    username = up.thisPlayer.getUserDisplayName((byte) -122, true);
                } else {
                    username = op.username;
                }
				q[h++] = username;
				return;
			}
			if (command == 5016) {
				w[j++] = aaa.a;
				return;
			}
			if (command == 5017) {
				w[j++] = el.a(1818);
				return;
			}
			if (command == 5018) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) -115);
				int j = 0;
				if (sc != null) {
                    j = sc.m;
                }
				w[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5019) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) 113);
				String string = "";
				if (sc != null && sc.c != null) {
                    string = sc.c;
                }
				q[h++] = string;
				return;
			}
			if (command == 5020) {
				String username;
				if (up.thisPlayer != null && up.thisPlayer.hd != null) {
                    username = up.thisPlayer.a(false, (byte) -7);
                } else {
                    username = op.username;
                }
				q[h++] = username;
				return;
			}
			if (command == 5023) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) -98);
				int j = -1;
				if (sc != null) {
                    j = sc.a;
                }
				w[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5024) {
				int i = w[--j];
				sc sc = aw.a(i, (byte) -120);
				int j = -1;
				if (sc != null) {
                    j = sc.l;
                }
				w[ClientScriptHandler.j++] = j;
				return;
			}
			if (command == 5025) {
				int i_29_ = w[--j];
				sc var_sc = aw.a(i_29_, (byte) 121);
				String string = "";
				if (var_sc != null && var_sc.e != null)
					string = var_sc.e;
				q[h++] = string;
				return;
			}
			if (command == 5050) {
				int i_30_ = w[--j];
				q[h++] = mj.l.a(120, i_30_).w;
				return;
			}
			if (command == 5051) {
				int i_31_ = w[--j];
				qt var_qt = mj.l.a(28, i_31_);
				if (var_qt.x == null)
					w[j++] = 0;
				else {
					w[j++] = var_qt.x.length;
					return;
				}
				return;
			}
			if (command == 5052) {
				j -= 2;
				int i_32_ = w[j];
				int i_33_ = w[j + 1];
				qt var_qt = mj.l.a(69, i_32_);
				int i_34_ = var_qt.x[i_33_];
				w[j++] = i_34_;
				return;
			}
			if (command == 5053) {
				int i_35_ = w[--j];
				qt var_qt = mj.l.a(72, i_35_);
				if (var_qt.t == null)
					w[j++] = 0;
				else {
					w[j++] = var_qt.t.length;
					return;
				}
				return;
			}
			if (command == 5054) {
				j -= 2;
				int i_36_ = w[j];
				int i_37_ = w[j + 1];
				w[j++] = mj.l.a(103, i_36_).t[i_37_];
				return;
			}
			if (command == 5055) {
				int i_38_ = w[--j];
				q[h++] = ul.s.a(i_38_, (byte) 14).b((byte) -107);
				return;
			}
			if (command == 5056) {
				int i_39_ = w[--j];
				uj var_uj = ul.s.a(i_39_, (byte) 105);
				if (var_uj.C == null)
					w[j++] = 0;
				else {
					w[j++] = var_uj.C.length;
					return;
				}
				return;
			}
			if (command == 5057) {
				j -= 2;
				int i_40_ = w[j];
				int i_41_ = w[j + 1];
				w[j++] = ul.s.a(i_40_, (byte) 9).C[i_41_];
				return;
			}
			if (command == 5058) {
				t = new oe();
				t.a = w[--j];
				t.d = ul.s.a(t.a, (byte) 65);
				t.g = new int[t.d.c((byte) 3)];
				return;
			}
			if (command == 5059) {
				c++;
				tba var_tba = jga.sendGameOutPacket(sc.i, pca.isaac, (byte) -89);
				var_tba.loginStream.writeByte(0, (byte) -121);
				int i_42_ = var_tba.loginStream.pos;
				var_tba.loginStream.writeByte(0, (byte) -112);
				var_tba.loginStream.writeShort(t.a, 13469);
				t.d.a(t.g, 0, var_tba.loginStream);
				var_tba.loginStream.writeLengthByte(
						var_tba.loginStream.pos - i_42_, 2105852);
				ud.a(var_tba, (byte) -36);
				return;
			}
			if (command == 5060) {
				String string = q[--h];
				l++;
				tba var_tba = jga.sendGameOutPacket(sh.b, pca.isaac, (byte) 101);
				var_tba.loginStream.writeByte(0, (byte) -114);
				int i_43_ = var_tba.loginStream.pos;
				var_tba.loginStream.writeString(string, -112);
				var_tba.loginStream.writeShort(t.a, 13469);
				t.d.a(t.g, 0, var_tba.loginStream);
				var_tba.loginStream.writeLengthByte(
						var_tba.loginStream.pos - i_43_, 2105852);
				ud.a(var_tba, (byte) -36);
				return;
			}
			if (command == 5061) {
				c++;
				tba var_tba = jga.sendGameOutPacket(sc.i, pca.isaac, (byte) 91);
				var_tba.loginStream.writeByte(0, (byte) -127);
				int i_44_ = var_tba.loginStream.pos;
				var_tba.loginStream.writeByte(1, (byte) -108);
				var_tba.loginStream.writeShort(t.a, 13469);
				t.d.a(t.g, 0, var_tba.loginStream);
				var_tba.loginStream.writeLengthByte(
						var_tba.loginStream.pos - i_44_, 2105852);
				ud.a(var_tba, (byte) -36);
				return;
			}
			if (command == 5062) {
				j -= 2;
				int i_45_ = w[j];
				int i_46_ = w[j + 1];
				w[j++] = mj.l.a(49, i_45_).s[i_46_];
				return;
			}
			if (command == 5063) {
				j -= 2;
				int i_47_ = w[j];
				int i_48_ = w[j + 1];
				w[j++] = mj.l.a(50, i_47_).A[i_48_];
				return;
			}
			if (command == 5064) {
				j -= 2;
				int i_49_ = w[j];
				int i_50_ = w[j + 1];
				if (i_50_ == -1)
					w[j++] = -1;
				else {
					w[j++] = mj.l.a(102, i_49_).a((char) i_50_, 3766);
					return;
				}
				return;
			}
			if (command == 5065) {
				j -= 2;
				int i_51_ = w[j];
				int i_52_ = w[j + 1];
				if (i_52_ == -1)
					w[j++] = -1;
				else {
					w[j++] = mj.l.a(36, i_51_).a((byte) 40, (char) i_52_);
					return;
				}
				return;
			}
			if (command == 5066) {
				int i_53_ = w[--j];
				w[j++] = ul.s.a(i_53_, (byte) 102).c((byte) 3);
				return;
			}
			if (command == 5067) {
				j -= 2;
				int i_54_ = w[j];
				int i_55_ = w[j + 1];
				int i_56_ = ul.s.a(i_54_, (byte) 75).a(-127, i_55_).j;
				w[j++] = i_56_;
				return;
			}
			if (command == 5068) {
				j -= 2;
				int i_57_ = w[j];
				int i_58_ = w[j + 1];
				t.g[i_57_] = i_58_;
				return;
			}
			if (command == 5069) {
				j -= 2;
				int i_59_ = w[j];
				int i_60_ = w[j + 1];
				t.g[i_59_] = i_60_;
				return;
			}
			if (command == 5070) {
				j -= 3;
				int i_61_ = w[j];
				int i_62_ = w[j + 1];
				int i_63_ = w[j + 2];
				uj var_uj = ul.s.a(i_61_, (byte) 34);
				if (var_uj.a(-121, i_62_).j != 0)
					throw new RuntimeException("bad command");
				w[j++] = var_uj.a(66, i_63_, i_62_);
				return;
			}
			if (command == 5071) {
				String string = q[--h];
				boolean bool_64_ = w[--j] == 1;
				jk.a(true, string, bool_64_);
				w[j++] = uh.a;
				return;
			}
			if (command == 5072) {
				if (oga.a == null || Class_u.N >= uh.a)
					w[j++] = -1;
				else {
					w[j++] = oga.a[Class_u.N++] & 0xffff;
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
				if (uc.c.a((byte) -68, 86))
					w[j++] = 1;
				else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5101) {
				if (uc.c.a((byte) -68, 82))
					w[j++] = 1;
				else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5102) {
				if (uc.c.a((byte) -68, 81))
					w[j++] = 1;
				else {
					w[j++] = 0;
					return;
				}
				return;
			}
		} else if (command < 5300) {
			if (command == 5200) {
				ou.a(w[--j], (byte) -123);
				return;
			}
			if (command == 5201) {
				w[j++] = cda.b(3411);
				return;
			}
			if (command == 5205) {
				hga.a(w[--j], -1, -1, false, -1);
				return;
			}
			if (command == 5206) {
				int i_65_ = w[--j];
				eaa var_eaa = kca.b(i_65_ >> 14 & 0x3fff, i_65_ & 0x3fff);
				if (var_eaa == null)
					w[j++] = -1;
				else {
					w[j++] = var_eaa.t;
					return;
				}
				return;
			}
			if (command == 5207) {
				eaa var_eaa = kca.a(w[--j]);
				if (var_eaa == null || var_eaa.G == null)
					q[h++] = "";
				else {
					q[h++] = var_eaa.G;
					return;
				}
				return;
			}
			if (command == 5208) {
				w[j++] = uda.b;
				w[j++] = dea.h;
				return;
			}
			if (command == 5209) {
				w[j++] = ut.I + kca.F;
				w[j++] = cv.d + kca.E;
				return;
			}
			if (command == 5210) {
				int i_66_ = w[--j];
				eaa var_eaa = kca.a(i_66_);
				if (var_eaa == null) {
					w[j++] = 0;
					w[j++] = 0;
				} else {
					w[j++] = var_eaa.u >> 14 & 0x3fff;
					w[j++] = var_eaa.u & 0x3fff;
					return;
				}
				return;
			}
			if (command == 5211) {
				int i_67_ = w[--j];
				eaa var_eaa = kca.a(i_67_);
				if (var_eaa == null) {
					w[j++] = 0;
					w[j++] = 0;
				} else {
					w[j++] = var_eaa.F - var_eaa.s;
					w[j++] = var_eaa.C - var_eaa.H;
					return;
				}
				return;
			}
			if (command == 5212) {
				Class_vb class_vb = tj.b(2048);
				if (class_vb == null) {
					w[j++] = -1;
					w[j++] = -1;
				} else {
					w[j++] = class_vb.o;
					int i_68_ = (class_vb.t << 28
							| class_vb.m + kca.F << 14 | class_vb.n
							+ kca.E);
					w[j++] = i_68_;
					return;
				}
				return;
			}
			if (command == 5213) {
				Class_vb class_vb = Class_q.b(-102);
				if (class_vb == null) {
					w[j++] = -1;
					w[j++] = -1;
				} else {
					w[j++] = class_vb.o;
					int i_69_ = (class_vb.t << 28
							| class_vb.m + kca.F << 14 | class_vb.n
							+ kca.E);
					w[j++] = i_69_;
					return;
				}
				return;
			}
			if (command == 5214) {
				int i_70_ = w[--j];
				eaa var_eaa = naa.e((byte) 103);
				if (var_eaa != null) {
					boolean bool_71_ = var_eaa.a(i_70_ >> 14 & 0x3fff,
							i_70_ & 0x3fff, A, 255, i_70_ >> 28 & 0x3);
					if (bool_71_)
						em.a(A[2], A[1], 113);
				}
				return;
			}
			if (command == 5215) {
				j -= 2;
				int i_72_ = w[j];
				int i_73_ = w[j + 1];
				je var_je = kca.a(i_72_ >> 14 & 0x3fff, i_72_ & 0x3fff);
				boolean bool_74_ = false;
				for (eaa var_eaa = (eaa) var_je.d((byte) -75); var_eaa != null; var_eaa = (eaa) var_je
						.a(1252027233)) {
					if (var_eaa.t == i_73_) {
						bool_74_ = true;
						break;
					}
				}
				if (bool_74_)
					w[j++] = 1;
				else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5218) {
				int i_75_ = w[--j];
				eaa var_eaa = kca.a(i_75_);
				if (var_eaa == null)
					w[j++] = -1;
				else {
					w[j++] = var_eaa.w;
					return;
				}
				return;
			}
			if (command == 5220) {
				w[j++] = taa.b == 100 ? 1 : 0;
				return;
			}
			if (command == 5221) {
				int i_76_ = w[--j];
				em.a(i_76_ & 0x3fff, i_76_ >> 14 & 0x3fff, -17);
				return;
			}
			if (command == 5222) {
				eaa var_eaa = naa.e((byte) 103);
				if (var_eaa != null) {
					boolean bool_77_ = var_eaa.a(cv.d + kca.E, ut.I + kca.F, A,
							(byte) -125);
					if (bool_77_) {
						w[j++] = A[1];
						w[j++] = A[2];
					} else {
						w[j++] = -1;
						w[j++] = -1;
					}
				} else {
					w[j++] = -1;
					w[j++] = -1;
					return;
				}
				return;
			}
			if (command == 5223) {
				j -= 2;
				int i_78_ = w[j];
				int i_79_ = w[j + 1];
				hga.a(i_78_, -1, i_79_ & 0x3fff, false, i_79_ >> 14 & 0x3fff);
				return;
			}
			if (command == 5224) {
				int i_80_ = w[--j];
				eaa var_eaa = naa.e((byte) 103);
				if (var_eaa != null) {
					boolean bool_81_ = var_eaa.a(i_80_ >> 14 & 0x3fff,
							i_80_ & 0x3fff, A, 255, i_80_ >> 28 & 0x3);
					if (bool_81_) {
						w[j++] = A[1];
						w[j++] = A[2];
					} else {
						w[j++] = -1;
						w[j++] = -1;
					}
				} else {
					w[j++] = -1;
					w[j++] = -1;
					return;
				}
				return;
			}
			if (command == 5225) {
				int i_82_ = w[--j];
				eaa var_eaa = naa.e((byte) 103);
				if (var_eaa != null) {
					boolean bool_83_ = var_eaa.a(i_82_ & 0x3fff,
							i_82_ >> 14 & 0x3fff, A, (byte) -114);
					if (bool_83_) {
						w[j++] = A[1];
						w[j++] = A[2];
					} else {
						w[j++] = -1;
						w[j++] = -1;
					}
				} else {
					w[j++] = -1;
					w[j++] = -1;
					return;
				}
				return;
			}
			if (command == 5226) {
				bea.b(w[--j], 9192);
				return;
			}
			if (command == 5227) {
				j -= 2;
				int i_84_ = w[j];
				int i_85_ = w[j + 1];
				hga.a(i_84_, -1, i_85_ & 0x3fff, true, i_85_ >> 14 & 0x3fff);
				return;
			}
			if (command == 5228) {
				fu.f = w[--j] == 1;
				return;
			}
			if (command == 5229) {
				w[j++] = fu.f ? 1 : 0;
				return;
			}
			if (command == 5230) {
				int i_86_ = w[--j];
				Class_pb.a(3, i_86_);
				return;
			}
			if (command == 5231) {
				j -= 2;
				int i_87_ = w[j];
				boolean bool_88_ = w[j + 1] == 1;
				if (SpecialOutPacket.h != null) {
					Node class_d = SpecialOutPacket.h.a(-32748, (long) i_87_);
					if (class_d != null && !bool_88_)
						class_d.unlink(-14);
					else if (class_d == null && bool_88_) {
						class_d = new Node();
						SpecialOutPacket.h.a(class_d, (byte) -50, (long) i_87_);
					}
				}
				return;
			}
			if (command == 5232) {
				int i_89_ = w[--j];
				if (SpecialOutPacket.h != null) {
					Node class_d = SpecialOutPacket.h.a(-32748, (long) i_89_);
					w[j++] = class_d != null ? 1 : 0;
				} else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5233) {
				j -= 2;
				int i_90_ = w[j];
				boolean bool_91_ = w[j + 1] == 1;
				if (dd.I != null) {
					Node class_d = dd.I.a(-32748, (long) i_90_);
					if (class_d != null && !bool_91_)
						class_d.unlink(-121);
					else if (class_d == null && bool_91_) {
						class_d = new Node();
						dd.I.a(class_d, (byte) -87, (long) i_90_);
					}
				}
				return;
			}
			if (command == 5234) {
				int i_92_ = w[--j];
				if (dd.I != null) {
					Node class_d = dd.I.a(-32748, (long) i_92_);
					w[j++] = class_d != null ? 1 : 0;
				} else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5235) {
				w[j++] = kca.c != null ? kca.c.t : -1;
				return;
			}
			if (command == 5236) {
				j -= 2;
				int i_93_ = w[j];
				int i_94_ = w[j + 1];
				int i_95_ = i_94_ >> 14 & 0x3fff;
				int i_96_ = i_94_ & 0x3fff;
				int i_97_ = lba.b(i_96_, -100, i_93_, i_95_);
				if (i_97_ < 0)
					w[j++] = -1;
				else {
					w[j++] = i_97_;
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
				int i_98_ = w[j];
				int i_99_ = w[j + 1];
				kea.a(false, (byte) 126, i_98_, i_99_, 3);
				w[j++] = em.a != null ? 1 : 0;
				return;
			}
			if (command == 5301) {
				if (em.a != null)
					kea.a(false, (byte) 126, -1, -1, cs.g.w);
				return;
			}
			if (command == 5302) {
				ro[] var_ros = vq.a((byte) 58);
				w[j++] = var_ros.length;
				return;
			}
			if (command == 5303) {
				int i_100_ = w[--j];
				ro[] var_ros = vq.a((byte) 58);
				w[j++] = var_ros[i_100_].d;
				w[j++] = var_ros[i_100_].a;
				return;
			}
			if (command == 5305) {
				int i_101_ = cs.g.W;
				int i_102_ = cs.g.F;
				int i_103_ = -1;
				ro[] var_ros = vq.a((byte) 58);
				for (int i_104_ = 0; i_104_ < var_ros.length; i_104_++) {
					ro var_ro = var_ros[i_104_];
					if (var_ro.d == i_101_ && var_ro.a == i_102_) {
						i_103_ = i_104_;
						break;
					}
				}
				w[j++] = i_103_;
				return;
			}
			if (command == 5306) {
				w[j++] = ia.g(110);
				return;
			}
			if (command == 5307) {
				int i_105_ = w[--j];
				if (i_105_ >= 1 && i_105_ <= 2) {
					kea.a(false, (byte) 126, -1, -1, i_105_);
					return;
				}
				return;
			}
			if (command == 5308) {
				w[j++] = cs.g.w;
				return;
			}
			if (command == 5309) {
				int i_106_ = w[--j];
				if (i_106_ >= 1 && i_106_ <= 2) {
					cs.g.w = i_106_;
					cs.g.a(nda.signlink, (byte) 32);
					return;
				}
				return;
			}
		} else if (command < 5500) {
			if (command == 5400) {
				h -= 2;
				String string = q[h];
				String string_107_ = q[h + 1];
				int i_108_ = w[--j];
				f++;
				tba var_tba = jga.sendGameOutPacket(kj.c, pca.isaac, (byte) -69);
				var_tba.loginStream
						.writeByte(
								(cq.a(string, (byte) 2)
										+ cq.a(string_107_, (byte) 2) + 1),
								(byte) -123);
				var_tba.loginStream.writeString(string, -43);
				var_tba.loginStream.writeString(string_107_, -21);
				var_tba.loginStream.writeByte(i_108_, (byte) -120);
				ud.a(var_tba, (byte) -36);
				return;
			}
			if (command == 5401) {
				j -= 2;
				lf.n[w[j]] = (short) lg.a(53, w[j + 1]);
				laa.itemDefLoader.d(0);
				laa.itemDefLoader.b(-34);
				jm.p.c((byte) -122);
				fda.a(0);
				return;
			}
			if (command == 5405) {
				j -= 2;
				int i_109_ = w[j];
				int i_110_ = w[j + 1];
				if (i_109_ >= 0 && i_109_ < 2)
					Class_jc.lb[i_109_] = new int[i_110_ << 1][4];
				return;
			}
			if (command == 5406) {
				j -= 7;
				int i_111_ = w[j];
				int i_112_ = w[j + 1] << 1;
				int i_113_ = w[j + 2];
				int i_114_ = w[j + 3];
				int i_115_ = w[j + 4];
				int i_116_ = w[j + 5];
				int i_117_ = w[j + 6];
				if (i_111_ >= 0 && i_111_ < 2 && Class_jc.lb[i_111_] != null
						&& i_112_ >= 0 && i_112_ < Class_jc.lb[i_111_].length) {
					Class_jc.lb[i_111_][i_112_] = new int[] {
							(i_113_ >> 14 & 0x3fff) << 9, i_114_ << 2,
							(i_113_ & 0x3fff) << 9, i_117_ };
					Class_jc.lb[i_111_][i_112_ + 1] = new int[] {
							(i_115_ >> 14 & 0x3fff) << 9, i_116_ << 2,
							(i_115_ & 0x3fff) << 9 };
				}
				return;
			}
			if (command == 5407) {
				int i_118_ = Class_jc.lb[w[--j]].length >> 1;
				w[j++] = i_118_;
				return;
			}
			if (command == 5411) {
				if (em.a != null)
					kea.a(false, (byte) 126, -1, -1, cs.g.w);
				if (ws.J != null) {
					cc.a(false);
					System.exit(0);
				} else {
					String string = bt.quitURL != null ? bt.quitURL : pm
							.d(-9316);
					wj.a(126, string, nda.signlink, on.performance == 1, false);
					return;
				}
				return;
			}
			if (command == 5419) {
				String string = "";
				if (sa.t != null) {
					if (sa.t.hostName != null)
						string = (String) sa.t.hostName;
					else
						string = sda.a((byte) 82, sa.t.priority);
				}
				q[h++] = string;
				return;
			}
			if (command == 5420) {
				w[j++] = nda.signlink.r ? 0 : 1;
				return;
			}
			if (command == 5421) {
				if (em.a != null)
					kea.a(false, (byte) 126, -1, -1, cs.g.w);
				String string = q[--h];
				boolean bool_119_ = w[--j] == 1;
				String string_120_ = pm.d(-9316) + string;
				wj.a(125, string_120_, nda.signlink, on.performance == 1, bool_119_);
				return;
			}
			if (command == 5422) {
				h -= 2;
				String string = q[h];
				String string_121_ = q[h + 1];
				int i_122_ = w[--j];
				if (string.length() > 0) {
					if (kr.e == null)
						kr.e = new String[wu.h[me.q.h]];
					kr.e[i_122_] = string;
				}
				if (string_121_.length() > 0) {
					if (na.g == null)
						na.g = new String[wu.h[me.q.h]];
					na.g[i_122_] = string_121_;
				}
				return;
			}
			if (command == 5423) {
				System.out.println(q[--h]);
				return;
			}
			if (command == 5424) {
				j -= 11;
				dk.q = w[j];
				rm.o = w[j + 1];
				laa.a = w[j + 2];
				tda.f = w[j + 3];
				ik.t = w[j + 4];
				lfa.c = w[j + 5];
				pv.k = w[j + 6];
				jj.r = w[j + 7];
				uj.A = w[j + 8];
				vea.d = w[j + 9];
				ce.e = w[j + 10];
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
				Login.j = w[j];
				jt.b = w[j + 1];
				return;
			}
			if (command == 5427) {
				j -= 2;
				ml.h = w[j + 1];
				return;
			}
			if (command == 5428) {
				j -= 2;
				int i_123_ = w[j];
				int i_124_ = w[j + 1];
				w[j++] = vq.a(false, i_123_, i_124_) ? 1 : 0;
				return;
			}
			if (command == 5429) {
				bj.applyClientCommand(0, false, q[--h], false);
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
							string = (String) (transferable
									.getTransferData(DataFlavor.stringFlavor));
							if (string == null)
								string = "";
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
				q[h++] = string;
				return;
			}
		} else if (command < 5600) {
			if (command == 5500) {
				j -= 4;
				int i_125_ = w[j];
				int i_126_ = w[j + 1];
				int i_127_ = w[j + 2];
				int i_128_ = w[j + 3];
				Class_ub.a(false, (i_125_ >> 14 & 0x3fff)
						- bfa.thisPlayersRegionX, i_127_, i_128_, false,
						(i_125_ & 0x3fff) - BytesParser.thisPlayersRegionY,
						i_126_ << 2);
				return;
			}
			if (command == 5501) {
				j -= 4;
				int i_129_ = w[j];
				int i_130_ = w[j + 1];
				int i_131_ = w[j + 2];
				int i_132_ = w[j + 3];
				it.a((byte) -16, i_131_, (i_129_ >> 14 & 0x3fff)
						- bfa.thisPlayersRegionX, (i_129_ & 0x3fff)
						- BytesParser.thisPlayersRegionY, i_130_ << 2, i_132_);
				return;
			}
			if (command == 5502) {
				j -= 6;
				int i_133_ = w[j];
				if (i_133_ >= 2)
					throw new RuntimeException();
				mg.t = i_133_;
				int i_134_ = w[j + 1];
				if (i_134_ + 1 >= Class_jc.lb[mg.t].length >> 1)
					throw new RuntimeException();
				rn.c = i_134_;
				aj.d = 0;
				gn.I = w[j + 2];
				rv.A = w[j + 3];
				int i_135_ = w[j + 4];
				if (i_135_ >= 2)
					throw new RuntimeException();
				pi.n = i_135_;
				int i_136_ = w[j + 5];
				if (i_136_ + 1 >= Class_jc.lb[pi.n].length >> 1)
					throw new RuntimeException();
				Class_kf.I = i_136_;
				ll.x = 3;
				ja.Cc = dj.o = -1;
				return;
			}
			if (command == 5503) {
				FileOnDisk.c((byte) -110);
				return;
			}
			if (command == 5504) {
				j -= 2;
				vr.a(0, w[j + 1], w[j], 8);
				return;
			}
			if (command == 5505) {
				w[j++] = (int) pm.F >> 3;
				return;
			}
			if (command == 5506) {
				w[j++] = (int) qw.n >> 3;
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
				int i_137_ = w[--j];
				int i_138_ = i_137_ >> 14 & 0x3fff;
				int i_139_ = i_137_ & 0x3fff;
				i_138_ -= bfa.thisPlayersRegionX;
				if (i_138_ < 0)
					i_138_ = 0;
				else if (i_138_ >= Class_hc.e)
					i_138_ = Class_hc.e;
				i_139_ -= BytesParser.thisPlayersRegionY;
				if (i_139_ < 0)
					i_139_ = 0;
				else if (i_139_ >= bw.v)
					i_139_ = bw.v;
				fu.a = (i_138_ << 9) + 256;
				qg.j = (i_139_ << 9) + 256;
				ll.x = 4;
				ja.Cc = dj.o = -1;
				return;
			}
			if (command == 5512) {
				lp.b(5);
				return;
			}
			if (command == 5517) {
				int i_140_ = w[--j];
				if (i_140_ == -1) {
					int i_141_ = i_140_ >> 14 & 0x3fff;
					int i_142_ = i_140_ & 0x3fff;
					i_141_ -= bfa.thisPlayersRegionX;
					if (i_141_ < 0)
						i_141_ = 0;
					else if (i_141_ >= Class_hc.e)
						i_141_ = Class_hc.e;
					i_142_ -= BytesParser.thisPlayersRegionY;
					if (i_142_ < 0)
						i_142_ = 0;
					else if (i_142_ >= bw.v)
						i_142_ = bw.v;
					ja.Cc = (i_141_ << 9) + 256;
					dj.o = (i_142_ << 9) + 256;
				} else {
					ja.Cc = -1;
					dj.o = -1;
					return;
				}
				return;
			}
		} else if (command < 5700) {
			if (command == 5600) {
				h -= 2;
				String string = q[h];
				String string_143_ = q[h + 1];
				int i_144_ = w[--j];
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					op.username = string;
					Interface.password = string_143_;
					pda.y = i_144_;
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
					Class_r.a(w[j], w[j + 3], w[j + 2], w[j + 1], (byte) 99);
					return;
				}
				return;
			}
			if (command == 5604) {
				h--;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					us.a(-119, aaa.stringToLong(0, q[h]));
					return;
				}
				return;
			}
			if (command == 5605) {
				h -= 2;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					im.a(q[h + 1], aaa.stringToLong(0, q[h]), false, (byte) 110);
					return;
				}
				return;
			}
			if (command == 5606) {
				if (Class_eb.q == 0)
					jp.s = -2;
				return;
			}
			if (command == 5607) {
				w[j++] = br.l;
				return;
			}
			if (command == 5608) {
				w[j++] = nc.m;
				return;
			}
			if (command == 5609) {
				w[j++] = jp.s;
				return;
			}
			if (command == 5610) {
				for (int i_145_ = 0; i_145_ < 5; i_145_++)
					q[h++] = (bg.f != null && bg.f.length > i_145_ ? rg.a(
							(byte) 111, bg.f[i_145_]) : "");
				bg.f = null;
				return;
			}
			if (command == 5611) {
				w[j++] = ip.T;
				return;
			}
			if (command == 5612) {
				int i_146_ = w[--j];
				if (hm.h == 7 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					if (ce.y != null) {
						ce.y.d(0);
						ce.y = null;
					}
					pda.y = i_146_;
					ei.a(9, -104);
					return;
				}
				return;
			}
			if (command == 5613) {
				w[j++] = br.l;
				return;
			}
			if (command == 5615) {
				h -= 2;
				String string = q[h];
				String string_147_ = q[h + 1];
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					if (ce.y != null) {
						ce.y.d(0);
						ce.y = null;
					}
					op.username = string;
					Interface.password = string_147_;
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
				w[j++] = td.l;
				return;
			}
			if (command == 5618) {
				int i_148_ = w[--j];
				Class_fd.a(false, i_148_, 3);
				return;
			}
			if (command == 5619) {
				int i_149_ = w[--j];
				Class_fd.a(true, i_149_, 3);
				return;
			}
			if (command == 5620) {
				qca.a(-95);
				if (nu.i != "" && nu.i != "")
					w[j++] = 1;
				else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5621) {
				h -= 2;
				if (hm.h == 3 && (hk.loginStage == 0 && Class_eb.q == 0)) {
					im.a(q[h + 1], aaa.stringToLong(0, q[h]), true, (byte) 103);
					return;
				}
				return;
			}
			if (command == 5622) {
				vfa var_vfa = nda.signlink.a("3", (byte) -28, false);
				while (var_vfa.f == 0)
					Connection.a(-28448, 1L);
				if (var_vfa.f == 2)
					throw new RuntimeException("Error opening file");
				FileOnDisk var_cu = (FileOnDisk) var_vfa.hostName;
				if (var_cu.getFile((byte) -114).exists()) {
					BytesParser var_es = new BytesParser(50);
					try {
						var_cu.write(0, (byte) -123, 50,
								var_es.bytes);
					} catch (java.io.IOException ioexception) {
						/* empty */
					}
				}
				try {
					var_cu.close((byte) -127);
				} catch (Exception exception) {
					/* empty */
				}
				return;
			}
			if (command == 5623) {
				if (uo.ssKey != null)
					w[j++] = 1;
				else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (command == 5624) {
				w[j++] = (int) (ak.userFlow >> 32);
				w[j++] = (int) (ak.userFlow & 0xffffL);
				return;
			}
		} else if (command < 6100) {
			if (command == 6001) {
				int i_150_ = w[--j];
				if (i_150_ < 1)
					i_150_ = 1;
				if (i_150_ > 4)
					i_150_ = 4;
				cs.g.db = i_150_;
				ka.a((byte) 49);
				cs.g.a(nda.signlink, (byte) 119);
				NPCNode.k = false;
				return;
			}
			if (command == 6002) {
				cs.g.a(w[--j] == 1, 1000);
				ka.a((byte) 46);
				kl.b(-99);
				cs.g.a(nda.signlink, (byte) 105);
				NPCNode.k = false;
				return;
			}
			if (command == 6003) {
				cs.g.R = w[--j] == 1;
				kl.b(-118);
				cs.g.a(nda.signlink, (byte) 121);
				NPCNode.k = false;
				return;
			}
			if (command == 6005) {
				cs.g.ab = w[--j] == 1;
				ka.a((byte) -114);
				cs.g.a(nda.signlink, (byte) 42);
				NPCNode.k = false;
				return;
			}
			if (command == 6006) {
				cs.g.K = w[--j] == 1;
				lg.r.b(!cs.g.K);
				cs.g.a(nda.signlink, (byte) 39);
				NPCNode.k = false;
				return;
			}
			if (command == 6007) {
				cs.g.q = w[--j];
				cs.g.a(nda.signlink, (byte) 114);
				NPCNode.k = false;
				return;
			}
			if (command == 6008) {
				cs.g.y = w[--j] == 1;
				cs.g.a(nda.signlink, (byte) 75);
				NPCNode.k = false;
				return;
			}
			if (command == 6009) {
				cs.g.B = w[--j] == 1;
				ka.a((byte) -120);
				cs.g.a(nda.signlink, (byte) 112);
				NPCNode.k = false;
				return;
			}
			if (command == 6010) {
				cs.g.t = w[--j] == 1;
				cs.g.a(nda.signlink, (byte) 78);
				NPCNode.k = false;
				return;
			}
			if (command == 6011) {
				int i_151_ = w[--j];
				if (i_151_ < 0 || i_151_ > 2)
					i_151_ = 0;
				cs.g.a(i_151_, 2, on.performance);
				ka.a((byte) 59);
				cs.g.a(nda.signlink, (byte) 79);
				NPCNode.k = false;
				return;
			}
			if (command == 6012) {
				cs.g.a((byte) -119, w[--j] == 1, on.performance);
				bca.a((byte) 103);
				Class_ad.b(-104);
				cs.g.a(nda.signlink, (byte) 90);
				NPCNode.k = false;
				return;
			}
			if (command == 6014) {
				cs.g.L = w[--j] == 1;
				ka.a((byte) -115);
				cs.g.a(nda.signlink, (byte) 71);
				NPCNode.k = false;
				return;
			}
			if (command == 6015) {
				cs.g.p = w[--j] == 1;
				ka.a((byte) -109);
				cs.g.a(nda.signlink, (byte) 89);
				NPCNode.k = false;
				return;
			}
			if (command == 6016) {
				int i_152_ = w[--j];
				if (i_152_ < 0 || i_152_ > 2)
					i_152_ = 0;
				cs.g.Z = i_152_;
				ur.a(on.performance, true);
				cs.g.a(nda.signlink, (byte) 35);
				return;
			}
			if (command == 6017) {
				cs.g.s = w[--j] == 1;
				hm.a(true);
				cs.g.a(nda.signlink, (byte) 116);
				NPCNode.k = false;
				return;
			}
			if (command == 6018) {
				int i_153_ = w[--j];
				if (i_153_ < 0)
					i_153_ = 0;
				if (i_153_ > 127)
					i_153_ = 127;
				cs.g.I = i_153_;
				cs.g.a(nda.signlink, (byte) 32);
				NPCNode.k = false;
				return;
			}
			if (command == 6019) {
				int i_154_ = w[--j];
				if (i_154_ < 0)
					i_154_ = 0;
				if (i_154_ > 255)
					i_154_ = 255;
				if (i_154_ != cs.g.N) {
					if (cs.g.N == 0 && ws.G != -1) {
						Class_b.a(false, 0, i_154_, mq.a, (byte) -48, ws.G);
						Class_jc.ib = false;
					} else if (i_154_ == 0) {
						ku.a(true);
						Class_jc.ib = false;
					} else
						nh.a(i_154_, (byte) -119);
					cs.g.N = i_154_;
				}
				cs.g.a(nda.signlink, (byte) 38);
				NPCNode.k = false;
				return;
			}
			if (command == 6020) {
				int i_155_ = w[--j];
				if (i_155_ < 0)
					i_155_ = 0;
				if (i_155_ > 127)
					i_155_ = 127;
				cs.g.Y = i_155_;
				cs.g.a(nda.signlink, (byte) 40);
				NPCNode.k = false;
				return;
			}
			if (command == 6021) {
				cs.g.qb = w[--j] == 1;
				kl.b(-120);
				return;
			}
			if (command == 6023) {
				int i_156_ = w[--j];
				boolean bool_157_ = false;
				if (i_156_ < 0)
					i_156_ = 0;
				if (i_156_ > 2)
					i_156_ = 2;
				if (qm.heapSize < 96) {
					i_156_ = 0;
					bool_157_ = true;
				}
				pda.d(0, i_156_);
				cs.g.a(nda.signlink, (byte) 115);
				NPCNode.k = false;
				w[j++] = bool_157_ ? 0 : 1;
				return;
			}
			if (command == 6024) {
				int i_158_ = w[--j];
				if (i_158_ < 0 || i_158_ > 2)
					i_158_ = 0;
				cs.g.S = i_158_;
				cs.g.a(nda.signlink, (byte) 43);
				return;
			}
			if (command == 6025) {
				int i_159_ = w[--j];
				if (i_159_ < 0 || i_159_ > Class_g.a(-69, qm.heapSize))
					i_159_ = 0;
				cs.g.m = i_159_;
				cs.g.a(nda.signlink, (byte) 101);
				NPCNode.k = false;
				return;
			}
			if (command == 6027) {
				int i_160_ = w[--j];
				if (i_160_ < 0 || i_160_ > 1)
					i_160_ = 0;
				ik.a(-49, i_160_ == 1);
				return;
			}
			if (command == 6028) {
				cs.g.J = w[--j] != 0;
				cs.g.a(nda.signlink, (byte) 98);
				return;
			}
			if (command == 6029) {
				cs.g.q = w[--j];
				cs.g.a(nda.signlink, (byte) 62);
				return;
			}
			if (command == 6030) {
				cs.g.Q = w[--j] != 0;
				cs.g.a(nda.signlink, (byte) 45);
				ka.a((byte) -122);
				return;
			}
			if (command == 6031) {
				int i_161_ = w[--j];
				if (i_161_ < 0 || i_161_ > 5)
					i_161_ = 2;
				ur.a(i_161_, true);
				return;
			}
			if (command == 6032) {
				int i_162_ = w[--j];
				if (i_162_ < 0 || i_162_ > 5)
					i_162_ = 2;
				cs.g.M = i_162_;
				cs.g.a(nda.signlink, (byte) 53);
				NPCNode.k = false;
				return;
			}
			if (command == 6033) {
				int i_163_ = w[--j];
				if (i_163_ < 0 || i_163_ > 4)
					i_163_ = 2;
				cs.g.x = i_163_;
				cs.g.a(nda.signlink, (byte) 45);
				return;
			}
			if (command == 6034) {
				cs.g.k = w[--j] == 1;
				cs.g.a(nda.signlink, (byte) 57);
				bca.a((byte) 50);
				NPCNode.k = false;
				return;
			}
			if (command == 6035) {
				cs.g.Hb = w[--j] == 1;
				ka.a((byte) 12);
				kl.b(-110);
				return;
			}
			if (command == 6036) {
				int i_164_ = w[--j];
				if (i_164_ < 0 || i_164_ > 2)
					i_164_ = 0;
				cs.g.a((byte) 122, i_164_);
				cs.g.a(nda.signlink, (byte) 31);
				return;
			}
			if (command == 6037) {
				int i_165_ = w[--j];
				if (i_165_ < 0)
					i_165_ = 0;
				if (i_165_ > 127)
					i_165_ = 127;
				cs.g.P = i_165_;
				cs.g.a(nda.signlink, (byte) 44);
				NPCNode.k = false;
				return;
			}
			if (command == 6038) {
				int i_166_ = w[--j];
				if (i_166_ < 0)
					i_166_ = 0;
				if (i_166_ > 255)
					i_166_ = 255;
				if (i_166_ != cs.g.V && ws.G == cga.E) {
					if (cs.g.V == 0) {
						Class_b.a(false, 0, i_166_, mq.a, (byte) -63, ws.G);
						Class_jc.ib = false;
					} else if (i_166_ == 0) {
						ku.a(true);
						Class_jc.ib = false;
					} else
						nh.a(i_166_, (byte) -119);
				}
				cs.g.V = i_166_;
				cs.g.a(nda.signlink, (byte) 120);
				NPCNode.k = false;
				return;
			}
			if (command == 6039) {
				int i_167_ = w[--j];
				if (i_167_ > 255 || i_167_ < 0)
					i_167_ = 0;
				if (i_167_ != cs.g.z) {
					cs.g.z = i_167_;
					cs.g.a(nda.signlink, (byte) 79);
					NPCNode.k = false;
				}
				return;
			}
		} else if (command < 6200) {
			if (command == 6101) {
				w[j++] = cs.g.db;
				return;
			}
			if (command == 6102) {
				w[j++] = cs.g.d(on.performance, -2) ? 1 : 0;
				return;
			}
			if (command == 6103) {
				w[j++] = cs.g.R ? 1 : 0;
				return;
			}
			if (command == 6105) {
				w[j++] = cs.g.ab ? 1 : 0;
				return;
			}
			if (command == 6106) {
				w[j++] = cs.g.K ? 1 : 0;
				return;
			}
			if (command == 6107) {
				w[j++] = cs.g.q;
				return;
			}
			if (command == 6108) {
				w[j++] = cs.g.y ? 1 : 0;
				return;
			}
			if (command == 6109) {
				w[j++] = cs.g.B ? 1 : 0;
				return;
			}
			if (command == 6110) {
				w[j++] = cs.g.t ? 1 : 0;
				return;
			}
			if (command == 6111) {
				w[j++] = cs.g.b(on.performance, -110);
				return;
			}
			if (command == 6112) {
				w[j++] = cs.g.a(-126, on.performance) ? 1 : 0;
				return;
			}
			if (command == 6114) {
				w[j++] = cs.g.L ? 1 : 0;
				return;
			}
			if (command == 6115) {
				w[j++] = cs.g.p ? 1 : 0;
				return;
			}
			if (command == 6116) {
				w[j++] = cs.g.Z;
				return;
			}
			if (command == 6117) {
				w[j++] = cs.g.s ? 1 : 0;
				return;
			}
			if (command == 6118) {
				w[j++] = cs.g.I;
				return;
			}
			if (command == 6119) {
				w[j++] = cs.g.N;
				return;
			}
			if (command == 6120) {
				w[j++] = cs.g.Y;
				return;
			}
			if (command == 6121) {
				w[j++] = lg.r.d() ? 1 : 0;
				return;
			}
			if (command == 6123) {
				w[j++] = ql.a(0);
				return;
			}
			if (command == 6124) {
				w[j++] = cs.g.S;
				return;
			}
			if (command == 6125) {
				w[j++] = cs.g.m;
				return;
			}
			if (command == 6126) {
				w[j++] = lg.r.r() ? 1 : 0;
				return;
			}
			if (command == 6127) {
				w[j++] = cs.g.cb ? 1 : 0;
				return;
			}
			if (command == 6128) {
				w[j++] = cs.g.J ? 1 : 0;
				return;
			}
			if (command == 6129) {
				w[j++] = cs.g.q;
				return;
			}
			if (command == 6130) {
				w[j++] = cs.g.Q ? 1 : 0;
				return;
			}
			if (command == 6131) {
				w[j++] = on.performance;
				return;
			}
			if (command == 6132) {
				w[j++] = cs.g.M;
				return;
			}
			if (command == 6133) {
				w[j++] = nda.signlink.r && !nda.signlink.e ? 1 : 0;
				return;
			}
			if (command == 6134) {
				w[j++] = Class_g.a(-77, qm.heapSize);
				return;
			}
			if (command == 6135) {
				w[j++] = cs.g.x;
				return;
			}
			if (command == 6136) {
				w[j++] = cs.g.k ? 1 : 0;
				return;
			}
			if (command == 6137) {
				boolean bool_168_ = true;
				try {
					bool_168_ = jagmisc.getTotalPhysicalMemory() > 268435456L;
				} catch (Throwable throwable) {
					/* empty */
				}
				w[j++] = bool_168_ ? 1 : 0;
				return;
			}
			if (command == 6138) {
				w[j++] = ItemDef.a(on.performance, (byte) -128, 200);
				return;
			}
			if (command == 6139) {
				w[j++] = cs.g.a(on.performance, (byte) 121);
				return;
			}
			if (command == 6140) {
				int i_169_ = 0;
				if (mg.c(-1, on.performance) && qm.heapSize < 96)
					i_169_ = 1;
				w[j++] = i_169_;
				return;
			}
			if (command == 6141) {
				if (qm.heapSize < 96)
					w[j++] = 0;
				else {
					w[j++] = 2;
					return;
				}
				return;
			}
			if (command == 6142) {
				w[j++] = cs.g.P;
				return;
			}
			if (command == 6143) {
				w[j++] = cs.g.V;
				return;
			}
			if (command == 6144) {
				w[j++] = no.x ? 1 : 0;
				return;
			}
			if (command == 6145) {
				w[j++] = cs.g.z;
				return;
			}
		} else if (command < 6300) {
			if (command == 6200) {
				j -= 2;
				ifa.c = (short) w[j];
				if (ifa.c <= 0)
					ifa.c = (short) 256;
				Class_kd.m = (short) w[j + 1];
				if (Class_kd.m <= 0)
					Class_kd.m = (short) 205;
				return;
			}
			if (command == 6201) {
				j -= 2;
				cda.a = (short) w[j];
				if (cda.a <= 0)
					cda.a = (short) 256;
				gf.f = (short) w[j + 1];
				if (gf.f <= 0)
					gf.f = (short) 320;
				return;
			}
			if (command == 6202) {
				j -= 4;
				bi.U = (short) w[j];
				if (bi.U <= 0)
					bi.U = (short) 1;
				GrandExchangeItem.k = (short) w[j + 1];
				if (GrandExchangeItem.k <= 0)
					GrandExchangeItem.k = (short) 32767;
				else if (GrandExchangeItem.k < bi.U)
					GrandExchangeItem.k = bi.U;
				oe.e = (short) w[j + 2];
				if (oe.e <= 0)
					oe.e = (short) 1;
				hm.d = (short) w[j + 3];
				if (hm.d <= 0)
					hm.d = (short) 32767;
				else {
					if (hm.d < oe.e)
						hm.d = oe.e;
					return;
				}
				return;
			}
			if (command == 6203) {
				lu.a(tj.h.minVScroll, 0, -16777216, 0,
						tj.h.minHScroll, false);
				w[j++] = qea.b;
				w[j++] = vq.k;
				return;
			}
			if (command == 6204) {
				w[j++] = cda.a;
				w[j++] = gf.f;
				return;
			}
			if (command == 6205) {
				w[j++] = ifa.c;
				w[j++] = Class_kd.m;
				return;
			}
		} else if (command < 6400) {
			if (command == 6300) {
				w[j++] = (int) (us.a(115) / 60000L);
				return;
			}
			if (command == 6301) {
				w[j++] = (int) (us.a(96) / 86400000L) - 11745;
				return;
			}
			if (command == 6302) {
				j -= 3;
				int i_170_ = w[j];
				int i_171_ = w[j + 1];
				int i_172_ = w[j + 2];
				calendar.clear();
				calendar.set(11, 12);
				calendar.set(i_172_, i_171_, i_170_);
				int i_173_ = (int) (calendar.getTime().getTime() / 86400000L) - 11745;
				if (i_172_ < 1970)
					i_173_--;
				w[j++] = i_173_;
				return;
			}
			if (command == 6303) {
				calendar.clear();
				calendar.setTime(new Date(us.a(113)));
				w[j++] = calendar.get(1);
				return;
			}
			if (command == 6304) {
				int i_174_ = w[--j];
				boolean bool_175_ = true;
				if (i_174_ < 0)
					bool_175_ = (i_174_ + 1) % 4 == 0;
				else if (i_174_ < 1582)
					bool_175_ = i_174_ % 4 == 0;
				else if (i_174_ % 4 != 0)
					bool_175_ = false;
				else if (i_174_ % 100 != 0)
					bool_175_ = true;
				else if (i_174_ % 400 != 0)
					bool_175_ = false;
				w[j++] = bool_175_ ? 1 : 0;
				return;
			}
		} else if (command < 6500) {
			if (command == 6405) {
				w[j++] = Class_jc.i((byte) 124) ? 1 : 0;
				return;
			}
			if (command == 6406) {
				w[j++] = Class_ec.a(103) ? 1 : 0;
				return;
			}
		} else if (command < 6600) {
			if (command == 6500) {
				if (hm.h != 7 || hk.loginStage != 0 || Class_eb.q != 0)
					w[j++] = 1;
				else {
					if (il.r)
						w[j++] = 0;
					else {
						if (ufa.a > us.a(125) - 1000L)
							w[j++] = 1;
						else {
							il.r = true;
							tba var_tba = jga.sendGameOutPacket(dm.c, pca.isaac,
									(byte) -100);
							var_tba.loginStream.writeInt(br.o, -100);
							ud.a(var_tba, (byte) -36);
							w[j++] = 0;
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			if (command == 6501) {
				WorldSub var_iw = hea.b(6684);
				if (var_iw != null) {
					w[j++] = var_iw.worldID;
					w[j++] = var_iw.e;
					q[h++] = var_iw.activity;
					sw var_sw = var_iw.d((byte) 123);
					w[j++] = var_sw.d;
					q[h++] = var_sw.c;
					w[j++] = var_iw.a;
					w[j++] = var_iw.l;
					q[h++] = var_iw.m;
				} else {
					w[j++] = -1;
					w[j++] = 0;
					q[h++] = "";
					w[j++] = 0;
					q[h++] = "";
					w[j++] = 0;
					w[j++] = 0;
					q[h++] = "";
					return;
				}
				return;
			}
			if (command == 6502) {
				WorldSub var_iw = GameOutPacket.a(55);
				if (var_iw != null) {
					w[j++] = var_iw.worldID;
					w[j++] = var_iw.e;
					q[h++] = var_iw.activity;
					sw var_sw = var_iw.d((byte) 126);
					w[j++] = var_sw.d;
					q[h++] = var_sw.c;
					w[j++] = var_iw.a;
					w[j++] = var_iw.l;
					q[h++] = var_iw.m;
				} else {
					w[j++] = -1;
					w[j++] = 0;
					q[h++] = "";
					w[j++] = 0;
					q[h++] = "";
					w[j++] = 0;
					w[j++] = 0;
					q[h++] = "";
					return;
				}
				return;
			}
			if (command == 6503) {
				int i_176_ = w[--j];
				String string = q[--h];
				if (hm.h != 7 || hk.loginStage != 0 || Class_eb.q != 0)
					w[j++] = 0;
				else {
					w[j++] = ee.a(i_176_, string, 55) ? 1 : 0;
					return;
				}
				return;
			}
			if (command == 6504) {
				cs.g.l = w[--j];
				cs.g.a(nda.signlink, (byte) 95);
				return;
			}
			if (command == 6505) {
				w[j++] = cs.g.l;
				return;
			}
			if (command == 6506) {
				int i_177_ = w[--j];
				WorldSub var_iw = Class_kd.a(i_177_, true);
				if (var_iw != null) {
					w[j++] = var_iw.e;
					q[h++] = var_iw.activity;
					sw var_sw = var_iw.d((byte) 121);
					w[j++] = var_sw.d;
					q[h++] = var_sw.c;
					w[j++] = var_iw.a;
					w[j++] = var_iw.l;
					q[h++] = var_iw.m;
				} else {
					w[j++] = -1;
					q[h++] = "";
					w[j++] = 0;
					q[h++] = "";
					w[j++] = 0;
					w[j++] = 0;
					q[h++] = "";
					return;
				}
				return;
			}
			if (command == 6507) {
				j -= 4;
				int i_178_ = w[j];
				boolean bool_179_ = w[j + 1] == 1;
				int i_180_ = w[j + 2];
				boolean bool_181_ = w[j + 3] == 1;
				ml.a((byte) -25, i_178_, bool_179_, i_180_, bool_181_);
				return;
			}
			if (command == 6508) {
				vca.a((byte) -29);
				return;
			}
			if (command == 6509) {
				if (hm.h == 7) {
					mga.s = w[--j] == 1;
					return;
				}
				return;
			}
			if (command == 6510) {
				w[j++] = cd.worldFlags;
				return;
			}
		} else if (command < 6700) {
			if (command == 6600) {
				cs.g.n = w[--j] == 1;
				cs.g.a(nda.signlink, (byte) 36);
				return;
			}
			if (command == 6601) {
				w[j++] = cs.g.n ? 1 : 0;
				return;
			}
		} else if (command < 6800 && gv.modeWhat == wd.b) {
			if (command == 6700) {
				int i_182_ = ida.l.a((byte) -26);
				if (Class_vb.u != -1)
					i_182_++;
				w[j++] = i_182_;
				return;
			}
			if (command == 6701) {
				int i_183_ = w[--j];
				if (Class_vb.u != -1) {
					if (i_183_ == 0) {
						w[j++] = Class_vb.u;
						return;
					}
					i_183_--;
				}
				tt var_tt = (tt) ida.l.b((byte) 124);
				while (i_183_-- > 0)
					var_tt = (tt) ida.l.b(12561);
				w[j++] = var_tt.l;
				return;
			}
			if (command == 6702) {
				int i_184_ = w[--j];
				if (aa.o[i_184_] == null)
					q[h++] = "";
				else {
					String string = aa.o[i_184_][0].Hb;
					if (string == null)
						q[h++] = "";
					else {
						q[h++] = string.substring(0, string.indexOf(':'));
						return;
					}
					return;
				}
				return;
			}
			if (command == 6703) {
				int i_185_ = w[--j];
				if (aa.o[i_185_] == null)
					w[j++] = 0;
				else {
					w[j++] = aa.o[i_185_].length;
					return;
				}
				return;
			}
			if (command == 6704) {
				j -= 2;
				int i_186_ = w[j];
				int i_187_ = w[j + 1];
				if (aa.o[i_186_] == null)
					q[h++] = "";
				else {
					String string = aa.o[i_186_][i_187_].Hb;
					if (string == null)
						q[h++] = "";
					else {
						q[h++] = string;
						return;
					}
					return;
				}
				return;
			}
			if (command == 6705) {
				j -= 2;
				int i_188_ = w[j];
				int i_189_ = w[j + 1];
				if (aa.o[i_188_] == null)
					w[j++] = 0;
				else {
					w[j++] = aa.o[i_188_][i_189_].bc;
					return;
				}
				return;
			}
			if (command == 6706)
				return;
			if (command == 6707) {
				j -= 3;
				int i_190_ = w[j];
				int i_191_ = w[j + 1];
				int i_192_ = w[j + 2];
				cda.a(i_192_, 18365, 1, "", i_190_ << 16 | i_191_);
				return;
			}
			if (command == 6708) {
				j -= 3;
				int i_193_ = w[j];
				int i_194_ = w[j + 1];
				int i_195_ = w[j + 2];
				cda.a(i_195_, 18365, 2, "", i_193_ << 16 | i_194_);
				return;
			}
			if (command == 6709) {
				j -= 3;
				int i_196_ = w[j];
				int i_197_ = w[j + 1];
				int i_198_ = w[j + 2];
				cda.a(i_198_, 18365, 3, "", i_196_ << 16 | i_197_);
				return;
			}
			if (command == 6710) {
				j -= 3;
				int i_199_ = w[j];
				int i_200_ = w[j + 1];
				int i_201_ = w[j + 2];
				cda.a(i_201_, 18365, 4, "", i_199_ << 16 | i_200_);
				return;
			}
			if (command == 6711) {
				j -= 3;
				int i_202_ = w[j];
				int i_203_ = w[j + 1];
				int i_204_ = w[j + 2];
				cda.a(i_204_, 18365, 5, "", i_202_ << 16 | i_203_);
				return;
			}
			if (command == 6712) {
				j -= 3;
				int i_205_ = w[j];
				int i_206_ = w[j + 1];
				int i_207_ = w[j + 2];
				cda.a(i_207_, 18365, 6, "", i_205_ << 16 | i_206_);
				return;
			}
			if (command == 6713) {
				j -= 3;
				int i_208_ = w[j];
				int i_209_ = w[j + 1];
				int i_210_ = w[j + 2];
				cda.a(i_210_, 18365, 7, "", i_208_ << 16 | i_209_);
				return;
			}
			if (command == 6714) {
				j -= 3;
				int i_211_ = w[j];
				int i_212_ = w[j + 1];
				int i_213_ = w[j + 2];
				cda.a(i_213_, 18365, 8, "", i_211_ << 16 | i_212_);
				return;
			}
			if (command == 6715) {
				j -= 3;
				int i_214_ = w[j];
				int i_215_ = w[j + 1];
				int i_216_ = w[j + 2];
				cda.a(i_216_, 18365, 9, "", i_214_ << 16 | i_215_);
				return;
			}
			if (command == 6716) {
				j -= 3;
				int i_217_ = w[j];
				int i_218_ = w[j + 1];
				int i_219_ = w[j + 2];
				cda.a(i_219_, 18365, 10, "", i_217_ << 16 | i_218_);
				return;
			}
			if (command == 6717) {
				j -= 3;
				int i_220_ = w[j];
				int i_221_ = w[j + 1];
				int i_222_ = w[j + 2];
				Interface var_kp = ida.a(i_220_ << 16 | i_221_, i_222_,
						(byte) 47);
				vo.c((byte) 31);
				nm var_nm = client.c(var_kp);
				ega.a(0, var_kp, var_nm.a(-1035661311), var_nm.q);
				return;
			}
		} else if (command < 6900) {
			if (command == 6800) {
				int i_223_ = w[--j];
				ww var_ww = hq.a.a(i_223_, -83);
				if (var_ww.q == null)
					q[h++] = "";
				else {
					q[h++] = var_ww.q;
					return;
				}
				return;
			}
			if (command == 6801) {
				int i_224_ = w[--j];
				ww var_ww = hq.a.a(i_224_, 108);
				w[j++] = var_ww.L;
				return;
			}
			if (command == 6802) {
				int i_225_ = w[--j];
				ww var_ww = hq.a.a(i_225_, 65);
				w[j++] = var_ww.e;
				return;
			}
			if (command == 6803) {
				int i_226_ = w[--j];
				ww var_ww = hq.a.a(i_226_, 16);
				w[j++] = var_ww.C;
				return;
			}
			if (command == 6804) {
				j -= 2;
				int i_227_ = w[j];
				int i_228_ = w[j + 1];
				vu var_vu = jba.b.a((byte) 6, i_228_);
				if (var_vu.a(0))
					q[h++] = hq.a.a(i_227_, 0).a(124, var_vu.m,
							i_228_);
				else {
					w[j++] = hq.a.a(i_227_, 123).a((byte) 26, i_228_,
							var_vu.h);
					return;
				}
				return;
			}
		} else if (command < 7000) {
			if (command == 6900) {
				w[j++] = id.b && !tb.a ? 1 : 0;
				return;
			}
			if (command == 6901) {
				w[j++] = rea.C;
				return;
			}
			if (command == 6902) {
				w[j++] = cga.w;
				return;
			}
			if (command == 6903) {
				w[j++] = tu.a;
				return;
			}
			if (command == 6904) {
				w[j++] = sd.l;
				return;
			}
			if (command == 6905) {
				String string = "";
				if (sa.t != null) {
					if (sa.t.hostName != null)
						string = (String) sa.t.hostName;
					else
						string = sda.a((byte) 82, sa.t.priority);
				}
				q[h++] = string;
				return;
			}
			if (command == 6906) {
				w[j++] = ei.b;
				return;
			}
			if (command == 6907) {
				w[j++] = pw.a;
				return;
			}
			if (command == 6908) {
				w[j++] = bk.c;
				return;
			}
			if (command == 6909) {
				w[j++] = ou.a ? 1 : 0;
				return;
			}
			if (command == 6910) {
				w[j++] = GameText.ub;
				return;
			}
			if (command == 6911) {
				w[j++] = re.h;
				return;
			}
			if (command == 6912) {
				w[j++] = hea.b;
				return;
			}
		} else if (command < 7100) {
			if (command == 7000) {
				int i_229_ = cs.g.c((byte) 109);
				w[j++] = cs.g.jb = on.performance;
				w[j++] = i_229_;
				ka.a((byte) -107);
				cs.g.a(nda.signlink, (byte) 77);
				NPCNode.k = false;
				return;
			}
			if (command == 7001) {
				cs.g.c(119);
				ka.a((byte) -9);
				cs.g.a(nda.signlink, (byte) 32);
				NPCNode.k = false;
				return;
			}
			if (command == 7002) {
				cs.g.a(-29520);
				ka.a((byte) -117);
				cs.g.a(nda.signlink, (byte) 90);
				NPCNode.k = false;
				return;
			}
			if (command == 7003) {
				cs.g.a(false);
				ka.a((byte) 77);
				cs.g.a(nda.signlink, (byte) 97);
				NPCNode.k = false;
				return;
			}
			if (command == 7004) {
				cs.g.a(true, (byte) -56);
				ka.a((byte) -113);
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
				if (cs.g.jb == 2)
					cs.g.Db = true;
				else {
					if (cs.g.jb == 1)
						cs.g.xb = true;
					else {
						if (cs.g.jb == 3)
							cs.g.nb = true;
						return;
					}
					return;
				}
				return;
			}
			if (command == 7007) {
				w[j++] = cs.g.X;
				return;
			}
			if (command == 7008) {
				if (on.performance == 0 && qm.heapSize < 96)
					w[j++] = 1;
				else {
					w[j++] = 4;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(command));
	}

	private static final void c(int i) {
		Interface var_kp = efa.a(-1018745488, i);
		if (var_kp != null) {
			int i_230_ = i >>> 16;
			Interface[] var_kps = mv.b[i_230_];
			if (var_kps == null) {
				Interface[] var_kps_231_ = aa.o[i_230_];
				int i_232_ = var_kps_231_.length;
				var_kps = mv.b[i_230_] = new Interface[i_232_];
				co.a(var_kps_231_, 0, var_kps, 0, var_kps_231_.length);
			}
			int i_233_;
			for (i_233_ = 0; i_233_ < var_kps.length; i_233_++) {
				if (var_kps[i_233_] == var_kp)
					break;
			}
			if (i_233_ < var_kps.length) {
				co.a(var_kps, i_233_ + 1, var_kps, i_233_, var_kps.length
						- i_233_ - 1);
				var_kps[var_kps.length - 1] = var_kp;
			}
		}
	}

	private static final void activateClientScriptCommand(it var_it, int i) {
		j = 0;
		h = 0;
		int i_234_ = -1;
		int[] is = var_it.C;
		int[] is_235_ = var_it.w;
		int command = -1;
		b = 0;
		try {
			int i_237_ = 0;
			for (;;) {
				if (++i_237_ > i)
					throw new RuntimeException("slow");
				command = is[++i_234_];
				if (command < 100) {
					if (command == 0)
						w[j++] = is_235_[i_234_];
					else if (command == 1) {
						int i_238_ = is_235_[i_234_];
						w[j++] = cp.e.k[i_238_];
					} else if (command == 2) {
						int i_239_ = is_235_[i_234_];
						cp.e.a(true, w[--j], i_239_);
					} else if (command == 3)
						q[h++] = var_it.G[i_234_];
					else if (command == 6)
						i_234_ += is_235_[i_234_];
					else if (command == 7) {
						j -= 2;
						if (w[j] != w[j + 1])
							i_234_ += is_235_[i_234_];
					} else if (command == 8) {
						j -= 2;
						if (w[j] == w[j + 1])
							i_234_ += is_235_[i_234_];
					} else if (command == 9) {
						j -= 2;
						if (w[j] < w[j + 1])
							i_234_ += is_235_[i_234_];
					} else if (command == 10) {
						j -= 2;
						if (w[j] > w[j + 1])
							i_234_ += is_235_[i_234_];
					} else if (command == 21) {
						if (b == 0)
							return;
						qf var_qf = qfs[--b];
						var_it = var_qf.b;
						is = var_it.C;
						is_235_ = var_it.w;
						i_234_ = var_qf.c;
						r = var_qf.f;
						v = var_qf.d;
					} else if (command == 25) {
						int i_240_ = is_235_[i_234_];
						w[j++] = cp.e.a(121, i_240_);
					} else if (command == 27) {
						int i_241_ = is_235_[i_234_];
						cp.e.c(i_241_, w[--j], 16383);
					} else if (command == 31) {
						j -= 2;
						if (w[j] <= w[j + 1])
							i_234_ += is_235_[i_234_];
					} else if (command == 32) {
						j -= 2;
						if (w[j] >= w[j + 1])
							i_234_ += is_235_[i_234_];
					} else if (command == 33)
						w[j++] = r[is_235_[i_234_]];
					else if (command == 34)
						r[is_235_[i_234_]] = w[--j];
					else if (command == 35)
						q[h++] = v[is_235_[i_234_]];
					else if (command == 36)
						v[is_235_[i_234_]] = q[--h];
					else if (command == 37) {
						int i_242_ = is_235_[i_234_];
						h -= i_242_;
						String string = GameOutPacket.a(q, i_242_, 4, h);
						q[h++] = string;
					} else if (command == 38)
						j--;
					else if (command == 39)
						h--;
					else if (command == 40) {
						int i_243_ = is_235_[i_234_];
						it var_it_244_ = jo.b(i_243_, true);
						if (var_it_244_ == null)
							throw new RuntimeException();
						int[] is_245_ = new int[var_it_244_.A];
						String[] strings = new String[var_it_244_.B];
						for (int i_246_ = 0; i_246_ < var_it_244_.y; i_246_++)
							is_245_[i_246_] = w[j - var_it_244_.y
									+ i_246_];
						for (int i_247_ = 0; i_247_ < var_it_244_.t; i_247_++)
							strings[i_247_] = q[h - var_it_244_.t
									+ i_247_];
						j -= var_it_244_.y;
						h -= var_it_244_.t;
						qf var_qf = new qf();
						var_qf.b = var_it;
						var_qf.c = i_234_;
						var_qf.f = r;
						var_qf.d = v;
						if (b >= qfs.length)
							throw new RuntimeException();
						qfs[b++] = var_qf;
						var_it = var_it_244_;
						is = var_it.C;
						is_235_ = var_it.w;
						i_234_ = -1;
						r = is_245_;
						v = strings;
					} else if (command == 42)
						w[j++] = rr.h[is_235_[i_234_]];
					else if (command == 43) {
						int i_248_ = is_235_[i_234_];
						rr.h[i_248_] = w[--j];
						ida.a((byte) 93, i_248_);
						dv.d |= jm.i[i_248_];
					} else if (command == 44) {
						int i_249_ = is_235_[i_234_] >> 16;
						int i_250_ = is_235_[i_234_] & 0xffff;
						int i_251_ = w[--j];
						if (i_251_ < 0 || i_251_ > 5000)
							throw new RuntimeException();
						m[i_249_] = i_251_;
						int i_252_ = -1;
						if (i_250_ == 105)
							i_252_ = 0;
						for (int i_253_ = 0; i_253_ < i_251_; i_253_++)
							e[i_249_][i_253_] = i_252_;
					} else if (command == 45) {
						int i_254_ = is_235_[i_234_];
						int i_255_ = w[--j];
						if (i_255_ < 0 || i_255_ >= m[i_254_])
							throw new RuntimeException();
						w[j++] = e[i_254_][i_255_];
					} else if (command == 46) {
						int i_256_ = is_235_[i_234_];
						j -= 2;
						int i_257_ = w[j];
						if (i_257_ < 0 || i_257_ >= m[i_256_])
							throw new RuntimeException();
						e[i_256_][i_257_] = w[j + 1];
					} else if (command == 47) {
						String string = client.ob[is_235_[i_234_]];
						if (string == null)
							string = "null";
						q[h++] = string;
					} else if (command == 48) {
						int i_258_ = is_235_[i_234_];
						client.ob[i_258_] = q[--h];
						sba.a(i_258_, (byte) -126);
					} else if (command == 51) {
						il var_il = var_it.z[is_235_[i_234_]];
						GameInPacketHandler var_hda = (GameInPacketHandler) var_il
								.a(-32748, (long) w[--j]);
						if (var_hda != null)
							i_234_ += var_hda.k;
					}
				} else {
					boolean bool;
					if (is_235_[i_234_] == 1)
						bool = true;
					else
						bool = false;
					if (command >= 100 && command < 5000)
						activateLowClientScriptCommand(command, bool);
					else {
						if (command < 5000 || command >= 10000)
							break;
						activateHighClientScriptCommand(command);
					}
				}
			}
			throw new IllegalStateException("Command: " + command);
		} catch (Exception exception) {
			if (var_it.I != null) {
				cba.a(4, false, "Clientscript error in: " + var_it.I);
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("Clientscript error in: ")
						.append(var_it.I).append("\n");
				for (int i_259_ = b - 1; i_259_ >= 0; i_259_--)
					stringbuffer.append("via: ")
							.append(qfs[i_259_].b.I).append("\n");
				stringbuffer.append("Op: ").append(command).append("\n");
				String string = exception.getMessage();
				if (string != null && string.length() > 0)
					stringbuffer.append("Message: ").append(string)
							.append("\n");
				cea.a(stringbuffer.toString(), -2, exception);
				ia.a(4, stringbuffer.toString());
			} else {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2: ").append(var_it.nodeID)
						.append(" ");
				for (int i_260_ = b - 1; i_260_ >= 0; i_260_--)
					stringbuffer.append("v: ")
							.append(qfs[i_260_].b.nodeID)
							.append(" ");
				stringbuffer.append("op: ").append(command);
				cea.a(stringbuffer.toString(), -2, exception);
			}
		}
	}

	private static final String d(int i) {
		long l = ((long) i + 11745L) * 86400000L;
		calendar.setTime(new Date(l));
		int i_261_ = calendar.get(5);
		int i_262_ = calendar.get(2);
		int i_263_ = calendar.get(1);
		return String.valueOf(i_261_) + "-" + monthNamesShort[i_262_] + "-"
				+ i_263_;
	}

	private static final void activateLowClientScriptCommand(int i, boolean bool) {
		if (i < 300) {
			if (i == 100) {
				j -= 3;
				int i_264_ = w[j];
				int i_265_ = w[j + 1];
				int i_266_ = w[j + 2];
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
				Interface var_kp = efa.a(-1018745488, w[--j]);
				var_kp.children = null;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 200) {
				j -= 2;
				int i_270_ = w[j];
				int i_271_ = w[j + 1];
				Interface var_kp = ida.a(i_270_, i_271_, (byte) 78);
				if (var_kp != null && i_271_ != -1) {
					w[j++] = 1;
					if (bool)
						interface_ = var_kp;
					else
						interface_1 = var_kp;
				} else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (i == 201) {
				int i_272_ = w[--j];
				Interface var_kp = efa.a(-1018745488, i_272_);
				if (var_kp != null) {
					w[j++] = 1;
					if (bool)
						interface_ = var_kp;
					else
						interface_1 = var_kp;
				} else {
					w[j++] = 0;
					return;
				}
				return;
			}
			if (i == 202) {
				int i_273_ = w[--j];
				c(i_273_);
				return;
			}
			if (i == 203) {
				int i_274_ = w[--j];
				b(i_274_);
				return;
			}
		} else if (i < 500) {
			if (i == 403) {
				j -= 2;
				int i_275_ = w[j];
				int i_276_ = w[j + 1];
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
				int i_279_ = w[j];
				int i_280_ = w[j + 1];
				up.thisPlayer.playerDef.a(i_280_, i_279_, 31622);
				return;
			}
			if (i == 410) {
				boolean bool_281_ = w[--j] != 0;
				up.thisPlayer.playerDef.a(bool_281_, -23851);
				return;
			}
			if (i == 411) {
				j -= 2;
				int i_282_ = w[j];
				int i_283_ = w[j + 1];
				up.thisPlayer.playerDef.a(i_283_, i_282_,
						laa.itemDefLoader, true);
				return;
			}
		} else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
			Interface var_kp;
			if (i >= 2000) {
				i -= 1000;
				var_kp = efa.a(-1018745488, w[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			if (i == 1000) {
				j -= 4;
				var_kp.hc = w[j];
				var_kp.Wc = w[j + 1];
				int i_284_ = w[j + 2];
				if (i_284_ < 0)
					i_284_ = 0;
				else if (i_284_ > 5)
					i_284_ = 5;
				int i_285_ = w[j + 3];
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
				var_kp.width = w[j];
				var_kp.height = w[j + 1];
				var_kp.n = 0;
				var_kp.dc = 0;
				int i_286_ = w[j + 2];
				if (i_286_ < 0)
					i_286_ = 0;
				else if (i_286_ > 4)
					i_286_ = 4;
				int i_287_ = w[j + 3];
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
				boolean bool_288_ = w[--j] == 1;
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
				var_kp.Rb = w[j];
				var_kp.Uc = w[j + 1];
				tn.a(var_kp, 1023);
				qd.a((byte) -121, var_kp);
				if (var_kp.type == 0)
					Class_kf.a(var_kp, false, false);
				return;
			}
			if (i == 1005) {
				var_kp.vc = w[--j] == 1;
				return;
			}
		} else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
			Interface var_kp;
			if (i >= 2000) {
				i -= 1000;
				var_kp = efa.a(-1018745488, w[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			if (i == 1100) {
				j -= 2;
				var_kp.hScroll = w[j];
				if (var_kp.hScroll > var_kp.maxHScroll
						- var_kp.minHScroll)
					var_kp.hScroll = var_kp.maxHScroll
							- var_kp.minHScroll;
				if (var_kp.hScroll < 0)
					var_kp.hScroll = 0;
				var_kp.vScroll = w[j + 1];
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
				var_kp.textColor = w[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					kba.a((byte) -43, var_kp.interfaceID);
				return;
			}
			if (i == 1102) {
				var_kp.c = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1103) {
				var_kp.mb = w[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1104) {
				var_kp.X = w[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1105) {
				int i_289_ = w[--j];
				if (var_kp.textureID != i_289_) {
					var_kp.textureID = i_289_;
					tn.a(var_kp, 1023);
				}
				if (var_kp.itemIndex == -1)
					ji.a(var_kp.interfaceID, true);
				return;
			}
			if (i == 1106) {
				var_kp.db = w[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1107) {
				var_kp.jd = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1108) {
				var_kp.modelType = 1;
				var_kp.modelID = w[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1109) {
				j -= 6;
				var_kp.Ec = w[j];
				var_kp.wc = w[j + 1];
				var_kp.modelRotationX = w[j + 2];
				var_kp.modelRotationY = w[j + 3];
				var_kp.modelRotationZ = w[j + 4];
				var_kp.modelZoom = w[j + 5];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1) {
					bq.a(var_kp.interfaceID, -23477);
					oga.a(var_kp.interfaceID, 112);
				}
				return;
			}
			if (i == 1110) {
				int i_290_ = w[--j];
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
				var_kp.w = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1112) {
				String string = q[--h];
				if (!string.equals(var_kp.text)) {
					var_kp.text = string;
					tn.a(var_kp, 1023);
				}
				if (var_kp.itemIndex == -1)
					pga.a(var_kp.interfaceID, true);
				return;
			}
			if (i == 1113) {
				var_kp.Ab = w[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					baa.a((byte) 74, var_kp.interfaceID);
				return;
			}
			if (i == 1114) {
				j -= 3;
				var_kp.Fb = w[j];
				var_kp.Z = w[j + 1];
				var_kp.Db = w[j + 2];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1115) {
				var_kp.isInventoryInterface = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1116) {
				var_kp.borderThickness = w[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1117) {
				var_kp.shadowColor = w[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1118) {
				var_kp.flippedVertically = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1119) {
				var_kp.flippedHorizontally = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1120) {
				j -= 2;
				var_kp.maxHScroll = w[j];
				var_kp.maxVScroll = w[j + 1];
				tn.a(var_kp, 1023);
				if (var_kp.type == 0)
					Class_kf.a(var_kp, false, false);
				return;
			}
			if (i == 1122) {
				var_kp.xb = w[--j] == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1123) {
				var_kp.modelZoom = w[--j];
				tn.a(var_kp, 1023);
				if (var_kp.itemIndex == -1)
					bq.a(var_kp.interfaceID, -23477);
				return;
			}
			if (i == 1124) {
				int i_291_ = w[--j];
				var_kp.oc = i_291_ == 1;
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1125) {
				j -= 2;
				var_kp.vb = w[j];
				var_kp.H = w[j + 1];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1126) {
				var_kp.r = w[--j];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1127) {
				j -= 2;
				int i_292_ = w[j];
				int i_293_ = w[j + 1];
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
				int i_294_ = w[--j];
				String string = q[--h];
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
				var_kp = efa.a(-1018745488, w[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			tn.a(var_kp, 1023);
			if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212
					|| i == 1213) {
				j -= 2;
				int i_295_ = w[j];
				int i_296_ = w[j + 1];
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
				var_kp.modelID = w[--j];
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
				var_kp.modelID = w[--j];
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1204) {
				var_kp.modelType = 5;
				var_kp.modelID = w[--j];
				if (var_kp.itemIndex == -1)
					eba.a(-1, var_kp.interfaceID);
				return;
			}
			if (i == 1206) {
				j -= 4;
				var_kp.yc = w[j];
				var_kp.y = w[j + 1];
				var_kp.D = w[j + 2];
				var_kp.Tc = w[j + 3];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1207) {
				j -= 2;
				var_kp.gc = w[j];
				var_kp.Zb = w[j + 1];
				tn.a(var_kp, 1023);
				return;
			}
			if (i == 1210) {
				j -= 4;
				var_kp.modelID = w[j];
				var_kp.U = w[j + 1];
				if (w[j + 2] == 1)
					var_kp.modelType = 9;
				else
					var_kp.modelType = 8;
				if (w[j + 3] == 1)
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
				var_kp = efa.a(-1018745488, w[--j]);
			} else
				var_kp = bool ? interface_ : interface_1;
			if (i == 1300) {
				int i_297_ = w[--j] - 1;
				if (i_297_ < 0 || i_297_ > 9)
					h--;
				else {
					var_kp.a(i_297_, q[--h], -114);
					return;
				}
				return;
			}
			if (i == 1301) {
				j -= 2;
				int i_298_ = w[j];
				int i_299_ = w[j + 1];
				if (i_298_ == -1 && i_299_ == -1)
					var_kp.fd = null;
				else {
					var_kp.fd = ida.a(i_298_, i_299_, (byte) 45);
					return;
				}
				return;
			}
			if (i == 1302) {
				int i_300_ = w[--j];
				if (i_300_ == ao.k || i_300_ == qu.b || i_300_ == nk.a) {
					var_kp.od = i_300_;
					return;
				}
				return;
			}
			if (i == 1303) {
				var_kp.x = w[--j];
				return;
			}
			if (i == 1304) {
				var_kp.lb = w[--j];
				return;
			}
			if (i == 1305) {
				var_kp.itemName = q[--h];
				return;
			}
			if (i == 1306) {
				var_kp.G = q[--h];
				return;
			}
			if (i == 1307) {
				var_kp.itemActions = null;
				return;
			}
			if (i == 1308) {
				var_kp.cc = w[--j];
				var_kp.tb = w[--j];
				return;
			}
			if (i == 1309) {
				int i_301_ = w[--j];
				int i_302_ = w[--j];
				if (i_302_ >= 1 && i_302_ <= 10)
					var_kp.a(0, i_302_ - 1, i_301_);
				return;
			}
			if (i == 1310) {
				var_kp.bd = q[--h];
				return;
			}
			if (i == 1311) {
				var_kp.a = w[--j];
				return;
			}
			if (i == 1312 || i == 1313) {
				int i_303_;
				int i_304_;
				int i_305_;
				if (i == 1312) {
					j -= 3;
					i_303_ = w[j] - 1;
					i_304_ = w[j + 1];
					i_305_ = w[j + 2];
					if (i_303_ < 0 || i_303_ > 9)
						throw new RuntimeException("IOR13121313");
				} else {
					j -= 2;
					i_303_ = 10;
					i_304_ = w[j];
					i_305_ = w[j + 1];
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
				var_kp.Mc = w[--j];
				return;
			}
		} else {
			if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
				Interface var_kp;
				if (i >= 2000) {
					i -= 1000;
					var_kp = efa.a(-1018745488, w[--j]);
				} else
					var_kp = bool ? interface_ : interface_1;
				if (i == 1499)
					var_kp.a(0);
				else {
					String string = q[--h];
					int[] is = null;
					if (string.length() > 0
							&& string.charAt(string.length() - 1) == 'Y') {
						int i_307_ = w[--j];
						if (i_307_ > 0) {
							is = new int[i_307_];
							while (i_307_-- > 0)
								is[i_307_] = w[--j];
						}
						string = string.substring(0, string.length() - 1);
					}
					Object[] objects = new Object[string.length() + 1];
					for (int i_308_ = objects.length - 1; i_308_ >= 1; i_308_--) {
						if (string.charAt(i_308_ - 1) == 's')
							objects[i_308_] = q[--h];
						else
							objects[i_308_] = new Integer(w[--j]);
					}
					int i_309_ = w[--j];
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
					w[j++] = var_kp.locX;
					return;
				}
				if (i == 1501) {
					w[j++] = var_kp.locY;
					return;
				}
				if (i == 1502) {
					w[j++] = var_kp.minHScroll;
					return;
				}
				if (i == 1503) {
					w[j++] = var_kp.minVScroll;
					return;
				}
				if (i == 1504) {
					w[j++] = var_kp.hidden ? 1 : 0;
					return;
				}
				if (i == 1505) {
					w[j++] = var_kp.parentID;
					return;
				}
				if (i == 1506) {
					Interface var_kp_310_ = bca.a((byte) 126, var_kp);
					w[j++] = var_kp_310_ == null ? -1
							: var_kp_310_.interfaceID;
					return;
				}
			} else if (i < 1700) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1600) {
					w[j++] = var_kp.hScroll;
					return;
				}
				if (i == 1601) {
					w[j++] = var_kp.vScroll;
					return;
				}
				if (i == 1602) {
					q[h++] = var_kp.text;
					return;
				}
				if (i == 1603) {
					w[j++] = var_kp.maxHScroll;
					return;
				}
				if (i == 1604) {
					w[j++] = var_kp.maxVScroll;
					return;
				}
				if (i == 1605) {
					w[j++] = var_kp.modelZoom;
					return;
				}
				if (i == 1606) {
					w[j++] = var_kp.modelRotationX;
					return;
				}
				if (i == 1607) {
					w[j++] = var_kp.modelRotationZ;
					return;
				}
				if (i == 1608) {
					w[j++] = var_kp.modelRotationY;
					return;
				}
				if (i == 1609) {
					w[j++] = var_kp.mb;
					return;
				}
				if (i == 1610) {
					w[j++] = var_kp.Ec;
					return;
				}
				if (i == 1611) {
					w[j++] = var_kp.wc;
					return;
				}
				if (i == 1612) {
					w[j++] = var_kp.textureID;
					return;
				}
				if (i == 1613) {
					int i_311_ = w[--j];
					vu var_vu = jba.b.a((byte) 6, i_311_);
					if (var_vu.a(0))
						q[h++] = var_kp.a(var_vu.m, i_311_, 4095);
					else {
						w[j++] = var_kp.b(121, var_vu.h, i_311_);
						return;
					}
					return;
				}
				if (i == 1614) {
					w[j++] = var_kp.db;
					return;
				}
			} else if (i < 1800) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1700) {
					w[j++] = var_kp.itemID;
					return;
				}
				if (i == 1701) {
					if (var_kp.itemID != -1)
						w[j++] = var_kp.itemStackSize;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 1702) {
					w[j++] = var_kp.itemIndex;
					return;
				}
			} else if (i < 1900) {
				Interface var_kp = bool ? interface_ : interface_1;
				if (i == 1800) {
					w[j++] = client.c(var_kp).a(-1035661311);
					return;
				}
				if (i == 1801) {
					int i_312_ = w[--j];
					i_312_--;
					if (var_kp.itemActions == null
							|| i_312_ >= var_kp.itemActions.length
							|| var_kp.itemActions[i_312_] == null)
						q[h++] = "";
					else {
						q[h++] = var_kp.itemActions[i_312_];
						return;
					}
					return;
				}
				if (i == 1802) {
					if (var_kp.itemName == null)
						q[h++] = "";
					else {
						q[h++] = var_kp.itemName;
						return;
					}
					return;
				}
			} else if (i < 2000 || i >= 2900 && i < 3000) {
				Interface var_kp;
				if (i >= 2000) {
					var_kp = efa.a(-1018745488, w[--j]);
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
				Interface var_kp = efa.a(-1018745488, w[--j]);
				if (i == 2500) {
					w[j++] = var_kp.locX;
					return;
				}
				if (i == 2501) {
					w[j++] = var_kp.locY;
					return;
				}
				if (i == 2502) {
					w[j++] = var_kp.minHScroll;
					return;
				}
				if (i == 2503) {
					w[j++] = var_kp.minVScroll;
					return;
				}
				if (i == 2504) {
					w[j++] = var_kp.hidden ? 1 : 0;
					return;
				}
				if (i == 2505) {
					w[j++] = var_kp.parentID;
					return;
				}
				if (i == 1506) {
					Interface var_kp_313_ = bca.a((byte) 127, var_kp);
					w[j++] = var_kp_313_ == null ? -1
							: var_kp_313_.interfaceID;
					return;
				}
			} else if (i < 2700) {
				Interface var_kp = efa.a(-1018745488, w[--j]);
				if (i == 2600) {
					w[j++] = var_kp.hScroll;
					return;
				}
				if (i == 2601) {
					w[j++] = var_kp.vScroll;
					return;
				}
				if (i == 2602) {
					q[h++] = var_kp.text;
					return;
				}
				if (i == 2603) {
					w[j++] = var_kp.maxHScroll;
					return;
				}
				if (i == 2604) {
					w[j++] = var_kp.maxVScroll;
					return;
				}
				if (i == 2605) {
					w[j++] = var_kp.modelZoom;
					return;
				}
				if (i == 2606) {
					w[j++] = var_kp.modelRotationX;
					return;
				}
				if (i == 2607) {
					w[j++] = var_kp.modelRotationZ;
					return;
				}
				if (i == 2608) {
					w[j++] = var_kp.modelRotationY;
					return;
				}
				if (i == 2609) {
					w[j++] = var_kp.mb;
					return;
				}
				if (i == 2610) {
					w[j++] = var_kp.Ec;
					return;
				}
				if (i == 2611) {
					w[j++] = var_kp.wc;
					return;
				}
				if (i == 2612) {
					w[j++] = var_kp.textureID;
					return;
				}
				if (i == 2613) {
					w[j++] = var_kp.db;
					return;
				}
			} else if (i < 2800) {
				if (i == 2700) {
					Interface var_kp = efa.a(-1018745488, w[--j]);
					w[j++] = var_kp.itemID;
					return;
				}
				if (i == 2701) {
					Interface var_kp = efa.a(-1018745488, w[--j]);
					if (var_kp.itemID != -1)
						w[j++] = var_kp.itemStackSize;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 2702) {
					int i_314_ = w[--j];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_314_);
					if (var_tt != null)
						w[j++] = 1;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 2703) {
					Interface var_kp = efa.a(-1018745488, w[--j]);
					if (var_kp.children == null)
						w[j++] = 0;
					else {
						int i_315_ = var_kp.children.length;
						for (int i_316_ = 0; i_316_ < var_kp.children.length; i_316_++) {
							if (var_kp.children[i_316_] == null) {
								i_315_ = i_316_;
								break;
							}
						}
						w[j++] = i_315_;
						return;
					}
					return;
				}
				if (i == 2704 || i == 2705) {
					j -= 2;
					int i_317_ = w[j];
					int i_318_ = w[j + 1];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_317_);
					if (var_tt != null && var_tt.l == i_318_)
						w[j++] = 1;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
			} else if (i < 2900) {
				Interface var_kp = efa.a(-1018745488, w[--j]);
				if (i == 2800) {
					w[j++] = client.c(var_kp).a(-1035661311);
					return;
				}
				if (i == 2801) {
					int i_319_ = w[--j];
					i_319_--;
					if (var_kp.itemActions == null
							|| i_319_ >= var_kp.itemActions.length
							|| var_kp.itemActions[i_319_] == null)
						q[h++] = "";
					else {
						q[h++] = var_kp.itemActions[i_319_];
						return;
					}
					return;
				}
				if (i == 2802) {
					if (var_kp.itemName == null)
						q[h++] = "";
					else {
						q[h++] = var_kp.itemName;
						return;
					}
					return;
				}
			} else if (i < 3200) {
				if (i == 3100) {
					String string = q[--h];
					mm.a(-93, string);
					return;
				}
				if (i == 3101) {
					j -= 2;
					caa.a(w[j + 1], up.thisPlayer, (byte) -123, w[j]);
					return;
				}
				if (i == 3103) {
					jt.a(true, -1);
					return;
				}
				if (i == 3104) {
					String string = q[--h];
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
					String string = q[--h];
					a++;
					tba var_tba = jga.sendGameOutPacket(cg.w, pca.isaac, (byte) 90);
					var_tba.loginStream.writeByte(string.length() + 1, (byte) -122);
					var_tba.loginStream.writeString(string, -57);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3106) {
                    System.out.println("[ClientScriptHandler] kd");
					String string = q[--h];
					s++;
					tba var_tba = jga
							.sendGameOutPacket(qe.c, pca.isaac, (byte) -68);
					var_tba.loginStream.writeByte(string.length() + 1, (byte) -126);
					var_tba.loginStream.writeString(string, -29);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3107) {
					int i_321_ = w[--j];
					String string = q[--h];
					ge.a(-8, i_321_, string);
					return;
				}
				if (i == 3108) {
					j -= 3;
					int i_322_ = w[j];
					int i_323_ = w[j + 1];
					int i_324_ = w[j + 2];
					Interface var_kp = efa.a(-1018745488, i_324_);
					wf.a(i_322_, (byte) -104, var_kp, i_323_);
					return;
				}
				if (i == 3109) {
					j -= 2;
					int i_325_ = w[j];
					int i_326_ = w[j + 1];
					Interface var_kp = bool ? interface_ : interface_1;
					wf.a(i_325_, (byte) -119, var_kp, i_326_);
					return;
				}
				if (i == 3110) {
					int i_327_ = w[--j];
					g++;
					tba var_tba = jga
							.sendGameOutPacket(td.i, pca.isaac, (byte) -56);
					var_tba.loginStream.writeShort(i_327_, 13469);
					ud.a(var_tba, (byte) -36);
					return;
				}
				if (i == 3111) {
					j -= 2;
					int i_328_ = w[j];
					int i_329_ = w[j + 1];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_328_);
					if (var_tt != null)
						vm.a(true, var_tt.l != i_329_, false, var_tt);
					jr.a(true, 3, i_328_, (byte) 126, i_329_);
					return;
				}
				if (i == 3112) {
					j--;
					int i_330_ = w[j];
					tt var_tt = (tt) ida.l.a(-32748, (long) i_330_);
					if (var_tt != null && var_tt.k == 3)
						vm.a(true, true, false, var_tt);
					return;
				}
				if (i == 3113) {
					rm.a(q[--h], true);
					return;
				}
				if (i == 3114) {
					j -= 2;
					int i_331_ = w[j];
					int i_332_ = w[j + 1];
					String string = q[--h];
					oba.a("", string, i_331_, -1, "", i_332_, "");
					return;
				}
				if (i == 3115) {
					j -= 11;
					ct[] var_cts = dh.b((byte) 87);
					rc[] var_rcs = dg.b(98);
					js.a(w[j + 2], w[j + 4], var_rcs[w[j + 1]], -128,
							var_cts[w[j]], w[j + 10], w[j + 7], w[j + 5],
							w[j + 8], w[j + 3], w[j + 9], w[j + 6]);
					return;
				}
			} else if (i < 3300) {
				if (i == 3200) {
					j -= 3;
					io.a(255, w[j], w[j + 1], w[j + 2], 29830);
					return;
				}
				if (i == 3201) {
					ao.a(w[--j], 255, 50, (byte) -123);
					return;
				}
				if (i == 3202) {
					j -= 2;
					eba.a(6567, 255, w[j + 1], w[j]);
					return;
				}
				if (i == 3203) {
					j -= 4;
					io.a(w[j + 3], w[j], w[j + 1], w[j + 2], 29830);
					return;
				}
				if (i == 3204) {
					j -= 3;
					ao.a(w[j], w[j + 1], w[j + 2], (byte) -123);
					return;
				}
				if (i == 3205) {
					j -= 3;
					eba.a(6567, w[j + 2], w[j + 1], w[j]);
					return;
				}
				if (i == 3206) {
					j -= 4;
					oh.a(w[j], w[j + 1], w[j + 2], false, w[j + 3], false);
					return;
				}
				if (i == 3207) {
					j -= 4;
					oh.a(w[j], w[j + 1], w[j + 2], false, w[j + 3], true);
					return;
				}
			} else if (i < 3400) {
				if (i == 3300) {
					w[j++] = pm.currentTimedTicks;
					return;
				}
				if (i == 3301) {
					j -= 2;
					int i_333_ = w[j];
					int i_334_ = w[j + 1];
					w[j++] = kg.a(i_334_, false, i_333_, true);
					return;
				}
				if (i == 3302) {
					j -= 2;
					int i_335_ = w[j];
					int i_336_ = w[j + 1];
					w[j++] = Login.a(i_335_, i_336_, (byte) -52, false);
					return;
				}
				if (i == 3303) {
					j -= 2;
					int i_337_ = w[j];
					int i_338_ = w[j + 1];
					w[j++] = an.a(0, false, i_337_, i_338_);
					return;
				}
				if (i == 3304) {
					int i_339_ = w[--j];
					w[j++] = vd.L.a(-88, i_339_).s;
					return;
				}
				if (i == 3305) {
					int i_340_ = w[--j];
					w[j++] = iu.k[i_340_];
					return;
				}
				if (i == 3306) {
					int i_341_ = w[--j];
					w[j++] = de.c[i_341_];
					return;
				}
				if (i == 3307) {
					int i_342_ = w[--j];
					w[j++] = mfa.j[i_342_];
					return;
				}
				if (i == 3308) {
					int i_343_ = up.thisPlayer.height;
					int i_344_ = (up.thisPlayer.locX >> 9)
							+ bfa.thisPlayersRegionX;
					int i_345_ = (up.thisPlayer.locY >> 9)
							+ BytesParser.thisPlayersRegionY;
					w[j++] = (i_343_ << 28) + (i_344_ << 14) + i_345_;
					return;
				}
				if (i == 3309) {
					int i_346_ = w[--j];
					w[j++] = i_346_ >> 14 & 0x3fff;
					return;
				}
				if (i == 3310) {
					int i_347_ = w[--j];
					w[j++] = i_347_ >> 28;
					return;
				}
				if (i == 3311) {
					int i_348_ = w[--j];
					w[j++] = i_348_ & 0x3fff;
					return;
				}
				if (i == 3312) {
					w[j++] = rba.d ? 1 : 0;
					return;
				}
				if (i == 3313) {
					j -= 2;
					int i_349_ = w[j];
					int i_350_ = w[j + 1];
					w[j++] = kg.a(i_350_, true, i_349_, true);
					return;
				}
				if (i == 3314) {
					j -= 2;
					int i_351_ = w[j];
					int i_352_ = w[j + 1];
					w[j++] = Login.a(i_351_, i_352_, (byte) 124, true);
					return;
				}
				if (i == 3315) {
					j -= 2;
					int i_353_ = w[j];
					int i_354_ = w[j + 1];
					w[j++] = an.a(0, true, i_353_, i_354_);
					return;
				}
				if (i == 3316) {
					if (hv.thisPlayersRights >= 2)
						w[j++] = hv.thisPlayersRights;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3317) {
					w[j++] = dj.b;
					return;
				}
				if (i == 3318) {
					w[j++] = gm.world.worldID;
					return;
				}
				if (i == 3321) {
					w[j++] = jm.j;
					return;
				}
				if (i == 3322) {
					w[j++] = Class_hb.v;
					return;
				}
				if (i == 3323) {
					if (qaa.gb >= 5 && qaa.gb <= 9)
						w[j++] = 1;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3324) {
					if (qaa.gb >= 5 && qaa.gb <= 9)
						w[j++] = qaa.gb;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3325) {
					w[j++] = Class_gb.h ? 1 : 0;
					return;
				}
				if (i == 3326) {
					w[j++] = up.thisPlayer.combatLevel;
					return;
				}
				if (i == 3327) {
					w[j++] = up.thisPlayer.playerDef.isMale ? 1
							: 0;
					return;
				}
				if (i == 3329) {
					w[j++] = uda.d ? 1 : 0;
					return;
				}
				if (i == 3330) {
					int i_355_ = w[--j];
					w[j++] = iu.a(1, i_355_, false);
					return;
				}
				if (i == 3331) {
					j -= 2;
					int i_356_ = w[j];
					int i_357_ = w[j + 1];
					w[j++] = ik.a(false, false, i_357_, i_356_, true);
					return;
				}
				if (i == 3332) {
					j -= 2;
					int i_358_ = w[j];
					int i_359_ = w[j + 1];
					w[j++] = ik.a(false, true, i_359_, i_358_, true);
					return;
				}
				if (i == 3333) {
					w[j++] = pda.y;
					return;
				}
				if (i == 3335) {
					w[j++] = cba.languageID;
					return;
				}
				if (i == 3336) {
					j -= 4;
					int i_360_ = w[j];
					int i_361_ = w[j + 1];
					int i_362_ = w[j + 2];
					int i_363_ = w[j + 3];
					i_360_ += i_361_ << 14;
					i_360_ += i_362_ << 28;
					i_360_ += i_363_;
					w[j++] = i_360_;
					return;
				}
				if (i == 3337) {
					w[j++] = hl.affId;
					return;
				}
				if (i == 3338) {
					w[j++] = ur.a(-116);
					return;
				}
				if (i == 3339) {
					w[j++] = uq.M ? 1 : 0;
					return;
				}
				if (i == 3340) {
					w[j++] = tw.r ? 1 : 0;
					return;
				}
				if (i == 3341) {
					w[j++] = Class_rf.f ? 1 : 0;
					return;
				}
				if (i == 3342) {
					w[j++] = Class_md.e.d(2000);
					return;
				}
				if (i == 3343) {
					w[j++] = Class_md.e.b(100);
					return;
				}
				if (i == 3344) {
					q[h++] = Class_db.a((byte) -95);
					return;
				}
				if (i == 3345) {
					q[h++] = up.e(58);
					return;
				}
				if (i == 3346) {
					w[j++] = wh.i(4);
					return;
				}
				if (i == 3347) {
					w[j++] = jk.m;
					return;
				}
			} else if (i < 3500) {
				if (i == 3400) {
					j -= 2;
					int i_364_ = w[j];
					int i_365_ = w[j + 1];
					ss var_ss = tv.e.a(i_364_, -8727);
					q[h++] = var_ss.d(-24908, i_365_);
					return;
				}
				if (i == 3408) {
					j -= 4;
					int i_366_ = w[j];
					int i_367_ = w[j + 1];
					int i_368_ = w[j + 2];
					int i_369_ = w[j + 3];
					ss var_ss = tv.e.a(i_368_, -8727);
					if (var_ss.s != i_366_ || var_ss.b != i_367_)
						throw new RuntimeException("C3408-1");
					if (i_367_ == 115)
						q[h++] = var_ss.d(-24908, i_369_);
					else {
						w[j++] = var_ss.c(i_369_, 438412161);
						return;
					}
					return;
				}
				if (i == 3409) {
					j -= 3;
					int i_370_ = w[j];
					int i_371_ = w[j + 1];
					int i_372_ = w[j + 2];
					if (i_371_ == -1)
						throw new RuntimeException("C3409-2");
					ss var_ss = tv.e.a(i_371_, -8727);
					if (var_ss.b != i_370_)
						throw new RuntimeException("C3409-1");
					w[j++] = var_ss.b(i_372_, -110) ? 1 : 0;
					return;
				}
				if (i == 3410) {
					int i_373_ = w[--j];
					String string = q[--h];
					if (i_373_ == -1)
						throw new RuntimeException("C3410-2");
					ss var_ss = tv.e.a(i_373_, -8727);
					if (var_ss.b != 's')
						throw new RuntimeException("C3410-1");
					w[j++] = var_ss.a(string, 5) ? 1 : 0;
					return;
				}
				if (i == 3411) {
					int i_374_ = w[--j];
					ss var_ss = tv.e.a(i_374_, -8727);
					w[j++] = var_ss.e.a((byte) -26);
					return;
				}
			} else if (i < 3700) {
				if (i == 3600) {
					if (Class_fd.L == 0)
						w[j++] = -2;
					else {
						if (Class_fd.L == 1)
							w[j++] = -1;
						else {
							w[j++] = rba.l;
							return;
						}
						return;
					}
					return;
				}
				if (i == 3601) {
					int i_375_ = w[--j];
					if (Class_fd.L == 2 && i_375_ < rba.l) {
						q[h++] = lfa.f[i_375_];
						if (nj.l[i_375_] != null)
							q[h++] = nj.l[i_375_];
						else
							q[h++] = "";
					} else {
						q[h++] = "";
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3602) {
					int i_376_ = w[--j];
					if (Class_fd.L == 2 && i_376_ < rba.l)
						w[j++] = dt.Jb[i_376_];
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3603) {
					int i_377_ = w[--j];
					if (Class_fd.L == 2 && i_377_ < rba.l)
						w[j++] = ObjectDef.rb[i_377_];
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3604) {
					String string = q[--h];
					int i_378_ = w[--j];
					or.a(i_378_, (byte) -9, string);
					return;
				}
				if (i == 3605) {
					String string = q[--h];
					rh.a(-108, string);
					return;
				}
				if (i == 3606) {
					String string = q[--h];
					hk.a(string, 1);
					return;
				}
				if (i == 3607) {
					String string = q[--h];
					Class_nd.a(false, string, -127);
					return;
				}
				if (i == 3608) {
					String string = q[--h];
					dk.a(1, string);
					return;
				}
				if (i == 3609) {
					String string = q[--h];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					w[j++] = wea.a(string, -128) ? 1 : 0;
					return;
				}
				if (i == 3610) {
					int i_379_ = w[--j];
					if (Class_fd.L == 2 && i_379_ < rba.l)
						q[h++] = di.f[i_379_];
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3611) {
					if (rc.d != null)
						q[h++] = rg.a((byte) 98, rc.d);
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3612) {
					if (rc.d != null)
						w[j++] = wj.clanChatPlayerCount;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3613) {
					int i_380_ = w[--j];
					if (rc.d != null && i_380_ < wj.clanChatPlayerCount)
						q[h++] = n.j[i_380_].a;
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3614) {
					int i_381_ = w[--j];
					if (rc.d != null && i_381_ < wj.clanChatPlayerCount)
						w[j++] = n.j[i_381_].n;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3615) {
					int i_382_ = w[--j];
					if (rc.d != null && i_382_ < wj.clanChatPlayerCount)
						w[j++] = n.j[i_382_].g;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3616) {
					w[j++] = ISAAC.a;
					return;
				}
				if (i == 3617) {
					String string = q[--h];
					sea.a((byte) 78, string);
					return;
				}
				if (i == 3618) {
					w[j++] = cfa.b;
					return;
				}
				if (i == 3619) {
					String string = q[--h];
					iaa.a(string, (byte) -109);
					return;
				}
				if (i == 3620) {
					ItemDef.a((byte) 69);
					return;
				}
				if (i == 3621) {
					if (Class_fd.L == 0)
						w[j++] = -1;
					else {
						w[j++] = dba.l;
						return;
					}
					return;
				}
				if (i == 3622) {
					int i_383_ = w[--j];
					if (Class_fd.L != 0 && i_383_ < dba.l) {
						q[h++] = nh.l[i_383_];
						if (mba.a[i_383_] != null)
							q[h++] = mba.a[i_383_];
						else
							q[h++] = "";
					} else {
						q[h++] = "";
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3623) {
					String string = q[--h];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					w[j++] = qf.a(string, -99) ? 1 : 0;
					return;
				}
				if (i == 3624) {
					int i_384_ = w[--j];
					if (n.j != null
							&& i_384_ < wj.clanChatPlayerCount
							&& n.j[i_384_].h
									.equalsIgnoreCase(up.thisPlayer.displayName))
						w[j++] = 1;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3625) {
					if (Class_ob.r != null)
						q[h++] = Class_ob.r;
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3626) {
					int i_385_ = w[--j];
					if (rc.d != null && i_385_ < wj.clanChatPlayerCount)
						q[h++] = n.j[i_385_].d;
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3627) {
					int i_386_ = w[--j];
					if (Class_fd.L == 2 && i_386_ >= 0 && i_386_ < rba.l)
						w[j++] = df.f[i_386_] ? 1 : 0;
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 3628) {
					String string = q[--h];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					w[j++] = us.a(1, string);
					return;
				}
				if (i == 3629) {
					w[j++] = ea.thisCountry;
					return;
				}
				if (i == 3630) {
					String string = q[--h];
					Class_nd.a(true, string, -123);
					return;
				}
				if (i == 3631) {
					int i_387_ = w[--j];
					w[j++] = eq.M[i_387_] ? 1 : 0;
					return;
				}
				if (i == 3632) {
					int i_388_ = w[--j];
					if (rc.d != null && i_388_ < wj.clanChatPlayerCount)
						q[h++] = n.j[i_388_].h;
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 3633) {
					int i_389_ = w[--j];
					if (Class_fd.L != 0 && i_389_ < dba.l)
						q[h++] = GameOutPacket.d[i_389_];
					else {
						q[h++] = "";
						return;
					}
					return;
				}
			} else if (i < 4000) {
				if (i == 3903) {
					int i_390_ = w[--j];
					w[j++] = Interface.grandExchangeItems[i_390_].a(false);
					return;
				}
				if (i == 3904) {
					int i_391_ = w[--j];
					w[j++] = Interface.grandExchangeItems[i_391_].itemID;
					return;
				}
				if (i == 3905) {
					int i_392_ = w[--j];
					w[j++] = Interface.grandExchangeItems[i_392_].f;
					return;
				}
				if (i == 3906) {
					int i_393_ = w[--j];
					w[j++] = Interface.grandExchangeItems[i_393_].total;
					return;
				}
				if (i == 3907) {
					int i_394_ = w[--j];
					w[j++] = Interface.grandExchangeItems[i_394_].transferred;
					return;
				}
				if (i == 3908) {
					int i_395_ = w[--j];
					w[j++] = Interface.grandExchangeItems[i_395_].spent;
					return;
				}
				if (i == 3910) {
					int i_396_ = w[--j];
					int i_397_ = Interface.grandExchangeItems[i_396_].a(2183);
					w[j++] = i_397_ == 0 ? 1 : 0;
					return;
				}
				if (i == 3911) {
					int i_398_ = w[--j];
					int i_399_ = Interface.grandExchangeItems[i_398_].a(2183);
					w[j++] = i_399_ == 2 ? 1 : 0;
					return;
				}
				if (i == 3912) {
					int i_400_ = w[--j];
					int i_401_ = Interface.grandExchangeItems[i_400_].a(2183);
					w[j++] = i_401_ == 5 ? 1 : 0;
					return;
				}
				if (i == 3913) {
					int i_402_ = w[--j];
					int i_403_ = Interface.grandExchangeItems[i_402_].a(2183);
					w[j++] = i_403_ == 1 ? 1 : 0;
					return;
				}
			} else if (i < 4100) {
				if (i == 4000) {
					j -= 2;
					int i_404_ = w[j];
					int i_405_ = w[j + 1];
					w[j++] = i_404_ + i_405_;
					return;
				}
				if (i == 4001) {
					j -= 2;
					int i_406_ = w[j];
					int i_407_ = w[j + 1];
					w[j++] = i_406_ - i_407_;
					return;
				}
				if (i == 4002) {
					j -= 2;
					int i_408_ = w[j];
					int i_409_ = w[j + 1];
					w[j++] = i_408_ * i_409_;
					return;
				}
				if (i == 4003) {
					j -= 2;
					int i_410_ = w[j];
					int i_411_ = w[j + 1];
					w[j++] = i_410_ / i_411_;
					return;
				}
				if (i == 4004) {
					int i_412_ = w[--j];
					w[j++] = (int) (Math.random() * (double) i_412_);
					return;
				}
				if (i == 4005) {
					int i_413_ = w[--j];
					w[j++] = (int) (Math.random() * (double) (i_413_ + 1));
					return;
				}
				if (i == 4006) {
					j -= 5;
					int i_414_ = w[j];
					int i_415_ = w[j + 1];
					int i_416_ = w[j + 2];
					int i_417_ = w[j + 3];
					int i_418_ = w[j + 4];
					w[j++] = i_414_
							+ ((i_415_ - i_414_) * (i_418_ - i_416_) / (i_417_ - i_416_));
					return;
				}
				if (i == 4007) {
					j -= 2;
					long l = (long) w[j];
					long l_419_ = (long) w[j + 1];
					w[j++] = (int) (l + l * l_419_ / 100L);
					return;
				}
				if (i == 4008) {
					j -= 2;
					int i_420_ = w[j];
					int i_421_ = w[j + 1];
					w[j++] = i_420_ | 1 << i_421_;
					return;
				}
				if (i == 4009) {
					j -= 2;
					int i_422_ = w[j];
					int i_423_ = w[j + 1];
					w[j++] = i_422_ & -1 - (1 << i_423_);
					return;
				}
				if (i == 4010) {
					j -= 2;
					int i_424_ = w[j];
					int i_425_ = w[j + 1];
					w[j++] = (i_424_ & 1 << i_425_) != 0 ? 1 : 0;
					return;
				}
				if (i == 4011) {
					j -= 2;
					int i_426_ = w[j];
					int i_427_ = w[j + 1];
					w[j++] = i_426_ % i_427_;
					return;
				}
				if (i == 4012) {
					j -= 2;
					int i_428_ = w[j];
					int i_429_ = w[j + 1];
					if (i_428_ == 0)
						w[j++] = 0;
					else {
						w[j++] = (int) Math.pow((double) i_428_,
								(double) i_429_);
						return;
					}
					return;
				}
				if (i == 4013) {
					j -= 2;
					int i_430_ = w[j];
					int i_431_ = w[j + 1];
					if (i_430_ == 0)
						w[j++] = 0;
					else {
						if (i_431_ == 0)
							w[j++] = 2147483647;
						else {
							w[j++] = (int) Math.pow((double) i_430_,
									1.0 / (double) i_431_);
							return;
						}
						return;
					}
					return;
				}
				if (i == 4014) {
					j -= 2;
					int i_432_ = w[j];
					int i_433_ = w[j + 1];
					w[j++] = i_432_ & i_433_;
					return;
				}
				if (i == 4015) {
					j -= 2;
					int i_434_ = w[j];
					int i_435_ = w[j + 1];
					w[j++] = i_434_ | i_435_;
					return;
				}
				if (i == 4016) {
					j -= 2;
					int i_436_ = w[j];
					int i_437_ = w[j + 1];
					w[j++] = i_436_ < i_437_ ? i_436_ : i_437_;
					return;
				}
				if (i == 4017) {
					j -= 2;
					int i_438_ = w[j];
					int i_439_ = w[j + 1];
					w[j++] = i_438_ > i_439_ ? i_438_ : i_439_;
					return;
				}
				if (i == 4018) {
					j -= 3;
					long l = (long) w[j];
					long l_440_ = (long) w[j + 1];
					long l_441_ = (long) w[j + 2];
					w[j++] = (int) (l * l_441_ / l_440_);
					return;
				}
			} else if (i < 4200) {
				if (i == 4100) {
					String string = q[--h];
					int i_442_ = w[--j];
					q[h++] = string + i_442_;
					return;
				}
				if (i == 4101) {
					h -= 2;
					String string = q[h];
					String string_443_ = q[h + 1];
					q[h++] = string + string_443_;
					return;
				}
				if (i == 4102) {
					String string = q[--h];
					int i_444_ = w[--j];
					q[h++] = string + baa.a((byte) 78, true, i_444_);
					return;
				}
				if (i == 4103) {
					String string = q[--h];
					q[h++] = string.toLowerCase();
					return;
				}
				if (i == 4104) {
					q[h++] = d(w[--j]);
					return;
				}
				if (i == 4105) {
					h -= 2;
					String string = q[h];
					String string_445_ = q[h + 1];
					if (up.thisPlayer.playerDef != null
							&& up.thisPlayer.playerDef.isMale)
						q[h++] = string_445_;
					else {
						q[h++] = string;
						return;
					}
					return;
				}
				if (i == 4106) {
					int i_446_ = w[--j];
					q[h++] = Integer.toString(i_446_);
					return;
				}
				if (i == 4107) {
					h -= 2;
					w[j++] = pg.a(cba.languageID, q[h + 1], q[h], -119);
					return;
				}
				if (i == 4108) {
					String string = q[--h];
					j -= 2;
					int i_447_ = w[j];
					int i_448_ = w[j + 1];
					sa var_sa = qj.a((byte) 11, cs.i, 0, i_448_);
					w[j++] = var_sa.a(i_447_, string, sp.s, -123);
					return;
				}
				if (i == 4109) {
					String string = q[--h];
					j -= 2;
					int i_449_ = w[j];
					int i_450_ = w[j + 1];
					sa var_sa = qj.a((byte) 11, cs.i, 0, i_450_);
					w[j++] = var_sa.a(string, sp.s, i_449_, 96);
					return;
				}
				if (i == 4110) {
					h -= 2;
					String string = q[h];
					String string_451_ = q[h + 1];
					if (w[--j] == 1)
						q[h++] = string;
					else {
						q[h++] = string_451_;
						return;
					}
					return;
				}
				if (i == 4111) {
					String string = q[--h];
					q[h++] = dea.a(19317, string);
					return;
				}
				if (i == 4112) {
					String string = q[--h];
					int i_452_ = w[--j];
					if (i_452_ == -1)
						throw new RuntimeException("null char");
					q[h++] = string + (char) i_452_;
					return;
				}
				if (i == 4113) {
					int i_453_ = w[--j];
					w[j++] = ji.a((byte) -53, (char) i_453_) ? 1 : 0;
					return;
				}
				if (i == 4114) {
					int i_454_ = w[--j];
					w[j++] = nq.a(-115, (char) i_454_) ? 1 : 0;
					return;
				}
				if (i == 4115) {
					int i_455_ = w[--j];
					w[j++] = iq.a((char) i_455_, true) ? 1 : 0;
					return;
				}
				if (i == 4116) {
					int i_456_ = w[--j];
					w[j++] = qaa.a((char) i_456_, 20454) ? 1 : 0;
					return;
				}
				if (i == 4117) {
					String string = q[--h];
					if (string != null)
						w[j++] = string.length();
					else {
						w[j++] = 0;
						return;
					}
					return;
				}
				if (i == 4118) {
					String string = q[--h];
					j -= 2;
					int i_457_ = w[j];
					int i_458_ = w[j + 1];
					q[h++] = string.substring(i_457_, i_458_);
					return;
				}
				if (i == 4119) {
					String string = q[--h];
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
					q[h++] = stringbuffer.toString();
					return;
				}
				if (i == 4120) {
					String string = q[--h];
					j -= 2;
					int i_461_ = w[j];
					int i_462_ = w[j + 1];
					w[j++] = string.indexOf(i_461_, i_462_);
					return;
				}
				if (i == 4121) {
					h -= 2;
					String string = q[h];
					String string_463_ = q[h + 1];
					int i_464_ = w[--j];
					w[j++] = string.indexOf(string_463_, i_464_);
					return;
				}
				if (i == 4122) {
					int i_465_ = w[--j];
					w[j++] = Character.toLowerCase((char) i_465_);
					return;
				}
				if (i == 4123) {
					int i_466_ = w[--j];
					w[j++] = Character.toUpperCase((char) i_466_);
					return;
				}
				if (i == 4124) {
					boolean bool_467_ = w[--j] != 0;
					int i_468_ = w[--j];
					q[h++] = bfa.a(cba.languageID, 7110, (long) i_468_,
							bool_467_, 0);
					return;
				}
				if (i == 4125) {
					String string = q[--h];
					int i_469_ = w[--j];
					sa var_sa = qj.a((byte) 11, cs.i, 0, i_469_);
					w[j++] = var_sa.a(sp.s, string, 68);
					return;
				}
			} else if (i < 4300) {
				if (i == 4200) {
					int i_470_ = w[--j];
					q[h++] = laa.itemDefLoader.d(12388, i_470_).itemName;
					return;
				}
				if (i == 4201) {
					j -= 2;
					int i_471_ = w[j];
					int i_472_ = w[j + 1];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_471_);
					if (i_472_ >= 1
							&& i_472_ <= 5
							&& var_uv.groundActions[i_472_ - 1] != null)
						q[h++] = var_uv.groundActions[i_472_ - 1];
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 4202) {
					j -= 2;
					int i_473_ = w[j];
					int i_474_ = w[j + 1];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_473_);
					if (i_474_ >= 1 && i_474_ <= 5
							&& var_uv.actions[i_474_ - 1] != null)
						q[h++] = var_uv.actions[i_474_ - 1];
					else {
						q[h++] = "";
						return;
					}
					return;
				}
				if (i == 4203) {
					int i_475_ = w[--j];
					w[j++] = laa.itemDefLoader.d(12388, i_475_).value;
					return;
				}
				if (i == 4204) {
					int i_476_ = w[--j];
					w[j++] = laa.itemDefLoader.d(12388, i_476_).stackable == 1 ? 1
							: 0;
					return;
				}
				if (i == 4205) {
					int i_477_ = w[--j];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_477_);
					if (var_uv.o == -1
							&& var_uv.certID >= 0)
						w[j++] = var_uv.certID;
					else {
						w[j++] = i_477_;
						return;
					}
					return;
				}
				if (i == 4206) {
					int i_478_ = w[--j];
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_478_);
					if (var_uv.o >= 0
							&& var_uv.certID >= 0)
						w[j++] = var_uv.certID;
					else {
						w[j++] = i_478_;
						return;
					}
					return;
				}
				if (i == 4207) {
					int i_479_ = w[--j];
					w[j++] = laa.itemDefLoader.d(12388, i_479_).isMembersItem ? 1
							: 0;
					return;
				}
				if (i == 4208) {
					j -= 2;
					int i_480_ = w[j];
					int i_481_ = w[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_481_);
					if (var_vu.a(0))
						q[h++] = laa.itemDefLoader.d(12388, i_480_).a(
								var_vu.m, i_481_, true);
					else {
						w[j++] = laa.itemDefLoader.d(12388, i_480_).a(i_481_,
								var_vu.h, -58);
						return;
					}
					return;
				}
				if (i == 4209) {
					j -= 2;
					int i_482_ = w[j];
					int i_483_ = w[j + 1] - 1;
					ItemDef var_uv = laa.itemDefLoader.d(12388, i_482_);
					if (var_uv.L == i_483_)
						w[j++] = var_uv.vb;
					else {
						if (var_uv.db == i_483_)
							w[j++] = var_uv.Z;
						else {
							w[j++] = -1;
							return;
						}
						return;
					}
					return;
				}
				if (i == 4210) {
					String string = q[--h];
					int i_484_ = w[--j];
					cl.a(-1, i_484_ == 1, string);
					w[j++] = uh.a;
					return;
				}
				if (i == 4211) {
					if (oga.a == null || Class_u.N >= uh.a)
						w[j++] = -1;
					else {
						w[j++] = oga.a[Class_u.N++] & 0xffff;
						return;
					}
					return;
				}
				if (i == 4212) {
					Class_u.N = 0;
					return;
				}
				if (i == 4213) {
					int i_485_ = w[--j];
					w[j++] = laa.itemDefLoader.d(12388, i_485_).ub;
					return;
				}
				if (i == 4214) {
					String string = q[--h];
					j -= 3;
					int i_486_ = w[j];
					int i_487_ = w[j + 1];
					int i_488_ = w[j + 2];
					fi.a(i_487_, i_486_ == 1, string, i_488_, 1986811992);
					w[j++] = uh.a;
					return;
				}
				if (i == 4215) {
					h -= 2;
					j -= 2;
					String string = q[h];
					int i_489_ = w[j];
					int i_490_ = w[j + 1];
					String string_491_ = q[h + 1];
					cea.a(i_489_ == 1, string_491_, 160, i_490_, string);
					w[j++] = uh.a;
					return;
				}
			} else if (i < 4400) {
				if (i == 4300) {
					j -= 2;
					int i_492_ = w[j];
					int i_493_ = w[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_493_);
					if (var_vu.a(0))
						q[h++] = jm.p.getNPCDef(i_492_, (byte) -64).a(
								(byte) 122, var_vu.m, i_493_);
					else {
						w[j++] = jm.p.getNPCDef(i_492_, (byte) -104).a(
								var_vu.h, i_493_, false);
						return;
					}
					return;
				}
			} else if (i < 4500) {
				if (i == 4400) {
					j -= 2;
					int i_494_ = w[j];
					int i_495_ = w[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_495_);
					if (var_vu.a(0))
						q[h++] = ul.k.getObjectDef((byte) 42, i_494_).a(i_495_,
								var_vu.m, 30569);
					else {
						w[j++] = ul.k.getObjectDef((byte) 73, i_494_).a(i_495_,
								118, var_vu.h);
						return;
					}
					return;
				}
			} else if (i < 4600) {
				if (i == 4500) {
					j -= 2;
					int i_496_ = w[j];
					int i_497_ = w[j + 1];
					vu var_vu = jba.b.a((byte) 6, i_497_);
					if (var_vu.a(0))
						q[h++] = aw.m.a(i_496_, 17796).a(false, i_497_,
								var_vu.m);
					else {
						w[j++] = aw.m.a(i_496_, 17796).a(var_vu.h,
								i_497_, -1);
						return;
					}
					return;
				}
			} else if (i < 4700 && i == 4600) {
				int i_498_ = w[--j];
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
					w[j++] = var_cg.F[i_499_];
				} else {
					w[j++] = var_cg.p;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	static final void a() {
		/* empty */
	}

	public static void nullLoader() {
		r = null;
		v = null;
		m = null;
		e = null;
		w = null;
		q = null;
		qfs = null;
		interface_1 = null;
		interface_ = null;
		t = null;
		calendar = null;
		monthNamesShort = null;
		A = null;
		tb_ = null;
	}

	static final void c(int i, boolean bool) {
		/* empty */
	}

	private static final void activateClientScript(ClientScript script, int i) {
		Object[] objects = script.objects;
		int i_502_ = ((Integer) objects[0]).intValue();
		it var_it = jo.b(i_502_, true);
		if (var_it != null) {
			r = new int[var_it.A];
			int i_503_ = 0;
			v = new String[var_it.B];
			int i_504_ = 0;
			for (int i_505_ = 1; i_505_ < objects.length; i_505_++) {
				if (objects[i_505_] instanceof Integer) {
					int i_506_ = ((Integer) objects[i_505_]).intValue();
					if (i_506_ == -2147483647)
						i_506_ = script.q;
					if (i_506_ == -2147483646)
						i_506_ = script.p;
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
					r[i_503_++] = i_506_;
				} else if (objects[i_505_] instanceof String) {
					String string = (String) objects[i_505_];
					if (string.equals("event_opbase"))
						string = script.t;
					v[i_504_++] = string;
				}
			}
			C = script.u;
			activateClientScriptCommand(var_it, i);
		}
	}

	static final void a(qfa var_qfa, int i, int i_507_) {
		it var_it = ud.a(var_qfa, i_507_, i, -6162);
		if (var_it != null) {
			r = new int[var_it.A];
			v = new String[var_it.B];
			if (var_it.D == hk.Q || var_it.D == GPIPlayer.a
					|| var_it.D == hba.a) {
				int i_508_ = 0;
				int i_509_ = 0;
				if (nr.b != null) {
					i_508_ = nr.b.locX;
					i_509_ = nr.b.locY;
				}
				r[0] = Class_md.e.d(2000) - i_508_;
				r[1] = Class_md.e.b(108) - i_509_;
			}
			activateClientScriptCommand(var_it, 200000);
		}
	}

	static {
		b = 0;
		q = new String[1000];
		e = new int[5][5000];
		m = new int[5];
		h = 0;
		w = new int[1000];
		calendar = Calendar.getInstance();
		monthNamesShort = new String[] { "Jan", "Feb", "Mar", "Apr", "May",
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		A = new int[3];
		tb_ = new tb(4);
		C = 0;
	}
}
