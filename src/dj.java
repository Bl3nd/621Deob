/* dj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dj implements haa {
    static int getClientVarpBit;
    static int b = 0;
    static int getClientVarp;
    private int[] configs;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    static int setConfigs;
    int[] k;
    static int l;
    private il m = new il(128);
    static int n;
    static int o;

    final void a(boolean bool, int i, int i_0_) {
        h++;
        if (bool != true)
            a(113, null, -10, 127);
        ((dj) this).k[i_0_] = i;
        Class_nd class_nd = (Class_nd) m.a(-32748, (long) i_0_);
        if (class_nd == null) {
            class_nd = new Class_nd(us.getCurrentTime(102) + 500L);
            m.a(class_nd, (byte) -36, (long) i_0_);
        } else
            ((Class_nd) class_nd).m = us.getCurrentTime(101) + 500L;
    }

    final void a(int i, int i_1_, int i_2_) {
        dj.i++;
        Class_qb class_qb = bw.t.a((byte) 126, i);
        if (i_2_ > -34)
            ((dj) this).k = null;
        int i_3_ = ((Class_qb) class_qb).c;
        int i_4_ = ((Class_qb) class_qb).d;
        int i_5_ = ((Class_qb) class_qb).b;
        int i_6_ = Class_qb.j[i_5_ - i_4_];
        if (i_1_ < 0 || i_6_ < i_1_)
            i_1_ = 0;
        i_6_ <<= i_4_;
        setConfig(i_3_, 0, (i_6_ ^ 0xffffffff) & configs[i_3_] | i_1_ << i_4_ & i_6_);
    }

    public final int getClientVarp(int clientVarp, int i) {
        getClientVarp++;
        return ((dj) this).k[clientVarp];
    }

    final void setConfig(int configID, int dummy, int value) {
        if (dummy != 0)
            m = null;
        configs[configID] = value;
        setConfigs++;
        Class_nd class_nd = (Class_nd) m.a(-32748, (long) configID);
        if (class_nd == null) {
            class_nd = new Class_nd(4611686018427387905L);
            m.a(class_nd, (byte) -85, (long) configID);
        } else if (((Class_nd) class_nd).m != 4611686018427387905L)
            ((Class_nd) class_nd).m = 0x4000000000000000L | us.getCurrentTime(120) + 500L;
    }

    public final int getClientVarpBit(int i, int varpBit) {
        getClientVarpBit++;
        if (i < 111) {
            return 124;
        }
        Class_qb class_qb = bw.t.a((byte) 126, varpBit);
        int j = class_qb.c;
        int k = class_qb.d;
        int i1 = class_qb.b;
        int j1 = Class_qb.j[i1 - k];
        return j1 & this.k[j] >> k;
    }

    final void c(int i, int i_16_, int i_17_) {
        f++;
        Class_qb class_qb = bw.t.a((byte) 126, i);
        int i_18_ = ((Class_qb) class_qb).c;
        if (i_17_ == 16383) {
            int i_19_ = ((Class_qb) class_qb).d;
            int i_20_ = ((Class_qb) class_qb).b;
            int i_21_ = Class_qb.j[i_20_ - i_19_];
            if (i_16_ < 0 || i_16_ > i_21_)
                i_16_ = 0;
            i_21_ <<= i_19_;
            a(true, (i_16_ << i_19_ & i_21_
                    | (i_21_ ^ 0xffffffff) & ((dj) this).k[i_18_]), i_18_);
        }
    }

    final void a(int i) {
        for (int index = 0; fj.t.j > index; index++) {
            hga hga = fj.t.a(index, true);
            if (hga != null && hga.d == 0) {
                configs[index] = 0;
                this.k[index] = 0;
            }
        }
        if (i != 10542)
            a(-45, null, 56, -128);
        e++;
        m = new il(128);
    }

    static final void a(ua var_ua, int i, Interface var_kp, la var_la, int i_23_,
                        String string, int i_24_, int i_25_, int i_26_,
                        sa var_sa, int i_27_, byte i_28_) {
        g++;
        int i_29_;
        if (ll.x != 4)
            i_29_ = pt.b + (int) qw.n & 0x3fff;
        else
            i_29_ = 0x3fff & (int) qw.n;
        int i_30_ = Math.max(((Interface) var_kp).minHScroll / 2, ((Interface) var_kp).minVScroll / 2) + 10;
        int i_31_ = i * i + i_27_ * i_27_;
        if (i_31_ <= i_30_ * i_30_) {
            int i_32_ = GameInPacket.ints1[i_29_];
            int i_33_ = GameInPacket.ints2[i_29_];
            if (ll.x != 4) {
                i_32_ = 256 * i_32_ / (vd.N + 256);
                i_33_ = 256 * i_33_ / (vd.N + 256);
            }
            int i_34_ = i_27_ * i_33_ + i_32_ * i >> 14;
            int i_35_ = 74 / ((35 - i_28_) / 45);
            int i_36_ = i * i_33_ - i_27_ * i_32_ >> 14;
            int i_37_ = var_sa.a(string, null, 100, -112);
            int i_38_ = var_sa.a(100, 0, string, (byte) -62, null);
            i_34_ -= i_37_ / 2;
            if (i_34_ >= -((Interface) var_kp).minHScroll && ((Interface) var_kp).minHScroll >= i_34_
                    && -((Interface) var_kp).minVScroll <= i_36_ && ((Interface) var_kp).minVScroll >= i_36_)
                var_la.a(0, 0, var_ua, i_37_, string, i_24_, 1, -51, 0, 50,
                        null, null, i_25_, i_26_,
                        ((Interface) var_kp).minVScroll / 2 - i_23_ + i_26_ - i_38_ - i_36_,
                        i_34_ + (i_25_ + ((Interface) var_kp).minHScroll / 2));
        }
    }

    public dj() {
        configs = new int[((Class_ad) fj.t).j];
        ((dj) this).k = new int[((Class_ad) fj.t).j];
    }

    final int a(byte i, boolean bool) {
        dj.l++;
        long l = us.getCurrentTime(109);
        int i_39_ = 119 / ((16 - i) / 46);
        for (Class_nd class_nd
                     = bool ? (Class_nd) m.b((byte) 124) : (Class_nd) m.b(12561);
             class_nd != null; class_nd = (Class_nd) m.b(12561)) {
            if ((((Class_nd) class_nd).m & 0x3fffffffffffffffL) < l) {
                if ((((Class_nd) class_nd).m & 0x4000000000000000L) != 0L) {
                    int i_40_ = (int) ((Node) class_nd).nodeID;
                    ((dj) this).k[i_40_] = configs[i_40_];
                    class_nd.unlink(-19);
                    return i_40_;
                }
                class_nd.unlink(-13);
            }
        }
        return -1;
    }

    static final byte[] a(int i, byte[] is, int i_41_, int i_42_) {
        n++;
        byte[] is_43_ = new byte[i_41_];
        co.a(is, i_42_, is_43_, 0, i_41_);
        if (i != -1047)
            o = 11;
        return is_43_;
    }
}
