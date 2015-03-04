/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {

    private int a;
    private byte[] buf;
    private int pos;
    private Buffer buffer;
    private int e;

    public Stream(Buffer buffer, int offset, int size) {
        this(buffer.getSize() >= 4096 ? 4096 : buffer.getSize());
        a(buffer, offset, size);
    }

    public final void a(float f) {
        if (pos + 3 >= buf.length) {
            c();
        }
        int value = floatToRawIntBits(f);
        buf[pos++] = (byte) (value >> 24);
        buf[pos++] = (byte) (value >> 16);
        buf[pos++] = (byte) (value >> 8);
        buf[pos++] = (byte) value;
    }

    public final void a(int value) {
        if (pos + 3 >= buf.length) {
            c();
        }
        buf[pos++] = (byte) (value >> 16);
        buf[pos++] = (byte) (value >> 8);
        buf[pos++] = (byte) value;
        buf[pos++] = (byte) (value >> 24);
    }

    public static boolean a() {
        if (getLSB(-65536) != -1) {
            return false;
        }
        return true;
    }

    public Stream() {
        this(4096);
    }

    public final void b(int i) {
        c();
        a = i;
    }

    public Stream(Buffer buffer) {
        this(buffer, 0, buffer.getSize());
    }

    public final void c(int value) {
        if (pos + 1 >= buf.length) {
            c();
        }
        buf[pos++] = (byte) (value >> 8);
        buf[pos++] = (byte) value;
    }

    public final int b() {
        return a + pos;
    }

    public final void c() {
        if (pos > 0) {
            if (a + pos > e) {
                throw new RuntimeException();
            }
            buffer.put(buf, 0, a, pos);
            a += pos;
            pos = 0;
        }
    }

    public final void a(int i, int j, int k, int i1) {
        if (buf.length <= pos + 3) {
            c();
        }
        buf[pos++] = (byte) i;
        buf[pos++] = (byte) j;
        buf[pos++] = (byte) k;
        buf[pos++] = (byte) i1;
    }

    public final void d(int value) {
        if (pos >= buf.length) {
            c();
        }
        buf[pos++] = (byte) value;
    }

    public final void b(float f) {
        if (buf.length <= pos + 3) {
            c();
        }
        int i = floatToRawIntBits(f);
        buf[pos++] = (byte) i;
        buf[pos++] = (byte) (i >> 8);
        buf[pos++] = (byte) (i >> 16);
        buf[pos++] = (byte) (i >> 24);
    }

    public static native int floatToRawIntBits(float f);

    public final void a(Buffer buffer) {
        a(buffer, 0, buffer.getSize());
    }

    private static native byte getLSB(int i);

    public final void b(int i, int j, int k, int i1) {
        if (buf.length <= pos + 3) {
            c();
        }
        buf[pos++] = (byte) k;
        buf[pos++] = (byte) j;
        buf[pos++] = (byte) i;
        buf[pos++] = (byte) i1;
    }

    public final void e(int value) {
        if (pos + 1 >= buf.length) {
            c();
        }
        buf[pos++] = (byte) value;
        buf[pos++] = (byte) (value >> 8);
    }

    private void a(Buffer buffer, int i, int j) {
        c();
        this.buffer = buffer;
        e = j + i;
        a = i;
        if (e > buffer.getSize()) {
            throw new RuntimeException();
        }
    }

    private Stream(int position) {
        buf = new byte[position];
    }

    public final void f(int value) {
        if (pos + 3 >= buf.length) {
            c();
        }
        buf[pos++] = (byte) value;
        buf[pos++] = (byte) (value >> 8);
        buf[pos++] = (byte) (value >> 16);
        buf[pos++] = (byte) (value >> 24);
    }
}
