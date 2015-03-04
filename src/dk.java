/* dk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class dk
{
    static int a;
    private qk b;
    private int c = 0;
    private qj d;
    static int e;
    static int f;
    private qk g;
    static int h;
    static int i;
    static int j;
    static int k;
    static GameInPacket incomingPacket28 = new GameInPacket(28, 3);
    static int m;
    private int n;
    static int o;
    private boolean p;
    static int q;
    static int r;
    static GameInPacket incomingPacket42;
    private Class_ae t;
    private qk u;
    private int v = 0;
    static int w;
    static int x;
    static int y = 0;
    private int z;
    static int A;
    static GameInPacket incomingPacket110;
    private boolean D;
    private int E;
    private boolean F;
    private boolean H;
    private pm I;
    private pm[] J;
    static GameInPacket sendIgnoreListGameInPacket;
    private boolean L;
    private boolean M;
    private pca N;
    private int O;
    static wea P;
    private pca Q;
    
    final void a(int i) {
	J = null;
	I = null;
	a++;
	N = null;
	Q = null;
	u = g = b = null;
	if (!t.b(true)) {
	    for (Node class_d = t.a((int) 99); ((Class_ae) t).o != class_d;
		 class_d = ((Node) class_d).previous)
		((qh) class_d).c(35632);
	}
	n = z = 1;
	if (i != 0)
	    b((byte) -122);
    }
    
    final boolean a(int i, qh var_qh) {
	if (i >= -31)
	    b = null;
	k++;
	if (u != null) {
	    if (var_qh.l(21223) || var_qh.i(0)) {
		t.b(var_qh, (byte) 93);
		b((byte) -47);
		if (b((int) 1)) {
		    if (n != -1 && z != -1)
			var_qh.a(n, z, 124);
		    ((qh) var_qh).o = true;
		    return true;
		}
	    }
	    a((byte) -44, var_qh);
	}
	return false;
    }
    
    final void a(byte i, qh var_qh) {
	if (i != -44)
	    A = 90;
	dk.i++;
	((qh) var_qh).o = false;
	var_qh.c(35632);
	var_qh.unlink(-114);
	b((byte) -47);
    }
    
    static final void handlePlayerUpdateMasks(int dummy, Player p, LoginStream stream, int maskData, int playerID) {
	h++;
	byte i_2_ = -1;
	if ((maskData & 0x20000) != 0) {//Hit2
	    int i_3_ = pm.currentTimedTicks;
	    int damage = stream.readSmart2(-13829);
	    int hitType = stream.readUnsignedNegativeByte((byte) -18);
	    p.applyHit(i_3_, hitType, damage, dummy ^ 0x7d);
	}
	if ((0x2 & maskData) != 0) {//orientation update by entity ID
	    int entityID = stream.readShortReversedFirstByteMinus128_2(true);
	    if (entityID == 65535)
	    	entityID = -1;
	    ((Entity) p).faceEntityID = entityID;
	}
	if ((maskData & 0x100) != 0) {
	    ((Entity) p).cb = stream.readString((byte) 120);
	    if (((Entity) p).cb.charAt(0) == '~') {
	    	((Entity) p).cb = ((Entity) p).cb.substring(1);
			oba.a(((Player) p).playerName, ((Entity) p).cb, 2, -1, p.getDisplayName(false, (byte) -7), 0, p.getUserDisplayName((byte) -126, true));
	    } else if (p == up.thisPlayer) 
	    	oba.a(((Player) p).playerName, ((Entity) p).cb, 2, dummy ^ 0xffffffff, p.getDisplayName(false, (byte) -7), 0, p.getUserDisplayName((byte) -126, true));
	    ((Entity) p).jb = 0;
	    ((Entity) p).vc = 0;
	    ((Entity) p).Q = 150;
	}
	if ((0x1000 & maskData) != 0) {
	    int graphicsID = stream.readShort(13111);
	    if (graphicsID == 65535)
	    	graphicsID = -1;
	    int delayAndHeight = stream.readIntShiftsInOrder_16_24_0_8((int) -117);
	    int rotation = stream.readUnsignedByte(-9268);
	    p.applyGraphics(delayAndHeight, graphicsID, (byte) 20, rotation, true);
	}
	if ((0x8 & maskData) != 0) {
	    int blockLength = stream.readUnsignedNegativeBytePlus128(255);
	    byte[] bytes = new byte[blockLength];
	    BytesParser appearanceStream = new BytesParser(bytes);
	    stream.readBytes2(bytes, dummy ^ 0xffffffff, blockLength, 0);
	    vo.J[playerID] = appearanceStream;
	    p.playerAppearanceUpdate(dummy ^ 0xffffffff, appearanceStream);
	}
	if ((0x2000 & maskData) != dummy)
	    ((Player) p).cd = stream.readUnsignedNegativeByte((byte) -18) == 1;
	if ((0x10 & maskData) != 0) {//Hit1
	    int i_11_ = stream.readSmart2(-13829);
	    int i_12_ = stream.readUnsignedNegativeByte((byte) -18);
	    p.applyHit(pm.currentTimedTicks, i_12_, i_11_, 124);
	    ((Entity) p).hitRemovalTime = pm.currentTimedTicks + 300;
	    ((Entity) p).hitBarScale = stream.readUnsignedByte(-9268);
	}
	if ((maskData & 0x8000) != 0) {
	    int i_13_ = stream.readUnsignedNegativeByte((byte) -18);
	    int[] is = new int[i_13_];
	    int[] is_14_ = new int[i_13_];
	    int[] is_15_ = new int[i_13_];
	    for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
			int i_17_ = stream.readShortReversedFirstByteMinus128_2(true);
			if (i_17_ == 65535)
			    i_17_ = -1;
			is[i_16_] = i_17_;
			is_14_[i_16_] = stream.readUnsignedByte(-9268);
			is_15_[i_16_] = stream.readShortReversedFirstByteMinus128_2(true);
	    }
	    nr.a(is, 37, is_15_, p, is_14_);
	}
	if ((maskData & 0x200) != 0) {
	    ((Entity) p).M = stream.readNegativeByte(false);
	    ((Entity) p).fc = stream.readNegativeByte(false);
	    ((Entity) p).Yb = stream.readNegativeByte(false);
	    ((Entity) p).Db = stream.readNegativeByte(false);
	    ((Entity) p).xc = stream.readShortSecondByteMinus128((byte) -80) + pm.currentTimedTicks;
	    ((Entity) p).ab = stream.readShort(13111) + pm.currentTimedTicks;
	    ((Entity) p).ub = stream.readUnsignedNegativeByte((byte) -18);
	    ((Entity) p).Kc = 0;
	    if (!((Player) p).Vc) {
			((Entity) p).Nc = 1;
			((Entity) p).Db += ((Entity) p).regionLocalY[0];
			((Entity) p).fc += ((Entity) p).regionLocalY[0];
			((Entity) p).Yb += ((Entity) p).regionLocalX[0];
			((Entity) p).M += ((Entity) p).regionLocalX[0];
	    } else {
			((Entity) p).Nc = 0;
			((Entity) p).M += ((Player) p).playerX;
			((Entity) p).fc += ((Player) p).playerY;
			((Entity) p).Yb += ((Player) p).playerX;
			((Entity) p).Db += ((Player) p).playerY;
	    }
	}
	if ((maskData & 0x4) != 0) {//orientation update
	    ((Player) p).orientation = stream.readShortReversed((byte) 111);
	    if (((Entity) p).Nc == 0) {
	    	p.a(false, ((Player) p).orientation);
	    	((Player) p).orientation = -1;
	    }
	}
	if ((maskData & 0x10000) != 0) {
	    ((Entity) p).vb = stream.readBytePlus128(16436);
	    ((Entity) p).Mb = stream.readBytePlus128(16436);
	    ((Entity) p).Tb = stream.readByte(-20933);
	    ((Entity) p).Xb = (byte) stream.readUnsignedByte(-9268);
	    ((Entity) p).zc = pm.currentTimedTicks + stream.readShortSecondByteMinus128((byte) -80);
	    ((Entity) p).Cb = pm.currentTimedTicks + stream.readShortSecondByteMinus128((byte) -80);
	}
	if ((0x4000 & maskData) != 0) {//animation mask
	    int i_18_ = stream.readShortSecondByteMinus128((byte) -80);
	    ((Entity) p).dc = stream.readUnsignedNegativeByte((byte) -18);
	    ((Entity) p).fb = stream.readUnsignedByte(-9268);
	    ((Entity) p).ac = i_18_ & 0x7fff;
	    ((Entity) p).kb = (i_18_ & 0x8000) != 0;
	    ((Entity) p).Y = pm.currentTimedTicks + ((Entity) p).ac + ((Entity) p).dc;
	}
	if ((0x20 & maskData) != 0) {//animation
	    int[] animsIDs = new int[4];
	    for (int loopID = 0; loopID < 4; loopID++) {
			animsIDs[loopID] = stream.readShortSecondByteMinus128((byte) -80);
			if (animsIDs[loopID] == 65535)
			    animsIDs[loopID] = -1;
	    }
	    int delay = stream.readUnsignedNegativeByte((byte) -18);
	    lq.applyPlayerAnimation(delay, animsIDs, dummy - 102, p);
	}
	if ((maskData & 0x80) != 0)
	    hg.moveTypePerPlayer[playerID] = stream.readNegativeByte(false);
	if ((0x1 & maskData) != 0) {
	    int i_21_ = stream.readShortReversedFirstByteMinus128_2(true);
	    if (i_21_ == 65535)
	    	i_21_ = -1;
	    int i_22_ = stream.readIntShiftsInOrder_16_24_0_8(dummy ^ ~0x6d);
	    int i_23_ = stream.readUnsignedNegativeBytePlus128(255);
	    p.applyGraphics(i_22_, i_21_, (byte) 92, i_23_, false);
	}
	if ((0x800 & maskData) != 0)
	    i_2_ = stream.readNegativeByte(false);
	if (((Player) p).Vc) {
	    if (i_2_ == 127)
	    	p.updateLocation(-3377, ((Player) p).playerX, ((Player) p).playerY);
	    else {
			byte i_24_;
			if ((i_2_ ^ 0xffffffff) == 0)
			    i_24_ = hg.moveTypePerPlayer[playerID];
			else
			    i_24_ = i_2_;
			p.updateLocation(i_24_, ((Player) p).playerY, dummy - 1157357879,
				 ((Player) p).playerX);
	    }
	}
    }
    
    public static void a(byte i) {
	incomingPacket110 = null;
	incomingPacket28 = null;
	incomingPacket42 = null;
	P = null;
	if (i == -16)
	    sendIgnoreListGameInPacket = null;
    }
    
    static final int a(int i, boolean bool) {
	o++;
	int i_25_ = i * (i * i >> 12) >> 12;
	if (bool != false)
	    return -13;
	int i_26_ = 6 * i - 61440;
	int i_27_ = (i * i_26_ >> 12) + 40960;
	return i_27_ * i_25_ >> 12;
    }
    
    private final void b(byte i) {
	f++;
	boolean bool = false;
	if (i == -47) {
	    int i_28_ = 0;
	    int i_29_ = 0;
	    for (qh var_qh = (qh) t.a((int) 127); var_qh != null;
		 var_qh = (qh) t.b((byte) 80)) {
		int i_30_ = var_qh.a(i ^ ~0x2f);
		i_29_ += var_qh.b(1);
		if (i_30_ > i_28_)
		    i_28_ = i_30_;
		bool |= var_qh.a((byte) 33);
	    }
	    int i_31_;
	    if (i_28_ == 2)
		i_31_ = 34836;
	    else if (i_28_ != 1)
		i_31_ = 6408;
	    else
		i_31_ = 34842;
	    if (O != i_31_) {
		H = true;
		O = i_31_;
	    }
	    int i_32_ = E > 2 ? 2 : E;
	    int i_33_ = i_29_ <= 2 ? i_29_ : 2;
	    E = i_29_;
	    if (i_32_ != i_33_)
		F = H = true;
	    if (!L != !bool) {
		L = bool;
		M = true;
	    }
	}
    }
    
    final void c(byte i) {
	m++;
	if (p) {
	    if (g != null) {
		d.a(g, (int) -121);
		int i_34_ = 16384;
		d.b(b, (byte) 101);
		g.a((byte) 124, 0);
		b.a(0, true);
		if (L)
		    i_34_ |= 0x100;
		OpenGL.glBlitFramebufferEXT(0, 0, n, z, 0, 0, n, z, i_34_,
					    9728);
		d.c(g, (byte) -124);
		d.a(b, (byte) -20);
	    }
	    d.m((byte) 3);
	    d.b((byte) 29, (int) 0);
	    d.c(false, 1);
	    if (i != -38)
		b((int) 92);
	    d.JA();
	    int i_35_ = 0;
	    int i_36_ = 1;
	    qh var_qh;
	    for (qh var_qh_37_ = (qh) t.a((int) 102); var_qh_37_ != null;
		 var_qh_37_ = var_qh) {
		var_qh = (qh) t.b((byte) 73);
		int i_38_ = var_qh_37_.b(1);
		for (int i_39_ = 0; i_38_ > i_39_; i_39_++) {
		    var_qh_37_.a(J[i_35_], false, i_39_, I);
		    if (var_qh == null && i_38_ - 1 == i_39_) {
			d.a(-118, b);
			d.a((byte) 125, 0, (int) 0);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, (float) z);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			OpenGL.glVertex2i(v, c);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glVertex2i(v, c + z);
			OpenGL.glTexCoord2f((float) n, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			OpenGL.glVertex2i(v + n, z + c);
			OpenGL.glTexCoord2f((float) n, (float) z);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			OpenGL.glVertex2i(n + v, c);
			OpenGL.glEnd();
		    } else {
			b.a(i_36_, true);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(0.0F, (float) z);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			OpenGL.glVertex2i(0, z);
			OpenGL.glTexCoord2f((float) n, (float) z);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			OpenGL.glVertex2i(n, z);
			OpenGL.glTexCoord2f((float) n, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			OpenGL.glVertex2i(n, 0);
			OpenGL.glEnd();
		    }
		    i_35_ = i_35_ + 1 & 0x1;
		    var_qh_37_.a(0, i_39_);
		    i_36_ = 0x1 & i_36_ + 1;
		}
	    }
	    p = false;
	}
    }
    
    final boolean a(int i, int i_40_, int i_41_, int i_42_, int i_43_) {
	int i_44_ = -75 % ((i - 25) / 42);
	x++;
	if (u == null || t.b(true))
	    return false;
	if (n != i_42_ || z != i_41_) {
	    n = i_42_;
	    z = i_41_;
	    for (Node class_d = t.a((int) 124); class_d != ((Class_ae) t).o;
		 class_d = ((Node) class_d).previous)
		((qh) class_d).a(n, z, 124);
	    M = true;
	    F = true;
	    H = true;
	}
	if (b((int) 1)) {
	    c = i_40_;
	    v = i_43_;
	    p = true;
	    d.b(255, u);
	    u.a(0, true);
	    d.a((byte) 124, c - ((qj) d).ib + z, -v);
	    return true;
	}
	return false;
    }
    
    private final boolean b(int i) {
	j++;
	if (M) {
	    if (Q != null) {
		Q.b((byte) 127);
		Q = null;
	    }
	    if (I != null) {
		I.b((byte) -30);
		I = null;
	    }
	    if (g != null)
		Q = new pca(d, 6402, n, z, ((qj) d).Ed);
	    if (!L) {
		if (Q == null)
		    Q = new pca(d, 6402, n, z);
	    } else
		I = new pm(d, 34037, 6402, n, z);
	    M = false;
	    D = true;
	    F = true;
	}
	if (H) {
	    if (N != null) {
		N.b((byte) 125);
		N = null;
	    }
	    if (J[0] != null) {
		J[0].b((byte) -29);
		J[0] = null;
	    }
	    if (J[1] != null) {
		J[1].b((byte) -91);
		J[1] = null;
	    }
	    if (g != null)
		N = new pca(d, O, n, z, ((qj) d).Ed);
	    J[0] = new pm(d, 34037, O, n, z);
	    J[1] = E <= 1 ? (pm) null : new pm(d, 34037, O, n, z);
	    D = true;
	    F = true;
	    H = false;
	}
	if (F) {
	    if (g != null) {
		d.b(255, b);
		b.a((int) 0, 1);
		b.a((int) 1, i);
		b.a((int) 8, 1);
		b.a(J[0], (byte) 1, 0);
		if (E > 1)
		    b.a(J[1], (byte) 1, 1);
		if (L)
		    b.a(I, (byte) 1, 8);
		d.a(-109, b);
		d.b(255, g);
		g.a((int) 0, 1);
		g.a((int) 8, 1);
		g.a(0, N, -2693);
		g.a(8, Q, i ^ ~0xa85);
		d.a(i ^ 0x3d, g);
	    } else {
		d.b(i + 254, b);
		b.a((int) 0, 1);
		b.a((int) 1, 1);
		b.a((int) 8, 1);
		b.a(J[0], (byte) 1, 0);
		if (E > 1)
		    b.a(J[1], (byte) 1, 1);
		if (!L)
		    b.a(8, Q, -2693);
		else
		    b.a(I, (byte) 1, 8);
		d.a(-107, b);
	    }
	    D = true;
	    F = false;
	}
	if (D) {
	    d.b(255, u);
	    D = !u.a(false);
	    d.a(-87, u);
	}
	if (i != 1)
	    return true;
	if (D)
	    return false;
	return true;
    }
    
    final boolean c(int i) {
	e++;
	int i_45_ = -76 / ((-35 - i) / 51);
	if (u == null)
	    return false;
	return true;
    }
    
    static final void a(int i, String string) {
	w++;
	if (string != null && i == 1) {
	    if (string.startsWith("*"))
		string = string.substring(1);
	    String string_46_ = kk.a(string, true);
	    if (string_46_ != null) {
		for (int i_47_ = 0; i_47_ < dba.l; i_47_++) {
		    String string_48_ = nh.l[i_47_];
		    if (string_48_.startsWith("*"))
			string_48_ = string_48_.substring(1);
		    string_48_ = kk.a(string_48_, true);
		    if (string_48_ != null && string_48_.equals(string_46_)) {
			dba.l--;
			for (int i_49_ = i_47_; i_49_ < dba.l; i_49_++) {
			    nh.l[i_49_] = nh.l[i_49_ + 1];
			    GameOutPacket.d[i_49_] = GameOutPacket.d[i_49_ + 1];
			    mba.a[i_49_] = mba.a[i_49_ + 1];
			    pi.m[i_49_] = pi.m[i_49_ + 1];
			    eq.M[i_49_] = eq.M[i_49_ + 1];
			}
			Class_ad.d++;
			rda.h = tb.u;
			tba var_tba = jga.sendGameOutPacket(bt.o, pca.isaac, (byte) -117);
			((tba) var_tba).loginStream.writeByte(cq.a(string, (byte) 2),
					    (byte) -120);
			((tba) var_tba).loginStream.writeString(string, -112);
			ud.a(var_tba, (byte) -36);
			break;
		    }
		}
	    }
	}
    }
    
    static final boolean a(int i, int i_50_, int i_51_) {
	if (i != 33)
	    P = null;
	r++;
	if ((i_50_ & 0x21) == 0)
	    return false;
	return true;
    }
    
    dk(qj var_qj) {
	n = 1;
	z = 1;
	t = new Class_ae();
	E = 0;
	F = true;
	H = true;
	J = new pm[2];
	M = true;
	D = true;
	L = false;
	O = -1;
	d = var_qj;
	if (((qj) d).wg && ((qj) d).vf) {
	    u = b = new qk(d);
	    if (((qj) d).Ed > 1 && ((qj) d).xf && ((qj) d).Kg)
		u = g = new qk(d);
	}
    }
    
    static {
	incomingPacket42 = new GameInPacket(42, 12);
	incomingPacket110 = new GameInPacket(110, 3);
	sendIgnoreListGameInPacket = new GameInPacket(95, -2);
	P = new wea(1, 2);
    }
}
