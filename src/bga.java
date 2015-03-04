/* bga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import jagex3.jagmisc.jagmisc;

public abstract class bga extends Applet
        implements Runnable, FocusListener, WindowListener {
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    static int j;
    static int k;
    static int l;
    private boolean m = false;
    static int var_n;
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    private boolean z = false;
    static int A;
    static int C;
    static int D;
    static int E;
    static int F;
    static int G;
    static int H;
    public static boolean I;
    public static int J;
    public static int K;
    public static boolean L;
    public static int M;
    public static int N;
    public static boolean O;
    public static boolean P;
    public static boolean Q;
    public static int R;
    public static boolean S;
    public static boolean T;
    public static int U;
    public static boolean V;
    public static boolean W;

    public final synchronized void paint(Graphics graphics) {
        f++;
        if (tg.D == this && !iga.k) {
            sea.d = true;
            if (ip.S && us.getCurrentTime(103) - ko.f > 1000L) {
                Rectangle rectangle = graphics.getClipBounds();
                if (rectangle == null
                        || rectangle.width >= rda.width && rectangle.height >= Class_jg.height)
                    vv.o = true;
            }
        }
    }

    public abstract void init();

    final void sendErrorGame(String string, int i) {
        w++;
        if (!z) {
            z = true;
            System.out.println("error_game_" + string);
            if (i == -1) {
                try {
                    rp.a(true, "loggedout", vj.applet);
                } catch (Throwable throwable) {
            /* empty */
                }
                try {
                    getAppletContext().showDocument(new URL(getCodeBase(),
                                    ("error_game_"
                                            + string
                                            + ".ws")),
                            "_top");
                } catch (Exception exception) {
		    /* empty */
                }
            }
        }
    }

    public final void windowDeactivated(WindowEvent windowevent) {
        C++;
    }

    final boolean a(byte i) {
        if (i != -116)
            return false;
        F++;
        return Class_ue.a("jagmisc", -121);
    }

    public final void windowActivated(WindowEvent windowevent) {
        t++;
    }

    private final void b(byte i) {
        D++;
        long l = us.getCurrentTime(114);
        long l_0_ = td.n[ik.s];
        td.n[ik.s] = l;
        if (i < 63)
            start();
        ik.s = ik.s + 1 & 0x1f;
        if (l_0_ != 0L && l_0_ < l) {
            int i_1_ = (int) (l - l_0_);
            fu.fps = (32000 + (i_1_ >> 1)) / i_1_;
        }
        if (fp.B++ > 50) {
            fp.B -= 50;
            sea.d = true;
            ru.canvas.setSize(ff.width, eh.height);
            ru.canvas.setVisible(true);
            if (ws.J != null && em.a == null) {
                Insets insets = ws.J.getInsets();
                ru.canvas.setLocation(ia.xLoc + insets.left, insets.top + vh.yLoc);
            } else
                ru.canvas.setLocation(ia.xLoc, vh.yLoc);
        }
        d((int) 82);
    }

    public final void stop() {
        q++;
        if (tg.D == this && !iga.k)
            Class_ef.E = us.getCurrentTime(100) + 4000L;
    }

    final void a(boolean bool, int i, int i_2_, boolean bool_3_, int i_4_,
                 int i_5_, int i_6_, String string) {
        v++;
        try {
            to.e = null;
            tg.D = this;
            Class_jg.height = eh.height = i;
            vh.yLoc = 0;
            rda.width = ff.width = i_4_;
            ia.xLoc = 0;
            il.n = i_2_;
            ws.J = new Frame();
            ws.J.setTitle("Jagex");
            ws.J.setResizable(bool);
            ws.J.addWindowListener(this);
            ws.J.setVisible(true);
            ws.J.toFront();
            Insets insets = ws.J.getInsets();
            ws.J.setSize(insets.right + (insets.left + rda.width), insets.bottom + Class_jg.height + insets.top);
            ah.signlink = nda.signlink = new Signlink(i_5_, string, i_6_, true);
            vfa var_vfa = nda.signlink.a(1, this, 0);
            while (var_vfa.f == 0)
                Connection.a(-28448, 10L);
        } catch (Exception exception) {
            cea.a(null, -2, exception);
        }
    }

    public final void windowDeiconified(WindowEvent windowevent) {
        b++;
    }

    final boolean a(int i) {
        a++;
        String string = getDocumentBase().getHost().toLowerCase();
        if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
            return true;
        if (i != -140)
            return true;
        if (string.equals("runescape.com")
                || string.endsWith(".runescape.com"))
            return true;
        if (string.equals("stellardawn.com") || string.endsWith(""))
            return true;
        if (string.endsWith("127.0.0.1"))
            return true;
        for (/**/;
                 (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
                         && string.charAt(string.length() - 1) <= '9');
                 string = string.substring(0, string.length() - 1)) {
	    /* empty */
        }
        if (string.endsWith("192.168.1."))
            return true;
        sendErrorGame("invalidhost", -1);
        return false;
    }

    public final void focusLost(FocusEvent focusevent) {
        la.g = false;
        var_n++;
    }

    public final void destroy() {
        A++;
        if (this == tg.D && !iga.k) {
            Class_ef.E = us.getCurrentTime(127);
            Connection.a(-28448, 5000L);
            ah.signlink = null;
            a((byte) -75, false);
        }
    }

    public final void focusGained(FocusEvent focusevent) {
        k++;
        la.g = true;
        sea.d = true;
    }

    public final URL getCodeBase() {
        u++;
        if (ws.J != null)
            return null;
        if (vj.applet != null && vj.applet != this)
            return vj.applet.getCodeBase();
        return super.getCodeBase();
    }

    public synchronized void setCanvas(byte b) {
        if (ru.canvas != null) {
            ru.canvas.removeFocusListener(this);
            ru.canvas.getParent().setBackground(Color.black);
            ru.canvas.getParent().remove(ru.canvas);
        }
        p++;
        Container container;
        if (em.a != null) {
            container = em.a;
        } else if (ws.J == null) {
            if (vj.applet == null) {
                container = tg.D;
            } else {
                container = vj.applet;
            }
        } else {
            container = ws.J;
        }
        container.setLayout(null);
        ru.canvas = new kea(this);
        container.add(ru.canvas);
        ru.canvas.setSize(ff.width, eh.height);
        ru.canvas.setVisible(true);
        if (ws.J == container) {
            Insets insets = ws.J.getInsets();
            ru.canvas.setLocation(ia.xLoc + insets.left, insets.top + vh.yLoc);
        } else {
            ru.canvas.setLocation(ia.xLoc, vh.yLoc);
        }
        ru.canvas.addFocusListener(this);
        ru.canvas.requestFocus();
        tw.r = true;
        la.g = true;
        sea.d = true;
        if (b >= 20) {
            vv.o = false;
            ko.f = us.getCurrentTime(110);
        }
    }

    public final boolean getJaclib(/*int i*/) {
        H++;
        return Class_ue.a("jaclib", -11);
    }

    public final void windowClosed(WindowEvent windowevent) {
        e++;
    }

    public final AppletContext getAppletContext() {
        s++;
        if (ws.J != null)
            return null;
        if (vj.applet != null && vj.applet != this)
            return vj.applet.getAppletContext();
        return super.getAppletContext();
    }

    public final void update(Graphics graphics) {
        paint(graphics);
        g++;
    }

    abstract void nullContainer(int i);

    public final String getParameter(String string) {
        o++;
        if (ws.J != null)
            return null;
        if (vj.applet != null && vj.applet != this)
            return vj.applet.getParameter(string);
        return super.getParameter(string);
    }

    String errorMessage(byte dummy) {
        if (dummy != -30)
            provideLoaderApplet(null);
        h++;
        return null;
    }

    abstract void d(int i);

    abstract void e(/*int i*/);

    final void a(int i, byte i_8_, String string, int i_9_, int i_10_,
                 int i_11_, int i_12_) {
        E++;
        try {
            if (tg.D != null) {
                dn.a++;
                if (dn.a >= 3)
                    sendErrorGame("alreadyloaded", -1);
                else
                    getAppletContext().showDocument(getDocumentBase(),
                            "_self");
            } else {
                tg.D = this;
                to.e = vj.applet;
                vh.yLoc = 0;
                if (i_8_ != -21)
                    setCanvas((byte) -77);
                il.n = i_9_;
                rda.width = ff.width = i_10_;
                ia.xLoc = 0;
                Class_jg.height = eh.height = i_12_;
                ah.signlink = nda.signlink = new Signlink(i, string, i_11_, vj.applet != null);
                vfa var_vfa = nda.signlink.a(1, this, 0);
                while (var_vfa.f == 0)
                    Connection.a(-28448, 10L);
            }
        } catch (Throwable throwable) {
            cea.a(null, -2, throwable);
            sendErrorGame("crash", i_8_ + 20);
        }
    }

    private final void a(byte i, boolean bool) {
        c++;
        synchronized (this) {
            if (iga.k)
                return;
            iga.k = true;
        }
        System.out.println("Shutdown start - clean:" + bool);
        if (vj.applet != null)
            vj.applet.destroy();
        try {
            f();
        } catch (Exception exception) {
	    /* empty */
        }
        if (m) {
            try {
                jagmisc.quit();
            } catch (Throwable throwable) {
		/* empty */
            }
            m = false;
        }
        iba.a(true, (byte) -28);
        rv.unloadNativeLibraries();
        if (ru.canvas != null) {
            try {
                ru.canvas.removeFocusListener(this);
                ru.canvas.getParent().remove(ru.canvas);
            } catch (Exception exception) {
		/* empty */
            }
        }
        if (nda.signlink != null) {
            try {
                nda.signlink.b((int) -121);
            } catch (Exception exception) {
		/* empty */
            }
        }
        if (i < -18) {
            nullContainer((int) 31);
            if (ws.J != null) {
                ws.J.setVisible(false);
                ws.J.dispose();
                ws.J = null;
            }
            System.out.println("Shutdown complete - clean:" + bool);
        }
    }

    private final void a(boolean bool) {
        if (bool == false) {
            bga.l++;
            long l = us.getCurrentTime(92);
            long l_13_ = ji.i[qe.d];
            ji.i[qe.d] = l;
            if (l_13_ != 0L && l > l_13_) {
		/* empty */
            }
            qe.d = 0x1f & qe.d + 1;
            synchronized (this) {
                tw.r = la.g;
            }
            e();
        }
    }

    public final void windowOpened(WindowEvent windowevent) {
        y++;
    }

    public final void windowClosing(WindowEvent windowevent) {
        destroy();
        x++;
    }

    public final void run() {
        j++;
        do {
            try {
                if (Signlink.javaVendor != null) {
                    String string = Signlink.javaVendor.toLowerCase();
                    if (string.indexOf("sun") == -1
                            && string.indexOf("apple") == -1) {
                        if (string.indexOf("ibm") != -1
                                && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2"))) {
                            sendErrorGame("wrongjava", -1);
                            break;
                        }
                    } else {
                        String string_14_ = Signlink.javaVersion;
                        if (string_14_.equals("1.1")
                                || string_14_.startsWith("1.1.")
                                || string_14_.equals("1.2")
                                || string_14_.startsWith("1.2.")) {
                            sendErrorGame("wrongjava", -1);
                            break;
                        }
                    }
                }
                if (Signlink.javaVersion != null && Signlink.javaVersion.startsWith("1.")) {
                    int i = 2;
                    int i_15_ = 0;
                    for (/**/; Signlink.javaVersion.length() > i; i++) {
                        int i_16_ = Signlink.javaVersion.charAt(i);
                        if (i_16_ < 48 || i_16_ > 57)
                            break;
                        i_15_ = -48 - (-i_16_ - i_15_ * 10);
                    }
                    if (i_15_ >= 5)
                        ip.S = true;
                }
                Applet applet = tg.D;
                if (vj.applet != null)
                    applet = vj.applet;
                Method method = Signlink.setFocusCycleRoot;
                if (method != null) {
                    try {
                        method.invoke(applet, new Object[]{Boolean.TRUE});
                    } catch (Throwable throwable) {
			/* empty */
                    }
                }
                op.i(-3);
                as.b((byte) 92);
                setCanvas((byte) 118);
                startUp(511);
                aea.bc = in.c(15902);
                while (Class_ef.E == 0L || Class_ef.E > us.getCurrentTime(106)) {
                    mj.k = aea.bc.a(-13, nh.j);
                    for (int i = 0; mj.k > i; i++)
                        a(false);
                    b((byte) 114);
                    Class_q.a(nda.signlink, (byte) -99, ru.canvas);
                }
            } catch (Throwable throwable) {
                cea.a(errorMessage((byte) -30), -2, throwable);
                sendErrorGame("crash", -1);
            } finally {
                a((byte) -117, true);
            }
        } while (false);
    }

    public final URL getDocumentBase() {
        r++;
        if (ws.J != null)
            return null;
        if (vj.applet != null && this != vj.applet)
            return vj.applet.getDocumentBase();
        return super.getDocumentBase();
    }

    abstract void f(/*int i*/);

    public final void windowIconified(WindowEvent windowevent) {
        i++;
    }

    public static final void provideLoaderApplet(Applet applet) {
        d++;
        vj.applet = applet;
    }

    abstract void startUp(int i);

    public final void start() {
        G++;
        if (tg.D == this && !iga.k)
            Class_ef.E = 0L;
    }
}
