/* rga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GameOutPacket {
	
	static GameInPacket incomingPacket102 = new GameInPacket(102, 12);
	static int getPacketIDs;
	static int c;
	static String[] d = new String[100];
	private int packetID;
	static pl pl;
	static float g = 1.0F;
	static int h;
	static int toStrings;
	static GameInPacket incomingPacket46 = new GameInPacket(46, 4);
	int packetSize;
	static wl wl = new wl("RC", 1);
	static String[] m;
	static float[] n = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
	static GameInPacket incomingPacket59;
	static int p;

	public static final WorldSub a(int i) {
		c++;
		if (ff.s < il.o.length) {
			return il.o[ff.s++];
		}
		@SuppressWarnings("unused")
		int i_0_ = 15 / ((i + 35) / 36);
		
		return null;
	}

	public static final sa a(pl pl, int i, byte b) {
		if (b != 32) {
			return null;
		}
		h++;
		byte[] buf = pl.a((int) 103, i);
		if (buf == null) {
			return null;
		}
		return new sa(buf);
	}

	public static final String a(String[] strings, int i, int j, int k) {
		p++;
		if (i == 0) {
			return "";
		}
		if (i == 1) {
			String string = strings[k];
			if (string == null) {
				return "null";
			}
			return string.toString();
		}
		int i1 = k + i;
		int j1 = 0;
		if (j != 4) {
			return null;
		}
		for (int index = k; i1 > index; index++) {
			String string = strings[index];
			if (string != null) {
				j1 += string.length();
			} else {
				j1 += 4;
			}
		}
		StringBuffer stringbuffer = new StringBuffer(j1);
		for (int index = k; index < i1; index++) {
			String string = strings[index];
			if (string == null) {
				stringbuffer.append("null");
			} else {
				stringbuffer.append(string);
			}
		}
		return stringbuffer.toString();
	}

	public final int getPacketID(int dummy) {
		if (dummy < 68) {
			return 38;
		}
		getPacketIDs++;
		return packetID;
	}

	public static void nullLoader(int i) {
		d = null;
		pl = null;
		m = null;
		if (i != 27598) {
			incomingPacket46 = null;
		}
		wl = null;
		incomingPacket102 = null;
		n = null;
		incomingPacket46 = null;
		incomingPacket59 = null;
	}

	public final String toString() {
		toStrings++;
		throw new IllegalStateException();
	}

	public GameOutPacket(int packetID, int packetSize) {
		((GameOutPacket) this).packetSize = packetSize;
		this.packetID = packetID;
	}

	static {
		m = new String[8];
		incomingPacket59 = new GameInPacket(59, 8);
	}
}
