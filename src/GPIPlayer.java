/* qq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GPIPlayer {
	
	static qfa a = new qfa("", 17);
	boolean b;
	int orientation;
	int faceEntityID;
	static int e;
	static pda[] pdas = new pda[35];
	int locationHash;

	public static void nullLoader(boolean bool) {
		a = null;
		pdas = null;
		if (bool != true) {
			nullLoader(false);
		}
	}

	public GPIPlayer() {
		/* empty */
	}
}
