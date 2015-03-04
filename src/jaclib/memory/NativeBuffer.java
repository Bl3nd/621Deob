/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {

    private int size = -1;
    private long address;

    public final long getAddress() {
        return address;
    }

    protected final void a(long addr, int size_) {
        size = size_;
        address = addr;
    }

    public final int getSize() {
        return size;
    }

    private native void put(long address, byte[] buf, int i, int j, int position);

    private native void get(long address, byte[] buf, int i, int j, int k);

    public void put(byte[] buf, int i, int j, int position) {
        if (j < 0 | (buf.length < position + i | (buf == null | address == 0L | i < 0)) | size < position + j) {
            throw new RuntimeException();
        }
        put(address, buf, i, j, position);
    }
}
