/* fga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Interactable {
	
	Interactable previousInteractable;
	static int unlinkCount;
	static int[] c = new int[2];
	static Object d;
	static byte[][][] e;
	Interactable nextInteractable;

	public static void nullLoader(byte b) {
		e = null;
		c = null;
		d = null;
	}

	public Interactable() {
		/* empty */
	}

	public final void unlink(int i) {
		unlinkCount++;
		if (this.nextInteractable != null) {
			this.nextInteractable.previousInteractable = this.previousInteractable;
			this.previousInteractable.nextInteractable = this.nextInteractable;
			if (i == 2) {
				this.nextInteractable = null;
				this.previousInteractable = null;
			}
		}
	}
}
