/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GraphicsCard {
	
	int version;
	String name;
	int vendor;
	String device;
	static int e;
	long driverVersion;

	public static final boolean a(int i, int j, int k) {
		if (j != 25728) {
			return false;
		}
		e++;
		if (!((0x60000 & i) != 0 | Class_hb.a(i, (byte) -93, k)) && !oga.b(128, i, k)) {
			return false;
		}
		return true;
	}

	public GraphicsCard(int vendor, String name, int version, String device, long driverVersion) {
		((GraphicsCard) this).device = device;
		((GraphicsCard) this).vendor = vendor;
		((GraphicsCard) this).version = version;
		((GraphicsCard) this).driverVersion = driverVersion;
		((GraphicsCard) this).name = name;
	}
}
