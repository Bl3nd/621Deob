/* iw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class WorldSub extends he {
	int l = -1;
	String m;
	static int n = 0;
	int worldID;
	static Interface[] p;
	static int q;
	String activity;
	static int s;

	static final boolean a(int i, int i_0_, byte i_1_) {
		if (i_1_ != 36)
			return false;
		q++;
		if ((i & 0x100) == 0)
			return false;
		return true;
	}

	public static void e(int i) {
		p = null;
		if (i != 6750)
			p = null;
	}

	final sw d(byte i) {
		s++;
		if (i <= 120)
			d((byte) 43);
		return ida.i[((he) this).b];
	}
}
