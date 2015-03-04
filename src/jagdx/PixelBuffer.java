/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.am;
import jaclib.peer.pa;

public class PixelBuffer extends pa implements Buffer {

    private native void puti(int[] is, int i, int i_0_, int i_1_);

    public final native int getSlicePitch();

    public final native int getSize();

    public final void a(int[] is, int i, int i_2_, int i_3_) {
        if (i_2_ < 0 | (is.length < i_3_ + i | (i < 0 | null == is)) || getSize() < 4 * i_3_ + i_2_) {
            throw new bs();
        }
        puti(is, i, i_2_, i_3_);
    }

    public final long getAddress() {
        return 0L;
    }

    public PixelBuffer(am am) {
        super(am);
        init();
    }

    public final void b(int[] is, int i, int i_4_, int i_5_) {
        if (i < 0 | null == is | is.length < i_5_ + i | i_4_ < 0 || getSize() < i_4_ + i_5_ * 4) {
            throw new bs();
        }
        geti(is, i, i_4_, i_5_);
    }

    public final void put(byte[] buf, int i, int j, int k) {
        if (j < 0 | (k + i > buf.length | (i < 0 | null == buf)) || j + k > getSize()) {
            throw new bs();
        }
        putub(buf, i, j, k);
    }

    public final native int getRowPitch();

    private native void geti(int[] is, int i, int i_8_, int i_9_);

    private native void getub(byte[] is, int i, int i_10_, int i_11_);

    private native void putub(byte[] is, int i, int i_12_, int i_13_);

    private native void init();
}
