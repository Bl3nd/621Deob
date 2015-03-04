/* ah - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.Point;

public class ah {

    private int a = 32;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int setPN;
    private pn pn;
    static int getComponent;
    int[] k;
    static int l;
    private boolean m = false;
    static int n;
    static int o;
    static Signlink signlink;
    private long currentTime = us.getCurrentTime(93);
    private int r = 0;
    static int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private long time = 0L;
    private long y;
    private int z;
    int A;
    int B;
    static int C;
    private pn[] pns;
    private pn[] pns1;

    private void a(boolean bool, int i) {
        if (!bool) {
            g++;
            z -= i;
            if (z < 0) {
                z = 0;
            }
            if (this.pn != null) {
                this.pn.a(i);
            }
        }
    }

    private void a(int i, pn pn) {
        C++;
        int j = i >> 5;
        pn pn1 = pns[j];
        if (pn1 != null) {
            pn1.m = pn;
        } else {
            pns1[j] = pn;
        }
        pns[j] = pn;
        pn.k = i;
    }

    public void a() {
        s++;
    }

    public final synchronized void a(int i) {
        c++;
        if (!m) {
            long time = us.getCurrentTime(103);
            try {
                if (currentTime + 500000L < time) {
                    currentTime = time - 500000L;
                }
                for (/**/; time > currentTime + 5000L; currentTime += (long) (256000 / gba.samplesPerSec)) {
                    a(false, 256);
                }
                if (i != -26789) {
                    b(false, 43);
                }
            } catch (Exception exception) {
                currentTime = time;
            }
            if (this.k != null) {
                try {
                    if (this.time != 0L) {
                        if (time < this.time) {
                            return;
                        }
                        d(this.B);
                        this.time = 0L;
                        w = true;
                    }
                    int j = b();
                    if (r < v - j) {
                        r = v - j;
                    }
                    int k = u + this.A;
                    if (k + 256 > 16384) {
                        k = 16128;
                    }
                    if (k + 256 > this.B) {
                        this.B += 1024;
                        if (this.B > 16384) {
                            this.B = 16384;
                        }
                        a();
                        d(this.B);
                        j = 0;
                        w = true;
                        if (k + 256 > this.B) {
                            k = this.B - 256;
                            u = k - this.A;
                        }
                    }
                    while (j < k) {
                        a(this.k, 256);
                        j += 256;
                        d();
                    }
                    if (y < time) {
                        if (!w) {
                            if (r == 0 && t == 0) {
                                a();
                                this.time = time + 2000L;
                                return;
                            }
                            u = Math.min(t, r);
                            t = r;
                        } else {
                            w = false;
                        }
                        r = 0;
                        y = time + 2000L;
                    }
                    v = j;
                } catch (Exception exception) {
                    a();
                    this.time = time + 2000L;
                }
            }
        }
    }

    public void getComponent(Component component) throws Exception {
        getComponent++;
    }

    public final synchronized void setPn(pn pn, byte b) {
        setPN++;
        this.pn = pn;
    }

    public final synchronized void b(int i) {
        if (av.m != null) {
            boolean bool = true;
            for (int index = 0; index < 2; index++) {
                if (this == av.m.g[index]) {
                    av.m.g[index] = null;
                }
                if (av.m.g[index] != null) {
                    bool = false;
                }
            }
            if (bool) {
                av.m.e = true;
                while (av.m.i) {
                    Connection.a(-28448, 50L);
                }
                av.m = null;
            }
        }
        b++;
        a();
        this.k = null;
        m = true;
    }

    private void a(int[] buf, int i) {
        int j = i;
        if (wq.p) {
            j <<= 1;
        }
        co.a(buf, 0, j);
        z -= i;
        if (this.pn != null && z <= 0) {
            z += gba.samplesPerSec >> 4;
            Class_mc.a((byte) 121, this.pn);
            a(this.pn.c(), this.pn);
            int k = 0;
            int i1 = 255;
            int j1 = 7;
            while_12_:
            while (i1 != 0) {
                int k1;
                int i2;
                if (j1 < 0) {
                    k1 = j1 & 0x3;
                    i2 = -(j1 >> 2);
                } else {
                    k1 = j1;
                    i2 = 0;
                }
                for (int j2 = i1 >>> k1 & 0x11111111; j2 != 0;
                     j2 >>>= 4) {
                    if ((j2 & 0x1) != 0) {
                        i1 &= ~1 << k1;
                        pn pn1 = null;
                        pn pn2 = pns1[k1];
                        while (pn2 != null) {
                            bo bo = pn2.n;
                            if (bo != null && bo.k > i2) {
                                i1 |= 1 << k1;
                                pn1 = pn2;
                                pn2 = pn2.m;
                            } else {
                                pn2.l = true;
                                int k2 = pn2.d();
                                k += k2;
                                if (bo != null) {
                                    bo.k += k2;
                                }
                                if (k >= a) {
                                    break while_12_;
                                }
                                pn pn3 = pn2.a();
                                if (pn3 != null) {
                                    int i3 = pn2.k;
                                    for (/**/; pn3 != null; pn3 = pn2.b()) {
                                        a(i3 * pn3.c() >> 8, pn3);
                                    }
                                }
                                pn pn4 = pn2.m;
                                pn2.m = null;
                                if (pn1 == null) {
                                    pns1[k1] = pn4;
                                } else {
                                    pn1.m = pn4;
                                }
                                if (pn4 == null) {
                                    pns[k1] = pn1;
                                }
                                pn2 = pn4;
                            }
                        }
                    }
                    k1 += 4;
                    i2++;
                }
                j1--;
            }
            for (int index = 0; index < 8; index++) {
                pn pn1 = pns1[index];
                pns1[index] = pns[index] = null;
                pn pn2;
                for (/**/; pn1 != null; pn1 = pn2) {
                    pn2 = pn1.m;
                    pn1.m = null;
                }
            }
        }
        if (z < 0) {
            z = 0;
        }
        if (this.pn != null) {
            this.pn.b(buf, 0, i);
        }
        currentTime = us.getCurrentTime(117);
    }

    public final synchronized void c(int i) {
        f++;
        w = true;
        if (i == 2000) {
            try {
                c();
            } catch (Exception exception) {
                a();
                time = us.getCurrentTime(i ^ 0x78a) + 2000L;
            }
        }
    }

    public static void nullLoader(byte i) {
        if (i == -91) {
            signlink = null;
        }
    }

    public static void b(boolean bool, int i) {
        if (!bool) {
            nullLoader((byte) 15);
        }
        e++;
        if (!cs.g.J) {
            i = -1;
        }
        if (i != jk.m) {
            if ((~i) != 0) {
                Class_ag class_ag = fu.e.a(i, (byte) 93);
                aga aga = class_ag.b(-1);
                if (aga != null) {
                    nda.signlink.a(aga.f(), new Point(class_ag.x, class_ag.y), aga.c(), aga.d(), bool, ru.canvas);
                    jk.m = i;
                } else {
                    i = -1;
                }
            }
            if ((~i) == 0 && jk.m != -1) {
                nda.signlink.a(null, new Point(), -1, -1, true, ru.canvas);
                jk.m = -1;
            }
        }
    }

    private int b() throws Exception {
        o++;
        return this.B;
    }

    private void c() throws Exception {
        d++;
    }

    public void d(int i) throws Exception {
        l++;
    }

    private void d() throws Exception {
        n++;
    }

    public ah() {
        t = 0;
        v = 0;
        w = true;
        y = 0L;
        z = 0;
        pns1 = new pn[8];
        pns = new pn[8];
    }
}
