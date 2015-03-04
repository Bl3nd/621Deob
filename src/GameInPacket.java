/* wp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GameInPacket {

    public static int a;
    public int packetSize;
    public static int[][] ints;
    public static ih d;
    public static int getPacketIDs;
    public static int toStrings;
	private int packetID;
    public static int[] ints1 = new int[16384];
    public static int[] ints2 = new int[16384];
    public static int j_;
    public static tb tb;
    public static boolean l;

	public final int getPacketID() {
		getPacketIDs++;
		return packetID;
	}

	public final String toString() {
		toStrings++;
		throw new IllegalStateException();
	}

	public static boolean a(int i, int j, int i1, int j1, byte[] buf, int k1) {
		a++;
		int i2 = i % j;
		int j2;
		if (i2 != 0) {
			j2 = j - i2;
		} else {
			j2 = 0;
		}
		int k2 = -((j + k1 - 1) / j);
		int i3 = -((j + (i - 1)) / j);
		for (int j3 = k2; j3 < 0; j3++) {
			for (int k3 = i3; k3 < 0; k3++) {
				if (buf[j1] == 0) {
					return true;
				}
				j1 += j;
			}
			j1 -= j2;
			if (buf[j1 - 1] == 0) {
				return true;
			}
			j1 += i1;
		}
		return false;
	}

	public static void nullLoader() {
		d = null;
		ints1 = null;
		ints2 = null;
		ints = null;
		tb = null;
	}

	public static void a(int y, int height, int j, int x) {
        int i = 1; //Was parameter
		j_++;
		for (ql ql = (ql) pu.o.a(122); ql != null; ql = (ql) pu.o.b((byte) 60)) {
			hn.a(j, 0, ql, x, y, height);
		}
		for (ql ql = (ql) bea.h.a(84); ql != null; ql = (ql) bea.h.b((byte) 32)) {
			int k1 = 1;
			cg cg = ql.H.k(32195);
			if (!ql.H.V) {
				if (cg.h != ql.H.Bc && cg.g != ql.H.Bc && ql.H.Bc != cg.X && ql.H.Bc != cg.M) {
					if (ql.H.Bc == cg.j || cg.e == ql.H.Bc || cg.u == ql.H.Bc || cg.m == ql.H.Bc) {
						k1 = 3;
					}
				} else {
					k1 = 2;
				}
			} else {
				k1 = 0;
			}
			if (ql.A != k1) {
				int i2 = te.a(false, ql.H);
				NPCDef npcDef = ql.H.npcDef;
				if (npcDef.L != null) {
					npcDef = npcDef.a(-4261, cp.e);
				}
				if (npcDef != null && i2 != -1) {
					if (i2 != ql.p || npcDef.v != ql.x) {
						if (ql.K != null) {
							ej.r.a(ql.K);
							ql.K = null;
						}
						ql.x = npcDef.v;
						ql.p = i2;
						ql.r = null;
						ql.n = null;
					}
				} else {
					ql.p = -1;
					ql.x = false;
				}
				ql.A = k1;
			}
			ql.xLoc = ql.H.locX;
			ql._x = ql.H.locX + (ql.H.getNPCDefinition(-1) << 8);
			ql.yLoc = ql.H.locY;
			ql._y = ql.H.locY + (ql.H.getNPCDefinition(-1) << 8);
			hn.a(j, 0, ql, x, y, height);
		}
		for (ql ql = (ql) gl.O.b((byte) 124); ql != null; ql = (ql) gl.O.b(12561)) {
			int k1 = 1;
			cg cg = ql.F.k(32195);
			if (ql.F.V) {
				k1 = 0;
			} else if (cg.h == ql.F.Bc || cg.g == ql.F.Bc || ql.F.Bc == cg.X || cg.M == ql.F.Bc) {
				k1 = 2;
			} else if (ql.F.Bc == cg.j || ql.F.Bc == cg.e || ql.F.Bc == cg.u || ql.F.Bc == cg.m) {
				k1 = 3;
			}
			if (k1 != ql.A) {
				int i2 = wea.a(ql.F, false);
				if (i2 != ql.p || !ql.x != !ql.F.sd) {
					if (ql.K != null) {
						ej.r.a(ql.K);
						ql.K = null;
					}
					ql.p = i2;
					ql.n = null;
					ql.x = ql.F.sd;
					ql.r = null;
				}
				ql.A = k1;
			}
			ql.xLoc = ql.F.locX;
			ql._x = ql.F.locX + (ql.F.getNPCDefinition(-1) << 8);
			ql.yLoc = ql.F.locY;
			ql._y = ql.F.locY + (ql.F.getNPCDefinition(i - 2) << 8);
			hn.a(j, i - 1, ql, x, y, height);
		}
	}

	public GameInPacket(int packetID, int packetSize) {
		this.packetSize = packetSize;
		this.packetID = packetID;
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			ints1[i] = (int) (Math.sin(d * (double) i) * 16384.0);
			GameInPacket.ints2[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
		tb = new tb(8);
		l = false;
	}
}
