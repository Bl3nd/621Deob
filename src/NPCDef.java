/* du - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class NPCDef {

    /*int nullLoader;
	private short[] yLoc;
	static int nullLoader;
	String[] next = new String[5];
	private byte unlink;
	boolean outgoingPacket2;
	static fca specialOutPacket15 = new fca();
	int h;
	int previous;
	static int j;
	static int loginStream;
	private byte width;
	boolean m = true;
	byte n;
	static int o;
	private short[] p;
	boolean q;
	static int r;
	static int s;
	int applet;
	private int u;
	boolean v;
	static int w;
	int x;
	byte incomingPacket63;
	int z;
	static int A;
	int B;
	static int C;
	byte outgoingPacket13;
	int E;
	int npcID;
	int[] outgoingPacket54;
	private byte H;
	private int[][] I;
	private byte[] faceHereText;
	static int xLoc;
	int[] L;
	int combatLevel;
	boolean N;
	int O;
	private int P;
	int Q;
	static int R;
	private int[][] S;
	int T;
	int U;
	short V;
	static int W;
	int X;
	private int Y;
	byte Z;
	int ab;
	int bb;
	private int[] cb;
	Class_lb db;
	private int eb;
	boolean fb;
	private short[] gb;
	static Class_ec hb = new Class_ec(1);
	private byte ib;
	private int jb;
	private int kb;
	int lb;
	int mb;
	private short[] nb;
	boolean ob;
	int pb;
	byte qb;
	short rb;
	int sb;
	static int tb;
	boolean ub;
	String npcName;
	private il wb;
	int xb;
	int yb;
	private int[] zb;*/

    public int a;
    private short[] b;
    public static int c;
    public String[] actions = new String[5];
    private byte e;
    public boolean f;
    public static fca g = new fca();
    public int h;
    public int i;
    public static int j;
    public static int k;
    private byte l;
    public boolean m = true;
    public byte n;
    public static int o;
    private short[] p;
    public boolean q;
    public static int r;
    public static int s;
    int t;
    private int u;
    public boolean v;
    public static int w;
    public int x;
    public byte y;
    public int z;
    public static int parseValues;
    public int B;
    public static int C;
    public byte D;
    public int E;
    public int npcID;
    public int[] G;
    private byte H;
    private int[][] I;
    private byte[] J;
    public static int K;
    public int[] L;
    public int combatLevel;
    public boolean N;
    public int O;
    private int P;
    public int Q;
    public static int R;
    private int[][] S;
    public int T;
    public int U;
    public short V;
    public static int W;
    public int X;
    private int Y;
    public byte Z;
    public int ab;
    public int bb;
    private int[] cb;
    public Class_lb db;
    private int eb;
    public boolean fb;
    private short[] gb;
    public static Class_ec hb = new Class_ec(1);
    private byte ib;
    private int jb;
    private int kb;
    public int lb;
    public int mb;
    private short[] nb;
    public boolean ob;
    public int pb;
    public byte qb;
    public short rb;
    public int sb;
    public static int tb;
    public boolean ub;
    public String npcName;
    private il wb;
    public int xb;
    public int yb;
    private int[] zb;

    public final void a(int i) {
        if (this.D == -1) {
            if (this.db.k == wa.t) {
                this.D = (byte) 1;
            } else {
                this.D = (byte) 0;
            }
        }
        C++;
        if (cb == null) {
            cb = new int[0];
        }
        if (i != 16) {
            I = null;
        }
    }

    public static void a(int i, int j) {
        po.b++;
        K++;
        tba tba = jga.sendGameOutPacket(ek.outgoingPacket64, pca.isaac, (byte) 114);
        tba.loginStream.writeShortReversed(103, i);
        tba.loginStream.writeIntShiftsInOrder_8_0_24_16(j, 123);
        ud.a(tba, (byte) -36);
    }

    public final NPCDef a(int i, haa haa) {
        if (i != -4261) {
            H = (byte) 58;
        }
        R++;
        int j = -1;
        if (P == -1) {
            if (u != -1) {
                j = haa.getClientVarp(u, -100);
            }
        } else {
            j = haa.getClientVarpBit(113, P);
        }
        if (j < 0 || j >= this.L.length - 1 || this.L[j] == -1) {
            int npcId = this.L[this.L.length - 1];
            if (npcId != -1) {
                return this.db.getNPCDef(npcId, (byte) -125);
            }
            return null;
        }
        return this.db.getNPCDef(this.L[j], (byte) -111);
    }

    private void parseValue(byte b, BytesParser bytesParser, int valueID) {
        j++;
        if (valueID != 1) {
            if (valueID != 2) {
                if (valueID == 12) {
                    this.Q = bytesParser.readUnsignedByte(-9268);
                } else if (valueID >= 30 && valueID < 35) {
                    this.actions[valueID - 30] = bytesParser.readString((byte) 126);
                } else if (valueID != 40) {
                    if (valueID == 41) {
                        int i = bytesParser.readUnsignedByte(-9268);
                        this.b = new short[i];
                        nb = new short[i];
                        for (int index = 0; i > index; index++) {
                            nb[index] = (short) bytesParser.readShort(13111);
                            this.b[index] = (short) bytesParser.readShort(13111);
                        }
                    } else if (valueID != 42) {
                        if (valueID == 60) {
                            int j = bytesParser.readUnsignedByte(-9268);
                            zb = new int[j];
                            for (int index = 0; j > index; index++) {
                                zb[index] = bytesParser.readShort(13111);
                            }
                        } else if (valueID != 93) {
                            if (valueID != 95) {
                                if (valueID == 97) {
                                    jb = bytesParser.readShort(b ^ 0x336b);
                                } else if (valueID != 98) {
                                    if (valueID == 99) {
                                        this.q = true;
                                    } else if (valueID != 100) {
                                        if (valueID != 101) {
                                            if (valueID != 102) {
                                                if (valueID == 103) {
                                                    this.U = bytesParser.readShort(b ^ 0x336b);
                                                } else if (valueID != 106 && valueID != 118) {
                                                    if (valueID == 107) {
                                                        this.m = false;
                                                    } else if (valueID == 109) {
                                                        this.fb = false;
                                                    } else if (valueID == 111) {
                                                        this.f = false;
                                                    } else if (valueID == 113) {
                                                        this.V = (short) (bytesParser.readShort(13111));
                                                        this.rb = (short) (bytesParser.readShort(13111));
                                                    } else if (valueID != 114) {
                                                        if (valueID == 119) {
                                                            this.y = (bytesParser.readByte(-20933));
                                                        } else if (valueID == 121) {
                                                            I = (new int[cb.length][]);
                                                            int i1 = (bytesParser.readUnsignedByte(-9268));
                                                            for (int index = 0; i1 > index; index++) {
                                                                int j1 = (bytesParser.readUnsignedByte(-9268));
                                                                int[] buf = (I[j1] = (new int[3]));
                                                                buf[0] = (bytesParser.readByte(-20933));
                                                                buf[1] = (bytesParser.readByte(-20933));
                                                                buf[2] = (bytesParser.readByte(-20933));
                                                            }
                                                        } else if (valueID == 122) {
                                                            this.yb = (bytesParser.readShort(13111));
                                                        } else if (valueID == 123) {
                                                            this.xb = (bytesParser.readShort(13111));
                                                        } else if (valueID != 125) {
                                                            if (valueID == 127) {
                                                                this.x = (bytesParser.readShort(b + 13019));
                                                            } else if (valueID != 128) {
                                                                if (valueID != 134) {
                                                                    if (valueID == 135) {
                                                                        this.a = bytesParser.readUnsignedByte(-9268);
                                                                        this.B = bytesParser.readShort(b ^ 0x336b);
                                                                    } else if (valueID != 136) {
                                                                        if (valueID != 137) {
                                                                            if (valueID != 138) {
                                                                                if (valueID == 139) {
                                                                                    this.E = bytesParser.readShort(13111);
                                                                                } else if (valueID != 140) {
                                                                                    if (valueID == 141) {
                                                                                        this.ub = true;
                                                                                    } else if (valueID != 142) {
                                                                                        if (valueID != 143) {
                                                                                            if (valueID < 150 || valueID >= 155) {
                                                                                                if (valueID != 155) {
                                                                                                    if (valueID != 158) {
                                                                                                        if (valueID == 159) {
                                                                                                            this.D = (byte) 0;
                                                                                                        } else if (valueID != 160) {
                                                                                                            if (valueID != 162) {
                                                                                                                if (valueID != 163) {
                                                                                                                    if (valueID == 249) {
                                                                                                                        int i1 = bytesParser.readUnsignedByte(b ^ ~0x246f);
                                                                                                                        if (wb == null) {
                                                                                                                            int j1 = dfa.a(i1, 128);
                                                                                                                            wb = new il(j1);
                                                                                                                        }
                                                                                                                        for (int count = 0; i1 > count; count++) {
                                                                                                                            boolean bool = bytesParser.readUnsignedByte(-9268) == 1;
                                                                                                                            int j1 = bytesParser.readTribyte(-1);
                                                                                                                            Node node;
                                                                                                                            if (bool) {
                                                                                                                                node = new Node_Sub(bytesParser.readString((byte) 125));
                                                                                                                            } else {
                                                                                                                                node = new GameInPacketHandler(bytesParser.readInt(b ^ 0x20));
                                                                                                                            }
                                                                                                                            wb.a(node, (byte) -84, (long) j1);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    this.O = bytesParser.readUnsignedByte(b - 9360);
                                                                                                                }
                                                                                                            } else {
                                                                                                                this.v = true;
                                                                                                            }
                                                                                                        } else {
                                                                                                            int i1 = bytesParser.readUnsignedByte(-9268);
                                                                                                            this.G = new int[i1];
                                                                                                            for (int index = 0; i1 > index; index++) {
                                                                                                                this.G[index] = bytesParser.readShort(13111);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        this.D = (byte) 1;
                                                                                                    }
                                                                                                } else {
                                                                                                    e = bytesParser.readByte(b ^ ~0x5198);
                                                                                                    l = bytesParser.readByte(-20933);
                                                                                                    H = bytesParser.readByte(-20933);
                                                                                                    ib = bytesParser.readByte(b - 21025);
                                                                                                }
                                                                                            } else {
                                                                                                this.actions[valueID - 150] = bytesParser.readString((byte) 120);
                                                                                                if (!this.db.c) {
                                                                                                    this.actions[valueID - 150] = null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            this.N = true;
                                                                                        }
                                                                                    } else {
                                                                                        this.z = bytesParser.readShort(b ^ 0x336b);
                                                                                    }
                                                                                } else {
                                                                                    this.h = bytesParser.readUnsignedByte(-9268);
                                                                                }
                                                                            } else {
                                                                                this.i = bytesParser.readShort(13111);
                                                                            }
                                                                        } else {
                                                                            this.mb = bytesParser.readShort(13111);
                                                                        }
                                                                    } else {
                                                                        this.X = bytesParser.readUnsignedByte(b - 9360);
                                                                        this.T = bytesParser.readShort(13111);
                                                                    }
                                                                } else {
                                                                    this.lb = (bytesParser.readShort(13111));
                                                                    if ((this.lb) == 65535) {
                                                                        this.lb = -1;
                                                                    }
                                                                    this.ab = (bytesParser.readShort(13111));
                                                                    if ((this.ab) == 65535) {
                                                                        this.ab = -1;
                                                                    }
                                                                    this.t = (bytesParser.readShort(13111));
                                                                    if ((this.t) == 65535) {
                                                                        this.t = -1;
                                                                    }
                                                                    this.sb = (bytesParser.readShort(13111));
                                                                    if ((this.sb) == 65535) {
                                                                        this.sb = -1;
                                                                    }
                                                                    this.pb = (bytesParser.readUnsignedByte(-9268));
                                                                }
                                                            } else {
                                                                bytesParser.readUnsignedByte(-9268);
                                                            }
                                                        } else {
                                                            this.Z = (bytesParser.readByte(-20933));
                                                        }
                                                    } else {
                                                        this.n = bytesParser.readByte(-20933);
                                                        this.qb = bytesParser.readByte(-20933);
                                                    }
                                                } else {
                                                    P = bytesParser.readShort(13111);
                                                    if (P == 65535) {
                                                        P = -1;
                                                    }
                                                    u = bytesParser.readShort(b ^ 0x336b);
                                                    if (u == 65535) {
                                                        u = -1;
                                                    }
                                                    int id = -1;
                                                    if (valueID == 118) {
                                                        id = bytesParser.readShort(13111);
                                                        if (id == 65535) {
                                                            id = -1;
                                                        }
                                                    }
                                                    int i1 = bytesParser.readUnsignedByte(-9268);
                                                    this.L = new int[i1 + 2];
                                                    for (int index = 0; i1 >= index; index++) {
                                                        this.L[index] = bytesParser.readShort(13111);
                                                        if ((this.L[index]) == 65535) {
                                                            this.L[index] = -1;
                                                        }
                                                    }
                                                    this.L[i1 + 1] = id;
                                                }
                                            } else {
                                                this.bb = bytesParser.readShort(b + 13019);
                                            }
                                        } else {
                                            eb = bytesParser.readByte(-20933) * 5;
                                        }
                                    } else {
                                        Y = bytesParser.readByte(-20933);
                                    }
                                } else {
                                    kb = bytesParser.readShort(13111);
                                }
                            } else {
                                this.combatLevel = bytesParser.readShort(13111);
                            }
                        } else {
                            this.ob = false;
                        }
                    } else {
                        int i1 = bytesParser.readUnsignedByte(-9268);
                        J = new byte[i1];
                        for (int index = 0; index < i1; index++) {
                            J[index] = bytesParser.readByte(-20933);
                        }
                    }
                } else {
                    int i1 = bytesParser.readUnsignedByte(-9268);
                    gb = new short[i1];
                    p = new short[i1];
                    for (int index = 0; index < i1; index++) {
                        p[index] = (short) bytesParser.readShort(13111);
                        gb[index] = (short) bytesParser.readShort(13111);
                    }
                }
            } else {
                this.npcName = bytesParser.readString((byte) 121);
            }
        } else {
            int i1 = bytesParser.readUnsignedByte(-9268);
            cb = new int[i1];
            for (int index = 0; i1 > index; index++) {
                cb[index] = bytesParser.readShort(mv.a(b, 13163));
                if (cb[index] == 65535) {
                    cb[index] = -1;
                }
            }
        }
        if (b != 92) {
            this.yb = -119;
        }
    }

    public final void parseValues(BytesParser bytesParser, boolean bool) {
        for (; ; ) {
            int valueID = bytesParser.readUnsignedByte(-9268);
            if (valueID == 0) {
                break;
            }
            parseValue((byte) 92, bytesParser, valueID);
        }
        if (!bool) {
            l = (byte) -127;
        }
        parseValues++;
    }

    public static void nullLoader(int i) {
        hb = null;
        g = null;
        if (i > -83) {
            a(false);
        }
    }

    public final String a(byte b, String string, int id) {
        c++;
        if (wb == null) {
            return string;
        }
        Node_Sub aa = (Node_Sub) wb.a(-32748, (long) id);
        if (aa == null) {
            return string;
        }
        return aa.m;
    }

    public final boolean a(byte b, haa haa) {
        w++;
        if (this.L == null) {
            return true;
        }
        if (b != -33) {
            eb = -124;
        }
        int i = -1;
        if ((~P) != 0) {
            i = haa.getClientVarpBit(127, P);
        } else if ((~u) != 0) {
            i = haa.getClientVarp(u, b + 144);
        }
        if (i < 0 || this.L.length - 1 <= i || (~this.L[i]) == 0) {
            int j = this.L[this.L.length - 1];
            if (j == -1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void a(Class_r class_r, Interface interface_, int i) {
        if (i > -116) {
            nullLoader(-19);
        }
        tb++;
        boolean bool = (laa.itemDefLoader.a(~0xffffff | interface_.shadowColor, interface_.itemID, interface_.ib ? up.thisPlayer.playerDef : null,
                class_r, interface_.itemStackSize, interface_.borderThickness, 123, interface_.Rc) == null);
        if (bool) {
            iga.j.b(new wq(interface_.itemID, interface_.itemStackSize, interface_.borderThickness, interface_.shadowColor | ~0xffffff,
                    interface_.Rc, interface_.ib), (byte) 93);
            tn.a(interface_, 1023);
        }
    }

    public final da a(int i, int j, int k, wca wca, int i1, int j1, dr dr, int k1, int i2, dr dr1, hl hl, int mask, an[] ans, Class_r class_r
            , haa haa) {
        s++;
        if (this.L != null) {
            NPCDef npcDef = a(-4261, haa);
            if (npcDef == null) {
                return null;
            }
            return npcDef.a(i, j, k, wca, i1, j1, dr, 13770, i2, dr1, hl, mask, ans, class_r, haa);
        }
        int mask_ = mask;
        if (kb != 128) {
            mask_ |= 0x2;
        }
        if (jb != 128) {
            mask_ |= 0x5;
        }
        boolean isDR = dr1 != null || dr != null;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        int length = ans == null ? 0 : ans.length;
        for (int index = 0; index < length; index++) {
            qc.a[index] = null;
            if (ans[index] != null) {
                dr dr2 = hl.c(64, ans[index].c);
                if (dr2.p != null) {
                    isDR = true;
                    wd.y[index] = dr2;
                    int j2 = ans[index].d;
                    int k2 = ans[index].g;
                    int i3 = dr2.p[j2];
                    qc.a[index] = hl.b(i3 >>> 16, 88);
                    i3 &= 0xffff;
                    Class_mc.l[index] = i3;
                    if (qc.a[index] != null) {
                        flag2 |= qc.a[index].a(i3, k1 - 13770);
                        flag1 |= qc.a[index].a(i3, (byte) -120);
                        flag4 |= qc.a[index].a((byte) -101, i3);
                        flag3 |= dr2.n;
                    }
                    if ((dr2.z || vm.isTweening) && k2 != -1 && dr2.p.length > k2) {
                        aaa.u[index] = dr2.B[j2];
                        Animable.r[index] = ans[index].b;
                        int j3 = dr2.p[k2];
                        lu.l[index] = hl.b(j3 >>> 16, -118);
                        j3 &= 0xffff;
                        vs.A[index] = j3;
                        if (lu.l[index] != null) {
                            flag2 |= lu.l[index].a(j3, 0);
                            flag1 |= lu.l[index].a(j3, (byte) -111);
                            flag4 |= lu.l[index].a((byte) -101, j3);
                        }
                    } else {
                        aaa.u[index] = 0;
                        Animable.r[index] = 0;
                        lu.l[index] = null;
                        vs.A[index] = -1;
                    }
                }
            }
        }
        int j2 = -1;
        int k2 = -1;
        int i3 = 0;
        wa wa = null;
        wa wa1 = null;
        int j3 = -1;
        int k3 = -1;
        int i4 = 0;
        wa wa2 = null;
        wa wa3 = null;
        if (isDR) {
            if (dr1 != null) {
                j2 = dr1.p[i];
                int j4 = j2 >>> 16;
                j2 &= 0xffff;
                wa = hl.b(j4, -120);
                if (wa != null) {
                    flag2 |= wa.a(j2, 0);
                    flag1 |= wa.a(j2, (byte) -45);
                    flag4 |= wa.a((byte) -101, j2);
                    flag3 |= dr1.n;
                }
                if ((dr1.z || vm.isTweening) && (~k) != 0 && dr1.p.length > k) {
                    k2 = dr1.p[k];
                    i3 = dr1.B[i];
                    int k4 = k2 >>> 16;
                    if (k4 != j4) {
                        wa1 = hl.b(k4, 43);
                    } else {
                        wa1 = wa;
                    }
                    k2 &= 0xffff;
                    if (wa1 != null) {
                        flag2 |= wa1.a(k2, 0);
                        flag1 |= wa1.a(k2, (byte) -120);
                        flag4 |= wa1.a((byte) -101, k2);
                    }
                }
            }
            mask_ |= 0x20;
            if (dr != null) {
                j3 = dr.p[i2];
                int j4 = j3 >>> 16;
                j3 &= 0xffff;
                wa2 = hl.b(j4, -111);
                if (wa2 != null) {
                    flag2 |= wa2.a(j3, 0);
                    flag1 |= wa2.a(j3, (byte) -95);
                    flag4 |= wa2.a((byte) -101, j3);
                    flag3 |= dr.n;
                }
                if ((dr.z || vm.isTweening) && i1 != -1 && i1 < dr.p.length) {
                    i4 = dr.B[i2];
                    k3 = dr.p[i1];
                    int k4 = k3 >>> 16;
                    k3 &= 0xffff;
                    if (j4 == k4) {
                        wa3 = wa2;
                    } else {
                        wa3 = hl.b(k4, k1 ^ 0x35b3);
                    }
                    if (wa3 != null) {
                        flag2 |= wa3.a(k3, 0);
                        flag1 |= wa3.a(k3, (byte) -97);
                        flag4 |= wa3.a((byte) -101, k3);
                    }
                }
            }
            if (flag2) {
                mask_ |= 0x80;
            }
            if (flag1) {
                mask_ |= 0x100;
            }
            if (flag3) {
                mask_ |= 0x200;
            }
            if (flag4) {
                mask_ |= 0x400;
            }
        }
        da da;
        synchronized (this.db.n) {
            da = (da) this.db.n.get((long) (this.npcID | (class_r.b << 16)), (byte) 100);
        }
        if (da == null || (mask_ & da.PA()) != mask_) {
            if (da != null) {
                mask_ |= da.PA();
            }
            int mask_1 = mask_;
            boolean bool = false;
            synchronized (this.db.e) {
                for (int index = 0; cb.length > index; index++) {
                    if ((~cb[index]) != 0 && !this.db.e.a(0,(byte) 82, cb[index])) {
                        bool = true;
                    }
                }
            }
            if (bool) {
                return null;
            }
            eg[] egs = new eg[cb.length];
            for (int index = 0; index < cb.length; index++) {
                if (cb[index] != -1) {
                    synchronized (this.db.e) {
                        egs[index] = efa.a(cb[index], this.db.e, 0, false);
                    }
                    if (egs[index] != null) {
                        if (egs[index].bb < 13) {
                            egs[index].a((byte) -107, 2);
                        }
                        if (I != null && I[index] != null) {
                            egs[index].a(I[index][2], (byte) 110, I[index][0], I[index][1]);
                        }
                    }
                }
            }
            cg cg = null;
            if (this.x != -1) {
                cg = wca.a(this.x, (byte) 55);
            }
            if (cg != null && cg.y != null) {
                for (int index = 0; cg.y.length > index; index++) {
                    if (cg.y[index] != null && egs.length > index && egs[index] != null) {
                        int j4 = cg.y[index][0];
                        int k4 = cg.y[index][1];
                        int i5 = cg.y[index][2];
                        int j5 = cg.y[index][3] << 3;
                        int k5 = cg.y[index][4] << 3;
                        int i6 = cg.y[index][5] << 3;
                        if (S == null) {
                            S = new int[cg.y.length][];
                        }
                        if (S[index] == null) {
                            int[] buf = S[index] = new int[15];
                            if (j5 == 0 && k5 == 0 && i6 == 0) {
                                buf[12] = -j4;
                                buf[14] = -i5;
                                buf[0] = buf[4] = buf[8] = 32768;
                                buf[13] = -k4;
                            } else {
                                int j6 = GameInPacket.ints2[j5];
                                int k6 = GameInPacket.ints1[j5];
                                int i7 = GameInPacket.ints2[k5];
                                int j7 = GameInPacket.ints1[k5];
                                int k7 = GameInPacket.ints2[i6];
                                int i8 = GameInPacket.ints1[i6];
                                int j8 = k6 * k7 + 8192 >> 14;
                                int k8 = k6 * i8 + 8192 >> 14;
                                buf[4] = k7 * j6 + 8192 >> 14;
                                buf[1] = i7 * -i8 + (j7 * j8 + 8192) >> 14;
                                buf[2] = j7 * j6 + 8192 >> 14;
                                buf[8] = i7 * j6 + 8192 >> 14;
                                buf[7] = (-j7 * -i8 + i7 * j8 + 8192 >> 14);
                                buf[5] = -k6;
                                buf[0] = (j7 * k8 + k7 * i7 + 8192 >> 14);
                                buf[3] = i8 * j6 + 8192 >> 14;
                                buf[6] = k8 * i7 + (k7 * -j7 + 8192) >> 14;
                                buf[14] = (buf[5] * -k4 + -j4 * buf[2] + buf[8] * -i5 + 8192) >> 14;
                                buf[12] = (buf[6] * -i5 + 8192 + buf[0] * -j4 + -k4 * buf[3]) >> 14;
                                buf[13] = (buf[4] * -k4 + buf[1] * -j4 + -i5 * buf[7] + 8192) >> 14;
                            }
                            buf[11] = i5;
                            buf[10] = k4;
                            buf[9] = j4;
                        }
                        if (j5 != 0 || k5 != 0 || i6 != 0) {
                            egs[index].b(j5, k1 ^ 0x7fb6, i6, k5);
                        }
                        if (j4 != 0 || k4 != 0 || i5 != 0) {
                            egs[index].a(i5, (byte) 123, j4, k4);
                        }
                    }
                }
            }
            eg eg;
            if (egs.length == 1) {
                eg = egs[0];
            } else {
                eg = new eg(egs, egs.length);
            }
            if (p != null) {
                mask_1 |= 0x4000;
            }
            if (nb != null) {
                mask_1 |= 0x8000;
            }
            if (ib != 0) {
                mask_1 |= 0x80000;
            }
            da = class_r.a(eg, mask_1, this.db.q, 64 + Y, eb + 850);
            if (p != null) {
                for (int index = 0; p.length > index; index++) {
                    if (J == null || index >= J.length) {
                        da.d(p[index], gb[index]);
                    } else {
                        da.d(p[index], qn.l[0xff & J[index]]);
                    }
                }
            }
            if (nb != null) {
                for (int index = 0; index < nb.length; index++) {
                    da.DA(nb[index], b[index]);
                }
            }
            if (ib != 0) {
                da.a(e, l, H, ib & 0xff);
            }
            da.SA(mask_);
            synchronized (this.db.n) {
                this.db.n.put((long) ((class_r.b << 16) | this.npcID), da, 1);
            }
        }
        da da1 = da.a((byte) 4, mask_, true);
        if (!isDR) {
            return da1;
        }
        if (k1 != 13770) {
            a(-62, null);
        }
        int j4 = 0;
        int k4 = 1;
        for (/**/; j4 < length; j4++) {
            if (qc.a[j4] != null) {
                da1.a((byte) 121, lu.l[j4], Animable.r[j4] - 1, 0, Class_mc.l[j4], S[j4], k4, vs.A[j4], wd.y[j4].n, aaa.u[j4], qc.a[j4]);
            }
            k4 <<= 1;
        }
        if (wa != null && wa2 != null) {
            da1.a(wa1, j2, wa3, j1 - 1, k2, wa2, i4, dr1.a, j - 1, i3, dr.n | dr1.n, j3, wa, k1 - 13862, k3);
        } else if (wa == null) {
            if (wa2 != null) {
                da1.a(dr.n, (byte) -11, wa2, k3, j3, wa3, j - 1, 0, i4);
            }
        } else {
            da1.a(dr1.n, (byte) -11, wa, k2, j2, wa1, j1 - 1, 0, i3);
        }
        for (int index = 0; index < length; index++) {
            qc.a[index] = null;
            lu.l[index] = null;
            wd.y[index] = null;
        }
        if (jb != 128 || kb != 128) {
            da1.R(jb, kb, jb);
        }
        da1.SA(mask);
        return da1;
    }

    public final da a(haa haa, int mask, byte b, dr dr, int j, hl hl, int k, Class_r class_r, int i1) {
        NPCDef.k++;
        if (this.L != null) {
            NPCDef npcDef = a(-4261, haa);
            if (npcDef == null) {
                return null;
            }
            return npcDef.a(haa, mask, (byte) 71, dr, j, hl, k, class_r, i1);
        }
        if (zb == null) {
            return null;
        }
        int mask_ = mask;
        if (dr != null && (~i1) != 0) {
            mask_ |= dr.a(1024, j, true, i1);
        }
        da da;
        synchronized (this.db.p) {
            da = ((da) this.db.p.get((long) ((class_r.b) << 16 | this.npcID), (byte) 100));
        }
        if (da == null || mask_ != (da.PA() & mask_)) {
            if (da != null) {
                mask_ |= da.PA();
            }
            int mask_1 = mask_;
            boolean bool = false;
            synchronized (this.db.e) {
                for (int index = 0; zb.length > index; index++) {
                    if (!this.db.e.a(0, (byte) 120, zb[index])) {
                        bool = true;
                    }
                }
            }
            if (bool) {
                return null;
            }
            eg[] egs = new eg[zb.length];
            synchronized (this.db.e) {
                for (int index = 0; zb.length > index; index++) {
                    egs[index] = efa.a(zb[index], this.db.e, 0, false);
                }
            }
            for (int index = 0; index < zb.length; index++) {
                if (egs[index] != null && egs[index].bb < 13) {
                    egs[index].a((byte) -107, 2);
                }
            }
            eg eg;
            if (egs.length != 1) {
                eg = new eg(egs, egs.length);
            } else {
                eg = egs[0];
            }
            if (p != null) {
                mask_1 |= 0x4000;
            }
            if (nb != null) {
                mask_1 |= 0x8000;
            }
            if (ib != 0) {
                mask_1 |= 0x80000;
            }
            da = class_r.a(eg, mask_1, this.db.q, 64, 768);
            if (p != null) {
                for (int index = 0; p.length > index; index++) {
                    if (J != null && J.length > index) {
                        da.d(p[index], qn.l[J[index] & 0xff]);
                    } else {
                        da.d(p[index], gb[index]);
                    }
                }
            }
            if (nb != null) {
                for (int index = 0; index < nb.length; index++) {
                    da.DA(nb[index], this.b[index]);
                }
            }
            if (ib != 0) {
                da.a(e, l, H, 0xff & ib);
            }
            da.SA(mask_);
            synchronized (this.db.p) {
                this.db.p.put((long) ((class_r.b << 16) | this.npcID), da, 1);
            }
        }
        if (dr != null && i1 != -1) {
            da = dr.a(i1, mask_, (byte) 123, k, j, da);
        }
        da.SA(mask);
        if (b != 71) {
            return null;
        }
        return da;
    }

    public static void a(boolean bool) {
        em.c.d(2);
        o++;
        hj.h.d(2);
        bfa bfa = (bfa) oba.I.a(123);
        if (!bool) {
            g = null;
        }
        for (/**/; bfa != null; bfa = (bfa) oba.I.b((byte) 54)) {
            int i = bfa.v;
            if (i < 1000) {
                bfa.unlink(-55);
                if (i != 30 && i != 19 && i != 20 && i != 48 && i != 4 && i != 2 && i != 45) {
                    em.c.b(bfa, (byte) 93);
                } else {
                    hj.h.b(bfa, (byte) 93);
                }
            }
        }
        em.c.a((byte) -84, oba.I);
        hj.h.a((byte) -84, oba.I);
        if (mu.j <= 1) {
            um.b = null;
        } else if (vh.shiftClickEnabled && uc.c.a((byte) -68, 81) && mu.j > 2) {
            um.b = (bfa) oba.I.o.next.next;
        } else {
            um.b = (bfa) oba.I.o.next;
        }
        int i = -1;
        ew ew = (ew) qt.F.a(101);
        if (ew != null) {
            i = ew.b(false);
        }
        if (!gea.n) {
            if (i == 0 && (ik.r == 1 && mu.j > 2 || pl.c(false))) {
                i = 2;
            }
            if (i == 2 && mu.j > 0 && ew != null) {
                if (kr.a != null || bg.e != 0) {
                    Class_ad.h = 2;
                } else {
                    Connection.a(ew.a(9), ew.a(true));
                }
            }
            if (i == 0 && mu.j > 0) {
                iga.b(2);
            }
            if (kr.a == null && bg.e == 0) {
                Class_ad.h = 0;
                ej.q = null;
            }
        } else {
            if ((~i) == 0) {
                int j = Class_md.e.d(2000);
                int k = Class_md.e.b(100);
                if (j < mr.x_ - 10 || j > mr.x_ + 10 + aw.option || k < hn.y_ - 10 || hn.y_ - (-lfa.r - 10) < k) {
                    eq.b(-8234);
                }
            }
            if (i == 0) {
                int j = mr.x_;
                int k = hn.y_;
                int i1 = aw.option;
                int j1 = ew.a(9);
                int k1 = ew.a(true);
                int i2 = -1;
                for (int j2 = 0; j2 < mu.j; j2++) {
                    if (lq.hb) {
                        int k2 = k + 33 + (mu.j - (j2 + 1)) * 16;
                        if (j < j1 && j1 < i1 + j && k2 - 13 < k1 && k1 < k2 + 4) {
                            i2 = j2;
                        }
                    } else {
                        int k2 = 16 * (mu.j - 1 - j2) + k + 31;
                        if (j1 > j && i1 + j > j1 && k2 - 13 < k1 && k2 + 3 > k1) {
                            i2 = j2;
                        }
                    }
                }
                if (i2 != -1) {
                    int j2 = 0;
                    sq sq = new sq(oba.I);
                    for (bfa bfa1 = (bfa) sq.b(102); bfa1 != null; bfa1 = (bfa) sq.a(-15840)) {
                        if (j2 == i2) {
                            un.a(0, k1, bfa1, j1);
                        }
                        j2++;
                    }
                }
                eq.b(-8234);
            }
        }
    }

    public final boolean a(byte b) {
        W++;
        if (this.L == null) {
            if ((~this.lb) == 0 && this.t == -1 && (~this.sb) == 0) {
                return false;
            }
            return true;
        }
        for (int index = 0; index < this.L.length; index++) {
            if ((~this.L[index]) != 0) {
                NPCDef npcDef = this.db.getNPCDef(this.L[index], (byte) -116);
                if (npcDef.lb != -1 || npcDef.t != -1 || npcDef.sb != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int a(int i, int j, boolean bool) {
        if (bool) {
            l = (byte) -116;
        }
        r++;
        if (wb == null) {
            return i;
        }
        GameInPacketHandler inPacketHandler = (GameInPacketHandler) wb.a(-32748, (long) j);
        if (inPacketHandler == null) {
            return i;
        }
        return inPacketHandler.k;
    }

    public NPCDef() {
        this.f = true;
        this.t = -1;
        this.z = -1;
        this.h = 255;
        this.x = -1;
        this.q = false;
        this.D = (byte) -1;
        this.y = (byte) 0;
        this.N = false;
        P = -1;
        this.X = -1;
        this.T = -1;
        this.ab = -1;
        this.B = -1;
        u = -1;
        this.E = -1;
        this.Q = 1;
        this.a = -1;
        this.V = (short) 0;
        Y = 0;
        this.i = -1;
        eb = 0;
        this.lb = -1;
        this.pb = 0;
        this.n = (byte) -96;
        jb = 128;
        this.ob = true;
        this.rb = (short) 0;
        this.mb = -1;
        this.bb = -1;
        ib = (byte) 0;
        kb = 128;
        this.qb = (byte) -16;
        this.npcName = "null";
        this.ub = false;
        this.combatLevel = -1;
        this.sb = -1;
        this.O = -1;
        this.U = 32;
        this.fb = true;
        this.yb = -1;
        this.Z = (byte) 4;
        this.xb = -1;
    }
}
