/* ng - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class ng
{
    int a;
    cp b;
    int c;
    int d;
    static int e;
    boolean f = true;
    int g;
    static int h;
    static int i;
    int j = -1;
    static int k;
    int l;
    int m;
    int n;
    static int o;
    boolean p;
    int q;
    boolean r;
    static Rectangle[] s = new Rectangle[100];
    static GameOutPacket t;
    static GameInPacket u;
    
    static final void a(boolean bool) {
	if (bool != true)
	    t = null;
	uaa.b((int) -101);
	i++;
    }
    
    private final void a(BytesParser var_es, int i, int i_0_) {
	if (i == 1)
	    ((ng) this).d = vca.a(var_es.readTribyte(i_0_ ^ 0x81e), (byte) 109);
	else if (i != 2) {
	    if (i != 3) {
		if (i != 5) {
		    if (i != 7) {
			if (i == 8)
			    ((cp) ((ng) this).b).l = ((ng) this).l;
			else if (i == 9)
			    ((ng) this).c = var_es.readShort(13111) << 2;
			else if (i != 10) {
			    if (i == 11)
				((ng) this).g = var_es.readUnsignedByte(-9268);
			    else if (i == 12)
				((ng) this).r = true;
			    else if (i == 13)
				((ng) this).n = var_es.readTribyte(-1);
			    else if (i == 14)
				((ng) this).m = var_es.readUnsignedByte(-9268) << 2;
			    else if (i == 16)
				((ng) this).a = var_es.readUnsignedByte(i_0_ ^ 0x2c2d);
			} else
			    ((ng) this).f = false;
		    } else
			((ng) this).j = vca.a(var_es.readTribyte(-1), (byte) 124);
		} else
		    ((ng) this).p = false;
	    } else {
		((ng) this).q = var_es.readShort(13111);
		if (((ng) this).q == 65535)
		    ((ng) this).q = -1;
	    }
	} else
	    ((ng) this).q = var_es.readUnsignedByte(-9268);
	if (i_0_ != -2079)
	    a(null, 32);
	o++;
    }
    
    final void a(int i) {
	h++;
	((ng) this).g = ((ng) this).g << 8 | ((ng) this).l;
	if (i != 3)
	    a(null, -89, -53);
    }
    
    final void a(BytesParser var_es, int i) {
	for (;;) {
	    int i_1_ = var_es.readUnsignedByte(-9268);
	    if (i_1_ == 0)
		break;
	    a(var_es, i_1_, -2079);
	}
	k++;
	if (i != -3990)
	    ((ng) this).m = -127;
    }
    
    public static void b(int i) {
	if (i == 2) {
	    t = null;
	    s = null;
	    u = null;
	}
    }
    
    static final void a(int i, int i_2_, byte i_3_, int i_4_, int i_5_) {
	if (i_3_ != -80)
	    t = null;
	e++;
	if (i_5_ <= i_2_)
	    kg.a(i_5_, wh.O[i], i_4_, i_2_, -127);
	else
	    kg.a(i_2_, wh.O[i], i_4_, i_5_, -128);
    }
    
    public ng() {
	((ng) this).c = 512;
	((ng) this).a = 127;
	((ng) this).q = -1;
	((ng) this).g = 8;
	((ng) this).p = true;
	((ng) this).d = 0;
	((ng) this).n = 1190717;
	((ng) this).r = false;
	((ng) this).m = 64;
    }
    
    static {
	for (int i = 0; i < 100; i++)
	    s[i] = new Rectangle();
	t = new GameOutPacket(61, 2);
    }
}
