/* ta - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

final class ta extends Node implements p
{
    long nativeid;
    Canvas k;
    private static long l;
    private static boolean m = false;
    
    final void a() {
	UA(true);
	((ta) this).nativeid = 0L;
	((ta) this).k = null;
    }
    
    private final void a(Exception exception) {
	if (!m) {
	    l = us.getCurrentTime(99);
	    m = true;
	} else if (us.getCurrentTime(108) - l < 30000L)
	    ((ta) this).k.repaint();
	else
	    throw new RuntimeException(exception.getMessage());
    }
    
    protected final void finalize() {
	if (((ta) this).nativeid != 0L)
	    iba.a(this, (byte) 37);
    }
    
    final void a(Rectangle[] rectangles, int i) {
	try {
	    synchronized (((ta) this).k.getTreeLock()) {
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
		    Rectangle rectangle = rectangles[i_0_];
		    if (rectangle.width > 0 && rectangle.height > 0)
			a(rectangle.x, rectangle.y, rectangle.width,
			  rectangle.height);
		}
		m = false;
	    }
	} catch (Exception exception) {
	    a(exception);
	}
    }
    
    final void b() {
	try {
	    synchronized (((ta) this).k.getTreeLock()) {
		H();
		m = false;
	    }
	} catch (Exception exception) {
	    a(exception);
	}
    }
    
    private final native void H();
    
    private final native void a(int i, int i_1_, int i_2_, int i_3_);
    
    ta(l class_l, Canvas canvas) {
	((ta) this).k = canvas;
	Dimension dimension = canvas.getSize();
	da(class_l, ((ta) this).k, dimension.width, dimension.height);
    }
    
    public final native void UA(boolean bool);
    
    final native void AA(Canvas canvas, int i, int i_4_);
    
    private final native void da(l class_l, Canvas canvas, int i,
				 int i_5_);
}
