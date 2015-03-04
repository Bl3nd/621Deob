/* MapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {
    private int c;

    public final boolean a(int i, int size, int j) {
        if (c != 0) {
            return false;
        }
        long addr = OpenGL.glMapBufferARB(i, j);
        if (addr == 0L) {
            return false;
        }
        this.a(addr, size);
        c = i;
        return true;
    }

    public final void put(byte[] buf, int i, int j, int position) {
        if (c == 0)
            throw new RuntimeException();
        super.put(buf, i, j, position);
    }

    public final boolean a() {
        boolean bool = true;
        if (c != 0) {
            bool = OpenGL.glUnmapBufferARB(c);
            this.a(0L, 0);
            c = 0;
        }
        return bool;
    }

    public final boolean b() {
        if (c == 0)
            return false;
        return true;
    }
}
