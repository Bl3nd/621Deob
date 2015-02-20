/* qi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Entity {
	static int Qc;
	int Rc;
	private byte Sc;
	static int Tc;
	static int Uc;
	boolean Vc = false;
	static int Wc;
	static GameOutPacket Xc = new GameOutPacket(69, 7);
	int combatLevel;
	static int Zc;
	static int ad;
	static int bd;
	boolean cd;
	int orientation;
	int ed;
	int fd;
	private byte gd;
	String hd;
	static int id;
	int jd = -1;
	int kd;
	static int ld;
	static int md;
	static int nd;
	static f od;
	static int pd;
	static int qd;
	int rd;
	boolean sd;
	static int td;
	int ud;
	int vd;
	static int wd;
	int xd;
	int yd;
	PlayerDef playerDef;
	static int Ad;
	static int Bd;
	static int Cd;
	private int Dd;
	static int Ed;
	static int Fd;
	int Gd;
	int Hd;
	String displayName;
	static int Jd;
	private byte Kd;
	boolean Ld;
	int Md;
	static GameInPacket Nd = new GameInPacket(78, -1);
	int Od;
	static int Pd;
	static float[] Qd = new float[4];
	static GameInPacket Rd;
	static int Sd = 0;

	public final void b(boolean bool, Class_r class_r) {
		qd++;
		if (((Player) this).playerDef != null && (((Entity) this).Hc || a(false, class_r, 0))) {
			Class_q class_q = class_r.p();
			if (bool == false) {
				class_q.o(((Entity) this).class_kd.getOrientation((byte) 67));
				class_q.U(((Animable) this).locX, ((Animable) this).j - 5, ((Animable) this).locY);
				this.a(class_q, ((Entity) this).Hc, class_r, ((Entity) this).das, (byte) -52);
				((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
			}
		}
	}

	public final boolean h(byte b) {
		Qc++;
		if (b > -26) {
			return true;
		}
		return false;
	}

	private final void a(int i, da da, int j, int k, Class_q class_q, int i1, int j1, int k1, Class_r class_r) {
		Wc++;
		int i2 = i * i + j1 * j1;
		if (i2 >= 262144 && k >= i2) {
			int i_6_ = -25 / ((i1 + 63) / 43);
			int j2 = ((int) (2607.5945876176133 * Math.atan2((double) i, (double) j1)) & 0x3fff);
			da da_ = ss.a(k1, ((Entity) this).ec, class_r, ((Entity) this).R, j2, ((Entity) this).pb, (byte) -128);
			if (da_ != null) {
				class_r.ZA(false);
				da_.a(class_q, null, j, 0);
				class_r.ZA(true);
			}
		}
	}

	private final boolean a(boolean bool, Class_r class_r, int i) {
		md++;
		int j = i;
		cg cg = this.k(32195);
		dr dr = (((Entity) this).yb != -1 && ((Entity) this).oc == 0 ? Class_ef.J.c(64, ((Entity) this).yb) : null);
		dr dr_ = (((Entity) this).Bc != -1 && !((Player) this).Ld && (!((Entity) this).V || dr == null) ? Class_ef.J.c(64,
				((Entity) this).Bc) : null);
		int k = ((cg) cg).i;
		int i1 = ((cg) cg).W;
		if (k != 0 || i1 != 0 || ((cg) cg).O != 0 || ((cg) cg).C != 0) {
			i |= 0x7;
		}
		boolean bool1 = (((Entity) this).Xb != 0 && pm.currentTimedTicks >= ((Entity) this).zc 
				&& ((Entity) this).Cb > pm.currentTimedTicks);
		if (bool1) {
			i |= 0x80000;
		}
		da da = (((Entity) this).das[0] = ((Player) this).playerDef.a(Class_ae.n, Class_ef.J, i, laa.itemDefLoader, dr, jm.p,
				((Entity) this).ans, cp.e, ((Entity) this).ic, ((Entity) this).hc, dr_, ((Entity) this).yc,
				((Entity) this).W, ((Entity) this).Ib, hs.f, class_r, ((Entity) this).rc, true, (byte) 125));
		int j1 = rn.a((byte) 24);
		if (qm.heapSize < 96 && j1 > 50) {
			he.c((byte) 61);
		}
		if (hs.modeWhere == oba.K || j1 >= 50) {
			if (oba.K != hs.modeWhere) {
				Class_is.n = 0;
				hk.R = new byte[50][];
			}
		} else {
			int k1;
			for (k1 = -j1 + 50; k1 > Class_is.n; Class_is.n++) {
				hk.R[Class_is.n] = new byte[102400];
			}
			while (Class_is.n > k1) {
				Class_is.n--;
				hk.R[Class_is.n] = null;
			}
		}
		if (da == null) {
			return false;
		}
		((Entity) this).Ac = da.J();
		((Entity) this).cc = da.RA();
		this.a((byte) -34, da);
		if (bool != false) {
			return true;
		}
		int k1 = ((Entity) this).class_kd.getOrientation((byte) 67);
		if (k != 0 || i1 != 0) {
			this.a(-2912, k1, k, ((cg) cg).D, i1, ((cg) cg).U);
			if (((Entity) this).ec != 0) {
				da.MA(((Entity) this).ec);
			}
			if (((Entity) this).R != 0) {
				da.W(((Entity) this).R);
			}
			if (((Entity) this).pb != 0) {
				da.oa(0, ((Entity) this).pb, 0);
			}
		} else {
			this.a(-2912, k1, i(-1) << 9, 0, i(-1) << 9, 0);
		}
		if (bool1) {
			da.a(((Entity) this).vb, ((Entity) this).Mb, ((Entity) this).Tb, ((Entity) this).Xb & 0xff);
		}
		if (!((Player) this).Ld && ((Entity) this).graphicsId_ != -1 && ((Entity) this).kc != -1) {
			iv iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId_);
			boolean bool2 = ((iv) iv).r == 3 && (k != 0 || i1 != 0);
			int i2 = j;
			if (!bool2) {
				if (((Entity) this).rotation_ != 0) {
					i2 |= 0x5;
				}
				if (((Entity) this).Pb != 0) {
					i2 |= 0x2;
				}
			} else {
				i2 |= 0x7;
			}
			da da_ = (((Entity) this).das[1] = iv.a(((Entity) this).Ob, class_r, 71, Class_ef.J, ((Entity) this).kc, i2, 
					((Entity) this).qb));
			if (da_ != null) {
				if (((Entity) this).Pb != 0) {
					da_.oa(0, -((Entity) this).Pb << 2, 0);
				}
				if (((Entity) this).rotation_ != 0) {
					da_.M(2048 * ((Entity) this).rotation_);
				}
				if (bool2) {
					if (((Entity) this).ec != 0) {
						da_.MA(((Entity) this).ec);
					}
					if (((Entity) this).R != 0) {
						da_.W(((Entity) this).R);
					}
					if (((Entity) this).pb != 0) {
						da_.oa(0, ((Entity) this).pb, 0);
					}
				}
			}
		} else {
			((Entity) this).das[1] = null;
		}
		if (!((Player) this).Ld && ((Entity) this).graphicsId != -1 && (((Entity) this).mb ^ 0xffffffff) != 0) {
			iv iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId);
			boolean bool2 = ((iv) iv).r == 3 && (k != 0 || i1 != 0);
			int i2 = j;
			if (bool2) {
				i2 |= 0x7;
			} else {
				if (((Entity) this).rotation != 0) {
					i2 |= 0x5;
				}
				if (((Entity) this).delayAndHeight != 0) {
					i2 |= 0x2;
				}
			}
			da da_ = (((Entity) this).das[2] = iv.a(Class_ef.J, 83, class_r, ((Entity) this).P, i2, ((Entity) this).mb, ((Entity) this).pc));
			if (da_ != null) {
				if (((Entity) this).delayAndHeight != 0) {
					da_.oa(0, -((Entity) this).delayAndHeight << 2, 0);
				}
				if (((Entity) this).rotation != 0) {
					da_.M(2048 * ((Entity) this).rotation);
				}
				if (bool2) {
					if (((Entity) this).ec != 0) {
						da_.MA(((Entity) this).ec);
					}
					if (((Entity) this).R != 0) {
						da_.W(((Entity) this).R);
					}
					if (((Entity) this).pb != 0) {
						da_.oa(0, ((Entity) this).pb, 0);
					}
				}
			}
		} else {
			((Entity) this).das[2] = null;
		}
		return true;
	}

	final void updateLocation(byte i, int i_23_, int i_24_, int i_25_) {
		if ((((Entity) this).yb ^ 0xffffffff) != 0
				&& ((dr) Class_ef.J.c(64, ((Entity) this).yb)).k == 1) {
			((Entity) this).yb = -1;
			((Entity) this).Ab = null;
		}
		if (i_24_ != -1157357879)
			b(false, null);
		Tc++;
		if (((Entity) this).graphicsId_ != -1) {
			iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId_);
			if (((iv) var_iv).d && ((iv) var_iv).w != -1
					&& ((dr) Class_ef.J.c(64, ((iv) var_iv).w)).k == 1)
				((Entity) this).graphicsId_ = -1;
		}
		if ((((Entity) this).graphicsId ^ 0xffffffff) != 0) {
			iv var_iv = Class_ic.H.a((byte) 12, ((Entity) this).graphicsId);
			if (((iv) var_iv).d && ((iv) var_iv).w != -1
					&& ((dr) Class_ef.J.c(64, ((iv) var_iv).w)).k == 1)
				((Entity) this).graphicsId = -1;
		}
		((Player) this).orientation = -1;
		if (i_25_ >= 0 && Class_hc.e > i_25_ && i_23_ >= 0 && bw.v > i_23_) {
			if (((Entity) this).regionLocalX[0] >= 0
					&& Class_hc.e > ((Entity) this).regionLocalX[0]
					&& ((Entity) this).regionLocalY[0] >= 0
					&& bw.v > ((Entity) this).regionLocalY[0]) {
				if (i == 2)
					nu.a(i_23_, -79, this, i_25_, (byte) 2);
				a(i_25_, i, i_23_, true);
			} else
				updateLocation(-3377, i_25_, i_23_);
		} else
			updateLocation(i_24_ + 1157354502, i_25_, i_23_);
	}

	final String getUserDisplayName(byte i, boolean bool) {
		bd++;
		if (i >= -119)
			return null;
		String string = "";
		if (kr.e != null)
			string += kr.e[Sc];
		int[] is;
		if (Kd != 1 || vn.P == null)
			is = il.m;
		else
			is = vn.P;
		if (is != null && is[Sc] != -1) {
			ss var_ss = tv.e.a(is[Sc], -8727);
			if (((ss) var_ss).b == 's')
				string += var_ss.d(-24908, 0xff & gd);
			else {
				cea.a("gdn1", -2, new Throwable());
				is[Sc] = -1;
			}
		}
		if (!bool)
			string += ((Player) this).displayName;
		else
			string += ((Player) this).hd;
		if (na.g != null)
			string += na.g[Sc];
		return string;
	}

	final boolean l(int i) {
		Jd++;
		int i_26_ = 19 / ((55 - i) / 41);
		if (((Player) this).playerDef == null)
			return false;
		return true;
	}

	final void d(int i) {
		nd++;
		if (i != -1)
			((Player) this).xd = 101;
		throw new IllegalStateException();
	}

	static final void a(byte i, int i_27_, int i_28_, int i_29_, int i_30_,
			int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		Ed++;
		if (gf.a((byte) 92, i_32_) && i <= -94) {
			if (mv.b[i_32_] == null)
				client.a(aa.o[i_32_], -1, i_29_, i_31_, i_30_, i_35_, i_27_,
						i_33_, i_28_, i_34_);
			else
				client.a(mv.b[i_32_], -1, i_29_, i_31_, i_30_, i_35_, i_27_,
						i_33_, i_28_, i_34_);
		}
	}

	final og a(boolean bool, Class_r class_r) {
		Fd++;
		if (((Player) this).playerDef == null || !a(false, class_r, 2048))
			return null;
		Class_q class_q = class_r.p();
		int i = ((Entity) this).class_kd.getOrientation((byte) 67);
		class_q.o(i);
		vf var_vf = (ol.p[((Animable) this).height][((Animable) this).locX >> Class_fb.a][((Animable) this).locY >> Class_fb.a]);
		if (var_vf == null || ((vf) var_vf).m == null)
			((Entity) this).db -= (float) ((Entity) this).db / 10.0F;
		else {
			int i_36_ = ((Entity) this).db - ((dfa) ((vf) var_vf).m).x;
			((Entity) this).db -= (float) i_36_ / 10.0F;
		}
		class_q.U(((Animable) this).locX, ((Animable) this).j - 20
				- ((Entity) this).db, ((Animable) this).locY);
		((Entity) this).Oc = bool;
		if (((jb) cs.g).t) {
			cg var_cg = this.k(32195);
			if (((cg) var_cg).k
					&& (((PlayerDef) ((Player) this).playerDef).d == -1 || ((NPCDef) jm.p
							.getNPCDef(
									((PlayerDef) ((Player) this).playerDef).d,
									(byte) -107)).f)) {
				dr var_dr = (((Entity) this).yb == -1
						|| ((Entity) this).oc != 0 ? null : Class_ef.J.c(64,
						((Entity) this).yb));
				dr var_dr_37_ = (((((Entity) this).Bc ^ 0xffffffff) == 0
						|| ((Player) this).Ld || ((Entity) this).V
						&& var_dr != null) ? null : Class_ef.J.c(64,
						((Entity) this).Bc));
				da var_da = cg.a(240, i, ((Entity) this).das[0], 160, 0, 1,
						((Entity) this).R, class_r, 0, ((Entity) this).ec,
						((Entity) this).pb, false,
						(var_dr_37_ == null ? ((Entity) this).yc
								: ((Entity) this).Ib),
						var_dr_37_ == null ? var_dr : var_dr_37_);
				if (var_da != null) {
					((Entity) this).Oc = true;
					class_r.ZA(false);
					if (!ml.k)
						var_da.a(class_q, null, 0);
					else
						var_da.a(class_q, null, Class_pd.r, 0);
					class_r.ZA(true);
				}
			}
		}
		if (up.thisPlayer == this) {
			class_q.NA(((Animable) this).locX, ((Animable) this).j,
					((Animable) this).locY);
			for (int i_38_ = Class_fb.j.length - 1; i_38_ >= 0; i_38_--) {
				on var_on = Class_fb.j[i_38_];
				if (var_on != null && (((on) var_on).h ^ 0xffffffff) != 0) {
					if (((on) var_on).a == 1) {
						NPCNode var_mi = (NPCNode) uo.a.a(-32748,
								(long) ((on) var_on).e);
						if (var_mi != null) {
							NPC class_ac = ((NPCNode) var_mi).l;
							int i_39_ = ((Animable) class_ac).locX
									- ((Animable) up.thisPlayer).locX;
							int i_40_ = ((Animable) class_ac).locY
									- ((Animable) up.thisPlayer).locY;
							if (ml.k)
								a(i_39_, ((Entity) this).das[0], Class_pd.r,
										92160000, class_q, -20, i_40_,
										((on) var_on).h, class_r);
							else
								a(i_40_, ((on) var_on).h,
										((Entity) this).das[0], 92160000, i_39_,
										-1, class_r, class_q);
						}
					}
					if (((on) var_on).a == 2) {
						int i_41_ = ((on) var_on).n
								- ((Animable) up.thisPlayer).locX + 256;
						int i_42_ = ((on) var_on).i
								- ((Animable) up.thisPlayer).locY + 256;
						int i_43_ = ((on) var_on).f << 9;
						i_43_ *= i_43_;
						if (!ml.k)
							a(i_42_, ((on) var_on).h, ((Entity) this).das[0],
									i_43_, i_41_, -1, class_r, class_q);
						else
							a(i_41_, ((Entity) this).das[0], Class_pd.r, i_43_,
									class_q, -123, i_42_, ((on) var_on).h,
									class_r);
					}
					if (((on) var_on).a == 10
							&& ((on) var_on).e >= 0
							&& Class_fc.playersInScreen.length > ((on) var_on).e) {
						Player var_qi_44_ = Class_fc.playersInScreen[((on) var_on).e];
						if (var_qi_44_ != null) {
							int i_45_ = ((Animable) var_qi_44_).locX
									- ((Animable) up.thisPlayer).locX;
							int i_46_ = ((Animable) var_qi_44_).locY
									- ((Animable) up.thisPlayer).locY;
							if (!ml.k)
								a(i_46_, ((on) var_on).h,
										((Entity) this).das[0], 92160000, i_45_,
										-1, class_r, class_q);
							else
								a(i_45_, ((Entity) this).das[0], Class_pd.r,
										92160000, class_q, -122, i_46_,
										((on) var_on).h, class_r);
						}
					}
				}
			}
			class_q.o(i);
			class_q.U(((Animable) this).locX, ((Animable) this).j,
					((Animable) this).locY);
		}
		class_q.o(i);
		class_q.U(((Animable) this).locX, ((Animable) this).j - 5
				- ((Entity) this).db, ((Animable) this).locY);
		og var_og = lf.a(!bool, ((Entity) this).das.length);
		this.a(class_q, false, class_r, ((Entity) this).das, (byte) -62);
		if (!ml.k) {
			for (int i_47_ = 0; i_47_ < ((Entity) this).das.length; i_47_++) {
				if (((Entity) this).das[i_47_] != null)
					((Entity) this).das[i_47_].a(class_q,
							((og) var_og).g[i_47_], up.thisPlayer == this ? 1
									: 0);
			}
		} else {
			for (int i_48_ = 0; i_48_ < ((Entity) this).das.length; i_48_++) {
				if (((Entity) this).das[i_48_] != null)
					((Entity) this).das[i_48_].a(class_q,
							((og) var_og).g[i_48_], Class_pd.r,
							this == up.thisPlayer ? 1 : 0);
			}
		}
		if (((Entity) this).tq_ != null) {
			ir var_ir = ((Entity) this).tq_.g();
			if (ml.k)
				class_r.a(var_ir, Class_pd.r);
			else
				class_r.a(var_ir);
		}
		for (int i_49_ = 0; ((Entity) this).das.length > i_49_; i_49_++) {
			if (((Entity) this).das[i_49_] != null)
				((Entity) this).Oc |= ((Entity) this).das[i_49_].LA();
		}
		((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
		((Entity) this).Wb = sh.j;
		return var_og;
	}

	final sd a(Class_r class_r, int i) {
		if (i != -1660704056)
			((Player) this).Hd = -110;
		wd++;
		return null;
	}

	final void a(int i, byte i_50_, int i_51_, boolean bool) {
		ad++;
		if (((Entity) this).Nc < 9)
			((Entity) this).Nc++;
		for (int i_52_ = ((Entity) this).Nc; i_52_ > 0; i_52_--) {
			((Entity) this).regionLocalX[i_52_] = ((Entity) this).regionLocalX[i_52_ - 1];
			((Entity) this).regionLocalY[i_52_] = ((Entity) this).regionLocalY[i_52_ - 1];
			((Entity) this).moveTypes[i_52_] = ((Entity) this).moveTypes[i_52_ - 1];
		}
		((Entity) this).regionLocalX[0] = i;
		((Entity) this).moveTypes[0] = i_50_;
		((Entity) this).regionLocalY[0] = i_51_;
		if (bool != true)
			Dd = -29;
	}

	final String a(boolean bool, byte i) {
		if (i != -7)
			getUserDisplayName((byte) -21, true);
		pd++;
		if (bool)
			return ((Player) this).hd;
		return ((Player) this).displayName;
	}

	private final void a(int i, int i_53_, da var_da, int i_54_, int i_55_,
			int i_56_, Class_r class_r, Class_q class_q) {
		if (i_56_ != -1)
			((Player) this).ud = -21;
		ld++;
		int i_57_ = i * i + i_55_ * i_55_;
		if (i_57_ >= 262144 && i_54_ >= i_57_) {
			int i_58_ = 0x3fff & (int) (2607.5945876176133 * Math.atan2(
					(double) i_55_, (double) i));
			da var_da_59_ = ss.a(i_53_, ((Entity) this).ec, class_r,
					((Entity) this).R, i_58_, ((Entity) this).pb, (byte) -123);
			if (var_da_59_ != null) {
				class_r.ZA(false);
				var_da_59_.a(class_q, null, 0);
				class_r.ZA(true);
			}
		}
	}

	final int a(byte i) {
		Bd++;
		if (i != -7)
			a(-36, 64, null, 24, -56, 76, null, null);
		return -1;
	}

	final void playerAppearanceUpdate(int dummy, BytesParser stream) {
		Uc++;
		((BytesParser) stream).pos = 0;
		int i_60_ = stream.readUnsignedByte(-9268);
		Kd = (byte) (0x1 & i_60_);
		boolean bool = ((Player) this).sd;
		((Player) this).sd = (0x2 & i_60_) != 0;
		boolean bool_61_ = (i_60_ & 0x4) != 0;
		int i_62_ = super.i(-1);
		this.a((0x7 & i_60_ >> 3) + 1, 0);
		Sc = (byte) (0x3 & i_60_ >> 6);
		((Animable) this).locX += i(-1) - i_62_ << 8;
		((Animable) this).locY += i(dummy) - i_62_ << 8;
		gd = stream.readByte(dummy - 20932);
		((Player) this).Hd = stream.readByte(-20933);
		((Player) this).vd = stream.readByte(-20933);
		((Player) this).Gd = 0;
		int i_63_ = -1;
		int[] is = new int[12];
		for (int i_64_ = 0; i_64_ < 12; i_64_++) {
			int i_65_ = stream.readUnsignedByte(-9268);
			if (i_65_ == 0)
				is[i_64_] = 0;
			else {
				int i_66_ = stream.readUnsignedByte(dummy - 9267);
				int i_67_ = (i_65_ << 8) + i_66_;
				if (i_64_ == 0 && i_67_ == 65535) {
					i_63_ = stream.readShort(13111);
					((Player) this).Gd = stream.readUnsignedByte(-9268);
					break;
				}
				if (i_67_ >= 32768) {
					i_67_ = kq.U[i_67_ - 32768];
					is[i_64_] = hba.bitwiseArg1ORArg2(1073741824, i_67_);
					int i_68_ = ((ItemDef) laa.itemDefLoader.d(12388, i_67_)).wb;
					if (i_68_ != 0)
						((Player) this).Gd = i_68_;
				} else
					is[i_64_] = hba.bitwiseArg1ORArg2(-2147483648, i_67_ - 256);
			}
		}
		int[] is_69_ = new int[5];
		for (int i_70_ = 0; i_70_ < 5; i_70_++) {
			int i_71_ = stream.readUnsignedByte(-9268);
			if (ck.K.length < 1 || i_71_ < 0 || i_71_ >= ck.K[0][i_70_].length)
				i_71_ = 0;
			is_69_[i_70_] = i_71_;
		}
		Dd = stream.readShort(13111);
		((Player) this).hd = stream.readString((byte) 124);
		((Player) this).displayName = ((Player) this).hd;
		((Player) this).combatLevel = stream.readUnsignedByte(-9268);
		if (bool_61_) {
			((Player) this).ud = stream.readShort(dummy ^ ~0x3337);
			if (((Player) this).ud == 65535)
				((Player) this).ud = -1;
			((Player) this).ed = -1;
			((Player) this).Md = ((Player) this).combatLevel;
		} else {
			((Player) this).ud = 0;
			((Player) this).Md = stream.readUnsignedByte(-9268);
			((Player) this).ed = stream.readUnsignedByte(-9268);
			if (((Player) this).ed == 255)
				((Player) this).ed = -1;
		}
		int i_72_ = ((Player) this).xd;
		((Player) this).xd = stream.readUnsignedByte(-9268);
		if (((Player) this).xd != 0) {
			int i_73_ = ((Player) this).Rc;
			int i_74_ = ((Player) this).yd;
			int i_75_ = ((Player) this).fd;
			int i_76_ = ((Player) this).jd;
			int i_77_ = ((Player) this).Od;
			((Player) this).Rc = stream.readShort(13111);
			((Player) this).yd = stream.readShort(13111);
			((Player) this).fd = stream.readShort(13111);
			((Player) this).jd = stream.readShort(13111);
			((Player) this).Od = stream.readUnsignedByte(-9268);
			if (!bool != !((Player) this).sd || ((Player) this).xd != i_72_
					|| i_73_ != ((Player) this).Rc
					|| ((Player) this).yd != i_74_
					|| ((Player) this).fd != i_75_
					|| i_76_ != ((Player) this).jd
					|| ((Player) this).Od != i_77_)
				gba.a(this, dummy ^ 0x70);
		} else
			jn.a((byte) 70, this);
		if (((Player) this).playerDef == null)
			((Player) this).playerDef = new PlayerDef();
		int i_78_ = ((PlayerDef) ((Player) this).playerDef).d;
		int[] is_79_ = ((PlayerDef) ((Player) this).playerDef).k;
		((Player) this).playerDef.a(is, Kd == 1, a(false), i_63_, (byte) 23,
				is_69_);
		if (i_63_ != i_78_) {
			((Animable) this).locX = (((Entity) this).regionLocalX[0] << 9)
					+ (i(-1) << 8);
			((Animable) this).locY = (((Entity) this).regionLocalY[0] << 9)
					+ (i(dummy) << 8);
		}
		if (ih.n == ((Entity) this).lb && is_79_ != null) {
			for (int i_80_ = 0; is_69_.length > i_80_; i_80_++) {
				if (is_69_[i_80_] != is_79_[i_80_]) {
					laa.itemDefLoader.b(dummy ^ ~0x6a);
					break;
				}
			}
		}
		if (((Entity) this).tq_ != null)
			((Entity) this).tq_.b();
		if (dummy != ((Entity) this).Bc && ((Entity) this).V) {
			cg var_cg = this.k(32195);
			if (!var_cg.a(((Entity) this).Bc, -117)) {
				((Entity) this).V = false;
				((Entity) this).Bc = -1;
			}
		}
	}

	final void a(boolean bool, int i, byte i_81_, Class_r class_r,
			Animable var_lo, int i_82_, int i_83_) {
		td++;
		int i_84_ = -38 % ((i_81_ + 50) / 55);
		throw new IllegalStateException();
	}

	static final void m(int i) {
		if (i != 16383)
			od = null;
		WorldSub.p = null;
		id++;
		or.a(0, (byte) -23, eh.height, -1, ff.width, Class_vb.u, 0, 0, 0);
		if (WorldSub.p != null) {
			bn.a(0, eh.height, 0, jga.s, (byte) -4, ff.width, ((Interface) rca.e).Xb,
					WorldSub.p, qf.h, -1412584499);
			WorldSub.p = null;
		}
	}

	final boolean a(int i, int i_85_, Class_r class_r, int i_86_) {
		if (i_86_ != 9678)
			return true;
		Zc++;
		if (((Player) this).playerDef == null || !a(false, class_r, 131072))
			return false;
		Class_q class_q = class_r.p();
		int i_87_ = ((Entity) this).class_kd.getOrientation((byte) 67);
		class_q.o(i_87_);
		class_q.U(((Animable) this).locX, ((Animable) this).j,
				((Animable) this).locY);
		boolean bool = false;
		for (int i_88_ = 0; ((Entity) this).das.length > i_88_; i_88_++) {
			if (((Entity) this).das[i_88_] != null
					&& (ml.k ? ((Entity) this).das[i_88_].a(i, i_85_, class_q,
							true, Class_pd.r) : ((Entity) this).das[i_88_].a(i,
							i_85_, class_q, true))) {
				bool = true;
				break;
			}
		}
		((Entity) this).das[0] = ((Entity) this).das[1] = ((Entity) this).das[2] = null;
		return bool;
	}

	final int i(int i) {
		Cd++;
		if (((Player) this).playerDef != null
				&& ((PlayerDef) ((Player) this).playerDef).d != -1)
			return ((NPCDef) jm.p.getNPCDef(
					((PlayerDef) ((Player) this).playerDef).d, (byte) -115)).Q;
		if (i != -1)
			updateLocation((int) 29, 21, 67);
		return super.i(-1);
	}

	final void updateLocation(int i, int i_89_, int i_90_) {
		((Entity) this).regionLocalX[0] = i_89_;
		((Entity) this).Fc = 0;
		((Entity) this).Kc = 0;
		Ad++;
		((Entity) this).Nc = 0;
		((Entity) this).regionLocalY[0] = i_90_;
		int i_91_ = i(i + 3376);
		((Animable) this).locX = ((Entity) this).regionLocalX[0] * 512 + i_91_
				* 256;
		((Animable) this).locY = 512 * ((Entity) this).regionLocalY[0] + i_91_
				* 256;
		if (this == up.thisPlayer)
			Class_ad.b(120);
		if (((Entity) this).tq_ != null)
			((Entity) this).tq_.b();
		if (i != -3377)
			d((int) -126);
	}

	public static void c(boolean bool) {
		Qd = null;
		Rd = null;
		Nd = null;
		Xc = null;
		od = null;
		if (bool != false)
			m(93);
	}

	final int a(boolean bool) {
		Pd++;
		if (bool != false)
			((Player) this).Hd = -113;
		return Dd;
	}

	public Player() {
		((Player) this).ed = -1;
		Sc = (byte) 0;
		((Player) this).orientation = -1;
		gd = (byte) 0;
		((Player) this).Rc = -1;
		((Player) this).cd = false;
		((Player) this).combatLevel = 0;
		((Player) this).sd = false;
		((Player) this).xd = 0;
		((Player) this).Hd = -1;
		((Player) this).fd = -1;
		((Player) this).vd = -1;
		Kd = (byte) 0;
		((Player) this).yd = -1;
		((Player) this).ud = 0;
		((Player) this).Md = 0;
		((Player) this).Ld = false;
		((Player) this).Gd = 0;
		((Player) this).Od = 255;
	}

	static {
		Rd = new GameInPacket(70, -2);
	}
}
