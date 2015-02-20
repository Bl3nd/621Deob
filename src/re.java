/* re - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class re
{
    static int a;
    static int b;
    static int c;
    static int d;
    static pl e;
    static int[] f;
    private pl g;
    static int h;
    private tb i = new tb(64);
    static int outScreenPlayerUpdates;
    static int k;
    
    static final boolean outScreenPlayerUpdate(LoginStream stream, int playerID, int dummy) {
	outScreenPlayerUpdates++;
	int action = stream.readBits(false, 2);
	if (action == 0) {
	    if (stream.readBits(false, 1) != 0)
	    	outScreenPlayerUpdate(stream, playerID, 31261);
	    int localX = stream.readBits(false, 6);
	    int localY = stream.readBits(false, 6);
	    boolean needUpdate = stream.readBits(false, 1) == 1;
	    if (needUpdate)
	    	fca.f[vu.a++] = playerID;
	    if (Class_fc.playersInScreen[playerID] != null)
	    	throw new RuntimeException("hr:lr");
	    GPIPlayer gpip = ega.gpiPlayers[playerID];
	    Player p = Class_fc.playersInScreen[playerID] = new Player();
	    ((Entity) p).lb = playerID;
	    if (vo.J[playerID] != null)
	    	p.playerAppearanceUpdate(-1, vo.J[playerID]);
	    p.a(((GPIPlayer) gpip).orientation, 1003, true);
	    ((Entity) p).faceEntityID = ((GPIPlayer) gpip).faceEntityID;
	    int locationHash = ((GPIPlayer) gpip).locationHash;
	    int height = locationHash >> 28;
	    int regionX = 0xff & locationHash >> 14;
	    int regionY = 0xff & locationHash;
	    int toX = (regionX << 6) + localX - bfa.thisPlayersRegionX;
	    int toY = (regionY << 6) + localY - BytesParser.thisPlayersRegionY;
	    ((Player) p).cd = ((GPIPlayer) gpip).b;
	    ((Entity) p).moveTypes[0] = hg.moveTypePerPlayer[playerID];
	    ((Animable) p).height = ((Animable) p).h = (byte) height;
	    if (ItemDef.b(toY, toX, 5706))
	    	((Animable) p).h++;
	    p.updateLocation(-3377, toX, toY);
	    ((Player) p).Vc = false;
	    ega.gpiPlayers[playerID] = null;
	    return true;
	}
	if (action == 1) {
	    int deltaHeight = stream.readBits(false, 2);
	    int locationHash = ((GPIPlayer) ega.gpiPlayers[playerID]).locationHash;
	    ((GPIPlayer) ega.gpiPlayers[playerID]).locationHash = (locationHash & 0xfffffff) + (((locationHash >> 28) + deltaHeight & 0x3) << 28);
	    return false;
	}
	if (action == 2) {
	    int deltaHash = stream.readBits(false, 5);
	    int deltaHeight = deltaHash >> 3;
	    int dir = deltaHash & 0x7;
	    int locationHash = ((GPIPlayer) ega.gpiPlayers[playerID]).locationHash;
	    int height = deltaHeight + (locationHash >> 28) & 0x3;
	    int regionX = (locationHash & 0x3fdb35) >> 14;
	    int regionY = locationHash & 0xff;
	    if (dir == 0) {
			regionY--;
			regionX--;
	    }
	    if (dir == 1)
	    	regionY--;
	    if (dir == 2) {
			regionX++;
			regionY--;
	    }
	    if (dir == 3)
	    	regionX--;
	    if (dir == 4)
	    	regionX++;
	    if (dir == 5) {
			regionX--;
			regionY++;
	    }
	    if (dir == 6)
	    	regionY++;
	    if (dir == 7) {
			regionY++;
			regionX++;
	    }
	    ((GPIPlayer) ega.gpiPlayers[playerID]).locationHash = regionY + ((height << 28) + (regionX << 14));
	    return false;
	}
	int deltaHash = stream.readBits(false, 18);
	int deltaHeight = deltaHash >> 16;
	int deltaX = deltaHash >> 8 & 0xff;
	int deltaY = 0xff & deltaHash;
	int locationHash = ((GPIPlayer) ega.gpiPlayers[playerID]).locationHash;
	int height = 0x3 & (locationHash >> 28) + deltaHeight;
	int regionX = (locationHash >> 14) + deltaX & 0xff;
	int regionY = 0xff & locationHash + deltaY;
	if (dummy != 31261)
	    return true;
	((GPIPlayer) ega.gpiPlayers[playerID]).locationHash = regionY + (regionX << 14) + (height << 28);
	return false;
    }
    
    public static void a(byte i) {
	f = null;
	if (i < 49)
	    e = null;
	e = null;
    }
    
    final Class_qb a(byte i, int i_27_) {
	k++;
	Class_qb class_qb;
	synchronized (this.i) {
	    class_qb = (Class_qb) this.i.get((long) i_27_, (byte) 100);
	    if (i != 126)
		outScreenPlayerUpdate(null, -30, -46);
	}
	if (class_qb != null)
	    return class_qb;
	byte[] is;
	synchronized (g) {
	    is = g.b(tn.a(i_27_, 1023), 119, na.a(i_27_, -252896726));
	}
	class_qb = new Class_qb();
	if (is != null)
	    class_qb.a(1, new BytesParser(is));
	synchronized (this.i) {
	    this.i.put((long) i_27_, class_qb, i ^ 0x7f);
	}
	return class_qb;
    }
    
    final void a(int i) {
	synchronized (this.i) {
	    this.i.c((byte) -125);
	}
	if (i == -15501)
	    d++;
    }
    
    final void a(int i, byte i_28_) {
	b++;
	synchronized (this.i) {
	    if (i_28_ != 75)
		a((int) -96, (int) -8);
	    this.i.a(true, i);
	}
    }
    
    final void a(int i, int i_29_) {
	c++;
	synchronized (this.i) {
	    this.i.a(18385);
	    this.i = new tb(i_29_);
	}
	if (i >= -12)
	    a((int) -17, (int) -115);
    }
    
    final void b(int i) {
	synchronized (this.i) {
	    if (i < 27)
		a((int) 46, (byte) 20);
	    this.i.a(18385);
	}
	a++;
    }
    
    re(Class_rf class_rf, int i, pl var_pl) {
	g = var_pl;
	if (g != null) {
	    int i_30_ = g.a((byte) -107) - 1;
	    g.a(i_30_, true);
	}
    }
}
