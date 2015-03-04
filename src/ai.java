/* ai - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ai extends bc {

    private int e = 0;
    private long[] f = new long[10];
    private int g;
    private long h;
    private long i = 0L;
    private long currentTime;

    public final long c(int i) {
        if (i > -96) {
            h = 110L;
        }
        h += a(true);
        if (this.i > h) {
            return (this.i - h) / 1000000L;
        }
        return 0L;
    }

    public final void d(int time) {
        if (h < this.i) {
            h += this.i - h;
        }
        currentTime = (long) time;
    }

    public final int a(long l, byte b) {
        if (h >= this.i) {
            int value = 0;
            do {
                value++;
                this.i += l;
            } while (value < 10 && this.i < h);
            if (this.i < h) {
                this.i = h;
            }
            return value;
        }
        currentTime += this.i - h;
        h += this.i - h;
        this.i += l;
        return 1;
    }

    public final long b() {
        return h;
    }

    private long a(boolean bool) {
        long currentTime = 1000000L * us.getCurrentTime(120);
        long l = currentTime - this.currentTime;
        this.currentTime = currentTime;
        if (l > -5000000000L && l < 5000000000L) {
            f[e] = l;
            e = (e + 1) % 10;
            if (g < 10) {
                g++;
            }
        }
        long l1 = 0L;
        for (int i = 1; g >= i; i++) {
            l1 += f[(-i + 10 + e) % 10];
        }
        if (!bool) {
            h = -13L;
        }
        return l1 / (long) g;
    }

    public ai() {
        h = 0L;
        g = 1;
        currentTime = 0L;
    }
}
