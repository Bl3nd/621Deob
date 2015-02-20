/* lda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lda {
    static int a;
    private int b;
    static int c;
    static int d;
    GameText e;
    static lda f = new lda(0, GameText.y, GameText.y, 0, 1);
    boolean g;
    static int h;
    static int i;
    boolean j;
    GameText k;
    static int l;
    int m;
    static int n;
    int o;
    static lda p = new lda(1, GameText.y, 2);
    static lda q = new lda(2, GameText.y, GameText.y, 2, 3);
    static lda r = new lda(3, GameText.y, 3);
    static lda s = new lda(4, GameText.y, GameText.y, 3, 4);
    static lda t = new lda(5, GameText.y, 4);
    static lda u = new lda(6, GameText.y, 4);
    static lda v = new lda(7, GameText.y, GameText.y, 4, 5);
    static lda w = new lda(8, GameText.y, GameText.y, 5, 98, true, true);
    static lda x = new lda(9, GameText.y, 99);
    static lda y = new lda(10, GameText.y, 100);
    static lda z = new lda(11, GameText.z, GameText.z, 0, 92, true, true);
    static lda A = new lda(12, GameText.z, GameText.z, 92, 92);
    private static lda B = new lda(13, GameText.z, GameText.z, 92, 93);
    static lda D = new lda(14, GameText.z, GameText.z, 94, 95);
    static lda E = new lda(15, GameText.z, GameText.z, 96, 97);
    static lda F = new lda(16, GameText.z, 97);
    static lda G = new lda(17, GameText.z, 97);
    static lda H = new lda(18, GameText.z, 98);
    static lda I = new lda(19, GameText.z, 100);
    static lda J = new lda(20, GameText.z, 100);
    static lda K = new lda(21, GameText.z, 100);
    static GameInPacket L = new GameInPacket(107, 7);

    public static void a(byte i) {
        K = null;
        s = null;
        x = null;
        J = null;
        B = null;
        f = null;
        D = null;
        H = null;
        v = null;
        u = null;
        p = null;
        q = null;
        if (i != 83)
            a(-93, -83L);
        I = null;
        w = null;
        G = null;
        y = null;
        z = null;
        L = null;
        E = null;
        t = null;
        A = null;
        F = null;
        r = null;
    }

    static final void a(int i, int i_0_, int i_1_) {
        l++;
        qba var_qba = ofa.a(14, i_1_, (byte) 100);
        if (i_0_ < 58)
            p = null;
        var_qba.c((byte) 11);
        ((qba) var_qba).v = i;
    }

    static final lda[] b(byte i) {
        if (i != -47)
            return null;
        c++;
        return new lda[]{f, p, q, r, s, t, u, v, w, x, y, z, A, B, D, E, F,
                G, H, I, J, K};
    }

    static final int a(int i, String string) {
        h++;
        if (i != 2)
            A = null;
        for (int i_2_ = 0; i_2_ < vt.i.length; i_2_++) {
            if (vt.i[i_2_].equalsIgnoreCase(string))
                return i_2_;
        }
        return -1;
    }

    private lda(int i, GameText var_kt, int i_3_) {
        this(i, var_kt, var_kt, i_3_, i_3_, true, false);
    }

    static final void a(int i, long l) {
        n++;
        if (ol.p != null) {
            if (ll.x == 1 || ll.x == 5)
                qm.a(-2001, l);
            else if (ll.x == 4)
                dba.a(l, 86);
        }
        dv.a(lg.r, (long) pm.currentTimedTicks, 27063);
        if (Class_vb.u != -1)
            nj.a(i - 11616, Class_vb.u);
        for (int i_4_ = 0; rba.m > i_4_; i_4_++) {
            if (la.q[i_4_])
                cj.c[i_4_] = true;
            sr.T[i_4_] = la.q[i_4_];
            la.q[i_4_] = false;
        }
        rr.g = pm.currentTimedTicks;
        if (Class_vb.u != -1) {
            rba.m = 0;
            Player.m(16383);
        }
        lg.r.JA();
        ct.a(2, lg.r);
        int i_5_ = Class_mb.j(-3);
        if (i_5_ == -1)
            i_5_ = da.e;
        if (i_5_ == -1)
            i_5_ = Login.j;
        if (i != 11493)
            p = null;
        ah.b(true, i_5_);
        GameInPacket.a(1, ((Animable) up.thisPlayer).locY, ((Animable) up.thisPlayer).height, nq.x, ((Animable) up.thisPlayer).locX);
        nq.x = 0;
    }

    final int c(byte i) {
        if (i > -97)
            a(-72, (String) null);
        lda.i++;
        return b;
    }

    private lda(int i, GameText var_kt, GameText var_kt_6_, int i_7_, int i_8_) {
        this(i, var_kt, var_kt_6_, i_7_, i_8_, true, false);
    }

    public final String toString() {
        d++;
        throw new IllegalStateException();
    }

    static final void a(int i, int i_9_, int i_10_, int i_11_, tba var_tba) {
        a++;
        if (i_10_ == 15) {
            ((tba) var_tba).loginStream.writeInt(i_11_, (int) -105);
            ((tba) var_tba).loginStream.writeShortReversed(101, i);
            ((tba) var_tba).loginStream.writeShortReversed(109, i_9_);
        }
    }

    private lda(int i, GameText var_kt, GameText var_kt_12_, int i_13_, int i_14_,
                boolean bool, boolean bool_15_) {
        ((lda) this).m = i_14_;
        ((lda) this).o = i_13_;
        b = i;
        ((lda) this).e = var_kt_12_;
        ((lda) this).g = bool_15_;
        ((lda) this).j = bool;
        ((lda) this).k = var_kt;
    }
}
