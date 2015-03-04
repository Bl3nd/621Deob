/* mf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ItemDefLoader {

    static int a;
    static GameInPacket incomingPacket53 = new GameInPacket(53, 2);
    static int c;
    static int d;
    static int e;
    pl f;
    int g;
    static int h;
    int i;
    private tb j = new tb(64);
    static int k;
    static int l;
    static int m;
    static int n;
    static int o;
    static int p;
    private boolean q;
    static int r;
    private pl s;
    tb t = new tb(50);
    static int u;
    aaa v = new aaa(250);
    private pi pi = new pi();
    private dp x;
    private String[] actions;
    int z;
    private String[] groundActions;

    public final f a(int i, boolean bool, Class_r class_r, int j, PlayerDef playerDef, boolean bool1, int k, Class_r class_r1, int i1,
              la la, int j1, int k1) {
        h++;
        f f = a(i1, k, playerDef, class_r1, j1, j, 127, i);
        if (f != null) {
            return f;
        }
        ItemDef itemDef = d(12388, k);
        if (j1 > 1 && itemDef.Fb != null) {
            int i2 = -1;
            for (int index = 0; index < 10; index++) {
                if (itemDef.X[index] <= j1 && itemDef.X[index] != 0) {
                    i2 = itemDef.Fb[index];
                }
            }
            if (i2 != -1) {
                itemDef = d(12388, i2);
            }
        }
        int[] buf = itemDef.a(la, j1, bool, playerDef, class_r, i1, 97, class_r1, i, j);
        if (buf == null) {
            return null;
        }
        f f1;
        if (!bool1) {
            f1 = class_r1.a(buf, 0, 36, 36, 32);
        } else {
            f1 = class_r.a(buf, 0, 36, 36, 32);
        }
        if (k1 < 103) {
            return null;
        }
        if (!bool1) {
            pi pi = new pi();
            pi.e = class_r1.b;
            pi.borderThickness = j;
            pi.a = playerDef != null;
            pi.shadowColor = i1;
            pi.itemId = k;
            pi.itemStackSize = j1;
            pi.b = i;
            this.v.a(f1, pi);
        }
        return f1;
    }

    public static tba a(int i) {
        if (i != 18375) {
            incomingPacket53 = null;
        }
        c++;
        if (mr.d == 0) {
            return new tba();
        }
        return rd.J[--mr.d];
    }

    public static void a(int i, int j) {
        e++;
        qba qba = ofa.a(5, i, (byte) 118);
        qba.i(j);
    }

    public final void b(int i) {
        synchronized (this.v) {
            this.v.d();
        }
        r++;
    }

    public final void b(int i, int j) {
        a++;
        synchronized (this.j) {
            this.j.a(true, i);
        }
        synchronized (this.t) {
            this.t.a(true, i);
        }
        synchronized (this.v) {
            if (j != 50) {
        /* empty */
            } else {
                this.v.a(i, j - 50);
            }
        }
    }

    public final f a(int shadowColor, int itemId, PlayerDef playerDef, Class_r class_r, int itemStackSize, int borderThickness, int i, int j) {
        pi.shadowColor = shadowColor;
        pi.itemId = itemId;
        pi.e = class_r.b;
        n++;
        pi.a = playerDef != null;
        if (i < 122) {
            b(-22);
        }
        pi.itemStackSize = itemStackSize;
        pi.borderThickness = borderThickness;
        pi.b = j;
        return (f) this.v.a(pi);
    }

    public final void c(int i) {
        synchronized (j) {
            j.a(18385);
            if (i <= 107) {
                a(-18, 29, null, null, 80, -126, 89, 26);
            }
        }
        u++;
        synchronized (this.t) {
            this.t.a(18385);
        }
        synchronized (this.v) {
            this.v.d();
        }
    }

    public final void d(int i) {
        p++;
        synchronized (this.t) {
            this.t.a(18385);
            if (i != 0) {
                pi = null;
            }
        }
    }

    public final void e(int i) {
        o++;
        synchronized (j) {
            j.c((byte) 51);
        }
        synchronized (this.t) {
            this.t.c((byte) -122);
        }
        synchronized (this.v) {
            if (i != 0) {
		/* empty */
            } else {
                this.v.a((byte) 64);
            }
        }
    }

    public final void a(boolean bool, int i) {
        k++;
        if (bool != q) {
            q = bool;
            c(127);
            if (i != 5) {
                incomingPacket53 = null;
            }
        }
    }

    public static void nullLoader() {
        incomingPacket53 = null;
    }

    public final void c(int dummy, int i) {
        l++;
        if (dummy != -12209) {
            j = null;
        }
        this.z = i;
        synchronized (this.t) {
            this.t.a(18385);
        }
    }

    public final ItemDef d(int i, int id) {
        m++;
        if (i != 12388) {
            return null;
        }
        ItemDef itemDef;
        synchronized (j) {
            itemDef = (ItemDef) j.get((long) id, (byte) 100);
        }
        if (itemDef != null) {
            return itemDef;
        }
        byte[] buf;
        synchronized (s) {
            buf = s.b(oh.b(id, (byte) 75), i ^ ~0x301d, sw.a(-21557, id));
        }
        itemDef = new ItemDef();
        itemDef.G = id;
        itemDef.loader = this;
        itemDef.groundActions = new String[]{null, null, GameText.takeText.getString(this.i), null, null};
        itemDef.actions = new String[]{null, null, null, null, GameText.dropText.getString(this.i)};
        if (buf != null) {
            itemDef.a(30035, new BytesParser(buf));
        }
        itemDef.a(114);
        if (itemDef.o != -1) {
            itemDef.a(d(12388, itemDef.o), d(12388, itemDef.certID), i ^ ~0x3058);
        }
        if ((~itemDef.n) != 0) {
            itemDef.a(-22824, d(12388, itemDef.K), d(i, itemDef.n));
        }
        if (!q && itemDef.isMembersItem) {
            itemDef.itemName = GameText.membersObjectText.getString(this.i);
            itemDef.groundActions = groundActions;
            itemDef.actions = actions;
            itemDef.wb = 0;
            itemDef.eb = null;
            itemDef.Y = false;
            if (itemDef.d != null) {
                boolean bool = false;
                for (Node node = itemDef.d.b((byte) 124); node != null; node = itemDef.d.b(12561)) {
                    vu vu = x.a((byte) 6, (int) node.nodeID);
                    if (!vu.d) {
                        bool = true;
                    } else {
                        node.unlink(-106);
                    }
                }
                if (!bool) {
                    itemDef.d = null;
                }
            }
        }
        synchronized (j) {
            j.put((long) id, itemDef, 1);
        }
        return itemDef;
    }

    public ItemDefLoader(Class_rf class_rf, int i, boolean bool, dp dp, pl pl, pl pl1) {
        s = pl;
        this.f = pl1;
        this.i = i;
        q = bool;
        x = dp;
        if (s != null) {
            int j = s.a((byte) -107) - 1;
            this.g = s.a(j, true) + j * 256;
        } else {
            this.g = 0;
        }
        groundActions = new String[]{null, null, GameText.takeText.getString(this.i), null, null};
        actions = new String[]{null, null, null, null, GameText.dropText.getString(this.i)};
    }
}
