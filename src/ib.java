/* ib - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

final class ib extends Callback
{
    private volatile boolean a = true;
    private volatile int replacement;
    private int c;
    private boolean d;
    private volatile int windowHandler;
    
    final synchronized int callback(int windowHandler, int message, int param, int param1) {
	if (windowHandler != this.windowHandler) {
	    int previousWindow = User32.GetWindowLong(windowHandler, -4);
	    return User32.CallWindowProc(previousWindow, windowHandler, message, param, param1);
	}
	if (message == 32) {
	    int i_4_ = 0xffff & param1;
	    if (i_4_ == 1) {
		User32.SetCursor(!a ? 0 : c);
		return 0;
	    }
	}
	if (message == 101024) {
	    User32.SetCursor(!a ? 0 : c);
	    return 0;
	}
	if (message == 1) {
	    this.windowHandler = 0;
	    a = true;
	}
	return User32.CallWindowProc(replacement, windowHandler, message, param, param1);
    }
    
    final void a(Component component, byte i, boolean bool) {
	WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
	int windowHandler = wcomponentpeer.getTopHwnd();
	if (this.windowHandler != windowHandler || !a == bool) {
	    int i_6_ = 111 % ((i + 47) / 52);
	    if (!d) {
		c = User32.LoadCursor(0, 32512);
		Root.alloc(this);
		d = true;
	    }
	    if (this.windowHandler != windowHandler) {
		if (this.windowHandler != 0) {
		    a = true;
		    User32.SendMessage(windowHandler, 101024, 0, 0);
		    synchronized (this) {
			User32.SetWindowLong(this.windowHandler, -4, replacement);
		    }
		}
		synchronized (this) {
		    this.windowHandler = windowHandler;
		    replacement = User32.SetWindowLong(this.windowHandler, -4, (Object) this);
		}
	    }
	    a = bool;
	    User32.SendMessage(windowHandler, 101024, 0, 0);
	}
    }
    
    final void a(int cursorY, byte i_7_, int cursorX) {
	int i_9_ = 124 / ((i_7_ + 47) / 55);
	User32.SetCursorPos(cursorX, cursorY);
    }
}
