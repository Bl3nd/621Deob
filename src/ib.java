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
    private volatile int b;
    private int c;
    private boolean d;
    private volatile int e;
    
    final synchronized int callback(int i, int i_0_, int i_1_, int i_2_) {
	if (i != e) {
	    int i_3_ = User32.GetWindowLong(i, -4);
	    return User32.CallWindowProc(i_3_, i, i_0_, i_1_, i_2_);
	}
	if (i_0_ == 32) {
	    int i_4_ = 0xffff & i_2_;
	    if (i_4_ == 1) {
		User32.SetCursor(!a ? 0 : c);
		return 0;
	    }
	}
	if (i_0_ == 101024) {
	    User32.SetCursor(!a ? 0 : c);
	    return 0;
	}
	if (i_0_ == 1) {
	    e = 0;
	    a = true;
	}
	return User32.CallWindowProc(b, i, i_0_, i_1_, i_2_);
    }
    
    final void a(Component component, byte i, boolean bool) {
	WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
	int i_5_ = wcomponentpeer.getTopHwnd();
	if (e != i_5_ || !a == bool) {
	    int i_6_ = 111 % ((i + 47) / 52);
	    if (!d) {
		c = User32.LoadCursor(0, 32512);
		Root.alloc(this);
		d = true;
	    }
	    if (e != i_5_) {
		if (e != 0) {
		    a = true;
		    User32.SendMessage(i_5_, 101024, 0, 0);
		    synchronized (this) {
			User32.SetWindowLong(e, -4, b);
		    }
		}
		synchronized (this) {
		    e = i_5_;
		    b = User32.SetWindowLong(e, -4, (Object) this);
		}
	    }
	    a = bool;
	    User32.SendMessage(i_5_, 101024, 0, 0);
	}
    }
    
    final void a(int i, byte i_7_, int i_8_) {
	int i_9_ = 124 / ((i_7_ + 47) / 55);
	User32.SetCursorPos(i_8_, i);
    }
}
