/* ar - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ar extends pm {

    float M;
    int N;
    float O;
    boolean P;
    static int Q;
    static int R;
    static float[] S = new float[4];
    int T;
    static int U;

    public ar(qj qj, int i, int j, int k, int i1, int j1) {
        super(qj, 3553, i, i1, j1);
        this.P = false;
        this.T = j;
        this.O = (float) j / (float) i1;
        this.M = (float) k / (float) j1;
        this.N = k;
        this.a(false, (byte) -43, false);
    }

    public ar(qj qj, int i, int j, int k, int i1, boolean bool, byte[] buf, int j1) {
        super(qj, i, j, k, i1, bool, buf, j1, true);
        this.T = k;
        this.N = i1;
        if (this.i != 34037) {
            this.O = this.M = 1.0F;
            this.P = true;
        } else {
            this.P = false;
            this.O = (float) k;
            this.M = (float) i1;
        }
    }

    public ar(qj qj, int i, int j, int k, int i1, int j1, int k1) {
        super(qj, 3553, i, j, j1, k1);
        this.T = k;
        this.N = i1;
        this.M = (float) i1 / (float) k1;
        this.P = false;
        this.O = (float) k / (float) j1;
        this.a(false, (byte) -72, false);
    }

    public ar(qj qj, int i, int j, int k, int i1) {
        super(qj, i, j, k, i1);
        this.N = i1;
        this.T = k;
        if (this.i == 34037) {
            this.P = false;
            this.O = (float) k;
            this.M = (float) i1;
        } else {
            this.O = this.M = 1.0F;
            this.P = true;
        }
    }

    public ar(qj qj, int i, int j, int k, boolean bool, int[] buf) {
        super(qj, i, 6408, j, k, bool, buf, true);
        this.N = k;
        this.T = j;
        if (this.i == 34037) {
            this.O = (float) j;
            this.M = (float) k;
            this.P = false;
        } else {
            this.P = true;
            this.O = this.M = 1.0F;
        }
    }

    public ar(qj qj, int i, int j, int k, int i1, int j1, byte[] buf, int k1) {
        super(qj, 3553, i, i1, j1);
        this.T = j;
        this.N = k;
        this.a(0, k1, 0, 0, true, k, 3314, 0, buf, j);
        this.O = (float) j / (float) i1;
        this.P = false;
        this.M = (float) k / (float) j1;
        this.a(false, (byte) -96, false);
    }

    public ar(qj qj, int i, int j, int k, int i1, int j1, boolean bool) {
        super(qj, i, j, k, i1, j1);
        this.T = i1;
        if (this.i == 34037) {
            this.P = false;
            this.O = (float) i1;
            this.M = (float) j1;
        } else {
            this.O = this.M = 1.0F;
            this.P = true;
        }
        this.N = j1;
    }

    public ar(qj qj, int i, int j, int k, int i1, int[] buf) {
        super(qj, 3553, 6408, k, i1);
        this.N = j;
        this.T = i;
        this.a(88, 0, 0, i, true, j, 0, buf, 0);
        this.P = false;
        this.M = (float) j / (float) i1;
        this.O = (float) i / (float) k;
        this.a(false, (byte) -31, false);
    }

    public static long b(byte b, String string) {
        U++;
        int length = string.length();
        long l = 0L;
        if (b > -113) {
            b((byte) -80, null);
        }
        for (int index = 0; length > index; index++) {
            l = (long) string.charAt(index) + ((l << 5) - l);
        }
        return l;
    }

    public static void nullLoader(int i) {
        S = null;
        if (i != 0) {
            a(62, (byte) -9);
        }
    }

    public static boolean a(int i, byte b) {
        R++;
        if (i != (-i & i)) {
            return false;
        }
        return true;
    }

    static {
        Q = 0;
    }
}
