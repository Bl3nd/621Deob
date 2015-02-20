/* Class_ae - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ae
{
    static int a;
    static GameInPacket clanChatGameInPacket = new GameInPacket(19, -2);
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    static int j;
    static float[] k = new float[16];
    static int l;
    static int m;
    static PlayerUpdateLocation n;
    Node o = new Node();
    static int p;
    private Node q;
    static int r;
    static int s;
    
    final void a(Node class_d, byte i) {
	g++;
	if (((Node) class_d).next != null)
	    class_d.unlink(-21);
	if (i > 4) {
	    ((Node) class_d).next = ((Class_ae) this).o;
	    ((Node) class_d).previous = ((Node) ((Class_ae) this).o).previous;
	    ((Node) ((Node) class_d).next).previous = class_d;
	    ((Node) ((Node) class_d).previous).next = class_d;
	}
    }
    
    final Node a(int i) {
	j++;
	Node class_d = ((Node) ((Class_ae) this).o).previous;
	if (i < 81)
	    return null;
	if (((Class_ae) this).o == class_d) {
	    q = null;
	    return null;
	}
	q = ((Node) class_d).previous;
	return class_d;
    }
    
    public static void a(byte i) {
	clanChatGameInPacket = null;
	n = null;
	if (i >= 44)
	    k = null;
    }
    
    final void b(Node class_d, byte i) {
	if (i != 93)
	    clanChatGameInPacket = null;
	if (((Node) class_d).next != null)
	    class_d.unlink(-83);
	p++;
	((Node) class_d).previous = ((Class_ae) this).o;
	((Node) class_d).next = ((Node) ((Class_ae) this).o).next;
	((Node) ((Node) class_d).next).previous = class_d;
	((Node) ((Node) class_d).previous).next = class_d;
    }
    
    static final int a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
		       int i_4_) {
	if (i_0_ != 2)
	    a(63, 94, -26, -49, -121, -62);
	c++;
	if (Class_q.b == null)
	    return 0;
	if (i_1_ < 3) {
	    int i_5_ = i >> 9;
	    int i_6_ = i_3_ >> 9;
	    if (i_4_ < 0 || i_2_ < 0 || Class_hc.e - 1 < i_4_
		|| i_2_ > bw.v - 1)
		return 0;
	    if (i_5_ < 1 || i_6_ < 1 || Class_hc.e - 1 < i_5_
		|| bw.v - 1 < i_6_)
		return 0;
	    boolean bool = (tu.b[1][i >> 9][i_3_ >> 9] & 0x2) != 0;
	    if ((0x1ff & i) == 0) {
		boolean bool_7_ = (tu.b[1][i_5_ - 1][i_3_ >> 9] & 0x2) != 0;
		boolean bool_8_ = (0x2 & tu.b[1][i_5_][i_3_ >> 9]) != 0;
		if (bool_7_ == !bool_8_)
		    bool = (0x2 & tu.b[1][i_4_][i_2_]) != 0;
	    }
	    if ((0x1ff & i_3_) == 0) {
		boolean bool_9_ = (tu.b[1][i >> 9][i_6_ - 1] & 0x2) != 0;
		boolean bool_10_ = (tu.b[1][i >> 9][i_6_] & 0x2) != 0;
		if (!bool_10_ == bool_9_)
		    bool = (0x2 & tu.b[1][i_4_][i_2_]) != 0;
	    }
	    if (bool)
		i_1_++;
	}
	return Class_q.b[i_1_].a(i_3_, i, true);
    }
    
    final int b(int i) {
	r++;
	int i_11_ = 0;
	Node class_d = ((Node) ((Class_ae) this).o).previous;
	if (i >= -57)
	    clanChatGameInPacket = null;
	while (((Class_ae) this).o != class_d) {
	    class_d = ((Node) class_d).previous;
	    i_11_++;
	}
	return i_11_;
    }
    
    private final void a(Node class_d, byte i, Class_ae class_ae_12_) {
	s++;
	Node class_d_13_ = ((Node) ((Class_ae) this).o).next;
	((Node) ((Class_ae) this).o).next = ((Node) class_d).next;
	((Node) ((Node) class_d).next).previous = ((Class_ae) this).o;
	if (i <= 79)
	    ((Class_ae) this).o = null;
	if (class_d != ((Class_ae) this).o) {
	    ((Node) class_d).next = ((Node) ((Class_ae) class_ae_12_).o).next;
	    ((Node) ((Node) class_d).next).previous = class_d;
	    ((Node) class_d_13_).previous = ((Class_ae) class_ae_12_).o;
	    ((Node) ((Class_ae) class_ae_12_).o).next = class_d_13_;
	}
    }
    
    final Node c(int i) {
	Class_ae.i++;
	Node class_d = q;
	if (i != 16)
	    k = null;
	if (class_d == ((Class_ae) this).o) {
	    q = null;
	    return null;
	}
	q = ((Node) class_d).next;
	return class_d;
    }
    
    final Node a(boolean bool) {
	a++;
	Node class_d = ((Node) ((Class_ae) this).o).previous;
	if (class_d == ((Class_ae) this).o)
	    return null;
	if (bool != true)
	    n = null;
	class_d.unlink(-82);
	return class_d;
    }
    
    final Node b(byte i) {
	if (i < 20)
	    b((byte) 126);
	h++;
	Node class_d = q;
	if (class_d == ((Class_ae) this).o) {
	    q = null;
	    return null;
	}
	q = ((Node) class_d).previous;
	return class_d;
    }
    
    final boolean b(boolean bool) {
	l++;
	if (bool != true)
	    q = null;
	if (((Class_ae) this).o != ((Node) ((Class_ae) this).o).previous)
	    return false;
	return true;
    }
    
    final void d(int i) {
	if (i == 2) {
	    for (;;) {
		Node class_d = ((Node) ((Class_ae) this).o).previous;
		if (((Class_ae) this).o == class_d)
		    break;
		class_d.unlink(-13);
	    }
	    e++;
	    q = null;
	}
    }
    
    final Node c(boolean bool) {
	d++;
	if (bool != false)
	    return null;
	Node class_d = ((Node) ((Class_ae) this).o).next;
	if (class_d == ((Class_ae) this).o) {
	    q = null;
	    return null;
	}
	q = ((Node) class_d).next;
	return class_d;
    }
    
    final void a(byte i, Class_ae class_ae_14_) {
	a(((Node) ((Class_ae) this).o).previous, (byte) 125, class_ae_14_);
	if (i == -84)
	    m++;
    }
    
    public Class_ae() {
	((Node) ((Class_ae) this).o).next = ((Class_ae) this).o;
	((Node) ((Class_ae) this).o).previous = ((Class_ae) this).o;
    }
}
