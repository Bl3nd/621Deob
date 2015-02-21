/* rh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rh extends bm
{
    private waa k;
    private int l;
    static int m;
    private int var_n;
    static Thread o;
    private int p;
    static int q;
    static int r;
    private int s;
    private int t;
    private int u;
    static int v;
    static int w;
    static int[] x;
    static Interface y = null;
    private qj z;
    /*synthetic*/ static Class A;
    
    static final void b(int i) {
	w++;
	if (i <= (Entity.tc ^ 0xffffffff))
	    gca.l = "";
	else {
	    int i_0_ = 0;
	    for (int i_1_ = 0; Node.b.length > i_1_; i_1_++) {
		if ((Node.b[i_1_].indexOf("--> ") ^ 0xffffffff) != 0
		    && ++i_0_ == Entity.tc) {
		    gca.l = Node.b[i_1_]
				.substring(Node.b[i_1_].indexOf(">") + 2);
		    break;
		}
	    }
	}
    }
    
    final waa b(byte i) {
	v++;
	if (k == null) {
	    ip.K[2] = p;
	    fa var_fa = ((Class_r) z).j;
	    ip.K[5] = t;
	    ip.K[3] = var_n;
	    ip.K[1] = s;
	    ip.K[0] = u;
	    ip.K[4] = l;
	    boolean bool = false;
	    int i_2_ = 0;
	    for (int i_3_ = 0; i_3_ < 6; i_3_++) {
		if (!var_fa.a(false, ip.K[i_3_]))
		    return null;
		vca var_vca = var_fa.a(ip.K[i_3_], (byte) 86);
		int i_4_ = !((vca) var_vca).p ? 128 : 64;
		if (i_2_ < i_4_)
		    i_2_ = i_4_;
		if (((vca) var_vca).g > 0)
		    bool = true;
	    }
	    for (int i_5_ = 0; i_5_ < 6; i_5_++)
		nw.b[i_5_]
		    = var_fa.a(ip.K[i_5_], 1.0F, false, i_2_, -5969, i_2_);
	    k = new waa(z, 6407, i_2_, bool, nw.b);
	}
	if (i != 37)
	    return null;
	return k;
    }
    
    static final boolean c(int i) {
	if (i != -8908)
	    b((int) -13);
	q++;
	return n.h;
    }
    
    public static void a(boolean bool) {
	y = null;
	x = null;
	o = null;
	if (bool != false)
	    x = null;
    }
    
    static final void a(int i, String string) {
	m++;
	if (string != null) {
	    if (rba.l >= 200 && !Class_gb.h || rba.l >= 200) {
		cba.a(4, false, GameText.friendsListFullText.getString((byte) -109, cba.languageID));
		String string_6_ = GameText.friendsListFullTextGerman.getString((byte) -113, cba.languageID);
		if (string_6_ != null)
		    cba.a(4, false, string_6_);
	    } else if (i < -100) {
		String string_7_ = kk.a(string, true);
		if (string_7_ != null) {
		    for (int i_8_ = 0; rba.l > i_8_; i_8_++) {
			String string_9_ = kk.a(lfa.f[i_8_], true);
			if (string_9_ != null && string_9_.equals(string_7_)) {
			    cba.a(4, false,
				  string + GameText._alreadyOnFriendsList.getString((byte) 114, cba.languageID));
			    return;
			}
			if (nj.l[i_8_] != null) {
			    String string_10_ = kk.a(nj.l[i_8_], true);
			    if (string_10_ != null
				&& string_10_.equals(string_7_)) {
				cba.a(4, false,
				      string + GameText._alreadyOnFriendsList.getString((byte) -51, cba.languageID));
				return;
			    }
			}
		    }
		    for (int i_11_ = 0; i_11_ < dba.l; i_11_++) {
			String string_12_ = kk.a(nh.l[i_11_], true);
			if (string_12_ != null
			    && string_12_.equals(string_7_)) {
			    cba.a(4, false, (GameText.pleaseRemove_.getString((byte) -52, cba.languageID) + string
					     + GameText._fromYourIngoreListFirst.getString((byte) 90, cba.languageID)));
			    return;
			}
			if (mba.a[i_11_] != null) {
			    String string_13_ = kk.a(mba.a[i_11_], true);
			    if (string_13_ != null
				&& string_13_.equals(string_7_)) {
				cba.a(4, false,
				      (GameText.pleaseRemove_.getString((byte) -35, cba.languageID) + string
				       + GameText._fromYourIngoreListFirst.getString((byte) 127, cba.languageID)));
				return;
			    }
			}
		    }
		    if (kk.a(((Player) up.thisPlayer).displayName, true).equals(string_7_))
			cba.a(4, false, GameText.cannotAddYourselfToFriendsList.getString((byte) -127, cba.languageID));
		    else {
			ki.c++;
			tba var_tba = jga.sendGameOutPacket(in.e, pca.isaac, (byte) 102);
			((tba) var_tba).loginStream.writeByte(cq.a(string, (byte) 2),
					    (byte) -110);
			((tba) var_tba).loginStream.writeString(string, -117);
			ud.a(var_tba, (byte) -36);
		    }
		}
	    }
	}
    }
    
    static final void a(nv var_nv, int i) {
	r++;
	if (ol.p != null) {
	    if (i > -122)
		a((nv) null, 70);
	    vda var_vda = null;
	    if (((nv) var_nv).o == 0)
		var_vda = (vda) Class_nb.a(((nv) var_nv).t, ((nv) var_nv).u,
					   ((nv) var_nv).k);
	    if (((nv) var_nv).o == 1)
		var_vda = (vda) ej.a(((nv) var_nv).t, ((nv) var_nv).u,
				     ((nv) var_nv).k);
	    if (((nv) var_nv).o == 2)
		var_vda = (vda) ik.a(((nv) var_nv).t, ((nv) var_nv).u,
				     ((nv) var_nv).k,
				     A != null ? A : (A = a("vda")));
	    if (((nv) var_nv).o == 3)
		var_vda = (vda) lr.a(((nv) var_nv).t, ((nv) var_nv).u,
				     ((nv) var_nv).k);
	    if (var_vda != null) {
		((nv) var_nv).p = var_vda.b((byte) 127);
		((nv) var_nv).r = var_vda.a((byte) 42);
		((nv) var_nv).q = var_vda.c((byte) -66);
	    } else {
		((nv) var_nv).r = 0;
		((nv) var_nv).p = -1;
		((nv) var_nv).q = 0;
	    }
	}
    }
    
    rh(qj var_qj, int i, int i_14_, int i_15_, int i_16_, int i_17_,
       int i_18_) {
	t = i_18_;
	s = i_14_;
	u = i;
	l = i_17_;
	z = var_qj;
	p = i_15_;
	var_n = i_16_;
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	x = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071,
			36096 };
    }
}
