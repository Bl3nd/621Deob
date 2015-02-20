/* wv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public final class wv
{
    private GraphicsDevice a;
    private DisplayMode b;
    
    public final void enter(Frame frame, int i, int i_0_, int i_1_, int i_2_) {
	b = a.getDisplayMode();
	if (b == null)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	a(frame, (byte) 121);
	if (i_2_ == 0) {
	    int i_3_ = b.getRefreshRate();
	    DisplayMode[] displaymodes = a.getDisplayModes();
	    boolean bool = false;
	    for (int i_4_ = 0; displaymodes.length > i_4_; i_4_++) {
		if (i == displaymodes[i_4_].getWidth()
		    && i_0_ == displaymodes[i_4_].getHeight()
		    && i_1_ == displaymodes[i_4_].getBitDepth()) {
		    int i_5_ = displaymodes[i_4_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_5_ - i_3_) < Math.abs(i_2_ - i_3_)) {
			bool = true;
			i_2_ = i_5_;
		    }
		}
	    }
	    if (!bool)
		i_2_ = i_3_;
	}
	a.setDisplayMode(new DisplayMode(i, i_0_, i_1_, i_2_));
    }
    
    public final void exit() {
	if (null != b) {
	    a.setDisplayMode(b);
	    if (!a.getDisplayMode().equals(b))
		throw new RuntimeException
			  ("Did not return to correct resolution!");
	    b = null;
	}
	a(null, (byte) 121);
    }
    
    public wv() throws Exception {
	GraphicsEnvironment graphicsenvironment
	    = GraphicsEnvironment.getLocalGraphicsEnvironment();
	a = graphicsenvironment.getDefaultScreenDevice();
	if (!a.isFullScreenSupported()) {
	    GraphicsDevice[] graphicsdevices
		= graphicsenvironment.getScreenDevices();
	    GraphicsDevice[] graphicsdevices_6_ = graphicsdevices;
	    for (int i = 0; graphicsdevices_6_.length > i; i++) {
		GraphicsDevice graphicsdevice = graphicsdevices_6_[i];
		if (graphicsdevice != null
		    && graphicsdevice.isFullScreenSupported()) {
		    a = graphicsdevice;
		    return;
		}
	    }
	    throw new Exception();
	}
    }
    
    private final void a(Frame frame, byte i) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_7_ = ((Boolean) field.get(a)).booleanValue();
	    if (bool_7_) {
		field.set(a, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	if (i != 121)
	    listmodes();
	try {
	    a.setFullScreenWindow(frame);
	} catch (Exception object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(a, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    //throw object;
	}
	if (bool) {
	    try {
		Field field = Class.forName("sun.awt.Win32GraphicsDevice")
				  .getDeclaredField("valid");
		field.set(a, Boolean.TRUE);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    public final int[] listmodes() {
	DisplayMode[] displaymodes = a.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i = 0; i < displaymodes.length; i++) {
	    is[i << 2] = displaymodes[i].getWidth();
	    is[(i << 2) + 1] = displaymodes[i].getHeight();
	    is[(i << 2) + 2] = displaymodes[i].getBitDepth();
	    is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
	}
	return is;
    }
}
