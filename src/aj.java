/* aj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class aj {

    static fca fca = new fca();
    static int b;
    static int c;
    static int d = 0;

    public static void a(int i, int j) {
        b++;
        int currentTicks = pm.currentTimedTicks - Class_b.f;
        if (currentTicks >= 100) {
            ja.Cc = dj.o = -1;
            ll.x = 1;
        } else {
            int k = (int) pm.F;
            if (dk.y >> 8 > k) {
                k = dk.y >> 8;
            }
            if (Class_ug.W[4] && k < me.m[4] + 128) {
                k = me.m[4] + 128;
            }
            int i1 = (int) qw.n + sca.j & j;
            faa.a((k >> 3) * 3 + 600 << 2, Class_k.N, k, vaa.L, i1, 117, i, Class_u.b(up.thisPlayer.locX, vo.clientHeight, j ^ ~0x710a,
                            up.thisPlayer.locY) - 200);
            float ticks = 1.0F - ((float) ((-currentTicks + 100) * ((100 - currentTicks) * (-currentTicks + 100))) / 1000000.0F);
            ada.N = (int) ((float) rk.s + ticks * (float) (ada.N - rk.s));
            dg.gb = (int) ((float) (dg.gb - js.n) * ticks + (float) js.n);
            us.e = (int) ((float) (us.e - dr.v) * ticks + (float) dr.v);
            mba.e = (int) ((float) lca.w + (float) (mba.e - lca.w) * ticks);
            int j1 = gn.G - tea.l;
            if (j1 > 8192) {
                j1 -= 16384;
            } else if (j1 < -8192) {
                j1 += 16384;
            }
            gn.G = (int) ((float) tea.l + (float) j1 * ticks);
            gn.G &= 0x3fff;
        }
    }

    public static void nullLoader(int i) {
        if (i != -27669) {
            a(75, -89);
        }
        fca = null;
    }
}
