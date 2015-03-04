/* rga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GameOutPacket {

    public static GameInPacket incomingPacket102 = new GameInPacket(102, 12);
    public static int getPacketIDs;
    public static int c;
    public static String[] d = new String[100];
    private int packetID;
    public static pl pl;
    public static float g = 1.0F;
    public static int h;
    public static int toStrings;
    public static GameInPacket incomingPacket46 = new GameInPacket(46, 4);
    public int packetSize;
    public static wl RC = new wl("RC", 1);
    public static String[] m;
    public static float[] n = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
    public static GameInPacket incomingPacket59;
    public static int dataToString;

	public static WorldSub a() {
		c++;
		if (ff.s < il.o.length) {
			return il.o[ff.s++];
		}
		return null;
	}

	public static sa a(pl pl, int i) {
		h++;
		byte[] buf = pl.a(103, i);
		if (buf == null) {
			return null;
		}
		return new sa(buf);
	}

	public static String dataToString(String[] strings, int i, int offset) {
		dataToString++;
		if (i == 0) {
			return "";
		}
		if (i == 1) {
			String string = strings[offset];
			if (string == null) {
				return "null";
			}
			return string;
		}
		int i1 = offset + i;
		int j1 = 0;
		for (int index = offset; i1 > index; index++) {
			String string = strings[index];
			if (string != null) {
				j1 += string.length();
			} else {
				j1 += 4;
			}
		}
		StringBuffer stringbuffer = new StringBuffer(j1);
		for (int index = offset; index < i1; index++) {
			String string = strings[index];
			if (string == null) {
				stringbuffer.append("null");
			} else {
				stringbuffer.append(string);
			}
		}
		return stringbuffer.toString();
	}

	public final int getPacketID() {
		getPacketIDs++;
		return packetID;
	}

	public static void nullLoader() {
		d = null;
		pl = null;
		m = null;
		RC = null;
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
		this.packetSize = packetSize;
		this.packetID = packetID;
	}

	static {
		m = new String[8];
		incomingPacket59 = new GameInPacket(59, 8);
	}
}
