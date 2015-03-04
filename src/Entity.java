/* ni - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Entity extends qda {
	
	int[] hitTypes;
	int faceEntityID;
	int M;
	int delayAndHeight;
	static int O;
	int P;
	int Q;
	int R;
	int S;
	static int T;
	int U;
	boolean V;
	int W = -1;
	static int X;
	int Y;
	static int Z;
	int ab;
	int rotation_;
	String cb;
	int db;
	int graphicsId;
	int fb;
	boolean gb;
	Class_kd class_kd;
	static int ib;
	int jb;
	boolean kb;
	int lb;
	int mb;
	int nb;
	static int ob;
	int pb;
	int qb;
	static int rb;
	int sb;
	int[] hitDamages;
	int ub;
	byte vb;
	int graphicsId_;
	static int xb;
	int yb;
	private int zb;
	int[] Ab;
	static int Bb;
	int Cb;
	int Db;
	int hitBarScale;
	int Fb;
	int Gb;
	int Hb;
	int Ib;
	int Jb;
	int Kb;
	static int Lb;
	byte Mb;
	an[] ans;
	int Ob;
	int Pb;
	int[] counters;
	static int Rb;
	int Sb;
	byte Tb;
	static int Ub;
	static int Vb;
	int Wb;
	byte Xb;
	int Yb;
	int Zb;
	int ac;
	int rotation;
	int cc;
	int dc;
	int ec;
	int fc;
	static int gc;
	int hc;
	int ic;
	int jc;
	int kc;
	static int finalizeCount;
	static int mc;
	static int nc;
	int oc;
	int pc;
	static int qc;
	int rc;
	int hitRemovalTime;
	static int tc = 0;
	static int uc;
	int vc;
	static int applyGraphicsCount;
	int xc;
	int yc;
	int zc;
	int Ac;
	int Bc;
	static int applyHitCount;
	private Class_kd class_kd_;
	private Class_kd class_kd_1;
	int Fc;
	int Gc;
	boolean Hc;
	da[] das;
	byte[] moveTypes;
	int Kc;
	int[] regionLocalY;
	tq tq_;
	int Nc;
	boolean Oc;
	int[] regionLocalX;

	public final void a(int i) {
		this.Kc = i;
		nc++;
		this.Nc = 0;
	}

	abstract int a(boolean bool);

	public final boolean g(byte b) {
		Bb++;
		if (b < 114) {
			a(null, true, null, null, (byte) -102);
		}
		return false;
	}

	public final boolean e(byte b) {
		ib++;
		if (b != 23) {
			b();
		}
		return this.Oc;
	}

	@Override
    protected final void finalize() {
		if (this.tq_ != null) {
			this.tq_.f();
		}
		finalizeCount++;
	}

	public final void a(int i, int j) {
		Vb++;
		if (j != 0) {
			g((byte) 69);
		}
		zb = i;
	}

	public final void applyHit(int counter, int hitType, int damage, int i) {
		applyHitCount++;
		int hitID = 0;
		if (i >= 116) {
			for (/**/; hitID < 4; hitID++) {
				if (counter >= this.counters[hitID]) {
					this.hitDamages[hitID] = damage;
					this.hitTypes[hitID] = hitType;
					this.counters[hitID] = counter + 70;
					break;
				}
			}
		}
	}

	abstract int a(byte b);

	public final void applyGraphics(int delayAndHeight, int graphicsID, byte b, int rotation, boolean bool) {
		applyGraphicsCount++;
		if (b >= 15) {
			int graphics = bool ? this.graphicsId : this.graphicsId_;
			if (graphicsID != -1 && graphics != -1) {
				if (graphics == graphicsID) {
					iv iv = Class_ic.H.a((byte) 12, graphicsID);
					if (iv.d && iv.w != -1) {
						dr dr = Class_ef.J.c(64, iv.w);
						int j = dr.g;
						if (j == 0) {
							return;
						}
						if (j == 2) {
							if (!bool) {
								this.Sb = 0;
							} else {
								this.Jb = 0;
								return;
							}
							return;
						}
					}
				} else {
					iv iv = Class_ic.H.a((byte) 12, graphicsID);
					iv iv_ = Class_ic.H.a((byte) 12, graphics);
					if (iv.w != -1 && iv_.w != -1) {
						dr dr = Class_ef.J.c(64, iv.w);
						dr dr_ = Class_ef.J.c(64, iv_.w);
						if (dr.t < dr_.t) {
							return;
						}
					}
				}
			}
			int ticks = pm.currentTimedTicks;
			if (bool) {
				this.delayAndHeight = delayAndHeight >> 16;
				this.P = 1;
				this.graphicsId = graphicsID;
				this.S = (delayAndHeight & 0xffff) + ticks;
				this.mb = 0;
				this.pc = 0;
				this.rotation = rotation;
				if (ticks < this.S) {
					this.mb = -1;
				}
				if (this.graphicsId != -1 && ticks == this.S) {
					int j = Class_ic.H.a((byte) 12, this.graphicsId).w;
					if (j != -1) {
						dr dr = Class_ef.J.c(64, j);
						if (dr != null && dr.p != null)
							qga.a(this.height, dr, this.locX, this.locY, 103, 0, this == up.thisPlayer);
					}
				}
			} else {
				this.qb = 0;
				this.graphicsId_ = graphicsID;
				this.Ob = 1;
				this.kc = 0;
				this.rotation_ = rotation;
				this.Pb = delayAndHeight >> 16;
				this.Fb = (delayAndHeight & 0xffff) + ticks;
				if (this.Fb > ticks) {
					this.kc = -1;
				}
				if ((~this.graphicsId_) != 0 && this.Fb == ticks) {
					int j = Class_ic.H.a((byte) 12, this.graphicsId_).w;
					if ((~j) != 0) {
						dr dr = Class_ef.J.c(64, j);
						if (dr != null && dr.p != null) {
							qga.a(this.height, dr, this.locX, this.locY, 107, 0, this == up.thisPlayer);
						}
					}
				}
			}
		}
	}

	public final int b() {
		gc++;
		cg cg = k(32195);
		int i = this.class_kd.i;
		boolean bool;
		if (cg.l == 0) {
			bool = this.class_kd.a(this.Zb, this.Gb, this.Zb, (byte) 82);
		} else {
			bool = this.class_kd.a(cg.K, this.Gb, cg.l, (byte) 102);
		}
		int j = this.class_kd.i - i;
		if (j == 0) {
			this.nb = 0;
			this.class_kd.a(119, this.Gb);
		} else {
			this.nb++;
		}
		if (bool) {
			if (cg.n != 0) {
				if (j <= 0) {
					class_kd_.a(cg.v, -cg.O, cg.n, (byte) 55);
				} else {
					class_kd_.a(cg.v, cg.O, cg.n, (byte) 82);
				}
			}
			if (cg.P != 0) {
				class_kd_1.a(cg.t, cg.C, cg.P, (byte) 65);
			}
		} else {
			if (cg.n == 0) {
				class_kd_.a(123, 0);
			} else {
				class_kd_.a(cg.v, 0, cg.n, (byte) 90);
			}
			if (cg.P == 0) {
				class_kd_1.a(1, 0);
			} else {
				class_kd_1.a(cg.t, 0, cg.P, (byte) 78);
			}
		}
		return j;
	}

	public final void a(int i, int j, int k, int i1, int j1, int k1) {
		xb++;
		int i2 = this.B + this.I >> 1;
		int j2 = this.x + this.y >> 1;
		int k2 = GameInPacket.ints1[j];
		int i3 = GameInPacket.ints2[j];
		int j3 = -k / 2;
		int k3 = -j1 / 2;
		int i4 = j3 * i3 + k2 * k3 >> 14;
		int j4 = k3 * i3 - j3 * k2 >> 14;
		int k4 = Class_ae.a(this.locX + i4, 2, this.height, j2, this.locY + j4, i2);
		int i5 = k / 2;
		int j5 = -j1 / 2;
		int k5 = i3 * i5 + k2 * j5 >> 14;
		int i6 = j5 * i3 - i5 * k2 >> 14;
		int j6 = Class_ae.a(this.locX + k5, 2, this.height, j2, this.locY + i6, i2);
		int k6 = -k / 2;
		int i7 = j1 / 2;
		int j7 = i7 * k2 + k6 * i3 >> 14;
		int k7 = i3 * i7 - k6 * k2 >> 14;
		int i8 = Class_ae.a(this.locX + j7, 2, this.height, j2, k7 + this.locY, i2);
		int j8 = k / 2;
		int k8 = j1 / 2;
		int i9 = i3 * j8 + k2 * k8 >> 14;
		int j9 = k8 * i3 - j8 * k2 >> 14;
		int k9 = Class_ae.a(i9 + this.locX, 2, this.height, j2, this.locY + j9, i2);
		int i10 = j6 > k4 ? k4 : j6;
		int j10 = k9 <= i8 ? k9 : i8;
		int k10 = j6 >= k9 ? k9 : j6;
		this.ec = (int) (2607.5945876176133 * Math.atan2((double) (i10 - j10), (double) j1)) & 0x3fff;
		if (i != -2912) {
			tc = -83;
		}
		int i11 = i8 <= k4 ? i8 : k4;
		this.R = 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) (i11 - k10), (double) k));
		if (this.ec != 0 && k1 != 0) {
			int j11 = -k1 + 16384;
			if (this.ec > 8192) {
				if (j11 > this.ec) {
					this.ec = j11;
				}
			} else if (this.ec > k1) {
				this.ec = k1;
			}
		}
		if (this.R != 0 && i1 != 0) {
			int j11 = 16384 - i1;
			if (this.R <= 8192) {
				if (this.R > i1) {
					this.R = i1;
				}
			} else if (j11 > this.R) {
				this.R = j11;
			}
		}
		this.pb = k9 + k4;
		if (j6 + i8 < this.pb) {
			this.pb = j6 + i8;
		}
		this.pb = (this.pb >> 1) - this.j;
	}

	public final void h(int i) {
		X++;
		int j = (zb - 1 << 8) + 240;
		this.y = (short) (j + this.locY >> 9);
		this.B = (short) (this.locX - j >> 9);
		if (i != 0) {
			g(0);
		}
		this.I = (short) (this.locX + j >> 9);
		this.x = (short) (this.locY - j >> 9);
	}

	public final int g(int i) {
		ob++;
		if (this.Ac == -32768) {
			return 0;
		}
		return this.Ac;
	}

	public final void a(Class_q class_q, boolean bool, Class_r class_r, da[] das, byte b) {
		if (b < -12) {
			if (!bool) {
				da da = das[0];
				da da_ = das[1];
				da da_1 = das[2];
				if (da != null) {
					da.a(class_q);
					int i = 0;
					int j = 0;
					int k = 0;
					int i1 = 0;
					hi[] his = da.c();
					qg[] qgs = da.f();
					if (qgs != null) {
						i1++;
						k += qgs.length;
					}
					if (his != null) {
						i += his.length;
						j++;
					}
					hi[] his_ = null;
					qg[] qgs_ = null;
					if (da_ != null) {
						da_.a(class_q);
						his_ = da_.c();
						qgs_ = da_.f();
					}
					if (qgs_ != null) {
						i1++;
						k += qgs_.length;
					}
					if (his_ != null) {
						i += his_.length;
						j++;
					}
					hi[] his_1 = null;
					qg[] qgs_1 = null;
					if (da_1 != null) {
						da_1.a(class_q);
						his_1 = da_1.c();
						qgs_1 = da_1.f();
					}
					if (qgs_1 != null) {
						k += qgs_1.length;
						i1++;
					}
					if (his_1 != null) {
						i += his_1.length;
						j++;
					}
					if ((this.tq_ == null || this.tq_.k) && (j > 0 || i1 > 0)) {
						this.tq_ = tq.a(pm.currentTimedTicks, true);
					}
					if (this.tq_ != null) {
						hi[] his_2;
						if (j != 1) {
							his_2 = new hi[i];
							int j1 = 0;
							if (his != null) {
								co.a(his, 0, his_2, j1, his.length);
								j1 += his.length;
							}
							if (his_ != null) {
								co.a(his_, 0, his_2, j1, his_.length);
								j1 += his_.length;
							}
							if (his_1 != null) {
								co.a(his_1, 0, his_2, j1, his_1.length);
							}
						} else if (his_ == null) {
							if (his_1 == null) {
								his_2 = his;
							} else {
								his_2 = his_1;
							}
						} else {
							his_2 = his_;
						}
						qg[] qgs_2;
						if (i1 == 1) {
							if (qgs_ == null) {
								if (qgs_1 == null) {
									qgs_2 = qgs;
								} else {
									qgs_2 = qgs_1;
								}
							} else {
								qgs_2 = qgs_;
							}
						} else {
							qgs_2 = new qg[k];
							int j1 = 0;
							if (qgs != null) {
								co.a(qgs, 0, qgs_2, j1, qgs.length);
								j1 += qgs.length;
							}
							if (qgs_ != null) {
								co.a(qgs_, 0, qgs_2, j1, qgs_.length);
								j1 += qgs_.length;
							}
							if (qgs_1 != null) {
								co.a(qgs_1, 0, qgs_2, j1, qgs_1.length);
							}
						}
						this.tq_.a(class_r, (long) pm.currentTimedTicks, his_2, qgs_2, false);
					}
					this.Hc = true;
				}
			} else if (this.tq_ != null) {
				this.tq_.a((long) pm.currentTimedTicks);
			}
			Z++;
			if (this.tq_ != null) {
				this.tq_.a(this.height, this.B, this.I, this.x, this.y);
			}
		}
	}

	public final void a(boolean bool, int i) {
		Rb++;
		cg cg = k(32195);
		if (cg.l != 0 || this.Zb != 0) {
			this.class_kd.a(!bool);
			if (bool) {
				a(59);
			}
			int j = i - this.class_kd.i & 0x3fff;
			if (j <= 8192) {
				this.Gb = j + this.class_kd.i;
			} else {
				this.Gb = j + (this.class_kd.i - 16384);
			}
		}
	}

	public Entity() {
		super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		this.P = -1;
		this.V = false;
		this.gb = true;
		this.mb = 0;
		this.U = 0;
		this.cb = null;
		this.graphicsId = -1;
		this.nb = 0;
		this.Hb = 0;
		zb = 1;
		this.Y = -1000;
		this.qb = 0;
		this.sb = -1;
		this.Ab = null;
		this.Q = 100;
		this.kb = false;
		this.hitDamages = new int[4];
		this.Ib = 0;
		this.counters = new int[4];
		this.Kb = 0;
		this.jb = 0;
		this.Zb = 256;
		this.cc = 0;
		this.ans = new an[12];
		this.Xb = (byte) 0;
		this.hitTypes = new int[4];
		this.Ob = -1;
		this.db = 0;
		this.hc = -1;
		this.Jb = 0;
		this.ic = 0;
		this.faceEntityID = -1;
		this.yb = -1;
		this.oc = 0;
		this.Cb = -1;
		this.kc = 0;
		this.rc = 0;
		this.hitRemovalTime = -1000;
		this.Bc = -1;
		this.Ac = -32768;
		this.jc = 0;
		this.Sb = 0;
		this.yc = 0;
		this.graphicsId_ = -1;
		this.pc = 0;
		this.zc = -1;
		this.vc = 0;
		this.class_kd = new Class_kd();
		class_kd_ = new Class_kd();
		class_kd_1 = new Class_kd();
		this.das = new da[3];
		this.Fc = 0;
		this.Gc = 0;
		this.regionLocalY = new int[10];
		this.Hc = false;
		this.moveTypes = new byte[10];
		this.Nc = 0;
		this.Kc = 0;
		this.regionLocalX = new int[10];
		this.Oc = false;
	}

    /**
     * Called by the command (rebuild).
     * @param b
     */
	public static void rebuildMap(byte b) {
		rb++;
		dg.Cb = -1;
		tl.e = null;
		if (b > -59) {
			tc = -122;
		}
	}

	int getNPCDefinition(int i) {
		if (i != -1) {
			this.hitBarScale = -92;
		}
		O++;
		return zb;
	}

	public static void cancel(boolean bool) {
		Lb++;
		oca.m = new bfa(GameText.cancelText.getString(cba.languageID), "", da.e, 1003, -1, 0L, 0, 0, true, bool);
	}

	public int j(int i) {
		uc++;
		cg cg = k(i + 14629);
		if ((~cg.a) != 0) {
			return cg.a;
		}
		if (i != 17566) {
			this.Zb = 17;
		}
		if (this.Ac == -32768) {
			return 200;
		}
		return -this.Ac;
	}

	public final cg k(int i) {
		qc++;
		if (i != 32195) {
			k(55);
		}
		int j = a(false);
		if (j != -1) {
			return hs.f.a(j, (byte) 99);
		}
		return av.cg;
	}

	public final void a(int orientation, int i, boolean bool) {
		Ub++;
		cg cg = k(32195);
		if (bool || cg.l != 0 || this.Zb != 0) {
			this.Gb = 0x3fff & orientation;
			if (i != 1003) {
				this.moveTypes = null;
			}
			this.class_kd.a(i ^ 0x398, this.Gb);
		}
	}

	public final void a(byte b, da da) {
		mc++;
		int i = class_kd_.i;
		int j = class_kd_1.i;
		if (i != 0 || j != 0) {
			int k = da.J() / 2;
			da.oa(0, -k, 0);
			da.W(i & 0x3fff);
			da.MA(j & 0x3fff);
			da.oa(0, k, 0);
		}
		if (b != -34) {
			applyGraphics(-66, -60, (byte) 69, -35, true);
		}
	}

	public final int c(int i) {
		T++;
		if (i != -22496) {
			this.xc = -44;
		}
		return this.cc;
	}
}
