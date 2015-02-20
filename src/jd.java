/* jd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class jd extends nc
{
    private Canvas r;
    private Rectangle s;
    private Image t;
    private Shape u;
    
    final void a(int i, Canvas canvas) {
	r = canvas;
	s = new Rectangle();
	((jd) this).p = r.getSize().width;
	((jd) this).q = r.getSize().height;
	((jd) this).k = new int[((jd) this).q * ((jd) this).p];
	DataBufferInt databufferint
	    = new DataBufferInt(((jd) this).k, ((jd) this).k.length);
	if (i != -244)
	    a(39, -106, (Graphics) null, (byte) -104);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       (directcolormodel.createCompatibleSampleModel(((jd) this).p,
							     ((jd) this).q),
		databufferint, null));
	t = new BufferedImage(directcolormodel, writableraster, false,
			      new Hashtable());
    }
    
    final void a(int i, int i_0_, int i_1_, Graphics graphics, byte i_2_,
		 int i_3_) {
	u = graphics.getClip();
	s.x = i_0_;
	s.width = i_1_;
	s.height = i_3_;
	s.y = i;
	graphics.setClip(s);
	graphics.drawImage(t, 0, 0, r);
	graphics.setClip(u);
	int i_4_ = 21 / ((-12 - i_2_) / 40);
    }
    
    final void a(int i, int i_5_, Graphics graphics, byte i_6_) {
	if (i_6_ != -20)
	    a(105, 126, (Graphics) null, (byte) -33);
	graphics.drawImage(t, i, i_5_, r);
    }
}
