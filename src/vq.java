/* vq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.util.Random;

final class vq extends Class_ab {
    private int[] f = new int[512];
    static int g;
    static f[] h;
    static int i;
    static int j;
    static int k = 0;
    static pl l;
    static int[] m;
    static int n = 0;
    static int o;
    static int p;

    public static void b(int i) {
        h = null;
        m = null;
        l = null;
        int i_0_ = 72 % ((42 - i) / 61);
    }

    static final String[] a(int i, String string, char c) {
        p++;
        int i_1_ = rk.a((byte) 41, c, string);
        String[] strings = new String[i_1_ + 1];
        int i_2_ = 0;
        int i_3_ = 0;
        for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
            int i_5_;
            for (i_5_ = i_3_; c != string.charAt(i_5_); i_5_++) {
        /* empty */
            }
            strings[i_2_++] = string.substring(i_3_, i_5_);
            i_3_ = i_5_ + 1;
        }
        if (i > -72)
            l = null;
        strings[i_1_] = string.substring(i_3_);
        return strings;
    }

    static final ro[] a(byte i) {
        if (i != 58)
            n = -53;
        if (pda.v == null) {
            ro[] var_ros = Class_gb.a(nda.signlink, i ^ 0x4f);
            ro[] var_ros_6_ = new ro[var_ros.length];
            int i_7_ = 0;
            int i_8_ = cs.g.a(on.performance, (byte) 82);
            while_237_:
            for (int i_9_ = 0; var_ros.length > i_9_; i_9_++) {
                ro var_ro = var_ros[i_9_];
                if ((((ro) var_ro).f <= 0 || ((ro) var_ro).f >= 24)
                        && ((ro) var_ro).d >= 800 && ((ro) var_ro).a >= 600
                        && (i_8_ != 2
                        || ((ro) var_ro).d <= 800 && ((ro) var_ro).a <= 600)
                        && (i_8_ != 1 || (((ro) var_ro).d <= 1024
                        && ((ro) var_ro).a <= 768))) {
                    for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
                        ro var_ro_11_ = var_ros_6_[i_10_];
                        if (((ro) var_ro_11_).d == ((ro) var_ro).d
                                && ((ro) var_ro).a == ((ro) var_ro_11_).a) {
                            if (((ro) var_ro_11_).f < ((ro) var_ro).f)
                                var_ros_6_[i_10_] = var_ro;
                            continue while_237_;
                        }
                    }
                    var_ros_6_[i_7_] = var_ro;
                    i_7_++;
                }
            }
            pda.v = new ro[i_7_];
            co.a(var_ros_6_, 0, pda.v, 0, i_7_);
            int[] is = new int[pda.v.length];
            for (int i_12_ = 0; pda.v.length > i_12_; i_12_++) {
                ro var_ro = pda.v[i_12_];
                is[i_12_] = ((ro) var_ro).d * ((ro) var_ro).a;
            }
            fn.a(is, pda.v, 124);
        }
        o++;
        return pda.v;
    }

    static final void writeBytesWithSetOffset(BytesParser bytesParser, int offset) {
        j++;
        byte[] buf = new byte[24];
        if (dca.V != null) {
            try {
                dca.V.seek(13755, 0L);
                dca.V.a(false, buf);
                int i_13_;
                for (i_13_ = 0; i_13_ < 24; i_13_++) {
                    if (buf[i_13_] != 0)
                        break;
                }
                if (i_13_ >= 24)
                    throw new IOException();
            } catch (Exception exception) {
                for (int i_14_ = 0; i_14_ < 24; i_14_++)
                    buf[i_14_] = (byte) -1;
            }
        }
        bytesParser.writeBytes(65536, 24, offset, buf);
    }

    final void a(float f, int i, int i_15_, int i_16_, float f_17_, float[] fs,
                 int i_18_, int i_19_, float f_20_, int i_21_, float f_22_) {
        g++;
        int i_23_ = (int) (f_17_ * (float) i_19_ - 1.0F);
        i_23_ &= 0xff;
        int i_24_ = (int) (f * (float) i_15_ - 1.0F);
        i_24_ &= 0xff;
        int i_25_ = (int) (f_20_ * (float) i_21_ - 1.0F);
        i_25_ &= 0xff;
        float f_26_ = f_20_ * (float) i;
        int i_27_ = (int) f_26_;
        if (i_16_ == 7) {
            int i_28_ = i_27_ + 1;
            float f_29_ = (float) -i_27_ + f_26_;
            float f_30_ = 1.0F - f_29_;
            float f_31_ = gda.a(f_29_, (byte) 68);
            i_27_ &= i_25_;
            i_28_ &= i_25_;
            int i_32_ = this.f[i_27_];
            int i_33_ = this.f[i_28_];
            for (int i_34_ = 0; i_15_ > i_34_; i_34_++) {
                float f_35_ = f * (float) i_34_;
                int i_36_ = (int) f_35_;
                int i_37_ = i_36_ + 1;
                float f_38_ = f_35_ - (float) i_36_;
                float f_39_ = -f_38_ + 1.0F;
                i_36_ &= i_24_;
                i_37_ &= i_24_;
                float f_40_ = gda.a(f_38_, (byte) 40);
                int i_41_ = this.f[i_36_ + i_32_];
                int i_42_ = this.f[i_37_ + i_32_];
                int i_43_ = this.f[i_33_ + i_36_];
                int i_44_ = this.f[i_37_ + i_33_];
                for (int i_45_ = 0; i_45_ < i_19_; i_45_++) {
                    float f_46_ = (float) i_45_ * f_17_;
                    int i_47_ = (int) f_46_;
                    int i_48_ = i_47_ + 1;
                    float f_49_ = f_46_ - (float) i_47_;
                    float f_50_ = 1.0F - f_49_;
                    i_47_ &= i_23_;
                    float f_51_ = gda.a(f_49_, (byte) -125);
                    i_48_ &= i_23_;
                    fs[i_18_++]
                            = (f_22_
                            * (ew.a
                            (f_31_,
                                    ew.a(f_40_,
                                            ew.a(f_51_,
                                                    hq.a(f_39_, -40,
                                                            uca.a(7, this.f[i_47_ + i_41_]),
                                                            f_30_, f_50_),
                                                    mv.a(i_16_, (int) -91),
                                                    hq.a(f_39_, -125,
                                                            uca.a(this.f[i_41_ + i_48_], 7),
                                                            f_30_, f_49_)),
                                            -61,
                                            ew.a(f_51_,
                                                    hq.a(f_38_, 118,
                                                            uca.a(this.f[i_42_ + i_47_], 7),
                                                            f_30_, f_50_),
                                                    -89,
                                                    hq.a(f_38_, 110,
                                                            uca.a(this.f[i_48_ + i_42_], 7),
                                                            f_30_, f_49_))),
                                    i_16_ - 129,
                                    ew.a(f_40_,
                                            ew.a(f_51_,
                                                    hq.a(f_39_, 116,
                                                            uca.a(7, this.f[i_47_ + i_43_]),
                                                            f_29_, f_50_),
                                                    -99,
                                                    hq.a(f_39_, -39,
                                                            uca.a(this.f[i_43_ + i_48_], 7),
                                                            f_29_, f_49_)),
                                            -108,
                                            ew.a(f_51_,
                                                    hq.a(f_38_, 118,
                                                            uca.a(7, this.f[i_44_ + i_47_]),
                                                            f_29_, f_50_),
                                                    i_16_ - 85,
                                                    hq.a(f_38_, -32,
                                                            uca.a(7, this.f[i_48_ + i_44_]),
                                                            f_29_, f_49_))))));
                }
            }
        }
    }

    static final boolean a(boolean bool, int i, int i_52_) {
        vq.i++;
        if (!gea.n)
            return false;
        int i_53_ = i >> 16;
        int i_54_ = 0xffff & i;
        if (aa.o[i_53_] == null || aa.o[i_53_][i_54_] == null)
            return false;
        if (bool != false)
            return false;
        Interface var_kp = aa.o[i_53_][i_54_];
        if ((i_52_ ^ 0xffffffff) == 0 && ((Interface) var_kp).type == 0) {
            for (bfa var_bfa = (bfa) oba.I.a((int) 96); var_bfa != null;
                 var_bfa = (bfa) oba.I.b((byte) 23)) {
                if (((bfa) var_bfa).v == 45 || ((bfa) var_bfa).v == 1011
                        || ((bfa) var_bfa).v == 57 || ((bfa) var_bfa).v == 60
                        || ((bfa) var_bfa).v == 50) {
                    for (Interface var_kp_55_ = efa.a(-1018745488, ((bfa) var_bfa).q);
                         var_kp_55_ != null;
                         var_kp_55_ = bca.a((byte) 125, var_kp_55_)) {
                        if (((Interface) var_kp_55_).interfaceID == ((Interface) var_kp).interfaceID)
                            return true;
                    }
                }
            }
        } else {
            for (bfa var_bfa = (bfa) oba.I.a((int) 103); var_bfa != null;
                 var_bfa = (bfa) oba.I.b((byte) 88)) {
                if (((bfa) var_bfa).r == i_52_
                        && ((bfa) var_bfa).q == ((Interface) var_kp).interfaceID
                        && (((bfa) var_bfa).v == 45 || ((bfa) var_bfa).v == 1011
                        || ((bfa) var_bfa).v == 57 || ((bfa) var_bfa).v == 60
                        || ((bfa) var_bfa).v == 50))
                    return true;
            }
        }
        return false;
    }

    vq(int i) {
        Random random = new Random((long) i);
        for (int i_56_ = 0; i_56_ < 256; i_56_++)
            f[i_56_] = f[i_56_ + 256] = i_56_;
        for (int i_57_ = 0; i_57_ < 256; i_57_++) {
            int i_58_ = 0xff & random.nextInt();
            int i_59_ = f[i_58_];
            f[i_58_] = f[i_58_ + 256] = f[i_57_];
            f[i_57_] = f[i_57_ + 256] = i_59_;
        }
    }
}
