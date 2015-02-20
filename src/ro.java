/* ro - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

final class ro
{
    int a;
    int b;
    static int c;
    int d;
    static GameInPacket incomingPacket109 = new GameInPacket(109, -1);
    int f;
    
    public static void a(int i) {
	incomingPacket109 = null;
	if (i != 0)
	    incomingPacket109 = null;
    }
    
    static final void b(int i) {
	c++;
	if (em.a == null) {
	    int i_0_ = ia.xLoc;
	    int i_1_ = vh.yLoc;
	    int i_2_ = rda.width - i_0_ - ff.width;
	    if (i != 0)
		incomingPacket109 = null;
	    int i_3_ = Class_jg.height - i_1_ - eh.height;
	    do {
		if (i_0_ > 0 || i_2_ > 0 || i_1_ > 0 || i_3_ > 0) {
		    try {
			java.awt.Container container;
			if (ws.J == null) {
			    if (vj.applet == null)
				container = tg.D;
			    else
				container = vj.applet;
			} else
			    container = ws.J;
			int i_4_ = 0;
			int i_5_ = 0;
			if (ws.J == container) {
			    Insets insets = ws.J.getInsets();
			    i_5_ = insets.top;
			    i_4_ = insets.left;
			}
			Graphics graphics = container.getGraphics();
			graphics.setColor(Color.black);
			if (i_0_ > 0)
			    graphics.fillRect(i_4_, i_5_, i_0_, Class_jg.height);
			if (i_1_ > 0)
			    graphics.fillRect(i_4_, i_5_, rda.width, i_1_);
			if (i_2_ > 0)
			    graphics.fillRect(i_4_ + rda.width - i_2_, i_5_, i_2_,
					      Class_jg.height);
			if (i_3_ <= 0)
			    break;
			graphics.fillRect(i_4_, Class_jg.height + (i_5_ - i_3_), rda.width,
					  i_3_);
		    } catch (Exception exception) {
			break;
		    }
		    break;
		}
	    } while (false);
	}
    }
    
    public ro() {
	/* empty */
    }
}
