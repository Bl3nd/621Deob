/* hca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

final class hca implements IEnumModesCallback
{
    private static int a;
    private DirectDraw b = new DirectDraw();
    private static int[] c;
    
    public final void callbackEnumModes(DDSurfaceDesc ddsurfacedesc,
					IUnknown iunknown) {
	if (c != null) {
	    c[a++] = ddsurfacedesc.width;
	    c[a++] = ddsurfacedesc.height;
	    c[a++] = ddsurfacedesc.rgbBitCount;
	    c[a++] = ddsurfacedesc.refreshRate;
	} else
	    a += 4;
    }
    
    final int[] a(int i) {
	b.enumDisplayModes(0, null, null, this);
	c = new int[a];
	a = 0;
	b.enumDisplayModes(0, null, null, this);
	if (i >= -109)
	    b = null;
	int[] is = c;
	c = null;
	a = 0;
	return is;
    }
    
    final void a(Frame frame, int i, boolean bool, int i_0_, int i_1_,
		 int i_2_) {
	frame.setVisible(bool);
	WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
	int windowHandler = wcomponentpeer.getHwnd();
	User32.SetWindowLong(windowHandler, -16, -2147483648);
	User32.SetWindowLong(windowHandler, -20, 8);
	b.setCooperativeLevel((java.awt.Component) frame, 17);
	b.setDisplayMode(i_2_, i, i_0_, i_1_, 0);
	frame.setBounds(0, 0, i_2_, i);
	frame.toFront();
	frame.requestFocus();
    }
    
    final void a(Frame frame, boolean bool) {
	b.restoreDisplayMode();
	b.setCooperativeLevel((java.awt.Component) frame, 8);
	if (bool != false)
	    c = null;
    }
    
    public hca() {
	b.initialize(null);
    }
}
