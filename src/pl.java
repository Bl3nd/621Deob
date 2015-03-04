/* pl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pl {
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    private Object[][] g;
    static int h;
    static int i;
    private ur j;
    static int k;
    static int l;
    static int m;
    static int n;
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    private Object[] v;
    private boolean w;
    static int x;
    int y;
    static int z;
    static int A;
    static int B;
    static int C;
    static int D;
    static int[][] E
            = {{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4},
            {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4},
            {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3},
            {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
    static int F;
    static int G;
    static int H;
    static int I;
    static int J;
    static int K;
    private ds L = null;
    static int M;
    static int N;
    static int O;
    static int P;
    static int Q;

    final boolean a(String string, int i, String string_0_) {
        z++;
        if (!b(false))
            return false;
        string = string.toLowerCase();
        string_0_ = string_0_.toLowerCase();
        int i_1_ = ((ds) L).k.a(World.a(string), 106);
        if (i_1_ < 0)
            return false;
        int i_2_ = ((ds) L).l[i_1_].a(World.a(string_0_), 119);
        if (i < 7)
            w = true;
        if (i_2_ < 0)
            return false;
        return true;
    }

    final int a(int i) {
        J++;
        if (i != 6)
            return -16;
        if (!b(false))
            throw new IllegalStateException("");
        return ((ds) L).o;
    }

    final int a(String string, int i) {
        M++;
        int i_3_ = 4 % ((i + 9) / 42);
        if (!b(false))
            return -1;
        string = string.toLowerCase();
        int i_4_ = ((ds) L).k.a(World.a(string), 99);
        if (!f(-1, i_4_))
            return -1;
        return i_4_;
    }

    final int a(byte i) {
        q++;
        if (i != -107)
            return -50;
        if (!b(false))
            return -1;
        return ((ds) L).c.length;
    }

    final void a(boolean bool, boolean bool_5_, byte i) {
        if (i < 8)
            E = null;
        b++;
        if (b(false)) {
            if (bool) {
                ((ds) L).n = null;
                ((ds) L).k = null;
            }
            if (bool_5_) {
                ((ds) L).h = null;
                ((ds) L).l = null;
            }
        }
    }

    final byte[] a(int i, int i_6_) {
        m++;
        if (!b(false))
            return null;
        if (i < 91)
            f(-2, 54);
        if (((ds) L).c.length == 1)
            return b(i_6_, 42, 0);
        if (!f(-1, i_6_))
            return null;
        if (((ds) L).c[i_6_] == 1)
            return b(0, -118, i_6_);
        throw new RuntimeException();
    }

    final byte[] a(int i, String string, String string_7_) {
        G++;
        if (!b(false))
            return null;
        string = string.toLowerCase();
        string_7_ = string_7_.toLowerCase();
        int i_8_ = ((ds) L).k.a(World.a(string), 122);
        if (!f(-1, i_8_))
            return null;
        if (i < 57)
            f = -82;
        int i_9_ = ((ds) L).l[i_8_].a(World.a(string_7_), 99);
        return b(i_9_, 36, i_8_);
    }

    final int a(byte i, int i_10_) {
        t++;
        if (!b(false))
            return -1;
        int i_11_ = ((ds) L).k.a(i_10_, 101);
        if (!f(-1, i_11_))
            return -1;
        if (i != -126)
            return 104;
        return i_11_;
    }

    final void a(String string, byte i) {
        if (i == 54) {
            P++;
            if (b(false)) {
                string = string.toLowerCase();
                int i_12_ = ((ds) L).k.a(World.a(string), 111);
                h(-107, i_12_);
            }
        }
    }

    final void b(int i, int i_13_) {
        x++;
        if (i != 16)
            a((byte) 8, -75);
        if (f(-1, i_13_)) {
            if (g != null)
                g[i_13_] = null;
        }
    }

    final int a(int i, boolean bool) {
        o++;
        if (bool != true)
            E = null;
        if (!f(-1, i))
            return 0;
        return ((ds) L).c[i];
    }

    final boolean a(boolean bool, int i) {
        if (bool != false)
            return false;
        l++;
        if (!f(-1, i))
            return false;
        if (v[i] != null)
            return true;
        d(i, 0);
        if (v[i] != null)
            return true;
        return false;
    }

    private final boolean a(String string, String string_14_, int i) {
        pl.i++;
        if (!b(false))
            return false;
        string_14_ = string_14_.toLowerCase();
        if (i != 2)
            f = 33;
        string = string.toLowerCase();
        int i_15_ = ((ds) L).k.a(World.a(string_14_), 102);
        if (!f(i ^ ~0x2, i_15_))
            return false;
        int i_16_ = ((ds) L).l[i_15_].a(World.a(string), 120);
        return a(i_16_, (byte) 108, i_15_);
    }

    final int b(String string, int i) {
        O++;
        if (!b(false))
            return 0;
        if (i < 46)
            v = null;
        string = string.toLowerCase();
        int i_17_ = ((ds) L).k.a(World.a(string), 108);
        return e(63, i_17_);
    }

    final int[] c(int i, int i_18_) {
        u++;
        if (!f(-1, i))
            return null;
        int[] is = ((ds) L).d[i];
        if (is == null) {
            is = new int[((ds) L).r[i]];
            for (int i_19_ = 0; is.length > i_19_; i_19_++)
                is[i_19_] = i_19_;
        }
        if (i_18_ > -109)
            return null;
        return is;
    }

    private final void d(int i, int i_20_) {
        if (w)
            v[i] = j.b(i, 750);
        else
            v[i] = kg.a(-137, j.b(i, 750), false);
        if (i_20_ == 0)
            I++;
    }

    final void b(int i) {
        F++;
        if (g != null) {
            for (int i_21_ = 0; g.length > i_21_; i_21_++)
                g[i_21_] = null;
        }
        if (i != -27756)
            E = null;
    }

    final boolean c(int i) {
        h++;
        if (i != 28528)
            c(-102);
        if (!b(false))
            return false;
        boolean bool = true;
        for (int i_22_ = 0; ((ds) L).g.length > i_22_; i_22_++) {
            int i_23_ = ((ds) L).g[i_22_];
            if (v[i_23_] == null) {
                d(i_23_, 0);
                if (v[i_23_] == null)
                    bool = false;
            }
        }
        return bool;
    }

    final int a(boolean bool) {
        a++;
        if (!b(bool))
            return 0;
        int i = 0;
        int i_24_ = 0;
        for (int i_25_ = 0; v.length > i_25_; i_25_++) {
            if (((ds) L).r[i_25_] > 0) {
                i_24_ += e(80, i_25_);
                i += 100;
            }
        }
        if (i == 0)
            return 100;
        int i_26_ = 100 * i_24_ / i;
        return i_26_;
    }

    private final int e(int i, int i_27_) {
        Q++;
        if (!f(-1, i_27_))
            return 0;
        if (v[i_27_] != null)
            return 100;
        if (i < 6)
            j = null;
        return j.c(95, i_27_);
    }

    public static void d(int i) {
        if (i != 0)
            c(true);
        E = null;
    }

    private final boolean b(boolean bool) {
        if (bool != false)
            a(107, (byte) -90, -53);
        d++;
        if (L == null) {
            L = j.a((byte) -14);
            if (L == null)
                return false;
            g = new Object[((ds) L).f][];
            v = new Object[((ds) L).f];
        }
        return true;
    }

    final void b(byte i) {
        if (v != null) {
            for (int i_28_ = 0; v.length > i_28_; i_28_++)
                v[i_28_] = null;
        }
        s++;
    }

    final boolean a(boolean bool, String string) {
        r++;
        if (!b(bool))
            return false;
        string = string.toLowerCase();
        if (bool != false)
            v = null;
        int i = ((ds) L).k.a(World.a(string), 111);
        return a(false, i);
    }

    static final boolean c(boolean bool) {
        C++;
        Node class_d = ((Node) ((Class_ae) oba.I).o).next;
        if (class_d == null || class_d == ((Class_ae) oba.I).o)
            return false;
        if (bool != false)
            return true;
        bfa var_bfa = (bfa) class_d;
        if (((bfa) var_bfa).v >= 2000)
            ((bfa) var_bfa).v -= 2000;
        if (((bfa) var_bfa).v == 1011)
            return true;
        return false;
    }

    private final boolean a(int i, int i_30_, int i_31_) {
        if (i_30_ < 74)
            f = 63;
        e++;
        if (!b(false))
            return false;
        if (i < 0 || i_31_ < 0 || i >= ((ds) L).c.length
                || ((ds) L).c[i] <= i_31_) {
            if (gea.o)
                throw new IllegalArgumentException(String.valueOf(i) + ","
                        + i_31_);
            return false;
        }
        return true;
    }

    final byte[] b(int i, int i_32_, int i_33_) {
        p++;
        int i_34_ = 16 % ((-54 - i_32_) / 48);
        return a(i, null, (byte) 116, i_33_);
    }

    final byte[] a(int i, int[] is, byte i_35_, int i_36_) {
        c++;
        if (!a(i_36_, (int) 91, i))
            return null;
        if (i_35_ <= 90)
            ((pl) this).y = 72;
        if (g[i_36_] == null || g[i_36_][i] == null) {
            boolean bool = a(i, is, i_36_, (byte) 84);
            if (!bool) {
                d(i_36_, 0);
                bool = a(i, is, i_36_, (byte) -128);
                if (!bool)
                    return null;
            }
        }
        byte[] is_37_ = wi.a(-7374, false, g[i_36_][i]);
        if (((pl) this).y == 1) {
            g[i_36_][i] = null;
            if (((ds) L).c[i_36_] == 1)
                g[i_36_] = null;
        } else if (((pl) this).y == 2)
            g[i_36_] = null;
        return is_37_;
    }

    private final boolean f(int i, int i_38_) {
        N++;
        if (!b(false))
            return false;
        if (i < (i_38_ ^ 0xffffffff) || ((ds) L).c.length <= i_38_
                || ((ds) L).c[i_38_] == 0) {
            if (!gea.o)
                return false;
            throw new IllegalArgumentException(Integer.toString(i_38_));
        }
        return true;
    }

    final boolean g(int i, int i_39_) {
        K++;
        if (!b(false))
            return false;
        if (i != 1912)
            e(-79, -112);
        if (((ds) L).c.length == 1)
            return a(i_39_, (byte) 98, 0);
        if (!f(-1, i_39_))
            return false;
        if (((ds) L).c[i_39_] == 1)
            return a(0, (byte) 67, i_39_);
        throw new RuntimeException();
    }

    final boolean a(int i, String string) {
        n++;
        int i_40_ = a("", i - 31903);
        if ((i_40_ ^ 0xffffffff) != 0)
            return a(string, "", 2);
        if (i != 31850)
            return true;
        return a("", string, i ^ 0x7c68);
    }

    final boolean a(int i, byte i_41_, int i_42_) {
        if (i_41_ <= 61)
            E = null;
        D++;
        if (!a(i_42_, (int) 96, i))
            return false;
        if (g[i_42_] != null && g[i_42_][i] != null)
            return true;
        if (v[i_42_] != null)
            return true;
        d(i_42_, 0);
        if (v[i_42_] != null)
            return true;
        return false;
    }

    private final void h(int i, int i_43_) {
        H++;
        j.a(59, i_43_);
        if (i > -8)
            a((String) null, false);
    }

    private final boolean a(int i, int[] is, int i_44_, byte i_45_) {
        k++;
        if (!f(-1, i_44_))
            return false;
        int i_46_ = -49 % ((i_45_ + 13) / 43);
        if (v[i_44_] == null)
            return false;
        int i_47_ = ((ds) L).r[i_44_];
        int[] is_48_ = ((ds) L).d[i_44_];
        if (g[i_44_] == null)
            g[i_44_] = new Object[((ds) L).c[i_44_]];
        Object[] objects = g[i_44_];
        boolean bool = true;
        for (int i_49_ = 0; i_47_ > i_49_; i_49_++) {
            int i_50_;
            if (is_48_ != null)
                i_50_ = is_48_[i_49_];
            else
                i_50_ = i_49_;
            if (objects[i_50_] == null) {
                bool = false;
                break;
            }
        }
        if (bool)
            return true;
        byte[] is_51_;
        if (is != null
                && (is[0] != 0 || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
            is_51_ = wi.a(-7374, true, v[i_44_]);
            BytesParser var_es = new BytesParser(is_51_);
            var_es.decryptXTEA(((BytesParser) var_es).bytes.length, is, -957401312, 5);
        } else
            is_51_ = wi.a(-7374, false, v[i_44_]);
        byte[] is_52_ = ek.a(0, is_51_);
        if (w)
            v[i_44_] = null;
        if (i_47_ <= 1) {
            int i_53_;
            if (is_48_ != null)
                i_53_ = is_48_[0];
            else
                i_53_ = 0;
            if (((pl) this).y != 0)
                objects[i_53_] = is_52_;
            else
                objects[i_53_] = kg.a(-137, is_52_, false);
        } else if (((pl) this).y != 2) {
            int i_54_ = is_52_.length;
            int i_55_ = is_52_[--i_54_] & 0xff;
            i_54_ -= 4 * (i_55_ * i_47_);
            BytesParser var_es = new BytesParser(is_52_);
            int[] is_56_ = new int[i_47_];
            ((BytesParser) var_es).pos = i_54_;
            for (int i_57_ = 0; i_57_ < i_55_; i_57_++) {
                int i_58_ = 0;
                for (int i_59_ = 0; i_59_ < i_47_; i_59_++) {
                    i_58_ += var_es.readInt(60);
                    is_56_[i_59_] += i_58_;
                }
            }
            byte[][] is_60_ = new byte[i_47_][];
            for (int i_61_ = 0; i_47_ > i_61_; i_61_++) {
                is_60_[i_61_] = new byte[is_56_[i_61_]];
                is_56_[i_61_] = 0;
            }
            ((BytesParser) var_es).pos = i_54_;
            int i_62_ = 0;
            for (int i_63_ = 0; i_63_ < i_55_; i_63_++) {
                int i_64_ = 0;
                for (int i_65_ = 0; i_47_ > i_65_; i_65_++) {
                    i_64_ += var_es.readInt(74);
                    co.a(is_52_, i_62_, is_60_[i_65_], is_56_[i_65_], i_64_);
                    is_56_[i_65_] += i_64_;
                    i_62_ += i_64_;
                }
            }
            for (int i_66_ = 0; i_47_ > i_66_; i_66_++) {
                int i_67_;
                if (is_48_ != null)
                    i_67_ = is_48_[i_66_];
                else
                    i_67_ = i_66_;
                if (((pl) this).y != 0)
                    objects[i_67_] = is_60_[i_66_];
                else
                    objects[i_67_] = kg.a(-137, is_60_[i_66_], false);
            }
        } else {
            int i_68_ = is_52_.length;
            int i_69_ = is_52_[--i_68_] & 0xff;
            i_68_ -= i_47_ * (i_69_ * 4);
            BytesParser var_es = new BytesParser(is_52_);
            int i_70_ = 0;
            int i_71_ = 0;
            ((BytesParser) var_es).pos = i_68_;
            for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
                int i_73_ = 0;
                for (int i_74_ = 0; i_74_ < i_47_; i_74_++) {
                    i_73_ += var_es.readInt(123);
                    int i_75_;
                    if (is_48_ == null)
                        i_75_ = i_74_;
                    else
                        i_75_ = is_48_[i_74_];
                    if (i_75_ == i) {
                        i_70_ += i_73_;
                        i_71_ = i_75_;
                    }
                }
            }
            if (i_70_ == 0)
                return true;
            byte[] is_76_ = new byte[i_70_];
            i_70_ = 0;
            ((BytesParser) var_es).pos = i_68_;
            int i_77_ = 0;
            for (int i_78_ = 0; i_78_ < i_69_; i_78_++) {
                int i_79_ = 0;
                for (int i_80_ = 0; i_80_ < i_47_; i_80_++) {
                    i_79_ += var_es.readInt(98);
                    int i_81_;
                    if (is_48_ != null)
                        i_81_ = is_48_[i_80_];
                    else
                        i_81_ = i_80_;
                    if (i == i_81_) {
                        co.a(is_52_, i_77_, is_76_, i_70_, i_79_);
                        i_70_ += i_79_;
                    }
                    i_77_ += i_79_;
                }
            }
            objects[i_71_] = is_76_;
        }
        return true;
    }

    final boolean a(String string, boolean bool) {
        A++;
        if (!b(false))
            return false;
        string = string.toLowerCase();
        if (bool != true)
            f = -111;
        int i = ((ds) L).k.a(World.a(string), 105);
        if (i < 0)
            return false;
        return true;
    }

    static final void e(int i) {
        B++;
        int i_82_ = oca.inScreenPlayers;
        int[] is = vd.inScreenPlayerIDs;
        for (int i_83_ = i; i_82_ > i_83_; i_83_++) {
            Player var_qi = Class_fc.playersInScreen[is[i_83_]];
            if (var_qi != null)
                vj.a(var_qi, var_qi.getNPCDefinition(i - 1), 0);
        }
    }

    pl(ur var_ur, boolean bool, int i) {
        if (i < 0 || i > 2)
            throw new IllegalArgumentException
                    ("js5: Invalid value " + i
                            + " supplied for discardunpacked");
        j = var_ur;
        w = bool;
        ((pl) this).y = i;
    }
}
