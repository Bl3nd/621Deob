/* il - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class il
{
    static int a;
    static int b;
    static int c;
    private Node d;
    static GameInPacket sendLobbyStringGameInPacket = new GameInPacket(56, -1);
    static int f;
    private long g;
    static int h;
    int i;
    static int j;
    static boolean k = true;
    Node[] l;
    static int[] m;
    static int n;
    static WorldSub[] o;
    private int p = 0;
    private Node q;
    static boolean r = false;
    static int s;
    static int y;
    static int u;
    static int v;
    
    final void a(boolean bool) {
	j++;
	if (bool == true) {
	    for (int i = 0; ((il) this).i > i; i++) {
		Node class_d = ((il) this).l[i];
		for (;;) {
		    Node class_d_0_ = ((Node) class_d).previous;
		    if (class_d == class_d_0_)
			break;
		    class_d_0_.unlink(-73);
		}
	    }
	    d = null;
	    q = null;
	}
    }
    
    final Node a(int i, long configID) {
	if (i != -32748)
	    y = 84;
	g = configID;
	u++;
	Node class_d
	    = ((il) this).l[(int) (configID & (long) (((il) this).i - 1))];
	for (d = ((Node) class_d).previous; class_d != d; d = ((Node) d).previous) {
	    if (((Node) d).nodeID == configID) {
		Node class_d_1_ = d;
		d = ((Node) d).previous;
		return class_d_1_;
	    }
	}
	d = null;
	return null;
    }
    
    final int a(Node[] class_ds, byte i) {
	f++;
	int i_2_ = 0;
	for (int i_3_ = 0; ((il) this).i > i_3_; i_3_++) {
	    Node class_d = ((il) this).l[i_3_];
	    for (Node class_d_4_ = ((Node) class_d).previous;
		 class_d != class_d_4_; class_d_4_ = ((Node) class_d_4_).previous)
		class_ds[i_2_++] = class_d_4_;
	}
	if (i >= -33)
	    b(true);
	return i_2_;
    }
    
    public static void a(int i) {
	m = null;
	if (i > 113) {
	    o = null;
	    sendLobbyStringGameInPacket = null;
	}
    }
    
    final void a(Node class_d, byte i, long configID) {
	if (i > -24)
	    c((byte) -46);
	s++;
	if (((Node) class_d).next != null)
	    class_d.unlink(-123);
	Node class_d_5_
	    = ((il) this).l[(int) (configID & (long) (((il) this).i - 1))];
	((Node) class_d).previous = class_d_5_;
	((Node) class_d).next = ((Node) class_d_5_).next;
	((Node) ((Node) class_d).next).previous = class_d;
	((Node) class_d).nodeID = configID;
	((Node) ((Node) class_d).previous).next = class_d;
    }
    
    final Node b(int i) {
	c++;
	if (p > 0 && ((il) this).l[p - 1] != q) {
	    Node class_d = q;
	    q = ((Node) class_d).previous;
	    return class_d;
	}
	while (p < ((il) this).i) {
	    Node class_d = ((Node) ((il) this).l[p++]).previous;
	    if (((il) this).l[p - 1] != class_d) {
		q = ((Node) class_d).previous;
		return class_d;
	    }
	}
	if (i != 12561)
	    a(42, -17L);
	return null;
    }
    
    final int a(byte i) {
	v++;
	int i_6_ = 0;
	if (i != -26)
	    return -117;
	for (int i_7_ = 0; i_7_ < ((il) this).i; i_7_++) {
	    Node class_d = ((il) this).l[i_7_];
	    for (Node class_d_8_ = ((Node) class_d).previous;
		 class_d_8_ != class_d; class_d_8_ = ((Node) class_d_8_).previous)
		i_6_++;
	}
	return i_6_;
    }
    
    il(int i) {
	((il) this).i = i;
	((il) this).l = new Node[i];
	for (int i_9_ = 0; i_9_ < i; i_9_++) {
	    Node class_d = ((il) this).l[i_9_] = new Node();
	    ((Node) class_d).previous = class_d;
	    ((Node) class_d).next = class_d;
	}
    }
    
    static final void b(boolean bool) {
	if (bool) {
	    ol.p = fg.e;
	    Class_q.b = wr.D;
	} else {
	    ol.p = ws.I;
	    Class_q.b = vr.b;
	}
	dfa.G = ol.p.length;
    }
    
    final int c(int i) {
	a++;
	if (i != -1)
	    g = -17L;
	return ((il) this).i;
    }
    
    final Node b(byte i) {
	h++;
	if (i != 124)
	    a(null, (byte) 104, -13L);
	p = 0;
	return b(i ^ 0x316d);
    }
    
    final Node c(byte i) {
	b++;
	if (d == null)
	    return null;
	if (i < 79)
	    return null;
	for (Node class_d = ((il) this).l[(int) ((long) (((il) this).i - 1)
						    & g)];
	     d != class_d; d = ((Node) d).previous) {
	    if (((Node) d).nodeID == g) {
		Node class_d_10_ = d;
		d = ((Node) d).previous;
		return class_d_10_;
	    }
	}
	d = null;
	return null;
    }
    
    static {
	o = new WorldSub[0];
	y = -1;
    }
}
