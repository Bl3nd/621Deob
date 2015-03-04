/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {

    private boolean a;
    private int heap;
    long peer;

    final synchronized native int allocateBuffer(int value, boolean bool);

    final synchronized boolean a() {
        return a;
    }

    public final NativeHeapBuffer a(int size, boolean bool) {
        if (!a) {
            throw new IllegalStateException();
        }
        return new NativeHeapBuffer(this, allocateBuffer(size, bool), size);
    }

    final synchronized native void put(int address, byte[] buf, int i, int j, int position);

    final synchronized native long getBufferAddress(int address);

    final synchronized native void deallocateBuffer(int value);

    private native void allocateHeap(int heap);

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        deallocate();
    }

    final synchronized native void get(int i, byte[] buf, int j, int k, int i1);

    public final synchronized void deallocate() {
        if (a) {
            deallocateHeap();
        }
        a = false;
    }

    private native void deallocateHeap();

    public NativeHeap(int heap_) {
        heap = heap_;
        allocateHeap(heap);
        a = true;
    }
}
