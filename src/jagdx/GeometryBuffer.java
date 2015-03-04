/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.am;
import jaclib.peer.pa;

public class GeometryBuffer extends pa implements Buffer {

    public final native long getAddress();

    public GeometryBuffer(am am) {
        super(am);
        init();
    }

    private native void getub(byte[] is, int i, int i_0_, int i_1_);

    private native void init();

    public final native int getSize();

    public final void put(byte[] buf, int i, int j, int k) {
        if (j < 0 | (i + k > buf.length | (buf == null | i < 0)) || getSize() < k + j) {
            throw new bs();
        }
        putub(buf, i, j, k);
    }

    private final native void putub(byte[] is, int i, int i_4_, int i_5_);
}
