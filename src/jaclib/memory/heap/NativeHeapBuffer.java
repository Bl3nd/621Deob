/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {

    private NativeHeap nativeHeap;
    public int size;
    private int address;
    private boolean d = true;

    public final int getSize() {
        return size;
    }

    public final synchronized void put(byte[] buf, int i, int j, int position) {
        if (j < 0 | (i < 0 | (!b() | buf == null) | i + position > buf.length) | size < j + position) {
            throw new RuntimeException();
        }
        nativeHeap.put(address, buf, i, j, position);
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        a();
    }

    private synchronized void a() {
        if (b()) {
            nativeHeap.deallocateBuffer(address);
        }
        d = false;
    }

    public final long getAddress() {
        return nativeHeap.getBufferAddress(address);
    }

    public NativeHeapBuffer(NativeHeap nativeheap, int address_, int size_) {
        size = size_;
        address = address_;
        nativeHeap = nativeheap;
    }

    private synchronized boolean b() {
        if (!nativeHeap.a() || !d) {
            return false;
        }
        return true;
    }
}
