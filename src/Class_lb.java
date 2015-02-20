/* Class_lb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_lb
{
    static int a;
    static int b;
    boolean c;
    static int d;
    pl e;
    static int f;
    private tb g = new tb(64);
    static int[] h = new int[13];
    private pl i;
    static int j;
    Class_rf k;
    static int l;
    static int m;
    tb n = new tb(50);
    static int o;
    tb p = new tb(5);
    int q;
    
    final void a(byte i) {
	l++;
	synchronized (g) {
	    g.c((byte) -125);
	}
	synchronized (((Class_lb) this).n) {
	    if (i <= 27)
		a((byte) 0);
	    ((Class_lb) this).n.c((byte) -119);
	}
	synchronized (((Class_lb) this).p) {
	    ((Class_lb) this).p.c((byte) -125);
	}
    }
    
    public static void b(byte i) {
	if (i < -36)
	    h = null;
    }
    
    final void a(int i, int i_0_) {
	((Class_lb) this).q = i_0_;
	f++;
	synchronized (((Class_lb) this).n) {
	    if (i >= -90)
		c((byte) 96);
	    ((Class_lb) this).n.a(18385);
	}
	synchronized (((Class_lb) this).p) {
	    ((Class_lb) this).p.a(18385);
	}
    }
    
    final NPCDef getNPCDef(int npcID, byte dummy) {
	m++;
	NPCDef def;
	synchronized (g) {
	    if (dummy > -49)
		b((byte) -14);
	    def = (NPCDef) g.get((long) npcID, (byte) 100);
	}
	if (def != null)
	    return def;
	byte[] is;
	synchronized (this.i) {
	    is = this.i.b(mq.a(24231, npcID), 1, fda.a(npcID, 766538279));
	}
	def = new NPCDef();
	((NPCDef) def).npcID = npcID;
	((NPCDef) def).db = this;
	if (is != null)
	    def.parseValues(new BytesParser(is), true);
	def.a((int) 16);
	synchronized (g) {
	    g.put((long) npcID, def, 1);
	}
	return def;
    }
    
    final void b(int i, int i_2_) {
	synchronized (g) {
	    if (i < 91)
		((Class_lb) this).c = false;
	    g.a(true, i_2_);
	}
	a++;
	synchronized (((Class_lb) this).n) {
	    ((Class_lb) this).n.a(true, i_2_);
	}
	synchronized (((Class_lb) this).p) {
	    ((Class_lb) this).p.a(true, i_2_);
	}
    }
    
    final void c(byte i) {
	j++;
	synchronized (((Class_lb) this).n) {
	    ((Class_lb) this).n.a(18385);
	}
	synchronized (((Class_lb) this).p) {
	    ((Class_lb) this).p.a(18385);
	}
	int i_3_ = -83 / ((i + 48) / 58);
    }
    
    final void a(boolean bool, byte i) {
	if (i < 114)
	    ((Class_lb) this).c = true;
	b++;
	if (!bool != !((Class_lb) this).c) {
	    ((Class_lb) this).c = bool;
	    a((int) 116);
	}
    }
    
    final void a(int i) {
	synchronized (g) {
	    g.a(18385);
	}
	d++;
	synchronized (((Class_lb) this).n) {
	    ((Class_lb) this).n.a(18385);
	}
	synchronized (((Class_lb) this).p) {
	    ((Class_lb) this).p.a(18385);
	    if (i < 80)
		a((int) -97);
	}
    }
    
    Class_lb(Class_rf class_rf, int i, boolean bool, pl var_pl, pl var_pl_4_) {
	this.i = var_pl;
	((Class_lb) this).e = var_pl_4_;
	((Class_lb) this).c = bool;
	((Class_lb) this).k = class_rf;
	if (this.i != null) {
	    int i_5_ = this.i.a((byte) -107) - 1;
	    this.i.a(i_5_, true);
	}
    }
}
