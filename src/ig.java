/* ig - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class ig
{
    int a;
    static int b;
    byte[] c;
    int d;
    static int e = 0;
    int[] f = new int[6];
    int g;
    int[][] h;
    int i;
    byte[] j;
    byte[] k = new byte[18002];
    int[][] l;
    int m;
    byte[] n;
    byte o;
    int[] p;
    int q;
    int r;
    int s;
    int t;
    byte[] u;
    int[] v;
    int w;
    int x;
    int[] y;
    byte[] z;
    byte[][] A;
    boolean[] C;
    int D;
    int E;
    int[][] F;
    int G;
    boolean[] H;
    int I;
    
    static final void a(byte i) {
	b++;
	if (em.a == null) {
	    int i_0_ = -111 / ((i - 11) / 54);
	    java.awt.Container container;
	    if (ws.J == null) {
		if (vj.applet == null)
		    container = tg.D;
		else
		    container = vj.applet;
	    } else
		container = ws.J;
	    rda.width = container.getSize().width;
	    Class_jg.height = container.getSize().height;
	    if (ws.J == container) {
		Insets insets = ws.J.getInsets();
		rda.width -= insets.right + insets.left;
		Class_jg.height -= insets.top + insets.bottom;
	    }
	    if (ia.getWMVersion(115) == 1) {
		ff.width = baa.d;
		eh.height = Class_vb.r;
		ia.xLoc = (rda.width - baa.d) / 2;
		vh.yLoc = 0;
	    } else
		lfa.b((byte) -10);
	    if (oba.pk != hs.modeWhere) {
		if (ff.width < 1024 && eh.height < 768) {
		    /* empty */
		}
	    }
	    ru.canvas.setSize(ff.width, eh.height);
	    if (lg.r != null)
		lg.r.b(ru.canvas);
	    if (container != ws.J)
		ru.canvas.setLocation(ia.xLoc, vh.yLoc);
	    else {
		Insets insets = ws.J.getInsets();
		ru.canvas.setLocation(ia.xLoc + insets.left, insets.top + vh.yLoc);
	    }
	    if (Class_vb.u != -1)
		cv.a(true, (byte) 114);
	    ro.b(0);
	}
    }
    
    ig() {
	((ig) this).h = new int[6][258];
	((ig) this).c = new byte[4096];
	((ig) this).q = 0;
	((ig) this).l = new int[6][258];
	((ig) this).t = 0;
	((ig) this).p = new int[256];
	((ig) this).y = new int[16];
	((ig) this).z = new byte[256];
	((ig) this).j = new byte[18002];
	((ig) this).v = new int[257];
	((ig) this).C = new boolean[256];
	((ig) this).A = new byte[6][258];
	((ig) this).F = new int[6][258];
	((ig) this).H = new boolean[16];
    }
}
