/* ks - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class LoginStream extends BytesParser {

    static int Db;
    static int Eb;
    static int Fb;
    static int Gb;
    static int Hb;
    static int Ib;
    static int Jb;
    private int bitPos;
    static int Lb;
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
        ((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value + isaac.getNextKeyAndPrepareNext((int) 21));
    }

    public final void a(byte b, ISAAC isaac_) {
        Fb++;
        isaac = isaac_;
        int unused = 94 % ((b - 48) / 44);
    }

    public final int f(boolean bool) {
        Nb++;
        if (bool != false) {
            return -114;
        }
        int value = 0xff & ((BytesParser) this).bytes[((BytesParser) this).pos++] - isaac.getNextKeyAndPrepareNext((int) -80);
        if (value < 128) {
            return value;
        }
        return ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos++] - isaac.getNextKeyAndPrepareNext((int) -90))
                + (value - 128 << 8));
    }

    public final int readBits(boolean addToIgnoreGameInPacket, int amountOfBits) {
        Lb++;
        int bytePos = bitPos >> 3;
        int hash = 8 - (bitPos & 0x7);
        bitPos += amountOfBits;
        int value = 0;
        for (/**/; hash < amountOfBits; hash = 8) {
            value += (((BytesParser) this).bytes[bytePos++] & qfa.d[hash]) << amountOfBits - hash;
            amountOfBits -= hash;
        }
        if (addToIgnoreGameInPacket != false) {
            LoginStream.addToIgnoreGameInPacket = null;
        }
        if (hash == amountOfBits) {
            value += qfa.d[hash] & ((BytesParser) this).bytes[bytePos];
        } else {
            value += ((BytesParser) this).bytes[bytePos] >> hash - amountOfBits & qfa.d[amountOfBits];
        }
        return value;
    }

    public final int b(boolean bool, int value) {
        if (bool != false) {
            sa = null;
        }
        Jb++;
        return value * 8 - bitPos;
    }

    static final void l(byte i) {
        for (ql var_ql = (ql) pu.o.a((int) 102); var_ql != null;
             var_ql = (ql) pu.o.b((byte) 77)) {
            if (((ql) var_ql).u)
                var_ql.a((byte) -99);
        }
        Ib++;
        if (i < 12)
            Qb = -0.95168245F;
        for (ql var_ql = (ql) bea.h.a((int) 91); var_ql != null;
             var_ql = (ql) bea.h.b((byte) 52)) {
            if (((ql) var_ql).u)
                var_ql.a((byte) -99);
        }
    }

    public static void y(int i) {
        if (i == 28554) {
            addToIgnoreGameInPacket = null;
            sa = null;
        }
    }

    final boolean m(byte i) {
        Mb++;
        int i_5_ = ((BytesParser) this).bytes[((BytesParser) this).pos] - isaac.getNextKey((byte) 86) & 0xff;
        if (i != 17)
            isaac = null;
        if (i_5_ < 128)
            return false;
        return true;
    }

    final void a(int i, int i_6_, byte[] is, int i_7_) {
        for (int i_8_ = 0; i_8_ < i_6_; i_8_++)
            is[i_8_ + i]
                    = (byte) (((BytesParser) this).bytes[((BytesParser) this).pos++] - isaac.getNextKeyAndPrepareNext((int) 120));
        int i_9_ = -38 % ((i_7_ + 10) / 44);
        Db++;
    }

    LoginStream(int i) {
        super(i);
    }

    final void finishBits(byte i) {
        ((BytesParser) this).pos = (bitPos + 7) / 8;
        if (i <= -41)
            Gb++;
    }

    final void initBits(int i) {
        bitPos = i * ((BytesParser) this).pos;
        Eb++;
    }

    final void a(byte b, int[] keys) {
        Hb++;
        isaac = new ISAAC(keys);
        if (b >= -3) {
            bitPos = 37;
        }
    }
}
