/* uv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.Dimension;

public final class ItemDef {

    static int a;
    static int b;
    static int c;
    il d;
    private int e;
    static int f;
    static int g;
    private int h = -1;
    int i;
    boolean isMembersItem;
    String itemName;
    static int l;
    private int m;
    int n;
    int o = -1;
    String[] groundActions;
    private int q;
    private int r;
    static int s;
    static int t;
    private int u;
    static int v;
    static int w;
    private int x;
    private int y;
    int z;
    static int A;
    int B;
    private int C;
    String[] actions;
    private int E;
    static int F;
    int G;
    private int H;
    private int I;
    int J;
    int K;
    int L;
    static int M;
    private int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    int S;
    static int T;
    private int U;
    private int V;
    static int parseValueCount;
    int[] X;
    boolean Y;
    int Z;
    static int ab;
    ItemDefLoader loader;
    private short[] cb;
    int db;
    int[] eb;
    int fb;
    private short[] gb;
    private int hb;
    private int ib;
    static int jb;
    int kb;
    private int lb;
    int stackable;
    int nb;
    private short[] ob;
    int pb;
    int qb;
    private int rb;
    static int sb;
    private short[] tb;
    int ub;
    int vb;
    int wb;
    int value;
    int certID;
    static int zb;
    int Ab;
    int Bb;
    private byte[] Cb;
    private int Db;
    int Eb;
    int[] Fb;
    static int Gb;

    private void parseValue(BytesParser bytesParser, byte b, int actions) {
        if (b >= -101) {
            a((byte) 13, false);
        }
        if (actions != 1) {
            if (actions != 2) {
                if (actions == 4) {
                    this.pb = bytesParser.readShort(13111);
                } else if (actions == 5) {
                    this.z = bytesParser.readShort(13111);
                } else if (actions == 6) {
                    this.Bb = bytesParser.readShort(13111);
                } else if (actions != 7) {
                    if (actions != 8) {
                        if (actions != 11) {
                            if (actions == 12) {
                                this.value = bytesParser.readInt(111);
                            } else if (actions != 16) {
                                if (actions != 18) {
                                    if (actions != 23) {
                                        if (actions != 24) {
                                            if (actions == 25) {
                                                this.J = bytesParser.readShort(13111);
                                            } else if (actions != 26) {
                                                if (actions >= 30 && actions < 35) {
                                                    this.groundActions[actions - 30] = bytesParser.readString((byte) 119);
                                                } else if (actions >= 35 && actions < 40) {
                                                    this.actions[actions - 35] = bytesParser.readString((byte) 118);
                                                } else if (actions == 40) {
                                                    int index = bytesParser.readUnsignedByte(-9268);
                                                    ob = new short[index];
                                                    tb = new short[index];
                                                    for (int i = 0; i < index; i++) {
                                                        tb[i] = (short) (bytesParser.readShort(13111));
                                                        ob[i] = (short) (bytesParser.readShort(13111));
                                                    }
                                                } else if (actions != 41) {
                                                    if (actions == 42) {
                                                        int i = bytesParser.readUnsignedByte(-9268);
                                                        Cb = new byte[i];
                                                        for (int index = 0; index < i; index++) {
                                                            Cb[index] = (bytesParser.readByte(-20933));
                                                        }
                                                    } else if (actions != 65) {
                                                        if (actions != 78) {
                                                            if (actions != 79) {
                                                                if (actions != 90) {
                                                                    if (actions != 91) {
                                                                        if (actions == 92) {
                                                                            H = bytesParser.readShort(13111);
                                                                        } else if (actions == 93) {
                                                                            ib = bytesParser.readShort(13111);
                                                                        } else if (actions == 95) {
                                                                            this.nb = bytesParser.readShort(13111);
                                                                        } else if (actions == 96) {
                                                                            this.qb = bytesParser.readUnsignedByte(-9268);
                                                                        } else if (actions == 97) {
                                                                            this.certID = bytesParser.readShort(13111);
                                                                        } else if (actions != 98) {
                                                                            if (actions < 100 || actions >= 110) {
                                                                                if (actions == 110) {
                                                                                    u = bytesParser.readShort(13111);
                                                                                } else if (actions == 111) {
                                                                                    lb = bytesParser.readShort(13111);
                                                                                } else if (actions != 112) {
                                                                                    if (actions == 113) {
                                                                                        q = bytesParser.readByte(-20933);
                                                                                    } else if (actions != 114) {
                                                                                        if (actions != 115) {
                                                                                            if (actions != 121) {
                                                                                                if (actions != 122) {
                                                                                                    if (actions != 125) {
                                                                                                        if (actions == 126) {
                                                                                                            y = bytesParser.readByte(-20933) << 2;
                                                                                                            hb = bytesParser.readByte(-20933) << 2;
                                                                                                            x = bytesParser.readByte(-20933) << 2;
                                                                                                        } else if (actions == 127) {
                                                                                                            this.Eb = bytesParser.readUnsignedByte(-9268);
                                                                                                            this.i = bytesParser.readShort(13111);
                                                                                                        } else if (actions == 128) {
                                                                                                            this.kb = bytesParser.readUnsignedByte(-9268);
                                                                                                            this.fb = bytesParser.readShort(13111);
                                                                                                        } else if (actions == 129) {
                                                                                                            this.L = bytesParser.readUnsignedByte(-9268);
                                                                                                            this.vb = bytesParser.readShort(13111);
                                                                                                        } else if (actions != 130) {
                                                                                                            if (actions != 132) {
                                                                                                                if (actions == 249) {
                                                                                                                    int j = bytesParser.readUnsignedByte(-9268);
                                                                                                                    if (this.d == null) {
                                                                                                                        int k = dfa.a(j, 128);
                                                                                                                        this.d = new il(k);
                                                                                                                    }
                                                                                                                    for (int count = 0; count < j; count++) {
                                                                                                                        boolean bool = bytesParser.readUnsignedByte(-9268) == 1;
                                                                                                                        int id = bytesParser.readTribyte(-1);
                                                                                                                        Node node;
                                                                                                                        if (bool) {
                                                                                                                            node = new Node_Sub(bytesParser.readString((byte) 125));
                                                                                                                        } else {
                                                                                                                            node = new GameInPacketHandler(bytesParser.readInt(121));
                                                                                                                        }
                                                                                                                        this.d.a(node, (byte) -49, (long) id);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                int j = bytesParser.readUnsignedByte(-9268);
                                                                                                                this.eb = new int[j];
                                                                                                                for (int index = 0; index < j; index++) {
                                                                                                                    this.eb[index] = bytesParser.readShort(13111);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            this.db = bytesParser.readUnsignedByte(-9268);
                                                                                                            this.Z = bytesParser.readShort(13111);
                                                                                                        }
                                                                                                    } else {
                                                                                                        N = bytesParser.readByte(-20933) << 2;
                                                                                                        E = bytesParser.readByte(-20933) << 2;
                                                                                                        e = bytesParser.readByte(-20933) << 2;
                                                                                                    }
                                                                                                } else {
                                                                                                    this.n = bytesParser.readShort(13111);
                                                                                                }
                                                                                            } else {
                                                                                                this.K = bytesParser.readShort(13111);
                                                                                            }
                                                                                        } else {
                                                                                            this.wb = bytesParser.readUnsignedByte(-9268);
                                                                                        }
                                                                                    } else {
                                                                                        V = bytesParser.readByte(-20933) * 5;
                                                                                    }
                                                                                } else {
                                                                                    r = bytesParser.readShort(13111);
                                                                                }
                                                                            } else {
                                                                                if (this.Fb == null) {
                                                                                    this.X = new int[10];
                                                                                    this.Fb = new int[10];
                                                                                }
                                                                                this.Fb[actions - 100] = bytesParser.readShort(13111);
                                                                                this.X[actions - 100] = bytesParser.readShort(13111);
                                                                            }
                                                                        } else {
                                                                            this.o = bytesParser.readShort(13111);
                                                                        }
                                                                    } else {
                                                                        I = bytesParser.readShort(13111);
                                                                    }
                                                                } else {
                                                                    m = (bytesParser.readShort(13111));
                                                                }
                                                            } else {
                                                                Db = (bytesParser.readShort(13111));
                                                            }
                                                        } else {
                                                            rb = bytesParser.readShort(13111);
                                                        }
                                                    } else {
                                                        this.Y = true;
                                                    }
                                                } else {
                                                    int i = bytesParser.readUnsignedByte(-9268);
                                                    cb = new short[i];
                                                    gb = new short[i];
                                                    for (int index = 0; index < i; index++) {
                                                        gb[index] = (short) (bytesParser.readShort(13111));
                                                        cb[index] = (short) (bytesParser.readShort(13111));
                                                    }
                                                }
                                            } else {
                                                h = bytesParser.readShort(13111);
                                            }
                                        } else {
                                            U = bytesParser.readShort(13111);
                                        }
                                    } else {
                                        this.B = bytesParser.readShort(13111);
                                    }
                                } else {
                                    this.ub = bytesParser.readShort(13111);
                                }
                            } else {
                                this.isMembersItem = true;
                            }
                        } else {
                            this.stackable = 1;
                        }
                    } else {
                        this.Ab = bytesParser.readShort(13111);
                        if (this.Ab > 32767) {
                            this.Ab -= 65536;
                        }
                    }
                } else {
                    this.S = bytesParser.readShort(13111);
                    if (this.S > 32767) {
                        this.S -= 65536;
                    }
                }
            } else {
                this.itemName = bytesParser.readString((byte) 119);
            }
        } else {
            C = bytesParser.readShort(13111);
        }
        parseValueCount++;
    }

    public static ou a(Component component, int i) {
        if (i != 10) {
            return null;
        }
        c++;
        return new RSKeyListener(component);
    }

    public final void a(int i, BytesParser bytesParser) {
        for (; ; ) {
            int actions = bytesParser.readUnsignedByte(-9268);
            if (actions == 0) {
                break;
            }
            parseValue(bytesParser, (byte) -120, actions);
        }
        A++;
        if (i != 30035) {
            a(null, -11, false);
        }
    }

    private String getMoneyColorForAmount(byte b, int amount) {
        s++;
        if (amount < 100000) {
            return "<col=ffff00>" + amount + "</col>";
        }
        if (b < 82) {
            this.eb = null;
        }
        if (amount < 10000000) {
            return ("<col=ffffff>" + amount / 1000 + GameText.thousandMoneyLetter.getString(this.loader.i) + "</col>");
        }
        return ("<col=00ff80>" + amount / 1000000 + GameText.millionMoneyLetter.getString(this.loader.i) + "</col>");
    }

    public final eg a(boolean bool, int i) {
        T++;
        int j = this.B;
        if (i != -1) {
            return null;
        }
        int k = U;
        int i1 = rb;
        if (bool) {
            j = this.J;
            k = h;
            i1 = Db;
        }
        if ((~j) == 0) {
            return null;
        }
        eg eg = efa.a(j, this.loader.f, 0, false);
        if (eg.bb < 13) {
            eg.a((byte) -107, 2);
        }
        if ((~k) != 0) {
            eg eg1 = efa.a(k, this.loader.f, 0, false);
            if (eg1.bb < 13) {
                eg1.a((byte) -107, 2);
            }
            if (i1 != -1) {
                eg eg2 = efa.a(i1, this.loader.f, 0, false);
                if (eg2.bb < 13) {
                    eg2.a((byte) -107, 2);
                }
                eg[] egs = {eg, eg1, eg2};
                eg = new eg(egs, 3);
            } else {
                eg[] egs = {eg, eg1};
                eg = new eg(egs, 2);
            }
        }
        if (eg == null) {
            return null;
        }
        if (!bool && (N != 0 || E != 0 || e != 0)) {
            eg.a(e, (byte) 89, N, E);
        }
        if (bool && (y != 0 || hb != 0 || x != 0)) {
            eg.a(x, (byte) 112, y, hb);
        }
        if (tb != null) {
            for (int index = 0; index < tb.length; index++) {
                eg.a(tb[index], (byte) -65, ob[index]);
            }
        }
        if (gb != null) {
            for (int index = 0; index < gb.length; index++) {
                eg.a(gb[index], -82, cb[index]);
            }
        }
        return eg;
    }

    public final String a(String string, int id, boolean bool) {
        if (!bool) {
            a(20, (byte) -106, null);
        }
        F++;
        if (this.d == null) {
            return string;
        }
        Node_Sub aa = (Node_Sub) this.d.a(-32748, (long) id);
        if (aa == null) {
            return string;
        }
        return aa.m;
    }

    public final boolean a(boolean bool, byte b) {
        O++;
        if (b >= -17) {
            a(true, (byte) 21);
        }
        int i = m;
        int j = H;
        if (bool) {
            i = I;
            j = ib;
        }
        if (i == -1) {
            return true;
        }
        boolean bool1 = true;
        if (!this.loader.f.a(0, (byte) 116, i)) {
            bool1 = false;
        }
        if ((~j) != 0 && !this.loader.f.a(0, (byte) 64, j)) {
            bool1 = false;
        }
        return bool1;
    }

    public final int a(int id, int j, int k) {
        t++;
        if (this.d == null) {
            return j;
        }
        GameInPacketHandler inPacketHandler = (GameInPacketHandler) this.d.a(-32748, (long) id);
        if (inPacketHandler == null) {
            return j;
        }
        return inPacketHandler.k;
    }

    public static void a(int i, int j, int k, Class class_) {
        vf vf = ol.p[i][j][k];
        if (vf != null) {
            for (ida ida = vf.f; ida != null; ida = ida.d) {
                qda qda = ida.a;
                if (class_.isAssignableFrom(qda.getClass()) && qda.B == j && qda.x == k) {
                    mn.a(qda, false);
                    break;
                }
            }
        }
    }

    private int[] a(int i, int[] buf, byte b) {
        M++;
        if (b > -12) {
            return null;
        }
        int[] buf1 = new int[1152];
        int index = 0;
        for (int k = 0; k < 32; k++) {
            for (int i1 = 0; i1 < 36; i1++) {
                int j1 = buf[index];
                if (j1 == 0) {
                    if (i1 > 0 && buf[index - 1] != 0) {
                        j1 = i;
                    } else if (k <= 0 || buf[index - 36] == 0) {
                        if (i1 < 35 && buf[index + 1] != 0) {
                            j1 = i;
                        } else if (k < 31 && buf[index + 36] != 0) {
                            j1 = i;
                        }
                    } else {
                        j1 = i;
                    }
                }
                buf1[index++] = j1;
            }
        }
        return buf1;
    }

    private void a(int i, byte b, int[] buf) {
        if (b <= 45) {
            Cb = null;
        }
        zb++;
        for (int j = 31; j > 0; j--) {
            int k = 36 * j;
            for (int index = 35; index > 0; index--) {
                if (buf[index + k] == 0 && buf[index - 37 + k] != 0) {
                    buf[k + index] = i;
                }
            }
        }
    }

    public static boolean b(int i, int j, int k) {
        if (k != 5706) {
            a(null, -6);
        }
        Q++;
        if (j < 0 || i < 0 || tu.b[1].length <= j || tu.b[1][j].length <= i) {
            return false;
        }
        if ((tu.b[1][j][i] & 0x2) != 0) {
            return true;
        }
        return false;
    }

    public final void a(int i, ItemDef itemDef, ItemDef itemDef1) {
        ob = itemDef.ob;
        this.Ab = itemDef1.Ab;
        N = itemDef.N;
        rb = itemDef.rb;
        Db = itemDef.Db;
        I = itemDef.I;
        this.actions = new String[5];
        gb = itemDef.gb;
        this.wb = itemDef.wb;
        this.J = itemDef.J;
        x = itemDef.x;
        E = itemDef.E;
        this.groundActions = itemDef.groundActions;
        U = itemDef.U;
        y = itemDef.y;
        e = itemDef.e;
        this.S = itemDef1.S;
        cb = itemDef.cb;
        tb = itemDef.tb;
        this.z = itemDef1.z;
        this.nb = itemDef1.nb;
        this.itemName = itemDef.itemName;
        this.pb = itemDef1.pb;
        ib = itemDef.ib;
        C = itemDef1.C;
        Cb = itemDef.Cb;
        this.Bb = itemDef1.Bb;
        this.value = 0;
        this.isMembersItem = itemDef.isMembersItem;
        m = itemDef.m;
        hb = itemDef.hb;
        if (i != -22824) {
            cb = null;
        }
        H = itemDef.H;
        this.d = itemDef.d;
        this.B = itemDef.B;
        h = itemDef.h;
        l++;
        if (itemDef.actions != null) {
            for (int actions = 0; actions < 4; actions++) {
                this.actions[actions] = itemDef.actions[actions];
            }
        }
        this.actions[4] = GameText.discardText.getString(this.loader.i);
    }

    public final ItemDef a(int stackSize, int i) {
        Gb++;
        if (i != -2) {
            return null;
        }
        if (this.Fb != null && stackSize > 1) {
            int id = -1;
            for (int index = 0; index < 10; index++) {
                if (this.X[index] <= stackSize && this.X[index] != 0) {
                    id = this.Fb[index];
                }
            }
            if ((~id) != 0) {
                return this.loader.d(12388, id);
            }
        }
        return this;
    }

    public static void a(byte b) {
        jb++;
        up.B++;
        tba tba = jga.sendGameOutPacket(qga.outgoingPacket15, pca.isaac, (byte) 95);
        tba.loginStream.writeByte(0, (byte) -124);
        ud.a(tba, (byte) -36);
        if (b <= 18) {
            g = -106;
        }
    }

    public final int[] a(la la, int amount, boolean bool, PlayerDef playerDef, Class_r class_r, int j, int k, Class_r class_r1, int i1, int j1) {
        sb++;
        eg eg = efa.a(C, this.loader.f, 0, false);
        if (eg == null) {
            return null;
        }
        if (eg.bb < 13) {
            eg.a((byte) -107, 2);
        }
        if (tb != null) {
            for (int index = 0; tb.length > index; index++) {
                if (Cb != null && index < Cb.length) {
                    eg.a(tb[index], (byte) 37, ua.d[0xff & Cb[index]]);
                } else {
                    eg.a(tb[index], (byte) -69, ob[index]);
                }
            }
        }
        if (gb != null) {
            for (int index = 0; index < gb.length; index++) {
                eg.a(gb[index], -75, cb[index]);
            }
        }
        if (k < 74) {
            return null;
        }
        if (playerDef != null) {
            for (int k1 = 0; k1 < 5; k1++) {
                for (int i2 = 0; ck.K.length > i2; i2++) {
                    if (ck.K[i2][k1].length > playerDef.k[k1]) {
                        eg.a(lp.p[i2][k1], (byte) -51, ck.K[i2][k1][playerDef.k[k1]]);
                    }
                }
            }
        }
        int mask = 2048;
        boolean bool1 = false;
        if (u != 128 || lb != 128 || r != 128) {
            bool1 = true;
            mask |= 0x7;
        }
        da da = class_r.a(eg, mask, 0, q + 64, V + 768);
        if (!da.b()) {
            return null;
        }
        if (bool1) {
            da.R(u, lb, r);
        }
        f f1 = null;
        if (this.o == -1) {
            if ((~this.n) != 0) {
                f1 = this.loader.a(0, false, class_r, j1, playerDef, true, this.K, class_r1, j, la, amount, 110);
                if (f1 == null) {
                    return null;
                }
            }
        } else {
            f1 = this.loader.a(0, true, class_r, 1, playerDef, true, this.certID, class_r1, 0, la, 10, 126);
            if (f1 == null) {
                return null;
            }
        }
        int k1;
        if (!bool) {
            if (j1 != 2) {
                k1 = this.pb << 2;
            } else {
                k1 = (int) (1.04 * (double) this.pb) << 2;
            }
        } else {
            k1 = (int) ((double) this.pb * 1.5) << 2;
        }
        class_r.la(16, 16, 512, 512);
        Class_q class_q = class_r.C();
        class_q.Y();
        class_r.a(class_q);
        class_r.ra(1.0F);
        class_r.VA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        Class_q class_q1 = class_r.p();
        class_q1.J(-this.nb << 3);
        class_q1.ZA(this.Bb << 3);
        class_q1.U(this.S << 2, ((GameInPacket.ints1[this.z << 3] * k1 >> 14) + ((this.Ab << 2) - da.J() / 2)),
                (this.Ab << 2) + (GameInPacket.ints2[this.z << 3] * k1 >> 14));
        class_q1.w(this.z << 3);
        int i2 = class_r.BA();
        int j2 = class_r.U();
        class_r.GA(50, 2147483647);
        class_r.ya();
        class_r.JA();
        class_r.J(0, 0, 36, 32, 0, 0);
        da.a(class_q1, null, 1);
        class_r.GA(i2, j2);
        int[] buf = class_r.h(0, 0, 36, 32);
        if (j1 >= 1) {
            buf = a(-16777214, buf, (byte) -81);
            if (j1 >= 2) {
                buf = a(-1, buf, (byte) -104);
            }
        }
        if (j != 0) {
            a(j, (byte) 116, buf);
        }
        class_r.a(buf, 0, 36, 36, 32).a(0, 0);
        if (this.o != -1) {
            f1.a(0, 0);
        } else if (this.n != -1) {
            f1.a(0, 0);
        }
        if (i1 == 1 || (i1 == 2 && (this.stackable == 1 || amount != 1) && (~amount) != 0)) {
            la.a(-256, true, 0, getMoneyColorForAmount((byte) 109, amount), -16777215, 9);
        }
        buf = class_r.h(0, 0, 36, 32);
        for (int index = 0; buf.length > index; index++) {
            if ((buf[index] & 0xffffff) == 0) {
                buf[index] = 0;
            } else {
                buf[index] = hba.bitwiseArg1ORArg2(buf[index], -16777216);
            }
        }
        return buf;
    }

    public final eg a(byte b, boolean bool) {
        f++;
        int i = m;
        int j = H;
        if (bool) {
            j = ib;
            i = I;
        }
        if (i == -1) {
            return null;
        }
        eg eg = efa.a(i, this.loader.f, 0, false);
        if (eg.bb < 13) {
            eg.a((byte) -107, 2);
        }
        if (j != -1) {
            eg eg1 = efa.a(j, this.loader.f, 0, false);
            if (eg1.bb < 13) {
                eg1.a((byte) -107, 2);
            }
            eg[] egs = {eg, eg1};
            eg = new eg(egs, 2);
        }
        if (tb != null) {
            for (int index = 0; index < tb.length; index++) {
                eg.a(tb[index], (byte) 70, ob[index]);
            }
        }
        if (b != -84) {
            this.n = 21;
        }
        if (gb != null) {
            for (int index = 0; index < gb.length; index++) {
                eg.a(gb[index], -84, cb[index]);
            }
        }
        return eg;
    }

    public static void b(int id, int j) {
        ab++;
        qba qba = ofa.a(12, id, (byte) -93);
        if (j == -10095) {
            qba.i(0);
        }
    }

    public final void a(int i) {
        P++;
    }

    public final boolean b(byte b, boolean bool) {
        R++;
        int i = this.B;
        if (b <= 83) {
            return true;
        }
        int j = U;
        int k = rb;
        if (bool) {
            j = h;
            i = this.J;
            k = Db;
        }
        if (i == -1) {
            return true;
        }
        boolean bool1 = true;
        if (!this.loader.f.a(0, (byte) 96, i)) {
            bool1 = false;
        }
        if (j != -1 && !this.loader.f.a(0, (byte) 119, j)) {
            bool1 = false;
        }
        if (k != -1 && !this.loader.f.a(0, (byte) 125, k)) {
            bool1 = false;
        }
        return bool1;
    }

    public final da a(int i, Class_r class_r, int mask_, dr dr, int j, PlayerDef playerDef, int k, int i1, int j1) {
        w++;
        if (this.Fb != null && k > 1) {
            int k1 = -1;
            for (int index = 0; index < 10; index++) {
                if (k >= this.X[index] && this.X[index] != 0) {
                    k1 = this.Fb[index];
                }
            }
            if ((~k1) != 0) {
                return this.loader.d(12388, k1).a(i, class_r, mask_, dr, j, playerDef, 1, i1, 16777215);
            }
        }
        int mask = mask_;
        if (dr != null) {
            mask |= dr.a(1024, i1, true, j);
        }
        da da;
        synchronized (this.loader.t) {
            da = (da) this.loader.t.get((long) ((class_r.b << 29) | this.G), (byte) 100);
        }
        if (da == null || class_r.b(da.PA(), mask) != 0) {
            if (da != null) {
                mask = class_r.a(mask, da.PA());
            }
            int mask_1 = mask;
            if (gb != null) {
                mask_1 |= 0x8000;
            }
            if (tb != null || playerDef != null) {
                mask_1 |= 0x4000;
            }
            if (u != 128) {
                mask_1 |= 0x1;
            }
            if (u != 128) {
                mask_1 |= 0x2;
            }
            if (u != 128) {
                mask_1 |= 0x4;
            }
            eg eg = efa.a(C, this.loader.f, 0, false);
            if (eg == null) {
                return null;
            }
            if (eg.bb < 13) {
                eg.a((byte) -107, 2);
            }
            da = class_r.a(eg, mask_1, this.loader.z, q + 64, 850 + V);
            if (u != 128 || lb != 128 || r != 128) {
                da.R(u, lb, r);
            }
            if (tb != null) {
                for (int index = 0; tb.length > index; index++) {
                    if (Cb != null && index < Cb.length) {
                        da.d(tb[index], ua.d[Cb[index] & 0xff]);
                    } else {
                        da.d(tb[index], ob[index]);
                    }
                }
            }
            if (gb != null) {
                for (int index = 0; gb.length > index; index++) {
                    da.DA(gb[index], cb[index]);
                }
            }
            if (playerDef != null) {
                for (int k1 = 0; k1 < 5; k1++) {
                    for (int i2 = 0; i2 < ck.K.length; i2++) {
                        if (playerDef.k[k1] < ck.K[i2][k1].length) {
                            da.d(lp.p[i2][k1], (ck.K[i2][k1][playerDef.k[k1]]));
                        }
                    }
                }
            }
            da.SA(mask);
            synchronized (this.loader.t) {
                this.loader.t.put((long) (class_r.b << 29 | this.G), da, j1 ^ 0xfffffe);
            }
        }
        if (dr != null) {
            da = dr.a(j, mask, (byte) 122, i, i1, da);
        }
        da.SA(mask_);
        if (j1 != 16777215) {
            q = -76;
        }
        return da;
    }

    public final void a(ItemDef itemDef, ItemDef itemDef1, int i) {
        C = itemDef.C;
        cb = itemDef.cb;
        this.isMembersItem = itemDef1.isMembersItem;
        this.S = itemDef.S;
        this.Bb = itemDef.Bb;
        this.z = itemDef.z;
        this.nb = itemDef.nb;
        this.stackable = 1;
        b++;
        gb = itemDef.gb;
        this.itemName = itemDef1.itemName;
        tb = itemDef.tb;
        this.value = itemDef1.value;
        this.Ab = itemDef.Ab;
        Cb = itemDef.Cb;
        this.pb = itemDef.pb;
        ob = itemDef.ob;
    }

    public static int getToolkit(int performance, byte b, int j) {
        v++;
        if ((~ao.h) == 0)
            return 1;
        if (on.performance != performance) {
            Class_pf.a(performance, (byte) -126, GameText.profiling.getString(cba.languageID));
            if (on.performance != performance) {
                return -1;
            }
        }
        try {
            Dimension dimension = ru.canvas.getSize();
            Class_rf.a(true, lg.r, true, Class_nd.o, pm.v, GameText.profiling.getString(cba.languageID));
            eg eg = efa.a(ao.h, av.pl1, 0, false);
            long l = us.getCurrentTime(125);
            if (b > -97) {
                g = 106;
            }
            lg.r.JA();
            tg.G.NA(0, dba.k, 0);
            lg.r.a(tg.G);
            lg.r.la(dimension.width / 2, dimension.height / 2, 512, 512);
            lg.r.ra(1.0F);
            lg.r.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            da da = lg.r.a(eg, 2048, 64, 64, 768);
            int k = 0;
            while_228_:
            for (int count = 0; count < 500; count++) {
                lg.r.ja(0);
                lg.r.ya();
                for (int i1 = 15; i1 >= 0; i1--) {
                    for (int j1 = 0; i1 >= j1; j1++) {
                        br.n.NA((int) ((float) bea.o * ((float) j1 - (float) i1 / 2.0F)), 0, bea.o * (i1 + 1));
                        da.a(br.n, null, 0);
                        k++;
                        if ((long) j <= us.getCurrentTime(109) - l) {
                            break while_228_;
                        }
                    }
                }
            }
            lg.r.k();
            long l1 = (long) (k * 1000) / (us.getCurrentTime(113) - l);
            lg.r.ja(0);
            lg.r.ya();
            return (int) l1;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return -1;
        }
    }

    public ItemDef() {
        this.itemName = "null";
        m = -1;
        this.n = -1;
        this.isMembersItem = false;
        x = 0;
        u = 128;
        N = 0;
        this.K = -1;
        this.J = -1;
        this.z = 0;
        this.B = -1;
        V = 0;
        E = 0;
        H = -1;
        y = 0;
        this.Y = false;
        this.db = -1;
        e = 0;
        lb = 128;
        q = 0;
        this.L = -1;
        this.pb = 2000;
        I = -1;
        this.nb = 0;
        this.stackable = 0;
        U = -1;
        r = 128;
        this.kb = -1;
        this.wb = 0;
        this.vb = -1;
        this.qb = 0;
        this.i = -1;
        this.value = 1;
        this.ub = -1;
        this.fb = -1;
        this.S = 0;
        this.certID = -1;
        rb = -1;
        ib = -1;
        this.Ab = 0;
        this.Eb = -1;
        this.Bb = 0;
        Db = -1;
        hb = 0;
        this.Z = -1;
    }
}
