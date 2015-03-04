/* ks - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class LoginStream extends BytesParser {

    static int Db;
    static int initBits;
    static int Fb;
    static int finishBits;
    static int Hb;
    static int Ib;
    static int Jb;
    private int bitPos;
    static int readBits;
    static int Mb;
    static int Nb;
    static int Ob;
    static GameInPacket addToIgnoreGameInPacket = new GameInPacket(33, -1);
    static float Qb;
    static int Rb;
    private ISAAC isaac;
    static int Tb;
    static sa sa;

    public final void n(int i, int value) {
        if (i != 26951) {
            a(73, 76, null, 84);
        }
        Ob++;
        ((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value + isaac.getNextKeyAndPrepareNext(21));
    }

    public final void a(ISAAC isaac_) {
        Fb++;
        isaac = isaac_;
    }

    public final int f(boolean bool) {
        Nb++;
        if (bool) {
            return -114;
        }
        int value = 0xff & this.bytes[this.pos++] - isaac.getNextKeyAndPrepareNext(-80);
        if (value < 128) {
            return value;
        }
        return ((0xff & this.bytes[this.pos++] - isaac.getNextKeyAndPrepareNext(-90)) + (value - 128 << 8));
    }

    public final int readBits(boolean addToIgnoreGameInPacket, int amountOfBits) {
        readBits++;
        int bytePos = bitPos >> 3;
        int hash = 8 - (bitPos & 0x7);
        bitPos += amountOfBits;
        int value = 0;
        for (/**/; hash < amountOfBits; hash = 8) {
            value += (this.bytes[bytePos++] & qfa.d[hash]) << amountOfBits - hash;
            amountOfBits -= hash;
        }
        if (addToIgnoreGameInPacket) {
            LoginStream.addToIgnoreGameInPacket = null;
        }
        if (hash == amountOfBits) {
            value += qfa.d[hash] & this.bytes[bytePos];
        } else {
            value += this.bytes[bytePos] >> hash - amountOfBits & qfa.d[amountOfBits];
        }
        return value;
    }

    public final int b(boolean bool, int value) {
        if (bool) {
            sa = null;
        }
        Jb++;
        return value * 8 - bitPos;
    }

    public static void l(byte b) {
        for (ql ql = (ql) pu.o.a(102); ql != null; ql = (ql) pu.o.b((byte) 77)) {
            if (ql.u) {
                ql.a((byte) -99);
            }
        }
        Ib++;
        if (b < 12) {
            Qb = -0.95168245F;
        }
        for (ql ql = (ql) bea.h.a(91); ql != null; ql = (ql) bea.h.b((byte) 52)) {
            if (ql.u) {
                ql.a((byte) -99);
            }
        }
    }

    public static void nullLoader() {
        addToIgnoreGameInPacket = null;
        sa = null;
    }

    public final boolean m(byte b) {
        Mb++;
        int nextKey = this.bytes[this.pos] - isaac.getNextKey() & 0xff;
        if (b != 17) {
            isaac = null;
        }
        if (nextKey < 128) {
            return false;
        }
        return true;
    }

    public final void a(int i, int j, byte[] buf, int dummy) {
        for (int index = 0; index < j; index++) {
            buf[index + i] = (byte) (this.bytes[this.pos++] - isaac.getNextKeyAndPrepareNext(120));
        }
        Db++;
    }

    public LoginStream(int size) {
        super(size);
    }

    public final void finishBits(byte b) {
        this.pos = (bitPos + 7) / 8;
        if (b <= -41) {
            finishBits++;
        }
    }

    public final void initBits(int value) {
        bitPos = value * this.pos;
        initBits++;
    }

    public final void a(byte b, int[] keys) {
        Hb++;
        isaac = new ISAAC(keys);
        if (b >= -3) {
            bitPos = 37;
        }
    }
}
