/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3DVertexBuffer extends IUnknown {

    int b;

    public final boolean a(Source source, int i, int i_0_, int i_1_, int i_2_) {
        if (null == source || i < 0 || source.getSize() + i < i_1_) {
            throw new bs("");
        }
        if (i_0_ < 0 || i_1_ > i_0_ + b) {
            throw new bs("");
        }
        return _Update((long) i + source.getAddress(), i_0_, i_1_, i_2_);
    }

    protected final long a() {
        b = 0;
        return super.a();
    }

    public IDirect3DVertexBuffer(am am) {
        super(am);
    }

    private native boolean _Update(long l, int i, int i_3_, int i_4_);

    public final native int Lock(int i, int i_5_, int i_6_, GeometryBuffer geometrybuffer);

    public final native int Unlock();
}
