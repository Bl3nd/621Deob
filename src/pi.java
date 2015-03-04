/* pi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pi implements gj {
    boolean a;
    int b;
    int borderThickness;
    static int d;
    int e;
    int shadowColor;
    int itemStackSize;
    static GameInPacket incomingPacket_74;
    int itemId;
    static int j;
    static int k;
    static int l;
    static String[] m = new String[100];
    static int n;
    static int o;

    public final boolean a(gj var_gj, int i) {
        d++;
        if (!(var_gj instanceof pi))
            return false;
        pi var_pi_0_ = (pi) var_gj;
        if (((pi) this).e != ((pi) var_pi_0_).e)
            return false;
        if (((pi) this).itemId != ((pi) var_pi_0_).itemId)
            return false;
        int i_1_ = -115 / ((35 - i) / 41);
        if (((pi) this).itemStackSize != ((pi) var_pi_0_).itemStackSize)
            return false;
        if (((pi) this).borderThickness != ((pi) var_pi_0_).borderThickness)
            return false;
        if (((pi) this).shadowColor != ((pi) var_pi_0_).shadowColor)
            return false;
        if (((pi) var_pi_0_).b != ((pi) this).b)
            return false;
        if (!((pi) this).a == ((pi) var_pi_0_).a)
            return false;
        return true;
    }

    public final long a(int i) {
        j++;
        long[] ls = ml.a;
        long l = -1L;
        l = l >>> 8 ^ ls[(int) (0xffL & ((long) ((pi) this).e ^ l))];
        l = l >>> 8 ^ ls[(int) ((l ^ (long) (((pi) this).itemId >> 8)) & 0xffL)];
        l = l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) ((pi) this).itemId))];
        if (i <= 42)
            return -14L;
        l = ls[(int) (((long) (((pi) this).itemStackSize >> 24) ^ l) & 0xffL)] ^ l >>> 8;
        l = l >>> 8 ^ ls[(int) (((long) (((pi) this).itemStackSize >> 16) ^ l) & 0xffL)];
        l = l >>> 8 ^ ls[(int) ((l ^ (long) (((pi) this).itemStackSize >> 8)) & 0xffL)];
        l = l >>> 8 ^ ls[(int) ((l ^ (long) ((pi) this).itemStackSize) & 0xffL)];
        l = ls[(int) ((l ^ (long) ((pi) this).borderThickness) & 0xffL)] ^ l >>> 8;
        l = ls[(int) (0xffL & ((long) (((pi) this).shadowColor >> 24) ^ l))] ^ l >>> 8;
        l = ls[(int) (0xffL & ((long) (((pi) this).shadowColor >> 16) ^ l))] ^ l >>> 8;
        l = ls[(int) (0xffL & (l ^ (long) (((pi) this).shadowColor >> 8)))] ^ l >>> 8;
        l = l >>> 8 ^ ls[(int) (((long) ((pi) this).shadowColor ^ l) & 0xffL)];
        l = l >>> 8 ^ ls[(int) (0xffL & ((long) ((pi) this).b ^ l))];
        l = ls[(int) (0xffL & (l ^ (long) (((pi) this).a ? 1 : 0)))] ^ l >>> 8;
        return l;
    }

    public static void b(int i) {
        if (i != 255)
            b(70);
        m = null;
        incomingPacket_74 = null;
    }

    public static void a(int i, boolean bool, int samplesPerSec, int j) {
        l++;
        if (samplesPerSec < 8000 || samplesPerSec > 48000) {
            throw new IllegalArgumentException();
        }
        if (j >= 32) {
            k = i;
            wq.p = bool;
            gba.samplesPerSec = samplesPerSec;
        }
    }

    static {
        incomingPacket_74 = new GameInPacket(74, 11);
        n = -1;
    }
}
