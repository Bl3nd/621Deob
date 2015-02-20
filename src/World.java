/* jda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class World {
	String lobbyAddress;
	static float b;
	static int c;
	static int d;
	static int e;
	int worldID;
	int secondPort = 443;
	private boolean h = false;
	int firstPort = 43594;
	private boolean isPort = false;
	static int[] k = new int[5];
	static int l;

	static final int a(String string, int i) {
		l++;
		if (i != -13319)
			a((byte) -83);
		int i_0_ = string.length();
		int i_1_ = 0;
		for (int i_2_ = 0; i_0_ > i_2_; i_2_++)
			i_1_ = (i_1_ << 5) - i_1_ + ou.a((byte) 99, string.charAt(i_2_));
		return i_1_;
	}

	final vfa a(Signlink signlink) {//int i was always 0
		c++;
		/*if (i != 0) {
			writeBytesWithSetOffset((String) null, 72);
		}*/
		return signlink.a(!isPort ? ((World) this).firstPort : ((World) this).secondPort, (byte) -73, h, ((World) this).lobbyAddress);
	}

	public static void a(byte i) {
		k = null;
		if (i != -79)
			a((String) null, 61);
	}

	final boolean a(World var_jda_3_, byte i) {
		if (i != 28)
			a((World) null, (byte) 120);
		e++;
		if (var_jda_3_ == null)
			return false;
		if (((World) var_jda_3_).worldID != ((World) this).worldID
				|| !((World) this).lobbyAddress
						.equals(((World) var_jda_3_).lobbyAddress))
			return false;
		return true;
	}

	final void a(int i) {
		if (i == 0) {
			if (isPort) {
				if (h)
					h = false;
				else
					isPort = false;
			} else {
				h = true;
				isPort = true;
			}
			d++;
		}
	}

	public World() {
		/* empty */
	}
}
