/* qv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;


/**
 * Don't rename just yet until I figure out where all of the instances are for the class name.
 */
public final class qv {

    private Robot robot = new Robot();
    private Component component;

    protected final void showcursor(Component component, boolean bool) {
        if (bool) {
            component = null;
        } else if (component == null) {
            throw new NullPointerException();
        }
        if (this.component != component) {
            if (this.component != null) {
                this.component.setCursor(null);
                this.component = null;
            }
            if (null != component) {
                component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
                this.component = component;
            }
        }
    }

    public final void movemouse(int x, int y) {
        robot.mouseMove(x, y);
    }

    public final void setcustomcursor(Component component, int[] buf, int width, int height, Point point) {
        if (null != buf) {
            BufferedImage bufferedimage = new BufferedImage(width, height, 2);
            bufferedimage.setRGB(0, 0, width, height, buf, 0, width);
            component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
        } else {
            component.setCursor(null);
        }
    }

    private qv() throws Exception {
    /* empty */
    }
}
