/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Buffer;
import jaclib.peer.am;
import jaclib.peer.pa;

public class GeometryBuffer extends pa implements Buffer
{
    public final native long getAddress();
    
    public GeometryBuffer(am var_am) {
	super(var_am);
	init();
    }
    
    private final native void getub(byte[] is, int i, int i_0_, int i_1_);
    
    private final native void init();
    
    public final native int getSize();
    
    public final void a(byte[] is, int i, int i_2_, int i_3_) {
	if (i_2_ < 0 | (i + i_3_ > is.length | (is == null | i < 0))
	    || getSize() < i_3_ + i_2_)
	    throw new bs();
	putub(is, i, i_2_, i_3_);
    }
    
    private final native void putub(byte[] is, int i, int i_4_, int i_5_);
}
