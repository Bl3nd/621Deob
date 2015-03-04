/* hr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ISAAC {

    static byte a;
    private int[] keySetArray;
    static int initKeySets;
    static int getNextKeys;
    static boolean e;
    static int f;
    private int keyArrayIndex;
    static int[] h;
    static int generateNextKeySets;
    private int j;
    static int k = 2;
    private int l;
    static int getNextKeyAndPrepareNext;
    private int[] cryptArray;
    static int[] o = new int[32];
    private int p;
    static int q;

    public static void a(int i, Class_r class_r) {
        ir.d = new bq[th.j.length];
        if (i != 8) {
            e = false;
        }
        f++;
        for (int index = 0; th.j.length > index; index++) {
            int j = th.j[index];
            sa sa = GameOutPacket.a(lm.vh, j);
            la la = class_r.a(sa, aga.a(GameText.wb, j), true);
            ir.d[index] = new bq(la, sa);
        }
    }

    public final int getNextKeyAndPrepareNext(int dummy) {
        if (keyArrayIndex == 0) {
            generateNextKeySet();
            keyArrayIndex = 256;
        }
        getNextKeyAndPrepareNext++;
        return keySetArray[--keyArrayIndex];
    }

    private void initKeySet(byte dummy) {
        initKeySets++;
        int i;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2 = i = j = k = i1 = j1 = k1 = i2 = -1640531527;
        for (int count = 0; count < 4; count++) {
            j2 ^= i << 11;
            i += j;
            k += j2;
            i ^= j >>> 2;
            i1 += i;
            j += k;
            j ^= k << 8;
            k += i1;
            j1 += j;
            k ^= i1 >>> 16;
            k1 += k;
            i1 += j1;
            i1 ^= j1 << 10;
            j1 += k1;
            i2 += i1;
            j1 ^= k1 >>> 4;
            j2 += j1;
            k1 += i2;
            k1 ^= i2 << 8;
            i += k1;
            i2 += j2;
            i2 ^= j2 >>> 9;
            j2 += i;
            j += i2;
        }
        for (int index = 0; index < 256; index += 8) {
            k += keySetArray[index + 3];
            i2 += keySetArray[index + 7];
            j2 += keySetArray[index];
            j1 += keySetArray[index + 5];
            i1 += keySetArray[index + 4];
            k1 += keySetArray[index + 6];
            j += keySetArray[index + 2];
            i += keySetArray[index + 1];
            j2 ^= i << 11;
            k += j2;
            i += j;
            i ^= j >>> 2;
            i1 += i;
            j += k;
            j ^= k << 8;
            j1 += j;
            k += i1;
            k ^= i1 >>> 16;
            i1 += j1;
            k1 += k;
            i1 ^= j1 << 10;
            j1 += k1;
            i2 += i1;
            j1 ^= k1 >>> 4;
            j2 += j1;
            k1 += i2;
            k1 ^= i2 << 8;
            i2 += j2;
            i += k1;
            i2 ^= j2 >>> 9;
            j += i2;
            j2 += i;
            cryptArray[index] = j2;
            cryptArray[index + 1] = i;
            cryptArray[index + 2] = j;
            cryptArray[index + 3] = k;
            cryptArray[index + 4] = i1;
            cryptArray[index + 5] = j1;
            cryptArray[index + 6] = k1;
            cryptArray[index + 7] = i2;
        }
        int index = 0;
        if (dummy != 126) {
            o = null;
        }
        for (/**/; index < 256; index += 8) {
            i2 += cryptArray[index + 7];
            k1 += cryptArray[index + 6];
            j += cryptArray[index + 2];
            i += cryptArray[index + 1];
            j1 += cryptArray[index + 5];
            j2 += cryptArray[index];
            i1 += cryptArray[index + 4];
            k += cryptArray[index + 3];
            j2 ^= i << 11;
            i += j;
            k += j2;
            i ^= j >>> 2;
            j += k;
            i1 += i;
            j ^= k << 8;
            j1 += j;
            k += i1;
            k ^= i1 >>> 16;
            i1 += j1;
            k1 += k;
            i1 ^= j1 << 10;
            j1 += k1;
            i2 += i1;
            j1 ^= k1 >>> 4;
            j2 += j1;
            k1 += i2;
            k1 ^= i2 << 8;
            i += k1;
            i2 += j2;
            i2 ^= j2 >>> 9;
            j2 += i;
            j += i2;
            cryptArray[index] = j2;
            cryptArray[index + 1] = i;
            cryptArray[index + 2] = j;
            cryptArray[index + 3] = k;
            cryptArray[index + 4] = i1;
            cryptArray[index + 5] = j1;
            cryptArray[index + 6] = k1;
            cryptArray[index + 7] = i2;
        }
        generateNextKeySet();
        keyArrayIndex = 256;
    }

    private void generateNextKeySet() {
        ISAAC.generateNextKeySets++;
        j += ++l;
        for (int index = 0; index < 256; index++) {
            int i = cryptArray[index];
            if ((index & 0x2) == 0) {
                if ((index & 0x1) == 0) {
                    p ^= p << 13;
                } else {
                    p ^= p >>> 6;
                }
            } else if ((0x1 & index) != 0) {
                p ^= p >>> 16;
            } else {
                p ^= p << 2;
            }
            p += cryptArray[0xff & index + 128];
            int j;
            cryptArray[index] = j = cryptArray[uca.a(i, 1020) >> 2] + (p + this.j);
            keySetArray[index] = this.j = cryptArray[uca.a(255, j >> 8 >> 2)] + i;
        }
    }

    public static void nullLoader() {
        o = null;
        h = null;
    }

    private ISAAC() {
    /* empty */
    }

    public ISAAC(int[] keys) {
        cryptArray = new int[256];
        keySetArray = new int[256];
        for (int loopID = 0; loopID < keys.length; loopID++) {
            keySetArray[loopID] = keys[loopID];
        }
        initKeySet((byte) 126);
    }

    public final int getNextKey() {
        if (keyArrayIndex == 0) {
            generateNextKeySet();
            keyArrayIndex = 256;
        }
        getNextKeys++;
        return keySetArray[keyArrayIndex - 1];
    }
}
