/* sf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sf {
	static tb a = new tb(64);
	static int b;
	static int c;
	static int d;

	static final void a(int i) {
		if (i != -1)
			a = null;
		b++;
		do {
			try {
				if (pj.j == 1) {
					int i_0_ = ou.g.c((int) -128);
					if (i_0_ > 0 && ou.g.a(false)) {
						i_0_ -= ISAAC.q;
						if (i_0_ < 0)
							i_0_ = 0;
						ou.g.b(i - 29, i_0_);
						break;
					}
					ou.g.b(i ^ ~0x20);
					ou.g.a((byte) -108);
					Node.a = null;
					ak.vw = null;
					if (Class_vb.s != null)
						pj.j = 2;
					else
						pj.j = 0;
				}
				if (pj.j != 3)
					break;
				int i_1_ = ou.g.c((int) -114);
				if (i_1_ < uaa.e && ou.g.a(false)) {
					i_1_ += dt.nb;
					if (i_1_ > uaa.e)
						i_1_ = uaa.e;
					ou.g.b(-36, i_1_);
				} else {
					dt.nb = 0;
					pj.j = 0;
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				ou.g.b((int) 32);
				Class_vb.s = null;
				ak.vw = null;
				pj.j = 0;
				Node.a = null;
				break;
			}
			break;
		} while (false);
	}

	public static void a(boolean bool) {
		a = null;
		if (bool != true)
			a = null;
	}

	static final pk a(byte b, int modeWhere) {
		d++;
		int i_3_ = 77 % ((13 - b) / 49);
		pk[] var_pks = as.getPKs();
		for (int index = 0; var_pks.length > index; index++) {
			pk var_pk = var_pks[index];
			if (modeWhere == ((pk) var_pk).a)
				return var_pk;
		}
		return null;
	}

	static final void b(boolean bool) {
		c++;
		sr.U.c((byte) -127);
		gea.m.c((byte) -118);
		up.D.c((byte) 61);
		up.K.c((byte) 92);
		if (bool != false)
			a = null;
	}
}
