/* User32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.ms.win32;
import com.ms.dll.Callback;

public class User32 {

    public static native int SetWindowLong(int windowHandler, int index, int replacement);
    
    public static native int GetWindowLong(int windowHandler, int index);
    
    public static native int CallWindowProc(Callback callback, int windowHandler, int message, int param, int param1);
    
    public static native int SetCursor(int cursorHandler);
    
    public static int SetWindowLong(int windowHandler, int index, Callback callback) {
	return 0;
    }
    
    public static native boolean SetCursorPos(int x, int y);
    
    public static native int LoadCursor(int instanceHandler, int cursor);
    
    public static native int SendMessage(int windowHandler, int message, int param, Object param1);
    
    public static int CallWindowProc(int previousWindow, int windowHandler, int message, int param, int param1) {
	    return 0;
    }
    
    public static int SetWindowLong(int windowHandler, int index, Object replacement) {
	return 0;
    }
}
