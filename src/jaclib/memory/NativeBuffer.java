/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
    private int a = -1;
    private long b;
    
    public final long getAddress() {
	return b;
    }
    
    protected final void a(long l, int i) {
	a = i;
	b = l;
    }
    
    public final int getSize() {
	return a;
    }
    
    private final native void put(long l, byte[] is, int i, int i_0_,
				  int i_1_);
    
    private final native void get(long l, byte[] is, int i, int i_2_,
				  int i_3_);
    
    public void a(byte[] is, int i, int i_4_, int i_5_) {
	if (i_4_ < 0 | (is.length < i_5_ + i | (is == null | b == 0L | i < 0))
	    | a < i_5_ + i_4_)
	    throw new RuntimeException();
	put(b, is, i, i_4_, i_5_);
    }
}
