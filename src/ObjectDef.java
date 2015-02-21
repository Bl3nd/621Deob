/* bda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ObjectDef {

    /*int nullLoader;
    private int yLoc;
    private int nullLoader;
    static int next;
    private byte unlink;
    int objectID;
    private int specialOutPacket15;
    private byte h = 0;
    int previous = -1;
    int j;
    private short[] loginStream;
    int[] width;
    int m;
    int[] n;
    private int o;
    static int p;
    static int q;
    private int r;
    private int s;
    static int applet;
    int u;
    private int[][] v;
    private int w;
    static int x;
    boolean incomingPacket63 = false;
    int z;
    int A;
    boolean B;
    boolean C;
    boolean outgoingPacket13;
    int E;
    private int F;
    private byte outgoingPacket54;
    int H;
    int I;
    int faceHereText;
    boolean xLoc;
    static int L;
    private short[] M;
    private byte[] N;
    static int O;
    private int P;
    private int Q;
    int R;
    private int S;
    String[] T;
    boolean U;
    private int V;
    private byte W;
    static int X;
    private int Y;
    private int[] Z;
    int ab;
    boolean bb;
    boolean cb;
    boolean db;
    int eb;
    int fb;
    int gb;
    boolean hb;
    boolean ib;
    int jb;
    boolean kb;
    static int lb;
    static int mb;
    ek nb;
    int ob;
    int[] pb;
    boolean qb;
    static int[] rb = new int[200];
    private int sb;
    static int tb;
    int ub;
    int vb;
    private int wb;
    int[] xb;
    static int yb;
    int zb;
    private byte Ab;
    static int Bb;
    boolean Cb;
    boolean Db;
    String objectName;
    private short[] Fb;
    static int Gb;
    int Hb;
    static int Ib = 0;
    static int Jb;
    static int Kb;
    static int Lb;
    private il Mb;
    int Nb;
    private short[] Ob;
    private byte[] Pb;
    int Qb;*/

    public int a;
    private int b;
    private int c;
    public static int d;
    private byte e;
    public int objectID;
    private int g;
    private byte h = 0;
    public int i = -1;
    public int j;
    private short[] k;
    public int[] l;
    public int m;
    public int[] n;
    private int o;
    public static int p;
    public static int q;
    private int r;
    private int s;
    public static int t;
    public int u;
    private int[][] v;
    private int w;
    public static int x;
    public boolean y = false;
    public int z;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    private int F;
    private byte G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public static int L;
    private short[] M;
    private byte[] N;
    public static int O;
    private int P;
    private int Q;
    public int R;
    private int S;
    public String[] T;
    public boolean U;
    private int V;
    private byte W;
    public static int parseValueCount;
    private int Y;
    private int[] Z;
    public int ab;
    public boolean bb;
    public boolean cb;
    public boolean db;
    public int eb;
    public int fb;
    public int gb;
    public boolean hb;
    public boolean ib;
    public int jb;
    public boolean kb;
    public static int lb;
    public static int mb;
    public ek nb;
    public int ob;
    public int[] pb;
    public boolean qb;
    public static int[] rb = new int[200];
    private int sb;
    public static int tb;
    public int ub;
    public int vb;
    private int wb;
    public int[] xb;
    public static int yb;
    public int zb;
    private byte Ab;
    public static int Bb;
    public boolean Cb;
    public boolean Db;
    public String objectName;
    private short[] Fb;
    public static int Gb;
    public int Hb;
    public static int Ib = 0;
    public static int Jb;
    public static int Kb;
    public static int Lb;
    private il Mb;
    public int Nb;
    private short[] Ob;
    private byte[] Pb;
    public int Qb;

    public final int a(int id, int j, int k) {
        Lb++;
        if (Mb == null) {
            return k;
        }
        if (j < 46) {
            Bb = 26;
        }
        GameInPacketHandler gameInPacketHandler = (GameInPacketHandler) Mb.a(-32748, (long) id);
        if (gameInPacketHandler == null) {
            return k;
        }
        return gameInPacketHandler.k;
    }

    public final boolean a(boolean bool, int i) {
        tb++;
        if ((~i) == 0) {
            return false;
        }
        if (bool) {
            this.n = null;
        }
        if (i == this.zb) {
            return true;
        }
        if (this.pb != null) {
            for (int index = 0; index < this.pb.length; index++) {
                if (i == this.pb[index]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(byte b) {
        Jb++;
        if (b < 120) {
            this.objectID = -12;
        }
        if (this.xb == null) {
            if ((~this.Nb) == 0 && this.n == null) {
                return false;
            }
            return true;
        }
        for (int index = 0; index < this.xb.length; index++) {
            if (this.xb[index] != -1) {
                ObjectDef objectDef = this.nb.getObjectDef((byte) 48, this.xb[index]);
                if (objectDef.Nb != -1 || objectDef.n != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final da a(int i, int j, Class_i class_i, int k, Class_i class_i1, dr dr, int i1, Class_r class_r, int j1, int k1, int i2, int j2, int mask,
                      int i3) {
        if (NPC.b(i3, j2 + 19)) {
            i3 = 4;
        }
        L++;
        long id = (long) (j + ((i3 << 3) + (this.objectID << 10)));
        id |= (long) (class_r.b << 29);
        int mask_ = mask;
        if (dr != null) {
            mask |= dr.a(j2 + 1020, i1, false, i2);
        }
        if (e == 3) {
            mask |= 0x7;
        } else {
            if (e != 0 || P != 0) {
                mask |= 0x2;
            }
            if (w != 0) {
                mask |= 0x1;
            }
            if (sb != 0) {
                mask |= 0x4;
            }
        }
        if (i3 == 10 && j > 3) {
            mask |= 0x5;
        }
        da da;
        synchronized (this.nb.x) {
            da = (da) this.nb.x.get(id, (byte) 100);
        }
        if (da == null || class_r.b(da.PA(), mask) != 0) {
            if (da != null) {
                mask = class_r.a(mask, da.PA());
            }
            da = a(i3, mask, -129, class_r, j);
            if (da == null) {
                return null;
            }
            synchronized (this.nb.x) {
                this.nb.x.put(id, da, 1);
            }
        }
        boolean bool = false;
        if (dr != null) {
            da = dr.a((byte) 1, da, mask, 7, 0x3 & j, k, i2, i1);
            bool = true;
        }
        if (i3 == 10 && j > 3) {
            if (!bool) {
                da = da.a((byte) 3, mask, true);
                bool = true;
            }
            da.M(2048);
        }
        if (j2 != 4) {
            return null;
        }
        if (e != 0) {
            if (!bool) {
                bool = true;
                da = da.a((byte) 3, mask, true);
            }
            da.ba(e, s, class_i, class_i1, i, j1, k1);
        }
        if (w != 0 || P != 0 || sb != 0) {
            if (!bool) {
                bool = true;
                da = da.a((byte) 3, mask, true);
            }
            da.oa(w, P, sb);
        }
        if (bool) {
            da.SA(mask_);
        }
        return da;
    }

    public final ObjectDef a(haa haa, int i) {
        q++;
        int index = -1;
        if (i != -1643) {
            parseValues((byte) 22, null);
        }
        if (b == -1) {
            if (r != -1) {
                index = haa.b(r, i + 1527);
            }
        } else {
            index = haa.a(112, b);
        }
        if (index < 0 || index >= this.xb.length - 1 || (~this.xb[index]) == 0) {
            int j = this.xb[this.xb.length - 1];
            if ((~j) == 0) {
                return null;
            }
            return this.nb.getObjectDef((byte) 21, j);
        }
        return this.nb.getObjectDef((byte) 37, this.xb[index]);
    }

    private void parseValue(int valueID, BytesParser stream, int dummy) {
        parseValueCount++;
        if (valueID != 1 && valueID != 5) {
            if (valueID == 2) {
                this.objectName = stream.readString((byte) 115);
            } else if (valueID != 14) {
                if (valueID != 15) {
                    if (valueID == 17) {
                        this.qb = false;
                        this.ab = 0;
                    } else if (valueID != 18) {
                        if (valueID != 19) {
                            if (valueID == 21) {
                                e = (byte) 1;
                            } else if (valueID == 22) {
                                this.ib = true;
                            } else if (valueID != 23) {
                                if (valueID == 24) {
                                    this.zb = stream.readShort(13111);
                                    if (this.zb == 65535) {
                                        this.zb = -1;
                                    }
                                } else if (valueID == 27) {
                                    this.ab = 1;
                                } else if (valueID != 28) {
                                    if (valueID == 29) {
                                        wb = stream.readByte(dummy ^ 0x29ff);
                                    } else if (valueID != 39) {
                                        if (valueID >= 30 && valueID < 35) {
                                            this.T[valueID - 30] = stream.readString((byte) 122);
                                        } else if (valueID != 40) {
                                            if (valueID == 41) {
                                                int j = stream.readUnsignedByte(-9268);
                                                M = new short[j];
                                                k = new short[j];
                                                for (int index = 0; j > index; index++) {
                                                    M[index] = (short) (stream.readShort(dummy + 43891));
                                                    this.k[index] = (short) (stream.readShort(13111));
                                                }
                                            } else if (valueID == 42) {
                                                int j = stream.readUnsignedByte(-9268);
                                                N = new byte[j];
                                                for (int index = 0; j > index; index++) {
                                                    N[index] = stream.readByte(-20933);
                                                }
                                            } else if (valueID != 62) {
                                                if (valueID == 64) {
                                                    this.cb = false;
                                                } else if (valueID == 65) {
                                                    V = stream.readShort(dummy + 43891);
                                                } else if (valueID != 66) {
                                                    if (valueID == 67) {
                                                        c = stream.readShort(13111);
                                                    } else if (valueID == 69) {
                                                        this.fb = stream.readUnsignedByte(-9268);
                                                    } else if (valueID == 70) {
                                                        F = stream.readShort2(55) << 2;
                                                    } else if (valueID != 71) {
                                                        if (valueID == 72) {
                                                            S = (stream.readShort2(72) << 2);
                                                        } else if (valueID == 73) {
                                                            this.D = true;
                                                        } else if (valueID == 74) {
                                                            this.y = true;
                                                        } else if (valueID != 75) {
                                                            if (valueID != 77 && valueID != 92) {
                                                                if (valueID == 78) {
                                                                    this.Nb = (stream.readShort(13111));
                                                                    this.gb = (stream.readUnsignedByte(-9268));
                                                                } else if (valueID == 79) {
                                                                    this.eb = (stream.readShort(13111));
                                                                    this.Qb = (stream.readShort(13111));
                                                                    this.gb = (stream.readUnsignedByte(-9268));
                                                                    int j = (stream.readUnsignedByte(-9268));
                                                                    this.n = (new int[j]);
                                                                    for (int index = 0; (j > index); index++) {
                                                                        this.n[index] = stream.readShort(mv.a(dummy, -19213));
                                                                    }
                                                                } else if (valueID == 81) {
                                                                    e = (byte) 2;
                                                                    s = (256 * (stream.readUnsignedByte(dummy ^ 0x5c08)));
                                                                } else if (valueID == 82) {
                                                                    this.K = true;
                                                                } else if (valueID != 88) {
                                                                    if (valueID == 89) {
                                                                        this.bb = false;
                                                                    } else if (valueID == 91) {
                                                                        this.Db = true;
                                                                    } else if (valueID == 93) {
                                                                        e = (byte) 3;
                                                                        s = stream.readShort(13111);
                                                                    } else if (valueID == 94) {
                                                                        e = (byte) 4;
                                                                    } else if (valueID == 95) {
                                                                        e = (byte) 5;
                                                                        s = stream.readShort2(27);
                                                                    } else if (valueID == 97) {
                                                                        this.U = true;
                                                                    } else if (valueID == 98) {
                                                                        this.B = true;
                                                                    } else if (valueID == 99) {
                                                                        this.Hb = stream.readUnsignedByte(-9268);
                                                                        this.z = stream.readShort(dummy ^ ~0x4b0c);
                                                                    } else if (valueID == 100) {
                                                                        this.H = stream.readUnsignedByte(-9268);
                                                                        this.a = stream.readShort(13111);
                                                                    } else if (valueID != 101) {
                                                                        if (valueID != 102) {
                                                                            if (valueID == 103) {
                                                                                this.vb = 0;
                                                                            } else if (valueID == 104) {
                                                                                this.m = stream.readUnsignedByte(-9268);
                                                                            } else if (valueID != 105) {
                                                                                if (valueID != 106) {
                                                                                    if (valueID != 107) {
                                                                                        if (valueID < 150 || valueID >= 155) {
                                                                                            if (valueID != 160) {
                                                                                                if (valueID == 162) {
                                                                                                    e = (byte) 3;
                                                                                                    s = stream.readInt(dummy + 30872);
                                                                                                } else if (valueID == 163) {
                                                                                                    W = stream.readByte(-20933);
                                                                                                    Ab = stream.readByte(-20933);
                                                                                                    G = stream.readByte(-20933);
                                                                                                    h = stream.readByte(dummy + 9847);
                                                                                                } else if (valueID == 164) {
                                                                                                    w = stream.readShort2(dummy + 30871);
                                                                                                } else if (valueID == 165) {
                                                                                                    P = stream.readShort2(dummy ^ ~0x7825);
                                                                                                } else if (valueID == 166) {
                                                                                                    sb = stream.readShort2(46);
                                                                                                } else if (valueID == 167) {
                                                                                                    this.j = stream.readShort(13111);
                                                                                                } else if (valueID != 168) {
                                                                                                    if (valueID != 169) {
                                                                                                        if (valueID == 170) {
                                                                                                            this.ob = stream.readSmart2(dummy + 16951);
                                                                                                        } else if (valueID == 171) {
                                                                                                            this.E = stream.readSmart2(-13829);
                                                                                                        } else if (valueID == 249) {
                                                                                                            int k = stream.readUnsignedByte(dummy + 21512);
                                                                                                            if (Mb == null) {
                                                                                                                int i1 = dfa.a(k, 128);
                                                                                                                Mb = new il(i1);
                                                                                                            }
                                                                                                            for (int i1 = 0; i1 < k; i1++) {
                                                                                                                boolean bool = stream.readUnsignedByte(-9268) == 1;
                                                                                                                int j1 = stream.readTribyte(-1);
                                                                                                                Node node;
                                                                                                                if (bool) {
                                                                                                                    node = new aa(stream.readString((byte) 125));
                                                                                                                } else {
                                                                                                                    node = new GameInPacketHandler(stream.readInt(dummy ^ ~0x784a));
                                                                                                                }
                                                                                                                Mb.a(node, (byte) -111, (long) j1);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        this.kb = true;
                                                                                                    }
                                                                                                } else {
                                                                                                    this.Cb = true;
                                                                                                }
                                                                                            } else {
                                                                                                int j = stream.readUnsignedByte(-9268);
                                                                                                this.l = new int[j];
                                                                                                for (int index = 0; j > index; index++) {
                                                                                                    this.l[index] = stream.readShort(dummy + 43891);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            this.T[valueID - 150] = stream.readString((byte) 123);
                                                                                            if (!this.nb.c) {
                                                                                                this.T[valueID - 150] = null;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        this.R = stream.readShort(13111);
                                                                                    }
                                                                                } else {
                                                                                    int j = stream.readUnsignedByte(-9268);
                                                                                    Z = new int[j];
                                                                                    this.pb = new int[j];
                                                                                    for (int index = 0; index < j; index++) {
                                                                                        this.pb[index] = stream.readShort(13111);
                                                                                        int k = stream.readUnsignedByte(-9268);
                                                                                        Z[index] = k;
                                                                                        Y += k;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                this.db = true;
                                                                            }
                                                                        } else {
                                                                            this.u = stream.readShort(13111);
                                                                        }
                                                                    } else {
                                                                        this.I = stream.readUnsignedByte(-9268);
                                                                    }
                                                                } else {
                                                                    this.hb = false;
                                                                }
                                                            } else {
                                                                b = (stream.readShort(13111));
                                                                if (b == 65535) {
                                                                    b = -1;
                                                                }
                                                                r = (stream.readShort(dummy ^ ~0x4b0c));
                                                                if (r == 65535) {
                                                                    r = -1;
                                                                }
                                                                int j = -1;
                                                                if (valueID == 92) {
                                                                    j = (stream.readShort(13111));
                                                                    if (j == 65535) {
                                                                        j = -1;
                                                                    }
                                                                }
                                                                int k = (stream.readUnsignedByte(-9268));
                                                                this.xb = (new int[(k + 2)]);
                                                                for (int index = 0; (index <= k); index++) {
                                                                    this.xb[index] = (stream.readShort(13111));
                                                                    if ((this.xb[index]) == 65535) {
                                                                        this.xb[index] = -1;
                                                                    }
                                                                }
                                                                this.xb[k + 1] = j;
                                                            }
                                                        } else {
                                                            this.i = (stream.readUnsignedByte(-9268));
                                                        }
                                                    } else {
                                                        Q = stream.readShort2(104) << 2;
                                                    }
                                                } else {
                                                    o = stream.readShort(13111);
                                                }
                                            } else {
                                                this.C = true;
                                            }
                                        } else {
                                            int j = stream.readUnsignedByte(-9268);
                                            Ob = new short[j];
                                            Fb = new short[j];
                                            for (int index = 0; j > index; index++) {
                                                Ob[index] = (short) (stream.readShort(dummy + 43891));
                                                Fb[index] = (short) (stream.readShort(dummy + 43891));
                                            }
                                        }
                                    } else {
                                        g = 5 * stream.readByte(-20933);
                                    }
                                } else {
                                    this.ub = stream.readUnsignedByte(-9268) << 2;
                                }
                            } else {
                                this.vb = 1;
                            }
                        } else {
                            this.jb = stream.readUnsignedByte(dummy + 21512);
                        }
                    } else {
                        this.qb = false;
                    }
                } else {
                    this.J = stream.readUnsignedByte(dummy ^ 0x5c08);
                }
            } else {
                this.A = stream.readUnsignedByte(-9268);
            }
        } else {
            if (valueID == 5 && this.nb.i) {
                a(dummy + 20170, stream);
            }
            int j = stream.readUnsignedByte(-9268);
            Pb = new byte[j];
            v = new int[j][];
            for (int k = 0; k < j; k++) {
                Pb[k] = stream.readByte(-20933);
                int i1 = stream.readUnsignedByte(-9268);
                v[k] = new int[i1];
                for (int index = 0; i1 > index; index++) {
                    v[k][index] = stream.readShort(13111);
                }
            }
            if (valueID == 5 && !this.nb.i) {
                a(-10610, stream);
            }
        }
        if (dummy != -30780) {
            a((byte) 114);
        }
    }

    private da a(int i, int mask, int j, Class_r class_r, int k) {
        Gb++;
        int i1 = wb + 64;
        int j1 = g + 850;
        int mask_ = mask;
        boolean bool = this.C || i == 2 && k > 3;
        if (bool) {
            mask |= 0x10;
        }
        if (k != 0) {
            mask |= 0xd;
        } else {
            if (V != 128 || F != 0) {
                mask |= 0x1;
            }
            if (c != 128 || S != 0) {
                mask |= 0x4;
            }
        }
        if ((~o) != j || Q != 0) {
            mask |= 0x2;
        }
        if (Ob != null) {
            mask |= 0x4000;
        }
        if (M != null) {
            mask |= 0x8000;
        }
        if (h != 0) {
            mask |= 0x80000;
        }
        da da = null;
        if (Pb == null) {
            return null;
        }
        int k1 = -1;
        for (int index = 0; index < Pb.length; index++) {
            if (i == Pb[index]) {
                k1 = index;
                break;
            }
        }
        if ((~k1) == 0) {
            return null;
        }
        int length = v[k1].length;
        if (length > 0) {
            long id = (long) class_r.b;
            for (int index = 0; index < length; index++) {
                id = (long) v[k1][index] + 67783L * id;
            }
            synchronized (this.nb.u) {
                da = (da) this.nb.u.get(id, (byte) 100);
            }
            if (da != null) {
                if (da.TA() != i1) {
                    mask |= 0x1000;
                }
                if (j1 != da.na()) {
                    mask |= 0x2000;
                }
            }
            if (da == null || class_r.b(da.PA(), mask) != 0) {
                int i2 = 0x1f01f | mask;
                if (da != null) {
                    i2 = class_r.a(i2, da.PA());
                }
                eg eg = null;
                synchronized (qba.C) {
                    for (int index = 0; length > index; index++) {
                        synchronized (this.nb.o) {
                            eg = efa.a(0xffff & v[k1][index], this.nb.o, 0, false);
                        }
                        if (eg == null) {
                            return null;
                        }
                        if (eg.bb < 13) {
                            eg.a((byte) -107, 2);
                        }
                        if (length > 1) {
                            qba.C[index] = eg;
                        }
                    }
                    if (length > 1) {
                        eg = new eg(qba.C, length);
                    }
                }
                da = class_r.a(eg, i2, this.nb.y, i1, j1);
                synchronized (this.nb.u) {
                    this.nb.u.put(id, da, 1);
                }
            }
        }
        da da1 = da.a((byte) 0, mask, true);
        if (da.TA() != i1) {
            da1.T(i1);
        }
        if (da.na() != j1) {
            da1.ga(j1);
        }
        if (bool) {
            da1.FA();
        }
        if (i == 4 && k > 3) {
            da1.fa(2048);
            da1.oa(180, 0, -180);
        }
        k &= 0x3;
        if (k != 1) {
            if (k == 2) {
                da1.fa(8192);
            } else if (k == 3) {
                da1.fa(12288);
            }
        } else {
            da1.fa(4096);
        }
        if (Ob != null) {
            for (int index = 0; Ob.length > index; index++) {
                if (N == null || N.length <= index) {
                    da1.d(Ob[index], Fb[index]);
                } else {
                    da1.d(Ob[index], Class_pd.s[0xff & N[index]]);
                }
            }
        }
        if (M != null) {
            for (int index = 0; index < M.length; index++) {
                da1.DA(M[index], this.k[index]);
            }
        }
        if (h != 0) {
            da1.a(W, Ab, G, h & 0xff);
        }
        if (V != 128 || o != 128 || c != 128) {
            da1.R(V, o, c);
        }
        if (F != 0 || Q != 0 || S != 0) {
            da1.oa(F, Q, S);
        }
        da1.SA(mask_);
        return da1;
    }

    public final String a(int i, String string, int j) {
        lb++;
        if (Mb == null)
            return string;
        aa aa = (aa) Mb.a(j ^ ~0x882, (long) i);
        if (aa == null) {
            return string;
        }
        if (j != 30569) {
            this.ob = -104;
        }
        return aa.m;
    }

    public final void a(boolean bool) {
        Kb++;
        if (bool) {
            this.kb = false;
        }
        if (this.jb == -1) {
            this.jb = 0;
            if (Pb != null && Pb.length == 1 && Pb[0] == 10) {
                this.jb = 1;
            }
            for (int index = 0; index < 5; index++) {
                if (this.T[index] != null) {
                    this.jb = 1;
                    break;
                }
            }
        }
        if ((~this.i) == 0) {
            this.i = this.ab == 0 ? 0 : 1;
        }
    }

    public final boolean b(byte b) {
        p++;
        if (v == null) {
            return true;
        }
        boolean bool = true;
        synchronized (this.nb.o) {
            int i = 0;
            if (b > -82) {
                b(-10);
            }
            for (/**/; i < v.length; i++) {
                for (int j = 0; j < v[i].length; j++) {
                    bool &= this.nb.o.a(0, (byte) 117, v[i][j]);
                }
            }
        }
        return bool;
    }

    public static void nullLoader() {
        rb = null;
    }

    public final kj a(int mask_, Class_r class_r, int j, Class_i class_i, int xLocation, int k, Class_i class_i1, int yLocation, boolean bool,
               int i1, int j1) {
        t++;
        if (NPC.b(i1, -122)) {
            i1 = 4;
        }
        long id = (long) ((this.objectID << 10) + (i1 << 3) + j1);
        id |= (long) (class_r.b << 29);
        int mask = mask_;
        if (e == 3) {
            mask |= 0x7;
        } else {
            if (e != 0 || P != 0) {
                mask |= 0x2;
            }
            if (w != 0) {
                mask |= 0x1;
            }
            if (sb != 0) {
                mask |= 0x4;
            }
        }
        if (bool) {
            mask |= 0x40000;
        }
        kj kj;
        synchronized (this.nb.v) {
            kj = (kj) this.nb.v.get(id, (byte) 100);
        }
        da da = kj == null ? null : kj.d;
        ha ha = null;
        if (da == null || class_r.b(da.PA(), mask) != 0) {
            if (da != null) {
                mask = class_r.a(mask, da.PA());
            }
            int mask_1 = mask;
            if (i1 == 10 && j1 > 3) {
                mask_1 |= 0x5;
            }
            da = a(i1, mask_1, -129, class_r, j1);
            if (da == null) {
                return null;
            }
            if (i1 == 10 && j1 > 3) {
                da.M(2048);
            }
            if (bool) {
                ha = da.S(null);
            }
            da.SA(mask);
            kj = new kj();
            kj.d = da;
            kj.e = ha;
            synchronized (this.nb.v) {
                this.nb.v.put(id, kj, 1);
            }
        } else {
            da = kj.d;
            ha = kj.e;
            if (bool && ha == null) {
                ha = kj.e = da.S(null);
            }
        }
        boolean bool1 = e != 0 && (class_i != null || class_i1 != null);
        boolean bool2 = w != 0 || P != 0 || sb != 0;
        if (!bool1 && !bool2) {
            da = da.a((byte) 0, mask_, true);
        } else {
            da = da.a((byte) 0, mask, true);
            if (bool1) {
                da.ba(e, s, class_i, class_i1, xLocation, j, yLocation);
            }
            if (bool2) {
                da.oa(w, P, sb);
            }
            da.SA(mask_);
        }
        rda.g.e = ha;
        rda.g.d = da;
        if (k != -129) {
            a(-106, null);
        }
        return rda.g;
    }

    public final int b(int i) {
        if (i != -1) {
            a(4, -25);
        }
        mb++;
        if (this.pb != null) {
            int j = (int) (Math.random() * (double) Y);
            int index;
            for (index = 0; j >= Z[index]; index++) {
                j -= Z[index];
            }
            return this.pb[index];
        }
        return -1;
    }

    public final boolean a(int i, int j) {
        d++;
        if (v == null) {
            return true;
        }
        synchronized (this.nb.o) {
            for (int k = 0; k < Pb.length; k++) {
                if (Pb[k] == j) {
                    for (int i1 = 0; i1 < v[k].length; i1++) {
                        if (!this.nb.o.a(0, (byte) 85, v[k][i1])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    public static int a(int i, int j, int k, int i1, int j1, int k1, int i2) {
        j &= 0x3;
        O++;
        if ((i2 & i) == 1) {
            int j2 = k1;
            k1 = k;
            k = j2;
        }
        if (j == 0) {
            return j1;
        }
        if (j == 1) {
            return i1;
        }
        if (j == 2) {
            return 7 - k1 - j1 + 1;
        }
        return -i1 - k + 7 + 1;
    }

    private void a(int i, BytesParser bytesParser) {
        x++;
        int j = bytesParser.readUnsignedByte(-9268);
        int k = 0;
        if (i != -10610) {
            nullLoader();
        }
        for (/**/; j > k; k++) {
            bytesParser.pos++;
            int i1 = bytesParser.readUnsignedByte(-9268);
            bytesParser.pos += 2 * i1;
        }
    }

    public final void parseValues(byte b, BytesParser bytesParser) {
        if (b != 0) {
            this.J = -97;
        }
        for (; ; ) {
            int valueID = bytesParser.readUnsignedByte(-9268);
            if (valueID == 0) {
                break;
            }
            parseValue(valueID, bytesParser, -30780);
        }
        yb++;
    }

    public ObjectDef() {
        this.a = -1;
        s = -1;
        F = 0;
        e = (byte) 0;
        this.A = 1;
        this.H = -1;
        this.D = false;
        g = 0;
        this.B = false;
        c = 128;
        this.u = -1;
        this.T = new String[5];
        this.C = false;
        b = -1;
        P = 0;
        this.I = 0;
        o = 128;
        this.ab = 2;
        w = 0;
        this.bb = true;
        this.U = false;
        this.jb = -1;
        this.ib = false;
        this.m = 255;
        this.pb = null;
        this.gb = 0;
        this.eb = 0;
        this.R = -1;
        this.cb = true;
        this.K = false;
        this.ub = 64;
        Y = 0;
        this.qb = true;
        wb = 0;
        this.E = 0;
        this.j = 0;
        this.zb = -1;
        this.db = false;
        V = 128;
        this.J = 1;
        this.objectName = "null";
        this.z = -1;
        r = -1;
        this.kb = false;
        sb = 0;
        S = 0;
        this.Db = false;
        this.hb = true;
        Q = 0;
        this.Cb = false;
        this.Nb = -1;
        Z = null;
        this.vb = -1;
        this.Qb = 0;
        this.ob = 960;
        this.fb = 0;
        this.Hb = -1;
    }

    static {
        Bb = 1;
    }
}
