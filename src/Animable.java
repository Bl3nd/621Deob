/* lo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Animable extends Interactable {
	
	public int g;
    public byte height_;
    public boolean i;
    public int j;
    public static int k;
    public static pl pl;
    public int locX;
    public int var_n;
    public int o;
    public int locY;
    public static String[][] q = {{ "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" }};
    public static int[] r = new int[14];
    public static pl pl_;
    public static int t;
    public static float u;
    public byte height;

	abstract int a(gga[] ggas, int i);

	public static int a(int i, Class_ec class_ec) {
		if (i != 6407) {
			nullLoader(-81);
		}
		k++;
		if (uca.d != class_ec) {
			if (class_ec != nda.h) {
				if (class_ec == NPCDef.hb) {
                    return 6406;
                }
				if (Class_jc.S != class_ec) {
					if (NPC.Xc != class_ec) {
						if (dt.zb == class_ec) {
							return 6145;
						}
					} else {
						return 6410;
					}
				} else {
					return 6409;
				}
			} else {
				return 6408;
			}
		} else {
			return 6407;
		}
		throw new IllegalStateException();
	}

	abstract og a(boolean bool, Class_r class_r);

	abstract boolean e(byte b);

	abstract int c(int i);

	abstract boolean f(byte b);

	public final int a(gga[] ggas, int x, int y) {
		t++;
		long location = tba.n[this.height][x][y];
		long l = 0L;
		int i = 0;
		for (/**/; l <= 48L; l += 16L) {
			int j = (int) (0xffffL & location >> (int) l);
			if (j <= 0) {
				break;
			}
			ggas[i++] = Class_j.l[j - 1].m;
		}
		for (int index = i; index < 4; index++) {
			ggas[index] = null;
		}
		return i;
	}

	abstract void sendIllegalStateException(int i);

	abstract void b(boolean bool, Class_r class_r);

	public static void nullLoader(int i) {
		q = null;
		pl_ = null;
		r = null;
		pl = null;
		if (i != 32064) {
			a(-12, null);
		}
	}

	abstract void throwIllegalStateException(boolean bool, int i, byte b, Class_r class_r, Animable animable, int j, int k);

	abstract sd a(Class_r class_r, int i);

	abstract boolean f(int i);

	abstract int g(int i);

	abstract boolean g(byte b);

	abstract boolean h(byte b);

	abstract boolean a(int i, int j, Class_r class_r, int k);

	public Animable() {
		/* empty */
	}
}
