/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source
{
    private NativeHeap a;
    public int b;
    private int c;
    private boolean d = true;
    
    public final int getSize() {
	return b;
    }
    
    public final synchronized void a(byte[] is, int i, int i_0_, int i_1_) {
	if (i_0_ < 0 | (i < 0 | (!b() | is == null) | i + i_1_ > is.length)
	    | b < i_0_ + i_1_)
	    throw new RuntimeException();
	a.put(c, is, i, i_0_, i_1_);
    }
    
    protected final synchronized void finalize() throws Throwable {
	super.finalize();
	a();
    }
    
    private final synchronized void a() {
	if (b())
	    a.deallocateBuffer(c);
	d = false;
    }
    
    public final long getAddress() {
	return a.getBufferAddress(c);
    }
    
    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_2_) {
	b = i_2_;
	c = i;
	a = nativeheap;
    }
    
    private final synchronized boolean b() {
	if (!a.a() || !d)
	    return false;
	return true;
    }
}
