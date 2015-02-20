/* ia - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Date;

final class ia extends of implements MouseListener, MouseMotionListener
{
    static int g;
    static int h;
    static int i;
    private Class_ae j = new Class_ae();
    static int k;
    static int l;
    static int m;
    static int n;
    static pk o;
    private int p;
    static int q;
    static int r;
    static pl s;
    static int t;
    static int u;
    static int v;
    static boolean w;
    static int x;
    static int y;
    static int z;
    static int A;
    static int B;
    static int C;
    private int D;
    static int E;
    private int F;
    static int G;
    static int H;
    static int I;
    static int J;
    static int xLoc = 0;
    private Class_ae L = new Class_ae();
    private int M;
    private int N;
    static int O;
    private int P;
    private boolean Q;
    private Component R;
    
    public static void c(byte i) {
	o = null;
	s = null;
	if (i < 107)
	    w = true;
    }
    
    final ew a(boolean bool) {
	m++;
	if (bool != true)
	    return null;
	return (ew) j.a(true);
    }
    
    public final synchronized void mouseDragged(MouseEvent mouseevent) {
	b(mouseevent.getX(), mouseevent.getY(), -84);
	k++;
    }
    
    final boolean f(int i) {
	r++;
	if (i != -30249)
	    return false;
	if ((0x1 & p) == 0)
	    return false;
	return true;
    }
    
    final void b(byte i) {
	d((byte) -47);
	if (i == 118)
	    g++;
    }
    
    public final synchronized void mouseReleased(MouseEvent mouseevent) {
	h++;
	int i = a(mouseevent, (byte) 85);
	if ((i & N) == 0)
	    i = N;
	if ((0x1 & i) != 0)
	    a(mouseevent.getY(), (byte) 102, 3, mouseevent.getX(),
	      mouseevent.getClickCount());
	if ((i & 0x4) != 0)
	    a(mouseevent.getY(), (byte) 118, 5, mouseevent.getX(),
	      mouseevent.getClickCount());
	if ((0x2 & i) != 0)
	    a(mouseevent.getY(), (byte) 109, 4, mouseevent.getX(),
	      mouseevent.getClickCount());
	N &= i ^ 0xffffffff;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public final synchronized void mouseExited(MouseEvent mouseevent) {
	b(mouseevent.getX(), mouseevent.getY(), -81);
	i++;
    }
    
    public final synchronized void mouseEntered(MouseEvent mouseevent) {
	b(mouseevent.getX(), mouseevent.getY(), -109);
	I++;
    }
    
    final int b(int i) {
	if (i <= 90)
	    a((Component) null, -115);
	l++;
	return D;
    }
    
    public final synchronized void mousePressed(MouseEvent mouseevent) {
	G++;
	int i = a(mouseevent, (byte) 122);
	if (i != 1) {
	    if (i == 4)
		a(mouseevent.getY(), (byte) 67, 2, mouseevent.getX(),
		  mouseevent.getClickCount());
	    else if (i == 2)
		a(mouseevent.getY(), (byte) 122, 1, mouseevent.getX(),
		  mouseevent.getClickCount());
	} else
	    a(mouseevent.getY(), (byte) 106, 0, mouseevent.getX(),
	      mouseevent.getClickCount());
	N |= i;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    static final ev a(int i, int i_0_, int i_1_) {
	vf var_vf = ol.p[i][i_0_][i_1_];
	if (var_vf == null)
	    return null;
	return ((vf) var_vf).h;
    }
    
    private final void a(int i, byte i_2_, int i_3_, int i_4_, int i_5_) {
	J++;
	if (i_2_ <= 51)
	    p = 109;
	mo var_mo = new mo();
	((mo) var_mo).z = i_5_;
	((mo) var_mo).A = i_3_;
	((mo) var_mo).D = i;
	((mo) var_mo).v = i_4_;
	((mo) var_mo).p = us.a(98);
	L.b(var_mo, (byte) 93);
    }
    
    private final void b(int i, int i_6_, int i_7_) {
	if (i_7_ < -71) {
	    P = i_6_;
	    B++;
	    M = i;
	    if (Q)
		a(i_6_, (byte) 67, -1, i, 0);
	}
    }
    
    final synchronized void c(boolean bool) {
	p = N;
	v++;
	F = M;
	D = P;
	Class_ae class_ae = j;
	j = L;
	L = class_ae;
	L.d(2);
	if (bool != false)
	    mouseEntered(null);
    }
    
    public final synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
	n++;
    }
    
    private final void d(byte i) {
	z++;
	if (R != null) {
	    R.removeMouseMotionListener(this);
	    R.removeMouseListener(this);
	    M = P = N = 0;
	    L = null;
	    F = D = p = 0;
	    R = null;
	    if (i != -47)
		e(-55);
	    j = null;
	}
    }
    
    static final int g(int i) {
	x++;
	if (em.a != null)
	    return 3;
	int i_8_ = -9 % ((i + 63) / 46);
	if (!br.m)
	    return 1;
	return 2;
    }
    
    static final void a(int i, int i_9_) {
	pr.H = -1;
	cv.d = i;
	C++;
	pr.H = i_9_;
	jf.c(i_9_ - 2487);
    }
    
    final int d(int i) {
	if (i != 2000)
	    mouseEntered(null);
	t++;
	return F;
    }
    
    final boolean e(int i) {
	E++;
	if (i != 2000)
	    return false;
	if ((0x4 & p) == 0)
	    return false;
	return true;
    }
    
    private final void a(Component component, int i) {
	d((byte) -47);
	u++;
	R = component;
	R.addMouseListener(this);
	R.addMouseMotionListener(this);
	if (i >= -36)
	    b((int) 3);
    }
    
    final boolean c(int i) {
	if (i != 2000)
	    d((byte) -18);
	y++;
	if ((0x2 & p) == 0)
	    return false;
	return true;
    }
    
    private final int a(MouseEvent mouseevent, byte i) {
	A++;
	int i_10_ = mouseevent.getModifiers();
	if (i < 58)
	    return -61;
	boolean bool = (i_10_ & 0x10) != 0;
	boolean bool_11_ = (i_10_ & 0x8) != 0;
	boolean bool_12_ = (i_10_ & 0x4) != 0;
	if (bool_11_ && (bool || bool_12_))
	    bool_11_ = false;
	if (bool && bool_12_)
	    return 4;
	if (bool)
	    return 1;
	if (bool_11_)
	    return 2;
	if (bool_12_)
	    return 4;
	return 0;
    }
    
    public final synchronized void mouseMoved(MouseEvent mouseevent) {
	H++;
	b(mouseevent.getX(), mouseevent.getY(), -86);
    }
    
    static final void a(int i, String string) {
	if (Node.b == null)
	    Interface.c(80);
	q++;
	ru.gmtCalendar.setTime(new Date(us.a(118)));
	if (i != 4)
	    a(-100, -116);
	int i_13_ = ru.gmtCalendar.get(11);
	int i_14_ = ru.gmtCalendar.get(12);
	int i_15_ = ru.gmtCalendar.get(13);
	String string_16_
	    = (Integer.toString(i_13_ / 10) + i_13_ % 10 + ":" + i_14_ / 10
	       + i_14_ % 10 + ":" + i_15_ / 10 + i_15_ % 10);
	String[] strings = vq.a(-116, string, '\n');
	for (int i_17_ = 0; strings.length > i_17_; i_17_++) {
	    for (int i_18_ = wi.l; i_18_ > 0; i_18_--)
		Node.b[i_18_] = Node.b[i_18_ - 1];
	    Node.b[0] = string_16_ + ": " + strings[i_17_];
	    if (wi.l < Node.b.length - 1) {
		if (cp.c > 0)
		    cp.c++;
		wi.l++;
	    }
	}
    }
    
    ia(Component component, boolean bool) {
	a(component, -96);
	Q = bool;
    }
    
    static {
	o = new pk("WTRC", 1);
    }
}
