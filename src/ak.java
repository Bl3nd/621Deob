/* ak - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class ak implements Runnable {

    private int a;
    static int b;
    private byte[] c;
    static int setToNewInputStream;
    static f[] e;
    private int f;
    static int close;
    private InputStream inputStream;
    static vw vw;
    private Thread thread;
    private IOException ioException;
    static int l;
    private int offset = 0;
    static int n;
    static GameOutPacket outgoingPacket48 = new GameOutPacket(48, 0);
    static GameInPacket incomingPacket26 = new GameInPacket(26, 6);
    static GameOutPacket outgoingPacket23 = new GameOutPacket(23, 18);
    static int r = 52;
    static BytesParser bytesParser;
    static long userFlow = 0L;

    public final void setNewInputStream() {
        setToNewInputStream++;
        inputStream = new InputStreamSub_1();
    }

    public static void nullLoader() {
        outgoingPacket23 = null;
        bytesParser = null;
        incomingPacket26 = null;
        ak.vw = null;
        e = null;
        outgoingPacket48 = null;
    }

    public final boolean a(int i, byte b) throws IOException {
        ak.b++;
        if (i <= 0 || i >= f) {
            throw new IOException();
        }
        synchronized (this) {
            int j;
            if (a <= offset) {
                j = offset - a;
            } else {
                j = offset + f - a;
            }
            if (i > j) {
                if (ioException != null) {
                    throw new IOException(ioException.toString());
                }
                return false;
            }
            return true;
        }
    }

    public final void close() {
        close++;
        synchronized (this) {
            if (ioException == null) {
                ioException = new IOException("");
            }
            this.notifyAll();
        }
        try {
            thread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    public final int a(int j, byte[] buf, int k) throws IOException {
        l++;
        if (j < 0 || k < 0 || buf.length < k + j) {
            throw new IOException();
        }
        synchronized (this) {
            int i1;
            if (offset >= a) {
                i1 = offset - a;
            } else {
                i1 = offset - a + f;
            }
            if (j > i1) {
                j = i1;
            }
            if (j == 0 && ioException != null) {
                throw new IOException(ioException.toString());
            }
            if (f < j + a) {
                int j1 = f - a;
                co.a(c, a, buf, k, j1);
                co.a(c, 0, buf, j1 + k, j - j1);
            } else {
                co.a(c, a, buf, k, j);
            }
            a = (a + j) % f;
            this.notifyAll();
            return j;
        }
    }

    public ak(InputStream inputstream, int i) {
        a = 0;
        inputStream = inputstream;
        f = i + 1;
        c = new byte[f];
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    public final void run() {
        n++;
        for (; ; ) {
            int length;
            synchronized (this) {
                for (; ; ) {
                    if (ioException != null) {
                        return;
                    }
                    if (a == 0) {
                        length = f - 1 - offset;
                    } else if (offset > a) {
                        length = f - offset;
                    } else {
                        length = a - offset - 1;
                    }
                    if (length > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            int j;
            try {
                j = inputStream.read(c, offset, length);
                if (j == -1) {
                    throw new EOFException();
                }
            } catch (IOException ioexception) {
                synchronized (this) {
                    ioException = ioexception;
                    break;
                }
            }
            synchronized (this) {
                offset = (offset + j) % f;
            }
        }
    }
}
