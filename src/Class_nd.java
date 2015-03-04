/* Class_nd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_nd extends Node
{
    static fh k = new fh(5, 4);
    static int l;
    long m;
    static pl n;
    static sa o;
    static pl p;
    
    public static void a(int i) {
	n = null;
	if (i == 2650) {
	    p = null;
	    o = null;
	    k = null;
	}
    }
    
    static final void a(boolean bool, String string, int i) {
	l++;
	if (string != null) {
	    if (dba.l >= 100)
		cba.a(4, false, GameText.ignoreListIsFull.getString(cba.languageID));
	    else {
		int i_0_ = 49 / ((-55 - i) / 37);
		String string_1_ = kk.a(string, true);
		if (string_1_ != null) {
		    for (int i_2_ = 0; i_2_ < dba.l; i_2_++) {
			String string_3_ = kk.a(nh.l[i_2_], true);
			if (string_3_ != null && string_3_.equals(string_1_)) {
			    cba.a(4, false,
				  string + GameText._alreadyOnIgnoreList.getString(cba.languageID));
			    return;
			}
			if (mba.a[i_2_] != null) {
			    String string_4_ = kk.a(mba.a[i_2_], true);
			    if (string_4_ != null
				&& string_4_.equals(string_1_)) {
				cba.a(4, false,
				      string + GameText._alreadyOnIgnoreList.getString(cba.languageID));
				return;
			    }
			}
		    }
		    for (int i_5_ = 0; i_5_ < rba.l; i_5_++) {
			String string_6_ = kk.a(lfa.f[i_5_], true);
			if (string_6_ != null && string_6_.equals(string_1_)) {
			    cba.a(4, false, (GameText.pleaseRemove_1.getString(cba.languageID) + string
					     + GameText.fromYourFriendsListFirst.getString(cba.languageID)));
			    return;
			}
			if (nj.l[i_5_] != null) {
			    String string_7_ = kk.a(nj.l[i_5_], true);
			    if (string_7_ != null
				&& string_7_.equals(string_1_)) {
				cba.a(4, false,
				      (GameText.pleaseRemove_1.getString(cba.languageID) + string
				       + GameText.fromYourFriendsListFirst.getString(cba.languageID)));
				return;
			    }
			}
		    }
		    if (kk.a(((Player) up.thisPlayer).displayName, true).equals(string_1_))
			cba.a(4, false, GameText.cannotAddYourselfToIngoreList.getString(cba.languageID));
		    else {
			uc.f++;
			tba var_tba = jga.sendGameOutPacket(mg.r, pca.isaac, (byte) 112);
			((tba) var_tba).loginStream.writeByte(cq.a(string, (byte) 2) + 1,
					    (byte) -118);
			((tba) var_tba).loginStream.writeString(string, -19);
			((tba) var_tba).loginStream.writeByte((int) (bool ? 1 : 0), (byte) -113);
			ud.a(var_tba, (byte) -36);
		    }
		}
	    }
	}
    }
    
    public Class_nd() {
	/* empty */
    }
    
    Class_nd(long l) {
	((Class_nd) this).m = l;
    }
}
