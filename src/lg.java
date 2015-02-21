/* lg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.hardware_info.HardwareInfo;

import jagex3.jagmisc.jagmisc;

final class lg extends Node {
    static GameOutPacket k = new GameOutPacket(80, 5);
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    static Class_r r;
    static int s;
    private boolean t;
    private int u;
    static int v;
    private boolean w;
    private int x;
    private int y;
    private int z;
    static float A;
    static int B;

    public static void a(int i) {
        if (i != -20968)
            b(8);
        r = null;
        k = null;
    }

    final void a(BytesParser bytesParser, int i) {
        s++;
        bytesParser.writeByte((int) 3, (byte) -109);
        bytesParser.writeByte(m, (byte) -119);
        bytesParser.writeByte((int) (!t ? 0 : 1), (byte) -113);
        bytesParser.writeByte(q, (byte) -110);
        bytesParser.writeByte(z, (byte) -128);
        bytesParser.writeByte(l, (byte) -126);
        bytesParser.writeByte(p, (byte) -122);
        bytesParser.writeByte(x, (byte) -128);
        bytesParser.writeByte((int) (w ? 1 : 0), (byte) -113);
        bytesParser.writeShort(u, i ^ ~0x349d);
        if (i != -1)
            b(116);
        bytesParser.writeByte(y, (byte) -126);
        bytesParser.writeTribyte(o, (byte) -22);
        bytesParser.writeInt(n, i ^ 0x78);
    }

    static final void b(int i) {
        B++;
        if (i == -4) {
            if (r != null) {
                oea.fb.b(i + 132);
                li.a();
                Entity.c((byte) -79);
                ir.b(17381);
                bfa.a((byte) -103);
                ss.a(true);
                if (Connection.tw != null)
                    Connection.tw.a((byte) 112);
                ci.a(-37);
                um.a(i ^ ~0x3);
                of.a((int) -67);
                lq.i((byte) 23);
                lba.b(98, false);
                for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
                    Player var_qi = Class_fc.playersInScreen[i_0_];
                    if (var_qi != null) {
                        for (int i_1_ = 0; i_1_ < ((Entity) var_qi).das.length;
                             i_1_++)
                            ((Entity) var_qi).das[i_1_] = null;
                    }
                }
                for (int i_2_ = 0; ObjectDef.Ib > i_2_; i_2_++) {
                    NPC class_ac = ((NPCNode) ii.npcNodes[i_2_]).npc;
                    if (class_ac != null) {
                        for (int i_3_ = 0; ((Entity) class_ac).das.length > i_3_;
                             i_3_++)
                            ((Entity) class_ac).das[i_3_] = null;
                    }
                }
                br.n = null;
                tg.G = null;
                r.h(1);
                r = null;
            }
        }
    }

    static final int a(int i, int i_4_) {
        v++;
        double d = (double) ((i_4_ & 0xff960c) >> 16) / 256.0;
        double d_5_ = (double) ((i_4_ & 0xffc7) >> 8) / 256.0;
        double d_6_ = (double) (0xff & i_4_) / 256.0;
        double d_7_ = d;
        if (d_7_ > d_5_)
            d_7_ = d_5_;
        if (d_6_ < d_7_)
            d_7_ = d_6_;
        double d_8_ = d;
        if (d_5_ > d_8_)
            d_8_ = d_5_;
        if (d_6_ > d_8_)
            d_8_ = d_6_;
        double d_9_ = 0.0;
        double d_10_ = 0.0;
        double d_11_ = (d_7_ + d_8_) / 2.0;
        if (d_7_ != d_8_) {
            if (d_11_ < 0.5)
                d_10_ = (d_8_ - d_7_) / (d_7_ + d_8_);
            if (d_8_ != d) {
                if (d_8_ == d_5_)
                    d_9_ = (d_6_ - d) / (d_8_ - d_7_) + 2.0;
                else if (d_8_ == d_6_)
                    d_9_ = (d - d_5_) / (d_8_ - d_7_) + 4.0;
            } else
                d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
            if (d_11_ >= 0.5)
                d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
        }
        d_9_ /= 6.0;
        int i_12_ = (int) (256.0 * d_9_);
        int i_13_ = (int) (256.0 * d_10_);
        if (i_13_ < 0)
            i_13_ = 0;
        else if (i_13_ > 255)
            i_13_ = 255;
        int i_14_ = (int) (256.0 * d_11_);
        if (i_14_ >= 0) {
            if (i_14_ > 255)
                i_14_ = 255;
        } else
            i_14_ = 0;
        if (i_14_ > 243)
            i_13_ >>= 4;
        else if (i_14_ <= 217) {
            if (i_14_ <= 192) {
                if (i_14_ > 179)
                    i_13_ >>= 1;
            } else
                i_13_ >>= 2;
        } else
            i_13_ >>= 3;
        if (i <= 47)
            r = null;
        return (i_14_ >> 1) + ((i_12_ & 0xff) >> 2 << 10) + (i_13_ >> 5 << 7);
    }

    lg(boolean bool, Signlink var_rj) {
        do {
            if (bool) {
                if (!Signlink.osNameLowerCase.startsWith("win")) {
                    if (Signlink.osNameLowerCase.startsWith("mac"))
                        m = 2;
                    else if (!Signlink.osNameLowerCase.startsWith("linux"))
                        m = 4;
                    else
                        m = 3;
                } else
                    m = 1;
                if (!Signlink.osArch.startsWith("amd64") && !Signlink.osArch.startsWith("x86_64"))
                    t = false;
                else
                    t = true;
                if (m == 1) {
                    if (Signlink.osVersion.indexOf("4.0") != -1)
                        q = 1;
                    else if (Signlink.osVersion.indexOf("4.1") != -1)
                        q = 2;
                    else if ((Signlink.osVersion.indexOf("4.9") ^ 0xffffffff) == 0) {
                        if (Signlink.osVersion.indexOf("5.0") != -1)
                            q = 4;
                        else if ((Signlink.osVersion.indexOf("5.1") ^ 0xffffffff) != 0)
                            q = 5;
                        else if ((Signlink.osVersion.indexOf("6.0") ^ 0xffffffff) == 0) {
                            if (Signlink.osVersion.indexOf("6.1") != -1)
                                q = 7;
                        } else
                            q = 6;
                    } else
                        q = 3;
                } else if (m == 2) {
                    if (Signlink.osVersion.indexOf("10.4") != -1)
                        q = 20;
                    else if ((Signlink.osVersion.indexOf("10.5") ^ 0xffffffff) == 0) {
                        if (Signlink.osVersion.indexOf("10.6") != -1)
                            q = 22;
                    } else
                        q = 21;
                }
                if (Signlink.javaVendor.toLowerCase().indexOf("sun") != -1)
                    z = 1;
                else if ((Signlink.javaVendor.toLowerCase().indexOf("microsoft") ^ 0xffffffff)
                        != 0)
                    z = 2;
                else if ((Signlink.javaVendor.toLowerCase().indexOf("apple") ^ 0xffffffff)
                        != 0)
                    z = 3;
                else
                    z = 4;
                int i = 2;
                int i_15_ = 0;
                try {
                    for (/**/; i < Signlink.javaVersion.length(); i++) {
                        int i_16_ = Signlink.javaVersion.charAt(i);
                        if (i_16_ < 48 || i_16_ > 57)
                            break;
                        i_15_ = i_16_ + (i_15_ * 10 - 48);
                    }
                } catch (Exception exception) {
            /* empty */
                }
                l = i_15_;
                i = Signlink.javaVersion.indexOf('.', 2) + 1;
                i_15_ = 0;
                try {
                    for (/**/; i < Signlink.javaVersion.length(); i++) {
                        int i_17_ = Signlink.javaVersion.charAt(i);
                        if (i_17_ < 48 || i_17_ > 57)
                            break;
                        i_15_ = i_17_ - 48 + i_15_ * 10;
                    }
                } catch (Exception exception) {
		    /* empty */
                }
                p = i_15_;
                i = Signlink.javaVersion.indexOf('_', 4) + 1;
                i_15_ = 0;
                try {
                    for (/**/; Signlink.javaVersion.length() > i; i++) {
                        int i_18_ = Signlink.javaVersion.charAt(i);
                        if (i_18_ < 48 || i_18_ > 57)
                            break;
                        i_15_ = i_18_ + (10 * i_15_ - 48);
                    }
                } catch (Exception exception) {
		    /* empty */
                }
                if (l > 3)
                    y = uf.h;
                else
                    y = 0;
                u = qm.heapSize;
                x = i_15_;
                if (!((Signlink) var_rj).r)
                    w = true;
                else
                    w = false;
                try {
                    o = (int) (jagmisc.getTotalPhysicalMemory() / 1024L
                            / 1024L);
                } catch (Throwable throwable) {
                    o = 0;
                }
                try {
                    n = HardwareInfo.getPackedBasicCPUInfo();
                } catch (Throwable throwable) {
                    break;
                }
                break;
            }
        } while (false);
    }
}
