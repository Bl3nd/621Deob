/* jp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class RSKeyListener extends ou implements KeyListener, FocusListener
{
    static int h;
    static int i;
    static int j;
    static int k;
    static int l;
    static int m;
    static int n;
    static int o;
    static int p;
    static int q;
    static int r;
    static int s = -2;
    static int t;
    static int u;
    static int v;
    static int w;
    private Class_ae x = new Class_ae();
    private Class_ae y = new Class_ae();
    private boolean[] z = new boolean[112];
    private Component A;
    
    private final int a(int i) {
	q++;
	int i_0_ = 0;
	if (z[81])
	    i_0_ |= 0x1;
	if (z[82])
	    i_0_ |= 0x4;
	if (z[i])
	    i_0_ |= 0x2;
	return i_0_;
    }
    
    final boolean a(byte i, int i_1_) {
	if (i != -68)
	    return true;
	n++;
	if (i_1_ < 0 || i_1_ >= 112)
	    return false;
	return z[i_1_];
    }
    
    private final void a(int i, KeyEvent keyevent, int i_2_) {
	RSKeyListener.i++;
	int i_3_ = keyevent.getKeyCode();
	if (i_2_ != (i_3_ ^ 0xffffffff)) {
	    if (i_3_ >= 0 && mca.E.length > i_3_) {
		i_3_ = mca.E[i_3_];
		if (i != 0 || (i_3_ & 0x80) == 0)
		    i_3_ &= ~0x80;
		else
		    i_3_ = 0;
	    } else
		i_3_ = 0;
	} else
	    i_3_ = 0;
	if (i_3_ != 0) {
	    a(i_3_, i, -123, '\0');
	    keyevent.consume();
	}
    }
    
    private final void a(Component component, byte i) {
	b((int) -127);
	l++;
	A = component;
	Method method = Signlink.setFocusTraversalKeysEnabled;
	if (method != null) {
	    try {
		method.invoke(A, new Object[] { Boolean.FALSE });
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	A.addKeyListener(this);
	A.addFocusListener(this);
	int i_4_ = -110 % ((i + 55) / 41);
    }
    
    public final synchronized void keyPressed(KeyEvent keyevent) {
	v++;
	a(0, keyevent, -1);
    }
    
    final void c(byte i) {
	j++;
	b((int) -108);
	if (i != 29)
	    a(true);
    }
    
    private final void b(int i) {
	u++;
	if (A != null) {
	    A.removeKeyListener(this);
	    A.removeFocusListener(this);
	    A = null;
	    for (int i_5_ = 0; i_5_ < 112; i_5_++)
		z[i_5_] = false;
	    if (i >= -62)
		x = null;
	    x.d(2);
	    y.d(2);
	}
    }
    
    private final void a(int i, int i_6_, int i_7_, char c) {
	o++;
	me var_me = new me();
	if (i_7_ > -73)
	    y = null;
	((me) var_me).o = i;
	((me) var_me).t = c;
	((me) var_me).s = i_6_;
	((me) var_me).u = us.getCurrentTime(107);
	y.b(var_me, (byte) 93);
    }
    
    static final void a(boolean bool) {
	ih.f++;
	k++;
	tba var_tba = jga.sendGameOutPacket(Class_hc.c, pca.isaac, (byte) -113);
	((tba) var_tba).loginStream.writeByte(ia.getWMVersion(101), (byte) -116);
	if (bool != true)
	    s = -99;
	((tba) var_tba).loginStream.writeShort(ff.width, 13469);
	((tba) var_tba).loginStream.writeShort(eh.height, 13469);
	((tba) var_tba).loginStream.writeByte(((jb) cs.g).Z, (byte) -115);
	ud.a(var_tba, (byte) -36);
    }
    
    public final synchronized void keyReleased(KeyEvent keyevent) {
	a(1, keyevent, -1);
	m++;
    }
    
    public final void focusGained(FocusEvent focusevent) {
	r++;
    }
    
    final synchronized void a(byte i) {
	x.d(2);
	p++;
	if (i != 32)
	    a((Component) null, (byte) -72);
	for (me var_me = (me) y.a(true); var_me != null;
	     var_me = (me) y.a(true)) {
	    ((me) var_me).k = a((int) 86);
	    if (((me) var_me).s != 0) {
		if (((me) var_me).s != 1) {
		    if ((((me) var_me).s ^ 0xffffffff) != 0) {
			if (((me) var_me).s == 3)
			    x.b(var_me, (byte) 93);
		    } else {
			for (int i_8_ = 0; i_8_ < 112; i_8_++) {
			    if (z[i_8_]) {
				me var_me_9_ = new me();
				((me) var_me_9_).u = ((me) var_me).u;
				((me) var_me_9_).k = ((me) var_me).k;
				((me) var_me_9_).t = '\0';
				((me) var_me_9_).s = 1;
				((me) var_me_9_).o = i_8_;
				x.b(var_me_9_, (byte) 93);
				z[i_8_] = false;
			    }
			}
		    }
		} else if (z[((me) var_me).o]) {
		    x.b(var_me, (byte) 93);
		    z[((me) var_me).o] = false;
		}
	    } else {
		if (!z[((me) var_me).o]) {
		    me var_me_10_ = new me();
		    ((me) var_me_10_).u = ((me) var_me).u;
		    ((me) var_me_10_).t = '\0';
		    ((me) var_me_10_).o = ((me) var_me).o;
		    ((me) var_me_10_).k = ((me) var_me).k;
		    ((me) var_me_10_).s = 0;
		    x.b(var_me_10_, (byte) 93);
		    z[((me) var_me).o] = true;
		}
		((me) var_me).s = 2;
		x.b(var_me, (byte) 93);
	    }
	}
    }
    
    public final synchronized void focusLost(FocusEvent focusevent) {
	h++;
	a(0, -1, -74, '\0');
    }
    
    public final synchronized void keyTyped(KeyEvent keyevent) {
	t++;
	char c = keyevent.getKeyChar();
	if (c != 0 && GameInPacketHandler.isKeyTyped(c)) {
	    a(-1, 3, -127, c);
	    keyevent.consume();
	}
    }
    
    final au d(byte i) {
	if (i >= -79)
	    s = 11;
	w++;
	return (au) x.a(true);
    }
    
    RSKeyListener(Component component) {
	io.j(-15630);
	a(component, (byte) 18);
    }
}
