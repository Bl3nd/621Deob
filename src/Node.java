/* Class_d - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node {
	
	static pj a;
	static String[] b;
	static int c;
	Node next;
	static int e;
	static int f;
	long nodeID;
	static int h;
	Node previous;
	static GameInPacket bigConfigPacket = new GameInPacket(93, 6);

	public static void d(int i) {
		a = null;
		b = null;
		if (i != -7141)
			d(103);
		bigConfigPacket = null;
	}

	final void unlink(int i) {
		f++;
		if (i <= -8 && ((Node) this).next != null) {
			((Node) ((Node) this).next).previous = ((Node) this).previous;
			((Node) ((Node) this).previous).next = ((Node) this).next;
			((Node) this).next = null;
			((Node) this).previous = null;
		}
	}

	static final int[] f(int i) {
		h++;
		if (i >= -81)
			d(-113);
		return new int[] { od.smallFont, iq.plainFont, la.boldFont};
	}

	final boolean g(int i) {
		e++;
		int i_0_ = 32 / ((54 - i) / 62);
		if (((Node) this).next == null)
			return false;
		return true;
	}

	static final void h(int i) {
		c++;
		if (i != -21715)
			b = null;
		for (nv var_nv = (nv) Class_u.L.a((int) 120); var_nv != null; var_nv = (nv) Class_u.L
				.b((byte) 85)) {
			if (((nv) var_nv).n > 0)
				((nv) var_nv).n--;
			if (((nv) var_nv).n == 0) {
				if (((nv) var_nv).p < 0
						|| qda.a((byte) -110, ((nv) var_nv).r, ((nv) var_nv).p)) {
					nda.a(((nv) var_nv).o, -1, ((nv) var_nv).q, (byte) 68,
							((nv) var_nv).u, ((nv) var_nv).k, ((nv) var_nv).r,
							((nv) var_nv).t, ((nv) var_nv).p);
					var_nv.unlink(-95);
				}
			} else {
				if (((nv) var_nv).s > 0)
					((nv) var_nv).s--;
				if (((nv) var_nv).s == 0
						&& ((nv) var_nv).u >= 1
						&& ((nv) var_nv).k >= 1
						&& Class_hc.e - 2 >= ((nv) var_nv).u
						&& bw.v - 2 >= ((nv) var_nv).k
						&& (((nv) var_nv).m < 0 || qda.a((byte) -110,
								((nv) var_nv).l, ((nv) var_nv).m))) {
					nda.a(((nv) var_nv).o, -1, ((nv) var_nv).v, (byte) 68,
							((nv) var_nv).u, ((nv) var_nv).k, ((nv) var_nv).l,
							((nv) var_nv).t, ((nv) var_nv).m);
					((nv) var_nv).s = -1;
					if (((nv) var_nv).m == ((nv) var_nv).p
							&& ((nv) var_nv).p == -1)
						var_nv.unlink(-55);
					else if (((nv) var_nv).p == ((nv) var_nv).m
							&& ((nv) var_nv).v == ((nv) var_nv).q
							&& ((nv) var_nv).r == ((nv) var_nv).l)
						var_nv.unlink(-50);
				}
			}
		}
	}

	public Node() {
		/* empty */
	}
}
