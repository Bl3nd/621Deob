/* pea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pea
{
    boolean a;
    pm[] b;
    static int c;
    static boolean d = false;
    pm[] e = null;
    gba f;
    static int g;
    gba h;
    gba i = null;
    
    static final void a(String string, int i) {
	g++;
	ow.settings = string;
	if (vj.applet != null) {
	    try {
		String string_0_ = vj.applet.getParameter("cookieprefix");
		if (i != 7628)
		    d = true;
		String string_1_ = vj.applet.getParameter("cookiehost");
		String string_2_
		    = (string_0_ + "settings=" + string
		       + "; version=1; path=/; domain=" + string_1_);
		if (string.length() == 0)
		    string_2_
			+= "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
		else
		    string_2_ += ("; Expires="
				  + er.a(us.getCurrentTime(105) + 94608000000L, (byte) 117)
				  + "; Max-Age=" + 94608000L);
		rp.a("document.cookie=\"" + string_2_ + "\"", (byte) -69,
		     vj.applet);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    pea(qj var_qj) {
	((pea) this).f = null;
	((pea) this).h = null;
	((pea) this).b = null;
	((pea) this).a = ((qj) var_qj).Bg;
	fca.a(false, var_qj);
	if (!((pea) this).a) {
	    ((pea) this).e = new pm[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is
		    = id.a(32768, (byte) 121, 128 * (128 * i) * 2, Interactable.d);
		((pea) this).e[i] = new pm(var_qj, 3553, 6410, 128, 128, true,
					   is, 6410, false);
	    }
	    ((pea) this).b = new pm[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = id.a(32768, (byte) 121, 2 * i * 128 * 128, tp.a);
		((pea) this).b[i] = new pm(var_qj, 3553, 6410, 128, 128, true,
					   is, 6410, false);
	    }
	} else {
	    byte[] is = wi.a(-7374, false, Interactable.d);
	    ((pea) this).i = new gba(var_qj, 6410, 128, 128, 16, is, 6410);
	    is = wi.a(-7374, false, tp.a);
	    ((pea) this).f = new gba(var_qj, 6410, 128, 128, 16, is, 6410);
	    gk var_gk = ((qj) var_qj).ie;
	    if (var_gk.a((byte) -125)) {
		is = wi.a(-7374, false, bg.b);
		((pea) this).h = new gba(var_qj, 6408, 128, 128, 16);
		gba var_gba = new gba(var_qj, 6409, 128, 128, 16, is, 6409);
		if (!var_gk.a(((pea) this).h, var_gba, 2.0F, (byte) -113)) {
		    ((pea) this).h.b((byte) -9);
		    ((pea) this).h = null;
		} else
		    ((pea) this).h.c(9566);
		var_gba.b((byte) -67);
	    }
	}
    }
    
    static {
	c = 0;
    }
}
