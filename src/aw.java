/* aw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class aw
{
    static int a;
    static int b;
    static int c;
    pl d;
    static double e = -1.0;
    static int f;
    static int g;
    private tb h = new tb(128);
    static int i;
    static int j;
    private pl k;
    static int l;
    static av m;
    tb n = new tb(64);
    
    public static void a(int i) {
	m = null;
	if (i <= 70)
	    a(null, 99);
    }
    
    final ww a(int i, int i_0_) {
	g++;
	ww var_ww;
	synchronized (h) {
	    var_ww = (ww) h.get((long) i, (byte) 100);
	}
	if (var_ww != null)
	    return var_ww;
	int i_1_ = -107 / ((-44 - i_0_) / 38);
	byte[] is;
	synchronized (k) {
	    is = k.b(i, -124, 36);
	}
	var_ww = new ww();
	((ww) var_ww).G = i;
	((ww) var_ww).f = this;
	if (is != null)
	    var_ww.a(-1, new BytesParser(is));
	var_ww.a(-92);
	synchronized (h) {
	    h.put((long) i, var_ww, 1);
	}
	return var_ww;
    }
    
    final void a(byte i) {
	synchronized (h) {
	    h.c((byte) 59);
	}
	if (i >= 126) {
	    b++;
	    synchronized (((aw) this).n) {
		((aw) this).n.c((byte) 101);
	    }
	}
    }
    
    static final sc a(int i, byte i_2_) {
	c++;
	int i_3_ = 16 % ((32 - i_2_) / 60);
	if (i < 0 || i >= 100)
	    return null;
	return he.d[i];
    }
    
    static final f a(byte[] is, int i) {
	a++;
	if (i < 29)
	    return null;
	if (is == null)
	    throw new RuntimeException("");
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		MediaTracker mediatracker = new MediaTracker(po.c);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i_4_ = image.getWidth(po.c);
		int i_5_ = image.getHeight(po.c);
		if (mediatracker.isErrorAny() || i_4_ < 0 || i_5_ < 0)
		    throw new RuntimeException("");
		int[] is_6_ = new int[i_4_ * i_5_];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i_4_, i_5_, is_6_, 0,
				       i_4_);
		pixelgrabber.grabPixels();
		return lg.r.a(is_6_, 0, i_4_, i_4_, i_5_);
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
    }
    
    final void a(byte i, int i_7_) {
	synchronized (h) {
	    h.a(true, i_7_);
	}
	int i_8_ = 64 / ((78 - i) / 44);
	j++;
	synchronized (((aw) this).n) {
	    ((aw) this).n.a(true, i_7_);
	}
    }
    
    final void b(byte i) {
	synchronized (h) {
	    h.a(18385);
	}
	aw.i++;
	synchronized (((aw) this).n) {
	    if (i <= 122)
		a((int) -26, (int) 86);
	    ((aw) this).n.a(18385);
	}
    }
    
    final void a(int i, boolean bool, int i_9_) {
	h = new tb(i_9_);
	if (bool != true)
	    a((int) -55, (byte) 19);
	f++;
	((aw) this).n = new tb(i);
    }
    
    aw(Class_rf class_rf, int i, pl var_pl, pl var_pl_10_) {
	((aw) this).d = var_pl_10_;
	k = var_pl;
	k.a(36, true);
    }
}
