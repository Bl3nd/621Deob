/* fga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Interactable {
	
	Interactable interactable;
	static int b;
	static int[] c = new int[2];
	static Object d;
	static byte[][][] e;
	Interactable interactable_;

	public static void nullLoader(byte b) {
		e = null;
		@SuppressWarnings("unused")
		int i_0_ = 40 / ((b - 44) / 51);
		
		c = null;
		d = null;
	}

	public Interactable() {
		/* empty */
	}

	public final void b(int i) {
		b++;
		if (((Interactable) this).interactable_ != null) {
			((Interactable) ((Interactable) this).interactable_).interactable = ((Interactable) this).interactable;
			((Interactable) ((Interactable) this).interactable).interactable_ = ((Interactable) this).interactable_;
			if (i == 2) {
				((Interactable) this).interactable_ = null;
				((Interactable) this).interactable = null;
			}
		}
	}
}
