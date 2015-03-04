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

	public static void nullLoader(int i) {
		a = null;
		b = null;
		if (i != -7141) {
            nullLoader(103);
        }
		bigConfigPacket = null;
	}

	public final void unlink(int i) {
		f++;
		if (i <= -8 && this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.next = null;
			this.previous = null;
		}
	}

	public static int[] getFonts(int i) {
		h++;
		if (i >= -81) {
            nullLoader(-113);
        }
		return new int[] { od.smallFont, iq.plainFont, la.boldFont};
	}

	public final boolean isNextNode(int i) {
		e++;
		if (this.next == null) {
            return false;
        }
		return true;
	}

	public static void h(int i) {
		c++;
		if (i != -21715) {
            b = null;
        }
		for (nv nv = (nv) Class_u.L.a(120); nv != null; nv = (nv) Class_u.L.b((byte) 85)) {
			if (nv.n > 0) {
                nv.n--;
            }
			if (nv.n == 0) {
				if (nv.p < 0 || qda.a((byte) -110, nv.r, nv.p)) {
					nda.a(nv.o, -1, nv.q, (byte) 68, nv.u, nv.k, nv.r, nv.t, nv.p);
					nv.unlink(-95);
				}
			} else {
				if (nv.s > 0) {
                    nv.s--;
                }
				if (nv.s == 0 && nv.u >= 1 && nv.k >= 1 && Class_hc.e - 2 >= nv.u && bw.v - 2 >= nv.k
                        && (nv.m < 0 || qda.a((byte) -110, nv.l, nv.m))) {
					nda.a(nv.o, -1, nv.v, (byte) 68, nv.u, nv.k, nv.l, nv.t, nv.m);
					nv.s = -1;
					if (nv.m == nv.p && nv.p == -1) {
                        nv.unlink(-55);
                    } else if (nv.p == nv.m && nv.v == nv.q && nv.r == nv.l) {
                        nv.unlink(-50);
                    }
				}
			}
		}
	}

	public Node() {
		/* empty */
	}
}
