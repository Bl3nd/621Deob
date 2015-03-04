/* af - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class af {

    static int a;
    static int b;
    private qj qj;
    long d;
    static int e;

    protected final void finalize() throws Throwable {
        qj.a(this.d, 46);
        b++;
        super.finalize();
    }

    public static void a(int i, int dummy, byte[] buf, byte b, int j, int off) {
        a++;
        if (j > i) {
            off += i;
            dummy = j - i >> 2;
            if (b > 80) {
                while (--dummy >= 0) {
                    buf[off++] = (byte) 1;
                    buf[off++] = (byte) 1;
                    buf[off++] = (byte) 1;
                    buf[off++] = (byte) 1;
                }
                dummy = j - i & 0x3;
                while (--dummy >= 0) {
                    buf[off++] = (byte) 1;
                }
            }
        }
    }

    public static void a(int[] buf, int[] buf1, byte b, NPC npc, int[] buf2) {
        for (int index = 0; buf.length > index; index++) {
            int i = buf[index];
            int j = buf2[index];
            int k = buf1[index];
            for (int i1 = 0; j != 0 && npc.ans.length > i1; j >>>= 1) {
                if ((j & 0x1) != 0) {
                    if (i == -1) {
                        ((Entity) npc).ans[i1] = null;
                    } else {
                        dr dr = Class_ef.J.c(b + 158, i);
                        int j1 = dr.g;
                        an an = npc.ans[i1];
                        if (an != null) {
                            if (an.c == i) {
                                if (j1 != 0) {
                                    if (j1 == 1) {
                                        an.g = 1;
                                        an.b = 0;
                                        an.d = 0;
                                        an.e = 0;
                                        an.a = k;
                                        qga.a(npc.height, dr, npc.locX, npc.locY, b ^ ~0x16, 0, false);
                                    } else if (j1 == 2) {
                                        an.e = 0;
                                    }
                                } else {
                                    an = ((Entity) npc).ans[i1] = null;
                                }
                            } else if (dr.t >= (Class_ef.J.c(64, an.c).t)) {
                                an = ((Entity) npc).ans[i1] = null;
                            }
                        }
                        if (an == null) {
                            an = ((Entity) npc).ans[i1] = new an();
                            an.c = i;
                            an.b = 0;
                            an.e = 0;
                            an.d = 0;
                            an.a = k;
                            an.g = 1;
                            qga.a(npc.height, dr, npc.locX, npc.locY, 60, 0, false);
                        }
                    }
                }
                i1++;
            }
        }
        e++;
    }

    public af(qj qj1, long l, int i) {
        this.d = l;
        qj = qj1;
    }
}
