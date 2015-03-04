/* pe - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class pe extends of
    implements MouseListener, MouseMotionListener, MouseWheelListener
{
    private Class_ae g = new Class_ae();
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Class_ae n = new Class_ae();
    private Component o;
    private boolean p;
    
    final int b(int i) {
	if (i < 90)
	    return 54;
	return this.i;
    }
    
    public final synchronized void mouseReleased(MouseEvent mouseevent) {
	int i = a(mouseevent, -81);
	if ((i & k) == 0)
	    i = k;
	if ((i & 0x1) != 0)
	    a(mouseevent.getClickCount(), 3, 25112, mouseevent.getX(),
	      mouseevent.getY());
	if ((i & 0x4) != 0)
	    a(mouseevent.getClickCount(), 5, 25112, mouseevent.getX(),
	      mouseevent.getY());
	if ((i & 0x2) != 0)
	    a(mouseevent.getClickCount(), 4, 25112, mouseevent.getX(),
	      mouseevent.getY());
	k &= i ^ 0xffffffff;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public final synchronized void mouseMoved(MouseEvent mouseevent) {
	a(mouseevent.getX(), mouseevent.getY(), true);
    }
    
    public final synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    final ew a(boolean bool) {
	if (bool != true)
	    return null;
	return (ew) g.a(bool);
    }
    
    public final synchronized void mouseExited(MouseEvent mouseevent) {
	a(mouseevent.getX(), mouseevent.getY(), true);
    }
    
    public final synchronized void mouseDragged(MouseEvent mouseevent) {
	a(mouseevent.getX(), mouseevent.getY(), true);
    }
    
    final boolean c(int i) {
	if (i != 2000)
	    e(34);
	return (0x2 & j) != 0;
    }
    
    final int d(int i) {
	if (i != 2000)
	    return -88;
	return h;
    }
    
    final boolean f(int i) {
	if (i != -30249)
	    return false;
	return (j & 0x1) != 0;
    }
    
    public final synchronized void mouseEntered(MouseEvent mouseevent) {
	a(mouseevent.getX(), mouseevent.getY(), true);
    }
    
    private final void a(int i, int i_0_, boolean bool) {
	m = i_0_;
	if (bool == true) {
	    l = i;
	    if (p)
		a(0, -1, 25112, i, i_0_);
	}
    }
    
    final boolean e(int i) {
	if (i != 2000)
	    j = 2;
	return 0 != (0x4 & j);
    }
    
    public final synchronized void mouseWheelMoved
	(MouseWheelEvent mousewheelevent) {
	int i = mousewheelevent.getX();
	int i_1_ = mousewheelevent.getY();
	int i_2_ = mousewheelevent.getWheelRotation();
	a(i_2_, 6, 25112, i, i_1_);
	mousewheelevent.consume();
    }
    
    private final int a(MouseEvent mouseevent, int i) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	int i_3_ = -4 % ((38 - i) / 38);
	return 0;
    }
    
    final synchronized void c(boolean bool) {
	i = m;
	j = k;
	h = l;
	if (bool)
	    mouseClicked(null);
	Class_ae class_ae = g;
	g = n;
	n = class_ae;
	n.d(2);
    }
    
    public final synchronized void mousePressed(MouseEvent mouseevent) {
	int i = a(mouseevent, -57);
	if (i == 1)
	    a(mouseevent.getClickCount(), 0, 25112, mouseevent.getX(),
	      mouseevent.getY());
	else if (i != 4) {
	    if (i == 2)
		a(mouseevent.getClickCount(), 1, 25112, mouseevent.getX(),
		  mouseevent.getY());
	} else
	    a(mouseevent.getClickCount(), 2, 25112, mouseevent.getX(),
	      mouseevent.getY());
	k |= i;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    final void b(byte i) {
	c((byte) 13);
	if (i != 118)
	    n = null;
    }
    
    private final void a(Component component, byte i) {
	c((byte) 13);
	o = component;
	if (i > 85) {
	    o.addMouseListener(this);
	    o.addMouseMotionListener(this);
	    o.addMouseWheelListener(this);
	}
    }
    
    private final void c(byte i) {
	if (i != 13)
	    a((MouseEvent) null, -14);
	if (null != o) {
	    o.removeMouseWheelListener(this);
	    o.removeMouseMotionListener(this);
	    o.removeMouseListener(this);
	    o = null;
	    h = this.i = j = 0;
	    n = null;
	    l = m = k = 0;
	    g = null;
	}
    }
    
    private final void a(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
	pq var_pq = new pq();
	((pq) var_pq).t = i_6_;
	((pq) var_pq).r = i_7_;
	((pq) var_pq).s = i_4_;
	((pq) var_pq).q = us.getCurrentTime(i_5_ ^ 0x6274);
	((pq) var_pq).p = i;
	if (i_5_ == 25112)
	    n.b(var_pq, (byte) 93);
    }
    
    pe(Component component, boolean bool) {
	a(component, (byte) 124);
	p = bool;
    }
}
