/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Buffer;
import jaclib.peer.am;
import jaclib.peer.pa;

public class PixelBuffer extends pa implements Buffer
{
    private final native void puti(int[] is, int i, int i_0_, int i_1_);
    
    public final native int getSlicePitch();
    
    public final native int getSize();
    
    public final void a(int[] is, int i, int i_2_, int i_3_) {
	if (i_2_ < 0 | (is.length < i_3_ + i | (i < 0 | null == is))
	    || getSize() < 4 * i_3_ + i_2_)
	    throw new bs();
	puti(is, i, i_2_, i_3_);
    }
    
    public final long getAddress() {
	return 0L;
    }
    
    public PixelBuffer(am var_am) {
	super(var_am);
	init();
    }
    
    public final void b(int[] is, int i, int i_4_, int i_5_) {
	if (i < 0 | null == is | is.length < i_5_ + i | i_4_ < 0
	    || getSize() < i_4_ + i_5_ * 4)
	    throw new bs();
	geti(is, i, i_4_, i_5_);
    }
    
    public final void a(byte[] is, int i, int i_6_, int i_7_) {
	if (i_6_ < 0 | (i_7_ + i > is.length | (i < 0 | null == is))
	    || i_6_ + i_7_ > getSize())
	    throw new bs();
	putub(is, i, i_6_, i_7_);
    }
    
    public final native int getRowPitch();
    
    private final native void geti(int[] is, int i, int i_8_, int i_9_);
    
    private final native void getub(byte[] is, int i, int i_10_, int i_11_);
    
    private final native void putub(byte[] is, int i, int i_12_, int i_13_);
    
    private final native void init();
}
