/* cc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cc implements fa
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int[] f;
    static int g;
    static int h;
    static int[] i;
    static int j;
    static int k;
    private vca[] l;
    private int m;
    private pl n;
    static int o;
    private pl p;
    private lh q = new lh(256);
    
    public final boolean a(boolean bool, int i) {
	e++;
	hp var_hp = a(19579, i);
	if (bool != false)
	    return false;
	if (var_hp == null || !var_hp.a(0, n, this))
	    return false;
	return true;
    }
    
    public final int[] a(int i, float f, boolean bool, int i_0_, int i_1_,
			 int i_2_) {
	if (i_1_ != -5969)
	    return null;
	j++;
	return a(19579, i).a((byte) 68, n, (double) f, i_2_, bool,
			     ((vca) l[i]).j, i_0_, this);
    }
    
    private final hp a(int i, int i_3_) {
	o++;
	if (i != 19579)
	    a(-0.6752861F, 82, (byte) 27, true, -112, 121);
	pp var_pp = q.a((byte) 113, (long) i_3_);
	if (var_pp != null)
	    return (hp) var_pp;
	byte[] is = p.a((int) 126, i_3_);
	if (is == null)
	    return null;
	hp var_hp = new hp(new BytesParser(is));
	q.a(var_hp, false, (long) i_3_);
	return var_hp;
    }
    
    public final float[] a(int i, int i_4_, boolean bool, float f, int i_5_,
			   int i_6_) {
	b++;
	if (i < 83)
	    l = null;
	return a(19579, i_6_).a(((vca) l[i_6_]).j, i_4_, 0, this, n, i_5_);
    }
    
    static final void a(boolean bool) {
	k++;
	FileOnDisk var_cu = null;
	try {
	    var_cu = Signlink.createDatFile("2", (byte) -101);
	    BytesParser var_es = new BytesParser(6 * iv.t + 3);
	    var_es.writeByte((int) 1, (byte) -127);
        System.out.println("[cc] method height");
	    var_es.writeShort(iv.t, 13469);
	    for (int i = 0; i < rr.h.length; i++) {
		if (jm.i[i]) {
		    var_es.writeShort(i, 13469);
		    var_es.writeInt(rr.h[i], (int) -94);
		}
	    }
	    var_cu.write(0, (byte) 55, ((BytesParser) var_es).pos, ((BytesParser) var_es).bytes);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (var_cu != null)
		var_cu.close((byte) -127);
	} catch (Exception exception) {
	    /* empty */
	}
	hs.n = us.a(119);
	dv.d = bool;
    }
    
    public final int a(int i) {
	if (i != -16330)
	    a(-56, -128, false, 2.7798905F, 123, 54);
	a++;
	return m;
    }
    
    public final vca a(int i, byte i_7_) {
	if (i_7_ != 86)
	    return null;
	d++;
	return l[i];
    }
    
    static final void a(boolean bool, int i, Player mouseOverPlayer) {
	c++;
	if (i == 6592 && mu.j < 400) {
	    if (up.thisPlayer == mouseOverPlayer) {
		if (ba.c && (0x10 & Class_jc.db) != 0) {
		    lea.setClickMenuOption(0, false, 0, -1, true, uk.d, i - 6466, 0L,
			  Class_ag.k + " -> <col=ffffff>" + GameText.selfText.getString((byte) 96, cba.languageID),
			  2, Class_kd.b);
		    nu.l++;
		}
	    } else {
		String string;
		if (((Player) mouseOverPlayer).ud != 0) {
		    if ((((Player) mouseOverPlayer).ud ^ 0xffffffff) != 0)
			string = (mouseOverPlayer.getUserDisplayName((byte) -124, true) + " ("
				  + GameText.skillText.getString((byte) -55, cba.languageID)
				  + ((Player) mouseOverPlayer).ud + ")");
		    else
			string = mouseOverPlayer.getUserDisplayName((byte) -127, true);
		} else {
		    boolean bool_8_ = true;
		    if ((((Player) up.thisPlayer).ed ^ 0xffffffff) != 0
			&& (((Player) mouseOverPlayer).ed ^ 0xffffffff) != 0) {
			int i_9_ = (((Player) up.thisPlayer).combatLevel <= ((Player) mouseOverPlayer).combatLevel
				    ? ((Player) mouseOverPlayer).combatLevel : ((Player) up.thisPlayer).combatLevel);
			int i_10_ = (((Player) mouseOverPlayer).ed > ((Player) up.thisPlayer).ed
				     ? ((Player) up.thisPlayer).ed : ((Player) mouseOverPlayer).ed);
			int i_11_ = i_10_ + (10 * i_9_ / 100 + 5);
			int i_12_ = ((Player) up.thisPlayer).combatLevel - ((Player) mouseOverPlayer).combatLevel;
			if (i_12_ < 0)
			    i_12_ = -i_12_;
			if (i_11_ < i_12_)
			    bool_8_ = false;
		    }
		    String string_13_
			= (Class_pf.O != me.q ? GameText.levelText.getString((byte) -96, cba.languageID)
			   : GameText.ratingText.getString((byte) 115, cba.languageID));
		    if (((Player) mouseOverPlayer).Md > ((Player) mouseOverPlayer).combatLevel)
			string
			    = (mouseOverPlayer.getUserDisplayName((byte) -126, true)
			       + (!bool_8_ ? "<col=ffffff>"
				  : cq.getColorForPlayerName(((Player) mouseOverPlayer).combatLevel, true,
					 ((Player) up.thisPlayer).combatLevel))
			       + " (" + string_13_ + ((Player) mouseOverPlayer).combatLevel + "+"
			       + (((Player) mouseOverPlayer).Md - ((Player) mouseOverPlayer).combatLevel) + ")");
		    else
			string
			    = (mouseOverPlayer.getUserDisplayName((byte) -123, true)
			       + (!bool_8_ ? "<col=ffffff>"
				  : cq.getColorForPlayerName(((Player) mouseOverPlayer).combatLevel, true,
					 ((Player) up.thisPlayer).combatLevel))
			       + " (" + string_13_ + ((Player) mouseOverPlayer).combatLevel + ")");
		}
		if (ba.c && !bool && (0x8 & Class_jc.db) != 0) {
		    lea.setClickMenuOption(0, false, 0, -1, true, uk.d, 126,
			  (long) ((Entity) mouseOverPlayer).lb,
			  Class_ag.k + " -> <col=ffffff>" + string, 4, Class_kd.b);
		    gba.y++;
		}
		if (!bool) {
		    for (int i_14_ = 7; i_14_ >= 0; i_14_--) {
			if (GameOutPacket.m[i_14_] != null) {
			    short i_15_ = 0;
			    if (me.q == wa.t
				&& (GameOutPacket.m[i_14_].equalsIgnoreCase
				    (GameText.attackText.getString((byte) 113, cba.languageID)))) {
				if (((Player) mouseOverPlayer).combatLevel > ((Player) up.thisPlayer).combatLevel)
				    i_15_ = (short) 2000;
				if (((Player) up.thisPlayer).Gd != 0
				    && ((Player) mouseOverPlayer).Gd != 0) {
				    if (((Player) up.thisPlayer).Gd == ((Player) mouseOverPlayer).Gd)
					i_15_ = (short) 2000;
				    else
					i_15_ = (short) 0;
				}
			    } else if (Class_q.d[i_14_])
				i_15_ = (short) 2000;
			    short i_16_ = (short) (mo.G[i_14_] + i_15_);
			    int i_17_ = ((kl.k[i_14_] ^ 0xffffffff) != 0
					 ? kl.k[i_14_] : jt.b);
			    on.l++;
			    lea.setClickMenuOption(0, false, 0, -1, true, i_17_, 126,
				  (long) ((Entity) mouseOverPlayer).lb,
				  "<col=ffffff>" + string, i_16_,
				  GameOutPacket.m[i_14_]);
			}
		    }
		} else
		    lea.setClickMenuOption(0, true, 0, 0, false, -1, 126, 0L, "", -1,
			  "<col=cccccc>" + string);
		if (!bool) {
		    for (bfa var_bfa = (bfa) oba.I.a((int) 121);
			 var_bfa != null; var_bfa = (bfa) oba.I.b((byte) 47)) {
			if (((bfa) var_bfa).v == 10) {
			    ((bfa) var_bfa).p = "<col=ffffff>" + string;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    public final int[] a(float f, int i, byte i_18_, boolean bool, int i_19_,
			 int i_20_) {
	g++;
	if (i_18_ < 13)
	    return null;
	return a(19579, i_20_).a(this, i, ((vca) l[i_20_]).j, n, i_19_,
				 (double) f, -126);
    }
    
    public static void b(boolean bool) {
	i = null;
	f = null;
	if (bool != true)
	    a(true, -50, null);
    }
    
    cc(pl var_pl, pl var_pl_21_, pl var_pl_22_) {
	p = var_pl_21_;
	n = var_pl_22_;
	BytesParser var_es = new BytesParser(var_pl.b(0, -126, 0));
	m = var_es.readShort(13111);
	l = new vca[m];
	for (int i = 0; m > i; i++) {
	    if (var_es.readUnsignedByte(-9268) == 1)
		l[i] = new vca();
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).u = var_es.readUnsignedByte(-9268) == 0;
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).e = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).p = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).x = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).f = var_es.readByte(-20933);
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).q = var_es.readByte(-20933);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).i = var_es.readByte(-20933);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).w = var_es.readByte(-20933);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).v = (short) var_es.readShort(13111);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).n = var_es.readByte(-20933);
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).c = var_es.readByte(-20933);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).h = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).j = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).g = var_es.readByte(-20933);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).m = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).r = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).t = var_es.readUnsignedByte(-9268) == 1;
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).a = var_es.readUnsignedByte(-9268);
	}
	for (int i = 0; m > i; i++) {
	    if (l[i] != null)
		((vca) l[i]).o = var_es.readInt(82);
	}
	for (int i = 0; i < m; i++) {
	    if (l[i] != null)
		((vca) l[i]).s = var_es.readUnsignedByte(-9268) == 1;
	}
    }
}
