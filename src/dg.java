/* dg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

import jagex3.jagmisc.jagmisc;

final class dg extends jb {
    static int gb;
    static int hb;
    static int ib;
    int jb;
    static int kb;
    static int lb;
    static int mb;
    boolean nb = false;
    static int[] ob = {0, 1, 2, 3, 4, 5, 6, 14};
    static int pb;
    boolean qb = false;
    static int rb;
    static int sb;
    static int tb;
    static int ub;
    static int vb;
    static int wb;
    boolean xb = false;
    static int yb;
    static int zb;
    static int Ab;
    static int Bb;
    static int Cb = -1;
    boolean Db = false;
    static int Eb;
    static int Fb;
    static int Gb;
    boolean Hb = false;
    static int Ib;
    static int Jb;

    private final int c(int i, int i_0_) {
        if (i >= -35)
            this.qb = false;
        wb++;
        int i_1_;
        if (i_0_ > 12000) {
            i_1_ = 4;
            c(124);
        } else if (i_0_ > 5000) {
            a(-29520);
            i_1_ = 3;
        } else if (i_0_ <= 2000) {
            i_1_ = 1;
            a(true, (byte) -89);
        } else {
            a(false);
            i_1_ = 2;
        }
        if (on.performance != 2) {
            this.tkVersion = 2;
            ur.setTKVersion(2, true);
        }
        a(nda.signlink, (byte) 101);
        return i_1_;
    }

    private final void a(byte i) {
        if (i != -126)
            Cb = 21;
        if (uf.h <= 1)
            this.x = 2;
        else
            this.x = 4;
        ib++;
    }

    private final int b(boolean bool, int i, int i_2_) {
        if (bool != false)
            b((byte) -121);
        Gb++;
        int i_3_;
        if (i <= 20000) {
            if (i <= 10000) {
                if (i <= 5000) {
                    i_3_ = 1;
                    a(true, (byte) -91);
                } else {
                    i_3_ = 2;
                    a(false);
                }
            } else {
                i_3_ = 3;
                a(-29520);
            }
        } else {
            c(112);
            i_3_ = 4;
        }
        if (on.performance != i_2_) {
            this.tkVersion = i_2_;
            ur.setTKVersion(i_2_, true);
        }
        a(nda.signlink, (byte) 92);
        return i_3_;
    }

    static final int b(int i, int i_4_, int i_5_) {
        if (i_5_ != -11)
            b((byte) 31);
        vb++;
        int i_6_ = 57 * i + i_4_;
        i_6_ ^= i_6_ << 13;
        int i_7_ = (i_6_ * (i_6_ * (i_6_ * 15731) + 789221) + 1376312589
                & 0x7fffffff);
        return (0x7f9daa3 & i_7_) >> 19;
    }

    final void a(int i) {
        if (i == -29520) {
            rb++;
            a(true, 1000);
            this.isTextures = true;
            this.v = false;
            this.O = this.G = 1;
            this.p = true;
            this.y = true;
            this.T = true;
            this.R = true;
            this.isOT = true;
            this.K = true;
            this.q = 1;
            this.t = true;
            this.S = this.Z = 0;
            this.L = false;
            this.ab = true;
            if (qm.heapSize > 95)
                pda.d(0, 1);
            else
                pda.d(i + 29520, 0);
            this.isGB = true;
            this.buildAreaSize = 0;
            this.cb = false;
            a((byte) -126);
            a((byte) 106, 1);
            this.X = 3;
            bca.showTextures((byte) 112);
            Class_ad.lighting(-32);
        }
    }

    final boolean d(int i, int i_8_) {
        Ib++;
        if (i_8_ != -2)
            return true;
        if (i != 0)
            return true;
        return this.C;
    }

    static final rc[] b(int i) {
        Bb++;
        if (i < 13)
            return null;
        return new rc[]{oh.c, lf.b, tda.b};
    }

    public static void b(byte i) {
        if (i == 5)
            ob = null;
    }

    private final void a(BytesParser var_es, boolean bool) {
        tb++;
        if (var_es.bytes.length - var_es.pos >= 1) {
            int i = var_es.readUnsignedByte(-9268);
            if (i >= 0 && i <= 22) {
                int i_9_;
                if (i == 22)
                    i_9_ = 45;
                else if (i == 21)
                    i_9_ = 44;
                else if (i == 20)
                    i_9_ = 43;
                else if (i == 19)
                    i_9_ = 42;
                else if (i != 18) {
                    if (i != 17) {
                        if (i != 16) {
                            if (i != 15) {
                                if (i == 14)
                                    i_9_ = 36;
                                else if (i != 13) {
                                    if (i == 12)
                                        i_9_ = 34;
                                    else if (i == 11)
                                        i_9_ = 33;
                                    else if (i == 10)
                                        i_9_ = 32;
                                    else if (i != 9) {
                                        if (i != 8) {
                                            if (i == 7)
                                                i_9_ = 29;
                                            else if (i == 6)
                                                i_9_ = 28;
                                            else if (i == 5)
                                                i_9_ = 28;
                                            else if (i == 4)
                                                i_9_ = 24;
                                            else if (i != 3) {
                                                if (i == 2)
                                                    i_9_ = 22;
                                                else if (i == 1)
                                                    i_9_ = 23;
                                                else
                                                    i_9_ = 19;
                                            } else
                                                i_9_ = 23;
                                        } else
                                            i_9_ = 30;
                                    } else
                                        i_9_ = 31;
                                } else
                                    i_9_ = 35;
                            } else
                                i_9_ = 37;
                        } else
                            i_9_ = 38;
                    } else
                        i_9_ = 40;
                } else
                    i_9_ = 41;
                if (bool != false)
                    zb = 48;
                if (i_9_ <= var_es.bytes.length - var_es.pos) {
                    this.db = var_es.readUnsignedByte(-9268);
                    if (this.db >= 1) {
                        if (this.db > 4)
                            this.db = 4;
                    } else
                        this.db = 1;
                    a(var_es.readUnsignedByte(-9268) == 1, 1000);
                    this.R = var_es.readUnsignedByte(-9268) == 1;
                    this.ab = var_es.readUnsignedByte(-9268) == 1;
                    this.K = var_es.readUnsignedByte(-9268) == 1;
                    this.q = var_es.readUnsignedByte(-9268) == 1 ? 1 : 0;
                    this.y = var_es.readUnsignedByte(-9268) == 1;
                    this.isOT = var_es.readUnsignedByte(-9268) == 1;
                    this.t = var_es.readUnsignedByte(-9268) == 1;
                    this.O = var_es.readUnsignedByte(-9268);
                    if (this.O > 2)
                        this.O = 2;
                    if (i >= 17)
                        this.G = var_es.readUnsignedByte(-9268);
                    if (i < 2) {
                        this.T = var_es.readUnsignedByte(-9268) == 1;
                        var_es.readUnsignedByte(-9268);
                    } else {
                        this.T = var_es.readUnsignedByte(-9268) == 1;
                        if (i >= 17)
                            this.v = var_es.readUnsignedByte(-9268) == 1;
                    }
                    this.L = var_es.readUnsignedByte(-9268) == 1;
                    this.p = var_es.readUnsignedByte(-9268) == 1;
                    this.S = var_es.readUnsignedByte(-9268);
                    if (this.S > 2)
                        this.S = 2;
                    this.Z = this.S;
                    this.s = var_es.readUnsignedByte(-9268) == 1;
                    this.I = var_es.readUnsignedByte(-9268);
                    if (this.I > 127)
                        this.I = 127;
                    if (i < 20)
                        this.P = this.I;
                    else {
                        this.P = var_es.readUnsignedByte(-9268);
                        if (this.P > 127)
                            this.P = 127;
                    }
                    this.N = var_es.readUnsignedByte(-9268);
                    this.Y = var_es.readUnsignedByte(-9268);
                    if (this.Y > 127)
                        this.Y = 127;
                    if (i >= 21) {
                        this.V = var_es.readUnsignedByte(-9268);
                        if (this.V > 127)
                            this.V = 127;
                    } else
                        this.V = this.N;
                    if (i >= 1) {
                        this.W = var_es.readShort(13111);
                        this.F = var_es.readShort(13111);
                    }
                    if (i >= 3 && i < 6)
                        var_es.readUnsignedByte(-9268);
                    if (i >= 4) {
                        int i_10_ = var_es.readUnsignedByte(-9268);
                        if (i_10_ < 0 || i_10_ > 2)
                            i_10_ = 0;
                        if (qm.heapSize < 96)
                            i_10_ = 0;
                        pda.d(0, i_10_);
                    }
                    if (i >= 5)
                        this.l = var_es.readInt(97);
                    int i_11_ = 0;
                    if (i >= 6)
                        this.w = i_11_ = var_es.readUnsignedByte(-9268);
                    if (this.w != 1 && this.w != 2)
                        this.w = 2;
                    if (i >= 7)
                        this.A = var_es.readUnsignedByte(-9268) == 1;
                    if (i >= 8)
                        this.n = var_es.readUnsignedByte(-9268) == 1;
                    if (i >= 9)
                        this.buildAreaSize = var_es.readUnsignedByte(-9268);
                    if (this.buildAreaSize < 0
                            || this.buildAreaSize > Class_g.a(-93, qm.heapSize))
                        this.buildAreaSize = 0;
                    if (i >= 10)
                        this.cb = var_es.readUnsignedByte(-9268) != 0;
                    if (i >= 11)
                        this.J = var_es.readUnsignedByte(-9268) != 0;
                    if (i >= 12)
                        this.q = var_es.readUnsignedByte(-9268);
                    if (this.q < 0 || this.q > 2)
                        this.q = 1;
                    if (i >= 13)
                        this.isGB = var_es.readUnsignedByte(-9268) == 1;
                    if (i < 14) {
                        if (i_11_ == 0)
                            this.tkVersion = 2;
                        else
                            this.tkVersion = 1;
                    } else
                        this.tkVersion = var_es.readUnsignedByte(-9268);
                    if (this.tkVersion < 0 || this.tkVersion > 5)
                        this.tkVersion = 2;
                    if (i >= 15) {
                        this.x = var_es.readUnsignedByte(-9268);
                        if (this.x < 0 || this.x > 4)
                            this.x = uf.h != 1 ? 4 : 2;
                    }
                    if (i >= 16) {
                        this.isTextures = var_es.readUnsignedByte(-9268) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L)
                                this.isTextures = false;
                        } catch (Throwable throwable) {
                /* empty */
                        }
                    }
                    if (i < 17 && this.tkVersion == 0)
                        this.tkVersion = 2;
                    if (i >= 18) {
                        this.X = var_es.readUnsignedByte(-9268);
                        if (this.X < 0 || this.X > 4)
                            this.X = 0;
                    }
                    if (i >= 19)
                        this.H = var_es.readUnsignedByte(-9268);
                    else if (this.X == 1 || this.X == 2)
                        this.H = 2;
                    else if (this.X != 3)
                        this.H = 0;
                    else
                        this.H = 1;
                    if (i >= 22)
                        this.z = var_es.readUnsignedByte(-9268);
                    if (this.tkVersion == 0 && qm.heapSize < 96 && this.X != 1
                            && this.X != 0)
                        a(false, (byte) -108);
                }
            }
        }
    }

    final boolean e(int i, int i_12_) {
        Jb++;
        if (i_12_ <= 72)
            Eb = 57;
        if (i != 0 || this.Hb)
            return true;
        return this.C;
    }

    final int a(int i, byte i_13_) {
        sb++;
        int i_14_ = -77 / ((30 - i_13_) / 51);
        if (!iv.a(i, (byte) -59) || dn.a(113, hm.h))
            return 0;
        if (qm.heapSize < 96 && mg.c(-1, i) && this.H == 0)
            return 1;
        return this.H;
    }

    public final int autoSetup(byte b) {
        pb++;
        boolean bool = false;
        boolean bool1 = false;
        boolean bool2 = false;
        if (nda.signlink.r && !nda.signlink.e) {
            if (Signlink.osNameLowerCase.startsWith("win")) {
                if (!Signlink.osArch.startsWith("amd64") && !Signlink.osArch.startsWith("x86_64")) {
                    bool = true;
                }
                bool2 = true;
                bool1 = true;
            } else {
                bool1 = true;
            }
        }
        if (this.Db) {
            bool = false;
        }
        if (this.nb) {
            bool2 = false;
        }
        if (this.xb) {
            bool1 = false;
        }
        if (!bool && !bool1 && !bool2) {
            return i(0);
        }
        int toolkit2 = -1;
        int toolkit1 = -1;
        int toolkit3 = -1;
        if (bool) {
            try {
                toolkit2 = ItemDef.getToolkit(2, (byte) -113, 1000);
            } catch (Exception exception) {
		/* empty */
            }
        }
        do {
            if (bool2) {
                try {
                    toolkit3 = ItemDef.getToolkit(3, (byte) -104, 1000);
                    if (on.performance == 3) {
                        GraphicsCard graphicsCard = lg.r.y();
                        long driverVersion = 0xffffffffffffL & graphicsCard.driverVersion;
                        int vendor = graphicsCard.vendor;
                        if (vendor != 4318) {
                            if (vendor != 4098) {
                                break;
                            }
                        } else {
                            bool1 = bool1 & driverVersion >= 64425238954L;
                            break;
                        }
                        bool1 = bool1 & driverVersion >= 60129613779L;
                    }
                } catch (Exception exception) {
		            /* empty */
                }
            }
        } while (false);
        if (bool1) {
            try {
                toolkit1 = ItemDef.getToolkit(1, (byte) -111, 1000);
            } catch (Exception exception) {
		        /* empty */
            }
        }
        if ((~toolkit2) == 0 && toolkit1 == -1 && toolkit3 == -1) {
            return i(0);
        }
        if (b <= 99) {
            return 81;
        }
        toolkit1 *= 1.1F;
        toolkit3 *= 1.1F;
        if (toolkit3 < toolkit2 && toolkit1 < toolkit2) {
            return c(-81, toolkit2);
        }
        if (toolkit3 <= toolkit1) {
            return b(false, toolkit1, 1);
        }
        return b(false, toolkit3, 3);
    }

    public final void a(Signlink signlink, byte b) {
        Fb++;
        FileOnDisk fileOnDisk = null;
        try {
            if (b <= 30) {
                this.Hb = true;
            }
            vfa vfa = signlink.a("", (byte) -28, true);
            while (vfa.f == 0) {
                Connection.a(-28448, 1L);
            }
            if (vfa.f == 1) {
                fileOnDisk = (FileOnDisk) vfa.hostName;
                BytesParser bytesParser = new BytesParser(tm.d(4929));
                this.a(123, bytesParser);
                fileOnDisk.write(0, bytesParser.pos, bytesParser.bytes);
            }
        } catch (Exception exception) {
	    /* empty */
        }
        do {
            try {
                if (fileOnDisk == null) {
                    break;
                }
                fileOnDisk.close();
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    final void a(boolean bool) {
        hb++;
        a(true, 1000);
        this.t = false;
        this.T = false;
        this.isTextures = false;
        this.K = false;
        this.y = false;
        this.isOT = false;
        this.q = 0;
        this.ab = true;
        this.v = false;
        this.L = false;
        this.S = this.Z = 0;
        this.p = false;
        this.R = bool;
        this.O = this.G = 0;
        pda.d(0, 0);
        this.buildAreaSize = 0;
        this.isGB = true;
        this.cb = false;
        a((byte) -126);
        a((byte) 120, 2);
        this.X = 2;
        bca.showTextures((byte) 102);
        Class_ad.lighting(125);
    }

    final void a(byte i, int i_21_) {
        pda.v = null;
        up.I = true;
        yb++;
        if (i <= 103)
            a(false, -122);
        this.H = i_21_;
    }

    final void c(int i) {
        a(true, 1000);
        lb++;
        this.t = true;
        this.p = true;
        this.q = 1;
        this.O = this.G = 2;
        this.y = true;
        this.isOT = true;
        this.T = true;
        this.isTextures = true;
        this.L = true;
        this.R = true;
        this.v = true;
        this.ab = true;
        this.S = this.Z = 0;
        this.K = true;
        int i_22_ = -30 / ((i - 59) / 50);
        if (qm.heapSize > 95)
            pda.d(0, 2);
        else
            pda.d(0, 0);
        this.isGB = true;
        this.buildAreaSize = 0;
        this.cb = false;
        a((byte) -126);
        a((byte) 111, 0);
        this.X = 4;
        bca.showTextures((byte) 83);
        Class_ad.lighting(125);
    }

    final void a(boolean bool, int i) {
        mb++;
        this.C = bool;
        if (i == 1000) {
            if (ul.k != null)
                ul.k.a(1, !e(on.performance, 74));
        }
    }

    final int f(int i, int i_23_) {
        int i_24_ = -109 % ((i - 1) / 57);
        kb++;
        if (this.qb)
            return 0;
        if (!e(i_23_, 118))
            return 1;
        if (this.R)
            return 2;
        return 1;
    }

    private final int i(int i) {
        ub++;
        if (i != 0)
            Cb = 1;
        int i_25_;
        if (qm.heapSize < 96) {
            a(true, (byte) -120);
            i_25_ = 1;
        } else {
            int i_26_ = ur.getProfileCPU(i - 115);
            if (i_26_ <= 100) {
                i_25_ = 4;
                c(121);
            } else if (i_26_ > 500) {
                if (i_26_ > 1000) {
                    i_25_ = 1;
                    a(true, (byte) -115);
                } else {
                    i_25_ = 2;
                    a(false);
                }
            } else {
                a(-29520);
                i_25_ = 3;
            }
        }
        if (on.performance != 0) {
            this.tkVersion = 0;
            ur.setTKVersion(0, true);
        }
        a(nda.signlink, (byte) 123);
        return i_25_;
    }

    final void a(boolean bool, byte i) {
        Ab++;
        a(false, 1000);
        this.q = 0;
        this.p = false;
        this.isTextures = false;
        this.isOT = false;
        this.T = false;
        if (i >= -12)
            gb = 86;
        this.y = false;
        this.S = this.Z = 0;
        this.t = false;
        this.v = false;
        this.L = false;
        this.R = false;
        this.ab = false;
        this.K = false;
        this.O = this.G = 0;
        pda.d(0, 0);
        this.cb = false;
        this.buildAreaSize = 0;
        this.isGB = false;
        a((byte) -126);
        a((byte) 127, 2);
        this.X = 1;
        if (bool)
            bca.showTextures((byte) 77);
        Class_ad.lighting(6);
    }

    dg(Signlink var_rj) {
        this.X = 3;
        this.db = 3;
        a(true, 1000);
        this.R = true;
        this.t = true;
        this.W = 0;
        this.S = 0;
        this.ab = true;
        this.L = true;
        this.p = true;
        this.q = 1;
        this.P = 127;
        this.N = 127;
        this.v = false;
        this.Z = 0;
        this.Y = 127;
        this.F = 0;
        this.K = true;
        this.isOT = true;
        this.V = 127;
        this.s = true;
        this.I = 127;
        this.O = 2;
        this.T = true;
        this.y = true;
        this.G = 0;
        if (qm.heapSize >= 96)
            pda.d(0, 2);
        else
            pda.d(0, 0);
        this.buildAreaSize = 0;
        this.x = uf.h != 1 ? 4 : 2;
        this.isGB = true;
        this.cb = false;
        this.A = false;
        this.J = true;
        this.w = 2;
        this.l = 0;
        this.n = false;
        this.tkVersion = 2;
        this.H = 0;
        FileOnDisk var_cu = null;
        try {
            vfa var_vfa = var_rj.a("", (byte) -28, true);
            while (var_vfa.f == 0)
                Connection.a(-28448, 1L);
            if (var_vfa.f == 1) {
                var_cu = (FileOnDisk) var_vfa.hostName;
                byte[] is = new byte[(int) var_cu.getLength()];
                int i;
                for (int i_27_ = 0; i_27_ < is.length; i_27_ += i) {
                    i = var_cu.read(i_27_, is, is.length - i_27_);
                    if (i == -1)
                        throw new IOException("EOF");
                }
                a(new BytesParser(is), false);
            }
        } catch (Exception exception) {
	    /* empty */
        }
        do {
            try {
                if (var_cu == null)
                    break;
                var_cu.close();
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    static {
        zb = 0;
    }
}
