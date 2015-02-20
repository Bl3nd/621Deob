/* ii - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class ii
{
    static int a;
    static pl b;
    static int c;
    static int d;
    static NPCNode[] npcNodes = new NPCNode[1024];
    
    static final void a(String string, int i, Color color, Color color_0_,
			Color color_1_, int i_2_) {
	a++;
	try {
	    Graphics graphics = ru.canvas.getGraphics();
	    if (Class_b.e == null)
		Class_b.e = new Font("Helvetica", 1, 13);
	    if (color_1_ == null)
		color_1_ = new Color(140, 17, 17);
	    if (color_0_ == null)
		color_0_ = new Color(140, 17, 17);
	    if (color == null)
		color = new Color(255, 255, 255);
	    try {
		if (dc.b == null)
		    dc.b = ru.canvas.createImage(ff.width, eh.height);
		Graphics graphics_3_ = dc.b.getGraphics();
		graphics_3_.setColor(Color.black);
		graphics_3_.fillRect(0, 0, ff.width, eh.height);
		int i_4_ = ff.width / 2 - 152;
		int i_5_ = eh.height / 2 - 18;
		graphics_3_.setColor(color_0_);
		graphics_3_.drawRect(i_4_, i_5_, 303, 33);
		graphics_3_.setColor(color_1_);
		graphics_3_.fillRect(i_4_ + 2, i_5_ + 2, i * i_2_, 30);
		graphics_3_.setColor(Color.black);
		graphics_3_.drawRect(i_4_ + 1, i_5_ + 1, 301, 31);
		graphics_3_.fillRect(i_4_ - (-(3 * i) - 2), i_5_ + 2,
				     -(i * 3) + 300, 30);
		graphics_3_.setFont(Class_b.e);
		graphics_3_.setColor(color);
		graphics_3_.drawString(string,
				       i_4_ + (304 - 6 * string.length()) / 2,
				       i_5_ + 22);
		if (uh.b != null) {
		    graphics_3_.setFont(Class_b.e);
		    graphics_3_.setColor(color);
		    graphics_3_.drawString(uh.b,
					   ff.width / 2 - uh.b.length() * 6 / 2,
					   eh.height / 2 - 26);
		}
		graphics.drawImage(dc.b, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, ff.width, eh.height);
		int i_6_ = ff.width / 2 - 152;
		int i_7_ = eh.height / 2 - 18;
		graphics.setColor(color_0_);
		graphics.drawRect(i_6_, i_7_, 303, 33);
		graphics.setColor(color_1_);
		graphics.fillRect(i_6_ + 2, i_7_ + 2, 3 * i, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(i_6_ + 1, i_7_ + 1, 301, 31);
		graphics.fillRect(3 * i + 2 + i_6_, i_7_ + 2, -(i * 3) + 300,
				  30);
		graphics.setFont(Class_b.e);
		graphics.setColor(color);
		if (uh.b != null) {
		    graphics.setFont(Class_b.e);
		    graphics.setColor(color);
		    graphics.drawString(uh.b, ff.width / 2 - uh.b.length() * 6 / 2,
					eh.height / 2 - 26);
		}
		graphics.drawString(string,
				    (-(6 * string.length()) + 304) / 2 + i_6_,
				    i_7_ + 22);
	    }
	} catch (Exception exception) {
	    ru.canvas.repaint();
	}
    }
    
    public static void a(boolean bool) {
	b = null;
	if (bool != true)
	    a(false);
	npcNodes = null;
    }
}
