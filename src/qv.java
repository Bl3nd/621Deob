/* qv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class qv
{
    private Robot a = new Robot();
    private Component b;
    
    final void showcursor(Component component, boolean bool) {
	if (bool)
	    component = null;
	else if (component == null)
	    throw new NullPointerException();
	if (b != component) {
	    if (b != null) {
		b.setCursor(null);
		b = null;
	    }
	    if (null != component) {
		component.setCursor(component.getToolkit().createCustomCursor
				    (new BufferedImage(1, 1, 2),
				     new Point(0, 0), null));
		b = component;
	    }
	}
    }
    
    final void movemouse(int i, int i_0_) {
	a.mouseMove(i, i_0_);
    }
    
    final void setcustomcursor(Component component, int[] is, int i, int i_1_,
			       Point point) {
	if (null != is) {
	    BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
	    bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
	    component.setCursor
		(component.getToolkit().createCustomCursor(bufferedimage,
							   point, null));
	} else
	    component.setCursor(null);
    }
    
    qv() throws Exception {
	/* empty */
    }
}
