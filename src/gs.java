/* gs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class gs extends rg {
    static int s;
    static int t;
    private int u;
    static fca v = new fca();
    static int w;
    static int x;
    static float y;

    public static void d(int i) {
        if (i != 3317)
            e(61);
        v = null;
    }

    gs(qj var_qj, int i, int i_0_, byte[] is, int i_1_) {
        super(var_qj, 3552, i, i_0_, false);
        u = i_0_;
        ((rg) this).o.a(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(((rg) this).i, 0, ((rg) this).k, u, 0, i_1_,
                5121, is, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.b(true, 17137);
    }

    static final boolean e(int i) {
        if (i != 0)
            e(-21);
        t++;
        if (mu.j <= 0)
            return false;
        return true;
    }

    public final void a(int i) {
        if (i != 29468)
            d(-57);
        w++;
    }

    static final boolean b(int i, int j) {
        if (j != 0)
            y = -0.52573466F;
        x++;
        if (i != 3 && i != 4 && i != 5 && i != 6)
            return false;
        return true;
    }

    final void a(int i, boolean bool) {
        ((rg) this).o.a(this, -2);
        if (i < -35) {
            s++;
            OpenGL.glTexParameteri(((rg) this).i, 10242, bool ? 10497 : 33071);
        }
    }
}
