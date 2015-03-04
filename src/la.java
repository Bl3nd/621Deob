/* la - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

abstract class la {
    static int a;
    static int b;
    static int c;
    private Class_r d;
    static int e;
    private sa f;
    static volatile boolean g = true;
    static int h;
    static int i;
    static int j;
    static int boldFont;
    static int l;
    static tda m;
    static int n;
    static int o;
    static int p;
    static boolean[] q = new boolean[100];
    static int r;
    static int s;
    static int t;
    static boolean w2Debug = false;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int A;

    private final void a(int i, f[] var_fs, int[] is, String string, int i_0_,
                         int[] is_1_, int[] is_2_, int i_3_) {
        x++;
        i -= ((sa) f).k;
        int i_4_ = -1;
        int i_5_ = -1;
        int i_6_ = i_0_;
        int i_7_ = string.length();
        for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
            char c = (char) (ou.a((byte) 99, string.charAt(i_8_)) & 0xff);
            if (c == 60)
                i_4_ = i_8_;
            else {
                if (c == 62 && i_4_ != -1) {
                    String string_9_ = string.substring(i_4_ + 1, i_8_);
                    i_4_ = -1;
                    if (!string_9_.equals("lt")) {
                        if (!string_9_.equals("gt")) {
                            if (!string_9_.equals("nbsp")) {
                                if (!string_9_.equals("shy")) {
                                    if (string_9_.equals("times"))
                                        c = '\u00d7';
                                    else if (!string_9_.equals("euro")) {
                                        if (!string_9_.equals("copy")) {
                                            if (string_9_.equals("reg"))
                                                c = '\u00ae';
                                            else {
                                                if (string_9_
                                                        .startsWith("img=")) {
                                                    try {
                                                        int i_10_;
                                                        if (is == null)
                                                            i_10_ = 0;
                                                        else
                                                            i_10_ = is[i_6_];
                                                        int i_11_;
                                                        if (is_1_ != null)
                                                            i_11_
                                                                    = is_1_[i_6_];
                                                        else
                                                            i_11_ = 0;
                                                        i_6_++;
                                                        int i_12_
                                                                = (Class_g.a
                                                                (i_0_ ^ 0x80,
                                                                        (string_9_
                                                                                .substring
                                                                                        (4))));
                                                        f var_f
                                                                = var_fs[i_12_];
                                                        int i_13_
                                                                = (is_2_ != null
                                                                ? is_2_[i_12_]
                                                                : var_f.ca());
                                                        var_f.V(i_10_ + i_3_,
                                                                (i + ((sa) f).k
                                                                        + (-i_13_
                                                                        + i_11_)),
                                                                1, 0, 1);
                                                        i_5_ = -1;
                                                        i_3_ += var_fs
                                                                [i_12_]
                                                                .A();
                                                    } catch (Exception exception) {
                            /* empty */
                                                    }
                                                } else
                                                    a(string_9_, 26470);
                                                continue;
                                            }
                                        } else
                                            c = '\u00a9';
                                    } else
                                        c = '\u20ac';
                                } else
                                    c = '\u00ad';
                            } else
                                c = '\u00a0';
                        } else
                            c = '>';
                    } else
                        c = '<';
                }
                if ((i_4_ ^ 0xffffffff) == 0) {
                    if (i_5_ != -1)
                        i_3_ += f.a(-125, c, i_5_);
                    int i_14_;
                    if (is != null)
                        i_14_ = is[i_6_];
                    else
                        i_14_ = 0;
                    int i_15_;
                    if (is_1_ == null)
                        i_15_ = 0;
                    else
                        i_15_ = is_1_[i_6_];
                    if (c == 32) {
                        if (id.g > 0) {
                            qh.k += id.g;
                            i_3_ += qh.k >> 8;
                            qh.k &= 0xff;
                        }
                    } else {
                        if ((~0xffffff & ul.r) != 0)
                            OA(c, i_14_ + 1 + i_3_, i_15_ + 1 + i, ul.r, true);
                        OA(c, i_14_ + i_3_, i_15_ + i, to.g, false);
                    }
                    i_6_++;
                    int i_16_ = f.a(c, (byte) 115);
                    if (cga.s != -1)
                        d.b(i + (int) ((double) ((sa) f).k * 0.7), (byte) 11,
                                i_3_, i_16_, cga.s);
                    if (ui.h != -1)
                        d.b(i + ((sa) f).k, (byte) 11, i_3_, i_16_, ui.h);
                    i_3_ += i_16_;
                    i_5_ = c;
                }
            }
        }
    }

    final int a(int i, int i_17_, ua var_ua, int i_18_, String string,
                int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
                f[] var_fs, int[] is, int i_24_, int i_25_, int i_26_,
                int i_27_) {
        o++;
        if (i_21_ > -30)
            return -53;
        return a(i, var_ua, string, i_26_, i_19_, true, is, i_24_, i_17_,
                i_27_, i_18_, var_fs, i_25_, 0, i_22_, i_23_, i_20_);
    }

    private final void a(String string, int i) {
        if (i != 26470)
            m = null;
        v++;
        try {
            if (!string.startsWith("col=")) {
                if (string.equals("/col"))
                    to.g = ~0xffffff & to.g | 0xffffff & fw.Ib;
            } else
                to.g = (~0xffffff & to.g
                        | jo.a(-4096, string.substring(4), 16) & 0xffffff);
            if (string.startsWith("argb="))
                to.g = jo.a(-4096, string.substring(5), 16);
            else if (string.equals("/argb"))
                to.g = fw.Ib;
            else if (string.startsWith("str="))
                cga.s = to.g & ~0xffffff | jo.a(i - 30566, string.substring(4),
                        16);
            else if (!string.equals("str")) {
                if (string.equals("/str"))
                    cga.s = -1;
                else if (string.startsWith("u="))
                    ui.h = ~0xffffff & to.g | jo.a(i - 30566,
                            string.substring(2), 16);
                else if (!string.equals("u")) {
                    if (!string.equals("/u")) {
                        if (!string.equalsIgnoreCase("shad=-1")) {
                            if (string.startsWith("shad="))
                                ul.r
                                        = (to.g & ~0xffffff
                                        | jo.a(-4096, string.substring(5), 16));
                            else if (string.equals("shad"))
                                ul.r = ~0xffffff & to.g;
                            else if (!string.equals("/shad")) {
                                if (string.equals("br"))
                                    a(fw.Ib, i - 24786, wca.d);
                            } else
                                ul.r = wca.d;
                        } else
                            ul.r = 0;
                    } else
                        ui.h = -1;
                } else
                    ui.h = to.g & ~0xffffff;
            } else
                cga.s = to.g & ~0xffffff | 0x800000;
        } catch (Exception exception) {
	    /* empty */
        }
    }

    static long a(long l, long l_28_) {
        return l ^ l_28_;
    }

    private final void a(int i, int i_29_, int i_30_) {
        r++;
        qh.k = 0;
        ui.h = -1;
        to.g = fw.Ib = i;
        if (i_29_ == 1684) {
            if (i_30_ == -1)
                i_30_ = 0;
            cga.s = -1;
            id.g = 0;
            ul.r = wca.d = i_30_;
        }
    }

    static final void logout(byte i, boolean bool) {
        if (ce.y != null) {
            ce.y.d(0);
            ce.y = null;
        }
        y++;
        hk.loginStage = 0;
        um.resetCache(0);
        li.a();
        for (int i_31_ = 0; i_31_ < 4; i_31_++)
            su.a[i_31_].a(2097152);
        lba.b(111, false);
        System.gc();
        mg.b(-88, 2);
        Class_jc.ib = false;
        ws.G = -1;
        ke.a(2, true);
        Class_kf.y = 0;
        int i_32_ = 109 / ((-54 - i) / 33);
        bfa.thisPlayersRegionX = 0;
        rq.H = vn.J = 0;
        BytesParser.thisPlayersRegionY = 0;
        wj.q = 0;
        for (int i_33_ = 0; i_33_ < Class_fb.j.length; i_33_++)
            Class_fb.j[i_33_] = null;
        gf.c(1048576);
        for (int i_34_ = 0; i_34_ < 2048; i_34_++)
            Class_fc.playersInScreen[i_34_] = null;
        ps.npcCount = 0;
        uo.a.a(true);
        ObjectDef.Ib = 0;
        jt.a.a(true);
        FileOnDisk.c();
        qs.a = 0;
        cp.e.a(10542);
        ns.c((byte) -58);
        rca.c(6870);
        bg.a = null;
        pga.a = 0L;
        if (!bool) {
            ei.a(3, -116);
            try {
                rp.a(true, "loggedout", vj.applet);
            } catch (Throwable throwable) {
		/* empty */
            }
        } else
            ei.a(12, -120);
    }

    abstract void OA(char c, int i, int i_35_, int i_36_, boolean bool);

    final int a(f[] var_fs, int i, int i_37_, int i_38_, int i_39_,
                Random random, String string, int i_40_, int[] is, int i_41_,
                int i_42_, int[] is_43_, int i_44_, int i_45_, int i_46_) {
        t++;
        if (string == null)
            return 0;
        if (i_40_ > -9)
            a(73, -32, 20);
        random.setSeed((long) i_45_);
        int i_47_ = (0x1f & random.nextInt()) + 192;
        a(0xffffff & i_44_ | i_47_ << 24, 1684,
                i_47_ << 24 | i_38_ & 0xffffff);
        int i_48_ = string.length();
        int[] is_49_ = new int[i_48_];
        int i_50_ = 0;
        for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
            is_49_[i_51_] = i_50_;
            if ((random.nextInt() & 0x3) == 0)
                i_50_++;
        }
        int i_52_ = i_41_;
        int i_53_ = i_37_ + ((sa) f).b;
        if (i_42_ != 1) {
            if (i_42_ == 2)
                i_53_ = i_37_ + i - ((sa) f).n;
        } else
            i_53_ += (i - (((sa) f).b + ((sa) f).n)) / 2;
        int i_54_ = -1;
        if (i_46_ == 1) {
            i_54_ = i_50_ + f.a((byte) 99, string);
            i_52_ += (i_39_ - i_54_) / 2;
        } else if (i_46_ == 2) {
            i_54_ = f.a((byte) 99, string) + i_50_;
            i_52_ += i_39_ - i_54_;
        }
        a(i_53_, var_fs, is_49_, string, 0, null, is_43_, i_52_);
        if (is != null) {
            if ((i_54_ ^ 0xffffffff) == 0)
                i_54_ = f.a((byte) 99, string) + i_50_;
            is[3] = ((sa) f).b + ((sa) f).n;
            is[2] = i_54_;
            is[1] = i_53_ - ((sa) f).b;
            is[0] = i_52_;
        }
        return i_50_;
    }

    final void a(int i, int i_55_, int i_56_, String string, int i_57_,
                 int i_58_, byte i_59_) {
        w++;
        if (string != null) {
            a(i_56_, 1684, i_55_);
            int i_60_ = string.length();
            int[] is = new int[i_60_];
            int[] is_61_ = new int[i_60_];
            int i_62_ = 0;
            int i_63_ = 19 % ((-56 - i_59_) / 48);
            for (/**/; i_60_ > i_62_; i_62_++) {
                is[i_62_] = (int) (5.0 * Math.sin((double) i_58_ / 5.0
                        + (double) i_62_ / 5.0));
                is_61_[i_62_] = (int) (Math.sin((double) i_62_ / 3.0
                        + (double) i_58_ / 5.0)
                        * 5.0);
            }
            a(i, null, is, string, 0, is_61_, null,
                    i_57_ - f.a((byte) 99, string) / 2);
        }
    }

    final void a(int i, boolean bool, int i_64_, String string, int i_65_,
                 int i_66_) {
        A++;
        if (string != null) {
            a(i, 1684, i_65_);
            if (bool == true)
                a(string, 0, 16739, null, null, null, i_64_, 0, i_66_);
        }
    }

    final void a(int i, int i_67_, f[] var_fs, int i_68_, int[] is, int i_69_,
                 int i_70_, String string) {
        if (i != -4611)
            a(49, 64, null, 121, null, 45, -71, 64, -85, 74, null, null, -18,
                    115, 47, -94);
        l++;
        if (string != null) {
            a(i_69_, i + 6295, i_67_);
            a(string, 0, 16739, var_fs, is, null, i_70_, 0, i_68_);
        }
    }

    final int a(int[] is, Random random, f[] var_fs, int i, int i_71_,
                int i_72_, int i_73_, String string, boolean bool, int i_74_) {
        j++;
        if (string == null)
            return 0;
        random.setSeed((long) i_74_);
        int i_75_ = (0x1f & random.nextInt()) + 192;
        a(i_75_ << 24 | 0xffffff & i_71_, 1684,
                i_75_ << 24 | i_73_ & 0xffffff);
        int i_76_ = string.length();
        if (bool != false)
            q = null;
        int[] is_77_ = new int[i_76_];
        int i_78_ = 0;
        for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
            is_77_[i_79_] = i_78_;
            if ((random.nextInt() & 0x3) == 0)
                i_78_++;
        }
        a(i_72_, var_fs, is_77_, string, 0, null, is, i);
        return i_78_;
    }

    final void a(byte i, int i_80_, String string, int i_81_, int i_82_,
                 int i_83_, int i_84_, int i_85_) {
        a++;
        if (string != null) {
            if (i <= 34)
                a(null, -122, 59, null, null, null, -28, -76, 45);
            a(i_83_, 1684, i_82_);
            double d = 7.0 - (double) i_84_ / 8.0;
            if (d < 0.0)
                d = 0.0;
            int i_86_ = string.length();
            int[] is = new int[i_86_];
            for (int i_87_ = 0; i_87_ < i_86_; i_87_++)
                is[i_87_]
                        = (int) (Math.sin((double) i_87_ / 1.5 + (double) i_80_)
                        * d);
            a(i_81_, null, null, string, 0, is, null,
                    i_85_ - f.a((byte) 99, string) / 2);
        }
    }

    private final void a(String string, int i, int i_88_, f[] var_fs, int[] is,
                         ua var_ua, int i_89_, int i_90_, int i_91_) {
        la.i++;
        i_91_ -= ((sa) f).k;
        int i_92_ = -1;
        int i_93_ = -1;
        int i_94_ = string.length();
        int i_95_ = 0;
        if (i_88_ != 16739)
            d = null;
        for (/**/; i_95_ < i_94_; i_95_++) {
            char c = (char) (ou.a((byte) 99, string.charAt(i_95_)) & 0xff);
            if (c == 60)
                i_92_ = i_95_;
            else {
                if (c == 62 && (i_92_ ^ 0xffffffff) != 0) {
                    String string_96_ = string.substring(i_92_ + 1, i_95_);
                    i_92_ = -1;
                    if (!string_96_.equals("lt")) {
                        if (!string_96_.equals("gt")) {
                            if (!string_96_.equals("nbsp")) {
                                if (string_96_.equals("shy"))
                                    c = '\u00ad';
                                else if (!string_96_.equals("times")) {
                                    if (string_96_.equals("euro"))
                                        c = '\u20ac';
                                    else if (string_96_.equals("copy"))
                                        c = '\u00a9';
                                    else if (string_96_.equals("reg"))
                                        c = '\u00ae';
                                    else {
                                        if (string_96_.startsWith("img=")) {
                                            try {
                                                int i_97_
                                                        = (Class_g.a
                                                        (i_88_ ^ 0x41e3,
                                                                string_96_
                                                                        .substring(4)));
                                                f var_f = var_fs[i_97_];
                                                int i_98_
                                                        = (is != null ? is[i_97_]
                                                        : var_f.ca());
                                                if ((~0xffffff & to.g)
                                                        == -16777216)
                                                    var_f.V(i_89_,
                                                            (((sa) f).k + i_91_
                                                                    - i_98_),
                                                            1, 0, 1);
                                                else
                                                    var_f.V(i_89_,
                                                            (i_91_ + ((sa) f).k
                                                                    - i_98_),
                                                            0,
                                                            (to.g & ~0xffffff
                                                                    | 0xffffff),
                                                            1);
                                                i_89_ += var_fs[i_97_].A();
                                                i_93_ = -1;
                                            } catch (Exception exception) {
						/* empty */
                                            }
                                        } else
                                            a(string_96_, i_88_ ^ 0x2605);
                                        continue;
                                    }
                                } else
                                    c = '\u00d7';
                            } else
                                c = '\u00a0';
                        } else
                            c = '>';
                    } else
                        c = '<';
                }
                if ((i_92_ ^ 0xffffffff) == 0) {
                    if ((i_93_ ^ 0xffffffff) != 0)
                        i_89_ += f.a(-54, c, i_93_);
                    if (c != 32) {
                        if (var_ua == null) {
                            if ((~0xffffff & ul.r) != 0)
                                OA(c, i_89_ + 1, i_91_ + 1, ul.r, true);
                            OA(c, i_89_, i_91_, to.g, false);
                        } else {
                            if ((ul.r & ~0xffffff) != 0)
                                a(c, i_89_ + 1, i_91_ + 1, ul.r, true, var_ua,
                                        i, i_90_);
                            a(c, i_89_, i_91_, to.g, false, var_ua, i, i_90_);
                        }
                    } else if (id.g > 0) {
                        qh.k += id.g;
                        i_89_ += qh.k >> 8;
                        qh.k &= 0xff;
                    }
                    int i_99_ = f.a(c, (byte) 120);
                    if (cga.s != -1)
                        d.b((int) (0.7 * (double) ((sa) f).k) + i_91_,
                                (byte) 11, i_89_, i_99_, cga.s);
                    if ((ui.h ^ 0xffffffff) != 0)
                        d.b(i_91_ + ((sa) f).k + 1, (byte) 11, i_89_, i_99_,
                                ui.h);
                    i_89_ += i_99_;
                    i_93_ = c;
                }
            }
        }
    }

    final int a(int i, ua var_ua, String string, int i_100_, int i_101_,
                boolean bool, int[] is, int i_102_, int i_103_, int i_104_,
                int i_105_, f[] var_fs, int i_106_, int i_107_, int i_108_,
                int i_109_, int i_110_) {
        b++;
        if (string == null)
            return 0;
        a(i_101_, 1684, i);
        if (i_103_ == 0)
            i_103_ = ((sa) f).k;
        int[] is_111_;
        if (((sa) f).n + ((sa) f).b + i_103_ > i_109_
                && i_109_ < i_103_ + i_103_)
            is_111_ = null;
        else
            is_111_ = new int[]{i_105_};
        if ((i_107_ ^ 0xffffffff) == 0) {
            i_107_ = i_109_ / i_103_;
            if (i_107_ <= 0)
                i_107_ = 1;
        }
        int i_112_ = f.a(string, ffa.L, -1, is_111_, var_fs);
        if (i_107_ > 0 && i_107_ <= i_112_) {
            i_112_ = i_107_;
            ffa.L[i_107_ - 1]
                    = f.a((byte) -77, var_fs, ffa.L[i_107_ - 1], i_105_);
        }
        if (bool != true)
            a(92, 67, null, 113, null, -46, 119, null);
        if (i_108_ == 3 && i_112_ == 1)
            i_108_ = 1;
        int i_113_;
        if (i_108_ == 0)
            i_113_ = ((sa) f).b + i_100_;
        else if (i_108_ == 1)
            i_113_ = (-((sa) f).b - i_103_ * (i_112_ - 1) + i_109_
                    - ((sa) f).n) / 2 + (i_100_ + ((sa) f).b);
        else if (i_108_ != 2) {
            int i_114_
                    = ((-((sa) f).n - i_103_ * (i_112_ - 1) + i_109_ - ((sa) f).b)
                    / (i_112_ + 1));
            if (i_114_ < 0)
                i_114_ = 0;
            i_103_ += i_114_;
            i_113_ = i_114_ + i_100_ + ((sa) f).b;
        } else
            i_113_ = i_100_ + i_109_ - (((sa) f).n + (i_112_ - 1) * i_103_);
        for (int i_115_ = 0; i_115_ < i_112_; i_115_++) {
            if (i_110_ == 0)
                a(ffa.L[i_115_], i_102_, 16739, var_fs, is, var_ua, i_104_,
                        i_106_, i_113_);
            else if (i_110_ != 1) {
                if (i_110_ != 2) {
                    if (i_115_ != i_112_ - 1) {
                        a(i_105_, (byte) 122, ffa.L[i_115_]);
                        a(ffa.L[i_115_], i_102_, 16739, var_fs, is, var_ua,
                                i_104_, i_106_, i_113_);
                        id.g = 0;
                    } else
                        a(ffa.L[i_115_], i_102_, 16739, var_fs, is, var_ua,
                                i_104_, i_106_, i_113_);
                } else
                    a(ffa.L[i_115_], i_102_, 16739, var_fs, is, var_ua,
                            i_104_ + i_105_ - f.a((byte) 99, ffa.L[i_115_]), i_106_,
                            i_113_);
            } else
                a(ffa.L[i_115_], i_102_, 16739, var_fs, is, var_ua,
                        (i_105_ - f.a((byte) 99, ffa.L[i_115_])) / 2 + i_104_,
                        i_106_, i_113_);
            i_113_ += i_103_;
        }
        return i_112_;
    }

    final void a(int i, int i_116_, String string, int i_117_, int i_118_,
                 int i_119_) {
        n++;
        if (i_119_ >= -49)
            boldFont = 11;
        if (string != null) {
            a(i_117_, 1684, i_118_);
            a(string, 0, 16739, null, null, null, i - f.a((byte) 99, string),
                    0, i_116_);
        }
    }

    final void a(int i, int i_120_, int i_121_, int i_122_, int i_123_,
                 String string) {
        h++;
        if (string != null) {
            a(i, i_120_ ^ ~0x619, i_122_);
            if (i_120_ == -142)
                a(string, 0, i_120_ ^ ~0x41ee, null, null, null,
                        i_121_ - f.a((byte) 99, string) / 2, 0, i_123_);
        }
    }

    static final iea a(int i, BytesParser var_es) {
        p++;
        ct var_ct = dh.b((byte) 87)[var_es.readUnsignedByte(-9268)];
        rc var_rc = dg.b((int) 63)[var_es.readUnsignedByte(-9268)];
        int i_124_ = var_es.readShort2(58);
        int i_125_ = var_es.readShort2(80);
        int i_126_ = var_es.readShort(13111);
        int i_127_ = var_es.readShort(13111);
        int i_128_ = var_es.readShort2(88);
        int i_129_ = 44 / ((-15 - i) / 55);
        int i_130_ = var_es.readInt(58);
        int i_131_ = var_es.readInt(77);
        return new iea(var_ct, var_rc, i_124_, i_125_, i_126_, i_127_, i_128_,
                i_130_, i_131_);
    }

    la(Class_r class_r, sa var_sa) {
        d = class_r;
        f = var_sa;
    }

    private final void a(int i, byte i_132_, String string) {
        z++;
        if (i_132_ != 122)
            w2Debug = false;
        int i_133_ = 0;
        boolean bool = false;
        for (int i_134_ = 0; i_134_ < string.length(); i_134_++) {
            char c = string.charAt(i_134_);
            if (c != '<') {
                if (c != '>') {
                    if (!bool && c == ' ')
                        i_133_++;
                } else
                    bool = false;
            } else
                bool = true;
        }
        if (i_133_ > 0)
            id.g = (i - f.a((byte) 99, string) << 8) / i_133_;
    }

    static final boolean a(int i, int i_135_, int i_136_, int i_137_,
                           int i_138_, boolean bool, int i_139_, int i_140_,
                           int i_141_) {
        c++;
        int i_142_ = ((Entity) up.thisPlayer).regionLocalX[0];
        int i_143_ = ((Entity) up.thisPlayer).regionLocalY[0];
        if (i_142_ < 0 || Class_hc.e <= i_142_ || i_143_ < 0 || bw.v <= i_143_)
            return false;
        if (i_139_ < 0 || Class_hc.e <= i_139_ || i_140_ < 0 || bw.v <= i_140_)
            return false;
        int i_144_ = dr.a(bn.c, i_137_, i_142_, i_135_, i_140_, bool, i_141_,
                su.a[((Animable) up.thisPlayer).height], i_143_, i_139_, true,
                up.thisPlayer.getNPCDefinition(i - 2), kq.S, i_136_, i_138_);
        if (i_144_ < 1)
            return false;
        bca.c = kq.S[i_144_ - 1];
        uaa.h = bn.c[i_144_ - i];
        po.d = false;
        ho.a(true);
        return true;
    }

    abstract void a(char c, int i, int i_145_, int i_146_, boolean bool,
                    ua var_ua, int i_147_, int i_148_);

    public static void a(int i) {
        m = null;
        if (i != 3)
            a(-22);
        q = null;
    }

    final void a(int i, int i_149_, int i_150_, int i_151_, int i_152_,
                 int i_153_, String string) {
        e++;
        if (string != null) {
            a(i_152_, 1684, i_150_);
            int i_154_ = string.length();
            if (i_153_ != 15242)
                a(-67, -7, 63, 72, 103, null);
            int[] is = new int[i_154_];
            for (int i_155_ = 0; i_155_ < i_154_; i_155_++)
                is[i_155_] = (int) (5.0 * Math.sin((double) i_155_ / 2.0
                        + (double) i_151_ / 5.0));
            a(i_149_, null, null, string, 0, is, null,
                    i - f.a((byte) 99, string) / 2);
        }
    }

    static {
        s = 0;
        m = new tda(2);
    }
}
