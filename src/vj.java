/* vj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

final class vj
{
    static int a;
    int b;
    static int c;
    int d;
    static int e;
    private boolean f = false;
    int g;
    int h;
    int i;
    int j;
    int k = 0;
    int l;
    private int m;
    int n;
    int o;
    int p;
    long q;
    static int r;
    static il s = new il(32);
    static Applet applet;
    static GameOutPacket u = new GameOutPacket(71, 11);
    
    final void a(byte i) {
	((vj) this).i = GameInPacket.ints2[m << 3];
	e++;
	long l = (long) ((vj) this).n;
	long l_0_ = (long) ((vj) this).o;
	long l_1_ = (long) ((vj) this).d;
	((vj) this).p
	    = (int) Math.sqrt((double) (l_1_ * l_1_ + l_0_ * l_0_ + l * l));
	if (((vj) this).h == 0)
	    ((vj) this).h = 1;
	if (((vj) this).l != 0) {
	    if (((vj) this).l == 1) {
		((vj) this).q = (long) (8 * ((vj) this).p / ((vj) this).h);
		((vj) this).q *= ((vj) this).q;
	    } else if (((vj) this).l == 2)
		((vj) this).q = (long) (((vj) this).p * 8 / ((vj) this).h);
	} else
	    ((vj) this).q = 2147483647L;
	if (i < 47)
	    a((Entity) null, -30, 37);
	if (f)
	    ((vj) this).p *= -1;
    }
    
    public static void a(int i) {
	u = null;
	s = null;
	if (i == 0)
	    applet = null;
    }
    
    private final void a(BytesParser var_es, int i, byte i_2_) {
	if (i_2_ != -99)
	    ((vj) this).p = 54;
	if (i != 1) {
	    if (i == 2)
		var_es.readUnsignedByte(-9268);
	    else if (i == 3) {
		((vj) this).n = var_es.readInt(86);
		((vj) this).o = var_es.readInt(i_2_ ^ ~0x36);
		((vj) this).d = var_es.readInt(i_2_ ^ ~0x2);
	    } else if (i == 4) {
		((vj) this).l = var_es.readUnsignedByte(-9268);
		((vj) this).h = var_es.readInt(124);
	    } else if (i != 6) {
		if (i != 8) {
		    if (i == 9)
			((vj) this).k = 1;
		    else if (i == 10)
			f = true;
		} else
		    ((vj) this).g = 1;
	    } else
		((vj) this).b = var_es.readUnsignedByte(-9268);
	} else
	    m = var_es.readShort(13111);
	a++;
    }
    
    static final void a(Entity var_ni, int i, int i_3_) {
	r++;
	int i_4_ = -1;
	int i_5_ = i_3_;
	if (pm.currentTimedTicks >= ((Entity) var_ni).xc) {
	    if (((Entity) var_ni).ab >= pm.currentTimedTicks)
		ol.a((byte) 95, var_ni);
	    else {
		vt.a(false, var_ni, (byte) 78);
		i_5_ = ej.s;
		i_4_ = pg.f;
	    }
	} else
	    mo.a((byte) -87, var_ni);
	if (((Animable) var_ni).locX < 512 || ((Animable) var_ni).locY < 512
	    || (Class_hc.e - 1) * 512 <= ((Animable) var_ni).locX
	    || 512 * (bw.v - 1) <= ((Animable) var_ni).locY) {
	    ((Entity) var_ni).ab = 0;
	    ((Entity) var_ni).xc = 0;
	    i_4_ = -1;
	    ((Entity) var_ni).graphicsId = -1;
	    ((Entity) var_ni).graphicsId_ = -1;
	    i_5_ = 0;
	    ((Entity) var_ni).Ab = null;
	    ((Entity) var_ni).yb = -1;
	    ((Animable) var_ni).locX = ((Entity) var_ni).regionLocalX[0] * 512 + 256 * var_ni.getNPCDefinition(-1);
	    ((Animable) var_ni).locY = ((Entity) var_ni).regionLocalY[0] * 512 + 256 * var_ni.getNPCDefinition(-1);
	    var_ni.a(i_3_);
	}
	if (up.thisPlayer == var_ni && (((Animable) var_ni).locX < 6144 || ((Animable) var_ni).locY < 6144
			       || 512 * Class_hc.e - 6144 <= ((Animable) var_ni).locX
			       || 512 * (bw.v - 12) <= ((Animable) var_ni).locY)) {
	    i_5_ = 0;
	    ((Entity) var_ni).ab = 0;
	    i_4_ = -1;
	    ((Entity) var_ni).Ab = null;
	    ((Entity) var_ni).yb = -1;
	    ((Entity) var_ni).xc = 0;
	    ((Entity) var_ni).graphicsId = -1;
	    ((Entity) var_ni).graphicsId_ = -1;
	    ((Animable) var_ni).locX = ((Entity) var_ni).regionLocalX[0] * 512 + var_ni.getNPCDefinition(-1) * 256;
	    ((Animable) var_ni).locY = ((Entity) var_ni).regionLocalY[0] * 512 + var_ni.getNPCDefinition(-1) * 256;
	    var_ni.a((int) 0);
	}
	int i_6_ = mw.a((byte) 117, var_ni);
	ff.a(i_6_, i_4_, var_ni, i_3_ ^ ~0x67c2, i_5_);
	mq.a(-6855, var_ni, i_4_);
	vt.a(var_ni, (byte) 87);
    }
    
    final void a(byte i, BytesParser var_es) {
	c++;
	for (;;) {
	    int i_7_ = var_es.readUnsignedByte(-9268);
	    if (i_7_ == 0)
		break;
	    a(var_es, i_7_, (byte) -99);
	}
	if (i > -35)
	    a((Entity) null, -22, 98);
    }
    
    public vj() {
	((vj) this).g = 0;
    }
}
