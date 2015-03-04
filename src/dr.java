/* dr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dr {
    boolean[] a;
    int b = 99;
    int c;
    static int d;
    static jt e;
    static int f;
    int g;
    int h;
    int i;
    int[][] j;
    int k = -1;
    static int l;
    static int m;
    boolean n = false;
    static int o;
    int[] p;
    static int q;
    hl r;
    static int s;
    int t;
    boolean u;
    static int v;
    static int w;
    static int[] x;
    int y;
    boolean z;
    static int A;
    int[] B;
    boolean C;
    int D;
    private int[] E;
    static int F;

    static final int a(int[] is, int i, int i_0_, int i_1_, int i_2_,
                       boolean bool, int i_3_, wd var_wd, int i_4_, int i_5_,
                       boolean bool_6_, int i_7_, int[] is_8_, int i_9_,
                       int i_10_) {
        for (int i_11_ = 0; i_11_ < 128; i_11_++) {
            for (int i_12_ = 0; i_12_ < 128; i_12_++) {
                it.J[i_11_][i_12_] = 0;
                ps.b[i_11_][i_12_] = 99999999;
            }
        }
        if (bool_6_ != true)
            a(75, 39, (byte) 19);
        d++;
        boolean bool_13_;
        if (i_7_ == 1)
            bool_13_ = jfa.a(i, var_wd, i_3_, i_1_, i_10_, i_0_, i_5_, i_9_,
                    i_2_, (byte) -117, i_4_);
        else if (i_7_ != 2)
            bool_13_ = sl.a(-28, i_3_, i_9_, i_7_, i_2_, i_1_, i_0_, i_4_,
                    i_10_, i_5_, i, var_wd);
        else
            bool_13_ = nj.a(i_5_, i_1_, i, i_0_, i_3_, var_wd, i_4_, i_9_,
                    4095, i_2_, i_10_);
        int i_14_ = i_0_ - 64;
        int i_15_ = i_4_ - 64;
        int i_16_ = bd.l;
        int i_17_ = je.m;
        if (!bool_13_) {
            if (!bool)
                return -1;
            int i_18_ = 2147483647;
            int i_19_ = 2147483647;
            int i_20_ = 10;
            for (int i_21_ = i_5_ - i_20_; i_20_ + i_5_ >= i_21_; i_21_++) {
                for (int i_22_ = i_2_ - i_20_; i_22_ <= i_20_ + i_2_;
                     i_22_++) {
                    int i_23_ = i_21_ - i_14_;
                    int i_24_ = i_22_ - i_15_;
                    if (i_23_ >= 0 && i_24_ >= 0 && i_23_ < 128 && i_24_ < 128
                            && ps.b[i_23_][i_24_] < 100) {
                        int i_25_ = 0;
                        if (i_5_ <= i_21_) {
                            if (i_5_ - 1 + i_3_ < i_21_)
                                i_25_ = -i_3_ - i_5_ + (i_21_ + 1);
                        } else
                            i_25_ = i_5_ - i_21_;
                        int i_26_ = 0;
                        if (i_2_ > i_22_)
                            i_26_ = i_2_ - i_22_;
                        else if (i + (i_2_ - 1) < i_22_)
                            i_26_ = i_22_ - (i_2_ + i) + 1;
                        int i_27_ = i_26_ * i_26_ + i_25_ * i_25_;
                        if (i_18_ > i_27_
                                || i_27_ == i_18_ && ps.b[i_23_][i_24_] < i_19_) {
                            i_16_ = i_21_;
                            i_18_ = i_27_;
                            i_19_ = ps.b[i_23_][i_24_];
                            i_17_ = i_22_;
                        }
                    }
                }
            }
            if (i_18_ == 2147483647)
                return -1;
        }
        if (i_0_ == i_16_ && i_4_ == i_17_)
            return 0;
        int i_28_ = 0;
        Class_ad.l[i_28_] = i_16_;
        jn.I[i_28_++] = i_17_;
        int i_30_;
        int i_29_ = i_30_ = it.J[i_16_ - i_14_][i_17_ - i_15_];
        while (i_16_ != i_0_ || i_4_ != i_17_) {
            if (i_29_ != i_30_) {
                Class_ad.l[i_28_] = i_16_;
                i_30_ = i_29_;
                jn.I[i_28_++] = i_17_;
            }
            if ((0x1 & i_29_) == 0) {
                if ((0x4 & i_29_) != 0)
                    i_17_--;
            } else
                i_17_++;
            if ((0x2 & i_29_) == 0) {
                if ((0x8 & i_29_) != 0)
                    i_16_--;
            } else
                i_16_++;
            i_29_ = it.J[i_16_ - i_14_][i_17_ - i_15_];
        }
        int i_31_ = 0;
        while (i_28_-- > 0) {
            is_8_[i_31_] = Class_ad.l[i_28_];
            is[i_31_++] = jn.I[i_28_];
            if (is_8_.length <= i_31_)
                break;
        }
        return i_31_;
    }

    public static void a(byte i) {
        e = null;
        int i_32_ = 82 / ((18 - i) / 55);
        x = null;
    }

    final void a(int i, BytesParser var_es) {
        if (i <= 44)
            ((dr) this).D = 70;
        for (; ; ) {
            int i_33_ = var_es.readUnsignedByte(-9268);
            if (i_33_ == 0)
                break;
            a(256, var_es, i_33_);
        }
        q++;
    }

    final void a(int i) {
        s++;
        if ((((dr) this).k ^ 0xffffffff) == 0) {
            if (((dr) this).a == null)
                ((dr) this).k = 0;
            else
                ((dr) this).k = 2;
        }
        if (i == 2) {
            if (((dr) this).i == -1) {
                if (((dr) this).a == null)
                    ((dr) this).i = 0;
                else
                    ((dr) this).i = 2;
            }
        }
    }

    final int a(int i, int i_34_, boolean bool, int i_35_) {
        l++;
        int i_36_ = 0;
        int i_37_ = 0;
        int i_38_ = ((dr) this).p[i_35_];
        wa var_wa = null;
        wa var_wa_39_ = ((dr) this).r.b(i_38_ >> 16, -127);
        i_38_ &= 0xffff;
        if (var_wa_39_ == null)
            return i_36_;
        if ((((dr) this).z || vm.isTweening) && (i_34_ ^ 0xffffffff) != 0
                && ((dr) this).p.length > i_34_) {
            i_37_ = ((dr) this).p[i_34_];
            var_wa = ((dr) this).r.b(i_37_ >> 16, 57);
            i_37_ &= 0xffff;
        }
        if (i != 1024)
            a(-62, 72, (byte) -27);
        if (((dr) this).n)
            i_36_ |= 0x200;
        if (var_wa_39_.a(i_38_, (int) 0))
            i_36_ |= 0x80;
        if (var_wa_39_.a(i_38_, (byte) -36))
            i_36_ |= 0x100;
        if (var_wa_39_.a((byte) -101, i_38_))
            i_36_ |= 0x400;
        if (var_wa != null) {
            if (var_wa.a(i_37_, (int) 0))
                i_36_ |= 0x80;
            if (var_wa.a(i_37_, (byte) -92))
                i_36_ |= 0x100;
            if (var_wa.a((byte) -101, i_37_))
                i_36_ |= 0x400;
        }
        if (E != null && bool) {
            if (i_35_ < E.length) {
                int i_40_ = E[i_35_];
                if (i_40_ != 65535) {
                    wa var_wa_41_ = ((dr) this).r.b(i_40_ >> 16, 91);
                    i_40_ &= 0xffff;
                    if (var_wa_41_ != null) {
                        if (var_wa_41_.a(i_40_, (int) 0))
                            i_36_ |= 0x80;
                        if (var_wa_41_.a(i_40_, (byte) -118))
                            i_36_ |= 0x100;
                        if (var_wa_41_.a((byte) -101, i_40_))
                            i_36_ |= 0x400;
                    }
                }
            }
            if ((((dr) this).z || vm.isTweening) && i_34_ != -1 && i_34_ < E.length) {
                int i_42_ = E[i_34_];
                if (i_42_ != 65535) {
                    wa var_wa_43_ = ((dr) this).r.b(i_42_ >> 16, i ^ ~0x45b);
                    i_42_ &= 0xffff;
                    if (var_wa_43_ != null) {
                        if (var_wa_43_.a(i_42_, i ^ 0x400))
                            i_36_ |= 0x80;
                        if (var_wa_43_.a(i_42_, (byte) -6))
                            i_36_ |= 0x100;
                        if (var_wa_43_.a((byte) -101, i_42_))
                            i_36_ |= 0x400;
                    }
                }
            }
        }
        return 0x20 | i_36_;
    }

    private final void a(int i, BytesParser var_es, int i_44_) {
        if (i_44_ != 1) {
            if (i_44_ == 2)
                ((dr) this).y = var_es.readShort(i ^ 0x3237);
            else if (i_44_ == 3) {
                ((dr) this).a = new boolean[256];
                int i_45_ = var_es.readUnsignedByte(-9268);
                for (int i_46_ = 0; i_45_ > i_46_; i_46_++)
                    ((dr) this).a[var_es.readUnsignedByte(-9268)] = true;
            } else if (i_44_ == 5)
                ((dr) this).t = var_es.readUnsignedByte(-9268);
            else if (i_44_ == 6)
                ((dr) this).h = var_es.readShort(13111);
            else if (i_44_ != 7) {
                if (i_44_ != 8) {
                    if (i_44_ != 9) {
                        if (i_44_ != 10) {
                            if (i_44_ == 11)
                                ((dr) this).g = var_es.readUnsignedByte(i - 9524);
                            else if (i_44_ == 12) {
                                int i_47_ = var_es.readUnsignedByte(-9268);
                                E = new int[i_47_];
                                for (int i_48_ = 0; i_47_ > i_48_; i_48_++)
                                    E[i_48_] = var_es.readShort(13111);
                                for (int i_49_ = 0; i_47_ > i_49_; i_49_++)
                                    E[i_49_]
                                            = (var_es.readShort(13111) << 16) + E[i_49_];
                            } else if (i_44_ != 13) {
                                if (i_44_ != 14) {
                                    if (i_44_ == 15)
                                        ((dr) this).z = true;
                                    else if (i_44_ == 16)
                                        ((dr) this).C = true;
                                    else if (i_44_ == 18)
                                        ((dr) this).u = true;
                                } else
                                    ((dr) this).n = true;
                            } else {
                                int i_50_ = var_es.readShort(i + 12855);
                                ((dr) this).j = new int[i_50_][];
                                for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
                                    int i_52_ = var_es.readUnsignedByte(-9268);
                                    if (i_52_ > 0) {
                                        ((dr) this).j[i_51_] = new int[i_52_];
                                        ((dr) this).j[i_51_][0] = var_es.readTribyte(-1);
                                        for (int i_53_ = 1; i_52_ > i_53_;
                                             i_53_++)
                                            ((dr) this).j[i_51_][i_53_]
                                                    = var_es.readShort(13111);
                                    }
                                }
                            }
                        } else
                            ((dr) this).k = var_es.readUnsignedByte(-9268);
                    } else
                        ((dr) this).i = var_es.readUnsignedByte(-9268);
                } else
                    ((dr) this).b = var_es.readUnsignedByte(-9268);
            } else
                ((dr) this).D = var_es.readShort(i + 12855);
        } else {
            int i_54_ = var_es.readShort(i + 12855);
            ((dr) this).B = new int[i_54_];
            for (int i_55_ = 0; i_54_ > i_55_; i_55_++)
                ((dr) this).B[i_55_] = var_es.readShort(13111);
            ((dr) this).p = new int[i_54_];
            for (int i_56_ = 0; i_56_ < i_54_; i_56_++)
                ((dr) this).p[i_56_] = var_es.readShort(13111);
            for (int i_57_ = 0; i_54_ > i_57_; i_57_++)
                ((dr) this).p[i_57_]
                        = (var_es.readShort(13111) << 16) + ((dr) this).p[i_57_];
        }
        if (i != 256)
            a(82, -23, (byte) 49);
        w++;
    }

    final da a(int i, int i_58_, byte i_59_, int i_60_, int i_61_, da var_da) {
        F++;
        int i_62_ = ((dr) this).B[i];
        int i_63_ = ((dr) this).p[i];
        wa var_wa = ((dr) this).r.b(i_63_ >> 16, -95);
        i_63_ &= 0xffff;
        if (var_wa == null)
            return var_da.a((byte) 1, i_58_, true);
        wa var_wa_64_ = null;
        if (i_59_ <= 91)
            return null;
        if ((((dr) this).z || vm.isTweening) && i_61_ != -1
                && i_61_ < ((dr) this).p.length) {
            i_61_ = ((dr) this).p[i_61_];
            var_wa_64_ = ((dr) this).r.b(i_61_ >> 16, -123);
            i_61_ &= 0xffff;
        }
        wa var_wa_65_ = null;
        wa var_wa_66_ = null;
        int i_67_ = 0;
        int i_68_ = 0;
        if (E != null) {
            if (E.length > i) {
                i_67_ = E[i];
                if (i_67_ != 65535) {
                    var_wa_65_ = ((dr) this).r.b(i_67_ >> 16, 84);
                    i_67_ &= 0xffff;
                }
            }
            if ((((dr) this).z || vm.isTweening) && i_61_ != -1 && i_61_ < E.length) {
                i_68_ = E[i_61_];
                if (i_68_ != 65535) {
                    var_wa_66_ = ((dr) this).r.b(i_68_ >> 16, 58);
                    i_68_ &= 0xffff;
                }
            }
        }
        if (((dr) this).n)
            i_58_ |= 0x200;
        if (var_wa.a(i_63_, (int) 0))
            i_58_ |= 0x80;
        if (var_wa.a(i_63_, (byte) -85))
            i_58_ |= 0x100;
        if (var_wa.a((byte) -101, i_63_))
            i_58_ |= 0x400;
        if (var_wa_65_ != null) {
            if (var_wa_65_.a(i_67_, (int) 0))
                i_58_ |= 0x80;
            if (var_wa_65_.a(i_67_, (byte) -25))
                i_58_ |= 0x100;
            if (var_wa_65_.a((byte) -101, i_67_))
                i_58_ |= 0x400;
        }
        if (var_wa_64_ != null) {
            if (var_wa_64_.a(i_61_, (int) 0))
                i_58_ |= 0x80;
            if (var_wa_64_.a(i_61_, (byte) -79))
                i_58_ |= 0x100;
            if (var_wa_64_.a((byte) -101, i_61_))
                i_58_ |= 0x400;
        }
        if (var_wa_66_ != null) {
            if (var_wa_66_.a(i_68_, (int) 0))
                i_58_ |= 0x80;
            if (var_wa_66_.a(i_68_, (byte) -87))
                i_58_ |= 0x100;
            if (var_wa_66_.a((byte) -101, i_68_))
                i_58_ |= 0x400;
        }
        i_58_ |= 0x20;
        da var_da_69_ = var_da.a((byte) 1, i_58_, true);
        var_da_69_.a(((dr) this).n, (byte) -11, var_wa, i_61_, i_63_,
                var_wa_64_, i_60_ - 1, 0, i_62_);
        if (var_wa_65_ != null)
            var_da_69_.a(((dr) this).n, (byte) -11, var_wa_65_, i_68_, i_67_,
                    var_wa_66_, i_60_ - 1, 0, i_62_);
        return var_da_69_;
    }

    static final boolean a(int i, int i_70_, byte i_71_) {
        o++;
        if (i_71_ <= 91)
            a(null, 38, 124, 85, 33, false, -38, null, 114, -97, true, 117,
                    null, -17, -74);
        if ((0x8000 & i) == 0)
            return false;
        return true;
    }

    final da a(byte i, da var_da, int i_72_, int i_73_, int i_74_, int i_75_,
               int i_76_, int i_77_) {
        m++;
        int i_78_ = ((dr) this).B[i_76_];
        i_76_ = ((dr) this).p[i_76_];
        wa var_wa = ((dr) this).r.b(i_76_ >> 16, i_73_ ^ 0x20);
        i_76_ &= 0xffff;
        if (var_wa == null)
            return var_da.a(i, i_72_, true);
        wa var_wa_79_ = null;
        if ((((dr) this).z || vm.isTweening) && i_77_ != -1
                && i_77_ < ((dr) this).p.length) {
            i_77_ = ((dr) this).p[i_77_];
            var_wa_79_ = ((dr) this).r.b(i_77_ >> 16, -101);
            i_77_ &= 0xffff;
        }
        if (((dr) this).n)
            i_72_ |= 0x200;
        if (var_wa.a(i_76_, i_73_ - 7))
            i_72_ |= 0x80;
        if (var_wa.a(i_76_, (byte) -65))
            i_72_ |= 0x100;
        if (var_wa.a((byte) -101, i_76_))
            i_72_ |= 0x400;
        if (var_wa_79_ != null) {
            if (var_wa_79_.a(i_77_, (int) 0))
                i_72_ |= 0x80;
            if (var_wa_79_.a(i_77_, (byte) -74))
                i_72_ |= 0x100;
            if (var_wa_79_.a((byte) -101, i_77_))
                i_72_ |= 0x400;
        }
        i_72_ |= 0x20;
        if (i_73_ != 7)
            ((dr) this).h = -88;
        da var_da_80_ = var_da.a(i, i_72_, true);
        var_da_80_.a(((dr) this).n, (byte) -11, var_wa, i_77_, i_76_,
                var_wa_79_, i_75_ - 1, i_74_, i_78_);
        return var_da_80_;
    }

    public dr() {
        ((dr) this).g = 2;
        ((dr) this).t = 5;
        ((dr) this).y = -1;
        ((dr) this).u = false;
        ((dr) this).h = -1;
        ((dr) this).z = false;
        ((dr) this).C = false;
        ((dr) this).i = -1;
        ((dr) this).D = -1;
    }
}
