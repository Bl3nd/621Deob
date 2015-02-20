/* oj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class oj
{
    private static int a
	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
	      .length();
    private f[] b;
    private int c;
    private int d;
    private int[] e = new int[4];
    private boolean f = false;
    private static int[] g = new int[256];
    private int[] h;
    
    final void a(Class_r class_r, String string, int i, int i_0_, int i_1_,
		 boolean bool) {
	int i_2_ = a(string) / 2;
	class_r.oa(e);
	if (i - i_2_ <= e[2] && i + i_2_ >= e[0] && i_0_ - d <= e[3]
	    && i_0_ + c >= e[1])
	    a(class_r, string, e, i - i_2_, i_0_, i_1_, bool);
    }
    
    final int a() {
	return c - 1;
    }
    
    final int b() {
	return d;
    }
    
    final int a(String string) {
	int i = 0;
	for (int i_3_ = 0; i_3_ < string.length(); i_3_++) {
	    int i_4_ = g[string.charAt(i_3_)];
	    i += h[i_4_];
	}
	return i;
    }
    
    private final void a(Class_r class_r, Font font, FontMetrics fontmetrics,
			 char c, int i, boolean bool) {
	int i_5_ = fontmetrics.charWidth(c);
	int i_6_ = i_5_;
	if (bool) {
	    try {
		if (c == '/')
		    bool = false;
		if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k'
		    || c == 'x' || c == 'y' || c == 'A' || c == 'V'
		    || c == 'W')
		    i_5_++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int i_7_ = fontmetrics.getMaxAscent();
	int i_8_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
	int i_9_ = fontmetrics.getHeight();
	Image image = ru.canvas.createImage(i_5_, i_8_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, i_5_, i_8_);
	graphics.setColor(Color.white);
	graphics.setFont(font);
	graphics.drawString(String.valueOf(c), 0, i_7_);
	if (bool)
	    graphics.drawString(String.valueOf(c), 1, i_7_);
	int[] is = new int[i_5_ * i_8_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, i_5_, i_8_, is, 0, i_5_);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int i_10_ = 0;
    while_116_:
	for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
	    for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
		int i_13_ = is[i_12_ + i_11_ * i_5_];
		if ((i_13_ & 0xffffff) != 0) {
		    i_10_ = i_11_;
		    break while_116_;
		}
	    }
	}
	for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
	    if ((is[i_14_] & 0xffffff) == 0)
		is[i_14_] = 0;
	}
	d = i_7_ - i_10_;
	this.c = i_9_;
	h[i] = i_6_;
	b[i] = class_r.a(is, 0, i_5_, i_5_, i_8_);
    }
    
    public static void c() {
	g = null;
    }
    
    private final void a(Class_r class_r, String string, int[] is, int i,
			 int i_15_, int i_16_, boolean bool) {
	if (i_16_ == 0)
	    bool = false;
	i_16_ |= ~0xffffff;
	for (int i_17_ = 0; i_17_ < string.length(); i_17_++) {
	    int i_18_ = g[string.charAt(i_17_)];
	    if (bool)
		b[i_18_].V(i + 1, i_15_ + 1, 0, -16777216, 1);
	    b[i_18_].V(i, i_15_, 0, i_16_, 1);
	    i += h[i_18_];
	}
    }
    
    oj(Class_r class_r, int i, boolean bool, Component component) {
	f = false;
	b = new f[256];
	h = new int[256];
	Font font = new Font("Helvetica", bool ? 1 : 0, i);
	FontMetrics fontmetrics = component.getFontMetrics(font);
	for (int i_19_ = 0; i_19_ < a; i_19_++)
	    a(class_r, font, fontmetrics,
	      "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		  .charAt(i_19_),
	      i_19_, false);
	if (bool && f) {
	    f = false;
	    font = new Font("Helvetica", 0, i);
	    fontmetrics = component.getFontMetrics(font);
	    for (int i_20_ = 0; i_20_ < a; i_20_++)
		a(class_r, font, fontmetrics,
		  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		      .charAt(i_20_),
		  i_20_, false);
	    if (!f) {
		f = false;
		for (int i_21_ = 0; i_21_ < a; i_21_++)
		    a(class_r, font, fontmetrics,
		      "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			  .charAt(i_21_),
		      i_21_, true);
	    }
	}
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_22_
		= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		      .indexOf(i);
	    if (i_22_ == -1)
		i_22_ = 74;
	    g[i] = i_22_;
	}
    }
}
